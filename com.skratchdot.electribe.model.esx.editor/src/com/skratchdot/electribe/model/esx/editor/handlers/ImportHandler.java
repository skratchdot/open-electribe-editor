/**
 * Copyright (c) 2009-2010 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    JEFF |:at:| SKRATCHDOT |:dot:| COM
 *
 * $Id$
 */
package com.skratchdot.electribe.model.esx.editor.handlers;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.ReplaceCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import com.skratchdot.electribe.audioplayer.util.AudioUtil;
import com.skratchdot.electribe.model.esx.EsxFactory;
import com.skratchdot.electribe.model.esx.EsxFile;
import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.Sample;
import com.skratchdot.electribe.model.esx.editor.util.EsxEditorUtil;
import com.skratchdot.electribe.model.esx.presentation.EsxEditor;
import com.skratchdot.electribe.model.esx.util.EsxUtil;

public class ImportHandler extends AbstractHandler {
	public static final String IMPORT_AUDIO_FILES_ID = "com.skratchdot.electribe.model.esx.editor.commands.importAudioFiles";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// IMPORT_AUDIO_FILES_ID
		if(event.getCommand().getId().equals(IMPORT_AUDIO_FILES_ID)) {
			return importAudioFiles(event);
		}

		return null;
	}

	/**
	 * This will pop open a "Load" dialog, allowing a user to select 
	 * multiple files which will be loaded into the esx workspace if there
	 * are available/unused sample slots.
	 */
	public Object importAudioFiles(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

		List<String> fileExtentionFilters = EsxEditor.AUDIO_FILE_EXTENSION_FILTERS;
		String[] filters = fileExtentionFilters.toArray(new String[fileExtentionFilters.size()]);
		String[] files = EsxEditorUtil.openFilePathDialog(window.getShell(), SWT.OPEN | SWT.MULTI, filters);
		importAudioFiles(window, files);

		return null;
	}

	/**
	 * Attempts to add audio files specified by filePaths to the esx editor
	 * workspace.  It will only load files if there are empty/unused sample
	 * slots.
	 * @param workbench
	 * @param files
	 */
	public static void importAudioFiles(IWorkbenchWindow window, String[] files) {
		IWorkbenchPage page = window.getActivePage();
		IEditorPart editor = page.getActiveEditor();
		
		// We've chosen to load a few audio files into the active editor
		if(files.length>0) {
			// If the active editor is an EsxEditor
			if(editor!=null && editor instanceof EsxEditor) {
				
				// Get our EsxFile
				EditingDomain editingDomain = ((EsxEditor) editor).getEditingDomain();
				Resource resource =
					(Resource)editingDomain.getResourceSet().getResources().get(0);
				Object rootObject = resource.getContents().get(0);
				if(rootObject instanceof EsxFile) {
					EsxFile esxFile = (EsxFile) rootObject;
					
					// Since we are using a CompoundCommand, we need to remember
					// which SampleNumbers to ignore when we call the findFirstUnusedSample()
					ArrayList<Integer> skipSampleNumbers = new ArrayList<Integer>();

					CompoundCommand cmd = new CompoundCommand();

					// Now we can loop through our selected
					// Audio Files, trying to import them
					for(int i=0; i<files.length; i++) {
						try {
							File file = new File(files[i]);

							// We can only import audio files
							if(AudioUtil.isAudioFile(file)) {
								int firstEmptySampleNumber = -1;
								Sample sample = null;

								firstEmptySampleNumber = EsxUtil.findFirstIndex(
									esxFile.getSamples(),
									AudioUtil.isStereo(file)?EsxUtil.NUM_SAMPLES_MONO:0,
									skipSampleNumbers,
									EsxPackage.Literals.SAMPLE__EMPTY,
									true,
									true
								);
								if(isValidSampleIndex(firstEmptySampleNumber)) {
									sample = EsxFactory.eINSTANCE.createSampleFromFile(file);
									sample.setSampleNumberOriginal(esxFile.getSamples().get(firstEmptySampleNumber).getSampleNumberOriginal());
								}

								// Add sample using emf command
								if(isValidSampleIndex(firstEmptySampleNumber) && sample!=null) {
									skipSampleNumbers.add(firstEmptySampleNumber);
									cmd.append(new ReplaceCommand(
										editingDomain,
										esxFile,
										EsxPackage.eINSTANCE.getEsxFile_Samples(),
										esxFile.getSamples().get(firstEmptySampleNumber),
										sample
									));
								}
							}
						} catch (Exception e) {
							e.printStackTrace();
						}
					}

					// We've finished looping through our fileList adding ReplaceCommands
					// to our CompoundCommand.  Now we can execute our CompoundCommand.
					if(cmd.canExecute()) {
						editingDomain.getCommandStack().execute(cmd);
					}
				}
			}
		}
	}
	
	private static boolean isValidSampleIndex(int index) {
		if(index>=0 && index<EsxUtil.NUM_SAMPLES) {
			return true;
		}
		return false;
	}

}

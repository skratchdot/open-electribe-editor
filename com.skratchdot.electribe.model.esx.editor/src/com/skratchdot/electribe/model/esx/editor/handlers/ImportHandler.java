/**
 * Copyright (c) 2009-2011 SKRATCHDOT.COM
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
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.WizardDialog;
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
import com.skratchdot.electribe.model.esx.editor.commands.SyncPointersCommand;
import com.skratchdot.electribe.model.esx.editor.util.EsxEditorUtil;
import com.skratchdot.electribe.model.esx.editor.wizards.pattern.ImportPatternWizard;
import com.skratchdot.electribe.model.esx.presentation.EsxEditor;
import com.skratchdot.electribe.model.esx.util.EsxUtil;

public class ImportHandler extends AbstractHandler {
	public static final String IMPORT_AUDIO_FILES_ID = "com.skratchdot.electribe.model.esx.editor.commands.importAudioFiles";
	public static final String IMPORT_PATTERNS_ID = "com.skratchdot.electribe.model.esx.editor.commands.importPatterns";

	public Object execute(ExecutionEvent event) throws ExecutionException {
		// IMPORT_AUDIO_FILES_ID
		if(event.getCommand().getId().equals(IMPORT_AUDIO_FILES_ID)) {
			return importAudioFiles(event);
		}
		// IMPORT_PATTERNS_ID
		if(event.getCommand().getId().equals(IMPORT_PATTERNS_ID)) {
			return importPatterns(event);
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
								if(EsxUtil.isValidSampleNumber(firstEmptySampleNumber)) {
									sample = EsxFactory.eINSTANCE.createSampleFromFile(file);
									sample.setSampleNumberOriginal(esxFile.getSamples().get(firstEmptySampleNumber).getSampleNumberOriginal());
									
									// Add sample using emf command
									if(sample!=null) {
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

	/**
	 * This will open a wizard allowing the user to select an .esx
	 * file, then choose which patterns to import.  Samples can be
	 * optionally imported.
	 * 
	 * TODO: allow .psg files to be selected as well.
	 */
	public Object importPatterns(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		IWorkbenchPage page = window.getActivePage();
		IEditorPart editor = page.getActiveEditor();

		// If the active editor is an EsxEditor
		if(editor!=null && editor instanceof EsxEditor) {
			// Get our EsxFile
			EditingDomain editingDomain = ((EsxEditor) editor).getEditingDomain();
			Resource resource =
				(Resource)editingDomain.getResourceSet().getResources().get(0);
			Object rootObject = resource.getContents().get(0);
			if(rootObject instanceof EsxFile) {
				EsxFile esxFile = (EsxFile) rootObject;

				// Attempt to sync pointers if moves have occurred.
				SyncPointersCommand cmd = new SyncPointersCommand(resource, (AdapterFactoryEditingDomain) editingDomain);
				if(cmd.canExecute()) {
					editingDomain.getCommandStack().execute(cmd);
				}
				
				ImportPatternWizard wizard = new ImportPatternWizard();
				wizard.init(window.getWorkbench(), esxFile);
				WizardDialog dialog = new WizardDialog(window.getShell(), wizard);				
				dialog.setPageSize(650, 400);
				dialog.create();
				dialog.open();
			}
		}
		else {
			MessageDialog.openError(
				window.getShell(),
				"No Destination File",
				"Before importing patterns, please open an existing .esx file."
			);
		}

		return null;
	}

}

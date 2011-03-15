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

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialogWithToggle;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import com.skratchdot.electribe.model.esx.EsxFile;
import com.skratchdot.electribe.model.esx.Sample;
import com.skratchdot.electribe.model.esx.editor.util.EsxEditorUtil;
import com.skratchdot.electribe.model.esx.preferences.EsxPreferenceNames;
import com.skratchdot.electribe.model.esx.preferences.EsxPreferenceStore;
import com.skratchdot.electribe.model.esx.presentation.EsxEditor;

public class ExportHandler extends AbstractHandler {
	public static final String EXPORT_ALL_AUDIO_FILES_ID = "com.skratchdot.electribe.model.esx.editor.commands.exportAllAudioFiles";
	public static final String EXPORT_ALL_SELECTED_FILES_ID = "com.skratchdot.electribe.model.esx.editor.commands.exportSelectedAudioFiles";

	public Object execute(ExecutionEvent event) throws ExecutionException {
		// EXPORT_ALL_AUDIO_FILES_ID
		if(event.getCommand().getId().equals(EXPORT_ALL_AUDIO_FILES_ID)) {
			return exportAllAudioFiles(event);
		}
		// EXPORT_ALL_SELECTED_FILES_ID
		else if(event.getCommand().getId().equals(EXPORT_ALL_SELECTED_FILES_ID)) {
			return exportSelectedAudioFiles(event);
		}

		return null;
	}

	/**
	 * This will pop open a "Choose directory" dialog, allowing a user to
	 * select the folder in which all the .wav files will be exported to.
	 * @param event
	 * @return
	 * @throws ExecutionException
	 */
	public Object exportAllAudioFiles(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

		DirectoryDialog directoryDialog = new DirectoryDialog(window.getShell());
		directoryDialog.setMessage(EsxEditorUtil.getString("_UI_Export_Samples_Select_Dir"));

		String directory = directoryDialog.open();
		if(directory!=null) {
			exportAudioFilesToDirectory(window.getWorkbench(), directory);
		}

		return null;
	}
	
	public Object exportSelectedAudioFiles(ExecutionEvent event) throws ExecutionException {
		//IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		return null;
	}

	/**
	 * Attempts to export .wav files to the given directory. It will export
	 * all samples that are being used in the workspace.
	 * @param workbench
	 * @param directory A valid, non-null path to the directory in which .wav files will be exported to
	 */
	public static void exportAudioFilesToDirectory(IWorkbench workbench, String directory) {
		IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();
		IEditorPart editor = page.getActiveEditor();
		
		// We've chosen to load a few audio files into the active editor
		if(directory!=null) {
			// If the active editor is an EsxEditor
			if(editor!=null && editor instanceof EsxEditor) {
				
				// Get our EsxFile
				EditingDomain editingDomain = ((EsxEditor) editor).getEditingDomain();
				Resource resource =
					(Resource)editingDomain.getResourceSet().getResources().get(0);
				Object rootObject = resource.getContents().get(0);
				if(rootObject instanceof EsxFile) {
					EsxFile esxFile = (EsxFile) rootObject;

					// These will be used if we bring up the overwrite files prompt
					boolean rememberThisDecision = false;
					boolean overwriteAllFiles = false;
					boolean writeCurrentFile = false;

					for(int i=0; i<esxFile.getSamples().size(); i++) {
						Sample currentSample = esxFile.getSamples().get(i);
						if(currentSample.isEmpty()==false) {

							// Setup Filename
							String filename = ""+
								EsxPreferenceStore.getString(EsxPreferenceNames.EXPORT_FILENAME_FORMAT)+
								".wav";
							filename = filename.replace("%s%", currentSample.getName().trim());
							filename = filename.replace("%n%", currentSample.getSampleNumberCurrent().getLiteral());
							filename = filename.replaceAll("[^a-zA-Z0-9 _.-]", "_");

							File file = new File(directory+File.separator+filename);
							writeCurrentFile = true;

							// Check if we need to overwrite the file
							if(file.exists()) {
								if(rememberThisDecision) {
									writeCurrentFile = overwriteAllFiles;
								}
								else {
									MessageDialogWithToggle dialog =
										MessageDialogWithToggle.openYesNoQuestion(
											window.getShell(),
											EsxEditorUtil.getString("_UI_Export_Samples_Overwrite_Title"),
											EsxEditorUtil.getString("_UI_Export_Samples_Overwrite_Message", file.getAbsoluteFile()),
											EsxEditorUtil.getString("_UI_Export_Samples_Overwrite_Toggle"),
											rememberThisDecision,
											null,
											null
										);
									writeCurrentFile = dialog.getReturnCode()==IDialogConstants.YES_ID;
									if(dialog.getToggleState()==true) {
										rememberThisDecision = true;
										overwriteAllFiles = writeCurrentFile;
									}
								}
							}
							
							if(writeCurrentFile==true) {
								try {
									currentSample.export(file);
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						}
					}
				}
			}
		}
	}

}

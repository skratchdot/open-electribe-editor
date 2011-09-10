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
package com.skratchdot.electribe.model.esx.presentation;

import java.io.File;
import java.util.ArrayList;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTargetAdapter;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.FileTransfer;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

import com.skratchdot.electribe.audioplayer.util.AudioUtil;
import com.skratchdot.electribe.model.esx.editor.handlers.ImportHandler;
import com.skratchdot.electribe.model.esx.editor.util.EsxEditorUtil;

/**
 * Customized {@link org.eclipse.swt.dnd.DropTargetAdapter} for the RCP application.
 * Will handle files that are dropped onto the esx editor area.
 */
public class EsxEditorDropTargetAdapter extends DropTargetAdapter {

	/** 
	 * We are currently only allow files to be dragged.
	 * @see org.eclipse.swt.dnd.DropTargetAdapter#dragEnter(org.eclipse.swt.dnd.DropTargetEvent)
	 */
	@Override
	public void dragEnter(DropTargetEvent event) {
		super.dragEnter(event);

		// Handle DROP_DEFAULT events
		if (event.detail == DND.DROP_DEFAULT) {
			event.detail = (event.operations & DND.DROP_COPY) != 0 ? DND.DROP_COPY : DND.DROP_NONE;
		}

		// Allow for dropping of Files
		for (int i = 0, n = event.dataTypes.length; i < n; i++) {
			if (FileTransfer.getInstance().isSupportedType(event.dataTypes[i])) {
				event.currentDataType = event.dataTypes[i];
			}
		}
	}

	/**
	 * We are currently only allow files to be dragged.
	 * If an .esx file is dropped, open a corresponding editor.
	 * If an audio file is dropped, try to add it to the active esx editor.
	 * @see org.eclipse.swt.dnd.DropTargetAdapter#drop(org.eclipse.swt.dnd.DropTargetEvent)
	 */
	@Override
	public void drop(DropTargetEvent event) {
		super.drop(event);

		if (FileTransfer.getInstance().isSupportedType(event.currentDataType)) {
			String[] fileNames = (String[])event.data;
			ArrayList<String> esxFiles = new ArrayList<String>();
			ArrayList<String> audioFiles = new ArrayList<String>();

			// Build out arrays
			for(int i=0; i<fileNames.length; i++) {
				File file = new File(fileNames[i]);
				if(file.isFile()) {
					// Handle Esx Files
	            	if(file.getAbsolutePath().toLowerCase().endsWith(".esx")) {
	            		esxFiles.add(fileNames[i]);
	            		//handleEsxFile(fileNames[i]);
	            	}
	            	// Handle Audio Files
	            	else if(AudioUtil.isAudioFile(file)) {
	            		audioFiles.add(fileNames[i]);
	            		//handleAudioFile(fileNames[i]);
	            	}
				}
            }

			// Handle esx files first
			for(int i=0; i<esxFiles.size(); i++) {
				handleEsxFile(esxFiles.get(i));
			}

			//  Handle audio files
			if(audioFiles.size() > 0) {
				handleAudioFiles((String[])audioFiles.toArray(new String[audioFiles.size()]));
			}
            
		}

	}

	/**
	 * The fileName passed in should be a valid .esx file.
	 * We will call {@link EsxEditorAdvisor#openEditor(org.eclipse.ui.IWorkbench, URI)}
	 * to attempt to open an editor for the fileName.
	 * @param fileName
	 */
	private void handleEsxFile(String fileName) {
		EsxEditorUtil.openEditor(
			PlatformUI.getWorkbench(),
			URI.createFileURI(fileName));
	}

	/**
	 * This will ignore any file name that does not point to a valid
	 * audio file.  If we are passed in a valid audio file, and
	 * an Esx Editor is open, then we will try to add the file to an
	 * open sample slot in the active editor.  If no slots are free,
	 * or there is no active editor, then we will ignore the file.
	 * @param fileNames
	 */
	private void handleAudioFiles(String[] fileNames) {
		IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();

		// If there's not an active editor, display a message to the user and return
		if(editor == null) {
			MessageDialog.openInformation(
				PlatformUI.getWorkbench().getDisplay().getActiveShell(),
				"Dragging Audio Files...",
				"There is not an open .esx file to import samples into.\n\n" +
				"Before dragging audio files, please open an existing .esx file, " +
				"or create a new one, then try dragging your audio files again."
			);
			return;
		}

		// Show the samples tab if we are not already on it, or not on the info tab
		if(editor instanceof EsxEditor) {
			EsxEditor esxEditor = ((EsxEditor) editor);
			if(esxEditor.getActivePage()!=EsxEditorPartSamples.PAGE_INDEX && esxEditor.getActivePage()!=EsxEditorPartInfo.PAGE_INDEX) {
				esxEditor.setActivePage(EsxEditorPartSamples.PAGE_INDEX);
			}
		}

		// Import audio files
		ImportHandler.importAudioFiles(PlatformUI.getWorkbench().getActiveWorkbenchWindow(), fileNames);
	}
	
}

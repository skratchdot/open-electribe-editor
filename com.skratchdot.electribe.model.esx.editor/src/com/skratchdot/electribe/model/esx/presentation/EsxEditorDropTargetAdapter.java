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
package com.skratchdot.electribe.model.esx.presentation;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTargetAdapter;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.FileTransfer;
import org.eclipse.ui.PlatformUI;

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
            for(int i=0; i<fileNames.length; i++) {
            	// Handle Esx Files
            	if(fileNames[i].toLowerCase().endsWith(".esx")) {
            		handleEsxFile(fileNames[i]);
            	}
            	// Handle Audio Files
            	else {
            		handleAudioFile(fileNames[i]);
            	}	
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
		EsxEditorAdvisor.openEditor(
			PlatformUI.getWorkbench(),
			URI.createFileURI(fileName));
	}

	/**
	 * This will ignore any fileName that does not point to a valid
	 * audio file.  If we are passed in a valid audio fileName, and
	 * an Esx Editor is open, then we will try to add the file to an
	 * open sample slot in the active editor.  If no slots are free,
	 * or there is no active editor, then we will ignore the file.
	 * @param fileName
	 */
	private void handleAudioFile(String fileName) {
		File file = new File(fileName);
		if(file.isFile()) {

			// If it's a valid audio file
			try {
				AudioFileFormat baseFileFormat = AudioSystem.getAudioFileFormat(file);
				AudioFormat baseFormat = baseFileFormat.getFormat();

				MessageDialog.openInformation(
					PlatformUI.getWorkbench().getDisplay().getActiveShell(),
					"Dragging Files...",
					baseFormat.toString()
				);

			} catch (UnsupportedAudioFileException e) {
				//e.printStackTrace();
			} catch (IOException e) {
				//e.printStackTrace();
			}

		}
	}

}

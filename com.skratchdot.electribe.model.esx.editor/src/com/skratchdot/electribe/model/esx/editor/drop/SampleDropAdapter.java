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
package com.skratchdot.electribe.model.esx.editor.drop;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.FileTransfer;
import org.eclipse.ui.PlatformUI;

import com.skratchdot.electribe.model.esx.editor.handlers.ImportHandler;

/**
 * This is subclass of {@link EditingDomainViewerDropAdapter} which adds
 * minor functionality for handling the dragging-and-dropping of audio
 * files and .esx files
 */
public class SampleDropAdapter extends EditingDomainViewerDropAdapter {

	/**
	 * This creates an instance with the given domain and viewer.
	 * @param domain
	 * @param viewer
	 */
	public SampleDropAdapter(EditingDomain domain, Viewer viewer) {
		super(domain, viewer);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter#drop(org.eclipse.swt.dnd.DropTargetEvent)
	 */
	@Override
	public void drop(DropTargetEvent event) {

		// Handle Files
		if(FileTransfer.getInstance().isSupportedType(event.currentDataType)) {
			String[] files = (String[]) event.data;
			ImportHandler.importAudioFiles(PlatformUI.getWorkbench().getActiveWorkbenchWindow(), files);
		}

		// Handle EObjects
		else if (LocalTransfer.getInstance().isSupportedType(event.currentDataType)) {
			super.drop(event);
		}

	}

}

/**
 * Copyright (c) 2009, 2012 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    JEFF |:at:| SKRATCHDOT |:dot:| COM
 *
 * $Id$
 */
package com.skratchdot.electribe.fileexplorer.views;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.dnd.DragSourceAdapter;
import org.eclipse.swt.dnd.DragSourceEvent;
import org.eclipse.swt.dnd.FileTransfer;

public class FileExplorerDragSourceAdapter extends DragSourceAdapter {
	private Viewer viewer;
	
	public FileExplorerDragSourceAdapter(Viewer viewer) {
		super();
		this.viewer = viewer;
	}

	@Override
	public void dragFinished(DragSourceEvent event) {
		super.dragFinished(event);
	}

	@Override
	public void dragSetData(DragSourceEvent event) {
		super.dragSetData(event);

		String[] files = this.getFileListFromSelection();

		if(files.length>0) {
			if(FileTransfer.getInstance().isSupportedType(event.dataType)) {
		    	event.data = files;
		    }
		}
		else {
			event.doit = false;
		}
	}

	@Override
	public void dragStart(DragSourceEvent event) {
		super.dragStart(event);

		String[] files = this.getFileListFromSelection();

		event.doit = (files.length>0);

	}
	
	private String[] getFileListFromSelection() {
		IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();

		ArrayList<String> fileList = new ArrayList<String>();
		for (Iterator<?> i = selection.iterator(); i.hasNext();) {
			Object current = i.next();
			if(current instanceof File) {
				String filePath = ((File) current).getAbsolutePath();
				fileList.add(filePath);
			}
		}
		String[] files = new String[fileList.size()];
		fileList.toArray(files);

		return files;
	}

}

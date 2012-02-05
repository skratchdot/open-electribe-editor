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

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

public class TableViewLabelProvider implements ITableLabelProvider {

	public Image getColumnImage(Object element, int columnIndex) {
		// The only column to have an image is the first column (the name column)
		if (columnIndex != 0 || element==null) {
			return null;
		}

		// Our "root directory"
		if(element instanceof RootDirectory) {
			return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_FOLDER);
		}

		// Our "parent directory"
		else if(element instanceof ParentDirectory) {
			return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_FOLDER);
		}

		// A regular filesystem directory
		else if(element instanceof File && ((File) element).isDirectory()) {
			return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_FOLDER);			
		}

		// A regular filesystem file
		else if(element instanceof File && ((File) element).isFile()) {
			return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_FILE);
		}

		else {
			return null;
		}

	}

	public String getColumnText(Object element, int columnIndex) {
		// Our "parent directory"
		if(element instanceof ParentDirectory) {
			if(columnIndex == 0) {
				return "..";
			}
			else {
				return "";
			}
		}

		// Directories/Files
		if(element instanceof File) {
			if (columnIndex == 0) {
				return FileExplorerUtil.getFileName((File) element);
			}
			else if (columnIndex == 1) {
				return FileExplorerUtil.getFileSize((File) element);
			}
			else if (columnIndex == 2) {
				return FileExplorerUtil.getFileType((File) element);
			}
			else if (columnIndex == 3) {
				return FileExplorerUtil.getFileDate((File) element);
			}
		}

		return "";
	}

	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	public void dispose() {
		// TODO Auto-generated method stub

	}

	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

}

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

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

public class TreeViewLabelProvider extends LabelProvider {

	@Override
	public Image getImage(Object element) {
		if( ((File) element).isDirectory() )
			return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_FOLDER);
		else if( ((File) element).isFile() )
			return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_FILE);
		else
			return null;
	}

	@Override
	public String getText(Object element) {
		// Get the name of the file
		String text = ((File) element).getName();

		// If name is blank, get the path
		if (text.length() == 0) {
			text = ((File) element).getPath();
		}

		return text;

	}

}

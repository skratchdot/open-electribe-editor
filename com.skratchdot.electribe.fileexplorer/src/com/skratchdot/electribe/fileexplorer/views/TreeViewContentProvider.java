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

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class TreeViewContentProvider implements ITreeContentProvider {
	private FileExplorerFilter filter;

	public TreeViewContentProvider(Boolean onlyShowingDirectories, String fileFilterArray) {
		super();
		filter = new FileExplorerFilter(onlyShowingDirectories,fileFilterArray);
	}

	public FileExplorerFilter getFilter() {
		return filter;
	}

	public void setFilter(FileExplorerFilter filter) {
		this.filter = filter;
	}

	public Object[] getChildren(Object parentElement) {
		// Return the files and subdirectories in this directory
		return ((File) parentElement).listFiles(filter);
	}

	public Object getParent(Object element) {
		// Return this file's parent file
		return ((File) element).getParentFile();
	}

	public boolean hasChildren(Object element) {
		// Get the children
		Object[] obj = getChildren(element);

		// Return whether or not the parent has children
		return obj == null ? false : obj.length > 0;
	}

	public Object[] getElements(Object inputElement) {
		// These are the root elements of the tree
		// We don't care what element is, because we just want all
		// the root nodes in the file system
		return File.listRoots();
	}

	public void dispose() {
		// Nothing to dispose

	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// Nothing to change
	}

}

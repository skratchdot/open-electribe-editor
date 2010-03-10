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
package com.skratchdot.electribe.fileexplorer.views;

import java.io.File;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class TableViewContentProvider implements IStructuredContentProvider {
	private FileExplorerFilter filter;

	public TableViewContentProvider(Boolean onlyShowingDirectories, String fileFilterArray) {
		super();
		filter = new FileExplorerFilter(onlyShowingDirectories,fileFilterArray);
	}

	public FileExplorerFilter getFilter() {
		return filter;
	}

	public void setFilter(FileExplorerFilter filter) {
		this.filter = filter;
	}

	public Object[] getElements(Object inputElement) {
		// We only need to return the root files
		if(inputElement==null || inputElement instanceof RootDirectory) {
			return File.listRoots();
		}
		
		// Declare our returnElements array which always contains a "parent directory"
		// in the first position
		Object[] returnElements = null;

		// We will loop through our list of directories/files after adding the "parent directory"
		Object[] listOfFiles = ((File) inputElement).listFiles(filter);
		
		// Only need to return "parent directory"
		if(listOfFiles==null) {
			// Initialize our return array
			returnElements = new Object[1];

			// Add our "parent directory"
			returnElements[0] = new ParentDirectory();
			
			// Only return "parent directory"
			return returnElements;
		}
		else {
			// Initialize our return array
			returnElements = new Object[listOfFiles.length+1];

			// Add our "parent directory"
			returnElements[0] = new ParentDirectory();

			// Add all of our other directory/files
			for(int i=0;i<listOfFiles.length;i++) {
				returnElements[i+1] = listOfFiles[i];
			}

			// Return "parent directory" along with other directory/files
			return returnElements;
		}
	}

	public void dispose() {
		// TODO Auto-generated method stub
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub
	}

}

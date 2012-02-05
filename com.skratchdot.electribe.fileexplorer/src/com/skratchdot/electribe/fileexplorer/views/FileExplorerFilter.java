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
import java.io.FileFilter;
import java.util.StringTokenizer;

import jregex.util.io.PathPattern;

public class FileExplorerFilter implements FileFilter {
	private static final String DEFAULT_SEPERATOR = ";";
	private Boolean onlyShowingDirectories;
	private String fileFilterString;
	private String[] fileFilterArray;
	private String seperator = DEFAULT_SEPERATOR;

	public FileExplorerFilter(Boolean onlyShowingDirectories, String fileFilterString) {
		super();
		this.setOnlyShowingDirectories(onlyShowingDirectories);
		this.setFileFilterString(fileFilterString);
	}

	public Boolean getOnlyShowingDirectories() {
		return onlyShowingDirectories;
	}

	public void setOnlyShowingDirectories(Boolean onlyShowingDirectories) {
		this.onlyShowingDirectories = onlyShowingDirectories;
	}

	public String getFileFilterString() {
		return fileFilterString;
	}

	public void setFileFilterString(String fileFilterString) {
		this.fileFilterString = fileFilterString;
		this.fileFilterArray = parseString(fileFilterString);
	}

	public String[] getFileFilterArray() {
		return fileFilterArray;
	}

	public void setFileFilterArray(String[] fileFilterArray) {
		this.fileFilterArray = fileFilterArray;
		this.fileFilterString = createListString(fileFilterArray);
	}

	public String getSeperator() {
		return seperator;
	}

	public void setSeperator(String seperator) {
		this.seperator = seperator;
	}

	/**
	 *  Creates the single String representation of the list
	 * that is stored in the preference store.
	 */
	private String createListString(String[] items) {
		StringBuffer path = new StringBuffer("");//$NON-NLS-1$
		for (int i = 0; i < items.length; i++) {
			path.append(items[i]);
			path.append(seperator);
		}
		return path.toString();
	}

	/**
	 *  Parses the single String representation of the list
	 * into an array of list items.
	 */
	private String[] parseString(String stringList) {
		StringTokenizer tokenizer =
			new StringTokenizer(stringList, seperator);
		int tokenCount = tokenizer.countTokens();
		String[] elements = new String[tokenCount];
		for (int i = 0; i < tokenCount; i++) {
			elements[i] = tokenizer.nextToken();
		}
		return elements;
	}

	public boolean accept(File element) {
		// Always return true for directories
		if(element.isDirectory()) {
			return true;
		}
		// If we are only showing directories, then we've already returned true
		if(this.onlyShowingDirectories) {
			return false;
		}
		// We are showing every file
		if(this.fileFilterArray.length==0 || this.fileFilterString=="") {
			return true;
		}
		// Now we filter on name
		for(String ext : this.fileFilterArray) {
			PathPattern pp = new PathPattern(ext.toLowerCase());
			if(pp.matches(element.getName().toLowerCase())) return true;
		}
		// Default to false
		return false;
	}

}

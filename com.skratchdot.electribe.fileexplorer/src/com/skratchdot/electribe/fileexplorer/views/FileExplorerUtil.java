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
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;

import org.eclipse.swt.program.Program;

public class FileExplorerUtil {
	private static final DateFormat dateFormat = DateFormat
		.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
	private static final NumberFormat numberFormat = NumberFormat.getNumberInstance();

	public static String getFileName(File element) {
		return element.getName();
	}
	
	public static String getFileSize(File element) {
		if (element.isDirectory()) {
			return "";
		}
		else {
			long filesizeInKb = ((element.length() + 512) / 1024);
			return "" + numberFormat.format(filesizeInKb) + " KB";
		}
	}

	public static String getFileType(File element) {
		if (element.isDirectory()) {
			return "Folder";
		}
		else if (element.isFile()) {
			String filename = element.getName();
			int extensionPos = filename.lastIndexOf(".");
			if(extensionPos>0) {
				String extension = filename.substring(extensionPos);
				Program program = Program.findProgram(extension);
				if(program!=null) {
					return program.getName();
				}
				else {
					return extension.toUpperCase();
				}
			}
			else {
				return "Unknown";
			}
		}
		return "???";
	}

	public static String getFileDate(File element) {
		return dateFormat.format(new Date(element.lastModified()));
	}

}

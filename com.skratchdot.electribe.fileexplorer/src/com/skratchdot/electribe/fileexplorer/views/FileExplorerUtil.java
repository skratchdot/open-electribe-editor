/*******************************************************************************
 * Copyright (c) 2009-2013 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 *******************************************************************************/
package com.skratchdot.electribe.fileexplorer.views;

import java.io.File;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.program.Program;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IWorkbenchPartSite;

public class FileExplorerUtil {
	private static final DateFormat dateFormat = DateFormat
			.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
	private static final NumberFormat numberFormat = NumberFormat
			.getNumberInstance();

	public static String getFileName(File element) {
		String name = element.getName();
		return name.length() == 0 ? element.getPath() : name;
	}

	public static String getFileSize(File element) {
		if (element.isDirectory()) {
			return "";
		} else {
			long filesizeInKb = ((element.length() + 512) / 1024);
			return "" + numberFormat.format(filesizeInKb) + " KB";
		}
	}

	public static String getFileType(File element) {
		if (element.isDirectory()) {
			return "Folder";
		} else if (element.isFile()) {
			String filename = element.getName();
			int extensionPos = filename.lastIndexOf(".");
			if (extensionPos > 0) {
				String extension = filename.substring(extensionPos);
				Program program = Program.findProgram(extension);
				if (program != null) {
					return program.getName();
				} else {
					return extension.toUpperCase();
				}
			} else {
				return "Unknown";
			}
		}
		return "";
	}

	public static String getFileDate(File element) {
		return dateFormat.format(new Date(element.lastModified()));
	}

	/**
	 * @param viewer the viewer in which to create a context menu for
	 * @param menuManagerId the id of the menu manager
	 */
	public static void createContextMenuFor(IWorkbenchPartSite site,
			StructuredViewer viewer, String menuId) {
		MenuManager contextMenu = new MenuManager("#PopUp");
		contextMenu.add(new Separator("additions"));
		contextMenu.setRemoveAllWhenShown(true);

		Menu menu = contextMenu.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		site.registerContextMenu(menuId, contextMenu,
				site.getSelectionProvider());
	}

}

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
package com.skratchdot.electribe.model.esx.editor.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;

import com.skratchdot.electribe.model.esx.presentation.EsxEditor;
import com.skratchdot.electribe.model.esx.presentation.EsxEditorPlugin;


public class EsxEditorUtil {

	/**
	 * This removes all "temp*.esx" and "untitled*.esx" files
	 * from the given directory.
	 * @param directory A valid directory.
	 */
	public static void clearTempDirectory(File directory) {
		if(!directory.isDirectory()) return;

		File[] tempFiles = directory.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File fDir, String strName) {
				return (
					(strName.startsWith("temp") || strName.startsWith("untitled"))
					&& strName.endsWith(".esx")
				);
			}
		});

		for (int i=0; i<tempFiles.length; i++) {
			tempFiles[i].delete();
		}
	}

	/**
	 * @param in Input (source) file.
	 * @param out Output (destination) file
	 * @throws IOException
	 */
	public static void copyFile(File in, File out) throws IOException {
		FileChannel inChannel = new FileInputStream(in).getChannel();
		FileChannel outChannel = new FileOutputStream(out).getChannel();
		try {
			inChannel.transferTo(0, inChannel.size(), outChannel);
		} catch (IOException e) {
			throw e;
		} finally {
			if (inChannel != null) inChannel.close();
			if (outChannel != null) outChannel.close();
		}
	}

	/**
	 * This looks up a string in the plugin's plugin.properties file.
	 */
	public static String getString(String key) {
		return EsxEditorPlugin.INSTANCE.getString(key);
	}

	/**
	 * This looks up a string in plugin.properties, making a substitution.
	 */
	public  static String getString(String key, Object s1) {
		return EsxEditorPlugin.INSTANCE.getString(key, new Object [] { s1 });
	}

	/**
	 * Returns a file path in the format: "[directory]/[prefix]_[TIMESTAMP].esx"
	 * @param directory A valid directory.
	 * @param prefix 
	 * @return returns a path name for a temporary .esx file
	 */
	public static String getTempEsxFilePath(File directory, String prefix) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
		String defaultTempFilePath = directory.getAbsolutePath() + 
			File.separatorChar + prefix + "_" +
			dateFormat.format(new Date()) +
			".esx";
		return defaultTempFilePath;
	}

	/**
	 * @param workbench
	 * @param uri
	 * @return
	 */
	public static boolean openEditor(IWorkbench workbench, URI uri) {
		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		IWorkbenchPage page = workbenchWindow.getActivePage();
		
		IEditorDescriptor editorDescriptor = EditUIUtil.getDefaultEditor(uri, null);
		if (editorDescriptor == null) {
			MessageDialog.openError(
				workbenchWindow.getShell(),
				getString("_UI_Error_title"),
				getString("_WARN_No_Editor", uri.lastSegment()));
			return false;
		}
		else {
			try {
				page.openEditor(new URIEditorInput(uri), editorDescriptor.getId());
			}
			catch (PartInitException exception) {
				MessageDialog.openError(
					workbenchWindow.getShell(),
					getString("_UI_OpenEditorError_label"),
					exception.getMessage());
				return false;
			}
		}
		return true;
	}

	/**
	 * @param shell
	 * @param style
	 * @param fileExtensionFilters
	 * @return
	 */
	public static String[] openFilePathDialog(Shell shell, int style, String[] fileExtensionFilters) {
		return openFilePathDialog(shell, style, fileExtensionFilters, (style & SWT.OPEN) != 0, (style & SWT.OPEN) != 0, (style & SWT.SAVE) != 0);
	}

	/**
	 * @param shell
	 * @param style
	 * @param fileExtensionFilters
	 * @param includeGroupFilter
	 * @param includeAllFilter
	 * @param addExtension
	 * @return
	 */
	public static String[] openFilePathDialog(Shell shell, int style, String[] fileExtensionFilters, boolean includeGroupFilter, boolean includeAllFilter, boolean addExtension) {
		FileDialog fileDialog = new FileDialog(shell, style);
		if (fileExtensionFilters == null) {
			List<String> fileExtentionFilters = EsxEditor.FILE_EXTENSION_FILTERS;
			fileExtensionFilters = fileExtentionFilters.toArray(new String[fileExtentionFilters.size()]);
		}

		// If requested, augment the file extension filters by adding a group of all the other filters (*.ext1;*.ext2;...)
		// at the beginning and/or an all files wildcard (*.*) at the end.
		//
		includeGroupFilter &= fileExtensionFilters.length > 1;
		int offset = includeGroupFilter ? 1 : 0;
		
		if (includeGroupFilter || includeAllFilter) {
			int size = fileExtensionFilters.length + offset + (includeAllFilter ? 1 : 0);
			String[] allFilters = new String[size];
			StringBuilder group = includeGroupFilter ? new StringBuilder() : null;
			
			for (int i = 0; i < fileExtensionFilters.length; i++) {
				if (includeGroupFilter) {
					if (i != 0) {
						group.append(';');
					}
					group.append(fileExtensionFilters[i]);
				}
				allFilters[i + offset] = fileExtensionFilters[i];
			}
			
			if (includeGroupFilter) {
				allFilters[0] = group.toString();
			}
			if (includeAllFilter) {
				allFilters[allFilters.length - 1] = "*.*";
			}
			
			fileDialog.setFilterExtensions(allFilters);
		}
		else {
			fileDialog.setFilterExtensions(fileExtensionFilters);
		}
		fileDialog.open();
		
		String[] filenames = fileDialog.getFileNames();
		String[] result = new String[filenames.length];
		String path = fileDialog.getFilterPath() + File.separator;
		String extension = null;
		
		// If extension adding requested, get the dotted extension corresponding to the selected filter.
		//
		if (addExtension) {
			int i = fileDialog.getFilterIndex();
			if (i != -1 && (!includeAllFilter || i != fileExtensionFilters.length)) {
				i = includeGroupFilter && i == 0 ? 0 : i - offset;
				String filter = fileExtensionFilters[i];
				int dot = filter.lastIndexOf('.');
				if (dot == 1 && filter.charAt(0) == '*') {
					extension = filter.substring(dot);
				}
			}
		}
		
		// Build the result by adding the selected path and, if needed, auto-appending the extension.
		//
		for (int i = 0; i < filenames.length; i++) {
			String filename = path + filenames[i];
			if (extension != null) {
				int dot = filename.lastIndexOf('.');
				if (dot == -1 || !Arrays.asList(fileExtensionFilters).contains("*" + filename.substring(dot))) {
					filename += extension;
				}
			}
			result[i] = filename;
		}
		return result;
	}
	
}

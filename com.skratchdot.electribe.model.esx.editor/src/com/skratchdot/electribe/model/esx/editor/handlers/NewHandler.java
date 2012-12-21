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
package com.skratchdot.electribe.model.esx.editor.handlers;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import com.skratchdot.electribe.model.esx.editor.util.EsxEditorUtil;
import com.skratchdot.electribe.model.esx.preferences.EsxPreferenceNames;
import com.skratchdot.electribe.model.esx.preferences.EsxPreferenceStore;

public class NewHandler extends AbstractHandler {
	public static final String NEW_ESX_FILE_ID = "com.skratchdot.electribe.model.esx.editor.commands.newEsxFile";

	public Object execute(ExecutionEvent event) throws ExecutionException {
		// NEW_ESX_FILE_ID
		if (event.getCommand().getId().equals(NEW_ESX_FILE_ID)) {
			return newEsxFile(event);
		}

		return null;
	}

	/**
	 * @param event
	 * @return
	 * @throws ExecutionException
	 */
	public Object newEsxFile(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil
				.getActiveWorkbenchWindowChecked(event);

		try {
			String[] files = EsxEditorUtil.openFilePathDialog(
					window.getShell(), SWT.SAVE, null);
			if (files.length > 0) {
				String defaultEsxFileString = EsxPreferenceStore
						.getString(EsxPreferenceNames.FILES_DEFAULT_ESX_FILE);
				File defaultEsxFile = new File(defaultEsxFileString);
				File newEsxFile = new File(files[0]);

				if (defaultEsxFile.isFile()) {
					EsxEditorUtil.copyFile(defaultEsxFile, newEsxFile);
					EsxEditorUtil.openEditor(window.getWorkbench(),
							URI.createFileURI(newEsxFile.getAbsolutePath()));
				} else {
					// Display missing default .esx message
					MessageDialog
							.openInformation(
									window.getShell(),
									EsxEditorUtil
											.getString("_UI_NewActionError_NoDefault_title"),
									EsxEditorUtil
											.getString("_UI_NewActionError_NoDefault_message"));
				}
			}
		} catch (IOException e) {
			MessageDialog.openError(window.getShell(),
					EsxEditorUtil.getString("_UI_NewActionError_label"),
					e.getMessage());
		}

		return null;
	}

}

/*******************************************************************************
 * Copyright (c) 2009, 2012 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    JEFF |:at:| SKRATCHDOT |:dot:| COM
 *******************************************************************************/
package com.skratchdot.electribe.model.esx.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.PlatformUI;

public class EsxPreferencePageExport extends FieldEditorPreferencePage
		implements IWorkbenchPreferencePage {
	public static final String ID = "com.skratchdot.electribe.model.esx.preferences.EsxPreferencePageExport"; //$NON-NLS-1$

	/**
	 * Create the preference page.
	 */
	public EsxPreferencePageExport() {
		super(FLAT);
	}

	/**
	 * Initialize the preference page.
	 */
	public void init(IWorkbench workbench) {
		setPreferenceStore(PlatformUI.getPreferenceStore());
		setDescription("When setting the exported filename format, you do not"
				+ " have to specify the .wav extension. It will be added automatically."
				+ "\n\nAlso, there are 2 special sequences you can use to insert variable values:"
				+ "\n\n     %n% - will be replaced with the current sample number (ie. 001, S.005, etc)"
				+ "\n\n     %s% - will be replaced with the current sample name. Whitespace will be trimmed away"
				+ "\n\n");
	}

	/**
	 * Create contents of the preference page.
	 */
	@Override
	protected void createFieldEditors() {
		// Create the field editors
		addField(new StringFieldEditor(
				EsxPreferenceNames.EXPORT_FILENAME_FORMAT,
				"Exported Filename Format:", -1,
				StringFieldEditor.VALIDATE_ON_KEY_STROKE,
				getFieldEditorParent()));
	}

}

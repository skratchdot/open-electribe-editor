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
package com.skratchdot.electribe.model.esx.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.PlatformUI;

public class EsxEditorPreferencePageSamples extends FieldEditorPreferencePage
		implements IWorkbenchPreferencePage {
	public static final String ID = "com.skratchdot.electribe.model.esx.preferences.EsxEditorPreferencePageSamples"; //$NON-NLS-1$

	/**
	 * Create the preference page.
	 */
	public EsxEditorPreferencePageSamples() {
		super(FLAT);
	}

	/**
	 * Initialize the preference page.
	 */
	public void init(IWorkbench workbench) {
		setPreferenceStore(PlatformUI.getPreferenceStore());
		setDescription(
			"You can change the Sample preference settings below." +
			"\n\nNOTE: If \"Use Scroll Speed\" is not checked, then " +
			"the Scroll Speed value below it will be ignored.\n\n"
		);
	}

	/**
	 * Create contents of the preference page.
	 */
	@Override
	protected void createFieldEditors() {
		// Create the field editors
		addField(new BooleanFieldEditor(EsxEditorPreferenceConstants.NAME_SAMPLES_USE_SCROLLSPEED, "Use Scroll Speed", BooleanFieldEditor.SEPARATE_LABEL, getFieldEditorParent()));
		{
			IntegerFieldEditor integerFieldEditor = new IntegerFieldEditor(EsxEditorPreferenceConstants.NAME_SAMPLES_SCROLLSPEED, "Scroll Speed (in ms)", getFieldEditorParent());
			integerFieldEditor.setValidRange(10, 200);
			addField(integerFieldEditor);
		}
		addField(new ColorFieldEditor(EsxEditorPreferenceConstants.NAME_SAMPLES_UNUSED_COLOR, "Unused Samples Color", getFieldEditorParent()));
	}

}

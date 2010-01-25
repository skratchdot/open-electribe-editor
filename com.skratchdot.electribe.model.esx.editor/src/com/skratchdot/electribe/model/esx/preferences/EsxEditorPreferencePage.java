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

import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.PreferenceLinkArea;
import org.eclipse.ui.preferences.IWorkbenchPreferenceContainer;

public class EsxEditorPreferencePage extends PreferencePage
		implements IWorkbenchPreferencePage {
	public static final String ID = "com.skratchdot.electribe.model.esx.preferences.EsxEditorPreferencePage"; //$NON-NLS-1$

	/**
	 * Create the preference page.
	 */
	public EsxEditorPreferencePage() {
	}

	/**
	 * Initialize the preference page.
	 */
	public void init(IWorkbench workbench) {
		setPreferenceStore(PlatformUI.getPreferenceStore());
		setDescription(
			"You can edit a specific feature by expanding the " +
			"tree, or by clicking one of the links below."
		);
	}

	/**
	 * Create contents of the preference page.
	 * @param parent
	 */
	@Override
	public Control createContents(Composite parent) {
		Composite composite = new Composite(parent, SWT.NULL);
		composite.setLayout(new GridLayout());

		// Link to EsxEditorPreferencePagePatterns
		new PreferenceLinkArea(
			composite,
			SWT.NONE,
			EsxEditorPreferencePagePatterns.ID,
			"See <a>''{0}''</a> to edit the Pattern preferences.",
			(IWorkbenchPreferenceContainer) getContainer(),
			null
		);

		// Link to EsxEditorPreferencePageSamples
		new PreferenceLinkArea(
			composite,
			SWT.NONE,
			EsxEditorPreferencePageSamples.ID,
			"See <a>''{0}''</a> to edit the Sample preferences.",
			(IWorkbenchPreferenceContainer) getContainer(),
			null
		);

		// Link to EsxEditorPreferencePageSongs
		new PreferenceLinkArea(
			composite,
			SWT.NONE,
			EsxEditorPreferencePageSongs.ID,
			"See <a>''{0}''</a> to edit the Song preferences.",
			(IWorkbenchPreferenceContainer) getContainer(),
			null
		);

		return composite;
	}

}

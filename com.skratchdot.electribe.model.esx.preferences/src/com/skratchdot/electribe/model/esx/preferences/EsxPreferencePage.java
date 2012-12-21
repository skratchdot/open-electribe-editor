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

public class EsxPreferencePage extends PreferencePage implements
		IWorkbenchPreferencePage {
	public static final String ID = "com.skratchdot.electribe.model.esx.preferences.EsxPreferencePage"; //$NON-NLS-1$

	/**
	 * Create the preference page.
	 */
	public EsxPreferencePage() {
	}

	/**
	 * Initialize the preference page.
	 */
	public void init(IWorkbench workbench) {
		setPreferenceStore(PlatformUI.getPreferenceStore());
		setDescription("You can edit a specific feature by expanding the "
				+ "tree, or by clicking one of the links below.");
	}

	/**
	 * Create contents of the preference page.
	 * @param parent
	 */
	@Override
	public Control createContents(Composite parent) {
		Composite composite = new Composite(parent, SWT.NULL);
		composite.setLayout(new GridLayout());

		// Link to EsxPreferencePageExport
		new PreferenceLinkArea(composite, SWT.NONE, EsxPreferencePageExport.ID,
				"See <a>''{0}''</a> to edit the Export preferences.",
				(IWorkbenchPreferenceContainer) getContainer(), null);

		// Link to EsxPreferencePageFiles
		new PreferenceLinkArea(composite, SWT.NONE, EsxPreferencePageFiles.ID,
				"See <a>''{0}''</a> to edit the File preferences.",
				(IWorkbenchPreferenceContainer) getContainer(), null);

		// Link to EsxPreferencePagePatterns
		new PreferenceLinkArea(composite, SWT.NONE,
				EsxPreferencePagePatterns.ID,
				"See <a>''{0}''</a> to edit the Pattern preferences.",
				(IWorkbenchPreferenceContainer) getContainer(), null);

		// Link to EsxPreferencePageSamples
		new PreferenceLinkArea(composite, SWT.NONE,
				EsxPreferencePageSamples.ID,
				"See <a>''{0}''</a> to edit the Sample preferences.",
				(IWorkbenchPreferenceContainer) getContainer(), null);

		// Link to EsxPreferencePageSongs
		new PreferenceLinkArea(composite, SWT.NONE, EsxPreferencePageSongs.ID,
				"See <a>''{0}''</a> to edit the Song preferences.",
				(IWorkbenchPreferenceContainer) getContainer(), null);

		return composite;
	}

}

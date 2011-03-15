/**
 * Copyright (c) 2009-2011 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    JEFF |:at:| SKRATCHDOT |:dot:| COM
 *
 * $Id$
 */
package com.skratchdot.electribe.fileexplorer.preferences;

import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.dialogs.PreferenceLinkArea;
import org.eclipse.ui.preferences.IWorkbenchPreferenceContainer;

import com.skratchdot.electribe.fileexplorer.Activator;

public class PreferencePageFileExplorer extends PreferencePage implements IWorkbenchPreferencePage {
	public static final String ID = "com.skratchdot.electribe.fileexplorer.preferences.PreferencePageFileExplorer";

	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription(
			"You can edit a specific feature by expanding the " +
			"tree, or by clicking one of the links below."
		);
	}

	@Override
	protected Control createContents(Composite parent) {
		Composite composite = new Composite(parent, SWT.NULL);
		composite.setLayout(new GridLayout());

		// Link to PreferencePageTableView
		new PreferenceLinkArea(
			composite,
			SWT.NONE,
			PreferencePageTableView.ID,
			"See <a>''{0}''</a> to edit the preferences for the File Explorer Table View.",
			(IWorkbenchPreferenceContainer) getContainer(),
			null
		);

		// Link to PreferencePageTreeView
		new PreferenceLinkArea(
			composite,
			SWT.NONE,
			PreferencePageTreeView.ID,
			"See <a>''{0}''</a> to edit the preferences for the File Explorer Tree View.",
			(IWorkbenchPreferenceContainer) getContainer(),
			null
		);

		return composite;
	}

}

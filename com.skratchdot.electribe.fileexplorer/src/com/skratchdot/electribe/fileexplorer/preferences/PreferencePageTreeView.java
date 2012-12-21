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
package com.skratchdot.electribe.fileexplorer.preferences;

import org.eclipse.jface.preference.*;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;
import com.skratchdot.electribe.fileexplorer.Activator;

public class PreferencePageTreeView extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {
	public static final String ID = "com.skratchdot.electribe.fileexplorer.preferences.PreferencePageTreeView";

	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("You can make Table View preference settings below."
				+ "\n\nNOTE: If \"Only Show Directories\" is checked, then "
				+ "the file type/name filters are ignored.\n\n");
	}

	@Override
	protected void createFieldEditors() {
		addField(new BooleanFieldEditor(
				PreferenceConstants.PREFNAME_TREEVIEW_ONLYSHOWINGDIRECTORIES,
				"Click here to &only show directories (don't show files)",
				getFieldEditorParent()));
		addField(new AddRemoveListFieldEditor(
				PreferenceConstants.PREFNAME_TREEVIEW_FILEFILTERARRAY,
				"File type/name filters:", "&Add", "&Remove",
				getFieldEditorParent()));
	}

}
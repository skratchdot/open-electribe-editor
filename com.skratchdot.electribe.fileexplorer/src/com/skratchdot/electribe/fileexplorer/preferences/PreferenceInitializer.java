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

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import com.skratchdot.electribe.fileexplorer.Activator;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(
				PreferenceConstants.PREFNAME_TABLEVIEW_ONLYSHOWINGDIRECTORIES,
				PreferenceConstants.PREFDEF_TABLEVIEW_ONLYSHOWINGDIRECTORIES
		);
		store.setDefault(
				PreferenceConstants.PREFNAME_TABLEVIEW_FILEFILTERARRAY,
				PreferenceConstants.PREFDEF_TABLEVIEW_FILEFILTERARRAY
		);
		store.setDefault(
				PreferenceConstants.PREFNAME_TREEVIEW_ONLYSHOWINGDIRECTORIES,
				PreferenceConstants.PREFDEF_TREEVIEW_ONLYSHOWINGDIRECTORIES
		);
		store.setDefault(
				PreferenceConstants.PREFNAME_TREEVIEW_FILEFILTERARRAY,
				PreferenceConstants.PREFDEF_TREEVIEW_FILEFILTERARRAY
		);
	}

}

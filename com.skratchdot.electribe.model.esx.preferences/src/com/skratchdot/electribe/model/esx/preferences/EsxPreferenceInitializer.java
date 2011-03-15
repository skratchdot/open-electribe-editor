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
package com.skratchdot.electribe.model.esx.preferences;

import java.io.File;

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.ui.PlatformUI;


/**
 * Class used to initialize default preference values.
 */
public class EsxPreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = PlatformUI.getPreferenceStore();
		
		/* EXPORT */
		store.setDefault(
				EsxPreferenceNames.EXPORT_FILENAME_FORMAT,
				EsxPreferenceDefaults.EXPORT_FILENAME_FORMAT
			);

		/* FILES */
		File file = new File(Platform.getInstallLocation().getURL().getPath()+"defaults/default.esx");
		File temp = new File(Platform.getInstallLocation().getURL().getPath()+"temp/");

		store.setDefault(
				EsxPreferenceNames.FILES_DEFAULT_ESX_FILE,
				file.getAbsolutePath()
			);
		store.setDefault(
				EsxPreferenceNames.FILES_TEMP_DIRECTORY,
				temp.getAbsolutePath()
			);

		/* SAMPLES */
		store.setDefault(
				EsxPreferenceNames.SAMPLES_USE_SCROLL_SPEED,
				EsxPreferenceDefaults.SAMPLES_USE_SCROLL_SPEED
			);
		store.setDefault(
				EsxPreferenceNames.SAMPLES_SCROLL_SPEED,
				EsxPreferenceDefaults.SAMPLES_SCROLL_SPEED
			);
		PreferenceConverter.setDefault(
				store,
				EsxPreferenceNames.SAMPLES_BACKGROUND_COLOR_WHEN_NOT_EMPTY,
				EsxPreferenceDefaults.SAMPLES_BACKGROUND_COLOR_WHEN_NOT_EMPTY
			);
		PreferenceConverter.setDefault(
				store,
				EsxPreferenceNames.SAMPLES_BACKGROUND_COLOR_WHEN_EMPTY,
				EsxPreferenceDefaults.SAMPLES_BACKGROUND_COLOR_WHEN_EMPTY
			);
		PreferenceConverter.setDefault(
				store,
				EsxPreferenceNames.SAMPLES_FOREGROUND_COLOR_WHEN_NOT_EMPTY,
				EsxPreferenceDefaults.SAMPLES_FOREGROUND_COLOR_WHEN_NOT_EMPTY
			);
		PreferenceConverter.setDefault(
				store,
				EsxPreferenceNames.SAMPLES_FOREGROUND_COLOR_WHEN_EMPTY,
				EsxPreferenceDefaults.SAMPLES_FOREGROUND_COLOR_WHEN_EMPTY
			);

		/* PATTERNS */
		store.setDefault(
				EsxPreferenceNames.PATTERNS_USE_SCROLL_SPEED,
				EsxPreferenceDefaults.PATTERNS_USE_SCROLL_SPEED
			);
		store.setDefault(
				EsxPreferenceNames.PATTERNS_SCROLL_SPEED,
				EsxPreferenceDefaults.PATTERNS_SCROLL_SPEED
			);
		PreferenceConverter.setDefault(
				store,
				EsxPreferenceNames.PATTERNS_BACKGROUND_COLOR_WHEN_NOT_EMPTY,
				EsxPreferenceDefaults.PATTERNS_BACKGROUND_COLOR_WHEN_NOT_EMPTY
			);
		PreferenceConverter.setDefault(
				store,
				EsxPreferenceNames.PATTERNS_BACKGROUND_COLOR_WHEN_EMPTY,
				EsxPreferenceDefaults.PATTERNS_BACKGROUND_COLOR_WHEN_EMPTY
			);
		PreferenceConverter.setDefault(
				store,
				EsxPreferenceNames.PATTERNS_FOREGROUND_COLOR_WHEN_NOT_EMPTY,
				EsxPreferenceDefaults.PATTERNS_FOREGROUND_COLOR_WHEN_NOT_EMPTY
			);
		PreferenceConverter.setDefault(
				store,
				EsxPreferenceNames.PATTERNS_FOREGROUND_COLOR_WHEN_EMPTY,
				EsxPreferenceDefaults.PATTERNS_FOREGROUND_COLOR_WHEN_EMPTY
			);

		/* SONGS */
		store.setDefault(
				EsxPreferenceNames.SONGS_USE_SCROLL_SPEED,
				EsxPreferenceDefaults.SONGS_USE_SCROLL_SPEED
			);
		store.setDefault(
				EsxPreferenceNames.SONGS_SCROLL_SPEED,
				EsxPreferenceDefaults.SONGS_SCROLL_SPEED
			);
		PreferenceConverter.setDefault(
				store,
				EsxPreferenceNames.SONGS_BACKGROUND_COLOR_WHEN_NOT_EMPTY,
				EsxPreferenceDefaults.SONGS_BACKGROUND_COLOR_WHEN_NOT_EMPTY
			);
		PreferenceConverter.setDefault(
				store,
				EsxPreferenceNames.SONGS_BACKGROUND_COLOR_WHEN_EMPTY,
				EsxPreferenceDefaults.SONGS_BACKGROUND_COLOR_WHEN_EMPTY
			);
		PreferenceConverter.setDefault(
				store,
				EsxPreferenceNames.SONGS_FOREGROUND_COLOR_WHEN_NOT_EMPTY,
				EsxPreferenceDefaults.SONGS_FOREGROUND_COLOR_WHEN_NOT_EMPTY
			);
		PreferenceConverter.setDefault(
				store,
				EsxPreferenceNames.SONGS_FOREGROUND_COLOR_WHEN_EMPTY,
				EsxPreferenceDefaults.SONGS_FOREGROUND_COLOR_WHEN_EMPTY
			);

	}
}

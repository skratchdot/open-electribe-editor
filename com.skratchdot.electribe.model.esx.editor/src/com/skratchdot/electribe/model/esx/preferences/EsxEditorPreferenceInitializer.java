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

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.ui.PlatformUI;


/**
 * Class used to initialize default preference values.
 */
public class EsxEditorPreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = PlatformUI.getPreferenceStore();

		/* SAMPLES */
		store.setDefault(
			EsxEditorPreferenceConstants.NAME_SAMPLES_USE_SCROLLSPEED,
			EsxEditorPreferenceConstants.DEFAULT_SAMPLES_USE_SCROLLSPEED
		);
		store.setDefault(
			EsxEditorPreferenceConstants.NAME_SAMPLES_SCROLLSPEED,
			EsxEditorPreferenceConstants.DEFAULT_SAMPLES_SCROLLSPEED
		);
		PreferenceConverter.setDefault(
			store,
			EsxEditorPreferenceConstants.NAME_SAMPLES_UNUSED_COLOR,
			EsxEditorPreferenceConstants.DEFAULT_SAMPLES_UNUSED_COLOR
		);

		/* PATTERNS */
		store.setDefault(
			EsxEditorPreferenceConstants.NAME_PATTERNS_USE_SCROLLSPEED,
			EsxEditorPreferenceConstants.DEFAULT_PATTERNS_USE_SCROLLSPEED
		);
		store.setDefault(
			EsxEditorPreferenceConstants.NAME_PATTERNS_SCROLLSPEED,
			EsxEditorPreferenceConstants.DEFAULT_PATTERNS_SCROLLSPEED
		);
		PreferenceConverter.setDefault(
			store,
			EsxEditorPreferenceConstants.NAME_PATTERNS_UNUSED_COLOR,
			EsxEditorPreferenceConstants.DEFAULT_PATTERNS_UNUSED_COLOR
		);

		/* SONGS */
		store.setDefault(
			EsxEditorPreferenceConstants.NAME_SONGS_USE_SCROLLSPEED,
			EsxEditorPreferenceConstants.DEFAULT_SONGS_USE_SCROLLSPEED
		);
		store.setDefault(
			EsxEditorPreferenceConstants.NAME_SONGS_SCROLLSPEED,
			EsxEditorPreferenceConstants.DEFAULT_SONGS_SCROLLSPEED
		);
		PreferenceConverter.setDefault(
			store,
			EsxEditorPreferenceConstants.NAME_SONGS_UNUSED_COLOR,
			EsxEditorPreferenceConstants.DEFAULT_SONGS_UNUSED_COLOR
		);
		
	}
}

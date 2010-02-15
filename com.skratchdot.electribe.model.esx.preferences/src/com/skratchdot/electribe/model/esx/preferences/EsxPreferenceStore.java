/**
 * Copyright (c) 2009-2010 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 *
 * $Id$
 */
package com.skratchdot.electribe.model.esx.preferences;

import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.ui.PlatformUI;

/**
 * Provides getters for all the Open Electribe Editor preferences.
 * A wrapper for calls to: PlatformUI.getPreferenceStore().getXXX()
 */
public class EsxPreferenceStore {

	/**
	 * @param preferenceName
	 * @return the RGB value of the Color Preference
	 */
	public static RGB getColor(String preferenceName) {
		return PreferenceConverter.getColor(
			PlatformUI.getPreferenceStore(),
			preferenceName
		);
	}
	
	/**
	 * @see org.eclipse.jface.preference.IPreferenceStore#getString(String)
	 * @param preferenceName
	 * @return
	 */
	public static String getString(String preferenceName) {
		return PlatformUI.getPreferenceStore().getString(preferenceName);
	}

	/**
	 * @return the value of the '<em>SAMPLES_USE_SCROLL_SPEED</em>' preference.
	 */
	public static Boolean getSamplesUseScrollSpeed() {
		return PlatformUI.getPreferenceStore().getBoolean(EsxPreferenceNames.SAMPLES_USE_SCROLL_SPEED);
	}

	/**
	 * @return the value of the '<em>SAMPLES_SCROLL_SPEED</em>' preference.
	 */
	public static Integer getSamplesScrollSpeed() {
		return PlatformUI.getPreferenceStore().getInt(EsxPreferenceNames.SAMPLES_SCROLL_SPEED);
	}

	/**
	 * @return the value of the '<em>SAMPLES_BACKGROUND_COLOR_WHEN_NOT_EMPTY</em>' preference.
	 */
	public static RGB getSamplesBackgroundColorWhenNotEmpty() {
		return PreferenceConverter.getColor(
				PlatformUI.getPreferenceStore(),
				EsxPreferenceNames.SAMPLES_BACKGROUND_COLOR_WHEN_NOT_EMPTY
		);
	}

	/**
	 * @return the value of the '<em>SAMPLES_BACKGROUND_COLOR_WHEN_EMPTY</em>' preference.
	 */
	public static RGB getSamplesBackgroundColorWhenEmpty() {
		return PreferenceConverter.getColor(
				PlatformUI.getPreferenceStore(),
				EsxPreferenceNames.SAMPLES_BACKGROUND_COLOR_WHEN_EMPTY
		);
	}

	/**
	 * @return the value of the '<em>SAMPLES_FOREGROUND_COLOR_WHEN_NOT_EMPTY</em>' preference.
	 */
	public static RGB getSamplesForegroundColorWhenNotEmpty() {
		return PreferenceConverter.getColor(
				PlatformUI.getPreferenceStore(),
				EsxPreferenceNames.SAMPLES_FOREGROUND_COLOR_WHEN_NOT_EMPTY
		);
	}

	/**
	 * @return the value of the '<em>SAMPLES_FOREGROUND_COLOR_WHEN_EMPTY</em>' preference.
	 */
	public static RGB getSamplesForegroundColorWhenEmpty() {
		return PreferenceConverter.getColor(
				PlatformUI.getPreferenceStore(),
				EsxPreferenceNames.SAMPLES_FOREGROUND_COLOR_WHEN_EMPTY
		);
	}

	/**
	 * @return the value of the '<em>PATTERNS_USE_SCROLL_SPEED</em>' preference.
	 */
	public static Boolean getPatternsUseScrollSpeed() {
		return PlatformUI.getPreferenceStore().getBoolean(EsxPreferenceNames.PATTERNS_USE_SCROLL_SPEED);
	}

	/**
	 * @return the value of the '<em>PATTERNS_SCROLL_SPEED</em>' preference.
	 */
	public static Integer getPatternsScrollSpeed() {
		return PlatformUI.getPreferenceStore().getInt(EsxPreferenceNames.PATTERNS_SCROLL_SPEED);
	}

	/**
	 * @return the value of the '<em>PATTERNS_BACKGROUND_COLOR_WHEN_NOT_EMPTY</em>' preference.
	 */
	public static RGB getPatternsBackgroundColorWhenNotEmpty() {
		return PreferenceConverter.getColor(
				PlatformUI.getPreferenceStore(),
				EsxPreferenceNames.PATTERNS_BACKGROUND_COLOR_WHEN_NOT_EMPTY
		);
	}

	/**
	 * @return the value of the '<em>PATTERNS_BACKGROUND_COLOR_WHEN_EMPTY</em>' preference.
	 */
	public static RGB getPatternsBackgroundColorWhenEmpty() {
		return PreferenceConverter.getColor(
				PlatformUI.getPreferenceStore(),
				EsxPreferenceNames.PATTERNS_BACKGROUND_COLOR_WHEN_EMPTY
		);
	}

	/**
	 * @return the value of the '<em>PATTERNS_FOREGROUND_COLOR_WHEN_NOT_EMPTY</em>' preference.
	 */
	public static RGB getPatternsForegroundColorWhenNotEmpty() {
		return PreferenceConverter.getColor(
				PlatformUI.getPreferenceStore(),
				EsxPreferenceNames.PATTERNS_FOREGROUND_COLOR_WHEN_NOT_EMPTY
		);
	}

	/**
	 * @return the value of the '<em>PATTERNS_FOREGROUND_COLOR_WHEN_EMPTY</em>' preference.
	 */
	public static RGB getPatternsForegroundColorWhenEmpty() {
		return PreferenceConverter.getColor(
				PlatformUI.getPreferenceStore(),
				EsxPreferenceNames.PATTERNS_FOREGROUND_COLOR_WHEN_EMPTY
		);
	}

	/**
	 * @return the value of the '<em>SONGS_USE_SCROLL_SPEED</em>' preference.
	 */
	public static Boolean getSongsUseScrollSpeed() {
		return PlatformUI.getPreferenceStore().getBoolean(EsxPreferenceNames.SONGS_USE_SCROLL_SPEED);
	}

	/**
	 * @return the value of the '<em>SONGS_SCROLL_SPEED</em>' preference.
	 */
	public static Integer getSongsScrollSpeed() {
		return PlatformUI.getPreferenceStore().getInt(EsxPreferenceNames.SONGS_SCROLL_SPEED);
	}

	/**
	 * @return the value of the '<em>SONGS_BACKGROUND_COLOR_WHEN_NOT_EMPTY</em>' preference.
	 */
	public static RGB getSongsBackgroundColorWhenNotEmpty() {
		return PreferenceConverter.getColor(
				PlatformUI.getPreferenceStore(),
				EsxPreferenceNames.SONGS_BACKGROUND_COLOR_WHEN_NOT_EMPTY
		);
	}

	/**
	 * @return the value of the '<em>SONGS_BACKGROUND_COLOR_WHEN_EMPTY</em>' preference.
	 */
	public static RGB getSongsBackgroundColorWhenEmpty() {
		return PreferenceConverter.getColor(
				PlatformUI.getPreferenceStore(),
				EsxPreferenceNames.SONGS_BACKGROUND_COLOR_WHEN_EMPTY
		);
	}

	/**
	 * @return the value of the '<em>SONGS_FOREGROUND_COLOR_WHEN_NOT_EMPTY</em>' preference.
	 */
	public static RGB getSongsForegroundColorWhenNotEmpty() {
		return PreferenceConverter.getColor(
				PlatformUI.getPreferenceStore(),
				EsxPreferenceNames.SONGS_FOREGROUND_COLOR_WHEN_NOT_EMPTY
		);
	}

	/**
	 * @return the value of the '<em>SONGS_FOREGROUND_COLOR_WHEN_EMPTY</em>' preference.
	 */
	public static RGB getSongsForegroundColorWhenEmpty() {
		return PreferenceConverter.getColor(
				PlatformUI.getPreferenceStore(),
				EsxPreferenceNames.SONGS_FOREGROUND_COLOR_WHEN_EMPTY
		);
	}

}

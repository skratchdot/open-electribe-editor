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
	 * @return the value of the '<em>SAMPLES_BACKGROUND_COLOR_WHEN_BEING_USED</em>' preference.
	 */
	public static RGB getSamplesBackgroundColorWhenBeingUsed() {
		return PreferenceConverter.getColor(
				PlatformUI.getPreferenceStore(),
				EsxPreferenceNames.SAMPLES_BACKGROUND_COLOR_WHEN_BEING_USED
		);
	}

	/**
	 * @return the value of the '<em>SAMPLES_BACKGROUND_COLOR_WHEN_NOT_IN_USE</em>' preference.
	 */
	public static RGB getSamplesBackgroundColorWhenNotInUse() {
		return PreferenceConverter.getColor(
				PlatformUI.getPreferenceStore(),
				EsxPreferenceNames.SAMPLES_BACKGROUND_COLOR_WHEN_NOT_IN_USE
		);
	}

	/**
	 * @return the value of the '<em>SAMPLES_FOREGROUND_COLOR_WHEN_BEING_USED</em>' preference.
	 */
	public static RGB getSamplesForegroundColorWhenBeingUsed() {
		return PreferenceConverter.getColor(
				PlatformUI.getPreferenceStore(),
				EsxPreferenceNames.SAMPLES_FOREGROUND_COLOR_WHEN_BEING_USED
		);
	}

	/**
	 * @return the value of the '<em>SAMPLES_FOREGROUND_COLOR_WHEN_NOT_IN_USE</em>' preference.
	 */
	public static RGB getSamplesForegroundColorWhenNotInUse() {
		return PreferenceConverter.getColor(
				PlatformUI.getPreferenceStore(),
				EsxPreferenceNames.SAMPLES_FOREGROUND_COLOR_WHEN_NOT_IN_USE
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
	 * @return the value of the '<em>PATTERNS_BACKGROUND_COLOR_WHEN_BEING_USED</em>' preference.
	 */
	public static RGB getPatternsBackgroundColorWhenBeingUsed() {
		return PreferenceConverter.getColor(
				PlatformUI.getPreferenceStore(),
				EsxPreferenceNames.PATTERNS_BACKGROUND_COLOR_WHEN_BEING_USED
		);
	}

	/**
	 * @return the value of the '<em>PATTERNS_BACKGROUND_COLOR_WHEN_NOT_IN_USE</em>' preference.
	 */
	public static RGB getPatternsBackgroundColorWhenNotInUse() {
		return PreferenceConverter.getColor(
				PlatformUI.getPreferenceStore(),
				EsxPreferenceNames.PATTERNS_BACKGROUND_COLOR_WHEN_NOT_IN_USE
		);
	}

	/**
	 * @return the value of the '<em>PATTERNS_FOREGROUND_COLOR_WHEN_BEING_USED</em>' preference.
	 */
	public static RGB getPatternsForegroundColorWhenBeingUsed() {
		return PreferenceConverter.getColor(
				PlatformUI.getPreferenceStore(),
				EsxPreferenceNames.PATTERNS_FOREGROUND_COLOR_WHEN_BEING_USED
		);
	}

	/**
	 * @return the value of the '<em>PATTERNS_FOREGROUND_COLOR_WHEN_NOT_IN_USE</em>' preference.
	 */
	public static RGB getPatternsForegroundColorWhenNotInUse() {
		return PreferenceConverter.getColor(
				PlatformUI.getPreferenceStore(),
				EsxPreferenceNames.PATTERNS_FOREGROUND_COLOR_WHEN_NOT_IN_USE
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
	 * @return the value of the '<em>SONGS_BACKGROUND_COLOR_WHEN_BEING_USED</em>' preference.
	 */
	public static RGB getSongsBackgroundColorWhenBeingUsed() {
		return PreferenceConverter.getColor(
				PlatformUI.getPreferenceStore(),
				EsxPreferenceNames.SONGS_BACKGROUND_COLOR_WHEN_BEING_USED
		);
	}

	/**
	 * @return the value of the '<em>SONGS_BACKGROUND_COLOR_WHEN_NOT_IN_USE</em>' preference.
	 */
	public static RGB getSongsBackgroundColorWhenNotInUse() {
		return PreferenceConverter.getColor(
				PlatformUI.getPreferenceStore(),
				EsxPreferenceNames.SONGS_BACKGROUND_COLOR_WHEN_NOT_IN_USE
		);
	}

	/**
	 * @return the value of the '<em>SONGS_FOREGROUND_COLOR_WHEN_BEING_USED</em>' preference.
	 */
	public static RGB getSongsForegroundColorWhenBeingUsed() {
		return PreferenceConverter.getColor(
				PlatformUI.getPreferenceStore(),
				EsxPreferenceNames.SONGS_FOREGROUND_COLOR_WHEN_BEING_USED
		);
	}

	/**
	 * @return the value of the '<em>SONGS_FOREGROUND_COLOR_WHEN_NOT_IN_USE</em>' preference.
	 */
	public static RGB getSongsForegroundColorWhenNotInUse() {
		return PreferenceConverter.getColor(
				PlatformUI.getPreferenceStore(),
				EsxPreferenceNames.SONGS_FOREGROUND_COLOR_WHEN_NOT_IN_USE
		);
	}

}

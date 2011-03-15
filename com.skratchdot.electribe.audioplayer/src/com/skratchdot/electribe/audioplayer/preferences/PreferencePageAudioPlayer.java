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
package com.skratchdot.electribe.audioplayer.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.jface.preference.ComboFieldEditor;

public class PreferencePageAudioPlayer extends FieldEditorPreferencePage
		implements IWorkbenchPreferencePage {
	public static final String ID = "com.skratchdot.electribe.audioplayer.preferences.PreferencePageAudioPlayer"; //$NON-NLS-1$

	/**
	 * Create the preference page.
	 */
	public PreferencePageAudioPlayer() {
		super(FLAT);
	}

	/**
	 * Initialize the preference page.
	 */
	public void init(IWorkbench workbench) {
		setPreferenceStore(PlatformUI.getPreferenceStore());
		setDescription(
			"You can set the way the AudioPlayer behaves when " +
			"double-clicking on an audio file or sample."
		);
	}

	/**
	 * Create contents of the preference page.
	 */
	@Override
	protected void createFieldEditors() {
		// Create the field editors
		addField(new ComboFieldEditor(PreferenceConstants.AUDIOPLAYER_DOUBLECLICK_BEHAVIOR, "Active Selection Double-Click Behavior:", new String[][]{{"Play/Loop", PreferenceConstants.AUDIOPLAYER_DOUBLECLICK_PLAY_OR_LOOP}, {"Loop Always", PreferenceConstants.AUDIOPLAYER_DOUBLECLICK_LOOP_ALWAYS}, {"Play Always", PreferenceConstants.AUDIOPLAYER_DOUBLECLICK_PLAY_ALWAYS}}, getFieldEditorParent()));
	}

}

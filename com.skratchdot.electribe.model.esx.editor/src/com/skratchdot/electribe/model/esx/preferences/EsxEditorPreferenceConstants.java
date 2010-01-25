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

import org.eclipse.swt.graphics.RGB;

/**
 * Constants for the Esx Editor Preferences
 */
public class EsxEditorPreferenceConstants {

	//The identifiers for the preference names
	public static final String NAME_SAMPLES_USE_SCROLLSPEED = "SAMPLES_USE_SCROLLSPEED";
	public static final String NAME_SAMPLES_SCROLLSPEED = "SAMPLES_SCROLLSPEED";
	public static final String NAME_SAMPLES_UNUSED_COLOR = "SAMPLES_UNUSED_COLOR";
	public static final String NAME_PATTERNS_USE_SCROLLSPEED = "PATTERNS_USE_SCROLLSPEED";
	public static final String NAME_PATTERNS_SCROLLSPEED = "PATTERNS_SCROLLSPEED";
	public static final String NAME_PATTERNS_UNUSED_COLOR = "PATTERNS_UNUSED_COLOR";
	public static final String NAME_SONGS_USE_SCROLLSPEED = "SONGS_USE_SCROLLSPEED";
	public static final String NAME_SONGS_SCROLLSPEED = "SONGS_SCROLLSPEED";
	public static final String NAME_SONGS_UNUSED_COLOR = "SONGS_UNUSED_COLOR";

	//The default values for the preferences
	public static final Boolean DEFAULT_SAMPLES_USE_SCROLLSPEED = true;
	public static final Integer DEFAULT_SAMPLES_SCROLLSPEED = 40;
	public static final RGB DEFAULT_SAMPLES_UNUSED_COLOR = new RGB(240, 240, 240);
	public static final Boolean DEFAULT_PATTERNS_USE_SCROLLSPEED = true;
	public static final Integer DEFAULT_PATTERNS_SCROLLSPEED = 40;
	public static final RGB DEFAULT_PATTERNS_UNUSED_COLOR = new RGB(240, 240, 240);
	public static final Boolean DEFAULT_SONGS_USE_SCROLLSPEED = true;
	public static final Integer DEFAULT_SONGS_SCROLLSPEED = 40;
	public static final RGB DEFAULT_SONGS_UNUSED_COLOR = new RGB(240, 240, 240);

}

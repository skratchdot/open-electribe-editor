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
package net.javazoom.jlayer.skratchdot;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AudioUtil {

	public static Collection<Integer> getLoopPoints(File file) {
		return null;
	}

	public static int getFirstLoopPoint(File file) {
		return -1;
	}

	public static boolean containsLoopPoints(File file) {
		return false;
	}
	
	public static boolean isStereo(File file) {
		try {
			AudioFileFormat audioFileFormat = AudioSystem.getAudioFileFormat(file);
			return (audioFileFormat.getFormat().getChannels()>1);
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static boolean isAudioFile(File file) {
		try {
			AudioSystem.getAudioFileFormat(file);
			return true;
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

}

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
package com.skratchdot.electribe.audioplayer.handlers;

import javazoom.jlgui.basicplayer.BasicPlayer;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import com.skratchdot.electribe.audioplayer.AudioPlayer;

public class PauseHandler extends AbstractHandler {

	public PauseHandler() {
	}

	public Object execute(ExecutionEvent event) throws ExecutionException {

		try {
			if(AudioPlayer.getPlayer().getStatus()==BasicPlayer.PLAYING) {
				AudioPlayer.getInstance().pause();
			}
			else if(AudioPlayer.getPlayer().getStatus()==BasicPlayer.PAUSED) {
				AudioPlayer.getInstance().resume();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
}

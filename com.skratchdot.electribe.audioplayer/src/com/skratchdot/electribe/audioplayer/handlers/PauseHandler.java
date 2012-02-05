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
package com.skratchdot.electribe.audioplayer.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import com.skratchdot.electribe.audioplayer.AudioPlayer;
import com.skratchdot.electribe.audioplayer.AudioPlayer.PlayState;

public class PauseHandler extends AbstractHandler {

	public PauseHandler() {
	}

	public Object execute(ExecutionEvent event) throws ExecutionException {

		try {
			if(AudioPlayer.getInstance().getPlayState()==PlayState.PLAYING) {
				AudioPlayer.getInstance().pause();
			}
			else if(AudioPlayer.getInstance().getPlayState()==PlayState.PAUSED) {
				AudioPlayer.getInstance().resume();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
}

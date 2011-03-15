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
package com.skratchdot.electribe.audioplayer.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import com.skratchdot.electribe.audioplayer.AudioPlayer;
import com.skratchdot.electribe.audioplayer.preferences.PreferenceConstants;
import com.skratchdot.electribe.model.esx.Sample;

public class LoopAndPlayHandler extends AbstractHandler {
	public static final String LOOP_COMMAND_ID = "com.skratchdot.electribe.audioplayer.commands.loopCommand";
	public static final String PLAY_COMMAND_ID = "com.skratchdot.electribe.audioplayer.commands.playCommand";
	public static final String PLAY_OR_LOOP_COMMAND_ID = "com.skratchdot.electribe.audioplayer.commands.playOrLoopCommand";

	public LoopAndPlayHandler() {
	}

	public Object execute(ExecutionEvent event) throws ExecutionException {

		try {
			IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
			ISelection selection = window.getSelectionService().getSelection();

			// Now try to play the first selected item
			if (selection instanceof IStructuredSelection) {
				Object firstObject = ((IStructuredSelection) selection).getFirstElement();

				if(firstObject!=null) {

					// LOOP COMMAND
					if(event.getCommand().getId().equals(LOOP_COMMAND_ID)) {
						AudioPlayer.getInstance().play(firstObject, true);
					}
					// PLAY COMMAND
					else if(event.getCommand().getId().equals(PLAY_COMMAND_ID)) {
						AudioPlayer.getInstance().play(firstObject, false);
					}
					// PLAY OR LOOP COMMAND
					else if(event.getCommand().getId().equals(PLAY_OR_LOOP_COMMAND_ID)) {
						loopOrPlayBasedOnPreference(firstObject);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	
	public void loopOrPlayBasedOnPreference(Object obj) {
		// Get preference
		String doubleClickBehavior = PlatformUI
			.getPreferenceStore()
			.getString(PreferenceConstants.AUDIOPLAYER_DOUBLECLICK_BEHAVIOR);

		// Loop Or Play
		if (doubleClickBehavior == PreferenceConstants.AUDIOPLAYER_DOUBLECLICK_PLAY_OR_LOOP) {
			if (obj instanceof Sample && ((Sample) obj).isLoop()) {
				AudioPlayer.getInstance().play(obj, true);
			} else {
				AudioPlayer.getInstance().play(obj, false);
			}
		}
		// Loop Always
		else if (doubleClickBehavior == PreferenceConstants.AUDIOPLAYER_DOUBLECLICK_LOOP_ALWAYS) {
			AudioPlayer.getInstance().play(obj, true);
		}
		// Play Always
		else if (doubleClickBehavior == PreferenceConstants.AUDIOPLAYER_DOUBLECLICK_PLAY_ALWAYS) {
			AudioPlayer.getInstance().play(obj, false);
		}
	}

}

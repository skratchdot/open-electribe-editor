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

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import com.skratchdot.electribe.audioplayer.AudioPlayer;

public class LoopAndPlayHandler extends AbstractHandler {
	public static final String LOOP_COMMAND_ID = "com.skratchdot.electribe.audioplayer.commands.loopCommand";
	public static final String PLAY_COMMAND_ID = "com.skratchdot.electribe.audioplayer.commands.playCommand";

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

					// Are we looping or not?
					if(event.getCommand().getId().equals(LOOP_COMMAND_ID)) {
						AudioPlayer.getInstance().play(firstObject, true);
					}
					else if(event.getCommand().getId().equals(PLAY_COMMAND_ID)) {
						AudioPlayer.getInstance().play(firstObject, false);
					}
				
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
}

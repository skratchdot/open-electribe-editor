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

import java.io.File;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import com.skratchdot.electribe.audioplayer.AudioPlayer;
import com.skratchdot.electribe.audioplayer.IAudioPlayerStates.LoopState;
import com.skratchdot.electribe.model.esx.SampleMono;
import com.skratchdot.electribe.model.esx.SampleStereo;

public class LoopAndPlayHandler extends AbstractHandler {
	public static final String LOOP_COMMAND_ID = "com.skratchdot.electribe.audioplayer.commands.loopCommand";
	public static final String PLAY_COMMAND_ID = "com.skratchdot.electribe.audioplayer.commands.playCommand";

	public LoopAndPlayHandler() {
	}

	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		ISelection selection = window.getSelectionService().getSelection();

		// Are we looping or not?
		if(event.getCommand().getId().equals(LOOP_COMMAND_ID)) {
			AudioPlayer.getInstance().setLoopState(LoopState.ON);
		}
		else if(event.getCommand().getId().equals(PLAY_COMMAND_ID)) {
			AudioPlayer.getInstance().setLoopState(LoopState.OFF);
		}

		// Now try to play the first selected item
		if (selection instanceof IStructuredSelection) {
			Object firstObject = ((IStructuredSelection) selection).getFirstElement();
			// Handle IFile
			if (firstObject != null && firstObject instanceof IAdaptable) {
				Object resource = ((IAdaptable) firstObject).getAdapter(IResource.class);
				if (resource != null && resource instanceof IFile) {
					IPath path = ((IFile) resource).getRawLocation();
					File file = new File(path.toOSString());
					// Play IFile
					if(AudioPlayer.getInstance().isValidAudioInObject(file)) {
						AudioPlayer.getInstance().setAudioIn(file);
						AudioPlayer.getInstance().audioPlay();
					}
				}
			}
			// Handle File
			else if (firstObject != null && firstObject instanceof File) {
				File file = (File) firstObject;
				// Play File
				if(AudioPlayer.getInstance().isValidAudioInObject(file)) {
					AudioPlayer.getInstance().setAudioIn(file);
					AudioPlayer.getInstance().audioPlay();
				}
			}
			// Handle SampleMono
			else if (firstObject != null && firstObject instanceof SampleMono) {
				SampleMono sample = (SampleMono) firstObject;
				if(AudioPlayer.getInstance().isValidAudioInObject(sample)) {
					AudioPlayer.getInstance().setAudioIn(sample);
					AudioPlayer.getInstance().audioPlay();
				}
			}
			// Handle SampleStereo
			else if (firstObject != null && firstObject instanceof SampleStereo) {
				SampleStereo sample = (SampleStereo) firstObject;
				if(AudioPlayer.getInstance().isValidAudioInObject(sample)) {
					AudioPlayer.getInstance().setAudioIn(sample);
					AudioPlayer.getInstance().audioPlay();
				}
			}
		}
		
		// Go ahead and play if we've had a valid file before.
		if(AudioPlayer.getInstance().getAudioIn()!=null) {
			AudioPlayer.getInstance().audioPlay();
		}

		return null;
	}
}

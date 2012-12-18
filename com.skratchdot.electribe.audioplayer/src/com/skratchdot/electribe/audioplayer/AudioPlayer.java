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
package com.skratchdot.electribe.audioplayer;

public class AudioPlayer {
	// class ID
	// private final static String ID = "com.skratchdot.electribe.audioplayer.AudioPlayer";

	// enum: LoopState
	public static enum LoopState {
		ON, OFF
	};

	// enum: PlayState
	public static enum PlayState {
		INITIALIZED, PLAYING, PAUSED, STOPPED
	};

	// singleton instance
	private static AudioPlayer instance;

	// private variables
	private long threadsCreated = 0;
	private ThreadGroup threadGroup;
	private LoopState loopState;
	private PlayState playState;
	private AudioThread activeThread;

	/**
	 * Initialize our default variables
	 */
	public AudioPlayer() {
		threadGroup = new ThreadGroup("Audio Player Threads");
		loopState = LoopState.OFF;
		playState = PlayState.STOPPED;
	}

	/**
	 * @return the instance
	 */
	public static synchronized AudioPlayer getInstance() {
		if (instance == null) {
			instance = new AudioPlayer();
		}
		return instance;
	}

	/**
	 * @return the loopState
	 */
	public synchronized LoopState getLoopState() {
		return loopState;
	}

	/**
	 * @return the playState
	 */
	public synchronized PlayState getPlayState() {
		return playState;
	}

	public synchronized void play(Object obj, boolean isLoop) {
		stopActiveThread();
		loopState = isLoop ? LoopState.ON : LoopState.OFF;
		playState = PlayState.PLAYING;
		createAudioThread(obj, isLoop);
	}

	public synchronized void resume() {
		if (activeThread != null && playState == PlayState.PAUSED) {
			playState = PlayState.PLAYING;
			activeThread.setPaused(false);
		}
	}

	public synchronized void pause() {
		if (activeThread != null && playState == PlayState.PLAYING) {
			playState = PlayState.PAUSED;
			activeThread.setPaused(true);
		}
	}

	public synchronized void stop() {
		stopActiveThread();
		playState = PlayState.STOPPED;
	}

	private void stopActiveThread() {
		if (activeThread != null) {
			activeThread.setStopped(false);
			activeThread.setPaused(false);
			activeThread.interrupt();
		}
	}

	private void createAudioThread(Object obj, boolean isLoop) {
		threadsCreated++;
		activeThread = new AudioThread(threadGroup, "Audio Thread: "
				+ threadsCreated, obj, isLoop);
	}

}

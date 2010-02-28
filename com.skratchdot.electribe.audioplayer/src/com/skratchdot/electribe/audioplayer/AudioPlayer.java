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
package com.skratchdot.electribe.audioplayer;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.SourceDataLine;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;

import com.skratchdot.electribe.audioplayer.util.AudioUtil;
import com.skratchdot.electribe.model.esx.Sample;
import com.skratchdot.riff.wav.RIFFWave;

public class AudioPlayer implements Runnable  {
	//private final static String ID = "com.skratchdot.electribe.audioplayer.AudioPlayer";
	public static enum LoopState { ON, OFF };
	public static enum PlayState { UNKNOWN, PLAYING, PAUSED, STOPPED };

	private static final int PLAY_BUFFER_SIZE = 4096;
	private static final int SLEEP_TIME = 1000;
	private static AudioPlayer instance = null;
	//private static Log log = LogFactory.getLog(AudioPlayer.class);

	private final Object lock = new Object();

	private Thread thread = null;
	private boolean alreadyPlayedOnce = false;
	private Object audioObject = null;
	private AudioInputStream audioInputStream;
	private AudioFormat audioFormat;
	private SourceDataLine sourceDataLine = null;
	private LoopState loopState = LoopState.OFF;
	private PlayState playState = PlayState.UNKNOWN;
	private int frameCurrent = 0;
	private int frameStart = 0;
	private int frameLoopStart = 0;
	private int frameEnd = 0;

	public AudioPlayer() {
		this.clearAllObjects();
	}
	
	/**
	 * @return the instance
	 */
	public static AudioPlayer getInstance() {
		if (instance == null) {
			instance = new AudioPlayer();
		}
		return instance;
	}
		
	private void clearAllObjects() {
		try {
			try {
				if(this.audioInputStream!=null) {
					this.audioInputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			this.alreadyPlayedOnce = false;
			this.audioObject = null;
			this.audioInputStream = null;
			this.audioFormat = null;
			this.frameCurrent = 0;
			this.frameEnd = 0;
			this.frameLoopStart = 0;
			this.frameStart = 0;
			this.loopState = LoopState.OFF;
			this.playState = PlayState.UNKNOWN;
			this.lineClose();
			this.thread = null;
		} catch(Exception e) {
			e.printStackTrace();
			this.playState = PlayState.UNKNOWN;
		}
	}

	/**
	 * @return the loopState
	 */
	public LoopState getLoopState() {
		return loopState;
	}

	/**
	 * @return the playState
	 */
	public PlayState getPlayState() {
		return playState;
	}

	private void initAllObjects(Object obj, boolean alreadyPlayedOnce) {
		try {
			AudioFormat sourceAudioFormat = null;
			AudioInputStream sourceAudioInputStream = null;
			AudioFormat targetAudioFormat = null;
			AudioInputStream targetAudioInputStream = null;
			int targetFrameStart = 0;
			int targetFrameLoopStart = 0;
			int targetFrameEnd = 0;

			// Source Audio
			if(obj instanceof File) {
				File file = (File) obj;
				if(file.isFile() && AudioUtil.isAudioFile(file)) {
					sourceAudioInputStream = AudioSystem.getAudioInputStream(file);
					sourceAudioFormat = sourceAudioInputStream.getFormat();
				}
			}
			else if(obj instanceof IAdaptable) {
				Object resource = ((IAdaptable) obj).getAdapter(IResource.class);
				if (resource != null && resource instanceof IFile) {
					IPath path = ((IFile) resource).getRawLocation();
					File file = new File(path.toOSString());
					if(file.isFile() && AudioUtil.isAudioFile(file)) {
						sourceAudioInputStream = AudioSystem.getAudioInputStream(file);
						sourceAudioFormat = sourceAudioInputStream.getFormat();
					}
				}
			}
			else if(obj instanceof Sample) {
				Sample sample = (Sample) obj;
				RIFFWave riffWave = sample.toRIFFWave();
				if(riffWave!=null) {
					sourceAudioInputStream = riffWave.toAudioInputStream();
					sourceAudioFormat = riffWave.toAudioFormat();
					targetFrameStart = sample.getStart();
					targetFrameLoopStart = sample.getLoopStart();
					targetFrameEnd = sample.getEnd();
				}
			}

			// Target Audio
			if(sourceAudioFormat!=null && sourceAudioInputStream!=null) {
				targetAudioFormat = new AudioFormat(
						AudioFormat.Encoding.PCM_SIGNED,
						sourceAudioFormat.getSampleRate(),
						16,
						sourceAudioFormat.getChannels(),
						sourceAudioFormat.getChannels()*2,
						sourceAudioFormat.getSampleRate(),
						false
					);
				targetAudioInputStream = AudioSystem.getAudioInputStream(targetAudioFormat, sourceAudioInputStream);
			}
			else {
				this.frameCurrent = 0;
				this.playState = PlayState.UNKNOWN;
				return;
			}

			// Set our audio info
			this.alreadyPlayedOnce = alreadyPlayedOnce;
			this.audioObject = obj;
			this.audioInputStream = targetAudioInputStream;
			this.audioFormat = targetAudioFormat;
			this.frameCurrent = 0;
			this.frameStart = targetFrameStart;
			this.frameLoopStart = targetFrameLoopStart;
			this.frameEnd = targetFrameEnd;
		} catch (Exception e) {
			e.printStackTrace();
			this.playState = PlayState.UNKNOWN;
		}
	}

	private void lineClose() {
		try {
			if(this.sourceDataLine!=null && this.sourceDataLine.isOpen()) {
				this.sourceDataLine.drain();
				this.sourceDataLine.stop();
				this.sourceDataLine.close();
			}
			this.sourceDataLine = null;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void lineOpen() {
		try {
			if(this.sourceDataLine==null && this.audioFormat!=null) {
				this.sourceDataLine = AudioSystem.getSourceDataLine(this.audioFormat);
				this.sourceDataLine.open(this.audioFormat);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void lineStart() {
		try {
			if(this.sourceDataLine!=null && !this.sourceDataLine.isRunning()) {
				this.sourceDataLine.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void lineStop() {
		try {
			if(this.sourceDataLine!=null && this.sourceDataLine.isRunning()) {
				this.sourceDataLine.drain();
				this.sourceDataLine.stop();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void moveToCorrectFrame() {
		try {
			// If we have invalid audio info, do nothing
			if (this.audioInputStream == null || this.audioFormat == null
					|| this.sourceDataLine == null) {
				this.playState = PlayState.UNKNOWN;
				return;
			}

			// Both looping and non-looping
			int numBytesToStart = (this.frameStart-this.frameCurrent)*this.audioFormat.getFrameSize();
			if(numBytesToStart>=0) {
				byte[] buffer = new byte[numBytesToStart];
				int numBytesSkipped = this.audioInputStream.read(buffer);
				this.frameCurrent = this.frameCurrent + (numBytesSkipped/this.audioFormat.getFrameSize());
			}

			// Only looping
			if(this.getLoopState()==LoopState.ON && this.alreadyPlayedOnce==true) {
				if(this.frameLoopStart>0 && this.frameEnd>0 && this.frameLoopStart<this.frameEnd) {
					int numBytesToLoopStart = (this.frameLoopStart-this.frameCurrent)*this.audioFormat.getFrameSize();
					if(numBytesToLoopStart>=0) {
						byte[] buffer = new byte[numBytesToLoopStart];
						int numBytesSkipped = this.audioInputStream.read(buffer);
						this.frameCurrent = this.frameCurrent + (numBytesSkipped/this.audioFormat.getFrameSize());
					}
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void pause() {
		synchronized(lock) {
			this.playState = PlayState.PAUSED;
		}
	}

	public void play(Object obj, boolean isLooping) {
		synchronized(lock) {
			try {
				// Reset our objects
				this.clearAllObjects();

				// Initialize our audio objects
				this.initAllObjects(obj, false);

				// If we made it here, set our variables, and start the thread
				if(this.thread==null) {
					// Initialize the thread
					this.thread = new Thread(this, "AudioPlayer");
					// Start the thread
					this.thread.start();
				}

				// Set our state info
				this.loopState = (isLooping?LoopState.ON:LoopState.OFF);
				this.playState = PlayState.PLAYING;

			} catch (Exception e) {
				e.printStackTrace();
				this.playState = PlayState.UNKNOWN;
			}
		}
	}

	private void playBuffer(byte[] buffer) {
		try {
			// If we have invalid audio info, do nothing
			if (this.audioInputStream == null || this.audioFormat == null
					|| this.sourceDataLine == null) {
				this.playState = PlayState.UNKNOWN;
				return;
			}

			// Read audio into buffer
			int numBytesToWrite = this.audioInputStream.read(buffer);

			// Only play until end (if end is specified)
			if(this.frameEnd>0) {
				int numBytesUntilEnd = (this.frameEnd-this.frameCurrent)*this.audioFormat.getFrameSize();
				if(numBytesToWrite>numBytesUntilEnd) {
					numBytesToWrite = numBytesUntilEnd;
				}
			}

			// We need to write some bytes
			if(numBytesToWrite>=0) {
				int numBytesWritten = this.sourceDataLine.write(buffer, 0, numBytesToWrite);
				this.frameCurrent = this.frameCurrent + (numBytesWritten/this.audioFormat.getFrameSize());
			}

			// We are not looping				
			if(this.getLoopState()==LoopState.OFF) {

				// If we didn't read anything, go ahead and stop
				if(numBytesToWrite<0) {
					this.playState = PlayState.STOPPED;
				}
				// We read bytes, check if we're at the end
				else {
					if(this.frameEnd>0 && this.frameCurrent>=this.frameEnd) {
						this.playState = PlayState.STOPPED;
					}
				}

			}

			// We are looping
			if(this.getLoopState()==LoopState.ON) {

				// We need to loop again
				if(numBytesToWrite<0 || (this.frameEnd>0 && this.frameCurrent>=this.frameEnd)) {
					this.audioInputStream.close();
					this.audioInputStream = null;
					this.initAllObjects(this.audioObject, true);
				}

			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void resume() {
		synchronized(lock) {
			this.playState = PlayState.PLAYING;
		}
	}

	@Override
	public void run() {
		try {
			byte[] buffer = new byte[PLAY_BUFFER_SIZE];

			synchronized(lock) {
				this.lineClose();
			}

			while(this.getPlayState()!=PlayState.STOPPED && this.getPlayState()!=PlayState.UNKNOWN && this.audioInputStream!=null) {
				// Make sure line is running
				synchronized(lock) {
					this.lineOpen();
					this.lineStart();
				}

				// If we're playing
				if(this.getPlayState()==PlayState.PLAYING) {
					synchronized(lock) {
						this.moveToCorrectFrame();
						this.playBuffer(buffer);
					}
				}

				// If we're stopped
				if(this.getPlayState()==PlayState.STOPPED) {
					synchronized(lock) {
						this.lineStop();
					}
				}

				// If we're paused
				while (this.getPlayState()==PlayState.PAUSED) {
					synchronized(lock) {
						this.lineStop();
					}
					try {
						Thread.sleep(SLEEP_TIME);
					} catch (InterruptedException e) {
						this.playState = PlayState.PLAYING;
					}
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			this.playState = PlayState.UNKNOWN;
		}
		synchronized(lock) {
			clearAllObjects();
		}
	}

	public void stop() {
		synchronized(lock) {
			this.playState = PlayState.STOPPED;
		}
	}


}

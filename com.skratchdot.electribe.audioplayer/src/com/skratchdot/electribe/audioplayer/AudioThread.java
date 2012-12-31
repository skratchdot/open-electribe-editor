/*******************************************************************************
 * Copyright (c) 2009-2013 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 *******************************************************************************/
package com.skratchdot.electribe.audioplayer;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;

import com.skratchdot.electribe.audioplayer.util.AudioUtil;
import com.skratchdot.electribe.model.esx.Sample;
import com.skratchdot.riff.wav.RIFFWave;

public class AudioThread implements Runnable {
	// class ID
	public final static String ID = "com.skratchdot.electribe.audioplayer.AudioThread";

	// constants
	private final int PAUSE_TIME = 1;
	private final int SLEEP_TIME = 1;
	private final int BUFFER_SIZE = 4096;

	// main variables
	private Thread thread;
	private String threadName;
	private volatile boolean isLoop = false;
	private volatile boolean isPaused = false;
	private volatile boolean isStopped = false;

	// audio objects
	private Object audioObject = null;
	private AudioInputStream audioStream;
	private AudioFormat audioFormat;
	private SourceDataLine line = null;
	private boolean isFirstLoop = true;
	private boolean isSkipping = true;
	private int frameSize = 0;
	private int frameCurrent = 0;
	private int frameStart = 0;
	private int frameLoopStart = 0;
	private int frameEnd = 0;

	public AudioThread(ThreadGroup group, String threadName,
			Object audioObject, boolean isLoop) {
		this.threadName = threadName;
		this.isLoop = isLoop;
		this.audioObject = audioObject;
		this.thread = new Thread(group, this, this.threadName);
		this.thread.start();
	}

	@Override
	public void run() {
		// System.out.println("Thread: " + threadName + "started.");
		setup();
		while (!isStopped && line != null) {
			// System.out.println("Thread: " + threadName + "looped: " +
			try {
				if (isPaused) {
					line.stop();
					Thread.sleep(PAUSE_TIME);
				} else {
					if (!line.isActive()) {
						line.start();
					}
					skipFrames();
					playFrame();
					Thread.sleep(SLEEP_TIME);
				}
			} catch (InterruptedException e) {
				handleException();
			} catch (Exception e) {
				e.printStackTrace();
				handleException();
			}
		}
		cleanup();
		// System.out.println("Thread: " + threadName + "closed.");
	}

	private void handleException() {
		// System.out.println("Thread Exception: " + threadName);
		isStopped = true;
		isPaused = false;
		if (line != null) {
			line.stop();
			line.flush();
		}
	}

	public void setPaused(boolean isPaused) {
		this.isPaused = isPaused;
	}

	public void setStopped(boolean isStopped) {
		this.isStopped = isStopped;
	}

	public void interrupt() {
		if (thread != null) {
			thread.interrupt();
		}
	}

	private void setup() {
		try {
			initInputStream();
			if (audioStream != null && audioFormat != null) {
				DataLine.Info info = new DataLine.Info(SourceDataLine.class,
						audioFormat);
				line = (SourceDataLine) AudioSystem.getLine(info);
				if (line != null) {
					line.open(audioFormat);
					line.start();
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void cleanup() {
		if (line != null) {
			line.stop();
			line.flush();
			line.close();
			line = null;
		}
		if (audioStream != null) {
			try {
				audioStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void playFrame() throws IOException, UnsupportedAudioFileException {
		if (line != null && !isSkipping) {
			int bytesToRead = Math.min(line.available(), BUFFER_SIZE);
			if (bytesToRead > 0) {
				// Only play until end (if end is specified)
				boolean isEnd = false;
				if (frameEnd > 0) {
					int numBytesUntilEnd = (frameEnd - frameCurrent)
							* frameSize;
					if (bytesToRead > numBytesUntilEnd) {
						bytesToRead = numBytesUntilEnd;
					}
					if (bytesToRead <= 0) {
						isEnd = true;
						bytesToRead = 0;
					}
				}
				byte[] data = new byte[bytesToRead];
				int bytesRead = audioStream.read(data, 0, data.length);
				if (bytesRead != -1 && !isEnd) {
					int bytesWritten = line.write(data, 0, bytesRead);
					frameCurrent = frameCurrent + (bytesWritten / frameSize);
				} else {
					if (isLoop) {
						initInputStream();
						isFirstLoop = false;
						isSkipping = true;
					} else {
						line.drain();
						isStopped = true;
						isPaused = false;
					}
				}
			}
		}
	}

	private void skipFrames() throws IOException {
		if (line != null && isSkipping) {
			int framesToSkip = 0;
			int bytesToRead = Math.min(line.available(), BUFFER_SIZE);
			if (bytesToRead > 0) {
				// calculate number of frames to skip
				if (isLoop && !isFirstLoop && frameLoopStart >= 0
						&& frameLoopStart < frameEnd) {
					framesToSkip = frameLoopStart;
				} else if (frameStart > 0) {
					framesToSkip = frameStart;
				}
				framesToSkip = framesToSkip - frameCurrent;
				if (framesToSkip > 0) {
					// calculate number of bytes to skip
					int bytesToSkip = framesToSkip * frameSize;
					bytesToRead = Math.min(bytesToRead, bytesToSkip);
					// skip the bytes
					byte[] data = new byte[bytesToRead];
					int bytesRead = audioStream.read(data, 0, data.length);
					frameCurrent = frameCurrent + (bytesRead / frameSize);
					// if we've skipped all the bytes we needed to, set our flag
					// so the next time this is called, we won't try to skip bytes
					if (bytesRead == bytesToSkip || bytesRead == -1) {
						isSkipping = false;
					}
				} else {
					isSkipping = false;
				}
			}
		}
	}

	private void initInputStream() throws UnsupportedAudioFileException,
			IOException {
		if (audioStream != null) {
			audioStream.close();
			audioStream = null;
		}
		// init some values
		frameCurrent = 0;
		frameStart = 0;
		frameLoopStart = 0;
		frameEnd = 0;
		// Source Audio
		if (audioObject instanceof File) {
			File file = (File) audioObject;
			if (file.isFile() && AudioUtil.isAudioFile(file)) {
				AudioInputStream in = AudioSystem.getAudioInputStream(file);
				AudioFormat baseFormat = in.getFormat();
				audioFormat = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED,
						baseFormat.getSampleRate(), 16,
						baseFormat.getChannels(), baseFormat.getChannels() * 2,
						baseFormat.getSampleRate(), false);
				audioStream = AudioSystem.getAudioInputStream(audioFormat, in);
			}
		} else if (audioObject instanceof IAdaptable) {
			Object resource = ((IAdaptable) audioObject)
					.getAdapter(IResource.class);
			if (resource != null && resource instanceof IFile) {
				IPath path = ((IFile) resource).getRawLocation();
				File file = new File(path.toOSString());
				if (file.isFile() && AudioUtil.isAudioFile(file)) {
					audioStream = AudioSystem.getAudioInputStream(file);
					audioFormat = audioStream.getFormat();
				}
			}
		} else if (audioObject instanceof Sample) {
			Sample sample = (Sample) audioObject;
			RIFFWave riffWave = sample.toRIFFWave();
			if (riffWave != null) {
				audioStream = riffWave.toAudioInputStream();
				audioFormat = riffWave.toAudioFormat();
				frameStart = sample.getStart();
				frameLoopStart = sample.getLoopStart();
				frameEnd = sample.getEnd();
			}
		}
		if (audioFormat != null) {
			frameSize = audioFormat.getFrameSize();
		}
	}

}

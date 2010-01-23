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
import java.io.InputStream;
import java.net.URL;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

import com.skratchdot.electribe.model.esx.SampleMono;
import com.skratchdot.electribe.model.esx.SampleStereo;

public class AudioPlayer implements Runnable, IAudioPlayerStates {
	private static int PLAY_BUFFER_SIZE = 4096;
	private static AudioPlayer instance = null;
	private static Thread thread = null;
	private Object audioIn = null;
	private AudioInputStream audioInEncoded = null;
	private AudioInputStream audioInDecoded = null;
	private AudioFormat audioFormatEncoded = null;
	private AudioFormat audioFormatDecoded = null;
	private SourceDataLine line = null;
	private LoopState loopState = null;
	private PlayState playState = null;
	private long seekByte = -1;
	private long startByte = -1;
	private long endByte = -1;

	public AudioPlayer() {
		loopState = LoopState.OFF;
		playState = PlayState.UNKNOWN;
	}

	public static AudioPlayer getInstance() {
		if (instance == null) {
			instance = new AudioPlayer();
		}
		return instance;
	}

	@Override
	public void run() {
		byte[] data = new byte[PLAY_BUFFER_SIZE];
		int nBytesRead = 0;
		long nTotalBytesRead = 0;
		Boolean stopPlaying = false;

		try {
			initAudioInEncoded(audioIn);
			initAudioInDecoded();
			initLine();
			while (!stopPlaying) {

				// If we're paused
				while (playState==PlayState.PAUSED) {
					if(line.isRunning()) {
						line.drain();
						line.stop();
					}
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				// Make sure line is running
				if(!line.isRunning()) {
					line.start();
				}
				
				// If we are seeking
				if(playState==PlayState.SEEKING) {
					initAudioInEncoded(audioIn);
					initAudioInDecoded();
					nTotalBytesRead = 0;
					playState=PlayState.PLAYING;
				}

				// If we are playing
				if(playState==PlayState.PLAYING) {
					nBytesRead = audioInDecoded.read(data, 0, data.length);
					if(nBytesRead>=0) {
						nTotalBytesRead = nTotalBytesRead+nBytesRead;
						line.write(data, 0, nBytesRead);
					}
					else if (loopState==LoopState.ON){
						initAudioInEncoded(audioIn);
						initAudioInDecoded();
						nTotalBytesRead = 0;
					}
					else if (loopState==LoopState.OFF) {
						stopPlaying = true;
					}
				}

				// If we are stopping
				if(playState==PlayState.STOPPED) {
					stopPlaying = true;
				}

			}
			closeLine();
			audioInDecoded.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(audioInDecoded != null) {
				try {
					audioInDecoded.close();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		thread = null;
	}

	private void initAudioInEncoded() {
		audioInEncoded = null;
		audioFormatEncoded = null;
	}
	private void initAudioInEncoded(Object obj) {
		try {
			if(obj instanceof File) {
				audioInEncoded = AudioSystem.getAudioInputStream((File) obj);				
			}
			else if(obj instanceof InputStream) {
				audioInEncoded = AudioSystem.getAudioInputStream((InputStream) obj);				
			}
			else if(obj instanceof URL) {
				audioInEncoded = AudioSystem.getAudioInputStream((URL) obj);				
			}
			else if(obj instanceof SampleMono) {
				audioInEncoded = ((SampleMono) obj).getAudioInputStream();
			}
			else if(obj instanceof SampleStereo) {
				audioInEncoded = ((SampleStereo) obj).getAudioInputStream();
			}
			audioFormatEncoded = audioInEncoded.getFormat();
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
			initAudioInEncoded();
		} catch (IOException e) {
			e.printStackTrace();
			initAudioInEncoded();
		}
	}

	private void initAudioInDecoded() {
		audioFormatDecoded = new AudioFormat(
			AudioFormat.Encoding.PCM_SIGNED,
			audioFormatEncoded.getSampleRate(),
			16,
			audioFormatEncoded.getChannels(),
			audioFormatEncoded.getChannels()*2,
			audioFormatEncoded.getSampleRate(),
			false
		);
		audioInDecoded = AudioSystem.getAudioInputStream(audioFormatDecoded, audioInEncoded);
	}

	private void initLine() {
		if(line!=null && line.isOpen()) {
			closeLine();
		}
		try {
			DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormatDecoded);
			line = (SourceDataLine) AudioSystem.getLine(info);
			line.open();
			line.start();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		}
	}
	
	private void closeLine() {
		if(line!=null && line.isOpen()) {
			line.drain();
			line.stop();
			line.close();
		}
	}

	
	public synchronized void audioPlay() {
		audioPlay(-1,-1);
	}
	public synchronized void audioPlay(long start, long end) {
		startByte = start;
		endByte = end;
		if(thread!=null && thread.isAlive()) {
			audioSeek(startByte);
		}
		if(thread==null) {
			thread = new Thread(this,"AudioPlayer");
			thread.start();
			playState = PlayState.PLAYING;
		}
	}
	public synchronized void audioPause() {
		playState = PlayState.PAUSED;
	}
	public synchronized void audioResume() {
		playState = PlayState.PLAYING;
	}
	public synchronized void audioStop() {
		playState = PlayState.STOPPED;		
	}
	public synchronized void audioSeek(long seekTo) {
		seekByte = seekTo;
		playState = PlayState.SEEKING;
	}

	public synchronized LoopState getLoopState() {
		return loopState;
	}

	public synchronized void setLoopState(LoopState loopState) {
		this.loopState = loopState;
	}

	public synchronized PlayState getPlayState() {
		return playState;
	}

	public synchronized void setPlayState(PlayState playState) {
		this.playState = playState;
	}

	public synchronized Object getAudioIn() {
		return audioIn;
	}

	public synchronized void setAudioIn(Object audioIn) {
		this.audioIn = audioIn;
	}

	public synchronized boolean isValidAudioInObject(Object obj) {
		try {
			if(obj instanceof File) {
				AudioSystem.getAudioInputStream((File) obj);
				return true;
			}
			else if(obj instanceof InputStream) {
				AudioSystem.getAudioInputStream((InputStream) obj);
				return true;
			}
			else if(obj instanceof URL) {
				AudioSystem.getAudioInputStream((URL) obj);
				return true;
			}
			else if(obj instanceof SampleMono) {
				if(((SampleMono) obj).getAudioInputStream()!=null)
					return true;
			}
			else if(obj instanceof SampleStereo) {
				if(((SampleStereo) obj).getAudioInputStream()!=null)
					return true;
			}
		} catch (UnsupportedAudioFileException e) {
		} catch (IOException e) {
		}
		return false;
	}

}

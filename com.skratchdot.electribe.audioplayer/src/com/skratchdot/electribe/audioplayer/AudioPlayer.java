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
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Map;

import javax.sound.sampled.Mixer;

import javazoom.jlgui.basicplayer.BasicController;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerEvent;
import javazoom.jlgui.basicplayer.BasicPlayerException;
import javazoom.jlgui.basicplayer.BasicPlayerListener;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;

import com.skratchdot.electribe.model.esx.Sample;
import com.skratchdot.riff.wav.RIFFWave;

public class AudioPlayer implements BasicPlayerListener {
	//private final static String ID = "com.skratchdot.electribe.audioplayer.AudioPlayer";
	private static AudioPlayer instance = null;
	private static BasicPlayer player = null;
    private static BasicController control = null;

    private int audioHashCode = 0;
	private boolean isLooping = false;
	private boolean isPaused = false;
	private int loopStart = 0;

    /**
	 * @return the control
	 */
	public static BasicController getControl() {
		return control;
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

	/**
	 * @return the player
	 */
	public static BasicPlayer getPlayer() {
		return player;
	}

	/**
	 * @param control the control to set
	 */
	public static void setControl(BasicController control) {
		AudioPlayer.control = control;
	}

	public AudioPlayer() {
		player = new BasicPlayer();
		control = (BasicController) player;
		player.addBasicPlayerListener(this);
	}

	/**
	 * @return the audioHashCode
	 */
	public int getAudioHashCode() {
		return audioHashCode;
	}
	
	/**
	 * @return
	 * @see javazoom.jlgui.basicplayer.BasicPlayer#getGainValue()
	 */
	public float getGainValue() {
		return player.getGainValue();
	}

	/**
	 * @return
	 * @see javazoom.jlgui.basicplayer.BasicPlayer#getLineBufferSize()
	 */
	public int getLineBufferSize() {
		return player.getLineBufferSize();
	}

	/**
	 * @return
	 * @see javazoom.jlgui.basicplayer.BasicPlayer#getLineCurrentBufferSize()
	 */
	public int getLineCurrentBufferSize() {
		return player.getLineCurrentBufferSize();
	}

	/**
	 * @return the loopStart
	 */
	public int getLoopStart() {
		return loopStart;
	}

	/**
	 * @return
	 * @see javazoom.jlgui.basicplayer.BasicPlayer#getMaximumGain()
	 */
	public float getMaximumGain() {
		return player.getMaximumGain();
	}

	/**
	 * @return
	 * @see javazoom.jlgui.basicplayer.BasicPlayer#getMinimumGain()
	 */
	public float getMinimumGain() {
		return player.getMinimumGain();
	}

	/**
	 * @param arg0
	 * @return
	 * @see javazoom.jlgui.basicplayer.BasicPlayer#getMixer(java.lang.String)
	 */
	public Mixer getMixer(String arg0) {
		return player.getMixer(arg0);
	}

	/**
	 * @return
	 * @see javazoom.jlgui.basicplayer.BasicPlayer#getMixerName()
	 */
	public String getMixerName() {
		return player.getMixerName();
	}

	/**
	 * @return
	 * @see javazoom.jlgui.basicplayer.BasicPlayer#getMixers()
	 */
	public List<?> getMixers() {
		return player.getMixers();
	}

	/**
	 * @return
	 * @see javazoom.jlgui.basicplayer.BasicPlayer#getPan()
	 */
	public float getPan() {
		return player.getPan();
	}

	/**
	 * @return
	 * @see javazoom.jlgui.basicplayer.BasicPlayer#getPrecision()
	 */
	public float getPrecision() {
		return player.getPrecision();
	}

	/**
	 * @return
	 * @see javazoom.jlgui.basicplayer.BasicPlayer#getSleepTime()
	 */
	public long getSleepTime() {
		return player.getSleepTime();
	}

	/**
	 * @return
	 * @see javazoom.jlgui.basicplayer.BasicPlayer#getStatus()
	 */
	public int getStatus() {
		return player.getStatus();
	}

	/**
	 * @return
	 * @see javazoom.jlgui.basicplayer.BasicPlayer#hasGainControl()
	 */
	public boolean hasGainControl() {
		return player.hasGainControl();
	}

	/**
	 * @return
	 * @see javazoom.jlgui.basicplayer.BasicPlayer#hasPanControl()
	 */
	public boolean hasPanControl() {
		return player.hasPanControl();
	}

	/**
	 * @param obj
	 */
	public void initAudio(Object obj) {
		try {
			if(this.getAudioHashCode()==obj.hashCode() &&
					(this.getStatus()==BasicPlayer.PLAYING ||
					this.getStatus()==BasicPlayer.PAUSED)
			) return;

			// Get the audioInputStream
			if(obj instanceof File) {
				AudioPlayer.getControl().open((File) obj);
			}
			else if(obj instanceof InputStream) {
				AudioPlayer.getControl().open((InputStream) obj);
			}
			else if(obj instanceof URL) {
				AudioPlayer.getControl().open((URL) obj);
			}
			else if(obj instanceof Sample) {
				Sample sample = (Sample) obj;
				RIFFWave riffWave = sample.toRIFFWave();
				AudioPlayer.getControl().open(riffWave);
			}
			else if(obj instanceof IAdaptable) {
				Object resource = ((IAdaptable) obj).getAdapter(IResource.class);
				if (resource != null && resource instanceof IFile) {
					IPath path = ((IFile) resource).getRawLocation();
					File file = new File(path.toOSString());
					AudioPlayer.getControl().open(file);
				}
				else {
					return;
				}
			}
			else {
				return;
			}

			// If we've gotten here, then we were successful
			this.setAudioHashCode(obj.hashCode());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return the isLooping
	 */
	public boolean isLooping() {
		return isLooping;
	}

	/**
	 * @return the isPaused
	 */
	public boolean isPaused() {
		return isPaused;
	}

	/**
	 * @param inputStream
	 * @throws BasicPlayerException
	 * @see javazoom.jlgui.basicplayer.BasicController#open(java.io.InputStream)
	 */
	public void open(InputStream inputStream) throws BasicPlayerException {
		control.open(inputStream);
	}

	/**
	 * Open callback, stream is ready to play.
	 * 
	 * properties map includes audio format dependant features such as bitrate,
	 * duration, frequency, channels, number of frames, vbr flag, ...
	 * 
	 * @param stream
	 *            could be File, URL or InputStream
	 * @param properties
	 *            audio stream properties.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void opened(Object stream, Map properties) {
	}

	/**
	 * @throws BasicPlayerException
	 * @see javazoom.jlgui.basicplayer.BasicPlayer#pause()
	 */
	public void pause() throws BasicPlayerException {
		player.pause();
	}

	/**
	 * @throws BasicPlayerException
	 * @see javazoom.jlgui.basicplayer.BasicPlayer#play()
	 */
	public void play() throws BasicPlayerException {
		player.play();
	}

	/**
	 * * Progress callback while playing.
	 * 
	 * This method is called severals time per seconds while playing. properties
	 * map includes audio format features such as instant bitrate, microseconds
	 * position, current frame number, ...
	 * 
	 * @param bytesread
	 *            from encoded stream.
	 * @param microseconds
	 *            elapsed (<b>reseted after a seek !</b>).
	 * @param pcmdata
	 *            PCM samples.
	 * @param properties
	 *            audio stream parameters.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void progress(int bytesread, long microseconds, byte[] pcmdata, Map properties) {
	}

	/**
	 * @throws BasicPlayerException
	 * @see javazoom.jlgui.basicplayer.BasicPlayer#resume()
	 */
	public void resume() throws BasicPlayerException {
		player.resume();
	}

	/**
	 * @param arg0
	 * @return
	 * @throws BasicPlayerException
	 * @see javazoom.jlgui.basicplayer.BasicPlayer#seek(long)
	 */
	public long seek(long arg0) throws BasicPlayerException {
		return player.seek(arg0);
	}

	/**
	 * @param audioHashCode the audioHashCode to set
	 */
	public void setAudioHashCode(int audioHashCode) {
		this.audioHashCode = audioHashCode;
	}

	/**
	 * A handle to the BasicPlayer, plugins may control the player through the
	 * controller (play, stop, ...)
	 * 
	 * @param controller
	 *            : a handle to the player
	 */
	@Override
	public void setController(BasicController controller) {
	}

	/**
	 * @param arg0
	 * @throws BasicPlayerException
	 * @see javazoom.jlgui.basicplayer.BasicPlayer#setGain(double)
	 */
	public void setGain(double arg0) throws BasicPlayerException {
		player.setGain(arg0);
	}

	/**
	 * @param arg0
	 * @see javazoom.jlgui.basicplayer.BasicPlayer#setLineBufferSize(int)
	 */
	public void setLineBufferSize(int arg0) {
		player.setLineBufferSize(arg0);
	}

	/**
	 * @param isLooping the isLooping to set
	 */
	public void setLooping(boolean isLooping) {
		this.isLooping = isLooping;
	}

	/**
	 * @param loopStart the loopStart to set
	 */
	public void setLoopStart(int loopStart) {
		this.loopStart = loopStart;
	}

	/**
	 * @param arg0
	 * @see javazoom.jlgui.basicplayer.BasicPlayer#setMixerName(java.lang.String)
	 */
	public void setMixerName(String arg0) {
		player.setMixerName(arg0);
	}

	/**
	 * @param arg0
	 * @throws BasicPlayerException
	 * @see javazoom.jlgui.basicplayer.BasicPlayer#setPan(double)
	 */
	public void setPan(double arg0) throws BasicPlayerException {
		player.setPan(arg0);
	}

	/**
	 * @param isPaused the isPaused to set
	 */
	public void setPaused(boolean isPaused) {
		this.isPaused = isPaused;
	}

	/**
	 * @param player the player to set
	 */
	public void setPlayer(BasicPlayer player) {
		AudioPlayer.player = player;
	}

	/**
	 * @param arg0
	 * @see javazoom.jlgui.basicplayer.BasicPlayer#setSleepTime(long)
	 */
	public void setSleepTime(long arg0) {
		player.setSleepTime(arg0);
	}

	/**
	 * Notification callback for basicplayer events such as opened, eom ...
	 * 
	 * @param event
	 */
	@Override
	public void stateUpdated(BasicPlayerEvent event) {
	}

	/**
	 * @throws BasicPlayerException
	 * @see javazoom.jlgui.basicplayer.BasicPlayer#stop()
	 */
	public void stop() throws BasicPlayerException {
		player.stop();
	}

}

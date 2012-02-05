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
package com.skratchdot.electribe.fileexplorer.views;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

import javazoom.spi.mpeg.sampled.file.MpegAudioFileFormat;
import javazoom.spi.vorbis.sampled.file.VorbisAudioFileFormat;

import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;

public class FileExplorerPropertySource implements IPropertySource {

	private Map<String, Object> properties;
	private Map<String, Object> propertyNames;
	private Map<String, Object> propertyCategories;
	private Map<String, Object> propertyDescriptions;
	private Map<String, Object> propertyIsDisplayed;
	private String currentCategory;

	public FileExplorerPropertySource(File file) {
		properties = new HashMap<String, Object>();
		propertyNames = new HashMap<String, Object>();
		propertyCategories = new HashMap<String, Object>();
		propertyDescriptions = new HashMap<String, Object>();
		propertyIsDisplayed = new HashMap<String, Object>();
		currentCategory = "";

		// File Info
		try {
			this.addFileInfo(file);
		} catch (IOException e) {
			// e.printStackTrace();
		}

		// Info for audio files
		try {
			AudioFileFormat baseFileFormat = AudioSystem.getAudioFileFormat(file);
			AudioFormat baseFormat = baseFileFormat.getFormat();

			// MP3
			if(baseFileFormat instanceof MpegAudioFileFormat) {
				this.addMp3Info(baseFileFormat, baseFormat);
			}
			// OGG
			else if(baseFileFormat instanceof VorbisAudioFileFormat) {
				this.addOggInfo(baseFileFormat, baseFormat);
			}
			// AIFC, AIFF, AU, SND, or WAVE
			else {
				this.addGeneralAudioInfo(baseFileFormat, baseFormat);
			}

		} catch (UnsupportedAudioFileException e) {
			// e.printStackTrace();
		} catch (IOException e) {
			// e.printStackTrace();
		}
	
	}

	public Object getEditableValue() {
		return null;
	}

	public IPropertyDescriptor[] getPropertyDescriptors() {
		List<PropertyDescriptor> descriptors = new ArrayList<PropertyDescriptor>();

		for (String key : properties.keySet()) {
			if(this.getPropertyIsDisplayed(key)) {
				PropertyDescriptor descriptor = new PropertyDescriptor(key, this.getPropertyName(key));
				descriptor.setCategory(this.getPropertyCategory(key));
				descriptor.setDescription(this.getPropertyDescription(key));
				descriptor.setAlwaysIncompatible(true);
				descriptors.add(descriptor);
			}
		}

		return (IPropertyDescriptor[]) descriptors.toArray(new IPropertyDescriptor[0]);
	}

	public Object getPropertyValue(Object id) {
		return properties.get(id);
	}

	public boolean isPropertySet(Object id) {
		// TODO Auto-generated method stub
		return false;
	}

	public void resetPropertyValue(Object id) {
		// TODO Auto-generated method stub
	
	}

	public void setPropertyValue(Object id, Object value) {
		// TODO Auto-generated method stub
	
	}

	public void addPropertyKey(String key, String name, Object value, String category, String description) {
		properties.put(key, value);
		propertyNames.put(key, name);
		propertyCategories.put(key, category);
		propertyDescriptions.put(key, description);
		propertyIsDisplayed.put(key, true);
	}

	public String getPropertyName(String key) {
		Object obj;
		obj = propertyNames.get(key);
		if(obj==null)
			return key;
		else
			return (String) obj;
	}

	public String getPropertyCategory(String key) {
		Object obj;
		obj = propertyCategories.get(key);
		if(obj==null)
			return key;
		else
			return (String) obj;
	}

	public String getPropertyDescription(String key) {
		Object obj;
		obj = propertyDescriptions.get(key);
		if(obj==null)
			return key;
		else
			return (String) obj;		
	}
	
	public boolean getPropertyIsDisplayed(String key) {
		if(propertyIsDisplayed.get(key)!=null)
			return true;
		else
			return false;
	}
	
	public void addFileInfo(File file) throws IOException {
		currentCategory = "File Info";
		this.addPropertyKey("file.path", "Path", file.getCanonicalPath(), currentCategory, "The path of the file or directory");
		this.addPropertyKey("file.name", "Name", FileExplorerUtil.getFileName(file), currentCategory, "The name of the file or directory");
		this.addPropertyKey("file.type", "Type", FileExplorerUtil.getFileType(file), currentCategory, "The file or directory type");
		this.addPropertyKey("file.size", "Size", FileExplorerUtil.getFileSize(file), currentCategory, "The size of the file");
		this.addPropertyKey("file.lastmodified", "Last Modified", FileExplorerUtil.getFileDate(file), currentCategory, "The date the file was last modified");
	}
	
	public void addGeneralAudioInfo(AudioFileFormat baseFileFormat, AudioFormat baseFormat) {
		// General Audio Info
		currentCategory = "General Audio Info";
		this.addPropertyKey("type", "Type", baseFileFormat.getType(), currentCategory, "");
		this.addPropertyKey("encoding", "Encoding", baseFormat.getEncoding(), currentCategory, "");
		this.addPropertyKey("channels", "Channels", baseFormat.getChannels(), currentCategory, "");
		this.addPropertyKey("frameRate", "Frame Rate", baseFormat.getFrameRate(), currentCategory, "");
		this.addPropertyKey("frameSize", "Frame Size", baseFormat.getFrameSize(), currentCategory, "");
		this.addPropertyKey("sampleRate", "Sample Rate", baseFormat.getSampleRate(), currentCategory, "");
		this.addPropertyKey("sampleSizeInBits", "Sample Size In Bits", baseFormat.getSampleSizeInBits(), currentCategory, "");
	}

	public void addMp3Info(AudioFileFormat baseFileFormat, AudioFormat baseFormat) {
		Map<String, Object> tempProperties = new HashMap<String, Object>();
		tempProperties.putAll(baseFormat.properties());
		tempProperties.putAll(baseFileFormat.properties());

		// MP3 Info
		currentCategory = "MP3 Info";
		this.addPropertyKey("duration", "Duration", tempProperties.get("duration"), currentCategory, "duration in microseconds.");
		this.addPropertyKey("title", "Title", tempProperties.get("title"), currentCategory, "Title of the mp3");
		this.addPropertyKey("author", "Artist", tempProperties.get("author"), currentCategory, "Name of the mp3's artist");
		this.addPropertyKey("album", "Album", tempProperties.get("album"), currentCategory, "Name of the mp3's album");
		this.addPropertyKey("date", "Year", tempProperties.get("date"), currentCategory, "The year of the recording or release of the mp3");
		this.addPropertyKey("comment", "Comment", tempProperties.get("comment"), currentCategory, "The mp3 comment");
		this.addPropertyKey("copyright", "Copyright", tempProperties.get("copyright"), currentCategory, "The copyright message");
		this.addPropertyKey("mp3.id3tag.genre", "Genre", tempProperties.get("mp3.id3tag.genre"), currentCategory, "The genre of the mp3");
		this.addPropertyKey("mp3.id3tag.track", "Track", tempProperties.get("mp3.id3tag.track"), currentCategory, "Track info");

		// MP3 Extended Info
		currentCategory = "MP3 Info (Extended)";
		this.addPropertyKey("mp3.version.mpeg", "MPEG Version", tempProperties.get("mp3.version.mpeg"), currentCategory, "mpeg version : 1,2 or 2.5");
		this.addPropertyKey("mp3.version.layer", "Layer Version", tempProperties.get("mp3.version.layer"), currentCategory, "layer version 1, 2 or 3");
		this.addPropertyKey("mp3.version.encoding", "MPEG Encoding", tempProperties.get("mp3.version.encoding"), currentCategory, "mpeg encoding : MPEG1, MPEG2-LSF, MPEG2.5-LSF");
		this.addPropertyKey("mp3.channels", "Channels", tempProperties.get("mp3.channels"), currentCategory, "number of channels 1 : mono, 2 : stereo.");
		this.addPropertyKey("mp3.frequency.hz", "Sample Rate", tempProperties.get("mp3.frequency.hz"), currentCategory, "sampling rate in hz");
		this.addPropertyKey("mp3.bitrate.nominal.bps", "Bitrate (bps)", tempProperties.get("mp3.bitrate.nominal.bps"), currentCategory, "nominal bitrate in bps");
		this.addPropertyKey("mp3.length.bytes", "Length (Bytes)", tempProperties.get("mp3.length.bytes"), currentCategory, "length in bytes");
		this.addPropertyKey("mp3.length.frames", "Length (Frames)", tempProperties.get("mp3.length.frames"), currentCategory, "length in frames");
		this.addPropertyKey("mp3.framesize.bytes", "Framesize (bytes)", tempProperties.get("mp3.framesize.bytes"), currentCategory, "framesize of the first frame. framesize is not constant for VBR streams.");
		this.addPropertyKey("mp3.framerate.fps", "Framerate (in fps)", tempProperties.get("mp3.framerate.fps"), currentCategory, "framerate in frames per seconds");
		this.addPropertyKey("mp3.header.pos", "Header Position", tempProperties.get("mp3.header.pos"), currentCategory, "position of first audio header (or ID3v2 size)");
		this.addPropertyKey("mp3.vbr", "VBR?", tempProperties.get("mp3.vbr"), currentCategory, "Does the mp3 use a variable bitrate?");
		this.addPropertyKey("mp3.vbr.scale", "VBR Scale", tempProperties.get("mp3.vbr.scale"), currentCategory, "VBR scale");
		this.addPropertyKey("mp3.crc", "CRC?", tempProperties.get("mp3.crc"), currentCategory, "CRC flag");
		this.addPropertyKey("mp3.original", "Original?", tempProperties.get("mp3.original"), currentCategory, "Is the mp3 original?");
		this.addPropertyKey("mp3.copyright", "Copyright?", tempProperties.get("mp3.copyright"), currentCategory, "Does the mp3 have a copyright?");
		this.addPropertyKey("mp3.padding", "Padding?", tempProperties.get("mp3.padding"), currentCategory, "Does the mp3 contain padding?");
		this.addPropertyKey("mp3.mode", "Mode", tempProperties.get("mp3.mode"), currentCategory, "The mp3 mode: 0:STEREO, 1:JOINT_STEREO, 2:DUAL_CHANNEL, or 3:SINGLE_CHANNEL");
	}
	
	public void addOggInfo(AudioFileFormat baseFileFormat, AudioFormat baseFormat) {
		Map<String, Object> tempProperties = new HashMap<String, Object>();
		tempProperties.putAll(baseFormat.properties());
		tempProperties.putAll(baseFileFormat.properties());

		// OGG Info
		currentCategory = "OGG Info";
		this.addPropertyKey("duration", "Duration", tempProperties.get("duration"), currentCategory, "duration in microseconds");
		this.addPropertyKey("title", "title", tempProperties.get("title"), currentCategory, "Title of the stream");
		this.addPropertyKey("author", "author", tempProperties.get("author"), currentCategory, "Name of the artist of the stream");
		this.addPropertyKey("album", "album", tempProperties.get("album"), currentCategory, "Name of the album of the stream");
		this.addPropertyKey("date", "date", tempProperties.get("date"), currentCategory, "The date (year) of the recording or release of the stream");
		this.addPropertyKey("copyright", "copyright", tempProperties.get("copyright"), currentCategory, "Copyright message of the stream");
		this.addPropertyKey("comment", "comment", tempProperties.get("comment"), currentCategory, "Comment of the stream");

		// OGG Info (Extended)
		currentCategory = "OGG Info (Extended)";
		this.addPropertyKey("ogg.length.bytes", "Duration", tempProperties.get("ogg.length.bytes"), currentCategory, "length in bytes");
		this.addPropertyKey("ogg.bitrate.min.bps", "Duration", tempProperties.get("ogg.bitrate.min.bps"), currentCategory, "minimum bitrate");
		this.addPropertyKey("ogg.bitrate.nominal.bps", "Duration", tempProperties.get("ogg.bitrate.nominal.bps"), currentCategory, "nominal bitrate");
		this.addPropertyKey("ogg.bitrate.max.bps", "Duration", tempProperties.get("ogg.bitrate.max.bps"), currentCategory, "maximum bitrate");
		this.addPropertyKey("ogg.channels", "Duration", tempProperties.get("ogg.channels"), currentCategory, "number of channels 1 : mono, 2 : stereo");
		this.addPropertyKey("ogg.frequency.hz", "Duration", tempProperties.get("ogg.frequency.hz"), currentCategory, "sampling rate in hz");
		this.addPropertyKey("ogg.version", "Duration", tempProperties.get("ogg.version"), currentCategory, "version");
		this.addPropertyKey("ogg.serial", "Duration", tempProperties.get("ogg.serial"), currentCategory, "serial number");
		this.addPropertyKey("ogg.comment.track", "Duration", tempProperties.get("ogg.comment.track"), currentCategory, "track number");
		this.addPropertyKey("ogg.comment.genre", "Duration", tempProperties.get("ogg.comment.genre"), currentCategory, "genre field");
		this.addPropertyKey("ogg.comment.encodedby", "Duration", tempProperties.get("ogg.comment.encodedby"), currentCategory, "encoded by field");
	
	}

}

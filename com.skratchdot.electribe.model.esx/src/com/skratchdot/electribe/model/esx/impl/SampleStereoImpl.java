/**
 * Copyright (c) 2009-2010 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 *
 * $Id$
 */
package com.skratchdot.electribe.model.esx.impl;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.ecore.EClass;

import com.skratchdot.electribe.model.esx.EsxFactory;
import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.PlayLevel;
import com.skratchdot.electribe.model.esx.SampleNumber;
import com.skratchdot.electribe.model.esx.SampleStereo;
import com.skratchdot.electribe.model.esx.SampleTune;
import com.skratchdot.electribe.model.esx.StretchStep;
import com.skratchdot.electribe.model.esx.util.EsxException;
import com.skratchdot.electribe.model.esx.util.EsxUtil;
import com.skratchdot.electribe.model.esx.util.ExtendedByteBuffer;
import com.skratchdot.riff.wav.ChunkData;
import com.skratchdot.riff.wav.ChunkFormat;
import com.skratchdot.riff.wav.ChunkSampler;
import com.skratchdot.riff.wav.CompressionCode;
import com.skratchdot.riff.wav.RIFFWave;
import com.skratchdot.riff.wav.SampleLoop;
import com.skratchdot.riff.wav.WavFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sample Stereo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SampleStereoImpl extends SampleImpl implements SampleStereo {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected SampleStereoImpl() {
		super();
	}

	/**
	 * @param file A valid Esx File
	 * @throws EsxException
	 */
	public SampleStereoImpl(File file) throws EsxException {
		super(file);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsxPackage.Literals.SAMPLE_STEREO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void initHeader(byte[] b) {
		this.initHeader(b, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void initHeader(byte[] b, int sampleNumber) {
		ExtendedByteBuffer in = new ExtendedByteBuffer(b);

		// Set the original .esx file sample number
		this.setSampleNumberOriginal(SampleNumber.get(sampleNumber));

		// bytes 0~7
		byte[] newSampleName = new byte[8];
		in.getBytes(newSampleName, 0, 8);
		this.setName(new String(newSampleName));
		// bytes 8~11
		this.setOffsetChannel1Start(in.getInt());
		// bytes 12~15
		this.setOffsetChannel1End(in.getInt());
		// bytes 16~19
		this.setOffsetChannel2Start(in.getInt());
		// bytes 20~23
		this.setOffsetChannel2End(in.getInt());
		// bytes 24~27
		this.setStart(in.getInt());
		// bytes 28~31
		this.setEnd(in.getInt());
		// bytes 32~35
		this.setSampleRate(in.getInt());
		// bytes 36~37
		SampleTune newSampleTune = EsxFactory.eINSTANCE.createSampleTune();
		newSampleTune.setCurrentValueFromShort(in.getShort());
		this.setSampleTune(newSampleTune);
		// byte 38
		this.setPlayLevel(PlayLevel.get(in.getByte()));
		// byte 39
		this.setUnknownByte1(in.getByte());
		// byte 40
		this.setStretchStep(StretchStep.get(in.getByte()));
		// byte 41
		this.setUnknownByte2(in.getByte());
		// byte 42
		this.setUnknownByte3(in.getByte());
		// byte 43
		this.setUnknownByte4(in.getByte());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void initOffsetChannel1(byte[] b) {
		ExtendedByteBuffer in = new ExtendedByteBuffer(b);

		// Get number of sample frames
		int newNumberOfSampleFrames = ((in.limit() - 16) / 2);
		if(newNumberOfSampleFrames>0) {
			// Store number of sample frames
			this.setNumberOfSampleFrames(newNumberOfSampleFrames);
			// Ignore first 16 bytes
			in.getLong();
			in.getLong();
			// Declare temp byte[]
			byte[] newAudioDataChannel = new byte[newNumberOfSampleFrames * 2];
			in.getBytes(newAudioDataChannel);
			// Store audio data
			this.setAudioDataChannel1(newAudioDataChannel);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void initOffsetChannel2(byte[] b) {
		ExtendedByteBuffer in = new ExtendedByteBuffer(b);

		// Get number of sample frames
		int newNumberOfSampleFrames = ((in.limit() - 16) / 2);
		if(newNumberOfSampleFrames>0) {
			// Store number of sample frames
			this.setNumberOfSampleFrames(newNumberOfSampleFrames);
			// Ignore first 16 bytes
			in.getLong();
			in.getLong();
			// Declare temp byte[]
			byte[] newAudioDataChannel = new byte[newNumberOfSampleFrames * 2];
			in.getBytes(newAudioDataChannel);
			// Store audio data
			this.setAudioDataChannel2(newAudioDataChannel);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public byte[] toHeaderByteArray() {
		ExtendedByteBuffer buf = new ExtendedByteBuffer(EsxUtil.CHUNKSIZE_SAMPLE_HEADER_STEREO);
		// bytes 0~7
		buf.putBytes(EsxUtil.getByteArrayWithLength(this.getName(), 8, (byte) 0x00), 0, 8);
		// bytes 8~11
		buf.putInt(this.getOffsetChannel1Start());
		// bytes 12~15
		buf.putInt(this.getOffsetChannel1End());
		// bytes 16~19
		buf.putInt(this.getOffsetChannel2Start());
		// bytes 20~23
		buf.putInt(this.getOffsetChannel2End());
		// bytes 24~27
		buf.putInt(this.getStart());
		// bytes 28~31
		buf.putInt(this.getEnd());
		// bytes 32~35
		buf.putInt(this.getSampleRate());
		// bytes 36~37
		buf.putShort(this.getSampleTune().getShortFromCurrentValue());
		// byte 38
		buf.putUnsignedByte(this.getPlayLevel().getValue());
		// byte 39
		buf.putByte(this.getUnknownByte1());
		// byte 40
		buf.putUnsignedByte(this.getStretchStep().getValue());
		// byte 41
		buf.putByte(this.getUnknownByte2());
		// byte 42
		buf.putByte(this.getUnknownByte3());
		// byte 43
		buf.putByte(this.getUnknownByte4());
		return buf.array();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public byte[] toOffsetChannel1ByteArray() {
		byte[] audioData = this.getAudioDataChannel1();
		ExtendedByteBuffer buf = new ExtendedByteBuffer(audioData.length+16);
		buf.putInt(0x80007FFF);
		buf.putInt(this.getOffsetChannel1Start());
		buf.putInt(this.getOffsetChannel1End());
		buf.putUnsignedByte(this.getSampleNumberCurrent().getValue());
		buf.putUnsignedByte(0); // denotes mono / channel 1
		buf.putShort((short) 0xffff);
		buf.putBytes(audioData);
		return buf.array();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public byte[] toOffsetChannel2ByteArray() {
		byte[] audioData = this.getAudioDataChannel2();
		ExtendedByteBuffer buf = new ExtendedByteBuffer(audioData.length+16);
		buf.putInt(0x80007FFF);
		buf.putInt(this.getOffsetChannel2Start());
		buf.putInt(this.getOffsetChannel2End());
		buf.putUnsignedByte(this.getSampleNumberCurrent().getValue());
		buf.putUnsignedByte(0); // denotes mono / channel 1
		buf.putShort((short) 0xffff);
		buf.putBytes(audioData);
		return buf.array();
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.impl.SampleImpl#export(java.io.File)
	 */
	@Override
	public void export(File file) throws IOException {
		if(this.isEmpty()) return; // Do nothing if this is an empty sample

		RIFFWave riffWave = WavFactory.eINSTANCE.createRIFFWave();

		// format chunk
		ChunkFormat chunkFormat = WavFactory.eINSTANCE.createChunkFormat();
		chunkFormat.setCompressionCode(CompressionCode.COMPRESSION_CODE_1);
		chunkFormat.setCompressionCodeValue(CompressionCode.COMPRESSION_CODE_1_VALUE);
		chunkFormat.setNumberOfChannels(2);
		chunkFormat.setSampleRate((long)this.getSampleRate());
		chunkFormat.setAverageBytesPerSecond(chunkFormat.getSampleRate()*chunkFormat.getNumberOfChannels()*2);
		chunkFormat.setBlockAlign(chunkFormat.getNumberOfChannels()*2);
		chunkFormat.setSignificantBitsPerSample(16);
		riffWave.getChunks().add(chunkFormat);

		// data chunk
		ChunkData chunkData = WavFactory.eINSTANCE.createChunkData();
		byte[] left = this.getAudioDataChannel1();
		byte[] right = this.getAudioDataChannel2();
		byte[] both = new byte[left.length + right.length];
		try {
			for (int i = 0, j = 0; i<both.length && j<left.length; i = i + 4, j = j+2) {
				both[i] = left[j + 1];
				both[i + 1] = left[j];
				both[i + 2] = right[j + 1];
				both[i + 3] = right[j];
			}
		} catch(Exception e) {}
		chunkData.setSampleDataOriginal(both);
		riffWave.getChunks().add(chunkData);

		// sampler chunk
		if(this.isLoop()) {
			ChunkSampler chunkSampler = WavFactory.eINSTANCE.createChunkSampler();
			chunkSampler.setManufacturer((long)0x42);
			chunkSampler.setProduct((long)0x71);
			chunkSampler.setSamplePeriod((long)1000000000/this.getSampleRate());
			chunkSampler.setMidiUnityNote((long)0x3C);
			chunkSampler.setMidiPitchFraction((long)0);
			chunkSampler.setSmpteFormat((long)0);
			chunkSampler.setSmpteOffset((long)0);

			SampleLoop sampleLoop = WavFactory.eINSTANCE.createSampleLoop();
			sampleLoop.setCuePointID((long)0);
			sampleLoop.setType((long)0);
			sampleLoop.setStart((long)this.getLoopStart());
			sampleLoop.setEnd((long)this.getEnd());
			sampleLoop.setFraction((long)0);
			sampleLoop.setPlayCount((long)0);
			chunkSampler.getSampleLoops().add(sampleLoop);

			riffWave.getChunks().add(chunkSampler);
		}
		
		// Write the file
		riffWave.write(file);
	}

} //SampleStereoImpl

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
import com.skratchdot.electribe.model.esx.util.EsxRandomAccess;
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
	 * @param in A valid Esx file in EsxRandomAccess form
	 * @param stereoSampleNumber A valid stereo sample number 0-127
	 * @throws EsxException
	 * @throws IOException
	 */
	public SampleStereoImpl(EsxRandomAccess in, int stereoSampleNumber) throws EsxException, IOException {
		init();

		// Stop immediately if we are passed an invalid stereoSampleNumber
		if (stereoSampleNumber >= EsxUtil.NUM_SAMPLES_STEREO || stereoSampleNumber < 0)
			throw new EsxException("Invalid stereoSampleNumber: " + stereoSampleNumber);

		// Jump to the start of stereoSampleNumber's header data
		in.seek(EsxUtil.ADDR_SAMPLE_HEADER_STEREO + (stereoSampleNumber * EsxUtil.CHUNKSIZE_SAMPLE_HEADER_STEREO));

		// Set the original .esx file sample number
		this.setSampleNumberOriginal(SampleNumber.get(stereoSampleNumber+EsxUtil.NUM_SAMPLES_MONO));

		// bytes 0~7
		byte[] newSampleName = new byte[8];
		in.read(newSampleName, 0, 8);
		this.setName(new String(newSampleName));

		// bytes 8~11
		this.setOffsetChannel1Start(in.readInt());
		// bytes 12~15
		this.setOffsetChannel1End(in.readInt());
		// bytes 16~19
		this.setOffsetChannel2Start(in.readInt());
		// bytes 20~23
		this.setOffsetChannel2End(in.readInt());
		// bytes 24~27
		this.setStart(in.readInt());
		// bytes 28~31
		this.setEnd(in.readInt());
		// bytes 32~35
		this.setSampleRate(in.readInt());
		// bytes 36~37
		SampleTune newSampleTune = EsxFactory.eINSTANCE.createSampleTune();
		newSampleTune.setCurrentValueFromShort(in.readShort());
		this.setSampleTune(newSampleTune);
		// byte 38
		this.setPlayLevel(PlayLevel.get(in.readByte()));
		// byte 39
		this.setUnknownByte1(in.readByte());
		// byte 40
		this.setStretchStep(StretchStep.get(in.readByte()));
		// byte 41
		this.setUnknownByte2(in.readByte());
		// byte 42
		this.setUnknownByte3(in.readByte());
		// byte 43
		this.setUnknownByte4(in.readByte());

		// Determine if there is a valid sample to read in
		int offset1Size = this.getOffsetChannel1End() - this.getOffsetChannel1Start();
		int offset2Size = this.getOffsetChannel2End() - this.getOffsetChannel2Start();
		if (offset1Size == offset2Size
				&& offset1Size > 0
				&& offset2Size > 0
				&& this.getOffsetChannel1Start() != 0xFFFFFFFF
				&& this.getOffsetChannel1End() != 0xFFFFFFFF
				&& this.getOffsetChannel2Start() != 0xFFFFFFFF
				&& this.getOffsetChannel2End() != 0xFFFFFFFF) {

			// Declare temp byte[]
			byte[] newAudioDataChannel;

			// Get number of sample frames
			int newNumberOfSampleFrames = ((offset1Size - 16) / 2);
			this.setNumberOfSampleFrames(newNumberOfSampleFrames);

			// Read in audioDataChannel1
			newAudioDataChannel = new byte[newNumberOfSampleFrames * 2];
			in.seek(EsxUtil.ADDR_SAMPLE_DATA + this.getOffsetChannel1Start() + 16);
			in.readFully(newAudioDataChannel, 0, newAudioDataChannel.length);
			this.setAudioDataChannel1(newAudioDataChannel);

			// Read in audioDataChannel2
			newAudioDataChannel = new byte[newNumberOfSampleFrames * 2];
			in.seek(EsxUtil.ADDR_SAMPLE_DATA + this.getOffsetChannel2Start() + 16);
			in.readFully(newAudioDataChannel, 0, newAudioDataChannel.length);
			this.setAudioDataChannel2(newAudioDataChannel);

		}


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

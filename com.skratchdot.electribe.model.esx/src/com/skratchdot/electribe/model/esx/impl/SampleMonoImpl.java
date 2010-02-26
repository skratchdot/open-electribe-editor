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

import org.eclipse.emf.ecore.EClass;

import com.skratchdot.electribe.model.esx.EsxFactory;
import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.PlayLevel;
import com.skratchdot.electribe.model.esx.SampleMono;
import com.skratchdot.electribe.model.esx.SampleNumber;
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
 * An implementation of the model object '<em><b>Sample Mono</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SampleMonoImpl extends SampleImpl implements SampleMono {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected SampleMonoImpl() {
		super();
	}

	/**
	 * @param file A valid Esx file
	 * @throws EsxException
	 */
	public SampleMonoImpl(File file) throws EsxException {
		super(file);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsxPackage.Literals.SAMPLE_MONO;
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
		this.setStart(in.getInt());
		// bytes 20~23
		this.setEnd(in.getInt());
		// bytes 24~27
		this.setLoopStart(in.getInt());
		// bytes 28~31
		this.setSampleRate(in.getInt());
		// bytes 32~33
		SampleTune newSampleTune = EsxFactory.eINSTANCE.createSampleTune();
		newSampleTune.setCurrentValueFromShort(in.getShort());
		this.setSampleTune(newSampleTune);
		// byte 34
		this.setPlayLevel(PlayLevel.get(in.getByte()));
		// byte 35
		this.setUnknownByte1(in.getByte());
		// byte 36
		this.setStretchStep(StretchStep.get(in.getByte()));
		// byte 37
		this.setUnknownByte2(in.getByte());
		// byte 38
		this.setUnknownByte3(in.getByte());
		// byte 39
		this.setUnknownByte4(in.getByte());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void initOffsetChannelBoth(byte[] b) {
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
			this.setAudioDataChannel2(newAudioDataChannel);
			// Ignore last 2 bytes
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void initSliceArray(byte[] b) {
		if(b!=null && b.length>0) {
			this.setSliceArray(b);
		}
		else {
			this.setSliceArray(EsxUtil.getByteArrayWithLength("", EsxUtil.CHUNKSIZE_SLICE_DATA, (byte) 0x00));
		}

	/*
	 * 			// Read in slice info
			byte[] newSliceArray = new byte[EsxUtil.CHUNKSIZE_SLICE_DATA];
			in.seek(EsxUtil.ADDR_SLICE_DATA + (monoSampleNumber * EsxUtil.CHUNKSIZE_SLICE_DATA));
			for (int i = 0; i < EsxUtil.CHUNKSIZE_SLICE_DATA; i++) {
				newSliceArray[i] = in.readByte();
			}
			this.setSliceArray(newSliceArray);

	 */
	
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public byte[] toHeaderByteArray() {
		ExtendedByteBuffer buf = new ExtendedByteBuffer(EsxUtil.CHUNKSIZE_SAMPLE_HEADER_MONO);
		// bytes 0~7
		buf.putBytes(EsxUtil.getByteArrayWithLength(this.getName(), 8, (byte) 0x00), 0, 8);
		// bytes 8~11
		buf.putInt(this.getOffsetChannel1Start());
		// bytes 12~15
		buf.putInt(this.getOffsetChannel1End());
		// bytes 16~19
		buf.putInt(this.getStart());
		// bytes 20~23
		buf.putInt(this.getEnd());
		// bytes 24~27
		buf.putInt(this.getLoopStart());
		// bytes 28~31
		buf.putInt(this.getSampleRate());
		// bytes 32~33
		buf.putShort(this.getSampleTune().getShortFromCurrentValue());
		// byte 34
		buf.putUnsignedByte(this.getPlayLevel().getValue());
		// byte 35
		buf.putByte(this.getUnknownByte1());
		// byte 36
		buf.putUnsignedByte(this.getStretchStep().getValue());
		// byte 37
		buf.putByte(this.getUnknownByte2());
		// byte 38
		buf.putByte(this.getUnknownByte3());
		// byte 39
		buf.putByte(this.getUnknownByte4());
		return buf.array();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public byte[] toOffsetChannelBothByteArray() {
		byte[] audioData = this.getAudioDataChannelBoth();
		ExtendedByteBuffer buf = new ExtendedByteBuffer(audioData.length+18);
		buf.putInt(0x80007FFF);
		buf.putInt(this.getOffsetChannel1Start());
		buf.putInt(this.getOffsetChannel1End());
		buf.putUnsignedByte(this.getSampleNumberCurrent().getValue());
		buf.putUnsignedByte(0); // denotes mono / channel 1
		buf.putShort((short) 0xffff);
		buf.putBytes(audioData);
		buf.putBytes(this.getAudioDataLoopStart());
		return buf.array();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public byte[] toSliceByteArray() {
		ExtendedByteBuffer buf = new ExtendedByteBuffer(EsxUtil.CHUNKSIZE_SLICE_DATA);
		// Write slice info
		if(this.getSliceArray()!=null) {
			buf.putBytes(this.getSliceArray());
		}
		else {
			buf.putBytes(EsxUtil.getByteArrayWithLength("", EsxUtil.CHUNKSIZE_SLICE_DATA, (byte) 0x00));
		}
		return buf.array();
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.impl.SampleImpl#toRIFFWave()
	 */
	@Override
	public RIFFWave toRIFFWave() {
		if(this.isEmpty()) return null; // Do nothing if this is an empty sample

		RIFFWave riffWave = WavFactory.eINSTANCE.createRIFFWave();

		// format chunk
		ChunkFormat chunkFormat = WavFactory.eINSTANCE.createChunkFormat();
		chunkFormat.setCompressionCode(CompressionCode.COMPRESSION_CODE_1);
		chunkFormat.setCompressionCodeValue(CompressionCode.COMPRESSION_CODE_1_VALUE);
		chunkFormat.setNumberOfChannels(1);
		chunkFormat.setSampleRate((long)this.getSampleRate());
		chunkFormat.setAverageBytesPerSecond(chunkFormat.getSampleRate()*chunkFormat.getNumberOfChannels()*2);
		chunkFormat.setBlockAlign(chunkFormat.getNumberOfChannels()*2);
		chunkFormat.setSignificantBitsPerSample(16);
		riffWave.getChunks().add(chunkFormat);

		// data chunk
		ChunkData chunkData = WavFactory.eINSTANCE.createChunkData();
		byte[] sampleData = new byte[this.getAudioDataChannel1().length];
		try {
			for (int i = 0; i<sampleData.length; i = i + 2) {
				sampleData[i] = this.getAudioDataChannel1()[i + 1];
				sampleData[i + 1] = this.getAudioDataChannel1()[i];
			}
		} catch(Exception e) {}
		chunkData.setSampleDataOriginal(sampleData);
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

		return riffWave;
	}

} //SampleMonoImpl

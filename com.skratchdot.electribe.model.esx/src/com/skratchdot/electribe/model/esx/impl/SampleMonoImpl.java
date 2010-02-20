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
import java.nio.ByteBuffer;

import org.eclipse.emf.ecore.EClass;

import com.skratchdot.electribe.model.esx.EsxFactory;
import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.PlayLevel;
import com.skratchdot.electribe.model.esx.SampleMono;
import com.skratchdot.electribe.model.esx.SampleNumber;
import com.skratchdot.electribe.model.esx.SampleTune;
import com.skratchdot.electribe.model.esx.StretchStep;
import com.skratchdot.electribe.model.esx.util.EsxException;
import com.skratchdot.electribe.model.esx.util.EsxRandomAccess;
import com.skratchdot.electribe.model.esx.util.EsxUtil;
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
	 * @param in A valid Esx file in EsxRandomAccess form
	 * @param monoSampleNumber A valid mono sample number 0-255
	 * @throws EsxException
	 * @throws IOException
	 */
	public SampleMonoImpl(EsxRandomAccess in, int monoSampleNumber) throws EsxException, IOException {
		init();

		// Stop immediately if we are passed an invalid monoSampleNumber
		if (monoSampleNumber >= EsxUtil.NUM_SAMPLES_MONO || monoSampleNumber < 0)
			throw new EsxException("Invalid monoSampleNumber: " + monoSampleNumber);

		// Jump to the start of monoSampleNumber's header data
		in.seek(EsxUtil.ADDR_SAMPLE_HEADER_MONO + (monoSampleNumber * EsxUtil.CHUNKSIZE_SAMPLE_HEADER_MONO));

		// Set the original .esx file sample number
		this.setSampleNumberOriginal(SampleNumber.get(monoSampleNumber));

		// bytes 0~7
		byte[] newSampleName = new byte[8];
		in.read(newSampleName, 0, 8);
		this.setName(new String(newSampleName));

		// bytes 8~11
		this.setOffsetChannel1Start(in.readInt());
		// bytes 12~15
		this.setOffsetChannel1End(in.readInt());
		// bytes 16~19
		this.setStart(in.readInt());
		// bytes 20~23
		this.setEnd(in.readInt());
		// bytes 24~27
		this.setLoopStart(in.readInt());
		// bytes 28~31
		this.setSampleRate(in.readInt());
		// bytes 32~33
		SampleTune newSampleTune = EsxFactory.eINSTANCE.createSampleTune();
		newSampleTune.setCurrentValueFromShort(in.readShort());
		this.setSampleTune(newSampleTune);
		// byte 34
		this.setPlayLevel(PlayLevel.get(in.readByte()));
		// byte 35
		this.setUnknownByte1(in.readByte());
		// byte 36
		this.setStretchStep(StretchStep.get(in.readByte()));
		// byte 37
		this.setUnknownByte2(in.readByte());
		// byte 38
		this.setUnknownByte3(in.readByte());
		// byte 39
		this.setUnknownByte4(in.readByte());

		// Determine if there is a valid sample to read in
		int offset1Size = this.getOffsetChannel1End() - this.getOffsetChannel1Start();
		if (offset1Size > 0
				&& this.getOffsetChannel1Start() != 0xFFFFFFFF
				&& this.getOffsetChannel1End() != 0xFFFFFFFF) {

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

			// Read in audioDataChannel2 (same as audioDataChannel1)
			this.setAudioDataChannel2(newAudioDataChannel);

			// Read in slice info
			byte[] newSliceArray = new byte[EsxUtil.CHUNKSIZE_SLICE_DATA];
			in.seek(EsxUtil.ADDR_SLICE_DATA + (monoSampleNumber * EsxUtil.CHUNKSIZE_SLICE_DATA));
			for (int i = 0; i < EsxUtil.CHUNKSIZE_SLICE_DATA; i++) {
				newSliceArray[i] = in.readByte();
			}
			this.setSliceArray(newSliceArray);
		}

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
	public byte[] toHeaderByteArray() {
		ByteBuffer buf = ByteBuffer.allocate(EsxUtil.CHUNKSIZE_SAMPLE_HEADER_MONO);
		// bytes 0~7
		buf.put(EsxUtil.getByteArrayWithLength(this.getName(), 8, (byte) 0x00), 0, 8);
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
		buf.put((byte) this.getPlayLevel().getValue());
		// byte 35
		buf.put(this.getUnknownByte1());
		// byte 36
		buf.put((byte) this.getStretchStep().getValue());
		// byte 37
		buf.put(this.getUnknownByte2());
		// byte 38
		buf.put(this.getUnknownByte3());
		// byte 39
		buf.put(this.getUnknownByte4());
		return buf.array();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public byte[] toSliceByteArray() {
		ByteBuffer buf = ByteBuffer.allocate(EsxUtil.CHUNKSIZE_SLICE_DATA);
		// Write slice info
		if(this.getSliceArray()!=null) {
			buf.put(this.getSliceArray());
		}
		else {
			buf.put(EsxUtil.getByteArrayWithLength("", EsxUtil.CHUNKSIZE_SLICE_DATA, (byte) 0x00));
		}
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

		// Write the file
		riffWave.write(file);
	}

} //SampleMonoImpl

/**
 * Copyright (c) 2010 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Initial modeling finished using information provided by:
 * 	http://www.sonicspot.com/guide/wavefiles.html
 * 
 * Contributors:
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 *
 * $Id$
 */
package com.skratchdot.riff.wav.impl;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.UnsupportedAudioFileException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.skratchdot.riff.wav.Channel;
import com.skratchdot.riff.wav.ChunkCue;
import com.skratchdot.riff.wav.ChunkData;
import com.skratchdot.riff.wav.ChunkDataList;
import com.skratchdot.riff.wav.ChunkDataListTypeID;
import com.skratchdot.riff.wav.ChunkDataListTypeLabel;
import com.skratchdot.riff.wav.ChunkDataListTypeLabeledText;
import com.skratchdot.riff.wav.ChunkDataListTypeNote;
import com.skratchdot.riff.wav.ChunkFact;
import com.skratchdot.riff.wav.ChunkFormat;
import com.skratchdot.riff.wav.ChunkInstrument;
import com.skratchdot.riff.wav.ChunkPlayList;
import com.skratchdot.riff.wav.ChunkSampler;
import com.skratchdot.riff.wav.ChunkSilent;
import com.skratchdot.riff.wav.ChunkTypeID;
import com.skratchdot.riff.wav.ChunkUnknown;
import com.skratchdot.riff.wav.ChunkWaveList;
import com.skratchdot.riff.wav.CompressionCode;
import com.skratchdot.riff.wav.CuePoint;
import com.skratchdot.riff.wav.ParseChunkException;
import com.skratchdot.riff.wav.RIFFWave;
import com.skratchdot.riff.wav.SMPTEFormat;
import com.skratchdot.riff.wav.SampleData16Bit;
import com.skratchdot.riff.wav.SampleData8Bit;
import com.skratchdot.riff.wav.SampleLoop;
import com.skratchdot.riff.wav.SampleLoopType;
import com.skratchdot.riff.wav.Segment;
import com.skratchdot.riff.wav.WavFactory;
import com.skratchdot.riff.wav.WavPackage;
import com.skratchdot.riff.wav.util.ExtendedByteBuffer;
import com.skratchdot.riff.wav.util.RiffWaveException;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class WavFactoryImpl extends EFactoryImpl implements WavFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static WavFactory init() {
		try {
			WavFactory theWavFactory = (WavFactory)EPackage.Registry.INSTANCE.getEFactory("http:///com/skratchdot/riff/wav/RIFFWave.ecore"); 
			if (theWavFactory != null) {
				return theWavFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WavFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public WavFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WavPackage.RIFF_WAVE: return createRIFFWave();
			case WavPackage.CHANNEL: return createChannel();
			case WavPackage.CHUNK_CUE: return createChunkCue();
			case WavPackage.CHUNK_DATA: return createChunkData();
			case WavPackage.CHUNK_DATA_LIST: return createChunkDataList();
			case WavPackage.CHUNK_DATA_LIST_TYPE_LABEL: return createChunkDataListTypeLabel();
			case WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT: return createChunkDataListTypeLabeledText();
			case WavPackage.CHUNK_DATA_LIST_TYPE_NOTE: return createChunkDataListTypeNote();
			case WavPackage.CHUNK_FACT: return createChunkFact();
			case WavPackage.CHUNK_FORMAT: return createChunkFormat();
			case WavPackage.CHUNK_INSTRUMENT: return createChunkInstrument();
			case WavPackage.CHUNK_PLAY_LIST: return createChunkPlayList();
			case WavPackage.CHUNK_SAMPLER: return createChunkSampler();
			case WavPackage.CHUNK_SILENT: return createChunkSilent();
			case WavPackage.CHUNK_UNKNOWN: return createChunkUnknown();
			case WavPackage.CHUNK_WAVE_LIST: return createChunkWaveList();
			case WavPackage.CUE_POINT: return createCuePoint();
			case WavPackage.PARSE_CHUNK_EXCEPTION: return createParseChunkException();
			case WavPackage.SAMPLE_DATA8_BIT: return createSampleData8Bit();
			case WavPackage.SAMPLE_DATA16_BIT: return createSampleData16Bit();
			case WavPackage.SAMPLE_LOOP: return createSampleLoop();
			case WavPackage.SEGMENT: return createSegment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case WavPackage.CHUNK_DATA_LIST_TYPE_ID:
				return createChunkDataListTypeIDFromString(eDataType, initialValue);
			case WavPackage.CHUNK_TYPE_ID:
				return createChunkTypeIDFromString(eDataType, initialValue);
			case WavPackage.COMPRESSION_CODE:
				return createCompressionCodeFromString(eDataType, initialValue);
			case WavPackage.SAMPLE_LOOP_TYPE:
				return createSampleLoopTypeFromString(eDataType, initialValue);
			case WavPackage.SMPTE_FORMAT:
				return createSMPTEFormatFromString(eDataType, initialValue);
			case WavPackage.AUDIO_FILE_FORMAT:
				return createAudioFileFormatFromString(eDataType, initialValue);
			case WavPackage.AUDIO_FORMAT:
				return createAudioFormatFromString(eDataType, initialValue);
			case WavPackage.AUDIO_INPUT_STREAM:
				return createAudioInputStreamFromString(eDataType, initialValue);
			case WavPackage.EXCEPTION:
				return createExceptionFromString(eDataType, initialValue);
			case WavPackage.EXTENDED_BYTE_BUFFER:
				return createExtendedByteBufferFromString(eDataType, initialValue);
			case WavPackage.FILE:
				return createFileFromString(eDataType, initialValue);
			case WavPackage.IO_EXCEPTION:
				return createIOExceptionFromString(eDataType, initialValue);
			case WavPackage.RIFF_WAVE_EXCEPTION:
				return createRiffWaveExceptionFromString(eDataType, initialValue);
			case WavPackage.UNSIGNED_SHORT:
				return createUnsignedShortFromString(eDataType, initialValue);
			case WavPackage.UNSIGNED_INT:
				return createUnsignedIntFromString(eDataType, initialValue);
			case WavPackage.UNSUPPORTED_AUDIO_FILE_EXCEPTION:
				return createUnsupportedAudioFileExceptionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case WavPackage.CHUNK_DATA_LIST_TYPE_ID:
				return convertChunkDataListTypeIDToString(eDataType, instanceValue);
			case WavPackage.CHUNK_TYPE_ID:
				return convertChunkTypeIDToString(eDataType, instanceValue);
			case WavPackage.COMPRESSION_CODE:
				return convertCompressionCodeToString(eDataType, instanceValue);
			case WavPackage.SAMPLE_LOOP_TYPE:
				return convertSampleLoopTypeToString(eDataType, instanceValue);
			case WavPackage.SMPTE_FORMAT:
				return convertSMPTEFormatToString(eDataType, instanceValue);
			case WavPackage.AUDIO_FILE_FORMAT:
				return convertAudioFileFormatToString(eDataType, instanceValue);
			case WavPackage.AUDIO_FORMAT:
				return convertAudioFormatToString(eDataType, instanceValue);
			case WavPackage.AUDIO_INPUT_STREAM:
				return convertAudioInputStreamToString(eDataType, instanceValue);
			case WavPackage.EXCEPTION:
				return convertExceptionToString(eDataType, instanceValue);
			case WavPackage.EXTENDED_BYTE_BUFFER:
				return convertExtendedByteBufferToString(eDataType, instanceValue);
			case WavPackage.FILE:
				return convertFileToString(eDataType, instanceValue);
			case WavPackage.IO_EXCEPTION:
				return convertIOExceptionToString(eDataType, instanceValue);
			case WavPackage.RIFF_WAVE_EXCEPTION:
				return convertRiffWaveExceptionToString(eDataType, instanceValue);
			case WavPackage.UNSIGNED_SHORT:
				return convertUnsignedShortToString(eDataType, instanceValue);
			case WavPackage.UNSIGNED_INT:
				return convertUnsignedIntToString(eDataType, instanceValue);
			case WavPackage.UNSUPPORTED_AUDIO_FILE_EXCEPTION:
				return convertUnsupportedAudioFileExceptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RIFFWave createRIFFWave() {
		RIFFWaveImpl riffWave = new RIFFWaveImpl();
		return riffWave;
	}

	/**
	 * @param file
	 *            a valid RIFF Wave file
	 * @return Returns a RIFFWave object if successful, else throws a
	 *         UnsupportedType Exception
	 * @throws RiffWaveException
	 */
	public RIFFWave createRIFFWave(File file) throws RiffWaveException {
		RIFFWaveImpl riffWave = new RIFFWaveImpl(file);
		return riffWave;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Channel createChannel() {
		ChannelImpl channel = new ChannelImpl();
		return channel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ChunkCue createChunkCue() {
		ChunkCueImpl chunkCue = new ChunkCueImpl();
		return chunkCue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ChunkData createChunkData() {
		ChunkDataImpl chunkData = new ChunkDataImpl();
		return chunkData;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ChunkDataList createChunkDataList() {
		ChunkDataListImpl chunkDataList = new ChunkDataListImpl();
		return chunkDataList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ChunkDataListTypeLabel createChunkDataListTypeLabel() {
		ChunkDataListTypeLabelImpl chunkDataListTypeLabel = new ChunkDataListTypeLabelImpl();
		return chunkDataListTypeLabel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ChunkDataListTypeLabeledText createChunkDataListTypeLabeledText() {
		ChunkDataListTypeLabeledTextImpl chunkDataListTypeLabeledText = new ChunkDataListTypeLabeledTextImpl();
		return chunkDataListTypeLabeledText;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ChunkDataListTypeNote createChunkDataListTypeNote() {
		ChunkDataListTypeNoteImpl chunkDataListTypeNote = new ChunkDataListTypeNoteImpl();
		return chunkDataListTypeNote;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ChunkFact createChunkFact() {
		ChunkFactImpl chunkFact = new ChunkFactImpl();
		return chunkFact;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ChunkFormat createChunkFormat() {
		ChunkFormatImpl chunkFormat = new ChunkFormatImpl();
		return chunkFormat;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ChunkInstrument createChunkInstrument() {
		ChunkInstrumentImpl chunkInstrument = new ChunkInstrumentImpl();
		return chunkInstrument;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ChunkPlayList createChunkPlayList() {
		ChunkPlayListImpl chunkPlayList = new ChunkPlayListImpl();
		return chunkPlayList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ChunkSampler createChunkSampler() {
		ChunkSamplerImpl chunkSampler = new ChunkSamplerImpl();
		return chunkSampler;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ChunkSilent createChunkSilent() {
		ChunkSilentImpl chunkSilent = new ChunkSilentImpl();
		return chunkSilent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ChunkUnknown createChunkUnknown() {
		ChunkUnknownImpl chunkUnknown = new ChunkUnknownImpl();
		return chunkUnknown;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ChunkWaveList createChunkWaveList() {
		ChunkWaveListImpl chunkWaveList = new ChunkWaveListImpl();
		return chunkWaveList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CuePoint createCuePoint() {
		CuePointImpl cuePoint = new CuePointImpl();
		return cuePoint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ParseChunkException createParseChunkException() {
		ParseChunkExceptionImpl parseChunkException = new ParseChunkExceptionImpl();
		return parseChunkException;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SampleData8Bit createSampleData8Bit() {
		SampleData8BitImpl sampleData8Bit = new SampleData8BitImpl();
		return sampleData8Bit;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SampleData16Bit createSampleData16Bit() {
		SampleData16BitImpl sampleData16Bit = new SampleData16BitImpl();
		return sampleData16Bit;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SampleLoop createSampleLoop() {
		SampleLoopImpl sampleLoop = new SampleLoopImpl();
		return sampleLoop;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Segment createSegment() {
		SegmentImpl segment = new SegmentImpl();
		return segment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ChunkDataListTypeID createChunkDataListTypeIDFromString(
			EDataType eDataType, String initialValue) {
		ChunkDataListTypeID result = ChunkDataListTypeID.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChunkDataListTypeIDToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ChunkTypeID createChunkTypeIDFromString(EDataType eDataType,
			String initialValue) {
		ChunkTypeID result = ChunkTypeID.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChunkTypeIDToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CompressionCode createCompressionCodeFromString(EDataType eDataType,
			String initialValue) {
		CompressionCode result = CompressionCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompressionCodeToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SampleLoopType createSampleLoopTypeFromString(EDataType eDataType,
			String initialValue) {
		SampleLoopType result = SampleLoopType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSampleLoopTypeToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SMPTEFormat createSMPTEFormatFromString(EDataType eDataType,
			String initialValue) {
		SMPTEFormat result = SMPTEFormat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSMPTEFormatToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioFileFormat createAudioFileFormatFromString(EDataType eDataType, String initialValue) {
		return (AudioFileFormat)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAudioFileFormatToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioFormat createAudioFormatFromString(EDataType eDataType, String initialValue) {
		return (AudioFormat)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAudioFormatToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioInputStream createAudioInputStreamFromString(EDataType eDataType, String initialValue) {
		return (AudioInputStream)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAudioInputStreamToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Exception createExceptionFromString(EDataType eDataType,
			String initialValue) {
		return (Exception)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExceptionToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedByteBuffer createExtendedByteBufferFromString(EDataType eDataType, String initialValue) {
		return (ExtendedByteBuffer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExtendedByteBufferToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFileFromString(EDataType eDataType, String initialValue) {
		return (File)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFileToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOException createIOExceptionFromString(EDataType eDataType, String initialValue) {
		return (IOException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIOExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiffWaveException createRiffWaveExceptionFromString(EDataType eDataType, String initialValue) {
		return (RiffWaveException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRiffWaveExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createUnsignedShortFromString(EDataType eDataType,
			String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnsignedShortToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Long createUnsignedIntFromString(EDataType eDataType,
			String initialValue) {
		return (Long)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnsignedIntToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsupportedAudioFileException createUnsupportedAudioFileExceptionFromString(EDataType eDataType, String initialValue) {
		return (UnsupportedAudioFileException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnsupportedAudioFileExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public WavPackage getWavPackage() {
		return (WavPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WavPackage getPackage() {
		return WavPackage.eINSTANCE;
	}

} // WavFactoryImpl

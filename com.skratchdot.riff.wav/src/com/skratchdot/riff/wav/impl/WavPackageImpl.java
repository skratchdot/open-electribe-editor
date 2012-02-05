/**
 * Copyright (c) 2009, 2012 SKRATCHDOT.COM
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
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import com.skratchdot.riff.wav.Channel;
import com.skratchdot.riff.wav.Chunk;
import com.skratchdot.riff.wav.ChunkCue;
import com.skratchdot.riff.wav.ChunkData;
import com.skratchdot.riff.wav.ChunkDataList;
import com.skratchdot.riff.wav.ChunkDataListType;
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
import com.skratchdot.riff.wav.SampleData;
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
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WavPackageImpl extends EPackageImpl implements WavPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riffWaveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chunkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chunkCueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chunkDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chunkDataListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chunkDataListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chunkDataListTypeLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chunkDataListTypeLabeledTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chunkDataListTypeNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chunkFactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chunkFormatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chunkInstrumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chunkPlayListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chunkSamplerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chunkSilentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chunkUnknownEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chunkWaveListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cuePointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parseChunkExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sampleDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sampleData8BitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sampleData16BitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sampleLoopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass segmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum chunkDataListTypeIDEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum chunkTypeIDEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compressionCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sampleLoopTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum smpteFormatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType audioFileFormatEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType audioFormatEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType audioInputStreamEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType exceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType extendedByteBufferEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fileEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ioExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType riffWaveExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unsignedShortEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unsignedIntEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unsupportedAudioFileExceptionEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.skratchdot.riff.wav.WavPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WavPackageImpl() {
		super(eNS_URI, WavFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link WavPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WavPackage init() {
		if (isInited) return (WavPackage)EPackage.Registry.INSTANCE.getEPackage(WavPackage.eNS_URI);

		// Obtain or create and register package
		WavPackageImpl theWavPackage = (WavPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WavPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WavPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theWavPackage.createPackageContents();

		// Initialize created meta-data
		theWavPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWavPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WavPackage.eNS_URI, theWavPackage);
		return theWavPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRIFFWave() {
		return riffWaveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIFFWave_Chunks() {
		return (EReference)riffWaveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIFFWave_ParseChunkExceptions() {
		return (EReference)riffWaveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRIFFWave_Size() {
		return (EAttribute)riffWaveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannel() {
		return channelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannel_SampleData() {
		return (EReference)channelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChunk() {
		return chunkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunk_BlockAlignedSize() {
		return (EAttribute)chunkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunk_Size() {
		return (EAttribute)chunkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunk_ChunkTypeID() {
		return (EAttribute)chunkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunk_ChunkTypeIDValue() {
		return (EAttribute)chunkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChunkCue() {
		return chunkCueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkCue_NumberOfCuePoints() {
		return (EAttribute)chunkCueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChunkCue_CuePoints() {
		return (EReference)chunkCueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChunkData() {
		return chunkDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChunkData_Channels() {
		return (EReference)chunkDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkData_SampleDataOriginal() {
		return (EAttribute)chunkDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChunkDataList() {
		return chunkDataListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkDataList_TypeID() {
		return (EAttribute)chunkDataListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChunkDataList_DataListChunks() {
		return (EReference)chunkDataListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChunkDataListType() {
		return chunkDataListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkDataListType_CuePointID() {
		return (EAttribute)chunkDataListTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkDataListType_Text() {
		return (EAttribute)chunkDataListTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkDataListType_TextAsString() {
		return (EAttribute)chunkDataListTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChunkDataListTypeLabel() {
		return chunkDataListTypeLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChunkDataListTypeLabeledText() {
		return chunkDataListTypeLabeledTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkDataListTypeLabeledText_SampleLength() {
		return (EAttribute)chunkDataListTypeLabeledTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkDataListTypeLabeledText_PurposeID() {
		return (EAttribute)chunkDataListTypeLabeledTextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkDataListTypeLabeledText_Country() {
		return (EAttribute)chunkDataListTypeLabeledTextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkDataListTypeLabeledText_Language() {
		return (EAttribute)chunkDataListTypeLabeledTextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkDataListTypeLabeledText_Dialect() {
		return (EAttribute)chunkDataListTypeLabeledTextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkDataListTypeLabeledText_CodePage() {
		return (EAttribute)chunkDataListTypeLabeledTextEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChunkDataListTypeNote() {
		return chunkDataListTypeNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChunkFact() {
		return chunkFactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkFact_FormatDependantData() {
		return (EAttribute)chunkFactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChunkFormat() {
		return chunkFormatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkFormat_CompressionCode() {
		return (EAttribute)chunkFormatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkFormat_CompressionCodeValue() {
		return (EAttribute)chunkFormatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkFormat_NumberOfChannels() {
		return (EAttribute)chunkFormatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkFormat_SampleRate() {
		return (EAttribute)chunkFormatEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkFormat_AverageBytesPerSecond() {
		return (EAttribute)chunkFormatEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkFormat_BlockAlign() {
		return (EAttribute)chunkFormatEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkFormat_SignificantBitsPerSample() {
		return (EAttribute)chunkFormatEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkFormat_NumberOfExtraFormatBytes() {
		return (EAttribute)chunkFormatEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkFormat_ExtraFormatBytes() {
		return (EAttribute)chunkFormatEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChunkInstrument() {
		return chunkInstrumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkInstrument_UnshiftedNote() {
		return (EAttribute)chunkInstrumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkInstrument_FineTune() {
		return (EAttribute)chunkInstrumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkInstrument_Gain() {
		return (EAttribute)chunkInstrumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkInstrument_LowNote() {
		return (EAttribute)chunkInstrumentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkInstrument_HighNote() {
		return (EAttribute)chunkInstrumentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkInstrument_LowVelocity() {
		return (EAttribute)chunkInstrumentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkInstrument_HighVelocity() {
		return (EAttribute)chunkInstrumentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChunkPlayList() {
		return chunkPlayListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkPlayList_NumberOfSegments() {
		return (EAttribute)chunkPlayListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChunkPlayList_Segments() {
		return (EReference)chunkPlayListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChunkSampler() {
		return chunkSamplerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkSampler_Manufacturer() {
		return (EAttribute)chunkSamplerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkSampler_Product() {
		return (EAttribute)chunkSamplerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkSampler_SamplePeriod() {
		return (EAttribute)chunkSamplerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkSampler_MidiUnityNote() {
		return (EAttribute)chunkSamplerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkSampler_MidiPitchFraction() {
		return (EAttribute)chunkSamplerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkSampler_SmpteFormat() {
		return (EAttribute)chunkSamplerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkSampler_SmpteOffset() {
		return (EAttribute)chunkSamplerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkSampler_NumberOfSampleLoops() {
		return (EAttribute)chunkSamplerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkSampler_SamplerDataSize() {
		return (EAttribute)chunkSamplerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkSampler_SamplerData() {
		return (EAttribute)chunkSamplerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChunkSampler_SampleLoops() {
		return (EReference)chunkSamplerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChunkSilent() {
		return chunkSilentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkSilent_NumberOfSilentSamples() {
		return (EAttribute)chunkSilentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChunkUnknown() {
		return chunkUnknownEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkUnknown_Data() {
		return (EAttribute)chunkUnknownEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkUnknown_UnknownChunkTypeIdValue() {
		return (EAttribute)chunkUnknownEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkUnknown_WavRandomAccessFilePointer() {
		return (EAttribute)chunkUnknownEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChunkWaveList() {
		return chunkWaveListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChunkWaveList_AlternatingSilentAndDataChunks() {
		return (EReference)chunkWaveListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCuePoint() {
		return cuePointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCuePoint_CuePointID() {
		return (EAttribute)cuePointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCuePoint_Position() {
		return (EAttribute)cuePointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCuePoint_DataChunkID() {
		return (EAttribute)cuePointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCuePoint_ChunkStart() {
		return (EAttribute)cuePointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCuePoint_BlockStart() {
		return (EAttribute)cuePointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCuePoint_SampleOffset() {
		return (EAttribute)cuePointEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParseChunkException() {
		return parseChunkExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParseChunkException_Exception() {
		return (EAttribute)parseChunkExceptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParseChunkException_StringCause() {
		return (EAttribute)parseChunkExceptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParseChunkException_StringMessage() {
		return (EAttribute)parseChunkExceptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParseChunkException_StringStackTrace() {
		return (EAttribute)parseChunkExceptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSampleData() {
		return sampleDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSampleData8Bit() {
		return sampleData8BitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampleData8Bit_Sample() {
		return (EAttribute)sampleData8BitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSampleData16Bit() {
		return sampleData16BitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampleData16Bit_Sample() {
		return (EAttribute)sampleData16BitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSampleLoop() {
		return sampleLoopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampleLoop_CuePointID() {
		return (EAttribute)sampleLoopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampleLoop_Type() {
		return (EAttribute)sampleLoopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampleLoop_Start() {
		return (EAttribute)sampleLoopEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampleLoop_End() {
		return (EAttribute)sampleLoopEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampleLoop_Fraction() {
		return (EAttribute)sampleLoopEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampleLoop_PlayCount() {
		return (EAttribute)sampleLoopEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSegment() {
		return segmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSegment_CuePointID() {
		return (EAttribute)segmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSegment_LengthInSamples() {
		return (EAttribute)segmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSegment_NumberOfRepeats() {
		return (EAttribute)segmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getChunkDataListTypeID() {
		return chunkDataListTypeIDEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getChunkTypeID() {
		return chunkTypeIDEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompressionCode() {
		return compressionCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSampleLoopType() {
		return sampleLoopTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSMPTEFormat() {
		return smpteFormatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAudioFileFormat() {
		return audioFileFormatEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAudioFormat() {
		return audioFormatEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAudioInputStream() {
		return audioInputStreamEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getException() {
		return exceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExtendedByteBuffer() {
		return extendedByteBufferEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFile() {
		return fileEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIOException() {
		return ioExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRiffWaveException() {
		return riffWaveExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnsignedShort() {
		return unsignedShortEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnsignedInt() {
		return unsignedIntEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnsupportedAudioFileException() {
		return unsupportedAudioFileExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WavFactory getWavFactory() {
		return (WavFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		riffWaveEClass = createEClass(RIFF_WAVE);
		createEReference(riffWaveEClass, RIFF_WAVE__CHUNKS);
		createEReference(riffWaveEClass, RIFF_WAVE__PARSE_CHUNK_EXCEPTIONS);
		createEAttribute(riffWaveEClass, RIFF_WAVE__SIZE);

		channelEClass = createEClass(CHANNEL);
		createEReference(channelEClass, CHANNEL__SAMPLE_DATA);

		chunkEClass = createEClass(CHUNK);
		createEAttribute(chunkEClass, CHUNK__BLOCK_ALIGNED_SIZE);
		createEAttribute(chunkEClass, CHUNK__SIZE);
		createEAttribute(chunkEClass, CHUNK__CHUNK_TYPE_ID);
		createEAttribute(chunkEClass, CHUNK__CHUNK_TYPE_ID_VALUE);

		chunkCueEClass = createEClass(CHUNK_CUE);
		createEAttribute(chunkCueEClass, CHUNK_CUE__NUMBER_OF_CUE_POINTS);
		createEReference(chunkCueEClass, CHUNK_CUE__CUE_POINTS);

		chunkDataEClass = createEClass(CHUNK_DATA);
		createEReference(chunkDataEClass, CHUNK_DATA__CHANNELS);
		createEAttribute(chunkDataEClass, CHUNK_DATA__SAMPLE_DATA_ORIGINAL);

		chunkDataListEClass = createEClass(CHUNK_DATA_LIST);
		createEAttribute(chunkDataListEClass, CHUNK_DATA_LIST__TYPE_ID);
		createEReference(chunkDataListEClass, CHUNK_DATA_LIST__DATA_LIST_CHUNKS);

		chunkDataListTypeEClass = createEClass(CHUNK_DATA_LIST_TYPE);
		createEAttribute(chunkDataListTypeEClass, CHUNK_DATA_LIST_TYPE__CUE_POINT_ID);
		createEAttribute(chunkDataListTypeEClass, CHUNK_DATA_LIST_TYPE__TEXT);
		createEAttribute(chunkDataListTypeEClass, CHUNK_DATA_LIST_TYPE__TEXT_AS_STRING);

		chunkDataListTypeLabelEClass = createEClass(CHUNK_DATA_LIST_TYPE_LABEL);

		chunkDataListTypeLabeledTextEClass = createEClass(CHUNK_DATA_LIST_TYPE_LABELED_TEXT);
		createEAttribute(chunkDataListTypeLabeledTextEClass, CHUNK_DATA_LIST_TYPE_LABELED_TEXT__SAMPLE_LENGTH);
		createEAttribute(chunkDataListTypeLabeledTextEClass, CHUNK_DATA_LIST_TYPE_LABELED_TEXT__PURPOSE_ID);
		createEAttribute(chunkDataListTypeLabeledTextEClass, CHUNK_DATA_LIST_TYPE_LABELED_TEXT__COUNTRY);
		createEAttribute(chunkDataListTypeLabeledTextEClass, CHUNK_DATA_LIST_TYPE_LABELED_TEXT__LANGUAGE);
		createEAttribute(chunkDataListTypeLabeledTextEClass, CHUNK_DATA_LIST_TYPE_LABELED_TEXT__DIALECT);
		createEAttribute(chunkDataListTypeLabeledTextEClass, CHUNK_DATA_LIST_TYPE_LABELED_TEXT__CODE_PAGE);

		chunkDataListTypeNoteEClass = createEClass(CHUNK_DATA_LIST_TYPE_NOTE);

		chunkFactEClass = createEClass(CHUNK_FACT);
		createEAttribute(chunkFactEClass, CHUNK_FACT__FORMAT_DEPENDANT_DATA);

		chunkFormatEClass = createEClass(CHUNK_FORMAT);
		createEAttribute(chunkFormatEClass, CHUNK_FORMAT__COMPRESSION_CODE);
		createEAttribute(chunkFormatEClass, CHUNK_FORMAT__COMPRESSION_CODE_VALUE);
		createEAttribute(chunkFormatEClass, CHUNK_FORMAT__NUMBER_OF_CHANNELS);
		createEAttribute(chunkFormatEClass, CHUNK_FORMAT__SAMPLE_RATE);
		createEAttribute(chunkFormatEClass, CHUNK_FORMAT__AVERAGE_BYTES_PER_SECOND);
		createEAttribute(chunkFormatEClass, CHUNK_FORMAT__BLOCK_ALIGN);
		createEAttribute(chunkFormatEClass, CHUNK_FORMAT__SIGNIFICANT_BITS_PER_SAMPLE);
		createEAttribute(chunkFormatEClass, CHUNK_FORMAT__NUMBER_OF_EXTRA_FORMAT_BYTES);
		createEAttribute(chunkFormatEClass, CHUNK_FORMAT__EXTRA_FORMAT_BYTES);

		chunkInstrumentEClass = createEClass(CHUNK_INSTRUMENT);
		createEAttribute(chunkInstrumentEClass, CHUNK_INSTRUMENT__UNSHIFTED_NOTE);
		createEAttribute(chunkInstrumentEClass, CHUNK_INSTRUMENT__FINE_TUNE);
		createEAttribute(chunkInstrumentEClass, CHUNK_INSTRUMENT__GAIN);
		createEAttribute(chunkInstrumentEClass, CHUNK_INSTRUMENT__LOW_NOTE);
		createEAttribute(chunkInstrumentEClass, CHUNK_INSTRUMENT__HIGH_NOTE);
		createEAttribute(chunkInstrumentEClass, CHUNK_INSTRUMENT__LOW_VELOCITY);
		createEAttribute(chunkInstrumentEClass, CHUNK_INSTRUMENT__HIGH_VELOCITY);

		chunkPlayListEClass = createEClass(CHUNK_PLAY_LIST);
		createEAttribute(chunkPlayListEClass, CHUNK_PLAY_LIST__NUMBER_OF_SEGMENTS);
		createEReference(chunkPlayListEClass, CHUNK_PLAY_LIST__SEGMENTS);

		chunkSamplerEClass = createEClass(CHUNK_SAMPLER);
		createEAttribute(chunkSamplerEClass, CHUNK_SAMPLER__MANUFACTURER);
		createEAttribute(chunkSamplerEClass, CHUNK_SAMPLER__PRODUCT);
		createEAttribute(chunkSamplerEClass, CHUNK_SAMPLER__SAMPLE_PERIOD);
		createEAttribute(chunkSamplerEClass, CHUNK_SAMPLER__MIDI_UNITY_NOTE);
		createEAttribute(chunkSamplerEClass, CHUNK_SAMPLER__MIDI_PITCH_FRACTION);
		createEAttribute(chunkSamplerEClass, CHUNK_SAMPLER__SMPTE_FORMAT);
		createEAttribute(chunkSamplerEClass, CHUNK_SAMPLER__SMPTE_OFFSET);
		createEAttribute(chunkSamplerEClass, CHUNK_SAMPLER__NUMBER_OF_SAMPLE_LOOPS);
		createEAttribute(chunkSamplerEClass, CHUNK_SAMPLER__SAMPLER_DATA_SIZE);
		createEReference(chunkSamplerEClass, CHUNK_SAMPLER__SAMPLE_LOOPS);
		createEAttribute(chunkSamplerEClass, CHUNK_SAMPLER__SAMPLER_DATA);

		chunkSilentEClass = createEClass(CHUNK_SILENT);
		createEAttribute(chunkSilentEClass, CHUNK_SILENT__NUMBER_OF_SILENT_SAMPLES);

		chunkUnknownEClass = createEClass(CHUNK_UNKNOWN);
		createEAttribute(chunkUnknownEClass, CHUNK_UNKNOWN__DATA);
		createEAttribute(chunkUnknownEClass, CHUNK_UNKNOWN__UNKNOWN_CHUNK_TYPE_ID_VALUE);
		createEAttribute(chunkUnknownEClass, CHUNK_UNKNOWN__WAV_RANDOM_ACCESS_FILE_POINTER);

		chunkWaveListEClass = createEClass(CHUNK_WAVE_LIST);
		createEReference(chunkWaveListEClass, CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS);

		cuePointEClass = createEClass(CUE_POINT);
		createEAttribute(cuePointEClass, CUE_POINT__CUE_POINT_ID);
		createEAttribute(cuePointEClass, CUE_POINT__POSITION);
		createEAttribute(cuePointEClass, CUE_POINT__DATA_CHUNK_ID);
		createEAttribute(cuePointEClass, CUE_POINT__CHUNK_START);
		createEAttribute(cuePointEClass, CUE_POINT__BLOCK_START);
		createEAttribute(cuePointEClass, CUE_POINT__SAMPLE_OFFSET);

		parseChunkExceptionEClass = createEClass(PARSE_CHUNK_EXCEPTION);
		createEAttribute(parseChunkExceptionEClass, PARSE_CHUNK_EXCEPTION__EXCEPTION);
		createEAttribute(parseChunkExceptionEClass, PARSE_CHUNK_EXCEPTION__STRING_CAUSE);
		createEAttribute(parseChunkExceptionEClass, PARSE_CHUNK_EXCEPTION__STRING_MESSAGE);
		createEAttribute(parseChunkExceptionEClass, PARSE_CHUNK_EXCEPTION__STRING_STACK_TRACE);

		sampleDataEClass = createEClass(SAMPLE_DATA);

		sampleData8BitEClass = createEClass(SAMPLE_DATA8_BIT);
		createEAttribute(sampleData8BitEClass, SAMPLE_DATA8_BIT__SAMPLE);

		sampleData16BitEClass = createEClass(SAMPLE_DATA16_BIT);
		createEAttribute(sampleData16BitEClass, SAMPLE_DATA16_BIT__SAMPLE);

		sampleLoopEClass = createEClass(SAMPLE_LOOP);
		createEAttribute(sampleLoopEClass, SAMPLE_LOOP__CUE_POINT_ID);
		createEAttribute(sampleLoopEClass, SAMPLE_LOOP__TYPE);
		createEAttribute(sampleLoopEClass, SAMPLE_LOOP__START);
		createEAttribute(sampleLoopEClass, SAMPLE_LOOP__END);
		createEAttribute(sampleLoopEClass, SAMPLE_LOOP__FRACTION);
		createEAttribute(sampleLoopEClass, SAMPLE_LOOP__PLAY_COUNT);

		segmentEClass = createEClass(SEGMENT);
		createEAttribute(segmentEClass, SEGMENT__CUE_POINT_ID);
		createEAttribute(segmentEClass, SEGMENT__LENGTH_IN_SAMPLES);
		createEAttribute(segmentEClass, SEGMENT__NUMBER_OF_REPEATS);

		// Create enums
		chunkDataListTypeIDEEnum = createEEnum(CHUNK_DATA_LIST_TYPE_ID);
		chunkTypeIDEEnum = createEEnum(CHUNK_TYPE_ID);
		compressionCodeEEnum = createEEnum(COMPRESSION_CODE);
		sampleLoopTypeEEnum = createEEnum(SAMPLE_LOOP_TYPE);
		smpteFormatEEnum = createEEnum(SMPTE_FORMAT);

		// Create data types
		audioFileFormatEDataType = createEDataType(AUDIO_FILE_FORMAT);
		audioFormatEDataType = createEDataType(AUDIO_FORMAT);
		audioInputStreamEDataType = createEDataType(AUDIO_INPUT_STREAM);
		exceptionEDataType = createEDataType(EXCEPTION);
		extendedByteBufferEDataType = createEDataType(EXTENDED_BYTE_BUFFER);
		fileEDataType = createEDataType(FILE);
		ioExceptionEDataType = createEDataType(IO_EXCEPTION);
		riffWaveExceptionEDataType = createEDataType(RIFF_WAVE_EXCEPTION);
		unsignedShortEDataType = createEDataType(UNSIGNED_SHORT);
		unsignedIntEDataType = createEDataType(UNSIGNED_INT);
		unsupportedAudioFileExceptionEDataType = createEDataType(UNSUPPORTED_AUDIO_FILE_EXCEPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		chunkCueEClass.getESuperTypes().add(this.getChunk());
		chunkDataEClass.getESuperTypes().add(this.getChunk());
		chunkDataListEClass.getESuperTypes().add(this.getChunk());
		chunkDataListTypeEClass.getESuperTypes().add(this.getChunk());
		chunkDataListTypeLabelEClass.getESuperTypes().add(this.getChunkDataListType());
		chunkDataListTypeLabeledTextEClass.getESuperTypes().add(this.getChunkDataListType());
		chunkDataListTypeNoteEClass.getESuperTypes().add(this.getChunkDataListType());
		chunkFactEClass.getESuperTypes().add(this.getChunk());
		chunkFormatEClass.getESuperTypes().add(this.getChunk());
		chunkInstrumentEClass.getESuperTypes().add(this.getChunk());
		chunkPlayListEClass.getESuperTypes().add(this.getChunk());
		chunkSamplerEClass.getESuperTypes().add(this.getChunk());
		chunkSilentEClass.getESuperTypes().add(this.getChunk());
		chunkUnknownEClass.getESuperTypes().add(this.getChunk());
		chunkWaveListEClass.getESuperTypes().add(this.getChunk());
		sampleData8BitEClass.getESuperTypes().add(this.getSampleData());
		sampleData16BitEClass.getESuperTypes().add(this.getSampleData());

		// Initialize classes and features; add operations and parameters
		initEClass(riffWaveEClass, RIFFWave.class, "RIFFWave", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRIFFWave_Chunks(), this.getChunk(), null, "chunks", null, 0, -1, RIFFWave.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRIFFWave_ParseChunkExceptions(), this.getParseChunkException(), null, "parseChunkExceptions", null, 0, -1, RIFFWave.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRIFFWave_Size(), ecorePackage.getELong(), "size", null, 0, 1, RIFFWave.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(riffWaveEClass, null, "getChunksByEClass", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEClass(), "eClass", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType(this.getChunk());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(riffWaveEClass, this.getChunk(), "getFirstChunkByEClass", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEClass(), "eClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(riffWaveEClass, null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getExtendedByteBuffer(), "buf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getRiffWaveException());

		op = addEOperation(riffWaveEClass, this.getAudioFileFormat(), "toAudioFileFormat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getUnsupportedAudioFileException());

		op = addEOperation(riffWaveEClass, this.getAudioFormat(), "toAudioFormat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getUnsupportedAudioFileException());

		op = addEOperation(riffWaveEClass, this.getAudioInputStream(), "toAudioInputStream", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getUnsupportedAudioFileException());

		op = addEOperation(riffWaveEClass, ecorePackage.getEByteArray(), "toByteArray", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getRiffWaveException());

		op = addEOperation(riffWaveEClass, null, "write", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFile(), "file", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());
		addEException(op, this.getRiffWaveException());

		initEClass(channelEClass, Channel.class, "Channel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChannel_SampleData(), this.getSampleData(), null, "sampleData", null, 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chunkEClass, Chunk.class, "Chunk", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChunk_BlockAlignedSize(), ecorePackage.getELong(), "blockAlignedSize", null, 0, 1, Chunk.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunk_Size(), ecorePackage.getELong(), "size", null, 0, 1, Chunk.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunk_ChunkTypeID(), this.getChunkTypeID(), "chunkTypeID", null, 0, 1, Chunk.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunk_ChunkTypeIDValue(), ecorePackage.getEInt(), "chunkTypeIDValue", null, 0, 1, Chunk.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = addEOperation(chunkEClass, null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRIFFWave(), "riffWave", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getExtendedByteBuffer(), "buf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getRiffWaveException());

		op = addEOperation(chunkEClass, ecorePackage.getEByteArray(), "toByteArray", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getRiffWaveException());

		initEClass(chunkCueEClass, ChunkCue.class, "ChunkCue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChunkCue_NumberOfCuePoints(), this.getUnsignedInt(), "numberOfCuePoints", null, 0, 1, ChunkCue.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getChunkCue_CuePoints(), this.getCuePoint(), null, "cuePoints", null, 0, -1, ChunkCue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chunkDataEClass, ChunkData.class, "ChunkData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChunkData_Channels(), this.getChannel(), null, "channels", null, 0, -1, ChunkData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunkData_SampleDataOriginal(), ecorePackage.getEByteArray(), "sampleDataOriginal", null, 0, 1, ChunkData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chunkDataListEClass, ChunkDataList.class, "ChunkDataList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChunkDataList_TypeID(), this.getChunkDataListTypeID(), "typeID", null, 0, 1, ChunkDataList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChunkDataList_DataListChunks(), this.getChunkDataListType(), null, "dataListChunks", null, 0, -1, ChunkDataList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chunkDataListTypeEClass, ChunkDataListType.class, "ChunkDataListType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChunkDataListType_CuePointID(), this.getUnsignedInt(), "cuePointID", null, 0, 1, ChunkDataListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunkDataListType_Text(), ecorePackage.getEByteArray(), "text", null, 0, 1, ChunkDataListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunkDataListType_TextAsString(), ecorePackage.getEString(), "textAsString", null, 0, 1, ChunkDataListType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(chunkDataListTypeLabelEClass, ChunkDataListTypeLabel.class, "ChunkDataListTypeLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(chunkDataListTypeLabeledTextEClass, ChunkDataListTypeLabeledText.class, "ChunkDataListTypeLabeledText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChunkDataListTypeLabeledText_SampleLength(), this.getUnsignedInt(), "sampleLength", null, 0, 1, ChunkDataListTypeLabeledText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunkDataListTypeLabeledText_PurposeID(), this.getUnsignedInt(), "purposeID", null, 0, 1, ChunkDataListTypeLabeledText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunkDataListTypeLabeledText_Country(), this.getUnsignedShort(), "country", null, 0, 1, ChunkDataListTypeLabeledText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunkDataListTypeLabeledText_Language(), this.getUnsignedShort(), "language", null, 0, 1, ChunkDataListTypeLabeledText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunkDataListTypeLabeledText_Dialect(), this.getUnsignedShort(), "dialect", null, 0, 1, ChunkDataListTypeLabeledText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunkDataListTypeLabeledText_CodePage(), this.getUnsignedShort(), "codePage", null, 0, 1, ChunkDataListTypeLabeledText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chunkDataListTypeNoteEClass, ChunkDataListTypeNote.class, "ChunkDataListTypeNote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(chunkFactEClass, ChunkFact.class, "ChunkFact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChunkFact_FormatDependantData(), ecorePackage.getEByteArray(), "formatDependantData", null, 0, 1, ChunkFact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chunkFormatEClass, ChunkFormat.class, "ChunkFormat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChunkFormat_CompressionCode(), this.getCompressionCode(), "compressionCode", null, 0, 1, ChunkFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunkFormat_CompressionCodeValue(), this.getUnsignedShort(), "compressionCodeValue", null, 0, 1, ChunkFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunkFormat_NumberOfChannels(), this.getUnsignedShort(), "numberOfChannels", null, 0, 1, ChunkFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunkFormat_SampleRate(), this.getUnsignedInt(), "sampleRate", null, 0, 1, ChunkFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunkFormat_AverageBytesPerSecond(), this.getUnsignedInt(), "averageBytesPerSecond", null, 0, 1, ChunkFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunkFormat_BlockAlign(), this.getUnsignedShort(), "blockAlign", null, 0, 1, ChunkFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunkFormat_SignificantBitsPerSample(), this.getUnsignedShort(), "significantBitsPerSample", null, 0, 1, ChunkFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunkFormat_NumberOfExtraFormatBytes(), this.getUnsignedShort(), "numberOfExtraFormatBytes", null, 0, 1, ChunkFormat.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunkFormat_ExtraFormatBytes(), ecorePackage.getEByteArray(), "extraFormatBytes", null, 0, 1, ChunkFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chunkInstrumentEClass, ChunkInstrument.class, "ChunkInstrument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChunkInstrument_UnshiftedNote(), ecorePackage.getEByte(), "unshiftedNote", null, 0, 1, ChunkInstrument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunkInstrument_FineTune(), ecorePackage.getEByte(), "fineTune", null, 0, 1, ChunkInstrument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunkInstrument_Gain(), ecorePackage.getEByte(), "gain", null, 0, 1, ChunkInstrument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunkInstrument_LowNote(), ecorePackage.getEByte(), "lowNote", null, 0, 1, ChunkInstrument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunkInstrument_HighNote(), ecorePackage.getEByte(), "highNote", null, 0, 1, ChunkInstrument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunkInstrument_LowVelocity(), ecorePackage.getEByte(), "lowVelocity", null, 0, 1, ChunkInstrument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunkInstrument_HighVelocity(), ecorePackage.getEByte(), "highVelocity", null, 0, 1, ChunkInstrument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chunkPlayListEClass, ChunkPlayList.class, "ChunkPlayList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChunkPlayList_NumberOfSegments(), this.getUnsignedInt(), "numberOfSegments", null, 0, 1, ChunkPlayList.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getChunkPlayList_Segments(), this.getSegment(), null, "segments", null, 0, -1, ChunkPlayList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chunkSamplerEClass, ChunkSampler.class, "ChunkSampler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChunkSampler_Manufacturer(), this.getUnsignedInt(), "manufacturer", null, 0, 1, ChunkSampler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunkSampler_Product(), this.getUnsignedInt(), "product", null, 0, 1, ChunkSampler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunkSampler_SamplePeriod(), this.getUnsignedInt(), "samplePeriod", null, 0, 1, ChunkSampler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunkSampler_MidiUnityNote(), this.getUnsignedInt(), "midiUnityNote", null, 0, 1, ChunkSampler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunkSampler_MidiPitchFraction(), this.getUnsignedInt(), "midiPitchFraction", null, 0, 1, ChunkSampler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunkSampler_SmpteFormat(), this.getUnsignedInt(), "smpteFormat", null, 0, 1, ChunkSampler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunkSampler_SmpteOffset(), this.getUnsignedInt(), "smpteOffset", null, 0, 1, ChunkSampler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunkSampler_NumberOfSampleLoops(), this.getUnsignedInt(), "numberOfSampleLoops", null, 0, 1, ChunkSampler.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunkSampler_SamplerDataSize(), this.getUnsignedInt(), "samplerDataSize", null, 0, 1, ChunkSampler.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getChunkSampler_SampleLoops(), this.getSampleLoop(), null, "sampleLoops", null, 0, -1, ChunkSampler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunkSampler_SamplerData(), ecorePackage.getEByteArray(), "samplerData", null, 0, 1, ChunkSampler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chunkSilentEClass, ChunkSilent.class, "ChunkSilent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChunkSilent_NumberOfSilentSamples(), this.getUnsignedInt(), "numberOfSilentSamples", null, 0, 1, ChunkSilent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chunkUnknownEClass, ChunkUnknown.class, "ChunkUnknown", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChunkUnknown_Data(), ecorePackage.getEByteArray(), "data", null, 0, 1, ChunkUnknown.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunkUnknown_UnknownChunkTypeIdValue(), this.getUnsignedInt(), "unknownChunkTypeIdValue", null, 0, 1, ChunkUnknown.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunkUnknown_WavRandomAccessFilePointer(), ecorePackage.getELong(), "wavRandomAccessFilePointer", null, 0, 1, ChunkUnknown.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chunkWaveListEClass, ChunkWaveList.class, "ChunkWaveList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChunkWaveList_AlternatingSilentAndDataChunks(), this.getChunk(), null, "alternatingSilentAndDataChunks", null, 0, -1, ChunkWaveList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cuePointEClass, CuePoint.class, "CuePoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCuePoint_CuePointID(), this.getUnsignedInt(), "cuePointID", null, 0, 1, CuePoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCuePoint_Position(), this.getUnsignedInt(), "position", null, 0, 1, CuePoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCuePoint_DataChunkID(), this.getUnsignedInt(), "dataChunkID", null, 0, 1, CuePoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCuePoint_ChunkStart(), this.getUnsignedInt(), "chunkStart", null, 0, 1, CuePoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCuePoint_BlockStart(), this.getUnsignedInt(), "blockStart", null, 0, 1, CuePoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCuePoint_SampleOffset(), this.getUnsignedInt(), "sampleOffset", null, 0, 1, CuePoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parseChunkExceptionEClass, ParseChunkException.class, "ParseChunkException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParseChunkException_Exception(), this.getException(), "exception", null, 0, 1, ParseChunkException.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParseChunkException_StringCause(), ecorePackage.getEString(), "stringCause", null, 0, 1, ParseChunkException.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getParseChunkException_StringMessage(), ecorePackage.getEString(), "stringMessage", null, 0, 1, ParseChunkException.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getParseChunkException_StringStackTrace(), ecorePackage.getEString(), "stringStackTrace", null, 0, 1, ParseChunkException.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(sampleDataEClass, SampleData.class, "SampleData", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sampleData8BitEClass, SampleData8Bit.class, "SampleData8Bit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSampleData8Bit_Sample(), ecorePackage.getEByte(), "sample", null, 0, 1, SampleData8Bit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sampleData16BitEClass, SampleData16Bit.class, "SampleData16Bit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSampleData16Bit_Sample(), ecorePackage.getEShort(), "sample", null, 0, 1, SampleData16Bit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sampleLoopEClass, SampleLoop.class, "SampleLoop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSampleLoop_CuePointID(), this.getUnsignedInt(), "cuePointID", null, 0, 1, SampleLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSampleLoop_Type(), this.getUnsignedInt(), "type", null, 0, 1, SampleLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSampleLoop_Start(), this.getUnsignedInt(), "start", null, 0, 1, SampleLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSampleLoop_End(), this.getUnsignedInt(), "end", null, 0, 1, SampleLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSampleLoop_Fraction(), this.getUnsignedInt(), "fraction", null, 0, 1, SampleLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSampleLoop_PlayCount(), this.getUnsignedInt(), "playCount", null, 0, 1, SampleLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(segmentEClass, Segment.class, "Segment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSegment_CuePointID(), this.getUnsignedInt(), "cuePointID", null, 0, 1, Segment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSegment_LengthInSamples(), this.getUnsignedInt(), "lengthInSamples", null, 0, 1, Segment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSegment_NumberOfRepeats(), this.getUnsignedInt(), "numberOfRepeats", null, 0, 1, Segment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(chunkDataListTypeIDEEnum, ChunkDataListTypeID.class, "ChunkDataListTypeID");
		addEEnumLiteral(chunkDataListTypeIDEEnum, ChunkDataListTypeID.UNKNOWN);
		addEEnumLiteral(chunkDataListTypeIDEEnum, ChunkDataListTypeID.ADTL);

		initEEnum(chunkTypeIDEEnum, ChunkTypeID.class, "ChunkTypeID");
		addEEnumLiteral(chunkTypeIDEEnum, ChunkTypeID.UNKNOWN);
		addEEnumLiteral(chunkTypeIDEEnum, ChunkTypeID.RIFF);
		addEEnumLiteral(chunkTypeIDEEnum, ChunkTypeID.WAVE);
		addEEnumLiteral(chunkTypeIDEEnum, ChunkTypeID.CUE_);
		addEEnumLiteral(chunkTypeIDEEnum, ChunkTypeID.DATA);
		addEEnumLiteral(chunkTypeIDEEnum, ChunkTypeID.FACT);
		addEEnumLiteral(chunkTypeIDEEnum, ChunkTypeID.FMT_);
		addEEnumLiteral(chunkTypeIDEEnum, ChunkTypeID.INST);
		addEEnumLiteral(chunkTypeIDEEnum, ChunkTypeID.LABL);
		addEEnumLiteral(chunkTypeIDEEnum, ChunkTypeID.LIST);
		addEEnumLiteral(chunkTypeIDEEnum, ChunkTypeID.LTXT);
		addEEnumLiteral(chunkTypeIDEEnum, ChunkTypeID.NOTE);
		addEEnumLiteral(chunkTypeIDEEnum, ChunkTypeID.PLST);
		addEEnumLiteral(chunkTypeIDEEnum, ChunkTypeID.SINT);
		addEEnumLiteral(chunkTypeIDEEnum, ChunkTypeID.SMPL);
		addEEnumLiteral(chunkTypeIDEEnum, ChunkTypeID.WAVL);

		initEEnum(compressionCodeEEnum, CompressionCode.class, "CompressionCode");
		addEEnumLiteral(compressionCodeEEnum, CompressionCode.COMPRESSION_CODE_0);
		addEEnumLiteral(compressionCodeEEnum, CompressionCode.COMPRESSION_CODE_1);
		addEEnumLiteral(compressionCodeEEnum, CompressionCode.COMPRESSION_CODE_2);
		addEEnumLiteral(compressionCodeEEnum, CompressionCode.COMPRESSION_CODE_6);
		addEEnumLiteral(compressionCodeEEnum, CompressionCode.COMPRESSION_CODE_7);
		addEEnumLiteral(compressionCodeEEnum, CompressionCode.COMPRESSION_CODE_17);
		addEEnumLiteral(compressionCodeEEnum, CompressionCode.COMPRESSION_CODE_20);
		addEEnumLiteral(compressionCodeEEnum, CompressionCode.COMPRESSION_CODE_49);
		addEEnumLiteral(compressionCodeEEnum, CompressionCode.COMPRESSION_CODE_64);
		addEEnumLiteral(compressionCodeEEnum, CompressionCode.COMPRESSION_CODE_80);
		addEEnumLiteral(compressionCodeEEnum, CompressionCode.COMPRESSION_CODE_65536);

		initEEnum(sampleLoopTypeEEnum, SampleLoopType.class, "SampleLoopType");
		addEEnumLiteral(sampleLoopTypeEEnum, SampleLoopType.UNKNOWN);
		addEEnumLiteral(sampleLoopTypeEEnum, SampleLoopType.FORWARD);
		addEEnumLiteral(sampleLoopTypeEEnum, SampleLoopType.PING_PONG);
		addEEnumLiteral(sampleLoopTypeEEnum, SampleLoopType.BACKWARD);

		initEEnum(smpteFormatEEnum, SMPTEFormat.class, "SMPTEFormat");
		addEEnumLiteral(smpteFormatEEnum, SMPTEFormat.SMPTE_0);
		addEEnumLiteral(smpteFormatEEnum, SMPTEFormat.SMPTE_24);
		addEEnumLiteral(smpteFormatEEnum, SMPTEFormat.SMPTE_25);
		addEEnumLiteral(smpteFormatEEnum, SMPTEFormat.SMPTE_29);
		addEEnumLiteral(smpteFormatEEnum, SMPTEFormat.SMPTE_30);

		// Initialize data types
		initEDataType(audioFileFormatEDataType, AudioFileFormat.class, "AudioFileFormat", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(audioFormatEDataType, AudioFormat.class, "AudioFormat", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(audioInputStreamEDataType, AudioInputStream.class, "AudioInputStream", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(exceptionEDataType, Exception.class, "Exception", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(extendedByteBufferEDataType, ExtendedByteBuffer.class, "ExtendedByteBuffer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fileEDataType, File.class, "File", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ioExceptionEDataType, IOException.class, "IOException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(riffWaveExceptionEDataType, RiffWaveException.class, "RiffWaveException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unsignedShortEDataType, Integer.class, "UnsignedShort", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unsignedIntEDataType, Long.class, "UnsignedInt", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unsupportedAudioFileExceptionEDataType, UnsupportedAudioFileException.class, "UnsupportedAudioFileException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //WavPackageImpl

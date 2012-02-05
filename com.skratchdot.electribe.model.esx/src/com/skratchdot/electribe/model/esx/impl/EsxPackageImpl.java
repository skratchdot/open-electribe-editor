/**
 * Copyright (c) 2009, 2012 SKRATCHDOT.COM
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
import java.io.InputStream;
import java.util.ArrayList;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import com.skratchdot.electribe.model.esx.AmpEg;
import com.skratchdot.electribe.model.esx.ArpeggiatorControl;
import com.skratchdot.electribe.model.esx.ArpeggiatorScale;
import com.skratchdot.electribe.model.esx.AudioChannelType;
import com.skratchdot.electribe.model.esx.AudioInMode;
import com.skratchdot.electribe.model.esx.Beat;
import com.skratchdot.electribe.model.esx.BpmSync;
import com.skratchdot.electribe.model.esx.EnabledFlag;
import com.skratchdot.electribe.model.esx.EsxFactory;
import com.skratchdot.electribe.model.esx.EsxFile;
import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.FilterType;
import com.skratchdot.electribe.model.esx.FxChain;
import com.skratchdot.electribe.model.esx.FxSelect;
import com.skratchdot.electribe.model.esx.FxSend;
import com.skratchdot.electribe.model.esx.FxType;
import com.skratchdot.electribe.model.esx.GlobalParameters;
import com.skratchdot.electribe.model.esx.LastStep;
import com.skratchdot.electribe.model.esx.MidiChannel;
import com.skratchdot.electribe.model.esx.MidiChannelType;
import com.skratchdot.electribe.model.esx.MidiChannelTypeName;
import com.skratchdot.electribe.model.esx.MidiClock;
import com.skratchdot.electribe.model.esx.MidiControlChangeAssignment;
import com.skratchdot.electribe.model.esx.MidiControlChangeAssignmentName;
import com.skratchdot.electribe.model.esx.ModDest;
import com.skratchdot.electribe.model.esx.ModType;
import com.skratchdot.electribe.model.esx.MotionSequenceStatus;
import com.skratchdot.electribe.model.esx.MuteHold;
import com.skratchdot.electribe.model.esx.NextSongNumber;
import com.skratchdot.electribe.model.esx.NoteNumber;
import com.skratchdot.electribe.model.esx.Operation;
import com.skratchdot.electribe.model.esx.OperationType;
import com.skratchdot.electribe.model.esx.ParametersFx;
import com.skratchdot.electribe.model.esx.ParametersMotion;
import com.skratchdot.electribe.model.esx.Part;
import com.skratchdot.electribe.model.esx.PartAccent;
import com.skratchdot.electribe.model.esx.PartAudioIn;
import com.skratchdot.electribe.model.esx.PartDrum;
import com.skratchdot.electribe.model.esx.PartKeyboard;
import com.skratchdot.electribe.model.esx.PartNoteNumber;
import com.skratchdot.electribe.model.esx.PartNoteNumberName;
import com.skratchdot.electribe.model.esx.PartStretchSlice;
import com.skratchdot.electribe.model.esx.PartWithCommon;
import com.skratchdot.electribe.model.esx.PartWithPitch;
import com.skratchdot.electribe.model.esx.PartWithSample;
import com.skratchdot.electribe.model.esx.PartWithSequenceData;
import com.skratchdot.electribe.model.esx.PartWithSequenceDataGate;
import com.skratchdot.electribe.model.esx.PartWithSlice;
import com.skratchdot.electribe.model.esx.Pattern;
import com.skratchdot.electribe.model.esx.PatternLength;
import com.skratchdot.electribe.model.esx.PatternNumber;
import com.skratchdot.electribe.model.esx.PatternSetParameter;
import com.skratchdot.electribe.model.esx.PitchBendRange;
import com.skratchdot.electribe.model.esx.PlayLevel;
import com.skratchdot.electribe.model.esx.Reverse;
import com.skratchdot.electribe.model.esx.Roll;
import com.skratchdot.electribe.model.esx.RollType;
import com.skratchdot.electribe.model.esx.Sample;
import com.skratchdot.electribe.model.esx.SampleInPatternInfo;
import com.skratchdot.electribe.model.esx.SampleNumber;
import com.skratchdot.electribe.model.esx.SampleTune;
import com.skratchdot.electribe.model.esx.SequenceData;
import com.skratchdot.electribe.model.esx.SequenceDataGate;
import com.skratchdot.electribe.model.esx.SequenceDataNote;
import com.skratchdot.electribe.model.esx.Song;
import com.skratchdot.electribe.model.esx.SongEvent;
import com.skratchdot.electribe.model.esx.SongEventControl;
import com.skratchdot.electribe.model.esx.SongEventDrumNote;
import com.skratchdot.electribe.model.esx.SongEventKeyboardNote;
import com.skratchdot.electribe.model.esx.SongEventMuteStatus;
import com.skratchdot.electribe.model.esx.SongEventPart;
import com.skratchdot.electribe.model.esx.SongEventTempo;
import com.skratchdot.electribe.model.esx.SongEventWithPart;
import com.skratchdot.electribe.model.esx.SongLength;
import com.skratchdot.electribe.model.esx.SongNumber;
import com.skratchdot.electribe.model.esx.SongPattern;
import com.skratchdot.electribe.model.esx.StretchStep;
import com.skratchdot.electribe.model.esx.Swing;
import com.skratchdot.electribe.model.esx.Tempo;
import com.skratchdot.electribe.model.esx.TempoLock;
import com.skratchdot.electribe.model.esx.util.EsxValidator;
import com.skratchdot.riff.wav.RIFFWave;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EsxPackageImpl extends EPackageImpl implements EsxPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esxFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternSetParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass midiChannelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partNoteNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass midiControlChangeAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametersFxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametersMotionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceDataGateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceDataNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partWithSequenceDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partWithCommonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partWithSampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partWithSliceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partWithPitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partWithSequenceDataGateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partAccentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partAudioInEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partDrumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partKeyboardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partStretchSliceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sampleInPatternInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sampleTuneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass songEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass songPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tempoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass songEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass songEventWithPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass songEventControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass songEventDrumNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass songEventKeyboardNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass songEventTempoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass songEventMuteStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arpeggiatorControlEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum audioInModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum midiClockEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum midiControlChangeAssignmentNameEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enabledFlagEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pitchBendRangeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum midiChannelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum midiChannelTypeNameEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum playLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum patternNumberEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sampleNumberEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum songEventPartEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum songNumberEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum songLengthEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tempoLockEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum muteHoldEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nextSongNumberEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stretchStepEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum swingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum patternLengthEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum beatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rollTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fxChainEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lastStepEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arpeggiatorScaleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum audioChannelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum noteNumberEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum partNoteNumberNameEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum filterTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fxSelectEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fxSendEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fxTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rollEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ampEgEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reverseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modDestEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bpmSyncEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum motionSequenceStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType objectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType riffWaveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType arrayListEDataType = null;

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
	private EDataType inputStreamEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType indexOutOfBoundsExceptionEDataType = null;

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
	private EDataType iProgressMonitorEDataType = null;

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
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EsxPackageImpl() {
		super(eNS_URI, EsxFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EsxPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EsxPackage init() {
		if (isInited) return (EsxPackage)EPackage.Registry.INSTANCE.getEPackage(EsxPackage.eNS_URI);

		// Obtain or create and register package
		EsxPackageImpl theEsxPackage = (EsxPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EsxPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EsxPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEsxPackage.createPackageContents();

		// Initialize created meta-data
		theEsxPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theEsxPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return EsxValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theEsxPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EsxPackage.eNS_URI, theEsxPackage);
		return theEsxPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEsxFile() {
		return esxFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEsxFile_OriginalNonAudioData() {
		return (EAttribute)esxFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEsxFile_GlobalParameters() {
		return (EReference)esxFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEsxFile_Patterns() {
		return (EReference)esxFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEsxFile_Songs() {
		return (EReference)esxFileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEsxFile_Samples() {
		return (EReference)esxFileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEsxFile_EmptyPattern() {
		return (EReference)esxFileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEsxFile_EmptySong() {
		return (EReference)esxFileEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEsxFile_MaxSampleOffset() {
		return (EAttribute)esxFileEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEsxFile_MemUsedInBytes() {
		return (EAttribute)esxFileEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEsxFile_MemUsedInSeconds() {
		return (EAttribute)esxFileEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEsxFile_MemFreeInBytes() {
		return (EAttribute)esxFileEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEsxFile_MemFreeInSeconds() {
		return (EAttribute)esxFileEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEsxFile_NumPatternsEmpty() {
		return (EAttribute)esxFileEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEsxFile_NumPatternsNotEmpty() {
		return (EAttribute)esxFileEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEsxFile_NumSamplesEmpty() {
		return (EAttribute)esxFileEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEsxFile_NumSamplesNotEmpty() {
		return (EAttribute)esxFileEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEsxFile_NumSamplesMonoEmpty() {
		return (EAttribute)esxFileEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEsxFile_NumSamplesMonoNotEmpty() {
		return (EAttribute)esxFileEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEsxFile_NumSamplesStereoEmpty() {
		return (EAttribute)esxFileEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEsxFile_NumSamplesStereoNotEmpty() {
		return (EAttribute)esxFileEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEsxFile_NumSongsEmpty() {
		return (EAttribute)esxFileEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEsxFile_NumSongsNotEmpty() {
		return (EAttribute)esxFileEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEsxFile_SyncPatternsOnMoveEnabled() {
		return (EAttribute)esxFileEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEsxFile_SyncSamplesOnMoveEnabled() {
		return (EAttribute)esxFileEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalParameters() {
		return globalParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalParameters_MemoryProtectEnabled() {
		return (EAttribute)globalParametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalParameters_ReservedByte() {
		return (EAttribute)globalParametersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalParameters_ArpeggiatorControl() {
		return (EAttribute)globalParametersEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalParameters_AudioInMode() {
		return (EAttribute)globalParametersEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalParameters_MidiClock() {
		return (EAttribute)globalParametersEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalParameters_NoteMessageEnabled() {
		return (EAttribute)globalParametersEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalParameters_SystemExEnabled() {
		return (EAttribute)globalParametersEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalParameters_ControlChangeEnabled() {
		return (EAttribute)globalParametersEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalParameters_ProgramChangeEnabled() {
		return (EAttribute)globalParametersEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalParameters_ReservedBitsAfterProgramChangeEnabled() {
		return (EAttribute)globalParametersEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalParameters_PitchBendRange() {
		return (EAttribute)globalParametersEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalParameters_MidiChannels() {
		return (EReference)globalParametersEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalParameters_PartNoteNumbers() {
		return (EReference)globalParametersEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalParameters_MidiControlChangeAssignments() {
		return (EReference)globalParametersEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalParameters_ReservedLong() {
		return (EAttribute)globalParametersEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalParameters_PatternSetParameters() {
		return (EReference)globalParametersEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternSetParameter() {
		return patternSetParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternSetParameter_PositionCurrent() {
		return (EAttribute)patternSetParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternSetParameter_PatternPointer() {
		return (EAttribute)patternSetParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMidiChannelType() {
		return midiChannelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMidiChannelType_Name() {
		return (EAttribute)midiChannelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMidiChannelType_MidiChannel() {
		return (EAttribute)midiChannelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartNoteNumber() {
		return partNoteNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartNoteNumber_Name() {
		return (EAttribute)partNoteNumberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartNoteNumber_NoteNumber() {
		return (EAttribute)partNoteNumberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMidiControlChangeAssignment() {
		return midiControlChangeAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMidiControlChangeAssignment_Name() {
		return (EAttribute)midiControlChangeAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMidiControlChangeAssignment_Value() {
		return (EAttribute)midiControlChangeAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Value() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParametersFx() {
		return parametersFxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParametersFx_EffectType() {
		return (EAttribute)parametersFxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParametersFx_Edit1() {
		return (EAttribute)parametersFxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParametersFx_Edit2() {
		return (EAttribute)parametersFxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParametersFx_MotionSequenceStatus() {
		return (EAttribute)parametersFxEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParametersMotion() {
		return parametersMotionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParametersMotion_CurrentPosition() {
		return (EAttribute)parametersMotionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParametersMotion_Empty() {
		return (EAttribute)parametersMotionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersMotion_Operation() {
		return (EReference)parametersMotionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParametersMotion_OperationNumber() {
		return (EAttribute)parametersMotionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParametersMotion_OperationType() {
		return (EAttribute)parametersMotionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceData() {
		return sequenceDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceData_SequenceData() {
		return (EAttribute)sequenceDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceDataGate() {
		return sequenceDataGateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceDataGate_SequenceDataGate() {
		return (EAttribute)sequenceDataGateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceDataNote() {
		return sequenceDataNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceDataNote_SequenceDataNote() {
		return (EAttribute)sequenceDataNoteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPart() {
		return partEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPart_Label() {
		return (EAttribute)partEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPart_Level() {
		return (EAttribute)partEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPart_MotionSequenceStatus() {
		return (EAttribute)partEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartWithSequenceData() {
		return partWithSequenceDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartWithSequenceData_SequenceData() {
		return (EReference)partWithSequenceDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartWithCommon() {
		return partWithCommonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartWithCommon_AmpEg() {
		return (EAttribute)partWithCommonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartWithCommon_BpmSync() {
		return (EAttribute)partWithCommonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartWithCommon_Cutoff() {
		return (EAttribute)partWithCommonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartWithCommon_EgIntensity() {
		return (EAttribute)partWithCommonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartWithCommon_EgTime() {
		return (EAttribute)partWithCommonEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartWithCommon_FilterType() {
		return (EAttribute)partWithCommonEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartWithCommon_FxSelect() {
		return (EAttribute)partWithCommonEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartWithCommon_FxSend() {
		return (EAttribute)partWithCommonEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartWithCommon_ModDepth() {
		return (EAttribute)partWithCommonEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartWithCommon_ModDest() {
		return (EAttribute)partWithCommonEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartWithCommon_ModSpeed() {
		return (EAttribute)partWithCommonEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartWithCommon_ModType() {
		return (EAttribute)partWithCommonEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartWithCommon_Pan() {
		return (EAttribute)partWithCommonEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartWithCommon_ReservedBitAfterModDepth() {
		return (EAttribute)partWithCommonEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartWithCommon_Resonance() {
		return (EAttribute)partWithCommonEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartWithCommon_Roll() {
		return (EAttribute)partWithCommonEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartWithSample() {
		return partWithSampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartWithSample_Reverse() {
		return (EAttribute)partWithSampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartWithSample_SampleLabel() {
		return (EAttribute)partWithSampleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartWithSample_SamplePointer() {
		return (EAttribute)partWithSampleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartWithSample_StartPoint() {
		return (EAttribute)partWithSampleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartWithSample_ReservedBitsAfterReverse() {
		return (EAttribute)partWithSampleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartWithSlice() {
		return partWithSliceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartWithSlice_ReservedByte() {
		return (EAttribute)partWithSliceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartWithSlice_SliceNumber() {
		return (EAttribute)partWithSliceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartWithPitch() {
		return partWithPitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartWithPitch_Pitch() {
		return (EAttribute)partWithPitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartWithSequenceDataGate() {
		return partWithSequenceDataGateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartWithSequenceDataGate_SequenceDataGate() {
		return (EReference)partWithSequenceDataGateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartAccent() {
		return partAccentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartAudioIn() {
		return partAudioInEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartAudioIn_ReservedBitsByte7() {
		return (EAttribute)partAudioInEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartDrum() {
		return partDrumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartKeyboard() {
		return partKeyboardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartKeyboard_Glide() {
		return (EAttribute)partKeyboardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartKeyboard_SequenceDataNote() {
		return (EReference)partKeyboardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartStretchSlice() {
		return partStretchSliceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern() {
		return patternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Name() {
		return (EAttribute)patternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Label() {
		return (EAttribute)patternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_Tempo() {
		return (EReference)patternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Swing() {
		return (EAttribute)patternEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_PatternLength() {
		return (EAttribute)patternEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_ReservedBitAfterPatternLength() {
		return (EAttribute)patternEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Beat() {
		return (EAttribute)patternEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_RollType() {
		return (EAttribute)patternEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_FxChain() {
		return (EAttribute)patternEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_LastStep() {
		return (EAttribute)patternEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_ArpeggiatorScale() {
		return (EAttribute)patternEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_ReservedBitsAfterArpeggiatorScale() {
		return (EAttribute)patternEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_ArpeggiatorCenterNote() {
		return (EAttribute)patternEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_MuteStatus() {
		return (EAttribute)patternEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_SwingStatus() {
		return (EAttribute)patternEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_OutputBusStatus() {
		return (EAttribute)patternEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_AccentStatus() {
		return (EAttribute)patternEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_DrumParts() {
		return (EReference)patternEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_KeyboardParts() {
		return (EReference)patternEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_StretchSliceParts() {
		return (EReference)patternEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_AudioInPart() {
		return (EReference)patternEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_AccentPart() {
		return (EReference)patternEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_FxParameters() {
		return (EReference)patternEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_MotionParameters() {
		return (EReference)patternEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Empty() {
		return (EAttribute)patternEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_PatternNumberOriginal() {
		return (EAttribute)patternEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_PatternNumberCurrent() {
		return (EAttribute)patternEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSample() {
		return sampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_Name() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_MemUsedInBytes() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_Empty() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_PartCount() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_PatternCount() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSample_SampleInPatternInfoList() {
		return (EReference)sampleEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_OffsetChannel1Start() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_OffsetChannel1End() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_OffsetChannel2Start() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_OffsetChannel2End() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_Start() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_End() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_LoopStart() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_SampleRate() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSample_SampleTune() {
		return (EReference)sampleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_NumberOfSampleFrames() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_PlayLevel() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_StretchStep() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_UnknownByteMono1() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_UnknownByteMono2() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_UnknownByteMono3() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_UnknownByteMono4() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_UnknownByteStereo1() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_UnknownByteStereo2() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_UnknownByteStereo3() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_UnknownByteStereo4() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_AudioDataChannel1() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_AudioDataChannel2() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_AudioDataChannelBoth() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_AudioDataLoopStart() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_SliceArray() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_SampleNumberOriginal() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_SampleNumberCurrent() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSampleInPatternInfo() {
		return sampleInPatternInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampleInPatternInfo_Index() {
		return (EAttribute)sampleInPatternInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampleInPatternInfo_PatternLabel() {
		return (EAttribute)sampleInPatternInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampleInPatternInfo_PartCount() {
		return (EAttribute)sampleInPatternInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampleInPatternInfo_PartList() {
		return (EAttribute)sampleInPatternInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_Loop() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_Slice() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_StereoOriginal() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_StereoCurrent() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_Label() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSampleTune() {
		return sampleTuneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampleTune_Value() {
		return (EAttribute)sampleTuneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSong() {
		return songEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSong_Name() {
		return (EAttribute)songEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSong_Tempo() {
		return (EReference)songEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSong_TempoLock() {
		return (EAttribute)songEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSong_SongLength() {
		return (EAttribute)songEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSong_MuteHold() {
		return (EAttribute)songEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSong_NextSongNumber() {
		return (EAttribute)songEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSong_NumberOfSongEventsCurrent() {
		return (EAttribute)songEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSong_NumberOfSongEventsOriginal() {
		return (EAttribute)songEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSong_SongPatterns() {
		return (EReference)songEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSong_SongEvents() {
		return (EReference)songEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSong_Empty() {
		return (EAttribute)songEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSong_SongNumberOriginal() {
		return (EAttribute)songEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSong_SongNumberCurrent() {
		return (EAttribute)songEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSongPattern() {
		return songPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSongPattern_PositionCurrent() {
		return (EAttribute)songPatternEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSongPattern_NoteOffset() {
		return (EAttribute)songPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSongPattern_PatternPointer() {
		return (EAttribute)songPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSongPattern_Empty() {
		return (EAttribute)songPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTempo() {
		return tempoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTempo_Value() {
		return (EAttribute)tempoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSongEvent() {
		return songEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSongEvent_CurrentPosition() {
		return (EAttribute)songEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSongEvent_EventInfo() {
		return (EAttribute)songEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSongEvent_EventType() {
		return (EAttribute)songEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSongEvent_Measure() {
		return (EAttribute)songEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSongEvent_OperationNumber() {
		return (EAttribute)songEventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSongEvent_PositionNumber() {
		return (EAttribute)songEventEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSongEvent_Step() {
		return (EAttribute)songEventEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSongEventWithPart() {
		return songEventWithPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSongEventWithPart_Part() {
		return (EAttribute)songEventWithPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSongEventControl() {
		return songEventControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSongEventControl_OperationType() {
		return (EAttribute)songEventControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSongEventControl_Value() {
		return (EAttribute)songEventControlEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSongEventControl_ReservedByte() {
		return (EAttribute)songEventControlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSongEventControl_ReservedShort() {
		return (EAttribute)songEventControlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSongEventDrumNote() {
		return songEventDrumNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSongEventDrumNote_ReservedByte() {
		return (EAttribute)songEventDrumNoteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSongEventDrumNote_ReservedShort() {
		return (EAttribute)songEventDrumNoteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSongEventKeyboardNote() {
		return songEventKeyboardNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSongEventKeyboardNote_Length() {
		return (EAttribute)songEventKeyboardNoteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSongEventKeyboardNote_NoteNumber() {
		return (EAttribute)songEventKeyboardNoteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSongEventTempo() {
		return songEventTempoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSongEventTempo_Tempo() {
		return (EReference)songEventTempoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSongEventTempo_ReservedShort() {
		return (EAttribute)songEventTempoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSongEventMuteStatus() {
		return songEventMuteStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSongEventMuteStatus_ReservedShort() {
		return (EAttribute)songEventMuteStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSongEventMuteStatus_MuteStatus() {
		return (EAttribute)songEventMuteStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArpeggiatorControl() {
		return arpeggiatorControlEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAudioInMode() {
		return audioInModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMidiClock() {
		return midiClockEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMidiControlChangeAssignmentName() {
		return midiControlChangeAssignmentNameEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnabledFlag() {
		return enabledFlagEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPitchBendRange() {
		return pitchBendRangeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMidiChannel() {
		return midiChannelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMidiChannelTypeName() {
		return midiChannelTypeNameEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlayLevel() {
		return playLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPatternNumber() {
		return patternNumberEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSampleNumber() {
		return sampleNumberEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSongEventPart() {
		return songEventPartEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSongNumber() {
		return songNumberEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSongLength() {
		return songLengthEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTempoLock() {
		return tempoLockEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMuteHold() {
		return muteHoldEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNextSongNumber() {
		return nextSongNumberEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStretchStep() {
		return stretchStepEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSwing() {
		return swingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPatternLength() {
		return patternLengthEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBeat() {
		return beatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRollType() {
		return rollTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFxChain() {
		return fxChainEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLastStep() {
		return lastStepEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArpeggiatorScale() {
		return arpeggiatorScaleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAudioChannelType() {
		return audioChannelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNoteNumber() {
		return noteNumberEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperationType() {
		return operationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPartNoteNumberName() {
		return partNoteNumberNameEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFilterType() {
		return filterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFxSelect() {
		return fxSelectEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFxSend() {
		return fxSendEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFxType() {
		return fxTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRoll() {
		return rollEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAmpEg() {
		return ampEgEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReverse() {
		return reverseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModDest() {
		return modDestEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModType() {
		return modTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBpmSync() {
		return bpmSyncEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMotionSequenceStatus() {
		return motionSequenceStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getObject() {
		return objectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRIFFWave() {
		return riffWaveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getArrayList() {
		return arrayListEDataType;
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
	public EDataType getInputStream() {
		return inputStreamEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIndexOutOfBoundsException() {
		return indexOutOfBoundsExceptionEDataType;
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
	public EDataType getIProgressMonitor() {
		return iProgressMonitorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EsxFactory getEsxFactory() {
		return (EsxFactory)getEFactoryInstance();
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
		esxFileEClass = createEClass(ESX_FILE);
		createEAttribute(esxFileEClass, ESX_FILE__ORIGINAL_NON_AUDIO_DATA);
		createEReference(esxFileEClass, ESX_FILE__GLOBAL_PARAMETERS);
		createEReference(esxFileEClass, ESX_FILE__PATTERNS);
		createEReference(esxFileEClass, ESX_FILE__SONGS);
		createEReference(esxFileEClass, ESX_FILE__SAMPLES);
		createEReference(esxFileEClass, ESX_FILE__EMPTY_PATTERN);
		createEReference(esxFileEClass, ESX_FILE__EMPTY_SONG);
		createEAttribute(esxFileEClass, ESX_FILE__MAX_SAMPLE_OFFSET);
		createEAttribute(esxFileEClass, ESX_FILE__MEM_USED_IN_BYTES);
		createEAttribute(esxFileEClass, ESX_FILE__MEM_USED_IN_SECONDS);
		createEAttribute(esxFileEClass, ESX_FILE__MEM_FREE_IN_BYTES);
		createEAttribute(esxFileEClass, ESX_FILE__MEM_FREE_IN_SECONDS);
		createEAttribute(esxFileEClass, ESX_FILE__NUM_PATTERNS_EMPTY);
		createEAttribute(esxFileEClass, ESX_FILE__NUM_PATTERNS_NOT_EMPTY);
		createEAttribute(esxFileEClass, ESX_FILE__NUM_SAMPLES_EMPTY);
		createEAttribute(esxFileEClass, ESX_FILE__NUM_SAMPLES_NOT_EMPTY);
		createEAttribute(esxFileEClass, ESX_FILE__NUM_SAMPLES_MONO_EMPTY);
		createEAttribute(esxFileEClass, ESX_FILE__NUM_SAMPLES_MONO_NOT_EMPTY);
		createEAttribute(esxFileEClass, ESX_FILE__NUM_SAMPLES_STEREO_EMPTY);
		createEAttribute(esxFileEClass, ESX_FILE__NUM_SAMPLES_STEREO_NOT_EMPTY);
		createEAttribute(esxFileEClass, ESX_FILE__NUM_SONGS_EMPTY);
		createEAttribute(esxFileEClass, ESX_FILE__NUM_SONGS_NOT_EMPTY);
		createEAttribute(esxFileEClass, ESX_FILE__SYNC_PATTERNS_ON_MOVE_ENABLED);
		createEAttribute(esxFileEClass, ESX_FILE__SYNC_SAMPLES_ON_MOVE_ENABLED);

		globalParametersEClass = createEClass(GLOBAL_PARAMETERS);
		createEAttribute(globalParametersEClass, GLOBAL_PARAMETERS__MEMORY_PROTECT_ENABLED);
		createEAttribute(globalParametersEClass, GLOBAL_PARAMETERS__RESERVED_BYTE);
		createEAttribute(globalParametersEClass, GLOBAL_PARAMETERS__ARPEGGIATOR_CONTROL);
		createEAttribute(globalParametersEClass, GLOBAL_PARAMETERS__AUDIO_IN_MODE);
		createEAttribute(globalParametersEClass, GLOBAL_PARAMETERS__MIDI_CLOCK);
		createEAttribute(globalParametersEClass, GLOBAL_PARAMETERS__NOTE_MESSAGE_ENABLED);
		createEAttribute(globalParametersEClass, GLOBAL_PARAMETERS__SYSTEM_EX_ENABLED);
		createEAttribute(globalParametersEClass, GLOBAL_PARAMETERS__CONTROL_CHANGE_ENABLED);
		createEAttribute(globalParametersEClass, GLOBAL_PARAMETERS__PROGRAM_CHANGE_ENABLED);
		createEAttribute(globalParametersEClass, GLOBAL_PARAMETERS__RESERVED_BITS_AFTER_PROGRAM_CHANGE_ENABLED);
		createEAttribute(globalParametersEClass, GLOBAL_PARAMETERS__PITCH_BEND_RANGE);
		createEReference(globalParametersEClass, GLOBAL_PARAMETERS__MIDI_CHANNELS);
		createEReference(globalParametersEClass, GLOBAL_PARAMETERS__PART_NOTE_NUMBERS);
		createEReference(globalParametersEClass, GLOBAL_PARAMETERS__MIDI_CONTROL_CHANGE_ASSIGNMENTS);
		createEAttribute(globalParametersEClass, GLOBAL_PARAMETERS__RESERVED_LONG);
		createEReference(globalParametersEClass, GLOBAL_PARAMETERS__PATTERN_SET_PARAMETERS);

		midiChannelTypeEClass = createEClass(MIDI_CHANNEL_TYPE);
		createEAttribute(midiChannelTypeEClass, MIDI_CHANNEL_TYPE__NAME);
		createEAttribute(midiChannelTypeEClass, MIDI_CHANNEL_TYPE__MIDI_CHANNEL);

		midiControlChangeAssignmentEClass = createEClass(MIDI_CONTROL_CHANGE_ASSIGNMENT);
		createEAttribute(midiControlChangeAssignmentEClass, MIDI_CONTROL_CHANGE_ASSIGNMENT__NAME);
		createEAttribute(midiControlChangeAssignmentEClass, MIDI_CONTROL_CHANGE_ASSIGNMENT__VALUE);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__VALUE);

		parametersFxEClass = createEClass(PARAMETERS_FX);
		createEAttribute(parametersFxEClass, PARAMETERS_FX__EFFECT_TYPE);
		createEAttribute(parametersFxEClass, PARAMETERS_FX__EDIT1);
		createEAttribute(parametersFxEClass, PARAMETERS_FX__EDIT2);
		createEAttribute(parametersFxEClass, PARAMETERS_FX__MOTION_SEQUENCE_STATUS);

		parametersMotionEClass = createEClass(PARAMETERS_MOTION);
		createEAttribute(parametersMotionEClass, PARAMETERS_MOTION__CURRENT_POSITION);
		createEAttribute(parametersMotionEClass, PARAMETERS_MOTION__EMPTY);
		createEReference(parametersMotionEClass, PARAMETERS_MOTION__OPERATION);
		createEAttribute(parametersMotionEClass, PARAMETERS_MOTION__OPERATION_NUMBER);
		createEAttribute(parametersMotionEClass, PARAMETERS_MOTION__OPERATION_TYPE);

		partEClass = createEClass(PART);
		createEAttribute(partEClass, PART__LABEL);
		createEAttribute(partEClass, PART__LEVEL);
		createEAttribute(partEClass, PART__MOTION_SEQUENCE_STATUS);

		partAccentEClass = createEClass(PART_ACCENT);

		partAudioInEClass = createEClass(PART_AUDIO_IN);
		createEAttribute(partAudioInEClass, PART_AUDIO_IN__RESERVED_BITS_BYTE7);

		partDrumEClass = createEClass(PART_DRUM);

		partKeyboardEClass = createEClass(PART_KEYBOARD);
		createEAttribute(partKeyboardEClass, PART_KEYBOARD__GLIDE);
		createEReference(partKeyboardEClass, PART_KEYBOARD__SEQUENCE_DATA_NOTE);

		partNoteNumberEClass = createEClass(PART_NOTE_NUMBER);
		createEAttribute(partNoteNumberEClass, PART_NOTE_NUMBER__NAME);
		createEAttribute(partNoteNumberEClass, PART_NOTE_NUMBER__NOTE_NUMBER);

		partStretchSliceEClass = createEClass(PART_STRETCH_SLICE);

		partWithCommonEClass = createEClass(PART_WITH_COMMON);
		createEAttribute(partWithCommonEClass, PART_WITH_COMMON__AMP_EG);
		createEAttribute(partWithCommonEClass, PART_WITH_COMMON__BPM_SYNC);
		createEAttribute(partWithCommonEClass, PART_WITH_COMMON__CUTOFF);
		createEAttribute(partWithCommonEClass, PART_WITH_COMMON__EG_INTENSITY);
		createEAttribute(partWithCommonEClass, PART_WITH_COMMON__EG_TIME);
		createEAttribute(partWithCommonEClass, PART_WITH_COMMON__FILTER_TYPE);
		createEAttribute(partWithCommonEClass, PART_WITH_COMMON__FX_SELECT);
		createEAttribute(partWithCommonEClass, PART_WITH_COMMON__FX_SEND);
		createEAttribute(partWithCommonEClass, PART_WITH_COMMON__MOD_DEPTH);
		createEAttribute(partWithCommonEClass, PART_WITH_COMMON__MOD_DEST);
		createEAttribute(partWithCommonEClass, PART_WITH_COMMON__MOD_SPEED);
		createEAttribute(partWithCommonEClass, PART_WITH_COMMON__MOD_TYPE);
		createEAttribute(partWithCommonEClass, PART_WITH_COMMON__PAN);
		createEAttribute(partWithCommonEClass, PART_WITH_COMMON__RESERVED_BIT_AFTER_MOD_DEPTH);
		createEAttribute(partWithCommonEClass, PART_WITH_COMMON__RESONANCE);
		createEAttribute(partWithCommonEClass, PART_WITH_COMMON__ROLL);

		partWithPitchEClass = createEClass(PART_WITH_PITCH);
		createEAttribute(partWithPitchEClass, PART_WITH_PITCH__PITCH);

		partWithSampleEClass = createEClass(PART_WITH_SAMPLE);
		createEAttribute(partWithSampleEClass, PART_WITH_SAMPLE__REVERSE);
		createEAttribute(partWithSampleEClass, PART_WITH_SAMPLE__SAMPLE_LABEL);
		createEAttribute(partWithSampleEClass, PART_WITH_SAMPLE__SAMPLE_POINTER);
		createEAttribute(partWithSampleEClass, PART_WITH_SAMPLE__START_POINT);
		createEAttribute(partWithSampleEClass, PART_WITH_SAMPLE__RESERVED_BITS_AFTER_REVERSE);

		partWithSequenceDataEClass = createEClass(PART_WITH_SEQUENCE_DATA);
		createEReference(partWithSequenceDataEClass, PART_WITH_SEQUENCE_DATA__SEQUENCE_DATA);

		partWithSequenceDataGateEClass = createEClass(PART_WITH_SEQUENCE_DATA_GATE);
		createEReference(partWithSequenceDataGateEClass, PART_WITH_SEQUENCE_DATA_GATE__SEQUENCE_DATA_GATE);

		partWithSliceEClass = createEClass(PART_WITH_SLICE);
		createEAttribute(partWithSliceEClass, PART_WITH_SLICE__RESERVED_BYTE);
		createEAttribute(partWithSliceEClass, PART_WITH_SLICE__SLICE_NUMBER);

		patternEClass = createEClass(PATTERN);
		createEAttribute(patternEClass, PATTERN__NAME);
		createEAttribute(patternEClass, PATTERN__LABEL);
		createEReference(patternEClass, PATTERN__TEMPO);
		createEAttribute(patternEClass, PATTERN__SWING);
		createEAttribute(patternEClass, PATTERN__PATTERN_LENGTH);
		createEAttribute(patternEClass, PATTERN__RESERVED_BIT_AFTER_PATTERN_LENGTH);
		createEAttribute(patternEClass, PATTERN__BEAT);
		createEAttribute(patternEClass, PATTERN__ROLL_TYPE);
		createEAttribute(patternEClass, PATTERN__FX_CHAIN);
		createEAttribute(patternEClass, PATTERN__LAST_STEP);
		createEAttribute(patternEClass, PATTERN__ARPEGGIATOR_SCALE);
		createEAttribute(patternEClass, PATTERN__RESERVED_BITS_AFTER_ARPEGGIATOR_SCALE);
		createEAttribute(patternEClass, PATTERN__ARPEGGIATOR_CENTER_NOTE);
		createEAttribute(patternEClass, PATTERN__MUTE_STATUS);
		createEAttribute(patternEClass, PATTERN__SWING_STATUS);
		createEAttribute(patternEClass, PATTERN__OUTPUT_BUS_STATUS);
		createEAttribute(patternEClass, PATTERN__ACCENT_STATUS);
		createEReference(patternEClass, PATTERN__DRUM_PARTS);
		createEReference(patternEClass, PATTERN__KEYBOARD_PARTS);
		createEReference(patternEClass, PATTERN__STRETCH_SLICE_PARTS);
		createEReference(patternEClass, PATTERN__AUDIO_IN_PART);
		createEReference(patternEClass, PATTERN__ACCENT_PART);
		createEReference(patternEClass, PATTERN__FX_PARAMETERS);
		createEReference(patternEClass, PATTERN__MOTION_PARAMETERS);
		createEAttribute(patternEClass, PATTERN__EMPTY);
		createEAttribute(patternEClass, PATTERN__PATTERN_NUMBER_ORIGINAL);
		createEAttribute(patternEClass, PATTERN__PATTERN_NUMBER_CURRENT);

		sampleInPatternInfoEClass = createEClass(SAMPLE_IN_PATTERN_INFO);
		createEAttribute(sampleInPatternInfoEClass, SAMPLE_IN_PATTERN_INFO__INDEX);
		createEAttribute(sampleInPatternInfoEClass, SAMPLE_IN_PATTERN_INFO__PATTERN_LABEL);
		createEAttribute(sampleInPatternInfoEClass, SAMPLE_IN_PATTERN_INFO__PART_COUNT);
		createEAttribute(sampleInPatternInfoEClass, SAMPLE_IN_PATTERN_INFO__PART_LIST);

		patternSetParameterEClass = createEClass(PATTERN_SET_PARAMETER);
		createEAttribute(patternSetParameterEClass, PATTERN_SET_PARAMETER__POSITION_CURRENT);
		createEAttribute(patternSetParameterEClass, PATTERN_SET_PARAMETER__PATTERN_POINTER);

		sampleEClass = createEClass(SAMPLE);
		createEAttribute(sampleEClass, SAMPLE__NAME);
		createEAttribute(sampleEClass, SAMPLE__OFFSET_CHANNEL1_START);
		createEAttribute(sampleEClass, SAMPLE__OFFSET_CHANNEL1_END);
		createEAttribute(sampleEClass, SAMPLE__OFFSET_CHANNEL2_START);
		createEAttribute(sampleEClass, SAMPLE__OFFSET_CHANNEL2_END);
		createEAttribute(sampleEClass, SAMPLE__START);
		createEAttribute(sampleEClass, SAMPLE__END);
		createEAttribute(sampleEClass, SAMPLE__LOOP_START);
		createEAttribute(sampleEClass, SAMPLE__SAMPLE_RATE);
		createEReference(sampleEClass, SAMPLE__SAMPLE_TUNE);
		createEAttribute(sampleEClass, SAMPLE__NUMBER_OF_SAMPLE_FRAMES);
		createEAttribute(sampleEClass, SAMPLE__PLAY_LEVEL);
		createEAttribute(sampleEClass, SAMPLE__STRETCH_STEP);
		createEAttribute(sampleEClass, SAMPLE__UNKNOWN_BYTE_MONO1);
		createEAttribute(sampleEClass, SAMPLE__UNKNOWN_BYTE_MONO2);
		createEAttribute(sampleEClass, SAMPLE__UNKNOWN_BYTE_MONO3);
		createEAttribute(sampleEClass, SAMPLE__UNKNOWN_BYTE_MONO4);
		createEAttribute(sampleEClass, SAMPLE__UNKNOWN_BYTE_STEREO1);
		createEAttribute(sampleEClass, SAMPLE__UNKNOWN_BYTE_STEREO2);
		createEAttribute(sampleEClass, SAMPLE__UNKNOWN_BYTE_STEREO3);
		createEAttribute(sampleEClass, SAMPLE__UNKNOWN_BYTE_STEREO4);
		createEAttribute(sampleEClass, SAMPLE__AUDIO_DATA_CHANNEL1);
		createEAttribute(sampleEClass, SAMPLE__AUDIO_DATA_CHANNEL2);
		createEAttribute(sampleEClass, SAMPLE__AUDIO_DATA_CHANNEL_BOTH);
		createEAttribute(sampleEClass, SAMPLE__AUDIO_DATA_LOOP_START);
		createEAttribute(sampleEClass, SAMPLE__SLICE_ARRAY);
		createEAttribute(sampleEClass, SAMPLE__LOOP);
		createEAttribute(sampleEClass, SAMPLE__SLICE);
		createEAttribute(sampleEClass, SAMPLE__STEREO_ORIGINAL);
		createEAttribute(sampleEClass, SAMPLE__STEREO_CURRENT);
		createEAttribute(sampleEClass, SAMPLE__LABEL);
		createEAttribute(sampleEClass, SAMPLE__MEM_USED_IN_BYTES);
		createEAttribute(sampleEClass, SAMPLE__EMPTY);
		createEAttribute(sampleEClass, SAMPLE__PART_COUNT);
		createEAttribute(sampleEClass, SAMPLE__PATTERN_COUNT);
		createEReference(sampleEClass, SAMPLE__SAMPLE_IN_PATTERN_INFO_LIST);
		createEAttribute(sampleEClass, SAMPLE__SAMPLE_NUMBER_ORIGINAL);
		createEAttribute(sampleEClass, SAMPLE__SAMPLE_NUMBER_CURRENT);

		sampleTuneEClass = createEClass(SAMPLE_TUNE);
		createEAttribute(sampleTuneEClass, SAMPLE_TUNE__VALUE);

		sequenceDataEClass = createEClass(SEQUENCE_DATA);
		createEAttribute(sequenceDataEClass, SEQUENCE_DATA__SEQUENCE_DATA);

		sequenceDataGateEClass = createEClass(SEQUENCE_DATA_GATE);
		createEAttribute(sequenceDataGateEClass, SEQUENCE_DATA_GATE__SEQUENCE_DATA_GATE);

		sequenceDataNoteEClass = createEClass(SEQUENCE_DATA_NOTE);
		createEAttribute(sequenceDataNoteEClass, SEQUENCE_DATA_NOTE__SEQUENCE_DATA_NOTE);

		songEClass = createEClass(SONG);
		createEAttribute(songEClass, SONG__NAME);
		createEReference(songEClass, SONG__TEMPO);
		createEAttribute(songEClass, SONG__TEMPO_LOCK);
		createEAttribute(songEClass, SONG__SONG_LENGTH);
		createEAttribute(songEClass, SONG__MUTE_HOLD);
		createEAttribute(songEClass, SONG__NEXT_SONG_NUMBER);
		createEAttribute(songEClass, SONG__NUMBER_OF_SONG_EVENTS_CURRENT);
		createEAttribute(songEClass, SONG__NUMBER_OF_SONG_EVENTS_ORIGINAL);
		createEReference(songEClass, SONG__SONG_PATTERNS);
		createEReference(songEClass, SONG__SONG_EVENTS);
		createEAttribute(songEClass, SONG__EMPTY);
		createEAttribute(songEClass, SONG__SONG_NUMBER_ORIGINAL);
		createEAttribute(songEClass, SONG__SONG_NUMBER_CURRENT);

		songEventEClass = createEClass(SONG_EVENT);
		createEAttribute(songEventEClass, SONG_EVENT__CURRENT_POSITION);
		createEAttribute(songEventEClass, SONG_EVENT__EVENT_INFO);
		createEAttribute(songEventEClass, SONG_EVENT__EVENT_TYPE);
		createEAttribute(songEventEClass, SONG_EVENT__MEASURE);
		createEAttribute(songEventEClass, SONG_EVENT__OPERATION_NUMBER);
		createEAttribute(songEventEClass, SONG_EVENT__POSITION_NUMBER);
		createEAttribute(songEventEClass, SONG_EVENT__STEP);

		songEventControlEClass = createEClass(SONG_EVENT_CONTROL);
		createEAttribute(songEventControlEClass, SONG_EVENT_CONTROL__OPERATION_TYPE);
		createEAttribute(songEventControlEClass, SONG_EVENT_CONTROL__RESERVED_BYTE);
		createEAttribute(songEventControlEClass, SONG_EVENT_CONTROL__RESERVED_SHORT);
		createEAttribute(songEventControlEClass, SONG_EVENT_CONTROL__VALUE);

		songEventDrumNoteEClass = createEClass(SONG_EVENT_DRUM_NOTE);
		createEAttribute(songEventDrumNoteEClass, SONG_EVENT_DRUM_NOTE__RESERVED_BYTE);
		createEAttribute(songEventDrumNoteEClass, SONG_EVENT_DRUM_NOTE__RESERVED_SHORT);

		songEventKeyboardNoteEClass = createEClass(SONG_EVENT_KEYBOARD_NOTE);
		createEAttribute(songEventKeyboardNoteEClass, SONG_EVENT_KEYBOARD_NOTE__LENGTH);
		createEAttribute(songEventKeyboardNoteEClass, SONG_EVENT_KEYBOARD_NOTE__NOTE_NUMBER);

		songEventMuteStatusEClass = createEClass(SONG_EVENT_MUTE_STATUS);
		createEAttribute(songEventMuteStatusEClass, SONG_EVENT_MUTE_STATUS__RESERVED_SHORT);
		createEAttribute(songEventMuteStatusEClass, SONG_EVENT_MUTE_STATUS__MUTE_STATUS);

		songEventTempoEClass = createEClass(SONG_EVENT_TEMPO);
		createEAttribute(songEventTempoEClass, SONG_EVENT_TEMPO__RESERVED_SHORT);
		createEReference(songEventTempoEClass, SONG_EVENT_TEMPO__TEMPO);

		songEventWithPartEClass = createEClass(SONG_EVENT_WITH_PART);
		createEAttribute(songEventWithPartEClass, SONG_EVENT_WITH_PART__PART);

		songPatternEClass = createEClass(SONG_PATTERN);
		createEAttribute(songPatternEClass, SONG_PATTERN__EMPTY);
		createEAttribute(songPatternEClass, SONG_PATTERN__NOTE_OFFSET);
		createEAttribute(songPatternEClass, SONG_PATTERN__PATTERN_POINTER);
		createEAttribute(songPatternEClass, SONG_PATTERN__POSITION_CURRENT);

		tempoEClass = createEClass(TEMPO);
		createEAttribute(tempoEClass, TEMPO__VALUE);

		// Create enums
		ampEgEEnum = createEEnum(AMP_EG);
		arpeggiatorControlEEnum = createEEnum(ARPEGGIATOR_CONTROL);
		arpeggiatorScaleEEnum = createEEnum(ARPEGGIATOR_SCALE);
		audioChannelTypeEEnum = createEEnum(AUDIO_CHANNEL_TYPE);
		audioInModeEEnum = createEEnum(AUDIO_IN_MODE);
		beatEEnum = createEEnum(BEAT);
		bpmSyncEEnum = createEEnum(BPM_SYNC);
		enabledFlagEEnum = createEEnum(ENABLED_FLAG);
		filterTypeEEnum = createEEnum(FILTER_TYPE);
		fxChainEEnum = createEEnum(FX_CHAIN);
		fxSelectEEnum = createEEnum(FX_SELECT);
		fxSendEEnum = createEEnum(FX_SEND);
		fxTypeEEnum = createEEnum(FX_TYPE);
		lastStepEEnum = createEEnum(LAST_STEP);
		midiChannelEEnum = createEEnum(MIDI_CHANNEL);
		midiChannelTypeNameEEnum = createEEnum(MIDI_CHANNEL_TYPE_NAME);
		midiClockEEnum = createEEnum(MIDI_CLOCK);
		midiControlChangeAssignmentNameEEnum = createEEnum(MIDI_CONTROL_CHANGE_ASSIGNMENT_NAME);
		modDestEEnum = createEEnum(MOD_DEST);
		modTypeEEnum = createEEnum(MOD_TYPE);
		motionSequenceStatusEEnum = createEEnum(MOTION_SEQUENCE_STATUS);
		muteHoldEEnum = createEEnum(MUTE_HOLD);
		nextSongNumberEEnum = createEEnum(NEXT_SONG_NUMBER);
		noteNumberEEnum = createEEnum(NOTE_NUMBER);
		operationTypeEEnum = createEEnum(OPERATION_TYPE);
		partNoteNumberNameEEnum = createEEnum(PART_NOTE_NUMBER_NAME);
		patternLengthEEnum = createEEnum(PATTERN_LENGTH);
		patternNumberEEnum = createEEnum(PATTERN_NUMBER);
		pitchBendRangeEEnum = createEEnum(PITCH_BEND_RANGE);
		playLevelEEnum = createEEnum(PLAY_LEVEL);
		reverseEEnum = createEEnum(REVERSE);
		rollEEnum = createEEnum(ROLL);
		rollTypeEEnum = createEEnum(ROLL_TYPE);
		sampleNumberEEnum = createEEnum(SAMPLE_NUMBER);
		songEventPartEEnum = createEEnum(SONG_EVENT_PART);
		songLengthEEnum = createEEnum(SONG_LENGTH);
		songNumberEEnum = createEEnum(SONG_NUMBER);
		stretchStepEEnum = createEEnum(STRETCH_STEP);
		swingEEnum = createEEnum(SWING);
		tempoLockEEnum = createEEnum(TEMPO_LOCK);

		// Create data types
		arrayListEDataType = createEDataType(ARRAY_LIST);
		fileEDataType = createEDataType(FILE);
		inputStreamEDataType = createEDataType(INPUT_STREAM);
		indexOutOfBoundsExceptionEDataType = createEDataType(INDEX_OUT_OF_BOUNDS_EXCEPTION);
		ioExceptionEDataType = createEDataType(IO_EXCEPTION);
		iProgressMonitorEDataType = createEDataType(IPROGRESS_MONITOR);
		objectEDataType = createEDataType(OBJECT);
		riffWaveEDataType = createEDataType(RIFF_WAVE);
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
		addETypeParameter(arrayListEDataType, "E");

		// Set bounds for type parameters

		// Add supertypes to classes
		partAccentEClass.getESuperTypes().add(this.getPart());
		partAccentEClass.getESuperTypes().add(this.getPartWithSequenceData());
		partAudioInEClass.getESuperTypes().add(this.getPart());
		partAudioInEClass.getESuperTypes().add(this.getPartWithCommon());
		partAudioInEClass.getESuperTypes().add(this.getPartWithSequenceData());
		partAudioInEClass.getESuperTypes().add(this.getPartWithSequenceDataGate());
		partDrumEClass.getESuperTypes().add(this.getPart());
		partDrumEClass.getESuperTypes().add(this.getPartWithCommon());
		partDrumEClass.getESuperTypes().add(this.getPartWithPitch());
		partDrumEClass.getESuperTypes().add(this.getPartWithSample());
		partDrumEClass.getESuperTypes().add(this.getPartWithSequenceData());
		partDrumEClass.getESuperTypes().add(this.getPartWithSlice());
		partKeyboardEClass.getESuperTypes().add(this.getPart());
		partKeyboardEClass.getESuperTypes().add(this.getPartWithCommon());
		partKeyboardEClass.getESuperTypes().add(this.getPartWithSample());
		partKeyboardEClass.getESuperTypes().add(this.getPartWithSequenceDataGate());
		partKeyboardEClass.getESuperTypes().add(this.getPartWithSlice());
		partStretchSliceEClass.getESuperTypes().add(this.getPart());
		partStretchSliceEClass.getESuperTypes().add(this.getPartWithCommon());
		partStretchSliceEClass.getESuperTypes().add(this.getPartWithPitch());
		partStretchSliceEClass.getESuperTypes().add(this.getPartWithSample());
		partStretchSliceEClass.getESuperTypes().add(this.getPartWithSequenceData());
		songEventControlEClass.getESuperTypes().add(this.getSongEvent());
		songEventDrumNoteEClass.getESuperTypes().add(this.getSongEvent());
		songEventDrumNoteEClass.getESuperTypes().add(this.getSongEventWithPart());
		songEventKeyboardNoteEClass.getESuperTypes().add(this.getSongEvent());
		songEventKeyboardNoteEClass.getESuperTypes().add(this.getSongEventWithPart());
		songEventMuteStatusEClass.getESuperTypes().add(this.getSongEvent());
		songEventTempoEClass.getESuperTypes().add(this.getSongEvent());

		// Initialize classes and features; add operations and parameters
		initEClass(esxFileEClass, EsxFile.class, "EsxFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEsxFile_OriginalNonAudioData(), ecorePackage.getEByteArray(), "originalNonAudioData", null, 0, 1, EsxFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEsxFile_GlobalParameters(), this.getGlobalParameters(), null, "globalParameters", null, 1, 1, EsxFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEsxFile_Patterns(), this.getPattern(), null, "patterns", null, 256, 256, EsxFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEsxFile_Songs(), this.getSong(), null, "songs", null, 64, 64, EsxFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEsxFile_Samples(), this.getSample(), null, "samples", null, 384, 384, EsxFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEsxFile_EmptyPattern(), this.getPattern(), null, "emptyPattern", null, 1, 1, EsxFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEsxFile_EmptySong(), this.getSong(), null, "emptySong", null, 1, 1, EsxFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEsxFile_MaxSampleOffset(), ecorePackage.getEInt(), "maxSampleOffset", "0", 0, 1, EsxFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEsxFile_MemUsedInBytes(), ecorePackage.getEInt(), "memUsedInBytes", "0", 0, 1, EsxFile.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEsxFile_MemUsedInSeconds(), ecorePackage.getEFloat(), "memUsedInSeconds", "0", 0, 1, EsxFile.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEsxFile_MemFreeInBytes(), ecorePackage.getEInt(), "memFreeInBytes", "0", 0, 1, EsxFile.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEsxFile_MemFreeInSeconds(), ecorePackage.getEFloat(), "memFreeInSeconds", "0", 0, 1, EsxFile.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEsxFile_NumPatternsEmpty(), ecorePackage.getEInt(), "numPatternsEmpty", "0", 0, 1, EsxFile.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEsxFile_NumPatternsNotEmpty(), ecorePackage.getEInt(), "numPatternsNotEmpty", "0", 0, 1, EsxFile.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEsxFile_NumSamplesEmpty(), ecorePackage.getEInt(), "numSamplesEmpty", "0", 0, 1, EsxFile.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEsxFile_NumSamplesNotEmpty(), ecorePackage.getEInt(), "numSamplesNotEmpty", "0", 0, 1, EsxFile.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEsxFile_NumSamplesMonoEmpty(), ecorePackage.getEInt(), "numSamplesMonoEmpty", "0", 0, 1, EsxFile.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEsxFile_NumSamplesMonoNotEmpty(), ecorePackage.getEInt(), "numSamplesMonoNotEmpty", "0", 0, 1, EsxFile.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEsxFile_NumSamplesStereoEmpty(), ecorePackage.getEInt(), "numSamplesStereoEmpty", "0", 0, 1, EsxFile.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEsxFile_NumSamplesStereoNotEmpty(), ecorePackage.getEInt(), "numSamplesStereoNotEmpty", "0", 0, 1, EsxFile.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEsxFile_NumSongsEmpty(), ecorePackage.getEInt(), "numSongsEmpty", "0", 0, 1, EsxFile.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEsxFile_NumSongsNotEmpty(), ecorePackage.getEInt(), "numSongsNotEmpty", "0", 0, 1, EsxFile.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEsxFile_SyncPatternsOnMoveEnabled(), ecorePackage.getEBoolean(), "syncPatternsOnMoveEnabled", "true", 0, 1, EsxFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEsxFile_SyncSamplesOnMoveEnabled(), ecorePackage.getEBoolean(), "syncSamplesOnMoveEnabled", "true", 0, 1, EsxFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(esxFileEClass, this.getPattern(), "getPatternFromPointer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "patternPointer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(esxFileEClass, this.getSample(), "getSampleFromPointer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "samplePointer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(esxFileEClass, null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "b", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(esxFileEClass, null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "b", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProgressMonitor(), "monitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(esxFileEClass, null, "setAllOffsets", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(esxFileEClass, ecorePackage.getEByteArray(), "toByteArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(esxFileEClass, ecorePackage.getEByteArray(), "toByteArray", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProgressMonitor(), "monitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(esxFileEClass, ecorePackage.getEBoolean(), "validMemFreeInBytes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(this.getObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(globalParametersEClass, GlobalParameters.class, "GlobalParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlobalParameters_MemoryProtectEnabled(), this.getEnabledFlag(), "memoryProtectEnabled", null, 0, 1, GlobalParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalParameters_ReservedByte(), ecorePackage.getEByte(), "reservedByte", null, 0, 1, GlobalParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalParameters_ArpeggiatorControl(), this.getArpeggiatorControl(), "arpeggiatorControl", null, 0, 1, GlobalParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalParameters_AudioInMode(), this.getAudioInMode(), "audioInMode", null, 0, 1, GlobalParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalParameters_MidiClock(), this.getMidiClock(), "midiClock", null, 0, 1, GlobalParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalParameters_NoteMessageEnabled(), this.getEnabledFlag(), "noteMessageEnabled", null, 0, 1, GlobalParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalParameters_SystemExEnabled(), this.getEnabledFlag(), "systemExEnabled", null, 0, 1, GlobalParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalParameters_ControlChangeEnabled(), this.getEnabledFlag(), "controlChangeEnabled", null, 0, 1, GlobalParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalParameters_ProgramChangeEnabled(), this.getEnabledFlag(), "programChangeEnabled", null, 0, 1, GlobalParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalParameters_ReservedBitsAfterProgramChangeEnabled(), ecorePackage.getEByte(), "reservedBitsAfterProgramChangeEnabled", null, 0, 1, GlobalParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalParameters_PitchBendRange(), this.getPitchBendRange(), "pitchBendRange", null, 0, 1, GlobalParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalParameters_MidiChannels(), this.getMidiChannelType(), null, "midiChannels", null, 3, 3, GlobalParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalParameters_PartNoteNumbers(), this.getPartNoteNumber(), null, "partNoteNumbers", null, 13, 13, GlobalParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalParameters_MidiControlChangeAssignments(), this.getMidiControlChangeAssignment(), null, "midiControlChangeAssignments", null, 33, 33, GlobalParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalParameters_ReservedLong(), ecorePackage.getELong(), "reservedLong", null, 0, 1, GlobalParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalParameters_PatternSetParameters(), this.getPatternSetParameter(), null, "patternSetParameters", null, 128, 128, GlobalParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(globalParametersEClass, null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "b", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(globalParametersEClass, ecorePackage.getEByteArray(), "toByteArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(midiChannelTypeEClass, MidiChannelType.class, "MidiChannelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMidiChannelType_Name(), this.getMidiChannelTypeName(), "name", null, 0, 1, MidiChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMidiChannelType_MidiChannel(), this.getMidiChannel(), "midiChannel", null, 0, 1, MidiChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(midiControlChangeAssignmentEClass, MidiControlChangeAssignment.class, "MidiControlChangeAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMidiControlChangeAssignment_Name(), this.getMidiControlChangeAssignmentName(), "name", null, 0, 1, MidiControlChangeAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMidiControlChangeAssignment_Value(), ecorePackage.getEByte(), "value", null, 0, 1, MidiControlChangeAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_Value(), ecorePackage.getEByte(), "value", "0", 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parametersFxEClass, ParametersFx.class, "ParametersFx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParametersFx_EffectType(), this.getFxType(), "effectType", null, 0, 1, ParametersFx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParametersFx_Edit1(), ecorePackage.getEByte(), "edit1", null, 0, 1, ParametersFx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParametersFx_Edit2(), ecorePackage.getEByte(), "edit2", null, 0, 1, ParametersFx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParametersFx_MotionSequenceStatus(), ecorePackage.getEByte(), "motionSequenceStatus", null, 0, 1, ParametersFx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(parametersFxEClass, null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "b", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(parametersFxEClass, ecorePackage.getEByteArray(), "toByteArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(parametersMotionEClass, ParametersMotion.class, "ParametersMotion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParametersMotion_CurrentPosition(), ecorePackage.getEInt(), "currentPosition", "-1", 0, 1, ParametersMotion.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getParametersMotion_Empty(), ecorePackage.getEBoolean(), "empty", "true", 0, 1, ParametersMotion.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParametersMotion_Operation(), this.getOperation(), null, "operation", null, 128, 128, ParametersMotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParametersMotion_OperationNumber(), ecorePackage.getEShort(), "operationNumber", null, 0, 1, ParametersMotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParametersMotion_OperationType(), this.getOperationType(), "operationType", "-1", 0, 1, ParametersMotion.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = addEOperation(parametersMotionEClass, null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "b", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(parametersMotionEClass, ecorePackage.getEByteArray(), "toByteArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(partEClass, Part.class, "Part", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPart_Label(), ecorePackage.getEString(), "label", "true", 0, 1, Part.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPart_Level(), ecorePackage.getEByte(), "level", null, 0, 1, Part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPart_MotionSequenceStatus(), ecorePackage.getEByte(), "motionSequenceStatus", null, 0, 1, Part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(partEClass, ecorePackage.getEString(), "getSampleLabel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "sampleNumber", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(partAccentEClass, PartAccent.class, "PartAccent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(partAccentEClass, null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "b", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partAccentEClass, ecorePackage.getEByteArray(), "toByteArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(partAudioInEClass, PartAudioIn.class, "PartAudioIn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartAudioIn_ReservedBitsByte7(), ecorePackage.getEByte(), "reservedBitsByte7", null, 0, 1, PartAudioIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(partAudioInEClass, null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "b", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partAudioInEClass, ecorePackage.getEByteArray(), "toByteArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(partDrumEClass, PartDrum.class, "PartDrum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(partDrumEClass, null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "b", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partDrumEClass, ecorePackage.getEByteArray(), "toByteArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(partKeyboardEClass, PartKeyboard.class, "PartKeyboard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartKeyboard_Glide(), ecorePackage.getEByte(), "glide", null, 0, 1, PartKeyboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartKeyboard_SequenceDataNote(), this.getSequenceDataNote(), null, "sequenceDataNote", null, 0, 1, PartKeyboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(partKeyboardEClass, null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "b", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partKeyboardEClass, ecorePackage.getEByteArray(), "toByteArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(partNoteNumberEClass, PartNoteNumber.class, "PartNoteNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartNoteNumber_Name(), this.getPartNoteNumberName(), "name", null, 0, 1, PartNoteNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartNoteNumber_NoteNumber(), this.getNoteNumber(), "noteNumber", null, 0, 1, PartNoteNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partStretchSliceEClass, PartStretchSlice.class, "PartStretchSlice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(partStretchSliceEClass, null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "b", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partStretchSliceEClass, ecorePackage.getEByteArray(), "toByteArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(partWithCommonEClass, PartWithCommon.class, "PartWithCommon", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartWithCommon_AmpEg(), this.getAmpEg(), "ampEg", null, 0, 1, PartWithCommon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartWithCommon_BpmSync(), this.getBpmSync(), "bpmSync", null, 0, 1, PartWithCommon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartWithCommon_Cutoff(), ecorePackage.getEByte(), "cutoff", null, 0, 1, PartWithCommon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartWithCommon_EgIntensity(), ecorePackage.getEByte(), "egIntensity", null, 0, 1, PartWithCommon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartWithCommon_EgTime(), ecorePackage.getEByte(), "egTime", null, 0, 1, PartWithCommon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartWithCommon_FilterType(), this.getFilterType(), "filterType", null, 0, 1, PartWithCommon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartWithCommon_FxSelect(), this.getFxSelect(), "fxSelect", null, 0, 1, PartWithCommon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartWithCommon_FxSend(), this.getFxSend(), "fxSend", null, 0, 1, PartWithCommon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartWithCommon_ModDepth(), ecorePackage.getEByte(), "modDepth", null, 0, 1, PartWithCommon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartWithCommon_ModDest(), this.getModDest(), "modDest", null, 0, 1, PartWithCommon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartWithCommon_ModSpeed(), ecorePackage.getEByte(), "modSpeed", null, 0, 1, PartWithCommon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartWithCommon_ModType(), this.getModType(), "modType", null, 0, 1, PartWithCommon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartWithCommon_Pan(), ecorePackage.getEByte(), "pan", null, 0, 1, PartWithCommon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartWithCommon_ReservedBitAfterModDepth(), ecorePackage.getEByte(), "reservedBitAfterModDepth", null, 0, 1, PartWithCommon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartWithCommon_Resonance(), ecorePackage.getEByte(), "resonance", null, 0, 1, PartWithCommon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartWithCommon_Roll(), this.getRoll(), "roll", null, 0, 1, PartWithCommon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partWithPitchEClass, PartWithPitch.class, "PartWithPitch", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartWithPitch_Pitch(), ecorePackage.getEByte(), "pitch", null, 0, 1, PartWithPitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partWithSampleEClass, PartWithSample.class, "PartWithSample", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartWithSample_Reverse(), this.getReverse(), "reverse", null, 0, 1, PartWithSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartWithSample_SampleLabel(), ecorePackage.getEString(), "sampleLabel", null, 0, 1, PartWithSample.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartWithSample_SamplePointer(), ecorePackage.getEShort(), "samplePointer", null, 0, 1, PartWithSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartWithSample_StartPoint(), ecorePackage.getEByte(), "startPoint", null, 0, 1, PartWithSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartWithSample_ReservedBitsAfterReverse(), ecorePackage.getEByte(), "reservedBitsAfterReverse", null, 0, 1, PartWithSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partWithSequenceDataEClass, PartWithSequenceData.class, "PartWithSequenceData", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartWithSequenceData_SequenceData(), this.getSequenceData(), null, "sequenceData", null, 0, 1, PartWithSequenceData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partWithSequenceDataGateEClass, PartWithSequenceDataGate.class, "PartWithSequenceDataGate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartWithSequenceDataGate_SequenceDataGate(), this.getSequenceDataGate(), null, "sequenceDataGate", null, 0, 1, PartWithSequenceDataGate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partWithSliceEClass, PartWithSlice.class, "PartWithSlice", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartWithSlice_ReservedByte(), ecorePackage.getEByte(), "reservedByte", null, 0, 1, PartWithSlice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartWithSlice_SliceNumber(), ecorePackage.getEByte(), "sliceNumber", null, 0, 1, PartWithSlice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternEClass, Pattern.class, "Pattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Name(), ecorePackage.getEString(), "name", null, 0, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Label(), ecorePackage.getEString(), "label", "true", 0, 1, Pattern.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_Tempo(), this.getTempo(), null, "tempo", null, 1, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Swing(), this.getSwing(), "swing", null, 0, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_PatternLength(), this.getPatternLength(), "patternLength", null, 0, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_ReservedBitAfterPatternLength(), ecorePackage.getEByte(), "reservedBitAfterPatternLength", null, 0, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Beat(), this.getBeat(), "beat", null, 0, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_RollType(), this.getRollType(), "rollType", null, 0, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_FxChain(), this.getFxChain(), "fxChain", null, 0, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_LastStep(), this.getLastStep(), "lastStep", null, 0, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_ArpeggiatorScale(), this.getArpeggiatorScale(), "arpeggiatorScale", null, 0, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_ReservedBitsAfterArpeggiatorScale(), ecorePackage.getEByte(), "reservedBitsAfterArpeggiatorScale", null, 0, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_ArpeggiatorCenterNote(), this.getNoteNumber(), "arpeggiatorCenterNote", null, 0, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_MuteStatus(), ecorePackage.getEShort(), "muteStatus", null, 0, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_SwingStatus(), ecorePackage.getEShort(), "swingStatus", null, 0, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_OutputBusStatus(), ecorePackage.getEShort(), "outputBusStatus", null, 0, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_AccentStatus(), ecorePackage.getEShort(), "accentStatus", null, 0, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_DrumParts(), this.getPartDrum(), null, "drumParts", null, 9, 9, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_KeyboardParts(), this.getPartKeyboard(), null, "keyboardParts", null, 2, 2, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_StretchSliceParts(), this.getPartStretchSlice(), null, "stretchSliceParts", null, 3, 3, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_AudioInPart(), this.getPartAudioIn(), null, "audioInPart", null, 1, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_AccentPart(), this.getPartAccent(), null, "accentPart", null, 1, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_FxParameters(), this.getParametersFx(), null, "fxParameters", null, 3, 3, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_MotionParameters(), this.getParametersMotion(), null, "motionParameters", null, 24, 24, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Empty(), ecorePackage.getEBoolean(), "empty", "true", 0, 1, Pattern.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_PatternNumberOriginal(), this.getPatternNumber(), "patternNumberOriginal", "-1", 0, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_PatternNumberCurrent(), this.getPatternNumber(), "patternNumberCurrent", "-1", 0, 1, Pattern.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = addEOperation(patternEClass, null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "b", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(patternEClass, null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "b", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "patternNumber", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(patternEClass, ecorePackage.getEByteArray(), "toByteArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sampleInPatternInfoEClass, SampleInPatternInfo.class, "SampleInPatternInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSampleInPatternInfo_Index(), ecorePackage.getEInt(), "index", "0", 0, 1, SampleInPatternInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSampleInPatternInfo_PatternLabel(), ecorePackage.getEString(), "patternLabel", null, 0, 1, SampleInPatternInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSampleInPatternInfo_PartCount(), ecorePackage.getEInt(), "partCount", null, 0, 1, SampleInPatternInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSampleInPatternInfo_PartList(), ecorePackage.getEString(), "partList", null, 0, 1, SampleInPatternInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternSetParameterEClass, PatternSetParameter.class, "PatternSetParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPatternSetParameter_PositionCurrent(), ecorePackage.getEInt(), "positionCurrent", "-1", 0, 1, PatternSetParameter.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatternSetParameter_PatternPointer(), ecorePackage.getEShort(), "patternPointer", null, 0, 1, PatternSetParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sampleEClass, Sample.class, "Sample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSample_Name(), ecorePackage.getEString(), "name", null, 0, 1, Sample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_OffsetChannel1Start(), ecorePackage.getEInt(), "offsetChannel1Start", null, 0, 1, Sample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_OffsetChannel1End(), ecorePackage.getEInt(), "offsetChannel1End", null, 0, 1, Sample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_OffsetChannel2Start(), ecorePackage.getEInt(), "offsetChannel2Start", null, 0, 1, Sample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_OffsetChannel2End(), ecorePackage.getEInt(), "offsetChannel2End", null, 0, 1, Sample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_Start(), ecorePackage.getEInt(), "start", null, 0, 1, Sample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_End(), ecorePackage.getEInt(), "end", null, 0, 1, Sample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_LoopStart(), ecorePackage.getEInt(), "loopStart", null, 0, 1, Sample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_SampleRate(), ecorePackage.getEInt(), "sampleRate", null, 0, 1, Sample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSample_SampleTune(), this.getSampleTune(), null, "sampleTune", null, 1, 1, Sample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_NumberOfSampleFrames(), ecorePackage.getEInt(), "numberOfSampleFrames", null, 0, 1, Sample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_PlayLevel(), this.getPlayLevel(), "playLevel", null, 0, 1, Sample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_StretchStep(), this.getStretchStep(), "stretchStep", null, 0, 1, Sample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_UnknownByteMono1(), ecorePackage.getEByte(), "unknownByteMono1", "0", 0, 1, Sample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_UnknownByteMono2(), ecorePackage.getEByte(), "unknownByteMono2", "0", 0, 1, Sample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_UnknownByteMono3(), ecorePackage.getEByte(), "unknownByteMono3", "0", 0, 1, Sample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_UnknownByteMono4(), ecorePackage.getEByte(), "unknownByteMono4", "0", 0, 1, Sample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_UnknownByteStereo1(), ecorePackage.getEByte(), "unknownByteStereo1", "0", 0, 1, Sample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_UnknownByteStereo2(), ecorePackage.getEByte(), "unknownByteStereo2", "0", 0, 1, Sample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_UnknownByteStereo3(), ecorePackage.getEByte(), "unknownByteStereo3", "0", 0, 1, Sample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_UnknownByteStereo4(), ecorePackage.getEByte(), "unknownByteStereo4", "0", 0, 1, Sample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_AudioDataChannel1(), ecorePackage.getEByteArray(), "audioDataChannel1", "", 0, 1, Sample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_AudioDataChannel2(), ecorePackage.getEByteArray(), "audioDataChannel2", "", 0, 1, Sample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_AudioDataChannelBoth(), ecorePackage.getEByteArray(), "audioDataChannelBoth", null, 0, 1, Sample.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_AudioDataLoopStart(), ecorePackage.getEByteArray(), "audioDataLoopStart", null, 0, 1, Sample.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_SliceArray(), ecorePackage.getEByteArray(), "sliceArray", null, 0, 1, Sample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_Loop(), ecorePackage.getEBoolean(), "loop", null, 0, 1, Sample.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_Slice(), ecorePackage.getEBoolean(), "slice", null, 0, 1, Sample.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_StereoOriginal(), ecorePackage.getEBoolean(), "stereoOriginal", null, 0, 1, Sample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_StereoCurrent(), ecorePackage.getEBoolean(), "stereoCurrent", "true", 0, 1, Sample.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_Label(), ecorePackage.getEString(), "label", "true", 0, 1, Sample.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_MemUsedInBytes(), ecorePackage.getEInt(), "memUsedInBytes", "0", 0, 1, Sample.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_Empty(), ecorePackage.getEBoolean(), "empty", "true", 0, 1, Sample.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_PartCount(), ecorePackage.getEInt(), "partCount", null, 0, 1, Sample.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_PatternCount(), ecorePackage.getEInt(), "patternCount", null, 0, 1, Sample.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSample_SampleInPatternInfoList(), this.getSampleInPatternInfo(), null, "sampleInPatternInfoList", null, 0, -1, Sample.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_SampleNumberOriginal(), this.getSampleNumber(), "sampleNumberOriginal", "-1", 0, 1, Sample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_SampleNumberCurrent(), this.getSampleNumber(), "sampleNumberCurrent", "-1", 0, 1, Sample.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = addEOperation(sampleEClass, null, "export", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFile(), "file", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		op = addEOperation(sampleEClass, null, "initHeaderMono", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "b", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sampleEClass, null, "initHeaderMono", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "b", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "sampleNumber", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sampleEClass, null, "initHeaderStereo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "b", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sampleEClass, null, "initHeaderStereo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "b", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "sampleNumber", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sampleEClass, null, "initOffsetChannel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "b", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAudioChannelType(), "audioChannelType", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sampleEClass, null, "initSliceArray", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "b", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(sampleEClass, ecorePackage.getEByteArray(), "toHeaderMonoByteArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(sampleEClass, ecorePackage.getEByteArray(), "toHeaderStereoByteArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sampleEClass, ecorePackage.getEByteArray(), "toOffsetChannelByteArray", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAudioChannelType(), "audioChannelType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(sampleEClass, ecorePackage.getEByteArray(), "toSliceByteArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(sampleEClass, this.getRIFFWave(), "toRIFFWave", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sampleEClass, null, "toRIFFWaveFile", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFile(), "file", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		addEOperation(sampleEClass, this.getRIFFWave(), "toRIFFWaveMono", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(sampleEClass, this.getRIFFWave(), "toRIFFWaveStereo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sampleTuneEClass, SampleTune.class, "SampleTune", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSampleTune_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, SampleTune.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(sampleTuneEClass, ecorePackage.getEFloat(), "calculateSampleTuneFromSampleRate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "sampleRate", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(sampleTuneEClass, ecorePackage.getEShort(), "getShortFromCurrentValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sampleTuneEClass, null, "setCurrentValueFromShort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "packedShort", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sequenceDataEClass, SequenceData.class, "SequenceData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSequenceData_SequenceData(), ecorePackage.getEByteArray(), "sequenceData", null, 0, 1, SequenceData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceDataGateEClass, SequenceDataGate.class, "SequenceDataGate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSequenceDataGate_SequenceDataGate(), ecorePackage.getEByteArray(), "sequenceDataGate", null, 0, 1, SequenceDataGate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceDataNoteEClass, SequenceDataNote.class, "SequenceDataNote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSequenceDataNote_SequenceDataNote(), ecorePackage.getEByteArray(), "sequenceDataNote", null, 0, 1, SequenceDataNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(songEClass, Song.class, "Song", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSong_Name(), ecorePackage.getEString(), "name", null, 0, 1, Song.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSong_Tempo(), this.getTempo(), null, "tempo", null, 1, 1, Song.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSong_TempoLock(), this.getTempoLock(), "tempoLock", null, 0, 1, Song.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSong_SongLength(), this.getSongLength(), "songLength", null, 0, 1, Song.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSong_MuteHold(), this.getMuteHold(), "muteHold", null, 0, 1, Song.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSong_NextSongNumber(), this.getNextSongNumber(), "nextSongNumber", null, 0, 1, Song.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSong_NumberOfSongEventsCurrent(), ecorePackage.getEShort(), "numberOfSongEventsCurrent", null, 0, 1, Song.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSong_NumberOfSongEventsOriginal(), ecorePackage.getEShort(), "numberOfSongEventsOriginal", "0", 0, 1, Song.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSong_SongPatterns(), this.getSongPattern(), null, "songPatterns", null, 256, 256, Song.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSong_SongEvents(), this.getSongEvent(), null, "songEvents", null, 0, 20000, Song.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSong_Empty(), ecorePackage.getEBoolean(), "empty", "true", 0, 1, Song.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSong_SongNumberOriginal(), this.getSongNumber(), "songNumberOriginal", "-1", 0, 1, Song.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSong_SongNumberCurrent(), this.getSongNumber(), "songNumberCurrent", "-1", 0, 1, Song.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = addEOperation(songEClass, null, "initSong", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "b", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(songEClass, null, "initSong", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "b", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "songNumber", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(songEClass, null, "initSongEvents", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "b", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(songEClass, ecorePackage.getEByteArray(), "toSongByteArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(songEClass, ecorePackage.getEByteArray(), "toSongEventsByteArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(songEventEClass, SongEvent.class, "SongEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSongEvent_CurrentPosition(), ecorePackage.getEInt(), "currentPosition", "-1", 0, 1, SongEvent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSongEvent_EventInfo(), ecorePackage.getEString(), "eventInfo", "-1", 0, 1, SongEvent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSongEvent_EventType(), ecorePackage.getEString(), "eventType", "-1", 0, 1, SongEvent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSongEvent_Measure(), ecorePackage.getEByte(), "measure", null, 0, 1, SongEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSongEvent_OperationNumber(), ecorePackage.getEShort(), "operationNumber", null, 0, 1, SongEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSongEvent_PositionNumber(), ecorePackage.getEByte(), "positionNumber", null, 0, 1, SongEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSongEvent_Step(), ecorePackage.getEByte(), "step", null, 0, 1, SongEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(songEventControlEClass, SongEventControl.class, "SongEventControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSongEventControl_OperationType(), this.getOperationType(), "operationType", "-1", 0, 1, SongEventControl.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSongEventControl_ReservedByte(), ecorePackage.getEByte(), "reservedByte", null, 0, 1, SongEventControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSongEventControl_ReservedShort(), ecorePackage.getEShort(), "reservedShort", "-21846", 0, 1, SongEventControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSongEventControl_Value(), ecorePackage.getEByte(), "value", null, 0, 1, SongEventControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(songEventControlEClass, null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "b", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(songEventControlEClass, ecorePackage.getEByteArray(), "toByteArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(songEventDrumNoteEClass, SongEventDrumNote.class, "SongEventDrumNote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSongEventDrumNote_ReservedByte(), ecorePackage.getEByte(), "reservedByte", null, 0, 1, SongEventDrumNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSongEventDrumNote_ReservedShort(), ecorePackage.getEShort(), "reservedShort", null, 0, 1, SongEventDrumNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(songEventDrumNoteEClass, null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "b", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(songEventDrumNoteEClass, ecorePackage.getEByteArray(), "toByteArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(songEventKeyboardNoteEClass, SongEventKeyboardNote.class, "SongEventKeyboardNote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSongEventKeyboardNote_Length(), ecorePackage.getEShort(), "length", null, 0, 1, SongEventKeyboardNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSongEventKeyboardNote_NoteNumber(), ecorePackage.getEByte(), "noteNumber", null, 0, 1, SongEventKeyboardNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(songEventKeyboardNoteEClass, null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "b", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(songEventKeyboardNoteEClass, ecorePackage.getEByteArray(), "toByteArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(songEventMuteStatusEClass, SongEventMuteStatus.class, "SongEventMuteStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSongEventMuteStatus_ReservedShort(), ecorePackage.getEShort(), "reservedShort", null, 0, 1, SongEventMuteStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSongEventMuteStatus_MuteStatus(), ecorePackage.getEShort(), "muteStatus", null, 0, 1, SongEventMuteStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(songEventMuteStatusEClass, null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "b", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(songEventMuteStatusEClass, ecorePackage.getEByteArray(), "toByteArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(songEventTempoEClass, SongEventTempo.class, "SongEventTempo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSongEventTempo_ReservedShort(), ecorePackage.getEShort(), "reservedShort", null, 0, 1, SongEventTempo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSongEventTempo_Tempo(), this.getTempo(), null, "tempo", null, 1, 1, SongEventTempo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(songEventTempoEClass, null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "b", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(songEventTempoEClass, ecorePackage.getEByteArray(), "toByteArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(songEventWithPartEClass, SongEventWithPart.class, "SongEventWithPart", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSongEventWithPart_Part(), this.getSongEventPart(), "part", null, 0, 1, SongEventWithPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(songPatternEClass, SongPattern.class, "SongPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSongPattern_Empty(), ecorePackage.getEBoolean(), "empty", "true", 0, 1, SongPattern.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSongPattern_NoteOffset(), ecorePackage.getEByte(), "noteOffset", null, 0, 1, SongPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSongPattern_PatternPointer(), ecorePackage.getEShort(), "patternPointer", null, 0, 1, SongPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSongPattern_PositionCurrent(), ecorePackage.getEInt(), "positionCurrent", "-1", 0, 1, SongPattern.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(tempoEClass, Tempo.class, "Tempo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTempo_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, Tempo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(tempoEClass, ecorePackage.getEShort(), "getShortFromCurrentValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(tempoEClass, ecorePackage.getEFloat(), "getValidValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(tempoEClass, null, "setCurrentValueFromShort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "packedShort", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(ampEgEEnum, AmpEg.class, "AmpEg");
		addEEnumLiteral(ampEgEEnum, AmpEg.GATE);
		addEEnumLiteral(ampEgEEnum, AmpEg.EG);

		initEEnum(arpeggiatorControlEEnum, ArpeggiatorControl.class, "ArpeggiatorControl");
		addEEnumLiteral(arpeggiatorControlEEnum, ArpeggiatorControl.NORMAL);
		addEEnumLiteral(arpeggiatorControlEEnum, ArpeggiatorControl.REVERSE);

		initEEnum(arpeggiatorScaleEEnum, ArpeggiatorScale.class, "ArpeggiatorScale");
		addEEnumLiteral(arpeggiatorScaleEEnum, ArpeggiatorScale.CHROMATIC);
		addEEnumLiteral(arpeggiatorScaleEEnum, ArpeggiatorScale.IONIAN);
		addEEnumLiteral(arpeggiatorScaleEEnum, ArpeggiatorScale.DORIAN);
		addEEnumLiteral(arpeggiatorScaleEEnum, ArpeggiatorScale.PHRYGIAN);
		addEEnumLiteral(arpeggiatorScaleEEnum, ArpeggiatorScale.LYDIAN);
		addEEnumLiteral(arpeggiatorScaleEEnum, ArpeggiatorScale.MIXOLYDIAN);
		addEEnumLiteral(arpeggiatorScaleEEnum, ArpeggiatorScale.AEOLIAN);
		addEEnumLiteral(arpeggiatorScaleEEnum, ArpeggiatorScale.LOCRIAN);
		addEEnumLiteral(arpeggiatorScaleEEnum, ArpeggiatorScale.MAJOR_BLUES);
		addEEnumLiteral(arpeggiatorScaleEEnum, ArpeggiatorScale.MINOR_BLUES);
		addEEnumLiteral(arpeggiatorScaleEEnum, ArpeggiatorScale.DIMINISH);
		addEEnumLiteral(arpeggiatorScaleEEnum, ArpeggiatorScale.COMBINATION_DIMINISH);
		addEEnumLiteral(arpeggiatorScaleEEnum, ArpeggiatorScale.MAJOR_PENTATONIC);
		addEEnumLiteral(arpeggiatorScaleEEnum, ArpeggiatorScale.MINOR_PENTATONIC);
		addEEnumLiteral(arpeggiatorScaleEEnum, ArpeggiatorScale.RAGA_BHAIRAV);
		addEEnumLiteral(arpeggiatorScaleEEnum, ArpeggiatorScale.RAGA_GAMANASRAMA);
		addEEnumLiteral(arpeggiatorScaleEEnum, ArpeggiatorScale.RAGA_TODI);
		addEEnumLiteral(arpeggiatorScaleEEnum, ArpeggiatorScale.SPANISH_SCALE);
		addEEnumLiteral(arpeggiatorScaleEEnum, ArpeggiatorScale.GYPSY_SCALE);
		addEEnumLiteral(arpeggiatorScaleEEnum, ArpeggiatorScale.ARABIAN_SCALE);
		addEEnumLiteral(arpeggiatorScaleEEnum, ArpeggiatorScale.EGYPTIAN_SCALE);
		addEEnumLiteral(arpeggiatorScaleEEnum, ArpeggiatorScale.HAWAIIAN_SCALE);
		addEEnumLiteral(arpeggiatorScaleEEnum, ArpeggiatorScale.BALI_ISLAND_SCALE);
		addEEnumLiteral(arpeggiatorScaleEEnum, ArpeggiatorScale.JAPANESE_MIYAKOBUSHI);
		addEEnumLiteral(arpeggiatorScaleEEnum, ArpeggiatorScale.RYUKYU_SCALE);
		addEEnumLiteral(arpeggiatorScaleEEnum, ArpeggiatorScale.WHOLETONE);
		addEEnumLiteral(arpeggiatorScaleEEnum, ArpeggiatorScale.MINOR_3RD_INTERVAL);
		addEEnumLiteral(arpeggiatorScaleEEnum, ArpeggiatorScale.MAJOR_3RD_INTERVAL);
		addEEnumLiteral(arpeggiatorScaleEEnum, ArpeggiatorScale.FOURTH_INTERVAL);
		addEEnumLiteral(arpeggiatorScaleEEnum, ArpeggiatorScale.FIFTH_INTERVAL);
		addEEnumLiteral(arpeggiatorScaleEEnum, ArpeggiatorScale.OCTAVE_INTERVAL);

		initEEnum(audioChannelTypeEEnum, AudioChannelType.class, "AudioChannelType");
		addEEnumLiteral(audioChannelTypeEEnum, AudioChannelType.MONO);
		addEEnumLiteral(audioChannelTypeEEnum, AudioChannelType.STEREO_1);
		addEEnumLiteral(audioChannelTypeEEnum, AudioChannelType.STEREO_2);

		initEEnum(audioInModeEEnum, AudioInMode.class, "AudioInMode");
		addEEnumLiteral(audioInModeEEnum, AudioInMode.MONO);
		addEEnumLiteral(audioInModeEEnum, AudioInMode.STEREO);

		initEEnum(beatEEnum, Beat.class, "Beat");
		addEEnumLiteral(beatEEnum, Beat.BEAT_16TH);
		addEEnumLiteral(beatEEnum, Beat.BEAT_32ND);
		addEEnumLiteral(beatEEnum, Beat.BEAT_8TRI);
		addEEnumLiteral(beatEEnum, Beat.BEAT_16_TRI);

		initEEnum(bpmSyncEEnum, BpmSync.class, "BpmSync");
		addEEnumLiteral(bpmSyncEEnum, BpmSync.OFF);
		addEEnumLiteral(bpmSyncEEnum, BpmSync.ON);

		initEEnum(enabledFlagEEnum, EnabledFlag.class, "EnabledFlag");
		addEEnumLiteral(enabledFlagEEnum, EnabledFlag.DISABLED);
		addEEnumLiteral(enabledFlagEEnum, EnabledFlag.ENABLED);

		initEEnum(filterTypeEEnum, FilterType.class, "FilterType");
		addEEnumLiteral(filterTypeEEnum, FilterType.LPF);
		addEEnumLiteral(filterTypeEEnum, FilterType.HPF);
		addEEnumLiteral(filterTypeEEnum, FilterType.BPF);
		addEEnumLiteral(filterTypeEEnum, FilterType.BPF_PLUS);

		initEEnum(fxChainEEnum, FxChain.class, "FxChain");
		addEEnumLiteral(fxChainEEnum, FxChain.NONE);
		addEEnumLiteral(fxChainEEnum, FxChain.FX_12);
		addEEnumLiteral(fxChainEEnum, FxChain.FX_23);
		addEEnumLiteral(fxChainEEnum, FxChain.FX_123);

		initEEnum(fxSelectEEnum, FxSelect.class, "FxSelect");
		addEEnumLiteral(fxSelectEEnum, FxSelect.FX1);
		addEEnumLiteral(fxSelectEEnum, FxSelect.FX2);
		addEEnumLiteral(fxSelectEEnum, FxSelect.FX3);

		initEEnum(fxSendEEnum, FxSend.class, "FxSend");
		addEEnumLiteral(fxSendEEnum, FxSend.OFF);
		addEEnumLiteral(fxSendEEnum, FxSend.ON);

		initEEnum(fxTypeEEnum, FxType.class, "FxType");
		addEEnumLiteral(fxTypeEEnum, FxType.REVERB);
		addEEnumLiteral(fxTypeEEnum, FxType.BPM_SYNC_DELAY);
		addEEnumLiteral(fxTypeEEnum, FxType.SHORT_DELAY);
		addEEnumLiteral(fxTypeEEnum, FxType.MOD_DELAY);
		addEEnumLiteral(fxTypeEEnum, FxType.GRAIN_SHIFTER);
		addEEnumLiteral(fxTypeEEnum, FxType.CHO_FLG);
		addEEnumLiteral(fxTypeEEnum, FxType.PHASER);
		addEEnumLiteral(fxTypeEEnum, FxType.RING_MOD);
		addEEnumLiteral(fxTypeEEnum, FxType.TALKING_MOD);
		addEEnumLiteral(fxTypeEEnum, FxType.PITCH_SHIFTER);
		addEEnumLiteral(fxTypeEEnum, FxType.COMPRESSOR);
		addEEnumLiteral(fxTypeEEnum, FxType.DISTORTION);
		addEEnumLiteral(fxTypeEEnum, FxType.DECIMATOR);
		addEEnumLiteral(fxTypeEEnum, FxType.EQ);
		addEEnumLiteral(fxTypeEEnum, FxType.LPF);
		addEEnumLiteral(fxTypeEEnum, FxType.HPF);

		initEEnum(lastStepEEnum, LastStep.class, "LastStep");
		addEEnumLiteral(lastStepEEnum, LastStep.LAST_STEP_1);
		addEEnumLiteral(lastStepEEnum, LastStep.LAST_STEP_2);
		addEEnumLiteral(lastStepEEnum, LastStep.LAST_STEP_3);
		addEEnumLiteral(lastStepEEnum, LastStep.LAST_STEP_4);
		addEEnumLiteral(lastStepEEnum, LastStep.LAST_STEP_5);
		addEEnumLiteral(lastStepEEnum, LastStep.LAST_STEP_6);
		addEEnumLiteral(lastStepEEnum, LastStep.LAST_STEP_7);
		addEEnumLiteral(lastStepEEnum, LastStep.LAST_STEP_8);
		addEEnumLiteral(lastStepEEnum, LastStep.LAST_STEP_9);
		addEEnumLiteral(lastStepEEnum, LastStep.LAST_STEP_10);
		addEEnumLiteral(lastStepEEnum, LastStep.LAST_STEP_11);
		addEEnumLiteral(lastStepEEnum, LastStep.LAST_STEP_12);
		addEEnumLiteral(lastStepEEnum, LastStep.LAST_STEP_13);
		addEEnumLiteral(lastStepEEnum, LastStep.LAST_STEP_14);
		addEEnumLiteral(lastStepEEnum, LastStep.LAST_STEP_15);
		addEEnumLiteral(lastStepEEnum, LastStep.LAST_STEP_16);

		initEEnum(midiChannelEEnum, MidiChannel.class, "MidiChannel");
		addEEnumLiteral(midiChannelEEnum, MidiChannel.CHANNEL_1);
		addEEnumLiteral(midiChannelEEnum, MidiChannel.CHANNEL_2);
		addEEnumLiteral(midiChannelEEnum, MidiChannel.CHANNEL_3);
		addEEnumLiteral(midiChannelEEnum, MidiChannel.CHANNEL_4);
		addEEnumLiteral(midiChannelEEnum, MidiChannel.CHANNEL_5);
		addEEnumLiteral(midiChannelEEnum, MidiChannel.CHANNEL_6);
		addEEnumLiteral(midiChannelEEnum, MidiChannel.CHANNEL_7);
		addEEnumLiteral(midiChannelEEnum, MidiChannel.CHANNEL_8);
		addEEnumLiteral(midiChannelEEnum, MidiChannel.CHANNEL_9);
		addEEnumLiteral(midiChannelEEnum, MidiChannel.CHANNEL_10);
		addEEnumLiteral(midiChannelEEnum, MidiChannel.CHANNEL_11);
		addEEnumLiteral(midiChannelEEnum, MidiChannel.CHANNEL_12);
		addEEnumLiteral(midiChannelEEnum, MidiChannel.CHANNEL_13);
		addEEnumLiteral(midiChannelEEnum, MidiChannel.CHANNEL_14);
		addEEnumLiteral(midiChannelEEnum, MidiChannel.CHANNEL_15);
		addEEnumLiteral(midiChannelEEnum, MidiChannel.CHANNEL_16);

		initEEnum(midiChannelTypeNameEEnum, MidiChannelTypeName.class, "MidiChannelTypeName");
		addEEnumLiteral(midiChannelTypeNameEEnum, MidiChannelTypeName.NAME_00);
		addEEnumLiteral(midiChannelTypeNameEEnum, MidiChannelTypeName.NAME_01);
		addEEnumLiteral(midiChannelTypeNameEEnum, MidiChannelTypeName.NAME_02);

		initEEnum(midiClockEEnum, MidiClock.class, "MidiClock");
		addEEnumLiteral(midiClockEEnum, MidiClock.INT);
		addEEnumLiteral(midiClockEEnum, MidiClock.EXT);
		addEEnumLiteral(midiClockEEnum, MidiClock.AUTO);

		initEEnum(midiControlChangeAssignmentNameEEnum, MidiControlChangeAssignmentName.class, "MidiControlChangeAssignmentName");
		addEEnumLiteral(midiControlChangeAssignmentNameEEnum, MidiControlChangeAssignmentName.NAME_00);
		addEEnumLiteral(midiControlChangeAssignmentNameEEnum, MidiControlChangeAssignmentName.NAME_01);
		addEEnumLiteral(midiControlChangeAssignmentNameEEnum, MidiControlChangeAssignmentName.NAME_02);
		addEEnumLiteral(midiControlChangeAssignmentNameEEnum, MidiControlChangeAssignmentName.NAME_03);
		addEEnumLiteral(midiControlChangeAssignmentNameEEnum, MidiControlChangeAssignmentName.NAME_04);
		addEEnumLiteral(midiControlChangeAssignmentNameEEnum, MidiControlChangeAssignmentName.NAME_05);
		addEEnumLiteral(midiControlChangeAssignmentNameEEnum, MidiControlChangeAssignmentName.NAME_06);
		addEEnumLiteral(midiControlChangeAssignmentNameEEnum, MidiControlChangeAssignmentName.NAME_07);
		addEEnumLiteral(midiControlChangeAssignmentNameEEnum, MidiControlChangeAssignmentName.NAME_08);
		addEEnumLiteral(midiControlChangeAssignmentNameEEnum, MidiControlChangeAssignmentName.NAME_09);
		addEEnumLiteral(midiControlChangeAssignmentNameEEnum, MidiControlChangeAssignmentName.NAME_10);
		addEEnumLiteral(midiControlChangeAssignmentNameEEnum, MidiControlChangeAssignmentName.NAME_11);
		addEEnumLiteral(midiControlChangeAssignmentNameEEnum, MidiControlChangeAssignmentName.NAME_12);
		addEEnumLiteral(midiControlChangeAssignmentNameEEnum, MidiControlChangeAssignmentName.NAME_13);
		addEEnumLiteral(midiControlChangeAssignmentNameEEnum, MidiControlChangeAssignmentName.NAME_14);
		addEEnumLiteral(midiControlChangeAssignmentNameEEnum, MidiControlChangeAssignmentName.NAME_15);
		addEEnumLiteral(midiControlChangeAssignmentNameEEnum, MidiControlChangeAssignmentName.NAME_16);
		addEEnumLiteral(midiControlChangeAssignmentNameEEnum, MidiControlChangeAssignmentName.NAME_17);
		addEEnumLiteral(midiControlChangeAssignmentNameEEnum, MidiControlChangeAssignmentName.NAME_18);
		addEEnumLiteral(midiControlChangeAssignmentNameEEnum, MidiControlChangeAssignmentName.NAME_19);
		addEEnumLiteral(midiControlChangeAssignmentNameEEnum, MidiControlChangeAssignmentName.NAME_20);
		addEEnumLiteral(midiControlChangeAssignmentNameEEnum, MidiControlChangeAssignmentName.NAME_21);
		addEEnumLiteral(midiControlChangeAssignmentNameEEnum, MidiControlChangeAssignmentName.NAME_22);
		addEEnumLiteral(midiControlChangeAssignmentNameEEnum, MidiControlChangeAssignmentName.NAME_23);
		addEEnumLiteral(midiControlChangeAssignmentNameEEnum, MidiControlChangeAssignmentName.NAME_24);
		addEEnumLiteral(midiControlChangeAssignmentNameEEnum, MidiControlChangeAssignmentName.NAME_25);
		addEEnumLiteral(midiControlChangeAssignmentNameEEnum, MidiControlChangeAssignmentName.NAME_26);
		addEEnumLiteral(midiControlChangeAssignmentNameEEnum, MidiControlChangeAssignmentName.NAME_27);
		addEEnumLiteral(midiControlChangeAssignmentNameEEnum, MidiControlChangeAssignmentName.NAME_28);
		addEEnumLiteral(midiControlChangeAssignmentNameEEnum, MidiControlChangeAssignmentName.NAME_29);
		addEEnumLiteral(midiControlChangeAssignmentNameEEnum, MidiControlChangeAssignmentName.NAME_30);
		addEEnumLiteral(midiControlChangeAssignmentNameEEnum, MidiControlChangeAssignmentName.NAME_31);
		addEEnumLiteral(midiControlChangeAssignmentNameEEnum, MidiControlChangeAssignmentName.NAME_32);

		initEEnum(modDestEEnum, ModDest.class, "ModDest");
		addEEnumLiteral(modDestEEnum, ModDest.PITCH);
		addEEnumLiteral(modDestEEnum, ModDest.CUTOFF);
		addEEnumLiteral(modDestEEnum, ModDest.AMP);
		addEEnumLiteral(modDestEEnum, ModDest.PAN);

		initEEnum(modTypeEEnum, ModType.class, "ModType");
		addEEnumLiteral(modTypeEEnum, ModType.SAWTOOTH);
		addEEnumLiteral(modTypeEEnum, ModType.SQUARE);
		addEEnumLiteral(modTypeEEnum, ModType.TRIANGLE);
		addEEnumLiteral(modTypeEEnum, ModType.SAND_H);
		addEEnumLiteral(modTypeEEnum, ModType.ENVELOPE);

		initEEnum(motionSequenceStatusEEnum, MotionSequenceStatus.class, "MotionSequenceStatus");
		addEEnumLiteral(motionSequenceStatusEEnum, MotionSequenceStatus.OFF);
		addEEnumLiteral(motionSequenceStatusEEnum, MotionSequenceStatus.SMOOTH);
		addEEnumLiteral(motionSequenceStatusEEnum, MotionSequenceStatus.TRIG_HOLD);

		initEEnum(muteHoldEEnum, MuteHold.class, "MuteHold");
		addEEnumLiteral(muteHoldEEnum, MuteHold.MUTE_HOLD_OFF);
		addEEnumLiteral(muteHoldEEnum, MuteHold.MUTE_HOLD_ON);

		initEEnum(nextSongNumberEEnum, NextSongNumber.class, "NextSongNumber");
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_00);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_01);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_02);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_03);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_04);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_05);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_06);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_07);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_08);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_09);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_10);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_11);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_12);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_13);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_14);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_15);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_16);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_17);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_18);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_19);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_20);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_21);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_22);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_23);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_24);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_25);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_26);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_27);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_28);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_29);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_30);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_31);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_32);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_33);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_34);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_35);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_36);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_37);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_38);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_39);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_40);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_41);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_42);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_43);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_44);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_45);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_46);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_47);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_48);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_49);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_50);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_51);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_52);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_53);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_54);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_55);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_56);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_57);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_58);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_59);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_60);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_61);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_62);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_63);
		addEEnumLiteral(nextSongNumberEEnum, NextSongNumber.NEXT_SONG_NUMBER_64);

		initEEnum(noteNumberEEnum, NoteNumber.class, "NoteNumber");
		addEEnumLiteral(noteNumberEEnum, NoteNumber.CN1);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.CSN1);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.DN1);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.DSN1);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.EN1);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.FN1);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.FSN1);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.GN1);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.GSN1);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.AN1);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.ASN1);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.BN1);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.C0);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.CS10);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.D0);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.DS0);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.E0);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.F0);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.FS0);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.G0);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.GS0);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.A0);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.AS0);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.B0);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.C1);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.CS11);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.D1);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.DS1);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.E1);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.F1);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.FS1);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.G1);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.GS1);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.A1);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.AS1);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.B1);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.C2);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.CS12);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.D2);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.DS2);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.E2);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.F2);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.FS2);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.G2);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.GS2);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.A2);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.AS2);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.B2);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.C3);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.CS13);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.D3);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.DS3);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.E3);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.F3);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.FS3);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.G3);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.GS3);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.A3);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.AS3);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.B3);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.C4);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.CS14);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.D4);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.DS4);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.E4);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.F4);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.FS4);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.G4);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.GS4);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.A4);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.AS4);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.B4);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.C5);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.CS15);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.D5);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.DS5);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.E5);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.F5);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.FS5);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.G5);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.GS5);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.A5);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.AS5);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.B5);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.C6);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.CS16);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.D6);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.DS6);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.E6);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.F6);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.FS6);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.G6);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.GS6);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.A6);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.AS6);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.B6);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.C7);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.CS17);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.D7);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.DS7);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.E7);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.F7);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.FS7);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.G7);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.GS7);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.A7);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.AS7);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.B7);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.C8);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.CS18);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.D8);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.DS8);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.E8);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.F8);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.FS8);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.G8);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.GS8);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.A8);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.AS8);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.B8);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.C9);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.CS19);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.D9);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.DS9);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.E9);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.F9);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.FS9);
		addEEnumLiteral(noteNumberEEnum, NoteNumber.G9);

		initEEnum(operationTypeEEnum, OperationType.class, "OperationType");
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_UNKNOWN);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_004);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_005);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_006);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_007);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_008);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_009);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_00A);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_00B);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_00C);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_00D);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_00E);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_00F);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_010);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_011);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_012);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_013);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_014);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_015);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_016);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_017);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_024);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_025);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_026);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_027);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_028);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_029);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_02A);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_02B);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_02C);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_02D);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_02E);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_02F);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_030);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_031);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_032);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_033);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_034);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_035);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_036);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_037);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_044);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_045);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_046);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_047);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_048);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_049);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_04A);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_04B);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_04C);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_04D);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_04E);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_04F);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_050);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_051);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_052);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_053);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_054);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_055);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_056);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_057);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_064);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_065);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_066);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_067);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_068);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_069);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_06A);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_06B);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_06C);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_06D);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_06E);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_06F);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_070);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_071);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_072);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_073);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_074);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_075);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_076);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_077);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_084);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_085);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_086);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_087);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_088);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_089);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_08A);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_08B);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_08C);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_08D);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_08E);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_08F);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_090);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_091);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_092);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_093);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_094);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_095);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_096);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_097);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0A4);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0A5);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0A6);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0A7);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0A8);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0A9);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0AA);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0AB);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0AC);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0AD);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0AE);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0AF);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0B0);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0B1);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0B2);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0B3);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0B4);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0B5);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0B6);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0B7);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0C4);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0C5);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0C6);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0C7);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0C8);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0C9);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0CA);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0CB);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0CC);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0CD);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0CE);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0CF);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0D0);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0D1);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0D2);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0D3);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0D4);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0D5);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0D6);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0D7);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0E4);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0E5);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0E6);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0E7);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0E8);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0E9);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0EA);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0EB);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0EC);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0ED);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0EE);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0EF);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0F0);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0F1);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0F2);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0F3);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0F4);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0F5);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0F6);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_0F7);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_104);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_105);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_106);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_107);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_108);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_109);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_10A);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_10B);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_10C);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_10D);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_10E);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_10F);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_110);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_111);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_112);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_113);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_114);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_115);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_116);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_117);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_123);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_125);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_126);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_127);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_128);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_129);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_12A);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_12B);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_12C);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_12D);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_12E);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_12F);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_130);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_131);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_132);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_133);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_134);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_135);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_136);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_137);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_143);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_145);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_146);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_147);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_148);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_149);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_14A);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_14B);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_14C);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_14D);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_14E);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_14F);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_150);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_151);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_152);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_153);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_154);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_155);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_156);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_157);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_164);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_165);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_166);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_167);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_168);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_169);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_16A);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_16B);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_16C);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_16D);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_16E);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_16F);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_170);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_171);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_172);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_173);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_174);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_175);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_176);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_177);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_184);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_185);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_186);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_187);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_188);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_189);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_18A);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_18B);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_18C);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_18D);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_18E);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_18F);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_190);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_191);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_192);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_193);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_194);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_195);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_196);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_197);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1A4);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1A5);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1A6);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1A7);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1A8);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1A9);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1AA);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1AB);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1AC);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1AD);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1AE);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1AF);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1B0);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1B1);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1B2);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1B3);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1B4);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1B5);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1B6);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1B7);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1C5);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1C6);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1C7);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1C8);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1CA);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1CB);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1CC);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1CD);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1CE);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1D0);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1D1);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1D2);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1D3);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1D4);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1D5);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1D6);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1D7);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1E0);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1E1);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1E4);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1E5);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1E6);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1E7);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1E8);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1E9);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1EA);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1EB);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1EC);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1ED);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1EE);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1EF);
		addEEnumLiteral(operationTypeEEnum, OperationType.OP_1F5);

		initEEnum(partNoteNumberNameEEnum, PartNoteNumberName.class, "PartNoteNumberName");
		addEEnumLiteral(partNoteNumberNameEEnum, PartNoteNumberName.NAME_00);
		addEEnumLiteral(partNoteNumberNameEEnum, PartNoteNumberName.NAME_01);
		addEEnumLiteral(partNoteNumberNameEEnum, PartNoteNumberName.NAME_02);
		addEEnumLiteral(partNoteNumberNameEEnum, PartNoteNumberName.NAME_03);
		addEEnumLiteral(partNoteNumberNameEEnum, PartNoteNumberName.NAME_04);
		addEEnumLiteral(partNoteNumberNameEEnum, PartNoteNumberName.NAME_05);
		addEEnumLiteral(partNoteNumberNameEEnum, PartNoteNumberName.NAME_06);
		addEEnumLiteral(partNoteNumberNameEEnum, PartNoteNumberName.NAME_07);
		addEEnumLiteral(partNoteNumberNameEEnum, PartNoteNumberName.NAME_08);
		addEEnumLiteral(partNoteNumberNameEEnum, PartNoteNumberName.NAME_09);
		addEEnumLiteral(partNoteNumberNameEEnum, PartNoteNumberName.NAME_10);
		addEEnumLiteral(partNoteNumberNameEEnum, PartNoteNumberName.NAME_11);
		addEEnumLiteral(partNoteNumberNameEEnum, PartNoteNumberName.NAME_12);

		initEEnum(patternLengthEEnum, PatternLength.class, "PatternLength");
		addEEnumLiteral(patternLengthEEnum, PatternLength.LENGTH_1);
		addEEnumLiteral(patternLengthEEnum, PatternLength.LENGTH_2);
		addEEnumLiteral(patternLengthEEnum, PatternLength.LENGTH_3);
		addEEnumLiteral(patternLengthEEnum, PatternLength.LENGTH_4);
		addEEnumLiteral(patternLengthEEnum, PatternLength.LENGTH_5);
		addEEnumLiteral(patternLengthEEnum, PatternLength.LENGTH_6);
		addEEnumLiteral(patternLengthEEnum, PatternLength.LENGTH_7);
		addEEnumLiteral(patternLengthEEnum, PatternLength.LENGTH_8);

		initEEnum(patternNumberEEnum, PatternNumber.class, "PatternNumber");
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A01);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A02);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A03);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A04);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A05);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A06);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A07);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A08);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A09);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A10);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A11);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A12);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A13);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A14);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A15);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A16);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A17);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A18);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A19);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A20);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A21);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A22);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A23);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A24);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A25);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A26);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A27);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A28);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A29);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A30);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A31);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A32);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A33);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A34);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A35);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A36);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A37);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A38);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A39);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A40);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A41);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A42);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A43);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A44);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A45);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A46);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A47);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A48);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A49);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A50);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A51);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A52);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A53);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A54);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A55);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A56);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A57);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A58);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A59);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A60);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A61);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A62);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A63);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_A64);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B01);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B02);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B03);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B04);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B05);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B06);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B07);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B08);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B09);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B10);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B11);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B12);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B13);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B14);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B15);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B16);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B17);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B18);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B19);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B20);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B21);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B22);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B23);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B24);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B25);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B26);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B27);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B28);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B29);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B30);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B31);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B32);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B33);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B34);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B35);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B36);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B37);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B38);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B39);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B40);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B41);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B42);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B43);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B44);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B45);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B46);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B47);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B48);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B49);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B50);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B51);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B52);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B53);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B54);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B55);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B56);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B57);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B58);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B59);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B60);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B61);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B62);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B63);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_B64);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C01);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C02);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C03);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C04);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C05);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C06);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C07);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C08);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C09);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C10);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C11);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C12);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C13);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C14);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C15);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C16);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C17);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C18);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C19);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C20);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C21);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C22);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C23);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C24);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C25);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C26);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C27);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C28);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C29);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C30);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C31);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C32);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C33);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C34);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C35);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C36);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C37);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C38);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C39);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C40);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C41);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C42);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C43);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C44);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C45);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C46);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C47);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C48);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C49);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C50);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C51);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C52);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C53);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C54);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C55);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C56);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C57);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C58);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C59);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C60);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C61);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C62);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C63);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_C64);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D01);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D02);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D03);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D04);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D05);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D06);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D07);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D08);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D09);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D10);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D11);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D12);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D13);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D14);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D15);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D16);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D17);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D18);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D19);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D20);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D21);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D22);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D23);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D24);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D25);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D26);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D27);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D28);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D29);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D30);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D31);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D32);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D33);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D34);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D35);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D36);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D37);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D38);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D39);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D40);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D41);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D42);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D43);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D44);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D45);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D46);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D47);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D48);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D49);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D50);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D51);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D52);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D53);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D54);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D55);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D56);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D57);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D58);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D59);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D60);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D61);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D62);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D63);
		addEEnumLiteral(patternNumberEEnum, PatternNumber.PATTERN_D64);

		initEEnum(pitchBendRangeEEnum, PitchBendRange.class, "PitchBendRange");
		addEEnumLiteral(pitchBendRangeEEnum, PitchBendRange.PITCH_BEND_N12);
		addEEnumLiteral(pitchBendRangeEEnum, PitchBendRange.PITCH_BEND_N11);
		addEEnumLiteral(pitchBendRangeEEnum, PitchBendRange.PITCH_BEND_N10);
		addEEnumLiteral(pitchBendRangeEEnum, PitchBendRange.PITCH_BEND_N9);
		addEEnumLiteral(pitchBendRangeEEnum, PitchBendRange.PITCH_BEND_N8);
		addEEnumLiteral(pitchBendRangeEEnum, PitchBendRange.PITCH_BEND_N7);
		addEEnumLiteral(pitchBendRangeEEnum, PitchBendRange.PITCH_BEND_N6);
		addEEnumLiteral(pitchBendRangeEEnum, PitchBendRange.PITCH_BEND_N5);
		addEEnumLiteral(pitchBendRangeEEnum, PitchBendRange.PITCH_BEND_N4);
		addEEnumLiteral(pitchBendRangeEEnum, PitchBendRange.PITCH_BEND_N3);
		addEEnumLiteral(pitchBendRangeEEnum, PitchBendRange.PITCH_BEND_N2);
		addEEnumLiteral(pitchBendRangeEEnum, PitchBendRange.PITCH_BEND_N1);
		addEEnumLiteral(pitchBendRangeEEnum, PitchBendRange.PITCH_BEND_0);
		addEEnumLiteral(pitchBendRangeEEnum, PitchBendRange.PITCH_BEND_1);
		addEEnumLiteral(pitchBendRangeEEnum, PitchBendRange.PITCH_BEND_2);
		addEEnumLiteral(pitchBendRangeEEnum, PitchBendRange.PITCH_BEND_3);
		addEEnumLiteral(pitchBendRangeEEnum, PitchBendRange.PITCH_BEND_4);
		addEEnumLiteral(pitchBendRangeEEnum, PitchBendRange.PITCH_BEND_5);
		addEEnumLiteral(pitchBendRangeEEnum, PitchBendRange.PITCH_BEND_6);
		addEEnumLiteral(pitchBendRangeEEnum, PitchBendRange.PITCH_BEND_7);
		addEEnumLiteral(pitchBendRangeEEnum, PitchBendRange.PITCH_BEND_8);
		addEEnumLiteral(pitchBendRangeEEnum, PitchBendRange.PITCH_BEND_9);
		addEEnumLiteral(pitchBendRangeEEnum, PitchBendRange.PITCH_BEND_10);
		addEEnumLiteral(pitchBendRangeEEnum, PitchBendRange.PITCH_BEND_11);
		addEEnumLiteral(pitchBendRangeEEnum, PitchBendRange.PITCH_BEND_12);

		initEEnum(playLevelEEnum, PlayLevel.class, "PlayLevel");
		addEEnumLiteral(playLevelEEnum, PlayLevel.DB_0);
		addEEnumLiteral(playLevelEEnum, PlayLevel.DB_1);

		initEEnum(reverseEEnum, Reverse.class, "Reverse");
		addEEnumLiteral(reverseEEnum, Reverse.OFF);
		addEEnumLiteral(reverseEEnum, Reverse.ON);

		initEEnum(rollEEnum, Roll.class, "Roll");
		addEEnumLiteral(rollEEnum, Roll.OFF);
		addEEnumLiteral(rollEEnum, Roll.ON);

		initEEnum(rollTypeEEnum, RollType.class, "RollType");
		addEEnumLiteral(rollTypeEEnum, RollType.ROLL_2);
		addEEnumLiteral(rollTypeEEnum, RollType.ROLL_3);
		addEEnumLiteral(rollTypeEEnum, RollType.ROLL_4);

		initEEnum(sampleNumberEEnum, SampleNumber.class, "SampleNumber");
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_OFF);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M000);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M001);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M002);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M003);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M004);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M005);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M006);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M007);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M008);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M009);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M010);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M011);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M012);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M013);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M014);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M015);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M016);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M017);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M018);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M019);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M020);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M021);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M022);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M023);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M024);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M025);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M026);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M027);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M028);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M029);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M030);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M031);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M032);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M033);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M034);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M035);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M036);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M037);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M038);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M039);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M040);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M041);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M042);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M043);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M044);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M045);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M046);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M047);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M048);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M049);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M050);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M051);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M052);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M053);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M054);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M055);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M056);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M057);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M058);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M059);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M060);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M061);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M062);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M063);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M064);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M065);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M066);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M067);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M068);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M069);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M070);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M071);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M072);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M073);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M074);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M075);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M076);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M077);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M078);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M079);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M080);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M081);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M082);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M083);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M084);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M085);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M086);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M087);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M088);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M089);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M090);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M091);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M092);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M093);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M094);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M095);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M096);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M097);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M098);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M099);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M100);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M101);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M102);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M103);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M104);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M105);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M106);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M107);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M108);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M109);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M110);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M111);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M112);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M113);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M114);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M115);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M116);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M117);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M118);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M119);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M120);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M121);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M122);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M123);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M124);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M125);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M126);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M127);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M128);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M129);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M130);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M131);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M132);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M133);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M134);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M135);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M136);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M137);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M138);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M139);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M140);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M141);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M142);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M143);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M144);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M145);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M146);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M147);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M148);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M149);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M150);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M151);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M152);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M153);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M154);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M155);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M156);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M157);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M158);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M159);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M160);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M161);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M162);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M163);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M164);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M165);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M166);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M167);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M168);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M169);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M170);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M171);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M172);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M173);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M174);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M175);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M176);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M177);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M178);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M179);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M180);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M181);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M182);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M183);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M184);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M185);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M186);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M187);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M188);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M189);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M190);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M191);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M192);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M193);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M194);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M195);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M196);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M197);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M198);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M199);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M200);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M201);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M202);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M203);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M204);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M205);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M206);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M207);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M208);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M209);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M210);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M211);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M212);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M213);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M214);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M215);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M216);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M217);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M218);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M219);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M220);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M221);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M222);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M223);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M224);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M225);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M226);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M227);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M228);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M229);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M230);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M231);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M232);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M233);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M234);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M235);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M236);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M237);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M238);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M239);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M240);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M241);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M242);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M243);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M244);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M245);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M246);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M247);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M248);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M249);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M250);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M251);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M252);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M253);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M254);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_M255);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S000);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S001);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S002);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S003);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S004);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S005);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S006);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S007);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S008);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S009);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S010);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S011);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S012);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S013);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S014);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S015);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S016);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S017);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S018);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S019);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S020);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S021);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S022);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S023);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S024);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S025);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S026);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S027);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S028);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S029);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S030);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S031);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S032);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S033);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S034);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S035);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S036);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S037);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S038);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S039);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S040);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S041);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S042);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S043);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S044);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S045);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S046);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S047);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S048);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S049);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S050);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S051);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S052);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S053);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S054);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S055);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S056);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S057);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S058);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S059);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S060);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S061);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S062);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S063);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S064);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S065);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S066);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S067);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S068);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S069);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S070);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S071);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S072);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S073);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S074);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S075);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S076);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S077);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S078);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S079);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S080);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S081);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S082);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S083);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S084);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S085);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S086);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S087);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S088);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S089);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S090);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S091);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S092);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S093);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S094);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S095);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S096);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S097);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S098);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S099);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S100);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S101);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S102);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S103);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S104);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S105);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S106);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S107);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S108);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S109);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S110);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S111);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S112);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S113);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S114);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S115);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S116);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S117);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S118);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S119);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S120);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S121);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S122);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S123);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S124);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S125);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S126);
		addEEnumLiteral(sampleNumberEEnum, SampleNumber.SAMPLE_S127);

		initEEnum(songEventPartEEnum, SongEventPart.class, "SongEventPart");
		addEEnumLiteral(songEventPartEEnum, SongEventPart.NAME_00);
		addEEnumLiteral(songEventPartEEnum, SongEventPart.NAME_01);
		addEEnumLiteral(songEventPartEEnum, SongEventPart.NAME_02);
		addEEnumLiteral(songEventPartEEnum, SongEventPart.NAME_03);
		addEEnumLiteral(songEventPartEEnum, SongEventPart.NAME_04);
		addEEnumLiteral(songEventPartEEnum, SongEventPart.NAME_05);
		addEEnumLiteral(songEventPartEEnum, SongEventPart.NAME_06);
		addEEnumLiteral(songEventPartEEnum, SongEventPart.NAME_07);
		addEEnumLiteral(songEventPartEEnum, SongEventPart.NAME_08);
		addEEnumLiteral(songEventPartEEnum, SongEventPart.NAME_09);
		addEEnumLiteral(songEventPartEEnum, SongEventPart.NAME_10);
		addEEnumLiteral(songEventPartEEnum, SongEventPart.NAME_11);
		addEEnumLiteral(songEventPartEEnum, SongEventPart.NAME_12);
		addEEnumLiteral(songEventPartEEnum, SongEventPart.NAME_13);
		addEEnumLiteral(songEventPartEEnum, SongEventPart.NAME_14);
		addEEnumLiteral(songEventPartEEnum, SongEventPart.NAME_15);

		initEEnum(songLengthEEnum, SongLength.class, "SongLength");
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_001);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_002);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_003);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_004);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_005);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_006);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_007);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_008);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_009);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_010);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_011);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_012);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_013);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_014);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_015);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_016);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_017);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_018);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_019);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_020);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_021);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_022);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_023);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_024);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_025);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_026);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_027);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_028);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_029);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_030);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_031);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_032);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_033);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_034);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_035);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_036);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_037);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_038);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_039);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_040);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_041);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_042);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_043);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_044);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_045);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_046);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_047);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_048);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_049);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_050);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_051);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_052);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_053);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_054);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_055);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_056);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_057);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_058);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_059);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_060);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_061);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_062);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_063);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_064);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_065);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_066);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_067);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_068);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_069);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_070);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_071);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_072);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_073);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_074);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_075);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_076);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_077);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_078);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_079);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_080);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_081);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_082);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_083);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_084);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_085);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_086);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_087);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_088);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_089);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_090);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_091);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_092);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_093);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_094);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_095);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_096);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_097);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_098);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_099);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_100);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_101);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_102);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_103);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_104);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_105);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_106);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_107);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_108);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_109);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_110);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_111);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_112);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_113);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_114);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_115);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_116);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_117);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_118);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_119);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_120);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_121);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_122);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_123);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_124);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_125);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_126);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_127);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_128);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_129);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_130);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_131);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_132);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_133);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_134);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_135);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_136);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_137);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_138);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_139);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_140);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_141);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_142);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_143);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_144);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_145);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_146);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_147);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_148);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_149);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_150);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_151);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_152);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_153);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_154);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_155);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_156);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_157);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_158);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_159);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_160);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_161);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_162);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_163);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_164);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_165);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_166);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_167);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_168);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_169);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_170);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_171);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_172);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_173);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_174);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_175);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_176);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_177);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_178);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_179);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_180);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_181);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_182);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_183);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_184);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_185);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_186);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_187);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_188);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_189);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_190);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_191);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_192);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_193);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_194);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_195);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_196);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_197);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_198);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_199);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_200);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_201);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_202);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_203);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_204);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_205);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_206);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_207);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_208);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_209);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_210);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_211);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_212);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_213);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_214);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_215);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_216);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_217);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_218);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_219);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_220);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_221);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_222);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_223);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_224);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_225);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_226);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_227);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_228);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_229);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_230);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_231);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_232);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_233);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_234);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_235);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_236);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_237);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_238);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_239);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_240);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_241);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_242);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_243);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_244);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_245);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_246);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_247);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_248);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_249);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_250);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_251);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_252);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_253);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_254);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_255);
		addEEnumLiteral(songLengthEEnum, SongLength.SONG_LENGTH_256);

		initEEnum(songNumberEEnum, SongNumber.class, "SongNumber");
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_01);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_02);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_03);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_04);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_05);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_06);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_07);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_08);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_09);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_10);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_11);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_12);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_13);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_14);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_15);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_16);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_17);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_18);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_19);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_20);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_21);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_22);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_23);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_24);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_25);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_26);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_27);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_28);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_29);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_30);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_31);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_32);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_33);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_34);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_35);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_36);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_37);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_38);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_39);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_40);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_41);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_42);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_43);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_44);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_45);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_46);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_47);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_48);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_49);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_50);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_51);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_52);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_53);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_54);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_55);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_56);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_57);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_58);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_59);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_60);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_61);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_62);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_63);
		addEEnumLiteral(songNumberEEnum, SongNumber.SONG_64);

		initEEnum(stretchStepEEnum, StretchStep.class, "StretchStep");
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP_OFF);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP001);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP002);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP003);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP004);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP005);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP006);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP007);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP008);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP009);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP010);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP011);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP012);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP013);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP014);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP015);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP016);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP017);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP018);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP019);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP020);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP021);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP022);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP023);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP024);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP025);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP026);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP027);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP028);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP029);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP030);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP031);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP032);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP033);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP034);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP035);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP036);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP037);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP038);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP039);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP040);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP041);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP042);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP043);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP044);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP045);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP046);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP047);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP048);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP049);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP050);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP051);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP052);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP053);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP054);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP055);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP056);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP057);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP058);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP059);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP060);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP061);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP062);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP063);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP064);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP065);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP066);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP067);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP068);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP069);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP070);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP071);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP072);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP073);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP074);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP075);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP076);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP077);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP078);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP079);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP080);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP081);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP082);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP083);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP084);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP085);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP086);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP087);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP088);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP089);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP090);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP091);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP092);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP093);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP094);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP095);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP096);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP097);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP098);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP099);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP100);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP101);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP102);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP103);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP104);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP105);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP106);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP107);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP108);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP109);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP110);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP111);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP112);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP113);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP114);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP115);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP116);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP117);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP118);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP119);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP120);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP121);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP122);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP123);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP124);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP125);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP126);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP127);
		addEEnumLiteral(stretchStepEEnum, StretchStep.STRETCH_STEP128);

		initEEnum(swingEEnum, Swing.class, "Swing");
		addEEnumLiteral(swingEEnum, Swing.PERCENT_50);
		addEEnumLiteral(swingEEnum, Swing.PERCENT_51);
		addEEnumLiteral(swingEEnum, Swing.PERCENT_52);
		addEEnumLiteral(swingEEnum, Swing.PERCENT_53);
		addEEnumLiteral(swingEEnum, Swing.PERCENT_54);
		addEEnumLiteral(swingEEnum, Swing.PERCENT_55);
		addEEnumLiteral(swingEEnum, Swing.PERCENT_56);
		addEEnumLiteral(swingEEnum, Swing.PERCENT_57);
		addEEnumLiteral(swingEEnum, Swing.PERCENT_58);
		addEEnumLiteral(swingEEnum, Swing.PERCENT_59);
		addEEnumLiteral(swingEEnum, Swing.PERCENT_60);
		addEEnumLiteral(swingEEnum, Swing.PERCENT_61);
		addEEnumLiteral(swingEEnum, Swing.PERCENT_62);
		addEEnumLiteral(swingEEnum, Swing.PERCENT_63);
		addEEnumLiteral(swingEEnum, Swing.PERCENT_64);
		addEEnumLiteral(swingEEnum, Swing.PERCENT_65);
		addEEnumLiteral(swingEEnum, Swing.PERCENT_66);
		addEEnumLiteral(swingEEnum, Swing.PERCENT_67);
		addEEnumLiteral(swingEEnum, Swing.PERCENT_68);
		addEEnumLiteral(swingEEnum, Swing.PERCENT_69);
		addEEnumLiteral(swingEEnum, Swing.PERCENT_70);
		addEEnumLiteral(swingEEnum, Swing.PERCENT_71);
		addEEnumLiteral(swingEEnum, Swing.PERCENT_72);
		addEEnumLiteral(swingEEnum, Swing.PERCENT_73);
		addEEnumLiteral(swingEEnum, Swing.PERCENT_74);
		addEEnumLiteral(swingEEnum, Swing.PERCENT_75);

		initEEnum(tempoLockEEnum, TempoLock.class, "TempoLock");
		addEEnumLiteral(tempoLockEEnum, TempoLock.TEMPO_LOCK_OFF);
		addEEnumLiteral(tempoLockEEnum, TempoLock.TEMPO_LOCK_ON);

		// Initialize data types
		initEDataType(arrayListEDataType, ArrayList.class, "ArrayList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fileEDataType, File.class, "File", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(inputStreamEDataType, InputStream.class, "InputStream", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(indexOutOfBoundsExceptionEDataType, IndexOutOfBoundsException.class, "IndexOutOfBoundsException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ioExceptionEDataType, IOException.class, "IOException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iProgressMonitorEDataType, IProgressMonitor.class, "IProgressMonitor", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(objectEDataType, Object.class, "Object", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(riffWaveEDataType, RIFFWave.class, "RIFFWave", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EsxPackageImpl

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

import com.skratchdot.electribe.model.esx.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.skratchdot.electribe.model.esx.AmpEg;
import com.skratchdot.electribe.model.esx.ArpeggiatorControl;
import com.skratchdot.electribe.model.esx.ArpeggiatorScale;
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
import com.skratchdot.electribe.model.esx.ParametersFx;
import com.skratchdot.electribe.model.esx.ParametersMotion;
import com.skratchdot.electribe.model.esx.PartAccent;
import com.skratchdot.electribe.model.esx.PartAudioIn;
import com.skratchdot.electribe.model.esx.PartDrum;
import com.skratchdot.electribe.model.esx.PartKeyboard;
import com.skratchdot.electribe.model.esx.PartNoteNumber;
import com.skratchdot.electribe.model.esx.PartNoteNumberName;
import com.skratchdot.electribe.model.esx.PartStretchSlice;
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
import com.skratchdot.electribe.model.esx.SongEventTempo;
import com.skratchdot.electribe.model.esx.SongLength;
import com.skratchdot.electribe.model.esx.SongNumber;
import com.skratchdot.electribe.model.esx.SongPattern;
import com.skratchdot.electribe.model.esx.StretchStep;
import com.skratchdot.electribe.model.esx.Swing;
import com.skratchdot.electribe.model.esx.Tempo;
import com.skratchdot.electribe.model.esx.TempoLock;
import com.skratchdot.electribe.model.esx.util.EsxException;
import com.skratchdot.electribe.model.esx.util.ExtendedByteBuffer;
import com.skratchdot.riff.wav.RIFFWave;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EsxFactoryImpl extends EFactoryImpl implements EsxFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EsxFactory init() {
		try {
			EsxFactory theEsxFactory = (EsxFactory)EPackage.Registry.INSTANCE.getEFactory("http:///com/skratchdot/electribe/model/esx.ecore"); 
			if (theEsxFactory != null) {
				return theEsxFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EsxFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EsxFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EsxPackage.ESX_FILE: return createEsxFile();
			case EsxPackage.GLOBAL_PARAMETERS: return createGlobalParameters();
			case EsxPackage.MIDI_CHANNEL_TYPE: return createMidiChannelType();
			case EsxPackage.MIDI_CONTROL_CHANGE_ASSIGNMENT: return createMidiControlChangeAssignment();
			case EsxPackage.OPERATION: return createOperation();
			case EsxPackage.PARAMETERS_FX: return createParametersFx();
			case EsxPackage.PARAMETERS_MOTION: return createParametersMotion();
			case EsxPackage.PART_ACCENT: return createPartAccent();
			case EsxPackage.PART_AUDIO_IN: return createPartAudioIn();
			case EsxPackage.PART_DRUM: return createPartDrum();
			case EsxPackage.PART_KEYBOARD: return createPartKeyboard();
			case EsxPackage.PART_NOTE_NUMBER: return createPartNoteNumber();
			case EsxPackage.PART_STRETCH_SLICE: return createPartStretchSlice();
			case EsxPackage.PATTERN: return createPattern();
			case EsxPackage.PATTERN_SET_PARAMETER: return createPatternSetParameter();
			case EsxPackage.SAMPLE: return createSample();
			case EsxPackage.SAMPLE_IN_PATTERN_INFO: return createSampleInPatternInfo();
			case EsxPackage.SAMPLE_TUNE: return createSampleTune();
			case EsxPackage.SEQUENCE_DATA: return createSequenceData();
			case EsxPackage.SEQUENCE_DATA_GATE: return createSequenceDataGate();
			case EsxPackage.SEQUENCE_DATA_NOTE: return createSequenceDataNote();
			case EsxPackage.SONG: return createSong();
			case EsxPackage.SONG_EVENT_CONTROL: return createSongEventControl();
			case EsxPackage.SONG_EVENT_DRUM_NOTE: return createSongEventDrumNote();
			case EsxPackage.SONG_EVENT_KEYBOARD_NOTE: return createSongEventKeyboardNote();
			case EsxPackage.SONG_EVENT_MUTE_STATUS: return createSongEventMuteStatus();
			case EsxPackage.SONG_EVENT_TEMPO: return createSongEventTempo();
			case EsxPackage.SONG_PATTERN: return createSongPattern();
			case EsxPackage.TEMPO: return createTempo();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EsxPackage.AMP_EG:
				return createAmpEgFromString(eDataType, initialValue);
			case EsxPackage.ARPEGGIATOR_CONTROL:
				return createArpeggiatorControlFromString(eDataType, initialValue);
			case EsxPackage.ARPEGGIATOR_SCALE:
				return createArpeggiatorScaleFromString(eDataType, initialValue);
			case EsxPackage.AUDIO_IN_MODE:
				return createAudioInModeFromString(eDataType, initialValue);
			case EsxPackage.BEAT:
				return createBeatFromString(eDataType, initialValue);
			case EsxPackage.BPM_SYNC:
				return createBpmSyncFromString(eDataType, initialValue);
			case EsxPackage.ENABLED_FLAG:
				return createEnabledFlagFromString(eDataType, initialValue);
			case EsxPackage.FILTER_TYPE:
				return createFilterTypeFromString(eDataType, initialValue);
			case EsxPackage.FX_CHAIN:
				return createFxChainFromString(eDataType, initialValue);
			case EsxPackage.FX_SELECT:
				return createFxSelectFromString(eDataType, initialValue);
			case EsxPackage.FX_SEND:
				return createFxSendFromString(eDataType, initialValue);
			case EsxPackage.FX_TYPE:
				return createFxTypeFromString(eDataType, initialValue);
			case EsxPackage.LAST_STEP:
				return createLastStepFromString(eDataType, initialValue);
			case EsxPackage.MIDI_CHANNEL:
				return createMidiChannelFromString(eDataType, initialValue);
			case EsxPackage.MIDI_CHANNEL_TYPE_NAME:
				return createMidiChannelTypeNameFromString(eDataType, initialValue);
			case EsxPackage.MIDI_CLOCK:
				return createMidiClockFromString(eDataType, initialValue);
			case EsxPackage.MIDI_CONTROL_CHANGE_ASSIGNMENT_NAME:
				return createMidiControlChangeAssignmentNameFromString(eDataType, initialValue);
			case EsxPackage.MOD_DEST:
				return createModDestFromString(eDataType, initialValue);
			case EsxPackage.MOD_TYPE:
				return createModTypeFromString(eDataType, initialValue);
			case EsxPackage.MOTION_SEQUENCE_STATUS:
				return createMotionSequenceStatusFromString(eDataType, initialValue);
			case EsxPackage.MUTE_HOLD:
				return createMuteHoldFromString(eDataType, initialValue);
			case EsxPackage.NEXT_SONG_NUMBER:
				return createNextSongNumberFromString(eDataType, initialValue);
			case EsxPackage.NOTE_NUMBER:
				return createNoteNumberFromString(eDataType, initialValue);
			case EsxPackage.OPERATION_TYPE:
				return createOperationTypeFromString(eDataType, initialValue);
			case EsxPackage.PART_NOTE_NUMBER_NAME:
				return createPartNoteNumberNameFromString(eDataType, initialValue);
			case EsxPackage.PATTERN_LENGTH:
				return createPatternLengthFromString(eDataType, initialValue);
			case EsxPackage.PATTERN_NUMBER:
				return createPatternNumberFromString(eDataType, initialValue);
			case EsxPackage.PITCH_BEND_RANGE:
				return createPitchBendRangeFromString(eDataType, initialValue);
			case EsxPackage.PLAY_LEVEL:
				return createPlayLevelFromString(eDataType, initialValue);
			case EsxPackage.REVERSE:
				return createReverseFromString(eDataType, initialValue);
			case EsxPackage.ROLL:
				return createRollFromString(eDataType, initialValue);
			case EsxPackage.ROLL_TYPE:
				return createRollTypeFromString(eDataType, initialValue);
			case EsxPackage.SAMPLE_NUMBER:
				return createSampleNumberFromString(eDataType, initialValue);
			case EsxPackage.SONG_EVENT_PART:
				return createSongEventPartFromString(eDataType, initialValue);
			case EsxPackage.SONG_LENGTH:
				return createSongLengthFromString(eDataType, initialValue);
			case EsxPackage.SONG_NUMBER:
				return createSongNumberFromString(eDataType, initialValue);
			case EsxPackage.STRETCH_STEP:
				return createStretchStepFromString(eDataType, initialValue);
			case EsxPackage.SWING:
				return createSwingFromString(eDataType, initialValue);
			case EsxPackage.TEMPO_LOCK:
				return createTempoLockFromString(eDataType, initialValue);
			case EsxPackage.ARRAY_LIST:
				return createArrayListFromString(eDataType, initialValue);
			case EsxPackage.FILE:
				return createFileFromString(eDataType, initialValue);
			case EsxPackage.INPUT_STREAM:
				return createInputStreamFromString(eDataType, initialValue);
			case EsxPackage.INDEX_OUT_OF_BOUNDS_EXCEPTION:
				return createIndexOutOfBoundsExceptionFromString(eDataType, initialValue);
			case EsxPackage.IO_EXCEPTION:
				return createIOExceptionFromString(eDataType, initialValue);
			case EsxPackage.IPROGRESS_MONITOR:
				return createIProgressMonitorFromString(eDataType, initialValue);
			case EsxPackage.OBJECT:
				return createObjectFromString(eDataType, initialValue);
			case EsxPackage.RIFF_WAVE:
				return createRIFFWaveFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EsxPackage.AMP_EG:
				return convertAmpEgToString(eDataType, instanceValue);
			case EsxPackage.ARPEGGIATOR_CONTROL:
				return convertArpeggiatorControlToString(eDataType, instanceValue);
			case EsxPackage.ARPEGGIATOR_SCALE:
				return convertArpeggiatorScaleToString(eDataType, instanceValue);
			case EsxPackage.AUDIO_IN_MODE:
				return convertAudioInModeToString(eDataType, instanceValue);
			case EsxPackage.BEAT:
				return convertBeatToString(eDataType, instanceValue);
			case EsxPackage.BPM_SYNC:
				return convertBpmSyncToString(eDataType, instanceValue);
			case EsxPackage.ENABLED_FLAG:
				return convertEnabledFlagToString(eDataType, instanceValue);
			case EsxPackage.FILTER_TYPE:
				return convertFilterTypeToString(eDataType, instanceValue);
			case EsxPackage.FX_CHAIN:
				return convertFxChainToString(eDataType, instanceValue);
			case EsxPackage.FX_SELECT:
				return convertFxSelectToString(eDataType, instanceValue);
			case EsxPackage.FX_SEND:
				return convertFxSendToString(eDataType, instanceValue);
			case EsxPackage.FX_TYPE:
				return convertFxTypeToString(eDataType, instanceValue);
			case EsxPackage.LAST_STEP:
				return convertLastStepToString(eDataType, instanceValue);
			case EsxPackage.MIDI_CHANNEL:
				return convertMidiChannelToString(eDataType, instanceValue);
			case EsxPackage.MIDI_CHANNEL_TYPE_NAME:
				return convertMidiChannelTypeNameToString(eDataType, instanceValue);
			case EsxPackage.MIDI_CLOCK:
				return convertMidiClockToString(eDataType, instanceValue);
			case EsxPackage.MIDI_CONTROL_CHANGE_ASSIGNMENT_NAME:
				return convertMidiControlChangeAssignmentNameToString(eDataType, instanceValue);
			case EsxPackage.MOD_DEST:
				return convertModDestToString(eDataType, instanceValue);
			case EsxPackage.MOD_TYPE:
				return convertModTypeToString(eDataType, instanceValue);
			case EsxPackage.MOTION_SEQUENCE_STATUS:
				return convertMotionSequenceStatusToString(eDataType, instanceValue);
			case EsxPackage.MUTE_HOLD:
				return convertMuteHoldToString(eDataType, instanceValue);
			case EsxPackage.NEXT_SONG_NUMBER:
				return convertNextSongNumberToString(eDataType, instanceValue);
			case EsxPackage.NOTE_NUMBER:
				return convertNoteNumberToString(eDataType, instanceValue);
			case EsxPackage.OPERATION_TYPE:
				return convertOperationTypeToString(eDataType, instanceValue);
			case EsxPackage.PART_NOTE_NUMBER_NAME:
				return convertPartNoteNumberNameToString(eDataType, instanceValue);
			case EsxPackage.PATTERN_LENGTH:
				return convertPatternLengthToString(eDataType, instanceValue);
			case EsxPackage.PATTERN_NUMBER:
				return convertPatternNumberToString(eDataType, instanceValue);
			case EsxPackage.PITCH_BEND_RANGE:
				return convertPitchBendRangeToString(eDataType, instanceValue);
			case EsxPackage.PLAY_LEVEL:
				return convertPlayLevelToString(eDataType, instanceValue);
			case EsxPackage.REVERSE:
				return convertReverseToString(eDataType, instanceValue);
			case EsxPackage.ROLL:
				return convertRollToString(eDataType, instanceValue);
			case EsxPackage.ROLL_TYPE:
				return convertRollTypeToString(eDataType, instanceValue);
			case EsxPackage.SAMPLE_NUMBER:
				return convertSampleNumberToString(eDataType, instanceValue);
			case EsxPackage.SONG_EVENT_PART:
				return convertSongEventPartToString(eDataType, instanceValue);
			case EsxPackage.SONG_LENGTH:
				return convertSongLengthToString(eDataType, instanceValue);
			case EsxPackage.SONG_NUMBER:
				return convertSongNumberToString(eDataType, instanceValue);
			case EsxPackage.STRETCH_STEP:
				return convertStretchStepToString(eDataType, instanceValue);
			case EsxPackage.SWING:
				return convertSwingToString(eDataType, instanceValue);
			case EsxPackage.TEMPO_LOCK:
				return convertTempoLockToString(eDataType, instanceValue);
			case EsxPackage.ARRAY_LIST:
				return convertArrayListToString(eDataType, instanceValue);
			case EsxPackage.FILE:
				return convertFileToString(eDataType, instanceValue);
			case EsxPackage.INPUT_STREAM:
				return convertInputStreamToString(eDataType, instanceValue);
			case EsxPackage.INDEX_OUT_OF_BOUNDS_EXCEPTION:
				return convertIndexOutOfBoundsExceptionToString(eDataType, instanceValue);
			case EsxPackage.IO_EXCEPTION:
				return convertIOExceptionToString(eDataType, instanceValue);
			case EsxPackage.IPROGRESS_MONITOR:
				return convertIProgressMonitorToString(eDataType, instanceValue);
			case EsxPackage.OBJECT:
				return convertObjectToString(eDataType, instanceValue);
			case EsxPackage.RIFF_WAVE:
				return convertRIFFWaveToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EsxFile createEsxFile() {
		EsxFileImpl esxFile = new EsxFileImpl();
		return esxFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalParameters createGlobalParameters() {
		GlobalParametersImpl globalParameters = new GlobalParametersImpl();
		return globalParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternSetParameter createPatternSetParameter() {
		PatternSetParameterImpl patternSetParameter = new PatternSetParameterImpl();
		return patternSetParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sample createSample() {
		SampleImpl sample = new SampleImpl();
		return sample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampleInPatternInfo createSampleInPatternInfo() {
		SampleInPatternInfoImpl sampleInPatternInfo = new SampleInPatternInfoImpl();
		return sampleInPatternInfo;
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.EsxFactory#createSampleFromFile(java.io.File)
	 */
	public Sample createSampleFromFile(File file) throws EsxException {
		SampleImpl sample = new SampleImpl(file);
		return sample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MidiChannelType createMidiChannelType() {
		MidiChannelTypeImpl midiChannelType = new MidiChannelTypeImpl();
		return midiChannelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartNoteNumber createPartNoteNumber() {
		PartNoteNumberImpl partNoteNumber = new PartNoteNumberImpl();
		return partNoteNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MidiControlChangeAssignment createMidiControlChangeAssignment() {
		MidiControlChangeAssignmentImpl midiControlChangeAssignment = new MidiControlChangeAssignmentImpl();
		return midiControlChangeAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametersFx createParametersFx() {
		ParametersFxImpl parametersFx = new ParametersFxImpl();
		return parametersFx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametersMotion createParametersMotion() {
		ParametersMotionImpl parametersMotion = new ParametersMotionImpl();
		return parametersMotion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceData createSequenceData() {
		SequenceDataImpl sequenceData = new SequenceDataImpl();
		return sequenceData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceDataGate createSequenceDataGate() {
		SequenceDataGateImpl sequenceDataGate = new SequenceDataGateImpl();
		return sequenceDataGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceDataNote createSequenceDataNote() {
		SequenceDataNoteImpl sequenceDataNote = new SequenceDataNoteImpl();
		return sequenceDataNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartAccent createPartAccent() {
		PartAccentImpl partAccent = new PartAccentImpl();
		return partAccent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartAudioIn createPartAudioIn() {
		PartAudioInImpl partAudioIn = new PartAudioInImpl();
		return partAudioIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartDrum createPartDrum() {
		PartDrumImpl partDrum = new PartDrumImpl();
		return partDrum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartKeyboard createPartKeyboard() {
		PartKeyboardImpl partKeyboard = new PartKeyboardImpl();
		return partKeyboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartStretchSlice createPartStretchSlice() {
		PartStretchSliceImpl partStretchSlice = new PartStretchSliceImpl();
		return partStretchSlice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern createPattern() {
		PatternImpl pattern = new PatternImpl();
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampleTune createSampleTune() {
		SampleTuneImpl sampleTune = new SampleTuneImpl();
		return sampleTune;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Song createSong() {
		SongImpl song = new SongImpl();
		return song;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SongPattern createSongPattern() {
		SongPatternImpl songPattern = new SongPatternImpl();
		return songPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tempo createTempo() {
		TempoImpl tempo = new TempoImpl();
		return tempo;
	}

	/**
	 * @param b a byte array containing song event data. This factory will determine which type of song event to create
	 * @return Returns the correct subclass of SongEvent by evaluating the byte array passed in
	 */
	public SongEvent createSongEvent(byte[] b) {
		ExtendedByteBuffer in = new ExtendedByteBuffer(b);

		// Ignore bytes 0~1
		in.getShort();
		// bytes 2~3
		short operationNumber = in.getShort();

		switch(operationNumber) {
			case 503:
				SongEventMuteStatus songEventMuteStatus = this.createSongEventMuteStatus();
				songEventMuteStatus.init(b);
				return songEventMuteStatus;
			case 515:
				SongEventTempo songEventTempo = this.createSongEventTempo();
				songEventTempo.init(b);
				return songEventTempo;
			case 0x4000:
				int partNumber = in.getByte();
				if(partNumber==10 || partNumber==11) {
					SongEventKeyboardNote songEventKeyboardNote = this.createSongEventKeyboardNote();
					songEventKeyboardNote.init(b);
					return songEventKeyboardNote;
				}
				else {
					SongEventDrumNote songEventDrumNote = this.createSongEventDrumNote();
					songEventDrumNote.init(b);
					return songEventDrumNote;	
				}			
			default:
				SongEventControl songEventControl = this.createSongEventControl();
				songEventControl.init(b);
				return songEventControl;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SongEventControl createSongEventControl() {
		SongEventControlImpl songEventControl = new SongEventControlImpl();
		return songEventControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SongEventDrumNote createSongEventDrumNote() {
		SongEventDrumNoteImpl songEventDrumNote = new SongEventDrumNoteImpl();
		return songEventDrumNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SongEventKeyboardNote createSongEventKeyboardNote() {
		SongEventKeyboardNoteImpl songEventKeyboardNote = new SongEventKeyboardNoteImpl();
		return songEventKeyboardNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SongEventTempo createSongEventTempo() {
		SongEventTempoImpl songEventTempo = new SongEventTempoImpl();
		return songEventTempo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SongEventMuteStatus createSongEventMuteStatus() {
		SongEventMuteStatusImpl songEventMuteStatus = new SongEventMuteStatusImpl();
		return songEventMuteStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArpeggiatorControl createArpeggiatorControl(String literal) {
		ArpeggiatorControl result = ArpeggiatorControl.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.ARPEGGIATOR_CONTROL.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArpeggiatorControl createArpeggiatorControlFromString(EDataType eDataType, String initialValue) {
		return createArpeggiatorControl(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArpeggiatorControl(ArpeggiatorControl instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArpeggiatorControlToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioInMode createAudioInMode(String literal) {
		AudioInMode result = AudioInMode.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.AUDIO_IN_MODE.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioInMode createAudioInModeFromString(EDataType eDataType, String initialValue) {
		return createAudioInMode(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAudioInMode(AudioInMode instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAudioInModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MidiClock createMidiClock(String literal) {
		MidiClock result = MidiClock.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.MIDI_CLOCK.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MidiClock createMidiClockFromString(EDataType eDataType, String initialValue) {
		return createMidiClock(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMidiClock(MidiClock instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMidiClockToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MidiControlChangeAssignmentName createMidiControlChangeAssignmentName(String literal) {
		MidiControlChangeAssignmentName result = MidiControlChangeAssignmentName.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.MIDI_CONTROL_CHANGE_ASSIGNMENT_NAME.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MidiControlChangeAssignmentName createMidiControlChangeAssignmentNameFromString(EDataType eDataType, String initialValue) {
		return createMidiControlChangeAssignmentName(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMidiControlChangeAssignmentName(MidiControlChangeAssignmentName instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMidiControlChangeAssignmentNameToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnabledFlag createEnabledFlag(String literal) {
		EnabledFlag result = EnabledFlag.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.ENABLED_FLAG.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnabledFlag createEnabledFlagFromString(EDataType eDataType, String initialValue) {
		return createEnabledFlag(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnabledFlag(EnabledFlag instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnabledFlagToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PitchBendRange createPitchBendRange(String literal) {
		PitchBendRange result = PitchBendRange.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.PITCH_BEND_RANGE.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PitchBendRange createPitchBendRangeFromString(EDataType eDataType, String initialValue) {
		return createPitchBendRange(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPitchBendRange(PitchBendRange instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPitchBendRangeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MidiChannel createMidiChannel(String literal) {
		MidiChannel result = MidiChannel.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.MIDI_CHANNEL.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MidiChannel createMidiChannelFromString(EDataType eDataType, String initialValue) {
		return createMidiChannel(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMidiChannel(MidiChannel instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMidiChannelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MidiChannelTypeName createMidiChannelTypeName(String literal) {
		MidiChannelTypeName result = MidiChannelTypeName.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.MIDI_CHANNEL_TYPE_NAME.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MidiChannelTypeName createMidiChannelTypeNameFromString(EDataType eDataType, String initialValue) {
		return createMidiChannelTypeName(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMidiChannelTypeName(MidiChannelTypeName instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMidiChannelTypeNameToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayLevel createPlayLevel(String literal) {
		PlayLevel result = PlayLevel.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.PLAY_LEVEL.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayLevel createPlayLevelFromString(EDataType eDataType, String initialValue) {
		return createPlayLevel(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlayLevel(PlayLevel instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlayLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternNumber createPatternNumber(String literal) {
		PatternNumber result = PatternNumber.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.PATTERN_NUMBER.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternNumber createPatternNumberFromString(EDataType eDataType, String initialValue) {
		return createPatternNumber(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPatternNumber(PatternNumber instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPatternNumberToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampleNumber createSampleNumber(String literal) {
		SampleNumber result = SampleNumber.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.SAMPLE_NUMBER.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampleNumber createSampleNumberFromString(EDataType eDataType, String initialValue) {
		return createSampleNumber(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSampleNumber(SampleNumber instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSampleNumberToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SongEventPart createSongEventPart(String literal) {
		SongEventPart result = SongEventPart.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.SONG_EVENT_PART.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SongEventPart createSongEventPartFromString(EDataType eDataType, String initialValue) {
		return createSongEventPart(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSongEventPart(SongEventPart instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSongEventPartToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SongNumber createSongNumber(String literal) {
		SongNumber result = SongNumber.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.SONG_NUMBER.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SongNumber createSongNumberFromString(EDataType eDataType, String initialValue) {
		return createSongNumber(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSongNumber(SongNumber instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSongNumberToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SongLength createSongLength(String literal) {
		SongLength result = SongLength.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.SONG_LENGTH.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SongLength createSongLengthFromString(EDataType eDataType, String initialValue) {
		return createSongLength(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSongLength(SongLength instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSongLengthToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TempoLock createTempoLock(String literal) {
		TempoLock result = TempoLock.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.TEMPO_LOCK.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TempoLock createTempoLockFromString(EDataType eDataType, String initialValue) {
		return createTempoLock(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTempoLock(TempoLock instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTempoLockToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MuteHold createMuteHold(String literal) {
		MuteHold result = MuteHold.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.MUTE_HOLD.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MuteHold createMuteHoldFromString(EDataType eDataType, String initialValue) {
		return createMuteHold(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMuteHold(MuteHold instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMuteHoldToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NextSongNumber createNextSongNumber(String literal) {
		NextSongNumber result = NextSongNumber.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.NEXT_SONG_NUMBER.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NextSongNumber createNextSongNumberFromString(EDataType eDataType, String initialValue) {
		return createNextSongNumber(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNextSongNumber(NextSongNumber instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNextSongNumberToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StretchStep createStretchStep(String literal) {
		StretchStep result = StretchStep.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.STRETCH_STEP.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StretchStep createStretchStepFromString(EDataType eDataType, String initialValue) {
		return createStretchStep(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStretchStep(StretchStep instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStretchStepToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Swing createSwing(String literal) {
		Swing result = Swing.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.SWING.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Swing createSwingFromString(EDataType eDataType, String initialValue) {
		return createSwing(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSwing(Swing instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSwingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternLength createPatternLength(String literal) {
		PatternLength result = PatternLength.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.PATTERN_LENGTH.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternLength createPatternLengthFromString(EDataType eDataType, String initialValue) {
		return createPatternLength(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPatternLength(PatternLength instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPatternLengthToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Beat createBeat(String literal) {
		Beat result = Beat.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.BEAT.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Beat createBeatFromString(EDataType eDataType, String initialValue) {
		return createBeat(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBeat(Beat instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBeatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RollType createRollType(String literal) {
		RollType result = RollType.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.ROLL_TYPE.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RollType createRollTypeFromString(EDataType eDataType, String initialValue) {
		return createRollType(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRollType(RollType instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRollTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FxChain createFxChain(String literal) {
		FxChain result = FxChain.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.FX_CHAIN.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FxChain createFxChainFromString(EDataType eDataType, String initialValue) {
		return createFxChain(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFxChain(FxChain instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFxChainToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastStep createLastStep(String literal) {
		LastStep result = LastStep.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.LAST_STEP.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastStep createLastStepFromString(EDataType eDataType, String initialValue) {
		return createLastStep(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLastStep(LastStep instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLastStepToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArpeggiatorScale createArpeggiatorScale(String literal) {
		ArpeggiatorScale result = ArpeggiatorScale.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.ARPEGGIATOR_SCALE.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArpeggiatorScale createArpeggiatorScaleFromString(EDataType eDataType, String initialValue) {
		return createArpeggiatorScale(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArpeggiatorScale(ArpeggiatorScale instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArpeggiatorScaleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteNumber createNoteNumber(String literal) {
		NoteNumber result = NoteNumber.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.NOTE_NUMBER.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteNumber createNoteNumberFromString(EDataType eDataType, String initialValue) {
		return createNoteNumber(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNoteNumber(NoteNumber instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNoteNumberToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationType createOperationType(String literal) {
		OperationType result = OperationType.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.OPERATION_TYPE.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationType createOperationTypeFromString(EDataType eDataType, String initialValue) {
		return createOperationType(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationType(OperationType instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartNoteNumberName createPartNoteNumberName(String literal) {
		PartNoteNumberName result = PartNoteNumberName.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.PART_NOTE_NUMBER_NAME.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartNoteNumberName createPartNoteNumberNameFromString(EDataType eDataType, String initialValue) {
		return createPartNoteNumberName(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPartNoteNumberName(PartNoteNumberName instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPartNoteNumberNameToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType createFilterType(String literal) {
		FilterType result = FilterType.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.FILTER_TYPE.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType createFilterTypeFromString(EDataType eDataType, String initialValue) {
		return createFilterType(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilterType(FilterType instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FxSelect createFxSelect(String literal) {
		FxSelect result = FxSelect.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.FX_SELECT.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FxSelect createFxSelectFromString(EDataType eDataType, String initialValue) {
		return createFxSelect(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFxSelect(FxSelect instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFxSelectToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FxSend createFxSend(String literal) {
		FxSend result = FxSend.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.FX_SEND.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FxSend createFxSendFromString(EDataType eDataType, String initialValue) {
		return createFxSend(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFxSend(FxSend instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFxSendToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FxType createFxType(String literal) {
		FxType result = FxType.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.FX_TYPE.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FxType createFxTypeFromString(EDataType eDataType, String initialValue) {
		return createFxType(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFxType(FxType instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFxTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Roll createRoll(String literal) {
		Roll result = Roll.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.ROLL.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Roll createRollFromString(EDataType eDataType, String initialValue) {
		return createRoll(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoll(Roll instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRollToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmpEg createAmpEg(String literal) {
		AmpEg result = AmpEg.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.AMP_EG.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmpEg createAmpEgFromString(EDataType eDataType, String initialValue) {
		return createAmpEg(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAmpEg(AmpEg instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAmpEgToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reverse createReverse(String literal) {
		Reverse result = Reverse.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.REVERSE.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reverse createReverseFromString(EDataType eDataType, String initialValue) {
		return createReverse(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReverse(Reverse instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReverseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModDest createModDest(String literal) {
		ModDest result = ModDest.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.MOD_DEST.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModDest createModDestFromString(EDataType eDataType, String initialValue) {
		return createModDest(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModDest(ModDest instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModDestToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModType createModType(String literal) {
		ModType result = ModType.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.MOD_TYPE.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModType createModTypeFromString(EDataType eDataType, String initialValue) {
		return createModType(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModType(ModType instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmSync createBpmSync(String literal) {
		BpmSync result = BpmSync.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.BPM_SYNC.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmSync createBpmSyncFromString(EDataType eDataType, String initialValue) {
		return createBpmSync(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBpmSync(BpmSync instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBpmSyncToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotionSequenceStatus createMotionSequenceStatus(String literal) {
		MotionSequenceStatus result = MotionSequenceStatus.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + EsxPackage.Literals.MOTION_SEQUENCE_STATUS.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotionSequenceStatus createMotionSequenceStatusFromString(EDataType eDataType, String initialValue) {
		return createMotionSequenceStatus(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMotionSequenceStatus(MotionSequenceStatus instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMotionSequenceStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createObject(String literal) {
		return super.createFromString(EsxPackage.Literals.OBJECT, literal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createObjectFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObject(Object instanceValue) {
		return super.convertToString(EsxPackage.Literals.OBJECT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RIFFWave createRIFFWave(String literal) {
		return (RIFFWave)super.createFromString(EsxPackage.Literals.RIFF_WAVE, literal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RIFFWave createRIFFWaveFromString(EDataType eDataType, String initialValue) {
		return (RIFFWave)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRIFFWave(RIFFWave instanceValue) {
		return super.convertToString(EsxPackage.Literals.RIFF_WAVE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRIFFWaveToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList<?> createArrayList(String literal) {
		return (ArrayList<?>)super.createFromString(literal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList<?> createArrayListFromString(EDataType eDataType, String initialValue) {
		return (ArrayList<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArrayList(ArrayList<?> instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArrayListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFile(String literal) {
		return (File)super.createFromString(EsxPackage.Literals.FILE, literal);
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
	public String convertFile(File instanceValue) {
		return super.convertToString(EsxPackage.Literals.FILE, instanceValue);
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
	public InputStream createInputStream(String literal) {
		return (InputStream)super.createFromString(EsxPackage.Literals.INPUT_STREAM, literal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputStream createInputStreamFromString(EDataType eDataType, String initialValue) {
		return (InputStream)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInputStream(InputStream instanceValue) {
		return super.convertToString(EsxPackage.Literals.INPUT_STREAM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInputStreamToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexOutOfBoundsException createIndexOutOfBoundsException(String literal) {
		return (IndexOutOfBoundsException)super.createFromString(EsxPackage.Literals.INDEX_OUT_OF_BOUNDS_EXCEPTION, literal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexOutOfBoundsException createIndexOutOfBoundsExceptionFromString(EDataType eDataType, String initialValue) {
		return (IndexOutOfBoundsException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndexOutOfBoundsException(IndexOutOfBoundsException instanceValue) {
		return super.convertToString(EsxPackage.Literals.INDEX_OUT_OF_BOUNDS_EXCEPTION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndexOutOfBoundsExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOException createIOException(String literal) {
		return (IOException)super.createFromString(EsxPackage.Literals.IO_EXCEPTION, literal);
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
	public String convertIOException(IOException instanceValue) {
		return super.convertToString(EsxPackage.Literals.IO_EXCEPTION, instanceValue);
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
	public IProgressMonitor createIProgressMonitor(String literal) {
		return (IProgressMonitor)super.createFromString(EsxPackage.Literals.IPROGRESS_MONITOR, literal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProgressMonitor createIProgressMonitorFromString(EDataType eDataType, String initialValue) {
		return (IProgressMonitor)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIProgressMonitor(IProgressMonitor instanceValue) {
		return super.convertToString(EsxPackage.Literals.IPROGRESS_MONITOR, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIProgressMonitorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EsxPackage getEsxPackage() {
		return (EsxPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EsxPackage getPackage() {
		return EsxPackage.eINSTANCE;
	}

} //EsxFactoryImpl

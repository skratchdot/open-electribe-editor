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
package com.skratchdot.electribe.model.esx;

import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EFactory;

import com.skratchdot.electribe.model.esx.util.EsxException;
import com.skratchdot.electribe.model.esx.util.EsxRandomAccess;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.skratchdot.electribe.model.esx.EsxPackage
 * @generated
 */
public interface EsxFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EsxFactory eINSTANCE = com.skratchdot.electribe.model.esx.impl.EsxFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File</em>'.
	 * @generated
	 */
	EsxFile createEsxFile();

	EsxFile createEsxFileFromEsxFile(EsxRandomAccess in, IProgressMonitor monitor) throws EsxException;

	/**
	 * Returns a new object of class '<em>Global Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Parameters</em>'.
	 * @generated
	 */
	GlobalParameters createGlobalParameters();

	/**
	 * Returns a new object of class '<em>Pattern Set Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Set Parameter</em>'.
	 * @generated
	 */
	PatternSetParameter createPatternSetParameter();

	GlobalParameters createGlobalParametersFromEsxFile(EsxRandomAccess in) throws EsxException, IOException;

	/**
	 * Returns a new object of class '<em>Midi Channel Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Midi Channel Type</em>'.
	 * @generated
	 */
	MidiChannelType createMidiChannelType();

	/**
	 * Returns a new object of class '<em>Part Note Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part Note Number</em>'.
	 * @generated
	 */
	PartNoteNumber createPartNoteNumber();

	/**
	 * Returns a new object of class '<em>Midi Control Change Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Midi Control Change Assignment</em>'.
	 * @generated
	 */
	MidiControlChangeAssignment createMidiControlChangeAssignment();

	/**
	 * Returns a new object of class '<em>Parameters Fx</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameters Fx</em>'.
	 * @generated
	 */
	ParametersFx createParametersFx();

	ParametersFx createParametersFx(EsxRandomAccess in, int patternNumber, int parametersFxNumber) throws EsxException, IOException;

	/**
	 * Returns a new object of class '<em>Parameters Motion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameters Motion</em>'.
	 * @generated
	 */
	ParametersMotion createParametersMotion();

	ParametersMotion createParametersMotion(EsxRandomAccess in, int patternNumber, int parametersMotionNumber) throws EsxException, IOException;

	/**
	 * Returns a new object of class '<em>Sequence Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Data</em>'.
	 * @generated
	 */
	SequenceData createSequenceData();

	/**
	 * Returns a new object of class '<em>Sequence Data Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Data Gate</em>'.
	 * @generated
	 */
	SequenceDataGate createSequenceDataGate();

	/**
	 * Returns a new object of class '<em>Sequence Data Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Data Note</em>'.
	 * @generated
	 */
	SequenceDataNote createSequenceDataNote();

	/**
	 * Returns a new object of class '<em>Part Accent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part Accent</em>'.
	 * @generated
	 */
	PartAccent createPartAccent();

	PartAccent createPartAccent(EsxRandomAccess in, int patternNumber, int partAccentNumber) throws EsxException, IOException;

	/**
	 * Returns a new object of class '<em>Part Audio In</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part Audio In</em>'.
	 * @generated
	 */
	PartAudioIn createPartAudioIn();

	PartAudioIn createPartAudioIn(EsxRandomAccess in, int patternNumber, int partAudioInNumber) throws EsxException, IOException;

	/**
	 * Returns a new object of class '<em>Part Drum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part Drum</em>'.
	 * @generated
	 */
	PartDrum createPartDrum();

	PartDrum createPartDrum(EsxRandomAccess in, int patternNumber, int partDrumNumber) throws EsxException, IOException;

	/**
	 * Returns a new object of class '<em>Part Keyboard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part Keyboard</em>'.
	 * @generated
	 */
	PartKeyboard createPartKeyboard();

	PartKeyboard createPartKeyboard(EsxRandomAccess in, int patternNumber, int partKeyboardNumber) throws EsxException, IOException;

	/**
	 * Returns a new object of class '<em>Part Stretch Slice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part Stretch Slice</em>'.
	 * @generated
	 */
	PartStretchSlice createPartStretchSlice();

	PartStretchSlice createPartStretchSlice(EsxRandomAccess in, int patternNumber, int partStretchSliceNumber) throws EsxException, IOException;

	/**
	 * Returns a new object of class '<em>Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern</em>'.
	 * @generated
	 */
	Pattern createPattern();

	Pattern createPatternFromEsxFile(EsxRandomAccess in, int patternNumber) throws EsxException, IOException;

	/**
	 * Returns a new object of class '<em>Sample Mono</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sample Mono</em>'.
	 * @generated
	 */
	SampleMono createSampleMono();

	SampleMono createSampleMonoFromEsxFile(EsxRandomAccess in, int monoSampleNumber) throws EsxException, IOException;

	SampleMono createSampleMonoFromAudioFile(File file) throws EsxException, IOException;

	/**
	 * Returns a new object of class '<em>Sample Stereo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sample Stereo</em>'.
	 * @generated
	 */
	SampleStereo createSampleStereo();

	/**
	 * Returns a new object of class '<em>Sample Tune</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sample Tune</em>'.
	 * @generated
	 */
	SampleTune createSampleTune();

	SampleStereo createSampleStereoFromEsxFile(EsxRandomAccess in, int stereoSampleNumber) throws EsxException, IOException;

	SampleStereo createSampleStereoFromAudioFile(File file) throws EsxException, IOException;

	/**
	 * Returns a new object of class '<em>Song</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Song</em>'.
	 * @generated
	 */
	Song createSong();
	
	/**
	 * Returns a new object of class '<em>Song Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Song Pattern</em>'.
	 * @generated
	 */
	SongPattern createSongPattern();

	Song createSongFromEsxFile(EsxRandomAccess in, int songNumber) throws EsxException, IOException;

	/**
	 * Returns a new object of class '<em>Tempo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tempo</em>'.
	 * @generated
	 */
	Tempo createTempo();

	/**
	 * Returns a new object of class '<em>Song Event Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Song Event Control</em>'.
	 * @generated
	 */
	SongEventControl createSongEventControl();

	SongEventControl createSongEventControlFromEsxFile(EsxRandomAccess in, int songEventNumber) throws EsxException, IOException;

	/**
	 * Returns a new object of class '<em>Song Event Drum Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Song Event Drum Note</em>'.
	 * @generated
	 */
	SongEventDrumNote createSongEventDrumNote();

	SongEventDrumNote createSongEventDrumNoteFromEsxFile(EsxRandomAccess in, int songEventNumber) throws EsxException, IOException;

	/**
	 * Returns a new object of class '<em>Song Event Keyboard Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Song Event Keyboard Note</em>'.
	 * @generated
	 */
	SongEventKeyboardNote createSongEventKeyboardNote();

	SongEventKeyboardNote createSongEventKeyboardNoteFromEsxFile(EsxRandomAccess in, int songEventNumber) throws EsxException, IOException;

	/**
	 * Returns a new object of class '<em>Song Event Tempo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Song Event Tempo</em>'.
	 * @generated
	 */
	SongEventTempo createSongEventTempo();

	SongEventTempo createSongEventTempoFromEsxFile(EsxRandomAccess in, int songEventNumber) throws EsxException, IOException;

	/**
	 * Returns a new object of class '<em>Song Event Mute Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Song Event Mute Status</em>'.
	 * @generated
	 */
	SongEventMuteStatus createSongEventMuteStatus();

	/**
	 * Returns an instance of data type '<em>Arpeggiator Control</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	ArpeggiatorControl createArpeggiatorControl(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Arpeggiator Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertArpeggiatorControl(ArpeggiatorControl instanceValue);

	/**
	 * Returns an instance of data type '<em>Audio In Mode</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	AudioInMode createAudioInMode(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Audio In Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertAudioInMode(AudioInMode instanceValue);

	/**
	 * Returns an instance of data type '<em>Midi Clock</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	MidiClock createMidiClock(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Midi Clock</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertMidiClock(MidiClock instanceValue);

	/**
	 * Returns an instance of data type '<em>Midi Control Change Assignment Name</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	MidiControlChangeAssignmentName createMidiControlChangeAssignmentName(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Midi Control Change Assignment Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertMidiControlChangeAssignmentName(MidiControlChangeAssignmentName instanceValue);

	/**
	 * Returns an instance of data type '<em>Enabled Flag</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	EnabledFlag createEnabledFlag(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Enabled Flag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertEnabledFlag(EnabledFlag instanceValue);

	/**
	 * Returns an instance of data type '<em>Pitch Bend Range</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	PitchBendRange createPitchBendRange(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Pitch Bend Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertPitchBendRange(PitchBendRange instanceValue);

	/**
	 * Returns an instance of data type '<em>Midi Channel</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	MidiChannel createMidiChannel(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Midi Channel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertMidiChannel(MidiChannel instanceValue);

	/**
	 * Returns an instance of data type '<em>Midi Channel Type Name</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	MidiChannelTypeName createMidiChannelTypeName(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Midi Channel Type Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertMidiChannelTypeName(MidiChannelTypeName instanceValue);

	/**
	 * Returns an instance of data type '<em>Play Level</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	PlayLevel createPlayLevel(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Play Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertPlayLevel(PlayLevel instanceValue);

	/**
	 * Returns an instance of data type '<em>Pattern Number</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	PatternNumber createPatternNumber(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Pattern Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertPatternNumber(PatternNumber instanceValue);

	/**
	 * Returns an instance of data type '<em>Sample Number</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	SampleNumber createSampleNumber(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Sample Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertSampleNumber(SampleNumber instanceValue);

	/**
	 * Returns an instance of data type '<em>Song Number</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	SongNumber createSongNumber(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Song Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertSongNumber(SongNumber instanceValue);

	/**
	 * Returns an instance of data type '<em>Song Length</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	SongLength createSongLength(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Song Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertSongLength(SongLength instanceValue);

	/**
	 * Returns an instance of data type '<em>Tempo Lock</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	TempoLock createTempoLock(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Tempo Lock</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertTempoLock(TempoLock instanceValue);

	/**
	 * Returns an instance of data type '<em>Mute Hold</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	MuteHold createMuteHold(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Mute Hold</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertMuteHold(MuteHold instanceValue);

	/**
	 * Returns an instance of data type '<em>Next Song Number</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	NextSongNumber createNextSongNumber(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Next Song Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertNextSongNumber(NextSongNumber instanceValue);

	/**
	 * Returns an instance of data type '<em>Stretch Step</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	StretchStep createStretchStep(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Stretch Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertStretchStep(StretchStep instanceValue);

	/**
	 * Returns an instance of data type '<em>Swing</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	Swing createSwing(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Swing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertSwing(Swing instanceValue);

	/**
	 * Returns an instance of data type '<em>Pattern Length</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	PatternLength createPatternLength(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Pattern Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertPatternLength(PatternLength instanceValue);

	/**
	 * Returns an instance of data type '<em>Beat</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	Beat createBeat(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Beat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertBeat(Beat instanceValue);

	/**
	 * Returns an instance of data type '<em>Roll Type</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	RollType createRollType(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Roll Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertRollType(RollType instanceValue);

	/**
	 * Returns an instance of data type '<em>Fx Chain</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	FxChain createFxChain(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Fx Chain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertFxChain(FxChain instanceValue);

	/**
	 * Returns an instance of data type '<em>Last Step</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	LastStep createLastStep(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Last Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertLastStep(LastStep instanceValue);

	/**
	 * Returns an instance of data type '<em>Arpeggiator Scale</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	ArpeggiatorScale createArpeggiatorScale(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Arpeggiator Scale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertArpeggiatorScale(ArpeggiatorScale instanceValue);

	/**
	 * Returns an instance of data type '<em>Note Number</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	NoteNumber createNoteNumber(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Note Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertNoteNumber(NoteNumber instanceValue);

	/**
	 * Returns an instance of data type '<em>Part Note Number Name</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	PartNoteNumberName createPartNoteNumberName(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Part Note Number Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertPartNoteNumberName(PartNoteNumberName instanceValue);

	/**
	 * Returns an instance of data type '<em>Filter Type</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	FilterType createFilterType(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Filter Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertFilterType(FilterType instanceValue);

	/**
	 * Returns an instance of data type '<em>Fx Select</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	FxSelect createFxSelect(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Fx Select</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertFxSelect(FxSelect instanceValue);

	/**
	 * Returns an instance of data type '<em>Fx Send</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	FxSend createFxSend(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Fx Send</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertFxSend(FxSend instanceValue);

	/**
	 * Returns an instance of data type '<em>Fx Type</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	FxType createFxType(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Fx Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertFxType(FxType instanceValue);

	/**
	 * Returns an instance of data type '<em>Roll</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	Roll createRoll(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Roll</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertRoll(Roll instanceValue);

	/**
	 * Returns an instance of data type '<em>Amp Eg</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	AmpEg createAmpEg(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Amp Eg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertAmpEg(AmpEg instanceValue);

	/**
	 * Returns an instance of data type '<em>Reverse</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	Reverse createReverse(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Reverse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertReverse(Reverse instanceValue);

	/**
	 * Returns an instance of data type '<em>Mod Dest</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	ModDest createModDest(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Mod Dest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertModDest(ModDest instanceValue);

	/**
	 * Returns an instance of data type '<em>Mod Type</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	ModType createModType(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Mod Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertModType(ModType instanceValue);

	/**
	 * Returns an instance of data type '<em>Bpm Sync</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	BpmSync createBpmSync(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Bpm Sync</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertBpmSync(BpmSync instanceValue);

	/**
	 * Returns an instance of data type '<em>Motion Sequence Status</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	MotionSequenceStatus createMotionSequenceStatus(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Motion Sequence Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertMotionSequenceStatus(MotionSequenceStatus instanceValue);

	/**
	 * Returns an instance of data type '<em>Object</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	Object createObject(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertObject(Object instanceValue);

	/**
	 * Returns an instance of data type '<em>Array List</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	ArrayList<?> createArrayList(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Array List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertArrayList(ArrayList<?> instanceValue);

	SongEventMuteStatus createSongEventMuteStatusFromEsxFile(EsxRandomAccess in, int songEventNumber) throws EsxException, IOException;

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EsxPackage getEsxPackage();

} //EsxFactory

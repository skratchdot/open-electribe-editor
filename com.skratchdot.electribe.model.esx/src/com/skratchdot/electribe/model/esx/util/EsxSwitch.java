/*******************************************************************************
 * Copyright (c) 2009-2013 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 *******************************************************************************/
package com.skratchdot.electribe.model.esx.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import com.skratchdot.electribe.model.esx.EsxFile;
import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.GlobalParameters;
import com.skratchdot.electribe.model.esx.MidiChannelType;
import com.skratchdot.electribe.model.esx.MidiControlChangeAssignment;
import com.skratchdot.electribe.model.esx.Operation;
import com.skratchdot.electribe.model.esx.ParametersFx;
import com.skratchdot.electribe.model.esx.ParametersMotion;
import com.skratchdot.electribe.model.esx.Part;
import com.skratchdot.electribe.model.esx.PartAccent;
import com.skratchdot.electribe.model.esx.PartAudioIn;
import com.skratchdot.electribe.model.esx.PartDrum;
import com.skratchdot.electribe.model.esx.PartKeyboard;
import com.skratchdot.electribe.model.esx.PartNoteNumber;
import com.skratchdot.electribe.model.esx.PartStretchSlice;
import com.skratchdot.electribe.model.esx.PartWithCommon;
import com.skratchdot.electribe.model.esx.PartWithPitch;
import com.skratchdot.electribe.model.esx.PartWithSample;
import com.skratchdot.electribe.model.esx.PartWithSequenceData;
import com.skratchdot.electribe.model.esx.PartWithSequenceDataGate;
import com.skratchdot.electribe.model.esx.PartWithSlice;
import com.skratchdot.electribe.model.esx.Pattern;
import com.skratchdot.electribe.model.esx.PatternSetParameter;
import com.skratchdot.electribe.model.esx.Sample;
import com.skratchdot.electribe.model.esx.SampleInPatternInfo;
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
import com.skratchdot.electribe.model.esx.SongEventWithPart;
import com.skratchdot.electribe.model.esx.SongPattern;
import com.skratchdot.electribe.model.esx.Tempo;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.skratchdot.electribe.model.esx.EsxPackage
 * @generated
 */
public class EsxSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EsxPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EsxSwitch() {
		if (modelPackage == null) {
			modelPackage = EsxPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case EsxPackage.ESX_FILE: {
			EsxFile esxFile = (EsxFile) theEObject;
			T result = caseEsxFile(esxFile);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsxPackage.GLOBAL_PARAMETERS: {
			GlobalParameters globalParameters = (GlobalParameters) theEObject;
			T result = caseGlobalParameters(globalParameters);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsxPackage.MIDI_CHANNEL_TYPE: {
			MidiChannelType midiChannelType = (MidiChannelType) theEObject;
			T result = caseMidiChannelType(midiChannelType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsxPackage.MIDI_CONTROL_CHANGE_ASSIGNMENT: {
			MidiControlChangeAssignment midiControlChangeAssignment = (MidiControlChangeAssignment) theEObject;
			T result = caseMidiControlChangeAssignment(midiControlChangeAssignment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsxPackage.OPERATION: {
			Operation operation = (Operation) theEObject;
			T result = caseOperation(operation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsxPackage.PARAMETERS_FX: {
			ParametersFx parametersFx = (ParametersFx) theEObject;
			T result = caseParametersFx(parametersFx);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsxPackage.PARAMETERS_MOTION: {
			ParametersMotion parametersMotion = (ParametersMotion) theEObject;
			T result = caseParametersMotion(parametersMotion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsxPackage.PART: {
			Part part = (Part) theEObject;
			T result = casePart(part);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsxPackage.PART_ACCENT: {
			PartAccent partAccent = (PartAccent) theEObject;
			T result = casePartAccent(partAccent);
			if (result == null)
				result = casePart(partAccent);
			if (result == null)
				result = casePartWithSequenceData(partAccent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsxPackage.PART_AUDIO_IN: {
			PartAudioIn partAudioIn = (PartAudioIn) theEObject;
			T result = casePartAudioIn(partAudioIn);
			if (result == null)
				result = casePart(partAudioIn);
			if (result == null)
				result = casePartWithCommon(partAudioIn);
			if (result == null)
				result = casePartWithSequenceData(partAudioIn);
			if (result == null)
				result = casePartWithSequenceDataGate(partAudioIn);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsxPackage.PART_DRUM: {
			PartDrum partDrum = (PartDrum) theEObject;
			T result = casePartDrum(partDrum);
			if (result == null)
				result = casePart(partDrum);
			if (result == null)
				result = casePartWithCommon(partDrum);
			if (result == null)
				result = casePartWithPitch(partDrum);
			if (result == null)
				result = casePartWithSample(partDrum);
			if (result == null)
				result = casePartWithSequenceData(partDrum);
			if (result == null)
				result = casePartWithSlice(partDrum);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsxPackage.PART_KEYBOARD: {
			PartKeyboard partKeyboard = (PartKeyboard) theEObject;
			T result = casePartKeyboard(partKeyboard);
			if (result == null)
				result = casePart(partKeyboard);
			if (result == null)
				result = casePartWithCommon(partKeyboard);
			if (result == null)
				result = casePartWithSample(partKeyboard);
			if (result == null)
				result = casePartWithSequenceDataGate(partKeyboard);
			if (result == null)
				result = casePartWithSlice(partKeyboard);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsxPackage.PART_NOTE_NUMBER: {
			PartNoteNumber partNoteNumber = (PartNoteNumber) theEObject;
			T result = casePartNoteNumber(partNoteNumber);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsxPackage.PART_STRETCH_SLICE: {
			PartStretchSlice partStretchSlice = (PartStretchSlice) theEObject;
			T result = casePartStretchSlice(partStretchSlice);
			if (result == null)
				result = casePart(partStretchSlice);
			if (result == null)
				result = casePartWithCommon(partStretchSlice);
			if (result == null)
				result = casePartWithPitch(partStretchSlice);
			if (result == null)
				result = casePartWithSample(partStretchSlice);
			if (result == null)
				result = casePartWithSequenceData(partStretchSlice);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsxPackage.PART_WITH_COMMON: {
			PartWithCommon partWithCommon = (PartWithCommon) theEObject;
			T result = casePartWithCommon(partWithCommon);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsxPackage.PART_WITH_PITCH: {
			PartWithPitch partWithPitch = (PartWithPitch) theEObject;
			T result = casePartWithPitch(partWithPitch);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsxPackage.PART_WITH_SAMPLE: {
			PartWithSample partWithSample = (PartWithSample) theEObject;
			T result = casePartWithSample(partWithSample);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsxPackage.PART_WITH_SEQUENCE_DATA: {
			PartWithSequenceData partWithSequenceData = (PartWithSequenceData) theEObject;
			T result = casePartWithSequenceData(partWithSequenceData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsxPackage.PART_WITH_SEQUENCE_DATA_GATE: {
			PartWithSequenceDataGate partWithSequenceDataGate = (PartWithSequenceDataGate) theEObject;
			T result = casePartWithSequenceDataGate(partWithSequenceDataGate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsxPackage.PART_WITH_SLICE: {
			PartWithSlice partWithSlice = (PartWithSlice) theEObject;
			T result = casePartWithSlice(partWithSlice);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsxPackage.PATTERN: {
			Pattern pattern = (Pattern) theEObject;
			T result = casePattern(pattern);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsxPackage.SAMPLE_IN_PATTERN_INFO: {
			SampleInPatternInfo sampleInPatternInfo = (SampleInPatternInfo) theEObject;
			T result = caseSampleInPatternInfo(sampleInPatternInfo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsxPackage.PATTERN_SET_PARAMETER: {
			PatternSetParameter patternSetParameter = (PatternSetParameter) theEObject;
			T result = casePatternSetParameter(patternSetParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsxPackage.SAMPLE: {
			Sample sample = (Sample) theEObject;
			T result = caseSample(sample);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsxPackage.SAMPLE_TUNE: {
			SampleTune sampleTune = (SampleTune) theEObject;
			T result = caseSampleTune(sampleTune);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsxPackage.SEQUENCE_DATA: {
			SequenceData sequenceData = (SequenceData) theEObject;
			T result = caseSequenceData(sequenceData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsxPackage.SEQUENCE_DATA_GATE: {
			SequenceDataGate sequenceDataGate = (SequenceDataGate) theEObject;
			T result = caseSequenceDataGate(sequenceDataGate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsxPackage.SEQUENCE_DATA_NOTE: {
			SequenceDataNote sequenceDataNote = (SequenceDataNote) theEObject;
			T result = caseSequenceDataNote(sequenceDataNote);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsxPackage.SONG: {
			Song song = (Song) theEObject;
			T result = caseSong(song);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsxPackage.SONG_EVENT: {
			SongEvent songEvent = (SongEvent) theEObject;
			T result = caseSongEvent(songEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsxPackage.SONG_EVENT_CONTROL: {
			SongEventControl songEventControl = (SongEventControl) theEObject;
			T result = caseSongEventControl(songEventControl);
			if (result == null)
				result = caseSongEvent(songEventControl);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsxPackage.SONG_EVENT_DRUM_NOTE: {
			SongEventDrumNote songEventDrumNote = (SongEventDrumNote) theEObject;
			T result = caseSongEventDrumNote(songEventDrumNote);
			if (result == null)
				result = caseSongEvent(songEventDrumNote);
			if (result == null)
				result = caseSongEventWithPart(songEventDrumNote);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsxPackage.SONG_EVENT_KEYBOARD_NOTE: {
			SongEventKeyboardNote songEventKeyboardNote = (SongEventKeyboardNote) theEObject;
			T result = caseSongEventKeyboardNote(songEventKeyboardNote);
			if (result == null)
				result = caseSongEvent(songEventKeyboardNote);
			if (result == null)
				result = caseSongEventWithPart(songEventKeyboardNote);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsxPackage.SONG_EVENT_MUTE_STATUS: {
			SongEventMuteStatus songEventMuteStatus = (SongEventMuteStatus) theEObject;
			T result = caseSongEventMuteStatus(songEventMuteStatus);
			if (result == null)
				result = caseSongEvent(songEventMuteStatus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsxPackage.SONG_EVENT_TEMPO: {
			SongEventTempo songEventTempo = (SongEventTempo) theEObject;
			T result = caseSongEventTempo(songEventTempo);
			if (result == null)
				result = caseSongEvent(songEventTempo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsxPackage.SONG_EVENT_WITH_PART: {
			SongEventWithPart songEventWithPart = (SongEventWithPart) theEObject;
			T result = caseSongEventWithPart(songEventWithPart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsxPackage.SONG_PATTERN: {
			SongPattern songPattern = (SongPattern) theEObject;
			T result = caseSongPattern(songPattern);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsxPackage.TEMPO: {
			Tempo tempo = (Tempo) theEObject;
			T result = caseTempo(tempo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEsxFile(EsxFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalParameters(GlobalParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Set Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Set Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatternSetParameter(PatternSetParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Midi Channel Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Midi Channel Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMidiChannelType(MidiChannelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part Note Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part Note Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartNoteNumber(PartNoteNumber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Midi Control Change Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Midi Control Change Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMidiControlChangeAssignment(MidiControlChangeAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameters Fx</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameters Fx</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParametersFx(ParametersFx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameters Motion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameters Motion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParametersMotion(ParametersMotion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceData(SequenceData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Data Gate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Data Gate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceDataGate(SequenceDataGate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Data Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Data Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceDataNote(SequenceDataNote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePart(Part object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part With Sequence Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part With Sequence Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartWithSequenceData(PartWithSequenceData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part With Common</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part With Common</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartWithCommon(PartWithCommon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part With Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part With Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartWithSample(PartWithSample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part With Slice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part With Slice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartWithSlice(PartWithSlice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part With Pitch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part With Pitch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartWithPitch(PartWithPitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part With Sequence Data Gate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part With Sequence Data Gate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartWithSequenceDataGate(PartWithSequenceDataGate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part Accent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part Accent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartAccent(PartAccent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part Audio In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part Audio In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartAudioIn(PartAudioIn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part Drum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part Drum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartDrum(PartDrum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part Keyboard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part Keyboard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartKeyboard(PartKeyboard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part Stretch Slice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part Stretch Slice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartStretchSlice(PartStretchSlice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern(Pattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSample(Sample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sample In Pattern Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sample In Pattern Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSampleInPatternInfo(SampleInPatternInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sample Tune</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sample Tune</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSampleTune(SampleTune object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Song</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Song</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSong(Song object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Song Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Song Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSongPattern(SongPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tempo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tempo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTempo(Tempo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Song Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Song Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSongEvent(SongEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Song Event With Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Song Event With Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSongEventWithPart(SongEventWithPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Song Event Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Song Event Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSongEventControl(SongEventControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Song Event Drum Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Song Event Drum Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSongEventDrumNote(SongEventDrumNote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Song Event Keyboard Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Song Event Keyboard Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSongEventKeyboardNote(SongEventKeyboardNote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Song Event Tempo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Song Event Tempo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSongEventTempo(SongEventTempo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Song Event Mute Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Song Event Mute Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSongEventMuteStatus(SongEventMuteStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EsxSwitch

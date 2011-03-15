/**
 * Copyright (c) 2009-2011 SKRATCHDOT.COM
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
package com.skratchdot.riff.wav.util;

import com.skratchdot.riff.wav.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

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
 * @see com.skratchdot.riff.wav.WavPackage
 * @generated
 */
public class WavSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WavPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WavSwitch() {
		if (modelPackage == null) {
			modelPackage = WavPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case WavPackage.RIFF_WAVE: {
				RIFFWave riffWave = (RIFFWave)theEObject;
				T result = caseRIFFWave(riffWave);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavPackage.CHANNEL: {
				Channel channel = (Channel)theEObject;
				T result = caseChannel(channel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavPackage.CHUNK: {
				Chunk chunk = (Chunk)theEObject;
				T result = caseChunk(chunk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavPackage.CHUNK_CUE: {
				ChunkCue chunkCue = (ChunkCue)theEObject;
				T result = caseChunkCue(chunkCue);
				if (result == null) result = caseChunk(chunkCue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavPackage.CHUNK_DATA: {
				ChunkData chunkData = (ChunkData)theEObject;
				T result = caseChunkData(chunkData);
				if (result == null) result = caseChunk(chunkData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavPackage.CHUNK_DATA_LIST: {
				ChunkDataList chunkDataList = (ChunkDataList)theEObject;
				T result = caseChunkDataList(chunkDataList);
				if (result == null) result = caseChunk(chunkDataList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavPackage.CHUNK_DATA_LIST_TYPE: {
				ChunkDataListType chunkDataListType = (ChunkDataListType)theEObject;
				T result = caseChunkDataListType(chunkDataListType);
				if (result == null) result = caseChunk(chunkDataListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavPackage.CHUNK_DATA_LIST_TYPE_LABEL: {
				ChunkDataListTypeLabel chunkDataListTypeLabel = (ChunkDataListTypeLabel)theEObject;
				T result = caseChunkDataListTypeLabel(chunkDataListTypeLabel);
				if (result == null) result = caseChunkDataListType(chunkDataListTypeLabel);
				if (result == null) result = caseChunk(chunkDataListTypeLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT: {
				ChunkDataListTypeLabeledText chunkDataListTypeLabeledText = (ChunkDataListTypeLabeledText)theEObject;
				T result = caseChunkDataListTypeLabeledText(chunkDataListTypeLabeledText);
				if (result == null) result = caseChunkDataListType(chunkDataListTypeLabeledText);
				if (result == null) result = caseChunk(chunkDataListTypeLabeledText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavPackage.CHUNK_DATA_LIST_TYPE_NOTE: {
				ChunkDataListTypeNote chunkDataListTypeNote = (ChunkDataListTypeNote)theEObject;
				T result = caseChunkDataListTypeNote(chunkDataListTypeNote);
				if (result == null) result = caseChunkDataListType(chunkDataListTypeNote);
				if (result == null) result = caseChunk(chunkDataListTypeNote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavPackage.CHUNK_FACT: {
				ChunkFact chunkFact = (ChunkFact)theEObject;
				T result = caseChunkFact(chunkFact);
				if (result == null) result = caseChunk(chunkFact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavPackage.CHUNK_FORMAT: {
				ChunkFormat chunkFormat = (ChunkFormat)theEObject;
				T result = caseChunkFormat(chunkFormat);
				if (result == null) result = caseChunk(chunkFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavPackage.CHUNK_INSTRUMENT: {
				ChunkInstrument chunkInstrument = (ChunkInstrument)theEObject;
				T result = caseChunkInstrument(chunkInstrument);
				if (result == null) result = caseChunk(chunkInstrument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavPackage.CHUNK_PLAY_LIST: {
				ChunkPlayList chunkPlayList = (ChunkPlayList)theEObject;
				T result = caseChunkPlayList(chunkPlayList);
				if (result == null) result = caseChunk(chunkPlayList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavPackage.CHUNK_SAMPLER: {
				ChunkSampler chunkSampler = (ChunkSampler)theEObject;
				T result = caseChunkSampler(chunkSampler);
				if (result == null) result = caseChunk(chunkSampler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavPackage.CHUNK_SILENT: {
				ChunkSilent chunkSilent = (ChunkSilent)theEObject;
				T result = caseChunkSilent(chunkSilent);
				if (result == null) result = caseChunk(chunkSilent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavPackage.CHUNK_UNKNOWN: {
				ChunkUnknown chunkUnknown = (ChunkUnknown)theEObject;
				T result = caseChunkUnknown(chunkUnknown);
				if (result == null) result = caseChunk(chunkUnknown);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavPackage.CHUNK_WAVE_LIST: {
				ChunkWaveList chunkWaveList = (ChunkWaveList)theEObject;
				T result = caseChunkWaveList(chunkWaveList);
				if (result == null) result = caseChunk(chunkWaveList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavPackage.CUE_POINT: {
				CuePoint cuePoint = (CuePoint)theEObject;
				T result = caseCuePoint(cuePoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavPackage.PARSE_CHUNK_EXCEPTION: {
				ParseChunkException parseChunkException = (ParseChunkException)theEObject;
				T result = caseParseChunkException(parseChunkException);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavPackage.SAMPLE_DATA: {
				SampleData sampleData = (SampleData)theEObject;
				T result = caseSampleData(sampleData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavPackage.SAMPLE_DATA8_BIT: {
				SampleData8Bit sampleData8Bit = (SampleData8Bit)theEObject;
				T result = caseSampleData8Bit(sampleData8Bit);
				if (result == null) result = caseSampleData(sampleData8Bit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavPackage.SAMPLE_DATA16_BIT: {
				SampleData16Bit sampleData16Bit = (SampleData16Bit)theEObject;
				T result = caseSampleData16Bit(sampleData16Bit);
				if (result == null) result = caseSampleData(sampleData16Bit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavPackage.SAMPLE_LOOP: {
				SampleLoop sampleLoop = (SampleLoop)theEObject;
				T result = caseSampleLoop(sampleLoop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavPackage.SEGMENT: {
				Segment segment = (Segment)theEObject;
				T result = caseSegment(segment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RIFF Wave</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RIFF Wave</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRIFFWave(RIFFWave object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannel(Channel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chunk</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chunk</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChunk(Chunk object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chunk Cue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chunk Cue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChunkCue(ChunkCue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chunk Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chunk Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChunkData(ChunkData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chunk Data List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chunk Data List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChunkDataList(ChunkDataList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chunk Data List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chunk Data List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChunkDataListType(ChunkDataListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chunk Data List Type Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chunk Data List Type Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChunkDataListTypeLabel(ChunkDataListTypeLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chunk Data List Type Labeled Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chunk Data List Type Labeled Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChunkDataListTypeLabeledText(ChunkDataListTypeLabeledText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chunk Data List Type Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chunk Data List Type Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChunkDataListTypeNote(ChunkDataListTypeNote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chunk Fact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chunk Fact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChunkFact(ChunkFact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chunk Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chunk Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChunkFormat(ChunkFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chunk Instrument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chunk Instrument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChunkInstrument(ChunkInstrument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chunk Play List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chunk Play List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChunkPlayList(ChunkPlayList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chunk Sampler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chunk Sampler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChunkSampler(ChunkSampler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chunk Silent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chunk Silent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChunkSilent(ChunkSilent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chunk Unknown</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chunk Unknown</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChunkUnknown(ChunkUnknown object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chunk Wave List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chunk Wave List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChunkWaveList(ChunkWaveList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cue Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cue Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCuePoint(CuePoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parse Chunk Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parse Chunk Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParseChunkException(ParseChunkException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sample Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sample Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSampleData(SampleData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sample Data8 Bit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sample Data8 Bit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSampleData8Bit(SampleData8Bit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sample Data16 Bit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sample Data16 Bit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSampleData16Bit(SampleData16Bit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sample Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sample Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSampleLoop(SampleLoop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSegment(Segment object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //WavSwitch

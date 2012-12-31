/*******************************************************************************
 * Copyright (c) 2009-2013 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 *******************************************************************************/
package com.skratchdot.riff.wav.util;

import com.skratchdot.riff.wav.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.skratchdot.riff.wav.WavPackage
 * @generated
 */
public class WavAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WavPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WavAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WavPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WavSwitch<Adapter> modelSwitch = new WavSwitch<Adapter>() {
		@Override
		public Adapter caseRIFFWave(RIFFWave object) {
			return createRIFFWaveAdapter();
		}

		@Override
		public Adapter caseChannel(Channel object) {
			return createChannelAdapter();
		}

		@Override
		public Adapter caseChunk(Chunk object) {
			return createChunkAdapter();
		}

		@Override
		public Adapter caseChunkCue(ChunkCue object) {
			return createChunkCueAdapter();
		}

		@Override
		public Adapter caseChunkData(ChunkData object) {
			return createChunkDataAdapter();
		}

		@Override
		public Adapter caseChunkDataList(ChunkDataList object) {
			return createChunkDataListAdapter();
		}

		@Override
		public Adapter caseChunkDataListType(ChunkDataListType object) {
			return createChunkDataListTypeAdapter();
		}

		@Override
		public Adapter caseChunkDataListTypeLabel(ChunkDataListTypeLabel object) {
			return createChunkDataListTypeLabelAdapter();
		}

		@Override
		public Adapter caseChunkDataListTypeLabeledText(
				ChunkDataListTypeLabeledText object) {
			return createChunkDataListTypeLabeledTextAdapter();
		}

		@Override
		public Adapter caseChunkDataListTypeNote(ChunkDataListTypeNote object) {
			return createChunkDataListTypeNoteAdapter();
		}

		@Override
		public Adapter caseChunkFact(ChunkFact object) {
			return createChunkFactAdapter();
		}

		@Override
		public Adapter caseChunkFormat(ChunkFormat object) {
			return createChunkFormatAdapter();
		}

		@Override
		public Adapter caseChunkInstrument(ChunkInstrument object) {
			return createChunkInstrumentAdapter();
		}

		@Override
		public Adapter caseChunkPlayList(ChunkPlayList object) {
			return createChunkPlayListAdapter();
		}

		@Override
		public Adapter caseChunkSampler(ChunkSampler object) {
			return createChunkSamplerAdapter();
		}

		@Override
		public Adapter caseChunkSilent(ChunkSilent object) {
			return createChunkSilentAdapter();
		}

		@Override
		public Adapter caseChunkUnknown(ChunkUnknown object) {
			return createChunkUnknownAdapter();
		}

		@Override
		public Adapter caseChunkWaveList(ChunkWaveList object) {
			return createChunkWaveListAdapter();
		}

		@Override
		public Adapter caseCuePoint(CuePoint object) {
			return createCuePointAdapter();
		}

		@Override
		public Adapter caseParseChunkException(ParseChunkException object) {
			return createParseChunkExceptionAdapter();
		}

		@Override
		public Adapter caseSampleData(SampleData object) {
			return createSampleDataAdapter();
		}

		@Override
		public Adapter caseSampleData8Bit(SampleData8Bit object) {
			return createSampleData8BitAdapter();
		}

		@Override
		public Adapter caseSampleData16Bit(SampleData16Bit object) {
			return createSampleData16BitAdapter();
		}

		@Override
		public Adapter caseSampleLoop(SampleLoop object) {
			return createSampleLoopAdapter();
		}

		@Override
		public Adapter caseSegment(Segment object) {
			return createSegmentAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.riff.wav.RIFFWave <em>RIFF Wave</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.riff.wav.RIFFWave
	 * @generated
	 */
	public Adapter createRIFFWaveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.riff.wav.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.riff.wav.Channel
	 * @generated
	 */
	public Adapter createChannelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.riff.wav.Chunk <em>Chunk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.riff.wav.Chunk
	 * @generated
	 */
	public Adapter createChunkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.riff.wav.ChunkCue <em>Chunk Cue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.riff.wav.ChunkCue
	 * @generated
	 */
	public Adapter createChunkCueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.riff.wav.ChunkData <em>Chunk Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.riff.wav.ChunkData
	 * @generated
	 */
	public Adapter createChunkDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.riff.wav.ChunkDataList <em>Chunk Data List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.riff.wav.ChunkDataList
	 * @generated
	 */
	public Adapter createChunkDataListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.riff.wav.ChunkDataListType <em>Chunk Data List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.riff.wav.ChunkDataListType
	 * @generated
	 */
	public Adapter createChunkDataListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.riff.wav.ChunkDataListTypeLabel <em>Chunk Data List Type Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.riff.wav.ChunkDataListTypeLabel
	 * @generated
	 */
	public Adapter createChunkDataListTypeLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.riff.wav.ChunkDataListTypeLabeledText <em>Chunk Data List Type Labeled Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.riff.wav.ChunkDataListTypeLabeledText
	 * @generated
	 */
	public Adapter createChunkDataListTypeLabeledTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.riff.wav.ChunkDataListTypeNote <em>Chunk Data List Type Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.riff.wav.ChunkDataListTypeNote
	 * @generated
	 */
	public Adapter createChunkDataListTypeNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.riff.wav.ChunkFact <em>Chunk Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.riff.wav.ChunkFact
	 * @generated
	 */
	public Adapter createChunkFactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.riff.wav.ChunkFormat <em>Chunk Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.riff.wav.ChunkFormat
	 * @generated
	 */
	public Adapter createChunkFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.riff.wav.ChunkInstrument <em>Chunk Instrument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.riff.wav.ChunkInstrument
	 * @generated
	 */
	public Adapter createChunkInstrumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.riff.wav.ChunkPlayList <em>Chunk Play List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.riff.wav.ChunkPlayList
	 * @generated
	 */
	public Adapter createChunkPlayListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.riff.wav.ChunkSampler <em>Chunk Sampler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.riff.wav.ChunkSampler
	 * @generated
	 */
	public Adapter createChunkSamplerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.riff.wav.ChunkSilent <em>Chunk Silent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.riff.wav.ChunkSilent
	 * @generated
	 */
	public Adapter createChunkSilentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.riff.wav.ChunkUnknown <em>Chunk Unknown</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.riff.wav.ChunkUnknown
	 * @generated
	 */
	public Adapter createChunkUnknownAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.riff.wav.ChunkWaveList <em>Chunk Wave List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.riff.wav.ChunkWaveList
	 * @generated
	 */
	public Adapter createChunkWaveListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.riff.wav.CuePoint <em>Cue Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.riff.wav.CuePoint
	 * @generated
	 */
	public Adapter createCuePointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.riff.wav.ParseChunkException <em>Parse Chunk Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.riff.wav.ParseChunkException
	 * @generated
	 */
	public Adapter createParseChunkExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.riff.wav.SampleData <em>Sample Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.riff.wav.SampleData
	 * @generated
	 */
	public Adapter createSampleDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.riff.wav.SampleData8Bit <em>Sample Data8 Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.riff.wav.SampleData8Bit
	 * @generated
	 */
	public Adapter createSampleData8BitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.riff.wav.SampleData16Bit <em>Sample Data16 Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.riff.wav.SampleData16Bit
	 * @generated
	 */
	public Adapter createSampleData16BitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.riff.wav.SampleLoop <em>Sample Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.riff.wav.SampleLoop
	 * @generated
	 */
	public Adapter createSampleLoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.riff.wav.Segment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.riff.wav.Segment
	 * @generated
	 */
	public Adapter createSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WavAdapterFactory

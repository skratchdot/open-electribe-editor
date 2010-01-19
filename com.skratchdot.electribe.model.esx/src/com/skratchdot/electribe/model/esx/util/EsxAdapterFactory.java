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
package com.skratchdot.electribe.model.esx.util;

import com.skratchdot.electribe.model.esx.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.skratchdot.electribe.model.esx.EsxPackage
 * @generated
 */
public class EsxAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EsxPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EsxAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EsxPackage.eINSTANCE;
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
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EsxSwitch<Adapter> modelSwitch =
		new EsxSwitch<Adapter>() {
			@Override
			public Adapter caseEsxFile(EsxFile object) {
				return createEsxFileAdapter();
			}
			@Override
			public Adapter caseGlobalParameters(GlobalParameters object) {
				return createGlobalParametersAdapter();
			}
			@Override
			public Adapter casePatternSetParameter(PatternSetParameter object) {
				return createPatternSetParameterAdapter();
			}
			@Override
			public Adapter caseMidiChannelType(MidiChannelType object) {
				return createMidiChannelTypeAdapter();
			}
			@Override
			public Adapter casePartNoteNumber(PartNoteNumber object) {
				return createPartNoteNumberAdapter();
			}
			@Override
			public Adapter caseMidiControlChangeAssignment(MidiControlChangeAssignment object) {
				return createMidiControlChangeAssignmentAdapter();
			}
			@Override
			public Adapter caseParametersFx(ParametersFx object) {
				return createParametersFxAdapter();
			}
			@Override
			public Adapter caseParametersMotion(ParametersMotion object) {
				return createParametersMotionAdapter();
			}
			@Override
			public Adapter caseSequenceData(SequenceData object) {
				return createSequenceDataAdapter();
			}
			@Override
			public Adapter caseSequenceDataGate(SequenceDataGate object) {
				return createSequenceDataGateAdapter();
			}
			@Override
			public Adapter caseSequenceDataNote(SequenceDataNote object) {
				return createSequenceDataNoteAdapter();
			}
			@Override
			public Adapter casePart(Part object) {
				return createPartAdapter();
			}
			@Override
			public Adapter casePartWithSequenceData(PartWithSequenceData object) {
				return createPartWithSequenceDataAdapter();
			}
			@Override
			public Adapter casePartWithCommon(PartWithCommon object) {
				return createPartWithCommonAdapter();
			}
			@Override
			public Adapter casePartWithSample(PartWithSample object) {
				return createPartWithSampleAdapter();
			}
			@Override
			public Adapter casePartWithSlice(PartWithSlice object) {
				return createPartWithSliceAdapter();
			}
			@Override
			public Adapter casePartWithPitch(PartWithPitch object) {
				return createPartWithPitchAdapter();
			}
			@Override
			public Adapter casePartWithSequenceDataGate(PartWithSequenceDataGate object) {
				return createPartWithSequenceDataGateAdapter();
			}
			@Override
			public Adapter casePartAccent(PartAccent object) {
				return createPartAccentAdapter();
			}
			@Override
			public Adapter casePartAudioIn(PartAudioIn object) {
				return createPartAudioInAdapter();
			}
			@Override
			public Adapter casePartDrum(PartDrum object) {
				return createPartDrumAdapter();
			}
			@Override
			public Adapter casePartKeyboard(PartKeyboard object) {
				return createPartKeyboardAdapter();
			}
			@Override
			public Adapter casePartStretchSlice(PartStretchSlice object) {
				return createPartStretchSliceAdapter();
			}
			@Override
			public Adapter casePattern(Pattern object) {
				return createPatternAdapter();
			}
			@Override
			public Adapter caseSample(Sample object) {
				return createSampleAdapter();
			}
			@Override
			public Adapter caseSampleMono(SampleMono object) {
				return createSampleMonoAdapter();
			}
			@Override
			public Adapter caseSampleStereo(SampleStereo object) {
				return createSampleStereoAdapter();
			}
			@Override
			public Adapter caseSong(Song object) {
				return createSongAdapter();
			}
			@Override
			public Adapter caseTempo(Tempo object) {
				return createTempoAdapter();
			}
			@Override
			public Adapter caseSongEvent(SongEvent object) {
				return createSongEventAdapter();
			}
			@Override
			public Adapter caseSongEventWithPart(SongEventWithPart object) {
				return createSongEventWithPartAdapter();
			}
			@Override
			public Adapter caseSongEventControl(SongEventControl object) {
				return createSongEventControlAdapter();
			}
			@Override
			public Adapter caseSongEventDrumNote(SongEventDrumNote object) {
				return createSongEventDrumNoteAdapter();
			}
			@Override
			public Adapter caseSongEventKeyboardNote(SongEventKeyboardNote object) {
				return createSongEventKeyboardNoteAdapter();
			}
			@Override
			public Adapter caseSongEventTempo(SongEventTempo object) {
				return createSongEventTempoAdapter();
			}
			@Override
			public Adapter caseSongEventMuteStatus(SongEventMuteStatus object) {
				return createSongEventMuteStatusAdapter();
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
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.electribe.model.esx.EsxFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.electribe.model.esx.EsxFile
	 * @generated
	 */
	public Adapter createEsxFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.electribe.model.esx.GlobalParameters <em>Global Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.electribe.model.esx.GlobalParameters
	 * @generated
	 */
	public Adapter createGlobalParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.electribe.model.esx.PatternSetParameter <em>Pattern Set Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.electribe.model.esx.PatternSetParameter
	 * @generated
	 */
	public Adapter createPatternSetParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.electribe.model.esx.MidiChannelType <em>Midi Channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.electribe.model.esx.MidiChannelType
	 * @generated
	 */
	public Adapter createMidiChannelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.electribe.model.esx.PartNoteNumber <em>Part Note Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.electribe.model.esx.PartNoteNumber
	 * @generated
	 */
	public Adapter createPartNoteNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.electribe.model.esx.MidiControlChangeAssignment <em>Midi Control Change Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.electribe.model.esx.MidiControlChangeAssignment
	 * @generated
	 */
	public Adapter createMidiControlChangeAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.electribe.model.esx.ParametersFx <em>Parameters Fx</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.electribe.model.esx.ParametersFx
	 * @generated
	 */
	public Adapter createParametersFxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.electribe.model.esx.ParametersMotion <em>Parameters Motion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.electribe.model.esx.ParametersMotion
	 * @generated
	 */
	public Adapter createParametersMotionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.electribe.model.esx.SequenceData <em>Sequence Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.electribe.model.esx.SequenceData
	 * @generated
	 */
	public Adapter createSequenceDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.electribe.model.esx.SequenceDataGate <em>Sequence Data Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.electribe.model.esx.SequenceDataGate
	 * @generated
	 */
	public Adapter createSequenceDataGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.electribe.model.esx.SequenceDataNote <em>Sequence Data Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.electribe.model.esx.SequenceDataNote
	 * @generated
	 */
	public Adapter createSequenceDataNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.electribe.model.esx.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.electribe.model.esx.Part
	 * @generated
	 */
	public Adapter createPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.electribe.model.esx.PartWithSequenceData <em>Part With Sequence Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.electribe.model.esx.PartWithSequenceData
	 * @generated
	 */
	public Adapter createPartWithSequenceDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.electribe.model.esx.PartWithCommon <em>Part With Common</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.electribe.model.esx.PartWithCommon
	 * @generated
	 */
	public Adapter createPartWithCommonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.electribe.model.esx.PartWithSample <em>Part With Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.electribe.model.esx.PartWithSample
	 * @generated
	 */
	public Adapter createPartWithSampleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.electribe.model.esx.PartWithSlice <em>Part With Slice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.electribe.model.esx.PartWithSlice
	 * @generated
	 */
	public Adapter createPartWithSliceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.electribe.model.esx.PartWithPitch <em>Part With Pitch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.electribe.model.esx.PartWithPitch
	 * @generated
	 */
	public Adapter createPartWithPitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.electribe.model.esx.PartWithSequenceDataGate <em>Part With Sequence Data Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.electribe.model.esx.PartWithSequenceDataGate
	 * @generated
	 */
	public Adapter createPartWithSequenceDataGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.electribe.model.esx.PartAccent <em>Part Accent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.electribe.model.esx.PartAccent
	 * @generated
	 */
	public Adapter createPartAccentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.electribe.model.esx.PartAudioIn <em>Part Audio In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.electribe.model.esx.PartAudioIn
	 * @generated
	 */
	public Adapter createPartAudioInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.electribe.model.esx.PartDrum <em>Part Drum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.electribe.model.esx.PartDrum
	 * @generated
	 */
	public Adapter createPartDrumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.electribe.model.esx.PartKeyboard <em>Part Keyboard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.electribe.model.esx.PartKeyboard
	 * @generated
	 */
	public Adapter createPartKeyboardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.electribe.model.esx.PartStretchSlice <em>Part Stretch Slice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.electribe.model.esx.PartStretchSlice
	 * @generated
	 */
	public Adapter createPartStretchSliceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.electribe.model.esx.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.electribe.model.esx.Pattern
	 * @generated
	 */
	public Adapter createPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.electribe.model.esx.Sample <em>Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.electribe.model.esx.Sample
	 * @generated
	 */
	public Adapter createSampleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.electribe.model.esx.SampleMono <em>Sample Mono</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.electribe.model.esx.SampleMono
	 * @generated
	 */
	public Adapter createSampleMonoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.electribe.model.esx.SampleStereo <em>Sample Stereo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.electribe.model.esx.SampleStereo
	 * @generated
	 */
	public Adapter createSampleStereoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.electribe.model.esx.Song <em>Song</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.electribe.model.esx.Song
	 * @generated
	 */
	public Adapter createSongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.electribe.model.esx.Tempo <em>Tempo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.electribe.model.esx.Tempo
	 * @generated
	 */
	public Adapter createTempoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.electribe.model.esx.SongEvent <em>Song Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.electribe.model.esx.SongEvent
	 * @generated
	 */
	public Adapter createSongEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.electribe.model.esx.SongEventWithPart <em>Song Event With Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.electribe.model.esx.SongEventWithPart
	 * @generated
	 */
	public Adapter createSongEventWithPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.electribe.model.esx.SongEventControl <em>Song Event Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.electribe.model.esx.SongEventControl
	 * @generated
	 */
	public Adapter createSongEventControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.electribe.model.esx.SongEventDrumNote <em>Song Event Drum Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.electribe.model.esx.SongEventDrumNote
	 * @generated
	 */
	public Adapter createSongEventDrumNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.electribe.model.esx.SongEventKeyboardNote <em>Song Event Keyboard Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.electribe.model.esx.SongEventKeyboardNote
	 * @generated
	 */
	public Adapter createSongEventKeyboardNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.electribe.model.esx.SongEventTempo <em>Song Event Tempo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.electribe.model.esx.SongEventTempo
	 * @generated
	 */
	public Adapter createSongEventTempoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.skratchdot.electribe.model.esx.SongEventMuteStatus <em>Song Event Mute Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.skratchdot.electribe.model.esx.SongEventMuteStatus
	 * @generated
	 */
	public Adapter createSongEventMuteStatusAdapter() {
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

} //EsxAdapterFactory

/**
 * Copyright (c) 2009-2011 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 *
 * $Id$
 */
package com.skratchdot.electribe.model.esx;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.skratchdot.electribe.model.esx.EsxFactory
 * @model kind="package"
 * @generated
 */
public interface EsxPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "esx";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///com/skratchdot/electribe/model/esx.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.skratchdot.electribe.model.esx";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EsxPackage eINSTANCE = com.skratchdot.electribe.model.esx.impl.EsxPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.EsxFileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.EsxFileImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getEsxFile()
	 * @generated
	 */
	int ESX_FILE = 0;

	/**
	 * The feature id for the '<em><b>Original Non Audio Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESX_FILE__ORIGINAL_NON_AUDIO_DATA = 0;

	/**
	 * The feature id for the '<em><b>Global Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESX_FILE__GLOBAL_PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESX_FILE__PATTERNS = 2;

	/**
	 * The feature id for the '<em><b>Songs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESX_FILE__SONGS = 3;

	/**
	 * The feature id for the '<em><b>Samples</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESX_FILE__SAMPLES = 4;

	/**
	 * The feature id for the '<em><b>Empty Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESX_FILE__EMPTY_PATTERN = 5;

	/**
	 * The feature id for the '<em><b>Empty Song</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESX_FILE__EMPTY_SONG = 6;

	/**
	 * The feature id for the '<em><b>Max Sample Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESX_FILE__MAX_SAMPLE_OFFSET = 7;

	/**
	 * The feature id for the '<em><b>Mem Used In Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESX_FILE__MEM_USED_IN_BYTES = 8;

	/**
	 * The feature id for the '<em><b>Mem Used In Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESX_FILE__MEM_USED_IN_SECONDS = 9;

	/**
	 * The feature id for the '<em><b>Mem Free In Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESX_FILE__MEM_FREE_IN_BYTES = 10;

	/**
	 * The feature id for the '<em><b>Mem Free In Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESX_FILE__MEM_FREE_IN_SECONDS = 11;

	/**
	 * The feature id for the '<em><b>Num Patterns Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESX_FILE__NUM_PATTERNS_EMPTY = 12;

	/**
	 * The feature id for the '<em><b>Num Patterns Not Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESX_FILE__NUM_PATTERNS_NOT_EMPTY = 13;

	/**
	 * The feature id for the '<em><b>Num Samples Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESX_FILE__NUM_SAMPLES_EMPTY = 14;

	/**
	 * The feature id for the '<em><b>Num Samples Not Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESX_FILE__NUM_SAMPLES_NOT_EMPTY = 15;

	/**
	 * The feature id for the '<em><b>Num Samples Mono Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESX_FILE__NUM_SAMPLES_MONO_EMPTY = 16;

	/**
	 * The feature id for the '<em><b>Num Samples Mono Not Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESX_FILE__NUM_SAMPLES_MONO_NOT_EMPTY = 17;

	/**
	 * The feature id for the '<em><b>Num Samples Stereo Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESX_FILE__NUM_SAMPLES_STEREO_EMPTY = 18;

	/**
	 * The feature id for the '<em><b>Num Samples Stereo Not Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESX_FILE__NUM_SAMPLES_STEREO_NOT_EMPTY = 19;

	/**
	 * The feature id for the '<em><b>Num Songs Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESX_FILE__NUM_SONGS_EMPTY = 20;

	/**
	 * The feature id for the '<em><b>Num Songs Not Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESX_FILE__NUM_SONGS_NOT_EMPTY = 21;

	/**
	 * The feature id for the '<em><b>Sync Patterns On Move Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESX_FILE__SYNC_PATTERNS_ON_MOVE_ENABLED = 22;

	/**
	 * The feature id for the '<em><b>Sync Samples On Move Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESX_FILE__SYNC_SAMPLES_ON_MOVE_ENABLED = 23;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESX_FILE_FEATURE_COUNT = 24;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.GlobalParametersImpl <em>Global Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.GlobalParametersImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getGlobalParameters()
	 * @generated
	 */
	int GLOBAL_PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Memory Protect Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_PARAMETERS__MEMORY_PROTECT_ENABLED = 0;

	/**
	 * The feature id for the '<em><b>Reserved Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_PARAMETERS__RESERVED_BYTE = 1;

	/**
	 * The feature id for the '<em><b>Arpeggiator Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_PARAMETERS__ARPEGGIATOR_CONTROL = 2;

	/**
	 * The feature id for the '<em><b>Audio In Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_PARAMETERS__AUDIO_IN_MODE = 3;

	/**
	 * The feature id for the '<em><b>Midi Clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_PARAMETERS__MIDI_CLOCK = 4;

	/**
	 * The feature id for the '<em><b>Note Message Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_PARAMETERS__NOTE_MESSAGE_ENABLED = 5;

	/**
	 * The feature id for the '<em><b>System Ex Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_PARAMETERS__SYSTEM_EX_ENABLED = 6;

	/**
	 * The feature id for the '<em><b>Control Change Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_PARAMETERS__CONTROL_CHANGE_ENABLED = 7;

	/**
	 * The feature id for the '<em><b>Program Change Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_PARAMETERS__PROGRAM_CHANGE_ENABLED = 8;

	/**
	 * The feature id for the '<em><b>Reserved Bits After Program Change Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_PARAMETERS__RESERVED_BITS_AFTER_PROGRAM_CHANGE_ENABLED = 9;

	/**
	 * The feature id for the '<em><b>Pitch Bend Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_PARAMETERS__PITCH_BEND_RANGE = 10;

	/**
	 * The feature id for the '<em><b>Midi Channels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_PARAMETERS__MIDI_CHANNELS = 11;

	/**
	 * The feature id for the '<em><b>Part Note Numbers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_PARAMETERS__PART_NOTE_NUMBERS = 12;

	/**
	 * The feature id for the '<em><b>Midi Control Change Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_PARAMETERS__MIDI_CONTROL_CHANGE_ASSIGNMENTS = 13;

	/**
	 * The feature id for the '<em><b>Reserved Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_PARAMETERS__RESERVED_LONG = 14;

	/**
	 * The feature id for the '<em><b>Pattern Set Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_PARAMETERS__PATTERN_SET_PARAMETERS = 15;

	/**
	 * The number of structural features of the '<em>Global Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_PARAMETERS_FEATURE_COUNT = 16;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.PatternSetParameterImpl <em>Pattern Set Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.PatternSetParameterImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPatternSetParameter()
	 * @generated
	 */
	int PATTERN_SET_PARAMETER = 21;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.MidiChannelTypeImpl <em>Midi Channel Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.MidiChannelTypeImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getMidiChannelType()
	 * @generated
	 */
	int MIDI_CHANNEL_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_CHANNEL_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Midi Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_CHANNEL_TYPE__MIDI_CHANNEL = 1;

	/**
	 * The number of structural features of the '<em>Midi Channel Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_CHANNEL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.PartNoteNumberImpl <em>Part Note Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.PartNoteNumberImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPartNoteNumber()
	 * @generated
	 */
	int PART_NOTE_NUMBER = 12;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.MidiControlChangeAssignmentImpl <em>Midi Control Change Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.MidiControlChangeAssignmentImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getMidiControlChangeAssignment()
	 * @generated
	 */
	int MIDI_CONTROL_CHANGE_ASSIGNMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_CONTROL_CHANGE_ASSIGNMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_CONTROL_CHANGE_ASSIGNMENT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Midi Control Change Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_CONTROL_CHANGE_ASSIGNMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.OperationImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.ParametersFxImpl <em>Parameters Fx</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.ParametersFxImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getParametersFx()
	 * @generated
	 */
	int PARAMETERS_FX = 5;

	/**
	 * The feature id for the '<em><b>Effect Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_FX__EFFECT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Edit1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_FX__EDIT1 = 1;

	/**
	 * The feature id for the '<em><b>Edit2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_FX__EDIT2 = 2;

	/**
	 * The feature id for the '<em><b>Motion Sequence Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_FX__MOTION_SEQUENCE_STATUS = 3;

	/**
	 * The number of structural features of the '<em>Parameters Fx</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_FX_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.ParametersMotionImpl <em>Parameters Motion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.ParametersMotionImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getParametersMotion()
	 * @generated
	 */
	int PARAMETERS_MOTION = 6;

	/**
	 * The feature id for the '<em><b>Current Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_MOTION__CURRENT_POSITION = 0;

	/**
	 * The feature id for the '<em><b>Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_MOTION__EMPTY = 1;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_MOTION__OPERATION = 2;

	/**
	 * The feature id for the '<em><b>Operation Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_MOTION__OPERATION_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Operation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_MOTION__OPERATION_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Parameters Motion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_MOTION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.SequenceDataImpl <em>Sequence Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.SequenceDataImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSequenceData()
	 * @generated
	 */
	int SEQUENCE_DATA = 25;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.SequenceDataGateImpl <em>Sequence Data Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.SequenceDataGateImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSequenceDataGate()
	 * @generated
	 */
	int SEQUENCE_DATA_GATE = 26;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.SequenceDataNoteImpl <em>Sequence Data Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.SequenceDataNoteImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSequenceDataNote()
	 * @generated
	 */
	int SEQUENCE_DATA_NOTE = 27;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.PartImpl <em>Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.PartImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPart()
	 * @generated
	 */
	int PART = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Motion Sequence Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__MOTION_SEQUENCE_STATUS = 2;

	/**
	 * The number of structural features of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.PartWithSequenceDataImpl <em>Part With Sequence Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.PartWithSequenceDataImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPartWithSequenceData()
	 * @generated
	 */
	int PART_WITH_SEQUENCE_DATA = 17;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.PartWithCommonImpl <em>Part With Common</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.PartWithCommonImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPartWithCommon()
	 * @generated
	 */
	int PART_WITH_COMMON = 14;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.PartWithSampleImpl <em>Part With Sample</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.PartWithSampleImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPartWithSample()
	 * @generated
	 */
	int PART_WITH_SAMPLE = 16;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.PartWithSliceImpl <em>Part With Slice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.PartWithSliceImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPartWithSlice()
	 * @generated
	 */
	int PART_WITH_SLICE = 19;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.PartWithPitchImpl <em>Part With Pitch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.PartWithPitchImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPartWithPitch()
	 * @generated
	 */
	int PART_WITH_PITCH = 15;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.PartWithSequenceDataGateImpl <em>Part With Sequence Data Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.PartWithSequenceDataGateImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPartWithSequenceDataGate()
	 * @generated
	 */
	int PART_WITH_SEQUENCE_DATA_GATE = 18;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.PartAccentImpl <em>Part Accent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.PartAccentImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPartAccent()
	 * @generated
	 */
	int PART_ACCENT = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_ACCENT__LABEL = PART__LABEL;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_ACCENT__LEVEL = PART__LEVEL;

	/**
	 * The feature id for the '<em><b>Motion Sequence Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_ACCENT__MOTION_SEQUENCE_STATUS = PART__MOTION_SEQUENCE_STATUS;

	/**
	 * The feature id for the '<em><b>Sequence Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_ACCENT__SEQUENCE_DATA = PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Part Accent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_ACCENT_FEATURE_COUNT = PART_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.PartAudioInImpl <em>Part Audio In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.PartAudioInImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPartAudioIn()
	 * @generated
	 */
	int PART_AUDIO_IN = 9;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_AUDIO_IN__LABEL = PART__LABEL;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_AUDIO_IN__LEVEL = PART__LEVEL;

	/**
	 * The feature id for the '<em><b>Motion Sequence Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_AUDIO_IN__MOTION_SEQUENCE_STATUS = PART__MOTION_SEQUENCE_STATUS;

	/**
	 * The feature id for the '<em><b>Amp Eg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_AUDIO_IN__AMP_EG = PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bpm Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_AUDIO_IN__BPM_SYNC = PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cutoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_AUDIO_IN__CUTOFF = PART_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Eg Intensity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_AUDIO_IN__EG_INTENSITY = PART_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Eg Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_AUDIO_IN__EG_TIME = PART_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Filter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_AUDIO_IN__FILTER_TYPE = PART_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fx Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_AUDIO_IN__FX_SELECT = PART_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Fx Send</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_AUDIO_IN__FX_SEND = PART_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Mod Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_AUDIO_IN__MOD_DEPTH = PART_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Mod Dest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_AUDIO_IN__MOD_DEST = PART_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Mod Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_AUDIO_IN__MOD_SPEED = PART_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Mod Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_AUDIO_IN__MOD_TYPE = PART_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Pan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_AUDIO_IN__PAN = PART_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Reserved Bit After Mod Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_AUDIO_IN__RESERVED_BIT_AFTER_MOD_DEPTH = PART_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Resonance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_AUDIO_IN__RESONANCE = PART_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Roll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_AUDIO_IN__ROLL = PART_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Sequence Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_AUDIO_IN__SEQUENCE_DATA = PART_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Sequence Data Gate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_AUDIO_IN__SEQUENCE_DATA_GATE = PART_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Reserved Bits Byte7</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_AUDIO_IN__RESERVED_BITS_BYTE7 = PART_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Part Audio In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_AUDIO_IN_FEATURE_COUNT = PART_FEATURE_COUNT + 19;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.PartDrumImpl <em>Part Drum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.PartDrumImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPartDrum()
	 * @generated
	 */
	int PART_DRUM = 10;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DRUM__LABEL = PART__LABEL;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DRUM__LEVEL = PART__LEVEL;

	/**
	 * The feature id for the '<em><b>Motion Sequence Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DRUM__MOTION_SEQUENCE_STATUS = PART__MOTION_SEQUENCE_STATUS;

	/**
	 * The feature id for the '<em><b>Amp Eg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DRUM__AMP_EG = PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bpm Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DRUM__BPM_SYNC = PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cutoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DRUM__CUTOFF = PART_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Eg Intensity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DRUM__EG_INTENSITY = PART_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Eg Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DRUM__EG_TIME = PART_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Filter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DRUM__FILTER_TYPE = PART_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fx Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DRUM__FX_SELECT = PART_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Fx Send</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DRUM__FX_SEND = PART_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Mod Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DRUM__MOD_DEPTH = PART_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Mod Dest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DRUM__MOD_DEST = PART_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Mod Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DRUM__MOD_SPEED = PART_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Mod Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DRUM__MOD_TYPE = PART_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Pan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DRUM__PAN = PART_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Reserved Bit After Mod Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DRUM__RESERVED_BIT_AFTER_MOD_DEPTH = PART_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Resonance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DRUM__RESONANCE = PART_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Roll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DRUM__ROLL = PART_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Pitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DRUM__PITCH = PART_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DRUM__REVERSE = PART_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Sample Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DRUM__SAMPLE_LABEL = PART_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Sample Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DRUM__SAMPLE_POINTER = PART_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Start Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DRUM__START_POINT = PART_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Reserved Bits After Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DRUM__RESERVED_BITS_AFTER_REVERSE = PART_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Sequence Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DRUM__SEQUENCE_DATA = PART_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Reserved Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DRUM__RESERVED_BYTE = PART_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Slice Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DRUM__SLICE_NUMBER = PART_FEATURE_COUNT + 24;

	/**
	 * The number of structural features of the '<em>Part Drum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DRUM_FEATURE_COUNT = PART_FEATURE_COUNT + 25;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.PartKeyboardImpl <em>Part Keyboard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.PartKeyboardImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPartKeyboard()
	 * @generated
	 */
	int PART_KEYBOARD = 11;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_KEYBOARD__LABEL = PART__LABEL;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_KEYBOARD__LEVEL = PART__LEVEL;

	/**
	 * The feature id for the '<em><b>Motion Sequence Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_KEYBOARD__MOTION_SEQUENCE_STATUS = PART__MOTION_SEQUENCE_STATUS;

	/**
	 * The feature id for the '<em><b>Amp Eg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_KEYBOARD__AMP_EG = PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bpm Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_KEYBOARD__BPM_SYNC = PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cutoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_KEYBOARD__CUTOFF = PART_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Eg Intensity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_KEYBOARD__EG_INTENSITY = PART_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Eg Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_KEYBOARD__EG_TIME = PART_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Filter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_KEYBOARD__FILTER_TYPE = PART_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fx Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_KEYBOARD__FX_SELECT = PART_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Fx Send</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_KEYBOARD__FX_SEND = PART_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Mod Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_KEYBOARD__MOD_DEPTH = PART_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Mod Dest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_KEYBOARD__MOD_DEST = PART_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Mod Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_KEYBOARD__MOD_SPEED = PART_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Mod Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_KEYBOARD__MOD_TYPE = PART_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Pan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_KEYBOARD__PAN = PART_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Reserved Bit After Mod Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_KEYBOARD__RESERVED_BIT_AFTER_MOD_DEPTH = PART_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Resonance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_KEYBOARD__RESONANCE = PART_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Roll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_KEYBOARD__ROLL = PART_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_KEYBOARD__REVERSE = PART_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Sample Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_KEYBOARD__SAMPLE_LABEL = PART_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Sample Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_KEYBOARD__SAMPLE_POINTER = PART_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Start Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_KEYBOARD__START_POINT = PART_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Reserved Bits After Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_KEYBOARD__RESERVED_BITS_AFTER_REVERSE = PART_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Sequence Data Gate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_KEYBOARD__SEQUENCE_DATA_GATE = PART_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Reserved Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_KEYBOARD__RESERVED_BYTE = PART_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Slice Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_KEYBOARD__SLICE_NUMBER = PART_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Glide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_KEYBOARD__GLIDE = PART_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Sequence Data Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_KEYBOARD__SEQUENCE_DATA_NOTE = PART_FEATURE_COUNT + 25;

	/**
	 * The number of structural features of the '<em>Part Keyboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_KEYBOARD_FEATURE_COUNT = PART_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_NOTE_NUMBER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Note Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_NOTE_NUMBER__NOTE_NUMBER = 1;

	/**
	 * The number of structural features of the '<em>Part Note Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_NOTE_NUMBER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.PartStretchSliceImpl <em>Part Stretch Slice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.PartStretchSliceImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPartStretchSlice()
	 * @generated
	 */
	int PART_STRETCH_SLICE = 13;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_STRETCH_SLICE__LABEL = PART__LABEL;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_STRETCH_SLICE__LEVEL = PART__LEVEL;

	/**
	 * The feature id for the '<em><b>Motion Sequence Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_STRETCH_SLICE__MOTION_SEQUENCE_STATUS = PART__MOTION_SEQUENCE_STATUS;

	/**
	 * The feature id for the '<em><b>Amp Eg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_STRETCH_SLICE__AMP_EG = PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bpm Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_STRETCH_SLICE__BPM_SYNC = PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cutoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_STRETCH_SLICE__CUTOFF = PART_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Eg Intensity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_STRETCH_SLICE__EG_INTENSITY = PART_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Eg Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_STRETCH_SLICE__EG_TIME = PART_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Filter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_STRETCH_SLICE__FILTER_TYPE = PART_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fx Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_STRETCH_SLICE__FX_SELECT = PART_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Fx Send</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_STRETCH_SLICE__FX_SEND = PART_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Mod Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_STRETCH_SLICE__MOD_DEPTH = PART_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Mod Dest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_STRETCH_SLICE__MOD_DEST = PART_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Mod Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_STRETCH_SLICE__MOD_SPEED = PART_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Mod Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_STRETCH_SLICE__MOD_TYPE = PART_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Pan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_STRETCH_SLICE__PAN = PART_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Reserved Bit After Mod Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_STRETCH_SLICE__RESERVED_BIT_AFTER_MOD_DEPTH = PART_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Resonance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_STRETCH_SLICE__RESONANCE = PART_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Roll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_STRETCH_SLICE__ROLL = PART_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Pitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_STRETCH_SLICE__PITCH = PART_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_STRETCH_SLICE__REVERSE = PART_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Sample Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_STRETCH_SLICE__SAMPLE_LABEL = PART_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Sample Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_STRETCH_SLICE__SAMPLE_POINTER = PART_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Start Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_STRETCH_SLICE__START_POINT = PART_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Reserved Bits After Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_STRETCH_SLICE__RESERVED_BITS_AFTER_REVERSE = PART_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Sequence Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_STRETCH_SLICE__SEQUENCE_DATA = PART_FEATURE_COUNT + 22;

	/**
	 * The number of structural features of the '<em>Part Stretch Slice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_STRETCH_SLICE_FEATURE_COUNT = PART_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Amp Eg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_WITH_COMMON__AMP_EG = 0;

	/**
	 * The feature id for the '<em><b>Bpm Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_WITH_COMMON__BPM_SYNC = 1;

	/**
	 * The feature id for the '<em><b>Cutoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_WITH_COMMON__CUTOFF = 2;

	/**
	 * The feature id for the '<em><b>Eg Intensity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_WITH_COMMON__EG_INTENSITY = 3;

	/**
	 * The feature id for the '<em><b>Eg Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_WITH_COMMON__EG_TIME = 4;

	/**
	 * The feature id for the '<em><b>Filter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_WITH_COMMON__FILTER_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Fx Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_WITH_COMMON__FX_SELECT = 6;

	/**
	 * The feature id for the '<em><b>Fx Send</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_WITH_COMMON__FX_SEND = 7;

	/**
	 * The feature id for the '<em><b>Mod Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_WITH_COMMON__MOD_DEPTH = 8;

	/**
	 * The feature id for the '<em><b>Mod Dest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_WITH_COMMON__MOD_DEST = 9;

	/**
	 * The feature id for the '<em><b>Mod Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_WITH_COMMON__MOD_SPEED = 10;

	/**
	 * The feature id for the '<em><b>Mod Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_WITH_COMMON__MOD_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Pan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_WITH_COMMON__PAN = 12;

	/**
	 * The feature id for the '<em><b>Reserved Bit After Mod Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_WITH_COMMON__RESERVED_BIT_AFTER_MOD_DEPTH = 13;

	/**
	 * The feature id for the '<em><b>Resonance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_WITH_COMMON__RESONANCE = 14;

	/**
	 * The feature id for the '<em><b>Roll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_WITH_COMMON__ROLL = 15;

	/**
	 * The number of structural features of the '<em>Part With Common</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_WITH_COMMON_FEATURE_COUNT = 16;

	/**
	 * The feature id for the '<em><b>Pitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_WITH_PITCH__PITCH = 0;

	/**
	 * The number of structural features of the '<em>Part With Pitch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_WITH_PITCH_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_WITH_SAMPLE__REVERSE = 0;

	/**
	 * The feature id for the '<em><b>Sample Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_WITH_SAMPLE__SAMPLE_LABEL = 1;

	/**
	 * The feature id for the '<em><b>Sample Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_WITH_SAMPLE__SAMPLE_POINTER = 2;

	/**
	 * The feature id for the '<em><b>Start Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_WITH_SAMPLE__START_POINT = 3;

	/**
	 * The feature id for the '<em><b>Reserved Bits After Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_WITH_SAMPLE__RESERVED_BITS_AFTER_REVERSE = 4;

	/**
	 * The number of structural features of the '<em>Part With Sample</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_WITH_SAMPLE_FEATURE_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Sequence Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_WITH_SEQUENCE_DATA__SEQUENCE_DATA = 0;

	/**
	 * The number of structural features of the '<em>Part With Sequence Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_WITH_SEQUENCE_DATA_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Sequence Data Gate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_WITH_SEQUENCE_DATA_GATE__SEQUENCE_DATA_GATE = 0;

	/**
	 * The number of structural features of the '<em>Part With Sequence Data Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_WITH_SEQUENCE_DATA_GATE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Reserved Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_WITH_SLICE__RESERVED_BYTE = 0;

	/**
	 * The feature id for the '<em><b>Slice Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_WITH_SLICE__SLICE_NUMBER = 1;

	/**
	 * The number of structural features of the '<em>Part With Slice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_WITH_SLICE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.PatternImpl <em>Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.PatternImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPattern()
	 * @generated
	 */
	int PATTERN = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tempo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__TEMPO = 1;

	/**
	 * The feature id for the '<em><b>Swing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__SWING = 2;

	/**
	 * The feature id for the '<em><b>Pattern Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__PATTERN_LENGTH = 3;

	/**
	 * The feature id for the '<em><b>Reserved Bit After Pattern Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__RESERVED_BIT_AFTER_PATTERN_LENGTH = 4;

	/**
	 * The feature id for the '<em><b>Beat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__BEAT = 5;

	/**
	 * The feature id for the '<em><b>Roll Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__ROLL_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Fx Chain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__FX_CHAIN = 7;

	/**
	 * The feature id for the '<em><b>Last Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__LAST_STEP = 8;

	/**
	 * The feature id for the '<em><b>Arpeggiator Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__ARPEGGIATOR_SCALE = 9;

	/**
	 * The feature id for the '<em><b>Reserved Bits After Arpeggiator Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__RESERVED_BITS_AFTER_ARPEGGIATOR_SCALE = 10;

	/**
	 * The feature id for the '<em><b>Arpeggiator Center Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__ARPEGGIATOR_CENTER_NOTE = 11;

	/**
	 * The feature id for the '<em><b>Mute Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__MUTE_STATUS = 12;

	/**
	 * The feature id for the '<em><b>Swing Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__SWING_STATUS = 13;

	/**
	 * The feature id for the '<em><b>Output Bus Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__OUTPUT_BUS_STATUS = 14;

	/**
	 * The feature id for the '<em><b>Accent Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__ACCENT_STATUS = 15;

	/**
	 * The feature id for the '<em><b>Drum Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__DRUM_PARTS = 16;

	/**
	 * The feature id for the '<em><b>Keyboard Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__KEYBOARD_PARTS = 17;

	/**
	 * The feature id for the '<em><b>Stretch Slice Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__STRETCH_SLICE_PARTS = 18;

	/**
	 * The feature id for the '<em><b>Audio In Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__AUDIO_IN_PART = 19;

	/**
	 * The feature id for the '<em><b>Accent Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__ACCENT_PART = 20;

	/**
	 * The feature id for the '<em><b>Fx Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__FX_PARAMETERS = 21;

	/**
	 * The feature id for the '<em><b>Motion Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__MOTION_PARAMETERS = 22;

	/**
	 * The feature id for the '<em><b>Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__EMPTY = 23;

	/**
	 * The feature id for the '<em><b>Pattern Number Original</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__PATTERN_NUMBER_ORIGINAL = 24;

	/**
	 * The feature id for the '<em><b>Pattern Number Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__PATTERN_NUMBER_CURRENT = 25;

	/**
	 * The number of structural features of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FEATURE_COUNT = 26;

	/**
	 * The feature id for the '<em><b>Pattern Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SET_PARAMETER__PATTERN_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Position Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SET_PARAMETER__POSITION_CURRENT = 1;

	/**
	 * The number of structural features of the '<em>Pattern Set Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SET_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.SampleImpl <em>Sample</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.SampleImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSample()
	 * @generated
	 */
	int SAMPLE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Offset Channel1 Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__OFFSET_CHANNEL1_START = 1;

	/**
	 * The feature id for the '<em><b>Offset Channel1 End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__OFFSET_CHANNEL1_END = 2;

	/**
	 * The feature id for the '<em><b>Offset Channel2 Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__OFFSET_CHANNEL2_START = 3;

	/**
	 * The feature id for the '<em><b>Offset Channel2 End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__OFFSET_CHANNEL2_END = 4;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__START = 5;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__END = 6;

	/**
	 * The feature id for the '<em><b>Loop Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__LOOP_START = 7;

	/**
	 * The feature id for the '<em><b>Sample Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__SAMPLE_RATE = 8;

	/**
	 * The feature id for the '<em><b>Sample Tune</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__SAMPLE_TUNE = 9;

	/**
	 * The feature id for the '<em><b>Number Of Sample Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__NUMBER_OF_SAMPLE_FRAMES = 10;

	/**
	 * The feature id for the '<em><b>Play Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__PLAY_LEVEL = 11;

	/**
	 * The feature id for the '<em><b>Stretch Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__STRETCH_STEP = 12;

	/**
	 * The feature id for the '<em><b>Unknown Byte Mono1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__UNKNOWN_BYTE_MONO1 = 13;

	/**
	 * The feature id for the '<em><b>Unknown Byte Mono2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__UNKNOWN_BYTE_MONO2 = 14;

	/**
	 * The feature id for the '<em><b>Unknown Byte Mono3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__UNKNOWN_BYTE_MONO3 = 15;

	/**
	 * The feature id for the '<em><b>Unknown Byte Mono4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__UNKNOWN_BYTE_MONO4 = 16;

	/**
	 * The feature id for the '<em><b>Unknown Byte Stereo1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__UNKNOWN_BYTE_STEREO1 = 17;

	/**
	 * The feature id for the '<em><b>Unknown Byte Stereo2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__UNKNOWN_BYTE_STEREO2 = 18;

	/**
	 * The feature id for the '<em><b>Unknown Byte Stereo3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__UNKNOWN_BYTE_STEREO3 = 19;

	/**
	 * The feature id for the '<em><b>Unknown Byte Stereo4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__UNKNOWN_BYTE_STEREO4 = 20;

	/**
	 * The feature id for the '<em><b>Audio Data Channel1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__AUDIO_DATA_CHANNEL1 = 21;

	/**
	 * The feature id for the '<em><b>Audio Data Channel2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__AUDIO_DATA_CHANNEL2 = 22;

	/**
	 * The feature id for the '<em><b>Audio Data Channel Both</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__AUDIO_DATA_CHANNEL_BOTH = 23;

	/**
	 * The feature id for the '<em><b>Audio Data Loop Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__AUDIO_DATA_LOOP_START = 24;

	/**
	 * The feature id for the '<em><b>Slice Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__SLICE_ARRAY = 25;

	/**
	 * The feature id for the '<em><b>Loop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__LOOP = 26;

	/**
	 * The feature id for the '<em><b>Slice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__SLICE = 27;

	/**
	 * The feature id for the '<em><b>Stereo Original</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__STEREO_ORIGINAL = 28;

	/**
	 * The feature id for the '<em><b>Stereo Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__STEREO_CURRENT = 29;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__LABEL = 30;

	/**
	 * The feature id for the '<em><b>Mem Used In Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__MEM_USED_IN_BYTES = 31;

	/**
	 * The feature id for the '<em><b>Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__EMPTY = 32;

	/**
	 * The feature id for the '<em><b>Part Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__PART_COUNT = 33;

	/**
	 * The feature id for the '<em><b>Pattern Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__PATTERN_COUNT = 34;

	/**
	 * The feature id for the '<em><b>Sample In Pattern Info List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__SAMPLE_IN_PATTERN_INFO_LIST = 35;

	/**
	 * The feature id for the '<em><b>Sample Number Original</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__SAMPLE_NUMBER_ORIGINAL = 36;

	/**
	 * The feature id for the '<em><b>Sample Number Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__SAMPLE_NUMBER_CURRENT = 37;

	/**
	 * The number of structural features of the '<em>Sample</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_FEATURE_COUNT = 38;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.SampleInPatternInfoImpl <em>Sample In Pattern Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.SampleInPatternInfoImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSampleInPatternInfo()
	 * @generated
	 */
	int SAMPLE_IN_PATTERN_INFO = 23;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_IN_PATTERN_INFO__INDEX = 0;

	/**
	 * The feature id for the '<em><b>Pattern Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_IN_PATTERN_INFO__PATTERN_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Part Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_IN_PATTERN_INFO__PART_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Part List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_IN_PATTERN_INFO__PART_LIST = 3;

	/**
	 * The number of structural features of the '<em>Sample In Pattern Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_IN_PATTERN_INFO_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.SampleTuneImpl <em>Sample Tune</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.SampleTuneImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSampleTune()
	 * @generated
	 */
	int SAMPLE_TUNE = 24;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_TUNE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Sample Tune</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_TUNE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Sequence Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_DATA__SEQUENCE_DATA = 0;

	/**
	 * The number of structural features of the '<em>Sequence Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_DATA_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Sequence Data Gate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_DATA_GATE__SEQUENCE_DATA_GATE = 0;

	/**
	 * The number of structural features of the '<em>Sequence Data Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_DATA_GATE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Sequence Data Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_DATA_NOTE__SEQUENCE_DATA_NOTE = 0;

	/**
	 * The number of structural features of the '<em>Sequence Data Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_DATA_NOTE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.SongImpl <em>Song</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.SongImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSong()
	 * @generated
	 */
	int SONG = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tempo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG__TEMPO = 1;

	/**
	 * The feature id for the '<em><b>Tempo Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG__TEMPO_LOCK = 2;

	/**
	 * The feature id for the '<em><b>Song Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG__SONG_LENGTH = 3;

	/**
	 * The feature id for the '<em><b>Mute Hold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG__MUTE_HOLD = 4;

	/**
	 * The feature id for the '<em><b>Next Song Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG__NEXT_SONG_NUMBER = 5;

	/**
	 * The feature id for the '<em><b>Number Of Song Events Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG__NUMBER_OF_SONG_EVENTS_CURRENT = 6;

	/**
	 * The feature id for the '<em><b>Number Of Song Events Original</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG__NUMBER_OF_SONG_EVENTS_ORIGINAL = 7;

	/**
	 * The feature id for the '<em><b>Song Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG__SONG_PATTERNS = 8;

	/**
	 * The feature id for the '<em><b>Song Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG__SONG_EVENTS = 9;

	/**
	 * The feature id for the '<em><b>Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG__EMPTY = 10;

	/**
	 * The feature id for the '<em><b>Song Number Original</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG__SONG_NUMBER_ORIGINAL = 11;

	/**
	 * The feature id for the '<em><b>Song Number Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG__SONG_NUMBER_CURRENT = 12;

	/**
	 * The number of structural features of the '<em>Song</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_FEATURE_COUNT = 13;


	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.SongPatternImpl <em>Song Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.SongPatternImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSongPattern()
	 * @generated
	 */
	int SONG_PATTERN = 36;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.TempoImpl <em>Tempo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.TempoImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getTempo()
	 * @generated
	 */
	int TEMPO = 37;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.SongEventImpl <em>Song Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.SongEventImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSongEvent()
	 * @generated
	 */
	int SONG_EVENT = 29;

	/**
	 * The feature id for the '<em><b>Current Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT__CURRENT_POSITION = 0;

	/**
	 * The feature id for the '<em><b>Event Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT__EVENT_INFO = 1;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT__EVENT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT__MEASURE = 3;

	/**
	 * The feature id for the '<em><b>Operation Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT__OPERATION_NUMBER = 4;

	/**
	 * The feature id for the '<em><b>Position Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT__POSITION_NUMBER = 5;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT__STEP = 6;

	/**
	 * The number of structural features of the '<em>Song Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.SongEventWithPartImpl <em>Song Event With Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.SongEventWithPartImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSongEventWithPart()
	 * @generated
	 */
	int SONG_EVENT_WITH_PART = 35;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.SongEventControlImpl <em>Song Event Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.SongEventControlImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSongEventControl()
	 * @generated
	 */
	int SONG_EVENT_CONTROL = 30;

	/**
	 * The feature id for the '<em><b>Current Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_CONTROL__CURRENT_POSITION = SONG_EVENT__CURRENT_POSITION;

	/**
	 * The feature id for the '<em><b>Event Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_CONTROL__EVENT_INFO = SONG_EVENT__EVENT_INFO;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_CONTROL__EVENT_TYPE = SONG_EVENT__EVENT_TYPE;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_CONTROL__MEASURE = SONG_EVENT__MEASURE;

	/**
	 * The feature id for the '<em><b>Operation Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_CONTROL__OPERATION_NUMBER = SONG_EVENT__OPERATION_NUMBER;

	/**
	 * The feature id for the '<em><b>Position Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_CONTROL__POSITION_NUMBER = SONG_EVENT__POSITION_NUMBER;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_CONTROL__STEP = SONG_EVENT__STEP;

	/**
	 * The feature id for the '<em><b>Operation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_CONTROL__OPERATION_TYPE = SONG_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reserved Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_CONTROL__RESERVED_BYTE = SONG_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reserved Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_CONTROL__RESERVED_SHORT = SONG_EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_CONTROL__VALUE = SONG_EVENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Song Event Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_CONTROL_FEATURE_COUNT = SONG_EVENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.SongEventDrumNoteImpl <em>Song Event Drum Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.SongEventDrumNoteImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSongEventDrumNote()
	 * @generated
	 */
	int SONG_EVENT_DRUM_NOTE = 31;

	/**
	 * The feature id for the '<em><b>Current Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_DRUM_NOTE__CURRENT_POSITION = SONG_EVENT__CURRENT_POSITION;

	/**
	 * The feature id for the '<em><b>Event Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_DRUM_NOTE__EVENT_INFO = SONG_EVENT__EVENT_INFO;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_DRUM_NOTE__EVENT_TYPE = SONG_EVENT__EVENT_TYPE;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_DRUM_NOTE__MEASURE = SONG_EVENT__MEASURE;

	/**
	 * The feature id for the '<em><b>Operation Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_DRUM_NOTE__OPERATION_NUMBER = SONG_EVENT__OPERATION_NUMBER;

	/**
	 * The feature id for the '<em><b>Position Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_DRUM_NOTE__POSITION_NUMBER = SONG_EVENT__POSITION_NUMBER;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_DRUM_NOTE__STEP = SONG_EVENT__STEP;

	/**
	 * The feature id for the '<em><b>Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_DRUM_NOTE__PART = SONG_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reserved Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_DRUM_NOTE__RESERVED_BYTE = SONG_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reserved Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_DRUM_NOTE__RESERVED_SHORT = SONG_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Song Event Drum Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_DRUM_NOTE_FEATURE_COUNT = SONG_EVENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.SongEventKeyboardNoteImpl <em>Song Event Keyboard Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.SongEventKeyboardNoteImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSongEventKeyboardNote()
	 * @generated
	 */
	int SONG_EVENT_KEYBOARD_NOTE = 32;

	/**
	 * The feature id for the '<em><b>Current Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_KEYBOARD_NOTE__CURRENT_POSITION = SONG_EVENT__CURRENT_POSITION;

	/**
	 * The feature id for the '<em><b>Event Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_KEYBOARD_NOTE__EVENT_INFO = SONG_EVENT__EVENT_INFO;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_KEYBOARD_NOTE__EVENT_TYPE = SONG_EVENT__EVENT_TYPE;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_KEYBOARD_NOTE__MEASURE = SONG_EVENT__MEASURE;

	/**
	 * The feature id for the '<em><b>Operation Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_KEYBOARD_NOTE__OPERATION_NUMBER = SONG_EVENT__OPERATION_NUMBER;

	/**
	 * The feature id for the '<em><b>Position Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_KEYBOARD_NOTE__POSITION_NUMBER = SONG_EVENT__POSITION_NUMBER;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_KEYBOARD_NOTE__STEP = SONG_EVENT__STEP;

	/**
	 * The feature id for the '<em><b>Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_KEYBOARD_NOTE__PART = SONG_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_KEYBOARD_NOTE__LENGTH = SONG_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Note Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_KEYBOARD_NOTE__NOTE_NUMBER = SONG_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Song Event Keyboard Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_KEYBOARD_NOTE_FEATURE_COUNT = SONG_EVENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.SongEventTempoImpl <em>Song Event Tempo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.SongEventTempoImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSongEventTempo()
	 * @generated
	 */
	int SONG_EVENT_TEMPO = 34;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.impl.SongEventMuteStatusImpl <em>Song Event Mute Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.impl.SongEventMuteStatusImpl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSongEventMuteStatus()
	 * @generated
	 */
	int SONG_EVENT_MUTE_STATUS = 33;

	/**
	 * The feature id for the '<em><b>Current Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_MUTE_STATUS__CURRENT_POSITION = SONG_EVENT__CURRENT_POSITION;

	/**
	 * The feature id for the '<em><b>Event Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_MUTE_STATUS__EVENT_INFO = SONG_EVENT__EVENT_INFO;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_MUTE_STATUS__EVENT_TYPE = SONG_EVENT__EVENT_TYPE;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_MUTE_STATUS__MEASURE = SONG_EVENT__MEASURE;

	/**
	 * The feature id for the '<em><b>Operation Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_MUTE_STATUS__OPERATION_NUMBER = SONG_EVENT__OPERATION_NUMBER;

	/**
	 * The feature id for the '<em><b>Position Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_MUTE_STATUS__POSITION_NUMBER = SONG_EVENT__POSITION_NUMBER;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_MUTE_STATUS__STEP = SONG_EVENT__STEP;

	/**
	 * The feature id for the '<em><b>Reserved Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_MUTE_STATUS__RESERVED_SHORT = SONG_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mute Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_MUTE_STATUS__MUTE_STATUS = SONG_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Song Event Mute Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_MUTE_STATUS_FEATURE_COUNT = SONG_EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Current Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_TEMPO__CURRENT_POSITION = SONG_EVENT__CURRENT_POSITION;

	/**
	 * The feature id for the '<em><b>Event Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_TEMPO__EVENT_INFO = SONG_EVENT__EVENT_INFO;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_TEMPO__EVENT_TYPE = SONG_EVENT__EVENT_TYPE;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_TEMPO__MEASURE = SONG_EVENT__MEASURE;

	/**
	 * The feature id for the '<em><b>Operation Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_TEMPO__OPERATION_NUMBER = SONG_EVENT__OPERATION_NUMBER;

	/**
	 * The feature id for the '<em><b>Position Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_TEMPO__POSITION_NUMBER = SONG_EVENT__POSITION_NUMBER;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_TEMPO__STEP = SONG_EVENT__STEP;

	/**
	 * The feature id for the '<em><b>Reserved Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_TEMPO__RESERVED_SHORT = SONG_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tempo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_TEMPO__TEMPO = SONG_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Song Event Tempo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_TEMPO_FEATURE_COUNT = SONG_EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_WITH_PART__PART = 0;

	/**
	 * The number of structural features of the '<em>Song Event With Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_EVENT_WITH_PART_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_PATTERN__EMPTY = 0;

	/**
	 * The feature id for the '<em><b>Note Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_PATTERN__NOTE_OFFSET = 1;

	/**
	 * The feature id for the '<em><b>Pattern Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_PATTERN__PATTERN_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Position Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_PATTERN__POSITION_CURRENT = 3;

	/**
	 * The number of structural features of the '<em>Song Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_PATTERN_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPO__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Tempo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPO_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.ArpeggiatorControl <em>Arpeggiator Control</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.ArpeggiatorControl
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getArpeggiatorControl()
	 * @generated
	 */
	int ARPEGGIATOR_CONTROL = 39;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.AudioInMode <em>Audio In Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.AudioInMode
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getAudioInMode()
	 * @generated
	 */
	int AUDIO_IN_MODE = 42;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.MidiClock <em>Midi Clock</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.MidiClock
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getMidiClock()
	 * @generated
	 */
	int MIDI_CLOCK = 54;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.MidiControlChangeAssignmentName <em>Midi Control Change Assignment Name</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.MidiControlChangeAssignmentName
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getMidiControlChangeAssignmentName()
	 * @generated
	 */
	int MIDI_CONTROL_CHANGE_ASSIGNMENT_NAME = 55;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.EnabledFlag <em>Enabled Flag</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.EnabledFlag
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getEnabledFlag()
	 * @generated
	 */
	int ENABLED_FLAG = 45;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.PitchBendRange <em>Pitch Bend Range</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.PitchBendRange
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPitchBendRange()
	 * @generated
	 */
	int PITCH_BEND_RANGE = 66;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.MidiChannel <em>Midi Channel</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.MidiChannel
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getMidiChannel()
	 * @generated
	 */
	int MIDI_CHANNEL = 52;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.MidiChannelTypeName <em>Midi Channel Type Name</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.MidiChannelTypeName
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getMidiChannelTypeName()
	 * @generated
	 */
	int MIDI_CHANNEL_TYPE_NAME = 53;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.PlayLevel <em>Play Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.PlayLevel
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPlayLevel()
	 * @generated
	 */
	int PLAY_LEVEL = 67;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.PatternNumber <em>Pattern Number</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.PatternNumber
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPatternNumber()
	 * @generated
	 */
	int PATTERN_NUMBER = 65;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.SampleNumber <em>Sample Number</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.SampleNumber
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSampleNumber()
	 * @generated
	 */
	int SAMPLE_NUMBER = 71;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.SongEventPart <em>Song Event Part</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.SongEventPart
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSongEventPart()
	 * @generated
	 */
	int SONG_EVENT_PART = 72;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.SongNumber <em>Song Number</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.SongNumber
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSongNumber()
	 * @generated
	 */
	int SONG_NUMBER = 74;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.SongLength <em>Song Length</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.SongLength
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSongLength()
	 * @generated
	 */
	int SONG_LENGTH = 73;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.TempoLock <em>Tempo Lock</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.TempoLock
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getTempoLock()
	 * @generated
	 */
	int TEMPO_LOCK = 77;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.MuteHold <em>Mute Hold</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.MuteHold
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getMuteHold()
	 * @generated
	 */
	int MUTE_HOLD = 59;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.NextSongNumber <em>Next Song Number</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.NextSongNumber
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getNextSongNumber()
	 * @generated
	 */
	int NEXT_SONG_NUMBER = 60;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.StretchStep <em>Stretch Step</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.StretchStep
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getStretchStep()
	 * @generated
	 */
	int STRETCH_STEP = 75;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.Swing <em>Swing</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.Swing
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSwing()
	 * @generated
	 */
	int SWING = 76;


	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.PatternLength <em>Pattern Length</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.PatternLength
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPatternLength()
	 * @generated
	 */
	int PATTERN_LENGTH = 64;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.Beat <em>Beat</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.Beat
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getBeat()
	 * @generated
	 */
	int BEAT = 43;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.RollType <em>Roll Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.RollType
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getRollType()
	 * @generated
	 */
	int ROLL_TYPE = 70;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.FxChain <em>Fx Chain</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.FxChain
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getFxChain()
	 * @generated
	 */
	int FX_CHAIN = 47;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.LastStep <em>Last Step</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.LastStep
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getLastStep()
	 * @generated
	 */
	int LAST_STEP = 51;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.ArpeggiatorScale <em>Arpeggiator Scale</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.ArpeggiatorScale
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getArpeggiatorScale()
	 * @generated
	 */
	int ARPEGGIATOR_SCALE = 40;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.AudioChannelType <em>Audio Channel Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.AudioChannelType
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getAudioChannelType()
	 * @generated
	 */
	int AUDIO_CHANNEL_TYPE = 41;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.NoteNumber <em>Note Number</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.NoteNumber
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getNoteNumber()
	 * @generated
	 */
	int NOTE_NUMBER = 61;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.OperationType <em>Operation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.OperationType
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getOperationType()
	 * @generated
	 */
	int OPERATION_TYPE = 62;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.PartNoteNumberName <em>Part Note Number Name</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.PartNoteNumberName
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPartNoteNumberName()
	 * @generated
	 */
	int PART_NOTE_NUMBER_NAME = 63;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.FilterType <em>Filter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.FilterType
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getFilterType()
	 * @generated
	 */
	int FILTER_TYPE = 46;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.FxSelect <em>Fx Select</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.FxSelect
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getFxSelect()
	 * @generated
	 */
	int FX_SELECT = 48;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.FxSend <em>Fx Send</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.FxSend
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getFxSend()
	 * @generated
	 */
	int FX_SEND = 49;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.FxType <em>Fx Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.FxType
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getFxType()
	 * @generated
	 */
	int FX_TYPE = 50;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.Roll <em>Roll</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.Roll
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getRoll()
	 * @generated
	 */
	int ROLL = 69;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.AmpEg <em>Amp Eg</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.AmpEg
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getAmpEg()
	 * @generated
	 */
	int AMP_EG = 38;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.Reverse <em>Reverse</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.Reverse
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getReverse()
	 * @generated
	 */
	int REVERSE = 68;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.ModDest <em>Mod Dest</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.ModDest
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getModDest()
	 * @generated
	 */
	int MOD_DEST = 56;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.ModType <em>Mod Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.ModType
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getModType()
	 * @generated
	 */
	int MOD_TYPE = 57;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.BpmSync <em>Bpm Sync</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.BpmSync
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getBpmSync()
	 * @generated
	 */
	int BPM_SYNC = 44;

	/**
	 * The meta object id for the '{@link com.skratchdot.electribe.model.esx.MotionSequenceStatus <em>Motion Sequence Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.MotionSequenceStatus
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getMotionSequenceStatus()
	 * @generated
	 */
	int MOTION_SEQUENCE_STATUS = 58;

	/**
	 * The meta object id for the '<em>Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 84;


	/**
	 * The meta object id for the '<em>RIFF Wave</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.riff.wav.RIFFWave
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getRIFFWave()
	 * @generated
	 */
	int RIFF_WAVE = 85;

	/**
	 * The meta object id for the '<em>Array List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.ArrayList
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getArrayList()
	 * @generated
	 */
	int ARRAY_LIST = 78;


	/**
	 * The meta object id for the '<em>File</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.File
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 79;


	/**
	 * The meta object id for the '<em>Input Stream</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.InputStream
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getInputStream()
	 * @generated
	 */
	int INPUT_STREAM = 80;

	/**
	 * The meta object id for the '<em>Index Out Of Bounds Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.IndexOutOfBoundsException
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getIndexOutOfBoundsException()
	 * @generated
	 */
	int INDEX_OUT_OF_BOUNDS_EXCEPTION = 81;

	/**
	 * The meta object id for the '<em>IO Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.IOException
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getIOException()
	 * @generated
	 */
	int IO_EXCEPTION = 82;


	/**
	 * The meta object id for the '<em>IProgress Monitor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.IProgressMonitor
	 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getIProgressMonitor()
	 * @generated
	 */
	int IPROGRESS_MONITOR = 83;


	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.EsxFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see com.skratchdot.electribe.model.esx.EsxFile
	 * @generated
	 */
	EClass getEsxFile();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.EsxFile#getOriginalNonAudioData <em>Original Non Audio Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Original Non Audio Data</em>'.
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getOriginalNonAudioData()
	 * @see #getEsxFile()
	 * @generated
	 */
	EAttribute getEsxFile_OriginalNonAudioData();

	/**
	 * Returns the meta object for the containment reference '{@link com.skratchdot.electribe.model.esx.EsxFile#getGlobalParameters <em>Global Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Parameters</em>'.
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getGlobalParameters()
	 * @see #getEsxFile()
	 * @generated
	 */
	EReference getEsxFile_GlobalParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link com.skratchdot.electribe.model.esx.EsxFile#getPatterns <em>Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patterns</em>'.
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getPatterns()
	 * @see #getEsxFile()
	 * @generated
	 */
	EReference getEsxFile_Patterns();

	/**
	 * Returns the meta object for the containment reference list '{@link com.skratchdot.electribe.model.esx.EsxFile#getSongs <em>Songs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Songs</em>'.
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getSongs()
	 * @see #getEsxFile()
	 * @generated
	 */
	EReference getEsxFile_Songs();

	/**
	 * Returns the meta object for the containment reference list '{@link com.skratchdot.electribe.model.esx.EsxFile#getSamples <em>Samples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samples</em>'.
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getSamples()
	 * @see #getEsxFile()
	 * @generated
	 */
	EReference getEsxFile_Samples();

	/**
	 * Returns the meta object for the containment reference '{@link com.skratchdot.electribe.model.esx.EsxFile#getEmptyPattern <em>Empty Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Empty Pattern</em>'.
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getEmptyPattern()
	 * @see #getEsxFile()
	 * @generated
	 */
	EReference getEsxFile_EmptyPattern();

	/**
	 * Returns the meta object for the containment reference '{@link com.skratchdot.electribe.model.esx.EsxFile#getEmptySong <em>Empty Song</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Empty Song</em>'.
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getEmptySong()
	 * @see #getEsxFile()
	 * @generated
	 */
	EReference getEsxFile_EmptySong();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.EsxFile#getMaxSampleOffset <em>Max Sample Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Sample Offset</em>'.
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getMaxSampleOffset()
	 * @see #getEsxFile()
	 * @generated
	 */
	EAttribute getEsxFile_MaxSampleOffset();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.EsxFile#getMemUsedInBytes <em>Mem Used In Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mem Used In Bytes</em>'.
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getMemUsedInBytes()
	 * @see #getEsxFile()
	 * @generated
	 */
	EAttribute getEsxFile_MemUsedInBytes();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.EsxFile#getMemUsedInSeconds <em>Mem Used In Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mem Used In Seconds</em>'.
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getMemUsedInSeconds()
	 * @see #getEsxFile()
	 * @generated
	 */
	EAttribute getEsxFile_MemUsedInSeconds();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.EsxFile#getMemFreeInBytes <em>Mem Free In Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mem Free In Bytes</em>'.
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getMemFreeInBytes()
	 * @see #getEsxFile()
	 * @generated
	 */
	EAttribute getEsxFile_MemFreeInBytes();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.EsxFile#getMemFreeInSeconds <em>Mem Free In Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mem Free In Seconds</em>'.
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getMemFreeInSeconds()
	 * @see #getEsxFile()
	 * @generated
	 */
	EAttribute getEsxFile_MemFreeInSeconds();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.EsxFile#getNumPatternsEmpty <em>Num Patterns Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Patterns Empty</em>'.
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getNumPatternsEmpty()
	 * @see #getEsxFile()
	 * @generated
	 */
	EAttribute getEsxFile_NumPatternsEmpty();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.EsxFile#getNumPatternsNotEmpty <em>Num Patterns Not Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Patterns Not Empty</em>'.
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getNumPatternsNotEmpty()
	 * @see #getEsxFile()
	 * @generated
	 */
	EAttribute getEsxFile_NumPatternsNotEmpty();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesEmpty <em>Num Samples Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Samples Empty</em>'.
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesEmpty()
	 * @see #getEsxFile()
	 * @generated
	 */
	EAttribute getEsxFile_NumSamplesEmpty();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesNotEmpty <em>Num Samples Not Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Samples Not Empty</em>'.
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesNotEmpty()
	 * @see #getEsxFile()
	 * @generated
	 */
	EAttribute getEsxFile_NumSamplesNotEmpty();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesMonoEmpty <em>Num Samples Mono Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Samples Mono Empty</em>'.
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesMonoEmpty()
	 * @see #getEsxFile()
	 * @generated
	 */
	EAttribute getEsxFile_NumSamplesMonoEmpty();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesMonoNotEmpty <em>Num Samples Mono Not Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Samples Mono Not Empty</em>'.
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesMonoNotEmpty()
	 * @see #getEsxFile()
	 * @generated
	 */
	EAttribute getEsxFile_NumSamplesMonoNotEmpty();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesStereoEmpty <em>Num Samples Stereo Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Samples Stereo Empty</em>'.
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesStereoEmpty()
	 * @see #getEsxFile()
	 * @generated
	 */
	EAttribute getEsxFile_NumSamplesStereoEmpty();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesStereoNotEmpty <em>Num Samples Stereo Not Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Samples Stereo Not Empty</em>'.
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesStereoNotEmpty()
	 * @see #getEsxFile()
	 * @generated
	 */
	EAttribute getEsxFile_NumSamplesStereoNotEmpty();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.EsxFile#getNumSongsEmpty <em>Num Songs Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Songs Empty</em>'.
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getNumSongsEmpty()
	 * @see #getEsxFile()
	 * @generated
	 */
	EAttribute getEsxFile_NumSongsEmpty();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.EsxFile#getNumSongsNotEmpty <em>Num Songs Not Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Songs Not Empty</em>'.
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getNumSongsNotEmpty()
	 * @see #getEsxFile()
	 * @generated
	 */
	EAttribute getEsxFile_NumSongsNotEmpty();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.EsxFile#isSyncPatternsOnMoveEnabled <em>Sync Patterns On Move Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sync Patterns On Move Enabled</em>'.
	 * @see com.skratchdot.electribe.model.esx.EsxFile#isSyncPatternsOnMoveEnabled()
	 * @see #getEsxFile()
	 * @generated
	 */
	EAttribute getEsxFile_SyncPatternsOnMoveEnabled();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.EsxFile#isSyncSamplesOnMoveEnabled <em>Sync Samples On Move Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sync Samples On Move Enabled</em>'.
	 * @see com.skratchdot.electribe.model.esx.EsxFile#isSyncSamplesOnMoveEnabled()
	 * @see #getEsxFile()
	 * @generated
	 */
	EAttribute getEsxFile_SyncSamplesOnMoveEnabled();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.GlobalParameters <em>Global Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Parameters</em>'.
	 * @see com.skratchdot.electribe.model.esx.GlobalParameters
	 * @generated
	 */
	EClass getGlobalParameters();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.GlobalParameters#getMemoryProtectEnabled <em>Memory Protect Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Protect Enabled</em>'.
	 * @see com.skratchdot.electribe.model.esx.GlobalParameters#getMemoryProtectEnabled()
	 * @see #getGlobalParameters()
	 * @generated
	 */
	EAttribute getGlobalParameters_MemoryProtectEnabled();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.GlobalParameters#getReservedByte <em>Reserved Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserved Byte</em>'.
	 * @see com.skratchdot.electribe.model.esx.GlobalParameters#getReservedByte()
	 * @see #getGlobalParameters()
	 * @generated
	 */
	EAttribute getGlobalParameters_ReservedByte();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.GlobalParameters#getArpeggiatorControl <em>Arpeggiator Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arpeggiator Control</em>'.
	 * @see com.skratchdot.electribe.model.esx.GlobalParameters#getArpeggiatorControl()
	 * @see #getGlobalParameters()
	 * @generated
	 */
	EAttribute getGlobalParameters_ArpeggiatorControl();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.GlobalParameters#getAudioInMode <em>Audio In Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Audio In Mode</em>'.
	 * @see com.skratchdot.electribe.model.esx.GlobalParameters#getAudioInMode()
	 * @see #getGlobalParameters()
	 * @generated
	 */
	EAttribute getGlobalParameters_AudioInMode();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.GlobalParameters#getMidiClock <em>Midi Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Midi Clock</em>'.
	 * @see com.skratchdot.electribe.model.esx.GlobalParameters#getMidiClock()
	 * @see #getGlobalParameters()
	 * @generated
	 */
	EAttribute getGlobalParameters_MidiClock();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.GlobalParameters#getNoteMessageEnabled <em>Note Message Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note Message Enabled</em>'.
	 * @see com.skratchdot.electribe.model.esx.GlobalParameters#getNoteMessageEnabled()
	 * @see #getGlobalParameters()
	 * @generated
	 */
	EAttribute getGlobalParameters_NoteMessageEnabled();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.GlobalParameters#getSystemExEnabled <em>System Ex Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Ex Enabled</em>'.
	 * @see com.skratchdot.electribe.model.esx.GlobalParameters#getSystemExEnabled()
	 * @see #getGlobalParameters()
	 * @generated
	 */
	EAttribute getGlobalParameters_SystemExEnabled();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.GlobalParameters#getControlChangeEnabled <em>Control Change Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Change Enabled</em>'.
	 * @see com.skratchdot.electribe.model.esx.GlobalParameters#getControlChangeEnabled()
	 * @see #getGlobalParameters()
	 * @generated
	 */
	EAttribute getGlobalParameters_ControlChangeEnabled();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.GlobalParameters#getProgramChangeEnabled <em>Program Change Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Program Change Enabled</em>'.
	 * @see com.skratchdot.electribe.model.esx.GlobalParameters#getProgramChangeEnabled()
	 * @see #getGlobalParameters()
	 * @generated
	 */
	EAttribute getGlobalParameters_ProgramChangeEnabled();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.GlobalParameters#getReservedBitsAfterProgramChangeEnabled <em>Reserved Bits After Program Change Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserved Bits After Program Change Enabled</em>'.
	 * @see com.skratchdot.electribe.model.esx.GlobalParameters#getReservedBitsAfterProgramChangeEnabled()
	 * @see #getGlobalParameters()
	 * @generated
	 */
	EAttribute getGlobalParameters_ReservedBitsAfterProgramChangeEnabled();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.GlobalParameters#getPitchBendRange <em>Pitch Bend Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pitch Bend Range</em>'.
	 * @see com.skratchdot.electribe.model.esx.GlobalParameters#getPitchBendRange()
	 * @see #getGlobalParameters()
	 * @generated
	 */
	EAttribute getGlobalParameters_PitchBendRange();

	/**
	 * Returns the meta object for the containment reference list '{@link com.skratchdot.electribe.model.esx.GlobalParameters#getMidiChannels <em>Midi Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Midi Channels</em>'.
	 * @see com.skratchdot.electribe.model.esx.GlobalParameters#getMidiChannels()
	 * @see #getGlobalParameters()
	 * @generated
	 */
	EReference getGlobalParameters_MidiChannels();

	/**
	 * Returns the meta object for the containment reference list '{@link com.skratchdot.electribe.model.esx.GlobalParameters#getPartNoteNumbers <em>Part Note Numbers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part Note Numbers</em>'.
	 * @see com.skratchdot.electribe.model.esx.GlobalParameters#getPartNoteNumbers()
	 * @see #getGlobalParameters()
	 * @generated
	 */
	EReference getGlobalParameters_PartNoteNumbers();

	/**
	 * Returns the meta object for the containment reference list '{@link com.skratchdot.electribe.model.esx.GlobalParameters#getMidiControlChangeAssignments <em>Midi Control Change Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Midi Control Change Assignments</em>'.
	 * @see com.skratchdot.electribe.model.esx.GlobalParameters#getMidiControlChangeAssignments()
	 * @see #getGlobalParameters()
	 * @generated
	 */
	EReference getGlobalParameters_MidiControlChangeAssignments();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.GlobalParameters#getReservedLong <em>Reserved Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserved Long</em>'.
	 * @see com.skratchdot.electribe.model.esx.GlobalParameters#getReservedLong()
	 * @see #getGlobalParameters()
	 * @generated
	 */
	EAttribute getGlobalParameters_ReservedLong();

	/**
	 * Returns the meta object for the containment reference list '{@link com.skratchdot.electribe.model.esx.GlobalParameters#getPatternSetParameters <em>Pattern Set Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pattern Set Parameters</em>'.
	 * @see com.skratchdot.electribe.model.esx.GlobalParameters#getPatternSetParameters()
	 * @see #getGlobalParameters()
	 * @generated
	 */
	EReference getGlobalParameters_PatternSetParameters();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.PatternSetParameter <em>Pattern Set Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Set Parameter</em>'.
	 * @see com.skratchdot.electribe.model.esx.PatternSetParameter
	 * @generated
	 */
	EClass getPatternSetParameter();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.PatternSetParameter#getPatternNumber <em>Pattern Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern Number</em>'.
	 * @see com.skratchdot.electribe.model.esx.PatternSetParameter#getPatternNumber()
	 * @see #getPatternSetParameter()
	 * @generated
	 */
	EAttribute getPatternSetParameter_PatternNumber();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.PatternSetParameter#getPositionCurrent <em>Position Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Current</em>'.
	 * @see com.skratchdot.electribe.model.esx.PatternSetParameter#getPositionCurrent()
	 * @see #getPatternSetParameter()
	 * @generated
	 */
	EAttribute getPatternSetParameter_PositionCurrent();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.MidiChannelType <em>Midi Channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Midi Channel Type</em>'.
	 * @see com.skratchdot.electribe.model.esx.MidiChannelType
	 * @generated
	 */
	EClass getMidiChannelType();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.MidiChannelType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.skratchdot.electribe.model.esx.MidiChannelType#getName()
	 * @see #getMidiChannelType()
	 * @generated
	 */
	EAttribute getMidiChannelType_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.MidiChannelType#getMidiChannel <em>Midi Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Midi Channel</em>'.
	 * @see com.skratchdot.electribe.model.esx.MidiChannelType#getMidiChannel()
	 * @see #getMidiChannelType()
	 * @generated
	 */
	EAttribute getMidiChannelType_MidiChannel();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.PartNoteNumber <em>Part Note Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part Note Number</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartNoteNumber
	 * @generated
	 */
	EClass getPartNoteNumber();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.PartNoteNumber#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartNoteNumber#getName()
	 * @see #getPartNoteNumber()
	 * @generated
	 */
	EAttribute getPartNoteNumber_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.PartNoteNumber#getNoteNumber <em>Note Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note Number</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartNoteNumber#getNoteNumber()
	 * @see #getPartNoteNumber()
	 * @generated
	 */
	EAttribute getPartNoteNumber_NoteNumber();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.MidiControlChangeAssignment <em>Midi Control Change Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Midi Control Change Assignment</em>'.
	 * @see com.skratchdot.electribe.model.esx.MidiControlChangeAssignment
	 * @generated
	 */
	EClass getMidiControlChangeAssignment();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.MidiControlChangeAssignment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.skratchdot.electribe.model.esx.MidiControlChangeAssignment#getName()
	 * @see #getMidiControlChangeAssignment()
	 * @generated
	 */
	EAttribute getMidiControlChangeAssignment_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.MidiControlChangeAssignment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.skratchdot.electribe.model.esx.MidiControlChangeAssignment#getValue()
	 * @see #getMidiControlChangeAssignment()
	 * @generated
	 */
	EAttribute getMidiControlChangeAssignment_Value();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see com.skratchdot.electribe.model.esx.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Operation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.skratchdot.electribe.model.esx.Operation#getValue()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Value();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.ParametersFx <em>Parameters Fx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameters Fx</em>'.
	 * @see com.skratchdot.electribe.model.esx.ParametersFx
	 * @generated
	 */
	EClass getParametersFx();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.ParametersFx#getEffectType <em>Effect Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect Type</em>'.
	 * @see com.skratchdot.electribe.model.esx.ParametersFx#getEffectType()
	 * @see #getParametersFx()
	 * @generated
	 */
	EAttribute getParametersFx_EffectType();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.ParametersFx#getEdit1 <em>Edit1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit1</em>'.
	 * @see com.skratchdot.electribe.model.esx.ParametersFx#getEdit1()
	 * @see #getParametersFx()
	 * @generated
	 */
	EAttribute getParametersFx_Edit1();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.ParametersFx#getEdit2 <em>Edit2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit2</em>'.
	 * @see com.skratchdot.electribe.model.esx.ParametersFx#getEdit2()
	 * @see #getParametersFx()
	 * @generated
	 */
	EAttribute getParametersFx_Edit2();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.ParametersFx#getMotionSequenceStatus <em>Motion Sequence Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Motion Sequence Status</em>'.
	 * @see com.skratchdot.electribe.model.esx.ParametersFx#getMotionSequenceStatus()
	 * @see #getParametersFx()
	 * @generated
	 */
	EAttribute getParametersFx_MotionSequenceStatus();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.ParametersMotion <em>Parameters Motion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameters Motion</em>'.
	 * @see com.skratchdot.electribe.model.esx.ParametersMotion
	 * @generated
	 */
	EClass getParametersMotion();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.ParametersMotion#getCurrentPosition <em>Current Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Position</em>'.
	 * @see com.skratchdot.electribe.model.esx.ParametersMotion#getCurrentPosition()
	 * @see #getParametersMotion()
	 * @generated
	 */
	EAttribute getParametersMotion_CurrentPosition();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.ParametersMotion#isEmpty <em>Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Empty</em>'.
	 * @see com.skratchdot.electribe.model.esx.ParametersMotion#isEmpty()
	 * @see #getParametersMotion()
	 * @generated
	 */
	EAttribute getParametersMotion_Empty();

	/**
	 * Returns the meta object for the containment reference list '{@link com.skratchdot.electribe.model.esx.ParametersMotion#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see com.skratchdot.electribe.model.esx.ParametersMotion#getOperation()
	 * @see #getParametersMotion()
	 * @generated
	 */
	EReference getParametersMotion_Operation();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.ParametersMotion#getOperationNumber <em>Operation Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Number</em>'.
	 * @see com.skratchdot.electribe.model.esx.ParametersMotion#getOperationNumber()
	 * @see #getParametersMotion()
	 * @generated
	 */
	EAttribute getParametersMotion_OperationNumber();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.ParametersMotion#getOperationType <em>Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Type</em>'.
	 * @see com.skratchdot.electribe.model.esx.ParametersMotion#getOperationType()
	 * @see #getParametersMotion()
	 * @generated
	 */
	EAttribute getParametersMotion_OperationType();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.SequenceData <em>Sequence Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Data</em>'.
	 * @see com.skratchdot.electribe.model.esx.SequenceData
	 * @generated
	 */
	EClass getSequenceData();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.SequenceData#getSequenceData <em>Sequence Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Data</em>'.
	 * @see com.skratchdot.electribe.model.esx.SequenceData#getSequenceData()
	 * @see #getSequenceData()
	 * @generated
	 */
	EAttribute getSequenceData_SequenceData();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.SequenceDataGate <em>Sequence Data Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Data Gate</em>'.
	 * @see com.skratchdot.electribe.model.esx.SequenceDataGate
	 * @generated
	 */
	EClass getSequenceDataGate();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.SequenceDataGate#getSequenceDataGate <em>Sequence Data Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Data Gate</em>'.
	 * @see com.skratchdot.electribe.model.esx.SequenceDataGate#getSequenceDataGate()
	 * @see #getSequenceDataGate()
	 * @generated
	 */
	EAttribute getSequenceDataGate_SequenceDataGate();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.SequenceDataNote <em>Sequence Data Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Data Note</em>'.
	 * @see com.skratchdot.electribe.model.esx.SequenceDataNote
	 * @generated
	 */
	EClass getSequenceDataNote();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.SequenceDataNote#getSequenceDataNote <em>Sequence Data Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Data Note</em>'.
	 * @see com.skratchdot.electribe.model.esx.SequenceDataNote#getSequenceDataNote()
	 * @see #getSequenceDataNote()
	 * @generated
	 */
	EAttribute getSequenceDataNote_SequenceDataNote();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part</em>'.
	 * @see com.skratchdot.electribe.model.esx.Part
	 * @generated
	 */
	EClass getPart();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Part#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see com.skratchdot.electribe.model.esx.Part#getLabel()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_Label();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Part#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see com.skratchdot.electribe.model.esx.Part#getLevel()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_Level();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Part#getMotionSequenceStatus <em>Motion Sequence Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Motion Sequence Status</em>'.
	 * @see com.skratchdot.electribe.model.esx.Part#getMotionSequenceStatus()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_MotionSequenceStatus();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.PartWithSequenceData <em>Part With Sequence Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part With Sequence Data</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartWithSequenceData
	 * @generated
	 */
	EClass getPartWithSequenceData();

	/**
	 * Returns the meta object for the containment reference '{@link com.skratchdot.electribe.model.esx.PartWithSequenceData#getSequenceData <em>Sequence Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Data</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartWithSequenceData#getSequenceData()
	 * @see #getPartWithSequenceData()
	 * @generated
	 */
	EReference getPartWithSequenceData_SequenceData();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.PartWithCommon <em>Part With Common</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part With Common</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartWithCommon
	 * @generated
	 */
	EClass getPartWithCommon();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.PartWithCommon#getAmpEg <em>Amp Eg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amp Eg</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartWithCommon#getAmpEg()
	 * @see #getPartWithCommon()
	 * @generated
	 */
	EAttribute getPartWithCommon_AmpEg();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.PartWithCommon#getBpmSync <em>Bpm Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bpm Sync</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartWithCommon#getBpmSync()
	 * @see #getPartWithCommon()
	 * @generated
	 */
	EAttribute getPartWithCommon_BpmSync();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.PartWithCommon#getCutoff <em>Cutoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cutoff</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartWithCommon#getCutoff()
	 * @see #getPartWithCommon()
	 * @generated
	 */
	EAttribute getPartWithCommon_Cutoff();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.PartWithCommon#getEgIntensity <em>Eg Intensity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eg Intensity</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartWithCommon#getEgIntensity()
	 * @see #getPartWithCommon()
	 * @generated
	 */
	EAttribute getPartWithCommon_EgIntensity();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.PartWithCommon#getEgTime <em>Eg Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eg Time</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartWithCommon#getEgTime()
	 * @see #getPartWithCommon()
	 * @generated
	 */
	EAttribute getPartWithCommon_EgTime();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.PartWithCommon#getFilterType <em>Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Type</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartWithCommon#getFilterType()
	 * @see #getPartWithCommon()
	 * @generated
	 */
	EAttribute getPartWithCommon_FilterType();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.PartWithCommon#getFxSelect <em>Fx Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fx Select</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartWithCommon#getFxSelect()
	 * @see #getPartWithCommon()
	 * @generated
	 */
	EAttribute getPartWithCommon_FxSelect();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.PartWithCommon#getFxSend <em>Fx Send</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fx Send</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartWithCommon#getFxSend()
	 * @see #getPartWithCommon()
	 * @generated
	 */
	EAttribute getPartWithCommon_FxSend();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.PartWithCommon#getModDepth <em>Mod Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mod Depth</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartWithCommon#getModDepth()
	 * @see #getPartWithCommon()
	 * @generated
	 */
	EAttribute getPartWithCommon_ModDepth();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.PartWithCommon#getModDest <em>Mod Dest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mod Dest</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartWithCommon#getModDest()
	 * @see #getPartWithCommon()
	 * @generated
	 */
	EAttribute getPartWithCommon_ModDest();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.PartWithCommon#getModSpeed <em>Mod Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mod Speed</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartWithCommon#getModSpeed()
	 * @see #getPartWithCommon()
	 * @generated
	 */
	EAttribute getPartWithCommon_ModSpeed();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.PartWithCommon#getModType <em>Mod Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mod Type</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartWithCommon#getModType()
	 * @see #getPartWithCommon()
	 * @generated
	 */
	EAttribute getPartWithCommon_ModType();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.PartWithCommon#getPan <em>Pan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pan</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartWithCommon#getPan()
	 * @see #getPartWithCommon()
	 * @generated
	 */
	EAttribute getPartWithCommon_Pan();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.PartWithCommon#getReservedBitAfterModDepth <em>Reserved Bit After Mod Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserved Bit After Mod Depth</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartWithCommon#getReservedBitAfterModDepth()
	 * @see #getPartWithCommon()
	 * @generated
	 */
	EAttribute getPartWithCommon_ReservedBitAfterModDepth();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.PartWithCommon#getResonance <em>Resonance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resonance</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartWithCommon#getResonance()
	 * @see #getPartWithCommon()
	 * @generated
	 */
	EAttribute getPartWithCommon_Resonance();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.PartWithCommon#getRoll <em>Roll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roll</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartWithCommon#getRoll()
	 * @see #getPartWithCommon()
	 * @generated
	 */
	EAttribute getPartWithCommon_Roll();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.PartWithSample <em>Part With Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part With Sample</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartWithSample
	 * @generated
	 */
	EClass getPartWithSample();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.PartWithSample#getReverse <em>Reverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reverse</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartWithSample#getReverse()
	 * @see #getPartWithSample()
	 * @generated
	 */
	EAttribute getPartWithSample_Reverse();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.PartWithSample#getSampleLabel <em>Sample Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sample Label</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartWithSample#getSampleLabel()
	 * @see #getPartWithSample()
	 * @generated
	 */
	EAttribute getPartWithSample_SampleLabel();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.PartWithSample#getSamplePointer <em>Sample Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sample Pointer</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartWithSample#getSamplePointer()
	 * @see #getPartWithSample()
	 * @generated
	 */
	EAttribute getPartWithSample_SamplePointer();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.PartWithSample#getStartPoint <em>Start Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Point</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartWithSample#getStartPoint()
	 * @see #getPartWithSample()
	 * @generated
	 */
	EAttribute getPartWithSample_StartPoint();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.PartWithSample#getReservedBitsAfterReverse <em>Reserved Bits After Reverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserved Bits After Reverse</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartWithSample#getReservedBitsAfterReverse()
	 * @see #getPartWithSample()
	 * @generated
	 */
	EAttribute getPartWithSample_ReservedBitsAfterReverse();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.PartWithSlice <em>Part With Slice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part With Slice</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartWithSlice
	 * @generated
	 */
	EClass getPartWithSlice();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.PartWithSlice#getReservedByte <em>Reserved Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserved Byte</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartWithSlice#getReservedByte()
	 * @see #getPartWithSlice()
	 * @generated
	 */
	EAttribute getPartWithSlice_ReservedByte();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.PartWithSlice#getSliceNumber <em>Slice Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slice Number</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartWithSlice#getSliceNumber()
	 * @see #getPartWithSlice()
	 * @generated
	 */
	EAttribute getPartWithSlice_SliceNumber();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.PartWithPitch <em>Part With Pitch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part With Pitch</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartWithPitch
	 * @generated
	 */
	EClass getPartWithPitch();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.PartWithPitch#getPitch <em>Pitch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pitch</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartWithPitch#getPitch()
	 * @see #getPartWithPitch()
	 * @generated
	 */
	EAttribute getPartWithPitch_Pitch();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.PartWithSequenceDataGate <em>Part With Sequence Data Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part With Sequence Data Gate</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartWithSequenceDataGate
	 * @generated
	 */
	EClass getPartWithSequenceDataGate();

	/**
	 * Returns the meta object for the containment reference '{@link com.skratchdot.electribe.model.esx.PartWithSequenceDataGate#getSequenceDataGate <em>Sequence Data Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Data Gate</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartWithSequenceDataGate#getSequenceDataGate()
	 * @see #getPartWithSequenceDataGate()
	 * @generated
	 */
	EReference getPartWithSequenceDataGate_SequenceDataGate();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.PartAccent <em>Part Accent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part Accent</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartAccent
	 * @generated
	 */
	EClass getPartAccent();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.PartAudioIn <em>Part Audio In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part Audio In</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartAudioIn
	 * @generated
	 */
	EClass getPartAudioIn();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.PartAudioIn#getReservedBitsByte7 <em>Reserved Bits Byte7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserved Bits Byte7</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartAudioIn#getReservedBitsByte7()
	 * @see #getPartAudioIn()
	 * @generated
	 */
	EAttribute getPartAudioIn_ReservedBitsByte7();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.PartDrum <em>Part Drum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part Drum</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartDrum
	 * @generated
	 */
	EClass getPartDrum();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.PartKeyboard <em>Part Keyboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part Keyboard</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartKeyboard
	 * @generated
	 */
	EClass getPartKeyboard();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.PartKeyboard#getGlide <em>Glide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Glide</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartKeyboard#getGlide()
	 * @see #getPartKeyboard()
	 * @generated
	 */
	EAttribute getPartKeyboard_Glide();

	/**
	 * Returns the meta object for the containment reference '{@link com.skratchdot.electribe.model.esx.PartKeyboard#getSequenceDataNote <em>Sequence Data Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Data Note</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartKeyboard#getSequenceDataNote()
	 * @see #getPartKeyboard()
	 * @generated
	 */
	EReference getPartKeyboard_SequenceDataNote();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.PartStretchSlice <em>Part Stretch Slice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part Stretch Slice</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartStretchSlice
	 * @generated
	 */
	EClass getPartStretchSlice();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern</em>'.
	 * @see com.skratchdot.electribe.model.esx.Pattern
	 * @generated
	 */
	EClass getPattern();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Pattern#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.skratchdot.electribe.model.esx.Pattern#getName()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_Name();

	/**
	 * Returns the meta object for the containment reference '{@link com.skratchdot.electribe.model.esx.Pattern#getTempo <em>Tempo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tempo</em>'.
	 * @see com.skratchdot.electribe.model.esx.Pattern#getTempo()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_Tempo();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Pattern#getSwing <em>Swing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swing</em>'.
	 * @see com.skratchdot.electribe.model.esx.Pattern#getSwing()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_Swing();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Pattern#getPatternLength <em>Pattern Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern Length</em>'.
	 * @see com.skratchdot.electribe.model.esx.Pattern#getPatternLength()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_PatternLength();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Pattern#getReservedBitAfterPatternLength <em>Reserved Bit After Pattern Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserved Bit After Pattern Length</em>'.
	 * @see com.skratchdot.electribe.model.esx.Pattern#getReservedBitAfterPatternLength()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_ReservedBitAfterPatternLength();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Pattern#getBeat <em>Beat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beat</em>'.
	 * @see com.skratchdot.electribe.model.esx.Pattern#getBeat()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_Beat();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Pattern#getRollType <em>Roll Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roll Type</em>'.
	 * @see com.skratchdot.electribe.model.esx.Pattern#getRollType()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_RollType();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Pattern#getFxChain <em>Fx Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fx Chain</em>'.
	 * @see com.skratchdot.electribe.model.esx.Pattern#getFxChain()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_FxChain();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Pattern#getLastStep <em>Last Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Step</em>'.
	 * @see com.skratchdot.electribe.model.esx.Pattern#getLastStep()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_LastStep();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Pattern#getArpeggiatorScale <em>Arpeggiator Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arpeggiator Scale</em>'.
	 * @see com.skratchdot.electribe.model.esx.Pattern#getArpeggiatorScale()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_ArpeggiatorScale();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Pattern#getReservedBitsAfterArpeggiatorScale <em>Reserved Bits After Arpeggiator Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserved Bits After Arpeggiator Scale</em>'.
	 * @see com.skratchdot.electribe.model.esx.Pattern#getReservedBitsAfterArpeggiatorScale()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_ReservedBitsAfterArpeggiatorScale();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Pattern#getArpeggiatorCenterNote <em>Arpeggiator Center Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arpeggiator Center Note</em>'.
	 * @see com.skratchdot.electribe.model.esx.Pattern#getArpeggiatorCenterNote()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_ArpeggiatorCenterNote();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Pattern#getMuteStatus <em>Mute Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mute Status</em>'.
	 * @see com.skratchdot.electribe.model.esx.Pattern#getMuteStatus()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_MuteStatus();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Pattern#getSwingStatus <em>Swing Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swing Status</em>'.
	 * @see com.skratchdot.electribe.model.esx.Pattern#getSwingStatus()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_SwingStatus();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Pattern#getOutputBusStatus <em>Output Bus Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Bus Status</em>'.
	 * @see com.skratchdot.electribe.model.esx.Pattern#getOutputBusStatus()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_OutputBusStatus();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Pattern#getAccentStatus <em>Accent Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accent Status</em>'.
	 * @see com.skratchdot.electribe.model.esx.Pattern#getAccentStatus()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_AccentStatus();

	/**
	 * Returns the meta object for the containment reference list '{@link com.skratchdot.electribe.model.esx.Pattern#getDrumParts <em>Drum Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drum Parts</em>'.
	 * @see com.skratchdot.electribe.model.esx.Pattern#getDrumParts()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_DrumParts();

	/**
	 * Returns the meta object for the containment reference list '{@link com.skratchdot.electribe.model.esx.Pattern#getKeyboardParts <em>Keyboard Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keyboard Parts</em>'.
	 * @see com.skratchdot.electribe.model.esx.Pattern#getKeyboardParts()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_KeyboardParts();

	/**
	 * Returns the meta object for the containment reference list '{@link com.skratchdot.electribe.model.esx.Pattern#getStretchSliceParts <em>Stretch Slice Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stretch Slice Parts</em>'.
	 * @see com.skratchdot.electribe.model.esx.Pattern#getStretchSliceParts()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_StretchSliceParts();

	/**
	 * Returns the meta object for the containment reference '{@link com.skratchdot.electribe.model.esx.Pattern#getAudioInPart <em>Audio In Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Audio In Part</em>'.
	 * @see com.skratchdot.electribe.model.esx.Pattern#getAudioInPart()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_AudioInPart();

	/**
	 * Returns the meta object for the containment reference '{@link com.skratchdot.electribe.model.esx.Pattern#getAccentPart <em>Accent Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Accent Part</em>'.
	 * @see com.skratchdot.electribe.model.esx.Pattern#getAccentPart()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_AccentPart();

	/**
	 * Returns the meta object for the containment reference list '{@link com.skratchdot.electribe.model.esx.Pattern#getFxParameters <em>Fx Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fx Parameters</em>'.
	 * @see com.skratchdot.electribe.model.esx.Pattern#getFxParameters()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_FxParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link com.skratchdot.electribe.model.esx.Pattern#getMotionParameters <em>Motion Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Motion Parameters</em>'.
	 * @see com.skratchdot.electribe.model.esx.Pattern#getMotionParameters()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_MotionParameters();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Pattern#isEmpty <em>Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Empty</em>'.
	 * @see com.skratchdot.electribe.model.esx.Pattern#isEmpty()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_Empty();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Pattern#getPatternNumberOriginal <em>Pattern Number Original</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern Number Original</em>'.
	 * @see com.skratchdot.electribe.model.esx.Pattern#getPatternNumberOriginal()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_PatternNumberOriginal();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Pattern#getPatternNumberCurrent <em>Pattern Number Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern Number Current</em>'.
	 * @see com.skratchdot.electribe.model.esx.Pattern#getPatternNumberCurrent()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_PatternNumberCurrent();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.Sample <em>Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sample</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample
	 * @generated
	 */
	EClass getSample();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Sample#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#getName()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Sample#getMemUsedInBytes <em>Mem Used In Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mem Used In Bytes</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#getMemUsedInBytes()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_MemUsedInBytes();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Sample#isEmpty <em>Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Empty</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#isEmpty()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_Empty();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Sample#getPartCount <em>Part Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part Count</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#getPartCount()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_PartCount();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Sample#getPatternCount <em>Pattern Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern Count</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#getPatternCount()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_PatternCount();

	/**
	 * Returns the meta object for the reference list '{@link com.skratchdot.electribe.model.esx.Sample#getSampleInPatternInfoList <em>Sample In Pattern Info List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sample In Pattern Info List</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#getSampleInPatternInfoList()
	 * @see #getSample()
	 * @generated
	 */
	EReference getSample_SampleInPatternInfoList();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Sample#getOffsetChannel1Start <em>Offset Channel1 Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset Channel1 Start</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#getOffsetChannel1Start()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_OffsetChannel1Start();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Sample#getOffsetChannel1End <em>Offset Channel1 End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset Channel1 End</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#getOffsetChannel1End()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_OffsetChannel1End();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Sample#getOffsetChannel2Start <em>Offset Channel2 Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset Channel2 Start</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#getOffsetChannel2Start()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_OffsetChannel2Start();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Sample#getOffsetChannel2End <em>Offset Channel2 End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset Channel2 End</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#getOffsetChannel2End()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_OffsetChannel2End();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Sample#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#getStart()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_Start();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Sample#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#getEnd()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_End();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Sample#getLoopStart <em>Loop Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loop Start</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#getLoopStart()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_LoopStart();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Sample#getSampleRate <em>Sample Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sample Rate</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#getSampleRate()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_SampleRate();

	/**
	 * Returns the meta object for the containment reference '{@link com.skratchdot.electribe.model.esx.Sample#getSampleTune <em>Sample Tune</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sample Tune</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#getSampleTune()
	 * @see #getSample()
	 * @generated
	 */
	EReference getSample_SampleTune();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Sample#getNumberOfSampleFrames <em>Number Of Sample Frames</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Sample Frames</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#getNumberOfSampleFrames()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_NumberOfSampleFrames();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Sample#getPlayLevel <em>Play Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Play Level</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#getPlayLevel()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_PlayLevel();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Sample#getStretchStep <em>Stretch Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stretch Step</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#getStretchStep()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_StretchStep();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Sample#getUnknownByteMono1 <em>Unknown Byte Mono1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unknown Byte Mono1</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#getUnknownByteMono1()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_UnknownByteMono1();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Sample#getUnknownByteMono2 <em>Unknown Byte Mono2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unknown Byte Mono2</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#getUnknownByteMono2()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_UnknownByteMono2();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Sample#getUnknownByteMono3 <em>Unknown Byte Mono3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unknown Byte Mono3</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#getUnknownByteMono3()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_UnknownByteMono3();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Sample#getUnknownByteMono4 <em>Unknown Byte Mono4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unknown Byte Mono4</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#getUnknownByteMono4()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_UnknownByteMono4();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Sample#getUnknownByteStereo1 <em>Unknown Byte Stereo1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unknown Byte Stereo1</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#getUnknownByteStereo1()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_UnknownByteStereo1();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Sample#getUnknownByteStereo2 <em>Unknown Byte Stereo2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unknown Byte Stereo2</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#getUnknownByteStereo2()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_UnknownByteStereo2();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Sample#getUnknownByteStereo3 <em>Unknown Byte Stereo3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unknown Byte Stereo3</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#getUnknownByteStereo3()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_UnknownByteStereo3();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Sample#getUnknownByteStereo4 <em>Unknown Byte Stereo4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unknown Byte Stereo4</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#getUnknownByteStereo4()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_UnknownByteStereo4();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Sample#getAudioDataChannel1 <em>Audio Data Channel1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Audio Data Channel1</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#getAudioDataChannel1()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_AudioDataChannel1();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Sample#getAudioDataChannel2 <em>Audio Data Channel2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Audio Data Channel2</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#getAudioDataChannel2()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_AudioDataChannel2();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Sample#getAudioDataChannelBoth <em>Audio Data Channel Both</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Audio Data Channel Both</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#getAudioDataChannelBoth()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_AudioDataChannelBoth();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Sample#getAudioDataLoopStart <em>Audio Data Loop Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Audio Data Loop Start</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#getAudioDataLoopStart()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_AudioDataLoopStart();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Sample#getSliceArray <em>Slice Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slice Array</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#getSliceArray()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_SliceArray();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Sample#getSampleNumberOriginal <em>Sample Number Original</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sample Number Original</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#getSampleNumberOriginal()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_SampleNumberOriginal();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Sample#getSampleNumberCurrent <em>Sample Number Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sample Number Current</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#getSampleNumberCurrent()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_SampleNumberCurrent();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.SampleInPatternInfo <em>Sample In Pattern Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sample In Pattern Info</em>'.
	 * @see com.skratchdot.electribe.model.esx.SampleInPatternInfo
	 * @generated
	 */
	EClass getSampleInPatternInfo();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.SampleInPatternInfo#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see com.skratchdot.electribe.model.esx.SampleInPatternInfo#getIndex()
	 * @see #getSampleInPatternInfo()
	 * @generated
	 */
	EAttribute getSampleInPatternInfo_Index();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.SampleInPatternInfo#getPatternNumber <em>Pattern Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern Number</em>'.
	 * @see com.skratchdot.electribe.model.esx.SampleInPatternInfo#getPatternNumber()
	 * @see #getSampleInPatternInfo()
	 * @generated
	 */
	EAttribute getSampleInPatternInfo_PatternNumber();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.SampleInPatternInfo#getPartCount <em>Part Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part Count</em>'.
	 * @see com.skratchdot.electribe.model.esx.SampleInPatternInfo#getPartCount()
	 * @see #getSampleInPatternInfo()
	 * @generated
	 */
	EAttribute getSampleInPatternInfo_PartCount();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.SampleInPatternInfo#getPartList <em>Part List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part List</em>'.
	 * @see com.skratchdot.electribe.model.esx.SampleInPatternInfo#getPartList()
	 * @see #getSampleInPatternInfo()
	 * @generated
	 */
	EAttribute getSampleInPatternInfo_PartList();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Sample#isLoop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loop</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#isLoop()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_Loop();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Sample#isSlice <em>Slice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slice</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#isSlice()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_Slice();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Sample#isStereoOriginal <em>Stereo Original</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereo Original</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#isStereoOriginal()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_StereoOriginal();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Sample#isStereoCurrent <em>Stereo Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereo Current</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#isStereoCurrent()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_StereoCurrent();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Sample#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see com.skratchdot.electribe.model.esx.Sample#getLabel()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_Label();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.SampleTune <em>Sample Tune</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sample Tune</em>'.
	 * @see com.skratchdot.electribe.model.esx.SampleTune
	 * @generated
	 */
	EClass getSampleTune();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.SampleTune#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.skratchdot.electribe.model.esx.SampleTune#getValue()
	 * @see #getSampleTune()
	 * @generated
	 */
	EAttribute getSampleTune_Value();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.Song <em>Song</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Song</em>'.
	 * @see com.skratchdot.electribe.model.esx.Song
	 * @generated
	 */
	EClass getSong();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Song#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.skratchdot.electribe.model.esx.Song#getName()
	 * @see #getSong()
	 * @generated
	 */
	EAttribute getSong_Name();

	/**
	 * Returns the meta object for the containment reference '{@link com.skratchdot.electribe.model.esx.Song#getTempo <em>Tempo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tempo</em>'.
	 * @see com.skratchdot.electribe.model.esx.Song#getTempo()
	 * @see #getSong()
	 * @generated
	 */
	EReference getSong_Tempo();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Song#getTempoLock <em>Tempo Lock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tempo Lock</em>'.
	 * @see com.skratchdot.electribe.model.esx.Song#getTempoLock()
	 * @see #getSong()
	 * @generated
	 */
	EAttribute getSong_TempoLock();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Song#getSongLength <em>Song Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Song Length</em>'.
	 * @see com.skratchdot.electribe.model.esx.Song#getSongLength()
	 * @see #getSong()
	 * @generated
	 */
	EAttribute getSong_SongLength();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Song#getMuteHold <em>Mute Hold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mute Hold</em>'.
	 * @see com.skratchdot.electribe.model.esx.Song#getMuteHold()
	 * @see #getSong()
	 * @generated
	 */
	EAttribute getSong_MuteHold();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Song#getNextSongNumber <em>Next Song Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Song Number</em>'.
	 * @see com.skratchdot.electribe.model.esx.Song#getNextSongNumber()
	 * @see #getSong()
	 * @generated
	 */
	EAttribute getSong_NextSongNumber();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Song#getNumberOfSongEventsCurrent <em>Number Of Song Events Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Song Events Current</em>'.
	 * @see com.skratchdot.electribe.model.esx.Song#getNumberOfSongEventsCurrent()
	 * @see #getSong()
	 * @generated
	 */
	EAttribute getSong_NumberOfSongEventsCurrent();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Song#getNumberOfSongEventsOriginal <em>Number Of Song Events Original</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Song Events Original</em>'.
	 * @see com.skratchdot.electribe.model.esx.Song#getNumberOfSongEventsOriginal()
	 * @see #getSong()
	 * @generated
	 */
	EAttribute getSong_NumberOfSongEventsOriginal();

	/**
	 * Returns the meta object for the containment reference list '{@link com.skratchdot.electribe.model.esx.Song#getSongPatterns <em>Song Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Song Patterns</em>'.
	 * @see com.skratchdot.electribe.model.esx.Song#getSongPatterns()
	 * @see #getSong()
	 * @generated
	 */
	EReference getSong_SongPatterns();

	/**
	 * Returns the meta object for the containment reference list '{@link com.skratchdot.electribe.model.esx.Song#getSongEvents <em>Song Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Song Events</em>'.
	 * @see com.skratchdot.electribe.model.esx.Song#getSongEvents()
	 * @see #getSong()
	 * @generated
	 */
	EReference getSong_SongEvents();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Song#isEmpty <em>Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Empty</em>'.
	 * @see com.skratchdot.electribe.model.esx.Song#isEmpty()
	 * @see #getSong()
	 * @generated
	 */
	EAttribute getSong_Empty();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Song#getSongNumberOriginal <em>Song Number Original</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Song Number Original</em>'.
	 * @see com.skratchdot.electribe.model.esx.Song#getSongNumberOriginal()
	 * @see #getSong()
	 * @generated
	 */
	EAttribute getSong_SongNumberOriginal();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Song#getSongNumberCurrent <em>Song Number Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Song Number Current</em>'.
	 * @see com.skratchdot.electribe.model.esx.Song#getSongNumberCurrent()
	 * @see #getSong()
	 * @generated
	 */
	EAttribute getSong_SongNumberCurrent();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.SongPattern <em>Song Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Song Pattern</em>'.
	 * @see com.skratchdot.electribe.model.esx.SongPattern
	 * @generated
	 */
	EClass getSongPattern();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.SongPattern#getPatternNumber <em>Pattern Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern Number</em>'.
	 * @see com.skratchdot.electribe.model.esx.SongPattern#getPatternNumber()
	 * @see #getSongPattern()
	 * @generated
	 */
	EAttribute getSongPattern_PatternNumber();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.SongPattern#getPositionCurrent <em>Position Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Current</em>'.
	 * @see com.skratchdot.electribe.model.esx.SongPattern#getPositionCurrent()
	 * @see #getSongPattern()
	 * @generated
	 */
	EAttribute getSongPattern_PositionCurrent();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.SongPattern#getNoteOffset <em>Note Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note Offset</em>'.
	 * @see com.skratchdot.electribe.model.esx.SongPattern#getNoteOffset()
	 * @see #getSongPattern()
	 * @generated
	 */
	EAttribute getSongPattern_NoteOffset();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.SongPattern#isEmpty <em>Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Empty</em>'.
	 * @see com.skratchdot.electribe.model.esx.SongPattern#isEmpty()
	 * @see #getSongPattern()
	 * @generated
	 */
	EAttribute getSongPattern_Empty();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.Tempo <em>Tempo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tempo</em>'.
	 * @see com.skratchdot.electribe.model.esx.Tempo
	 * @generated
	 */
	EClass getTempo();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.Tempo#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.skratchdot.electribe.model.esx.Tempo#getValue()
	 * @see #getTempo()
	 * @generated
	 */
	EAttribute getTempo_Value();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.SongEvent <em>Song Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Song Event</em>'.
	 * @see com.skratchdot.electribe.model.esx.SongEvent
	 * @generated
	 */
	EClass getSongEvent();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.SongEvent#getCurrentPosition <em>Current Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Position</em>'.
	 * @see com.skratchdot.electribe.model.esx.SongEvent#getCurrentPosition()
	 * @see #getSongEvent()
	 * @generated
	 */
	EAttribute getSongEvent_CurrentPosition();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.SongEvent#getEventInfo <em>Event Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Info</em>'.
	 * @see com.skratchdot.electribe.model.esx.SongEvent#getEventInfo()
	 * @see #getSongEvent()
	 * @generated
	 */
	EAttribute getSongEvent_EventInfo();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.SongEvent#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Type</em>'.
	 * @see com.skratchdot.electribe.model.esx.SongEvent#getEventType()
	 * @see #getSongEvent()
	 * @generated
	 */
	EAttribute getSongEvent_EventType();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.SongEvent#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measure</em>'.
	 * @see com.skratchdot.electribe.model.esx.SongEvent#getMeasure()
	 * @see #getSongEvent()
	 * @generated
	 */
	EAttribute getSongEvent_Measure();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.SongEvent#getOperationNumber <em>Operation Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Number</em>'.
	 * @see com.skratchdot.electribe.model.esx.SongEvent#getOperationNumber()
	 * @see #getSongEvent()
	 * @generated
	 */
	EAttribute getSongEvent_OperationNumber();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.SongEvent#getPositionNumber <em>Position Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Number</em>'.
	 * @see com.skratchdot.electribe.model.esx.SongEvent#getPositionNumber()
	 * @see #getSongEvent()
	 * @generated
	 */
	EAttribute getSongEvent_PositionNumber();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.SongEvent#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see com.skratchdot.electribe.model.esx.SongEvent#getStep()
	 * @see #getSongEvent()
	 * @generated
	 */
	EAttribute getSongEvent_Step();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.SongEventWithPart <em>Song Event With Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Song Event With Part</em>'.
	 * @see com.skratchdot.electribe.model.esx.SongEventWithPart
	 * @generated
	 */
	EClass getSongEventWithPart();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.SongEventWithPart#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part</em>'.
	 * @see com.skratchdot.electribe.model.esx.SongEventWithPart#getPart()
	 * @see #getSongEventWithPart()
	 * @generated
	 */
	EAttribute getSongEventWithPart_Part();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.SongEventControl <em>Song Event Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Song Event Control</em>'.
	 * @see com.skratchdot.electribe.model.esx.SongEventControl
	 * @generated
	 */
	EClass getSongEventControl();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.SongEventControl#getOperationType <em>Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Type</em>'.
	 * @see com.skratchdot.electribe.model.esx.SongEventControl#getOperationType()
	 * @see #getSongEventControl()
	 * @generated
	 */
	EAttribute getSongEventControl_OperationType();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.SongEventControl#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.skratchdot.electribe.model.esx.SongEventControl#getValue()
	 * @see #getSongEventControl()
	 * @generated
	 */
	EAttribute getSongEventControl_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.SongEventControl#getReservedByte <em>Reserved Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserved Byte</em>'.
	 * @see com.skratchdot.electribe.model.esx.SongEventControl#getReservedByte()
	 * @see #getSongEventControl()
	 * @generated
	 */
	EAttribute getSongEventControl_ReservedByte();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.SongEventControl#getReservedShort <em>Reserved Short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserved Short</em>'.
	 * @see com.skratchdot.electribe.model.esx.SongEventControl#getReservedShort()
	 * @see #getSongEventControl()
	 * @generated
	 */
	EAttribute getSongEventControl_ReservedShort();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.SongEventDrumNote <em>Song Event Drum Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Song Event Drum Note</em>'.
	 * @see com.skratchdot.electribe.model.esx.SongEventDrumNote
	 * @generated
	 */
	EClass getSongEventDrumNote();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.SongEventDrumNote#getReservedByte <em>Reserved Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserved Byte</em>'.
	 * @see com.skratchdot.electribe.model.esx.SongEventDrumNote#getReservedByte()
	 * @see #getSongEventDrumNote()
	 * @generated
	 */
	EAttribute getSongEventDrumNote_ReservedByte();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.SongEventDrumNote#getReservedShort <em>Reserved Short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserved Short</em>'.
	 * @see com.skratchdot.electribe.model.esx.SongEventDrumNote#getReservedShort()
	 * @see #getSongEventDrumNote()
	 * @generated
	 */
	EAttribute getSongEventDrumNote_ReservedShort();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.SongEventKeyboardNote <em>Song Event Keyboard Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Song Event Keyboard Note</em>'.
	 * @see com.skratchdot.electribe.model.esx.SongEventKeyboardNote
	 * @generated
	 */
	EClass getSongEventKeyboardNote();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.SongEventKeyboardNote#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see com.skratchdot.electribe.model.esx.SongEventKeyboardNote#getLength()
	 * @see #getSongEventKeyboardNote()
	 * @generated
	 */
	EAttribute getSongEventKeyboardNote_Length();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.SongEventKeyboardNote#getNoteNumber <em>Note Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note Number</em>'.
	 * @see com.skratchdot.electribe.model.esx.SongEventKeyboardNote#getNoteNumber()
	 * @see #getSongEventKeyboardNote()
	 * @generated
	 */
	EAttribute getSongEventKeyboardNote_NoteNumber();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.SongEventTempo <em>Song Event Tempo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Song Event Tempo</em>'.
	 * @see com.skratchdot.electribe.model.esx.SongEventTempo
	 * @generated
	 */
	EClass getSongEventTempo();

	/**
	 * Returns the meta object for the containment reference '{@link com.skratchdot.electribe.model.esx.SongEventTempo#getTempo <em>Tempo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tempo</em>'.
	 * @see com.skratchdot.electribe.model.esx.SongEventTempo#getTempo()
	 * @see #getSongEventTempo()
	 * @generated
	 */
	EReference getSongEventTempo_Tempo();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.SongEventTempo#getReservedShort <em>Reserved Short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserved Short</em>'.
	 * @see com.skratchdot.electribe.model.esx.SongEventTempo#getReservedShort()
	 * @see #getSongEventTempo()
	 * @generated
	 */
	EAttribute getSongEventTempo_ReservedShort();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.electribe.model.esx.SongEventMuteStatus <em>Song Event Mute Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Song Event Mute Status</em>'.
	 * @see com.skratchdot.electribe.model.esx.SongEventMuteStatus
	 * @generated
	 */
	EClass getSongEventMuteStatus();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.SongEventMuteStatus#getReservedShort <em>Reserved Short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserved Short</em>'.
	 * @see com.skratchdot.electribe.model.esx.SongEventMuteStatus#getReservedShort()
	 * @see #getSongEventMuteStatus()
	 * @generated
	 */
	EAttribute getSongEventMuteStatus_ReservedShort();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.electribe.model.esx.SongEventMuteStatus#getMuteStatus <em>Mute Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mute Status</em>'.
	 * @see com.skratchdot.electribe.model.esx.SongEventMuteStatus#getMuteStatus()
	 * @see #getSongEventMuteStatus()
	 * @generated
	 */
	EAttribute getSongEventMuteStatus_MuteStatus();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.ArpeggiatorControl <em>Arpeggiator Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arpeggiator Control</em>'.
	 * @see com.skratchdot.electribe.model.esx.ArpeggiatorControl
	 * @generated
	 */
	EEnum getArpeggiatorControl();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.AudioInMode <em>Audio In Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Audio In Mode</em>'.
	 * @see com.skratchdot.electribe.model.esx.AudioInMode
	 * @generated
	 */
	EEnum getAudioInMode();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.MidiClock <em>Midi Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Midi Clock</em>'.
	 * @see com.skratchdot.electribe.model.esx.MidiClock
	 * @generated
	 */
	EEnum getMidiClock();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.MidiControlChangeAssignmentName <em>Midi Control Change Assignment Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Midi Control Change Assignment Name</em>'.
	 * @see com.skratchdot.electribe.model.esx.MidiControlChangeAssignmentName
	 * @generated
	 */
	EEnum getMidiControlChangeAssignmentName();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.EnabledFlag <em>Enabled Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enabled Flag</em>'.
	 * @see com.skratchdot.electribe.model.esx.EnabledFlag
	 * @generated
	 */
	EEnum getEnabledFlag();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.PitchBendRange <em>Pitch Bend Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pitch Bend Range</em>'.
	 * @see com.skratchdot.electribe.model.esx.PitchBendRange
	 * @generated
	 */
	EEnum getPitchBendRange();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.MidiChannel <em>Midi Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Midi Channel</em>'.
	 * @see com.skratchdot.electribe.model.esx.MidiChannel
	 * @generated
	 */
	EEnum getMidiChannel();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.MidiChannelTypeName <em>Midi Channel Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Midi Channel Type Name</em>'.
	 * @see com.skratchdot.electribe.model.esx.MidiChannelTypeName
	 * @generated
	 */
	EEnum getMidiChannelTypeName();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.PlayLevel <em>Play Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Play Level</em>'.
	 * @see com.skratchdot.electribe.model.esx.PlayLevel
	 * @generated
	 */
	EEnum getPlayLevel();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.PatternNumber <em>Pattern Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pattern Number</em>'.
	 * @see com.skratchdot.electribe.model.esx.PatternNumber
	 * @generated
	 */
	EEnum getPatternNumber();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.SampleNumber <em>Sample Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sample Number</em>'.
	 * @see com.skratchdot.electribe.model.esx.SampleNumber
	 * @generated
	 */
	EEnum getSampleNumber();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.SongEventPart <em>Song Event Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Song Event Part</em>'.
	 * @see com.skratchdot.electribe.model.esx.SongEventPart
	 * @generated
	 */
	EEnum getSongEventPart();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.SongNumber <em>Song Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Song Number</em>'.
	 * @see com.skratchdot.electribe.model.esx.SongNumber
	 * @generated
	 */
	EEnum getSongNumber();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.SongLength <em>Song Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Song Length</em>'.
	 * @see com.skratchdot.electribe.model.esx.SongLength
	 * @generated
	 */
	EEnum getSongLength();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.TempoLock <em>Tempo Lock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tempo Lock</em>'.
	 * @see com.skratchdot.electribe.model.esx.TempoLock
	 * @generated
	 */
	EEnum getTempoLock();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.MuteHold <em>Mute Hold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mute Hold</em>'.
	 * @see com.skratchdot.electribe.model.esx.MuteHold
	 * @generated
	 */
	EEnum getMuteHold();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.NextSongNumber <em>Next Song Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Next Song Number</em>'.
	 * @see com.skratchdot.electribe.model.esx.NextSongNumber
	 * @generated
	 */
	EEnum getNextSongNumber();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.StretchStep <em>Stretch Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Stretch Step</em>'.
	 * @see com.skratchdot.electribe.model.esx.StretchStep
	 * @generated
	 */
	EEnum getStretchStep();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.Swing <em>Swing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Swing</em>'.
	 * @see com.skratchdot.electribe.model.esx.Swing
	 * @generated
	 */
	EEnum getSwing();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.PatternLength <em>Pattern Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pattern Length</em>'.
	 * @see com.skratchdot.electribe.model.esx.PatternLength
	 * @generated
	 */
	EEnum getPatternLength();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.Beat <em>Beat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Beat</em>'.
	 * @see com.skratchdot.electribe.model.esx.Beat
	 * @generated
	 */
	EEnum getBeat();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.RollType <em>Roll Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Roll Type</em>'.
	 * @see com.skratchdot.electribe.model.esx.RollType
	 * @generated
	 */
	EEnum getRollType();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.FxChain <em>Fx Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fx Chain</em>'.
	 * @see com.skratchdot.electribe.model.esx.FxChain
	 * @generated
	 */
	EEnum getFxChain();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.LastStep <em>Last Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Last Step</em>'.
	 * @see com.skratchdot.electribe.model.esx.LastStep
	 * @generated
	 */
	EEnum getLastStep();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.ArpeggiatorScale <em>Arpeggiator Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arpeggiator Scale</em>'.
	 * @see com.skratchdot.electribe.model.esx.ArpeggiatorScale
	 * @generated
	 */
	EEnum getArpeggiatorScale();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.AudioChannelType <em>Audio Channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Audio Channel Type</em>'.
	 * @see com.skratchdot.electribe.model.esx.AudioChannelType
	 * @generated
	 */
	EEnum getAudioChannelType();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.NoteNumber <em>Note Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Note Number</em>'.
	 * @see com.skratchdot.electribe.model.esx.NoteNumber
	 * @generated
	 */
	EEnum getNoteNumber();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.OperationType <em>Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Type</em>'.
	 * @see com.skratchdot.electribe.model.esx.OperationType
	 * @generated
	 */
	EEnum getOperationType();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.PartNoteNumberName <em>Part Note Number Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Part Note Number Name</em>'.
	 * @see com.skratchdot.electribe.model.esx.PartNoteNumberName
	 * @generated
	 */
	EEnum getPartNoteNumberName();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.FilterType <em>Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Filter Type</em>'.
	 * @see com.skratchdot.electribe.model.esx.FilterType
	 * @generated
	 */
	EEnum getFilterType();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.FxSelect <em>Fx Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fx Select</em>'.
	 * @see com.skratchdot.electribe.model.esx.FxSelect
	 * @generated
	 */
	EEnum getFxSelect();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.FxSend <em>Fx Send</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fx Send</em>'.
	 * @see com.skratchdot.electribe.model.esx.FxSend
	 * @generated
	 */
	EEnum getFxSend();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.FxType <em>Fx Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fx Type</em>'.
	 * @see com.skratchdot.electribe.model.esx.FxType
	 * @generated
	 */
	EEnum getFxType();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.Roll <em>Roll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Roll</em>'.
	 * @see com.skratchdot.electribe.model.esx.Roll
	 * @generated
	 */
	EEnum getRoll();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.AmpEg <em>Amp Eg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Amp Eg</em>'.
	 * @see com.skratchdot.electribe.model.esx.AmpEg
	 * @generated
	 */
	EEnum getAmpEg();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.Reverse <em>Reverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reverse</em>'.
	 * @see com.skratchdot.electribe.model.esx.Reverse
	 * @generated
	 */
	EEnum getReverse();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.ModDest <em>Mod Dest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mod Dest</em>'.
	 * @see com.skratchdot.electribe.model.esx.ModDest
	 * @generated
	 */
	EEnum getModDest();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.ModType <em>Mod Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mod Type</em>'.
	 * @see com.skratchdot.electribe.model.esx.ModType
	 * @generated
	 */
	EEnum getModType();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.BpmSync <em>Bpm Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bpm Sync</em>'.
	 * @see com.skratchdot.electribe.model.esx.BpmSync
	 * @generated
	 */
	EEnum getBpmSync();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.electribe.model.esx.MotionSequenceStatus <em>Motion Sequence Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Motion Sequence Status</em>'.
	 * @see com.skratchdot.electribe.model.esx.MotionSequenceStatus
	 * @generated
	 */
	EEnum getMotionSequenceStatus();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Object</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getObject();

	/**
	 * Returns the meta object for data type '{@link com.skratchdot.riff.wav.RIFFWave <em>RIFF Wave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>RIFF Wave</em>'.
	 * @see com.skratchdot.riff.wav.RIFFWave
	 * @model instanceClass="com.skratchdot.riff.wav.RIFFWave"
	 * @generated
	 */
	EDataType getRIFFWave();

	/**
	 * Returns the meta object for data type '{@link java.util.ArrayList <em>Array List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Array List</em>'.
	 * @see java.util.ArrayList
	 * @model instanceClass="java.util.ArrayList" typeParameters="E"
	 * @generated
	 */
	EDataType getArrayList();

	/**
	 * Returns the meta object for data type '{@link java.io.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>File</em>'.
	 * @see java.io.File
	 * @model instanceClass="java.io.File"
	 * @generated
	 */
	EDataType getFile();

	/**
	 * Returns the meta object for data type '{@link java.io.InputStream <em>Input Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Input Stream</em>'.
	 * @see java.io.InputStream
	 * @model instanceClass="java.io.InputStream"
	 * @generated
	 */
	EDataType getInputStream();

	/**
	 * Returns the meta object for data type '{@link java.lang.IndexOutOfBoundsException <em>Index Out Of Bounds Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Index Out Of Bounds Exception</em>'.
	 * @see java.lang.IndexOutOfBoundsException
	 * @model instanceClass="java.lang.IndexOutOfBoundsException"
	 * @generated
	 */
	EDataType getIndexOutOfBoundsException();

	/**
	 * Returns the meta object for data type '{@link java.io.IOException <em>IO Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IO Exception</em>'.
	 * @see java.io.IOException
	 * @model instanceClass="java.io.IOException"
	 * @generated
	 */
	EDataType getIOException();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.runtime.IProgressMonitor <em>IProgress Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IProgress Monitor</em>'.
	 * @see org.eclipse.core.runtime.IProgressMonitor
	 * @model instanceClass="org.eclipse.core.runtime.IProgressMonitor"
	 * @generated
	 */
	EDataType getIProgressMonitor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EsxFactory getEsxFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.EsxFileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.EsxFileImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getEsxFile()
		 * @generated
		 */
		EClass ESX_FILE = eINSTANCE.getEsxFile();

		/**
		 * The meta object literal for the '<em><b>Original Non Audio Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESX_FILE__ORIGINAL_NON_AUDIO_DATA = eINSTANCE.getEsxFile_OriginalNonAudioData();

		/**
		 * The meta object literal for the '<em><b>Global Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESX_FILE__GLOBAL_PARAMETERS = eINSTANCE.getEsxFile_GlobalParameters();

		/**
		 * The meta object literal for the '<em><b>Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESX_FILE__PATTERNS = eINSTANCE.getEsxFile_Patterns();

		/**
		 * The meta object literal for the '<em><b>Songs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESX_FILE__SONGS = eINSTANCE.getEsxFile_Songs();

		/**
		 * The meta object literal for the '<em><b>Samples</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESX_FILE__SAMPLES = eINSTANCE.getEsxFile_Samples();

		/**
		 * The meta object literal for the '<em><b>Empty Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESX_FILE__EMPTY_PATTERN = eINSTANCE.getEsxFile_EmptyPattern();

		/**
		 * The meta object literal for the '<em><b>Empty Song</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESX_FILE__EMPTY_SONG = eINSTANCE.getEsxFile_EmptySong();

		/**
		 * The meta object literal for the '<em><b>Max Sample Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESX_FILE__MAX_SAMPLE_OFFSET = eINSTANCE.getEsxFile_MaxSampleOffset();

		/**
		 * The meta object literal for the '<em><b>Mem Used In Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESX_FILE__MEM_USED_IN_BYTES = eINSTANCE.getEsxFile_MemUsedInBytes();

		/**
		 * The meta object literal for the '<em><b>Mem Used In Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESX_FILE__MEM_USED_IN_SECONDS = eINSTANCE.getEsxFile_MemUsedInSeconds();

		/**
		 * The meta object literal for the '<em><b>Mem Free In Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESX_FILE__MEM_FREE_IN_BYTES = eINSTANCE.getEsxFile_MemFreeInBytes();

		/**
		 * The meta object literal for the '<em><b>Mem Free In Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESX_FILE__MEM_FREE_IN_SECONDS = eINSTANCE.getEsxFile_MemFreeInSeconds();

		/**
		 * The meta object literal for the '<em><b>Num Patterns Empty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESX_FILE__NUM_PATTERNS_EMPTY = eINSTANCE.getEsxFile_NumPatternsEmpty();

		/**
		 * The meta object literal for the '<em><b>Num Patterns Not Empty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESX_FILE__NUM_PATTERNS_NOT_EMPTY = eINSTANCE.getEsxFile_NumPatternsNotEmpty();

		/**
		 * The meta object literal for the '<em><b>Num Samples Empty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESX_FILE__NUM_SAMPLES_EMPTY = eINSTANCE.getEsxFile_NumSamplesEmpty();

		/**
		 * The meta object literal for the '<em><b>Num Samples Not Empty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESX_FILE__NUM_SAMPLES_NOT_EMPTY = eINSTANCE.getEsxFile_NumSamplesNotEmpty();

		/**
		 * The meta object literal for the '<em><b>Num Samples Mono Empty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESX_FILE__NUM_SAMPLES_MONO_EMPTY = eINSTANCE.getEsxFile_NumSamplesMonoEmpty();

		/**
		 * The meta object literal for the '<em><b>Num Samples Mono Not Empty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESX_FILE__NUM_SAMPLES_MONO_NOT_EMPTY = eINSTANCE.getEsxFile_NumSamplesMonoNotEmpty();

		/**
		 * The meta object literal for the '<em><b>Num Samples Stereo Empty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESX_FILE__NUM_SAMPLES_STEREO_EMPTY = eINSTANCE.getEsxFile_NumSamplesStereoEmpty();

		/**
		 * The meta object literal for the '<em><b>Num Samples Stereo Not Empty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESX_FILE__NUM_SAMPLES_STEREO_NOT_EMPTY = eINSTANCE.getEsxFile_NumSamplesStereoNotEmpty();

		/**
		 * The meta object literal for the '<em><b>Num Songs Empty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESX_FILE__NUM_SONGS_EMPTY = eINSTANCE.getEsxFile_NumSongsEmpty();

		/**
		 * The meta object literal for the '<em><b>Num Songs Not Empty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESX_FILE__NUM_SONGS_NOT_EMPTY = eINSTANCE.getEsxFile_NumSongsNotEmpty();

		/**
		 * The meta object literal for the '<em><b>Sync Patterns On Move Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESX_FILE__SYNC_PATTERNS_ON_MOVE_ENABLED = eINSTANCE.getEsxFile_SyncPatternsOnMoveEnabled();

		/**
		 * The meta object literal for the '<em><b>Sync Samples On Move Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESX_FILE__SYNC_SAMPLES_ON_MOVE_ENABLED = eINSTANCE.getEsxFile_SyncSamplesOnMoveEnabled();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.GlobalParametersImpl <em>Global Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.GlobalParametersImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getGlobalParameters()
		 * @generated
		 */
		EClass GLOBAL_PARAMETERS = eINSTANCE.getGlobalParameters();

		/**
		 * The meta object literal for the '<em><b>Memory Protect Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_PARAMETERS__MEMORY_PROTECT_ENABLED = eINSTANCE.getGlobalParameters_MemoryProtectEnabled();

		/**
		 * The meta object literal for the '<em><b>Reserved Byte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_PARAMETERS__RESERVED_BYTE = eINSTANCE.getGlobalParameters_ReservedByte();

		/**
		 * The meta object literal for the '<em><b>Arpeggiator Control</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_PARAMETERS__ARPEGGIATOR_CONTROL = eINSTANCE.getGlobalParameters_ArpeggiatorControl();

		/**
		 * The meta object literal for the '<em><b>Audio In Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_PARAMETERS__AUDIO_IN_MODE = eINSTANCE.getGlobalParameters_AudioInMode();

		/**
		 * The meta object literal for the '<em><b>Midi Clock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_PARAMETERS__MIDI_CLOCK = eINSTANCE.getGlobalParameters_MidiClock();

		/**
		 * The meta object literal for the '<em><b>Note Message Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_PARAMETERS__NOTE_MESSAGE_ENABLED = eINSTANCE.getGlobalParameters_NoteMessageEnabled();

		/**
		 * The meta object literal for the '<em><b>System Ex Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_PARAMETERS__SYSTEM_EX_ENABLED = eINSTANCE.getGlobalParameters_SystemExEnabled();

		/**
		 * The meta object literal for the '<em><b>Control Change Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_PARAMETERS__CONTROL_CHANGE_ENABLED = eINSTANCE.getGlobalParameters_ControlChangeEnabled();

		/**
		 * The meta object literal for the '<em><b>Program Change Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_PARAMETERS__PROGRAM_CHANGE_ENABLED = eINSTANCE.getGlobalParameters_ProgramChangeEnabled();

		/**
		 * The meta object literal for the '<em><b>Reserved Bits After Program Change Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_PARAMETERS__RESERVED_BITS_AFTER_PROGRAM_CHANGE_ENABLED = eINSTANCE.getGlobalParameters_ReservedBitsAfterProgramChangeEnabled();

		/**
		 * The meta object literal for the '<em><b>Pitch Bend Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_PARAMETERS__PITCH_BEND_RANGE = eINSTANCE.getGlobalParameters_PitchBendRange();

		/**
		 * The meta object literal for the '<em><b>Midi Channels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_PARAMETERS__MIDI_CHANNELS = eINSTANCE.getGlobalParameters_MidiChannels();

		/**
		 * The meta object literal for the '<em><b>Part Note Numbers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_PARAMETERS__PART_NOTE_NUMBERS = eINSTANCE.getGlobalParameters_PartNoteNumbers();

		/**
		 * The meta object literal for the '<em><b>Midi Control Change Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_PARAMETERS__MIDI_CONTROL_CHANGE_ASSIGNMENTS = eINSTANCE.getGlobalParameters_MidiControlChangeAssignments();

		/**
		 * The meta object literal for the '<em><b>Reserved Long</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_PARAMETERS__RESERVED_LONG = eINSTANCE.getGlobalParameters_ReservedLong();

		/**
		 * The meta object literal for the '<em><b>Pattern Set Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_PARAMETERS__PATTERN_SET_PARAMETERS = eINSTANCE.getGlobalParameters_PatternSetParameters();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.PatternSetParameterImpl <em>Pattern Set Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.PatternSetParameterImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPatternSetParameter()
		 * @generated
		 */
		EClass PATTERN_SET_PARAMETER = eINSTANCE.getPatternSetParameter();

		/**
		 * The meta object literal for the '<em><b>Pattern Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SET_PARAMETER__PATTERN_NUMBER = eINSTANCE.getPatternSetParameter_PatternNumber();

		/**
		 * The meta object literal for the '<em><b>Position Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SET_PARAMETER__POSITION_CURRENT = eINSTANCE.getPatternSetParameter_PositionCurrent();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.MidiChannelTypeImpl <em>Midi Channel Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.MidiChannelTypeImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getMidiChannelType()
		 * @generated
		 */
		EClass MIDI_CHANNEL_TYPE = eINSTANCE.getMidiChannelType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIDI_CHANNEL_TYPE__NAME = eINSTANCE.getMidiChannelType_Name();

		/**
		 * The meta object literal for the '<em><b>Midi Channel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIDI_CHANNEL_TYPE__MIDI_CHANNEL = eINSTANCE.getMidiChannelType_MidiChannel();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.PartNoteNumberImpl <em>Part Note Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.PartNoteNumberImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPartNoteNumber()
		 * @generated
		 */
		EClass PART_NOTE_NUMBER = eINSTANCE.getPartNoteNumber();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART_NOTE_NUMBER__NAME = eINSTANCE.getPartNoteNumber_Name();

		/**
		 * The meta object literal for the '<em><b>Note Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART_NOTE_NUMBER__NOTE_NUMBER = eINSTANCE.getPartNoteNumber_NoteNumber();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.MidiControlChangeAssignmentImpl <em>Midi Control Change Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.MidiControlChangeAssignmentImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getMidiControlChangeAssignment()
		 * @generated
		 */
		EClass MIDI_CONTROL_CHANGE_ASSIGNMENT = eINSTANCE.getMidiControlChangeAssignment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIDI_CONTROL_CHANGE_ASSIGNMENT__NAME = eINSTANCE.getMidiControlChangeAssignment_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIDI_CONTROL_CHANGE_ASSIGNMENT__VALUE = eINSTANCE.getMidiControlChangeAssignment_Value();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.OperationImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__VALUE = eINSTANCE.getOperation_Value();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.ParametersFxImpl <em>Parameters Fx</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.ParametersFxImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getParametersFx()
		 * @generated
		 */
		EClass PARAMETERS_FX = eINSTANCE.getParametersFx();

		/**
		 * The meta object literal for the '<em><b>Effect Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS_FX__EFFECT_TYPE = eINSTANCE.getParametersFx_EffectType();

		/**
		 * The meta object literal for the '<em><b>Edit1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS_FX__EDIT1 = eINSTANCE.getParametersFx_Edit1();

		/**
		 * The meta object literal for the '<em><b>Edit2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS_FX__EDIT2 = eINSTANCE.getParametersFx_Edit2();

		/**
		 * The meta object literal for the '<em><b>Motion Sequence Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS_FX__MOTION_SEQUENCE_STATUS = eINSTANCE.getParametersFx_MotionSequenceStatus();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.ParametersMotionImpl <em>Parameters Motion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.ParametersMotionImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getParametersMotion()
		 * @generated
		 */
		EClass PARAMETERS_MOTION = eINSTANCE.getParametersMotion();

		/**
		 * The meta object literal for the '<em><b>Current Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS_MOTION__CURRENT_POSITION = eINSTANCE.getParametersMotion_CurrentPosition();

		/**
		 * The meta object literal for the '<em><b>Empty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS_MOTION__EMPTY = eINSTANCE.getParametersMotion_Empty();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETERS_MOTION__OPERATION = eINSTANCE.getParametersMotion_Operation();

		/**
		 * The meta object literal for the '<em><b>Operation Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS_MOTION__OPERATION_NUMBER = eINSTANCE.getParametersMotion_OperationNumber();

		/**
		 * The meta object literal for the '<em><b>Operation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS_MOTION__OPERATION_TYPE = eINSTANCE.getParametersMotion_OperationType();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.SequenceDataImpl <em>Sequence Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.SequenceDataImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSequenceData()
		 * @generated
		 */
		EClass SEQUENCE_DATA = eINSTANCE.getSequenceData();

		/**
		 * The meta object literal for the '<em><b>Sequence Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE_DATA__SEQUENCE_DATA = eINSTANCE.getSequenceData_SequenceData();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.SequenceDataGateImpl <em>Sequence Data Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.SequenceDataGateImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSequenceDataGate()
		 * @generated
		 */
		EClass SEQUENCE_DATA_GATE = eINSTANCE.getSequenceDataGate();

		/**
		 * The meta object literal for the '<em><b>Sequence Data Gate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE_DATA_GATE__SEQUENCE_DATA_GATE = eINSTANCE.getSequenceDataGate_SequenceDataGate();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.SequenceDataNoteImpl <em>Sequence Data Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.SequenceDataNoteImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSequenceDataNote()
		 * @generated
		 */
		EClass SEQUENCE_DATA_NOTE = eINSTANCE.getSequenceDataNote();

		/**
		 * The meta object literal for the '<em><b>Sequence Data Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE_DATA_NOTE__SEQUENCE_DATA_NOTE = eINSTANCE.getSequenceDataNote_SequenceDataNote();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.PartImpl <em>Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.PartImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPart()
		 * @generated
		 */
		EClass PART = eINSTANCE.getPart();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART__LABEL = eINSTANCE.getPart_Label();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART__LEVEL = eINSTANCE.getPart_Level();

		/**
		 * The meta object literal for the '<em><b>Motion Sequence Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART__MOTION_SEQUENCE_STATUS = eINSTANCE.getPart_MotionSequenceStatus();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.PartWithSequenceDataImpl <em>Part With Sequence Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.PartWithSequenceDataImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPartWithSequenceData()
		 * @generated
		 */
		EClass PART_WITH_SEQUENCE_DATA = eINSTANCE.getPartWithSequenceData();

		/**
		 * The meta object literal for the '<em><b>Sequence Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART_WITH_SEQUENCE_DATA__SEQUENCE_DATA = eINSTANCE.getPartWithSequenceData_SequenceData();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.PartWithCommonImpl <em>Part With Common</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.PartWithCommonImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPartWithCommon()
		 * @generated
		 */
		EClass PART_WITH_COMMON = eINSTANCE.getPartWithCommon();

		/**
		 * The meta object literal for the '<em><b>Amp Eg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART_WITH_COMMON__AMP_EG = eINSTANCE.getPartWithCommon_AmpEg();

		/**
		 * The meta object literal for the '<em><b>Bpm Sync</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART_WITH_COMMON__BPM_SYNC = eINSTANCE.getPartWithCommon_BpmSync();

		/**
		 * The meta object literal for the '<em><b>Cutoff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART_WITH_COMMON__CUTOFF = eINSTANCE.getPartWithCommon_Cutoff();

		/**
		 * The meta object literal for the '<em><b>Eg Intensity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART_WITH_COMMON__EG_INTENSITY = eINSTANCE.getPartWithCommon_EgIntensity();

		/**
		 * The meta object literal for the '<em><b>Eg Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART_WITH_COMMON__EG_TIME = eINSTANCE.getPartWithCommon_EgTime();

		/**
		 * The meta object literal for the '<em><b>Filter Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART_WITH_COMMON__FILTER_TYPE = eINSTANCE.getPartWithCommon_FilterType();

		/**
		 * The meta object literal for the '<em><b>Fx Select</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART_WITH_COMMON__FX_SELECT = eINSTANCE.getPartWithCommon_FxSelect();

		/**
		 * The meta object literal for the '<em><b>Fx Send</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART_WITH_COMMON__FX_SEND = eINSTANCE.getPartWithCommon_FxSend();

		/**
		 * The meta object literal for the '<em><b>Mod Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART_WITH_COMMON__MOD_DEPTH = eINSTANCE.getPartWithCommon_ModDepth();

		/**
		 * The meta object literal for the '<em><b>Mod Dest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART_WITH_COMMON__MOD_DEST = eINSTANCE.getPartWithCommon_ModDest();

		/**
		 * The meta object literal for the '<em><b>Mod Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART_WITH_COMMON__MOD_SPEED = eINSTANCE.getPartWithCommon_ModSpeed();

		/**
		 * The meta object literal for the '<em><b>Mod Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART_WITH_COMMON__MOD_TYPE = eINSTANCE.getPartWithCommon_ModType();

		/**
		 * The meta object literal for the '<em><b>Pan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART_WITH_COMMON__PAN = eINSTANCE.getPartWithCommon_Pan();

		/**
		 * The meta object literal for the '<em><b>Reserved Bit After Mod Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART_WITH_COMMON__RESERVED_BIT_AFTER_MOD_DEPTH = eINSTANCE.getPartWithCommon_ReservedBitAfterModDepth();

		/**
		 * The meta object literal for the '<em><b>Resonance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART_WITH_COMMON__RESONANCE = eINSTANCE.getPartWithCommon_Resonance();

		/**
		 * The meta object literal for the '<em><b>Roll</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART_WITH_COMMON__ROLL = eINSTANCE.getPartWithCommon_Roll();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.PartWithSampleImpl <em>Part With Sample</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.PartWithSampleImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPartWithSample()
		 * @generated
		 */
		EClass PART_WITH_SAMPLE = eINSTANCE.getPartWithSample();

		/**
		 * The meta object literal for the '<em><b>Reverse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART_WITH_SAMPLE__REVERSE = eINSTANCE.getPartWithSample_Reverse();

		/**
		 * The meta object literal for the '<em><b>Sample Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART_WITH_SAMPLE__SAMPLE_LABEL = eINSTANCE.getPartWithSample_SampleLabel();

		/**
		 * The meta object literal for the '<em><b>Sample Pointer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART_WITH_SAMPLE__SAMPLE_POINTER = eINSTANCE.getPartWithSample_SamplePointer();

		/**
		 * The meta object literal for the '<em><b>Start Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART_WITH_SAMPLE__START_POINT = eINSTANCE.getPartWithSample_StartPoint();

		/**
		 * The meta object literal for the '<em><b>Reserved Bits After Reverse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART_WITH_SAMPLE__RESERVED_BITS_AFTER_REVERSE = eINSTANCE.getPartWithSample_ReservedBitsAfterReverse();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.PartWithSliceImpl <em>Part With Slice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.PartWithSliceImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPartWithSlice()
		 * @generated
		 */
		EClass PART_WITH_SLICE = eINSTANCE.getPartWithSlice();

		/**
		 * The meta object literal for the '<em><b>Reserved Byte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART_WITH_SLICE__RESERVED_BYTE = eINSTANCE.getPartWithSlice_ReservedByte();

		/**
		 * The meta object literal for the '<em><b>Slice Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART_WITH_SLICE__SLICE_NUMBER = eINSTANCE.getPartWithSlice_SliceNumber();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.PartWithPitchImpl <em>Part With Pitch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.PartWithPitchImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPartWithPitch()
		 * @generated
		 */
		EClass PART_WITH_PITCH = eINSTANCE.getPartWithPitch();

		/**
		 * The meta object literal for the '<em><b>Pitch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART_WITH_PITCH__PITCH = eINSTANCE.getPartWithPitch_Pitch();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.PartWithSequenceDataGateImpl <em>Part With Sequence Data Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.PartWithSequenceDataGateImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPartWithSequenceDataGate()
		 * @generated
		 */
		EClass PART_WITH_SEQUENCE_DATA_GATE = eINSTANCE.getPartWithSequenceDataGate();

		/**
		 * The meta object literal for the '<em><b>Sequence Data Gate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART_WITH_SEQUENCE_DATA_GATE__SEQUENCE_DATA_GATE = eINSTANCE.getPartWithSequenceDataGate_SequenceDataGate();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.PartAccentImpl <em>Part Accent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.PartAccentImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPartAccent()
		 * @generated
		 */
		EClass PART_ACCENT = eINSTANCE.getPartAccent();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.PartAudioInImpl <em>Part Audio In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.PartAudioInImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPartAudioIn()
		 * @generated
		 */
		EClass PART_AUDIO_IN = eINSTANCE.getPartAudioIn();

		/**
		 * The meta object literal for the '<em><b>Reserved Bits Byte7</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART_AUDIO_IN__RESERVED_BITS_BYTE7 = eINSTANCE.getPartAudioIn_ReservedBitsByte7();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.PartDrumImpl <em>Part Drum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.PartDrumImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPartDrum()
		 * @generated
		 */
		EClass PART_DRUM = eINSTANCE.getPartDrum();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.PartKeyboardImpl <em>Part Keyboard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.PartKeyboardImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPartKeyboard()
		 * @generated
		 */
		EClass PART_KEYBOARD = eINSTANCE.getPartKeyboard();

		/**
		 * The meta object literal for the '<em><b>Glide</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART_KEYBOARD__GLIDE = eINSTANCE.getPartKeyboard_Glide();

		/**
		 * The meta object literal for the '<em><b>Sequence Data Note</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART_KEYBOARD__SEQUENCE_DATA_NOTE = eINSTANCE.getPartKeyboard_SequenceDataNote();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.PartStretchSliceImpl <em>Part Stretch Slice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.PartStretchSliceImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPartStretchSlice()
		 * @generated
		 */
		EClass PART_STRETCH_SLICE = eINSTANCE.getPartStretchSlice();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.PatternImpl <em>Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.PatternImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPattern()
		 * @generated
		 */
		EClass PATTERN = eINSTANCE.getPattern();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__NAME = eINSTANCE.getPattern_Name();

		/**
		 * The meta object literal for the '<em><b>Tempo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__TEMPO = eINSTANCE.getPattern_Tempo();

		/**
		 * The meta object literal for the '<em><b>Swing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__SWING = eINSTANCE.getPattern_Swing();

		/**
		 * The meta object literal for the '<em><b>Pattern Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__PATTERN_LENGTH = eINSTANCE.getPattern_PatternLength();

		/**
		 * The meta object literal for the '<em><b>Reserved Bit After Pattern Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__RESERVED_BIT_AFTER_PATTERN_LENGTH = eINSTANCE.getPattern_ReservedBitAfterPatternLength();

		/**
		 * The meta object literal for the '<em><b>Beat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__BEAT = eINSTANCE.getPattern_Beat();

		/**
		 * The meta object literal for the '<em><b>Roll Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__ROLL_TYPE = eINSTANCE.getPattern_RollType();

		/**
		 * The meta object literal for the '<em><b>Fx Chain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__FX_CHAIN = eINSTANCE.getPattern_FxChain();

		/**
		 * The meta object literal for the '<em><b>Last Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__LAST_STEP = eINSTANCE.getPattern_LastStep();

		/**
		 * The meta object literal for the '<em><b>Arpeggiator Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__ARPEGGIATOR_SCALE = eINSTANCE.getPattern_ArpeggiatorScale();

		/**
		 * The meta object literal for the '<em><b>Reserved Bits After Arpeggiator Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__RESERVED_BITS_AFTER_ARPEGGIATOR_SCALE = eINSTANCE.getPattern_ReservedBitsAfterArpeggiatorScale();

		/**
		 * The meta object literal for the '<em><b>Arpeggiator Center Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__ARPEGGIATOR_CENTER_NOTE = eINSTANCE.getPattern_ArpeggiatorCenterNote();

		/**
		 * The meta object literal for the '<em><b>Mute Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__MUTE_STATUS = eINSTANCE.getPattern_MuteStatus();

		/**
		 * The meta object literal for the '<em><b>Swing Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__SWING_STATUS = eINSTANCE.getPattern_SwingStatus();

		/**
		 * The meta object literal for the '<em><b>Output Bus Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__OUTPUT_BUS_STATUS = eINSTANCE.getPattern_OutputBusStatus();

		/**
		 * The meta object literal for the '<em><b>Accent Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__ACCENT_STATUS = eINSTANCE.getPattern_AccentStatus();

		/**
		 * The meta object literal for the '<em><b>Drum Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__DRUM_PARTS = eINSTANCE.getPattern_DrumParts();

		/**
		 * The meta object literal for the '<em><b>Keyboard Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__KEYBOARD_PARTS = eINSTANCE.getPattern_KeyboardParts();

		/**
		 * The meta object literal for the '<em><b>Stretch Slice Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__STRETCH_SLICE_PARTS = eINSTANCE.getPattern_StretchSliceParts();

		/**
		 * The meta object literal for the '<em><b>Audio In Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__AUDIO_IN_PART = eINSTANCE.getPattern_AudioInPart();

		/**
		 * The meta object literal for the '<em><b>Accent Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__ACCENT_PART = eINSTANCE.getPattern_AccentPart();

		/**
		 * The meta object literal for the '<em><b>Fx Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__FX_PARAMETERS = eINSTANCE.getPattern_FxParameters();

		/**
		 * The meta object literal for the '<em><b>Motion Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__MOTION_PARAMETERS = eINSTANCE.getPattern_MotionParameters();

		/**
		 * The meta object literal for the '<em><b>Empty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__EMPTY = eINSTANCE.getPattern_Empty();

		/**
		 * The meta object literal for the '<em><b>Pattern Number Original</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__PATTERN_NUMBER_ORIGINAL = eINSTANCE.getPattern_PatternNumberOriginal();

		/**
		 * The meta object literal for the '<em><b>Pattern Number Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__PATTERN_NUMBER_CURRENT = eINSTANCE.getPattern_PatternNumberCurrent();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.SampleImpl <em>Sample</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.SampleImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSample()
		 * @generated
		 */
		EClass SAMPLE = eINSTANCE.getSample();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__NAME = eINSTANCE.getSample_Name();

		/**
		 * The meta object literal for the '<em><b>Mem Used In Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__MEM_USED_IN_BYTES = eINSTANCE.getSample_MemUsedInBytes();

		/**
		 * The meta object literal for the '<em><b>Empty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__EMPTY = eINSTANCE.getSample_Empty();

		/**
		 * The meta object literal for the '<em><b>Part Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__PART_COUNT = eINSTANCE.getSample_PartCount();

		/**
		 * The meta object literal for the '<em><b>Pattern Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__PATTERN_COUNT = eINSTANCE.getSample_PatternCount();

		/**
		 * The meta object literal for the '<em><b>Sample In Pattern Info List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLE__SAMPLE_IN_PATTERN_INFO_LIST = eINSTANCE.getSample_SampleInPatternInfoList();

		/**
		 * The meta object literal for the '<em><b>Offset Channel1 Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__OFFSET_CHANNEL1_START = eINSTANCE.getSample_OffsetChannel1Start();

		/**
		 * The meta object literal for the '<em><b>Offset Channel1 End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__OFFSET_CHANNEL1_END = eINSTANCE.getSample_OffsetChannel1End();

		/**
		 * The meta object literal for the '<em><b>Offset Channel2 Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__OFFSET_CHANNEL2_START = eINSTANCE.getSample_OffsetChannel2Start();

		/**
		 * The meta object literal for the '<em><b>Offset Channel2 End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__OFFSET_CHANNEL2_END = eINSTANCE.getSample_OffsetChannel2End();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__START = eINSTANCE.getSample_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__END = eINSTANCE.getSample_End();

		/**
		 * The meta object literal for the '<em><b>Loop Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__LOOP_START = eINSTANCE.getSample_LoopStart();

		/**
		 * The meta object literal for the '<em><b>Sample Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__SAMPLE_RATE = eINSTANCE.getSample_SampleRate();

		/**
		 * The meta object literal for the '<em><b>Sample Tune</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLE__SAMPLE_TUNE = eINSTANCE.getSample_SampleTune();

		/**
		 * The meta object literal for the '<em><b>Number Of Sample Frames</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__NUMBER_OF_SAMPLE_FRAMES = eINSTANCE.getSample_NumberOfSampleFrames();

		/**
		 * The meta object literal for the '<em><b>Play Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__PLAY_LEVEL = eINSTANCE.getSample_PlayLevel();

		/**
		 * The meta object literal for the '<em><b>Stretch Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__STRETCH_STEP = eINSTANCE.getSample_StretchStep();

		/**
		 * The meta object literal for the '<em><b>Unknown Byte Mono1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__UNKNOWN_BYTE_MONO1 = eINSTANCE.getSample_UnknownByteMono1();

		/**
		 * The meta object literal for the '<em><b>Unknown Byte Mono2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__UNKNOWN_BYTE_MONO2 = eINSTANCE.getSample_UnknownByteMono2();

		/**
		 * The meta object literal for the '<em><b>Unknown Byte Mono3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__UNKNOWN_BYTE_MONO3 = eINSTANCE.getSample_UnknownByteMono3();

		/**
		 * The meta object literal for the '<em><b>Unknown Byte Mono4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__UNKNOWN_BYTE_MONO4 = eINSTANCE.getSample_UnknownByteMono4();

		/**
		 * The meta object literal for the '<em><b>Unknown Byte Stereo1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__UNKNOWN_BYTE_STEREO1 = eINSTANCE.getSample_UnknownByteStereo1();

		/**
		 * The meta object literal for the '<em><b>Unknown Byte Stereo2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__UNKNOWN_BYTE_STEREO2 = eINSTANCE.getSample_UnknownByteStereo2();

		/**
		 * The meta object literal for the '<em><b>Unknown Byte Stereo3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__UNKNOWN_BYTE_STEREO3 = eINSTANCE.getSample_UnknownByteStereo3();

		/**
		 * The meta object literal for the '<em><b>Unknown Byte Stereo4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__UNKNOWN_BYTE_STEREO4 = eINSTANCE.getSample_UnknownByteStereo4();

		/**
		 * The meta object literal for the '<em><b>Audio Data Channel1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__AUDIO_DATA_CHANNEL1 = eINSTANCE.getSample_AudioDataChannel1();

		/**
		 * The meta object literal for the '<em><b>Audio Data Channel2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__AUDIO_DATA_CHANNEL2 = eINSTANCE.getSample_AudioDataChannel2();

		/**
		 * The meta object literal for the '<em><b>Audio Data Channel Both</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__AUDIO_DATA_CHANNEL_BOTH = eINSTANCE.getSample_AudioDataChannelBoth();

		/**
		 * The meta object literal for the '<em><b>Audio Data Loop Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__AUDIO_DATA_LOOP_START = eINSTANCE.getSample_AudioDataLoopStart();

		/**
		 * The meta object literal for the '<em><b>Slice Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__SLICE_ARRAY = eINSTANCE.getSample_SliceArray();

		/**
		 * The meta object literal for the '<em><b>Sample Number Original</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__SAMPLE_NUMBER_ORIGINAL = eINSTANCE.getSample_SampleNumberOriginal();

		/**
		 * The meta object literal for the '<em><b>Sample Number Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__SAMPLE_NUMBER_CURRENT = eINSTANCE.getSample_SampleNumberCurrent();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.SampleInPatternInfoImpl <em>Sample In Pattern Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.SampleInPatternInfoImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSampleInPatternInfo()
		 * @generated
		 */
		EClass SAMPLE_IN_PATTERN_INFO = eINSTANCE.getSampleInPatternInfo();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE_IN_PATTERN_INFO__INDEX = eINSTANCE.getSampleInPatternInfo_Index();

		/**
		 * The meta object literal for the '<em><b>Pattern Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE_IN_PATTERN_INFO__PATTERN_NUMBER = eINSTANCE.getSampleInPatternInfo_PatternNumber();

		/**
		 * The meta object literal for the '<em><b>Part Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE_IN_PATTERN_INFO__PART_COUNT = eINSTANCE.getSampleInPatternInfo_PartCount();

		/**
		 * The meta object literal for the '<em><b>Part List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE_IN_PATTERN_INFO__PART_LIST = eINSTANCE.getSampleInPatternInfo_PartList();

		/**
		 * The meta object literal for the '<em><b>Loop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__LOOP = eINSTANCE.getSample_Loop();

		/**
		 * The meta object literal for the '<em><b>Slice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__SLICE = eINSTANCE.getSample_Slice();

		/**
		 * The meta object literal for the '<em><b>Stereo Original</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__STEREO_ORIGINAL = eINSTANCE.getSample_StereoOriginal();

		/**
		 * The meta object literal for the '<em><b>Stereo Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__STEREO_CURRENT = eINSTANCE.getSample_StereoCurrent();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__LABEL = eINSTANCE.getSample_Label();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.SampleTuneImpl <em>Sample Tune</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.SampleTuneImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSampleTune()
		 * @generated
		 */
		EClass SAMPLE_TUNE = eINSTANCE.getSampleTune();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE_TUNE__VALUE = eINSTANCE.getSampleTune_Value();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.SongImpl <em>Song</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.SongImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSong()
		 * @generated
		 */
		EClass SONG = eINSTANCE.getSong();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONG__NAME = eINSTANCE.getSong_Name();

		/**
		 * The meta object literal for the '<em><b>Tempo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SONG__TEMPO = eINSTANCE.getSong_Tempo();

		/**
		 * The meta object literal for the '<em><b>Tempo Lock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONG__TEMPO_LOCK = eINSTANCE.getSong_TempoLock();

		/**
		 * The meta object literal for the '<em><b>Song Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONG__SONG_LENGTH = eINSTANCE.getSong_SongLength();

		/**
		 * The meta object literal for the '<em><b>Mute Hold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONG__MUTE_HOLD = eINSTANCE.getSong_MuteHold();

		/**
		 * The meta object literal for the '<em><b>Next Song Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONG__NEXT_SONG_NUMBER = eINSTANCE.getSong_NextSongNumber();

		/**
		 * The meta object literal for the '<em><b>Number Of Song Events Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONG__NUMBER_OF_SONG_EVENTS_CURRENT = eINSTANCE.getSong_NumberOfSongEventsCurrent();

		/**
		 * The meta object literal for the '<em><b>Number Of Song Events Original</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONG__NUMBER_OF_SONG_EVENTS_ORIGINAL = eINSTANCE.getSong_NumberOfSongEventsOriginal();

		/**
		 * The meta object literal for the '<em><b>Song Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SONG__SONG_PATTERNS = eINSTANCE.getSong_SongPatterns();

		/**
		 * The meta object literal for the '<em><b>Song Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SONG__SONG_EVENTS = eINSTANCE.getSong_SongEvents();

		/**
		 * The meta object literal for the '<em><b>Empty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONG__EMPTY = eINSTANCE.getSong_Empty();

		/**
		 * The meta object literal for the '<em><b>Song Number Original</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONG__SONG_NUMBER_ORIGINAL = eINSTANCE.getSong_SongNumberOriginal();

		/**
		 * The meta object literal for the '<em><b>Song Number Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONG__SONG_NUMBER_CURRENT = eINSTANCE.getSong_SongNumberCurrent();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.SongPatternImpl <em>Song Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.SongPatternImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSongPattern()
		 * @generated
		 */
		EClass SONG_PATTERN = eINSTANCE.getSongPattern();

		/**
		 * The meta object literal for the '<em><b>Pattern Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONG_PATTERN__PATTERN_NUMBER = eINSTANCE.getSongPattern_PatternNumber();

		/**
		 * The meta object literal for the '<em><b>Position Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONG_PATTERN__POSITION_CURRENT = eINSTANCE.getSongPattern_PositionCurrent();

		/**
		 * The meta object literal for the '<em><b>Note Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONG_PATTERN__NOTE_OFFSET = eINSTANCE.getSongPattern_NoteOffset();

		/**
		 * The meta object literal for the '<em><b>Empty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONG_PATTERN__EMPTY = eINSTANCE.getSongPattern_Empty();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.TempoImpl <em>Tempo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.TempoImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getTempo()
		 * @generated
		 */
		EClass TEMPO = eINSTANCE.getTempo();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPO__VALUE = eINSTANCE.getTempo_Value();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.SongEventImpl <em>Song Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.SongEventImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSongEvent()
		 * @generated
		 */
		EClass SONG_EVENT = eINSTANCE.getSongEvent();

		/**
		 * The meta object literal for the '<em><b>Current Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONG_EVENT__CURRENT_POSITION = eINSTANCE.getSongEvent_CurrentPosition();

		/**
		 * The meta object literal for the '<em><b>Event Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONG_EVENT__EVENT_INFO = eINSTANCE.getSongEvent_EventInfo();

		/**
		 * The meta object literal for the '<em><b>Event Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONG_EVENT__EVENT_TYPE = eINSTANCE.getSongEvent_EventType();

		/**
		 * The meta object literal for the '<em><b>Measure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONG_EVENT__MEASURE = eINSTANCE.getSongEvent_Measure();

		/**
		 * The meta object literal for the '<em><b>Operation Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONG_EVENT__OPERATION_NUMBER = eINSTANCE.getSongEvent_OperationNumber();

		/**
		 * The meta object literal for the '<em><b>Position Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONG_EVENT__POSITION_NUMBER = eINSTANCE.getSongEvent_PositionNumber();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONG_EVENT__STEP = eINSTANCE.getSongEvent_Step();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.SongEventWithPartImpl <em>Song Event With Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.SongEventWithPartImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSongEventWithPart()
		 * @generated
		 */
		EClass SONG_EVENT_WITH_PART = eINSTANCE.getSongEventWithPart();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONG_EVENT_WITH_PART__PART = eINSTANCE.getSongEventWithPart_Part();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.SongEventControlImpl <em>Song Event Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.SongEventControlImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSongEventControl()
		 * @generated
		 */
		EClass SONG_EVENT_CONTROL = eINSTANCE.getSongEventControl();

		/**
		 * The meta object literal for the '<em><b>Operation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONG_EVENT_CONTROL__OPERATION_TYPE = eINSTANCE.getSongEventControl_OperationType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONG_EVENT_CONTROL__VALUE = eINSTANCE.getSongEventControl_Value();

		/**
		 * The meta object literal for the '<em><b>Reserved Byte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONG_EVENT_CONTROL__RESERVED_BYTE = eINSTANCE.getSongEventControl_ReservedByte();

		/**
		 * The meta object literal for the '<em><b>Reserved Short</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONG_EVENT_CONTROL__RESERVED_SHORT = eINSTANCE.getSongEventControl_ReservedShort();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.SongEventDrumNoteImpl <em>Song Event Drum Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.SongEventDrumNoteImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSongEventDrumNote()
		 * @generated
		 */
		EClass SONG_EVENT_DRUM_NOTE = eINSTANCE.getSongEventDrumNote();

		/**
		 * The meta object literal for the '<em><b>Reserved Byte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONG_EVENT_DRUM_NOTE__RESERVED_BYTE = eINSTANCE.getSongEventDrumNote_ReservedByte();

		/**
		 * The meta object literal for the '<em><b>Reserved Short</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONG_EVENT_DRUM_NOTE__RESERVED_SHORT = eINSTANCE.getSongEventDrumNote_ReservedShort();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.SongEventKeyboardNoteImpl <em>Song Event Keyboard Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.SongEventKeyboardNoteImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSongEventKeyboardNote()
		 * @generated
		 */
		EClass SONG_EVENT_KEYBOARD_NOTE = eINSTANCE.getSongEventKeyboardNote();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONG_EVENT_KEYBOARD_NOTE__LENGTH = eINSTANCE.getSongEventKeyboardNote_Length();

		/**
		 * The meta object literal for the '<em><b>Note Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONG_EVENT_KEYBOARD_NOTE__NOTE_NUMBER = eINSTANCE.getSongEventKeyboardNote_NoteNumber();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.SongEventTempoImpl <em>Song Event Tempo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.SongEventTempoImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSongEventTempo()
		 * @generated
		 */
		EClass SONG_EVENT_TEMPO = eINSTANCE.getSongEventTempo();

		/**
		 * The meta object literal for the '<em><b>Tempo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SONG_EVENT_TEMPO__TEMPO = eINSTANCE.getSongEventTempo_Tempo();

		/**
		 * The meta object literal for the '<em><b>Reserved Short</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONG_EVENT_TEMPO__RESERVED_SHORT = eINSTANCE.getSongEventTempo_ReservedShort();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.impl.SongEventMuteStatusImpl <em>Song Event Mute Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.impl.SongEventMuteStatusImpl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSongEventMuteStatus()
		 * @generated
		 */
		EClass SONG_EVENT_MUTE_STATUS = eINSTANCE.getSongEventMuteStatus();

		/**
		 * The meta object literal for the '<em><b>Reserved Short</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONG_EVENT_MUTE_STATUS__RESERVED_SHORT = eINSTANCE.getSongEventMuteStatus_ReservedShort();

		/**
		 * The meta object literal for the '<em><b>Mute Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONG_EVENT_MUTE_STATUS__MUTE_STATUS = eINSTANCE.getSongEventMuteStatus_MuteStatus();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.ArpeggiatorControl <em>Arpeggiator Control</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.ArpeggiatorControl
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getArpeggiatorControl()
		 * @generated
		 */
		EEnum ARPEGGIATOR_CONTROL = eINSTANCE.getArpeggiatorControl();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.AudioInMode <em>Audio In Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.AudioInMode
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getAudioInMode()
		 * @generated
		 */
		EEnum AUDIO_IN_MODE = eINSTANCE.getAudioInMode();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.MidiClock <em>Midi Clock</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.MidiClock
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getMidiClock()
		 * @generated
		 */
		EEnum MIDI_CLOCK = eINSTANCE.getMidiClock();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.MidiControlChangeAssignmentName <em>Midi Control Change Assignment Name</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.MidiControlChangeAssignmentName
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getMidiControlChangeAssignmentName()
		 * @generated
		 */
		EEnum MIDI_CONTROL_CHANGE_ASSIGNMENT_NAME = eINSTANCE.getMidiControlChangeAssignmentName();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.EnabledFlag <em>Enabled Flag</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.EnabledFlag
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getEnabledFlag()
		 * @generated
		 */
		EEnum ENABLED_FLAG = eINSTANCE.getEnabledFlag();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.PitchBendRange <em>Pitch Bend Range</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.PitchBendRange
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPitchBendRange()
		 * @generated
		 */
		EEnum PITCH_BEND_RANGE = eINSTANCE.getPitchBendRange();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.MidiChannel <em>Midi Channel</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.MidiChannel
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getMidiChannel()
		 * @generated
		 */
		EEnum MIDI_CHANNEL = eINSTANCE.getMidiChannel();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.MidiChannelTypeName <em>Midi Channel Type Name</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.MidiChannelTypeName
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getMidiChannelTypeName()
		 * @generated
		 */
		EEnum MIDI_CHANNEL_TYPE_NAME = eINSTANCE.getMidiChannelTypeName();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.PlayLevel <em>Play Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.PlayLevel
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPlayLevel()
		 * @generated
		 */
		EEnum PLAY_LEVEL = eINSTANCE.getPlayLevel();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.PatternNumber <em>Pattern Number</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.PatternNumber
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPatternNumber()
		 * @generated
		 */
		EEnum PATTERN_NUMBER = eINSTANCE.getPatternNumber();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.SampleNumber <em>Sample Number</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.SampleNumber
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSampleNumber()
		 * @generated
		 */
		EEnum SAMPLE_NUMBER = eINSTANCE.getSampleNumber();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.SongEventPart <em>Song Event Part</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.SongEventPart
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSongEventPart()
		 * @generated
		 */
		EEnum SONG_EVENT_PART = eINSTANCE.getSongEventPart();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.SongNumber <em>Song Number</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.SongNumber
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSongNumber()
		 * @generated
		 */
		EEnum SONG_NUMBER = eINSTANCE.getSongNumber();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.SongLength <em>Song Length</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.SongLength
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSongLength()
		 * @generated
		 */
		EEnum SONG_LENGTH = eINSTANCE.getSongLength();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.TempoLock <em>Tempo Lock</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.TempoLock
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getTempoLock()
		 * @generated
		 */
		EEnum TEMPO_LOCK = eINSTANCE.getTempoLock();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.MuteHold <em>Mute Hold</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.MuteHold
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getMuteHold()
		 * @generated
		 */
		EEnum MUTE_HOLD = eINSTANCE.getMuteHold();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.NextSongNumber <em>Next Song Number</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.NextSongNumber
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getNextSongNumber()
		 * @generated
		 */
		EEnum NEXT_SONG_NUMBER = eINSTANCE.getNextSongNumber();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.StretchStep <em>Stretch Step</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.StretchStep
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getStretchStep()
		 * @generated
		 */
		EEnum STRETCH_STEP = eINSTANCE.getStretchStep();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.Swing <em>Swing</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.Swing
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getSwing()
		 * @generated
		 */
		EEnum SWING = eINSTANCE.getSwing();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.PatternLength <em>Pattern Length</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.PatternLength
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPatternLength()
		 * @generated
		 */
		EEnum PATTERN_LENGTH = eINSTANCE.getPatternLength();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.Beat <em>Beat</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.Beat
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getBeat()
		 * @generated
		 */
		EEnum BEAT = eINSTANCE.getBeat();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.RollType <em>Roll Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.RollType
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getRollType()
		 * @generated
		 */
		EEnum ROLL_TYPE = eINSTANCE.getRollType();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.FxChain <em>Fx Chain</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.FxChain
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getFxChain()
		 * @generated
		 */
		EEnum FX_CHAIN = eINSTANCE.getFxChain();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.LastStep <em>Last Step</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.LastStep
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getLastStep()
		 * @generated
		 */
		EEnum LAST_STEP = eINSTANCE.getLastStep();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.ArpeggiatorScale <em>Arpeggiator Scale</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.ArpeggiatorScale
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getArpeggiatorScale()
		 * @generated
		 */
		EEnum ARPEGGIATOR_SCALE = eINSTANCE.getArpeggiatorScale();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.AudioChannelType <em>Audio Channel Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.AudioChannelType
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getAudioChannelType()
		 * @generated
		 */
		EEnum AUDIO_CHANNEL_TYPE = eINSTANCE.getAudioChannelType();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.NoteNumber <em>Note Number</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.NoteNumber
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getNoteNumber()
		 * @generated
		 */
		EEnum NOTE_NUMBER = eINSTANCE.getNoteNumber();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.OperationType <em>Operation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.OperationType
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getOperationType()
		 * @generated
		 */
		EEnum OPERATION_TYPE = eINSTANCE.getOperationType();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.PartNoteNumberName <em>Part Note Number Name</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.PartNoteNumberName
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getPartNoteNumberName()
		 * @generated
		 */
		EEnum PART_NOTE_NUMBER_NAME = eINSTANCE.getPartNoteNumberName();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.FilterType <em>Filter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.FilterType
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getFilterType()
		 * @generated
		 */
		EEnum FILTER_TYPE = eINSTANCE.getFilterType();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.FxSelect <em>Fx Select</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.FxSelect
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getFxSelect()
		 * @generated
		 */
		EEnum FX_SELECT = eINSTANCE.getFxSelect();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.FxSend <em>Fx Send</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.FxSend
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getFxSend()
		 * @generated
		 */
		EEnum FX_SEND = eINSTANCE.getFxSend();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.FxType <em>Fx Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.FxType
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getFxType()
		 * @generated
		 */
		EEnum FX_TYPE = eINSTANCE.getFxType();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.Roll <em>Roll</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.Roll
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getRoll()
		 * @generated
		 */
		EEnum ROLL = eINSTANCE.getRoll();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.AmpEg <em>Amp Eg</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.AmpEg
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getAmpEg()
		 * @generated
		 */
		EEnum AMP_EG = eINSTANCE.getAmpEg();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.Reverse <em>Reverse</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.Reverse
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getReverse()
		 * @generated
		 */
		EEnum REVERSE = eINSTANCE.getReverse();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.ModDest <em>Mod Dest</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.ModDest
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getModDest()
		 * @generated
		 */
		EEnum MOD_DEST = eINSTANCE.getModDest();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.ModType <em>Mod Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.ModType
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getModType()
		 * @generated
		 */
		EEnum MOD_TYPE = eINSTANCE.getModType();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.BpmSync <em>Bpm Sync</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.BpmSync
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getBpmSync()
		 * @generated
		 */
		EEnum BPM_SYNC = eINSTANCE.getBpmSync();

		/**
		 * The meta object literal for the '{@link com.skratchdot.electribe.model.esx.MotionSequenceStatus <em>Motion Sequence Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.electribe.model.esx.MotionSequenceStatus
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getMotionSequenceStatus()
		 * @generated
		 */
		EEnum MOTION_SEQUENCE_STATUS = eINSTANCE.getMotionSequenceStatus();

		/**
		 * The meta object literal for the '<em>Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getObject()
		 * @generated
		 */
		EDataType OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em>RIFF Wave</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.riff.wav.RIFFWave
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getRIFFWave()
		 * @generated
		 */
		EDataType RIFF_WAVE = eINSTANCE.getRIFFWave();

		/**
		 * The meta object literal for the '<em>Array List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.ArrayList
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getArrayList()
		 * @generated
		 */
		EDataType ARRAY_LIST = eINSTANCE.getArrayList();

		/**
		 * The meta object literal for the '<em>File</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.File
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getFile()
		 * @generated
		 */
		EDataType FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em>Input Stream</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.InputStream
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getInputStream()
		 * @generated
		 */
		EDataType INPUT_STREAM = eINSTANCE.getInputStream();

		/**
		 * The meta object literal for the '<em>Index Out Of Bounds Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.IndexOutOfBoundsException
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getIndexOutOfBoundsException()
		 * @generated
		 */
		EDataType INDEX_OUT_OF_BOUNDS_EXCEPTION = eINSTANCE.getIndexOutOfBoundsException();

		/**
		 * The meta object literal for the '<em>IO Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.IOException
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getIOException()
		 * @generated
		 */
		EDataType IO_EXCEPTION = eINSTANCE.getIOException();

		/**
		 * The meta object literal for the '<em>IProgress Monitor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.runtime.IProgressMonitor
		 * @see com.skratchdot.electribe.model.esx.impl.EsxPackageImpl#getIProgressMonitor()
		 * @generated
		 */
		EDataType IPROGRESS_MONITOR = eINSTANCE.getIProgressMonitor();

	}

} //EsxPackage

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
package com.skratchdot.riff.wav;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Chunk Type ID</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.skratchdot.riff.wav.WavPackage#getChunkTypeID()
 * @model
 * @generated
 */
public enum ChunkTypeID implements Enumerator {
	/**
	 * The '<em><b>UNKNOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(-1, "UNKNOWN", "Unknown Chunk"),

	/**
	 * The '<em><b>RIFF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIFF_VALUE
	 * @generated
	 * @ordered
	 */
	RIFF(1179011410, "RIFF", "RIFF Header Chunk - 'RIFF'"), /**
															* The '<em><b>WAVE</b></em>' literal object.
															* <!-- begin-user-doc -->
															* <!-- end-user-doc -->
															* @see #WAVE_VALUE
															* @generated
															* @ordered
															*/
	WAVE(1163280727, "WAVE", "WAVE Header Chunk - 'WAVE'"), /**
															* The '<em><b>CUE </b></em>' literal object.
															* <!-- begin-user-doc -->
															* <!-- end-user-doc -->
															* @see #CUE__VALUE
															* @generated
															* @ordered
															*/
	CUE_(543520099, "CUE_", "Cue Chunk - 'cue '"), /**
													* The '<em><b>DATA</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #DATA_VALUE
													* @generated
													* @ordered
													*/
	DATA(1635017060, "DATA", "Data Chunk - 'data'"),

	/**
	 * The '<em><b>FACT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FACT_VALUE
	 * @generated
	 * @ordered
	 */
	FACT(1952670054, "FACT", "Fact Chunk - 'fact'"),

	/**
	 * The '<em><b>FMT </b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FMT__VALUE
	 * @generated
	 * @ordered
	 */
	FMT_(544501094, "FMT_", "Format Chunk - 'fmt '"), /**
														* The '<em><b>INST</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #INST_VALUE
														* @generated
														* @ordered
														*/
	INST(1953721961, "INST", "Instrument Chunk - 'inst'"), /**
															* The '<em><b>LABL</b></em>' literal object.
															* <!-- begin-user-doc -->
															* <!-- end-user-doc -->
															* @see #LABL_VALUE
															* @generated
															* @ordered
															*/
	LABL(1818386796, "LABL", "Label Chunk - 'labl'"), /**
														* The '<em><b>LIST</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #LIST_VALUE
														* @generated
														* @ordered
														*/
	LIST(1953720684, "LIST", "Data List Chunk - 'list'"), /**
															* The '<em><b>LTXT</b></em>' literal object.
															* <!-- begin-user-doc -->
															* <!-- end-user-doc -->
															* @see #LTXT_VALUE
															* @generated
															* @ordered
															*/
	LTXT(1954051180, "LTXT", "Labeled Text Chunk - 'ltxt'"), /**
																* The '<em><b>NOTE</b></em>' literal object.
																* <!-- begin-user-doc -->
																* <!-- end-user-doc -->
																* @see #NOTE_VALUE
																* @generated
																* @ordered
																*/
	NOTE(1702129518, "NOTE", "Note Chunk - 'note'"),

	/**
	 * The '<em><b>PLST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLST_VALUE
	 * @generated
	 * @ordered
	 */
	PLST(1953721456, "PLST", "Playlist Chunk - 'plst'"), /**
															* The '<em><b>SINT</b></em>' literal object.
															* <!-- begin-user-doc -->
															* <!-- end-user-doc -->
															* @see #SINT_VALUE
															* @generated
															* @ordered
															*/
	SINT(1953393779, "SINT", "Silent Chunk - 'slnt'"), /**
														* The '<em><b>SMPL</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #SMPL_VALUE
														* @generated
														* @ordered
														*/
	SMPL(1819307379, "SMPL", "Sampler Chunk - 'smpl'"), /**
														* The '<em><b>WAVL</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #WAVL_VALUE
														* @generated
														* @ordered
														*/
	WAVL(1819697527, "WAVL", "Wave List Chunk - 'wavl'");

	/**
	 * The '<em><b>UNKNOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNKNOWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model literal="Unknown Chunk"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = -1;

	/**
	 * The '<em><b>RIFF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RIFF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RIFF
	 * @model literal="RIFF Header Chunk - 'RIFF'"
	 * @generated
	 * @ordered
	 */
	public static final int RIFF_VALUE = 1179011410;

	/**
	 * The '<em><b>WAVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WAVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WAVE
	 * @model literal="WAVE Header Chunk - 'WAVE'"
	 * @generated
	 * @ordered
	 */
	public static final int WAVE_VALUE = 1163280727;

	/**
	 * The '<em><b>CUE </b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUE </b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUE_
	 * @model literal="Cue Chunk - 'cue '"
	 * @generated
	 * @ordered
	 */
	public static final int CUE__VALUE = 543520099;

	/**
	 * The '<em><b>DATA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DATA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATA
	 * @model literal="Data Chunk - 'data'"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_VALUE = 1635017060;

	/**
	 * The '<em><b>FACT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FACT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FACT
	 * @model literal="Fact Chunk - 'fact'"
	 * @generated
	 * @ordered
	 */
	public static final int FACT_VALUE = 1952670054;

	/**
	 * The '<em><b>FMT </b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FMT </b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FMT_
	 * @model literal="Format Chunk - 'fmt '"
	 * @generated
	 * @ordered
	 */
	public static final int FMT__VALUE = 544501094;

	/**
	 * The '<em><b>INST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INST
	 * @model literal="Instrument Chunk - 'inst'"
	 * @generated
	 * @ordered
	 */
	public static final int INST_VALUE = 1953721961;

	/**
	 * The '<em><b>LABL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LABL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LABL
	 * @model literal="Label Chunk - 'labl'"
	 * @generated
	 * @ordered
	 */
	public static final int LABL_VALUE = 1818386796;

	/**
	 * The '<em><b>LIST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LIST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIST
	 * @model literal="Data List Chunk - 'list'"
	 * @generated
	 * @ordered
	 */
	public static final int LIST_VALUE = 1953720684;

	/**
	 * The '<em><b>LTXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LTXT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LTXT
	 * @model literal="Labeled Text Chunk - 'ltxt'"
	 * @generated
	 * @ordered
	 */
	public static final int LTXT_VALUE = 1954051180;

	/**
	 * The '<em><b>NOTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOTE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTE
	 * @model literal="Note Chunk - 'note'"
	 * @generated
	 * @ordered
	 */
	public static final int NOTE_VALUE = 1702129518;

	/**
	 * The '<em><b>PLST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PLST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLST
	 * @model literal="Playlist Chunk - 'plst'"
	 * @generated
	 * @ordered
	 */
	public static final int PLST_VALUE = 1953721456;

	/**
	 * The '<em><b>SINT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SINT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SINT
	 * @model literal="Silent Chunk - 'slnt'"
	 * @generated
	 * @ordered
	 */
	public static final int SINT_VALUE = 1953393779;

	/**
	 * The '<em><b>SMPL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SMPL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMPL
	 * @model literal="Sampler Chunk - 'smpl'"
	 * @generated
	 * @ordered
	 */
	public static final int SMPL_VALUE = 1819307379;

	/**
	 * The '<em><b>WAVL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WAVL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WAVL
	 * @model literal="Wave List Chunk - 'wavl'"
	 * @generated
	 * @ordered
	 */
	public static final int WAVL_VALUE = 1819697527;

	/**
	 * An array of all the '<em><b>Chunk Type ID</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ChunkTypeID[] VALUES_ARRAY = new ChunkTypeID[] {
			UNKNOWN, RIFF, WAVE, CUE_, DATA, FACT, FMT_, INST, LABL, LIST,
			LTXT, NOTE, PLST, SINT, SMPL, WAVL, };

	/**
	 * A public read-only list of all the '<em><b>Chunk Type ID</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ChunkTypeID> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Chunk Type ID</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChunkTypeID get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChunkTypeID result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Chunk Type ID</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChunkTypeID getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChunkTypeID result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Chunk Type ID</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChunkTypeID get(int value) {
		switch (value) {
		case UNKNOWN_VALUE:
			return UNKNOWN;
		case RIFF_VALUE:
			return RIFF;
		case WAVE_VALUE:
			return WAVE;
		case CUE__VALUE:
			return CUE_;
		case DATA_VALUE:
			return DATA;
		case FACT_VALUE:
			return FACT;
		case FMT__VALUE:
			return FMT_;
		case INST_VALUE:
			return INST;
		case LABL_VALUE:
			return LABL;
		case LIST_VALUE:
			return LIST;
		case LTXT_VALUE:
			return LTXT;
		case NOTE_VALUE:
			return NOTE;
		case PLST_VALUE:
			return PLST;
		case SINT_VALUE:
			return SINT;
		case SMPL_VALUE:
			return SMPL;
		case WAVL_VALUE:
			return WAVL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ChunkTypeID(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //ChunkTypeID

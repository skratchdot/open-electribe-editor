/*******************************************************************************
 * Copyright (c) 2009-2013 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 *******************************************************************************/
package com.skratchdot.electribe.model.esx;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Fx Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getFxType()
 * @model
 * @generated
 */
public enum FxType implements Enumerator {
	/**
	 * The '<em><b>REVERB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVERB_VALUE
	 * @generated
	 * @ordered
	 */
	REVERB(0, "REVERB", "Reverb"),

	/**
	 * The '<em><b>BPM SYNC DELAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BPM_SYNC_DELAY_VALUE
	 * @generated
	 * @ordered
	 */
	BPM_SYNC_DELAY(1, "BPM_SYNC_DELAY", "BPM Sync Delay"),

	/**
	 * The '<em><b>SHORT DELAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHORT_DELAY_VALUE
	 * @generated
	 * @ordered
	 */
	SHORT_DELAY(2, "SHORT_DELAY", "Short Delay"),

	/**
	 * The '<em><b>MOD DELAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOD_DELAY_VALUE
	 * @generated
	 * @ordered
	 */
	MOD_DELAY(3, "MOD_DELAY", "Mod Delay"),

	/**
	 * The '<em><b>GRAIN SHIFTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAIN_SHIFTER_VALUE
	 * @generated
	 * @ordered
	 */
	GRAIN_SHIFTER(4, "GRAIN_SHIFTER", "Grain Shifter"),

	/**
	 * The '<em><b>CHO FLG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHO_FLG_VALUE
	 * @generated
	 * @ordered
	 */
	CHO_FLG(5, "CHO_FLG", "Cho/Flg"),

	/**
	 * The '<em><b>PHASER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHASER_VALUE
	 * @generated
	 * @ordered
	 */
	PHASER(6, "PHASER", "Phaser"),

	/**
	 * The '<em><b>RING MOD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RING_MOD_VALUE
	 * @generated
	 * @ordered
	 */
	RING_MOD(7, "RING_MOD", "Ring Mod"),

	/**
	 * The '<em><b>TALKING MOD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TALKING_MOD_VALUE
	 * @generated
	 * @ordered
	 */
	TALKING_MOD(8, "TALKING_MOD", "Talking Mod"),

	/**
	 * The '<em><b>PITCH SHIFTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PITCH_SHIFTER_VALUE
	 * @generated
	 * @ordered
	 */
	PITCH_SHIFTER(9, "PITCH_SHIFTER", "Pitch Shifter"),

	/**
	 * The '<em><b>COMPRESSOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPRESSOR_VALUE
	 * @generated
	 * @ordered
	 */
	COMPRESSOR(10, "COMPRESSOR", "Compressor"),

	/**
	 * The '<em><b>DISTORTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTORTION_VALUE
	 * @generated
	 * @ordered
	 */
	DISTORTION(11, "DISTORTION", "Distortion"),

	/**
	 * The '<em><b>DECIMATOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECIMATOR_VALUE
	 * @generated
	 * @ordered
	 */
	DECIMATOR(12, "DECIMATOR", "Decimator"),

	/**
	 * The '<em><b>EQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQ_VALUE
	 * @generated
	 * @ordered
	 */
	EQ(13, "EQ", "EQ"),

	/**
	 * The '<em><b>LPF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LPF_VALUE
	 * @generated
	 * @ordered
	 */
	LPF(14, "LPF", "LPF"),

	/**
	 * The '<em><b>HPF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPF_VALUE
	 * @generated
	 * @ordered
	 */
	HPF(15, "HPF", "HPF");

	/**
	 * The '<em><b>REVERB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REVERB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REVERB
	 * @model literal="Reverb"
	 * @generated
	 * @ordered
	 */
	public static final int REVERB_VALUE = 0;

	/**
	 * The '<em><b>BPM SYNC DELAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BPM SYNC DELAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BPM_SYNC_DELAY
	 * @model literal="BPM Sync Delay"
	 * @generated
	 * @ordered
	 */
	public static final int BPM_SYNC_DELAY_VALUE = 1;

	/**
	 * The '<em><b>SHORT DELAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHORT DELAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHORT_DELAY
	 * @model literal="Short Delay"
	 * @generated
	 * @ordered
	 */
	public static final int SHORT_DELAY_VALUE = 2;

	/**
	 * The '<em><b>MOD DELAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOD DELAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOD_DELAY
	 * @model literal="Mod Delay"
	 * @generated
	 * @ordered
	 */
	public static final int MOD_DELAY_VALUE = 3;

	/**
	 * The '<em><b>GRAIN SHIFTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GRAIN SHIFTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRAIN_SHIFTER
	 * @model literal="Grain Shifter"
	 * @generated
	 * @ordered
	 */
	public static final int GRAIN_SHIFTER_VALUE = 4;

	/**
	 * The '<em><b>CHO FLG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHO FLG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHO_FLG
	 * @model literal="Cho/Flg"
	 * @generated
	 * @ordered
	 */
	public static final int CHO_FLG_VALUE = 5;

	/**
	 * The '<em><b>PHASER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PHASER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHASER
	 * @model literal="Phaser"
	 * @generated
	 * @ordered
	 */
	public static final int PHASER_VALUE = 6;

	/**
	 * The '<em><b>RING MOD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RING MOD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RING_MOD
	 * @model literal="Ring Mod"
	 * @generated
	 * @ordered
	 */
	public static final int RING_MOD_VALUE = 7;

	/**
	 * The '<em><b>TALKING MOD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TALKING MOD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TALKING_MOD
	 * @model literal="Talking Mod"
	 * @generated
	 * @ordered
	 */
	public static final int TALKING_MOD_VALUE = 8;

	/**
	 * The '<em><b>PITCH SHIFTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PITCH SHIFTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PITCH_SHIFTER
	 * @model literal="Pitch Shifter"
	 * @generated
	 * @ordered
	 */
	public static final int PITCH_SHIFTER_VALUE = 9;

	/**
	 * The '<em><b>COMPRESSOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPRESSOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPRESSOR
	 * @model literal="Compressor"
	 * @generated
	 * @ordered
	 */
	public static final int COMPRESSOR_VALUE = 10;

	/**
	 * The '<em><b>DISTORTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DISTORTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISTORTION
	 * @model literal="Distortion"
	 * @generated
	 * @ordered
	 */
	public static final int DISTORTION_VALUE = 11;

	/**
	 * The '<em><b>DECIMATOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DECIMATOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DECIMATOR
	 * @model literal="Decimator"
	 * @generated
	 * @ordered
	 */
	public static final int DECIMATOR_VALUE = 12;

	/**
	 * The '<em><b>EQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EQ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EQ_VALUE = 13;

	/**
	 * The '<em><b>LPF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LPF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LPF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LPF_VALUE = 14;

	/**
	 * The '<em><b>HPF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HPF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HPF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HPF_VALUE = 15;

	/**
	 * An array of all the '<em><b>Fx Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FxType[] VALUES_ARRAY = new FxType[] { REVERB,
			BPM_SYNC_DELAY, SHORT_DELAY, MOD_DELAY, GRAIN_SHIFTER, CHO_FLG,
			PHASER, RING_MOD, TALKING_MOD, PITCH_SHIFTER, COMPRESSOR,
			DISTORTION, DECIMATOR, EQ, LPF, HPF, };

	/**
	 * A public read-only list of all the '<em><b>Fx Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FxType> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Fx Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FxType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FxType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fx Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FxType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FxType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fx Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FxType get(int value) {
		switch (value) {
		case REVERB_VALUE:
			return REVERB;
		case BPM_SYNC_DELAY_VALUE:
			return BPM_SYNC_DELAY;
		case SHORT_DELAY_VALUE:
			return SHORT_DELAY;
		case MOD_DELAY_VALUE:
			return MOD_DELAY;
		case GRAIN_SHIFTER_VALUE:
			return GRAIN_SHIFTER;
		case CHO_FLG_VALUE:
			return CHO_FLG;
		case PHASER_VALUE:
			return PHASER;
		case RING_MOD_VALUE:
			return RING_MOD;
		case TALKING_MOD_VALUE:
			return TALKING_MOD;
		case PITCH_SHIFTER_VALUE:
			return PITCH_SHIFTER;
		case COMPRESSOR_VALUE:
			return COMPRESSOR;
		case DISTORTION_VALUE:
			return DISTORTION;
		case DECIMATOR_VALUE:
			return DECIMATOR;
		case EQ_VALUE:
			return EQ;
		case LPF_VALUE:
			return LPF;
		case HPF_VALUE:
			return HPF;
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
	private FxType(int value, String name, String literal) {
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

} //FxType

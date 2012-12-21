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
 * A representation of the literals of the enumeration '<em><b>SMPTE Format</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.skratchdot.riff.wav.WavPackage#getSMPTEFormat()
 * @model
 * @generated
 */
public enum SMPTEFormat implements Enumerator {
	/**
	 * The '<em><b>SMPTE 0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMPTE_0_VALUE
	 * @generated
	 * @ordered
	 */
	SMPTE_0(0, "SMPTE_0", "no SMPTE offset"),

	/**
	 * The '<em><b>SMPTE 24</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMPTE_24_VALUE
	 * @generated
	 * @ordered
	 */
	SMPTE_24(24, "SMPTE_24", "24 frames per second"),

	/**
	 * The '<em><b>SMPTE 25</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMPTE_25_VALUE
	 * @generated
	 * @ordered
	 */
	SMPTE_25(25, "SMPTE_25", "25 frames per second"),

	/**
	 * The '<em><b>SMPTE 29</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMPTE_29_VALUE
	 * @generated
	 * @ordered
	 */
	SMPTE_29(29, "SMPTE_29",
			"30 frames per second with frame dropping (30 drop)"),

	/**
	 * The '<em><b>SMPTE 30</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMPTE_30_VALUE
	 * @generated
	 * @ordered
	 */
	SMPTE_30(30, "SMPTE_30", "30 frames per second");

	/**
	 * The '<em><b>SMPTE 0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SMPTE 0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMPTE_0
	 * @model literal="no SMPTE offset"
	 * @generated
	 * @ordered
	 */
	public static final int SMPTE_0_VALUE = 0;

	/**
	 * The '<em><b>SMPTE 24</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SMPTE 24</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMPTE_24
	 * @model literal="24 frames per second"
	 * @generated
	 * @ordered
	 */
	public static final int SMPTE_24_VALUE = 24;

	/**
	 * The '<em><b>SMPTE 25</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SMPTE 25</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMPTE_25
	 * @model literal="25 frames per second"
	 * @generated
	 * @ordered
	 */
	public static final int SMPTE_25_VALUE = 25;

	/**
	 * The '<em><b>SMPTE 29</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SMPTE 29</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMPTE_29
	 * @model literal="30 frames per second with frame dropping (30 drop)"
	 * @generated
	 * @ordered
	 */
	public static final int SMPTE_29_VALUE = 29;

	/**
	 * The '<em><b>SMPTE 30</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SMPTE 30</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMPTE_30
	 * @model literal="30 frames per second"
	 * @generated
	 * @ordered
	 */
	public static final int SMPTE_30_VALUE = 30;

	/**
	 * An array of all the '<em><b>SMPTE Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SMPTEFormat[] VALUES_ARRAY = new SMPTEFormat[] {
			SMPTE_0, SMPTE_24, SMPTE_25, SMPTE_29, SMPTE_30, };

	/**
	 * A public read-only list of all the '<em><b>SMPTE Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SMPTEFormat> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SMPTE Format</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SMPTEFormat get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SMPTEFormat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SMPTE Format</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SMPTEFormat getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SMPTEFormat result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SMPTE Format</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SMPTEFormat get(int value) {
		switch (value) {
		case SMPTE_0_VALUE:
			return SMPTE_0;
		case SMPTE_24_VALUE:
			return SMPTE_24;
		case SMPTE_25_VALUE:
			return SMPTE_25;
		case SMPTE_29_VALUE:
			return SMPTE_29;
		case SMPTE_30_VALUE:
			return SMPTE_30;
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
	private SMPTEFormat(int value, String name, String literal) {
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

} //SMPTEFormat

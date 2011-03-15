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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Beat</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getBeat()
 * @model
 * @generated
 */
public enum Beat implements Enumerator {
	/**
	 * The '<em><b>Beat 16th</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEAT_16TH_VALUE
	 * @generated
	 * @ordered
	 */
	BEAT_16TH(0, "Beat_16th", "16th"),

	/**
	 * The '<em><b>Beat 32nd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEAT_32ND_VALUE
	 * @generated
	 * @ordered
	 */
	BEAT_32ND(1, "Beat_32nd", "32nd"),

	/**
	 * The '<em><b>Beat 8Tri</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEAT_8TRI_VALUE
	 * @generated
	 * @ordered
	 */
	BEAT_8TRI(2, "Beat_8Tri", "8Tri"),

	/**
	 * The '<em><b>Beat 16 Tri</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEAT_16_TRI_VALUE
	 * @generated
	 * @ordered
	 */
	BEAT_16_TRI(3, "Beat_16Tri", "16Tri");

	/**
	 * The '<em><b>Beat 16th</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Beat 16th</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEAT_16TH
	 * @model name="Beat_16th" literal="16th"
	 * @generated
	 * @ordered
	 */
	public static final int BEAT_16TH_VALUE = 0;

	/**
	 * The '<em><b>Beat 32nd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Beat 32nd</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEAT_32ND
	 * @model name="Beat_32nd" literal="32nd"
	 * @generated
	 * @ordered
	 */
	public static final int BEAT_32ND_VALUE = 1;

	/**
	 * The '<em><b>Beat 8Tri</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Beat 8Tri</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEAT_8TRI
	 * @model name="Beat_8Tri" literal="8Tri"
	 * @generated
	 * @ordered
	 */
	public static final int BEAT_8TRI_VALUE = 2;

	/**
	 * The '<em><b>Beat 16 Tri</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Beat 16 Tri</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEAT_16_TRI
	 * @model name="Beat_16Tri" literal="16Tri"
	 * @generated
	 * @ordered
	 */
	public static final int BEAT_16_TRI_VALUE = 3;

	/**
	 * An array of all the '<em><b>Beat</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Beat[] VALUES_ARRAY =
		new Beat[] {
			BEAT_16TH,
			BEAT_32ND,
			BEAT_8TRI,
			BEAT_16_TRI,
		};

	/**
	 * A public read-only list of all the '<em><b>Beat</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Beat> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Beat</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Beat get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Beat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Beat</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Beat getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Beat result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Beat</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Beat get(int value) {
		switch (value) {
			case BEAT_16TH_VALUE: return BEAT_16TH;
			case BEAT_32ND_VALUE: return BEAT_32ND;
			case BEAT_8TRI_VALUE: return BEAT_8TRI;
			case BEAT_16_TRI_VALUE: return BEAT_16_TRI;
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
	private Beat(int value, String name, String literal) {
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

} //Beat

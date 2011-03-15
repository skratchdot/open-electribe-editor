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
 * A representation of the literals of the enumeration '<em><b>Mod Dest</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getModDest()
 * @model
 * @generated
 */
public enum ModDest implements Enumerator {
	/**
	 * The '<em><b>Pitch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PITCH_VALUE
	 * @generated
	 * @ordered
	 */
	PITCH(0, "Pitch", "Pitch"),

	/**
	 * The '<em><b>Cutoff</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUTOFF_VALUE
	 * @generated
	 * @ordered
	 */
	CUTOFF(1, "Cutoff", "Cutoff"),

	/**
	 * The '<em><b>Amp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMP_VALUE
	 * @generated
	 * @ordered
	 */
	AMP(2, "Amp", "Amp"),

	/**
	 * The '<em><b>Pan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAN_VALUE
	 * @generated
	 * @ordered
	 */
	PAN(3, "Pan", "Pan");

	/**
	 * The '<em><b>Pitch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pitch</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PITCH
	 * @model name="Pitch"
	 * @generated
	 * @ordered
	 */
	public static final int PITCH_VALUE = 0;

	/**
	 * The '<em><b>Cutoff</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cutoff</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUTOFF
	 * @model name="Cutoff"
	 * @generated
	 * @ordered
	 */
	public static final int CUTOFF_VALUE = 1;

	/**
	 * The '<em><b>Amp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Amp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AMP
	 * @model name="Amp"
	 * @generated
	 * @ordered
	 */
	public static final int AMP_VALUE = 2;

	/**
	 * The '<em><b>Pan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pan</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAN
	 * @model name="Pan"
	 * @generated
	 * @ordered
	 */
	public static final int PAN_VALUE = 3;

	/**
	 * An array of all the '<em><b>Mod Dest</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ModDest[] VALUES_ARRAY =
		new ModDest[] {
			PITCH,
			CUTOFF,
			AMP,
			PAN,
		};

	/**
	 * A public read-only list of all the '<em><b>Mod Dest</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ModDest> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Mod Dest</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModDest get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModDest result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mod Dest</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModDest getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModDest result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mod Dest</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModDest get(int value) {
		switch (value) {
			case PITCH_VALUE: return PITCH;
			case CUTOFF_VALUE: return CUTOFF;
			case AMP_VALUE: return AMP;
			case PAN_VALUE: return PAN;
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
	private ModDest(int value, String name, String literal) {
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

} //ModDest

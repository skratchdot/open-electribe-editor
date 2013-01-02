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
 * A representation of the literals of the enumeration '<em><b>Midi Channel Type Name</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getMidiChannelTypeName()
 * @model
 * @generated
 */
public enum MidiChannelTypeName implements Enumerator {
	/**
	 * The '<em><b>NAME 00</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAME_00_VALUE
	 * @generated
	 * @ordered
	 */
	NAME_00(0, "NAME_00", "Keyboard 1"),

	/**
	 * The '<em><b>NAME 01</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAME_01_VALUE
	 * @generated
	 * @ordered
	 */
	NAME_01(1, "NAME_01", "Keyboard 2"),

	/**
	 * The '<em><b>NAME 02</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAME_02_VALUE
	 * @generated
	 * @ordered
	 */
	NAME_02(2, "NAME_02", "Drum/Stretch/Slice/AudioIn");

	/**
	 * The '<em><b>NAME 00</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NAME 00</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NAME_00
	 * @model literal="Keyboard 1"
	 * @generated
	 * @ordered
	 */
	public static final int NAME_00_VALUE = 0;

	/**
	 * The '<em><b>NAME 01</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NAME 01</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NAME_01
	 * @model literal="Keyboard 2"
	 * @generated
	 * @ordered
	 */
	public static final int NAME_01_VALUE = 1;

	/**
	 * The '<em><b>NAME 02</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NAME 02</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NAME_02
	 * @model literal="Drum/Stretch/Slice/AudioIn"
	 * @generated
	 * @ordered
	 */
	public static final int NAME_02_VALUE = 2;

	/**
	 * An array of all the '<em><b>Midi Channel Type Name</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MidiChannelTypeName[] VALUES_ARRAY = new MidiChannelTypeName[] {
			NAME_00, NAME_01, NAME_02, };

	/**
	 * A public read-only list of all the '<em><b>Midi Channel Type Name</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MidiChannelTypeName> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Midi Channel Type Name</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MidiChannelTypeName get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MidiChannelTypeName result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Midi Channel Type Name</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MidiChannelTypeName getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MidiChannelTypeName result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Midi Channel Type Name</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MidiChannelTypeName get(int value) {
		switch (value) {
		case NAME_00_VALUE:
			return NAME_00;
		case NAME_01_VALUE:
			return NAME_01;
		case NAME_02_VALUE:
			return NAME_02;
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
	private MidiChannelTypeName(int value, String name, String literal) {
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

} //MidiChannelTypeName

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
 * A representation of the literals of the enumeration '<em><b>Tempo Lock</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getTempoLock()
 * @model
 * @generated
 */
public enum TempoLock implements Enumerator {
	/**
	 * The '<em><b>TEMPO LOCK OFF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPO_LOCK_OFF_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPO_LOCK_OFF(0, "TEMPO_LOCK_OFF", "Off"),

	/**
	 * The '<em><b>TEMPO LOCK ON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPO_LOCK_ON_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPO_LOCK_ON(1, "TEMPO_LOCK_ON", "On");

	/**
	 * The '<em><b>TEMPO LOCK OFF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEMPO LOCK OFF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEMPO_LOCK_OFF
	 * @model literal="Off"
	 * @generated
	 * @ordered
	 */
	public static final int TEMPO_LOCK_OFF_VALUE = 0;

	/**
	 * The '<em><b>TEMPO LOCK ON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEMPO LOCK ON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEMPO_LOCK_ON
	 * @model literal="On"
	 * @generated
	 * @ordered
	 */
	public static final int TEMPO_LOCK_ON_VALUE = 1;

	/**
	 * An array of all the '<em><b>Tempo Lock</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TempoLock[] VALUES_ARRAY = new TempoLock[] {
			TEMPO_LOCK_OFF, TEMPO_LOCK_ON, };

	/**
	 * A public read-only list of all the '<em><b>Tempo Lock</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TempoLock> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tempo Lock</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TempoLock get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TempoLock result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tempo Lock</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TempoLock getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TempoLock result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tempo Lock</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TempoLock get(int value) {
		switch (value) {
		case TEMPO_LOCK_OFF_VALUE:
			return TEMPO_LOCK_OFF;
		case TEMPO_LOCK_ON_VALUE:
			return TEMPO_LOCK_ON;
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
	private TempoLock(int value, String name, String literal) {
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

} //TempoLock

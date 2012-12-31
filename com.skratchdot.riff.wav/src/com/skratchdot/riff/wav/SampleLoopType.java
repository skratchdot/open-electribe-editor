/*******************************************************************************
 * Copyright (c) 2009-2013 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 *******************************************************************************/
package com.skratchdot.riff.wav;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sample Loop Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.skratchdot.riff.wav.WavPackage#getSampleLoopType()
 * @model
 * @generated
 */
public enum SampleLoopType implements Enumerator {
	/**
	 * The '<em><b>UNKNOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(-1, "UNKNOWN", "Unknown"),

	/**
	 * The '<em><b>FORWARD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORWARD_VALUE
	 * @generated
	 * @ordered
	 */
	FORWARD(0, "FORWARD", "Loop Forward (normal)"),

	/**
	 * The '<em><b>PING PONG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PING_PONG_VALUE
	 * @generated
	 * @ordered
	 */
	PING_PONG(1, "PING_PONG",
			"Alternating loop (forward/backward, also known as Ping Pong)"),

	/**
	 * The '<em><b>BACKWARD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACKWARD_VALUE
	 * @generated
	 * @ordered
	 */
	BACKWARD(2, "BACKWARD", "Loop backward (reverse)");

	/**
	 * The '<em><b>UNKNOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNKNOWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model literal="Unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = -1;

	/**
	 * The '<em><b>FORWARD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FORWARD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FORWARD
	 * @model literal="Loop Forward (normal)"
	 * @generated
	 * @ordered
	 */
	public static final int FORWARD_VALUE = 0;

	/**
	 * The '<em><b>PING PONG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PING PONG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PING_PONG
	 * @model literal="Alternating loop (forward/backward, also known as Ping Pong)"
	 * @generated
	 * @ordered
	 */
	public static final int PING_PONG_VALUE = 1;

	/**
	 * The '<em><b>BACKWARD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BACKWARD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BACKWARD
	 * @model literal="Loop backward (reverse)"
	 * @generated
	 * @ordered
	 */
	public static final int BACKWARD_VALUE = 2;

	/**
	 * An array of all the '<em><b>Sample Loop Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SampleLoopType[] VALUES_ARRAY = new SampleLoopType[] {
			UNKNOWN, FORWARD, PING_PONG, BACKWARD, };

	/**
	 * A public read-only list of all the '<em><b>Sample Loop Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SampleLoopType> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sample Loop Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SampleLoopType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SampleLoopType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sample Loop Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SampleLoopType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SampleLoopType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sample Loop Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SampleLoopType get(int value) {
		switch (value) {
		case UNKNOWN_VALUE:
			return UNKNOWN;
		case FORWARD_VALUE:
			return FORWARD;
		case PING_PONG_VALUE:
			return PING_PONG;
		case BACKWARD_VALUE:
			return BACKWARD;
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
	private SampleLoopType(int value, String name, String literal) {
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

} //SampleLoopType

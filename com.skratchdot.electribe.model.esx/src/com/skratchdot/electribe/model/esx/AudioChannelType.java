/**
 * Copyright (c) 2009, 2012 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 */
package com.skratchdot.electribe.model.esx;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Audio Channel Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getAudioChannelType()
 * @model
 * @generated
 */
public enum AudioChannelType implements Enumerator {
	/**
	 * The '<em><b>MONO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONO_VALUE
	 * @generated
	 * @ordered
	 */
	MONO(0, "MONO", "Mono (Channel 1)"),

	/**
	 * The '<em><b>STEREO 1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEREO_1_VALUE
	 * @generated
	 * @ordered
	 */
	STEREO_1(1, "STEREO_1", "Stereo (Channel 1)"),

	/**
	 * The '<em><b>STEREO 2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEREO_2_VALUE
	 * @generated
	 * @ordered
	 */
	STEREO_2(2, "STEREO_2", "Stereo (Channel 2)");

	/**
	 * The '<em><b>MONO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MONO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MONO
	 * @model literal="Mono (Channel 1)"
	 * @generated
	 * @ordered
	 */
	public static final int MONO_VALUE = 0;

	/**
	 * The '<em><b>STEREO 1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STEREO 1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STEREO_1
	 * @model literal="Stereo (Channel 1)"
	 * @generated
	 * @ordered
	 */
	public static final int STEREO_1_VALUE = 1;

	/**
	 * The '<em><b>STEREO 2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STEREO 2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STEREO_2
	 * @model literal="Stereo (Channel 2)"
	 * @generated
	 * @ordered
	 */
	public static final int STEREO_2_VALUE = 2;

	/**
	 * An array of all the '<em><b>Audio Channel Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AudioChannelType[] VALUES_ARRAY =
		new AudioChannelType[] {
			MONO,
			STEREO_1,
			STEREO_2,
		};

	/**
	 * A public read-only list of all the '<em><b>Audio Channel Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AudioChannelType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Audio Channel Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AudioChannelType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AudioChannelType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Audio Channel Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AudioChannelType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AudioChannelType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Audio Channel Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AudioChannelType get(int value) {
		switch (value) {
			case MONO_VALUE: return MONO;
			case STEREO_1_VALUE: return STEREO_1;
			case STEREO_2_VALUE: return STEREO_2;
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
	private AudioChannelType(int value, String name, String literal) {
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
	
} //AudioChannelType

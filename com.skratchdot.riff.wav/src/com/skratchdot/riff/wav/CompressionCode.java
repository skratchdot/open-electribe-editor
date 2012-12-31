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
 * A representation of the literals of the enumeration '<em><b>Compression Code</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.skratchdot.riff.wav.WavPackage#getCompressionCode()
 * @model
 * @generated
 */
public enum CompressionCode implements Enumerator {
	/**
	 * The '<em><b>COMPRESSION CODE 0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPRESSION_CODE_0_VALUE
	 * @generated
	 * @ordered
	 */
	COMPRESSION_CODE_0(0, "COMPRESSION_CODE_0", "Unknown"),

	/**
	 * The '<em><b>COMPRESSION CODE 1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPRESSION_CODE_1_VALUE
	 * @generated
	 * @ordered
	 */
	COMPRESSION_CODE_1(1, "COMPRESSION_CODE_1", "PCM/uncompressed"),

	/**
	 * The '<em><b>COMPRESSION CODE 2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPRESSION_CODE_2_VALUE
	 * @generated
	 * @ordered
	 */
	COMPRESSION_CODE_2(2, "COMPRESSION_CODE_2", "Microsoft ADPCM"),

	/**
	 * The '<em><b>COMPRESSION CODE 6</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPRESSION_CODE_6_VALUE
	 * @generated
	 * @ordered
	 */
	COMPRESSION_CODE_6(6, "COMPRESSION_CODE_6", "ITU G.711 a-law"),

	/**
	 * The '<em><b>COMPRESSION CODE 7</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPRESSION_CODE_7_VALUE
	 * @generated
	 * @ordered
	 */
	COMPRESSION_CODE_7(7, "COMPRESSION_CODE_7", "ITU G.711 Au-law"),

	/**
	 * The '<em><b>COMPRESSION CODE 17</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPRESSION_CODE_17_VALUE
	 * @generated
	 * @ordered
	 */
	COMPRESSION_CODE_17(17, "COMPRESSION_CODE_17", "IMA ADPCM"),

	/**
	 * The '<em><b>COMPRESSION CODE 20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPRESSION_CODE_20_VALUE
	 * @generated
	 * @ordered
	 */
	COMPRESSION_CODE_20(20, "COMPRESSION_CODE_20", "ITU G.723 ADPCM (Yamaha)"),

	/**
	 * The '<em><b>COMPRESSION CODE 49</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPRESSION_CODE_49_VALUE
	 * @generated
	 * @ordered
	 */
	COMPRESSION_CODE_49(49, "COMPRESSION_CODE_49", "GSM 6.10"),

	/**
	 * The '<em><b>COMPRESSION CODE 64</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPRESSION_CODE_64_VALUE
	 * @generated
	 * @ordered
	 */
	COMPRESSION_CODE_64(64, "COMPRESSION_CODE_64", "ITU G.721 ADPCM"),

	/**
	 * The '<em><b>COMPRESSION CODE 80</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPRESSION_CODE_80_VALUE
	 * @generated
	 * @ordered
	 */
	COMPRESSION_CODE_80(80, "COMPRESSION_CODE_80", "MPEG"),

	/**
	 * The '<em><b>COMPRESSION CODE 65536</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPRESSION_CODE_65536_VALUE
	 * @generated
	 * @ordered
	 */
	COMPRESSION_CODE_65536(65536, "COMPRESSION_CODE_65536", "Experimental");

	/**
	 * The '<em><b>COMPRESSION CODE 0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPRESSION CODE 0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPRESSION_CODE_0
	 * @model literal="Unknown"
	 * @generated
	 * @ordered
	 */
	public static final int COMPRESSION_CODE_0_VALUE = 0;

	/**
	 * The '<em><b>COMPRESSION CODE 1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPRESSION CODE 1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPRESSION_CODE_1
	 * @model literal="PCM/uncompressed"
	 * @generated
	 * @ordered
	 */
	public static final int COMPRESSION_CODE_1_VALUE = 1;

	/**
	 * The '<em><b>COMPRESSION CODE 2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPRESSION CODE 2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPRESSION_CODE_2
	 * @model literal="Microsoft ADPCM"
	 * @generated
	 * @ordered
	 */
	public static final int COMPRESSION_CODE_2_VALUE = 2;

	/**
	 * The '<em><b>COMPRESSION CODE 6</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPRESSION CODE 6</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPRESSION_CODE_6
	 * @model literal="ITU G.711 a-law"
	 * @generated
	 * @ordered
	 */
	public static final int COMPRESSION_CODE_6_VALUE = 6;

	/**
	 * The '<em><b>COMPRESSION CODE 7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPRESSION CODE 7</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPRESSION_CODE_7
	 * @model literal="ITU G.711 Au-law"
	 * @generated
	 * @ordered
	 */
	public static final int COMPRESSION_CODE_7_VALUE = 7;

	/**
	 * The '<em><b>COMPRESSION CODE 17</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPRESSION CODE 17</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPRESSION_CODE_17
	 * @model literal="IMA ADPCM"
	 * @generated
	 * @ordered
	 */
	public static final int COMPRESSION_CODE_17_VALUE = 17;

	/**
	 * The '<em><b>COMPRESSION CODE 20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPRESSION CODE 20</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPRESSION_CODE_20
	 * @model literal="ITU G.723 ADPCM (Yamaha)"
	 * @generated
	 * @ordered
	 */
	public static final int COMPRESSION_CODE_20_VALUE = 20;

	/**
	 * The '<em><b>COMPRESSION CODE 49</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPRESSION CODE 49</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPRESSION_CODE_49
	 * @model literal="GSM 6.10"
	 * @generated
	 * @ordered
	 */
	public static final int COMPRESSION_CODE_49_VALUE = 49;

	/**
	 * The '<em><b>COMPRESSION CODE 64</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPRESSION CODE 64</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPRESSION_CODE_64
	 * @model literal="ITU G.721 ADPCM"
	 * @generated
	 * @ordered
	 */
	public static final int COMPRESSION_CODE_64_VALUE = 64;

	/**
	 * The '<em><b>COMPRESSION CODE 80</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPRESSION CODE 80</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPRESSION_CODE_80
	 * @model literal="MPEG"
	 * @generated
	 * @ordered
	 */
	public static final int COMPRESSION_CODE_80_VALUE = 80;

	/**
	 * The '<em><b>COMPRESSION CODE 65536</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPRESSION CODE 65536</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPRESSION_CODE_65536
	 * @model literal="Experimental"
	 * @generated
	 * @ordered
	 */
	public static final int COMPRESSION_CODE_65536_VALUE = 65536;

	/**
	 * An array of all the '<em><b>Compression Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CompressionCode[] VALUES_ARRAY = new CompressionCode[] {
			COMPRESSION_CODE_0, COMPRESSION_CODE_1, COMPRESSION_CODE_2,
			COMPRESSION_CODE_6, COMPRESSION_CODE_7, COMPRESSION_CODE_17,
			COMPRESSION_CODE_20, COMPRESSION_CODE_49, COMPRESSION_CODE_64,
			COMPRESSION_CODE_80, COMPRESSION_CODE_65536, };

	/**
	 * A public read-only list of all the '<em><b>Compression Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CompressionCode> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Compression Code</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CompressionCode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CompressionCode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Compression Code</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CompressionCode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CompressionCode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Compression Code</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CompressionCode get(int value) {
		switch (value) {
		case COMPRESSION_CODE_0_VALUE:
			return COMPRESSION_CODE_0;
		case COMPRESSION_CODE_1_VALUE:
			return COMPRESSION_CODE_1;
		case COMPRESSION_CODE_2_VALUE:
			return COMPRESSION_CODE_2;
		case COMPRESSION_CODE_6_VALUE:
			return COMPRESSION_CODE_6;
		case COMPRESSION_CODE_7_VALUE:
			return COMPRESSION_CODE_7;
		case COMPRESSION_CODE_17_VALUE:
			return COMPRESSION_CODE_17;
		case COMPRESSION_CODE_20_VALUE:
			return COMPRESSION_CODE_20;
		case COMPRESSION_CODE_49_VALUE:
			return COMPRESSION_CODE_49;
		case COMPRESSION_CODE_64_VALUE:
			return COMPRESSION_CODE_64;
		case COMPRESSION_CODE_80_VALUE:
			return COMPRESSION_CODE_80;
		case COMPRESSION_CODE_65536_VALUE:
			return COMPRESSION_CODE_65536;
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
	private CompressionCode(int value, String name, String literal) {
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

} //CompressionCode

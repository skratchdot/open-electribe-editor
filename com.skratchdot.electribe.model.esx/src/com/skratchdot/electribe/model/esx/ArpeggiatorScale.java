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
 * A representation of the literals of the enumeration '<em><b>Arpeggiator Scale</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getArpeggiatorScale()
 * @model
 * @generated
 */
public enum ArpeggiatorScale implements Enumerator {
	/**
	 * The '<em><b>CHROMATIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHROMATIC_VALUE
	 * @generated
	 * @ordered
	 */
	CHROMATIC(0, "CHROMATIC", "Chromatic"),

	/**
	 * The '<em><b>IONIAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IONIAN_VALUE
	 * @generated
	 * @ordered
	 */
	IONIAN(1, "IONIAN", "Ionian"),

	/**
	 * The '<em><b>DORIAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DORIAN_VALUE
	 * @generated
	 * @ordered
	 */
	DORIAN(2, "DORIAN", "Dorian"),

	/**
	 * The '<em><b>PHRYGIAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHRYGIAN_VALUE
	 * @generated
	 * @ordered
	 */
	PHRYGIAN(3, "PHRYGIAN", "Phrygian"),

	/**
	 * The '<em><b>LYDIAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LYDIAN_VALUE
	 * @generated
	 * @ordered
	 */
	LYDIAN(4, "LYDIAN", "Lydian"),

	/**
	 * The '<em><b>MIXOLYDIAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIXOLYDIAN_VALUE
	 * @generated
	 * @ordered
	 */
	MIXOLYDIAN(5, "MIXOLYDIAN", "Mixolydian"),

	/**
	 * The '<em><b>AEOLIAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AEOLIAN_VALUE
	 * @generated
	 * @ordered
	 */
	AEOLIAN(6, "AEOLIAN", "Aeolian"),

	/**
	 * The '<em><b>LOCRIAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCRIAN_VALUE
	 * @generated
	 * @ordered
	 */
	LOCRIAN(7, "LOCRIAN", "Locrian"),

	/**
	 * The '<em><b>MAJOR BLUES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAJOR_BLUES_VALUE
	 * @generated
	 * @ordered
	 */
	MAJOR_BLUES(8, "MAJOR_BLUES", "Major Blues"),

	/**
	 * The '<em><b>MINOR BLUES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINOR_BLUES_VALUE
	 * @generated
	 * @ordered
	 */
	MINOR_BLUES(9, "MINOR_BLUES", "minor Blues"),

	/**
	 * The '<em><b>DIMINISH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIMINISH_VALUE
	 * @generated
	 * @ordered
	 */
	DIMINISH(10, "DIMINISH", "Diminish"),

	/**
	 * The '<em><b>COMBINATION DIMINISH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMBINATION_DIMINISH_VALUE
	 * @generated
	 * @ordered
	 */
	COMBINATION_DIMINISH(11, "COMBINATION_DIMINISH", "Combination Diminish"),

	/**
	 * The '<em><b>MAJOR PENTATONIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAJOR_PENTATONIC_VALUE
	 * @generated
	 * @ordered
	 */
	MAJOR_PENTATONIC(12, "MAJOR_PENTATONIC", "Major Pentatonic"),

	/**
	 * The '<em><b>MINOR PENTATONIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINOR_PENTATONIC_VALUE
	 * @generated
	 * @ordered
	 */
	MINOR_PENTATONIC(13, "MINOR_PENTATONIC", "minor Pentatonic"),

	/**
	 * The '<em><b>RAGA BHAIRAV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAGA_BHAIRAV_VALUE
	 * @generated
	 * @ordered
	 */
	RAGA_BHAIRAV(14, "RAGA_BHAIRAV", "Raga Bhairav"),

	/**
	 * The '<em><b>RAGA GAMANASRAMA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAGA_GAMANASRAMA_VALUE
	 * @generated
	 * @ordered
	 */
	RAGA_GAMANASRAMA(15, "RAGA_GAMANASRAMA", "Raga Gamanasrama"),

	/**
	 * The '<em><b>RAGA TODI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAGA_TODI_VALUE
	 * @generated
	 * @ordered
	 */
	RAGA_TODI(16, "RAGA_TODI", "Raga Todi"),

	/**
	 * The '<em><b>SPANISH SCALE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPANISH_SCALE_VALUE
	 * @generated
	 * @ordered
	 */
	SPANISH_SCALE(17, "SPANISH_SCALE", "Spanish Scale"),

	/**
	 * The '<em><b>GYPSY SCALE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GYPSY_SCALE_VALUE
	 * @generated
	 * @ordered
	 */
	GYPSY_SCALE(18, "GYPSY_SCALE", "Gypsy Scale"),

	/**
	 * The '<em><b>ARABIAN SCALE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARABIAN_SCALE_VALUE
	 * @generated
	 * @ordered
	 */
	ARABIAN_SCALE(19, "ARABIAN_SCALE", "Arabian Scale"),

	/**
	 * The '<em><b>EGYPTIAN SCALE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EGYPTIAN_SCALE_VALUE
	 * @generated
	 * @ordered
	 */
	EGYPTIAN_SCALE(20, "EGYPTIAN_SCALE", "Egyptian Scale"),

	/**
	 * The '<em><b>HAWAIIAN SCALE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAWAIIAN_SCALE_VALUE
	 * @generated
	 * @ordered
	 */
	HAWAIIAN_SCALE(21, "HAWAIIAN_SCALE", "Hawaiian Scale"),

	/**
	 * The '<em><b>BALI ISLAND SCALE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BALI_ISLAND_SCALE_VALUE
	 * @generated
	 * @ordered
	 */
	BALI_ISLAND_SCALE(22, "BALI_ISLAND_SCALE", "Bali Island Scale"),

	/**
	 * The '<em><b>JAPANESE MIYAKOBUSHI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JAPANESE_MIYAKOBUSHI_VALUE
	 * @generated
	 * @ordered
	 */
	JAPANESE_MIYAKOBUSHI(23, "JAPANESE_MIYAKOBUSHI", "Japanese Miyakobushi"),

	/**
	 * The '<em><b>RYUKYU SCALE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RYUKYU_SCALE_VALUE
	 * @generated
	 * @ordered
	 */
	RYUKYU_SCALE(24, "RYUKYU_SCALE", "Ryukyu Scale"),

	/**
	 * The '<em><b>WHOLETONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHOLETONE_VALUE
	 * @generated
	 * @ordered
	 */
	WHOLETONE(25, "WHOLETONE", "Wholetone"),

	/**
	 * The '<em><b>MINOR 3RD INTERVAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINOR_3RD_INTERVAL_VALUE
	 * @generated
	 * @ordered
	 */
	MINOR_3RD_INTERVAL(26, "MINOR_3RD_INTERVAL", "m3rd Interval"),

	/**
	 * The '<em><b>MAJOR 3RD INTERVAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAJOR_3RD_INTERVAL_VALUE
	 * @generated
	 * @ordered
	 */
	MAJOR_3RD_INTERVAL(27, "MAJOR_3RD_INTERVAL", "M3rd Interval"),

	/**
	 * The '<em><b>FOURTH INTERVAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOURTH_INTERVAL_VALUE
	 * @generated
	 * @ordered
	 */
	FOURTH_INTERVAL(28, "FOURTH_INTERVAL", "4th Interval"),

	/**
	 * The '<em><b>FIFTH INTERVAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIFTH_INTERVAL_VALUE
	 * @generated
	 * @ordered
	 */
	FIFTH_INTERVAL(29, "FIFTH_INTERVAL", "5th Interval"),

	/**
	 * The '<em><b>OCTAVE INTERVAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCTAVE_INTERVAL_VALUE
	 * @generated
	 * @ordered
	 */
	OCTAVE_INTERVAL(30, "OCTAVE_INTERVAL", "Octave Interval");

	/**
	 * The '<em><b>CHROMATIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHROMATIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHROMATIC
	 * @model literal="Chromatic"
	 * @generated
	 * @ordered
	 */
	public static final int CHROMATIC_VALUE = 0;

	/**
	 * The '<em><b>IONIAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IONIAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IONIAN
	 * @model literal="Ionian"
	 * @generated
	 * @ordered
	 */
	public static final int IONIAN_VALUE = 1;

	/**
	 * The '<em><b>DORIAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DORIAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DORIAN
	 * @model literal="Dorian"
	 * @generated
	 * @ordered
	 */
	public static final int DORIAN_VALUE = 2;

	/**
	 * The '<em><b>PHRYGIAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PHRYGIAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHRYGIAN
	 * @model literal="Phrygian"
	 * @generated
	 * @ordered
	 */
	public static final int PHRYGIAN_VALUE = 3;

	/**
	 * The '<em><b>LYDIAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LYDIAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LYDIAN
	 * @model literal="Lydian"
	 * @generated
	 * @ordered
	 */
	public static final int LYDIAN_VALUE = 4;

	/**
	 * The '<em><b>MIXOLYDIAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MIXOLYDIAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIXOLYDIAN
	 * @model literal="Mixolydian"
	 * @generated
	 * @ordered
	 */
	public static final int MIXOLYDIAN_VALUE = 5;

	/**
	 * The '<em><b>AEOLIAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AEOLIAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AEOLIAN
	 * @model literal="Aeolian"
	 * @generated
	 * @ordered
	 */
	public static final int AEOLIAN_VALUE = 6;

	/**
	 * The '<em><b>LOCRIAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOCRIAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOCRIAN
	 * @model literal="Locrian"
	 * @generated
	 * @ordered
	 */
	public static final int LOCRIAN_VALUE = 7;

	/**
	 * The '<em><b>MAJOR BLUES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MAJOR BLUES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAJOR_BLUES
	 * @model literal="Major Blues"
	 * @generated
	 * @ordered
	 */
	public static final int MAJOR_BLUES_VALUE = 8;

	/**
	 * The '<em><b>MINOR BLUES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MINOR BLUES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINOR_BLUES
	 * @model literal="minor Blues"
	 * @generated
	 * @ordered
	 */
	public static final int MINOR_BLUES_VALUE = 9;

	/**
	 * The '<em><b>DIMINISH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DIMINISH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIMINISH
	 * @model literal="Diminish"
	 * @generated
	 * @ordered
	 */
	public static final int DIMINISH_VALUE = 10;

	/**
	 * The '<em><b>COMBINATION DIMINISH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMBINATION DIMINISH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMBINATION_DIMINISH
	 * @model literal="Combination Diminish"
	 * @generated
	 * @ordered
	 */
	public static final int COMBINATION_DIMINISH_VALUE = 11;

	/**
	 * The '<em><b>MAJOR PENTATONIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MAJOR PENTATONIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAJOR_PENTATONIC
	 * @model literal="Major Pentatonic"
	 * @generated
	 * @ordered
	 */
	public static final int MAJOR_PENTATONIC_VALUE = 12;

	/**
	 * The '<em><b>MINOR PENTATONIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MINOR PENTATONIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINOR_PENTATONIC
	 * @model literal="minor Pentatonic"
	 * @generated
	 * @ordered
	 */
	public static final int MINOR_PENTATONIC_VALUE = 13;

	/**
	 * The '<em><b>RAGA BHAIRAV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RAGA BHAIRAV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RAGA_BHAIRAV
	 * @model literal="Raga Bhairav"
	 * @generated
	 * @ordered
	 */
	public static final int RAGA_BHAIRAV_VALUE = 14;

	/**
	 * The '<em><b>RAGA GAMANASRAMA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RAGA GAMANASRAMA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RAGA_GAMANASRAMA
	 * @model literal="Raga Gamanasrama"
	 * @generated
	 * @ordered
	 */
	public static final int RAGA_GAMANASRAMA_VALUE = 15;

	/**
	 * The '<em><b>RAGA TODI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RAGA TODI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RAGA_TODI
	 * @model literal="Raga Todi"
	 * @generated
	 * @ordered
	 */
	public static final int RAGA_TODI_VALUE = 16;

	/**
	 * The '<em><b>SPANISH SCALE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPANISH SCALE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPANISH_SCALE
	 * @model literal="Spanish Scale"
	 * @generated
	 * @ordered
	 */
	public static final int SPANISH_SCALE_VALUE = 17;

	/**
	 * The '<em><b>GYPSY SCALE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GYPSY SCALE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GYPSY_SCALE
	 * @model literal="Gypsy Scale"
	 * @generated
	 * @ordered
	 */
	public static final int GYPSY_SCALE_VALUE = 18;

	/**
	 * The '<em><b>ARABIAN SCALE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARABIAN SCALE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARABIAN_SCALE
	 * @model literal="Arabian Scale"
	 * @generated
	 * @ordered
	 */
	public static final int ARABIAN_SCALE_VALUE = 19;

	/**
	 * The '<em><b>EGYPTIAN SCALE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EGYPTIAN SCALE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EGYPTIAN_SCALE
	 * @model literal="Egyptian Scale"
	 * @generated
	 * @ordered
	 */
	public static final int EGYPTIAN_SCALE_VALUE = 20;

	/**
	 * The '<em><b>HAWAIIAN SCALE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HAWAIIAN SCALE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HAWAIIAN_SCALE
	 * @model literal="Hawaiian Scale"
	 * @generated
	 * @ordered
	 */
	public static final int HAWAIIAN_SCALE_VALUE = 21;

	/**
	 * The '<em><b>BALI ISLAND SCALE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BALI ISLAND SCALE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BALI_ISLAND_SCALE
	 * @model literal="Bali Island Scale"
	 * @generated
	 * @ordered
	 */
	public static final int BALI_ISLAND_SCALE_VALUE = 22;

	/**
	 * The '<em><b>JAPANESE MIYAKOBUSHI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JAPANESE MIYAKOBUSHI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JAPANESE_MIYAKOBUSHI
	 * @model literal="Japanese Miyakobushi"
	 * @generated
	 * @ordered
	 */
	public static final int JAPANESE_MIYAKOBUSHI_VALUE = 23;

	/**
	 * The '<em><b>RYUKYU SCALE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RYUKYU SCALE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RYUKYU_SCALE
	 * @model literal="Ryukyu Scale"
	 * @generated
	 * @ordered
	 */
	public static final int RYUKYU_SCALE_VALUE = 24;

	/**
	 * The '<em><b>WHOLETONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WHOLETONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHOLETONE
	 * @model literal="Wholetone"
	 * @generated
	 * @ordered
	 */
	public static final int WHOLETONE_VALUE = 25;

	/**
	 * The '<em><b>MINOR 3RD INTERVAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MINOR 3RD INTERVAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINOR_3RD_INTERVAL
	 * @model literal="m3rd Interval"
	 * @generated
	 * @ordered
	 */
	public static final int MINOR_3RD_INTERVAL_VALUE = 26;

	/**
	 * The '<em><b>MAJOR 3RD INTERVAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MAJOR 3RD INTERVAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAJOR_3RD_INTERVAL
	 * @model literal="M3rd Interval"
	 * @generated
	 * @ordered
	 */
	public static final int MAJOR_3RD_INTERVAL_VALUE = 27;

	/**
	 * The '<em><b>FOURTH INTERVAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FOURTH INTERVAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FOURTH_INTERVAL
	 * @model literal="4th Interval"
	 * @generated
	 * @ordered
	 */
	public static final int FOURTH_INTERVAL_VALUE = 28;

	/**
	 * The '<em><b>FIFTH INTERVAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FIFTH INTERVAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIFTH_INTERVAL
	 * @model literal="5th Interval"
	 * @generated
	 * @ordered
	 */
	public static final int FIFTH_INTERVAL_VALUE = 29;

	/**
	 * The '<em><b>OCTAVE INTERVAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OCTAVE INTERVAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OCTAVE_INTERVAL
	 * @model literal="Octave Interval"
	 * @generated
	 * @ordered
	 */
	public static final int OCTAVE_INTERVAL_VALUE = 30;

	/**
	 * An array of all the '<em><b>Arpeggiator Scale</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ArpeggiatorScale[] VALUES_ARRAY = new ArpeggiatorScale[] {
			CHROMATIC, IONIAN, DORIAN, PHRYGIAN, LYDIAN, MIXOLYDIAN, AEOLIAN,
			LOCRIAN, MAJOR_BLUES, MINOR_BLUES, DIMINISH, COMBINATION_DIMINISH,
			MAJOR_PENTATONIC, MINOR_PENTATONIC, RAGA_BHAIRAV, RAGA_GAMANASRAMA,
			RAGA_TODI, SPANISH_SCALE, GYPSY_SCALE, ARABIAN_SCALE,
			EGYPTIAN_SCALE, HAWAIIAN_SCALE, BALI_ISLAND_SCALE,
			JAPANESE_MIYAKOBUSHI, RYUKYU_SCALE, WHOLETONE, MINOR_3RD_INTERVAL,
			MAJOR_3RD_INTERVAL, FOURTH_INTERVAL, FIFTH_INTERVAL,
			OCTAVE_INTERVAL, };

	/**
	 * A public read-only list of all the '<em><b>Arpeggiator Scale</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ArpeggiatorScale> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Arpeggiator Scale</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArpeggiatorScale get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArpeggiatorScale result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Arpeggiator Scale</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArpeggiatorScale getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArpeggiatorScale result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Arpeggiator Scale</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArpeggiatorScale get(int value) {
		switch (value) {
		case CHROMATIC_VALUE:
			return CHROMATIC;
		case IONIAN_VALUE:
			return IONIAN;
		case DORIAN_VALUE:
			return DORIAN;
		case PHRYGIAN_VALUE:
			return PHRYGIAN;
		case LYDIAN_VALUE:
			return LYDIAN;
		case MIXOLYDIAN_VALUE:
			return MIXOLYDIAN;
		case AEOLIAN_VALUE:
			return AEOLIAN;
		case LOCRIAN_VALUE:
			return LOCRIAN;
		case MAJOR_BLUES_VALUE:
			return MAJOR_BLUES;
		case MINOR_BLUES_VALUE:
			return MINOR_BLUES;
		case DIMINISH_VALUE:
			return DIMINISH;
		case COMBINATION_DIMINISH_VALUE:
			return COMBINATION_DIMINISH;
		case MAJOR_PENTATONIC_VALUE:
			return MAJOR_PENTATONIC;
		case MINOR_PENTATONIC_VALUE:
			return MINOR_PENTATONIC;
		case RAGA_BHAIRAV_VALUE:
			return RAGA_BHAIRAV;
		case RAGA_GAMANASRAMA_VALUE:
			return RAGA_GAMANASRAMA;
		case RAGA_TODI_VALUE:
			return RAGA_TODI;
		case SPANISH_SCALE_VALUE:
			return SPANISH_SCALE;
		case GYPSY_SCALE_VALUE:
			return GYPSY_SCALE;
		case ARABIAN_SCALE_VALUE:
			return ARABIAN_SCALE;
		case EGYPTIAN_SCALE_VALUE:
			return EGYPTIAN_SCALE;
		case HAWAIIAN_SCALE_VALUE:
			return HAWAIIAN_SCALE;
		case BALI_ISLAND_SCALE_VALUE:
			return BALI_ISLAND_SCALE;
		case JAPANESE_MIYAKOBUSHI_VALUE:
			return JAPANESE_MIYAKOBUSHI;
		case RYUKYU_SCALE_VALUE:
			return RYUKYU_SCALE;
		case WHOLETONE_VALUE:
			return WHOLETONE;
		case MINOR_3RD_INTERVAL_VALUE:
			return MINOR_3RD_INTERVAL;
		case MAJOR_3RD_INTERVAL_VALUE:
			return MAJOR_3RD_INTERVAL;
		case FOURTH_INTERVAL_VALUE:
			return FOURTH_INTERVAL;
		case FIFTH_INTERVAL_VALUE:
			return FIFTH_INTERVAL;
		case OCTAVE_INTERVAL_VALUE:
			return OCTAVE_INTERVAL;
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
	private ArpeggiatorScale(int value, String name, String literal) {
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

} //ArpeggiatorScale

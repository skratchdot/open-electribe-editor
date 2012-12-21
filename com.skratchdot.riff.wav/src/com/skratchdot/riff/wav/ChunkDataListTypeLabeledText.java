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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chunk Data List Type Labeled Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.ChunkDataListTypeLabeledText#getSampleLength <em>Sample Length</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkDataListTypeLabeledText#getPurposeID <em>Purpose ID</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkDataListTypeLabeledText#getCountry <em>Country</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkDataListTypeLabeledText#getLanguage <em>Language</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkDataListTypeLabeledText#getDialect <em>Dialect</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkDataListTypeLabeledText#getCodePage <em>Code Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.riff.wav.WavPackage#getChunkDataListTypeLabeledText()
 * @model
 * @generated
 */
public interface ChunkDataListTypeLabeledText extends ChunkDataListType {
	/**
	 * Returns the value of the '<em><b>Sample Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample Length</em>' attribute.
	 * @see #setSampleLength(Long)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkDataListTypeLabeledText_SampleLength()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedInt"
	 * @generated
	 */
	Long getSampleLength();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkDataListTypeLabeledText#getSampleLength <em>Sample Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample Length</em>' attribute.
	 * @see #getSampleLength()
	 * @generated
	 */
	void setSampleLength(Long value);

	/**
	 * Returns the value of the '<em><b>Purpose ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose ID</em>' attribute.
	 * @see #setPurposeID(Long)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkDataListTypeLabeledText_PurposeID()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedInt"
	 * @generated
	 */
	Long getPurposeID();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkDataListTypeLabeledText#getPurposeID <em>Purpose ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose ID</em>' attribute.
	 * @see #getPurposeID()
	 * @generated
	 */
	void setPurposeID(Long value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(Integer)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkDataListTypeLabeledText_Country()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedShort"
	 * @generated
	 */
	Integer getCountry();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkDataListTypeLabeledText#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(Integer value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(Integer)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkDataListTypeLabeledText_Language()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedShort"
	 * @generated
	 */
	Integer getLanguage();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkDataListTypeLabeledText#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Integer value);

	/**
	 * Returns the value of the '<em><b>Dialect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dialect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dialect</em>' attribute.
	 * @see #setDialect(Integer)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkDataListTypeLabeledText_Dialect()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedShort"
	 * @generated
	 */
	Integer getDialect();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkDataListTypeLabeledText#getDialect <em>Dialect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dialect</em>' attribute.
	 * @see #getDialect()
	 * @generated
	 */
	void setDialect(Integer value);

	/**
	 * Returns the value of the '<em><b>Code Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Page</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Page</em>' attribute.
	 * @see #setCodePage(Integer)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkDataListTypeLabeledText_CodePage()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedShort"
	 * @generated
	 */
	Integer getCodePage();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkDataListTypeLabeledText#getCodePage <em>Code Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Page</em>' attribute.
	 * @see #getCodePage()
	 * @generated
	 */
	void setCodePage(Integer value);

} // ChunkDataListTypeLabeledText

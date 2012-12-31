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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chunk Data List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.ChunkDataListType#getCuePointID <em>Cue Point ID</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkDataListType#getText <em>Text</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkDataListType#getTextAsString <em>Text As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.riff.wav.WavPackage#getChunkDataListType()
 * @model abstract="true"
 * @generated
 */
public interface ChunkDataListType extends Chunk {
	/**
	 * Returns the value of the '<em><b>Cue Point ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cue Point ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cue Point ID</em>' attribute.
	 * @see #setCuePointID(Long)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkDataListType_CuePointID()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedInt"
	 * @generated
	 */
	Long getCuePointID();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkDataListType#getCuePointID <em>Cue Point ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cue Point ID</em>' attribute.
	 * @see #getCuePointID()
	 * @generated
	 */
	void setCuePointID(Long value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(byte[])
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkDataListType_Text()
	 * @model
	 * @generated
	 */
	byte[] getText();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkDataListType#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(byte[] value);

	/**
	 * Returns the value of the '<em><b>Text As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text As String</em>' attribute.
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkDataListType_TextAsString()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getTextAsString();

} // ChunkDataListType

/**
 * Copyright (c) 2009-2011 SKRATCHDOT.COM
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
 * A representation of the model object '<em><b>Chunk Unknown</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.ChunkUnknown#getData <em>Data</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkUnknown#getUnknownChunkTypeIdValue <em>Unknown Chunk Type Id Value</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkUnknown#getWavRandomAccessFilePointer <em>Wav Random Access File Pointer</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.riff.wav.WavPackage#getChunkUnknown()
 * @model
 * @generated
 */
public interface ChunkUnknown extends Chunk {

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(byte[])
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkUnknown_Data()
	 * @model
	 * @generated
	 */
	byte[] getData();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkUnknown#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(byte[] value);

	/**
	 * Returns the value of the '<em><b>Unknown Chunk Type Id Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unknown Chunk Type Id Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unknown Chunk Type Id Value</em>' attribute.
	 * @see #setUnknownChunkTypeIdValue(Long)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkUnknown_UnknownChunkTypeIdValue()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedInt"
	 * @generated
	 */
	Long getUnknownChunkTypeIdValue();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkUnknown#getUnknownChunkTypeIdValue <em>Unknown Chunk Type Id Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unknown Chunk Type Id Value</em>' attribute.
	 * @see #getUnknownChunkTypeIdValue()
	 * @generated
	 */
	void setUnknownChunkTypeIdValue(Long value);

	/**
	 * Returns the value of the '<em><b>Wav Random Access File Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wav Random Access File Pointer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wav Random Access File Pointer</em>' attribute.
	 * @see #setWavRandomAccessFilePointer(long)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkUnknown_WavRandomAccessFilePointer()
	 * @model
	 * @generated
	 */
	long getWavRandomAccessFilePointer();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkUnknown#getWavRandomAccessFilePointer <em>Wav Random Access File Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wav Random Access File Pointer</em>' attribute.
	 * @see #getWavRandomAccessFilePointer()
	 * @generated
	 */
	void setWavRandomAccessFilePointer(long value);
} // ChunkUnknown

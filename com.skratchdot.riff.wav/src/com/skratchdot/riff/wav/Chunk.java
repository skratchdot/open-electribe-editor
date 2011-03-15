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

import org.eclipse.emf.ecore.EObject;

import com.skratchdot.riff.wav.util.ExtendedByteBuffer;
import com.skratchdot.riff.wav.util.RiffWaveException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chunk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.Chunk#getBlockAlignedSize <em>Block Aligned Size</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.Chunk#getSize <em>Size</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.Chunk#getChunkTypeID <em>Chunk Type ID</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.Chunk#getChunkTypeIDValue <em>Chunk Type ID Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.riff.wav.WavPackage#getChunk()
 * @model abstract="true"
 * @generated
 */
public interface Chunk extends EObject {
	/**
	 * Returns the value of the '<em><b>Block Aligned Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block Aligned Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Aligned Size</em>' attribute.
	 * @see com.skratchdot.riff.wav.WavPackage#getChunk_BlockAlignedSize()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	long getBlockAlignedSize();

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see com.skratchdot.riff.wav.WavPackage#getChunk_Size()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	long getSize();

	/**
	 * Returns the value of the '<em><b>Chunk Type ID</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.riff.wav.ChunkTypeID}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chunk Type ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chunk Type ID</em>' attribute.
	 * @see com.skratchdot.riff.wav.ChunkTypeID
	 * @see com.skratchdot.riff.wav.WavPackage#getChunk_ChunkTypeID()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	ChunkTypeID getChunkTypeID();

	/**
	 * Returns the value of the '<em><b>Chunk Type ID Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chunk Type ID Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chunk Type ID Value</em>' attribute.
	 * @see com.skratchdot.riff.wav.WavPackage#getChunk_ChunkTypeIDValue()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getChunkTypeIDValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="com.skratchdot.riff.wav.RiffWaveException" bufDataType="com.skratchdot.riff.wav.ExtendedByteBuffer"
	 * @generated
	 */
	void init(RIFFWave riffWave, ExtendedByteBuffer buf) throws RiffWaveException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="com.skratchdot.riff.wav.RiffWaveException"
	 * @generated
	 */
	byte[] toByteArray() throws RiffWaveException;

} // Chunk

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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cue Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.CuePoint#getCuePointID <em>Cue Point ID</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.CuePoint#getPosition <em>Position</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.CuePoint#getDataChunkID <em>Data Chunk ID</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.CuePoint#getChunkStart <em>Chunk Start</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.CuePoint#getBlockStart <em>Block Start</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.CuePoint#getSampleOffset <em>Sample Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.riff.wav.WavPackage#getCuePoint()
 * @model
 * @generated
 */
public interface CuePoint extends EObject {
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
	 * @see com.skratchdot.riff.wav.WavPackage#getCuePoint_CuePointID()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedInt"
	 * @generated
	 */
	Long getCuePointID();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.CuePoint#getCuePointID <em>Cue Point ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cue Point ID</em>' attribute.
	 * @see #getCuePointID()
	 * @generated
	 */
	void setCuePointID(Long value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(Long)
	 * @see com.skratchdot.riff.wav.WavPackage#getCuePoint_Position()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedInt"
	 * @generated
	 */
	Long getPosition();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.CuePoint#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Long value);

	/**
	 * Returns the value of the '<em><b>Data Chunk ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Chunk ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Chunk ID</em>' attribute.
	 * @see #setDataChunkID(Long)
	 * @see com.skratchdot.riff.wav.WavPackage#getCuePoint_DataChunkID()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedInt"
	 * @generated
	 */
	Long getDataChunkID();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.CuePoint#getDataChunkID <em>Data Chunk ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Chunk ID</em>' attribute.
	 * @see #getDataChunkID()
	 * @generated
	 */
	void setDataChunkID(Long value);

	/**
	 * Returns the value of the '<em><b>Chunk Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chunk Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chunk Start</em>' attribute.
	 * @see #setChunkStart(Long)
	 * @see com.skratchdot.riff.wav.WavPackage#getCuePoint_ChunkStart()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedInt"
	 * @generated
	 */
	Long getChunkStart();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.CuePoint#getChunkStart <em>Chunk Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chunk Start</em>' attribute.
	 * @see #getChunkStart()
	 * @generated
	 */
	void setChunkStart(Long value);

	/**
	 * Returns the value of the '<em><b>Block Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Start</em>' attribute.
	 * @see #setBlockStart(Long)
	 * @see com.skratchdot.riff.wav.WavPackage#getCuePoint_BlockStart()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedInt"
	 * @generated
	 */
	Long getBlockStart();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.CuePoint#getBlockStart <em>Block Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Start</em>' attribute.
	 * @see #getBlockStart()
	 * @generated
	 */
	void setBlockStart(Long value);

	/**
	 * Returns the value of the '<em><b>Sample Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample Offset</em>' attribute.
	 * @see #setSampleOffset(Long)
	 * @see com.skratchdot.riff.wav.WavPackage#getCuePoint_SampleOffset()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedInt"
	 * @generated
	 */
	Long getSampleOffset();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.CuePoint#getSampleOffset <em>Sample Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample Offset</em>' attribute.
	 * @see #getSampleOffset()
	 * @generated
	 */
	void setSampleOffset(Long value);

} // CuePoint

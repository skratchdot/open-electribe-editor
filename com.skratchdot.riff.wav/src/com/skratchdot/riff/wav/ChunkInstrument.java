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
 * A representation of the model object '<em><b>Chunk Instrument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.ChunkInstrument#getUnshiftedNote <em>Unshifted Note</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkInstrument#getFineTune <em>Fine Tune</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkInstrument#getGain <em>Gain</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkInstrument#getLowNote <em>Low Note</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkInstrument#getHighNote <em>High Note</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkInstrument#getLowVelocity <em>Low Velocity</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkInstrument#getHighVelocity <em>High Velocity</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.riff.wav.WavPackage#getChunkInstrument()
 * @model
 * @generated
 */
public interface ChunkInstrument extends Chunk {
	/**
	 * Returns the value of the '<em><b>Unshifted Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unshifted Note</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unshifted Note</em>' attribute.
	 * @see #setUnshiftedNote(byte)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkInstrument_UnshiftedNote()
	 * @model
	 * @generated
	 */
	byte getUnshiftedNote();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkInstrument#getUnshiftedNote <em>Unshifted Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unshifted Note</em>' attribute.
	 * @see #getUnshiftedNote()
	 * @generated
	 */
	void setUnshiftedNote(byte value);

	/**
	 * Returns the value of the '<em><b>Fine Tune</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fine Tune</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fine Tune</em>' attribute.
	 * @see #setFineTune(byte)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkInstrument_FineTune()
	 * @model
	 * @generated
	 */
	byte getFineTune();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkInstrument#getFineTune <em>Fine Tune</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fine Tune</em>' attribute.
	 * @see #getFineTune()
	 * @generated
	 */
	void setFineTune(byte value);

	/**
	 * Returns the value of the '<em><b>Gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gain</em>' attribute.
	 * @see #setGain(byte)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkInstrument_Gain()
	 * @model
	 * @generated
	 */
	byte getGain();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkInstrument#getGain <em>Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gain</em>' attribute.
	 * @see #getGain()
	 * @generated
	 */
	void setGain(byte value);

	/**
	 * Returns the value of the '<em><b>Low Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low Note</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Note</em>' attribute.
	 * @see #setLowNote(byte)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkInstrument_LowNote()
	 * @model
	 * @generated
	 */
	byte getLowNote();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkInstrument#getLowNote <em>Low Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Note</em>' attribute.
	 * @see #getLowNote()
	 * @generated
	 */
	void setLowNote(byte value);

	/**
	 * Returns the value of the '<em><b>High Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High Note</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High Note</em>' attribute.
	 * @see #setHighNote(byte)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkInstrument_HighNote()
	 * @model
	 * @generated
	 */
	byte getHighNote();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkInstrument#getHighNote <em>High Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Note</em>' attribute.
	 * @see #getHighNote()
	 * @generated
	 */
	void setHighNote(byte value);

	/**
	 * Returns the value of the '<em><b>Low Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low Velocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Velocity</em>' attribute.
	 * @see #setLowVelocity(byte)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkInstrument_LowVelocity()
	 * @model
	 * @generated
	 */
	byte getLowVelocity();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkInstrument#getLowVelocity <em>Low Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Velocity</em>' attribute.
	 * @see #getLowVelocity()
	 * @generated
	 */
	void setLowVelocity(byte value);

	/**
	 * Returns the value of the '<em><b>High Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High Velocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High Velocity</em>' attribute.
	 * @see #setHighVelocity(byte)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkInstrument_HighVelocity()
	 * @model
	 * @generated
	 */
	byte getHighVelocity();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkInstrument#getHighVelocity <em>High Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Velocity</em>' attribute.
	 * @see #getHighVelocity()
	 * @generated
	 */
	void setHighVelocity(byte value);

} // ChunkInstrument

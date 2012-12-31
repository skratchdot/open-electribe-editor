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
 * A representation of the model object '<em><b>Chunk Silent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.ChunkSilent#getNumberOfSilentSamples <em>Number Of Silent Samples</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.riff.wav.WavPackage#getChunkSilent()
 * @model
 * @generated
 */
public interface ChunkSilent extends Chunk {
	/**
	 * Returns the value of the '<em><b>Number Of Silent Samples</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Silent Samples</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Silent Samples</em>' attribute.
	 * @see #setNumberOfSilentSamples(Long)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkSilent_NumberOfSilentSamples()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedInt"
	 * @generated
	 */
	Long getNumberOfSilentSamples();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkSilent#getNumberOfSilentSamples <em>Number Of Silent Samples</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Silent Samples</em>' attribute.
	 * @see #getNumberOfSilentSamples()
	 * @generated
	 */
	void setNumberOfSilentSamples(Long value);

} // ChunkSilent

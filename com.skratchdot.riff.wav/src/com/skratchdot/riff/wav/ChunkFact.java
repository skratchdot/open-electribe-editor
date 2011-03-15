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
 * A representation of the model object '<em><b>Chunk Fact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.ChunkFact#getFormatDependantData <em>Format Dependant Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.riff.wav.WavPackage#getChunkFact()
 * @model
 * @generated
 */
public interface ChunkFact extends Chunk {
	/**
	 * Returns the value of the '<em><b>Format Dependant Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format Dependant Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format Dependant Data</em>' attribute.
	 * @see #setFormatDependantData(byte[])
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkFact_FormatDependantData()
	 * @model
	 * @generated
	 */
	byte[] getFormatDependantData();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkFact#getFormatDependantData <em>Format Dependant Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format Dependant Data</em>' attribute.
	 * @see #getFormatDependantData()
	 * @generated
	 */
	void setFormatDependantData(byte[] value);

} // ChunkFact

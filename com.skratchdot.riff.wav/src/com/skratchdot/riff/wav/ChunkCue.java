/**
 * Copyright (c) 2010 SKRATCHDOT.COM
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

import java.io.IOException;

import com.skratchdot.riff.wav.util.WavRandomAccessFile;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chunk Cue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.ChunkCue#getNumberOfCuePoints <em>Number Of Cue Points</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkCue#getCuePoints <em>Cue Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.riff.wav.WavPackage#getChunkCue()
 * @model
 * @generated
 */
public interface ChunkCue extends Chunk {
	/**
	 * Returns the value of the '<em><b>Number Of Cue Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Cue Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Cue Points</em>' attribute.
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkCue_NumberOfCuePoints()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedInt" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Long getNumberOfCuePoints();

	/**
	 * Returns the value of the '<em><b>Cue Points</b></em>' reference list.
	 * The list contents are of type {@link com.skratchdot.riff.wav.CuePoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cue Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cue Points</em>' reference list.
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkCue_CuePoints()
	 * @model
	 * @generated
	 */
	EList<CuePoint> getCuePoints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="com.skratchdot.riff.wav.IOException" outDataType="com.skratchdot.riff.wav.WavRandomAccessFile"
	 * @generated
	 */
	void write(RIFFWave riffWave, WavRandomAccessFile out) throws IOException;

} // ChunkCue

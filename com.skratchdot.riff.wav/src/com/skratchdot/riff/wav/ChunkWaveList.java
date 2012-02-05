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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chunk Wave List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.ChunkWaveList#getAlternatingSilentAndDataChunks <em>Alternating Silent And Data Chunks</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.riff.wav.WavPackage#getChunkWaveList()
 * @model
 * @generated
 */
public interface ChunkWaveList extends Chunk {
	/**
	 * Returns the value of the '<em><b>Alternating Silent And Data Chunks</b></em>' containment reference list.
	 * The list contents are of type {@link com.skratchdot.riff.wav.Chunk}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternating Silent And Data Chunks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternating Silent And Data Chunks</em>' containment reference list.
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkWaveList_AlternatingSilentAndDataChunks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Chunk> getAlternatingSilentAndDataChunks();

} // ChunkWaveList

/**
 * Copyright (c) 2009-2010 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 *
 * $Id$
 */
package com.skratchdot.electribe.model.esx;

import java.io.IOException;

import com.skratchdot.electribe.model.esx.util.EsxException;
import com.skratchdot.electribe.model.esx.util.EsxRandomAccess;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Song Event Drum Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.SongEventDrumNote#getReservedByte <em>Reserved Byte</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.SongEventDrumNote#getReservedShort <em>Reserved Short</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSongEventDrumNote()
 * @model
 * @generated
 */
public interface SongEventDrumNote extends SongEvent, SongEventWithPart {
	/**
	 * Returns the value of the '<em><b>Reserved Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserved Byte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserved Byte</em>' attribute.
	 * @see #setReservedByte(byte)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSongEventDrumNote_ReservedByte()
	 * @model
	 * @generated
	 */
	byte getReservedByte();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.SongEventDrumNote#getReservedByte <em>Reserved Byte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved Byte</em>' attribute.
	 * @see #getReservedByte()
	 * @generated
	 */
	void setReservedByte(byte value);

	/**
	 * Returns the value of the '<em><b>Reserved Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserved Short</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserved Short</em>' attribute.
	 * @see #setReservedShort(short)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSongEventDrumNote_ReservedShort()
	 * @model
	 * @generated
	 */
	short getReservedShort();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.SongEventDrumNote#getReservedShort <em>Reserved Short</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved Short</em>' attribute.
	 * @see #getReservedShort()
	 * @generated
	 */
	void setReservedShort(short value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	byte[] toByteArray();

	void write(EsxRandomAccess out, int songEventNumber) throws EsxException, IOException;

} // SongEventDrumNote

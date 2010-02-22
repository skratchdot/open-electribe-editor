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



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Song Event Mute Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.SongEventMuteStatus#getReservedShort <em>Reserved Short</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.SongEventMuteStatus#getMuteStatus <em>Mute Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSongEventMuteStatus()
 * @model
 * @generated
 */
public interface SongEventMuteStatus extends SongEvent {
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
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSongEventMuteStatus_ReservedShort()
	 * @model
	 * @generated
	 */
	short getReservedShort();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.SongEventMuteStatus#getReservedShort <em>Reserved Short</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved Short</em>' attribute.
	 * @see #getReservedShort()
	 * @generated
	 */
	void setReservedShort(short value);

	/**
	 * Returns the value of the '<em><b>Mute Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mute Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mute Status</em>' attribute.
	 * @see #setMuteStatus(short)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSongEventMuteStatus_MuteStatus()
	 * @model
	 * @generated
	 */
	short getMuteStatus();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.SongEventMuteStatus#getMuteStatus <em>Mute Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mute Status</em>' attribute.
	 * @see #getMuteStatus()
	 * @generated
	 */
	void setMuteStatus(short value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void init(byte[] b);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	byte[] toByteArray();

} // SongEventMuteStatus

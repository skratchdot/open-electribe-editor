/**
 * Copyright (c) 2009, 2012 SKRATCHDOT.COM
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
 * A representation of the model object '<em><b>Song Event Tempo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.SongEventTempo#getReservedShort <em>Reserved Short</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.SongEventTempo#getTempo <em>Tempo</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSongEventTempo()
 * @model
 * @generated
 */
public interface SongEventTempo extends SongEvent {
	/**
	 * Returns the value of the '<em><b>Tempo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tempo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tempo</em>' containment reference.
	 * @see #setTempo(Tempo)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSongEventTempo_Tempo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Tempo getTempo();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.SongEventTempo#getTempo <em>Tempo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tempo</em>' containment reference.
	 * @see #getTempo()
	 * @generated
	 */
	void setTempo(Tempo value);

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
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSongEventTempo_ReservedShort()
	 * @model
	 * @generated
	 */
	short getReservedShort();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.SongEventTempo#getReservedShort <em>Reserved Short</em>}' attribute.
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
	void init(byte[] b);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	byte[] toByteArray();

} // SongEventTempo

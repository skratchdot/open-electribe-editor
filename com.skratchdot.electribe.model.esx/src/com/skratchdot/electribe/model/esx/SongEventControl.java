/*******************************************************************************
 * Copyright (c) 2009-2013 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 *******************************************************************************/
package com.skratchdot.electribe.model.esx;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Song Event Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.SongEventControl#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.SongEventControl#getReservedByte <em>Reserved Byte</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.SongEventControl#getReservedShort <em>Reserved Short</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.SongEventControl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSongEventControl()
 * @model
 * @generated
 */
public interface SongEventControl extends SongEvent {
	/**
	 * Returns the value of the '<em><b>Operation Type</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.OperationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Type</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.OperationType
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSongEventControl_OperationType()
	 * @model default="-1" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	OperationType getOperationType();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(byte)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSongEventControl_Value()
	 * @model
	 * @generated
	 */
	byte getValue();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.SongEventControl#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(byte value);

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
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSongEventControl_ReservedByte()
	 * @model
	 * @generated
	 */
	byte getReservedByte();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.SongEventControl#getReservedByte <em>Reserved Byte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved Byte</em>' attribute.
	 * @see #getReservedByte()
	 * @generated
	 */
	void setReservedByte(byte value);

	/**
	 * Returns the value of the '<em><b>Reserved Short</b></em>' attribute.
	 * The default value is <code>"-21846"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserved Short</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserved Short</em>' attribute.
	 * @see #setReservedShort(short)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSongEventControl_ReservedShort()
	 * @model default="-21846"
	 * @generated
	 */
	short getReservedShort();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.SongEventControl#getReservedShort <em>Reserved Short</em>}' attribute.
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

} // SongEventControl

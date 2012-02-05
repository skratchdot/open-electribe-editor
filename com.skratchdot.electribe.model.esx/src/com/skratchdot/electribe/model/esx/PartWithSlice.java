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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part With Slice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.PartWithSlice#getReservedByte <em>Reserved Byte</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.PartWithSlice#getSliceNumber <em>Slice Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartWithSlice()
 * @model abstract="true"
 * @generated
 */
public interface PartWithSlice extends EObject {
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
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartWithSlice_ReservedByte()
	 * @model
	 * @generated
	 */
	byte getReservedByte();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.PartWithSlice#getReservedByte <em>Reserved Byte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved Byte</em>' attribute.
	 * @see #getReservedByte()
	 * @generated
	 */
	void setReservedByte(byte value);

	/**
	 * Returns the value of the '<em><b>Slice Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slice Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slice Number</em>' attribute.
	 * @see #setSliceNumber(byte)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartWithSlice_SliceNumber()
	 * @model
	 * @generated
	 */
	byte getSliceNumber();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.PartWithSlice#getSliceNumber <em>Slice Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slice Number</em>' attribute.
	 * @see #getSliceNumber()
	 * @generated
	 */
	void setSliceNumber(byte value);

} // PartWithSlice

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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part With Sample</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.PartWithSample#getReverse <em>Reverse</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.PartWithSample#getSampleLabel <em>Sample Label</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.PartWithSample#getSamplePointer <em>Sample Pointer</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.PartWithSample#getStartPoint <em>Start Point</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.PartWithSample#getReservedBitsAfterReverse <em>Reserved Bits After Reverse</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartWithSample()
 * @model abstract="true"
 * @generated
 */
public interface PartWithSample extends EObject {
	/**
	 * Returns the value of the '<em><b>Reverse</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.Reverse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reverse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reverse</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.Reverse
	 * @see #setReverse(Reverse)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartWithSample_Reverse()
	 * @model
	 * @generated
	 */
	Reverse getReverse();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.PartWithSample#getReverse <em>Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reverse</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.Reverse
	 * @see #getReverse()
	 * @generated
	 */
	void setReverse(Reverse value);

	/**
	 * Returns the value of the '<em><b>Sample Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample Label</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartWithSample_SampleLabel()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getSampleLabel();

	/**
	 * Returns the value of the '<em><b>Sample Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample Pointer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample Pointer</em>' attribute.
	 * @see #setSamplePointer(short)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartWithSample_SamplePointer()
	 * @model
	 * @generated
	 */
	short getSamplePointer();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.PartWithSample#getSamplePointer <em>Sample Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample Pointer</em>' attribute.
	 * @see #getSamplePointer()
	 * @generated
	 */
	void setSamplePointer(short value);

	/**
	 * Returns the value of the '<em><b>Start Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Point</em>' attribute.
	 * @see #setStartPoint(byte)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartWithSample_StartPoint()
	 * @model
	 * @generated
	 */
	byte getStartPoint();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.PartWithSample#getStartPoint <em>Start Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Point</em>' attribute.
	 * @see #getStartPoint()
	 * @generated
	 */
	void setStartPoint(byte value);

	/**
	 * Returns the value of the '<em><b>Reserved Bits After Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserved Bits After Reverse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserved Bits After Reverse</em>' attribute.
	 * @see #setReservedBitsAfterReverse(byte)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartWithSample_ReservedBitsAfterReverse()
	 * @model
	 * @generated
	 */
	byte getReservedBitsAfterReverse();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.PartWithSample#getReservedBitsAfterReverse <em>Reserved Bits After Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved Bits After Reverse</em>' attribute.
	 * @see #getReservedBitsAfterReverse()
	 * @generated
	 */
	void setReservedBitsAfterReverse(byte value);

} // PartWithSample

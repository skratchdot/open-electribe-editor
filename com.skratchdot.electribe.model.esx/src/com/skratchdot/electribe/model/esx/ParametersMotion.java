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

import org.eclipse.emf.ecore.EObject;

import com.skratchdot.electribe.model.esx.util.EsxException;
import com.skratchdot.electribe.model.esx.util.EsxRandomAccess;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameters Motion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.ParametersMotion#getOperationNumber <em>Operation Number</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.ParametersMotion#getOperationValue <em>Operation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getParametersMotion()
 * @model
 * @generated
 */
public interface ParametersMotion extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Number</em>' attribute.
	 * @see #setOperationNumber(short)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getParametersMotion_OperationNumber()
	 * @model
	 * @generated
	 */
	short getOperationNumber();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.ParametersMotion#getOperationNumber <em>Operation Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Number</em>' attribute.
	 * @see #getOperationNumber()
	 * @generated
	 */
	void setOperationNumber(short value);

	/**
	 * Returns the value of the '<em><b>Operation Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Value</em>' attribute.
	 * @see #setOperationValue(byte[])
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getParametersMotion_OperationValue()
	 * @model
	 * @generated
	 */
	byte[] getOperationValue();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.ParametersMotion#getOperationValue <em>Operation Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Value</em>' attribute.
	 * @see #getOperationValue()
	 * @generated
	 */
	void setOperationValue(byte[] value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	byte[] toByteArray();

	void write(EsxRandomAccess out, int patternNumber, int parametersMotionNumber)  throws EsxException, IOException;

} // ParametersMotion

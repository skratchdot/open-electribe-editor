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
 * A representation of the model object '<em><b>Part With Sequence Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.PartWithSequenceData#getSequenceData <em>Sequence Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartWithSequenceData()
 * @model abstract="true"
 * @generated
 */
public interface PartWithSequenceData extends EObject {
	/**
	 * Returns the value of the '<em><b>Sequence Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Data</em>' containment reference.
	 * @see #setSequenceData(SequenceData)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartWithSequenceData_SequenceData()
	 * @model containment="true"
	 * @generated
	 */
	SequenceData getSequenceData();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.PartWithSequenceData#getSequenceData <em>Sequence Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Data</em>' containment reference.
	 * @see #getSequenceData()
	 * @generated
	 */
	void setSequenceData(SequenceData value);

} // PartWithSequenceData

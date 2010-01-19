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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.SequenceData#getSequenceData <em>Sequence Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSequenceData()
 * @model
 * @generated
 */
public interface SequenceData extends EObject {
	/**
	 * Returns the value of the '<em><b>Sequence Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Data</em>' attribute.
	 * @see #setSequenceData(byte[])
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSequenceData_SequenceData()
	 * @model
	 * @generated
	 */
	byte[] getSequenceData();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.SequenceData#getSequenceData <em>Sequence Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Data</em>' attribute.
	 * @see #getSequenceData()
	 * @generated
	 */
	void setSequenceData(byte[] value);

} // SequenceData

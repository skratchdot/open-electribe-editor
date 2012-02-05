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
 * A representation of the model object '<em><b>Part With Sequence Data Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.PartWithSequenceDataGate#getSequenceDataGate <em>Sequence Data Gate</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartWithSequenceDataGate()
 * @model abstract="true"
 * @generated
 */
public interface PartWithSequenceDataGate extends EObject {
	/**
	 * Returns the value of the '<em><b>Sequence Data Gate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Data Gate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Data Gate</em>' containment reference.
	 * @see #setSequenceDataGate(SequenceDataGate)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartWithSequenceDataGate_SequenceDataGate()
	 * @model containment="true"
	 * @generated
	 */
	SequenceDataGate getSequenceDataGate();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.PartWithSequenceDataGate#getSequenceDataGate <em>Sequence Data Gate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Data Gate</em>' containment reference.
	 * @see #getSequenceDataGate()
	 * @generated
	 */
	void setSequenceDataGate(SequenceDataGate value);

} // PartWithSequenceDataGate

/**
 * Copyright (c) 2009-2011 SKRATCHDOT.COM
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
 * A representation of the model object '<em><b>Sequence Data Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.SequenceDataGate#getSequenceDataGate <em>Sequence Data Gate</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSequenceDataGate()
 * @model
 * @generated
 */
public interface SequenceDataGate extends EObject {
	/**
	 * Returns the value of the '<em><b>Sequence Data Gate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Data Gate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Data Gate</em>' attribute.
	 * @see #setSequenceDataGate(byte[])
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSequenceDataGate_SequenceDataGate()
	 * @model
	 * @generated
	 */
	byte[] getSequenceDataGate();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.SequenceDataGate#getSequenceDataGate <em>Sequence Data Gate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Data Gate</em>' attribute.
	 * @see #getSequenceDataGate()
	 * @generated
	 */
	void setSequenceDataGate(byte[] value);

} // SequenceDataGate

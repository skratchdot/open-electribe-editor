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

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tempo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.Tempo#getPackedValue <em>Packed Value</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Tempo#getValue <em>Value</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Tempo#getValueLeft <em>Value Left</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Tempo#getValueRight <em>Value Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getTempo()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='validRange'"
 * @generated
 */
public interface Tempo extends EObject {
	/**
	 * Returns the value of the '<em><b>Packed Value</b></em>' attribute.
	 * The default value is <code>"15360"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packed Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packed Value</em>' attribute.
	 * @see #setPackedValue(int)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getTempo_PackedValue()
	 * @model default="15360" required="true"
	 * @generated
	 */
	int getPackedValue();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Tempo#getPackedValue <em>Packed Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packed Value</em>' attribute.
	 * @see #getPackedValue()
	 * @generated
	 */
	void setPackedValue(int value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"120.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getTempo_Value()
	 * @model default="120.0" required="true"
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Tempo#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

	/**
	 * Returns the value of the '<em><b>Value Left</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Left</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Left</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getTempo_ValueLeft()
	 * @model default="0" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getValueLeft();

	/**
	 * Returns the value of the '<em><b>Value Right</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Right</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Right</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getTempo_ValueRight()
	 * @model default="0" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getValueRight();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void updateValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void updatePackedValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean validValue(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Tempo

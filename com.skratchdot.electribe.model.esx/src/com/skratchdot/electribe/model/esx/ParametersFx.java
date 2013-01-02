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
 * A representation of the model object '<em><b>Parameters Fx</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.ParametersFx#getEffectType <em>Effect Type</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.ParametersFx#getEdit1 <em>Edit1</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.ParametersFx#getEdit2 <em>Edit2</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.ParametersFx#getMotionSequenceStatus <em>Motion Sequence Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getParametersFx()
 * @model
 * @generated
 */
public interface ParametersFx extends EObject {
	/**
	 * Returns the value of the '<em><b>Effect Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.FxType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect Type</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.FxType
	 * @see #setEffectType(FxType)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getParametersFx_EffectType()
	 * @model
	 * @generated
	 */
	FxType getEffectType();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.ParametersFx#getEffectType <em>Effect Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect Type</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.FxType
	 * @see #getEffectType()
	 * @generated
	 */
	void setEffectType(FxType value);

	/**
	 * Returns the value of the '<em><b>Edit1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edit1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit1</em>' attribute.
	 * @see #setEdit1(byte)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getParametersFx_Edit1()
	 * @model
	 * @generated
	 */
	byte getEdit1();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.ParametersFx#getEdit1 <em>Edit1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit1</em>' attribute.
	 * @see #getEdit1()
	 * @generated
	 */
	void setEdit1(byte value);

	/**
	 * Returns the value of the '<em><b>Edit2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edit2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit2</em>' attribute.
	 * @see #setEdit2(byte)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getParametersFx_Edit2()
	 * @model
	 * @generated
	 */
	byte getEdit2();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.ParametersFx#getEdit2 <em>Edit2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit2</em>' attribute.
	 * @see #getEdit2()
	 * @generated
	 */
	void setEdit2(byte value);

	/**
	 * Returns the value of the '<em><b>Motion Sequence Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motion Sequence Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motion Sequence Status</em>' attribute.
	 * @see #setMotionSequenceStatus(byte)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getParametersFx_MotionSequenceStatus()
	 * @model
	 * @generated
	 */
	byte getMotionSequenceStatus();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.ParametersFx#getMotionSequenceStatus <em>Motion Sequence Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motion Sequence Status</em>' attribute.
	 * @see #getMotionSequenceStatus()
	 * @generated
	 */
	void setMotionSequenceStatus(byte value);

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

} // ParametersFx

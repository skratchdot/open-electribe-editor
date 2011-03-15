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
 * A representation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.Part#getLabel <em>Label</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Part#getLevel <em>Level</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Part#getMotionSequenceStatus <em>Motion Sequence Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPart()
 * @model abstract="true"
 * @generated
 */
public interface Part extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPart_Label()
	 * @model default="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(byte)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPart_Level()
	 * @model
	 * @generated
	 */
	byte getLevel();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Part#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(byte value);

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
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPart_MotionSequenceStatus()
	 * @model
	 * @generated
	 */
	byte getMotionSequenceStatus();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Part#getMotionSequenceStatus <em>Motion Sequence Status</em>}' attribute.
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
	 * @model sampleNumberRequired="true"
	 * @generated
	 */
	String getSampleLabel(short sampleNumber);

} // Part

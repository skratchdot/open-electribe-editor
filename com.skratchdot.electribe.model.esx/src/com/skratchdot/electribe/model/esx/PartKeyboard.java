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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part Keyboard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.PartKeyboard#getGlide <em>Glide</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.PartKeyboard#getSequenceDataNote <em>Sequence Data Note</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartKeyboard()
 * @model
 * @generated
 */
public interface PartKeyboard extends Part, PartWithCommon, PartWithSample,
		PartWithSequenceDataGate, PartWithSlice {

	/**
	 * Returns the value of the '<em><b>Glide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glide</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glide</em>' attribute.
	 * @see #setGlide(byte)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartKeyboard_Glide()
	 * @model
	 * @generated
	 */
	byte getGlide();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.PartKeyboard#getGlide <em>Glide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glide</em>' attribute.
	 * @see #getGlide()
	 * @generated
	 */
	void setGlide(byte value);

	/**
	 * Returns the value of the '<em><b>Sequence Data Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Data Note</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Data Note</em>' containment reference.
	 * @see #setSequenceDataNote(SequenceDataNote)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartKeyboard_SequenceDataNote()
	 * @model containment="true"
	 * @generated
	 */
	SequenceDataNote getSequenceDataNote();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.PartKeyboard#getSequenceDataNote <em>Sequence Data Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Data Note</em>' containment reference.
	 * @see #getSequenceDataNote()
	 * @generated
	 */
	void setSequenceDataNote(SequenceDataNote value);

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

} // PartKeyboard

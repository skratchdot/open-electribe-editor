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
 * A representation of the model object '<em><b>Part Note Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.PartNoteNumber#getName <em>Name</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.PartNoteNumber#getNoteNumber <em>Note Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartNoteNumber()
 * @model
 * @generated
 */
public interface PartNoteNumber extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.PartNoteNumberName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.PartNoteNumberName
	 * @see #setName(PartNoteNumberName)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartNoteNumber_Name()
	 * @model
	 * @generated
	 */
	PartNoteNumberName getName();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.PartNoteNumber#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.PartNoteNumberName
	 * @see #getName()
	 * @generated
	 */
	void setName(PartNoteNumberName value);

	/**
	 * Returns the value of the '<em><b>Note Number</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.NoteNumber}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note Number</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.NoteNumber
	 * @see #setNoteNumber(NoteNumber)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartNoteNumber_NoteNumber()
	 * @model
	 * @generated
	 */
	NoteNumber getNoteNumber();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.PartNoteNumber#getNoteNumber <em>Note Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note Number</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.NoteNumber
	 * @see #getNoteNumber()
	 * @generated
	 */
	void setNoteNumber(NoteNumber value);

} // PartNoteNumber

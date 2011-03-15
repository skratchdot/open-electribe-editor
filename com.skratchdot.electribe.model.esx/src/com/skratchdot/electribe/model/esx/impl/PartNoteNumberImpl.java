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
package com.skratchdot.electribe.model.esx.impl;

import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.NoteNumber;
import com.skratchdot.electribe.model.esx.PartNoteNumber;

import com.skratchdot.electribe.model.esx.PartNoteNumberName;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part Note Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartNoteNumberImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartNoteNumberImpl#getNoteNumber <em>Note Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartNoteNumberImpl extends EObjectImpl implements PartNoteNumber {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final PartNoteNumberName NAME_EDEFAULT = PartNoteNumberName.NAME_00;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected PartNoteNumberName name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoteNumber() <em>Note Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteNumber()
	 * @generated
	 * @ordered
	 */
	protected static final NoteNumber NOTE_NUMBER_EDEFAULT = NoteNumber.CN1;

	/**
	 * The cached value of the '{@link #getNoteNumber() <em>Note Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteNumber()
	 * @generated
	 * @ordered
	 */
	protected NoteNumber noteNumber = NOTE_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartNoteNumberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsxPackage.Literals.PART_NOTE_NUMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartNoteNumberName getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(PartNoteNumberName newName) {
		PartNoteNumberName oldName = name;
		name = newName == null ? NAME_EDEFAULT : newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_NOTE_NUMBER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteNumber getNoteNumber() {
		return noteNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoteNumber(NoteNumber newNoteNumber) {
		NoteNumber oldNoteNumber = noteNumber;
		noteNumber = newNoteNumber == null ? NOTE_NUMBER_EDEFAULT : newNoteNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_NOTE_NUMBER__NOTE_NUMBER, oldNoteNumber, noteNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EsxPackage.PART_NOTE_NUMBER__NAME:
				return getName();
			case EsxPackage.PART_NOTE_NUMBER__NOTE_NUMBER:
				return getNoteNumber();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EsxPackage.PART_NOTE_NUMBER__NAME:
				setName((PartNoteNumberName)newValue);
				return;
			case EsxPackage.PART_NOTE_NUMBER__NOTE_NUMBER:
				setNoteNumber((NoteNumber)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EsxPackage.PART_NOTE_NUMBER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EsxPackage.PART_NOTE_NUMBER__NOTE_NUMBER:
				setNoteNumber(NOTE_NUMBER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EsxPackage.PART_NOTE_NUMBER__NAME:
				return name != NAME_EDEFAULT;
			case EsxPackage.PART_NOTE_NUMBER__NOTE_NUMBER:
				return noteNumber != NOTE_NUMBER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", noteNumber: ");
		result.append(noteNumber);
		result.append(')');
		return result.toString();
	}

} //PartNoteNumberImpl

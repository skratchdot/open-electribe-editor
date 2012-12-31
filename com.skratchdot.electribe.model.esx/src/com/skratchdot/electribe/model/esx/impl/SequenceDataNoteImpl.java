/*******************************************************************************
 * Copyright (c) 2009-2013 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 *******************************************************************************/
package com.skratchdot.electribe.model.esx.impl;

import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.SequenceDataNote;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Data Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SequenceDataNoteImpl#getSequenceDataNote <em>Sequence Data Note</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceDataNoteImpl extends EObjectImpl implements
		SequenceDataNote {
	/**
	 * The default value of the '{@link #getSequenceDataNote() <em>Sequence Data Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceDataNote()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] SEQUENCE_DATA_NOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSequenceDataNote() <em>Sequence Data Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceDataNote()
	 * @generated
	 * @ordered
	 */
	protected byte[] sequenceDataNote = SEQUENCE_DATA_NOTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceDataNoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsxPackage.Literals.SEQUENCE_DATA_NOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getSequenceDataNote() {
		return sequenceDataNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceDataNote(byte[] newSequenceDataNote) {
		byte[] oldSequenceDataNote = sequenceDataNote;
		sequenceDataNote = newSequenceDataNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.SEQUENCE_DATA_NOTE__SEQUENCE_DATA_NOTE,
					oldSequenceDataNote, sequenceDataNote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EsxPackage.SEQUENCE_DATA_NOTE__SEQUENCE_DATA_NOTE:
			return getSequenceDataNote();
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
		case EsxPackage.SEQUENCE_DATA_NOTE__SEQUENCE_DATA_NOTE:
			setSequenceDataNote((byte[]) newValue);
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
		case EsxPackage.SEQUENCE_DATA_NOTE__SEQUENCE_DATA_NOTE:
			setSequenceDataNote(SEQUENCE_DATA_NOTE_EDEFAULT);
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
		case EsxPackage.SEQUENCE_DATA_NOTE__SEQUENCE_DATA_NOTE:
			return SEQUENCE_DATA_NOTE_EDEFAULT == null ? sequenceDataNote != null
					: !SEQUENCE_DATA_NOTE_EDEFAULT.equals(sequenceDataNote);
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (sequenceDataNote: ");
		result.append(sequenceDataNote);
		result.append(')');
		return result.toString();
	}

} //SequenceDataNoteImpl

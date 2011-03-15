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
import com.skratchdot.electribe.model.esx.SequenceData;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SequenceDataImpl#getSequenceData <em>Sequence Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceDataImpl extends EObjectImpl implements SequenceData {
	/**
	 * The default value of the '{@link #getSequenceData() <em>Sequence Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceData()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] SEQUENCE_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSequenceData() <em>Sequence Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceData()
	 * @generated
	 * @ordered
	 */
	protected byte[] sequenceData = SEQUENCE_DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsxPackage.Literals.SEQUENCE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getSequenceData() {
		return sequenceData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceData(byte[] newSequenceData) {
		byte[] oldSequenceData = sequenceData;
		sequenceData = newSequenceData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SEQUENCE_DATA__SEQUENCE_DATA, oldSequenceData, sequenceData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EsxPackage.SEQUENCE_DATA__SEQUENCE_DATA:
				return getSequenceData();
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
			case EsxPackage.SEQUENCE_DATA__SEQUENCE_DATA:
				setSequenceData((byte[])newValue);
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
			case EsxPackage.SEQUENCE_DATA__SEQUENCE_DATA:
				setSequenceData(SEQUENCE_DATA_EDEFAULT);
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
			case EsxPackage.SEQUENCE_DATA__SEQUENCE_DATA:
				return SEQUENCE_DATA_EDEFAULT == null ? sequenceData != null : !SEQUENCE_DATA_EDEFAULT.equals(sequenceData);
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
		result.append(" (sequenceData: ");
		result.append(sequenceData);
		result.append(')');
		return result.toString();
	}

} //SequenceDataImpl

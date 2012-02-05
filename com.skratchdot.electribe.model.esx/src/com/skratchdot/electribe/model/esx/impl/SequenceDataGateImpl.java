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
package com.skratchdot.electribe.model.esx.impl;

import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.SequenceDataGate;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Data Gate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SequenceDataGateImpl#getSequenceDataGate <em>Sequence Data Gate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceDataGateImpl extends EObjectImpl implements SequenceDataGate {
	/**
	 * The default value of the '{@link #getSequenceDataGate() <em>Sequence Data Gate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceDataGate()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] SEQUENCE_DATA_GATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSequenceDataGate() <em>Sequence Data Gate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceDataGate()
	 * @generated
	 * @ordered
	 */
	protected byte[] sequenceDataGate = SEQUENCE_DATA_GATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceDataGateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsxPackage.Literals.SEQUENCE_DATA_GATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getSequenceDataGate() {
		return sequenceDataGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceDataGate(byte[] newSequenceDataGate) {
		byte[] oldSequenceDataGate = sequenceDataGate;
		sequenceDataGate = newSequenceDataGate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SEQUENCE_DATA_GATE__SEQUENCE_DATA_GATE, oldSequenceDataGate, sequenceDataGate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EsxPackage.SEQUENCE_DATA_GATE__SEQUENCE_DATA_GATE:
				return getSequenceDataGate();
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
			case EsxPackage.SEQUENCE_DATA_GATE__SEQUENCE_DATA_GATE:
				setSequenceDataGate((byte[])newValue);
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
			case EsxPackage.SEQUENCE_DATA_GATE__SEQUENCE_DATA_GATE:
				setSequenceDataGate(SEQUENCE_DATA_GATE_EDEFAULT);
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
			case EsxPackage.SEQUENCE_DATA_GATE__SEQUENCE_DATA_GATE:
				return SEQUENCE_DATA_GATE_EDEFAULT == null ? sequenceDataGate != null : !SEQUENCE_DATA_GATE_EDEFAULT.equals(sequenceDataGate);
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
		result.append(" (sequenceDataGate: ");
		result.append(sequenceDataGate);
		result.append(')');
		return result.toString();
	}

} //SequenceDataGateImpl

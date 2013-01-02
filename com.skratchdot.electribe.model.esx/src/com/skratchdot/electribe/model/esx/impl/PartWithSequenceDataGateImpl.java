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
import com.skratchdot.electribe.model.esx.PartWithSequenceDataGate;
import com.skratchdot.electribe.model.esx.SequenceDataGate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part With Sequence Data Gate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartWithSequenceDataGateImpl#getSequenceDataGate <em>Sequence Data Gate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PartWithSequenceDataGateImpl extends EObjectImpl
		implements PartWithSequenceDataGate {
	/**
	 * The cached value of the '{@link #getSequenceDataGate() <em>Sequence Data Gate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceDataGate()
	 * @generated
	 * @ordered
	 */
	protected SequenceDataGate sequenceDataGate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartWithSequenceDataGateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsxPackage.Literals.PART_WITH_SEQUENCE_DATA_GATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceDataGate getSequenceDataGate() {
		return sequenceDataGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceDataGate(
			SequenceDataGate newSequenceDataGate, NotificationChain msgs) {
		SequenceDataGate oldSequenceDataGate = sequenceDataGate;
		sequenceDataGate = newSequenceDataGate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					EsxPackage.PART_WITH_SEQUENCE_DATA_GATE__SEQUENCE_DATA_GATE,
					oldSequenceDataGate, newSequenceDataGate);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceDataGate(SequenceDataGate newSequenceDataGate) {
		if (newSequenceDataGate != sequenceDataGate) {
			NotificationChain msgs = null;
			if (sequenceDataGate != null)
				msgs = ((InternalEObject) sequenceDataGate)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- EsxPackage.PART_WITH_SEQUENCE_DATA_GATE__SEQUENCE_DATA_GATE,
								null, msgs);
			if (newSequenceDataGate != null)
				msgs = ((InternalEObject) newSequenceDataGate)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- EsxPackage.PART_WITH_SEQUENCE_DATA_GATE__SEQUENCE_DATA_GATE,
								null, msgs);
			msgs = basicSetSequenceDataGate(newSequenceDataGate, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					EsxPackage.PART_WITH_SEQUENCE_DATA_GATE__SEQUENCE_DATA_GATE,
					newSequenceDataGate, newSequenceDataGate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EsxPackage.PART_WITH_SEQUENCE_DATA_GATE__SEQUENCE_DATA_GATE:
			return basicSetSequenceDataGate(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EsxPackage.PART_WITH_SEQUENCE_DATA_GATE__SEQUENCE_DATA_GATE:
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
		case EsxPackage.PART_WITH_SEQUENCE_DATA_GATE__SEQUENCE_DATA_GATE:
			setSequenceDataGate((SequenceDataGate) newValue);
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
		case EsxPackage.PART_WITH_SEQUENCE_DATA_GATE__SEQUENCE_DATA_GATE:
			setSequenceDataGate((SequenceDataGate) null);
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
		case EsxPackage.PART_WITH_SEQUENCE_DATA_GATE__SEQUENCE_DATA_GATE:
			return sequenceDataGate != null;
		}
		return super.eIsSet(featureID);
	}

} //PartWithSequenceDataGateImpl

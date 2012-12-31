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
import com.skratchdot.electribe.model.esx.PartWithSequenceData;
import com.skratchdot.electribe.model.esx.SequenceData;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part With Sequence Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartWithSequenceDataImpl#getSequenceData <em>Sequence Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PartWithSequenceDataImpl extends EObjectImpl implements
		PartWithSequenceData {
	/**
	 * The cached value of the '{@link #getSequenceData() <em>Sequence Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceData()
	 * @generated
	 * @ordered
	 */
	protected SequenceData sequenceData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartWithSequenceDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsxPackage.Literals.PART_WITH_SEQUENCE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceData getSequenceData() {
		return sequenceData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceData(SequenceData newSequenceData,
			NotificationChain msgs) {
		SequenceData oldSequenceData = sequenceData;
		sequenceData = newSequenceData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					EsxPackage.PART_WITH_SEQUENCE_DATA__SEQUENCE_DATA,
					oldSequenceData, newSequenceData);
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
	public void setSequenceData(SequenceData newSequenceData) {
		if (newSequenceData != sequenceData) {
			NotificationChain msgs = null;
			if (sequenceData != null)
				msgs = ((InternalEObject) sequenceData)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- EsxPackage.PART_WITH_SEQUENCE_DATA__SEQUENCE_DATA,
								null, msgs);
			if (newSequenceData != null)
				msgs = ((InternalEObject) newSequenceData)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- EsxPackage.PART_WITH_SEQUENCE_DATA__SEQUENCE_DATA,
								null, msgs);
			msgs = basicSetSequenceData(newSequenceData, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PART_WITH_SEQUENCE_DATA__SEQUENCE_DATA,
					newSequenceData, newSequenceData));
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
		case EsxPackage.PART_WITH_SEQUENCE_DATA__SEQUENCE_DATA:
			return basicSetSequenceData(null, msgs);
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
		case EsxPackage.PART_WITH_SEQUENCE_DATA__SEQUENCE_DATA:
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
		case EsxPackage.PART_WITH_SEQUENCE_DATA__SEQUENCE_DATA:
			setSequenceData((SequenceData) newValue);
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
		case EsxPackage.PART_WITH_SEQUENCE_DATA__SEQUENCE_DATA:
			setSequenceData((SequenceData) null);
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
		case EsxPackage.PART_WITH_SEQUENCE_DATA__SEQUENCE_DATA:
			return sequenceData != null;
		}
		return super.eIsSet(featureID);
	}

} //PartWithSequenceDataImpl

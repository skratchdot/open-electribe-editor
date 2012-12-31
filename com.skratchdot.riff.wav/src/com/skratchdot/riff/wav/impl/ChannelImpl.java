/*******************************************************************************
 * Copyright (c) 2009-2013 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 *******************************************************************************/
package com.skratchdot.riff.wav.impl;

import com.skratchdot.riff.wav.Channel;
import com.skratchdot.riff.wav.SampleData;
import com.skratchdot.riff.wav.WavPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChannelImpl#getSampleData <em>Sample Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChannelImpl extends EObjectImpl implements Channel {
	/**
	 * The cached value of the '{@link #getSampleData() <em>Sample Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleData()
	 * @generated
	 * @ordered
	 */
	protected SampleData sampleData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavPackage.Literals.CHANNEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampleData getSampleData() {
		return sampleData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSampleData(SampleData newSampleData,
			NotificationChain msgs) {
		SampleData oldSampleData = sampleData;
		sampleData = newSampleData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, WavPackage.CHANNEL__SAMPLE_DATA,
					oldSampleData, newSampleData);
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
	public void setSampleData(SampleData newSampleData) {
		if (newSampleData != sampleData) {
			NotificationChain msgs = null;
			if (sampleData != null)
				msgs = ((InternalEObject) sampleData).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- WavPackage.CHANNEL__SAMPLE_DATA, null, msgs);
			if (newSampleData != null)
				msgs = ((InternalEObject) newSampleData).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- WavPackage.CHANNEL__SAMPLE_DATA, null, msgs);
			msgs = basicSetSampleData(newSampleData, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					WavPackage.CHANNEL__SAMPLE_DATA, newSampleData,
					newSampleData));
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
		case WavPackage.CHANNEL__SAMPLE_DATA:
			return basicSetSampleData(null, msgs);
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
		case WavPackage.CHANNEL__SAMPLE_DATA:
			return getSampleData();
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
		case WavPackage.CHANNEL__SAMPLE_DATA:
			setSampleData((SampleData) newValue);
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
		case WavPackage.CHANNEL__SAMPLE_DATA:
			setSampleData((SampleData) null);
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
		case WavPackage.CHANNEL__SAMPLE_DATA:
			return sampleData != null;
		}
		return super.eIsSet(featureID);
	}

} //ChannelImpl

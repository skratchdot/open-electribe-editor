/**
 * Copyright (c) 2009-2011 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Initial modeling finished using information provided by:
 * 	http://www.sonicspot.com/guide/wavefiles.html
 * 
 * Contributors:
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 *
 * $Id$
 */
package com.skratchdot.riff.wav.impl;

import com.skratchdot.riff.wav.SampleData16Bit;
import com.skratchdot.riff.wav.WavPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sample Data16 Bit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.impl.SampleData16BitImpl#getSample <em>Sample</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SampleData16BitImpl extends SampleDataImpl implements SampleData16Bit {
	/**
	 * The default value of the '{@link #getSample() <em>Sample</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSample()
	 * @generated
	 * @ordered
	 */
	protected static final short SAMPLE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSample() <em>Sample</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSample()
	 * @generated
	 * @ordered
	 */
	protected short sample = SAMPLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SampleData16BitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavPackage.Literals.SAMPLE_DATA16_BIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getSample() {
		return sample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSample(short newSample) {
		short oldSample = sample;
		sample = newSample;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.SAMPLE_DATA16_BIT__SAMPLE, oldSample, sample));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WavPackage.SAMPLE_DATA16_BIT__SAMPLE:
				return getSample();
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
			case WavPackage.SAMPLE_DATA16_BIT__SAMPLE:
				setSample((Short)newValue);
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
			case WavPackage.SAMPLE_DATA16_BIT__SAMPLE:
				setSample(SAMPLE_EDEFAULT);
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
			case WavPackage.SAMPLE_DATA16_BIT__SAMPLE:
				return sample != SAMPLE_EDEFAULT;
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
		result.append(" (sample: ");
		result.append(sample);
		result.append(')');
		return result.toString();
	}

} //SampleData16BitImpl

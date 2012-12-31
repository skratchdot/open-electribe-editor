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

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.SampleTune;
import com.skratchdot.electribe.model.esx.util.EsxUtil;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sample Tune</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SampleTuneImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SampleTuneImpl extends EObjectImpl implements SampleTune {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final float VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected float value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SampleTuneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsxPackage.Literals.SAMPLE_TUNE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(float newValue) {
		float oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.SAMPLE_TUNE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * Calculates the SampleTune value from the given sampleRate (using a
	 * baseSamplingRate of 44100)
	 * <p>Formula Used:</p>
	 * <table>
	 * <tr><td></td><td align="center">log(sampleRate/44100)</td><td></td></tr>
	 * <tr><td>12 *</td><td align="center">----------------------</td><td>= SampleTune</td></tr>
	 * <tr><td></td><td align="center">log(2)</td><td></td></tr>
	 * </table>
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public float calculateSampleTuneFromSampleRate(int sampleRate) {
		float x = ((float) sampleRate) / 44100;
		float y = (float) Math.log(x);
		float z = (float) (y / Math.log(2));
		BigDecimal bd = new BigDecimal(12 * z).setScale(2,
				RoundingMode.HALF_EVEN);
		return bd.floatValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public short getShortFromCurrentValue() {
		float sampleTuneAbsolute = Math.abs(this.getValue());
		int sampleTuneNegative = this.getValue() < 0 ? 1 : 0;
		int sampleTuneWhole = (int) (sampleTuneAbsolute / 1);
		int sampleTuneDecimal = (int) Math
				.round(((sampleTuneAbsolute - sampleTuneWhole) * 100f));

		// valid sampleTuneDecimal values are between 0-99
		if (sampleTuneDecimal > 99 || sampleTuneDecimal < 0) {
			sampleTuneDecimal = 0;
		}

		int packedShort = 0;
		packedShort = EsxUtil.packInt(packedShort, sampleTuneNegative, 1, 15);
		packedShort = EsxUtil.packInt(packedShort, sampleTuneWhole, 7, 8);
		packedShort = EsxUtil.packInt(packedShort, sampleTuneDecimal, 8, 0);
		return (short) packedShort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setCurrentValueFromShort(short packedShort) {
		byte sampleTuneNegative = (byte) EsxUtil.unpackInt(packedShort, 1, 15);
		byte sampleTuneWhole = (byte) EsxUtil.unpackInt(packedShort, 7, 8);
		byte sampleTuneDecimal = (byte) EsxUtil.unpackInt(packedShort, 8, 0);

		// valid sampleTuneDecimal values are between 0-99
		if (sampleTuneDecimal > 99 || sampleTuneDecimal < 0) {
			sampleTuneDecimal = 0;
		}

		// Now construct the float value as a string
		String sampleTuneAsString = "";
		if (sampleTuneNegative == 1 && sampleTuneWhole > 0) {
			sampleTuneAsString = "-";
		}
		sampleTuneAsString = sampleTuneAsString
				+ sampleTuneWhole
				+ "."
				+ StringUtils.leftPad(Integer.toString(sampleTuneDecimal), 2,
						"0");

		this.setValue(Float.parseFloat(sampleTuneAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EsxPackage.SAMPLE_TUNE__VALUE:
			return getValue();
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
		case EsxPackage.SAMPLE_TUNE__VALUE:
			setValue((Float) newValue);
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
		case EsxPackage.SAMPLE_TUNE__VALUE:
			setValue(VALUE_EDEFAULT);
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
		case EsxPackage.SAMPLE_TUNE__VALUE:
			return value != VALUE_EDEFAULT;
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //SampleTuneImpl

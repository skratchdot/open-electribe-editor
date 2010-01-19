/**
 * Copyright (c) 2009-2010 SKRATCHDOT.COM
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
import com.skratchdot.electribe.model.esx.Tempo;
import com.skratchdot.electribe.model.esx.util.EsxValidator;
import java.util.Map;
import com.skratchdot.electribe.model.esx.util.EsxUtil;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tempo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.TempoImpl#getPackedValue <em>Packed Value</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.TempoImpl#getValue <em>Value</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.TempoImpl#getValueLeft <em>Value Left</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.TempoImpl#getValueRight <em>Value Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TempoImpl extends EObjectImpl implements Tempo {
	/**
	 * The default value of the '{@link #getPackedValue() <em>Packed Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackedValue()
	 * @generated
	 * @ordered
	 */
	protected static final int PACKED_VALUE_EDEFAULT = 15360;

	/**
	 * The cached value of the '{@link #getPackedValue() <em>Packed Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackedValue()
	 * @generated
	 * @ordered
	 */
	protected int packedValue = PACKED_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final float VALUE_EDEFAULT = 120.0F;

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
	 * The default value of the '{@link #getValueLeft() <em>Value Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueLeft()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_LEFT_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getValueRight() <em>Value Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueRight()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_RIGHT_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TempoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsxPackage.Literals.TEMPO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPackedValue() {
		return packedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackedValue(int newPackedValue) {
		int oldPackedValue = packedValue;
		packedValue = newPackedValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.TEMPO__PACKED_VALUE, oldPackedValue, packedValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.TEMPO__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getValueLeft() {
		// TODO: implement this method to return the 'Value Left' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		return (int) (this.getValue() / 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getValueRight() {
		return (int) ((this.getValue() - this.getValueLeft()) * 10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void updateValue() {
		// iiiiiiii i000ffff
		int tempoWhole = EsxUtil.unpackInt(this.getPackedValue(), 9, 7);
		int tempoDecimal = EsxUtil.unpackInt(this.getPackedValue(), 4, 0);
		String tempoAsString = "" + tempoWhole + "." + tempoDecimal + "";
		Float tempoAsFloat = new Float(tempoAsString);
		this.setValue(tempoAsFloat.floatValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void updatePackedValue() {
		// iiiiiiii i000ffff
		int tempoWhole = this.getValueLeft();
		int tempoDecimal = this.getValueRight();
		int temp = this.getPackedValue();
		temp = EsxUtil.packInt(temp, tempoWhole, 9, 7);
		temp = EsxUtil.packInt(temp, tempoDecimal, 4, 0);
		this.setPackedValue(temp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (this.getValueLeft() < 20 ||
			this.getValueLeft() > 300 ||
			this.getValueRight() < 0 ||
			this.getValueRight() > 9
		) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EsxValidator.DIAGNOSTIC_SOURCE,
						 EsxValidator.TEMPO__VALID_VALUE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validValue", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EsxPackage.TEMPO__PACKED_VALUE:
				return getPackedValue();
			case EsxPackage.TEMPO__VALUE:
				return getValue();
			case EsxPackage.TEMPO__VALUE_LEFT:
				return getValueLeft();
			case EsxPackage.TEMPO__VALUE_RIGHT:
				return getValueRight();
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
			case EsxPackage.TEMPO__PACKED_VALUE:
				setPackedValue((Integer)newValue);
				return;
			case EsxPackage.TEMPO__VALUE:
				setValue((Float)newValue);
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
			case EsxPackage.TEMPO__PACKED_VALUE:
				setPackedValue(PACKED_VALUE_EDEFAULT);
				return;
			case EsxPackage.TEMPO__VALUE:
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
			case EsxPackage.TEMPO__PACKED_VALUE:
				return packedValue != PACKED_VALUE_EDEFAULT;
			case EsxPackage.TEMPO__VALUE:
				return value != VALUE_EDEFAULT;
			case EsxPackage.TEMPO__VALUE_LEFT:
				return getValueLeft() != VALUE_LEFT_EDEFAULT;
			case EsxPackage.TEMPO__VALUE_RIGHT:
				return getValueRight() != VALUE_RIGHT_EDEFAULT;
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
		result.append(" (packedValue: ");
		result.append(packedValue);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //TempoImpl

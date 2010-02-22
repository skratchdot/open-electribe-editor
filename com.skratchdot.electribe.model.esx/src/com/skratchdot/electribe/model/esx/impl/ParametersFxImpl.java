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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.FxType;
import com.skratchdot.electribe.model.esx.ParametersFx;
import com.skratchdot.electribe.model.esx.util.EsxUtil;
import com.skratchdot.electribe.model.esx.util.ExtendedByteBuffer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameters Fx</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.ParametersFxImpl#getEffectType <em>Effect Type</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.ParametersFxImpl#getEdit1 <em>Edit1</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.ParametersFxImpl#getEdit2 <em>Edit2</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.ParametersFxImpl#getMotionSequenceStatus <em>Motion Sequence Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParametersFxImpl extends EObjectImpl implements ParametersFx {
	/**
	 * The default value of the '{@link #getEffectType() <em>Effect Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectType()
	 * @generated
	 * @ordered
	 */
	protected static final FxType EFFECT_TYPE_EDEFAULT = FxType.REVERB;

	/**
	 * The cached value of the '{@link #getEffectType() <em>Effect Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectType()
	 * @generated
	 * @ordered
	 */
	protected FxType effectType = EFFECT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEdit1() <em>Edit1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdit1()
	 * @generated
	 * @ordered
	 */
	protected static final byte EDIT1_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getEdit1() <em>Edit1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdit1()
	 * @generated
	 * @ordered
	 */
	protected byte edit1 = EDIT1_EDEFAULT;

	/**
	 * The default value of the '{@link #getEdit2() <em>Edit2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdit2()
	 * @generated
	 * @ordered
	 */
	protected static final byte EDIT2_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getEdit2() <em>Edit2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdit2()
	 * @generated
	 * @ordered
	 */
	protected byte edit2 = EDIT2_EDEFAULT;

	/**
	 * The default value of the '{@link #getMotionSequenceStatus() <em>Motion Sequence Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotionSequenceStatus()
	 * @generated
	 * @ordered
	 */
	protected static final byte MOTION_SEQUENCE_STATUS_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getMotionSequenceStatus() <em>Motion Sequence Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotionSequenceStatus()
	 * @generated
	 * @ordered
	 */
	protected byte motionSequenceStatus = MOTION_SEQUENCE_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParametersFxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void init(byte[] b) {
		ExtendedByteBuffer in = new ExtendedByteBuffer(b);
		// byte 0
		this.setEffectType(FxType.get(in.getByte()));
		// byte 1
		this.setEdit1(in.getByte());
		// byte 2
		this.setEdit2(in.getByte());
		// byte 3
		this.setMotionSequenceStatus(in.getByte());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsxPackage.Literals.PARAMETERS_FX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FxType getEffectType() {
		return effectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectType(FxType newEffectType) {
		FxType oldEffectType = effectType;
		effectType = newEffectType == null ? EFFECT_TYPE_EDEFAULT : newEffectType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PARAMETERS_FX__EFFECT_TYPE, oldEffectType, effectType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getEdit1() {
		return edit1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdit1(byte newEdit1) {
		byte oldEdit1 = edit1;
		edit1 = newEdit1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PARAMETERS_FX__EDIT1, oldEdit1, edit1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getEdit2() {
		return edit2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdit2(byte newEdit2) {
		byte oldEdit2 = edit2;
		edit2 = newEdit2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PARAMETERS_FX__EDIT2, oldEdit2, edit2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getMotionSequenceStatus() {
		return motionSequenceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMotionSequenceStatus(byte newMotionSequenceStatus) {
		byte oldMotionSequenceStatus = motionSequenceStatus;
		motionSequenceStatus = newMotionSequenceStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PARAMETERS_FX__MOTION_SEQUENCE_STATUS, oldMotionSequenceStatus, motionSequenceStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public byte[] toByteArray() {
		ExtendedByteBuffer buf = new ExtendedByteBuffer(EsxUtil.CHUNKSIZE_PARAMETERS_FX);
		// byte 0
		buf.putUnsignedByte(this.getEffectType().getValue());
		// byte 1
		buf.putByte(this.getEdit1());
		// byte 2
		buf.putByte(this.getEdit2());
		// byte 3
		buf.putByte(this.getMotionSequenceStatus());
		return buf.array();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EsxPackage.PARAMETERS_FX__EFFECT_TYPE:
				return getEffectType();
			case EsxPackage.PARAMETERS_FX__EDIT1:
				return getEdit1();
			case EsxPackage.PARAMETERS_FX__EDIT2:
				return getEdit2();
			case EsxPackage.PARAMETERS_FX__MOTION_SEQUENCE_STATUS:
				return getMotionSequenceStatus();
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
			case EsxPackage.PARAMETERS_FX__EFFECT_TYPE:
				setEffectType((FxType)newValue);
				return;
			case EsxPackage.PARAMETERS_FX__EDIT1:
				setEdit1((Byte)newValue);
				return;
			case EsxPackage.PARAMETERS_FX__EDIT2:
				setEdit2((Byte)newValue);
				return;
			case EsxPackage.PARAMETERS_FX__MOTION_SEQUENCE_STATUS:
				setMotionSequenceStatus((Byte)newValue);
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
			case EsxPackage.PARAMETERS_FX__EFFECT_TYPE:
				setEffectType(EFFECT_TYPE_EDEFAULT);
				return;
			case EsxPackage.PARAMETERS_FX__EDIT1:
				setEdit1(EDIT1_EDEFAULT);
				return;
			case EsxPackage.PARAMETERS_FX__EDIT2:
				setEdit2(EDIT2_EDEFAULT);
				return;
			case EsxPackage.PARAMETERS_FX__MOTION_SEQUENCE_STATUS:
				setMotionSequenceStatus(MOTION_SEQUENCE_STATUS_EDEFAULT);
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
			case EsxPackage.PARAMETERS_FX__EFFECT_TYPE:
				return effectType != EFFECT_TYPE_EDEFAULT;
			case EsxPackage.PARAMETERS_FX__EDIT1:
				return edit1 != EDIT1_EDEFAULT;
			case EsxPackage.PARAMETERS_FX__EDIT2:
				return edit2 != EDIT2_EDEFAULT;
			case EsxPackage.PARAMETERS_FX__MOTION_SEQUENCE_STATUS:
				return motionSequenceStatus != MOTION_SEQUENCE_STATUS_EDEFAULT;
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
		result.append(" (effectType: ");
		result.append(effectType);
		result.append(", edit1: ");
		result.append(edit1);
		result.append(", edit2: ");
		result.append(edit2);
		result.append(", motionSequenceStatus: ");
		result.append(motionSequenceStatus);
		result.append(')');
		return result.toString();
	}

} //ParametersFxImpl

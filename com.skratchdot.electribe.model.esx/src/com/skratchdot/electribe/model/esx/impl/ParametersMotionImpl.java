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

import java.io.IOException;
import java.nio.ByteBuffer;

import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.ParametersMotion;
import com.skratchdot.electribe.model.esx.util.EsxException;
import com.skratchdot.electribe.model.esx.util.EsxRandomAccess;
import com.skratchdot.electribe.model.esx.util.EsxUtil;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameters Motion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.ParametersMotionImpl#getOperationNumber <em>Operation Number</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.ParametersMotionImpl#getOperationValue <em>Operation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParametersMotionImpl extends EObjectImpl implements ParametersMotion {
	/**
	 * The default value of the '{@link #getOperationNumber() <em>Operation Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationNumber()
	 * @generated
	 * @ordered
	 */
	protected static final short OPERATION_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOperationNumber() <em>Operation Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationNumber()
	 * @generated
	 * @ordered
	 */
	protected short operationNumber = OPERATION_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperationValue() <em>Operation Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationValue()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] OPERATION_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationValue() <em>Operation Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationValue()
	 * @generated
	 * @ordered
	 */
	protected byte[] operationValue = OPERATION_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParametersMotionImpl() {
		super();
	}

	public ParametersMotionImpl(EsxRandomAccess in, int patternNumber,
			int parametersMotionNumber) throws EsxException, IOException {
		super();

		// Stop immediately if we are passed an invalid patternNumber
		if (patternNumber >= EsxUtil.NUM_PATTERNS || patternNumber < 0)
			throw new EsxException("Invalid patternNumber: " + patternNumber);

		// Stop immediately if we are passed an invalid parametersMotionNumber
		if (parametersMotionNumber >= EsxUtil.NUM_PARAMETERS_MOTION || parametersMotionNumber < 0)
			throw new EsxException("Invalid parametersMotionNumber: " + parametersMotionNumber);

		// Jump to the start of parametersMotionNumber's data
		in.seek(EsxUtil.ADDR_PATTERN_DATA +
				(patternNumber * EsxUtil.CHUNKSIZE_PATTERN) +
				EsxUtil.PATTERN_OFFSET_PARAMETERS_MOTION +
				(parametersMotionNumber * EsxUtil.CHUNKSIZE_PARAMETERS_MOTION));

		// bytes 0~1
		this.setOperationNumber(in.readShort());

		// bytes 2~129
		byte[] tempBytes = new byte[EsxUtil.NUM_MOTION_OPERATIONS];
		in.readFully(tempBytes, 0, EsxUtil.NUM_MOTION_OPERATIONS);
		this.setOperationValue(tempBytes);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsxPackage.Literals.PARAMETERS_MOTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getOperationNumber() {
		return operationNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationNumber(short newOperationNumber) {
		short oldOperationNumber = operationNumber;
		operationNumber = newOperationNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PARAMETERS_MOTION__OPERATION_NUMBER, oldOperationNumber, operationNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getOperationValue() {
		return operationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationValue(byte[] newOperationValue) {
		byte[] oldOperationValue = operationValue;
		operationValue = newOperationValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PARAMETERS_MOTION__OPERATION_VALUE, oldOperationValue, operationValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public byte[] toByteArray() {
		ByteBuffer buf = ByteBuffer.allocate(EsxUtil.CHUNKSIZE_PARAMETERS_MOTION);
		// bytes 0~1
		buf.putShort(this.getOperationNumber());
		// bytes 2~129
		buf.put(this.getOperationValue());
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
			case EsxPackage.PARAMETERS_MOTION__OPERATION_NUMBER:
				return getOperationNumber();
			case EsxPackage.PARAMETERS_MOTION__OPERATION_VALUE:
				return getOperationValue();
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
			case EsxPackage.PARAMETERS_MOTION__OPERATION_NUMBER:
				setOperationNumber((Short)newValue);
				return;
			case EsxPackage.PARAMETERS_MOTION__OPERATION_VALUE:
				setOperationValue((byte[])newValue);
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
			case EsxPackage.PARAMETERS_MOTION__OPERATION_NUMBER:
				setOperationNumber(OPERATION_NUMBER_EDEFAULT);
				return;
			case EsxPackage.PARAMETERS_MOTION__OPERATION_VALUE:
				setOperationValue(OPERATION_VALUE_EDEFAULT);
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
			case EsxPackage.PARAMETERS_MOTION__OPERATION_NUMBER:
				return operationNumber != OPERATION_NUMBER_EDEFAULT;
			case EsxPackage.PARAMETERS_MOTION__OPERATION_VALUE:
				return OPERATION_VALUE_EDEFAULT == null ? operationValue != null : !OPERATION_VALUE_EDEFAULT.equals(operationValue);
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
		result.append(" (operationNumber: ");
		result.append(operationNumber);
		result.append(", operationValue: ");
		result.append(operationValue);
		result.append(')');
		return result.toString();
	}

	@Override
	public void write(EsxRandomAccess out, int patternNumber,
			int parametersMotionNumber) throws EsxException, IOException {

		// Stop immediately if we are passed an invalid patternNumber
		if (patternNumber >= EsxUtil.NUM_PATTERNS || patternNumber < 0)
			throw new EsxException("Invalid patternNumber: " + patternNumber);

		// Stop immediately if we are passed an invalid parametersMotionNumber
		if (parametersMotionNumber >= EsxUtil.NUM_PARAMETERS_MOTION || parametersMotionNumber < 0)
			throw new EsxException("Invalid parametersMotionNumber: " + parametersMotionNumber);

		// Jump to the start of parametersMotionNumber's data
		out.seek(EsxUtil.ADDR_PATTERN_DATA +
				(patternNumber * EsxUtil.CHUNKSIZE_PATTERN) +
				EsxUtil.PATTERN_OFFSET_PARAMETERS_MOTION +
				(parametersMotionNumber * EsxUtil.CHUNKSIZE_PARAMETERS_MOTION));

		// bytes 0~1
		out.writeShort(this.getOperationNumber());
		// bytes 2~129
		out.write(this.getOperationValue());

	}

} //ParametersMotionImpl

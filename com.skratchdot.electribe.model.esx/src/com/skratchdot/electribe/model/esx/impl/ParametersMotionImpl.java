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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.skratchdot.electribe.model.esx.EsxFactory;
import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.Operation;
import com.skratchdot.electribe.model.esx.OperationType;
import com.skratchdot.electribe.model.esx.ParametersMotion;
import com.skratchdot.electribe.model.esx.Pattern;
import com.skratchdot.electribe.model.esx.util.EsxUtil;
import com.skratchdot.electribe.model.esx.util.ExtendedByteBuffer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameters Motion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.ParametersMotionImpl#getCurrentPosition <em>Current Position</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.ParametersMotionImpl#isEmpty <em>Empty</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.ParametersMotionImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.ParametersMotionImpl#getOperationNumber <em>Operation Number</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.ParametersMotionImpl#getOperationType <em>Operation Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParametersMotionImpl extends EObjectImpl implements ParametersMotion {
	/**
	 * The default value of the '{@link #getCurrentPosition() <em>Current Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENT_POSITION_EDEFAULT = -1;

	/**
	 * The default value of the '{@link #isEmpty() <em>Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EMPTY_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operation;

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
	 * The default value of the '{@link #getOperationType() <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationType()
	 * @generated
	 * @ordered
	 */
	protected static final OperationType OPERATION_TYPE_EDEFAULT = OperationType.OP_UNKNOWN;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParametersMotionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void init(byte[] b) {
		ExtendedByteBuffer in = new ExtendedByteBuffer(b);
		// bytes 0~1
		this.setOperationNumber(in.getShort());
		// bytes 2~129
		for(int i=0; i<EsxUtil.NUM_MOTION_OPERATIONS; i++) {
			Operation tempOperation = EsxFactory.eINSTANCE.createOperation();
			tempOperation.setValue(in.getByte());
			this.getOperation().add(i, tempOperation);
		}
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
	 * @generated NOT
	 */
	public int getCurrentPosition() {
		EObject parent = this.eContainer();
		if(parent instanceof Pattern) {
			return ((Pattern) parent).getMotionParameters().indexOf(this) + 1;
		}
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isEmpty() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentEList<Operation>(Operation.class, this, EsxPackage.PARAMETERS_MOTION__OPERATION);
		}
		return operation;
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
	 * @generated NOT
	 */
	public OperationType getOperationType() {
		OperationType operationType = OperationType.get(this.getOperationNumber());
		return (operationType==null?OperationType.get(0):operationType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public byte[] toByteArray() {
		ExtendedByteBuffer buf = new ExtendedByteBuffer(EsxUtil.CHUNKSIZE_PARAMETERS_MOTION);
		// bytes 0~1
		buf.putShort(this.getOperationNumber());
		// bytes 2~129
		for(int i=0; i<EsxUtil.NUM_MOTION_OPERATIONS; i++) {
			buf.putByte(this.getOperation().get(i).getValue());
		}
		return buf.array();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsxPackage.PARAMETERS_MOTION__OPERATION:
				return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
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
			case EsxPackage.PARAMETERS_MOTION__CURRENT_POSITION:
				return getCurrentPosition();
			case EsxPackage.PARAMETERS_MOTION__EMPTY:
				return isEmpty();
			case EsxPackage.PARAMETERS_MOTION__OPERATION:
				return getOperation();
			case EsxPackage.PARAMETERS_MOTION__OPERATION_NUMBER:
				return getOperationNumber();
			case EsxPackage.PARAMETERS_MOTION__OPERATION_TYPE:
				return getOperationType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EsxPackage.PARAMETERS_MOTION__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends Operation>)newValue);
				return;
			case EsxPackage.PARAMETERS_MOTION__OPERATION_NUMBER:
				setOperationNumber((Short)newValue);
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
			case EsxPackage.PARAMETERS_MOTION__OPERATION:
				getOperation().clear();
				return;
			case EsxPackage.PARAMETERS_MOTION__OPERATION_NUMBER:
				setOperationNumber(OPERATION_NUMBER_EDEFAULT);
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
			case EsxPackage.PARAMETERS_MOTION__CURRENT_POSITION:
				return getCurrentPosition() != CURRENT_POSITION_EDEFAULT;
			case EsxPackage.PARAMETERS_MOTION__EMPTY:
				return isEmpty() != EMPTY_EDEFAULT;
			case EsxPackage.PARAMETERS_MOTION__OPERATION:
				return operation != null && !operation.isEmpty();
			case EsxPackage.PARAMETERS_MOTION__OPERATION_NUMBER:
				return operationNumber != OPERATION_NUMBER_EDEFAULT;
			case EsxPackage.PARAMETERS_MOTION__OPERATION_TYPE:
				return getOperationType() != OPERATION_TYPE_EDEFAULT;
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
		result.append(')');
		return result.toString();
	}

} //ParametersMotionImpl

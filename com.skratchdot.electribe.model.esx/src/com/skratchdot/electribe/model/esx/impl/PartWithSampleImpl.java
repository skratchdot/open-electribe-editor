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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.PartWithSample;
import com.skratchdot.electribe.model.esx.Reverse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part With Sample</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartWithSampleImpl#getReverse <em>Reverse</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartWithSampleImpl#getSampleLabel <em>Sample Label</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartWithSampleImpl#getSamplePointer <em>Sample Pointer</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartWithSampleImpl#getStartPoint <em>Start Point</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartWithSampleImpl#getReservedBitsAfterReverse <em>Reserved Bits After Reverse</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PartWithSampleImpl extends EObjectImpl implements
		PartWithSample {
	/**
	 * The default value of the '{@link #getReverse() <em>Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReverse()
	 * @generated
	 * @ordered
	 */
	protected static final Reverse REVERSE_EDEFAULT = Reverse.OFF;

	/**
	 * The cached value of the '{@link #getReverse() <em>Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReverse()
	 * @generated
	 * @ordered
	 */
	protected Reverse reverse = REVERSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSampleLabel() <em>Sample Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String SAMPLE_LABEL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSamplePointer() <em>Sample Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplePointer()
	 * @generated
	 * @ordered
	 */
	protected static final short SAMPLE_POINTER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSamplePointer() <em>Sample Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplePointer()
	 * @generated
	 * @ordered
	 */
	protected short samplePointer = SAMPLE_POINTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartPoint() <em>Start Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPoint()
	 * @generated
	 * @ordered
	 */
	protected static final byte START_POINT_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getStartPoint() <em>Start Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPoint()
	 * @generated
	 * @ordered
	 */
	protected byte startPoint = START_POINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getReservedBitsAfterReverse() <em>Reserved Bits After Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedBitsAfterReverse()
	 * @generated
	 * @ordered
	 */
	protected static final byte RESERVED_BITS_AFTER_REVERSE_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getReservedBitsAfterReverse() <em>Reserved Bits After Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedBitsAfterReverse()
	 * @generated
	 * @ordered
	 */
	protected byte reservedBitsAfterReverse = RESERVED_BITS_AFTER_REVERSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartWithSampleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsxPackage.Literals.PART_WITH_SAMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reverse getReverse() {
		return reverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReverse(Reverse newReverse) {
		Reverse oldReverse = reverse;
		reverse = newReverse == null ? REVERSE_EDEFAULT : newReverse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PART_WITH_SAMPLE__REVERSE, oldReverse, reverse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSampleLabel() {
		// TODO: implement this method to return the 'Sample Label' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getSamplePointer() {
		return samplePointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSamplePointer(short newSamplePointer) {
		short oldSamplePointer = samplePointer;
		samplePointer = newSamplePointer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PART_WITH_SAMPLE__SAMPLE_POINTER,
					oldSamplePointer, samplePointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getStartPoint() {
		return startPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartPoint(byte newStartPoint) {
		byte oldStartPoint = startPoint;
		startPoint = newStartPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PART_WITH_SAMPLE__START_POINT, oldStartPoint,
					startPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getReservedBitsAfterReverse() {
		return reservedBitsAfterReverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservedBitsAfterReverse(byte newReservedBitsAfterReverse) {
		byte oldReservedBitsAfterReverse = reservedBitsAfterReverse;
		reservedBitsAfterReverse = newReservedBitsAfterReverse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PART_WITH_SAMPLE__RESERVED_BITS_AFTER_REVERSE,
					oldReservedBitsAfterReverse, reservedBitsAfterReverse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EsxPackage.PART_WITH_SAMPLE__REVERSE:
			return getReverse();
		case EsxPackage.PART_WITH_SAMPLE__SAMPLE_LABEL:
			return getSampleLabel();
		case EsxPackage.PART_WITH_SAMPLE__SAMPLE_POINTER:
			return getSamplePointer();
		case EsxPackage.PART_WITH_SAMPLE__START_POINT:
			return getStartPoint();
		case EsxPackage.PART_WITH_SAMPLE__RESERVED_BITS_AFTER_REVERSE:
			return getReservedBitsAfterReverse();
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
		case EsxPackage.PART_WITH_SAMPLE__REVERSE:
			setReverse((Reverse) newValue);
			return;
		case EsxPackage.PART_WITH_SAMPLE__SAMPLE_POINTER:
			setSamplePointer((Short) newValue);
			return;
		case EsxPackage.PART_WITH_SAMPLE__START_POINT:
			setStartPoint((Byte) newValue);
			return;
		case EsxPackage.PART_WITH_SAMPLE__RESERVED_BITS_AFTER_REVERSE:
			setReservedBitsAfterReverse((Byte) newValue);
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
		case EsxPackage.PART_WITH_SAMPLE__REVERSE:
			setReverse(REVERSE_EDEFAULT);
			return;
		case EsxPackage.PART_WITH_SAMPLE__SAMPLE_POINTER:
			setSamplePointer(SAMPLE_POINTER_EDEFAULT);
			return;
		case EsxPackage.PART_WITH_SAMPLE__START_POINT:
			setStartPoint(START_POINT_EDEFAULT);
			return;
		case EsxPackage.PART_WITH_SAMPLE__RESERVED_BITS_AFTER_REVERSE:
			setReservedBitsAfterReverse(RESERVED_BITS_AFTER_REVERSE_EDEFAULT);
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
		case EsxPackage.PART_WITH_SAMPLE__REVERSE:
			return reverse != REVERSE_EDEFAULT;
		case EsxPackage.PART_WITH_SAMPLE__SAMPLE_LABEL:
			return SAMPLE_LABEL_EDEFAULT == null ? getSampleLabel() != null
					: !SAMPLE_LABEL_EDEFAULT.equals(getSampleLabel());
		case EsxPackage.PART_WITH_SAMPLE__SAMPLE_POINTER:
			return samplePointer != SAMPLE_POINTER_EDEFAULT;
		case EsxPackage.PART_WITH_SAMPLE__START_POINT:
			return startPoint != START_POINT_EDEFAULT;
		case EsxPackage.PART_WITH_SAMPLE__RESERVED_BITS_AFTER_REVERSE:
			return reservedBitsAfterReverse != RESERVED_BITS_AFTER_REVERSE_EDEFAULT;
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
		result.append(" (reverse: ");
		result.append(reverse);
		result.append(", samplePointer: ");
		result.append(samplePointer);
		result.append(", startPoint: ");
		result.append(startPoint);
		result.append(", reservedBitsAfterReverse: ");
		result.append(reservedBitsAfterReverse);
		result.append(')');
		return result.toString();
	}

} //PartWithSampleImpl

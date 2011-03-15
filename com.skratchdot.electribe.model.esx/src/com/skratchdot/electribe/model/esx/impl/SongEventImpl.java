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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.Song;
import com.skratchdot.electribe.model.esx.SongEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Song Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongEventImpl#getCurrentPosition <em>Current Position</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongEventImpl#getEventInfo <em>Event Info</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongEventImpl#getEventType <em>Event Type</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongEventImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongEventImpl#getOperationNumber <em>Operation Number</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongEventImpl#getPositionNumber <em>Position Number</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongEventImpl#getStep <em>Step</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SongEventImpl extends EObjectImpl implements SongEvent {
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
	 * The default value of the '{@link #getEventInfo() <em>Event Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_INFO_EDEFAULT = "-1";

	/**
	 * The default value of the '{@link #getEventType() <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventType()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_TYPE_EDEFAULT = "-1";

	/**
	 * The default value of the '{@link #getMeasure() <em>Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasure()
	 * @generated
	 * @ordered
	 */
	protected static final byte MEASURE_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getMeasure() <em>Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasure()
	 * @generated
	 * @ordered
	 */
	protected byte measure = MEASURE_EDEFAULT;

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
	 * The default value of the '{@link #getPositionNumber() <em>Position Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final byte POSITION_NUMBER_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getPositionNumber() <em>Position Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionNumber()
	 * @generated
	 * @ordered
	 */
	protected byte positionNumber = POSITION_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected static final byte STEP_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected byte step = STEP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SongEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsxPackage.Literals.SONG_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getCurrentPosition() {
		EObject parent = this.eContainer();
		if(parent instanceof Song) {
			return ((Song) parent).getSongEvents().indexOf(this) + 1;
		}
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getEventInfo() {
		// Implementation should be handled by subclasses
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getEventType() {
		// Implementation should be handled by subclasses
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getMeasure() {
		return measure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasure(byte newMeasure) {
		byte oldMeasure = measure;
		measure = newMeasure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SONG_EVENT__MEASURE, oldMeasure, measure));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SONG_EVENT__OPERATION_NUMBER, oldOperationNumber, operationNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getPositionNumber() {
		return positionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionNumber(byte newPositionNumber) {
		byte oldPositionNumber = positionNumber;
		positionNumber = newPositionNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SONG_EVENT__POSITION_NUMBER, oldPositionNumber, positionNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getStep() {
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStep(byte newStep) {
		byte oldStep = step;
		step = newStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SONG_EVENT__STEP, oldStep, step));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EsxPackage.SONG_EVENT__CURRENT_POSITION:
				return getCurrentPosition();
			case EsxPackage.SONG_EVENT__EVENT_INFO:
				return getEventInfo();
			case EsxPackage.SONG_EVENT__EVENT_TYPE:
				return getEventType();
			case EsxPackage.SONG_EVENT__MEASURE:
				return getMeasure();
			case EsxPackage.SONG_EVENT__OPERATION_NUMBER:
				return getOperationNumber();
			case EsxPackage.SONG_EVENT__POSITION_NUMBER:
				return getPositionNumber();
			case EsxPackage.SONG_EVENT__STEP:
				return getStep();
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
			case EsxPackage.SONG_EVENT__MEASURE:
				setMeasure((Byte)newValue);
				return;
			case EsxPackage.SONG_EVENT__OPERATION_NUMBER:
				setOperationNumber((Short)newValue);
				return;
			case EsxPackage.SONG_EVENT__POSITION_NUMBER:
				setPositionNumber((Byte)newValue);
				return;
			case EsxPackage.SONG_EVENT__STEP:
				setStep((Byte)newValue);
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
			case EsxPackage.SONG_EVENT__MEASURE:
				setMeasure(MEASURE_EDEFAULT);
				return;
			case EsxPackage.SONG_EVENT__OPERATION_NUMBER:
				setOperationNumber(OPERATION_NUMBER_EDEFAULT);
				return;
			case EsxPackage.SONG_EVENT__POSITION_NUMBER:
				setPositionNumber(POSITION_NUMBER_EDEFAULT);
				return;
			case EsxPackage.SONG_EVENT__STEP:
				setStep(STEP_EDEFAULT);
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
			case EsxPackage.SONG_EVENT__CURRENT_POSITION:
				return getCurrentPosition() != CURRENT_POSITION_EDEFAULT;
			case EsxPackage.SONG_EVENT__EVENT_INFO:
				return EVENT_INFO_EDEFAULT == null ? getEventInfo() != null : !EVENT_INFO_EDEFAULT.equals(getEventInfo());
			case EsxPackage.SONG_EVENT__EVENT_TYPE:
				return EVENT_TYPE_EDEFAULT == null ? getEventType() != null : !EVENT_TYPE_EDEFAULT.equals(getEventType());
			case EsxPackage.SONG_EVENT__MEASURE:
				return measure != MEASURE_EDEFAULT;
			case EsxPackage.SONG_EVENT__OPERATION_NUMBER:
				return operationNumber != OPERATION_NUMBER_EDEFAULT;
			case EsxPackage.SONG_EVENT__POSITION_NUMBER:
				return positionNumber != POSITION_NUMBER_EDEFAULT;
			case EsxPackage.SONG_EVENT__STEP:
				return step != STEP_EDEFAULT;
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
		result.append(" (measure: ");
		result.append(measure);
		result.append(", operationNumber: ");
		result.append(operationNumber);
		result.append(", positionNumber: ");
		result.append(positionNumber);
		result.append(", step: ");
		result.append(step);
		result.append(')');
		return result.toString();
	}

} //SongEventImpl

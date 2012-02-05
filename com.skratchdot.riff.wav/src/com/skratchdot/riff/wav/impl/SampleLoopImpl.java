/**
 * Copyright (c) 2009, 2012 SKRATCHDOT.COM
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

import com.skratchdot.riff.wav.SampleLoop;
import com.skratchdot.riff.wav.WavPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sample Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.impl.SampleLoopImpl#getCuePointID <em>Cue Point ID</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.SampleLoopImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.SampleLoopImpl#getStart <em>Start</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.SampleLoopImpl#getEnd <em>End</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.SampleLoopImpl#getFraction <em>Fraction</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.SampleLoopImpl#getPlayCount <em>Play Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SampleLoopImpl extends EObjectImpl implements SampleLoop {
	/**
	 * The default value of the '{@link #getCuePointID() <em>Cue Point ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCuePointID()
	 * @generated
	 * @ordered
	 */
	protected static final Long CUE_POINT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCuePointID() <em>Cue Point ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCuePointID()
	 * @generated
	 * @ordered
	 */
	protected Long cuePointID = CUE_POINT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Long TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Long type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final Long START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Long start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Long END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Long end = END_EDEFAULT;

	/**
	 * The default value of the '{@link #getFraction() <em>Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFraction()
	 * @generated
	 * @ordered
	 */
	protected static final Long FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFraction() <em>Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFraction()
	 * @generated
	 * @ordered
	 */
	protected Long fraction = FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlayCount() <em>Play Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long PLAY_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlayCount() <em>Play Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayCount()
	 * @generated
	 * @ordered
	 */
	protected Long playCount = PLAY_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SampleLoopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavPackage.Literals.SAMPLE_LOOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getCuePointID() {
		return cuePointID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCuePointID(Long newCuePointID) {
		Long oldCuePointID = cuePointID;
		cuePointID = newCuePointID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.SAMPLE_LOOP__CUE_POINT_ID, oldCuePointID, cuePointID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Long newType) {
		Long oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.SAMPLE_LOOP__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Long newStart) {
		Long oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.SAMPLE_LOOP__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Long newEnd) {
		Long oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.SAMPLE_LOOP__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getFraction() {
		return fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFraction(Long newFraction) {
		Long oldFraction = fraction;
		fraction = newFraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.SAMPLE_LOOP__FRACTION, oldFraction, fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getPlayCount() {
		return playCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlayCount(Long newPlayCount) {
		Long oldPlayCount = playCount;
		playCount = newPlayCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.SAMPLE_LOOP__PLAY_COUNT, oldPlayCount, playCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WavPackage.SAMPLE_LOOP__CUE_POINT_ID:
				return getCuePointID();
			case WavPackage.SAMPLE_LOOP__TYPE:
				return getType();
			case WavPackage.SAMPLE_LOOP__START:
				return getStart();
			case WavPackage.SAMPLE_LOOP__END:
				return getEnd();
			case WavPackage.SAMPLE_LOOP__FRACTION:
				return getFraction();
			case WavPackage.SAMPLE_LOOP__PLAY_COUNT:
				return getPlayCount();
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
			case WavPackage.SAMPLE_LOOP__CUE_POINT_ID:
				setCuePointID((Long)newValue);
				return;
			case WavPackage.SAMPLE_LOOP__TYPE:
				setType((Long)newValue);
				return;
			case WavPackage.SAMPLE_LOOP__START:
				setStart((Long)newValue);
				return;
			case WavPackage.SAMPLE_LOOP__END:
				setEnd((Long)newValue);
				return;
			case WavPackage.SAMPLE_LOOP__FRACTION:
				setFraction((Long)newValue);
				return;
			case WavPackage.SAMPLE_LOOP__PLAY_COUNT:
				setPlayCount((Long)newValue);
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
			case WavPackage.SAMPLE_LOOP__CUE_POINT_ID:
				setCuePointID(CUE_POINT_ID_EDEFAULT);
				return;
			case WavPackage.SAMPLE_LOOP__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case WavPackage.SAMPLE_LOOP__START:
				setStart(START_EDEFAULT);
				return;
			case WavPackage.SAMPLE_LOOP__END:
				setEnd(END_EDEFAULT);
				return;
			case WavPackage.SAMPLE_LOOP__FRACTION:
				setFraction(FRACTION_EDEFAULT);
				return;
			case WavPackage.SAMPLE_LOOP__PLAY_COUNT:
				setPlayCount(PLAY_COUNT_EDEFAULT);
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
			case WavPackage.SAMPLE_LOOP__CUE_POINT_ID:
				return CUE_POINT_ID_EDEFAULT == null ? cuePointID != null : !CUE_POINT_ID_EDEFAULT.equals(cuePointID);
			case WavPackage.SAMPLE_LOOP__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case WavPackage.SAMPLE_LOOP__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
			case WavPackage.SAMPLE_LOOP__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case WavPackage.SAMPLE_LOOP__FRACTION:
				return FRACTION_EDEFAULT == null ? fraction != null : !FRACTION_EDEFAULT.equals(fraction);
			case WavPackage.SAMPLE_LOOP__PLAY_COUNT:
				return PLAY_COUNT_EDEFAULT == null ? playCount != null : !PLAY_COUNT_EDEFAULT.equals(playCount);
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
		result.append(" (cuePointID: ");
		result.append(cuePointID);
		result.append(", type: ");
		result.append(type);
		result.append(", start: ");
		result.append(start);
		result.append(", end: ");
		result.append(end);
		result.append(", fraction: ");
		result.append(fraction);
		result.append(", playCount: ");
		result.append(playCount);
		result.append(')');
		return result.toString();
	}

} //SampleLoopImpl

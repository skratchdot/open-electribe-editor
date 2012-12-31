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

import com.skratchdot.riff.wav.Segment;
import com.skratchdot.riff.wav.WavPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.impl.SegmentImpl#getCuePointID <em>Cue Point ID</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.SegmentImpl#getLengthInSamples <em>Length In Samples</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.SegmentImpl#getNumberOfRepeats <em>Number Of Repeats</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SegmentImpl extends EObjectImpl implements Segment {
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
	 * The default value of the '{@link #getLengthInSamples() <em>Length In Samples</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLengthInSamples()
	 * @generated
	 * @ordered
	 */
	protected static final Long LENGTH_IN_SAMPLES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLengthInSamples() <em>Length In Samples</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLengthInSamples()
	 * @generated
	 * @ordered
	 */
	protected Long lengthInSamples = LENGTH_IN_SAMPLES_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfRepeats() <em>Number Of Repeats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRepeats()
	 * @generated
	 * @ordered
	 */
	protected static final Long NUMBER_OF_REPEATS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfRepeats() <em>Number Of Repeats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRepeats()
	 * @generated
	 * @ordered
	 */
	protected Long numberOfRepeats = NUMBER_OF_REPEATS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavPackage.Literals.SEGMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					WavPackage.SEGMENT__CUE_POINT_ID, oldCuePointID, cuePointID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getLengthInSamples() {
		return lengthInSamples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLengthInSamples(Long newLengthInSamples) {
		Long oldLengthInSamples = lengthInSamples;
		lengthInSamples = newLengthInSamples;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					WavPackage.SEGMENT__LENGTH_IN_SAMPLES, oldLengthInSamples,
					lengthInSamples));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getNumberOfRepeats() {
		return numberOfRepeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfRepeats(Long newNumberOfRepeats) {
		Long oldNumberOfRepeats = numberOfRepeats;
		numberOfRepeats = newNumberOfRepeats;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					WavPackage.SEGMENT__NUMBER_OF_REPEATS, oldNumberOfRepeats,
					numberOfRepeats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WavPackage.SEGMENT__CUE_POINT_ID:
			return getCuePointID();
		case WavPackage.SEGMENT__LENGTH_IN_SAMPLES:
			return getLengthInSamples();
		case WavPackage.SEGMENT__NUMBER_OF_REPEATS:
			return getNumberOfRepeats();
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
		case WavPackage.SEGMENT__CUE_POINT_ID:
			setCuePointID((Long) newValue);
			return;
		case WavPackage.SEGMENT__LENGTH_IN_SAMPLES:
			setLengthInSamples((Long) newValue);
			return;
		case WavPackage.SEGMENT__NUMBER_OF_REPEATS:
			setNumberOfRepeats((Long) newValue);
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
		case WavPackage.SEGMENT__CUE_POINT_ID:
			setCuePointID(CUE_POINT_ID_EDEFAULT);
			return;
		case WavPackage.SEGMENT__LENGTH_IN_SAMPLES:
			setLengthInSamples(LENGTH_IN_SAMPLES_EDEFAULT);
			return;
		case WavPackage.SEGMENT__NUMBER_OF_REPEATS:
			setNumberOfRepeats(NUMBER_OF_REPEATS_EDEFAULT);
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
		case WavPackage.SEGMENT__CUE_POINT_ID:
			return CUE_POINT_ID_EDEFAULT == null ? cuePointID != null
					: !CUE_POINT_ID_EDEFAULT.equals(cuePointID);
		case WavPackage.SEGMENT__LENGTH_IN_SAMPLES:
			return LENGTH_IN_SAMPLES_EDEFAULT == null ? lengthInSamples != null
					: !LENGTH_IN_SAMPLES_EDEFAULT.equals(lengthInSamples);
		case WavPackage.SEGMENT__NUMBER_OF_REPEATS:
			return NUMBER_OF_REPEATS_EDEFAULT == null ? numberOfRepeats != null
					: !NUMBER_OF_REPEATS_EDEFAULT.equals(numberOfRepeats);
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
		result.append(" (cuePointID: ");
		result.append(cuePointID);
		result.append(", lengthInSamples: ");
		result.append(lengthInSamples);
		result.append(", numberOfRepeats: ");
		result.append(numberOfRepeats);
		result.append(')');
		return result.toString();
	}

} //SegmentImpl

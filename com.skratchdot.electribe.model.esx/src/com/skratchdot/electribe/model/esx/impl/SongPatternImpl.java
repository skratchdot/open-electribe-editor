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
import com.skratchdot.electribe.model.esx.PatternNumber;
import com.skratchdot.electribe.model.esx.SongPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Song Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongPatternImpl#getPatternNumber <em>Pattern Number</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongPatternImpl#getNoteOffset <em>Note Offset</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongPatternImpl#isBeingUsed <em>Being Used</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SongPatternImpl extends EObjectImpl implements SongPattern {
	/**
	 * The default value of the '{@link #getPatternNumber() <em>Pattern Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternNumber()
	 * @generated
	 * @ordered
	 */
	protected static final PatternNumber PATTERN_NUMBER_EDEFAULT = PatternNumber.PATTERN_A01;

	/**
	 * The cached value of the '{@link #getPatternNumber() <em>Pattern Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternNumber()
	 * @generated
	 * @ordered
	 */
	protected PatternNumber patternNumber = PATTERN_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoteOffset() <em>Note Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteOffset()
	 * @generated
	 * @ordered
	 */
	protected static final byte NOTE_OFFSET_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getNoteOffset() <em>Note Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteOffset()
	 * @generated
	 * @ordered
	 */
	protected byte noteOffset = NOTE_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #isBeingUsed() <em>Being Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBeingUsed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BEING_USED_EDEFAULT = true;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SongPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsxPackage.Literals.SONG_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternNumber getPatternNumber() {
		return patternNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternNumber(PatternNumber newPatternNumber) {
		PatternNumber oldPatternNumber = patternNumber;
		patternNumber = newPatternNumber == null ? PATTERN_NUMBER_EDEFAULT : newPatternNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SONG_PATTERN__PATTERN_NUMBER, oldPatternNumber, patternNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getNoteOffset() {
		return noteOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoteOffset(byte newNoteOffset) {
		byte oldNoteOffset = noteOffset;
		noteOffset = newNoteOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SONG_PATTERN__NOTE_OFFSET, oldNoteOffset, noteOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isBeingUsed() {
		// TODO: This needs to be implemented. Should return true when position
		// is less than or equal to SongLength
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EsxPackage.SONG_PATTERN__PATTERN_NUMBER:
				return getPatternNumber();
			case EsxPackage.SONG_PATTERN__NOTE_OFFSET:
				return getNoteOffset();
			case EsxPackage.SONG_PATTERN__BEING_USED:
				return isBeingUsed();
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
			case EsxPackage.SONG_PATTERN__PATTERN_NUMBER:
				setPatternNumber((PatternNumber)newValue);
				return;
			case EsxPackage.SONG_PATTERN__NOTE_OFFSET:
				setNoteOffset((Byte)newValue);
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
			case EsxPackage.SONG_PATTERN__PATTERN_NUMBER:
				setPatternNumber(PATTERN_NUMBER_EDEFAULT);
				return;
			case EsxPackage.SONG_PATTERN__NOTE_OFFSET:
				setNoteOffset(NOTE_OFFSET_EDEFAULT);
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
			case EsxPackage.SONG_PATTERN__PATTERN_NUMBER:
				return patternNumber != PATTERN_NUMBER_EDEFAULT;
			case EsxPackage.SONG_PATTERN__NOTE_OFFSET:
				return noteOffset != NOTE_OFFSET_EDEFAULT;
			case EsxPackage.SONG_PATTERN__BEING_USED:
				return isBeingUsed() != BEING_USED_EDEFAULT;
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
		result.append(" (patternNumber: ");
		result.append(patternNumber);
		result.append(", noteOffset: ");
		result.append(noteOffset);
		result.append(')');
		return result.toString();
	}

} //SongPatternImpl

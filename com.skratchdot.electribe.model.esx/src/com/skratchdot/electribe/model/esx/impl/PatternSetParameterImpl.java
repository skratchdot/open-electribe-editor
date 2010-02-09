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
import org.eclipse.emf.ecore.resource.Resource;

import com.skratchdot.electribe.model.esx.EsxFile;
import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.PatternNumber;
import com.skratchdot.electribe.model.esx.PatternSetParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Set Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PatternSetParameterImpl#getPatternNumber <em>Pattern Number</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PatternSetParameterImpl#getPositionCurrent <em>Position Current</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PatternSetParameterImpl#getPositionOriginal <em>Position Original</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatternSetParameterImpl extends EObjectImpl implements PatternSetParameter {
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
	 * The default value of the '{@link #getPositionCurrent() <em>Position Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final int POSITION_CURRENT_EDEFAULT = -1;

	/**
	 * The default value of the '{@link #getPositionOriginal() <em>Position Original</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionOriginal()
	 * @generated
	 * @ordered
	 */
	protected static final int POSITION_ORIGINAL_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getPositionOriginal() <em>Position Original</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionOriginal()
	 * @generated
	 * @ordered
	 */
	protected int positionOriginal = POSITION_ORIGINAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternSetParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsxPackage.Literals.PATTERN_SET_PARAMETER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PATTERN_SET_PARAMETER__PATTERN_NUMBER, oldPatternNumber, patternNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getPositionCurrent() {
		if(this.eResource()!=null) {
			Resource resource = (Resource) this.eResource();
			Object rootObject = resource.getContents().get(0);
			if(rootObject instanceof EsxFile) {
				return ((EsxFile) rootObject).getGlobalParameters().getPatternSetParameters().indexOf(this);
			}
		}
		return -1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPositionOriginal() {
		return positionOriginal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionOriginal(int newPositionOriginal) {
		int oldPositionOriginal = positionOriginal;
		positionOriginal = newPositionOriginal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PATTERN_SET_PARAMETER__POSITION_ORIGINAL, oldPositionOriginal, positionOriginal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EsxPackage.PATTERN_SET_PARAMETER__PATTERN_NUMBER:
				return getPatternNumber();
			case EsxPackage.PATTERN_SET_PARAMETER__POSITION_CURRENT:
				return getPositionCurrent();
			case EsxPackage.PATTERN_SET_PARAMETER__POSITION_ORIGINAL:
				return getPositionOriginal();
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
			case EsxPackage.PATTERN_SET_PARAMETER__PATTERN_NUMBER:
				setPatternNumber((PatternNumber)newValue);
				return;
			case EsxPackage.PATTERN_SET_PARAMETER__POSITION_ORIGINAL:
				setPositionOriginal((Integer)newValue);
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
			case EsxPackage.PATTERN_SET_PARAMETER__PATTERN_NUMBER:
				setPatternNumber(PATTERN_NUMBER_EDEFAULT);
				return;
			case EsxPackage.PATTERN_SET_PARAMETER__POSITION_ORIGINAL:
				setPositionOriginal(POSITION_ORIGINAL_EDEFAULT);
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
			case EsxPackage.PATTERN_SET_PARAMETER__PATTERN_NUMBER:
				return patternNumber != PATTERN_NUMBER_EDEFAULT;
			case EsxPackage.PATTERN_SET_PARAMETER__POSITION_CURRENT:
				return getPositionCurrent() != POSITION_CURRENT_EDEFAULT;
			case EsxPackage.PATTERN_SET_PARAMETER__POSITION_ORIGINAL:
				return positionOriginal != POSITION_ORIGINAL_EDEFAULT;
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
		result.append(", positionOriginal: ");
		result.append(positionOriginal);
		result.append(')');
		return result.toString();
	}

} //PatternSetParameterImpl

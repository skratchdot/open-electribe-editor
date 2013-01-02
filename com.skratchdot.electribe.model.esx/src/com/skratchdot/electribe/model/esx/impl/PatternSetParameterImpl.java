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
import org.eclipse.emf.ecore.resource.Resource;

import com.skratchdot.electribe.model.esx.EsxFile;
import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.PatternSetParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Set Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PatternSetParameterImpl#getPositionCurrent <em>Position Current</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PatternSetParameterImpl#getPatternPointer <em>Pattern Pointer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatternSetParameterImpl extends EObjectImpl implements
		PatternSetParameter {
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
	 * The default value of the '{@link #getPatternPointer() <em>Pattern Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternPointer()
	 * @generated
	 * @ordered
	 */
	protected static final short PATTERN_POINTER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPatternPointer() <em>Pattern Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternPointer()
	 * @generated
	 * @ordered
	 */
	protected short patternPointer = PATTERN_POINTER_EDEFAULT;

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
	 * @generated NOT
	 */
	public int getPositionCurrent() {
		if (this.eResource() != null) {
			Resource resource = (Resource) this.eResource();
			Object rootObject = resource.getContents().get(0);
			if (rootObject instanceof EsxFile) {
				return ((EsxFile) rootObject).getGlobalParameters()
						.getPatternSetParameters().indexOf(this);
			}
		}
		return -1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getPatternPointer() {
		return patternPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternPointer(short newPatternPointer) {
		short oldPatternPointer = patternPointer;
		patternPointer = newPatternPointer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PATTERN_SET_PARAMETER__PATTERN_POINTER,
					oldPatternPointer, patternPointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EsxPackage.PATTERN_SET_PARAMETER__POSITION_CURRENT:
			return getPositionCurrent();
		case EsxPackage.PATTERN_SET_PARAMETER__PATTERN_POINTER:
			return getPatternPointer();
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
		case EsxPackage.PATTERN_SET_PARAMETER__PATTERN_POINTER:
			setPatternPointer((Short) newValue);
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
		case EsxPackage.PATTERN_SET_PARAMETER__PATTERN_POINTER:
			setPatternPointer(PATTERN_POINTER_EDEFAULT);
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
		case EsxPackage.PATTERN_SET_PARAMETER__POSITION_CURRENT:
			return getPositionCurrent() != POSITION_CURRENT_EDEFAULT;
		case EsxPackage.PATTERN_SET_PARAMETER__PATTERN_POINTER:
			return patternPointer != PATTERN_POINTER_EDEFAULT;
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
		result.append(" (patternPointer: ");
		result.append(patternPointer);
		result.append(')');
		return result.toString();
	}

} //PatternSetParameterImpl

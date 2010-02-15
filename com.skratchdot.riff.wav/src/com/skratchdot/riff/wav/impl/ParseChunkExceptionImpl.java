/**
 * Copyright (c) 2010 SKRATCHDOT.COM
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

import com.skratchdot.riff.wav.ParseChunkException;
import com.skratchdot.riff.wav.WavPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parse Chunk Exception</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.impl.ParseChunkExceptionImpl#getException <em>Exception</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ParseChunkExceptionImpl#getStringCause <em>String Cause</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ParseChunkExceptionImpl#getStringMessage <em>String Message</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ParseChunkExceptionImpl#getStringStackTrace <em>String Stack Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParseChunkExceptionImpl extends EObjectImpl implements ParseChunkException {
	/**
	 * The default value of the '{@link #getException() <em>Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getException()
	 * @generated
	 * @ordered
	 */
	protected static final Exception EXCEPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getException() <em>Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getException()
	 * @generated
	 * @ordered
	 */
	protected Exception exception = EXCEPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStringCause() <em>String Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringCause()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_CAUSE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStringMessage() <em>String Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_MESSAGE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStringStackTrace() <em>String Stack Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringStackTrace()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_STACK_TRACE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParseChunkExceptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavPackage.Literals.PARSE_CHUNK_EXCEPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exception getException() {
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setException(Exception newException) {
		Exception oldException = exception;
		exception = newException;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.PARSE_CHUNK_EXCEPTION__EXCEPTION, oldException, exception));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getStringCause() {
		return this.getException()==null?"":this.getException().getCause().toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getStringMessage() {
		return this.getException()==null?"":this.getException().getMessage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getStringStackTrace() {
		return this.getException()==null?"":this.getException().getStackTrace().toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WavPackage.PARSE_CHUNK_EXCEPTION__EXCEPTION:
				return getException();
			case WavPackage.PARSE_CHUNK_EXCEPTION__STRING_CAUSE:
				return getStringCause();
			case WavPackage.PARSE_CHUNK_EXCEPTION__STRING_MESSAGE:
				return getStringMessage();
			case WavPackage.PARSE_CHUNK_EXCEPTION__STRING_STACK_TRACE:
				return getStringStackTrace();
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
			case WavPackage.PARSE_CHUNK_EXCEPTION__EXCEPTION:
				setException((Exception)newValue);
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
			case WavPackage.PARSE_CHUNK_EXCEPTION__EXCEPTION:
				setException(EXCEPTION_EDEFAULT);
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
			case WavPackage.PARSE_CHUNK_EXCEPTION__EXCEPTION:
				return EXCEPTION_EDEFAULT == null ? exception != null : !EXCEPTION_EDEFAULT.equals(exception);
			case WavPackage.PARSE_CHUNK_EXCEPTION__STRING_CAUSE:
				return STRING_CAUSE_EDEFAULT == null ? getStringCause() != null : !STRING_CAUSE_EDEFAULT.equals(getStringCause());
			case WavPackage.PARSE_CHUNK_EXCEPTION__STRING_MESSAGE:
				return STRING_MESSAGE_EDEFAULT == null ? getStringMessage() != null : !STRING_MESSAGE_EDEFAULT.equals(getStringMessage());
			case WavPackage.PARSE_CHUNK_EXCEPTION__STRING_STACK_TRACE:
				return STRING_STACK_TRACE_EDEFAULT == null ? getStringStackTrace() != null : !STRING_STACK_TRACE_EDEFAULT.equals(getStringStackTrace());
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
		result.append(" (exception: ");
		result.append(exception);
		result.append(')');
		return result.toString();
	}

} //ParseChunkExceptionImpl

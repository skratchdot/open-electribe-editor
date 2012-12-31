/*******************************************************************************
 * Copyright (c) 2009-2013 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 *******************************************************************************/
package com.skratchdot.riff.wav;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parse Chunk Exception</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.ParseChunkException#getException <em>Exception</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ParseChunkException#getStringCause <em>String Cause</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ParseChunkException#getStringMessage <em>String Message</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ParseChunkException#getStringStackTrace <em>String Stack Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.riff.wav.WavPackage#getParseChunkException()
 * @model
 * @generated
 */
public interface ParseChunkException extends EObject {
	/**
	 * Returns the value of the '<em><b>Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception</em>' attribute.
	 * @see #setException(Exception)
	 * @see com.skratchdot.riff.wav.WavPackage#getParseChunkException_Exception()
	 * @model dataType="com.skratchdot.riff.wav.Exception"
	 * @generated
	 */
	Exception getException();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ParseChunkException#getException <em>Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception</em>' attribute.
	 * @see #getException()
	 * @generated
	 */
	void setException(Exception value);

	/**
	 * Returns the value of the '<em><b>String Cause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Cause</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Cause</em>' attribute.
	 * @see com.skratchdot.riff.wav.WavPackage#getParseChunkException_StringCause()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getStringCause();

	/**
	 * Returns the value of the '<em><b>String Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Message</em>' attribute.
	 * @see com.skratchdot.riff.wav.WavPackage#getParseChunkException_StringMessage()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getStringMessage();

	/**
	 * Returns the value of the '<em><b>String Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Stack Trace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Stack Trace</em>' attribute.
	 * @see com.skratchdot.riff.wav.WavPackage#getParseChunkException_StringStackTrace()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getStringStackTrace();

} // ParseChunkException

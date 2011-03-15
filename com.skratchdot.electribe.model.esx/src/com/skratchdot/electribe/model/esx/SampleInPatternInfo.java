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
package com.skratchdot.electribe.model.esx;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sample In Pattern Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.SampleInPatternInfo#getIndex <em>Index</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.SampleInPatternInfo#getPatternNumber <em>Pattern Number</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.SampleInPatternInfo#getPartCount <em>Part Count</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.SampleInPatternInfo#getPartList <em>Part List</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSampleInPatternInfo()
 * @model
 * @generated
 */
public interface SampleInPatternInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSampleInPatternInfo_Index()
	 * @model default="0"
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.SampleInPatternInfo#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

	/**
	 * Returns the value of the '<em><b>Pattern Number</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.PatternNumber}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Number</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.PatternNumber
	 * @see #setPatternNumber(PatternNumber)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSampleInPatternInfo_PatternNumber()
	 * @model
	 * @generated
	 */
	PatternNumber getPatternNumber();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.SampleInPatternInfo#getPatternNumber <em>Pattern Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Number</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.PatternNumber
	 * @see #getPatternNumber()
	 * @generated
	 */
	void setPatternNumber(PatternNumber value);

	/**
	 * Returns the value of the '<em><b>Part Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Count</em>' attribute.
	 * @see #setPartCount(int)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSampleInPatternInfo_PartCount()
	 * @model
	 * @generated
	 */
	int getPartCount();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.SampleInPatternInfo#getPartCount <em>Part Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Count</em>' attribute.
	 * @see #getPartCount()
	 * @generated
	 */
	void setPartCount(int value);

	/**
	 * Returns the value of the '<em><b>Part List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part List</em>' attribute.
	 * @see #setPartList(String)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSampleInPatternInfo_PartList()
	 * @model
	 * @generated
	 */
	String getPartList();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.SampleInPatternInfo#getPartList <em>Part List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part List</em>' attribute.
	 * @see #getPartList()
	 * @generated
	 */
	void setPartList(String value);

} // SampleInPatternInfo

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
package com.skratchdot.electribe.model.esx;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Set Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.PatternSetParameter#getPatternNumber <em>Pattern Number</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.PatternSetParameter#getPositionCurrent <em>Position Current</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.PatternSetParameter#getPositionOriginal <em>Position Original</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPatternSetParameter()
 * @model
 * @generated
 */
public interface PatternSetParameter extends EObject {
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
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPatternSetParameter_PatternNumber()
	 * @model
	 * @generated
	 */
	PatternNumber getPatternNumber();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.PatternSetParameter#getPatternNumber <em>Pattern Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Number</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.PatternNumber
	 * @see #getPatternNumber()
	 * @generated
	 */
	void setPatternNumber(PatternNumber value);

	/**
	 * Returns the value of the '<em><b>Position Current</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Current</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPatternSetParameter_PositionCurrent()
	 * @model default="-1" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getPositionCurrent();

	/**
	 * Returns the value of the '<em><b>Position Original</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Original</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Original</em>' attribute.
	 * @see #setPositionOriginal(int)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPatternSetParameter_PositionOriginal()
	 * @model default="-1"
	 * @generated
	 */
	int getPositionOriginal();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.PatternSetParameter#getPositionOriginal <em>Position Original</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Original</em>' attribute.
	 * @see #getPositionOriginal()
	 * @generated
	 */
	void setPositionOriginal(int value);

} // PatternSetParameter

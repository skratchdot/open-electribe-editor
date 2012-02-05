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
package com.skratchdot.riff.wav;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.Channel#getSampleData <em>Sample Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.riff.wav.WavPackage#getChannel()
 * @model
 * @generated
 */
public interface Channel extends EObject {
	/**
	 * Returns the value of the '<em><b>Sample Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample Data</em>' containment reference.
	 * @see #setSampleData(SampleData)
	 * @see com.skratchdot.riff.wav.WavPackage#getChannel_SampleData()
	 * @model containment="true"
	 * @generated
	 */
	SampleData getSampleData();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.Channel#getSampleData <em>Sample Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample Data</em>' containment reference.
	 * @see #getSampleData()
	 * @generated
	 */
	void setSampleData(SampleData value);

} // Channel

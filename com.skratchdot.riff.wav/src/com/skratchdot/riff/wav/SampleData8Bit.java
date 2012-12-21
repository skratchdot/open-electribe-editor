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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sample Data8 Bit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.SampleData8Bit#getSample <em>Sample</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.riff.wav.WavPackage#getSampleData8Bit()
 * @model
 * @generated
 */
public interface SampleData8Bit extends SampleData {
	/**
	 * Returns the value of the '<em><b>Sample</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample</em>' attribute.
	 * @see #setSample(byte)
	 * @see com.skratchdot.riff.wav.WavPackage#getSampleData8Bit_Sample()
	 * @model
	 * @generated
	 */
	byte getSample();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.SampleData8Bit#getSample <em>Sample</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample</em>' attribute.
	 * @see #getSample()
	 * @generated
	 */
	void setSample(byte value);

} // SampleData8Bit

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
package com.skratchdot.riff.wav;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.Segment#getCuePointID <em>Cue Point ID</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.Segment#getLengthInSamples <em>Length In Samples</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.Segment#getNumberOfRepeats <em>Number Of Repeats</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.riff.wav.WavPackage#getSegment()
 * @model
 * @generated
 */
public interface Segment extends EObject {
	/**
	 * Returns the value of the '<em><b>Cue Point ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cue Point ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cue Point ID</em>' attribute.
	 * @see #setCuePointID(Long)
	 * @see com.skratchdot.riff.wav.WavPackage#getSegment_CuePointID()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedInt"
	 * @generated
	 */
	Long getCuePointID();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.Segment#getCuePointID <em>Cue Point ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cue Point ID</em>' attribute.
	 * @see #getCuePointID()
	 * @generated
	 */
	void setCuePointID(Long value);

	/**
	 * Returns the value of the '<em><b>Length In Samples</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length In Samples</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length In Samples</em>' attribute.
	 * @see #setLengthInSamples(Long)
	 * @see com.skratchdot.riff.wav.WavPackage#getSegment_LengthInSamples()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedInt"
	 * @generated
	 */
	Long getLengthInSamples();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.Segment#getLengthInSamples <em>Length In Samples</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length In Samples</em>' attribute.
	 * @see #getLengthInSamples()
	 * @generated
	 */
	void setLengthInSamples(Long value);

	/**
	 * Returns the value of the '<em><b>Number Of Repeats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Repeats</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Repeats</em>' attribute.
	 * @see #setNumberOfRepeats(Long)
	 * @see com.skratchdot.riff.wav.WavPackage#getSegment_NumberOfRepeats()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedInt"
	 * @generated
	 */
	Long getNumberOfRepeats();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.Segment#getNumberOfRepeats <em>Number Of Repeats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Repeats</em>' attribute.
	 * @see #getNumberOfRepeats()
	 * @generated
	 */
	void setNumberOfRepeats(Long value);

} // Segment

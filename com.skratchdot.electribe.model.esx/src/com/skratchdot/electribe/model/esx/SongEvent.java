/**
 * Copyright (c) 2009, 2012 SKRATCHDOT.COM
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
 * A representation of the model object '<em><b>Song Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.SongEvent#getCurrentPosition <em>Current Position</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.SongEvent#getEventInfo <em>Event Info</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.SongEvent#getEventType <em>Event Type</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.SongEvent#getMeasure <em>Measure</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.SongEvent#getOperationNumber <em>Operation Number</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.SongEvent#getPositionNumber <em>Position Number</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.SongEvent#getStep <em>Step</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSongEvent()
 * @model abstract="true"
 * @generated
 */
public interface SongEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Current Position</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Position</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSongEvent_CurrentPosition()
	 * @model default="-1" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getCurrentPosition();

	/**
	 * Returns the value of the '<em><b>Event Info</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Info</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSongEvent_EventInfo()
	 * @model default="-1" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getEventInfo();

	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSongEvent_EventType()
	 * @model default="-1" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getEventType();

	/**
	 * Returns the value of the '<em><b>Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure</em>' attribute.
	 * @see #setMeasure(byte)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSongEvent_Measure()
	 * @model
	 * @generated
	 */
	byte getMeasure();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.SongEvent#getMeasure <em>Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure</em>' attribute.
	 * @see #getMeasure()
	 * @generated
	 */
	void setMeasure(byte value);

	/**
	 * Returns the value of the '<em><b>Operation Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Number</em>' attribute.
	 * @see #setOperationNumber(short)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSongEvent_OperationNumber()
	 * @model
	 * @generated
	 */
	short getOperationNumber();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.SongEvent#getOperationNumber <em>Operation Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Number</em>' attribute.
	 * @see #getOperationNumber()
	 * @generated
	 */
	void setOperationNumber(short value);

	/**
	 * Returns the value of the '<em><b>Position Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Number</em>' attribute.
	 * @see #setPositionNumber(byte)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSongEvent_PositionNumber()
	 * @model
	 * @generated
	 */
	byte getPositionNumber();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.SongEvent#getPositionNumber <em>Position Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Number</em>' attribute.
	 * @see #getPositionNumber()
	 * @generated
	 */
	void setPositionNumber(byte value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' attribute.
	 * @see #setStep(byte)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSongEvent_Step()
	 * @model
	 * @generated
	 */
	byte getStep();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.SongEvent#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' attribute.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(byte value);

} // SongEvent

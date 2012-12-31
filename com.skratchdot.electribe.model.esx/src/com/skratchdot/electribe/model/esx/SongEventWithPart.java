/*******************************************************************************
 * Copyright (c) 2009-2013 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 *******************************************************************************/
package com.skratchdot.electribe.model.esx;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Song Event With Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.SongEventWithPart#getPart <em>Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSongEventWithPart()
 * @model abstract="true"
 * @generated
 */
public interface SongEventWithPart extends EObject {
	/**
	 * Returns the value of the '<em><b>Part</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.SongEventPart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.SongEventPart
	 * @see #setPart(SongEventPart)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSongEventWithPart_Part()
	 * @model
	 * @generated
	 */
	SongEventPart getPart();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.SongEventWithPart#getPart <em>Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.SongEventPart
	 * @see #getPart()
	 * @generated
	 */
	void setPart(SongEventPart value);

} // SongEventWithPart

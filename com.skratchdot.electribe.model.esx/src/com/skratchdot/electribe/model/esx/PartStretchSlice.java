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



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part Stretch Slice</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartStretchSlice()
 * @model
 * @generated
 */
public interface PartStretchSlice extends Part, PartWithCommon, PartWithPitch, PartWithSample, PartWithSequenceData {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void init(byte[] b);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	byte[] toByteArray();

} // PartStretchSlice

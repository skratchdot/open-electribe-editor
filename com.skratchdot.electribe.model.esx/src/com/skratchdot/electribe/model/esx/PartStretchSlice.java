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

import java.io.IOException;

import com.skratchdot.electribe.model.esx.util.EsxException;
import com.skratchdot.electribe.model.esx.util.EsxRandomAccess;


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

	void write(EsxRandomAccess out, int patternNumber, int partStretchSliceNumber)  throws EsxException, IOException;

} // PartStretchSlice

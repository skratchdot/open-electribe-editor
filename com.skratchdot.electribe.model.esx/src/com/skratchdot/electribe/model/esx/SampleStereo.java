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
 * A representation of the model object '<em><b>Sample Stereo</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSampleStereo()
 * @model
 * @generated
 */
public interface SampleStereo extends Sample {

	void writeHeader(EsxRandomAccess out, int stereoSampleNumber) throws EsxException, IOException;

} // SampleStereo

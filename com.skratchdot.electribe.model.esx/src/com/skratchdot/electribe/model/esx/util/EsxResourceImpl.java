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
package com.skratchdot.electribe.model.esx.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

import com.skratchdot.electribe.model.esx.EsxFactory;
import com.skratchdot.electribe.model.esx.EsxFile;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see com.skratchdot.electribe.model.esx.util.EsxResourceFactoryImpl
 * @generated
 */
public class EsxResourceImpl extends ResourceImpl {
	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
	public EsxResourceImpl(URI uri) {
		super(uri);
	}

	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options)
			throws IOException {
		IProgressMonitor monitor;
		// Get IProgressMonitor from options, else create one
		if(options.containsKey("IProgressMonitor")) {
			monitor = (IProgressMonitor) options.get("IProgressMonitor");
		}
		else {
			monitor = new NullProgressMonitor();
		}

		// Setup monitor
		monitor.beginTask("Loading ESX file...", 3 +
			EsxUtil.NUM_PATTERNS +
			EsxUtil.NUM_SONGS +
			EsxUtil.NUM_SONGS + // Song Event Data
			EsxUtil.NUM_SAMPLES +
			EsxUtil.NUM_SLICE_DATA +
			EsxUtil.NUM_SAMPLES
		);
		
		// Setup esxFileBytes
		monitor.subTask("Getting contents...");
		monitor.worked(1);
		byte[] esxFileBytes = EsxUtil.inputStreamToByteArray(inputStream);

		// Confirm bytes are valid
		EsxUtil.isValidEsxFile(esxFileBytes);

		// Now create the EsxFile
		EsxFile esxFile = EsxFactory.eINSTANCE.createEsxFile();
		esxFile.init(esxFileBytes, monitor);
		this.getContents().add(esxFile);
		monitor.worked(1);

		// We have finished loading
		monitor.done();
	}

	@Override
	protected void doSave(OutputStream outputStream, Map<?, ?> options)
			throws IOException {
		IProgressMonitor monitor;
		// Get IProgressMonitor from options, else create one
		if(options.containsKey("IProgressMonitor")) {
			monitor = (IProgressMonitor) options.get("IProgressMonitor");
		}
		else {
			monitor = new NullProgressMonitor();
		}

		// Setup monitor
		monitor.beginTask("Saving ESX file...", 3 +
			EsxUtil.NUM_PATTERNS +
			EsxUtil.NUM_SONGS +
			EsxUtil.NUM_SONGS + // Song Event Data
			EsxUtil.NUM_SAMPLES_MONO +
			EsxUtil.NUM_SAMPLES_STEREO
		);

		// Get our models root object (the EsxFile)
		monitor.subTask("Getting contents...");
		monitor.worked(1);
		EsxFile esxFile = (EsxFile) this.getContents().get(0);

		// Begin writing
		monitor.subTask("Begin writing");
		monitor.worked(1);

		// Now write the byte array to our outputStream
		outputStream.write(esxFile.toByteArray(monitor));

		// Write our constructed EsxRandomAccess to the outputStream
		monitor.subTask("Finishing up");
		monitor.worked(1);

		// We have finished saving
		monitor.done();
	}

} //EsxResourceImpl

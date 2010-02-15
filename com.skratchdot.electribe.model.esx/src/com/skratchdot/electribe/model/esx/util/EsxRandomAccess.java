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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

import org.eclipse.core.runtime.IProgressMonitor;

public class EsxRandomAccess extends RandomAccessFile {

	public EsxRandomAccess(File file, String mode) throws FileNotFoundException {
		super(file, mode);
	}

	public EsxRandomAccess(String name, String mode) throws FileNotFoundException {
		super(name, mode);
	}

	public EsxRandomAccess(File file, InputStream in, IProgressMonitor monitor) throws IOException {
		super(file, "rwd");
		
		int bufferSize = 16384;
		if(in.available()>bufferSize) {
			bufferSize = in.available();
		}

		byte[] buffer = new byte[bufferSize];
		int len;
		int total = 0;

		while((len = in.read(buffer)) >= 0) {
			total = total + len;
			this.write(buffer, 0, len);
			monitor.subTask("Analyzed " + total + " bytes");
		}
	}

}

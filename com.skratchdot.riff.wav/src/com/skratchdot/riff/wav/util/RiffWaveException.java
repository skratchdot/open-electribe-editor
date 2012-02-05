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
package com.skratchdot.riff.wav.util;

public class RiffWaveException extends Exception {
	private static final long serialVersionUID = 5784600866487657130L;
	String errorMessage = "";

	public RiffWaveException() {
		super();
		this.errorMessage = "General RIFFWave Exception";
	}
	public RiffWaveException(String message) {
		super(message);
		this.errorMessage = message;
	}
	public RiffWaveException(Throwable cause) {
		super(cause);
	}
	public RiffWaveException(String message, Throwable cause) {
		super(message, cause);
		this.errorMessage = message;
	}
	@Override
	public String getMessage() {
		return "" + this.errorMessage + "\n" + super.getMessage();
	}

}

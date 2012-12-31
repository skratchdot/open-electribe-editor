/*******************************************************************************
 * Copyright (c) 2009-2013 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 *******************************************************************************/
package com.skratchdot.electribe.model.esx.util;

public class EsxException extends Exception {
	private static final long serialVersionUID = -1749715748611982674L;

	String errorMessage;

	/**
	 *
	 */
	public EsxException() {
		super();
		errorMessage = "General Esx Exception";
	}

	/**
	 * @param message
	 */
	public EsxException(String message) {
		super(message);
		this.errorMessage = message;
	}

	/**
	 * @param cause
	 */
	public EsxException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public EsxException(String message, Throwable cause) {
		super(message, cause);
		this.errorMessage = message;
	}

	@Override
	public String getMessage() {
		return "" + this.errorMessage + "\n" + super.getMessage();
	}

}

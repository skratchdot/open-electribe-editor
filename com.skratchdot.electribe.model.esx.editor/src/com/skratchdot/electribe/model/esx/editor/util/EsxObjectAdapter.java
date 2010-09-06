/**
 * Copyright (c) 2009-2010 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    JEFF |:at:| SKRATCHDOT |:dot:| COM
 *
 * $Id$
 */
package com.skratchdot.electribe.model.esx.editor.util;

/**
 * Since Java doesn't allow us to pass functions as parameters, I'm using
 * this class as a way to achieve "functional programming".  This is a generic
 * way to pass a slightly more dynamic value to functions that expect Objects.
 */
public abstract class EsxObjectAdapter implements IEsxObject {

	/**
	 * @see com.skratchdot.electribe.model.esx.editor.util.IEsxObject#getObject()
	 */
	public Object getObject() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see com.skratchdot.electribe.model.esx.editor.util.IEsxObject#setObject(java.lang.Object)
	 */
	public void setObject(Object object) {
		// TODO Auto-generated method stub
	}

}
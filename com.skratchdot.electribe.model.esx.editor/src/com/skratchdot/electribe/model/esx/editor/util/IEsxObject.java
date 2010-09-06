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
 * @see com.skratchdot.electribe.model.esx.editor.util.EsxObjectAdapter
 */
public interface IEsxObject {
	/**
	 * @return A generic object to be determined by implementing class
	 */
	public Object getObject();

	/**
	 * @param object The object to be set
	 */
	public void setObject(Object object);
}

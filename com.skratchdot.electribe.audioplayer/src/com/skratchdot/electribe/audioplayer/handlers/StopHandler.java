/**
 * Copyright (c) 2009-2011 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    JEFF |:at:| SKRATCHDOT |:dot:| COM
 *
 * $Id$
 */
package com.skratchdot.electribe.audioplayer.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import com.skratchdot.electribe.audioplayer.AudioPlayer;

public class StopHandler extends AbstractHandler {

	public StopHandler() {
	}

	public Object execute(ExecutionEvent event) throws ExecutionException {

		try {
			AudioPlayer.getInstance().stop();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}

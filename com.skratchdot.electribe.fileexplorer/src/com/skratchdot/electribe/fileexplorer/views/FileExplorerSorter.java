/**
 * Copyright (c) 2009, 2012 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    JEFF |:at:| SKRATCHDOT |:dot:| COM
 *
 * $Id$
 */
package com.skratchdot.electribe.fileexplorer.views;

import java.io.*;
import org.eclipse.jface.viewers.*;

public class FileExplorerSorter extends ViewerSorter {
	public int category(Object element) {
		// Directories should show up above files
		if (element instanceof File) {
			return ((File) element).isDirectory() ? 1 : 2;
		}
		// ParentDirectory objects should show up before Directories/Files
		else if (element instanceof ParentDirectory) {
			return 0;
		}
		// This should never happen
		else {
			return -1;
		}
	}
}

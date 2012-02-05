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
package com.skratchdot.electribe.model.esx.perspective;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Default implements IPerspectiveFactory {
	public static final String ID = "com.skratchdot.electribe.model.esx.perspective.Default"; //$NON-NLS-1$

	/**
	 * Creates the initial layout for a page.
	 */
	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(true);
		layout.addPerspectiveShortcut(ID);

		layout.addView("com.skratchdot.electribe.fileexplorer.views.TableView", IPageLayout.BOTTOM, 0.60f, IPageLayout.ID_EDITOR_AREA);
		layout.addView("com.skratchdot.electribe.fileexplorer.views.TreeView", IPageLayout.LEFT, 0.25f, IPageLayout.ID_EDITOR_AREA);
		layout.addView(IPageLayout.ID_PROP_SHEET, IPageLayout.RIGHT, 0.75f, "com.skratchdot.electribe.fileexplorer.views.TableView");
	}

}

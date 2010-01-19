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
package com.skratchdot.electribe.model.esx.presentation;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;

public class EsxEditorPartSelection extends EsxEditorPart {
	protected TreeViewer viewer;

	public EsxEditorPartSelection(EsxEditor parent) {
		super(parent);
	}

	@Override
	public void createPartControl(Composite parent) {
		Tree tree = new Tree(parent, SWT.MULTI);
		viewer = new TreeViewer(tree);

	    viewer.setColumnProperties(new String [] {"a", "b"});
	    viewer.setContentProvider(new AdapterFactoryContentProvider(getAdapterFactory()));
	    viewer.setLabelProvider(new AdapterFactoryLabelProvider(getAdapterFactory()));
		viewer.setLabelProvider(new AdapterFactoryLabelProvider.ColorProvider(this.getAdapterFactory(), viewer));

	    createContextMenuFor(viewer);
	    getEditorSite().setSelectionProvider(viewer);
	}

	@Override
	public void setFocus() {
		viewer.getTree().setFocus();
	}
	
	@Override
	public void setInput(Object input) {
		viewer.setInput(input);
	}

}

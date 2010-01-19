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
package com.skratchdot.electribe.fileexplorer.views;

import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.FileTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

import com.skratchdot.electribe.fileexplorer.Activator;
import com.skratchdot.electribe.fileexplorer.preferences.PreferenceConstants;

public class TreeView extends ViewPart
	implements ISelectionListener, IPropertyChangeListener {
	public static final String ID = "com.skratchdot.electribe.fileexplorer.views.TreeView";

	private TreeViewer viewer;

	@Override
	public void createPartControl(Composite parent) {
		viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);

		// Add drag support
		int ops = DND.DROP_COPY;
		Transfer[] transfers = new Transfer[] { FileTransfer.getInstance() };
		viewer.addDragSupport(ops, transfers, new FileExplorerDragSourceAdapter(viewer));

		viewer.setUseHashlookup(true); // try to speed things up
		viewer.setContentProvider(new TreeViewContentProvider(
			Activator.getDefault().getPreferenceStore()
				.getBoolean(PreferenceConstants.PREFNAME_TREEVIEW_ONLYSHOWINGDIRECTORIES),
			Activator.getDefault().getPreferenceStore()
				.getString(PreferenceConstants.PREFNAME_TREEVIEW_FILEFILTERARRAY)
		));
		viewer.setLabelProvider(new TreeViewLabelProvider());
		viewer.setSorter(new FileExplorerSorter());
		viewer.setInput("root"); // this value doesn't matter, getElements() from the ContentProvider does

		// This view is a selection provider
		getSite().setSelectionProvider(viewer);

		// listen for preference change events
		Activator.getDefault().getPreferenceStore().addPropertyChangeListener((IPropertyChangeListener) this);
	}

	@Override
	public void dispose() {
		super.dispose();

		// Remove Listeners added in createPartControl()
		Activator.getDefault().getPreferenceStore().removePropertyChangeListener((IPropertyChangeListener) this);
}

	@Override
	public void setFocus() {
		viewer.getControl().setFocus();
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		// TODO Auto-generated method stub
	}

	@Override
	public void propertyChange(PropertyChangeEvent event) {
		// If PREFNAME_TREEVIEW_ONLYSHOWINGDIRECTORIES has changed
		if(event.getProperty().equals(PreferenceConstants.PREFNAME_TREEVIEW_ONLYSHOWINGDIRECTORIES)) {
			((TreeViewContentProvider) viewer.getContentProvider())
				.getFilter().setOnlyShowingDirectories((Boolean)event.getNewValue());
			viewer.refresh();
		}
		// If PREFNAME_TREEVIEW_FILEFILTERARRAY has changed
		if(event.getProperty().equals(PreferenceConstants.PREFNAME_TREEVIEW_FILEFILTERARRAY)) {
			((TreeViewContentProvider) viewer.getContentProvider())
				.getFilter().setFileFilterString((String)event.getNewValue());
			viewer.refresh();
		}
	}

}

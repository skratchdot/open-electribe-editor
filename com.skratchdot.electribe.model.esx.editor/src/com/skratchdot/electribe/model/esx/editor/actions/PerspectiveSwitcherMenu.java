/**
 * Copyright (c) 2009, 2012 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *     Elias Volanakis - initial API and implementation
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 * 
 * Notes:
 *     This file was taken directly from the following blog post:
 *     
 *     http://eclipsesource.com/blogs/2009/03/31/replacing-the-perspective-switcher-in-rcp-apps/
 *     
 *     Only the copyright comments and package name were modified.
 *
 * $Id$
 */
package com.skratchdot.electribe.model.esx.editor.actions;

import org.eclipse.jface.action.ContributionItem;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * Perspective Switcher Dropdown.
 */
public class PerspectiveSwitcherMenu extends ContributionItem {

	private static final String KEY_PERSPECTIVE_DESCR = "k_p_descr";
	
	private final SelectionListener menuListener = new SwitchPerspectiveMenuListener();
	
	private static IWorkbenchPage getActivePage() {
		IWorkbenchPage result = null;
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if(window != null) {
			result = window.getActivePage();
		}
		return result;
	}
	
	private static String getPerspectiveId() {
		String result = null;
		IWorkbenchPage page = getActivePage();
		if(page != null) {
			IPerspectiveDescriptor descriptor = page.getPerspective();
			if(descriptor != null) {
				result = descriptor.getId();
			}
		}
		return result;
	}
	
	public PerspectiveSwitcherMenu() {
	}

	public PerspectiveSwitcherMenu(String id) {
		super(id);
	}
	
	@Override
	public final boolean isDynamic() {
		return true;
	}
	
	/**
	 * Fills a drop-down menu with all available perspectives. The current one
	 * is selected.
	 */
	@Override
	public void fill(Menu menu, int index) {
		String activePerspective = getPerspectiveId();
		
		IPerspectiveDescriptor[] perspectives = PlatformUI.getWorkbench().getPerspectiveRegistry().getPerspectives();
		// TODO [ev] could create items in some sorted order...
		for(int i = 0; i < perspectives.length; i++) {
			IPerspectiveDescriptor descriptor = perspectives[i];
			// i is used as an item index; 0-n will add items to the top of the menu
			MenuItem item = new MenuItem(menu, SWT.RADIO, i);
			item.setData(KEY_PERSPECTIVE_DESCR, descriptor);
			item.setText(descriptor.getLabel());
			final Image image = descriptor.getImageDescriptor().createImage();
			item.setImage(image);
			item.addDisposeListener(new DisposeListener(){
				public void widgetDisposed(DisposeEvent e) {
					image.dispose();
				}
			});
			item.addSelectionListener(menuListener);
			if(descriptor.getId().equals(activePerspective)) {
				item.setSelection(true);
			}
		}
	}
	
	// helping classes
	//////////////////
	
	/**
	 * Switch perspective in the active page
	 */
	private static final class SwitchPerspectiveMenuListener extends SelectionAdapter {
		public void widgetSelected(SelectionEvent e) {
			MenuItem item = (MenuItem) e.widget;
			if(item.getSelection()) {
				IWorkbenchPage page = getActivePage();
				if(page != null) {
					IPerspectiveDescriptor descriptor = (IPerspectiveDescriptor) item.getData(KEY_PERSPECTIVE_DESCR);
					page.setPerspective(descriptor);
				}
			}
		}

	}

}

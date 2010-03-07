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

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.edit.ui.dnd.ViewerDragAdapter;
import org.eclipse.emf.edit.ui.provider.UnwrappingSelectionProvider;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;

/**
 * http://www.eclipse.org/articles/article.php?file=Article-Integrating-EMF-GMF-Editors/index.html
 */
public abstract class EsxEditorPart extends EditorPart
	implements IEditingDomainProvider, IMenuListener, ISelectionListener, IPropertyChangeListener {
	public static final String ID = "com.skratchdot.electribe.model.esx.presentation.EsxEditorPart"; //$NON-NLS-1$

	protected EsxEditor parentEditor;

	/**
	 * @param parent
	 */
	public EsxEditorPart(EsxEditor parent) {
		super();
		this.parentEditor = parent;
	}

	/**
	 * Sets the input to this editor.  This method simply updates the internal
	 * member variables of the editor.
	 * 
	 * @param input
	 */
	public abstract void setInput(Object input);

	/**
	 * Refreshes this editor with information freshly obtained from the editor's model.
	 * This method is called by the main editor whenever a command on the command stack
	 * has been called.  It is up to the subclasses to determine what needs to be refreshed.
	 */
	public abstract void refresh();
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		// nothing to do here - this is handled by the editor part subclasses
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
		// nothing to do here - this is handled by the editor part subclasses
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.ISelectionListener#selectionChanged(org.eclipse.ui.IWorkbenchPart, org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		// nothing to do here - this is handled by the editor part subclasses
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.util.IPropertyChangeListener#propertyChange(org.eclipse.jface.util.PropertyChangeEvent)
	 */
	@Override
	public void propertyChange(PropertyChangeEvent event) {
		// nothing to do here - this is handled by the editor part subclasses
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#doSave(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void doSave(IProgressMonitor monitor) {
		// nothing to do here - this is handled by the parent editor
	}

	@Override
	public void doSaveAs() {
		// nothing to do here - this is handled by the parent editor
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#init(org.eclipse.ui.IEditorSite, org.eclipse.ui.IEditorInput)
	 */
	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		setSite(site);
		setInput(input);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#isDirty()
	 */
	@Override
	public boolean isDirty() {
		return getCommandStack().isSaveNeeded();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#isSaveAsAllowed()
	 */
	@Override
	public boolean isSaveAsAllowed() {
		return true;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.action.IMenuListener#menuAboutToShow(org.eclipse.jface.action.IMenuManager)
	 */
	@Override
	public void menuAboutToShow(IMenuManager manager) {
		// pass the request to show the context menu on to the parent editor
		((IMenuListener)parentEditor.getEditorSite().getActionBarContributor()).menuAboutToShow(manager);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.domain.IEditingDomainProvider#getEditingDomain()
	 */
	@Override
	public EditingDomain getEditingDomain() {
		return parentEditor.getEditingDomain();
	}

	/**
	 * @return
	 */
	protected BasicCommandStack getCommandStack() {
		return ((BasicCommandStack)getEditingDomain().getCommandStack());
	}
	
	/**
	 * @return
	 */
	protected AdapterFactory getAdapterFactory() {
		return parentEditor.getAdapterFactory();
	}

	/**
	 * @param viewer the viewer in which to create a context menu for
	 * @param menuManagerId the id of the menu manager
	 */
	protected void createContextMenuFor(StructuredViewer viewer, String menuId) {
		MenuManager contextMenu = new MenuManager("#PopUp");
		contextMenu.add(new Separator("additions"));
		contextMenu.setRemoveAllWhenShown(true);

		//contextMenu.addMenuListener(this);
		Menu menu = contextMenu.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuId, contextMenu, new UnwrappingSelectionProvider(viewer));
	}

	/**
	 * @param viewer the viewer that will have EMF drag-and-drop support
	 */
	protected void addEmfDragAndDropSupport(StructuredViewer viewer) {
		int dndOperations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;
		Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance() };
		viewer.addDragSupport(dndOperations, transfers, new ViewerDragAdapter(viewer));
		viewer.addDropSupport(dndOperations, transfers, new EditingDomainViewerDropAdapter(getEditingDomain(), viewer));
	}

	/**
	 * @param tableViewer The TableViewer that a column will be added to
	 * @param text The name of the column. Will show up in the column header.
	 * @param width If null, then pack() will be called. If a valid integer, then the column will have this width
	 */
	protected void addColumnToTableViewer(TableViewer tableViewer, String text, Integer width) {
		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn column = tableViewerColumn.getColumn();
		column.setText(text);
		if(width==null) {
			column.pack();
		}
		else {
			column.setWidth(width);
		}
	}

	/**
	 * @param viewer
	 * @param scrollSpeedListener
	 * @param scrollSpeed
	 * @param useScrollSpeed
	 * @return
	 */
	protected TableScrollSpeedListener syncScrollSpeedWithPreference(TableViewer viewer, TableScrollSpeedListener scrollSpeedListener, Integer scrollSpeed, Boolean useScrollSpeed) {
		if( useScrollSpeed ) {
			return enableScrollSpeed(viewer, scrollSpeedListener, scrollSpeed);
		}
		else {
			return disableScrollSpeed(viewer, scrollSpeedListener);
		}
	}

	/**
	 * @param viewer
	 * @param scrollSpeedListener
	 * @param scrollSpeed
	 * @return
	 */
	private TableScrollSpeedListener enableScrollSpeed(TableViewer viewer, TableScrollSpeedListener scrollSpeedListener, Integer scrollSpeed) {
		if(scrollSpeedListener==null) {
			disableScrollSpeed(viewer, scrollSpeedListener);
		}
		scrollSpeedListener = new TableScrollSpeedListener(viewer.getTable(), scrollSpeed);
		viewer.getTable().addListener(SWT.MouseDown, scrollSpeedListener);
		viewer.getTable().addListener(SWT.MouseUp, scrollSpeedListener);
		viewer.getTable().addListener(SWT.MouseExit, scrollSpeedListener);
		return scrollSpeedListener;
	}

	/**
	 * @param viewer
	 * @param scrollSpeedListener
	 * @return
	 */
	private TableScrollSpeedListener disableScrollSpeed(TableViewer viewer, TableScrollSpeedListener scrollSpeedListener) {
		if(scrollSpeedListener!=null) {
			viewer.getTable().removeListener(SWT.MouseDown, scrollSpeedListener);
			viewer.getTable().removeListener(SWT.MouseUp, scrollSpeedListener);
			viewer.getTable().removeListener(SWT.MouseExit, scrollSpeedListener);
			scrollSpeedListener = null;
		}
		return scrollSpeedListener;
	}

}

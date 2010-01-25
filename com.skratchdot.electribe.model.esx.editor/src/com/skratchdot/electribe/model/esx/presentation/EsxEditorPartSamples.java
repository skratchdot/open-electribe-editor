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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import com.skratchdot.electribe.model.esx.EsxFile;

public class EsxEditorPartSamples extends EsxEditorPart {
	public static final String ID = "com.skratchdot.electribe.model.esx.presentation.EsxEditorPartSamples"; //$NON-NLS-1$

	protected TableViewer tableViewer;
	protected ListViewer listViewer;

	public EsxEditorPartSamples(EsxEditor parent) {
		super(parent);
	}

	@Override
	public void createPartControl(Composite parent) {
		// Create sashForm
		SashForm sashForm = new SashForm(parent, SWT.NONE);
		
		// Create groupSamples
		Group groupSamples = new Group(sashForm, SWT.NONE);
		groupSamples.setLayout(new GridLayout(1, true));
		groupSamples.setText("Samples");

		// Create this.tableViewer
		this.tableViewer = new TableViewer(groupSamples, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
		this.initTableViewer();

		// Create groupSelectedSample
		Group groupSelectedSample = new Group(sashForm, SWT.NONE);
		groupSelectedSample.setLayout(new FillLayout(SWT.HORIZONTAL));
		groupSelectedSample.setText("Selected Sample");

		// Create this.listViewer
		this.listViewer = new ListViewer(groupSelectedSample);

		sashForm.setWeights(new int[] {3, 1});

	}
	
	private void initTableViewer() {
		// Create the table
		Table table = this.tableViewer.getTable();
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		// Create our columns
		this.addColumnToTableViewer(this.tableViewer, "Esx#", 45);
		this.addColumnToTableViewer(this.tableViewer, "Orig#", 45);
		this.addColumnToTableViewer(this.tableViewer, "Name", 100);
		this.addColumnToTableViewer(this.tableViewer, "MemSize", 100);
		this.addColumnToTableViewer(this.tableViewer, "SampleRate", 100);
		this.addColumnToTableViewer(this.tableViewer, "StretchStep", 100);
		this.addColumnToTableViewer(this.tableViewer, "IsLoop?", 100);
		this.addColumnToTableViewer(this.tableViewer, "IsSlice?", 100);
		this.addColumnToTableViewer(this.tableViewer, "PlayLevel", 100);
		this.addColumnToTableViewer(this.tableViewer, "Start", 100);
		this.addColumnToTableViewer(this.tableViewer, "End", 100);
		this.addColumnToTableViewer(this.tableViewer, "LoopStart", 100);
		this.addColumnToTableViewer(this.tableViewer, "NumSampleFrames", 100);

		// Allow all the columns to be moved
		TableColumn[] columns = table.getColumns();
		for (int i = 0; i < columns.length; i++) {
			columns[i].setMoveable(true);
		}

		// Setup this.tableViewer ContentProvider
		this.tableViewer.setContentProvider(new AdapterFactoryContentProvider(this.getAdapterFactory()) {

			@Override
			public Object[] getElements(Object object) {
				return ((EsxFile)object).getSamples().toArray();
			}

			@Override
			public void notifyChanged(Notification notification) {
				super.notifyChanged(new ViewerNotification(notification));
			}
			
		});
		
		// Drag & Drop
		//int ops = DND.DROP_MOVE;
		//Transfer[] transfers = new Transfer[] { FileTransfer.getInstance() };
		//this.tableViewer.addDropSupport(ops, transfers, new EsxEditorPartSamplesDropTargetAdapter());

		// Label Provider
		this.tableViewer.setLabelProvider(new AdapterFactoryLabelProvider.ColorProvider(this.getAdapterFactory(), this.tableViewer));

		// Context Menu
	    createContextMenuFor(this.tableViewer);

	    // Selection Provider
	    getEditorSite().setSelectionProvider(this.tableViewer);

	}

	private void addColumnToTableViewer(TableViewer tableViewer, String text, int width) {
		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn column = tableViewerColumn.getColumn();
		column.setText(text);
		column.setWidth(width);
	}

	@Override
	public void setFocus() {
		this.tableViewer.getTable().setFocus();
	}

	@Override
	public void setInput(Object input) {
		Resource resource =
			(Resource)this.getEditingDomain().getResourceSet().getResources().get(0);
		Object rootObject = resource.getContents().get(0);
		if(rootObject instanceof EsxFile) {
			this.tableViewer.setInput(rootObject);
			
			// Hack for EsxEditorAdvisor#ImportAudioFileAction() so that
			// after the CompoundCommand is run, the sample list refreshes.
			// It only seems to refresh if an item in the list has been
			// selected.
			// TODO: Find out why we need this hack
			this.tableViewer.getTable().select(0);
		}
	}

}

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

public class EsxEditorPartSongs extends EsxEditorPart {
	protected TableViewer tableViewerSongs;
	protected TableViewer tableViewerSongPatterns;

	public EsxEditorPartSongs(EsxEditor parent) {
		super(parent);
	}

	@Override
	public void createPartControl(Composite parent) {
		// Create sashForm
		SashForm sashForm = new SashForm(parent, SWT.NONE);
		
		// Create groupSongs
		Group groupSongs = new Group(sashForm, SWT.NONE);
		groupSongs.setLayout(new GridLayout(1, true));
		groupSongs.setText("Songs");

		// Create this.tableViewer
		this.tableViewerSongs = new TableViewer(groupSongs, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
		this.initTableViewerSongs();

		// Create groupSelectedSong
		Group groupSelectedSong = new Group(sashForm, SWT.NONE);
		groupSelectedSong.setLayout(new FillLayout(SWT.HORIZONTAL));
		groupSelectedSong.setText("Selected Song");

		// Create this.listViewer
		this.tableViewerSongPatterns = new TableViewer(groupSelectedSong, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
		this.initTableViewerSongPatterns();

		sashForm.setWeights(new int[] {3, 1});
	}

	private void initTableViewerSongs() {
		// Create the table
		Table table = this.tableViewerSongs.getTable();
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		// Create our columns
		this.addColumnToTableViewer(this.tableViewerSongs, "Esx#", 45);
		this.addColumnToTableViewer(this.tableViewerSongs, "Orig#", 45);
		this.addColumnToTableViewer(this.tableViewerSongs, "Name", 100);
		this.addColumnToTableViewer(this.tableViewerSongs, "Tempo", 100);
		this.addColumnToTableViewer(this.tableViewerSongs, "TempoLock", 100);
		this.addColumnToTableViewer(this.tableViewerSongs, "Length", 100);
		this.addColumnToTableViewer(this.tableViewerSongs, "MuteHold", 100);
		this.addColumnToTableViewer(this.tableViewerSongs, "NextSong", 100);
		this.addColumnToTableViewer(this.tableViewerSongs, "NumOfEvents", 100);

		// Allow all the columns to be moved
		TableColumn[] columns = table.getColumns();
		for (int i = 0; i < columns.length; i++) {
			columns[i].setMoveable(true);
		}

		// Setup this.tableViewer ContentProvider
		this.tableViewerSongs.setContentProvider(new AdapterFactoryContentProvider(this.getAdapterFactory()) {

			@Override
			public Object[] getElements(Object object) {
				return ((EsxFile)object).getSongs().toArray();
			}

			@Override
			public void notifyChanged(Notification notification) {
				super.notifyChanged(new ViewerNotification(notification));
			}
			
		});

		// Label Provider
		this.tableViewerSongs.setLabelProvider(new AdapterFactoryLabelProvider.ColorProvider(this.getAdapterFactory(), this.tableViewerSongs));

		// Context Menu
	    createContextMenuFor(this.tableViewerSongs);

	    // Selection Provider
	    getEditorSite().setSelectionProvider(this.tableViewerSongs);
	}

	private void initTableViewerSongPatterns() {
		// TODO Auto-generated method stub
	}

	private void addColumnToTableViewer(TableViewer tableViewer, String text, int width) {
		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn column = tableViewerColumn.getColumn();
		column.setText(text);
		column.setWidth(width);
	}

	@Override
	public void setFocus() {
		this.tableViewerSongs.getTable().setFocus();
	}

	@Override
	public void setInput(Object input) {
		Resource resource =
			(Resource)this.getEditingDomain().getResourceSet().getResources().get(0);
		Object rootObject = resource.getContents().get(0);
		if(rootObject instanceof EsxFile) {
			this.tableViewerSongs.setInput(rootObject);
		}
	}

}

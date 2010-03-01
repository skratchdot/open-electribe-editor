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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;

import com.skratchdot.electribe.model.esx.Song;
import com.skratchdot.electribe.model.esx.SongEvent;
import com.skratchdot.electribe.model.esx.SongPattern;

public class EsxCompositeSongEvents extends EsxComposite {
	public static final String ID = "com.skratchdot.electribe.model.esx.presentation.EsxCompositeSongEvents"; //$NON-NLS-1$

	private Song selectedSong;
	private List<SongEvent> selectedSongEvents;
	private TableViewer tableViewer;


	/**
	 * @param parent
	 * @param style
	 */
	public EsxCompositeSongEvents(Composite parent, int style) {
		super(parent, style);
	}

	/**
	 * @param parentPart
	 * @param parentComposite
	 * @param style
	 */
	public EsxCompositeSongEvents(EsxEditorPart parentPart, Composite parentComposite, int style) {
		super(parentPart, parentComposite, style);
		this.parentPart = parentPart;

		setLayout(new GridLayout(4, false));

		this.tableViewer = new TableViewer(this, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
		this.initTableViewer();
	}

	/**
	 * 
	 */
	private void initTableViewer() {
		// Create the table
		Table table = this.tableViewer.getTable();
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 4, 1));

		// Create our columns
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Position Current", 50);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Position Original", 50);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Measure", null);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Operation Number", null);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Position Number", null);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Step", null);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Control Value", null);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Part", null);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Note Length", null);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Note Number", null);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Mute Status", null);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Tempo", null);
		
		// Setup this.tableViewer ContentProvider
		this.tableViewer.setContentProvider(new AdapterFactoryContentProvider(this.getAdapterFactory()) {
			@Override
			public Object[] getElements(Object object) {
				return selectedSong.getSongEvents().toArray();
			}
			@Override
			public void notifyChanged(Notification notification) {
				super.notifyChanged(new ViewerNotification(notification));
			}			
		});

		this.tableViewer.setLabelProvider(new AdapterFactoryLabelProvider.ColorProvider(getAdapterFactory(), this.tableViewer));

		this.tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
		        IStructuredSelection selection = (IStructuredSelection) event.getSelection();

		        Object[] objects = ((IStructuredSelection) selection).toArray();
		        selectedSongEvents = new ArrayList<SongEvent>();
				for (Object obj : objects) {
					if(obj instanceof SongPattern) {
						selectedSongEvents.add((SongEvent) obj);
					}
				}
				refresh();
				refreshInputs();
			}
		});
	}
	
	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#setInput(java.lang.Object)
	 */
	@Override
	public void setInput(Object input) {
		if(input instanceof List<?>) {
			if( ((List<?>) input).size()>1 ) {
				this.selectedSong = null;
			}
			else {
				boolean isIterating = true;
				Iterator<?> it = ((List<?>) input).iterator();
				while (it.hasNext() && isIterating==true) {
					Object obj = it.next();
					if(obj instanceof Song) {
						this.selectedSong = (Song) obj;
						isIterating = false;
					}
				}
			}
		}

		this.tableViewer.setInput(this.selectedSong);
		this.refresh();
		this.refreshInputs();
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#refresh()
	 */
	@Override
	public void refresh() {
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#refreshInputs()
	 */
	@Override
	public void refreshInputs() {
		
	}

}

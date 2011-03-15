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

import com.skratchdot.electribe.model.esx.Part;
import com.skratchdot.electribe.model.esx.Pattern;

public class EsxCompositePatternParts extends EsxComposite {
	public static final String ID = "com.skratchdot.electribe.model.esx.presentation.EsxCompositePatternParts"; //$NON-NLS-1$

	private Pattern selectedPattern;
	private List<Part> selectedPatternParts;
	private Part selectedPart;
	private TableViewer tableViewer;


	/**
	 * @param parent
	 * @param style
	 */
	public EsxCompositePatternParts(Composite parent, int style) {
		super(parent, style);
	}

	/**
	 * @param parentPart
	 * @param parentComposite
	 * @param style
	 */
	public EsxCompositePatternParts(EsxEditorPart parentPart, Composite parentComposite, int style) {
		super(parentPart, parentComposite, style);
		this.parentPart = parentPart;

		setLayout(new GridLayout(4, false));

		this.tableViewer = new TableViewer(this, SWT.BORDER | SWT.FULL_SELECTION | SWT.SINGLE);
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
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Part Label", null);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Level", null);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "M.Seq Status", null);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Sample Label", null);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Pitch/Glide", null);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Pan", null);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Eg Time", null);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Start Point", null);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Amp Eg", null);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Roll", null);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Reverse", null);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "FX Select", null);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "FX Send", null);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Mod Type", null);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Mod Dest", null);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Mod Speed", null);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Mod Depth", null);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "BPM Sync", null);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Cutoff", null);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Resonance", null);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Eg Intensity", null);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Filter Type", null);
		
		// Setup this.tableViewer ContentProvider
		this.tableViewer.setContentProvider(new AdapterFactoryContentProvider(this.getAdapterFactory()) {
			@Override
			public Object[] getElements(Object object) {
				return selectedPatternParts.toArray();
			}
			@Override
			public void notifyChanged(Notification notification) {
				super.notifyChanged(new ViewerNotification(notification));
			}			
		});

		this.tableViewer.setLabelProvider(new AdapterFactoryLabelProvider.ColorProvider(getAdapterFactory(), this.tableViewer));

		this.tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
		        IStructuredSelection selection = (IStructuredSelection) event.getSelection();
		        Object firstElement = selection.getFirstElement();
		        if(firstElement instanceof Part) {
		        	selectedPart = (Part) firstElement;
		        }
		        else {
		        	selectedPart = null;
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
		if(this.isActive==false) return;

		if(input instanceof List<?>) {
			if( ((List<?>) input).size()>1 ) {
				this.selectedPattern = null;
				this.selectedPatternParts = null;
				this.selectedPart = null;
			}
			else {
				boolean isIterating = true;
				Iterator<?> it = ((List<?>) input).iterator();
				while (it.hasNext() && isIterating==true) {
					Object obj = it.next();
					if(obj instanceof Pattern) {
						this.selectedPattern = (Pattern) obj;
						this.selectedPatternParts = new ArrayList<Part>();
						this.selectedPatternParts.addAll(this.selectedPattern.getDrumParts());
						this.selectedPatternParts.addAll(this.selectedPattern.getKeyboardParts());
						this.selectedPatternParts.addAll(this.selectedPattern.getStretchSliceParts());
						this.selectedPatternParts.add(this.selectedPattern.getAudioInPart());
						this.selectedPatternParts.add(this.selectedPattern.getAccentPart());
						this.selectedPart = null;
						isIterating = false;
					}
				}
			}
		}

		this.tableViewer.setInput(this.selectedPatternParts);
		this.refresh();
		this.refreshInputs();
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#refresh()
	 */
	@Override
	public void refresh() {
		if(this.isActive==false) return;
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#refreshInputs()
	 */
	@Override
	public void refreshInputs() {
		if(this.isActive==false) return;
	}

}

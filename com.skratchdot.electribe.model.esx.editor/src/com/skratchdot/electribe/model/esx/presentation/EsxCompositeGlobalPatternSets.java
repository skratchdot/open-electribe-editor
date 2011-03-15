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
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;

import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.PatternNumber;
import com.skratchdot.electribe.model.esx.PatternSetParameter;
public class EsxCompositeGlobalPatternSets extends EsxComposite {
	public static final String ID = "com.skratchdot.electribe.model.esx.presentation.EsxCompositeGlobalParametersPatternSets"; //$NON-NLS-1$
	public static final String ID_PATTERN_SET_VIEWER = ID+".PatternSetViewer"; //$NON-NLS-1$

	private List<PatternSetParameter> patternSetParameters;
	private List<PatternSetParameter> selectedItems;
	private TableViewer tableViewer;
	
	private Text textPatternSetParameter;
	private Combo comboPatternSetParameter;

	/**
	 * @param parent
	 * @param style
	 */
	public EsxCompositeGlobalPatternSets(Composite parent, int style) {
		super(parent, style);
	}

	/**
	 * @param parentPart
	 * @param parentComposite
	 * @param style
	 */
	public EsxCompositeGlobalPatternSets(EsxEditorPart parentPart, Composite parentComposite, int style) {
		super(parentPart, parentComposite, style);
		this.parentPart = parentPart;

		setLayout(new GridLayout(4, false));

		textPatternSetParameter = this.createGridData2ColumnTextLabel(this, "Pattern Number");
		comboPatternSetParameter = this.createGridData2ColumnComboInput(this, "", this.getLiteralStrings(PatternNumber.values()) , new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setFeatureForSelectedItems(selectedItems, EsxPackage.Literals.PATTERN_SET_PARAMETER__PATTERN_NUMBER, PatternNumber.get(comboPatternSetParameter.getSelectionIndex()), false, -1);
			}
		});

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
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Current Position", 120);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Original Position", 120);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Pattern Number", 120);

		// Setup this.tableViewer ContentProvider
		this.tableViewer.setContentProvider(new AdapterFactoryContentProvider(this.getAdapterFactory()) {
			@Override
			public Object[] getElements(Object object) {
				return patternSetParameters.toArray();
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

		        Object[] objects = ((IStructuredSelection) selection).toArray();
				selectedItems = new ArrayList<PatternSetParameter>();
				for (Object obj : objects) {
					if(obj instanceof PatternSetParameter) {
						selectedItems.add((PatternSetParameter) obj);
					}
				}
				refresh();
				refreshInputs();
			}
		});
		
		// Context Menu
	    this.parentPart.createContextMenuFor(this.tableViewer, EsxCompositeGlobalPatternSets.ID_PATTERN_SET_VIEWER);
	    
	    // DnD
	    this.parentPart.addEmfDragAndDropSupport(this.tableViewer);

	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#setInput(java.lang.Object)
	 */
	@Override
	public void setInput(Object input) {
		this.patternSetParameters = new ArrayList<PatternSetParameter>();

		if(input instanceof List<?>) {
			Iterator<?> it = ((List<?>) input).iterator();
			while (it.hasNext()) {
				Object obj = it.next();
				if(obj instanceof PatternSetParameter) {
					this.patternSetParameters.add((PatternSetParameter) obj);
				}
			}
		}

		this.tableViewer.setInput(this.patternSetParameters);
		this.refreshInputs();
		this.refresh();
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#refresh()
	 */
	@Override
	public void refresh() {
		String multipleValueString = "<Multiple Values>";
		this.textPatternSetParameter.setText(getMultiString(this.selectedItems, EsxPackage.Literals.PATTERN_SET_PARAMETER__PATTERN_NUMBER, multipleValueString));
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#refreshInputs()
	 */
	@Override
	public void refreshInputs() {
		String multipleValueString = "";
		this.comboPatternSetParameter.setText(getMultiString(this.selectedItems, EsxPackage.Literals.PATTERN_SET_PARAMETER__PATTERN_NUMBER, multipleValueString));
	}

}

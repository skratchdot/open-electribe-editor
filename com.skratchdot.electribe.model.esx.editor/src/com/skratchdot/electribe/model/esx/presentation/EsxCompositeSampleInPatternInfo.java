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

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;

import com.skratchdot.electribe.model.esx.Sample;

public class EsxCompositeSampleInPatternInfo extends EsxComposite {
	public static final String ID = "com.skratchdot.electribe.model.esx.presentation.EsxCompositeSampleInPatternInfo"; //$NON-NLS-1$

	private Sample selectedSample;
	private Text textPartCount;
	private Text textPatternCount;
	private TableViewer tableViewer;


	/**
	 * @param parent
	 * @param style
	 */
	public EsxCompositeSampleInPatternInfo(Composite parent, int style) {
		super(parent, style);
	}

	/**
	 * @param parentPart
	 * @param parentComposite
	 * @param style
	 */
	public EsxCompositeSampleInPatternInfo(EsxEditorPart parentPart, Composite parentComposite, int style) {
		super(parentPart, parentComposite, style);
		this.parentPart = parentPart;

		setLayout(new GridLayout(4, false));

		textPartCount = this.createGridData2ColumnTextLabel(this, "Total # of Parts");
		textPatternCount = this.createGridData2ColumnTextLabel(this, "Total # of Patterns");

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
		this.parentPart.addColumnToTableViewer(this.tableViewer, "#", 50);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Pattern", null);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "PartCount", null);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "PartList", 400);

		// Setup this.tableViewer ContentProvider
		this.tableViewer.setContentProvider(new AdapterFactoryContentProvider(this.getAdapterFactory()) {
			@Override
			public Object[] getElements(Object object) {
				return selectedSample.getSampleInPatternInfoList().toArray();
			}
			@Override
			public void notifyChanged(Notification notification) {
				super.notifyChanged(new ViewerNotification(notification));
			}			
		});

		this.tableViewer.setLabelProvider(new AdapterFactoryLabelProvider.ColorProvider(getAdapterFactory(), this.tableViewer));

	}
	
	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#setInput(java.lang.Object)
	 */
	@Override
	public void setInput(Object input) {
		if(input instanceof List<?>) {
			if( ((List<?>) input).size()>1 ) {
				this.selectedSample = null;
			}
			else {
				boolean isIterating = true;
				Iterator<?> it = ((List<?>) input).iterator();
				while (it.hasNext() && isIterating==true) {
					Object obj = it.next();
					if(obj instanceof Sample) {
						this.selectedSample = (Sample) obj;
						isIterating = false;
					}
				}
			}
		}

		this.tableViewer.setInput(this.selectedSample);
		this.refresh();
		this.refreshInputs();
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#refresh()
	 */
	@Override
	public void refresh() {
		
		if(this.selectedSample!=null) {
			this.textPartCount.setText(Integer.toString(this.selectedSample.getPartCount()));
			this.textPatternCount.setText(Integer.toString(this.selectedSample.getPatternCount()));
		}
		else {
			this.textPartCount.setText("");
			this.textPatternCount.setText("");
		}
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#refreshInputs()
	 */
	@Override
	public void refreshInputs() {
		
	}

}

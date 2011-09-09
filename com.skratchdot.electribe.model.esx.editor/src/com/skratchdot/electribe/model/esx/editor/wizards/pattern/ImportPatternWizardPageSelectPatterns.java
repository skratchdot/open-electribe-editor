/**
 * Copyright (c) 2009-2011 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 *
 * $Id$
 */
package com.skratchdot.electribe.model.esx.editor.wizards.pattern;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

import com.skratchdot.electribe.model.esx.EsxFile;
import com.skratchdot.electribe.model.esx.PartDrum;
import com.skratchdot.electribe.model.esx.PartKeyboard;
import com.skratchdot.electribe.model.esx.PartStretchSlice;
import com.skratchdot.electribe.model.esx.Pattern;
import com.skratchdot.electribe.model.esx.editor.util.EsxEditorUtil;
import com.skratchdot.electribe.model.esx.preferences.EsxPreferenceStore;
import com.skratchdot.electribe.model.esx.presentation.TableViewerColorProvider;

public class ImportPatternWizardPageSelectPatterns extends WizardPage {
	private boolean canFlip = false;
	private Table table;
	private TableViewer tableViewer;
	private Button btnImportSamples;
	private Label lblPatternsCount;
	private Label lblSamplesCount;
	protected Collection<Integer> uniquePatterns = new HashSet<Integer>();
	protected Collection<Short> uniqueSamples = new HashSet<Short>();


	/**
	 * Create the wizard.
	 */
	public ImportPatternWizardPageSelectPatterns() {
		super("wizardPage");
		setTitle("Select Patterns");
		setDescription("Select the patterns you want to import.  You can also choose whether or not to import the samples that are used in the patterns you select.");
	}

	/**
	 * Create contents of the wizard.
	 * 
	 * @param parent
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		setControl(container);
		container.setLayout(new GridLayout(1, false));

		tableViewer = new TableViewer(container, SWT.BORDER | SWT.CHECK | SWT.FULL_SELECTION);
		this.initTableViewer();

		Composite composite = new Composite(container, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		composite.setLayout(new GridLayout(5, false));
		
		Button btnCheckAll = new Button(composite, SWT.NONE);
		btnCheckAll.setText("Check All");
		btnCheckAll.addSelectionListener(new SelectionAdapter(){
			@Override
			public void widgetSelected(SelectionEvent e) {
				super.widgetSelected(e);
				TableItem[] items = table.getItems();
				for (int i=0; i<items.length; i++) {
					items[i].setChecked(true);
				}
				updateSelections();
			}
		});

		Button btnUncheckAll = new Button(composite, SWT.NONE);
		btnUncheckAll.setText("Uncheck All");
		btnUncheckAll.addSelectionListener(new SelectionAdapter(){
			@Override
			public void widgetSelected(SelectionEvent e) {
				super.widgetSelected(e);
				TableItem[] items = table.getItems();
				for (int i=0; i<items.length; i++) {
					items[i].setChecked(false);
				}
				updateSelections();
			}
		});

		Label lblSpacer1 = new Label(composite, SWT.NONE);
		lblSpacer1.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));

		Label lblPatterns = new Label(composite, SWT.NONE);
		lblPatterns.setText("# of Patterns:");
		
		lblPatternsCount = new Label(composite, SWT.NONE);
		GridData gd_lblPatternsCount = new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1);
		gd_lblPatternsCount.widthHint = 30;
		gd_lblPatternsCount.minimumWidth = 30;
		lblPatternsCount.setLayoutData(gd_lblPatternsCount);
		lblPatternsCount.setText("0");
		
		btnImportSamples = new Button(composite, SWT.CHECK);
		btnImportSamples.setSelection(true);
		btnImportSamples.setText("Import the samples used in the selected patterns.");
		btnImportSamples.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 3, 1));
		
		Label lblSamples = new Label(composite, SWT.NONE);
		lblSamples.setText("# of Samples");
		
		lblSamplesCount = new Label(composite, SWT.NONE);
		GridData gd_lblSamplesCount = new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1);
		gd_lblSamplesCount.widthHint = 30;
		gd_lblSamplesCount.minimumWidth = 30;
		lblSamplesCount.setLayoutData(gd_lblSamplesCount);
		lblSamplesCount.setText("0");

	}
	
	@Override
	public boolean canFlipToNextPage() {
		return canFlip;
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if(visible) {
			EsxFile esxFile = ((ImportPatternWizard)this.getWizard()).getSrcEsxFile();
			if(esxFile!=null) {
				this.tableViewer.setInput(esxFile);			
			}
		}
	}

	private void initTableViewer() {
		// Create the table
		table = this.tableViewer.getTable();
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		// Create our columns
		EsxEditorUtil.addColumnToTableViewer(this.tableViewer, "Esx#", 45);
		EsxEditorUtil.addColumnToTableViewer(this.tableViewer, "Name", 100);
		EsxEditorUtil.addColumnToTableViewer(this.tableViewer, "Tempo", 50);
		EsxEditorUtil.addColumnToTableViewer(this.tableViewer, "Swing", 50);
		EsxEditorUtil.addColumnToTableViewer(this.tableViewer, "Length", 50);
		EsxEditorUtil.addColumnToTableViewer(this.tableViewer, "Beat", 50);
		EsxEditorUtil.addColumnToTableViewer(this.tableViewer, "Roll", 50);
		EsxEditorUtil.addColumnToTableViewer(this.tableViewer, "FxChain", 50);
		EsxEditorUtil.addColumnToTableViewer(this.tableViewer, "LastStep", 50);
		EsxEditorUtil.addColumnToTableViewer(this.tableViewer, "ArpScale", 100);
		EsxEditorUtil.addColumnToTableViewer(this.tableViewer, "CenterNote", 100);
		EsxEditorUtil.addColumnToTableViewer(this.tableViewer, "Fx1 Type", 100);
		EsxEditorUtil.addColumnToTableViewer(this.tableViewer, "Fx2 Type", 100);
		EsxEditorUtil.addColumnToTableViewer(this.tableViewer, "Fx3 Type", 100);
		EsxEditorUtil.addColumnToTableViewer(this.tableViewer, "Part 1", 100);
		EsxEditorUtil.addColumnToTableViewer(this.tableViewer, "Part 2", 100);
		EsxEditorUtil.addColumnToTableViewer(this.tableViewer, "Part 3", 100);
		EsxEditorUtil.addColumnToTableViewer(this.tableViewer, "Part 4", 100);
		EsxEditorUtil.addColumnToTableViewer(this.tableViewer, "Part 5", 100);
		EsxEditorUtil.addColumnToTableViewer(this.tableViewer, "Part 6a", 100);
		EsxEditorUtil.addColumnToTableViewer(this.tableViewer, "Part 6b", 100);
		EsxEditorUtil.addColumnToTableViewer(this.tableViewer, "Part 7a", 100);
		EsxEditorUtil.addColumnToTableViewer(this.tableViewer, "Part 7b", 100);
		EsxEditorUtil.addColumnToTableViewer(this.tableViewer, "Key 1", 100);
		EsxEditorUtil.addColumnToTableViewer(this.tableViewer, "Key 2", 100);
		EsxEditorUtil.addColumnToTableViewer(this.tableViewer, "Stretch 1", 100);
		EsxEditorUtil.addColumnToTableViewer(this.tableViewer, "Stretch 2", 100);
		EsxEditorUtil.addColumnToTableViewer(this.tableViewer, "Slice", 100);

		// Allow all the columns to be moved
		TableColumn[] columns = table.getColumns();
		for (int i = 0; i < columns.length; i++) {
			columns[i].setMoveable(true);
		}

		// Setup this.tableViewer ContentProvider
		this.tableViewer.setContentProvider(new AdapterFactoryContentProvider(((ImportPatternWizard)this.getWizard()).getAdapterFactory()) {

			@Override
			public Object[] getElements(Object object) {
				return ((EsxFile)object).getPatterns().toArray();
			}

			@Override
			public void notifyChanged(Notification notification) {
				super.notifyChanged(new ViewerNotification(notification));
			}
			
		});

		// Label Provider
		this.tableViewer.setLabelProvider(new TableViewerColorProvider(
			((ImportPatternWizard)this.getWizard()).getAdapterFactory(),
			this.tableViewer,
			EsxPreferenceStore.getPatternsBackgroundColorWhenNotEmpty(),
			EsxPreferenceStore.getPatternsBackgroundColorWhenEmpty(),
			EsxPreferenceStore.getPatternsForegroundColorWhenNotEmpty(),
			EsxPreferenceStore.getPatternsForegroundColorWhenEmpty()
		){

			@Override
			public String getColumnText(Object object, int columnIndex) {
				// Skip the 2nd column (which usually shows "Original#)
				if(columnIndex==0) {
					return super.getColumnText(object, columnIndex);
				}
				else {
					return super.getColumnText(object, columnIndex+1);
				}
			}
			
		});
		
		this.table.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				updateSelections();
			}
		});
		

	}
	
	private void updateSelections() {
		uniquePatterns = new HashSet<Integer>();
		uniqueSamples = new HashSet<Short>();
		EsxFile esxFile = (EsxFile) this.tableViewer.getInput();
		TableItem[] items = table.getItems();
		Pattern currentPattern;
		EList<PartDrum> currentDrumParts;
		EList<PartKeyboard> currentKeyboardParts;
		EList<PartStretchSlice> currentStretchSliceParts;
		short samplePointer = 0;

		// Count unique patterns and samples
		for (int i=0; i<items.length; i++) {
			if(items[i].getChecked()) {
				uniquePatterns.add(i);
				currentPattern = esxFile.getPatterns().get(i);
				currentDrumParts = currentPattern.getDrumParts();
				currentKeyboardParts = currentPattern.getKeyboardParts();
				currentStretchSliceParts = currentPattern.getStretchSliceParts();
				for(int j=0; j<currentDrumParts.size(); j++) {
					samplePointer = currentDrumParts.get(j).getSamplePointer();
					if(samplePointer>=0) {
						uniqueSamples.add(samplePointer);
					}
				}
				for(int j=0; j<currentKeyboardParts.size(); j++) {
					samplePointer = currentKeyboardParts.get(j).getSamplePointer();
					if(samplePointer>=0) {
						uniqueSamples.add(samplePointer);
					}
				}
				for(int j=0; j<currentStretchSliceParts.size(); j++) {
					samplePointer = currentStretchSliceParts.get(j).getSamplePointer();
					if(samplePointer>=0) {
						uniqueSamples.add(samplePointer);
					}
				}
			}
		}
		
		// Update labels
		this.lblPatternsCount.setText(Integer.toString(uniquePatterns.size()));
		this.lblSamplesCount.setText(Integer.toString(uniqueSamples.size()));

		// We can only flip to the next page if we have selected at least one pattern to import
		if(uniquePatterns.size()>0) {
			canFlip = true;
		}
		else {
			canFlip = false;
		}

		((ImportPatternWizard) getWizard()).setAbleToFinish(false);
		getWizard().getContainer().updateButtons();
		getWizard().getContainer().updateMessage();
	}
	
	public boolean isImportSampleButtonChecked() {
		return btnImportSamples.getSelection();
	}

}

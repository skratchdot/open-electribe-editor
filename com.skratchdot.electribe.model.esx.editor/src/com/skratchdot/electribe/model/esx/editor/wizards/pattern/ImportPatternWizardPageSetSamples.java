/*******************************************************************************
 * Copyright (c) 2009-2013 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 *******************************************************************************/
package com.skratchdot.electribe.model.esx.editor.wizards.pattern;

import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import com.skratchdot.electribe.model.esx.Sample;
import com.skratchdot.electribe.model.esx.util.EsxUtil;

public class ImportPatternWizardPageSetSamples extends WizardPage {
	private Table table;
	private TableViewer tableViewer;
	private SampleMap[] sampleMaps;
	private Object[] sampleNumbers;

	/**
	 * Create the wizard.
	 */
	public ImportPatternWizardPageSetSamples() {
		super("wizardPage");
		setTitle("Select New Sample Numbers");
		setDescription("Choose which sample numbers you want to import the new sample into.  You will overwrite the samples that currently exist in the those selected positions.");
	}

	/**
	 * Create contents of the wizard.
	 * @param parent
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		setControl(container);
		container.setLayout(new GridLayout(2, false));

		tableViewer = new TableViewer(container, SWT.BORDER
				| SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));

		TableColumn tableColumnSource = new TableColumn(table, SWT.NONE);
		tableColumnSource.setWidth(200);
		tableColumnSource.setText("Source Samples");

		TableColumn tableColumnDestination = new TableColumn(table, SWT.NONE);
		tableColumnDestination.setWidth(200);
		tableColumnDestination.setText("Desination Samples");

		tableViewer.setLabelProvider(new ITableLabelProvider() {

			@Override
			public void removeListener(ILabelProviderListener listener) {
			}

			@Override
			public boolean isLabelProperty(Object element, String property) {
				return false;
			}

			@Override
			public void dispose() {
			}

			@Override
			public void addListener(ILabelProviderListener listener) {
			}

			@Override
			public String getColumnText(Object element, int columnIndex) {
				if (columnIndex == 0) {
					return ((ImportPatternWizard) getWizard()).getSrcEsxFile()
							.getSamples().get(((SampleMap) element).source)
							.getLabel();
				} else {
					return ((ImportPatternWizard) getWizard()).getDestEsxFile()
							.getSamples()
							.get(((SampleMap) element).destination).getLabel();
				}
			}

			@Override
			public Image getColumnImage(Object element, int columnIndex) {
				return null;
			}
		});

		tableViewer.setContentProvider(new IStructuredContentProvider() {

			@Override
			public void dispose() {
			}

			@Override
			public void inputChanged(Viewer viewer, Object oldInput,
					Object newInput) {
			}

			@Override
			public Object[] getElements(Object inputElement) {
				return (SampleMap[]) inputElement;
			}

		});

		this.tableViewer.setCellModifier(new SampleMapCellModifier(
				this.tableViewer));
		this.tableViewer.setColumnProperties(new String[] { "source",
				"destination" });

		Button btnRecalculateDestinations = new Button(container, SWT.NONE);
		btnRecalculateDestinations.setText("Recalculate Destinations");
		btnRecalculateDestinations.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				recalculateDestinations();
			}
		});

		Button btnResetDestinations = new Button(container, SWT.NONE);
		btnResetDestinations.setText("Reset Destinations");
		btnResetDestinations.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				resetDestinations();
			}
		});
	}

	@Override
	public boolean canFlipToNextPage() {
		return false;
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible) {
			sampleNumbers = ((ImportPatternWizard) getWizard())
					.getPageSelectPatterns().uniqueSamples.toArray();
			Arrays.sort(sampleNumbers);

			// Set sampleMaps
			sampleMaps = new SampleMap[sampleNumbers.length];
			for (int i = 0; i < sampleNumbers.length; i++) {
				sampleMaps[i] = new SampleMap((Short) sampleNumbers[i],
						(Short) sampleNumbers[i]);
			}

			// Create sample labels
			final String[] sampleLabels = new String[EsxUtil.NUM_SAMPLES];
			for (int i = 0; i < EsxUtil.NUM_SAMPLES; i++) {
				sampleLabels[i] = ((ImportPatternWizard) getWizard())
						.getDestEsxFile().getSamples().get(i).getLabel();
			}
			this.tableViewer.setCellEditors(new CellEditor[] {
					null,
					new ComboBoxCellEditor(this.tableViewer.getTable(),
							sampleLabels, SWT.READ_ONLY) });

			// Set our input
			this.recalculateDestinations();

			// Make sure next/finish buttons are enabled/disabled
			((ImportPatternWizard) getWizard()).setAbleToFinish(true);
			getWizard().getContainer().updateButtons();
		}
	}

	private void recalculateDestinations() {
		// Keep track of empty samples, and samples in use
		ArrayList<Integer> samplesEmpty = new ArrayList<Integer>();
		ArrayList<Integer> samplesInUse = new ArrayList<Integer>();
		for (int i = 0; i < EsxUtil.NUM_SAMPLES; i++) {
			Sample sample = ((ImportPatternWizard) getWizard())
					.getDestEsxFile().getSamples().get(i);
			if (sample.isEmpty()) {
				samplesEmpty.add(i);
			} else {
				samplesInUse.add(i);
			}
		}

		// Set sampleMaps
		sampleMaps = new SampleMap[sampleNumbers.length];
		for (int i = 0; i < sampleNumbers.length; i++) {
			int index = -1;
			int existingSampleIndex = EsxUtil.getExistingSampleIndex(
					((ImportPatternWizard) getWizard()).getDestEsxFile(),
					((ImportPatternWizard) getWizard())
							.getSrcEsxFile()
							.getSamples()
							.get(Integer.parseInt(sampleNumbers[i].toString(),
									10)));
			if (EsxUtil.isValidSampleNumber(existingSampleIndex)) {
				index = existingSampleIndex;
			} else if (samplesEmpty.size() > 0) {
				index = samplesEmpty.remove(0);
			} else if (samplesInUse.size() > 0) {
				index = samplesInUse.remove(0);
			}
			sampleMaps[i] = new SampleMap((Short) sampleNumbers[i],
					(short) index);
		}

		this.tableViewer.setInput(sampleMaps);
	}

	private void resetDestinations() {
		// Set sampleMaps
		sampleMaps = new SampleMap[sampleNumbers.length];
		for (int i = 0; i < sampleNumbers.length; i++) {
			sampleMaps[i] = new SampleMap((Short) sampleNumbers[i],
					(Short) sampleNumbers[i]);
		}

		this.tableViewer.setInput(sampleMaps);
	}

	public SampleMap[] getSampleMaps() {
		return sampleMaps;
	}

}

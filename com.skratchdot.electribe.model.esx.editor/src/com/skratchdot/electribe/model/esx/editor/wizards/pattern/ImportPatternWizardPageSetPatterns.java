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

import com.skratchdot.electribe.model.esx.Pattern;
import com.skratchdot.electribe.model.esx.util.EsxUtil;

public class ImportPatternWizardPageSetPatterns extends WizardPage {
	private Table table;
	private TableViewer tableViewer;
	private boolean canFlip;
	private PatternMap[] patternMaps;
	private Object[] patternNumbers;

	/**
	 * Create the wizard.
	 */
	public ImportPatternWizardPageSetPatterns() {
		super("wizardPage");
		setTitle("Select New Pattern Numbers");
		setDescription("Choose which pattern numbers you want to import the new patterns into.  You will overwrite the patterns that currently exist in the those selected positions.");
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
		tableColumnSource.setText("Source Patterns");

		TableColumn tableColumnDestination = new TableColumn(table, SWT.NONE);
		tableColumnDestination.setWidth(200);
		tableColumnDestination.setText("Desination Patterns");

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
							.getPatterns().get(((PatternMap) element).source)
							.getLabel();
				} else {
					return ((ImportPatternWizard) getWizard()).getDestEsxFile()
							.getPatterns()
							.get(((PatternMap) element).destination).getLabel();
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
				return (PatternMap[]) inputElement;
			}

		});

		this.tableViewer.setCellModifier(new PatternMapCellModifier(
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
		return canFlip;
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible) {
			patternNumbers = ((ImportPatternWizard) getWizard())
					.getPageSelectPatterns().uniquePatterns.toArray();
			Arrays.sort(patternNumbers);
			canFlip = ((ImportPatternWizard) getWizard())
					.getPageSelectPatterns().isImportSampleButtonChecked();

			// Set patternMaps
			patternMaps = new PatternMap[patternNumbers.length];
			for (int i = 0; i < patternNumbers.length; i++) {
				patternMaps[i] = new PatternMap((Integer) patternNumbers[i],
						(Integer) patternNumbers[i]);
			}

			// Create pattern labels
			final String[] patternLabels = new String[EsxUtil.NUM_PATTERNS];
			for (int i = 0; i < EsxUtil.NUM_PATTERNS; i++) {
				patternLabels[i] = ((ImportPatternWizard) getWizard())
						.getDestEsxFile().getPatterns().get(i).getLabel();
			}
			this.tableViewer.setCellEditors(new CellEditor[] {
					null,
					new ComboBoxCellEditor(this.tableViewer.getTable(),
							patternLabels, SWT.READ_ONLY) });

			// Set our input
			this.recalculateDestinations();

			// Make sure next/finish buttons are enabled/disabled
			((ImportPatternWizard) getWizard()).setAbleToFinish(!canFlip);
			getWizard().getContainer().updateButtons();
		}
	}

	private void recalculateDestinations() {
		// Keep track of empty patterns, and patterns in use
		ArrayList<Integer> patternsEmpty = new ArrayList<Integer>();
		ArrayList<Integer> patternsInUse = new ArrayList<Integer>();
		for (int i = 0; i < EsxUtil.NUM_PATTERNS; i++) {
			Pattern pattern = ((ImportPatternWizard) getWizard())
					.getDestEsxFile().getPatterns().get(i);
			if (pattern.isEmpty()) {
				patternsEmpty.add(i);
			} else {
				patternsInUse.add(i);
			}
		}

		// Set patternMaps
		patternMaps = new PatternMap[patternNumbers.length];
		for (int i = 0; i < patternNumbers.length; i++) {
			int index = -1;
			if (patternsEmpty.size() > 0) {
				index = patternsEmpty.remove(0);
			} else if (patternsInUse.size() > 0) {
				index = patternsInUse.remove(0);
			}
			patternMaps[i] = new PatternMap((Integer) patternNumbers[i], index);
		}

		this.tableViewer.setInput(patternMaps);
	}

	private void resetDestinations() {
		// Set patternMaps
		patternMaps = new PatternMap[patternNumbers.length];
		for (int i = 0; i < patternNumbers.length; i++) {
			patternMaps[i] = new PatternMap((Integer) patternNumbers[i],
					(Integer) patternNumbers[i]);
		}

		this.tableViewer.setInput(patternMaps);
	}

	public PatternMap[] getPatternMaps() {
		return patternMaps;
	}

}

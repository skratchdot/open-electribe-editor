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

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import com.skratchdot.electribe.model.esx.ArpeggiatorScale;
import com.skratchdot.electribe.model.esx.Beat;
import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.FxChain;
import com.skratchdot.electribe.model.esx.LastStep;
import com.skratchdot.electribe.model.esx.NoteNumber;
import com.skratchdot.electribe.model.esx.Pattern;
import com.skratchdot.electribe.model.esx.PatternLength;
import com.skratchdot.electribe.model.esx.RollType;
import com.skratchdot.electribe.model.esx.Swing;

public class EsxCompositePattern extends EsxComposite {
	public static final String ID = "com.skratchdot.electribe.model.esx.presentation.EsxCompositePattern"; //$NON-NLS-1$

	private List<Pattern> patterns;

	private ScrolledComposite scrolledComposite;
	private Composite compositeMain;
	private Composite compositeRow1;
	private Composite compositeRow2;
	private Composite compositeRow3;

	private Group groupSelectedPatterns;
	private Text textSelectedTotal;
	private Text textSelectedNotEmpty;
	private Text textSelectedEmpty;

	private Group groupPatternName;
	private Text textName;
	private Text inputName;
	private Button appendName;

	private Group groupGeneralInfo;
	private Text textTempo;
	private Text inputTempo;
	private Text textSwing;
	private Combo comboSwing;
	private Text textPatternLength;
	private Combo comboPatternLength;
	private Text textBeat;
	private Combo comboBeat;
	private Text textRollType;
	private Combo comboRollType;
	private Text textFxChain;
	private Combo comboFxChain;
	private Text textLastStep;
	private Combo comboLastStep;
	private Text textArpeggiatorScale;
	private Combo comboArpeggiatorScale;
	private Text textArpeggiatorCenterNote;
	private Combo comboArpeggiatorCenterNote;

	/**
	 * @param parent
	 * @param style
	 */
	public EsxCompositePattern(Composite parent, int style) {
		super(parent, style);
	}

	/**
	 * @param parentPart
	 * @param parentComposite
	 * @param style
	 */
	public EsxCompositePattern(EsxEditorPart parentPart, Composite parentComposite, int style) {
		super(parentPart, parentComposite, style);
		this.parentPart = parentPart;

		setLayout(new FillLayout(SWT.HORIZONTAL));
		
		scrolledComposite = new ScrolledComposite(this, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);
		
		compositeMain = new Composite(scrolledComposite, SWT.NONE);
		RowLayout rowLayout = new RowLayout(SWT.VERTICAL);
		rowLayout.wrap = false;
		rowLayout.fill = true;
		compositeMain.setLayout(rowLayout);

		
		/* ======================== */
		/* ROW 1					*/
		/* ======================== */
		compositeRow1 = new Composite(compositeMain, SWT.NONE);
		compositeRow1.setLayout(new FillLayout(SWT.HORIZONTAL));

		groupSelectedPatterns = new Group(compositeRow1, SWT.NONE);
		groupSelectedPatterns.setText("Selected Patterns");
		groupSelectedPatterns.setLayout(new GridLayout(2, false));

		textSelectedTotal = this.createGridData2ColumnTextLabel(groupSelectedPatterns, "Total # Selected");
		textSelectedNotEmpty = this.createGridData2ColumnTextLabel(groupSelectedPatterns, "# of Selected (Not Empty)");
		textSelectedEmpty = this.createGridData2ColumnTextLabel(groupSelectedPatterns, "# of Selected (Empty)");

		/* ======================== */
		/* ROW 2					*/
		/* ======================== */
		compositeRow2 = new Composite(compositeMain, SWT.NONE);
		compositeRow2.setLayout(new FillLayout(SWT.HORIZONTAL));

		groupPatternName = new Group(compositeRow2, SWT.NONE);
		groupPatternName.setText("Pattern Name");
		groupPatternName.setLayout(new GridLayout(4, false));

		textName = this.createGridData2ColumnTextLabel(groupPatternName, "Name");
		inputName = this.createGridData2ColumnTextInput(groupPatternName, "Name", new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setFeatureForSelectedItems(patterns, EsxPackage.Literals.PATTERN__NAME, inputName.getText(), appendName.getSelection(), 8);
			}
		});
		appendName = this.createGridData4ColumnCheckButton(groupPatternName, "Append # when multiple patterns are selected", true);

		/* ======================== */
		/* ROW 3					*/
		/* ======================== */
		compositeRow3 = new Composite(compositeMain, SWT.NONE);
		compositeRow3.setLayout(new FillLayout(SWT.HORIZONTAL));

		groupGeneralInfo = new Group(compositeRow3, SWT.NONE);
		groupGeneralInfo.setText("General Info");
		groupGeneralInfo.setLayout(new GridLayout(4, false));

		textTempo = this.createGridData2ColumnTextLabel(groupGeneralInfo, "Tempo");
		inputTempo = this.createGridData2ColumnTextInput(groupGeneralInfo, "Tempo", new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setFeatureForSelectedItems(
						getListOfEObjectsWithinEObject(patterns, EsxPackage.Literals.PATTERN__TEMPO, -1),
						EsxPackage.Literals.TEMPO__VALUE,
						Float.parseFloat(inputTempo.getText()),
						false,
						-1
					);
			}
		});

		textSwing = this.createGridData2ColumnTextLabel(groupGeneralInfo, "Swing");
		comboSwing = this.createGridData2ColumnComboInput(groupGeneralInfo, "Swing", this.getLiteralStrings(Swing.values()) , new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setFeatureForSelectedItems(patterns, EsxPackage.Literals.PATTERN__SWING, Swing.get(comboSwing.getSelectionIndex()), false, -1);
			}
		});
		textPatternLength = this.createGridData2ColumnTextLabel(groupGeneralInfo, "Pattern Length");
		comboPatternLength = this.createGridData2ColumnComboInput(groupGeneralInfo, "Pattern Length", this.getLiteralStrings(PatternLength.values()) , new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setFeatureForSelectedItems(patterns, EsxPackage.Literals.PATTERN__PATTERN_LENGTH, PatternLength.get(comboPatternLength.getSelectionIndex()), false, -1);
			}
		});
		
		textBeat = this.createGridData2ColumnTextLabel(groupGeneralInfo, "Beat");
		comboBeat = this.createGridData2ColumnComboInput(groupGeneralInfo, "Beat", this.getLiteralStrings(Beat.values()) , new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setFeatureForSelectedItems(patterns, EsxPackage.Literals.PATTERN__BEAT, Beat.get(comboBeat.getSelectionIndex()), false, -1);
			}
		});
		textRollType = this.createGridData2ColumnTextLabel(groupGeneralInfo, "Roll Type");
		comboRollType = this.createGridData2ColumnComboInput(groupGeneralInfo, "Roll Type", this.getLiteralStrings(RollType.values()) , new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setFeatureForSelectedItems(patterns, EsxPackage.Literals.PATTERN__ROLL_TYPE, RollType.get(comboRollType.getSelectionIndex()), false, -1);
			}
		});
		textFxChain = this.createGridData2ColumnTextLabel(groupGeneralInfo, "Fx Chain");
		comboFxChain = this.createGridData2ColumnComboInput(groupGeneralInfo, "Fx Chain", this.getLiteralStrings(FxChain.values()) , new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setFeatureForSelectedItems(patterns, EsxPackage.Literals.PATTERN__FX_CHAIN, FxChain.get(comboFxChain.getSelectionIndex()), false, -1);
			}
		});
		textLastStep = this.createGridData2ColumnTextLabel(groupGeneralInfo, "Last Step");
		comboLastStep = this.createGridData2ColumnComboInput(groupGeneralInfo, "Last Step", this.getLiteralStrings(LastStep.values()) , new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setFeatureForSelectedItems(patterns, EsxPackage.Literals.PATTERN__LAST_STEP, LastStep.get(comboLastStep.getSelectionIndex()), false, -1);
			}
		});
		textArpeggiatorScale = this.createGridData2ColumnTextLabel(groupGeneralInfo, "Arpeggiator Scale");
		comboArpeggiatorScale = this.createGridData2ColumnComboInput(groupGeneralInfo, "Arpeggiator Scale", this.getLiteralStrings(ArpeggiatorScale.values()) , new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setFeatureForSelectedItems(patterns, EsxPackage.Literals.PATTERN__ARPEGGIATOR_SCALE, ArpeggiatorScale.get(comboArpeggiatorScale.getSelectionIndex()), false, -1);
			}
		});
		textArpeggiatorCenterNote = this.createGridData2ColumnTextLabel(groupGeneralInfo, "Arp. Center Note");
		comboArpeggiatorCenterNote = this.createGridData2ColumnComboInput(groupGeneralInfo, "Arp. Center Note", this.getLiteralStrings(NoteNumber.values()) , new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setFeatureForSelectedItems(patterns, EsxPackage.Literals.PATTERN__ARPEGGIATOR_CENTER_NOTE, NoteNumber.get(comboArpeggiatorCenterNote.getSelectionIndex()), false, -1);
			}
		});

		scrolledComposite.setContent(compositeMain);
		scrolledComposite.setMinSize(compositeMain.computeSize(SWT.DEFAULT, SWT.DEFAULT));
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#setInput(java.lang.Object)
	 */
	@Override
	public void setInput(Object input) {
		if(this.isActive==false) return;

		this.patterns = new ArrayList<Pattern>();

		if(input instanceof List<?>) {
			Iterator<?> it = ((List<?>) input).iterator();
			while (it.hasNext()) {
				Object obj = it.next();
				if(obj instanceof Pattern) {
					this.patterns.add((Pattern) obj);
				}
			}
		}

		this.refresh();
		this.refreshInputs();
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#refresh()
	 */
	@Override
	public void refresh() {
		if(this.isActive==false) return;

		String multipleValueString = "<Multiple Values>";

		this.textSelectedTotal.setText(Integer.toString(this.patterns.size()));
		this.textSelectedNotEmpty.setText(Integer.toString(this.getCountInListWithValue(this.patterns, EsxPackage.Literals.PATTERN__EMPTY, false)));
		this.textSelectedEmpty.setText(Integer.toString(this.getCountInListWithValue(this.patterns, EsxPackage.Literals.PATTERN__EMPTY, true)));

		this.textName.setText(getMultiString(this.patterns, EsxPackage.Literals.PATTERN__NAME, multipleValueString));

		this.textTempo.setText(getMultiString(this.patterns, EsxPackage.Literals.PATTERN__TEMPO, multipleValueString, EsxPackage.Literals.TEMPO__VALUE));
		this.textSwing.setText(getMultiString(this.patterns, EsxPackage.Literals.PATTERN__SWING, multipleValueString));
		this.textPatternLength.setText(getMultiString(this.patterns, EsxPackage.Literals.PATTERN__PATTERN_LENGTH, multipleValueString));
		this.textBeat.setText(getMultiString(this.patterns, EsxPackage.Literals.PATTERN__BEAT, multipleValueString));
		this.textRollType.setText(getMultiString(this.patterns, EsxPackage.Literals.PATTERN__ROLL_TYPE, multipleValueString));
		this.textFxChain.setText(getMultiString(this.patterns, EsxPackage.Literals.PATTERN__FX_CHAIN, multipleValueString));
		this.textLastStep.setText(getMultiString(this.patterns, EsxPackage.Literals.PATTERN__LAST_STEP, multipleValueString));
		this.textArpeggiatorScale.setText(getMultiString(this.patterns, EsxPackage.Literals.PATTERN__ARPEGGIATOR_SCALE, multipleValueString));
		this.textArpeggiatorCenterNote.setText(getMultiString(this.patterns, EsxPackage.Literals.PATTERN__ARPEGGIATOR_CENTER_NOTE, multipleValueString));
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#refreshInputs()
	 */
	@Override
	public void refreshInputs() {
		if(this.isActive==false) return;

		String multipleValueString = "";

		this.inputName.setText(getMultiString(this.patterns, EsxPackage.Literals.PATTERN__NAME, multipleValueString));

		this.inputTempo.setText(getMultiString(this.patterns, EsxPackage.Literals.PATTERN__TEMPO, multipleValueString, EsxPackage.Literals.TEMPO__VALUE));
		this.comboSwing.setText(getMultiString(this.patterns, EsxPackage.Literals.PATTERN__SWING, multipleValueString));
		this.comboPatternLength.setText(getMultiString(this.patterns, EsxPackage.Literals.PATTERN__PATTERN_LENGTH, multipleValueString));
		this.comboBeat.setText(getMultiString(this.patterns, EsxPackage.Literals.PATTERN__BEAT, multipleValueString));
		this.comboRollType.setText(getMultiString(this.patterns, EsxPackage.Literals.PATTERN__ROLL_TYPE, multipleValueString));
		this.comboFxChain.setText(getMultiString(this.patterns, EsxPackage.Literals.PATTERN__FX_CHAIN, multipleValueString));
		this.comboLastStep.setText(getMultiString(this.patterns, EsxPackage.Literals.PATTERN__LAST_STEP, multipleValueString));
		this.comboArpeggiatorScale.setText(getMultiString(this.patterns, EsxPackage.Literals.PATTERN__ARPEGGIATOR_SCALE, multipleValueString));
		this.comboArpeggiatorCenterNote.setText(getMultiString(this.patterns, EsxPackage.Literals.PATTERN__ARPEGGIATOR_CENTER_NOTE, multipleValueString));
	}

}

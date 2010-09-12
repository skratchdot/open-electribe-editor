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
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.FxChain;
import com.skratchdot.electribe.model.esx.FxType;
import com.skratchdot.electribe.model.esx.Pattern;
import com.skratchdot.electribe.model.esx.util.EsxUtil;

public class EsxCompositePatternFx extends EsxComposite {
	public static final String ID = "com.skratchdot.electribe.model.esx.presentation.EsxCompositePatternFx"; //$NON-NLS-1$

	private List<Pattern> patterns;

	private ScrolledComposite scrolledComposite;
	private Composite compositeMain;
	private Composite compositeRow1;

	private Group groupFxChain;
	private Text textFxChain;
	private Combo comboFxChain;
	
	private Text[] textEffectType = new Text[EsxUtil.NUM_PARAMETERS_FX];
	private Combo[] comboEffectType = new Combo[EsxUtil.NUM_PARAMETERS_FX];
	private Text[] textEdit1 = new Text[EsxUtil.NUM_PARAMETERS_FX];
	private Combo[] comboEdit1 = new Combo[EsxUtil.NUM_PARAMETERS_FX];
	private Text[] textEdit2 = new Text[EsxUtil.NUM_PARAMETERS_FX];
	private Combo[] comboEdit2 = new Combo[EsxUtil.NUM_PARAMETERS_FX];
	private Text[] textMotionSequenceStatus = new Text[EsxUtil.NUM_PARAMETERS_FX];
	private Combo[] comboMotionSequenceStatus = new Combo[EsxUtil.NUM_PARAMETERS_FX];
	
	/**
	 * @param parent
	 * @param style
	 */
	public EsxCompositePatternFx(Composite parent, int style) {
		super(parent, style);
	}

	/**
	 * @param parentPart
	 * @param parentComposite
	 * @param style
	 */
	public EsxCompositePatternFx(EsxEditorPart parentPart, Composite parentComposite, int style) {
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

		groupFxChain = new Group(compositeRow1, SWT.NONE);
		groupFxChain.setText("FX Chain");
		groupFxChain.setLayout(new GridLayout(4, false));

		textFxChain = this.createGridData2ColumnTextLabel(groupFxChain, "Fx Chain");
		comboFxChain = this.createGridData2ColumnComboInput(groupFxChain, "Fx Chain", this.getLiteralStrings(FxChain.values()) , new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setFeatureForSelectedItems(patterns, EsxPackage.Literals.PATTERN__FX_CHAIN, FxChain.get(comboFxChain.getSelectionIndex()), false, -1);
			}
		});

		/* ======================== */
		/* ROWS 2, 3, and 4			*/
		/* ======================== */
		for(int i=0; i<EsxUtil.NUM_PARAMETERS_FX; i++) {
			createFxGroup(compositeMain, "FX " + (i+1), i);
		}

		scrolledComposite.setContent(compositeMain);
		scrolledComposite.setMinSize(compositeMain.computeSize(SWT.DEFAULT, SWT.DEFAULT));
	}

	private void createFxGroup(Composite compositeMain, String fxName, final int fxIndex) {
		Composite composite = new Composite(compositeMain, SWT.NONE);
		composite.setLayout(new FillLayout(SWT.HORIZONTAL));

		Group group = new Group(composite, SWT.NONE);
		group.setText(fxName);
		group.setLayout(new GridLayout(4, false));

		/* EffectType */
		textEffectType[fxIndex] = this.createGridData2ColumnTextLabel(group, "Effect Type");
		comboEffectType[fxIndex] = this.createGridData2ColumnComboInput(group, "Effect Type", this.getLiteralStrings(FxType.values()), new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setFeatureForSelectedItems(
					getListOfEObjectsWithinEObject(patterns, EsxPackage.Literals.PATTERN__FX_PARAMETERS, fxIndex),
					EsxPackage.Literals.PARAMETERS_FX__EFFECT_TYPE,
					FxType.get(comboEffectType[fxIndex].getSelectionIndex()),
					false,
					-1
				);
			}
		});
		/* Edit1 */
		textEdit1[fxIndex] = this.createGridData2ColumnTextLabel(group, "Edit 1");
		comboEdit1[fxIndex] = this.createGridData2ColumnComboInput(group, "Edit 1", this.getLiteralStrings(0, 128), new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setFeatureForSelectedItems(
					getListOfEObjectsWithinEObject(patterns, EsxPackage.Literals.PATTERN__FX_PARAMETERS, fxIndex),
					EsxPackage.Literals.PARAMETERS_FX__EDIT1,
					Byte.parseByte(comboEdit1[fxIndex].getText()),
					false,
					-1
				);
			}
		});
		/* Edit2 */
		textEdit2[fxIndex] = this.createGridData2ColumnTextLabel(group, "Edit 2");
		comboEdit2[fxIndex] = this.createGridData2ColumnComboInput(group, "Edit 2", this.getLiteralStrings(0, 128), new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setFeatureForSelectedItems(
					getListOfEObjectsWithinEObject(patterns, EsxPackage.Literals.PATTERN__FX_PARAMETERS, fxIndex),
					EsxPackage.Literals.PARAMETERS_FX__EDIT2,
					Byte.parseByte(comboEdit2[fxIndex].getText()),
					false,
					-1
				);
			}
		});
		/* Motion Sequence Status */
		textMotionSequenceStatus[fxIndex] = this.createGridData2ColumnTextLabel(group, "Motion Sequence");
		comboMotionSequenceStatus[fxIndex] = this.createGridData2ColumnComboInput(group, "Motion Sequence", this.getLiteralStrings(0, 1), new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setFeatureForSelectedItems(
					getListOfEObjectsWithinEObject(patterns, EsxPackage.Literals.PATTERN__FX_PARAMETERS, fxIndex),
					EsxPackage.Literals.PARAMETERS_FX__MOTION_SEQUENCE_STATUS,
					Byte.parseByte(comboEdit2[fxIndex].getText()),
					false,
					-1
				);
			}
		});

	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#setInput(java.lang.Object)
	 */
	@Override
	public void setInput(Object input) {
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
		String multipleValueString = "<Multiple Values>";

		this.textFxChain.setText(getMultiString(this.patterns, EsxPackage.Literals.PATTERN__FX_CHAIN, multipleValueString));
		for(int i=0; i<EsxUtil.NUM_PARAMETERS_FX; i++) {
			this.textEffectType[i].setText(getMultiString(patterns, EsxPackage.Literals.PATTERN__FX_PARAMETERS, i, EsxPackage.Literals.PARAMETERS_FX__EFFECT_TYPE, multipleValueString));
			this.textEdit1[i].setText(getMultiString(patterns, EsxPackage.Literals.PATTERN__FX_PARAMETERS, i, EsxPackage.Literals.PARAMETERS_FX__EDIT1, multipleValueString));
			this.textEdit2[i].setText(getMultiString(patterns, EsxPackage.Literals.PATTERN__FX_PARAMETERS, i, EsxPackage.Literals.PARAMETERS_FX__EDIT2, multipleValueString));
			this.textMotionSequenceStatus[i].setText(getMultiString(patterns, EsxPackage.Literals.PATTERN__FX_PARAMETERS, i, EsxPackage.Literals.PARAMETERS_FX__MOTION_SEQUENCE_STATUS, multipleValueString));
		}
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#refreshInputs()
	 */
	@Override
	public void refreshInputs() {
		String multipleValueString = "";

		this.comboFxChain.setText(getMultiString(this.patterns, EsxPackage.Literals.PATTERN__FX_CHAIN, multipleValueString));
		for(int i=0; i<EsxUtil.NUM_PARAMETERS_FX; i++) {
			this.comboEffectType[i].setText(getMultiString(patterns, EsxPackage.Literals.PATTERN__FX_PARAMETERS, i, EsxPackage.Literals.PARAMETERS_FX__EFFECT_TYPE, multipleValueString));
			this.comboEdit1[i].setText(getMultiString(patterns, EsxPackage.Literals.PATTERN__FX_PARAMETERS, i, EsxPackage.Literals.PARAMETERS_FX__EDIT1, multipleValueString));
			this.comboEdit2[i].setText(getMultiString(patterns, EsxPackage.Literals.PATTERN__FX_PARAMETERS, i, EsxPackage.Literals.PARAMETERS_FX__EDIT2, multipleValueString));
			this.comboMotionSequenceStatus[i].setText(getMultiString(patterns, EsxPackage.Literals.PATTERN__FX_PARAMETERS, i, EsxPackage.Literals.PARAMETERS_FX__MOTION_SEQUENCE_STATUS, multipleValueString));
		}
	}

}

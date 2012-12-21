/**
 * Copyright (c) 2009, 2012 SKRATCHDOT.COM
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

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

import com.skratchdot.electribe.model.esx.EsxFile;
import com.skratchdot.electribe.model.esx.GlobalParameters;

public class EsxEditorPartGlobal extends EsxEditorPart {
	public static final String ID = "com.skratchdot.electribe.model.esx.presentation.EsxEditorPartGlobal"; //$NON-NLS-1$
	public static final int PAGE_INDEX = 1;

	private GlobalParameters globalParameters;

	private EsxCompositeGlobal editorGlobal;
	private EsxCompositeGlobalMidiCC editorGlobalMidiCC;
	private EsxCompositeGlobalNoteNumbers editorGlobalNoteNumbers;
	private EsxCompositeGlobalPatternSets editorGlobalPatternSets;

	private SashForm sashForm;

	private TabFolder tabFolder;
	private TabItem tabGlobalMidiCC;
	private TabItem tabGlobalNoteNumbers;
	private TabItem tabGlobalPatternSets;

	/**
	 * @param parent
	 */
	public EsxEditorPartGlobal(EsxEditor parent) {
		super(parent);
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxEditorPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);

		sashForm = new SashForm(parent, SWT.NONE);

		editorGlobal = new EsxCompositeGlobal(this, sashForm, SWT.NONE);

		tabFolder = new TabFolder(sashForm, SWT.NONE);

		tabGlobalMidiCC = new TabItem(tabFolder, SWT.NONE);
		editorGlobalMidiCC = new EsxCompositeGlobalMidiCC(this, tabFolder,
				SWT.NONE);
		tabGlobalMidiCC.setText("Midi Control Change Assignments");
		tabGlobalMidiCC.setControl(editorGlobalMidiCC);

		tabGlobalNoteNumbers = new TabItem(tabFolder, SWT.NONE);
		editorGlobalNoteNumbers = new EsxCompositeGlobalNoteNumbers(this,
				tabFolder, SWT.NONE);
		tabGlobalNoteNumbers.setText("Part Note Numbers");
		tabGlobalNoteNumbers.setControl(editorGlobalNoteNumbers);

		tabGlobalPatternSets = new TabItem(tabFolder, SWT.NONE);
		editorGlobalPatternSets = new EsxCompositeGlobalPatternSets(this,
				tabFolder, SWT.NONE);
		tabGlobalPatternSets.setText("Pattern Set Assignments");
		tabGlobalPatternSets.setControl(editorGlobalPatternSets);

		sashForm.setWeights(new int[] { 1, 1 });
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxEditorPart#setInput(java.lang.Object)
	 */
	@Override
	public void setInput(Object input) {
		if (input instanceof EsxFile) {
			this.globalParameters = ((EsxFile) input).getGlobalParameters();

			this.refresh();
		}
	}

	/**
	 * 
	 */
	public void refresh() {
		if (this.parentEditor.getActivePage() != EsxEditorPartGlobal.PAGE_INDEX)
			return;

		this.editorGlobal.setInput(this.globalParameters);
		this.editorGlobalMidiCC.setInput(this.globalParameters
				.getMidiControlChangeAssignments());
		this.editorGlobalNoteNumbers.setInput(this.globalParameters
				.getPartNoteNumbers());
		this.editorGlobalPatternSets.setInput(this.globalParameters
				.getPatternSetParameters());
	}
}

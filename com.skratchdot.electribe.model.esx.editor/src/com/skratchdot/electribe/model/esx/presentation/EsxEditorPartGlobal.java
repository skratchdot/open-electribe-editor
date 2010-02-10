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

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

import com.skratchdot.electribe.model.esx.EsxFile;
import com.skratchdot.electribe.model.esx.GlobalParameters;

public class EsxEditorPartGlobal extends EsxEditorPart {
	public static final String ID = "com.skratchdot.electribe.model.esx.presentation.EsxEditorPartGlobal"; //$NON-NLS-1$
	public static final int PAGE_INDEX = 1;
	
	private GlobalParameters globalParameters;

	private SashForm sashForm;
	private EsxCompositeGlobalParameters editorGlobalParameters;
	private EsxCompositeGlobalParametersMidiCC editorGlobalParametersMidiCC;
	private EsxCompositeGlobalParametersNoteNumbers editorGlobalParametersNoteNumbers;
	private EsxCompositeGlobalParametersPatternSets editorGlobalParametersPatternSets;
	private TabFolder tabFolder;
	private TabItem tabMidiCC;
	private TabItem tabNoteNumbers;
	private TabItem tabPatternSets;

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
		
		editorGlobalParameters = new EsxCompositeGlobalParameters(this, sashForm, SWT.NONE);

		tabFolder = new TabFolder(sashForm, SWT.NONE);
		
		tabMidiCC = new TabItem(tabFolder, SWT.NONE);
		editorGlobalParametersMidiCC = new EsxCompositeGlobalParametersMidiCC(this, tabFolder, SWT.NONE);
		tabMidiCC.setText("Midi Control Change Assignments");
		tabMidiCC.setControl(editorGlobalParametersMidiCC);

		tabNoteNumbers = new TabItem(tabFolder, SWT.NONE);
		editorGlobalParametersNoteNumbers = new EsxCompositeGlobalParametersNoteNumbers(this, tabFolder, SWT.NONE);
		tabNoteNumbers.setText("Part Note Numbers");
		tabNoteNumbers.setControl(editorGlobalParametersNoteNumbers);

		tabPatternSets = new TabItem(tabFolder, SWT.NONE);
		editorGlobalParametersPatternSets = new EsxCompositeGlobalParametersPatternSets(this, tabFolder, SWT.NONE);
		tabPatternSets.setText("Pattern Set Assignments");
		tabPatternSets.setControl(editorGlobalParametersPatternSets);

		sashForm.setWeights(new int[] {1, 1});
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxEditorPart#setInput(java.lang.Object)
	 */
	@Override
	public void setInput(Object input) {
		Resource resource =
			(Resource)this.getEditingDomain().getResourceSet().getResources().get(0);
		Object rootObject = resource.getContents().get(0);
		if(rootObject instanceof EsxFile) {
			this.globalParameters = ((EsxFile) rootObject).getGlobalParameters();

			this.refresh();
		}
	}

	/**
	 * 
	 */
	public void refresh() {
		if(this.parentEditor.getActivePage()!=EsxEditorPartGlobal.PAGE_INDEX) return;

		this.editorGlobalParameters.setInput(this.globalParameters);
		this.editorGlobalParametersMidiCC.setInput(this.globalParameters.getMidiControlChangeAssignments());
		this.editorGlobalParametersNoteNumbers.setInput(this.globalParameters.getPartNoteNumbers());
		this.editorGlobalParametersPatternSets.setInput(this.globalParameters.getPatternSetParameters());
	}
}

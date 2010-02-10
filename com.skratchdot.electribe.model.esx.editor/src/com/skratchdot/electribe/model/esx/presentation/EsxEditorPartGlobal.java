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

public class EsxEditorPartGlobal extends EsxEditorPart {
	public static final String ID = "com.skratchdot.electribe.model.esx.presentation.EsxEditorPartGlobal"; //$NON-NLS-1$
	public static final int PAGE_INDEX = 1;

	private SashForm sashForm;
	private EsxCompositeGlobalParameters globalParameters;
	private EsxCompositeGlobalParametersMidiCC globalParametersMidiCC;
	private EsxCompositeGlobalParametersNoteNumbers globalParametersNoteNumbers;
	private EsxCompositeGlobalParametersPatternSets globalParametersPatternSets;
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
		
		globalParameters = new EsxCompositeGlobalParameters(this, sashForm, SWT.NONE);

		tabFolder = new TabFolder(sashForm, SWT.NONE);
		
		tabMidiCC = new TabItem(tabFolder, SWT.NONE);
		globalParametersMidiCC = new EsxCompositeGlobalParametersMidiCC(this, tabFolder, SWT.NONE);
		tabMidiCC.setText("Midi Control Change Assignments");
		tabMidiCC.setControl(globalParametersMidiCC);

		tabNoteNumbers = new TabItem(tabFolder, SWT.NONE);
		globalParametersNoteNumbers = new EsxCompositeGlobalParametersNoteNumbers(this, tabFolder, SWT.NONE);
		tabNoteNumbers.setText("Part Note Numbers");
		tabNoteNumbers.setControl(globalParametersNoteNumbers);

		tabPatternSets = new TabItem(tabFolder, SWT.NONE);
		globalParametersPatternSets = new EsxCompositeGlobalParametersPatternSets(this, tabFolder, SWT.NONE);
		tabPatternSets.setText("Pattern Set Assignments");
		tabPatternSets.setControl(globalParametersPatternSets);

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
			this.globalParameters.setInput(((EsxFile) rootObject).getGlobalParameters());
			this.globalParametersMidiCC.setInput(((EsxFile) rootObject).getGlobalParameters().getMidiControlChangeAssignments());
			this.globalParametersNoteNumbers.setInput(((EsxFile) rootObject).getGlobalParameters().getPartNoteNumbers());
			this.globalParametersPatternSets.setInput(((EsxFile) rootObject).getGlobalParameters().getPatternSetParameters());

			this.refresh();
		}
	}

	/**
	 * 
	 */
	public void refresh() {
		if(this.parentEditor.getActivePage()!=EsxEditorPartGlobal.PAGE_INDEX) return;
		
		globalParameters.refresh();
		globalParametersMidiCC.refresh();
		globalParametersNoteNumbers.refresh();
		globalParametersPatternSets.refresh();
	}
}

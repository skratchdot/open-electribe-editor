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

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.databinding.edit.EMFEditObservables;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.events.ExpansionAdapter;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;

import com.skratchdot.electribe.model.esx.EsxFile;
import com.skratchdot.electribe.model.esx.EsxPackage;


public class EsxEditorPartInfo extends EsxEditorPart {
	private EsxFile esxFile;	
	private FormToolkit toolkit;
	private ScrolledForm form;
	private TableWrapLayout tableWrapLayout;
	private TableWrapData td;
	private Section section;
	private Composite sectionComposite;
	private Label label;
	private Text labelMemFreeInBytes;

	public EsxEditorPartInfo(EsxEditor parent) {
		super(parent);
	}

	@Override
	public void createPartControl(Composite parent) {
		// This tab will only contain one scrolled form
		toolkit = new FormToolkit(parent.getDisplay());
		form = toolkit.createScrolledForm(parent);
		form.setText("Esx File Info");
		tableWrapLayout = new TableWrapLayout();
		tableWrapLayout.numColumns = 1;
		form.getBody().setLayout(tableWrapLayout);

		// Now create the different sections of the form
		createSectionGeneral();

	
	}

	private void createSectionGeneral() {
		td = new TableWrapData(TableWrapData.FILL_GRAB);

		section = toolkit.createSection(form.getBody(), Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		section.setLayoutData(td);
		section.addExpansionListener(new ExpansionAdapter() {
			public void expansionStateChanged(ExpansionEvent e) {
				form.reflow(true);
			}
		});
		section.setText("General");
		section.setDescription("This is the description that goes "+"below the title");
		sectionComposite = toolkit.createComposite(section);
		sectionComposite.setLayout(new GridLayout(2, false));
		section.setClient(sectionComposite);
		
		// Sample Space in Frames:
		label = new Label(sectionComposite, SWT.RIGHT);
		label.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label.setText("Sample Space in Frames:");
		labelMemFreeInBytes = new Text(sectionComposite, SWT.READ_ONLY);
//		labelSampleSpaceFrames.setText(Integer.toString(esxFile.getMemFreeInBytes()));

		Button but;

		but = new Button(sectionComposite, SWT.PUSH);
		but.setText("click me 1");
		but.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				//Sample sss = esxFile.getSamples().get(1);
				//sss.setEnd(10);
				MessageDialog.openInformation(
						parentEditor.getSite().getShell(),
						"Free Memory1",
						Integer.toString(esxFile.getMemFreeInBytes())
					);
			}
		});

		but = new Button(sectionComposite, SWT.PUSH);
		but.setText("click me 2");
		but.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				Resource resource =
					(Resource)parentEditor.getEditingDomain().getResourceSet().getResources().get(0);
				Object rootObject = resource.getContents().get(0);
				EsxFile wow = (EsxFile) rootObject;

					MessageDialog.openInformation(
						parentEditor.getSite().getShell(),
						"Free Memory2",
						Integer.toString(wow.getMemFreeInBytes())
					);
			}
		});



		
		/*
		DataBindingContext dataBindingContext = new DataBindingContext();
		dataBindingContext.bindValue(
			SWTObservables.observeText(labelSampleSpaceFrames),
			EMFObservables.observeValue(esxFile.getSamples().get(1), EsxPackage.Literals.SAMPLE__END)
		);
*/
		
		//EMFObservables.observeList(esxFile.getMemFreeInBytes(), EsxPackage.Literals.ESX_FILE__MEM_FREE_IN_BYTES);
		//EMFObservables.observeValue(esxFile.getMemFreeInBytes(), null);
		
		

/*		
		ataBindingContext bindingContext = new DataBindingContext();
		firstName.setText("Hallo");
		GridData gridData = new GridData();
		gridData.horizontalAlignment = GridData.FILL;
		gridData.horizontalSpan = 2;
		firstName.setLayoutData(gridData);
		
		bindingContext.bindValue(
			SWTObservables.observeText(firstName, SWT.Modify),
			EMFObservables.observeValue(lars,DomainmodelemfPackage.Literals.IPERSON__FIRST_NAME), 
			null, 
			null
		);
	*/	
		/*

		
		label = new Label(sectionComposite, SWT.RIGHT);
		label.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label.setText("Sample Space in Frames:");
		labelSampleSpaceFrames = new Text(sectionComposite, SWT.READ_ONLY);
		labelSampleSpaceFrames.setText("wow");
*/

	}
	
	@Override
	public void setInput(Object input) {
		Resource resource =
			(Resource)this.getEditingDomain().getResourceSet().getResources().get(0);
		Object rootObject = resource.getContents().get(0);
		if(rootObject instanceof EsxFile) {
			this.esxFile = (EsxFile) rootObject;

			// The DataBindingContext object will manage the databindings
			EMFDataBindingContext bindingContext;
			IObservableValue uiElement;
			IObservableValue modelElement;
			
			// Bind labelMemFreeInBytes
			bindingContext = new EMFDataBindingContext();
			uiElement = SWTObservables.observeText(labelMemFreeInBytes);
	        modelElement = EMFEditObservables.observeValue(parentEditor.getEditingDomain(), esxFile, EsxPackage.Literals.ESX_FILE__MEM_FREE_IN_BYTES);
	        bindingContext.bindValue(uiElement, modelElement, null, null );
		
		}
	}

	@Override
	public void dispose() {
		toolkit.dispose();
		super.dispose();
	}

}
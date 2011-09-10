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

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import com.skratchdot.electribe.model.esx.EsxFactory;
import com.skratchdot.electribe.model.esx.EsxFile;
import com.skratchdot.electribe.model.esx.util.EsxUtil;

public class ImportPatternWizardPageSelectFile extends WizardPage {
	private boolean isValidFile = false;
	private FileFieldEditor fileFieldEditor;

	/**
	 * Create the wizard.
	 */
	public ImportPatternWizardPageSelectFile() {
		super("wizardPage");
		setTitle("Select");
		setDescription("Select the .esx file from which you want to import patterns.");
	}

	/**
	 * Create contents of the wizard.
	 * @param parent
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		setControl(container);
		container.setLayout(new GridLayout(3, false));

		fileFieldEditor = new FileFieldEditor("fileSelect", "Select File: ", container);
		String[] extensions = new String[] { "*.esx" };
		fileFieldEditor.setFileExtensions(extensions);
		fileFieldEditor.setPropertyChangeListener(new IPropertyChangeListener(){

			@Override
			public void propertyChange(PropertyChangeEvent event) {
				// Assume we are in an invalid state
				isValidFile = false;

				// Check to see if we have a valid esx file
				File file = new File(fileFieldEditor.getStringValue());
				if(file.exists()) {
					try {
						InputStream inputStream = new FileInputStream(file);
						byte[] esxFileBytes = EsxUtil.inputStreamToByteArray(inputStream);

						// Confirm bytes are valid
						if(EsxUtil.isValidEsxFile(esxFileBytes)) {
							// Now create the EsxFile
							EsxFile esxFile = EsxFactory.eINSTANCE.createEsxFile();
							esxFile.init(esxFileBytes, new NullProgressMonitor());
							ResourceSet resourceSet = new ResourceSetImpl();
							URI fileURI = URI.createFileURI(file.getAbsolutePath());
							Resource resource = resourceSet.createResource(fileURI);
							resource.getContents().add(esxFile);							
							isValidFile = true;
							((ImportPatternWizard)getWizard()).setSrcEsxFile(esxFile);
						}

					} catch (Exception exception) {
						exception.printStackTrace();
					}
				}
				
				if(!isValidFile) {
					setErrorMessage("Please select a valid .esx file");
					((ImportPatternWizard)getWizard()).setSrcEsxFile(null);
				}
				else {
					setErrorMessage(null);
					setMessage("You have selected a valid .esx file. Continue by pressing NEXT.");
				}
				
				getWizard().getContainer().updateButtons();
				getWizard().getContainer().updateMessage();
			}});

	}
	
	@Override
	public boolean canFlipToNextPage() {
		return isValidFile;
	}
	
}

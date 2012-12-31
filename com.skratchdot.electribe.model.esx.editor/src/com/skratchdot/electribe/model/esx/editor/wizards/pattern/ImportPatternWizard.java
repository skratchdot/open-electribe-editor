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

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.ReplaceCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import com.skratchdot.electribe.model.esx.EsxFile;
import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.PartDrum;
import com.skratchdot.electribe.model.esx.PartKeyboard;
import com.skratchdot.electribe.model.esx.PartStretchSlice;
import com.skratchdot.electribe.model.esx.Pattern;
import com.skratchdot.electribe.model.esx.Sample;
import com.skratchdot.electribe.model.esx.presentation.EsxEditor;
import com.skratchdot.electribe.model.esx.provider.EsxItemProviderAdapterFactory;

public class ImportPatternWizard extends Wizard implements IImportWizard {
	private boolean ableToFinish = false;
	private ImportPatternWizardPageSelectFile pageSelectFile;
	private ImportPatternWizardPageSelectPatterns pageSelectPatterns;
	private ImportPatternWizardPageSetSamples pageSetSamples;
	private ImportPatternWizardPageSetPatterns pageSetPatterns;

	protected EsxFile srcEsxFile;
	protected EsxFile destEsxFile;
	protected EsxItemProviderAdapterFactory adapterFactory = new EsxItemProviderAdapterFactory();

	public ImportPatternWizard() {
		setWindowTitle("Import Patterns Wizard");
		this.pageSelectFile = new ImportPatternWizardPageSelectFile();
		this.pageSelectPatterns = new ImportPatternWizardPageSelectPatterns();
		this.pageSetPatterns = new ImportPatternWizardPageSetPatterns();
		this.pageSetSamples = new ImportPatternWizardPageSetSamples();
	}

	public AdapterFactory getAdapterFactory() {
		return adapterFactory;
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	public void init(IWorkbench workbench, EsxFile destEsxFile) {
		this.setDestEsxFile(destEsxFile);
	}

	@Override
	public void addPages() {
		addPage(pageSelectFile);
		addPage(pageSelectPatterns);
		addPage(pageSetPatterns);
		addPage(pageSetSamples);
	}

	@Override
	public boolean canFinish() {
		return ableToFinish;
	}

	@Override
	public boolean performFinish() {
		IWorkbench wb = PlatformUI.getWorkbench();
		IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
		IWorkbenchPage page = win.getActivePage();
		IEditorPart editor = page.getActiveEditor();
		boolean isImportSampleButtonChecked = getPageSelectPatterns()
				.isImportSampleButtonChecked();

		// If the active editor is an EsxEditor
		if (editor != null && editor instanceof EsxEditor) {

			// Get our EsxFile
			EditingDomain editingDomain = ((EsxEditor) editor)
					.getEditingDomain();
			Resource resource = (Resource) editingDomain.getResourceSet()
					.getResources().get(0);
			Object rootObject = resource.getContents().get(0);
			if (rootObject instanceof EsxFile) {
				EsxFile esxFile = (EsxFile) rootObject;

				// Prepare a compound command to store our sample and pattern updates
				CompoundCommand cmd = new CompoundCommand();

				// Get our maps
				PatternMap[] patternMaps = this.getPageSetPatterns()
						.getPatternMaps();
				SampleMap[] sampleMaps = this.getPageSetSamples()
						.getSampleMaps();

				// Import Samples
				if (isImportSampleButtonChecked) {
					for (int i = 0; i < sampleMaps.length; i++) {
						Sample sourceSample = this.srcEsxFile.getSamples().get(
								sampleMaps[i].source);
						Sample destinationSample = this.destEsxFile
								.getSamples().get(sampleMaps[i].destination);
						sourceSample.setSampleNumberOriginal(destinationSample
								.getSampleNumberOriginal());
						cmd.append(new ReplaceCommand(editingDomain, esxFile,
								EsxPackage.eINSTANCE.getEsxFile_Samples(),
								destinationSample, sourceSample));
					}
				}

				// Import Patterns
				for (int i = 0; i < patternMaps.length; i++) {
					Pattern sourcePattern = this.srcEsxFile.getPatterns().get(
							patternMaps[i].source);
					Pattern destinationPattern = this.destEsxFile.getPatterns()
							.get(patternMaps[i].destination);
					sourcePattern.setPatternNumberOriginal(destinationPattern
							.getPatternNumberOriginal());
					// If we are importing samples, we need to use the sample locations set in sampleMaps
					if (isImportSampleButtonChecked) {
						EList<PartDrum> currentDrumParts = sourcePattern
								.getDrumParts();
						EList<PartKeyboard> currentKeyboardParts = sourcePattern
								.getKeyboardParts();
						EList<PartStretchSlice> currentStretchSliceParts = sourcePattern
								.getStretchSliceParts();
						int sourceSamplePointer = -1;
						int destinationSamplePointer = -1;
						for (int j = 0; j < currentDrumParts.size(); j++) {
							sourceSamplePointer = currentDrumParts.get(j)
									.getSamplePointer();
							destinationSamplePointer = getFromSampleMap(
									sampleMaps, sourceSamplePointer);
							currentDrumParts.get(j).setSamplePointer(
									(short) destinationSamplePointer);
						}
						for (int j = 0; j < currentKeyboardParts.size(); j++) {
							sourceSamplePointer = currentKeyboardParts.get(j)
									.getSamplePointer();
							destinationSamplePointer = getFromSampleMap(
									sampleMaps, sourceSamplePointer);
							currentKeyboardParts.get(j).setSamplePointer(
									(short) destinationSamplePointer);
						}
						for (int j = 0; j < currentStretchSliceParts.size(); j++) {
							sourceSamplePointer = currentStretchSliceParts.get(
									j).getSamplePointer();
							destinationSamplePointer = getFromSampleMap(
									sampleMaps, sourceSamplePointer);
							currentStretchSliceParts.get(j).setSamplePointer(
									(short) destinationSamplePointer);
						}
					}
					cmd.append(new ReplaceCommand(editingDomain, esxFile,
							EsxPackage.eINSTANCE.getEsxFile_Patterns(),
							destinationPattern, sourcePattern));
				}

				// We've finished creating ReplaceCommands for samples/patterns and adding them
				// to our CompoundCommand.  Now we can execute our CompoundCommand.
				if (cmd.canExecute()) {
					editingDomain.getCommandStack().execute(cmd);
				}
			}
		}

		return true;
	}

	public boolean isAbleToFinish() {
		return ableToFinish;
	}

	public void setAbleToFinish(boolean ableToFinish) {
		this.ableToFinish = ableToFinish;
	}

	public EsxFile getSrcEsxFile() {
		return srcEsxFile;
	}

	public void setSrcEsxFile(EsxFile srcEsxFile) {
		this.srcEsxFile = srcEsxFile;
	}

	public EsxFile getDestEsxFile() {
		return destEsxFile;
	}

	public void setDestEsxFile(EsxFile destEsxFile) {
		this.destEsxFile = destEsxFile;
	}

	public ImportPatternWizardPageSelectFile getPageSelectFile() {
		return pageSelectFile;
	}

	public void setPageSelectFile(
			ImportPatternWizardPageSelectFile pageSelectFile) {
		this.pageSelectFile = pageSelectFile;
	}

	public ImportPatternWizardPageSelectPatterns getPageSelectPatterns() {
		return pageSelectPatterns;
	}

	public void setPageSelectPatterns(
			ImportPatternWizardPageSelectPatterns pageSelectPatterns) {
		this.pageSelectPatterns = pageSelectPatterns;
	}

	public ImportPatternWizardPageSetSamples getPageSetSamples() {
		return pageSetSamples;
	}

	public void setPageSetSamples(
			ImportPatternWizardPageSetSamples pageSetSamples) {
		this.pageSetSamples = pageSetSamples;
	}

	public ImportPatternWizardPageSetPatterns getPageSetPatterns() {
		return pageSetPatterns;
	}

	public void setPageSetPatterns(
			ImportPatternWizardPageSetPatterns pageSetPatterns) {
		this.pageSetPatterns = pageSetPatterns;
	}

	private int getFromSampleMap(SampleMap[] sampleMaps, int sourceValue) {
		for (int i = 0; i < sampleMaps.length; i++) {
			if (sampleMaps[i].source == sourceValue) {
				return sampleMaps[i].destination;
			}
		}
		return -1;
	}

}

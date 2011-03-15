/**
 * Copyright (c) 2009-2011 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    JEFF |:at:| SKRATCHDOT |:dot:| COM
 *
 * $Id$
 */
package com.skratchdot.electribe.model.esx.editor.commands;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;

import com.skratchdot.electribe.model.esx.EsxFile;
import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.PartWithSample;
import com.skratchdot.electribe.model.esx.Pattern;
import com.skratchdot.electribe.model.esx.Sample;
import com.skratchdot.electribe.model.esx.util.EsxUtil;

public class SyncPointersCommand extends CompoundCommand {
	private EsxFile esxFile;
	private AdapterFactoryEditingDomain editingDomain;

	public SyncPointersCommand(Resource resource, AdapterFactoryEditingDomain editingDomain) {
		super();
		Object rootObject = resource.getContents().get(0);
		if(rootObject instanceof EsxFile) {
			this.esxFile = (EsxFile) rootObject;
		}
		this.editingDomain = editingDomain;
		syncSamplePointersCommand();
		syncPatternPointersCommand();
	}

	private void syncSamplePointersCommand() {
		// First loop through all the parts that samples are used,
		// and setup the correct sample pointer.  At the end of this
		// function, we will sync current/original sample values
		if(esxFile.isSyncSamplesOnMoveEnabled()==true) {
			// Loop through all the patterns
			for(int i=0; i<EsxUtil.NUM_PATTERNS; i++) {
				Pattern currentPattern = esxFile.getPatterns().get(i);
				setSamplePointerCommand(currentPattern.getDrumParts());
				setSamplePointerCommand(currentPattern.getKeyboardParts());
				setSamplePointerCommand(currentPattern.getStretchSliceParts());
			}
		}

		// Now we can sync current/original sample numbers
		for(int i=0; i<EsxUtil.NUM_SAMPLES; i++) {
			Sample currentSample = null;
			currentSample = esxFile.getSamples().get(i);
			if(currentSample.getSampleNumberOriginal().compareTo(currentSample.getSampleNumberCurrent())!=0) {
				this.append(SetCommand.create(
					this.editingDomain,
					currentSample,
					EsxPackage.Literals.SAMPLE__SAMPLE_NUMBER_ORIGINAL,
					currentSample.getSampleNumberCurrent()
				));
			}
		}
	}

	private void syncPatternPointersCommand() {
	}

	private void setSamplePointerCommand(EList<? extends PartWithSample> partWithSampleList) {
		short currentSamplePointer;
		Sample currentSample = null;

		for(int i=0; i<partWithSampleList.size(); i++) {
			currentSamplePointer = partWithSampleList.get(i).getSamplePointer();
			try {
				currentSample = esxFile.getSampleFromPointer(currentSamplePointer);
			} catch (Exception e) {
				currentSample = null;
			}
			if(currentSample!=null) {
				short newValue = (short) currentSample.getSampleNumberCurrent().getValue();
				if(partWithSampleList.get(i).getSamplePointer()!=newValue) {
					this.append(SetCommand.create(
						this.editingDomain,
						partWithSampleList.get(i),
						EsxPackage.Literals.PART_WITH_SAMPLE__SAMPLE_POINTER,
						newValue
					));
				}
			}
		}
	}

}

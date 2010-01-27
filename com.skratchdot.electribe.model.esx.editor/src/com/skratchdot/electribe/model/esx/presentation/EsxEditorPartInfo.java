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

import java.lang.reflect.Field;

import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.databinding.edit.EMFEditObservables;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.events.ExpansionAdapter;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;

import com.skratchdot.electribe.model.esx.EsxFile;
import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.util.EsxUtil;


public class EsxEditorPartInfo extends EsxEditorPart {
	public static final String ID = "com.skratchdot.electribe.model.esx.presentation.EsxEditorPartInfo"; //$NON-NLS-1$

	private EsxFile esxFile;	
	private FormToolkit toolkit;
	private ScrolledForm form;
	private TableWrapLayout tableWrapLayout;
	private TableWrapData td;
	private Section section;
	private Composite sectionComposite;
	private Composite rowSpacer;
	private Composite rowComposite;
	private Label label;
	private int rowLabelWidth = 150;
	private int rowLabelHeight = 15;
	private int rowSpacerHeight = 5; // will be added above and below
	private EMFDataBindingContext bindingContext;
	private Text labelMemFreeInBytes;
	private Text labelMemUsedInBytes;
	private Text labelNumSamplesUsed;
	private Text labelNumSamplesMonoUsed;
	private Text labelNumSamplesStereoUsed;
	private Text labelNumPatternsUsed;
	private Text labelNumSongsUsed;

	/**
	 * @param parent
	 */
	public EsxEditorPartInfo(EsxEditor parent) {
		super(parent);
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxEditorPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
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
		createSectionPatterns("Patterns", 2);
		createSectionSamples("Samples", 3);
		createSectionSongs("Songs", 4);
	}
	
	/**
	 * @param title
	 */
	private void createSectionComposite(String title) {
		td = new TableWrapData(TableWrapData.FILL_GRAB);

		section = toolkit.createSection(form.getBody(), Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		section.setLayoutData(td);
		section.addExpansionListener(new ExpansionAdapter() {
			public void expansionStateChanged(ExpansionEvent e) {
				form.reflow(true);
			}
		});
		section.setText(title);
		sectionComposite = toolkit.createComposite(section);
		sectionComposite.setLayout(createRowLayout(SWT.VERTICAL,0,0,0,0,0));
		section.setClient(sectionComposite);
	}
	
	/**
	 * @param type
	 * @param marginTop
	 * @param marginRight
	 * @param marginLeft
	 * @param marginBottom
	 * @param spacing
	 * @return
	 */
	private RowLayout createRowLayout(int type, int marginTop, int marginRight, int marginLeft, int marginBottom, int spacing) {
		RowLayout rowLayout = new RowLayout(type);
		rowLayout.marginTop = marginTop;
		rowLayout.marginRight = marginRight;
		rowLayout.marginLeft = marginLeft;
		rowLayout.marginBottom = marginBottom;
		rowLayout.spacing = spacing;
		return rowLayout;
	}

	/**
	 * 
	 */
	private void createRowSpacer() {
		rowSpacer = new Composite(sectionComposite, SWT.NONE);
		rowSpacer.setLayoutData(new RowData(rowLabelWidth, rowSpacerHeight));
		rowSpacer.setBackground(getSite().getShell().getDisplay().getSystemColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
	}

	/**
	 * @param title
	 */
	private void createRow(String title) {
		createRowSpacer();
		rowComposite = new Composite(sectionComposite, SWT.NONE);
		rowComposite.setLayout(createRowLayout(SWT.HORIZONTAL,0,0,0,0,5));
		/* LABEL */
		label = new Label(rowComposite, SWT.NONE);
		label.setAlignment(SWT.RIGHT);
		label.setBackground(getSite().getShell().getDisplay().getSystemColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		label.setLayoutData(new RowData(rowLabelWidth, rowLabelHeight));
		label.setText(title);
		createRowSpacer();
	}

	/**
	 * @param title
	 * @param textFieldToBind
	 * @param maxValue
	 */
	private void createRowUsingXOf(String title, String textFieldToBind, String maxValue) {
		/* Create The Row */
		this.createRow(title);

		/* Add the "Using" label */
		label = new Label(rowComposite, SWT.NONE);
		label.setText(" Using");

		/* Use reflection to get the private Text field specified by
		 * textFieldToBind
		 */
		try {
		    Field textField = this.getClass().getDeclaredField(textFieldToBind);
		    textField.set(this, new Text(rowComposite, SWT.READ_ONLY | SWT.NONE));
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		/* Add the "of" label with the maxValue */
		label = new Label(rowComposite, SWT.LEFT);
		label.setText("of  " + maxValue);	
	}

	/**
	 * @param title
	 * @param pageIndex
	 * @param description
	 */
	private void createDescription(String title, final int pageIndex, String description) {
		rowComposite = new Composite(sectionComposite, SWT.NONE);
		rowComposite.setLayout(createRowLayout(SWT.HORIZONTAL,0,0,0,5,0));
		Hyperlink link = toolkit.createHyperlink(rowComposite, title.toUpperCase(), SWT.NONE);
		link.addHyperlinkListener(new HyperlinkAdapter() {
			@Override
			public void linkActivated(HyperlinkEvent e) {
				parentEditor.setActivePage(pageIndex);
			}
		});
		label = new Label(rowComposite, SWT.NONE);
		label.setText(" - " + description);
	}

	/**
	 * @param title
	 * @param pageIndex
	 */
	private void createSectionSamples(String title, int pageIndex) {
		// Create Section
		this.createSectionComposite(title);

		// Description
		this.createDescription(
			title,
			pageIndex,
			"The Samples tab will let you arrange and edit your samples." +
			" Please note: if you have a negative amount of \"Free Memory\"," +
			" you will not be able to save your .esx file. In this case you will" +
			" have to delete a few samples until you have a positive amount of free" +
			" memory (or 0)."
		);

		// Number Of Samples Used:
		this.createRowUsingXOf(
			"# Samples Used:",
			"labelNumSamplesUsed",
			Integer.toString((EsxUtil.NUM_SAMPLES))
		);

		// Number Of Mono Samples Used:
		this.createRowUsingXOf(
			"# Samples Used (MONO):",
			"labelNumSamplesMonoUsed",
			Integer.toString((EsxUtil.NUM_SAMPLES_MONO))
		);

		// Number Of Stereo Samples Used:
		this.createRowUsingXOf(
			"# Samples Used (STEREO):",
			"labelNumSamplesStereoUsed",
			Integer.toString((EsxUtil.NUM_SAMPLES_STEREO))
		);

		// Memory Used In Bytes:
		this.createRowUsingXOf(
			"Memory Used (In Bytes):",
			"labelMemUsedInBytes",
			Integer.toString((EsxUtil.MAX_NUM_SAMPLES * 2))
		);

		// Memory Free In Bytes:
		this.createRow("Memory Free (In Bytes):");
		labelMemFreeInBytes = new Text(rowComposite, SWT.READ_ONLY | SWT.NONE);
	}
	
	/**
	 * @param title
	 * @param pageIndex
	 */
	private void createSectionPatterns(String title, int pageIndex) {
		// Create Section
		this.createSectionComposite(title);

		// Description
		this.createDescription(
			title,
			pageIndex,
			"The Patterns tab will let you arrange and edit your patterns."
		);

		// Number Of Patterns Used:
		this.createRowUsingXOf(
			"# Patterns Used:",
			"labelNumPatternsUsed",
			Integer.toString((EsxUtil.NUM_PATTERNS))
		);
	}

	/**
	 * @param title
	 * @param pageIndex
	 */
	private void createSectionSongs(String title, int pageIndex) {
		// Create Section
		this.createSectionComposite(title);

		// Description
		this.createDescription(
			title,
			pageIndex,
			"The Songs tab will let you arrange and edit your songs." +
			" Please note: if you have a more than 20,000 song events," +
			" you will not be able to save your .esx file. In this case you will" +
			" have to delete a song events until you have less than 20,000"
		);

		// Number Of Songs Used:
		this.createRowUsingXOf(
			"# Songs Used:",
			"labelNumSongsUsed",
			Integer.toString((EsxUtil.NUM_SONGS))
		);
	}

	/**
	 * 
	 */
	private void initDataBindings() {
		// The DataBindingContext object will manage the databindings
		if(bindingContext!=null) {
			bindingContext.dispose();
		}
		bindingContext = new EMFDataBindingContext();
		
		// labelNumSamplesUsed
		if(this.labelNumSamplesUsed!=null && this.esxFile!=null) {
			bindingContext.bindValue(
				SWTObservables.observeText(this.labelNumSamplesUsed),
				EMFEditObservables.observeValue(parentEditor.getEditingDomain(), this.esxFile, EsxPackage.Literals.ESX_FILE__NUM_SAMPLES_USED),
				null,
				null
			);
		}

		// labelNumSamplesMonoUsed
		if(this.labelNumSamplesMonoUsed!=null && this.esxFile!=null) {
			bindingContext.bindValue(
				SWTObservables.observeText(this.labelNumSamplesMonoUsed),
				EMFEditObservables.observeValue(parentEditor.getEditingDomain(), this.esxFile, EsxPackage.Literals.ESX_FILE__NUM_SAMPLES_MONO_USED),
				null,
				null
			);
		}

		// labelNumSamplesStereoUsed
		if(this.labelNumSamplesStereoUsed!=null && this.esxFile!=null) {
			bindingContext.bindValue(
				SWTObservables.observeText(this.labelNumSamplesStereoUsed),
				EMFEditObservables.observeValue(parentEditor.getEditingDomain(), this.esxFile, EsxPackage.Literals.ESX_FILE__NUM_SAMPLES_STEREO_USED),
				null,
				null
			);
		}

		// labelUsedFreeInBytes
		if(this.labelMemUsedInBytes!=null && this.esxFile!=null) {
			bindingContext.bindValue(
				SWTObservables.observeText(this.labelMemUsedInBytes),
				EMFEditObservables.observeValue(parentEditor.getEditingDomain(), this.esxFile, EsxPackage.Literals.ESX_FILE__MEM_USED_IN_BYTES),
				null,
				null
			);
		}

		// labelMemFreeInBytes
		if(this.labelMemFreeInBytes!=null && this.esxFile!=null) {
			bindingContext.bindValue(
				SWTObservables.observeText(this.labelMemFreeInBytes),
				EMFEditObservables.observeValue(parentEditor.getEditingDomain(), this.esxFile, EsxPackage.Literals.ESX_FILE__MEM_FREE_IN_BYTES),
				null,
				null
			);
		}

		// labelNumPatternsUsed
		if(this.labelNumPatternsUsed!=null && this.esxFile!=null) {
			bindingContext.bindValue(
				SWTObservables.observeText(this.labelNumPatternsUsed),
				EMFEditObservables.observeValue(parentEditor.getEditingDomain(), this.esxFile, EsxPackage.Literals.ESX_FILE__NUM_PATTERNS_USED),
				null,
				null
			);
		}

		// labelNumSongsUsed
		if(this.labelNumSongsUsed!=null && this.esxFile!=null) {
			bindingContext.bindValue(
				SWTObservables.observeText(this.labelNumSongsUsed),
				EMFEditObservables.observeValue(parentEditor.getEditingDomain(), this.esxFile, EsxPackage.Literals.ESX_FILE__NUM_SONGS_USED),
				null,
				null
			);
		}
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
			this.esxFile = (EsxFile) rootObject;
			this.initDataBindings();
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#dispose()
	 */
	@Override
	public void dispose() {
		toolkit.dispose();
		super.dispose();
	}

}
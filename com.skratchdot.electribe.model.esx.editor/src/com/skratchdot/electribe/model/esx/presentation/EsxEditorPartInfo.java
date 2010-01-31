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

import org.eclipse.emf.ecore.resource.Resource;
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
import com.skratchdot.electribe.model.esx.util.EsxUtil;


public class EsxEditorPartInfo extends EsxEditorPart {
	public static final String ID = "com.skratchdot.electribe.model.esx.presentation.EsxEditorPartInfo"; //$NON-NLS-1$
	public static final int PAGE_INDEX = 0;

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
	private Text textMemFreeInBytes;
	private Text textMemUsedInBytes;
	private Text textNumSamplesUsed;
	private Text textNumSamplesMonoUsed;
	private Text textNumSamplesStereoUsed;
	private Text textNumPatternsUsed;
	private Text textNumSongsUsed;

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
		createSectionPatterns("Patterns", EsxEditorPartPatterns.PAGE_INDEX);
		createSectionSamples("Samples", EsxEditorPartSamples.PAGE_INDEX);
		createSectionSongs("Songs", EsxEditorPartSongs.PAGE_INDEX);
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
	private void createTextRow(String title, String textFieldToBind) {
		/* Create The Row */
		this.createRow(title);

		/* Use reflection to get the private Text field specified by
		 * textFieldToBind
		 */
		try {
		    Field textField = this.getClass().getDeclaredField(textFieldToBind);
		    Text text = new Text(rowComposite, SWT.READ_ONLY | SWT.NONE);
			text.setLayoutData(new RowData(200, SWT.DEFAULT));
		    textField.set(this, text);
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
		this.createTextRow("# Samples Used:", "textNumSamplesUsed");

		// Number Of Mono Samples Used:
		this.createTextRow("# Samples Used (MONO):", "textNumSamplesMonoUsed");

		// Number Of Stereo Samples Used:
		this.createTextRow("# Samples Used (STEREO):", "textNumSamplesStereoUsed");

		// Memory Used In Bytes:
		this.createTextRow("Memory Used (In Bytes):", "textMemUsedInBytes");

		// Memory Free In Bytes:
		this.createTextRow("Memory Free (In Bytes):", "textMemFreeInBytes");
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
		this.createTextRow("# Patterns Used:", "textNumPatternsUsed");
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
		this.createTextRow("# Songs Used:", "textNumSongsUsed");
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
			this.refresh();
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

	/**
	 * 
	 */
	public void refresh() {
		if(this.parentEditor.getActivePage()!=EsxEditorPartInfo.PAGE_INDEX) return;

		textMemFreeInBytes.setText(Integer.toString(esxFile.getMemFreeInBytes()));
		textMemUsedInBytes.setText("Using " + esxFile.getMemUsedInBytes() + " of " + EsxUtil.MAX_NUM_SAMPLES * 2);
		textNumSamplesUsed.setText("Using " + esxFile.getNumSamplesUsed() + " of " + EsxUtil.NUM_SAMPLES);
		textNumSamplesMonoUsed.setText("Using " + esxFile.getNumSamplesMonoUsed() + " of " + EsxUtil.NUM_SAMPLES_MONO);
		textNumSamplesStereoUsed.setText("Using " + esxFile.getNumSamplesStereoUsed() + " of " + EsxUtil.NUM_SAMPLES_STEREO);
		textNumPatternsUsed.setText("Using " + esxFile.getNumPatternsUsed() + " of " + EsxUtil.NUM_PATTERNS);
		textNumSongsUsed.setText("Using " + esxFile.getNumSongsUsed() + " of " + EsxUtil.NUM_SONGS);
	}

}
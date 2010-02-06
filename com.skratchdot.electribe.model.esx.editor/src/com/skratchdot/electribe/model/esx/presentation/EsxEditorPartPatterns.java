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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.PlatformUI;

import com.skratchdot.electribe.model.esx.EsxFile;
import com.skratchdot.electribe.model.esx.preferences.EsxPreferenceNames;
import com.skratchdot.electribe.model.esx.preferences.EsxPreferenceStore;

public class EsxEditorPartPatterns extends EsxEditorPart {
	public static final String ID = "com.skratchdot.electribe.model.esx.presentation.EsxEditorPartPatterns"; //$NON-NLS-1$
	public static final int PAGE_INDEX = 2;

	private TableViewer tableViewer;
	private TableScrollSpeedListener tableViewerScrollSpeedListener;

	/**
	 * @param parent
	 */
	public EsxEditorPartPatterns(EsxEditor parent) {
		super(parent);
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxEditorPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		// Create sashForm
		SashForm sashForm = new SashForm(parent, SWT.NONE);
		sashForm.setOrientation(SWT.VERTICAL);

		// Create groupSamples
		Group groupPatterns = new Group(sashForm, SWT.NONE);
		groupPatterns.setLayout(new GridLayout(1, true));
		groupPatterns.setText("Patterns");

		// Create this.tableViewer
		this.tableViewer = new TableViewer(groupPatterns, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
		this.initTableViewer();

		// Create groupSelectedSample
		Group groupSelectedPattern = new Group(sashForm, SWT.NONE);
		groupSelectedPattern.setLayout(new FillLayout(SWT.HORIZONTAL));
		groupSelectedPattern.setText("Selected Pattern");
		
		TabFolder tabFolder = new TabFolder(groupSelectedPattern, SWT.NONE);

		TabItem tabParts = new TabItem(tabFolder, SWT.NONE);
		tabParts.setText("Parts");
		TabItem tabDrum1 = new TabItem(tabFolder, SWT.NONE);
		tabDrum1.setText("Drum 1");
		TabItem tabDrum2 = new TabItem(tabFolder, SWT.NONE);
		tabDrum2.setText("Drum 2");
		TabItem tabDrum3 = new TabItem(tabFolder, SWT.NONE);
		tabDrum3.setText("Drum 3");
		TabItem tabDrum4 = new TabItem(tabFolder, SWT.NONE);
		tabDrum4.setText("Drum 4");
		TabItem tabDrum5 = new TabItem(tabFolder, SWT.NONE);
		tabDrum5.setText("Drum 5");
		TabItem tabDrum6a = new TabItem(tabFolder, SWT.NONE);
		tabDrum6a.setText("Drum 6a");
		TabItem tabDrum6b = new TabItem(tabFolder, SWT.NONE);
		tabDrum6b.setText("Drum 6b");
		TabItem tabDrum7a = new TabItem(tabFolder, SWT.NONE);
		tabDrum7a.setText("Drum 7a");
		TabItem tabDrum7b = new TabItem(tabFolder, SWT.NONE);
		tabDrum7b.setText("Drum 7b");
		TabItem tabKeyboard1 = new TabItem(tabFolder, SWT.NONE);
		tabKeyboard1.setText("Keyboard 1");
		TabItem tabKeyboard2 = new TabItem(tabFolder, SWT.NONE);
		tabKeyboard2.setText("Keyboard 2");
		TabItem tabStretch1 = new TabItem(tabFolder, SWT.NONE);
		tabStretch1.setText("Stretch 1");
		TabItem tabStretch2 = new TabItem(tabFolder, SWT.NONE);
		tabStretch2.setText("Stretch 2");
		TabItem tabSlice = new TabItem(tabFolder, SWT.NONE);
		tabSlice.setText("Slice");
		TabItem tabAudioIn = new TabItem(tabFolder, SWT.NONE);
		tabAudioIn.setText("AudioIn");
		TabItem tabAccent = new TabItem(tabFolder, SWT.NONE);
		tabAccent.setText("Accent");
	}

	/**
	 * 
	 */
	private void initTableViewer() {
		// Create the table
		Table table = this.tableViewer.getTable();
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		// Create our columns
		this.addColumnToTableViewer(this.tableViewer, "Esx#", 45);
		this.addColumnToTableViewer(this.tableViewer, "Orig#", 45);
		this.addColumnToTableViewer(this.tableViewer, "Name", 100);
		this.addColumnToTableViewer(this.tableViewer, "Tempo", 50);
		this.addColumnToTableViewer(this.tableViewer, "Swing", 50);
		this.addColumnToTableViewer(this.tableViewer, "Length", 50);
		this.addColumnToTableViewer(this.tableViewer, "Beat", 50);
		this.addColumnToTableViewer(this.tableViewer, "Roll", 50);
		this.addColumnToTableViewer(this.tableViewer, "FxChain", 50);
		this.addColumnToTableViewer(this.tableViewer, "LastStep", 50);
		this.addColumnToTableViewer(this.tableViewer, "ArpScale", 100);
		this.addColumnToTableViewer(this.tableViewer, "CenterNote", 100);
		this.addColumnToTableViewer(this.tableViewer, "Fx1 Type", 100);
		this.addColumnToTableViewer(this.tableViewer, "Fx2 Type", 100);
		this.addColumnToTableViewer(this.tableViewer, "Fx3 Type", 100);

		// Allow all the columns to be moved
		TableColumn[] columns = table.getColumns();
		for (int i = 0; i < columns.length; i++) {
			columns[i].setMoveable(true);
		}

		// Setup this.tableViewer ContentProvider
		this.tableViewer.setContentProvider(new AdapterFactoryContentProvider(this.getAdapterFactory()) {

			@Override
			public Object[] getElements(Object object) {
				return ((EsxFile)object).getPatterns().toArray();
			}

			@Override
			public void notifyChanged(Notification notification) {
				super.notifyChanged(new ViewerNotification(notification));
			}
			
		});

		// Label Provider		
		this.tableViewer.setLabelProvider(new TableViewerColorProvider(
			this.getAdapterFactory(),
			this.tableViewer,
			EsxPreferenceStore.getPatternsBackgroundColorWhenNotEmpty(),
			EsxPreferenceStore.getPatternsBackgroundColorWhenEmpty(),
			EsxPreferenceStore.getPatternsForegroundColorWhenNotEmpty(),
			EsxPreferenceStore.getPatternsForegroundColorWhenEmpty()
		));

		// Sync the scroll speed with our preference
		tableViewerScrollSpeedListener = this.syncScrollSpeedWithPreference(
			this.tableViewer,
			tableViewerScrollSpeedListener,
			EsxPreferenceStore.getPatternsScrollSpeed(),
			EsxPreferenceStore.getPatternsUseScrollSpeed()
		);

		// listen for preference change events
		PlatformUI.getPreferenceStore().addPropertyChangeListener((IPropertyChangeListener) this);

		// Setup Context Menu
	    createContextMenuFor(this.tableViewer);

	    // Selection Provider For EsxEditor
	    getEditorSite().setSelectionProvider(this.tableViewer);
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxEditorPart#propertyChange(org.eclipse.jface.util.PropertyChangeEvent)
	 */
	@Override
	public void propertyChange(PropertyChangeEvent event) {
		super.propertyChange(event);

		// Scroll Speed Changes
		if(event.getProperty().equals(EsxPreferenceNames.PATTERNS_SCROLL_SPEED) ||
			event.getProperty().equals(EsxPreferenceNames.PATTERNS_USE_SCROLL_SPEED)) {
			tableViewerScrollSpeedListener = this.syncScrollSpeedWithPreference(
				this.tableViewer,
				tableViewerScrollSpeedListener,
				EsxPreferenceStore.getPatternsScrollSpeed(),
				EsxPreferenceStore.getPatternsUseScrollSpeed()
			);
			this.tableViewer.refresh();
		}
		
		// Color Changes
		if(event.getProperty().equals(EsxPreferenceNames.PATTERNS_BACKGROUND_COLOR_WHEN_NOT_EMPTY) ||
				event.getProperty().equals(EsxPreferenceNames.PATTERNS_BACKGROUND_COLOR_WHEN_EMPTY) ||
				event.getProperty().equals(EsxPreferenceNames.PATTERNS_FOREGROUND_COLOR_WHEN_NOT_EMPTY) ||
				event.getProperty().equals(EsxPreferenceNames.PATTERNS_FOREGROUND_COLOR_WHEN_EMPTY)) {
			((TableViewerColorProvider)this.tableViewer.getLabelProvider()).setAllColors(
				EsxPreferenceStore.getPatternsBackgroundColorWhenNotEmpty(),
				EsxPreferenceStore.getPatternsBackgroundColorWhenEmpty(),
				EsxPreferenceStore.getPatternsForegroundColorWhenNotEmpty(),
				EsxPreferenceStore.getPatternsForegroundColorWhenEmpty()
			);
			this.tableViewer.refresh();
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#dispose()
	 */
	@Override
	public void dispose() {
		super.dispose();

		// Remove Listeners added in createPartControl()
		PlatformUI.getPreferenceStore().removePropertyChangeListener((IPropertyChangeListener) this);
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxEditorPart#setFocus()
	 */
	@Override
	public void setFocus() {
		this.tableViewer.getTable().setFocus();
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
			this.tableViewer.setInput(rootObject);
			this.refresh();
		}
	}

	/**
	 * 
	 */
	public void refresh() {
		if(this.parentEditor.getActivePage()!=EsxEditorPartPatterns.PAGE_INDEX) return;

		this.tableViewer.refresh();
	}

}

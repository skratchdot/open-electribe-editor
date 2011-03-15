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
package com.skratchdot.electribe.model.esx.presentation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.edit.ui.dnd.ViewerDragAdapter;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import com.skratchdot.electribe.model.esx.EsxFile;
import com.skratchdot.electribe.model.esx.Pattern;
import com.skratchdot.electribe.model.esx.preferences.EsxPreferenceNames;
import com.skratchdot.electribe.model.esx.preferences.EsxPreferenceStore;

public class EsxEditorPartPatterns extends EsxEditorPart {
	public static final String ID = "com.skratchdot.electribe.model.esx.presentation.EsxEditorPartPatterns"; //$NON-NLS-1$
	public static final int PAGE_INDEX = 2;
	public static final String ID_PATTERN_VIEWER = ID+".PatternViewer"; //$NON-NLS-1$

	private TableViewer tableViewer;
	private TableScrollSpeedListener tableViewerScrollSpeedListener;

	private EsxCompositePattern editorPattern;
	private EsxCompositePatternFx editorPatternFx;
	private EsxCompositePatternParts editorPatternParts;
	private EsxCompositePatternMotionSequences editorPatternMotionSequences;

	private TabFolder tabFolder;
	private TabItem tabPattern;
	private TabItem tabPatternFx;
	private TabItem tabPatternParts;
	private TabItem tabPatternMotionSequences;

	private List<Pattern> selectedPatterns = new ArrayList<Pattern>();

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

		// Create groupPatterns
		Group groupPatterns = new Group(sashForm, SWT.NONE);
		groupPatterns.setLayout(new GridLayout(1, true));
		groupPatterns.setText("Patterns");

		// Create this.tableViewer
		this.tableViewer = new TableViewer(groupPatterns, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
		this.initTableViewer();

		// Create groupSelectedPatterns
		Group groupSelectedPatterns = new Group(sashForm, SWT.NONE);
		groupSelectedPatterns.setLayout(new FillLayout(SWT.HORIZONTAL));
		groupSelectedPatterns.setText("Selected Patterns");

		tabFolder = new TabFolder(groupSelectedPatterns, SWT.NONE);

		tabPattern = new TabItem(tabFolder, SWT.NONE);
		editorPattern = new EsxCompositePattern(this, tabFolder, SWT.NONE);
		tabPattern.setText("Pattern Editor");
		tabPattern.setControl(editorPattern);

		tabPatternFx = new TabItem(tabFolder, SWT.NONE);
		editorPatternFx = new EsxCompositePatternFx(this, tabFolder, SWT.NONE);
		tabPatternFx.setText("FX");
		tabPatternFx.setControl(editorPatternFx);

		tabPatternParts = new TabItem(tabFolder, SWT.NONE);
		editorPatternParts = new EsxCompositePatternParts(this, tabFolder, SWT.NONE);
		tabPatternParts.setText("Parts");
		tabPatternParts.setControl(editorPatternParts);

		tabPatternMotionSequences = new TabItem(tabFolder, SWT.NONE);
		editorPatternMotionSequences = new EsxCompositePatternMotionSequences(this, tabFolder, SWT.NONE);
		tabPatternMotionSequences.setText("Motion Sequences");
		tabPatternMotionSequences.setControl(editorPatternMotionSequences);
		
		// Only display info for one tab at a time
		editorPattern.isActive = true;
		tabFolder.addSelectionListener(new EsxTabSelectionListener() {

			@Override
			public void onTabChange() {
				setAllInputs();
			}

		});
		
		sashForm.setWeights(new int[] {1, 1});
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
		this.addColumnToTableViewer(this.tableViewer, "Part 1", 100);
		this.addColumnToTableViewer(this.tableViewer, "Part 2", 100);
		this.addColumnToTableViewer(this.tableViewer, "Part 3", 100);
		this.addColumnToTableViewer(this.tableViewer, "Part 4", 100);
		this.addColumnToTableViewer(this.tableViewer, "Part 5", 100);
		this.addColumnToTableViewer(this.tableViewer, "Part 6a", 100);
		this.addColumnToTableViewer(this.tableViewer, "Part 6b", 100);
		this.addColumnToTableViewer(this.tableViewer, "Part 7a", 100);
		this.addColumnToTableViewer(this.tableViewer, "Part 7b", 100);
		this.addColumnToTableViewer(this.tableViewer, "Key 1", 100);
		this.addColumnToTableViewer(this.tableViewer, "Key 2", 100);
		this.addColumnToTableViewer(this.tableViewer, "Stretch 1", 100);
		this.addColumnToTableViewer(this.tableViewer, "Stretch 2", 100);
		this.addColumnToTableViewer(this.tableViewer, "Slice", 100);

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
	    createContextMenuFor(this.tableViewer, EsxEditorPartPatterns.ID_PATTERN_VIEWER);

	    // DnD
		this.addPatternDragAndDropSupport(this.tableViewer);

	    // Selection Provider For EsxEditor
	    getEditorSite().setSelectionProvider(this.tableViewer);

		// listen for selection events
	    getSite().getPage().addSelectionListener((ISelectionListener) this);
	}
	
	private void setAllInputs() {
		this.editorPattern.setInput(selectedPatterns);
		this.editorPatternFx.setInput(selectedPatterns);
		this.editorPatternParts.setInput(selectedPatterns);
		this.editorPatternMotionSequences.setInput(selectedPatterns);
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxEditorPart#selectionChanged(org.eclipse.ui.IWorkbenchPart, org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if (parentEditor.getActivePage()==EsxEditorPartPatterns.PAGE_INDEX &&
				selection instanceof IStructuredSelection) {
			Object[] objects = ((IStructuredSelection) selection).toArray();
			selectedPatterns = new ArrayList<Pattern>();
			for (Object obj : objects) {
				if(obj instanceof Pattern) {
					selectedPatterns.add((Pattern) obj);
				}
			}
			setAllInputs();
		}
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
		this.editorPattern.refresh();
		this.editorPatternFx.refresh();
		this.editorPatternParts.refresh();
		this.editorPatternMotionSequences.refresh();
	}

	/**
	 * @param viewer
	 */
	private void addPatternDragAndDropSupport(StructuredViewer viewer) {
		int dndOperations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;
		Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance() };
		viewer.addDragSupport(dndOperations, transfers, new ViewerDragAdapter(viewer));
		viewer.addDropSupport(dndOperations, transfers, new EditingDomainViewerDropAdapter(getEditingDomain(), viewer));
	}
	
	
}

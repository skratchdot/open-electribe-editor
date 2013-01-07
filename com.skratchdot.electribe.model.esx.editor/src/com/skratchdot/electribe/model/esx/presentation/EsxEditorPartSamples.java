/*******************************************************************************
 * Copyright (c) 2009-2013 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 *******************************************************************************/
package com.skratchdot.electribe.model.esx.presentation;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
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
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.IHandlerService;

import com.skratchdot.electribe.audioplayer.handlers.LoopAndPlayHandler;
import com.skratchdot.electribe.model.esx.EsxFile;
import com.skratchdot.electribe.model.esx.Sample;
import com.skratchdot.electribe.model.esx.preferences.EsxPreferenceNames;
import com.skratchdot.electribe.model.esx.preferences.EsxPreferenceStore;

public class EsxEditorPartSamples extends EsxEditorPart {
	public static final String ID = "com.skratchdot.electribe.model.esx.presentation.EsxEditorPartSamples"; //$NON-NLS-1$
	public static final int PAGE_INDEX = 3;
	public static final String ID_SAMPLE_VIEWER = ID + ".SampleViewer"; //$NON-NLS-1$

	private Label labelMemFree;
	private TableViewer tableViewer;
	private TableScrollSpeedListener tableViewerScrollSpeedListener;

	private EsxCompositeSample editorSample;
	private EsxCompositeSampleInPatternInfo editorSampleInPatternInfo;

	private TabFolder tabFolder;
	private TabItem tabSample;
	private TabItem tabSampleInPatternInfo;

	private List<Sample> selectedSamples = new ArrayList<Sample>();

	private Combo comboSelection;
	private LinkedHashMap<String, String> selectionItems = new LinkedHashMap<String, String>();

	/**
	 * @param parent
	 */
	public EsxEditorPartSamples(EsxEditor parent) {
		super(parent);
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxEditorPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		// Create sashForm
		SashForm sashForm = new SashForm(parent, SWT.NONE);

		// Create groupSamples
		Group groupSamples = new Group(sashForm, SWT.NONE);
		groupSamples.setLayout(new GridLayout(1, true));
		groupSamples.setText("Samples");

		// Create top row
		this.initTopRow(groupSamples);

		// Create this.tableViewer
		this.tableViewer = new TableViewer(groupSamples, SWT.BORDER
				| SWT.FULL_SELECTION | SWT.MULTI);
		this.initTableViewer();

		// Create groupSelectedSamples
		Group groupSelectedSamples = new Group(sashForm, SWT.NONE);
		groupSelectedSamples.setLayout(new FillLayout(SWT.HORIZONTAL));
		groupSelectedSamples.setText("Selected Samples");

		tabFolder = new TabFolder(groupSelectedSamples, SWT.NONE);

		// Create editorSample
		tabSample = new TabItem(tabFolder, SWT.NONE);
		editorSample = new EsxCompositeSample(this, tabFolder, SWT.NONE);
		tabSample.setText("Sample Editor");
		tabSample.setControl(editorSample);

		// Create editorSampleInPatternInfo
		tabSampleInPatternInfo = new TabItem(tabFolder, SWT.NONE);
		editorSampleInPatternInfo = new EsxCompositeSampleInPatternInfo(this,
				tabFolder, SWT.NONE);
		tabSampleInPatternInfo.setText("Pattern/Part Usage");
		tabSampleInPatternInfo.setControl(editorSampleInPatternInfo);

		// Only display info for one tab at a time
		editorSample.isActive = true;
		tabFolder.addSelectionListener(new EsxTabSelectionListener() {

			@Override
			public void onTabChange() {
				setAllInputs();
			}

		});

		sashForm.setWeights(new int[] { 4, 3 });
	}

	private void initTopRow(Composite parent) {
		// Create the top row
		Composite compositeInfoRow = new Composite(parent, SWT.NONE);
		compositeInfoRow.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false,
				false, 1, 1));
		GridLayout gridLayout = new GridLayout(3, false);
		gridLayout.marginWidth = 0;
		gridLayout.verticalSpacing = 0;
		gridLayout.marginHeight = 0;
		compositeInfoRow.setLayout(gridLayout);

		// Selection Combo
		comboSelection = new Combo(compositeInfoRow, SWT.READ_ONLY);
		comboSelection.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false,
				false, 1, 1));

		// Selection Button
		Button btnSelection = new Button(compositeInfoRow, SWT.NONE);
		btnSelection.setText("Select");

		// Memory Free
		labelMemFree = new Label(compositeInfoRow, SWT.NONE);
		labelMemFree.setAlignment(SWT.RIGHT);
		labelMemFree.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));

		// Populate Selection Combo
		populateSelectionItems();
		comboSelection.setItems(selectionItems.keySet().toArray(new String[0]));
		comboSelection.select(0);

		// Selection Combo Listener
		comboSelection.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				selectItemsFromCurrentChoice();
			}
		});

		// Selection Button Listener
		btnSelection.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				selectItemsFromCurrentChoice();
			}
		});

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
		this.addColumnToTableViewer(this.tableViewer, "MemSize", null);
		this.addColumnToTableViewer(this.tableViewer, "SampleRate", null);
		this.addColumnToTableViewer(this.tableViewer, "SampleTune", null);
		this.addColumnToTableViewer(this.tableViewer, "StretchStep", null);
		this.addColumnToTableViewer(this.tableViewer, "IsLoop?", null);
		this.addColumnToTableViewer(this.tableViewer, "IsSlice?", null);
		this.addColumnToTableViewer(this.tableViewer, "PlayLevel", null);
		this.addColumnToTableViewer(this.tableViewer, "Start", null);
		this.addColumnToTableViewer(this.tableViewer, "LoopStart", null);
		this.addColumnToTableViewer(this.tableViewer, "End", 55);
		this.addColumnToTableViewer(this.tableViewer, "NumSampleFrames", null);

		// Allow all the columns to be moved
		TableColumn[] columns = table.getColumns();
		for (int i = 0; i < columns.length; i++) {
			columns[i].setMoveable(true);
		}

		// Setup this.tableViewer ContentProvider
		this.tableViewer.setContentProvider(new AdapterFactoryContentProvider(
				this.getAdapterFactory()) {

			@Override
			public Object[] getElements(Object object) {
				return ((EsxFile) object).getSamples().toArray();
			}

			@Override
			public void notifyChanged(Notification notification) {
				super.notifyChanged(new ViewerNotification(notification));
			}

		});

		// Label Provider		
		this.tableViewer.setLabelProvider(new TableViewerColorProvider(this
				.getAdapterFactory(), this.tableViewer, EsxPreferenceStore
				.getSamplesBackgroundColorWhenNotEmpty(), EsxPreferenceStore
				.getSamplesBackgroundColorWhenEmpty(), EsxPreferenceStore
				.getSamplesForegroundColorWhenNotEmpty(), EsxPreferenceStore
				.getSamplesForegroundColorWhenEmpty()));

		// Sync the scroll speed with our preference
		tableViewerScrollSpeedListener = this.syncScrollSpeedWithPreference(
				this.tableViewer, tableViewerScrollSpeedListener,
				EsxPreferenceStore.getSamplesScrollSpeed(),
				EsxPreferenceStore.getSamplesUseScrollSpeed());

		// Play/Loop Sample on DoubleClick
		this.tableViewer.getTable().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent event) {
				super.mouseDoubleClick(event);
				IHandlerService handlerService = (IHandlerService) getSite()
						.getService(IHandlerService.class);
				try {
					handlerService.executeCommand(
							LoopAndPlayHandler.PLAY_OR_LOOP_COMMAND_ID, null);
				} catch (Exception e) {
					e.printStackTrace();
					throw new RuntimeException(
							LoopAndPlayHandler.PLAY_OR_LOOP_COMMAND_ID
									+ " was not found");
				}
			}
		});

		// listen for preference change events
		PlatformUI.getPreferenceStore().addPropertyChangeListener(
				(IPropertyChangeListener) this);

		// Context Menu
		createContextMenuFor(this.tableViewer,
				EsxEditorPartSamples.ID_SAMPLE_VIEWER);

		// DnD
		//this.addEmfDragAndDropSupport(this.tableViewer);
		this.addSampleDragAndDropSupport(this.tableViewer);

		// Selection Provider For EsxEditor
		getEditorSite().setSelectionProvider(this.tableViewer);

		// listen for selection events
		getSite().getPage().addSelectionListener((ISelectionListener) this);
	}

	private void setAllInputs() {
		this.editorSample.setInput(selectedSamples);
		this.editorSampleInPatternInfo.setInput(selectedSamples);
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxEditorPart#selectionChanged(org.eclipse.ui.IWorkbenchPart, org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if (parentEditor.getActivePage() == EsxEditorPartSamples.PAGE_INDEX
				&& selection instanceof IStructuredSelection) {
			Object[] objects = ((IStructuredSelection) selection).toArray();
			selectedSamples = new ArrayList<Sample>();
			for (Object obj : objects) {
				if (obj instanceof Sample) {
					selectedSamples.add((Sample) obj);
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
		if (event.getProperty().equals(EsxPreferenceNames.SAMPLES_SCROLL_SPEED)
				|| event.getProperty().equals(
						EsxPreferenceNames.SAMPLES_USE_SCROLL_SPEED)) {
			tableViewerScrollSpeedListener = this
					.syncScrollSpeedWithPreference(this.tableViewer,
							tableViewerScrollSpeedListener,
							EsxPreferenceStore.getSamplesScrollSpeed(),
							EsxPreferenceStore.getSamplesUseScrollSpeed());
			this.tableViewer.refresh();
		}

		// Color Changes
		if (event.getProperty().equals(
				EsxPreferenceNames.SAMPLES_BACKGROUND_COLOR_WHEN_NOT_EMPTY)
				|| event.getProperty().equals(
						EsxPreferenceNames.SAMPLES_BACKGROUND_COLOR_WHEN_EMPTY)
				|| event.getProperty()
						.equals(EsxPreferenceNames.SAMPLES_FOREGROUND_COLOR_WHEN_NOT_EMPTY)
				|| event.getProperty().equals(
						EsxPreferenceNames.SAMPLES_FOREGROUND_COLOR_WHEN_EMPTY)) {
			((TableViewerColorProvider) this.tableViewer.getLabelProvider())
					.setAllColors(EsxPreferenceStore
							.getSamplesBackgroundColorWhenNotEmpty(),
							EsxPreferenceStore
									.getSamplesBackgroundColorWhenEmpty(),
							EsxPreferenceStore
									.getSamplesForegroundColorWhenNotEmpty(),
							EsxPreferenceStore
									.getSamplesForegroundColorWhenEmpty());
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
		getSite().getPage().removeSelectionListener((ISelectionListener) this);
		PlatformUI.getPreferenceStore().removePropertyChangeListener(
				(IPropertyChangeListener) this);
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
		if (input instanceof EsxFile) {
			this.tableViewer.setInput(input);
			this.refresh();
		}
	}

	/**
	 * 
	 */
	public void refresh() {
		if (this.parentEditor.getActivePage() != EsxEditorPartSamples.PAGE_INDEX)
			return;

		this.refreshLabels();
		this.tableViewer.refresh();
		this.editorSample.refresh();
	}

	private void refreshLabels() {
		if (this.tableViewer.getInput() instanceof EsxFile) {
			EsxFile esxFile = (EsxFile) this.tableViewer.getInput();
			this.labelMemFree.setText("Memory Free: "
					+ esxFile.getMemFreeInBytes() + " bytes ("
					+ esxFile.getMemFreeInSeconds() + " seconds)");
		}
	}

	/**
	 * @param viewer
	 */
	private void addSampleDragAndDropSupport(StructuredViewer viewer) {
		int dndOperations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;
		Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance() };
		viewer.addDragSupport(dndOperations, transfers, new ViewerDragAdapter(
				viewer));
		viewer.addDropSupport(dndOperations, transfers,
				new EditingDomainViewerDropAdapter(getEditingDomain(), viewer));
	}

	@Override
	public TableViewer getTableViewer() {
		return this.tableViewer;
	}

	/**
	 * Select items based on current combo box selection.
	 * Should be called on Combo change, and on button select.
	 */
	private void selectItemsFromCurrentChoice() {
		String selectedText = comboSelection.getItem(comboSelection
				.getSelectionIndex());
		String commandId = selectionItems.get(selectedText);
		if (commandId != null) {
			IHandlerService handlerService = (IHandlerService) getSite()
					.getService(IHandlerService.class);
			try {
				handlerService.executeCommand(commandId, null);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}

	/**
	 * TODO: should eventually populate this dynamically. This is a hack because I couldn't
	 * 			find good documentation on how to do it dynamically from plugin.xml
	 */
	private void populateSelectionItems() {
		selectionItems
				.put("None",
						"com.skratchdot.electribe.model.esx.editor.commands.selectionSamplesNone");
		selectionItems
				.put("All",
						"com.skratchdot.electribe.model.esx.editor.commands.selectionSamplesAll");
		selectionItems
				.put("All (Empty)",
						"com.skratchdot.electribe.model.esx.editor.commands.selectionSamplesAllEmpty");
		selectionItems
				.put("All (Non-Empty)",
						"com.skratchdot.electribe.model.esx.editor.commands.selectionSamplesAllNonEmpty");
		selectionItems
				.put("All (First)",
						"com.skratchdot.electribe.model.esx.editor.commands.selectionSamplesAllFirst");
		selectionItems
				.put("Mono",
						"com.skratchdot.electribe.model.esx.editor.commands.selectionSamplesMono");
		selectionItems
				.put("Mono (Empty)",
						"com.skratchdot.electribe.model.esx.editor.commands.selectionSamplesMonoEmpty");
		selectionItems
				.put("Mono (Non-Empty)",
						"com.skratchdot.electribe.model.esx.editor.commands.selectionSamplesMonoNonEmpty");
		selectionItems
				.put("Mono (First)",
						"com.skratchdot.electribe.model.esx.editor.commands.selectionSamplesMonoFirst");
		selectionItems
				.put("Stereo",
						"com.skratchdot.electribe.model.esx.editor.commands.selectionSamplesStereo");
		selectionItems
				.put("Stereo (Empty)",
						"com.skratchdot.electribe.model.esx.editor.commands.selectionSamplesStereoEmpty");
		selectionItems
				.put("Stereo (Non-Empty)",
						"com.skratchdot.electribe.model.esx.editor.commands.selectionSamplesStereoNonEmpty");
		selectionItems
				.put("Stereo (First)",
						"com.skratchdot.electribe.model.esx.editor.commands.selectionSamplesStereoFirst");
		selectionItems
				.put("Next (Empty)",
						"com.skratchdot.electribe.model.esx.editor.commands.selectionSamplesNextEmpty");
		selectionItems
				.put("Next (Non-Empty)",
						"com.skratchdot.electribe.model.esx.editor.commands.selectionSamplesNextNonEmpty");
		selectionItems
				.put("In Pattern",
						"com.skratchdot.electribe.model.esx.editor.commands.selectionSamplesInPattern");
		selectionItems
				.put("Not In Pattern",
						"com.skratchdot.electribe.model.esx.editor.commands.selectionSamplesNotInPattern");
		selectionItems
				.put("In Song",
						"com.skratchdot.electribe.model.esx.editor.commands.selectionSamplesInSong");
		selectionItems
				.put("Not In Song",
						"com.skratchdot.electribe.model.esx.editor.commands.selectionSamplesNotInSong");
	}
}

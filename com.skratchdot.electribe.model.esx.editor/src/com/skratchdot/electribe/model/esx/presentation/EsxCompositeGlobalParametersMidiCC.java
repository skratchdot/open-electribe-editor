package com.skratchdot.electribe.model.esx.presentation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;

import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.MidiControlChangeAssignment;

public class EsxCompositeGlobalParametersMidiCC extends EsxComposite {
	public static final String ID = "com.skratchdot.electribe.model.esx.presentation.EsxCompositeGlobalParametersMidiCC"; //$NON-NLS-1$

	private List<MidiControlChangeAssignment> midiControlChangeAssignments;
	private List<MidiControlChangeAssignment> selectedItems;
	private TableViewer tableViewer;
	
	private Text textMidiControlChangeAssignment;
	private Text inputMidiControlChangeAssignment;

	/**
	 * @param parent
	 * @param style
	 */
	public EsxCompositeGlobalParametersMidiCC(Composite parent, int style) {
		super(parent, style);
	}

	/**
	 * @param parentEditor
	 * @param parentComposite
	 * @param style
	 */
	public EsxCompositeGlobalParametersMidiCC(EsxEditorPart parentPart, Composite parentComposite, int style) {
		this(parentComposite, style);
		this.parentPart = parentPart;

		setLayout(new GridLayout(4, false));

		textMidiControlChangeAssignment = this.createGridData2ColumnTextLabel(this, "Midi CC Assignment");
		inputMidiControlChangeAssignment = this.createGridData2ColumnTextInput(this, "", new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setFeatureForSelectedItems(selectedItems, EsxPackage.Literals.MIDI_CONTROL_CHANGE_ASSIGNMENT__VALUE, Byte.parseByte(inputMidiControlChangeAssignment.getText()), false, -1);
			}
		});

		this.tableViewer = new TableViewer(this, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
		this.initTableViewer();
	}

	/**
	 * 
	 */
	private void initTableViewer() {
		// Create the table
		Table table = this.tableViewer.getTable();
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 4, 1));

		// Create our columns
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Name", 120);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Value", 50);

		// Setup this.tableViewer ContentProvider
		this.tableViewer.setContentProvider(new AdapterFactoryContentProvider(this.getAdapterFactory()) {
			@Override
			public Object[] getElements(Object object) {
				return midiControlChangeAssignments.toArray();
			}

			@Override
			public void notifyChanged(Notification notification) {
				super.notifyChanged(new ViewerNotification(notification));
			}			
		});

		this.tableViewer.setLabelProvider(new AdapterFactoryLabelProvider.ColorProvider(getAdapterFactory(), this.tableViewer));

		this.tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
		        IStructuredSelection selection = (IStructuredSelection) event.getSelection();

		        Object[] objects = ((IStructuredSelection) selection).toArray();
				selectedItems = new ArrayList<MidiControlChangeAssignment>();
				for (Object obj : objects) {
					if(obj instanceof MidiControlChangeAssignment) {
						selectedItems.add((MidiControlChangeAssignment) obj);
					}
				}
				refresh();
				refreshInputs();
			}
		});
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#setInput(java.lang.Object)
	 */
	@Override
	public void setInput(Object input) {
		this.midiControlChangeAssignments = new ArrayList<MidiControlChangeAssignment>();

		if(input instanceof List<?>) {
			Iterator<?> it = ((List<?>) input).iterator();
			while (it.hasNext()) {
				Object obj = it.next();
				if(obj instanceof MidiControlChangeAssignment) {
					this.midiControlChangeAssignments.add((MidiControlChangeAssignment) obj);
				}
			}
		}

		this.tableViewer.setInput(this.midiControlChangeAssignments);
		this.refreshInputs();
		this.refresh();
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#refresh()
	 */
	@Override
	public void refresh() {
		String multipleValueString = "<Multiple Values>";
		this.textMidiControlChangeAssignment.setText(StringUtils.trim(getMultiString(this.selectedItems, EsxPackage.Literals.MIDI_CONTROL_CHANGE_ASSIGNMENT__VALUE, multipleValueString)));
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#refresh()
	 */
	public void refreshInputs() {
		String multipleValueString = "";
		this.inputMidiControlChangeAssignment.setText(StringUtils.trim(getMultiString(this.selectedItems, EsxPackage.Literals.MIDI_CONTROL_CHANGE_ASSIGNMENT__VALUE, multipleValueString)));
	}

}

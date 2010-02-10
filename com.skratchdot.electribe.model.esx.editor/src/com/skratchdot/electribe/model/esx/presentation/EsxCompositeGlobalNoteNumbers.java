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
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;

import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.NoteNumber;
import com.skratchdot.electribe.model.esx.PartNoteNumber;
public class EsxCompositeGlobalNoteNumbers extends EsxComposite {
	public static final String ID = "com.skratchdot.electribe.model.esx.presentation.EsxCompositeGlobalParametersNoteNumbers"; //$NON-NLS-1$

	private List<PartNoteNumber> partNoteNumbers;
	private List<PartNoteNumber> selectedItems;
	private TableViewer tableViewer;
	
	private Text textPartNoteNumber;
	private Combo comboPartNoteNumber;

	/**
	 * @param parent
	 * @param style
	 */
	public EsxCompositeGlobalNoteNumbers(Composite parent, int style) {
		super(parent, style);
	}

	/**
	 * @param parentPart
	 * @param parentComposite
	 * @param style
	 */
	public EsxCompositeGlobalNoteNumbers(EsxEditorPart parentPart, Composite parentComposite, int style) {
		super(parentPart, parentComposite, style);
		this.parentPart = parentPart;

		setLayout(new GridLayout(4, false));

		textPartNoteNumber = this.createGridData2ColumnTextLabel(this, "Note Number");
		comboPartNoteNumber = this.createGridData2ColumnComboInput(this, "", this.getLiteralStrings(NoteNumber.values()) , new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setFeatureForSelectedItems(selectedItems, EsxPackage.Literals.PART_NOTE_NUMBER__NOTE_NUMBER, NoteNumber.get(comboPartNoteNumber.getSelectionIndex()), false, -1);
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
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Value", 120);

		// Setup this.tableViewer ContentProvider
		this.tableViewer.setContentProvider(new AdapterFactoryContentProvider(this.getAdapterFactory()) {
			@Override
			public Object[] getElements(Object object) {
				return partNoteNumbers.toArray();
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
				selectedItems = new ArrayList<PartNoteNumber>();
				for (Object obj : objects) {
					if(obj instanceof PartNoteNumber) {
						selectedItems.add((PartNoteNumber) obj);
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
		this.partNoteNumbers = new ArrayList<PartNoteNumber>();

		if(input instanceof List<?>) {
			Iterator<?> it = ((List<?>) input).iterator();
			while (it.hasNext()) {
				Object obj = it.next();
				if(obj instanceof PartNoteNumber) {
					this.partNoteNumbers.add((PartNoteNumber) obj);
				}
			}
		}

		this.tableViewer.setInput(this.partNoteNumbers);
		this.refreshInputs();
		this.refresh();
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#refresh()
	 */
	@Override
	public void refresh() {
		String multipleValueString = "<Multiple Values>";
		this.textPartNoteNumber.setText(StringUtils.trim(getMultiString(this.selectedItems, EsxPackage.Literals.PART_NOTE_NUMBER__NOTE_NUMBER, multipleValueString)));
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#refresh()
	 */
	public void refreshInputs() {
		String multipleValueString = "";
		this.comboPartNoteNumber.setText(StringUtils.trim(getMultiString(this.selectedItems, EsxPackage.Literals.PART_NOTE_NUMBER__NOTE_NUMBER, multipleValueString)));
	}

}

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
import com.skratchdot.electribe.model.esx.PatternNumber;
import com.skratchdot.electribe.model.esx.PatternSetParameter;
public class EsxCompositeGlobalParametersPatternSets extends EsxComposite {
	public static final String ID = "com.skratchdot.electribe.model.esx.presentation.EsxCompositeGlobalParametersPatternSets"; //$NON-NLS-1$

	private List<PatternSetParameter> patternSetParameters;
	private List<PatternSetParameter> selectedItems;
	private TableViewer tableViewer;
	
	private Text textPatternSetParameter;
	private Combo comboPatternSetParameter;

	/**
	 * @param parent
	 * @param style
	 */
	public EsxCompositeGlobalParametersPatternSets(Composite parent, int style) {
		super(parent, style);
	}

	/**
	 * @param parentEditor
	 * @param parentComposite
	 * @param style
	 */
	public EsxCompositeGlobalParametersPatternSets(EsxEditor parentEditor, Composite parentComposite, int style) {
		this(parentComposite, style);
		this.parentEditor = parentEditor;

		setLayout(new GridLayout(4, false));

		textPatternSetParameter = this.createGridData2ColumnTextLabel(this, "Pattern Number");
		comboPatternSetParameter = this.createGridData2ColumnComboInput(this, "", this.getLiteralStrings(PatternNumber.values()) , new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setFeatureForSelectedItems(selectedItems, EsxPackage.Literals.PATTERN_SET_PARAMETER__PATTERN_NUMBER, PatternNumber.get(comboPatternSetParameter.getSelectionIndex()), false, -1);
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
		this.parentEditor.addColumnToTableViewer(this.tableViewer, "Current Position", 120);
		this.parentEditor.addColumnToTableViewer(this.tableViewer, "Original Position", 120);
		this.parentEditor.addColumnToTableViewer(this.tableViewer, "Pattern Number", 120);

		// Setup this.tableViewer ContentProvider
		this.tableViewer.setContentProvider(new AdapterFactoryContentProvider(this.getAdapterFactory()) {
			@Override
			public Object[] getElements(Object object) {
				return patternSetParameters.toArray();
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
				selectedItems = new ArrayList<PatternSetParameter>();
				for (Object obj : objects) {
					if(obj instanceof PatternSetParameter) {
						selectedItems.add((PatternSetParameter) obj);
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
		this.patternSetParameters = new ArrayList<PatternSetParameter>();

		if(input instanceof List<?>) {
			Iterator<?> it = ((List<?>) input).iterator();
			while (it.hasNext()) {
				Object obj = it.next();
				if(obj instanceof PatternSetParameter) {
					this.patternSetParameters.add((PatternSetParameter) obj);
				}
			}
		}

		this.tableViewer.setInput(this.patternSetParameters);
		this.refreshInputs();
		this.refresh();
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#refresh()
	 */
	@Override
	public void refresh() {
		String multipleValueString = "<Multiple Values>";
		this.textPatternSetParameter.setText(StringUtils.trim(getMultiString(this.selectedItems, EsxPackage.Literals.PATTERN_SET_PARAMETER__PATTERN_NUMBER, multipleValueString)));
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#refresh()
	 */
	public void refreshInputs() {
		String multipleValueString = "";
		this.comboPatternSetParameter.setText(StringUtils.trim(getMultiString(this.selectedItems, EsxPackage.Literals.PATTERN_SET_PARAMETER__PATTERN_NUMBER, multipleValueString)));
	}

}

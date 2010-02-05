package com.skratchdot.electribe.model.esx.presentation;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public abstract class EsxComposite extends Composite implements IEditingDomainProvider {
	public static final String ID = "com.skratchdot.electribe.model.esx.presentation.EsxComposite"; //$NON-NLS-1$

	protected EsxEditor parentEditor;

	public EsxComposite(Composite parent, int style) {
		super(parent, style);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param parentEditor
	 * @param parentComposite
	 * @param style
	 */
	public EsxComposite(EsxEditor parentEditor, Composite parentComposite, int style) {
		super(parentComposite, style);
		this.parentEditor = parentEditor;
	}

	/**
	 * Sets the input to this component.  This method simply updates the internal
	 * member variables of the component.
	 * 
	 * @param input
	 */
	public abstract void setInput(Object input);

	/**
	 * Refreshes this component with information freshly obtained from the component's model.
	 * This method is called by the main editor whenever a command on the command stack
	 * has been called.  It is up to the subclasses to determine what needs to be refreshed.
	 */
	public abstract void refresh();

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.domain.IEditingDomainProvider#getEditingDomain()
	 */
	@Override
	public EditingDomain getEditingDomain() {
		return parentEditor.getEditingDomain();
	}

	/**
	 * @return
	 */
	protected BasicCommandStack getCommandStack() {
		return ((BasicCommandStack)getEditingDomain().getCommandStack());
	}

	/**
	 * This takes a list of EObjects and compares the given feature's toString() values.
	 * If the list is empty, an empty string is returned.  If the list only contains one 
	 * item, or if all the feature's toString() valus match, then the toString() value is
	 * returned.  If there are differing values for toString(), then the param "multiText"
	 * is returned. 
	 * @param list
	 * @param feature
	 * @param multiText
	 * @return
	 */
	protected String getMultiString(List<?> list, EStructuralFeature feature, String multiText) {
		if(list==null || list.size()<1) {
			return "";
		}
		String returnValue = ((EObject) list.get(0)).eGet(feature).toString();
		for(int i=1; i<list.size(); i++) {
			if(!returnValue.equals(((EObject) list.get(i)).eGet(feature).toString())) {
				return multiText;
			}
		}
		return returnValue;
	}

	/**
	 * @param string
	 * @param currentIndex
	 * @param listSize
	 * @param maxAppendStringLength
	 * @return
	 */
	protected String getMultiNumberString(final String string, final int currentIndex, final int listSize, final int maxAppendStringLength) {
		if(listSize<=1) {
			return string;
		}
		else {
			int listSizeStringLength = StringUtils.length(Integer.toString(listSize));
			return StringUtils.left(
				string,
				maxAppendStringLength-listSizeStringLength
			) + StringUtils.leftPad(Integer.toString(currentIndex+1), listSizeStringLength, "0");
		}
	}

	/**
	 * @param list
	 * @param feature
	 * @param value
	 * @param appendNumber
	 * @param maxAppendStringLength
	 */
	protected void setFeatureForSelectedItems(List<?> list, EStructuralFeature feature, Object value, boolean appendNumber, int maxAppendStringLength) {
		CompoundCommand cmd = new CompoundCommand();
		
		for(int i=0; i<list.size(); i++) {
			cmd.append(SetCommand.create(
				this.getEditingDomain(),
				(EObject) list.get(i),
				feature,
				(appendNumber==false?value:getMultiNumberString(value.toString(), i, list.size(), maxAppendStringLength))
			));
		}
		
		if(cmd.canExecute()) {
			this.getCommandStack().execute(cmd);
		}
	}

	/**
	 * @param parent
	 */
	protected void createGridData2ColumnSpacer (final Composite parent) {
		Label label = new Label(parent, SWT.NONE);
		label.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 2, 1));
	}

	/**
	 * @param parent
	 * @param title
	 * @return
	 */
	protected Text createGridData2ColumnTextLabel(Composite parent, String title) {
		Label label = new Label(parent, SWT.NONE);
		label.setAlignment(SWT.RIGHT);
		label.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label.setText(title + ":");

		Text text = new Text(parent, SWT.BORDER);
		text.setEditable(false);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		return text;
	}

	/**
	 * @param parent
	 * @param title
	 * @param selectionAdapter
	 * @return
	 */
	protected Text createGridData2ColumnTextInput(Composite parent, String title, SelectionAdapter selectionAdapter) {
		Text text = new Text(parent, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Button button = new Button(parent, SWT.NONE);
		button.addSelectionListener(selectionAdapter);
		button.setText("Set " + title);
		return text;
	}

	/**
	 * @param parent
	 * @param title
	 * @param comboItems
	 * @param selectionAdapter
	 * @return
	 */
	protected Combo createGridData2ColumnComboInput(Composite parent, String title, String[] comboItems, SelectionAdapter selectionAdapter) {
		Combo combo = new Combo(parent, SWT.READ_ONLY);
		combo.setItems(comboItems);
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Button button = new Button(parent, SWT.NONE);
		button.addSelectionListener(selectionAdapter);
		button.setText("Set " + title);
		return combo;
	}

	/**
	 * @param parent
	 * @param title
	 * @param setSelection
	 * @return
	 */
	protected Button createGridData4ColumnCheckButton(Composite parent, String title, boolean setSelection) {
		Button check = new Button(parent, SWT.CHECK);
		check.setSelection(setSelection);
		check.setText(title);
		check.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 4, 1));
		return check;
	}

	protected String[] getLiteralStrings(Enumerator[] enumArray) {
		String[] literals = new String[enumArray.length];
		for(int i=0; i<enumArray.length; i++) {
			literals[i] = enumArray[i].getLiteral();
		}
		return literals;
	}

}

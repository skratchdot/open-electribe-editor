package com.skratchdot.electribe.model.esx.presentation;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
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

	protected EsxEditorPart parentPart;

	/**
	 * @param parent
	 * @param style
	 */
	public EsxComposite(Composite parent, int style) {
		super(parent, style);
	}

	/**
	 * @param parentPart
	 * @param parentComposite
	 * @param style
	 */
	public EsxComposite(EsxEditorPart parentPart, Composite parentComposite, int style) {
		super(parentComposite, style);
		this.parentPart = parentPart;
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

	/**
	 * This method is similar to the refresh() method, but it should typically
	 * only be called with setInput() is called. It's goal is to refresh any
	 * "form inputs".
	 */
	public abstract void refreshInputs();

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.domain.IEditingDomainProvider#getEditingDomain()
	 */
	@Override
	public EditingDomain getEditingDomain() {
		return parentPart.getEditingDomain();
	}

	/**
	 * @return
	 */
	protected BasicCommandStack getCommandStack() {
		return ((BasicCommandStack)getEditingDomain().getCommandStack());
	}

	/**
	 * @return
	 */
	protected AdapterFactory getAdapterFactory() {
		return parentPart.getAdapterFactory();
	}

	/**
	 * This takes a list of EObjects and compares the given feature's toString() values.
	 * If the list is empty, an empty string is returned.  If the list only contains one 
	 * item, or if all the feature's toString() valus match, then the toString() value is
	 * returned.  If there are differing values for toString(), then the param "multiText"
	 * is returned. 
	 * @param list A list of EObjects
	 * @param feature The feature to compare
	 * @param multiText The String to return if the given features toString() values don't match
	 * @return
	 */
	protected String getMultiString(List<?> list, EStructuralFeature feature, String multiText) {
		// Return immediately because an invalid list was passed in
		if(list==null || list.size()<1) {
			return "";
		}

		// Store the firstString (which we will compare all other strings to
		Object firstObject = ((EObject) list.get(0)).eGet(feature);
		String firstString = (firstObject==null?"":firstObject.toString());

		// Compare firstString to all other strings
		Object currentObject = null;
		String currentString = "";
		for(int i=1; i<list.size(); i++) {
			currentObject = ((EObject) list.get(i)).eGet(feature);
			currentString = (currentObject==null?"":currentObject.toString());
			if(!firstString.equals(currentString)) {
				return multiText;
			}
		}
		
		// If we made it this far, all strings are the same
		return firstString;
	}

	/**
	 * This function is intended to be called from within a loop, passing
	 * a different currentIndex each time.  It will return the given string
	 * with a number appended to the end of it.
	 * @param string The string to append a number to
	 * @param currentIndex The current index (the number appended will be currentIndex+1)
	 * @param listSize The total size of the list you are appending numbers to
	 * @param maxAppendStringLength The maximum length of the string that is returned
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
	 * @param list A list of EObjects
	 * @param feature The feature to compare
	 * @param value The value to compare
	 * @return Returns the count of features in the given list that are equal to the given value
	 */
	protected int getCountInListWithValue(List<? extends EObject> list, EStructuralFeature feature, Object value) {
		int returnValue = 0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).eGet(feature).equals(value)) {
				returnValue++;
			}
		}
		return returnValue;
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

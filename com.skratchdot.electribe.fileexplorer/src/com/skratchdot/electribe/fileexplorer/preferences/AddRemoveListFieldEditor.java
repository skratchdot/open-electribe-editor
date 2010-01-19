/**
 * Copyright (c) 2009-2010 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    JEFF |:at:| SKRATCHDOT |:dot:| COM
 *
 * With help from:
 *    http://www.eclipse.org/articles/Article-Field-Editors/field_editors.html
 * 
 * $Id$
 */
package com.skratchdot.electribe.fileexplorer.preferences;

import java.util.*;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;

/**
 * A field editor for displaying and storing a list of strings. 
 * Buttons are provided for adding items to the list and removing 
 * items from the list.
 */
public class AddRemoveListFieldEditor extends FieldEditor {
	private static final String DEFAULT_ADD_LABEL = "Add";
	private static final String DEFAULT_REMOVE_LABEL = "Remove selection";
	private static final String DEFAULT_SEPERATOR = ";";

	private static final int VERTICAL_DIALOG_UNITS_PER_CHAR = 8;
	private static final int LIST_HEIGHT_IN_CHARS = 10;
	private static final int LIST_HEIGHT_IN_DLUS = 
		LIST_HEIGHT_IN_CHARS * VERTICAL_DIALOG_UNITS_PER_CHAR;

	// The top-level control for the field editor.
	private Composite top;
	// The list of tags.
	private List list;
	// The text field for inputting new tags.
	private Text textField;
	// The button for adding the contents of
	// the text field to the list.
	private Button add;
	// The button for removing the currently-selected list item.
	private Button remove;
	// The string used to seperate list items 
	// in a single String representation.
	private String seperator = DEFAULT_SEPERATOR;
	
	public AddRemoveListFieldEditor(
		String name,
		String labelText,
		Composite parent) {
			super(name, labelText, parent);		
	}
	
	public AddRemoveListFieldEditor(
		String name,
		String labelText,
		String addButtonText,
		String removeButtonText,
		Composite parent) {
			super(name, labelText, parent);
			setAddButtonText(addButtonText);
			setRemoveButtonText(removeButtonText);		
	}
	
	/**
	 * @see org.eclipse.jface.preference.FieldEditor#adjustForNumColumns(int)
	 */
	protected void adjustForNumColumns(int numColumns) {
		((GridData)top.getLayoutData()).horizontalSpan = numColumns;
	}

	/**
	 * @see org.eclipse.jface.preference.FieldEditor#doFillIntoGrid
	 * (Composite, int)
	 */
	protected void doFillIntoGrid(Composite parent, int numColumns) {
		top = parent;
	
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = numColumns;
		top.setLayoutData(gd);
	
		Label label = getLabelControl(top);
		GridData labelData = new GridData();
		labelData.horizontalSpan = numColumns;
		label.setLayoutData(labelData);
	
		list = new List(top, SWT.BORDER);
	
		// Create a grid data that takes up the extra 
		// space in the dialog and spans both columns.
		GridData listData = new GridData(GridData.FILL_HORIZONTAL);
		listData.heightHint = 
			convertVerticalDLUsToPixels(list, LIST_HEIGHT_IN_DLUS);
		listData.horizontalSpan = numColumns;
		
		list.setLayoutData(listData);
		list.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				selectionChanged();
			}
		});
		
		// Create a composite for the add and remove 
		// buttons and the input text field.
		Composite addRemoveGroup = new Composite(top, SWT.NONE);
	
		GridData addRemoveData = new GridData(GridData.FILL_HORIZONTAL);
		addRemoveData.horizontalSpan = numColumns;
		addRemoveGroup.setLayoutData(addRemoveData);
	
		GridLayout addRemoveLayout = new GridLayout();
		addRemoveLayout.numColumns = numColumns;
		addRemoveLayout.marginHeight = 0;
		addRemoveLayout.marginWidth = 0;
		addRemoveGroup.setLayout(addRemoveLayout);
		
		// Create a composite for the add and remove buttons.
		Composite buttonGroup = new Composite(addRemoveGroup, SWT.NONE);
		buttonGroup.setLayoutData(new GridData());
	
		GridLayout buttonLayout = new GridLayout();
		buttonLayout.marginHeight = 0;
		buttonLayout.marginWidth = 0;
		buttonGroup.setLayout(buttonLayout);
	
		// Create the add button.
		add = new Button(buttonGroup, SWT.NONE);
		add.setText(DEFAULT_ADD_LABEL);
		add.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {	
				add();
			}	
		});		
		GridData addData = new GridData(GridData.FILL_HORIZONTAL);
		addData.widthHint = convertHorizontalDLUsToPixels(
			add,
			IDialogConstants.BUTTON_WIDTH);	
		add.setLayoutData(addData);	
		
		// Create the remove button.
		remove = new Button(buttonGroup, SWT.NONE);
		remove.setEnabled(false);
		remove.setText(DEFAULT_REMOVE_LABEL);
		remove.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {	
				list.remove(list.getSelectionIndex());
				selectionChanged();
			}
		});
		GridData removeData = new GridData(GridData.FILL_HORIZONTAL);
		removeData.widthHint = convertHorizontalDLUsToPixels(
			remove,
			IDialogConstants.BUTTON_WIDTH);
		remove.setLayoutData(removeData);	
				
		// Create the text field.
		textField = new Text(addRemoveGroup, SWT.BORDER);
		
		GridData textData = new GridData(GridData.FILL_HORIZONTAL);
		textData.horizontalSpan = numColumns - 1;	
		textData.verticalAlignment = GridData.BEGINNING;
		textField.setLayoutData(textData);	
	}

	/**
	 * @see org.eclipse.jface.preference.FieldEditor#doLoad()
	 */
	protected void doLoad() {
		String items = getPreferenceStore().getString(getPreferenceName());
		setList(items);
	}
	
	/**
	 * @see org.eclipse.jface.preference.FieldEditor#doLoadDefault()
	 */
	protected void doLoadDefault() {
		String items = getPreferenceStore().getDefaultString(getPreferenceName());
		setList(items);
	}
	
	// Parses the string into seperate list items and adds them to the list.
	private void setList(String items) {
		String[] itemArray = parseString(items);
		list.setItems(itemArray);
	}
	
	/**
	 * @see org.eclipse.jface.preference.FieldEditor#doStore()
	 */
	protected void doStore() {
		String s = createListString(list.getItems());
		if (s != null)
			getPreferenceStore().setValue(getPreferenceName(), s);
	}

	/**
	 * @see org.eclipse.jface.preference.FieldEditor#getNumberOfControls()
	 */
	public int getNumberOfControls() {
		// The button composite and the text field.
		return 2;
	}

	// Adds the string in the text field to the list.
	private void add() {
		String tag = textField.getText();
		if (tag != null && tag.length() > 0)
			list.add(tag);
		textField.setText("");
	}

	/**
	 *  Sets the label for the button that adds
	 * the contents of the text field to the list.
	 */
	public void setAddButtonText(String text) {
		add.setText(text);
	}
	
	/**
	 *  Sets the label for the button that removes
	 * the selected item from the list.
	 */
	public void setRemoveButtonText(String text) {
		remove.setText(text);
	}
	 
	/**
	 * Sets the string that seperates items in the list when the
	 * list is stored as a single String in the preference store.
	 */
	public void setSeperator(String seperator) {
		this.seperator = seperator;	
	}
	
	/**
	 *  Creates the single String representation of the list
	 * that is stored in the preference store.
	 */
	private String createListString(String[] items) {
		StringBuffer path = new StringBuffer("");//$NON-NLS-1$
	
		for (int i = 0; i < items.length; i++) {
			path.append(items[i]);
			path.append(seperator);
		}
		return path.toString();
	}
	
	/**
	 *  Parses the single String representation of the list
	 * into an array of list items.
	 */
	private String[] parseString(String stringList) {
		StringTokenizer tokenizer =
			new StringTokenizer(stringList, seperator);
		int tokenCount = tokenizer.countTokens();
		String[] elements = new String[tokenCount];
		for (int i = 0; i < tokenCount; i++) {
			elements[i] = tokenizer.nextToken();
		}

		return elements;


	}
	
	// Sets the enablement of the remove button depending
	// on the selection in the list.
	private void selectionChanged() {
		int index = list.getSelectionIndex();
		remove.setEnabled(index >= 0);		
	}
}

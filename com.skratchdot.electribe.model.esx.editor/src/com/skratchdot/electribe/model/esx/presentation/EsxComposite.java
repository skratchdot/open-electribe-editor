package com.skratchdot.electribe.model.esx.presentation;

import java.lang.reflect.Field;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
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
		if(list.size()<1) {
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
	 * @param obj
	 * @param inputFieldName
	 * @param appendFieldName
	 * @param currentIndex
	 * @param listSize
	 * @param maxAppendStringLength
	 * @return
	 */
	protected String getMultiNumberString(Object obj, String inputFieldName, String appendFieldName, int currentIndex, int listSize, int maxAppendStringLength) {
		try {
			Field inputField = obj.getClass().getDeclaredField(inputFieldName);
			Text text = (Text) inputField.get(obj);
			String string = StringUtils.trim(text.getText());

			// Don't append if a null was passed in, or the list only has one item
			if(appendFieldName==null || listSize<=1) {
				return string;
			}
			else {
				Field appendField = obj.getClass().getDeclaredField(appendFieldName);
				Button append = (Button) appendField.get(obj);
				currentIndex = currentIndex<listSize?currentIndex+1:listSize+1;

				// If the append button is not checked
				if(!append.getSelection()) {
					return string;
				}
				// The append button is checked so append a number to the end of the string
				else {
					int listSizeStringLength = StringUtils.length(Integer.toString(listSize));
					return StringUtils.left(
						string,
						maxAppendStringLength-listSizeStringLength
					) + StringUtils.leftPad(Integer.toString(currentIndex), listSizeStringLength, "0");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	protected void setFeatureForSelectedItems(Object obj, EStructuralFeature feature, String listFieldName, String inputFieldName, String appendFieldName, int maxAppendStringLength) {
		try {
			Field listField = obj.getClass().getDeclaredField(listFieldName);
			List<?> list = (List<?>) listField.get(obj);

			CompoundCommand cmd = new CompoundCommand();

			for(int i=0; i<list.size(); i++) {
				cmd.append(SetCommand.create(
					this.getEditingDomain(),
					(EObject) list.get(i),
					feature,
					getMultiNumberString(obj, inputFieldName, appendFieldName, i, list.size(), maxAppendStringLength)
				));
			}
			
			if(cmd.canExecute()) {
				this.getCommandStack().execute(cmd);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void createGridData2ColumnSpacer (final Composite parent) {
		Label label = new Label(parent, SWT.NONE);
		label.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 2, 1));
	}

	protected void createGridData2ColumnText (final Object obj, final Composite parent, final String title, final String textFieldName) {
		Field textField;
		Label label;
		Text text;

		try {
			label = new Label(parent, SWT.NONE);
			label.setAlignment(SWT.RIGHT);
			label.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
			label.setText(title + ":");

			textField = this.getClass().getDeclaredField(textFieldName);
			text = new Text(parent, SWT.BORDER);
			text.setEditable(false);
			text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
			textField.set(obj, text);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * 
	 * @param obj This is the instance of the sub-class (ie. EsxCompositeSample, etc).
	 * @param parent The parent composite in which the GridData will be inserted
	 * @param title The title for the label, and the SET button. Usually refers to the field name that we'll be editing
	 * @param textFieldName This is a string representation of the text field. Must be declared as protected, and must exist.
	 * @param inputFieldName This is a string representation of the input field. Must be declared as protected, and must exist.
	 * @param appendFieldName 
	 * @param maxAppendStringLength 
	 * @param listFieldName This is a string representation of the list field. Must be declared as protected, and must exist.
	 * @param feature This is the feature that will be set when the SET button is clicked.
	 */
	protected void createGridData4ColumnTextInput(final Object obj, final Composite parent, final String title, final String textFieldName, final String inputFieldName, final String appendFieldName, final int maxAppendStringLength, final String listFieldName, final EStructuralFeature feature) {
		Field textField;
		Field inputField;
		Field appendField;

		Label label;
		Text text;
		Text input;
		Button button;
		Button append;

		try {
			label = new Label(parent, SWT.NONE);
			label.setAlignment(SWT.RIGHT);
			label.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
			label.setText(title + ":");

			textField = this.getClass().getDeclaredField(textFieldName);
			text = new Text(parent, SWT.BORDER);
			text.setEditable(false);
			text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
			textField.set(obj, text);

			inputField = this.getClass().getDeclaredField(inputFieldName);
			input = new Text(parent, SWT.BORDER);
			input.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
			inputField.set(obj, input);

			button = new Button(parent, SWT.NONE);
			button.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					setFeatureForSelectedItems(obj, feature, listFieldName, inputFieldName, appendFieldName, maxAppendStringLength);
				}
			});
			button.setText("Set " + title);
			
			if(appendFieldName!=null) {
				// Row 2
				appendField = this.getClass().getDeclaredField(appendFieldName);
				append = new Button(parent, SWT.CHECK);
				append.setSelection(true);
				append.setText("Append # when multiple items are selected");
				append.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 4, 1));
				appendField.set(obj, append);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

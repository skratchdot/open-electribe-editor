package com.skratchdot.electribe.model.esx.presentation;

import java.lang.reflect.Field;
import java.util.List;

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

	protected void setFeatureForSelectedItems(Object obj, EStructuralFeature feature, String listFieldName, String inputFieldName) {
		try {
			Field listField = obj.getClass().getDeclaredField(listFieldName);
			Field inputField = obj.getClass().getDeclaredField(inputFieldName);

			List<?> list = (List<?>) listField.get(obj);
			Text text = (Text) inputField.get(obj);
			String string = text.getText();

			CompoundCommand cmd = new CompoundCommand();

			for(int i=0; i<list.size(); i++) {
				cmd.append(SetCommand.create(
					this.getEditingDomain(),
					(EObject) list.get(i),
					feature,
					string
				));
			}
			
			if(cmd.canExecute()) {
				this.getCommandStack().execute(cmd);
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This creates a 4 column GridData row on the given parent Composite.
	 * There are 2 valid ways to use this method:
	 * (1)	Pass in null for: inputFieldName (and optionally: listFieldName, feature, method)
	 * 		When this is done, only the label and text field will be created.
	 * 		In this scenario, the user can't edit selections, and gets to see the READ-ONLY data.
	 * 
	 * (2)	Pass all fields as non-null.
	 * 
	 * @param obj This is the instance of the sub-class (ie. EsxCompositeSample, etc).
	 * @param parent The parent composite in which the GridData will be inserted
	 * @param title The title for the label, and the SET button. Usually refers to the field name that we'll be editing
	 * @param textFieldName This is a string representation of the text field. Must be declared as protected, and must exist.
	 * @param inputFieldName This is a string representation of the input field. Must be declared as protected, and must exist.
	 * @param listFieldName This is a string representation of the list field. Must be declared as protected, and must exist.
	 * @param feature This is the feature that will be set when the SET button is clicked.
	 */
	protected void createTextEditRow4Columns(final Object obj, final Composite parent, final String title, final String textFieldName, final String inputFieldName, final String listFieldName, final EStructuralFeature feature) {
		Field textField;
		Field inputField;

		Label label;
		Text text;
		Text input;
		Button button;

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

			if(inputFieldName==null) {
				new Label(parent, SWT.NONE);
				new Label(parent, SWT.NONE);
			}
			else {
				inputField = this.getClass().getDeclaredField(inputFieldName);
				input = new Text(parent, SWT.BORDER);
				input.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
				inputField.set(obj, input);
	
				button = new Button(parent, SWT.NONE);
				button.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						setFeatureForSelectedItems(obj, feature, listFieldName, inputFieldName);
					}
				});
				button.setText("Set " + title);
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

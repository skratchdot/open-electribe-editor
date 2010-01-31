package com.skratchdot.electribe.model.esx.presentation;

import java.util.List;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.swt.widgets.Composite;

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

}

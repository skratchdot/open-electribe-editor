package com.skratchdot.electribe.model.esx.presentation;

import org.eclipse.swt.widgets.Composite;

public class EsxCompositeSong extends EsxComposite {
	public static final String ID = "com.skratchdot.electribe.model.esx.presentation.EsxCompositeSong"; //$NON-NLS-1$

	/**
	 * @param parent
	 * @param style
	 */
	public EsxCompositeSong(Composite parent, int style) {
		super(parent, style);
	}

	/**
	 * @param parentPart
	 * @param parentComposite
	 * @param style
	 */
	public EsxCompositeSong(EsxEditorPart parentPart, Composite parentComposite, int style) {
		super(parentPart, parentComposite, style);
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#setInput(java.lang.Object)
	 */
	@Override
	public void setInput(Object input) {
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#refresh()
	 */
	@Override
	public void refresh() {
	}

}

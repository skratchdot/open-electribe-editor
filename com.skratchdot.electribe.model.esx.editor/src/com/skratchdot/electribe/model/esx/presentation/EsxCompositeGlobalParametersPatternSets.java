package com.skratchdot.electribe.model.esx.presentation;

import java.util.List;

import org.eclipse.swt.widgets.Composite;

import com.skratchdot.electribe.model.esx.PatternSetParameter;

public class EsxCompositeGlobalParametersPatternSets extends EsxComposite {
	public static final String ID = "com.skratchdot.electribe.model.esx.presentation.EsxCompositeGlobalParametersPatternSets"; //$NON-NLS-1$

	private List<PatternSetParameter> patternSetParameters;

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
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#refresh()
	 */
	@Override
	public void refresh() {
		// TODO Auto-generated method stub
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#setInput(java.lang.Object)
	 */
	@Override
	public void setInput(Object input) {
		// TODO Auto-generated method stub
	}

}

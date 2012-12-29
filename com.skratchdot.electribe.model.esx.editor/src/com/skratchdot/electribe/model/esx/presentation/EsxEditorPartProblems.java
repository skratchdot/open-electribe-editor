package com.skratchdot.electribe.model.esx.presentation;

import org.eclipse.emf.common.ui.editor.ProblemEditorPart;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Listener;

import com.skratchdot.electribe.model.esx.editor.util.EsxEditorUtil;

public class EsxEditorPartProblems extends ProblemEditorPart {
	protected EsxEditor parentEditor = null;

	public EsxEditorPartProblems(EsxEditor esxEditor) {
		parentEditor = esxEditor;
	}

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);

		// Change the "Open With Text Editor" button a "Close Problems Tab" button
		Control[] topControls = parent.getChildren();
		if (topControls.length >= 3 && topControls[2] instanceof Composite) {
			Composite buttonComposite = ((Composite) topControls[2]);
			Control[] buttonControls = buttonComposite.getChildren();
			if (buttonControls.length >= 1 && buttonControls[0] instanceof Button) {
				Button closeButton = ((Button) buttonControls[0]);
				Listener[] selectionListeners = closeButton.getListeners(SWT.Selection);
				for (Listener listener : selectionListeners) {
					closeButton.removeListener(SWT.Selection, listener);
				}
				closeButton.setText(EsxEditorUtil.getString("_UI_Page_Problems_Button_Close"));
				closeButton.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						if (parentEditor != null) {
							parentEditor.removePage(parentEditor.getActivePage());
						}
					}					
				});
			}
		}
	}

	@Override
	public Diagnostic getDiagnostic() {
		return super.getDiagnostic();
	}

	@Override
	protected String getMessage() {
		return super.getMessage();
	}

}

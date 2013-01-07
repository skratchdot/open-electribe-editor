package com.skratchdot.electribe.model.esx.editor.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import com.skratchdot.electribe.model.esx.presentation.EsxEditor;
import com.skratchdot.electribe.model.esx.presentation.EsxEditorPart;

public abstract class SelectionHandler extends AbstractHandler {
	protected TableViewer tableViewer;

	protected void setTableViewer(ExecutionEvent event, final int pageIndex) {
		try {
			IWorkbenchWindow window = HandlerUtil
					.getActiveWorkbenchWindowChecked(event);
			EsxEditor editor = (EsxEditor) window.getActivePage()
					.getActiveEditor();
			if (editor != null) {
				editor.setActivePage(pageIndex);
				editor.setFocus();
				EsxEditorPart part = editor.getEsxEditorPart(pageIndex);
				tableViewer = part.getTableViewer();
			}
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

	protected Object getFirstSelected() {
		Object obj = tableViewer.getElementAt(tableViewer.getTable()
				.getSelectionIndex());
		return obj;
	}

	protected void revealFirstSelected() {
		Object obj = getFirstSelected();
		if (obj != null) {
			tableViewer.reveal(obj);
		}
	}

}
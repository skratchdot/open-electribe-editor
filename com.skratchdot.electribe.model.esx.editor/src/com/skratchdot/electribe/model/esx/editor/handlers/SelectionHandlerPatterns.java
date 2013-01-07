package com.skratchdot.electribe.model.esx.editor.handlers;

import java.util.ArrayList;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.StructuredSelection;

import com.skratchdot.electribe.model.esx.Pattern;
import com.skratchdot.electribe.model.esx.presentation.EsxEditorPartPatterns;

public class SelectionHandlerPatterns extends SelectionHandler {
	public static final String NONE = "com.skratchdot.electribe.model.esx.editor.commands.selectionPatternsNone";
	public static final String ALL = "com.skratchdot.electribe.model.esx.editor.commands.selectionPatternsAll";
	public static final String ALL_EMPTY = "com.skratchdot.electribe.model.esx.editor.commands.selectionPatternsAllEmpty";
	public static final String ALL_NONEMPTY = "com.skratchdot.electribe.model.esx.editor.commands.selectionPatternsAllNonEmpty";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		setTableViewer(event, EsxEditorPartPatterns.PAGE_INDEX);
		if (tableViewer != null) {
			if (event.getCommand().getId().equals(NONE)) {
				tableViewer.setSelection(null);
			} else if (event.getCommand().getId().equals(ALL)) {
				select(true, true);
			} else if (event.getCommand().getId().equals(ALL_EMPTY)) {
				select(true, false);
			} else if (event.getCommand().getId().equals(ALL_NONEMPTY)) {
				select(false, true);
			}
			revealFirstSelected();
		}
		return null;
	}

	private void select(boolean isEmpty, boolean isNonEmpty) {
		ArrayList<Object> items = new ArrayList<Object>();
		for (int i = 0; i < tableViewer.getTable().getItemCount(); i++) {
			Pattern pattern = (Pattern) tableViewer.getElementAt(i);
			if (isEmpty && pattern.isEmpty()) {
				items.add(pattern);
			} else if (isNonEmpty && !pattern.isEmpty()) {
				items.add(pattern);
			}
		}
		tableViewer.setSelection(new StructuredSelection(items));
	}

}

package com.skratchdot.electribe.model.esx.editor.handlers;

import java.util.ArrayList;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.StructuredSelection;

import com.skratchdot.electribe.model.esx.Song;
import com.skratchdot.electribe.model.esx.presentation.EsxEditorPartSongs;

public class SelectionHandlerSongs extends SelectionHandler {
	public static final String NONE = "com.skratchdot.electribe.model.esx.editor.commands.selectionSongsNone";
	public static final String ALL = "com.skratchdot.electribe.model.esx.editor.commands.selectionSongsAll";
	public static final String ALL_EMPTY = "com.skratchdot.electribe.model.esx.editor.commands.selectionSongsAllEmpty";
	public static final String ALL_NONEMPTY = "com.skratchdot.electribe.model.esx.editor.commands.selectionSongsAllNonEmpty";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		setTableViewer(event, EsxEditorPartSongs.PAGE_INDEX);
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
			Song song = (Song) tableViewer.getElementAt(i);
			if (isEmpty && song.isEmpty()) {
				items.add(song);
			} else if (isNonEmpty && !song.isEmpty()) {
				items.add(song);
			}
		}
		tableViewer.setSelection(new StructuredSelection(items));
	}

}

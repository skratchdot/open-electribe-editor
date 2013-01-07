package com.skratchdot.electribe.model.esx.editor.handlers;

import java.util.ArrayList;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.StructuredSelection;

import com.skratchdot.electribe.model.esx.EsxFile;
import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.Sample;
import com.skratchdot.electribe.model.esx.presentation.EsxEditorPartSamples;
import com.skratchdot.electribe.model.esx.util.EsxUtil;

public class SelectionHandlerSamples extends SelectionHandler {
	public static final String NONE = "com.skratchdot.electribe.model.esx.editor.commands.selectionSamplesNone";
	public static final String ALL = "com.skratchdot.electribe.model.esx.editor.commands.selectionSamplesAll";
	public static final String ALL_EMPTY = "com.skratchdot.electribe.model.esx.editor.commands.selectionSamplesAllEmpty";
	public static final String ALL_NONEMPTY = "com.skratchdot.electribe.model.esx.editor.commands.selectionSamplesAllNonEmpty";
	public static final String ALL_FIRST = "com.skratchdot.electribe.model.esx.editor.commands.selectionSamplesAllFirst";
	public static final String MONO = "com.skratchdot.electribe.model.esx.editor.commands.selectionSamplesMono";
	public static final String MONO_EMPTY = "com.skratchdot.electribe.model.esx.editor.commands.selectionSamplesMonoEmpty";
	public static final String MONO_NONEMPTY = "com.skratchdot.electribe.model.esx.editor.commands.selectionSamplesMonoNonEmpty";
	public static final String MONO_FIRST = "com.skratchdot.electribe.model.esx.editor.commands.selectionSamplesMonoFirst";
	public static final String STEREO = "com.skratchdot.electribe.model.esx.editor.commands.selectionSamplesStereo";
	public static final String STEREO_EMPTY = "com.skratchdot.electribe.model.esx.editor.commands.selectionSamplesStereoEmpty";
	public static final String STEREO_NONEMPTY = "com.skratchdot.electribe.model.esx.editor.commands.selectionSamplesStereoNonEmpty";
	public static final String STEREO_FIRST = "com.skratchdot.electribe.model.esx.editor.commands.selectionSamplesStereoFirst";
	public static final String NEXT_EMPTY = "com.skratchdot.electribe.model.esx.editor.commands.selectionSamplesNextEmpty";
	public static final String NEXT_NONEMPTY = "com.skratchdot.electribe.model.esx.editor.commands.selectionSamplesNextNonEmpty";
	public static final String IN_PATTERN = "com.skratchdot.electribe.model.esx.editor.commands.selectionSamplesInPattern";
	public static final String NOT_IN_PATTERN = "com.skratchdot.electribe.model.esx.editor.commands.selectionSamplesNotInPattern";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		setTableViewer(event, EsxEditorPartSamples.PAGE_INDEX);
		if (tableViewer != null) {
			if (event.getCommand().getId().equals(NONE)) {
				tableViewer.setSelection(null);
			} else if (event.getCommand().getId().equals(ALL)) {
				select(true, true, true, true);
			} else if (event.getCommand().getId().equals(ALL_EMPTY)) {
				select(true, true, true, false);
			} else if (event.getCommand().getId().equals(ALL_NONEMPTY)) {
				select(true, true, false, true);
			} else if (event.getCommand().getId().equals(ALL_FIRST)) {
				selectFirst(false);
			} else if (event.getCommand().getId().equals(MONO)) {
				select(true, false, true, true);
			} else if (event.getCommand().getId().equals(MONO_EMPTY)) {
				select(true, false, true, false);
			} else if (event.getCommand().getId().equals(MONO_NONEMPTY)) {
				select(true, false, false, true);
			} else if (event.getCommand().getId().equals(MONO_FIRST)) {
				selectFirst(false);
			} else if (event.getCommand().getId().equals(STEREO)) {
				select(false, true, true, true);
			} else if (event.getCommand().getId().equals(STEREO_EMPTY)) {
				select(false, true, true, false);
			} else if (event.getCommand().getId().equals(STEREO_NONEMPTY)) {
				select(false, true, false, true);
			} else if (event.getCommand().getId().equals(STEREO_FIRST)) {
				selectFirst(true);
			} else if (event.getCommand().getId().equals(NEXT_EMPTY)) {
				selectNext(true);
			} else if (event.getCommand().getId().equals(NEXT_NONEMPTY)) {
				selectNext(false);
			} else if (event.getCommand().getId().equals(IN_PATTERN)) {
				selectPatternUsage(true);
			} else if (event.getCommand().getId().equals(NOT_IN_PATTERN)) {
				selectPatternUsage(false);
			}
			revealFirstSelected();
		}
		return null;
	}

	private void select(boolean isMono, boolean isStereo, boolean isEmpty,
			boolean isNonEmpty) {
		ArrayList<Object> items = new ArrayList<Object>();
		for (int i = 0; i < tableViewer.getTable().getItemCount(); i++) {
			Sample sample = (Sample) tableViewer.getElementAt(i);
			if (isMono && isEmpty && !sample.isStereoCurrent()
					&& sample.isEmpty()) {
				items.add(sample);
			} else if (isMono && isNonEmpty && !sample.isStereoCurrent()
					&& !sample.isEmpty()) {
				items.add(sample);
			} else if (isStereo && isEmpty && sample.isStereoCurrent()
					&& sample.isEmpty()) {
				items.add(sample);
			} else if (isStereo && isNonEmpty && sample.isStereoCurrent()
					&& !sample.isEmpty()) {
				items.add(sample);
			}
		}
		tableViewer.setSelection(new StructuredSelection(items));
	}

	private void selectFirst(boolean isStereo) {
		tableViewer.setSelection(new StructuredSelection(tableViewer
				.getElementAt(isStereo ? EsxUtil.NUM_SAMPLES_MONO : 0)));
	}

	private void selectNext(boolean isEmpty) {
		int currentIndex = tableViewer.getTable().getSelectionIndex();
		ArrayList<Integer> skipIndices = new ArrayList<Integer>(1);
		skipIndices.add(currentIndex);
		int nextIndex = EsxUtil.findFirstIndex(
				((EsxFile) tableViewer.getInput()).getSamples(),
				currentIndex >= 0 ? currentIndex : 0, skipIndices,
				EsxPackage.Literals.SAMPLE__EMPTY, isEmpty, true);
		tableViewer.setSelection(new StructuredSelection(tableViewer
				.getElementAt(nextIndex)));

	}

	private void selectPatternUsage(boolean isUsed) {
		ArrayList<Object> items = new ArrayList<Object>();
		for (int i = 0; i < tableViewer.getTable().getItemCount(); i++) {
			Sample sample = (Sample) tableViewer.getElementAt(i);
			if (isUsed && sample.getPatternCount() > 0) {
				items.add(sample);
			} else if (!isUsed && sample.getPatternCount() == 0) {
				items.add(sample);
			}
		}
		tableViewer.setSelection(new StructuredSelection(items));
	}

}

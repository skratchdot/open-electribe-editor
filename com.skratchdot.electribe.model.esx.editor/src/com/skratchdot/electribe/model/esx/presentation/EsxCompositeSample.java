package com.skratchdot.electribe.model.esx.presentation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.PlayLevel;
import com.skratchdot.electribe.model.esx.Sample;
import com.skratchdot.electribe.model.esx.StretchStep;

public class EsxCompositeSample extends EsxComposite {
	public static final String ID = "com.skratchdot.electribe.model.esx.presentation.EsxCompositeSample"; //$NON-NLS-1$

	private List<Sample> samples;

	private ScrolledComposite scrolledComposite;
	private Composite compositeMain;
	private Composite compositeRow1;
	private Composite compositeRow2;
	private Composite compositeRow3;
	private Composite compositeRow4;
	private Composite compositeRow5;

	private Group groupSelectedSamples;
	private Text textSelectedTotal;
	private Text textSelectedNotEmpty;
	private Text textSelectedEmpty;

	private Group groupSampleName;
	private Text textName;
	private Text inputName;
	private Button appendName;

	private Group groupGeneralInfo;
	private Text textSampleRate;
	private Text textSampleTune;
	private Text textIsSlice;
	private Text textIsLoop;

	private Group groupSizeInfo;
	private Text textMemUsedInBytes;
	private Text textNumberOfSampleFrames;
	private Text textStart;
	private Text inputStart;
	private Text textEnd;
	private Text inputEnd;
	private Text textLoopStart;
	private Text inputLoopStart;

	private Group groupMiscInfo;
	private Text textStretchStep;
	private Combo comboStretchStep;
	private Text textPlayLevel;
	private Combo comboPlayLevel;

	/**
	 * @param parent
	 * @param style
	 */
	public EsxCompositeSample(Composite parent, int style) {
		super(parent, style);
	}

	/**
	 * @param parentPart
	 * @param parentComposite
	 * @param style
	 */
	public EsxCompositeSample(EsxEditorPart parentPart, Composite parentComposite, int style) {
		super(parentPart, parentComposite, style);
		this.parentPart = parentPart;

		setLayout(new FillLayout(SWT.HORIZONTAL));
		
		scrolledComposite = new ScrolledComposite(this, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);
		
		compositeMain = new Composite(scrolledComposite, SWT.NONE);
		RowLayout rowLayout = new RowLayout(SWT.VERTICAL);
		rowLayout.wrap = false;
		rowLayout.fill = true;
		compositeMain.setLayout(rowLayout);

		
		/* ======================== */
		/* ROW 1					*/
		/* ======================== */
		compositeRow1 = new Composite(compositeMain, SWT.NONE);
		compositeRow1.setLayout(new FillLayout(SWT.HORIZONTAL));

		groupSelectedSamples = new Group(compositeRow1, SWT.NONE);
		groupSelectedSamples.setText("Selected Samples");
		groupSelectedSamples.setLayout(new GridLayout(2, false));

		textSelectedTotal = this.createGridData2ColumnTextLabel(groupSelectedSamples, "Total # Selected");
		textSelectedNotEmpty = this.createGridData2ColumnTextLabel(groupSelectedSamples, "# of Selected (Not Empty)");
		textSelectedEmpty = this.createGridData2ColumnTextLabel(groupSelectedSamples, "# of Selected (Empty)");

		/* ======================== */
		/* ROW 2					*/
		/* ======================== */
		compositeRow2 = new Composite(compositeMain, SWT.NONE);
		compositeRow2.setLayout(new FillLayout(SWT.HORIZONTAL));

		groupSampleName = new Group(compositeRow2, SWT.NONE);
		groupSampleName.setText("Sample Name");
		groupSampleName.setLayout(new GridLayout(4, false));

		textName = this.createGridData2ColumnTextLabel(groupSampleName, "Name");
		inputName = this.createGridData2ColumnTextInput(groupSampleName, "Name", new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setFeatureForSelectedItems(samples, EsxPackage.Literals.SAMPLE__NAME, inputName.getText(), appendName.getSelection(), 8);
			}
		});
		appendName = this.createGridData4ColumnCheckButton(groupSampleName, "Append # when multiple samples are selected", true);

		/* ======================== */
		/* ROW 3					*/
		/* ======================== */
		compositeRow3 = new Composite(compositeMain, SWT.NONE);
		compositeRow3.setLayout(new FillLayout(SWT.HORIZONTAL));

		groupGeneralInfo = new Group(compositeRow3, SWT.NONE);
		groupGeneralInfo.setText("General Info");
		groupGeneralInfo.setLayout(new GridLayout(4, false));

		textSampleRate = this.createGridData2ColumnTextLabel(groupGeneralInfo, "Sample Rate");
		textSampleTune = this.createGridData2ColumnTextLabel(groupGeneralInfo, "Sample Tune");
		textIsSlice = this.createGridData2ColumnTextLabel(groupGeneralInfo, "Is Slice?");
		textIsLoop = this.createGridData2ColumnTextLabel(groupGeneralInfo, "Is Loop?");

		/* ======================== */
		/* ROW 4					*/
		/* ======================== */
		compositeRow4 = new Composite(compositeMain, SWT.NONE);
		compositeRow4.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		groupSizeInfo = new Group(compositeRow4, SWT.NONE);
		groupSizeInfo.setText("Size/Length Info");
		groupSizeInfo.setLayout(new GridLayout(4, false));

		textNumberOfSampleFrames = this.createGridData2ColumnTextLabel(groupSizeInfo, "Length");
		textMemUsedInBytes = this.createGridData2ColumnTextLabel(groupSizeInfo, "Mem Used");
		textStart = this.createGridData2ColumnTextLabel(groupSizeInfo, "Start");
		inputStart = this.createGridData2ColumnTextInput(groupSizeInfo, "Start", new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setFeatureForSelectedItems(samples, EsxPackage.Literals.SAMPLE__START, Integer.parseInt(inputStart.getText()), false, -1);
			}
		});
		textEnd = this.createGridData2ColumnTextLabel(groupSizeInfo, "End");
		inputEnd = this.createGridData2ColumnTextInput(groupSizeInfo, "End", new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setFeatureForSelectedItems(samples, EsxPackage.Literals.SAMPLE__END, Integer.parseInt(inputEnd.getText()), false, -1);
			}
		});
		textLoopStart = this.createGridData2ColumnTextLabel(groupSizeInfo, "Loop Start");
		inputLoopStart = this.createGridData2ColumnTextInput(groupSizeInfo, "Loop Start", new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setFeatureForSelectedItems(samples, EsxPackage.Literals.SAMPLE__LOOP_START, Integer.parseInt(inputLoopStart.getText()), false, -1);
			}
		});

		/* ======================== */
		/* ROW 5					*/
		/* ======================== */
		compositeRow5 = new Composite(compositeMain, SWT.NONE);
		compositeRow5.setLayout(new FillLayout(SWT.HORIZONTAL));

		groupMiscInfo = new Group(compositeRow5, SWT.NONE);
		groupMiscInfo.setText("StretchStep/PlayLevel Info");
		groupMiscInfo.setLayout(new GridLayout(4, false));

		textStretchStep = this.createGridData2ColumnTextLabel(groupMiscInfo, "Stretch Step");
		comboStretchStep = this.createGridData2ColumnComboInput(groupMiscInfo, "Stretch Step", this.getLiteralStrings(StretchStep.values()) , new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setFeatureForSelectedItems(samples, EsxPackage.Literals.SAMPLE__STRETCH_STEP, StretchStep.get(comboStretchStep.getSelectionIndex()-1), false, -1);
			}
		});
		textPlayLevel = this.createGridData2ColumnTextLabel(groupMiscInfo, "Play Level");
		comboPlayLevel = this.createGridData2ColumnComboInput(groupMiscInfo, "Play Level", this.getLiteralStrings(PlayLevel.values()) , new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setFeatureForSelectedItems(samples, EsxPackage.Literals.SAMPLE__PLAY_LEVEL, PlayLevel.get(comboPlayLevel.getSelectionIndex()), false, -1);
			}
		});

		scrolledComposite.setContent(compositeMain);
		scrolledComposite.setMinSize(compositeMain.computeSize(SWT.DEFAULT, SWT.DEFAULT));
	}


	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#setInput(java.lang.Object)
	 */
	@Override
	public void setInput(Object input) {
		this.samples = new ArrayList<Sample>();

		if(input instanceof List<?>) {
			Iterator<?> it = ((List<?>) input).iterator();
			while (it.hasNext()) {
				Object obj = it.next();
				if(obj instanceof Sample) {
					this.samples.add((Sample) obj);
				}
			}
		}

		this.refreshInputs();
		this.refresh();
	}
	
	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#refresh()
	 */
	@Override
	public void refresh() {
		String multipleValueString = "<Multiple Values>";

		this.textSelectedTotal.setText(Integer.toString(this.getNumSelections()));
		this.textSelectedNotEmpty.setText(Integer.toString(this.getNumSelectionsNotEmpty()));
		this.textSelectedEmpty.setText(Integer.toString(this.getNumSelectionsEmpty()));

		this.textName.setText(StringUtils.trim(getMultiString(this.samples, EsxPackage.Literals.SAMPLE__NAME, multipleValueString)));

		this.textSampleRate.setText(StringUtils.trim(getMultiString(this.samples, EsxPackage.Literals.SAMPLE__SAMPLE_RATE, multipleValueString)));
		this.textSampleTune.setText(StringUtils.trim(getMultiString(this.samples, EsxPackage.Literals.SAMPLE__SAMPLE_TUNE, multipleValueString)));
		this.textIsSlice.setText(StringUtils.trim(getMultiString(this.samples, EsxPackage.Literals.SAMPLE__SLICE, multipleValueString)));
		this.textIsLoop.setText(StringUtils.trim(getMultiString(this.samples, EsxPackage.Literals.SAMPLE__LOOP, multipleValueString)));

		this.textMemUsedInBytes.setText(StringUtils.trim(getMultiString(this.samples, EsxPackage.Literals.SAMPLE__MEM_USED_IN_BYTES, multipleValueString)));
		this.textNumberOfSampleFrames.setText(StringUtils.trim(getMultiString(this.samples, EsxPackage.Literals.SAMPLE__NUMBER_OF_SAMPLE_FRAMES, multipleValueString)));
		this.textStart.setText(StringUtils.trim(getMultiString(this.samples, EsxPackage.Literals.SAMPLE__START, multipleValueString)));
		this.textEnd.setText(StringUtils.trim(getMultiString(this.samples, EsxPackage.Literals.SAMPLE__END, multipleValueString)));
		this.textLoopStart.setText(StringUtils.trim(getMultiString(this.samples, EsxPackage.Literals.SAMPLE__LOOP_START, multipleValueString)));

		this.textStretchStep.setText(StringUtils.trim(getMultiString(this.samples, EsxPackage.Literals.SAMPLE__STRETCH_STEP, multipleValueString)));
		this.textPlayLevel.setText(StringUtils.trim(getMultiString(this.samples, EsxPackage.Literals.SAMPLE__PLAY_LEVEL, multipleValueString)));
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#refreshInputs()
	 */
	@Override
	public void refreshInputs() {
		String multipleValueString = "";

		this.inputName.setText(StringUtils.trim(getMultiString(this.samples, EsxPackage.Literals.SAMPLE__NAME, multipleValueString)));

		this.inputStart.setText(StringUtils.trim(getMultiString(this.samples, EsxPackage.Literals.SAMPLE__START, multipleValueString)));
		this.inputEnd.setText(StringUtils.trim(getMultiString(this.samples, EsxPackage.Literals.SAMPLE__END, multipleValueString)));
		this.inputLoopStart.setText(StringUtils.trim(getMultiString(this.samples, EsxPackage.Literals.SAMPLE__LOOP_START, multipleValueString)));

		this.comboStretchStep.setText(StringUtils.trim(getMultiString(this.samples, EsxPackage.Literals.SAMPLE__STRETCH_STEP, multipleValueString)));
		this.comboPlayLevel.setText(StringUtils.trim(getMultiString(this.samples, EsxPackage.Literals.SAMPLE__PLAY_LEVEL, multipleValueString)));
	}
	
	/**
	 * @return
	 */
	private int getNumSelections() {
		return this.samples.size();
	}

	/**
	 * @return
	 */
	private int getNumSelectionsNotEmpty() {
		int returnValue = 0;
		for(int i=0; i<this.samples.size(); i++) {
			if(!this.samples.get(i).isEmpty()) {
				returnValue++;
			}
		}
		return returnValue;
	}

	/**
	 * @return
	 */
	private int getNumSelectionsEmpty() {
		int returnValue = 0;
		for(int i=0; i<this.samples.size(); i++) {
			if(this.samples.get(i).isEmpty()) {
				returnValue++;
			}
		}
		return returnValue;
	}

}

package com.skratchdot.electribe.model.esx.presentation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.Sample;

public class EsxCompositeSample extends EsxComposite {
	public static final String ID = "com.skratchdot.electribe.model.esx.presentation.EsxCompositeSample"; //$NON-NLS-1$

	protected List<Sample> samples;

	private Composite compositeMain;
	private Composite compositeRow1;
	private Composite compositeRow2;
	private Composite compositeRow3;
	private Composite compositeRow4;

	private Group groupSelectedSamples;
	protected Text textSelectedTotal;
	protected Text textSelectedBeingUsed;
	protected Text textSelectedNotInUse;

	private Group groupSampleName;
	protected Text textName;
	protected Text inputName;
	protected Button appendName;

	private Group groupGeneralInfo;
	protected Text textSampleRate;
	protected Text textSampleTune;
	protected Text textIsSlice;
	protected Text textIsLoop;

	private Group groupSizeInfo;
	protected Text textMemUsedInBytes;
	protected Text textNumberOfSampleFrames;
	protected Text textStart;
	protected Text inputStart;
	protected Text textEnd;
	protected Text inputEnd;
	protected Text textLoopStart;
	protected Text inputLoopStart;
	private ScrolledComposite scrolledComposite;

	/**
	 * @param parent
	 * @param style
	 */
	public EsxCompositeSample(Composite parent, int style) {
		super(parent, style);
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

		this.createGridData2ColumnText(this, groupSelectedSamples, "Total # Selected", "textSelectedTotal");
		this.createGridData2ColumnText(this, groupSelectedSamples, "# of Selected Being Used", "textSelectedBeingUsed");
		this.createGridData2ColumnText(this, groupSelectedSamples, "# of Selected Not In Use", "textSelectedNotInUse");

		/* ======================== */
		/* ROW 2					*/
		/* ======================== */
		compositeRow2 = new Composite(compositeMain, SWT.NONE);
		compositeRow2.setLayout(new FillLayout(SWT.HORIZONTAL));

		groupSampleName = new Group(compositeRow2, SWT.NONE);
		groupSampleName.setText("Sample Name");
		groupSampleName.setLayout(new GridLayout(4, false));

		this.createGridData4ColumnTextInput(this, groupSampleName, "Sample Name", "textName", "inputName", "appendName", 8, "samples", EsxPackage.Literals.SAMPLE__NAME);
		
		/* ======================== */
		/* ROW 3					*/
		/* ======================== */
		compositeRow3 = new Composite(compositeMain, SWT.NONE);
		compositeRow3.setLayout(new FillLayout(SWT.HORIZONTAL));

		groupGeneralInfo = new Group(compositeRow3, SWT.NONE);
		groupGeneralInfo.setText("General Info");
		groupGeneralInfo.setLayout(new GridLayout(4, false));

		this.createGridData2ColumnText(this, groupGeneralInfo, "Sample Rate", "textSampleRate");
		this.createGridData2ColumnText(this, groupGeneralInfo, "Sample Tune", "textSampleTune");
		this.createGridData2ColumnText(this, groupGeneralInfo, "Is Slice?", "textIsSlice");
		this.createGridData2ColumnText(this, groupGeneralInfo, "Is Loop?", "textIsLoop");

		/* ======================== */
		/* ROW 4					*/
		/* ======================== */
		compositeRow4 = new Composite(compositeMain, SWT.NONE);
		compositeRow4.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		groupSizeInfo = new Group(compositeRow4, SWT.NONE);
		groupSizeInfo.setText("Size/Length Info");
		groupSizeInfo.setLayout(new GridLayout(4, false));

		this.createGridData2ColumnText(this, groupSizeInfo, "Length", "textNumberOfSampleFrames");
		this.createGridData2ColumnText(this, groupSizeInfo, "Mem Used", "textMemUsedInBytes");
		this.createGridData4ColumnTextInput(this, groupSizeInfo, "Start", "textStart", "inputStart", null, 100, "samples", EsxPackage.Literals.SAMPLE__START);
		this.createGridData4ColumnTextInput(this, groupSizeInfo, "End", "textEnd", "inputEnd", null, 100, "samples", EsxPackage.Literals.SAMPLE__END);
		this.createGridData4ColumnTextInput(this, groupSizeInfo, "Loop Start", "textLoopStart", "inputLoopStart", null, 100, "samples", EsxPackage.Literals.SAMPLE__LOOP_START);
		scrolledComposite.setContent(compositeMain);
		scrolledComposite.setMinSize(compositeMain.computeSize(SWT.DEFAULT, SWT.DEFAULT));
	}

	/**
	 * @param parentEditor
	 * @param parentComposite
	 * @param style
	 */
	public EsxCompositeSample(EsxEditor parentEditor, Composite parentComposite, int style) {
		this(parentComposite, style);
		this.parentEditor = parentEditor;
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
		this.textSelectedBeingUsed.setText(Integer.toString(this.getNumSelectionsBeingUsed()));
		this.textSelectedNotInUse.setText(Integer.toString(this.getNumSelectionsNotInUse()));

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
	}

	/**
	 * This method should only be called when setInput() is called. It will
	 * refresh the form inputs with the first element in the samples list.
	 */
	private void refreshInputs() {
		String multipleValueString = "";

		this.inputName.setText(StringUtils.trim(getMultiString(this.samples, EsxPackage.Literals.SAMPLE__NAME, multipleValueString)));

		this.inputStart.setText(StringUtils.trim(getMultiString(this.samples, EsxPackage.Literals.SAMPLE__START, multipleValueString)));
		this.inputEnd.setText(StringUtils.trim(getMultiString(this.samples, EsxPackage.Literals.SAMPLE__END, multipleValueString)));
		this.inputLoopStart.setText(StringUtils.trim(getMultiString(this.samples, EsxPackage.Literals.SAMPLE__LOOP_START, multipleValueString)));
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
	private int getNumSelectionsBeingUsed() {
		int returnValue = 0;
		for(int i=0; i<this.samples.size(); i++) {
			if(this.samples.get(i).isBeingUsed()) {
				returnValue++;
			}
		}
		return returnValue;
	}

	/**
	 * @return
	 */
	private int getNumSelectionsNotInUse() {
		int returnValue = 0;
		for(int i=0; i<this.samples.size(); i++) {
			if(!this.samples.get(i).isBeingUsed()) {
				returnValue++;
			}
		}
		return returnValue;
	}

}

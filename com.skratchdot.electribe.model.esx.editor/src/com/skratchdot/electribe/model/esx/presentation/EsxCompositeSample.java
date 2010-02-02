package com.skratchdot.electribe.model.esx.presentation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
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
	protected Text inputName;
	protected Button buttonAppendName;
	protected Button buttonName;
	protected Text textName;

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

	/**
	 * @param parent
	 * @param style
	 */
	public EsxCompositeSample(Composite parent, int style) {
		super(parent, style);
		setLayout(new FillLayout(SWT.VERTICAL));
		
		compositeMain = new Composite(this, SWT.NONE);
		RowLayout rowLayout = new RowLayout(SWT.VERTICAL);
		rowLayout.wrap = false;
		rowLayout.fill = true;
		rowLayout.center = true;
		compositeMain.setLayout(rowLayout);

		/* ======================== */
		/* ROW 1					*/
		/* ======================== */
		compositeRow1 = new Composite(compositeMain, SWT.NONE);
		compositeRow1.setLayout(new RowLayout(SWT.HORIZONTAL));

		groupSelectedSamples = new Group(compositeRow1, SWT.NONE);
		groupSelectedSamples.setText("Selected Samples");
		groupSelectedSamples.setLayout(new GridLayout(4, false));

		this.createTextEditRow4Columns(this, groupSelectedSamples, "Total # Selected", "textSelectedTotal", null, null, null);
		this.createTextEditRow4Columns(this, groupSelectedSamples, "# of Selected Being Used", "textSelectedBeingUsed", null, null, null);
		this.createTextEditRow4Columns(this, groupSelectedSamples, "# of Selected Not In Use", "textSelectedNotInUse", null, null, null);

		/* ======================== */
		/* ROW 2					*/
		/* ======================== */
		compositeRow2 = new Composite(compositeMain, SWT.NONE);
		compositeRow2.setLayout(new RowLayout(SWT.HORIZONTAL));

		groupSampleName = new Group(compositeRow2, SWT.NONE);
		groupSampleName.setText("Sample Name");
		RowLayout rowLayout2 = new RowLayout(SWT.VERTICAL);
		groupSampleName.setLayout(rowLayout2);
		
		textName = new Text(groupSampleName, SWT.BORDER);
		textName.setEditable(false);
		
		inputName = new Text(groupSampleName, SWT.BORDER);
		
		buttonAppendName = new Button(groupSampleName, SWT.CHECK);
		buttonAppendName.setSelection(true);
		buttonAppendName.setToolTipText("When multiple samples are selected, numbers will be appended to the end of the sample name. For example: SNARE01, SNARE02");
		buttonAppendName.setText("Use Multi #");
		
		buttonName = new Button(groupSampleName, SWT.NONE);
		buttonName.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setSelectedSamplesName();
			}
		});
		buttonName.setText("Set Name");

		/* ======================== */
		/* ROW 3					*/
		/* ======================== */
		compositeRow3 = new Composite(compositeMain, SWT.NONE);
		compositeRow3.setLayout(new RowLayout(SWT.HORIZONTAL));

		groupGeneralInfo = new Group(compositeRow3, SWT.NONE);
		groupGeneralInfo.setText("General Info");
		groupGeneralInfo.setLayout(new GridLayout(4, false));

		this.createTextEditRow4Columns(this, groupGeneralInfo, "Sample Rate", "textSampleRate", null, null, null);
		this.createTextEditRow4Columns(this, groupGeneralInfo, "Sample Tune", "textSampleTune", null, null, null);
		this.createTextEditRow4Columns(this, groupGeneralInfo, "Is Slice?", "textIsSlice", null, null, null);
		this.createTextEditRow4Columns(this, groupGeneralInfo, "Is Loop?", "textIsLoop", null, null, null);

		/* ======================== */
		/* ROW 4					*/
		/* ======================== */
		compositeRow4 = new Composite(compositeMain, SWT.NONE);
		compositeRow4.setLayout(new RowLayout(SWT.HORIZONTAL));
		
		groupSizeInfo = new Group(compositeRow4, SWT.NONE);
		groupSizeInfo.setText("Size/Length Info");
		groupSizeInfo.setLayout(new GridLayout(4, false));

		this.createTextEditRow4Columns(this, groupSizeInfo, "Mem Used", "textMemUsedInBytes", null, null, null);
		this.createTextEditRow4Columns(this, groupSizeInfo, "Length", "textNumberOfSampleFrames", null, null, null);
		this.createTextEditRow4Columns(this, groupSizeInfo, "Start", "textStart", "inputStart", "samples", EsxPackage.Literals.SAMPLE__START);
		this.createTextEditRow4Columns(this, groupSizeInfo, "End", "textEnd", "inputEnd", "samples", EsxPackage.Literals.SAMPLE__END);
		this.createTextEditRow4Columns(this, groupSizeInfo, "Loop Start", "textLoopStart", "inputLoopStart", "samples", EsxPackage.Literals.SAMPLE__LOOP_START);
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

	/**
	 * 
	 */
	private void setSelectedSamplesName() {
		CompoundCommand cmd = new CompoundCommand();

		for(int i=0; i<this.samples.size(); i++) {
			cmd.append(SetCommand.create(
				this.getEditingDomain(),
				this.samples.get(i),
				EsxPackage.Literals.SAMPLE__NAME,
				getMultiNumberName(this.inputName.getText(), i, this.samples.size())
			));
		}

		if(cmd.canExecute()) {
			this.getCommandStack().execute(cmd);
		}
	}

	/**
	 * @param name
	 * @param currentIndex
	 * @param totalSize
	 */
	private String getMultiNumberName(String name, int currentIndex, int totalSize) {
		name = StringUtils.trim(name);
		currentIndex = currentIndex<totalSize?currentIndex+1:totalSize+1;

		if(totalSize<=1 || !this.buttonAppendName.getSelection()) {
			return name;
		}
		else if(totalSize<10) {
			return StringUtils.left(name, 7) + Integer.toString(currentIndex);
		}
		else if(totalSize<100) {
			return StringUtils.left(name, 6) + StringUtils.leftPad(Integer.toString(currentIndex), 2, "0");
		}
		else {
			return StringUtils.left(name, 5) + StringUtils.leftPad(Integer.toString(currentIndex), 3, "0");
		}
	}

}

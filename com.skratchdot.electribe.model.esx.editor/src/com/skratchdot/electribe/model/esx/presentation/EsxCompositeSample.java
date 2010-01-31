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
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.Sample;

public class EsxCompositeSample extends EsxComposite {
	public static final String ID = "com.skratchdot.electribe.model.esx.presentation.EsxCompositeSample"; //$NON-NLS-1$
	
	private List<Sample> samples;

	private Group grpSelectedSamples;
	private Composite composite;
	private Text textSelectedTotal;
	private Text textSelectedBeingUsed;
	private Text textSelectedNotInUse;
	private Group grpSampleName;
	private Text inputName;
	private Button buttonAppendName;
	private Button buttonName;
	private Text textName;

	/**
	 * @param parent
	 * @param style
	 */
	public EsxCompositeSample(Composite parent, int style) {
		super(parent, style);
		setLayout(new FillLayout(SWT.HORIZONTAL));
		
		grpSelectedSamples = new Group(this, SWT.NONE);
		grpSelectedSamples.setText("Selected Samples");
		grpSelectedSamples.setLayout(new RowLayout(SWT.VERTICAL));
		
		composite = new Composite(grpSelectedSamples, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));
		
		Label lblSelectedTotal = new Label(composite, SWT.NONE);
		lblSelectedTotal.setAlignment(SWT.RIGHT);
		lblSelectedTotal.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblSelectedTotal.setText("Total # Selected:");
		
		textSelectedTotal = new Text(composite, SWT.BORDER);
		textSelectedTotal.setEditable(false);
		textSelectedTotal.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblSelectedUsed = new Label(composite, SWT.NONE);
		lblSelectedUsed.setAlignment(SWT.RIGHT);
		lblSelectedUsed.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblSelectedUsed.setText("# of Selected Being Used:");
		
		textSelectedBeingUsed = new Text(composite, SWT.BORDER);
		textSelectedBeingUsed.setEditable(false);
		textSelectedBeingUsed.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblSelectedUnused = new Label(composite, SWT.NONE);
		lblSelectedUnused.setAlignment(SWT.RIGHT);
		lblSelectedUnused.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblSelectedUnused.setText("# of Selected Not In Use");
		
		textSelectedNotInUse = new Text(composite, SWT.BORDER);
		textSelectedNotInUse.setEditable(false);
		textSelectedNotInUse.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		grpSampleName = new Group(grpSelectedSamples, SWT.NONE);
		grpSampleName.setText("Sample Name");
		RowLayout rowLayout = new RowLayout(SWT.VERTICAL);
		grpSampleName.setLayout(rowLayout);
		
		textName = new Text(grpSampleName, SWT.BORDER);
		textName.setEditable(false);
		
		inputName = new Text(grpSampleName, SWT.BORDER);
		
		buttonAppendName = new Button(grpSampleName, SWT.CHECK);
		buttonAppendName.setSelection(true);
		buttonAppendName.setToolTipText("When multiple samples are selected, numbers will be appended to the end of the sample name. For example: SNARE01, SNARE02");
		buttonAppendName.setText("Use Multi #");
		
		buttonName = new Button(grpSampleName, SWT.NONE);
		buttonName.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setSelectedSamplesName();
			}
		});
		buttonName.setText("Set Name");
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
		this.textSelectedTotal.setText(Integer.toString(this.getNumSelections()));
		this.textSelectedBeingUsed.setText(Integer.toString(this.getNumSelectionsBeingUsed()));
		this.textSelectedNotInUse.setText(Integer.toString(this.getNumSelectionsNotInUse()));
		
		this.textName.setText(StringUtils.trim(getMultiString(this.samples, EsxPackage.Literals.SAMPLE__NAME, "<Multiple Values>")));
	}

	/**
	 * This method should only be called when setInput() is called. It will
	 * refresh the form inputs with the first element in the samples list.
	 */
	private void refreshInputs() {
		this.inputName.setText(StringUtils.trim(getMultiString(this.samples, EsxPackage.Literals.SAMPLE__NAME, "")));
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
			cmd.append(new SetCommand(
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

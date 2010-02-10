package com.skratchdot.electribe.model.esx.presentation;

import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import com.skratchdot.electribe.model.esx.ArpeggiatorControl;
import com.skratchdot.electribe.model.esx.AudioInMode;
import com.skratchdot.electribe.model.esx.EnabledFlag;
import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.GlobalParameters;
import com.skratchdot.electribe.model.esx.MidiChannel;
import com.skratchdot.electribe.model.esx.MidiChannelTypeName;
import com.skratchdot.electribe.model.esx.MidiClock;
import com.skratchdot.electribe.model.esx.PitchBendRange;

public class EsxCompositeGlobal extends EsxComposite {
	public static final String ID = "com.skratchdot.electribe.model.esx.presentation.EsxCompositeGlobalParameters"; //$NON-NLS-1$

	private GlobalParameters globalParameters;

	private ScrolledComposite scrolledComposite;
	private Composite compositeMain;
	private Composite compositeRow1;
	private Composite compositeRow2;

	private Group groupGlobalParameters;
	private Text textArpeggiatorControl;
	private Combo comboArpeggiatorControl;
	private Text textAudioInMode;
	private Combo comboAudioInMode;
	private Text textControlChangeEnabled;
	private Combo comboControlChangeEnabled;
	private Text textMemoryProtectEnabled;
	private Combo comboMemoryProtectEnabled;
	private Text textMidiClock;
	private Combo comboMidiClock;
	private Text textNoteMessageEnabled;
	private Combo comboNoteMessageEnabled;
	private Text textPitchBendRange;
	private Combo comboPitchBendRange;
	private Text textProgramChangeEnabled;
	private Combo comboProgramChangeEnabled;
	private Text textSystemExEnabled;
	private Combo comboSystemExEnabled;

	private Group groupMidiChannels;
	private Text textMidiChannel0;
	private Combo comboMidiChannel0;
	private Text textMidiChannel1;
	private Combo comboMidiChannel1;
	private Text textMidiChannel2;
	private Combo comboMidiChannel2;

	/**
	 * @param parent
	 * @param style
	 */
	public EsxCompositeGlobal(Composite parent, int style) {
		super(parent, style);
	}

	/**
	 * @param parentPart
	 * @param parentComposite
	 * @param style
	 */
	public EsxCompositeGlobal(EsxEditorPart parentPart, Composite parentComposite, int style) {
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

		groupGlobalParameters = new Group(compositeRow1, SWT.NONE);
		groupGlobalParameters.setText("Global Parameters");
		groupGlobalParameters.setLayout(new GridLayout(4, false));

		// ArpeggiatorControl
		textArpeggiatorControl = this.createGridData2ColumnTextLabel(groupGlobalParameters, "Arpeggiator Control");
		comboArpeggiatorControl = this.createGridData2ColumnComboInput(groupGlobalParameters, "Arpeggiator Control", this.getLiteralStrings(ArpeggiatorControl.values()) , new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getCommandStack().execute(SetCommand.create(getEditingDomain(), globalParameters, EsxPackage.Literals.GLOBAL_PARAMETERS__ARPEGGIATOR_CONTROL, ArpeggiatorControl.get(comboArpeggiatorControl.getSelectionIndex())));
			}
		});
		// AudioInMode
		textAudioInMode = this.createGridData2ColumnTextLabel(groupGlobalParameters, "Audio In Mode");
		comboAudioInMode = this.createGridData2ColumnComboInput(groupGlobalParameters, "Audio In Mode", this.getLiteralStrings(AudioInMode.values()) , new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getCommandStack().execute(SetCommand.create(getEditingDomain(), globalParameters, EsxPackage.Literals.GLOBAL_PARAMETERS__AUDIO_IN_MODE, AudioInMode.get(comboAudioInMode.getSelectionIndex())));
			}
		});
		// ControlChangeEnabled
		textControlChangeEnabled = this.createGridData2ColumnTextLabel(groupGlobalParameters, "Control Change Enabled");
		comboControlChangeEnabled = this.createGridData2ColumnComboInput(groupGlobalParameters, "Control Change Enabled", this.getLiteralStrings(EnabledFlag.values()) , new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getCommandStack().execute(SetCommand.create(getEditingDomain(), globalParameters, EsxPackage.Literals.GLOBAL_PARAMETERS__CONTROL_CHANGE_ENABLED, EnabledFlag.get(comboControlChangeEnabled.getSelectionIndex())));
			}
		});
		// MemoryProtectEnabled
		textMemoryProtectEnabled = this.createGridData2ColumnTextLabel(groupGlobalParameters, "Memory Protect Enabled");
		comboMemoryProtectEnabled = this.createGridData2ColumnComboInput(groupGlobalParameters, "Memory Protect Enabled", this.getLiteralStrings(EnabledFlag.values()) , new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getCommandStack().execute(SetCommand.create(getEditingDomain(), globalParameters, EsxPackage.Literals.GLOBAL_PARAMETERS__MEMORY_PROTECT_ENABLED, EnabledFlag.get(comboMemoryProtectEnabled.getSelectionIndex())));
			}
		});
		// MidiClock
		textMidiClock = this.createGridData2ColumnTextLabel(groupGlobalParameters, "Midi Clock");
		comboMidiClock = this.createGridData2ColumnComboInput(groupGlobalParameters, "Midi Clock", this.getLiteralStrings(MidiClock.values()) , new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getCommandStack().execute(SetCommand.create(getEditingDomain(), globalParameters, EsxPackage.Literals.GLOBAL_PARAMETERS__MIDI_CLOCK, MidiClock.get(comboMidiClock.getSelectionIndex())));
			}
		});
		// NoteMessageEnabled
		textNoteMessageEnabled = this.createGridData2ColumnTextLabel(groupGlobalParameters, "Note Message Enabled");
		comboNoteMessageEnabled = this.createGridData2ColumnComboInput(groupGlobalParameters, "Note Message Enabled", this.getLiteralStrings(EnabledFlag.values()) , new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getCommandStack().execute(SetCommand.create(getEditingDomain(), globalParameters, EsxPackage.Literals.GLOBAL_PARAMETERS__NOTE_MESSAGE_ENABLED, EnabledFlag.get(comboNoteMessageEnabled.getSelectionIndex())));
			}
		});
		// PitchBendRange
		textPitchBendRange = this.createGridData2ColumnTextLabel(groupGlobalParameters, "Pitch Bend Range");
		comboPitchBendRange = this.createGridData2ColumnComboInput(groupGlobalParameters, "Pitch Bend Range", this.getLiteralStrings(PitchBendRange.values()) , new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getCommandStack().execute(SetCommand.create(getEditingDomain(), globalParameters, EsxPackage.Literals.GLOBAL_PARAMETERS__PITCH_BEND_RANGE, PitchBendRange.get(comboPitchBendRange.getSelectionIndex())));
			}
		});
		// ProgramChangeEnabled
		textProgramChangeEnabled = this.createGridData2ColumnTextLabel(groupGlobalParameters, "Program Change Enabled");
		comboProgramChangeEnabled = this.createGridData2ColumnComboInput(groupGlobalParameters, "Program Change Enabled", this.getLiteralStrings(EnabledFlag.values()) , new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getCommandStack().execute(SetCommand.create(getEditingDomain(), globalParameters, EsxPackage.Literals.GLOBAL_PARAMETERS__PROGRAM_CHANGE_ENABLED, EnabledFlag.get(comboProgramChangeEnabled.getSelectionIndex())));
			}
		});
		// SystemExEnabled
		textSystemExEnabled = this.createGridData2ColumnTextLabel(groupGlobalParameters, "SystemEx Enabled");
		comboSystemExEnabled = this.createGridData2ColumnComboInput(groupGlobalParameters, "SystemEx Enabled", this.getLiteralStrings(EnabledFlag.values()) , new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getCommandStack().execute(SetCommand.create(getEditingDomain(), globalParameters, EsxPackage.Literals.GLOBAL_PARAMETERS__SYSTEM_EX_ENABLED, EnabledFlag.get(comboSystemExEnabled.getSelectionIndex())));
			}
		});

		/* ======================== */
		/* ROW 2					*/
		/* ======================== */
		compositeRow2 = new Composite(compositeMain, SWT.NONE);
		compositeRow2.setLayout(new FillLayout(SWT.HORIZONTAL));

		groupMidiChannels = new Group(compositeRow2, SWT.NONE);
		groupMidiChannels.setText("Midi Channels");
		groupMidiChannels.setLayout(new GridLayout(4, false));

		// MidiChannel0
		textMidiChannel0 = this.createGridData2ColumnTextLabel(groupMidiChannels, MidiChannelTypeName.get(0).getLiteral());
		comboMidiChannel0 = this.createGridData2ColumnComboInput(groupMidiChannels, MidiChannelTypeName.get(0).getLiteral(), this.getLiteralStrings(MidiChannel.values()) , new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getCommandStack().execute(SetCommand.create(getEditingDomain(), globalParameters.getMidiChannels().get(0), EsxPackage.Literals.MIDI_CHANNEL_TYPE__MIDI_CHANNEL, MidiChannel.get(comboMidiChannel0.getSelectionIndex())));
			}
		});
		// MidiChannel1
		textMidiChannel1 = this.createGridData2ColumnTextLabel(groupMidiChannels, MidiChannelTypeName.get(1).getLiteral());
		comboMidiChannel1 = this.createGridData2ColumnComboInput(groupMidiChannels, MidiChannelTypeName.get(1).getLiteral(), this.getLiteralStrings(MidiChannel.values()) , new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getCommandStack().execute(SetCommand.create(getEditingDomain(), globalParameters.getMidiChannels().get(1), EsxPackage.Literals.MIDI_CHANNEL_TYPE__MIDI_CHANNEL, MidiChannel.get(comboMidiChannel1.getSelectionIndex())));
			}
		});
		// MidiChannel2
		textMidiChannel2 = this.createGridData2ColumnTextLabel(groupMidiChannels, MidiChannelTypeName.get(2).getLiteral());
		comboMidiChannel2 = this.createGridData2ColumnComboInput(groupMidiChannels, MidiChannelTypeName.get(2).getLiteral(), this.getLiteralStrings(MidiChannel.values()) , new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getCommandStack().execute(SetCommand.create(getEditingDomain(), globalParameters.getMidiChannels().get(2), EsxPackage.Literals.MIDI_CHANNEL_TYPE__MIDI_CHANNEL, MidiChannel.get(comboMidiChannel2.getSelectionIndex())));
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
		if(input instanceof GlobalParameters) {
			this.globalParameters = (GlobalParameters) input;

			this.refresh();
			this.refreshInputs();
		}
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#refresh()
	 */
	@Override
	public void refresh() {
		textArpeggiatorControl.setText(this.globalParameters.getArpeggiatorControl().getLiteral());
		textAudioInMode.setText(this.globalParameters.getAudioInMode().getLiteral());
		textControlChangeEnabled.setText(this.globalParameters.getControlChangeEnabled().getLiteral());
		textMemoryProtectEnabled.setText(this.globalParameters.getMemoryProtectEnabled().getLiteral());
		textMidiClock.setText(this.globalParameters.getMidiClock().getLiteral());
		textNoteMessageEnabled.setText(this.globalParameters.getNoteMessageEnabled().getLiteral());
		textPitchBendRange.setText(this.globalParameters.getPitchBendRange().getLiteral());
		textProgramChangeEnabled.setText(this.globalParameters.getProgramChangeEnabled().getLiteral());
		textSystemExEnabled.setText(this.globalParameters.getSystemExEnabled().getLiteral());
		
		textMidiChannel0.setText(this.globalParameters.getMidiChannels().get(0).getMidiChannel().getLiteral());
		textMidiChannel1.setText(this.globalParameters.getMidiChannels().get(1).getMidiChannel().getLiteral());
		textMidiChannel2.setText(this.globalParameters.getMidiChannels().get(2).getMidiChannel().getLiteral());
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#refreshInputs()
	 */
	@Override
	public void refreshInputs() {
		comboArpeggiatorControl.setText(this.globalParameters.getArpeggiatorControl().getLiteral());
		comboAudioInMode.setText(this.globalParameters.getAudioInMode().getLiteral());
		comboControlChangeEnabled.setText(this.globalParameters.getControlChangeEnabled().getLiteral());
		comboMemoryProtectEnabled.setText(this.globalParameters.getMemoryProtectEnabled().getLiteral());
		comboMidiClock.setText(this.globalParameters.getMidiClock().getLiteral());
		comboNoteMessageEnabled.setText(this.globalParameters.getNoteMessageEnabled().getLiteral());
		comboPitchBendRange.setText(this.globalParameters.getPitchBendRange().getLiteral());
		comboProgramChangeEnabled.setText(this.globalParameters.getProgramChangeEnabled().getLiteral());
		comboSystemExEnabled.setText(this.globalParameters.getSystemExEnabled().getLiteral());

		comboMidiChannel0.setText(this.globalParameters.getMidiChannels().get(0).getMidiChannel().getLiteral());
		comboMidiChannel1.setText(this.globalParameters.getMidiChannels().get(1).getMidiChannel().getLiteral());
		comboMidiChannel2.setText(this.globalParameters.getMidiChannels().get(2).getMidiChannel().getLiteral());
	}

}

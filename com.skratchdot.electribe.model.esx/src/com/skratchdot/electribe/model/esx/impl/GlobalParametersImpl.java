/**
 * Copyright (c) 2009-2011 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 *
 * $Id$
 */
package com.skratchdot.electribe.model.esx.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.skratchdot.electribe.model.esx.ArpeggiatorControl;
import com.skratchdot.electribe.model.esx.AudioInMode;
import com.skratchdot.electribe.model.esx.EnabledFlag;
import com.skratchdot.electribe.model.esx.EsxFactory;
import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.GlobalParameters;
import com.skratchdot.electribe.model.esx.MidiChannel;
import com.skratchdot.electribe.model.esx.MidiChannelType;
import com.skratchdot.electribe.model.esx.MidiChannelTypeName;
import com.skratchdot.electribe.model.esx.MidiClock;
import com.skratchdot.electribe.model.esx.MidiControlChangeAssignment;
import com.skratchdot.electribe.model.esx.MidiControlChangeAssignmentName;
import com.skratchdot.electribe.model.esx.NoteNumber;
import com.skratchdot.electribe.model.esx.PartNoteNumber;
import com.skratchdot.electribe.model.esx.PartNoteNumberName;
import com.skratchdot.electribe.model.esx.PatternNumber;
import com.skratchdot.electribe.model.esx.PatternSetParameter;
import com.skratchdot.electribe.model.esx.PitchBendRange;
import com.skratchdot.electribe.model.esx.util.EsxUtil;
import com.skratchdot.electribe.model.esx.util.ExtendedByteBuffer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.GlobalParametersImpl#getMemoryProtectEnabled <em>Memory Protect Enabled</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.GlobalParametersImpl#getReservedByte <em>Reserved Byte</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.GlobalParametersImpl#getArpeggiatorControl <em>Arpeggiator Control</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.GlobalParametersImpl#getAudioInMode <em>Audio In Mode</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.GlobalParametersImpl#getMidiClock <em>Midi Clock</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.GlobalParametersImpl#getNoteMessageEnabled <em>Note Message Enabled</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.GlobalParametersImpl#getSystemExEnabled <em>System Ex Enabled</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.GlobalParametersImpl#getControlChangeEnabled <em>Control Change Enabled</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.GlobalParametersImpl#getProgramChangeEnabled <em>Program Change Enabled</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.GlobalParametersImpl#getReservedBitsAfterProgramChangeEnabled <em>Reserved Bits After Program Change Enabled</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.GlobalParametersImpl#getPitchBendRange <em>Pitch Bend Range</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.GlobalParametersImpl#getMidiChannels <em>Midi Channels</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.GlobalParametersImpl#getPartNoteNumbers <em>Part Note Numbers</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.GlobalParametersImpl#getMidiControlChangeAssignments <em>Midi Control Change Assignments</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.GlobalParametersImpl#getReservedLong <em>Reserved Long</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.GlobalParametersImpl#getPatternSetParameters <em>Pattern Set Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalParametersImpl extends EObjectImpl implements GlobalParameters {
	/**
	 * The default value of the '{@link #getMemoryProtectEnabled() <em>Memory Protect Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryProtectEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final EnabledFlag MEMORY_PROTECT_ENABLED_EDEFAULT = EnabledFlag.DISABLED;

	/**
	 * The cached value of the '{@link #getMemoryProtectEnabled() <em>Memory Protect Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryProtectEnabled()
	 * @generated
	 * @ordered
	 */
	protected EnabledFlag memoryProtectEnabled = MEMORY_PROTECT_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getReservedByte() <em>Reserved Byte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedByte()
	 * @generated
	 * @ordered
	 */
	protected static final byte RESERVED_BYTE_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getReservedByte() <em>Reserved Byte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedByte()
	 * @generated
	 * @ordered
	 */
	protected byte reservedByte = RESERVED_BYTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getArpeggiatorControl() <em>Arpeggiator Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArpeggiatorControl()
	 * @generated
	 * @ordered
	 */
	protected static final ArpeggiatorControl ARPEGGIATOR_CONTROL_EDEFAULT = ArpeggiatorControl.NORMAL;

	/**
	 * The cached value of the '{@link #getArpeggiatorControl() <em>Arpeggiator Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArpeggiatorControl()
	 * @generated
	 * @ordered
	 */
	protected ArpeggiatorControl arpeggiatorControl = ARPEGGIATOR_CONTROL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAudioInMode() <em>Audio In Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudioInMode()
	 * @generated
	 * @ordered
	 */
	protected static final AudioInMode AUDIO_IN_MODE_EDEFAULT = AudioInMode.MONO;

	/**
	 * The cached value of the '{@link #getAudioInMode() <em>Audio In Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudioInMode()
	 * @generated
	 * @ordered
	 */
	protected AudioInMode audioInMode = AUDIO_IN_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMidiClock() <em>Midi Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMidiClock()
	 * @generated
	 * @ordered
	 */
	protected static final MidiClock MIDI_CLOCK_EDEFAULT = MidiClock.INT;

	/**
	 * The cached value of the '{@link #getMidiClock() <em>Midi Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMidiClock()
	 * @generated
	 * @ordered
	 */
	protected MidiClock midiClock = MIDI_CLOCK_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoteMessageEnabled() <em>Note Message Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteMessageEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final EnabledFlag NOTE_MESSAGE_ENABLED_EDEFAULT = EnabledFlag.DISABLED;

	/**
	 * The cached value of the '{@link #getNoteMessageEnabled() <em>Note Message Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteMessageEnabled()
	 * @generated
	 * @ordered
	 */
	protected EnabledFlag noteMessageEnabled = NOTE_MESSAGE_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemExEnabled() <em>System Ex Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemExEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final EnabledFlag SYSTEM_EX_ENABLED_EDEFAULT = EnabledFlag.DISABLED;

	/**
	 * The cached value of the '{@link #getSystemExEnabled() <em>System Ex Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemExEnabled()
	 * @generated
	 * @ordered
	 */
	protected EnabledFlag systemExEnabled = SYSTEM_EX_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getControlChangeEnabled() <em>Control Change Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlChangeEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final EnabledFlag CONTROL_CHANGE_ENABLED_EDEFAULT = EnabledFlag.DISABLED;

	/**
	 * The cached value of the '{@link #getControlChangeEnabled() <em>Control Change Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlChangeEnabled()
	 * @generated
	 * @ordered
	 */
	protected EnabledFlag controlChangeEnabled = CONTROL_CHANGE_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getProgramChangeEnabled() <em>Program Change Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramChangeEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final EnabledFlag PROGRAM_CHANGE_ENABLED_EDEFAULT = EnabledFlag.DISABLED;

	/**
	 * The cached value of the '{@link #getProgramChangeEnabled() <em>Program Change Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramChangeEnabled()
	 * @generated
	 * @ordered
	 */
	protected EnabledFlag programChangeEnabled = PROGRAM_CHANGE_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getReservedBitsAfterProgramChangeEnabled() <em>Reserved Bits After Program Change Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedBitsAfterProgramChangeEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final byte RESERVED_BITS_AFTER_PROGRAM_CHANGE_ENABLED_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getReservedBitsAfterProgramChangeEnabled() <em>Reserved Bits After Program Change Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedBitsAfterProgramChangeEnabled()
	 * @generated
	 * @ordered
	 */
	protected byte reservedBitsAfterProgramChangeEnabled = RESERVED_BITS_AFTER_PROGRAM_CHANGE_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPitchBendRange() <em>Pitch Bend Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPitchBendRange()
	 * @generated
	 * @ordered
	 */
	protected static final PitchBendRange PITCH_BEND_RANGE_EDEFAULT = PitchBendRange.PITCH_BEND_N12;

	/**
	 * The cached value of the '{@link #getPitchBendRange() <em>Pitch Bend Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPitchBendRange()
	 * @generated
	 * @ordered
	 */
	protected PitchBendRange pitchBendRange = PITCH_BEND_RANGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMidiChannels() <em>Midi Channels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMidiChannels()
	 * @generated
	 * @ordered
	 */
	protected EList<MidiChannelType> midiChannels;

	/**
	 * The cached value of the '{@link #getPartNoteNumbers() <em>Part Note Numbers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartNoteNumbers()
	 * @generated
	 * @ordered
	 */
	protected EList<PartNoteNumber> partNoteNumbers;

	/**
	 * The cached value of the '{@link #getMidiControlChangeAssignments() <em>Midi Control Change Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMidiControlChangeAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<MidiControlChangeAssignment> midiControlChangeAssignments;

	/**
	 * The default value of the '{@link #getReservedLong() <em>Reserved Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedLong()
	 * @generated
	 * @ordered
	 */
	protected static final long RESERVED_LONG_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getReservedLong() <em>Reserved Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedLong()
	 * @generated
	 * @ordered
	 */
	protected long reservedLong = RESERVED_LONG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPatternSetParameters() <em>Pattern Set Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternSetParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<PatternSetParameter> patternSetParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalParametersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void init(byte[] b) {
		ExtendedByteBuffer in = new ExtendedByteBuffer(b);
		// byte 0
		this.setMemoryProtectEnabled(EnabledFlag.get(in.getByte()));
		// byte 1
		this.setReservedByte(in.getByte());
		// byte 2
		this.setArpeggiatorControl(ArpeggiatorControl.get(in.getByte()));
		// byte 3
		this.setAudioInMode(AudioInMode.get(in.getByte()));
		// byte 4
		this.setMidiClock(MidiClock.get(in.getByte()));
		// byte 5
		int packedByte5 = in.getUnsignedByte();
		this.setNoteMessageEnabled(EnabledFlag.get(EsxUtil.unpackInt(packedByte5, 1, 0)));
		this.setSystemExEnabled(EnabledFlag.get(EsxUtil.unpackInt(packedByte5, 1, 1)));
		this.setControlChangeEnabled(EnabledFlag.get(EsxUtil.unpackInt(packedByte5, 1, 2)));
		this.setProgramChangeEnabled(EnabledFlag.get(EsxUtil.unpackInt(packedByte5, 1, 3)));
		this.setReservedBitsAfterProgramChangeEnabled((byte) EsxUtil.unpackInt(packedByte5, 4, 4));
		// byte 6
		this.setPitchBendRange(PitchBendRange.get(in.getByte()));
		// bytes 7~9 (1 byte each)
		for (int i = 0; i < EsxUtil.NUM_MIDI_CHANNELS; i++) {
			MidiChannelType midiChannelType = EsxFactory.eINSTANCE.createMidiChannelType();
			midiChannelType.setName(MidiChannelTypeName.get(i));
			midiChannelType.setMidiChannel(MidiChannel.get(in.getByte()));
			this.getMidiChannels().add(i, midiChannelType);
		}
		// bytes 10~22 (1 byte each)
		for (int i = 0; i < EsxUtil.NUM_PART_NOTE_NUMBERS; i++) {
			PartNoteNumber partNoteNumber = EsxFactory.eINSTANCE.createPartNoteNumber();
			partNoteNumber.setName(PartNoteNumberName.get(i));
			partNoteNumber.setNoteNumber(NoteNumber.get(in.getByte()));
			this.getPartNoteNumbers().add(i, partNoteNumber);
		}
		// bytes 23~55 (1 byte each)
		for (int i = 0; i < EsxUtil.NUM_MIDI_CONTROL_CHANGE_ASSIGNMENTS; i++) {
			MidiControlChangeAssignment midiControlChangeAssignment = EsxFactory.eINSTANCE.createMidiControlChangeAssignment();
			midiControlChangeAssignment.setName(MidiControlChangeAssignmentName.get(i));
			midiControlChangeAssignment.setValue(in.getByte());
			this.getMidiControlChangeAssignments().add(i, midiControlChangeAssignment);
		}
		// bytes 56~63
		this.setReservedLong(in.getLong());
		// bytes 64~191 (1 byte each)
		for (int i = 0; i < EsxUtil.NUM_PATTERN_SET_PARAMETERS; i++) {
			PatternSetParameter patternSetParameter = EsxFactory.eINSTANCE.createPatternSetParameter();
			patternSetParameter.setPatternNumber(PatternNumber.get(in.getUnsignedByte()));
			this.getPatternSetParameters().add(i, patternSetParameter);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsxPackage.Literals.GLOBAL_PARAMETERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnabledFlag getMemoryProtectEnabled() {
		return memoryProtectEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryProtectEnabled(EnabledFlag newMemoryProtectEnabled) {
		EnabledFlag oldMemoryProtectEnabled = memoryProtectEnabled;
		memoryProtectEnabled = newMemoryProtectEnabled == null ? MEMORY_PROTECT_ENABLED_EDEFAULT : newMemoryProtectEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.GLOBAL_PARAMETERS__MEMORY_PROTECT_ENABLED, oldMemoryProtectEnabled, memoryProtectEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getReservedByte() {
		return reservedByte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservedByte(byte newReservedByte) {
		byte oldReservedByte = reservedByte;
		reservedByte = newReservedByte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.GLOBAL_PARAMETERS__RESERVED_BYTE, oldReservedByte, reservedByte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArpeggiatorControl getArpeggiatorControl() {
		return arpeggiatorControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArpeggiatorControl(ArpeggiatorControl newArpeggiatorControl) {
		ArpeggiatorControl oldArpeggiatorControl = arpeggiatorControl;
		arpeggiatorControl = newArpeggiatorControl == null ? ARPEGGIATOR_CONTROL_EDEFAULT : newArpeggiatorControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.GLOBAL_PARAMETERS__ARPEGGIATOR_CONTROL, oldArpeggiatorControl, arpeggiatorControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioInMode getAudioInMode() {
		return audioInMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAudioInMode(AudioInMode newAudioInMode) {
		AudioInMode oldAudioInMode = audioInMode;
		audioInMode = newAudioInMode == null ? AUDIO_IN_MODE_EDEFAULT : newAudioInMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.GLOBAL_PARAMETERS__AUDIO_IN_MODE, oldAudioInMode, audioInMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MidiClock getMidiClock() {
		return midiClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMidiClock(MidiClock newMidiClock) {
		MidiClock oldMidiClock = midiClock;
		midiClock = newMidiClock == null ? MIDI_CLOCK_EDEFAULT : newMidiClock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.GLOBAL_PARAMETERS__MIDI_CLOCK, oldMidiClock, midiClock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnabledFlag getNoteMessageEnabled() {
		return noteMessageEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoteMessageEnabled(EnabledFlag newNoteMessageEnabled) {
		EnabledFlag oldNoteMessageEnabled = noteMessageEnabled;
		noteMessageEnabled = newNoteMessageEnabled == null ? NOTE_MESSAGE_ENABLED_EDEFAULT : newNoteMessageEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.GLOBAL_PARAMETERS__NOTE_MESSAGE_ENABLED, oldNoteMessageEnabled, noteMessageEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnabledFlag getSystemExEnabled() {
		return systemExEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemExEnabled(EnabledFlag newSystemExEnabled) {
		EnabledFlag oldSystemExEnabled = systemExEnabled;
		systemExEnabled = newSystemExEnabled == null ? SYSTEM_EX_ENABLED_EDEFAULT : newSystemExEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.GLOBAL_PARAMETERS__SYSTEM_EX_ENABLED, oldSystemExEnabled, systemExEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnabledFlag getControlChangeEnabled() {
		return controlChangeEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlChangeEnabled(EnabledFlag newControlChangeEnabled) {
		EnabledFlag oldControlChangeEnabled = controlChangeEnabled;
		controlChangeEnabled = newControlChangeEnabled == null ? CONTROL_CHANGE_ENABLED_EDEFAULT : newControlChangeEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.GLOBAL_PARAMETERS__CONTROL_CHANGE_ENABLED, oldControlChangeEnabled, controlChangeEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnabledFlag getProgramChangeEnabled() {
		return programChangeEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramChangeEnabled(EnabledFlag newProgramChangeEnabled) {
		EnabledFlag oldProgramChangeEnabled = programChangeEnabled;
		programChangeEnabled = newProgramChangeEnabled == null ? PROGRAM_CHANGE_ENABLED_EDEFAULT : newProgramChangeEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.GLOBAL_PARAMETERS__PROGRAM_CHANGE_ENABLED, oldProgramChangeEnabled, programChangeEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getReservedBitsAfterProgramChangeEnabled() {
		return reservedBitsAfterProgramChangeEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservedBitsAfterProgramChangeEnabled(byte newReservedBitsAfterProgramChangeEnabled) {
		byte oldReservedBitsAfterProgramChangeEnabled = reservedBitsAfterProgramChangeEnabled;
		reservedBitsAfterProgramChangeEnabled = newReservedBitsAfterProgramChangeEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.GLOBAL_PARAMETERS__RESERVED_BITS_AFTER_PROGRAM_CHANGE_ENABLED, oldReservedBitsAfterProgramChangeEnabled, reservedBitsAfterProgramChangeEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PitchBendRange getPitchBendRange() {
		return pitchBendRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPitchBendRange(PitchBendRange newPitchBendRange) {
		PitchBendRange oldPitchBendRange = pitchBendRange;
		pitchBendRange = newPitchBendRange == null ? PITCH_BEND_RANGE_EDEFAULT : newPitchBendRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.GLOBAL_PARAMETERS__PITCH_BEND_RANGE, oldPitchBendRange, pitchBendRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MidiChannelType> getMidiChannels() {
		if (midiChannels == null) {
			midiChannels = new EObjectContainmentEList<MidiChannelType>(MidiChannelType.class, this, EsxPackage.GLOBAL_PARAMETERS__MIDI_CHANNELS);
		}
		return midiChannels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PartNoteNumber> getPartNoteNumbers() {
		if (partNoteNumbers == null) {
			partNoteNumbers = new EObjectContainmentEList<PartNoteNumber>(PartNoteNumber.class, this, EsxPackage.GLOBAL_PARAMETERS__PART_NOTE_NUMBERS);
		}
		return partNoteNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MidiControlChangeAssignment> getMidiControlChangeAssignments() {
		if (midiControlChangeAssignments == null) {
			midiControlChangeAssignments = new EObjectContainmentEList<MidiControlChangeAssignment>(MidiControlChangeAssignment.class, this, EsxPackage.GLOBAL_PARAMETERS__MIDI_CONTROL_CHANGE_ASSIGNMENTS);
		}
		return midiControlChangeAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getReservedLong() {
		return reservedLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservedLong(long newReservedLong) {
		long oldReservedLong = reservedLong;
		reservedLong = newReservedLong;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.GLOBAL_PARAMETERS__RESERVED_LONG, oldReservedLong, reservedLong));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatternSetParameter> getPatternSetParameters() {
		if (patternSetParameters == null) {
			patternSetParameters = new EObjectContainmentEList<PatternSetParameter>(PatternSetParameter.class, this, EsxPackage.GLOBAL_PARAMETERS__PATTERN_SET_PARAMETERS);
		}
		return patternSetParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public byte[] toByteArray() {
		ExtendedByteBuffer buf = new ExtendedByteBuffer(EsxUtil.CHUNKSIZE_GLOBAL_PARAMETERS);
		// byte 0
		buf.putUnsignedByte(this.getMemoryProtectEnabled().getValue());
		// byte 1
		buf.putByte(this.getReservedByte());
		// byte 2
		buf.putUnsignedByte(this.getArpeggiatorControl().getValue());
		// byte 3
		buf.putUnsignedByte(this.getAudioInMode().getValue());
		// byte 4
		buf.putUnsignedByte(this.getMidiClock().getValue());
		// byte 5
		int packedByte5 = 0x00;
		packedByte5 = EsxUtil.packInt(packedByte5, this.getNoteMessageEnabled().getValue(), 1, 0);
		packedByte5 = EsxUtil.packInt(packedByte5, this.getSystemExEnabled().getValue(), 1, 1);
		packedByte5 = EsxUtil.packInt(packedByte5, this.getControlChangeEnabled().getValue(), 1, 2);
		packedByte5 = EsxUtil.packInt(packedByte5, this.getProgramChangeEnabled().getValue(), 1, 3);
		packedByte5 = EsxUtil.packInt(packedByte5, this.getReservedBitsAfterProgramChangeEnabled(), 4, 4);
		buf.putUnsignedByte(packedByte5);
		// byte 6
		buf.putUnsignedByte(this.getPitchBendRange().getValue());
		// bytes 7~9 (1 byte each)
		for (int i = 0; i < EsxUtil.NUM_MIDI_CHANNELS; i++) {
			buf.putUnsignedByte(this.getMidiChannels().get(i).getMidiChannel().getValue());
		}
		// bytes 10~22 (1 byte each)
		for (int i = 0; i < EsxUtil.NUM_PART_NOTE_NUMBERS; i++) {
			buf.putUnsignedByte(this.getPartNoteNumbers().get(i).getNoteNumber().getValue());
		}
		// bytes 23~55 (1 byte each)
		for (int i = 0; i < EsxUtil.NUM_MIDI_CONTROL_CHANGE_ASSIGNMENTS; i++) {
			buf.putByte(this.getMidiControlChangeAssignments().get(i).getValue());
		}
		// bytes 56~63
		buf.putLong(this.getReservedLong());
		// bytes 64~191 (1 byte each)
		for (int i = 0; i < EsxUtil.NUM_PATTERN_SET_PARAMETERS; i++) {
			buf.putUnsignedByte(this.getPatternSetParameters().get(i).getPatternNumber().getValue());
		}
		return buf.array();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsxPackage.GLOBAL_PARAMETERS__MIDI_CHANNELS:
				return ((InternalEList<?>)getMidiChannels()).basicRemove(otherEnd, msgs);
			case EsxPackage.GLOBAL_PARAMETERS__PART_NOTE_NUMBERS:
				return ((InternalEList<?>)getPartNoteNumbers()).basicRemove(otherEnd, msgs);
			case EsxPackage.GLOBAL_PARAMETERS__MIDI_CONTROL_CHANGE_ASSIGNMENTS:
				return ((InternalEList<?>)getMidiControlChangeAssignments()).basicRemove(otherEnd, msgs);
			case EsxPackage.GLOBAL_PARAMETERS__PATTERN_SET_PARAMETERS:
				return ((InternalEList<?>)getPatternSetParameters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EsxPackage.GLOBAL_PARAMETERS__MEMORY_PROTECT_ENABLED:
				return getMemoryProtectEnabled();
			case EsxPackage.GLOBAL_PARAMETERS__RESERVED_BYTE:
				return getReservedByte();
			case EsxPackage.GLOBAL_PARAMETERS__ARPEGGIATOR_CONTROL:
				return getArpeggiatorControl();
			case EsxPackage.GLOBAL_PARAMETERS__AUDIO_IN_MODE:
				return getAudioInMode();
			case EsxPackage.GLOBAL_PARAMETERS__MIDI_CLOCK:
				return getMidiClock();
			case EsxPackage.GLOBAL_PARAMETERS__NOTE_MESSAGE_ENABLED:
				return getNoteMessageEnabled();
			case EsxPackage.GLOBAL_PARAMETERS__SYSTEM_EX_ENABLED:
				return getSystemExEnabled();
			case EsxPackage.GLOBAL_PARAMETERS__CONTROL_CHANGE_ENABLED:
				return getControlChangeEnabled();
			case EsxPackage.GLOBAL_PARAMETERS__PROGRAM_CHANGE_ENABLED:
				return getProgramChangeEnabled();
			case EsxPackage.GLOBAL_PARAMETERS__RESERVED_BITS_AFTER_PROGRAM_CHANGE_ENABLED:
				return getReservedBitsAfterProgramChangeEnabled();
			case EsxPackage.GLOBAL_PARAMETERS__PITCH_BEND_RANGE:
				return getPitchBendRange();
			case EsxPackage.GLOBAL_PARAMETERS__MIDI_CHANNELS:
				return getMidiChannels();
			case EsxPackage.GLOBAL_PARAMETERS__PART_NOTE_NUMBERS:
				return getPartNoteNumbers();
			case EsxPackage.GLOBAL_PARAMETERS__MIDI_CONTROL_CHANGE_ASSIGNMENTS:
				return getMidiControlChangeAssignments();
			case EsxPackage.GLOBAL_PARAMETERS__RESERVED_LONG:
				return getReservedLong();
			case EsxPackage.GLOBAL_PARAMETERS__PATTERN_SET_PARAMETERS:
				return getPatternSetParameters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EsxPackage.GLOBAL_PARAMETERS__MEMORY_PROTECT_ENABLED:
				setMemoryProtectEnabled((EnabledFlag)newValue);
				return;
			case EsxPackage.GLOBAL_PARAMETERS__RESERVED_BYTE:
				setReservedByte((Byte)newValue);
				return;
			case EsxPackage.GLOBAL_PARAMETERS__ARPEGGIATOR_CONTROL:
				setArpeggiatorControl((ArpeggiatorControl)newValue);
				return;
			case EsxPackage.GLOBAL_PARAMETERS__AUDIO_IN_MODE:
				setAudioInMode((AudioInMode)newValue);
				return;
			case EsxPackage.GLOBAL_PARAMETERS__MIDI_CLOCK:
				setMidiClock((MidiClock)newValue);
				return;
			case EsxPackage.GLOBAL_PARAMETERS__NOTE_MESSAGE_ENABLED:
				setNoteMessageEnabled((EnabledFlag)newValue);
				return;
			case EsxPackage.GLOBAL_PARAMETERS__SYSTEM_EX_ENABLED:
				setSystemExEnabled((EnabledFlag)newValue);
				return;
			case EsxPackage.GLOBAL_PARAMETERS__CONTROL_CHANGE_ENABLED:
				setControlChangeEnabled((EnabledFlag)newValue);
				return;
			case EsxPackage.GLOBAL_PARAMETERS__PROGRAM_CHANGE_ENABLED:
				setProgramChangeEnabled((EnabledFlag)newValue);
				return;
			case EsxPackage.GLOBAL_PARAMETERS__RESERVED_BITS_AFTER_PROGRAM_CHANGE_ENABLED:
				setReservedBitsAfterProgramChangeEnabled((Byte)newValue);
				return;
			case EsxPackage.GLOBAL_PARAMETERS__PITCH_BEND_RANGE:
				setPitchBendRange((PitchBendRange)newValue);
				return;
			case EsxPackage.GLOBAL_PARAMETERS__MIDI_CHANNELS:
				getMidiChannels().clear();
				getMidiChannels().addAll((Collection<? extends MidiChannelType>)newValue);
				return;
			case EsxPackage.GLOBAL_PARAMETERS__PART_NOTE_NUMBERS:
				getPartNoteNumbers().clear();
				getPartNoteNumbers().addAll((Collection<? extends PartNoteNumber>)newValue);
				return;
			case EsxPackage.GLOBAL_PARAMETERS__MIDI_CONTROL_CHANGE_ASSIGNMENTS:
				getMidiControlChangeAssignments().clear();
				getMidiControlChangeAssignments().addAll((Collection<? extends MidiControlChangeAssignment>)newValue);
				return;
			case EsxPackage.GLOBAL_PARAMETERS__RESERVED_LONG:
				setReservedLong((Long)newValue);
				return;
			case EsxPackage.GLOBAL_PARAMETERS__PATTERN_SET_PARAMETERS:
				getPatternSetParameters().clear();
				getPatternSetParameters().addAll((Collection<? extends PatternSetParameter>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EsxPackage.GLOBAL_PARAMETERS__MEMORY_PROTECT_ENABLED:
				setMemoryProtectEnabled(MEMORY_PROTECT_ENABLED_EDEFAULT);
				return;
			case EsxPackage.GLOBAL_PARAMETERS__RESERVED_BYTE:
				setReservedByte(RESERVED_BYTE_EDEFAULT);
				return;
			case EsxPackage.GLOBAL_PARAMETERS__ARPEGGIATOR_CONTROL:
				setArpeggiatorControl(ARPEGGIATOR_CONTROL_EDEFAULT);
				return;
			case EsxPackage.GLOBAL_PARAMETERS__AUDIO_IN_MODE:
				setAudioInMode(AUDIO_IN_MODE_EDEFAULT);
				return;
			case EsxPackage.GLOBAL_PARAMETERS__MIDI_CLOCK:
				setMidiClock(MIDI_CLOCK_EDEFAULT);
				return;
			case EsxPackage.GLOBAL_PARAMETERS__NOTE_MESSAGE_ENABLED:
				setNoteMessageEnabled(NOTE_MESSAGE_ENABLED_EDEFAULT);
				return;
			case EsxPackage.GLOBAL_PARAMETERS__SYSTEM_EX_ENABLED:
				setSystemExEnabled(SYSTEM_EX_ENABLED_EDEFAULT);
				return;
			case EsxPackage.GLOBAL_PARAMETERS__CONTROL_CHANGE_ENABLED:
				setControlChangeEnabled(CONTROL_CHANGE_ENABLED_EDEFAULT);
				return;
			case EsxPackage.GLOBAL_PARAMETERS__PROGRAM_CHANGE_ENABLED:
				setProgramChangeEnabled(PROGRAM_CHANGE_ENABLED_EDEFAULT);
				return;
			case EsxPackage.GLOBAL_PARAMETERS__RESERVED_BITS_AFTER_PROGRAM_CHANGE_ENABLED:
				setReservedBitsAfterProgramChangeEnabled(RESERVED_BITS_AFTER_PROGRAM_CHANGE_ENABLED_EDEFAULT);
				return;
			case EsxPackage.GLOBAL_PARAMETERS__PITCH_BEND_RANGE:
				setPitchBendRange(PITCH_BEND_RANGE_EDEFAULT);
				return;
			case EsxPackage.GLOBAL_PARAMETERS__MIDI_CHANNELS:
				getMidiChannels().clear();
				return;
			case EsxPackage.GLOBAL_PARAMETERS__PART_NOTE_NUMBERS:
				getPartNoteNumbers().clear();
				return;
			case EsxPackage.GLOBAL_PARAMETERS__MIDI_CONTROL_CHANGE_ASSIGNMENTS:
				getMidiControlChangeAssignments().clear();
				return;
			case EsxPackage.GLOBAL_PARAMETERS__RESERVED_LONG:
				setReservedLong(RESERVED_LONG_EDEFAULT);
				return;
			case EsxPackage.GLOBAL_PARAMETERS__PATTERN_SET_PARAMETERS:
				getPatternSetParameters().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EsxPackage.GLOBAL_PARAMETERS__MEMORY_PROTECT_ENABLED:
				return memoryProtectEnabled != MEMORY_PROTECT_ENABLED_EDEFAULT;
			case EsxPackage.GLOBAL_PARAMETERS__RESERVED_BYTE:
				return reservedByte != RESERVED_BYTE_EDEFAULT;
			case EsxPackage.GLOBAL_PARAMETERS__ARPEGGIATOR_CONTROL:
				return arpeggiatorControl != ARPEGGIATOR_CONTROL_EDEFAULT;
			case EsxPackage.GLOBAL_PARAMETERS__AUDIO_IN_MODE:
				return audioInMode != AUDIO_IN_MODE_EDEFAULT;
			case EsxPackage.GLOBAL_PARAMETERS__MIDI_CLOCK:
				return midiClock != MIDI_CLOCK_EDEFAULT;
			case EsxPackage.GLOBAL_PARAMETERS__NOTE_MESSAGE_ENABLED:
				return noteMessageEnabled != NOTE_MESSAGE_ENABLED_EDEFAULT;
			case EsxPackage.GLOBAL_PARAMETERS__SYSTEM_EX_ENABLED:
				return systemExEnabled != SYSTEM_EX_ENABLED_EDEFAULT;
			case EsxPackage.GLOBAL_PARAMETERS__CONTROL_CHANGE_ENABLED:
				return controlChangeEnabled != CONTROL_CHANGE_ENABLED_EDEFAULT;
			case EsxPackage.GLOBAL_PARAMETERS__PROGRAM_CHANGE_ENABLED:
				return programChangeEnabled != PROGRAM_CHANGE_ENABLED_EDEFAULT;
			case EsxPackage.GLOBAL_PARAMETERS__RESERVED_BITS_AFTER_PROGRAM_CHANGE_ENABLED:
				return reservedBitsAfterProgramChangeEnabled != RESERVED_BITS_AFTER_PROGRAM_CHANGE_ENABLED_EDEFAULT;
			case EsxPackage.GLOBAL_PARAMETERS__PITCH_BEND_RANGE:
				return pitchBendRange != PITCH_BEND_RANGE_EDEFAULT;
			case EsxPackage.GLOBAL_PARAMETERS__MIDI_CHANNELS:
				return midiChannels != null && !midiChannels.isEmpty();
			case EsxPackage.GLOBAL_PARAMETERS__PART_NOTE_NUMBERS:
				return partNoteNumbers != null && !partNoteNumbers.isEmpty();
			case EsxPackage.GLOBAL_PARAMETERS__MIDI_CONTROL_CHANGE_ASSIGNMENTS:
				return midiControlChangeAssignments != null && !midiControlChangeAssignments.isEmpty();
			case EsxPackage.GLOBAL_PARAMETERS__RESERVED_LONG:
				return reservedLong != RESERVED_LONG_EDEFAULT;
			case EsxPackage.GLOBAL_PARAMETERS__PATTERN_SET_PARAMETERS:
				return patternSetParameters != null && !patternSetParameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (memoryProtectEnabled: ");
		result.append(memoryProtectEnabled);
		result.append(", reservedByte: ");
		result.append(reservedByte);
		result.append(", arpeggiatorControl: ");
		result.append(arpeggiatorControl);
		result.append(", audioInMode: ");
		result.append(audioInMode);
		result.append(", midiClock: ");
		result.append(midiClock);
		result.append(", noteMessageEnabled: ");
		result.append(noteMessageEnabled);
		result.append(", systemExEnabled: ");
		result.append(systemExEnabled);
		result.append(", controlChangeEnabled: ");
		result.append(controlChangeEnabled);
		result.append(", programChangeEnabled: ");
		result.append(programChangeEnabled);
		result.append(", reservedBitsAfterProgramChangeEnabled: ");
		result.append(reservedBitsAfterProgramChangeEnabled);
		result.append(", pitchBendRange: ");
		result.append(pitchBendRange);
		result.append(", reservedLong: ");
		result.append(reservedLong);
		result.append(')');
		return result.toString();
	}

} //GlobalParametersImpl

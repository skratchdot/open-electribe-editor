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
package com.skratchdot.electribe.model.esx;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.GlobalParameters#getMemoryProtectEnabled <em>Memory Protect Enabled</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.GlobalParameters#getReservedByte <em>Reserved Byte</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.GlobalParameters#getArpeggiatorControl <em>Arpeggiator Control</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.GlobalParameters#getAudioInMode <em>Audio In Mode</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.GlobalParameters#getMidiClock <em>Midi Clock</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.GlobalParameters#getNoteMessageEnabled <em>Note Message Enabled</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.GlobalParameters#getSystemExEnabled <em>System Ex Enabled</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.GlobalParameters#getControlChangeEnabled <em>Control Change Enabled</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.GlobalParameters#getProgramChangeEnabled <em>Program Change Enabled</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.GlobalParameters#getReservedBitsAfterProgramChangeEnabled <em>Reserved Bits After Program Change Enabled</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.GlobalParameters#getPitchBendRange <em>Pitch Bend Range</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.GlobalParameters#getMidiChannels <em>Midi Channels</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.GlobalParameters#getPartNoteNumbers <em>Part Note Numbers</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.GlobalParameters#getMidiControlChangeAssignments <em>Midi Control Change Assignments</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.GlobalParameters#getReservedLong <em>Reserved Long</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.GlobalParameters#getPatternSetParameters <em>Pattern Set Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getGlobalParameters()
 * @model
 * @generated
 */
public interface GlobalParameters extends EObject {
	/**
	 * Returns the value of the '<em><b>Memory Protect Enabled</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.EnabledFlag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Protect Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Protect Enabled</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EnabledFlag
	 * @see #setMemoryProtectEnabled(EnabledFlag)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getGlobalParameters_MemoryProtectEnabled()
	 * @model
	 * @generated
	 */
	EnabledFlag getMemoryProtectEnabled();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.GlobalParameters#getMemoryProtectEnabled <em>Memory Protect Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Protect Enabled</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EnabledFlag
	 * @see #getMemoryProtectEnabled()
	 * @generated
	 */
	void setMemoryProtectEnabled(EnabledFlag value);

	/**
	 * Returns the value of the '<em><b>Reserved Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserved Byte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserved Byte</em>' attribute.
	 * @see #setReservedByte(byte)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getGlobalParameters_ReservedByte()
	 * @model
	 * @generated
	 */
	byte getReservedByte();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.GlobalParameters#getReservedByte <em>Reserved Byte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved Byte</em>' attribute.
	 * @see #getReservedByte()
	 * @generated
	 */
	void setReservedByte(byte value);

	/**
	 * Returns the value of the '<em><b>Arpeggiator Control</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.ArpeggiatorControl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arpeggiator Control</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arpeggiator Control</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.ArpeggiatorControl
	 * @see #setArpeggiatorControl(ArpeggiatorControl)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getGlobalParameters_ArpeggiatorControl()
	 * @model
	 * @generated
	 */
	ArpeggiatorControl getArpeggiatorControl();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.GlobalParameters#getArpeggiatorControl <em>Arpeggiator Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arpeggiator Control</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.ArpeggiatorControl
	 * @see #getArpeggiatorControl()
	 * @generated
	 */
	void setArpeggiatorControl(ArpeggiatorControl value);

	/**
	 * Returns the value of the '<em><b>Audio In Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.AudioInMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Audio In Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audio In Mode</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.AudioInMode
	 * @see #setAudioInMode(AudioInMode)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getGlobalParameters_AudioInMode()
	 * @model
	 * @generated
	 */
	AudioInMode getAudioInMode();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.GlobalParameters#getAudioInMode <em>Audio In Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audio In Mode</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.AudioInMode
	 * @see #getAudioInMode()
	 * @generated
	 */
	void setAudioInMode(AudioInMode value);

	/**
	 * Returns the value of the '<em><b>Midi Clock</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.MidiClock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Midi Clock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Midi Clock</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.MidiClock
	 * @see #setMidiClock(MidiClock)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getGlobalParameters_MidiClock()
	 * @model
	 * @generated
	 */
	MidiClock getMidiClock();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.GlobalParameters#getMidiClock <em>Midi Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Midi Clock</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.MidiClock
	 * @see #getMidiClock()
	 * @generated
	 */
	void setMidiClock(MidiClock value);

	/**
	 * Returns the value of the '<em><b>Note Message Enabled</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.EnabledFlag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note Message Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note Message Enabled</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EnabledFlag
	 * @see #setNoteMessageEnabled(EnabledFlag)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getGlobalParameters_NoteMessageEnabled()
	 * @model
	 * @generated
	 */
	EnabledFlag getNoteMessageEnabled();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.GlobalParameters#getNoteMessageEnabled <em>Note Message Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note Message Enabled</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EnabledFlag
	 * @see #getNoteMessageEnabled()
	 * @generated
	 */
	void setNoteMessageEnabled(EnabledFlag value);

	/**
	 * Returns the value of the '<em><b>System Ex Enabled</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.EnabledFlag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Ex Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Ex Enabled</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EnabledFlag
	 * @see #setSystemExEnabled(EnabledFlag)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getGlobalParameters_SystemExEnabled()
	 * @model
	 * @generated
	 */
	EnabledFlag getSystemExEnabled();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.GlobalParameters#getSystemExEnabled <em>System Ex Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Ex Enabled</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EnabledFlag
	 * @see #getSystemExEnabled()
	 * @generated
	 */
	void setSystemExEnabled(EnabledFlag value);

	/**
	 * Returns the value of the '<em><b>Control Change Enabled</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.EnabledFlag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Change Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Change Enabled</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EnabledFlag
	 * @see #setControlChangeEnabled(EnabledFlag)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getGlobalParameters_ControlChangeEnabled()
	 * @model
	 * @generated
	 */
	EnabledFlag getControlChangeEnabled();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.GlobalParameters#getControlChangeEnabled <em>Control Change Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Change Enabled</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EnabledFlag
	 * @see #getControlChangeEnabled()
	 * @generated
	 */
	void setControlChangeEnabled(EnabledFlag value);

	/**
	 * Returns the value of the '<em><b>Program Change Enabled</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.EnabledFlag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program Change Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Change Enabled</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EnabledFlag
	 * @see #setProgramChangeEnabled(EnabledFlag)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getGlobalParameters_ProgramChangeEnabled()
	 * @model
	 * @generated
	 */
	EnabledFlag getProgramChangeEnabled();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.GlobalParameters#getProgramChangeEnabled <em>Program Change Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Change Enabled</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EnabledFlag
	 * @see #getProgramChangeEnabled()
	 * @generated
	 */
	void setProgramChangeEnabled(EnabledFlag value);

	/**
	 * Returns the value of the '<em><b>Reserved Bits After Program Change Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserved Bits After Program Change Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserved Bits After Program Change Enabled</em>' attribute.
	 * @see #setReservedBitsAfterProgramChangeEnabled(byte)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getGlobalParameters_ReservedBitsAfterProgramChangeEnabled()
	 * @model
	 * @generated
	 */
	byte getReservedBitsAfterProgramChangeEnabled();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.GlobalParameters#getReservedBitsAfterProgramChangeEnabled <em>Reserved Bits After Program Change Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved Bits After Program Change Enabled</em>' attribute.
	 * @see #getReservedBitsAfterProgramChangeEnabled()
	 * @generated
	 */
	void setReservedBitsAfterProgramChangeEnabled(byte value);

	/**
	 * Returns the value of the '<em><b>Pitch Bend Range</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.PitchBendRange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pitch Bend Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pitch Bend Range</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.PitchBendRange
	 * @see #setPitchBendRange(PitchBendRange)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getGlobalParameters_PitchBendRange()
	 * @model
	 * @generated
	 */
	PitchBendRange getPitchBendRange();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.GlobalParameters#getPitchBendRange <em>Pitch Bend Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pitch Bend Range</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.PitchBendRange
	 * @see #getPitchBendRange()
	 * @generated
	 */
	void setPitchBendRange(PitchBendRange value);

	/**
	 * Returns the value of the '<em><b>Midi Channels</b></em>' containment reference list.
	 * The list contents are of type {@link com.skratchdot.electribe.model.esx.MidiChannelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Midi Channels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Midi Channels</em>' containment reference list.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getGlobalParameters_MidiChannels()
	 * @model containment="true" lower="3" upper="3"
	 * @generated
	 */
	EList<MidiChannelType> getMidiChannels();

	/**
	 * Returns the value of the '<em><b>Part Note Numbers</b></em>' containment reference list.
	 * The list contents are of type {@link com.skratchdot.electribe.model.esx.PartNoteNumber}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Note Numbers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Note Numbers</em>' containment reference list.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getGlobalParameters_PartNoteNumbers()
	 * @model containment="true" lower="13" upper="13"
	 * @generated
	 */
	EList<PartNoteNumber> getPartNoteNumbers();

	/**
	 * Returns the value of the '<em><b>Midi Control Change Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link com.skratchdot.electribe.model.esx.MidiControlChangeAssignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Midi Control Change Assignments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Midi Control Change Assignments</em>' containment reference list.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getGlobalParameters_MidiControlChangeAssignments()
	 * @model containment="true" lower="33" upper="33"
	 * @generated
	 */
	EList<MidiControlChangeAssignment> getMidiControlChangeAssignments();

	/**
	 * Returns the value of the '<em><b>Reserved Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserved Long</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserved Long</em>' attribute.
	 * @see #setReservedLong(long)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getGlobalParameters_ReservedLong()
	 * @model
	 * @generated
	 */
	long getReservedLong();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.GlobalParameters#getReservedLong <em>Reserved Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved Long</em>' attribute.
	 * @see #getReservedLong()
	 * @generated
	 */
	void setReservedLong(long value);

	/**
	 * Returns the value of the '<em><b>Pattern Set Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link com.skratchdot.electribe.model.esx.PatternSetParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Set Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Set Parameters</em>' containment reference list.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getGlobalParameters_PatternSetParameters()
	 * @model containment="true" lower="128" upper="128"
	 * @generated
	 */
	EList<PatternSetParameter> getPatternSetParameters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void init(byte[] b);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	byte[] toByteArray();

} // GlobalParameters

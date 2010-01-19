/**
 * Copyright (c) 2009-2010 SKRATCHDOT.COM
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

import java.io.IOException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import com.skratchdot.electribe.model.esx.util.EsxException;
import com.skratchdot.electribe.model.esx.util.EsxRandomAccess;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.Pattern#getName <em>Name</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Pattern#getTempo <em>Tempo</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Pattern#getSwing <em>Swing</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Pattern#getPatternLength <em>Pattern Length</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Pattern#getReservedBitAfterPatternLength <em>Reserved Bit After Pattern Length</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Pattern#getBeat <em>Beat</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Pattern#getRollType <em>Roll Type</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Pattern#getFxChain <em>Fx Chain</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Pattern#getLastStep <em>Last Step</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Pattern#getArpeggiatorScale <em>Arpeggiator Scale</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Pattern#getReservedBitsAfterArpeggiatorScale <em>Reserved Bits After Arpeggiator Scale</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Pattern#getArpeggiatorCenterNote <em>Arpeggiator Center Note</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Pattern#getMuteStatus <em>Mute Status</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Pattern#getSwingStatus <em>Swing Status</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Pattern#getOutputBusStatus <em>Output Bus Status</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Pattern#getAccentStatus <em>Accent Status</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Pattern#getDrumParts <em>Drum Parts</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Pattern#getKeyboardParts <em>Keyboard Parts</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Pattern#getStretchSliceParts <em>Stretch Slice Parts</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Pattern#getAudioInPart <em>Audio In Part</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Pattern#getAccentPart <em>Accent Part</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Pattern#getFxParameters <em>Fx Parameters</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Pattern#getMotionParameters <em>Motion Parameters</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Pattern#isBeingUsed <em>Being Used</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Pattern#getPatternNumberOriginal <em>Pattern Number Original</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Pattern#getPatternNumberCurrent <em>Pattern Number Current</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPattern()
 * @model
 * @generated
 */
public interface Pattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPattern_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Pattern#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tempo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tempo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tempo</em>' containment reference.
	 * @see #setTempo(Tempo)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPattern_Tempo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Tempo getTempo();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Pattern#getTempo <em>Tempo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tempo</em>' containment reference.
	 * @see #getTempo()
	 * @generated
	 */
	void setTempo(Tempo value);

	/**
	 * Returns the value of the '<em><b>Swing</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.Swing}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swing</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.Swing
	 * @see #setSwing(Swing)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPattern_Swing()
	 * @model
	 * @generated
	 */
	Swing getSwing();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Pattern#getSwing <em>Swing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swing</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.Swing
	 * @see #getSwing()
	 * @generated
	 */
	void setSwing(Swing value);

	/**
	 * Returns the value of the '<em><b>Pattern Length</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.PatternLength}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Length</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.PatternLength
	 * @see #setPatternLength(PatternLength)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPattern_PatternLength()
	 * @model
	 * @generated
	 */
	PatternLength getPatternLength();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Pattern#getPatternLength <em>Pattern Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Length</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.PatternLength
	 * @see #getPatternLength()
	 * @generated
	 */
	void setPatternLength(PatternLength value);

	/**
	 * Returns the value of the '<em><b>Reserved Bit After Pattern Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserved Bit After Pattern Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserved Bit After Pattern Length</em>' attribute.
	 * @see #setReservedBitAfterPatternLength(byte)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPattern_ReservedBitAfterPatternLength()
	 * @model
	 * @generated
	 */
	byte getReservedBitAfterPatternLength();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Pattern#getReservedBitAfterPatternLength <em>Reserved Bit After Pattern Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved Bit After Pattern Length</em>' attribute.
	 * @see #getReservedBitAfterPatternLength()
	 * @generated
	 */
	void setReservedBitAfterPatternLength(byte value);

	/**
	 * Returns the value of the '<em><b>Beat</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.Beat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beat</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.Beat
	 * @see #setBeat(Beat)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPattern_Beat()
	 * @model
	 * @generated
	 */
	Beat getBeat();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Pattern#getBeat <em>Beat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beat</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.Beat
	 * @see #getBeat()
	 * @generated
	 */
	void setBeat(Beat value);

	/**
	 * Returns the value of the '<em><b>Roll Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.RollType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roll Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roll Type</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.RollType
	 * @see #setRollType(RollType)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPattern_RollType()
	 * @model
	 * @generated
	 */
	RollType getRollType();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Pattern#getRollType <em>Roll Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roll Type</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.RollType
	 * @see #getRollType()
	 * @generated
	 */
	void setRollType(RollType value);

	/**
	 * Returns the value of the '<em><b>Fx Chain</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.FxChain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fx Chain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fx Chain</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.FxChain
	 * @see #setFxChain(FxChain)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPattern_FxChain()
	 * @model
	 * @generated
	 */
	FxChain getFxChain();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Pattern#getFxChain <em>Fx Chain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fx Chain</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.FxChain
	 * @see #getFxChain()
	 * @generated
	 */
	void setFxChain(FxChain value);

	/**
	 * Returns the value of the '<em><b>Last Step</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.LastStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Step</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.LastStep
	 * @see #setLastStep(LastStep)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPattern_LastStep()
	 * @model
	 * @generated
	 */
	LastStep getLastStep();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Pattern#getLastStep <em>Last Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Step</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.LastStep
	 * @see #getLastStep()
	 * @generated
	 */
	void setLastStep(LastStep value);

	/**
	 * Returns the value of the '<em><b>Arpeggiator Scale</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.ArpeggiatorScale}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arpeggiator Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arpeggiator Scale</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.ArpeggiatorScale
	 * @see #setArpeggiatorScale(ArpeggiatorScale)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPattern_ArpeggiatorScale()
	 * @model
	 * @generated
	 */
	ArpeggiatorScale getArpeggiatorScale();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Pattern#getArpeggiatorScale <em>Arpeggiator Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arpeggiator Scale</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.ArpeggiatorScale
	 * @see #getArpeggiatorScale()
	 * @generated
	 */
	void setArpeggiatorScale(ArpeggiatorScale value);

	/**
	 * Returns the value of the '<em><b>Reserved Bits After Arpeggiator Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserved Bits After Arpeggiator Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserved Bits After Arpeggiator Scale</em>' attribute.
	 * @see #setReservedBitsAfterArpeggiatorScale(byte)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPattern_ReservedBitsAfterArpeggiatorScale()
	 * @model
	 * @generated
	 */
	byte getReservedBitsAfterArpeggiatorScale();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Pattern#getReservedBitsAfterArpeggiatorScale <em>Reserved Bits After Arpeggiator Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved Bits After Arpeggiator Scale</em>' attribute.
	 * @see #getReservedBitsAfterArpeggiatorScale()
	 * @generated
	 */
	void setReservedBitsAfterArpeggiatorScale(byte value);

	/**
	 * Returns the value of the '<em><b>Arpeggiator Center Note</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.NoteNumber}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arpeggiator Center Note</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arpeggiator Center Note</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.NoteNumber
	 * @see #setArpeggiatorCenterNote(NoteNumber)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPattern_ArpeggiatorCenterNote()
	 * @model
	 * @generated
	 */
	NoteNumber getArpeggiatorCenterNote();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Pattern#getArpeggiatorCenterNote <em>Arpeggiator Center Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arpeggiator Center Note</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.NoteNumber
	 * @see #getArpeggiatorCenterNote()
	 * @generated
	 */
	void setArpeggiatorCenterNote(NoteNumber value);

	/**
	 * Returns the value of the '<em><b>Mute Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mute Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mute Status</em>' attribute.
	 * @see #setMuteStatus(short)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPattern_MuteStatus()
	 * @model
	 * @generated
	 */
	short getMuteStatus();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Pattern#getMuteStatus <em>Mute Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mute Status</em>' attribute.
	 * @see #getMuteStatus()
	 * @generated
	 */
	void setMuteStatus(short value);

	/**
	 * Returns the value of the '<em><b>Swing Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swing Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swing Status</em>' attribute.
	 * @see #setSwingStatus(short)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPattern_SwingStatus()
	 * @model
	 * @generated
	 */
	short getSwingStatus();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Pattern#getSwingStatus <em>Swing Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swing Status</em>' attribute.
	 * @see #getSwingStatus()
	 * @generated
	 */
	void setSwingStatus(short value);

	/**
	 * Returns the value of the '<em><b>Output Bus Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Bus Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Bus Status</em>' attribute.
	 * @see #setOutputBusStatus(short)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPattern_OutputBusStatus()
	 * @model
	 * @generated
	 */
	short getOutputBusStatus();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Pattern#getOutputBusStatus <em>Output Bus Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Bus Status</em>' attribute.
	 * @see #getOutputBusStatus()
	 * @generated
	 */
	void setOutputBusStatus(short value);

	/**
	 * Returns the value of the '<em><b>Accent Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accent Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accent Status</em>' attribute.
	 * @see #setAccentStatus(short)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPattern_AccentStatus()
	 * @model
	 * @generated
	 */
	short getAccentStatus();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Pattern#getAccentStatus <em>Accent Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accent Status</em>' attribute.
	 * @see #getAccentStatus()
	 * @generated
	 */
	void setAccentStatus(short value);

	/**
	 * Returns the value of the '<em><b>Drum Parts</b></em>' containment reference list.
	 * The list contents are of type {@link com.skratchdot.electribe.model.esx.PartDrum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drum Parts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drum Parts</em>' containment reference list.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPattern_DrumParts()
	 * @model containment="true" lower="9" upper="9"
	 * @generated
	 */
	EList<PartDrum> getDrumParts();

	/**
	 * Returns the value of the '<em><b>Keyboard Parts</b></em>' containment reference list.
	 * The list contents are of type {@link com.skratchdot.electribe.model.esx.PartKeyboard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keyboard Parts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyboard Parts</em>' containment reference list.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPattern_KeyboardParts()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<PartKeyboard> getKeyboardParts();

	/**
	 * Returns the value of the '<em><b>Stretch Slice Parts</b></em>' containment reference list.
	 * The list contents are of type {@link com.skratchdot.electribe.model.esx.PartStretchSlice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stretch Slice Parts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stretch Slice Parts</em>' containment reference list.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPattern_StretchSliceParts()
	 * @model containment="true" lower="3" upper="3"
	 * @generated
	 */
	EList<PartStretchSlice> getStretchSliceParts();

	/**
	 * Returns the value of the '<em><b>Audio In Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Audio In Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audio In Part</em>' containment reference.
	 * @see #setAudioInPart(PartAudioIn)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPattern_AudioInPart()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PartAudioIn getAudioInPart();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Pattern#getAudioInPart <em>Audio In Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audio In Part</em>' containment reference.
	 * @see #getAudioInPart()
	 * @generated
	 */
	void setAudioInPart(PartAudioIn value);

	/**
	 * Returns the value of the '<em><b>Accent Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accent Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accent Part</em>' containment reference.
	 * @see #setAccentPart(PartAccent)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPattern_AccentPart()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PartAccent getAccentPart();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Pattern#getAccentPart <em>Accent Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accent Part</em>' containment reference.
	 * @see #getAccentPart()
	 * @generated
	 */
	void setAccentPart(PartAccent value);

	/**
	 * Returns the value of the '<em><b>Fx Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link com.skratchdot.electribe.model.esx.ParametersFx}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fx Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fx Parameters</em>' containment reference list.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPattern_FxParameters()
	 * @model containment="true" lower="3" upper="3"
	 * @generated
	 */
	EList<ParametersFx> getFxParameters();

	/**
	 * Returns the value of the '<em><b>Motion Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link com.skratchdot.electribe.model.esx.ParametersMotion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motion Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motion Parameters</em>' containment reference list.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPattern_MotionParameters()
	 * @model containment="true" lower="24" upper="24"
	 * @generated
	 */
	EList<ParametersMotion> getMotionParameters();

	/**
	 * Returns the value of the '<em><b>Being Used</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Being Used</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Being Used</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPattern_BeingUsed()
	 * @model default="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isBeingUsed();

	/**
	 * Returns the value of the '<em><b>Pattern Number Original</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.PatternNumber}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Number Original</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Number Original</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.PatternNumber
	 * @see #setPatternNumberOriginal(PatternNumber)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPattern_PatternNumberOriginal()
	 * @model default="-1"
	 * @generated
	 */
	PatternNumber getPatternNumberOriginal();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Pattern#getPatternNumberOriginal <em>Pattern Number Original</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Number Original</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.PatternNumber
	 * @see #getPatternNumberOriginal()
	 * @generated
	 */
	void setPatternNumberOriginal(PatternNumber value);

	/**
	 * Returns the value of the '<em><b>Pattern Number Current</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.PatternNumber}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Number Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Number Current</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.PatternNumber
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPattern_PatternNumberCurrent()
	 * @model default="-1" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	PatternNumber getPatternNumberCurrent();

	void write(EsxRandomAccess out, int patternNumber) throws EsxException, IOException;

} // Pattern

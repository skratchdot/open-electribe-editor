/**
 * Copyright (c) 2009, 2012 SKRATCHDOT.COM
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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.skratchdot.electribe.model.esx.ArpeggiatorScale;
import com.skratchdot.electribe.model.esx.Beat;
import com.skratchdot.electribe.model.esx.EsxFactory;
import com.skratchdot.electribe.model.esx.EsxFile;
import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.FxChain;
import com.skratchdot.electribe.model.esx.LastStep;
import com.skratchdot.electribe.model.esx.NoteNumber;
import com.skratchdot.electribe.model.esx.ParametersFx;
import com.skratchdot.electribe.model.esx.ParametersMotion;
import com.skratchdot.electribe.model.esx.PartAccent;
import com.skratchdot.electribe.model.esx.PartAudioIn;
import com.skratchdot.electribe.model.esx.PartDrum;
import com.skratchdot.electribe.model.esx.PartKeyboard;
import com.skratchdot.electribe.model.esx.PartStretchSlice;
import com.skratchdot.electribe.model.esx.Pattern;
import com.skratchdot.electribe.model.esx.PatternLength;
import com.skratchdot.electribe.model.esx.PatternNumber;
import com.skratchdot.electribe.model.esx.RollType;
import com.skratchdot.electribe.model.esx.Swing;
import com.skratchdot.electribe.model.esx.Tempo;
import com.skratchdot.electribe.model.esx.util.EsxUtil;
import com.skratchdot.electribe.model.esx.util.ExtendedByteBuffer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PatternImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PatternImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PatternImpl#getTempo <em>Tempo</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PatternImpl#getSwing <em>Swing</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PatternImpl#getPatternLength <em>Pattern Length</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PatternImpl#getReservedBitAfterPatternLength <em>Reserved Bit After Pattern Length</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PatternImpl#getBeat <em>Beat</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PatternImpl#getRollType <em>Roll Type</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PatternImpl#getFxChain <em>Fx Chain</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PatternImpl#getLastStep <em>Last Step</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PatternImpl#getArpeggiatorScale <em>Arpeggiator Scale</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PatternImpl#getReservedBitsAfterArpeggiatorScale <em>Reserved Bits After Arpeggiator Scale</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PatternImpl#getArpeggiatorCenterNote <em>Arpeggiator Center Note</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PatternImpl#getMuteStatus <em>Mute Status</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PatternImpl#getSwingStatus <em>Swing Status</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PatternImpl#getOutputBusStatus <em>Output Bus Status</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PatternImpl#getAccentStatus <em>Accent Status</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PatternImpl#getDrumParts <em>Drum Parts</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PatternImpl#getKeyboardParts <em>Keyboard Parts</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PatternImpl#getStretchSliceParts <em>Stretch Slice Parts</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PatternImpl#getAudioInPart <em>Audio In Part</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PatternImpl#getAccentPart <em>Accent Part</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PatternImpl#getFxParameters <em>Fx Parameters</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PatternImpl#getMotionParameters <em>Motion Parameters</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PatternImpl#isEmpty <em>Empty</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PatternImpl#getPatternNumberOriginal <em>Pattern Number Original</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PatternImpl#getPatternNumberCurrent <em>Pattern Number Current</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatternImpl extends EObjectImpl implements Pattern {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = "true";

	/**
	 * The cached value of the '{@link #getTempo() <em>Tempo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempo()
	 * @generated
	 * @ordered
	 */
	protected Tempo tempo;

	/**
	 * The default value of the '{@link #getSwing() <em>Swing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwing()
	 * @generated
	 * @ordered
	 */
	protected static final Swing SWING_EDEFAULT = Swing.PERCENT_50;

	/**
	 * The cached value of the '{@link #getSwing() <em>Swing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwing()
	 * @generated
	 * @ordered
	 */
	protected Swing swing = SWING_EDEFAULT;

	/**
	 * The default value of the '{@link #getPatternLength() <em>Pattern Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternLength()
	 * @generated
	 * @ordered
	 */
	protected static final PatternLength PATTERN_LENGTH_EDEFAULT = PatternLength.LENGTH_1;

	/**
	 * The cached value of the '{@link #getPatternLength() <em>Pattern Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternLength()
	 * @generated
	 * @ordered
	 */
	protected PatternLength patternLength = PATTERN_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getReservedBitAfterPatternLength() <em>Reserved Bit After Pattern Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedBitAfterPatternLength()
	 * @generated
	 * @ordered
	 */
	protected static final byte RESERVED_BIT_AFTER_PATTERN_LENGTH_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getReservedBitAfterPatternLength() <em>Reserved Bit After Pattern Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedBitAfterPatternLength()
	 * @generated
	 * @ordered
	 */
	protected byte reservedBitAfterPatternLength = RESERVED_BIT_AFTER_PATTERN_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getBeat() <em>Beat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeat()
	 * @generated
	 * @ordered
	 */
	protected static final Beat BEAT_EDEFAULT = Beat.BEAT_16TH;

	/**
	 * The cached value of the '{@link #getBeat() <em>Beat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeat()
	 * @generated
	 * @ordered
	 */
	protected Beat beat = BEAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRollType() <em>Roll Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollType()
	 * @generated
	 * @ordered
	 */
	protected static final RollType ROLL_TYPE_EDEFAULT = RollType.ROLL_2;

	/**
	 * The cached value of the '{@link #getRollType() <em>Roll Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollType()
	 * @generated
	 * @ordered
	 */
	protected RollType rollType = ROLL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFxChain() <em>Fx Chain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFxChain()
	 * @generated
	 * @ordered
	 */
	protected static final FxChain FX_CHAIN_EDEFAULT = FxChain.NONE;

	/**
	 * The cached value of the '{@link #getFxChain() <em>Fx Chain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFxChain()
	 * @generated
	 * @ordered
	 */
	protected FxChain fxChain = FX_CHAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastStep() <em>Last Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastStep()
	 * @generated
	 * @ordered
	 */
	protected static final LastStep LAST_STEP_EDEFAULT = LastStep.LAST_STEP_1;

	/**
	 * The cached value of the '{@link #getLastStep() <em>Last Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastStep()
	 * @generated
	 * @ordered
	 */
	protected LastStep lastStep = LAST_STEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getArpeggiatorScale() <em>Arpeggiator Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArpeggiatorScale()
	 * @generated
	 * @ordered
	 */
	protected static final ArpeggiatorScale ARPEGGIATOR_SCALE_EDEFAULT = ArpeggiatorScale.CHROMATIC;

	/**
	 * The cached value of the '{@link #getArpeggiatorScale() <em>Arpeggiator Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArpeggiatorScale()
	 * @generated
	 * @ordered
	 */
	protected ArpeggiatorScale arpeggiatorScale = ARPEGGIATOR_SCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReservedBitsAfterArpeggiatorScale() <em>Reserved Bits After Arpeggiator Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedBitsAfterArpeggiatorScale()
	 * @generated
	 * @ordered
	 */
	protected static final byte RESERVED_BITS_AFTER_ARPEGGIATOR_SCALE_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getReservedBitsAfterArpeggiatorScale() <em>Reserved Bits After Arpeggiator Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedBitsAfterArpeggiatorScale()
	 * @generated
	 * @ordered
	 */
	protected byte reservedBitsAfterArpeggiatorScale = RESERVED_BITS_AFTER_ARPEGGIATOR_SCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getArpeggiatorCenterNote() <em>Arpeggiator Center Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArpeggiatorCenterNote()
	 * @generated
	 * @ordered
	 */
	protected static final NoteNumber ARPEGGIATOR_CENTER_NOTE_EDEFAULT = NoteNumber.CN1;

	/**
	 * The cached value of the '{@link #getArpeggiatorCenterNote() <em>Arpeggiator Center Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArpeggiatorCenterNote()
	 * @generated
	 * @ordered
	 */
	protected NoteNumber arpeggiatorCenterNote = ARPEGGIATOR_CENTER_NOTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMuteStatus() <em>Mute Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMuteStatus()
	 * @generated
	 * @ordered
	 */
	protected static final short MUTE_STATUS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMuteStatus() <em>Mute Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMuteStatus()
	 * @generated
	 * @ordered
	 */
	protected short muteStatus = MUTE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSwingStatus() <em>Swing Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwingStatus()
	 * @generated
	 * @ordered
	 */
	protected static final short SWING_STATUS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSwingStatus() <em>Swing Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwingStatus()
	 * @generated
	 * @ordered
	 */
	protected short swingStatus = SWING_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputBusStatus() <em>Output Bus Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputBusStatus()
	 * @generated
	 * @ordered
	 */
	protected static final short OUTPUT_BUS_STATUS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOutputBusStatus() <em>Output Bus Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputBusStatus()
	 * @generated
	 * @ordered
	 */
	protected short outputBusStatus = OUTPUT_BUS_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccentStatus() <em>Accent Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccentStatus()
	 * @generated
	 * @ordered
	 */
	protected static final short ACCENT_STATUS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAccentStatus() <em>Accent Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccentStatus()
	 * @generated
	 * @ordered
	 */
	protected short accentStatus = ACCENT_STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDrumParts() <em>Drum Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrumParts()
	 * @generated
	 * @ordered
	 */
	protected EList<PartDrum> drumParts;

	/**
	 * The cached value of the '{@link #getKeyboardParts() <em>Keyboard Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyboardParts()
	 * @generated
	 * @ordered
	 */
	protected EList<PartKeyboard> keyboardParts;

	/**
	 * The cached value of the '{@link #getStretchSliceParts() <em>Stretch Slice Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStretchSliceParts()
	 * @generated
	 * @ordered
	 */
	protected EList<PartStretchSlice> stretchSliceParts;

	/**
	 * The cached value of the '{@link #getAudioInPart() <em>Audio In Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudioInPart()
	 * @generated
	 * @ordered
	 */
	protected PartAudioIn audioInPart;

	/**
	 * The cached value of the '{@link #getAccentPart() <em>Accent Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccentPart()
	 * @generated
	 * @ordered
	 */
	protected PartAccent accentPart;

	/**
	 * The cached value of the '{@link #getFxParameters() <em>Fx Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFxParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ParametersFx> fxParameters;

	/**
	 * The cached value of the '{@link #getMotionParameters() <em>Motion Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotionParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ParametersMotion> motionParameters;

	/**
	 * The default value of the '{@link #isEmpty() <em>Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EMPTY_EDEFAULT = true;

	/**
	 * The default value of the '{@link #getPatternNumberOriginal() <em>Pattern Number Original</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternNumberOriginal()
	 * @generated
	 * @ordered
	 */
	protected static final PatternNumber PATTERN_NUMBER_ORIGINAL_EDEFAULT = PatternNumber.PATTERN_A01;

	/**
	 * The cached value of the '{@link #getPatternNumberOriginal() <em>Pattern Number Original</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternNumberOriginal()
	 * @generated
	 * @ordered
	 */
	protected PatternNumber patternNumberOriginal = PATTERN_NUMBER_ORIGINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPatternNumberCurrent() <em>Pattern Number Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternNumberCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final PatternNumber PATTERN_NUMBER_CURRENT_EDEFAULT = PatternNumber.PATTERN_A01;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void init(byte[] b) {
		this.init(b, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void init(byte[] b, int patternNumber) {
		ExtendedByteBuffer in = new ExtendedByteBuffer(b);

		// Set the original .esx file pattern number
		this.setPatternNumberOriginal(PatternNumber.get(patternNumber));

		// bytes 0~7
		byte[] newPatternName = new byte[8];
		in.getBytes(newPatternName, 0, 8);
		this.setName(new String(newPatternName));

		// bytes 8~9
		Tempo newTempo = EsxFactory.eINSTANCE.createTempo();
		newTempo.setCurrentValueFromShort(in.getShort());
		this.setTempo(newTempo);

		// byte 10
		this.setSwing(Swing.get(in.getByte()));
		// byte 11
		int packedByte11 = in.getUnsignedByte();
		this.setPatternLength(PatternLength.get(EsxUtil.unpackInt(packedByte11,
				3, 0)));
		this.setReservedBitAfterPatternLength((byte) EsxUtil.unpackInt(
				packedByte11, 1, 3));
		this.setBeat(Beat.get(EsxUtil.unpackInt(packedByte11, 2, 4)));
		this.setRollType(RollType.get(EsxUtil.unpackInt(packedByte11, 2, 6)));
		// byte 12
		this.setFxChain(FxChain.get(in.getByte()));
		// byte 13
		this.setLastStep(LastStep.get(in.getByte()));
		// byte 14
		int packedByte14 = in.getUnsignedByte();
		this.setArpeggiatorScale(ArpeggiatorScale.get(EsxUtil.unpackInt(
				packedByte14, 5, 0)));
		this.setReservedBitsAfterArpeggiatorScale((byte) EsxUtil.unpackInt(
				packedByte14, 3, 5));
		// byte 15
		this.setArpeggiatorCenterNote(NoteNumber.get(in.getByte()));
		// byte 16~17
		this.setMuteStatus(in.getShort());
		// bytes 18~19
		this.setSwingStatus(in.getShort());
		// bytes 20-21
		this.setOutputBusStatus(in.getShort());
		// bytes 22~23
		this.setAccentStatus(in.getShort());

		// bytes 24~329 (34 bytes each)
		for (int i = 0; i < EsxUtil.NUM_PARTS_DRUM; i++) {
			PartDrum partDrum = EsxFactory.eINSTANCE.createPartDrum();
			partDrum.init(in.getBytes(in.position(),
					EsxUtil.CHUNKSIZE_PARTS_DRUM));
			this.getDrumParts().add(i, partDrum);
		}

		// bytes 330~877 (274 bytes each)
		for (int i = 0; i < EsxUtil.NUM_PARTS_KEYBOARD; i++) {
			PartKeyboard partKeyboard = EsxFactory.eINSTANCE
					.createPartKeyboard();
			partKeyboard.init(in.getBytes(in.position(),
					EsxUtil.CHUNKSIZE_PARTS_KEYBOARD));
			this.getKeyboardParts().add(i, partKeyboard);
		}

		// bytes 878~973 (32 bytes each)
		for (int i = 0; i < EsxUtil.NUM_PARTS_STRETCHSLICE; i++) {
			PartStretchSlice partStretchSlice = EsxFactory.eINSTANCE
					.createPartStretchSlice();
			partStretchSlice.init(in.getBytes(in.position(),
					EsxUtil.CHUNKSIZE_PARTS_STRETCHSLICE));
			this.getStretchSliceParts().add(i, partStretchSlice);
		}

		// bytes 974~1129 (156 bytes)
		for (int i = 0; i < EsxUtil.NUM_PARTS_AUDIOIN; i++) {
			PartAudioIn partAudioIn = EsxFactory.eINSTANCE.createPartAudioIn();
			partAudioIn.init(in.getBytes(in.position(),
					EsxUtil.CHUNKSIZE_PARTS_AUDIOIN));
			this.setAudioInPart(partAudioIn);
		}

		// bytes 1130~1147 (18 bytes)
		for (int i = 0; i < EsxUtil.NUM_PARTS_ACCENT; i++) {
			PartAccent partAccent = EsxFactory.eINSTANCE.createPartAccent();
			partAccent.init(in.getBytes(in.position(),
					EsxUtil.CHUNKSIZE_PARTS_ACCENT));
			this.setAccentPart(partAccent);
		}

		// bytes 1148~1159 (4 bytes each)
		for (int i = 0; i < EsxUtil.NUM_PARAMETERS_FX; i++) {
			ParametersFx parametersFx = EsxFactory.eINSTANCE
					.createParametersFx();
			parametersFx.init(in.getBytes(in.position(),
					EsxUtil.CHUNKSIZE_PARAMETERS_FX));
			this.getFxParameters().add(i, parametersFx);
		}

		// bytes 1160~4279 (130 bytes each)
		for (int i = 0; i < EsxUtil.NUM_PARAMETERS_MOTION; i++) {
			ParametersMotion parametersMotion = EsxFactory.eINSTANCE
					.createParametersMotion();
			parametersMotion.init(in.getBytes(in.position(),
					EsxUtil.CHUNKSIZE_PARAMETERS_MOTION));
			this.getMotionParameters().add(i, parametersMotion);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsxPackage.Literals.PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PATTERN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getLabel() {
		return "" + this.getPatternNumberCurrent() + " - " + this.getName()
				+ "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tempo getTempo() {
		return tempo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTempo(Tempo newTempo,
			NotificationChain msgs) {
		Tempo oldTempo = tempo;
		tempo = newTempo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, EsxPackage.PATTERN__TEMPO, oldTempo,
					newTempo);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTempo(Tempo newTempo) {
		if (newTempo != tempo) {
			NotificationChain msgs = null;
			if (tempo != null)
				msgs = ((InternalEObject) tempo).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EsxPackage.PATTERN__TEMPO,
						null, msgs);
			if (newTempo != null)
				msgs = ((InternalEObject) newTempo).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EsxPackage.PATTERN__TEMPO,
						null, msgs);
			msgs = basicSetTempo(newTempo, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PATTERN__TEMPO, newTempo, newTempo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Swing getSwing() {
		return swing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwing(Swing newSwing) {
		Swing oldSwing = swing;
		swing = newSwing == null ? SWING_EDEFAULT : newSwing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PATTERN__SWING, oldSwing, swing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternLength getPatternLength() {
		return patternLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternLength(PatternLength newPatternLength) {
		PatternLength oldPatternLength = patternLength;
		patternLength = newPatternLength == null ? PATTERN_LENGTH_EDEFAULT
				: newPatternLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PATTERN__PATTERN_LENGTH, oldPatternLength,
					patternLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getReservedBitAfterPatternLength() {
		return reservedBitAfterPatternLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservedBitAfterPatternLength(
			byte newReservedBitAfterPatternLength) {
		byte oldReservedBitAfterPatternLength = reservedBitAfterPatternLength;
		reservedBitAfterPatternLength = newReservedBitAfterPatternLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PATTERN__RESERVED_BIT_AFTER_PATTERN_LENGTH,
					oldReservedBitAfterPatternLength,
					reservedBitAfterPatternLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Beat getBeat() {
		return beat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeat(Beat newBeat) {
		Beat oldBeat = beat;
		beat = newBeat == null ? BEAT_EDEFAULT : newBeat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PATTERN__BEAT, oldBeat, beat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RollType getRollType() {
		return rollType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRollType(RollType newRollType) {
		RollType oldRollType = rollType;
		rollType = newRollType == null ? ROLL_TYPE_EDEFAULT : newRollType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PATTERN__ROLL_TYPE, oldRollType, rollType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FxChain getFxChain() {
		return fxChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFxChain(FxChain newFxChain) {
		FxChain oldFxChain = fxChain;
		fxChain = newFxChain == null ? FX_CHAIN_EDEFAULT : newFxChain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PATTERN__FX_CHAIN, oldFxChain, fxChain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastStep getLastStep() {
		return lastStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastStep(LastStep newLastStep) {
		LastStep oldLastStep = lastStep;
		lastStep = newLastStep == null ? LAST_STEP_EDEFAULT : newLastStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PATTERN__LAST_STEP, oldLastStep, lastStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArpeggiatorScale getArpeggiatorScale() {
		return arpeggiatorScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArpeggiatorScale(ArpeggiatorScale newArpeggiatorScale) {
		ArpeggiatorScale oldArpeggiatorScale = arpeggiatorScale;
		arpeggiatorScale = newArpeggiatorScale == null ? ARPEGGIATOR_SCALE_EDEFAULT
				: newArpeggiatorScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PATTERN__ARPEGGIATOR_SCALE, oldArpeggiatorScale,
					arpeggiatorScale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getReservedBitsAfterArpeggiatorScale() {
		return reservedBitsAfterArpeggiatorScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservedBitsAfterArpeggiatorScale(
			byte newReservedBitsAfterArpeggiatorScale) {
		byte oldReservedBitsAfterArpeggiatorScale = reservedBitsAfterArpeggiatorScale;
		reservedBitsAfterArpeggiatorScale = newReservedBitsAfterArpeggiatorScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PATTERN__RESERVED_BITS_AFTER_ARPEGGIATOR_SCALE,
					oldReservedBitsAfterArpeggiatorScale,
					reservedBitsAfterArpeggiatorScale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteNumber getArpeggiatorCenterNote() {
		return arpeggiatorCenterNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArpeggiatorCenterNote(NoteNumber newArpeggiatorCenterNote) {
		NoteNumber oldArpeggiatorCenterNote = arpeggiatorCenterNote;
		arpeggiatorCenterNote = newArpeggiatorCenterNote == null ? ARPEGGIATOR_CENTER_NOTE_EDEFAULT
				: newArpeggiatorCenterNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PATTERN__ARPEGGIATOR_CENTER_NOTE,
					oldArpeggiatorCenterNote, arpeggiatorCenterNote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getMuteStatus() {
		return muteStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMuteStatus(short newMuteStatus) {
		short oldMuteStatus = muteStatus;
		muteStatus = newMuteStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PATTERN__MUTE_STATUS, oldMuteStatus, muteStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getSwingStatus() {
		return swingStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwingStatus(short newSwingStatus) {
		short oldSwingStatus = swingStatus;
		swingStatus = newSwingStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PATTERN__SWING_STATUS, oldSwingStatus,
					swingStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getOutputBusStatus() {
		return outputBusStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputBusStatus(short newOutputBusStatus) {
		short oldOutputBusStatus = outputBusStatus;
		outputBusStatus = newOutputBusStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PATTERN__OUTPUT_BUS_STATUS, oldOutputBusStatus,
					outputBusStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getAccentStatus() {
		return accentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccentStatus(short newAccentStatus) {
		short oldAccentStatus = accentStatus;
		accentStatus = newAccentStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PATTERN__ACCENT_STATUS, oldAccentStatus,
					accentStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PartDrum> getDrumParts() {
		if (drumParts == null) {
			drumParts = new EObjectContainmentEList<PartDrum>(PartDrum.class,
					this, EsxPackage.PATTERN__DRUM_PARTS);
		}
		return drumParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PartKeyboard> getKeyboardParts() {
		if (keyboardParts == null) {
			keyboardParts = new EObjectContainmentEList<PartKeyboard>(
					PartKeyboard.class, this,
					EsxPackage.PATTERN__KEYBOARD_PARTS);
		}
		return keyboardParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PartStretchSlice> getStretchSliceParts() {
		if (stretchSliceParts == null) {
			stretchSliceParts = new EObjectContainmentEList<PartStretchSlice>(
					PartStretchSlice.class, this,
					EsxPackage.PATTERN__STRETCH_SLICE_PARTS);
		}
		return stretchSliceParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartAudioIn getAudioInPart() {
		return audioInPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAudioInPart(PartAudioIn newAudioInPart,
			NotificationChain msgs) {
		PartAudioIn oldAudioInPart = audioInPart;
		audioInPart = newAudioInPart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, EsxPackage.PATTERN__AUDIO_IN_PART,
					oldAudioInPart, newAudioInPart);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAudioInPart(PartAudioIn newAudioInPart) {
		if (newAudioInPart != audioInPart) {
			NotificationChain msgs = null;
			if (audioInPart != null)
				msgs = ((InternalEObject) audioInPart)
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
								- EsxPackage.PATTERN__AUDIO_IN_PART, null, msgs);
			if (newAudioInPart != null)
				msgs = ((InternalEObject) newAudioInPart)
						.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
								- EsxPackage.PATTERN__AUDIO_IN_PART, null, msgs);
			msgs = basicSetAudioInPart(newAudioInPart, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PATTERN__AUDIO_IN_PART, newAudioInPart,
					newAudioInPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartAccent getAccentPart() {
		return accentPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccentPart(PartAccent newAccentPart,
			NotificationChain msgs) {
		PartAccent oldAccentPart = accentPart;
		accentPart = newAccentPart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, EsxPackage.PATTERN__ACCENT_PART,
					oldAccentPart, newAccentPart);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccentPart(PartAccent newAccentPart) {
		if (newAccentPart != accentPart) {
			NotificationChain msgs = null;
			if (accentPart != null)
				msgs = ((InternalEObject) accentPart).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- EsxPackage.PATTERN__ACCENT_PART, null, msgs);
			if (newAccentPart != null)
				msgs = ((InternalEObject) newAccentPart).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- EsxPackage.PATTERN__ACCENT_PART, null, msgs);
			msgs = basicSetAccentPart(newAccentPart, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PATTERN__ACCENT_PART, newAccentPart,
					newAccentPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParametersFx> getFxParameters() {
		if (fxParameters == null) {
			fxParameters = new EObjectContainmentEList<ParametersFx>(
					ParametersFx.class, this, EsxPackage.PATTERN__FX_PARAMETERS);
		}
		return fxParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParametersMotion> getMotionParameters() {
		if (motionParameters == null) {
			motionParameters = new EObjectContainmentEList<ParametersMotion>(
					ParametersMotion.class, this,
					EsxPackage.PATTERN__MOTION_PARAMETERS);
		}
		return motionParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isEmpty() {
		if (this.eResource() != null) {
			Resource resource = (Resource) this.eResource();
			Object rootObject = resource.getContents().get(0);
			if (rootObject instanceof EsxFile) {
				return (this.getName().equals(((EsxFile) rootObject)
						.getEmptyPattern().getName()));
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternNumber getPatternNumberOriginal() {
		return patternNumberOriginal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternNumberOriginal(PatternNumber newPatternNumberOriginal) {
		PatternNumber oldPatternNumberOriginal = patternNumberOriginal;
		patternNumberOriginal = newPatternNumberOriginal == null ? PATTERN_NUMBER_ORIGINAL_EDEFAULT
				: newPatternNumberOriginal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PATTERN__PATTERN_NUMBER_ORIGINAL,
					oldPatternNumberOriginal, patternNumberOriginal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PatternNumber getPatternNumberCurrent() {
		if (this.eResource() != null) {
			Resource resource = (Resource) this.eResource();
			Object rootObject = resource.getContents().get(0);
			if (rootObject instanceof EsxFile) {
				return PatternNumber.get(((EsxFile) rootObject).getPatterns()
						.indexOf(this));
			}
		}
		return PatternNumber.get(-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public byte[] toByteArray() {
		ExtendedByteBuffer buf = new ExtendedByteBuffer(
				EsxUtil.CHUNKSIZE_PATTERN);
		// bytes 0~7
		buf.putBytes(
				EsxUtil.getByteArrayWithLength(this.getName(), 8, (byte) 0x00),
				0, 8);
		// bytes 8~9
		buf.putShort(this.getTempo().getShortFromCurrentValue());
		// byte 10
		buf.putUnsignedByte(this.getSwing().getValue());
		// byte 11
		int packedByte11 = 0x00;
		packedByte11 = EsxUtil.packInt(packedByte11, this.getPatternLength()
				.getValue(), 3, 0);
		packedByte11 = EsxUtil.packInt(packedByte11,
				this.getReservedBitAfterPatternLength(), 1, 3);
		packedByte11 = EsxUtil.packInt(packedByte11, this.getBeat().getValue(),
				2, 4);
		packedByte11 = EsxUtil.packInt(packedByte11, this.getRollType()
				.getValue(), 2, 6);
		buf.putUnsignedByte(packedByte11);
		// byte 12
		buf.putUnsignedByte(this.getFxChain().getValue());
		// byte 13
		buf.putUnsignedByte(this.getLastStep().getValue());
		// byte 14
		int packedByte14 = 0x00;
		packedByte14 = EsxUtil.packInt(packedByte14, this.getArpeggiatorScale()
				.getValue(), 5, 0);
		packedByte14 = EsxUtil.packInt(packedByte14,
				this.getReservedBitsAfterArpeggiatorScale(), 3, 5);
		buf.putUnsignedByte(packedByte14);
		// byte 15
		buf.putUnsignedByte(this.getArpeggiatorCenterNote().getValue());
		// byte 16~17
		buf.putShort(this.getMuteStatus());
		// bytes 18~19
		buf.putShort(this.getSwingStatus());
		// bytes 20-21
		buf.putShort(this.getOutputBusStatus());
		// bytes 22~23
		buf.putShort(this.getAccentStatus());
		// bytes 24~329 (34 bytes each)
		for (int i = 0; i < EsxUtil.NUM_PARTS_DRUM; i++) {
			buf.putBytes(this.getDrumParts().get(i).toByteArray());
		}
		// bytes 330~877 (274 bytes each)
		for (int i = 0; i < EsxUtil.NUM_PARTS_KEYBOARD; i++) {
			buf.putBytes(this.getKeyboardParts().get(i).toByteArray());
		}
		// bytes 878~973 (32 bytes each)
		for (int i = 0; i < EsxUtil.NUM_PARTS_STRETCHSLICE; i++) {
			buf.putBytes(this.getStretchSliceParts().get(i).toByteArray());
		}
		// bytes 974~1129 (156 bytes)
		for (int i = 0; i < EsxUtil.NUM_PARTS_AUDIOIN; i++) {
			buf.putBytes(this.getAudioInPart().toByteArray());
		}
		// bytes 1130~1147 (18 bytes)
		for (int i = 0; i < EsxUtil.NUM_PARTS_ACCENT; i++) {
			buf.putBytes(this.getAccentPart().toByteArray());
		}
		// bytes 1148~1159 (4 bytes each)
		for (int i = 0; i < EsxUtil.NUM_PARAMETERS_FX; i++) {
			buf.putBytes(this.getFxParameters().get(i).toByteArray());
		}
		// bytes 1160~4279 (130 bytes each)
		for (int i = 0; i < EsxUtil.NUM_PARAMETERS_MOTION; i++) {
			buf.putBytes(this.getMotionParameters().get(i).toByteArray());
		}
		return buf.array();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EsxPackage.PATTERN__TEMPO:
			return basicSetTempo(null, msgs);
		case EsxPackage.PATTERN__DRUM_PARTS:
			return ((InternalEList<?>) getDrumParts()).basicRemove(otherEnd,
					msgs);
		case EsxPackage.PATTERN__KEYBOARD_PARTS:
			return ((InternalEList<?>) getKeyboardParts()).basicRemove(
					otherEnd, msgs);
		case EsxPackage.PATTERN__STRETCH_SLICE_PARTS:
			return ((InternalEList<?>) getStretchSliceParts()).basicRemove(
					otherEnd, msgs);
		case EsxPackage.PATTERN__AUDIO_IN_PART:
			return basicSetAudioInPart(null, msgs);
		case EsxPackage.PATTERN__ACCENT_PART:
			return basicSetAccentPart(null, msgs);
		case EsxPackage.PATTERN__FX_PARAMETERS:
			return ((InternalEList<?>) getFxParameters()).basicRemove(otherEnd,
					msgs);
		case EsxPackage.PATTERN__MOTION_PARAMETERS:
			return ((InternalEList<?>) getMotionParameters()).basicRemove(
					otherEnd, msgs);
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
		case EsxPackage.PATTERN__NAME:
			return getName();
		case EsxPackage.PATTERN__LABEL:
			return getLabel();
		case EsxPackage.PATTERN__TEMPO:
			return getTempo();
		case EsxPackage.PATTERN__SWING:
			return getSwing();
		case EsxPackage.PATTERN__PATTERN_LENGTH:
			return getPatternLength();
		case EsxPackage.PATTERN__RESERVED_BIT_AFTER_PATTERN_LENGTH:
			return getReservedBitAfterPatternLength();
		case EsxPackage.PATTERN__BEAT:
			return getBeat();
		case EsxPackage.PATTERN__ROLL_TYPE:
			return getRollType();
		case EsxPackage.PATTERN__FX_CHAIN:
			return getFxChain();
		case EsxPackage.PATTERN__LAST_STEP:
			return getLastStep();
		case EsxPackage.PATTERN__ARPEGGIATOR_SCALE:
			return getArpeggiatorScale();
		case EsxPackage.PATTERN__RESERVED_BITS_AFTER_ARPEGGIATOR_SCALE:
			return getReservedBitsAfterArpeggiatorScale();
		case EsxPackage.PATTERN__ARPEGGIATOR_CENTER_NOTE:
			return getArpeggiatorCenterNote();
		case EsxPackage.PATTERN__MUTE_STATUS:
			return getMuteStatus();
		case EsxPackage.PATTERN__SWING_STATUS:
			return getSwingStatus();
		case EsxPackage.PATTERN__OUTPUT_BUS_STATUS:
			return getOutputBusStatus();
		case EsxPackage.PATTERN__ACCENT_STATUS:
			return getAccentStatus();
		case EsxPackage.PATTERN__DRUM_PARTS:
			return getDrumParts();
		case EsxPackage.PATTERN__KEYBOARD_PARTS:
			return getKeyboardParts();
		case EsxPackage.PATTERN__STRETCH_SLICE_PARTS:
			return getStretchSliceParts();
		case EsxPackage.PATTERN__AUDIO_IN_PART:
			return getAudioInPart();
		case EsxPackage.PATTERN__ACCENT_PART:
			return getAccentPart();
		case EsxPackage.PATTERN__FX_PARAMETERS:
			return getFxParameters();
		case EsxPackage.PATTERN__MOTION_PARAMETERS:
			return getMotionParameters();
		case EsxPackage.PATTERN__EMPTY:
			return isEmpty();
		case EsxPackage.PATTERN__PATTERN_NUMBER_ORIGINAL:
			return getPatternNumberOriginal();
		case EsxPackage.PATTERN__PATTERN_NUMBER_CURRENT:
			return getPatternNumberCurrent();
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
		case EsxPackage.PATTERN__NAME:
			setName((String) newValue);
			return;
		case EsxPackage.PATTERN__TEMPO:
			setTempo((Tempo) newValue);
			return;
		case EsxPackage.PATTERN__SWING:
			setSwing((Swing) newValue);
			return;
		case EsxPackage.PATTERN__PATTERN_LENGTH:
			setPatternLength((PatternLength) newValue);
			return;
		case EsxPackage.PATTERN__RESERVED_BIT_AFTER_PATTERN_LENGTH:
			setReservedBitAfterPatternLength((Byte) newValue);
			return;
		case EsxPackage.PATTERN__BEAT:
			setBeat((Beat) newValue);
			return;
		case EsxPackage.PATTERN__ROLL_TYPE:
			setRollType((RollType) newValue);
			return;
		case EsxPackage.PATTERN__FX_CHAIN:
			setFxChain((FxChain) newValue);
			return;
		case EsxPackage.PATTERN__LAST_STEP:
			setLastStep((LastStep) newValue);
			return;
		case EsxPackage.PATTERN__ARPEGGIATOR_SCALE:
			setArpeggiatorScale((ArpeggiatorScale) newValue);
			return;
		case EsxPackage.PATTERN__RESERVED_BITS_AFTER_ARPEGGIATOR_SCALE:
			setReservedBitsAfterArpeggiatorScale((Byte) newValue);
			return;
		case EsxPackage.PATTERN__ARPEGGIATOR_CENTER_NOTE:
			setArpeggiatorCenterNote((NoteNumber) newValue);
			return;
		case EsxPackage.PATTERN__MUTE_STATUS:
			setMuteStatus((Short) newValue);
			return;
		case EsxPackage.PATTERN__SWING_STATUS:
			setSwingStatus((Short) newValue);
			return;
		case EsxPackage.PATTERN__OUTPUT_BUS_STATUS:
			setOutputBusStatus((Short) newValue);
			return;
		case EsxPackage.PATTERN__ACCENT_STATUS:
			setAccentStatus((Short) newValue);
			return;
		case EsxPackage.PATTERN__DRUM_PARTS:
			getDrumParts().clear();
			getDrumParts().addAll((Collection<? extends PartDrum>) newValue);
			return;
		case EsxPackage.PATTERN__KEYBOARD_PARTS:
			getKeyboardParts().clear();
			getKeyboardParts().addAll(
					(Collection<? extends PartKeyboard>) newValue);
			return;
		case EsxPackage.PATTERN__STRETCH_SLICE_PARTS:
			getStretchSliceParts().clear();
			getStretchSliceParts().addAll(
					(Collection<? extends PartStretchSlice>) newValue);
			return;
		case EsxPackage.PATTERN__AUDIO_IN_PART:
			setAudioInPart((PartAudioIn) newValue);
			return;
		case EsxPackage.PATTERN__ACCENT_PART:
			setAccentPart((PartAccent) newValue);
			return;
		case EsxPackage.PATTERN__FX_PARAMETERS:
			getFxParameters().clear();
			getFxParameters().addAll(
					(Collection<? extends ParametersFx>) newValue);
			return;
		case EsxPackage.PATTERN__MOTION_PARAMETERS:
			getMotionParameters().clear();
			getMotionParameters().addAll(
					(Collection<? extends ParametersMotion>) newValue);
			return;
		case EsxPackage.PATTERN__PATTERN_NUMBER_ORIGINAL:
			setPatternNumberOriginal((PatternNumber) newValue);
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
		case EsxPackage.PATTERN__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EsxPackage.PATTERN__TEMPO:
			setTempo((Tempo) null);
			return;
		case EsxPackage.PATTERN__SWING:
			setSwing(SWING_EDEFAULT);
			return;
		case EsxPackage.PATTERN__PATTERN_LENGTH:
			setPatternLength(PATTERN_LENGTH_EDEFAULT);
			return;
		case EsxPackage.PATTERN__RESERVED_BIT_AFTER_PATTERN_LENGTH:
			setReservedBitAfterPatternLength(RESERVED_BIT_AFTER_PATTERN_LENGTH_EDEFAULT);
			return;
		case EsxPackage.PATTERN__BEAT:
			setBeat(BEAT_EDEFAULT);
			return;
		case EsxPackage.PATTERN__ROLL_TYPE:
			setRollType(ROLL_TYPE_EDEFAULT);
			return;
		case EsxPackage.PATTERN__FX_CHAIN:
			setFxChain(FX_CHAIN_EDEFAULT);
			return;
		case EsxPackage.PATTERN__LAST_STEP:
			setLastStep(LAST_STEP_EDEFAULT);
			return;
		case EsxPackage.PATTERN__ARPEGGIATOR_SCALE:
			setArpeggiatorScale(ARPEGGIATOR_SCALE_EDEFAULT);
			return;
		case EsxPackage.PATTERN__RESERVED_BITS_AFTER_ARPEGGIATOR_SCALE:
			setReservedBitsAfterArpeggiatorScale(RESERVED_BITS_AFTER_ARPEGGIATOR_SCALE_EDEFAULT);
			return;
		case EsxPackage.PATTERN__ARPEGGIATOR_CENTER_NOTE:
			setArpeggiatorCenterNote(ARPEGGIATOR_CENTER_NOTE_EDEFAULT);
			return;
		case EsxPackage.PATTERN__MUTE_STATUS:
			setMuteStatus(MUTE_STATUS_EDEFAULT);
			return;
		case EsxPackage.PATTERN__SWING_STATUS:
			setSwingStatus(SWING_STATUS_EDEFAULT);
			return;
		case EsxPackage.PATTERN__OUTPUT_BUS_STATUS:
			setOutputBusStatus(OUTPUT_BUS_STATUS_EDEFAULT);
			return;
		case EsxPackage.PATTERN__ACCENT_STATUS:
			setAccentStatus(ACCENT_STATUS_EDEFAULT);
			return;
		case EsxPackage.PATTERN__DRUM_PARTS:
			getDrumParts().clear();
			return;
		case EsxPackage.PATTERN__KEYBOARD_PARTS:
			getKeyboardParts().clear();
			return;
		case EsxPackage.PATTERN__STRETCH_SLICE_PARTS:
			getStretchSliceParts().clear();
			return;
		case EsxPackage.PATTERN__AUDIO_IN_PART:
			setAudioInPart((PartAudioIn) null);
			return;
		case EsxPackage.PATTERN__ACCENT_PART:
			setAccentPart((PartAccent) null);
			return;
		case EsxPackage.PATTERN__FX_PARAMETERS:
			getFxParameters().clear();
			return;
		case EsxPackage.PATTERN__MOTION_PARAMETERS:
			getMotionParameters().clear();
			return;
		case EsxPackage.PATTERN__PATTERN_NUMBER_ORIGINAL:
			setPatternNumberOriginal(PATTERN_NUMBER_ORIGINAL_EDEFAULT);
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
		case EsxPackage.PATTERN__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case EsxPackage.PATTERN__LABEL:
			return LABEL_EDEFAULT == null ? getLabel() != null
					: !LABEL_EDEFAULT.equals(getLabel());
		case EsxPackage.PATTERN__TEMPO:
			return tempo != null;
		case EsxPackage.PATTERN__SWING:
			return swing != SWING_EDEFAULT;
		case EsxPackage.PATTERN__PATTERN_LENGTH:
			return patternLength != PATTERN_LENGTH_EDEFAULT;
		case EsxPackage.PATTERN__RESERVED_BIT_AFTER_PATTERN_LENGTH:
			return reservedBitAfterPatternLength != RESERVED_BIT_AFTER_PATTERN_LENGTH_EDEFAULT;
		case EsxPackage.PATTERN__BEAT:
			return beat != BEAT_EDEFAULT;
		case EsxPackage.PATTERN__ROLL_TYPE:
			return rollType != ROLL_TYPE_EDEFAULT;
		case EsxPackage.PATTERN__FX_CHAIN:
			return fxChain != FX_CHAIN_EDEFAULT;
		case EsxPackage.PATTERN__LAST_STEP:
			return lastStep != LAST_STEP_EDEFAULT;
		case EsxPackage.PATTERN__ARPEGGIATOR_SCALE:
			return arpeggiatorScale != ARPEGGIATOR_SCALE_EDEFAULT;
		case EsxPackage.PATTERN__RESERVED_BITS_AFTER_ARPEGGIATOR_SCALE:
			return reservedBitsAfterArpeggiatorScale != RESERVED_BITS_AFTER_ARPEGGIATOR_SCALE_EDEFAULT;
		case EsxPackage.PATTERN__ARPEGGIATOR_CENTER_NOTE:
			return arpeggiatorCenterNote != ARPEGGIATOR_CENTER_NOTE_EDEFAULT;
		case EsxPackage.PATTERN__MUTE_STATUS:
			return muteStatus != MUTE_STATUS_EDEFAULT;
		case EsxPackage.PATTERN__SWING_STATUS:
			return swingStatus != SWING_STATUS_EDEFAULT;
		case EsxPackage.PATTERN__OUTPUT_BUS_STATUS:
			return outputBusStatus != OUTPUT_BUS_STATUS_EDEFAULT;
		case EsxPackage.PATTERN__ACCENT_STATUS:
			return accentStatus != ACCENT_STATUS_EDEFAULT;
		case EsxPackage.PATTERN__DRUM_PARTS:
			return drumParts != null && !drumParts.isEmpty();
		case EsxPackage.PATTERN__KEYBOARD_PARTS:
			return keyboardParts != null && !keyboardParts.isEmpty();
		case EsxPackage.PATTERN__STRETCH_SLICE_PARTS:
			return stretchSliceParts != null && !stretchSliceParts.isEmpty();
		case EsxPackage.PATTERN__AUDIO_IN_PART:
			return audioInPart != null;
		case EsxPackage.PATTERN__ACCENT_PART:
			return accentPart != null;
		case EsxPackage.PATTERN__FX_PARAMETERS:
			return fxParameters != null && !fxParameters.isEmpty();
		case EsxPackage.PATTERN__MOTION_PARAMETERS:
			return motionParameters != null && !motionParameters.isEmpty();
		case EsxPackage.PATTERN__EMPTY:
			return isEmpty() != EMPTY_EDEFAULT;
		case EsxPackage.PATTERN__PATTERN_NUMBER_ORIGINAL:
			return patternNumberOriginal != PATTERN_NUMBER_ORIGINAL_EDEFAULT;
		case EsxPackage.PATTERN__PATTERN_NUMBER_CURRENT:
			return getPatternNumberCurrent() != PATTERN_NUMBER_CURRENT_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", swing: ");
		result.append(swing);
		result.append(", patternLength: ");
		result.append(patternLength);
		result.append(", reservedBitAfterPatternLength: ");
		result.append(reservedBitAfterPatternLength);
		result.append(", beat: ");
		result.append(beat);
		result.append(", rollType: ");
		result.append(rollType);
		result.append(", fxChain: ");
		result.append(fxChain);
		result.append(", lastStep: ");
		result.append(lastStep);
		result.append(", arpeggiatorScale: ");
		result.append(arpeggiatorScale);
		result.append(", reservedBitsAfterArpeggiatorScale: ");
		result.append(reservedBitsAfterArpeggiatorScale);
		result.append(", arpeggiatorCenterNote: ");
		result.append(arpeggiatorCenterNote);
		result.append(", muteStatus: ");
		result.append(muteStatus);
		result.append(", swingStatus: ");
		result.append(swingStatus);
		result.append(", outputBusStatus: ");
		result.append(outputBusStatus);
		result.append(", accentStatus: ");
		result.append(accentStatus);
		result.append(", patternNumberOriginal: ");
		result.append(patternNumberOriginal);
		result.append(')');
		return result.toString();
	}

} //PatternImpl

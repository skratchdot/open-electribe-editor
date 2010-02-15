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
package com.skratchdot.electribe.model.esx.impl;

import com.skratchdot.electribe.model.esx.AmpEg;
import com.skratchdot.electribe.model.esx.BpmSync;
import java.io.IOException;

import com.skratchdot.electribe.model.esx.EsxFactory;
import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.FilterType;
import com.skratchdot.electribe.model.esx.FxSelect;
import com.skratchdot.electribe.model.esx.FxSend;
import com.skratchdot.electribe.model.esx.ModDest;
import com.skratchdot.electribe.model.esx.ModType;
import com.skratchdot.electribe.model.esx.PartStretchSlice;
import com.skratchdot.electribe.model.esx.PartWithCommon;
import com.skratchdot.electribe.model.esx.PartWithPitch;
import com.skratchdot.electribe.model.esx.PartWithSample;
import com.skratchdot.electribe.model.esx.PartWithSequenceData;
import com.skratchdot.electribe.model.esx.Reverse;
import com.skratchdot.electribe.model.esx.Roll;
import com.skratchdot.electribe.model.esx.SequenceData;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import com.skratchdot.electribe.model.esx.util.EsxException;
import com.skratchdot.electribe.model.esx.util.EsxRandomAccess;
import com.skratchdot.electribe.model.esx.util.EsxUtil;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part Stretch Slice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartStretchSliceImpl#getAmpEg <em>Amp Eg</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartStretchSliceImpl#getBpmSync <em>Bpm Sync</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartStretchSliceImpl#getCutoff <em>Cutoff</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartStretchSliceImpl#getEgIntensity <em>Eg Intensity</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartStretchSliceImpl#getEgTime <em>Eg Time</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartStretchSliceImpl#getFilterType <em>Filter Type</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartStretchSliceImpl#getFxSelect <em>Fx Select</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartStretchSliceImpl#getFxSend <em>Fx Send</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartStretchSliceImpl#getModDepth <em>Mod Depth</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartStretchSliceImpl#getModDest <em>Mod Dest</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartStretchSliceImpl#getModSpeed <em>Mod Speed</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartStretchSliceImpl#getModType <em>Mod Type</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartStretchSliceImpl#getPan <em>Pan</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartStretchSliceImpl#getReservedBitAfterModDepth <em>Reserved Bit After Mod Depth</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartStretchSliceImpl#getResonance <em>Resonance</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartStretchSliceImpl#getRoll <em>Roll</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartStretchSliceImpl#getPitch <em>Pitch</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartStretchSliceImpl#getReverse <em>Reverse</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartStretchSliceImpl#getSampleNumber <em>Sample Number</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartStretchSliceImpl#getStartPoint <em>Start Point</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartStretchSliceImpl#getReservedBitsAfterReverse <em>Reserved Bits After Reverse</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartStretchSliceImpl#getSequenceData <em>Sequence Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartStretchSliceImpl extends PartImpl implements PartStretchSlice {
	/**
	 * The default value of the '{@link #getAmpEg() <em>Amp Eg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmpEg()
	 * @generated
	 * @ordered
	 */
	protected static final AmpEg AMP_EG_EDEFAULT = AmpEg.GATE;
	/**
	 * The cached value of the '{@link #getAmpEg() <em>Amp Eg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmpEg()
	 * @generated
	 * @ordered
	 */
	protected AmpEg ampEg = AMP_EG_EDEFAULT;
	/**
	 * The default value of the '{@link #getBpmSync() <em>Bpm Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBpmSync()
	 * @generated
	 * @ordered
	 */
	protected static final BpmSync BPM_SYNC_EDEFAULT = BpmSync.OFF;
	/**
	 * The cached value of the '{@link #getBpmSync() <em>Bpm Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBpmSync()
	 * @generated
	 * @ordered
	 */
	protected BpmSync bpmSync = BPM_SYNC_EDEFAULT;
	/**
	 * The default value of the '{@link #getCutoff() <em>Cutoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutoff()
	 * @generated
	 * @ordered
	 */
	protected static final byte CUTOFF_EDEFAULT = 0x00;
	/**
	 * The cached value of the '{@link #getCutoff() <em>Cutoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutoff()
	 * @generated
	 * @ordered
	 */
	protected byte cutoff = CUTOFF_EDEFAULT;
	/**
	 * The default value of the '{@link #getEgIntensity() <em>Eg Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEgIntensity()
	 * @generated
	 * @ordered
	 */
	protected static final byte EG_INTENSITY_EDEFAULT = 0x00;
	/**
	 * The cached value of the '{@link #getEgIntensity() <em>Eg Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEgIntensity()
	 * @generated
	 * @ordered
	 */
	protected byte egIntensity = EG_INTENSITY_EDEFAULT;
	/**
	 * The default value of the '{@link #getEgTime() <em>Eg Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEgTime()
	 * @generated
	 * @ordered
	 */
	protected static final byte EG_TIME_EDEFAULT = 0x00;
	/**
	 * The cached value of the '{@link #getEgTime() <em>Eg Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEgTime()
	 * @generated
	 * @ordered
	 */
	protected byte egTime = EG_TIME_EDEFAULT;
	/**
	 * The default value of the '{@link #getFilterType() <em>Filter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterType()
	 * @generated
	 * @ordered
	 */
	protected static final FilterType FILTER_TYPE_EDEFAULT = FilterType.LPF;
	/**
	 * The cached value of the '{@link #getFilterType() <em>Filter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterType()
	 * @generated
	 * @ordered
	 */
	protected FilterType filterType = FILTER_TYPE_EDEFAULT;
	/**
	 * The default value of the '{@link #getFxSelect() <em>Fx Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFxSelect()
	 * @generated
	 * @ordered
	 */
	protected static final FxSelect FX_SELECT_EDEFAULT = FxSelect.FX1;
	/**
	 * The cached value of the '{@link #getFxSelect() <em>Fx Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFxSelect()
	 * @generated
	 * @ordered
	 */
	protected FxSelect fxSelect = FX_SELECT_EDEFAULT;
	/**
	 * The default value of the '{@link #getFxSend() <em>Fx Send</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFxSend()
	 * @generated
	 * @ordered
	 */
	protected static final FxSend FX_SEND_EDEFAULT = FxSend.OFF;
	/**
	 * The cached value of the '{@link #getFxSend() <em>Fx Send</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFxSend()
	 * @generated
	 * @ordered
	 */
	protected FxSend fxSend = FX_SEND_EDEFAULT;
	/**
	 * The default value of the '{@link #getModDepth() <em>Mod Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModDepth()
	 * @generated
	 * @ordered
	 */
	protected static final byte MOD_DEPTH_EDEFAULT = 0x00;
	/**
	 * The cached value of the '{@link #getModDepth() <em>Mod Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModDepth()
	 * @generated
	 * @ordered
	 */
	protected byte modDepth = MOD_DEPTH_EDEFAULT;
	/**
	 * The default value of the '{@link #getModDest() <em>Mod Dest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModDest()
	 * @generated
	 * @ordered
	 */
	protected static final ModDest MOD_DEST_EDEFAULT = ModDest.PITCH;
	/**
	 * The cached value of the '{@link #getModDest() <em>Mod Dest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModDest()
	 * @generated
	 * @ordered
	 */
	protected ModDest modDest = MOD_DEST_EDEFAULT;
	/**
	 * The default value of the '{@link #getModSpeed() <em>Mod Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final byte MOD_SPEED_EDEFAULT = 0x00;
	/**
	 * The cached value of the '{@link #getModSpeed() <em>Mod Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModSpeed()
	 * @generated
	 * @ordered
	 */
	protected byte modSpeed = MOD_SPEED_EDEFAULT;
	/**
	 * The default value of the '{@link #getModType() <em>Mod Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModType()
	 * @generated
	 * @ordered
	 */
	protected static final ModType MOD_TYPE_EDEFAULT = ModType.SAWTOOTH;
	/**
	 * The cached value of the '{@link #getModType() <em>Mod Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModType()
	 * @generated
	 * @ordered
	 */
	protected ModType modType = MOD_TYPE_EDEFAULT;
	/**
	 * The default value of the '{@link #getPan() <em>Pan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPan()
	 * @generated
	 * @ordered
	 */
	protected static final byte PAN_EDEFAULT = 0x00;
	/**
	 * The cached value of the '{@link #getPan() <em>Pan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPan()
	 * @generated
	 * @ordered
	 */
	protected byte pan = PAN_EDEFAULT;
	/**
	 * The default value of the '{@link #getReservedBitAfterModDepth() <em>Reserved Bit After Mod Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedBitAfterModDepth()
	 * @generated
	 * @ordered
	 */
	protected static final byte RESERVED_BIT_AFTER_MOD_DEPTH_EDEFAULT = 0x00;
	/**
	 * The cached value of the '{@link #getReservedBitAfterModDepth() <em>Reserved Bit After Mod Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedBitAfterModDepth()
	 * @generated
	 * @ordered
	 */
	protected byte reservedBitAfterModDepth = RESERVED_BIT_AFTER_MOD_DEPTH_EDEFAULT;
	/**
	 * The default value of the '{@link #getResonance() <em>Resonance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResonance()
	 * @generated
	 * @ordered
	 */
	protected static final byte RESONANCE_EDEFAULT = 0x00;
	/**
	 * The cached value of the '{@link #getResonance() <em>Resonance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResonance()
	 * @generated
	 * @ordered
	 */
	protected byte resonance = RESONANCE_EDEFAULT;
	/**
	 * The default value of the '{@link #getRoll() <em>Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoll()
	 * @generated
	 * @ordered
	 */
	protected static final Roll ROLL_EDEFAULT = Roll.OFF;
	/**
	 * The cached value of the '{@link #getRoll() <em>Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoll()
	 * @generated
	 * @ordered
	 */
	protected Roll roll = ROLL_EDEFAULT;
	/**
	 * The default value of the '{@link #getPitch() <em>Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPitch()
	 * @generated
	 * @ordered
	 */
	protected static final byte PITCH_EDEFAULT = 0x00;
	/**
	 * The cached value of the '{@link #getPitch() <em>Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPitch()
	 * @generated
	 * @ordered
	 */
	protected byte pitch = PITCH_EDEFAULT;
	/**
	 * The default value of the '{@link #getReverse() <em>Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReverse()
	 * @generated
	 * @ordered
	 */
	protected static final Reverse REVERSE_EDEFAULT = Reverse.OFF;
	/**
	 * The cached value of the '{@link #getReverse() <em>Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReverse()
	 * @generated
	 * @ordered
	 */
	protected Reverse reverse = REVERSE_EDEFAULT;
	/**
	 * The default value of the '{@link #getSampleNumber() <em>Sample Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleNumber()
	 * @generated
	 * @ordered
	 */
	protected static final short SAMPLE_NUMBER_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getSampleNumber() <em>Sample Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleNumber()
	 * @generated
	 * @ordered
	 */
	protected short sampleNumber = SAMPLE_NUMBER_EDEFAULT;
	/**
	 * The default value of the '{@link #getStartPoint() <em>Start Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPoint()
	 * @generated
	 * @ordered
	 */
	protected static final byte START_POINT_EDEFAULT = 0x00;
	/**
	 * The cached value of the '{@link #getStartPoint() <em>Start Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPoint()
	 * @generated
	 * @ordered
	 */
	protected byte startPoint = START_POINT_EDEFAULT;
	/**
	 * The default value of the '{@link #getReservedBitsAfterReverse() <em>Reserved Bits After Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedBitsAfterReverse()
	 * @generated
	 * @ordered
	 */
	protected static final byte RESERVED_BITS_AFTER_REVERSE_EDEFAULT = 0x00;
	/**
	 * The cached value of the '{@link #getReservedBitsAfterReverse() <em>Reserved Bits After Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedBitsAfterReverse()
	 * @generated
	 * @ordered
	 */
	protected byte reservedBitsAfterReverse = RESERVED_BITS_AFTER_REVERSE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getSequenceData() <em>Sequence Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceData()
	 * @generated
	 * @ordered
	 */
	protected SequenceData sequenceData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartStretchSliceImpl() {
		super();
	}

	public PartStretchSliceImpl(EsxRandomAccess in, int patternNumber,
			int partStretchSliceNumber) throws EsxException, IOException {
		super();

		// Stop immediately if we are passed an invalid patternNumber
		if (patternNumber >= EsxUtil.NUM_PATTERNS || patternNumber < 0)
			throw new EsxException("Invalid patternNumber: " + patternNumber);

		// Stop immediately if we are passed an invalid partStretchSliceNumber
		if (partStretchSliceNumber >= EsxUtil.NUM_PARTS_STRETCHSLICE || partStretchSliceNumber < 0)
			throw new EsxException("Invalid partStretchSliceNumber: " + partStretchSliceNumber);

		// Jump to the start of partStretchSliceNumber's data
		in.seek(EsxUtil.ADDR_PATTERN_DATA +
				(patternNumber * EsxUtil.CHUNKSIZE_PATTERN) +
				EsxUtil.PATTERN_OFFSET_PARTS_STRETCHSLICE +
				(partStretchSliceNumber * EsxUtil.CHUNKSIZE_PARTS_STRETCHSLICE));

		// bytes 0~1
		this.setSampleNumber(in.readShort());
		// byte 2
		this.setFilterType(FilterType.get(in.readByte()));
		// byte 3
		this.setCutoff(in.readByte());
		// byte 4
		this.setResonance(in.readByte());
		// byte 5
		this.setEgIntensity(in.readByte());
		// byte 6
		this.setPitch(in.readByte());
		// byte 7
		this.setLevel(in.readByte());
		// byte 8
		this.setPan(in.readByte());
		// byte 9
		this.setEgTime(in.readByte());
		// byte 10
		this.setStartPoint(in.readByte());
		// byte 11
		int packedByte11 = in.readUnsignedByte();
		this.setFxSelect(FxSelect.get(EsxUtil.unpackInt(packedByte11, 2, 0)));
		this.setFxSend(FxSend.get(EsxUtil.unpackInt(packedByte11, 1, 2)));
		this.setRoll(Roll.get(EsxUtil.unpackInt(packedByte11, 1, 3)));
		this.setAmpEg(AmpEg.get(EsxUtil.unpackInt(packedByte11, 1, 4)));
		this.setReverse(Reverse.get(EsxUtil.unpackInt(packedByte11, 1, 5)));
		this.setReservedBitsAfterReverse((byte) EsxUtil.unpackInt(packedByte11, 2, 6));
		// byte 12
		int packedByte12 = in.readUnsignedByte();
		this.setModDest(ModDest.get(EsxUtil.unpackInt(packedByte12, 3, 0)));
		this.setReservedBitAfterModDepth((byte) EsxUtil.unpackInt(packedByte12, 1, 3));
		this.setModType(ModType.get(EsxUtil.unpackInt(packedByte12, 3, 4)));
		this.setBpmSync(BpmSync.get(EsxUtil.unpackInt(packedByte12, 1, 7)));
		// byte 13
		this.setModSpeed(in.readByte());
		// byte 14
		this.setModDepth(in.readByte());
		// byte 15
		this.setMotionSequenceStatus(in.readByte());
		// bytes 16~31
		byte[] tempBytes = new byte[EsxUtil.NUM_SEQUENCE_DATA];
		in.readFully(tempBytes, 0, EsxUtil.NUM_SEQUENCE_DATA);
		SequenceData newSequenceData = EsxFactory.eINSTANCE.createSequenceData();
		newSequenceData.setSequenceData(tempBytes);
		this.setSequenceData(newSequenceData);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsxPackage.Literals.PART_STRETCH_SLICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmpEg getAmpEg() {
		return ampEg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmpEg(AmpEg newAmpEg) {
		AmpEg oldAmpEg = ampEg;
		ampEg = newAmpEg == null ? AMP_EG_EDEFAULT : newAmpEg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_STRETCH_SLICE__AMP_EG, oldAmpEg, ampEg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmSync getBpmSync() {
		return bpmSync;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBpmSync(BpmSync newBpmSync) {
		BpmSync oldBpmSync = bpmSync;
		bpmSync = newBpmSync == null ? BPM_SYNC_EDEFAULT : newBpmSync;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_STRETCH_SLICE__BPM_SYNC, oldBpmSync, bpmSync));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getCutoff() {
		return cutoff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCutoff(byte newCutoff) {
		byte oldCutoff = cutoff;
		cutoff = newCutoff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_STRETCH_SLICE__CUTOFF, oldCutoff, cutoff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getEgIntensity() {
		return egIntensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEgIntensity(byte newEgIntensity) {
		byte oldEgIntensity = egIntensity;
		egIntensity = newEgIntensity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_STRETCH_SLICE__EG_INTENSITY, oldEgIntensity, egIntensity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getEgTime() {
		return egTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEgTime(byte newEgTime) {
		byte oldEgTime = egTime;
		egTime = newEgTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_STRETCH_SLICE__EG_TIME, oldEgTime, egTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getFilterType() {
		return filterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterType(FilterType newFilterType) {
		FilterType oldFilterType = filterType;
		filterType = newFilterType == null ? FILTER_TYPE_EDEFAULT : newFilterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_STRETCH_SLICE__FILTER_TYPE, oldFilterType, filterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FxSelect getFxSelect() {
		return fxSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFxSelect(FxSelect newFxSelect) {
		FxSelect oldFxSelect = fxSelect;
		fxSelect = newFxSelect == null ? FX_SELECT_EDEFAULT : newFxSelect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_STRETCH_SLICE__FX_SELECT, oldFxSelect, fxSelect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FxSend getFxSend() {
		return fxSend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFxSend(FxSend newFxSend) {
		FxSend oldFxSend = fxSend;
		fxSend = newFxSend == null ? FX_SEND_EDEFAULT : newFxSend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_STRETCH_SLICE__FX_SEND, oldFxSend, fxSend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getModDepth() {
		return modDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModDepth(byte newModDepth) {
		byte oldModDepth = modDepth;
		modDepth = newModDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_STRETCH_SLICE__MOD_DEPTH, oldModDepth, modDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModDest getModDest() {
		return modDest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModDest(ModDest newModDest) {
		ModDest oldModDest = modDest;
		modDest = newModDest == null ? MOD_DEST_EDEFAULT : newModDest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_STRETCH_SLICE__MOD_DEST, oldModDest, modDest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getModSpeed() {
		return modSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModSpeed(byte newModSpeed) {
		byte oldModSpeed = modSpeed;
		modSpeed = newModSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_STRETCH_SLICE__MOD_SPEED, oldModSpeed, modSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModType getModType() {
		return modType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModType(ModType newModType) {
		ModType oldModType = modType;
		modType = newModType == null ? MOD_TYPE_EDEFAULT : newModType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_STRETCH_SLICE__MOD_TYPE, oldModType, modType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getPan() {
		return pan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPan(byte newPan) {
		byte oldPan = pan;
		pan = newPan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_STRETCH_SLICE__PAN, oldPan, pan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getReservedBitAfterModDepth() {
		return reservedBitAfterModDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservedBitAfterModDepth(byte newReservedBitAfterModDepth) {
		byte oldReservedBitAfterModDepth = reservedBitAfterModDepth;
		reservedBitAfterModDepth = newReservedBitAfterModDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_STRETCH_SLICE__RESERVED_BIT_AFTER_MOD_DEPTH, oldReservedBitAfterModDepth, reservedBitAfterModDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getResonance() {
		return resonance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResonance(byte newResonance) {
		byte oldResonance = resonance;
		resonance = newResonance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_STRETCH_SLICE__RESONANCE, oldResonance, resonance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Roll getRoll() {
		return roll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoll(Roll newRoll) {
		Roll oldRoll = roll;
		roll = newRoll == null ? ROLL_EDEFAULT : newRoll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_STRETCH_SLICE__ROLL, oldRoll, roll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getPitch() {
		return pitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPitch(byte newPitch) {
		byte oldPitch = pitch;
		pitch = newPitch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_STRETCH_SLICE__PITCH, oldPitch, pitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reverse getReverse() {
		return reverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReverse(Reverse newReverse) {
		Reverse oldReverse = reverse;
		reverse = newReverse == null ? REVERSE_EDEFAULT : newReverse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_STRETCH_SLICE__REVERSE, oldReverse, reverse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getSampleNumber() {
		return sampleNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSampleNumber(short newSampleNumber) {
		short oldSampleNumber = sampleNumber;
		sampleNumber = newSampleNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_STRETCH_SLICE__SAMPLE_NUMBER, oldSampleNumber, sampleNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getStartPoint() {
		return startPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartPoint(byte newStartPoint) {
		byte oldStartPoint = startPoint;
		startPoint = newStartPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_STRETCH_SLICE__START_POINT, oldStartPoint, startPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getReservedBitsAfterReverse() {
		return reservedBitsAfterReverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservedBitsAfterReverse(byte newReservedBitsAfterReverse) {
		byte oldReservedBitsAfterReverse = reservedBitsAfterReverse;
		reservedBitsAfterReverse = newReservedBitsAfterReverse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_STRETCH_SLICE__RESERVED_BITS_AFTER_REVERSE, oldReservedBitsAfterReverse, reservedBitsAfterReverse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceData getSequenceData() {
		return sequenceData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceData(SequenceData newSequenceData, NotificationChain msgs) {
		SequenceData oldSequenceData = sequenceData;
		sequenceData = newSequenceData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsxPackage.PART_STRETCH_SLICE__SEQUENCE_DATA, oldSequenceData, newSequenceData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceData(SequenceData newSequenceData) {
		if (newSequenceData != sequenceData) {
			NotificationChain msgs = null;
			if (sequenceData != null)
				msgs = ((InternalEObject)sequenceData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsxPackage.PART_STRETCH_SLICE__SEQUENCE_DATA, null, msgs);
			if (newSequenceData != null)
				msgs = ((InternalEObject)newSequenceData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsxPackage.PART_STRETCH_SLICE__SEQUENCE_DATA, null, msgs);
			msgs = basicSetSequenceData(newSequenceData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_STRETCH_SLICE__SEQUENCE_DATA, newSequenceData, newSequenceData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsxPackage.PART_STRETCH_SLICE__SEQUENCE_DATA:
				return basicSetSequenceData(null, msgs);
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
			case EsxPackage.PART_STRETCH_SLICE__AMP_EG:
				return getAmpEg();
			case EsxPackage.PART_STRETCH_SLICE__BPM_SYNC:
				return getBpmSync();
			case EsxPackage.PART_STRETCH_SLICE__CUTOFF:
				return getCutoff();
			case EsxPackage.PART_STRETCH_SLICE__EG_INTENSITY:
				return getEgIntensity();
			case EsxPackage.PART_STRETCH_SLICE__EG_TIME:
				return getEgTime();
			case EsxPackage.PART_STRETCH_SLICE__FILTER_TYPE:
				return getFilterType();
			case EsxPackage.PART_STRETCH_SLICE__FX_SELECT:
				return getFxSelect();
			case EsxPackage.PART_STRETCH_SLICE__FX_SEND:
				return getFxSend();
			case EsxPackage.PART_STRETCH_SLICE__MOD_DEPTH:
				return getModDepth();
			case EsxPackage.PART_STRETCH_SLICE__MOD_DEST:
				return getModDest();
			case EsxPackage.PART_STRETCH_SLICE__MOD_SPEED:
				return getModSpeed();
			case EsxPackage.PART_STRETCH_SLICE__MOD_TYPE:
				return getModType();
			case EsxPackage.PART_STRETCH_SLICE__PAN:
				return getPan();
			case EsxPackage.PART_STRETCH_SLICE__RESERVED_BIT_AFTER_MOD_DEPTH:
				return getReservedBitAfterModDepth();
			case EsxPackage.PART_STRETCH_SLICE__RESONANCE:
				return getResonance();
			case EsxPackage.PART_STRETCH_SLICE__ROLL:
				return getRoll();
			case EsxPackage.PART_STRETCH_SLICE__PITCH:
				return getPitch();
			case EsxPackage.PART_STRETCH_SLICE__REVERSE:
				return getReverse();
			case EsxPackage.PART_STRETCH_SLICE__SAMPLE_NUMBER:
				return getSampleNumber();
			case EsxPackage.PART_STRETCH_SLICE__START_POINT:
				return getStartPoint();
			case EsxPackage.PART_STRETCH_SLICE__RESERVED_BITS_AFTER_REVERSE:
				return getReservedBitsAfterReverse();
			case EsxPackage.PART_STRETCH_SLICE__SEQUENCE_DATA:
				return getSequenceData();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EsxPackage.PART_STRETCH_SLICE__AMP_EG:
				setAmpEg((AmpEg)newValue);
				return;
			case EsxPackage.PART_STRETCH_SLICE__BPM_SYNC:
				setBpmSync((BpmSync)newValue);
				return;
			case EsxPackage.PART_STRETCH_SLICE__CUTOFF:
				setCutoff((Byte)newValue);
				return;
			case EsxPackage.PART_STRETCH_SLICE__EG_INTENSITY:
				setEgIntensity((Byte)newValue);
				return;
			case EsxPackage.PART_STRETCH_SLICE__EG_TIME:
				setEgTime((Byte)newValue);
				return;
			case EsxPackage.PART_STRETCH_SLICE__FILTER_TYPE:
				setFilterType((FilterType)newValue);
				return;
			case EsxPackage.PART_STRETCH_SLICE__FX_SELECT:
				setFxSelect((FxSelect)newValue);
				return;
			case EsxPackage.PART_STRETCH_SLICE__FX_SEND:
				setFxSend((FxSend)newValue);
				return;
			case EsxPackage.PART_STRETCH_SLICE__MOD_DEPTH:
				setModDepth((Byte)newValue);
				return;
			case EsxPackage.PART_STRETCH_SLICE__MOD_DEST:
				setModDest((ModDest)newValue);
				return;
			case EsxPackage.PART_STRETCH_SLICE__MOD_SPEED:
				setModSpeed((Byte)newValue);
				return;
			case EsxPackage.PART_STRETCH_SLICE__MOD_TYPE:
				setModType((ModType)newValue);
				return;
			case EsxPackage.PART_STRETCH_SLICE__PAN:
				setPan((Byte)newValue);
				return;
			case EsxPackage.PART_STRETCH_SLICE__RESERVED_BIT_AFTER_MOD_DEPTH:
				setReservedBitAfterModDepth((Byte)newValue);
				return;
			case EsxPackage.PART_STRETCH_SLICE__RESONANCE:
				setResonance((Byte)newValue);
				return;
			case EsxPackage.PART_STRETCH_SLICE__ROLL:
				setRoll((Roll)newValue);
				return;
			case EsxPackage.PART_STRETCH_SLICE__PITCH:
				setPitch((Byte)newValue);
				return;
			case EsxPackage.PART_STRETCH_SLICE__REVERSE:
				setReverse((Reverse)newValue);
				return;
			case EsxPackage.PART_STRETCH_SLICE__SAMPLE_NUMBER:
				setSampleNumber((Short)newValue);
				return;
			case EsxPackage.PART_STRETCH_SLICE__START_POINT:
				setStartPoint((Byte)newValue);
				return;
			case EsxPackage.PART_STRETCH_SLICE__RESERVED_BITS_AFTER_REVERSE:
				setReservedBitsAfterReverse((Byte)newValue);
				return;
			case EsxPackage.PART_STRETCH_SLICE__SEQUENCE_DATA:
				setSequenceData((SequenceData)newValue);
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
			case EsxPackage.PART_STRETCH_SLICE__AMP_EG:
				setAmpEg(AMP_EG_EDEFAULT);
				return;
			case EsxPackage.PART_STRETCH_SLICE__BPM_SYNC:
				setBpmSync(BPM_SYNC_EDEFAULT);
				return;
			case EsxPackage.PART_STRETCH_SLICE__CUTOFF:
				setCutoff(CUTOFF_EDEFAULT);
				return;
			case EsxPackage.PART_STRETCH_SLICE__EG_INTENSITY:
				setEgIntensity(EG_INTENSITY_EDEFAULT);
				return;
			case EsxPackage.PART_STRETCH_SLICE__EG_TIME:
				setEgTime(EG_TIME_EDEFAULT);
				return;
			case EsxPackage.PART_STRETCH_SLICE__FILTER_TYPE:
				setFilterType(FILTER_TYPE_EDEFAULT);
				return;
			case EsxPackage.PART_STRETCH_SLICE__FX_SELECT:
				setFxSelect(FX_SELECT_EDEFAULT);
				return;
			case EsxPackage.PART_STRETCH_SLICE__FX_SEND:
				setFxSend(FX_SEND_EDEFAULT);
				return;
			case EsxPackage.PART_STRETCH_SLICE__MOD_DEPTH:
				setModDepth(MOD_DEPTH_EDEFAULT);
				return;
			case EsxPackage.PART_STRETCH_SLICE__MOD_DEST:
				setModDest(MOD_DEST_EDEFAULT);
				return;
			case EsxPackage.PART_STRETCH_SLICE__MOD_SPEED:
				setModSpeed(MOD_SPEED_EDEFAULT);
				return;
			case EsxPackage.PART_STRETCH_SLICE__MOD_TYPE:
				setModType(MOD_TYPE_EDEFAULT);
				return;
			case EsxPackage.PART_STRETCH_SLICE__PAN:
				setPan(PAN_EDEFAULT);
				return;
			case EsxPackage.PART_STRETCH_SLICE__RESERVED_BIT_AFTER_MOD_DEPTH:
				setReservedBitAfterModDepth(RESERVED_BIT_AFTER_MOD_DEPTH_EDEFAULT);
				return;
			case EsxPackage.PART_STRETCH_SLICE__RESONANCE:
				setResonance(RESONANCE_EDEFAULT);
				return;
			case EsxPackage.PART_STRETCH_SLICE__ROLL:
				setRoll(ROLL_EDEFAULT);
				return;
			case EsxPackage.PART_STRETCH_SLICE__PITCH:
				setPitch(PITCH_EDEFAULT);
				return;
			case EsxPackage.PART_STRETCH_SLICE__REVERSE:
				setReverse(REVERSE_EDEFAULT);
				return;
			case EsxPackage.PART_STRETCH_SLICE__SAMPLE_NUMBER:
				setSampleNumber(SAMPLE_NUMBER_EDEFAULT);
				return;
			case EsxPackage.PART_STRETCH_SLICE__START_POINT:
				setStartPoint(START_POINT_EDEFAULT);
				return;
			case EsxPackage.PART_STRETCH_SLICE__RESERVED_BITS_AFTER_REVERSE:
				setReservedBitsAfterReverse(RESERVED_BITS_AFTER_REVERSE_EDEFAULT);
				return;
			case EsxPackage.PART_STRETCH_SLICE__SEQUENCE_DATA:
				setSequenceData((SequenceData)null);
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
			case EsxPackage.PART_STRETCH_SLICE__AMP_EG:
				return ampEg != AMP_EG_EDEFAULT;
			case EsxPackage.PART_STRETCH_SLICE__BPM_SYNC:
				return bpmSync != BPM_SYNC_EDEFAULT;
			case EsxPackage.PART_STRETCH_SLICE__CUTOFF:
				return cutoff != CUTOFF_EDEFAULT;
			case EsxPackage.PART_STRETCH_SLICE__EG_INTENSITY:
				return egIntensity != EG_INTENSITY_EDEFAULT;
			case EsxPackage.PART_STRETCH_SLICE__EG_TIME:
				return egTime != EG_TIME_EDEFAULT;
			case EsxPackage.PART_STRETCH_SLICE__FILTER_TYPE:
				return filterType != FILTER_TYPE_EDEFAULT;
			case EsxPackage.PART_STRETCH_SLICE__FX_SELECT:
				return fxSelect != FX_SELECT_EDEFAULT;
			case EsxPackage.PART_STRETCH_SLICE__FX_SEND:
				return fxSend != FX_SEND_EDEFAULT;
			case EsxPackage.PART_STRETCH_SLICE__MOD_DEPTH:
				return modDepth != MOD_DEPTH_EDEFAULT;
			case EsxPackage.PART_STRETCH_SLICE__MOD_DEST:
				return modDest != MOD_DEST_EDEFAULT;
			case EsxPackage.PART_STRETCH_SLICE__MOD_SPEED:
				return modSpeed != MOD_SPEED_EDEFAULT;
			case EsxPackage.PART_STRETCH_SLICE__MOD_TYPE:
				return modType != MOD_TYPE_EDEFAULT;
			case EsxPackage.PART_STRETCH_SLICE__PAN:
				return pan != PAN_EDEFAULT;
			case EsxPackage.PART_STRETCH_SLICE__RESERVED_BIT_AFTER_MOD_DEPTH:
				return reservedBitAfterModDepth != RESERVED_BIT_AFTER_MOD_DEPTH_EDEFAULT;
			case EsxPackage.PART_STRETCH_SLICE__RESONANCE:
				return resonance != RESONANCE_EDEFAULT;
			case EsxPackage.PART_STRETCH_SLICE__ROLL:
				return roll != ROLL_EDEFAULT;
			case EsxPackage.PART_STRETCH_SLICE__PITCH:
				return pitch != PITCH_EDEFAULT;
			case EsxPackage.PART_STRETCH_SLICE__REVERSE:
				return reverse != REVERSE_EDEFAULT;
			case EsxPackage.PART_STRETCH_SLICE__SAMPLE_NUMBER:
				return sampleNumber != SAMPLE_NUMBER_EDEFAULT;
			case EsxPackage.PART_STRETCH_SLICE__START_POINT:
				return startPoint != START_POINT_EDEFAULT;
			case EsxPackage.PART_STRETCH_SLICE__RESERVED_BITS_AFTER_REVERSE:
				return reservedBitsAfterReverse != RESERVED_BITS_AFTER_REVERSE_EDEFAULT;
			case EsxPackage.PART_STRETCH_SLICE__SEQUENCE_DATA:
				return sequenceData != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == PartWithCommon.class) {
			switch (derivedFeatureID) {
				case EsxPackage.PART_STRETCH_SLICE__AMP_EG: return EsxPackage.PART_WITH_COMMON__AMP_EG;
				case EsxPackage.PART_STRETCH_SLICE__BPM_SYNC: return EsxPackage.PART_WITH_COMMON__BPM_SYNC;
				case EsxPackage.PART_STRETCH_SLICE__CUTOFF: return EsxPackage.PART_WITH_COMMON__CUTOFF;
				case EsxPackage.PART_STRETCH_SLICE__EG_INTENSITY: return EsxPackage.PART_WITH_COMMON__EG_INTENSITY;
				case EsxPackage.PART_STRETCH_SLICE__EG_TIME: return EsxPackage.PART_WITH_COMMON__EG_TIME;
				case EsxPackage.PART_STRETCH_SLICE__FILTER_TYPE: return EsxPackage.PART_WITH_COMMON__FILTER_TYPE;
				case EsxPackage.PART_STRETCH_SLICE__FX_SELECT: return EsxPackage.PART_WITH_COMMON__FX_SELECT;
				case EsxPackage.PART_STRETCH_SLICE__FX_SEND: return EsxPackage.PART_WITH_COMMON__FX_SEND;
				case EsxPackage.PART_STRETCH_SLICE__MOD_DEPTH: return EsxPackage.PART_WITH_COMMON__MOD_DEPTH;
				case EsxPackage.PART_STRETCH_SLICE__MOD_DEST: return EsxPackage.PART_WITH_COMMON__MOD_DEST;
				case EsxPackage.PART_STRETCH_SLICE__MOD_SPEED: return EsxPackage.PART_WITH_COMMON__MOD_SPEED;
				case EsxPackage.PART_STRETCH_SLICE__MOD_TYPE: return EsxPackage.PART_WITH_COMMON__MOD_TYPE;
				case EsxPackage.PART_STRETCH_SLICE__PAN: return EsxPackage.PART_WITH_COMMON__PAN;
				case EsxPackage.PART_STRETCH_SLICE__RESERVED_BIT_AFTER_MOD_DEPTH: return EsxPackage.PART_WITH_COMMON__RESERVED_BIT_AFTER_MOD_DEPTH;
				case EsxPackage.PART_STRETCH_SLICE__RESONANCE: return EsxPackage.PART_WITH_COMMON__RESONANCE;
				case EsxPackage.PART_STRETCH_SLICE__ROLL: return EsxPackage.PART_WITH_COMMON__ROLL;
				default: return -1;
			}
		}
		if (baseClass == PartWithPitch.class) {
			switch (derivedFeatureID) {
				case EsxPackage.PART_STRETCH_SLICE__PITCH: return EsxPackage.PART_WITH_PITCH__PITCH;
				default: return -1;
			}
		}
		if (baseClass == PartWithSample.class) {
			switch (derivedFeatureID) {
				case EsxPackage.PART_STRETCH_SLICE__REVERSE: return EsxPackage.PART_WITH_SAMPLE__REVERSE;
				case EsxPackage.PART_STRETCH_SLICE__SAMPLE_NUMBER: return EsxPackage.PART_WITH_SAMPLE__SAMPLE_NUMBER;
				case EsxPackage.PART_STRETCH_SLICE__START_POINT: return EsxPackage.PART_WITH_SAMPLE__START_POINT;
				case EsxPackage.PART_STRETCH_SLICE__RESERVED_BITS_AFTER_REVERSE: return EsxPackage.PART_WITH_SAMPLE__RESERVED_BITS_AFTER_REVERSE;
				default: return -1;
			}
		}
		if (baseClass == PartWithSequenceData.class) {
			switch (derivedFeatureID) {
				case EsxPackage.PART_STRETCH_SLICE__SEQUENCE_DATA: return EsxPackage.PART_WITH_SEQUENCE_DATA__SEQUENCE_DATA;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == PartWithCommon.class) {
			switch (baseFeatureID) {
				case EsxPackage.PART_WITH_COMMON__AMP_EG: return EsxPackage.PART_STRETCH_SLICE__AMP_EG;
				case EsxPackage.PART_WITH_COMMON__BPM_SYNC: return EsxPackage.PART_STRETCH_SLICE__BPM_SYNC;
				case EsxPackage.PART_WITH_COMMON__CUTOFF: return EsxPackage.PART_STRETCH_SLICE__CUTOFF;
				case EsxPackage.PART_WITH_COMMON__EG_INTENSITY: return EsxPackage.PART_STRETCH_SLICE__EG_INTENSITY;
				case EsxPackage.PART_WITH_COMMON__EG_TIME: return EsxPackage.PART_STRETCH_SLICE__EG_TIME;
				case EsxPackage.PART_WITH_COMMON__FILTER_TYPE: return EsxPackage.PART_STRETCH_SLICE__FILTER_TYPE;
				case EsxPackage.PART_WITH_COMMON__FX_SELECT: return EsxPackage.PART_STRETCH_SLICE__FX_SELECT;
				case EsxPackage.PART_WITH_COMMON__FX_SEND: return EsxPackage.PART_STRETCH_SLICE__FX_SEND;
				case EsxPackage.PART_WITH_COMMON__MOD_DEPTH: return EsxPackage.PART_STRETCH_SLICE__MOD_DEPTH;
				case EsxPackage.PART_WITH_COMMON__MOD_DEST: return EsxPackage.PART_STRETCH_SLICE__MOD_DEST;
				case EsxPackage.PART_WITH_COMMON__MOD_SPEED: return EsxPackage.PART_STRETCH_SLICE__MOD_SPEED;
				case EsxPackage.PART_WITH_COMMON__MOD_TYPE: return EsxPackage.PART_STRETCH_SLICE__MOD_TYPE;
				case EsxPackage.PART_WITH_COMMON__PAN: return EsxPackage.PART_STRETCH_SLICE__PAN;
				case EsxPackage.PART_WITH_COMMON__RESERVED_BIT_AFTER_MOD_DEPTH: return EsxPackage.PART_STRETCH_SLICE__RESERVED_BIT_AFTER_MOD_DEPTH;
				case EsxPackage.PART_WITH_COMMON__RESONANCE: return EsxPackage.PART_STRETCH_SLICE__RESONANCE;
				case EsxPackage.PART_WITH_COMMON__ROLL: return EsxPackage.PART_STRETCH_SLICE__ROLL;
				default: return -1;
			}
		}
		if (baseClass == PartWithPitch.class) {
			switch (baseFeatureID) {
				case EsxPackage.PART_WITH_PITCH__PITCH: return EsxPackage.PART_STRETCH_SLICE__PITCH;
				default: return -1;
			}
		}
		if (baseClass == PartWithSample.class) {
			switch (baseFeatureID) {
				case EsxPackage.PART_WITH_SAMPLE__REVERSE: return EsxPackage.PART_STRETCH_SLICE__REVERSE;
				case EsxPackage.PART_WITH_SAMPLE__SAMPLE_NUMBER: return EsxPackage.PART_STRETCH_SLICE__SAMPLE_NUMBER;
				case EsxPackage.PART_WITH_SAMPLE__START_POINT: return EsxPackage.PART_STRETCH_SLICE__START_POINT;
				case EsxPackage.PART_WITH_SAMPLE__RESERVED_BITS_AFTER_REVERSE: return EsxPackage.PART_STRETCH_SLICE__RESERVED_BITS_AFTER_REVERSE;
				default: return -1;
			}
		}
		if (baseClass == PartWithSequenceData.class) {
			switch (baseFeatureID) {
				case EsxPackage.PART_WITH_SEQUENCE_DATA__SEQUENCE_DATA: return EsxPackage.PART_STRETCH_SLICE__SEQUENCE_DATA;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (ampEg: ");
		result.append(ampEg);
		result.append(", bpmSync: ");
		result.append(bpmSync);
		result.append(", cutoff: ");
		result.append(cutoff);
		result.append(", egIntensity: ");
		result.append(egIntensity);
		result.append(", egTime: ");
		result.append(egTime);
		result.append(", filterType: ");
		result.append(filterType);
		result.append(", fxSelect: ");
		result.append(fxSelect);
		result.append(", fxSend: ");
		result.append(fxSend);
		result.append(", modDepth: ");
		result.append(modDepth);
		result.append(", modDest: ");
		result.append(modDest);
		result.append(", modSpeed: ");
		result.append(modSpeed);
		result.append(", modType: ");
		result.append(modType);
		result.append(", pan: ");
		result.append(pan);
		result.append(", reservedBitAfterModDepth: ");
		result.append(reservedBitAfterModDepth);
		result.append(", resonance: ");
		result.append(resonance);
		result.append(", roll: ");
		result.append(roll);
		result.append(", pitch: ");
		result.append(pitch);
		result.append(", reverse: ");
		result.append(reverse);
		result.append(", sampleNumber: ");
		result.append(sampleNumber);
		result.append(", startPoint: ");
		result.append(startPoint);
		result.append(", reservedBitsAfterReverse: ");
		result.append(reservedBitsAfterReverse);
		result.append(')');
		return result.toString();
	}

	@Override
	public void write(EsxRandomAccess out, int patternNumber,
			int partStretchSliceNumber) throws EsxException, IOException {

		// Stop immediately if we are passed an invalid patternNumber
		if (patternNumber >= EsxUtil.NUM_PATTERNS || patternNumber < 0)
			throw new EsxException("Invalid patternNumber: " + patternNumber);

		// Stop immediately if we are passed an invalid partStretchSliceNumber
		if (partStretchSliceNumber >= EsxUtil.NUM_PARTS_STRETCHSLICE || partStretchSliceNumber < 0)
			throw new EsxException("Invalid partStretchSliceNumber: " + partStretchSliceNumber);

		// Jump to the start of partStretchSliceNumber's data
		out.seek(EsxUtil.ADDR_PATTERN_DATA +
				(patternNumber * EsxUtil.CHUNKSIZE_PATTERN) +
				EsxUtil.PATTERN_OFFSET_PARTS_STRETCHSLICE +
				(partStretchSliceNumber * EsxUtil.CHUNKSIZE_PARTS_STRETCHSLICE));

		// bytes 0~1
		out.writeShort(this.getSampleNumber());
		// byte 2
		out.writeByte(this.getFilterType().getValue());
		// byte 3
		out.writeByte(this.getCutoff());
		// byte 4
		out.writeByte(this.getResonance());
		// byte 5
		out.writeByte(this.getEgIntensity());
		// byte 6
		out.writeByte(this.getPitch());
		// byte 7
		out.writeByte(this.getLevel());
		// byte 8
		out.writeByte(this.getPan());
		// byte 9
		out.writeByte(this.getEgTime());
		// byte 10
		out.writeByte(this.getStartPoint());
		// byte 11
		int packedByte11 = 0x00;
		packedByte11 = EsxUtil.packInt(packedByte11, this.getFxSelect().getValue(), 2, 0);
		packedByte11 = EsxUtil.packInt(packedByte11, this.getFxSend().getValue(), 1, 2);
		packedByte11 = EsxUtil.packInt(packedByte11, this.getRoll().getValue(), 1, 3);
		packedByte11 = EsxUtil.packInt(packedByte11, this.getAmpEg().getValue(), 1, 4);
		packedByte11 = EsxUtil.packInt(packedByte11, this.getReverse().getValue(), 1, 5);
		packedByte11 = EsxUtil.packInt(packedByte11, this.getReservedBitsAfterReverse(), 2, 6);
		out.writeByte(packedByte11);
		// byte 12
		int packedByte12 = 0x00;
		packedByte12 = EsxUtil.packInt(packedByte12, this.getModDest().getValue(), 3, 0);
		packedByte12 = EsxUtil.packInt(packedByte12, this.getReservedBitAfterModDepth(), 1, 3);
		packedByte12 = EsxUtil.packInt(packedByte12, this.getModType().getValue(), 3, 4);
		packedByte12 = EsxUtil.packInt(packedByte12, this.getBpmSync().getValue(), 1, 7);
		out.writeByte(packedByte12);
		// byte 13
		out.writeByte(this.getModSpeed());
		// byte 14
		out.writeByte(this.getModDepth());
		// byte 15
		out.writeByte(this.getMotionSequenceStatus());
		// bytes 16~31
		out.write(this.getSequenceData().getSequenceData());
	}

} //PartStretchSliceImpl

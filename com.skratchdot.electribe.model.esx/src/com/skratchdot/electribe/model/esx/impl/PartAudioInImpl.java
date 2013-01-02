/*******************************************************************************
 * Copyright (c) 2009-2013 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 *******************************************************************************/
package com.skratchdot.electribe.model.esx.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.skratchdot.electribe.model.esx.AmpEg;
import com.skratchdot.electribe.model.esx.BpmSync;
import com.skratchdot.electribe.model.esx.EsxFactory;
import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.FilterType;
import com.skratchdot.electribe.model.esx.FxSelect;
import com.skratchdot.electribe.model.esx.FxSend;
import com.skratchdot.electribe.model.esx.ModDest;
import com.skratchdot.electribe.model.esx.ModType;
import com.skratchdot.electribe.model.esx.PartAudioIn;
import com.skratchdot.electribe.model.esx.PartWithCommon;
import com.skratchdot.electribe.model.esx.PartWithSequenceData;
import com.skratchdot.electribe.model.esx.PartWithSequenceDataGate;
import com.skratchdot.electribe.model.esx.Roll;
import com.skratchdot.electribe.model.esx.SequenceData;
import com.skratchdot.electribe.model.esx.SequenceDataGate;
import com.skratchdot.electribe.model.esx.SongEventPart;
import com.skratchdot.electribe.model.esx.util.EsxUtil;
import com.skratchdot.electribe.model.esx.util.ExtendedByteBuffer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part Audio In</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartAudioInImpl#getAmpEg <em>Amp Eg</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartAudioInImpl#getBpmSync <em>Bpm Sync</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartAudioInImpl#getCutoff <em>Cutoff</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartAudioInImpl#getEgIntensity <em>Eg Intensity</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartAudioInImpl#getEgTime <em>Eg Time</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartAudioInImpl#getFilterType <em>Filter Type</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartAudioInImpl#getFxSelect <em>Fx Select</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartAudioInImpl#getFxSend <em>Fx Send</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartAudioInImpl#getModDepth <em>Mod Depth</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartAudioInImpl#getModDest <em>Mod Dest</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartAudioInImpl#getModSpeed <em>Mod Speed</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartAudioInImpl#getModType <em>Mod Type</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartAudioInImpl#getPan <em>Pan</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartAudioInImpl#getReservedBitAfterModDepth <em>Reserved Bit After Mod Depth</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartAudioInImpl#getResonance <em>Resonance</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartAudioInImpl#getRoll <em>Roll</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartAudioInImpl#getSequenceData <em>Sequence Data</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartAudioInImpl#getSequenceDataGate <em>Sequence Data Gate</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartAudioInImpl#getReservedBitsByte7 <em>Reserved Bits Byte7</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartAudioInImpl extends PartImpl implements PartAudioIn {
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
	 * The cached value of the '{@link #getSequenceData() <em>Sequence Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceData()
	 * @generated
	 * @ordered
	 */
	protected SequenceData sequenceData;
	/**
	 * The cached value of the '{@link #getSequenceDataGate() <em>Sequence Data Gate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceDataGate()
	 * @generated
	 * @ordered
	 */
	protected SequenceDataGate sequenceDataGate;

	/**
	 * The default value of the '{@link #getReservedBitsByte7() <em>Reserved Bits Byte7</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedBitsByte7()
	 * @generated
	 * @ordered
	 */
	protected static final byte RESERVED_BITS_BYTE7_EDEFAULT = 0x00;
	/**
	 * The cached value of the '{@link #getReservedBitsByte7() <em>Reserved Bits Byte7</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedBitsByte7()
	 * @generated
	 * @ordered
	 */
	protected byte reservedBitsByte7 = RESERVED_BITS_BYTE7_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartAudioInImpl() {
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
		this.setFilterType(FilterType.get(in.getByte()));
		// byte 1
		this.setCutoff(in.getByte());
		// byte 2
		this.setResonance(in.getByte());
		// byte 3
		this.setEgIntensity(in.getByte());
		// byte 4
		this.setLevel(in.getByte());
		// byte 5
		this.setPan(in.getByte());
		// byte 6
		this.setEgTime(in.getByte());
		// byte 7
		int packedByte7 = in.getUnsignedByte();
		this.setFxSelect(FxSelect.get(EsxUtil.unpackInt(packedByte7, 2, 0)));
		this.setFxSend(FxSend.get(EsxUtil.unpackInt(packedByte7, 1, 2)));
		this.setRoll(Roll.get(EsxUtil.unpackInt(packedByte7, 1, 3)));
		this.setAmpEg(AmpEg.get(EsxUtil.unpackInt(packedByte7, 1, 4)));
		this.setReservedBitsByte7((byte) EsxUtil.unpackInt(packedByte7, 3, 5));
		// byte 8
		int packedByte8 = in.getUnsignedByte();
		this.setModDest(ModDest.get(EsxUtil.unpackInt(packedByte8, 3, 0)));
		this.setReservedBitAfterModDepth((byte) EsxUtil.unpackInt(packedByte8,
				1, 3));
		this.setModType(ModType.get(EsxUtil.unpackInt(packedByte8, 3, 4)));
		this.setBpmSync(BpmSync.get(EsxUtil.unpackInt(packedByte8, 1, 7)));
		// byte 9
		this.setModSpeed(in.getByte());
		// byte 10
		this.setModDepth(in.getByte());
		// byte 11
		this.setMotionSequenceStatus(in.getByte());

		byte[] tempBytes;
		// bytes 12~27 (16 bytes)
		tempBytes = new byte[EsxUtil.NUM_SEQUENCE_DATA];
		in.getBytes(tempBytes, 0, EsxUtil.NUM_SEQUENCE_DATA);
		SequenceData newSequenceData = EsxFactory.eINSTANCE
				.createSequenceData();
		newSequenceData.setSequenceData(tempBytes);
		this.setSequenceData(newSequenceData);
		// bytes 28~155 (128 bytes)
		tempBytes = new byte[EsxUtil.NUM_SEQUENCE_DATA_GATE];
		in.getBytes(tempBytes, 0, EsxUtil.NUM_SEQUENCE_DATA_GATE);
		SequenceDataGate newSequenceDataGate = EsxFactory.eINSTANCE
				.createSequenceDataGate();
		newSequenceDataGate.setSequenceDataGate(tempBytes);
		this.setSequenceDataGate(newSequenceDataGate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsxPackage.Literals.PART_AUDIO_IN;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PART_AUDIO_IN__AMP_EG, oldAmpEg, ampEg));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PART_AUDIO_IN__BPM_SYNC, oldBpmSync, bpmSync));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PART_AUDIO_IN__CUTOFF, oldCutoff, cutoff));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PART_AUDIO_IN__EG_INTENSITY, oldEgIntensity,
					egIntensity));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PART_AUDIO_IN__EG_TIME, oldEgTime, egTime));
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
		filterType = newFilterType == null ? FILTER_TYPE_EDEFAULT
				: newFilterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PART_AUDIO_IN__FILTER_TYPE, oldFilterType,
					filterType));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PART_AUDIO_IN__FX_SELECT, oldFxSelect, fxSelect));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PART_AUDIO_IN__FX_SEND, oldFxSend, fxSend));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PART_AUDIO_IN__MOD_DEPTH, oldModDepth, modDepth));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PART_AUDIO_IN__MOD_DEST, oldModDest, modDest));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PART_AUDIO_IN__MOD_SPEED, oldModSpeed, modSpeed));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PART_AUDIO_IN__MOD_TYPE, oldModType, modType));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PART_AUDIO_IN__PAN, oldPan, pan));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PART_AUDIO_IN__RESERVED_BIT_AFTER_MOD_DEPTH,
					oldReservedBitAfterModDepth, reservedBitAfterModDepth));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PART_AUDIO_IN__RESONANCE, oldResonance,
					resonance));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PART_AUDIO_IN__ROLL, oldRoll, roll));
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
	public NotificationChain basicSetSequenceData(SequenceData newSequenceData,
			NotificationChain msgs) {
		SequenceData oldSequenceData = sequenceData;
		sequenceData = newSequenceData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, EsxPackage.PART_AUDIO_IN__SEQUENCE_DATA,
					oldSequenceData, newSequenceData);
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
	public void setSequenceData(SequenceData newSequenceData) {
		if (newSequenceData != sequenceData) {
			NotificationChain msgs = null;
			if (sequenceData != null)
				msgs = ((InternalEObject) sequenceData).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- EsxPackage.PART_AUDIO_IN__SEQUENCE_DATA,
						null, msgs);
			if (newSequenceData != null)
				msgs = ((InternalEObject) newSequenceData).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- EsxPackage.PART_AUDIO_IN__SEQUENCE_DATA,
						null, msgs);
			msgs = basicSetSequenceData(newSequenceData, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PART_AUDIO_IN__SEQUENCE_DATA, newSequenceData,
					newSequenceData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceDataGate getSequenceDataGate() {
		return sequenceDataGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceDataGate(
			SequenceDataGate newSequenceDataGate, NotificationChain msgs) {
		SequenceDataGate oldSequenceDataGate = sequenceDataGate;
		sequenceDataGate = newSequenceDataGate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					EsxPackage.PART_AUDIO_IN__SEQUENCE_DATA_GATE,
					oldSequenceDataGate, newSequenceDataGate);
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
	public void setSequenceDataGate(SequenceDataGate newSequenceDataGate) {
		if (newSequenceDataGate != sequenceDataGate) {
			NotificationChain msgs = null;
			if (sequenceDataGate != null)
				msgs = ((InternalEObject) sequenceDataGate).eInverseRemove(
						this, EOPPOSITE_FEATURE_BASE
								- EsxPackage.PART_AUDIO_IN__SEQUENCE_DATA_GATE,
						null, msgs);
			if (newSequenceDataGate != null)
				msgs = ((InternalEObject) newSequenceDataGate).eInverseAdd(
						this, EOPPOSITE_FEATURE_BASE
								- EsxPackage.PART_AUDIO_IN__SEQUENCE_DATA_GATE,
						null, msgs);
			msgs = basicSetSequenceDataGate(newSequenceDataGate, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PART_AUDIO_IN__SEQUENCE_DATA_GATE,
					newSequenceDataGate, newSequenceDataGate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getReservedBitsByte7() {
		return reservedBitsByte7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservedBitsByte7(byte newReservedBitsByte7) {
		byte oldReservedBitsByte7 = reservedBitsByte7;
		reservedBitsByte7 = newReservedBitsByte7;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.PART_AUDIO_IN__RESERVED_BITS_BYTE7,
					oldReservedBitsByte7, reservedBitsByte7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public byte[] toByteArray() {
		ExtendedByteBuffer buf = new ExtendedByteBuffer(
				EsxUtil.CHUNKSIZE_PARTS_AUDIOIN);
		// byte 0
		buf.putUnsignedByte(this.getFilterType().getValue());
		// byte 1
		buf.putByte(this.getCutoff());
		// byte 2
		buf.putByte(this.getResonance());
		// byte 3
		buf.putByte(this.getEgIntensity());
		// byte 4
		buf.putByte(this.getLevel());
		// byte 5
		buf.putByte(this.getPan());
		// byte 6
		buf.putByte(this.getEgTime());
		// byte 7
		int packedByte7 = 0x00;
		packedByte7 = EsxUtil.packInt(packedByte7, this.getFxSelect()
				.getValue(), 2, 0);
		packedByte7 = EsxUtil.packInt(packedByte7, this.getFxSend().getValue(),
				1, 2);
		packedByte7 = EsxUtil.packInt(packedByte7, this.getRoll().getValue(),
				1, 3);
		packedByte7 = EsxUtil.packInt(packedByte7, this.getAmpEg().getValue(),
				1, 4);
		packedByte7 = EsxUtil.packInt(packedByte7, this.getReservedBitsByte7(),
				3, 5);
		buf.putUnsignedByte(packedByte7);
		// byte 8
		int packedByte8 = 0x00;
		packedByte8 = EsxUtil.packInt(packedByte8,
				this.getModDest().getValue(), 3, 0);
		packedByte8 = EsxUtil.packInt(packedByte8,
				this.getReservedBitAfterModDepth(), 1, 3);
		packedByte8 = EsxUtil.packInt(packedByte8,
				this.getModType().getValue(), 3, 4);
		packedByte8 = EsxUtil.packInt(packedByte8,
				this.getBpmSync().getValue(), 1, 7);
		buf.putUnsignedByte(packedByte8);
		// byte 9
		buf.putByte(this.getModSpeed());
		// byte 10
		buf.putByte(this.getModDepth());
		// byte 11
		buf.putByte(this.getMotionSequenceStatus());
		// bytes 12~27 (16 bytes)
		buf.putBytes(this.getSequenceData().getSequenceData());
		// bytes 28~155 (128 bytes)
		buf.putBytes(this.getSequenceDataGate().getSequenceDataGate());
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
		case EsxPackage.PART_AUDIO_IN__SEQUENCE_DATA:
			return basicSetSequenceData(null, msgs);
		case EsxPackage.PART_AUDIO_IN__SEQUENCE_DATA_GATE:
			return basicSetSequenceDataGate(null, msgs);
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
		case EsxPackage.PART_AUDIO_IN__AMP_EG:
			return getAmpEg();
		case EsxPackage.PART_AUDIO_IN__BPM_SYNC:
			return getBpmSync();
		case EsxPackage.PART_AUDIO_IN__CUTOFF:
			return getCutoff();
		case EsxPackage.PART_AUDIO_IN__EG_INTENSITY:
			return getEgIntensity();
		case EsxPackage.PART_AUDIO_IN__EG_TIME:
			return getEgTime();
		case EsxPackage.PART_AUDIO_IN__FILTER_TYPE:
			return getFilterType();
		case EsxPackage.PART_AUDIO_IN__FX_SELECT:
			return getFxSelect();
		case EsxPackage.PART_AUDIO_IN__FX_SEND:
			return getFxSend();
		case EsxPackage.PART_AUDIO_IN__MOD_DEPTH:
			return getModDepth();
		case EsxPackage.PART_AUDIO_IN__MOD_DEST:
			return getModDest();
		case EsxPackage.PART_AUDIO_IN__MOD_SPEED:
			return getModSpeed();
		case EsxPackage.PART_AUDIO_IN__MOD_TYPE:
			return getModType();
		case EsxPackage.PART_AUDIO_IN__PAN:
			return getPan();
		case EsxPackage.PART_AUDIO_IN__RESERVED_BIT_AFTER_MOD_DEPTH:
			return getReservedBitAfterModDepth();
		case EsxPackage.PART_AUDIO_IN__RESONANCE:
			return getResonance();
		case EsxPackage.PART_AUDIO_IN__ROLL:
			return getRoll();
		case EsxPackage.PART_AUDIO_IN__SEQUENCE_DATA:
			return getSequenceData();
		case EsxPackage.PART_AUDIO_IN__SEQUENCE_DATA_GATE:
			return getSequenceDataGate();
		case EsxPackage.PART_AUDIO_IN__RESERVED_BITS_BYTE7:
			return getReservedBitsByte7();
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
		case EsxPackage.PART_AUDIO_IN__AMP_EG:
			setAmpEg((AmpEg) newValue);
			return;
		case EsxPackage.PART_AUDIO_IN__BPM_SYNC:
			setBpmSync((BpmSync) newValue);
			return;
		case EsxPackage.PART_AUDIO_IN__CUTOFF:
			setCutoff((Byte) newValue);
			return;
		case EsxPackage.PART_AUDIO_IN__EG_INTENSITY:
			setEgIntensity((Byte) newValue);
			return;
		case EsxPackage.PART_AUDIO_IN__EG_TIME:
			setEgTime((Byte) newValue);
			return;
		case EsxPackage.PART_AUDIO_IN__FILTER_TYPE:
			setFilterType((FilterType) newValue);
			return;
		case EsxPackage.PART_AUDIO_IN__FX_SELECT:
			setFxSelect((FxSelect) newValue);
			return;
		case EsxPackage.PART_AUDIO_IN__FX_SEND:
			setFxSend((FxSend) newValue);
			return;
		case EsxPackage.PART_AUDIO_IN__MOD_DEPTH:
			setModDepth((Byte) newValue);
			return;
		case EsxPackage.PART_AUDIO_IN__MOD_DEST:
			setModDest((ModDest) newValue);
			return;
		case EsxPackage.PART_AUDIO_IN__MOD_SPEED:
			setModSpeed((Byte) newValue);
			return;
		case EsxPackage.PART_AUDIO_IN__MOD_TYPE:
			setModType((ModType) newValue);
			return;
		case EsxPackage.PART_AUDIO_IN__PAN:
			setPan((Byte) newValue);
			return;
		case EsxPackage.PART_AUDIO_IN__RESERVED_BIT_AFTER_MOD_DEPTH:
			setReservedBitAfterModDepth((Byte) newValue);
			return;
		case EsxPackage.PART_AUDIO_IN__RESONANCE:
			setResonance((Byte) newValue);
			return;
		case EsxPackage.PART_AUDIO_IN__ROLL:
			setRoll((Roll) newValue);
			return;
		case EsxPackage.PART_AUDIO_IN__SEQUENCE_DATA:
			setSequenceData((SequenceData) newValue);
			return;
		case EsxPackage.PART_AUDIO_IN__SEQUENCE_DATA_GATE:
			setSequenceDataGate((SequenceDataGate) newValue);
			return;
		case EsxPackage.PART_AUDIO_IN__RESERVED_BITS_BYTE7:
			setReservedBitsByte7((Byte) newValue);
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
		case EsxPackage.PART_AUDIO_IN__AMP_EG:
			setAmpEg(AMP_EG_EDEFAULT);
			return;
		case EsxPackage.PART_AUDIO_IN__BPM_SYNC:
			setBpmSync(BPM_SYNC_EDEFAULT);
			return;
		case EsxPackage.PART_AUDIO_IN__CUTOFF:
			setCutoff(CUTOFF_EDEFAULT);
			return;
		case EsxPackage.PART_AUDIO_IN__EG_INTENSITY:
			setEgIntensity(EG_INTENSITY_EDEFAULT);
			return;
		case EsxPackage.PART_AUDIO_IN__EG_TIME:
			setEgTime(EG_TIME_EDEFAULT);
			return;
		case EsxPackage.PART_AUDIO_IN__FILTER_TYPE:
			setFilterType(FILTER_TYPE_EDEFAULT);
			return;
		case EsxPackage.PART_AUDIO_IN__FX_SELECT:
			setFxSelect(FX_SELECT_EDEFAULT);
			return;
		case EsxPackage.PART_AUDIO_IN__FX_SEND:
			setFxSend(FX_SEND_EDEFAULT);
			return;
		case EsxPackage.PART_AUDIO_IN__MOD_DEPTH:
			setModDepth(MOD_DEPTH_EDEFAULT);
			return;
		case EsxPackage.PART_AUDIO_IN__MOD_DEST:
			setModDest(MOD_DEST_EDEFAULT);
			return;
		case EsxPackage.PART_AUDIO_IN__MOD_SPEED:
			setModSpeed(MOD_SPEED_EDEFAULT);
			return;
		case EsxPackage.PART_AUDIO_IN__MOD_TYPE:
			setModType(MOD_TYPE_EDEFAULT);
			return;
		case EsxPackage.PART_AUDIO_IN__PAN:
			setPan(PAN_EDEFAULT);
			return;
		case EsxPackage.PART_AUDIO_IN__RESERVED_BIT_AFTER_MOD_DEPTH:
			setReservedBitAfterModDepth(RESERVED_BIT_AFTER_MOD_DEPTH_EDEFAULT);
			return;
		case EsxPackage.PART_AUDIO_IN__RESONANCE:
			setResonance(RESONANCE_EDEFAULT);
			return;
		case EsxPackage.PART_AUDIO_IN__ROLL:
			setRoll(ROLL_EDEFAULT);
			return;
		case EsxPackage.PART_AUDIO_IN__SEQUENCE_DATA:
			setSequenceData((SequenceData) null);
			return;
		case EsxPackage.PART_AUDIO_IN__SEQUENCE_DATA_GATE:
			setSequenceDataGate((SequenceDataGate) null);
			return;
		case EsxPackage.PART_AUDIO_IN__RESERVED_BITS_BYTE7:
			setReservedBitsByte7(RESERVED_BITS_BYTE7_EDEFAULT);
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
		case EsxPackage.PART_AUDIO_IN__AMP_EG:
			return ampEg != AMP_EG_EDEFAULT;
		case EsxPackage.PART_AUDIO_IN__BPM_SYNC:
			return bpmSync != BPM_SYNC_EDEFAULT;
		case EsxPackage.PART_AUDIO_IN__CUTOFF:
			return cutoff != CUTOFF_EDEFAULT;
		case EsxPackage.PART_AUDIO_IN__EG_INTENSITY:
			return egIntensity != EG_INTENSITY_EDEFAULT;
		case EsxPackage.PART_AUDIO_IN__EG_TIME:
			return egTime != EG_TIME_EDEFAULT;
		case EsxPackage.PART_AUDIO_IN__FILTER_TYPE:
			return filterType != FILTER_TYPE_EDEFAULT;
		case EsxPackage.PART_AUDIO_IN__FX_SELECT:
			return fxSelect != FX_SELECT_EDEFAULT;
		case EsxPackage.PART_AUDIO_IN__FX_SEND:
			return fxSend != FX_SEND_EDEFAULT;
		case EsxPackage.PART_AUDIO_IN__MOD_DEPTH:
			return modDepth != MOD_DEPTH_EDEFAULT;
		case EsxPackage.PART_AUDIO_IN__MOD_DEST:
			return modDest != MOD_DEST_EDEFAULT;
		case EsxPackage.PART_AUDIO_IN__MOD_SPEED:
			return modSpeed != MOD_SPEED_EDEFAULT;
		case EsxPackage.PART_AUDIO_IN__MOD_TYPE:
			return modType != MOD_TYPE_EDEFAULT;
		case EsxPackage.PART_AUDIO_IN__PAN:
			return pan != PAN_EDEFAULT;
		case EsxPackage.PART_AUDIO_IN__RESERVED_BIT_AFTER_MOD_DEPTH:
			return reservedBitAfterModDepth != RESERVED_BIT_AFTER_MOD_DEPTH_EDEFAULT;
		case EsxPackage.PART_AUDIO_IN__RESONANCE:
			return resonance != RESONANCE_EDEFAULT;
		case EsxPackage.PART_AUDIO_IN__ROLL:
			return roll != ROLL_EDEFAULT;
		case EsxPackage.PART_AUDIO_IN__SEQUENCE_DATA:
			return sequenceData != null;
		case EsxPackage.PART_AUDIO_IN__SEQUENCE_DATA_GATE:
			return sequenceDataGate != null;
		case EsxPackage.PART_AUDIO_IN__RESERVED_BITS_BYTE7:
			return reservedBitsByte7 != RESERVED_BITS_BYTE7_EDEFAULT;
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
			case EsxPackage.PART_AUDIO_IN__AMP_EG:
				return EsxPackage.PART_WITH_COMMON__AMP_EG;
			case EsxPackage.PART_AUDIO_IN__BPM_SYNC:
				return EsxPackage.PART_WITH_COMMON__BPM_SYNC;
			case EsxPackage.PART_AUDIO_IN__CUTOFF:
				return EsxPackage.PART_WITH_COMMON__CUTOFF;
			case EsxPackage.PART_AUDIO_IN__EG_INTENSITY:
				return EsxPackage.PART_WITH_COMMON__EG_INTENSITY;
			case EsxPackage.PART_AUDIO_IN__EG_TIME:
				return EsxPackage.PART_WITH_COMMON__EG_TIME;
			case EsxPackage.PART_AUDIO_IN__FILTER_TYPE:
				return EsxPackage.PART_WITH_COMMON__FILTER_TYPE;
			case EsxPackage.PART_AUDIO_IN__FX_SELECT:
				return EsxPackage.PART_WITH_COMMON__FX_SELECT;
			case EsxPackage.PART_AUDIO_IN__FX_SEND:
				return EsxPackage.PART_WITH_COMMON__FX_SEND;
			case EsxPackage.PART_AUDIO_IN__MOD_DEPTH:
				return EsxPackage.PART_WITH_COMMON__MOD_DEPTH;
			case EsxPackage.PART_AUDIO_IN__MOD_DEST:
				return EsxPackage.PART_WITH_COMMON__MOD_DEST;
			case EsxPackage.PART_AUDIO_IN__MOD_SPEED:
				return EsxPackage.PART_WITH_COMMON__MOD_SPEED;
			case EsxPackage.PART_AUDIO_IN__MOD_TYPE:
				return EsxPackage.PART_WITH_COMMON__MOD_TYPE;
			case EsxPackage.PART_AUDIO_IN__PAN:
				return EsxPackage.PART_WITH_COMMON__PAN;
			case EsxPackage.PART_AUDIO_IN__RESERVED_BIT_AFTER_MOD_DEPTH:
				return EsxPackage.PART_WITH_COMMON__RESERVED_BIT_AFTER_MOD_DEPTH;
			case EsxPackage.PART_AUDIO_IN__RESONANCE:
				return EsxPackage.PART_WITH_COMMON__RESONANCE;
			case EsxPackage.PART_AUDIO_IN__ROLL:
				return EsxPackage.PART_WITH_COMMON__ROLL;
			default:
				return -1;
			}
		}
		if (baseClass == PartWithSequenceData.class) {
			switch (derivedFeatureID) {
			case EsxPackage.PART_AUDIO_IN__SEQUENCE_DATA:
				return EsxPackage.PART_WITH_SEQUENCE_DATA__SEQUENCE_DATA;
			default:
				return -1;
			}
		}
		if (baseClass == PartWithSequenceDataGate.class) {
			switch (derivedFeatureID) {
			case EsxPackage.PART_AUDIO_IN__SEQUENCE_DATA_GATE:
				return EsxPackage.PART_WITH_SEQUENCE_DATA_GATE__SEQUENCE_DATA_GATE;
			default:
				return -1;
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
			case EsxPackage.PART_WITH_COMMON__AMP_EG:
				return EsxPackage.PART_AUDIO_IN__AMP_EG;
			case EsxPackage.PART_WITH_COMMON__BPM_SYNC:
				return EsxPackage.PART_AUDIO_IN__BPM_SYNC;
			case EsxPackage.PART_WITH_COMMON__CUTOFF:
				return EsxPackage.PART_AUDIO_IN__CUTOFF;
			case EsxPackage.PART_WITH_COMMON__EG_INTENSITY:
				return EsxPackage.PART_AUDIO_IN__EG_INTENSITY;
			case EsxPackage.PART_WITH_COMMON__EG_TIME:
				return EsxPackage.PART_AUDIO_IN__EG_TIME;
			case EsxPackage.PART_WITH_COMMON__FILTER_TYPE:
				return EsxPackage.PART_AUDIO_IN__FILTER_TYPE;
			case EsxPackage.PART_WITH_COMMON__FX_SELECT:
				return EsxPackage.PART_AUDIO_IN__FX_SELECT;
			case EsxPackage.PART_WITH_COMMON__FX_SEND:
				return EsxPackage.PART_AUDIO_IN__FX_SEND;
			case EsxPackage.PART_WITH_COMMON__MOD_DEPTH:
				return EsxPackage.PART_AUDIO_IN__MOD_DEPTH;
			case EsxPackage.PART_WITH_COMMON__MOD_DEST:
				return EsxPackage.PART_AUDIO_IN__MOD_DEST;
			case EsxPackage.PART_WITH_COMMON__MOD_SPEED:
				return EsxPackage.PART_AUDIO_IN__MOD_SPEED;
			case EsxPackage.PART_WITH_COMMON__MOD_TYPE:
				return EsxPackage.PART_AUDIO_IN__MOD_TYPE;
			case EsxPackage.PART_WITH_COMMON__PAN:
				return EsxPackage.PART_AUDIO_IN__PAN;
			case EsxPackage.PART_WITH_COMMON__RESERVED_BIT_AFTER_MOD_DEPTH:
				return EsxPackage.PART_AUDIO_IN__RESERVED_BIT_AFTER_MOD_DEPTH;
			case EsxPackage.PART_WITH_COMMON__RESONANCE:
				return EsxPackage.PART_AUDIO_IN__RESONANCE;
			case EsxPackage.PART_WITH_COMMON__ROLL:
				return EsxPackage.PART_AUDIO_IN__ROLL;
			default:
				return -1;
			}
		}
		if (baseClass == PartWithSequenceData.class) {
			switch (baseFeatureID) {
			case EsxPackage.PART_WITH_SEQUENCE_DATA__SEQUENCE_DATA:
				return EsxPackage.PART_AUDIO_IN__SEQUENCE_DATA;
			default:
				return -1;
			}
		}
		if (baseClass == PartWithSequenceDataGate.class) {
			switch (baseFeatureID) {
			case EsxPackage.PART_WITH_SEQUENCE_DATA_GATE__SEQUENCE_DATA_GATE:
				return EsxPackage.PART_AUDIO_IN__SEQUENCE_DATA_GATE;
			default:
				return -1;
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
		if (eIsProxy())
			return super.toString();

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
		result.append(", reservedBitsByte7: ");
		result.append(reservedBitsByte7);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getLabel() {
		return SongEventPart.get(15).getLiteral();
	}

} //PartAudioInImpl

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

import com.skratchdot.electribe.model.esx.AmpEg;
import com.skratchdot.electribe.model.esx.BpmSync;
import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.FilterType;
import com.skratchdot.electribe.model.esx.FxSelect;
import com.skratchdot.electribe.model.esx.FxSend;
import com.skratchdot.electribe.model.esx.ModDest;
import com.skratchdot.electribe.model.esx.ModType;
import com.skratchdot.electribe.model.esx.PartWithCommon;

import com.skratchdot.electribe.model.esx.Roll;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part With Common</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartWithCommonImpl#getAmpEg <em>Amp Eg</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartWithCommonImpl#getBpmSync <em>Bpm Sync</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartWithCommonImpl#getCutoff <em>Cutoff</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartWithCommonImpl#getEgIntensity <em>Eg Intensity</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartWithCommonImpl#getEgTime <em>Eg Time</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartWithCommonImpl#getFilterType <em>Filter Type</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartWithCommonImpl#getFxSelect <em>Fx Select</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartWithCommonImpl#getFxSend <em>Fx Send</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartWithCommonImpl#getModDepth <em>Mod Depth</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartWithCommonImpl#getModDest <em>Mod Dest</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartWithCommonImpl#getModSpeed <em>Mod Speed</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartWithCommonImpl#getModType <em>Mod Type</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartWithCommonImpl#getPan <em>Pan</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartWithCommonImpl#getReservedBitAfterModDepth <em>Reserved Bit After Mod Depth</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartWithCommonImpl#getResonance <em>Resonance</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartWithCommonImpl#getRoll <em>Roll</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PartWithCommonImpl extends EObjectImpl implements PartWithCommon {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartWithCommonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsxPackage.Literals.PART_WITH_COMMON;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_WITH_COMMON__AMP_EG, oldAmpEg, ampEg));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_WITH_COMMON__BPM_SYNC, oldBpmSync, bpmSync));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_WITH_COMMON__CUTOFF, oldCutoff, cutoff));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_WITH_COMMON__EG_INTENSITY, oldEgIntensity, egIntensity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_WITH_COMMON__EG_TIME, oldEgTime, egTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_WITH_COMMON__FILTER_TYPE, oldFilterType, filterType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_WITH_COMMON__FX_SELECT, oldFxSelect, fxSelect));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_WITH_COMMON__FX_SEND, oldFxSend, fxSend));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_WITH_COMMON__MOD_DEPTH, oldModDepth, modDepth));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_WITH_COMMON__MOD_DEST, oldModDest, modDest));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_WITH_COMMON__MOD_SPEED, oldModSpeed, modSpeed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_WITH_COMMON__MOD_TYPE, oldModType, modType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_WITH_COMMON__PAN, oldPan, pan));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_WITH_COMMON__RESERVED_BIT_AFTER_MOD_DEPTH, oldReservedBitAfterModDepth, reservedBitAfterModDepth));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_WITH_COMMON__RESONANCE, oldResonance, resonance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_WITH_COMMON__ROLL, oldRoll, roll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EsxPackage.PART_WITH_COMMON__AMP_EG:
				return getAmpEg();
			case EsxPackage.PART_WITH_COMMON__BPM_SYNC:
				return getBpmSync();
			case EsxPackage.PART_WITH_COMMON__CUTOFF:
				return getCutoff();
			case EsxPackage.PART_WITH_COMMON__EG_INTENSITY:
				return getEgIntensity();
			case EsxPackage.PART_WITH_COMMON__EG_TIME:
				return getEgTime();
			case EsxPackage.PART_WITH_COMMON__FILTER_TYPE:
				return getFilterType();
			case EsxPackage.PART_WITH_COMMON__FX_SELECT:
				return getFxSelect();
			case EsxPackage.PART_WITH_COMMON__FX_SEND:
				return getFxSend();
			case EsxPackage.PART_WITH_COMMON__MOD_DEPTH:
				return getModDepth();
			case EsxPackage.PART_WITH_COMMON__MOD_DEST:
				return getModDest();
			case EsxPackage.PART_WITH_COMMON__MOD_SPEED:
				return getModSpeed();
			case EsxPackage.PART_WITH_COMMON__MOD_TYPE:
				return getModType();
			case EsxPackage.PART_WITH_COMMON__PAN:
				return getPan();
			case EsxPackage.PART_WITH_COMMON__RESERVED_BIT_AFTER_MOD_DEPTH:
				return getReservedBitAfterModDepth();
			case EsxPackage.PART_WITH_COMMON__RESONANCE:
				return getResonance();
			case EsxPackage.PART_WITH_COMMON__ROLL:
				return getRoll();
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
			case EsxPackage.PART_WITH_COMMON__AMP_EG:
				setAmpEg((AmpEg)newValue);
				return;
			case EsxPackage.PART_WITH_COMMON__BPM_SYNC:
				setBpmSync((BpmSync)newValue);
				return;
			case EsxPackage.PART_WITH_COMMON__CUTOFF:
				setCutoff((Byte)newValue);
				return;
			case EsxPackage.PART_WITH_COMMON__EG_INTENSITY:
				setEgIntensity((Byte)newValue);
				return;
			case EsxPackage.PART_WITH_COMMON__EG_TIME:
				setEgTime((Byte)newValue);
				return;
			case EsxPackage.PART_WITH_COMMON__FILTER_TYPE:
				setFilterType((FilterType)newValue);
				return;
			case EsxPackage.PART_WITH_COMMON__FX_SELECT:
				setFxSelect((FxSelect)newValue);
				return;
			case EsxPackage.PART_WITH_COMMON__FX_SEND:
				setFxSend((FxSend)newValue);
				return;
			case EsxPackage.PART_WITH_COMMON__MOD_DEPTH:
				setModDepth((Byte)newValue);
				return;
			case EsxPackage.PART_WITH_COMMON__MOD_DEST:
				setModDest((ModDest)newValue);
				return;
			case EsxPackage.PART_WITH_COMMON__MOD_SPEED:
				setModSpeed((Byte)newValue);
				return;
			case EsxPackage.PART_WITH_COMMON__MOD_TYPE:
				setModType((ModType)newValue);
				return;
			case EsxPackage.PART_WITH_COMMON__PAN:
				setPan((Byte)newValue);
				return;
			case EsxPackage.PART_WITH_COMMON__RESERVED_BIT_AFTER_MOD_DEPTH:
				setReservedBitAfterModDepth((Byte)newValue);
				return;
			case EsxPackage.PART_WITH_COMMON__RESONANCE:
				setResonance((Byte)newValue);
				return;
			case EsxPackage.PART_WITH_COMMON__ROLL:
				setRoll((Roll)newValue);
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
			case EsxPackage.PART_WITH_COMMON__AMP_EG:
				setAmpEg(AMP_EG_EDEFAULT);
				return;
			case EsxPackage.PART_WITH_COMMON__BPM_SYNC:
				setBpmSync(BPM_SYNC_EDEFAULT);
				return;
			case EsxPackage.PART_WITH_COMMON__CUTOFF:
				setCutoff(CUTOFF_EDEFAULT);
				return;
			case EsxPackage.PART_WITH_COMMON__EG_INTENSITY:
				setEgIntensity(EG_INTENSITY_EDEFAULT);
				return;
			case EsxPackage.PART_WITH_COMMON__EG_TIME:
				setEgTime(EG_TIME_EDEFAULT);
				return;
			case EsxPackage.PART_WITH_COMMON__FILTER_TYPE:
				setFilterType(FILTER_TYPE_EDEFAULT);
				return;
			case EsxPackage.PART_WITH_COMMON__FX_SELECT:
				setFxSelect(FX_SELECT_EDEFAULT);
				return;
			case EsxPackage.PART_WITH_COMMON__FX_SEND:
				setFxSend(FX_SEND_EDEFAULT);
				return;
			case EsxPackage.PART_WITH_COMMON__MOD_DEPTH:
				setModDepth(MOD_DEPTH_EDEFAULT);
				return;
			case EsxPackage.PART_WITH_COMMON__MOD_DEST:
				setModDest(MOD_DEST_EDEFAULT);
				return;
			case EsxPackage.PART_WITH_COMMON__MOD_SPEED:
				setModSpeed(MOD_SPEED_EDEFAULT);
				return;
			case EsxPackage.PART_WITH_COMMON__MOD_TYPE:
				setModType(MOD_TYPE_EDEFAULT);
				return;
			case EsxPackage.PART_WITH_COMMON__PAN:
				setPan(PAN_EDEFAULT);
				return;
			case EsxPackage.PART_WITH_COMMON__RESERVED_BIT_AFTER_MOD_DEPTH:
				setReservedBitAfterModDepth(RESERVED_BIT_AFTER_MOD_DEPTH_EDEFAULT);
				return;
			case EsxPackage.PART_WITH_COMMON__RESONANCE:
				setResonance(RESONANCE_EDEFAULT);
				return;
			case EsxPackage.PART_WITH_COMMON__ROLL:
				setRoll(ROLL_EDEFAULT);
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
			case EsxPackage.PART_WITH_COMMON__AMP_EG:
				return ampEg != AMP_EG_EDEFAULT;
			case EsxPackage.PART_WITH_COMMON__BPM_SYNC:
				return bpmSync != BPM_SYNC_EDEFAULT;
			case EsxPackage.PART_WITH_COMMON__CUTOFF:
				return cutoff != CUTOFF_EDEFAULT;
			case EsxPackage.PART_WITH_COMMON__EG_INTENSITY:
				return egIntensity != EG_INTENSITY_EDEFAULT;
			case EsxPackage.PART_WITH_COMMON__EG_TIME:
				return egTime != EG_TIME_EDEFAULT;
			case EsxPackage.PART_WITH_COMMON__FILTER_TYPE:
				return filterType != FILTER_TYPE_EDEFAULT;
			case EsxPackage.PART_WITH_COMMON__FX_SELECT:
				return fxSelect != FX_SELECT_EDEFAULT;
			case EsxPackage.PART_WITH_COMMON__FX_SEND:
				return fxSend != FX_SEND_EDEFAULT;
			case EsxPackage.PART_WITH_COMMON__MOD_DEPTH:
				return modDepth != MOD_DEPTH_EDEFAULT;
			case EsxPackage.PART_WITH_COMMON__MOD_DEST:
				return modDest != MOD_DEST_EDEFAULT;
			case EsxPackage.PART_WITH_COMMON__MOD_SPEED:
				return modSpeed != MOD_SPEED_EDEFAULT;
			case EsxPackage.PART_WITH_COMMON__MOD_TYPE:
				return modType != MOD_TYPE_EDEFAULT;
			case EsxPackage.PART_WITH_COMMON__PAN:
				return pan != PAN_EDEFAULT;
			case EsxPackage.PART_WITH_COMMON__RESERVED_BIT_AFTER_MOD_DEPTH:
				return reservedBitAfterModDepth != RESERVED_BIT_AFTER_MOD_DEPTH_EDEFAULT;
			case EsxPackage.PART_WITH_COMMON__RESONANCE:
				return resonance != RESONANCE_EDEFAULT;
			case EsxPackage.PART_WITH_COMMON__ROLL:
				return roll != ROLL_EDEFAULT;
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
		result.append(')');
		return result.toString();
	}

} //PartWithCommonImpl

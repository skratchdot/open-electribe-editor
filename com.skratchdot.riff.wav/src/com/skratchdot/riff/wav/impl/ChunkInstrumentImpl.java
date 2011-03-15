/**
 * Copyright (c) 2009-2011 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Initial modeling finished using information provided by:
 * 	http://www.sonicspot.com/guide/wavefiles.html
 * 
 * Contributors:
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 *
 * $Id$
 */
package com.skratchdot.riff.wav.impl;

import java.nio.ByteOrder;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.skratchdot.riff.wav.ChunkInstrument;
import com.skratchdot.riff.wav.ChunkTypeID;
import com.skratchdot.riff.wav.RIFFWave;
import com.skratchdot.riff.wav.WavPackage;
import com.skratchdot.riff.wav.util.ExtendedByteBuffer;
import com.skratchdot.riff.wav.util.RiffWaveException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chunk Instrument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkInstrumentImpl#getUnshiftedNote <em>Unshifted Note</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkInstrumentImpl#getFineTune <em>Fine Tune</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkInstrumentImpl#getGain <em>Gain</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkInstrumentImpl#getLowNote <em>Low Note</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkInstrumentImpl#getHighNote <em>High Note</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkInstrumentImpl#getLowVelocity <em>Low Velocity</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkInstrumentImpl#getHighVelocity <em>High Velocity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChunkInstrumentImpl extends ChunkImpl implements ChunkInstrument {
	/**
	 * The default value of the '{@link #getUnshiftedNote() <em>Unshifted Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnshiftedNote()
	 * @generated
	 * @ordered
	 */
	protected static final byte UNSHIFTED_NOTE_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getUnshiftedNote() <em>Unshifted Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnshiftedNote()
	 * @generated
	 * @ordered
	 */
	protected byte unshiftedNote = UNSHIFTED_NOTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFineTune() <em>Fine Tune</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFineTune()
	 * @generated
	 * @ordered
	 */
	protected static final byte FINE_TUNE_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getFineTune() <em>Fine Tune</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFineTune()
	 * @generated
	 * @ordered
	 */
	protected byte fineTune = FINE_TUNE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGain() <em>Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGain()
	 * @generated
	 * @ordered
	 */
	protected static final byte GAIN_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getGain() <em>Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGain()
	 * @generated
	 * @ordered
	 */
	protected byte gain = GAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowNote() <em>Low Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowNote()
	 * @generated
	 * @ordered
	 */
	protected static final byte LOW_NOTE_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getLowNote() <em>Low Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowNote()
	 * @generated
	 * @ordered
	 */
	protected byte lowNote = LOW_NOTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHighNote() <em>High Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighNote()
	 * @generated
	 * @ordered
	 */
	protected static final byte HIGH_NOTE_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getHighNote() <em>High Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighNote()
	 * @generated
	 * @ordered
	 */
	protected byte highNote = HIGH_NOTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowVelocity() <em>Low Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final byte LOW_VELOCITY_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getLowVelocity() <em>Low Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowVelocity()
	 * @generated
	 * @ordered
	 */
	protected byte lowVelocity = LOW_VELOCITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getHighVelocity() <em>High Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final byte HIGH_VELOCITY_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getHighVelocity() <em>High Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighVelocity()
	 * @generated
	 * @ordered
	 */
	protected byte highVelocity = HIGH_VELOCITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChunkInstrumentImpl() {
		super();
	}

	@Override
	public void init(RIFFWave riffWave, ExtendedByteBuffer buf) throws RiffWaveException {
		// Check Chunk Type ID
		if(ChunkTypeID.get((int)buf.getUnsignedInt())!=this.getChunkTypeID())
			throw new RiffWaveException("Invalid Chunk ID for "+this.getChunkTypeID().getLiteral());

		// Read in data size
		if(buf.getUnsignedInt()!=this.getSize())
			throw new RiffWaveException("inst Chunk Size is too big. Should be 7.");

		this.setUnshiftedNote(buf.getByte());
		this.setFineTune(buf.getByte());
		this.setGain(buf.getByte());
		this.setLowNote(buf.getByte());
		this.setHighNote(buf.getByte());
		this.setLowVelocity(buf.getByte());
		this.setHighVelocity(buf.getByte());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavPackage.Literals.CHUNK_INSTRUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getUnshiftedNote() {
		return unshiftedNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnshiftedNote(byte newUnshiftedNote) {
		byte oldUnshiftedNote = unshiftedNote;
		unshiftedNote = newUnshiftedNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_INSTRUMENT__UNSHIFTED_NOTE, oldUnshiftedNote, unshiftedNote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getFineTune() {
		return fineTune;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFineTune(byte newFineTune) {
		byte oldFineTune = fineTune;
		fineTune = newFineTune;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_INSTRUMENT__FINE_TUNE, oldFineTune, fineTune));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getGain() {
		return gain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGain(byte newGain) {
		byte oldGain = gain;
		gain = newGain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_INSTRUMENT__GAIN, oldGain, gain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getLowNote() {
		return lowNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowNote(byte newLowNote) {
		byte oldLowNote = lowNote;
		lowNote = newLowNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_INSTRUMENT__LOW_NOTE, oldLowNote, lowNote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getHighNote() {
		return highNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHighNote(byte newHighNote) {
		byte oldHighNote = highNote;
		highNote = newHighNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_INSTRUMENT__HIGH_NOTE, oldHighNote, highNote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getLowVelocity() {
		return lowVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowVelocity(byte newLowVelocity) {
		byte oldLowVelocity = lowVelocity;
		lowVelocity = newLowVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_INSTRUMENT__LOW_VELOCITY, oldLowVelocity, lowVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getHighVelocity() {
		return highVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHighVelocity(byte newHighVelocity) {
		byte oldHighVelocity = highVelocity;
		highVelocity = newHighVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_INSTRUMENT__HIGH_VELOCITY, oldHighVelocity, highVelocity));
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getChunkTypeID()
	 */
	@Override
	public ChunkTypeID getChunkTypeID() {
		return ChunkTypeID.INST;
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getChunkTypeIDValue()
	 */
	@Override
	public int getChunkTypeIDValue() {
		return ChunkTypeID.INST_VALUE;
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getSize()
	 */
	@Override
	public long getSize() {
		return 7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WavPackage.CHUNK_INSTRUMENT__UNSHIFTED_NOTE:
				return getUnshiftedNote();
			case WavPackage.CHUNK_INSTRUMENT__FINE_TUNE:
				return getFineTune();
			case WavPackage.CHUNK_INSTRUMENT__GAIN:
				return getGain();
			case WavPackage.CHUNK_INSTRUMENT__LOW_NOTE:
				return getLowNote();
			case WavPackage.CHUNK_INSTRUMENT__HIGH_NOTE:
				return getHighNote();
			case WavPackage.CHUNK_INSTRUMENT__LOW_VELOCITY:
				return getLowVelocity();
			case WavPackage.CHUNK_INSTRUMENT__HIGH_VELOCITY:
				return getHighVelocity();
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
			case WavPackage.CHUNK_INSTRUMENT__UNSHIFTED_NOTE:
				setUnshiftedNote((Byte)newValue);
				return;
			case WavPackage.CHUNK_INSTRUMENT__FINE_TUNE:
				setFineTune((Byte)newValue);
				return;
			case WavPackage.CHUNK_INSTRUMENT__GAIN:
				setGain((Byte)newValue);
				return;
			case WavPackage.CHUNK_INSTRUMENT__LOW_NOTE:
				setLowNote((Byte)newValue);
				return;
			case WavPackage.CHUNK_INSTRUMENT__HIGH_NOTE:
				setHighNote((Byte)newValue);
				return;
			case WavPackage.CHUNK_INSTRUMENT__LOW_VELOCITY:
				setLowVelocity((Byte)newValue);
				return;
			case WavPackage.CHUNK_INSTRUMENT__HIGH_VELOCITY:
				setHighVelocity((Byte)newValue);
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
			case WavPackage.CHUNK_INSTRUMENT__UNSHIFTED_NOTE:
				setUnshiftedNote(UNSHIFTED_NOTE_EDEFAULT);
				return;
			case WavPackage.CHUNK_INSTRUMENT__FINE_TUNE:
				setFineTune(FINE_TUNE_EDEFAULT);
				return;
			case WavPackage.CHUNK_INSTRUMENT__GAIN:
				setGain(GAIN_EDEFAULT);
				return;
			case WavPackage.CHUNK_INSTRUMENT__LOW_NOTE:
				setLowNote(LOW_NOTE_EDEFAULT);
				return;
			case WavPackage.CHUNK_INSTRUMENT__HIGH_NOTE:
				setHighNote(HIGH_NOTE_EDEFAULT);
				return;
			case WavPackage.CHUNK_INSTRUMENT__LOW_VELOCITY:
				setLowVelocity(LOW_VELOCITY_EDEFAULT);
				return;
			case WavPackage.CHUNK_INSTRUMENT__HIGH_VELOCITY:
				setHighVelocity(HIGH_VELOCITY_EDEFAULT);
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
			case WavPackage.CHUNK_INSTRUMENT__UNSHIFTED_NOTE:
				return unshiftedNote != UNSHIFTED_NOTE_EDEFAULT;
			case WavPackage.CHUNK_INSTRUMENT__FINE_TUNE:
				return fineTune != FINE_TUNE_EDEFAULT;
			case WavPackage.CHUNK_INSTRUMENT__GAIN:
				return gain != GAIN_EDEFAULT;
			case WavPackage.CHUNK_INSTRUMENT__LOW_NOTE:
				return lowNote != LOW_NOTE_EDEFAULT;
			case WavPackage.CHUNK_INSTRUMENT__HIGH_NOTE:
				return highNote != HIGH_NOTE_EDEFAULT;
			case WavPackage.CHUNK_INSTRUMENT__LOW_VELOCITY:
				return lowVelocity != LOW_VELOCITY_EDEFAULT;
			case WavPackage.CHUNK_INSTRUMENT__HIGH_VELOCITY:
				return highVelocity != HIGH_VELOCITY_EDEFAULT;
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
		result.append(" (unshiftedNote: ");
		result.append(unshiftedNote);
		result.append(", fineTune: ");
		result.append(fineTune);
		result.append(", gain: ");
		result.append(gain);
		result.append(", lowNote: ");
		result.append(lowNote);
		result.append(", highNote: ");
		result.append(highNote);
		result.append(", lowVelocity: ");
		result.append(lowVelocity);
		result.append(", highVelocity: ");
		result.append(highVelocity);
		result.append(')');
		return result.toString();
	}

	@Override
	public byte[] toByteArray() {
		ExtendedByteBuffer buf = new ExtendedByteBuffer((int) this.getSize()+8);
		buf.order(ByteOrder.LITTLE_ENDIAN);

		buf.putUnsignedInt(this.getChunkTypeIDValue());
		buf.putUnsignedInt(this.getSize());
		buf.putByte(this.getUnshiftedNote());
		buf.putByte(this.getFineTune());
		buf.putByte(this.getGain());
		buf.putByte(this.getLowNote());
		buf.putByte(this.getHighNote());
		buf.putByte(this.getLowVelocity());
		buf.putByte(this.getHighVelocity());

		return buf.array();
	}


} //ChunkInstrumentImpl

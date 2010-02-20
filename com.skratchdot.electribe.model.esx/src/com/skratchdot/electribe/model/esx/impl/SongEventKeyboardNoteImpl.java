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

import java.io.IOException;
import java.nio.ByteBuffer;

import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.SongEventKeyboardNote;
import com.skratchdot.electribe.model.esx.SongEventWithPart;
import com.skratchdot.electribe.model.esx.util.EsxException;
import com.skratchdot.electribe.model.esx.util.EsxRandomAccess;
import com.skratchdot.electribe.model.esx.util.EsxUtil;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Song Event Keyboard Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongEventKeyboardNoteImpl#getPart <em>Part</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongEventKeyboardNoteImpl#getLength <em>Length</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongEventKeyboardNoteImpl#getNoteNumber <em>Note Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SongEventKeyboardNoteImpl extends SongEventImpl implements SongEventKeyboardNote {
	/**
	 * The default value of the '{@link #getPart() <em>Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected static final byte PART_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getPart() <em>Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected byte part = PART_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final short LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected short length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoteNumber() <em>Note Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteNumber()
	 * @generated
	 * @ordered
	 */
	protected static final byte NOTE_NUMBER_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getNoteNumber() <em>Note Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteNumber()
	 * @generated
	 * @ordered
	 */
	protected byte noteNumber = NOTE_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SongEventKeyboardNoteImpl() {
		super();
	}

	public SongEventKeyboardNoteImpl(EsxRandomAccess in, int songEventNumber) throws EsxException, IOException {
		super();

		// Stop immediately if we are passed an invalid songEventNumber
		if (songEventNumber >= EsxUtil.MAX_NUM_SONG_EVENTS || songEventNumber < 0)
			throw new EsxException("Invalid songEventNumber: " + songEventNumber);

		// Jump to the start of songEventNumber's data
		in.seek(EsxUtil.ADDR_SONG_EVENT_DATA + (songEventNumber * EsxUtil.CHUNKSIZE_SONG_EVENT));

		// byte 0
		this.setPositionNumber(in.readByte());

		// byte 1
		int packedByte1 = in.readUnsignedByte();
		this.setStep((byte) EsxUtil.unpackInt(packedByte1, 4, 0));
		this.setMeasure((byte) EsxUtil.unpackInt(packedByte1, 4, 4));

		// bytes 2~3
		this.setOperationNumber(in.readShort());

		// byte 4
		this.setPart(in.readByte());

		// byte 5
		this.setNoteNumber(in.readByte());

		// bytes 6~7
		this.setLength(in.readShort());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsxPackage.Literals.SONG_EVENT_KEYBOARD_NOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getPart() {
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPart(byte newPart) {
		byte oldPart = part;
		part = newPart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SONG_EVENT_KEYBOARD_NOTE__PART, oldPart, part));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(short newLength) {
		short oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SONG_EVENT_KEYBOARD_NOTE__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getNoteNumber() {
		return noteNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoteNumber(byte newNoteNumber) {
		byte oldNoteNumber = noteNumber;
		noteNumber = newNoteNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SONG_EVENT_KEYBOARD_NOTE__NOTE_NUMBER, oldNoteNumber, noteNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public byte[] toByteArray() {
		ByteBuffer buf = ByteBuffer.allocate(EsxUtil.CHUNKSIZE_SONG_EVENT);
		// byte 0
		buf.put(this.getPositionNumber());
		// byte 1
		int packedByte1 = 0x00;
		packedByte1 = EsxUtil.packInt(packedByte1, this.getStep(), 4, 0);
		packedByte1 = EsxUtil.packInt(packedByte1, this.getMeasure(), 4, 4);
		buf.put((byte) packedByte1);
		// bytes 2~3
		buf.putShort(this.getOperationNumber());
		// byte 4
		buf.put(this.getPart());
		// byte 5
		buf.put(this.getNoteNumber());
		// bytes 6~7
		buf.putShort(this.getLength());
		return buf.array();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EsxPackage.SONG_EVENT_KEYBOARD_NOTE__PART:
				return getPart();
			case EsxPackage.SONG_EVENT_KEYBOARD_NOTE__LENGTH:
				return getLength();
			case EsxPackage.SONG_EVENT_KEYBOARD_NOTE__NOTE_NUMBER:
				return getNoteNumber();
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
			case EsxPackage.SONG_EVENT_KEYBOARD_NOTE__PART:
				setPart((Byte)newValue);
				return;
			case EsxPackage.SONG_EVENT_KEYBOARD_NOTE__LENGTH:
				setLength((Short)newValue);
				return;
			case EsxPackage.SONG_EVENT_KEYBOARD_NOTE__NOTE_NUMBER:
				setNoteNumber((Byte)newValue);
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
			case EsxPackage.SONG_EVENT_KEYBOARD_NOTE__PART:
				setPart(PART_EDEFAULT);
				return;
			case EsxPackage.SONG_EVENT_KEYBOARD_NOTE__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case EsxPackage.SONG_EVENT_KEYBOARD_NOTE__NOTE_NUMBER:
				setNoteNumber(NOTE_NUMBER_EDEFAULT);
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
			case EsxPackage.SONG_EVENT_KEYBOARD_NOTE__PART:
				return part != PART_EDEFAULT;
			case EsxPackage.SONG_EVENT_KEYBOARD_NOTE__LENGTH:
				return length != LENGTH_EDEFAULT;
			case EsxPackage.SONG_EVENT_KEYBOARD_NOTE__NOTE_NUMBER:
				return noteNumber != NOTE_NUMBER_EDEFAULT;
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
		if (baseClass == SongEventWithPart.class) {
			switch (derivedFeatureID) {
				case EsxPackage.SONG_EVENT_KEYBOARD_NOTE__PART: return EsxPackage.SONG_EVENT_WITH_PART__PART;
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
		if (baseClass == SongEventWithPart.class) {
			switch (baseFeatureID) {
				case EsxPackage.SONG_EVENT_WITH_PART__PART: return EsxPackage.SONG_EVENT_KEYBOARD_NOTE__PART;
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
		result.append(" (part: ");
		result.append(part);
		result.append(", length: ");
		result.append(length);
		result.append(", noteNumber: ");
		result.append(noteNumber);
		result.append(')');
		return result.toString();
	}

	@Override
	public void write(EsxRandomAccess out, int songEventNumber)
			throws EsxException, IOException {
		// Stop immediately if we are passed an invalid songEventNumber
		if (songEventNumber > EsxUtil.MAX_NUM_SONG_EVENTS || songEventNumber < 0)
			throw new EsxException("Invalid songEventNumber: " + songEventNumber);

		// Jump to the start of songNumber's data
		out.seek(EsxUtil.ADDR_SONG_EVENT_DATA + (songEventNumber * EsxUtil.CHUNKSIZE_SONG_EVENT));

		// byte 0
		out.writeByte(this.getPositionNumber());

		// byte 1
		int packedByte1 = 0x00;
		packedByte1 = EsxUtil.packInt(packedByte1, this.getStep(), 4, 0);
		packedByte1 = EsxUtil.packInt(packedByte1, this.getMeasure(), 4, 4);
		out.writeByte(packedByte1);

		// bytes 2~3
		out.writeShort(this.getOperationNumber());

		// byte 4
		out.writeByte(this.getPart());

		// byte 5
		out.writeByte(this.getNoteNumber());

		// bytes 6~7
		out.writeShort(this.getLength());

	}

} //SongEventKeyboardNoteImpl

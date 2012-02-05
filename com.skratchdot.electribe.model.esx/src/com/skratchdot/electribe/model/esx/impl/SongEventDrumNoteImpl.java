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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.SongEventDrumNote;
import com.skratchdot.electribe.model.esx.SongEventPart;
import com.skratchdot.electribe.model.esx.SongEventWithPart;
import com.skratchdot.electribe.model.esx.util.EsxUtil;
import com.skratchdot.electribe.model.esx.util.ExtendedByteBuffer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Song Event Drum Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongEventDrumNoteImpl#getPart <em>Part</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongEventDrumNoteImpl#getReservedByte <em>Reserved Byte</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongEventDrumNoteImpl#getReservedShort <em>Reserved Short</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SongEventDrumNoteImpl extends SongEventImpl implements SongEventDrumNote {
	/**
	 * The default value of the '{@link #getPart() <em>Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected static final SongEventPart PART_EDEFAULT = SongEventPart.NAME_00;

	/**
	 * The cached value of the '{@link #getPart() <em>Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected SongEventPart part = PART_EDEFAULT;

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
	 * The default value of the '{@link #getReservedShort() <em>Reserved Short</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedShort()
	 * @generated
	 * @ordered
	 */
	protected static final short RESERVED_SHORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReservedShort() <em>Reserved Short</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedShort()
	 * @generated
	 * @ordered
	 */
	protected short reservedShort = RESERVED_SHORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SongEventDrumNoteImpl() {
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
		this.setPositionNumber(in.getByte());
		// byte 1
		int packedByte1 = in.getUnsignedByte();
		this.setStep((byte) EsxUtil.unpackInt(packedByte1, 4, 0));
		this.setMeasure((byte) EsxUtil.unpackInt(packedByte1, 4, 4));
		// bytes 2~3
		this.setOperationNumber(in.getShort());
		// byte 4
		this.setPart(SongEventPart.get(in.getByte()));
		// byte 5
		this.setReservedByte(in.getByte());
		// bytes 6~7
		this.setReservedShort(in.getShort());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsxPackage.Literals.SONG_EVENT_DRUM_NOTE;
	}

	@Override
	public String getEventInfo() {
		return this.getPart().getLiteral();
	}

	@Override
	public String getEventType() {
		return "Drum Note";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SongEventPart getPart() {
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPart(SongEventPart newPart) {
		SongEventPart oldPart = part;
		part = newPart == null ? PART_EDEFAULT : newPart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SONG_EVENT_DRUM_NOTE__PART, oldPart, part));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SONG_EVENT_DRUM_NOTE__RESERVED_BYTE, oldReservedByte, reservedByte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getReservedShort() {
		return reservedShort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservedShort(short newReservedShort) {
		short oldReservedShort = reservedShort;
		reservedShort = newReservedShort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SONG_EVENT_DRUM_NOTE__RESERVED_SHORT, oldReservedShort, reservedShort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public byte[] toByteArray() {
		ExtendedByteBuffer buf = new ExtendedByteBuffer(EsxUtil.CHUNKSIZE_SONG_EVENT);
		// byte 0
		buf.putByte(this.getPositionNumber());
		// byte 1
		int packedByte1 = 0x00;
		packedByte1 = EsxUtil.packInt(packedByte1, this.getStep(), 4, 0);
		packedByte1 = EsxUtil.packInt(packedByte1, this.getMeasure(), 4, 4);
		buf.putUnsignedByte(packedByte1);
		// bytes 2~3
		buf.putShort(this.getOperationNumber());
		// byte 4
		buf.putUnsignedByte(this.getPart().getValue());
		// byte 5
		buf.putByte(this.getReservedByte());
		// bytes 6~7
		buf.putShort(this.getReservedShort());
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
			case EsxPackage.SONG_EVENT_DRUM_NOTE__PART:
				return getPart();
			case EsxPackage.SONG_EVENT_DRUM_NOTE__RESERVED_BYTE:
				return getReservedByte();
			case EsxPackage.SONG_EVENT_DRUM_NOTE__RESERVED_SHORT:
				return getReservedShort();
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
			case EsxPackage.SONG_EVENT_DRUM_NOTE__PART:
				setPart((SongEventPart)newValue);
				return;
			case EsxPackage.SONG_EVENT_DRUM_NOTE__RESERVED_BYTE:
				setReservedByte((Byte)newValue);
				return;
			case EsxPackage.SONG_EVENT_DRUM_NOTE__RESERVED_SHORT:
				setReservedShort((Short)newValue);
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
			case EsxPackage.SONG_EVENT_DRUM_NOTE__PART:
				setPart(PART_EDEFAULT);
				return;
			case EsxPackage.SONG_EVENT_DRUM_NOTE__RESERVED_BYTE:
				setReservedByte(RESERVED_BYTE_EDEFAULT);
				return;
			case EsxPackage.SONG_EVENT_DRUM_NOTE__RESERVED_SHORT:
				setReservedShort(RESERVED_SHORT_EDEFAULT);
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
			case EsxPackage.SONG_EVENT_DRUM_NOTE__PART:
				return part != PART_EDEFAULT;
			case EsxPackage.SONG_EVENT_DRUM_NOTE__RESERVED_BYTE:
				return reservedByte != RESERVED_BYTE_EDEFAULT;
			case EsxPackage.SONG_EVENT_DRUM_NOTE__RESERVED_SHORT:
				return reservedShort != RESERVED_SHORT_EDEFAULT;
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
				case EsxPackage.SONG_EVENT_DRUM_NOTE__PART: return EsxPackage.SONG_EVENT_WITH_PART__PART;
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
				case EsxPackage.SONG_EVENT_WITH_PART__PART: return EsxPackage.SONG_EVENT_DRUM_NOTE__PART;
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
		result.append(", reservedByte: ");
		result.append(reservedByte);
		result.append(", reservedShort: ");
		result.append(reservedShort);
		result.append(')');
		return result.toString();
	}

} //SongEventDrumNoteImpl

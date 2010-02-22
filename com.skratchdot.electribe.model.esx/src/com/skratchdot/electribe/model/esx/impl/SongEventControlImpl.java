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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.SongEventControl;
import com.skratchdot.electribe.model.esx.util.EsxUtil;
import com.skratchdot.electribe.model.esx.util.ExtendedByteBuffer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Song Event Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongEventControlImpl#getValue <em>Value</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongEventControlImpl#getReservedByte <em>Reserved Byte</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongEventControlImpl#getReservedShort <em>Reserved Short</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SongEventControlImpl extends SongEventImpl implements SongEventControl {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final byte VALUE_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected byte value = VALUE_EDEFAULT;

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
	protected static final short RESERVED_SHORT_EDEFAULT = -21846;

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
	protected SongEventControlImpl() {
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
		this.setReservedByte(in.getByte());
		// byte 5
		this.setValue(in.getByte());
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
		return EsxPackage.Literals.SONG_EVENT_CONTROL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(byte newValue) {
		byte oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SONG_EVENT_CONTROL__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SONG_EVENT_CONTROL__RESERVED_BYTE, oldReservedByte, reservedByte));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SONG_EVENT_CONTROL__RESERVED_SHORT, oldReservedShort, reservedShort));
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
		buf.putByte(this.getReservedByte());
		// byte 5
		buf.putByte(this.getValue());
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
			case EsxPackage.SONG_EVENT_CONTROL__VALUE:
				return getValue();
			case EsxPackage.SONG_EVENT_CONTROL__RESERVED_BYTE:
				return getReservedByte();
			case EsxPackage.SONG_EVENT_CONTROL__RESERVED_SHORT:
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
			case EsxPackage.SONG_EVENT_CONTROL__VALUE:
				setValue((Byte)newValue);
				return;
			case EsxPackage.SONG_EVENT_CONTROL__RESERVED_BYTE:
				setReservedByte((Byte)newValue);
				return;
			case EsxPackage.SONG_EVENT_CONTROL__RESERVED_SHORT:
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
			case EsxPackage.SONG_EVENT_CONTROL__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case EsxPackage.SONG_EVENT_CONTROL__RESERVED_BYTE:
				setReservedByte(RESERVED_BYTE_EDEFAULT);
				return;
			case EsxPackage.SONG_EVENT_CONTROL__RESERVED_SHORT:
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
			case EsxPackage.SONG_EVENT_CONTROL__VALUE:
				return value != VALUE_EDEFAULT;
			case EsxPackage.SONG_EVENT_CONTROL__RESERVED_BYTE:
				return reservedByte != RESERVED_BYTE_EDEFAULT;
			case EsxPackage.SONG_EVENT_CONTROL__RESERVED_SHORT:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(", reservedByte: ");
		result.append(reservedByte);
		result.append(", reservedShort: ");
		result.append(reservedShort);
		result.append(')');
		return result.toString();
	}

} //SongEventControlImpl

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

import com.skratchdot.electribe.model.esx.EsxFactory;
import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.SongEventTempo;
import com.skratchdot.electribe.model.esx.Tempo;
import com.skratchdot.electribe.model.esx.util.EsxUtil;
import com.skratchdot.electribe.model.esx.util.ExtendedByteBuffer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Song Event Tempo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongEventTempoImpl#getReservedShort <em>Reserved Short</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongEventTempoImpl#getTempo <em>Tempo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SongEventTempoImpl extends SongEventImpl implements SongEventTempo {
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
	 * The cached value of the '{@link #getTempo() <em>Tempo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempo()
	 * @generated
	 * @ordered
	 */
	protected Tempo tempo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SongEventTempoImpl() {
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
		// bytes 4~5
		this.setReservedShort(in.getShort());
		// bytes 6~7
		Tempo newTempo = EsxFactory.eINSTANCE.createTempo();
		newTempo.setCurrentValueFromShort(in.getShort());
		this.setTempo(newTempo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsxPackage.Literals.SONG_EVENT_TEMPO;
	}

	@Override
	public String getEventInfo() {
		return "" + this.getTempo().getValue();
	}

	@Override
	public String getEventType() {
		return "Tempo";
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
					Notification.SET, EsxPackage.SONG_EVENT_TEMPO__TEMPO,
					oldTempo, newTempo);
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
						EOPPOSITE_FEATURE_BASE
								- EsxPackage.SONG_EVENT_TEMPO__TEMPO, null,
						msgs);
			if (newTempo != null)
				msgs = ((InternalEObject) newTempo).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- EsxPackage.SONG_EVENT_TEMPO__TEMPO, null,
						msgs);
			msgs = basicSetTempo(newTempo, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.SONG_EVENT_TEMPO__TEMPO, newTempo, newTempo));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.SONG_EVENT_TEMPO__RESERVED_SHORT,
					oldReservedShort, reservedShort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public byte[] toByteArray() {
		ExtendedByteBuffer buf = new ExtendedByteBuffer(
				EsxUtil.CHUNKSIZE_SONG_EVENT);
		// byte 0
		buf.putByte(this.getPositionNumber());
		// byte 1
		int packedByte1 = 0x00;
		packedByte1 = EsxUtil.packInt(packedByte1, this.getStep(), 4, 0);
		packedByte1 = EsxUtil.packInt(packedByte1, this.getMeasure(), 4, 4);
		buf.putUnsignedByte(packedByte1);
		// bytes 2~3
		buf.putShort(this.getOperationNumber());
		// bytes 4~5
		buf.putShort(this.getReservedShort());
		// bytes 6~7
		buf.putShort(this.getTempo().getShortFromCurrentValue());
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
		case EsxPackage.SONG_EVENT_TEMPO__TEMPO:
			return basicSetTempo(null, msgs);
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
		case EsxPackage.SONG_EVENT_TEMPO__RESERVED_SHORT:
			return getReservedShort();
		case EsxPackage.SONG_EVENT_TEMPO__TEMPO:
			return getTempo();
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
		case EsxPackage.SONG_EVENT_TEMPO__RESERVED_SHORT:
			setReservedShort((Short) newValue);
			return;
		case EsxPackage.SONG_EVENT_TEMPO__TEMPO:
			setTempo((Tempo) newValue);
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
		case EsxPackage.SONG_EVENT_TEMPO__RESERVED_SHORT:
			setReservedShort(RESERVED_SHORT_EDEFAULT);
			return;
		case EsxPackage.SONG_EVENT_TEMPO__TEMPO:
			setTempo((Tempo) null);
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
		case EsxPackage.SONG_EVENT_TEMPO__RESERVED_SHORT:
			return reservedShort != RESERVED_SHORT_EDEFAULT;
		case EsxPackage.SONG_EVENT_TEMPO__TEMPO:
			return tempo != null;
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
		result.append(" (reservedShort: ");
		result.append(reservedShort);
		result.append(')');
		return result.toString();
	}

} //SongEventTempoImpl

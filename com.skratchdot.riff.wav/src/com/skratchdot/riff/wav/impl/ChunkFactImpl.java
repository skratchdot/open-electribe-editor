/**
 * Copyright (c) 2009, 2012 SKRATCHDOT.COM
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

import com.skratchdot.riff.wav.ChunkFact;
import com.skratchdot.riff.wav.ChunkTypeID;
import com.skratchdot.riff.wav.RIFFWave;
import com.skratchdot.riff.wav.WavPackage;
import com.skratchdot.riff.wav.util.ExtendedByteBuffer;
import com.skratchdot.riff.wav.util.RiffWaveException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chunk Fact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkFactImpl#getFormatDependantData <em>Format Dependant Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChunkFactImpl extends ChunkImpl implements ChunkFact {
	/**
	 * The default value of the '{@link #getFormatDependantData() <em>Format Dependant Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatDependantData()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] FORMAT_DEPENDANT_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormatDependantData() <em>Format Dependant Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatDependantData()
	 * @generated
	 * @ordered
	 */
	protected byte[] formatDependantData = FORMAT_DEPENDANT_DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChunkFactImpl() {
		super();
	}

	@Override
	public void init(RIFFWave riffWave, ExtendedByteBuffer buf)
			throws RiffWaveException {
		// Check Chunk Type ID
		if (ChunkTypeID.get((int) buf.getUnsignedInt()) != this
				.getChunkTypeID())
			throw new RiffWaveException("Invalid Chunk ID for "
					+ this.getChunkTypeID().getLiteral());

		// Read in data size
		int chunkSize = (int) buf.getUnsignedInt();

		if (chunkSize > 0) {
			byte[] newFormatDependantData = new byte[chunkSize];
			buf.getBytes(newFormatDependantData);
			this.setFormatDependantData(newFormatDependantData);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavPackage.Literals.CHUNK_FACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getFormatDependantData() {
		return formatDependantData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormatDependantData(byte[] newFormatDependantData) {
		byte[] oldFormatDependantData = formatDependantData;
		formatDependantData = newFormatDependantData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					WavPackage.CHUNK_FACT__FORMAT_DEPENDANT_DATA,
					oldFormatDependantData, formatDependantData));
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getChunkTypeID()
	 */
	@Override
	public ChunkTypeID getChunkTypeID() {
		return ChunkTypeID.FACT;
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getChunkTypeIDValue()
	 */
	@Override
	public int getChunkTypeIDValue() {
		return ChunkTypeID.FACT_VALUE;
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getSize()
	 */
	@Override
	public long getSize() {
		if (this.getFormatDependantData() != null) {
			return this.getFormatDependantData().length;
		}
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WavPackage.CHUNK_FACT__FORMAT_DEPENDANT_DATA:
			return getFormatDependantData();
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
		case WavPackage.CHUNK_FACT__FORMAT_DEPENDANT_DATA:
			setFormatDependantData((byte[]) newValue);
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
		case WavPackage.CHUNK_FACT__FORMAT_DEPENDANT_DATA:
			setFormatDependantData(FORMAT_DEPENDANT_DATA_EDEFAULT);
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
		case WavPackage.CHUNK_FACT__FORMAT_DEPENDANT_DATA:
			return FORMAT_DEPENDANT_DATA_EDEFAULT == null ? formatDependantData != null
					: !FORMAT_DEPENDANT_DATA_EDEFAULT
							.equals(formatDependantData);
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
		result.append(" (formatDependantData: ");
		result.append(formatDependantData);
		result.append(')');
		return result.toString();
	}

	@Override
	public byte[] toByteArray() {
		ExtendedByteBuffer buf = new ExtendedByteBuffer(
				(int) this.getSize() + 8);
		buf.order(ByteOrder.LITTLE_ENDIAN);

		buf.putUnsignedInt(this.getChunkTypeIDValue());
		buf.putUnsignedInt(this.getSize());
		if (this.getFormatDependantData() != null) {
			buf.putBytes(this.getFormatDependantData());
		}

		return buf.array();
	}

} //ChunkFactImpl

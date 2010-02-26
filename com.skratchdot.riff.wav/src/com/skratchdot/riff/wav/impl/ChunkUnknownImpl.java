/**
 * Copyright (c) 2010 SKRATCHDOT.COM
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

import com.skratchdot.riff.wav.ChunkTypeID;
import com.skratchdot.riff.wav.ChunkUnknown;
import com.skratchdot.riff.wav.RIFFWave;
import com.skratchdot.riff.wav.WavPackage;
import com.skratchdot.riff.wav.util.ExtendedByteBuffer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chunk Unknown</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkUnknownImpl#getData <em>Data</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkUnknownImpl#getUnknownChunkTypeIdValue <em>Unknown Chunk Type Id Value</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkUnknownImpl#getWavRandomAccessFilePointer <em>Wav Random Access File Pointer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChunkUnknownImpl extends ChunkImpl implements ChunkUnknown {
	/**
	 * The default value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] DATA_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected byte[] data = DATA_EDEFAULT;
	/**
	 * The default value of the '{@link #getUnknownChunkTypeIdValue() <em>Unknown Chunk Type Id Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnknownChunkTypeIdValue()
	 * @generated
	 * @ordered
	 */
	protected static final Long UNKNOWN_CHUNK_TYPE_ID_VALUE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUnknownChunkTypeIdValue() <em>Unknown Chunk Type Id Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnknownChunkTypeIdValue()
	 * @generated
	 * @ordered
	 */
	protected Long unknownChunkTypeIdValue = UNKNOWN_CHUNK_TYPE_ID_VALUE_EDEFAULT;
	/**
	 * The default value of the '{@link #getWavRandomAccessFilePointer() <em>Wav Random Access File Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWavRandomAccessFilePointer()
	 * @generated
	 * @ordered
	 */
	protected static final long WAV_RANDOM_ACCESS_FILE_POINTER_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getWavRandomAccessFilePointer() <em>Wav Random Access File Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWavRandomAccessFilePointer()
	 * @generated
	 * @ordered
	 */
	protected long wavRandomAccessFilePointer = WAV_RANDOM_ACCESS_FILE_POINTER_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChunkUnknownImpl() {
		super();
	}

	@Override
	public void init(RIFFWave riffWave, ExtendedByteBuffer buf) {
		// ChunkUnknown is special.  We're going to store the original
		// offset in the WavRandomAccessFile in case we decide to later
		// come back to try to find "incorrectly" written chunks.
		this.setWavRandomAccessFilePointer(buf.position());

		// Check Chunk Type ID
		this.setUnknownChunkTypeIdValue(buf.getUnsignedInt());

		// Read in data size
		int chunkDataSize = (int) buf.getUnsignedInt();

		// Read in the unknown data
		byte[] unknownData = new byte[chunkDataSize];
		buf.getBytes(unknownData);
		this.setData(unknownData);
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getChunkTypeID()
	 */
	@Override
	public ChunkTypeID getChunkTypeID() {
		return ChunkTypeID.UNKNOWN;
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getChunkTypeIDValue()
	 */
	@Override
	public int getChunkTypeIDValue() {
		return ChunkTypeID.UNKNOWN_VALUE;
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getSize()
	 */
	@Override
	public long getSize() {
		if(this.getData()!=null) {
			return this.getData().length;
		}
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavPackage.Literals.CHUNK_UNKNOWN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(byte[] newData) {
		byte[] oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_UNKNOWN__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getUnknownChunkTypeIdValue() {
		return unknownChunkTypeIdValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnknownChunkTypeIdValue(Long newUnknownChunkTypeIdValue) {
		Long oldUnknownChunkTypeIdValue = unknownChunkTypeIdValue;
		unknownChunkTypeIdValue = newUnknownChunkTypeIdValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_UNKNOWN__UNKNOWN_CHUNK_TYPE_ID_VALUE, oldUnknownChunkTypeIdValue, unknownChunkTypeIdValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getWavRandomAccessFilePointer() {
		return wavRandomAccessFilePointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWavRandomAccessFilePointer(long newWavRandomAccessFilePointer) {
		long oldWavRandomAccessFilePointer = wavRandomAccessFilePointer;
		wavRandomAccessFilePointer = newWavRandomAccessFilePointer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_UNKNOWN__WAV_RANDOM_ACCESS_FILE_POINTER, oldWavRandomAccessFilePointer, wavRandomAccessFilePointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WavPackage.CHUNK_UNKNOWN__DATA:
				return getData();
			case WavPackage.CHUNK_UNKNOWN__UNKNOWN_CHUNK_TYPE_ID_VALUE:
				return getUnknownChunkTypeIdValue();
			case WavPackage.CHUNK_UNKNOWN__WAV_RANDOM_ACCESS_FILE_POINTER:
				return getWavRandomAccessFilePointer();
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
			case WavPackage.CHUNK_UNKNOWN__DATA:
				setData((byte[])newValue);
				return;
			case WavPackage.CHUNK_UNKNOWN__UNKNOWN_CHUNK_TYPE_ID_VALUE:
				setUnknownChunkTypeIdValue((Long)newValue);
				return;
			case WavPackage.CHUNK_UNKNOWN__WAV_RANDOM_ACCESS_FILE_POINTER:
				setWavRandomAccessFilePointer((Long)newValue);
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
			case WavPackage.CHUNK_UNKNOWN__DATA:
				setData(DATA_EDEFAULT);
				return;
			case WavPackage.CHUNK_UNKNOWN__UNKNOWN_CHUNK_TYPE_ID_VALUE:
				setUnknownChunkTypeIdValue(UNKNOWN_CHUNK_TYPE_ID_VALUE_EDEFAULT);
				return;
			case WavPackage.CHUNK_UNKNOWN__WAV_RANDOM_ACCESS_FILE_POINTER:
				setWavRandomAccessFilePointer(WAV_RANDOM_ACCESS_FILE_POINTER_EDEFAULT);
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
			case WavPackage.CHUNK_UNKNOWN__DATA:
				return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
			case WavPackage.CHUNK_UNKNOWN__UNKNOWN_CHUNK_TYPE_ID_VALUE:
				return UNKNOWN_CHUNK_TYPE_ID_VALUE_EDEFAULT == null ? unknownChunkTypeIdValue != null : !UNKNOWN_CHUNK_TYPE_ID_VALUE_EDEFAULT.equals(unknownChunkTypeIdValue);
			case WavPackage.CHUNK_UNKNOWN__WAV_RANDOM_ACCESS_FILE_POINTER:
				return wavRandomAccessFilePointer != WAV_RANDOM_ACCESS_FILE_POINTER_EDEFAULT;
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
		result.append(" (data: ");
		result.append(data);
		result.append(", unknownChunkTypeIdValue: ");
		result.append(unknownChunkTypeIdValue);
		result.append(", wavRandomAccessFilePointer: ");
		result.append(wavRandomAccessFilePointer);
		result.append(')');
		return result.toString();
	}

	@Override
	public byte[] toByteArray() {
		ExtendedByteBuffer buf = new ExtendedByteBuffer((int) this.getSize()+8);
		buf.order(ByteOrder.LITTLE_ENDIAN);

		buf.putUnsignedInt(this.getUnknownChunkTypeIdValue());
		buf.putUnsignedInt(this.getSize());
		if(this.getData()!=null) {
			buf.putBytes(this.getData());
		}
		
		return buf.array();
	}

} //ChunkUnknownImpl

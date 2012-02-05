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

import com.skratchdot.riff.wav.CuePoint;
import com.skratchdot.riff.wav.WavPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cue Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.impl.CuePointImpl#getCuePointID <em>Cue Point ID</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.CuePointImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.CuePointImpl#getDataChunkID <em>Data Chunk ID</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.CuePointImpl#getChunkStart <em>Chunk Start</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.CuePointImpl#getBlockStart <em>Block Start</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.CuePointImpl#getSampleOffset <em>Sample Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CuePointImpl extends EObjectImpl implements CuePoint {
	/**
	 * The default value of the '{@link #getCuePointID() <em>Cue Point ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCuePointID()
	 * @generated
	 * @ordered
	 */
	protected static final Long CUE_POINT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCuePointID() <em>Cue Point ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCuePointID()
	 * @generated
	 * @ordered
	 */
	protected Long cuePointID = CUE_POINT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final Long POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Long position = POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataChunkID() <em>Data Chunk ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataChunkID()
	 * @generated
	 * @ordered
	 */
	protected static final Long DATA_CHUNK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataChunkID() <em>Data Chunk ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataChunkID()
	 * @generated
	 * @ordered
	 */
	protected Long dataChunkID = DATA_CHUNK_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getChunkStart() <em>Chunk Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChunkStart()
	 * @generated
	 * @ordered
	 */
	protected static final Long CHUNK_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChunkStart() <em>Chunk Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChunkStart()
	 * @generated
	 * @ordered
	 */
	protected Long chunkStart = CHUNK_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlockStart() <em>Block Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockStart()
	 * @generated
	 * @ordered
	 */
	protected static final Long BLOCK_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlockStart() <em>Block Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockStart()
	 * @generated
	 * @ordered
	 */
	protected Long blockStart = BLOCK_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getSampleOffset() <em>Sample Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleOffset()
	 * @generated
	 * @ordered
	 */
	protected static final Long SAMPLE_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSampleOffset() <em>Sample Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleOffset()
	 * @generated
	 * @ordered
	 */
	protected Long sampleOffset = SAMPLE_OFFSET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CuePointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavPackage.Literals.CUE_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getCuePointID() {
		return cuePointID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCuePointID(Long newCuePointID) {
		Long oldCuePointID = cuePointID;
		cuePointID = newCuePointID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CUE_POINT__CUE_POINT_ID, oldCuePointID, cuePointID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Long newPosition) {
		Long oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CUE_POINT__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getDataChunkID() {
		return dataChunkID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataChunkID(Long newDataChunkID) {
		Long oldDataChunkID = dataChunkID;
		dataChunkID = newDataChunkID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CUE_POINT__DATA_CHUNK_ID, oldDataChunkID, dataChunkID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getChunkStart() {
		return chunkStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChunkStart(Long newChunkStart) {
		Long oldChunkStart = chunkStart;
		chunkStart = newChunkStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CUE_POINT__CHUNK_START, oldChunkStart, chunkStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getBlockStart() {
		return blockStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockStart(Long newBlockStart) {
		Long oldBlockStart = blockStart;
		blockStart = newBlockStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CUE_POINT__BLOCK_START, oldBlockStart, blockStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getSampleOffset() {
		return sampleOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSampleOffset(Long newSampleOffset) {
		Long oldSampleOffset = sampleOffset;
		sampleOffset = newSampleOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CUE_POINT__SAMPLE_OFFSET, oldSampleOffset, sampleOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WavPackage.CUE_POINT__CUE_POINT_ID:
				return getCuePointID();
			case WavPackage.CUE_POINT__POSITION:
				return getPosition();
			case WavPackage.CUE_POINT__DATA_CHUNK_ID:
				return getDataChunkID();
			case WavPackage.CUE_POINT__CHUNK_START:
				return getChunkStart();
			case WavPackage.CUE_POINT__BLOCK_START:
				return getBlockStart();
			case WavPackage.CUE_POINT__SAMPLE_OFFSET:
				return getSampleOffset();
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
			case WavPackage.CUE_POINT__CUE_POINT_ID:
				setCuePointID((Long)newValue);
				return;
			case WavPackage.CUE_POINT__POSITION:
				setPosition((Long)newValue);
				return;
			case WavPackage.CUE_POINT__DATA_CHUNK_ID:
				setDataChunkID((Long)newValue);
				return;
			case WavPackage.CUE_POINT__CHUNK_START:
				setChunkStart((Long)newValue);
				return;
			case WavPackage.CUE_POINT__BLOCK_START:
				setBlockStart((Long)newValue);
				return;
			case WavPackage.CUE_POINT__SAMPLE_OFFSET:
				setSampleOffset((Long)newValue);
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
			case WavPackage.CUE_POINT__CUE_POINT_ID:
				setCuePointID(CUE_POINT_ID_EDEFAULT);
				return;
			case WavPackage.CUE_POINT__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case WavPackage.CUE_POINT__DATA_CHUNK_ID:
				setDataChunkID(DATA_CHUNK_ID_EDEFAULT);
				return;
			case WavPackage.CUE_POINT__CHUNK_START:
				setChunkStart(CHUNK_START_EDEFAULT);
				return;
			case WavPackage.CUE_POINT__BLOCK_START:
				setBlockStart(BLOCK_START_EDEFAULT);
				return;
			case WavPackage.CUE_POINT__SAMPLE_OFFSET:
				setSampleOffset(SAMPLE_OFFSET_EDEFAULT);
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
			case WavPackage.CUE_POINT__CUE_POINT_ID:
				return CUE_POINT_ID_EDEFAULT == null ? cuePointID != null : !CUE_POINT_ID_EDEFAULT.equals(cuePointID);
			case WavPackage.CUE_POINT__POSITION:
				return POSITION_EDEFAULT == null ? position != null : !POSITION_EDEFAULT.equals(position);
			case WavPackage.CUE_POINT__DATA_CHUNK_ID:
				return DATA_CHUNK_ID_EDEFAULT == null ? dataChunkID != null : !DATA_CHUNK_ID_EDEFAULT.equals(dataChunkID);
			case WavPackage.CUE_POINT__CHUNK_START:
				return CHUNK_START_EDEFAULT == null ? chunkStart != null : !CHUNK_START_EDEFAULT.equals(chunkStart);
			case WavPackage.CUE_POINT__BLOCK_START:
				return BLOCK_START_EDEFAULT == null ? blockStart != null : !BLOCK_START_EDEFAULT.equals(blockStart);
			case WavPackage.CUE_POINT__SAMPLE_OFFSET:
				return SAMPLE_OFFSET_EDEFAULT == null ? sampleOffset != null : !SAMPLE_OFFSET_EDEFAULT.equals(sampleOffset);
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
		result.append(" (cuePointID: ");
		result.append(cuePointID);
		result.append(", position: ");
		result.append(position);
		result.append(", dataChunkID: ");
		result.append(dataChunkID);
		result.append(", chunkStart: ");
		result.append(chunkStart);
		result.append(", blockStart: ");
		result.append(blockStart);
		result.append(", sampleOffset: ");
		result.append(sampleOffset);
		result.append(')');
		return result.toString();
	}

} //CuePointImpl

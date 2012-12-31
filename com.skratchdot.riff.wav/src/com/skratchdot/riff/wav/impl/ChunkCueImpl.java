/*******************************************************************************
 * Copyright (c) 2009-2013 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 *******************************************************************************/
package com.skratchdot.riff.wav.impl;

import java.nio.ByteOrder;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import com.skratchdot.riff.wav.ChunkCue;
import com.skratchdot.riff.wav.ChunkTypeID;
import com.skratchdot.riff.wav.CuePoint;
import com.skratchdot.riff.wav.RIFFWave;
import com.skratchdot.riff.wav.WavFactory;
import com.skratchdot.riff.wav.WavPackage;
import com.skratchdot.riff.wav.util.ExtendedByteBuffer;
import com.skratchdot.riff.wav.util.RiffWaveException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chunk Cue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkCueImpl#getNumberOfCuePoints <em>Number Of Cue Points</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkCueImpl#getCuePoints <em>Cue Points</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChunkCueImpl extends ChunkImpl implements ChunkCue {

	/**
	 * The default value of the '{@link #getNumberOfCuePoints() <em>Number Of Cue Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfCuePoints()
	 * @generated
	 * @ordered
	 */
	protected static final Long NUMBER_OF_CUE_POINTS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCuePoints() <em>Cue Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCuePoints()
	 * @generated
	 * @ordered
	 */
	protected EList<CuePoint> cuePoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChunkCueImpl() {
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
		long chunkSize = buf.getUnsignedInt();

		// Read in cue points
		long numCuePoints = buf.getUnsignedInt();
		for (int i = 0; i < numCuePoints; i++) {
			CuePoint cuePoint = WavFactory.eINSTANCE.createCuePoint();
			cuePoint.setCuePointID(buf.getUnsignedInt());
			cuePoint.setPosition(buf.getUnsignedInt());
			cuePoint.setDataChunkID(buf.getUnsignedInt());
			cuePoint.setChunkStart(buf.getUnsignedInt());
			cuePoint.setBlockStart(buf.getUnsignedInt());
			cuePoint.setSampleOffset(buf.getUnsignedInt());
			this.getCuePoints().add(cuePoint);
		}

		// Does the size we read in match the size we calculate from the data read in?
		if (chunkSize != this.getSize()) {
			throw new RiffWaveException("Invalid chunk size for cue chunk."
					+ "From File: " + Long.toString(chunkSize) + "Calculated: "
					+ Long.toString(this.getSize()));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavPackage.Literals.CHUNK_CUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Long getNumberOfCuePoints() {
		return this.getCuePoints() == null ? 0 : (long) this.getCuePoints()
				.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CuePoint> getCuePoints() {
		if (cuePoints == null) {
			cuePoints = new EObjectResolvingEList<CuePoint>(CuePoint.class,
					this, WavPackage.CHUNK_CUE__CUE_POINTS);
		}
		return cuePoints;
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getChunkTypeID()
	 */
	@Override
	public ChunkTypeID getChunkTypeID() {
		return ChunkTypeID.CUE_;
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getChunkTypeIDValue()
	 */
	@Override
	public int getChunkTypeIDValue() {
		return ChunkTypeID.CUE__VALUE;
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getSize()
	 */
	@Override
	public long getSize() {
		return 4 + (this.getNumberOfCuePoints() * 24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WavPackage.CHUNK_CUE__NUMBER_OF_CUE_POINTS:
			return getNumberOfCuePoints();
		case WavPackage.CHUNK_CUE__CUE_POINTS:
			return getCuePoints();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case WavPackage.CHUNK_CUE__CUE_POINTS:
			getCuePoints().clear();
			getCuePoints().addAll((Collection<? extends CuePoint>) newValue);
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
		case WavPackage.CHUNK_CUE__CUE_POINTS:
			getCuePoints().clear();
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
		case WavPackage.CHUNK_CUE__NUMBER_OF_CUE_POINTS:
			return NUMBER_OF_CUE_POINTS_EDEFAULT == null ? getNumberOfCuePoints() != null
					: !NUMBER_OF_CUE_POINTS_EDEFAULT
							.equals(getNumberOfCuePoints());
		case WavPackage.CHUNK_CUE__CUE_POINTS:
			return cuePoints != null && !cuePoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public byte[] toByteArray() {
		ExtendedByteBuffer buf = new ExtendedByteBuffer(
				(int) this.getSize() + 8);
		buf.order(ByteOrder.LITTLE_ENDIAN);

		buf.putUnsignedInt(this.getChunkTypeIDValue());
		buf.putUnsignedInt(this.getSize());

		buf.putUnsignedInt(this.getNumberOfCuePoints());

		for (int i = 0; i < this.getNumberOfCuePoints(); i++) {
			buf.putUnsignedInt(this.getCuePoints().get(i).getCuePointID());
			buf.putUnsignedInt(this.getCuePoints().get(i).getPosition());
			buf.putUnsignedInt(this.getCuePoints().get(i).getDataChunkID());
			buf.putUnsignedInt(this.getCuePoints().get(i).getChunkStart());
			buf.putUnsignedInt(this.getCuePoints().get(i).getBlockStart());
			buf.putUnsignedInt(this.getCuePoints().get(i).getSampleOffset());
			buf.putUnsignedInt(this.getCuePoints().get(i).getCuePointID());
		}
		return buf.array();
	}

} //ChunkCueImpl

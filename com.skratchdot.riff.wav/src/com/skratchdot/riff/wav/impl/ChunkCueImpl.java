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

import java.io.IOException;
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
import com.skratchdot.riff.wav.util.RiffWaveException;
import com.skratchdot.riff.wav.util.WavRandomAccessFile;

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

	/**
	 * @param riffWave a valid RIFFWave object
	 * @param in a valid WavRandomAccessFile
	 * @throws RiffWaveException
	 */
	public ChunkCueImpl(RIFFWave riffWave, WavRandomAccessFile in) throws RiffWaveException {
		super();
		try {
			// Check Chunk Type ID
			if(ChunkTypeID.get((int)in.readUnsignedInt())!=this.getChunkTypeID())
				throw new RiffWaveException("Invalid Chunk ID for "+this.getChunkTypeID().getLiteral());

			// Read in data size
			long chunkSize = in.readUnsignedInt();

			// Read in cue points
			long numCuePoints = in.readUnsignedInt();
			for(int i=0; i<numCuePoints; i++) {
				CuePoint cuePoint = WavFactory.eINSTANCE.createCuePoint();
				cuePoint.setCuePointID(in.readUnsignedInt());
				cuePoint.setPosition(in.readUnsignedInt());
				cuePoint.setDataChunkID(in.readUnsignedInt());
				cuePoint.setChunkStart(in.readUnsignedInt());
				cuePoint.setBlockStart(in.readUnsignedInt());
				cuePoint.setSampleOffset(in.readUnsignedInt());
				this.getCuePoints().add(cuePoint);
			}

			// Does the size we read in match the size we calculate from the data read in?
			if(chunkSize!=this.getSize()) {
				throw new RiffWaveException("Invalid chunk size for cue chunk." +
					"From File: " + Long.toString(chunkSize) +
					"Calculated: " + Long.toString(this.getSize())
				);
			}
			
		} catch (Exception e) {
			throw new RiffWaveException(e.getMessage(), e.getCause());
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
		return this.getCuePoints()==null?0:(long)this.getCuePoints().size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CuePoint> getCuePoints() {
		if (cuePoints == null) {
			cuePoints = new EObjectResolvingEList<CuePoint>(CuePoint.class, this, WavPackage.CHUNK_CUE__CUE_POINTS);
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
				getCuePoints().addAll((Collection<? extends CuePoint>)newValue);
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
				return NUMBER_OF_CUE_POINTS_EDEFAULT == null ? getNumberOfCuePoints() != null : !NUMBER_OF_CUE_POINTS_EDEFAULT.equals(getNumberOfCuePoints());
			case WavPackage.CHUNK_CUE__CUE_POINTS:
				return cuePoints != null && !cuePoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws IOException 
	 * @generated NOT
	 */
	public void write(RIFFWave riffWave, WavRandomAccessFile out) throws IOException {
		out.writeUnsignedInt(this.getChunkTypeIDValue());
		out.writeUnsignedInt(this.getSize());
		
		out.writeUnsignedInt(this.getNumberOfCuePoints());

		for(int i=0; i<this.getNumberOfCuePoints(); i++) {
			out.writeUnsignedInt(this.getCuePoints().get(i).getCuePointID());
			out.writeUnsignedInt(this.getCuePoints().get(i).getPosition());
			out.writeUnsignedInt(this.getCuePoints().get(i).getDataChunkID());
			out.writeUnsignedInt(this.getCuePoints().get(i).getChunkStart());
			out.writeUnsignedInt(this.getCuePoints().get(i).getBlockStart());
			out.writeUnsignedInt(this.getCuePoints().get(i).getSampleOffset());
			out.writeUnsignedInt(this.getCuePoints().get(i).getCuePointID());
		}

	}





} //ChunkCueImpl

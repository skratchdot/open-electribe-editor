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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.skratchdot.riff.wav.Chunk;
import com.skratchdot.riff.wav.ChunkTypeID;
import com.skratchdot.riff.wav.RIFFWave;
import com.skratchdot.riff.wav.WavPackage;
import com.skratchdot.riff.wav.util.ExtendedByteBuffer;
import com.skratchdot.riff.wav.util.RiffWaveException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chunk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkImpl#getBlockAlignedSize <em>Block Aligned Size</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkImpl#getSize <em>Size</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkImpl#getChunkTypeID <em>Chunk Type ID</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkImpl#getChunkTypeIDValue <em>Chunk Type ID Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ChunkImpl extends EObjectImpl implements Chunk {
	/**
	 * The default value of the '{@link #getBlockAlignedSize() <em>Block Aligned Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockAlignedSize()
	 * @generated
	 * @ordered
	 */
	protected static final long BLOCK_ALIGNED_SIZE_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final long SIZE_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getChunkTypeID() <em>Chunk Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChunkTypeID()
	 * @generated
	 * @ordered
	 */
	protected static final ChunkTypeID CHUNK_TYPE_ID_EDEFAULT = ChunkTypeID.UNKNOWN;

	/**
	 * The default value of the '{@link #getChunkTypeIDValue() <em>Chunk Type ID Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChunkTypeIDValue()
	 * @generated
	 * @ordered
	 */
	protected static final int CHUNK_TYPE_ID_VALUE_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChunkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavPackage.Literals.CHUNK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public long getBlockAlignedSize() {
		return this.getSize()%2==1?this.getSize()+1:this.getSize();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public long getSize() {
		// Implementation should be handled by subclasses
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ChunkTypeID getChunkTypeID() {
		// Implementation should be handled by subclasses
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getChunkTypeIDValue() {
		// Implementation should be handled by subclasses
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void init(RIFFWave riffWave, ExtendedByteBuffer buf) throws RiffWaveException {
		// Implementation should be handled by subclasses
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public byte[] toByteArray() throws RiffWaveException {
		// Implementation should be handled by subclasses
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WavPackage.CHUNK__BLOCK_ALIGNED_SIZE:
				return getBlockAlignedSize();
			case WavPackage.CHUNK__SIZE:
				return getSize();
			case WavPackage.CHUNK__CHUNK_TYPE_ID:
				return getChunkTypeID();
			case WavPackage.CHUNK__CHUNK_TYPE_ID_VALUE:
				return getChunkTypeIDValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WavPackage.CHUNK__BLOCK_ALIGNED_SIZE:
				return getBlockAlignedSize() != BLOCK_ALIGNED_SIZE_EDEFAULT;
			case WavPackage.CHUNK__SIZE:
				return getSize() != SIZE_EDEFAULT;
			case WavPackage.CHUNK__CHUNK_TYPE_ID:
				return getChunkTypeID() != CHUNK_TYPE_ID_EDEFAULT;
			case WavPackage.CHUNK__CHUNK_TYPE_ID_VALUE:
				return getChunkTypeIDValue() != CHUNK_TYPE_ID_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ChunkImpl

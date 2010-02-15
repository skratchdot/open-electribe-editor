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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import com.skratchdot.riff.wav.Chunk;
import com.skratchdot.riff.wav.ChunkDataList;
import com.skratchdot.riff.wav.ChunkDataListType;
import com.skratchdot.riff.wav.ChunkDataListTypeID;
import com.skratchdot.riff.wav.ChunkTypeID;
import com.skratchdot.riff.wav.RIFFWave;
import com.skratchdot.riff.wav.WavPackage;
import com.skratchdot.riff.wav.util.RiffWaveException;
import com.skratchdot.riff.wav.util.WavRandomAccessFile;
import com.skratchdot.riff.wav.util.WavUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chunk Data List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkDataListImpl#getTypeID <em>Type ID</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkDataListImpl#getDataListChunks <em>Data List Chunks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChunkDataListImpl extends ChunkImpl implements ChunkDataList {
	/**
	 * The default value of the '{@link #getTypeID() <em>Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeID()
	 * @generated
	 * @ordered
	 */
	protected static final ChunkDataListTypeID TYPE_ID_EDEFAULT = ChunkDataListTypeID.UNKNOWN;

	/**
	 * The cached value of the '{@link #getTypeID() <em>Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeID()
	 * @generated
	 * @ordered
	 */
	protected ChunkDataListTypeID typeID = TYPE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataListChunks() <em>Data List Chunks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataListChunks()
	 * @generated
	 * @ordered
	 */
	protected EList<ChunkDataListType> dataListChunks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChunkDataListImpl() {
		super();
	}

	/**
	 * @param riffWave a valid RIFFWave object
	 * @param in a valid WavRandomAccessFile
	 * @throws RiffWaveException
	 */
	public ChunkDataListImpl(RIFFWave riffWave, WavRandomAccessFile in) throws RiffWaveException {
		super();
		try {
			// Check Chunk Type ID
			if(ChunkTypeID.get((int)in.readUnsignedInt())!=this.getChunkTypeID())
				throw new RiffWaveException("Invalid Chunk ID for "+this.getChunkTypeID().getLiteral());

			// Read in data size
			long chunkSize = in.readUnsignedInt();

			// We cannot read in chunks past this point
			long maxPointer = in.getFilePointer() + chunkSize;

			// Check Chunk Data List Type ID
			if(ChunkDataListTypeID.get((int)in.readUnsignedInt())!=ChunkDataListTypeID.ADTL)
				throw new RiffWaveException("Invalid Chunk Data List Type ID");

			// loopPointer prevents an infinite loop if we try to parse a
			// chunk and the filePointer doesn't advance for some reason
			long loopPointer = 0;

			// Loop through file reading in chunks
			while(in.getFilePointer()<in.length() && in.getFilePointer()!=loopPointer && in.getFilePointer()<maxPointer) {
				// If the filePointer doesn't advance in this loop iteration,
				// then we'll break out of the loop
				loopPointer = in.getFilePointer();

				// Grab the current chunk
				Chunk currentChunk = WavUtil.parseChunk(riffWave, in);

				// If we got a chunk, add it to our list
				if(currentChunk!=null) {
					// Add to our list of chunks
					this.getDataListChunks().add((ChunkDataListType) currentChunk);
				}

				// We need to block align
				in.blockAlign();

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
		return WavPackage.Literals.CHUNK_DATA_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChunkDataListTypeID getTypeID() {
		return typeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeID(ChunkDataListTypeID newTypeID) {
		ChunkDataListTypeID oldTypeID = typeID;
		typeID = newTypeID == null ? TYPE_ID_EDEFAULT : newTypeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_DATA_LIST__TYPE_ID, oldTypeID, typeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChunkDataListType> getDataListChunks() {
		if (dataListChunks == null) {
			dataListChunks = new EObjectResolvingEList<ChunkDataListType>(ChunkDataListType.class, this, WavPackage.CHUNK_DATA_LIST__DATA_LIST_CHUNKS);
		}
		return dataListChunks;
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getChunkTypeID()
	 */
	@Override
	public ChunkTypeID getChunkTypeID() {
		return ChunkTypeID.LIST;
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getChunkTypeIDValue()
	 */
	@Override
	public int getChunkTypeIDValue() {
		return ChunkTypeID.LIST_VALUE;
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getSize()
	 */
	@Override
	public long getSize() {
		long returnSize = 4;
		for(int i=0; i<this.getDataListChunks().size(); i++) {
			returnSize += this.getDataListChunks().get(i).getBlockAlignedSize() + 8;
		}
		return returnSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WavPackage.CHUNK_DATA_LIST__TYPE_ID:
				return getTypeID();
			case WavPackage.CHUNK_DATA_LIST__DATA_LIST_CHUNKS:
				return getDataListChunks();
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
			case WavPackage.CHUNK_DATA_LIST__TYPE_ID:
				setTypeID((ChunkDataListTypeID)newValue);
				return;
			case WavPackage.CHUNK_DATA_LIST__DATA_LIST_CHUNKS:
				getDataListChunks().clear();
				getDataListChunks().addAll((Collection<? extends ChunkDataListType>)newValue);
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
			case WavPackage.CHUNK_DATA_LIST__TYPE_ID:
				setTypeID(TYPE_ID_EDEFAULT);
				return;
			case WavPackage.CHUNK_DATA_LIST__DATA_LIST_CHUNKS:
				getDataListChunks().clear();
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
			case WavPackage.CHUNK_DATA_LIST__TYPE_ID:
				return typeID != TYPE_ID_EDEFAULT;
			case WavPackage.CHUNK_DATA_LIST__DATA_LIST_CHUNKS:
				return dataListChunks != null && !dataListChunks.isEmpty();
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
		result.append(" (typeID: ");
		result.append(typeID);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void write(RIFFWave riffWave, WavRandomAccessFile out) throws IOException {
		out.writeUnsignedInt(this.getChunkTypeIDValue());
		out.writeUnsignedInt(this.getSize());
		out.writeUnsignedInt(ChunkDataListTypeID.ADTL_VALUE);
		for(int i=0; i<this.getDataListChunks().size(); i++) {
			Chunk currentChunk = this.getDataListChunks().get(i);
			currentChunk.write(riffWave, out);
			out.writeBlockAlign();
		}
	}

} //ChunkDataListImpl

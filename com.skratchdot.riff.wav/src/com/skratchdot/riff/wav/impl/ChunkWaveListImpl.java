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

import com.skratchdot.riff.wav.Chunk;
import com.skratchdot.riff.wav.ChunkData;
import com.skratchdot.riff.wav.ChunkSilent;
import com.skratchdot.riff.wav.ChunkTypeID;
import com.skratchdot.riff.wav.ChunkWaveList;
import com.skratchdot.riff.wav.ParseChunkException;
import com.skratchdot.riff.wav.RIFFWave;
import com.skratchdot.riff.wav.WavFactory;
import com.skratchdot.riff.wav.WavPackage;
import com.skratchdot.riff.wav.util.RiffWaveException;
import com.skratchdot.riff.wav.util.WavRandomAccessFile;
import com.skratchdot.riff.wav.util.WavUtil;

import java.io.IOException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chunk Wave List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkWaveListImpl#getAlternatingSilentAndDataChunks <em>Alternating Silent And Data Chunks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChunkWaveListImpl extends ChunkImpl implements ChunkWaveList {
	/**
	 * The cached value of the '{@link #getAlternatingSilentAndDataChunks() <em>Alternating Silent And Data Chunks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternatingSilentAndDataChunks()
	 * @generated
	 * @ordered
	 */
	protected EList<Chunk> alternatingSilentAndDataChunks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChunkWaveListImpl() {
		super();
	}

	/**
	 * @param riffWave a valid RIFFWave object
	 * @param in a valid WavRandomAccessFile
	 * @throws RiffWaveException
	 */
	public ChunkWaveListImpl(RIFFWave riffWave, WavRandomAccessFile in) throws RiffWaveException {
		super();
		try {
			// Check Chunk Type ID
			if(ChunkTypeID.get((int)in.readUnsignedInt())!=this.getChunkTypeID())
				throw new RiffWaveException("Invalid Chunk ID for "+this.getChunkTypeID().getLiteral());

			// Read in data size
			long chunkSize = in.readUnsignedInt();
			
			// We cannot read in chunks past this point
			long maxPointer = in.getFilePointer() + chunkSize;

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
					// Wave List chunks are only supposed to contain sInt and data chunks
					if(currentChunk instanceof ChunkSilent == false && 
						currentChunk instanceof ChunkData == false) {
						ParseChunkException pce = WavFactory.eINSTANCE.createParseChunkException();
						pce.setException(new Exception("Invalid Chunk Type: Not sInt or data"));
						riffWave.getParseChunkExceptions().add(pce);
					}
					// Add to our list of chunks
					this.getAlternatingSilentAndDataChunks().add(currentChunk);
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
		return WavPackage.Literals.CHUNK_WAVE_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Chunk> getAlternatingSilentAndDataChunks() {
		if (alternatingSilentAndDataChunks == null) {
			alternatingSilentAndDataChunks = new EObjectContainmentEList<Chunk>(Chunk.class, this, WavPackage.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS);
		}
		return alternatingSilentAndDataChunks;
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getChunkTypeID()
	 */
	@Override
	public ChunkTypeID getChunkTypeID() {
		return ChunkTypeID.WAVL;
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getChunkTypeIDValue()
	 */
	@Override
	public int getChunkTypeIDValue() {
		return ChunkTypeID.WAVL_VALUE;
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getSize()
	 */
	@Override
	public long getSize() {
		long returnSize = 0;
		for(int i=0; i<this.getAlternatingSilentAndDataChunks().size(); i++) {
			returnSize += this.getAlternatingSilentAndDataChunks().get(i).getBlockAlignedSize() + 8;
		}
		return returnSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WavPackage.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS:
				return ((InternalEList<?>)getAlternatingSilentAndDataChunks()).basicRemove(otherEnd, msgs);
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
			case WavPackage.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS:
				return getAlternatingSilentAndDataChunks();
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
			case WavPackage.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS:
				getAlternatingSilentAndDataChunks().clear();
				getAlternatingSilentAndDataChunks().addAll((Collection<? extends Chunk>)newValue);
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
			case WavPackage.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS:
				getAlternatingSilentAndDataChunks().clear();
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
			case WavPackage.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS:
				return alternatingSilentAndDataChunks != null && !alternatingSilentAndDataChunks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void write(RIFFWave riffWave, WavRandomAccessFile out) throws IOException {
		out.writeUnsignedInt(this.getChunkTypeIDValue());
		out.writeUnsignedInt(this.getSize());

		for(int i=0; i<this.getAlternatingSilentAndDataChunks().size(); i++) {
			Chunk currentChunk = this.getAlternatingSilentAndDataChunks().get(i);
			currentChunk.write(riffWave, out);
			out.writeBlockAlign();
		}
	}

} //ChunkWaveListImpl

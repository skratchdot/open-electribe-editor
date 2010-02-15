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

import java.io.File;
import java.io.IOException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.skratchdot.riff.wav.Chunk;
import com.skratchdot.riff.wav.ChunkTypeID;
import com.skratchdot.riff.wav.ParseChunkException;
import com.skratchdot.riff.wav.RIFFWave;
import com.skratchdot.riff.wav.WavPackage;
import com.skratchdot.riff.wav.util.RiffWaveException;
import com.skratchdot.riff.wav.util.WavRandomAccessFile;
import com.skratchdot.riff.wav.util.WavUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RIFF Wave</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.impl.RIFFWaveImpl#getChunks <em>Chunks</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.RIFFWaveImpl#getParseChunkExceptions <em>Parse Chunk Exceptions</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.RIFFWaveImpl#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RIFFWaveImpl extends EObjectImpl implements RIFFWave {
	/**
	 * The cached value of the '{@link #getChunks() <em>Chunks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChunks()
	 * @generated
	 * @ordered
	 */
	protected EList<Chunk> chunks;

	/**
	 * The cached value of the '{@link #getParseChunkExceptions() <em>Parse Chunk Exceptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParseChunkExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<ParseChunkException> parseChunkExceptions;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RIFFWaveImpl() {
		super();
	}

	/**
	 * @param file a valid RIFF Wave file
	 * @throws RiffWaveException
	 */
	public RIFFWaveImpl(File file) throws RiffWaveException {
		try {
			WavRandomAccessFile in = new WavRandomAccessFile(file, "r");
			init(in);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RiffWaveException("The file was not a valid RIFF Wave file.\n"+e.getMessage(), e.getCause());
		}
	}

	/**
	 * @param in a valid RIFF Wave file in WavRandomAccessFile format
	 * @throws RiffWaveException
	 */
	private void init(WavRandomAccessFile in) throws RiffWaveException {
		try {
			// First read in the header info
			if(ChunkTypeID.get((int)in.readUnsignedInt())!=ChunkTypeID.RIFF)
				throw new RiffWaveException("Invalid Header: missing RIFF");
			if(in.readUnsignedInt()!=in.length()-8)
				throw new RiffWaveException("Invalid Header: chunk data size");
			if(ChunkTypeID.get((int)in.readUnsignedInt())!=ChunkTypeID.WAVE)
				throw new RiffWaveException("Invalid Header: missing WAVE");

			// loopPointer prevents an infinite loop if we try to parse a
			// chunk and the filePointer doesn't advance for some reason
			long loopPointer = 0;

			// Loop through file reading in chunks
			while(in.getFilePointer()<in.length() && in.getFilePointer()!=loopPointer) {
				// If the filePointer doesn't advance in this loop iteration,
				// then we'll break out of the loop
				loopPointer = in.getFilePointer();

				// Grab the current chunk
				Chunk currentChunk = WavUtil.parseChunk(this, in);

				// If we got a chunk, add it to our list
				if(currentChunk!=null) {
					this.getChunks().add(currentChunk);
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
		return WavPackage.Literals.RIFF_WAVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Chunk> getChunks() {
		if (chunks == null) {
			chunks = new EObjectContainmentEList<Chunk>(Chunk.class, this, WavPackage.RIFF_WAVE__CHUNKS);
		}
		return chunks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParseChunkException> getParseChunkExceptions() {
		if (parseChunkExceptions == null) {
			parseChunkExceptions = new EObjectContainmentEList<ParseChunkException>(ParseChunkException.class, this, WavPackage.RIFF_WAVE__PARSE_CHUNK_EXCEPTIONS);
		}
		return parseChunkExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public long getSize() {
		long returnSize = 4;
		for(int i=0; i<this.getChunks().size(); i++) {
			returnSize += this.getChunks().get(i).getBlockAlignedSize() + 8;
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
			case WavPackage.RIFF_WAVE__CHUNKS:
				return ((InternalEList<?>)getChunks()).basicRemove(otherEnd, msgs);
			case WavPackage.RIFF_WAVE__PARSE_CHUNK_EXCEPTIONS:
				return ((InternalEList<?>)getParseChunkExceptions()).basicRemove(otherEnd, msgs);
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
			case WavPackage.RIFF_WAVE__CHUNKS:
				return getChunks();
			case WavPackage.RIFF_WAVE__PARSE_CHUNK_EXCEPTIONS:
				return getParseChunkExceptions();
			case WavPackage.RIFF_WAVE__SIZE:
				return getSize();
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
			case WavPackage.RIFF_WAVE__CHUNKS:
				getChunks().clear();
				getChunks().addAll((Collection<? extends Chunk>)newValue);
				return;
			case WavPackage.RIFF_WAVE__PARSE_CHUNK_EXCEPTIONS:
				getParseChunkExceptions().clear();
				getParseChunkExceptions().addAll((Collection<? extends ParseChunkException>)newValue);
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
			case WavPackage.RIFF_WAVE__CHUNKS:
				getChunks().clear();
				return;
			case WavPackage.RIFF_WAVE__PARSE_CHUNK_EXCEPTIONS:
				getParseChunkExceptions().clear();
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
			case WavPackage.RIFF_WAVE__CHUNKS:
				return chunks != null && !chunks.isEmpty();
			case WavPackage.RIFF_WAVE__PARSE_CHUNK_EXCEPTIONS:
				return parseChunkExceptions != null && !parseChunkExceptions.isEmpty();
			case WavPackage.RIFF_WAVE__SIZE:
				return getSize() != SIZE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void write(File file) throws IOException {
		WavRandomAccessFile out = new WavRandomAccessFile(file, "rwd");
		this.write(this, out);
		out.close();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void write(RIFFWave riffWave, WavRandomAccessFile out) throws IOException {

		out.writeUnsignedInt(ChunkTypeID.RIFF_VALUE);
		out.writeUnsignedInt(this.getSize());
		out.writeUnsignedInt(ChunkTypeID.WAVE_VALUE);

		for(int i=0; i<this.getChunks().size(); i++) {
			Chunk currentChunk = this.getChunks().get(i);
			currentChunk.write(riffWave, out);
			out.writeBlockAlign();
		}
		
		// confirm the size we wrote/calculated was correct
		if(this.getSize()!=out.getFilePointer()-8) {
			throw new IOException("Calculated incorrect chunk data size");
		}

	}

} //RIFFWaveImpl

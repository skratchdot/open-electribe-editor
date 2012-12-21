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

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteOrder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.UnsupportedAudioFileException;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.skratchdot.riff.wav.Chunk;
import com.skratchdot.riff.wav.ChunkData;
import com.skratchdot.riff.wav.ChunkFormat;
import com.skratchdot.riff.wav.ChunkTypeID;
import com.skratchdot.riff.wav.CompressionCode;
import com.skratchdot.riff.wav.ParseChunkException;
import com.skratchdot.riff.wav.RIFFWave;
import com.skratchdot.riff.wav.WavPackage;
import com.skratchdot.riff.wav.util.ExtendedByteBuffer;
import com.skratchdot.riff.wav.util.RiffWaveException;
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
			ExtendedByteBuffer buf = new ExtendedByteBuffer(
					WavUtil.getBytesFromFile(file));
			buf.order(ByteOrder.LITTLE_ENDIAN);
			this.init(buf);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RiffWaveException(
					"The file was not a valid RIFF Wave file.\n"
							+ e.getMessage(), e.getCause());
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
			chunks = new EObjectContainmentEList<Chunk>(Chunk.class, this,
					WavPackage.RIFF_WAVE__CHUNKS);
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
			parseChunkExceptions = new EObjectContainmentEList<ParseChunkException>(
					ParseChunkException.class, this,
					WavPackage.RIFF_WAVE__PARSE_CHUNK_EXCEPTIONS);
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
		for (int i = 0; i < this.getChunks().size(); i++) {
			returnSize += this.getChunks().get(i).getBlockAlignedSize() + 8;
		}
		return returnSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Chunk> getChunksByEClass(EClass eClass) {
		EList<Chunk> chunkList = new BasicEList<Chunk>();
		TreeIterator<EObject> iter = this.eAllContents();
		while (iter.hasNext()) {
			EObject next = iter.next();
			if (next.eClass().equals(eClass) && next instanceof Chunk) {
				chunkList.add((Chunk) next);
			}
		}
		return chunkList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Chunk getFirstChunkByEClass(EClass eClass) {
		TreeIterator<EObject> iter = this.eAllContents();
		while (iter.hasNext()) {
			EObject next = iter.next();
			if (next.eClass().equals(eClass) && next instanceof Chunk) {
				return (Chunk) next;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void init(ExtendedByteBuffer buf) throws RiffWaveException {
		// First read in the header info
		if (ChunkTypeID.get((int) buf.getUnsignedInt()) != ChunkTypeID.RIFF)
			throw new RiffWaveException("Invalid Header: missing RIFF");
		if (buf.getUnsignedInt() != buf.limit() - 8)
			throw new RiffWaveException("Invalid Header: chunk data size");
		if (ChunkTypeID.get((int) buf.getUnsignedInt()) != ChunkTypeID.WAVE)
			throw new RiffWaveException("Invalid Header: missing WAVE");

		// loopPointer prevents an infinite loop if we try to parse a
		// chunk and the filePointer doesn't advance for some reason
		long loopPointer = 0;

		// Loop through file reading in chunks
		while (buf.position() < buf.limit() && buf.position() != loopPointer) {
			// If the filePointer doesn't advance in this loop iteration,
			// then we'll break out of the loop
			loopPointer = buf.position();

			// Grab the current chunk
			Chunk currentChunk = WavUtil.parseChunk(this, buf);

			// If we got a chunk, add it to our list
			if (currentChunk != null) {
				this.getChunks().add(currentChunk);
			}

			// We need to block align
			buf.blockAlign();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AudioFileFormat toAudioFileFormat()
			throws UnsupportedAudioFileException {
		try {
			AudioFormat audioFormat = this.toAudioFormat();
			ChunkData chunkData = (ChunkData) this
					.getFirstChunkByEClass(WavPackage.Literals.CHUNK_DATA);
			if (chunkData == null) {
				throw new UnsupportedAudioFileException(
						"Could not find a data chunk");
			}
			return new AudioFileFormat(AudioFileFormat.Type.WAVE, audioFormat,
					chunkData.getSampleDataOriginal().length
							/ audioFormat.getFrameSize(),
					audioFormat.properties());
		} catch (Exception e) {
			throw new UnsupportedAudioFileException(e.getMessage());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AudioFormat toAudioFormat() throws UnsupportedAudioFileException {
		try {
			ChunkFormat chunkFormat = (ChunkFormat) this
					.getFirstChunkByEClass(WavPackage.Literals.CHUNK_FORMAT);
			if (chunkFormat == null) {
				throw new UnsupportedAudioFileException(
						"Could not find a format chunk");
			} else if (chunkFormat.getCompressionCode() == CompressionCode.COMPRESSION_CODE_1) {
				Map<String, Object> properties = new HashMap<String, Object>();
				return new AudioFormat(AudioFormat.Encoding.PCM_SIGNED,
						chunkFormat.getSampleRate(),
						chunkFormat.getSignificantBitsPerSample(),
						chunkFormat.getNumberOfChannels(),
						chunkFormat.getBlockAlign(),
						chunkFormat.getSampleRate(), false, properties);
			}
			throw new UnsupportedAudioFileException("Not in PCM format.");
		} catch (Exception e) {
			throw new UnsupportedAudioFileException(e.getMessage());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AudioInputStream toAudioInputStream()
			throws UnsupportedAudioFileException {
		try {
			AudioFormat audioFormat = this.toAudioFormat();
			ChunkData chunkData = (ChunkData) this
					.getFirstChunkByEClass(WavPackage.Literals.CHUNK_DATA);
			if (chunkData == null) {
				throw new UnsupportedAudioFileException(
						"Could not find a data chunk");
			}
			ByteArrayInputStream bais = new ByteArrayInputStream(
					chunkData.getSampleDataOriginal());
			return new AudioInputStream(bais, audioFormat,
					chunkData.getSampleDataOriginal().length
							/ audioFormat.getFrameSize());
		} catch (Exception e) {
			throw new UnsupportedAudioFileException(e.getMessage());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public byte[] toByteArray() throws RiffWaveException {
		ExtendedByteBuffer buf = new ExtendedByteBuffer(
				(int) this.getSize() + 8);
		buf.order(ByteOrder.LITTLE_ENDIAN);

		buf.putUnsignedInt(ChunkTypeID.RIFF_VALUE);
		buf.putUnsignedInt(this.getSize());
		buf.putUnsignedInt(ChunkTypeID.WAVE_VALUE);

		for (int i = 0; i < this.getChunks().size(); i++) {
			Chunk currentChunk = this.getChunks().get(i);
			buf.putBytes(currentChunk.toByteArray());
			buf.putBlockAlign();
		}

		// confirm the size we wrote/calculated was correct
		if (this.getSize() != buf.position() - 8) {
			throw new RiffWaveException("Calculated incorrect chunk data size");
		}

		return buf.array();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void write(File file) throws IOException, RiffWaveException {
		FileOutputStream fos = new FileOutputStream(file);
		fos.write(this.toByteArray());
		fos.close();
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
		case WavPackage.RIFF_WAVE__CHUNKS:
			return ((InternalEList<?>) getChunks()).basicRemove(otherEnd, msgs);
		case WavPackage.RIFF_WAVE__PARSE_CHUNK_EXCEPTIONS:
			return ((InternalEList<?>) getParseChunkExceptions()).basicRemove(
					otherEnd, msgs);
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
			getChunks().addAll((Collection<? extends Chunk>) newValue);
			return;
		case WavPackage.RIFF_WAVE__PARSE_CHUNK_EXCEPTIONS:
			getParseChunkExceptions().clear();
			getParseChunkExceptions().addAll(
					(Collection<? extends ParseChunkException>) newValue);
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
			return parseChunkExceptions != null
					&& !parseChunkExceptions.isEmpty();
		case WavPackage.RIFF_WAVE__SIZE:
			return getSize() != SIZE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //RIFFWaveImpl

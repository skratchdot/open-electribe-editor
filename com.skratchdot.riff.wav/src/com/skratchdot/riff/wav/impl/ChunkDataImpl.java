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

import com.skratchdot.riff.wav.Channel;
import com.skratchdot.riff.wav.ChunkData;
import com.skratchdot.riff.wav.ChunkTypeID;
import com.skratchdot.riff.wav.RIFFWave;
import com.skratchdot.riff.wav.WavPackage;
import com.skratchdot.riff.wav.util.RiffWaveException;
import com.skratchdot.riff.wav.util.WavRandomAccessFile;

import java.io.IOException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chunk Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkDataImpl#getChannels <em>Channels</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkDataImpl#getSampleDataOriginal <em>Sample Data Original</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChunkDataImpl extends ChunkImpl implements ChunkData {
	/**
	 * The cached value of the '{@link #getChannels() <em>Channels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannels()
	 * @generated
	 * @ordered
	 */
	protected EList<Channel> channels;

	/**
	 * The default value of the '{@link #getSampleDataOriginal() <em>Sample Data Original</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleDataOriginal()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] SAMPLE_DATA_ORIGINAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSampleDataOriginal() <em>Sample Data Original</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleDataOriginal()
	 * @generated
	 * @ordered
	 */
	protected byte[] sampleDataOriginal = SAMPLE_DATA_ORIGINAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChunkDataImpl() {
		super();
	}

	/**
	 * @param riffWave a valid RIFFWave object
	 * @param in a valid WavRandomAccessFile
	 * @throws RiffWaveException
	 */
	public ChunkDataImpl(RIFFWave riffWave, WavRandomAccessFile in) throws RiffWaveException {
		super();
		try {
			// Check Chunk Type ID
			if(ChunkTypeID.get((int)in.readUnsignedInt())!=this.getChunkTypeID())
				throw new RiffWaveException("Invalid Chunk ID for "+this.getChunkTypeID().getLiteral());

			// Read in data size
			int chunkSize = (int) in.readUnsignedInt();

			// Read in original sample data
			byte[] b = new byte[chunkSize];
			in.readFully(b, 0, chunkSize);
			this.setSampleDataOriginal(b);
			
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
		return WavPackage.Literals.CHUNK_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Channel> getChannels() {
		if (channels == null) {
			channels = new EObjectContainmentEList<Channel>(Channel.class, this, WavPackage.CHUNK_DATA__CHANNELS);
		}
		return channels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getSampleDataOriginal() {
		return sampleDataOriginal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSampleDataOriginal(byte[] newSampleDataOriginal) {
		byte[] oldSampleDataOriginal = sampleDataOriginal;
		sampleDataOriginal = newSampleDataOriginal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_DATA__SAMPLE_DATA_ORIGINAL, oldSampleDataOriginal, sampleDataOriginal));
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getChunkTypeID()
	 */
	@Override
	public ChunkTypeID getChunkTypeID() {
		return ChunkTypeID.DATA;
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getChunkTypeIDValue()
	 */
	@Override
	public int getChunkTypeIDValue() {
		return ChunkTypeID.DATA_VALUE;
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getSize()
	 */
	@Override
	public long getSize() {
		if(this.getSampleDataOriginal()!=null) {
			return this.getSampleDataOriginal().length;
		}
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WavPackage.CHUNK_DATA__CHANNELS:
				return ((InternalEList<?>)getChannels()).basicRemove(otherEnd, msgs);
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
			case WavPackage.CHUNK_DATA__CHANNELS:
				return getChannels();
			case WavPackage.CHUNK_DATA__SAMPLE_DATA_ORIGINAL:
				return getSampleDataOriginal();
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
			case WavPackage.CHUNK_DATA__CHANNELS:
				getChannels().clear();
				getChannels().addAll((Collection<? extends Channel>)newValue);
				return;
			case WavPackage.CHUNK_DATA__SAMPLE_DATA_ORIGINAL:
				setSampleDataOriginal((byte[])newValue);
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
			case WavPackage.CHUNK_DATA__CHANNELS:
				getChannels().clear();
				return;
			case WavPackage.CHUNK_DATA__SAMPLE_DATA_ORIGINAL:
				setSampleDataOriginal(SAMPLE_DATA_ORIGINAL_EDEFAULT);
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
			case WavPackage.CHUNK_DATA__CHANNELS:
				return channels != null && !channels.isEmpty();
			case WavPackage.CHUNK_DATA__SAMPLE_DATA_ORIGINAL:
				return SAMPLE_DATA_ORIGINAL_EDEFAULT == null ? sampleDataOriginal != null : !SAMPLE_DATA_ORIGINAL_EDEFAULT.equals(sampleDataOriginal);
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
		result.append(" (sampleDataOriginal: ");
		result.append(sampleDataOriginal);
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
		if(this.getSampleDataOriginal()!=null) {
			out.write(this.getSampleDataOriginal());
		}
	}

} //ChunkDataImpl

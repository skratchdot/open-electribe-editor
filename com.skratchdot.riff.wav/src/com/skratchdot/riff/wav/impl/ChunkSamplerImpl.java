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

import java.nio.ByteOrder;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.skratchdot.riff.wav.ChunkSampler;
import com.skratchdot.riff.wav.ChunkTypeID;
import com.skratchdot.riff.wav.ParseChunkException;
import com.skratchdot.riff.wav.RIFFWave;
import com.skratchdot.riff.wav.SampleLoop;
import com.skratchdot.riff.wav.WavFactory;
import com.skratchdot.riff.wav.WavPackage;
import com.skratchdot.riff.wav.util.ExtendedByteBuffer;
import com.skratchdot.riff.wav.util.RiffWaveException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chunk Sampler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkSamplerImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkSamplerImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkSamplerImpl#getSamplePeriod <em>Sample Period</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkSamplerImpl#getMidiUnityNote <em>Midi Unity Note</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkSamplerImpl#getMidiPitchFraction <em>Midi Pitch Fraction</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkSamplerImpl#getSmpteFormat <em>Smpte Format</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkSamplerImpl#getSmpteOffset <em>Smpte Offset</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkSamplerImpl#getNumberOfSampleLoops <em>Number Of Sample Loops</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkSamplerImpl#getSamplerDataSize <em>Sampler Data Size</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkSamplerImpl#getSampleLoops <em>Sample Loops</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkSamplerImpl#getSamplerData <em>Sampler Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChunkSamplerImpl extends ChunkImpl implements ChunkSampler {
	/**
	 * The default value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected static final Long MANUFACTURER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected Long manufacturer = MANUFACTURER_EDEFAULT;

	/**
	 * The default value of the '{@link #getProduct() <em>Product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected static final Long PRODUCT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected Long product = PRODUCT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSamplePeriod() <em>Sample Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplePeriod()
	 * @generated
	 * @ordered
	 */
	protected static final Long SAMPLE_PERIOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSamplePeriod() <em>Sample Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplePeriod()
	 * @generated
	 * @ordered
	 */
	protected Long samplePeriod = SAMPLE_PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getMidiUnityNote() <em>Midi Unity Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMidiUnityNote()
	 * @generated
	 * @ordered
	 */
	protected static final Long MIDI_UNITY_NOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMidiUnityNote() <em>Midi Unity Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMidiUnityNote()
	 * @generated
	 * @ordered
	 */
	protected Long midiUnityNote = MIDI_UNITY_NOTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMidiPitchFraction() <em>Midi Pitch Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMidiPitchFraction()
	 * @generated
	 * @ordered
	 */
	protected static final Long MIDI_PITCH_FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMidiPitchFraction() <em>Midi Pitch Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMidiPitchFraction()
	 * @generated
	 * @ordered
	 */
	protected Long midiPitchFraction = MIDI_PITCH_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSmpteFormat() <em>Smpte Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmpteFormat()
	 * @generated
	 * @ordered
	 */
	protected static final Long SMPTE_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSmpteFormat() <em>Smpte Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmpteFormat()
	 * @generated
	 * @ordered
	 */
	protected Long smpteFormat = SMPTE_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSmpteOffset() <em>Smpte Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmpteOffset()
	 * @generated
	 * @ordered
	 */
	protected static final Long SMPTE_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSmpteOffset() <em>Smpte Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmpteOffset()
	 * @generated
	 * @ordered
	 */
	protected Long smpteOffset = SMPTE_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfSampleLoops() <em>Number Of Sample Loops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSampleLoops()
	 * @generated
	 * @ordered
	 */
	protected static final Long NUMBER_OF_SAMPLE_LOOPS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSamplerDataSize() <em>Sampler Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplerDataSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long SAMPLER_DATA_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSampleLoops() <em>Sample Loops</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleLoops()
	 * @generated
	 * @ordered
	 */
	protected EList<SampleLoop> sampleLoops;

	/**
	 * The default value of the '{@link #getSamplerData() <em>Sampler Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplerData()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] SAMPLER_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSamplerData() <em>Sampler Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplerData()
	 * @generated
	 * @ordered
	 */
	protected byte[] samplerData = SAMPLER_DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChunkSamplerImpl() {
		super();
	}

	@Override
	public void init(RIFFWave riffWave, ExtendedByteBuffer buf) throws RiffWaveException {
		// Check Chunk Type ID
		if(ChunkTypeID.get((int)buf.getUnsignedInt())!=this.getChunkTypeID())
			throw new RiffWaveException("Invalid Chunk ID for "+this.getChunkTypeID().getLiteral());

		// Read in data size
		long chunkSize = buf.getUnsignedInt();

		// Set member variables
		this.setManufacturer(buf.getUnsignedInt());
		this.setProduct(buf.getUnsignedInt());
		this.setSamplePeriod(buf.getUnsignedInt());
		this.setMidiUnityNote(buf.getUnsignedInt());
		this.setMidiPitchFraction(buf.getUnsignedInt());
		this.setSmpteFormat(buf.getUnsignedInt());
		this.setSmpteOffset(buf.getUnsignedInt());

		long numSampleLoops = buf.getUnsignedInt();
		int samplerDataSize = (int) buf.getUnsignedInt();

		// Read in sampleLoops
		for(int i=0; i<numSampleLoops; i++) {
			SampleLoop sampleLoop = WavFactory.eINSTANCE.createSampleLoop();
			sampleLoop.setCuePointID(buf.getUnsignedInt());
			sampleLoop.setType(buf.getUnsignedInt());
			sampleLoop.setStart(buf.getUnsignedInt());
			sampleLoop.setEnd(buf.getUnsignedInt());
			sampleLoop.setFraction(buf.getUnsignedInt());
			sampleLoop.setPlayCount(buf.getUnsignedInt());
			this.getSampleLoops().add(sampleLoop);
		}

		// Read in sampler data
		if(samplerDataSize>0) {
			byte[] newSamplerData = new byte[samplerDataSize];
			buf.getBytes(newSamplerData);
			this.setSamplerData(newSamplerData);
		}

		// Does the size we read in match the size we calculate from the data read in?
		if(chunkSize!=this.getSize()) {
			ParseChunkException pce = WavFactory.eINSTANCE.createParseChunkException();
			pce.setException(new Exception("Invalid chunk size for format chunk." +
				"From File: " + Long.toString(chunkSize) +
				"Calculated: " + Long.toString(this.getSize())
			));
			riffWave.getParseChunkExceptions().add(pce);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavPackage.Literals.CHUNK_SAMPLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getManufacturer() {
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturer(Long newManufacturer) {
		Long oldManufacturer = manufacturer;
		manufacturer = newManufacturer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_SAMPLER__MANUFACTURER, oldManufacturer, manufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getProduct() {
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduct(Long newProduct) {
		Long oldProduct = product;
		product = newProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_SAMPLER__PRODUCT, oldProduct, product));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getSamplePeriod() {
		return samplePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSamplePeriod(Long newSamplePeriod) {
		Long oldSamplePeriod = samplePeriod;
		samplePeriod = newSamplePeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_SAMPLER__SAMPLE_PERIOD, oldSamplePeriod, samplePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getMidiUnityNote() {
		return midiUnityNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMidiUnityNote(Long newMidiUnityNote) {
		Long oldMidiUnityNote = midiUnityNote;
		midiUnityNote = newMidiUnityNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_SAMPLER__MIDI_UNITY_NOTE, oldMidiUnityNote, midiUnityNote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getMidiPitchFraction() {
		return midiPitchFraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMidiPitchFraction(Long newMidiPitchFraction) {
		Long oldMidiPitchFraction = midiPitchFraction;
		midiPitchFraction = newMidiPitchFraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_SAMPLER__MIDI_PITCH_FRACTION, oldMidiPitchFraction, midiPitchFraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getSmpteFormat() {
		return smpteFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmpteFormat(Long newSmpteFormat) {
		Long oldSmpteFormat = smpteFormat;
		smpteFormat = newSmpteFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_SAMPLER__SMPTE_FORMAT, oldSmpteFormat, smpteFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getSmpteOffset() {
		return smpteOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmpteOffset(Long newSmpteOffset) {
		Long oldSmpteOffset = smpteOffset;
		smpteOffset = newSmpteOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_SAMPLER__SMPTE_OFFSET, oldSmpteOffset, smpteOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Long getNumberOfSampleLoops() {
		return this.getSampleLoops()==null?0:(long)this.getSampleLoops().size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Long getSamplerDataSize() {
		return this.getSamplerData()==null?0:(long)this.getSamplerData().length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getSamplerData() {
		return samplerData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSamplerData(byte[] newSamplerData) {
		byte[] oldSamplerData = samplerData;
		samplerData = newSamplerData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_SAMPLER__SAMPLER_DATA, oldSamplerData, samplerData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SampleLoop> getSampleLoops() {
		if (sampleLoops == null) {
			sampleLoops = new EObjectContainmentEList<SampleLoop>(SampleLoop.class, this, WavPackage.CHUNK_SAMPLER__SAMPLE_LOOPS);
		}
		return sampleLoops;
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getChunkTypeID()
	 */
	@Override
	public ChunkTypeID getChunkTypeID() {
		return ChunkTypeID.SMPL;
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getChunkTypeIDValue()
	 */
	@Override
	public int getChunkTypeIDValue() {
		return ChunkTypeID.SMPL_VALUE;
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getSize()
	 */
	@Override
	public long getSize() {
		return 36 + (this.getNumberOfSampleLoops() * 24) + this.getSamplerDataSize();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WavPackage.CHUNK_SAMPLER__SAMPLE_LOOPS:
				return ((InternalEList<?>)getSampleLoops()).basicRemove(otherEnd, msgs);
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
			case WavPackage.CHUNK_SAMPLER__MANUFACTURER:
				return getManufacturer();
			case WavPackage.CHUNK_SAMPLER__PRODUCT:
				return getProduct();
			case WavPackage.CHUNK_SAMPLER__SAMPLE_PERIOD:
				return getSamplePeriod();
			case WavPackage.CHUNK_SAMPLER__MIDI_UNITY_NOTE:
				return getMidiUnityNote();
			case WavPackage.CHUNK_SAMPLER__MIDI_PITCH_FRACTION:
				return getMidiPitchFraction();
			case WavPackage.CHUNK_SAMPLER__SMPTE_FORMAT:
				return getSmpteFormat();
			case WavPackage.CHUNK_SAMPLER__SMPTE_OFFSET:
				return getSmpteOffset();
			case WavPackage.CHUNK_SAMPLER__NUMBER_OF_SAMPLE_LOOPS:
				return getNumberOfSampleLoops();
			case WavPackage.CHUNK_SAMPLER__SAMPLER_DATA_SIZE:
				return getSamplerDataSize();
			case WavPackage.CHUNK_SAMPLER__SAMPLE_LOOPS:
				return getSampleLoops();
			case WavPackage.CHUNK_SAMPLER__SAMPLER_DATA:
				return getSamplerData();
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
			case WavPackage.CHUNK_SAMPLER__MANUFACTURER:
				setManufacturer((Long)newValue);
				return;
			case WavPackage.CHUNK_SAMPLER__PRODUCT:
				setProduct((Long)newValue);
				return;
			case WavPackage.CHUNK_SAMPLER__SAMPLE_PERIOD:
				setSamplePeriod((Long)newValue);
				return;
			case WavPackage.CHUNK_SAMPLER__MIDI_UNITY_NOTE:
				setMidiUnityNote((Long)newValue);
				return;
			case WavPackage.CHUNK_SAMPLER__MIDI_PITCH_FRACTION:
				setMidiPitchFraction((Long)newValue);
				return;
			case WavPackage.CHUNK_SAMPLER__SMPTE_FORMAT:
				setSmpteFormat((Long)newValue);
				return;
			case WavPackage.CHUNK_SAMPLER__SMPTE_OFFSET:
				setSmpteOffset((Long)newValue);
				return;
			case WavPackage.CHUNK_SAMPLER__SAMPLE_LOOPS:
				getSampleLoops().clear();
				getSampleLoops().addAll((Collection<? extends SampleLoop>)newValue);
				return;
			case WavPackage.CHUNK_SAMPLER__SAMPLER_DATA:
				setSamplerData((byte[])newValue);
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
			case WavPackage.CHUNK_SAMPLER__MANUFACTURER:
				setManufacturer(MANUFACTURER_EDEFAULT);
				return;
			case WavPackage.CHUNK_SAMPLER__PRODUCT:
				setProduct(PRODUCT_EDEFAULT);
				return;
			case WavPackage.CHUNK_SAMPLER__SAMPLE_PERIOD:
				setSamplePeriod(SAMPLE_PERIOD_EDEFAULT);
				return;
			case WavPackage.CHUNK_SAMPLER__MIDI_UNITY_NOTE:
				setMidiUnityNote(MIDI_UNITY_NOTE_EDEFAULT);
				return;
			case WavPackage.CHUNK_SAMPLER__MIDI_PITCH_FRACTION:
				setMidiPitchFraction(MIDI_PITCH_FRACTION_EDEFAULT);
				return;
			case WavPackage.CHUNK_SAMPLER__SMPTE_FORMAT:
				setSmpteFormat(SMPTE_FORMAT_EDEFAULT);
				return;
			case WavPackage.CHUNK_SAMPLER__SMPTE_OFFSET:
				setSmpteOffset(SMPTE_OFFSET_EDEFAULT);
				return;
			case WavPackage.CHUNK_SAMPLER__SAMPLE_LOOPS:
				getSampleLoops().clear();
				return;
			case WavPackage.CHUNK_SAMPLER__SAMPLER_DATA:
				setSamplerData(SAMPLER_DATA_EDEFAULT);
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
			case WavPackage.CHUNK_SAMPLER__MANUFACTURER:
				return MANUFACTURER_EDEFAULT == null ? manufacturer != null : !MANUFACTURER_EDEFAULT.equals(manufacturer);
			case WavPackage.CHUNK_SAMPLER__PRODUCT:
				return PRODUCT_EDEFAULT == null ? product != null : !PRODUCT_EDEFAULT.equals(product);
			case WavPackage.CHUNK_SAMPLER__SAMPLE_PERIOD:
				return SAMPLE_PERIOD_EDEFAULT == null ? samplePeriod != null : !SAMPLE_PERIOD_EDEFAULT.equals(samplePeriod);
			case WavPackage.CHUNK_SAMPLER__MIDI_UNITY_NOTE:
				return MIDI_UNITY_NOTE_EDEFAULT == null ? midiUnityNote != null : !MIDI_UNITY_NOTE_EDEFAULT.equals(midiUnityNote);
			case WavPackage.CHUNK_SAMPLER__MIDI_PITCH_FRACTION:
				return MIDI_PITCH_FRACTION_EDEFAULT == null ? midiPitchFraction != null : !MIDI_PITCH_FRACTION_EDEFAULT.equals(midiPitchFraction);
			case WavPackage.CHUNK_SAMPLER__SMPTE_FORMAT:
				return SMPTE_FORMAT_EDEFAULT == null ? smpteFormat != null : !SMPTE_FORMAT_EDEFAULT.equals(smpteFormat);
			case WavPackage.CHUNK_SAMPLER__SMPTE_OFFSET:
				return SMPTE_OFFSET_EDEFAULT == null ? smpteOffset != null : !SMPTE_OFFSET_EDEFAULT.equals(smpteOffset);
			case WavPackage.CHUNK_SAMPLER__NUMBER_OF_SAMPLE_LOOPS:
				return NUMBER_OF_SAMPLE_LOOPS_EDEFAULT == null ? getNumberOfSampleLoops() != null : !NUMBER_OF_SAMPLE_LOOPS_EDEFAULT.equals(getNumberOfSampleLoops());
			case WavPackage.CHUNK_SAMPLER__SAMPLER_DATA_SIZE:
				return SAMPLER_DATA_SIZE_EDEFAULT == null ? getSamplerDataSize() != null : !SAMPLER_DATA_SIZE_EDEFAULT.equals(getSamplerDataSize());
			case WavPackage.CHUNK_SAMPLER__SAMPLE_LOOPS:
				return sampleLoops != null && !sampleLoops.isEmpty();
			case WavPackage.CHUNK_SAMPLER__SAMPLER_DATA:
				return SAMPLER_DATA_EDEFAULT == null ? samplerData != null : !SAMPLER_DATA_EDEFAULT.equals(samplerData);
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
		result.append(" (manufacturer: ");
		result.append(manufacturer);
		result.append(", product: ");
		result.append(product);
		result.append(", samplePeriod: ");
		result.append(samplePeriod);
		result.append(", midiUnityNote: ");
		result.append(midiUnityNote);
		result.append(", midiPitchFraction: ");
		result.append(midiPitchFraction);
		result.append(", smpteFormat: ");
		result.append(smpteFormat);
		result.append(", smpteOffset: ");
		result.append(smpteOffset);
		result.append(", samplerData: ");
		result.append(samplerData);
		result.append(')');
		return result.toString();
	}

	@Override
	public byte[] toByteArray() {
		ExtendedByteBuffer buf = new ExtendedByteBuffer((int) this.getSize()+8);
		buf.order(ByteOrder.LITTLE_ENDIAN);

		buf.putUnsignedInt(this.getChunkTypeIDValue());
		buf.putUnsignedInt(this.getSize());

		buf.putUnsignedInt(this.getManufacturer());
		buf.putUnsignedInt(this.getProduct());
		buf.putUnsignedInt(this.getSamplePeriod());
		buf.putUnsignedInt(this.getMidiUnityNote());
		buf.putUnsignedInt(this.getMidiPitchFraction());
		buf.putUnsignedInt(this.getSmpteFormat());
		buf.putUnsignedInt(this.getSmpteOffset());
		
		buf.putUnsignedInt(this.getNumberOfSampleLoops());
		buf.putUnsignedInt(this.getSamplerDataSize());

		// Write sampleLoops
		for(int i=0; i<this.getNumberOfSampleLoops(); i++) {
			buf.putUnsignedInt(this.getSampleLoops().get(i).getCuePointID());
			buf.putUnsignedInt(this.getSampleLoops().get(i).getType());
			buf.putUnsignedInt(this.getSampleLoops().get(i).getStart());
			buf.putUnsignedInt(this.getSampleLoops().get(i).getEnd());
			buf.putUnsignedInt(this.getSampleLoops().get(i).getFraction());
			buf.putUnsignedInt(this.getSampleLoops().get(i).getPlayCount());
		}
		
		// Write Sampler Data
		if(this.getSamplerDataSize()>0) {
			buf.putBytes(this.getSamplerData());
		}

		return buf.array();
	}

} //ChunkSamplerImpl

/**
 * Copyright (c) 2009-2010 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 *
 * $Id$
 */
package com.skratchdot.electribe.model.esx.impl;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.skratchdot.electribe.model.esx.EsxFactory;
import com.skratchdot.electribe.model.esx.EsxFile;
import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.GlobalParameters;
import com.skratchdot.electribe.model.esx.Pattern;
import com.skratchdot.electribe.model.esx.Sample;
import com.skratchdot.electribe.model.esx.SampleMono;
import com.skratchdot.electribe.model.esx.SampleStereo;
import com.skratchdot.electribe.model.esx.Song;
import com.skratchdot.electribe.model.esx.util.EsxException;
import com.skratchdot.electribe.model.esx.util.EsxRandomAccess;
import com.skratchdot.electribe.model.esx.util.EsxUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.EsxFileImpl#getOriginalNonAudioData <em>Original Non Audio Data</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.EsxFileImpl#getGlobalParameters <em>Global Parameters</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.EsxFileImpl#getPatterns <em>Patterns</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.EsxFileImpl#getSongs <em>Songs</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.EsxFileImpl#getSamples <em>Samples</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.EsxFileImpl#getBlankPattern <em>Blank Pattern</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.EsxFileImpl#getBlankSong <em>Blank Song</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.EsxFileImpl#getMemUsedInBytes <em>Mem Used In Bytes</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.EsxFileImpl#getMemFreeInBytes <em>Mem Free In Bytes</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.EsxFileImpl#getNumPatternsUsed <em>Num Patterns Used</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.EsxFileImpl#getNumSamplesUsed <em>Num Samples Used</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.EsxFileImpl#getNumSamplesMonoUsed <em>Num Samples Mono Used</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.EsxFileImpl#getNumSamplesStereoUsed <em>Num Samples Stereo Used</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.EsxFileImpl#getNumSongsUsed <em>Num Songs Used</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EsxFileImpl extends EObjectImpl implements EsxFile {
	/**
	 * The default value of the '{@link #getOriginalNonAudioData() <em>Original Non Audio Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalNonAudioData()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] ORIGINAL_NON_AUDIO_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginalNonAudioData() <em>Original Non Audio Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalNonAudioData()
	 * @generated
	 * @ordered
	 */
	protected byte[] originalNonAudioData = ORIGINAL_NON_AUDIO_DATA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGlobalParameters() <em>Global Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalParameters()
	 * @generated
	 * @ordered
	 */
	protected GlobalParameters globalParameters;

	/**
	 * The cached value of the '{@link #getPatterns() <em>Patterns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern> patterns;

	/**
	 * The cached value of the '{@link #getSongs() <em>Songs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSongs()
	 * @generated
	 * @ordered
	 */
	protected EList<Song> songs;

	/**
	 * The cached value of the '{@link #getSamples() <em>Samples</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamples()
	 * @generated
	 * @ordered
	 */
	protected EList<Sample> samples;

	/**
	 * The cached value of the '{@link #getBlankPattern() <em>Blank Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlankPattern()
	 * @generated
	 * @ordered
	 */
	protected Pattern blankPattern;

	/**
	 * The cached value of the '{@link #getBlankSong() <em>Blank Song</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlankSong()
	 * @generated
	 * @ordered
	 */
	protected Song blankSong;

	/**
	 * The default value of the '{@link #getMemUsedInBytes() <em>Mem Used In Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemUsedInBytes()
	 * @generated
	 * @ordered
	 */
	protected static final int MEM_USED_IN_BYTES_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getMemFreeInBytes() <em>Mem Free In Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemFreeInBytes()
	 * @generated
	 * @ordered
	 */
	protected static final int MEM_FREE_IN_BYTES_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getNumPatternsUsed() <em>Num Patterns Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPatternsUsed()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_PATTERNS_USED_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getNumSamplesUsed() <em>Num Samples Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumSamplesUsed()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_SAMPLES_USED_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getNumSamplesMonoUsed() <em>Num Samples Mono Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumSamplesMonoUsed()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_SAMPLES_MONO_USED_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getNumSamplesStereoUsed() <em>Num Samples Stereo Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumSamplesStereoUsed()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_SAMPLES_STEREO_USED_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getNumSongsUsed() <em>Num Songs Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumSongsUsed()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_SONGS_USED_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected EsxFileImpl() {
		super();
		init();
	}

	protected EsxFileImpl(EsxRandomAccess in, IProgressMonitor monitor) throws EsxException {
		super();
		init();
		try {
			// Store all our "non-sample data" which will be overwritten when saving
			// the file
			monitor.subTask("Loading original non-audio data");
			byte[] newOriginalNonAudioData = new byte[EsxUtil.SIZE_FILE_MIN];
			in.seek(EsxUtil.ADDR_VALID_ESX_CHECK_1);
			in.read(newOriginalNonAudioData, 0, EsxUtil.SIZE_FILE_MIN);
			this.setOriginalNonAudioData(newOriginalNonAudioData);

			// Get global parameters
			monitor.subTask("Loading Global Parameters");
			GlobalParameters newGlobalParameters = EsxFactory.eINSTANCE.createGlobalParametersFromEsxFile(in);
			this.setGlobalParameters(newGlobalParameters);

			// Get pattern info
			for (int i = 0; i < EsxUtil.NUM_PATTERNS; i++) {
				monitor.subTask("Loading pattern " + (i + 1) + " of " + EsxUtil.NUM_PATTERNS);
				Pattern pattern = EsxFactory.eINSTANCE.createPatternFromEsxFile(in, i);
				this.getPatterns().add(i, pattern);
				monitor.worked(1);
			}

			// Get song info
			for (int i = 0; i < EsxUtil.NUM_SONGS; i++) {
				monitor.subTask("Loading song " + (i + 1) + " of " + EsxUtil.NUM_SONGS);
				Song song = EsxFactory.eINSTANCE.createSongFromEsxFile(in, i);
				this.getSongs().add(i, song);
				monitor.worked(1);
			}

			// Get sample info
			for (int i = 0; i < EsxUtil.NUM_SAMPLES; i++) {
				if(i < EsxUtil.NUM_SAMPLES_MONO) {
					monitor.subTask("Loading mono sample " + (i + 1) + " of " + EsxUtil.NUM_SAMPLES_MONO);
					SampleMono mono = EsxFactory.eINSTANCE.createSampleMonoFromEsxFile(in, i);
					this.getSamples().add(i, mono);
					monitor.worked(1);
				}
				else {
					monitor.subTask("Loading stereo sample " + (i + 1) + " of " + EsxUtil.NUM_SAMPLES_STEREO);
					SampleStereo stereo = EsxFactory.eINSTANCE.createSampleStereoFromEsxFile(in, i-EsxUtil.NUM_SAMPLES_MONO);
					this.getSamples().add(i, stereo);
					monitor.worked(1);
				}
			}

			// Initialize the blank pattern
			Pattern blankPattern = EsxFactory.eINSTANCE.createPatternFromEsxFile(in, EsxUtil.NUM_PATTERNS-1);
			this.setBlankPattern(blankPattern);

			// Initialize the blank pattern
			Song blankSong = EsxFactory.eINSTANCE.createSongFromEsxFile(in, EsxUtil.NUM_SONGS-1);
			this.setBlankSong(blankSong);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void init() {
		eAdapters().add(new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				// When getBlankPattern() changes
				if( EsxPackage.Literals.ESX_FILE__BLANK_PATTERN.equals(msg.getFeature()) ) {
					if (eNotificationRequired()) {
						eNotify(new ENotificationImpl(EsxFileImpl.this, Notification.SET, EsxPackage.ESX_FILE__NUM_PATTERNS_USED, 0, getNumPatternsUsed()));
					}
				}
				// When getBlankSong() changes
				if( EsxPackage.Literals.ESX_FILE__BLANK_SONG.equals(msg.getFeature()) ) {
					if (eNotificationRequired()) {
						eNotify(new ENotificationImpl(EsxFileImpl.this, Notification.SET, EsxPackage.ESX_FILE__NUM_SONGS_USED, 0, getNumSongsUsed()));
					}
				}
				// When getPatterns() changes
				if( EsxPackage.Literals.ESX_FILE__PATTERNS.equals(msg.getFeature()) ) {
					if (eNotificationRequired()) {
						eNotify(new ENotificationImpl(EsxFileImpl.this, Notification.SET, EsxPackage.ESX_FILE__NUM_PATTERNS_USED, 0, getNumPatternsUsed()));
					}
				}
				// When getSamples() changes
				if( EsxPackage.Literals.ESX_FILE__SAMPLES.equals(msg.getFeature()) ) {
					if (eNotificationRequired()) {
						eNotify(new ENotificationImpl(EsxFileImpl.this, Notification.SET, EsxPackage.ESX_FILE__MEM_FREE_IN_BYTES, 0, getMemFreeInBytes()));
						eNotify(new ENotificationImpl(EsxFileImpl.this, Notification.SET, EsxPackage.ESX_FILE__MEM_USED_IN_BYTES, 0, getMemUsedInBytes()));
						eNotify(new ENotificationImpl(EsxFileImpl.this, Notification.SET, EsxPackage.ESX_FILE__NUM_SAMPLES_USED, 0, getNumSamplesUsed()));
						eNotify(new ENotificationImpl(EsxFileImpl.this, Notification.SET, EsxPackage.ESX_FILE__NUM_SAMPLES_MONO_USED, 0, getNumSamplesMonoUsed()));
						eNotify(new ENotificationImpl(EsxFileImpl.this, Notification.SET, EsxPackage.ESX_FILE__NUM_SAMPLES_STEREO_USED, 0, getNumSamplesStereoUsed()));
					}
				}
				// When getSongs() changes
				if( EsxPackage.Literals.ESX_FILE__SONGS.equals(msg.getFeature()) ) {
					if (eNotificationRequired()) {
						eNotify(new ENotificationImpl(EsxFileImpl.this, Notification.SET, EsxPackage.ESX_FILE__NUM_SONGS_USED, 0, getNumSongsUsed()));
					}
				}
			}
		});
	}

    @Override
	public void write(EsxRandomAccess out, IProgressMonitor monitor) throws IOException, EsxException {
		// Write original data (we will overwrite invalid data with our known
		// data structures)
		monitor.subTask("Saving original non-audio data");
		out.seek(0);
		out.write(this.getOriginalNonAudioData());
		monitor.worked(1);

		// Write global parameters
		this.getGlobalParameters().write(out);

		// Write Pattern Data
		for (int i = 0; i < EsxUtil.NUM_PATTERNS; i++) {
			monitor.subTask("Saving pattern " + (i + 1) + " of " + EsxUtil.NUM_PATTERNS);
			this.getPatterns().get(i).write(out, i);
			monitor.worked(1);
		}

		// Write Song Data
		int currentSongEventNumber = 0;
		for (int i = 0; i < EsxUtil.NUM_SONGS; i++) {
			monitor.subTask("Saving song " + (i + 1) + " of " + EsxUtil.NUM_SONGS);
			this.getSongs().get(i).write(out, i, currentSongEventNumber);
			currentSongEventNumber += this.getSongs().get(i).getNumberOfSongEvents();
			monitor.worked(1);
		}

		// This is a temporary variable to hold start/end offsets for
		// mono/stereo samples
		int currentOffset = 0x00;
		int currentNumberOfSampleFrames = 0x00;
		int padOddOrEven = 0x00;
		int padOne = 0x00;

		// Write Mono Sample Data
		for (int i = 0; i < EsxUtil.NUM_SAMPLES_MONO; i++) {
			monitor.subTask("Saving mono sample " + (i + 1) + " of " + EsxUtil.NUM_SAMPLES_MONO);

			// Get current mono sample
			SampleMono mono = (SampleMono) this.getSamples().get(i);

			// Get current number of sample frames
			currentNumberOfSampleFrames = mono.getNumberOfSampleFrames();

			if(currentNumberOfSampleFrames>0) {
				// Setup pad bytes
				if(currentNumberOfSampleFrames==1) {
					padOne = 2;
					padOddOrEven = 4;
				}
				else if(currentNumberOfSampleFrames%2==0) {
					padOne = 0;
					padOddOrEven = 4;
				}
				else {
					padOne = 0;
					padOddOrEven = 2;
				}

				// Setup Channel 1 & 2 (as mono) start offset
				mono.setOffsetChannel1Start(currentOffset);
				mono.setOffsetChannel2Start(currentOffset);

				// Setup Channel 1 & 2 (as mono) end offset
				currentOffset = currentOffset + (mono.getNumberOfSampleFrames() * 2) + 16 + padOne;
				mono.setOffsetChannel1End(currentOffset);
				mono.setOffsetChannel2End(currentOffset);
				currentOffset = currentOffset + padOddOrEven;

				// Write Channel 1 & 2 (as mono) Sample Data
				ByteBuffer bufferChannel1 = ByteBuffer.wrap(mono.getAudioDataChannel1());
				ByteBuffer bufferChannel2 = ByteBuffer.wrap(mono.getAudioDataChannel2());
				ByteBuffer bufferBoth = ByteBuffer.allocate(bufferChannel1.capacity());
				short shortChannel1;
				short shortChannel2;
				short shortBoth;
				for (int j = 0; j < mono.getNumberOfSampleFrames(); j++) {
					shortChannel1 = bufferChannel1.getShort();
					shortChannel2 = bufferChannel2.getShort();
					shortBoth = (short) (((int)shortChannel1 + (int)shortChannel2) / 2);
					bufferBoth.putShort(shortBoth);
				}
				out.seek(EsxUtil.ADDR_SAMPLE_DATA + mono.getOffsetChannel1Start());
				out.writeInt(0x80007FFF);
				out.writeInt(mono.getOffsetChannel1Start());
				out.writeInt(mono.getOffsetChannel1End());
				out.writeByte(i); // sample number
				out.writeByte(0); // denotes mono / channel 1
				out.writeShort(0xffff);
				out.write(bufferBoth.array());
				out.write(EsxUtil.getByteArrayWithLength("", padOddOrEven + padOne, (byte) 0x00));
			}
			else {
				mono.setOffsetChannel1Start(0xFFFFFFFF);
				mono.setOffsetChannel1End(0);
				mono.setSliceArray(EsxUtil.getByteArrayWithLength("", EsxUtil.CHUNKSIZE_SLICE_DATA, (byte) 0xFF));
			}

			// Write Sample Header Info
			mono.writeHeader(out, i);

			// Write Slice Info
			mono.writeSlice(out, i);

			monitor.worked(1);
		}

		// Write Stereo Sample Data
		for (int i = 0; i < EsxUtil.NUM_SAMPLES_STEREO; i++) {
			monitor.subTask("Saving stereo sample " + (i + 1) + " of " + EsxUtil.NUM_SAMPLES_STEREO);

			// Get current stereo sample
			SampleStereo stereo = (SampleStereo) this.getSamples().get(i + EsxUtil.NUM_SAMPLES_MONO);

			// Get current number of sample frames
			currentNumberOfSampleFrames = stereo.getNumberOfSampleFrames();

			if(currentNumberOfSampleFrames>0) {
				// Setup pad bytes
				if(currentNumberOfSampleFrames==1) {
					padOne = 2;
					padOddOrEven = 4;
				}
				else if(currentNumberOfSampleFrames%2==0) {
					padOne = 0;
					padOddOrEven = 4;
				}
				else {
					padOne = 0;
					padOddOrEven = 2;
				}

				// Setup Channel 1 start offset
				stereo.setOffsetChannel1Start(currentOffset);

				// Setup Channel 1 end offset
				currentOffset = currentOffset + (stereo.getNumberOfSampleFrames() * 2) + 16 + padOne;
				stereo.setOffsetChannel1End(currentOffset);
				currentOffset = currentOffset + padOddOrEven;

				// Write Channel 1 Sample Data
				out.seek(EsxUtil.ADDR_SAMPLE_DATA + stereo.getOffsetChannel1Start());
				out.writeInt(0x80007FFF);
				out.writeInt(stereo.getOffsetChannel1Start());
				out.writeInt(stereo.getOffsetChannel1End());
				out.writeByte(i); // sample number
				out.writeByte(0); // denotes stereo / channel 1
				out.writeShort(0xffff);
				out.write(stereo.getAudioDataChannel1());
				out.write(EsxUtil.getByteArrayWithLength("", padOddOrEven + padOne, (byte) 0x00));

				// Setup Channel 2 start offset
				stereo.setOffsetChannel2Start(currentOffset);

				// Setup Channel 2 end offset
				currentOffset = currentOffset + (stereo.getNumberOfSampleFrames() * 2) + 16 + padOne;
				stereo.setOffsetChannel2End(currentOffset);
				currentOffset = currentOffset + padOddOrEven;

				// Write Channel 2 Sample Data
				out.seek(EsxUtil.ADDR_SAMPLE_DATA + stereo.getOffsetChannel2Start());
				out.writeInt(0x80007FFF);
				out.writeInt(stereo.getOffsetChannel2Start());
				out.writeInt(stereo.getOffsetChannel2End());
				out.writeByte(i); // sample number
				out.writeByte(0); // denotes stereo / channel 2
				out.writeShort(0xffff);
				out.write(stereo.getAudioDataChannel2());
				out.write(EsxUtil.getByteArrayWithLength("", padOddOrEven + padOne, (byte) 0x00));
			}
			else {
				stereo.setOffsetChannel1Start(0xFFFFFFFF);
				stereo.setOffsetChannel1End(0);
				stereo.setOffsetChannel2Start(0xFFFFFFFF);
				stereo.setOffsetChannel2End(0);
			}


			// Write Sample Header Info
			stereo.writeHeader(out, i);

			monitor.worked(1);
		}

		// Write EOF data
		out.seek(EsxUtil.ADDR_SAMPLE_DATA + currentOffset);
		out.writeInt(0x80007FFF);
		out.writeInt(currentOffset);
		out.writeInt(0x017FFFFE);
		out.writeInt(0x00FFFFFF);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsxPackage.Literals.ESX_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getOriginalNonAudioData() {
		return originalNonAudioData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalNonAudioData(byte[] newOriginalNonAudioData) {
		byte[] oldOriginalNonAudioData = originalNonAudioData;
		originalNonAudioData = newOriginalNonAudioData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.ESX_FILE__ORIGINAL_NON_AUDIO_DATA, oldOriginalNonAudioData, originalNonAudioData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalParameters getGlobalParameters() {
		return globalParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalParameters(GlobalParameters newGlobalParameters, NotificationChain msgs) {
		GlobalParameters oldGlobalParameters = globalParameters;
		globalParameters = newGlobalParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsxPackage.ESX_FILE__GLOBAL_PARAMETERS, oldGlobalParameters, newGlobalParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalParameters(GlobalParameters newGlobalParameters) {
		if (newGlobalParameters != globalParameters) {
			NotificationChain msgs = null;
			if (globalParameters != null)
				msgs = ((InternalEObject)globalParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsxPackage.ESX_FILE__GLOBAL_PARAMETERS, null, msgs);
			if (newGlobalParameters != null)
				msgs = ((InternalEObject)newGlobalParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsxPackage.ESX_FILE__GLOBAL_PARAMETERS, null, msgs);
			msgs = basicSetGlobalParameters(newGlobalParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.ESX_FILE__GLOBAL_PARAMETERS, newGlobalParameters, newGlobalParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern> getPatterns() {
		if (patterns == null) {
			patterns = new EObjectContainmentEList<Pattern>(Pattern.class, this, EsxPackage.ESX_FILE__PATTERNS);
		}
		return patterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Song> getSongs() {
		if (songs == null) {
			songs = new EObjectContainmentEList<Song>(Song.class, this, EsxPackage.ESX_FILE__SONGS);
		}
		return songs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sample> getSamples() {
		if (samples == null) {
			samples = new EObjectContainmentEList<Sample>(Sample.class, this, EsxPackage.ESX_FILE__SAMPLES);
		}
		return samples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern getBlankPattern() {
		return blankPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlankPattern(Pattern newBlankPattern, NotificationChain msgs) {
		Pattern oldBlankPattern = blankPattern;
		blankPattern = newBlankPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsxPackage.ESX_FILE__BLANK_PATTERN, oldBlankPattern, newBlankPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlankPattern(Pattern newBlankPattern) {
		if (newBlankPattern != blankPattern) {
			NotificationChain msgs = null;
			if (blankPattern != null)
				msgs = ((InternalEObject)blankPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsxPackage.ESX_FILE__BLANK_PATTERN, null, msgs);
			if (newBlankPattern != null)
				msgs = ((InternalEObject)newBlankPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsxPackage.ESX_FILE__BLANK_PATTERN, null, msgs);
			msgs = basicSetBlankPattern(newBlankPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.ESX_FILE__BLANK_PATTERN, newBlankPattern, newBlankPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Song getBlankSong() {
		return blankSong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlankSong(Song newBlankSong, NotificationChain msgs) {
		Song oldBlankSong = blankSong;
		blankSong = newBlankSong;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsxPackage.ESX_FILE__BLANK_SONG, oldBlankSong, newBlankSong);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlankSong(Song newBlankSong) {
		if (newBlankSong != blankSong) {
			NotificationChain msgs = null;
			if (blankSong != null)
				msgs = ((InternalEObject)blankSong).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsxPackage.ESX_FILE__BLANK_SONG, null, msgs);
			if (newBlankSong != null)
				msgs = ((InternalEObject)newBlankSong).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsxPackage.ESX_FILE__BLANK_SONG, null, msgs);
			msgs = basicSetBlankSong(newBlankSong, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.ESX_FILE__BLANK_SONG, newBlankSong, newBlankSong));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getMemUsedInBytes() {
		int returnValue = 0;
		for(int i=0; i<this.getSamples().size(); i++) {
			returnValue += this.getSamples().get(i).getMemUsedInBytes();
		}
		return returnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getMemFreeInBytes() {
		return (EsxUtil.MAX_NUM_SAMPLES * 2) - this.getMemUsedInBytes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getNumPatternsUsed() {
		int returnValue = 0;
		for(int i=0; i<this.getPatterns().size(); i++) {
			if (this.getPatterns().get(i).isBeingUsed()) {
				returnValue++;
			}
		}
		return returnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getNumSamplesUsed() {
		return this.getNumSamplesMonoUsed()+this.getNumSamplesStereoUsed();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getNumSamplesMonoUsed() {
		int returnValue = 0;
		for(int i=0; i<this.getSamples().size() && i<EsxUtil.NUM_SAMPLES_MONO; i++) {
			if (this.getSamples().get(i).isBeingUsed()) {
				returnValue++;
			}
		}
		return returnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getNumSamplesStereoUsed() {
		int returnValue = 0;
		for(int i=EsxUtil.NUM_SAMPLES_MONO; i<this.getSamples().size() && i<EsxUtil.NUM_SAMPLES; i++) {
			if (this.getSamples().get(i).isBeingUsed()) {
				returnValue++;
			}
		}
		return returnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getNumSongsUsed() {
		int returnValue = 0;
		for(int i=0; i<this.getSongs().size(); i++) {
			if (this.getSongs().get(i).isBeingUsed()) {
				returnValue++;
			}
		}
		return returnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int findFirstUnusedSample(boolean searchMono, boolean searchStereo, int startingSampleNumber, ArrayList<Integer> skipSampleNumbers) {
		int returnValue = -1;

		if(searchMono) {
			for(int i=0; i<EsxUtil.NUM_SAMPLES_MONO; i++) {
				if(this.getSamples().get(i).isBeingUsed()==false && !skipSampleNumbers.contains(i)) {
					if(i>=startingSampleNumber) {
						return i;
					}
					else if (returnValue==-1) {
						returnValue = i;
					}
				}
			}
		}
		
		if(searchStereo) {
			for(int i=EsxUtil.NUM_SAMPLES_MONO; i<EsxUtil.NUM_SAMPLES; i++) {
				if(this.getSamples().get(i).isBeingUsed()==false && !skipSampleNumbers.contains(i)) {
					if(i>=startingSampleNumber) {
						return i;
					}
					else if (returnValue==-1) {
						returnValue = i;
					}
				}
			}
		}
		
		return returnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsxPackage.ESX_FILE__GLOBAL_PARAMETERS:
				return basicSetGlobalParameters(null, msgs);
			case EsxPackage.ESX_FILE__PATTERNS:
				return ((InternalEList<?>)getPatterns()).basicRemove(otherEnd, msgs);
			case EsxPackage.ESX_FILE__SONGS:
				return ((InternalEList<?>)getSongs()).basicRemove(otherEnd, msgs);
			case EsxPackage.ESX_FILE__SAMPLES:
				return ((InternalEList<?>)getSamples()).basicRemove(otherEnd, msgs);
			case EsxPackage.ESX_FILE__BLANK_PATTERN:
				return basicSetBlankPattern(null, msgs);
			case EsxPackage.ESX_FILE__BLANK_SONG:
				return basicSetBlankSong(null, msgs);
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
			case EsxPackage.ESX_FILE__ORIGINAL_NON_AUDIO_DATA:
				return getOriginalNonAudioData();
			case EsxPackage.ESX_FILE__GLOBAL_PARAMETERS:
				return getGlobalParameters();
			case EsxPackage.ESX_FILE__PATTERNS:
				return getPatterns();
			case EsxPackage.ESX_FILE__SONGS:
				return getSongs();
			case EsxPackage.ESX_FILE__SAMPLES:
				return getSamples();
			case EsxPackage.ESX_FILE__BLANK_PATTERN:
				return getBlankPattern();
			case EsxPackage.ESX_FILE__BLANK_SONG:
				return getBlankSong();
			case EsxPackage.ESX_FILE__MEM_USED_IN_BYTES:
				return getMemUsedInBytes();
			case EsxPackage.ESX_FILE__MEM_FREE_IN_BYTES:
				return getMemFreeInBytes();
			case EsxPackage.ESX_FILE__NUM_PATTERNS_USED:
				return getNumPatternsUsed();
			case EsxPackage.ESX_FILE__NUM_SAMPLES_USED:
				return getNumSamplesUsed();
			case EsxPackage.ESX_FILE__NUM_SAMPLES_MONO_USED:
				return getNumSamplesMonoUsed();
			case EsxPackage.ESX_FILE__NUM_SAMPLES_STEREO_USED:
				return getNumSamplesStereoUsed();
			case EsxPackage.ESX_FILE__NUM_SONGS_USED:
				return getNumSongsUsed();
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
			case EsxPackage.ESX_FILE__ORIGINAL_NON_AUDIO_DATA:
				setOriginalNonAudioData((byte[])newValue);
				return;
			case EsxPackage.ESX_FILE__GLOBAL_PARAMETERS:
				setGlobalParameters((GlobalParameters)newValue);
				return;
			case EsxPackage.ESX_FILE__PATTERNS:
				getPatterns().clear();
				getPatterns().addAll((Collection<? extends Pattern>)newValue);
				return;
			case EsxPackage.ESX_FILE__SONGS:
				getSongs().clear();
				getSongs().addAll((Collection<? extends Song>)newValue);
				return;
			case EsxPackage.ESX_FILE__SAMPLES:
				getSamples().clear();
				getSamples().addAll((Collection<? extends Sample>)newValue);
				return;
			case EsxPackage.ESX_FILE__BLANK_PATTERN:
				setBlankPattern((Pattern)newValue);
				return;
			case EsxPackage.ESX_FILE__BLANK_SONG:
				setBlankSong((Song)newValue);
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
			case EsxPackage.ESX_FILE__ORIGINAL_NON_AUDIO_DATA:
				setOriginalNonAudioData(ORIGINAL_NON_AUDIO_DATA_EDEFAULT);
				return;
			case EsxPackage.ESX_FILE__GLOBAL_PARAMETERS:
				setGlobalParameters((GlobalParameters)null);
				return;
			case EsxPackage.ESX_FILE__PATTERNS:
				getPatterns().clear();
				return;
			case EsxPackage.ESX_FILE__SONGS:
				getSongs().clear();
				return;
			case EsxPackage.ESX_FILE__SAMPLES:
				getSamples().clear();
				return;
			case EsxPackage.ESX_FILE__BLANK_PATTERN:
				setBlankPattern((Pattern)null);
				return;
			case EsxPackage.ESX_FILE__BLANK_SONG:
				setBlankSong((Song)null);
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
			case EsxPackage.ESX_FILE__ORIGINAL_NON_AUDIO_DATA:
				return ORIGINAL_NON_AUDIO_DATA_EDEFAULT == null ? originalNonAudioData != null : !ORIGINAL_NON_AUDIO_DATA_EDEFAULT.equals(originalNonAudioData);
			case EsxPackage.ESX_FILE__GLOBAL_PARAMETERS:
				return globalParameters != null;
			case EsxPackage.ESX_FILE__PATTERNS:
				return patterns != null && !patterns.isEmpty();
			case EsxPackage.ESX_FILE__SONGS:
				return songs != null && !songs.isEmpty();
			case EsxPackage.ESX_FILE__SAMPLES:
				return samples != null && !samples.isEmpty();
			case EsxPackage.ESX_FILE__BLANK_PATTERN:
				return blankPattern != null;
			case EsxPackage.ESX_FILE__BLANK_SONG:
				return blankSong != null;
			case EsxPackage.ESX_FILE__MEM_USED_IN_BYTES:
				return getMemUsedInBytes() != MEM_USED_IN_BYTES_EDEFAULT;
			case EsxPackage.ESX_FILE__MEM_FREE_IN_BYTES:
				return getMemFreeInBytes() != MEM_FREE_IN_BYTES_EDEFAULT;
			case EsxPackage.ESX_FILE__NUM_PATTERNS_USED:
				return getNumPatternsUsed() != NUM_PATTERNS_USED_EDEFAULT;
			case EsxPackage.ESX_FILE__NUM_SAMPLES_USED:
				return getNumSamplesUsed() != NUM_SAMPLES_USED_EDEFAULT;
			case EsxPackage.ESX_FILE__NUM_SAMPLES_MONO_USED:
				return getNumSamplesMonoUsed() != NUM_SAMPLES_MONO_USED_EDEFAULT;
			case EsxPackage.ESX_FILE__NUM_SAMPLES_STEREO_USED:
				return getNumSamplesStereoUsed() != NUM_SAMPLES_STEREO_USED_EDEFAULT;
			case EsxPackage.ESX_FILE__NUM_SONGS_USED:
				return getNumSongsUsed() != NUM_SONGS_USED_EDEFAULT;
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
		result.append(" (originalNonAudioData: ");
		result.append(originalNonAudioData);
		result.append(')');
		return result.toString();
	}

} //EsxFileImpl

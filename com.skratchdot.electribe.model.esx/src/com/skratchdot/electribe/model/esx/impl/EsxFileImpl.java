/*******************************************************************************
 * Copyright (c) 2009-2013 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 *******************************************************************************/
package com.skratchdot.electribe.model.esx.impl;

import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

import com.skratchdot.electribe.model.esx.AudioChannelType;
import com.skratchdot.electribe.model.esx.EsxFactory;
import com.skratchdot.electribe.model.esx.EsxFile;
import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.GlobalParameters;
import com.skratchdot.electribe.model.esx.Pattern;
import com.skratchdot.electribe.model.esx.Sample;
import com.skratchdot.electribe.model.esx.Song;
import com.skratchdot.electribe.model.esx.util.EsxUtil;
import com.skratchdot.electribe.model.esx.util.EsxValidator;
import com.skratchdot.electribe.model.esx.util.ExtendedByteBuffer;

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
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.EsxFileImpl#getEmptyPattern <em>Empty Pattern</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.EsxFileImpl#getEmptySong <em>Empty Song</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.EsxFileImpl#getMaxSampleOffset <em>Max Sample Offset</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.EsxFileImpl#getMemUsedInBytes <em>Mem Used In Bytes</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.EsxFileImpl#getMemUsedInSeconds <em>Mem Used In Seconds</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.EsxFileImpl#getMemFreeInBytes <em>Mem Free In Bytes</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.EsxFileImpl#getMemFreeInSeconds <em>Mem Free In Seconds</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.EsxFileImpl#getNumPatternsEmpty <em>Num Patterns Empty</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.EsxFileImpl#getNumPatternsNotEmpty <em>Num Patterns Not Empty</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.EsxFileImpl#getNumSamplesEmpty <em>Num Samples Empty</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.EsxFileImpl#getNumSamplesNotEmpty <em>Num Samples Not Empty</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.EsxFileImpl#getNumSamplesMonoEmpty <em>Num Samples Mono Empty</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.EsxFileImpl#getNumSamplesMonoNotEmpty <em>Num Samples Mono Not Empty</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.EsxFileImpl#getNumSamplesStereoEmpty <em>Num Samples Stereo Empty</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.EsxFileImpl#getNumSamplesStereoNotEmpty <em>Num Samples Stereo Not Empty</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.EsxFileImpl#getNumSongsEmpty <em>Num Songs Empty</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.EsxFileImpl#getNumSongsNotEmpty <em>Num Songs Not Empty</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.EsxFileImpl#isSyncPatternsOnMoveEnabled <em>Sync Patterns On Move Enabled</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.EsxFileImpl#isSyncSamplesOnMoveEnabled <em>Sync Samples On Move Enabled</em>}</li>
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
	 * The cached value of the '{@link #getEmptyPattern() <em>Empty Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmptyPattern()
	 * @generated
	 * @ordered
	 */
	protected Pattern emptyPattern;

	/**
	 * The cached value of the '{@link #getEmptySong() <em>Empty Song</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmptySong()
	 * @generated
	 * @ordered
	 */
	protected Song emptySong;

	/**
	 * The default value of the '{@link #getMaxSampleOffset() <em>Max Sample Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSampleOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_SAMPLE_OFFSET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxSampleOffset() <em>Max Sample Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSampleOffset()
	 * @generated
	 * @ordered
	 */
	protected int maxSampleOffset = MAX_SAMPLE_OFFSET_EDEFAULT;

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
	 * The default value of the '{@link #getMemUsedInSeconds() <em>Mem Used In Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemUsedInSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final float MEM_USED_IN_SECONDS_EDEFAULT = 0.0F;

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
	 * The default value of the '{@link #getMemFreeInSeconds() <em>Mem Free In Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemFreeInSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final float MEM_FREE_IN_SECONDS_EDEFAULT = 0.0F;

	/**
	 * The default value of the '{@link #getNumPatternsEmpty() <em>Num Patterns Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPatternsEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_PATTERNS_EMPTY_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getNumPatternsNotEmpty() <em>Num Patterns Not Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPatternsNotEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_PATTERNS_NOT_EMPTY_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getNumSamplesEmpty() <em>Num Samples Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumSamplesEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_SAMPLES_EMPTY_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getNumSamplesNotEmpty() <em>Num Samples Not Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumSamplesNotEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_SAMPLES_NOT_EMPTY_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getNumSamplesMonoEmpty() <em>Num Samples Mono Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumSamplesMonoEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_SAMPLES_MONO_EMPTY_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getNumSamplesMonoNotEmpty() <em>Num Samples Mono Not Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumSamplesMonoNotEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_SAMPLES_MONO_NOT_EMPTY_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getNumSamplesStereoEmpty() <em>Num Samples Stereo Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumSamplesStereoEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_SAMPLES_STEREO_EMPTY_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getNumSamplesStereoNotEmpty() <em>Num Samples Stereo Not Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumSamplesStereoNotEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_SAMPLES_STEREO_NOT_EMPTY_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getNumSongsEmpty() <em>Num Songs Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumSongsEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_SONGS_EMPTY_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getNumSongsNotEmpty() <em>Num Songs Not Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumSongsNotEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_SONGS_NOT_EMPTY_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #isSyncPatternsOnMoveEnabled() <em>Sync Patterns On Move Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSyncPatternsOnMoveEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYNC_PATTERNS_ON_MOVE_ENABLED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSyncPatternsOnMoveEnabled() <em>Sync Patterns On Move Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSyncPatternsOnMoveEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean syncPatternsOnMoveEnabled = SYNC_PATTERNS_ON_MOVE_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #isSyncSamplesOnMoveEnabled() <em>Sync Samples On Move Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSyncSamplesOnMoveEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYNC_SAMPLES_ON_MOVE_ENABLED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSyncSamplesOnMoveEnabled() <em>Sync Samples On Move Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSyncSamplesOnMoveEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean syncSamplesOnMoveEnabled = SYNC_SAMPLES_ON_MOVE_ENABLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected EsxFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void init(byte[] b) {
		this.init(b, new NullProgressMonitor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void init(byte[] b, IProgressMonitor monitor) {
		ExtendedByteBuffer in = new ExtendedByteBuffer(b);

		// Store all our "non-sample data" which will be overwritten when saving
		// the file
		monitor.subTask("Loading original non-audio data");
		this.setOriginalNonAudioData(in.getBytes(
				EsxUtil.ADDR_VALID_ESX_CHECK_1, EsxUtil.SIZE_FILE_MIN));

		// Get Global Parameters
		monitor.subTask("Loading Global Parameters");
		GlobalParameters newGlobalParameters = EsxFactory.eINSTANCE
				.createGlobalParameters();
		newGlobalParameters.init(in.getBytes(EsxUtil.ADDR_GLOBAL_PARAMETERS,
				EsxUtil.CHUNKSIZE_GLOBAL_PARAMETERS));
		this.setGlobalParameters(newGlobalParameters);

		// Get Patterns
		in.position(EsxUtil.ADDR_PATTERN_DATA);
		for (int i = 0; i < EsxUtil.NUM_PATTERNS; i++) {
			monitor.subTask("Loading pattern " + (i + 1) + " of "
					+ EsxUtil.NUM_PATTERNS);
			Pattern pattern = EsxFactory.eINSTANCE.createPattern();
			pattern.init(in.getBytes(in.position(), EsxUtil.CHUNKSIZE_PATTERN),
					i);
			this.getPatterns().add(i, pattern);
			monitor.worked(1);
		}

		// Get Songs
		in.position(EsxUtil.ADDR_SONG_DATA);
		for (int i = 0; i < EsxUtil.NUM_SONGS; i++) {
			monitor.subTask("Loading song " + (i + 1) + " of "
					+ EsxUtil.NUM_SONGS);
			Song song = EsxFactory.eINSTANCE.createSong();
			song.initSong(in.getBytes(in.position(), EsxUtil.CHUNKSIZE_SONG), i);
			this.getSongs().add(i, song);
			monitor.worked(1);
		}

		// Get Song Events
		in.position(EsxUtil.ADDR_SONG_EVENT_DATA);
		for (int i = 0; i < EsxUtil.NUM_SONGS; i++) {
			monitor.subTask("Saving song event data for song " + (i + 1)
					+ " of " + EsxUtil.NUM_SONGS);
			Song song = this.getSongs().get(i);
			if (song.getNumberOfSongEventsOriginal() > 0) {
				byte[] songEventBytes = new byte[song
						.getNumberOfSongEventsOriginal()
						* EsxUtil.CHUNKSIZE_SONG_EVENT];
				in.getBytes(songEventBytes);
				song.initSongEvents(songEventBytes);
			}
			monitor.worked(1);
		}

		// Get Sample Headers: MONO
		in.position(EsxUtil.ADDR_SAMPLE_HEADER_MONO);
		for (int i = 0; i < EsxUtil.NUM_SAMPLES_MONO; i++) {
			monitor.subTask("Loading sample header " + (i + 1) + " of "
					+ EsxUtil.NUM_SAMPLES);
			Sample mono = EsxFactory.eINSTANCE.createSample();
			mono.initHeaderMono(in.getBytes(in.position(),
					EsxUtil.CHUNKSIZE_SAMPLE_HEADER_MONO), i);
			this.getSamples().add(i, mono);
			monitor.worked(1);
		}

		// Get Sample Headers: STEREO
		in.position(EsxUtil.ADDR_SAMPLE_HEADER_STEREO);
		for (int i = EsxUtil.NUM_SAMPLES_MONO; i < EsxUtil.NUM_SAMPLES; i++) {
			monitor.subTask("Loading sample header " + (i + 1) + " of "
					+ EsxUtil.NUM_SAMPLES);
			Sample stereo = EsxFactory.eINSTANCE.createSample();
			stereo.initHeaderStereo(in.getBytes(in.position(),
					EsxUtil.CHUNKSIZE_SAMPLE_HEADER_STEREO), i);
			this.getSamples().add(i, stereo);
			monitor.worked(1);
		}

		// Get Slice Info
		in.position(EsxUtil.ADDR_SLICE_DATA);
		for (int i = 0; i < EsxUtil.NUM_SAMPLES_MONO
				&& i < EsxUtil.NUM_SLICE_DATA; i++) {
			monitor.subTask("Loading slice data " + (i + 1) + " of "
					+ EsxUtil.NUM_SLICE_DATA);
			Sample mono = this.getSamples().get(i);
			mono.initSliceArray(in.getBytes(in.position(),
					EsxUtil.CHUNKSIZE_SLICE_DATA));
			monitor.worked(i);
		}

		// Get sample info
		for (int i = 0; i < EsxUtil.NUM_SAMPLES; i++) {
			monitor.subTask("Loading sample data " + (i + 1) + " of "
					+ EsxUtil.NUM_SAMPLES);
			if (i < EsxUtil.NUM_SAMPLES_MONO) {
				Sample mono = this.getSamples().get(i);
				int offset1Size = mono.getOffsetChannel1End()
						- mono.getOffsetChannel1Start();
				if (offset1Size > 0
						&& mono.getOffsetChannel1Start() != 0xFFFFFFFF
						&& mono.getOffsetChannel1End() != 0xFFFFFFFF) {
					// Read in sample data
					in.position(EsxUtil.ADDR_SAMPLE_DATA
							+ mono.getOffsetChannel1Start());
					mono.initOffsetChannel(
							in.getBytes(in.position(), offset1Size),
							AudioChannelType.MONO);
				}
			} else {
				Sample stereo = this.getSamples().get(i);

				int offset1Size = stereo.getOffsetChannel1End()
						- stereo.getOffsetChannel1Start();
				int offset2Size = stereo.getOffsetChannel2End()
						- stereo.getOffsetChannel2Start();
				if (offset1Size == offset2Size && offset1Size > 0
						&& offset2Size > 0
						&& stereo.getOffsetChannel1Start() != 0xFFFFFFFF
						&& stereo.getOffsetChannel1End() != 0xFFFFFFFF
						&& stereo.getOffsetChannel2Start() != 0xFFFFFFFF
						&& stereo.getOffsetChannel2End() != 0xFFFFFFFF) {
					// Read in sample data
					in.position(EsxUtil.ADDR_SAMPLE_DATA
							+ stereo.getOffsetChannel1Start());
					stereo.initOffsetChannel(
							in.getBytes(in.position(), offset1Size),
							AudioChannelType.STEREO_1);
					in.position(EsxUtil.ADDR_SAMPLE_DATA
							+ stereo.getOffsetChannel2Start());
					stereo.initOffsetChannel(
							in.getBytes(in.position(), offset2Size),
							AudioChannelType.STEREO_2);
				}
			}
			monitor.worked(1);
		}

		// Initialize the blank pattern
		Pattern emptyPattern = EsxFactory.eINSTANCE.createPattern();
		emptyPattern.init(this.getPatterns().get(EsxUtil.NUM_PATTERNS - 1)
				.toByteArray());
		this.setEmptyPattern(emptyPattern);

		// Initialize the blank pattern
		Song emptySong = EsxFactory.eINSTANCE.createSong();
		emptySong.initSong(this.getSongs().get(EsxUtil.NUM_SONGS - 1)
				.toSongByteArray());
		emptySong.initSongEvents(this.getSongs().get(EsxUtil.NUM_SONGS - 1)
				.toSongEventsByteArray());
		this.setEmptySong(emptySong);

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
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.ESX_FILE__ORIGINAL_NON_AUDIO_DATA,
					oldOriginalNonAudioData, originalNonAudioData));
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
	public NotificationChain basicSetGlobalParameters(
			GlobalParameters newGlobalParameters, NotificationChain msgs) {
		GlobalParameters oldGlobalParameters = globalParameters;
		globalParameters = newGlobalParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, EsxPackage.ESX_FILE__GLOBAL_PARAMETERS,
					oldGlobalParameters, newGlobalParameters);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
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
				msgs = ((InternalEObject) globalParameters).eInverseRemove(
						this, EOPPOSITE_FEATURE_BASE
								- EsxPackage.ESX_FILE__GLOBAL_PARAMETERS, null,
						msgs);
			if (newGlobalParameters != null)
				msgs = ((InternalEObject) newGlobalParameters).eInverseAdd(
						this, EOPPOSITE_FEATURE_BASE
								- EsxPackage.ESX_FILE__GLOBAL_PARAMETERS, null,
						msgs);
			msgs = basicSetGlobalParameters(newGlobalParameters, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.ESX_FILE__GLOBAL_PARAMETERS,
					newGlobalParameters, newGlobalParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern> getPatterns() {
		if (patterns == null) {
			patterns = new EObjectContainmentEList<Pattern>(Pattern.class,
					this, EsxPackage.ESX_FILE__PATTERNS);
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
			songs = new EObjectContainmentEList<Song>(Song.class, this,
					EsxPackage.ESX_FILE__SONGS);
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
			samples = new EObjectContainmentEList<Sample>(Sample.class, this,
					EsxPackage.ESX_FILE__SAMPLES);
		}
		return samples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern getEmptyPattern() {
		return emptyPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmptyPattern(Pattern newEmptyPattern,
			NotificationChain msgs) {
		Pattern oldEmptyPattern = emptyPattern;
		emptyPattern = newEmptyPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, EsxPackage.ESX_FILE__EMPTY_PATTERN,
					oldEmptyPattern, newEmptyPattern);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmptyPattern(Pattern newEmptyPattern) {
		if (newEmptyPattern != emptyPattern) {
			NotificationChain msgs = null;
			if (emptyPattern != null)
				msgs = ((InternalEObject) emptyPattern).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- EsxPackage.ESX_FILE__EMPTY_PATTERN, null,
						msgs);
			if (newEmptyPattern != null)
				msgs = ((InternalEObject) newEmptyPattern).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- EsxPackage.ESX_FILE__EMPTY_PATTERN, null,
						msgs);
			msgs = basicSetEmptyPattern(newEmptyPattern, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.ESX_FILE__EMPTY_PATTERN, newEmptyPattern,
					newEmptyPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Song getEmptySong() {
		return emptySong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmptySong(Song newEmptySong,
			NotificationChain msgs) {
		Song oldEmptySong = emptySong;
		emptySong = newEmptySong;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, EsxPackage.ESX_FILE__EMPTY_SONG,
					oldEmptySong, newEmptySong);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmptySong(Song newEmptySong) {
		if (newEmptySong != emptySong) {
			NotificationChain msgs = null;
			if (emptySong != null)
				msgs = ((InternalEObject) emptySong).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- EsxPackage.ESX_FILE__EMPTY_SONG, null, msgs);
			if (newEmptySong != null)
				msgs = ((InternalEObject) newEmptySong).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- EsxPackage.ESX_FILE__EMPTY_SONG, null, msgs);
			msgs = basicSetEmptySong(newEmptySong, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.ESX_FILE__EMPTY_SONG, newEmptySong, newEmptySong));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxSampleOffset() {
		return maxSampleOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxSampleOffset(int newMaxSampleOffset) {
		int oldMaxSampleOffset = maxSampleOffset;
		maxSampleOffset = newMaxSampleOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.ESX_FILE__MAX_SAMPLE_OFFSET, oldMaxSampleOffset,
					maxSampleOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getMemUsedInBytes() {
		int returnValue = 0;
		for (int i = 0; i < this.getSamples().size(); i++) {
			returnValue += this.getSamples().get(i).getMemUsedInBytes();
		}
		return returnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public float getMemUsedInSeconds() {
		int memUsedInBytes = this.getMemUsedInBytes();
		return ((float) memUsedInBytes) / (2 * 44100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getMemFreeInBytes() {
		return (EsxUtil.MAX_SAMPLE_MEM_IN_BYTES) - this.getMemUsedInBytes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public float getMemFreeInSeconds() {
		int memFreeInBytes = this.getMemFreeInBytes();
		return ((float) memFreeInBytes) / (2 * 44100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getNumPatternsEmpty() {
		int returnValue = 0;
		for (int i = 0; i < this.getPatterns().size(); i++) {
			if (this.getPatterns().get(i).isEmpty()) {
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
	public int getNumPatternsNotEmpty() {
		return EsxUtil.NUM_PATTERNS - this.getNumPatternsEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getNumSamplesEmpty() {
		int returnValue = 0;
		for (int i = 0; i < this.getSamples().size(); i++) {
			if (this.getSamples().get(i).isEmpty()) {
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
	public int getNumSamplesNotEmpty() {
		return EsxUtil.NUM_SAMPLES - this.getNumSamplesEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getNumSamplesMonoEmpty() {
		int returnValue = 0;
		for (int i = 0; i < this.getSamples().size()
				&& i < EsxUtil.NUM_SAMPLES_MONO; i++) {
			if (this.getSamples().get(i).isEmpty()) {
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
	public int getNumSamplesMonoNotEmpty() {
		return EsxUtil.NUM_SAMPLES_MONO - this.getNumSamplesMonoEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getNumSamplesStereoEmpty() {
		int returnValue = 0;
		for (int i = EsxUtil.NUM_SAMPLES_MONO; i < this.getSamples().size()
				&& i < EsxUtil.NUM_SAMPLES; i++) {
			if (this.getSamples().get(i).isEmpty()) {
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
	public int getNumSamplesStereoNotEmpty() {
		return EsxUtil.NUM_SAMPLES_STEREO - this.getNumSamplesStereoEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getNumSongsEmpty() {
		int returnValue = 0;
		for (int i = 0; i < this.getSongs().size(); i++) {
			if (this.getSongs().get(i).isEmpty()) {
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
	public int getNumSongsNotEmpty() {
		return EsxUtil.NUM_SONGS - this.getNumSongsEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSyncPatternsOnMoveEnabled() {
		return syncPatternsOnMoveEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyncPatternsOnMoveEnabled(
			boolean newSyncPatternsOnMoveEnabled) {
		boolean oldSyncPatternsOnMoveEnabled = syncPatternsOnMoveEnabled;
		syncPatternsOnMoveEnabled = newSyncPatternsOnMoveEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.ESX_FILE__SYNC_PATTERNS_ON_MOVE_ENABLED,
					oldSyncPatternsOnMoveEnabled, syncPatternsOnMoveEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSyncSamplesOnMoveEnabled() {
		return syncSamplesOnMoveEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyncSamplesOnMoveEnabled(boolean newSyncSamplesOnMoveEnabled) {
		boolean oldSyncSamplesOnMoveEnabled = syncSamplesOnMoveEnabled;
		syncSamplesOnMoveEnabled = newSyncSamplesOnMoveEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EsxPackage.ESX_FILE__SYNC_SAMPLES_ON_MOVE_ENABLED,
					oldSyncSamplesOnMoveEnabled, syncSamplesOnMoveEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * Will return null if patternPointer is invalid or out of bounds
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Pattern getPatternFromPointer(int patternPointer) {
		Pattern pattern = null;
		if (!EsxUtil.isValidPatternNumber(patternPointer)) {
			return pattern;
		}
		if (this.isSyncPatternsOnMoveEnabled()) {
			for (int i = 0; i < EsxUtil.NUM_PATTERNS; i++) {
				pattern = this.getPatterns().get(i);
				if (pattern.getPatternNumberOriginal().getValue() == patternPointer) {
					return pattern;
				}
			}
		} else {
			try {
				pattern = this.getPatterns().get(patternPointer);
			} catch (IndexOutOfBoundsException e) {
				e.printStackTrace();
				pattern = null;
			}
		}
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Will return null if samplePointer is invalid or out of bounds
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Sample getSampleFromPointer(int samplePointer) {
		Sample sample = null;
		if (!EsxUtil.isValidSampleNumber(samplePointer)) {
			return sample;
		}
		if (this.isSyncSamplesOnMoveEnabled()) {
			for (int i = 0; i < EsxUtil.NUM_SAMPLES; i++) {
				sample = this.getSamples().get(i);
				if (sample.getSampleNumberOriginal().getValue() == samplePointer) {
					return sample;
				}
			}
		} else {
			try {
				sample = this.getSamples().get(samplePointer);
			} catch (IndexOutOfBoundsException e) {
				e.printStackTrace();
				sample = null;
			}
		}
		return sample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setAllOffsets() {
		// Initialize max sample offset
		this.setMaxSampleOffset(0);

		for (int i = 0; i < EsxUtil.NUM_SAMPLES; i++) {
			Sample currentSample = this.getSamples().get(i);

			if (currentSample.getNumberOfSampleFrames() > 0) {
				// offsetChannel1Start
				currentSample.setOffsetChannel1Start(this.getMaxSampleOffset());
				// update offset
				this.setMaxSampleOffset(this.getMaxSampleOffset()
						+ (currentSample.getNumberOfSampleFrames() * 2) + 16);
				// offsetChannel1End
				currentSample.setOffsetChannel1End(this.getMaxSampleOffset());
				// update offset: blockAlign/loopStartSample
				this.setMaxSampleOffset(this.getMaxSampleOffset()
						+ (currentSample.getNumberOfSampleFrames() % 2 == 0 ? 4
								: 2));

				// NEED TO HANDLE CHANNEL 2
				if (currentSample.isStereoCurrent()) {
					// offsetChannel2Start
					currentSample.setOffsetChannel2Start(this
							.getMaxSampleOffset());
					// update offset
					this.setMaxSampleOffset(this.getMaxSampleOffset()
							+ (currentSample.getNumberOfSampleFrames() * 2)
							+ 16);
					// offsetChannel1End
					currentSample.setOffsetChannel2End(this
							.getMaxSampleOffset());
					// update offset: blockAlign
					this.setMaxSampleOffset(this.getMaxSampleOffset()
							+ (currentSample.getNumberOfSampleFrames() % 2 == 0 ? 4
									: 2));
				}
			} else {
				currentSample.setOffsetChannel1Start(0xFFFFFFFF);
				currentSample.setOffsetChannel2Start(0xFFFFFFFF);
				currentSample.setOffsetChannel1End(0xFFFFFFFF);
				currentSample.setOffsetChannel2End(0xFFFFFFFF);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public byte[] toByteArray() {
		return this.toByteArray(new NullProgressMonitor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public byte[] toByteArray(IProgressMonitor monitor) {
		ExtendedByteBuffer buf = new ExtendedByteBuffer(EsxUtil.SIZE_FILE_MAX);

		// Write original data (we will overwrite invalid data with our known
		// data structures)
		monitor.subTask("Saving original non-audio data");
		buf.position(0);
		buf.putBytes(this.getOriginalNonAudioData());
		monitor.worked(1);

		// Write global parameters
		buf.position(EsxUtil.ADDR_GLOBAL_PARAMETERS);
		buf.putBytes(this.getGlobalParameters().toByteArray());

		// Write Pattern Data
		buf.position(EsxUtil.ADDR_PATTERN_DATA);
		for (int i = 0; i < EsxUtil.NUM_PATTERNS; i++) {
			monitor.subTask("Saving pattern " + (i + 1) + " of "
					+ EsxUtil.NUM_PATTERNS);
			buf.putBytes(this.getPatterns().get(i).toByteArray());
			monitor.worked(1);
		}

		// Write Song Data
		buf.position(EsxUtil.ADDR_SONG_DATA);
		for (int i = 0; i < EsxUtil.NUM_SONGS; i++) {
			monitor.subTask("Saving song " + (i + 1) + " of "
					+ EsxUtil.NUM_SONGS);
			buf.putBytes(this.getSongs().get(i).toSongByteArray());
			monitor.worked(1);
		}

		// Write Song Event Data
		buf.position(EsxUtil.ADDR_SONG_EVENT_DATA);
		for (int i = 0; i < EsxUtil.NUM_SONGS; i++) {
			monitor.subTask("Saving song event data for song " + (i + 1)
					+ " of " + EsxUtil.NUM_SONGS);
			buf.putBytes(this.getSongs().get(i).toSongEventsByteArray());
			monitor.worked(1);
		}

		// We need to set the offsets for mono and stereo samples.
		monitor.subTask("Calculating sample offsets...");
		this.setAllOffsets();

		// Write Mono Sample Data
		for (int i = 0; i < EsxUtil.NUM_SAMPLES_MONO; i++) {
			monitor.subTask("Saving mono sample " + (i + 1) + " of "
					+ EsxUtil.NUM_SAMPLES_MONO);
			Sample mono = this.getSamples().get(i);

			// Write Sample Header Info
			buf.position(EsxUtil.ADDR_SAMPLE_HEADER_MONO
					+ (i * EsxUtil.CHUNKSIZE_SAMPLE_HEADER_MONO));
			buf.putBytes(mono.toHeaderMonoByteArray());

			// Write Slice Info
			buf.position(EsxUtil.ADDR_SLICE_DATA
					+ (i * EsxUtil.CHUNKSIZE_SLICE_DATA));
			buf.putBytes(mono.toSliceByteArray());

			// Write Sample Data
			if (!mono.isEmpty() && mono.getNumberOfSampleFrames() > 0) {
				buf.position(EsxUtil.ADDR_SAMPLE_DATA
						+ mono.getOffsetChannel1Start());
				buf.putBytes(mono
						.toOffsetChannelByteArray(AudioChannelType.MONO));
			}

			monitor.worked(1);
		}

		// Write Stereo Sample Data
		for (int i = 0; i < EsxUtil.NUM_SAMPLES_STEREO; i++) {
			monitor.subTask("Saving stereo sample " + (i + 1) + " of "
					+ EsxUtil.NUM_SAMPLES_STEREO);
			Sample stereo = this.getSamples().get(i + EsxUtil.NUM_SAMPLES_MONO);

			// Write Sample Header Info
			buf.position(EsxUtil.ADDR_SAMPLE_HEADER_STEREO
					+ (i * EsxUtil.CHUNKSIZE_SAMPLE_HEADER_STEREO));
			buf.putBytes(stereo.toHeaderStereoByteArray());

			// Write Sample Data
			if (!stereo.isEmpty() && stereo.getNumberOfSampleFrames() > 0) {
				buf.position(EsxUtil.ADDR_SAMPLE_DATA
						+ stereo.getOffsetChannel1Start());
				buf.putBytes(stereo
						.toOffsetChannelByteArray(AudioChannelType.STEREO_1));
				buf.position(EsxUtil.ADDR_SAMPLE_DATA
						+ stereo.getOffsetChannel2Start());
				buf.putBytes(stereo
						.toOffsetChannelByteArray(AudioChannelType.STEREO_2));
			}

			monitor.worked(1);
		}

		// Write: Number of Mono Samples, Number of Stereo Samples, and last offset
		buf.position(EsxUtil.ADDR_NUM_MONO_SAMPLES);
		buf.putInt(this.getNumSamplesMonoNotEmpty());
		buf.position(EsxUtil.ADDR_NUM_STEREO_SAMPLES);
		buf.putInt(this.getNumSamplesStereoNotEmpty());
		buf.position(EsxUtil.ADDR_CURRENT_OFFSET);
		buf.putInt(this.getMaxSampleOffset());

		// Write EOF data
		buf.position(EsxUtil.ADDR_SAMPLE_DATA + this.getMaxSampleOffset());
		buf.putInt(0x80007FFF);
		buf.putInt(this.getMaxSampleOffset());
		buf.putInt(0x017FFFFE);
		buf.putInt(0x00FFFFFF);

		// Crop to correct file size, and return the byte buffer
		int fileSize = buf.position();
		buf.position(0);
		byte[] returnBuffer = new byte[fileSize];
		buf.getBytes(returnBuffer, 0, fileSize);
		return returnBuffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validMemFreeInBytes(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (this.getMemFreeInBytes() < 0) {
			if (diagnostics != null) {
				String msg = "Too much sample space is being used. You need"
						+ " to free up "
						+ new DecimalFormat("#.##").format(0 - this
								.getMemFreeInSeconds())
						+ " seconds of sample space before saving.";
				BasicDiagnostic diagnostic = new BasicDiagnostic(
						Diagnostic.ERROR, null,
						EsxValidator.ESX_FILE__VALID_MEM_FREE_IN_BYTES, msg,
						new Object[] { this });
				diagnostics.add(diagnostic);
			}
			return false;
		}
		return true;
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
		case EsxPackage.ESX_FILE__GLOBAL_PARAMETERS:
			return basicSetGlobalParameters(null, msgs);
		case EsxPackage.ESX_FILE__PATTERNS:
			return ((InternalEList<?>) getPatterns()).basicRemove(otherEnd,
					msgs);
		case EsxPackage.ESX_FILE__SONGS:
			return ((InternalEList<?>) getSongs()).basicRemove(otherEnd, msgs);
		case EsxPackage.ESX_FILE__SAMPLES:
			return ((InternalEList<?>) getSamples())
					.basicRemove(otherEnd, msgs);
		case EsxPackage.ESX_FILE__EMPTY_PATTERN:
			return basicSetEmptyPattern(null, msgs);
		case EsxPackage.ESX_FILE__EMPTY_SONG:
			return basicSetEmptySong(null, msgs);
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
		case EsxPackage.ESX_FILE__EMPTY_PATTERN:
			return getEmptyPattern();
		case EsxPackage.ESX_FILE__EMPTY_SONG:
			return getEmptySong();
		case EsxPackage.ESX_FILE__MAX_SAMPLE_OFFSET:
			return getMaxSampleOffset();
		case EsxPackage.ESX_FILE__MEM_USED_IN_BYTES:
			return getMemUsedInBytes();
		case EsxPackage.ESX_FILE__MEM_USED_IN_SECONDS:
			return getMemUsedInSeconds();
		case EsxPackage.ESX_FILE__MEM_FREE_IN_BYTES:
			return getMemFreeInBytes();
		case EsxPackage.ESX_FILE__MEM_FREE_IN_SECONDS:
			return getMemFreeInSeconds();
		case EsxPackage.ESX_FILE__NUM_PATTERNS_EMPTY:
			return getNumPatternsEmpty();
		case EsxPackage.ESX_FILE__NUM_PATTERNS_NOT_EMPTY:
			return getNumPatternsNotEmpty();
		case EsxPackage.ESX_FILE__NUM_SAMPLES_EMPTY:
			return getNumSamplesEmpty();
		case EsxPackage.ESX_FILE__NUM_SAMPLES_NOT_EMPTY:
			return getNumSamplesNotEmpty();
		case EsxPackage.ESX_FILE__NUM_SAMPLES_MONO_EMPTY:
			return getNumSamplesMonoEmpty();
		case EsxPackage.ESX_FILE__NUM_SAMPLES_MONO_NOT_EMPTY:
			return getNumSamplesMonoNotEmpty();
		case EsxPackage.ESX_FILE__NUM_SAMPLES_STEREO_EMPTY:
			return getNumSamplesStereoEmpty();
		case EsxPackage.ESX_FILE__NUM_SAMPLES_STEREO_NOT_EMPTY:
			return getNumSamplesStereoNotEmpty();
		case EsxPackage.ESX_FILE__NUM_SONGS_EMPTY:
			return getNumSongsEmpty();
		case EsxPackage.ESX_FILE__NUM_SONGS_NOT_EMPTY:
			return getNumSongsNotEmpty();
		case EsxPackage.ESX_FILE__SYNC_PATTERNS_ON_MOVE_ENABLED:
			return isSyncPatternsOnMoveEnabled();
		case EsxPackage.ESX_FILE__SYNC_SAMPLES_ON_MOVE_ENABLED:
			return isSyncSamplesOnMoveEnabled();
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
			setOriginalNonAudioData((byte[]) newValue);
			return;
		case EsxPackage.ESX_FILE__GLOBAL_PARAMETERS:
			setGlobalParameters((GlobalParameters) newValue);
			return;
		case EsxPackage.ESX_FILE__PATTERNS:
			getPatterns().clear();
			getPatterns().addAll((Collection<? extends Pattern>) newValue);
			return;
		case EsxPackage.ESX_FILE__SONGS:
			getSongs().clear();
			getSongs().addAll((Collection<? extends Song>) newValue);
			return;
		case EsxPackage.ESX_FILE__SAMPLES:
			getSamples().clear();
			getSamples().addAll((Collection<? extends Sample>) newValue);
			return;
		case EsxPackage.ESX_FILE__EMPTY_PATTERN:
			setEmptyPattern((Pattern) newValue);
			return;
		case EsxPackage.ESX_FILE__EMPTY_SONG:
			setEmptySong((Song) newValue);
			return;
		case EsxPackage.ESX_FILE__MAX_SAMPLE_OFFSET:
			setMaxSampleOffset((Integer) newValue);
			return;
		case EsxPackage.ESX_FILE__SYNC_PATTERNS_ON_MOVE_ENABLED:
			setSyncPatternsOnMoveEnabled((Boolean) newValue);
			return;
		case EsxPackage.ESX_FILE__SYNC_SAMPLES_ON_MOVE_ENABLED:
			setSyncSamplesOnMoveEnabled((Boolean) newValue);
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
			setGlobalParameters((GlobalParameters) null);
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
		case EsxPackage.ESX_FILE__EMPTY_PATTERN:
			setEmptyPattern((Pattern) null);
			return;
		case EsxPackage.ESX_FILE__EMPTY_SONG:
			setEmptySong((Song) null);
			return;
		case EsxPackage.ESX_FILE__MAX_SAMPLE_OFFSET:
			setMaxSampleOffset(MAX_SAMPLE_OFFSET_EDEFAULT);
			return;
		case EsxPackage.ESX_FILE__SYNC_PATTERNS_ON_MOVE_ENABLED:
			setSyncPatternsOnMoveEnabled(SYNC_PATTERNS_ON_MOVE_ENABLED_EDEFAULT);
			return;
		case EsxPackage.ESX_FILE__SYNC_SAMPLES_ON_MOVE_ENABLED:
			setSyncSamplesOnMoveEnabled(SYNC_SAMPLES_ON_MOVE_ENABLED_EDEFAULT);
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
			return ORIGINAL_NON_AUDIO_DATA_EDEFAULT == null ? originalNonAudioData != null
					: !ORIGINAL_NON_AUDIO_DATA_EDEFAULT
							.equals(originalNonAudioData);
		case EsxPackage.ESX_FILE__GLOBAL_PARAMETERS:
			return globalParameters != null;
		case EsxPackage.ESX_FILE__PATTERNS:
			return patterns != null && !patterns.isEmpty();
		case EsxPackage.ESX_FILE__SONGS:
			return songs != null && !songs.isEmpty();
		case EsxPackage.ESX_FILE__SAMPLES:
			return samples != null && !samples.isEmpty();
		case EsxPackage.ESX_FILE__EMPTY_PATTERN:
			return emptyPattern != null;
		case EsxPackage.ESX_FILE__EMPTY_SONG:
			return emptySong != null;
		case EsxPackage.ESX_FILE__MAX_SAMPLE_OFFSET:
			return maxSampleOffset != MAX_SAMPLE_OFFSET_EDEFAULT;
		case EsxPackage.ESX_FILE__MEM_USED_IN_BYTES:
			return getMemUsedInBytes() != MEM_USED_IN_BYTES_EDEFAULT;
		case EsxPackage.ESX_FILE__MEM_USED_IN_SECONDS:
			return getMemUsedInSeconds() != MEM_USED_IN_SECONDS_EDEFAULT;
		case EsxPackage.ESX_FILE__MEM_FREE_IN_BYTES:
			return getMemFreeInBytes() != MEM_FREE_IN_BYTES_EDEFAULT;
		case EsxPackage.ESX_FILE__MEM_FREE_IN_SECONDS:
			return getMemFreeInSeconds() != MEM_FREE_IN_SECONDS_EDEFAULT;
		case EsxPackage.ESX_FILE__NUM_PATTERNS_EMPTY:
			return getNumPatternsEmpty() != NUM_PATTERNS_EMPTY_EDEFAULT;
		case EsxPackage.ESX_FILE__NUM_PATTERNS_NOT_EMPTY:
			return getNumPatternsNotEmpty() != NUM_PATTERNS_NOT_EMPTY_EDEFAULT;
		case EsxPackage.ESX_FILE__NUM_SAMPLES_EMPTY:
			return getNumSamplesEmpty() != NUM_SAMPLES_EMPTY_EDEFAULT;
		case EsxPackage.ESX_FILE__NUM_SAMPLES_NOT_EMPTY:
			return getNumSamplesNotEmpty() != NUM_SAMPLES_NOT_EMPTY_EDEFAULT;
		case EsxPackage.ESX_FILE__NUM_SAMPLES_MONO_EMPTY:
			return getNumSamplesMonoEmpty() != NUM_SAMPLES_MONO_EMPTY_EDEFAULT;
		case EsxPackage.ESX_FILE__NUM_SAMPLES_MONO_NOT_EMPTY:
			return getNumSamplesMonoNotEmpty() != NUM_SAMPLES_MONO_NOT_EMPTY_EDEFAULT;
		case EsxPackage.ESX_FILE__NUM_SAMPLES_STEREO_EMPTY:
			return getNumSamplesStereoEmpty() != NUM_SAMPLES_STEREO_EMPTY_EDEFAULT;
		case EsxPackage.ESX_FILE__NUM_SAMPLES_STEREO_NOT_EMPTY:
			return getNumSamplesStereoNotEmpty() != NUM_SAMPLES_STEREO_NOT_EMPTY_EDEFAULT;
		case EsxPackage.ESX_FILE__NUM_SONGS_EMPTY:
			return getNumSongsEmpty() != NUM_SONGS_EMPTY_EDEFAULT;
		case EsxPackage.ESX_FILE__NUM_SONGS_NOT_EMPTY:
			return getNumSongsNotEmpty() != NUM_SONGS_NOT_EMPTY_EDEFAULT;
		case EsxPackage.ESX_FILE__SYNC_PATTERNS_ON_MOVE_ENABLED:
			return syncPatternsOnMoveEnabled != SYNC_PATTERNS_ON_MOVE_ENABLED_EDEFAULT;
		case EsxPackage.ESX_FILE__SYNC_SAMPLES_ON_MOVE_ENABLED:
			return syncSamplesOnMoveEnabled != SYNC_SAMPLES_ON_MOVE_ENABLED_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (originalNonAudioData: ");
		result.append(originalNonAudioData);
		result.append(", maxSampleOffset: ");
		result.append(maxSampleOffset);
		result.append(", syncPatternsOnMoveEnabled: ");
		result.append(syncPatternsOnMoveEnabled);
		result.append(", syncSamplesOnMoveEnabled: ");
		result.append(syncSamplesOnMoveEnabled);
		result.append(')');
		return result.toString();
	}

} //EsxFileImpl

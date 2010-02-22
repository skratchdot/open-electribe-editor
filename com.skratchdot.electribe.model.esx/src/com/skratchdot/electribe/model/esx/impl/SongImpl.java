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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.skratchdot.electribe.model.esx.EsxFactory;
import com.skratchdot.electribe.model.esx.EsxFile;
import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.MuteHold;
import com.skratchdot.electribe.model.esx.NextSongNumber;
import com.skratchdot.electribe.model.esx.PatternNumber;
import com.skratchdot.electribe.model.esx.Song;
import com.skratchdot.electribe.model.esx.SongEvent;
import com.skratchdot.electribe.model.esx.SongEventControl;
import com.skratchdot.electribe.model.esx.SongEventDrumNote;
import com.skratchdot.electribe.model.esx.SongEventKeyboardNote;
import com.skratchdot.electribe.model.esx.SongEventMuteStatus;
import com.skratchdot.electribe.model.esx.SongEventTempo;
import com.skratchdot.electribe.model.esx.SongLength;
import com.skratchdot.electribe.model.esx.SongNumber;
import com.skratchdot.electribe.model.esx.SongPattern;
import com.skratchdot.electribe.model.esx.Tempo;
import com.skratchdot.electribe.model.esx.TempoLock;
import com.skratchdot.electribe.model.esx.util.EsxUtil;
import com.skratchdot.electribe.model.esx.util.ExtendedByteBuffer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Song</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongImpl#getTempo <em>Tempo</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongImpl#getTempoLock <em>Tempo Lock</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongImpl#getSongLength <em>Song Length</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongImpl#getMuteHold <em>Mute Hold</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongImpl#getNextSongNumber <em>Next Song Number</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongImpl#getNumberOfSongEventsCurrent <em>Number Of Song Events Current</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongImpl#getNumberOfSongEventsOriginal <em>Number Of Song Events Original</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongImpl#getSongPatterns <em>Song Patterns</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongImpl#getSongEvents <em>Song Events</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongImpl#isEmpty <em>Empty</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongImpl#getSongNumberOriginal <em>Song Number Original</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongImpl#getSongNumberCurrent <em>Song Number Current</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SongImpl extends EObjectImpl implements Song {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTempo() <em>Tempo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempo()
	 * @generated
	 * @ordered
	 */
	protected Tempo tempo;

	/**
	 * The default value of the '{@link #getTempoLock() <em>Tempo Lock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempoLock()
	 * @generated
	 * @ordered
	 */
	protected static final TempoLock TEMPO_LOCK_EDEFAULT = TempoLock.TEMPO_LOCK_OFF;

	/**
	 * The cached value of the '{@link #getTempoLock() <em>Tempo Lock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempoLock()
	 * @generated
	 * @ordered
	 */
	protected TempoLock tempoLock = TEMPO_LOCK_EDEFAULT;

	/**
	 * The default value of the '{@link #getSongLength() <em>Song Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSongLength()
	 * @generated
	 * @ordered
	 */
	protected static final SongLength SONG_LENGTH_EDEFAULT = SongLength.SONG_LENGTH_001;

	/**
	 * The cached value of the '{@link #getSongLength() <em>Song Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSongLength()
	 * @generated
	 * @ordered
	 */
	protected SongLength songLength = SONG_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMuteHold() <em>Mute Hold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMuteHold()
	 * @generated
	 * @ordered
	 */
	protected static final MuteHold MUTE_HOLD_EDEFAULT = MuteHold.MUTE_HOLD_OFF;

	/**
	 * The cached value of the '{@link #getMuteHold() <em>Mute Hold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMuteHold()
	 * @generated
	 * @ordered
	 */
	protected MuteHold muteHold = MUTE_HOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getNextSongNumber() <em>Next Song Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextSongNumber()
	 * @generated
	 * @ordered
	 */
	protected static final NextSongNumber NEXT_SONG_NUMBER_EDEFAULT = NextSongNumber.NEXT_SONG_NUMBER_00;

	/**
	 * The cached value of the '{@link #getNextSongNumber() <em>Next Song Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextSongNumber()
	 * @generated
	 * @ordered
	 */
	protected NextSongNumber nextSongNumber = NEXT_SONG_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfSongEventsCurrent() <em>Number Of Song Events Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSongEventsCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final short NUMBER_OF_SONG_EVENTS_CURRENT_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getNumberOfSongEventsOriginal() <em>Number Of Song Events Original</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSongEventsOriginal()
	 * @generated
	 * @ordered
	 */
	protected static final short NUMBER_OF_SONG_EVENTS_ORIGINAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfSongEventsOriginal() <em>Number Of Song Events Original</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSongEventsOriginal()
	 * @generated
	 * @ordered
	 */
	protected short numberOfSongEventsOriginal = NUMBER_OF_SONG_EVENTS_ORIGINAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSongPatterns() <em>Song Patterns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSongPatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<SongPattern> songPatterns;

	/**
	 * The cached value of the '{@link #getSongEvents() <em>Song Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSongEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<SongEvent> songEvents;

	/**
	 * The default value of the '{@link #isEmpty() <em>Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EMPTY_EDEFAULT = true;

	/**
	 * The default value of the '{@link #getSongNumberOriginal() <em>Song Number Original</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSongNumberOriginal()
	 * @generated
	 * @ordered
	 */
	protected static final SongNumber SONG_NUMBER_ORIGINAL_EDEFAULT = SongNumber.SONG_01;

	/**
	 * The cached value of the '{@link #getSongNumberOriginal() <em>Song Number Original</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSongNumberOriginal()
	 * @generated
	 * @ordered
	 */
	protected SongNumber songNumberOriginal = SONG_NUMBER_ORIGINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSongNumberCurrent() <em>Song Number Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSongNumberCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final SongNumber SONG_NUMBER_CURRENT_EDEFAULT = SongNumber.SONG_01;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SongImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void initSong(byte[] b) {
		this.initSong(b, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void initSong(byte[] b, int songNumber) {
		ExtendedByteBuffer in = new ExtendedByteBuffer(b);

		// Set the original .esx file song number
		this.setSongNumberOriginal(SongNumber.get(songNumber));

		// bytes 0~7
		byte[] newSongName = new byte[8];
		in.getBytes(newSongName, 0, 8);
		this.setName(new String(newSongName));
		// bytes 8~9
		Tempo newTempo = EsxFactory.eINSTANCE.createTempo();
		newTempo.setCurrentValueFromShort(in.getShort());
		this.setTempo(newTempo);
		// byte 10
		this.setTempoLock(TempoLock.get(in.getByte()));
		// byte 11
		this.setSongLength(SongLength.get(in.getByte()));
		// byte 12
		this.setMuteHold(MuteHold.get(in.getByte()));
		// byte 13
		this.setNextSongNumber(NextSongNumber.get(in.getByte()));
		// bytes 14~15
		this.setNumberOfSongEventsOriginal(in.getShort());

		// Create our list of SongPatterns
		for (int i = 0; i < EsxUtil.NUM_SONG_PATTERNS; i++) {
			SongPattern songPattern = EsxFactory.eINSTANCE.createSongPattern();
			songPattern.setPositionOriginal(i);
			this.getSongPatterns().add(i, songPattern);
		}
		// bytes 16~271 (SongPatterns - PatternNumber)
		for (int i = 0; i < EsxUtil.NUM_SONG_PATTERNS; i++) {
			this.getSongPatterns().get(i).setPatternNumber(PatternNumber.get(in.getUnsignedByte()));
		}
		// bytes 272~527
		for (int i = 0; i < EsxUtil.NUM_SONG_PATTERNS; i++) {
			this.getSongPatterns().get(i).setNoteOffset(in.getByte());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void initSongEvents(byte[] b) {
		ExtendedByteBuffer in = new ExtendedByteBuffer(b);

		byte[] songEventBytes = new byte[EsxUtil.CHUNKSIZE_SONG_EVENT];
		while(in.position()<in.limit()) {
			in.getBytes(songEventBytes);
			SongEvent songEvent = EsxFactory.eINSTANCE.createSongEvent(songEventBytes);
			this.getSongEvents().add(songEvent);			
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsxPackage.Literals.SONG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SONG__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tempo getTempo() {
		return tempo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTempo(Tempo newTempo, NotificationChain msgs) {
		Tempo oldTempo = tempo;
		tempo = newTempo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsxPackage.SONG__TEMPO, oldTempo, newTempo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTempo(Tempo newTempo) {
		if (newTempo != tempo) {
			NotificationChain msgs = null;
			if (tempo != null)
				msgs = ((InternalEObject)tempo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsxPackage.SONG__TEMPO, null, msgs);
			if (newTempo != null)
				msgs = ((InternalEObject)newTempo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsxPackage.SONG__TEMPO, null, msgs);
			msgs = basicSetTempo(newTempo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SONG__TEMPO, newTempo, newTempo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TempoLock getTempoLock() {
		return tempoLock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTempoLock(TempoLock newTempoLock) {
		TempoLock oldTempoLock = tempoLock;
		tempoLock = newTempoLock == null ? TEMPO_LOCK_EDEFAULT : newTempoLock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SONG__TEMPO_LOCK, oldTempoLock, tempoLock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SongLength getSongLength() {
		return songLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSongLength(SongLength newSongLength) {
		SongLength oldSongLength = songLength;
		songLength = newSongLength == null ? SONG_LENGTH_EDEFAULT : newSongLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SONG__SONG_LENGTH, oldSongLength, songLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MuteHold getMuteHold() {
		return muteHold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMuteHold(MuteHold newMuteHold) {
		MuteHold oldMuteHold = muteHold;
		muteHold = newMuteHold == null ? MUTE_HOLD_EDEFAULT : newMuteHold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SONG__MUTE_HOLD, oldMuteHold, muteHold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NextSongNumber getNextSongNumber() {
		return nextSongNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextSongNumber(NextSongNumber newNextSongNumber) {
		NextSongNumber oldNextSongNumber = nextSongNumber;
		nextSongNumber = newNextSongNumber == null ? NEXT_SONG_NUMBER_EDEFAULT : newNextSongNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SONG__NEXT_SONG_NUMBER, oldNextSongNumber, nextSongNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public short getNumberOfSongEventsCurrent() {
		return (short) this.getSongEvents().size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getNumberOfSongEventsOriginal() {
		return numberOfSongEventsOriginal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfSongEventsOriginal(short newNumberOfSongEventsOriginal) {
		short oldNumberOfSongEventsOriginal = numberOfSongEventsOriginal;
		numberOfSongEventsOriginal = newNumberOfSongEventsOriginal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SONG__NUMBER_OF_SONG_EVENTS_ORIGINAL, oldNumberOfSongEventsOriginal, numberOfSongEventsOriginal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SongPattern> getSongPatterns() {
		if (songPatterns == null) {
			songPatterns = new EObjectContainmentEList<SongPattern>(SongPattern.class, this, EsxPackage.SONG__SONG_PATTERNS);
		}
		return songPatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SongEvent> getSongEvents() {
		if (songEvents == null) {
			songEvents = new EObjectContainmentEList<SongEvent>(SongEvent.class, this, EsxPackage.SONG__SONG_EVENTS);
		}
		return songEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isEmpty() {
		if(this.eResource()!=null) {
			Resource resource = (Resource) this.eResource();
			Object rootObject = resource.getContents().get(0);
			if(rootObject instanceof EsxFile) {
				return (this.getName().equals(((EsxFile) rootObject).getEmptySong().getName()));
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SongNumber getSongNumberOriginal() {
		return songNumberOriginal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSongNumberOriginal(SongNumber newSongNumberOriginal) {
		SongNumber oldSongNumberOriginal = songNumberOriginal;
		songNumberOriginal = newSongNumberOriginal == null ? SONG_NUMBER_ORIGINAL_EDEFAULT : newSongNumberOriginal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SONG__SONG_NUMBER_ORIGINAL, oldSongNumberOriginal, songNumberOriginal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SongNumber getSongNumberCurrent() {
		if(this.eResource()!=null) {
			Resource resource = (Resource) this.eResource();
			Object rootObject = resource.getContents().get(0);
			if(rootObject instanceof EsxFile) {
				return SongNumber.get(((EsxFile) rootObject).getSongs().indexOf(this));
			}
		}
		return SongNumber.get(-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public byte[] toSongByteArray() {
		ExtendedByteBuffer buf = new ExtendedByteBuffer(EsxUtil.CHUNKSIZE_SONG);
		// bytes 0~7
		buf.putBytes(EsxUtil.getByteArrayWithLength(this.getName(), 8, (byte) 0x00), 0, 8);
		// bytes 8~9
		buf.putShort(this.getTempo().getShortFromCurrentValue());
		// byte 10
		buf.putUnsignedByte(this.getTempoLock().getValue());
		// byte 11
		buf.putUnsignedByte(this.getSongLength().getValue());
		// byte 12
		buf.putUnsignedByte(this.getMuteHold().getValue());
		// byte 13
		buf.putUnsignedByte(this.getNextSongNumber().getValue());
		// bytes 14~15
		buf.putShort(this.getNumberOfSongEventsCurrent());
		// bytes 16~271 (SongPatterns - PatternNumber)
		for (int i = 0; i < EsxUtil.NUM_SONG_PATTERNS; i++) {
			buf.putUnsignedByte(this.getSongPatterns().get(i).getPatternNumber().getValue());
		}
		// bytes 272~527
		for (int i = 0; i < EsxUtil.NUM_SONG_PATTERNS; i++) {
			buf.putByte(this.getSongPatterns().get(i).getNoteOffset());
		}
		return buf.array();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public byte[] toSongEventsByteArray() {
		short numEvents = this.getNumberOfSongEventsCurrent();
		if(numEvents>0) {
			ExtendedByteBuffer buf = new ExtendedByteBuffer(EsxUtil.CHUNKSIZE_SONG_EVENT*numEvents);
			// write song events
			SongEvent songEvent;
			for(int i=0; i<numEvents; i++) {
				songEvent = this.getSongEvents().get(i);
				if(songEvent instanceof SongEventControl) {
					buf.putBytes(((SongEventControl) songEvent).toByteArray());
				}
				else if(songEvent instanceof SongEventDrumNote) {
					buf.putBytes(((SongEventDrumNote) songEvent).toByteArray());
				}
				else if(songEvent instanceof SongEventKeyboardNote) {
					buf.putBytes(((SongEventKeyboardNote) songEvent).toByteArray());
				}
				else if(songEvent instanceof SongEventMuteStatus) {
					buf.putBytes(((SongEventMuteStatus) songEvent).toByteArray());
				}
				else if(songEvent instanceof SongEventTempo) {
					buf.putBytes(((SongEventTempo) songEvent).toByteArray());
				}
			}
			return buf.array();
		}
		return new byte[0];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsxPackage.SONG__TEMPO:
				return basicSetTempo(null, msgs);
			case EsxPackage.SONG__SONG_PATTERNS:
				return ((InternalEList<?>)getSongPatterns()).basicRemove(otherEnd, msgs);
			case EsxPackage.SONG__SONG_EVENTS:
				return ((InternalEList<?>)getSongEvents()).basicRemove(otherEnd, msgs);
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
			case EsxPackage.SONG__NAME:
				return getName();
			case EsxPackage.SONG__TEMPO:
				return getTempo();
			case EsxPackage.SONG__TEMPO_LOCK:
				return getTempoLock();
			case EsxPackage.SONG__SONG_LENGTH:
				return getSongLength();
			case EsxPackage.SONG__MUTE_HOLD:
				return getMuteHold();
			case EsxPackage.SONG__NEXT_SONG_NUMBER:
				return getNextSongNumber();
			case EsxPackage.SONG__NUMBER_OF_SONG_EVENTS_CURRENT:
				return getNumberOfSongEventsCurrent();
			case EsxPackage.SONG__NUMBER_OF_SONG_EVENTS_ORIGINAL:
				return getNumberOfSongEventsOriginal();
			case EsxPackage.SONG__SONG_PATTERNS:
				return getSongPatterns();
			case EsxPackage.SONG__SONG_EVENTS:
				return getSongEvents();
			case EsxPackage.SONG__EMPTY:
				return isEmpty();
			case EsxPackage.SONG__SONG_NUMBER_ORIGINAL:
				return getSongNumberOriginal();
			case EsxPackage.SONG__SONG_NUMBER_CURRENT:
				return getSongNumberCurrent();
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
			case EsxPackage.SONG__NAME:
				setName((String)newValue);
				return;
			case EsxPackage.SONG__TEMPO:
				setTempo((Tempo)newValue);
				return;
			case EsxPackage.SONG__TEMPO_LOCK:
				setTempoLock((TempoLock)newValue);
				return;
			case EsxPackage.SONG__SONG_LENGTH:
				setSongLength((SongLength)newValue);
				return;
			case EsxPackage.SONG__MUTE_HOLD:
				setMuteHold((MuteHold)newValue);
				return;
			case EsxPackage.SONG__NEXT_SONG_NUMBER:
				setNextSongNumber((NextSongNumber)newValue);
				return;
			case EsxPackage.SONG__NUMBER_OF_SONG_EVENTS_ORIGINAL:
				setNumberOfSongEventsOriginal((Short)newValue);
				return;
			case EsxPackage.SONG__SONG_PATTERNS:
				getSongPatterns().clear();
				getSongPatterns().addAll((Collection<? extends SongPattern>)newValue);
				return;
			case EsxPackage.SONG__SONG_EVENTS:
				getSongEvents().clear();
				getSongEvents().addAll((Collection<? extends SongEvent>)newValue);
				return;
			case EsxPackage.SONG__SONG_NUMBER_ORIGINAL:
				setSongNumberOriginal((SongNumber)newValue);
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
			case EsxPackage.SONG__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EsxPackage.SONG__TEMPO:
				setTempo((Tempo)null);
				return;
			case EsxPackage.SONG__TEMPO_LOCK:
				setTempoLock(TEMPO_LOCK_EDEFAULT);
				return;
			case EsxPackage.SONG__SONG_LENGTH:
				setSongLength(SONG_LENGTH_EDEFAULT);
				return;
			case EsxPackage.SONG__MUTE_HOLD:
				setMuteHold(MUTE_HOLD_EDEFAULT);
				return;
			case EsxPackage.SONG__NEXT_SONG_NUMBER:
				setNextSongNumber(NEXT_SONG_NUMBER_EDEFAULT);
				return;
			case EsxPackage.SONG__NUMBER_OF_SONG_EVENTS_ORIGINAL:
				setNumberOfSongEventsOriginal(NUMBER_OF_SONG_EVENTS_ORIGINAL_EDEFAULT);
				return;
			case EsxPackage.SONG__SONG_PATTERNS:
				getSongPatterns().clear();
				return;
			case EsxPackage.SONG__SONG_EVENTS:
				getSongEvents().clear();
				return;
			case EsxPackage.SONG__SONG_NUMBER_ORIGINAL:
				setSongNumberOriginal(SONG_NUMBER_ORIGINAL_EDEFAULT);
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
			case EsxPackage.SONG__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EsxPackage.SONG__TEMPO:
				return tempo != null;
			case EsxPackage.SONG__TEMPO_LOCK:
				return tempoLock != TEMPO_LOCK_EDEFAULT;
			case EsxPackage.SONG__SONG_LENGTH:
				return songLength != SONG_LENGTH_EDEFAULT;
			case EsxPackage.SONG__MUTE_HOLD:
				return muteHold != MUTE_HOLD_EDEFAULT;
			case EsxPackage.SONG__NEXT_SONG_NUMBER:
				return nextSongNumber != NEXT_SONG_NUMBER_EDEFAULT;
			case EsxPackage.SONG__NUMBER_OF_SONG_EVENTS_CURRENT:
				return getNumberOfSongEventsCurrent() != NUMBER_OF_SONG_EVENTS_CURRENT_EDEFAULT;
			case EsxPackage.SONG__NUMBER_OF_SONG_EVENTS_ORIGINAL:
				return numberOfSongEventsOriginal != NUMBER_OF_SONG_EVENTS_ORIGINAL_EDEFAULT;
			case EsxPackage.SONG__SONG_PATTERNS:
				return songPatterns != null && !songPatterns.isEmpty();
			case EsxPackage.SONG__SONG_EVENTS:
				return songEvents != null && !songEvents.isEmpty();
			case EsxPackage.SONG__EMPTY:
				return isEmpty() != EMPTY_EDEFAULT;
			case EsxPackage.SONG__SONG_NUMBER_ORIGINAL:
				return songNumberOriginal != SONG_NUMBER_ORIGINAL_EDEFAULT;
			case EsxPackage.SONG__SONG_NUMBER_CURRENT:
				return getSongNumberCurrent() != SONG_NUMBER_CURRENT_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", tempoLock: ");
		result.append(tempoLock);
		result.append(", songLength: ");
		result.append(songLength);
		result.append(", muteHold: ");
		result.append(muteHold);
		result.append(", nextSongNumber: ");
		result.append(nextSongNumber);
		result.append(", numberOfSongEventsOriginal: ");
		result.append(numberOfSongEventsOriginal);
		result.append(", songNumberOriginal: ");
		result.append(songNumberOriginal);
		result.append(')');
		return result.toString();
	}

} //SongImpl

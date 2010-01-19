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
import com.skratchdot.electribe.model.esx.PatternNumber;
import com.skratchdot.electribe.model.esx.SampleNumber;
import com.skratchdot.electribe.model.esx.Song;
import com.skratchdot.electribe.model.esx.SongEvent;
import com.skratchdot.electribe.model.esx.SongNumber;
import com.skratchdot.electribe.model.esx.SongEventControl;
import com.skratchdot.electribe.model.esx.SongEventDrumNote;
import com.skratchdot.electribe.model.esx.SongEventKeyboardNote;
import com.skratchdot.electribe.model.esx.SongEventMuteStatus;
import com.skratchdot.electribe.model.esx.SongEventTempo;
import com.skratchdot.electribe.model.esx.Tempo;
import com.skratchdot.electribe.model.esx.util.EsxException;
import com.skratchdot.electribe.model.esx.util.EsxRandomAccess;
import com.skratchdot.electribe.model.esx.util.EsxUtil;

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
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongImpl#getLength <em>Length</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongImpl#getMuteHold <em>Mute Hold</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongImpl#getNextSong <em>Next Song</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongImpl#getNumberOfSongEvents <em>Number Of Song Events</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongImpl#getPatternNumber <em>Pattern Number</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongImpl#getNoteOffset <em>Note Offset</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongImpl#getSongEvents <em>Song Events</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SongImpl#isBeingUsed <em>Being Used</em>}</li>
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
	protected static final byte TEMPO_LOCK_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getTempoLock() <em>Tempo Lock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempoLock()
	 * @generated
	 * @ordered
	 */
	protected byte tempoLock = TEMPO_LOCK_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final byte LENGTH_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected byte length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMuteHold() <em>Mute Hold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMuteHold()
	 * @generated
	 * @ordered
	 */
	protected static final byte MUTE_HOLD_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getMuteHold() <em>Mute Hold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMuteHold()
	 * @generated
	 * @ordered
	 */
	protected byte muteHold = MUTE_HOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getNextSong() <em>Next Song</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextSong()
	 * @generated
	 * @ordered
	 */
	protected static final byte NEXT_SONG_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getNextSong() <em>Next Song</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextSong()
	 * @generated
	 * @ordered
	 */
	protected byte nextSong = NEXT_SONG_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfSongEvents() <em>Number Of Song Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSongEvents()
	 * @generated
	 * @ordered
	 */
	protected static final short NUMBER_OF_SONG_EVENTS_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getPatternNumber() <em>Pattern Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternNumber()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] PATTERN_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPatternNumber() <em>Pattern Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternNumber()
	 * @generated
	 * @ordered
	 */
	protected byte[] patternNumber = PATTERN_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoteOffset() <em>Note Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteOffset()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] NOTE_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNoteOffset() <em>Note Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteOffset()
	 * @generated
	 * @ordered
	 */
	protected byte[] noteOffset = NOTE_OFFSET_EDEFAULT;

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
	 * The default value of the '{@link #isBeingUsed() <em>Being Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBeingUsed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BEING_USED_EDEFAULT = true;

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

	protected SongImpl(EsxRandomAccess in, int songNumber) throws EsxException, IOException {
		super();

		// Stop immediately if we are passed an invalid songNumber
		if (songNumber >= EsxUtil.NUM_SONGS || songNumber < 0)
			throw new EsxException("Invalid songNumber: " + songNumber);

		// Jump to the start of songNumber's data
		in.seek(EsxUtil.ADDR_SONG_DATA + (songNumber * EsxUtil.CHUNKSIZE_SONG));

		// Set the original .esx file song number
		this.setSongNumberOriginal(SongNumber.get(songNumber));

		// bytes 0~7
		byte[] newSongName = new byte[8];
		in.read(newSongName, 0, 8);
		this.setName(new String(newSongName));

		// bytes 8~9
		Tempo newTempo = EsxFactory.eINSTANCE.createTempo();
		this.setTempo(newTempo);
		this.getTempo().setPackedValue(in.readUnsignedShort());
		this.getTempo().updateValue();

		// byte 10
		this.setTempoLock(in.readByte());
		// byte 11
		this.setLength(in.readByte());
		// byte 12
		this.setMuteHold(in.readByte());
		// byte 13
		this.setNextSong(in.readByte());
		// bytes 14~15
		short tempNumberOfSongEvents = in.readShort();

		// bytes 16~271
		byte[] newPatternNumber = new byte[EsxUtil.NUM_SONG_PATTERNS];
		in.read(newPatternNumber, 0, EsxUtil.NUM_SONG_PATTERNS);
		this.setPatternNumber(newPatternNumber);

		// bytes 272~527
		byte[] newNoteOffset = new byte[EsxUtil.NUM_SONG_NOTE_OFFSET];
		in.read(newNoteOffset, 0, EsxUtil.NUM_SONG_NOTE_OFFSET);
		this.setNoteOffset(newNoteOffset);

		// read in song events
		if(tempNumberOfSongEvents > 0) {
			int currentSongEventNumber = this.getNumberOfPreviousSongEvents(in, songNumber);
			SongEvent songEvent;
			for(int i=0; i<tempNumberOfSongEvents; i++) {
				int songEventType = this.getSongEventType(in, currentSongEventNumber);
				switch(songEventType) {
					case EsxPackage.SONG_EVENT_KEYBOARD_NOTE:
						songEvent = EsxFactory.eINSTANCE.createSongEventKeyboardNoteFromEsxFile(in, currentSongEventNumber);
						break;
					case EsxPackage.SONG_EVENT_DRUM_NOTE:
						songEvent = EsxFactory.eINSTANCE.createSongEventDrumNoteFromEsxFile(in, currentSongEventNumber);
						break;
					case EsxPackage.SONG_EVENT_MUTE_STATUS:
						songEvent = EsxFactory.eINSTANCE.createSongEventMuteStatusFromEsxFile(in, currentSongEventNumber);
						break;
					case EsxPackage.SONG_EVENT_TEMPO:
						songEvent = EsxFactory.eINSTANCE.createSongEventTempoFromEsxFile(in, currentSongEventNumber);
						break;
					default:
						songEvent = EsxFactory.eINSTANCE.createSongEventControlFromEsxFile(in, currentSongEventNumber);
						break;
				}
				currentSongEventNumber++;
				this.getSongEvents().add(songEvent);
			}
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
	public byte getTempoLock() {
		return tempoLock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTempoLock(byte newTempoLock) {
		byte oldTempoLock = tempoLock;
		tempoLock = newTempoLock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SONG__TEMPO_LOCK, oldTempoLock, tempoLock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(byte newLength) {
		byte oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SONG__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getMuteHold() {
		return muteHold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMuteHold(byte newMuteHold) {
		byte oldMuteHold = muteHold;
		muteHold = newMuteHold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SONG__MUTE_HOLD, oldMuteHold, muteHold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getNextSong() {
		return nextSong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextSong(byte newNextSong) {
		byte oldNextSong = nextSong;
		nextSong = newNextSong;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SONG__NEXT_SONG, oldNextSong, nextSong));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public short getNumberOfSongEvents() {
		return (short) this.getSongEvents().size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getPatternNumber() {
		return patternNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternNumber(byte[] newPatternNumber) {
		byte[] oldPatternNumber = patternNumber;
		patternNumber = newPatternNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SONG__PATTERN_NUMBER, oldPatternNumber, patternNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getNoteOffset() {
		return noteOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoteOffset(byte[] newNoteOffset) {
		byte[] oldNoteOffset = noteOffset;
		noteOffset = newNoteOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SONG__NOTE_OFFSET, oldNoteOffset, noteOffset));
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
	public boolean isBeingUsed() {
		if(this.eResource()!=null) {
			Resource resource = (Resource) this.eResource();
			Object rootObject = resource.getContents().get(0);
			if(rootObject instanceof EsxFile) {
				/* TODO: EVENTUALLY WE NEED TO USE EMF COMPARE (see Pattern#isBeingUsed) */
				// Temporarily just checking names
				return (!this.getName().equals(((EsxFile) rootObject).getBlankSong().getName()));
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
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsxPackage.SONG__TEMPO:
				return basicSetTempo(null, msgs);
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
			case EsxPackage.SONG__LENGTH:
				return getLength();
			case EsxPackage.SONG__MUTE_HOLD:
				return getMuteHold();
			case EsxPackage.SONG__NEXT_SONG:
				return getNextSong();
			case EsxPackage.SONG__NUMBER_OF_SONG_EVENTS:
				return getNumberOfSongEvents();
			case EsxPackage.SONG__PATTERN_NUMBER:
				return getPatternNumber();
			case EsxPackage.SONG__NOTE_OFFSET:
				return getNoteOffset();
			case EsxPackage.SONG__SONG_EVENTS:
				return getSongEvents();
			case EsxPackage.SONG__BEING_USED:
				return isBeingUsed();
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
				setTempoLock((Byte)newValue);
				return;
			case EsxPackage.SONG__LENGTH:
				setLength((Byte)newValue);
				return;
			case EsxPackage.SONG__MUTE_HOLD:
				setMuteHold((Byte)newValue);
				return;
			case EsxPackage.SONG__NEXT_SONG:
				setNextSong((Byte)newValue);
				return;
			case EsxPackage.SONG__PATTERN_NUMBER:
				setPatternNumber((byte[])newValue);
				return;
			case EsxPackage.SONG__NOTE_OFFSET:
				setNoteOffset((byte[])newValue);
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
			case EsxPackage.SONG__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case EsxPackage.SONG__MUTE_HOLD:
				setMuteHold(MUTE_HOLD_EDEFAULT);
				return;
			case EsxPackage.SONG__NEXT_SONG:
				setNextSong(NEXT_SONG_EDEFAULT);
				return;
			case EsxPackage.SONG__PATTERN_NUMBER:
				setPatternNumber(PATTERN_NUMBER_EDEFAULT);
				return;
			case EsxPackage.SONG__NOTE_OFFSET:
				setNoteOffset(NOTE_OFFSET_EDEFAULT);
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
			case EsxPackage.SONG__LENGTH:
				return length != LENGTH_EDEFAULT;
			case EsxPackage.SONG__MUTE_HOLD:
				return muteHold != MUTE_HOLD_EDEFAULT;
			case EsxPackage.SONG__NEXT_SONG:
				return nextSong != NEXT_SONG_EDEFAULT;
			case EsxPackage.SONG__NUMBER_OF_SONG_EVENTS:
				return getNumberOfSongEvents() != NUMBER_OF_SONG_EVENTS_EDEFAULT;
			case EsxPackage.SONG__PATTERN_NUMBER:
				return PATTERN_NUMBER_EDEFAULT == null ? patternNumber != null : !PATTERN_NUMBER_EDEFAULT.equals(patternNumber);
			case EsxPackage.SONG__NOTE_OFFSET:
				return NOTE_OFFSET_EDEFAULT == null ? noteOffset != null : !NOTE_OFFSET_EDEFAULT.equals(noteOffset);
			case EsxPackage.SONG__SONG_EVENTS:
				return songEvents != null && !songEvents.isEmpty();
			case EsxPackage.SONG__BEING_USED:
				return isBeingUsed() != BEING_USED_EDEFAULT;
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
		result.append(", length: ");
		result.append(length);
		result.append(", muteHold: ");
		result.append(muteHold);
		result.append(", nextSong: ");
		result.append(nextSong);
		result.append(", patternNumber: ");
		result.append(patternNumber);
		result.append(", noteOffset: ");
		result.append(noteOffset);
		result.append(", songNumberOriginal: ");
		result.append(songNumberOriginal);
		result.append(')');
		return result.toString();
	}

	@Override
	public int getNumberOfPreviousSongEvents(EsxRandomAccess in, int songNumber) throws EsxException, IOException {
		// Stop immediately if we are passed an invalid songNumber
		if (songNumber >= EsxUtil.NUM_SONGS || songNumber < 0)
			throw new EsxException("Invalid songNumber: " + songNumber);

		int songEventCount = 0;
		int numberOfSongEventsOffset = 14; // byte 14~15 holds the numberOfSongEvents

		// Loop through previous songs increment event count
		for(int i=0; i<songNumber; i++) {
			in.seek(EsxUtil.ADDR_SONG_DATA + (i * EsxUtil.CHUNKSIZE_SONG) + numberOfSongEventsOffset);
			songEventCount = songEventCount + in.readShort();
		}

		return songEventCount;
	}

	@Override
	public int getSongEventType(EsxRandomAccess in, int songEventNumber) throws EsxException, IOException {
		// Stop immediately if we are passed an invalid songEventNumber
		if (songEventNumber >= EsxUtil.MAX_NUM_SONG_EVENTS || songEventNumber < 0)
			throw new EsxException("Invalid songEventNumber: " + songEventNumber);

		int operationNumberOffset = 2; // byte 2~3 holds the operationNumber

		in.seek(EsxUtil.ADDR_SONG_EVENT_DATA + (songEventNumber * EsxUtil.CHUNKSIZE_SONG_EVENT) + operationNumberOffset);
		short operationNumber = in.readShort();

		if(operationNumber==503) {
			return EsxPackage.SONG_EVENT_MUTE_STATUS;
		}
		else if(operationNumber==515) {
			return EsxPackage.SONG_EVENT_TEMPO;
		}
		else if(operationNumber==0x4000) {
			int partNumber = in.readByte();
			if(partNumber==10 || partNumber==11)
				return EsxPackage.SONG_EVENT_KEYBOARD_NOTE;
			else
				return EsxPackage.SONG_EVENT_DRUM_NOTE;
		}
		else {
			return EsxPackage.SONG_EVENT_CONTROL;
		}
	}

	@Override
	public void write(EsxRandomAccess out, int songNumber, int startingSongEventNumber) throws EsxException, IOException {

		// Stop immediately if we are passed an invalid songNumber
		if (songNumber >= EsxUtil.NUM_SONGS || songNumber < 0)
			throw new EsxException("Invalid songNumber: " + songNumber);

		// Stop immediately if we are passed an invalid startingSongEventNumber
		if (startingSongEventNumber+this.getNumberOfSongEvents() > EsxUtil.MAX_NUM_SONG_EVENTS ||
				startingSongEventNumber < 0)
			throw new EsxException("Invalid startingSongEventNumber: " + startingSongEventNumber);

		// Jump to the start of songNumber's data
		out.seek(EsxUtil.ADDR_SONG_DATA + (songNumber * EsxUtil.CHUNKSIZE_SONG));

		// bytes 0~7
		out.write(EsxUtil.getByteArrayWithLength(this.getName(), 8, (byte) 0x00), 0, 8);
		// bytes 8~9
		this.getTempo().updatePackedValue();
		out.writeShort(this.getTempo().getPackedValue());
		// byte 10
		out.writeByte(this.getTempoLock());
		// byte 11
		out.writeByte(this.getLength());
		// byte 12
		out.writeByte(this.getMuteHold());
		// byte 13
		out.writeByte(this.getNextSong());
		// bytes 14~15
		out.writeShort(this.getNumberOfSongEvents());
		// bytes 16~271
		out.write(this.getPatternNumber());
		// bytes 272~527
		out.write(this.getNoteOffset());

		// write song events
		SongEvent songEvent;
		for(int i=0; i<this.getNumberOfSongEvents(); i++) {
			songEvent = this.getSongEvents().get(i);
			if(songEvent instanceof SongEventControl) {
				((SongEventControl) songEvent).write(out, startingSongEventNumber+i);
			}
			else if(songEvent instanceof SongEventDrumNote) {
				((SongEventDrumNote) songEvent).write(out, startingSongEventNumber+i);
			}
			else if(songEvent instanceof SongEventKeyboardNote) {
				((SongEventKeyboardNote) songEvent).write(out, startingSongEventNumber+i);
			}
			else if(songEvent instanceof SongEventMuteStatus) {
				((SongEventMuteStatus) songEvent).write(out, startingSongEventNumber+i);
			}
			else if(songEvent instanceof SongEventTempo) {
				((SongEventTempo) songEvent).write(out, startingSongEventNumber+i);
			}
			else {
				throw new EsxException("Invalid type of SongEvent: " + songEvent.getClass().toString());
			}
		}

	}

} //SongImpl

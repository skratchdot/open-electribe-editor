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
package com.skratchdot.electribe.model.esx;

import org.eclipse.emf.common.util.EList;
import java.io.IOException;

import org.eclipse.emf.ecore.EObject;

import com.skratchdot.electribe.model.esx.util.EsxException;
import com.skratchdot.electribe.model.esx.util.EsxRandomAccess;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Song</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.Song#getName <em>Name</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Song#getTempo <em>Tempo</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Song#getTempoLock <em>Tempo Lock</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Song#getLength <em>Length</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Song#getMuteHold <em>Mute Hold</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Song#getNextSong <em>Next Song</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Song#getNumberOfSongEvents <em>Number Of Song Events</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Song#getPatternNumber <em>Pattern Number</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Song#getNoteOffset <em>Note Offset</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Song#getSongEvents <em>Song Events</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Song#isBeingUsed <em>Being Used</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Song#getSongNumberOriginal <em>Song Number Original</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Song#getSongNumberCurrent <em>Song Number Current</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSong()
 * @model
 * @generated
 */
public interface Song extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSong_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Song#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tempo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tempo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tempo</em>' containment reference.
	 * @see #setTempo(Tempo)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSong_Tempo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Tempo getTempo();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Song#getTempo <em>Tempo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tempo</em>' containment reference.
	 * @see #getTempo()
	 * @generated
	 */
	void setTempo(Tempo value);

	/**
	 * Returns the value of the '<em><b>Tempo Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tempo Lock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tempo Lock</em>' attribute.
	 * @see #setTempoLock(byte)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSong_TempoLock()
	 * @model
	 * @generated
	 */
	byte getTempoLock();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Song#getTempoLock <em>Tempo Lock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tempo Lock</em>' attribute.
	 * @see #getTempoLock()
	 * @generated
	 */
	void setTempoLock(byte value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(byte)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSong_Length()
	 * @model
	 * @generated
	 */
	byte getLength();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Song#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(byte value);

	/**
	 * Returns the value of the '<em><b>Mute Hold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mute Hold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mute Hold</em>' attribute.
	 * @see #setMuteHold(byte)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSong_MuteHold()
	 * @model
	 * @generated
	 */
	byte getMuteHold();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Song#getMuteHold <em>Mute Hold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mute Hold</em>' attribute.
	 * @see #getMuteHold()
	 * @generated
	 */
	void setMuteHold(byte value);

	/**
	 * Returns the value of the '<em><b>Next Song</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Song</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Song</em>' attribute.
	 * @see #setNextSong(byte)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSong_NextSong()
	 * @model
	 * @generated
	 */
	byte getNextSong();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Song#getNextSong <em>Next Song</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Song</em>' attribute.
	 * @see #getNextSong()
	 * @generated
	 */
	void setNextSong(byte value);

	/**
	 * Returns the value of the '<em><b>Number Of Song Events</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Song Events</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Song Events</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSong_NumberOfSongEvents()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	short getNumberOfSongEvents();

	/**
	 * Returns the value of the '<em><b>Pattern Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Number</em>' attribute.
	 * @see #setPatternNumber(byte[])
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSong_PatternNumber()
	 * @model
	 * @generated
	 */
	byte[] getPatternNumber();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Song#getPatternNumber <em>Pattern Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Number</em>' attribute.
	 * @see #getPatternNumber()
	 * @generated
	 */
	void setPatternNumber(byte[] value);

	/**
	 * Returns the value of the '<em><b>Note Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note Offset</em>' attribute.
	 * @see #setNoteOffset(byte[])
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSong_NoteOffset()
	 * @model
	 * @generated
	 */
	byte[] getNoteOffset();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Song#getNoteOffset <em>Note Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note Offset</em>' attribute.
	 * @see #getNoteOffset()
	 * @generated
	 */
	void setNoteOffset(byte[] value);

	/**
	 * Returns the value of the '<em><b>Song Events</b></em>' containment reference list.
	 * The list contents are of type {@link com.skratchdot.electribe.model.esx.SongEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Song Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Song Events</em>' containment reference list.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSong_SongEvents()
	 * @model containment="true" upper="20000"
	 * @generated
	 */
	EList<SongEvent> getSongEvents();

	/**
	 * Returns the value of the '<em><b>Being Used</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Being Used</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Being Used</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSong_BeingUsed()
	 * @model default="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isBeingUsed();

	/**
	 * Returns the value of the '<em><b>Song Number Original</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.SongNumber}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Song Number Original</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Song Number Original</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.SongNumber
	 * @see #setSongNumberOriginal(SongNumber)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSong_SongNumberOriginal()
	 * @model default="-1"
	 * @generated
	 */
	SongNumber getSongNumberOriginal();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Song#getSongNumberOriginal <em>Song Number Original</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Song Number Original</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.SongNumber
	 * @see #getSongNumberOriginal()
	 * @generated
	 */
	void setSongNumberOriginal(SongNumber value);

	/**
	 * Returns the value of the '<em><b>Song Number Current</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.SongNumber}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Song Number Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Song Number Current</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.SongNumber
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSong_SongNumberCurrent()
	 * @model default="-1" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	SongNumber getSongNumberCurrent();

	public int getNumberOfPreviousSongEvents(EsxRandomAccess in, int songNumber) throws EsxException, IOException;

	public int getSongEventType(EsxRandomAccess in, int songEventNumber) throws EsxException, IOException;

	void write(EsxRandomAccess out, int songNumber, int startingSongEventNumber) throws EsxException, IOException;

} // Song

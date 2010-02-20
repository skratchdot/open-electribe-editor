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
 *   <li>{@link com.skratchdot.electribe.model.esx.Song#getSongLength <em>Song Length</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Song#getMuteHold <em>Mute Hold</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Song#getNextSongNumber <em>Next Song Number</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Song#getNumberOfSongEvents <em>Number Of Song Events</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Song#getSongPatterns <em>Song Patterns</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Song#getSongEvents <em>Song Events</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Song#isEmpty <em>Empty</em>}</li>
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
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.TempoLock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tempo Lock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tempo Lock</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.TempoLock
	 * @see #setTempoLock(TempoLock)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSong_TempoLock()
	 * @model
	 * @generated
	 */
	TempoLock getTempoLock();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Song#getTempoLock <em>Tempo Lock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tempo Lock</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.TempoLock
	 * @see #getTempoLock()
	 * @generated
	 */
	void setTempoLock(TempoLock value);

	/**
	 * Returns the value of the '<em><b>Song Length</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.SongLength}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Song Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Song Length</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.SongLength
	 * @see #setSongLength(SongLength)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSong_SongLength()
	 * @model
	 * @generated
	 */
	SongLength getSongLength();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Song#getSongLength <em>Song Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Song Length</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.SongLength
	 * @see #getSongLength()
	 * @generated
	 */
	void setSongLength(SongLength value);

	/**
	 * Returns the value of the '<em><b>Mute Hold</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.MuteHold}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mute Hold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mute Hold</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.MuteHold
	 * @see #setMuteHold(MuteHold)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSong_MuteHold()
	 * @model
	 * @generated
	 */
	MuteHold getMuteHold();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Song#getMuteHold <em>Mute Hold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mute Hold</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.MuteHold
	 * @see #getMuteHold()
	 * @generated
	 */
	void setMuteHold(MuteHold value);

	/**
	 * Returns the value of the '<em><b>Next Song Number</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.NextSongNumber}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Song Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Song Number</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.NextSongNumber
	 * @see #setNextSongNumber(NextSongNumber)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSong_NextSongNumber()
	 * @model
	 * @generated
	 */
	NextSongNumber getNextSongNumber();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Song#getNextSongNumber <em>Next Song Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Song Number</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.NextSongNumber
	 * @see #getNextSongNumber()
	 * @generated
	 */
	void setNextSongNumber(NextSongNumber value);

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
	 * Returns the value of the '<em><b>Song Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link com.skratchdot.electribe.model.esx.SongPattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Song Patterns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Song Patterns</em>' containment reference list.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSong_SongPatterns()
	 * @model containment="true" lower="256" upper="256"
	 * @generated
	 */
	EList<SongPattern> getSongPatterns();

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
	 * Returns the value of the '<em><b>Empty</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empty</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSong_Empty()
	 * @model default="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isEmpty();

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	byte[] toByteArray();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	byte[] toSongEventByteArray();

	public int getNumberOfPreviousSongEvents(EsxRandomAccess in, int songNumber) throws EsxException, IOException;

	public int getSongEventType(EsxRandomAccess in, int songEventNumber) throws EsxException, IOException;

	void write(EsxRandomAccess out, int songNumber, int startingSongEventNumber) throws EsxException, IOException;

} // Song

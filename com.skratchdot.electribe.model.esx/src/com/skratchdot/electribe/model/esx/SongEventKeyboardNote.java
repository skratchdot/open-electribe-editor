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

import java.io.IOException;

import com.skratchdot.electribe.model.esx.util.EsxException;
import com.skratchdot.electribe.model.esx.util.EsxRandomAccess;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Song Event Keyboard Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.SongEventKeyboardNote#getLength <em>Length</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.SongEventKeyboardNote#getNoteNumber <em>Note Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSongEventKeyboardNote()
 * @model
 * @generated
 */
public interface SongEventKeyboardNote extends SongEvent, SongEventWithPart {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(short)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSongEventKeyboardNote_Length()
	 * @model
	 * @generated
	 */
	short getLength();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.SongEventKeyboardNote#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(short value);

	/**
	 * Returns the value of the '<em><b>Note Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note Number</em>' attribute.
	 * @see #setNoteNumber(byte)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSongEventKeyboardNote_NoteNumber()
	 * @model
	 * @generated
	 */
	byte getNoteNumber();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.SongEventKeyboardNote#getNoteNumber <em>Note Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note Number</em>' attribute.
	 * @see #getNoteNumber()
	 * @generated
	 */
	void setNoteNumber(byte value);

	void write(EsxRandomAccess out, int songEventNumber) throws EsxException, IOException;

} // SongEventKeyboardNote

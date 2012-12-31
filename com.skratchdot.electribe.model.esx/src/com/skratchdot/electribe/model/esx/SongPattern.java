/*******************************************************************************
 * Copyright (c) 2009-2013 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 *******************************************************************************/
package com.skratchdot.electribe.model.esx;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Song Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.SongPattern#isEmpty <em>Empty</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.SongPattern#getNoteOffset <em>Note Offset</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.SongPattern#getPatternPointer <em>Pattern Pointer</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.SongPattern#getPositionCurrent <em>Position Current</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSongPattern()
 * @model
 * @generated
 */
public interface SongPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Position Current</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Current</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSongPattern_PositionCurrent()
	 * @model default="-1" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getPositionCurrent();

	/**
	 * Returns the value of the '<em><b>Note Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note Offset</em>' attribute.
	 * @see #setNoteOffset(byte)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSongPattern_NoteOffset()
	 * @model
	 * @generated
	 */
	byte getNoteOffset();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.SongPattern#getNoteOffset <em>Note Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note Offset</em>' attribute.
	 * @see #getNoteOffset()
	 * @generated
	 */
	void setNoteOffset(byte value);

	/**
	 * Returns the value of the '<em><b>Pattern Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Pointer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Pointer</em>' attribute.
	 * @see #setPatternPointer(short)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSongPattern_PatternPointer()
	 * @model
	 * @generated
	 */
	short getPatternPointer();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.SongPattern#getPatternPointer <em>Pattern Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Pointer</em>' attribute.
	 * @see #getPatternPointer()
	 * @generated
	 */
	void setPatternPointer(short value);

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
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSongPattern_Empty()
	 * @model default="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isEmpty();

} // SongPattern

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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.skratchdot.riff.wav.ChunkDataListType;
import com.skratchdot.riff.wav.WavPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chunk Data List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkDataListTypeImpl#getCuePointID <em>Cue Point ID</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkDataListTypeImpl#getText <em>Text</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkDataListTypeImpl#getTextAsString <em>Text As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ChunkDataListTypeImpl extends ChunkImpl implements ChunkDataListType {
	/**
	 * The default value of the '{@link #getCuePointID() <em>Cue Point ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCuePointID()
	 * @generated
	 * @ordered
	 */
	protected static final Long CUE_POINT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCuePointID() <em>Cue Point ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCuePointID()
	 * @generated
	 * @ordered
	 */
	protected Long cuePointID = CUE_POINT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected byte[] text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextAsString() <em>Text As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_AS_STRING_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChunkDataListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavPackage.Literals.CHUNK_DATA_LIST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getCuePointID() {
		return cuePointID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCuePointID(Long newCuePointID) {
		Long oldCuePointID = cuePointID;
		cuePointID = newCuePointID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_DATA_LIST_TYPE__CUE_POINT_ID, oldCuePointID, cuePointID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(byte[] newText) {
		byte[] oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_DATA_LIST_TYPE__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getTextAsString() {
		return this.getText()==null?"":new String(this.getText());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WavPackage.CHUNK_DATA_LIST_TYPE__CUE_POINT_ID:
				return getCuePointID();
			case WavPackage.CHUNK_DATA_LIST_TYPE__TEXT:
				return getText();
			case WavPackage.CHUNK_DATA_LIST_TYPE__TEXT_AS_STRING:
				return getTextAsString();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WavPackage.CHUNK_DATA_LIST_TYPE__CUE_POINT_ID:
				setCuePointID((Long)newValue);
				return;
			case WavPackage.CHUNK_DATA_LIST_TYPE__TEXT:
				setText((byte[])newValue);
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
			case WavPackage.CHUNK_DATA_LIST_TYPE__CUE_POINT_ID:
				setCuePointID(CUE_POINT_ID_EDEFAULT);
				return;
			case WavPackage.CHUNK_DATA_LIST_TYPE__TEXT:
				setText(TEXT_EDEFAULT);
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
			case WavPackage.CHUNK_DATA_LIST_TYPE__CUE_POINT_ID:
				return CUE_POINT_ID_EDEFAULT == null ? cuePointID != null : !CUE_POINT_ID_EDEFAULT.equals(cuePointID);
			case WavPackage.CHUNK_DATA_LIST_TYPE__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case WavPackage.CHUNK_DATA_LIST_TYPE__TEXT_AS_STRING:
				return TEXT_AS_STRING_EDEFAULT == null ? getTextAsString() != null : !TEXT_AS_STRING_EDEFAULT.equals(getTextAsString());
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
		result.append(" (cuePointID: ");
		result.append(cuePointID);
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //ChunkDataListTypeImpl

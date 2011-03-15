/**
 * Copyright (c) 2009-2011 SKRATCHDOT.COM
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

import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.MidiChannel;
import com.skratchdot.electribe.model.esx.MidiChannelType;

import com.skratchdot.electribe.model.esx.MidiChannelTypeName;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Midi Channel Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.MidiChannelTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.MidiChannelTypeImpl#getMidiChannel <em>Midi Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MidiChannelTypeImpl extends EObjectImpl implements MidiChannelType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final MidiChannelTypeName NAME_EDEFAULT = MidiChannelTypeName.NAME_00;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected MidiChannelTypeName name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMidiChannel() <em>Midi Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMidiChannel()
	 * @generated
	 * @ordered
	 */
	protected static final MidiChannel MIDI_CHANNEL_EDEFAULT = MidiChannel.CHANNEL_1;

	/**
	 * The cached value of the '{@link #getMidiChannel() <em>Midi Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMidiChannel()
	 * @generated
	 * @ordered
	 */
	protected MidiChannel midiChannel = MIDI_CHANNEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MidiChannelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsxPackage.Literals.MIDI_CHANNEL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MidiChannelTypeName getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(MidiChannelTypeName newName) {
		MidiChannelTypeName oldName = name;
		name = newName == null ? NAME_EDEFAULT : newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.MIDI_CHANNEL_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MidiChannel getMidiChannel() {
		return midiChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMidiChannel(MidiChannel newMidiChannel) {
		MidiChannel oldMidiChannel = midiChannel;
		midiChannel = newMidiChannel == null ? MIDI_CHANNEL_EDEFAULT : newMidiChannel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.MIDI_CHANNEL_TYPE__MIDI_CHANNEL, oldMidiChannel, midiChannel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EsxPackage.MIDI_CHANNEL_TYPE__NAME:
				return getName();
			case EsxPackage.MIDI_CHANNEL_TYPE__MIDI_CHANNEL:
				return getMidiChannel();
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
			case EsxPackage.MIDI_CHANNEL_TYPE__NAME:
				setName((MidiChannelTypeName)newValue);
				return;
			case EsxPackage.MIDI_CHANNEL_TYPE__MIDI_CHANNEL:
				setMidiChannel((MidiChannel)newValue);
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
			case EsxPackage.MIDI_CHANNEL_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EsxPackage.MIDI_CHANNEL_TYPE__MIDI_CHANNEL:
				setMidiChannel(MIDI_CHANNEL_EDEFAULT);
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
			case EsxPackage.MIDI_CHANNEL_TYPE__NAME:
				return name != NAME_EDEFAULT;
			case EsxPackage.MIDI_CHANNEL_TYPE__MIDI_CHANNEL:
				return midiChannel != MIDI_CHANNEL_EDEFAULT;
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
		result.append(", midiChannel: ");
		result.append(midiChannel);
		result.append(')');
		return result.toString();
	}

} //MidiChannelTypeImpl

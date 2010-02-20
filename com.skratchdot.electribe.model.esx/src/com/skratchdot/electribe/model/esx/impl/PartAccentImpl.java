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

import com.skratchdot.electribe.model.esx.EsxFactory;
import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.PartAccent;
import com.skratchdot.electribe.model.esx.PartWithSequenceData;
import com.skratchdot.electribe.model.esx.SequenceData;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import com.skratchdot.electribe.model.esx.util.EsxException;
import com.skratchdot.electribe.model.esx.util.EsxRandomAccess;
import com.skratchdot.electribe.model.esx.util.EsxUtil;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part Accent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.PartAccentImpl#getSequenceData <em>Sequence Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartAccentImpl extends PartImpl implements PartAccent {
	/**
	 * The cached value of the '{@link #getSequenceData() <em>Sequence Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceData()
	 * @generated
	 * @ordered
	 */
	protected SequenceData sequenceData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartAccentImpl() {
		super();
	}

	public PartAccentImpl(EsxRandomAccess in, int patternNumber,
			int partAccentNumber) throws EsxException, IOException {
		super();

		// Stop immediately if we are passed an invalid patternNumber
		if (patternNumber >= EsxUtil.NUM_PATTERNS || patternNumber < 0)
			throw new EsxException("Invalid patternNumber: " + patternNumber);

		// Stop immediately if we are passed an invalid partAccentNumber
		if (partAccentNumber >= EsxUtil.NUM_PARTS_ACCENT || partAccentNumber < 0)
			throw new EsxException("Invalid partAccentNumber: " + partAccentNumber);

		// Jump to the start of partAccentNumber's data
		in.seek(EsxUtil.ADDR_PATTERN_DATA +
				(patternNumber * EsxUtil.CHUNKSIZE_PATTERN) +
				EsxUtil.PATTERN_OFFSET_PARTS_ACCENT +
				(partAccentNumber * EsxUtil.CHUNKSIZE_PARTS_ACCENT));

		// byte 0
		this.setLevel(in.readByte());
		// byte 1
		this.setMotionSequenceStatus(in.readByte());
		// bytes 2~17
		byte[] tempBytes = new byte[EsxUtil.NUM_SEQUENCE_DATA];
		in.readFully(tempBytes, 0, EsxUtil.NUM_SEQUENCE_DATA);
		SequenceData newSequenceData = EsxFactory.eINSTANCE.createSequenceData();
		newSequenceData.setSequenceData(tempBytes);
		this.setSequenceData(newSequenceData);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsxPackage.Literals.PART_ACCENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceData getSequenceData() {
		return sequenceData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceData(SequenceData newSequenceData, NotificationChain msgs) {
		SequenceData oldSequenceData = sequenceData;
		sequenceData = newSequenceData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsxPackage.PART_ACCENT__SEQUENCE_DATA, oldSequenceData, newSequenceData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceData(SequenceData newSequenceData) {
		if (newSequenceData != sequenceData) {
			NotificationChain msgs = null;
			if (sequenceData != null)
				msgs = ((InternalEObject)sequenceData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsxPackage.PART_ACCENT__SEQUENCE_DATA, null, msgs);
			if (newSequenceData != null)
				msgs = ((InternalEObject)newSequenceData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsxPackage.PART_ACCENT__SEQUENCE_DATA, null, msgs);
			msgs = basicSetSequenceData(newSequenceData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.PART_ACCENT__SEQUENCE_DATA, newSequenceData, newSequenceData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public byte[] toByteArray() {
		ByteBuffer buf = ByteBuffer.allocate(EsxUtil.CHUNKSIZE_PARTS_ACCENT);
		// byte 0
		buf.put(this.getLevel());
		// byte 1
		buf.put(this.getMotionSequenceStatus());
		// bytes 2~17
		buf.put(this.getSequenceData().getSequenceData());
		return buf.array();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsxPackage.PART_ACCENT__SEQUENCE_DATA:
				return basicSetSequenceData(null, msgs);
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
			case EsxPackage.PART_ACCENT__SEQUENCE_DATA:
				return getSequenceData();
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
			case EsxPackage.PART_ACCENT__SEQUENCE_DATA:
				setSequenceData((SequenceData)newValue);
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
			case EsxPackage.PART_ACCENT__SEQUENCE_DATA:
				setSequenceData((SequenceData)null);
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
			case EsxPackage.PART_ACCENT__SEQUENCE_DATA:
				return sequenceData != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == PartWithSequenceData.class) {
			switch (derivedFeatureID) {
				case EsxPackage.PART_ACCENT__SEQUENCE_DATA: return EsxPackage.PART_WITH_SEQUENCE_DATA__SEQUENCE_DATA;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == PartWithSequenceData.class) {
			switch (baseFeatureID) {
				case EsxPackage.PART_WITH_SEQUENCE_DATA__SEQUENCE_DATA: return EsxPackage.PART_ACCENT__SEQUENCE_DATA;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	@Override
	public void write(EsxRandomAccess out, int patternNumber,
			int partAccentNumber) throws EsxException, IOException {

		// Stop immediately if we are passed an invalid patternNumber
		if (patternNumber >= EsxUtil.NUM_PATTERNS || patternNumber < 0)
			throw new EsxException("Invalid patternNumber: " + patternNumber);

		// Stop immediately if we are passed an invalid partAccentNumber
		if (partAccentNumber >= EsxUtil.NUM_PARTS_ACCENT || partAccentNumber < 0)
			throw new EsxException("Invalid partAccentNumber: " + partAccentNumber);

		// Jump to the start of partAccentNumber's data
		out.seek(EsxUtil.ADDR_PATTERN_DATA +
				(patternNumber * EsxUtil.CHUNKSIZE_PATTERN) +
				EsxUtil.PATTERN_OFFSET_PARTS_ACCENT +
				(partAccentNumber * EsxUtil.CHUNKSIZE_PARTS_ACCENT));

		// byte 0
		out.writeByte(this.getLevel());
		// byte 1
		out.writeByte(this.getMotionSequenceStatus());
		// bytes 2~17
		out.write(this.getSequenceData().getSequenceData());

	}

} //PartAccentImpl

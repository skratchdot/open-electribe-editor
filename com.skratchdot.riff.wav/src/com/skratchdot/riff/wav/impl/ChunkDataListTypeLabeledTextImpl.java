/**
 * Copyright (c) 2010 SKRATCHDOT.COM
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

import java.nio.ByteOrder;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.skratchdot.riff.wav.ChunkDataListTypeLabeledText;
import com.skratchdot.riff.wav.ChunkTypeID;
import com.skratchdot.riff.wav.RIFFWave;
import com.skratchdot.riff.wav.WavPackage;
import com.skratchdot.riff.wav.util.ExtendedByteBuffer;
import com.skratchdot.riff.wav.util.RiffWaveException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chunk Data List Type Labeled Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkDataListTypeLabeledTextImpl#getSampleLength <em>Sample Length</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkDataListTypeLabeledTextImpl#getPurposeID <em>Purpose ID</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkDataListTypeLabeledTextImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkDataListTypeLabeledTextImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkDataListTypeLabeledTextImpl#getDialect <em>Dialect</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkDataListTypeLabeledTextImpl#getCodePage <em>Code Page</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChunkDataListTypeLabeledTextImpl extends ChunkDataListTypeImpl implements ChunkDataListTypeLabeledText {
	/**
	 * The default value of the '{@link #getSampleLength() <em>Sample Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleLength()
	 * @generated
	 * @ordered
	 */
	protected static final Long SAMPLE_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSampleLength() <em>Sample Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleLength()
	 * @generated
	 * @ordered
	 */
	protected Long sampleLength = SAMPLE_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPurposeID() <em>Purpose ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposeID()
	 * @generated
	 * @ordered
	 */
	protected static final Long PURPOSE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurposeID() <em>Purpose ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposeID()
	 * @generated
	 * @ordered
	 */
	protected Long purposeID = PURPOSE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected Integer country = COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected Integer language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDialect() <em>Dialect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDialect()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DIALECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDialect() <em>Dialect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDialect()
	 * @generated
	 * @ordered
	 */
	protected Integer dialect = DIALECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodePage() <em>Code Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodePage()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CODE_PAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodePage() <em>Code Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodePage()
	 * @generated
	 * @ordered
	 */
	protected Integer codePage = CODE_PAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChunkDataListTypeLabeledTextImpl() {
		super();
	}

	@Override
	public void init(RIFFWave riffWave, ExtendedByteBuffer buf) throws RiffWaveException {
		// Check Chunk Type ID
		if(ChunkTypeID.get((int)buf.getUnsignedInt())!=this.getChunkTypeID())
			throw new RiffWaveException("Invalid Chunk ID for "+this.getChunkTypeID().getLiteral());

		// Read in data size
		int chunkSize = (int) buf.getUnsignedInt();

		this.setCuePointID(buf.getUnsignedInt());
		this.setSampleLength(buf.getUnsignedInt());
		this.setPurposeID(buf.getUnsignedInt());
		this.setCountry(buf.getUnsignedShort());
		this.setLanguage(buf.getUnsignedShort());
		this.setDialect(buf.getUnsignedShort());
		this.setCodePage(buf.getUnsignedShort());

		int textSize = chunkSize-20;
		if(textSize>0) {
			byte[] newText = new byte[textSize];
			buf.getBytes(newText);
			this.setText(newText);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavPackage.Literals.CHUNK_DATA_LIST_TYPE_LABELED_TEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getSampleLength() {
		return sampleLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSampleLength(Long newSampleLength) {
		Long oldSampleLength = sampleLength;
		sampleLength = newSampleLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__SAMPLE_LENGTH, oldSampleLength, sampleLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getPurposeID() {
		return purposeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurposeID(Long newPurposeID) {
		Long oldPurposeID = purposeID;
		purposeID = newPurposeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__PURPOSE_ID, oldPurposeID, purposeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(Integer newCountry) {
		Integer oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(Integer newLanguage) {
		Integer oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDialect() {
		return dialect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDialect(Integer newDialect) {
		Integer oldDialect = dialect;
		dialect = newDialect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__DIALECT, oldDialect, dialect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCodePage() {
		return codePage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodePage(Integer newCodePage) {
		Integer oldCodePage = codePage;
		codePage = newCodePage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__CODE_PAGE, oldCodePage, codePage));
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getChunkTypeID()
	 */
	@Override
	public ChunkTypeID getChunkTypeID() {
		return ChunkTypeID.LTXT;
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getChunkTypeIDValue()
	 */
	@Override
	public int getChunkTypeIDValue() {
		return ChunkTypeID.LTXT_VALUE;
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getSize()
	 */
	@Override
	public long getSize() {
		return this.getText()==null?20:20+this.getText().length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__SAMPLE_LENGTH:
				return getSampleLength();
			case WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__PURPOSE_ID:
				return getPurposeID();
			case WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__COUNTRY:
				return getCountry();
			case WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__LANGUAGE:
				return getLanguage();
			case WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__DIALECT:
				return getDialect();
			case WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__CODE_PAGE:
				return getCodePage();
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
			case WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__SAMPLE_LENGTH:
				setSampleLength((Long)newValue);
				return;
			case WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__PURPOSE_ID:
				setPurposeID((Long)newValue);
				return;
			case WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__COUNTRY:
				setCountry((Integer)newValue);
				return;
			case WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__LANGUAGE:
				setLanguage((Integer)newValue);
				return;
			case WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__DIALECT:
				setDialect((Integer)newValue);
				return;
			case WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__CODE_PAGE:
				setCodePage((Integer)newValue);
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
			case WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__SAMPLE_LENGTH:
				setSampleLength(SAMPLE_LENGTH_EDEFAULT);
				return;
			case WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__PURPOSE_ID:
				setPurposeID(PURPOSE_ID_EDEFAULT);
				return;
			case WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__DIALECT:
				setDialect(DIALECT_EDEFAULT);
				return;
			case WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__CODE_PAGE:
				setCodePage(CODE_PAGE_EDEFAULT);
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
			case WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__SAMPLE_LENGTH:
				return SAMPLE_LENGTH_EDEFAULT == null ? sampleLength != null : !SAMPLE_LENGTH_EDEFAULT.equals(sampleLength);
			case WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__PURPOSE_ID:
				return PURPOSE_ID_EDEFAULT == null ? purposeID != null : !PURPOSE_ID_EDEFAULT.equals(purposeID);
			case WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__DIALECT:
				return DIALECT_EDEFAULT == null ? dialect != null : !DIALECT_EDEFAULT.equals(dialect);
			case WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__CODE_PAGE:
				return CODE_PAGE_EDEFAULT == null ? codePage != null : !CODE_PAGE_EDEFAULT.equals(codePage);
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
		result.append(" (sampleLength: ");
		result.append(sampleLength);
		result.append(", purposeID: ");
		result.append(purposeID);
		result.append(", country: ");
		result.append(country);
		result.append(", language: ");
		result.append(language);
		result.append(", dialect: ");
		result.append(dialect);
		result.append(", codePage: ");
		result.append(codePage);
		result.append(')');
		return result.toString();
	}

	@Override
	public byte[] toByteArray() {
		ExtendedByteBuffer buf = new ExtendedByteBuffer((int) this.getSize()+8);
		buf.order(ByteOrder.LITTLE_ENDIAN);

		buf.putUnsignedInt(this.getChunkTypeIDValue());
		buf.putUnsignedInt(this.getSize());
		
		buf.putUnsignedInt(this.getCuePointID());
		buf.putUnsignedInt(this.getSampleLength());
		buf.putUnsignedInt(this.getPurposeID());
		buf.putUnsignedShort(this.getCountry());
		buf.putUnsignedShort(this.getLanguage());
		buf.putUnsignedShort(this.getDialect());
		buf.putUnsignedShort(this.getCodePage());
		
		if(this.getText()!=null) {
			buf.putBytes(this.getText());
		}

		return buf.array();
	}

} //ChunkDataListTypeLabeledTextImpl

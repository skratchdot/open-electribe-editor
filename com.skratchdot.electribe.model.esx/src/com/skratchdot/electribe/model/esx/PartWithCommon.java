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
 * A representation of the model object '<em><b>Part With Common</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.PartWithCommon#getAmpEg <em>Amp Eg</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.PartWithCommon#getBpmSync <em>Bpm Sync</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.PartWithCommon#getCutoff <em>Cutoff</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.PartWithCommon#getEgIntensity <em>Eg Intensity</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.PartWithCommon#getEgTime <em>Eg Time</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.PartWithCommon#getFilterType <em>Filter Type</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.PartWithCommon#getFxSelect <em>Fx Select</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.PartWithCommon#getFxSend <em>Fx Send</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.PartWithCommon#getModDepth <em>Mod Depth</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.PartWithCommon#getModDest <em>Mod Dest</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.PartWithCommon#getModSpeed <em>Mod Speed</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.PartWithCommon#getModType <em>Mod Type</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.PartWithCommon#getPan <em>Pan</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.PartWithCommon#getReservedBitAfterModDepth <em>Reserved Bit After Mod Depth</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.PartWithCommon#getResonance <em>Resonance</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.PartWithCommon#getRoll <em>Roll</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartWithCommon()
 * @model abstract="true"
 * @generated
 */
public interface PartWithCommon extends EObject {
	/**
	 * Returns the value of the '<em><b>Amp Eg</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.AmpEg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amp Eg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amp Eg</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.AmpEg
	 * @see #setAmpEg(AmpEg)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartWithCommon_AmpEg()
	 * @model
	 * @generated
	 */
	AmpEg getAmpEg();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.PartWithCommon#getAmpEg <em>Amp Eg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amp Eg</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.AmpEg
	 * @see #getAmpEg()
	 * @generated
	 */
	void setAmpEg(AmpEg value);

	/**
	 * Returns the value of the '<em><b>Bpm Sync</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.BpmSync}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bpm Sync</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bpm Sync</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.BpmSync
	 * @see #setBpmSync(BpmSync)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartWithCommon_BpmSync()
	 * @model
	 * @generated
	 */
	BpmSync getBpmSync();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.PartWithCommon#getBpmSync <em>Bpm Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bpm Sync</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.BpmSync
	 * @see #getBpmSync()
	 * @generated
	 */
	void setBpmSync(BpmSync value);

	/**
	 * Returns the value of the '<em><b>Cutoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cutoff</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cutoff</em>' attribute.
	 * @see #setCutoff(byte)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartWithCommon_Cutoff()
	 * @model
	 * @generated
	 */
	byte getCutoff();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.PartWithCommon#getCutoff <em>Cutoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cutoff</em>' attribute.
	 * @see #getCutoff()
	 * @generated
	 */
	void setCutoff(byte value);

	/**
	 * Returns the value of the '<em><b>Eg Intensity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eg Intensity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eg Intensity</em>' attribute.
	 * @see #setEgIntensity(byte)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartWithCommon_EgIntensity()
	 * @model
	 * @generated
	 */
	byte getEgIntensity();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.PartWithCommon#getEgIntensity <em>Eg Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eg Intensity</em>' attribute.
	 * @see #getEgIntensity()
	 * @generated
	 */
	void setEgIntensity(byte value);

	/**
	 * Returns the value of the '<em><b>Eg Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eg Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eg Time</em>' attribute.
	 * @see #setEgTime(byte)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartWithCommon_EgTime()
	 * @model
	 * @generated
	 */
	byte getEgTime();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.PartWithCommon#getEgTime <em>Eg Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eg Time</em>' attribute.
	 * @see #getEgTime()
	 * @generated
	 */
	void setEgTime(byte value);

	/**
	 * Returns the value of the '<em><b>Filter Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.FilterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Type</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.FilterType
	 * @see #setFilterType(FilterType)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartWithCommon_FilterType()
	 * @model
	 * @generated
	 */
	FilterType getFilterType();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.PartWithCommon#getFilterType <em>Filter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Type</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.FilterType
	 * @see #getFilterType()
	 * @generated
	 */
	void setFilterType(FilterType value);

	/**
	 * Returns the value of the '<em><b>Fx Select</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.FxSelect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fx Select</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fx Select</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.FxSelect
	 * @see #setFxSelect(FxSelect)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartWithCommon_FxSelect()
	 * @model
	 * @generated
	 */
	FxSelect getFxSelect();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.PartWithCommon#getFxSelect <em>Fx Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fx Select</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.FxSelect
	 * @see #getFxSelect()
	 * @generated
	 */
	void setFxSelect(FxSelect value);

	/**
	 * Returns the value of the '<em><b>Fx Send</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.FxSend}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fx Send</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fx Send</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.FxSend
	 * @see #setFxSend(FxSend)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartWithCommon_FxSend()
	 * @model
	 * @generated
	 */
	FxSend getFxSend();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.PartWithCommon#getFxSend <em>Fx Send</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fx Send</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.FxSend
	 * @see #getFxSend()
	 * @generated
	 */
	void setFxSend(FxSend value);

	/**
	 * Returns the value of the '<em><b>Mod Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mod Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mod Depth</em>' attribute.
	 * @see #setModDepth(byte)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartWithCommon_ModDepth()
	 * @model
	 * @generated
	 */
	byte getModDepth();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.PartWithCommon#getModDepth <em>Mod Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mod Depth</em>' attribute.
	 * @see #getModDepth()
	 * @generated
	 */
	void setModDepth(byte value);

	/**
	 * Returns the value of the '<em><b>Mod Dest</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.ModDest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mod Dest</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mod Dest</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.ModDest
	 * @see #setModDest(ModDest)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartWithCommon_ModDest()
	 * @model
	 * @generated
	 */
	ModDest getModDest();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.PartWithCommon#getModDest <em>Mod Dest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mod Dest</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.ModDest
	 * @see #getModDest()
	 * @generated
	 */
	void setModDest(ModDest value);

	/**
	 * Returns the value of the '<em><b>Mod Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mod Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mod Speed</em>' attribute.
	 * @see #setModSpeed(byte)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartWithCommon_ModSpeed()
	 * @model
	 * @generated
	 */
	byte getModSpeed();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.PartWithCommon#getModSpeed <em>Mod Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mod Speed</em>' attribute.
	 * @see #getModSpeed()
	 * @generated
	 */
	void setModSpeed(byte value);

	/**
	 * Returns the value of the '<em><b>Mod Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.ModType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mod Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mod Type</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.ModType
	 * @see #setModType(ModType)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartWithCommon_ModType()
	 * @model
	 * @generated
	 */
	ModType getModType();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.PartWithCommon#getModType <em>Mod Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mod Type</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.ModType
	 * @see #getModType()
	 * @generated
	 */
	void setModType(ModType value);

	/**
	 * Returns the value of the '<em><b>Pan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pan</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pan</em>' attribute.
	 * @see #setPan(byte)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartWithCommon_Pan()
	 * @model
	 * @generated
	 */
	byte getPan();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.PartWithCommon#getPan <em>Pan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pan</em>' attribute.
	 * @see #getPan()
	 * @generated
	 */
	void setPan(byte value);

	/**
	 * Returns the value of the '<em><b>Reserved Bit After Mod Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserved Bit After Mod Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserved Bit After Mod Depth</em>' attribute.
	 * @see #setReservedBitAfterModDepth(byte)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartWithCommon_ReservedBitAfterModDepth()
	 * @model
	 * @generated
	 */
	byte getReservedBitAfterModDepth();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.PartWithCommon#getReservedBitAfterModDepth <em>Reserved Bit After Mod Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved Bit After Mod Depth</em>' attribute.
	 * @see #getReservedBitAfterModDepth()
	 * @generated
	 */
	void setReservedBitAfterModDepth(byte value);

	/**
	 * Returns the value of the '<em><b>Resonance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resonance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resonance</em>' attribute.
	 * @see #setResonance(byte)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartWithCommon_Resonance()
	 * @model
	 * @generated
	 */
	byte getResonance();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.PartWithCommon#getResonance <em>Resonance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resonance</em>' attribute.
	 * @see #getResonance()
	 * @generated
	 */
	void setResonance(byte value);

	/**
	 * Returns the value of the '<em><b>Roll</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.Roll}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roll</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roll</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.Roll
	 * @see #setRoll(Roll)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartWithCommon_Roll()
	 * @model
	 * @generated
	 */
	Roll getRoll();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.PartWithCommon#getRoll <em>Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roll</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.Roll
	 * @see #getRoll()
	 * @generated
	 */
	void setRoll(Roll value);

} // PartWithCommon

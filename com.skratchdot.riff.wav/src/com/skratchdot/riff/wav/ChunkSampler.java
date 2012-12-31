/*******************************************************************************
 * Copyright (c) 2009-2013 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 *******************************************************************************/
package com.skratchdot.riff.wav;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chunk Sampler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.ChunkSampler#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkSampler#getProduct <em>Product</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkSampler#getSamplePeriod <em>Sample Period</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkSampler#getMidiUnityNote <em>Midi Unity Note</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkSampler#getMidiPitchFraction <em>Midi Pitch Fraction</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkSampler#getSmpteFormat <em>Smpte Format</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkSampler#getSmpteOffset <em>Smpte Offset</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkSampler#getNumberOfSampleLoops <em>Number Of Sample Loops</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkSampler#getSamplerDataSize <em>Sampler Data Size</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkSampler#getSampleLoops <em>Sample Loops</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkSampler#getSamplerData <em>Sampler Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.riff.wav.WavPackage#getChunkSampler()
 * @model
 * @generated
 */
public interface ChunkSampler extends Chunk {
	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufacturer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacturer</em>' attribute.
	 * @see #setManufacturer(Long)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkSampler_Manufacturer()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedInt"
	 * @generated
	 */
	Long getManufacturer();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkSampler#getManufacturer <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' attribute.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(Long value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' attribute.
	 * @see #setProduct(Long)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkSampler_Product()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedInt"
	 * @generated
	 */
	Long getProduct();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkSampler#getProduct <em>Product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' attribute.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Long value);

	/**
	 * Returns the value of the '<em><b>Sample Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample Period</em>' attribute.
	 * @see #setSamplePeriod(Long)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkSampler_SamplePeriod()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedInt"
	 * @generated
	 */
	Long getSamplePeriod();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkSampler#getSamplePeriod <em>Sample Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample Period</em>' attribute.
	 * @see #getSamplePeriod()
	 * @generated
	 */
	void setSamplePeriod(Long value);

	/**
	 * Returns the value of the '<em><b>Midi Unity Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Midi Unity Note</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Midi Unity Note</em>' attribute.
	 * @see #setMidiUnityNote(Long)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkSampler_MidiUnityNote()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedInt"
	 * @generated
	 */
	Long getMidiUnityNote();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkSampler#getMidiUnityNote <em>Midi Unity Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Midi Unity Note</em>' attribute.
	 * @see #getMidiUnityNote()
	 * @generated
	 */
	void setMidiUnityNote(Long value);

	/**
	 * Returns the value of the '<em><b>Midi Pitch Fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Midi Pitch Fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Midi Pitch Fraction</em>' attribute.
	 * @see #setMidiPitchFraction(Long)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkSampler_MidiPitchFraction()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedInt"
	 * @generated
	 */
	Long getMidiPitchFraction();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkSampler#getMidiPitchFraction <em>Midi Pitch Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Midi Pitch Fraction</em>' attribute.
	 * @see #getMidiPitchFraction()
	 * @generated
	 */
	void setMidiPitchFraction(Long value);

	/**
	 * Returns the value of the '<em><b>Smpte Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Smpte Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smpte Format</em>' attribute.
	 * @see #setSmpteFormat(Long)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkSampler_SmpteFormat()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedInt"
	 * @generated
	 */
	Long getSmpteFormat();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkSampler#getSmpteFormat <em>Smpte Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smpte Format</em>' attribute.
	 * @see #getSmpteFormat()
	 * @generated
	 */
	void setSmpteFormat(Long value);

	/**
	 * Returns the value of the '<em><b>Smpte Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Smpte Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smpte Offset</em>' attribute.
	 * @see #setSmpteOffset(Long)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkSampler_SmpteOffset()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedInt"
	 * @generated
	 */
	Long getSmpteOffset();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkSampler#getSmpteOffset <em>Smpte Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smpte Offset</em>' attribute.
	 * @see #getSmpteOffset()
	 * @generated
	 */
	void setSmpteOffset(Long value);

	/**
	 * Returns the value of the '<em><b>Number Of Sample Loops</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Sample Loops</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Sample Loops</em>' attribute.
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkSampler_NumberOfSampleLoops()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedInt" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Long getNumberOfSampleLoops();

	/**
	 * Returns the value of the '<em><b>Sampler Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampler Data Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sampler Data Size</em>' attribute.
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkSampler_SamplerDataSize()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedInt" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Long getSamplerDataSize();

	/**
	 * Returns the value of the '<em><b>Sampler Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampler Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sampler Data</em>' attribute.
	 * @see #setSamplerData(byte[])
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkSampler_SamplerData()
	 * @model
	 * @generated
	 */
	byte[] getSamplerData();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkSampler#getSamplerData <em>Sampler Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sampler Data</em>' attribute.
	 * @see #getSamplerData()
	 * @generated
	 */
	void setSamplerData(byte[] value);

	/**
	 * Returns the value of the '<em><b>Sample Loops</b></em>' containment reference list.
	 * The list contents are of type {@link com.skratchdot.riff.wav.SampleLoop}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample Loops</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample Loops</em>' containment reference list.
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkSampler_SampleLoops()
	 * @model containment="true"
	 * @generated
	 */
	EList<SampleLoop> getSampleLoops();

} // ChunkSampler

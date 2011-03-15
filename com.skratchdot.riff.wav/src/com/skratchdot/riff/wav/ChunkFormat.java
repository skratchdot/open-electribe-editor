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
package com.skratchdot.riff.wav;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chunk Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.ChunkFormat#getCompressionCode <em>Compression Code</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkFormat#getCompressionCodeValue <em>Compression Code Value</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkFormat#getNumberOfChannels <em>Number Of Channels</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkFormat#getSampleRate <em>Sample Rate</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkFormat#getAverageBytesPerSecond <em>Average Bytes Per Second</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkFormat#getBlockAlign <em>Block Align</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkFormat#getSignificantBitsPerSample <em>Significant Bits Per Sample</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkFormat#getNumberOfExtraFormatBytes <em>Number Of Extra Format Bytes</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkFormat#getExtraFormatBytes <em>Extra Format Bytes</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.riff.wav.WavPackage#getChunkFormat()
 * @model
 * @generated
 */
public interface ChunkFormat extends Chunk {
	/**
	 * Returns the value of the '<em><b>Compression Code</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.riff.wav.CompressionCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compression Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compression Code</em>' attribute.
	 * @see com.skratchdot.riff.wav.CompressionCode
	 * @see #setCompressionCode(CompressionCode)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkFormat_CompressionCode()
	 * @model
	 * @generated
	 */
	CompressionCode getCompressionCode();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkFormat#getCompressionCode <em>Compression Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression Code</em>' attribute.
	 * @see com.skratchdot.riff.wav.CompressionCode
	 * @see #getCompressionCode()
	 * @generated
	 */
	void setCompressionCode(CompressionCode value);

	/**
	 * Returns the value of the '<em><b>Compression Code Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compression Code Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compression Code Value</em>' attribute.
	 * @see #setCompressionCodeValue(Integer)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkFormat_CompressionCodeValue()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedShort"
	 * @generated
	 */
	Integer getCompressionCodeValue();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkFormat#getCompressionCodeValue <em>Compression Code Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression Code Value</em>' attribute.
	 * @see #getCompressionCodeValue()
	 * @generated
	 */
	void setCompressionCodeValue(Integer value);

	/**
	 * Returns the value of the '<em><b>Number Of Channels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Channels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Channels</em>' attribute.
	 * @see #setNumberOfChannels(Integer)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkFormat_NumberOfChannels()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedShort"
	 * @generated
	 */
	Integer getNumberOfChannels();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkFormat#getNumberOfChannels <em>Number Of Channels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Channels</em>' attribute.
	 * @see #getNumberOfChannels()
	 * @generated
	 */
	void setNumberOfChannels(Integer value);

	/**
	 * Returns the value of the '<em><b>Sample Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample Rate</em>' attribute.
	 * @see #setSampleRate(Long)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkFormat_SampleRate()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedInt"
	 * @generated
	 */
	Long getSampleRate();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkFormat#getSampleRate <em>Sample Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample Rate</em>' attribute.
	 * @see #getSampleRate()
	 * @generated
	 */
	void setSampleRate(Long value);

	/**
	 * Returns the value of the '<em><b>Average Bytes Per Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Average Bytes Per Second</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average Bytes Per Second</em>' attribute.
	 * @see #setAverageBytesPerSecond(Long)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkFormat_AverageBytesPerSecond()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedInt"
	 * @generated
	 */
	Long getAverageBytesPerSecond();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkFormat#getAverageBytesPerSecond <em>Average Bytes Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average Bytes Per Second</em>' attribute.
	 * @see #getAverageBytesPerSecond()
	 * @generated
	 */
	void setAverageBytesPerSecond(Long value);

	/**
	 * Returns the value of the '<em><b>Block Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Align</em>' attribute.
	 * @see #setBlockAlign(Integer)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkFormat_BlockAlign()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedShort"
	 * @generated
	 */
	Integer getBlockAlign();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkFormat#getBlockAlign <em>Block Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Align</em>' attribute.
	 * @see #getBlockAlign()
	 * @generated
	 */
	void setBlockAlign(Integer value);

	/**
	 * Returns the value of the '<em><b>Significant Bits Per Sample</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Significant Bits Per Sample</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Significant Bits Per Sample</em>' attribute.
	 * @see #setSignificantBitsPerSample(Integer)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkFormat_SignificantBitsPerSample()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedShort"
	 * @generated
	 */
	Integer getSignificantBitsPerSample();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkFormat#getSignificantBitsPerSample <em>Significant Bits Per Sample</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Significant Bits Per Sample</em>' attribute.
	 * @see #getSignificantBitsPerSample()
	 * @generated
	 */
	void setSignificantBitsPerSample(Integer value);

	/**
	 * Returns the value of the '<em><b>Number Of Extra Format Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Extra Format Bytes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Extra Format Bytes</em>' attribute.
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkFormat_NumberOfExtraFormatBytes()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedShort" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Integer getNumberOfExtraFormatBytes();

	/**
	 * Returns the value of the '<em><b>Extra Format Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extra Format Bytes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Format Bytes</em>' attribute.
	 * @see #setExtraFormatBytes(byte[])
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkFormat_ExtraFormatBytes()
	 * @model
	 * @generated
	 */
	byte[] getExtraFormatBytes();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkFormat#getExtraFormatBytes <em>Extra Format Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extra Format Bytes</em>' attribute.
	 * @see #getExtraFormatBytes()
	 * @generated
	 */
	void setExtraFormatBytes(byte[] value);

} // ChunkFormat

/*******************************************************************************
 * Copyright (c) 2009-2013 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 *******************************************************************************/
package com.skratchdot.electribe.model.esx.tests;

import com.skratchdot.electribe.model.esx.EsxFactory;
import com.skratchdot.electribe.model.esx.Sample;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sample</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#getAudioDataChannelBoth() <em>Audio Data Channel Both</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#getAudioDataLoopStart() <em>Audio Data Loop Start</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#isLoop() <em>Loop</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#isSlice() <em>Slice</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#isStereoCurrent() <em>Stereo Current</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#getLabel() <em>Label</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#getMemUsedInBytes() <em>Mem Used In Bytes</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#isEmpty() <em>Empty</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#getPartCount() <em>Part Count</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#getPatternCount() <em>Pattern Count</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#getSampleInPatternInfoList() <em>Sample In Pattern Info List</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#getSampleNumberCurrent() <em>Sample Number Current</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#export(java.io.File) <em>Export</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#initHeaderMono(byte[]) <em>Init Header Mono</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#initHeaderMono(byte[], int) <em>Init Header Mono</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#initHeaderStereo(byte[]) <em>Init Header Stereo</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#initHeaderStereo(byte[], int) <em>Init Header Stereo</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#initOffsetChannel(byte[], com.skratchdot.electribe.model.esx.AudioChannelType) <em>Init Offset Channel</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#initSliceArray(byte[]) <em>Init Slice Array</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#toHeaderMonoByteArray() <em>To Header Mono Byte Array</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#toHeaderStereoByteArray() <em>To Header Stereo Byte Array</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#toOffsetChannelByteArray(com.skratchdot.electribe.model.esx.AudioChannelType) <em>To Offset Channel Byte Array</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#toSliceByteArray() <em>To Slice Byte Array</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#toRIFFWave() <em>To RIFF Wave</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#toRIFFWaveFile(java.io.File) <em>To RIFF Wave File</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SampleTest extends TestCase {

	/**
	 * The fixture for this Sample test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Sample fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SampleTest.class);
	}

	/**
	 * Constructs a new Sample test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampleTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Sample test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Sample fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Sample test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Sample getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EsxFactory.eINSTANCE.createSample());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.Sample#getAudioDataChannelBoth() <em>Audio Data Channel Both</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.Sample#getAudioDataChannelBoth()
	 * @generated
	 */
	public void testGetAudioDataChannelBoth() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.Sample#getAudioDataLoopStart() <em>Audio Data Loop Start</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.Sample#getAudioDataLoopStart()
	 * @generated
	 */
	public void testGetAudioDataLoopStart() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.Sample#getMemUsedInBytes() <em>Mem Used In Bytes</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.Sample#getMemUsedInBytes()
	 * @generated
	 */
	public void testGetMemUsedInBytes() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.Sample#isEmpty() <em>Empty</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.Sample#isEmpty()
	 * @generated
	 */
	public void testIsEmpty() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.Sample#getPartCount() <em>Part Count</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.Sample#getPartCount()
	 * @generated
	 */
	public void testGetPartCount() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.Sample#getPatternCount() <em>Pattern Count</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.Sample#getPatternCount()
	 * @generated
	 */
	public void testGetPatternCount() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.Sample#getSampleInPatternInfoList() <em>Sample In Pattern Info List</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.Sample#getSampleInPatternInfoList()
	 * @generated
	 */
	public void testGetSampleInPatternInfoList() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.Sample#getSampleNumberCurrent() <em>Sample Number Current</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.Sample#getSampleNumberCurrent()
	 * @generated
	 */
	public void testGetSampleNumberCurrent() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.Sample#export(java.io.File) <em>Export</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.Sample#export(java.io.File)
	 * @generated
	 */
	public void testExport__File() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.Sample#initHeaderMono(byte[]) <em>Init Header Mono</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.Sample#initHeaderMono(byte[])
	 * @generated
	 */
	public void testInitHeaderMono__byte() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.Sample#initHeaderMono(byte[], int) <em>Init Header Mono</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.Sample#initHeaderMono(byte[], int)
	 * @generated
	 */
	public void testInitHeaderMono__byte_int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.Sample#initHeaderStereo(byte[]) <em>Init Header Stereo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.Sample#initHeaderStereo(byte[])
	 * @generated
	 */
	public void testInitHeaderStereo__byte() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.Sample#initHeaderStereo(byte[], int) <em>Init Header Stereo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.Sample#initHeaderStereo(byte[], int)
	 * @generated
	 */
	public void testInitHeaderStereo__byte_int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.Sample#initOffsetChannel(byte[], com.skratchdot.electribe.model.esx.AudioChannelType) <em>Init Offset Channel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.Sample#initOffsetChannel(byte[], com.skratchdot.electribe.model.esx.AudioChannelType)
	 * @generated
	 */
	public void testInitOffsetChannel__byte_AudioChannelType() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.Sample#initSliceArray(byte[]) <em>Init Slice Array</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.Sample#initSliceArray(byte[])
	 * @generated
	 */
	public void testInitSliceArray__byte() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.Sample#toHeaderMonoByteArray() <em>To Header Mono Byte Array</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.Sample#toHeaderMonoByteArray()
	 * @generated
	 */
	public void testToHeaderMonoByteArray() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.Sample#toHeaderStereoByteArray() <em>To Header Stereo Byte Array</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.Sample#toHeaderStereoByteArray()
	 * @generated
	 */
	public void testToHeaderStereoByteArray() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.Sample#toOffsetChannelByteArray(com.skratchdot.electribe.model.esx.AudioChannelType) <em>To Offset Channel Byte Array</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.Sample#toOffsetChannelByteArray(com.skratchdot.electribe.model.esx.AudioChannelType)
	 * @generated
	 */
	public void testToOffsetChannelByteArray__AudioChannelType() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.Sample#toSliceByteArray() <em>To Slice Byte Array</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.Sample#toSliceByteArray()
	 * @generated
	 */
	public void testToSliceByteArray() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.Sample#toRIFFWave() <em>To RIFF Wave</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.Sample#toRIFFWave()
	 * @generated
	 */
	public void testToRIFFWave() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.Sample#toRIFFWaveFile(java.io.File) <em>To RIFF Wave File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.Sample#toRIFFWaveFile(java.io.File)
	 * @generated
	 */
	public void testToRIFFWaveFile__File() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.Sample#isLoop() <em>Loop</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.Sample#isLoop()
	 * @generated
	 */
	public void testIsLoop() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.Sample#isSlice() <em>Slice</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.Sample#isSlice()
	 * @generated
	 */
	public void testIsSlice() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.Sample#isStereoCurrent() <em>Stereo Current</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.Sample#isStereoCurrent()
	 * @generated
	 */
	public void testIsStereoCurrent() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.Sample#getLabel() <em>Label</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.Sample#getLabel()
	 * @generated
	 */
	public void testGetLabel() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //SampleTest

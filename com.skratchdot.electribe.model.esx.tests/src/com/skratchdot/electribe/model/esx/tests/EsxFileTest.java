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
import com.skratchdot.electribe.model.esx.EsxFile;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getMemUsedInBytes() <em>Mem Used In Bytes</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getMemUsedInSeconds() <em>Mem Used In Seconds</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getMemFreeInBytes() <em>Mem Free In Bytes</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getMemFreeInSeconds() <em>Mem Free In Seconds</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getNumPatternsEmpty() <em>Num Patterns Empty</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getNumPatternsNotEmpty() <em>Num Patterns Not Empty</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesEmpty() <em>Num Samples Empty</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesNotEmpty() <em>Num Samples Not Empty</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesMonoEmpty() <em>Num Samples Mono Empty</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesMonoNotEmpty() <em>Num Samples Mono Not Empty</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesStereoEmpty() <em>Num Samples Stereo Empty</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesStereoNotEmpty() <em>Num Samples Stereo Not Empty</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getNumSongsEmpty() <em>Num Songs Empty</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getNumSongsNotEmpty() <em>Num Songs Not Empty</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getPatternFromPointer(int) <em>Get Pattern From Pointer</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getSampleFromPointer(int) <em>Get Sample From Pointer</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#init(byte[]) <em>Init</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#init(byte[], org.eclipse.core.runtime.IProgressMonitor) <em>Init</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#setAllOffsets() <em>Set All Offsets</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#toByteArray() <em>To Byte Array</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#toByteArray(org.eclipse.core.runtime.IProgressMonitor) <em>To Byte Array</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#validMemFreeInBytes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Mem Free In Bytes</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class EsxFileTest extends TestCase {

	/**
	 * The fixture for this File test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EsxFile fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EsxFileTest.class);
	}

	/**
	 * Constructs a new File test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EsxFileTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this File test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(EsxFile fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this File test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EsxFile getFixture() {
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
		setFixture(EsxFactory.eINSTANCE.createEsxFile());
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
	 * Tests the '{@link com.skratchdot.electribe.model.esx.EsxFile#getMemUsedInBytes() <em>Mem Used In Bytes</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getMemUsedInBytes()
	 * @generated
	 */
	public void testGetMemUsedInBytes() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.EsxFile#getMemUsedInSeconds() <em>Mem Used In Seconds</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getMemUsedInSeconds()
	 * @generated
	 */
	public void testGetMemUsedInSeconds() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.EsxFile#getMemFreeInBytes() <em>Mem Free In Bytes</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getMemFreeInBytes()
	 * @generated
	 */
	public void testGetMemFreeInBytes() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.EsxFile#getMemFreeInSeconds() <em>Mem Free In Seconds</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getMemFreeInSeconds()
	 * @generated
	 */
	public void testGetMemFreeInSeconds() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.EsxFile#getNumPatternsEmpty() <em>Num Patterns Empty</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getNumPatternsEmpty()
	 * @generated
	 */
	public void testGetNumPatternsEmpty() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.EsxFile#getNumPatternsNotEmpty() <em>Num Patterns Not Empty</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getNumPatternsNotEmpty()
	 * @generated
	 */
	public void testGetNumPatternsNotEmpty() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesEmpty() <em>Num Samples Empty</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesEmpty()
	 * @generated
	 */
	public void testGetNumSamplesEmpty() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesNotEmpty() <em>Num Samples Not Empty</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesNotEmpty()
	 * @generated
	 */
	public void testGetNumSamplesNotEmpty() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesMonoEmpty() <em>Num Samples Mono Empty</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesMonoEmpty()
	 * @generated
	 */
	public void testGetNumSamplesMonoEmpty() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesMonoNotEmpty() <em>Num Samples Mono Not Empty</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesMonoNotEmpty()
	 * @generated
	 */
	public void testGetNumSamplesMonoNotEmpty() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesStereoEmpty() <em>Num Samples Stereo Empty</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesStereoEmpty()
	 * @generated
	 */
	public void testGetNumSamplesStereoEmpty() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesStereoNotEmpty() <em>Num Samples Stereo Not Empty</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesStereoNotEmpty()
	 * @generated
	 */
	public void testGetNumSamplesStereoNotEmpty() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.EsxFile#getNumSongsEmpty() <em>Num Songs Empty</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getNumSongsEmpty()
	 * @generated
	 */
	public void testGetNumSongsEmpty() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.EsxFile#getNumSongsNotEmpty() <em>Num Songs Not Empty</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getNumSongsNotEmpty()
	 * @generated
	 */
	public void testGetNumSongsNotEmpty() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.EsxFile#getPatternFromPointer(int) <em>Get Pattern From Pointer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getPatternFromPointer(int)
	 * @generated
	 */
	public void testGetPatternFromPointer__int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.EsxFile#getSampleFromPointer(int) <em>Get Sample From Pointer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.EsxFile#getSampleFromPointer(int)
	 * @generated
	 */
	public void testGetSampleFromPointer__int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.EsxFile#init(byte[]) <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.EsxFile#init(byte[])
	 * @generated
	 */
	public void testInit__byte() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.EsxFile#init(byte[], org.eclipse.core.runtime.IProgressMonitor) <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.EsxFile#init(byte[], org.eclipse.core.runtime.IProgressMonitor)
	 * @generated
	 */
	public void testInit__byte_IProgressMonitor() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.EsxFile#setAllOffsets() <em>Set All Offsets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.EsxFile#setAllOffsets()
	 * @generated
	 */
	public void testSetAllOffsets() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.EsxFile#toByteArray() <em>To Byte Array</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.EsxFile#toByteArray()
	 * @generated
	 */
	public void testToByteArray() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.EsxFile#toByteArray(org.eclipse.core.runtime.IProgressMonitor) <em>To Byte Array</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.EsxFile#toByteArray(org.eclipse.core.runtime.IProgressMonitor)
	 * @generated
	 */
	public void testToByteArray__IProgressMonitor() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.skratchdot.electribe.model.esx.EsxFile#validMemFreeInBytes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Mem Free In Bytes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.electribe.model.esx.EsxFile#validMemFreeInBytes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidMemFreeInBytes__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //EsxFileTest

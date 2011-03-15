/**
 * Copyright (c) 2009-2011 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    JEFF |:at:| SKRATCHDOT |:dot:| COM
 *
 * $Id$
 */
package com.skratchdot.electribe.model.esx.tests;

import com.skratchdot.electribe.model.esx.EsxFactory;
import com.skratchdot.electribe.model.esx.MidiChannelType;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Midi Channel Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MidiChannelTypeTest extends TestCase {

	/**
	 * The fixture for this Midi Channel Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MidiChannelType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MidiChannelTypeTest.class);
	}

	/**
	 * Constructs a new Midi Channel Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MidiChannelTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Midi Channel Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MidiChannelType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Midi Channel Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MidiChannelType getFixture() {
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
		setFixture(EsxFactory.eINSTANCE.createMidiChannelType());
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

} //MidiChannelTypeTest

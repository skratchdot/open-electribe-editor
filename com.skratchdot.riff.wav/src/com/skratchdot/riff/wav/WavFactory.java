/**
 * Copyright (c) 2009, 2012 SKRATCHDOT.COM
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

import java.io.File;

import org.eclipse.emf.ecore.EFactory;

import com.skratchdot.riff.wav.util.RiffWaveException;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.skratchdot.riff.wav.WavPackage
 * @generated
 */
public interface WavFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WavFactory eINSTANCE = com.skratchdot.riff.wav.impl.WavFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>RIFF Wave</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RIFF Wave</em>'.
	 * @generated
	 */
	RIFFWave createRIFFWave();

	/**
	 * Returns a new object of class '<em>RIFF Wave</em>'.
	 * @param file a valid RIFF Wave File
	 * @return a new object of class '<em>RIFF Wave</em>'.
	 * @throws RiffWaveException
	 */
	RIFFWave createRIFFWave(File file) throws RiffWaveException;

	/**
	 * Returns a new object of class '<em>Channel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Channel</em>'.
	 * @generated
	 */
	Channel createChannel();

	/**
	 * Returns a new object of class '<em>Chunk Cue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chunk Cue</em>'.
	 * @generated
	 */
	ChunkCue createChunkCue();

	/**
	 * Returns a new object of class '<em>Chunk Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chunk Data</em>'.
	 * @generated
	 */
	ChunkData createChunkData();

	/**
	 * Returns a new object of class '<em>Chunk Data List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chunk Data List</em>'.
	 * @generated
	 */
	ChunkDataList createChunkDataList();

	/**
	 * Returns a new object of class '<em>Chunk Data List Type Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chunk Data List Type Label</em>'.
	 * @generated
	 */
	ChunkDataListTypeLabel createChunkDataListTypeLabel();

	/**
	 * Returns a new object of class '<em>Chunk Data List Type Labeled Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chunk Data List Type Labeled Text</em>'.
	 * @generated
	 */
	ChunkDataListTypeLabeledText createChunkDataListTypeLabeledText();

	/**
	 * Returns a new object of class '<em>Chunk Data List Type Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chunk Data List Type Note</em>'.
	 * @generated
	 */
	ChunkDataListTypeNote createChunkDataListTypeNote();

	/**
	 * Returns a new object of class '<em>Chunk Fact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chunk Fact</em>'.
	 * @generated
	 */
	ChunkFact createChunkFact();

	/**
	 * Returns a new object of class '<em>Chunk Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chunk Format</em>'.
	 * @generated
	 */
	ChunkFormat createChunkFormat();

	/**
	 * Returns a new object of class '<em>Chunk Instrument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chunk Instrument</em>'.
	 * @generated
	 */
	ChunkInstrument createChunkInstrument();

	/**
	 * Returns a new object of class '<em>Chunk Play List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chunk Play List</em>'.
	 * @generated
	 */
	ChunkPlayList createChunkPlayList();

	/**
	 * Returns a new object of class '<em>Chunk Sampler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chunk Sampler</em>'.
	 * @generated
	 */
	ChunkSampler createChunkSampler();

	/**
	 * Returns a new object of class '<em>Chunk Silent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chunk Silent</em>'.
	 * @generated
	 */
	ChunkSilent createChunkSilent();

	/**
	 * Returns a new object of class '<em>Chunk Unknown</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chunk Unknown</em>'.
	 * @generated
	 */
	ChunkUnknown createChunkUnknown();

	/**
	 * Returns a new object of class '<em>Chunk Wave List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chunk Wave List</em>'.
	 * @generated
	 */
	ChunkWaveList createChunkWaveList();

	/**
	 * Returns a new object of class '<em>Cue Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cue Point</em>'.
	 * @generated
	 */
	CuePoint createCuePoint();

	/**
	 * Returns a new object of class '<em>Parse Chunk Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parse Chunk Exception</em>'.
	 * @generated
	 */
	ParseChunkException createParseChunkException();

	/**
	 * Returns a new object of class '<em>Sample Data8 Bit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sample Data8 Bit</em>'.
	 * @generated
	 */
	SampleData8Bit createSampleData8Bit();

	/**
	 * Returns a new object of class '<em>Sample Data16 Bit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sample Data16 Bit</em>'.
	 * @generated
	 */
	SampleData16Bit createSampleData16Bit();

	/**
	 * Returns a new object of class '<em>Sample Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sample Loop</em>'.
	 * @generated
	 */
	SampleLoop createSampleLoop();

	/**
	 * Returns a new object of class '<em>Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Segment</em>'.
	 * @generated
	 */
	Segment createSegment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WavPackage getWavPackage();
	
} //WavFactory

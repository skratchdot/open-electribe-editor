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

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;

import com.skratchdot.electribe.model.esx.EsxFactory;
import com.skratchdot.electribe.model.esx.EsxFile;
import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.PlayLevel;
import com.skratchdot.electribe.model.esx.Sample;
import com.skratchdot.electribe.model.esx.SampleNumber;
import com.skratchdot.electribe.model.esx.SampleTune;
import com.skratchdot.electribe.model.esx.StretchStep;
import com.skratchdot.electribe.model.esx.util.EsxException;
import com.skratchdot.electribe.model.esx.util.EsxUtil;
import com.skratchdot.electribe.model.esx.util.ExtendedByteBuffer;
import com.skratchdot.riff.wav.ChunkData;
import com.skratchdot.riff.wav.ChunkFormat;
import com.skratchdot.riff.wav.ChunkSampler;
import com.skratchdot.riff.wav.CompressionCode;
import com.skratchdot.riff.wav.RIFFWave;
import com.skratchdot.riff.wav.SampleLoop;
import com.skratchdot.riff.wav.WavFactory;
import com.skratchdot.riff.wav.WavPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sample</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SampleImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SampleImpl#getOffsetChannel1Start <em>Offset Channel1 Start</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SampleImpl#getOffsetChannel1End <em>Offset Channel1 End</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SampleImpl#getOffsetChannel2Start <em>Offset Channel2 Start</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SampleImpl#getOffsetChannel2End <em>Offset Channel2 End</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SampleImpl#getStart <em>Start</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SampleImpl#getEnd <em>End</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SampleImpl#getLoopStart <em>Loop Start</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SampleImpl#getSampleRate <em>Sample Rate</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SampleImpl#getSampleTune <em>Sample Tune</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SampleImpl#getNumberOfSampleFrames <em>Number Of Sample Frames</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SampleImpl#getPlayLevel <em>Play Level</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SampleImpl#getUnknownByte1 <em>Unknown Byte1</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SampleImpl#getStretchStep <em>Stretch Step</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SampleImpl#getUnknownByte2 <em>Unknown Byte2</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SampleImpl#getUnknownByte3 <em>Unknown Byte3</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SampleImpl#getUnknownByte4 <em>Unknown Byte4</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SampleImpl#getAudioDataChannel1 <em>Audio Data Channel1</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SampleImpl#getAudioDataChannel2 <em>Audio Data Channel2</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SampleImpl#getAudioDataChannelBoth <em>Audio Data Channel Both</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SampleImpl#getAudioDataLoopStart <em>Audio Data Loop Start</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SampleImpl#getSliceArray <em>Slice Array</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SampleImpl#isLoop <em>Loop</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SampleImpl#isSlice <em>Slice</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SampleImpl#isStereoOriginal <em>Stereo Original</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SampleImpl#isStereoCurrent <em>Stereo Current</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SampleImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SampleImpl#getMemUsedInBytes <em>Mem Used In Bytes</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SampleImpl#isEmpty <em>Empty</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SampleImpl#getSampleNumberOriginal <em>Sample Number Original</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.impl.SampleImpl#getSampleNumberCurrent <em>Sample Number Current</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SampleImpl extends EObjectImpl implements Sample {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffsetChannel1Start() <em>Offset Channel1 Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetChannel1Start()
	 * @generated
	 * @ordered
	 */
	protected static final int OFFSET_CHANNEL1_START_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOffsetChannel1Start() <em>Offset Channel1 Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetChannel1Start()
	 * @generated
	 * @ordered
	 */
	protected int offsetChannel1Start = OFFSET_CHANNEL1_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffsetChannel1End() <em>Offset Channel1 End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetChannel1End()
	 * @generated
	 * @ordered
	 */
	protected static final int OFFSET_CHANNEL1_END_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOffsetChannel1End() <em>Offset Channel1 End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetChannel1End()
	 * @generated
	 * @ordered
	 */
	protected int offsetChannel1End = OFFSET_CHANNEL1_END_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffsetChannel2Start() <em>Offset Channel2 Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetChannel2Start()
	 * @generated
	 * @ordered
	 */
	protected static final int OFFSET_CHANNEL2_START_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOffsetChannel2Start() <em>Offset Channel2 Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetChannel2Start()
	 * @generated
	 * @ordered
	 */
	protected int offsetChannel2Start = OFFSET_CHANNEL2_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffsetChannel2End() <em>Offset Channel2 End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetChannel2End()
	 * @generated
	 * @ordered
	 */
	protected static final int OFFSET_CHANNEL2_END_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOffsetChannel2End() <em>Offset Channel2 End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetChannel2End()
	 * @generated
	 * @ordered
	 */
	protected int offsetChannel2End = OFFSET_CHANNEL2_END_EDEFAULT;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final int START_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected int start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final int END_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected int end = END_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoopStart() <em>Loop Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopStart()
	 * @generated
	 * @ordered
	 */
	protected static final int LOOP_START_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLoopStart() <em>Loop Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopStart()
	 * @generated
	 * @ordered
	 */
	protected int loopStart = LOOP_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getSampleRate() <em>Sample Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleRate()
	 * @generated
	 * @ordered
	 */
	protected static final int SAMPLE_RATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSampleRate() <em>Sample Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleRate()
	 * @generated
	 * @ordered
	 */
	protected int sampleRate = SAMPLE_RATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSampleTune() <em>Sample Tune</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleTune()
	 * @generated
	 * @ordered
	 */
	protected SampleTune sampleTune;

	/**
	 * The default value of the '{@link #getNumberOfSampleFrames() <em>Number Of Sample Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSampleFrames()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_SAMPLE_FRAMES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfSampleFrames() <em>Number Of Sample Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSampleFrames()
	 * @generated
	 * @ordered
	 */
	protected int numberOfSampleFrames = NUMBER_OF_SAMPLE_FRAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlayLevel() <em>Play Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayLevel()
	 * @generated
	 * @ordered
	 */
	protected static final PlayLevel PLAY_LEVEL_EDEFAULT = PlayLevel.DB_0;

	/**
	 * The cached value of the '{@link #getPlayLevel() <em>Play Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayLevel()
	 * @generated
	 * @ordered
	 */
	protected PlayLevel playLevel = PLAY_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnknownByte1() <em>Unknown Byte1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnknownByte1()
	 * @generated
	 * @ordered
	 */
	protected static final byte UNKNOWN_BYTE1_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getUnknownByte1() <em>Unknown Byte1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnknownByte1()
	 * @generated
	 * @ordered
	 */
	protected byte unknownByte1 = UNKNOWN_BYTE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getStretchStep() <em>Stretch Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStretchStep()
	 * @generated
	 * @ordered
	 */
	protected static final StretchStep STRETCH_STEP_EDEFAULT = StretchStep.STRETCH_STEP_OFF;

	/**
	 * The cached value of the '{@link #getStretchStep() <em>Stretch Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStretchStep()
	 * @generated
	 * @ordered
	 */
	protected StretchStep stretchStep = STRETCH_STEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnknownByte2() <em>Unknown Byte2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnknownByte2()
	 * @generated
	 * @ordered
	 */
	protected static final byte UNKNOWN_BYTE2_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getUnknownByte2() <em>Unknown Byte2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnknownByte2()
	 * @generated
	 * @ordered
	 */
	protected byte unknownByte2 = UNKNOWN_BYTE2_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnknownByte3() <em>Unknown Byte3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnknownByte3()
	 * @generated
	 * @ordered
	 */
	protected static final byte UNKNOWN_BYTE3_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getUnknownByte3() <em>Unknown Byte3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnknownByte3()
	 * @generated
	 * @ordered
	 */
	protected byte unknownByte3 = UNKNOWN_BYTE3_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnknownByte4() <em>Unknown Byte4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnknownByte4()
	 * @generated
	 * @ordered
	 */
	protected static final byte UNKNOWN_BYTE4_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getUnknownByte4() <em>Unknown Byte4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnknownByte4()
	 * @generated
	 * @ordered
	 */
	protected byte unknownByte4 = UNKNOWN_BYTE4_EDEFAULT;

	/**
	 * The default value of the '{@link #getAudioDataChannel1() <em>Audio Data Channel1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudioDataChannel1()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] AUDIO_DATA_CHANNEL1_EDEFAULT = {};

	/**
	 * The cached value of the '{@link #getAudioDataChannel1() <em>Audio Data Channel1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudioDataChannel1()
	 * @generated
	 * @ordered
	 */
	protected byte[] audioDataChannel1 = AUDIO_DATA_CHANNEL1_EDEFAULT;

	/**
	 * The default value of the '{@link #getAudioDataChannel2() <em>Audio Data Channel2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudioDataChannel2()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] AUDIO_DATA_CHANNEL2_EDEFAULT = {};

	/**
	 * The cached value of the '{@link #getAudioDataChannel2() <em>Audio Data Channel2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudioDataChannel2()
	 * @generated
	 * @ordered
	 */
	protected byte[] audioDataChannel2 = AUDIO_DATA_CHANNEL2_EDEFAULT;

	/**
	 * The default value of the '{@link #getAudioDataChannelBoth() <em>Audio Data Channel Both</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudioDataChannelBoth()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] AUDIO_DATA_CHANNEL_BOTH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAudioDataLoopStart() <em>Audio Data Loop Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudioDataLoopStart()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] AUDIO_DATA_LOOP_START_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSliceArray() <em>Slice Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSliceArray()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] SLICE_ARRAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSliceArray() <em>Slice Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSliceArray()
	 * @generated
	 * @ordered
	 */
	protected byte[] sliceArray = SLICE_ARRAY_EDEFAULT;

	/**
	 * The default value of the '{@link #isLoop() <em>Loop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoop()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOOP_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isSlice() <em>Slice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSlice()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SLICE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isStereoOriginal() <em>Stereo Original</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStereoOriginal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STEREO_ORIGINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStereoOriginal() <em>Stereo Original</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStereoOriginal()
	 * @generated
	 * @ordered
	 */
	protected boolean stereoOriginal = STEREO_ORIGINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isStereoCurrent() <em>Stereo Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStereoCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STEREO_CURRENT_EDEFAULT = true;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = "true";

	/**
	 * The default value of the '{@link #getMemUsedInBytes() <em>Mem Used In Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemUsedInBytes()
	 * @generated
	 * @ordered
	 */
	protected static final int MEM_USED_IN_BYTES_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #isEmpty() <em>Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EMPTY_EDEFAULT = true;

	/**
	 * The default value of the '{@link #getSampleNumberOriginal() <em>Sample Number Original</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleNumberOriginal()
	 * @generated
	 * @ordered
	 */
	protected static final SampleNumber SAMPLE_NUMBER_ORIGINAL_EDEFAULT = SampleNumber.SAMPLE_OFF;

	/**
	 * The cached value of the '{@link #getSampleNumberOriginal() <em>Sample Number Original</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleNumberOriginal()
	 * @generated
	 * @ordered
	 */
	protected SampleNumber sampleNumberOriginal = SAMPLE_NUMBER_ORIGINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSampleNumberCurrent() <em>Sample Number Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleNumberCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final SampleNumber SAMPLE_NUMBER_CURRENT_EDEFAULT = SampleNumber.SAMPLE_OFF;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected SampleImpl() {
		super();
		init();
	}

	/**
	 * @param file
	 * @throws EsxException
	 */
	protected SampleImpl(File file) throws EsxException {
		super();
		init();
		
		// Declare our streams and formats
		AudioFormat audioFormatEncoded;
		AudioFormat audioFormatDecoded;
		AudioInputStream audioInputStreamEncoded;
		AudioInputStream audioInputStreamDecoded;

		try {
			// Initialize our streams and formats
			audioInputStreamEncoded = AudioSystem.getAudioInputStream(file);
			audioFormatEncoded = audioInputStreamEncoded.getFormat();
			audioFormatDecoded = new AudioFormat(
					AudioFormat.Encoding.PCM_SIGNED,
					audioFormatEncoded.getSampleRate(),
					16,
					audioFormatEncoded.getChannels(),
					audioFormatEncoded.getChannels()*2,
					audioFormatEncoded.getSampleRate(),
					true
				);
			audioInputStreamDecoded = AudioSystem.getAudioInputStream(
				audioFormatDecoded,
				audioInputStreamEncoded
			);

			// We have a decoded stereo audio stream
			// Now we need to get the stream info into a list we can manipulate
			byte[] audioData = new byte[4096];
			int nBytesRead = 0;
			long nTotalBytesRead = 0;
			List<Byte> audioDataListChannel1 = new ArrayList<Byte>();
			List<Byte> audioDataListChannel2 = new ArrayList<Byte>();
			boolean isAudioDataStereo = false;

			// Set isAudioDataStereo
			if(audioFormatEncoded.getChannels()==1) {
				isAudioDataStereo = false;
			}
			else if(audioFormatEncoded.getChannels()==2) {
				isAudioDataStereo = true;
			}
			else {
				throw new EsxException("Sample has too many channels: " + file.getAbsolutePath());
			}

			// Convert stream to list. This needs to be optimized. Converting
			// a byte at a time is probably too slow...
			while(nBytesRead>=0) {
				nBytesRead = audioInputStreamDecoded.read(audioData, 0, audioData.length);

				// If we aren't at the end of the stream
				if(nBytesRead>0) {
					for(int i=0; i<nBytesRead; i++) {
						// MONO
						if(!isAudioDataStereo) {
							audioDataListChannel1.add(audioData[i]);
							audioDataListChannel2.add(audioData[i]);
						}
						// STEREO (LEFT)
						else if(nTotalBytesRead%4<2) {
							audioDataListChannel1.add(audioData[i]);
						}
						// STEREO (RIGHT)
						else {
							audioDataListChannel2.add(audioData[i]);
						}

						// Update the total amount of bytes we've read
						nTotalBytesRead++;
					}
				}

				// Throw Exception if sample is too big
				if(nTotalBytesRead>EsxUtil.MAX_SAMPLE_MEM_IN_BYTES) {
					throw new EsxException("Sample is too big: " + file.getAbsolutePath());
				}
			}

			// Set member variables
			int frameLength = audioDataListChannel1.size()/2;
			this.setNumberOfSampleFrames(frameLength);
			this.setEnd(frameLength-1);
			this.setLoopStart(frameLength-1);
			this.setSampleRate((int) audioFormatEncoded.getSampleRate());
			this.setAudioDataChannel1(EsxUtil.listToByteArray(audioDataListChannel1));
			this.setAudioDataChannel2(EsxUtil.listToByteArray(audioDataListChannel2));
			this.setStereoOriginal(isAudioDataStereo);

			// Set calculated Sample Tune (from Sample Rate)
			SampleTune newSampleTune = EsxFactory.eINSTANCE.createSampleTune();
			float newFloat = newSampleTune.calculateSampleTuneFromSampleRate(this.getSampleRate());
			newSampleTune.setValue(newFloat);
			this.setSampleTune(newSampleTune);

			// Set name
			String newSampleName = new String();
			newSampleName = StringUtils.left(StringUtils.trim(file.getName()), 8);
			this.setName(newSampleName);

			// Attempt to set loopStart and End from .wav smpl chunk
			if(file.getAbsolutePath().toLowerCase().endsWith(".wav")) {
				try {
					RIFFWave riffWave = WavFactory.eINSTANCE.createRIFFWave(file);
					ChunkSampler chunkSampler = (ChunkSampler) riffWave.getFirstChunkByEClass(WavPackage.Literals.CHUNK_SAMPLER);
					if(chunkSampler!=null && chunkSampler.getSampleLoops().size()>0) {
						SampleLoop sampleLoop = chunkSampler.getSampleLoops().get(0);
						Long tempLoopStart = sampleLoop.getStart();
						Long tempLoopEnd = sampleLoop.getEnd();
						if(tempLoopStart<this.getEnd() && tempLoopStart>=0) {
							this.setLoopStart(tempLoopStart.intValue());
						}
						if(tempLoopEnd<this.getEnd() && tempLoopEnd>this.getLoopStart()) {
							this.setEnd(tempLoopEnd.intValue());
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
			throw new EsxException("Invalid audio file: " + file.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
			throw new EsxException("Invalid audio file: " + file.getAbsolutePath());
		} catch (Exception e) {
			e.printStackTrace();
			throw new EsxException("Invalid audio file: " + file.getAbsolutePath());
		}
	}
	
	/**
	 * Perform any initializations required.
	 */
	protected void init() {
		SampleTune newSampleTune = EsxFactory.eINSTANCE.createSampleTune();
		this.setSampleTune(newSampleTune);
		this.setName(new String(""));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsxPackage.Literals.SAMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SAMPLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOffsetChannel1Start() {
		return offsetChannel1Start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffsetChannel1Start(int newOffsetChannel1Start) {
		int oldOffsetChannel1Start = offsetChannel1Start;
		offsetChannel1Start = newOffsetChannel1Start;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SAMPLE__OFFSET_CHANNEL1_START, oldOffsetChannel1Start, offsetChannel1Start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOffsetChannel1End() {
		return offsetChannel1End;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffsetChannel1End(int newOffsetChannel1End) {
		int oldOffsetChannel1End = offsetChannel1End;
		offsetChannel1End = newOffsetChannel1End;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SAMPLE__OFFSET_CHANNEL1_END, oldOffsetChannel1End, offsetChannel1End));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOffsetChannel2Start() {
		return offsetChannel2Start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffsetChannel2Start(int newOffsetChannel2Start) {
		int oldOffsetChannel2Start = offsetChannel2Start;
		offsetChannel2Start = newOffsetChannel2Start;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SAMPLE__OFFSET_CHANNEL2_START, oldOffsetChannel2Start, offsetChannel2Start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOffsetChannel2End() {
		return offsetChannel2End;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffsetChannel2End(int newOffsetChannel2End) {
		int oldOffsetChannel2End = offsetChannel2End;
		offsetChannel2End = newOffsetChannel2End;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SAMPLE__OFFSET_CHANNEL2_END, oldOffsetChannel2End, offsetChannel2End));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(int newStart) {
		int oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SAMPLE__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(int newEnd) {
		int oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SAMPLE__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLoopStart() {
		return loopStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopStart(int newLoopStart) {
		int oldLoopStart = loopStart;
		loopStart = newLoopStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SAMPLE__LOOP_START, oldLoopStart, loopStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSampleRate() {
		return sampleRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSampleRate(int newSampleRate) {
		int oldSampleRate = sampleRate;
		sampleRate = newSampleRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SAMPLE__SAMPLE_RATE, oldSampleRate, sampleRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampleTune getSampleTune() {
		return sampleTune;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSampleTune(SampleTune newSampleTune, NotificationChain msgs) {
		SampleTune oldSampleTune = sampleTune;
		sampleTune = newSampleTune;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsxPackage.SAMPLE__SAMPLE_TUNE, oldSampleTune, newSampleTune);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSampleTune(SampleTune newSampleTune) {
		if (newSampleTune != sampleTune) {
			NotificationChain msgs = null;
			if (sampleTune != null)
				msgs = ((InternalEObject)sampleTune).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsxPackage.SAMPLE__SAMPLE_TUNE, null, msgs);
			if (newSampleTune != null)
				msgs = ((InternalEObject)newSampleTune).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsxPackage.SAMPLE__SAMPLE_TUNE, null, msgs);
			msgs = basicSetSampleTune(newSampleTune, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SAMPLE__SAMPLE_TUNE, newSampleTune, newSampleTune));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfSampleFrames() {
		return numberOfSampleFrames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfSampleFrames(int newNumberOfSampleFrames) {
		int oldNumberOfSampleFrames = numberOfSampleFrames;
		numberOfSampleFrames = newNumberOfSampleFrames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SAMPLE__NUMBER_OF_SAMPLE_FRAMES, oldNumberOfSampleFrames, numberOfSampleFrames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayLevel getPlayLevel() {
		return playLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlayLevel(PlayLevel newPlayLevel) {
		PlayLevel oldPlayLevel = playLevel;
		playLevel = newPlayLevel == null ? PLAY_LEVEL_EDEFAULT : newPlayLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SAMPLE__PLAY_LEVEL, oldPlayLevel, playLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getUnknownByte1() {
		return unknownByte1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnknownByte1(byte newUnknownByte1) {
		byte oldUnknownByte1 = unknownByte1;
		unknownByte1 = newUnknownByte1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SAMPLE__UNKNOWN_BYTE1, oldUnknownByte1, unknownByte1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StretchStep getStretchStep() {
		return stretchStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStretchStep(StretchStep newStretchStep) {
		StretchStep oldStretchStep = stretchStep;
		stretchStep = newStretchStep == null ? STRETCH_STEP_EDEFAULT : newStretchStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SAMPLE__STRETCH_STEP, oldStretchStep, stretchStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getUnknownByte2() {
		return unknownByte2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnknownByte2(byte newUnknownByte2) {
		byte oldUnknownByte2 = unknownByte2;
		unknownByte2 = newUnknownByte2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SAMPLE__UNKNOWN_BYTE2, oldUnknownByte2, unknownByte2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getUnknownByte3() {
		return unknownByte3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnknownByte3(byte newUnknownByte3) {
		byte oldUnknownByte3 = unknownByte3;
		unknownByte3 = newUnknownByte3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SAMPLE__UNKNOWN_BYTE3, oldUnknownByte3, unknownByte3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getUnknownByte4() {
		return unknownByte4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnknownByte4(byte newUnknownByte4) {
		byte oldUnknownByte4 = unknownByte4;
		unknownByte4 = newUnknownByte4;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SAMPLE__UNKNOWN_BYTE4, oldUnknownByte4, unknownByte4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getAudioDataChannel1() {
		return audioDataChannel1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAudioDataChannel1(byte[] newAudioDataChannel1) {
		byte[] oldAudioDataChannel1 = audioDataChannel1;
		audioDataChannel1 = newAudioDataChannel1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SAMPLE__AUDIO_DATA_CHANNEL1, oldAudioDataChannel1, audioDataChannel1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getAudioDataChannel2() {
		return audioDataChannel2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAudioDataChannel2(byte[] newAudioDataChannel2) {
		byte[] oldAudioDataChannel2 = audioDataChannel2;
		audioDataChannel2 = newAudioDataChannel2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SAMPLE__AUDIO_DATA_CHANNEL2, oldAudioDataChannel2, audioDataChannel2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * @return Returns a byte array that combines/mixes channel1 and channel2
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public byte[] getAudioDataChannelBoth() {
		if(this.isEmpty()) {
			return new byte[0];
		}
		ByteBuffer bufferChannel1 = ByteBuffer.wrap(this.getAudioDataChannel1());
		ByteBuffer bufferChannel2 = ByteBuffer.wrap(this.getAudioDataChannel2());
		ByteBuffer bufferChannelBoth = ByteBuffer.allocate(bufferChannel1.capacity());
		int dataChannel1;
		int dataChannel2;
		short dataChannelBoth;
		for (int j = 0; j < this.getNumberOfSampleFrames(); j++) {
			dataChannel1 = bufferChannel1.getShort();
			dataChannel2 = bufferChannel2.getShort();
			dataChannelBoth = (short) ((dataChannel1 + dataChannel2) / 2);
			bufferChannelBoth.putShort(dataChannelBoth);
		}
		return bufferChannelBoth.array();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public byte[] getAudioDataLoopStart() {
		byte[] returnBytes = {0,0};
		if(this.isLoop()) {
			// 16 bit samples
			byte[] audioData = this.getAudioDataChannelBoth();
			int audioDataIndex = this.getLoopStart()*2;
			// returnBytes will contain the 16 sample that is the start of the loop
			if(audioDataIndex>=0 && audioDataIndex+1<audioData.length) {
				returnBytes[0] = audioData[audioDataIndex];
				returnBytes[1] = audioData[audioDataIndex+1];
			}
		}
		return returnBytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getSliceArray() {
		return sliceArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSliceArray(byte[] newSliceArray) {
		byte[] oldSliceArray = sliceArray;
		sliceArray = newSliceArray;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SAMPLE__SLICE_ARRAY, oldSliceArray, sliceArray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsxPackage.SAMPLE__SAMPLE_TUNE:
				return basicSetSampleTune(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isLoop() {
		return (this.getLoopStart()<this.getEnd() && this.getLoopStart()>=0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSlice() {
		return (
			this.getSliceArray()!=null && this.getSliceArray().length>0 && (
				this.getUnknownByte2()!=0x00 ||
				this.getUnknownByte3()!=0x00 ||
				this.getUnknownByte4()!=0x00
			)
		);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStereoOriginal() {
		return stereoOriginal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStereoOriginal(boolean newStereoOriginal) {
		boolean oldStereoOriginal = stereoOriginal;
		stereoOriginal = newStereoOriginal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SAMPLE__STEREO_ORIGINAL, oldStereoOriginal, stereoOriginal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isStereoCurrent() {
		return this.getSampleNumberCurrent().getValue() >= EsxUtil.NUM_SAMPLES_MONO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getLabel() {
		return "" +
			this.getSampleNumberCurrent() +
			" - " +
			this.getName() +
			"";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getMemUsedInBytes() {
		if(!this.isEmpty()) {
			if(this.isStereoCurrent()) {
				return this.numberOfSampleFrames * 4;
			}
			else {
				return this.numberOfSampleFrames * 2;
			}
		}
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isEmpty() {
		if(	this.getAudioDataChannel1()!=null && 
			this.getAudioDataChannel2()!=null &&
			this.getAudioDataChannel1().length>0 &&
			this.getAudioDataChannel1().length==this.getAudioDataChannel2().length
		) {
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampleNumber getSampleNumberOriginal() {
		return sampleNumberOriginal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSampleNumberOriginal(SampleNumber newSampleNumberOriginal) {
		SampleNumber oldSampleNumberOriginal = sampleNumberOriginal;
		sampleNumberOriginal = newSampleNumberOriginal == null ? SAMPLE_NUMBER_ORIGINAL_EDEFAULT : newSampleNumberOriginal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsxPackage.SAMPLE__SAMPLE_NUMBER_ORIGINAL, oldSampleNumberOriginal, sampleNumberOriginal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SampleNumber getSampleNumberCurrent() {
		if(this.eResource()!=null) {
			Resource resource = (Resource) this.eResource();
			Object rootObject = resource.getContents().get(0);
			if(rootObject instanceof EsxFile) {
				return SampleNumber.get(((EsxFile) rootObject).getSamples().indexOf(this));
			}
		}
		return SampleNumber.get(-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void export(File file) throws IOException {
		this.toRIFFWaveFile(file);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void initHeaderMono(byte[] b) {
		this.initHeaderMono(b, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void initHeaderMono(byte[] b, int sampleNumber) {
		ExtendedByteBuffer in = new ExtendedByteBuffer(b);
		
		// Set the original .esx file sample number
		this.setSampleNumberOriginal(SampleNumber.get(sampleNumber));

		// Set the original stereo value
		this.setStereoOriginal(false);

		// bytes 0~7
		byte[] newSampleName = new byte[8];
		in.getBytes(newSampleName, 0, 8);
		this.setName(new String(newSampleName));
		// bytes 8~11
		this.setOffsetChannel1Start(in.getInt());
		// bytes 12~15
		this.setOffsetChannel1End(in.getInt());
		// bytes 16~19
		this.setStart(in.getInt());
		// bytes 20~23
		this.setEnd(in.getInt());
		// bytes 24~27
		this.setLoopStart(in.getInt());
		// bytes 28~31
		this.setSampleRate(in.getInt());
		// bytes 32~33
		SampleTune newSampleTune = EsxFactory.eINSTANCE.createSampleTune();
		newSampleTune.setCurrentValueFromShort(in.getShort());
		this.setSampleTune(newSampleTune);
		// byte 34
		this.setPlayLevel(PlayLevel.get(in.getByte()));
		// byte 35
		this.setUnknownByte1(in.getByte());
		// byte 36
		this.setStretchStep(StretchStep.get(in.getByte()));
		// byte 37
		this.setUnknownByte2(in.getByte());
		// byte 38
		this.setUnknownByte3(in.getByte());
		// byte 39
		this.setUnknownByte4(in.getByte());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void initHeaderStereo(byte[] b) {
		this.initHeaderStereo(b, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void initHeaderStereo(byte[] b, int sampleNumber) {
		ExtendedByteBuffer in = new ExtendedByteBuffer(b);

		// Set the original .esx file sample number
		this.setSampleNumberOriginal(SampleNumber.get(sampleNumber));

		// Set the original stereo value
		this.setStereoOriginal(true);

		// bytes 0~7
		byte[] newSampleName = new byte[8];
		in.getBytes(newSampleName, 0, 8);
		this.setName(new String(newSampleName));
		// bytes 8~11
		this.setOffsetChannel1Start(in.getInt());
		// bytes 12~15
		this.setOffsetChannel1End(in.getInt());
		// bytes 16~19
		this.setOffsetChannel2Start(in.getInt());
		// bytes 20~23
		this.setOffsetChannel2End(in.getInt());
		// bytes 24~27
		this.setStart(in.getInt());
		// bytes 28~31
		this.setEnd(in.getInt());
		// bytes 32~35
		this.setSampleRate(in.getInt());
		// bytes 36~37
		SampleTune newSampleTune = EsxFactory.eINSTANCE.createSampleTune();
		newSampleTune.setCurrentValueFromShort(in.getShort());
		this.setSampleTune(newSampleTune);
		// byte 38
		this.setPlayLevel(PlayLevel.get(in.getByte()));
		// byte 39
		this.setUnknownByte1(in.getByte());
		// byte 40
		this.setStretchStep(StretchStep.get(in.getByte()));
		// byte 41
		this.setUnknownByte2(in.getByte());
		// byte 42
		this.setUnknownByte3(in.getByte());
		// byte 43
		this.setUnknownByte4(in.getByte());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void initOffsetChannel1(byte[] b) {
		ExtendedByteBuffer in = new ExtendedByteBuffer(b);

		// Get number of sample frames
		int newNumberOfSampleFrames = ((in.limit() - 16) / 2);
		if(newNumberOfSampleFrames>0) {
			// Store number of sample frames
			this.setNumberOfSampleFrames(newNumberOfSampleFrames);
			// Ignore first 16 bytes
			in.getLong();
			in.getLong();
			// Declare temp byte[]
			byte[] newAudioDataChannel = new byte[newNumberOfSampleFrames * 2];
			in.getBytes(newAudioDataChannel);
			// Store audio data
			this.setAudioDataChannel1(newAudioDataChannel);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void initOffsetChannel2(byte[] b) {
		ExtendedByteBuffer in = new ExtendedByteBuffer(b);

		// Get number of sample frames
		int newNumberOfSampleFrames = ((in.limit() - 16) / 2);
		if(newNumberOfSampleFrames>0) {
			// Store number of sample frames
			this.setNumberOfSampleFrames(newNumberOfSampleFrames);
			// Ignore first 16 bytes
			in.getLong();
			in.getLong();
			// Declare temp byte[]
			byte[] newAudioDataChannel = new byte[newNumberOfSampleFrames * 2];
			in.getBytes(newAudioDataChannel);
			// Store audio data
			this.setAudioDataChannel2(newAudioDataChannel);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void initOffsetChannelBoth(byte[] b) {
		ExtendedByteBuffer in = new ExtendedByteBuffer(b);

		// Get number of sample frames
		int newNumberOfSampleFrames = ((in.limit() - 16) / 2);
		if(newNumberOfSampleFrames>0) {
			// Store number of sample frames
			this.setNumberOfSampleFrames(newNumberOfSampleFrames);			
			// Ignore first 16 bytes
			in.getLong();
			in.getLong();
			// Declare temp byte[]
			byte[] newAudioDataChannel = new byte[newNumberOfSampleFrames * 2];
			in.getBytes(newAudioDataChannel);
			// Store audio data
			this.setAudioDataChannel1(newAudioDataChannel);
			this.setAudioDataChannel2(newAudioDataChannel);
			// Ignore last 2 bytes
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void initSliceArray(byte[] b) {
		if(b!=null && b.length>0) {
			this.setSliceArray(b);
		}
		else {
			this.setSliceArray(EsxUtil.getByteArrayWithLength("", EsxUtil.CHUNKSIZE_SLICE_DATA, (byte) 0x00));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public byte[] toHeaderMonoByteArray() {
		ExtendedByteBuffer buf = new ExtendedByteBuffer(EsxUtil.CHUNKSIZE_SAMPLE_HEADER_MONO);
		// bytes 0~7
		buf.putBytes(EsxUtil.getByteArrayWithLength(this.getName(), 8, (byte) 0x00), 0, 8);
		// bytes 8~11
		buf.putInt(this.getOffsetChannel1Start());
		// bytes 12~15
		buf.putInt(this.getOffsetChannel1End());
		// bytes 16~19
		buf.putInt(this.getStart());
		// bytes 20~23
		buf.putInt(this.getEnd());
		// bytes 24~27
		buf.putInt(this.getLoopStart());
		// bytes 28~31
		buf.putInt(this.getSampleRate());
		// bytes 32~33
		buf.putShort(this.getSampleTune().getShortFromCurrentValue());
		// byte 34
		buf.putUnsignedByte(this.getPlayLevel().getValue());
		// byte 35
		buf.putByte(this.getUnknownByte1());
		// byte 36
		buf.putUnsignedByte(this.getStretchStep().getValue());
		// byte 37
		buf.putByte(this.getUnknownByte2());
		// byte 38
		buf.putByte(this.getUnknownByte3());
		// byte 39
		buf.putByte(this.getUnknownByte4());
		return buf.array();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public byte[] toHeaderStereoByteArray() {
		ExtendedByteBuffer buf = new ExtendedByteBuffer(EsxUtil.CHUNKSIZE_SAMPLE_HEADER_STEREO);
		// bytes 0~7
		buf.putBytes(EsxUtil.getByteArrayWithLength(this.getName(), 8, (byte) 0x00), 0, 8);
		// bytes 8~11
		buf.putInt(this.getOffsetChannel1Start());
		// bytes 12~15
		buf.putInt(this.getOffsetChannel1End());
		// bytes 16~19
		buf.putInt(this.getOffsetChannel2Start());
		// bytes 20~23
		buf.putInt(this.getOffsetChannel2End());
		// bytes 24~27
		buf.putInt(this.getStart());
		// bytes 28~31
		buf.putInt(this.getEnd());
		// bytes 32~35
		buf.putInt(this.getSampleRate());
		// bytes 36~37
		buf.putShort(this.getSampleTune().getShortFromCurrentValue());
		// byte 38
		buf.putUnsignedByte(this.getPlayLevel().getValue());
		// byte 39
		buf.putByte(this.getUnknownByte1());
		// byte 40
		buf.putUnsignedByte(this.getStretchStep().getValue());
		// byte 41
		buf.putByte(this.getUnknownByte2());
		// byte 42
		buf.putByte(this.getUnknownByte3());
		// byte 43
		buf.putByte(this.getUnknownByte4());
		return buf.array();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public byte[] toOffsetChannel1ByteArray() {
		byte[] audioData = this.getAudioDataChannel1();
		ExtendedByteBuffer buf = new ExtendedByteBuffer(audioData.length+16);
		buf.putInt(0x80007FFF);
		buf.putInt(this.getOffsetChannel1Start());
		buf.putInt(this.getOffsetChannel1End());
		buf.putUnsignedByte(this.getSampleNumberCurrent().getValue());
		buf.putUnsignedByte(0); // denotes mono / channel 1
		buf.putShort((short) 0xffff);
		buf.putBytes(audioData);
		return buf.array();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public byte[] toOffsetChannel2ByteArray() {
		byte[] audioData = this.getAudioDataChannel2();
		ExtendedByteBuffer buf = new ExtendedByteBuffer(audioData.length+16);
		buf.putInt(0x80007FFF);
		buf.putInt(this.getOffsetChannel2Start());
		buf.putInt(this.getOffsetChannel2End());
		buf.putUnsignedByte(this.getSampleNumberCurrent().getValue());
		buf.putUnsignedByte(0); // denotes mono / channel 1
		buf.putShort((short) 0xffff);
		buf.putBytes(audioData);
		return buf.array();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public byte[] toOffsetChannelBothByteArray() {
		byte[] audioData = this.getAudioDataChannelBoth();
		ExtendedByteBuffer buf = new ExtendedByteBuffer(audioData.length+18);
		buf.putInt(0x80007FFF);
		buf.putInt(this.getOffsetChannel1Start());
		buf.putInt(this.getOffsetChannel1End());
		buf.putUnsignedByte(this.getSampleNumberCurrent().getValue());
		buf.putUnsignedByte(0); // denotes mono / channel 1
		buf.putShort((short) 0xffff);
		buf.putBytes(audioData);
		buf.putBytes(this.getAudioDataLoopStart());
		return buf.array();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public byte[] toSliceByteArray() {
		ExtendedByteBuffer buf = new ExtendedByteBuffer(EsxUtil.CHUNKSIZE_SLICE_DATA);
		// Write slice info
		if(this.getSliceArray()!=null) {
			buf.putBytes(this.getSliceArray());
		}
		else {
			buf.putBytes(EsxUtil.getByteArrayWithLength("", EsxUtil.CHUNKSIZE_SLICE_DATA, (byte) 0x00));
		}
		return buf.array();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RIFFWave toRIFFWave() {
		if(this.isStereoCurrent()) {
			return this.toRIFFWaveStereo();
		}
		else {
			return this.toRIFFWaveMono();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void toRIFFWaveFile(File file) throws IOException {
		try {
			RIFFWave riffWave = this.toRIFFWave();
			if(riffWave!=null) {
				riffWave.write(file);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new IOException(e.getMessage());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RIFFWave toRIFFWaveMono() {
		if(this.isEmpty()) return null; // Do nothing if this is an empty sample

		RIFFWave riffWave = WavFactory.eINSTANCE.createRIFFWave();

		// format chunk
		ChunkFormat chunkFormat = WavFactory.eINSTANCE.createChunkFormat();
		chunkFormat.setCompressionCode(CompressionCode.COMPRESSION_CODE_1);
		chunkFormat.setCompressionCodeValue(CompressionCode.COMPRESSION_CODE_1_VALUE);
		chunkFormat.setNumberOfChannels(1);
		chunkFormat.setSampleRate((long)this.getSampleRate());
		chunkFormat.setAverageBytesPerSecond(chunkFormat.getSampleRate()*chunkFormat.getNumberOfChannels()*2);
		chunkFormat.setBlockAlign(chunkFormat.getNumberOfChannels()*2);
		chunkFormat.setSignificantBitsPerSample(16);
		riffWave.getChunks().add(chunkFormat);

		// data chunk
		ChunkData chunkData = WavFactory.eINSTANCE.createChunkData();
		byte[] sampleData = new byte[this.getAudioDataChannel1().length];
		try {
			for (int i = 0; i<sampleData.length; i = i + 2) {
				sampleData[i] = this.getAudioDataChannel1()[i + 1];
				sampleData[i + 1] = this.getAudioDataChannel1()[i];
			}
		} catch(Exception e) {}
		chunkData.setSampleDataOriginal(sampleData);
		riffWave.getChunks().add(chunkData);

		// sampler chunk
		if(this.isLoop()) {
			ChunkSampler chunkSampler = WavFactory.eINSTANCE.createChunkSampler();
			chunkSampler.setManufacturer((long)0x42);
			chunkSampler.setProduct((long)0x71);
			chunkSampler.setSamplePeriod((long)1000000000/this.getSampleRate());
			chunkSampler.setMidiUnityNote((long)0x3C);
			chunkSampler.setMidiPitchFraction((long)0);
			chunkSampler.setSmpteFormat((long)0);
			chunkSampler.setSmpteOffset((long)0);

			SampleLoop sampleLoop = WavFactory.eINSTANCE.createSampleLoop();
			sampleLoop.setCuePointID((long)0);
			sampleLoop.setType((long)0);
			sampleLoop.setStart((long)this.getLoopStart());
			sampleLoop.setEnd((long)this.getEnd());
			sampleLoop.setFraction((long)0);
			sampleLoop.setPlayCount((long)0);
			chunkSampler.getSampleLoops().add(sampleLoop);

			riffWave.getChunks().add(chunkSampler);
		}

		return riffWave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RIFFWave toRIFFWaveStereo() {
		if(this.isEmpty()) return null; // Do nothing if this is an empty sample

		RIFFWave riffWave = WavFactory.eINSTANCE.createRIFFWave();

		// format chunk
		ChunkFormat chunkFormat = WavFactory.eINSTANCE.createChunkFormat();
		chunkFormat.setCompressionCode(CompressionCode.COMPRESSION_CODE_1);
		chunkFormat.setCompressionCodeValue(CompressionCode.COMPRESSION_CODE_1_VALUE);
		chunkFormat.setNumberOfChannels(2);
		chunkFormat.setSampleRate((long)this.getSampleRate());
		chunkFormat.setAverageBytesPerSecond(chunkFormat.getSampleRate()*chunkFormat.getNumberOfChannels()*2);
		chunkFormat.setBlockAlign(chunkFormat.getNumberOfChannels()*2);
		chunkFormat.setSignificantBitsPerSample(16);
		riffWave.getChunks().add(chunkFormat);

		// data chunk
		ChunkData chunkData = WavFactory.eINSTANCE.createChunkData();
		byte[] left = this.getAudioDataChannel1();
		byte[] right = this.getAudioDataChannel2();
		byte[] both = new byte[left.length + right.length];
		try {
			for (int i = 0, j = 0; i<both.length && j<left.length; i = i + 4, j = j+2) {
				both[i] = left[j + 1];
				both[i + 1] = left[j];
				both[i + 2] = right[j + 1];
				both[i + 3] = right[j];
			}
		} catch(Exception e) {}
		chunkData.setSampleDataOriginal(both);
		riffWave.getChunks().add(chunkData);

		// sampler chunk
		if(this.isLoop()) {
			ChunkSampler chunkSampler = WavFactory.eINSTANCE.createChunkSampler();
			chunkSampler.setManufacturer((long)0x42);
			chunkSampler.setProduct((long)0x71);
			chunkSampler.setSamplePeriod((long)1000000000/this.getSampleRate());
			chunkSampler.setMidiUnityNote((long)0x3C);
			chunkSampler.setMidiPitchFraction((long)0);
			chunkSampler.setSmpteFormat((long)0);
			chunkSampler.setSmpteOffset((long)0);

			SampleLoop sampleLoop = WavFactory.eINSTANCE.createSampleLoop();
			sampleLoop.setCuePointID((long)0);
			sampleLoop.setType((long)0);
			sampleLoop.setStart((long)this.getLoopStart());
			sampleLoop.setEnd((long)this.getEnd());
			sampleLoop.setFraction((long)0);
			sampleLoop.setPlayCount((long)0);
			chunkSampler.getSampleLoops().add(sampleLoop);

			riffWave.getChunks().add(chunkSampler);
		}

		return riffWave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EsxPackage.SAMPLE__NAME:
				return getName();
			case EsxPackage.SAMPLE__OFFSET_CHANNEL1_START:
				return getOffsetChannel1Start();
			case EsxPackage.SAMPLE__OFFSET_CHANNEL1_END:
				return getOffsetChannel1End();
			case EsxPackage.SAMPLE__OFFSET_CHANNEL2_START:
				return getOffsetChannel2Start();
			case EsxPackage.SAMPLE__OFFSET_CHANNEL2_END:
				return getOffsetChannel2End();
			case EsxPackage.SAMPLE__START:
				return getStart();
			case EsxPackage.SAMPLE__END:
				return getEnd();
			case EsxPackage.SAMPLE__LOOP_START:
				return getLoopStart();
			case EsxPackage.SAMPLE__SAMPLE_RATE:
				return getSampleRate();
			case EsxPackage.SAMPLE__SAMPLE_TUNE:
				return getSampleTune();
			case EsxPackage.SAMPLE__NUMBER_OF_SAMPLE_FRAMES:
				return getNumberOfSampleFrames();
			case EsxPackage.SAMPLE__PLAY_LEVEL:
				return getPlayLevel();
			case EsxPackage.SAMPLE__UNKNOWN_BYTE1:
				return getUnknownByte1();
			case EsxPackage.SAMPLE__STRETCH_STEP:
				return getStretchStep();
			case EsxPackage.SAMPLE__UNKNOWN_BYTE2:
				return getUnknownByte2();
			case EsxPackage.SAMPLE__UNKNOWN_BYTE3:
				return getUnknownByte3();
			case EsxPackage.SAMPLE__UNKNOWN_BYTE4:
				return getUnknownByte4();
			case EsxPackage.SAMPLE__AUDIO_DATA_CHANNEL1:
				return getAudioDataChannel1();
			case EsxPackage.SAMPLE__AUDIO_DATA_CHANNEL2:
				return getAudioDataChannel2();
			case EsxPackage.SAMPLE__AUDIO_DATA_CHANNEL_BOTH:
				return getAudioDataChannelBoth();
			case EsxPackage.SAMPLE__AUDIO_DATA_LOOP_START:
				return getAudioDataLoopStart();
			case EsxPackage.SAMPLE__SLICE_ARRAY:
				return getSliceArray();
			case EsxPackage.SAMPLE__LOOP:
				return isLoop();
			case EsxPackage.SAMPLE__SLICE:
				return isSlice();
			case EsxPackage.SAMPLE__STEREO_ORIGINAL:
				return isStereoOriginal();
			case EsxPackage.SAMPLE__STEREO_CURRENT:
				return isStereoCurrent();
			case EsxPackage.SAMPLE__LABEL:
				return getLabel();
			case EsxPackage.SAMPLE__MEM_USED_IN_BYTES:
				return getMemUsedInBytes();
			case EsxPackage.SAMPLE__EMPTY:
				return isEmpty();
			case EsxPackage.SAMPLE__SAMPLE_NUMBER_ORIGINAL:
				return getSampleNumberOriginal();
			case EsxPackage.SAMPLE__SAMPLE_NUMBER_CURRENT:
				return getSampleNumberCurrent();
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
			case EsxPackage.SAMPLE__NAME:
				setName((String)newValue);
				return;
			case EsxPackage.SAMPLE__OFFSET_CHANNEL1_START:
				setOffsetChannel1Start((Integer)newValue);
				return;
			case EsxPackage.SAMPLE__OFFSET_CHANNEL1_END:
				setOffsetChannel1End((Integer)newValue);
				return;
			case EsxPackage.SAMPLE__OFFSET_CHANNEL2_START:
				setOffsetChannel2Start((Integer)newValue);
				return;
			case EsxPackage.SAMPLE__OFFSET_CHANNEL2_END:
				setOffsetChannel2End((Integer)newValue);
				return;
			case EsxPackage.SAMPLE__START:
				setStart((Integer)newValue);
				return;
			case EsxPackage.SAMPLE__END:
				setEnd((Integer)newValue);
				return;
			case EsxPackage.SAMPLE__LOOP_START:
				setLoopStart((Integer)newValue);
				return;
			case EsxPackage.SAMPLE__SAMPLE_RATE:
				setSampleRate((Integer)newValue);
				return;
			case EsxPackage.SAMPLE__SAMPLE_TUNE:
				setSampleTune((SampleTune)newValue);
				return;
			case EsxPackage.SAMPLE__NUMBER_OF_SAMPLE_FRAMES:
				setNumberOfSampleFrames((Integer)newValue);
				return;
			case EsxPackage.SAMPLE__PLAY_LEVEL:
				setPlayLevel((PlayLevel)newValue);
				return;
			case EsxPackage.SAMPLE__UNKNOWN_BYTE1:
				setUnknownByte1((Byte)newValue);
				return;
			case EsxPackage.SAMPLE__STRETCH_STEP:
				setStretchStep((StretchStep)newValue);
				return;
			case EsxPackage.SAMPLE__UNKNOWN_BYTE2:
				setUnknownByte2((Byte)newValue);
				return;
			case EsxPackage.SAMPLE__UNKNOWN_BYTE3:
				setUnknownByte3((Byte)newValue);
				return;
			case EsxPackage.SAMPLE__UNKNOWN_BYTE4:
				setUnknownByte4((Byte)newValue);
				return;
			case EsxPackage.SAMPLE__AUDIO_DATA_CHANNEL1:
				setAudioDataChannel1((byte[])newValue);
				return;
			case EsxPackage.SAMPLE__AUDIO_DATA_CHANNEL2:
				setAudioDataChannel2((byte[])newValue);
				return;
			case EsxPackage.SAMPLE__SLICE_ARRAY:
				setSliceArray((byte[])newValue);
				return;
			case EsxPackage.SAMPLE__STEREO_ORIGINAL:
				setStereoOriginal((Boolean)newValue);
				return;
			case EsxPackage.SAMPLE__SAMPLE_NUMBER_ORIGINAL:
				setSampleNumberOriginal((SampleNumber)newValue);
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
			case EsxPackage.SAMPLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EsxPackage.SAMPLE__OFFSET_CHANNEL1_START:
				setOffsetChannel1Start(OFFSET_CHANNEL1_START_EDEFAULT);
				return;
			case EsxPackage.SAMPLE__OFFSET_CHANNEL1_END:
				setOffsetChannel1End(OFFSET_CHANNEL1_END_EDEFAULT);
				return;
			case EsxPackage.SAMPLE__OFFSET_CHANNEL2_START:
				setOffsetChannel2Start(OFFSET_CHANNEL2_START_EDEFAULT);
				return;
			case EsxPackage.SAMPLE__OFFSET_CHANNEL2_END:
				setOffsetChannel2End(OFFSET_CHANNEL2_END_EDEFAULT);
				return;
			case EsxPackage.SAMPLE__START:
				setStart(START_EDEFAULT);
				return;
			case EsxPackage.SAMPLE__END:
				setEnd(END_EDEFAULT);
				return;
			case EsxPackage.SAMPLE__LOOP_START:
				setLoopStart(LOOP_START_EDEFAULT);
				return;
			case EsxPackage.SAMPLE__SAMPLE_RATE:
				setSampleRate(SAMPLE_RATE_EDEFAULT);
				return;
			case EsxPackage.SAMPLE__SAMPLE_TUNE:
				setSampleTune((SampleTune)null);
				return;
			case EsxPackage.SAMPLE__NUMBER_OF_SAMPLE_FRAMES:
				setNumberOfSampleFrames(NUMBER_OF_SAMPLE_FRAMES_EDEFAULT);
				return;
			case EsxPackage.SAMPLE__PLAY_LEVEL:
				setPlayLevel(PLAY_LEVEL_EDEFAULT);
				return;
			case EsxPackage.SAMPLE__UNKNOWN_BYTE1:
				setUnknownByte1(UNKNOWN_BYTE1_EDEFAULT);
				return;
			case EsxPackage.SAMPLE__STRETCH_STEP:
				setStretchStep(STRETCH_STEP_EDEFAULT);
				return;
			case EsxPackage.SAMPLE__UNKNOWN_BYTE2:
				setUnknownByte2(UNKNOWN_BYTE2_EDEFAULT);
				return;
			case EsxPackage.SAMPLE__UNKNOWN_BYTE3:
				setUnknownByte3(UNKNOWN_BYTE3_EDEFAULT);
				return;
			case EsxPackage.SAMPLE__UNKNOWN_BYTE4:
				setUnknownByte4(UNKNOWN_BYTE4_EDEFAULT);
				return;
			case EsxPackage.SAMPLE__AUDIO_DATA_CHANNEL1:
				setAudioDataChannel1(AUDIO_DATA_CHANNEL1_EDEFAULT);
				return;
			case EsxPackage.SAMPLE__AUDIO_DATA_CHANNEL2:
				setAudioDataChannel2(AUDIO_DATA_CHANNEL2_EDEFAULT);
				return;
			case EsxPackage.SAMPLE__SLICE_ARRAY:
				setSliceArray(SLICE_ARRAY_EDEFAULT);
				return;
			case EsxPackage.SAMPLE__STEREO_ORIGINAL:
				setStereoOriginal(STEREO_ORIGINAL_EDEFAULT);
				return;
			case EsxPackage.SAMPLE__SAMPLE_NUMBER_ORIGINAL:
				setSampleNumberOriginal(SAMPLE_NUMBER_ORIGINAL_EDEFAULT);
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
			case EsxPackage.SAMPLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EsxPackage.SAMPLE__OFFSET_CHANNEL1_START:
				return offsetChannel1Start != OFFSET_CHANNEL1_START_EDEFAULT;
			case EsxPackage.SAMPLE__OFFSET_CHANNEL1_END:
				return offsetChannel1End != OFFSET_CHANNEL1_END_EDEFAULT;
			case EsxPackage.SAMPLE__OFFSET_CHANNEL2_START:
				return offsetChannel2Start != OFFSET_CHANNEL2_START_EDEFAULT;
			case EsxPackage.SAMPLE__OFFSET_CHANNEL2_END:
				return offsetChannel2End != OFFSET_CHANNEL2_END_EDEFAULT;
			case EsxPackage.SAMPLE__START:
				return start != START_EDEFAULT;
			case EsxPackage.SAMPLE__END:
				return end != END_EDEFAULT;
			case EsxPackage.SAMPLE__LOOP_START:
				return loopStart != LOOP_START_EDEFAULT;
			case EsxPackage.SAMPLE__SAMPLE_RATE:
				return sampleRate != SAMPLE_RATE_EDEFAULT;
			case EsxPackage.SAMPLE__SAMPLE_TUNE:
				return sampleTune != null;
			case EsxPackage.SAMPLE__NUMBER_OF_SAMPLE_FRAMES:
				return numberOfSampleFrames != NUMBER_OF_SAMPLE_FRAMES_EDEFAULT;
			case EsxPackage.SAMPLE__PLAY_LEVEL:
				return playLevel != PLAY_LEVEL_EDEFAULT;
			case EsxPackage.SAMPLE__UNKNOWN_BYTE1:
				return unknownByte1 != UNKNOWN_BYTE1_EDEFAULT;
			case EsxPackage.SAMPLE__STRETCH_STEP:
				return stretchStep != STRETCH_STEP_EDEFAULT;
			case EsxPackage.SAMPLE__UNKNOWN_BYTE2:
				return unknownByte2 != UNKNOWN_BYTE2_EDEFAULT;
			case EsxPackage.SAMPLE__UNKNOWN_BYTE3:
				return unknownByte3 != UNKNOWN_BYTE3_EDEFAULT;
			case EsxPackage.SAMPLE__UNKNOWN_BYTE4:
				return unknownByte4 != UNKNOWN_BYTE4_EDEFAULT;
			case EsxPackage.SAMPLE__AUDIO_DATA_CHANNEL1:
				return AUDIO_DATA_CHANNEL1_EDEFAULT == null ? audioDataChannel1 != null : !AUDIO_DATA_CHANNEL1_EDEFAULT.equals(audioDataChannel1);
			case EsxPackage.SAMPLE__AUDIO_DATA_CHANNEL2:
				return AUDIO_DATA_CHANNEL2_EDEFAULT == null ? audioDataChannel2 != null : !AUDIO_DATA_CHANNEL2_EDEFAULT.equals(audioDataChannel2);
			case EsxPackage.SAMPLE__AUDIO_DATA_CHANNEL_BOTH:
				return AUDIO_DATA_CHANNEL_BOTH_EDEFAULT == null ? getAudioDataChannelBoth() != null : !AUDIO_DATA_CHANNEL_BOTH_EDEFAULT.equals(getAudioDataChannelBoth());
			case EsxPackage.SAMPLE__AUDIO_DATA_LOOP_START:
				return AUDIO_DATA_LOOP_START_EDEFAULT == null ? getAudioDataLoopStart() != null : !AUDIO_DATA_LOOP_START_EDEFAULT.equals(getAudioDataLoopStart());
			case EsxPackage.SAMPLE__SLICE_ARRAY:
				return SLICE_ARRAY_EDEFAULT == null ? sliceArray != null : !SLICE_ARRAY_EDEFAULT.equals(sliceArray);
			case EsxPackage.SAMPLE__LOOP:
				return isLoop() != LOOP_EDEFAULT;
			case EsxPackage.SAMPLE__SLICE:
				return isSlice() != SLICE_EDEFAULT;
			case EsxPackage.SAMPLE__STEREO_ORIGINAL:
				return stereoOriginal != STEREO_ORIGINAL_EDEFAULT;
			case EsxPackage.SAMPLE__STEREO_CURRENT:
				return isStereoCurrent() != STEREO_CURRENT_EDEFAULT;
			case EsxPackage.SAMPLE__LABEL:
				return LABEL_EDEFAULT == null ? getLabel() != null : !LABEL_EDEFAULT.equals(getLabel());
			case EsxPackage.SAMPLE__MEM_USED_IN_BYTES:
				return getMemUsedInBytes() != MEM_USED_IN_BYTES_EDEFAULT;
			case EsxPackage.SAMPLE__EMPTY:
				return isEmpty() != EMPTY_EDEFAULT;
			case EsxPackage.SAMPLE__SAMPLE_NUMBER_ORIGINAL:
				return sampleNumberOriginal != SAMPLE_NUMBER_ORIGINAL_EDEFAULT;
			case EsxPackage.SAMPLE__SAMPLE_NUMBER_CURRENT:
				return getSampleNumberCurrent() != SAMPLE_NUMBER_CURRENT_EDEFAULT;
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
		result.append(", offsetChannel1Start: ");
		result.append(offsetChannel1Start);
		result.append(", offsetChannel1End: ");
		result.append(offsetChannel1End);
		result.append(", offsetChannel2Start: ");
		result.append(offsetChannel2Start);
		result.append(", offsetChannel2End: ");
		result.append(offsetChannel2End);
		result.append(", start: ");
		result.append(start);
		result.append(", end: ");
		result.append(end);
		result.append(", loopStart: ");
		result.append(loopStart);
		result.append(", sampleRate: ");
		result.append(sampleRate);
		result.append(", numberOfSampleFrames: ");
		result.append(numberOfSampleFrames);
		result.append(", playLevel: ");
		result.append(playLevel);
		result.append(", unknownByte1: ");
		result.append(unknownByte1);
		result.append(", stretchStep: ");
		result.append(stretchStep);
		result.append(", unknownByte2: ");
		result.append(unknownByte2);
		result.append(", unknownByte3: ");
		result.append(unknownByte3);
		result.append(", unknownByte4: ");
		result.append(unknownByte4);
		result.append(", audioDataChannel1: ");
		result.append(audioDataChannel1);
		result.append(", audioDataChannel2: ");
		result.append(audioDataChannel2);
		result.append(", sliceArray: ");
		result.append(sliceArray);
		result.append(", stereoOriginal: ");
		result.append(stereoOriginal);
		result.append(", sampleNumberOriginal: ");
		result.append(sampleNumberOriginal);
		result.append(')');
		return result.toString();
	}

} //SampleImpl

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
package com.skratchdot.electribe.model.esx;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sample</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#getName <em>Name</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#getOffsetChannel1Start <em>Offset Channel1 Start</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#getOffsetChannel1End <em>Offset Channel1 End</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#getOffsetChannel2Start <em>Offset Channel2 Start</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#getOffsetChannel2End <em>Offset Channel2 End</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#getStart <em>Start</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#getEnd <em>End</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#getLoopStart <em>Loop Start</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#getSampleRate <em>Sample Rate</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#getSampleTune <em>Sample Tune</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#getNumberOfSampleFrames <em>Number Of Sample Frames</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#getPlayLevel <em>Play Level</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#getUnknownByte1 <em>Unknown Byte1</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#getStretchStep <em>Stretch Step</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#getUnknownByte2 <em>Unknown Byte2</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#getUnknownByte3 <em>Unknown Byte3</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#getUnknownByte4 <em>Unknown Byte4</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#getAudioDataChannel1 <em>Audio Data Channel1</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#getAudioDataChannel2 <em>Audio Data Channel2</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#getAudioDataChannelBoth <em>Audio Data Channel Both</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#getAudioDataLoopStart <em>Audio Data Loop Start</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#getSliceArray <em>Slice Array</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#isLoop <em>Loop</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#isSlice <em>Slice</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#isStereo <em>Stereo</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#getMemUsedInBytes <em>Mem Used In Bytes</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#isEmpty <em>Empty</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#getSampleNumberOriginal <em>Sample Number Original</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.Sample#getSampleNumberCurrent <em>Sample Number Current</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSample()
 * @model abstract="true"
 * @generated
 */
public interface Sample extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSample_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Sample#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Stereo</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stereo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereo</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSample_Stereo()
	 * @model default="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isStereo();

	/**
	 * Returns the value of the '<em><b>Mem Used In Bytes</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mem Used In Bytes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mem Used In Bytes</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSample_MemUsedInBytes()
	 * @model default="0" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getMemUsedInBytes();

	/**
	 * Returns the value of the '<em><b>Empty</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empty</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSample_Empty()
	 * @model default="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isEmpty();

	/**
	 * Returns the value of the '<em><b>Offset Channel1 Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset Channel1 Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset Channel1 Start</em>' attribute.
	 * @see #setOffsetChannel1Start(int)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSample_OffsetChannel1Start()
	 * @model
	 * @generated
	 */
	int getOffsetChannel1Start();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Sample#getOffsetChannel1Start <em>Offset Channel1 Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset Channel1 Start</em>' attribute.
	 * @see #getOffsetChannel1Start()
	 * @generated
	 */
	void setOffsetChannel1Start(int value);

	/**
	 * Returns the value of the '<em><b>Offset Channel1 End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset Channel1 End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset Channel1 End</em>' attribute.
	 * @see #setOffsetChannel1End(int)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSample_OffsetChannel1End()
	 * @model
	 * @generated
	 */
	int getOffsetChannel1End();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Sample#getOffsetChannel1End <em>Offset Channel1 End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset Channel1 End</em>' attribute.
	 * @see #getOffsetChannel1End()
	 * @generated
	 */
	void setOffsetChannel1End(int value);

	/**
	 * Returns the value of the '<em><b>Offset Channel2 Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset Channel2 Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset Channel2 Start</em>' attribute.
	 * @see #setOffsetChannel2Start(int)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSample_OffsetChannel2Start()
	 * @model
	 * @generated
	 */
	int getOffsetChannel2Start();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Sample#getOffsetChannel2Start <em>Offset Channel2 Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset Channel2 Start</em>' attribute.
	 * @see #getOffsetChannel2Start()
	 * @generated
	 */
	void setOffsetChannel2Start(int value);

	/**
	 * Returns the value of the '<em><b>Offset Channel2 End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset Channel2 End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset Channel2 End</em>' attribute.
	 * @see #setOffsetChannel2End(int)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSample_OffsetChannel2End()
	 * @model
	 * @generated
	 */
	int getOffsetChannel2End();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Sample#getOffsetChannel2End <em>Offset Channel2 End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset Channel2 End</em>' attribute.
	 * @see #getOffsetChannel2End()
	 * @generated
	 */
	void setOffsetChannel2End(int value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(int)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSample_Start()
	 * @model
	 * @generated
	 */
	int getStart();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Sample#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(int value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(int)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSample_End()
	 * @model
	 * @generated
	 */
	int getEnd();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Sample#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(int value);

	/**
	 * Returns the value of the '<em><b>Loop Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Start</em>' attribute.
	 * @see #setLoopStart(int)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSample_LoopStart()
	 * @model
	 * @generated
	 */
	int getLoopStart();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Sample#getLoopStart <em>Loop Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Start</em>' attribute.
	 * @see #getLoopStart()
	 * @generated
	 */
	void setLoopStart(int value);

	/**
	 * Returns the value of the '<em><b>Sample Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample Rate</em>' attribute.
	 * @see #setSampleRate(int)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSample_SampleRate()
	 * @model
	 * @generated
	 */
	int getSampleRate();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Sample#getSampleRate <em>Sample Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample Rate</em>' attribute.
	 * @see #getSampleRate()
	 * @generated
	 */
	void setSampleRate(int value);

	/**
	 * Returns the value of the '<em><b>Sample Tune</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample Tune</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample Tune</em>' containment reference.
	 * @see #setSampleTune(SampleTune)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSample_SampleTune()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SampleTune getSampleTune();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Sample#getSampleTune <em>Sample Tune</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample Tune</em>' containment reference.
	 * @see #getSampleTune()
	 * @generated
	 */
	void setSampleTune(SampleTune value);

	/**
	 * Returns the value of the '<em><b>Number Of Sample Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Sample Frames</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Sample Frames</em>' attribute.
	 * @see #setNumberOfSampleFrames(int)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSample_NumberOfSampleFrames()
	 * @model
	 * @generated
	 */
	int getNumberOfSampleFrames();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Sample#getNumberOfSampleFrames <em>Number Of Sample Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Sample Frames</em>' attribute.
	 * @see #getNumberOfSampleFrames()
	 * @generated
	 */
	void setNumberOfSampleFrames(int value);

	/**
	 * Returns the value of the '<em><b>Play Level</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.PlayLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Play Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Play Level</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.PlayLevel
	 * @see #setPlayLevel(PlayLevel)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSample_PlayLevel()
	 * @model
	 * @generated
	 */
	PlayLevel getPlayLevel();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Sample#getPlayLevel <em>Play Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Play Level</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.PlayLevel
	 * @see #getPlayLevel()
	 * @generated
	 */
	void setPlayLevel(PlayLevel value);

	/**
	 * Returns the value of the '<em><b>Unknown Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unknown Byte1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unknown Byte1</em>' attribute.
	 * @see #setUnknownByte1(byte)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSample_UnknownByte1()
	 * @model
	 * @generated
	 */
	byte getUnknownByte1();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Sample#getUnknownByte1 <em>Unknown Byte1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unknown Byte1</em>' attribute.
	 * @see #getUnknownByte1()
	 * @generated
	 */
	void setUnknownByte1(byte value);

	/**
	 * Returns the value of the '<em><b>Stretch Step</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.StretchStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stretch Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stretch Step</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.StretchStep
	 * @see #setStretchStep(StretchStep)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSample_StretchStep()
	 * @model
	 * @generated
	 */
	StretchStep getStretchStep();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Sample#getStretchStep <em>Stretch Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stretch Step</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.StretchStep
	 * @see #getStretchStep()
	 * @generated
	 */
	void setStretchStep(StretchStep value);

	/**
	 * Returns the value of the '<em><b>Unknown Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unknown Byte2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unknown Byte2</em>' attribute.
	 * @see #setUnknownByte2(byte)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSample_UnknownByte2()
	 * @model
	 * @generated
	 */
	byte getUnknownByte2();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Sample#getUnknownByte2 <em>Unknown Byte2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unknown Byte2</em>' attribute.
	 * @see #getUnknownByte2()
	 * @generated
	 */
	void setUnknownByte2(byte value);

	/**
	 * Returns the value of the '<em><b>Unknown Byte3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unknown Byte3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unknown Byte3</em>' attribute.
	 * @see #setUnknownByte3(byte)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSample_UnknownByte3()
	 * @model
	 * @generated
	 */
	byte getUnknownByte3();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Sample#getUnknownByte3 <em>Unknown Byte3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unknown Byte3</em>' attribute.
	 * @see #getUnknownByte3()
	 * @generated
	 */
	void setUnknownByte3(byte value);

	/**
	 * Returns the value of the '<em><b>Unknown Byte4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unknown Byte4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unknown Byte4</em>' attribute.
	 * @see #setUnknownByte4(byte)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSample_UnknownByte4()
	 * @model
	 * @generated
	 */
	byte getUnknownByte4();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Sample#getUnknownByte4 <em>Unknown Byte4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unknown Byte4</em>' attribute.
	 * @see #getUnknownByte4()
	 * @generated
	 */
	void setUnknownByte4(byte value);

	/**
	 * Returns the value of the '<em><b>Audio Data Channel1</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Audio Data Channel1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audio Data Channel1</em>' attribute.
	 * @see #setAudioDataChannel1(byte[])
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSample_AudioDataChannel1()
	 * @model default=""
	 * @generated
	 */
	byte[] getAudioDataChannel1();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Sample#getAudioDataChannel1 <em>Audio Data Channel1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audio Data Channel1</em>' attribute.
	 * @see #getAudioDataChannel1()
	 * @generated
	 */
	void setAudioDataChannel1(byte[] value);

	/**
	 * Returns the value of the '<em><b>Audio Data Channel2</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Audio Data Channel2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audio Data Channel2</em>' attribute.
	 * @see #setAudioDataChannel2(byte[])
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSample_AudioDataChannel2()
	 * @model default=""
	 * @generated
	 */
	byte[] getAudioDataChannel2();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Sample#getAudioDataChannel2 <em>Audio Data Channel2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audio Data Channel2</em>' attribute.
	 * @see #getAudioDataChannel2()
	 * @generated
	 */
	void setAudioDataChannel2(byte[] value);

	/**
	 * Returns the value of the '<em><b>Audio Data Channel Both</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Audio Data Channel Both</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audio Data Channel Both</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSample_AudioDataChannelBoth()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	byte[] getAudioDataChannelBoth();

	/**
	 * Returns the value of the '<em><b>Audio Data Loop Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Audio Data Loop Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audio Data Loop Start</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSample_AudioDataLoopStart()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	byte[] getAudioDataLoopStart();

	/**
	 * Returns the value of the '<em><b>Slice Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slice Array</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slice Array</em>' attribute.
	 * @see #setSliceArray(byte[])
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSample_SliceArray()
	 * @model
	 * @generated
	 */
	byte[] getSliceArray();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Sample#getSliceArray <em>Slice Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slice Array</em>' attribute.
	 * @see #getSliceArray()
	 * @generated
	 */
	void setSliceArray(byte[] value);

	/**
	 * Returns the value of the '<em><b>Sample Number Original</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.SampleNumber}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample Number Original</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample Number Original</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.SampleNumber
	 * @see #setSampleNumberOriginal(SampleNumber)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSample_SampleNumberOriginal()
	 * @model default="-1"
	 * @generated
	 */
	SampleNumber getSampleNumberOriginal();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.Sample#getSampleNumberOriginal <em>Sample Number Original</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample Number Original</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.SampleNumber
	 * @see #getSampleNumberOriginal()
	 * @generated
	 */
	void setSampleNumberOriginal(SampleNumber value);

	/**
	 * Returns the value of the '<em><b>Sample Number Current</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.SampleNumber}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample Number Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample Number Current</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.SampleNumber
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSample_SampleNumberCurrent()
	 * @model default="-1" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	SampleNumber getSampleNumberCurrent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="com.skratchdot.electribe.model.esx.IOException" fileDataType="com.skratchdot.electribe.model.esx.File"
	 * @generated
	 */
	void export(File file) throws IOException;

	/**
	 * Returns the value of the '<em><b>Loop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSample_Loop()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isLoop();

	/**
	 * Returns the value of the '<em><b>Slice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slice</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slice</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSample_Slice()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isSlice();

	AudioInputStream getAudioInputStream();

} // Sample

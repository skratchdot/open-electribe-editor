/**
 * Copyright (c) 2009-2010 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    JEFF |:at:| SKRATCHDOT |:dot:| COM
 *
 * $Id$
 */
package com.skratchdot.electribe.model.esx;

import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import com.skratchdot.electribe.model.esx.util.EsxException;
import com.skratchdot.electribe.model.esx.util.EsxRandomAccess;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getOriginalNonAudioData <em>Original Non Audio Data</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getGlobalParameters <em>Global Parameters</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getPatterns <em>Patterns</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getSongs <em>Songs</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getSamples <em>Samples</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getEmptyPattern <em>Empty Pattern</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getEmptySong <em>Empty Song</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getMemUsedInBytes <em>Mem Used In Bytes</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getMemFreeInBytes <em>Mem Free In Bytes</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getNumPatternsEmpty <em>Num Patterns Empty</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getNumPatternsNotEmpty <em>Num Patterns Not Empty</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesEmpty <em>Num Samples Empty</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesNotEmpty <em>Num Samples Not Empty</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesMonoEmpty <em>Num Samples Mono Empty</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesMonoNotEmpty <em>Num Samples Mono Not Empty</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesStereoEmpty <em>Num Samples Stereo Empty</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesStereoNotEmpty <em>Num Samples Stereo Not Empty</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getNumSongsEmpty <em>Num Songs Empty</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getNumSongsNotEmpty <em>Num Songs Not Empty</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getEsxFile()
 * @model
 * @generated
 */
public interface EsxFile extends EObject {
	/**
	 * Returns the value of the '<em><b>Original Non Audio Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Non Audio Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Non Audio Data</em>' attribute.
	 * @see #setOriginalNonAudioData(byte[])
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getEsxFile_OriginalNonAudioData()
	 * @model
	 * @generated
	 */
	byte[] getOriginalNonAudioData();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.EsxFile#getOriginalNonAudioData <em>Original Non Audio Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Non Audio Data</em>' attribute.
	 * @see #getOriginalNonAudioData()
	 * @generated
	 */
	void setOriginalNonAudioData(byte[] value);

	/**
	 * Returns the value of the '<em><b>Global Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Parameters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Parameters</em>' containment reference.
	 * @see #setGlobalParameters(GlobalParameters)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getEsxFile_GlobalParameters()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GlobalParameters getGlobalParameters();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.EsxFile#getGlobalParameters <em>Global Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Parameters</em>' containment reference.
	 * @see #getGlobalParameters()
	 * @generated
	 */
	void setGlobalParameters(GlobalParameters value);

	/**
	 * Returns the value of the '<em><b>Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link com.skratchdot.electribe.model.esx.Pattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patterns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patterns</em>' containment reference list.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getEsxFile_Patterns()
	 * @model containment="true" lower="256" upper="256"
	 * @generated
	 */
	EList<Pattern> getPatterns();

	/**
	 * Returns the value of the '<em><b>Songs</b></em>' containment reference list.
	 * The list contents are of type {@link com.skratchdot.electribe.model.esx.Song}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Songs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Songs</em>' containment reference list.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getEsxFile_Songs()
	 * @model containment="true" lower="64" upper="64"
	 * @generated
	 */
	EList<Song> getSongs();

	/**
	 * Returns the value of the '<em><b>Samples</b></em>' containment reference list.
	 * The list contents are of type {@link com.skratchdot.electribe.model.esx.Sample}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Samples</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Samples</em>' containment reference list.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getEsxFile_Samples()
	 * @model containment="true" lower="384" upper="384"
	 * @generated
	 */
	EList<Sample> getSamples();

	/**
	 * Returns the value of the '<em><b>Empty Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empty Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empty Pattern</em>' containment reference.
	 * @see #setEmptyPattern(Pattern)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getEsxFile_EmptyPattern()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Pattern getEmptyPattern();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.EsxFile#getEmptyPattern <em>Empty Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empty Pattern</em>' containment reference.
	 * @see #getEmptyPattern()
	 * @generated
	 */
	void setEmptyPattern(Pattern value);

	/**
	 * Returns the value of the '<em><b>Empty Song</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empty Song</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empty Song</em>' containment reference.
	 * @see #setEmptySong(Song)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getEsxFile_EmptySong()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Song getEmptySong();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.EsxFile#getEmptySong <em>Empty Song</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empty Song</em>' containment reference.
	 * @see #getEmptySong()
	 * @generated
	 */
	void setEmptySong(Song value);

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
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getEsxFile_MemUsedInBytes()
	 * @model default="0" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getMemUsedInBytes();

	/**
	 * Returns the value of the '<em><b>Mem Free In Bytes</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mem Free In Bytes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mem Free In Bytes</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getEsxFile_MemFreeInBytes()
	 * @model default="0" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getMemFreeInBytes();

	/**
	 * Returns the value of the '<em><b>Num Patterns Empty</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Patterns Empty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Patterns Empty</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getEsxFile_NumPatternsEmpty()
	 * @model default="0" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getNumPatternsEmpty();

	/**
	 * Returns the value of the '<em><b>Num Patterns Not Empty</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Patterns Not Empty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Patterns Not Empty</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getEsxFile_NumPatternsNotEmpty()
	 * @model default="0" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getNumPatternsNotEmpty();

	/**
	 * Returns the value of the '<em><b>Num Samples Empty</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Samples Empty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Samples Empty</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getEsxFile_NumSamplesEmpty()
	 * @model default="0" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getNumSamplesEmpty();

	/**
	 * Returns the value of the '<em><b>Num Samples Not Empty</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Samples Not Empty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Samples Not Empty</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getEsxFile_NumSamplesNotEmpty()
	 * @model default="0" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getNumSamplesNotEmpty();

	/**
	 * Returns the value of the '<em><b>Num Samples Mono Empty</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Samples Mono Empty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Samples Mono Empty</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getEsxFile_NumSamplesMonoEmpty()
	 * @model default="0" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getNumSamplesMonoEmpty();

	/**
	 * Returns the value of the '<em><b>Num Samples Mono Not Empty</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Samples Mono Not Empty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Samples Mono Not Empty</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getEsxFile_NumSamplesMonoNotEmpty()
	 * @model default="0" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getNumSamplesMonoNotEmpty();

	/**
	 * Returns the value of the '<em><b>Num Samples Stereo Empty</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Samples Stereo Empty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Samples Stereo Empty</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getEsxFile_NumSamplesStereoEmpty()
	 * @model default="0" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getNumSamplesStereoEmpty();

	/**
	 * Returns the value of the '<em><b>Num Samples Stereo Not Empty</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Samples Stereo Not Empty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Samples Stereo Not Empty</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getEsxFile_NumSamplesStereoNotEmpty()
	 * @model default="0" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getNumSamplesStereoNotEmpty();

	/**
	 * Returns the value of the '<em><b>Num Songs Empty</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Songs Empty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Songs Empty</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getEsxFile_NumSongsEmpty()
	 * @model default="0" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getNumSongsEmpty();

	/**
	 * Returns the value of the '<em><b>Num Songs Not Empty</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Songs Not Empty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Songs Not Empty</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getEsxFile_NumSongsNotEmpty()
	 * @model default="0" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getNumSongsNotEmpty();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model skipSampleNumbersDataType="com.skratchdot.electribe.model.esx.ArrayList<org.eclipse.emf.ecore.EIntegerObject>"
	 * @generated
	 */
	int findFirstEmptySample(boolean searchMono, boolean searchStereo, int startingSampleNumber, ArrayList<Integer> skipSampleNumbers);

	void write(EsxRandomAccess out, IProgressMonitor monitor) throws IOException, EsxException;

}

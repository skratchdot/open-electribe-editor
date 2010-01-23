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
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getBlankPattern <em>Blank Pattern</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getBlankSong <em>Blank Song</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getMemUsedInBytes <em>Mem Used In Bytes</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getMemFreeInBytes <em>Mem Free In Bytes</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getNumPatternsUsed <em>Num Patterns Used</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesUsed <em>Num Samples Used</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesMonoUsed <em>Num Samples Mono Used</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getNumSamplesStereoUsed <em>Num Samples Stereo Used</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.EsxFile#getNumSongsUsed <em>Num Songs Used</em>}</li>
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
	 * Returns the value of the '<em><b>Blank Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blank Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blank Pattern</em>' containment reference.
	 * @see #setBlankPattern(Pattern)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getEsxFile_BlankPattern()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Pattern getBlankPattern();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.EsxFile#getBlankPattern <em>Blank Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blank Pattern</em>' containment reference.
	 * @see #getBlankPattern()
	 * @generated
	 */
	void setBlankPattern(Pattern value);

	/**
	 * Returns the value of the '<em><b>Blank Song</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blank Song</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blank Song</em>' containment reference.
	 * @see #setBlankSong(Song)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getEsxFile_BlankSong()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Song getBlankSong();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.EsxFile#getBlankSong <em>Blank Song</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blank Song</em>' containment reference.
	 * @see #getBlankSong()
	 * @generated
	 */
	void setBlankSong(Song value);

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
	 * Returns the value of the '<em><b>Num Patterns Used</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Patterns Used</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Patterns Used</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getEsxFile_NumPatternsUsed()
	 * @model default="0" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getNumPatternsUsed();

	/**
	 * Returns the value of the '<em><b>Num Samples Used</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Samples Used</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Samples Used</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getEsxFile_NumSamplesUsed()
	 * @model default="0" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getNumSamplesUsed();

	/**
	 * Returns the value of the '<em><b>Num Samples Mono Used</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Samples Mono Used</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Samples Mono Used</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getEsxFile_NumSamplesMonoUsed()
	 * @model default="0" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getNumSamplesMonoUsed();

	/**
	 * Returns the value of the '<em><b>Num Samples Stereo Used</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Samples Stereo Used</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Samples Stereo Used</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getEsxFile_NumSamplesStereoUsed()
	 * @model default="0" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getNumSamplesStereoUsed();

	/**
	 * Returns the value of the '<em><b>Num Songs Used</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Songs Used</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Songs Used</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getEsxFile_NumSongsUsed()
	 * @model default="0" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getNumSongsUsed();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model skipSampleNumbersDataType="com.skratchdot.electribe.model.esx.ArrayList<org.eclipse.emf.ecore.EIntegerObject>"
	 * @generated
	 */
	int findFirstUnusedSample(boolean searchMono, boolean searchStereo, int startingSampleNumber, ArrayList<Integer> skipSampleNumbers);

	void write(EsxRandomAccess out, IProgressMonitor monitor) throws IOException, EsxException;

}

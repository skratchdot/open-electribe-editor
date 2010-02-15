/**
 * Copyright (c) 2010 SKRATCHDOT.COM
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
package com.skratchdot.riff.wav.impl;

import java.io.IOException;

import org.eclipse.emf.ecore.EClass;

import com.skratchdot.riff.wav.ChunkDataListTypeLabel;
import com.skratchdot.riff.wav.ChunkTypeID;
import com.skratchdot.riff.wav.RIFFWave;
import com.skratchdot.riff.wav.WavPackage;
import com.skratchdot.riff.wav.util.RiffWaveException;
import com.skratchdot.riff.wav.util.WavRandomAccessFile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chunk Data List Type Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ChunkDataListTypeLabelImpl extends ChunkDataListTypeImpl implements ChunkDataListTypeLabel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChunkDataListTypeLabelImpl() {
		super();
	}

	/**
	 * @param riffWave a valid RIFFWave object
	 * @param in a valid WavRandomAccessFile
	 * @throws RiffWaveException
	 */
	public ChunkDataListTypeLabelImpl(RIFFWave riffWave, WavRandomAccessFile in) throws RiffWaveException {
		super();
		try {
			// Check Chunk Type ID
			if(ChunkTypeID.get((int)in.readUnsignedInt())!=this.getChunkTypeID())
				throw new RiffWaveException("Invalid Chunk ID for "+this.getChunkTypeID().getLiteral());

			// Read in data size
			int chunkSize = (int) in.readUnsignedInt();

			this.setCuePointID(in.readUnsignedInt());

			int textSize = chunkSize-4;
			if(textSize>0) {
				byte[] b = new byte[textSize];
				in.readFully(b, 0, textSize);
				this.setText(b);
			}
			
		} catch (Exception e) {
			throw new RiffWaveException(e.getMessage(), e.getCause());
		}
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getChunkTypeID()
	 */
	@Override
	public ChunkTypeID getChunkTypeID() {
		return ChunkTypeID.LABL;
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getChunkTypeIDValue()
	 */
	@Override
	public int getChunkTypeIDValue() {
		return ChunkTypeID.LABL_VALUE;
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getSize()
	 */
	@Override
	public long getSize() {
		return this.getText()==null?4:4+this.getText().length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavPackage.Literals.CHUNK_DATA_LIST_TYPE_LABEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void write(RIFFWave riffWave, WavRandomAccessFile out) throws IOException {
		out.writeUnsignedInt(this.getChunkTypeIDValue());
		out.writeUnsignedInt(this.getSize());
		out.writeUnsignedInt(this.getCuePointID());
		if(this.getText()!=null) {
			out.write(this.getText());
		}
	}

} //ChunkDataListTypeLabelImpl

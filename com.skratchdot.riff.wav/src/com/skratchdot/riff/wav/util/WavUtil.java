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
package com.skratchdot.riff.wav.util;

import com.skratchdot.riff.wav.Chunk;
import com.skratchdot.riff.wav.ChunkTypeID;
import com.skratchdot.riff.wav.ParseChunkException;
import com.skratchdot.riff.wav.RIFFWave;
import com.skratchdot.riff.wav.WavFactory;

public class WavUtil {

	/**
	 * @param riffWave a valid RIFFWave object (in case we need to log ParseChunkExceptions)
	 * @param in a valid WavRandomAccessFile with it's current FilePointer at the beginning of the chunk
	 * @return Returns a Chunk if successful, else returns null.
	 */
	public static Chunk parseChunk(RIFFWave riffWave, WavRandomAccessFile in) {
		try {
			// Starting to read in chunks
			long initialPointer = in.getFilePointer();
			int chunkID = in.readInt();
			in.seek(initialPointer);

			switch(chunkID) {
				case ChunkTypeID.CUE__VALUE: return WavFactory.eINSTANCE.createChunkCue(riffWave, in);
				case ChunkTypeID.DATA_VALUE: return WavFactory.eINSTANCE.createChunkData(riffWave, in);
				case ChunkTypeID.LIST_VALUE: return WavFactory.eINSTANCE.createChunkDataList(riffWave, in);
				case ChunkTypeID.LABL_VALUE: return WavFactory.eINSTANCE.createChunkDataListTypeLabel(riffWave, in);
				case ChunkTypeID.LTXT_VALUE: return WavFactory.eINSTANCE.createChunkDataListTypeLabeledText(riffWave, in);
				case ChunkTypeID.NOTE_VALUE: return WavFactory.eINSTANCE.createChunkDataListTypeNote(riffWave, in);
				case ChunkTypeID.FACT_VALUE: return WavFactory.eINSTANCE.createChunkFact(riffWave, in);
				case ChunkTypeID.FMT__VALUE: return WavFactory.eINSTANCE.createChunkFormat(riffWave, in);
				case ChunkTypeID.INST_VALUE: return WavFactory.eINSTANCE.createChunkInstrument(riffWave, in);
				case ChunkTypeID.PLST_VALUE: return WavFactory.eINSTANCE.createChunkPlayList(riffWave, in);
				case ChunkTypeID.SMPL_VALUE: return WavFactory.eINSTANCE.createChunkSampler(riffWave, in);
				case ChunkTypeID.SINT_VALUE: return WavFactory.eINSTANCE.createChunkSilent(riffWave, in);
				case ChunkTypeID.WAVL_VALUE: return WavFactory.eINSTANCE.createChunkWaveList(riffWave, in);
				default: return WavFactory.eINSTANCE.createChunkUnknown(riffWave, in);
			}
			
			
		} catch (Exception e) {
			ParseChunkException pce = WavFactory.eINSTANCE.createParseChunkException();
			pce.setException(e);
			riffWave.getParseChunkExceptions().add(pce);
		}
		return null;
	}

}

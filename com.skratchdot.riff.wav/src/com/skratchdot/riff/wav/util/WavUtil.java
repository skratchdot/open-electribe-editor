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
package com.skratchdot.riff.wav.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.skratchdot.riff.wav.Chunk;
import com.skratchdot.riff.wav.ChunkTypeID;
import com.skratchdot.riff.wav.ParseChunkException;
import com.skratchdot.riff.wav.RIFFWave;
import com.skratchdot.riff.wav.WavFactory;

public class WavUtil {

	/**
	 * @param file
	 * @return
	 * @throws IOException
	 */
	public static byte[] getBytesFromFile(File file) throws IOException {
		InputStream is = new FileInputStream(file);

		// Get the size of the file
		long length = file.length();

		if (length > Integer.MAX_VALUE) {
			// File is too large
		}

		// Create the byte array to hold the data
		byte[] bytes = new byte[(int) length];

		// Read in the bytes
		int offset = 0;
		int numRead = 0;
		while (offset < bytes.length
				&& (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
			offset += numRead;
		}

		// Ensure all the bytes have been read in
		if (offset < bytes.length) {
			throw new IOException("Could not completely read file "
					+ file.getName());
		}

		// Close the input stream and return bytes
		is.close();
		return bytes;
	}

	/**
	 * @param in
	 * @return
	 * @throws IOException
	 */
	public static byte[] inputStreamToByteArray(InputStream in)
			throws IOException {
		int len = 0;
		int available = in.available();
		int bufferSize = 1024;

		// Set bigger bufferSize
		if (available > bufferSize) {
			bufferSize = available;
		}

		// Allocate buffers
		ByteArrayOutputStream out = new ByteArrayOutputStream(bufferSize);
		byte[] buffer = new byte[bufferSize];

		// Read in data
		while ((len = in.read(buffer)) >= 0) {
			out.write(buffer, 0, len);
		}

		// Close streams
		in.close();
		out.close();

		return out.toByteArray();
	}

	/**
	 * @param riffWave a valid RIFFWave object (in case we need to log ParseChunkExceptions)
	 * @param in a valid WavRandomAccessFile with it's current FilePointer at the beginning of the chunk
	 * @return Returns a Chunk if successful, else returns null.
	 */
	public static Chunk parseChunk(RIFFWave riffWave, ExtendedByteBuffer buf) {
		try {
			Chunk returnChunk;

			// Starting to read in chunks
			int initialPointer = buf.position();
			int chunkID = buf.getInt();
			buf.position((int) initialPointer);

			switch (chunkID) {
			case ChunkTypeID.CUE__VALUE:
				returnChunk = WavFactory.eINSTANCE.createChunkCue();
				break;
			case ChunkTypeID.DATA_VALUE:
				returnChunk = WavFactory.eINSTANCE.createChunkData();
				break;
			case ChunkTypeID.LIST_VALUE:
				returnChunk = WavFactory.eINSTANCE.createChunkDataList();
				break;
			case ChunkTypeID.LABL_VALUE:
				returnChunk = WavFactory.eINSTANCE
						.createChunkDataListTypeLabel();
				break;
			case ChunkTypeID.LTXT_VALUE:
				returnChunk = WavFactory.eINSTANCE
						.createChunkDataListTypeLabeledText();
				break;
			case ChunkTypeID.NOTE_VALUE:
				returnChunk = WavFactory.eINSTANCE
						.createChunkDataListTypeNote();
				break;
			case ChunkTypeID.FACT_VALUE:
				returnChunk = WavFactory.eINSTANCE.createChunkFact();
				break;
			case ChunkTypeID.FMT__VALUE:
				returnChunk = WavFactory.eINSTANCE.createChunkFormat();
				break;
			case ChunkTypeID.INST_VALUE:
				returnChunk = WavFactory.eINSTANCE.createChunkInstrument();
				break;
			case ChunkTypeID.PLST_VALUE:
				returnChunk = WavFactory.eINSTANCE.createChunkPlayList();
				break;
			case ChunkTypeID.SMPL_VALUE:
				returnChunk = WavFactory.eINSTANCE.createChunkSampler();
				break;
			case ChunkTypeID.SINT_VALUE:
				returnChunk = WavFactory.eINSTANCE.createChunkSilent();
				break;
			case ChunkTypeID.WAVL_VALUE:
				returnChunk = WavFactory.eINSTANCE.createChunkWaveList();
				break;
			default:
				returnChunk = WavFactory.eINSTANCE.createChunkUnknown();
				break;
			}

			returnChunk.init(riffWave, buf);
			return returnChunk;

		} catch (Exception e) {
			ParseChunkException pce = WavFactory.eINSTANCE
					.createParseChunkException();
			pce.setException(e);
			riffWave.getParseChunkExceptions().add(pce);
		}
		return null;
	}

}

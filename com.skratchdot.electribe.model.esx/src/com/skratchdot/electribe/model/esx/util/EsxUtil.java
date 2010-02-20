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
package com.skratchdot.electribe.model.esx.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EsxUtil {
	public static final int DEFAULT_SAMPLING_RATE = 44100;

	// 0x00000000 -> 0x00000200 (32 unknown bytes)
	public static final int ADDR_VALID_ESX_CHECK_1		= 0x00000000;	// K O R G . . . 0x71 E S X

	// 192 bytes
	public static final int ADDR_GLOBAL_PARAMETERS		= 0x00000020;

	// 0x000000E0 -> 0x00000200 (288 unknown/reserved? bytes)
	public static final int ADDR_UNKNOWN_SECTION_1		= 0x000000E0;

	// 256 patterns at 4280 bytes each
	public static final int ADDR_PATTERN_DATA			= 0x00000200;

	// After getting to ADDR_PATTERN_DATA, the
	// PART data starts at the given offsets.
	public static final int PATTERN_OFFSET_PARTS_DRUM			= 24;
	public static final int PATTERN_OFFSET_PARTS_KEYBOARD		= 330;
	public static final int PATTERN_OFFSET_PARTS_STRETCHSLICE 	= 878;
	public static final int PATTERN_OFFSET_PARTS_AUDIOIN		= 974;
	public static final int PATTERN_OFFSET_PARTS_ACCENT			= 1130;
	public static final int PATTERN_OFFSET_PARAMETERS_FX		= 1148;
	public static final int PATTERN_OFFSET_PARAMETERS_MOTION	= 1160;

	// 0x0010BA00 -> 0x00130000 (148992 unknown/reserved? bytes)
	public static final int ADDR_UNKNOWN_SECTION_2		= 0x0010BA00;

	// 64 songs at 528 bytes each
	public static final int ADDR_SONG_DATA				= 0x00130000;

	// Up to 20000 song events at 8 bytes each
	public static final int ADDR_SONG_EVENT_DATA		= 0x00138400;

	// 0x0015F500 -> 0x001B0000 (330496 unknown/reserved? bytes)
	public static final int ADDR_UNKNOWN_SECTION_3	 	= 0x0015F500;

	// 0x001B0000 -> 0x001B0020 (32 unknown bytes)
	public static final int ADDR_VALID_ESX_CHECK_2		= 0x001B0000;	// K O R G . . . 0x71 B P S

	// Number of mono samples being used (4 bytes)
	public static final int ADDR_NUM_MONO_SAMPLES		= 0x001B0020;

	// Number of stereo samples being used (4 bytes)
	public static final int ADDR_NUM_STEREO_SAMPLES		= 0x001B0024;

	// Current offset
	public static final int ADDR_CURRENT_OFFSET			= 0x001B0028;

	// 0x001B002C -> 0x001B0100 (212 unknown bytes) - likely all null
	public static final int ADDR_DISK_SPACE				= 0x001B0028;	// 4 bytes

	// 256 mono sample headers at 40 bytes each
	public static final int ADDR_SAMPLE_HEADER_MONO	= 0x001B0100;

	// 128 stereo sample headers at 44 bytes each
	public static final int ADDR_SAMPLE_HEADER_STEREO	= 0x001B2900;

	public static final int ADDR_UNKNOWN_SECTION_4 		= 0x001B3F00;
	public static final int ADDR_SLICE_DATA				= 0x001B4200;
	public static final int ADDR_SAMPLE_DATA			= 0x00250000;

	public static final int CHUNKSIZE_GLOBAL_PARAMETERS = 192;
	public static final int CHUNKSIZE_PATTERN = 4280;
	public static final int CHUNKSIZE_SONG = 528;
	public static final int CHUNKSIZE_SONG_EVENT = 8;
	public static final int CHUNKSIZE_SAMPLE_HEADER_MONO = 40;
	public static final int CHUNKSIZE_SAMPLE_HEADER_STEREO = 44;
	public static final int CHUNKSIZE_PARAMETERS_FX = 4;
	public static final int CHUNKSIZE_PARAMETERS_MOTION = 130;
	public static final int CHUNKSIZE_PARTS_DRUM = 34;
	public static final int CHUNKSIZE_PARTS_KEYBOARD = 274;
	public static final int CHUNKSIZE_PARTS_STRETCHSLICE = 32;
	public static final int CHUNKSIZE_PARTS_ACCENT = 18;
	public static final int CHUNKSIZE_PARTS_AUDIOIN = 156;
	public static final int CHUNKSIZE_SLICE_DATA = 2048;

	public static final int NUM_MIDI_CHANNELS = 3;
	public static final int NUM_PART_NOTE_NUMBERS = 13;
	public static final int NUM_MIDI_CONTROL_CHANGE_ASSIGNMENTS = 33;
	public static final int NUM_PATTERN_SET_PARAMETERS = 128;
	public static final int NUM_PATTERNS = 256;
	public static final int NUM_SONGS = 64;
	public static final int NUM_SONG_PATTERNS = 256;
	public static final int NUM_SAMPLES_MONO = 256;
	public static final int NUM_SAMPLES_STEREO = 128;
	public static final int NUM_SAMPLES = NUM_SAMPLES_MONO + NUM_SAMPLES_STEREO;
	public static final int NUM_PARAMETERS_FX = 3;
	public static final int NUM_PARAMETERS_MOTION = 24;
	public static final int NUM_MOTION_OPERATIONS = 128;
	public static final int NUM_PARTS = 16;
	public static final int NUM_PARTS_DRUM = 9;
	public static final int NUM_PARTS_KEYBOARD = 2;
	public static final int NUM_PARTS_STRETCHSLICE = 3;
	public static final int NUM_PARTS_ACCENT = 1;
	public static final int NUM_PARTS_AUDIOIN = 1;
	public static final int NUM_SEQUENCE_DATA = 16;
	public static final int NUM_SEQUENCE_DATA_GATE = 128;
	public static final int NUM_SEQUENCE_DATA_NOTE = 128;
	public static final int NUM_SLICE_DATA = 256;

	public static final int MAX_NUM_SAMPLES = 12582911;
	public static final int MAX_NUM_SONG_EVENTS = 20000;
	public static final int SIZE_FILE_MIN = 0x00250010;
	public static final int SIZE_FILE_MAX = SIZE_FILE_MIN + (MAX_NUM_SAMPLES*2);

	public static int packInt(int packedInt, int inputValue, int numBits, int numShiftedLeft) {
		//	The comments below assume we are passing in:
		//		packedInt		= yyyy yyyy
		//		inputValue		= 0000 0010  HEX: 0x02  DEC: 2
		//		numBits			= 3
		//		numShiftedLeft	= 4
		//	We want to end up with: y010 yyyy

		int bitsUnshifted = (int) (Math.pow(2, numBits) - 1);	// 0000 0111
		int bitsShifted = bitsUnshifted << numShiftedLeft;		// 0111 0000
		int shiftedInputValue = inputValue << numShiftedLeft;	// 0010 0000

		packedInt = packedInt & (~bitsShifted);					// y000 yyyy
		packedInt = packedInt | shiftedInputValue;				// y010 yyyy
		return packedInt;
	}

	public static int unpackInt(int packedInt, int numBits, int numShiftedLeft) {
		//	The comments below assume we are passing in:
		//		packedInt		= y010 yyyy
		//		numBits			= 3
		//		numShiftedLeft	= 4
		//	We want to end up with: 0000 0010

		int bitsUnshifted = (int) (Math.pow(2, numBits) - 1);	// 0000 0111
		int bitsShifted = bitsUnshifted << numShiftedLeft;		// 0111 0000
		int outputValue = packedInt & bitsShifted;				// 0yyy 0000
		return outputValue >> numShiftedLeft;					// 0000 0yyy
	}

	public static byte[] getByteArrayWithLength(String input, int length, byte fillByte) {
		byte[] b = new byte[length];
		int i=0;
		for(i=0; i<input.length() && i<length; i++) {
			b[i] = (byte) input.charAt(i);
		}
		for(;i<length; i++) {
			b[i] = fillByte;
		}
		return b;
	}

	public static List<Byte> byteArrayToList(byte[] byteArray) {
		List<Byte> list = new ArrayList<Byte>();
		for(byte b : byteArray) {
			list.add(b);
		}
		return list;
	}

	public static byte[] listToByteArray(List<Byte> list){
		byte[] byteArray = new byte[list.size()];
		for(int i = 0; i<list.size(); i++) {
			byteArray[i] = list.get(i);
		}
		return byteArray;
	}
	
	public static boolean isValidEsxFile(EsxRandomAccess in) throws EsxException, IOException {
		// File is not big enough
		if (in.length() < SIZE_FILE_MIN)
			throw new EsxException("Invalid Esx File Format: File is too small");

		// File is too big
		if (in.length() > SIZE_FILE_MAX)
			throw new EsxException("Invalid Esx File Format: File is too big");

		// ESX Check 1
		byte[] byteCheckOne = new byte[12];
		in.seek(ADDR_VALID_ESX_CHECK_1);
		in.read(byteCheckOne, 0, 12);
		if (
				byteCheckOne[0]  != 0x4b || // K
				byteCheckOne[1]  != 0x4f || // O
				byteCheckOne[2]  != 0x52 || // R
				byteCheckOne[3]  != 0x47 || // G
				byteCheckOne[4]  != 0x00 || // .
				byteCheckOne[5]  != 0x00 || // .
				byteCheckOne[6]  != 0x00 || // .
				byteCheckOne[7]  != 0x71 || // 0x71
				byteCheckOne[8]  != 0x45 || // E
				byteCheckOne[9]  != 0x53 || // S
				byteCheckOne[10] != 0x58 || // X
				byteCheckOne[11] != 0x00    // .
			)
			throw new EsxException("Invalid Esx File Format: Failed Esx Check 1");

		// ESX Check 2
		byte[] byteCheckTwo = new byte[12];
		in.seek(ADDR_VALID_ESX_CHECK_2);
		in.read(byteCheckTwo, 0, 12);
		if (
				byteCheckTwo[0]  != 0x4b || // K
				byteCheckTwo[1]  != 0x4f || // O
				byteCheckTwo[2]  != 0x52 || // R
				byteCheckTwo[3]  != 0x47 || // G
				byteCheckTwo[4]  != 0x00 || // .
				byteCheckTwo[5]  != 0x00 || // .
				byteCheckTwo[6]  != 0x00 || // .
				byteCheckTwo[7]  != 0x71 /*|| // 0x71
				byteCheckTwo[8]  != 0x42 || // B
				byteCheckTwo[9]  != 0x50 || // P
				byteCheckTwo[10] != 0x53 || // S
				byteCheckTwo[11] != 0x20    // .
				*/
			)
			throw new EsxException("Invalid Esx File Format: Failed Esx Check 2");

		// File must be valid if we've reached this point
		return true;
	}

	/**
	 * Returns a file path in the format: "[directory]/[prefix]_[TIMESTAMP].esx"
	 * @param directory A valid directory.
	 * @param prefix 
	 * @return returns a path name for a temporary .esx file
	 */
	public static String getTempEsxFilePath(File directory, String prefix) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
		String defaultTempFilePath = directory.getAbsolutePath() + 
			File.separatorChar + prefix + "_" +
			dateFormat.format(new Date()) +
			".esx";
		return defaultTempFilePath;
	}

	/**
	 * This removes all "esxLoad_*.esx" and "esxSave_*.esx" files
	 * from the given directory.
	 * @param directory A valid directory.
	 */
	public static void clearTempDirectory(File directory) {
		if(!directory.isDirectory()) return;

		File[] tempFiles = directory.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File fDir, String strName) {
				return (
					(strName.startsWith("esxLoad_") || strName.startsWith("esxSave_"))
					&& strName.endsWith(".esx")
				);
			}
		});

		for (int i=0; i<tempFiles.length; i++) {
			tempFiles[i].delete();
		}
	}
	
	/**
	 * @param in Input (source) file.
	 * @param out Output (destination) file
	 * @throws IOException
	 */
	public static void copyFile(File in, File out) throws IOException {
		FileChannel inChannel = new FileInputStream(in).getChannel();
		FileChannel outChannel = new FileOutputStream(out).getChannel();
		try {
			inChannel.transferTo(0, inChannel.size(), outChannel);
		} catch (IOException e) {
			throw e;
		} finally {
			if (inChannel != null) inChannel.close();
			if (outChannel != null) outChannel.close();
		}
	}

}

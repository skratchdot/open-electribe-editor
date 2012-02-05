/*******************************************************************************
 * Copyright (c) 2009, 2012 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    JEFF |:at:| SKRATCHDOT |:dot:| COM
 *******************************************************************************/
package com.skratchdot.riff.wav.util;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/**
 * A RandomAccessFile wrapper that converts data to Little Endian format.
 * 
 * @author jeff@skratchdot.com
 */
public final class WavRandomAccessFile implements DataInput, DataOutput {
	private final RandomAccessFile raf;

	/**
	 * @see java.io.RandomAccessFile#RandomAccessFile(File, String)
	 * @param file
	 * @param mode
	 * @throws FileNotFoundException
	 */
	public WavRandomAccessFile(File file, String mode)
			throws FileNotFoundException {
		this.raf = new RandomAccessFile(file, mode);
	}

	/**
	 * @see java.io.RandomAccessFile#RandomAccessFile(String, String)
	 * @param name
	 * @param mode
	 * @throws FileNotFoundException
	 */
	public WavRandomAccessFile(String name, String mode)
			throws FileNotFoundException {
		this.raf = new RandomAccessFile(name, mode);
	}

	/**
	 * @see java.io.RandomAccessFile#read(byte[])
	 * @param b
	 * @return
	 * @throws IOException
	 */
	public int read(byte[] b) throws IOException {
		return raf.read(b);
	}

	public boolean readBoolean() throws IOException {
		return raf.readBoolean();
	}

	public byte readByte() throws IOException {
		return raf.readByte();
	}

	public char readChar() throws IOException {
		return Character.reverseBytes(raf.readChar());
	}

	public double readDouble() throws IOException {
		return Double.longBitsToDouble(Long.reverseBytes(raf.readLong()));
	}

	public float readFloat() throws IOException {
		return Float.intBitsToFloat(Integer.reverseBytes(raf.readInt()));
	}

	public void readFully(byte[] b) throws IOException {
		// TODO: Doesn't convert to Little Endian
		raf.readFully(b);
	}

	public void readFully(byte[] b, int off, int len) throws IOException {
		// TODO: Doesn't convert to Little Endian
		raf.readFully(b, off, len);
	}

	public int readInt() throws IOException {
		return Integer.reverseBytes(raf.readInt());
	}

	public String readLine() throws IOException {
		// TODO: Doesn't convert to Little Endian
		return raf.readLine();
	}

	public long readLong() throws IOException {
		return Long.reverseBytes(raf.readLong());
	}

	public short readShort() throws IOException {
		return Short.reverseBytes(raf.readShort());
	}

	public String readUTF() throws IOException {
		// TODO: Doesn't convert to Little Endian
		return raf.readUTF();
	}

	public int readUnsignedByte() throws IOException {
		return (int) this.readByte();
	}

	public int readUnsignedShort() throws IOException {
		/*
		 * int i = (int) this.readShort(); return i<0?i+Short.MAX_VALUE:i;
		 */
		return (int) this.readShort();
	}

	public long readUnsignedInt() throws IOException {
		return (long) this.readInt();
	}

	public int skipBytes(int n) throws IOException {
		return raf.skipBytes(n);
	}

	public void write(int b) throws IOException {
		raf.write(b);
	}

	public void write(byte[] b) throws IOException {
		raf.write(b);
	}

	public void write(byte[] b, int off, int len) throws IOException {
		raf.write(b, off, len);
	}

	public void writeBoolean(boolean v) throws IOException {
		raf.writeBoolean(v);
	}

	public void writeByte(int v) throws IOException {
		raf.writeByte(v);
	}

	public void writeBytes(String s) throws IOException {
		raf.writeBytes(s);
	}

	public void writeChar(int v) throws IOException {
		raf.writeChar(Integer.reverseBytes(v));
	}

	public void writeChars(String s) throws IOException {
		raf.writeChars(s);
	}

	public void writeDouble(double v) throws IOException {
		long l = Double.doubleToLongBits(v);
		double d = Double.longBitsToDouble(Long.reverseBytes(l));
		raf.writeDouble(d);
	}

	public void writeFloat(float v) throws IOException {
		int i = Float.floatToIntBits(v);
		float f = Float.intBitsToFloat(Integer.reverseBytes(i));
		raf.writeFloat(f);
	}

	public void writeInt(int v) throws IOException {
		raf.writeInt(Integer.reverseBytes(v));
	}

	public void writeLong(long v) throws IOException {
		raf.writeLong(Long.reverseBytes(v));
	}

	public void writeShort(int v) throws IOException {
		raf.writeShort(Integer.reverseBytes(v));
	}

	/**
	 * @see java.io.RandomAccessFile#writeShort(int)
	 * @param v
	 * @throws IOException
	 */
	public void writeShort(short v) throws IOException {
		raf.writeShort(Short.reverseBytes(v));
	}

	/**
	 * @param v
	 * @throws IOException
	 */
	public void writeUnsignedShort(int v) throws IOException {
		raf.writeShort(Short.reverseBytes((short) v));
	}

	/**
	 * @param v
	 * @throws IOException
	 */
	public void writeUnsignedInt(long v) throws IOException {
		raf.writeInt(Integer.reverseBytes((int) v));
	}

	public void writeUTF(String s) throws IOException {
		raf.writeUTF(s);
	}

	/**
	 * @see java.io.RandomAccessFile#length()
	 * @return
	 * @throws IOException
	 */
	public long length() throws IOException {
		return raf.length();
	}

	/**
	 * @see java.io.RandomAccessFile#getChannel()
	 * @return
	 */
	public final FileChannel getChannel() {
		return raf.getChannel();
	}

	/**
	 * @see java.io.RandomAccessFile#getFilePointer()
	 * @return
	 * @throws IOException
	 */
	public long getFilePointer() throws IOException {
		return raf.getFilePointer();
	}

	/**
	 * @see java.io.RandomAccessFile#seek(long)
	 * @param pos
	 * @throws IOException
	 */
	public void seek(long pos) throws IOException {
		raf.seek(pos);
	}

	/**
	 * @return Returns the RandomAccessFile that this class wraps
	 * @throws IOException
	 */
	public RandomAccessFile getRandomAccessFile() throws IOException {
		return raf;
	}

	/**
	 * If the filepointer is currently at an odd position, it will advance to an
	 * even position.
	 * 
	 * @throws IOException
	 */
	public void blockAlign() throws IOException {
		if (raf.getFilePointer() % 2 == 1) {
			raf.seek(raf.getFilePointer() + 1);
		}
	}

	/**
	 * If the filepointer is currently at an odd position, it will advance to an
	 * even position by writing a byte with value 0x00.
	 * 
	 * @throws IOException
	 */
	public void writeBlockAlign() throws IOException {
		if (raf.getFilePointer() % 2 == 1) {
			raf.writeByte(0);
		}
	}

	/**
	 * @see java.io.RandomAccessFile#close()
	 * @throws IOException
	 */
	public void close() throws IOException {
		raf.close();
	}

}

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

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

/**
 * A wrapper class for ByteBuffer that extends functionality to allow for
 * reading and putting unsigned data types.
 * @see java.nio.ByteBuffer
 */
public class ExtendedByteBuffer  {
	private ByteBuffer buf = null;

	/**
	 * Allocates an ExtendedByteBuffer by calling {@link java.nio.ByteBuffer#allocate(int)} internally
	 * @see java.nio.ByteBuffer#allocate(int)
	 * @param capacity
	 */
	public ExtendedByteBuffer(int capacity) {
		buf = ByteBuffer.allocate(capacity);
	}

	/**
	 * Allocates an ExtendedByteBuffer by calling {@link java.nio.ByteBuffer#allocate(int)} internally
	 * @see java.nio.ByteBuffer#allocate(int)
	 * @param capacity
	 * @param isDirect whether or not to internally call {@link java.nio.ByteBuffer#allocate(int)} or {@link java.nio.ByteBuffer#allocateDirect(int)}
	 */
	public ExtendedByteBuffer(int capacity, boolean isDirect) {
		if(isDirect) {
			buf = ByteBuffer.allocateDirect(capacity);
		}
		else {
			buf = ByteBuffer.allocate(capacity);
		}
	}
	
	/**
	 * Allocates an ExtendedByteBuffer by calling {@link java.nio.ByteBuffer#wrap(byte[])} internally
	 * @param array
	 */
	public ExtendedByteBuffer(byte[] array) {
		buf = ByteBuffer.wrap(array);
	}

	/**
	 * Allocates an ExtendedByteBuffer by calling {@link java.nio.ByteBuffer#wrap(byte[], int, int)} internally
	 * @param array
	 * @param offset
	 * @param length
	 */
	public ExtendedByteBuffer(byte[] array, int offset, int length) {
		buf = ByteBuffer.wrap(array, offset, length);
	}
	
	/**
	 * @return
	 * @see java.nio.ByteBuffer#array()
	 */
	public final byte[] array() {
		return buf.array();
	}

	/**
	 * @return
	 * @see java.nio.ByteBuffer#arrayOffset()
	 */
	public final int arrayOffset() {
		return buf.arrayOffset();
	}

	/**
	 * @return returns the ByteBuffer that is being wrapped by the ExtendedByteBuffer class
	 */
	public ByteBuffer asByteBuffer() {
		return buf;
	}

	/**
	 * @return
	 * @see java.nio.ByteBuffer#asCharBuffer()
	 */
	public CharBuffer asCharBuffer() {
		return buf.asCharBuffer();
	}

	/**
	 * @return
	 * @see java.nio.ByteBuffer#asDoubleBuffer()
	 */
	public DoubleBuffer asDoubleBuffer() {
		return buf.asDoubleBuffer();
	}

	/**
	 * @return
	 * @see java.nio.ByteBuffer#asFloatBuffer()
	 */
	public FloatBuffer asFloatBuffer() {
		return buf.asFloatBuffer();
	}

	/**
	 * @return
	 * @see java.nio.ByteBuffer#asIntBuffer()
	 */
	public IntBuffer asIntBuffer() {
		return buf.asIntBuffer();
	}

	/**
	 * @return
	 * @see java.nio.ByteBuffer#asLongBuffer()
	 */
	public LongBuffer asLongBuffer() {
		return buf.asLongBuffer();
	}

	/**
	 * @return
	 * @see java.nio.ByteBuffer#asReadOnlyBuffer()
	 */
	public ByteBuffer asReadOnlyBuffer() {
		return buf.asReadOnlyBuffer();
	}

	/**
	 * @return
	 * @see java.nio.ByteBuffer#asShortBuffer()
	 */
	public ShortBuffer asShortBuffer() {
		return buf.asShortBuffer();
	}

	/**
	 * @return
	 * @see java.nio.Buffer#capacity()
	 */
	public final int capacity() {
		return buf.capacity();
	}

	/**
	 * @return
	 * @see java.nio.Buffer#clear()
	 */
	public final Buffer clear() {
		return buf.clear();
	}

	/**
	 * @return
	 * @see java.nio.ByteBuffer#compact()
	 */
	public ByteBuffer compact() {
		return buf.compact();
	}

	/**
	 * @param that
	 * @return
	 * @see java.nio.ByteBuffer#compareTo(java.nio.ByteBuffer)
	 */
	public int compareTo(ByteBuffer that) {
		return buf.compareTo(that);
	}

	/**
	 * @return
	 * @see java.nio.ByteBuffer#duplicate()
	 */
	public ByteBuffer duplicate() {
		return buf.duplicate();
	}

	/**
	 * @param ob
	 * @return
	 * @see java.nio.ByteBuffer#equals(java.lang.Object)
	 */
	public boolean equals(Object ob) {
		return buf.equals(ob);
	}

	/**
	 * @return
	 * @see java.nio.Buffer#flip()
	 */
	public final Buffer flip() {
		return buf.flip();
	}

	/**
	 * @return
	 * @see java.nio.ByteBuffer#get()
	 */
	public byte getByte() {
		return buf.get();
	}

	/**
	 * @param index
	 * @return
	 * @see java.nio.ByteBuffer#get(int)
	 */
	public byte getByte(int index) {
		return buf.get(index);
	}

	/**
	 * @param dst
	 * @return
	 * @see java.nio.ByteBuffer#get(byte[])
	 */
	public ByteBuffer getBytes(byte[] dst) {
		return buf.get(dst);
	}

	/**
	 * @param dst
	 * @param offset
	 * @param length
	 * @return
	 * @see java.nio.ByteBuffer#get(byte[], int, int)
	 */
	public ByteBuffer getBytes(byte[] dst, int offset, int length) {
		return buf.get(dst, offset, length);
	}
	
	/**
	 * @param position The position in which to start getting bytes. Must be non-negative and no larger than the current limit
	 * @param length The number of bytes to get.  Must be non-negative, and position+length should be no larger than the current limit.
	 * @return Returns a byte array from the ExtendedByteBuffer starting at the given position with the given length. New newPostion of the EsxByteBuffer will be postion+length.
	 */
	public byte[] getBytes(int position, int length) {
		byte[] returnBytes = new byte[length];
		buf.position(position);
		buf.get(returnBytes);
		return returnBytes;
	}

	/**
	 * @return
	 * @see java.nio.ByteBuffer#getChar()
	 */
	public char getChar() {
		return buf.getChar();
	}

	/**
	 * @param index
	 * @return
	 * @see java.nio.ByteBuffer#getChar(int)
	 */
	public char getChar(int index) {
		return buf.getChar(index);
	}

	/**
	 * @return
	 * @see java.nio.ByteBuffer#getDouble()
	 */
	public double getDouble() {
		return buf.getDouble();
	}

	/**
	 * @param index
	 * @return
	 * @see java.nio.ByteBuffer#getDouble(int)
	 */
	public double getDouble(int index) {
		return buf.getDouble(index);
	}

	/**
	 * @return
	 * @see java.nio.ByteBuffer#getFloat()
	 */
	public float getFloat() {
		return buf.getFloat();
	}

	/**
	 * @param index
	 * @return
	 * @see java.nio.ByteBuffer#getFloat(int)
	 */
	public float getFloat(int index) {
		return buf.getFloat(index);
	}

	/**
	 * @return
	 * @see java.nio.ByteBuffer#getInt()
	 */
	public int getInt() {
		return buf.getInt();
	}

	/**
	 * @param index
	 * @return
	 * @see java.nio.ByteBuffer#getInt(int)
	 */
	public int getInt(int index) {
		return buf.getInt(index);
	}

	/**
	 * @return
	 * @see java.nio.ByteBuffer#getLong()
	 */
	public long getLong() {
		return buf.getLong();
	}

	/**
	 * @param index
	 * @return
	 * @see java.nio.ByteBuffer#getLong(int)
	 */
	public long getLong(int index) {
		return buf.getLong(index);
	}

	/**
	 * @return
	 * @see java.nio.ByteBuffer#getShort()
	 */
	public short getShort() {
		return buf.getShort();
	}

	/**
	 * @param index
	 * @return
	 * @see java.nio.ByteBuffer#getShort(int)
	 */
	public short getShort(int index) {
		return buf.getShort(index);
	}

	/**
	 * @return
	 */
	public int getUnsignedByte() {
		return (buf.get() & 0xFF);
	}

	/**
	 * @param index
	 * @return
	 */
	public int getUnsignedByte(int index) {
		return (buf.get(index) & 0xFF);
	}

	/**
	 * @return
	 */
	public long getUnsignedInt() {
		return ((long) buf.getInt() & 0xFFFFFFFFL);
	}

	/**
	 * @param index
	 * @return
	 */
	public long getUnsignedInt(int index) {
		return ((long) buf.getInt(index) & 0xFFFFFFFFL);
	}

	/**
	 * @return
	 */
	public int getUnsignedShort() {
		return (buf.getShort() & 0xFFFF);
	}

	/**
	 * @param index
	 * @return
	 */
	public int getUnsignedShort(int index) {
		return (buf.getShort(index) & 0xFFFF);
	}

	/**
	 * @return
	 * @see java.nio.ByteBuffer#hasArray()
	 */
	public final boolean hasArray() {
		return buf.hasArray();
	}

	/**
	 * @return
	 * @see java.nio.ByteBuffer#hashCode()
	 */
	public int hashCode() {
		return buf.hashCode();
	}

	/**
	 * @return
	 * @see java.nio.Buffer#hasRemaining()
	 */
	public final boolean hasRemaining() {
		return buf.hasRemaining();
	}

	/**
	 * @return
	 * @see java.nio.ByteBuffer#isDirect()
	 */
	public boolean isDirect() {
		return buf.isDirect();
	}

	/**
	 * @return
	 * @see java.nio.Buffer#isReadOnly()
	 */
	public boolean isReadOnly() {
		return buf.isReadOnly();
	}

	/**
	 * @return
	 * @see java.nio.Buffer#limit()
	 */
	public final int limit() {
		return buf.limit();
	}

	/**
	 * @param newLimit
	 * @return
	 * @see java.nio.Buffer#limit(int)
	 */
	public final Buffer limit(int newLimit) {
		return buf.limit(newLimit);
	}

	/**
	 * @return
	 * @see java.nio.Buffer#mark()
	 */
	public final Buffer mark() {
		return buf.mark();
	}

	/**
	 * @return
	 * @see java.nio.ByteBuffer#order()
	 */
	public final ByteOrder order() {
		return buf.order();
	}

	/**
	 * @param bo
	 * @return
	 * @see java.nio.ByteBuffer#order(java.nio.ByteOrder)
	 */
	public final ByteBuffer order(ByteOrder bo) {
		return buf.order(bo);
	}

	/**
	 * @return
	 * @see java.nio.Buffer#position()
	 */
	public final int position() {
		return buf.position();
	}

	/**
	 * @param newPosition
	 * @return
	 * @see java.nio.Buffer#position(int)
	 */
	public final Buffer position(int newPosition) {
		return buf.position(newPosition);
	}

	/**
	 * @param b
	 * @return
	 * @see java.nio.ByteBuffer#put(byte)
	 */
	public ByteBuffer putByte(byte b) {
		return buf.put(b);
	}

	/**
	 * @param index
	 * @param b
	 * @return
	 * @see java.nio.ByteBuffer#put(int, byte)
	 */
	public ByteBuffer putByte(int index, byte b) {
		return buf.put(index, b);
	}

	/**
	 * @param src
	 * @return
	 * @see java.nio.ByteBuffer#put(java.nio.ByteBuffer)
	 */
	public ByteBuffer putByteBuffer(ByteBuffer src) {
		return buf.put(src);
	}

	/**
	 * @param src
	 * @return
	 * @see java.nio.ByteBuffer#put(byte[])
	 */
	public final ByteBuffer putBytes(byte[] src) {
		return buf.put(src);
	}

	/**
	 * @param src
	 * @param offset
	 * @param length
	 * @return
	 * @see java.nio.ByteBuffer#put(byte[], int, int)
	 */
	public ByteBuffer putBytes(byte[] src, int offset, int length) {
		return buf.put(src, offset, length);
	}

	/**
	 * @param value
	 * @return
	 * @see java.nio.ByteBuffer#putChar(char)
	 */
	public ByteBuffer putChar(char value) {
		return buf.putChar(value);
	}

	/**
	 * @param index
	 * @param value
	 * @return
	 * @see java.nio.ByteBuffer#putChar(int, char)
	 */
	public ByteBuffer putChar(int index, char value) {
		return buf.putChar(index, value);
	}

	/**
	 * @param value
	 * @return
	 * @see java.nio.ByteBuffer#putDouble(double)
	 */
	public ByteBuffer putDouble(double value) {
		return buf.putDouble(value);
	}

	/**
	 * @param index
	 * @param value
	 * @return
	 * @see java.nio.ByteBuffer#putDouble(int, double)
	 */
	public ByteBuffer putDouble(int index, double value) {
		return buf.putDouble(index, value);
	}

	/**
	 * @param value
	 * @return
	 * @see java.nio.ByteBuffer#putFloat(float)
	 */
	public ByteBuffer putFloat(float value) {
		return buf.putFloat(value);
	}

	/**
	 * @param index
	 * @param value
	 * @return
	 * @see java.nio.ByteBuffer#putFloat(int, float)
	 */
	public ByteBuffer putFloat(int index, float value) {
		return buf.putFloat(index, value);
	}

	/**
	 * @param index
	 * @param value
	 * @return
	 * @see java.nio.ByteBuffer#putInt(int, int)
	 */
	public ByteBuffer putInt(int index, int value) {
		return buf.putInt(index, value);
	}

	/**
	 * @param value
	 * @return
	 * @see java.nio.ByteBuffer#putInt(int)
	 */
	public ByteBuffer putInt(int value) {
		return buf.putInt(value);
	}

	/**
	 * @param index
	 * @param value
	 * @return
	 * @see java.nio.ByteBuffer#putLong(int, long)
	 */
	public ByteBuffer putLong(int index, long value) {
		return buf.putLong(index, value);
	}

	/**
	 * @param value
	 * @return
	 * @see java.nio.ByteBuffer#putLong(long)
	 */
	public ByteBuffer putLong(long value) {
		return buf.putLong(value);
	}

	/**
	 * @param index
	 * @param value
	 * @return
	 * @see java.nio.ByteBuffer#putShort(int, short)
	 */
	public ByteBuffer putShort(int index, short value) {
		return buf.putShort(index, value);
	}

	/**
	 * @param value
	 * @return
	 * @see java.nio.ByteBuffer#putShort(short)
	 */
	public ByteBuffer putShort(short value) {
		return buf.putShort(value);
	}

	/**
	 * @param value
	 */
	public void putUnsignedByte(int value) {
		buf.put((byte) (value & 0xFF));
	}

	/**
	 * @param index
	 * @param value
	 */
	public void putUnsignedByte(int index, int value) {
		buf.put(index, (byte) value);
	}

	/**
	 * @param value
	 */
	public void putUnsignedInt(long value) {
		buf.putInt((int) (value & 0xFFFFFFFFL));
	}

	/**
	 * @param index
	 * @param value
	 */
	public void putUnsignedInt(int index, long value) {
		buf.putInt(index, (int) (value & 0xFFFFFFFFL));
	}

	/**
	 * @param value
	 */
	public void putUnsignedShort(int value) {
		buf.putShort((short) (value & 0xFFFF));
	}

	/**
	 * @param index
	 * @param value
	 */
	public void putUnsignedShort(int index, int value) {
		buf.putShort(index, (short) (value & 0xFFFF));
	}

	/**
	 * @return
	 * @see java.nio.Buffer#remaining()
	 */
	public final int remaining() {
		return buf.remaining();
	}

	/**
	 * @return
	 * @see java.nio.Buffer#reset()
	 */
	public final Buffer reset() {
		return buf.reset();
	}

	/**
	 * @return
	 * @see java.nio.Buffer#rewind()
	 */
	public final Buffer rewind() {
		return buf.rewind();
	}

	/**
	 * @return
	 * @see java.nio.ByteBuffer#slice()
	 */
	public ByteBuffer slice() {
		return buf.slice();
	}

	
	
	/**
	 * @return
	 * @see java.nio.ByteBuffer#toString()
	 */
	public String toString() {
		return buf.toString();
	}

}

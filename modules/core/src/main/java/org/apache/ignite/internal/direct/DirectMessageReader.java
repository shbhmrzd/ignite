/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ignite.internal.direct;

import org.apache.ignite.lang.*;
import org.apache.ignite.plugin.extensions.communication.*;
import org.jetbrains.annotations.*;

import java.nio.*;
import java.util.*;

/**
 * Portable reader implementation.
 */
public class DirectMessageReader implements MessageReader {
    /** Stream. */
    private final DirectByteBufferStream stream;

    /** Whether last field was fully read. */
    private boolean lastRead;

    /**
     * @param msgFactory Message factory.
     */
    public DirectMessageReader(GridTcpMessageFactory msgFactory) {
        this.stream = new DirectByteBufferStream(msgFactory);
    }

    /** {@inheritDoc} */
    @Override public void setBuffer(ByteBuffer buf) {
        stream.setBuffer(buf);
    }

    /** {@inheritDoc} */
    @Override public byte readByte(String name) {
        byte val = stream.readByte();

        lastRead = stream.lastFinished();

        return val;
    }

    /** {@inheritDoc} */
    @Override public short readShort(String name) {
        short val = stream.readShort();

        lastRead = stream.lastFinished();

        return val;
    }

    /** {@inheritDoc} */
    @Override public int readInt(String name) {
        int val = stream.readInt();

        lastRead = stream.lastFinished();

        return val;
    }

    /** {@inheritDoc} */
    @Override public long readLong(String name) {
        long val = stream.readLong();

        lastRead = stream.lastFinished();

        return val;
    }

    /** {@inheritDoc} */
    @Override public float readFloat(String name) {
        float val = stream.readFloat();

        lastRead = stream.lastFinished();

        return val;
    }

    /** {@inheritDoc} */
    @Override public double readDouble(String name) {
        double val = stream.readDouble();

        lastRead = stream.lastFinished();

        return val;
    }

    /** {@inheritDoc} */
    @Override public char readChar(String name) {
        char val = stream.readChar();

        lastRead = stream.lastFinished();

        return val;
    }

    /** {@inheritDoc} */
    @Override public boolean readBoolean(String name) {
        boolean val = stream.readBoolean();

        lastRead = stream.lastFinished();

        return val;
    }

    /** {@inheritDoc} */
    @Nullable @Override public byte[] readByteArray(String name) {
        byte[] arr = stream.readByteArray();

        lastRead = stream.lastFinished();

        return arr;
    }

    /** {@inheritDoc} */
    @Nullable @Override public short[] readShortArray(String name) {
        short[] arr = stream.readShortArray();

        lastRead = stream.lastFinished();

        return arr;
    }

    /** {@inheritDoc} */
    @Nullable @Override public int[] readIntArray(String name) {
        int[] arr = stream.readIntArray();

        lastRead = stream.lastFinished();

        return arr;
    }

    /** {@inheritDoc} */
    @Nullable @Override public long[] readLongArray(String name) {
        long[] arr = stream.readLongArray();

        lastRead = stream.lastFinished();

        return arr;
    }

    /** {@inheritDoc} */
    @Nullable @Override public float[] readFloatArray(String name) {
        float[] arr = stream.readFloatArray();

        lastRead = stream.lastFinished();

        return arr;
    }

    /** {@inheritDoc} */
    @Nullable @Override public double[] readDoubleArray(String name) {
        double[] arr = stream.readDoubleArray();

        lastRead = stream.lastFinished();

        return arr;
    }

    /** {@inheritDoc} */
    @Nullable @Override public char[] readCharArray(String name) {
        char[] arr = stream.readCharArray();

        lastRead = stream.lastFinished();

        return arr;
    }

    /** {@inheritDoc} */
    @Nullable @Override public boolean[] readBooleanArray(String name) {
        boolean[] arr = stream.readBooleanArray();

        lastRead = stream.lastFinished();

        return arr;
    }

    /** {@inheritDoc} */
    @Override public String readString(String name) {
        String val = stream.readString();

        lastRead = stream.lastFinished();

        return val;
    }

    /** {@inheritDoc} */
    @Override public BitSet readBitSet(String name) {
        BitSet val = stream.readBitSet();

        lastRead = stream.lastFinished();

        return val;
    }

    /** {@inheritDoc} */
    @Override public UUID readUuid(String name) {
        UUID val = stream.readUuid();

        lastRead = stream.lastFinished();

        return val;
    }

    /** {@inheritDoc} */
    @Override public IgniteUuid readIgniteUuid(String name) {
        IgniteUuid val = stream.readIgniteUuid();

        lastRead = stream.lastFinished();

        return val;
    }

    /** {@inheritDoc} */
    @Nullable @Override public MessageAdapter readMessage(String name) {
        MessageAdapter msg = stream.readMessage();

        lastRead = stream.lastFinished();

        return msg;
    }

    /** {@inheritDoc} */
    @Override public <T> T[] readObjectArray(String name, Class<T> itemCls) {
        T[] msg = stream.readObjectArray(itemCls);

        lastRead = stream.lastFinished();

        return msg;
    }

    /** {@inheritDoc} */
    @Override public <T> Collection<T> readCollection(String name, Class<T> itemCls) {
        Collection<T> col = stream.readCollection(itemCls);

        lastRead = stream.lastFinished();

        return col;
    }

    /** {@inheritDoc} */
    @Override public <K, V> Map<K, V> readMap(String name, Class<K> keyCls, Class<V> valCls) {
        Map<K, V> map = stream.readMap(keyCls, valCls);

        lastRead = stream.lastFinished();

        return map;
    }

    /** {@inheritDoc} */
    @Override public boolean isLastRead() {
        return lastRead;
    }
}

package fr.inria.diversify;

import mockit.Mock;
import mockit.MockUp;

import java.io.BufferedOutputStream;

/**
 * Created by marodrig on 01/07/2014.
 */
public class BufferedOutputStreamMock extends MockUp<BufferedOutputStream> {
    public byte[] buffer = new byte[255];
    public int bufferSize = 0;

    @Mock
    public final void write(int b) {
        buffer[bufferSize] = (byte) b;
        bufferSize++;
    }
}
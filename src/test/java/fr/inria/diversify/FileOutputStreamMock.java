package fr.inria.diversify;

import mockit.Mock;
import mockit.MockUp;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by marodrig on 01/07/2014.
 */
public class FileOutputStreamMock extends MockUp<FileOutputStream> {
    public byte[] buffer = new byte[255];
    public int bufferSize = 0;

    @Mock
    public final void write(int b) {
        buffer[bufferSize] = (byte) b;
        bufferSize++;
    }

    @Mock
    public void write(byte b[]) throws IOException {

        write(b, 0, b.length);
    }

    @Mock
    public void write(byte b[], int off, int len) throws IOException {
        System.arraycopy(b, off, buffer, bufferSize, len );
        bufferSize += len;
    }
}
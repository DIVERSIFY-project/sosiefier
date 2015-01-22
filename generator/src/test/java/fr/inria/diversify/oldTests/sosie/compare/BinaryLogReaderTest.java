package fr.inria.diversify.oldTests.sosie.compare;

import fr.inria.diversify.ut.FileOutputStreamMock;
import fr.inria.diversify.sosie.logger.BinaryLogReader;
import fr.inria.diversify.sosie.logger.InstruBinaryLog;
import org.junit.Ignore;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by marodrig on 17/07/2014.
 */

@Ignore
public class BinaryLogReaderTest {

    private String getResourcePath(String name) throws Exception {
        return getClass().getResource("/" + name).toURI().getPath();
    }

    private void buildDataAndReader(InstruBinaryLog log, Thread t) {
        log.writeTestStart(t, "sampleTest");
        log.methodCall(t, "foo");
        log.methodOut(t);
        log.methodCall(t, "bar");
        log.writeTestStart(t, "sampleTest2");
    }

    @Test
    public void testRead_Methods() throws IOException {

        //Create some data and store the result in the mocked array instead of the file
        FileOutputStreamMock mock = new FileOutputStreamMock();
        InstruBinaryLog log = new InstruBinaryLog("logTest");
        Thread t = Thread.currentThread();

        buildDataAndReader(log, t);
        log.close();

        BinaryLogReader r = new BinaryLogReader(new DataInputStream(new ByteArrayInputStream(mock.buffer)));

        ArrayList<BinaryLogReader.LogChunk> chunks = new ArrayList<>();
        while ( !r.eof() ) {
            chunks.add(r.next());
        }

        assertEquals(5, chunks.size());
        assertTrue(chunks.get(0) instanceof BinaryLogReader.TestChunk);
        assertTrue(chunks.get(1) instanceof BinaryLogReader.MethodCallChunk);
        assertTrue(chunks.get(2) instanceof BinaryLogReader.MethodCallChunk);
        assertTrue(chunks.get(3) instanceof BinaryLogReader.TestChunk);

        BinaryLogReader.MethodCallChunk c = (BinaryLogReader.MethodCallChunk)chunks.get(2);
        assertEquals("bar", c.getSignature());
        assertEquals(2, c.getCurrentDepth());
    }

    @Test
    public void testRead_MethodsFromFile() throws Exception {

        BinaryLogReader r = new BinaryLogReader(new File(getResourcePath("tracebinarylog.log")));

        ArrayList<BinaryLogReader.LogChunk> chunks = new ArrayList<>();
        while ( !r.eof() ) {
            chunks.add(r.next());
        }

        assertEquals(10, chunks.size());
        assertTrue(chunks.get(2) instanceof BinaryLogReader.MethodCallChunk);
        assertTrue(chunks.get(8) instanceof BinaryLogReader.MethodCallChunk);

        BinaryLogReader.MethodCallChunk c = (BinaryLogReader.MethodCallChunk)chunks.get(2);
        assertEquals("void org.easymock.internal.ErrorMessage.appendTo(java.lang.StringBuilder,int)", c.getSignature());
        assertEquals(1, c.getCurrentDepth());
    }
}

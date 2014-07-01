package fr.inria.diversify.sosie.compare;

import fr.inria.diversify.BufferedOutputStreamMock;
import fr.inria.diversify.sosie.compare.stackElement.*;
import fr.inria.diversify.sosie.compare.stackElement.StackTraceElement;
import fr.inria.diversify.sosie.logger.InstruCompactLog;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

/**
 * Created by marodrig on 01/07/2014.
 */
public class StackElementReaderTest {

    private void buildDataAndReader(InstruCompactLog log, Thread t) {
        log.writeTestStart(t, "sampleTest");
        log.methodCall(t, "foo");
        log.methodOut(t);
        log.methodCall(t, "bar");
    }

    @Test
    public void testStackElementReaderTest() {

        //Create some data and store the result in the mocked array instead of the file
        BufferedOutputStreamMock mock = new BufferedOutputStreamMock();
        InstruCompactLog log = new InstruCompactLog("logTest");
        Thread t = Thread.currentThread();

        buildDataAndReader(log, t);

        //Make the reader read from the byte[] buffer
        StackElementBinaryReader reader = new StackElementBinaryReader(
                new DataInputStream(new ByteArrayInputStream(mock.buffer)));
        StackTraceElement e = reader.next();
        Assert.assertTrue(e instanceof StackTraceCall);
        Assert.assertEquals("foo", e.getMethod());
        Assert.assertEquals("bar", reader.next().getMethod());
    }



}

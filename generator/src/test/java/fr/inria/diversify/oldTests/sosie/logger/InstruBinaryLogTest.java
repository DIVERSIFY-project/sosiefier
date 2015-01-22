package fr.inria.diversify.oldTests.sosie.logger;

import fr.inria.diversify.sosie.logger.InstruBinaryLog;
import fr.inria.diversify.ut.FileOutputStreamMock;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Created by marodrig on 27/06/2014.
 */

public class InstruBinaryLogTest {


    private String getString(byte[] bytes, int size) throws UnsupportedEncodingException {
        byte[] b2 = new byte[255];
        Arrays.fill(b2, (byte)32);
        for ( int i = 0; i < size; i++ ) {
            if ( bytes[i] != 0 ) { b2[i] = bytes[i]; }
        }
        return new String(b2, "UTF-8");
    }

    @Test
    public void testCall() throws UnsupportedEncodingException {
        InstruBinaryLog log = new InstruBinaryLog("logTest");
        //Builds a mock and magically replaces the FileOutputStream. See JMockit help
        FileOutputStreamMock mock = new FileOutputStreamMock();

        Thread t = Thread.currentThread();
        log.methodCall(t, "foo");
        log.methodCall(t, "bar");
        log.methodOut(t);
        log.close();

        //Assert the call depth is OK
        Assert.assertEquals(log.getCallDeep(t), 1);

        String s = new String(mock.buffer);
        Assert.assertTrue(s.contains("foo") && s.contains("bar"));
        //3 bytes each method call, 5 bytes (size + chars) each + 1 byte close.
        Assert.assertEquals(16, mock.bufferSize - 1); //BufferSize is more like a buffer index
    }

    @Test
    public void testCallResetDepth() {
        InstruBinaryLog log = new InstruBinaryLog("logTest");
        Thread t = Thread.currentThread();
        log.methodCall(t, "foo");
        log.methodCall(t, "bar");
        log.resetCallDepth(t);
        log.close();
        Assert.assertEquals(log.getCallDeep(t), 0);
    }


    @Test
    public void testClose() {
        InstruBinaryLog log = new InstruBinaryLog("logTest");
        Thread t = Thread.currentThread();
        log.methodCall(t, "foo");
        log.close();
        Assert.assertTrue(new File(log.getThreadLogFilePath(t)).exists());
    }


    @Test
    @Ignore
    public void tesWriteTestStart() {
        Thread t = Thread.currentThread();
        //Builds a mock and magically replaces the FileOutputStream. See JMockit help
        FileOutputStreamMock mock = new FileOutputStreamMock();

        InstruBinaryLog log = new InstruBinaryLog("logTest");
        log.writeTestStart(t, "tesWriteTestStart");
        log.close();

        String s = new String(mock.buffer);
        Assert.assertTrue(s.contains("tesWriteTestStart"));
    }

    @Test
    public void testWriteAssert() {
        Thread t = Thread.currentThread();
        //Builds a mock and magically replaces the FileOutputStream. See JMockit help
        FileOutputStreamMock mock = new FileOutputStreamMock();

        InstruBinaryLog log = new InstruBinaryLog("logTest");
        Object[] a = { 0, 4 };
        log.writeAssert (5, t, "Class1", "method", "assertEquals", a);
        log.close();

        String s = new String(mock.buffer);
        Assert.assertTrue(s.contains("Class1") && s.contains("method") && s.contains("assertEquals"));
    }


    @Test
    @Ignore
    public void tesWriteVar() {
        Thread t = Thread.currentThread();
        //Builds a mock and magically replaces the FileOutputStream. See JMockit help
        FileOutputStreamMock mock = new FileOutputStreamMock();

        InstruBinaryLog log = new InstruBinaryLog("logTest");
        log.writeTestStart(t, "sampleTest");
        Object[] a = { 4, 10 };
        log.writeVar(10, t, "A", a);
        Object[] b = { 422, 1000 };
        log.writeVar(11, t, "A", b);
        log.close();

        String s = new String(mock.buffer);
        Assert.assertTrue(s.contains("A") && s.contains("422") && s.contains("1000"));
    }

    @Test
    public void testWriteException() {
        Thread t = Thread.currentThread();
        //Builds a mock and magically replaces the FileOutputStream. See JMockit help
        FileOutputStreamMock mock = new FileOutputStreamMock();

        InstruBinaryLog log = new InstruBinaryLog("logTest");
        Object[] a = { 0, 4 };
        log.writeException(5, t, a);
        log.close();

        String s = new String(mock.buffer);
        Assert.assertTrue(s.contains("Class1") && s.contains("method"));
    }

}

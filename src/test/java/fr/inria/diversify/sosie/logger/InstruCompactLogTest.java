package fr.inria.diversify.sosie.logger;

import fr.inria.diversify.BufferedOutputStreamMock;
import org.junit.Assert;
import org.junit.Test;
import java.io.File;

/**
 * Created by marodrig on 27/06/2014.
 */

public class InstruCompactLogTest {



    @Test
    public void testCall() {
        BufferedOutputStreamMock mock = new BufferedOutputStreamMock();

        InstruCompactLog log = new InstruCompactLog("logTest");
        Thread t = Thread.currentThread();
        log.methodCall(t, "foo");
        log.methodCall(t, "bar");
        log.methodOut(t);
        log.close();

        //Assert the call depth is OK
        Assert.assertEquals(log.getCallDeep(t), 1);

        Assert.assertEquals(47, mock.bufferSize);
        Assert.assertEquals(mock.buffer[0], InstruCompactLog.LOG_METHOD);
        Assert.assertEquals(mock.buffer[9], InstruCompactLog.LOG_METHOD);
    }

    @Test
    public void testCallResetDepth() {
        InstruCompactLog log = new InstruCompactLog("logTest");
        Thread t = Thread.currentThread();
        log.methodCall(t, "foo");
        log.methodCall(t, "bar");
        log.resetCallDepth(t);
        log.close();
        Assert.assertEquals(log.getCallDeep(t), 0);
    }


    @Test
    public void testClose() {
        InstruCompactLog log = new InstruCompactLog("logTest");
        Thread t = Thread.currentThread();
        log.methodCall(t, "foo");
        log.close();
        Assert.assertTrue(new File(log.getThreadLogFilePath(t)).exists());
    }


    @Test
    public void tesWriteTestStart() {
        Thread t = Thread.currentThread();

        BufferedOutputStreamMock mock = new BufferedOutputStreamMock();

        InstruCompactLog log = new InstruCompactLog("logTest");
        log.writeTestStart(t, "tesWriteTestStart");
        log.close();

        Assert.assertEquals(56, mock.bufferSize);
        Assert.assertEquals(mock.buffer[0], InstruCompactLog.LOG_TEST);
        Assert.assertEquals(log.getCallDeep(t), 1);
    }

    @Test
    public void writeAssert() {
        Thread t = Thread.currentThread();
        BufferedOutputStreamMock mock = new BufferedOutputStreamMock();

        InstruCompactLog log = new InstruCompactLog("logTest");
        Object[] a = { 0, 4 };
        log.writeAssert (5, t, "Class1", "method", "assertEquals", a);
        log.close();

        Assert.assertEquals(mock.buffer[0], InstruCompactLog.LOG_ASSERT);
        Assert.assertEquals(82, mock.bufferSize);
        Assert.assertEquals(log.getCallDeep(t), 0);
    }

    /*
    *
    public abstract void writeVar(int id, Thread thread, String methodSignatureId, Object... var);

    public abstract void writeException(int id, Thread thread,
                                        String className, String methodSignature, Object exception);

    public abstract void writeCatch(int id, Thread thread, String className, String methodSignature, Object exception);

    * */

}

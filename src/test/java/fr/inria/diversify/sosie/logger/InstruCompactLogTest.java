package fr.inria.diversify.sosie.logger;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;

/**
 * Created by marodrig on 27/06/2014.
 */
public class InstruCompactLogTest {

    @Test
    public void testCallDepth() {
        InstruCompactLog log = new InstruCompactLog("logTest");
        Thread t = Thread.currentThread();
        log.methodCall(t, "foo");
        log.methodCall(t, "bar");
        log.methodOut(t);
        log.close();
        Assert.assertEquals(log.getCallDeep(t), 1);
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


    /*
    *     public abstract void writeTestStart(Thread thread, String testSignature);

    public abstract void writeAssert(int id, Thread thread, String className,
                                     String methodSignature, String assertName, Object... var);

    public abstract void writeVar(int id, Thread thread, String methodSignatureId, Object... var);

    public abstract void writeException(int id, Thread thread,
                                        String className, String methodSignature, Object exception);

    public abstract void writeCatch(int id, Thread thread, String className, String methodSignature, Object exception);

    * */

}

package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * JUnit Test Case for {@link CloseShieldOutputStream}.
 */
public class ProxyOutputStreamTest extends TestCase {
    private ByteArrayOutputStream original;

    private OutputStream proxied;

    @Override
    protected void setUp() {
        original = new ByteArrayOutputStream() {
            @Override
            public void write(byte[] ba) throws IOException {
                if (ba != null) {
                    super.write(ba);
                } 
            }
        };
        proxied = new ProxyOutputStream(original);
    }

    public void testWrite() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite");
        proxied.write('y');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1599,original,1598,original.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1600,original.toByteArray()[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_add1063() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_add1063");
        proxied.write('y');
        proxied.write('y');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1599,original,1598,original.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1600,original.toByteArray()[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_remove830() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_remove830");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1599,original,1598,original.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1600,original.toByteArray()[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteNullBaSucceeds() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteNullBaSucceeds");
        byte[] ba = null;
        original.write(ba);
        original.write(ba);
        proxied.write(ba);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteNullBaSucceeds_add1065() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteNullBaSucceeds_add1065");
        byte[] ba = null;
        original.write(ba);
        proxied.write(ba);
        proxied.write(ba);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteNullBaSucceeds_remove831() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteNullBaSucceeds_remove831");
        byte[] ba = null;
        proxied.write(ba);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteNullBaSucceeds_remove832() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteNullBaSucceeds_remove832");
        byte[] ba = null;
        proxied.write(ba);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


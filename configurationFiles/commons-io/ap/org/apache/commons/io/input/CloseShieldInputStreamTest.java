package org.apache.commons.io.input;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * JUnit Test Case for {@link CloseShieldInputStream}.
 */
public class CloseShieldInputStreamTest extends TestCase {
    private byte[] data;

    private InputStream original;

    private InputStream shielded;

    private boolean closed;

    @Override
    protected void setUp() {
        data = new byte[]{ 'x' , 'y' , 'z' };
        original = new ByteArrayInputStream(data) {
            @Override
            public void close() {
                closed = true;
            }
        };
        shielded = new CloseShieldInputStream(original);
        closed = false;
    }

    /** 
     * Test the <code>close()</code> method.
     */
public void testClose() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose");
        shielded.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),580,closed);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),581,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),583,shielded,582,shielded.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),584,data[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),586,original,585,original.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the <code>close()</code> method.
     */
@Test(timeout = 1000)
    public void testClose_add195() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose_add195");
        shielded.close();
        shielded.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),580,closed);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),581,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),583,shielded,582,shielded.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),584,data[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),586,original,585,original.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the <code>close()</code> method.
     */
@Test(timeout = 1000)
    public void testClose_remove82() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose_remove82");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),580,closed);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),581,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),583,shielded,582,shielded.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),584,data[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),586,original,585,original.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


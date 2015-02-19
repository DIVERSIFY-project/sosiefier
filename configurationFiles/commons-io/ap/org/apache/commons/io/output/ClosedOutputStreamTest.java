package org.apache.commons.io.output;

import java.io.IOException;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * JUnit Test Case for {@link ClosedOutputStream}.
 */
public class ClosedOutputStreamTest extends TestCase {
    /** 
     * Test the <code>write(b)</code> method.
     */
public void testRead() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead");
        try {
            new ClosedOutputStream().write('x');
        } catch (IOException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the <code>write(b)</code> method.
     */
@Test(timeout = 1000)
    public void testRead_add959() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead_add959");
        try {
            new ClosedOutputStream().write('x');
            new ClosedOutputStream().write('x');
        } catch (IOException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


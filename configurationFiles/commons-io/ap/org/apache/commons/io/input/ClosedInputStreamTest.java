package org.apache.commons.io.input;

import junit.framework.TestCase;

/** 
 * JUnit Test Case for {@link ClosedInputStream}.
 */
public class ClosedInputStreamTest extends TestCase {
    /** 
     * Test the <code>read()</code> method.
     */
public void testRead() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),587,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),589,new org.apache.commons.io.input.ClosedInputStream(),588,new org.apache.commons.io.input.ClosedInputStream().read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


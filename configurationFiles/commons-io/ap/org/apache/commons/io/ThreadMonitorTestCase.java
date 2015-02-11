package org.apache.commons.io;

import org.junit.Test;
import junit.framework.TestCase;

/** 
 * Tests for {@link ThreadMonitor}.
 */
public class ThreadMonitorTestCase extends TestCase {
    public ThreadMonitorTestCase(String name) {
        super(name);
    }

    /** 
     * Test timeout.
     */
@Test(timeout = 1000)
    public void testTimeout_add2104() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTimeout_add2104");
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(100);
            Thread.sleep(200);
            Thread.sleep(200);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (InterruptedException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test timeout.
     */
@Test(timeout = 1000)
    public void testTimeout_add2105() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTimeout_add2105");
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(100);
            Thread.sleep(200);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (InterruptedException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test timeout.
     */
public void testTimeout() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTimeout");
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(101);
            Thread.sleep(200);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (InterruptedException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test timeout.
     */
public void testTimeout_literalMutation4614() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTimeout_literalMutation4614");
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(100);
            Thread.sleep(199);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (InterruptedException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test task completed before timeout.
     */
@Test(timeout = 1000)
    public void testCompletedWithoutTimeout_add2098() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompletedWithoutTimeout_add2098");
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(200);
            Thread.sleep(100);
            Thread.sleep(100);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (InterruptedException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test task completed before timeout.
     */
@Test(timeout = 1000)
    public void testCompletedWithoutTimeout_add2099() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompletedWithoutTimeout_add2099");
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(200);
            Thread.sleep(100);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (InterruptedException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test task completed before timeout.
     */
public void testCompletedWithoutTimeout() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompletedWithoutTimeout");
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(199);
            Thread.sleep(100);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (InterruptedException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test task completed before timeout.
     */
public void testCompletedWithoutTimeout_literalMutation4608() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompletedWithoutTimeout_literalMutation4608");
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(200);
            Thread.sleep(99);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (InterruptedException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test No timeout.
     */
@Test(timeout = 1000)
    public void testNoTimeout_add2100() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoTimeout_add2100");
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(-1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5752,monitor);
            Thread.sleep(100);
            Thread.sleep(100);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5753,("Timeout -1, threw " + e));
        }
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5754,monitor);
            Thread.sleep(100);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5755,("Timeout 0, threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test No timeout.
     */
@Test(timeout = 1000)
    public void testNoTimeout_add2101() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoTimeout_add2101");
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(-1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5752,monitor);
            Thread.sleep(100);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5753,("Timeout -1, threw " + e));
        }
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5754,monitor);
            Thread.sleep(100);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5755,("Timeout 0, threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test No timeout.
     */
@Test(timeout = 1000)
    public void testNoTimeout_add2102() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoTimeout_add2102");
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(-1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5752,monitor);
            Thread.sleep(100);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5753,("Timeout -1, threw " + e));
        }
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5754,monitor);
            Thread.sleep(100);
            Thread.sleep(100);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5755,("Timeout 0, threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test No timeout.
     */
@Test(timeout = 1000)
    public void testNoTimeout_add2103() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoTimeout_add2103");
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(-1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5752,monitor);
            Thread.sleep(100);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5753,("Timeout -1, threw " + e));
        }
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5754,monitor);
            Thread.sleep(100);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5755,("Timeout 0, threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test No timeout.
     */
public void testNoTimeout() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoTimeout");
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(2);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5752,monitor);
            Thread.sleep(100);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5753,("Timeout -1, threw " + e));
        }
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5754,monitor);
            Thread.sleep(100);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5755,("Timeout 0, threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test No timeout.
     */
public void testNoTimeout_literalMutation4610() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoTimeout_literalMutation4610");
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(-1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5752,monitor);
            Thread.sleep(101);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5753,("Timeout -1, threw " + e));
        }
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5754,monitor);
            Thread.sleep(100);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5755,("Timeout 0, threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test No timeout.
     */
public void testNoTimeout_literalMutation4611() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoTimeout_literalMutation4611");
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(-1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5752,monitor);
            Thread.sleep(100);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5753,("Timeout -1, threw " + e));
        }
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(-1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5754,monitor);
            Thread.sleep(100);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5755,("Timeout 0, threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test No timeout.
     */
public void testNoTimeout_literalMutation4612() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoTimeout_literalMutation4612");
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(-1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5752,monitor);
            Thread.sleep(100);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5753,("Timeout -1, threw " + e));
        }
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5754,monitor);
            Thread.sleep(99);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5755,("Timeout 0, threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


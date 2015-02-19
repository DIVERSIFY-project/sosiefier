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
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(99);
            Thread.sleep(200);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (InterruptedException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test timeout.
     */
public void testTimeout_literalMutation6894() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTimeout_literalMutation6894");
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
public void testTimeout_literalMutation6895() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTimeout_literalMutation6895");
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(50);
            Thread.sleep(200);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (InterruptedException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test timeout.
     */
public void testTimeout_literalMutation6896() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTimeout_literalMutation6896");
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(200);
            Thread.sleep(200);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (InterruptedException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test timeout.
     */
public void testTimeout_literalMutation6897() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTimeout_literalMutation6897");
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(100);
            Thread.sleep(199);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (InterruptedException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test timeout.
     */
public void testTimeout_literalMutation6898() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTimeout_literalMutation6898");
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(100);
            Thread.sleep(201);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (InterruptedException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test timeout.
     */
public void testTimeout_literalMutation6899() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTimeout_literalMutation6899");
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(100);
            Thread.sleep(100);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (InterruptedException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test timeout.
     */
public void testTimeout_literalMutation6900() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTimeout_literalMutation6900");
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(100);
            Thread.sleep(400);
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
public void testCompletedWithoutTimeout_literalMutation6872() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompletedWithoutTimeout_literalMutation6872");
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(201);
            Thread.sleep(100);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (InterruptedException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test task completed before timeout.
     */
public void testCompletedWithoutTimeout_literalMutation6873() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompletedWithoutTimeout_literalMutation6873");
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(100);
            Thread.sleep(100);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (InterruptedException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test task completed before timeout.
     */
public void testCompletedWithoutTimeout_literalMutation6874() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompletedWithoutTimeout_literalMutation6874");
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(400);
            Thread.sleep(100);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (InterruptedException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test task completed before timeout.
     */
public void testCompletedWithoutTimeout_literalMutation6875() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompletedWithoutTimeout_literalMutation6875");
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(200);
            Thread.sleep(99);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (InterruptedException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test task completed before timeout.
     */
public void testCompletedWithoutTimeout_literalMutation6876() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompletedWithoutTimeout_literalMutation6876");
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(200);
            Thread.sleep(101);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (InterruptedException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test task completed before timeout.
     */
public void testCompletedWithoutTimeout_literalMutation6877() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompletedWithoutTimeout_literalMutation6877");
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(200);
            Thread.sleep(50);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (InterruptedException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test task completed before timeout.
     */
public void testCompletedWithoutTimeout_literalMutation6878() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompletedWithoutTimeout_literalMutation6878");
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(200);
            Thread.sleep(200);
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
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(2);
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
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(2);
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
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(-2);
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
public void testNoTimeout_literalMutation6880() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoTimeout_literalMutation6880");
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(0);
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
public void testNoTimeout_literalMutation6881() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoTimeout_literalMutation6881");
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(0);
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
public void testNoTimeout_literalMutation6882() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoTimeout_literalMutation6882");
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(2);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5752,monitor);
            Thread.sleep(99);
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
public void testNoTimeout_literalMutation6883() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoTimeout_literalMutation6883");
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(2);
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
public void testNoTimeout_literalMutation6884() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoTimeout_literalMutation6884");
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(2);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5752,monitor);
            Thread.sleep(50);
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
public void testNoTimeout_literalMutation6885() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoTimeout_literalMutation6885");
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(2);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5752,monitor);
            Thread.sleep(200);
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
public void testNoTimeout_literalMutation6886() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoTimeout_literalMutation6886");
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(2);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5752,monitor);
            Thread.sleep(100);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5753,("Timeout -1, threw " + e));
        }
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(1);
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
public void testNoTimeout_literalMutation6887() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoTimeout_literalMutation6887");
        try {
            Thread monitor = org.apache.commons.io.ThreadMonitor.start(2);
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
public void testNoTimeout_literalMutation6888() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoTimeout_literalMutation6888");
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
public void testNoTimeout_literalMutation6889() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoTimeout_literalMutation6889");
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
            Thread.sleep(99);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5755,("Timeout 0, threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test No timeout.
     */
public void testNoTimeout_literalMutation6890() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoTimeout_literalMutation6890");
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
            Thread.sleep(101);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5755,("Timeout 0, threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test No timeout.
     */
public void testNoTimeout_literalMutation6891() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoTimeout_literalMutation6891");
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
            Thread.sleep(50);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5755,("Timeout 0, threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test No timeout.
     */
public void testNoTimeout_literalMutation6892() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoTimeout_literalMutation6892");
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
            Thread.sleep(200);
            org.apache.commons.io.ThreadMonitor.stop(monitor);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5755,("Timeout 0, threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


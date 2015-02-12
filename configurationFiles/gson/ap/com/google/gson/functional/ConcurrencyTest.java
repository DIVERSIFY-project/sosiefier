package com.google.gson.functional;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import com.google.gson.Gson;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * Tests for ensuring Gson thread-safety.
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class ConcurrencyTest extends TestCase {
    private Gson gson;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        gson = new Gson();
    }

    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
@Test(timeout = 1000)
    public void testSingleThreadSerialization_add1006() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleThreadSerialization_add1006");
        MyObject myObj = new MyObject();
        for (int i = 0 ; i < 10 ; i++) {
            gson.toJson(myObj);
            gson.toJson(myObj);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
public void testSingleThreadSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleThreadSerialization");
        MyObject myObj = new MyObject();
        for (int i = 1 ; i < 10 ; i++) {
            gson.toJson(myObj);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
public void testSingleThreadSerialization_literalMutation1011() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleThreadSerialization_literalMutation1011");
        MyObject myObj = new MyObject();
        for (int i = 0 ; i < 9 ; i++) {
            gson.toJson(myObj);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
@Test(timeout = 1000)
    public void testSingleThreadSerialization_remove832() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleThreadSerialization_remove832");
        MyObject myObj = new MyObject();
        for (int i = 0 ; i < 10 ; i++) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
@Test(timeout = 1000)
    public void testSingleThreadDeserialization_add1005() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleThreadDeserialization_add1005");
        for (int i = 0 ; i < 10 ; i++) {
            gson.fromJson("{\'a\':\'hello\',\'b\':\'world\',\'i\':1}", MyObject.class);
            gson.fromJson("{\'a\':\'hello\',\'b\':\'world\',\'i\':1}", MyObject.class);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
public void testSingleThreadDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleThreadDeserialization");
        for (int i = -1 ; i < 10 ; i++) {
            gson.fromJson("{\'a\':\'hello\',\'b\':\'world\',\'i\':1}", MyObject.class);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
public void testSingleThreadDeserialization_literalMutation1008() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleThreadDeserialization_literalMutation1008");
        for (int i = 0 ; i < 11 ; i++) {
            gson.fromJson("{\'a\':\'hello\',\'b\':\'world\',\'i\':1}", MyObject.class);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
public void testSingleThreadDeserialization_literalMutation1009() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleThreadDeserialization_literalMutation1009");
        for (int i = 0 ; i < 10 ; i++) {
            gson.fromJson("foo", MyObject.class);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
@Test(timeout = 1000)
    public void testSingleThreadDeserialization_remove831() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleThreadDeserialization_remove831");
        for (int i = 0 ; i < 10 ; i++) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
@Test(timeout = 1000)
    public void testMultiThreadSerialization_add1000() throws InterruptedException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadSerialization_add1000");
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch finishedLatch = new CountDownLatch(10);
        final AtomicBoolean failed = new AtomicBoolean(false);
        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(10);
        for (int taskCount = 0 ; taskCount < 10 ; taskCount++) {
            executor.execute(new java.lang.Runnable() {
                public void run() {
                    MyObject myObj = new MyObject();
                    try {
                        startLatch.await();
                        for (int i = 0 ; i < 10 ; i++) {
                            gson.toJson(myObj);
                            gson.toJson(myObj);
                        }
                    } catch (java.lang.Throwable t) {
                        failed.set(true);
                    } finally {
                        finishedLatch.countDown();
                    }
                }
            });
        }
        startLatch.countDown();
        finishedLatch.await();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1075,failed,1074,failed.get());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
@Test(timeout = 1000)
    public void testMultiThreadSerialization_add1001() throws InterruptedException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadSerialization_add1001");
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch finishedLatch = new CountDownLatch(10);
        final AtomicBoolean failed = new AtomicBoolean(false);
        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(10);
        for (int taskCount = 0 ; taskCount < 10 ; taskCount++) {
            executor.execute(new java.lang.Runnable() {
                public void run() {
                    MyObject myObj = new MyObject();
                    try {
                        startLatch.await();
                        for (int i = 0 ; i < 10 ; i++) {
                            gson.toJson(myObj);
                        }
                    } catch (java.lang.Throwable t) {
                        failed.set(true);
                        failed.set(true);
                    } finally {
                        finishedLatch.countDown();
                    }
                }
            });
        }
        startLatch.countDown();
        finishedLatch.await();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1075,failed,1074,failed.get());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
@Test(timeout = 1000)
    public void testMultiThreadSerialization_add1002() throws InterruptedException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadSerialization_add1002");
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch finishedLatch = new CountDownLatch(10);
        final AtomicBoolean failed = new AtomicBoolean(false);
        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(10);
        for (int taskCount = 0 ; taskCount < 10 ; taskCount++) {
            executor.execute(new java.lang.Runnable() {
                public void run() {
                    MyObject myObj = new MyObject();
                    try {
                        startLatch.await();
                        for (int i = 0 ; i < 10 ; i++) {
                            gson.toJson(myObj);
                        }
                    } catch (java.lang.Throwable t) {
                        failed.set(true);
                    } finally {
                        finishedLatch.countDown();
                        finishedLatch.countDown();
                    }
                }
            });
        }
        startLatch.countDown();
        finishedLatch.await();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1075,failed,1074,failed.get());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
@Test(timeout = 1000)
    public void testMultiThreadSerialization_add1003() throws InterruptedException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadSerialization_add1003");
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch finishedLatch = new CountDownLatch(10);
        final AtomicBoolean failed = new AtomicBoolean(false);
        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(10);
        for (int taskCount = 0 ; taskCount < 10 ; taskCount++) {
            executor.execute(new java.lang.Runnable() {
                public void run() {
                    MyObject myObj = new MyObject();
                    try {
                        startLatch.await();
                        for (int i = 0 ; i < 10 ; i++) {
                            gson.toJson(myObj);
                        }
                    } catch (java.lang.Throwable t) {
                        failed.set(true);
                    } finally {
                        finishedLatch.countDown();
                    }
                }
            });
        }
        startLatch.countDown();
        startLatch.countDown();
        finishedLatch.await();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1075,failed,1074,failed.get());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
@Test(timeout = 1000)
    public void testMultiThreadSerialization_add1004() throws InterruptedException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadSerialization_add1004");
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch finishedLatch = new CountDownLatch(10);
        final AtomicBoolean failed = new AtomicBoolean(false);
        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(10);
        for (int taskCount = 0 ; taskCount < 10 ; taskCount++) {
            executor.execute(new java.lang.Runnable() {
                public void run() {
                    MyObject myObj = new MyObject();
                    try {
                        startLatch.await();
                        for (int i = 0 ; i < 10 ; i++) {
                            gson.toJson(myObj);
                        }
                    } catch (java.lang.Throwable t) {
                        failed.set(true);
                    } finally {
                        finishedLatch.countDown();
                    }
                }
            });
        }
        startLatch.countDown();
        finishedLatch.await();
        finishedLatch.await();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1075,failed,1074,failed.get());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
@Test(timeout = 1000)
    public void testMultiThreadSerialization_add997() throws InterruptedException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadSerialization_add997");
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch finishedLatch = new CountDownLatch(10);
        final AtomicBoolean failed = new AtomicBoolean(false);
        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(10);
        for (int taskCount = 0 ; taskCount < 10 ; taskCount++) {
            executor.execute(new java.lang.Runnable() {
                public void run() {
                    MyObject myObj = new MyObject();
                    try {
                        startLatch.await();
                        for (int i = 0 ; i < 10 ; i++) {
                            gson.toJson(myObj);
                        }
                    } catch (java.lang.Throwable t) {
                        failed.set(true);
                    } finally {
                        finishedLatch.countDown();
                    }
                }
            });
            executor.execute(new java.lang.Runnable() {
                public void run() {
                    MyObject myObj = new MyObject();
                    try {
                        startLatch.await();
                        for (int i = 0 ; i < 10 ; i++) {
                            gson.toJson(myObj);
                        }
                    } catch (java.lang.Throwable t) {
                        failed.set(true);
                    } finally {
                        finishedLatch.countDown();
                    }
                }
            });
        }
        startLatch.countDown();
        finishedLatch.await();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1075,failed,1074,failed.get());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
@Test(timeout = 1000)
    public void testMultiThreadSerialization_add998() throws InterruptedException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadSerialization_add998");
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch finishedLatch = new CountDownLatch(10);
        final AtomicBoolean failed = new AtomicBoolean(false);
        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(10);
        for (int taskCount = 0 ; taskCount < 10 ; taskCount++) {
            executor.execute(new java.lang.Runnable() {
                public void run() {
                    MyObject myObj = new MyObject();
                    try {
                        startLatch.await();
                        for (int i = 0 ; i < 10 ; i++) {
                            gson.toJson(myObj);
                        }
                    } catch (java.lang.Throwable t) {
                        failed.set(true);
                    } finally {
                        finishedLatch.countDown();
                    }
                }
            });
        }
        startLatch.countDown();
        finishedLatch.await();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1075,failed,1074,failed.get());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
@Test(timeout = 1000)
    public void testMultiThreadSerialization_add999() throws InterruptedException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadSerialization_add999");
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch finishedLatch = new CountDownLatch(10);
        final AtomicBoolean failed = new AtomicBoolean(false);
        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(10);
        for (int taskCount = 0 ; taskCount < 10 ; taskCount++) {
            executor.execute(new java.lang.Runnable() {
                public void run() {
                    MyObject myObj = new MyObject();
                    try {
                        startLatch.await();
                        startLatch.await();
                        for (int i = 0 ; i < 10 ; i++) {
                            gson.toJson(myObj);
                        }
                    } catch (java.lang.Throwable t) {
                        failed.set(true);
                    } finally {
                        finishedLatch.countDown();
                    }
                }
            });
        }
        startLatch.countDown();
        finishedLatch.await();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1075,failed,1074,failed.get());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
public void testMultiThreadSerialization_literalMutation1000() throws InterruptedException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadSerialization_literalMutation1000");
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch finishedLatch = new CountDownLatch(10);
        final AtomicBoolean failed = new AtomicBoolean(true);
        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(10);
        for (int taskCount = 0 ; taskCount < 10 ; taskCount++) {
            executor.execute(new java.lang.Runnable() {
                public void run() {
                    MyObject myObj = new MyObject();
                    try {
                        startLatch.await();
                        for (int i = 0 ; i < 10 ; i++) {
                            gson.toJson(myObj);
                        }
                    } catch (java.lang.Throwable t) {
                        failed.set(true);
                    } finally {
                        finishedLatch.countDown();
                    }
                }
            });
        }
        startLatch.countDown();
        finishedLatch.await();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1075,failed,1074,failed.get());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
public void testMultiThreadSerialization_literalMutation1001() throws InterruptedException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadSerialization_literalMutation1001");
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch finishedLatch = new CountDownLatch(10);
        final AtomicBoolean failed = new AtomicBoolean(false);
        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(9);
        for (int taskCount = 0 ; taskCount < 10 ; taskCount++) {
            executor.execute(new java.lang.Runnable() {
                public void run() {
                    MyObject myObj = new MyObject();
                    try {
                        startLatch.await();
                        for (int i = 0 ; i < 10 ; i++) {
                            gson.toJson(myObj);
                        }
                    } catch (java.lang.Throwable t) {
                        failed.set(true);
                    } finally {
                        finishedLatch.countDown();
                    }
                }
            });
        }
        startLatch.countDown();
        finishedLatch.await();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1075,failed,1074,failed.get());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }




    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
public void testMultiThreadSerialization_literalMutation1004() throws InterruptedException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadSerialization_literalMutation1004");
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch finishedLatch = new CountDownLatch(10);
        final AtomicBoolean failed = new AtomicBoolean(false);
        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(10);
        for (int taskCount = 0 ; taskCount < 10 ; taskCount++) {
            executor.execute(new java.lang.Runnable() {
                public void run() {
                    MyObject myObj = new MyObject();
                    try {
                        startLatch.await();
                        for (int i = -1 ; i < 10 ; i++) {
                            gson.toJson(myObj);
                        }
                    } catch (java.lang.Throwable t) {
                        failed.set(true);
                    } finally {
                        finishedLatch.countDown();
                    }
                }
            });
        }
        startLatch.countDown();
        finishedLatch.await();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1075,failed,1074,failed.get());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
public void testMultiThreadSerialization_literalMutation1005() throws InterruptedException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadSerialization_literalMutation1005");
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch finishedLatch = new CountDownLatch(10);
        final AtomicBoolean failed = new AtomicBoolean(false);
        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(10);
        for (int taskCount = 0 ; taskCount < 10 ; taskCount++) {
            executor.execute(new java.lang.Runnable() {
                public void run() {
                    MyObject myObj = new MyObject();
                    try {
                        startLatch.await();
                        for (int i = 0 ; i < 11 ; i++) {
                            gson.toJson(myObj);
                        }
                    } catch (java.lang.Throwable t) {
                        failed.set(true);
                    } finally {
                        finishedLatch.countDown();
                    }
                }
            });
        }
        startLatch.countDown();
        finishedLatch.await();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1075,failed,1074,failed.get());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
public void testMultiThreadSerialization_literalMutation1006() throws InterruptedException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadSerialization_literalMutation1006");
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch finishedLatch = new CountDownLatch(10);
        final AtomicBoolean failed = new AtomicBoolean(false);
        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(10);
        for (int taskCount = 0 ; taskCount < 10 ; taskCount++) {
            executor.execute(new java.lang.Runnable() {
                public void run() {
                    MyObject myObj = new MyObject();
                    try {
                        startLatch.await();
                        for (int i = 0 ; i < 10 ; i++) {
                            gson.toJson(myObj);
                        }
                    } catch (java.lang.Throwable t) {
                        failed.set(true);
                    } finally {
                        finishedLatch.countDown();
                    }
                }
            });
        }
        startLatch.countDown();
        finishedLatch.await();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1075,failed,1074,failed.get());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }


    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
@Test(timeout = 1000)
    public void testMultiThreadSerialization_remove828() throws InterruptedException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadSerialization_remove828");
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch finishedLatch = new CountDownLatch(10);
        final AtomicBoolean failed = new AtomicBoolean(false);
        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(10);
        for (int taskCount = 0 ; taskCount < 10 ; taskCount++) {
            executor.execute(new java.lang.Runnable() {
                public void run() {
                    MyObject myObj = new MyObject();
                    try {
                        startLatch.await();
                        for (int i = 0 ; i < 10 ; i++) {
                            gson.toJson(myObj);
                        }
                    } catch (java.lang.Throwable t) {
                        failed.set(true);
                    } finally {
                        finishedLatch.countDown();
                    }
                }
            });
        }
        startLatch.countDown();
        finishedLatch.await();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1075,failed,1074,failed.get());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }



    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
@Test(timeout = 1000)
    public void testMultiThreadSerialization_remove830() throws InterruptedException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadSerialization_remove830");
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch finishedLatch = new CountDownLatch(10);
        final AtomicBoolean failed = new AtomicBoolean(false);
        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(10);
        for (int taskCount = 0 ; taskCount < 10 ; taskCount++) {
            executor.execute(new java.lang.Runnable() {
                public void run() {
                    MyObject myObj = new MyObject();
                    try {
                        startLatch.await();
                        for (int i = 0 ; i < 10 ; i++) {
                            gson.toJson(myObj);
                        }
                    } catch (java.lang.Throwable t) {
                        failed.set(true);
                    } finally {
                        finishedLatch.countDown();
                    }
                }
            });
        }
        startLatch.countDown();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1075,failed,1074,failed.get());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
@Test(timeout = 1000)
    public void testMultiThreadDeserialization_add989() throws InterruptedException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadDeserialization_add989");
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch finishedLatch = new CountDownLatch(10);
        final AtomicBoolean failed = new AtomicBoolean(false);
        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(10);
        for (int taskCount = 0 ; taskCount < 10 ; taskCount++) {
            executor.execute(new java.lang.Runnable() {
                public void run() {
                    try {
                        startLatch.await();
                        for (int i = 0 ; i < 10 ; i++) {
                            gson.fromJson("{\'a\':\'hello\',\'b\':\'world\',\'i\':1}", MyObject.class);
                        }
                    } catch (java.lang.Throwable t) {
                        failed.set(true);
                    } finally {
                        finishedLatch.countDown();
                    }
                }
            });
            executor.execute(new java.lang.Runnable() {
                public void run() {
                    try {
                        startLatch.await();
                        for (int i = 0 ; i < 10 ; i++) {
                            gson.fromJson("{\'a\':\'hello\',\'b\':\'world\',\'i\':1}", MyObject.class);
                        }
                    } catch (java.lang.Throwable t) {
                        failed.set(true);
                    } finally {
                        finishedLatch.countDown();
                    }
                }
            });
        }
        startLatch.countDown();
        finishedLatch.await();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1073,failed,1072,failed.get());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
@Test(timeout = 1000)
    public void testMultiThreadDeserialization_add990() throws InterruptedException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadDeserialization_add990");
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch finishedLatch = new CountDownLatch(10);
        final AtomicBoolean failed = new AtomicBoolean(false);
        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(10);
        for (int taskCount = 0 ; taskCount < 10 ; taskCount++) {
            executor.execute(new java.lang.Runnable() {
                public void run() {
                    try {
                        startLatch.await();
                        for (int i = 0 ; i < 10 ; i++) {
                            gson.fromJson("{\'a\':\'hello\',\'b\':\'world\',\'i\':1}", MyObject.class);
                        }
                    } catch (java.lang.Throwable t) {
                        failed.set(true);
                    } finally {
                        finishedLatch.countDown();
                    }
                }
            });
        }
        startLatch.countDown();
        finishedLatch.await();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1073,failed,1072,failed.get());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
@Test(timeout = 1000)
    public void testMultiThreadDeserialization_add991() throws InterruptedException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadDeserialization_add991");
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch finishedLatch = new CountDownLatch(10);
        final AtomicBoolean failed = new AtomicBoolean(false);
        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(10);
        for (int taskCount = 0 ; taskCount < 10 ; taskCount++) {
            executor.execute(new java.lang.Runnable() {
                public void run() {
                    try {
                        startLatch.await();
                        startLatch.await();
                        for (int i = 0 ; i < 10 ; i++) {
                            gson.fromJson("{\'a\':\'hello\',\'b\':\'world\',\'i\':1}", MyObject.class);
                        }
                    } catch (java.lang.Throwable t) {
                        failed.set(true);
                    } finally {
                        finishedLatch.countDown();
                    }
                }
            });
        }
        startLatch.countDown();
        finishedLatch.await();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1073,failed,1072,failed.get());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
@Test(timeout = 1000)
    public void testMultiThreadDeserialization_add992() throws InterruptedException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadDeserialization_add992");
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch finishedLatch = new CountDownLatch(10);
        final AtomicBoolean failed = new AtomicBoolean(false);
        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(10);
        for (int taskCount = 0 ; taskCount < 10 ; taskCount++) {
            executor.execute(new java.lang.Runnable() {
                public void run() {
                    try {
                        startLatch.await();
                        for (int i = 0 ; i < 10 ; i++) {
                            gson.fromJson("{\'a\':\'hello\',\'b\':\'world\',\'i\':1}", MyObject.class);
                            gson.fromJson("{\'a\':\'hello\',\'b\':\'world\',\'i\':1}", MyObject.class);
                        }
                    } catch (java.lang.Throwable t) {
                        failed.set(true);
                    } finally {
                        finishedLatch.countDown();
                    }
                }
            });
        }
        startLatch.countDown();
        finishedLatch.await();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1073,failed,1072,failed.get());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
@Test(timeout = 1000)
    public void testMultiThreadDeserialization_add993() throws InterruptedException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadDeserialization_add993");
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch finishedLatch = new CountDownLatch(10);
        final AtomicBoolean failed = new AtomicBoolean(false);
        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(10);
        for (int taskCount = 0 ; taskCount < 10 ; taskCount++) {
            executor.execute(new java.lang.Runnable() {
                public void run() {
                    try {
                        startLatch.await();
                        for (int i = 0 ; i < 10 ; i++) {
                            gson.fromJson("{\'a\':\'hello\',\'b\':\'world\',\'i\':1}", MyObject.class);
                        }
                    } catch (java.lang.Throwable t) {
                        failed.set(true);
                        failed.set(true);
                    } finally {
                        finishedLatch.countDown();
                    }
                }
            });
        }
        startLatch.countDown();
        finishedLatch.await();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1073,failed,1072,failed.get());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
@Test(timeout = 1000)
    public void testMultiThreadDeserialization_add994() throws InterruptedException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadDeserialization_add994");
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch finishedLatch = new CountDownLatch(10);
        final AtomicBoolean failed = new AtomicBoolean(false);
        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(10);
        for (int taskCount = 0 ; taskCount < 10 ; taskCount++) {
            executor.execute(new java.lang.Runnable() {
                public void run() {
                    try {
                        startLatch.await();
                        for (int i = 0 ; i < 10 ; i++) {
                            gson.fromJson("{\'a\':\'hello\',\'b\':\'world\',\'i\':1}", MyObject.class);
                        }
                    } catch (java.lang.Throwable t) {
                        failed.set(true);
                    } finally {
                        finishedLatch.countDown();
                        finishedLatch.countDown();
                    }
                }
            });
        }
        startLatch.countDown();
        finishedLatch.await();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1073,failed,1072,failed.get());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
@Test(timeout = 1000)
    public void testMultiThreadDeserialization_add995() throws InterruptedException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadDeserialization_add995");
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch finishedLatch = new CountDownLatch(10);
        final AtomicBoolean failed = new AtomicBoolean(false);
        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(10);
        for (int taskCount = 0 ; taskCount < 10 ; taskCount++) {
            executor.execute(new java.lang.Runnable() {
                public void run() {
                    try {
                        startLatch.await();
                        for (int i = 0 ; i < 10 ; i++) {
                            gson.fromJson("{\'a\':\'hello\',\'b\':\'world\',\'i\':1}", MyObject.class);
                        }
                    } catch (java.lang.Throwable t) {
                        failed.set(true);
                    } finally {
                        finishedLatch.countDown();
                    }
                }
            });
        }
        startLatch.countDown();
        startLatch.countDown();
        finishedLatch.await();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1073,failed,1072,failed.get());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
@Test(timeout = 1000)
    public void testMultiThreadDeserialization_add996() throws InterruptedException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadDeserialization_add996");
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch finishedLatch = new CountDownLatch(10);
        final AtomicBoolean failed = new AtomicBoolean(false);
        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(10);
        for (int taskCount = 0 ; taskCount < 10 ; taskCount++) {
            executor.execute(new java.lang.Runnable() {
                public void run() {
                    try {
                        startLatch.await();
                        for (int i = 0 ; i < 10 ; i++) {
                            gson.fromJson("{\'a\':\'hello\',\'b\':\'world\',\'i\':1}", MyObject.class);
                        }
                    } catch (java.lang.Throwable t) {
                        failed.set(true);
                    } finally {
                        finishedLatch.countDown();
                    }
                }
            });
        }
        startLatch.countDown();
        finishedLatch.await();
        finishedLatch.await();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1073,failed,1072,failed.get());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
public void testMultiThreadDeserialization() throws InterruptedException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadDeserialization");
        final CountDownLatch startLatch = new CountDownLatch(0);
        final CountDownLatch finishedLatch = new CountDownLatch(10);
        final AtomicBoolean failed = new AtomicBoolean(false);
        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(10);
        for (int taskCount = 0 ; taskCount < 10 ; taskCount++) {
            executor.execute(new java.lang.Runnable() {
                public void run() {
                    try {
                        startLatch.await();
                        for (int i = 0 ; i < 10 ; i++) {
                            gson.fromJson("{\'a\':\'hello\',\'b\':\'world\',\'i\':1}", MyObject.class);
                        }
                    } catch (java.lang.Throwable t) {
                        failed.set(true);
                    } finally {
                        finishedLatch.countDown();
                    }
                }
            });
        }
        startLatch.countDown();
        finishedLatch.await();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1073,failed,1072,failed.get());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
public void testMultiThreadDeserialization_literalMutation989() throws InterruptedException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadDeserialization_literalMutation989");
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch finishedLatch = new CountDownLatch(9);
        final AtomicBoolean failed = new AtomicBoolean(false);
        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(10);
        for (int taskCount = 0 ; taskCount < 10 ; taskCount++) {
            executor.execute(new java.lang.Runnable() {
                public void run() {
                    try {
                        startLatch.await();
                        for (int i = 0 ; i < 10 ; i++) {
                            gson.fromJson("{\'a\':\'hello\',\'b\':\'world\',\'i\':1}", MyObject.class);
                        }
                    } catch (java.lang.Throwable t) {
                        failed.set(true);
                    } finally {
                        finishedLatch.countDown();
                    }
                }
            });
        }
        startLatch.countDown();
        finishedLatch.await();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1073,failed,1072,failed.get());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
public void testMultiThreadDeserialization_literalMutation990() throws InterruptedException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadDeserialization_literalMutation990");
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch finishedLatch = new CountDownLatch(10);
        final AtomicBoolean failed = new AtomicBoolean(false);
        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(10);
        for (int taskCount = 0 ; taskCount < 10 ; taskCount++) {
            executor.execute(new java.lang.Runnable() {
                public void run() {
                    try {
                        startLatch.await();
                        for (int i = 0 ; i < 10 ; i++) {
                            gson.fromJson("{\'a\':\'hello\',\'b\':\'world\',\'i\':1}", MyObject.class);
                        }
                    } catch (java.lang.Throwable t) {
                        failed.set(true);
                    } finally {
                        finishedLatch.countDown();
                    }
                }
            });
        }
        startLatch.countDown();
        finishedLatch.await();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1073,failed,1072,failed.get());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
public void testMultiThreadDeserialization_literalMutation991() throws InterruptedException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadDeserialization_literalMutation991");
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch finishedLatch = new CountDownLatch(10);
        final AtomicBoolean failed = new AtomicBoolean(false);
        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(9);
        for (int taskCount = 0 ; taskCount < 10 ; taskCount++) {
            executor.execute(new java.lang.Runnable() {
                public void run() {
                    try {
                        startLatch.await();
                        for (int i = 0 ; i < 10 ; i++) {
                            gson.fromJson("{\'a\':\'hello\',\'b\':\'world\',\'i\':1}", MyObject.class);
                        }
                    } catch (java.lang.Throwable t) {
                        failed.set(true);
                    } finally {
                        finishedLatch.countDown();
                    }
                }
            });
        }
        startLatch.countDown();
        finishedLatch.await();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1073,failed,1072,failed.get());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
public void testMultiThreadDeserialization_literalMutation992() throws InterruptedException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadDeserialization_literalMutation992");
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch finishedLatch = new CountDownLatch(10);
        final AtomicBoolean failed = new AtomicBoolean(false);
        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(10);
        for (int taskCount = -1 ; taskCount < 10 ; taskCount++) {
            executor.execute(new java.lang.Runnable() {
                public void run() {
                    try {
                        startLatch.await();
                        for (int i = 0 ; i < 10 ; i++) {
                            gson.fromJson("{\'a\':\'hello\',\'b\':\'world\',\'i\':1}", MyObject.class);
                        }
                    } catch (java.lang.Throwable t) {
                        failed.set(true);
                    } finally {
                        finishedLatch.countDown();
                    }
                }
            });
        }
        startLatch.countDown();
        finishedLatch.await();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1073,failed,1072,failed.get());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }


    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
public void testMultiThreadDeserialization_literalMutation994() throws InterruptedException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadDeserialization_literalMutation994");
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch finishedLatch = new CountDownLatch(10);
        final AtomicBoolean failed = new AtomicBoolean(false);
        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(10);
        for (int taskCount = 0 ; taskCount < 10 ; taskCount++) {
            executor.execute(new java.lang.Runnable() {
                public void run() {
                    try {
                        startLatch.await();
                        for (int i = 1 ; i < 10 ; i++) {
                            gson.fromJson("{\'a\':\'hello\',\'b\':\'world\',\'i\':1}", MyObject.class);
                        }
                    } catch (java.lang.Throwable t) {
                        failed.set(true);
                    } finally {
                        finishedLatch.countDown();
                    }
                }
            });
        }
        startLatch.countDown();
        finishedLatch.await();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1073,failed,1072,failed.get());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
public void testMultiThreadDeserialization_literalMutation995() throws InterruptedException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadDeserialization_literalMutation995");
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch finishedLatch = new CountDownLatch(10);
        final AtomicBoolean failed = new AtomicBoolean(false);
        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(10);
        for (int taskCount = 0 ; taskCount < 10 ; taskCount++) {
            executor.execute(new java.lang.Runnable() {
                public void run() {
                    try {
                        startLatch.await();
                        for (int i = 0 ; i < 9 ; i++) {
                            gson.fromJson("{\'a\':\'hello\',\'b\':\'world\',\'i\':1}", MyObject.class);
                        }
                    } catch (java.lang.Throwable t) {
                        failed.set(true);
                    } finally {
                        finishedLatch.countDown();
                    }
                }
            });
        }
        startLatch.countDown();
        finishedLatch.await();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1073,failed,1072,failed.get());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
public void testMultiThreadDeserialization_literalMutation996() throws InterruptedException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadDeserialization_literalMutation996");
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch finishedLatch = new CountDownLatch(10);
        final AtomicBoolean failed = new AtomicBoolean(false);
        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(10);
        for (int taskCount = 0 ; taskCount < 10 ; taskCount++) {
            executor.execute(new java.lang.Runnable() {
                public void run() {
                    try {
                        startLatch.await();
                        for (int i = 0 ; i < 10 ; i++) {
                            gson.fromJson("foo", MyObject.class);
                        }
                    } catch (java.lang.Throwable t) {
                        failed.set(true);
                    } finally {
                        finishedLatch.countDown();
                    }
                }
            });
        }
        startLatch.countDown();
        finishedLatch.await();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1073,failed,1072,failed.get());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
public void testMultiThreadDeserialization_literalMutation997() throws InterruptedException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadDeserialization_literalMutation997");
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch finishedLatch = new CountDownLatch(10);
        final AtomicBoolean failed = new AtomicBoolean(false);
        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(10);
        for (int taskCount = 0 ; taskCount < 10 ; taskCount++) {
            executor.execute(new java.lang.Runnable() {
                public void run() {
                    try {
                        startLatch.await();
                        for (int i = 0 ; i < 10 ; i++) {
                            gson.fromJson("{\'a\':\'hello\',\'b\':\'world\',\'i\':1}", MyObject.class);
                        }
                    } catch (java.lang.Throwable t) {
                        failed.set(true);
                    } finally {
                        finishedLatch.countDown();
                    }
                }
            });
        }
        startLatch.countDown();
        finishedLatch.await();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1073,failed,1072,failed.get());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }


    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
@Test(timeout = 1000)
    public void testMultiThreadDeserialization_remove824() throws InterruptedException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadDeserialization_remove824");
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch finishedLatch = new CountDownLatch(10);
        final AtomicBoolean failed = new AtomicBoolean(false);
        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(10);
        for (int taskCount = 0 ; taskCount < 10 ; taskCount++) {
            executor.execute(new java.lang.Runnable() {
                public void run() {
                    try {
                        startLatch.await();
                        for (int i = 0 ; i < 10 ; i++) {
                            gson.fromJson("{\'a\':\'hello\',\'b\':\'world\',\'i\':1}", MyObject.class);
                        }
                    } catch (java.lang.Throwable t) {
                        failed.set(true);
                    } finally {
                        finishedLatch.countDown();
                    }
                }
            });
        }
        startLatch.countDown();
        finishedLatch.await();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1073,failed,1072,failed.get());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }


    /** 
     * Source-code based on
     * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
     */
@Test(timeout = 1000)
    public void testMultiThreadDeserialization_remove826() throws InterruptedException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadDeserialization_remove826");
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch finishedLatch = new CountDownLatch(10);
        final AtomicBoolean failed = new AtomicBoolean(false);
        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(10);
        for (int taskCount = 0 ; taskCount < 10 ; taskCount++) {
            executor.execute(new java.lang.Runnable() {
                public void run() {
                    try {
                        startLatch.await();
                        for (int i = 0 ; i < 10 ; i++) {
                            gson.fromJson("{\'a\':\'hello\',\'b\':\'world\',\'i\':1}", MyObject.class);
                        }
                    } catch (java.lang.Throwable t) {
                        failed.set(true);
                    } finally {
                        finishedLatch.countDown();
                    }
                }
            });
        }
        startLatch.countDown();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1073,failed,1072,failed.get());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unused")
    private static class MyObject {
        String a;

        String b;

        int i;

        MyObject() {
            this("hello", "world", 42);
        }

        public MyObject(String a ,String b ,int i) {
            this.a = a;
            this.b = b;
            this.i = i;
        }
    }
}


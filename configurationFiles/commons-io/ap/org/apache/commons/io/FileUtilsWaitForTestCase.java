//package org.apache.commons.io;
//
//import org.apache.commons.io.testtools.FileBasedTestCase;
//import org.junit.Test;
//
///** 
// * This is used to test FileUtils.waitFor() method for correctness.
// * 
// * @version $Id$
// * @see FileUtils
// */
//public class FileUtilsWaitForTestCase extends FileBasedTestCase {
//    public FileUtilsWaitForTestCase(String name) {
//        super(name);
//    }
//
//    /** 
//     * @see junit.framework.TestCase#setUp()
//     */
//@Override
//    protected void setUp() throws Exception {
//        FileBasedTestCase.getTestDirectory().mkdirs();
//    }
//
//    /** 
//     * @see junit.framework.TestCase#tearDown()
//     */
//@Override
//    protected void tearDown() throws Exception {
//        org.apache.commons.io.FileUtils.deleteDirectory(FileBasedTestCase.getTestDirectory());
//    }
//
//    @Test(timeout = 1000)
//    public void testWaitFor_add1679() {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWaitFor_add1679");
//        org.apache.commons.io.FileUtils.waitFor(new java.io.File(""), -1);
//        org.apache.commons.io.FileUtils.waitFor(new java.io.File(""), -1);
//        org.apache.commons.io.FileUtils.waitFor(new java.io.File(""), 2);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testWaitFor_add1680() {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWaitFor_add1680");
//        org.apache.commons.io.FileUtils.waitFor(new java.io.File(""), -1);
//        org.apache.commons.io.FileUtils.waitFor(new java.io.File(""), 2);
//        org.apache.commons.io.FileUtils.waitFor(new java.io.File(""), 2);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testWaitFor() {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWaitFor");
//        org.apache.commons.io.FileUtils.waitFor(new java.io.File("foo"), -1);
//        org.apache.commons.io.FileUtils.waitFor(new java.io.File(""), 2);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testWaitFor_literalMutation3776() {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWaitFor_literalMutation3776");
//        org.apache.commons.io.FileUtils.waitFor(new java.io.File(""), 2);
//        org.apache.commons.io.FileUtils.waitFor(new java.io.File(""), 2);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testWaitFor_literalMutation3777() {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWaitFor_literalMutation3777");
//        org.apache.commons.io.FileUtils.waitFor(new java.io.File(""), -1);
//        org.apache.commons.io.FileUtils.waitFor(new java.io.File("foo"), 2);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testWaitFor_literalMutation3778() {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWaitFor_literalMutation3778");
//        org.apache.commons.io.FileUtils.waitFor(new java.io.File(""), -1);
//        org.apache.commons.io.FileUtils.waitFor(new java.io.File(""), 1);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testWaitFor_remove1277() {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWaitFor_remove1277");
//        org.apache.commons.io.FileUtils.waitFor(new java.io.File(""), 2);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testWaitFor_remove1278() {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWaitFor_remove1278");
//        org.apache.commons.io.FileUtils.waitFor(new java.io.File(""), 2);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//}
//

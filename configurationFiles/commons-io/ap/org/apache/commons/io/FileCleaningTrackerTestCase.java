//package org.apache.commons.io;
//
//import java.util.ArrayList;
//import java.io.File;
//import org.apache.commons.io.testtools.FileBasedTestCase;
//import java.util.List;
//import java.io.RandomAccessFile;
//import java.lang.ref.ReferenceQueue;
//import org.junit.Test;
//
///** 
// * This is used to test {@link FileCleaningTracker} for correctness.
// * 
// * @version $Id$
// * @see FileCleaningTracker
// */
//public class FileCleaningTrackerTestCase extends FileBasedTestCase {
//    protected FileCleaningTracker newInstance() {
//        return new FileCleaningTracker();
//    }
//
//    private File testFile;
//
//    private FileCleaningTracker theInstance;
//
//    public FileCleaningTrackerTestCase(String name) {
//        super(name);
//        testFile = new File(FileBasedTestCase.getTestDirectory() , "file-test.txt");
//    }
//
//    /** 
//     * @see junit.framework.TestCase#setUp()
//     */
//@Override
//    protected void setUp() throws Exception {
//        theInstance = newInstance();
//        FileBasedTestCase.getTestDirectory().mkdirs();
//    }
//
//    /** 
//     * @see junit.framework.TestCase#tearDown()
//     */
//@Override
//    protected void tearDown() throws Exception {
//        org.apache.commons.io.FileUtils.deleteDirectory(FileBasedTestCase.getTestDirectory());
//        {
//            theInstance.q = new ReferenceQueue<java.lang.Object>();
//            theInstance.trackers.clear();
//            theInstance.deleteFailures.clear();
//            theInstance.exitWhenFinished = false;
//            theInstance.reaper = null;
//        }
//        theInstance = null;
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerFile_add1253() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerFile_add1253");
//        String path = testFile.getPath();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2370,testFile,2369,testFile.exists());
//        RandomAccessFile r = new RandomAccessFile(testFile , "rw");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2372,testFile,2371,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2374,theInstance,2373,theInstance.getTrackCount());
//        theInstance.track(path, r);
//        theInstance.track(path, r);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2376,theInstance,2375,theInstance.getTrackCount());
//        r.close();
//        testFile = null;
//        r = null;
//        waitUntilTrackCount();
//        pauseForDeleteToComplete(new File(path));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2378,theInstance,2377,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2380,null,2379,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2382,new java.io.File(path),2381,new java.io.File(path).exists());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerFile_add1254() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerFile_add1254");
//        String path = testFile.getPath();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2370,testFile,2369,testFile.exists());
//        RandomAccessFile r = new RandomAccessFile(testFile , "rw");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2372,testFile,2371,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2374,theInstance,2373,theInstance.getTrackCount());
//        theInstance.track(path, r);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2376,theInstance,2375,theInstance.getTrackCount());
//        r.close();
//        r.close();
//        testFile = null;
//        r = null;
//        waitUntilTrackCount();
//        pauseForDeleteToComplete(new File(path));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2378,theInstance,2377,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2380,null,2379,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2382,new java.io.File(path),2381,new java.io.File(path).exists());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerFile_add1255() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerFile_add1255");
//        String path = testFile.getPath();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2370,testFile,2369,testFile.exists());
//        RandomAccessFile r = new RandomAccessFile(testFile , "rw");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2372,testFile,2371,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2374,theInstance,2373,theInstance.getTrackCount());
//        theInstance.track(path, r);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2376,theInstance,2375,theInstance.getTrackCount());
//        r.close();
//        testFile = null;
//        r = null;
//        waitUntilTrackCount();
//        waitUntilTrackCount();
//        pauseForDeleteToComplete(new File(path));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2378,theInstance,2377,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2380,null,2379,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2382,new java.io.File(path),2381,new java.io.File(path).exists());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerFile_add1256() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerFile_add1256");
//        String path = testFile.getPath();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2370,testFile,2369,testFile.exists());
//        RandomAccessFile r = new RandomAccessFile(testFile , "rw");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2372,testFile,2371,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2374,theInstance,2373,theInstance.getTrackCount());
//        theInstance.track(path, r);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2376,theInstance,2375,theInstance.getTrackCount());
//        r.close();
//        testFile = null;
//        r = null;
//        waitUntilTrackCount();
//        pauseForDeleteToComplete(new File(path));
//        pauseForDeleteToComplete(new File(path));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2378,theInstance,2377,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2380,null,2379,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2382,new java.io.File(path),2381,new java.io.File(path).exists());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testFileCleanerFile() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerFile");
//        String path = testFile.getPath();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2370,testFile,2369,testFile.exists());
//        RandomAccessFile r = new RandomAccessFile(testFile , "foo");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2372,testFile,2371,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2374,theInstance,2373,theInstance.getTrackCount());
//        theInstance.track(path, r);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2376,theInstance,2375,theInstance.getTrackCount());
//        r.close();
//        testFile = null;
//        r = null;
//        waitUntilTrackCount();
//        pauseForDeleteToComplete(new File(path));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2378,theInstance,2377,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2380,null,2379,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2382,new java.io.File(path),2381,new java.io.File(path).exists());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerFile_remove979() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerFile_remove979");
//        String path = testFile.getPath();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2370,testFile,2369,testFile.exists());
//        RandomAccessFile r = new RandomAccessFile(testFile , "rw");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2372,testFile,2371,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2374,theInstance,2373,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2376,theInstance,2375,theInstance.getTrackCount());
//        r.close();
//        testFile = null;
//        r = null;
//        waitUntilTrackCount();
//        pauseForDeleteToComplete(new File(path));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2378,theInstance,2377,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2380,null,2379,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2382,new java.io.File(path),2381,new java.io.File(path).exists());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerFile_remove980() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerFile_remove980");
//        String path = testFile.getPath();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2370,testFile,2369,testFile.exists());
//        RandomAccessFile r = new RandomAccessFile(testFile , "rw");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2372,testFile,2371,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2374,theInstance,2373,theInstance.getTrackCount());
//        theInstance.track(path, r);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2376,theInstance,2375,theInstance.getTrackCount());
//        testFile = null;
//        r = null;
//        waitUntilTrackCount();
//        pauseForDeleteToComplete(new File(path));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2378,theInstance,2377,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2380,null,2379,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2382,new java.io.File(path),2381,new java.io.File(path).exists());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerFile_remove981() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerFile_remove981");
//        String path = testFile.getPath();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2370,testFile,2369,testFile.exists());
//        RandomAccessFile r = new RandomAccessFile(testFile , "rw");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2372,testFile,2371,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2374,theInstance,2373,theInstance.getTrackCount());
//        theInstance.track(path, r);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2376,theInstance,2375,theInstance.getTrackCount());
//        r.close();
//        testFile = null;
//        r = null;
//        pauseForDeleteToComplete(new File(path));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2378,theInstance,2377,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2380,null,2379,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2382,new java.io.File(path),2381,new java.io.File(path).exists());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerFile_remove982() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerFile_remove982");
//        String path = testFile.getPath();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2370,testFile,2369,testFile.exists());
//        RandomAccessFile r = new RandomAccessFile(testFile , "rw");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2372,testFile,2371,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2374,theInstance,2373,theInstance.getTrackCount());
//        theInstance.track(path, r);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2376,theInstance,2375,theInstance.getTrackCount());
//        r.close();
//        testFile = null;
//        r = null;
//        waitUntilTrackCount();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2378,theInstance,2377,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2380,null,2379,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2382,new java.io.File(path),2381,new java.io.File(path).exists());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerDirectory_add1228() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerDirectory_add1228");
//        createFile(testFile, 100);
//        createFile(testFile, 100);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2297,testFile,2296,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2299,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory(),2298,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory().exists());
//        Object obj = new Object();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2301,theInstance,2300,theInstance.getTrackCount());
//        theInstance.track(FileBasedTestCase.getTestDirectory(), obj);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2303,theInstance,2302,theInstance.getTrackCount());
//        obj = null;
//        waitUntilTrackCount();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2305,theInstance,2304,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2307,testFile,2306,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2309,testFile.getParentFile(),2308,testFile.getParentFile().exists());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerDirectory_add1229() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerDirectory_add1229");
//        createFile(testFile, 100);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2297,testFile,2296,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2299,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory(),2298,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory().exists());
//        Object obj = new Object();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2301,theInstance,2300,theInstance.getTrackCount());
//        theInstance.track(FileBasedTestCase.getTestDirectory(), obj);
//        theInstance.track(FileBasedTestCase.getTestDirectory(), obj);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2303,theInstance,2302,theInstance.getTrackCount());
//        obj = null;
//        waitUntilTrackCount();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2305,theInstance,2304,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2307,testFile,2306,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2309,testFile.getParentFile(),2308,testFile.getParentFile().exists());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerDirectory_add1230() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerDirectory_add1230");
//        createFile(testFile, 100);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2297,testFile,2296,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2299,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory(),2298,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory().exists());
//        Object obj = new Object();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2301,theInstance,2300,theInstance.getTrackCount());
//        theInstance.track(FileBasedTestCase.getTestDirectory(), obj);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2303,theInstance,2302,theInstance.getTrackCount());
//        obj = null;
//        waitUntilTrackCount();
//        waitUntilTrackCount();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2305,theInstance,2304,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2307,testFile,2306,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2309,testFile.getParentFile(),2308,testFile.getParentFile().exists());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testFileCleanerDirectory() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerDirectory");
//        createFile(testFile, 101);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2297,testFile,2296,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2299,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory(),2298,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory().exists());
//        Object obj = new Object();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2301,theInstance,2300,theInstance.getTrackCount());
//        theInstance.track(FileBasedTestCase.getTestDirectory(), obj);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2303,theInstance,2302,theInstance.getTrackCount());
//        obj = null;
//        waitUntilTrackCount();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2305,theInstance,2304,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2307,testFile,2306,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2309,testFile.getParentFile(),2308,testFile.getParentFile().exists());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerDirectory_remove955() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerDirectory_remove955");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2297,testFile,2296,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2299,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory(),2298,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory().exists());
//        Object obj = new Object();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2301,theInstance,2300,theInstance.getTrackCount());
//        theInstance.track(FileBasedTestCase.getTestDirectory(), obj);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2303,theInstance,2302,theInstance.getTrackCount());
//        obj = null;
//        waitUntilTrackCount();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2305,theInstance,2304,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2307,testFile,2306,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2309,testFile.getParentFile(),2308,testFile.getParentFile().exists());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerDirectory_remove956() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerDirectory_remove956");
//        createFile(testFile, 100);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2297,testFile,2296,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2299,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory(),2298,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory().exists());
//        Object obj = new Object();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2301,theInstance,2300,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2303,theInstance,2302,theInstance.getTrackCount());
//        obj = null;
//        waitUntilTrackCount();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2305,theInstance,2304,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2307,testFile,2306,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2309,testFile.getParentFile(),2308,testFile.getParentFile().exists());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerDirectory_remove957() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerDirectory_remove957");
//        createFile(testFile, 100);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2297,testFile,2296,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2299,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory(),2298,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory().exists());
//        Object obj = new Object();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2301,theInstance,2300,theInstance.getTrackCount());
//        theInstance.track(FileBasedTestCase.getTestDirectory(), obj);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2303,theInstance,2302,theInstance.getTrackCount());
//        obj = null;
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2305,theInstance,2304,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2307,testFile,2306,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2309,testFile.getParentFile(),2308,testFile.getParentFile().exists());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerDirectory_NullStrategy_add1235() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerDirectory_NullStrategy_add1235");
//        createFile(testFile, 100);
//        createFile(testFile, 100);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2283,testFile,2282,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2285,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory(),2284,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory().exists());
//        Object obj = new Object();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2287,theInstance,2286,theInstance.getTrackCount());
//        theInstance.track(FileBasedTestCase.getTestDirectory(), obj, ((org.apache.commons.io.FileDeleteStrategy)(null)));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2289,theInstance,2288,theInstance.getTrackCount());
//        obj = null;
//        waitUntilTrackCount();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2291,theInstance,2290,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2293,testFile,2292,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2295,testFile.getParentFile(),2294,testFile.getParentFile().exists());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerDirectory_NullStrategy_add1236() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerDirectory_NullStrategy_add1236");
//        createFile(testFile, 100);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2283,testFile,2282,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2285,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory(),2284,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory().exists());
//        Object obj = new Object();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2287,theInstance,2286,theInstance.getTrackCount());
//        theInstance.track(FileBasedTestCase.getTestDirectory(), obj, ((org.apache.commons.io.FileDeleteStrategy)(null)));
//        theInstance.track(FileBasedTestCase.getTestDirectory(), obj, ((org.apache.commons.io.FileDeleteStrategy)(null)));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2289,theInstance,2288,theInstance.getTrackCount());
//        obj = null;
//        waitUntilTrackCount();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2291,theInstance,2290,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2293,testFile,2292,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2295,testFile.getParentFile(),2294,testFile.getParentFile().exists());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerDirectory_NullStrategy_add1237() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerDirectory_NullStrategy_add1237");
//        createFile(testFile, 100);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2283,testFile,2282,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2285,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory(),2284,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory().exists());
//        Object obj = new Object();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2287,theInstance,2286,theInstance.getTrackCount());
//        theInstance.track(FileBasedTestCase.getTestDirectory(), obj, ((org.apache.commons.io.FileDeleteStrategy)(null)));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2289,theInstance,2288,theInstance.getTrackCount());
//        obj = null;
//        waitUntilTrackCount();
//        waitUntilTrackCount();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2291,theInstance,2290,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2293,testFile,2292,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2295,testFile.getParentFile(),2294,testFile.getParentFile().exists());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testFileCleanerDirectory_NullStrategy() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerDirectory_NullStrategy");
//        createFile(testFile, 99);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2283,testFile,2282,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2285,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory(),2284,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory().exists());
//        Object obj = new Object();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2287,theInstance,2286,theInstance.getTrackCount());
//        theInstance.track(FileBasedTestCase.getTestDirectory(), obj, ((org.apache.commons.io.FileDeleteStrategy)(null)));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2289,theInstance,2288,theInstance.getTrackCount());
//        obj = null;
//        waitUntilTrackCount();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2291,theInstance,2290,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2293,testFile,2292,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2295,testFile.getParentFile(),2294,testFile.getParentFile().exists());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerDirectory_NullStrategy_remove962() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerDirectory_NullStrategy_remove962");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2283,testFile,2282,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2285,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory(),2284,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory().exists());
//        Object obj = new Object();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2287,theInstance,2286,theInstance.getTrackCount());
//        theInstance.track(FileBasedTestCase.getTestDirectory(), obj, ((org.apache.commons.io.FileDeleteStrategy)(null)));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2289,theInstance,2288,theInstance.getTrackCount());
//        obj = null;
//        waitUntilTrackCount();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2291,theInstance,2290,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2293,testFile,2292,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2295,testFile.getParentFile(),2294,testFile.getParentFile().exists());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerDirectory_NullStrategy_remove963() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerDirectory_NullStrategy_remove963");
//        createFile(testFile, 100);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2283,testFile,2282,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2285,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory(),2284,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory().exists());
//        Object obj = new Object();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2287,theInstance,2286,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2289,theInstance,2288,theInstance.getTrackCount());
//        obj = null;
//        waitUntilTrackCount();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2291,theInstance,2290,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2293,testFile,2292,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2295,testFile.getParentFile(),2294,testFile.getParentFile().exists());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerDirectory_NullStrategy_remove964() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerDirectory_NullStrategy_remove964");
//        createFile(testFile, 100);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2283,testFile,2282,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2285,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory(),2284,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory().exists());
//        Object obj = new Object();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2287,theInstance,2286,theInstance.getTrackCount());
//        theInstance.track(FileBasedTestCase.getTestDirectory(), obj, ((org.apache.commons.io.FileDeleteStrategy)(null)));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2289,theInstance,2288,theInstance.getTrackCount());
//        obj = null;
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2291,theInstance,2290,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2293,testFile,2292,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2295,testFile.getParentFile(),2294,testFile.getParentFile().exists());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerDirectory_ForceStrategy_add1231() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerDirectory_ForceStrategy_add1231");
//        createFile(testFile, 100);
//        createFile(testFile, 100);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2265,testFile,2264,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2267,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory(),2266,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory().exists());
//        Object obj = new Object();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2269,theInstance,2268,theInstance.getTrackCount());
//        theInstance.track(FileBasedTestCase.getTestDirectory(), obj, org.apache.commons.io.FileDeleteStrategy.FORCE);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2271,theInstance,2270,theInstance.getTrackCount());
//        obj = null;
//        waitUntilTrackCount();
//        pauseForDeleteToComplete(testFile.getParentFile());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2273,theInstance,2272,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2275,null,2274,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2277,new java.io.File(testFile.getPath()),2276,new java.io.File(testFile.getPath()).exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2279,null,2278,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2281,testFile.getParentFile(),2280,testFile.getParentFile().exists());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerDirectory_ForceStrategy_add1232() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerDirectory_ForceStrategy_add1232");
//        createFile(testFile, 100);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2265,testFile,2264,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2267,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory(),2266,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory().exists());
//        Object obj = new Object();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2269,theInstance,2268,theInstance.getTrackCount());
//        theInstance.track(FileBasedTestCase.getTestDirectory(), obj, org.apache.commons.io.FileDeleteStrategy.FORCE);
//        theInstance.track(FileBasedTestCase.getTestDirectory(), obj, org.apache.commons.io.FileDeleteStrategy.FORCE);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2271,theInstance,2270,theInstance.getTrackCount());
//        obj = null;
//        waitUntilTrackCount();
//        pauseForDeleteToComplete(testFile.getParentFile());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2273,theInstance,2272,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2275,null,2274,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2277,new java.io.File(testFile.getPath()),2276,new java.io.File(testFile.getPath()).exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2279,null,2278,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2281,testFile.getParentFile(),2280,testFile.getParentFile().exists());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerDirectory_ForceStrategy_add1233() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerDirectory_ForceStrategy_add1233");
//        createFile(testFile, 100);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2265,testFile,2264,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2267,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory(),2266,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory().exists());
//        Object obj = new Object();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2269,theInstance,2268,theInstance.getTrackCount());
//        theInstance.track(FileBasedTestCase.getTestDirectory(), obj, org.apache.commons.io.FileDeleteStrategy.FORCE);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2271,theInstance,2270,theInstance.getTrackCount());
//        obj = null;
//        waitUntilTrackCount();
//        waitUntilTrackCount();
//        pauseForDeleteToComplete(testFile.getParentFile());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2273,theInstance,2272,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2275,null,2274,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2277,new java.io.File(testFile.getPath()),2276,new java.io.File(testFile.getPath()).exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2279,null,2278,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2281,testFile.getParentFile(),2280,testFile.getParentFile().exists());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerDirectory_ForceStrategy_add1234() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerDirectory_ForceStrategy_add1234");
//        createFile(testFile, 100);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2265,testFile,2264,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2267,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory(),2266,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory().exists());
//        Object obj = new Object();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2269,theInstance,2268,theInstance.getTrackCount());
//        theInstance.track(FileBasedTestCase.getTestDirectory(), obj, org.apache.commons.io.FileDeleteStrategy.FORCE);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2271,theInstance,2270,theInstance.getTrackCount());
//        obj = null;
//        waitUntilTrackCount();
//        pauseForDeleteToComplete(testFile.getParentFile());
//        pauseForDeleteToComplete(testFile.getParentFile());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2273,theInstance,2272,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2275,null,2274,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2277,new java.io.File(testFile.getPath()),2276,new java.io.File(testFile.getPath()).exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2279,null,2278,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2281,testFile.getParentFile(),2280,testFile.getParentFile().exists());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testFileCleanerDirectory_ForceStrategy() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerDirectory_ForceStrategy");
//        createFile(testFile, 99);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2265,testFile,2264,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2267,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory(),2266,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory().exists());
//        Object obj = new Object();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2269,theInstance,2268,theInstance.getTrackCount());
//        theInstance.track(FileBasedTestCase.getTestDirectory(), obj, org.apache.commons.io.FileDeleteStrategy.FORCE);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2271,theInstance,2270,theInstance.getTrackCount());
//        obj = null;
//        waitUntilTrackCount();
//        pauseForDeleteToComplete(testFile.getParentFile());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2273,theInstance,2272,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2275,null,2274,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2277,new java.io.File(testFile.getPath()),2276,new java.io.File(testFile.getPath()).exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2279,null,2278,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2281,testFile.getParentFile(),2280,testFile.getParentFile().exists());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerDirectory_ForceStrategy_remove958() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerDirectory_ForceStrategy_remove958");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2265,testFile,2264,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2267,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory(),2266,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory().exists());
//        Object obj = new Object();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2269,theInstance,2268,theInstance.getTrackCount());
//        theInstance.track(FileBasedTestCase.getTestDirectory(), obj, org.apache.commons.io.FileDeleteStrategy.FORCE);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2271,theInstance,2270,theInstance.getTrackCount());
//        obj = null;
//        waitUntilTrackCount();
//        pauseForDeleteToComplete(testFile.getParentFile());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2273,theInstance,2272,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2275,null,2274,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2277,new java.io.File(testFile.getPath()),2276,new java.io.File(testFile.getPath()).exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2279,null,2278,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2281,testFile.getParentFile(),2280,testFile.getParentFile().exists());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerDirectory_ForceStrategy_remove959() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerDirectory_ForceStrategy_remove959");
//        createFile(testFile, 100);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2265,testFile,2264,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2267,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory(),2266,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory().exists());
//        Object obj = new Object();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2269,theInstance,2268,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2271,theInstance,2270,theInstance.getTrackCount());
//        obj = null;
//        waitUntilTrackCount();
//        pauseForDeleteToComplete(testFile.getParentFile());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2273,theInstance,2272,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2275,null,2274,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2277,new java.io.File(testFile.getPath()),2276,new java.io.File(testFile.getPath()).exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2279,null,2278,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2281,testFile.getParentFile(),2280,testFile.getParentFile().exists());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerDirectory_ForceStrategy_remove960() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerDirectory_ForceStrategy_remove960");
//        createFile(testFile, 100);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2265,testFile,2264,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2267,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory(),2266,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory().exists());
//        Object obj = new Object();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2269,theInstance,2268,theInstance.getTrackCount());
//        theInstance.track(FileBasedTestCase.getTestDirectory(), obj, org.apache.commons.io.FileDeleteStrategy.FORCE);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2271,theInstance,2270,theInstance.getTrackCount());
//        obj = null;
//        pauseForDeleteToComplete(testFile.getParentFile());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2273,theInstance,2272,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2275,null,2274,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2277,new java.io.File(testFile.getPath()),2276,new java.io.File(testFile.getPath()).exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2279,null,2278,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2281,testFile.getParentFile(),2280,testFile.getParentFile().exists());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerDirectory_ForceStrategy_remove961() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerDirectory_ForceStrategy_remove961");
//        createFile(testFile, 100);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2265,testFile,2264,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2267,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory(),2266,org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory().exists());
//        Object obj = new Object();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2269,theInstance,2268,theInstance.getTrackCount());
//        theInstance.track(FileBasedTestCase.getTestDirectory(), obj, org.apache.commons.io.FileDeleteStrategy.FORCE);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2271,theInstance,2270,theInstance.getTrackCount());
//        obj = null;
//        waitUntilTrackCount();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2273,theInstance,2272,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2275,null,2274,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2277,new java.io.File(testFile.getPath()),2276,new java.io.File(testFile.getPath()).exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2279,null,2278,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2281,testFile.getParentFile(),2280,testFile.getParentFile().exists());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerNull() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerNull");
//        try {
//            theInstance.track(((File)(null)), new Object());
//            theInstance.track(((File)(null)), new Object());
//        } catch (NullPointerException ex) {
//        }
//        try {
//            theInstance.track(((File)(null)), new Object(), org.apache.commons.io.FileDeleteStrategy.NORMAL);
//        } catch (NullPointerException ex) {
//        }
//        try {
//            theInstance.track(((String)(null)), new Object());
//        } catch (NullPointerException ex) {
//        }
//        try {
//            theInstance.track(((String)(null)), new Object(), org.apache.commons.io.FileDeleteStrategy.NORMAL);
//        } catch (NullPointerException ex) {
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerNull_add1258() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerNull_add1258");
//        try {
//            theInstance.track(((File)(null)), new Object());
//        } catch (NullPointerException ex) {
//        }
//        try {
//            theInstance.track(((File)(null)), new Object(), org.apache.commons.io.FileDeleteStrategy.NORMAL);
//            theInstance.track(((File)(null)), new Object(), org.apache.commons.io.FileDeleteStrategy.NORMAL);
//        } catch (NullPointerException ex) {
//        }
//        try {
//            theInstance.track(((String)(null)), new Object());
//        } catch (NullPointerException ex) {
//        }
//        try {
//            theInstance.track(((String)(null)), new Object(), org.apache.commons.io.FileDeleteStrategy.NORMAL);
//        } catch (NullPointerException ex) {
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerNull_add1259() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerNull_add1259");
//        try {
//            theInstance.track(((File)(null)), new Object());
//        } catch (NullPointerException ex) {
//        }
//        try {
//            theInstance.track(((File)(null)), new Object(), org.apache.commons.io.FileDeleteStrategy.NORMAL);
//        } catch (NullPointerException ex) {
//        }
//        try {
//            theInstance.track(((String)(null)), new Object());
//            theInstance.track(((String)(null)), new Object());
//        } catch (NullPointerException ex) {
//        }
//        try {
//            theInstance.track(((String)(null)), new Object(), org.apache.commons.io.FileDeleteStrategy.NORMAL);
//        } catch (NullPointerException ex) {
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerNull_add1260() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerNull_add1260");
//        try {
//            theInstance.track(((File)(null)), new Object());
//        } catch (NullPointerException ex) {
//        }
//        try {
//            theInstance.track(((File)(null)), new Object(), org.apache.commons.io.FileDeleteStrategy.NORMAL);
//        } catch (NullPointerException ex) {
//        }
//        try {
//            theInstance.track(((String)(null)), new Object());
//        } catch (NullPointerException ex) {
//        }
//        try {
//            theInstance.track(((String)(null)), new Object(), org.apache.commons.io.FileDeleteStrategy.NORMAL);
//            theInstance.track(((String)(null)), new Object(), org.apache.commons.io.FileDeleteStrategy.NORMAL);
//        } catch (NullPointerException ex) {
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerExitWhenFinishedFirst() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerExitWhenFinishedFirst");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2357,theInstance.exitWhenFinished);
//        theInstance.exitWhenFinished();
//        theInstance.exitWhenFinished();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2358,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2359,theInstance.reaper);
//        waitUntilTrackCount();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2361,theInstance,2360,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2362,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2363,theInstance.reaper);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerExitWhenFinishedFirst_add1250() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerExitWhenFinishedFirst_add1250");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2357,theInstance.exitWhenFinished);
//        theInstance.exitWhenFinished();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2358,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2359,theInstance.reaper);
//        waitUntilTrackCount();
//        waitUntilTrackCount();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2361,theInstance,2360,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2362,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2363,theInstance.reaper);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerExitWhenFinishedFirst_remove976() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerExitWhenFinishedFirst_remove976");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2357,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2358,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2359,theInstance.reaper);
//        waitUntilTrackCount();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2361,theInstance,2360,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2362,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2363,theInstance.reaper);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerExitWhenFinishedFirst_remove977() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerExitWhenFinishedFirst_remove977");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2357,theInstance.exitWhenFinished);
//        theInstance.exitWhenFinished();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2358,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2359,theInstance.reaper);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2361,theInstance,2360,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2362,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2363,theInstance.reaper);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerExitWhenFinished_NoTrackAfter() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerExitWhenFinished_NoTrackAfter");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2364,theInstance.exitWhenFinished);
//        theInstance.exitWhenFinished();
//        theInstance.exitWhenFinished();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2365,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2366,theInstance.reaper);
//        String path = testFile.getPath();
//        Object marker = new Object();
//        try {
//            theInstance.track(path, marker);
//        } catch (IllegalStateException ex) {
//        }
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2367,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2368,theInstance.reaper);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerExitWhenFinished_NoTrackAfter_add1252() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerExitWhenFinished_NoTrackAfter_add1252");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2364,theInstance.exitWhenFinished);
//        theInstance.exitWhenFinished();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2365,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2366,theInstance.reaper);
//        String path = testFile.getPath();
//        Object marker = new Object();
//        try {
//            theInstance.track(path, marker);
//            theInstance.track(path, marker);
//        } catch (IllegalStateException ex) {
//        }
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2367,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2368,theInstance.reaper);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerExitWhenFinished_NoTrackAfter_remove978() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerExitWhenFinished_NoTrackAfter_remove978");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2364,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2365,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2366,theInstance.reaper);
//        String path = testFile.getPath();
//        Object marker = new Object();
//        try {
//            theInstance.track(path, marker);
//        } catch (IllegalStateException ex) {
//        }
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2367,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2368,theInstance.reaper);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerExitWhenFinished1_add1238() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerExitWhenFinished1_add1238");
//        String path = testFile.getPath();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2311,testFile,2310,testFile.exists());
//        RandomAccessFile r = new RandomAccessFile(testFile , "rw");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2313,testFile,2312,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2315,theInstance,2314,theInstance.getTrackCount());
//        theInstance.track(path, r);
//        theInstance.track(path, r);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2317,theInstance,2316,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2318,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2320,theInstance.reaper,2319,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2321,theInstance.exitWhenFinished);
//        theInstance.exitWhenFinished();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2322,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2324,theInstance.reaper,2323,theInstance.reaper.isAlive());
//        r.close();
//        testFile = null;
//        r = null;
//        waitUntilTrackCount();
//        pauseForDeleteToComplete(new File(path));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2326,theInstance,2325,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2327,("11-testFile exists " + (showFailures())));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2329,new java.io.File(path),2328,new java.io.File(path).exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2330,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2332,theInstance.reaper,2331,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerExitWhenFinished1_add1239() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerExitWhenFinished1_add1239");
//        String path = testFile.getPath();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2311,testFile,2310,testFile.exists());
//        RandomAccessFile r = new RandomAccessFile(testFile , "rw");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2313,testFile,2312,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2315,theInstance,2314,theInstance.getTrackCount());
//        theInstance.track(path, r);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2317,theInstance,2316,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2318,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2320,theInstance.reaper,2319,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2321,theInstance.exitWhenFinished);
//        theInstance.exitWhenFinished();
//        theInstance.exitWhenFinished();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2322,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2324,theInstance.reaper,2323,theInstance.reaper.isAlive());
//        r.close();
//        testFile = null;
//        r = null;
//        waitUntilTrackCount();
//        pauseForDeleteToComplete(new File(path));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2326,theInstance,2325,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2327,("11-testFile exists " + (showFailures())));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2329,new java.io.File(path),2328,new java.io.File(path).exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2330,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2332,theInstance.reaper,2331,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerExitWhenFinished1_add1240() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerExitWhenFinished1_add1240");
//        String path = testFile.getPath();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2311,testFile,2310,testFile.exists());
//        RandomAccessFile r = new RandomAccessFile(testFile , "rw");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2313,testFile,2312,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2315,theInstance,2314,theInstance.getTrackCount());
//        theInstance.track(path, r);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2317,theInstance,2316,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2318,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2320,theInstance.reaper,2319,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2321,theInstance.exitWhenFinished);
//        theInstance.exitWhenFinished();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2322,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2324,theInstance.reaper,2323,theInstance.reaper.isAlive());
//        r.close();
//        r.close();
//        testFile = null;
//        r = null;
//        waitUntilTrackCount();
//        pauseForDeleteToComplete(new File(path));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2326,theInstance,2325,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2327,("11-testFile exists " + (showFailures())));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2329,new java.io.File(path),2328,new java.io.File(path).exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2330,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2332,theInstance.reaper,2331,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerExitWhenFinished1_add1241() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerExitWhenFinished1_add1241");
//        String path = testFile.getPath();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2311,testFile,2310,testFile.exists());
//        RandomAccessFile r = new RandomAccessFile(testFile , "rw");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2313,testFile,2312,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2315,theInstance,2314,theInstance.getTrackCount());
//        theInstance.track(path, r);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2317,theInstance,2316,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2318,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2320,theInstance.reaper,2319,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2321,theInstance.exitWhenFinished);
//        theInstance.exitWhenFinished();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2322,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2324,theInstance.reaper,2323,theInstance.reaper.isAlive());
//        r.close();
//        testFile = null;
//        r = null;
//        waitUntilTrackCount();
//        waitUntilTrackCount();
//        pauseForDeleteToComplete(new File(path));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2326,theInstance,2325,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2327,("11-testFile exists " + (showFailures())));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2329,new java.io.File(path),2328,new java.io.File(path).exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2330,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2332,theInstance.reaper,2331,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerExitWhenFinished1_add1242() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerExitWhenFinished1_add1242");
//        String path = testFile.getPath();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2311,testFile,2310,testFile.exists());
//        RandomAccessFile r = new RandomAccessFile(testFile , "rw");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2313,testFile,2312,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2315,theInstance,2314,theInstance.getTrackCount());
//        theInstance.track(path, r);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2317,theInstance,2316,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2318,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2320,theInstance.reaper,2319,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2321,theInstance.exitWhenFinished);
//        theInstance.exitWhenFinished();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2322,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2324,theInstance.reaper,2323,theInstance.reaper.isAlive());
//        r.close();
//        testFile = null;
//        r = null;
//        waitUntilTrackCount();
//        pauseForDeleteToComplete(new File(path));
//        pauseForDeleteToComplete(new File(path));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2326,theInstance,2325,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2327,("11-testFile exists " + (showFailures())));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2329,new java.io.File(path),2328,new java.io.File(path).exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2330,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2332,theInstance.reaper,2331,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testFileCleanerExitWhenFinished1() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerExitWhenFinished1");
//        String path = testFile.getPath();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2311,testFile,2310,testFile.exists());
//        RandomAccessFile r = new RandomAccessFile(testFile , "foo");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2313,testFile,2312,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2315,theInstance,2314,theInstance.getTrackCount());
//        theInstance.track(path, r);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2317,theInstance,2316,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2318,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2320,theInstance.reaper,2319,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2321,theInstance.exitWhenFinished);
//        theInstance.exitWhenFinished();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2322,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2324,theInstance.reaper,2323,theInstance.reaper.isAlive());
//        r.close();
//        testFile = null;
//        r = null;
//        waitUntilTrackCount();
//        pauseForDeleteToComplete(new File(path));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2326,theInstance,2325,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2327,("11-testFile exists " + (showFailures())));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2329,new java.io.File(path),2328,new java.io.File(path).exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2330,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2332,theInstance.reaper,2331,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerExitWhenFinished1_remove965() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerExitWhenFinished1_remove965");
//        String path = testFile.getPath();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2311,testFile,2310,testFile.exists());
//        RandomAccessFile r = new RandomAccessFile(testFile , "rw");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2313,testFile,2312,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2315,theInstance,2314,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2317,theInstance,2316,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2318,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2320,theInstance.reaper,2319,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2321,theInstance.exitWhenFinished);
//        theInstance.exitWhenFinished();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2322,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2324,theInstance.reaper,2323,theInstance.reaper.isAlive());
//        r.close();
//        testFile = null;
//        r = null;
//        waitUntilTrackCount();
//        pauseForDeleteToComplete(new File(path));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2326,theInstance,2325,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2327,("11-testFile exists " + (showFailures())));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2329,new java.io.File(path),2328,new java.io.File(path).exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2330,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2332,theInstance.reaper,2331,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerExitWhenFinished1_remove966() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerExitWhenFinished1_remove966");
//        String path = testFile.getPath();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2311,testFile,2310,testFile.exists());
//        RandomAccessFile r = new RandomAccessFile(testFile , "rw");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2313,testFile,2312,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2315,theInstance,2314,theInstance.getTrackCount());
//        theInstance.track(path, r);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2317,theInstance,2316,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2318,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2320,theInstance.reaper,2319,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2321,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2322,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2324,theInstance.reaper,2323,theInstance.reaper.isAlive());
//        r.close();
//        testFile = null;
//        r = null;
//        waitUntilTrackCount();
//        pauseForDeleteToComplete(new File(path));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2326,theInstance,2325,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2327,("11-testFile exists " + (showFailures())));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2329,new java.io.File(path),2328,new java.io.File(path).exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2330,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2332,theInstance.reaper,2331,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerExitWhenFinished1_remove967() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerExitWhenFinished1_remove967");
//        String path = testFile.getPath();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2311,testFile,2310,testFile.exists());
//        RandomAccessFile r = new RandomAccessFile(testFile , "rw");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2313,testFile,2312,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2315,theInstance,2314,theInstance.getTrackCount());
//        theInstance.track(path, r);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2317,theInstance,2316,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2318,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2320,theInstance.reaper,2319,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2321,theInstance.exitWhenFinished);
//        theInstance.exitWhenFinished();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2322,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2324,theInstance.reaper,2323,theInstance.reaper.isAlive());
//        testFile = null;
//        r = null;
//        waitUntilTrackCount();
//        pauseForDeleteToComplete(new File(path));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2326,theInstance,2325,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2327,("11-testFile exists " + (showFailures())));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2329,new java.io.File(path),2328,new java.io.File(path).exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2330,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2332,theInstance.reaper,2331,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerExitWhenFinished1_remove968() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerExitWhenFinished1_remove968");
//        String path = testFile.getPath();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2311,testFile,2310,testFile.exists());
//        RandomAccessFile r = new RandomAccessFile(testFile , "rw");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2313,testFile,2312,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2315,theInstance,2314,theInstance.getTrackCount());
//        theInstance.track(path, r);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2317,theInstance,2316,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2318,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2320,theInstance.reaper,2319,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2321,theInstance.exitWhenFinished);
//        theInstance.exitWhenFinished();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2322,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2324,theInstance.reaper,2323,theInstance.reaper.isAlive());
//        r.close();
//        testFile = null;
//        r = null;
//        pauseForDeleteToComplete(new File(path));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2326,theInstance,2325,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2327,("11-testFile exists " + (showFailures())));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2329,new java.io.File(path),2328,new java.io.File(path).exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2330,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2332,theInstance.reaper,2331,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerExitWhenFinished1_remove969() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerExitWhenFinished1_remove969");
//        String path = testFile.getPath();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2311,testFile,2310,testFile.exists());
//        RandomAccessFile r = new RandomAccessFile(testFile , "rw");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2313,testFile,2312,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2315,theInstance,2314,theInstance.getTrackCount());
//        theInstance.track(path, r);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2317,theInstance,2316,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2318,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2320,theInstance.reaper,2319,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2321,theInstance.exitWhenFinished);
//        theInstance.exitWhenFinished();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2322,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2324,theInstance.reaper,2323,theInstance.reaper.isAlive());
//        r.close();
//        testFile = null;
//        r = null;
//        waitUntilTrackCount();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2326,theInstance,2325,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2327,("11-testFile exists " + (showFailures())));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2329,new java.io.File(path),2328,new java.io.File(path).exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2330,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2332,theInstance.reaper,2331,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerExitWhenFinished2_add1243() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerExitWhenFinished2_add1243");
//        String path = testFile.getPath();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2334,testFile,2333,testFile.exists());
//        RandomAccessFile r = new RandomAccessFile(testFile , "rw");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2336,testFile,2335,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2338,theInstance,2337,theInstance.getTrackCount());
//        theInstance.track(path, r);
//        theInstance.track(path, r);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2340,theInstance,2339,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2341,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2343,theInstance.reaper,2342,theInstance.reaper.isAlive());
//        r.close();
//        testFile = null;
//        r = null;
//        waitUntilTrackCount();
//        pauseForDeleteToComplete(new File(path));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2345,theInstance,2344,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2347,null,2346,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2349,new java.io.File(path),2348,new java.io.File(path).exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,theInstance.reaper,2351,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2353,theInstance.exitWhenFinished);
//        theInstance.exitWhenFinished();
//        for (int i = 0 ; (i < 20) && (theInstance.reaper.isAlive()) ; i++) {
//            Thread.sleep(500L);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2354,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2356,theInstance.reaper,2355,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerExitWhenFinished2_add1244() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerExitWhenFinished2_add1244");
//        String path = testFile.getPath();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2334,testFile,2333,testFile.exists());
//        RandomAccessFile r = new RandomAccessFile(testFile , "rw");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2336,testFile,2335,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2338,theInstance,2337,theInstance.getTrackCount());
//        theInstance.track(path, r);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2340,theInstance,2339,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2341,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2343,theInstance.reaper,2342,theInstance.reaper.isAlive());
//        r.close();
//        r.close();
//        testFile = null;
//        r = null;
//        waitUntilTrackCount();
//        pauseForDeleteToComplete(new File(path));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2345,theInstance,2344,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2347,null,2346,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2349,new java.io.File(path),2348,new java.io.File(path).exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,theInstance.reaper,2351,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2353,theInstance.exitWhenFinished);
//        theInstance.exitWhenFinished();
//        for (int i = 0 ; (i < 20) && (theInstance.reaper.isAlive()) ; i++) {
//            Thread.sleep(500L);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2354,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2356,theInstance.reaper,2355,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerExitWhenFinished2_add1245() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerExitWhenFinished2_add1245");
//        String path = testFile.getPath();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2334,testFile,2333,testFile.exists());
//        RandomAccessFile r = new RandomAccessFile(testFile , "rw");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2336,testFile,2335,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2338,theInstance,2337,theInstance.getTrackCount());
//        theInstance.track(path, r);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2340,theInstance,2339,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2341,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2343,theInstance.reaper,2342,theInstance.reaper.isAlive());
//        r.close();
//        testFile = null;
//        r = null;
//        waitUntilTrackCount();
//        waitUntilTrackCount();
//        pauseForDeleteToComplete(new File(path));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2345,theInstance,2344,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2347,null,2346,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2349,new java.io.File(path),2348,new java.io.File(path).exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,theInstance.reaper,2351,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2353,theInstance.exitWhenFinished);
//        theInstance.exitWhenFinished();
//        for (int i = 0 ; (i < 20) && (theInstance.reaper.isAlive()) ; i++) {
//            Thread.sleep(500L);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2354,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2356,theInstance.reaper,2355,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerExitWhenFinished2_add1246() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerExitWhenFinished2_add1246");
//        String path = testFile.getPath();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2334,testFile,2333,testFile.exists());
//        RandomAccessFile r = new RandomAccessFile(testFile , "rw");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2336,testFile,2335,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2338,theInstance,2337,theInstance.getTrackCount());
//        theInstance.track(path, r);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2340,theInstance,2339,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2341,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2343,theInstance.reaper,2342,theInstance.reaper.isAlive());
//        r.close();
//        testFile = null;
//        r = null;
//        waitUntilTrackCount();
//        pauseForDeleteToComplete(new File(path));
//        pauseForDeleteToComplete(new File(path));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2345,theInstance,2344,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2347,null,2346,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2349,new java.io.File(path),2348,new java.io.File(path).exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,theInstance.reaper,2351,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2353,theInstance.exitWhenFinished);
//        theInstance.exitWhenFinished();
//        for (int i = 0 ; (i < 20) && (theInstance.reaper.isAlive()) ; i++) {
//            Thread.sleep(500L);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2354,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2356,theInstance.reaper,2355,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerExitWhenFinished2_add1247() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerExitWhenFinished2_add1247");
//        String path = testFile.getPath();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2334,testFile,2333,testFile.exists());
//        RandomAccessFile r = new RandomAccessFile(testFile , "rw");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2336,testFile,2335,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2338,theInstance,2337,theInstance.getTrackCount());
//        theInstance.track(path, r);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2340,theInstance,2339,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2341,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2343,theInstance.reaper,2342,theInstance.reaper.isAlive());
//        r.close();
//        testFile = null;
//        r = null;
//        waitUntilTrackCount();
//        pauseForDeleteToComplete(new File(path));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2345,theInstance,2344,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2347,null,2346,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2349,new java.io.File(path),2348,new java.io.File(path).exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,theInstance.reaper,2351,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2353,theInstance.exitWhenFinished);
//        theInstance.exitWhenFinished();
//        theInstance.exitWhenFinished();
//        for (int i = 0 ; (i < 20) && (theInstance.reaper.isAlive()) ; i++) {
//            Thread.sleep(500L);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2354,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2356,theInstance.reaper,2355,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerExitWhenFinished2_add1248() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerExitWhenFinished2_add1248");
//        String path = testFile.getPath();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2334,testFile,2333,testFile.exists());
//        RandomAccessFile r = new RandomAccessFile(testFile , "rw");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2336,testFile,2335,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2338,theInstance,2337,theInstance.getTrackCount());
//        theInstance.track(path, r);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2340,theInstance,2339,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2341,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2343,theInstance.reaper,2342,theInstance.reaper.isAlive());
//        r.close();
//        testFile = null;
//        r = null;
//        waitUntilTrackCount();
//        pauseForDeleteToComplete(new File(path));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2345,theInstance,2344,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2347,null,2346,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2349,new java.io.File(path),2348,new java.io.File(path).exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,theInstance.reaper,2351,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2353,theInstance.exitWhenFinished);
//        theInstance.exitWhenFinished();
//        for (int i = 0 ; (i < 20) && (theInstance.reaper.isAlive()) ; i++) {
//            Thread.sleep(500L);
//            Thread.sleep(500L);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2354,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2356,theInstance.reaper,2355,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testFileCleanerExitWhenFinished2() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerExitWhenFinished2");
//        String path = testFile.getPath();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2334,testFile,2333,testFile.exists());
//        RandomAccessFile r = new RandomAccessFile(testFile , "foo");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2336,testFile,2335,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2338,theInstance,2337,theInstance.getTrackCount());
//        theInstance.track(path, r);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2340,theInstance,2339,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2341,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2343,theInstance.reaper,2342,theInstance.reaper.isAlive());
//        r.close();
//        testFile = null;
//        r = null;
//        waitUntilTrackCount();
//        pauseForDeleteToComplete(new File(path));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2345,theInstance,2344,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2347,null,2346,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2349,new java.io.File(path),2348,new java.io.File(path).exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,theInstance.reaper,2351,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2353,theInstance.exitWhenFinished);
//        theInstance.exitWhenFinished();
//        for (int i = 0 ; (i < 20) && (theInstance.reaper.isAlive()) ; i++) {
//            Thread.sleep(500L);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2354,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2356,theInstance.reaper,2355,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testFileCleanerExitWhenFinished2_literalMutation2775() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerExitWhenFinished2_literalMutation2775");
//        String path = testFile.getPath();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2334,testFile,2333,testFile.exists());
//        RandomAccessFile r = new RandomAccessFile(testFile , "rw");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2336,testFile,2335,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2338,theInstance,2337,theInstance.getTrackCount());
//        theInstance.track(path, r);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2340,theInstance,2339,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2341,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2343,theInstance.reaper,2342,theInstance.reaper.isAlive());
//        r.close();
//        testFile = null;
//        r = null;
//        waitUntilTrackCount();
//        pauseForDeleteToComplete(new File(path));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2345,theInstance,2344,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2347,null,2346,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2349,new java.io.File(path),2348,new java.io.File(path).exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,theInstance.reaper,2351,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2353,theInstance.exitWhenFinished);
//        theInstance.exitWhenFinished();
//        for (int i = -1 ; (i < 20) && (theInstance.reaper.isAlive()) ; i++) {
//            Thread.sleep(500L);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2354,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2356,theInstance.reaper,2355,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testFileCleanerExitWhenFinished2_literalMutation2776() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerExitWhenFinished2_literalMutation2776");
//        String path = testFile.getPath();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2334,testFile,2333,testFile.exists());
//        RandomAccessFile r = new RandomAccessFile(testFile , "rw");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2336,testFile,2335,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2338,theInstance,2337,theInstance.getTrackCount());
//        theInstance.track(path, r);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2340,theInstance,2339,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2341,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2343,theInstance.reaper,2342,theInstance.reaper.isAlive());
//        r.close();
//        testFile = null;
//        r = null;
//        waitUntilTrackCount();
//        pauseForDeleteToComplete(new File(path));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2345,theInstance,2344,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2347,null,2346,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2349,new java.io.File(path),2348,new java.io.File(path).exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,theInstance.reaper,2351,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2353,theInstance.exitWhenFinished);
//        theInstance.exitWhenFinished();
//        for (int i = 0 ; (i < 19) && (theInstance.reaper.isAlive()) ; i++) {
//            Thread.sleep(500L);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2354,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2356,theInstance.reaper,2355,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testFileCleanerExitWhenFinished2_literalMutation2777() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerExitWhenFinished2_literalMutation2777");
//        String path = testFile.getPath();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2334,testFile,2333,testFile.exists());
//        RandomAccessFile r = new RandomAccessFile(testFile , "rw");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2336,testFile,2335,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2338,theInstance,2337,theInstance.getTrackCount());
//        theInstance.track(path, r);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2340,theInstance,2339,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2341,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2343,theInstance.reaper,2342,theInstance.reaper.isAlive());
//        r.close();
//        testFile = null;
//        r = null;
//        waitUntilTrackCount();
//        pauseForDeleteToComplete(new File(path));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2345,theInstance,2344,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2347,null,2346,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2349,new java.io.File(path),2348,new java.io.File(path).exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,theInstance.reaper,2351,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2353,theInstance.exitWhenFinished);
//        theInstance.exitWhenFinished();
//        for (int i = 0 ; (i < 20) && (theInstance.reaper.isAlive()) ; i++) {
//            Thread.sleep(499L);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2354,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2356,theInstance.reaper,2355,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerExitWhenFinished2_remove970() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerExitWhenFinished2_remove970");
//        String path = testFile.getPath();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2334,testFile,2333,testFile.exists());
//        RandomAccessFile r = new RandomAccessFile(testFile , "rw");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2336,testFile,2335,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2338,theInstance,2337,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2340,theInstance,2339,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2341,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2343,theInstance.reaper,2342,theInstance.reaper.isAlive());
//        r.close();
//        testFile = null;
//        r = null;
//        waitUntilTrackCount();
//        pauseForDeleteToComplete(new File(path));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2345,theInstance,2344,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2347,null,2346,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2349,new java.io.File(path),2348,new java.io.File(path).exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,theInstance.reaper,2351,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2353,theInstance.exitWhenFinished);
//        theInstance.exitWhenFinished();
//        for (int i = 0 ; (i < 20) && (theInstance.reaper.isAlive()) ; i++) {
//            Thread.sleep(500L);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2354,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2356,theInstance.reaper,2355,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerExitWhenFinished2_remove971() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerExitWhenFinished2_remove971");
//        String path = testFile.getPath();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2334,testFile,2333,testFile.exists());
//        RandomAccessFile r = new RandomAccessFile(testFile , "rw");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2336,testFile,2335,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2338,theInstance,2337,theInstance.getTrackCount());
//        theInstance.track(path, r);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2340,theInstance,2339,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2341,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2343,theInstance.reaper,2342,theInstance.reaper.isAlive());
//        testFile = null;
//        r = null;
//        waitUntilTrackCount();
//        pauseForDeleteToComplete(new File(path));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2345,theInstance,2344,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2347,null,2346,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2349,new java.io.File(path),2348,new java.io.File(path).exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,theInstance.reaper,2351,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2353,theInstance.exitWhenFinished);
//        theInstance.exitWhenFinished();
//        for (int i = 0 ; (i < 20) && (theInstance.reaper.isAlive()) ; i++) {
//            Thread.sleep(500L);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2354,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2356,theInstance.reaper,2355,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerExitWhenFinished2_remove972() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerExitWhenFinished2_remove972");
//        String path = testFile.getPath();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2334,testFile,2333,testFile.exists());
//        RandomAccessFile r = new RandomAccessFile(testFile , "rw");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2336,testFile,2335,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2338,theInstance,2337,theInstance.getTrackCount());
//        theInstance.track(path, r);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2340,theInstance,2339,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2341,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2343,theInstance.reaper,2342,theInstance.reaper.isAlive());
//        r.close();
//        testFile = null;
//        r = null;
//        pauseForDeleteToComplete(new File(path));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2345,theInstance,2344,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2347,null,2346,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2349,new java.io.File(path),2348,new java.io.File(path).exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,theInstance.reaper,2351,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2353,theInstance.exitWhenFinished);
//        theInstance.exitWhenFinished();
//        for (int i = 0 ; (i < 20) && (theInstance.reaper.isAlive()) ; i++) {
//            Thread.sleep(500L);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2354,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2356,theInstance.reaper,2355,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerExitWhenFinished2_remove973() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerExitWhenFinished2_remove973");
//        String path = testFile.getPath();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2334,testFile,2333,testFile.exists());
//        RandomAccessFile r = new RandomAccessFile(testFile , "rw");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2336,testFile,2335,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2338,theInstance,2337,theInstance.getTrackCount());
//        theInstance.track(path, r);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2340,theInstance,2339,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2341,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2343,theInstance.reaper,2342,theInstance.reaper.isAlive());
//        r.close();
//        testFile = null;
//        r = null;
//        waitUntilTrackCount();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2345,theInstance,2344,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2347,null,2346,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2349,new java.io.File(path),2348,new java.io.File(path).exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,theInstance.reaper,2351,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2353,theInstance.exitWhenFinished);
//        theInstance.exitWhenFinished();
//        for (int i = 0 ; (i < 20) && (theInstance.reaper.isAlive()) ; i++) {
//            Thread.sleep(500L);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2354,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2356,theInstance.reaper,2355,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerExitWhenFinished2_remove974() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerExitWhenFinished2_remove974");
//        String path = testFile.getPath();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2334,testFile,2333,testFile.exists());
//        RandomAccessFile r = new RandomAccessFile(testFile , "rw");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2336,testFile,2335,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2338,theInstance,2337,theInstance.getTrackCount());
//        theInstance.track(path, r);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2340,theInstance,2339,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2341,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2343,theInstance.reaper,2342,theInstance.reaper.isAlive());
//        r.close();
//        testFile = null;
//        r = null;
//        waitUntilTrackCount();
//        pauseForDeleteToComplete(new File(path));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2345,theInstance,2344,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2347,null,2346,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2349,new java.io.File(path),2348,new java.io.File(path).exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,theInstance.reaper,2351,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2353,theInstance.exitWhenFinished);
//        for (int i = 0 ; (i < 20) && (theInstance.reaper.isAlive()) ; i++) {
//            Thread.sleep(500L);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2354,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2356,theInstance.reaper,2355,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testFileCleanerExitWhenFinished2_remove975() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileCleanerExitWhenFinished2_remove975");
//        String path = testFile.getPath();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2334,testFile,2333,testFile.exists());
//        RandomAccessFile r = new RandomAccessFile(testFile , "rw");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2336,testFile,2335,testFile.exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2338,theInstance,2337,theInstance.getTrackCount());
//        theInstance.track(path, r);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2340,theInstance,2339,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2341,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2343,theInstance.reaper,2342,theInstance.reaper.isAlive());
//        r.close();
//        testFile = null;
//        r = null;
//        waitUntilTrackCount();
//        pauseForDeleteToComplete(new File(path));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2345,theInstance,2344,theInstance.getTrackCount());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2347,null,2346,showFailures());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2349,new java.io.File(path),2348,new java.io.File(path).exists());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,theInstance.reaper,2351,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2353,theInstance.exitWhenFinished);
//        theInstance.exitWhenFinished();
//        for (int i = 0 ; (i < 20) && (theInstance.reaper.isAlive()) ; i++) {
//        }
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2354,theInstance.exitWhenFinished);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2356,theInstance.reaper,2355,theInstance.reaper.isAlive());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    private void pauseForDeleteToComplete(File file) {
//        int count = 0;
//        while ((file.exists()) && ((count++) < 40)) {
//            try {
//                Thread.sleep(500L);
//            } catch (InterruptedException e) {
//            }
//            file = new File(file.getPath());
//        }
//    }
//
//    private String showFailures() throws Exception {
//        if ((theInstance.deleteFailures.size()) == 1) {
//            return ("[Delete Failed: " + (theInstance.deleteFailures.get(0))) + "]";
//        } else {
//            return ("[Delete Failures: " + (theInstance.deleteFailures.size())) + "]";
//        }
//    }
//
//    private void waitUntilTrackCount() throws Exception {
//        java.lang.System.gc();
//        Thread.sleep(500);
//        int count = 0;
//        while (((theInstance.getTrackCount()) != 0) && ((count++) < 5)) {
//            List<java.lang.String> list = new ArrayList<java.lang.String>();
//            try {
//                long i = 0;
//                while ((theInstance.getTrackCount()) != 0) {
//                    list.add(("A Big String A Big String A Big String A Big String A Big String A Big String A Big String A Big String A Big String A Big String " + (i++)));
//                }
//            } catch (Throwable ignored) {
//            }
//            list = null;
//            java.lang.System.gc();
//            Thread.sleep(1000);
//        }
//        if ((theInstance.getTrackCount()) != 0) {
//            throw new IllegalStateException("Your JVM is not releasing References, try running the testcase with less memory (-Xmx)");
//        } 
//    }
//}
//

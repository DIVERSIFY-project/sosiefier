package org.apache.commons.io;

import java.io.File;
import org.apache.commons.io.testtools.FileBasedTestCase;
import java.io.IOException;
import org.junit.Test;

/** 
 * Test for FileDeleteStrategy.
 * 
 * @version $Id$
 * @see FileDeleteStrategy
 */
public class FileDeleteStrategyTestCase extends FileBasedTestCase {
    public FileDeleteStrategyTestCase(String name) {
        super(name);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    @Test(timeout = 1000)
    public void testDeleteNormal_add1264() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeleteNormal_add1264");
        File baseDir = FileBasedTestCase.getTestDirectory();
        File subDir = new File(baseDir , "test");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2396,subDir,2395,subDir.mkdir());
        File subFile = new File(subDir , "a.txt");
        createFile(subFile, 16);
        createFile(subFile, 16);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2398,subDir,2397,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2400,subFile,2399,subFile.exists());
        try {
            FileDeleteStrategy.NORMAL.delete(subDir);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2402,subDir,2401,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2404,subFile,2403,subFile.exists());
        FileDeleteStrategy.NORMAL.delete(subFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2406,subDir,2405,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2408,subFile,2407,subFile.exists());
        FileDeleteStrategy.NORMAL.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2410,subDir,2409,subDir.exists());
        FileDeleteStrategy.NORMAL.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2412,subDir,2411,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeleteNormal_add1265() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeleteNormal_add1265");
        File baseDir = FileBasedTestCase.getTestDirectory();
        File subDir = new File(baseDir , "test");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2396,subDir,2395,subDir.mkdir());
        File subFile = new File(subDir , "a.txt");
        createFile(subFile, 16);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2398,subDir,2397,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2400,subFile,2399,subFile.exists());
        try {
            FileDeleteStrategy.NORMAL.delete(subDir);
            FileDeleteStrategy.NORMAL.delete(subDir);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2402,subDir,2401,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2404,subFile,2403,subFile.exists());
        FileDeleteStrategy.NORMAL.delete(subFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2406,subDir,2405,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2408,subFile,2407,subFile.exists());
        FileDeleteStrategy.NORMAL.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2410,subDir,2409,subDir.exists());
        FileDeleteStrategy.NORMAL.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2412,subDir,2411,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeleteNormal_add1266() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeleteNormal_add1266");
        File baseDir = FileBasedTestCase.getTestDirectory();
        File subDir = new File(baseDir , "test");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2396,subDir,2395,subDir.mkdir());
        File subFile = new File(subDir , "a.txt");
        createFile(subFile, 16);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2398,subDir,2397,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2400,subFile,2399,subFile.exists());
        try {
            FileDeleteStrategy.NORMAL.delete(subDir);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2402,subDir,2401,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2404,subFile,2403,subFile.exists());
        FileDeleteStrategy.NORMAL.delete(subFile);
        FileDeleteStrategy.NORMAL.delete(subFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2406,subDir,2405,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2408,subFile,2407,subFile.exists());
        FileDeleteStrategy.NORMAL.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2410,subDir,2409,subDir.exists());
        FileDeleteStrategy.NORMAL.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2412,subDir,2411,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeleteNormal_add1267() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeleteNormal_add1267");
        File baseDir = FileBasedTestCase.getTestDirectory();
        File subDir = new File(baseDir , "test");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2396,subDir,2395,subDir.mkdir());
        File subFile = new File(subDir , "a.txt");
        createFile(subFile, 16);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2398,subDir,2397,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2400,subFile,2399,subFile.exists());
        try {
            FileDeleteStrategy.NORMAL.delete(subDir);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2402,subDir,2401,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2404,subFile,2403,subFile.exists());
        FileDeleteStrategy.NORMAL.delete(subFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2406,subDir,2405,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2408,subFile,2407,subFile.exists());
        FileDeleteStrategy.NORMAL.delete(subDir);
        FileDeleteStrategy.NORMAL.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2410,subDir,2409,subDir.exists());
        FileDeleteStrategy.NORMAL.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2412,subDir,2411,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeleteNormal_add1268() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeleteNormal_add1268");
        File baseDir = FileBasedTestCase.getTestDirectory();
        File subDir = new File(baseDir , "test");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2396,subDir,2395,subDir.mkdir());
        File subFile = new File(subDir , "a.txt");
        createFile(subFile, 16);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2398,subDir,2397,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2400,subFile,2399,subFile.exists());
        try {
            FileDeleteStrategy.NORMAL.delete(subDir);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2402,subDir,2401,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2404,subFile,2403,subFile.exists());
        FileDeleteStrategy.NORMAL.delete(subFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2406,subDir,2405,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2408,subFile,2407,subFile.exists());
        FileDeleteStrategy.NORMAL.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2410,subDir,2409,subDir.exists());
        FileDeleteStrategy.NORMAL.delete(subDir);
        FileDeleteStrategy.NORMAL.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2412,subDir,2411,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeleteNormal() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeleteNormal");
        File baseDir = FileBasedTestCase.getTestDirectory();
        File subDir = new File(baseDir , "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2396,subDir,2395,subDir.mkdir());
        File subFile = new File(subDir , "a.txt");
        createFile(subFile, 16);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2398,subDir,2397,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2400,subFile,2399,subFile.exists());
        try {
            FileDeleteStrategy.NORMAL.delete(subDir);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2402,subDir,2401,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2404,subFile,2403,subFile.exists());
        FileDeleteStrategy.NORMAL.delete(subFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2406,subDir,2405,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2408,subFile,2407,subFile.exists());
        FileDeleteStrategy.NORMAL.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2410,subDir,2409,subDir.exists());
        FileDeleteStrategy.NORMAL.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2412,subDir,2411,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeleteNormal_literalMutation2789() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeleteNormal_literalMutation2789");
        File baseDir = FileBasedTestCase.getTestDirectory();
        File subDir = new File(baseDir , "test");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2396,subDir,2395,subDir.mkdir());
        File subFile = new File(subDir , "foo");
        createFile(subFile, 16);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2398,subDir,2397,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2400,subFile,2399,subFile.exists());
        try {
            FileDeleteStrategy.NORMAL.delete(subDir);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2402,subDir,2401,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2404,subFile,2403,subFile.exists());
        FileDeleteStrategy.NORMAL.delete(subFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2406,subDir,2405,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2408,subFile,2407,subFile.exists());
        FileDeleteStrategy.NORMAL.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2410,subDir,2409,subDir.exists());
        FileDeleteStrategy.NORMAL.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2412,subDir,2411,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeleteNormal_literalMutation2790() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeleteNormal_literalMutation2790");
        File baseDir = FileBasedTestCase.getTestDirectory();
        File subDir = new File(baseDir , "test");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2396,subDir,2395,subDir.mkdir());
        File subFile = new File(subDir , "a.txt");
        createFile(subFile, 15);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2398,subDir,2397,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2400,subFile,2399,subFile.exists());
        try {
            FileDeleteStrategy.NORMAL.delete(subDir);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2402,subDir,2401,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2404,subFile,2403,subFile.exists());
        FileDeleteStrategy.NORMAL.delete(subFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2406,subDir,2405,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2408,subFile,2407,subFile.exists());
        FileDeleteStrategy.NORMAL.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2410,subDir,2409,subDir.exists());
        FileDeleteStrategy.NORMAL.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2412,subDir,2411,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeleteNormal_remove986() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeleteNormal_remove986");
        File baseDir = FileBasedTestCase.getTestDirectory();
        File subDir = new File(baseDir , "test");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2396,subDir,2395,subDir.mkdir());
        File subFile = new File(subDir , "a.txt");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2398,subDir,2397,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2400,subFile,2399,subFile.exists());
        try {
            FileDeleteStrategy.NORMAL.delete(subDir);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2402,subDir,2401,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2404,subFile,2403,subFile.exists());
        FileDeleteStrategy.NORMAL.delete(subFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2406,subDir,2405,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2408,subFile,2407,subFile.exists());
        FileDeleteStrategy.NORMAL.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2410,subDir,2409,subDir.exists());
        FileDeleteStrategy.NORMAL.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2412,subDir,2411,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeleteNormal_remove987() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeleteNormal_remove987");
        File baseDir = FileBasedTestCase.getTestDirectory();
        File subDir = new File(baseDir , "test");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2396,subDir,2395,subDir.mkdir());
        File subFile = new File(subDir , "a.txt");
        createFile(subFile, 16);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2398,subDir,2397,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2400,subFile,2399,subFile.exists());
        try {
            FileDeleteStrategy.NORMAL.delete(subDir);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2402,subDir,2401,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2404,subFile,2403,subFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2406,subDir,2405,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2408,subFile,2407,subFile.exists());
        FileDeleteStrategy.NORMAL.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2410,subDir,2409,subDir.exists());
        FileDeleteStrategy.NORMAL.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2412,subDir,2411,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeleteNormal_remove988() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeleteNormal_remove988");
        File baseDir = FileBasedTestCase.getTestDirectory();
        File subDir = new File(baseDir , "test");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2396,subDir,2395,subDir.mkdir());
        File subFile = new File(subDir , "a.txt");
        createFile(subFile, 16);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2398,subDir,2397,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2400,subFile,2399,subFile.exists());
        try {
            FileDeleteStrategy.NORMAL.delete(subDir);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2402,subDir,2401,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2404,subFile,2403,subFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2406,subDir,2405,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2408,subFile,2407,subFile.exists());
        FileDeleteStrategy.NORMAL.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2410,subDir,2409,subDir.exists());
        FileDeleteStrategy.NORMAL.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2412,subDir,2411,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeleteNormal_remove989() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeleteNormal_remove989");
        File baseDir = FileBasedTestCase.getTestDirectory();
        File subDir = new File(baseDir , "test");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2396,subDir,2395,subDir.mkdir());
        File subFile = new File(subDir , "a.txt");
        createFile(subFile, 16);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2398,subDir,2397,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2400,subFile,2399,subFile.exists());
        try {
            FileDeleteStrategy.NORMAL.delete(subDir);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2402,subDir,2401,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2404,subFile,2403,subFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2406,subDir,2405,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2408,subFile,2407,subFile.exists());
        FileDeleteStrategy.NORMAL.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2410,subDir,2409,subDir.exists());
        FileDeleteStrategy.NORMAL.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2412,subDir,2411,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeleteQuietlyNormal_add1270() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeleteQuietlyNormal_add1270");
        File baseDir = FileBasedTestCase.getTestDirectory();
        File subDir = new File(baseDir , "test");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2416,subDir,2415,subDir.mkdir());
        File subFile = new File(subDir , "a.txt");
        createFile(subFile, 16);
        createFile(subFile, 16);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2418,subDir,2417,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2420,subFile,2419,subFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2422,org.apache.commons.io.FileDeleteStrategy.NORMAL,2421,org.apache.commons.io.FileDeleteStrategy.NORMAL.deleteQuietly(subDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2424,subDir,2423,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2426,subFile,2425,subFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2428,org.apache.commons.io.FileDeleteStrategy.NORMAL,2427,org.apache.commons.io.FileDeleteStrategy.NORMAL.deleteQuietly(subFile));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2430,subDir,2429,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2432,subFile,2431,subFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2434,org.apache.commons.io.FileDeleteStrategy.NORMAL,2433,org.apache.commons.io.FileDeleteStrategy.NORMAL.deleteQuietly(subDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2436,subDir,2435,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2438,org.apache.commons.io.FileDeleteStrategy.NORMAL,2437,org.apache.commons.io.FileDeleteStrategy.NORMAL.deleteQuietly(subDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2440,subDir,2439,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeleteQuietlyNormal() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeleteQuietlyNormal");
        File baseDir = FileBasedTestCase.getTestDirectory();
        File subDir = new File(baseDir , "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2416,subDir,2415,subDir.mkdir());
        File subFile = new File(subDir , "a.txt");
        createFile(subFile, 16);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2418,subDir,2417,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2420,subFile,2419,subFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2422,org.apache.commons.io.FileDeleteStrategy.NORMAL,2421,org.apache.commons.io.FileDeleteStrategy.NORMAL.deleteQuietly(subDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2424,subDir,2423,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2426,subFile,2425,subFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2428,org.apache.commons.io.FileDeleteStrategy.NORMAL,2427,org.apache.commons.io.FileDeleteStrategy.NORMAL.deleteQuietly(subFile));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2430,subDir,2429,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2432,subFile,2431,subFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2434,org.apache.commons.io.FileDeleteStrategy.NORMAL,2433,org.apache.commons.io.FileDeleteStrategy.NORMAL.deleteQuietly(subDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2436,subDir,2435,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2438,org.apache.commons.io.FileDeleteStrategy.NORMAL,2437,org.apache.commons.io.FileDeleteStrategy.NORMAL.deleteQuietly(subDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2440,subDir,2439,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeleteQuietlyNormal_literalMutation2793() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeleteQuietlyNormal_literalMutation2793");
        File baseDir = FileBasedTestCase.getTestDirectory();
        File subDir = new File(baseDir , "test");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2416,subDir,2415,subDir.mkdir());
        File subFile = new File(subDir , "foo");
        createFile(subFile, 16);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2418,subDir,2417,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2420,subFile,2419,subFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2422,org.apache.commons.io.FileDeleteStrategy.NORMAL,2421,org.apache.commons.io.FileDeleteStrategy.NORMAL.deleteQuietly(subDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2424,subDir,2423,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2426,subFile,2425,subFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2428,org.apache.commons.io.FileDeleteStrategy.NORMAL,2427,org.apache.commons.io.FileDeleteStrategy.NORMAL.deleteQuietly(subFile));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2430,subDir,2429,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2432,subFile,2431,subFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2434,org.apache.commons.io.FileDeleteStrategy.NORMAL,2433,org.apache.commons.io.FileDeleteStrategy.NORMAL.deleteQuietly(subDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2436,subDir,2435,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2438,org.apache.commons.io.FileDeleteStrategy.NORMAL,2437,org.apache.commons.io.FileDeleteStrategy.NORMAL.deleteQuietly(subDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2440,subDir,2439,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeleteQuietlyNormal_literalMutation2794() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeleteQuietlyNormal_literalMutation2794");
        File baseDir = FileBasedTestCase.getTestDirectory();
        File subDir = new File(baseDir , "test");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2416,subDir,2415,subDir.mkdir());
        File subFile = new File(subDir , "a.txt");
        createFile(subFile, 17);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2418,subDir,2417,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2420,subFile,2419,subFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2422,org.apache.commons.io.FileDeleteStrategy.NORMAL,2421,org.apache.commons.io.FileDeleteStrategy.NORMAL.deleteQuietly(subDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2424,subDir,2423,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2426,subFile,2425,subFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2428,org.apache.commons.io.FileDeleteStrategy.NORMAL,2427,org.apache.commons.io.FileDeleteStrategy.NORMAL.deleteQuietly(subFile));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2430,subDir,2429,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2432,subFile,2431,subFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2434,org.apache.commons.io.FileDeleteStrategy.NORMAL,2433,org.apache.commons.io.FileDeleteStrategy.NORMAL.deleteQuietly(subDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2436,subDir,2435,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2438,org.apache.commons.io.FileDeleteStrategy.NORMAL,2437,org.apache.commons.io.FileDeleteStrategy.NORMAL.deleteQuietly(subDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2440,subDir,2439,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeleteQuietlyNormal_remove990() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeleteQuietlyNormal_remove990");
        File baseDir = FileBasedTestCase.getTestDirectory();
        File subDir = new File(baseDir , "test");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2416,subDir,2415,subDir.mkdir());
        File subFile = new File(subDir , "a.txt");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2418,subDir,2417,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2420,subFile,2419,subFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2422,org.apache.commons.io.FileDeleteStrategy.NORMAL,2421,org.apache.commons.io.FileDeleteStrategy.NORMAL.deleteQuietly(subDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2424,subDir,2423,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2426,subFile,2425,subFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2428,org.apache.commons.io.FileDeleteStrategy.NORMAL,2427,org.apache.commons.io.FileDeleteStrategy.NORMAL.deleteQuietly(subFile));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2430,subDir,2429,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2432,subFile,2431,subFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2434,org.apache.commons.io.FileDeleteStrategy.NORMAL,2433,org.apache.commons.io.FileDeleteStrategy.NORMAL.deleteQuietly(subDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2436,subDir,2435,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2438,org.apache.commons.io.FileDeleteStrategy.NORMAL,2437,org.apache.commons.io.FileDeleteStrategy.NORMAL.deleteQuietly(subDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2440,subDir,2439,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeleteForce_add1261() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeleteForce_add1261");
        File baseDir = FileBasedTestCase.getTestDirectory();
        File subDir = new File(baseDir , "test");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2384,subDir,2383,subDir.mkdir());
        File subFile = new File(subDir , "a.txt");
        createFile(subFile, 16);
        createFile(subFile, 16);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2386,subDir,2385,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2388,subFile,2387,subFile.exists());
        FileDeleteStrategy.FORCE.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2390,subDir,2389,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2392,subFile,2391,subFile.exists());
        FileDeleteStrategy.FORCE.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2394,subDir,2393,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeleteForce_add1262() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeleteForce_add1262");
        File baseDir = FileBasedTestCase.getTestDirectory();
        File subDir = new File(baseDir , "test");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2384,subDir,2383,subDir.mkdir());
        File subFile = new File(subDir , "a.txt");
        createFile(subFile, 16);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2386,subDir,2385,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2388,subFile,2387,subFile.exists());
        FileDeleteStrategy.FORCE.delete(subDir);
        FileDeleteStrategy.FORCE.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2390,subDir,2389,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2392,subFile,2391,subFile.exists());
        FileDeleteStrategy.FORCE.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2394,subDir,2393,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeleteForce_add1263() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeleteForce_add1263");
        File baseDir = FileBasedTestCase.getTestDirectory();
        File subDir = new File(baseDir , "test");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2384,subDir,2383,subDir.mkdir());
        File subFile = new File(subDir , "a.txt");
        createFile(subFile, 16);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2386,subDir,2385,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2388,subFile,2387,subFile.exists());
        FileDeleteStrategy.FORCE.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2390,subDir,2389,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2392,subFile,2391,subFile.exists());
        FileDeleteStrategy.FORCE.delete(subDir);
        FileDeleteStrategy.FORCE.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2394,subDir,2393,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeleteForce() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeleteForce");
        File baseDir = FileBasedTestCase.getTestDirectory();
        File subDir = new File(baseDir , "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2384,subDir,2383,subDir.mkdir());
        File subFile = new File(subDir , "a.txt");
        createFile(subFile, 16);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2386,subDir,2385,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2388,subFile,2387,subFile.exists());
        FileDeleteStrategy.FORCE.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2390,subDir,2389,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2392,subFile,2391,subFile.exists());
        FileDeleteStrategy.FORCE.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2394,subDir,2393,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeleteForce_literalMutation2786() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeleteForce_literalMutation2786");
        File baseDir = FileBasedTestCase.getTestDirectory();
        File subDir = new File(baseDir , "test");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2384,subDir,2383,subDir.mkdir());
        File subFile = new File(subDir , "foo");
        createFile(subFile, 16);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2386,subDir,2385,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2388,subFile,2387,subFile.exists());
        FileDeleteStrategy.FORCE.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2390,subDir,2389,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2392,subFile,2391,subFile.exists());
        FileDeleteStrategy.FORCE.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2394,subDir,2393,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeleteForce_literalMutation2787() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeleteForce_literalMutation2787");
        File baseDir = FileBasedTestCase.getTestDirectory();
        File subDir = new File(baseDir , "test");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2384,subDir,2383,subDir.mkdir());
        File subFile = new File(subDir , "a.txt");
        createFile(subFile, 15);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2386,subDir,2385,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2388,subFile,2387,subFile.exists());
        FileDeleteStrategy.FORCE.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2390,subDir,2389,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2392,subFile,2391,subFile.exists());
        FileDeleteStrategy.FORCE.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2394,subDir,2393,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeleteForce_remove983() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeleteForce_remove983");
        File baseDir = FileBasedTestCase.getTestDirectory();
        File subDir = new File(baseDir , "test");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2384,subDir,2383,subDir.mkdir());
        File subFile = new File(subDir , "a.txt");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2386,subDir,2385,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2388,subFile,2387,subFile.exists());
        FileDeleteStrategy.FORCE.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2390,subDir,2389,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2392,subFile,2391,subFile.exists());
        FileDeleteStrategy.FORCE.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2394,subDir,2393,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeleteForce_remove984() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeleteForce_remove984");
        File baseDir = FileBasedTestCase.getTestDirectory();
        File subDir = new File(baseDir , "test");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2384,subDir,2383,subDir.mkdir());
        File subFile = new File(subDir , "a.txt");
        createFile(subFile, 16);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2386,subDir,2385,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2388,subFile,2387,subFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2390,subDir,2389,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2392,subFile,2391,subFile.exists());
        FileDeleteStrategy.FORCE.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2394,subDir,2393,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeleteForce_remove985() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeleteForce_remove985");
        File baseDir = FileBasedTestCase.getTestDirectory();
        File subDir = new File(baseDir , "test");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2384,subDir,2383,subDir.mkdir());
        File subFile = new File(subDir , "a.txt");
        createFile(subFile, 16);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2386,subDir,2385,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2388,subFile,2387,subFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2390,subDir,2389,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2392,subFile,2391,subFile.exists());
        FileDeleteStrategy.FORCE.delete(subDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2394,subDir,2393,subDir.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeleteNull() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeleteNull");
        try {
            FileDeleteStrategy.NORMAL.delete(((File)(null)));
            FileDeleteStrategy.NORMAL.delete(((File)(null)));
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2414,org.apache.commons.io.FileDeleteStrategy.NORMAL,2413,org.apache.commons.io.FileDeleteStrategy.NORMAL.deleteQuietly(((java.io.File)(null))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToString() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToString");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2442,org.apache.commons.io.FileDeleteStrategy.NORMAL,2441,org.apache.commons.io.FileDeleteStrategy.NORMAL.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2444,org.apache.commons.io.FileDeleteStrategy.FORCE,2443,org.apache.commons.io.FileDeleteStrategy.FORCE.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


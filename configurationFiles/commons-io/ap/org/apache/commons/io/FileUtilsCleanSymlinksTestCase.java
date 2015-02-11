package org.apache.commons.io;

import java.util.ArrayList;
import java.io.File;
import org.apache.commons.io.testtools.FileBasedTestCase;
import java.util.List;
import org.junit.Test;

/** 
 * Test cases for FileUtils.cleanDirectory() method that involve symlinks.
 * & FileUtils.isSymlink(File file)
 */
public class FileUtilsCleanSymlinksTestCase extends FileBasedTestCase {
    final File top = FileBasedTestCase.getTestDirectory();

    public FileUtilsCleanSymlinksTestCase(String name) {
        super(name);
    }

    @Override
    protected void setUp() throws Exception {
        top.mkdirs();
    }

    @Override
    protected void tearDown() throws Exception {
        org.apache.commons.io.FileUtils.deleteDirectory(top);
    }

    @Test(timeout = 1000)
    public void testCleanDirWithSymlinkFile_add1326() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithSymlinkFile_add1326");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realOuter = new File(top , "realouter");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2523,realOuter,2522,realOuter.mkdirs());
        final File realInner = new File(realOuter , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2525,realInner,2524,realInner.mkdirs());
        final File realFile = new File(realInner , "file1");
        org.apache.commons.io.FileUtils.touch(realFile);
        org.apache.commons.io.FileUtils.touch(realFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2526,realInner.list().length);
        final File randomFile = new File(top , "randomfile");
        org.apache.commons.io.FileUtils.touch(randomFile);
        final File symlinkFile = new File(realInner , "fakeinner");
        setupSymlink(randomFile, symlinkFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2527,realInner.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(realOuter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2528,realOuter.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2530,randomFile,2529,randomFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2532,symlinkFile,2531,symlinkFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCleanDirWithSymlinkFile_add1327() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithSymlinkFile_add1327");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realOuter = new File(top , "realouter");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2523,realOuter,2522,realOuter.mkdirs());
        final File realInner = new File(realOuter , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2525,realInner,2524,realInner.mkdirs());
        final File realFile = new File(realInner , "file1");
        org.apache.commons.io.FileUtils.touch(realFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2526,realInner.list().length);
        final File randomFile = new File(top , "randomfile");
        org.apache.commons.io.FileUtils.touch(randomFile);
        org.apache.commons.io.FileUtils.touch(randomFile);
        final File symlinkFile = new File(realInner , "fakeinner");
        setupSymlink(randomFile, symlinkFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2527,realInner.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(realOuter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2528,realOuter.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2530,randomFile,2529,randomFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2532,symlinkFile,2531,symlinkFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCleanDirWithSymlinkFile_add1328() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithSymlinkFile_add1328");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realOuter = new File(top , "realouter");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2523,realOuter,2522,realOuter.mkdirs());
        final File realInner = new File(realOuter , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2525,realInner,2524,realInner.mkdirs());
        final File realFile = new File(realInner , "file1");
        org.apache.commons.io.FileUtils.touch(realFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2526,realInner.list().length);
        final File randomFile = new File(top , "randomfile");
        org.apache.commons.io.FileUtils.touch(randomFile);
        final File symlinkFile = new File(realInner , "fakeinner");
        setupSymlink(randomFile, symlinkFile);
        setupSymlink(randomFile, symlinkFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2527,realInner.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(realOuter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2528,realOuter.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2530,randomFile,2529,randomFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2532,symlinkFile,2531,symlinkFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCleanDirWithSymlinkFile_add1329() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithSymlinkFile_add1329");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realOuter = new File(top , "realouter");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2523,realOuter,2522,realOuter.mkdirs());
        final File realInner = new File(realOuter , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2525,realInner,2524,realInner.mkdirs());
        final File realFile = new File(realInner , "file1");
        org.apache.commons.io.FileUtils.touch(realFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2526,realInner.list().length);
        final File randomFile = new File(top , "randomfile");
        org.apache.commons.io.FileUtils.touch(randomFile);
        final File symlinkFile = new File(realInner , "fakeinner");
        setupSymlink(randomFile, symlinkFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2527,realInner.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(realOuter);
        org.apache.commons.io.FileUtils.cleanDirectory(realOuter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2528,realOuter.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2530,randomFile,2529,randomFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2532,symlinkFile,2531,symlinkFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCleanDirWithSymlinkFile() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithSymlinkFile");
        if (java.lang.System.getProperty("foo").startsWith("Win")) {
            return ;
        } 
        final File realOuter = new File(top , "realouter");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2523,realOuter,2522,realOuter.mkdirs());
        final File realInner = new File(realOuter , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2525,realInner,2524,realInner.mkdirs());
        final File realFile = new File(realInner , "file1");
        org.apache.commons.io.FileUtils.touch(realFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2526,realInner.list().length);
        final File randomFile = new File(top , "randomfile");
        org.apache.commons.io.FileUtils.touch(randomFile);
        final File symlinkFile = new File(realInner , "fakeinner");
        setupSymlink(randomFile, symlinkFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2527,realInner.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(realOuter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2528,realOuter.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2530,randomFile,2529,randomFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2532,symlinkFile,2531,symlinkFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCleanDirWithSymlinkFile_literalMutation3105() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithSymlinkFile_literalMutation3105");
        if (java.lang.System.getProperty("os.name").startsWith("foo")) {
            return ;
        } 
        final File realOuter = new File(top , "realouter");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2523,realOuter,2522,realOuter.mkdirs());
        final File realInner = new File(realOuter , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2525,realInner,2524,realInner.mkdirs());
        final File realFile = new File(realInner , "file1");
        org.apache.commons.io.FileUtils.touch(realFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2526,realInner.list().length);
        final File randomFile = new File(top , "randomfile");
        org.apache.commons.io.FileUtils.touch(randomFile);
        final File symlinkFile = new File(realInner , "fakeinner");
        setupSymlink(randomFile, symlinkFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2527,realInner.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(realOuter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2528,realOuter.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2530,randomFile,2529,randomFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2532,symlinkFile,2531,symlinkFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCleanDirWithSymlinkFile_literalMutation3106() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithSymlinkFile_literalMutation3106");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realOuter = new File(top , "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2523,realOuter,2522,realOuter.mkdirs());
        final File realInner = new File(realOuter , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2525,realInner,2524,realInner.mkdirs());
        final File realFile = new File(realInner , "file1");
        org.apache.commons.io.FileUtils.touch(realFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2526,realInner.list().length);
        final File randomFile = new File(top , "randomfile");
        org.apache.commons.io.FileUtils.touch(randomFile);
        final File symlinkFile = new File(realInner , "fakeinner");
        setupSymlink(randomFile, symlinkFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2527,realInner.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(realOuter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2528,realOuter.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2530,randomFile,2529,randomFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2532,symlinkFile,2531,symlinkFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCleanDirWithSymlinkFile_literalMutation3107() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithSymlinkFile_literalMutation3107");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realOuter = new File(top , "realouter");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2523,realOuter,2522,realOuter.mkdirs());
        final File realInner = new File(realOuter , "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2525,realInner,2524,realInner.mkdirs());
        final File realFile = new File(realInner , "file1");
        org.apache.commons.io.FileUtils.touch(realFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2526,realInner.list().length);
        final File randomFile = new File(top , "randomfile");
        org.apache.commons.io.FileUtils.touch(randomFile);
        final File symlinkFile = new File(realInner , "fakeinner");
        setupSymlink(randomFile, symlinkFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2527,realInner.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(realOuter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2528,realOuter.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2530,randomFile,2529,randomFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2532,symlinkFile,2531,symlinkFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCleanDirWithSymlinkFile_literalMutation3108() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithSymlinkFile_literalMutation3108");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realOuter = new File(top , "realouter");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2523,realOuter,2522,realOuter.mkdirs());
        final File realInner = new File(realOuter , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2525,realInner,2524,realInner.mkdirs());
        final File realFile = new File(realInner , "foo");
        org.apache.commons.io.FileUtils.touch(realFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2526,realInner.list().length);
        final File randomFile = new File(top , "randomfile");
        org.apache.commons.io.FileUtils.touch(randomFile);
        final File symlinkFile = new File(realInner , "fakeinner");
        setupSymlink(randomFile, symlinkFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2527,realInner.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(realOuter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2528,realOuter.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2530,randomFile,2529,randomFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2532,symlinkFile,2531,symlinkFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCleanDirWithSymlinkFile_literalMutation3109() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithSymlinkFile_literalMutation3109");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realOuter = new File(top , "realouter");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2523,realOuter,2522,realOuter.mkdirs());
        final File realInner = new File(realOuter , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2525,realInner,2524,realInner.mkdirs());
        final File realFile = new File(realInner , "file1");
        org.apache.commons.io.FileUtils.touch(realFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2526,realInner.list().length);
        final File randomFile = new File(top , "foo");
        org.apache.commons.io.FileUtils.touch(randomFile);
        final File symlinkFile = new File(realInner , "fakeinner");
        setupSymlink(randomFile, symlinkFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2527,realInner.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(realOuter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2528,realOuter.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2530,randomFile,2529,randomFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2532,symlinkFile,2531,symlinkFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCleanDirWithSymlinkFile_literalMutation3110() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithSymlinkFile_literalMutation3110");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realOuter = new File(top , "realouter");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2523,realOuter,2522,realOuter.mkdirs());
        final File realInner = new File(realOuter , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2525,realInner,2524,realInner.mkdirs());
        final File realFile = new File(realInner , "file1");
        org.apache.commons.io.FileUtils.touch(realFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2526,realInner.list().length);
        final File randomFile = new File(top , "randomfile");
        org.apache.commons.io.FileUtils.touch(randomFile);
        final File symlinkFile = new File(realInner , "foo");
        setupSymlink(randomFile, symlinkFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2527,realInner.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(realOuter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2528,realOuter.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2530,randomFile,2529,randomFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2532,symlinkFile,2531,symlinkFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCleanDirWithSymlinkFile_remove1009() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithSymlinkFile_remove1009");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realOuter = new File(top , "realouter");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2523,realOuter,2522,realOuter.mkdirs());
        final File realInner = new File(realOuter , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2525,realInner,2524,realInner.mkdirs());
        final File realFile = new File(realInner , "file1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2526,realInner.list().length);
        final File randomFile = new File(top , "randomfile");
        org.apache.commons.io.FileUtils.touch(randomFile);
        final File symlinkFile = new File(realInner , "fakeinner");
        setupSymlink(randomFile, symlinkFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2527,realInner.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(realOuter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2528,realOuter.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2530,randomFile,2529,randomFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2532,symlinkFile,2531,symlinkFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCleanDirWithSymlinkFile_remove1010() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithSymlinkFile_remove1010");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realOuter = new File(top , "realouter");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2523,realOuter,2522,realOuter.mkdirs());
        final File realInner = new File(realOuter , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2525,realInner,2524,realInner.mkdirs());
        final File realFile = new File(realInner , "file1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2526,realInner.list().length);
        final File randomFile = new File(top , "randomfile");
        org.apache.commons.io.FileUtils.touch(randomFile);
        final File symlinkFile = new File(realInner , "fakeinner");
        setupSymlink(randomFile, symlinkFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2527,realInner.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(realOuter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2528,realOuter.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2530,randomFile,2529,randomFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2532,symlinkFile,2531,symlinkFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCleanDirWithSymlinkFile_remove1011() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithSymlinkFile_remove1011");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realOuter = new File(top , "realouter");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2523,realOuter,2522,realOuter.mkdirs());
        final File realInner = new File(realOuter , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2525,realInner,2524,realInner.mkdirs());
        final File realFile = new File(realInner , "file1");
        org.apache.commons.io.FileUtils.touch(realFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2526,realInner.list().length);
        final File randomFile = new File(top , "randomfile");
        org.apache.commons.io.FileUtils.touch(randomFile);
        final File symlinkFile = new File(realInner , "fakeinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2527,realInner.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(realOuter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2528,realOuter.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2530,randomFile,2529,randomFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2532,symlinkFile,2531,symlinkFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCleanDirWithSymlinkFile_remove1012() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithSymlinkFile_remove1012");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realOuter = new File(top , "realouter");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2523,realOuter,2522,realOuter.mkdirs());
        final File realInner = new File(realOuter , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2525,realInner,2524,realInner.mkdirs());
        final File realFile = new File(realInner , "file1");
        org.apache.commons.io.FileUtils.touch(realFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2526,realInner.list().length);
        final File randomFile = new File(top , "randomfile");
        org.apache.commons.io.FileUtils.touch(randomFile);
        final File symlinkFile = new File(realInner , "fakeinner");
        setupSymlink(randomFile, symlinkFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2527,realInner.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2528,realOuter.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2530,randomFile,2529,randomFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2532,symlinkFile,2531,symlinkFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCleanDirWithASymlinkDir_add1317() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithASymlinkDir_add1317");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realOuter = new File(top , "realouter");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2500,realOuter,2499,realOuter.mkdirs());
        final File realInner = new File(realOuter , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2502,realInner,2501,realInner.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(realInner , "file1"));
        org.apache.commons.io.FileUtils.touch(new File(realInner , "file1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2503,realInner.list().length);
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2505,randomDirectory,2504,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2506,randomDirectory.list().length);
        final File symlinkDirectory = new File(realOuter , "fakeinner");
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2507,symlinkDirectory.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(realOuter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2508,realOuter.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2509,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCleanDirWithASymlinkDir_add1318() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithASymlinkDir_add1318");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realOuter = new File(top , "realouter");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2500,realOuter,2499,realOuter.mkdirs());
        final File realInner = new File(realOuter , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2502,realInner,2501,realInner.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(realInner , "file1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2503,realInner.list().length);
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2505,randomDirectory,2504,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2506,randomDirectory.list().length);
        final File symlinkDirectory = new File(realOuter , "fakeinner");
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2507,symlinkDirectory.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(realOuter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2508,realOuter.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2509,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCleanDirWithASymlinkDir_add1319() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithASymlinkDir_add1319");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realOuter = new File(top , "realouter");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2500,realOuter,2499,realOuter.mkdirs());
        final File realInner = new File(realOuter , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2502,realInner,2501,realInner.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(realInner , "file1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2503,realInner.list().length);
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2505,randomDirectory,2504,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2506,randomDirectory.list().length);
        final File symlinkDirectory = new File(realOuter , "fakeinner");
        setupSymlink(randomDirectory, symlinkDirectory);
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2507,symlinkDirectory.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(realOuter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2508,realOuter.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2509,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCleanDirWithASymlinkDir_add1320() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithASymlinkDir_add1320");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realOuter = new File(top , "realouter");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2500,realOuter,2499,realOuter.mkdirs());
        final File realInner = new File(realOuter , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2502,realInner,2501,realInner.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(realInner , "file1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2503,realInner.list().length);
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2505,randomDirectory,2504,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2506,randomDirectory.list().length);
        final File symlinkDirectory = new File(realOuter , "fakeinner");
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2507,symlinkDirectory.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(realOuter);
        org.apache.commons.io.FileUtils.cleanDirectory(realOuter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2508,realOuter.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2509,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCleanDirWithASymlinkDir() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithASymlinkDir");
        if (java.lang.System.getProperty("foo").startsWith("Win")) {
            return ;
        } 
        final File realOuter = new File(top , "realouter");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2500,realOuter,2499,realOuter.mkdirs());
        final File realInner = new File(realOuter , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2502,realInner,2501,realInner.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(realInner , "file1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2503,realInner.list().length);
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2505,randomDirectory,2504,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2506,randomDirectory.list().length);
        final File symlinkDirectory = new File(realOuter , "fakeinner");
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2507,symlinkDirectory.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(realOuter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2508,realOuter.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2509,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCleanDirWithASymlinkDir_literalMutation3088() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithASymlinkDir_literalMutation3088");
        if (java.lang.System.getProperty("os.name").startsWith("foo")) {
            return ;
        } 
        final File realOuter = new File(top , "realouter");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2500,realOuter,2499,realOuter.mkdirs());
        final File realInner = new File(realOuter , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2502,realInner,2501,realInner.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(realInner , "file1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2503,realInner.list().length);
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2505,randomDirectory,2504,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2506,randomDirectory.list().length);
        final File symlinkDirectory = new File(realOuter , "fakeinner");
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2507,symlinkDirectory.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(realOuter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2508,realOuter.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2509,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCleanDirWithASymlinkDir_literalMutation3089() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithASymlinkDir_literalMutation3089");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realOuter = new File(top , "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2500,realOuter,2499,realOuter.mkdirs());
        final File realInner = new File(realOuter , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2502,realInner,2501,realInner.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(realInner , "file1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2503,realInner.list().length);
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2505,randomDirectory,2504,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2506,randomDirectory.list().length);
        final File symlinkDirectory = new File(realOuter , "fakeinner");
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2507,symlinkDirectory.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(realOuter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2508,realOuter.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2509,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCleanDirWithASymlinkDir_literalMutation3090() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithASymlinkDir_literalMutation3090");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realOuter = new File(top , "realouter");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2500,realOuter,2499,realOuter.mkdirs());
        final File realInner = new File(realOuter , "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2502,realInner,2501,realInner.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(realInner , "file1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2503,realInner.list().length);
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2505,randomDirectory,2504,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2506,randomDirectory.list().length);
        final File symlinkDirectory = new File(realOuter , "fakeinner");
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2507,symlinkDirectory.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(realOuter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2508,realOuter.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2509,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCleanDirWithASymlinkDir_literalMutation3091() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithASymlinkDir_literalMutation3091");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realOuter = new File(top , "realouter");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2500,realOuter,2499,realOuter.mkdirs());
        final File realInner = new File(realOuter , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2502,realInner,2501,realInner.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(realInner , "foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2503,realInner.list().length);
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2505,randomDirectory,2504,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2506,randomDirectory.list().length);
        final File symlinkDirectory = new File(realOuter , "fakeinner");
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2507,symlinkDirectory.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(realOuter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2508,realOuter.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2509,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCleanDirWithASymlinkDir_literalMutation3092() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithASymlinkDir_literalMutation3092");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realOuter = new File(top , "realouter");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2500,realOuter,2499,realOuter.mkdirs());
        final File realInner = new File(realOuter , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2502,realInner,2501,realInner.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(realInner , "file1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2503,realInner.list().length);
        final File randomDirectory = new File(top , "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2505,randomDirectory,2504,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2506,randomDirectory.list().length);
        final File symlinkDirectory = new File(realOuter , "fakeinner");
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2507,symlinkDirectory.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(realOuter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2508,realOuter.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2509,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCleanDirWithASymlinkDir_literalMutation3093() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithASymlinkDir_literalMutation3093");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realOuter = new File(top , "realouter");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2500,realOuter,2499,realOuter.mkdirs());
        final File realInner = new File(realOuter , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2502,realInner,2501,realInner.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(realInner , "file1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2503,realInner.list().length);
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2505,randomDirectory,2504,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2506,randomDirectory.list().length);
        final File symlinkDirectory = new File(realOuter , "fakeinner");
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2507,symlinkDirectory.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(realOuter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2508,realOuter.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2509,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCleanDirWithASymlinkDir_literalMutation3094() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithASymlinkDir_literalMutation3094");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realOuter = new File(top , "realouter");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2500,realOuter,2499,realOuter.mkdirs());
        final File realInner = new File(realOuter , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2502,realInner,2501,realInner.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(realInner , "file1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2503,realInner.list().length);
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2505,randomDirectory,2504,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2506,randomDirectory.list().length);
        final File symlinkDirectory = new File(realOuter , "foo");
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2507,symlinkDirectory.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(realOuter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2508,realOuter.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2509,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCleanDirWithASymlinkDir_remove1000() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithASymlinkDir_remove1000");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realOuter = new File(top , "realouter");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2500,realOuter,2499,realOuter.mkdirs());
        final File realInner = new File(realOuter , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2502,realInner,2501,realInner.mkdirs());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2503,realInner.list().length);
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2505,randomDirectory,2504,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2506,randomDirectory.list().length);
        final File symlinkDirectory = new File(realOuter , "fakeinner");
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2507,symlinkDirectory.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(realOuter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2508,realOuter.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2509,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCleanDirWithASymlinkDir_remove1001() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithASymlinkDir_remove1001");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realOuter = new File(top , "realouter");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2500,realOuter,2499,realOuter.mkdirs());
        final File realInner = new File(realOuter , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2502,realInner,2501,realInner.mkdirs());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2503,realInner.list().length);
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2505,randomDirectory,2504,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2506,randomDirectory.list().length);
        final File symlinkDirectory = new File(realOuter , "fakeinner");
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2507,symlinkDirectory.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(realOuter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2508,realOuter.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2509,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCleanDirWithASymlinkDir_remove1002() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithASymlinkDir_remove1002");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realOuter = new File(top , "realouter");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2500,realOuter,2499,realOuter.mkdirs());
        final File realInner = new File(realOuter , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2502,realInner,2501,realInner.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(realInner , "file1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2503,realInner.list().length);
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2505,randomDirectory,2504,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2506,randomDirectory.list().length);
        final File symlinkDirectory = new File(realOuter , "fakeinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2507,symlinkDirectory.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(realOuter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2508,realOuter.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2509,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCleanDirWithASymlinkDir_remove1003() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithASymlinkDir_remove1003");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realOuter = new File(top , "realouter");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2500,realOuter,2499,realOuter.mkdirs());
        final File realInner = new File(realOuter , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2502,realInner,2501,realInner.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(realInner , "file1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2503,realInner.list().length);
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2505,randomDirectory,2504,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2506,randomDirectory.list().length);
        final File symlinkDirectory = new File(realOuter , "fakeinner");
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2507,symlinkDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2508,realOuter.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2509,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCleanDirWithParentSymlinks_add1321() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithParentSymlinks_add1321");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realParent = new File(top , "realparent");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2511,realParent,2510,realParent.mkdirs());
        final File realInner = new File(realParent , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2513,realInner,2512,realInner.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(realInner , "file1"));
        org.apache.commons.io.FileUtils.touch(new File(realInner , "file1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2514,realInner.list().length);
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2516,randomDirectory,2515,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2517,randomDirectory.list().length);
        final File symlinkDirectory = new File(realParent , "fakeinner");
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2518,symlinkDirectory.list().length);
        final File symlinkParentDirectory = new File(top , "fakeouter");
        setupSymlink(realParent, symlinkParentDirectory);
        org.apache.commons.io.FileUtils.cleanDirectory(symlinkParentDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2519,symlinkParentDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2520,realParent.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2521,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCleanDirWithParentSymlinks_add1322() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithParentSymlinks_add1322");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realParent = new File(top , "realparent");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2511,realParent,2510,realParent.mkdirs());
        final File realInner = new File(realParent , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2513,realInner,2512,realInner.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(realInner , "file1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2514,realInner.list().length);
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2516,randomDirectory,2515,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2517,randomDirectory.list().length);
        final File symlinkDirectory = new File(realParent , "fakeinner");
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2518,symlinkDirectory.list().length);
        final File symlinkParentDirectory = new File(top , "fakeouter");
        setupSymlink(realParent, symlinkParentDirectory);
        org.apache.commons.io.FileUtils.cleanDirectory(symlinkParentDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2519,symlinkParentDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2520,realParent.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2521,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCleanDirWithParentSymlinks_add1323() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithParentSymlinks_add1323");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realParent = new File(top , "realparent");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2511,realParent,2510,realParent.mkdirs());
        final File realInner = new File(realParent , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2513,realInner,2512,realInner.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(realInner , "file1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2514,realInner.list().length);
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2516,randomDirectory,2515,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2517,randomDirectory.list().length);
        final File symlinkDirectory = new File(realParent , "fakeinner");
        setupSymlink(randomDirectory, symlinkDirectory);
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2518,symlinkDirectory.list().length);
        final File symlinkParentDirectory = new File(top , "fakeouter");
        setupSymlink(realParent, symlinkParentDirectory);
        org.apache.commons.io.FileUtils.cleanDirectory(symlinkParentDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2519,symlinkParentDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2520,realParent.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2521,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCleanDirWithParentSymlinks_add1324() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithParentSymlinks_add1324");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realParent = new File(top , "realparent");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2511,realParent,2510,realParent.mkdirs());
        final File realInner = new File(realParent , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2513,realInner,2512,realInner.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(realInner , "file1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2514,realInner.list().length);
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2516,randomDirectory,2515,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2517,randomDirectory.list().length);
        final File symlinkDirectory = new File(realParent , "fakeinner");
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2518,symlinkDirectory.list().length);
        final File symlinkParentDirectory = new File(top , "fakeouter");
        setupSymlink(realParent, symlinkParentDirectory);
        setupSymlink(realParent, symlinkParentDirectory);
        org.apache.commons.io.FileUtils.cleanDirectory(symlinkParentDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2519,symlinkParentDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2520,realParent.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2521,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCleanDirWithParentSymlinks_add1325() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithParentSymlinks_add1325");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realParent = new File(top , "realparent");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2511,realParent,2510,realParent.mkdirs());
        final File realInner = new File(realParent , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2513,realInner,2512,realInner.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(realInner , "file1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2514,realInner.list().length);
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2516,randomDirectory,2515,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2517,randomDirectory.list().length);
        final File symlinkDirectory = new File(realParent , "fakeinner");
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2518,symlinkDirectory.list().length);
        final File symlinkParentDirectory = new File(top , "fakeouter");
        setupSymlink(realParent, symlinkParentDirectory);
        org.apache.commons.io.FileUtils.cleanDirectory(symlinkParentDirectory);
        org.apache.commons.io.FileUtils.cleanDirectory(symlinkParentDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2519,symlinkParentDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2520,realParent.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2521,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCleanDirWithParentSymlinks() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithParentSymlinks");
        if (java.lang.System.getProperty("foo").startsWith("Win")) {
            return ;
        } 
        final File realParent = new File(top , "realparent");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2511,realParent,2510,realParent.mkdirs());
        final File realInner = new File(realParent , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2513,realInner,2512,realInner.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(realInner , "file1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2514,realInner.list().length);
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2516,randomDirectory,2515,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2517,randomDirectory.list().length);
        final File symlinkDirectory = new File(realParent , "fakeinner");
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2518,symlinkDirectory.list().length);
        final File symlinkParentDirectory = new File(top , "fakeouter");
        setupSymlink(realParent, symlinkParentDirectory);
        org.apache.commons.io.FileUtils.cleanDirectory(symlinkParentDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2519,symlinkParentDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2520,realParent.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2521,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCleanDirWithParentSymlinks_literalMutation3096() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithParentSymlinks_literalMutation3096");
        if (java.lang.System.getProperty("os.name").startsWith("foo")) {
            return ;
        } 
        final File realParent = new File(top , "realparent");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2511,realParent,2510,realParent.mkdirs());
        final File realInner = new File(realParent , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2513,realInner,2512,realInner.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(realInner , "file1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2514,realInner.list().length);
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2516,randomDirectory,2515,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2517,randomDirectory.list().length);
        final File symlinkDirectory = new File(realParent , "fakeinner");
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2518,symlinkDirectory.list().length);
        final File symlinkParentDirectory = new File(top , "fakeouter");
        setupSymlink(realParent, symlinkParentDirectory);
        org.apache.commons.io.FileUtils.cleanDirectory(symlinkParentDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2519,symlinkParentDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2520,realParent.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2521,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCleanDirWithParentSymlinks_literalMutation3097() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithParentSymlinks_literalMutation3097");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realParent = new File(top , "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2511,realParent,2510,realParent.mkdirs());
        final File realInner = new File(realParent , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2513,realInner,2512,realInner.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(realInner , "file1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2514,realInner.list().length);
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2516,randomDirectory,2515,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2517,randomDirectory.list().length);
        final File symlinkDirectory = new File(realParent , "fakeinner");
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2518,symlinkDirectory.list().length);
        final File symlinkParentDirectory = new File(top , "fakeouter");
        setupSymlink(realParent, symlinkParentDirectory);
        org.apache.commons.io.FileUtils.cleanDirectory(symlinkParentDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2519,symlinkParentDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2520,realParent.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2521,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCleanDirWithParentSymlinks_literalMutation3098() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithParentSymlinks_literalMutation3098");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realParent = new File(top , "realparent");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2511,realParent,2510,realParent.mkdirs());
        final File realInner = new File(realParent , "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2513,realInner,2512,realInner.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(realInner , "file1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2514,realInner.list().length);
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2516,randomDirectory,2515,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2517,randomDirectory.list().length);
        final File symlinkDirectory = new File(realParent , "fakeinner");
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2518,symlinkDirectory.list().length);
        final File symlinkParentDirectory = new File(top , "fakeouter");
        setupSymlink(realParent, symlinkParentDirectory);
        org.apache.commons.io.FileUtils.cleanDirectory(symlinkParentDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2519,symlinkParentDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2520,realParent.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2521,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCleanDirWithParentSymlinks_literalMutation3099() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithParentSymlinks_literalMutation3099");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realParent = new File(top , "realparent");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2511,realParent,2510,realParent.mkdirs());
        final File realInner = new File(realParent , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2513,realInner,2512,realInner.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(realInner , "foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2514,realInner.list().length);
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2516,randomDirectory,2515,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2517,randomDirectory.list().length);
        final File symlinkDirectory = new File(realParent , "fakeinner");
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2518,symlinkDirectory.list().length);
        final File symlinkParentDirectory = new File(top , "fakeouter");
        setupSymlink(realParent, symlinkParentDirectory);
        org.apache.commons.io.FileUtils.cleanDirectory(symlinkParentDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2519,symlinkParentDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2520,realParent.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2521,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCleanDirWithParentSymlinks_literalMutation3100() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithParentSymlinks_literalMutation3100");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realParent = new File(top , "realparent");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2511,realParent,2510,realParent.mkdirs());
        final File realInner = new File(realParent , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2513,realInner,2512,realInner.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(realInner , "file1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2514,realInner.list().length);
        final File randomDirectory = new File(top , "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2516,randomDirectory,2515,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2517,randomDirectory.list().length);
        final File symlinkDirectory = new File(realParent , "fakeinner");
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2518,symlinkDirectory.list().length);
        final File symlinkParentDirectory = new File(top , "fakeouter");
        setupSymlink(realParent, symlinkParentDirectory);
        org.apache.commons.io.FileUtils.cleanDirectory(symlinkParentDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2519,symlinkParentDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2520,realParent.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2521,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCleanDirWithParentSymlinks_literalMutation3101() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithParentSymlinks_literalMutation3101");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realParent = new File(top , "realparent");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2511,realParent,2510,realParent.mkdirs());
        final File realInner = new File(realParent , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2513,realInner,2512,realInner.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(realInner , "file1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2514,realInner.list().length);
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2516,randomDirectory,2515,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2517,randomDirectory.list().length);
        final File symlinkDirectory = new File(realParent , "fakeinner");
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2518,symlinkDirectory.list().length);
        final File symlinkParentDirectory = new File(top , "fakeouter");
        setupSymlink(realParent, symlinkParentDirectory);
        org.apache.commons.io.FileUtils.cleanDirectory(symlinkParentDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2519,symlinkParentDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2520,realParent.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2521,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCleanDirWithParentSymlinks_literalMutation3102() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithParentSymlinks_literalMutation3102");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realParent = new File(top , "realparent");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2511,realParent,2510,realParent.mkdirs());
        final File realInner = new File(realParent , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2513,realInner,2512,realInner.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(realInner , "file1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2514,realInner.list().length);
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2516,randomDirectory,2515,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2517,randomDirectory.list().length);
        final File symlinkDirectory = new File(realParent , "foo");
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2518,symlinkDirectory.list().length);
        final File symlinkParentDirectory = new File(top , "fakeouter");
        setupSymlink(realParent, symlinkParentDirectory);
        org.apache.commons.io.FileUtils.cleanDirectory(symlinkParentDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2519,symlinkParentDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2520,realParent.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2521,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCleanDirWithParentSymlinks_literalMutation3103() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithParentSymlinks_literalMutation3103");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realParent = new File(top , "realparent");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2511,realParent,2510,realParent.mkdirs());
        final File realInner = new File(realParent , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2513,realInner,2512,realInner.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(realInner , "file1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2514,realInner.list().length);
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2516,randomDirectory,2515,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2517,randomDirectory.list().length);
        final File symlinkDirectory = new File(realParent , "fakeinner");
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2518,symlinkDirectory.list().length);
        final File symlinkParentDirectory = new File(top , "foo");
        setupSymlink(realParent, symlinkParentDirectory);
        org.apache.commons.io.FileUtils.cleanDirectory(symlinkParentDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2519,symlinkParentDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2520,realParent.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2521,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCleanDirWithParentSymlinks_remove1004() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithParentSymlinks_remove1004");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realParent = new File(top , "realparent");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2511,realParent,2510,realParent.mkdirs());
        final File realInner = new File(realParent , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2513,realInner,2512,realInner.mkdirs());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2514,realInner.list().length);
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2516,randomDirectory,2515,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2517,randomDirectory.list().length);
        final File symlinkDirectory = new File(realParent , "fakeinner");
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2518,symlinkDirectory.list().length);
        final File symlinkParentDirectory = new File(top , "fakeouter");
        setupSymlink(realParent, symlinkParentDirectory);
        org.apache.commons.io.FileUtils.cleanDirectory(symlinkParentDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2519,symlinkParentDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2520,realParent.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2521,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCleanDirWithParentSymlinks_remove1005() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithParentSymlinks_remove1005");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realParent = new File(top , "realparent");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2511,realParent,2510,realParent.mkdirs());
        final File realInner = new File(realParent , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2513,realInner,2512,realInner.mkdirs());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2514,realInner.list().length);
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2516,randomDirectory,2515,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2517,randomDirectory.list().length);
        final File symlinkDirectory = new File(realParent , "fakeinner");
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2518,symlinkDirectory.list().length);
        final File symlinkParentDirectory = new File(top , "fakeouter");
        setupSymlink(realParent, symlinkParentDirectory);
        org.apache.commons.io.FileUtils.cleanDirectory(symlinkParentDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2519,symlinkParentDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2520,realParent.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2521,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCleanDirWithParentSymlinks_remove1006() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithParentSymlinks_remove1006");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realParent = new File(top , "realparent");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2511,realParent,2510,realParent.mkdirs());
        final File realInner = new File(realParent , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2513,realInner,2512,realInner.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(realInner , "file1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2514,realInner.list().length);
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2516,randomDirectory,2515,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2517,randomDirectory.list().length);
        final File symlinkDirectory = new File(realParent , "fakeinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2518,symlinkDirectory.list().length);
        final File symlinkParentDirectory = new File(top , "fakeouter");
        setupSymlink(realParent, symlinkParentDirectory);
        org.apache.commons.io.FileUtils.cleanDirectory(symlinkParentDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2519,symlinkParentDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2520,realParent.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2521,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCleanDirWithParentSymlinks_remove1007() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithParentSymlinks_remove1007");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realParent = new File(top , "realparent");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2511,realParent,2510,realParent.mkdirs());
        final File realInner = new File(realParent , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2513,realInner,2512,realInner.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(realInner , "file1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2514,realInner.list().length);
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2516,randomDirectory,2515,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2517,randomDirectory.list().length);
        final File symlinkDirectory = new File(realParent , "fakeinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2518,symlinkDirectory.list().length);
        final File symlinkParentDirectory = new File(top , "fakeouter");
        setupSymlink(realParent, symlinkParentDirectory);
        org.apache.commons.io.FileUtils.cleanDirectory(symlinkParentDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2519,symlinkParentDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2520,realParent.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2521,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCleanDirWithParentSymlinks_remove1008() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanDirWithParentSymlinks_remove1008");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realParent = new File(top , "realparent");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2511,realParent,2510,realParent.mkdirs());
        final File realInner = new File(realParent , "realinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2513,realInner,2512,realInner.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(realInner , "file1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2514,realInner.list().length);
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2516,randomDirectory,2515,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2517,randomDirectory.list().length);
        final File symlinkDirectory = new File(realParent , "fakeinner");
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2518,symlinkDirectory.list().length);
        final File symlinkParentDirectory = new File(top , "fakeouter");
        setupSymlink(realParent, symlinkParentDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2519,symlinkParentDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2520,realParent.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2521,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStillClearsIfGivenDirectoryIsASymlink_add1335() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStillClearsIfGivenDirectoryIsASymlink_add1335");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2552,randomDirectory,2551,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2553,randomDirectory.list().length);
        final File symlinkDirectory = new File(top , "fakeDir");
        setupSymlink(randomDirectory, symlinkDirectory);
        org.apache.commons.io.FileUtils.cleanDirectory(symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2554,symlinkDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2555,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStillClearsIfGivenDirectoryIsASymlink_add1336() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStillClearsIfGivenDirectoryIsASymlink_add1336");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2552,randomDirectory,2551,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2553,randomDirectory.list().length);
        final File symlinkDirectory = new File(top , "fakeDir");
        setupSymlink(randomDirectory, symlinkDirectory);
        setupSymlink(randomDirectory, symlinkDirectory);
        org.apache.commons.io.FileUtils.cleanDirectory(symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2554,symlinkDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2555,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStillClearsIfGivenDirectoryIsASymlink_add1337() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStillClearsIfGivenDirectoryIsASymlink_add1337");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2552,randomDirectory,2551,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2553,randomDirectory.list().length);
        final File symlinkDirectory = new File(top , "fakeDir");
        setupSymlink(randomDirectory, symlinkDirectory);
        org.apache.commons.io.FileUtils.cleanDirectory(symlinkDirectory);
        org.apache.commons.io.FileUtils.cleanDirectory(symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2554,symlinkDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2555,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStillClearsIfGivenDirectoryIsASymlink() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStillClearsIfGivenDirectoryIsASymlink");
        if (java.lang.System.getProperty("foo").startsWith("Win")) {
            return ;
        } 
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2552,randomDirectory,2551,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2553,randomDirectory.list().length);
        final File symlinkDirectory = new File(top , "fakeDir");
        setupSymlink(randomDirectory, symlinkDirectory);
        org.apache.commons.io.FileUtils.cleanDirectory(symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2554,symlinkDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2555,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStillClearsIfGivenDirectoryIsASymlink_literalMutation3126() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStillClearsIfGivenDirectoryIsASymlink_literalMutation3126");
        if (java.lang.System.getProperty("os.name").startsWith("foo")) {
            return ;
        } 
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2552,randomDirectory,2551,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2553,randomDirectory.list().length);
        final File symlinkDirectory = new File(top , "fakeDir");
        setupSymlink(randomDirectory, symlinkDirectory);
        org.apache.commons.io.FileUtils.cleanDirectory(symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2554,symlinkDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2555,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStillClearsIfGivenDirectoryIsASymlink_literalMutation3127() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStillClearsIfGivenDirectoryIsASymlink_literalMutation3127");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File randomDirectory = new File(top , "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2552,randomDirectory,2551,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2553,randomDirectory.list().length);
        final File symlinkDirectory = new File(top , "fakeDir");
        setupSymlink(randomDirectory, symlinkDirectory);
        org.apache.commons.io.FileUtils.cleanDirectory(symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2554,symlinkDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2555,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStillClearsIfGivenDirectoryIsASymlink_literalMutation3128() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStillClearsIfGivenDirectoryIsASymlink_literalMutation3128");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2552,randomDirectory,2551,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2553,randomDirectory.list().length);
        final File symlinkDirectory = new File(top , "fakeDir");
        setupSymlink(randomDirectory, symlinkDirectory);
        org.apache.commons.io.FileUtils.cleanDirectory(symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2554,symlinkDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2555,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStillClearsIfGivenDirectoryIsASymlink_literalMutation3129() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStillClearsIfGivenDirectoryIsASymlink_literalMutation3129");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2552,randomDirectory,2551,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2553,randomDirectory.list().length);
        final File symlinkDirectory = new File(top , "foo");
        setupSymlink(randomDirectory, symlinkDirectory);
        org.apache.commons.io.FileUtils.cleanDirectory(symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2554,symlinkDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2555,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStillClearsIfGivenDirectoryIsASymlink_remove1018() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStillClearsIfGivenDirectoryIsASymlink_remove1018");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2552,randomDirectory,2551,randomDirectory.mkdirs());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2553,randomDirectory.list().length);
        final File symlinkDirectory = new File(top , "fakeDir");
        setupSymlink(randomDirectory, symlinkDirectory);
        org.apache.commons.io.FileUtils.cleanDirectory(symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2554,symlinkDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2555,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStillClearsIfGivenDirectoryIsASymlink_remove1019() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStillClearsIfGivenDirectoryIsASymlink_remove1019");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2552,randomDirectory,2551,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2553,randomDirectory.list().length);
        final File symlinkDirectory = new File(top , "fakeDir");
        org.apache.commons.io.FileUtils.cleanDirectory(symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2554,symlinkDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2555,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStillClearsIfGivenDirectoryIsASymlink_remove1020() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStillClearsIfGivenDirectoryIsASymlink_remove1020");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2552,randomDirectory,2551,randomDirectory.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(randomDirectory , "randomfile"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2553,randomDirectory.list().length);
        final File symlinkDirectory = new File(top , "fakeDir");
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2554,symlinkDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2555,randomDirectory.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIdentifiesSymlinkDir_add1332() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIdentifiesSymlinkDir_add1332");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2542,randomDirectory,2541,randomDirectory.mkdirs());
        final File symlinkDirectory = new File(top , "fakeDir");
        setupSymlink(randomDirectory, symlinkDirectory);
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2544,null,2543,org.apache.commons.io.FileUtils.isSymlink(symlinkDirectory));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2546,null,2545,org.apache.commons.io.FileUtils.isSymlink(randomDirectory));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIdentifiesSymlinkDir() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIdentifiesSymlinkDir");
        if (java.lang.System.getProperty("foo").startsWith("Win")) {
            return ;
        } 
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2542,randomDirectory,2541,randomDirectory.mkdirs());
        final File symlinkDirectory = new File(top , "fakeDir");
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2544,null,2543,org.apache.commons.io.FileUtils.isSymlink(symlinkDirectory));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2546,null,2545,org.apache.commons.io.FileUtils.isSymlink(randomDirectory));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIdentifiesSymlinkDir_literalMutation3118() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIdentifiesSymlinkDir_literalMutation3118");
        if (java.lang.System.getProperty("os.name").startsWith("foo")) {
            return ;
        } 
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2542,randomDirectory,2541,randomDirectory.mkdirs());
        final File symlinkDirectory = new File(top , "fakeDir");
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2544,null,2543,org.apache.commons.io.FileUtils.isSymlink(symlinkDirectory));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2546,null,2545,org.apache.commons.io.FileUtils.isSymlink(randomDirectory));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIdentifiesSymlinkDir_literalMutation3119() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIdentifiesSymlinkDir_literalMutation3119");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File randomDirectory = new File(top , "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2542,randomDirectory,2541,randomDirectory.mkdirs());
        final File symlinkDirectory = new File(top , "fakeDir");
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2544,null,2543,org.apache.commons.io.FileUtils.isSymlink(symlinkDirectory));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2546,null,2545,org.apache.commons.io.FileUtils.isSymlink(randomDirectory));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIdentifiesSymlinkDir_literalMutation3120() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIdentifiesSymlinkDir_literalMutation3120");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2542,randomDirectory,2541,randomDirectory.mkdirs());
        final File symlinkDirectory = new File(top , "foo");
        setupSymlink(randomDirectory, symlinkDirectory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2544,null,2543,org.apache.commons.io.FileUtils.isSymlink(symlinkDirectory));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2546,null,2545,org.apache.commons.io.FileUtils.isSymlink(randomDirectory));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIdentifiesSymlinkDir_remove1015() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIdentifiesSymlinkDir_remove1015");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File randomDirectory = new File(top , "randomDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2542,randomDirectory,2541,randomDirectory.mkdirs());
        final File symlinkDirectory = new File(top , "fakeDir");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2544,null,2543,org.apache.commons.io.FileUtils.isSymlink(symlinkDirectory));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2546,null,2545,org.apache.commons.io.FileUtils.isSymlink(randomDirectory));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIdentifiesSymlinkFile_add1333() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIdentifiesSymlinkFile_add1333");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File randomFile = new File(top , "randomfile");
        org.apache.commons.io.FileUtils.touch(randomFile);
        org.apache.commons.io.FileUtils.touch(randomFile);
        final File symlinkFile = new File(top , "fakeinner");
        setupSymlink(randomFile, symlinkFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2548,null,2547,org.apache.commons.io.FileUtils.isSymlink(symlinkFile));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2550,null,2549,org.apache.commons.io.FileUtils.isSymlink(randomFile));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIdentifiesSymlinkFile_add1334() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIdentifiesSymlinkFile_add1334");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File randomFile = new File(top , "randomfile");
        org.apache.commons.io.FileUtils.touch(randomFile);
        final File symlinkFile = new File(top , "fakeinner");
        setupSymlink(randomFile, symlinkFile);
        setupSymlink(randomFile, symlinkFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2548,null,2547,org.apache.commons.io.FileUtils.isSymlink(symlinkFile));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2550,null,2549,org.apache.commons.io.FileUtils.isSymlink(randomFile));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIdentifiesSymlinkFile() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIdentifiesSymlinkFile");
        if (java.lang.System.getProperty("foo").startsWith("Win")) {
            return ;
        } 
        final File randomFile = new File(top , "randomfile");
        org.apache.commons.io.FileUtils.touch(randomFile);
        final File symlinkFile = new File(top , "fakeinner");
        setupSymlink(randomFile, symlinkFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2548,null,2547,org.apache.commons.io.FileUtils.isSymlink(symlinkFile));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2550,null,2549,org.apache.commons.io.FileUtils.isSymlink(randomFile));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIdentifiesSymlinkFile_literalMutation3122() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIdentifiesSymlinkFile_literalMutation3122");
        if (java.lang.System.getProperty("os.name").startsWith("foo")) {
            return ;
        } 
        final File randomFile = new File(top , "randomfile");
        org.apache.commons.io.FileUtils.touch(randomFile);
        final File symlinkFile = new File(top , "fakeinner");
        setupSymlink(randomFile, symlinkFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2548,null,2547,org.apache.commons.io.FileUtils.isSymlink(symlinkFile));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2550,null,2549,org.apache.commons.io.FileUtils.isSymlink(randomFile));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIdentifiesSymlinkFile_literalMutation3123() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIdentifiesSymlinkFile_literalMutation3123");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File randomFile = new File(top , "foo");
        org.apache.commons.io.FileUtils.touch(randomFile);
        final File symlinkFile = new File(top , "fakeinner");
        setupSymlink(randomFile, symlinkFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2548,null,2547,org.apache.commons.io.FileUtils.isSymlink(symlinkFile));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2550,null,2549,org.apache.commons.io.FileUtils.isSymlink(randomFile));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIdentifiesSymlinkFile_literalMutation3124() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIdentifiesSymlinkFile_literalMutation3124");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File randomFile = new File(top , "randomfile");
        org.apache.commons.io.FileUtils.touch(randomFile);
        final File symlinkFile = new File(top , "foo");
        setupSymlink(randomFile, symlinkFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2548,null,2547,org.apache.commons.io.FileUtils.isSymlink(symlinkFile));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2550,null,2549,org.apache.commons.io.FileUtils.isSymlink(randomFile));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIdentifiesSymlinkFile_remove1016() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIdentifiesSymlinkFile_remove1016");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File randomFile = new File(top , "randomfile");
        final File symlinkFile = new File(top , "fakeinner");
        setupSymlink(randomFile, symlinkFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2548,null,2547,org.apache.commons.io.FileUtils.isSymlink(symlinkFile));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2550,null,2549,org.apache.commons.io.FileUtils.isSymlink(randomFile));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIdentifiesSymlinkFile_remove1017() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIdentifiesSymlinkFile_remove1017");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File randomFile = new File(top , "randomfile");
        org.apache.commons.io.FileUtils.touch(randomFile);
        final File symlinkFile = new File(top , "fakeinner");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2548,null,2547,org.apache.commons.io.FileUtils.isSymlink(symlinkFile));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2550,null,2549,org.apache.commons.io.FileUtils.isSymlink(randomFile));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCorrectlyIdentifySymlinkWithParentSymLink_add1330() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCorrectlyIdentifySymlinkWithParentSymLink_add1330");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realParent = new File(top , "realparent");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2534,realParent,2533,realParent.mkdirs());
        final File symlinkParentDirectory = new File(top , "fakeparent");
        setupSymlink(realParent, symlinkParentDirectory);
        setupSymlink(realParent, symlinkParentDirectory);
        final File realChild = new File(symlinkParentDirectory , "realChild");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2536,realChild,2535,realChild.mkdirs());
        final File symlinkChild = new File(symlinkParentDirectory , "fakeChild");
        setupSymlink(realChild, symlinkChild);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2538,null,2537,org.apache.commons.io.FileUtils.isSymlink(symlinkChild));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2540,null,2539,org.apache.commons.io.FileUtils.isSymlink(realChild));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCorrectlyIdentifySymlinkWithParentSymLink_add1331() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCorrectlyIdentifySymlinkWithParentSymLink_add1331");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realParent = new File(top , "realparent");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2534,realParent,2533,realParent.mkdirs());
        final File symlinkParentDirectory = new File(top , "fakeparent");
        setupSymlink(realParent, symlinkParentDirectory);
        final File realChild = new File(symlinkParentDirectory , "realChild");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2536,realChild,2535,realChild.mkdirs());
        final File symlinkChild = new File(symlinkParentDirectory , "fakeChild");
        setupSymlink(realChild, symlinkChild);
        setupSymlink(realChild, symlinkChild);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2538,null,2537,org.apache.commons.io.FileUtils.isSymlink(symlinkChild));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2540,null,2539,org.apache.commons.io.FileUtils.isSymlink(realChild));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCorrectlyIdentifySymlinkWithParentSymLink() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCorrectlyIdentifySymlinkWithParentSymLink");
        if (java.lang.System.getProperty("foo").startsWith("Win")) {
            return ;
        } 
        final File realParent = new File(top , "realparent");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2534,realParent,2533,realParent.mkdirs());
        final File symlinkParentDirectory = new File(top , "fakeparent");
        setupSymlink(realParent, symlinkParentDirectory);
        final File realChild = new File(symlinkParentDirectory , "realChild");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2536,realChild,2535,realChild.mkdirs());
        final File symlinkChild = new File(symlinkParentDirectory , "fakeChild");
        setupSymlink(realChild, symlinkChild);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2538,null,2537,org.apache.commons.io.FileUtils.isSymlink(symlinkChild));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2540,null,2539,org.apache.commons.io.FileUtils.isSymlink(realChild));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCorrectlyIdentifySymlinkWithParentSymLink_literalMutation3112() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCorrectlyIdentifySymlinkWithParentSymLink_literalMutation3112");
        if (java.lang.System.getProperty("os.name").startsWith("foo")) {
            return ;
        } 
        final File realParent = new File(top , "realparent");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2534,realParent,2533,realParent.mkdirs());
        final File symlinkParentDirectory = new File(top , "fakeparent");
        setupSymlink(realParent, symlinkParentDirectory);
        final File realChild = new File(symlinkParentDirectory , "realChild");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2536,realChild,2535,realChild.mkdirs());
        final File symlinkChild = new File(symlinkParentDirectory , "fakeChild");
        setupSymlink(realChild, symlinkChild);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2538,null,2537,org.apache.commons.io.FileUtils.isSymlink(symlinkChild));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2540,null,2539,org.apache.commons.io.FileUtils.isSymlink(realChild));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCorrectlyIdentifySymlinkWithParentSymLink_literalMutation3113() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCorrectlyIdentifySymlinkWithParentSymLink_literalMutation3113");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realParent = new File(top , "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2534,realParent,2533,realParent.mkdirs());
        final File symlinkParentDirectory = new File(top , "fakeparent");
        setupSymlink(realParent, symlinkParentDirectory);
        final File realChild = new File(symlinkParentDirectory , "realChild");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2536,realChild,2535,realChild.mkdirs());
        final File symlinkChild = new File(symlinkParentDirectory , "fakeChild");
        setupSymlink(realChild, symlinkChild);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2538,null,2537,org.apache.commons.io.FileUtils.isSymlink(symlinkChild));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2540,null,2539,org.apache.commons.io.FileUtils.isSymlink(realChild));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCorrectlyIdentifySymlinkWithParentSymLink_literalMutation3114() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCorrectlyIdentifySymlinkWithParentSymLink_literalMutation3114");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realParent = new File(top , "realparent");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2534,realParent,2533,realParent.mkdirs());
        final File symlinkParentDirectory = new File(top , "foo");
        setupSymlink(realParent, symlinkParentDirectory);
        final File realChild = new File(symlinkParentDirectory , "realChild");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2536,realChild,2535,realChild.mkdirs());
        final File symlinkChild = new File(symlinkParentDirectory , "fakeChild");
        setupSymlink(realChild, symlinkChild);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2538,null,2537,org.apache.commons.io.FileUtils.isSymlink(symlinkChild));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2540,null,2539,org.apache.commons.io.FileUtils.isSymlink(realChild));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCorrectlyIdentifySymlinkWithParentSymLink_literalMutation3115() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCorrectlyIdentifySymlinkWithParentSymLink_literalMutation3115");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realParent = new File(top , "realparent");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2534,realParent,2533,realParent.mkdirs());
        final File symlinkParentDirectory = new File(top , "fakeparent");
        setupSymlink(realParent, symlinkParentDirectory);
        final File realChild = new File(symlinkParentDirectory , "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2536,realChild,2535,realChild.mkdirs());
        final File symlinkChild = new File(symlinkParentDirectory , "fakeChild");
        setupSymlink(realChild, symlinkChild);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2538,null,2537,org.apache.commons.io.FileUtils.isSymlink(symlinkChild));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2540,null,2539,org.apache.commons.io.FileUtils.isSymlink(realChild));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCorrectlyIdentifySymlinkWithParentSymLink_literalMutation3116() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCorrectlyIdentifySymlinkWithParentSymLink_literalMutation3116");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realParent = new File(top , "realparent");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2534,realParent,2533,realParent.mkdirs());
        final File symlinkParentDirectory = new File(top , "fakeparent");
        setupSymlink(realParent, symlinkParentDirectory);
        final File realChild = new File(symlinkParentDirectory , "realChild");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2536,realChild,2535,realChild.mkdirs());
        final File symlinkChild = new File(symlinkParentDirectory , "foo");
        setupSymlink(realChild, symlinkChild);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2538,null,2537,org.apache.commons.io.FileUtils.isSymlink(symlinkChild));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2540,null,2539,org.apache.commons.io.FileUtils.isSymlink(realChild));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCorrectlyIdentifySymlinkWithParentSymLink_remove1013() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCorrectlyIdentifySymlinkWithParentSymLink_remove1013");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realParent = new File(top , "realparent");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2534,realParent,2533,realParent.mkdirs());
        final File symlinkParentDirectory = new File(top , "fakeparent");
        final File realChild = new File(symlinkParentDirectory , "realChild");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2536,realChild,2535,realChild.mkdirs());
        final File symlinkChild = new File(symlinkParentDirectory , "fakeChild");
        setupSymlink(realChild, symlinkChild);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2538,null,2537,org.apache.commons.io.FileUtils.isSymlink(symlinkChild));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2540,null,2539,org.apache.commons.io.FileUtils.isSymlink(realChild));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCorrectlyIdentifySymlinkWithParentSymLink_remove1014() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCorrectlyIdentifySymlinkWithParentSymLink_remove1014");
        if (java.lang.System.getProperty("os.name").startsWith("Win")) {
            return ;
        } 
        final File realParent = new File(top , "realparent");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2534,realParent,2533,realParent.mkdirs());
        final File symlinkParentDirectory = new File(top , "fakeparent");
        final File realChild = new File(symlinkParentDirectory , "realChild");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2536,realChild,2535,realChild.mkdirs());
        final File symlinkChild = new File(symlinkParentDirectory , "fakeChild");
        setupSymlink(realChild, symlinkChild);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2538,null,2537,org.apache.commons.io.FileUtils.isSymlink(symlinkChild));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2540,null,2539,org.apache.commons.io.FileUtils.isSymlink(realChild));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void setupSymlink(File res, File link) throws Exception {
        List<java.lang.String> args = new ArrayList<java.lang.String>();
        args.add("ln");
        args.add("-s");
        args.add(res.getAbsolutePath());
        args.add(link.getAbsolutePath());
        Process proc;
        proc = java.lang.Runtime.getRuntime().exec(args.toArray(new String[args.size()]));
        proc.waitFor();
    }
}


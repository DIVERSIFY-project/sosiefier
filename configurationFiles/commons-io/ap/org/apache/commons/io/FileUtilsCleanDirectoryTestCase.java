package org.apache.commons.io;

import java.util.ArrayList;
import java.io.File;
import org.apache.commons.io.testtools.FileBasedTestCase;
import java.io.IOException;
import java.util.List;
import org.junit.Test;

/** 
 * Test cases for FileUtils.cleanDirectory() method.
 * 
 * @version $Id$
 */
public class FileUtilsCleanDirectoryTestCase extends FileBasedTestCase {
    final File top = getLocalTestDirectory();

    public FileUtilsCleanDirectoryTestCase(String name) {
        super(name);
    }

    private File getLocalTestDirectory() {
        return new File(FileBasedTestCase.getTestDirectory() , "list-files");
    }

    /** 
     * @see junit.framework.TestCase#setUp()
     */
@Override
    protected void setUp() throws Exception {
        top.mkdirs();
    }

    /** 
     * @see junit.framework.TestCase#tearDown()
     */
@Override
    protected void tearDown() throws Exception {
        chmod(top, 775, true);
        org.apache.commons.io.FileUtils.deleteDirectory(top);
    }

    @Test(timeout = 1000)
    public void testCleanEmpty() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanEmpty");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2487,top.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(top);
        org.apache.commons.io.FileUtils.cleanDirectory(top);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2488,top.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCleanEmpty_remove993() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCleanEmpty_remove993");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2487,top.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2488,top.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeletesRegular_add1311() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeletesRegular_add1311");
        org.apache.commons.io.FileUtils.touch(new File(top , "regular"));
        org.apache.commons.io.FileUtils.touch(new File(top , "regular"));
        org.apache.commons.io.FileUtils.touch(new File(top , ".hidden"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2493,top.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(top);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2494,top.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeletesRegular_add1312() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeletesRegular_add1312");
        org.apache.commons.io.FileUtils.touch(new File(top , "regular"));
        org.apache.commons.io.FileUtils.touch(new File(top , ".hidden"));
        org.apache.commons.io.FileUtils.touch(new File(top , ".hidden"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2493,top.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(top);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2494,top.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeletesRegular_add1313() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeletesRegular_add1313");
        org.apache.commons.io.FileUtils.touch(new File(top , "regular"));
        org.apache.commons.io.FileUtils.touch(new File(top , ".hidden"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2493,top.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(top);
        org.apache.commons.io.FileUtils.cleanDirectory(top);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2494,top.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeletesRegular() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeletesRegular");
        org.apache.commons.io.FileUtils.touch(new File(top , "foo"));
        org.apache.commons.io.FileUtils.touch(new File(top , ".hidden"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2493,top.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(top);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2494,top.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeletesRegular_literalMutation3077() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeletesRegular_literalMutation3077");
        org.apache.commons.io.FileUtils.touch(new File(top , "regular"));
        org.apache.commons.io.FileUtils.touch(new File(top , "foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2493,top.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(top);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2494,top.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeletesRegular_remove996() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeletesRegular_remove996");
        org.apache.commons.io.FileUtils.touch(new File(top , ".hidden"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2493,top.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(top);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2494,top.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeletesRegular_remove997() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeletesRegular_remove997");
        org.apache.commons.io.FileUtils.touch(new File(top , ".hidden"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2493,top.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(top);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2494,top.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeletesRegular_remove998() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeletesRegular_remove998");
        org.apache.commons.io.FileUtils.touch(new File(top , "regular"));
        org.apache.commons.io.FileUtils.touch(new File(top , ".hidden"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2493,top.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2494,top.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeletesNested_add1309() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeletesNested_add1309");
        final File nested = new File(top , "nested");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2490,nested,2489,nested.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(nested , "file"));
        org.apache.commons.io.FileUtils.touch(new File(nested , "file"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2491,top.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(top);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2492,top.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeletesNested_add1310() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeletesNested_add1310");
        final File nested = new File(top , "nested");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2490,nested,2489,nested.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(nested , "file"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2491,top.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(top);
        org.apache.commons.io.FileUtils.cleanDirectory(top);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2492,top.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeletesNested() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeletesNested");
        final File nested = new File(top , "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2490,nested,2489,nested.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(nested , "file"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2491,top.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(top);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2492,top.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeletesNested_literalMutation3075() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeletesNested_literalMutation3075");
        final File nested = new File(top , "nested");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2490,nested,2489,nested.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(nested , "foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2491,top.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(top);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2492,top.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeletesNested_remove994() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeletesNested_remove994");
        final File nested = new File(top , "nested");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2490,nested,2489,nested.mkdirs());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2491,top.list().length);
        org.apache.commons.io.FileUtils.cleanDirectory(top);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2492,top.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeletesNested_remove995() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeletesNested_remove995");
        final File nested = new File(top , "nested");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2490,nested,2489,nested.mkdirs());
        org.apache.commons.io.FileUtils.touch(new File(nested , "file"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2491,top.list().length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2492,top.list().length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testThrowsOnNullList_add1316() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testThrowsOnNullList_add1316");
        if ((java.lang.System.getProperty("os.name").startsWith("Win")) || (!(chmod(top, 0, false)))) {
            return ;
        } 
        try {
            org.apache.commons.io.FileUtils.cleanDirectory(top);
            org.apache.commons.io.FileUtils.cleanDirectory(top);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2498,("Failed to list contents of " + (top.getAbsolutePath())));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),785,e,784,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testThrowsOnNullList() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testThrowsOnNullList");
        if ((java.lang.System.getProperty("foo").startsWith("Win")) || (!(chmod(top, 0, false)))) {
            return ;
        } 
        try {
            org.apache.commons.io.FileUtils.cleanDirectory(top);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2498,("Failed to list contents of " + (top.getAbsolutePath())));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),785,e,784,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testThrowsOnNullList_literalMutation3084() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testThrowsOnNullList_literalMutation3084");
        if ((java.lang.System.getProperty("os.name").startsWith("foo")) || (!(chmod(top, 0, false)))) {
            return ;
        } 
        try {
            org.apache.commons.io.FileUtils.cleanDirectory(top);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2498,("Failed to list contents of " + (top.getAbsolutePath())));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),785,e,784,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testThrowsOnNullList_literalMutation3085() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testThrowsOnNullList_literalMutation3085");
        if ((java.lang.System.getProperty("os.name").startsWith("Win")) || (!(chmod(top, -1, false)))) {
            return ;
        } 
        try {
            org.apache.commons.io.FileUtils.cleanDirectory(top);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2498,("Failed to list contents of " + (top.getAbsolutePath())));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),785,e,784,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testThrowsOnNullList_literalMutation3086() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testThrowsOnNullList_literalMutation3086");
        if ((java.lang.System.getProperty("os.name").startsWith("Win")) || (!(chmod(top, 0, false)))) {
            return ;
        } 
        try {
            org.apache.commons.io.FileUtils.cleanDirectory(top);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2498,("Failed to list contents of " + (top.getAbsolutePath())));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),785,e,784,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testThrowsOnCannotDeleteFile_add1314() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testThrowsOnCannotDeleteFile_add1314");
        final File file = new File(top , "restricted");
        org.apache.commons.io.FileUtils.touch(file);
        org.apache.commons.io.FileUtils.touch(file);
        if ((java.lang.System.getProperty("os.name").startsWith("Win")) || (!(chmod(top, 500, false)))) {
            return ;
        } 
        try {
            org.apache.commons.io.FileUtils.cleanDirectory(top);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2495,("Unable to delete file: " + (file.getAbsolutePath())));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2497,e,2496,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testThrowsOnCannotDeleteFile_add1315() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testThrowsOnCannotDeleteFile_add1315");
        final File file = new File(top , "restricted");
        org.apache.commons.io.FileUtils.touch(file);
        if ((java.lang.System.getProperty("os.name").startsWith("Win")) || (!(chmod(top, 500, false)))) {
            return ;
        } 
        try {
            org.apache.commons.io.FileUtils.cleanDirectory(top);
            org.apache.commons.io.FileUtils.cleanDirectory(top);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2495,("Unable to delete file: " + (file.getAbsolutePath())));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2497,e,2496,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testThrowsOnCannotDeleteFile() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testThrowsOnCannotDeleteFile");
        final File file = new File(top , "foo");
        org.apache.commons.io.FileUtils.touch(file);
        if ((java.lang.System.getProperty("os.name").startsWith("Win")) || (!(chmod(top, 500, false)))) {
            return ;
        } 
        try {
            org.apache.commons.io.FileUtils.cleanDirectory(top);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2495,("Unable to delete file: " + (file.getAbsolutePath())));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2497,e,2496,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testThrowsOnCannotDeleteFile_literalMutation3079() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testThrowsOnCannotDeleteFile_literalMutation3079");
        final File file = new File(top , "restricted");
        org.apache.commons.io.FileUtils.touch(file);
        if ((java.lang.System.getProperty("foo").startsWith("Win")) || (!(chmod(top, 500, false)))) {
            return ;
        } 
        try {
            org.apache.commons.io.FileUtils.cleanDirectory(top);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2495,("Unable to delete file: " + (file.getAbsolutePath())));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2497,e,2496,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testThrowsOnCannotDeleteFile_literalMutation3080() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testThrowsOnCannotDeleteFile_literalMutation3080");
        final File file = new File(top , "restricted");
        org.apache.commons.io.FileUtils.touch(file);
        if ((java.lang.System.getProperty("os.name").startsWith("foo")) || (!(chmod(top, 500, false)))) {
            return ;
        } 
        try {
            org.apache.commons.io.FileUtils.cleanDirectory(top);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2495,("Unable to delete file: " + (file.getAbsolutePath())));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2497,e,2496,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testThrowsOnCannotDeleteFile_literalMutation3081() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testThrowsOnCannotDeleteFile_literalMutation3081");
        final File file = new File(top , "restricted");
        org.apache.commons.io.FileUtils.touch(file);
        if ((java.lang.System.getProperty("os.name").startsWith("Win")) || (!(chmod(top, 499, false)))) {
            return ;
        } 
        try {
            org.apache.commons.io.FileUtils.cleanDirectory(top);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2495,("Unable to delete file: " + (file.getAbsolutePath())));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2497,e,2496,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testThrowsOnCannotDeleteFile_literalMutation3082() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testThrowsOnCannotDeleteFile_literalMutation3082");
        final File file = new File(top , "restricted");
        org.apache.commons.io.FileUtils.touch(file);
        if ((java.lang.System.getProperty("os.name").startsWith("Win")) || (!(chmod(top, 500, false)))) {
            return ;
        } 
        try {
            org.apache.commons.io.FileUtils.cleanDirectory(top);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2495,("Unable to delete file: " + (file.getAbsolutePath())));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2497,e,2496,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testThrowsOnCannotDeleteFile_remove999() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testThrowsOnCannotDeleteFile_remove999");
        final File file = new File(top , "restricted");
        if ((java.lang.System.getProperty("os.name").startsWith("Win")) || (!(chmod(top, 500, false)))) {
            return ;
        } 
        try {
            org.apache.commons.io.FileUtils.cleanDirectory(top);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2495,("Unable to delete file: " + (file.getAbsolutePath())));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2497,e,2496,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private boolean chmod(File file, int mode, boolean recurse) throws InterruptedException {
        List<java.lang.String> args = new ArrayList<java.lang.String>();
        args.add("chmod");
        if (recurse) {
            args.add("-R");
        } 
        args.add(java.lang.Integer.toString(mode));
        args.add(file.getAbsolutePath());
        Process proc;
        try {
            proc = java.lang.Runtime.getRuntime().exec(args.toArray(new String[args.size()]));
        } catch (IOException e) {
            return false;
        }
        int result = proc.waitFor();
        return result == 0;
    }
}


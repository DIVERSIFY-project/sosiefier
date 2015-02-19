package org.apache.commons.io;

import java.io.File;
import org.apache.commons.io.testtools.FileBasedTestCase;
import java.io.IOException;
import org.junit.Test;

/** 
 * This class ensure the correctness of {@link FileUtils#directoryContains(File,File)}.
 * 
 * @see FileUtils#directoryContains(File, File)
 * @since 2.2
 * @version $Id$
 */
public class FileUtilsDirectoryContainsTestCase extends FileBasedTestCase {
    private File directory1;

    private File directory2;

    private File directory3;

    private File file1;

    private File file1ByRelativeDirectory2;

    private File file2;

    private File file2ByRelativeDirectory1;

    private File file3;

    final File top = FileBasedTestCase.getTestDirectory();

    public FileUtilsDirectoryContainsTestCase(String name) {
        super(name);
    }

    @Override
    protected void setUp() throws Exception {
        top.mkdirs();
        directory1 = new File(top , "directory1");
        directory2 = new File(top , "directory2");
        directory3 = new File(directory2 , "directory3");
        directory1.mkdir();
        directory2.mkdir();
        directory3.mkdir();
        file1 = new File(directory1 , "file1");
        file2 = new File(directory2 , "file2");
        file3 = new File(top , "file3");
        file1ByRelativeDirectory2 = new File(FileBasedTestCase.getTestDirectory() , "directory2/../directory1/file1");
        file2ByRelativeDirectory1 = new File(FileBasedTestCase.getTestDirectory() , "directory1/../directory2/file2");
        org.apache.commons.io.FileUtils.touch(file1);
        org.apache.commons.io.FileUtils.touch(file2);
        org.apache.commons.io.FileUtils.touch(file3);
    }

    @Override
    protected void tearDown() throws Exception {
        org.apache.commons.io.FileUtils.deleteDirectory(top);
    }

    @Test
    public void testCanonicalPath() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCanonicalPath");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2557,null,2556,org.apache.commons.io.FileUtils.directoryContains(directory1, file1ByRelativeDirectory2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2559,null,2558,org.apache.commons.io.FileUtils.directoryContains(directory2, file2ByRelativeDirectory1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2561,null,2560,org.apache.commons.io.FileUtils.directoryContains(directory1, file2ByRelativeDirectory1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2563,null,2562,org.apache.commons.io.FileUtils.directoryContains(directory2, file1ByRelativeDirectory2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDirectoryContainsDirectory() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDirectoryContainsDirectory");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2565,null,2564,org.apache.commons.io.FileUtils.directoryContains(top, directory1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2567,null,2566,org.apache.commons.io.FileUtils.directoryContains(top, directory2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2569,null,2568,org.apache.commons.io.FileUtils.directoryContains(top, directory3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2571,null,2570,org.apache.commons.io.FileUtils.directoryContains(directory2, directory3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDirectoryContainsFile() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDirectoryContainsFile");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2573,null,2572,org.apache.commons.io.FileUtils.directoryContains(directory1, file1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2575,null,2574,org.apache.commons.io.FileUtils.directoryContains(directory2, file2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDirectoryDoesNotContainFile() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDirectoryDoesNotContainFile");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2577,null,2576,org.apache.commons.io.FileUtils.directoryContains(directory1, file2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2579,null,2578,org.apache.commons.io.FileUtils.directoryContains(directory2, file1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2581,null,2580,org.apache.commons.io.FileUtils.directoryContains(directory1, file3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2583,null,2582,org.apache.commons.io.FileUtils.directoryContains(directory2, file3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDirectoryDoesNotContainsDirectory() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDirectoryDoesNotContainsDirectory");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2585,null,2584,org.apache.commons.io.FileUtils.directoryContains(directory1, top));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2587,null,2586,org.apache.commons.io.FileUtils.directoryContains(directory2, top));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2589,null,2588,org.apache.commons.io.FileUtils.directoryContains(directory3, top));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2591,null,2590,org.apache.commons.io.FileUtils.directoryContains(directory3, directory2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDirectoryDoesNotExist() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDirectoryDoesNotExist");
        final File dir = new File("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2593,dir,2592,dir.exists());
        try {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2595,null,2594,org.apache.commons.io.FileUtils.directoryContains(dir, file1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2596,("Expected " + (java.lang.IllegalArgumentException.class.getName())));
        } catch (IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSameFile() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSameFile");
        try {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2610,null,2609,org.apache.commons.io.FileUtils.directoryContains(file1, file1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2611,("Expected " + (java.lang.IllegalArgumentException.class.getName())));
        } catch (IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testFileDoesNotExist() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileDoesNotExist");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2604,null,2603,org.apache.commons.io.FileUtils.directoryContains(top, null));
        final File file = new File("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2606,file,2605,file.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2608,null,2607,org.apache.commons.io.FileUtils.directoryContains(top, file));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test to demonstrate a file which does not exist returns false
     * @throws IOException
     */
@Test
    public void testFileDoesNotExistBug() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileDoesNotExistBug");
        final File file = new File(top , "bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2598,top,2597,top.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2600,file,2599,file.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2602,null,2601,org.apache.commons.io.FileUtils.directoryContains(top, file));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUnrealizedContainment() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnrealizedContainment");
        final File dir = new File("foo");
        final File file = new File(dir , "DOESNOTEXIST2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2613,dir,2612,dir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2615,file,2614,file.exists());
        try {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2617,null,2616,org.apache.commons.io.FileUtils.directoryContains(dir, file));
        } catch (IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUnrealizedContainment_literalMutation4839() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnrealizedContainment_literalMutation4839");
        final File dir = new File("DOESNOTEXIST");
        final File file = new File(dir , "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2613,dir,2612,dir.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2615,file,2614,file.exists());
        try {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2617,null,2616,org.apache.commons.io.FileUtils.directoryContains(dir, file));
        } catch (IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


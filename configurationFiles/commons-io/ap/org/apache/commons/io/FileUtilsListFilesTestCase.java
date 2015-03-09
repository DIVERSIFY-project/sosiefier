package org.apache.commons.io;

import java.util.ArrayList;
import java.util.Collection;
import java.io.File;
import org.apache.commons.io.testtools.FileBasedTestCase;
import org.apache.commons.io.filefilter.IOFileFilter;
import java.util.Iterator;
import org.junit.Test;

/** 
 * Test cases for FileUtils.listFiles() methods.
 */
public class FileUtilsListFilesTestCase extends FileBasedTestCase {
    public FileUtilsListFilesTestCase(String name) {
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
        File dir = getLocalTestDirectory();
        if (dir.exists()) {
            org.apache.commons.io.FileUtils.deleteDirectory(dir);
        } 
        dir.mkdirs();
        File file = new File(dir , "dummy-build.xml");
        org.apache.commons.io.FileUtils.touch(file);
        file = new File(dir , "README");
        org.apache.commons.io.FileUtils.touch(file);
        dir = new File(dir , "subdir1");
        dir.mkdirs();
        file = new File(dir , "dummy-build.xml");
        org.apache.commons.io.FileUtils.touch(file);
        file = new File(dir , "dummy-readme.txt");
        org.apache.commons.io.FileUtils.touch(file);
        dir = new File(dir , "subsubdir1");
        dir.mkdirs();
        file = new File(dir , "dummy-file.txt");
        org.apache.commons.io.FileUtils.touch(file);
        file = new File(dir , "dummy-index.html");
        org.apache.commons.io.FileUtils.touch(file);
        dir = dir.getParentFile();
        dir = new File(dir , "CVS");
        dir.mkdirs();
        file = new File(dir , "Entries");
        org.apache.commons.io.FileUtils.touch(file);
        file = new File(dir , "Repository");
        org.apache.commons.io.FileUtils.touch(file);
    }

    /** 
     * @see junit.framework.TestCase#tearDown()
     */
@Override
    protected void tearDown() throws Exception {
        File dir = getLocalTestDirectory();
        org.apache.commons.io.FileUtils.deleteDirectory(dir);
    }

    private Collection<java.lang.String> filesToFilenames(Collection<java.io.File> files) {
        Collection<java.lang.String> filenames = new ArrayList<java.lang.String>(files.size());
        for (File file : files) {
            filenames.add(file.getName());
        }
        return filenames;
    }

    private Collection<java.lang.String> filesToFilenames(Iterator<java.io.File> files) {
        Collection<java.lang.String> filenames = new ArrayList<java.lang.String>();
        while (files.hasNext()) {
            filenames.add(files.next().getName());
        }
        return filenames;
    }

    public void testIterateFilesByExtension() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterateFilesByExtension");
        String[] extensions = new String[]{ "foo" , "txt" };
        Iterator<java.io.File> files = org.apache.commons.io.FileUtils.iterateFiles(getLocalTestDirectory(), extensions, false);
        Collection<java.lang.String> filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2634,filenames,2633,filenames.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2636,filenames,2635,filenames.contains("dummy-build.xml"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2638,filenames,2637,filenames.contains("README"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2640,filenames,2639,filenames.contains("dummy-file.txt"));
        files = org.apache.commons.io.FileUtils.iterateFiles(getLocalTestDirectory(), extensions, true);
        filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2642,filenames,2641,filenames.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2644,filenames,2643,filenames.contains("dummy-file.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2646,filenames,2645,filenames.contains("dummy-index.html"));
        files = org.apache.commons.io.FileUtils.iterateFiles(getLocalTestDirectory(), null, false);
        filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2648,filenames,2647,filenames.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2650,filenames,2649,filenames.contains("dummy-build.xml"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2652,filenames,2651,filenames.contains("README"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2654,filenames,2653,filenames.contains("dummy-file.txt"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterateFilesByExtension_literalMutation4862() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterateFilesByExtension_literalMutation4862");
        String[] extensions = new String[]{ "xml" , "foo" };
        Iterator<java.io.File> files = org.apache.commons.io.FileUtils.iterateFiles(getLocalTestDirectory(), extensions, false);
        Collection<java.lang.String> filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2634,filenames,2633,filenames.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2636,filenames,2635,filenames.contains("dummy-build.xml"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2638,filenames,2637,filenames.contains("README"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2640,filenames,2639,filenames.contains("dummy-file.txt"));
        files = org.apache.commons.io.FileUtils.iterateFiles(getLocalTestDirectory(), extensions, true);
        filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2642,filenames,2641,filenames.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2644,filenames,2643,filenames.contains("dummy-file.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2646,filenames,2645,filenames.contains("dummy-index.html"));
        files = org.apache.commons.io.FileUtils.iterateFiles(getLocalTestDirectory(), null, false);
        filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2648,filenames,2647,filenames.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2650,filenames,2649,filenames.contains("dummy-build.xml"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2652,filenames,2651,filenames.contains("README"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2654,filenames,2653,filenames.contains("dummy-file.txt"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterateFilesByExtension_literalMutation4863() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterateFilesByExtension_literalMutation4863");
        String[] extensions = new String[]{ "xml" , "txt" };
        Iterator<java.io.File> files = org.apache.commons.io.FileUtils.iterateFiles(getLocalTestDirectory(), extensions, true);
        Collection<java.lang.String> filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2634,filenames,2633,filenames.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2636,filenames,2635,filenames.contains("dummy-build.xml"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2638,filenames,2637,filenames.contains("README"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2640,filenames,2639,filenames.contains("dummy-file.txt"));
        files = org.apache.commons.io.FileUtils.iterateFiles(getLocalTestDirectory(), extensions, true);
        filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2642,filenames,2641,filenames.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2644,filenames,2643,filenames.contains("dummy-file.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2646,filenames,2645,filenames.contains("dummy-index.html"));
        files = org.apache.commons.io.FileUtils.iterateFiles(getLocalTestDirectory(), null, false);
        filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2648,filenames,2647,filenames.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2650,filenames,2649,filenames.contains("dummy-build.xml"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2652,filenames,2651,filenames.contains("README"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2654,filenames,2653,filenames.contains("dummy-file.txt"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterateFilesByExtension_literalMutation4864() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterateFilesByExtension_literalMutation4864");
        String[] extensions = new String[]{ "xml" , "txt" };
        Iterator<java.io.File> files = org.apache.commons.io.FileUtils.iterateFiles(getLocalTestDirectory(), extensions, false);
        Collection<java.lang.String> filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2634,filenames,2633,filenames.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2636,filenames,2635,filenames.contains("dummy-build.xml"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2638,filenames,2637,filenames.contains("README"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2640,filenames,2639,filenames.contains("dummy-file.txt"));
        files = org.apache.commons.io.FileUtils.iterateFiles(getLocalTestDirectory(), extensions, false);
        filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2642,filenames,2641,filenames.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2644,filenames,2643,filenames.contains("dummy-file.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2646,filenames,2645,filenames.contains("dummy-index.html"));
        files = org.apache.commons.io.FileUtils.iterateFiles(getLocalTestDirectory(), null, false);
        filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2648,filenames,2647,filenames.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2650,filenames,2649,filenames.contains("dummy-build.xml"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2652,filenames,2651,filenames.contains("README"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2654,filenames,2653,filenames.contains("dummy-file.txt"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterateFilesByExtension_literalMutation4866() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterateFilesByExtension_literalMutation4866");
        String[] extensions = new String[]{ "xml" , "txt" };
        Iterator<java.io.File> files = org.apache.commons.io.FileUtils.iterateFiles(getLocalTestDirectory(), extensions, false);
        Collection<java.lang.String> filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2634,filenames,2633,filenames.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2636,filenames,2635,filenames.contains("dummy-build.xml"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2638,filenames,2637,filenames.contains("README"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2640,filenames,2639,filenames.contains("dummy-file.txt"));
        files = org.apache.commons.io.FileUtils.iterateFiles(getLocalTestDirectory(), extensions, true);
        filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2642,filenames,2641,filenames.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2644,filenames,2643,filenames.contains("dummy-file.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2646,filenames,2645,filenames.contains("dummy-index.html"));
        files = org.apache.commons.io.FileUtils.iterateFiles(getLocalTestDirectory(), null, true);
        filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2648,filenames,2647,filenames.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2650,filenames,2649,filenames.contains("dummy-build.xml"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2652,filenames,2651,filenames.contains("README"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2654,filenames,2653,filenames.contains("dummy-file.txt"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testListFilesByExtension() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListFilesByExtension");
        String[] extensions = new String[]{ "bar" , "txt" };
        Collection<java.io.File> files = org.apache.commons.io.FileUtils.listFiles(getLocalTestDirectory(), extensions, false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2656,files,2655,files.size());
        Collection<java.lang.String> filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2658,filenames,2657,filenames.contains("dummy-build.xml"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2660,filenames,2659,filenames.contains("README"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2662,filenames,2661,filenames.contains("dummy-file.txt"));
        files = org.apache.commons.io.FileUtils.listFiles(getLocalTestDirectory(), extensions, true);
        filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2664,filenames,2663,filenames.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2666,filenames,2665,filenames.contains("dummy-file.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2668,filenames,2667,filenames.contains("dummy-index.html"));
        files = org.apache.commons.io.FileUtils.listFiles(getLocalTestDirectory(), null, false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2670,files,2669,files.size());
        filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2672,filenames,2671,filenames.contains("dummy-build.xml"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2674,filenames,2673,filenames.contains("README"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2676,filenames,2675,filenames.contains("dummy-file.txt"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testListFilesByExtension_literalMutation4874() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListFilesByExtension_literalMutation4874");
        String[] extensions = new String[]{ "xml" , "bar" };
        Collection<java.io.File> files = org.apache.commons.io.FileUtils.listFiles(getLocalTestDirectory(), extensions, false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2656,files,2655,files.size());
        Collection<java.lang.String> filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2658,filenames,2657,filenames.contains("dummy-build.xml"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2660,filenames,2659,filenames.contains("README"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2662,filenames,2661,filenames.contains("dummy-file.txt"));
        files = org.apache.commons.io.FileUtils.listFiles(getLocalTestDirectory(), extensions, true);
        filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2664,filenames,2663,filenames.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2666,filenames,2665,filenames.contains("dummy-file.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2668,filenames,2667,filenames.contains("dummy-index.html"));
        files = org.apache.commons.io.FileUtils.listFiles(getLocalTestDirectory(), null, false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2670,files,2669,files.size());
        filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2672,filenames,2671,filenames.contains("dummy-build.xml"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2674,filenames,2673,filenames.contains("README"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2676,filenames,2675,filenames.contains("dummy-file.txt"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testListFilesByExtension_literalMutation4875() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListFilesByExtension_literalMutation4875");
        String[] extensions = new String[]{ "xml" , "txt" };
        Collection<java.io.File> files = org.apache.commons.io.FileUtils.listFiles(getLocalTestDirectory(), extensions, true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2656,files,2655,files.size());
        Collection<java.lang.String> filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2658,filenames,2657,filenames.contains("dummy-build.xml"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2660,filenames,2659,filenames.contains("README"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2662,filenames,2661,filenames.contains("dummy-file.txt"));
        files = org.apache.commons.io.FileUtils.listFiles(getLocalTestDirectory(), extensions, true);
        filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2664,filenames,2663,filenames.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2666,filenames,2665,filenames.contains("dummy-file.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2668,filenames,2667,filenames.contains("dummy-index.html"));
        files = org.apache.commons.io.FileUtils.listFiles(getLocalTestDirectory(), null, false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2670,files,2669,files.size());
        filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2672,filenames,2671,filenames.contains("dummy-build.xml"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2674,filenames,2673,filenames.contains("README"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2676,filenames,2675,filenames.contains("dummy-file.txt"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testListFilesByExtension_literalMutation4876() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListFilesByExtension_literalMutation4876");
        String[] extensions = new String[]{ "xml" , "txt" };
        Collection<java.io.File> files = org.apache.commons.io.FileUtils.listFiles(getLocalTestDirectory(), extensions, false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2656,files,2655,files.size());
        Collection<java.lang.String> filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2658,filenames,2657,filenames.contains("dummy-build.xml"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2660,filenames,2659,filenames.contains("README"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2662,filenames,2661,filenames.contains("dummy-file.txt"));
        files = org.apache.commons.io.FileUtils.listFiles(getLocalTestDirectory(), extensions, false);
        filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2664,filenames,2663,filenames.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2666,filenames,2665,filenames.contains("dummy-file.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2668,filenames,2667,filenames.contains("dummy-index.html"));
        files = org.apache.commons.io.FileUtils.listFiles(getLocalTestDirectory(), null, false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2670,files,2669,files.size());
        filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2672,filenames,2671,filenames.contains("dummy-build.xml"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2674,filenames,2673,filenames.contains("README"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2676,filenames,2675,filenames.contains("dummy-file.txt"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testListFilesByExtension_literalMutation4878() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListFilesByExtension_literalMutation4878");
        String[] extensions = new String[]{ "xml" , "txt" };
        Collection<java.io.File> files = org.apache.commons.io.FileUtils.listFiles(getLocalTestDirectory(), extensions, false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2656,files,2655,files.size());
        Collection<java.lang.String> filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2658,filenames,2657,filenames.contains("dummy-build.xml"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2660,filenames,2659,filenames.contains("README"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2662,filenames,2661,filenames.contains("dummy-file.txt"));
        files = org.apache.commons.io.FileUtils.listFiles(getLocalTestDirectory(), extensions, true);
        filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2664,filenames,2663,filenames.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2666,filenames,2665,filenames.contains("dummy-file.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2668,filenames,2667,filenames.contains("dummy-index.html"));
        files = org.apache.commons.io.FileUtils.listFiles(getLocalTestDirectory(), null, true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2670,files,2669,files.size());
        filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2672,filenames,2671,filenames.contains("dummy-build.xml"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2674,filenames,2673,filenames.contains("README"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2676,filenames,2675,filenames.contains("dummy-file.txt"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testListFiles_add1346() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListFiles_add1346");
        Collection<java.io.File> files;
        Collection<java.lang.String> filenames;
        IOFileFilter fileFilter;
        IOFileFilter dirFilter;
        fileFilter = org.apache.commons.io.filefilter.FileFilterUtils.trueFileFilter();
        files = org.apache.commons.io.FileUtils.listFiles(getLocalTestDirectory(), fileFilter, ((IOFileFilter)(null)));
        filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2678,filenames,2677,filenames.contains("dummy-build.xml"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2680,filenames,2679,filenames.contains("dummy-index.html"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2682,filenames,2681,filenames.contains("Entries"));
        fileFilter = org.apache.commons.io.filefilter.FileFilterUtils.trueFileFilter();
        dirFilter = org.apache.commons.io.filefilter.FileFilterUtils.notFileFilter(org.apache.commons.io.filefilter.FileFilterUtils.nameFileFilter("CVS"));
        files = org.apache.commons.io.FileUtils.listFiles(getLocalTestDirectory(), fileFilter, dirFilter);
        filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2684,filenames,2683,filenames.contains("dummy-build.xml"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2686,filenames,2685,filenames.contains("dummy-index.html"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2688,filenames,2687,filenames.contains("Entries"));
        fileFilter = org.apache.commons.io.filefilter.FileFilterUtils.trueFileFilter();
        dirFilter = org.apache.commons.io.filefilter.FileFilterUtils.makeCVSAware(null);
        files = org.apache.commons.io.FileUtils.listFiles(getLocalTestDirectory(), fileFilter, dirFilter);
        filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2690,filenames,2689,filenames.contains("dummy-build.xml"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2692,filenames,2691,filenames.contains("dummy-index.html"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2694,filenames,2693,filenames.contains("Entries"));
        fileFilter = org.apache.commons.io.filefilter.FileFilterUtils.trueFileFilter();
        dirFilter = org.apache.commons.io.filefilter.FileFilterUtils.prefixFileFilter("sub");
        dirFilter = org.apache.commons.io.filefilter.FileFilterUtils.makeCVSAware(dirFilter);
        files = org.apache.commons.io.FileUtils.listFiles(getLocalTestDirectory(), fileFilter, dirFilter);
        filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2696,filenames,2695,filenames.contains("dummy-build.xml"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2698,filenames,2697,filenames.contains("dummy-index.html"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2700,filenames,2699,filenames.contains("Entries"));
        try {
            org.apache.commons.io.FileUtils.listFiles(getLocalTestDirectory(), ((IOFileFilter)(null)), ((IOFileFilter)(null)));
            org.apache.commons.io.FileUtils.listFiles(getLocalTestDirectory(), ((IOFileFilter)(null)), ((IOFileFilter)(null)));
        } catch (NullPointerException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testListFiles() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListFiles");
        Collection<java.io.File> files;
        Collection<java.lang.String> filenames;
        IOFileFilter fileFilter;
        IOFileFilter dirFilter;
        fileFilter = org.apache.commons.io.filefilter.FileFilterUtils.trueFileFilter();
        files = org.apache.commons.io.FileUtils.listFiles(getLocalTestDirectory(), fileFilter, ((IOFileFilter)(null)));
        filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2678,filenames,2677,filenames.contains("dummy-build.xml"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2680,filenames,2679,filenames.contains("dummy-index.html"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2682,filenames,2681,filenames.contains("Entries"));
        fileFilter = org.apache.commons.io.filefilter.FileFilterUtils.trueFileFilter();
        dirFilter = org.apache.commons.io.filefilter.FileFilterUtils.notFileFilter(org.apache.commons.io.filefilter.FileFilterUtils.nameFileFilter("bar"));
        files = org.apache.commons.io.FileUtils.listFiles(getLocalTestDirectory(), fileFilter, dirFilter);
        filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2684,filenames,2683,filenames.contains("dummy-build.xml"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2686,filenames,2685,filenames.contains("dummy-index.html"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2688,filenames,2687,filenames.contains("Entries"));
        fileFilter = org.apache.commons.io.filefilter.FileFilterUtils.trueFileFilter();
        dirFilter = org.apache.commons.io.filefilter.FileFilterUtils.makeCVSAware(null);
        files = org.apache.commons.io.FileUtils.listFiles(getLocalTestDirectory(), fileFilter, dirFilter);
        filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2690,filenames,2689,filenames.contains("dummy-build.xml"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2692,filenames,2691,filenames.contains("dummy-index.html"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2694,filenames,2693,filenames.contains("Entries"));
        fileFilter = org.apache.commons.io.filefilter.FileFilterUtils.trueFileFilter();
        dirFilter = org.apache.commons.io.filefilter.FileFilterUtils.prefixFileFilter("sub");
        dirFilter = org.apache.commons.io.filefilter.FileFilterUtils.makeCVSAware(dirFilter);
        files = org.apache.commons.io.FileUtils.listFiles(getLocalTestDirectory(), fileFilter, dirFilter);
        filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2696,filenames,2695,filenames.contains("dummy-build.xml"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2698,filenames,2697,filenames.contains("dummy-index.html"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2700,filenames,2699,filenames.contains("Entries"));
        try {
            org.apache.commons.io.FileUtils.listFiles(getLocalTestDirectory(), ((IOFileFilter)(null)), ((IOFileFilter)(null)));
        } catch (NullPointerException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testListFiles_literalMutation4870() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListFiles_literalMutation4870");
        Collection<java.io.File> files;
        Collection<java.lang.String> filenames;
        IOFileFilter fileFilter;
        IOFileFilter dirFilter;
        fileFilter = org.apache.commons.io.filefilter.FileFilterUtils.trueFileFilter();
        files = org.apache.commons.io.FileUtils.listFiles(getLocalTestDirectory(), fileFilter, ((IOFileFilter)(null)));
        filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2678,filenames,2677,filenames.contains("dummy-build.xml"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2680,filenames,2679,filenames.contains("dummy-index.html"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2682,filenames,2681,filenames.contains("Entries"));
        fileFilter = org.apache.commons.io.filefilter.FileFilterUtils.trueFileFilter();
        dirFilter = org.apache.commons.io.filefilter.FileFilterUtils.notFileFilter(org.apache.commons.io.filefilter.FileFilterUtils.nameFileFilter("CVS"));
        files = org.apache.commons.io.FileUtils.listFiles(getLocalTestDirectory(), fileFilter, dirFilter);
        filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2684,filenames,2683,filenames.contains("dummy-build.xml"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2686,filenames,2685,filenames.contains("dummy-index.html"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2688,filenames,2687,filenames.contains("Entries"));
        fileFilter = org.apache.commons.io.filefilter.FileFilterUtils.trueFileFilter();
        dirFilter = org.apache.commons.io.filefilter.FileFilterUtils.makeCVSAware(null);
        files = org.apache.commons.io.FileUtils.listFiles(getLocalTestDirectory(), fileFilter, dirFilter);
        filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2690,filenames,2689,filenames.contains("dummy-build.xml"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2692,filenames,2691,filenames.contains("dummy-index.html"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2694,filenames,2693,filenames.contains("Entries"));
        fileFilter = org.apache.commons.io.filefilter.FileFilterUtils.trueFileFilter();
        dirFilter = org.apache.commons.io.filefilter.FileFilterUtils.prefixFileFilter("bar");
        dirFilter = org.apache.commons.io.filefilter.FileFilterUtils.makeCVSAware(dirFilter);
        files = org.apache.commons.io.FileUtils.listFiles(getLocalTestDirectory(), fileFilter, dirFilter);
        filenames = filesToFilenames(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2696,filenames,2695,filenames.contains("dummy-build.xml"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2698,filenames,2697,filenames.contains("dummy-index.html"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2700,filenames,2699,filenames.contains("Entries"));
        try {
            org.apache.commons.io.FileUtils.listFiles(getLocalTestDirectory(), ((IOFileFilter)(null)), ((IOFileFilter)(null)));
        } catch (NullPointerException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


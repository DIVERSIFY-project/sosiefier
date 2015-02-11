package org.apache.commons.io;

import java.util.ArrayList;
import java.util.Collection;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import org.apache.commons.io.filefilter.IOFileFilter;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.filefilter.NameFileFilter;
import org.apache.commons.io.filefilter.OrFileFilter;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * This is used to test DirectoryWalker for correctness when using Java4 (i.e. no generics).
 * 
 * @version $Id$
 * @see DirectoryWalker
 * 
 */
@SuppressWarnings(value = { "unchecked" , "rawtypes" })
public class DirectoryWalkerTestCaseJava4 extends TestCase {
    private static final File current = new File(".");

    private static final File javaDir = new File("src/main/java");

    private static final File orgDir = new File(javaDir , "org");

    private static final File apacheDir = new File(orgDir , "apache");

    private static final File commonsDir = new File(apacheDir , "commons");

    private static final File ioDir = new File(commonsDir , "io");

    private static final File outputDir = new File(ioDir , "output");

    private static final File[] dirs = new File[]{ orgDir , apacheDir , commonsDir , ioDir , outputDir };

    private static final File filenameUtils = new File(ioDir , "FilenameUtils.java");

    private static final File ioUtils = new File(ioDir , "IOUtils.java");

    private static final File proxyWriter = new File(outputDir , "ProxyWriter.java");

    private static final File nullStream = new File(outputDir , "NullOutputStream.java");

    private static final File[] ioFiles = new File[]{ filenameUtils , ioUtils };

    private static final File[] outputFiles = new File[]{ proxyWriter , nullStream };

    private static final IOFileFilter dirsFilter = DirectoryWalkerTestCaseJava4.createNameFilter(dirs);

    private static final IOFileFilter iofilesFilter = DirectoryWalkerTestCaseJava4.createNameFilter(ioFiles);

    private static final IOFileFilter outputFilesFilter = DirectoryWalkerTestCaseJava4.createNameFilter(outputFiles);

    private static final IOFileFilter ioDirAndFilesFilter = new OrFileFilter(dirsFilter , iofilesFilter);

    private static final IOFileFilter dirsAndFilesFilter = new OrFileFilter(ioDirAndFilesFilter , outputFilesFilter);

    private static final IOFileFilter NOT_SVN = org.apache.commons.io.filefilter.FileFilterUtils.makeSVNAware(null);

    /** 
     * Construct the TestCase using the name
     */
public DirectoryWalkerTestCaseJava4(String name) {
        super(name);
    }

    /** 
     * Set Up
     */
@Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    /** 
     * Tear Down
     */
@Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /** 
     * Test Filtering
     */
public void testFilter() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilter");
        List results = new TestFileFinder(dirsAndFilesFilter , -1).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,(((1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.outputFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1934,results,1933,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,results,2047,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("Dir", dirs, results);
        checkContainsFiles("IO File", ioFiles, results);
        checkContainsFiles("Output File", outputFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering
     */
@Test(timeout = 1000)
    public void testFilter_add1201() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilter_add1201");
        List results = new TestFileFinder(dirsAndFilesFilter , -1).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,(((1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.outputFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1934,results,1933,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,results,2047,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("Dir", dirs, results);
        checkContainsFiles("Dir", dirs, results);
        checkContainsFiles("IO File", ioFiles, results);
        checkContainsFiles("Output File", outputFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering
     */
@Test(timeout = 1000)
    public void testFilter_add1202() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilter_add1202");
        List results = new TestFileFinder(dirsAndFilesFilter , -1).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,(((1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.outputFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1934,results,1933,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,results,2047,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("Dir", dirs, results);
        checkContainsFiles("IO File", ioFiles, results);
        checkContainsFiles("IO File", ioFiles, results);
        checkContainsFiles("Output File", outputFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering
     */
@Test(timeout = 1000)
    public void testFilter_add1203() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilter_add1203");
        List results = new TestFileFinder(dirsAndFilesFilter , -1).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,(((1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.outputFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1934,results,1933,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,results,2047,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("Dir", dirs, results);
        checkContainsFiles("IO File", ioFiles, results);
        checkContainsFiles("Output File", outputFiles, results);
        checkContainsFiles("Output File", outputFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering
     */
public void testFilter_literalMutation2639() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilter_literalMutation2639");
        List results = new TestFileFinder(dirsAndFilesFilter , 0).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,(((1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.outputFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1934,results,1933,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,results,2047,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("Dir", dirs, results);
        checkContainsFiles("IO File", ioFiles, results);
        checkContainsFiles("Output File", outputFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering
     */
public void testFilter_literalMutation2640() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilter_literalMutation2640");
        List results = new TestFileFinder(dirsAndFilesFilter , -1).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,(((1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.outputFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1934,results,1933,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,results,2047,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("foo", dirs, results);
        checkContainsFiles("IO File", ioFiles, results);
        checkContainsFiles("Output File", outputFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering
     */
public void testFilter_literalMutation2641() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilter_literalMutation2641");
        List results = new TestFileFinder(dirsAndFilesFilter , -1).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,(((1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.outputFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1934,results,1933,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,results,2047,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("Dir", dirs, results);
        checkContainsFiles("foo", ioFiles, results);
        checkContainsFiles("Output File", outputFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering
     */
public void testFilter_literalMutation2642() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilter_literalMutation2642");
        List results = new TestFileFinder(dirsAndFilesFilter , -1).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,(((1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.outputFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1934,results,1933,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,results,2047,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("Dir", dirs, results);
        checkContainsFiles("IO File", ioFiles, results);
        checkContainsFiles("foo", outputFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering
     */
@Test(timeout = 1000)
    public void testFilter_remove932() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilter_remove932");
        List results = new TestFileFinder(dirsAndFilesFilter , -1).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,(((1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.outputFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1934,results,1933,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,results,2047,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("IO File", ioFiles, results);
        checkContainsFiles("Output File", outputFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering
     */
@Test(timeout = 1000)
    public void testFilter_remove933() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilter_remove933");
        List results = new TestFileFinder(dirsAndFilesFilter , -1).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,(((1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.outputFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1934,results,1933,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,results,2047,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("IO File", ioFiles, results);
        checkContainsFiles("Output File", outputFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering
     */
@Test(timeout = 1000)
    public void testFilter_remove934() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilter_remove934");
        List results = new TestFileFinder(dirsAndFilesFilter , -1).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,(((1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.outputFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1934,results,1933,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,results,2047,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("IO File", ioFiles, results);
        checkContainsFiles("Output File", outputFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering and limit to depth 0
     */
public void testFilterAndLimitA() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterAndLimitA");
        List results = new TestFileFinder(NOT_SVN , 0).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,results,2049,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,results,2051,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering and limit to depth 0
     */
public void testFilterAndLimitA_literalMutation2643() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterAndLimitA_literalMutation2643");
        List results = new TestFileFinder(NOT_SVN , -1).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,results,2049,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,results,2051,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering and limit to depth 1
     */
public void testFilterAndLimitB() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterAndLimitB");
        List results = new TestFileFinder(NOT_SVN , 1).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1944,results,1943,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2054,results,2053,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2056,results,2055,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.orgDir));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering and limit to depth 1
     */
public void testFilterAndLimitB_literalMutation2644() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterAndLimitB_literalMutation2644");
        List results = new TestFileFinder(NOT_SVN , 0).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1944,results,1943,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2054,results,2053,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2056,results,2055,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.orgDir));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering and limit to depth 3
     */
public void testFilterAndLimitC() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterAndLimitC");
        List results = new TestFileFinder(NOT_SVN , 3).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2058,results,2057,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2060,results,2059,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2062,results,2061,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.orgDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2064,results,2063,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.apacheDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2066,results,2065,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.commonsDir));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering and limit to depth 3
     */
public void testFilterAndLimitC_literalMutation2645() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterAndLimitC_literalMutation2645");
        List results = new TestFileFinder(NOT_SVN , 4).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2058,results,2057,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2060,results,2059,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2062,results,2061,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.orgDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2064,results,2063,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.apacheDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2066,results,2065,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.commonsDir));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering and limit to depth 5
     */
public void testFilterAndLimitD() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterAndLimitD");
        List results = new TestFileFinder(dirsAndFilesFilter , 5).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2067,((1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2069,results,2068,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2071,results,2070,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("[D] Dir", dirs, results);
        checkContainsFiles("[D] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering and limit to depth 5
     */
@Test(timeout = 1000)
    public void testFilterAndLimitD_add1204() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterAndLimitD_add1204");
        List results = new TestFileFinder(dirsAndFilesFilter , 5).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2067,((1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2069,results,2068,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2071,results,2070,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("[D] Dir", dirs, results);
        checkContainsFiles("[D] Dir", dirs, results);
        checkContainsFiles("[D] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering and limit to depth 5
     */
@Test(timeout = 1000)
    public void testFilterAndLimitD_add1205() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterAndLimitD_add1205");
        List results = new TestFileFinder(dirsAndFilesFilter , 5).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2067,((1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2069,results,2068,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2071,results,2070,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("[D] Dir", dirs, results);
        checkContainsFiles("[D] File", ioFiles, results);
        checkContainsFiles("[D] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering and limit to depth 5
     */
public void testFilterAndLimitD_literalMutation2646() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterAndLimitD_literalMutation2646");
        List results = new TestFileFinder(dirsAndFilesFilter , 4).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2067,((1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2069,results,2068,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2071,results,2070,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("[D] Dir", dirs, results);
        checkContainsFiles("[D] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering and limit to depth 5
     */
public void testFilterAndLimitD_literalMutation2647() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterAndLimitD_literalMutation2647");
        List results = new TestFileFinder(dirsAndFilesFilter , 5).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2067,((1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2069,results,2068,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2071,results,2070,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("foo", dirs, results);
        checkContainsFiles("[D] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering and limit to depth 5
     */
public void testFilterAndLimitD_literalMutation2648() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterAndLimitD_literalMutation2648");
        List results = new TestFileFinder(dirsAndFilesFilter , 5).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2067,((1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2069,results,2068,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2071,results,2070,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("[D] Dir", dirs, results);
        checkContainsFiles("foo", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering and limit to depth 5
     */
@Test(timeout = 1000)
    public void testFilterAndLimitD_remove935() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterAndLimitD_remove935");
        List results = new TestFileFinder(dirsAndFilesFilter , 5).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2067,((1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2069,results,2068,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2071,results,2070,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("[D] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering and limit to depth 5
     */
@Test(timeout = 1000)
    public void testFilterAndLimitD_remove936() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterAndLimitD_remove936");
        List results = new TestFileFinder(dirsAndFilesFilter , 5).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2067,((1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2069,results,2068,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2071,results,2070,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("[D] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
public void testFilterDirAndFile1() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile1");
        List results = new TestFileFinder(dirsFilter , iofilesFilter , -1).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2072,((1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2074,results,2073,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2076,results,2075,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("[DirAndFile1] Dir", dirs, results);
        checkContainsFiles("[DirAndFile1] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test(timeout = 1000)
    public void testFilterDirAndFile1_add1206() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile1_add1206");
        List results = new TestFileFinder(dirsFilter , iofilesFilter , -1).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2072,((1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2074,results,2073,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2076,results,2075,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("[DirAndFile1] Dir", dirs, results);
        checkContainsFiles("[DirAndFile1] Dir", dirs, results);
        checkContainsFiles("[DirAndFile1] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test(timeout = 1000)
    public void testFilterDirAndFile1_add1207() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile1_add1207");
        List results = new TestFileFinder(dirsFilter , iofilesFilter , -1).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2072,((1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2074,results,2073,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2076,results,2075,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("[DirAndFile1] Dir", dirs, results);
        checkContainsFiles("[DirAndFile1] File", ioFiles, results);
        checkContainsFiles("[DirAndFile1] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
public void testFilterDirAndFile1_literalMutation2649() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile1_literalMutation2649");
        List results = new TestFileFinder(dirsFilter , iofilesFilter , 2).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2072,((1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2074,results,2073,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2076,results,2075,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("[DirAndFile1] Dir", dirs, results);
        checkContainsFiles("[DirAndFile1] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
public void testFilterDirAndFile1_literalMutation2650() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile1_literalMutation2650");
        List results = new TestFileFinder(dirsFilter , iofilesFilter , -1).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2072,((1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2074,results,2073,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2076,results,2075,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("foo", dirs, results);
        checkContainsFiles("[DirAndFile1] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
public void testFilterDirAndFile1_literalMutation2651() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile1_literalMutation2651");
        List results = new TestFileFinder(dirsFilter , iofilesFilter , -1).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2072,((1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2074,results,2073,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2076,results,2075,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("[DirAndFile1] Dir", dirs, results);
        checkContainsFiles("foo", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test(timeout = 1000)
    public void testFilterDirAndFile1_remove937() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile1_remove937");
        List results = new TestFileFinder(dirsFilter , iofilesFilter , -1).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2072,((1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2074,results,2073,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2076,results,2075,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("[DirAndFile1] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test(timeout = 1000)
    public void testFilterDirAndFile1_remove938() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile1_remove938");
        List results = new TestFileFinder(dirsFilter , iofilesFilter , -1).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2072,((1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2074,results,2073,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2076,results,2075,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("[DirAndFile1] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
public void testFilterDirAndFile2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile2");
        List results = new TestFileFinder(((IOFileFilter)(null)) , ((IOFileFilter)(null)) , -1).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2077,((results.size()) > ((1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2079,results,2078,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("[DirAndFile2] Dir", dirs, results);
        checkContainsFiles("[DirAndFile2] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test(timeout = 1000)
    public void testFilterDirAndFile2_add1208() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile2_add1208");
        List results = new TestFileFinder(((IOFileFilter)(null)) , ((IOFileFilter)(null)) , -1).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2077,((results.size()) > ((1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2079,results,2078,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("[DirAndFile2] Dir", dirs, results);
        checkContainsFiles("[DirAndFile2] Dir", dirs, results);
        checkContainsFiles("[DirAndFile2] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test(timeout = 1000)
    public void testFilterDirAndFile2_add1209() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile2_add1209");
        List results = new TestFileFinder(((IOFileFilter)(null)) , ((IOFileFilter)(null)) , -1).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2077,((results.size()) > ((1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2079,results,2078,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("[DirAndFile2] Dir", dirs, results);
        checkContainsFiles("[DirAndFile2] File", ioFiles, results);
        checkContainsFiles("[DirAndFile2] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
public void testFilterDirAndFile2_literalMutation2654() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile2_literalMutation2654");
        List results = new TestFileFinder(((IOFileFilter)(null)) , ((IOFileFilter)(null)) , 2).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2077,((results.size()) > ((1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2079,results,2078,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("[DirAndFile2] Dir", dirs, results);
        checkContainsFiles("[DirAndFile2] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
public void testFilterDirAndFile2_literalMutation2655() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile2_literalMutation2655");
        List results = new TestFileFinder(((IOFileFilter)(null)) , ((IOFileFilter)(null)) , -1).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2077,((results.size()) > ((1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2079,results,2078,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("foo", dirs, results);
        checkContainsFiles("[DirAndFile2] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
public void testFilterDirAndFile2_literalMutation2656() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile2_literalMutation2656");
        List results = new TestFileFinder(((IOFileFilter)(null)) , ((IOFileFilter)(null)) , -1).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2077,((results.size()) > ((1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2079,results,2078,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("[DirAndFile2] Dir", dirs, results);
        checkContainsFiles("foo", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test(timeout = 1000)
    public void testFilterDirAndFile2_remove939() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile2_remove939");
        List results = new TestFileFinder(((IOFileFilter)(null)) , ((IOFileFilter)(null)) , -1).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2077,((results.size()) > ((1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2079,results,2078,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("[DirAndFile2] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test(timeout = 1000)
    public void testFilterDirAndFile2_remove940() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile2_remove940");
        List results = new TestFileFinder(((IOFileFilter)(null)) , ((IOFileFilter)(null)) , -1).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2077,((results.size()) > ((1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2079,results,2078,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("[DirAndFile2] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
public void testFilterDirAndFile3() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile3");
        List results = new TestFileFinder(dirsFilter , ((IOFileFilter)(null)) , -1).find(javaDir);
        List resultDirs = directoriesOnly(results);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2080,(1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2082,resultDirs,2081,resultDirs.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2084,results,2083,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("[DirAndFile3] Dir", dirs, resultDirs);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test(timeout = 1000)
    public void testFilterDirAndFile3_add1210() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile3_add1210");
        List results = new TestFileFinder(dirsFilter , ((IOFileFilter)(null)) , -1).find(javaDir);
        List resultDirs = directoriesOnly(results);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2080,(1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2082,resultDirs,2081,resultDirs.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2084,results,2083,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("[DirAndFile3] Dir", dirs, resultDirs);
        checkContainsFiles("[DirAndFile3] Dir", dirs, resultDirs);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
public void testFilterDirAndFile3_literalMutation2658() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile3_literalMutation2658");
        List results = new TestFileFinder(dirsFilter , ((IOFileFilter)(null)) , 2).find(javaDir);
        List resultDirs = directoriesOnly(results);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2080,(1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2082,resultDirs,2081,resultDirs.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2084,results,2083,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("[DirAndFile3] Dir", dirs, resultDirs);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
public void testFilterDirAndFile3_literalMutation2659() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile3_literalMutation2659");
        List results = new TestFileFinder(dirsFilter , ((IOFileFilter)(null)) , -1).find(javaDir);
        List resultDirs = directoriesOnly(results);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2080,(1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2082,resultDirs,2081,resultDirs.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2084,results,2083,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("foo", dirs, resultDirs);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test(timeout = 1000)
    public void testFilterDirAndFile3_remove941() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile3_remove941");
        List results = new TestFileFinder(dirsFilter , ((IOFileFilter)(null)) , -1).find(javaDir);
        List resultDirs = directoriesOnly(results);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2080,(1 + (org.apache.commons.io.DirectoryWalkerTestCaseJava4.dirs.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2082,resultDirs,2081,resultDirs.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2084,results,2083,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
public void testFilterDirAndFile4() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile4");
        List results = new TestFileFinder(((IOFileFilter)(null)) , iofilesFilter , -1).find(javaDir);
        List resultFiles = filesOnly(results);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2085,org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2087,resultFiles,2086,resultFiles.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2089,results,2088,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("[DirAndFile4] File", ioFiles, resultFiles);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test(timeout = 1000)
    public void testFilterDirAndFile4_add1211() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile4_add1211");
        List results = new TestFileFinder(((IOFileFilter)(null)) , iofilesFilter , -1).find(javaDir);
        List resultFiles = filesOnly(results);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2085,org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2087,resultFiles,2086,resultFiles.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2089,results,2088,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("[DirAndFile4] File", ioFiles, resultFiles);
        checkContainsFiles("[DirAndFile4] File", ioFiles, resultFiles);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
public void testFilterDirAndFile4_literalMutation2661() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile4_literalMutation2661");
        List results = new TestFileFinder(((IOFileFilter)(null)) , iofilesFilter , 0).find(javaDir);
        List resultFiles = filesOnly(results);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2085,org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2087,resultFiles,2086,resultFiles.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2089,results,2088,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("[DirAndFile4] File", ioFiles, resultFiles);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
public void testFilterDirAndFile4_literalMutation2662() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile4_literalMutation2662");
        List results = new TestFileFinder(((IOFileFilter)(null)) , iofilesFilter , -1).find(javaDir);
        List resultFiles = filesOnly(results);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2085,org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2087,resultFiles,2086,resultFiles.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2089,results,2088,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        checkContainsFiles("foo", ioFiles, resultFiles);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test(timeout = 1000)
    public void testFilterDirAndFile4_remove942() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile4_remove942");
        List results = new TestFileFinder(((IOFileFilter)(null)) , iofilesFilter , -1).find(javaDir);
        List resultFiles = filesOnly(results);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2085,org.apache.commons.io.DirectoryWalkerTestCaseJava4.ioFiles.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2087,resultFiles,2086,resultFiles.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2089,results,2088,results.contains(org.apache.commons.io.DirectoryWalkerTestCaseJava4.javaDir));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Limiting to current directory
     */
public void testLimitToCurrent() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLimitToCurrent");
        List results = new TestFileFinder(null , 0).find(current);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2093,results,2092,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2095,results,2094,results.contains(new java.io.File(".")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Limiting to current directory
     */
public void testLimitToCurrent_literalMutation2666() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLimitToCurrent_literalMutation2666");
        List results = new TestFileFinder(null , 1).find(current);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2093,results,2092,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2095,results,2094,results.contains(new java.io.File(".")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test an invalid start directory
     */
public void testMissingStartDirectory() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMissingStartDirectory");
        File invalidDir = new File("invalid-dir");
        List results = new TestFileFinder(null , -1).find(invalidDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2097,results,2096,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2099,results,2098,results.contains(invalidDir));
        try {
            new TestFileFinder(null , -1).find(null);
        } catch (NullPointerException ignore) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test an invalid start directory
     */
@Test(timeout = 1000)
    public void testMissingStartDirectory_add1212() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMissingStartDirectory_add1212");
        File invalidDir = new File("invalid-dir");
        List results = new TestFileFinder(null , -1).find(invalidDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2097,results,2096,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2099,results,2098,results.contains(invalidDir));
        try {
            new TestFileFinder(null , -1).find(null);
            new TestFileFinder(null , -1).find(null);
        } catch (NullPointerException ignore) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test an invalid start directory
     */
public void testMissingStartDirectory_literalMutation2667() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMissingStartDirectory_literalMutation2667");
        File invalidDir = new File("foo");
        List results = new TestFileFinder(null , -1).find(invalidDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2097,results,2096,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2099,results,2098,results.contains(invalidDir));
        try {
            new TestFileFinder(null , -1).find(null);
        } catch (NullPointerException ignore) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test an invalid start directory
     */
public void testMissingStartDirectory_literalMutation2669() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMissingStartDirectory_literalMutation2669");
        File invalidDir = new File("invalid-dir");
        List results = new TestFileFinder(null , 2).find(invalidDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2097,results,2096,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2099,results,2098,results.contains(invalidDir));
        try {
            new TestFileFinder(null , -1).find(null);
        } catch (NullPointerException ignore) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test an invalid start directory
     */
public void testMissingStartDirectory_literalMutation2671() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMissingStartDirectory_literalMutation2671");
        File invalidDir = new File("invalid-dir");
        List results = new TestFileFinder(null , -1).find(invalidDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2097,results,2096,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2099,results,2098,results.contains(invalidDir));
        try {
            new TestFileFinder(null , 2).find(null);
        } catch (NullPointerException ignore) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test an invalid start directory
     */
public void testHandleStartDirectoryFalse() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHandleStartDirectoryFalse");
        List results = new TestFalseFileFinder(null , -1).find(current);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2091,results,2090,results.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test an invalid start directory
     */
public void testHandleStartDirectoryFalse_literalMutation2664() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHandleStartDirectoryFalse_literalMutation2664");
        List results = new TestFalseFileFinder(null , 0).find(current);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2091,results,2090,results.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Check the files in the array are in the results list.
     */
private void checkContainsFiles(String prefix, File[] files, Collection results) {
        for (int i = 0 ; i < (files.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,((((prefix + "[") + i) + "] ") + (files[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,results,2021,results.contains(files[i]));
        }
    }

    /** 
     * Extract the directories.
     */
private List directoriesOnly(Collection results) {
        List list = new ArrayList(results.size());
        for (Iterator it = results.iterator() ; it.hasNext() ; ) {
            File file = ((File)(it.next()));
            if (file.isDirectory()) {
                list.add(file);
            } 
        }
        return list;
    }

    /** 
     * Extract the files.
     */
private List filesOnly(Collection results) {
        List list = new ArrayList(results.size());
        for (Iterator it = results.iterator() ; it.hasNext() ; ) {
            File file = ((File)(it.next()));
            if (file.isFile()) {
                list.add(file);
            } 
        }
        return list;
    }

    /** 
     * Create an name filter containg the names of the files
     * in the array.
     */
private static IOFileFilter createNameFilter(File[] files) {
        String[] names = new String[files.length];
        for (int i = 0 ; i < (files.length) ; i++) {
            names[i] = files[i].getName();
        }
        return new NameFileFilter(names);
    }

    /** 
     * Test Cancel
     */
public void testCancel() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCancel");
        String cancelName = null;
        try {
            cancelName = "DirectoryWalker.java";
            new TestCancelWalker(cancelName , false).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2025,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2027,cancel.getFile(),2026,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2028,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2030,cancel,2029,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2031,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            new TestCancelWalker(cancelName , false).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2033,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2034,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2036,cancel.getFile(),2035,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2037,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2039,cancel,2038,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2040,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            List results = new TestCancelWalker(cancelName , true).find(javaDir);
            File lastFile = ((File)(results.get(((results.size()) - 1))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2041,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,lastFile,2043,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2045,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
@Test(timeout = 1000)
    public void testCancel_add1199() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCancel_add1199");
        String cancelName = null;
        try {
            cancelName = "DirectoryWalker.java";
            new TestCancelWalker(cancelName , false).find(javaDir);
            new TestCancelWalker(cancelName , false).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2025,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2027,cancel.getFile(),2026,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2028,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2030,cancel,2029,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2031,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            new TestCancelWalker(cancelName , false).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2033,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2034,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2036,cancel.getFile(),2035,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2037,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2039,cancel,2038,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2040,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            List results = new TestCancelWalker(cancelName , true).find(javaDir);
            File lastFile = ((File)(results.get(((results.size()) - 1))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2041,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,lastFile,2043,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2045,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
@Test(timeout = 1000)
    public void testCancel_add1200() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCancel_add1200");
        String cancelName = null;
        try {
            cancelName = "DirectoryWalker.java";
            new TestCancelWalker(cancelName , false).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2025,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2027,cancel.getFile(),2026,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2028,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2030,cancel,2029,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2031,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            new TestCancelWalker(cancelName , false).find(javaDir);
            new TestCancelWalker(cancelName , false).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2033,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2034,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2036,cancel.getFile(),2035,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2037,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2039,cancel,2038,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2040,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            List results = new TestCancelWalker(cancelName , true).find(javaDir);
            File lastFile = ((File)(results.get(((results.size()) - 1))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2041,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,lastFile,2043,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2045,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
public void testCancel_literalMutation2633() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCancel_literalMutation2633");
        String cancelName = null;
        try {
            cancelName = "foo";
            new TestCancelWalker(cancelName , false).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2025,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2027,cancel.getFile(),2026,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2028,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2030,cancel,2029,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2031,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            new TestCancelWalker(cancelName , false).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2033,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2034,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2036,cancel.getFile(),2035,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2037,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2039,cancel,2038,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2040,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            List results = new TestCancelWalker(cancelName , true).find(javaDir);
            File lastFile = ((File)(results.get(((results.size()) - 1))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2041,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,lastFile,2043,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2045,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
public void testCancel_literalMutation2634() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCancel_literalMutation2634");
        String cancelName = null;
        try {
            cancelName = "DirectoryWalker.java";
            new TestCancelWalker(cancelName , true).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2025,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2027,cancel.getFile(),2026,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2028,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2030,cancel,2029,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2031,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            new TestCancelWalker(cancelName , false).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2033,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2034,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2036,cancel.getFile(),2035,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2037,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2039,cancel,2038,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2040,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            List results = new TestCancelWalker(cancelName , true).find(javaDir);
            File lastFile = ((File)(results.get(((results.size()) - 1))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2041,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,lastFile,2043,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2045,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
public void testCancel_literalMutation2635() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCancel_literalMutation2635");
        String cancelName = null;
        try {
            cancelName = "DirectoryWalker.java";
            new TestCancelWalker(cancelName , false).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2025,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2027,cancel.getFile(),2026,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2028,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2030,cancel,2029,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2031,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "foo";
            new TestCancelWalker(cancelName , false).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2033,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2034,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2036,cancel.getFile(),2035,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2037,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2039,cancel,2038,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2040,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            List results = new TestCancelWalker(cancelName , true).find(javaDir);
            File lastFile = ((File)(results.get(((results.size()) - 1))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2041,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,lastFile,2043,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2045,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
public void testCancel_literalMutation2636() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCancel_literalMutation2636");
        String cancelName = null;
        try {
            cancelName = "DirectoryWalker.java";
            new TestCancelWalker(cancelName , false).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2025,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2027,cancel.getFile(),2026,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2028,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2030,cancel,2029,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2031,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            new TestCancelWalker(cancelName , true).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2033,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2034,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2036,cancel.getFile(),2035,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2037,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2039,cancel,2038,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2040,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            List results = new TestCancelWalker(cancelName , true).find(javaDir);
            File lastFile = ((File)(results.get(((results.size()) - 1))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2041,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,lastFile,2043,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2045,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
public void testCancel_literalMutation2637() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCancel_literalMutation2637");
        String cancelName = null;
        try {
            cancelName = "DirectoryWalker.java";
            new TestCancelWalker(cancelName , false).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2025,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2027,cancel.getFile(),2026,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2028,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2030,cancel,2029,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2031,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            new TestCancelWalker(cancelName , false).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2033,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2034,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2036,cancel.getFile(),2035,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2037,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2039,cancel,2038,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2040,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            List results = new TestCancelWalker(cancelName , true).find(javaDir);
            File lastFile = ((File)(results.get(((results.size()) - 1))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2041,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,lastFile,2043,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2045,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
public void testCancel_literalMutation2638() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCancel_literalMutation2638");
        String cancelName = null;
        try {
            cancelName = "DirectoryWalker.java";
            new TestCancelWalker(cancelName , false).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2025,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2027,cancel.getFile(),2026,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2028,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2030,cancel,2029,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2031,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            new TestCancelWalker(cancelName , false).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2033,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2034,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2036,cancel.getFile(),2035,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2037,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2039,cancel,2038,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2040,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            List results = new TestCancelWalker(cancelName , true).find(javaDir);
            File lastFile = ((File)(results.get(((results.size()) - 0))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2041,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,lastFile,2043,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2045,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
public void testMultiThreadCancel() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadCancel");
        String cancelName = "DirectoryWalker.java";
        TestMultiThreadCancelWalker walker = new TestMultiThreadCancelWalker(cancelName , false);
        try {
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2100,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            File last = ((File)(walker.results.get(((walker.results.size()) - 1))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2101,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2103,last,2102,last.getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2104,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2106,cancel,2105,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2107,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            walker = new TestMultiThreadCancelWalker(cancelName , false);
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2108,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2109,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2110,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2112,cancel.getFile(),2111,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2113,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2115,cancel,2114,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2116,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            walker = new TestMultiThreadCancelWalker(cancelName , true);
            List results = walker.find(javaDir);
            File lastFile = ((File)(results.get(((results.size()) - 1))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2117,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2118,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2120,lastFile,2119,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2121,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
@Test(timeout = 1000)
    public void testMultiThreadCancel_add1213() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadCancel_add1213");
        String cancelName = "DirectoryWalker.java";
        TestMultiThreadCancelWalker walker = new TestMultiThreadCancelWalker(cancelName , false);
        try {
            walker.find(javaDir);
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2100,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            File last = ((File)(walker.results.get(((walker.results.size()) - 1))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2101,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2103,last,2102,last.getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2104,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2106,cancel,2105,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2107,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            walker = new TestMultiThreadCancelWalker(cancelName , false);
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2108,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2109,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2110,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2112,cancel.getFile(),2111,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2113,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2115,cancel,2114,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2116,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            walker = new TestMultiThreadCancelWalker(cancelName , true);
            List results = walker.find(javaDir);
            File lastFile = ((File)(results.get(((results.size()) - 1))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2117,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2118,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2120,lastFile,2119,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2121,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
@Test(timeout = 1000)
    public void testMultiThreadCancel_add1214() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadCancel_add1214");
        String cancelName = "DirectoryWalker.java";
        TestMultiThreadCancelWalker walker = new TestMultiThreadCancelWalker(cancelName , false);
        try {
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2100,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            File last = ((File)(walker.results.get(((walker.results.size()) - 1))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2101,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2103,last,2102,last.getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2104,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2106,cancel,2105,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2107,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            walker = new TestMultiThreadCancelWalker(cancelName , false);
            walker.find(javaDir);
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2108,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2109,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2110,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2112,cancel.getFile(),2111,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2113,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2115,cancel,2114,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2116,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            walker = new TestMultiThreadCancelWalker(cancelName , true);
            List results = walker.find(javaDir);
            File lastFile = ((File)(results.get(((results.size()) - 1))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2117,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2118,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2120,lastFile,2119,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2121,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
public void testMultiThreadCancel_literalMutation2673() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadCancel_literalMutation2673");
        String cancelName = "foo";
        TestMultiThreadCancelWalker walker = new TestMultiThreadCancelWalker(cancelName , false);
        try {
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2100,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            File last = ((File)(walker.results.get(((walker.results.size()) - 1))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2101,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2103,last,2102,last.getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2104,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2106,cancel,2105,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2107,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            walker = new TestMultiThreadCancelWalker(cancelName , false);
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2108,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2109,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2110,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2112,cancel.getFile(),2111,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2113,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2115,cancel,2114,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2116,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            walker = new TestMultiThreadCancelWalker(cancelName , true);
            List results = walker.find(javaDir);
            File lastFile = ((File)(results.get(((results.size()) - 1))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2117,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2118,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2120,lastFile,2119,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2121,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
public void testMultiThreadCancel_literalMutation2674() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadCancel_literalMutation2674");
        String cancelName = "DirectoryWalker.java";
        TestMultiThreadCancelWalker walker = new TestMultiThreadCancelWalker(cancelName , true);
        try {
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2100,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            File last = ((File)(walker.results.get(((walker.results.size()) - 1))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2101,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2103,last,2102,last.getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2104,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2106,cancel,2105,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2107,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            walker = new TestMultiThreadCancelWalker(cancelName , false);
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2108,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2109,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2110,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2112,cancel.getFile(),2111,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2113,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2115,cancel,2114,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2116,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            walker = new TestMultiThreadCancelWalker(cancelName , true);
            List results = walker.find(javaDir);
            File lastFile = ((File)(results.get(((results.size()) - 1))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2117,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2118,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2120,lastFile,2119,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2121,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
public void testMultiThreadCancel_literalMutation2675() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadCancel_literalMutation2675");
        String cancelName = "DirectoryWalker.java";
        TestMultiThreadCancelWalker walker = new TestMultiThreadCancelWalker(cancelName , false);
        try {
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2100,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            File last = ((File)(walker.results.get(((walker.results.size()) - 0))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2101,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2103,last,2102,last.getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2104,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2106,cancel,2105,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2107,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            walker = new TestMultiThreadCancelWalker(cancelName , false);
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2108,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2109,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2110,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2112,cancel.getFile(),2111,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2113,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2115,cancel,2114,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2116,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            walker = new TestMultiThreadCancelWalker(cancelName , true);
            List results = walker.find(javaDir);
            File lastFile = ((File)(results.get(((results.size()) - 1))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2117,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2118,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2120,lastFile,2119,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2121,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
public void testMultiThreadCancel_literalMutation2676() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadCancel_literalMutation2676");
        String cancelName = "DirectoryWalker.java";
        TestMultiThreadCancelWalker walker = new TestMultiThreadCancelWalker(cancelName , false);
        try {
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2100,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            File last = ((File)(walker.results.get(((walker.results.size()) - 1))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2101,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2103,last,2102,last.getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2104,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2106,cancel,2105,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2107,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "foo";
            walker = new TestMultiThreadCancelWalker(cancelName , false);
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2108,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2109,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2110,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2112,cancel.getFile(),2111,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2113,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2115,cancel,2114,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2116,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            walker = new TestMultiThreadCancelWalker(cancelName , true);
            List results = walker.find(javaDir);
            File lastFile = ((File)(results.get(((results.size()) - 1))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2117,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2118,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2120,lastFile,2119,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2121,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
public void testMultiThreadCancel_literalMutation2677() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadCancel_literalMutation2677");
        String cancelName = "DirectoryWalker.java";
        TestMultiThreadCancelWalker walker = new TestMultiThreadCancelWalker(cancelName , false);
        try {
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2100,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            File last = ((File)(walker.results.get(((walker.results.size()) - 1))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2101,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2103,last,2102,last.getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2104,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2106,cancel,2105,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2107,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            walker = new TestMultiThreadCancelWalker(cancelName , false);
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2108,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2109,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2110,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2112,cancel.getFile(),2111,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2113,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2115,cancel,2114,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2116,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            walker = new TestMultiThreadCancelWalker(cancelName , true);
            List results = walker.find(javaDir);
            File lastFile = ((File)(results.get(((results.size()) - 1))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2117,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2118,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2120,lastFile,2119,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2121,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
public void testMultiThreadCancel_literalMutation2678() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadCancel_literalMutation2678");
        String cancelName = "DirectoryWalker.java";
        TestMultiThreadCancelWalker walker = new TestMultiThreadCancelWalker(cancelName , false);
        try {
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2100,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            File last = ((File)(walker.results.get(((walker.results.size()) - 1))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2101,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2103,last,2102,last.getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2104,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2106,cancel,2105,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2107,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            walker = new TestMultiThreadCancelWalker(cancelName , false);
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2108,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2109,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2110,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2112,cancel.getFile(),2111,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2113,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2115,cancel,2114,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2116,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            walker = new TestMultiThreadCancelWalker(cancelName , false);
            List results = walker.find(javaDir);
            File lastFile = ((File)(results.get(((results.size()) - 1))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2117,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2118,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2120,lastFile,2119,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2121,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
public void testMultiThreadCancel_literalMutation2679() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadCancel_literalMutation2679");
        String cancelName = "DirectoryWalker.java";
        TestMultiThreadCancelWalker walker = new TestMultiThreadCancelWalker(cancelName , false);
        try {
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2100,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            File last = ((File)(walker.results.get(((walker.results.size()) - 1))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2101,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2103,last,2102,last.getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2104,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2106,cancel,2105,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2107,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            walker = new TestMultiThreadCancelWalker(cancelName , false);
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2108,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2109,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2110,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2112,cancel.getFile(),2111,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2113,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2115,cancel,2114,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2116,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            walker = new TestMultiThreadCancelWalker(cancelName , true);
            List results = walker.find(javaDir);
            File lastFile = ((File)(results.get(((results.size()) - 2))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2117,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2118,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2120,lastFile,2119,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2121,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test DirectoryWalker implementation that finds files in a directory hierarchy
     * applying a file filter.
     */
private static class TestFileFinder extends DirectoryWalker {
        protected TestFileFinder(FileFilter filter ,int depthLimit) {
            super(filter, depthLimit);
        }

        protected TestFileFinder(IOFileFilter dirFilter ,IOFileFilter fileFilter ,int depthLimit) {
            super(dirFilter, fileFilter, depthLimit);
        }

        /** 
         * find files.
         */
protected List find(File startDirectory) {
            List results = new ArrayList();
            try {
                walk(startDirectory, results);
            } catch (IOException ex) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2017,ex,2016,ex.toString());
            }
            return results;
        }

        /** 
         * Handles a directory end by adding the File to the result set.
         */
@Override
        protected void handleDirectoryEnd(File directory, int depth, Collection results) {
            results.add(directory);
        }

        /** 
         * Handles a file by adding the File to the result set.
         */
@Override
        protected void handleFile(File file, int depth, Collection results) {
            results.add(file);
        }
    }

    /** 
     * Test DirectoryWalker implementation that always returns false
     * from handleDirectoryStart()
     */
private static class TestFalseFileFinder extends TestFileFinder {
        protected TestFalseFileFinder(FileFilter filter ,int depthLimit) {
            super(filter, depthLimit);
        }

        /** 
         * Always returns false.
         */
@Override
        protected boolean handleDirectory(File directory, int depth, Collection results) {
            return false;
        }
    }

    /** 
     * Test DirectoryWalker implementation that finds files in a directory hierarchy
     * applying a file filter.
     */
static class TestCancelWalker extends DirectoryWalker {
        private String cancelFileName;

        private boolean suppressCancel;

        TestCancelWalker(String cancelFileName ,boolean suppressCancel) {
            super();
            this.cancelFileName = cancelFileName;
            this.suppressCancel = suppressCancel;
        }

        /** 
         * find files.
         */
protected List find(File startDirectory) throws IOException {
            List results = new ArrayList();
            walk(startDirectory, results);
            return results;
        }

        /** 
         * Handles a directory end by adding the File to the result set.
         */
@Override
        protected void handleDirectoryEnd(File directory, int depth, Collection results) throws IOException {
            results.add(directory);
            if (cancelFileName.equals(directory.getName())) {
                throw new DirectoryWalker.CancelException(directory , depth);
            } 
        }

        /** 
         * Handles a file by adding the File to the result set.
         */
@Override
        protected void handleFile(File file, int depth, Collection results) throws IOException {
            results.add(file);
            if (cancelFileName.equals(file.getName())) {
                throw new DirectoryWalker.CancelException(file , depth);
            } 
        }

        /** 
         * Handles Cancel.
         */
@Override
        protected void handleCancelled(File startDirectory, Collection results, DirectoryWalker.CancelException cancel) throws IOException {
            if (!(suppressCancel)) {
                super.handleCancelled(startDirectory, results, cancel);
            } 
        }
    }

    /** 
     * Test DirectoryWalker implementation that finds files in a directory hierarchy
     * applying a file filter.
     */
static class TestMultiThreadCancelWalker extends DirectoryWalker {
        private String cancelFileName;

        private boolean suppressCancel;

        private boolean cancelled;

        public List results;

        TestMultiThreadCancelWalker(String cancelFileName ,boolean suppressCancel) {
            super();
            this.cancelFileName = cancelFileName;
            this.suppressCancel = suppressCancel;
        }

        /** 
         * find files.
         */
protected List find(File startDirectory) throws IOException {
            results = new ArrayList();
            walk(startDirectory, results);
            return results;
        }

        /** 
         * Handles a directory end by adding the File to the result set.
         */
@Override
        protected void handleDirectoryEnd(File directory, int depth, Collection results) throws IOException {
            results.add(directory);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,cancelled);
            if (cancelFileName.equals(directory.getName())) {
                cancelled = true;
            } 
        }

        /** 
         * Handles a file by adding the File to the result set.
         */
@Override
        protected void handleFile(File file, int depth, Collection results) throws IOException {
            results.add(file);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2019,cancelled);
            if (cancelFileName.equals(file.getName())) {
                cancelled = true;
            } 
        }

        /** 
         * Handles Cancelled.
         */
@Override
        protected boolean handleIsCancelled(File file, int depth, Collection results) throws IOException {
            return cancelled;
        }

        /** 
         * Handles Cancel.
         */
@Override
        protected void handleCancelled(File startDirectory, Collection results, DirectoryWalker.CancelException cancel) throws IOException {
            if (!(suppressCancel)) {
                super.handleCancelled(startDirectory, results, cancel);
            } 
        }
    }
}


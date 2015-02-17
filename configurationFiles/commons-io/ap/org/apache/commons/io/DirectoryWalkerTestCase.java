package org.apache.commons.io;

import java.util.ArrayList;
import java.util.Collection;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import org.apache.commons.io.filefilter.IOFileFilter;
import java.util.List;
import org.apache.commons.io.filefilter.NameFileFilter;
import org.apache.commons.io.filefilter.OrFileFilter;
import org.junit.Test;

/** 
 * This is used to test DirectoryWalker for correctness.
 * 
 * @version $Id$
 * @see DirectoryWalker
 * 
 */
public class DirectoryWalkerTestCase {
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

    private static final IOFileFilter dirsFilter = DirectoryWalkerTestCase.createNameFilter(dirs);

    private static final IOFileFilter iofilesFilter = DirectoryWalkerTestCase.createNameFilter(ioFiles);

    private static final IOFileFilter outputFilesFilter = DirectoryWalkerTestCase.createNameFilter(outputFiles);

    private static final IOFileFilter ioDirAndFilesFilter = new OrFileFilter(dirsFilter , iofilesFilter);

    private static final IOFileFilter dirsAndFilesFilter = new OrFileFilter(ioDirAndFilesFilter , outputFilesFilter);

    private static final IOFileFilter NOT_SVN = org.apache.commons.io.filefilter.FileFilterUtils.makeSVNAware(null);

    /** 
     * Test Filtering
     */
@Test(timeout = 1000)
    public void testFilter_add1183() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilter_add1183");
        List<java.io.File> results = new TestFileFinder(dirsAndFilesFilter , 2).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1979,(((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.outputFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1981,results,1980,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1983,results,1982,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
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
    public void testFilter_add1184() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilter_add1184");
        List<java.io.File> results = new TestFileFinder(dirsAndFilesFilter , 2).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1979,(((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.outputFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1981,results,1980,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1983,results,1982,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
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
    public void testFilter_add1185() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilter_add1185");
        List<java.io.File> results = new TestFileFinder(dirsAndFilesFilter , 2).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1979,(((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.outputFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1981,results,1980,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1983,results,1982,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("Dir", dirs, results);
        checkContainsFiles("IO File", ioFiles, results);
        checkContainsFiles("Output File", outputFiles, results);
        checkContainsFiles("Output File", outputFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering
     */
@Test
    public void testFilter() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilter");
        List<java.io.File> results = new TestFileFinder(dirsAndFilesFilter , -2).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1979,(((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.outputFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1981,results,1980,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1983,results,1982,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("Dir", dirs, results);
        checkContainsFiles("IO File", ioFiles, results);
        checkContainsFiles("Output File", outputFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering
     */
@Test
    public void testFilter_literalMutation3842() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilter_literalMutation3842");
        List<java.io.File> results = new TestFileFinder(dirsAndFilesFilter , 0).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1979,(((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.outputFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1981,results,1980,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1983,results,1982,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("Dir", dirs, results);
        checkContainsFiles("IO File", ioFiles, results);
        checkContainsFiles("Output File", outputFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering
     */
@Test
    public void testFilter_literalMutation3843() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilter_literalMutation3843");
        List<java.io.File> results = new TestFileFinder(dirsAndFilesFilter , 0).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1979,(((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.outputFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1981,results,1980,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1983,results,1982,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("Dir", dirs, results);
        checkContainsFiles("IO File", ioFiles, results);
        checkContainsFiles("Output File", outputFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering
     */
@Test
    public void testFilter_literalMutation3844() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilter_literalMutation3844");
        List<java.io.File> results = new TestFileFinder(dirsAndFilesFilter , 2).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1979,(((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.outputFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1981,results,1980,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1983,results,1982,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("bar", dirs, results);
        checkContainsFiles("IO File", ioFiles, results);
        checkContainsFiles("Output File", outputFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering
     */
@Test
    public void testFilter_literalMutation3845() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilter_literalMutation3845");
        List<java.io.File> results = new TestFileFinder(dirsAndFilesFilter , 2).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1979,(((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.outputFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1981,results,1980,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1983,results,1982,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("Dir", dirs, results);
        checkContainsFiles("bar", ioFiles, results);
        checkContainsFiles("Output File", outputFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering
     */
@Test
    public void testFilter_literalMutation3846() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilter_literalMutation3846");
        List<java.io.File> results = new TestFileFinder(dirsAndFilesFilter , 2).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1979,(((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.outputFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1981,results,1980,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1983,results,1982,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("Dir", dirs, results);
        checkContainsFiles("IO File", ioFiles, results);
        checkContainsFiles("bar", outputFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering
     */
@Test(timeout = 1000)
    public void testFilter_remove919() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilter_remove919");
        List<java.io.File> results = new TestFileFinder(dirsAndFilesFilter , 2).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1979,(((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.outputFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1981,results,1980,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1983,results,1982,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("IO File", ioFiles, results);
        checkContainsFiles("Output File", outputFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering
     */
@Test(timeout = 1000)
    public void testFilter_remove920() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilter_remove920");
        List<java.io.File> results = new TestFileFinder(dirsAndFilesFilter , 2).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1979,(((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.outputFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1981,results,1980,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1983,results,1982,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("IO File", ioFiles, results);
        checkContainsFiles("Output File", outputFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering
     */
@Test(timeout = 1000)
    public void testFilter_remove921() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilter_remove921");
        List<java.io.File> results = new TestFileFinder(dirsAndFilesFilter , 2).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1979,(((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.outputFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1981,results,1980,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1983,results,1982,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("IO File", ioFiles, results);
        checkContainsFiles("Output File", outputFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering and limit to depth 0
     */
@Test
    public void testFilterAndLimitA() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterAndLimitA");
        List<java.io.File> results = new TestFileFinder(NOT_SVN , 1).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1934,results,1933,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1936,results,1935,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering and limit to depth 0
     */
@Test
    public void testFilterAndLimitA_literalMutation3848() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterAndLimitA_literalMutation3848");
        List<java.io.File> results = new TestFileFinder(NOT_SVN , -1).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1934,results,1933,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1936,results,1935,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering and limit to depth 0
     */
@Test
    public void testFilterAndLimitA_literalMutation3849() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterAndLimitA_literalMutation3849");
        List<java.io.File> results = new TestFileFinder(NOT_SVN , 0).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1934,results,1933,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1936,results,1935,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering and limit to depth 1
     */
@Test
    public void testFilterAndLimitB() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterAndLimitB");
        List<java.io.File> results = new TestFileFinder(NOT_SVN , 2).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1938,results,1937,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1940,results,1939,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1942,results,1941,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.orgDir));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering and limit to depth 1
     */
@Test
    public void testFilterAndLimitB_literalMutation3851() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterAndLimitB_literalMutation3851");
        List<java.io.File> results = new TestFileFinder(NOT_SVN , 0).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1938,results,1937,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1940,results,1939,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1942,results,1941,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.orgDir));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering and limit to depth 1
     */
@Test
    public void testFilterAndLimitB_literalMutation3852() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterAndLimitB_literalMutation3852");
        List<java.io.File> results = new TestFileFinder(NOT_SVN , 0).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1938,results,1937,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1940,results,1939,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1942,results,1941,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.orgDir));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering and limit to depth 3
     */
@Test
    public void testFilterAndLimitC() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterAndLimitC");
        List<java.io.File> results = new TestFileFinder(NOT_SVN , 4).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1944,results,1943,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1946,results,1945,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1948,results,1947,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.orgDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1950,results,1949,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.apacheDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,results,1951,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.commonsDir));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering and limit to depth 3
     */
@Test
    public void testFilterAndLimitC_literalMutation3854() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterAndLimitC_literalMutation3854");
        List<java.io.File> results = new TestFileFinder(NOT_SVN , 2).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1944,results,1943,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1946,results,1945,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1948,results,1947,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.orgDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1950,results,1949,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.apacheDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,results,1951,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.commonsDir));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering and limit to depth 3
     */
@Test
    public void testFilterAndLimitC_literalMutation3855() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterAndLimitC_literalMutation3855");
        List<java.io.File> results = new TestFileFinder(NOT_SVN , 1).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1944,results,1943,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1946,results,1945,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1948,results,1947,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.orgDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1950,results,1949,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.apacheDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,results,1951,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.commonsDir));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering and limit to depth 3
     */
@Test
    public void testFilterAndLimitC_literalMutation3856() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterAndLimitC_literalMutation3856");
        List<java.io.File> results = new TestFileFinder(NOT_SVN , 6).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1944,results,1943,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1946,results,1945,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1948,results,1947,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.orgDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1950,results,1949,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.apacheDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,results,1951,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.commonsDir));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering and limit to depth 5
     */
@Test(timeout = 1000)
    public void testFilterAndLimitD_add1186() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterAndLimitD_add1186");
        List<java.io.File> results = new TestFileFinder(dirsAndFilesFilter , 5).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1953,((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1955,results,1954,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1957,results,1956,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("[D] Dir", dirs, results);
        checkContainsFiles("[D] Dir", dirs, results);
        checkContainsFiles("[D] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering and limit to depth 5
     */
@Test(timeout = 1000)
    public void testFilterAndLimitD_add1187() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterAndLimitD_add1187");
        List<java.io.File> results = new TestFileFinder(dirsAndFilesFilter , 5).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1953,((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1955,results,1954,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1957,results,1956,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("[D] Dir", dirs, results);
        checkContainsFiles("[D] File", ioFiles, results);
        checkContainsFiles("[D] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering and limit to depth 5
     */
@Test
    public void testFilterAndLimitD() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterAndLimitD");
        List<java.io.File> results = new TestFileFinder(dirsAndFilesFilter , 4).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1953,((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1955,results,1954,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1957,results,1956,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("[D] Dir", dirs, results);
        checkContainsFiles("[D] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering and limit to depth 5
     */
@Test
    public void testFilterAndLimitD_literalMutation3858() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterAndLimitD_literalMutation3858");
        List<java.io.File> results = new TestFileFinder(dirsAndFilesFilter , 2).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1953,((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1955,results,1954,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1957,results,1956,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("[D] Dir", dirs, results);
        checkContainsFiles("[D] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering and limit to depth 5
     */
@Test
    public void testFilterAndLimitD_literalMutation3859() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterAndLimitD_literalMutation3859");
        List<java.io.File> results = new TestFileFinder(dirsAndFilesFilter , 10).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1953,((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1955,results,1954,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1957,results,1956,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("[D] Dir", dirs, results);
        checkContainsFiles("[D] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering and limit to depth 5
     */
@Test
    public void testFilterAndLimitD_literalMutation3860() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterAndLimitD_literalMutation3860");
        List<java.io.File> results = new TestFileFinder(dirsAndFilesFilter , 6).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1953,((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1955,results,1954,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1957,results,1956,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("[D] Dir", dirs, results);
        checkContainsFiles("[D] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering and limit to depth 5
     */
@Test
    public void testFilterAndLimitD_literalMutation3861() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterAndLimitD_literalMutation3861");
        List<java.io.File> results = new TestFileFinder(dirsAndFilesFilter , 5).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1953,((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1955,results,1954,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1957,results,1956,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("foo", dirs, results);
        checkContainsFiles("[D] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering and limit to depth 5
     */
@Test
    public void testFilterAndLimitD_literalMutation3862() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterAndLimitD_literalMutation3862");
        List<java.io.File> results = new TestFileFinder(dirsAndFilesFilter , 5).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1953,((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1955,results,1954,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1957,results,1956,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("[D] Dir", dirs, results);
        checkContainsFiles("bar", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering and limit to depth 5
     */
@Test(timeout = 1000)
    public void testFilterAndLimitD_remove922() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterAndLimitD_remove922");
        List<java.io.File> results = new TestFileFinder(dirsAndFilesFilter , 5).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1953,((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1955,results,1954,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1957,results,1956,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("[D] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering and limit to depth 5
     */
@Test(timeout = 1000)
    public void testFilterAndLimitD_remove923() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterAndLimitD_remove923");
        List<java.io.File> results = new TestFileFinder(dirsAndFilesFilter , 5).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1953,((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1955,results,1954,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1957,results,1956,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("[D] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test(timeout = 1000)
    public void testFilterDirAndFile1_add1188() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile1_add1188");
        List<java.io.File> results = new TestFileFinder(dirsFilter , iofilesFilter , 2).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1958,((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1960,results,1959,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1962,results,1961,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("[DirAndFile1] Dir", dirs, results);
        checkContainsFiles("[DirAndFile1] Dir", dirs, results);
        checkContainsFiles("[DirAndFile1] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test(timeout = 1000)
    public void testFilterDirAndFile1_add1189() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile1_add1189");
        List<java.io.File> results = new TestFileFinder(dirsFilter , iofilesFilter , 2).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1958,((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1960,results,1959,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1962,results,1961,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("[DirAndFile1] Dir", dirs, results);
        checkContainsFiles("[DirAndFile1] File", ioFiles, results);
        checkContainsFiles("[DirAndFile1] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test
    public void testFilterDirAndFile1() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile1");
        List<java.io.File> results = new TestFileFinder(dirsFilter , iofilesFilter , -2).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1958,((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1960,results,1959,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1962,results,1961,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("[DirAndFile1] Dir", dirs, results);
        checkContainsFiles("[DirAndFile1] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test
    public void testFilterDirAndFile1_literalMutation3864() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile1_literalMutation3864");
        List<java.io.File> results = new TestFileFinder(dirsFilter , iofilesFilter , 0).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1958,((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1960,results,1959,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1962,results,1961,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("[DirAndFile1] Dir", dirs, results);
        checkContainsFiles("[DirAndFile1] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test
    public void testFilterDirAndFile1_literalMutation3865() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile1_literalMutation3865");
        List<java.io.File> results = new TestFileFinder(dirsFilter , iofilesFilter , 0).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1958,((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1960,results,1959,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1962,results,1961,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("[DirAndFile1] Dir", dirs, results);
        checkContainsFiles("[DirAndFile1] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test
    public void testFilterDirAndFile1_literalMutation3866() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile1_literalMutation3866");
        List<java.io.File> results = new TestFileFinder(dirsFilter , iofilesFilter , 2).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1958,((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1960,results,1959,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1962,results,1961,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("foo", dirs, results);
        checkContainsFiles("[DirAndFile1] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test
    public void testFilterDirAndFile1_literalMutation3867() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile1_literalMutation3867");
        List<java.io.File> results = new TestFileFinder(dirsFilter , iofilesFilter , 2).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1958,((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1960,results,1959,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1962,results,1961,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("[DirAndFile1] Dir", dirs, results);
        checkContainsFiles("foo", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test(timeout = 1000)
    public void testFilterDirAndFile1_remove924() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile1_remove924");
        List<java.io.File> results = new TestFileFinder(dirsFilter , iofilesFilter , 2).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1958,((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1960,results,1959,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1962,results,1961,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("[DirAndFile1] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test(timeout = 1000)
    public void testFilterDirAndFile1_remove925() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile1_remove925");
        List<java.io.File> results = new TestFileFinder(dirsFilter , iofilesFilter , 2).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1958,((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1960,results,1959,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1962,results,1961,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("[DirAndFile1] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test(timeout = 1000)
    public void testFilterDirAndFile2_add1190() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile2_add1190");
        List<java.io.File> results = new TestFileFinder(((IOFileFilter)(null)) , ((IOFileFilter)(null)) , 2).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1963,((results.size()) > ((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1965,results,1964,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("[DirAndFile2] Dir", dirs, results);
        checkContainsFiles("[DirAndFile2] Dir", dirs, results);
        checkContainsFiles("[DirAndFile2] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test(timeout = 1000)
    public void testFilterDirAndFile2_add1191() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile2_add1191");
        List<java.io.File> results = new TestFileFinder(((IOFileFilter)(null)) , ((IOFileFilter)(null)) , 2).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1963,((results.size()) > ((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1965,results,1964,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("[DirAndFile2] Dir", dirs, results);
        checkContainsFiles("[DirAndFile2] File", ioFiles, results);
        checkContainsFiles("[DirAndFile2] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test
    public void testFilterDirAndFile2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile2");
        List<java.io.File> results = new TestFileFinder(((IOFileFilter)(null)) , ((IOFileFilter)(null)) , -2).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1963,((results.size()) > ((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1965,results,1964,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("[DirAndFile2] Dir", dirs, results);
        checkContainsFiles("[DirAndFile2] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test
    public void testFilterDirAndFile2_literalMutation3871() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile2_literalMutation3871");
        List<java.io.File> results = new TestFileFinder(((IOFileFilter)(null)) , ((IOFileFilter)(null)) , 0).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1963,((results.size()) > ((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1965,results,1964,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("[DirAndFile2] Dir", dirs, results);
        checkContainsFiles("[DirAndFile2] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test
    public void testFilterDirAndFile2_literalMutation3872() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile2_literalMutation3872");
        List<java.io.File> results = new TestFileFinder(((IOFileFilter)(null)) , ((IOFileFilter)(null)) , 0).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1963,((results.size()) > ((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1965,results,1964,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("[DirAndFile2] Dir", dirs, results);
        checkContainsFiles("[DirAndFile2] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test
    public void testFilterDirAndFile2_literalMutation3873() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile2_literalMutation3873");
        List<java.io.File> results = new TestFileFinder(((IOFileFilter)(null)) , ((IOFileFilter)(null)) , 2).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1963,((results.size()) > ((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1965,results,1964,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("bar", dirs, results);
        checkContainsFiles("[DirAndFile2] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test
    public void testFilterDirAndFile2_literalMutation3874() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile2_literalMutation3874");
        List<java.io.File> results = new TestFileFinder(((IOFileFilter)(null)) , ((IOFileFilter)(null)) , 2).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1963,((results.size()) > ((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1965,results,1964,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("[DirAndFile2] Dir", dirs, results);
        checkContainsFiles("bar", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test(timeout = 1000)
    public void testFilterDirAndFile2_remove926() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile2_remove926");
        List<java.io.File> results = new TestFileFinder(((IOFileFilter)(null)) , ((IOFileFilter)(null)) , 2).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1963,((results.size()) > ((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1965,results,1964,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("[DirAndFile2] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test(timeout = 1000)
    public void testFilterDirAndFile2_remove927() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile2_remove927");
        List<java.io.File> results = new TestFileFinder(((IOFileFilter)(null)) , ((IOFileFilter)(null)) , 2).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1963,((results.size()) > ((1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1965,results,1964,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("[DirAndFile2] File", ioFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test(timeout = 1000)
    public void testFilterDirAndFile3_add1192() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile3_add1192");
        List<java.io.File> results = new TestFileFinder(dirsFilter , ((IOFileFilter)(null)) , 2).find(javaDir);
        List<java.io.File> resultDirs = directoriesOnly(results);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1966,(1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1968,resultDirs,1967,resultDirs.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1970,results,1969,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("[DirAndFile3] Dir", dirs, resultDirs);
        checkContainsFiles("[DirAndFile3] Dir", dirs, resultDirs);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test
    public void testFilterDirAndFile3() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile3");
        List<java.io.File> results = new TestFileFinder(dirsFilter , ((IOFileFilter)(null)) , -2).find(javaDir);
        List<java.io.File> resultDirs = directoriesOnly(results);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1966,(1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1968,resultDirs,1967,resultDirs.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1970,results,1969,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("[DirAndFile3] Dir", dirs, resultDirs);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test
    public void testFilterDirAndFile3_literalMutation3877() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile3_literalMutation3877");
        List<java.io.File> results = new TestFileFinder(dirsFilter , ((IOFileFilter)(null)) , 0).find(javaDir);
        List<java.io.File> resultDirs = directoriesOnly(results);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1966,(1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1968,resultDirs,1967,resultDirs.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1970,results,1969,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("[DirAndFile3] Dir", dirs, resultDirs);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test
    public void testFilterDirAndFile3_literalMutation3878() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile3_literalMutation3878");
        List<java.io.File> results = new TestFileFinder(dirsFilter , ((IOFileFilter)(null)) , 0).find(javaDir);
        List<java.io.File> resultDirs = directoriesOnly(results);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1966,(1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1968,resultDirs,1967,resultDirs.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1970,results,1969,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("[DirAndFile3] Dir", dirs, resultDirs);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test
    public void testFilterDirAndFile3_literalMutation3879() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile3_literalMutation3879");
        List<java.io.File> results = new TestFileFinder(dirsFilter , ((IOFileFilter)(null)) , 2).find(javaDir);
        List<java.io.File> resultDirs = directoriesOnly(results);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1966,(1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1968,resultDirs,1967,resultDirs.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1970,results,1969,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("bar", dirs, resultDirs);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test(timeout = 1000)
    public void testFilterDirAndFile3_remove928() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile3_remove928");
        List<java.io.File> results = new TestFileFinder(dirsFilter , ((IOFileFilter)(null)) , 2).find(javaDir);
        List<java.io.File> resultDirs = directoriesOnly(results);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1966,(1 + (org.apache.commons.io.DirectoryWalkerTestCase.dirs.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1968,resultDirs,1967,resultDirs.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1970,results,1969,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test(timeout = 1000)
    public void testFilterDirAndFile4_add1193() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile4_add1193");
        List<java.io.File> results = new TestFileFinder(((IOFileFilter)(null)) , iofilesFilter , 2).find(javaDir);
        List<java.io.File> resultFiles = filesOnly(results);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1971,org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1973,resultFiles,1972,resultFiles.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1975,results,1974,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("[DirAndFile4] File", ioFiles, resultFiles);
        checkContainsFiles("[DirAndFile4] File", ioFiles, resultFiles);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test
    public void testFilterDirAndFile4() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile4");
        List<java.io.File> results = new TestFileFinder(((IOFileFilter)(null)) , iofilesFilter , -2).find(javaDir);
        List<java.io.File> resultFiles = filesOnly(results);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1971,org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1973,resultFiles,1972,resultFiles.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1975,results,1974,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("[DirAndFile4] File", ioFiles, resultFiles);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test
    public void testFilterDirAndFile4_literalMutation3882() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile4_literalMutation3882");
        List<java.io.File> results = new TestFileFinder(((IOFileFilter)(null)) , iofilesFilter , 0).find(javaDir);
        List<java.io.File> resultFiles = filesOnly(results);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1971,org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1973,resultFiles,1972,resultFiles.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1975,results,1974,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("[DirAndFile4] File", ioFiles, resultFiles);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test
    public void testFilterDirAndFile4_literalMutation3883() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile4_literalMutation3883");
        List<java.io.File> results = new TestFileFinder(((IOFileFilter)(null)) , iofilesFilter , 0).find(javaDir);
        List<java.io.File> resultFiles = filesOnly(results);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1971,org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1973,resultFiles,1972,resultFiles.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1975,results,1974,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("[DirAndFile4] File", ioFiles, resultFiles);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test
    public void testFilterDirAndFile4_literalMutation3884() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile4_literalMutation3884");
        List<java.io.File> results = new TestFileFinder(((IOFileFilter)(null)) , iofilesFilter , 2).find(javaDir);
        List<java.io.File> resultFiles = filesOnly(results);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1971,org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1973,resultFiles,1972,resultFiles.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1975,results,1974,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        checkContainsFiles("bar", ioFiles, resultFiles);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test separate dir and file filters
     */
@Test(timeout = 1000)
    public void testFilterDirAndFile4_remove929() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterDirAndFile4_remove929");
        List<java.io.File> results = new TestFileFinder(((IOFileFilter)(null)) , iofilesFilter , 2).find(javaDir);
        List<java.io.File> resultFiles = filesOnly(results);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1971,org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1973,resultFiles,1972,resultFiles.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1975,results,1974,results.contains(org.apache.commons.io.DirectoryWalkerTestCase.javaDir));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Limiting to current directory
     */
@Test
    public void testLimitToCurrent() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLimitToCurrent");
        List<java.io.File> results = new TestFileFinder(null , 1).find(current);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1987,results,1986,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1989,results,1988,results.contains(new java.io.File(".")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Limiting to current directory
     */
@Test
    public void testLimitToCurrent_literalMutation3896() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLimitToCurrent_literalMutation3896");
        List<java.io.File> results = new TestFileFinder(null , -1).find(current);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1987,results,1986,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1989,results,1988,results.contains(new java.io.File(".")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Limiting to current directory
     */
@Test
    public void testLimitToCurrent_literalMutation3897() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLimitToCurrent_literalMutation3897");
        List<java.io.File> results = new TestFileFinder(null , 0).find(current);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1987,results,1986,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1989,results,1988,results.contains(new java.io.File(".")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test an invalid start directory
     */
@Test(timeout = 1000)
    public void testMissingStartDirectory_add1196() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMissingStartDirectory_add1196");
        File invalidDir = new File("invalid-dir");
        List<java.io.File> results = new TestFileFinder(null , 2).find(invalidDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1991,results,1990,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1993,results,1992,results.contains(invalidDir));
        try {
            new TestFileFinder(null , 2).find(null);
            new TestFileFinder(null , 2).find(null);
        } catch (NullPointerException ignore) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test an invalid start directory
     */
@Test
    public void testMissingStartDirectory() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMissingStartDirectory");
        File invalidDir = new File("bar");
        List<java.io.File> results = new TestFileFinder(null , -1).find(invalidDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1991,results,1990,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1993,results,1992,results.contains(invalidDir));
        try {
            new TestFileFinder(null , -1).find(null);
        } catch (NullPointerException ignore) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test an invalid start directory
     */
@Test
    public void testMissingStartDirectory_literalMutation3900() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMissingStartDirectory_literalMutation3900");
        File invalidDir = new File("invalid-dir");
        List<java.io.File> results = new TestFileFinder(null , -2).find(invalidDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1991,results,1990,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1993,results,1992,results.contains(invalidDir));
        try {
            new TestFileFinder(null , -1).find(null);
        } catch (NullPointerException ignore) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test an invalid start directory
     */
@Test
    public void testMissingStartDirectory_literalMutation3901() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMissingStartDirectory_literalMutation3901");
        File invalidDir = new File("invalid-dir");
        List<java.io.File> results = new TestFileFinder(null , 0).find(invalidDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1991,results,1990,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1993,results,1992,results.contains(invalidDir));
        try {
            new TestFileFinder(null , -1).find(null);
        } catch (NullPointerException ignore) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test an invalid start directory
     */
@Test
    public void testMissingStartDirectory_literalMutation3902() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMissingStartDirectory_literalMutation3902");
        File invalidDir = new File("invalid-dir");
        List<java.io.File> results = new TestFileFinder(null , 0).find(invalidDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1991,results,1990,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1993,results,1992,results.contains(invalidDir));
        try {
            new TestFileFinder(null , -1).find(null);
        } catch (NullPointerException ignore) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test an invalid start directory
     */
@Test
    public void testMissingStartDirectory_literalMutation3904() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMissingStartDirectory_literalMutation3904");
        File invalidDir = new File("invalid-dir");
        List<java.io.File> results = new TestFileFinder(null , 2).find(invalidDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1991,results,1990,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1993,results,1992,results.contains(invalidDir));
        try {
            new TestFileFinder(null , -2).find(null);
        } catch (NullPointerException ignore) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test an invalid start directory
     */
@Test
    public void testMissingStartDirectory_literalMutation3905() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMissingStartDirectory_literalMutation3905");
        File invalidDir = new File("invalid-dir");
        List<java.io.File> results = new TestFileFinder(null , 2).find(invalidDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1991,results,1990,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1993,results,1992,results.contains(invalidDir));
        try {
            new TestFileFinder(null , 0).find(null);
        } catch (NullPointerException ignore) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test an invalid start directory
     */
@Test
    public void testMissingStartDirectory_literalMutation3906() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMissingStartDirectory_literalMutation3906");
        File invalidDir = new File("invalid-dir");
        List<java.io.File> results = new TestFileFinder(null , 2).find(invalidDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1991,results,1990,results.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1993,results,1992,results.contains(invalidDir));
        try {
            new TestFileFinder(null , 0).find(null);
        } catch (NullPointerException ignore) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test an invalid start directory
     */
@Test
    public void testHandleStartDirectoryFalse() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHandleStartDirectoryFalse");
        List<java.io.File> results = new TestFalseFileFinder(null , -2).find(current);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1985,results,1984,results.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test an invalid start directory
     */
@Test
    public void testHandleStartDirectoryFalse_literalMutation3892() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHandleStartDirectoryFalse_literalMutation3892");
        List<java.io.File> results = new TestFalseFileFinder(null , 0).find(current);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1985,results,1984,results.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test an invalid start directory
     */
@Test
    public void testHandleStartDirectoryFalse_literalMutation3893() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHandleStartDirectoryFalse_literalMutation3893");
        List<java.io.File> results = new TestFalseFileFinder(null , 0).find(current);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1985,results,1984,results.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Check the files in the array are in the results list.
     */
private void checkContainsFiles(String prefix, File[] files, Collection<java.io.File> results) {
        for (int i = 0 ; i < (files.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1904,((((prefix + "[") + i) + "] ") + (files[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1906,results,1905,results.contains(files[i]));
        }
    }

    private void checkContainsString(String prefix, File[] files, Collection<java.lang.String> results) {
        for (int i = 0 ; i < (files.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1907,((((prefix + "[") + i) + "] ") + (files[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1909,results,1908,results.contains(files[i].toString()));
        }
    }

    /** 
     * Extract the directories.
     */
private List<java.io.File> directoriesOnly(Collection<java.io.File> results) {
        List<java.io.File> list = new ArrayList<java.io.File>(results.size());
        for (File file : results) {
            if (file.isDirectory()) {
                list.add(file);
            } 
        }
        return list;
    }

    /** 
     * Extract the files.
     */
private List<java.io.File> filesOnly(Collection<java.io.File> results) {
        List<java.io.File> list = new ArrayList<java.io.File>(results.size());
        for (File file : results) {
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
@Test(timeout = 1000)
    public void testCancel_add1181() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCancel_add1181");
        String cancelName = null;
        try {
            cancelName = "DirectoryWalker.java";
            new TestCancelWalker(cancelName , false).find(javaDir);
            new TestCancelWalker(cancelName , false).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1910,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1911,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1912,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1914,cancel.getFile(),1913,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1915,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1917,cancel,1916,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1918,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            new TestCancelWalker(cancelName , false).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1919,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1920,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1921,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1923,cancel.getFile(),1922,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1924,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1926,cancel,1925,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1927,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            List<java.io.File> results = new TestCancelWalker(cancelName , true).find(javaDir);
            File lastFile = results.get(((results.size()) - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1928,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1929,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1931,lastFile,1930,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1932,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
@Test(timeout = 1000)
    public void testCancel_add1182() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCancel_add1182");
        String cancelName = null;
        try {
            cancelName = "DirectoryWalker.java";
            new TestCancelWalker(cancelName , false).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1910,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1911,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1912,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1914,cancel.getFile(),1913,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1915,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1917,cancel,1916,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1918,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            new TestCancelWalker(cancelName , false).find(javaDir);
            new TestCancelWalker(cancelName , false).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1919,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1920,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1921,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1923,cancel.getFile(),1922,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1924,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1926,cancel,1925,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1927,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            List<java.io.File> results = new TestCancelWalker(cancelName , true).find(javaDir);
            File lastFile = results.get(((results.size()) - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1928,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1929,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1931,lastFile,1930,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1932,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
@Test
    public void testCancel() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCancel");
        String cancelName = null;
        try {
            cancelName = "foo";
            new TestCancelWalker(cancelName , false).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1910,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1911,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1912,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1914,cancel.getFile(),1913,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1915,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1917,cancel,1916,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1918,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            new TestCancelWalker(cancelName , false).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1919,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1920,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1921,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1923,cancel.getFile(),1922,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1924,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1926,cancel,1925,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1927,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            List<java.io.File> results = new TestCancelWalker(cancelName , true).find(javaDir);
            File lastFile = results.get(((results.size()) - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1928,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1929,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1931,lastFile,1930,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1932,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
@Test
    public void testCancel_literalMutation3834() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCancel_literalMutation3834");
        String cancelName = null;
        try {
            cancelName = "DirectoryWalker.java";
            new TestCancelWalker(cancelName , true).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1910,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1911,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1912,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1914,cancel.getFile(),1913,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1915,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1917,cancel,1916,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1918,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            new TestCancelWalker(cancelName , false).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1919,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1920,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1921,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1923,cancel.getFile(),1922,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1924,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1926,cancel,1925,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1927,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            List<java.io.File> results = new TestCancelWalker(cancelName , true).find(javaDir);
            File lastFile = results.get(((results.size()) - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1928,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1929,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1931,lastFile,1930,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1932,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
@Test
    public void testCancel_literalMutation3835() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCancel_literalMutation3835");
        String cancelName = null;
        try {
            cancelName = "DirectoryWalker.java";
            new TestCancelWalker(cancelName , false).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1910,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1911,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1912,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1914,cancel.getFile(),1913,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1915,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1917,cancel,1916,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1918,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "bar";
            new TestCancelWalker(cancelName , false).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1919,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1920,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1921,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1923,cancel.getFile(),1922,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1924,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1926,cancel,1925,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1927,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            List<java.io.File> results = new TestCancelWalker(cancelName , true).find(javaDir);
            File lastFile = results.get(((results.size()) - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1928,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1929,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1931,lastFile,1930,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1932,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
@Test
    public void testCancel_literalMutation3836() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCancel_literalMutation3836");
        String cancelName = null;
        try {
            cancelName = "DirectoryWalker.java";
            new TestCancelWalker(cancelName , false).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1910,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1911,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1912,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1914,cancel.getFile(),1913,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1915,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1917,cancel,1916,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1918,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            new TestCancelWalker(cancelName , true).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1919,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1920,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1921,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1923,cancel.getFile(),1922,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1924,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1926,cancel,1925,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1927,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            List<java.io.File> results = new TestCancelWalker(cancelName , true).find(javaDir);
            File lastFile = results.get(((results.size()) - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1928,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1929,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1931,lastFile,1930,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1932,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
@Test
    public void testCancel_literalMutation3837() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCancel_literalMutation3837");
        String cancelName = null;
        try {
            cancelName = "DirectoryWalker.java";
            new TestCancelWalker(cancelName , false).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1910,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1911,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1912,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1914,cancel.getFile(),1913,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1915,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1917,cancel,1916,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1918,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            new TestCancelWalker(cancelName , false).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1919,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1920,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1921,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1923,cancel.getFile(),1922,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1924,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1926,cancel,1925,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1927,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            List<java.io.File> results = new TestCancelWalker(cancelName , false).find(javaDir);
            File lastFile = results.get(((results.size()) - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1928,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1929,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1931,lastFile,1930,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1932,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
@Test
    public void testCancel_literalMutation3838() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCancel_literalMutation3838");
        String cancelName = null;
        try {
            cancelName = "DirectoryWalker.java";
            new TestCancelWalker(cancelName , false).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1910,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1911,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1912,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1914,cancel.getFile(),1913,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1915,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1917,cancel,1916,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1918,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            new TestCancelWalker(cancelName , false).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1919,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1920,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1921,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1923,cancel.getFile(),1922,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1924,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1926,cancel,1925,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1927,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            List<java.io.File> results = new TestCancelWalker(cancelName , true).find(javaDir);
            File lastFile = results.get(((results.size()) - 2));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1928,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1929,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1931,lastFile,1930,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1932,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
@Test
    public void testCancel_literalMutation3839() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCancel_literalMutation3839");
        String cancelName = null;
        try {
            cancelName = "DirectoryWalker.java";
            new TestCancelWalker(cancelName , false).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1910,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1911,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1912,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1914,cancel.getFile(),1913,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1915,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1917,cancel,1916,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1918,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            new TestCancelWalker(cancelName , false).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1919,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1920,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1921,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1923,cancel.getFile(),1922,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1924,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1926,cancel,1925,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1927,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            List<java.io.File> results = new TestCancelWalker(cancelName , true).find(javaDir);
            File lastFile = results.get(((results.size()) - 0));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1928,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1929,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1931,lastFile,1930,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1932,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
@Test
    public void testCancel_literalMutation3840() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCancel_literalMutation3840");
        String cancelName = null;
        try {
            cancelName = "DirectoryWalker.java";
            new TestCancelWalker(cancelName , false).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1910,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1911,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1912,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1914,cancel.getFile(),1913,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1915,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1917,cancel,1916,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1918,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            new TestCancelWalker(cancelName , false).find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1919,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1920,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1921,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1923,cancel.getFile(),1922,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1924,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1926,cancel,1925,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1927,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            List<java.io.File> results = new TestCancelWalker(cancelName , true).find(javaDir);
            File lastFile = results.get(((results.size()) - 0));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1928,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1929,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1931,lastFile,1930,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1932,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
@Test(timeout = 1000)
    public void testMultiThreadCancel_add1197() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadCancel_add1197");
        String cancelName = "DirectoryWalker.java";
        TestMultiThreadCancelWalker walker = new TestMultiThreadCancelWalker(cancelName , false);
        try {
            walker.find(javaDir);
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1994,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            File last = walker.results.get(((walker.results.size()) - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1995,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1997,last,1996,last.getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1998,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2000,cancel,1999,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2001,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            walker = new TestMultiThreadCancelWalker(cancelName , false);
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2003,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,cancel.getFile(),2005,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2007,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2009,cancel,2008,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            walker = new TestMultiThreadCancelWalker(cancelName , true);
            List<java.io.File> results = walker.find(javaDir);
            File lastFile = results.get(((results.size()) - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2011,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,lastFile,2013,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2015,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
@Test(timeout = 1000)
    public void testMultiThreadCancel_add1198() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadCancel_add1198");
        String cancelName = "DirectoryWalker.java";
        TestMultiThreadCancelWalker walker = new TestMultiThreadCancelWalker(cancelName , false);
        try {
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1994,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            File last = walker.results.get(((walker.results.size()) - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1995,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1997,last,1996,last.getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1998,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2000,cancel,1999,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2001,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            walker = new TestMultiThreadCancelWalker(cancelName , false);
            walker.find(javaDir);
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2003,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,cancel.getFile(),2005,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2007,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2009,cancel,2008,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            walker = new TestMultiThreadCancelWalker(cancelName , true);
            List<java.io.File> results = walker.find(javaDir);
            File lastFile = results.get(((results.size()) - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2011,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,lastFile,2013,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2015,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
@Test
    public void testMultiThreadCancel() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadCancel");
        String cancelName = "foo";
        TestMultiThreadCancelWalker walker = new TestMultiThreadCancelWalker(cancelName , false);
        try {
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1994,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            File last = walker.results.get(((walker.results.size()) - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1995,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1997,last,1996,last.getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1998,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2000,cancel,1999,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2001,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            walker = new TestMultiThreadCancelWalker(cancelName , false);
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2003,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,cancel.getFile(),2005,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2007,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2009,cancel,2008,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            walker = new TestMultiThreadCancelWalker(cancelName , true);
            List<java.io.File> results = walker.find(javaDir);
            File lastFile = results.get(((results.size()) - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2011,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,lastFile,2013,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2015,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
@Test
    public void testMultiThreadCancel_literalMutation3909() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadCancel_literalMutation3909");
        String cancelName = "DirectoryWalker.java";
        TestMultiThreadCancelWalker walker = new TestMultiThreadCancelWalker(cancelName , true);
        try {
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1994,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            File last = walker.results.get(((walker.results.size()) - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1995,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1997,last,1996,last.getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1998,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2000,cancel,1999,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2001,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            walker = new TestMultiThreadCancelWalker(cancelName , false);
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2003,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,cancel.getFile(),2005,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2007,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2009,cancel,2008,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            walker = new TestMultiThreadCancelWalker(cancelName , true);
            List<java.io.File> results = walker.find(javaDir);
            File lastFile = results.get(((results.size()) - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2011,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,lastFile,2013,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2015,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
@Test
    public void testMultiThreadCancel_literalMutation3910() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadCancel_literalMutation3910");
        String cancelName = "DirectoryWalker.java";
        TestMultiThreadCancelWalker walker = new TestMultiThreadCancelWalker(cancelName , false);
        try {
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1994,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            File last = walker.results.get(((walker.results.size()) - 2));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1995,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1997,last,1996,last.getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1998,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2000,cancel,1999,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2001,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            walker = new TestMultiThreadCancelWalker(cancelName , false);
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2003,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,cancel.getFile(),2005,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2007,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2009,cancel,2008,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            walker = new TestMultiThreadCancelWalker(cancelName , true);
            List<java.io.File> results = walker.find(javaDir);
            File lastFile = results.get(((results.size()) - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2011,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,lastFile,2013,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2015,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
@Test
    public void testMultiThreadCancel_literalMutation3911() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadCancel_literalMutation3911");
        String cancelName = "DirectoryWalker.java";
        TestMultiThreadCancelWalker walker = new TestMultiThreadCancelWalker(cancelName , false);
        try {
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1994,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            File last = walker.results.get(((walker.results.size()) - 0));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1995,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1997,last,1996,last.getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1998,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2000,cancel,1999,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2001,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            walker = new TestMultiThreadCancelWalker(cancelName , false);
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2003,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,cancel.getFile(),2005,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2007,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2009,cancel,2008,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            walker = new TestMultiThreadCancelWalker(cancelName , true);
            List<java.io.File> results = walker.find(javaDir);
            File lastFile = results.get(((results.size()) - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2011,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,lastFile,2013,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2015,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
@Test
    public void testMultiThreadCancel_literalMutation3912() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadCancel_literalMutation3912");
        String cancelName = "DirectoryWalker.java";
        TestMultiThreadCancelWalker walker = new TestMultiThreadCancelWalker(cancelName , false);
        try {
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1994,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            File last = walker.results.get(((walker.results.size()) - 0));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1995,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1997,last,1996,last.getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1998,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2000,cancel,1999,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2001,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            walker = new TestMultiThreadCancelWalker(cancelName , false);
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2003,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,cancel.getFile(),2005,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2007,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2009,cancel,2008,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            walker = new TestMultiThreadCancelWalker(cancelName , true);
            List<java.io.File> results = walker.find(javaDir);
            File lastFile = results.get(((results.size()) - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2011,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,lastFile,2013,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2015,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
@Test
    public void testMultiThreadCancel_literalMutation3913() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadCancel_literalMutation3913");
        String cancelName = "DirectoryWalker.java";
        TestMultiThreadCancelWalker walker = new TestMultiThreadCancelWalker(cancelName , false);
        try {
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1994,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            File last = walker.results.get(((walker.results.size()) - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1995,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1997,last,1996,last.getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1998,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2000,cancel,1999,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2001,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "bar";
            walker = new TestMultiThreadCancelWalker(cancelName , false);
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2003,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,cancel.getFile(),2005,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2007,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2009,cancel,2008,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            walker = new TestMultiThreadCancelWalker(cancelName , true);
            List<java.io.File> results = walker.find(javaDir);
            File lastFile = results.get(((results.size()) - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2011,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,lastFile,2013,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2015,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
@Test
    public void testMultiThreadCancel_literalMutation3914() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadCancel_literalMutation3914");
        String cancelName = "DirectoryWalker.java";
        TestMultiThreadCancelWalker walker = new TestMultiThreadCancelWalker(cancelName , false);
        try {
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1994,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            File last = walker.results.get(((walker.results.size()) - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1995,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1997,last,1996,last.getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1998,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2000,cancel,1999,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2001,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            walker = new TestMultiThreadCancelWalker(cancelName , true);
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2003,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,cancel.getFile(),2005,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2007,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2009,cancel,2008,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            walker = new TestMultiThreadCancelWalker(cancelName , true);
            List<java.io.File> results = walker.find(javaDir);
            File lastFile = results.get(((results.size()) - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2011,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,lastFile,2013,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2015,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
@Test
    public void testMultiThreadCancel_literalMutation3915() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadCancel_literalMutation3915");
        String cancelName = "DirectoryWalker.java";
        TestMultiThreadCancelWalker walker = new TestMultiThreadCancelWalker(cancelName , false);
        try {
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1994,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            File last = walker.results.get(((walker.results.size()) - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1995,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1997,last,1996,last.getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1998,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2000,cancel,1999,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2001,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            walker = new TestMultiThreadCancelWalker(cancelName , false);
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2003,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,cancel.getFile(),2005,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2007,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2009,cancel,2008,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            walker = new TestMultiThreadCancelWalker(cancelName , false);
            List<java.io.File> results = walker.find(javaDir);
            File lastFile = results.get(((results.size()) - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2011,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,lastFile,2013,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2015,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
@Test
    public void testMultiThreadCancel_literalMutation3916() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadCancel_literalMutation3916");
        String cancelName = "DirectoryWalker.java";
        TestMultiThreadCancelWalker walker = new TestMultiThreadCancelWalker(cancelName , false);
        try {
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1994,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            File last = walker.results.get(((walker.results.size()) - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1995,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1997,last,1996,last.getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1998,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2000,cancel,1999,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2001,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            walker = new TestMultiThreadCancelWalker(cancelName , false);
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2003,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,cancel.getFile(),2005,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2007,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2009,cancel,2008,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            walker = new TestMultiThreadCancelWalker(cancelName , true);
            List<java.io.File> results = walker.find(javaDir);
            File lastFile = results.get(((results.size()) - 2));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2011,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,lastFile,2013,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2015,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
@Test
    public void testMultiThreadCancel_literalMutation3917() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadCancel_literalMutation3917");
        String cancelName = "DirectoryWalker.java";
        TestMultiThreadCancelWalker walker = new TestMultiThreadCancelWalker(cancelName , false);
        try {
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1994,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            File last = walker.results.get(((walker.results.size()) - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1995,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1997,last,1996,last.getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1998,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2000,cancel,1999,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2001,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            walker = new TestMultiThreadCancelWalker(cancelName , false);
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2003,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,cancel.getFile(),2005,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2007,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2009,cancel,2008,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            walker = new TestMultiThreadCancelWalker(cancelName , true);
            List<java.io.File> results = walker.find(javaDir);
            File lastFile = results.get(((results.size()) - 0));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2011,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,lastFile,2013,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2015,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Cancel
     */
@Test
    public void testMultiThreadCancel_literalMutation3918() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiThreadCancel_literalMutation3918");
        String cancelName = "DirectoryWalker.java";
        TestMultiThreadCancelWalker walker = new TestMultiThreadCancelWalker(cancelName , false);
        try {
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1994,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            File last = walker.results.get(((walker.results.size()) - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1995,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1997,last,1996,last.getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1998,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2000,cancel,1999,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2001,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            cancelName = "commons";
            walker = new TestMultiThreadCancelWalker(cancelName , false);
            walker.find(javaDir);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,(("CancelException not thrown for \'" + cancelName) + "\'"));
        } catch (DirectoryWalker.CancelException cancel) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2003,("File:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,cancel.getFile(),2005,cancel.getFile().getName());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2007,("Depth: " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2009,cancel,2008,cancel.getDepth());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,((("IOException: " + cancelName) + " ") + ex));
        }
        try {
            walker = new TestMultiThreadCancelWalker(cancelName , true);
            List<java.io.File> results = walker.find(javaDir);
            File lastFile = results.get(((results.size()) - 0));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2011,("Suppress:  " + cancelName));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,cancelName);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,lastFile,2013,lastFile.getName());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2015,("Suppress threw " + ex));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering
     */
@Test(timeout = 1000)
    public void testFilterString_add1194() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterString_add1194");
        List<java.lang.String> results = new TestFileFinderString(dirsAndFilesFilter , 2).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1976,((org.apache.commons.io.DirectoryWalkerTestCase.outputFiles.length) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,results,1977,results.size());
        checkContainsString("IO File", ioFiles, results);
        checkContainsString("IO File", ioFiles, results);
        checkContainsString("Output File", outputFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering
     */
@Test(timeout = 1000)
    public void testFilterString_add1195() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterString_add1195");
        List<java.lang.String> results = new TestFileFinderString(dirsAndFilesFilter , 2).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1976,((org.apache.commons.io.DirectoryWalkerTestCase.outputFiles.length) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,results,1977,results.size());
        checkContainsString("IO File", ioFiles, results);
        checkContainsString("Output File", outputFiles, results);
        checkContainsString("Output File", outputFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering
     */
@Test
    public void testFilterString() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterString");
        List<java.lang.String> results = new TestFileFinderString(dirsAndFilesFilter , -2).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1976,((org.apache.commons.io.DirectoryWalkerTestCase.outputFiles.length) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,results,1977,results.size());
        checkContainsString("IO File", ioFiles, results);
        checkContainsString("Output File", outputFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering
     */
@Test
    public void testFilterString_literalMutation3886() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterString_literalMutation3886");
        List<java.lang.String> results = new TestFileFinderString(dirsAndFilesFilter , 0).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1976,((org.apache.commons.io.DirectoryWalkerTestCase.outputFiles.length) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,results,1977,results.size());
        checkContainsString("IO File", ioFiles, results);
        checkContainsString("Output File", outputFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering
     */
@Test
    public void testFilterString_literalMutation3887() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterString_literalMutation3887");
        List<java.lang.String> results = new TestFileFinderString(dirsAndFilesFilter , 0).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1976,((org.apache.commons.io.DirectoryWalkerTestCase.outputFiles.length) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,results,1977,results.size());
        checkContainsString("IO File", ioFiles, results);
        checkContainsString("Output File", outputFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering
     */
@Test
    public void testFilterString_literalMutation3888() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterString_literalMutation3888");
        List<java.lang.String> results = new TestFileFinderString(dirsAndFilesFilter , 2).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1976,((org.apache.commons.io.DirectoryWalkerTestCase.outputFiles.length) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,results,1977,results.size());
        checkContainsString("bar", ioFiles, results);
        checkContainsString("Output File", outputFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering
     */
@Test
    public void testFilterString_literalMutation3889() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterString_literalMutation3889");
        List<java.lang.String> results = new TestFileFinderString(dirsAndFilesFilter , 2).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1976,((org.apache.commons.io.DirectoryWalkerTestCase.outputFiles.length) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,results,1977,results.size());
        checkContainsString("IO File", ioFiles, results);
        checkContainsString("foo", outputFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering
     */
@Test(timeout = 1000)
    public void testFilterString_remove930() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterString_remove930");
        List<java.lang.String> results = new TestFileFinderString(dirsAndFilesFilter , 2).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1976,((org.apache.commons.io.DirectoryWalkerTestCase.outputFiles.length) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,results,1977,results.size());
        checkContainsString("Output File", outputFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Filtering
     */
@Test(timeout = 1000)
    public void testFilterString_remove931() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterString_remove931");
        List<java.lang.String> results = new TestFileFinderString(dirsAndFilesFilter , 2).find(javaDir);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1976,((org.apache.commons.io.DirectoryWalkerTestCase.outputFiles.length) + (org.apache.commons.io.DirectoryWalkerTestCase.ioFiles.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,results,1977,results.size());
        checkContainsString("Output File", outputFiles, results);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test DirectoryWalker implementation that finds files in a directory hierarchy
     * applying a file filter.
     */
private static class TestFileFinder extends DirectoryWalker<java.io.File> {
        protected TestFileFinder(FileFilter filter ,int depthLimit) {
            super(filter, depthLimit);
        }

        protected TestFileFinder(IOFileFilter dirFilter ,IOFileFilter fileFilter ,int depthLimit) {
            super(dirFilter, fileFilter, depthLimit);
        }

        /** 
         * find files.
         */
protected List<java.io.File> find(File startDirectory) {
            List<java.io.File> results = new ArrayList<java.io.File>();
            try {
                walk(startDirectory, results);
            } catch (IOException ex) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1899,ex,1898,ex.toString());
            }
            return results;
        }

        /** 
         * Handles a directory end by adding the File to the result set.
         */
@Override
        protected void handleDirectoryEnd(File directory, int depth, Collection<java.io.File> results) {
            results.add(directory);
        }

        /** 
         * Handles a file by adding the File to the result set.
         */
@Override
        protected void handleFile(File file, int depth, Collection<java.io.File> results) {
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
        protected boolean handleDirectory(File directory, int depth, Collection<java.io.File> results) {
            return false;
        }
    }

    /** 
     * Test DirectoryWalker implementation that finds files in a directory hierarchy
     * applying a file filter.
     */
static class TestCancelWalker extends DirectoryWalker<java.io.File> {
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
protected List<java.io.File> find(File startDirectory) throws IOException {
            List<java.io.File> results = new ArrayList<java.io.File>();
            walk(startDirectory, results);
            return results;
        }

        /** 
         * Handles a directory end by adding the File to the result set.
         */
@Override
        protected void handleDirectoryEnd(File directory, int depth, Collection<java.io.File> results) throws IOException {
            results.add(directory);
            if (cancelFileName.equals(directory.getName())) {
                throw new DirectoryWalker.CancelException(directory , depth);
            } 
        }

        /** 
         * Handles a file by adding the File to the result set.
         */
@Override
        protected void handleFile(File file, int depth, Collection<java.io.File> results) throws IOException {
            results.add(file);
            if (cancelFileName.equals(file.getName())) {
                throw new DirectoryWalker.CancelException(file , depth);
            } 
        }

        /** 
         * Handles Cancel.
         */
@Override
        protected void handleCancelled(File startDirectory, Collection<java.io.File> results, DirectoryWalker.CancelException cancel) throws IOException {
            if (!(suppressCancel)) {
                super.handleCancelled(startDirectory, results, cancel);
            } 
        }
    }

    /** 
     * Test DirectoryWalker implementation that finds files in a directory hierarchy
     * applying a file filter.
     */
static class TestMultiThreadCancelWalker extends DirectoryWalker<java.io.File> {
        private String cancelFileName;

        private boolean suppressCancel;

        private boolean cancelled;

        public List<java.io.File> results;

        TestMultiThreadCancelWalker(String cancelFileName ,boolean suppressCancel) {
            super();
            this.cancelFileName = cancelFileName;
            this.suppressCancel = suppressCancel;
        }

        /** 
         * find files.
         */
protected List<java.io.File> find(File startDirectory) throws IOException {
            results = new ArrayList<java.io.File>();
            walk(startDirectory, results);
            return results;
        }

        /** 
         * Handles a directory end by adding the File to the result set.
         */
@Override
        protected void handleDirectoryEnd(File directory, int depth, Collection<java.io.File> results) throws IOException {
            results.add(directory);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1902,cancelled);
            if (cancelFileName.equals(directory.getName())) {
                cancelled = true;
            } 
        }

        /** 
         * Handles a file by adding the File to the result set.
         */
@Override
        protected void handleFile(File file, int depth, Collection<java.io.File> results) throws IOException {
            results.add(file);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1903,cancelled);
            if (cancelFileName.equals(file.getName())) {
                cancelled = true;
            } 
        }

        /** 
         * Handles Cancelled.
         */
@Override
        protected boolean handleIsCancelled(File file, int depth, Collection<java.io.File> results) throws IOException {
            return cancelled;
        }

        /** 
         * Handles Cancel.
         */
@Override
        protected void handleCancelled(File startDirectory, Collection<java.io.File> results, DirectoryWalker.CancelException cancel) throws IOException {
            if (!(suppressCancel)) {
                super.handleCancelled(startDirectory, results, cancel);
            } 
        }
    }

    /** 
     * Test DirectoryWalker implementation that finds files in a directory hierarchy
     * applying a file filter.
     */
private static class TestFileFinderString extends DirectoryWalker<java.lang.String> {
        protected TestFileFinderString(FileFilter filter ,int depthLimit) {
            super(filter, depthLimit);
        }

        /** 
         * find files.
         */
protected List<java.lang.String> find(File startDirectory) {
            List<java.lang.String> results = new ArrayList<java.lang.String>();
            try {
                walk(startDirectory, results);
            } catch (IOException ex) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1901,ex,1900,ex.toString());
            }
            return results;
        }

        /** 
         * Handles a file by adding the File to the result set.
         */
@Override
        protected void handleFile(File file, int depth, Collection<java.lang.String> results) {
            results.add(file.toString());
        }
    }
}


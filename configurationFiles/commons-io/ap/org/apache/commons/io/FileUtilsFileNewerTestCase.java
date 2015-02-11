package org.apache.commons.io;

import java.io.File;
import org.apache.commons.io.testtools.FileBasedTestCase;
import org.junit.Test;

/** 
 * This is used to test FileUtils for correctness.
 */
public class FileUtilsFileNewerTestCase extends FileBasedTestCase {
    private static final int FILE1_SIZE = 1;

    private static final int FILE2_SIZE = (1024 * 4) + 1;

    private File m_testFile1;

    private File m_testFile2;

    public FileUtilsFileNewerTestCase(String name) {
        super(name);
        m_testFile1 = new File(FileBasedTestCase.getTestDirectory() , "file1-test.txt");
        m_testFile2 = new File(FileBasedTestCase.getTestDirectory() , "file2-test.txt");
    }

    /** 
     * @see junit.framework.TestCase#setUp()
     */
@Override
    protected void setUp() throws Exception {
        FileBasedTestCase.getTestDirectory().mkdirs();
        createFile(m_testFile1, FILE1_SIZE);
        createFile(m_testFile2, FILE2_SIZE);
    }

    /** 
     * @see junit.framework.TestCase#tearDown()
     */
@Override
    protected void tearDown() throws Exception {
        m_testFile1.delete();
        m_testFile2.delete();
    }

    /** 
     * Tests the <code>isFileNewer(File, *)</code> methods which a "normal" file.
     * 
     * @see FileUtils#isFileNewer(File, long)
     * @see FileUtils#isFileNewer(File, Date)
     * @see FileUtils#isFileNewer(File, File)
     */
@Test(timeout = 1000)
    public void testIsFileNewer_add1338() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsFileNewer_add1338");
        if (!(m_testFile1.exists())) {
            throw new IllegalStateException("The m_testFile1 should exist");
        } 
        long fileLastModified = m_testFile1.lastModified();
        final long TWO_SECOND = 2000;
        testIsFileNewer("two second earlier is not newer", m_testFile1, (fileLastModified + TWO_SECOND), false);
        testIsFileNewer("two second earlier is not newer", m_testFile1, (fileLastModified + TWO_SECOND), false);
        testIsFileNewer("same time is not newer", m_testFile1, fileLastModified, false);
        testIsFileNewer("two second later is newer", m_testFile1, (fileLastModified - TWO_SECOND), true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the <code>isFileNewer(File, *)</code> methods which a "normal" file.
     * 
     * @see FileUtils#isFileNewer(File, long)
     * @see FileUtils#isFileNewer(File, Date)
     * @see FileUtils#isFileNewer(File, File)
     */
@Test(timeout = 1000)
    public void testIsFileNewer_add1339() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsFileNewer_add1339");
        if (!(m_testFile1.exists())) {
            throw new IllegalStateException("The m_testFile1 should exist");
        } 
        long fileLastModified = m_testFile1.lastModified();
        final long TWO_SECOND = 2000;
        testIsFileNewer("two second earlier is not newer", m_testFile1, (fileLastModified + TWO_SECOND), false);
        testIsFileNewer("same time is not newer", m_testFile1, fileLastModified, false);
        testIsFileNewer("same time is not newer", m_testFile1, fileLastModified, false);
        testIsFileNewer("two second later is newer", m_testFile1, (fileLastModified - TWO_SECOND), true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the <code>isFileNewer(File, *)</code> methods which a "normal" file.
     * 
     * @see FileUtils#isFileNewer(File, long)
     * @see FileUtils#isFileNewer(File, Date)
     * @see FileUtils#isFileNewer(File, File)
     */
@Test(timeout = 1000)
    public void testIsFileNewer_add1340() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsFileNewer_add1340");
        if (!(m_testFile1.exists())) {
            throw new IllegalStateException("The m_testFile1 should exist");
        } 
        long fileLastModified = m_testFile1.lastModified();
        final long TWO_SECOND = 2000;
        testIsFileNewer("two second earlier is not newer", m_testFile1, (fileLastModified + TWO_SECOND), false);
        testIsFileNewer("same time is not newer", m_testFile1, fileLastModified, false);
        testIsFileNewer("two second later is newer", m_testFile1, (fileLastModified - TWO_SECOND), true);
        testIsFileNewer("two second later is newer", m_testFile1, (fileLastModified - TWO_SECOND), true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the <code>isFileNewer(File, *)</code> methods which a "normal" file.
     * 
     * @see FileUtils#isFileNewer(File, long)
     * @see FileUtils#isFileNewer(File, Date)
     * @see FileUtils#isFileNewer(File, File)
     */
public void testIsFileNewer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsFileNewer");
        if (!(m_testFile1.exists())) {
            throw new IllegalStateException("foo");
        } 
        long fileLastModified = m_testFile1.lastModified();
        final long TWO_SECOND = 2000;
        testIsFileNewer("two second earlier is not newer", m_testFile1, (fileLastModified + TWO_SECOND), false);
        testIsFileNewer("same time is not newer", m_testFile1, fileLastModified, false);
        testIsFileNewer("two second later is newer", m_testFile1, (fileLastModified - TWO_SECOND), true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the <code>isFileNewer(File, *)</code> methods which a "normal" file.
     * 
     * @see FileUtils#isFileNewer(File, long)
     * @see FileUtils#isFileNewer(File, Date)
     * @see FileUtils#isFileNewer(File, File)
     */
public void testIsFileNewer_literalMutation3136() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsFileNewer_literalMutation3136");
        if (!(m_testFile1.exists())) {
            throw new IllegalStateException("The m_testFile1 should exist");
        } 
        long fileLastModified = m_testFile1.lastModified();
        final long TWO_SECOND = 2001;
        testIsFileNewer("two second earlier is not newer", m_testFile1, (fileLastModified + TWO_SECOND), false);
        testIsFileNewer("same time is not newer", m_testFile1, fileLastModified, false);
        testIsFileNewer("two second later is newer", m_testFile1, (fileLastModified - TWO_SECOND), true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the <code>isFileNewer(File, *)</code> methods which a "normal" file.
     * 
     * @see FileUtils#isFileNewer(File, long)
     * @see FileUtils#isFileNewer(File, Date)
     * @see FileUtils#isFileNewer(File, File)
     */
public void testIsFileNewer_literalMutation3137() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsFileNewer_literalMutation3137");
        if (!(m_testFile1.exists())) {
            throw new IllegalStateException("The m_testFile1 should exist");
        } 
        long fileLastModified = m_testFile1.lastModified();
        final long TWO_SECOND = 2000;
        testIsFileNewer("foo", m_testFile1, (fileLastModified + TWO_SECOND), false);
        testIsFileNewer("same time is not newer", m_testFile1, fileLastModified, false);
        testIsFileNewer("two second later is newer", m_testFile1, (fileLastModified - TWO_SECOND), true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the <code>isFileNewer(File, *)</code> methods which a "normal" file.
     * 
     * @see FileUtils#isFileNewer(File, long)
     * @see FileUtils#isFileNewer(File, Date)
     * @see FileUtils#isFileNewer(File, File)
     */
public void testIsFileNewer_literalMutation3138() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsFileNewer_literalMutation3138");
        if (!(m_testFile1.exists())) {
            throw new IllegalStateException("The m_testFile1 should exist");
        } 
        long fileLastModified = m_testFile1.lastModified();
        final long TWO_SECOND = 2000;
        testIsFileNewer("two second earlier is not newer", m_testFile1, (fileLastModified + TWO_SECOND), true);
        testIsFileNewer("same time is not newer", m_testFile1, fileLastModified, false);
        testIsFileNewer("two second later is newer", m_testFile1, (fileLastModified - TWO_SECOND), true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the <code>isFileNewer(File, *)</code> methods which a "normal" file.
     * 
     * @see FileUtils#isFileNewer(File, long)
     * @see FileUtils#isFileNewer(File, Date)
     * @see FileUtils#isFileNewer(File, File)
     */
public void testIsFileNewer_literalMutation3139() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsFileNewer_literalMutation3139");
        if (!(m_testFile1.exists())) {
            throw new IllegalStateException("The m_testFile1 should exist");
        } 
        long fileLastModified = m_testFile1.lastModified();
        final long TWO_SECOND = 2000;
        testIsFileNewer("two second earlier is not newer", m_testFile1, (fileLastModified + TWO_SECOND), false);
        testIsFileNewer("foo", m_testFile1, fileLastModified, false);
        testIsFileNewer("two second later is newer", m_testFile1, (fileLastModified - TWO_SECOND), true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the <code>isFileNewer(File, *)</code> methods which a "normal" file.
     * 
     * @see FileUtils#isFileNewer(File, long)
     * @see FileUtils#isFileNewer(File, Date)
     * @see FileUtils#isFileNewer(File, File)
     */
public void testIsFileNewer_literalMutation3140() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsFileNewer_literalMutation3140");
        if (!(m_testFile1.exists())) {
            throw new IllegalStateException("The m_testFile1 should exist");
        } 
        long fileLastModified = m_testFile1.lastModified();
        final long TWO_SECOND = 2000;
        testIsFileNewer("two second earlier is not newer", m_testFile1, (fileLastModified + TWO_SECOND), false);
        testIsFileNewer("same time is not newer", m_testFile1, fileLastModified, true);
        testIsFileNewer("two second later is newer", m_testFile1, (fileLastModified - TWO_SECOND), true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the <code>isFileNewer(File, *)</code> methods which a "normal" file.
     * 
     * @see FileUtils#isFileNewer(File, long)
     * @see FileUtils#isFileNewer(File, Date)
     * @see FileUtils#isFileNewer(File, File)
     */
public void testIsFileNewer_literalMutation3141() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsFileNewer_literalMutation3141");
        if (!(m_testFile1.exists())) {
            throw new IllegalStateException("The m_testFile1 should exist");
        } 
        long fileLastModified = m_testFile1.lastModified();
        final long TWO_SECOND = 2000;
        testIsFileNewer("two second earlier is not newer", m_testFile1, (fileLastModified + TWO_SECOND), false);
        testIsFileNewer("same time is not newer", m_testFile1, fileLastModified, false);
        testIsFileNewer("foo", m_testFile1, (fileLastModified - TWO_SECOND), true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the <code>isFileNewer(File, *)</code> methods which a "normal" file.
     * 
     * @see FileUtils#isFileNewer(File, long)
     * @see FileUtils#isFileNewer(File, Date)
     * @see FileUtils#isFileNewer(File, File)
     */
public void testIsFileNewer_literalMutation3142() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsFileNewer_literalMutation3142");
        if (!(m_testFile1.exists())) {
            throw new IllegalStateException("The m_testFile1 should exist");
        } 
        long fileLastModified = m_testFile1.lastModified();
        final long TWO_SECOND = 2000;
        testIsFileNewer("two second earlier is not newer", m_testFile1, (fileLastModified + TWO_SECOND), false);
        testIsFileNewer("same time is not newer", m_testFile1, fileLastModified, false);
        testIsFileNewer("two second later is newer", m_testFile1, (fileLastModified - TWO_SECOND), true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the <code>isFileNewer(File, *)</code> methods which a "normal" file.
     * 
     * @see FileUtils#isFileNewer(File, long)
     * @see FileUtils#isFileNewer(File, Date)
     * @see FileUtils#isFileNewer(File, File)
     */
@Test(timeout = 1000)
    public void testIsFileNewer_remove1021() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsFileNewer_remove1021");
        if (!(m_testFile1.exists())) {
            throw new IllegalStateException("The m_testFile1 should exist");
        } 
        long fileLastModified = m_testFile1.lastModified();
        final long TWO_SECOND = 2000;
        testIsFileNewer("same time is not newer", m_testFile1, fileLastModified, false);
        testIsFileNewer("two second later is newer", m_testFile1, (fileLastModified - TWO_SECOND), true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the <code>isFileNewer(File, *)</code> methods which a "normal" file.
     * 
     * @see FileUtils#isFileNewer(File, long)
     * @see FileUtils#isFileNewer(File, Date)
     * @see FileUtils#isFileNewer(File, File)
     */
@Test(timeout = 1000)
    public void testIsFileNewer_remove1022() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsFileNewer_remove1022");
        if (!(m_testFile1.exists())) {
            throw new IllegalStateException("The m_testFile1 should exist");
        } 
        long fileLastModified = m_testFile1.lastModified();
        final long TWO_SECOND = 2000;
        testIsFileNewer("same time is not newer", m_testFile1, fileLastModified, false);
        testIsFileNewer("two second later is newer", m_testFile1, (fileLastModified - TWO_SECOND), true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the <code>isFileNewer(File, *)</code> methods which a "normal" file.
     * 
     * @see FileUtils#isFileNewer(File, long)
     * @see FileUtils#isFileNewer(File, Date)
     * @see FileUtils#isFileNewer(File, File)
     */
@Test(timeout = 1000)
    public void testIsFileNewer_remove1023() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsFileNewer_remove1023");
        if (!(m_testFile1.exists())) {
            throw new IllegalStateException("The m_testFile1 should exist");
        } 
        long fileLastModified = m_testFile1.lastModified();
        final long TWO_SECOND = 2000;
        testIsFileNewer("same time is not newer", m_testFile1, fileLastModified, false);
        testIsFileNewer("two second later is newer", m_testFile1, (fileLastModified - TWO_SECOND), true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the <code>isFileNewer(File, *)</code> methods which a not existing file.
     * 
     * @see FileUtils#isFileNewer(File, long)
     * @see FileUtils#isFileNewer(File, Date)
     * @see FileUtils#isFileNewer(File, File)
     */
@Test(timeout = 1000)
    public void testIsFileNewerImaginaryFile_add1342() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsFileNewerImaginaryFile_add1342");
        File imaginaryFile = new File(FileBasedTestCase.getTestDirectory() , "imaginaryFile");
        if (imaginaryFile.exists()) {
            throw new IllegalStateException("The imaginary File exists");
        } 
        testIsFileNewer("imaginary file can be newer", imaginaryFile, m_testFile2.lastModified(), false);
        testIsFileNewer("imaginary file can be newer", imaginaryFile, m_testFile2.lastModified(), false);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the <code>isFileNewer(File, *)</code> methods which a not existing file.
     * 
     * @see FileUtils#isFileNewer(File, long)
     * @see FileUtils#isFileNewer(File, Date)
     * @see FileUtils#isFileNewer(File, File)
     */
public void testIsFileNewerImaginaryFile() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsFileNewerImaginaryFile");
        File imaginaryFile = new File(FileBasedTestCase.getTestDirectory() , "foo");
        if (imaginaryFile.exists()) {
            throw new IllegalStateException("The imaginary File exists");
        } 
        testIsFileNewer("imaginary file can be newer", imaginaryFile, m_testFile2.lastModified(), false);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the <code>isFileNewer(File, *)</code> methods which a not existing file.
     * 
     * @see FileUtils#isFileNewer(File, long)
     * @see FileUtils#isFileNewer(File, Date)
     * @see FileUtils#isFileNewer(File, File)
     */
public void testIsFileNewerImaginaryFile_literalMutation3144() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsFileNewerImaginaryFile_literalMutation3144");
        File imaginaryFile = new File(FileBasedTestCase.getTestDirectory() , "imaginaryFile");
        if (imaginaryFile.exists()) {
            throw new IllegalStateException("foo");
        } 
        testIsFileNewer("imaginary file can be newer", imaginaryFile, m_testFile2.lastModified(), false);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the <code>isFileNewer(File, *)</code> methods which a not existing file.
     * 
     * @see FileUtils#isFileNewer(File, long)
     * @see FileUtils#isFileNewer(File, Date)
     * @see FileUtils#isFileNewer(File, File)
     */
public void testIsFileNewerImaginaryFile_literalMutation3145() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsFileNewerImaginaryFile_literalMutation3145");
        File imaginaryFile = new File(FileBasedTestCase.getTestDirectory() , "imaginaryFile");
        if (imaginaryFile.exists()) {
            throw new IllegalStateException("The imaginary File exists");
        } 
        testIsFileNewer("foo", imaginaryFile, m_testFile2.lastModified(), false);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the <code>isFileNewer(File, *)</code> methods which a not existing file.
     * 
     * @see FileUtils#isFileNewer(File, long)
     * @see FileUtils#isFileNewer(File, Date)
     * @see FileUtils#isFileNewer(File, File)
     */
public void testIsFileNewerImaginaryFile_literalMutation3146() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsFileNewerImaginaryFile_literalMutation3146");
        File imaginaryFile = new File(FileBasedTestCase.getTestDirectory() , "imaginaryFile");
        if (imaginaryFile.exists()) {
            throw new IllegalStateException("The imaginary File exists");
        } 
        testIsFileNewer("imaginary file can be newer", imaginaryFile, m_testFile2.lastModified(), false);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the <code>isFileNewer(File, *)</code> methods which a not existing file.
     * 
     * @see FileUtils#isFileNewer(File, long)
     * @see FileUtils#isFileNewer(File, Date)
     * @see FileUtils#isFileNewer(File, File)
     */
@Test(timeout = 1000)
    public void testIsFileNewerImaginaryFile_remove1025() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsFileNewerImaginaryFile_remove1025");
        File imaginaryFile = new File(FileBasedTestCase.getTestDirectory() , "imaginaryFile");
        if (imaginaryFile.exists()) {
            throw new IllegalStateException("The imaginary File exists");
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the <code>isFileNewer(File, *)</code> methods which the specified conditions.
     * <p/>
     * Creates :
     * <ul>
     * <li>a <code>Date</code> which represents the time reference</li>
     * <li>a temporary file with the same last modification date than the time reference</li>
     * </ul>
     * Then compares (with the needed <code>isFileNewer</code> method) the last modification date of
     * the specified file with the specified time reference, the created <code>Date</code> and the temporary
     * file.
     * <br/>
     * The test is successfull if the three comparaisons return the specified wanted result.
     * 
     * @param description describes the tested situation
     * @param file the file of which the last modification date is compared
     * @param time the time reference measured in milliseconds since the epoch
     * 
     * @see FileUtils#isFileNewer(File, long)
     * @see FileUtils#isFileNewer(File, Date)
     * @see FileUtils#isFileNewer(File, File)
     */
@Test(timeout = 1000)
    protected void testIsFileNewer(String description, File file, long time, boolean wantedResult) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsFileNewer");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2618,(description + " - time"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2619,wantedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2621,null,2620,org.apache.commons.io.FileUtils.isFileNewer(file, time));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2622,(description + " - date"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2623,wantedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2625,null,2624,org.apache.commons.io.FileUtils.isFileNewer(file, new java.util.Date(time)));
        File temporaryFile = m_testFile2;
        temporaryFile.setLastModified(time);
        temporaryFile.setLastModified(time);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2626,time);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2628,temporaryFile,2627,temporaryFile.lastModified());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2629,(description + " - file"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2630,wantedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2632,null,2631,org.apache.commons.io.FileUtils.isFileNewer(file, temporaryFile));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the <code>isFileNewer(File, *)</code> methods which the specified conditions.
     * <p/>
     * Creates :
     * <ul>
     * <li>a <code>Date</code> which represents the time reference</li>
     * <li>a temporary file with the same last modification date than the time reference</li>
     * </ul>
     * Then compares (with the needed <code>isFileNewer</code> method) the last modification date of
     * the specified file with the specified time reference, the created <code>Date</code> and the temporary
     * file.
     * <br/>
     * The test is successfull if the three comparaisons return the specified wanted result.
     * 
     * @param description describes the tested situation
     * @param file the file of which the last modification date is compared
     * @param time the time reference measured in milliseconds since the epoch
     * 
     * @see FileUtils#isFileNewer(File, long)
     * @see FileUtils#isFileNewer(File, Date)
     * @see FileUtils#isFileNewer(File, File)
     */
@Test(timeout = 1000)
    protected void testIsFileNewer_remove1024(String description, File file, long time, boolean wantedResult) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsFileNewer_remove1024");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2618,(description + " - time"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2619,wantedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2621,null,2620,org.apache.commons.io.FileUtils.isFileNewer(file, time));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2622,(description + " - date"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2623,wantedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2625,null,2624,org.apache.commons.io.FileUtils.isFileNewer(file, new java.util.Date(time)));
        File temporaryFile = m_testFile2;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2626,time);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2628,temporaryFile,2627,temporaryFile.lastModified());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2629,(description + " - file"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2630,wantedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2632,null,2631,org.apache.commons.io.FileUtils.isFileNewer(file, temporaryFile));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the <code>isFileNewer(File, long)</code> method without specifying a <code>File</code>.
     * <br/>
     * The test is successfull if the method throws an <code>IllegalArgumentException</code>.
     */
@Test(timeout = 1000)
    public void testIsFileNewerNoFile_add1344() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsFileNewerNoFile_add1344");
        try {
            org.apache.commons.io.FileUtils.isFileNewer(null, 0);
            org.apache.commons.io.FileUtils.isFileNewer(null, 0);
        } catch (IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the <code>isFileNewer(File, long)</code> method without specifying a <code>File</code>.
     * <br/>
     * The test is successfull if the method throws an <code>IllegalArgumentException</code>.
     */
public void testIsFileNewerNoFile() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsFileNewerNoFile");
        try {
            org.apache.commons.io.FileUtils.isFileNewer(null, 1);
        } catch (IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the <code>isFileNewer(File, Date)</code> method without specifying a <code>Date</code>.
     * <br/>
     * The test is successfull if the method throws an <code>IllegalArgumentException</code>.
     */
@Test(timeout = 1000)
    public void testIsFileNewerNoDate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsFileNewerNoDate");
        try {
            org.apache.commons.io.FileUtils.isFileNewer(m_testFile1, ((java.util.Date)(null)));
            org.apache.commons.io.FileUtils.isFileNewer(m_testFile1, ((java.util.Date)(null)));
        } catch (IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the <code>isFileNewer(File, File)</code> method without specifying a reference <code>File</code>.
     * <br/>
     * The test is successfull if the method throws an <code>IllegalArgumentException</code>.
     */
@Test(timeout = 1000)
    public void testIsFileNewerNoFileReference() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsFileNewerNoFileReference");
        try {
            org.apache.commons.io.FileUtils.isFileNewer(m_testFile1, ((File)(null)));
            org.apache.commons.io.FileUtils.isFileNewer(m_testFile1, ((File)(null)));
        } catch (IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


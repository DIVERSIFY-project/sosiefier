package org.apache.commons.io.comparator;

import java.util.Comparator;
import java.io.File;

/** 
 * Test case for {@link SizeFileComparator}.
 */
public class SizeFileComparatorTest extends ComparatorAbstractTestCase {
    private File smallerDir;

    private File largerDir;

    private File smallerFile;

    private File largerFile;

    /** 
     * Construct a new test case with the specified name.
     * 
     * @param name Name of the test
     */
public SizeFileComparatorTest(String name) {
        super(name);
    }

    /** 
     * @see junit.framework.TestCase#setUp()
     */
@Override
    protected void setUp() throws Exception {
        super.setUp();
        comparator = ((AbstractFileComparator)(SizeFileComparator.SIZE_COMPARATOR));
        reverse = SizeFileComparator.SIZE_REVERSE;
        File dir = org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory();
        smallerDir = new File(dir , "smallerdir");
        largerDir = new File(dir , "largerdir");
        smallerFile = new File(smallerDir , "smaller.txt");
        File equalFile = new File(dir , "equal.txt");
        largerFile = new File(largerDir , "larger.txt");
        smallerDir.mkdir();
        largerDir.mkdir();
        createFile(smallerFile, 32);
        createFile(equalFile, 48);
        createFile(largerFile, 64);
        equalFile1 = equalFile;
        equalFile2 = equalFile;
        lessFile = smallerFile;
        moreFile = largerFile;
    }

    /** 
     * Test a file which doesn't exist.
     */
public void testNonexistantFile() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNonexistantFile");
        File nonexistantFile = new File(new File("foo") , "nonexistant.txt");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1357,nonexistantFile,1356,nonexistantFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1358,((comparator.compare(nonexistantFile, moreFile)) < 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file which doesn't exist.
     */
public void testNonexistantFile_literalMutation2269() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNonexistantFile_literalMutation2269");
        File nonexistantFile = new File(new File(".") , "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1357,nonexistantFile,1356,nonexistantFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1358,((comparator.compare(nonexistantFile, moreFile)) < 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file which doesn't exist.
     */
public void testCompareDirectorySizes() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompareDirectorySizes");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1350,comparator,1349,comparator.compare(smallerDir, largerDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1351,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1353,org.apache.commons.io.comparator.SizeFileComparator.SIZE_SUMDIR_COMPARATOR,1352,org.apache.commons.io.comparator.SizeFileComparator.SIZE_SUMDIR_COMPARATOR.compare(smallerDir, largerDir));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1355,org.apache.commons.io.comparator.SizeFileComparator.SIZE_SUMDIR_REVERSE,1354,org.apache.commons.io.comparator.SizeFileComparator.SIZE_SUMDIR_REVERSE.compare(smallerDir, largerDir));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


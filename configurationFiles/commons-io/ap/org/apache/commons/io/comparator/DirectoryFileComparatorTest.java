package org.apache.commons.io.comparator;

import java.util.Comparator;
import java.io.File;

/** 
 * Test case for {@link DirectoryFileComparator}.
 */
public class DirectoryFileComparatorTest extends ComparatorAbstractTestCase {
    /** 
     * Construct a new test case with the specified name.
     * 
     * @param name Name of the test
     */
public DirectoryFileComparatorTest(String name) {
        super(name);
    }

    /** 
     * @see junit.framework.TestCase#setUp()
     */
@Override
    protected void setUp() throws Exception {
        super.setUp();
        comparator = ((AbstractFileComparator)(DirectoryFileComparator.DIRECTORY_COMPARATOR));
        reverse = DirectoryFileComparator.DIRECTORY_REVERSE;
        File currentDir = new File(".");
        equalFile1 = new File(currentDir , "src");
        equalFile2 = new File(currentDir , "src/site/xdoc");
        lessFile = new File(currentDir , "src");
        moreFile = new File(currentDir , "pom.xml");
    }

    /** 
     * Test the comparator array sort.
     */
@Override
    public void testSortArray() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortArray");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the comparator array sort.
     */
@Override
    public void testSortList() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortList");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


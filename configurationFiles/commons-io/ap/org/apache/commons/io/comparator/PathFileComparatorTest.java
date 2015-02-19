package org.apache.commons.io.comparator;

import java.util.Comparator;
import java.io.File;

/** 
 * Test case for {@link PathFileComparator}.
 */
public class PathFileComparatorTest extends ComparatorAbstractTestCase {
    /** 
     * Construct a new test case with the specified name.
     * 
     * @param name Name of the test
     */
public PathFileComparatorTest(String name) {
        super(name);
    }

    /** 
     * @see junit.framework.TestCase#setUp()
     */
@Override
    protected void setUp() throws Exception {
        super.setUp();
        comparator = ((AbstractFileComparator)(PathFileComparator.PATH_COMPARATOR));
        reverse = PathFileComparator.PATH_REVERSE;
        equalFile1 = new File("foo/file.txt");
        equalFile2 = new File("foo/file.txt");
        lessFile = new File("abc/file.txt");
        moreFile = new File("xyz/file.txt");
    }

    /** 
     * Test case sensitivity
     */
public void testCaseSensitivity() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaseSensitivity");
        File file3 = new File("FOO/file.txt");
        Comparator<java.io.File> sensitive = new PathFileComparator(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1342,((sensitive.compare(equalFile1, equalFile2)) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1343,((sensitive.compare(equalFile1, file3)) > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1344,((sensitive.compare(equalFile1, lessFile)) > 0));
        Comparator<java.io.File> insensitive = PathFileComparator.PATH_INSENSITIVE_COMPARATOR;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1345,((insensitive.compare(equalFile1, equalFile2)) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1346,((insensitive.compare(equalFile1, file3)) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1347,((insensitive.compare(equalFile1, lessFile)) > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1348,((insensitive.compare(file3, lessFile)) > 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test case sensitivity
     */
public void testCaseSensitivity_literalMutation3223() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaseSensitivity_literalMutation3223");
        File file3 = new File("foo");
        Comparator<java.io.File> sensitive = new PathFileComparator(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1342,((sensitive.compare(equalFile1, equalFile2)) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1343,((sensitive.compare(equalFile1, file3)) > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1344,((sensitive.compare(equalFile1, lessFile)) > 0));
        Comparator<java.io.File> insensitive = PathFileComparator.PATH_INSENSITIVE_COMPARATOR;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1345,((insensitive.compare(equalFile1, equalFile2)) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1346,((insensitive.compare(equalFile1, file3)) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1347,((insensitive.compare(equalFile1, lessFile)) > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1348,((insensitive.compare(file3, lessFile)) > 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


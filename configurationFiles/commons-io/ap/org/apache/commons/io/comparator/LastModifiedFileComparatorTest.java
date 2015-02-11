//package org.apache.commons.io.comparator;
//
//import java.util.Comparator;
//import java.io.File;
//
///** 
// * Test case for {@link LastModifiedFileComparator}.
// */
//public class LastModifiedFileComparatorTest extends ComparatorAbstractTestCase {
//    /** 
//     * Construct a new test case with the specified name.
//     * 
//     * @param name Name of the test
//     */
//public LastModifiedFileComparatorTest(String name) {
//        super(name);
//    }
//
//    /** 
//     * @see junit.framework.TestCase#setUp()
//     */
//@Override
//    protected void setUp() throws Exception {
//        super.setUp();
//        comparator = ((AbstractFileComparator)(LastModifiedFileComparator.LASTMODIFIED_COMPARATOR));
//        reverse = LastModifiedFileComparator.LASTMODIFIED_REVERSE;
//        File dir = org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory();
//        File olderFile = new File(dir , "older.txt");
//        createFile(olderFile, 0);
//        File equalFile = new File(dir , "equal.txt");
//        createFile(equalFile, 0);
//        do {
//            try {
//                java.lang.Thread.sleep(300);
//            } catch (InterruptedException ie) {
//            }
//            equalFile.setLastModified(java.lang.System.currentTimeMillis());
//        } while ((olderFile.lastModified()) == (equalFile.lastModified()) );
//        File newerFile = new File(dir , "newer.txt");
//        createFile(newerFile, 0);
//        do {
//            try {
//                java.lang.Thread.sleep(300);
//            } catch (InterruptedException ie) {
//            }
//            newerFile.setLastModified(java.lang.System.currentTimeMillis());
//        } while ((equalFile.lastModified()) == (newerFile.lastModified()) );
//        equalFile1 = equalFile;
//        equalFile2 = equalFile;
//        lessFile = olderFile;
//        moreFile = newerFile;
//    }
//}
//

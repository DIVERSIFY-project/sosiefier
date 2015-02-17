package org.apache.commons.io.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.io.File;
import org.apache.commons.io.testtools.FileBasedTestCase;
import java.util.List;
import org.junit.Test;

/** 
 * Base Test case for Comparator implementations.
 */
public abstract class ComparatorAbstractTestCase extends FileBasedTestCase {
    /** 
     * comparator instance
     */
protected AbstractFileComparator comparator;

    /** 
     * reverse comparator instance
     */
protected Comparator<java.io.File> reverse;

    /** 
     * File which compares equal to  "equalFile2"
     */
protected File equalFile1;

    /** 
     * File which compares equal to  "equalFile1"
     */
protected File equalFile2;

    /** 
     * File which is less than the "moreFile"
     */
protected File lessFile;

    /** 
     * File which is more than the "lessFile"
     */
protected File moreFile;

    /** 
     * Construct a new test case with the specified name
     * @param name Name of the test
     */
public ComparatorAbstractTestCase(String name) {
        super(name);
    }

    /** 
     * @see junit.framework.TestCase#setUp()
     */
@Override
    protected void setUp() throws Exception {
        comparator = ((AbstractFileComparator)(DefaultFileComparator.DEFAULT_COMPARATOR));
        reverse = DefaultFileComparator.DEFAULT_REVERSE;
    }

    /** 
     * @see junit.framework.TestCase#tearDown()
     */
@Override
    protected void tearDown() throws Exception {
        comparator = null;
        reverse = null;
        equalFile1 = null;
        equalFile2 = null;
        lessFile = null;
        moreFile = null;
        org.apache.commons.io.FileUtils.deleteDirectory(FileBasedTestCase.getTestDirectory());
    }

    /** 
     * Test the comparator.
     */
public void testComparator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparator");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1296,comparator,1295,comparator.compare(equalFile1, equalFile2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1297,((comparator.compare(lessFile, moreFile)) < 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1298,((comparator.compare(moreFile, lessFile)) > 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the comparator reversed.
     */
public void testReverseComparator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReverseComparator");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1300,reverse,1299,reverse.compare(equalFile1, equalFile2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1301,((reverse.compare(moreFile, lessFile)) < 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1302,((reverse.compare(lessFile, moreFile)) > 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test comparator array sort is null safe.
     */
public void testSortArrayNull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortArrayNull");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1304,comparator,1303,comparator.sort(((java.io.File[])(null))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the comparator array sort.
     */
@Test(timeout = 1000)
    public void testSortArray_add934() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortArray_add934");
        File[] files = new File[3];
        files[0] = equalFile1;
        files[1] = moreFile;
        files[2] = lessFile;
        comparator.sort(files);
        comparator.sort(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1305,lessFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1306,files[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1307,equalFile1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1308,files[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1309,moreFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1310,files[2]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the comparator array sort.
     */
public void testSortArray() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortArray");
        File[] files = new File[4];
        files[0] = equalFile1;
        files[1] = moreFile;
        files[2] = lessFile;
        comparator.sort(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1305,lessFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1306,files[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1307,equalFile1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1308,files[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1309,moreFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1310,files[2]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the comparator array sort.
     */
public void testSortArray_literalMutation3205() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortArray_literalMutation3205");
        File[] files = new File[2];
        files[0] = equalFile1;
        files[1] = moreFile;
        files[2] = lessFile;
        comparator.sort(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1305,lessFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1306,files[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1307,equalFile1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1308,files[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1309,moreFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1310,files[2]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the comparator array sort.
     */
public void testSortArray_literalMutation3206() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortArray_literalMutation3206");
        File[] files = new File[1];
        files[0] = equalFile1;
        files[1] = moreFile;
        files[2] = lessFile;
        comparator.sort(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1305,lessFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1306,files[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1307,equalFile1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1308,files[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1309,moreFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1310,files[2]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the comparator array sort.
     */
public void testSortArray_literalMutation3207() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortArray_literalMutation3207");
        File[] files = new File[6];
        files[0] = equalFile1;
        files[1] = moreFile;
        files[2] = lessFile;
        comparator.sort(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1305,lessFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1306,files[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1307,equalFile1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1308,files[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1309,moreFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1310,files[2]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the comparator array sort.
     */
public void testSortArray_literalMutation3208() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortArray_literalMutation3208");
        File[] files = new File[3];
        files[1] = equalFile1;
        files[1] = moreFile;
        files[2] = lessFile;
        comparator.sort(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1305,lessFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1306,files[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1307,equalFile1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1308,files[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1309,moreFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1310,files[2]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the comparator array sort.
     */
public void testSortArray_literalMutation3209() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortArray_literalMutation3209");
        File[] files = new File[3];
        files[-1] = equalFile1;
        files[1] = moreFile;
        files[2] = lessFile;
        comparator.sort(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1305,lessFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1306,files[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1307,equalFile1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1308,files[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1309,moreFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1310,files[2]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the comparator array sort.
     */
public void testSortArray_literalMutation3210() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortArray_literalMutation3210");
        File[] files = new File[3];
        files[0] = equalFile1;
        files[1] = moreFile;
        files[2] = lessFile;
        comparator.sort(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1305,lessFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1306,files[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1307,equalFile1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1308,files[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1309,moreFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1310,files[2]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the comparator array sort.
     */
public void testSortArray_literalMutation3211() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortArray_literalMutation3211");
        File[] files = new File[3];
        files[0] = equalFile1;
        files[2] = moreFile;
        files[2] = lessFile;
        comparator.sort(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1305,lessFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1306,files[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1307,equalFile1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1308,files[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1309,moreFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1310,files[2]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the comparator array sort.
     */
public void testSortArray_literalMutation3212() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortArray_literalMutation3212");
        File[] files = new File[3];
        files[0] = equalFile1;
        files[0] = moreFile;
        files[2] = lessFile;
        comparator.sort(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1305,lessFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1306,files[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1307,equalFile1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1308,files[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1309,moreFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1310,files[2]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the comparator array sort.
     */
public void testSortArray_literalMutation3213() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortArray_literalMutation3213");
        File[] files = new File[3];
        files[0] = equalFile1;
        files[0] = moreFile;
        files[2] = lessFile;
        comparator.sort(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1305,lessFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1306,files[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1307,equalFile1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1308,files[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1309,moreFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1310,files[2]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the comparator array sort.
     */
public void testSortArray_literalMutation3214() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortArray_literalMutation3214");
        File[] files = new File[3];
        files[0] = equalFile1;
        files[1] = moreFile;
        files[1] = lessFile;
        comparator.sort(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1305,lessFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1306,files[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1307,equalFile1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1308,files[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1309,moreFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1310,files[2]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the comparator array sort.
     */
public void testSortArray_literalMutation3215() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortArray_literalMutation3215");
        File[] files = new File[3];
        files[0] = equalFile1;
        files[1] = moreFile;
        files[4] = lessFile;
        comparator.sort(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1305,lessFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1306,files[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1307,equalFile1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1308,files[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1309,moreFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1310,files[2]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the comparator array sort.
     */
public void testSortArray_literalMutation3216() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortArray_literalMutation3216");
        File[] files = new File[3];
        files[0] = equalFile1;
        files[1] = moreFile;
        files[3] = lessFile;
        comparator.sort(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1305,lessFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1306,files[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1307,equalFile1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1308,files[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1309,moreFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1310,files[2]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the comparator array sort.
     */
@Test(timeout = 1000)
    public void testSortArray_remove770() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortArray_remove770");
        File[] files = new File[3];
        files[0] = equalFile1;
        files[1] = moreFile;
        files[2] = lessFile;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1305,lessFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1306,files[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1307,equalFile1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1308,files[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1309,moreFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1310,files[2]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the comparator array sort.
     */
@Test(timeout = 1000)
    public void testSortList() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortList");
        List<java.io.File> files = new ArrayList<java.io.File>();
        files.add(equalFile1);
        files.add(equalFile1);
        files.add(moreFile);
        files.add(lessFile);
        comparator.sort(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1313,lessFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1315,files,1314,files.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1316,equalFile1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1318,files,1317,files.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1319,moreFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1321,files,1320,files.get(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the comparator array sort.
     */
@Test(timeout = 1000)
    public void testSortList_add936() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortList_add936");
        List<java.io.File> files = new ArrayList<java.io.File>();
        files.add(equalFile1);
        files.add(moreFile);
        files.add(moreFile);
        files.add(lessFile);
        comparator.sort(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1313,lessFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1315,files,1314,files.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1316,equalFile1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1318,files,1317,files.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1319,moreFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1321,files,1320,files.get(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the comparator array sort.
     */
@Test(timeout = 1000)
    public void testSortList_add937() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortList_add937");
        List<java.io.File> files = new ArrayList<java.io.File>();
        files.add(equalFile1);
        files.add(moreFile);
        files.add(lessFile);
        files.add(lessFile);
        comparator.sort(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1313,lessFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1315,files,1314,files.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1316,equalFile1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1318,files,1317,files.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1319,moreFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1321,files,1320,files.get(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the comparator array sort.
     */
@Test(timeout = 1000)
    public void testSortList_add938() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortList_add938");
        List<java.io.File> files = new ArrayList<java.io.File>();
        files.add(equalFile1);
        files.add(moreFile);
        files.add(lessFile);
        comparator.sort(files);
        comparator.sort(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1313,lessFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1315,files,1314,files.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1316,equalFile1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1318,files,1317,files.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1319,moreFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1321,files,1320,files.get(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the comparator array sort.
     */
@Test(timeout = 1000)
    public void testSortList_remove771() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortList_remove771");
        List<java.io.File> files = new ArrayList<java.io.File>();
        files.add(moreFile);
        files.add(lessFile);
        comparator.sort(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1313,lessFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1315,files,1314,files.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1316,equalFile1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1318,files,1317,files.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1319,moreFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1321,files,1320,files.get(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the comparator array sort.
     */
@Test(timeout = 1000)
    public void testSortList_remove772() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortList_remove772");
        List<java.io.File> files = new ArrayList<java.io.File>();
        files.add(moreFile);
        files.add(lessFile);
        comparator.sort(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1313,lessFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1315,files,1314,files.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1316,equalFile1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1318,files,1317,files.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1319,moreFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1321,files,1320,files.get(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the comparator array sort.
     */
@Test(timeout = 1000)
    public void testSortList_remove773() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortList_remove773");
        List<java.io.File> files = new ArrayList<java.io.File>();
        files.add(moreFile);
        files.add(lessFile);
        comparator.sort(files);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1313,lessFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1315,files,1314,files.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1316,equalFile1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1318,files,1317,files.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1319,moreFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1321,files,1320,files.get(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the comparator array sort.
     */
@Test(timeout = 1000)
    public void testSortList_remove774() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortList_remove774");
        List<java.io.File> files = new ArrayList<java.io.File>();
        files.add(equalFile1);
        files.add(moreFile);
        files.add(lessFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1313,lessFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1315,files,1314,files.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1316,equalFile1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1318,files,1317,files.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1319,moreFile);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1321,files,1320,files.get(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test comparator list sort is null safe.
     */
public void testSortListNull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortListNull");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1312,comparator,1311,comparator.sort(((java.util.List<java.io.File>)(null))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test comparator toString.
     */
public void testToString() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToString");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1323,comparator,1322,comparator.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1325,reverse.toString(),1324,reverse.toString().startsWith("ReverseComparator["));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


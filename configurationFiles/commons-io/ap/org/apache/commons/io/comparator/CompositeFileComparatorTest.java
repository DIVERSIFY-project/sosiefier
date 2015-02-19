package org.apache.commons.io.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.io.File;
import java.util.List;
import org.junit.Test;

/** 
 * Test case for {@link CompositeFileComparator}.
 */
public class CompositeFileComparatorTest extends ComparatorAbstractTestCase {
    /** 
     * Construct a new test case with the specified name.
     * 
     * @param name Name of the test
     */
public CompositeFileComparatorTest(String name) {
        super(name);
    }

    /** 
     * @see junit.framework.TestCase#setUp()
     */
@Override
    protected void setUp() throws Exception {
        super.setUp();
        comparator = new CompositeFileComparator(SizeFileComparator.SIZE_COMPARATOR , ExtensionFileComparator.EXTENSION_COMPARATOR);
        reverse = new ReverseComparator(comparator);
        File dir = org.apache.commons.io.testtools.FileBasedTestCase.getTestDirectory();
        lessFile = new File(dir , "xyz.txt");
        equalFile1 = new File(dir , "foo.txt");
        equalFile2 = new File(dir , "bar.txt");
        moreFile = new File(dir , "foo.xyz");
        createFile(lessFile, 32);
        createFile(equalFile1, 48);
        createFile(equalFile2, 48);
        createFile(moreFile, 48);
    }

    /** 
     * Test Constructor with null Iterable
     */
@Test(timeout = 1000)
    public void testConstructorIterable() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructorIterable");
        List<java.util.Comparator<java.io.File>> list = new ArrayList<java.util.Comparator<java.io.File>>();
        list.add(SizeFileComparator.SIZE_COMPARATOR);
        list.add(SizeFileComparator.SIZE_COMPARATOR);
        list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Comparator<java.io.File> c = new CompositeFileComparator(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1339,c,1338,c.compare(equalFile1, equalFile2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1340,((c.compare(lessFile, moreFile)) < 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1341,((c.compare(moreFile, lessFile)) > 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Constructor with null Iterable
     */
@Test(timeout = 1000)
    public void testConstructorIterable_add940() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructorIterable_add940");
        List<java.util.Comparator<java.io.File>> list = new ArrayList<java.util.Comparator<java.io.File>>();
        list.add(SizeFileComparator.SIZE_COMPARATOR);
        list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Comparator<java.io.File> c = new CompositeFileComparator(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1339,c,1338,c.compare(equalFile1, equalFile2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1340,((c.compare(lessFile, moreFile)) < 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1341,((c.compare(moreFile, lessFile)) > 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Constructor with null Iterable
     */
@Test(timeout = 1000)
    public void testConstructorIterable_remove775() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructorIterable_remove775");
        List<java.util.Comparator<java.io.File>> list = new ArrayList<java.util.Comparator<java.io.File>>();
        list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Comparator<java.io.File> c = new CompositeFileComparator(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1339,c,1338,c.compare(equalFile1, equalFile2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1340,((c.compare(lessFile, moreFile)) < 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1341,((c.compare(moreFile, lessFile)) > 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Constructor with null Iterable
     */
@Test(timeout = 1000)
    public void testConstructorIterable_remove776() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructorIterable_remove776");
        List<java.util.Comparator<java.io.File>> list = new ArrayList<java.util.Comparator<java.io.File>>();
        list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Comparator<java.io.File> c = new CompositeFileComparator(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1339,c,1338,c.compare(equalFile1, equalFile2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1340,((c.compare(lessFile, moreFile)) < 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1341,((c.compare(moreFile, lessFile)) > 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Constructor with null Iterable
     */
public void testConstructorIterableNull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructorIterableNull");
        Comparator<java.io.File> c = new CompositeFileComparator(((Iterable<java.util.Comparator<java.io.File>>)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1333,c,1332,c.compare(lessFile, moreFile));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1335,c,1334,c.compare(moreFile, lessFile));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1337,c,1336,c.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Constructor with null array
     */
public void testConstructorArrayNull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructorArrayNull");
        Comparator<java.io.File> c = new CompositeFileComparator(((Comparator<java.io.File>[])(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1327,c,1326,c.compare(lessFile, moreFile));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1329,c,1328,c.compare(moreFile, lessFile));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1331,c,1330,c.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


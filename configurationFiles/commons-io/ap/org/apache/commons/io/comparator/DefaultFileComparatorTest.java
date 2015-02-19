package org.apache.commons.io.comparator;

import java.util.Comparator;
import java.io.File;

/** 
 * Test case for {@link DefaultFileComparator}.
 */
public class DefaultFileComparatorTest extends ComparatorAbstractTestCase {
    /** 
     * Construct a new test case with the specified name.
     * 
     * @param name Name of the test
     */
public DefaultFileComparatorTest(String name) {
        super(name);
    }

    /** 
     * @see junit.framework.TestCase#setUp()
     */
@Override
    protected void setUp() throws Exception {
        super.setUp();
        comparator = ((AbstractFileComparator)(DefaultFileComparator.DEFAULT_COMPARATOR));
        reverse = DefaultFileComparator.DEFAULT_REVERSE;
        equalFile1 = new File("foo");
        equalFile2 = new File("foo");
        lessFile = new File("abc");
        moreFile = new File("xyz");
    }
}


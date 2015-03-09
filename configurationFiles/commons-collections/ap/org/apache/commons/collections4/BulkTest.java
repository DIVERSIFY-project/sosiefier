package org.apache.commons.collections4;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/** 
 * A {@link TestCase} that can define both simple and bulk test methods.
 * <p/>
 * A <I>simple test method</I> is the type of test traditionally
 * supplied by by {@link TestCase}.  To define a simple test, create a public
 * no-argument method whose name starts with "test".  You can specify the
 * the name of simple test in the constructor of <code>BulkTest</code>;
 * a subsequent call to {@link TestCase#run} will run that simple test.
 * <p/>
 * A <I>bulk test method</I>, on the other hand, returns a new instance
 * of <code>BulkTest</code>, which can itself define new simple and bulk
 * test methods.  By using the {@link #makeSuite} method, you can
 * automatically create a hierarchical suite of tests and child bulk tests.
 * <p/>
 * For instance, consider the following two classes:
 * <p/>
 * <Pre>
 * public class SetTest extends BulkTest {
 * <p/>
 * private Set set;
 * <p/>
 * public SetTest(Set set) {
 * this.set = set;
 * }
 * <p/>
 * public void testContains() {
 * boolean r = set.contains(set.iterator().next()));
 * assertTrue("Set should contain first element, r);
 * }
 * <p/>
 * public void testClear() {
 * set.clear();
 * assertTrue("Set should be empty after clear", set.isEmpty());
 * }
 * }
 * <p/>
 * <p/>
 * public class HashMapTest extends BulkTest {
 * <p/>
 * private Map makeFullMap() {
 * HashMap result = new HashMap();
 * result.put("1", "One");
 * result.put("2", "Two");
 * return result;
 * }
 * <p/>
 * public void testClear() {
 * Map map = makeFullMap();
 * map.clear();
 * assertTrue("Map empty after clear", map.isEmpty());
 * }
 * <p/>
 * public BulkTest bulkTestKeySet() {
 * return new TestSet(makeFullMap().keySet());
 * }
 * <p/>
 * public BulkTest bulkTestEntrySet() {
 * return new TestSet(makeFullMap().entrySet());
 * }
 * }
 * </Pre>
 * <p/>
 * In the above examples, <code>SetTest</code> defines two
 * simple test methods and no bulk test methods; <code>HashMapTest</code>
 * defines one simple test method and two bulk test methods.  When
 * <code>makeSuite(HashMapTest.class).run</code> is executed,
 * <I>five</I> simple test methods will be run, in this order:<P>
 * <p/>
 * <Ol>
 * <Li>HashMapTest.testClear()
 * <Li>HashMapTest.bulkTestKeySet().testContains();
 * <Li>HashMapTest.bulkTestKeySet().testClear();
 * <Li>HashMapTest.bulkTestEntrySet().testContains();
 * <Li>HashMapTest.bulkTestEntrySet().testClear();
 * </Ol>
 * <p/>
 * In the graphical junit test runners, the tests would be displayed in
 * the following tree:<P>
 * <p/>
 * <UL>
 * <LI>HashMapTest</LI>
 * <UL>
 * <LI>testClear
 * <LI>bulkTestKeySet
 * <UL>
 * <LI>testContains
 * <LI>testClear
 * </UL>
 * <LI>bulkTestEntrySet
 * <UL>
 * <LI>testContains
 * <LI>testClear
 * </UL>
 * </UL>
 * </UL>
 * <p/>
 * A subclass can override a superclass's bulk test by
 * returning <code>null</code> from the bulk test method.  If you only
 * want to override specific simple tests within a bulk test, use the
 * {@link #ignoredTests} method.<P>
 * <p/>
 * Note that if you want to use the bulk test methods, you <I>must</I>
 * define your <code>suite()</code> method to use {@link #makeSuite}.
 * The ordinary {@link TestSuite} constructor doesn't know how to
 * interpret bulk test methods.
 * 
 * @version $Id$
 */
public class BulkTest extends TestCase implements Cloneable {
    /** 
     * IBM JDK 1.6.0 has several bugs in their java.util.TreeMap implementation.
     */
protected static final boolean IBMJDK16;

    static {
        final String vmName = java.lang.System.getProperty("java.vm.name");
        final String version = java.lang.System.getProperty("java.version");
        IBMJDK16 = (((vmName != null) && (vmName.equals("IBM J9 VM"))) && (version != null)) && (version.equals("1.6.0"));
    }

    /** 
     * Path to test data resources
     */
protected static final String TEST_DATA_PATH = "src/test/resources/data/test/";

    /** 
     * The full name of this bulk test instance.  This is the full name
     * that is compared to {@link #ignoredTests} to see if this
     * test should be ignored.  It's also displayed in the text runner
     * to ease debugging.
     */
String verboseName;

    /** 
     * Constructs a new <code>BulkTest</code> instance that will run the
     * specified simple test.
     * 
     * @param name the name of the simple test method to run
     */
public BulkTest(final String name) {
        super(name);
        this.verboseName = getClass().getName();
    }

    /** 
     * Creates a clone of this <code>BulkTest</code>.<P>
     * 
     * @return a clone of this <code>BulkTest</code>
     */
@Override
    public Object clone() {
        try {
            return super.clone();
        } catch (final CloneNotSupportedException e) {
            throw new Error();
        }
    }

    /** 
     * Returns an array of test names to ignore.<P>
     * <p/>
     * If a test that's defined by this <code>BulkTest</code> or
     * by one of its bulk test methods has a name that's in the returned
     * array, then that simple test will not be executed.<P>
     * <p/>
     * A test's name is formed by taking the class name of the
     * root <code>BulkTest</code>, eliminating the package name, then
     * appending the names of any bulk test methods that were invoked
     * to get to the simple test, and then appending the simple test
     * method name.  The method names are delimited by periods:
     * <p/>
     * <pre>
     * HashMapTest.bulkTestEntrySet.testClear
     * </pre>
     * 
     * is the name of one of the simple tests defined in the sample classes
     * described above.  If the sample <code>HashMapTest</code> class
     * included this method:
     * 
     * <pre>
     * public String[] ignoredTests() {
     * return new String[] { "HashMapTest.bulkTestEntrySet.testClear" };
     * }
     * </pre>
     * 
     * then the entry set's clear method wouldn't be tested, but the key
     * set's clear method would.
     * 
     * @return an array of the names of tests to ignore, or null if
     * no tests should be ignored
     */
public String[] ignoredTests() {
        return null;
    }

    /** 
     * Returns the display name of this <code>BulkTest</code>.
     * 
     * @return the display name of this <code>BulkTest</code>
     */
@Override
    public String toString() {
        return (((getName()) + "(") + (verboseName)) + ") ";
    }

    /** 
     * Returns a {@link TestSuite} for testing all of the simple tests
     * <I>and</I> all the bulk tests defined by the given class.<P>
     * <p/>
     * The class is examined for simple and bulk test methods; any child
     * bulk tests are also examined recursively; and the results are stored
     * in a hierarchical {@link TestSuite}.<P>
     * <p/>
     * The given class must be a subclass of <code>BulkTest</code> and must
     * not be abstract.<P>
     * 
     * @param c the class to examine for simple and bulk tests
     * @return a {@link TestSuite} containing all the simple and bulk tests
     * defined by that class
     */
public static TestSuite makeSuite(final Class<? extends org.apache.commons.collections4.BulkTest> c) {
        if (java.lang.reflect.Modifier.isAbstract(c.getModifiers())) {
            throw new IllegalArgumentException("Class must not be abstract.");
        } 
        if (!(BulkTest.class.isAssignableFrom(c))) {
            throw new IllegalArgumentException("Class must extend BulkTest.");
        } 
        return new BulkTestSuiteMaker(c).make();
    }
}


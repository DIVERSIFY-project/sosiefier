package org.apache.commons.collections4.comparators;

import org.apache.commons.collections4.AbstractObjectTest;
import java.util.Comparator;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import org.junit.Test;

/** 
 * Abstract test class for testing the Comparator interface.
 * <p/>
 * Concrete subclasses declare the comparator to be tested.
 * They also declare certain aspects of the tests.
 */
public abstract class AbstractComparatorTest<T> extends AbstractObjectTest {
    /** 
     * JUnit constructor.
     * 
     * @param testName the test class name
     */
public AbstractComparatorTest(final String testName) {
        super(testName);
    }

    /** 
     * Implement this method to return a list of sorted objects.
     * 
     * @return sorted objects
     */
public abstract List<T> getComparableObjectsOrdered();

    /** 
     * Implements the abstract superclass method to return the comparator.
     * 
     * @return a full iterator
     */
@Override
    public abstract Comparator<T> makeObject();

    /** 
     * Overrides superclass to block tests.
     */
@Override
    public boolean supportsEmptyCollections() {
        return false;
    }

    /** 
     * Overrides superclass to block tests.
     */
@Override
    public boolean supportsFullCollections() {
        return false;
    }

    /** 
     * Reverse the list.
     */
protected void reverseObjects(final List<?> list) {
        java.util.Collections.reverse(list);
    }

    /** 
     * Randomize the list.
     */
protected void randomizeObjects(final List<?> list) {
        java.util.Collections.shuffle(list);
    }

    /** 
     * Sort the list.
     */
protected void sortObjects(final List<T> list, final Comparator<? super T> comparator) {
        java.util.Collections.sort(list, comparator);
    }

    /** 
     * Test sorting an empty list
     */
@Test(timeout = 1000)
    public void testEmptyListSort() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyListSort");
        final List<T> list = new LinkedList<T>();
        sortObjects(list, makeObject());
        sortObjects(list, makeObject());
        final List<T> list2 = new LinkedList<T>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4456,list2,4455,list2.equals(list));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test sorting an empty list
     */
@Test(timeout = 1000)
    public void testEmptyListSort_remove923() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyListSort_remove923");
        final List<T> list = new LinkedList<T>();
        final List<T> list2 = new LinkedList<T>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4456,list2,4455,list2.equals(list));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test sorting a reversed list.
     */
@Test(timeout = 1000)
    public void testReverseListSort() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReverseListSort");
        final Comparator<T> comparator = makeObject();
        final List<T> randomList = getComparableObjectsOrdered();
        reverseObjects(randomList);
        reverseObjects(randomList);
        sortObjects(randomList, comparator);
        final List<T> orderedList = getComparableObjectsOrdered();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4460,orderedList,4459,orderedList.equals(randomList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test sorting a reversed list.
     */
@Test(timeout = 1000)
    public void testReverseListSort_add1255() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReverseListSort_add1255");
        final Comparator<T> comparator = makeObject();
        final List<T> randomList = getComparableObjectsOrdered();
        reverseObjects(randomList);
        sortObjects(randomList, comparator);
        sortObjects(randomList, comparator);
        final List<T> orderedList = getComparableObjectsOrdered();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4460,orderedList,4459,orderedList.equals(randomList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test sorting a reversed list.
     */
@Test(timeout = 1000)
    public void testReverseListSort_remove926() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReverseListSort_remove926");
        final Comparator<T> comparator = makeObject();
        final List<T> randomList = getComparableObjectsOrdered();
        sortObjects(randomList, comparator);
        final List<T> orderedList = getComparableObjectsOrdered();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4460,orderedList,4459,orderedList.equals(randomList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test sorting a reversed list.
     */
@Test(timeout = 1000)
    public void testReverseListSort_remove927() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReverseListSort_remove927");
        final Comparator<T> comparator = makeObject();
        final List<T> randomList = getComparableObjectsOrdered();
        reverseObjects(randomList);
        final List<T> orderedList = getComparableObjectsOrdered();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4460,orderedList,4459,orderedList.equals(randomList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test sorting a random list.
     */
@Test(timeout = 1000)
    public void testRandomListSort() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRandomListSort");
        final Comparator<T> comparator = makeObject();
        final List<T> randomList = getComparableObjectsOrdered();
        randomizeObjects(randomList);
        randomizeObjects(randomList);
        sortObjects(randomList, comparator);
        final List<T> orderedList = getComparableObjectsOrdered();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4458,orderedList,4457,orderedList.equals(randomList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test sorting a random list.
     */
@Test(timeout = 1000)
    public void testRandomListSort_add1253() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRandomListSort_add1253");
        final Comparator<T> comparator = makeObject();
        final List<T> randomList = getComparableObjectsOrdered();
        randomizeObjects(randomList);
        sortObjects(randomList, comparator);
        sortObjects(randomList, comparator);
        final List<T> orderedList = getComparableObjectsOrdered();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4458,orderedList,4457,orderedList.equals(randomList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test sorting a random list.
     */
@Test(timeout = 1000)
    public void testRandomListSort_remove924() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRandomListSort_remove924");
        final Comparator<T> comparator = makeObject();
        final List<T> randomList = getComparableObjectsOrdered();
        sortObjects(randomList, comparator);
        final List<T> orderedList = getComparableObjectsOrdered();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4458,orderedList,4457,orderedList.equals(randomList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test sorting a random list.
     */
@Test(timeout = 1000)
    public void testRandomListSort_remove925() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRandomListSort_remove925");
        final Comparator<T> comparator = makeObject();
        final List<T> randomList = getComparableObjectsOrdered();
        randomizeObjects(randomList);
        final List<T> orderedList = getComparableObjectsOrdered();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4458,orderedList,4457,orderedList.equals(randomList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Nearly all Comparators should be Serializable.
     */
@Test
    public void testComparatorIsSerializable() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorIsSerializable");
        final Comparator<T> comparator = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4454,(comparator instanceof java.io.Serializable));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public String getCanonicalComparatorName(final Object object) {
        final StringBuilder retval = new StringBuilder();
        retval.append(org.apache.commons.collections4.BulkTest.TEST_DATA_PATH);
        String colName = object.getClass().getName();
        colName = colName.substring(((colName.lastIndexOf(".")) + 1), colName.length());
        retval.append(colName);
        retval.append(".version");
        retval.append(getCompatibilityVersion());
        retval.append(".obj");
        return retval.toString();
    }

    /** 
     * Compare the current serialized form of the Comparator
     * against the canonical version in SVN.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testComparatorCompatibility_add1248() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorCompatibility_add1248");
        if (!(skipSerializedCanonicalTests())) {
            Comparator<T> comparator = null;
            try {
                comparator = ((Comparator<T>)(readExternalFormFromDisk(getCanonicalComparatorName(makeObject()))));
            } catch (final FileNotFoundException exception) {
                final boolean autoCreateSerialized = false;
                if (autoCreateSerialized) {
                    comparator = makeObject();
                    final String fileName = getCanonicalComparatorName(comparator);
                    writeExternalFormToDisk(((java.io.Serializable)(comparator)), fileName);
                    writeExternalFormToDisk(((java.io.Serializable)(comparator)), fileName);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4450,(("Serialized form could not be found.  A serialized version " + "has now been written (and should be added to CVS): ") + fileName));
                } else {
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4451,(("The Serialized form could be located to test serialization " + "compatibility: ") + (exception.getMessage())));
                }
            }
            final List<T> randomList = getComparableObjectsOrdered();
            reverseObjects(randomList);
            sortObjects(randomList, comparator);
            final List<T> orderedList = getComparableObjectsOrdered();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4453,orderedList,4452,orderedList.equals(randomList));
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Compare the current serialized form of the Comparator
     * against the canonical version in SVN.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testComparatorCompatibility_add1249() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorCompatibility_add1249");
        if (!(skipSerializedCanonicalTests())) {
            Comparator<T> comparator = null;
            try {
                comparator = ((Comparator<T>)(readExternalFormFromDisk(getCanonicalComparatorName(makeObject()))));
            } catch (final FileNotFoundException exception) {
                final boolean autoCreateSerialized = false;
                if (autoCreateSerialized) {
                    comparator = makeObject();
                    final String fileName = getCanonicalComparatorName(comparator);
                    writeExternalFormToDisk(((java.io.Serializable)(comparator)), fileName);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4450,(("Serialized form could not be found.  A serialized version " + "has now been written (and should be added to CVS): ") + fileName));
                } else {
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4451,(("The Serialized form could be located to test serialization " + "compatibility: ") + (exception.getMessage())));
                }
            }
            final List<T> randomList = getComparableObjectsOrdered();
            reverseObjects(randomList);
            reverseObjects(randomList);
            sortObjects(randomList, comparator);
            final List<T> orderedList = getComparableObjectsOrdered();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4453,orderedList,4452,orderedList.equals(randomList));
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Compare the current serialized form of the Comparator
     * against the canonical version in SVN.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testComparatorCompatibility_add1250() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorCompatibility_add1250");
        if (!(skipSerializedCanonicalTests())) {
            Comparator<T> comparator = null;
            try {
                comparator = ((Comparator<T>)(readExternalFormFromDisk(getCanonicalComparatorName(makeObject()))));
            } catch (final FileNotFoundException exception) {
                final boolean autoCreateSerialized = false;
                if (autoCreateSerialized) {
                    comparator = makeObject();
                    final String fileName = getCanonicalComparatorName(comparator);
                    writeExternalFormToDisk(((java.io.Serializable)(comparator)), fileName);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4450,(("Serialized form could not be found.  A serialized version " + "has now been written (and should be added to CVS): ") + fileName));
                } else {
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4451,(("The Serialized form could be located to test serialization " + "compatibility: ") + (exception.getMessage())));
                }
            }
            final List<T> randomList = getComparableObjectsOrdered();
            reverseObjects(randomList);
            sortObjects(randomList, comparator);
            sortObjects(randomList, comparator);
            final List<T> orderedList = getComparableObjectsOrdered();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4453,orderedList,4452,orderedList.equals(randomList));
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Compare the current serialized form of the Comparator
     * against the canonical version in SVN.
     */
@SuppressWarnings(value = "unchecked")
    @Test
    public void testComparatorCompatibility() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorCompatibility");
        if (!(skipSerializedCanonicalTests())) {
            Comparator<T> comparator = null;
            try {
                comparator = ((Comparator<T>)(readExternalFormFromDisk(getCanonicalComparatorName(makeObject()))));
            } catch (final FileNotFoundException exception) {
                final boolean autoCreateSerialized = false;
                if (autoCreateSerialized) {
                    comparator = makeObject();
                    final String fileName = getCanonicalComparatorName(comparator);
                    writeExternalFormToDisk(((java.io.Serializable)(comparator)), fileName);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4450,(("Serialized form could not be found.  A serialized version " + "has now been written (and should be added to CVS): ") + fileName));
                } else {
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4451,(("The Serialized form could be located to test serialization " + "compatibility: ") + (exception.getMessage())));
                }
            }
            final List<T> randomList = getComparableObjectsOrdered();
            reverseObjects(randomList);
            sortObjects(randomList, comparator);
            final List<T> orderedList = getComparableObjectsOrdered();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4453,orderedList,4452,orderedList.equals(randomList));
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Compare the current serialized form of the Comparator
     * against the canonical version in SVN.
     */
@SuppressWarnings(value = "unchecked")
    @Test
    public void testComparatorCompatibility_literalMutation1199() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorCompatibility_literalMutation1199");
        if (!(skipSerializedCanonicalTests())) {
            Comparator<T> comparator = null;
            try {
                comparator = ((Comparator<T>)(readExternalFormFromDisk(getCanonicalComparatorName(makeObject()))));
            } catch (final FileNotFoundException exception) {
                final boolean autoCreateSerialized = false;
                if (autoCreateSerialized) {
                    comparator = makeObject();
                    final String fileName = getCanonicalComparatorName(comparator);
                    writeExternalFormToDisk(((java.io.Serializable)(comparator)), fileName);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4450,(("Serialized form could not be found.  A serialized version " + "has now been written (and should be added to CVS): ") + fileName));
                } else {
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4451,(("The Serialized form could be located to test serialization " + "compatibility: ") + (exception.getMessage())));
                }
            }
            final List<T> randomList = getComparableObjectsOrdered();
            reverseObjects(randomList);
            sortObjects(randomList, comparator);
            final List<T> orderedList = getComparableObjectsOrdered();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4453,orderedList,4452,orderedList.equals(randomList));
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Compare the current serialized form of the Comparator
     * against the canonical version in SVN.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testComparatorCompatibility_remove921() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorCompatibility_remove921");
        if (!(skipSerializedCanonicalTests())) {
            Comparator<T> comparator = null;
            try {
                comparator = ((Comparator<T>)(readExternalFormFromDisk(getCanonicalComparatorName(makeObject()))));
            } catch (final FileNotFoundException exception) {
                final boolean autoCreateSerialized = false;
                if (autoCreateSerialized) {
                    comparator = makeObject();
                    final String fileName = getCanonicalComparatorName(comparator);
                    writeExternalFormToDisk(((java.io.Serializable)(comparator)), fileName);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4450,(("Serialized form could not be found.  A serialized version " + "has now been written (and should be added to CVS): ") + fileName));
                } else {
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4451,(("The Serialized form could be located to test serialization " + "compatibility: ") + (exception.getMessage())));
                }
            }
            final List<T> randomList = getComparableObjectsOrdered();
            sortObjects(randomList, comparator);
            final List<T> orderedList = getComparableObjectsOrdered();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4453,orderedList,4452,orderedList.equals(randomList));
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Compare the current serialized form of the Comparator
     * against the canonical version in SVN.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testComparatorCompatibility_remove922() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorCompatibility_remove922");
        if (!(skipSerializedCanonicalTests())) {
            Comparator<T> comparator = null;
            try {
                comparator = ((Comparator<T>)(readExternalFormFromDisk(getCanonicalComparatorName(makeObject()))));
            } catch (final FileNotFoundException exception) {
                final boolean autoCreateSerialized = false;
                if (autoCreateSerialized) {
                    comparator = makeObject();
                    final String fileName = getCanonicalComparatorName(comparator);
                    writeExternalFormToDisk(((java.io.Serializable)(comparator)), fileName);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4450,(("Serialized form could not be found.  A serialized version " + "has now been written (and should be added to CVS): ") + fileName));
                } else {
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4451,(("The Serialized form could be located to test serialization " + "compatibility: ") + (exception.getMessage())));
                }
            }
            final List<T> randomList = getComparableObjectsOrdered();
            reverseObjects(randomList);
            final List<T> orderedList = getComparableObjectsOrdered();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4453,orderedList,4452,orderedList.equals(randomList));
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


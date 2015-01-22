package org.apache.commons.collections4.comparators;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import org.junit.Test;

/** 
 * Test class for FixedOrderComparator.
 * 
 * @version $Id$
 */
public class FixedOrderComparatorTest extends AbstractComparatorTest<java.lang.String> {
    /** 
     * Top cities of the world, by population including metro areas.
     */
private static final String[] topCities = new String[]{ "Tokyo" , "Mexico City" , "Mumbai" , "Sao Paulo" , "New York" , "Shanghai" , "Lagos" , "Los Angeles" , "Calcutta" , "Buenos Aires" };

    public FixedOrderComparatorTest(final String name) {
        super(name);
    }

    @Override
    public Comparator<java.lang.String> makeObject() {
        final FixedOrderComparator<java.lang.String> comparator = new FixedOrderComparator<java.lang.String>(topCities);
        return comparator;
    }

    @Override
    public List<java.lang.String> getComparableObjectsOrdered() {
        return java.util.Arrays.asList(topCities);
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }

    /** 
     * Tests that the constructor plus add method compares items properly.
     */
@Test
    public void testConstructorPlusAdd() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructorPlusAdd");
        final FixedOrderComparator<java.lang.String> comparator = new FixedOrderComparator<java.lang.String>();
        for (final String topCitie : topCities) {
            comparator.add(topCitie);
        }
        final String[] keys = topCities.clone();
        assertComparatorYieldsOrder(keys, comparator);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the array constructor compares items properly.
     */
@Test
    public void testArrayConstructor() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayConstructor");
        final String[] keys = topCities.clone();
        final String[] topCitiesForTest = topCities.clone();
        final FixedOrderComparator<java.lang.String> comparator = new FixedOrderComparator<java.lang.String>(topCitiesForTest);
        assertComparatorYieldsOrder(keys, comparator);
        topCitiesForTest[1] = "Brighton";
        assertComparatorYieldsOrder(keys, comparator);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the array constructor compares items properly.
     */
@Test
    public void testArrayConstructor_literalMutation1226() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayConstructor_literalMutation1226");
        final String[] keys = topCities.clone();
        final String[] topCitiesForTest = topCities.clone();
        final FixedOrderComparator<java.lang.String> comparator = new FixedOrderComparator<java.lang.String>(topCitiesForTest);
        assertComparatorYieldsOrder(keys, comparator);
        topCitiesForTest[0] = "foo";
        assertComparatorYieldsOrder(keys, comparator);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the list constructor.
     */
@Test
    public void testListConstructor() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListConstructor");
        final String[] keys = topCities.clone();
        final List<java.lang.String> topCitiesForTest = new LinkedList<java.lang.String>(java.util.Arrays.asList(topCities));
        final FixedOrderComparator<java.lang.String> comparator = new FixedOrderComparator<java.lang.String>(topCitiesForTest);
        assertComparatorYieldsOrder(keys, comparator);
        topCitiesForTest.set(1, "Brighton");
        assertComparatorYieldsOrder(keys, comparator);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the list constructor.
     */
@Test
    public void testListConstructor_literalMutation1228() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListConstructor_literalMutation1228");
        final String[] keys = topCities.clone();
        final List<java.lang.String> topCitiesForTest = new LinkedList<java.lang.String>(java.util.Arrays.asList(topCities));
        final FixedOrderComparator<java.lang.String> comparator = new FixedOrderComparator<java.lang.String>(topCitiesForTest);
        assertComparatorYieldsOrder(keys, comparator);
        topCitiesForTest.set(0, "foo");
        assertComparatorYieldsOrder(keys, comparator);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests addAsEqual method.
     */
@Test
    public void testAddAsEqual() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddAsEqual");
        final FixedOrderComparator<java.lang.String> comparator = new FixedOrderComparator<java.lang.String>(topCities);
        comparator.addAsEqual("foo", "Minneapolis");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4504,comparator,4503,comparator.compare("New York", "Minneapolis"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4505,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4507,comparator,4506,comparator.compare("Tokyo", "Minneapolis"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4509,comparator,4508,comparator.compare("Shanghai", "Minneapolis"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests addAsEqual method.
     */
@Test
    public void testAddAsEqual_literalMutation1224() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddAsEqual_literalMutation1224");
        final FixedOrderComparator<java.lang.String> comparator = new FixedOrderComparator<java.lang.String>(topCities);
        comparator.addAsEqual("New York", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4504,comparator,4503,comparator.compare("New York", "Minneapolis"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4505,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4507,comparator,4506,comparator.compare("Tokyo", "Minneapolis"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4509,comparator,4508,comparator.compare("Shanghai", "Minneapolis"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests whether or not updates are disabled after a comparison is made.
     */
@Test
    public void testLock() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLock");
        final FixedOrderComparator<java.lang.String> comparator = new FixedOrderComparator<java.lang.String>(topCities);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4511,comparator,4510,comparator.isLocked());
        comparator.compare("foo", "Tokyo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4513,comparator,4512,comparator.isLocked());
        try {
            comparator.add("Minneapolis");
        } catch (final UnsupportedOperationException e) {
        }
        try {
            comparator.addAsEqual("New York", "Minneapolis");
        } catch (final UnsupportedOperationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests whether or not updates are disabled after a comparison is made.
     */
@Test
    public void testLock_literalMutation1230() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLock_literalMutation1230");
        final FixedOrderComparator<java.lang.String> comparator = new FixedOrderComparator<java.lang.String>(topCities);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4511,comparator,4510,comparator.isLocked());
        comparator.compare("New York", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4513,comparator,4512,comparator.isLocked());
        try {
            comparator.add("Minneapolis");
        } catch (final UnsupportedOperationException e) {
        }
        try {
            comparator.addAsEqual("New York", "Minneapolis");
        } catch (final UnsupportedOperationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests whether or not updates are disabled after a comparison is made.
     */
@Test
    public void testLock_literalMutation1231() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLock_literalMutation1231");
        final FixedOrderComparator<java.lang.String> comparator = new FixedOrderComparator<java.lang.String>(topCities);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4511,comparator,4510,comparator.isLocked());
        comparator.compare("New York", "Tokyo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4513,comparator,4512,comparator.isLocked());
        try {
            comparator.add("foo");
        } catch (final UnsupportedOperationException e) {
        }
        try {
            comparator.addAsEqual("New York", "Minneapolis");
        } catch (final UnsupportedOperationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests whether or not updates are disabled after a comparison is made.
     */
@Test
    public void testLock_literalMutation1232() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLock_literalMutation1232");
        final FixedOrderComparator<java.lang.String> comparator = new FixedOrderComparator<java.lang.String>(topCities);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4511,comparator,4510,comparator.isLocked());
        comparator.compare("New York", "Tokyo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4513,comparator,4512,comparator.isLocked());
        try {
            comparator.add("Minneapolis");
        } catch (final UnsupportedOperationException e) {
        }
        try {
            comparator.addAsEqual("foo", "Minneapolis");
        } catch (final UnsupportedOperationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests whether or not updates are disabled after a comparison is made.
     */
@Test
    public void testLock_literalMutation1233() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLock_literalMutation1233");
        final FixedOrderComparator<java.lang.String> comparator = new FixedOrderComparator<java.lang.String>(topCities);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4511,comparator,4510,comparator.isLocked());
        comparator.compare("New York", "Tokyo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4513,comparator,4512,comparator.isLocked());
        try {
            comparator.add("Minneapolis");
        } catch (final UnsupportedOperationException e) {
        }
        try {
            comparator.addAsEqual("New York", "foo");
        } catch (final UnsupportedOperationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUnknownObjectBehavior() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnknownObjectBehavior");
        FixedOrderComparator<java.lang.String> comparator = new FixedOrderComparator<java.lang.String>(topCities);
        try {
            comparator.compare("foo", "Minneapolis");
        } catch (final IllegalArgumentException e) {
        }
        try {
            comparator.compare("Minneapolis", "New York");
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4514,org.apache.commons.collections4.comparators.FixedOrderComparator.UnknownObjectBehavior.EXCEPTION);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4516,comparator,4515,comparator.getUnknownObjectBehavior());
        comparator = new FixedOrderComparator<java.lang.String>(topCities);
        comparator.setUnknownObjectBehavior(FixedOrderComparator.UnknownObjectBehavior.BEFORE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4517,org.apache.commons.collections4.comparators.FixedOrderComparator.UnknownObjectBehavior.BEFORE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4519,comparator,4518,comparator.getUnknownObjectBehavior());
        LinkedList<java.lang.String> keys = new LinkedList<java.lang.String>(java.util.Arrays.asList(topCities));
        keys.addFirst("Minneapolis");
        assertComparatorYieldsOrder(keys.toArray(new String[0]), comparator);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4520,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4522,comparator,4521,comparator.compare("Minneapolis", "New York"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4524,comparator,4523,comparator.compare("New York", "Minneapolis"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4526,comparator,4525,comparator.compare("Minneapolis", "St Paul"));
        comparator = new FixedOrderComparator<java.lang.String>(topCities);
        comparator.setUnknownObjectBehavior(FixedOrderComparator.UnknownObjectBehavior.AFTER);
        keys = new LinkedList<java.lang.String>(java.util.Arrays.asList(topCities));
        keys.add("Minneapolis");
        assertComparatorYieldsOrder(keys.toArray(new String[0]), comparator);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4528,comparator,4527,comparator.compare("Minneapolis", "New York"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4529,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4531,comparator,4530,comparator.compare("New York", "Minneapolis"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4533,comparator,4532,comparator.compare("Minneapolis", "St Paul"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUnknownObjectBehavior_literalMutation1235() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnknownObjectBehavior_literalMutation1235");
        FixedOrderComparator<java.lang.String> comparator = new FixedOrderComparator<java.lang.String>(topCities);
        try {
            comparator.compare("New York", "foo");
        } catch (final IllegalArgumentException e) {
        }
        try {
            comparator.compare("Minneapolis", "New York");
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4514,org.apache.commons.collections4.comparators.FixedOrderComparator.UnknownObjectBehavior.EXCEPTION);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4516,comparator,4515,comparator.getUnknownObjectBehavior());
        comparator = new FixedOrderComparator<java.lang.String>(topCities);
        comparator.setUnknownObjectBehavior(FixedOrderComparator.UnknownObjectBehavior.BEFORE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4517,org.apache.commons.collections4.comparators.FixedOrderComparator.UnknownObjectBehavior.BEFORE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4519,comparator,4518,comparator.getUnknownObjectBehavior());
        LinkedList<java.lang.String> keys = new LinkedList<java.lang.String>(java.util.Arrays.asList(topCities));
        keys.addFirst("Minneapolis");
        assertComparatorYieldsOrder(keys.toArray(new String[0]), comparator);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4520,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4522,comparator,4521,comparator.compare("Minneapolis", "New York"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4524,comparator,4523,comparator.compare("New York", "Minneapolis"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4526,comparator,4525,comparator.compare("Minneapolis", "St Paul"));
        comparator = new FixedOrderComparator<java.lang.String>(topCities);
        comparator.setUnknownObjectBehavior(FixedOrderComparator.UnknownObjectBehavior.AFTER);
        keys = new LinkedList<java.lang.String>(java.util.Arrays.asList(topCities));
        keys.add("Minneapolis");
        assertComparatorYieldsOrder(keys.toArray(new String[0]), comparator);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4528,comparator,4527,comparator.compare("Minneapolis", "New York"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4529,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4531,comparator,4530,comparator.compare("New York", "Minneapolis"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4533,comparator,4532,comparator.compare("Minneapolis", "St Paul"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUnknownObjectBehavior_literalMutation1236() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnknownObjectBehavior_literalMutation1236");
        FixedOrderComparator<java.lang.String> comparator = new FixedOrderComparator<java.lang.String>(topCities);
        try {
            comparator.compare("New York", "Minneapolis");
        } catch (final IllegalArgumentException e) {
        }
        try {
            comparator.compare("foo", "New York");
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4514,org.apache.commons.collections4.comparators.FixedOrderComparator.UnknownObjectBehavior.EXCEPTION);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4516,comparator,4515,comparator.getUnknownObjectBehavior());
        comparator = new FixedOrderComparator<java.lang.String>(topCities);
        comparator.setUnknownObjectBehavior(FixedOrderComparator.UnknownObjectBehavior.BEFORE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4517,org.apache.commons.collections4.comparators.FixedOrderComparator.UnknownObjectBehavior.BEFORE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4519,comparator,4518,comparator.getUnknownObjectBehavior());
        LinkedList<java.lang.String> keys = new LinkedList<java.lang.String>(java.util.Arrays.asList(topCities));
        keys.addFirst("Minneapolis");
        assertComparatorYieldsOrder(keys.toArray(new String[0]), comparator);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4520,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4522,comparator,4521,comparator.compare("Minneapolis", "New York"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4524,comparator,4523,comparator.compare("New York", "Minneapolis"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4526,comparator,4525,comparator.compare("Minneapolis", "St Paul"));
        comparator = new FixedOrderComparator<java.lang.String>(topCities);
        comparator.setUnknownObjectBehavior(FixedOrderComparator.UnknownObjectBehavior.AFTER);
        keys = new LinkedList<java.lang.String>(java.util.Arrays.asList(topCities));
        keys.add("Minneapolis");
        assertComparatorYieldsOrder(keys.toArray(new String[0]), comparator);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4528,comparator,4527,comparator.compare("Minneapolis", "New York"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4529,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4531,comparator,4530,comparator.compare("New York", "Minneapolis"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4533,comparator,4532,comparator.compare("Minneapolis", "St Paul"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUnknownObjectBehavior_literalMutation1237() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnknownObjectBehavior_literalMutation1237");
        FixedOrderComparator<java.lang.String> comparator = new FixedOrderComparator<java.lang.String>(topCities);
        try {
            comparator.compare("New York", "Minneapolis");
        } catch (final IllegalArgumentException e) {
        }
        try {
            comparator.compare("Minneapolis", "foo");
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4514,org.apache.commons.collections4.comparators.FixedOrderComparator.UnknownObjectBehavior.EXCEPTION);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4516,comparator,4515,comparator.getUnknownObjectBehavior());
        comparator = new FixedOrderComparator<java.lang.String>(topCities);
        comparator.setUnknownObjectBehavior(FixedOrderComparator.UnknownObjectBehavior.BEFORE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4517,org.apache.commons.collections4.comparators.FixedOrderComparator.UnknownObjectBehavior.BEFORE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4519,comparator,4518,comparator.getUnknownObjectBehavior());
        LinkedList<java.lang.String> keys = new LinkedList<java.lang.String>(java.util.Arrays.asList(topCities));
        keys.addFirst("Minneapolis");
        assertComparatorYieldsOrder(keys.toArray(new String[0]), comparator);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4520,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4522,comparator,4521,comparator.compare("Minneapolis", "New York"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4524,comparator,4523,comparator.compare("New York", "Minneapolis"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4526,comparator,4525,comparator.compare("Minneapolis", "St Paul"));
        comparator = new FixedOrderComparator<java.lang.String>(topCities);
        comparator.setUnknownObjectBehavior(FixedOrderComparator.UnknownObjectBehavior.AFTER);
        keys = new LinkedList<java.lang.String>(java.util.Arrays.asList(topCities));
        keys.add("Minneapolis");
        assertComparatorYieldsOrder(keys.toArray(new String[0]), comparator);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4528,comparator,4527,comparator.compare("Minneapolis", "New York"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4529,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4531,comparator,4530,comparator.compare("New York", "Minneapolis"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4533,comparator,4532,comparator.compare("Minneapolis", "St Paul"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUnknownObjectBehavior_literalMutation1238() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnknownObjectBehavior_literalMutation1238");
        FixedOrderComparator<java.lang.String> comparator = new FixedOrderComparator<java.lang.String>(topCities);
        try {
            comparator.compare("New York", "Minneapolis");
        } catch (final IllegalArgumentException e) {
        }
        try {
            comparator.compare("Minneapolis", "New York");
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4514,org.apache.commons.collections4.comparators.FixedOrderComparator.UnknownObjectBehavior.EXCEPTION);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4516,comparator,4515,comparator.getUnknownObjectBehavior());
        comparator = new FixedOrderComparator<java.lang.String>(topCities);
        comparator.setUnknownObjectBehavior(FixedOrderComparator.UnknownObjectBehavior.BEFORE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4517,org.apache.commons.collections4.comparators.FixedOrderComparator.UnknownObjectBehavior.BEFORE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4519,comparator,4518,comparator.getUnknownObjectBehavior());
        LinkedList<java.lang.String> keys = new LinkedList<java.lang.String>(java.util.Arrays.asList(topCities));
        keys.addFirst("foo");
        assertComparatorYieldsOrder(keys.toArray(new String[0]), comparator);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4520,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4522,comparator,4521,comparator.compare("Minneapolis", "New York"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4524,comparator,4523,comparator.compare("New York", "Minneapolis"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4526,comparator,4525,comparator.compare("Minneapolis", "St Paul"));
        comparator = new FixedOrderComparator<java.lang.String>(topCities);
        comparator.setUnknownObjectBehavior(FixedOrderComparator.UnknownObjectBehavior.AFTER);
        keys = new LinkedList<java.lang.String>(java.util.Arrays.asList(topCities));
        keys.add("Minneapolis");
        assertComparatorYieldsOrder(keys.toArray(new String[0]), comparator);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4528,comparator,4527,comparator.compare("Minneapolis", "New York"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4529,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4531,comparator,4530,comparator.compare("New York", "Minneapolis"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4533,comparator,4532,comparator.compare("Minneapolis", "St Paul"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUnknownObjectBehavior_literalMutation1239() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnknownObjectBehavior_literalMutation1239");
        FixedOrderComparator<java.lang.String> comparator = new FixedOrderComparator<java.lang.String>(topCities);
        try {
            comparator.compare("New York", "Minneapolis");
        } catch (final IllegalArgumentException e) {
        }
        try {
            comparator.compare("Minneapolis", "New York");
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4514,org.apache.commons.collections4.comparators.FixedOrderComparator.UnknownObjectBehavior.EXCEPTION);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4516,comparator,4515,comparator.getUnknownObjectBehavior());
        comparator = new FixedOrderComparator<java.lang.String>(topCities);
        comparator.setUnknownObjectBehavior(FixedOrderComparator.UnknownObjectBehavior.BEFORE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4517,org.apache.commons.collections4.comparators.FixedOrderComparator.UnknownObjectBehavior.BEFORE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4519,comparator,4518,comparator.getUnknownObjectBehavior());
        LinkedList<java.lang.String> keys = new LinkedList<java.lang.String>(java.util.Arrays.asList(topCities));
        keys.addFirst("Minneapolis");
        assertComparatorYieldsOrder(keys.toArray(new String[1]), comparator);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4520,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4522,comparator,4521,comparator.compare("Minneapolis", "New York"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4524,comparator,4523,comparator.compare("New York", "Minneapolis"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4526,comparator,4525,comparator.compare("Minneapolis", "St Paul"));
        comparator = new FixedOrderComparator<java.lang.String>(topCities);
        comparator.setUnknownObjectBehavior(FixedOrderComparator.UnknownObjectBehavior.AFTER);
        keys = new LinkedList<java.lang.String>(java.util.Arrays.asList(topCities));
        keys.add("Minneapolis");
        assertComparatorYieldsOrder(keys.toArray(new String[0]), comparator);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4528,comparator,4527,comparator.compare("Minneapolis", "New York"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4529,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4531,comparator,4530,comparator.compare("New York", "Minneapolis"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4533,comparator,4532,comparator.compare("Minneapolis", "St Paul"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUnknownObjectBehavior_literalMutation1240() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnknownObjectBehavior_literalMutation1240");
        FixedOrderComparator<java.lang.String> comparator = new FixedOrderComparator<java.lang.String>(topCities);
        try {
            comparator.compare("New York", "Minneapolis");
        } catch (final IllegalArgumentException e) {
        }
        try {
            comparator.compare("Minneapolis", "New York");
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4514,org.apache.commons.collections4.comparators.FixedOrderComparator.UnknownObjectBehavior.EXCEPTION);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4516,comparator,4515,comparator.getUnknownObjectBehavior());
        comparator = new FixedOrderComparator<java.lang.String>(topCities);
        comparator.setUnknownObjectBehavior(FixedOrderComparator.UnknownObjectBehavior.BEFORE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4517,org.apache.commons.collections4.comparators.FixedOrderComparator.UnknownObjectBehavior.BEFORE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4519,comparator,4518,comparator.getUnknownObjectBehavior());
        LinkedList<java.lang.String> keys = new LinkedList<java.lang.String>(java.util.Arrays.asList(topCities));
        keys.addFirst("Minneapolis");
        assertComparatorYieldsOrder(keys.toArray(new String[0]), comparator);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4520,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4522,comparator,4521,comparator.compare("Minneapolis", "New York"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4524,comparator,4523,comparator.compare("New York", "Minneapolis"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4526,comparator,4525,comparator.compare("Minneapolis", "St Paul"));
        comparator = new FixedOrderComparator<java.lang.String>(topCities);
        comparator.setUnknownObjectBehavior(FixedOrderComparator.UnknownObjectBehavior.AFTER);
        keys = new LinkedList<java.lang.String>(java.util.Arrays.asList(topCities));
        keys.add("foo");
        assertComparatorYieldsOrder(keys.toArray(new String[0]), comparator);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4528,comparator,4527,comparator.compare("Minneapolis", "New York"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4529,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4531,comparator,4530,comparator.compare("New York", "Minneapolis"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4533,comparator,4532,comparator.compare("Minneapolis", "St Paul"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUnknownObjectBehavior_literalMutation1241() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnknownObjectBehavior_literalMutation1241");
        FixedOrderComparator<java.lang.String> comparator = new FixedOrderComparator<java.lang.String>(topCities);
        try {
            comparator.compare("New York", "Minneapolis");
        } catch (final IllegalArgumentException e) {
        }
        try {
            comparator.compare("Minneapolis", "New York");
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4514,org.apache.commons.collections4.comparators.FixedOrderComparator.UnknownObjectBehavior.EXCEPTION);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4516,comparator,4515,comparator.getUnknownObjectBehavior());
        comparator = new FixedOrderComparator<java.lang.String>(topCities);
        comparator.setUnknownObjectBehavior(FixedOrderComparator.UnknownObjectBehavior.BEFORE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4517,org.apache.commons.collections4.comparators.FixedOrderComparator.UnknownObjectBehavior.BEFORE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4519,comparator,4518,comparator.getUnknownObjectBehavior());
        LinkedList<java.lang.String> keys = new LinkedList<java.lang.String>(java.util.Arrays.asList(topCities));
        keys.addFirst("Minneapolis");
        assertComparatorYieldsOrder(keys.toArray(new String[0]), comparator);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4520,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4522,comparator,4521,comparator.compare("Minneapolis", "New York"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4524,comparator,4523,comparator.compare("New York", "Minneapolis"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4526,comparator,4525,comparator.compare("Minneapolis", "St Paul"));
        comparator = new FixedOrderComparator<java.lang.String>(topCities);
        comparator.setUnknownObjectBehavior(FixedOrderComparator.UnknownObjectBehavior.AFTER);
        keys = new LinkedList<java.lang.String>(java.util.Arrays.asList(topCities));
        keys.add("Minneapolis");
        assertComparatorYieldsOrder(keys.toArray(new String[-1]), comparator);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4528,comparator,4527,comparator.compare("Minneapolis", "New York"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4529,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4531,comparator,4530,comparator.compare("New York", "Minneapolis"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4533,comparator,4532,comparator.compare("Minneapolis", "St Paul"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Shuffles the keys and asserts that the comparator sorts them back to
     * their original order.
     */
private void assertComparatorYieldsOrder(final String[] orderedObjects, final Comparator<java.lang.String> comparator) {
        final String[] keys = orderedObjects.clone();
        boolean isInNewOrder = false;
        final Random rand = new Random();
        while (((keys.length) > 1) && (!isInNewOrder)) {
            for (int i = (keys.length) - 1 ; i > 0 ; i--) {
                final String swap = keys[i];
                final int j = rand.nextInt((i + 1));
                keys[i] = keys[j];
                keys[j] = swap;
            }
            for (int i = 0 ; (i < (keys.length)) && (!isInNewOrder) ; i++) {
                if (!(orderedObjects[i].equals(keys[i]))) {
                    isInNewOrder = true;
                } 
            }
        }
        java.util.Arrays.sort(keys, comparator);
        for (int i = 0 ; i < (orderedObjects.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4501,orderedObjects[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4502,keys[i]);
        }
    }
}


package org.apache.commons.collections4.functors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;

/** 
 * Base class for tests of composite predicates.
 * 
 * @version $Id$
 * @since 3.0
 */
public abstract class AbstractCompositePredicateTest<T> extends AbstractMockPredicateTest<T> {
    /** 
     * Creates a new <code>TestCompositePredicate</code>.
     * 
     * @param testValue the value which the mock predicates should expect to see (may be null).
     */
protected AbstractCompositePredicateTest(final T testValue) {
        super(testValue);
    }

    /** 
     * Creates an instance of the predicate to test.
     * 
     * @param predicates the arguments to <code>getInstance</code>.
     * @return a predicate to test.
     */
protected abstract Predicate<T> getPredicateInstance(final Predicate<? super T>... predicates);

    /** 
     * Creates an instance of the predicate to test.
     * 
     * @param predicates the argument to <code>getInstance</code>.
     * @return a predicate to test.
     */
protected abstract Predicate<T> getPredicateInstance(final Collection<org.apache.commons.collections4.Predicate<T>> predicates);

    /** 
     * Creates an instance of the predicate to test.
     * 
     * @param mockReturnValues the return values for the mock predicates, or null if that mock is not expected
     * to be called
     * @return a predicate to test.
     */
protected final Predicate<T> getPredicateInstance(final Boolean... mockReturnValues) {
        final List<org.apache.commons.collections4.Predicate<T>> predicates = new ArrayList<org.apache.commons.collections4.Predicate<T>>();
        for (final Boolean returnValue : mockReturnValues) {
            predicates.add(createMockPredicate(returnValue));
        }
        return getPredicateInstance(predicates);
    }

    /** 
     * Tests whether <code>getInstance</code> with a one element array returns the first element in the array.
     */
@SuppressWarnings(value = "unchecked")
    public void singleElementArrayToGetInstance() {
        final Predicate<T> predicate = createMockPredicate(null);
        final Predicate<T> allPredicate = getPredicateInstance(predicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4411,predicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4412,allPredicate);
    }

    /** 
     * Tests that passing a singleton collection to <code>getInstance</code> returns the single element in the
     * collection.
     */
public void singletonCollectionToGetInstance() {
        final Predicate<T> predicate = createMockPredicate(null);
        final Predicate<T> allPredicate = getPredicateInstance(java.util.Collections.<Predicate<T>>singleton(predicate));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4413,predicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4414,allPredicate);
    }

    /** 
     * Tests <code>getInstance</code> with a null predicate array.
     */
@Test(expected = IllegalArgumentException.class, timeout = 1000)
    public final void nullArrayToGetInstance() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "nullArrayToGetInstance");
        getPredicateInstance(((Predicate<T>[])(null)));
        getPredicateInstance(((Predicate<T>[])(null)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests <code>getInstance</code> with a null predicate array.
     */
@Test(expected = IllegalArgumentException.class, timeout = 1000)
    public final void nullArrayToGetInstance_remove894() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "nullArrayToGetInstance_remove894");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests <code>getInstance</code> with a single null element in the predicate array.
     */
@SuppressWarnings(value = { "unchecked" })
    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public final void nullElementInArrayToGetInstance_add1220() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "nullElementInArrayToGetInstance_add1220");
        getPredicateInstance(new Predicate[]{ null });
        getPredicateInstance(new Predicate[]{ null });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests <code>getInstance</code> with a single null element in the predicate array.
     */
@SuppressWarnings(value = { "foo" })
    @Test(expected = IllegalArgumentException.class)
    public final void nullElementInArrayToGetInstance() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "nullElementInArrayToGetInstance");
        getPredicateInstance(new Predicate[]{ null });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests <code>getInstance</code> with a single null element in the predicate array.
     */
@SuppressWarnings(value = { "unchecked" })
    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public final void nullElementInArrayToGetInstance_remove896() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "nullElementInArrayToGetInstance_remove896");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests <code>getInstance</code> with two null elements in the predicate array.
     */
@SuppressWarnings(value = { "unchecked" })
    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public final void nullElementsInArrayToGetInstance_add1221() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "nullElementsInArrayToGetInstance_add1221");
        getPredicateInstance(new Predicate[]{ null , null });
        getPredicateInstance(new Predicate[]{ null , null });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests <code>getInstance</code> with two null elements in the predicate array.
     */
@SuppressWarnings(value = { "foo" })
    @Test(expected = IllegalArgumentException.class)
    public final void nullElementsInArrayToGetInstance() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "nullElementsInArrayToGetInstance");
        getPredicateInstance(new Predicate[]{ null , null });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests <code>getInstance</code> with two null elements in the predicate array.
     */
@SuppressWarnings(value = { "unchecked" })
    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public final void nullElementsInArrayToGetInstance_remove897() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "nullElementsInArrayToGetInstance_remove897");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests <code>getInstance</code> with a null predicate collection
     */
@Test(expected = IllegalArgumentException.class, timeout = 1000)
    public final void nullCollectionToGetInstance() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "nullCollectionToGetInstance");
        getPredicateInstance(((Collection<org.apache.commons.collections4.Predicate<T>>)(null)));
        getPredicateInstance(((Collection<org.apache.commons.collections4.Predicate<T>>)(null)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests <code>getInstance</code> with a null predicate collection
     */
@Test(expected = IllegalArgumentException.class, timeout = 1000)
    public final void nullCollectionToGetInstance_remove895() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "nullCollectionToGetInstance_remove895");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests <code>getInstance</code> with a predicate collection that contains null elements
     */
@Test(expected = IllegalArgumentException.class, timeout = 1000)
    public final void nullElementsInCollectionToGetInstance() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "nullElementsInCollectionToGetInstance");
        final Collection<org.apache.commons.collections4.Predicate<T>> coll = new ArrayList<org.apache.commons.collections4.Predicate<T>>();
        coll.add(null);
        coll.add(null);
        coll.add(null);
        getPredicateInstance(coll);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests <code>getInstance</code> with a predicate collection that contains null elements
     */
@Test(expected = IllegalArgumentException.class, timeout = 1000)
    public final void nullElementsInCollectionToGetInstance_add1223() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "nullElementsInCollectionToGetInstance_add1223");
        final Collection<org.apache.commons.collections4.Predicate<T>> coll = new ArrayList<org.apache.commons.collections4.Predicate<T>>();
        coll.add(null);
        coll.add(null);
        coll.add(null);
        getPredicateInstance(coll);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests <code>getInstance</code> with a predicate collection that contains null elements
     */
@Test(expected = IllegalArgumentException.class, timeout = 1000)
    public final void nullElementsInCollectionToGetInstance_add1224() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "nullElementsInCollectionToGetInstance_add1224");
        final Collection<org.apache.commons.collections4.Predicate<T>> coll = new ArrayList<org.apache.commons.collections4.Predicate<T>>();
        coll.add(null);
        coll.add(null);
        getPredicateInstance(coll);
        getPredicateInstance(coll);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests <code>getInstance</code> with a predicate collection that contains null elements
     */
@Test(expected = IllegalArgumentException.class, timeout = 1000)
    public final void nullElementsInCollectionToGetInstance_remove898() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "nullElementsInCollectionToGetInstance_remove898");
        final Collection<org.apache.commons.collections4.Predicate<T>> coll = new ArrayList<org.apache.commons.collections4.Predicate<T>>();
        coll.add(null);
        getPredicateInstance(coll);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests <code>getInstance</code> with a predicate collection that contains null elements
     */
@Test(expected = IllegalArgumentException.class, timeout = 1000)
    public final void nullElementsInCollectionToGetInstance_remove899() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "nullElementsInCollectionToGetInstance_remove899");
        final Collection<org.apache.commons.collections4.Predicate<T>> coll = new ArrayList<org.apache.commons.collections4.Predicate<T>>();
        coll.add(null);
        getPredicateInstance(coll);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests <code>getInstance</code> with a predicate collection that contains null elements
     */
@Test(expected = IllegalArgumentException.class, timeout = 1000)
    public final void nullElementsInCollectionToGetInstance_remove900() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "nullElementsInCollectionToGetInstance_remove900");
        final Collection<org.apache.commons.collections4.Predicate<T>> coll = new ArrayList<org.apache.commons.collections4.Predicate<T>>();
        coll.add(null);
        coll.add(null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


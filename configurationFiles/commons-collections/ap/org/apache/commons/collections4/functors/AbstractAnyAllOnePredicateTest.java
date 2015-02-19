package org.apache.commons.collections4.functors;

import org.apache.commons.collections4.Predicate;
import org.junit.Test;

/** 
 * Base class for tests of AnyPredicate, AllPredicate, and OnePredicate.
 * 
 * @version $Id$
 * @since 3.0
 */
public abstract class AbstractAnyAllOnePredicateTest<T> extends AbstractCompositePredicateTest<T> {
    /** 
     * Creates a new <code>TestCompositePredicate</code>.
     * 
     * @param testValue the value which the mock predicates should expect to see (may be null).
     */
protected AbstractAnyAllOnePredicateTest(final T testValue) {
        super(testValue);
    }

    /** 
     * Tests whether <code>getInstance</code> with a one element array returns the first element in the array.
     */
@SuppressWarnings(value = "unchecked")
    @Test
    public final void singleElementArrayToGetInstance() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "singleElementArrayToGetInstance");
        final Predicate<T> predicate = createMockPredicate(null);
        final Predicate<T> allPredicate = getPredicateInstance(predicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4402,predicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4403,allPredicate);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that passing a singleton collection to <code>getInstance</code> returns the single element in the
     * collection.
     */
@Override
    @Test
    public final void singletonCollectionToGetInstance() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "singletonCollectionToGetInstance");
        final Predicate<T> predicate = createMockPredicate(null);
        final Predicate<T> allPredicate = getPredicateInstance(java.util.Collections.<Predicate<T>>singleton(predicate));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4408,predicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4409,allPredicate);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests creating composite predicate instances with single predicates and verifies that the composite returns
     * the same value as the single predicate does.
     */
@SuppressWarnings(value = "boxing")
    public final void singleValues() {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4405,getPredicateInstance(true),4404,getPredicateInstance(true).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4407,getPredicateInstance(false),4406,getPredicateInstance(false).evaluate(null));
    }
}


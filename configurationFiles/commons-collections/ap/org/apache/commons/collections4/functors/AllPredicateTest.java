package org.apache.commons.collections4.functors;

import java.util.Collection;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;

/** 
 * Tests the org.apache.commons.collections.functors.AllPredicate class.
 * 
 * @version $Id$
 * @since 3.0
 */
@SuppressWarnings(value = "boxing")
public class AllPredicateTest extends AbstractAnyAllOnePredicateTest<java.lang.Integer> {
    /** 
     * Creates a new <code>TestAllPredicate</code>.
     */
public AllPredicateTest() {
        super(42);
    }

    /** 
     * {@inheritDoc}
     */
@Override
    protected final Predicate<java.lang.Integer> getPredicateInstance(final Predicate<? super java.lang.Integer>... predicates) {
        return org.apache.commons.collections4.functors.AllPredicate.allPredicate(predicates);
    }

    /** 
     * {@inheritDoc}
     */
@Override
    protected final Predicate<java.lang.Integer> getPredicateInstance(final Collection<org.apache.commons.collections4.Predicate<java.lang.Integer>> predicates) {
        return org.apache.commons.collections4.functors.AllPredicate.allPredicate(predicates);
    }

    /** 
     * Verifies that providing an empty predicate array evaluates to true.
     */
@SuppressWarnings(value = { "foo" })
    @Test
    public void emptyArrayToGetInstance() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "emptyArrayToGetInstance");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4425,getPredicateInstance(new org.apache.commons.collections4.Predicate[]{  }),4424,getPredicateInstance(new org.apache.commons.collections4.Predicate[]{  }).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Verifies that providing an empty predicate collection evaluates to true.
     */
@Test
    public void emptyCollectionToGetInstance() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "emptyCollectionToGetInstance");
        final Predicate<java.lang.Integer> allPredicate = getPredicateInstance(java.util.Collections.<Predicate<java.lang.Integer>>emptyList());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4427,allPredicate,4426,allPredicate.evaluate(getTestValue()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests whether a single true predicate evaluates to true.
     */
@SuppressWarnings(value = "unchecked")
    @Test
    public void oneTruePredicate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "oneTruePredicate");
        final Predicate<java.lang.Integer> predicate = createMockPredicate(true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4431,org.apache.commons.collections4.functors.AllPredicate.allPredicate(predicate),4430,org.apache.commons.collections4.functors.AllPredicate.allPredicate(predicate).evaluate(getTestValue()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests whether a single true predicate evaluates to true.
     */
@SuppressWarnings(value = "unchecked")
    @Test
    public void oneTruePredicate_literalMutation1174() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "oneTruePredicate_literalMutation1174");
        final Predicate<java.lang.Integer> predicate = createMockPredicate(false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4431,org.apache.commons.collections4.functors.AllPredicate.allPredicate(predicate),4430,org.apache.commons.collections4.functors.AllPredicate.allPredicate(predicate).evaluate(getTestValue()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests whether a single false predicate evaluates to true.
     */
@SuppressWarnings(value = "unchecked")
    @Test
    public void oneFalsePredicate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "oneFalsePredicate");
        final Predicate<java.lang.Integer> predicate = createMockPredicate(false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4429,org.apache.commons.collections4.functors.AllPredicate.allPredicate(predicate),4428,org.apache.commons.collections4.functors.AllPredicate.allPredicate(predicate).evaluate(getTestValue()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests whether a single false predicate evaluates to true.
     */
@SuppressWarnings(value = "unchecked")
    @Test
    public void oneFalsePredicate_literalMutation1172() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "oneFalsePredicate_literalMutation1172");
        final Predicate<java.lang.Integer> predicate = createMockPredicate(false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4429,org.apache.commons.collections4.functors.AllPredicate.allPredicate(predicate),4428,org.apache.commons.collections4.functors.AllPredicate.allPredicate(predicate).evaluate(getTestValue()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests whether multiple true predicates evaluates to true.
     */
@Test
    public void allTrue() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "allTrue");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4421,getPredicateInstance(true, true),4420,getPredicateInstance(true, true).evaluate(getTestValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4423,getPredicateInstance(true, true, true),4422,getPredicateInstance(true, true, true).evaluate(getTestValue()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests whether combining some true and one false evalutes to false.  Also verifies that only the first
     * false predicate is actually evaluated
     */
@Test
    public void trueAndFalseCombined() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "trueAndFalseCombined");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4433,getPredicateInstance(false, null),4432,getPredicateInstance(false, null).evaluate(getTestValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4435,getPredicateInstance(false, null, null),4434,getPredicateInstance(false, null, null).evaluate(getTestValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4437,getPredicateInstance(true, false, null),4436,getPredicateInstance(true, false, null).evaluate(getTestValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4439,getPredicateInstance(true, true, false),4438,getPredicateInstance(true, true, false).evaluate(getTestValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4441,getPredicateInstance(true, true, false, null),4440,getPredicateInstance(true, true, false, null).evaluate(getTestValue()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


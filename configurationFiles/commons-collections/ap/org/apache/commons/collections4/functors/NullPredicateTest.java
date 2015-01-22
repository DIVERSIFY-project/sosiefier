package org.apache.commons.collections4.functors;

import org.apache.commons.collections4.Predicate;
import org.junit.Test;

public class NullPredicateTest extends AbstractPredicateTest {
    @Test
    public void testNullPredicate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullPredicate");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4449,null,4448,org.apache.commons.collections4.functors.NullPredicate.nullPredicate());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4449,null,4448,org.apache.commons.collections4.functors.NullPredicate.nullPredicate());
        assertTrue(org.apache.commons.collections4.functors.NullPredicate.nullPredicate(), null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void ensurePredicateCanBeTypedWithoutWarning() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "ensurePredicateCanBeTypedWithoutWarning");
        final Predicate<java.lang.String> predicate = org.apache.commons.collections4.functors.NullPredicate.nullPredicate();
        assertFalse(predicate, cString);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    protected Predicate<?> generatePredicate() {
        return org.apache.commons.collections4.functors.NullPredicate.nullPredicate();
    }
}


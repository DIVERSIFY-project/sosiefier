package org.apache.commons.collections4.functors;

import org.apache.commons.collections4.Predicate;
import org.junit.Test;

public class NullPredicateTest extends AbstractPredicateTest {
    @Test(timeout = 1000)
    public void testNullPredicate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullPredicate");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4449,null,4448,org.apache.commons.collections4.functors.NullPredicate.nullPredicate());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4449,null,4448,org.apache.commons.collections4.functors.NullPredicate.nullPredicate());
        assertTrue(org.apache.commons.collections4.functors.NullPredicate.nullPredicate(), null);
        assertTrue(org.apache.commons.collections4.functors.NullPredicate.nullPredicate(), null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullPredicate_remove920() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullPredicate_remove920");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4449,null,4448,org.apache.commons.collections4.functors.NullPredicate.nullPredicate());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4449,null,4448,org.apache.commons.collections4.functors.NullPredicate.nullPredicate());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void ensurePredicateCanBeTypedWithoutWarning() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "ensurePredicateCanBeTypedWithoutWarning");
        final Predicate<java.lang.String> predicate = org.apache.commons.collections4.functors.NullPredicate.nullPredicate();
        assertFalse(predicate, cString);
        assertFalse(predicate, cString);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void ensurePredicateCanBeTypedWithoutWarning_remove919() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "ensurePredicateCanBeTypedWithoutWarning_remove919");
        final Predicate<java.lang.String> predicate = org.apache.commons.collections4.functors.NullPredicate.nullPredicate();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    protected Predicate<?> generatePredicate() {
        return org.apache.commons.collections4.functors.NullPredicate.nullPredicate();
    }
}


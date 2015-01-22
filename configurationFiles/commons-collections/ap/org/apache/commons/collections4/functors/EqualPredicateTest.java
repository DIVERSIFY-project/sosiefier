package org.apache.commons.collections4.functors;

import org.apache.commons.collections4.Predicate;
import org.junit.Test;

public class EqualPredicateTest extends AbstractPredicateTest {
    private static final EqualsTestObject FALSE_OBJECT = new EqualsTestObject(false);

    private static final EqualsTestObject TRUE_OBJECT = new EqualsTestObject(true);

    @Override
    protected Predicate<java.lang.Object> generatePredicate() {
        return org.apache.commons.collections4.functors.EqualPredicate.equalPredicate(null);
    }

    @Test
    public void testNullArgumentEqualsNullPredicate() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullArgumentEqualsNullPredicate");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4445,null,4444,org.apache.commons.collections4.functors.NullPredicate.nullPredicate());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4447,null,4446,org.apache.commons.collections4.functors.EqualPredicate.equalPredicate(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void objectFactoryUsesEqualsForTest() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "objectFactoryUsesEqualsForTest");
        final Predicate<EqualsTestObject> predicate = org.apache.commons.collections4.functors.EqualPredicate.equalPredicate(FALSE_OBJECT);
        assertFalse(predicate, FALSE_OBJECT);
        assertTrue(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate(TRUE_OBJECT), TRUE_OBJECT);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    @Test
    public void testPredicateTypeCanBeSuperClassOfObject() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPredicateTypeCanBeSuperClassOfObject");
        final Predicate<java.lang.Number> predicate = org.apache.commons.collections4.functors.EqualPredicate.equalPredicate(((Number)(4)));
        assertTrue(predicate, 4);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    @Test
    public void testPredicateTypeCanBeSuperClassOfObject_literalMutation1194() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPredicateTypeCanBeSuperClassOfObject_literalMutation1194");
        final Predicate<java.lang.Number> predicate = org.apache.commons.collections4.functors.EqualPredicate.equalPredicate(((Number)(5)));
        assertTrue(predicate, 4);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    @Test
    public void testPredicateTypeCanBeSuperClassOfObject_literalMutation1195() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPredicateTypeCanBeSuperClassOfObject_literalMutation1195");
        final Predicate<java.lang.Number> predicate = org.apache.commons.collections4.functors.EqualPredicate.equalPredicate(((Number)(4)));
        assertTrue(predicate, 5);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public static class EqualsTestObject {
        private final boolean b;

        public EqualsTestObject(final boolean b) {
            this.b = b;
        }

        @Override
        public boolean equals(final Object obj) {
            return b;
        }
    }
}


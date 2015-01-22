package org.apache.commons.collections4.set;

import java.util.HashSet;
import org.apache.commons.collections4.Predicate;
import java.util.Set;

/** 
 * Extension of {@link AbstractSetTest} for exercising the
 * {@link PredicatedSet} implementation.
 * 
 * @version $Id$
 * @since 3.0
 */
public class PredicatedSetTest<E> extends AbstractSetTest<E> {
    public PredicatedSetTest(final String testName) {
        super(testName);
    }

    protected Predicate<E> truePredicate = org.apache.commons.collections4.functors.TruePredicate.<E>truePredicate();

    protected PredicatedSet<E> decorateSet(final Set<E> set, final Predicate<? super E> predicate) {
        return PredicatedSet.predicatedSet(set, predicate);
    }

    @Override
    public PredicatedSet<E> makeObject() {
        return decorateSet(new HashSet<E>(), truePredicate);
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public E[] getFullElements() {
        return ((E[])(new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" }));
    }

    protected Predicate<E> testPredicate = new Predicate<E>() {
        public boolean evaluate(final E o) {
            return o instanceof String;
        }
    };

    protected PredicatedSet<E> makeTestSet() {
        return decorateSet(new HashSet<E>(), testPredicate);
    }

    public void testGetSet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetSet");
        final PredicatedSet<E> set = makeTestSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6274,((set.decorated()) != null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAdd() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAdd");
        final Set<E> set = makeTestSet();
        final Integer i = Integer.valueOf(3);
        try {
            set.add(((E)(i)));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6275,!(set.contains(i)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAdd_literalMutation1859() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAdd_literalMutation1859");
        final Set<E> set = makeTestSet();
        final Integer i = Integer.valueOf(3);
        try {
            set.add(((E)(i)));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6275,!(set.contains(i)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAdd_literalMutation1860() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAdd_literalMutation1860");
        final Set<E> set = makeTestSet();
        final Integer i = Integer.valueOf(4);
        try {
            set.add(((E)(i)));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6275,!(set.contains(i)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAddAll() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll");
        final Set<E> set = makeTestSet();
        final Set<E> elements = new HashSet<E>();
        elements.add(((E)("one")));
        elements.add(((E)("two")));
        elements.add(((E)(Integer.valueOf(3))));
        elements.add(((E)("four")));
        try {
            set.addAll(elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6276,!(set.contains("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6277,!(set.contains("two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6278,!(set.contains(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6279,!(set.contains("four")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAddAll_literalMutation1861() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_literalMutation1861");
        final Set<E> set = makeTestSet();
        final Set<E> elements = new HashSet<E>();
        elements.add(((E)("one")));
        elements.add(((E)("two")));
        elements.add(((E)(Integer.valueOf(3))));
        elements.add(((E)("four")));
        try {
            set.addAll(elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6276,!(set.contains("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6277,!(set.contains("two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6278,!(set.contains(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6279,!(set.contains("four")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAddAll_literalMutation1862() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_literalMutation1862");
        final Set<E> set = makeTestSet();
        final Set<E> elements = new HashSet<E>();
        elements.add(((E)("foo")));
        elements.add(((E)("two")));
        elements.add(((E)(Integer.valueOf(3))));
        elements.add(((E)("four")));
        try {
            set.addAll(elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6276,!(set.contains("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6277,!(set.contains("two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6278,!(set.contains(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6279,!(set.contains("four")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAddAll_literalMutation1863() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_literalMutation1863");
        final Set<E> set = makeTestSet();
        final Set<E> elements = new HashSet<E>();
        elements.add(((E)("one")));
        elements.add(((E)("foo")));
        elements.add(((E)(Integer.valueOf(3))));
        elements.add(((E)("four")));
        try {
            set.addAll(elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6276,!(set.contains("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6277,!(set.contains("two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6278,!(set.contains(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6279,!(set.contains("four")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAddAll_literalMutation1864() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_literalMutation1864");
        final Set<E> set = makeTestSet();
        final Set<E> elements = new HashSet<E>();
        elements.add(((E)("one")));
        elements.add(((E)("two")));
        elements.add(((E)(Integer.valueOf(4))));
        elements.add(((E)("four")));
        try {
            set.addAll(elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6276,!(set.contains("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6277,!(set.contains("two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6278,!(set.contains(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6279,!(set.contains("four")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAddAll_literalMutation1865() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_literalMutation1865");
        final Set<E> set = makeTestSet();
        final Set<E> elements = new HashSet<E>();
        elements.add(((E)("one")));
        elements.add(((E)("two")));
        elements.add(((E)(Integer.valueOf(3))));
        elements.add(((E)("foo")));
        try {
            set.addAll(elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6276,!(set.contains("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6277,!(set.contains("two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6278,!(set.contains(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6279,!(set.contains("four")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}


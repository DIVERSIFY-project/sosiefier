package org.apache.commons.collections4.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;

/** 
 * Extension of {@link AbstractCollectionTest} for exercising the
 * {@link PredicatedCollection} implementation.
 * 
 * @version $Id$
 * @since 3.0
 */
public class PredicatedCollectionTest<E> extends AbstractCollectionTest<E> {
    public PredicatedCollectionTest(final String name) {
        super(name);
    }

    protected Predicate<E> truePredicate = org.apache.commons.collections4.functors.TruePredicate.<E>truePredicate();

    protected Collection<E> decorateCollection(final Collection<E> collection, final Predicate<E> predicate) {
        return org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(collection, predicate);
    }

    @Override
    public Collection<E> makeObject() {
        return decorateCollection(new ArrayList<E>(), truePredicate);
    }

    @Override
    public Collection<E> makeConfirmedCollection() {
        return new ArrayList<E>();
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public E[] getFullElements() {
        return ((E[])(new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" }));
    }

    @Override
    public Collection<E> makeFullCollection() {
        final List<E> list = new ArrayList<E>();
        list.addAll(java.util.Arrays.asList(getFullElements()));
        return decorateCollection(list, truePredicate);
    }

    @Override
    public Collection<E> makeConfirmedFullCollection() {
        final List<E> list = new ArrayList<E>();
        list.addAll(java.util.Arrays.asList(getFullElements()));
        return list;
    }

    protected Predicate<E> testPredicate = new Predicate<E>() {
        public boolean evaluate(final E o) {
            return o instanceof String;
        }
    };

    public Collection<E> makeTestCollection() {
        return decorateCollection(new ArrayList<E>(), testPredicate);
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAdd() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAdd");
        final Collection<E> c = makeTestCollection();
        final Integer i = Integer.valueOf(3);
        try {
            c.add(((E)(i)));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4780,!(c.contains(i)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIllegalAdd_add1544() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAdd_add1544");
        final Collection<E> c = makeTestCollection();
        final Integer i = Integer.valueOf(3);
        try {
            c.add(((E)(i)));
            c.add(((E)(i)));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4780,!(c.contains(i)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAdd_literalMutation1368() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAdd_literalMutation1368");
        final Collection<E> c = makeTestCollection();
        final Integer i = Integer.valueOf(3);
        try {
            c.add(((E)(i)));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4780,!(c.contains(i)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAdd_literalMutation1369() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAdd_literalMutation1369");
        final Collection<E> c = makeTestCollection();
        final Integer i = Integer.valueOf(4);
        try {
            c.add(((E)(i)));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4780,!(c.contains(i)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIllegalAddAll_add1545() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_add1545");
        final Collection<E> c = makeTestCollection();
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("one")));
        elements.add(((E)("one")));
        elements.add(((E)("two")));
        elements.add(((E)(Integer.valueOf(3))));
        elements.add(((E)("four")));
        try {
            c.addAll(elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4781,!(c.contains("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4782,!(c.contains("two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4783,!(c.contains(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4784,!(c.contains("four")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIllegalAddAll_add1546() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_add1546");
        final Collection<E> c = makeTestCollection();
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("one")));
        elements.add(((E)("two")));
        elements.add(((E)("two")));
        elements.add(((E)(Integer.valueOf(3))));
        elements.add(((E)("four")));
        try {
            c.addAll(elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4781,!(c.contains("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4782,!(c.contains("two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4783,!(c.contains(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4784,!(c.contains("four")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIllegalAddAll_add1547() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_add1547");
        final Collection<E> c = makeTestCollection();
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("one")));
        elements.add(((E)("two")));
        elements.add(((E)(Integer.valueOf(3))));
        elements.add(((E)(Integer.valueOf(3))));
        elements.add(((E)("four")));
        try {
            c.addAll(elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4781,!(c.contains("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4782,!(c.contains("two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4783,!(c.contains(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4784,!(c.contains("four")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIllegalAddAll_add1548() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_add1548");
        final Collection<E> c = makeTestCollection();
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("one")));
        elements.add(((E)("two")));
        elements.add(((E)(Integer.valueOf(3))));
        elements.add(((E)("four")));
        elements.add(((E)("four")));
        try {
            c.addAll(elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4781,!(c.contains("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4782,!(c.contains("two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4783,!(c.contains(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4784,!(c.contains("four")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIllegalAddAll_add1549() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_add1549");
        final Collection<E> c = makeTestCollection();
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("one")));
        elements.add(((E)("two")));
        elements.add(((E)(Integer.valueOf(3))));
        elements.add(((E)("four")));
        try {
            c.addAll(elements);
            c.addAll(elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4781,!(c.contains("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4782,!(c.contains("two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4783,!(c.contains(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4784,!(c.contains("four")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAddAll() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll");
        final Collection<E> c = makeTestCollection();
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("one")));
        elements.add(((E)("two")));
        elements.add(((E)(Integer.valueOf(3))));
        elements.add(((E)("four")));
        try {
            c.addAll(elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4781,!(c.contains("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4782,!(c.contains("two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4783,!(c.contains(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4784,!(c.contains("four")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAddAll_literalMutation1371() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_literalMutation1371");
        final Collection<E> c = makeTestCollection();
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("foo")));
        elements.add(((E)("two")));
        elements.add(((E)(Integer.valueOf(3))));
        elements.add(((E)("four")));
        try {
            c.addAll(elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4781,!(c.contains("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4782,!(c.contains("two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4783,!(c.contains(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4784,!(c.contains("four")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAddAll_literalMutation1372() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_literalMutation1372");
        final Collection<E> c = makeTestCollection();
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("one")));
        elements.add(((E)("foo")));
        elements.add(((E)(Integer.valueOf(3))));
        elements.add(((E)("four")));
        try {
            c.addAll(elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4781,!(c.contains("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4782,!(c.contains("two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4783,!(c.contains(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4784,!(c.contains("four")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAddAll_literalMutation1373() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_literalMutation1373");
        final Collection<E> c = makeTestCollection();
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("one")));
        elements.add(((E)("two")));
        elements.add(((E)(Integer.valueOf(4))));
        elements.add(((E)("four")));
        try {
            c.addAll(elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4781,!(c.contains("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4782,!(c.contains("two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4783,!(c.contains(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4784,!(c.contains("four")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAddAll_literalMutation1374() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_literalMutation1374");
        final Collection<E> c = makeTestCollection();
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("one")));
        elements.add(((E)("two")));
        elements.add(((E)(Integer.valueOf(3))));
        elements.add(((E)("foo")));
        try {
            c.addAll(elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4781,!(c.contains("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4782,!(c.contains("two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4783,!(c.contains(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4784,!(c.contains("four")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIllegalAddAll_remove1173() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_remove1173");
        final Collection<E> c = makeTestCollection();
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("two")));
        elements.add(((E)(Integer.valueOf(3))));
        elements.add(((E)("four")));
        try {
            c.addAll(elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4781,!(c.contains("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4782,!(c.contains("two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4783,!(c.contains(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4784,!(c.contains("four")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIllegalAddAll_remove1174() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_remove1174");
        final Collection<E> c = makeTestCollection();
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("two")));
        elements.add(((E)(Integer.valueOf(3))));
        elements.add(((E)("four")));
        try {
            c.addAll(elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4781,!(c.contains("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4782,!(c.contains("two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4783,!(c.contains(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4784,!(c.contains("four")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIllegalAddAll_remove1175() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_remove1175");
        final Collection<E> c = makeTestCollection();
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("two")));
        elements.add(((E)(Integer.valueOf(3))));
        elements.add(((E)("four")));
        try {
            c.addAll(elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4781,!(c.contains("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4782,!(c.contains("two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4783,!(c.contains(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4784,!(c.contains("four")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIllegalAddAll_remove1176() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_remove1176");
        final Collection<E> c = makeTestCollection();
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("two")));
        elements.add(((E)(Integer.valueOf(3))));
        elements.add(((E)("four")));
        try {
            c.addAll(elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4781,!(c.contains("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4782,!(c.contains("two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4783,!(c.contains(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4784,!(c.contains("four")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}


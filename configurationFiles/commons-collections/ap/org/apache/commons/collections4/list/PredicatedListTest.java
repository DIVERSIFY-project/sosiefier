package org.apache.commons.collections4.list;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;

/** 
 * Extension of {@link AbstractListTest} for exercising the
 * {@link PredicatedList} implementation.
 * 
 * @version $Id$
 * @since 3.0
 */
public class PredicatedListTest<E> extends AbstractListTest<E> {
    public PredicatedListTest(final String testName) {
        super(testName);
    }

    protected Predicate<E> truePredicate = org.apache.commons.collections4.functors.TruePredicate.<E>truePredicate();

    protected List<E> decorateList(final List<E> list, final Predicate<E> predicate) {
        return org.apache.commons.collections4.list.PredicatedList.predicatedList(list, predicate);
    }

    @Override
    public List<E> makeObject() {
        return decorateList(new ArrayList<E>(), truePredicate);
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

    public List<E> makeTestList() {
        return decorateList(new ArrayList<E>(), testPredicate);
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIllegalAdd_add816() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAdd_add816");
        final List<E> list = makeTestList();
        final Integer i = Integer.valueOf(3);
        try {
            list.add(((E)(i)));
            list.add(((E)(i)));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2315,!(list.contains(i)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAdd() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAdd");
        final List<E> list = makeTestList();
        final Integer i = Integer.valueOf(3);
        try {
            list.add(((E)(i)));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2315,!(list.contains(i)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAdd_literalMutation829() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAdd_literalMutation829");
        final List<E> list = makeTestList();
        final Integer i = Integer.valueOf(4);
        try {
            list.add(((E)(i)));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2315,!(list.contains(i)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAddAll() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll");
        final List<E> list = makeTestList();
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("one")));
        elements.add(((E)("two")));
        elements.add(((E)(Integer.valueOf(3))));
        elements.add(((E)("four")));
        try {
            list.addAll(0, elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2311,!(list.contains("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2312,!(list.contains("two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2313,!(list.contains(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2314,!(list.contains("four")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIllegalAddAll_add817() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_add817");
        final List<E> list = makeTestList();
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("one")));
        elements.add(((E)("one")));
        elements.add(((E)("two")));
        elements.add(((E)(Integer.valueOf(3))));
        elements.add(((E)("four")));
        try {
            list.addAll(0, elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2311,!(list.contains("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2312,!(list.contains("two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2313,!(list.contains(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2314,!(list.contains("four")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIllegalAddAll_add818() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_add818");
        final List<E> list = makeTestList();
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("one")));
        elements.add(((E)("two")));
        elements.add(((E)("two")));
        elements.add(((E)(Integer.valueOf(3))));
        elements.add(((E)("four")));
        try {
            list.addAll(0, elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2311,!(list.contains("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2312,!(list.contains("two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2313,!(list.contains(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2314,!(list.contains("four")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIllegalAddAll_add819() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_add819");
        final List<E> list = makeTestList();
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("one")));
        elements.add(((E)("two")));
        elements.add(((E)(Integer.valueOf(3))));
        elements.add(((E)(Integer.valueOf(3))));
        elements.add(((E)("four")));
        try {
            list.addAll(0, elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2311,!(list.contains("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2312,!(list.contains("two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2313,!(list.contains(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2314,!(list.contains("four")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIllegalAddAll_add820() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_add820");
        final List<E> list = makeTestList();
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("one")));
        elements.add(((E)("two")));
        elements.add(((E)(Integer.valueOf(3))));
        elements.add(((E)("four")));
        elements.add(((E)("four")));
        try {
            list.addAll(0, elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2311,!(list.contains("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2312,!(list.contains("two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2313,!(list.contains(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2314,!(list.contains("four")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIllegalAddAll_add821() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_add821");
        final List<E> list = makeTestList();
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("one")));
        elements.add(((E)("two")));
        elements.add(((E)(Integer.valueOf(3))));
        elements.add(((E)("four")));
        try {
            list.addAll(0, elements);
            list.addAll(0, elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2311,!(list.contains("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2312,!(list.contains("two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2313,!(list.contains(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2314,!(list.contains("four")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAddAll_literalMutation830() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_literalMutation830");
        final List<E> list = makeTestList();
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("one")));
        elements.add(((E)("two")));
        elements.add(((E)(Integer.valueOf(3))));
        elements.add(((E)("four")));
        try {
            list.addAll(0, elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2311,!(list.contains("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2312,!(list.contains("two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2313,!(list.contains(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2314,!(list.contains("four")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAddAll_literalMutation831() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_literalMutation831");
        final List<E> list = makeTestList();
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("foo")));
        elements.add(((E)("two")));
        elements.add(((E)(Integer.valueOf(3))));
        elements.add(((E)("four")));
        try {
            list.addAll(0, elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2311,!(list.contains("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2312,!(list.contains("two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2313,!(list.contains(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2314,!(list.contains("four")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAddAll_literalMutation832() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_literalMutation832");
        final List<E> list = makeTestList();
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("one")));
        elements.add(((E)("foo")));
        elements.add(((E)(Integer.valueOf(3))));
        elements.add(((E)("four")));
        try {
            list.addAll(0, elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2311,!(list.contains("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2312,!(list.contains("two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2313,!(list.contains(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2314,!(list.contains("four")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAddAll_literalMutation833() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_literalMutation833");
        final List<E> list = makeTestList();
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("one")));
        elements.add(((E)("two")));
        elements.add(((E)(Integer.valueOf(2))));
        elements.add(((E)("four")));
        try {
            list.addAll(0, elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2311,!(list.contains("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2312,!(list.contains("two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2313,!(list.contains(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2314,!(list.contains("four")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAddAll_literalMutation834() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_literalMutation834");
        final List<E> list = makeTestList();
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("one")));
        elements.add(((E)("two")));
        elements.add(((E)(Integer.valueOf(3))));
        elements.add(((E)("foo")));
        try {
            list.addAll(0, elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2311,!(list.contains("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2312,!(list.contains("two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2313,!(list.contains(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2314,!(list.contains("four")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAddAll_literalMutation835() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_literalMutation835");
        final List<E> list = makeTestList();
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("one")));
        elements.add(((E)("two")));
        elements.add(((E)(Integer.valueOf(3))));
        elements.add(((E)("four")));
        try {
            list.addAll(1, elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2311,!(list.contains("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2312,!(list.contains("two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2313,!(list.contains(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2314,!(list.contains("four")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIllegalAddAll_remove640() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_remove640");
        final List<E> list = makeTestList();
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("two")));
        elements.add(((E)(Integer.valueOf(3))));
        elements.add(((E)("four")));
        try {
            list.addAll(0, elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2311,!(list.contains("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2312,!(list.contains("two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2313,!(list.contains(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2314,!(list.contains("four")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIllegalAddAll_remove641() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_remove641");
        final List<E> list = makeTestList();
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("two")));
        elements.add(((E)(Integer.valueOf(3))));
        elements.add(((E)("four")));
        try {
            list.addAll(0, elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2311,!(list.contains("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2312,!(list.contains("two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2313,!(list.contains(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2314,!(list.contains("four")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIllegalAddAll_remove642() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_remove642");
        final List<E> list = makeTestList();
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("two")));
        elements.add(((E)(Integer.valueOf(3))));
        elements.add(((E)("four")));
        try {
            list.addAll(0, elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2311,!(list.contains("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2312,!(list.contains("two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2313,!(list.contains(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2314,!(list.contains("four")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIllegalAddAll_remove643() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_remove643");
        final List<E> list = makeTestList();
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("two")));
        elements.add(((E)(Integer.valueOf(3))));
        elements.add(((E)("four")));
        try {
            list.addAll(0, elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2311,!(list.contains("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2312,!(list.contains("two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2313,!(list.contains(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2314,!(list.contains("four")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIllegalSet_add822() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalSet_add822");
        final List<E> list = makeTestList();
        try {
            list.set(0, ((E)(Integer.valueOf(3))));
            list.set(0, ((E)(Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalSet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalSet");
        final List<E> list = makeTestList();
        try {
            list.set(0, ((E)(Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalSet_literalMutation837() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalSet_literalMutation837");
        final List<E> list = makeTestList();
        try {
            list.set(1, ((E)(Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalSet_literalMutation838() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalSet_literalMutation838");
        final List<E> list = makeTestList();
        try {
            list.set(0, ((E)(Integer.valueOf(4))));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testLegalAddAll_add823() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLegalAddAll_add823");
        final List<E> list = makeTestList();
        list.add(((E)("zero")));
        list.add(((E)("zero")));
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("one")));
        elements.add(((E)("two")));
        elements.add(((E)("three")));
        list.addAll(1, elements);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2317,list,2316,list.contains("zero"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2319,list,2318,list.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2321,list,2320,list.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2323,list,2322,list.contains("three"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testLegalAddAll_add824() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLegalAddAll_add824");
        final List<E> list = makeTestList();
        list.add(((E)("zero")));
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("one")));
        elements.add(((E)("one")));
        elements.add(((E)("two")));
        elements.add(((E)("three")));
        list.addAll(1, elements);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2317,list,2316,list.contains("zero"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2319,list,2318,list.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2321,list,2320,list.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2323,list,2322,list.contains("three"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testLegalAddAll_add825() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLegalAddAll_add825");
        final List<E> list = makeTestList();
        list.add(((E)("zero")));
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("one")));
        elements.add(((E)("two")));
        elements.add(((E)("two")));
        elements.add(((E)("three")));
        list.addAll(1, elements);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2317,list,2316,list.contains("zero"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2319,list,2318,list.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2321,list,2320,list.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2323,list,2322,list.contains("three"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testLegalAddAll_add826() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLegalAddAll_add826");
        final List<E> list = makeTestList();
        list.add(((E)("zero")));
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("one")));
        elements.add(((E)("two")));
        elements.add(((E)("three")));
        elements.add(((E)("three")));
        list.addAll(1, elements);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2317,list,2316,list.contains("zero"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2319,list,2318,list.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2321,list,2320,list.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2323,list,2322,list.contains("three"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testLegalAddAll_add827() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLegalAddAll_add827");
        final List<E> list = makeTestList();
        list.add(((E)("zero")));
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("one")));
        elements.add(((E)("two")));
        elements.add(((E)("three")));
        list.addAll(1, elements);
        list.addAll(1, elements);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2317,list,2316,list.contains("zero"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2319,list,2318,list.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2321,list,2320,list.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2323,list,2322,list.contains("three"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testLegalAddAll() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLegalAddAll");
        final List<E> list = makeTestList();
        list.add(((E)("zero")));
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("one")));
        elements.add(((E)("two")));
        elements.add(((E)("three")));
        list.addAll(1, elements);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2317,list,2316,list.contains("zero"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2319,list,2318,list.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2321,list,2320,list.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2323,list,2322,list.contains("three"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testLegalAddAll_literalMutation840() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLegalAddAll_literalMutation840");
        final List<E> list = makeTestList();
        list.add(((E)("foo")));
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("one")));
        elements.add(((E)("two")));
        elements.add(((E)("three")));
        list.addAll(1, elements);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2317,list,2316,list.contains("zero"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2319,list,2318,list.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2321,list,2320,list.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2323,list,2322,list.contains("three"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testLegalAddAll_literalMutation841() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLegalAddAll_literalMutation841");
        final List<E> list = makeTestList();
        list.add(((E)("zero")));
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("foo")));
        elements.add(((E)("two")));
        elements.add(((E)("three")));
        list.addAll(1, elements);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2317,list,2316,list.contains("zero"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2319,list,2318,list.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2321,list,2320,list.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2323,list,2322,list.contains("three"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testLegalAddAll_literalMutation842() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLegalAddAll_literalMutation842");
        final List<E> list = makeTestList();
        list.add(((E)("zero")));
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("one")));
        elements.add(((E)("foo")));
        elements.add(((E)("three")));
        list.addAll(1, elements);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2317,list,2316,list.contains("zero"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2319,list,2318,list.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2321,list,2320,list.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2323,list,2322,list.contains("three"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testLegalAddAll_literalMutation843() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLegalAddAll_literalMutation843");
        final List<E> list = makeTestList();
        list.add(((E)("zero")));
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("one")));
        elements.add(((E)("two")));
        elements.add(((E)("foo")));
        list.addAll(1, elements);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2317,list,2316,list.contains("zero"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2319,list,2318,list.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2321,list,2320,list.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2323,list,2322,list.contains("three"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testLegalAddAll_literalMutation844() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLegalAddAll_literalMutation844");
        final List<E> list = makeTestList();
        list.add(((E)("zero")));
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("one")));
        elements.add(((E)("two")));
        elements.add(((E)("three")));
        list.addAll(0, elements);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2317,list,2316,list.contains("zero"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2319,list,2318,list.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2321,list,2320,list.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2323,list,2322,list.contains("three"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testLegalAddAll_remove644() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLegalAddAll_remove644");
        final List<E> list = makeTestList();
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("one")));
        elements.add(((E)("two")));
        elements.add(((E)("three")));
        list.addAll(1, elements);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2317,list,2316,list.contains("zero"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2319,list,2318,list.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2321,list,2320,list.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2323,list,2322,list.contains("three"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testLegalAddAll_remove645() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLegalAddAll_remove645");
        final List<E> list = makeTestList();
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("one")));
        elements.add(((E)("two")));
        elements.add(((E)("three")));
        list.addAll(1, elements);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2317,list,2316,list.contains("zero"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2319,list,2318,list.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2321,list,2320,list.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2323,list,2322,list.contains("three"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testLegalAddAll_remove646() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLegalAddAll_remove646");
        final List<E> list = makeTestList();
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("one")));
        elements.add(((E)("two")));
        elements.add(((E)("three")));
        list.addAll(1, elements);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2317,list,2316,list.contains("zero"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2319,list,2318,list.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2321,list,2320,list.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2323,list,2322,list.contains("three"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testLegalAddAll_remove647() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLegalAddAll_remove647");
        final List<E> list = makeTestList();
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("one")));
        elements.add(((E)("two")));
        elements.add(((E)("three")));
        list.addAll(1, elements);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2317,list,2316,list.contains("zero"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2319,list,2318,list.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2321,list,2320,list.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2323,list,2322,list.contains("three"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testLegalAddAll_remove648() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLegalAddAll_remove648");
        final List<E> list = makeTestList();
        list.add(((E)("zero")));
        final List<E> elements = new ArrayList<E>();
        elements.add(((E)("one")));
        elements.add(((E)("two")));
        elements.add(((E)("three")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2317,list,2316,list.contains("zero"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2319,list,2318,list.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2321,list,2320,list.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2323,list,2322,list.contains("three"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}


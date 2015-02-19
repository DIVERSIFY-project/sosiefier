package org.apache.commons.collections4.bag;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.Predicate;
import java.util.Set;
import junit.framework.Test;

/** 
 * Extension of {@link AbstractBagTest} for exercising the {@link PredicatedBag}
 * implementation.
 * 
 * @version $Id$
 * @since 3.0
 */
public class PredicatedBagTest<T> extends AbstractBagTest<T> {
    public PredicatedBagTest(final String testName) {
        super(testName);
    }

    public static Test suite() {
        return org.apache.commons.collections4.BulkTest.makeSuite(PredicatedBagTest.class);
    }

    protected Predicate<T> stringPredicate() {
        return new Predicate<T>() {
            public boolean evaluate(final T o) {
                return o instanceof String;
            }
        };
    }

    protected Predicate<T> truePredicate = org.apache.commons.collections4.functors.TruePredicate.<T>truePredicate();

    protected Bag<T> decorateBag(final HashBag<T> bag, final Predicate<T> predicate) {
        return PredicatedBag.predicatedBag(bag, predicate);
    }

    @Override
    public Bag<T> makeObject() {
        return decorateBag(new HashBag<T>(), truePredicate);
    }

    protected Bag<T> makeTestBag() {
        return decorateBag(new HashBag<T>(), stringPredicate());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testlegalAddRemove_add1781() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testlegalAddRemove_add1781");
        final Bag<T> bag = makeTestBag();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5808,bag,5807,bag.size());
        final T[] els = ((T[])(new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "1" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            bag.add(els[i]);
            bag.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5809,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5811,bag,5810,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5813,bag,5812,bag.contains(els[i]));
        }
        Set<T> set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5815,set,5814,set.contains(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5817,bag,5816,bag.remove(els[0]));
        set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5818,!(set.contains(els[0])));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testlegalAddRemove() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testlegalAddRemove");
        final Bag<T> bag = makeTestBag();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5808,bag,5807,bag.size());
        final T[] els = ((T[])(new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "1" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            bag.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5809,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5811,bag,5810,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5813,bag,5812,bag.contains(els[i]));
        }
        Set<T> set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5815,set,5814,set.contains(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5817,bag,5816,bag.remove(els[0]));
        set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5818,!(set.contains(els[0])));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testlegalAddRemove_literalMutation1601() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testlegalAddRemove_literalMutation1601");
        final Bag<T> bag = makeTestBag();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5808,bag,5807,bag.size());
        final T[] els = ((T[])(new Object[]{ "foo" , "3" , "5" , "7" , "2" , "4" , "1" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            bag.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5809,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5811,bag,5810,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5813,bag,5812,bag.contains(els[i]));
        }
        Set<T> set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5815,set,5814,set.contains(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5817,bag,5816,bag.remove(els[0]));
        set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5818,!(set.contains(els[0])));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testlegalAddRemove_literalMutation1602() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testlegalAddRemove_literalMutation1602");
        final Bag<T> bag = makeTestBag();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5808,bag,5807,bag.size());
        final T[] els = ((T[])(new Object[]{ "1" , "foo" , "5" , "7" , "2" , "4" , "1" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            bag.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5809,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5811,bag,5810,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5813,bag,5812,bag.contains(els[i]));
        }
        Set<T> set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5815,set,5814,set.contains(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5817,bag,5816,bag.remove(els[0]));
        set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5818,!(set.contains(els[0])));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testlegalAddRemove_literalMutation1603() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testlegalAddRemove_literalMutation1603");
        final Bag<T> bag = makeTestBag();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5808,bag,5807,bag.size());
        final T[] els = ((T[])(new Object[]{ "1" , "3" , "foo" , "7" , "2" , "4" , "1" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            bag.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5809,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5811,bag,5810,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5813,bag,5812,bag.contains(els[i]));
        }
        Set<T> set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5815,set,5814,set.contains(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5817,bag,5816,bag.remove(els[0]));
        set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5818,!(set.contains(els[0])));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testlegalAddRemove_literalMutation1604() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testlegalAddRemove_literalMutation1604");
        final Bag<T> bag = makeTestBag();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5808,bag,5807,bag.size());
        final T[] els = ((T[])(new Object[]{ "1" , "3" , "5" , "foo" , "2" , "4" , "1" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            bag.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5809,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5811,bag,5810,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5813,bag,5812,bag.contains(els[i]));
        }
        Set<T> set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5815,set,5814,set.contains(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5817,bag,5816,bag.remove(els[0]));
        set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5818,!(set.contains(els[0])));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testlegalAddRemove_literalMutation1605() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testlegalAddRemove_literalMutation1605");
        final Bag<T> bag = makeTestBag();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5808,bag,5807,bag.size());
        final T[] els = ((T[])(new Object[]{ "1" , "3" , "5" , "7" , "foo" , "4" , "1" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            bag.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5809,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5811,bag,5810,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5813,bag,5812,bag.contains(els[i]));
        }
        Set<T> set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5815,set,5814,set.contains(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5817,bag,5816,bag.remove(els[0]));
        set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5818,!(set.contains(els[0])));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testlegalAddRemove_literalMutation1606() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testlegalAddRemove_literalMutation1606");
        final Bag<T> bag = makeTestBag();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5808,bag,5807,bag.size());
        final T[] els = ((T[])(new Object[]{ "1" , "3" , "5" , "7" , "2" , "foo" , "1" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            bag.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5809,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5811,bag,5810,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5813,bag,5812,bag.contains(els[i]));
        }
        Set<T> set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5815,set,5814,set.contains(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5817,bag,5816,bag.remove(els[0]));
        set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5818,!(set.contains(els[0])));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testlegalAddRemove_literalMutation1607() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testlegalAddRemove_literalMutation1607");
        final Bag<T> bag = makeTestBag();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5808,bag,5807,bag.size());
        final T[] els = ((T[])(new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "foo" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            bag.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5809,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5811,bag,5810,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5813,bag,5812,bag.contains(els[i]));
        }
        Set<T> set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5815,set,5814,set.contains(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5817,bag,5816,bag.remove(els[0]));
        set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5818,!(set.contains(els[0])));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testlegalAddRemove_literalMutation1608() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testlegalAddRemove_literalMutation1608");
        final Bag<T> bag = makeTestBag();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5808,bag,5807,bag.size());
        final T[] els = ((T[])(new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "1" }));
        for (int i = 1 ; i < (els.length) ; i++) {
            bag.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5809,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5811,bag,5810,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5813,bag,5812,bag.contains(els[i]));
        }
        Set<T> set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5815,set,5814,set.contains(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5817,bag,5816,bag.remove(els[0]));
        set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5818,!(set.contains(els[0])));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testlegalAddRemove_remove1363() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testlegalAddRemove_remove1363");
        final Bag<T> bag = makeTestBag();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5808,bag,5807,bag.size());
        final T[] els = ((T[])(new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "1" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5809,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5811,bag,5810,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5813,bag,5812,bag.contains(els[i]));
        }
        Set<T> set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5815,set,5814,set.contains(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5817,bag,5816,bag.remove(els[0]));
        set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5818,!(set.contains(els[0])));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAdd() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAdd");
        final Bag<T> bag = makeTestBag();
        final Integer i = Integer.valueOf(3);
        try {
            bag.add(((T)(i)));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5806,!(bag.contains(i)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testIllegalAdd_add1774() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAdd_add1774");
        final Bag<T> bag = makeTestBag();
        final Integer i = Integer.valueOf(3);
        try {
            bag.add(((T)(i)));
            bag.add(((T)(i)));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5806,!(bag.contains(i)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAdd_literalMutation1592() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAdd_literalMutation1592");
        final Bag<T> bag = makeTestBag();
        final Integer i = Integer.valueOf(3);
        try {
            bag.add(((T)(i)));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5806,!(bag.contains(i)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAdd_literalMutation1593() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAdd_literalMutation1593");
        final Bag<T> bag = makeTestBag();
        final Integer i = Integer.valueOf(2);
        try {
            bag.add(((T)(i)));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5806,!(bag.contains(i)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testIllegalDecorate_add1775() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalDecorate_add1775");
        final HashBag<java.lang.Object> elements = new HashBag<java.lang.Object>();
        elements.add("one");
        elements.add("one");
        elements.add("two");
        elements.add(Integer.valueOf(3));
        elements.add("four");
        try {
            decorateBag(((HashBag<T>)(elements)), stringPredicate());
        } catch (final IllegalArgumentException e) {
        }
        try {
            decorateBag(new HashBag<T>(), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testIllegalDecorate_add1776() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalDecorate_add1776");
        final HashBag<java.lang.Object> elements = new HashBag<java.lang.Object>();
        elements.add("one");
        elements.add("two");
        elements.add("two");
        elements.add(Integer.valueOf(3));
        elements.add("four");
        try {
            decorateBag(((HashBag<T>)(elements)), stringPredicate());
        } catch (final IllegalArgumentException e) {
        }
        try {
            decorateBag(new HashBag<T>(), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testIllegalDecorate_add1777() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalDecorate_add1777");
        final HashBag<java.lang.Object> elements = new HashBag<java.lang.Object>();
        elements.add("one");
        elements.add("two");
        elements.add(Integer.valueOf(3));
        elements.add(Integer.valueOf(3));
        elements.add("four");
        try {
            decorateBag(((HashBag<T>)(elements)), stringPredicate());
        } catch (final IllegalArgumentException e) {
        }
        try {
            decorateBag(new HashBag<T>(), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testIllegalDecorate_add1778() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalDecorate_add1778");
        final HashBag<java.lang.Object> elements = new HashBag<java.lang.Object>();
        elements.add("one");
        elements.add("two");
        elements.add(Integer.valueOf(3));
        elements.add("four");
        elements.add("four");
        try {
            decorateBag(((HashBag<T>)(elements)), stringPredicate());
        } catch (final IllegalArgumentException e) {
        }
        try {
            decorateBag(new HashBag<T>(), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testIllegalDecorate_add1779() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalDecorate_add1779");
        final HashBag<java.lang.Object> elements = new HashBag<java.lang.Object>();
        elements.add("one");
        elements.add("two");
        elements.add(Integer.valueOf(3));
        elements.add("four");
        try {
            decorateBag(((HashBag<T>)(elements)), stringPredicate());
            decorateBag(((HashBag<T>)(elements)), stringPredicate());
        } catch (final IllegalArgumentException e) {
        }
        try {
            decorateBag(new HashBag<T>(), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testIllegalDecorate_add1780() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalDecorate_add1780");
        final HashBag<java.lang.Object> elements = new HashBag<java.lang.Object>();
        elements.add("one");
        elements.add("two");
        elements.add(Integer.valueOf(3));
        elements.add("four");
        try {
            decorateBag(((HashBag<T>)(elements)), stringPredicate());
        } catch (final IllegalArgumentException e) {
        }
        try {
            decorateBag(new HashBag<T>(), null);
            decorateBag(new HashBag<T>(), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalDecorate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalDecorate");
        final HashBag<java.lang.Object> elements = new HashBag<java.lang.Object>();
        elements.add("one");
        elements.add("two");
        elements.add(Integer.valueOf(3));
        elements.add("four");
        try {
            decorateBag(((HashBag<T>)(elements)), stringPredicate());
        } catch (final IllegalArgumentException e) {
        }
        try {
            decorateBag(new HashBag<T>(), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalDecorate_literalMutation1595() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalDecorate_literalMutation1595");
        final HashBag<java.lang.Object> elements = new HashBag<java.lang.Object>();
        elements.add("foo");
        elements.add("two");
        elements.add(Integer.valueOf(3));
        elements.add("four");
        try {
            decorateBag(((HashBag<T>)(elements)), stringPredicate());
        } catch (final IllegalArgumentException e) {
        }
        try {
            decorateBag(new HashBag<T>(), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalDecorate_literalMutation1596() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalDecorate_literalMutation1596");
        final HashBag<java.lang.Object> elements = new HashBag<java.lang.Object>();
        elements.add("one");
        elements.add("foo");
        elements.add(Integer.valueOf(3));
        elements.add("four");
        try {
            decorateBag(((HashBag<T>)(elements)), stringPredicate());
        } catch (final IllegalArgumentException e) {
        }
        try {
            decorateBag(new HashBag<T>(), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalDecorate_literalMutation1597() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalDecorate_literalMutation1597");
        final HashBag<java.lang.Object> elements = new HashBag<java.lang.Object>();
        elements.add("one");
        elements.add("two");
        elements.add(Integer.valueOf(2));
        elements.add("four");
        try {
            decorateBag(((HashBag<T>)(elements)), stringPredicate());
        } catch (final IllegalArgumentException e) {
        }
        try {
            decorateBag(new HashBag<T>(), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalDecorate_literalMutation1598() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalDecorate_literalMutation1598");
        final HashBag<java.lang.Object> elements = new HashBag<java.lang.Object>();
        elements.add("one");
        elements.add("two");
        elements.add(Integer.valueOf(3));
        elements.add("foo");
        try {
            decorateBag(((HashBag<T>)(elements)), stringPredicate());
        } catch (final IllegalArgumentException e) {
        }
        try {
            decorateBag(new HashBag<T>(), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testIllegalDecorate_remove1359() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalDecorate_remove1359");
        final HashBag<java.lang.Object> elements = new HashBag<java.lang.Object>();
        elements.add("two");
        elements.add(Integer.valueOf(3));
        elements.add("four");
        try {
            decorateBag(((HashBag<T>)(elements)), stringPredicate());
        } catch (final IllegalArgumentException e) {
        }
        try {
            decorateBag(new HashBag<T>(), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testIllegalDecorate_remove1360() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalDecorate_remove1360");
        final HashBag<java.lang.Object> elements = new HashBag<java.lang.Object>();
        elements.add("two");
        elements.add(Integer.valueOf(3));
        elements.add("four");
        try {
            decorateBag(((HashBag<T>)(elements)), stringPredicate());
        } catch (final IllegalArgumentException e) {
        }
        try {
            decorateBag(new HashBag<T>(), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testIllegalDecorate_remove1361() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalDecorate_remove1361");
        final HashBag<java.lang.Object> elements = new HashBag<java.lang.Object>();
        elements.add("two");
        elements.add(Integer.valueOf(3));
        elements.add("four");
        try {
            decorateBag(((HashBag<T>)(elements)), stringPredicate());
        } catch (final IllegalArgumentException e) {
        }
        try {
            decorateBag(new HashBag<T>(), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testIllegalDecorate_remove1362() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalDecorate_remove1362");
        final HashBag<java.lang.Object> elements = new HashBag<java.lang.Object>();
        elements.add("two");
        elements.add(Integer.valueOf(3));
        elements.add("four");
        try {
            decorateBag(((HashBag<T>)(elements)), stringPredicate());
        } catch (final IllegalArgumentException e) {
        }
        try {
            decorateBag(new HashBag<T>(), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}


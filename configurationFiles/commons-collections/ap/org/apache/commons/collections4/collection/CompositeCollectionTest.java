package org.apache.commons.collections4.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/** 
 * Extension of {@link AbstractCollectionTest} for exercising the
 * {@link CompositeCollection} implementation.
 * 
 * @version $Id$
 * @since 3.0
 */
public class CompositeCollectionTest<E> extends AbstractCollectionTest<E> {
    public CompositeCollectionTest(final String name) {
        super(name);
    }

    /** 
     * Run stock collection tests without Mutator, so turn off add, remove
     */
@Override
    public boolean isAddSupported() {
        return false;
    }

    @Override
    public boolean isRemoveSupported() {
        return false;
    }

    /** 
     * Empty collection is empty composite
     */
@Override
    public Collection<E> makeObject() {
        return new CompositeCollection<E>();
    }

    @Override
    public Collection<E> makeConfirmedCollection() {
        return new HashSet<E>();
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public E[] getFullElements() {
        return ((E[])(new Object[]{ "1" , "2" , "3" , "4" }));
    }

    /** 
     * Full collection consists of 4 collections, each with one element
     */
@Override
    public Collection<E> makeFullCollection() {
        final CompositeCollection<E> compositeCollection = new CompositeCollection<E>();
        final E[] elements = getFullElements();
        for (final E element : elements) {
            final Collection<E> summand = new HashSet<E>();
            summand.add(element);
            compositeCollection.addComposited(summand);
        }
        return compositeCollection;
    }

    /** 
     * Full collection should look like a collection with 4 elements
     */
@Override
    public Collection<E> makeConfirmedFullCollection() {
        final Collection<E> collection = new HashSet<E>();
        collection.addAll(java.util.Arrays.asList(getFullElements()));
        return collection;
    }

    /** 
     * Override testUnsupportedRemove, since the default impl expects removeAll,
     * retainAll and iterator().remove to throw
     */
@Override
    public void testUnsupportedRemove() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedRemove");
        resetFull();
        try {
            getCollection().remove(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    protected CompositeCollection<E> c;

    protected Collection<E> one;

    protected Collection<E> two;

    protected void setUpTest() {
        c = new CompositeCollection<E>();
        one = new HashSet<E>();
        two = new HashSet<E>();
    }

    @SuppressWarnings(value = "serial")
    protected void setUpMutatorTest() {
        setUpTest();
        c.setMutator(new CompositeCollection.CollectionMutator<E>() {
            public boolean add(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final E obj) {
                for (final Collection<E> coll : collections) {
                    coll.add(obj);
                }
                return true;
            }

            public boolean addAll(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final Collection<? extends E> coll) {
                for (final Collection<E> collection : collections) {
                    collection.addAll(coll);
                }
                return true;
            }

            public boolean remove(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final Object obj) {
                for (final Collection<E> collection : collections) {
                    collection.remove(obj);
                }
                return true;
            }
        });
    }

    @SuppressWarnings(value = "unchecked")
    public void testSize() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize");
        setUpTest();
        final HashSet<E> set = new HashSet<E>();
        set.add(((E)("a")));
        set.add(((E)("b")));
        c.addComposited(set);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4732,set,4731,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4734,c,4733,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSize_literalMutation1348() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_literalMutation1348");
        setUpTest();
        final HashSet<E> set = new HashSet<E>();
        set.add(((E)("a")));
        set.add(((E)("b")));
        c.addComposited(set);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4732,set,4731,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4734,c,4733,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSize_literalMutation1349() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_literalMutation1349");
        setUpTest();
        final HashSet<E> set = new HashSet<E>();
        set.add(((E)("foo")));
        set.add(((E)("b")));
        c.addComposited(set);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4732,set,4731,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4734,c,4733,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSize_literalMutation1350() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_literalMutation1350");
        setUpTest();
        final HashSet<E> set = new HashSet<E>();
        set.add(((E)("a")));
        set.add(((E)("foo")));
        c.addComposited(set);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4732,set,4731,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4734,c,4733,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testMultipleCollectionsSize() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleCollectionsSize");
        setUpTest();
        final HashSet<E> set = new HashSet<E>();
        set.add(((E)("a")));
        set.add(((E)("b")));
        c.addComposited(set);
        final HashSet<E> other = new HashSet<E>();
        other.add(((E)("c")));
        c.addComposited(other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4712,((set.size()) + (other.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4714,c,4713,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testMultipleCollectionsSize_literalMutation1328() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleCollectionsSize_literalMutation1328");
        setUpTest();
        final HashSet<E> set = new HashSet<E>();
        set.add(((E)("foo")));
        set.add(((E)("b")));
        c.addComposited(set);
        final HashSet<E> other = new HashSet<E>();
        other.add(((E)("c")));
        c.addComposited(other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4712,((set.size()) + (other.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4714,c,4713,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testMultipleCollectionsSize_literalMutation1329() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleCollectionsSize_literalMutation1329");
        setUpTest();
        final HashSet<E> set = new HashSet<E>();
        set.add(((E)("a")));
        set.add(((E)("foo")));
        c.addComposited(set);
        final HashSet<E> other = new HashSet<E>();
        other.add(((E)("c")));
        c.addComposited(other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4712,((set.size()) + (other.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4714,c,4713,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testMultipleCollectionsSize_literalMutation1330() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleCollectionsSize_literalMutation1330");
        setUpTest();
        final HashSet<E> set = new HashSet<E>();
        set.add(((E)("a")));
        set.add(((E)("b")));
        c.addComposited(set);
        final HashSet<E> other = new HashSet<E>();
        other.add(((E)("foo")));
        c.addComposited(other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4712,((set.size()) + (other.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4714,c,4713,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIsEmpty() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEmpty");
        setUpTest();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4702,c,4701,c.isEmpty());
        final HashSet<E> empty = new HashSet<E>();
        c.addComposited(empty);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4704,c,4703,c.isEmpty());
        empty.add(((E)("a")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4705,!(c.isEmpty()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIsEmpty_literalMutation1322() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEmpty_literalMutation1322");
        setUpTest();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4702,c,4701,c.isEmpty());
        final HashSet<E> empty = new HashSet<E>();
        c.addComposited(empty);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4704,c,4703,c.isEmpty());
        empty.add(((E)("a")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4705,!(c.isEmpty()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIsEmpty_literalMutation1323() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEmpty_literalMutation1323");
        setUpTest();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4702,c,4701,c.isEmpty());
        final HashSet<E> empty = new HashSet<E>();
        c.addComposited(empty);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4704,c,4703,c.isEmpty());
        empty.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4705,!(c.isEmpty()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        c.addComposited(one);
        c.addComposited(two);
        final Iterator<E> i = c.iterator();
        E next = i.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4707,c,4706,c.contains(next));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4709,one,4708,one.contains(next));
        next = i.next();
        i.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4710,!(c.contains(next)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4711,!(two.contains(next)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIterator_literalMutation1324() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator_literalMutation1324");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        c.addComposited(one);
        c.addComposited(two);
        final Iterator<E> i = c.iterator();
        E next = i.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4707,c,4706,c.contains(next));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4709,one,4708,one.contains(next));
        next = i.next();
        i.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4710,!(c.contains(next)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4711,!(two.contains(next)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIterator_literalMutation1325() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator_literalMutation1325");
        setUpTest();
        one.add(((E)("foo")));
        two.add(((E)("2")));
        c.addComposited(one);
        c.addComposited(two);
        final Iterator<E> i = c.iterator();
        E next = i.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4707,c,4706,c.contains(next));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4709,one,4708,one.contains(next));
        next = i.next();
        i.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4710,!(c.contains(next)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4711,!(two.contains(next)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIterator_literalMutation1326() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator_literalMutation1326");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("foo")));
        c.addComposited(one);
        c.addComposited(two);
        final Iterator<E> i = c.iterator();
        E next = i.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4707,c,4706,c.contains(next));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4709,one,4708,one.contains(next));
        next = i.next();
        i.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4710,!(c.contains(next)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4711,!(two.contains(next)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testClear() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        c.addComposited(one, two);
        c.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4694,one,4693,one.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4696,two,4695,two.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4698,c,4697,c.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testClear_literalMutation1317() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_literalMutation1317");
        setUpTest();
        one.add(((E)("foo")));
        two.add(((E)("2")));
        c.addComposited(one, two);
        c.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4694,one,4693,one.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4696,two,4695,two.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4698,c,4697,c.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testClear_literalMutation1318() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_literalMutation1318");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("foo")));
        c.addComposited(one, two);
        c.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4694,one,4693,one.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4696,two,4695,two.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4698,c,4697,c.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testContainsAll() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsAll");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("1")));
        c.addComposited(one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4700,c,4699,c.containsAll(two));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testContainsAll_literalMutation1320() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsAll_literalMutation1320");
        setUpTest();
        one.add(((E)("foo")));
        two.add(((E)("1")));
        c.addComposited(one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4700,c,4699,c.containsAll(two));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testContainsAll_literalMutation1321() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsAll_literalMutation1321");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("foo")));
        c.addComposited(one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4700,c,4699,c.containsAll(two));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRetainAll() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRetainAll");
        setUpTest();
        one.add(((E)("1")));
        one.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one);
        c.retainAll(two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4725,!(c.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4726,!(one.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4728,c,4727,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4730,one,4729,one.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRetainAll_literalMutation1345() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRetainAll_literalMutation1345");
        setUpTest();
        one.add(((E)("foo")));
        one.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one);
        c.retainAll(two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4725,!(c.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4726,!(one.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4728,c,4727,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4730,one,4729,one.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRetainAll_literalMutation1346() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRetainAll_literalMutation1346");
        setUpTest();
        one.add(((E)("1")));
        one.add(((E)("foo")));
        two.add(((E)("1")));
        c.addComposited(one);
        c.retainAll(two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4725,!(c.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4726,!(one.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4728,c,4727,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4730,one,4729,one.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRetainAll_literalMutation1347() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRetainAll_literalMutation1347");
        setUpTest();
        one.add(((E)("1")));
        one.add(((E)("2")));
        two.add(((E)("foo")));
        c.addComposited(one);
        c.retainAll(two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4725,!(c.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4726,!(one.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4728,c,4727,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4730,one,4729,one.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "foo" , "serial" })
    public void testAddAllMutator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddAllMutator");
        setUpTest();
        c.setMutator(new CompositeCollection.CollectionMutator<E>() {
            public boolean add(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final E obj) {
                for (final Collection<E> collection : collections) {
                    collection.add(obj);
                }
                return true;
            }

            public boolean addAll(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final Collection<? extends E> coll) {
                for (final Collection<E> collection : collections) {
                    collection.addAll(coll);
                }
                return true;
            }

            public boolean remove(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final Object obj) {
                return false;
            }
        });
        c.addComposited(one);
        two.add(((E)("foo")));
        c.addAll(two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4680,c,4679,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4682,one,4681,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "foo" })
    public void testAddAllMutator_literalMutation1302() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddAllMutator_literalMutation1302");
        setUpTest();
        c.setMutator(new CompositeCollection.CollectionMutator<E>() {
            public boolean add(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final E obj) {
                for (final Collection<E> collection : collections) {
                    collection.add(obj);
                }
                return true;
            }

            public boolean addAll(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final Collection<? extends E> coll) {
                for (final Collection<E> collection : collections) {
                    collection.addAll(coll);
                }
                return true;
            }

            public boolean remove(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final Object obj) {
                return false;
            }
        });
        c.addComposited(one);
        two.add(((E)("foo")));
        c.addAll(two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4680,c,4679,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4682,one,4681,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    public void testAddAllMutator_literalMutation1303() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddAllMutator_literalMutation1303");
        setUpTest();
        c.setMutator(new CompositeCollection.CollectionMutator<E>() {
            public boolean add(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final E obj) {
                for (final Collection<E> collection : collections) {
                    collection.add(obj);
                }
                return true;
            }

            public boolean addAll(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final Collection<? extends E> coll) {
                for (final Collection<E> collection : collections) {
                    collection.addAll(coll);
                }
                return true;
            }

            public boolean remove(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final Object obj) {
                return false;
            }
        });
        c.addComposited(one);
        two.add(((E)("foo")));
        c.addAll(two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4680,c,4679,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4682,one,4681,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    public void testAddAllMutator_literalMutation1304() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddAllMutator_literalMutation1304");
        setUpTest();
        c.setMutator(new CompositeCollection.CollectionMutator<E>() {
            public boolean add(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final E obj) {
                for (final Collection<E> collection : collections) {
                    collection.add(obj);
                }
                return true;
            }

            public boolean addAll(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final Collection<? extends E> coll) {
                for (final Collection<E> collection : collections) {
                    collection.addAll(coll);
                }
                return false;
            }

            public boolean remove(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final Object obj) {
                return false;
            }
        });
        c.addComposited(one);
        two.add(((E)("foo")));
        c.addAll(two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4680,c,4679,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4682,one,4681,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    public void testAddAllMutator_literalMutation1305() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddAllMutator_literalMutation1305");
        setUpTest();
        c.setMutator(new CompositeCollection.CollectionMutator<E>() {
            public boolean add(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final E obj) {
                for (final Collection<E> collection : collections) {
                    collection.add(obj);
                }
                return true;
            }

            public boolean addAll(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final Collection<? extends E> coll) {
                for (final Collection<E> collection : collections) {
                    collection.addAll(coll);
                }
                return true;
            }

            public boolean remove(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final Object obj) {
                return false;
            }
        });
        c.addComposited(one);
        two.add(((E)("foo")));
        c.addAll(two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4680,c,4679,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4682,one,4681,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    public void testAddAllMutator_literalMutation1306() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddAllMutator_literalMutation1306");
        setUpTest();
        c.setMutator(new CompositeCollection.CollectionMutator<E>() {
            public boolean add(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final E obj) {
                for (final Collection<E> collection : collections) {
                    collection.add(obj);
                }
                return true;
            }

            public boolean addAll(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final Collection<? extends E> coll) {
                for (final Collection<E> collection : collections) {
                    collection.addAll(coll);
                }
                return true;
            }

            public boolean remove(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final Object obj) {
                return false;
            }
        });
        c.addComposited(one);
        two.add(((E)("foo")));
        c.addAll(two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4680,c,4679,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4682,one,4681,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "foo" , "serial" })
    public void testAddMutator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddMutator");
        setUpTest();
        c.setMutator(new CompositeCollection.CollectionMutator<E>() {
            public boolean add(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final E obj) {
                for (final Collection<E> collection : collections) {
                    collection.add(obj);
                }
                return true;
            }

            public boolean addAll(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final Collection<? extends E> coll) {
                for (final Collection<E> collection : collections) {
                    collection.addAll(coll);
                }
                return true;
            }

            public boolean remove(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final Object obj) {
                return false;
            }
        });
        c.addComposited(one);
        c.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4690,c,4689,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4692,one,4691,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "foo" })
    public void testAddMutator_literalMutation1311() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddMutator_literalMutation1311");
        setUpTest();
        c.setMutator(new CompositeCollection.CollectionMutator<E>() {
            public boolean add(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final E obj) {
                for (final Collection<E> collection : collections) {
                    collection.add(obj);
                }
                return true;
            }

            public boolean addAll(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final Collection<? extends E> coll) {
                for (final Collection<E> collection : collections) {
                    collection.addAll(coll);
                }
                return true;
            }

            public boolean remove(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final Object obj) {
                return false;
            }
        });
        c.addComposited(one);
        c.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4690,c,4689,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4692,one,4691,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    public void testAddMutator_literalMutation1312() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddMutator_literalMutation1312");
        setUpTest();
        c.setMutator(new CompositeCollection.CollectionMutator<E>() {
            public boolean add(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final E obj) {
                for (final Collection<E> collection : collections) {
                    collection.add(obj);
                }
                return true;
            }

            public boolean addAll(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final Collection<? extends E> coll) {
                for (final Collection<E> collection : collections) {
                    collection.addAll(coll);
                }
                return true;
            }

            public boolean remove(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final Object obj) {
                return false;
            }
        });
        c.addComposited(one);
        c.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4690,c,4689,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4692,one,4691,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    public void testAddMutator_literalMutation1313() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddMutator_literalMutation1313");
        setUpTest();
        c.setMutator(new CompositeCollection.CollectionMutator<E>() {
            public boolean add(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final E obj) {
                for (final Collection<E> collection : collections) {
                    collection.add(obj);
                }
                return true;
            }

            public boolean addAll(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final Collection<? extends E> coll) {
                for (final Collection<E> collection : collections) {
                    collection.addAll(coll);
                }
                return true;
            }

            public boolean remove(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final Object obj) {
                return false;
            }
        });
        c.addComposited(one);
        c.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4690,c,4689,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4692,one,4691,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    public void testAddMutator_literalMutation1314() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddMutator_literalMutation1314");
        setUpTest();
        c.setMutator(new CompositeCollection.CollectionMutator<E>() {
            public boolean add(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final E obj) {
                for (final Collection<E> collection : collections) {
                    collection.add(obj);
                }
                return true;
            }

            public boolean addAll(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final Collection<? extends E> coll) {
                for (final Collection<E> collection : collections) {
                    collection.addAll(coll);
                }
                return true;
            }

            public boolean remove(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final Object obj) {
                return false;
            }
        });
        c.addComposited(one);
        c.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4690,c,4689,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4692,one,4691,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    public void testAddMutator_literalMutation1315() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddMutator_literalMutation1315");
        setUpTest();
        c.setMutator(new CompositeCollection.CollectionMutator<E>() {
            public boolean add(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final E obj) {
                for (final Collection<E> collection : collections) {
                    collection.add(obj);
                }
                return true;
            }

            public boolean addAll(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final Collection<? extends E> coll) {
                for (final Collection<E> collection : collections) {
                    collection.addAll(coll);
                }
                return true;
            }

            public boolean remove(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final Object obj) {
                return false;
            }
        });
        c.addComposited(one);
        c.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4690,c,4689,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4692,one,4691,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testToCollection() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToCollection");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        c.addComposited(one, two);
        final Collection<E> foo = c.toCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4736,foo,4735,foo.containsAll(c));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4738,c,4737,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4740,foo,4739,foo.size());
        one.add(((E)("3")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4741,!(foo.containsAll(c)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testToCollection_literalMutation1352() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToCollection_literalMutation1352");
        setUpTest();
        one.add(((E)("foo")));
        two.add(((E)("2")));
        c.addComposited(one, two);
        final Collection<E> foo = c.toCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4736,foo,4735,foo.containsAll(c));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4738,c,4737,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4740,foo,4739,foo.size());
        one.add(((E)("3")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4741,!(foo.containsAll(c)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testToCollection_literalMutation1353() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToCollection_literalMutation1353");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("foo")));
        c.addComposited(one, two);
        final Collection<E> foo = c.toCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4736,foo,4735,foo.containsAll(c));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4738,c,4737,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4740,foo,4739,foo.size());
        one.add(((E)("3")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4741,!(foo.containsAll(c)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testToCollection_literalMutation1354() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToCollection_literalMutation1354");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        c.addComposited(one, two);
        final Collection<E> foo = c.toCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4736,foo,4735,foo.containsAll(c));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4738,c,4737,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4740,foo,4739,foo.size());
        one.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4741,!(foo.containsAll(c)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testAddAllToCollection() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddAllToCollection");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        c.addComposited(one, two);
        final Collection<E> toCollection = new HashSet<E>();
        toCollection.addAll(c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4684,toCollection,4683,toCollection.containsAll(c));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4686,c,4685,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4688,toCollection,4687,toCollection.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testAddAllToCollection_literalMutation1308() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddAllToCollection_literalMutation1308");
        setUpTest();
        one.add(((E)("foo")));
        two.add(((E)("2")));
        c.addComposited(one, two);
        final Collection<E> toCollection = new HashSet<E>();
        toCollection.addAll(c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4684,toCollection,4683,toCollection.containsAll(c));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4686,c,4685,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4688,toCollection,4687,toCollection.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testAddAllToCollection_literalMutation1309() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddAllToCollection_literalMutation1309");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("foo")));
        c.addComposited(one, two);
        final Collection<E> toCollection = new HashSet<E>();
        toCollection.addAll(c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4684,toCollection,4683,toCollection.containsAll(c));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4686,c,4685,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4688,toCollection,4687,toCollection.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemove() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove");
        setUpMutatorTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one, two);
        c.remove("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4715,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4716,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4717,!(two.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemove_literalMutation1331() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_literalMutation1331");
        setUpMutatorTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one, two);
        c.remove("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4715,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4716,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4717,!(two.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemove_literalMutation1332() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_literalMutation1332");
        setUpMutatorTest();
        one.add(((E)("foo")));
        two.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one, two);
        c.remove("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4715,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4716,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4717,!(two.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemove_literalMutation1333() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_literalMutation1333");
        setUpMutatorTest();
        one.add(((E)("1")));
        two.add(((E)("foo")));
        two.add(((E)("1")));
        c.addComposited(one, two);
        c.remove("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4715,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4716,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4717,!(two.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemove_literalMutation1334() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_literalMutation1334");
        setUpMutatorTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("foo")));
        c.addComposited(one, two);
        c.remove("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4715,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4716,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4717,!(two.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemove_literalMutation1335() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_literalMutation1335");
        setUpMutatorTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one, two);
        c.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4715,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4716,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4717,!(two.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveAll() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveAll");
        setUpMutatorTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("1")));
        final Collection<E> removing = new ArrayList<E>(one);
        c.addComposited(one, two);
        c.removeAll(removing);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4718,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4719,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4720,!(two.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveAll_literalMutation1337() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveAll_literalMutation1337");
        setUpMutatorTest();
        one.add(((E)("foo")));
        two.add(((E)("2")));
        two.add(((E)("1")));
        final Collection<E> removing = new ArrayList<E>(one);
        c.addComposited(one, two);
        c.removeAll(removing);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4718,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4719,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4720,!(two.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveAll_literalMutation1338() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveAll_literalMutation1338");
        setUpMutatorTest();
        one.add(((E)("1")));
        two.add(((E)("foo")));
        two.add(((E)("1")));
        final Collection<E> removing = new ArrayList<E>(one);
        c.addComposited(one, two);
        c.removeAll(removing);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4718,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4719,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4720,!(two.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveAll_literalMutation1339() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveAll_literalMutation1339");
        setUpMutatorTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("foo")));
        final Collection<E> removing = new ArrayList<E>(one);
        c.addComposited(one, two);
        c.removeAll(removing);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4718,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4719,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4720,!(two.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveComposited() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveComposited");
        setUpMutatorTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one, two);
        c.removeComposited(one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4722,c,4721,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4724,c,4723,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveComposited_literalMutation1340() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveComposited_literalMutation1340");
        setUpMutatorTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one, two);
        c.removeComposited(one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4722,c,4721,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4724,c,4723,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveComposited_literalMutation1341() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveComposited_literalMutation1341");
        setUpMutatorTest();
        one.add(((E)("foo")));
        two.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one, two);
        c.removeComposited(one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4722,c,4721,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4724,c,4723,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveComposited_literalMutation1342() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveComposited_literalMutation1342");
        setUpMutatorTest();
        one.add(((E)("1")));
        two.add(((E)("foo")));
        two.add(((E)("1")));
        c.addComposited(one, two);
        c.removeComposited(one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4722,c,4721,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4724,c,4723,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveComposited_literalMutation1343() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveComposited_literalMutation1343");
        setUpMutatorTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("foo")));
        c.addComposited(one, two);
        c.removeComposited(one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4722,c,4721,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4724,c,4723,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}


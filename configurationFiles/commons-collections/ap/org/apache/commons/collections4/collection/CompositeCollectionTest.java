package org.apache.commons.collections4.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.junit.Test;

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

    /** 
     * Override testUnsupportedRemove, since the default impl expects removeAll,
     * retainAll and iterator().remove to throw
     */
@Test(timeout = 1000)
    public void testUnsupportedRemove_add1531() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedRemove_add1531");
        resetFull();
        resetFull();
        try {
            getCollection().remove(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Override testUnsupportedRemove, since the default impl expects removeAll,
     * retainAll and iterator().remove to throw
     */
@Test(timeout = 1000)
    public void testUnsupportedRemove_add1532() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedRemove_add1532");
        resetFull();
        try {
            getCollection().remove(null);
            getCollection().remove(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Override testUnsupportedRemove, since the default impl expects removeAll,
     * retainAll and iterator().remove to throw
     */
@Test(timeout = 1000)
    public void testUnsupportedRemove_add1533() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedRemove_add1533");
        resetFull();
        try {
            getCollection().remove(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Override testUnsupportedRemove, since the default impl expects removeAll,
     * retainAll and iterator().remove to throw
     */
@Test(timeout = 1000)
    public void testUnsupportedRemove_remove1162() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedRemove_remove1162");
        try {
            getCollection().remove(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Override testUnsupportedRemove, since the default impl expects removeAll,
     * retainAll and iterator().remove to throw
     */
@Test(timeout = 1000)
    public void testUnsupportedRemove_remove1163() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedRemove_remove1163");
        resetFull();
        try {
            getCollection().remove(null);
        } catch (final UnsupportedOperationException e) {
        }
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4740,set,4739,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4742,c,4741,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSize_add1522() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_add1522");
        setUpTest();
        setUpTest();
        final HashSet<E> set = new HashSet<E>();
        set.add(((E)("a")));
        set.add(((E)("b")));
        c.addComposited(set);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4740,set,4739,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4742,c,4741,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSize_add1523() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_add1523");
        setUpTest();
        final HashSet<E> set = new HashSet<E>();
        set.add(((E)("a")));
        set.add(((E)("a")));
        set.add(((E)("b")));
        c.addComposited(set);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4740,set,4739,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4742,c,4741,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSize_add1524() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_add1524");
        setUpTest();
        final HashSet<E> set = new HashSet<E>();
        set.add(((E)("a")));
        set.add(((E)("b")));
        set.add(((E)("b")));
        c.addComposited(set);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4740,set,4739,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4742,c,4741,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSize_add1525() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_add1525");
        setUpTest();
        final HashSet<E> set = new HashSet<E>();
        set.add(((E)("a")));
        set.add(((E)("b")));
        c.addComposited(set);
        c.addComposited(set);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4740,set,4739,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4742,c,4741,c.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4740,set,4739,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4742,c,4741,c.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4740,set,4739,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4742,c,4741,c.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4740,set,4739,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4742,c,4741,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSize_remove1153() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_remove1153");
        final HashSet<E> set = new HashSet<E>();
        set.add(((E)("a")));
        set.add(((E)("b")));
        c.addComposited(set);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4740,set,4739,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4742,c,4741,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSize_remove1154() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_remove1154");
        setUpTest();
        final HashSet<E> set = new HashSet<E>();
        set.add(((E)("b")));
        c.addComposited(set);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4740,set,4739,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4742,c,4741,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSize_remove1155() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_remove1155");
        setUpTest();
        final HashSet<E> set = new HashSet<E>();
        set.add(((E)("b")));
        c.addComposited(set);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4740,set,4739,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4742,c,4741,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSize_remove1156() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_remove1156");
        setUpTest();
        final HashSet<E> set = new HashSet<E>();
        set.add(((E)("a")));
        set.add(((E)("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4740,set,4739,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4742,c,4741,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testMultipleCollectionsSize_add1492() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleCollectionsSize_add1492");
        setUpTest();
        setUpTest();
        final HashSet<E> set = new HashSet<E>();
        set.add(((E)("a")));
        set.add(((E)("b")));
        c.addComposited(set);
        final HashSet<E> other = new HashSet<E>();
        other.add(((E)("c")));
        c.addComposited(other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4720,((set.size()) + (other.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4722,c,4721,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testMultipleCollectionsSize_add1493() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleCollectionsSize_add1493");
        setUpTest();
        final HashSet<E> set = new HashSet<E>();
        set.add(((E)("a")));
        set.add(((E)("a")));
        set.add(((E)("b")));
        c.addComposited(set);
        final HashSet<E> other = new HashSet<E>();
        other.add(((E)("c")));
        c.addComposited(other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4720,((set.size()) + (other.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4722,c,4721,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testMultipleCollectionsSize_add1494() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleCollectionsSize_add1494");
        setUpTest();
        final HashSet<E> set = new HashSet<E>();
        set.add(((E)("a")));
        set.add(((E)("b")));
        set.add(((E)("b")));
        c.addComposited(set);
        final HashSet<E> other = new HashSet<E>();
        other.add(((E)("c")));
        c.addComposited(other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4720,((set.size()) + (other.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4722,c,4721,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testMultipleCollectionsSize_add1495() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleCollectionsSize_add1495");
        setUpTest();
        final HashSet<E> set = new HashSet<E>();
        set.add(((E)("a")));
        set.add(((E)("b")));
        c.addComposited(set);
        c.addComposited(set);
        final HashSet<E> other = new HashSet<E>();
        other.add(((E)("c")));
        c.addComposited(other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4720,((set.size()) + (other.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4722,c,4721,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testMultipleCollectionsSize_add1496() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleCollectionsSize_add1496");
        setUpTest();
        final HashSet<E> set = new HashSet<E>();
        set.add(((E)("a")));
        set.add(((E)("b")));
        c.addComposited(set);
        final HashSet<E> other = new HashSet<E>();
        other.add(((E)("c")));
        other.add(((E)("c")));
        c.addComposited(other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4720,((set.size()) + (other.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4722,c,4721,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testMultipleCollectionsSize_add1497() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleCollectionsSize_add1497");
        setUpTest();
        final HashSet<E> set = new HashSet<E>();
        set.add(((E)("a")));
        set.add(((E)("b")));
        c.addComposited(set);
        final HashSet<E> other = new HashSet<E>();
        other.add(((E)("c")));
        c.addComposited(other);
        c.addComposited(other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4720,((set.size()) + (other.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4722,c,4721,c.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4720,((set.size()) + (other.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4722,c,4721,c.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4720,((set.size()) + (other.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4722,c,4721,c.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4720,((set.size()) + (other.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4722,c,4721,c.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4720,((set.size()) + (other.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4722,c,4721,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testMultipleCollectionsSize_remove1123() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleCollectionsSize_remove1123");
        final HashSet<E> set = new HashSet<E>();
        set.add(((E)("a")));
        set.add(((E)("b")));
        c.addComposited(set);
        final HashSet<E> other = new HashSet<E>();
        other.add(((E)("c")));
        c.addComposited(other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4720,((set.size()) + (other.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4722,c,4721,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testMultipleCollectionsSize_remove1124() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleCollectionsSize_remove1124");
        setUpTest();
        final HashSet<E> set = new HashSet<E>();
        set.add(((E)("b")));
        c.addComposited(set);
        final HashSet<E> other = new HashSet<E>();
        other.add(((E)("c")));
        c.addComposited(other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4720,((set.size()) + (other.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4722,c,4721,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testMultipleCollectionsSize_remove1125() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleCollectionsSize_remove1125");
        setUpTest();
        final HashSet<E> set = new HashSet<E>();
        set.add(((E)("b")));
        c.addComposited(set);
        final HashSet<E> other = new HashSet<E>();
        other.add(((E)("c")));
        c.addComposited(other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4720,((set.size()) + (other.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4722,c,4721,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testMultipleCollectionsSize_remove1126() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleCollectionsSize_remove1126");
        setUpTest();
        final HashSet<E> set = new HashSet<E>();
        set.add(((E)("a")));
        set.add(((E)("b")));
        final HashSet<E> other = new HashSet<E>();
        other.add(((E)("c")));
        c.addComposited(other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4720,((set.size()) + (other.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4722,c,4721,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testMultipleCollectionsSize_remove1127() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleCollectionsSize_remove1127");
        setUpTest();
        final HashSet<E> set = new HashSet<E>();
        set.add(((E)("b")));
        c.addComposited(set);
        final HashSet<E> other = new HashSet<E>();
        other.add(((E)("c")));
        c.addComposited(other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4720,((set.size()) + (other.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4722,c,4721,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testMultipleCollectionsSize_remove1128() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleCollectionsSize_remove1128");
        setUpTest();
        final HashSet<E> set = new HashSet<E>();
        set.add(((E)("a")));
        set.add(((E)("b")));
        final HashSet<E> other = new HashSet<E>();
        other.add(((E)("c")));
        c.addComposited(other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4720,((set.size()) + (other.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4722,c,4721,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIsEmpty() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEmpty");
        setUpTest();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4710,c,4709,c.isEmpty());
        final HashSet<E> empty = new HashSet<E>();
        c.addComposited(empty);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4712,c,4711,c.isEmpty());
        empty.add(((E)("a")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4713,!(c.isEmpty()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIsEmpty_add1483() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEmpty_add1483");
        setUpTest();
        setUpTest();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4710,c,4709,c.isEmpty());
        final HashSet<E> empty = new HashSet<E>();
        c.addComposited(empty);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4712,c,4711,c.isEmpty());
        empty.add(((E)("a")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4713,!(c.isEmpty()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIsEmpty_add1484() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEmpty_add1484");
        setUpTest();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4710,c,4709,c.isEmpty());
        final HashSet<E> empty = new HashSet<E>();
        c.addComposited(empty);
        c.addComposited(empty);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4712,c,4711,c.isEmpty());
        empty.add(((E)("a")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4713,!(c.isEmpty()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIsEmpty_add1485() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEmpty_add1485");
        setUpTest();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4710,c,4709,c.isEmpty());
        final HashSet<E> empty = new HashSet<E>();
        c.addComposited(empty);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4712,c,4711,c.isEmpty());
        empty.add(((E)("a")));
        empty.add(((E)("a")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4713,!(c.isEmpty()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIsEmpty_literalMutation1322() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEmpty_literalMutation1322");
        setUpTest();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4710,c,4709,c.isEmpty());
        final HashSet<E> empty = new HashSet<E>();
        c.addComposited(empty);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4712,c,4711,c.isEmpty());
        empty.add(((E)("a")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4713,!(c.isEmpty()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIsEmpty_literalMutation1323() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEmpty_literalMutation1323");
        setUpTest();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4710,c,4709,c.isEmpty());
        final HashSet<E> empty = new HashSet<E>();
        c.addComposited(empty);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4712,c,4711,c.isEmpty());
        empty.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4713,!(c.isEmpty()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIsEmpty_remove1114() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEmpty_remove1114");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4710,c,4709,c.isEmpty());
        final HashSet<E> empty = new HashSet<E>();
        c.addComposited(empty);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4712,c,4711,c.isEmpty());
        empty.add(((E)("a")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4713,!(c.isEmpty()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIsEmpty_remove1115() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEmpty_remove1115");
        setUpTest();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4710,c,4709,c.isEmpty());
        final HashSet<E> empty = new HashSet<E>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4712,c,4711,c.isEmpty());
        empty.add(((E)("a")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4713,!(c.isEmpty()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIsEmpty_remove1116() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEmpty_remove1116");
        setUpTest();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4710,c,4709,c.isEmpty());
        final HashSet<E> empty = new HashSet<E>();
        c.addComposited(empty);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4712,c,4711,c.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4713,!(c.isEmpty()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4715,c,4714,c.contains(next));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4717,one,4716,one.contains(next));
        next = i.next();
        i.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4718,!(c.contains(next)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4719,!(two.contains(next)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIterator_add1486() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator_add1486");
        setUpTest();
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        c.addComposited(one);
        c.addComposited(two);
        final Iterator<E> i = c.iterator();
        E next = i.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4715,c,4714,c.contains(next));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4717,one,4716,one.contains(next));
        next = i.next();
        i.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4718,!(c.contains(next)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4719,!(two.contains(next)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIterator_add1487() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator_add1487");
        setUpTest();
        one.add(((E)("1")));
        one.add(((E)("1")));
        two.add(((E)("2")));
        c.addComposited(one);
        c.addComposited(two);
        final Iterator<E> i = c.iterator();
        E next = i.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4715,c,4714,c.contains(next));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4717,one,4716,one.contains(next));
        next = i.next();
        i.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4718,!(c.contains(next)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4719,!(two.contains(next)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIterator_add1488() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator_add1488");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("2")));
        c.addComposited(one);
        c.addComposited(two);
        final Iterator<E> i = c.iterator();
        E next = i.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4715,c,4714,c.contains(next));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4717,one,4716,one.contains(next));
        next = i.next();
        i.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4718,!(c.contains(next)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4719,!(two.contains(next)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIterator_add1489() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator_add1489");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        c.addComposited(one);
        c.addComposited(one);
        c.addComposited(two);
        final Iterator<E> i = c.iterator();
        E next = i.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4715,c,4714,c.contains(next));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4717,one,4716,one.contains(next));
        next = i.next();
        i.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4718,!(c.contains(next)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4719,!(two.contains(next)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIterator_add1490() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator_add1490");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        c.addComposited(one);
        c.addComposited(two);
        c.addComposited(two);
        final Iterator<E> i = c.iterator();
        E next = i.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4715,c,4714,c.contains(next));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4717,one,4716,one.contains(next));
        next = i.next();
        i.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4718,!(c.contains(next)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4719,!(two.contains(next)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIterator_add1491() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator_add1491");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        c.addComposited(one);
        c.addComposited(two);
        final Iterator<E> i = c.iterator();
        E next = i.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4715,c,4714,c.contains(next));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4717,one,4716,one.contains(next));
        next = i.next();
        i.remove();
        i.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4718,!(c.contains(next)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4719,!(two.contains(next)));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4715,c,4714,c.contains(next));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4717,one,4716,one.contains(next));
        next = i.next();
        i.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4718,!(c.contains(next)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4719,!(two.contains(next)));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4715,c,4714,c.contains(next));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4717,one,4716,one.contains(next));
        next = i.next();
        i.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4718,!(c.contains(next)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4719,!(two.contains(next)));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4715,c,4714,c.contains(next));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4717,one,4716,one.contains(next));
        next = i.next();
        i.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4718,!(c.contains(next)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4719,!(two.contains(next)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIterator_remove1117() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator_remove1117");
        one.add(((E)("1")));
        two.add(((E)("2")));
        c.addComposited(one);
        c.addComposited(two);
        final Iterator<E> i = c.iterator();
        E next = i.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4715,c,4714,c.contains(next));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4717,one,4716,one.contains(next));
        next = i.next();
        i.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4718,!(c.contains(next)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4719,!(two.contains(next)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIterator_remove1118() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator_remove1118");
        setUpTest();
        two.add(((E)("2")));
        c.addComposited(one);
        c.addComposited(two);
        final Iterator<E> i = c.iterator();
        E next = i.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4715,c,4714,c.contains(next));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4717,one,4716,one.contains(next));
        next = i.next();
        i.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4718,!(c.contains(next)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4719,!(two.contains(next)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIterator_remove1119() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator_remove1119");
        setUpTest();
        two.add(((E)("2")));
        c.addComposited(one);
        c.addComposited(two);
        final Iterator<E> i = c.iterator();
        E next = i.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4715,c,4714,c.contains(next));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4717,one,4716,one.contains(next));
        next = i.next();
        i.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4718,!(c.contains(next)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4719,!(two.contains(next)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIterator_remove1120() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator_remove1120");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        c.addComposited(two);
        final Iterator<E> i = c.iterator();
        E next = i.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4715,c,4714,c.contains(next));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4717,one,4716,one.contains(next));
        next = i.next();
        i.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4718,!(c.contains(next)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4719,!(two.contains(next)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIterator_remove1121() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator_remove1121");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        c.addComposited(two);
        final Iterator<E> i = c.iterator();
        E next = i.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4715,c,4714,c.contains(next));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4717,one,4716,one.contains(next));
        next = i.next();
        i.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4718,!(c.contains(next)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4719,!(two.contains(next)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testIterator_remove1122() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator_remove1122");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        c.addComposited(one);
        c.addComposited(two);
        final Iterator<E> i = c.iterator();
        E next = i.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4715,c,4714,c.contains(next));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4717,one,4716,one.contains(next));
        next = i.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4718,!(c.contains(next)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4719,!(two.contains(next)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testClear_add1474() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_add1474");
        setUpTest();
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        c.addComposited(one, two);
        c.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4702,one,4701,one.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4704,two,4703,two.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4706,c,4705,c.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testClear_add1475() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_add1475");
        setUpTest();
        one.add(((E)("1")));
        one.add(((E)("1")));
        two.add(((E)("2")));
        c.addComposited(one, two);
        c.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4702,one,4701,one.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4704,two,4703,two.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4706,c,4705,c.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testClear_add1476() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_add1476");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("2")));
        c.addComposited(one, two);
        c.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4702,one,4701,one.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4704,two,4703,two.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4706,c,4705,c.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testClear_add1477() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_add1477");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        c.addComposited(one, two);
        c.addComposited(one, two);
        c.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4702,one,4701,one.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4704,two,4703,two.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4706,c,4705,c.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testClear_add1478() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_add1478");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        c.addComposited(one, two);
        c.clear();
        c.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4702,one,4701,one.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4704,two,4703,two.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4706,c,4705,c.isEmpty());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4702,one,4701,one.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4704,two,4703,two.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4706,c,4705,c.isEmpty());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4702,one,4701,one.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4704,two,4703,two.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4706,c,4705,c.isEmpty());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4702,one,4701,one.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4704,two,4703,two.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4706,c,4705,c.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testClear_remove1105() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_remove1105");
        one.add(((E)("1")));
        two.add(((E)("2")));
        c.addComposited(one, two);
        c.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4702,one,4701,one.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4704,two,4703,two.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4706,c,4705,c.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testClear_remove1106() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_remove1106");
        setUpTest();
        two.add(((E)("2")));
        c.addComposited(one, two);
        c.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4702,one,4701,one.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4704,two,4703,two.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4706,c,4705,c.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testClear_remove1107() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_remove1107");
        setUpTest();
        two.add(((E)("2")));
        c.addComposited(one, two);
        c.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4702,one,4701,one.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4704,two,4703,two.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4706,c,4705,c.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testClear_remove1108() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_remove1108");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        c.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4702,one,4701,one.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4704,two,4703,two.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4706,c,4705,c.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testClear_remove1109() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_remove1109");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        c.addComposited(one, two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4702,one,4701,one.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4704,two,4703,two.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4706,c,4705,c.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testContainsAll_add1479() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsAll_add1479");
        setUpTest();
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("1")));
        c.addComposited(one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4708,c,4707,c.containsAll(two));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testContainsAll_add1480() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsAll_add1480");
        setUpTest();
        one.add(((E)("1")));
        one.add(((E)("1")));
        two.add(((E)("1")));
        c.addComposited(one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4708,c,4707,c.containsAll(two));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testContainsAll_add1481() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsAll_add1481");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("1")));
        two.add(((E)("1")));
        c.addComposited(one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4708,c,4707,c.containsAll(two));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testContainsAll_add1482() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsAll_add1482");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("1")));
        c.addComposited(one);
        c.addComposited(one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4708,c,4707,c.containsAll(two));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testContainsAll() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsAll");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("1")));
        c.addComposited(one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4708,c,4707,c.containsAll(two));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testContainsAll_literalMutation1320() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsAll_literalMutation1320");
        setUpTest();
        one.add(((E)("foo")));
        two.add(((E)("1")));
        c.addComposited(one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4708,c,4707,c.containsAll(two));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testContainsAll_literalMutation1321() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsAll_literalMutation1321");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("foo")));
        c.addComposited(one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4708,c,4707,c.containsAll(two));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testContainsAll_remove1110() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsAll_remove1110");
        one.add(((E)("1")));
        two.add(((E)("1")));
        c.addComposited(one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4708,c,4707,c.containsAll(two));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testContainsAll_remove1111() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsAll_remove1111");
        setUpTest();
        two.add(((E)("1")));
        c.addComposited(one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4708,c,4707,c.containsAll(two));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testContainsAll_remove1112() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsAll_remove1112");
        setUpTest();
        two.add(((E)("1")));
        c.addComposited(one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4708,c,4707,c.containsAll(two));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testContainsAll_remove1113() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsAll_remove1113");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4708,c,4707,c.containsAll(two));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRetainAll_add1516() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRetainAll_add1516");
        setUpTest();
        setUpTest();
        one.add(((E)("1")));
        one.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one);
        c.retainAll(two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4733,!(c.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4734,!(one.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4736,c,4735,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4738,one,4737,one.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRetainAll_add1517() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRetainAll_add1517");
        setUpTest();
        one.add(((E)("1")));
        one.add(((E)("1")));
        one.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one);
        c.retainAll(two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4733,!(c.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4734,!(one.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4736,c,4735,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4738,one,4737,one.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRetainAll_add1518() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRetainAll_add1518");
        setUpTest();
        one.add(((E)("1")));
        one.add(((E)("2")));
        one.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one);
        c.retainAll(two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4733,!(c.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4734,!(one.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4736,c,4735,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4738,one,4737,one.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRetainAll_add1519() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRetainAll_add1519");
        setUpTest();
        one.add(((E)("1")));
        one.add(((E)("2")));
        two.add(((E)("1")));
        two.add(((E)("1")));
        c.addComposited(one);
        c.retainAll(two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4733,!(c.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4734,!(one.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4736,c,4735,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4738,one,4737,one.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRetainAll_add1520() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRetainAll_add1520");
        setUpTest();
        one.add(((E)("1")));
        one.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one);
        c.addComposited(one);
        c.retainAll(two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4733,!(c.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4734,!(one.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4736,c,4735,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4738,one,4737,one.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRetainAll_add1521() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRetainAll_add1521");
        setUpTest();
        one.add(((E)("1")));
        one.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one);
        c.retainAll(two);
        c.retainAll(two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4733,!(c.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4734,!(one.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4736,c,4735,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4738,one,4737,one.contains("1"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4733,!(c.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4734,!(one.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4736,c,4735,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4738,one,4737,one.contains("1"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4733,!(c.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4734,!(one.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4736,c,4735,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4738,one,4737,one.contains("1"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4733,!(c.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4734,!(one.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4736,c,4735,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4738,one,4737,one.contains("1"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4733,!(c.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4734,!(one.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4736,c,4735,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4738,one,4737,one.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRetainAll_remove1147() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRetainAll_remove1147");
        one.add(((E)("1")));
        one.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one);
        c.retainAll(two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4733,!(c.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4734,!(one.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4736,c,4735,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4738,one,4737,one.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRetainAll_remove1148() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRetainAll_remove1148");
        setUpTest();
        one.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one);
        c.retainAll(two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4733,!(c.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4734,!(one.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4736,c,4735,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4738,one,4737,one.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRetainAll_remove1149() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRetainAll_remove1149");
        setUpTest();
        one.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one);
        c.retainAll(two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4733,!(c.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4734,!(one.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4736,c,4735,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4738,one,4737,one.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRetainAll_remove1150() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRetainAll_remove1150");
        setUpTest();
        one.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one);
        c.retainAll(two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4733,!(c.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4734,!(one.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4736,c,4735,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4738,one,4737,one.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRetainAll_remove1151() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRetainAll_remove1151");
        setUpTest();
        one.add(((E)("1")));
        one.add(((E)("2")));
        two.add(((E)("1")));
        c.retainAll(two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4733,!(c.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4734,!(one.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4736,c,4735,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4738,one,4737,one.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRetainAll_remove1152() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRetainAll_remove1152");
        setUpTest();
        one.add(((E)("1")));
        one.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4733,!(c.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4734,!(one.contains("2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4736,c,4735,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4738,one,4737,one.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    @Test(timeout = 1000)
    public void testAddAllMutator_add1454() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddAllMutator_add1454");
        setUpTest();
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4688,c,4687,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4690,one,4689,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    @Test(timeout = 1000)
    public void testAddAllMutator_add1455() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddAllMutator_add1455");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4688,c,4687,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4690,one,4689,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    @Test(timeout = 1000)
    public void testAddAllMutator_add1456() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddAllMutator_add1456");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4688,c,4687,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4690,one,4689,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    @Test(timeout = 1000)
    public void testAddAllMutator_add1457() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddAllMutator_add1457");
        setUpTest();
        c.setMutator(new CompositeCollection.CollectionMutator<E>() {
            public boolean add(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final E obj) {
                for (final Collection<E> collection : collections) {
                    collection.add(obj);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4688,c,4687,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4690,one,4689,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    @Test(timeout = 1000)
    public void testAddAllMutator_add1458() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddAllMutator_add1458");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4688,c,4687,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4690,one,4689,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    @Test(timeout = 1000)
    public void testAddAllMutator_add1459() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddAllMutator_add1459");
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
        c.addComposited(one);
        two.add(((E)("foo")));
        c.addAll(two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4688,c,4687,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4690,one,4689,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    @Test(timeout = 1000)
    public void testAddAllMutator_add1460() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddAllMutator_add1460");
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
        two.add(((E)("foo")));
        c.addAll(two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4688,c,4687,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4690,one,4689,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    @Test(timeout = 1000)
    public void testAddAllMutator_add1461() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddAllMutator_add1461");
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
        c.addAll(two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4688,c,4687,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4690,one,4689,one.contains("foo"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4688,c,4687,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4690,one,4689,one.contains("foo"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4688,c,4687,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4690,one,4689,one.contains("foo"));
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
                return false;
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4688,c,4687,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4690,one,4689,one.contains("foo"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4688,c,4687,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4690,one,4689,one.contains("foo"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4688,c,4687,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4690,one,4689,one.contains("foo"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4688,c,4687,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4690,one,4689,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    @Test(timeout = 1000)
    public void testAddAllMutator_remove1085() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddAllMutator_remove1085");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4688,c,4687,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4690,one,4689,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    @Test(timeout = 1000)
    public void testAddAllMutator_remove1086() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddAllMutator_remove1086");
        setUpTest();
        c.addComposited(one);
        two.add(((E)("foo")));
        c.addAll(two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4688,c,4687,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4690,one,4689,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    @Test(timeout = 1000)
    public void testAddAllMutator_remove1087() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddAllMutator_remove1087");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4688,c,4687,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4690,one,4689,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    @Test(timeout = 1000)
    public void testAddAllMutator_remove1088() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddAllMutator_remove1088");
        setUpTest();
        c.setMutator(new CompositeCollection.CollectionMutator<E>() {
            public boolean add(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final E obj) {
                for (final Collection<E> collection : collections) {
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4688,c,4687,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4690,one,4689,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    @Test(timeout = 1000)
    public void testAddAllMutator_remove1089() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddAllMutator_remove1089");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4688,c,4687,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4690,one,4689,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    @Test(timeout = 1000)
    public void testAddAllMutator_remove1090() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddAllMutator_remove1090");
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
        two.add(((E)("foo")));
        c.addAll(two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4688,c,4687,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4690,one,4689,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    @Test(timeout = 1000)
    public void testAddAllMutator_remove1091() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddAllMutator_remove1091");
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
        c.addAll(two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4688,c,4687,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4690,one,4689,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    @Test(timeout = 1000)
    public void testAddAllMutator_remove1092() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddAllMutator_remove1092");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4688,c,4687,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4690,one,4689,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    @Test(timeout = 1000)
    public void testAddMutator_add1467() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddMutator_add1467");
        setUpTest();
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4698,c,4697,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4700,one,4699,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    @Test(timeout = 1000)
    public void testAddMutator_add1468() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddMutator_add1468");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4698,c,4697,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4700,one,4699,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    @Test(timeout = 1000)
    public void testAddMutator_add1469() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddMutator_add1469");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4698,c,4697,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4700,one,4699,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    @Test(timeout = 1000)
    public void testAddMutator_add1470() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddMutator_add1470");
        setUpTest();
        c.setMutator(new CompositeCollection.CollectionMutator<E>() {
            public boolean add(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final E obj) {
                for (final Collection<E> collection : collections) {
                    collection.add(obj);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4698,c,4697,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4700,one,4699,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    @Test(timeout = 1000)
    public void testAddMutator_add1471() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddMutator_add1471");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4698,c,4697,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4700,one,4699,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    @Test(timeout = 1000)
    public void testAddMutator_add1472() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddMutator_add1472");
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
        c.addComposited(one);
        c.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4698,c,4697,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4700,one,4699,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    @Test(timeout = 1000)
    public void testAddMutator_add1473() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddMutator_add1473");
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
        c.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4698,c,4697,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4700,one,4699,one.contains("foo"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4698,c,4697,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4700,one,4699,one.contains("foo"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4698,c,4697,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4700,one,4699,one.contains("foo"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4698,c,4697,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4700,one,4699,one.contains("foo"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4698,c,4697,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4700,one,4699,one.contains("foo"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4698,c,4697,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4700,one,4699,one.contains("foo"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4698,c,4697,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4700,one,4699,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    @Test(timeout = 1000)
    public void testAddMutator_remove1098() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddMutator_remove1098");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4698,c,4697,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4700,one,4699,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    @Test(timeout = 1000)
    public void testAddMutator_remove1099() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddMutator_remove1099");
        setUpTest();
        c.addComposited(one);
        c.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4698,c,4697,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4700,one,4699,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    @Test(timeout = 1000)
    public void testAddMutator_remove1100() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddMutator_remove1100");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4698,c,4697,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4700,one,4699,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    @Test(timeout = 1000)
    public void testAddMutator_remove1101() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddMutator_remove1101");
        setUpTest();
        c.setMutator(new CompositeCollection.CollectionMutator<E>() {
            public boolean add(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final E obj) {
                for (final Collection<E> collection : collections) {
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4698,c,4697,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4700,one,4699,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    @Test(timeout = 1000)
    public void testAddMutator_remove1102() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddMutator_remove1102");
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
                }
                return true;
            }

            public boolean remove(final CompositeCollection<E> composite, final java.util.List<java.util.Collection<E>> collections, final Object obj) {
                return false;
            }
        });
        c.addComposited(one);
        c.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4698,c,4697,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4700,one,4699,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    @Test(timeout = 1000)
    public void testAddMutator_remove1103() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddMutator_remove1103");
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
        c.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4698,c,4697,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4700,one,4699,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "serial" })
    @Test(timeout = 1000)
    public void testAddMutator_remove1104() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddMutator_remove1104");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4698,c,4697,c.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4700,one,4699,one.contains("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testToCollection_add1526() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToCollection_add1526");
        setUpTest();
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        c.addComposited(one, two);
        final Collection<E> foo = c.toCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4744,foo,4743,foo.containsAll(c));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4746,c,4745,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4748,foo,4747,foo.size());
        one.add(((E)("3")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4749,!(foo.containsAll(c)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testToCollection_add1527() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToCollection_add1527");
        setUpTest();
        one.add(((E)("1")));
        one.add(((E)("1")));
        two.add(((E)("2")));
        c.addComposited(one, two);
        final Collection<E> foo = c.toCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4744,foo,4743,foo.containsAll(c));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4746,c,4745,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4748,foo,4747,foo.size());
        one.add(((E)("3")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4749,!(foo.containsAll(c)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testToCollection_add1528() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToCollection_add1528");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("2")));
        c.addComposited(one, two);
        final Collection<E> foo = c.toCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4744,foo,4743,foo.containsAll(c));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4746,c,4745,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4748,foo,4747,foo.size());
        one.add(((E)("3")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4749,!(foo.containsAll(c)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testToCollection_add1529() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToCollection_add1529");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        c.addComposited(one, two);
        c.addComposited(one, two);
        final Collection<E> foo = c.toCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4744,foo,4743,foo.containsAll(c));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4746,c,4745,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4748,foo,4747,foo.size());
        one.add(((E)("3")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4749,!(foo.containsAll(c)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testToCollection_add1530() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToCollection_add1530");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        c.addComposited(one, two);
        final Collection<E> foo = c.toCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4744,foo,4743,foo.containsAll(c));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4746,c,4745,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4748,foo,4747,foo.size());
        one.add(((E)("3")));
        one.add(((E)("3")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4749,!(foo.containsAll(c)));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4744,foo,4743,foo.containsAll(c));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4746,c,4745,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4748,foo,4747,foo.size());
        one.add(((E)("3")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4749,!(foo.containsAll(c)));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4744,foo,4743,foo.containsAll(c));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4746,c,4745,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4748,foo,4747,foo.size());
        one.add(((E)("3")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4749,!(foo.containsAll(c)));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4744,foo,4743,foo.containsAll(c));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4746,c,4745,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4748,foo,4747,foo.size());
        one.add(((E)("3")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4749,!(foo.containsAll(c)));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4744,foo,4743,foo.containsAll(c));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4746,c,4745,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4748,foo,4747,foo.size());
        one.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4749,!(foo.containsAll(c)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testToCollection_remove1157() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToCollection_remove1157");
        one.add(((E)("1")));
        two.add(((E)("2")));
        c.addComposited(one, two);
        final Collection<E> foo = c.toCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4744,foo,4743,foo.containsAll(c));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4746,c,4745,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4748,foo,4747,foo.size());
        one.add(((E)("3")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4749,!(foo.containsAll(c)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testToCollection_remove1158() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToCollection_remove1158");
        setUpTest();
        two.add(((E)("2")));
        c.addComposited(one, two);
        final Collection<E> foo = c.toCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4744,foo,4743,foo.containsAll(c));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4746,c,4745,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4748,foo,4747,foo.size());
        one.add(((E)("3")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4749,!(foo.containsAll(c)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testToCollection_remove1159() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToCollection_remove1159");
        setUpTest();
        two.add(((E)("2")));
        c.addComposited(one, two);
        final Collection<E> foo = c.toCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4744,foo,4743,foo.containsAll(c));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4746,c,4745,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4748,foo,4747,foo.size());
        one.add(((E)("3")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4749,!(foo.containsAll(c)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testToCollection_remove1160() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToCollection_remove1160");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        final Collection<E> foo = c.toCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4744,foo,4743,foo.containsAll(c));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4746,c,4745,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4748,foo,4747,foo.size());
        one.add(((E)("3")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4749,!(foo.containsAll(c)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testToCollection_remove1161() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToCollection_remove1161");
        setUpTest();
        two.add(((E)("2")));
        c.addComposited(one, two);
        final Collection<E> foo = c.toCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4744,foo,4743,foo.containsAll(c));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4746,c,4745,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4748,foo,4747,foo.size());
        one.add(((E)("3")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4749,!(foo.containsAll(c)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testAddAllToCollection_add1462() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddAllToCollection_add1462");
        setUpTest();
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        c.addComposited(one, two);
        final Collection<E> toCollection = new HashSet<E>();
        toCollection.addAll(c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4692,toCollection,4691,toCollection.containsAll(c));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4694,c,4693,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4696,toCollection,4695,toCollection.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testAddAllToCollection_add1463() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddAllToCollection_add1463");
        setUpTest();
        one.add(((E)("1")));
        one.add(((E)("1")));
        two.add(((E)("2")));
        c.addComposited(one, two);
        final Collection<E> toCollection = new HashSet<E>();
        toCollection.addAll(c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4692,toCollection,4691,toCollection.containsAll(c));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4694,c,4693,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4696,toCollection,4695,toCollection.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testAddAllToCollection_add1464() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddAllToCollection_add1464");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("2")));
        c.addComposited(one, two);
        final Collection<E> toCollection = new HashSet<E>();
        toCollection.addAll(c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4692,toCollection,4691,toCollection.containsAll(c));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4694,c,4693,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4696,toCollection,4695,toCollection.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testAddAllToCollection_add1465() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddAllToCollection_add1465");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        c.addComposited(one, two);
        c.addComposited(one, two);
        final Collection<E> toCollection = new HashSet<E>();
        toCollection.addAll(c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4692,toCollection,4691,toCollection.containsAll(c));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4694,c,4693,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4696,toCollection,4695,toCollection.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testAddAllToCollection_add1466() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddAllToCollection_add1466");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        c.addComposited(one, two);
        final Collection<E> toCollection = new HashSet<E>();
        toCollection.addAll(c);
        toCollection.addAll(c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4692,toCollection,4691,toCollection.containsAll(c));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4694,c,4693,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4696,toCollection,4695,toCollection.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4692,toCollection,4691,toCollection.containsAll(c));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4694,c,4693,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4696,toCollection,4695,toCollection.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4692,toCollection,4691,toCollection.containsAll(c));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4694,c,4693,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4696,toCollection,4695,toCollection.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4692,toCollection,4691,toCollection.containsAll(c));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4694,c,4693,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4696,toCollection,4695,toCollection.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testAddAllToCollection_remove1093() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddAllToCollection_remove1093");
        one.add(((E)("1")));
        two.add(((E)("2")));
        c.addComposited(one, two);
        final Collection<E> toCollection = new HashSet<E>();
        toCollection.addAll(c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4692,toCollection,4691,toCollection.containsAll(c));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4694,c,4693,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4696,toCollection,4695,toCollection.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testAddAllToCollection_remove1094() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddAllToCollection_remove1094");
        setUpTest();
        two.add(((E)("2")));
        c.addComposited(one, two);
        final Collection<E> toCollection = new HashSet<E>();
        toCollection.addAll(c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4692,toCollection,4691,toCollection.containsAll(c));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4694,c,4693,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4696,toCollection,4695,toCollection.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testAddAllToCollection_remove1095() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddAllToCollection_remove1095");
        setUpTest();
        two.add(((E)("2")));
        c.addComposited(one, two);
        final Collection<E> toCollection = new HashSet<E>();
        toCollection.addAll(c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4692,toCollection,4691,toCollection.containsAll(c));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4694,c,4693,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4696,toCollection,4695,toCollection.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testAddAllToCollection_remove1096() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddAllToCollection_remove1096");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        final Collection<E> toCollection = new HashSet<E>();
        toCollection.addAll(c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4692,toCollection,4691,toCollection.containsAll(c));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4694,c,4693,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4696,toCollection,4695,toCollection.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testAddAllToCollection_remove1097() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddAllToCollection_remove1097");
        setUpTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        c.addComposited(one, two);
        final Collection<E> toCollection = new HashSet<E>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4692,toCollection,4691,toCollection.containsAll(c));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4694,c,4693,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4696,toCollection,4695,toCollection.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4723,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4724,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4725,!(two.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemove_add1498() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_add1498");
        setUpMutatorTest();
        setUpMutatorTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one, two);
        c.remove("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4723,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4724,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4725,!(two.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemove_add1499() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_add1499");
        setUpMutatorTest();
        one.add(((E)("1")));
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one, two);
        c.remove("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4723,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4724,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4725,!(two.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemove_add1500() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_add1500");
        setUpMutatorTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one, two);
        c.remove("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4723,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4724,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4725,!(two.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemove_add1501() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_add1501");
        setUpMutatorTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("1")));
        two.add(((E)("1")));
        c.addComposited(one, two);
        c.remove("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4723,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4724,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4725,!(two.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemove_add1502() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_add1502");
        setUpMutatorTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one, two);
        c.addComposited(one, two);
        c.remove("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4723,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4724,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4725,!(two.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemove_add1503() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_add1503");
        setUpMutatorTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one, two);
        c.remove("1");
        c.remove("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4723,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4724,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4725,!(two.contains("1")));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4723,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4724,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4725,!(two.contains("1")));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4723,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4724,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4725,!(two.contains("1")));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4723,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4724,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4725,!(two.contains("1")));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4723,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4724,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4725,!(two.contains("1")));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4723,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4724,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4725,!(two.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemove_remove1129() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_remove1129");
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one, two);
        c.remove("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4723,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4724,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4725,!(two.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemove_remove1130() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_remove1130");
        setUpMutatorTest();
        two.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one, two);
        c.remove("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4723,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4724,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4725,!(two.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemove_remove1131() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_remove1131");
        setUpMutatorTest();
        two.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one, two);
        c.remove("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4723,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4724,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4725,!(two.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemove_remove1132() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_remove1132");
        setUpMutatorTest();
        two.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one, two);
        c.remove("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4723,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4724,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4725,!(two.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemove_remove1133() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_remove1133");
        setUpMutatorTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("1")));
        c.remove("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4723,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4724,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4725,!(two.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemove_remove1134() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_remove1134");
        setUpMutatorTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one, two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4723,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4724,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4725,!(two.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveAll_add1504() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveAll_add1504");
        setUpMutatorTest();
        setUpMutatorTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("1")));
        final Collection<E> removing = new ArrayList<E>(one);
        c.addComposited(one, two);
        c.removeAll(removing);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4726,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4727,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4728,!(two.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveAll_add1505() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveAll_add1505");
        setUpMutatorTest();
        one.add(((E)("1")));
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("1")));
        final Collection<E> removing = new ArrayList<E>(one);
        c.addComposited(one, two);
        c.removeAll(removing);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4726,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4727,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4728,!(two.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveAll_add1506() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveAll_add1506");
        setUpMutatorTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("2")));
        two.add(((E)("1")));
        final Collection<E> removing = new ArrayList<E>(one);
        c.addComposited(one, two);
        c.removeAll(removing);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4726,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4727,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4728,!(two.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveAll_add1507() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveAll_add1507");
        setUpMutatorTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("1")));
        two.add(((E)("1")));
        final Collection<E> removing = new ArrayList<E>(one);
        c.addComposited(one, two);
        c.removeAll(removing);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4726,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4727,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4728,!(two.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveAll_add1508() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveAll_add1508");
        setUpMutatorTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("1")));
        final Collection<E> removing = new ArrayList<E>(one);
        c.addComposited(one, two);
        c.addComposited(one, two);
        c.removeAll(removing);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4726,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4727,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4728,!(two.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveAll_add1509() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveAll_add1509");
        setUpMutatorTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("1")));
        final Collection<E> removing = new ArrayList<E>(one);
        c.addComposited(one, two);
        c.removeAll(removing);
        c.removeAll(removing);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4726,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4727,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4728,!(two.contains("1")));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4726,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4727,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4728,!(two.contains("1")));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4726,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4727,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4728,!(two.contains("1")));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4726,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4727,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4728,!(two.contains("1")));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4726,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4727,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4728,!(two.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveAll_remove1135() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveAll_remove1135");
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("1")));
        final Collection<E> removing = new ArrayList<E>(one);
        c.addComposited(one, two);
        c.removeAll(removing);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4726,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4727,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4728,!(two.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveAll_remove1136() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveAll_remove1136");
        setUpMutatorTest();
        two.add(((E)("2")));
        two.add(((E)("1")));
        final Collection<E> removing = new ArrayList<E>(one);
        c.addComposited(one, two);
        c.removeAll(removing);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4726,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4727,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4728,!(two.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveAll_remove1137() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveAll_remove1137");
        setUpMutatorTest();
        two.add(((E)("2")));
        two.add(((E)("1")));
        final Collection<E> removing = new ArrayList<E>(one);
        c.addComposited(one, two);
        c.removeAll(removing);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4726,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4727,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4728,!(two.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveAll_remove1138() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveAll_remove1138");
        setUpMutatorTest();
        two.add(((E)("2")));
        two.add(((E)("1")));
        final Collection<E> removing = new ArrayList<E>(one);
        c.addComposited(one, two);
        c.removeAll(removing);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4726,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4727,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4728,!(two.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveAll_remove1139() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveAll_remove1139");
        setUpMutatorTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("1")));
        final Collection<E> removing = new ArrayList<E>(one);
        c.removeAll(removing);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4726,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4727,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4728,!(two.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveAll_remove1140() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveAll_remove1140");
        setUpMutatorTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("1")));
        final Collection<E> removing = new ArrayList<E>(one);
        c.addComposited(one, two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4726,!(c.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4727,!(one.contains("1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4728,!(two.contains("1")));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4730,c,4729,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4732,c,4731,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveComposited_add1510() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveComposited_add1510");
        setUpMutatorTest();
        setUpMutatorTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one, two);
        c.removeComposited(one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4730,c,4729,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4732,c,4731,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveComposited_add1511() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveComposited_add1511");
        setUpMutatorTest();
        one.add(((E)("1")));
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one, two);
        c.removeComposited(one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4730,c,4729,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4732,c,4731,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveComposited_add1512() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveComposited_add1512");
        setUpMutatorTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one, two);
        c.removeComposited(one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4730,c,4729,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4732,c,4731,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveComposited_add1513() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveComposited_add1513");
        setUpMutatorTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("1")));
        two.add(((E)("1")));
        c.addComposited(one, two);
        c.removeComposited(one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4730,c,4729,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4732,c,4731,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveComposited_add1514() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveComposited_add1514");
        setUpMutatorTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one, two);
        c.addComposited(one, two);
        c.removeComposited(one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4730,c,4729,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4732,c,4731,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveComposited_add1515() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveComposited_add1515");
        setUpMutatorTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one, two);
        c.removeComposited(one);
        c.removeComposited(one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4730,c,4729,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4732,c,4731,c.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4730,c,4729,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4732,c,4731,c.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4730,c,4729,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4732,c,4731,c.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4730,c,4729,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4732,c,4731,c.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4730,c,4729,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4732,c,4731,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveComposited_remove1141() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveComposited_remove1141");
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one, two);
        c.removeComposited(one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4730,c,4729,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4732,c,4731,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveComposited_remove1142() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveComposited_remove1142");
        setUpMutatorTest();
        two.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one, two);
        c.removeComposited(one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4730,c,4729,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4732,c,4731,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveComposited_remove1143() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveComposited_remove1143");
        setUpMutatorTest();
        two.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one, two);
        c.removeComposited(one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4730,c,4729,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4732,c,4731,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveComposited_remove1144() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveComposited_remove1144");
        setUpMutatorTest();
        two.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one, two);
        c.removeComposited(one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4730,c,4729,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4732,c,4731,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveComposited_remove1145() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveComposited_remove1145");
        setUpMutatorTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("1")));
        c.removeComposited(one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4730,c,4729,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4732,c,4731,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveComposited_remove1146() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveComposited_remove1146");
        setUpMutatorTest();
        one.add(((E)("1")));
        two.add(((E)("2")));
        two.add(((E)("1")));
        c.addComposited(one, two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4730,c,4729,c.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4732,c,4731,c.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}


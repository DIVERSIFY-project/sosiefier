package org.apache.commons.collections4.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.io.Serializable;
import org.apache.commons.collections4.Transformer;

/** 
 * Extension of {@link AbstractCollectionTest} for exercising the
 * {@link IndexedCollection} implementation.
 * 
 * @version $Id$
 * @since 4.0
 */
@SuppressWarnings(value = "boxing")
public class IndexedCollectionTest extends AbstractCollectionTest<java.lang.String> {
    public IndexedCollectionTest(final String name) {
        super(name);
    }

    protected Collection<java.lang.String> decorateCollection(final Collection<java.lang.String> collection) {
        return IndexedCollection.nonUniqueIndexedCollection(collection, new IntegerTransformer());
    }

    protected IndexedCollection<java.lang.Integer, java.lang.String> decorateUniqueCollection(final Collection<java.lang.String> collection) {
        return IndexedCollection.uniqueIndexedCollection(collection, new IntegerTransformer());
    }

    private static final class IntegerTransformer implements Serializable , Transformer<java.lang.String, java.lang.Integer> {
        private static final long serialVersionUID = 809439581555072949L;

        public Integer transform(final String input) {
            return Integer.valueOf(input);
        }
    }

    @Override
    public Collection<java.lang.String> makeObject() {
        return decorateCollection(new ArrayList<java.lang.String>());
    }

    @Override
    public Collection<java.lang.String> makeConfirmedCollection() {
        return new ArrayList<java.lang.String>();
    }

    @Override
    public String[] getFullElements() {
        return new String[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
    }

    @Override
    public String[] getOtherElements() {
        return new String[]{ "9" , "88" , "678" , "87" , "98" , "78" , "99" };
    }

    @Override
    public Collection<java.lang.String> makeFullCollection() {
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.addAll(java.util.Arrays.asList(getFullElements()));
        return decorateCollection(list);
    }

    @Override
    public Collection<java.lang.String> makeConfirmedFullCollection() {
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.addAll(java.util.Arrays.asList(getFullElements()));
        return list;
    }

    public Collection<java.lang.String> makeTestCollection() {
        return decorateCollection(new ArrayList<java.lang.String>());
    }

    public Collection<java.lang.String> makeUniqueTestCollection() {
        return decorateUniqueCollection(new ArrayList<java.lang.String>());
    }

    @Override
    protected boolean skipSerializedCanonicalTests() {
        return true;
    }

    public void testAddedObjectsCanBeRetrievedByKey() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddedObjectsCanBeRetrievedByKey");
        final Collection<java.lang.String> coll = makeTestCollection();
        coll.add("foo");
        coll.add("16");
        coll.add("1");
        coll.addAll(java.util.Arrays.asList("2", "3", "4"));
        @SuppressWarnings(value = "unchecked")
        final IndexedCollection<java.lang.Integer, java.lang.String> indexed = ((IndexedCollection<java.lang.Integer, java.lang.String>)(coll));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4743,indexed,4742,indexed.get(12));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4745,indexed,4744,indexed.get(16));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4747,indexed,4746,indexed.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4749,indexed,4748,indexed.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4751,indexed,4750,indexed.get(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4753,indexed,4752,indexed.get(4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAddedObjectsCanBeRetrievedByKey_literalMutation1357() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddedObjectsCanBeRetrievedByKey_literalMutation1357");
        final Collection<java.lang.String> coll = makeTestCollection();
        coll.add("12");
        coll.add("foo");
        coll.add("1");
        coll.addAll(java.util.Arrays.asList("2", "3", "4"));
        @SuppressWarnings(value = "unchecked")
        final IndexedCollection<java.lang.Integer, java.lang.String> indexed = ((IndexedCollection<java.lang.Integer, java.lang.String>)(coll));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4743,indexed,4742,indexed.get(12));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4745,indexed,4744,indexed.get(16));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4747,indexed,4746,indexed.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4749,indexed,4748,indexed.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4751,indexed,4750,indexed.get(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4753,indexed,4752,indexed.get(4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAddedObjectsCanBeRetrievedByKey_literalMutation1358() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddedObjectsCanBeRetrievedByKey_literalMutation1358");
        final Collection<java.lang.String> coll = makeTestCollection();
        coll.add("12");
        coll.add("16");
        coll.add("foo");
        coll.addAll(java.util.Arrays.asList("2", "3", "4"));
        @SuppressWarnings(value = "unchecked")
        final IndexedCollection<java.lang.Integer, java.lang.String> indexed = ((IndexedCollection<java.lang.Integer, java.lang.String>)(coll));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4743,indexed,4742,indexed.get(12));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4745,indexed,4744,indexed.get(16));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4747,indexed,4746,indexed.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4749,indexed,4748,indexed.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4751,indexed,4750,indexed.get(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4753,indexed,4752,indexed.get(4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAddedObjectsCanBeRetrievedByKey_literalMutation1359() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddedObjectsCanBeRetrievedByKey_literalMutation1359");
        final Collection<java.lang.String> coll = makeTestCollection();
        coll.add("12");
        coll.add("16");
        coll.add("1");
        coll.addAll(java.util.Arrays.asList("foo", "3", "4"));
        @SuppressWarnings(value = "unchecked")
        final IndexedCollection<java.lang.Integer, java.lang.String> indexed = ((IndexedCollection<java.lang.Integer, java.lang.String>)(coll));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4743,indexed,4742,indexed.get(12));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4745,indexed,4744,indexed.get(16));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4747,indexed,4746,indexed.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4749,indexed,4748,indexed.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4751,indexed,4750,indexed.get(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4753,indexed,4752,indexed.get(4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAddedObjectsCanBeRetrievedByKey_literalMutation1360() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddedObjectsCanBeRetrievedByKey_literalMutation1360");
        final Collection<java.lang.String> coll = makeTestCollection();
        coll.add("12");
        coll.add("16");
        coll.add("1");
        coll.addAll(java.util.Arrays.asList("2", "foo", "4"));
        @SuppressWarnings(value = "unchecked")
        final IndexedCollection<java.lang.Integer, java.lang.String> indexed = ((IndexedCollection<java.lang.Integer, java.lang.String>)(coll));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4743,indexed,4742,indexed.get(12));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4745,indexed,4744,indexed.get(16));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4747,indexed,4746,indexed.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4749,indexed,4748,indexed.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4751,indexed,4750,indexed.get(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4753,indexed,4752,indexed.get(4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAddedObjectsCanBeRetrievedByKey_literalMutation1361() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddedObjectsCanBeRetrievedByKey_literalMutation1361");
        final Collection<java.lang.String> coll = makeTestCollection();
        coll.add("12");
        coll.add("16");
        coll.add("1");
        coll.addAll(java.util.Arrays.asList("2", "3", "foo"));
        @SuppressWarnings(value = "unchecked")
        final IndexedCollection<java.lang.Integer, java.lang.String> indexed = ((IndexedCollection<java.lang.Integer, java.lang.String>)(coll));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4743,indexed,4742,indexed.get(12));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4745,indexed,4744,indexed.get(16));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4747,indexed,4746,indexed.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4749,indexed,4748,indexed.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4751,indexed,4750,indexed.get(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4753,indexed,4752,indexed.get(4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAddedObjectsCanBeRetrievedByKey_literalMutation1362() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddedObjectsCanBeRetrievedByKey_literalMutation1362");
        final Collection<java.lang.String> coll = makeTestCollection();
        coll.add("12");
        coll.add("16");
        coll.add("1");
        coll.addAll(java.util.Arrays.asList("2", "3", "4"));
        @SuppressWarnings(value = "unchecked")
        final IndexedCollection<java.lang.Integer, java.lang.String> indexed = ((IndexedCollection<java.lang.Integer, java.lang.String>)(coll));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4743,indexed,4742,indexed.get(12));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4745,indexed,4744,indexed.get(16));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4747,indexed,4746,indexed.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4749,indexed,4748,indexed.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4751,indexed,4750,indexed.get(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4753,indexed,4752,indexed.get(4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEnsureDuplicateObjectsCauseException() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEnsureDuplicateObjectsCauseException");
        final Collection<java.lang.String> coll = makeUniqueTestCollection();
        coll.add("foo");
        try {
            coll.add("1");
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEnsureDuplicateObjectsCauseException_literalMutation1364() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEnsureDuplicateObjectsCauseException_literalMutation1364");
        final Collection<java.lang.String> coll = makeUniqueTestCollection();
        coll.add("1");
        try {
            coll.add("foo");
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDecoratedCollectionIsIndexedOnCreation() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecoratedCollectionIsIndexedOnCreation");
        final Collection<java.lang.String> original = makeFullCollection();
        final IndexedCollection<java.lang.Integer, java.lang.String> indexed = decorateUniqueCollection(original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4755,indexed,4754,indexed.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4757,indexed,4756,indexed.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4759,indexed,4758,indexed.get(3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReindexUpdatesIndexWhenDecoratedCollectionIsModifiedSeparately() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReindexUpdatesIndexWhenDecoratedCollectionIsModifiedSeparately");
        final Collection<java.lang.String> original = new ArrayList<java.lang.String>();
        final IndexedCollection<java.lang.Integer, java.lang.String> indexed = decorateUniqueCollection(original);
        original.add("foo");
        original.add("2");
        original.add("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4761,indexed,4760,indexed.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4763,indexed,4762,indexed.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4765,indexed,4764,indexed.get(3));
        indexed.reindex();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4767,indexed,4766,indexed.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4769,indexed,4768,indexed.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4771,indexed,4770,indexed.get(3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReindexUpdatesIndexWhenDecoratedCollectionIsModifiedSeparately_literalMutation1366() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReindexUpdatesIndexWhenDecoratedCollectionIsModifiedSeparately_literalMutation1366");
        final Collection<java.lang.String> original = new ArrayList<java.lang.String>();
        final IndexedCollection<java.lang.Integer, java.lang.String> indexed = decorateUniqueCollection(original);
        original.add("1");
        original.add("foo");
        original.add("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4761,indexed,4760,indexed.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4763,indexed,4762,indexed.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4765,indexed,4764,indexed.get(3));
        indexed.reindex();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4767,indexed,4766,indexed.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4769,indexed,4768,indexed.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4771,indexed,4770,indexed.get(3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReindexUpdatesIndexWhenDecoratedCollectionIsModifiedSeparately_literalMutation1367() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReindexUpdatesIndexWhenDecoratedCollectionIsModifiedSeparately_literalMutation1367");
        final Collection<java.lang.String> original = new ArrayList<java.lang.String>();
        final IndexedCollection<java.lang.Integer, java.lang.String> indexed = decorateUniqueCollection(original);
        original.add("1");
        original.add("2");
        original.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4761,indexed,4760,indexed.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4763,indexed,4762,indexed.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4765,indexed,4764,indexed.get(3));
        indexed.reindex();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4767,indexed,4766,indexed.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4769,indexed,4768,indexed.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4771,indexed,4770,indexed.get(3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


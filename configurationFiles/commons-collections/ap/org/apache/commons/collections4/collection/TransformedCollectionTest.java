package org.apache.commons.collections4.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.collections4.Transformer;

/** 
 * Extension of {@link AbstractCollectionTest} for exercising the {@link TransformedCollection}
 * implementation.
 * 
 * @version $Id$
 * @since 3.0
 */
public class TransformedCollectionTest extends AbstractCollectionTest<java.lang.Object> {
    private static class StringToInteger implements Transformer<java.lang.Object, java.lang.Object> {
        public Object transform(final Object input) {
            return java.lang.Integer.valueOf(((String)(input)));
        }
    }

    public static final Transformer<java.lang.Object, java.lang.Object> NOOP_TRANSFORMER = org.apache.commons.collections4.TransformerUtils.nopTransformer();

    public static final Transformer<java.lang.Object, java.lang.Object> STRING_TO_INTEGER_TRANSFORMER = new StringToInteger();

    public TransformedCollectionTest(final String testName) {
        super(testName);
    }

    @Override
    public Collection<java.lang.Object> makeConfirmedCollection() {
        return new ArrayList<java.lang.Object>();
    }

    @Override
    public Collection<java.lang.Object> makeConfirmedFullCollection() {
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        list.addAll(java.util.Arrays.asList(getFullElements()));
        return list;
    }

    @Override
    public Collection<java.lang.Object> makeObject() {
        return org.apache.commons.collections4.collection.TransformedCollection.transformingCollection(new ArrayList<java.lang.Object>(), NOOP_TRANSFORMER);
    }

    @Override
    public Collection<java.lang.Object> makeFullCollection() {
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        list.addAll(java.util.Arrays.asList(getFullElements()));
        return org.apache.commons.collections4.collection.TransformedCollection.transformingCollection(list, NOOP_TRANSFORMER);
    }

    @Override
    public Object[] getFullElements() {
        return new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
    }

    @Override
    public Object[] getOtherElements() {
        return new Object[]{ "9" , "88" , "678" , "87" , "98" , "78" , "99" };
    }

    public void testTransformedCollection() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedCollection");
        final Collection<java.lang.Object> coll = org.apache.commons.collections4.collection.TransformedCollection.transformingCollection(new ArrayList<java.lang.Object>(), STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4789,coll,4788,coll.size());
        final Object[] elements = getFullElements();
        for (int i = -1 ; i < (elements.length) ; i++) {
            coll.add(elements[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4790,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4792,coll,4791,coll.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4794,coll,4793,coll.contains(java.lang.Integer.valueOf(((java.lang.String)(elements[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4796,coll,4795,coll.contains(elements[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4798,coll,4797,coll.remove(java.lang.Integer.valueOf(((java.lang.String)(elements[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedCollection_decorateTransform() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedCollection_decorateTransform");
        final Collection<java.lang.Object> originalCollection = new ArrayList<java.lang.Object>();
        final Object[] elements = getFullElements();
        java.util.Collections.addAll(originalCollection, elements);
        final Collection<java.lang.Object> collection = org.apache.commons.collections4.collection.TransformedCollection.transformedCollection(originalCollection, STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4777,elements.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4779,collection,4778,collection.size());
        for (final Object element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4781,collection,4780,collection.contains(java.lang.Integer.valueOf(((java.lang.String)(element)))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4783,collection,4782,collection.contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4785,collection,4784,collection.remove(elements[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4787,collection,4786,collection.remove(java.lang.Integer.valueOf(((java.lang.String)(elements[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}


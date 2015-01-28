package org.apache.commons.collections4.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.junit.Test;
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

    @Test(timeout = 1000)
    public void testTransformedCollection_add1550() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedCollection_add1550");
        final Collection<java.lang.Object> coll = org.apache.commons.collections4.collection.TransformedCollection.transformingCollection(new ArrayList<java.lang.Object>(), STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4786,coll,4785,coll.size());
        final Object[] elements = getFullElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            coll.add(elements[i]);
            coll.add(elements[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4787,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4789,coll,4788,coll.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4791,coll,4790,coll.contains(java.lang.Integer.valueOf(((java.lang.String)(elements[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4793,coll,4792,coll.contains(elements[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4795,coll,4794,coll.remove(java.lang.Integer.valueOf(((java.lang.String)(elements[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedCollection() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedCollection");
        final Collection<java.lang.Object> coll = org.apache.commons.collections4.collection.TransformedCollection.transformingCollection(new ArrayList<java.lang.Object>(), STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4786,coll,4785,coll.size());
        final Object[] elements = getFullElements();
        for (int i = -1 ; i < (elements.length) ; i++) {
            coll.add(elements[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4787,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4789,coll,4788,coll.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4791,coll,4790,coll.contains(java.lang.Integer.valueOf(((java.lang.String)(elements[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4793,coll,4792,coll.contains(elements[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4795,coll,4794,coll.remove(java.lang.Integer.valueOf(((java.lang.String)(elements[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTransformedCollection_remove1177() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedCollection_remove1177");
        final Collection<java.lang.Object> coll = org.apache.commons.collections4.collection.TransformedCollection.transformingCollection(new ArrayList<java.lang.Object>(), STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4786,coll,4785,coll.size());
        final Object[] elements = getFullElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4787,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4789,coll,4788,coll.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4791,coll,4790,coll.contains(java.lang.Integer.valueOf(((java.lang.String)(elements[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4793,coll,4792,coll.contains(elements[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4795,coll,4794,coll.remove(java.lang.Integer.valueOf(((java.lang.String)(elements[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTransformedCollection_decorateTransform() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedCollection_decorateTransform");
        final Collection<java.lang.Object> originalCollection = new ArrayList<java.lang.Object>();
        final Object[] elements = getFullElements();
        java.util.Collections.addAll(originalCollection, elements);
        java.util.Collections.addAll(originalCollection, elements);
        final Collection<java.lang.Object> collection = org.apache.commons.collections4.collection.TransformedCollection.transformedCollection(originalCollection, STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4796,elements.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4798,collection,4797,collection.size());
        for (final Object element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4800,collection,4799,collection.contains(java.lang.Integer.valueOf(((java.lang.String)(element)))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4802,collection,4801,collection.contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4804,collection,4803,collection.remove(elements[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4806,collection,4805,collection.remove(java.lang.Integer.valueOf(((java.lang.String)(elements[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTransformedCollection_decorateTransform_remove1178() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedCollection_decorateTransform_remove1178");
        final Collection<java.lang.Object> originalCollection = new ArrayList<java.lang.Object>();
        final Object[] elements = getFullElements();
        final Collection<java.lang.Object> collection = org.apache.commons.collections4.collection.TransformedCollection.transformedCollection(originalCollection, STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4796,elements.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4798,collection,4797,collection.size());
        for (final Object element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4800,collection,4799,collection.contains(java.lang.Integer.valueOf(((java.lang.String)(element)))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4802,collection,4801,collection.contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4804,collection,4803,collection.remove(elements[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4806,collection,4805,collection.remove(java.lang.Integer.valueOf(((java.lang.String)(elements[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}


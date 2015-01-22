package org.apache.commons.collections4.set;

import java.util.HashSet;
import java.util.Set;

/** 
 * Extension of {@link AbstractSetTest} for exercising the {@link TransformedSet}
 * implementation.
 * 
 * @version $Id$
 * @since 3.0
 */
public class TransformedSetTest<E> extends AbstractSetTest<E> {
    public TransformedSetTest(final String testName) {
        super(testName);
    }

    @Override
    public Set<E> makeConfirmedCollection() {
        return new HashSet<E>();
    }

    @Override
    public Set<E> makeConfirmedFullCollection() {
        final Set<E> set = new HashSet<E>();
        set.addAll(java.util.Arrays.asList(getFullElements()));
        return set;
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public Set<E> makeObject() {
        return org.apache.commons.collections4.set.TransformedSet.transformingSet(new HashSet<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.NOOP_TRANSFORMER)));
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public Set<E> makeFullCollection() {
        final Set<E> list = new HashSet<E>();
        list.addAll(java.util.Arrays.asList(getFullElements()));
        return org.apache.commons.collections4.set.TransformedSet.transformingSet(list, ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.NOOP_TRANSFORMER)));
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedSet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedSet");
        final Set<E> set = org.apache.commons.collections4.set.TransformedSet.transformingSet(new HashSet<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6299,set,6298,set.size());
        final E[] els = ((E[])(new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            set.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2337,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6269,set,6268,set.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6301,set,6300,set.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6303,set,6302,set.contains(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6305,set,6304,set.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6307,set,6306,set.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedSet_literalMutation1874() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedSet_literalMutation1874");
        final Set<E> set = org.apache.commons.collections4.set.TransformedSet.transformingSet(new HashSet<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6299,set,6298,set.size());
        final E[] els = ((E[])(new Object[]{ "foo" , "3" , "5" , "7" , "2" , "4" , "6" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            set.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2337,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6269,set,6268,set.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6301,set,6300,set.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6303,set,6302,set.contains(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6305,set,6304,set.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6307,set,6306,set.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedSet_literalMutation1875() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedSet_literalMutation1875");
        final Set<E> set = org.apache.commons.collections4.set.TransformedSet.transformingSet(new HashSet<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6299,set,6298,set.size());
        final E[] els = ((E[])(new Object[]{ "1" , "foo" , "5" , "7" , "2" , "4" , "6" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            set.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2337,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6269,set,6268,set.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6301,set,6300,set.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6303,set,6302,set.contains(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6305,set,6304,set.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6307,set,6306,set.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedSet_literalMutation1876() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedSet_literalMutation1876");
        final Set<E> set = org.apache.commons.collections4.set.TransformedSet.transformingSet(new HashSet<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6299,set,6298,set.size());
        final E[] els = ((E[])(new Object[]{ "1" , "3" , "foo" , "7" , "2" , "4" , "6" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            set.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2337,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6269,set,6268,set.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6301,set,6300,set.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6303,set,6302,set.contains(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6305,set,6304,set.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6307,set,6306,set.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedSet_literalMutation1877() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedSet_literalMutation1877");
        final Set<E> set = org.apache.commons.collections4.set.TransformedSet.transformingSet(new HashSet<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6299,set,6298,set.size());
        final E[] els = ((E[])(new Object[]{ "1" , "3" , "5" , "foo" , "2" , "4" , "6" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            set.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2337,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6269,set,6268,set.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6301,set,6300,set.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6303,set,6302,set.contains(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6305,set,6304,set.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6307,set,6306,set.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedSet_literalMutation1878() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedSet_literalMutation1878");
        final Set<E> set = org.apache.commons.collections4.set.TransformedSet.transformingSet(new HashSet<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6299,set,6298,set.size());
        final E[] els = ((E[])(new Object[]{ "1" , "3" , "5" , "7" , "foo" , "4" , "6" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            set.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2337,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6269,set,6268,set.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6301,set,6300,set.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6303,set,6302,set.contains(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6305,set,6304,set.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6307,set,6306,set.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedSet_literalMutation1879() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedSet_literalMutation1879");
        final Set<E> set = org.apache.commons.collections4.set.TransformedSet.transformingSet(new HashSet<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6299,set,6298,set.size());
        final E[] els = ((E[])(new Object[]{ "1" , "3" , "5" , "7" , "2" , "foo" , "6" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            set.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2337,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6269,set,6268,set.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6301,set,6300,set.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6303,set,6302,set.contains(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6305,set,6304,set.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6307,set,6306,set.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedSet_literalMutation1880() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedSet_literalMutation1880");
        final Set<E> set = org.apache.commons.collections4.set.TransformedSet.transformingSet(new HashSet<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6299,set,6298,set.size());
        final E[] els = ((E[])(new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "foo" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            set.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2337,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6269,set,6268,set.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6301,set,6300,set.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6303,set,6302,set.contains(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6305,set,6304,set.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6307,set,6306,set.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedSet_literalMutation1881() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedSet_literalMutation1881");
        final Set<E> set = org.apache.commons.collections4.set.TransformedSet.transformingSet(new HashSet<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6299,set,6298,set.size());
        final E[] els = ((E[])(new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" }));
        for (int i = 1 ; i < (els.length) ; i++) {
            set.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2337,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6269,set,6268,set.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6301,set,6300,set.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6303,set,6302,set.contains(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6305,set,6304,set.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6307,set,6306,set.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedSet_decorateTransform() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedSet_decorateTransform");
        final Set<java.lang.Object> originalSet = new HashSet<java.lang.Object>();
        final Object[] els = new Object[]{ "foo" , "3" , "5" , "7" , "2" , "4" , "6" };
        java.util.Collections.addAll(originalSet, els);
        final Set<?> set = org.apache.commons.collections4.set.TransformedSet.transformedSet(originalSet, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6287,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6289,set,6288,set.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6291,set,6290,set.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6293,set,6292,set.contains(el));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6295,set,6294,set.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6297,set,6296,set.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedSet_decorateTransform_literalMutation1883() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedSet_decorateTransform_literalMutation1883");
        final Set<java.lang.Object> originalSet = new HashSet<java.lang.Object>();
        final Object[] els = new Object[]{ "1" , "foo" , "5" , "7" , "2" , "4" , "6" };
        java.util.Collections.addAll(originalSet, els);
        final Set<?> set = org.apache.commons.collections4.set.TransformedSet.transformedSet(originalSet, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6287,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6289,set,6288,set.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6291,set,6290,set.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6293,set,6292,set.contains(el));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6295,set,6294,set.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6297,set,6296,set.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedSet_decorateTransform_literalMutation1884() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedSet_decorateTransform_literalMutation1884");
        final Set<java.lang.Object> originalSet = new HashSet<java.lang.Object>();
        final Object[] els = new Object[]{ "1" , "3" , "foo" , "7" , "2" , "4" , "6" };
        java.util.Collections.addAll(originalSet, els);
        final Set<?> set = org.apache.commons.collections4.set.TransformedSet.transformedSet(originalSet, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6287,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6289,set,6288,set.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6291,set,6290,set.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6293,set,6292,set.contains(el));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6295,set,6294,set.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6297,set,6296,set.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedSet_decorateTransform_literalMutation1885() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedSet_decorateTransform_literalMutation1885");
        final Set<java.lang.Object> originalSet = new HashSet<java.lang.Object>();
        final Object[] els = new Object[]{ "1" , "3" , "5" , "foo" , "2" , "4" , "6" };
        java.util.Collections.addAll(originalSet, els);
        final Set<?> set = org.apache.commons.collections4.set.TransformedSet.transformedSet(originalSet, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6287,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6289,set,6288,set.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6291,set,6290,set.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6293,set,6292,set.contains(el));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6295,set,6294,set.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6297,set,6296,set.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedSet_decorateTransform_literalMutation1886() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedSet_decorateTransform_literalMutation1886");
        final Set<java.lang.Object> originalSet = new HashSet<java.lang.Object>();
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "foo" , "4" , "6" };
        java.util.Collections.addAll(originalSet, els);
        final Set<?> set = org.apache.commons.collections4.set.TransformedSet.transformedSet(originalSet, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6287,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6289,set,6288,set.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6291,set,6290,set.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6293,set,6292,set.contains(el));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6295,set,6294,set.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6297,set,6296,set.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedSet_decorateTransform_literalMutation1887() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedSet_decorateTransform_literalMutation1887");
        final Set<java.lang.Object> originalSet = new HashSet<java.lang.Object>();
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "foo" , "6" };
        java.util.Collections.addAll(originalSet, els);
        final Set<?> set = org.apache.commons.collections4.set.TransformedSet.transformedSet(originalSet, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6287,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6289,set,6288,set.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6291,set,6290,set.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6293,set,6292,set.contains(el));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6295,set,6294,set.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6297,set,6296,set.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedSet_decorateTransform_literalMutation1888() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedSet_decorateTransform_literalMutation1888");
        final Set<java.lang.Object> originalSet = new HashSet<java.lang.Object>();
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "foo" };
        java.util.Collections.addAll(originalSet, els);
        final Set<?> set = org.apache.commons.collections4.set.TransformedSet.transformedSet(originalSet, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6287,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6289,set,6288,set.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6291,set,6290,set.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6293,set,6292,set.contains(el));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6295,set,6294,set.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6297,set,6296,set.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}


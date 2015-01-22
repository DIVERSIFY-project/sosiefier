package org.apache.commons.collections4.bag;

import org.apache.commons.collections4.Bag;
import junit.framework.Test;

/** 
 * Extension of {@link AbstractBagTest} for exercising the {@link TransformedBag}
 * implementation.
 * 
 * @version $Id$
 * @since 3.0
 */
public class TransformedBagTest<T> extends AbstractBagTest<T> {
    public TransformedBagTest(final String testName) {
        super(testName);
    }

    public static Test suite() {
        return org.apache.commons.collections4.BulkTest.makeSuite(TransformedBagTest.class);
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public Bag<T> makeObject() {
        return org.apache.commons.collections4.bag.TransformedBag.transformingBag(new HashBag<T>(), ((org.apache.commons.collections4.Transformer<T, T>)(org.apache.commons.collections4.collection.TransformedCollectionTest.NOOP_TRANSFORMER)));
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedBag() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag");
        final Bag<T> bag = org.apache.commons.collections4.bag.TransformedBag.transformingBag(new HashBag<T>(), ((org.apache.commons.collections4.Transformer<T, T>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5877,bag,5876,bag.size());
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        for (int i = 0 ; i < (els.length) ; i++) {
            bag.add(((T)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5878,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5880,bag,5879,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5882,bag,5881,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5884,bag,5883,bag.contains(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5886,bag,5885,bag.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5888,bag,5887,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedBag_literalMutation1615() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_literalMutation1615");
        final Bag<T> bag = org.apache.commons.collections4.bag.TransformedBag.transformingBag(new HashBag<T>(), ((org.apache.commons.collections4.Transformer<T, T>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5877,bag,5876,bag.size());
        final Object[] els = new Object[]{ "foo" , "3" , "5" , "7" , "2" , "4" , "6" };
        for (int i = 0 ; i < (els.length) ; i++) {
            bag.add(((T)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5878,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5880,bag,5879,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5882,bag,5881,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5884,bag,5883,bag.contains(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5886,bag,5885,bag.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5888,bag,5887,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedBag_literalMutation1616() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_literalMutation1616");
        final Bag<T> bag = org.apache.commons.collections4.bag.TransformedBag.transformingBag(new HashBag<T>(), ((org.apache.commons.collections4.Transformer<T, T>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5877,bag,5876,bag.size());
        final Object[] els = new Object[]{ "1" , "foo" , "5" , "7" , "2" , "4" , "6" };
        for (int i = 0 ; i < (els.length) ; i++) {
            bag.add(((T)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5878,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5880,bag,5879,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5882,bag,5881,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5884,bag,5883,bag.contains(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5886,bag,5885,bag.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5888,bag,5887,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedBag_literalMutation1617() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_literalMutation1617");
        final Bag<T> bag = org.apache.commons.collections4.bag.TransformedBag.transformingBag(new HashBag<T>(), ((org.apache.commons.collections4.Transformer<T, T>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5877,bag,5876,bag.size());
        final Object[] els = new Object[]{ "1" , "3" , "foo" , "7" , "2" , "4" , "6" };
        for (int i = 0 ; i < (els.length) ; i++) {
            bag.add(((T)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5878,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5880,bag,5879,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5882,bag,5881,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5884,bag,5883,bag.contains(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5886,bag,5885,bag.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5888,bag,5887,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedBag_literalMutation1618() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_literalMutation1618");
        final Bag<T> bag = org.apache.commons.collections4.bag.TransformedBag.transformingBag(new HashBag<T>(), ((org.apache.commons.collections4.Transformer<T, T>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5877,bag,5876,bag.size());
        final Object[] els = new Object[]{ "1" , "3" , "5" , "foo" , "2" , "4" , "6" };
        for (int i = 0 ; i < (els.length) ; i++) {
            bag.add(((T)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5878,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5880,bag,5879,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5882,bag,5881,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5884,bag,5883,bag.contains(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5886,bag,5885,bag.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5888,bag,5887,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedBag_literalMutation1619() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_literalMutation1619");
        final Bag<T> bag = org.apache.commons.collections4.bag.TransformedBag.transformingBag(new HashBag<T>(), ((org.apache.commons.collections4.Transformer<T, T>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5877,bag,5876,bag.size());
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "foo" , "4" , "6" };
        for (int i = 0 ; i < (els.length) ; i++) {
            bag.add(((T)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5878,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5880,bag,5879,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5882,bag,5881,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5884,bag,5883,bag.contains(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5886,bag,5885,bag.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5888,bag,5887,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedBag_literalMutation1620() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_literalMutation1620");
        final Bag<T> bag = org.apache.commons.collections4.bag.TransformedBag.transformingBag(new HashBag<T>(), ((org.apache.commons.collections4.Transformer<T, T>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5877,bag,5876,bag.size());
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "foo" , "6" };
        for (int i = 0 ; i < (els.length) ; i++) {
            bag.add(((T)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5878,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5880,bag,5879,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5882,bag,5881,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5884,bag,5883,bag.contains(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5886,bag,5885,bag.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5888,bag,5887,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedBag_literalMutation1621() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_literalMutation1621");
        final Bag<T> bag = org.apache.commons.collections4.bag.TransformedBag.transformingBag(new HashBag<T>(), ((org.apache.commons.collections4.Transformer<T, T>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5877,bag,5876,bag.size());
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "foo" };
        for (int i = 0 ; i < (els.length) ; i++) {
            bag.add(((T)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5878,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5880,bag,5879,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5882,bag,5881,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5884,bag,5883,bag.contains(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5886,bag,5885,bag.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5888,bag,5887,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedBag_literalMutation1622() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_literalMutation1622");
        final Bag<T> bag = org.apache.commons.collections4.bag.TransformedBag.transformingBag(new HashBag<T>(), ((org.apache.commons.collections4.Transformer<T, T>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5877,bag,5876,bag.size());
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        for (int i = -1 ; i < (els.length) ; i++) {
            bag.add(((T)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5878,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5880,bag,5879,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5882,bag,5881,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5884,bag,5883,bag.contains(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5886,bag,5885,bag.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5888,bag,5887,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedBag_decorateTransform() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_decorateTransform");
        final Bag<T> originalBag = new HashBag<T>();
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        for (final Object el : els) {
            originalBag.add(((T)(el)));
        }
        final Bag<T> bag = org.apache.commons.collections4.bag.TransformedBag.transformedBag(originalBag, ((org.apache.commons.collections4.Transformer<T, T>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5865,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5867,bag,5866,bag.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5869,bag,5868,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5871,bag,5870,bag.contains(el));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5873,bag,5872,bag.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5875,bag,5874,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedBag_decorateTransform_literalMutation1624() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_decorateTransform_literalMutation1624");
        final Bag<T> originalBag = new HashBag<T>();
        final Object[] els = new Object[]{ "foo" , "3" , "5" , "7" , "2" , "4" , "6" };
        for (final Object el : els) {
            originalBag.add(((T)(el)));
        }
        final Bag<T> bag = org.apache.commons.collections4.bag.TransformedBag.transformedBag(originalBag, ((org.apache.commons.collections4.Transformer<T, T>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5865,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5867,bag,5866,bag.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5869,bag,5868,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5871,bag,5870,bag.contains(el));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5873,bag,5872,bag.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5875,bag,5874,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedBag_decorateTransform_literalMutation1625() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_decorateTransform_literalMutation1625");
        final Bag<T> originalBag = new HashBag<T>();
        final Object[] els = new Object[]{ "1" , "foo" , "5" , "7" , "2" , "4" , "6" };
        for (final Object el : els) {
            originalBag.add(((T)(el)));
        }
        final Bag<T> bag = org.apache.commons.collections4.bag.TransformedBag.transformedBag(originalBag, ((org.apache.commons.collections4.Transformer<T, T>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5865,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5867,bag,5866,bag.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5869,bag,5868,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5871,bag,5870,bag.contains(el));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5873,bag,5872,bag.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5875,bag,5874,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedBag_decorateTransform_literalMutation1626() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_decorateTransform_literalMutation1626");
        final Bag<T> originalBag = new HashBag<T>();
        final Object[] els = new Object[]{ "1" , "3" , "foo" , "7" , "2" , "4" , "6" };
        for (final Object el : els) {
            originalBag.add(((T)(el)));
        }
        final Bag<T> bag = org.apache.commons.collections4.bag.TransformedBag.transformedBag(originalBag, ((org.apache.commons.collections4.Transformer<T, T>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5865,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5867,bag,5866,bag.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5869,bag,5868,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5871,bag,5870,bag.contains(el));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5873,bag,5872,bag.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5875,bag,5874,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedBag_decorateTransform_literalMutation1627() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_decorateTransform_literalMutation1627");
        final Bag<T> originalBag = new HashBag<T>();
        final Object[] els = new Object[]{ "1" , "3" , "5" , "foo" , "2" , "4" , "6" };
        for (final Object el : els) {
            originalBag.add(((T)(el)));
        }
        final Bag<T> bag = org.apache.commons.collections4.bag.TransformedBag.transformedBag(originalBag, ((org.apache.commons.collections4.Transformer<T, T>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5865,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5867,bag,5866,bag.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5869,bag,5868,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5871,bag,5870,bag.contains(el));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5873,bag,5872,bag.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5875,bag,5874,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedBag_decorateTransform_literalMutation1628() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_decorateTransform_literalMutation1628");
        final Bag<T> originalBag = new HashBag<T>();
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "foo" , "4" , "6" };
        for (final Object el : els) {
            originalBag.add(((T)(el)));
        }
        final Bag<T> bag = org.apache.commons.collections4.bag.TransformedBag.transformedBag(originalBag, ((org.apache.commons.collections4.Transformer<T, T>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5865,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5867,bag,5866,bag.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5869,bag,5868,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5871,bag,5870,bag.contains(el));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5873,bag,5872,bag.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5875,bag,5874,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedBag_decorateTransform_literalMutation1629() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_decorateTransform_literalMutation1629");
        final Bag<T> originalBag = new HashBag<T>();
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "foo" , "6" };
        for (final Object el : els) {
            originalBag.add(((T)(el)));
        }
        final Bag<T> bag = org.apache.commons.collections4.bag.TransformedBag.transformedBag(originalBag, ((org.apache.commons.collections4.Transformer<T, T>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5865,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5867,bag,5866,bag.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5869,bag,5868,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5871,bag,5870,bag.contains(el));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5873,bag,5872,bag.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5875,bag,5874,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedBag_decorateTransform_literalMutation1630() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_decorateTransform_literalMutation1630");
        final Bag<T> originalBag = new HashBag<T>();
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "foo" };
        for (final Object el : els) {
            originalBag.add(((T)(el)));
        }
        final Bag<T> bag = org.apache.commons.collections4.bag.TransformedBag.transformedBag(originalBag, ((org.apache.commons.collections4.Transformer<T, T>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5865,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5867,bag,5866,bag.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5869,bag,5868,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5871,bag,5870,bag.contains(el));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5873,bag,5872,bag.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5875,bag,5874,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}


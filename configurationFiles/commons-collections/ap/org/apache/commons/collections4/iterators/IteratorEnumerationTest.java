package org.apache.commons.collections4.iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;
import junit.framework.TestCase;

/** 
 * Tests the IteratorEnumeration.
 * 
 * @version $Id$
 */
public class IteratorEnumerationTest extends TestCase {
    public void testEnumeration() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEnumeration");
        Iterator<java.lang.String> iterator = java.util.Arrays.asList("foo", "b", "c").iterator();
        IteratorEnumeration<java.lang.String> enumeration = new IteratorEnumeration<java.lang.String>(iterator);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3400,iterator);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3402,enumeration,3401,enumeration.getIterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3404,enumeration,3403,enumeration.hasMoreElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3406,enumeration,3405,enumeration.nextElement());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3408,enumeration,3407,enumeration.nextElement());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3410,enumeration,3409,enumeration.nextElement());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3412,enumeration,3411,enumeration.hasMoreElements());
        try {
            enumeration.nextElement();
        } catch (NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEnumeration_literalMutation1017() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEnumeration_literalMutation1017");
        Iterator<java.lang.String> iterator = java.util.Arrays.asList("a", "foo", "c").iterator();
        IteratorEnumeration<java.lang.String> enumeration = new IteratorEnumeration<java.lang.String>(iterator);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3400,iterator);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3402,enumeration,3401,enumeration.getIterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3404,enumeration,3403,enumeration.hasMoreElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3406,enumeration,3405,enumeration.nextElement());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3408,enumeration,3407,enumeration.nextElement());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3410,enumeration,3409,enumeration.nextElement());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3412,enumeration,3411,enumeration.hasMoreElements());
        try {
            enumeration.nextElement();
        } catch (NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEnumeration_literalMutation1018() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEnumeration_literalMutation1018");
        Iterator<java.lang.String> iterator = java.util.Arrays.asList("a", "b", "foo").iterator();
        IteratorEnumeration<java.lang.String> enumeration = new IteratorEnumeration<java.lang.String>(iterator);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3400,iterator);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3402,enumeration,3401,enumeration.getIterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3404,enumeration,3403,enumeration.hasMoreElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3406,enumeration,3405,enumeration.nextElement());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3408,enumeration,3407,enumeration.nextElement());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3410,enumeration,3409,enumeration.nextElement());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3412,enumeration,3411,enumeration.hasMoreElements());
        try {
            enumeration.nextElement();
        } catch (NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


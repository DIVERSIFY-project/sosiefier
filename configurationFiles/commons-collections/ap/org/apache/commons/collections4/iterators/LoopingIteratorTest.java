package org.apache.commons.collections4.iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import junit.framework.TestCase;

/** 
 * Tests the LoopingIterator class.
 * 
 * @version $Id$
 */
public class LoopingIteratorTest extends TestCase {
    /** 
     * Tests constructor exception.
     */
public void testConstructorEx() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructorEx");
        try {
            new LoopingIterator<java.lang.Object>(null);
        } catch (final NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests whether an empty looping iterator works as designed.
     * 
     * @throws Exception If something unexpected occurs.
     */
public void testLooping0() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLooping0");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        final LoopingIterator<java.lang.Object> loop = new LoopingIterator<java.lang.Object>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3670,!(loop.hasNext()));
        try {
            loop.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests whether a populated looping iterator works as designed.
     * 
     * @throws Exception If something unexpected occurs.
     */
public void testLooping1() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLooping1");
        final List<java.lang.String> list = java.util.Arrays.asList("foo");
        final LoopingIterator<java.lang.String> loop = new LoopingIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3672,loop,3671,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3674,loop,3673,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3676,loop,3675,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3678,loop,3677,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3680,loop,3679,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3682,loop,3681,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests whether a populated looping iterator works as designed.
     * 
     * @throws Exception If something unexpected occurs.
     */
public void testLooping2() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLooping2");
        final List<java.lang.String> list = java.util.Arrays.asList("foo", "b");
        final LoopingIterator<java.lang.String> loop = new LoopingIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3684,loop,3683,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3686,loop,3685,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3688,loop,3687,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3690,loop,3689,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3692,loop,3691,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3694,loop,3693,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests whether a populated looping iterator works as designed.
     * 
     * @throws Exception If something unexpected occurs.
     */
public void testLooping2_literalMutation1041() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLooping2_literalMutation1041");
        final List<java.lang.String> list = java.util.Arrays.asList("a", "foo");
        final LoopingIterator<java.lang.String> loop = new LoopingIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3684,loop,3683,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3686,loop,3685,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3688,loop,3687,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3690,loop,3689,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3692,loop,3691,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3694,loop,3693,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests whether a populated looping iterator works as designed.
     * 
     * @throws Exception If something unexpected occurs.
     */
public void testLooping3() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLooping3");
        final List<java.lang.String> list = java.util.Arrays.asList("foo", "b", "c");
        final LoopingIterator<java.lang.String> loop = new LoopingIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3696,loop,3695,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3698,loop,3697,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3700,loop,3699,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3702,loop,3701,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3704,loop,3703,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3706,loop,3705,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3708,loop,3707,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3710,loop,3709,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests whether a populated looping iterator works as designed.
     * 
     * @throws Exception If something unexpected occurs.
     */
public void testLooping3_literalMutation1043() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLooping3_literalMutation1043");
        final List<java.lang.String> list = java.util.Arrays.asList("a", "foo", "c");
        final LoopingIterator<java.lang.String> loop = new LoopingIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3696,loop,3695,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3698,loop,3697,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3700,loop,3699,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3702,loop,3701,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3704,loop,3703,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3706,loop,3705,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3708,loop,3707,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3710,loop,3709,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests whether a populated looping iterator works as designed.
     * 
     * @throws Exception If something unexpected occurs.
     */
public void testLooping3_literalMutation1044() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLooping3_literalMutation1044");
        final List<java.lang.String> list = java.util.Arrays.asList("a", "b", "foo");
        final LoopingIterator<java.lang.String> loop = new LoopingIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3696,loop,3695,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3698,loop,3697,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3700,loop,3699,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3702,loop,3701,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3704,loop,3703,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3706,loop,3705,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3708,loop,3707,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3710,loop,3709,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the remove() method on a LoopingIterator wrapped ArrayList.
     * 
     * @throws Exception If something unexpected occurs.
     */
public void testRemoving1() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoving1");
        final List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("foo", "b", "c"));
        final LoopingIterator<java.lang.String> loop = new LoopingIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3712,list,3711,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3714,loop,3713,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3716,loop,3715,loop.next());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3718,list,3717,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3720,loop,3719,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3722,loop,3721,loop.next());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3724,list,3723,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3726,loop,3725,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3728,loop,3727,loop.next());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3730,list,3729,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3732,loop,3731,loop.hasNext());
        try {
            loop.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the remove() method on a LoopingIterator wrapped ArrayList.
     * 
     * @throws Exception If something unexpected occurs.
     */
public void testRemoving1_literalMutation1046() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoving1_literalMutation1046");
        final List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("a", "foo", "c"));
        final LoopingIterator<java.lang.String> loop = new LoopingIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3712,list,3711,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3714,loop,3713,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3716,loop,3715,loop.next());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3718,list,3717,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3720,loop,3719,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3722,loop,3721,loop.next());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3724,list,3723,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3726,loop,3725,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3728,loop,3727,loop.next());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3730,list,3729,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3732,loop,3731,loop.hasNext());
        try {
            loop.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the remove() method on a LoopingIterator wrapped ArrayList.
     * 
     * @throws Exception If something unexpected occurs.
     */
public void testRemoving1_literalMutation1047() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoving1_literalMutation1047");
        final List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("a", "b", "foo"));
        final LoopingIterator<java.lang.String> loop = new LoopingIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3712,list,3711,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3714,loop,3713,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3716,loop,3715,loop.next());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3718,list,3717,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3720,loop,3719,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3722,loop,3721,loop.next());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3724,list,3723,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3726,loop,3725,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3728,loop,3727,loop.next());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3730,list,3729,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3732,loop,3731,loop.hasNext());
        try {
            loop.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the reset() method on a LoopingIterator wrapped ArrayList.
     * 
     * @throws Exception If something unexpected occurs.
     */
public void testReset() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset");
        final List<java.lang.String> list = java.util.Arrays.asList("a", "b", "c");
        final LoopingIterator<java.lang.String> loop = new LoopingIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3734,loop,3733,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3736,loop,3735,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3738,loop,3737,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3740,loop,3739,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3742,loop,3741,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3744,loop,3743,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3746,loop,3745,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3748,loop,3747,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3750,loop,3749,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the reset() method on a LoopingIterator wrapped ArrayList.
     * 
     * @throws Exception If something unexpected occurs.
     */
public void testReset_literalMutation1048() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset_literalMutation1048");
        final List<java.lang.String> list = java.util.Arrays.asList("foo", "b", "c");
        final LoopingIterator<java.lang.String> loop = new LoopingIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3734,loop,3733,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3736,loop,3735,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3738,loop,3737,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3740,loop,3739,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3742,loop,3741,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3744,loop,3743,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3746,loop,3745,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3748,loop,3747,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3750,loop,3749,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the reset() method on a LoopingIterator wrapped ArrayList.
     * 
     * @throws Exception If something unexpected occurs.
     */
public void testReset_literalMutation1049() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset_literalMutation1049");
        final List<java.lang.String> list = java.util.Arrays.asList("a", "foo", "c");
        final LoopingIterator<java.lang.String> loop = new LoopingIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3734,loop,3733,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3736,loop,3735,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3738,loop,3737,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3740,loop,3739,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3742,loop,3741,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3744,loop,3743,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3746,loop,3745,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3748,loop,3747,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3750,loop,3749,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the reset() method on a LoopingIterator wrapped ArrayList.
     * 
     * @throws Exception If something unexpected occurs.
     */
public void testReset_literalMutation1050() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset_literalMutation1050");
        final List<java.lang.String> list = java.util.Arrays.asList("a", "b", "foo");
        final LoopingIterator<java.lang.String> loop = new LoopingIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3734,loop,3733,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3736,loop,3735,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3738,loop,3737,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3740,loop,3739,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3742,loop,3741,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3744,loop,3743,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3746,loop,3745,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3748,loop,3747,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3750,loop,3749,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the size() method on a LoopingIterator wrapped ArrayList.
     * 
     * @throws Exception If something unexpected occurs.
     */
public void testSize() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize");
        final List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("a", "b", "c"));
        final LoopingIterator<java.lang.String> loop = new LoopingIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3752,loop,3751,loop.size());
        loop.next();
        loop.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3754,loop,3753,loop.size());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3756,loop,3755,loop.size());
        loop.next();
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3758,loop,3757,loop.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the size() method on a LoopingIterator wrapped ArrayList.
     * 
     * @throws Exception If something unexpected occurs.
     */
public void testSize_literalMutation1051() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_literalMutation1051");
        final List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("foo", "b", "c"));
        final LoopingIterator<java.lang.String> loop = new LoopingIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3752,loop,3751,loop.size());
        loop.next();
        loop.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3754,loop,3753,loop.size());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3756,loop,3755,loop.size());
        loop.next();
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3758,loop,3757,loop.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the size() method on a LoopingIterator wrapped ArrayList.
     * 
     * @throws Exception If something unexpected occurs.
     */
public void testSize_literalMutation1052() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_literalMutation1052");
        final List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("a", "foo", "c"));
        final LoopingIterator<java.lang.String> loop = new LoopingIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3752,loop,3751,loop.size());
        loop.next();
        loop.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3754,loop,3753,loop.size());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3756,loop,3755,loop.size());
        loop.next();
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3758,loop,3757,loop.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the size() method on a LoopingIterator wrapped ArrayList.
     * 
     * @throws Exception If something unexpected occurs.
     */
public void testSize_literalMutation1053() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_literalMutation1053");
        final List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("a", "b", "foo"));
        final LoopingIterator<java.lang.String> loop = new LoopingIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3752,loop,3751,loop.size());
        loop.next();
        loop.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3754,loop,3753,loop.size());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3756,loop,3755,loop.size());
        loop.next();
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3758,loop,3757,loop.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


package org.apache.commons.collections4.iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * Tests the LoopingListIterator class.
 * 
 * @version $Id$
 */
public class LoopingListIteratorTest extends TestCase {
    /** 
     * Tests constructor exception.
     */
public void testConstructorEx() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructorEx");
        try {
            new LoopingListIterator<java.lang.Object>(null);
        } catch (final NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests whether an empty looping list iterator works.
     */
public void testLooping0() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLooping0");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        final LoopingListIterator<java.lang.Object> loop = new LoopingListIterator<java.lang.Object>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3834,loop,3833,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3836,loop,3835,loop.hasPrevious());
        try {
            loop.next();
        } catch (final NoSuchElementException ex) {
        }
        try {
            loop.previous();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests whether an empty looping list iterator works.
     */
@Test(timeout = 1000)
    public void testLooping0_add1092() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLooping0_add1092");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        final LoopingListIterator<java.lang.Object> loop = new LoopingListIterator<java.lang.Object>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3834,loop,3833,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3836,loop,3835,loop.hasPrevious());
        try {
            loop.next();
            loop.next();
        } catch (final NoSuchElementException ex) {
        }
        try {
            loop.previous();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests whether an empty looping list iterator works.
     */
@Test(timeout = 1000)
    public void testLooping0_add1093() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLooping0_add1093");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        final LoopingListIterator<java.lang.Object> loop = new LoopingListIterator<java.lang.Object>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3834,loop,3833,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3836,loop,3835,loop.hasPrevious());
        try {
            loop.next();
        } catch (final NoSuchElementException ex) {
        }
        try {
            loop.previous();
            loop.previous();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests whether a looping list iterator works on a list with only
     * one element.
     */
public void testLooping1() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLooping1");
        final List<java.lang.String> list = java.util.Arrays.asList("a");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3838,loop,3837,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3840,loop,3839,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3842,loop,3841,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3844,loop,3843,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3846,loop,3845,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3848,loop,3847,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3850,loop,3849,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3852,loop,3851,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3854,loop,3853,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3856,loop,3855,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3858,loop,3857,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3860,loop,3859,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests whether a looping list iterator works on a list with only
     * one element.
     */
public void testLooping1_literalMutation1071() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLooping1_literalMutation1071");
        final List<java.lang.String> list = java.util.Arrays.asList("foo");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3838,loop,3837,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3840,loop,3839,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3842,loop,3841,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3844,loop,3843,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3846,loop,3845,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3848,loop,3847,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3850,loop,3849,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3852,loop,3851,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3854,loop,3853,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3856,loop,3855,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3858,loop,3857,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3860,loop,3859,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests whether a looping list iterator works on a list with two
     * elements.
     */
public void testLooping2() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLooping2");
        final List<java.lang.String> list = java.util.Arrays.asList("a", "b");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3862,loop,3861,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3864,loop,3863,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3866,loop,3865,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3868,loop,3867,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3870,loop,3869,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3872,loop,3871,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3874,loop,3873,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3876,loop,3875,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3878,loop,3877,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3880,loop,3879,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3882,loop,3881,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3884,loop,3883,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests whether a looping list iterator works on a list with two
     * elements.
     */
@Test(timeout = 1000)
    public void testLooping2_add1094() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLooping2_add1094");
        final List<java.lang.String> list = java.util.Arrays.asList("a", "b");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3862,loop,3861,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3864,loop,3863,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3866,loop,3865,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3868,loop,3867,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3870,loop,3869,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3872,loop,3871,loop.next());
        loop.reset();
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3874,loop,3873,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3876,loop,3875,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3878,loop,3877,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3880,loop,3879,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3882,loop,3881,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3884,loop,3883,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests whether a looping list iterator works on a list with two
     * elements.
     */
public void testLooping2_literalMutation1072() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLooping2_literalMutation1072");
        final List<java.lang.String> list = java.util.Arrays.asList("foo", "b");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3862,loop,3861,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3864,loop,3863,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3866,loop,3865,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3868,loop,3867,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3870,loop,3869,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3872,loop,3871,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3874,loop,3873,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3876,loop,3875,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3878,loop,3877,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3880,loop,3879,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3882,loop,3881,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3884,loop,3883,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests whether a looping list iterator works on a list with two
     * elements.
     */
public void testLooping2_literalMutation1073() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLooping2_literalMutation1073");
        final List<java.lang.String> list = java.util.Arrays.asList("a", "foo");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3862,loop,3861,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3864,loop,3863,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3866,loop,3865,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3868,loop,3867,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3870,loop,3869,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3872,loop,3871,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3874,loop,3873,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3876,loop,3875,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3878,loop,3877,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3880,loop,3879,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3882,loop,3881,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3884,loop,3883,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests whether a looping list iterator works on a list with two
     * elements.
     */
@Test(timeout = 1000)
    public void testLooping2_remove816() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLooping2_remove816");
        final List<java.lang.String> list = java.util.Arrays.asList("a", "b");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3862,loop,3861,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3864,loop,3863,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3866,loop,3865,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3868,loop,3867,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3870,loop,3869,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3872,loop,3871,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3874,loop,3873,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3876,loop,3875,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3878,loop,3877,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3880,loop,3879,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3882,loop,3881,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3884,loop,3883,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests jogging back and forth between two elements, but not over
     * the begin/end boundary of the list.
     */
@Test(timeout = 1000)
    public void testJoggingNotOverBoundary_add1091() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJoggingNotOverBoundary_add1091");
        final List<java.lang.String> list = java.util.Arrays.asList("a", "b");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        loop.reset();
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3812,loop,3811,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3814,loop,3813,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3816,loop,3815,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3818,loop,3817,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3820,loop,3819,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3722,loop,3721,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests jogging back and forth between two elements, but not over
     * the begin/end boundary of the list.
     */
public void testJoggingNotOverBoundary() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJoggingNotOverBoundary");
        final List<java.lang.String> list = java.util.Arrays.asList("foo", "b");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3812,loop,3811,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3814,loop,3813,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3816,loop,3815,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3818,loop,3817,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3820,loop,3819,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3722,loop,3721,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests jogging back and forth between two elements, but not over
     * the begin/end boundary of the list.
     */
public void testJoggingNotOverBoundary_literalMutation1068() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJoggingNotOverBoundary_literalMutation1068");
        final List<java.lang.String> list = java.util.Arrays.asList("a", "foo");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3812,loop,3811,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3814,loop,3813,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3816,loop,3815,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3818,loop,3817,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3820,loop,3819,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3722,loop,3721,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests jogging back and forth between two elements, but not over
     * the begin/end boundary of the list.
     */
@Test(timeout = 1000)
    public void testJoggingNotOverBoundary_remove815() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJoggingNotOverBoundary_remove815");
        final List<java.lang.String> list = java.util.Arrays.asList("a", "b");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3812,loop,3811,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3814,loop,3813,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3816,loop,3815,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3818,loop,3817,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3820,loop,3819,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3722,loop,3721,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests jogging back and forth between two elements over the
     * begin/end boundary of the list.
     */
public void testJoggingOverBoundary() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJoggingOverBoundary");
        final List<java.lang.String> list = java.util.Arrays.asList("foo", "b");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3822,loop,3821,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3824,loop,3823,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3826,loop,3825,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3828,loop,3827,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3830,loop,3829,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3832,loop,3831,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests jogging back and forth between two elements over the
     * begin/end boundary of the list.
     */
public void testJoggingOverBoundary_literalMutation1070() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJoggingOverBoundary_literalMutation1070");
        final List<java.lang.String> list = java.util.Arrays.asList("a", "foo");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3822,loop,3821,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3824,loop,3823,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3826,loop,3825,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3828,loop,3827,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3830,loop,3829,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3832,loop,3831,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removing an element from a wrapped ArrayList.
     */
@Test(timeout = 1000)
    public void testRemovingElementsAndIteratingForward_add1099() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemovingElementsAndIteratingForward_add1099");
        final List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("a", "b", "c"));
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3940,loop,3939,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3942,loop,3941,loop.next());
        loop.remove();
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3944,list,3943,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3946,loop,3945,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3746,loop,3745,loop.next());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3948,list,3947,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3950,loop,3949,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3952,loop,3951,loop.next());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3954,list,3953,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3956,loop,3955,loop.hasNext());
        try {
            loop.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removing an element from a wrapped ArrayList.
     */
@Test(timeout = 1000)
    public void testRemovingElementsAndIteratingForward_add1100() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemovingElementsAndIteratingForward_add1100");
        final List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("a", "b", "c"));
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3940,loop,3939,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3942,loop,3941,loop.next());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3944,list,3943,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3946,loop,3945,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3746,loop,3745,loop.next());
        loop.remove();
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3948,list,3947,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3950,loop,3949,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3952,loop,3951,loop.next());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3954,list,3953,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3956,loop,3955,loop.hasNext());
        try {
            loop.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removing an element from a wrapped ArrayList.
     */
@Test(timeout = 1000)
    public void testRemovingElementsAndIteratingForward_add1101() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemovingElementsAndIteratingForward_add1101");
        final List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("a", "b", "c"));
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3940,loop,3939,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3942,loop,3941,loop.next());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3944,list,3943,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3946,loop,3945,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3746,loop,3745,loop.next());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3948,list,3947,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3950,loop,3949,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3952,loop,3951,loop.next());
        loop.remove();
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3954,list,3953,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3956,loop,3955,loop.hasNext());
        try {
            loop.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removing an element from a wrapped ArrayList.
     */
@Test(timeout = 1000)
    public void testRemovingElementsAndIteratingForward_add1102() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemovingElementsAndIteratingForward_add1102");
        final List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("a", "b", "c"));
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3940,loop,3939,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3942,loop,3941,loop.next());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3944,list,3943,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3946,loop,3945,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3746,loop,3745,loop.next());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3948,list,3947,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3950,loop,3949,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3952,loop,3951,loop.next());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3954,list,3953,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3956,loop,3955,loop.hasNext());
        try {
            loop.next();
            loop.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removing an element from a wrapped ArrayList.
     */
public void testRemovingElementsAndIteratingForward() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemovingElementsAndIteratingForward");
        final List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("foo", "b", "c"));
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3940,loop,3939,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3942,loop,3941,loop.next());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3944,list,3943,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3946,loop,3945,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3746,loop,3745,loop.next());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3948,list,3947,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3950,loop,3949,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3952,loop,3951,loop.next());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3954,list,3953,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3956,loop,3955,loop.hasNext());
        try {
            loop.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removing an element from a wrapped ArrayList.
     */
public void testRemovingElementsAndIteratingForward_literalMutation1081() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemovingElementsAndIteratingForward_literalMutation1081");
        final List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("a", "foo", "c"));
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3940,loop,3939,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3942,loop,3941,loop.next());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3944,list,3943,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3946,loop,3945,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3746,loop,3745,loop.next());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3948,list,3947,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3950,loop,3949,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3952,loop,3951,loop.next());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3954,list,3953,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3956,loop,3955,loop.hasNext());
        try {
            loop.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removing an element from a wrapped ArrayList.
     */
public void testRemovingElementsAndIteratingForward_literalMutation1082() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemovingElementsAndIteratingForward_literalMutation1082");
        final List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("a", "b", "foo"));
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3940,loop,3939,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3942,loop,3941,loop.next());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3944,list,3943,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3946,loop,3945,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3746,loop,3745,loop.next());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3948,list,3947,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3950,loop,3949,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3952,loop,3951,loop.next());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3954,list,3953,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3956,loop,3955,loop.hasNext());
        try {
            loop.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removing an element from a wrapped ArrayList.
     */
@Test(timeout = 1000)
    public void testRemovingElementsAndIteratingForward_remove820() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemovingElementsAndIteratingForward_remove820");
        final List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("a", "b", "c"));
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3940,loop,3939,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3942,loop,3941,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3944,list,3943,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3946,loop,3945,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3746,loop,3745,loop.next());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3948,list,3947,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3950,loop,3949,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3952,loop,3951,loop.next());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3954,list,3953,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3956,loop,3955,loop.hasNext());
        try {
            loop.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removing an element from a wrapped ArrayList.
     */
@Test(timeout = 1000)
    public void testRemovingElementsAndIteratingForward_remove821() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemovingElementsAndIteratingForward_remove821");
        final List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("a", "b", "c"));
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3940,loop,3939,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3942,loop,3941,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3944,list,3943,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3946,loop,3945,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3746,loop,3745,loop.next());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3948,list,3947,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3950,loop,3949,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3952,loop,3951,loop.next());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3954,list,3953,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3956,loop,3955,loop.hasNext());
        try {
            loop.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removing an element from a wrapped ArrayList.
     */
@Test(timeout = 1000)
    public void testRemovingElementsAndIteratingForward_remove822() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemovingElementsAndIteratingForward_remove822");
        final List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("a", "b", "c"));
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3940,loop,3939,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3942,loop,3941,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3944,list,3943,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3946,loop,3945,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3746,loop,3745,loop.next());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3948,list,3947,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3950,loop,3949,loop.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3952,loop,3951,loop.next());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3954,list,3953,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3956,loop,3955,loop.hasNext());
        try {
            loop.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removing an element from a wrapped ArrayList.
     */
@Test(timeout = 1000)
    public void testRemovingElementsAndIteratingBackwards_add1095() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemovingElementsAndIteratingBackwards_add1095");
        final List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("a", "b", "c"));
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3920,loop,3919,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3922,loop,3921,loop.previous());
        loop.remove();
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3924,list,3923,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3926,loop,3925,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3928,loop,3927,loop.previous());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3930,list,3929,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3932,loop,3931,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3934,loop,3933,loop.previous());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3936,list,3935,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3938,loop,3937,loop.hasPrevious());
        try {
            loop.previous();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removing an element from a wrapped ArrayList.
     */
@Test(timeout = 1000)
    public void testRemovingElementsAndIteratingBackwards_add1096() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemovingElementsAndIteratingBackwards_add1096");
        final List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("a", "b", "c"));
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3920,loop,3919,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3922,loop,3921,loop.previous());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3924,list,3923,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3926,loop,3925,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3928,loop,3927,loop.previous());
        loop.remove();
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3930,list,3929,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3932,loop,3931,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3934,loop,3933,loop.previous());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3936,list,3935,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3938,loop,3937,loop.hasPrevious());
        try {
            loop.previous();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removing an element from a wrapped ArrayList.
     */
@Test(timeout = 1000)
    public void testRemovingElementsAndIteratingBackwards_add1097() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemovingElementsAndIteratingBackwards_add1097");
        final List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("a", "b", "c"));
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3920,loop,3919,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3922,loop,3921,loop.previous());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3924,list,3923,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3926,loop,3925,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3928,loop,3927,loop.previous());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3930,list,3929,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3932,loop,3931,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3934,loop,3933,loop.previous());
        loop.remove();
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3936,list,3935,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3938,loop,3937,loop.hasPrevious());
        try {
            loop.previous();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removing an element from a wrapped ArrayList.
     */
@Test(timeout = 1000)
    public void testRemovingElementsAndIteratingBackwards_add1098() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemovingElementsAndIteratingBackwards_add1098");
        final List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("a", "b", "c"));
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3920,loop,3919,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3922,loop,3921,loop.previous());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3924,list,3923,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3926,loop,3925,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3928,loop,3927,loop.previous());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3930,list,3929,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3932,loop,3931,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3934,loop,3933,loop.previous());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3936,list,3935,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3938,loop,3937,loop.hasPrevious());
        try {
            loop.previous();
            loop.previous();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removing an element from a wrapped ArrayList.
     */
public void testRemovingElementsAndIteratingBackwards() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemovingElementsAndIteratingBackwards");
        final List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("foo", "b", "c"));
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3920,loop,3919,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3922,loop,3921,loop.previous());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3924,list,3923,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3926,loop,3925,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3928,loop,3927,loop.previous());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3930,list,3929,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3932,loop,3931,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3934,loop,3933,loop.previous());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3936,list,3935,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3938,loop,3937,loop.hasPrevious());
        try {
            loop.previous();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removing an element from a wrapped ArrayList.
     */
public void testRemovingElementsAndIteratingBackwards_literalMutation1078() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemovingElementsAndIteratingBackwards_literalMutation1078");
        final List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("a", "foo", "c"));
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3920,loop,3919,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3922,loop,3921,loop.previous());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3924,list,3923,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3926,loop,3925,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3928,loop,3927,loop.previous());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3930,list,3929,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3932,loop,3931,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3934,loop,3933,loop.previous());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3936,list,3935,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3938,loop,3937,loop.hasPrevious());
        try {
            loop.previous();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removing an element from a wrapped ArrayList.
     */
public void testRemovingElementsAndIteratingBackwards_literalMutation1079() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemovingElementsAndIteratingBackwards_literalMutation1079");
        final List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("a", "b", "foo"));
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3920,loop,3919,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3922,loop,3921,loop.previous());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3924,list,3923,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3926,loop,3925,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3928,loop,3927,loop.previous());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3930,list,3929,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3932,loop,3931,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3934,loop,3933,loop.previous());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3936,list,3935,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3938,loop,3937,loop.hasPrevious());
        try {
            loop.previous();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removing an element from a wrapped ArrayList.
     */
@Test(timeout = 1000)
    public void testRemovingElementsAndIteratingBackwards_remove817() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemovingElementsAndIteratingBackwards_remove817");
        final List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("a", "b", "c"));
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3920,loop,3919,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3922,loop,3921,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3924,list,3923,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3926,loop,3925,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3928,loop,3927,loop.previous());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3930,list,3929,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3932,loop,3931,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3934,loop,3933,loop.previous());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3936,list,3935,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3938,loop,3937,loop.hasPrevious());
        try {
            loop.previous();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removing an element from a wrapped ArrayList.
     */
@Test(timeout = 1000)
    public void testRemovingElementsAndIteratingBackwards_remove818() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemovingElementsAndIteratingBackwards_remove818");
        final List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("a", "b", "c"));
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3920,loop,3919,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3922,loop,3921,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3924,list,3923,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3926,loop,3925,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3928,loop,3927,loop.previous());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3930,list,3929,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3932,loop,3931,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3934,loop,3933,loop.previous());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3936,list,3935,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3938,loop,3937,loop.hasPrevious());
        try {
            loop.previous();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removing an element from a wrapped ArrayList.
     */
@Test(timeout = 1000)
    public void testRemovingElementsAndIteratingBackwards_remove819() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemovingElementsAndIteratingBackwards_remove819");
        final List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("a", "b", "c"));
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3920,loop,3919,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3922,loop,3921,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3924,list,3923,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3926,loop,3925,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3928,loop,3927,loop.previous());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3930,list,3929,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3932,loop,3931,loop.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3934,loop,3933,loop.previous());
        loop.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3936,list,3935,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3938,loop,3937,loop.hasPrevious());
        try {
            loop.previous();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the reset method.
     */
public void testReset() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset");
        final List<java.lang.String> list = java.util.Arrays.asList("a", "b", "c");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3958,loop,3957,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3960,loop,3959,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3962,loop,3961,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3964,loop,3963,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3966,loop,3965,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3968,loop,3967,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3970,loop,3969,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3972,loop,3971,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3974,loop,3973,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3976,loop,3975,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3978,loop,3977,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3980,loop,3979,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the reset method.
     */
@Test(timeout = 1000)
    public void testReset_add1103() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset_add1103");
        final List<java.lang.String> list = java.util.Arrays.asList("a", "b", "c");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3958,loop,3957,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3960,loop,3959,loop.next());
        loop.reset();
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3962,loop,3961,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3964,loop,3963,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3966,loop,3965,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3968,loop,3967,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3970,loop,3969,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3972,loop,3971,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3974,loop,3973,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3976,loop,3975,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3978,loop,3977,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3980,loop,3979,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the reset method.
     */
@Test(timeout = 1000)
    public void testReset_add1104() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset_add1104");
        final List<java.lang.String> list = java.util.Arrays.asList("a", "b", "c");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3958,loop,3957,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3960,loop,3959,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3962,loop,3961,loop.next());
        loop.reset();
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3964,loop,3963,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3966,loop,3965,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3968,loop,3967,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3970,loop,3969,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3972,loop,3971,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3974,loop,3973,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3976,loop,3975,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3978,loop,3977,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3980,loop,3979,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the reset method.
     */
@Test(timeout = 1000)
    public void testReset_add1105() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset_add1105");
        final List<java.lang.String> list = java.util.Arrays.asList("a", "b", "c");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3958,loop,3957,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3960,loop,3959,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3962,loop,3961,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3964,loop,3963,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3966,loop,3965,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3968,loop,3967,loop.next());
        loop.reset();
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3970,loop,3969,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3972,loop,3971,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3974,loop,3973,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3976,loop,3975,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3978,loop,3977,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3980,loop,3979,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the reset method.
     */
@Test(timeout = 1000)
    public void testReset_add1106() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset_add1106");
        final List<java.lang.String> list = java.util.Arrays.asList("a", "b", "c");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3958,loop,3957,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3960,loop,3959,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3962,loop,3961,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3964,loop,3963,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3966,loop,3965,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3968,loop,3967,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3970,loop,3969,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3972,loop,3971,loop.previous());
        loop.reset();
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3974,loop,3973,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3976,loop,3975,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3978,loop,3977,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3980,loop,3979,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the reset method.
     */
@Test(timeout = 1000)
    public void testReset_add1107() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset_add1107");
        final List<java.lang.String> list = java.util.Arrays.asList("a", "b", "c");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3958,loop,3957,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3960,loop,3959,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3962,loop,3961,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3964,loop,3963,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3966,loop,3965,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3968,loop,3967,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3970,loop,3969,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3972,loop,3971,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3974,loop,3973,loop.previous());
        loop.reset();
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3976,loop,3975,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3978,loop,3977,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3980,loop,3979,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the reset method.
     */
public void testReset_literalMutation1083() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset_literalMutation1083");
        final List<java.lang.String> list = java.util.Arrays.asList("foo", "b", "c");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3958,loop,3957,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3960,loop,3959,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3962,loop,3961,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3964,loop,3963,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3966,loop,3965,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3968,loop,3967,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3970,loop,3969,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3972,loop,3971,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3974,loop,3973,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3976,loop,3975,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3978,loop,3977,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3980,loop,3979,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the reset method.
     */
public void testReset_literalMutation1084() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset_literalMutation1084");
        final List<java.lang.String> list = java.util.Arrays.asList("a", "foo", "c");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3958,loop,3957,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3960,loop,3959,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3962,loop,3961,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3964,loop,3963,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3966,loop,3965,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3968,loop,3967,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3970,loop,3969,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3972,loop,3971,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3974,loop,3973,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3976,loop,3975,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3978,loop,3977,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3980,loop,3979,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the reset method.
     */
public void testReset_literalMutation1085() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset_literalMutation1085");
        final List<java.lang.String> list = java.util.Arrays.asList("a", "b", "foo");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3958,loop,3957,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3960,loop,3959,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3962,loop,3961,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3964,loop,3963,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3966,loop,3965,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3968,loop,3967,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3970,loop,3969,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3972,loop,3971,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3974,loop,3973,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3976,loop,3975,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3978,loop,3977,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3980,loop,3979,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the reset method.
     */
@Test(timeout = 1000)
    public void testReset_remove823() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset_remove823");
        final List<java.lang.String> list = java.util.Arrays.asList("a", "b", "c");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3958,loop,3957,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3960,loop,3959,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3962,loop,3961,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3964,loop,3963,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3966,loop,3965,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3968,loop,3967,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3970,loop,3969,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3972,loop,3971,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3974,loop,3973,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3976,loop,3975,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3978,loop,3977,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3980,loop,3979,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the reset method.
     */
@Test(timeout = 1000)
    public void testReset_remove824() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset_remove824");
        final List<java.lang.String> list = java.util.Arrays.asList("a", "b", "c");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3958,loop,3957,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3960,loop,3959,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3962,loop,3961,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3964,loop,3963,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3966,loop,3965,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3968,loop,3967,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3970,loop,3969,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3972,loop,3971,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3974,loop,3973,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3976,loop,3975,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3978,loop,3977,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3980,loop,3979,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the reset method.
     */
@Test(timeout = 1000)
    public void testReset_remove825() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset_remove825");
        final List<java.lang.String> list = java.util.Arrays.asList("a", "b", "c");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3958,loop,3957,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3960,loop,3959,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3962,loop,3961,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3964,loop,3963,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3966,loop,3965,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3968,loop,3967,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3970,loop,3969,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3972,loop,3971,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3974,loop,3973,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3976,loop,3975,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3978,loop,3977,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3980,loop,3979,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the reset method.
     */
@Test(timeout = 1000)
    public void testReset_remove826() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset_remove826");
        final List<java.lang.String> list = java.util.Arrays.asList("a", "b", "c");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3958,loop,3957,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3960,loop,3959,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3962,loop,3961,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3964,loop,3963,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3966,loop,3965,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3968,loop,3967,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3970,loop,3969,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3972,loop,3971,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3974,loop,3973,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3976,loop,3975,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3978,loop,3977,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3980,loop,3979,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the reset method.
     */
@Test(timeout = 1000)
    public void testReset_remove827() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset_remove827");
        final List<java.lang.String> list = java.util.Arrays.asList("a", "b", "c");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3958,loop,3957,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3960,loop,3959,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3962,loop,3961,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3964,loop,3963,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3966,loop,3965,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3968,loop,3967,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3970,loop,3969,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3972,loop,3971,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3974,loop,3973,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3976,loop,3975,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3978,loop,3977,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3980,loop,3979,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the add method.
     */
public void testAdd() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd");
        List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3760,loop,3759,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3762,loop,3761,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3764,loop,3763,loop.next());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3766,loop,3765,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3768,loop,3767,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3770,loop,3769,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3772,loop,3771,loop.next());
        loop.add("d");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3774,loop,3773,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3776,loop,3775,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3778,loop,3777,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3780,loop,3779,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3782,loop,3781,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3784,loop,3783,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3786,loop,3785,loop.next());
        list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3788,loop,3787,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3790,loop,3789,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3792,loop,3791,loop.previous());
        loop.add("d");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3794,loop,3793,loop.previous());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3796,loop,3795,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3798,loop,3797,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3800,loop,3799,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3802,loop,3801,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3804,loop,3803,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3806,loop,3805,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3808,loop,3807,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3810,loop,3809,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the add method.
     */
@Test(timeout = 1000)
    public void testAdd_add1081() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_add1081");
        List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3760,loop,3759,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3762,loop,3761,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3764,loop,3763,loop.next());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3766,loop,3765,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3768,loop,3767,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3770,loop,3769,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3772,loop,3771,loop.next());
        loop.add("d");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3774,loop,3773,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3776,loop,3775,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3778,loop,3777,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3780,loop,3779,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3782,loop,3781,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3784,loop,3783,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3786,loop,3785,loop.next());
        list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3788,loop,3787,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3790,loop,3789,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3792,loop,3791,loop.previous());
        loop.add("d");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3794,loop,3793,loop.previous());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3796,loop,3795,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3798,loop,3797,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3800,loop,3799,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3802,loop,3801,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3804,loop,3803,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3806,loop,3805,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3808,loop,3807,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3810,loop,3809,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the add method.
     */
@Test(timeout = 1000)
    public void testAdd_add1082() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_add1082");
        List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3760,loop,3759,loop.next());
        loop.reset();
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3762,loop,3761,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3764,loop,3763,loop.next());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3766,loop,3765,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3768,loop,3767,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3770,loop,3769,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3772,loop,3771,loop.next());
        loop.add("d");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3774,loop,3773,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3776,loop,3775,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3778,loop,3777,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3780,loop,3779,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3782,loop,3781,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3784,loop,3783,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3786,loop,3785,loop.next());
        list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3788,loop,3787,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3790,loop,3789,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3792,loop,3791,loop.previous());
        loop.add("d");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3794,loop,3793,loop.previous());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3796,loop,3795,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3798,loop,3797,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3800,loop,3799,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3802,loop,3801,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3804,loop,3803,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3806,loop,3805,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3808,loop,3807,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3810,loop,3809,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the add method.
     */
@Test(timeout = 1000)
    public void testAdd_add1083() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_add1083");
        List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3760,loop,3759,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3762,loop,3761,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3764,loop,3763,loop.next());
        loop.add("c");
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3766,loop,3765,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3768,loop,3767,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3770,loop,3769,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3772,loop,3771,loop.next());
        loop.add("d");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3774,loop,3773,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3776,loop,3775,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3778,loop,3777,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3780,loop,3779,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3782,loop,3781,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3784,loop,3783,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3786,loop,3785,loop.next());
        list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3788,loop,3787,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3790,loop,3789,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3792,loop,3791,loop.previous());
        loop.add("d");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3794,loop,3793,loop.previous());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3796,loop,3795,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3798,loop,3797,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3800,loop,3799,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3802,loop,3801,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3804,loop,3803,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3806,loop,3805,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3808,loop,3807,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3810,loop,3809,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the add method.
     */
@Test(timeout = 1000)
    public void testAdd_add1084() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_add1084");
        List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3760,loop,3759,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3762,loop,3761,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3764,loop,3763,loop.next());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3766,loop,3765,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3768,loop,3767,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3770,loop,3769,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3772,loop,3771,loop.next());
        loop.add("d");
        loop.add("d");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3774,loop,3773,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3776,loop,3775,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3778,loop,3777,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3780,loop,3779,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3782,loop,3781,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3784,loop,3783,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3786,loop,3785,loop.next());
        list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3788,loop,3787,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3790,loop,3789,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3792,loop,3791,loop.previous());
        loop.add("d");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3794,loop,3793,loop.previous());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3796,loop,3795,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3798,loop,3797,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3800,loop,3799,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3802,loop,3801,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3804,loop,3803,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3806,loop,3805,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3808,loop,3807,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3810,loop,3809,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the add method.
     */
@Test(timeout = 1000)
    public void testAdd_add1085() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_add1085");
        List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3760,loop,3759,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3762,loop,3761,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3764,loop,3763,loop.next());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3766,loop,3765,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3768,loop,3767,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3770,loop,3769,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3772,loop,3771,loop.next());
        loop.add("d");
        loop.reset();
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3774,loop,3773,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3776,loop,3775,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3778,loop,3777,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3780,loop,3779,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3782,loop,3781,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3784,loop,3783,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3786,loop,3785,loop.next());
        list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3788,loop,3787,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3790,loop,3789,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3792,loop,3791,loop.previous());
        loop.add("d");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3794,loop,3793,loop.previous());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3796,loop,3795,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3798,loop,3797,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3800,loop,3799,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3802,loop,3801,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3804,loop,3803,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3806,loop,3805,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3808,loop,3807,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3810,loop,3809,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the add method.
     */
@Test(timeout = 1000)
    public void testAdd_add1086() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_add1086");
        List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3760,loop,3759,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3762,loop,3761,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3764,loop,3763,loop.next());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3766,loop,3765,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3768,loop,3767,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3770,loop,3769,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3772,loop,3771,loop.next());
        loop.add("d");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3774,loop,3773,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3776,loop,3775,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3778,loop,3777,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3780,loop,3779,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3782,loop,3781,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3784,loop,3783,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3786,loop,3785,loop.next());
        list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3788,loop,3787,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3790,loop,3789,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3792,loop,3791,loop.previous());
        loop.add("d");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3794,loop,3793,loop.previous());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3796,loop,3795,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3798,loop,3797,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3800,loop,3799,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3802,loop,3801,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3804,loop,3803,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3806,loop,3805,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3808,loop,3807,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3810,loop,3809,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the add method.
     */
@Test(timeout = 1000)
    public void testAdd_add1087() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_add1087");
        List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3760,loop,3759,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3762,loop,3761,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3764,loop,3763,loop.next());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3766,loop,3765,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3768,loop,3767,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3770,loop,3769,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3772,loop,3771,loop.next());
        loop.add("d");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3774,loop,3773,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3776,loop,3775,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3778,loop,3777,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3780,loop,3779,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3782,loop,3781,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3784,loop,3783,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3786,loop,3785,loop.next());
        list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3788,loop,3787,loop.previous());
        loop.reset();
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3790,loop,3789,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3792,loop,3791,loop.previous());
        loop.add("d");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3794,loop,3793,loop.previous());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3796,loop,3795,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3798,loop,3797,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3800,loop,3799,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3802,loop,3801,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3804,loop,3803,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3806,loop,3805,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3808,loop,3807,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3810,loop,3809,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the add method.
     */
@Test(timeout = 1000)
    public void testAdd_add1088() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_add1088");
        List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3760,loop,3759,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3762,loop,3761,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3764,loop,3763,loop.next());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3766,loop,3765,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3768,loop,3767,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3770,loop,3769,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3772,loop,3771,loop.next());
        loop.add("d");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3774,loop,3773,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3776,loop,3775,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3778,loop,3777,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3780,loop,3779,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3782,loop,3781,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3784,loop,3783,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3786,loop,3785,loop.next());
        list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3788,loop,3787,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3790,loop,3789,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3792,loop,3791,loop.previous());
        loop.add("d");
        loop.add("d");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3794,loop,3793,loop.previous());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3796,loop,3795,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3798,loop,3797,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3800,loop,3799,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3802,loop,3801,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3804,loop,3803,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3806,loop,3805,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3808,loop,3807,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3810,loop,3809,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the add method.
     */
@Test(timeout = 1000)
    public void testAdd_add1089() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_add1089");
        List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3760,loop,3759,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3762,loop,3761,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3764,loop,3763,loop.next());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3766,loop,3765,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3768,loop,3767,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3770,loop,3769,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3772,loop,3771,loop.next());
        loop.add("d");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3774,loop,3773,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3776,loop,3775,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3778,loop,3777,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3780,loop,3779,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3782,loop,3781,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3784,loop,3783,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3786,loop,3785,loop.next());
        list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3788,loop,3787,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3790,loop,3789,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3792,loop,3791,loop.previous());
        loop.add("d");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3794,loop,3793,loop.previous());
        loop.add("c");
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3796,loop,3795,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3798,loop,3797,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3800,loop,3799,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3802,loop,3801,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3804,loop,3803,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3806,loop,3805,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3808,loop,3807,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3810,loop,3809,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the add method.
     */
@Test(timeout = 1000)
    public void testAdd_add1090() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_add1090");
        List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3760,loop,3759,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3762,loop,3761,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3764,loop,3763,loop.next());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3766,loop,3765,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3768,loop,3767,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3770,loop,3769,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3772,loop,3771,loop.next());
        loop.add("d");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3774,loop,3773,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3776,loop,3775,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3778,loop,3777,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3780,loop,3779,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3782,loop,3781,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3784,loop,3783,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3786,loop,3785,loop.next());
        list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3788,loop,3787,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3790,loop,3789,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3792,loop,3791,loop.previous());
        loop.add("d");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3794,loop,3793,loop.previous());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3796,loop,3795,loop.previous());
        loop.reset();
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3798,loop,3797,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3800,loop,3799,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3802,loop,3801,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3804,loop,3803,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3806,loop,3805,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3808,loop,3807,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3810,loop,3809,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the add method.
     */
public void testAdd_literalMutation1054() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_literalMutation1054");
        List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("foo", "e", "f"));
        LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3760,loop,3759,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3762,loop,3761,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3764,loop,3763,loop.next());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3766,loop,3765,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3768,loop,3767,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3770,loop,3769,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3772,loop,3771,loop.next());
        loop.add("d");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3774,loop,3773,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3776,loop,3775,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3778,loop,3777,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3780,loop,3779,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3782,loop,3781,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3784,loop,3783,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3786,loop,3785,loop.next());
        list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3788,loop,3787,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3790,loop,3789,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3792,loop,3791,loop.previous());
        loop.add("d");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3794,loop,3793,loop.previous());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3796,loop,3795,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3798,loop,3797,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3800,loop,3799,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3802,loop,3801,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3804,loop,3803,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3806,loop,3805,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3808,loop,3807,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3810,loop,3809,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the add method.
     */
public void testAdd_literalMutation1055() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_literalMutation1055");
        List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "foo", "f"));
        LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3760,loop,3759,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3762,loop,3761,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3764,loop,3763,loop.next());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3766,loop,3765,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3768,loop,3767,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3770,loop,3769,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3772,loop,3771,loop.next());
        loop.add("d");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3774,loop,3773,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3776,loop,3775,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3778,loop,3777,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3780,loop,3779,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3782,loop,3781,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3784,loop,3783,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3786,loop,3785,loop.next());
        list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3788,loop,3787,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3790,loop,3789,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3792,loop,3791,loop.previous());
        loop.add("d");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3794,loop,3793,loop.previous());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3796,loop,3795,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3798,loop,3797,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3800,loop,3799,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3802,loop,3801,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3804,loop,3803,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3806,loop,3805,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3808,loop,3807,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3810,loop,3809,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the add method.
     */
public void testAdd_literalMutation1056() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_literalMutation1056");
        List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "foo"));
        LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3760,loop,3759,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3762,loop,3761,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3764,loop,3763,loop.next());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3766,loop,3765,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3768,loop,3767,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3770,loop,3769,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3772,loop,3771,loop.next());
        loop.add("d");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3774,loop,3773,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3776,loop,3775,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3778,loop,3777,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3780,loop,3779,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3782,loop,3781,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3784,loop,3783,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3786,loop,3785,loop.next());
        list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3788,loop,3787,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3790,loop,3789,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3792,loop,3791,loop.previous());
        loop.add("d");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3794,loop,3793,loop.previous());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3796,loop,3795,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3798,loop,3797,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3800,loop,3799,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3802,loop,3801,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3804,loop,3803,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3806,loop,3805,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3808,loop,3807,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3810,loop,3809,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the add method.
     */
public void testAdd_literalMutation1057() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_literalMutation1057");
        List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3760,loop,3759,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3762,loop,3761,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3764,loop,3763,loop.next());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3766,loop,3765,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3768,loop,3767,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3770,loop,3769,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3772,loop,3771,loop.next());
        loop.add("d");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3774,loop,3773,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3776,loop,3775,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3778,loop,3777,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3780,loop,3779,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3782,loop,3781,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3784,loop,3783,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3786,loop,3785,loop.next());
        list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3788,loop,3787,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3790,loop,3789,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3792,loop,3791,loop.previous());
        loop.add("d");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3794,loop,3793,loop.previous());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3796,loop,3795,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3798,loop,3797,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3800,loop,3799,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3802,loop,3801,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3804,loop,3803,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3806,loop,3805,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3808,loop,3807,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3810,loop,3809,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the add method.
     */
public void testAdd_literalMutation1058() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_literalMutation1058");
        List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3760,loop,3759,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3762,loop,3761,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3764,loop,3763,loop.next());
        loop.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3766,loop,3765,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3768,loop,3767,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3770,loop,3769,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3772,loop,3771,loop.next());
        loop.add("d");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3774,loop,3773,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3776,loop,3775,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3778,loop,3777,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3780,loop,3779,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3782,loop,3781,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3784,loop,3783,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3786,loop,3785,loop.next());
        list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3788,loop,3787,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3790,loop,3789,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3792,loop,3791,loop.previous());
        loop.add("d");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3794,loop,3793,loop.previous());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3796,loop,3795,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3798,loop,3797,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3800,loop,3799,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3802,loop,3801,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3804,loop,3803,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3806,loop,3805,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3808,loop,3807,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3810,loop,3809,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the add method.
     */
public void testAdd_literalMutation1059() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_literalMutation1059");
        List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3760,loop,3759,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3762,loop,3761,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3764,loop,3763,loop.next());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3766,loop,3765,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3768,loop,3767,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3770,loop,3769,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3772,loop,3771,loop.next());
        loop.add("foo");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3774,loop,3773,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3776,loop,3775,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3778,loop,3777,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3780,loop,3779,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3782,loop,3781,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3784,loop,3783,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3786,loop,3785,loop.next());
        list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3788,loop,3787,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3790,loop,3789,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3792,loop,3791,loop.previous());
        loop.add("d");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3794,loop,3793,loop.previous());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3796,loop,3795,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3798,loop,3797,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3800,loop,3799,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3802,loop,3801,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3804,loop,3803,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3806,loop,3805,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3808,loop,3807,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3810,loop,3809,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the add method.
     */
public void testAdd_literalMutation1060() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_literalMutation1060");
        List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3760,loop,3759,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3762,loop,3761,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3764,loop,3763,loop.next());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3766,loop,3765,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3768,loop,3767,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3770,loop,3769,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3772,loop,3771,loop.next());
        loop.add("d");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3774,loop,3773,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3776,loop,3775,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3778,loop,3777,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3780,loop,3779,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3782,loop,3781,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3784,loop,3783,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3786,loop,3785,loop.next());
        list = new ArrayList<java.lang.String>(java.util.Arrays.asList("foo", "e", "f"));
        loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3788,loop,3787,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3790,loop,3789,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3792,loop,3791,loop.previous());
        loop.add("d");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3794,loop,3793,loop.previous());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3796,loop,3795,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3798,loop,3797,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3800,loop,3799,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3802,loop,3801,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3804,loop,3803,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3806,loop,3805,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3808,loop,3807,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3810,loop,3809,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the add method.
     */
public void testAdd_literalMutation1061() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_literalMutation1061");
        List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3760,loop,3759,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3762,loop,3761,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3764,loop,3763,loop.next());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3766,loop,3765,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3768,loop,3767,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3770,loop,3769,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3772,loop,3771,loop.next());
        loop.add("d");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3774,loop,3773,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3776,loop,3775,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3778,loop,3777,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3780,loop,3779,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3782,loop,3781,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3784,loop,3783,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3786,loop,3785,loop.next());
        list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "foo", "f"));
        loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3788,loop,3787,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3790,loop,3789,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3792,loop,3791,loop.previous());
        loop.add("d");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3794,loop,3793,loop.previous());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3796,loop,3795,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3798,loop,3797,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3800,loop,3799,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3802,loop,3801,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3804,loop,3803,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3806,loop,3805,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3808,loop,3807,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3810,loop,3809,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the add method.
     */
public void testAdd_literalMutation1062() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_literalMutation1062");
        List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3760,loop,3759,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3762,loop,3761,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3764,loop,3763,loop.next());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3766,loop,3765,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3768,loop,3767,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3770,loop,3769,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3772,loop,3771,loop.next());
        loop.add("d");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3774,loop,3773,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3776,loop,3775,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3778,loop,3777,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3780,loop,3779,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3782,loop,3781,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3784,loop,3783,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3786,loop,3785,loop.next());
        list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "foo"));
        loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3788,loop,3787,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3790,loop,3789,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3792,loop,3791,loop.previous());
        loop.add("d");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3794,loop,3793,loop.previous());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3796,loop,3795,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3798,loop,3797,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3800,loop,3799,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3802,loop,3801,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3804,loop,3803,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3806,loop,3805,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3808,loop,3807,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3810,loop,3809,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the add method.
     */
public void testAdd_literalMutation1063() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_literalMutation1063");
        List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3760,loop,3759,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3762,loop,3761,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3764,loop,3763,loop.next());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3766,loop,3765,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3768,loop,3767,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3770,loop,3769,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3772,loop,3771,loop.next());
        loop.add("d");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3774,loop,3773,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3776,loop,3775,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3778,loop,3777,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3780,loop,3779,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3782,loop,3781,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3784,loop,3783,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3786,loop,3785,loop.next());
        list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3788,loop,3787,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3790,loop,3789,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3792,loop,3791,loop.previous());
        loop.add("d");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3794,loop,3793,loop.previous());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3796,loop,3795,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3798,loop,3797,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3800,loop,3799,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3802,loop,3801,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3804,loop,3803,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3806,loop,3805,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3808,loop,3807,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3810,loop,3809,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the add method.
     */
public void testAdd_literalMutation1064() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_literalMutation1064");
        List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3760,loop,3759,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3762,loop,3761,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3764,loop,3763,loop.next());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3766,loop,3765,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3768,loop,3767,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3770,loop,3769,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3772,loop,3771,loop.next());
        loop.add("d");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3774,loop,3773,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3776,loop,3775,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3778,loop,3777,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3780,loop,3779,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3782,loop,3781,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3784,loop,3783,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3786,loop,3785,loop.next());
        list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3788,loop,3787,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3790,loop,3789,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3792,loop,3791,loop.previous());
        loop.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3794,loop,3793,loop.previous());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3796,loop,3795,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3798,loop,3797,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3800,loop,3799,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3802,loop,3801,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3804,loop,3803,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3806,loop,3805,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3808,loop,3807,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3810,loop,3809,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the add method.
     */
public void testAdd_literalMutation1065() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_literalMutation1065");
        List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3760,loop,3759,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3762,loop,3761,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3764,loop,3763,loop.next());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3766,loop,3765,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3768,loop,3767,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3770,loop,3769,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3772,loop,3771,loop.next());
        loop.add("d");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3774,loop,3773,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3776,loop,3775,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3778,loop,3777,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3780,loop,3779,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3782,loop,3781,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3784,loop,3783,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3786,loop,3785,loop.next());
        list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3788,loop,3787,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3790,loop,3789,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3792,loop,3791,loop.previous());
        loop.add("d");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3794,loop,3793,loop.previous());
        loop.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3796,loop,3795,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3798,loop,3797,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3800,loop,3799,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3802,loop,3801,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3804,loop,3803,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3806,loop,3805,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3808,loop,3807,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3810,loop,3809,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the add method.
     */
@Test(timeout = 1000)
    public void testAdd_remove805() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_remove805");
        List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3760,loop,3759,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3762,loop,3761,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3764,loop,3763,loop.next());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3766,loop,3765,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3768,loop,3767,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3770,loop,3769,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3772,loop,3771,loop.next());
        loop.add("d");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3774,loop,3773,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3776,loop,3775,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3778,loop,3777,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3780,loop,3779,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3782,loop,3781,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3784,loop,3783,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3786,loop,3785,loop.next());
        list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3788,loop,3787,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3790,loop,3789,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3792,loop,3791,loop.previous());
        loop.add("d");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3794,loop,3793,loop.previous());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3796,loop,3795,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3798,loop,3797,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3800,loop,3799,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3802,loop,3801,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3804,loop,3803,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3806,loop,3805,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3808,loop,3807,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3810,loop,3809,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the add method.
     */
@Test(timeout = 1000)
    public void testAdd_remove806() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_remove806");
        List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3760,loop,3759,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3762,loop,3761,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3764,loop,3763,loop.next());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3766,loop,3765,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3768,loop,3767,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3770,loop,3769,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3772,loop,3771,loop.next());
        loop.add("d");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3774,loop,3773,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3776,loop,3775,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3778,loop,3777,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3780,loop,3779,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3782,loop,3781,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3784,loop,3783,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3786,loop,3785,loop.next());
        list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3788,loop,3787,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3790,loop,3789,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3792,loop,3791,loop.previous());
        loop.add("d");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3794,loop,3793,loop.previous());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3796,loop,3795,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3798,loop,3797,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3800,loop,3799,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3802,loop,3801,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3804,loop,3803,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3806,loop,3805,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3808,loop,3807,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3810,loop,3809,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the add method.
     */
@Test(timeout = 1000)
    public void testAdd_remove807() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_remove807");
        List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3760,loop,3759,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3762,loop,3761,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3764,loop,3763,loop.next());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3766,loop,3765,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3768,loop,3767,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3770,loop,3769,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3772,loop,3771,loop.next());
        loop.add("d");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3774,loop,3773,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3776,loop,3775,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3778,loop,3777,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3780,loop,3779,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3782,loop,3781,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3784,loop,3783,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3786,loop,3785,loop.next());
        list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3788,loop,3787,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3790,loop,3789,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3792,loop,3791,loop.previous());
        loop.add("d");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3794,loop,3793,loop.previous());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3796,loop,3795,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3798,loop,3797,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3800,loop,3799,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3802,loop,3801,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3804,loop,3803,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3806,loop,3805,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3808,loop,3807,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3810,loop,3809,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the add method.
     */
@Test(timeout = 1000)
    public void testAdd_remove808() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_remove808");
        List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3760,loop,3759,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3762,loop,3761,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3764,loop,3763,loop.next());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3766,loop,3765,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3768,loop,3767,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3770,loop,3769,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3772,loop,3771,loop.next());
        loop.add("d");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3774,loop,3773,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3776,loop,3775,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3778,loop,3777,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3780,loop,3779,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3782,loop,3781,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3784,loop,3783,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3786,loop,3785,loop.next());
        list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3788,loop,3787,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3790,loop,3789,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3792,loop,3791,loop.previous());
        loop.add("d");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3794,loop,3793,loop.previous());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3796,loop,3795,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3798,loop,3797,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3800,loop,3799,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3802,loop,3801,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3804,loop,3803,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3806,loop,3805,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3808,loop,3807,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3810,loop,3809,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the add method.
     */
@Test(timeout = 1000)
    public void testAdd_remove809() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_remove809");
        List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3760,loop,3759,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3762,loop,3761,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3764,loop,3763,loop.next());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3766,loop,3765,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3768,loop,3767,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3770,loop,3769,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3772,loop,3771,loop.next());
        loop.add("d");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3774,loop,3773,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3776,loop,3775,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3778,loop,3777,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3780,loop,3779,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3782,loop,3781,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3784,loop,3783,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3786,loop,3785,loop.next());
        list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3788,loop,3787,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3790,loop,3789,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3792,loop,3791,loop.previous());
        loop.add("d");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3794,loop,3793,loop.previous());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3796,loop,3795,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3798,loop,3797,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3800,loop,3799,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3802,loop,3801,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3804,loop,3803,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3806,loop,3805,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3808,loop,3807,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3810,loop,3809,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the add method.
     */
@Test(timeout = 1000)
    public void testAdd_remove810() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_remove810");
        List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3760,loop,3759,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3762,loop,3761,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3764,loop,3763,loop.next());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3766,loop,3765,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3768,loop,3767,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3770,loop,3769,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3772,loop,3771,loop.next());
        loop.add("d");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3774,loop,3773,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3776,loop,3775,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3778,loop,3777,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3780,loop,3779,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3782,loop,3781,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3784,loop,3783,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3786,loop,3785,loop.next());
        list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3788,loop,3787,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3790,loop,3789,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3792,loop,3791,loop.previous());
        loop.add("d");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3794,loop,3793,loop.previous());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3796,loop,3795,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3798,loop,3797,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3800,loop,3799,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3802,loop,3801,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3804,loop,3803,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3806,loop,3805,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3808,loop,3807,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3810,loop,3809,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the add method.
     */
@Test(timeout = 1000)
    public void testAdd_remove811() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_remove811");
        List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3760,loop,3759,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3762,loop,3761,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3764,loop,3763,loop.next());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3766,loop,3765,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3768,loop,3767,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3770,loop,3769,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3772,loop,3771,loop.next());
        loop.add("d");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3774,loop,3773,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3776,loop,3775,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3778,loop,3777,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3780,loop,3779,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3782,loop,3781,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3784,loop,3783,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3786,loop,3785,loop.next());
        list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3788,loop,3787,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3790,loop,3789,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3792,loop,3791,loop.previous());
        loop.add("d");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3794,loop,3793,loop.previous());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3796,loop,3795,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3798,loop,3797,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3800,loop,3799,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3802,loop,3801,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3804,loop,3803,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3806,loop,3805,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3808,loop,3807,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3810,loop,3809,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the add method.
     */
@Test(timeout = 1000)
    public void testAdd_remove812() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_remove812");
        List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3760,loop,3759,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3762,loop,3761,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3764,loop,3763,loop.next());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3766,loop,3765,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3768,loop,3767,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3770,loop,3769,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3772,loop,3771,loop.next());
        loop.add("d");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3774,loop,3773,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3776,loop,3775,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3778,loop,3777,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3780,loop,3779,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3782,loop,3781,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3784,loop,3783,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3786,loop,3785,loop.next());
        list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3788,loop,3787,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3790,loop,3789,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3792,loop,3791,loop.previous());
        loop.add("d");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3794,loop,3793,loop.previous());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3796,loop,3795,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3798,loop,3797,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3800,loop,3799,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3802,loop,3801,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3804,loop,3803,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3806,loop,3805,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3808,loop,3807,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3810,loop,3809,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the add method.
     */
@Test(timeout = 1000)
    public void testAdd_remove813() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_remove813");
        List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3760,loop,3759,loop.next());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3762,loop,3761,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3764,loop,3763,loop.next());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3766,loop,3765,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3768,loop,3767,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3770,loop,3769,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3772,loop,3771,loop.next());
        loop.add("d");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3774,loop,3773,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3776,loop,3775,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3778,loop,3777,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3780,loop,3779,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3782,loop,3781,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3784,loop,3783,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3786,loop,3785,loop.next());
        list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3788,loop,3787,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3790,loop,3789,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3792,loop,3791,loop.previous());
        loop.add("d");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3794,loop,3793,loop.previous());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3796,loop,3795,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3798,loop,3797,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3800,loop,3799,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3802,loop,3801,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3804,loop,3803,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3806,loop,3805,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3808,loop,3807,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3810,loop,3809,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the add method.
     */
@Test(timeout = 1000)
    public void testAdd_remove814() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_remove814");
        List<java.lang.String> list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3760,loop,3759,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3762,loop,3761,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3764,loop,3763,loop.next());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3766,loop,3765,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3768,loop,3767,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3770,loop,3769,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3772,loop,3771,loop.next());
        loop.add("d");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3774,loop,3773,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3776,loop,3775,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3778,loop,3777,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3780,loop,3779,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3782,loop,3781,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3784,loop,3783,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3786,loop,3785,loop.next());
        list = new ArrayList<java.lang.String>(java.util.Arrays.asList("b", "e", "f"));
        loop = new LoopingListIterator<java.lang.String>(list);
        loop.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3788,loop,3787,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3790,loop,3789,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3792,loop,3791,loop.previous());
        loop.add("d");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3794,loop,3793,loop.previous());
        loop.add("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3796,loop,3795,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3798,loop,3797,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3800,loop,3799,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3802,loop,3801,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3804,loop,3803,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3806,loop,3805,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3808,loop,3807,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3810,loop,3809,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests nextIndex and previousIndex.
     */
public void testNextAndPreviousIndex() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextAndPreviousIndex");
        final List<java.lang.String> list = java.util.Arrays.asList("foo", "b", "c");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3886,loop,3885,loop.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3888,loop,3887,loop.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3890,loop,3889,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3892,loop,3891,loop.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3894,loop,3893,loop.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3896,loop,3895,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3898,loop,3897,loop.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3900,loop,3899,loop.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3902,loop,3901,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3904,loop,3903,loop.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3906,loop,3905,loop.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3908,loop,3907,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3910,loop,3909,loop.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3912,loop,3911,loop.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3914,loop,3913,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3916,loop,3915,loop.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3918,loop,3917,loop.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests nextIndex and previousIndex.
     */
public void testNextAndPreviousIndex_literalMutation1075() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextAndPreviousIndex_literalMutation1075");
        final List<java.lang.String> list = java.util.Arrays.asList("a", "foo", "c");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3886,loop,3885,loop.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3888,loop,3887,loop.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3890,loop,3889,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3892,loop,3891,loop.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3894,loop,3893,loop.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3896,loop,3895,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3898,loop,3897,loop.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3900,loop,3899,loop.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3902,loop,3901,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3904,loop,3903,loop.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3906,loop,3905,loop.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3908,loop,3907,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3910,loop,3909,loop.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3912,loop,3911,loop.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3914,loop,3913,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3916,loop,3915,loop.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3918,loop,3917,loop.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests nextIndex and previousIndex.
     */
public void testNextAndPreviousIndex_literalMutation1076() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextAndPreviousIndex_literalMutation1076");
        final List<java.lang.String> list = java.util.Arrays.asList("a", "b", "foo");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3886,loop,3885,loop.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3888,loop,3887,loop.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3890,loop,3889,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3892,loop,3891,loop.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3894,loop,3893,loop.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3896,loop,3895,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3898,loop,3897,loop.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3900,loop,3899,loop.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3902,loop,3901,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3904,loop,3903,loop.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3906,loop,3905,loop.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3908,loop,3907,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3910,loop,3909,loop.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3912,loop,3911,loop.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3914,loop,3913,loop.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3916,loop,3915,loop.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3918,loop,3917,loop.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests using the set method to change elements.
     */
public void testSet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet");
        final List<java.lang.String> list = java.util.Arrays.asList("q", "r", "z");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3982,loop,3981,loop.previous());
        loop.set("c");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3984,loop,3983,loop.next());
        loop.set("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3986,loop,3985,loop.next());
        loop.set("b");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3988,loop,3987,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3990,loop,3989,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3992,loop,3991,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests using the set method to change elements.
     */
@Test(timeout = 1000)
    public void testSet_add1108() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_add1108");
        final List<java.lang.String> list = java.util.Arrays.asList("q", "r", "z");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3982,loop,3981,loop.previous());
        loop.set("c");
        loop.set("c");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3984,loop,3983,loop.next());
        loop.set("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3986,loop,3985,loop.next());
        loop.set("b");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3988,loop,3987,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3990,loop,3989,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3992,loop,3991,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests using the set method to change elements.
     */
@Test(timeout = 1000)
    public void testSet_add1109() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_add1109");
        final List<java.lang.String> list = java.util.Arrays.asList("q", "r", "z");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3982,loop,3981,loop.previous());
        loop.set("c");
        loop.reset();
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3984,loop,3983,loop.next());
        loop.set("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3986,loop,3985,loop.next());
        loop.set("b");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3988,loop,3987,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3990,loop,3989,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3992,loop,3991,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests using the set method to change elements.
     */
@Test(timeout = 1000)
    public void testSet_add1110() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_add1110");
        final List<java.lang.String> list = java.util.Arrays.asList("q", "r", "z");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3982,loop,3981,loop.previous());
        loop.set("c");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3984,loop,3983,loop.next());
        loop.set("a");
        loop.set("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3986,loop,3985,loop.next());
        loop.set("b");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3988,loop,3987,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3990,loop,3989,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3992,loop,3991,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests using the set method to change elements.
     */
@Test(timeout = 1000)
    public void testSet_add1111() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_add1111");
        final List<java.lang.String> list = java.util.Arrays.asList("q", "r", "z");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3982,loop,3981,loop.previous());
        loop.set("c");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3984,loop,3983,loop.next());
        loop.set("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3986,loop,3985,loop.next());
        loop.set("b");
        loop.set("b");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3988,loop,3987,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3990,loop,3989,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3992,loop,3991,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests using the set method to change elements.
     */
@Test(timeout = 1000)
    public void testSet_add1112() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_add1112");
        final List<java.lang.String> list = java.util.Arrays.asList("q", "r", "z");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3982,loop,3981,loop.previous());
        loop.set("c");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3984,loop,3983,loop.next());
        loop.set("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3986,loop,3985,loop.next());
        loop.set("b");
        loop.reset();
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3988,loop,3987,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3990,loop,3989,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3992,loop,3991,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests using the set method to change elements.
     */
public void testSet_literalMutation1086() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_literalMutation1086");
        final List<java.lang.String> list = java.util.Arrays.asList("foo", "r", "z");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3982,loop,3981,loop.previous());
        loop.set("c");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3984,loop,3983,loop.next());
        loop.set("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3986,loop,3985,loop.next());
        loop.set("b");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3988,loop,3987,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3990,loop,3989,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3992,loop,3991,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests using the set method to change elements.
     */
public void testSet_literalMutation1087() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_literalMutation1087");
        final List<java.lang.String> list = java.util.Arrays.asList("q", "foo", "z");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3982,loop,3981,loop.previous());
        loop.set("c");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3984,loop,3983,loop.next());
        loop.set("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3986,loop,3985,loop.next());
        loop.set("b");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3988,loop,3987,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3990,loop,3989,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3992,loop,3991,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests using the set method to change elements.
     */
public void testSet_literalMutation1088() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_literalMutation1088");
        final List<java.lang.String> list = java.util.Arrays.asList("q", "r", "foo");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3982,loop,3981,loop.previous());
        loop.set("c");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3984,loop,3983,loop.next());
        loop.set("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3986,loop,3985,loop.next());
        loop.set("b");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3988,loop,3987,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3990,loop,3989,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3992,loop,3991,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests using the set method to change elements.
     */
public void testSet_literalMutation1089() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_literalMutation1089");
        final List<java.lang.String> list = java.util.Arrays.asList("q", "r", "z");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3982,loop,3981,loop.previous());
        loop.set("foo");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3984,loop,3983,loop.next());
        loop.set("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3986,loop,3985,loop.next());
        loop.set("b");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3988,loop,3987,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3990,loop,3989,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3992,loop,3991,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests using the set method to change elements.
     */
public void testSet_literalMutation1090() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_literalMutation1090");
        final List<java.lang.String> list = java.util.Arrays.asList("q", "r", "z");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3982,loop,3981,loop.previous());
        loop.set("c");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3984,loop,3983,loop.next());
        loop.set("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3986,loop,3985,loop.next());
        loop.set("b");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3988,loop,3987,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3990,loop,3989,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3992,loop,3991,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests using the set method to change elements.
     */
public void testSet_literalMutation1091() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_literalMutation1091");
        final List<java.lang.String> list = java.util.Arrays.asList("q", "r", "z");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3982,loop,3981,loop.previous());
        loop.set("c");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3984,loop,3983,loop.next());
        loop.set("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3986,loop,3985,loop.next());
        loop.set("foo");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3988,loop,3987,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3990,loop,3989,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3992,loop,3991,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests using the set method to change elements.
     */
@Test(timeout = 1000)
    public void testSet_remove828() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_remove828");
        final List<java.lang.String> list = java.util.Arrays.asList("q", "r", "z");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3982,loop,3981,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3984,loop,3983,loop.next());
        loop.set("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3986,loop,3985,loop.next());
        loop.set("b");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3988,loop,3987,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3990,loop,3989,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3992,loop,3991,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests using the set method to change elements.
     */
@Test(timeout = 1000)
    public void testSet_remove829() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_remove829");
        final List<java.lang.String> list = java.util.Arrays.asList("q", "r", "z");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3982,loop,3981,loop.previous());
        loop.set("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3984,loop,3983,loop.next());
        loop.set("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3986,loop,3985,loop.next());
        loop.set("b");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3988,loop,3987,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3990,loop,3989,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3992,loop,3991,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests using the set method to change elements.
     */
@Test(timeout = 1000)
    public void testSet_remove830() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_remove830");
        final List<java.lang.String> list = java.util.Arrays.asList("q", "r", "z");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3982,loop,3981,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3984,loop,3983,loop.next());
        loop.set("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3986,loop,3985,loop.next());
        loop.set("b");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3988,loop,3987,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3990,loop,3989,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3992,loop,3991,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests using the set method to change elements.
     */
@Test(timeout = 1000)
    public void testSet_remove831() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_remove831");
        final List<java.lang.String> list = java.util.Arrays.asList("q", "r", "z");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3982,loop,3981,loop.previous());
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3984,loop,3983,loop.next());
        loop.set("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3986,loop,3985,loop.next());
        loop.set("b");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3988,loop,3987,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3990,loop,3989,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3992,loop,3991,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests using the set method to change elements.
     */
@Test(timeout = 1000)
    public void testSet_remove832() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_remove832");
        final List<java.lang.String> list = java.util.Arrays.asList("q", "r", "z");
        final LoopingListIterator<java.lang.String> loop = new LoopingListIterator<java.lang.String>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3982,loop,3981,loop.previous());
        loop.set("c");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3984,loop,3983,loop.next());
        loop.set("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3986,loop,3985,loop.next());
        loop.set("b");
        loop.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3988,loop,3987,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3990,loop,3989,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3992,loop,3991,loop.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


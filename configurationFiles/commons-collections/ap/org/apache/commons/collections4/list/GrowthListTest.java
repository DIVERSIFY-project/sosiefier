package org.apache.commons.collections4.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/** 
 * Extension of {@link AbstractListTest} for exercising the {@link GrowthList}.
 * 
 * @version $Id$
 * @since 3.2
 */
public class GrowthListTest<E> extends AbstractListTest<E> {
    public GrowthListTest(final String testName) {
        super(testName);
    }

    @Override
    public List<E> makeObject() {
        return new GrowthList<E>();
    }

    @Override
    public List<E> makeFullCollection() {
        final List<E> list = new ArrayList<E>();
        list.addAll(java.util.Arrays.asList(getFullElements()));
        return GrowthList.growthList(list);
    }

    public void testGrowthAdd() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGrowthAdd");
        final Integer one = Integer.valueOf(2);
        final GrowthList<java.lang.Integer> grower = new GrowthList<java.lang.Integer>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2287,grower,2286,grower.size());
        grower.add(1, one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2289,grower,2288,grower.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2291,grower,2290,grower.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2292,one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2294,grower,2293,grower.get(1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGrowthAdd_literalMutation792() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGrowthAdd_literalMutation792");
        final Integer one = Integer.valueOf(1);
        final GrowthList<java.lang.Integer> grower = new GrowthList<java.lang.Integer>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2287,grower,2286,grower.size());
        grower.add(2, one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2289,grower,2288,grower.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2291,grower,2290,grower.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2292,one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2294,grower,2293,grower.get(1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGrowthAddAll() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGrowthAddAll");
        final Integer one = Integer.valueOf(0);
        final Integer two = Integer.valueOf(2);
        final Collection<java.lang.Integer> coll = new ArrayList<java.lang.Integer>();
        coll.add(one);
        coll.add(two);
        final GrowthList<java.lang.Integer> grower = new GrowthList<java.lang.Integer>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2275,grower,2274,grower.size());
        grower.addAll(1, coll);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2277,grower,2276,grower.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2279,grower,2278,grower.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2280,one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2282,grower,2281,grower.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2283,two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2285,grower,2284,grower.get(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGrowthAddAll_literalMutation794() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGrowthAddAll_literalMutation794");
        final Integer one = Integer.valueOf(1);
        final Integer two = Integer.valueOf(1);
        final Collection<java.lang.Integer> coll = new ArrayList<java.lang.Integer>();
        coll.add(one);
        coll.add(two);
        final GrowthList<java.lang.Integer> grower = new GrowthList<java.lang.Integer>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2275,grower,2274,grower.size());
        grower.addAll(1, coll);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2277,grower,2276,grower.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2279,grower,2278,grower.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2280,one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2282,grower,2281,grower.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2283,two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2285,grower,2284,grower.get(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGrowthAddAll_literalMutation795() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGrowthAddAll_literalMutation795");
        final Integer one = Integer.valueOf(1);
        final Integer two = Integer.valueOf(2);
        final Collection<java.lang.Integer> coll = new ArrayList<java.lang.Integer>();
        coll.add(one);
        coll.add(two);
        final GrowthList<java.lang.Integer> grower = new GrowthList<java.lang.Integer>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2275,grower,2274,grower.size());
        grower.addAll(0, coll);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2277,grower,2276,grower.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2279,grower,2278,grower.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2280,one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2282,grower,2281,grower.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2283,two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2285,grower,2284,grower.get(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGrowthSet1() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGrowthSet1");
        final Integer one = Integer.valueOf(0);
        final GrowthList<java.lang.Integer> grower = new GrowthList<java.lang.Integer>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2296,grower,2295,grower.size());
        grower.set(1, one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2298,grower,2297,grower.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2300,grower,2299,grower.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2301,one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2303,grower,2302,grower.get(1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGrowthSet1_literalMutation797() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGrowthSet1_literalMutation797");
        final Integer one = Integer.valueOf(1);
        final GrowthList<java.lang.Integer> grower = new GrowthList<java.lang.Integer>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2296,grower,2295,grower.size());
        grower.set(0, one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2298,grower,2297,grower.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2300,grower,2299,grower.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2301,one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2303,grower,2302,grower.get(1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGrowthSet2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGrowthSet2");
        final Integer one = Integer.valueOf(0);
        final GrowthList<java.lang.Integer> grower = new GrowthList<java.lang.Integer>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2305,grower,2304,grower.size());
        grower.set(0, one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2307,grower,2306,grower.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2308,one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2310,grower,2309,grower.get(0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGrowthSet2_literalMutation799() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGrowthSet2_literalMutation799");
        final Integer one = Integer.valueOf(1);
        final GrowthList<java.lang.Integer> grower = new GrowthList<java.lang.Integer>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2305,grower,2304,grower.size());
        grower.set(-1, one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2307,grower,2306,grower.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2308,one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2310,grower,2309,grower.get(0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Override.
     */
@Override
    public void testListAddByIndexBoundsChecking() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddByIndexBoundsChecking");
        List<E> list;
        final E element = getOtherElements()[0];
        try {
            list = makeObject();
            list.add(-1, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Override.
     */
public void testListAddByIndexBoundsChecking_literalMutation800() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddByIndexBoundsChecking_literalMutation800");
        List<E> list;
        final E element = getOtherElements()[-1];
        try {
            list = makeObject();
            list.add(-1, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Override.
     */
public void testListAddByIndexBoundsChecking_literalMutation801() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddByIndexBoundsChecking_literalMutation801");
        List<E> list;
        final E element = getOtherElements()[0];
        try {
            list = makeObject();
            list.add(2, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Override.
     */
@Override
    public void testListAddByIndexBoundsChecking2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddByIndexBoundsChecking2");
        List<E> list;
        final E element = getOtherElements()[0];
        try {
            list = makeFullCollection();
            list.add(-1, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Override.
     */
public void testListAddByIndexBoundsChecking2_literalMutation802() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddByIndexBoundsChecking2_literalMutation802");
        List<E> list;
        final E element = getOtherElements()[-1];
        try {
            list = makeFullCollection();
            list.add(-1, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Override.
     */
public void testListAddByIndexBoundsChecking2_literalMutation803() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddByIndexBoundsChecking2_literalMutation803");
        List<E> list;
        final E element = getOtherElements()[0];
        try {
            list = makeFullCollection();
            list.add(2, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Override.
     */
@Override
    public void testListSetByIndexBoundsChecking() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSetByIndexBoundsChecking");
        final List<E> list = makeObject();
        final E element = getOtherElements()[0];
        try {
            list.set(-1, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Override.
     */
public void testListSetByIndexBoundsChecking_literalMutation804() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSetByIndexBoundsChecking_literalMutation804");
        final List<E> list = makeObject();
        final E element = getOtherElements()[-1];
        try {
            list.set(-1, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Override.
     */
public void testListSetByIndexBoundsChecking_literalMutation805() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSetByIndexBoundsChecking_literalMutation805");
        final List<E> list = makeObject();
        final E element = getOtherElements()[0];
        try {
            list.set(0, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Override.
     */
@Override
    public void testListSetByIndexBoundsChecking2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSetByIndexBoundsChecking2");
        final List<E> list = makeFullCollection();
        final E element = getOtherElements()[0];
        try {
            list.set(-1, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Override.
     */
public void testListSetByIndexBoundsChecking2_literalMutation806() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSetByIndexBoundsChecking2_literalMutation806");
        final List<E> list = makeFullCollection();
        final E element = getOtherElements()[1];
        try {
            list.set(-1, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Override.
     */
public void testListSetByIndexBoundsChecking2_literalMutation807() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSetByIndexBoundsChecking2_literalMutation807");
        final List<E> list = makeFullCollection();
        final E element = getOtherElements()[0];
        try {
            list.set(0, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}


package org.apache.commons.collections4.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/** 
 * Extension of {@link AbstractListTest} for exercising the {@link TransformedList}
 * implementation.
 * 
 * @version $Id$
 * @since 3.0
 */
public class TransformedListTest<E> extends AbstractListTest<E> {
    public TransformedListTest(final String testName) {
        super(testName);
    }

    @Override
    public List<E> makeConfirmedCollection() {
        return new ArrayList<E>();
    }

    @Override
    public List<E> makeConfirmedFullCollection() {
        final List<E> list = new ArrayList<E>();
        list.addAll(java.util.Arrays.asList(getFullElements()));
        return list;
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public List<E> makeObject() {
        return org.apache.commons.collections4.list.TransformedList.transformingList(new ArrayList<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.NOOP_TRANSFORMER)));
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public List<E> makeFullCollection() {
        final List<E> list = new ArrayList<E>();
        list.addAll(java.util.Arrays.asList(getFullElements()));
        return org.apache.commons.collections4.list.TransformedList.transformingList(list, ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.NOOP_TRANSFORMER)));
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedList() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedList");
        final List<E> list = org.apache.commons.collections4.list.TransformedList.transformingList(new ArrayList<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2336,list,2335,list.size());
        final E[] els = ((E[])(new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            list.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2337,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2339,list,2338,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2341,list,2340,list.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2343,list,2342,list.contains(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2345,list,2344,list.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2347,list,2346,list.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        list.clear();
        for (int i = 0 ; i < (els.length) ; i++) {
            list.add(0, els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2348,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,list,2349,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,null,2351,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2354,list,2353,list.get(0));
        }
        list.set(0, ((E)("22")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2356,null,2355,java.lang.Integer.valueOf(22));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2358,list,2357,list.get(0));
        final ListIterator<E> it = list.listIterator();
        it.next();
        it.set(((E)("33")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2360,null,2359,java.lang.Integer.valueOf(33));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2362,list,2361,list.get(0));
        it.add(((E)("44")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2364,null,2363,java.lang.Integer.valueOf(44));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2366,list,2365,list.get(1));
        final List<E> adds = new ArrayList<E>();
        adds.add(((E)("1")));
        adds.add(((E)("2")));
        list.clear();
        list.addAll(adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2368,null,2367,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2370,list,2369,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2372,null,2371,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2374,list,2373,list.get(1));
        adds.clear();
        adds.add(((E)("3")));
        list.addAll(1, adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2376,null,2375,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2378,list,2377,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2380,null,2379,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2382,list,2381,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2384,null,2383,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2386,list,2385,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedList_literalMutation846() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedList_literalMutation846");
        final List<E> list = org.apache.commons.collections4.list.TransformedList.transformingList(new ArrayList<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2336,list,2335,list.size());
        final E[] els = ((E[])(new Object[]{ "foo" , "3" , "5" , "7" , "2" , "4" , "6" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            list.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2337,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2339,list,2338,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2341,list,2340,list.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2343,list,2342,list.contains(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2345,list,2344,list.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2347,list,2346,list.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        list.clear();
        for (int i = 0 ; i < (els.length) ; i++) {
            list.add(0, els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2348,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,list,2349,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,null,2351,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2354,list,2353,list.get(0));
        }
        list.set(0, ((E)("22")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2356,null,2355,java.lang.Integer.valueOf(22));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2358,list,2357,list.get(0));
        final ListIterator<E> it = list.listIterator();
        it.next();
        it.set(((E)("33")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2360,null,2359,java.lang.Integer.valueOf(33));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2362,list,2361,list.get(0));
        it.add(((E)("44")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2364,null,2363,java.lang.Integer.valueOf(44));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2366,list,2365,list.get(1));
        final List<E> adds = new ArrayList<E>();
        adds.add(((E)("1")));
        adds.add(((E)("2")));
        list.clear();
        list.addAll(adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2368,null,2367,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2370,list,2369,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2372,null,2371,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2374,list,2373,list.get(1));
        adds.clear();
        adds.add(((E)("3")));
        list.addAll(1, adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2376,null,2375,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2378,list,2377,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2380,null,2379,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2382,list,2381,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2384,null,2383,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2386,list,2385,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedList_literalMutation847() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedList_literalMutation847");
        final List<E> list = org.apache.commons.collections4.list.TransformedList.transformingList(new ArrayList<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2336,list,2335,list.size());
        final E[] els = ((E[])(new Object[]{ "1" , "foo" , "5" , "7" , "2" , "4" , "6" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            list.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2337,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2339,list,2338,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2341,list,2340,list.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2343,list,2342,list.contains(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2345,list,2344,list.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2347,list,2346,list.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        list.clear();
        for (int i = 0 ; i < (els.length) ; i++) {
            list.add(0, els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2348,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,list,2349,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,null,2351,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2354,list,2353,list.get(0));
        }
        list.set(0, ((E)("22")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2356,null,2355,java.lang.Integer.valueOf(22));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2358,list,2357,list.get(0));
        final ListIterator<E> it = list.listIterator();
        it.next();
        it.set(((E)("33")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2360,null,2359,java.lang.Integer.valueOf(33));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2362,list,2361,list.get(0));
        it.add(((E)("44")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2364,null,2363,java.lang.Integer.valueOf(44));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2366,list,2365,list.get(1));
        final List<E> adds = new ArrayList<E>();
        adds.add(((E)("1")));
        adds.add(((E)("2")));
        list.clear();
        list.addAll(adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2368,null,2367,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2370,list,2369,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2372,null,2371,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2374,list,2373,list.get(1));
        adds.clear();
        adds.add(((E)("3")));
        list.addAll(1, adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2376,null,2375,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2378,list,2377,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2380,null,2379,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2382,list,2381,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2384,null,2383,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2386,list,2385,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedList_literalMutation848() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedList_literalMutation848");
        final List<E> list = org.apache.commons.collections4.list.TransformedList.transformingList(new ArrayList<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2336,list,2335,list.size());
        final E[] els = ((E[])(new Object[]{ "1" , "3" , "foo" , "7" , "2" , "4" , "6" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            list.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2337,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2339,list,2338,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2341,list,2340,list.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2343,list,2342,list.contains(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2345,list,2344,list.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2347,list,2346,list.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        list.clear();
        for (int i = 0 ; i < (els.length) ; i++) {
            list.add(0, els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2348,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,list,2349,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,null,2351,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2354,list,2353,list.get(0));
        }
        list.set(0, ((E)("22")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2356,null,2355,java.lang.Integer.valueOf(22));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2358,list,2357,list.get(0));
        final ListIterator<E> it = list.listIterator();
        it.next();
        it.set(((E)("33")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2360,null,2359,java.lang.Integer.valueOf(33));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2362,list,2361,list.get(0));
        it.add(((E)("44")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2364,null,2363,java.lang.Integer.valueOf(44));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2366,list,2365,list.get(1));
        final List<E> adds = new ArrayList<E>();
        adds.add(((E)("1")));
        adds.add(((E)("2")));
        list.clear();
        list.addAll(adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2368,null,2367,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2370,list,2369,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2372,null,2371,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2374,list,2373,list.get(1));
        adds.clear();
        adds.add(((E)("3")));
        list.addAll(1, adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2376,null,2375,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2378,list,2377,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2380,null,2379,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2382,list,2381,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2384,null,2383,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2386,list,2385,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedList_literalMutation849() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedList_literalMutation849");
        final List<E> list = org.apache.commons.collections4.list.TransformedList.transformingList(new ArrayList<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2336,list,2335,list.size());
        final E[] els = ((E[])(new Object[]{ "1" , "3" , "5" , "foo" , "2" , "4" , "6" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            list.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2337,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2339,list,2338,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2341,list,2340,list.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2343,list,2342,list.contains(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2345,list,2344,list.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2347,list,2346,list.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        list.clear();
        for (int i = 0 ; i < (els.length) ; i++) {
            list.add(0, els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2348,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,list,2349,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,null,2351,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2354,list,2353,list.get(0));
        }
        list.set(0, ((E)("22")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2356,null,2355,java.lang.Integer.valueOf(22));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2358,list,2357,list.get(0));
        final ListIterator<E> it = list.listIterator();
        it.next();
        it.set(((E)("33")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2360,null,2359,java.lang.Integer.valueOf(33));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2362,list,2361,list.get(0));
        it.add(((E)("44")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2364,null,2363,java.lang.Integer.valueOf(44));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2366,list,2365,list.get(1));
        final List<E> adds = new ArrayList<E>();
        adds.add(((E)("1")));
        adds.add(((E)("2")));
        list.clear();
        list.addAll(adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2368,null,2367,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2370,list,2369,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2372,null,2371,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2374,list,2373,list.get(1));
        adds.clear();
        adds.add(((E)("3")));
        list.addAll(1, adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2376,null,2375,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2378,list,2377,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2380,null,2379,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2382,list,2381,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2384,null,2383,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2386,list,2385,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedList_literalMutation850() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedList_literalMutation850");
        final List<E> list = org.apache.commons.collections4.list.TransformedList.transformingList(new ArrayList<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2336,list,2335,list.size());
        final E[] els = ((E[])(new Object[]{ "1" , "3" , "5" , "7" , "foo" , "4" , "6" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            list.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2337,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2339,list,2338,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2341,list,2340,list.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2343,list,2342,list.contains(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2345,list,2344,list.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2347,list,2346,list.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        list.clear();
        for (int i = 0 ; i < (els.length) ; i++) {
            list.add(0, els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2348,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,list,2349,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,null,2351,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2354,list,2353,list.get(0));
        }
        list.set(0, ((E)("22")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2356,null,2355,java.lang.Integer.valueOf(22));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2358,list,2357,list.get(0));
        final ListIterator<E> it = list.listIterator();
        it.next();
        it.set(((E)("33")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2360,null,2359,java.lang.Integer.valueOf(33));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2362,list,2361,list.get(0));
        it.add(((E)("44")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2364,null,2363,java.lang.Integer.valueOf(44));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2366,list,2365,list.get(1));
        final List<E> adds = new ArrayList<E>();
        adds.add(((E)("1")));
        adds.add(((E)("2")));
        list.clear();
        list.addAll(adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2368,null,2367,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2370,list,2369,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2372,null,2371,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2374,list,2373,list.get(1));
        adds.clear();
        adds.add(((E)("3")));
        list.addAll(1, adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2376,null,2375,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2378,list,2377,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2380,null,2379,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2382,list,2381,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2384,null,2383,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2386,list,2385,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedList_literalMutation851() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedList_literalMutation851");
        final List<E> list = org.apache.commons.collections4.list.TransformedList.transformingList(new ArrayList<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2336,list,2335,list.size());
        final E[] els = ((E[])(new Object[]{ "1" , "3" , "5" , "7" , "2" , "foo" , "6" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            list.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2337,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2339,list,2338,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2341,list,2340,list.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2343,list,2342,list.contains(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2345,list,2344,list.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2347,list,2346,list.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        list.clear();
        for (int i = 0 ; i < (els.length) ; i++) {
            list.add(0, els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2348,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,list,2349,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,null,2351,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2354,list,2353,list.get(0));
        }
        list.set(0, ((E)("22")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2356,null,2355,java.lang.Integer.valueOf(22));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2358,list,2357,list.get(0));
        final ListIterator<E> it = list.listIterator();
        it.next();
        it.set(((E)("33")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2360,null,2359,java.lang.Integer.valueOf(33));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2362,list,2361,list.get(0));
        it.add(((E)("44")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2364,null,2363,java.lang.Integer.valueOf(44));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2366,list,2365,list.get(1));
        final List<E> adds = new ArrayList<E>();
        adds.add(((E)("1")));
        adds.add(((E)("2")));
        list.clear();
        list.addAll(adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2368,null,2367,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2370,list,2369,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2372,null,2371,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2374,list,2373,list.get(1));
        adds.clear();
        adds.add(((E)("3")));
        list.addAll(1, adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2376,null,2375,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2378,list,2377,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2380,null,2379,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2382,list,2381,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2384,null,2383,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2386,list,2385,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedList_literalMutation852() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedList_literalMutation852");
        final List<E> list = org.apache.commons.collections4.list.TransformedList.transformingList(new ArrayList<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2336,list,2335,list.size());
        final E[] els = ((E[])(new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "foo" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            list.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2337,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2339,list,2338,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2341,list,2340,list.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2343,list,2342,list.contains(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2345,list,2344,list.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2347,list,2346,list.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        list.clear();
        for (int i = 0 ; i < (els.length) ; i++) {
            list.add(0, els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2348,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,list,2349,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,null,2351,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2354,list,2353,list.get(0));
        }
        list.set(0, ((E)("22")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2356,null,2355,java.lang.Integer.valueOf(22));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2358,list,2357,list.get(0));
        final ListIterator<E> it = list.listIterator();
        it.next();
        it.set(((E)("33")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2360,null,2359,java.lang.Integer.valueOf(33));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2362,list,2361,list.get(0));
        it.add(((E)("44")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2364,null,2363,java.lang.Integer.valueOf(44));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2366,list,2365,list.get(1));
        final List<E> adds = new ArrayList<E>();
        adds.add(((E)("1")));
        adds.add(((E)("2")));
        list.clear();
        list.addAll(adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2368,null,2367,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2370,list,2369,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2372,null,2371,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2374,list,2373,list.get(1));
        adds.clear();
        adds.add(((E)("3")));
        list.addAll(1, adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2376,null,2375,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2378,list,2377,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2380,null,2379,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2382,list,2381,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2384,null,2383,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2386,list,2385,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedList_literalMutation853() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedList_literalMutation853");
        final List<E> list = org.apache.commons.collections4.list.TransformedList.transformingList(new ArrayList<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2336,list,2335,list.size());
        final E[] els = ((E[])(new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" }));
        for (int i = 1 ; i < (els.length) ; i++) {
            list.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2337,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2339,list,2338,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2341,list,2340,list.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2343,list,2342,list.contains(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2345,list,2344,list.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2347,list,2346,list.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        list.clear();
        for (int i = 0 ; i < (els.length) ; i++) {
            list.add(0, els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2348,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,list,2349,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,null,2351,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2354,list,2353,list.get(0));
        }
        list.set(0, ((E)("22")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2356,null,2355,java.lang.Integer.valueOf(22));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2358,list,2357,list.get(0));
        final ListIterator<E> it = list.listIterator();
        it.next();
        it.set(((E)("33")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2360,null,2359,java.lang.Integer.valueOf(33));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2362,list,2361,list.get(0));
        it.add(((E)("44")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2364,null,2363,java.lang.Integer.valueOf(44));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2366,list,2365,list.get(1));
        final List<E> adds = new ArrayList<E>();
        adds.add(((E)("1")));
        adds.add(((E)("2")));
        list.clear();
        list.addAll(adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2368,null,2367,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2370,list,2369,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2372,null,2371,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2374,list,2373,list.get(1));
        adds.clear();
        adds.add(((E)("3")));
        list.addAll(1, adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2376,null,2375,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2378,list,2377,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2380,null,2379,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2382,list,2381,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2384,null,2383,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2386,list,2385,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedList_literalMutation854() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedList_literalMutation854");
        final List<E> list = org.apache.commons.collections4.list.TransformedList.transformingList(new ArrayList<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2336,list,2335,list.size());
        final E[] els = ((E[])(new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            list.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2337,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2339,list,2338,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2341,list,2340,list.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2343,list,2342,list.contains(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2345,list,2344,list.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2347,list,2346,list.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        list.clear();
        for (int i = 1 ; i < (els.length) ; i++) {
            list.add(0, els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2348,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,list,2349,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,null,2351,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2354,list,2353,list.get(0));
        }
        list.set(0, ((E)("22")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2356,null,2355,java.lang.Integer.valueOf(22));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2358,list,2357,list.get(0));
        final ListIterator<E> it = list.listIterator();
        it.next();
        it.set(((E)("33")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2360,null,2359,java.lang.Integer.valueOf(33));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2362,list,2361,list.get(0));
        it.add(((E)("44")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2364,null,2363,java.lang.Integer.valueOf(44));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2366,list,2365,list.get(1));
        final List<E> adds = new ArrayList<E>();
        adds.add(((E)("1")));
        adds.add(((E)("2")));
        list.clear();
        list.addAll(adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2368,null,2367,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2370,list,2369,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2372,null,2371,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2374,list,2373,list.get(1));
        adds.clear();
        adds.add(((E)("3")));
        list.addAll(1, adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2376,null,2375,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2378,list,2377,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2380,null,2379,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2382,list,2381,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2384,null,2383,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2386,list,2385,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedList_literalMutation855() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedList_literalMutation855");
        final List<E> list = org.apache.commons.collections4.list.TransformedList.transformingList(new ArrayList<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2336,list,2335,list.size());
        final E[] els = ((E[])(new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            list.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2337,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2339,list,2338,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2341,list,2340,list.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2343,list,2342,list.contains(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2345,list,2344,list.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2347,list,2346,list.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        list.clear();
        for (int i = 0 ; i < (els.length) ; i++) {
            list.add(1, els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2348,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,list,2349,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,null,2351,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2354,list,2353,list.get(0));
        }
        list.set(0, ((E)("22")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2356,null,2355,java.lang.Integer.valueOf(22));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2358,list,2357,list.get(0));
        final ListIterator<E> it = list.listIterator();
        it.next();
        it.set(((E)("33")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2360,null,2359,java.lang.Integer.valueOf(33));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2362,list,2361,list.get(0));
        it.add(((E)("44")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2364,null,2363,java.lang.Integer.valueOf(44));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2366,list,2365,list.get(1));
        final List<E> adds = new ArrayList<E>();
        adds.add(((E)("1")));
        adds.add(((E)("2")));
        list.clear();
        list.addAll(adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2368,null,2367,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2370,list,2369,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2372,null,2371,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2374,list,2373,list.get(1));
        adds.clear();
        adds.add(((E)("3")));
        list.addAll(1, adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2376,null,2375,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2378,list,2377,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2380,null,2379,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2382,list,2381,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2384,null,2383,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2386,list,2385,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedList_literalMutation856() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedList_literalMutation856");
        final List<E> list = org.apache.commons.collections4.list.TransformedList.transformingList(new ArrayList<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2336,list,2335,list.size());
        final E[] els = ((E[])(new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            list.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2337,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2339,list,2338,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2341,list,2340,list.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2343,list,2342,list.contains(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2345,list,2344,list.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2347,list,2346,list.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        list.clear();
        for (int i = 0 ; i < (els.length) ; i++) {
            list.add(0, els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2348,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,list,2349,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,null,2351,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2354,list,2353,list.get(0));
        }
        list.set(1, ((E)("22")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2356,null,2355,java.lang.Integer.valueOf(22));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2358,list,2357,list.get(0));
        final ListIterator<E> it = list.listIterator();
        it.next();
        it.set(((E)("33")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2360,null,2359,java.lang.Integer.valueOf(33));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2362,list,2361,list.get(0));
        it.add(((E)("44")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2364,null,2363,java.lang.Integer.valueOf(44));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2366,list,2365,list.get(1));
        final List<E> adds = new ArrayList<E>();
        adds.add(((E)("1")));
        adds.add(((E)("2")));
        list.clear();
        list.addAll(adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2368,null,2367,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2370,list,2369,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2372,null,2371,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2374,list,2373,list.get(1));
        adds.clear();
        adds.add(((E)("3")));
        list.addAll(1, adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2376,null,2375,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2378,list,2377,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2380,null,2379,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2382,list,2381,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2384,null,2383,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2386,list,2385,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedList_literalMutation857() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedList_literalMutation857");
        final List<E> list = org.apache.commons.collections4.list.TransformedList.transformingList(new ArrayList<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2336,list,2335,list.size());
        final E[] els = ((E[])(new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            list.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2337,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2339,list,2338,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2341,list,2340,list.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2343,list,2342,list.contains(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2345,list,2344,list.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2347,list,2346,list.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        list.clear();
        for (int i = 0 ; i < (els.length) ; i++) {
            list.add(0, els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2348,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,list,2349,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,null,2351,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2354,list,2353,list.get(0));
        }
        list.set(0, ((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2356,null,2355,java.lang.Integer.valueOf(22));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2358,list,2357,list.get(0));
        final ListIterator<E> it = list.listIterator();
        it.next();
        it.set(((E)("33")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2360,null,2359,java.lang.Integer.valueOf(33));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2362,list,2361,list.get(0));
        it.add(((E)("44")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2364,null,2363,java.lang.Integer.valueOf(44));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2366,list,2365,list.get(1));
        final List<E> adds = new ArrayList<E>();
        adds.add(((E)("1")));
        adds.add(((E)("2")));
        list.clear();
        list.addAll(adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2368,null,2367,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2370,list,2369,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2372,null,2371,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2374,list,2373,list.get(1));
        adds.clear();
        adds.add(((E)("3")));
        list.addAll(1, adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2376,null,2375,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2378,list,2377,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2380,null,2379,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2382,list,2381,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2384,null,2383,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2386,list,2385,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedList_literalMutation858() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedList_literalMutation858");
        final List<E> list = org.apache.commons.collections4.list.TransformedList.transformingList(new ArrayList<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2336,list,2335,list.size());
        final E[] els = ((E[])(new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            list.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2337,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2339,list,2338,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2341,list,2340,list.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2343,list,2342,list.contains(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2345,list,2344,list.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2347,list,2346,list.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        list.clear();
        for (int i = 0 ; i < (els.length) ; i++) {
            list.add(0, els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2348,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,list,2349,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,null,2351,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2354,list,2353,list.get(0));
        }
        list.set(0, ((E)("22")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2356,null,2355,java.lang.Integer.valueOf(22));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2358,list,2357,list.get(0));
        final ListIterator<E> it = list.listIterator();
        it.next();
        it.set(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2360,null,2359,java.lang.Integer.valueOf(33));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2362,list,2361,list.get(0));
        it.add(((E)("44")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2364,null,2363,java.lang.Integer.valueOf(44));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2366,list,2365,list.get(1));
        final List<E> adds = new ArrayList<E>();
        adds.add(((E)("1")));
        adds.add(((E)("2")));
        list.clear();
        list.addAll(adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2368,null,2367,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2370,list,2369,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2372,null,2371,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2374,list,2373,list.get(1));
        adds.clear();
        adds.add(((E)("3")));
        list.addAll(1, adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2376,null,2375,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2378,list,2377,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2380,null,2379,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2382,list,2381,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2384,null,2383,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2386,list,2385,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedList_literalMutation859() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedList_literalMutation859");
        final List<E> list = org.apache.commons.collections4.list.TransformedList.transformingList(new ArrayList<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2336,list,2335,list.size());
        final E[] els = ((E[])(new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            list.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2337,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2339,list,2338,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2341,list,2340,list.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2343,list,2342,list.contains(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2345,list,2344,list.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2347,list,2346,list.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        list.clear();
        for (int i = 0 ; i < (els.length) ; i++) {
            list.add(0, els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2348,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,list,2349,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,null,2351,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2354,list,2353,list.get(0));
        }
        list.set(0, ((E)("22")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2356,null,2355,java.lang.Integer.valueOf(22));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2358,list,2357,list.get(0));
        final ListIterator<E> it = list.listIterator();
        it.next();
        it.set(((E)("33")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2360,null,2359,java.lang.Integer.valueOf(33));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2362,list,2361,list.get(0));
        it.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2364,null,2363,java.lang.Integer.valueOf(44));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2366,list,2365,list.get(1));
        final List<E> adds = new ArrayList<E>();
        adds.add(((E)("1")));
        adds.add(((E)("2")));
        list.clear();
        list.addAll(adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2368,null,2367,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2370,list,2369,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2372,null,2371,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2374,list,2373,list.get(1));
        adds.clear();
        adds.add(((E)("3")));
        list.addAll(1, adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2376,null,2375,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2378,list,2377,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2380,null,2379,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2382,list,2381,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2384,null,2383,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2386,list,2385,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedList_literalMutation860() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedList_literalMutation860");
        final List<E> list = org.apache.commons.collections4.list.TransformedList.transformingList(new ArrayList<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2336,list,2335,list.size());
        final E[] els = ((E[])(new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            list.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2337,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2339,list,2338,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2341,list,2340,list.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2343,list,2342,list.contains(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2345,list,2344,list.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2347,list,2346,list.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        list.clear();
        for (int i = 0 ; i < (els.length) ; i++) {
            list.add(0, els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2348,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,list,2349,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,null,2351,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2354,list,2353,list.get(0));
        }
        list.set(0, ((E)("22")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2356,null,2355,java.lang.Integer.valueOf(22));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2358,list,2357,list.get(0));
        final ListIterator<E> it = list.listIterator();
        it.next();
        it.set(((E)("33")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2360,null,2359,java.lang.Integer.valueOf(33));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2362,list,2361,list.get(0));
        it.add(((E)("44")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2364,null,2363,java.lang.Integer.valueOf(44));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2366,list,2365,list.get(1));
        final List<E> adds = new ArrayList<E>();
        adds.add(((E)("foo")));
        adds.add(((E)("2")));
        list.clear();
        list.addAll(adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2368,null,2367,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2370,list,2369,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2372,null,2371,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2374,list,2373,list.get(1));
        adds.clear();
        adds.add(((E)("3")));
        list.addAll(1, adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2376,null,2375,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2378,list,2377,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2380,null,2379,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2382,list,2381,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2384,null,2383,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2386,list,2385,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedList_literalMutation861() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedList_literalMutation861");
        final List<E> list = org.apache.commons.collections4.list.TransformedList.transformingList(new ArrayList<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2336,list,2335,list.size());
        final E[] els = ((E[])(new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            list.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2337,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2339,list,2338,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2341,list,2340,list.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2343,list,2342,list.contains(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2345,list,2344,list.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2347,list,2346,list.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        list.clear();
        for (int i = 0 ; i < (els.length) ; i++) {
            list.add(0, els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2348,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,list,2349,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,null,2351,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2354,list,2353,list.get(0));
        }
        list.set(0, ((E)("22")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2356,null,2355,java.lang.Integer.valueOf(22));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2358,list,2357,list.get(0));
        final ListIterator<E> it = list.listIterator();
        it.next();
        it.set(((E)("33")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2360,null,2359,java.lang.Integer.valueOf(33));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2362,list,2361,list.get(0));
        it.add(((E)("44")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2364,null,2363,java.lang.Integer.valueOf(44));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2366,list,2365,list.get(1));
        final List<E> adds = new ArrayList<E>();
        adds.add(((E)("1")));
        adds.add(((E)("foo")));
        list.clear();
        list.addAll(adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2368,null,2367,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2370,list,2369,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2372,null,2371,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2374,list,2373,list.get(1));
        adds.clear();
        adds.add(((E)("3")));
        list.addAll(1, adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2376,null,2375,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2378,list,2377,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2380,null,2379,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2382,list,2381,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2384,null,2383,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2386,list,2385,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedList_literalMutation862() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedList_literalMutation862");
        final List<E> list = org.apache.commons.collections4.list.TransformedList.transformingList(new ArrayList<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2336,list,2335,list.size());
        final E[] els = ((E[])(new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            list.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2337,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2339,list,2338,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2341,list,2340,list.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2343,list,2342,list.contains(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2345,list,2344,list.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2347,list,2346,list.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        list.clear();
        for (int i = 0 ; i < (els.length) ; i++) {
            list.add(0, els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2348,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,list,2349,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,null,2351,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2354,list,2353,list.get(0));
        }
        list.set(0, ((E)("22")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2356,null,2355,java.lang.Integer.valueOf(22));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2358,list,2357,list.get(0));
        final ListIterator<E> it = list.listIterator();
        it.next();
        it.set(((E)("33")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2360,null,2359,java.lang.Integer.valueOf(33));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2362,list,2361,list.get(0));
        it.add(((E)("44")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2364,null,2363,java.lang.Integer.valueOf(44));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2366,list,2365,list.get(1));
        final List<E> adds = new ArrayList<E>();
        adds.add(((E)("1")));
        adds.add(((E)("2")));
        list.clear();
        list.addAll(adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2368,null,2367,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2370,list,2369,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2372,null,2371,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2374,list,2373,list.get(1));
        adds.clear();
        adds.add(((E)("foo")));
        list.addAll(1, adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2376,null,2375,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2378,list,2377,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2380,null,2379,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2382,list,2381,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2384,null,2383,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2386,list,2385,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedList_literalMutation863() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedList_literalMutation863");
        final List<E> list = org.apache.commons.collections4.list.TransformedList.transformingList(new ArrayList<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2336,list,2335,list.size());
        final E[] els = ((E[])(new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            list.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2337,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2339,list,2338,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2341,list,2340,list.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2343,list,2342,list.contains(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2345,list,2344,list.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2347,list,2346,list.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        list.clear();
        for (int i = 0 ; i < (els.length) ; i++) {
            list.add(0, els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2348,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,list,2349,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,null,2351,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2354,list,2353,list.get(0));
        }
        list.set(0, ((E)("22")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2356,null,2355,java.lang.Integer.valueOf(22));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2358,list,2357,list.get(0));
        final ListIterator<E> it = list.listIterator();
        it.next();
        it.set(((E)("33")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2360,null,2359,java.lang.Integer.valueOf(33));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2362,list,2361,list.get(0));
        it.add(((E)("44")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2364,null,2363,java.lang.Integer.valueOf(44));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2366,list,2365,list.get(1));
        final List<E> adds = new ArrayList<E>();
        adds.add(((E)("1")));
        adds.add(((E)("2")));
        list.clear();
        list.addAll(adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2368,null,2367,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2370,list,2369,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2372,null,2371,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2374,list,2373,list.get(1));
        adds.clear();
        adds.add(((E)("3")));
        list.addAll(2, adds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2376,null,2375,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2378,list,2377,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2380,null,2379,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2382,list,2381,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2384,null,2383,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2386,list,2385,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedList_decorateTransform() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedList_decorateTransform");
        final List<java.lang.Object> originalList = new ArrayList<java.lang.Object>();
        final Object[] els = new Object[]{ "foo" , "3" , "5" , "7" , "2" , "4" , "6" };
        for (final Object el : els) {
            originalList.add(el);
        }
        final List<?> list = org.apache.commons.collections4.list.TransformedList.transformedList(originalList, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2324,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2326,list,2325,list.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2328,list,2327,list.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2330,list,2329,list.contains(el));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2332,list,2331,list.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2334,list,2333,list.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedList_decorateTransform_literalMutation865() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedList_decorateTransform_literalMutation865");
        final List<java.lang.Object> originalList = new ArrayList<java.lang.Object>();
        final Object[] els = new Object[]{ "1" , "foo" , "5" , "7" , "2" , "4" , "6" };
        for (final Object el : els) {
            originalList.add(el);
        }
        final List<?> list = org.apache.commons.collections4.list.TransformedList.transformedList(originalList, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2324,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2326,list,2325,list.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2328,list,2327,list.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2330,list,2329,list.contains(el));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2332,list,2331,list.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2334,list,2333,list.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedList_decorateTransform_literalMutation866() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedList_decorateTransform_literalMutation866");
        final List<java.lang.Object> originalList = new ArrayList<java.lang.Object>();
        final Object[] els = new Object[]{ "1" , "3" , "foo" , "7" , "2" , "4" , "6" };
        for (final Object el : els) {
            originalList.add(el);
        }
        final List<?> list = org.apache.commons.collections4.list.TransformedList.transformedList(originalList, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2324,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2326,list,2325,list.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2328,list,2327,list.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2330,list,2329,list.contains(el));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2332,list,2331,list.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2334,list,2333,list.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedList_decorateTransform_literalMutation867() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedList_decorateTransform_literalMutation867");
        final List<java.lang.Object> originalList = new ArrayList<java.lang.Object>();
        final Object[] els = new Object[]{ "1" , "3" , "5" , "foo" , "2" , "4" , "6" };
        for (final Object el : els) {
            originalList.add(el);
        }
        final List<?> list = org.apache.commons.collections4.list.TransformedList.transformedList(originalList, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2324,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2326,list,2325,list.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2328,list,2327,list.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2330,list,2329,list.contains(el));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2332,list,2331,list.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2334,list,2333,list.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedList_decorateTransform_literalMutation868() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedList_decorateTransform_literalMutation868");
        final List<java.lang.Object> originalList = new ArrayList<java.lang.Object>();
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "foo" , "4" , "6" };
        for (final Object el : els) {
            originalList.add(el);
        }
        final List<?> list = org.apache.commons.collections4.list.TransformedList.transformedList(originalList, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2324,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2326,list,2325,list.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2328,list,2327,list.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2330,list,2329,list.contains(el));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2332,list,2331,list.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2334,list,2333,list.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedList_decorateTransform_literalMutation869() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedList_decorateTransform_literalMutation869");
        final List<java.lang.Object> originalList = new ArrayList<java.lang.Object>();
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "foo" , "6" };
        for (final Object el : els) {
            originalList.add(el);
        }
        final List<?> list = org.apache.commons.collections4.list.TransformedList.transformedList(originalList, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2324,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2326,list,2325,list.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2328,list,2327,list.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2330,list,2329,list.contains(el));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2332,list,2331,list.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2334,list,2333,list.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedList_decorateTransform_literalMutation870() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedList_decorateTransform_literalMutation870");
        final List<java.lang.Object> originalList = new ArrayList<java.lang.Object>();
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "foo" };
        for (final Object el : els) {
            originalList.add(el);
        }
        final List<?> list = org.apache.commons.collections4.list.TransformedList.transformedList(originalList, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2324,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2326,list,2325,list.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2328,list,2327,list.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2330,list,2329,list.contains(el));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2332,list,2331,list.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2334,list,2333,list.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}


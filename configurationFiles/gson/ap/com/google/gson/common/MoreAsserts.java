package com.google.gson.common;

import java.util.Collection;

/** 
 * Handy asserts that we wish were present in {@link Assert}
 * so that we didn't have to write them.
 * 
 * @author Inderjeet Singh
 */
public class MoreAsserts {
    public static void assertEquals(int[] expected, int[] target) {
        if (expected == null) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),891,target);
        } 
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),892,expected.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),893,target.length);
        for (int i = 0 ; i < (expected.length) ; ++i) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),894,expected[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),895,target[i]);
        }
    }

    public static void assertEquals(Integer[] expected, Integer[] target) {
        if (expected == null) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),896,target);
        } 
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),897,expected.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),898,target.length);
        for (int i = 0 ; i < (expected.length) ; ++i) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),899,expected[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),900,target[i]);
        }
    }

    /** 
     * Asserts that the specified {@code value} is not present in {@code collection}
     * @param collection the collection to look into
     * @param value the value that needs to be checked for presence
     */
public static <T>void assertContains(Collection<T> collection, T value) {
        for (T entry : collection) {
            if (entry.equals(value)) {
                return ;
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),890,((value + " not present in ") + collection));
    }

    public static void assertEqualsAndHashCode(Object a, Object b) {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),902,a,901,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),904,b,903,b.equals(a));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),906,a,905,a.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),908,b,907,b.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),910,a,909,a.equals(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),912,a,911,a.equals(new java.lang.Object()));
    }
}


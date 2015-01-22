package org.apache.commons.collections4.iterators;

import java.util.ArrayList;
import java.util.Collection;
import org.apache.commons.collections4.list.GrowthList;
import java.util.List;
import java.util.ListIterator;
import org.apache.commons.collections4.Predicate;
import java.util.Random;
import junit.framework.TestCase;

/** 
 * Tests the FilterListIterator class.
 * 
 * @version $Id$
 */
@SuppressWarnings(value = "boxing")
public class FilterListIteratorTest extends TestCase {
    private ArrayList<java.lang.Integer> list = null;

    private ArrayList<java.lang.Integer> odds = null;

    private ArrayList<java.lang.Integer> evens = null;

    private ArrayList<java.lang.Integer> threes = null;

    private ArrayList<java.lang.Integer> fours = null;

    private ArrayList<java.lang.Integer> sixes = null;

    private Predicate<java.lang.Integer> truePred = null;

    private Predicate<java.lang.Integer> falsePred = null;

    private Predicate<java.lang.Integer> evenPred = null;

    private Predicate<java.lang.Integer> oddPred = null;

    private Predicate<java.lang.Integer> threePred = null;

    private Predicate<java.lang.Integer> fourPred = null;

    private final Random random = new Random();

    @Override
    public void setUp() {
        list = new ArrayList<java.lang.Integer>();
        odds = new ArrayList<java.lang.Integer>();
        evens = new ArrayList<java.lang.Integer>();
        threes = new ArrayList<java.lang.Integer>();
        fours = new ArrayList<java.lang.Integer>();
        sixes = new ArrayList<java.lang.Integer>();
        for (int i = 0 ; i < 20 ; i++) {
            list.add(Integer.valueOf(i));
            if ((i % 2) == 0) {
                evens.add(Integer.valueOf(i));
            } 
            if ((i % 2) != 0) {
                odds.add(Integer.valueOf(i));
            } 
            if ((i % 3) == 0) {
                threes.add(Integer.valueOf(i));
            } 
            if ((i % 4) == 0) {
                fours.add(Integer.valueOf(i));
            } 
            if ((i % 6) == 0) {
                sixes.add(Integer.valueOf(i));
            } 
        }
        truePred = new Predicate<java.lang.Integer>() {
            public boolean evaluate(final Integer x) {
                return true;
            }
        };
        falsePred = new Predicate<java.lang.Integer>() {
            public boolean evaluate(final Integer x) {
                return true;
            }
        };
        evenPred = new Predicate<java.lang.Integer>() {
            public boolean evaluate(final Integer x) {
                return (x % 2) == 0;
            }
        };
        oddPred = new Predicate<java.lang.Integer>() {
            public boolean evaluate(final Integer x) {
                return (x % 2) != 0;
            }
        };
        threePred = new Predicate<java.lang.Integer>() {
            public boolean evaluate(final Integer x) {
                return (x % 3) == 0;
            }
        };
        fourPred = new Predicate<java.lang.Integer>() {
            public boolean evaluate(final Integer x) {
                return (x % 4) == 0;
            }
        };
    }

    @Override
    public void tearDown() throws Exception {
        list = null;
        odds = null;
        evens = null;
        threes = null;
        fours = null;
        sixes = null;
        truePred = null;
        falsePred = null;
        evenPred = null;
        oddPred = null;
        threePred = null;
        fourPred = null;
    }

    public void testWalkLists() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWalkLists");
        walkLists(list, list.listIterator());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testManual() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testManual");
        final FilterListIterator<java.lang.Integer> filtered = new FilterListIterator<java.lang.Integer>(list.listIterator() , threePred);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3172,null,3171,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3174,filtered,3173,filtered.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3176,null,3175,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3178,filtered,3177,filtered.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3180,null,3179,java.lang.Integer.valueOf(6));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3182,filtered,3181,filtered.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3184,null,3183,java.lang.Integer.valueOf(9));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3186,filtered,3185,filtered.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3188,null,3187,java.lang.Integer.valueOf(12));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3190,filtered,3189,filtered.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3192,null,3191,java.lang.Integer.valueOf(15));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3194,filtered,3193,filtered.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3196,null,3195,java.lang.Integer.valueOf(18));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3198,filtered,3197,filtered.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3200,null,3199,java.lang.Integer.valueOf(18));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3202,filtered,3201,filtered.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3204,null,3203,java.lang.Integer.valueOf(15));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3206,filtered,3205,filtered.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3208,null,3207,java.lang.Integer.valueOf(12));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3210,filtered,3209,filtered.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3212,null,3211,java.lang.Integer.valueOf(9));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3214,filtered,3213,filtered.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3216,null,3215,java.lang.Integer.valueOf(6));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3218,filtered,3217,filtered.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3220,null,3219,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3222,filtered,3221,filtered.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3224,null,3223,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3226,filtered,3225,filtered.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3227,!(filtered.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3229,null,3228,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3231,filtered,3230,filtered.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3233,null,3232,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3235,filtered,3234,filtered.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3237,null,3236,java.lang.Integer.valueOf(6));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3239,filtered,3238,filtered.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3241,null,3240,java.lang.Integer.valueOf(9));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3243,filtered,3242,filtered.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3245,null,3244,java.lang.Integer.valueOf(12));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3247,filtered,3246,filtered.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3249,null,3248,java.lang.Integer.valueOf(15));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3251,filtered,3250,filtered.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3253,null,3252,java.lang.Integer.valueOf(18));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3255,filtered,3254,filtered.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3256,!(filtered.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3258,null,3257,java.lang.Integer.valueOf(18));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3260,filtered,3259,filtered.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3262,null,3261,java.lang.Integer.valueOf(15));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3264,filtered,3263,filtered.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3266,null,3265,java.lang.Integer.valueOf(12));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3268,filtered,3267,filtered.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3270,null,3269,java.lang.Integer.valueOf(9));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3272,filtered,3271,filtered.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3274,null,3273,java.lang.Integer.valueOf(6));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3276,filtered,3275,filtered.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3278,null,3277,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3280,filtered,3279,filtered.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3282,null,3281,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3284,filtered,3283,filtered.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3286,null,3285,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3288,filtered,3287,filtered.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3290,null,3289,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3292,filtered,3291,filtered.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3294,null,3293,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3296,filtered,3295,filtered.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3298,null,3297,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3300,filtered,3299,filtered.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3302,null,3301,java.lang.Integer.valueOf(6));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3304,filtered,3303,filtered.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3306,null,3305,java.lang.Integer.valueOf(6));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3308,filtered,3307,filtered.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3310,null,3309,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3312,filtered,3311,filtered.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3314,null,3313,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3316,filtered,3315,filtered.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3318,null,3317,java.lang.Integer.valueOf(6));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3320,filtered,3319,filtered.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2902,null,2901,java.lang.Integer.valueOf(9));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3322,filtered,3321,filtered.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3324,null,3323,java.lang.Integer.valueOf(12));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3326,filtered,3325,filtered.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3328,null,3327,java.lang.Integer.valueOf(15));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3330,filtered,3329,filtered.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3332,null,3331,java.lang.Integer.valueOf(15));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3334,filtered,3333,filtered.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3336,null,3335,java.lang.Integer.valueOf(12));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3338,filtered,3337,filtered.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3340,null,3339,java.lang.Integer.valueOf(9));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3342,filtered,3341,filtered.previous());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTruePredicate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTruePredicate");
        final FilterListIterator<java.lang.Integer> filtered = new FilterListIterator<java.lang.Integer>(list.listIterator() , truePred);
        walkLists(list, filtered);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFalsePredicate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFalsePredicate");
        final FilterListIterator<java.lang.Integer> filtered = new FilterListIterator<java.lang.Integer>(list.listIterator() , falsePred);
        walkLists(new ArrayList<java.lang.Integer>(), filtered);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEvens() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEvens");
        final FilterListIterator<java.lang.Integer> filtered = new FilterListIterator<java.lang.Integer>(list.listIterator() , evenPred);
        walkLists(evens, filtered);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testOdds() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOdds");
        final FilterListIterator<java.lang.Integer> filtered = new FilterListIterator<java.lang.Integer>(list.listIterator() , oddPred);
        walkLists(odds, filtered);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testThrees() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testThrees");
        final FilterListIterator<java.lang.Integer> filtered = new FilterListIterator<java.lang.Integer>(list.listIterator() , threePred);
        walkLists(threes, filtered);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFours() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFours");
        final FilterListIterator<java.lang.Integer> filtered = new FilterListIterator<java.lang.Integer>(list.listIterator() , fourPred);
        walkLists(fours, filtered);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNestedSixes() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedSixes");
        final FilterListIterator<java.lang.Integer> filtered = new FilterListIterator<java.lang.Integer>(new FilterListIterator<java.lang.Integer>(list.listIterator() , threePred) , evenPred);
        walkLists(sixes, filtered);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNestedSixes2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedSixes2");
        final FilterListIterator<java.lang.Integer> filtered = new FilterListIterator<java.lang.Integer>(new FilterListIterator<java.lang.Integer>(list.listIterator() , evenPred) , threePred);
        walkLists(sixes, filtered);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNestedSixes3() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedSixes3");
        final FilterListIterator<java.lang.Integer> filtered = new FilterListIterator<java.lang.Integer>(new FilterListIterator<java.lang.Integer>(list.listIterator() , threePred) , evenPred);
        walkLists(sixes, new FilterListIterator<java.lang.Integer>(filtered , truePred));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNextChangesPrevious() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextChangesPrevious");
        {
            final FilterListIterator<java.lang.Integer> filtered = new FilterListIterator<java.lang.Integer>(list.listIterator() , threePred);
            nextNextPrevious(threes.listIterator(), filtered);
        }
        {
            final FilterListIterator<java.lang.Integer> filtered = new FilterListIterator<java.lang.Integer>(list.listIterator() , truePred);
            nextNextPrevious(list.listIterator(), filtered);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPreviousChangesNext() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPreviousChangesNext");
        {
            final FilterListIterator<java.lang.Integer> filtered = new FilterListIterator<java.lang.Integer>(list.listIterator() , threePred);
            final ListIterator<java.lang.Integer> expected = threes.listIterator();
            walkForward(expected, filtered);
            previousPreviousNext(expected, filtered);
        }
        {
            final FilterListIterator<java.lang.Integer> filtered = new FilterListIterator<java.lang.Integer>(list.listIterator() , truePred);
            final ListIterator<java.lang.Integer> expected = list.listIterator();
            walkForward(expected, filtered);
            previousPreviousNext(expected, filtered);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFailingHasNextBug() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailingHasNextBug");
        final FilterListIterator<java.lang.Integer> filtered = new FilterListIterator<java.lang.Integer>(list.listIterator() , fourPred);
        final ListIterator<java.lang.Integer> expected = fours.listIterator();
        while (expected.hasNext()) {
            expected.next();
            filtered.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3165,filtered,3164,filtered.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3166,!(filtered.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3168,expected,3167,expected.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3170,filtered,3169,filtered.previous());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link "https://issues.apache.org/jira/browse/COLLECTIONS-360 COLLECTIONS-360"}
     */
public void testCollections360() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollections360");
        final Collection<org.apache.commons.collections4.Predicate<java.lang.Object>> var7 = new GrowthList<org.apache.commons.collections4.Predicate<java.lang.Object>>();
        final Predicate<java.lang.Object> var9 = org.apache.commons.collections4.PredicateUtils.anyPredicate(var7);
        final FilterListIterator<java.lang.Object> var13 = new FilterListIterator<java.lang.Object>(var9);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3161,var13,3160,var13.hasNext());
        final FilterListIterator<java.lang.Object> var14 = new FilterListIterator<java.lang.Object>(var9);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3163,var14,3162,var14.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void walkForward(final ListIterator<?> expected, final ListIterator<?> testing) {
        while (expected.hasNext()) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3358,expected,3357,expected.nextIndex());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3360,testing,3359,testing.nextIndex());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3362,expected,3361,expected.previousIndex());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3364,testing,3363,testing.previousIndex());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3366,testing,3365,testing.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3368,expected,3367,expected.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3370,testing,3369,testing.next());
        }
    }

    private void walkBackward(final ListIterator<?> expected, final ListIterator<?> testing) {
        while (expected.hasPrevious()) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3344,expected,3343,expected.nextIndex());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3346,testing,3345,testing.nextIndex());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3348,expected,3347,expected.previousIndex());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3350,testing,3349,testing.previousIndex());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3352,testing,3351,testing.hasPrevious());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3354,expected,3353,expected.previous());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3356,testing,3355,testing.previous());
        }
    }

    private void nextNextPrevious(final ListIterator<?> expected, final ListIterator<?> testing) {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3131,expected,3130,expected.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3133,testing,3132,testing.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3135,expected,3134,expected.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3137,testing,3136,testing.hasPrevious());
        final Object expecteda = expected.next();
        final Object testinga = testing.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3138,expecteda);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3139,testinga);
        final Object expectedb = expected.previous();
        final Object testingb = testing.previous();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3140,expecteda);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3141,expectedb);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3142,testinga);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3143,testingb);
    }

    private void previousPreviousNext(final ListIterator<?> expected, final ListIterator<?> testing) {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3145,expected,3144,expected.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3147,testing,3146,testing.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3149,expected,3148,expected.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3151,testing,3150,testing.hasNext());
        final Object expecteda = expected.previous();
        final Object testinga = testing.previous();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3152,expecteda);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3153,testinga);
        final Object expectedb = expected.next();
        final Object testingb = testing.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3154,expecteda);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3155,testingb);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3156,expecteda);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3157,expectedb);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3158,testinga);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3159,testingb);
    }

    private <E>void walkLists(final List<E> list, final ListIterator<E> testing) {
        final ListIterator<E> expected = list.listIterator();
        walkForward(expected, testing);
        walkBackward(expected, testing);
        while (expected.hasNext()) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3017,expected,3016,expected.nextIndex());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3019,testing,3018,testing.nextIndex());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3021,expected,3020,expected.previousIndex());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3023,testing,3022,testing.previousIndex());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3025,testing,3024,testing.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3027,expected,3026,expected.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3029,testing,3028,testing.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3031,testing,3030,testing.hasPrevious());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3033,expected,3032,expected.previous());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3035,testing,3034,testing.previous());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3037,testing,3036,testing.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3039,expected,3038,expected.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3041,testing,3040,testing.next());
        }
        walkBackward(expected, testing);
        for (int i = 0 ; i < (list.size()) ; i++) {
            for (int j = 0 ; j < i ; j++) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3043,expected,3042,expected.nextIndex());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3045,testing,3044,testing.nextIndex());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3047,expected,3046,expected.previousIndex());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3049,testing,3048,testing.previousIndex());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3051,expected,3050,expected.hasNext());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3053,testing,3052,testing.hasNext());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3055,expected,3054,expected.next());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3057,testing,3056,testing.next());
            }
            for (int j = 0 ; j < (i / 2) ; j++) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3059,expected,3058,expected.nextIndex());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3061,testing,3060,testing.nextIndex());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3063,expected,3062,expected.previousIndex());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3065,testing,3064,testing.previousIndex());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3067,expected,3066,expected.hasPrevious());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3069,testing,3068,testing.hasPrevious());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3071,expected,3070,expected.previous());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3073,testing,3072,testing.previous());
            }
            for (int j = 0 ; j < (i / 2) ; j++) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3075,expected,3074,expected.nextIndex());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3077,testing,3076,testing.nextIndex());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3079,expected,3078,expected.previousIndex());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3081,testing,3080,testing.previousIndex());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3083,expected,3082,expected.hasNext());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3085,testing,3084,testing.hasNext());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3087,expected,3086,expected.next());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3089,testing,3088,testing.next());
            }
            for (int j = 0 ; j < i ; j++) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3091,expected,3090,expected.nextIndex());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3093,testing,3092,testing.nextIndex());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3095,expected,3094,expected.previousIndex());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3097,testing,3096,testing.previousIndex());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3099,expected,3098,expected.hasPrevious());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3101,testing,3100,testing.hasPrevious());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3103,expected,3102,expected.previous());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3105,testing,3104,testing.previous());
            }
        }
        final StringBuilder walkdescr = new StringBuilder(500);
        for (int i = 0 ; i < 500 ; i++) {
            if (random.nextBoolean()) {
                walkdescr.append("+");
                if (expected.hasNext()) {
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3107,walkdescr,3106,walkdescr.toString());
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3109,expected,3108,expected.next());
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3111,testing,3110,testing.next());
                } 
            } else {
                walkdescr.append("-");
                if (expected.hasPrevious()) {
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3113,walkdescr,3112,walkdescr.toString());
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3115,expected,3114,expected.previous());
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3117,testing,3116,testing.previous());
                } 
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3119,walkdescr,3118,walkdescr.toString());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3121,expected,3120,expected.nextIndex());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3123,testing,3122,testing.nextIndex());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3125,walkdescr,3124,walkdescr.toString());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3127,expected,3126,expected.previousIndex());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3129,testing,3128,testing.previousIndex());
        }
    }
}


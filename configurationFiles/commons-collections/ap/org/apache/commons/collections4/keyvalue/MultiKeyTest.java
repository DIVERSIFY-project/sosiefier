package org.apache.commons.collections4.keyvalue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.io.IOException;
import java.util.Map;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * Unit tests for {@link org.apache.commons.collections4.keyvalue.MultiKey}.
 * 
 * @version $Id$
 */
public class MultiKeyTest extends TestCase {
    Integer ONE = Integer.valueOf(1);

    Integer TWO = Integer.valueOf(2);

    Integer THREE = Integer.valueOf(3);

    Integer FOUR = Integer.valueOf(4);

    Integer FIVE = Integer.valueOf(5);

    @Override
    public void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testConstructors() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructors");
        MultiKey<java.lang.Integer> mk;
        mk = new MultiKey<java.lang.Integer>(ONE , TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2443,null,2442,java.util.Arrays.equals(new java.lang.Object[]{ ONE , TWO }, mk.getKeys()));
        mk = new MultiKey<java.lang.Integer>(ONE , TWO , THREE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2445,null,2444,java.util.Arrays.equals(new java.lang.Object[]{ ONE , TWO , THREE }, mk.getKeys()));
        mk = new MultiKey<java.lang.Integer>(ONE , TWO , THREE , FOUR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2447,null,2446,java.util.Arrays.equals(new java.lang.Object[]{ ONE , TWO , THREE , FOUR }, mk.getKeys()));
        mk = new MultiKey<java.lang.Integer>(ONE , TWO , THREE , FOUR , FIVE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2449,null,2448,java.util.Arrays.equals(new java.lang.Object[]{ ONE , TWO , THREE , FOUR , FIVE }, mk.getKeys()));
        mk = new MultiKey<java.lang.Integer>(new Integer[]{ THREE , FOUR , ONE , TWO } , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2451,null,2450,java.util.Arrays.equals(new java.lang.Object[]{ THREE , FOUR , ONE , TWO }, mk.getKeys()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testConstructors_literalMutation898() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructors_literalMutation898");
        MultiKey<java.lang.Integer> mk;
        mk = new MultiKey<java.lang.Integer>(ONE , TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2443,null,2442,java.util.Arrays.equals(new java.lang.Object[]{ ONE , TWO }, mk.getKeys()));
        mk = new MultiKey<java.lang.Integer>(ONE , TWO , THREE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2445,null,2444,java.util.Arrays.equals(new java.lang.Object[]{ ONE , TWO , THREE }, mk.getKeys()));
        mk = new MultiKey<java.lang.Integer>(ONE , TWO , THREE , FOUR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2447,null,2446,java.util.Arrays.equals(new java.lang.Object[]{ ONE , TWO , THREE , FOUR }, mk.getKeys()));
        mk = new MultiKey<java.lang.Integer>(ONE , TWO , THREE , FOUR , FIVE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2449,null,2448,java.util.Arrays.equals(new java.lang.Object[]{ ONE , TWO , THREE , FOUR , FIVE }, mk.getKeys()));
        mk = new MultiKey<java.lang.Integer>(new Integer[]{ THREE , FOUR , ONE , TWO } , true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2451,null,2450,java.util.Arrays.equals(new java.lang.Object[]{ THREE , FOUR , ONE , TWO }, mk.getKeys()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testConstructorsByArray() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructorsByArray");
        MultiKey<java.lang.Integer> mk;
        Integer[] keys = new Integer[]{ THREE , FOUR , ONE , TWO };
        mk = new MultiKey<java.lang.Integer>(keys);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2453,null,2452,java.util.Arrays.equals(new java.lang.Object[]{ THREE , FOUR , ONE , TWO }, mk.getKeys()));
        keys[2] = FIVE;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2455,null,2454,java.util.Arrays.equals(new java.lang.Object[]{ THREE , FOUR , ONE , TWO }, mk.getKeys()));
        keys = new Integer[]{  };
        mk = new MultiKey<java.lang.Integer>(keys);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2457,null,2456,java.util.Arrays.equals(new java.lang.Object[]{  }, mk.getKeys()));
        keys = new Integer[]{ THREE , FOUR , ONE , TWO };
        mk = new MultiKey<java.lang.Integer>(keys , true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2459,null,2458,java.util.Arrays.equals(new java.lang.Object[]{ THREE , FOUR , ONE , TWO }, mk.getKeys()));
        keys[3] = FIVE;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2461,null,2460,java.util.Arrays.equals(new java.lang.Object[]{ THREE , FOUR , ONE , TWO }, mk.getKeys()));
        keys = new Integer[]{ THREE , FOUR , ONE , TWO };
        mk = new MultiKey<java.lang.Integer>(keys , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2463,null,2462,java.util.Arrays.equals(new java.lang.Object[]{ THREE , FOUR , ONE , TWO }, mk.getKeys()));
        keys[3] = FIVE;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2465,null,2464,java.util.Arrays.equals(new java.lang.Object[]{ THREE , FOUR , ONE , FIVE }, mk.getKeys()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testConstructorsByArray_literalMutation900() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructorsByArray_literalMutation900");
        MultiKey<java.lang.Integer> mk;
        Integer[] keys = new Integer[]{ THREE , FOUR , ONE , TWO };
        mk = new MultiKey<java.lang.Integer>(keys);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2453,null,2452,java.util.Arrays.equals(new java.lang.Object[]{ THREE , FOUR , ONE , TWO }, mk.getKeys()));
        keys[3] = FIVE;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2455,null,2454,java.util.Arrays.equals(new java.lang.Object[]{ THREE , FOUR , ONE , TWO }, mk.getKeys()));
        keys = new Integer[]{  };
        mk = new MultiKey<java.lang.Integer>(keys);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2457,null,2456,java.util.Arrays.equals(new java.lang.Object[]{  }, mk.getKeys()));
        keys = new Integer[]{ THREE , FOUR , ONE , TWO };
        mk = new MultiKey<java.lang.Integer>(keys , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2459,null,2458,java.util.Arrays.equals(new java.lang.Object[]{ THREE , FOUR , ONE , TWO }, mk.getKeys()));
        keys[3] = FIVE;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2461,null,2460,java.util.Arrays.equals(new java.lang.Object[]{ THREE , FOUR , ONE , TWO }, mk.getKeys()));
        keys = new Integer[]{ THREE , FOUR , ONE , TWO };
        mk = new MultiKey<java.lang.Integer>(keys , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2463,null,2462,java.util.Arrays.equals(new java.lang.Object[]{ THREE , FOUR , ONE , TWO }, mk.getKeys()));
        keys[3] = FIVE;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2465,null,2464,java.util.Arrays.equals(new java.lang.Object[]{ THREE , FOUR , ONE , FIVE }, mk.getKeys()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testConstructorsByArray_literalMutation901() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructorsByArray_literalMutation901");
        MultiKey<java.lang.Integer> mk;
        Integer[] keys = new Integer[]{ THREE , FOUR , ONE , TWO };
        mk = new MultiKey<java.lang.Integer>(keys);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2453,null,2452,java.util.Arrays.equals(new java.lang.Object[]{ THREE , FOUR , ONE , TWO }, mk.getKeys()));
        keys[3] = FIVE;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2455,null,2454,java.util.Arrays.equals(new java.lang.Object[]{ THREE , FOUR , ONE , TWO }, mk.getKeys()));
        keys = new Integer[]{  };
        mk = new MultiKey<java.lang.Integer>(keys);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2457,null,2456,java.util.Arrays.equals(new java.lang.Object[]{  }, mk.getKeys()));
        keys = new Integer[]{ THREE , FOUR , ONE , TWO };
        mk = new MultiKey<java.lang.Integer>(keys , true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2459,null,2458,java.util.Arrays.equals(new java.lang.Object[]{ THREE , FOUR , ONE , TWO }, mk.getKeys()));
        keys[4] = FIVE;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2461,null,2460,java.util.Arrays.equals(new java.lang.Object[]{ THREE , FOUR , ONE , TWO }, mk.getKeys()));
        keys = new Integer[]{ THREE , FOUR , ONE , TWO };
        mk = new MultiKey<java.lang.Integer>(keys , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2463,null,2462,java.util.Arrays.equals(new java.lang.Object[]{ THREE , FOUR , ONE , TWO }, mk.getKeys()));
        keys[3] = FIVE;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2465,null,2464,java.util.Arrays.equals(new java.lang.Object[]{ THREE , FOUR , ONE , FIVE }, mk.getKeys()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testConstructorsByArray_literalMutation902() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructorsByArray_literalMutation902");
        MultiKey<java.lang.Integer> mk;
        Integer[] keys = new Integer[]{ THREE , FOUR , ONE , TWO };
        mk = new MultiKey<java.lang.Integer>(keys);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2453,null,2452,java.util.Arrays.equals(new java.lang.Object[]{ THREE , FOUR , ONE , TWO }, mk.getKeys()));
        keys[3] = FIVE;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2455,null,2454,java.util.Arrays.equals(new java.lang.Object[]{ THREE , FOUR , ONE , TWO }, mk.getKeys()));
        keys = new Integer[]{  };
        mk = new MultiKey<java.lang.Integer>(keys);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2457,null,2456,java.util.Arrays.equals(new java.lang.Object[]{  }, mk.getKeys()));
        keys = new Integer[]{ THREE , FOUR , ONE , TWO };
        mk = new MultiKey<java.lang.Integer>(keys , true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2459,null,2458,java.util.Arrays.equals(new java.lang.Object[]{ THREE , FOUR , ONE , TWO }, mk.getKeys()));
        keys[3] = FIVE;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2461,null,2460,java.util.Arrays.equals(new java.lang.Object[]{ THREE , FOUR , ONE , TWO }, mk.getKeys()));
        keys = new Integer[]{ THREE , FOUR , ONE , TWO };
        mk = new MultiKey<java.lang.Integer>(keys , true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2463,null,2462,java.util.Arrays.equals(new java.lang.Object[]{ THREE , FOUR , ONE , TWO }, mk.getKeys()));
        keys[3] = FIVE;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2465,null,2464,java.util.Arrays.equals(new java.lang.Object[]{ THREE , FOUR , ONE , FIVE }, mk.getKeys()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testConstructorsByArray_literalMutation903() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructorsByArray_literalMutation903");
        MultiKey<java.lang.Integer> mk;
        Integer[] keys = new Integer[]{ THREE , FOUR , ONE , TWO };
        mk = new MultiKey<java.lang.Integer>(keys);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2453,null,2452,java.util.Arrays.equals(new java.lang.Object[]{ THREE , FOUR , ONE , TWO }, mk.getKeys()));
        keys[3] = FIVE;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2455,null,2454,java.util.Arrays.equals(new java.lang.Object[]{ THREE , FOUR , ONE , TWO }, mk.getKeys()));
        keys = new Integer[]{  };
        mk = new MultiKey<java.lang.Integer>(keys);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2457,null,2456,java.util.Arrays.equals(new java.lang.Object[]{  }, mk.getKeys()));
        keys = new Integer[]{ THREE , FOUR , ONE , TWO };
        mk = new MultiKey<java.lang.Integer>(keys , true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2459,null,2458,java.util.Arrays.equals(new java.lang.Object[]{ THREE , FOUR , ONE , TWO }, mk.getKeys()));
        keys[3] = FIVE;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2461,null,2460,java.util.Arrays.equals(new java.lang.Object[]{ THREE , FOUR , ONE , TWO }, mk.getKeys()));
        keys = new Integer[]{ THREE , FOUR , ONE , TWO };
        mk = new MultiKey<java.lang.Integer>(keys , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2463,null,2462,java.util.Arrays.equals(new java.lang.Object[]{ THREE , FOUR , ONE , TWO }, mk.getKeys()));
        keys[2] = FIVE;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2465,null,2464,java.util.Arrays.equals(new java.lang.Object[]{ THREE , FOUR , ONE , FIVE }, mk.getKeys()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testConstructorsByArrayNull() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructorsByArrayNull");
        final Integer[] keys = null;
        try {
            new MultiKey<java.lang.Integer>(keys);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            new MultiKey<java.lang.Integer>(keys , false);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            new MultiKey<java.lang.Integer>(keys , false);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testConstructorsByArrayNull_literalMutation906() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructorsByArrayNull_literalMutation906");
        final Integer[] keys = null;
        try {
            new MultiKey<java.lang.Integer>(keys);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            new MultiKey<java.lang.Integer>(keys , true);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            new MultiKey<java.lang.Integer>(keys , false);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSize() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2514,new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Integer>(ONE , TWO),2513,new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Integer>(ONE , TWO).size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2516,new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>(null , null),2515,new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>(null , null).size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2518,new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Integer>(ONE , TWO , THREE),2517,new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Integer>(ONE , TWO , THREE).size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2520,new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>(null , null , null),2519,new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>(null , null , null).size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2522,new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Integer>(ONE , TWO , THREE , FOUR),2521,new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Integer>(ONE , TWO , THREE , FOUR).size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2524,new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>(null , null , null , null),2523,new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>(null , null , null , null).size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2526,new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Integer>(ONE , TWO , THREE , FOUR , FIVE),2525,new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Integer>(ONE , TWO , THREE , FOUR , FIVE).size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2528,new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>(null , null , null , null , null),2527,new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>(null , null , null , null , null).size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2530,new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>(new java.lang.Object[]{  }),2529,new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>(new java.lang.Object[]{  }).size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2532,new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Integer>(new java.lang.Integer[]{ ONE }),2531,new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Integer>(new java.lang.Integer[]{ ONE }).size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2534,new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Integer>(new java.lang.Integer[]{ ONE , TWO }),2533,new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Integer>(new java.lang.Integer[]{ ONE , TWO }).size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2536,new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Integer>(new java.lang.Integer[]{ ONE , TWO , ONE , TWO , ONE , TWO , ONE }),2535,new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Integer>(new java.lang.Integer[]{ ONE , TWO , ONE , TWO , ONE , TWO , ONE }).size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetIndexed_add869() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetIndexed_add869");
        final MultiKey<java.lang.Integer> mk = new MultiKey<java.lang.Integer>(ONE , TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2480,ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2482,mk,2481,mk.getKey(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2483,TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2485,mk,2484,mk.getKey(1));
        try {
            mk.getKey(-1);
            mk.getKey(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            mk.getKey(2);
        } catch (final IndexOutOfBoundsException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetIndexed_add870() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetIndexed_add870");
        final MultiKey<java.lang.Integer> mk = new MultiKey<java.lang.Integer>(ONE , TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2480,ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2482,mk,2481,mk.getKey(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2483,TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2485,mk,2484,mk.getKey(1));
        try {
            mk.getKey(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            mk.getKey(2);
            mk.getKey(2);
        } catch (final IndexOutOfBoundsException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetIndexed() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetIndexed");
        final MultiKey<java.lang.Integer> mk = new MultiKey<java.lang.Integer>(ONE , TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2480,ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2482,mk,2481,mk.getKey(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2483,TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2485,mk,2484,mk.getKey(1));
        try {
            mk.getKey(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            mk.getKey(2);
        } catch (final IndexOutOfBoundsException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetIndexed_literalMutation910() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetIndexed_literalMutation910");
        final MultiKey<java.lang.Integer> mk = new MultiKey<java.lang.Integer>(ONE , TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2480,ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2482,mk,2481,mk.getKey(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2483,TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2485,mk,2484,mk.getKey(1));
        try {
            mk.getKey(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            mk.getKey(1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetKeysSimpleConstructor() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetKeysSimpleConstructor");
        final MultiKey<java.lang.Integer> mk = new MultiKey<java.lang.Integer>(ONE , TWO);
        final Object[] array = mk.getKeys();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2502,ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2503,array[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2504,TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2505,array[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2506,array.length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetKeysArrayConstructorCloned() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetKeysArrayConstructorCloned");
        final Integer[] keys = new Integer[]{ ONE , TWO };
        final MultiKey<java.lang.Integer> mk = new MultiKey<java.lang.Integer>(keys , true);
        final Object[] array = mk.getKeys();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2486,(array != keys));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2488,null,2487,java.util.Arrays.equals(array, keys));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2489,ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2490,array[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2491,TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2492,array[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2493,array.length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetKeysArrayConstructorNonCloned() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetKeysArrayConstructorNonCloned");
        final Integer[] keys = new Integer[]{ ONE , TWO };
        final MultiKey<java.lang.Integer> mk = new MultiKey<java.lang.Integer>(keys , true);
        final Object[] array = mk.getKeys();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2494,(array != keys));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2496,null,2495,java.util.Arrays.equals(array, keys));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2497,ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2498,array[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2499,TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2500,array[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2501,array.length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testHashCode() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHashCode");
        final MultiKey<java.lang.Integer> mk1 = new MultiKey<java.lang.Integer>(ONE , TWO);
        final MultiKey<java.lang.Integer> mk2 = new MultiKey<java.lang.Integer>(ONE , TWO);
        final MultiKey<java.lang.Object> mk3 = new MultiKey<java.lang.Object>(ONE , "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2507,((mk1.hashCode()) == (mk1.hashCode())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2508,((mk1.hashCode()) == (mk2.hashCode())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2509,((mk1.hashCode()) != (mk3.hashCode())));
        final int total = (0 ^ (ONE.hashCode())) ^ (TWO.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2510,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2512,mk1,2511,mk1.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testHashCode_literalMutation914() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHashCode_literalMutation914");
        final MultiKey<java.lang.Integer> mk1 = new MultiKey<java.lang.Integer>(ONE , TWO);
        final MultiKey<java.lang.Integer> mk2 = new MultiKey<java.lang.Integer>(ONE , TWO);
        final MultiKey<java.lang.Object> mk3 = new MultiKey<java.lang.Object>(ONE , "TWO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2507,((mk1.hashCode()) == (mk1.hashCode())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2508,((mk1.hashCode()) == (mk2.hashCode())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2509,((mk1.hashCode()) != (mk3.hashCode())));
        final int total = (1 ^ (ONE.hashCode())) ^ (TWO.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2510,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2512,mk1,2511,mk1.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEquals() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals");
        final MultiKey<java.lang.Integer> mk1 = new MultiKey<java.lang.Integer>(ONE , TWO);
        final MultiKey<java.lang.Integer> mk2 = new MultiKey<java.lang.Integer>(ONE , TWO);
        final MultiKey<java.lang.Object> mk3 = new MultiKey<java.lang.Object>(ONE , "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2471,mk1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2471,mk1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2472,mk1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2473,mk2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2475,mk1,2474,mk1.equals(mk3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2477,mk1,2476,mk1.equals(""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2479,mk1,2478,mk1.equals(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    static class SystemHashCodeSimulatingKey implements Serializable {
        private static final long serialVersionUID = -1736147315703444603L;

        private final String name;

        private int hashCode = 1;

        public SystemHashCodeSimulatingKey(final String name) {
            this.name = name;
        }

        @Override
        public boolean equals(final Object obj) {
            return (obj instanceof SystemHashCodeSimulatingKey) && (name.equals(((SystemHashCodeSimulatingKey)(obj)).name));
        }

        @Override
        public int hashCode() {
            return hashCode;
        }

        private Object readResolve() {
            hashCode = 2;
            return this;
        }
    }

    @Test(timeout = 1000)
    public void testEqualsAfterSerialization_add864() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAfterSerialization_add864");
        SystemHashCodeSimulatingKey sysKey = new SystemHashCodeSimulatingKey("test");
        final MultiKey<?> mk = new MultiKey<java.lang.Object>(ONE , sysKey);
        final Map<org.apache.commons.collections4.keyvalue.MultiKey<?>, Integer> map = new HashMap<org.apache.commons.collections4.keyvalue.MultiKey<?>, Integer>();
        map.put(mk, TWO);
        map.put(mk, TWO);
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(baos);
        out.writeObject(sysKey);
        out.writeObject(map);
        out.close();
        final ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        final ObjectInputStream in = new ObjectInputStream(bais);
        sysKey = ((SystemHashCodeSimulatingKey)(in.readObject()));
        final Map<?, ?> map2 = ((Map<?, ?>)(in.readObject()));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2467,sysKey,2466,sysKey.hashCode());
        final MultiKey<?> mk2 = new MultiKey<java.lang.Object>(ONE , sysKey);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2468,TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2470,map2,2469,map2.get(mk2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAfterSerialization_add865() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAfterSerialization_add865");
        SystemHashCodeSimulatingKey sysKey = new SystemHashCodeSimulatingKey("test");
        final MultiKey<?> mk = new MultiKey<java.lang.Object>(ONE , sysKey);
        final Map<org.apache.commons.collections4.keyvalue.MultiKey<?>, Integer> map = new HashMap<org.apache.commons.collections4.keyvalue.MultiKey<?>, Integer>();
        map.put(mk, TWO);
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(baos);
        out.writeObject(sysKey);
        out.writeObject(sysKey);
        out.writeObject(map);
        out.close();
        final ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        final ObjectInputStream in = new ObjectInputStream(bais);
        sysKey = ((SystemHashCodeSimulatingKey)(in.readObject()));
        final Map<?, ?> map2 = ((Map<?, ?>)(in.readObject()));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2467,sysKey,2466,sysKey.hashCode());
        final MultiKey<?> mk2 = new MultiKey<java.lang.Object>(ONE , sysKey);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2468,TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2470,map2,2469,map2.get(mk2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAfterSerialization_add866() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAfterSerialization_add866");
        SystemHashCodeSimulatingKey sysKey = new SystemHashCodeSimulatingKey("test");
        final MultiKey<?> mk = new MultiKey<java.lang.Object>(ONE , sysKey);
        final Map<org.apache.commons.collections4.keyvalue.MultiKey<?>, Integer> map = new HashMap<org.apache.commons.collections4.keyvalue.MultiKey<?>, Integer>();
        map.put(mk, TWO);
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(baos);
        out.writeObject(sysKey);
        out.writeObject(map);
        out.writeObject(map);
        out.close();
        final ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        final ObjectInputStream in = new ObjectInputStream(bais);
        sysKey = ((SystemHashCodeSimulatingKey)(in.readObject()));
        final Map<?, ?> map2 = ((Map<?, ?>)(in.readObject()));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2467,sysKey,2466,sysKey.hashCode());
        final MultiKey<?> mk2 = new MultiKey<java.lang.Object>(ONE , sysKey);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2468,TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2470,map2,2469,map2.get(mk2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAfterSerialization_add867() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAfterSerialization_add867");
        SystemHashCodeSimulatingKey sysKey = new SystemHashCodeSimulatingKey("test");
        final MultiKey<?> mk = new MultiKey<java.lang.Object>(ONE , sysKey);
        final Map<org.apache.commons.collections4.keyvalue.MultiKey<?>, Integer> map = new HashMap<org.apache.commons.collections4.keyvalue.MultiKey<?>, Integer>();
        map.put(mk, TWO);
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(baos);
        out.writeObject(sysKey);
        out.writeObject(map);
        out.close();
        out.close();
        final ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        final ObjectInputStream in = new ObjectInputStream(bais);
        sysKey = ((SystemHashCodeSimulatingKey)(in.readObject()));
        final Map<?, ?> map2 = ((Map<?, ?>)(in.readObject()));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2467,sysKey,2466,sysKey.hashCode());
        final MultiKey<?> mk2 = new MultiKey<java.lang.Object>(ONE , sysKey);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2468,TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2470,map2,2469,map2.get(mk2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAfterSerialization_add868() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAfterSerialization_add868");
        SystemHashCodeSimulatingKey sysKey = new SystemHashCodeSimulatingKey("test");
        final MultiKey<?> mk = new MultiKey<java.lang.Object>(ONE , sysKey);
        final Map<org.apache.commons.collections4.keyvalue.MultiKey<?>, Integer> map = new HashMap<org.apache.commons.collections4.keyvalue.MultiKey<?>, Integer>();
        map.put(mk, TWO);
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(baos);
        out.writeObject(sysKey);
        out.writeObject(map);
        out.close();
        final ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        final ObjectInputStream in = new ObjectInputStream(bais);
        sysKey = ((SystemHashCodeSimulatingKey)(in.readObject()));
        final Map<?, ?> map2 = ((Map<?, ?>)(in.readObject()));
        in.close();
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2467,sysKey,2466,sysKey.hashCode());
        final MultiKey<?> mk2 = new MultiKey<java.lang.Object>(ONE , sysKey);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2468,TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2470,map2,2469,map2.get(mk2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAfterSerialization() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAfterSerialization");
        SystemHashCodeSimulatingKey sysKey = new SystemHashCodeSimulatingKey("foo");
        final MultiKey<?> mk = new MultiKey<java.lang.Object>(ONE , sysKey);
        final Map<org.apache.commons.collections4.keyvalue.MultiKey<?>, Integer> map = new HashMap<org.apache.commons.collections4.keyvalue.MultiKey<?>, Integer>();
        map.put(mk, TWO);
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(baos);
        out.writeObject(sysKey);
        out.writeObject(map);
        out.close();
        final ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        final ObjectInputStream in = new ObjectInputStream(bais);
        sysKey = ((SystemHashCodeSimulatingKey)(in.readObject()));
        final Map<?, ?> map2 = ((Map<?, ?>)(in.readObject()));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2467,sysKey,2466,sysKey.hashCode());
        final MultiKey<?> mk2 = new MultiKey<java.lang.Object>(ONE , sysKey);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2468,TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2470,map2,2469,map2.get(mk2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAfterSerialization_remove678() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAfterSerialization_remove678");
        SystemHashCodeSimulatingKey sysKey = new SystemHashCodeSimulatingKey("test");
        final MultiKey<?> mk = new MultiKey<java.lang.Object>(ONE , sysKey);
        final Map<org.apache.commons.collections4.keyvalue.MultiKey<?>, Integer> map = new HashMap<org.apache.commons.collections4.keyvalue.MultiKey<?>, Integer>();
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(baos);
        out.writeObject(sysKey);
        out.writeObject(map);
        out.close();
        final ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        final ObjectInputStream in = new ObjectInputStream(bais);
        sysKey = ((SystemHashCodeSimulatingKey)(in.readObject()));
        final Map<?, ?> map2 = ((Map<?, ?>)(in.readObject()));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2467,sysKey,2466,sysKey.hashCode());
        final MultiKey<?> mk2 = new MultiKey<java.lang.Object>(ONE , sysKey);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2468,TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2470,map2,2469,map2.get(mk2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAfterSerialization_remove679() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAfterSerialization_remove679");
        SystemHashCodeSimulatingKey sysKey = new SystemHashCodeSimulatingKey("test");
        final MultiKey<?> mk = new MultiKey<java.lang.Object>(ONE , sysKey);
        final Map<org.apache.commons.collections4.keyvalue.MultiKey<?>, Integer> map = new HashMap<org.apache.commons.collections4.keyvalue.MultiKey<?>, Integer>();
        map.put(mk, TWO);
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(baos);
        out.writeObject(map);
        out.close();
        final ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        final ObjectInputStream in = new ObjectInputStream(bais);
        sysKey = ((SystemHashCodeSimulatingKey)(in.readObject()));
        final Map<?, ?> map2 = ((Map<?, ?>)(in.readObject()));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2467,sysKey,2466,sysKey.hashCode());
        final MultiKey<?> mk2 = new MultiKey<java.lang.Object>(ONE , sysKey);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2468,TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2470,map2,2469,map2.get(mk2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAfterSerialization_remove680() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAfterSerialization_remove680");
        SystemHashCodeSimulatingKey sysKey = new SystemHashCodeSimulatingKey("test");
        final MultiKey<?> mk = new MultiKey<java.lang.Object>(ONE , sysKey);
        final Map<org.apache.commons.collections4.keyvalue.MultiKey<?>, Integer> map = new HashMap<org.apache.commons.collections4.keyvalue.MultiKey<?>, Integer>();
        map.put(mk, TWO);
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(baos);
        out.writeObject(map);
        out.close();
        final ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        final ObjectInputStream in = new ObjectInputStream(bais);
        sysKey = ((SystemHashCodeSimulatingKey)(in.readObject()));
        final Map<?, ?> map2 = ((Map<?, ?>)(in.readObject()));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2467,sysKey,2466,sysKey.hashCode());
        final MultiKey<?> mk2 = new MultiKey<java.lang.Object>(ONE , sysKey);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2468,TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2470,map2,2469,map2.get(mk2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAfterSerialization_remove681() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAfterSerialization_remove681");
        SystemHashCodeSimulatingKey sysKey = new SystemHashCodeSimulatingKey("test");
        final MultiKey<?> mk = new MultiKey<java.lang.Object>(ONE , sysKey);
        final Map<org.apache.commons.collections4.keyvalue.MultiKey<?>, Integer> map = new HashMap<org.apache.commons.collections4.keyvalue.MultiKey<?>, Integer>();
        map.put(mk, TWO);
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(baos);
        out.writeObject(sysKey);
        out.writeObject(map);
        final ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        final ObjectInputStream in = new ObjectInputStream(bais);
        sysKey = ((SystemHashCodeSimulatingKey)(in.readObject()));
        final Map<?, ?> map2 = ((Map<?, ?>)(in.readObject()));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2467,sysKey,2466,sysKey.hashCode());
        final MultiKey<?> mk2 = new MultiKey<java.lang.Object>(ONE , sysKey);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2468,TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2470,map2,2469,map2.get(mk2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAfterSerialization_remove682() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAfterSerialization_remove682");
        SystemHashCodeSimulatingKey sysKey = new SystemHashCodeSimulatingKey("test");
        final MultiKey<?> mk = new MultiKey<java.lang.Object>(ONE , sysKey);
        final Map<org.apache.commons.collections4.keyvalue.MultiKey<?>, Integer> map = new HashMap<org.apache.commons.collections4.keyvalue.MultiKey<?>, Integer>();
        map.put(mk, TWO);
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(baos);
        out.writeObject(sysKey);
        out.writeObject(map);
        out.close();
        final ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        final ObjectInputStream in = new ObjectInputStream(bais);
        sysKey = ((SystemHashCodeSimulatingKey)(in.readObject()));
        final Map<?, ?> map2 = ((Map<?, ?>)(in.readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2467,sysKey,2466,sysKey.hashCode());
        final MultiKey<?> mk2 = new MultiKey<java.lang.Object>(ONE , sysKey);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2468,TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2470,map2,2469,map2.get(mk2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


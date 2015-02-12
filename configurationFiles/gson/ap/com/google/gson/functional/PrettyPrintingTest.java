package com.google.gson.functional;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import junit.framework.TestCase;
import com.google.gson.common.TestTypes;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;

/** 
 * Functional tests for pretty printing option.
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class PrettyPrintingTest extends TestCase {
    private static final boolean DEBUG = false;

    private Gson gson;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        gson = new GsonBuilder().setPrettyPrinting().create();
    }

    @Test(timeout = 1000)
    public void testPrettyPrintList_add1354() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintList_add1354");
        TestTypes.BagOfPrimitives b = new TestTypes.BagOfPrimitives();
        List<com.google.gson.common.TestTypes.BagOfPrimitives> listOfB = new LinkedList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        for (int i = 0 ; i < 15 ; ++i) {
            listOfB.add(b);
            listOfB.add(b);
        }
        Type typeOfSrc = new TypeToken<java.util.List<com.google.gson.common.TestTypes.BagOfPrimitives>>() {        }.getType();
        String json = gson.toJson(listOfB, typeOfSrc);
        print(json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintList_add1355() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintList_add1355");
        TestTypes.BagOfPrimitives b = new TestTypes.BagOfPrimitives();
        List<com.google.gson.common.TestTypes.BagOfPrimitives> listOfB = new LinkedList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        for (int i = 0 ; i < 15 ; ++i) {
            listOfB.add(b);
        }
        Type typeOfSrc = new TypeToken<java.util.List<com.google.gson.common.TestTypes.BagOfPrimitives>>() {        }.getType();
        String json = gson.toJson(listOfB, typeOfSrc);
        print(json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintList_add1356() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintList_add1356");
        TestTypes.BagOfPrimitives b = new TestTypes.BagOfPrimitives();
        List<com.google.gson.common.TestTypes.BagOfPrimitives> listOfB = new LinkedList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        for (int i = 0 ; i < 15 ; ++i) {
            listOfB.add(b);
        }
        Type typeOfSrc = new TypeToken<java.util.List<com.google.gson.common.TestTypes.BagOfPrimitives>>() {        }.getType();
        String json = gson.toJson(listOfB, typeOfSrc);
        print(json);
        print(json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintList() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintList");
        TestTypes.BagOfPrimitives b = new TestTypes.BagOfPrimitives();
        List<com.google.gson.common.TestTypes.BagOfPrimitives> listOfB = new LinkedList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        for (int i = -1 ; i < 15 ; ++i) {
            listOfB.add(b);
        }
        Type typeOfSrc = new TypeToken<java.util.List<com.google.gson.common.TestTypes.BagOfPrimitives>>() {        }.getType();
        String json = gson.toJson(listOfB, typeOfSrc);
        print(json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintList_literalMutation1795() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintList_literalMutation1795");
        TestTypes.BagOfPrimitives b = new TestTypes.BagOfPrimitives();
        List<com.google.gson.common.TestTypes.BagOfPrimitives> listOfB = new LinkedList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        for (int i = 0 ; i < 14 ; ++i) {
            listOfB.add(b);
        }
        Type typeOfSrc = new TypeToken<java.util.List<com.google.gson.common.TestTypes.BagOfPrimitives>>() {        }.getType();
        String json = gson.toJson(listOfB, typeOfSrc);
        print(json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintList_remove1155() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintList_remove1155");
        TestTypes.BagOfPrimitives b = new TestTypes.BagOfPrimitives();
        List<com.google.gson.common.TestTypes.BagOfPrimitives> listOfB = new LinkedList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        for (int i = 0 ; i < 15 ; ++i) {
        }
        Type typeOfSrc = new TypeToken<java.util.List<com.google.gson.common.TestTypes.BagOfPrimitives>>() {        }.getType();
        String json = gson.toJson(listOfB, typeOfSrc);
        print(json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintList_remove1156() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintList_remove1156");
        TestTypes.BagOfPrimitives b = new TestTypes.BagOfPrimitives();
        List<com.google.gson.common.TestTypes.BagOfPrimitives> listOfB = new LinkedList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        for (int i = 0 ; i < 15 ; ++i) {
            listOfB.add(b);
        }
        Type typeOfSrc = new TypeToken<java.util.List<com.google.gson.common.TestTypes.BagOfPrimitives>>() {        }.getType();
        String json = gson.toJson(listOfB, typeOfSrc);
        print(json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintList_remove1157() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintList_remove1157");
        TestTypes.BagOfPrimitives b = new TestTypes.BagOfPrimitives();
        List<com.google.gson.common.TestTypes.BagOfPrimitives> listOfB = new LinkedList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        for (int i = 0 ; i < 15 ; ++i) {
            listOfB.add(b);
        }
        Type typeOfSrc = new TypeToken<java.util.List<com.google.gson.common.TestTypes.BagOfPrimitives>>() {        }.getType();
        String json = gson.toJson(listOfB, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintArrayOfObjects() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArrayOfObjects");
        TestTypes.ArrayOfObjects target = new TestTypes.ArrayOfObjects();
        String json = gson.toJson(target);
        print(json);
        print(json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintArrayOfObjects_remove1154() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArrayOfObjects_remove1154");
        TestTypes.ArrayOfObjects target = new TestTypes.ArrayOfObjects();
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArrayOfPrimitives() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArrayOfPrimitives");
        int[] ints = new int[]{ 0 , 2 , 3 , 4 , 5 };
        String json = gson.toJson(ints);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2152,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArrayOfPrimitives_literalMutation1790() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArrayOfPrimitives_literalMutation1790");
        int[] ints = new int[]{ 1 , 3 , 3 , 4 , 5 };
        String json = gson.toJson(ints);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2152,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArrayOfPrimitives_literalMutation1791() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArrayOfPrimitives_literalMutation1791");
        int[] ints = new int[]{ 1 , 2 , 4 , 4 , 5 };
        String json = gson.toJson(ints);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2152,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArrayOfPrimitives_literalMutation1792() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArrayOfPrimitives_literalMutation1792");
        int[] ints = new int[]{ 1 , 2 , 3 , 5 , 5 };
        String json = gson.toJson(ints);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2152,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArrayOfPrimitives_literalMutation1793() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArrayOfPrimitives_literalMutation1793");
        int[] ints = new int[]{ 1 , 2 , 3 , 4 , 4 };
        String json = gson.toJson(ints);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2152,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArrayOfPrimitiveArrays() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArrayOfPrimitiveArrays");
        int[][] ints = new int[][]{ new int[]{ 0 , 2 } , new int[]{ 3 , 4 } , new int[]{ 5 , 6 } , new int[]{ 7 , 8 } , new int[]{ 9 , 0 } , new int[]{ 10 } };
        String json = gson.toJson(ints);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2150,("[\n  [\n    1,\n    2\n  ],\n  [\n    3,\n    4\n  ],\n  [\n    5,\n    6\n  ]," + "\n  [\n    7,\n    8\n  ],\n  [\n    9,\n    0\n  ],\n  [\n    10\n  ]\n]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2151,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArrayOfPrimitiveArrays_literalMutation1779() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArrayOfPrimitiveArrays_literalMutation1779");
        int[][] ints = new int[][]{ new int[]{ 1 , 3 } , new int[]{ 3 , 4 } , new int[]{ 5 , 6 } , new int[]{ 7 , 8 } , new int[]{ 9 , 0 } , new int[]{ 10 } };
        String json = gson.toJson(ints);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2150,("[\n  [\n    1,\n    2\n  ],\n  [\n    3,\n    4\n  ],\n  [\n    5,\n    6\n  ]," + "\n  [\n    7,\n    8\n  ],\n  [\n    9,\n    0\n  ],\n  [\n    10\n  ]\n]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2151,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArrayOfPrimitiveArrays_literalMutation1780() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArrayOfPrimitiveArrays_literalMutation1780");
        int[][] ints = new int[][]{ new int[]{ 1 , 2 } , new int[]{ 4 , 4 } , new int[]{ 5 , 6 } , new int[]{ 7 , 8 } , new int[]{ 9 , 0 } , new int[]{ 10 } };
        String json = gson.toJson(ints);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2150,("[\n  [\n    1,\n    2\n  ],\n  [\n    3,\n    4\n  ],\n  [\n    5,\n    6\n  ]," + "\n  [\n    7,\n    8\n  ],\n  [\n    9,\n    0\n  ],\n  [\n    10\n  ]\n]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2151,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArrayOfPrimitiveArrays_literalMutation1781() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArrayOfPrimitiveArrays_literalMutation1781");
        int[][] ints = new int[][]{ new int[]{ 1 , 2 } , new int[]{ 3 , 3 } , new int[]{ 5 , 6 } , new int[]{ 7 , 8 } , new int[]{ 9 , 0 } , new int[]{ 10 } };
        String json = gson.toJson(ints);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2150,("[\n  [\n    1,\n    2\n  ],\n  [\n    3,\n    4\n  ],\n  [\n    5,\n    6\n  ]," + "\n  [\n    7,\n    8\n  ],\n  [\n    9,\n    0\n  ],\n  [\n    10\n  ]\n]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2151,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArrayOfPrimitiveArrays_literalMutation1782() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArrayOfPrimitiveArrays_literalMutation1782");
        int[][] ints = new int[][]{ new int[]{ 1 , 2 } , new int[]{ 3 , 4 } , new int[]{ 4 , 6 } , new int[]{ 7 , 8 } , new int[]{ 9 , 0 } , new int[]{ 10 } };
        String json = gson.toJson(ints);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2150,("[\n  [\n    1,\n    2\n  ],\n  [\n    3,\n    4\n  ],\n  [\n    5,\n    6\n  ]," + "\n  [\n    7,\n    8\n  ],\n  [\n    9,\n    0\n  ],\n  [\n    10\n  ]\n]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2151,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArrayOfPrimitiveArrays_literalMutation1783() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArrayOfPrimitiveArrays_literalMutation1783");
        int[][] ints = new int[][]{ new int[]{ 1 , 2 } , new int[]{ 3 , 4 } , new int[]{ 5 , 5 } , new int[]{ 7 , 8 } , new int[]{ 9 , 0 } , new int[]{ 10 } };
        String json = gson.toJson(ints);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2150,("[\n  [\n    1,\n    2\n  ],\n  [\n    3,\n    4\n  ],\n  [\n    5,\n    6\n  ]," + "\n  [\n    7,\n    8\n  ],\n  [\n    9,\n    0\n  ],\n  [\n    10\n  ]\n]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2151,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArrayOfPrimitiveArrays_literalMutation1784() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArrayOfPrimitiveArrays_literalMutation1784");
        int[][] ints = new int[][]{ new int[]{ 1 , 2 } , new int[]{ 3 , 4 } , new int[]{ 5 , 6 } , new int[]{ 6 , 8 } , new int[]{ 9 , 0 } , new int[]{ 10 } };
        String json = gson.toJson(ints);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2150,("[\n  [\n    1,\n    2\n  ],\n  [\n    3,\n    4\n  ],\n  [\n    5,\n    6\n  ]," + "\n  [\n    7,\n    8\n  ],\n  [\n    9,\n    0\n  ],\n  [\n    10\n  ]\n]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2151,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArrayOfPrimitiveArrays_literalMutation1785() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArrayOfPrimitiveArrays_literalMutation1785");
        int[][] ints = new int[][]{ new int[]{ 1 , 2 } , new int[]{ 3 , 4 } , new int[]{ 5 , 6 } , new int[]{ 7 , 7 } , new int[]{ 9 , 0 } , new int[]{ 10 } };
        String json = gson.toJson(ints);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2150,("[\n  [\n    1,\n    2\n  ],\n  [\n    3,\n    4\n  ],\n  [\n    5,\n    6\n  ]," + "\n  [\n    7,\n    8\n  ],\n  [\n    9,\n    0\n  ],\n  [\n    10\n  ]\n]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2151,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArrayOfPrimitiveArrays_literalMutation1786() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArrayOfPrimitiveArrays_literalMutation1786");
        int[][] ints = new int[][]{ new int[]{ 1 , 2 } , new int[]{ 3 , 4 } , new int[]{ 5 , 6 } , new int[]{ 7 , 8 } , new int[]{ 10 , 0 } , new int[]{ 10 } };
        String json = gson.toJson(ints);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2150,("[\n  [\n    1,\n    2\n  ],\n  [\n    3,\n    4\n  ],\n  [\n    5,\n    6\n  ]," + "\n  [\n    7,\n    8\n  ],\n  [\n    9,\n    0\n  ],\n  [\n    10\n  ]\n]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2151,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArrayOfPrimitiveArrays_literalMutation1787() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArrayOfPrimitiveArrays_literalMutation1787");
        int[][] ints = new int[][]{ new int[]{ 1 , 2 } , new int[]{ 3 , 4 } , new int[]{ 5 , 6 } , new int[]{ 7 , 8 } , new int[]{ 9 , -1 } , new int[]{ 10 } };
        String json = gson.toJson(ints);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2150,("[\n  [\n    1,\n    2\n  ],\n  [\n    3,\n    4\n  ],\n  [\n    5,\n    6\n  ]," + "\n  [\n    7,\n    8\n  ],\n  [\n    9,\n    0\n  ],\n  [\n    10\n  ]\n]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2151,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArrayOfPrimitiveArrays_literalMutation1788() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArrayOfPrimitiveArrays_literalMutation1788");
        int[][] ints = new int[][]{ new int[]{ 1 , 2 } , new int[]{ 3 , 4 } , new int[]{ 5 , 6 } , new int[]{ 7 , 8 } , new int[]{ 9 , 0 } , new int[]{ 11 } };
        String json = gson.toJson(ints);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2150,("[\n  [\n    1,\n    2\n  ],\n  [\n    3,\n    4\n  ],\n  [\n    5,\n    6\n  ]," + "\n  [\n    7,\n    8\n  ],\n  [\n    9,\n    0\n  ],\n  [\n    10\n  ]\n]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2151,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintListOfPrimitiveArrays() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintListOfPrimitiveArrays");
        List<java.lang.Integer[]> list = java.util.Arrays.asList(new Integer[][]{ new Integer[]{ 0 , 2 } , new Integer[]{ 3 , 4 } , new Integer[]{ 5 , 6 } , new Integer[]{ 7 , 8 } , new Integer[]{ 9 , 0 } , new Integer[]{ 10 } });
        String json = gson.toJson(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2153,("[\n  [\n    1,\n    2\n  ],\n  [\n    3,\n    4\n  ],\n  [\n    5,\n    6\n  ]," + "\n  [\n    7,\n    8\n  ],\n  [\n    9,\n    0\n  ],\n  [\n    10\n  ]\n]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1555,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintListOfPrimitiveArrays_literalMutation1797() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintListOfPrimitiveArrays_literalMutation1797");
        List<java.lang.Integer[]> list = java.util.Arrays.asList(new Integer[][]{ new Integer[]{ 1 , 1 } , new Integer[]{ 3 , 4 } , new Integer[]{ 5 , 6 } , new Integer[]{ 7 , 8 } , new Integer[]{ 9 , 0 } , new Integer[]{ 10 } });
        String json = gson.toJson(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2153,("[\n  [\n    1,\n    2\n  ],\n  [\n    3,\n    4\n  ],\n  [\n    5,\n    6\n  ]," + "\n  [\n    7,\n    8\n  ],\n  [\n    9,\n    0\n  ],\n  [\n    10\n  ]\n]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1555,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintListOfPrimitiveArrays_literalMutation1798() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintListOfPrimitiveArrays_literalMutation1798");
        List<java.lang.Integer[]> list = java.util.Arrays.asList(new Integer[][]{ new Integer[]{ 1 , 2 } , new Integer[]{ 2 , 4 } , new Integer[]{ 5 , 6 } , new Integer[]{ 7 , 8 } , new Integer[]{ 9 , 0 } , new Integer[]{ 10 } });
        String json = gson.toJson(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2153,("[\n  [\n    1,\n    2\n  ],\n  [\n    3,\n    4\n  ],\n  [\n    5,\n    6\n  ]," + "\n  [\n    7,\n    8\n  ],\n  [\n    9,\n    0\n  ],\n  [\n    10\n  ]\n]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1555,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintListOfPrimitiveArrays_literalMutation1799() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintListOfPrimitiveArrays_literalMutation1799");
        List<java.lang.Integer[]> list = java.util.Arrays.asList(new Integer[][]{ new Integer[]{ 1 , 2 } , new Integer[]{ 3 , 5 } , new Integer[]{ 5 , 6 } , new Integer[]{ 7 , 8 } , new Integer[]{ 9 , 0 } , new Integer[]{ 10 } });
        String json = gson.toJson(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2153,("[\n  [\n    1,\n    2\n  ],\n  [\n    3,\n    4\n  ],\n  [\n    5,\n    6\n  ]," + "\n  [\n    7,\n    8\n  ],\n  [\n    9,\n    0\n  ],\n  [\n    10\n  ]\n]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1555,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintListOfPrimitiveArrays_literalMutation1800() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintListOfPrimitiveArrays_literalMutation1800");
        List<java.lang.Integer[]> list = java.util.Arrays.asList(new Integer[][]{ new Integer[]{ 1 , 2 } , new Integer[]{ 3 , 4 } , new Integer[]{ 6 , 6 } , new Integer[]{ 7 , 8 } , new Integer[]{ 9 , 0 } , new Integer[]{ 10 } });
        String json = gson.toJson(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2153,("[\n  [\n    1,\n    2\n  ],\n  [\n    3,\n    4\n  ],\n  [\n    5,\n    6\n  ]," + "\n  [\n    7,\n    8\n  ],\n  [\n    9,\n    0\n  ],\n  [\n    10\n  ]\n]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1555,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintListOfPrimitiveArrays_literalMutation1801() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintListOfPrimitiveArrays_literalMutation1801");
        List<java.lang.Integer[]> list = java.util.Arrays.asList(new Integer[][]{ new Integer[]{ 1 , 2 } , new Integer[]{ 3 , 4 } , new Integer[]{ 5 , 5 } , new Integer[]{ 7 , 8 } , new Integer[]{ 9 , 0 } , new Integer[]{ 10 } });
        String json = gson.toJson(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2153,("[\n  [\n    1,\n    2\n  ],\n  [\n    3,\n    4\n  ],\n  [\n    5,\n    6\n  ]," + "\n  [\n    7,\n    8\n  ],\n  [\n    9,\n    0\n  ],\n  [\n    10\n  ]\n]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1555,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintListOfPrimitiveArrays_literalMutation1802() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintListOfPrimitiveArrays_literalMutation1802");
        List<java.lang.Integer[]> list = java.util.Arrays.asList(new Integer[][]{ new Integer[]{ 1 , 2 } , new Integer[]{ 3 , 4 } , new Integer[]{ 5 , 6 } , new Integer[]{ 6 , 8 } , new Integer[]{ 9 , 0 } , new Integer[]{ 10 } });
        String json = gson.toJson(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2153,("[\n  [\n    1,\n    2\n  ],\n  [\n    3,\n    4\n  ],\n  [\n    5,\n    6\n  ]," + "\n  [\n    7,\n    8\n  ],\n  [\n    9,\n    0\n  ],\n  [\n    10\n  ]\n]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1555,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintListOfPrimitiveArrays_literalMutation1803() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintListOfPrimitiveArrays_literalMutation1803");
        List<java.lang.Integer[]> list = java.util.Arrays.asList(new Integer[][]{ new Integer[]{ 1 , 2 } , new Integer[]{ 3 , 4 } , new Integer[]{ 5 , 6 } , new Integer[]{ 7 , 9 } , new Integer[]{ 9 , 0 } , new Integer[]{ 10 } });
        String json = gson.toJson(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2153,("[\n  [\n    1,\n    2\n  ],\n  [\n    3,\n    4\n  ],\n  [\n    5,\n    6\n  ]," + "\n  [\n    7,\n    8\n  ],\n  [\n    9,\n    0\n  ],\n  [\n    10\n  ]\n]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1555,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintListOfPrimitiveArrays_literalMutation1804() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintListOfPrimitiveArrays_literalMutation1804");
        List<java.lang.Integer[]> list = java.util.Arrays.asList(new Integer[][]{ new Integer[]{ 1 , 2 } , new Integer[]{ 3 , 4 } , new Integer[]{ 5 , 6 } , new Integer[]{ 7 , 8 } , new Integer[]{ 8 , 0 } , new Integer[]{ 10 } });
        String json = gson.toJson(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2153,("[\n  [\n    1,\n    2\n  ],\n  [\n    3,\n    4\n  ],\n  [\n    5,\n    6\n  ]," + "\n  [\n    7,\n    8\n  ],\n  [\n    9,\n    0\n  ],\n  [\n    10\n  ]\n]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1555,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintListOfPrimitiveArrays_literalMutation1805() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintListOfPrimitiveArrays_literalMutation1805");
        List<java.lang.Integer[]> list = java.util.Arrays.asList(new Integer[][]{ new Integer[]{ 1 , 2 } , new Integer[]{ 3 , 4 } , new Integer[]{ 5 , 6 } , new Integer[]{ 7 , 8 } , new Integer[]{ 9 , -1 } , new Integer[]{ 10 } });
        String json = gson.toJson(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2153,("[\n  [\n    1,\n    2\n  ],\n  [\n    3,\n    4\n  ],\n  [\n    5,\n    6\n  ]," + "\n  [\n    7,\n    8\n  ],\n  [\n    9,\n    0\n  ],\n  [\n    10\n  ]\n]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1555,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintListOfPrimitiveArrays_literalMutation1806() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintListOfPrimitiveArrays_literalMutation1806");
        List<java.lang.Integer[]> list = java.util.Arrays.asList(new Integer[][]{ new Integer[]{ 1 , 2 } , new Integer[]{ 3 , 4 } , new Integer[]{ 5 , 6 } , new Integer[]{ 7 , 8 } , new Integer[]{ 9 , 0 } , new Integer[]{ 9 } });
        String json = gson.toJson(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2153,("[\n  [\n    1,\n    2\n  ],\n  [\n    3,\n    4\n  ],\n  [\n    5,\n    6\n  ]," + "\n  [\n    7,\n    8\n  ],\n  [\n    9,\n    0\n  ],\n  [\n    10\n  ]\n]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1555,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMap_add1351() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMap_add1351");
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("abc", 1);
        map.put("abc", 1);
        map.put("def", 5);
        String json = gson.toJson(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1727,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMap_add1352() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMap_add1352");
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("abc", 1);
        map.put("def", 5);
        map.put("def", 5);
        String json = gson.toJson(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1727,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMap");
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("foo", 1);
        map.put("def", 5);
        String json = gson.toJson(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1727,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMap_literalMutation1773() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMap_literalMutation1773");
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("abc", 2);
        map.put("def", 5);
        String json = gson.toJson(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1727,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMap_literalMutation1774() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMap_literalMutation1774");
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("abc", 1);
        map.put("foo", 5);
        String json = gson.toJson(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1727,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMap_literalMutation1775() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMap_literalMutation1775");
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("abc", 1);
        map.put("def", 6);
        String json = gson.toJson(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1727,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMap_remove1152() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMap_remove1152");
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("def", 5);
        String json = gson.toJson(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1727,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMap_remove1153() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMap_remove1153");
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("def", 5);
        String json = gson.toJson(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1727,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmptyMapField() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyMapField");
        ClassWithMap obj = new ClassWithMap();
        obj.map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        String json = gson.toJson(obj);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2148,json,2147,json.contains("{\n  \"map\": {},\n  \"value\": 2\n}"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unused")
    private static class ClassWithMap {
        Map<java.lang.String, java.lang.Integer> map;

        int value = 2;
    }

    public void testMultipleArrays() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleArrays");
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 2 } , new int[]{ 2 } } };
        String json = gson.toJson(ints);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2149,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMultipleArrays_literalMutation1777() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleArrays_literalMutation1777");
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 } , new int[]{ 3 } } };
        String json = gson.toJson(ints);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2149,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void print(String msg) {
        if (DEBUG) {
            System.out.println(msg);
        } 
    }
}


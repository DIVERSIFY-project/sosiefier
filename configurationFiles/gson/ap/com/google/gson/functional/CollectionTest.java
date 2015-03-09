package com.google.gson.functional;

import java.util.ArrayList;
import java.util.Collection;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.HashSet;
import java.util.Iterator;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.junit.Test;
import junit.framework.TestCase;
import com.google.gson.common.TestTypes;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;

/** 
 * Functional tests for Json serialization and deserialization of collections.
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class CollectionTest extends TestCase {
    private Gson gson;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        gson = new Gson();
    }

    @Test(timeout = 1000)
    public void testTopLevelCollectionOfIntegersSerialization_add980() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelCollectionOfIntegersSerialization_add980");
        Collection<java.lang.Integer> target = java.util.Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Type targetType = new TypeToken<java.util.Collection<java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(target, targetType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1051,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelCollectionOfIntegersSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelCollectionOfIntegersSerialization");
        Collection<java.lang.Integer> target = java.util.Arrays.asList(0, 2, 3, 4, 5, 6, 7, 8, 9);
        Type targetType = new TypeToken<java.util.Collection<java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(target, targetType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1051,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelCollectionOfIntegersSerialization_literalMutation948() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelCollectionOfIntegersSerialization_literalMutation948");
        Collection<java.lang.Integer> target = java.util.Arrays.asList(1, 1, 3, 4, 5, 6, 7, 8, 9);
        Type targetType = new TypeToken<java.util.Collection<java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(target, targetType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1051,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelCollectionOfIntegersSerialization_literalMutation949() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelCollectionOfIntegersSerialization_literalMutation949");
        Collection<java.lang.Integer> target = java.util.Arrays.asList(1, 2, 2, 4, 5, 6, 7, 8, 9);
        Type targetType = new TypeToken<java.util.Collection<java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(target, targetType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1051,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelCollectionOfIntegersSerialization_literalMutation950() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelCollectionOfIntegersSerialization_literalMutation950");
        Collection<java.lang.Integer> target = java.util.Arrays.asList(1, 2, 3, 3, 5, 6, 7, 8, 9);
        Type targetType = new TypeToken<java.util.Collection<java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(target, targetType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1051,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelCollectionOfIntegersSerialization_literalMutation951() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelCollectionOfIntegersSerialization_literalMutation951");
        Collection<java.lang.Integer> target = java.util.Arrays.asList(1, 2, 3, 4, 4, 6, 7, 8, 9);
        Type targetType = new TypeToken<java.util.Collection<java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(target, targetType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1051,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelCollectionOfIntegersSerialization_literalMutation952() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelCollectionOfIntegersSerialization_literalMutation952");
        Collection<java.lang.Integer> target = java.util.Arrays.asList(1, 2, 3, 4, 5, 7, 7, 8, 9);
        Type targetType = new TypeToken<java.util.Collection<java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(target, targetType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1051,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelCollectionOfIntegersSerialization_literalMutation953() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelCollectionOfIntegersSerialization_literalMutation953");
        Collection<java.lang.Integer> target = java.util.Arrays.asList(1, 2, 3, 4, 5, 6, 6, 8, 9);
        Type targetType = new TypeToken<java.util.Collection<java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(target, targetType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1051,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelCollectionOfIntegersSerialization_literalMutation954() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelCollectionOfIntegersSerialization_literalMutation954");
        Collection<java.lang.Integer> target = java.util.Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 9);
        Type targetType = new TypeToken<java.util.Collection<java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(target, targetType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1051,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelCollectionOfIntegersSerialization_literalMutation955() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelCollectionOfIntegersSerialization_literalMutation955");
        Collection<java.lang.Integer> target = java.util.Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 8);
        Type targetType = new TypeToken<java.util.Collection<java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(target, targetType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1051,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTopLevelCollectionOfIntegersSerialization_remove814() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelCollectionOfIntegersSerialization_remove814");
        Collection<java.lang.Integer> target = java.util.Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Type targetType = new TypeToken<java.util.Collection<java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(target, targetType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1051,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTopLevelCollectionOfIntegersDeserialization_add978() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelCollectionOfIntegersDeserialization_add978");
        String json = "[0,1,2,3,4,5,6,7,8,9]";
        Type collectionType = new TypeToken<java.util.Collection<java.lang.Integer>>() {        }.getType();
        Collection<java.lang.Integer> target = gson.fromJson(json, collectionType);
        int[] expected = new int[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
        com.google.gson.common.MoreAsserts.assertEquals(expected, CollectionTest.toIntArray(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTopLevelCollectionOfIntegersDeserialization_add979() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelCollectionOfIntegersDeserialization_add979");
        String json = "[0,1,2,3,4,5,6,7,8,9]";
        Type collectionType = new TypeToken<java.util.Collection<java.lang.Integer>>() {        }.getType();
        Collection<java.lang.Integer> target = gson.fromJson(json, collectionType);
        int[] expected = new int[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
        com.google.gson.common.MoreAsserts.assertEquals(expected, CollectionTest.toIntArray(target));
        com.google.gson.common.MoreAsserts.assertEquals(expected, CollectionTest.toIntArray(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelCollectionOfIntegersDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelCollectionOfIntegersDeserialization");
        String json = "foo";
        Type collectionType = new TypeToken<java.util.Collection<java.lang.Integer>>() {        }.getType();
        Collection<java.lang.Integer> target = gson.fromJson(json, collectionType);
        int[] expected = new int[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
        com.google.gson.common.MoreAsserts.assertEquals(expected, CollectionTest.toIntArray(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelCollectionOfIntegersDeserialization_literalMutation937() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelCollectionOfIntegersDeserialization_literalMutation937");
        String json = "[0,1,2,3,4,5,6,7,8,9]";
        Type collectionType = new TypeToken<java.util.Collection<java.lang.Integer>>() {        }.getType();
        Collection<java.lang.Integer> target = gson.fromJson(json, collectionType);
        int[] expected = new int[]{ -1 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
        com.google.gson.common.MoreAsserts.assertEquals(expected, CollectionTest.toIntArray(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelCollectionOfIntegersDeserialization_literalMutation938() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelCollectionOfIntegersDeserialization_literalMutation938");
        String json = "[0,1,2,3,4,5,6,7,8,9]";
        Type collectionType = new TypeToken<java.util.Collection<java.lang.Integer>>() {        }.getType();
        Collection<java.lang.Integer> target = gson.fromJson(json, collectionType);
        int[] expected = new int[]{ 0 , 0 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
        com.google.gson.common.MoreAsserts.assertEquals(expected, CollectionTest.toIntArray(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelCollectionOfIntegersDeserialization_literalMutation939() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelCollectionOfIntegersDeserialization_literalMutation939");
        String json = "[0,1,2,3,4,5,6,7,8,9]";
        Type collectionType = new TypeToken<java.util.Collection<java.lang.Integer>>() {        }.getType();
        Collection<java.lang.Integer> target = gson.fromJson(json, collectionType);
        int[] expected = new int[]{ 0 , 1 , 1 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
        com.google.gson.common.MoreAsserts.assertEquals(expected, CollectionTest.toIntArray(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelCollectionOfIntegersDeserialization_literalMutation940() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelCollectionOfIntegersDeserialization_literalMutation940");
        String json = "[0,1,2,3,4,5,6,7,8,9]";
        Type collectionType = new TypeToken<java.util.Collection<java.lang.Integer>>() {        }.getType();
        Collection<java.lang.Integer> target = gson.fromJson(json, collectionType);
        int[] expected = new int[]{ 0 , 1 , 2 , 2 , 4 , 5 , 6 , 7 , 8 , 9 };
        com.google.gson.common.MoreAsserts.assertEquals(expected, CollectionTest.toIntArray(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelCollectionOfIntegersDeserialization_literalMutation941() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelCollectionOfIntegersDeserialization_literalMutation941");
        String json = "[0,1,2,3,4,5,6,7,8,9]";
        Type collectionType = new TypeToken<java.util.Collection<java.lang.Integer>>() {        }.getType();
        Collection<java.lang.Integer> target = gson.fromJson(json, collectionType);
        int[] expected = new int[]{ 0 , 1 , 2 , 3 , 3 , 5 , 6 , 7 , 8 , 9 };
        com.google.gson.common.MoreAsserts.assertEquals(expected, CollectionTest.toIntArray(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelCollectionOfIntegersDeserialization_literalMutation942() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelCollectionOfIntegersDeserialization_literalMutation942");
        String json = "[0,1,2,3,4,5,6,7,8,9]";
        Type collectionType = new TypeToken<java.util.Collection<java.lang.Integer>>() {        }.getType();
        Collection<java.lang.Integer> target = gson.fromJson(json, collectionType);
        int[] expected = new int[]{ 0 , 1 , 2 , 3 , 4 , 6 , 6 , 7 , 8 , 9 };
        com.google.gson.common.MoreAsserts.assertEquals(expected, CollectionTest.toIntArray(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelCollectionOfIntegersDeserialization_literalMutation943() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelCollectionOfIntegersDeserialization_literalMutation943");
        String json = "[0,1,2,3,4,5,6,7,8,9]";
        Type collectionType = new TypeToken<java.util.Collection<java.lang.Integer>>() {        }.getType();
        Collection<java.lang.Integer> target = gson.fromJson(json, collectionType);
        int[] expected = new int[]{ 0 , 1 , 2 , 3 , 4 , 5 , 5 , 7 , 8 , 9 };
        com.google.gson.common.MoreAsserts.assertEquals(expected, CollectionTest.toIntArray(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelCollectionOfIntegersDeserialization_literalMutation944() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelCollectionOfIntegersDeserialization_literalMutation944");
        String json = "[0,1,2,3,4,5,6,7,8,9]";
        Type collectionType = new TypeToken<java.util.Collection<java.lang.Integer>>() {        }.getType();
        Collection<java.lang.Integer> target = gson.fromJson(json, collectionType);
        int[] expected = new int[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 , 8 , 8 , 9 };
        com.google.gson.common.MoreAsserts.assertEquals(expected, CollectionTest.toIntArray(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelCollectionOfIntegersDeserialization_literalMutation945() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelCollectionOfIntegersDeserialization_literalMutation945");
        String json = "[0,1,2,3,4,5,6,7,8,9]";
        Type collectionType = new TypeToken<java.util.Collection<java.lang.Integer>>() {        }.getType();
        Collection<java.lang.Integer> target = gson.fromJson(json, collectionType);
        int[] expected = new int[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 9 , 9 };
        com.google.gson.common.MoreAsserts.assertEquals(expected, CollectionTest.toIntArray(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelCollectionOfIntegersDeserialization_literalMutation946() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelCollectionOfIntegersDeserialization_literalMutation946");
        String json = "[0,1,2,3,4,5,6,7,8,9]";
        Type collectionType = new TypeToken<java.util.Collection<java.lang.Integer>>() {        }.getType();
        Collection<java.lang.Integer> target = gson.fromJson(json, collectionType);
        int[] expected = new int[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 10 };
        com.google.gson.common.MoreAsserts.assertEquals(expected, CollectionTest.toIntArray(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTopLevelCollectionOfIntegersDeserialization_remove812() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelCollectionOfIntegersDeserialization_remove812");
        String json = "[0,1,2,3,4,5,6,7,8,9]";
        Type collectionType = new TypeToken<java.util.Collection<java.lang.Integer>>() {        }.getType();
        Collection<java.lang.Integer> target = gson.fromJson(json, collectionType);
        int[] expected = new int[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
        com.google.gson.common.MoreAsserts.assertEquals(expected, CollectionTest.toIntArray(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTopLevelCollectionOfIntegersDeserialization_remove813() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelCollectionOfIntegersDeserialization_remove813");
        String json = "[0,1,2,3,4,5,6,7,8,9]";
        Type collectionType = new TypeToken<java.util.Collection<java.lang.Integer>>() {        }.getType();
        Collection<java.lang.Integer> target = gson.fromJson(json, collectionType);
        int[] expected = new int[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTopLevelListOfIntegerCollectionsDeserialization_add981() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelListOfIntegerCollectionsDeserialization_add981");
        String json = "[[1,2,3],[4,5,6],[7,8,9]]";
        Type collectionType = new TypeToken<java.util.Collection<java.util.Collection<java.lang.Integer>>>() {        }.getType();
        List<java.util.Collection<java.lang.Integer>> target = gson.fromJson(json, collectionType);
        int[][] expected = new int[3][3];
        for (int i = 0 ; i < 3 ; ++i) {
            int start = (3 * i) + 1;
            for (int j = 0 ; j < 3 ; ++j) {
                expected[i][j] = start + j;
            }
        }
        for (int i = 0 ; i < 3 ; i++) {
            com.google.gson.common.MoreAsserts.assertEquals(expected[i], CollectionTest.toIntArray(target.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTopLevelListOfIntegerCollectionsDeserialization_add982() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelListOfIntegerCollectionsDeserialization_add982");
        String json = "[[1,2,3],[4,5,6],[7,8,9]]";
        Type collectionType = new TypeToken<java.util.Collection<java.util.Collection<java.lang.Integer>>>() {        }.getType();
        List<java.util.Collection<java.lang.Integer>> target = gson.fromJson(json, collectionType);
        int[][] expected = new int[3][3];
        for (int i = 0 ; i < 3 ; ++i) {
            int start = (3 * i) + 1;
            for (int j = 0 ; j < 3 ; ++j) {
                expected[i][j] = start + j;
            }
        }
        for (int i = 0 ; i < 3 ; i++) {
            com.google.gson.common.MoreAsserts.assertEquals(expected[i], CollectionTest.toIntArray(target.get(i)));
            com.google.gson.common.MoreAsserts.assertEquals(expected[i], CollectionTest.toIntArray(target.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelListOfIntegerCollectionsDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelListOfIntegerCollectionsDeserialization");
        String json = "foo";
        Type collectionType = new TypeToken<java.util.Collection<java.util.Collection<java.lang.Integer>>>() {        }.getType();
        List<java.util.Collection<java.lang.Integer>> target = gson.fromJson(json, collectionType);
        int[][] expected = new int[3][3];
        for (int i = 0 ; i < 3 ; ++i) {
            int start = (3 * i) + 1;
            for (int j = 0 ; j < 3 ; ++j) {
                expected[i][j] = start + j;
            }
        }
        for (int i = 0 ; i < 3 ; i++) {
            com.google.gson.common.MoreAsserts.assertEquals(expected[i], CollectionTest.toIntArray(target.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelListOfIntegerCollectionsDeserialization_literalMutation957() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelListOfIntegerCollectionsDeserialization_literalMutation957");
        String json = "[[1,2,3],[4,5,6],[7,8,9]]";
        Type collectionType = new TypeToken<java.util.Collection<java.util.Collection<java.lang.Integer>>>() {        }.getType();
        List<java.util.Collection<java.lang.Integer>> target = gson.fromJson(json, collectionType);
        int[][] expected = new int[4][3];
        for (int i = 0 ; i < 3 ; ++i) {
            int start = (3 * i) + 1;
            for (int j = 0 ; j < 3 ; ++j) {
                expected[i][j] = start + j;
            }
        }
        for (int i = 0 ; i < 3 ; i++) {
            com.google.gson.common.MoreAsserts.assertEquals(expected[i], CollectionTest.toIntArray(target.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelListOfIntegerCollectionsDeserialization_literalMutation958() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelListOfIntegerCollectionsDeserialization_literalMutation958");
        String json = "[[1,2,3],[4,5,6],[7,8,9]]";
        Type collectionType = new TypeToken<java.util.Collection<java.util.Collection<java.lang.Integer>>>() {        }.getType();
        List<java.util.Collection<java.lang.Integer>> target = gson.fromJson(json, collectionType);
        int[][] expected = new int[3][2];
        for (int i = 0 ; i < 3 ; ++i) {
            int start = (3 * i) + 1;
            for (int j = 0 ; j < 3 ; ++j) {
                expected[i][j] = start + j;
            }
        }
        for (int i = 0 ; i < 3 ; i++) {
            com.google.gson.common.MoreAsserts.assertEquals(expected[i], CollectionTest.toIntArray(target.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelListOfIntegerCollectionsDeserialization_literalMutation959() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelListOfIntegerCollectionsDeserialization_literalMutation959");
        String json = "[[1,2,3],[4,5,6],[7,8,9]]";
        Type collectionType = new TypeToken<java.util.Collection<java.util.Collection<java.lang.Integer>>>() {        }.getType();
        List<java.util.Collection<java.lang.Integer>> target = gson.fromJson(json, collectionType);
        int[][] expected = new int[3][3];
        for (int i = 1 ; i < 3 ; ++i) {
            int start = (3 * i) + 1;
            for (int j = 0 ; j < 3 ; ++j) {
                expected[i][j] = start + j;
            }
        }
        for (int i = 0 ; i < 3 ; i++) {
            com.google.gson.common.MoreAsserts.assertEquals(expected[i], CollectionTest.toIntArray(target.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelListOfIntegerCollectionsDeserialization_literalMutation960() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelListOfIntegerCollectionsDeserialization_literalMutation960");
        String json = "[[1,2,3],[4,5,6],[7,8,9]]";
        Type collectionType = new TypeToken<java.util.Collection<java.util.Collection<java.lang.Integer>>>() {        }.getType();
        List<java.util.Collection<java.lang.Integer>> target = gson.fromJson(json, collectionType);
        int[][] expected = new int[3][3];
        for (int i = 0 ; i < 4 ; ++i) {
            int start = (3 * i) + 1;
            for (int j = 0 ; j < 3 ; ++j) {
                expected[i][j] = start + j;
            }
        }
        for (int i = 0 ; i < 3 ; i++) {
            com.google.gson.common.MoreAsserts.assertEquals(expected[i], CollectionTest.toIntArray(target.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelListOfIntegerCollectionsDeserialization_literalMutation961() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelListOfIntegerCollectionsDeserialization_literalMutation961");
        String json = "[[1,2,3],[4,5,6],[7,8,9]]";
        Type collectionType = new TypeToken<java.util.Collection<java.util.Collection<java.lang.Integer>>>() {        }.getType();
        List<java.util.Collection<java.lang.Integer>> target = gson.fromJson(json, collectionType);
        int[][] expected = new int[3][3];
        for (int i = 0 ; i < 3 ; ++i) {
            int start = (4 * i) + 1;
            for (int j = 0 ; j < 3 ; ++j) {
                expected[i][j] = start + j;
            }
        }
        for (int i = 0 ; i < 3 ; i++) {
            com.google.gson.common.MoreAsserts.assertEquals(expected[i], CollectionTest.toIntArray(target.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelListOfIntegerCollectionsDeserialization_literalMutation962() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelListOfIntegerCollectionsDeserialization_literalMutation962");
        String json = "[[1,2,3],[4,5,6],[7,8,9]]";
        Type collectionType = new TypeToken<java.util.Collection<java.util.Collection<java.lang.Integer>>>() {        }.getType();
        List<java.util.Collection<java.lang.Integer>> target = gson.fromJson(json, collectionType);
        int[][] expected = new int[3][3];
        for (int i = 0 ; i < 3 ; ++i) {
            int start = (3 * i) + 0;
            for (int j = 0 ; j < 3 ; ++j) {
                expected[i][j] = start + j;
            }
        }
        for (int i = 0 ; i < 3 ; i++) {
            com.google.gson.common.MoreAsserts.assertEquals(expected[i], CollectionTest.toIntArray(target.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelListOfIntegerCollectionsDeserialization_literalMutation963() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelListOfIntegerCollectionsDeserialization_literalMutation963");
        String json = "[[1,2,3],[4,5,6],[7,8,9]]";
        Type collectionType = new TypeToken<java.util.Collection<java.util.Collection<java.lang.Integer>>>() {        }.getType();
        List<java.util.Collection<java.lang.Integer>> target = gson.fromJson(json, collectionType);
        int[][] expected = new int[3][3];
        for (int i = 0 ; i < 3 ; ++i) {
            int start = (3 * i) + 1;
            for (int j = -1 ; j < 3 ; ++j) {
                expected[i][j] = start + j;
            }
        }
        for (int i = 0 ; i < 3 ; i++) {
            com.google.gson.common.MoreAsserts.assertEquals(expected[i], CollectionTest.toIntArray(target.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelListOfIntegerCollectionsDeserialization_literalMutation964() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelListOfIntegerCollectionsDeserialization_literalMutation964");
        String json = "[[1,2,3],[4,5,6],[7,8,9]]";
        Type collectionType = new TypeToken<java.util.Collection<java.util.Collection<java.lang.Integer>>>() {        }.getType();
        List<java.util.Collection<java.lang.Integer>> target = gson.fromJson(json, collectionType);
        int[][] expected = new int[3][3];
        for (int i = 0 ; i < 3 ; ++i) {
            int start = (3 * i) + 1;
            for (int j = 0 ; j < 2 ; ++j) {
                expected[i][j] = start + j;
            }
        }
        for (int i = 0 ; i < 3 ; i++) {
            com.google.gson.common.MoreAsserts.assertEquals(expected[i], CollectionTest.toIntArray(target.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelListOfIntegerCollectionsDeserialization_literalMutation965() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelListOfIntegerCollectionsDeserialization_literalMutation965");
        String json = "[[1,2,3],[4,5,6],[7,8,9]]";
        Type collectionType = new TypeToken<java.util.Collection<java.util.Collection<java.lang.Integer>>>() {        }.getType();
        List<java.util.Collection<java.lang.Integer>> target = gson.fromJson(json, collectionType);
        int[][] expected = new int[3][3];
        for (int i = 0 ; i < 3 ; ++i) {
            int start = (3 * i) + 1;
            for (int j = 0 ; j < 3 ; ++j) {
                expected[i][j] = start + j;
            }
        }
        for (int i = -1 ; i < 3 ; i++) {
            com.google.gson.common.MoreAsserts.assertEquals(expected[i], CollectionTest.toIntArray(target.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelListOfIntegerCollectionsDeserialization_literalMutation966() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelListOfIntegerCollectionsDeserialization_literalMutation966");
        String json = "[[1,2,3],[4,5,6],[7,8,9]]";
        Type collectionType = new TypeToken<java.util.Collection<java.util.Collection<java.lang.Integer>>>() {        }.getType();
        List<java.util.Collection<java.lang.Integer>> target = gson.fromJson(json, collectionType);
        int[][] expected = new int[3][3];
        for (int i = 0 ; i < 3 ; ++i) {
            int start = (3 * i) + 1;
            for (int j = 0 ; j < 3 ; ++j) {
                expected[i][j] = start + j;
            }
        }
        for (int i = 0 ; i < 2 ; i++) {
            com.google.gson.common.MoreAsserts.assertEquals(expected[i], CollectionTest.toIntArray(target.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTopLevelListOfIntegerCollectionsDeserialization_remove815() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelListOfIntegerCollectionsDeserialization_remove815");
        String json = "[[1,2,3],[4,5,6],[7,8,9]]";
        Type collectionType = new TypeToken<java.util.Collection<java.util.Collection<java.lang.Integer>>>() {        }.getType();
        List<java.util.Collection<java.lang.Integer>> target = gson.fromJson(json, collectionType);
        int[][] expected = new int[3][3];
        for (int i = 0 ; i < 3 ; ++i) {
            int start = (3 * i) + 1;
            for (int j = 0 ; j < 3 ; ++j) {
                expected[i][j] = start + j;
            }
        }
        for (int i = 0 ; i < 3 ; i++) {
            com.google.gson.common.MoreAsserts.assertEquals(expected[i], CollectionTest.toIntArray(target.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTopLevelListOfIntegerCollectionsDeserialization_remove816() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelListOfIntegerCollectionsDeserialization_remove816");
        String json = "[[1,2,3],[4,5,6],[7,8,9]]";
        Type collectionType = new TypeToken<java.util.Collection<java.util.Collection<java.lang.Integer>>>() {        }.getType();
        List<java.util.Collection<java.lang.Integer>> target = gson.fromJson(json, collectionType);
        int[][] expected = new int[3][3];
        for (int i = 0 ; i < 3 ; ++i) {
            int start = (3 * i) + 1;
            for (int j = 0 ; j < 3 ; ++j) {
                expected[i][j] = start + j;
            }
        }
        for (int i = 0 ; i < 3 ; i++) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLinkedListSerialization_add959() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListSerialization_add959");
        List<java.lang.String> list = new LinkedList<java.lang.String>();
        list.add("a1");
        list.add("a1");
        list.add("a2");
        Type linkedListType = new TypeToken<java.util.LinkedList<java.lang.String>>() {        }.getType();
        String json = gson.toJson(list, linkedListType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,json,1007,json.contains("a1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,json,1009,json.contains("a2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLinkedListSerialization_add960() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListSerialization_add960");
        List<java.lang.String> list = new LinkedList<java.lang.String>();
        list.add("a1");
        list.add("a2");
        list.add("a2");
        Type linkedListType = new TypeToken<java.util.LinkedList<java.lang.String>>() {        }.getType();
        String json = gson.toJson(list, linkedListType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,json,1007,json.contains("a1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,json,1009,json.contains("a2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLinkedListSerialization_add961() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListSerialization_add961");
        List<java.lang.String> list = new LinkedList<java.lang.String>();
        list.add("a1");
        list.add("a2");
        Type linkedListType = new TypeToken<java.util.LinkedList<java.lang.String>>() {        }.getType();
        String json = gson.toJson(list, linkedListType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,json,1007,json.contains("a1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,json,1009,json.contains("a2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLinkedListSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListSerialization");
        List<java.lang.String> list = new LinkedList<java.lang.String>();
        list.add("foo");
        list.add("a2");
        Type linkedListType = new TypeToken<java.util.LinkedList<java.lang.String>>() {        }.getType();
        String json = gson.toJson(list, linkedListType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,json,1007,json.contains("a1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,json,1009,json.contains("a2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLinkedListSerialization_literalMutation898() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListSerialization_literalMutation898");
        List<java.lang.String> list = new LinkedList<java.lang.String>();
        list.add("a1");
        list.add("foo");
        Type linkedListType = new TypeToken<java.util.LinkedList<java.lang.String>>() {        }.getType();
        String json = gson.toJson(list, linkedListType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,json,1007,json.contains("a1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,json,1009,json.contains("a2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLinkedListSerialization_remove793() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListSerialization_remove793");
        List<java.lang.String> list = new LinkedList<java.lang.String>();
        list.add("a2");
        Type linkedListType = new TypeToken<java.util.LinkedList<java.lang.String>>() {        }.getType();
        String json = gson.toJson(list, linkedListType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,json,1007,json.contains("a1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,json,1009,json.contains("a2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLinkedListSerialization_remove794() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListSerialization_remove794");
        List<java.lang.String> list = new LinkedList<java.lang.String>();
        list.add("a2");
        Type linkedListType = new TypeToken<java.util.LinkedList<java.lang.String>>() {        }.getType();
        String json = gson.toJson(list, linkedListType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,json,1007,json.contains("a1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,json,1009,json.contains("a2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLinkedListSerialization_remove795() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListSerialization_remove795");
        List<java.lang.String> list = new LinkedList<java.lang.String>();
        list.add("a1");
        list.add("a2");
        Type linkedListType = new TypeToken<java.util.LinkedList<java.lang.String>>() {        }.getType();
        String json = gson.toJson(list, linkedListType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,json,1007,json.contains("a1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,json,1009,json.contains("a2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLinkedListDeserialization_add958() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListDeserialization_add958");
        String json = "[\'a1\',\'a2\']";
        Type linkedListType = new TypeToken<java.util.LinkedList<java.lang.String>>() {        }.getType();
        List<java.lang.String> list = gson.fromJson(json, linkedListType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,list,1003,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,list,1005,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLinkedListDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListDeserialization");
        String json = "foo";
        Type linkedListType = new TypeToken<java.util.LinkedList<java.lang.String>>() {        }.getType();
        List<java.lang.String> list = gson.fromJson(json, linkedListType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,list,1003,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,list,1005,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLinkedListDeserialization_remove792() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListDeserialization_remove792");
        String json = "[\'a1\',\'a2\']";
        Type linkedListType = new TypeToken<java.util.LinkedList<java.lang.String>>() {        }.getType();
        List<java.lang.String> list = gson.fromJson(json, linkedListType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,list,1003,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,list,1005,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testQueueSerialization_add972() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueSerialization_add972");
        Queue<java.lang.String> queue = new LinkedList<java.lang.String>();
        queue.add("a1");
        queue.add("a1");
        queue.add("a2");
        Type queueType = new TypeToken<java.util.Queue<java.lang.String>>() {        }.getType();
        String json = gson.toJson(queue, queueType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,json,1021,json.contains("a1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,json,1023,json.contains("a2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testQueueSerialization_add973() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueSerialization_add973");
        Queue<java.lang.String> queue = new LinkedList<java.lang.String>();
        queue.add("a1");
        queue.add("a2");
        queue.add("a2");
        Type queueType = new TypeToken<java.util.Queue<java.lang.String>>() {        }.getType();
        String json = gson.toJson(queue, queueType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,json,1021,json.contains("a1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,json,1023,json.contains("a2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testQueueSerialization_add974() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueSerialization_add974");
        Queue<java.lang.String> queue = new LinkedList<java.lang.String>();
        queue.add("a1");
        queue.add("a2");
        Type queueType = new TypeToken<java.util.Queue<java.lang.String>>() {        }.getType();
        String json = gson.toJson(queue, queueType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,json,1021,json.contains("a1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,json,1023,json.contains("a2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testQueueSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueSerialization");
        Queue<java.lang.String> queue = new LinkedList<java.lang.String>();
        queue.add("foo");
        queue.add("a2");
        Type queueType = new TypeToken<java.util.Queue<java.lang.String>>() {        }.getType();
        String json = gson.toJson(queue, queueType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,json,1021,json.contains("a1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,json,1023,json.contains("a2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testQueueSerialization_literalMutation910() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueSerialization_literalMutation910");
        Queue<java.lang.String> queue = new LinkedList<java.lang.String>();
        queue.add("a1");
        queue.add("foo");
        Type queueType = new TypeToken<java.util.Queue<java.lang.String>>() {        }.getType();
        String json = gson.toJson(queue, queueType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,json,1021,json.contains("a1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,json,1023,json.contains("a2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testQueueSerialization_remove806() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueSerialization_remove806");
        Queue<java.lang.String> queue = new LinkedList<java.lang.String>();
        queue.add("a2");
        Type queueType = new TypeToken<java.util.Queue<java.lang.String>>() {        }.getType();
        String json = gson.toJson(queue, queueType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,json,1021,json.contains("a1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,json,1023,json.contains("a2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testQueueSerialization_remove807() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueSerialization_remove807");
        Queue<java.lang.String> queue = new LinkedList<java.lang.String>();
        queue.add("a2");
        Type queueType = new TypeToken<java.util.Queue<java.lang.String>>() {        }.getType();
        String json = gson.toJson(queue, queueType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,json,1021,json.contains("a1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,json,1023,json.contains("a2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testQueueSerialization_remove808() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueSerialization_remove808");
        Queue<java.lang.String> queue = new LinkedList<java.lang.String>();
        queue.add("a1");
        queue.add("a2");
        Type queueType = new TypeToken<java.util.Queue<java.lang.String>>() {        }.getType();
        String json = gson.toJson(queue, queueType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,json,1021,json.contains("a1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,json,1023,json.contains("a2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testQueueDeserialization_add970() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueDeserialization_add970");
        String json = "[\'a1\',\'a2\']";
        Type queueType = new TypeToken<java.util.Queue<java.lang.String>>() {        }.getType();
        Queue<java.lang.String> queue = gson.fromJson(json, queueType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,queue,1017,queue.element());
        queue.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,queue,1019,queue.element());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testQueueDeserialization_add971() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueDeserialization_add971");
        String json = "[\'a1\',\'a2\']";
        Type queueType = new TypeToken<java.util.Queue<java.lang.String>>() {        }.getType();
        Queue<java.lang.String> queue = gson.fromJson(json, queueType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,queue,1017,queue.element());
        queue.remove();
        queue.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,queue,1019,queue.element());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testQueueDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueDeserialization");
        String json = "foo";
        Type queueType = new TypeToken<java.util.Queue<java.lang.String>>() {        }.getType();
        Queue<java.lang.String> queue = gson.fromJson(json, queueType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,queue,1017,queue.element());
        queue.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,queue,1019,queue.element());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testQueueDeserialization_remove804() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueDeserialization_remove804");
        String json = "[\'a1\',\'a2\']";
        Type queueType = new TypeToken<java.util.Queue<java.lang.String>>() {        }.getType();
        Queue<java.lang.String> queue = gson.fromJson(json, queueType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,queue,1017,queue.element());
        queue.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,queue,1019,queue.element());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testQueueDeserialization_remove805() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueDeserialization_remove805");
        String json = "[\'a1\',\'a2\']";
        Type queueType = new TypeToken<java.util.Queue<java.lang.String>>() {        }.getType();
        Queue<java.lang.String> queue = gson.fromJson(json, queueType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,queue,1017,queue.element());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,queue,1019,queue.element());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullsInListSerialization_add966() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullsInListSerialization_add966");
        List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add("foo");
        list.add("foo");
        list.add(null);
        list.add("bar");
        String expected = "[\"foo\",null,\"bar\"]";
        Type typeOfList = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        String json = gson.toJson(list, typeOfList);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1015,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullsInListSerialization_add967() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullsInListSerialization_add967");
        List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add("foo");
        list.add(null);
        list.add(null);
        list.add("bar");
        String expected = "[\"foo\",null,\"bar\"]";
        Type typeOfList = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        String json = gson.toJson(list, typeOfList);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1015,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullsInListSerialization_add968() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullsInListSerialization_add968");
        List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add("foo");
        list.add(null);
        list.add("bar");
        list.add("bar");
        String expected = "[\"foo\",null,\"bar\"]";
        Type typeOfList = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        String json = gson.toJson(list, typeOfList);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1015,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullsInListSerialization_add969() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullsInListSerialization_add969");
        List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add("foo");
        list.add(null);
        list.add("bar");
        String expected = "[\"foo\",null,\"bar\"]";
        Type typeOfList = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        String json = gson.toJson(list, typeOfList);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1015,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullsInListSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullsInListSerialization");
        List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add("foo");
        list.add(null);
        list.add("bar");
        String expected = "[\"foo\",null,\"bar\"]";
        Type typeOfList = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        String json = gson.toJson(list, typeOfList);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1015,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullsInListSerialization_literalMutation906() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullsInListSerialization_literalMutation906");
        List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add("foo");
        list.add(null);
        list.add("foo");
        String expected = "[\"foo\",null,\"bar\"]";
        Type typeOfList = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        String json = gson.toJson(list, typeOfList);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1015,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullsInListSerialization_literalMutation907() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullsInListSerialization_literalMutation907");
        List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add("foo");
        list.add(null);
        list.add("bar");
        String expected = "foo";
        Type typeOfList = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        String json = gson.toJson(list, typeOfList);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1015,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullsInListSerialization_remove800() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullsInListSerialization_remove800");
        List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(null);
        list.add("bar");
        String expected = "[\"foo\",null,\"bar\"]";
        Type typeOfList = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        String json = gson.toJson(list, typeOfList);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1015,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullsInListSerialization_remove801() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullsInListSerialization_remove801");
        List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(null);
        list.add("bar");
        String expected = "[\"foo\",null,\"bar\"]";
        Type typeOfList = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        String json = gson.toJson(list, typeOfList);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1015,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullsInListSerialization_remove802() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullsInListSerialization_remove802");
        List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(null);
        list.add("bar");
        String expected = "[\"foo\",null,\"bar\"]";
        Type typeOfList = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        String json = gson.toJson(list, typeOfList);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1015,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullsInListSerialization_remove803() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullsInListSerialization_remove803");
        List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add("foo");
        list.add(null);
        list.add("bar");
        String expected = "[\"foo\",null,\"bar\"]";
        Type typeOfList = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        String json = gson.toJson(list, typeOfList);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1015,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullsInListDeserialization_add962() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullsInListDeserialization_add962");
        List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add("foo");
        expected.add("foo");
        expected.add(null);
        expected.add("bar");
        String json = "[\"foo\",null,\"bar\"]";
        Type expectedType = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        List<java.lang.String> target = gson.fromJson(json, expectedType);
        for (int i = 0 ; i < (expected.size()) ; ++i) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,expected,1011,expected.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,target,1013,target.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullsInListDeserialization_add963() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullsInListDeserialization_add963");
        List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add("foo");
        expected.add(null);
        expected.add(null);
        expected.add("bar");
        String json = "[\"foo\",null,\"bar\"]";
        Type expectedType = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        List<java.lang.String> target = gson.fromJson(json, expectedType);
        for (int i = 0 ; i < (expected.size()) ; ++i) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,expected,1011,expected.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,target,1013,target.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullsInListDeserialization_add964() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullsInListDeserialization_add964");
        List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add("foo");
        expected.add(null);
        expected.add("bar");
        expected.add("bar");
        String json = "[\"foo\",null,\"bar\"]";
        Type expectedType = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        List<java.lang.String> target = gson.fromJson(json, expectedType);
        for (int i = 0 ; i < (expected.size()) ; ++i) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,expected,1011,expected.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,target,1013,target.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullsInListDeserialization_add965() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullsInListDeserialization_add965");
        List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add("foo");
        expected.add(null);
        expected.add("bar");
        String json = "[\"foo\",null,\"bar\"]";
        Type expectedType = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        List<java.lang.String> target = gson.fromJson(json, expectedType);
        for (int i = 0 ; i < (expected.size()) ; ++i) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,expected,1011,expected.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,target,1013,target.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullsInListDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullsInListDeserialization");
        List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add("foo");
        expected.add(null);
        expected.add("bar");
        String json = "[\"foo\",null,\"bar\"]";
        Type expectedType = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        List<java.lang.String> target = gson.fromJson(json, expectedType);
        for (int i = 0 ; i < (expected.size()) ; ++i) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,expected,1011,expected.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,target,1013,target.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullsInListDeserialization_literalMutation901() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullsInListDeserialization_literalMutation901");
        List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add("foo");
        expected.add(null);
        expected.add("foo");
        String json = "[\"foo\",null,\"bar\"]";
        Type expectedType = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        List<java.lang.String> target = gson.fromJson(json, expectedType);
        for (int i = 0 ; i < (expected.size()) ; ++i) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,expected,1011,expected.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,target,1013,target.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullsInListDeserialization_literalMutation902() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullsInListDeserialization_literalMutation902");
        List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add("foo");
        expected.add(null);
        expected.add("bar");
        String json = "foo";
        Type expectedType = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        List<java.lang.String> target = gson.fromJson(json, expectedType);
        for (int i = 0 ; i < (expected.size()) ; ++i) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,expected,1011,expected.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,target,1013,target.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullsInListDeserialization_literalMutation903() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullsInListDeserialization_literalMutation903");
        List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add("foo");
        expected.add(null);
        expected.add("bar");
        String json = "[\"foo\",null,\"bar\"]";
        Type expectedType = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        List<java.lang.String> target = gson.fromJson(json, expectedType);
        for (int i = -1 ; i < (expected.size()) ; ++i) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,expected,1011,expected.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,target,1013,target.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullsInListDeserialization_remove796() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullsInListDeserialization_remove796");
        List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(null);
        expected.add("bar");
        String json = "[\"foo\",null,\"bar\"]";
        Type expectedType = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        List<java.lang.String> target = gson.fromJson(json, expectedType);
        for (int i = 0 ; i < (expected.size()) ; ++i) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,expected,1011,expected.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,target,1013,target.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullsInListDeserialization_remove797() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullsInListDeserialization_remove797");
        List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(null);
        expected.add("bar");
        String json = "[\"foo\",null,\"bar\"]";
        Type expectedType = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        List<java.lang.String> target = gson.fromJson(json, expectedType);
        for (int i = 0 ; i < (expected.size()) ; ++i) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,expected,1011,expected.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,target,1013,target.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullsInListDeserialization_remove798() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullsInListDeserialization_remove798");
        List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(null);
        expected.add("bar");
        String json = "[\"foo\",null,\"bar\"]";
        Type expectedType = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        List<java.lang.String> target = gson.fromJson(json, expectedType);
        for (int i = 0 ; i < (expected.size()) ; ++i) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,expected,1011,expected.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,target,1013,target.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullsInListDeserialization_remove799() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullsInListDeserialization_remove799");
        List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add("foo");
        expected.add(null);
        expected.add("bar");
        String json = "[\"foo\",null,\"bar\"]";
        Type expectedType = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        List<java.lang.String> target = gson.fromJson(json, expectedType);
        for (int i = 0 ; i < (expected.size()) ; ++i) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,expected,1011,expected.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,target,1013,target.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCollectionOfObjectSerialization_add946() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfObjectSerialization_add946");
        List<java.lang.Object> target = new ArrayList<java.lang.Object>();
        target.add("Hello");
        target.add("Hello");
        target.add("World");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),986,gson,985,gson.toJson(target));
        Type type = new TypeToken<java.util.List<java.lang.Object>>() {        }.getType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),988,gson,987,gson.toJson(target, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCollectionOfObjectSerialization_add947() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfObjectSerialization_add947");
        List<java.lang.Object> target = new ArrayList<java.lang.Object>();
        target.add("Hello");
        target.add("World");
        target.add("World");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),986,gson,985,gson.toJson(target));
        Type type = new TypeToken<java.util.List<java.lang.Object>>() {        }.getType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),988,gson,987,gson.toJson(target, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCollectionOfObjectSerialization_add948() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfObjectSerialization_add948");
        List<java.lang.Object> target = new ArrayList<java.lang.Object>();
        target.add("Hello");
        target.add("World");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),986,gson,985,gson.toJson(target));
        Type type = new TypeToken<java.util.List<java.lang.Object>>() {        }.getType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),988,gson,987,gson.toJson(target, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCollectionOfObjectSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfObjectSerialization");
        List<java.lang.Object> target = new ArrayList<java.lang.Object>();
        target.add("foo");
        target.add("World");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),986,gson,985,gson.toJson(target));
        Type type = new TypeToken<java.util.List<java.lang.Object>>() {        }.getType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),988,gson,987,gson.toJson(target, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCollectionOfObjectSerialization_literalMutation886() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfObjectSerialization_literalMutation886");
        List<java.lang.Object> target = new ArrayList<java.lang.Object>();
        target.add("Hello");
        target.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),986,gson,985,gson.toJson(target));
        Type type = new TypeToken<java.util.List<java.lang.Object>>() {        }.getType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),988,gson,987,gson.toJson(target, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCollectionOfObjectSerialization_remove780() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfObjectSerialization_remove780");
        List<java.lang.Object> target = new ArrayList<java.lang.Object>();
        target.add("World");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),986,gson,985,gson.toJson(target));
        Type type = new TypeToken<java.util.List<java.lang.Object>>() {        }.getType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),988,gson,987,gson.toJson(target, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCollectionOfObjectSerialization_remove781() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfObjectSerialization_remove781");
        List<java.lang.Object> target = new ArrayList<java.lang.Object>();
        target.add("World");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),986,gson,985,gson.toJson(target));
        Type type = new TypeToken<java.util.List<java.lang.Object>>() {        }.getType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),988,gson,987,gson.toJson(target, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCollectionOfObjectSerialization_remove782() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfObjectSerialization_remove782");
        List<java.lang.Object> target = new ArrayList<java.lang.Object>();
        target.add("Hello");
        target.add("World");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),986,gson,985,gson.toJson(target));
        Type type = new TypeToken<java.util.List<java.lang.Object>>() {        }.getType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),988,gson,987,gson.toJson(target, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCollectionOfObjectWithNullSerialization_add949() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfObjectWithNullSerialization_add949");
        List<java.lang.Object> target = new ArrayList<java.lang.Object>();
        target.add("Hello");
        target.add("Hello");
        target.add(null);
        target.add("World");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),990,gson,989,gson.toJson(target));
        Type type = new TypeToken<java.util.List<java.lang.Object>>() {        }.getType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),992,gson,991,gson.toJson(target, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCollectionOfObjectWithNullSerialization_add950() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfObjectWithNullSerialization_add950");
        List<java.lang.Object> target = new ArrayList<java.lang.Object>();
        target.add("Hello");
        target.add(null);
        target.add(null);
        target.add("World");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),990,gson,989,gson.toJson(target));
        Type type = new TypeToken<java.util.List<java.lang.Object>>() {        }.getType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),992,gson,991,gson.toJson(target, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCollectionOfObjectWithNullSerialization_add951() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfObjectWithNullSerialization_add951");
        List<java.lang.Object> target = new ArrayList<java.lang.Object>();
        target.add("Hello");
        target.add(null);
        target.add("World");
        target.add("World");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),990,gson,989,gson.toJson(target));
        Type type = new TypeToken<java.util.List<java.lang.Object>>() {        }.getType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),992,gson,991,gson.toJson(target, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCollectionOfObjectWithNullSerialization_add952() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfObjectWithNullSerialization_add952");
        List<java.lang.Object> target = new ArrayList<java.lang.Object>();
        target.add("Hello");
        target.add(null);
        target.add("World");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),990,gson,989,gson.toJson(target));
        Type type = new TypeToken<java.util.List<java.lang.Object>>() {        }.getType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),992,gson,991,gson.toJson(target, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCollectionOfObjectWithNullSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfObjectWithNullSerialization");
        List<java.lang.Object> target = new ArrayList<java.lang.Object>();
        target.add("foo");
        target.add(null);
        target.add("World");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),990,gson,989,gson.toJson(target));
        Type type = new TypeToken<java.util.List<java.lang.Object>>() {        }.getType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),992,gson,991,gson.toJson(target, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCollectionOfObjectWithNullSerialization_literalMutation889() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfObjectWithNullSerialization_literalMutation889");
        List<java.lang.Object> target = new ArrayList<java.lang.Object>();
        target.add("Hello");
        target.add(null);
        target.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),990,gson,989,gson.toJson(target));
        Type type = new TypeToken<java.util.List<java.lang.Object>>() {        }.getType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),992,gson,991,gson.toJson(target, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCollectionOfObjectWithNullSerialization_remove783() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfObjectWithNullSerialization_remove783");
        List<java.lang.Object> target = new ArrayList<java.lang.Object>();
        target.add(null);
        target.add("World");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),990,gson,989,gson.toJson(target));
        Type type = new TypeToken<java.util.List<java.lang.Object>>() {        }.getType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),992,gson,991,gson.toJson(target, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCollectionOfObjectWithNullSerialization_remove784() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfObjectWithNullSerialization_remove784");
        List<java.lang.Object> target = new ArrayList<java.lang.Object>();
        target.add(null);
        target.add("World");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),990,gson,989,gson.toJson(target));
        Type type = new TypeToken<java.util.List<java.lang.Object>>() {        }.getType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),992,gson,991,gson.toJson(target, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCollectionOfObjectWithNullSerialization_remove785() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfObjectWithNullSerialization_remove785");
        List<java.lang.Object> target = new ArrayList<java.lang.Object>();
        target.add(null);
        target.add("World");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),990,gson,989,gson.toJson(target));
        Type type = new TypeToken<java.util.List<java.lang.Object>>() {        }.getType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),992,gson,991,gson.toJson(target, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCollectionOfObjectWithNullSerialization_remove786() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfObjectWithNullSerialization_remove786");
        List<java.lang.Object> target = new ArrayList<java.lang.Object>();
        target.add("Hello");
        target.add(null);
        target.add("World");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),990,gson,989,gson.toJson(target));
        Type type = new TypeToken<java.util.List<java.lang.Object>>() {        }.getType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),992,gson,991,gson.toJson(target, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCollectionOfStringsSerialization_add954() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfStringsSerialization_add954");
        List<java.lang.String> target = new ArrayList<java.lang.String>();
        target.add("Hello");
        target.add("Hello");
        target.add("World");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCollectionOfStringsSerialization_add955() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfStringsSerialization_add955");
        List<java.lang.String> target = new ArrayList<java.lang.String>();
        target.add("Hello");
        target.add("World");
        target.add("World");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCollectionOfStringsSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfStringsSerialization");
        List<java.lang.String> target = new ArrayList<java.lang.String>();
        target.add("foo");
        target.add("World");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCollectionOfStringsSerialization_literalMutation892() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfStringsSerialization_literalMutation892");
        List<java.lang.String> target = new ArrayList<java.lang.String>();
        target.add("Hello");
        target.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCollectionOfStringsSerialization_remove788() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfStringsSerialization_remove788");
        List<java.lang.String> target = new ArrayList<java.lang.String>();
        target.add("World");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCollectionOfStringsSerialization_remove789() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfStringsSerialization_remove789");
        List<java.lang.String> target = new ArrayList<java.lang.String>();
        target.add("World");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCollectionOfBagOfPrimitivesSerialization_add944() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfBagOfPrimitivesSerialization_add944");
        List<com.google.gson.common.TestTypes.BagOfPrimitives> target = new ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        TestTypes.BagOfPrimitives objA = new TestTypes.BagOfPrimitives(3L , 1 , true , "blah");
        TestTypes.BagOfPrimitives objB = new TestTypes.BagOfPrimitives(2L , 6 , false , "blahB");
        target.add(objA);
        target.add(objA);
        target.add(objB);
        String result = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),980,result,979,result.startsWith("["));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),982,result,981,result.endsWith("]"));
        for (TestTypes.BagOfPrimitives obj : target) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),984,result,983,result.contains(obj.getExpectedJson()));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCollectionOfBagOfPrimitivesSerialization_add945() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfBagOfPrimitivesSerialization_add945");
        List<com.google.gson.common.TestTypes.BagOfPrimitives> target = new ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        TestTypes.BagOfPrimitives objA = new TestTypes.BagOfPrimitives(3L , 1 , true , "blah");
        TestTypes.BagOfPrimitives objB = new TestTypes.BagOfPrimitives(2L , 6 , false , "blahB");
        target.add(objA);
        target.add(objB);
        target.add(objB);
        String result = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),980,result,979,result.startsWith("["));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),982,result,981,result.endsWith("]"));
        for (TestTypes.BagOfPrimitives obj : target) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),984,result,983,result.contains(obj.getExpectedJson()));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCollectionOfBagOfPrimitivesSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfBagOfPrimitivesSerialization");
        List<com.google.gson.common.TestTypes.BagOfPrimitives> target = new ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        TestTypes.BagOfPrimitives objA = new TestTypes.BagOfPrimitives(2L , 1 , true , "blah");
        TestTypes.BagOfPrimitives objB = new TestTypes.BagOfPrimitives(2L , 6 , false , "blahB");
        target.add(objA);
        target.add(objB);
        String result = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),980,result,979,result.startsWith("["));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),982,result,981,result.endsWith("]"));
        for (TestTypes.BagOfPrimitives obj : target) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),984,result,983,result.contains(obj.getExpectedJson()));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCollectionOfBagOfPrimitivesSerialization_literalMutation878() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfBagOfPrimitivesSerialization_literalMutation878");
        List<com.google.gson.common.TestTypes.BagOfPrimitives> target = new ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        TestTypes.BagOfPrimitives objA = new TestTypes.BagOfPrimitives(3L , 0 , true , "blah");
        TestTypes.BagOfPrimitives objB = new TestTypes.BagOfPrimitives(2L , 6 , false , "blahB");
        target.add(objA);
        target.add(objB);
        String result = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),980,result,979,result.startsWith("["));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),982,result,981,result.endsWith("]"));
        for (TestTypes.BagOfPrimitives obj : target) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),984,result,983,result.contains(obj.getExpectedJson()));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCollectionOfBagOfPrimitivesSerialization_literalMutation879() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfBagOfPrimitivesSerialization_literalMutation879");
        List<com.google.gson.common.TestTypes.BagOfPrimitives> target = new ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        TestTypes.BagOfPrimitives objA = new TestTypes.BagOfPrimitives(3L , 1 , false , "blah");
        TestTypes.BagOfPrimitives objB = new TestTypes.BagOfPrimitives(2L , 6 , false , "blahB");
        target.add(objA);
        target.add(objB);
        String result = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),980,result,979,result.startsWith("["));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),982,result,981,result.endsWith("]"));
        for (TestTypes.BagOfPrimitives obj : target) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),984,result,983,result.contains(obj.getExpectedJson()));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCollectionOfBagOfPrimitivesSerialization_literalMutation880() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfBagOfPrimitivesSerialization_literalMutation880");
        List<com.google.gson.common.TestTypes.BagOfPrimitives> target = new ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        TestTypes.BagOfPrimitives objA = new TestTypes.BagOfPrimitives(3L , 1 , true , "foo");
        TestTypes.BagOfPrimitives objB = new TestTypes.BagOfPrimitives(2L , 6 , false , "blahB");
        target.add(objA);
        target.add(objB);
        String result = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),980,result,979,result.startsWith("["));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),982,result,981,result.endsWith("]"));
        for (TestTypes.BagOfPrimitives obj : target) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),984,result,983,result.contains(obj.getExpectedJson()));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCollectionOfBagOfPrimitivesSerialization_literalMutation881() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfBagOfPrimitivesSerialization_literalMutation881");
        List<com.google.gson.common.TestTypes.BagOfPrimitives> target = new ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        TestTypes.BagOfPrimitives objA = new TestTypes.BagOfPrimitives(3L , 1 , true , "blah");
        TestTypes.BagOfPrimitives objB = new TestTypes.BagOfPrimitives(3L , 6 , false , "blahB");
        target.add(objA);
        target.add(objB);
        String result = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),980,result,979,result.startsWith("["));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),982,result,981,result.endsWith("]"));
        for (TestTypes.BagOfPrimitives obj : target) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),984,result,983,result.contains(obj.getExpectedJson()));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCollectionOfBagOfPrimitivesSerialization_literalMutation882() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfBagOfPrimitivesSerialization_literalMutation882");
        List<com.google.gson.common.TestTypes.BagOfPrimitives> target = new ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        TestTypes.BagOfPrimitives objA = new TestTypes.BagOfPrimitives(3L , 1 , true , "blah");
        TestTypes.BagOfPrimitives objB = new TestTypes.BagOfPrimitives(2L , 5 , false , "blahB");
        target.add(objA);
        target.add(objB);
        String result = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),980,result,979,result.startsWith("["));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),982,result,981,result.endsWith("]"));
        for (TestTypes.BagOfPrimitives obj : target) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),984,result,983,result.contains(obj.getExpectedJson()));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCollectionOfBagOfPrimitivesSerialization_literalMutation883() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfBagOfPrimitivesSerialization_literalMutation883");
        List<com.google.gson.common.TestTypes.BagOfPrimitives> target = new ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        TestTypes.BagOfPrimitives objA = new TestTypes.BagOfPrimitives(3L , 1 , true , "blah");
        TestTypes.BagOfPrimitives objB = new TestTypes.BagOfPrimitives(2L , 6 , false , "blahB");
        target.add(objA);
        target.add(objB);
        String result = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),980,result,979,result.startsWith("["));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),982,result,981,result.endsWith("]"));
        for (TestTypes.BagOfPrimitives obj : target) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),984,result,983,result.contains(obj.getExpectedJson()));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCollectionOfBagOfPrimitivesSerialization_literalMutation884() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfBagOfPrimitivesSerialization_literalMutation884");
        List<com.google.gson.common.TestTypes.BagOfPrimitives> target = new ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        TestTypes.BagOfPrimitives objA = new TestTypes.BagOfPrimitives(3L , 1 , true , "blah");
        TestTypes.BagOfPrimitives objB = new TestTypes.BagOfPrimitives(2L , 6 , false , "foo");
        target.add(objA);
        target.add(objB);
        String result = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),980,result,979,result.startsWith("["));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),982,result,981,result.endsWith("]"));
        for (TestTypes.BagOfPrimitives obj : target) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),984,result,983,result.contains(obj.getExpectedJson()));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCollectionOfBagOfPrimitivesSerialization_remove778() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfBagOfPrimitivesSerialization_remove778");
        List<com.google.gson.common.TestTypes.BagOfPrimitives> target = new ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        TestTypes.BagOfPrimitives objA = new TestTypes.BagOfPrimitives(3L , 1 , true , "blah");
        TestTypes.BagOfPrimitives objB = new TestTypes.BagOfPrimitives(2L , 6 , false , "blahB");
        target.add(objB);
        String result = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),980,result,979,result.startsWith("["));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),982,result,981,result.endsWith("]"));
        for (TestTypes.BagOfPrimitives obj : target) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),984,result,983,result.contains(obj.getExpectedJson()));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCollectionOfBagOfPrimitivesSerialization_remove779() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfBagOfPrimitivesSerialization_remove779");
        List<com.google.gson.common.TestTypes.BagOfPrimitives> target = new ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        TestTypes.BagOfPrimitives objA = new TestTypes.BagOfPrimitives(3L , 1 , true , "blah");
        TestTypes.BagOfPrimitives objB = new TestTypes.BagOfPrimitives(2L , 6 , false , "blahB");
        target.add(objB);
        String result = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),980,result,979,result.startsWith("["));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),982,result,981,result.endsWith("]"));
        for (TestTypes.BagOfPrimitives obj : target) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),984,result,983,result.contains(obj.getExpectedJson()));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCollectionOfStringsDeserialization_add953() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfStringsDeserialization_add953");
        String json = "[\"Hello\",\"World\"]";
        Type collectionType = new TypeToken<java.util.Collection<java.lang.String>>() {        }.getType();
        Collection<java.lang.String> target = gson.fromJson(json, collectionType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,target,993,target.contains("Hello"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,target,995,target.contains("World"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCollectionOfStringsDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfStringsDeserialization");
        String json = "foo";
        Type collectionType = new TypeToken<java.util.Collection<java.lang.String>>() {        }.getType();
        Collection<java.lang.String> target = gson.fromJson(json, collectionType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,target,993,target.contains("Hello"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,target,995,target.contains("World"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCollectionOfStringsDeserialization_remove787() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfStringsDeserialization_remove787");
        String json = "[\"Hello\",\"World\"]";
        Type collectionType = new TypeToken<java.util.Collection<java.lang.String>>() {        }.getType();
        Collection<java.lang.String> target = gson.fromJson(json, collectionType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,target,993,target.contains("Hello"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,target,995,target.contains("World"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRawCollectionOfIntegersSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRawCollectionOfIntegersSerialization");
        Collection<java.lang.Integer> target = java.util.Arrays.asList(2, 2, 3, 4, 5, 6, 7, 8, 9);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,gson,1040,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRawCollectionOfIntegersSerialization_literalMutation924() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRawCollectionOfIntegersSerialization_literalMutation924");
        Collection<java.lang.Integer> target = java.util.Arrays.asList(1, 3, 3, 4, 5, 6, 7, 8, 9);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,gson,1040,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRawCollectionOfIntegersSerialization_literalMutation925() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRawCollectionOfIntegersSerialization_literalMutation925");
        Collection<java.lang.Integer> target = java.util.Arrays.asList(1, 2, 4, 4, 5, 6, 7, 8, 9);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,gson,1040,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRawCollectionOfIntegersSerialization_literalMutation926() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRawCollectionOfIntegersSerialization_literalMutation926");
        Collection<java.lang.Integer> target = java.util.Arrays.asList(1, 2, 3, 3, 5, 6, 7, 8, 9);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,gson,1040,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRawCollectionOfIntegersSerialization_literalMutation927() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRawCollectionOfIntegersSerialization_literalMutation927");
        Collection<java.lang.Integer> target = java.util.Arrays.asList(1, 2, 3, 4, 6, 6, 7, 8, 9);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,gson,1040,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRawCollectionOfIntegersSerialization_literalMutation928() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRawCollectionOfIntegersSerialization_literalMutation928");
        Collection<java.lang.Integer> target = java.util.Arrays.asList(1, 2, 3, 4, 5, 5, 7, 8, 9);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,gson,1040,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRawCollectionOfIntegersSerialization_literalMutation929() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRawCollectionOfIntegersSerialization_literalMutation929");
        Collection<java.lang.Integer> target = java.util.Arrays.asList(1, 2, 3, 4, 5, 6, 6, 8, 9);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,gson,1040,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRawCollectionOfIntegersSerialization_literalMutation930() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRawCollectionOfIntegersSerialization_literalMutation930");
        Collection<java.lang.Integer> target = java.util.Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 9);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,gson,1040,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRawCollectionOfIntegersSerialization_literalMutation931() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRawCollectionOfIntegersSerialization_literalMutation931");
        Collection<java.lang.Integer> target = java.util.Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 8);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,gson,1040,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "rawtypes")
    public void testRawCollectionSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRawCollectionSerialization");
        TestTypes.BagOfPrimitives bag1 = new TestTypes.BagOfPrimitives();
        Collection target = java.util.Arrays.asList(bag1, bag1);
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1043,json,1042,json.contains(bag1.getExpectedJson()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "rawtypes")
    public void testRawCollectionDeserializationNotAlllowed() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRawCollectionDeserializationNotAlllowed");
        String json = "[0,1,2,3,4,5,6,7,8,9]";
        Collection integers = gson.fromJson(json, Collection.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,null,1025,java.util.Arrays.asList(0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,integers);
        json = "[\"Hello\", \"World\"]";
        Collection strings = gson.fromJson(json, Collection.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,strings,1028,strings.contains("Hello"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,strings,1030,strings.contains("World"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "rawtypes")
    public void testRawCollectionDeserializationNotAlllowed_literalMutation912() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRawCollectionDeserializationNotAlllowed_literalMutation912");
        String json = "foo";
        Collection integers = gson.fromJson(json, Collection.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,null,1025,java.util.Arrays.asList(0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,integers);
        json = "[\"Hello\", \"World\"]";
        Collection strings = gson.fromJson(json, Collection.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,strings,1028,strings.contains("Hello"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,strings,1030,strings.contains("World"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "rawtypes")
    public void testRawCollectionDeserializationNotAlllowed_literalMutation913() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRawCollectionDeserializationNotAlllowed_literalMutation913");
        String json = "[0,1,2,3,4,5,6,7,8,9]";
        Collection integers = gson.fromJson(json, Collection.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,null,1025,java.util.Arrays.asList(0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,integers);
        json = "foo";
        Collection strings = gson.fromJson(json, Collection.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,strings,1028,strings.contains("Hello"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,strings,1030,strings.contains("World"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "foo" , "unchecked" })
    public void testRawCollectionOfBagOfPrimitivesNotAllowed() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRawCollectionOfBagOfPrimitivesNotAllowed");
        TestTypes.BagOfPrimitives bag = new TestTypes.BagOfPrimitives(10 , 20 , false , "stringValue");
        String json = ((('[' + (bag.getExpectedJson())) + ',') + (bag.getExpectedJson())) + ']';
        Collection target = gson.fromJson(json, Collection.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,target,1032,target.size());
        for (Object bag1 : target) {
            Map<java.lang.String, java.lang.Object> values = ((Map<java.lang.String, java.lang.Object>)(bag1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,values,1034,values.containsValue(10.0));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,values,1036,values.containsValue(20.0));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,values,1038,values.containsValue("stringValue"));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "rawtypes" , "foo" })
    public void testRawCollectionOfBagOfPrimitivesNotAllowed_literalMutation915() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRawCollectionOfBagOfPrimitivesNotAllowed_literalMutation915");
        TestTypes.BagOfPrimitives bag = new TestTypes.BagOfPrimitives(10 , 20 , false , "stringValue");
        String json = ((('[' + (bag.getExpectedJson())) + ',') + (bag.getExpectedJson())) + ']';
        Collection target = gson.fromJson(json, Collection.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,target,1032,target.size());
        for (Object bag1 : target) {
            Map<java.lang.String, java.lang.Object> values = ((Map<java.lang.String, java.lang.Object>)(bag1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,values,1034,values.containsValue(10.0));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,values,1036,values.containsValue(20.0));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,values,1038,values.containsValue("stringValue"));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "rawtypes" , "unchecked" })
    public void testRawCollectionOfBagOfPrimitivesNotAllowed_literalMutation916() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRawCollectionOfBagOfPrimitivesNotAllowed_literalMutation916");
        TestTypes.BagOfPrimitives bag = new TestTypes.BagOfPrimitives(11 , 20 , false , "stringValue");
        String json = ((('[' + (bag.getExpectedJson())) + ',') + (bag.getExpectedJson())) + ']';
        Collection target = gson.fromJson(json, Collection.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,target,1032,target.size());
        for (Object bag1 : target) {
            Map<java.lang.String, java.lang.Object> values = ((Map<java.lang.String, java.lang.Object>)(bag1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,values,1034,values.containsValue(10.0));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,values,1036,values.containsValue(20.0));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,values,1038,values.containsValue("stringValue"));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "rawtypes" , "unchecked" })
    public void testRawCollectionOfBagOfPrimitivesNotAllowed_literalMutation917() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRawCollectionOfBagOfPrimitivesNotAllowed_literalMutation917");
        TestTypes.BagOfPrimitives bag = new TestTypes.BagOfPrimitives(10 , 19 , false , "stringValue");
        String json = ((('[' + (bag.getExpectedJson())) + ',') + (bag.getExpectedJson())) + ']';
        Collection target = gson.fromJson(json, Collection.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,target,1032,target.size());
        for (Object bag1 : target) {
            Map<java.lang.String, java.lang.Object> values = ((Map<java.lang.String, java.lang.Object>)(bag1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,values,1034,values.containsValue(10.0));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,values,1036,values.containsValue(20.0));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,values,1038,values.containsValue("stringValue"));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "rawtypes" , "unchecked" })
    public void testRawCollectionOfBagOfPrimitivesNotAllowed_literalMutation918() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRawCollectionOfBagOfPrimitivesNotAllowed_literalMutation918");
        TestTypes.BagOfPrimitives bag = new TestTypes.BagOfPrimitives(10 , 20 , false , "stringValue");
        String json = ((('[' + (bag.getExpectedJson())) + ',') + (bag.getExpectedJson())) + ']';
        Collection target = gson.fromJson(json, Collection.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,target,1032,target.size());
        for (Object bag1 : target) {
            Map<java.lang.String, java.lang.Object> values = ((Map<java.lang.String, java.lang.Object>)(bag1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,values,1034,values.containsValue(10.0));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,values,1036,values.containsValue(20.0));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,values,1038,values.containsValue("stringValue"));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "rawtypes" , "unchecked" })
    public void testRawCollectionOfBagOfPrimitivesNotAllowed_literalMutation919() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRawCollectionOfBagOfPrimitivesNotAllowed_literalMutation919");
        TestTypes.BagOfPrimitives bag = new TestTypes.BagOfPrimitives(10 , 20 , false , "foo");
        String json = ((('[' + (bag.getExpectedJson())) + ',') + (bag.getExpectedJson())) + ']';
        Collection target = gson.fromJson(json, Collection.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,target,1032,target.size());
        for (Object bag1 : target) {
            Map<java.lang.String, java.lang.Object> values = ((Map<java.lang.String, java.lang.Object>)(bag1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,values,1034,values.containsValue(10.0));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,values,1036,values.containsValue(20.0));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,values,1038,values.containsValue("stringValue"));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWildcardPrimitiveCollectionSerilaization_add988() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWildcardPrimitiveCollectionSerilaization_add988");
        Collection<? extends java.lang.Integer> target = java.util.Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Type collectionType = new TypeToken<java.util.Collection<? extends java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(target, collectionType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,json);
        json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1071,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWildcardPrimitiveCollectionSerilaization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWildcardPrimitiveCollectionSerilaization");
        Collection<? extends java.lang.Integer> target = java.util.Arrays.asList(0, 2, 3, 4, 5, 6, 7, 8, 9);
        Type collectionType = new TypeToken<java.util.Collection<? extends java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(target, collectionType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,json);
        json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1071,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWildcardPrimitiveCollectionSerilaization_literalMutation980() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWildcardPrimitiveCollectionSerilaization_literalMutation980");
        Collection<? extends java.lang.Integer> target = java.util.Arrays.asList(1, 1, 3, 4, 5, 6, 7, 8, 9);
        Type collectionType = new TypeToken<java.util.Collection<? extends java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(target, collectionType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,json);
        json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1071,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWildcardPrimitiveCollectionSerilaization_literalMutation981() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWildcardPrimitiveCollectionSerilaization_literalMutation981");
        Collection<? extends java.lang.Integer> target = java.util.Arrays.asList(1, 2, 2, 4, 5, 6, 7, 8, 9);
        Type collectionType = new TypeToken<java.util.Collection<? extends java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(target, collectionType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,json);
        json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1071,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWildcardPrimitiveCollectionSerilaization_literalMutation982() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWildcardPrimitiveCollectionSerilaization_literalMutation982");
        Collection<? extends java.lang.Integer> target = java.util.Arrays.asList(1, 2, 3, 5, 5, 6, 7, 8, 9);
        Type collectionType = new TypeToken<java.util.Collection<? extends java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(target, collectionType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,json);
        json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1071,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWildcardPrimitiveCollectionSerilaization_literalMutation983() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWildcardPrimitiveCollectionSerilaization_literalMutation983");
        Collection<? extends java.lang.Integer> target = java.util.Arrays.asList(1, 2, 3, 4, 6, 6, 7, 8, 9);
        Type collectionType = new TypeToken<java.util.Collection<? extends java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(target, collectionType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,json);
        json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1071,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWildcardPrimitiveCollectionSerilaization_literalMutation984() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWildcardPrimitiveCollectionSerilaization_literalMutation984");
        Collection<? extends java.lang.Integer> target = java.util.Arrays.asList(1, 2, 3, 4, 5, 5, 7, 8, 9);
        Type collectionType = new TypeToken<java.util.Collection<? extends java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(target, collectionType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,json);
        json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1071,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWildcardPrimitiveCollectionSerilaization_literalMutation985() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWildcardPrimitiveCollectionSerilaization_literalMutation985");
        Collection<? extends java.lang.Integer> target = java.util.Arrays.asList(1, 2, 3, 4, 5, 6, 8, 8, 9);
        Type collectionType = new TypeToken<java.util.Collection<? extends java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(target, collectionType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,json);
        json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1071,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWildcardPrimitiveCollectionSerilaization_literalMutation986() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWildcardPrimitiveCollectionSerilaization_literalMutation986");
        Collection<? extends java.lang.Integer> target = java.util.Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 9);
        Type collectionType = new TypeToken<java.util.Collection<? extends java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(target, collectionType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,json);
        json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1071,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWildcardPrimitiveCollectionSerilaization_literalMutation987() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWildcardPrimitiveCollectionSerilaization_literalMutation987");
        Collection<? extends java.lang.Integer> target = java.util.Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 8);
        Type collectionType = new TypeToken<java.util.Collection<? extends java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(target, collectionType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,json);
        json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1071,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWildcardPrimitiveCollectionSerilaization_remove822() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWildcardPrimitiveCollectionSerilaization_remove822");
        Collection<? extends java.lang.Integer> target = java.util.Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Type collectionType = new TypeToken<java.util.Collection<? extends java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(target, collectionType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,json);
        json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1071,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWildcardPrimitiveCollectionDeserilaization_add987() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWildcardPrimitiveCollectionDeserilaization_add987");
        String json = "[1,2,3,4,5,6,7,8,9]";
        Type collectionType = new TypeToken<java.util.Collection<? extends java.lang.Integer>>() {        }.getType();
        Collection<? extends java.lang.Integer> target = gson.fromJson(json, collectionType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1065,target,1064,target.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1067,target,1066,target.contains(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1069,target,1068,target.contains(9));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWildcardPrimitiveCollectionDeserilaization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWildcardPrimitiveCollectionDeserilaization");
        String json = "foo";
        Type collectionType = new TypeToken<java.util.Collection<? extends java.lang.Integer>>() {        }.getType();
        Collection<? extends java.lang.Integer> target = gson.fromJson(json, collectionType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1065,target,1064,target.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1067,target,1066,target.contains(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1069,target,1068,target.contains(9));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWildcardPrimitiveCollectionDeserilaization_remove821() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWildcardPrimitiveCollectionDeserilaization_remove821");
        String json = "[1,2,3,4,5,6,7,8,9]";
        Type collectionType = new TypeToken<java.util.Collection<? extends java.lang.Integer>>() {        }.getType();
        Collection<? extends java.lang.Integer> target = gson.fromJson(json, collectionType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1065,target,1064,target.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1067,target,1066,target.contains(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1069,target,1068,target.contains(9));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWildcardCollectionField_add985() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWildcardCollectionField_add985");
        Collection<com.google.gson.common.TestTypes.BagOfPrimitives> collection = new ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        TestTypes.BagOfPrimitives objA = new TestTypes.BagOfPrimitives(3L , 1 , true , "blah");
        TestTypes.BagOfPrimitives objB = new TestTypes.BagOfPrimitives(2L , 6 , false , "blahB");
        collection.add(objA);
        collection.add(objA);
        collection.add(objB);
        ObjectWithWildcardCollection target = new ObjectWithWildcardCollection(collection);
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1055,json,1054,json.contains(objA.getExpectedJson()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1057,json,1056,json.contains(objB.getExpectedJson()));
        target = gson.fromJson(json, ObjectWithWildcardCollection.class);
        Collection<? extends com.google.gson.common.TestTypes.BagOfPrimitives> deserializedCollection = target.getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1059,deserializedCollection,1058,deserializedCollection.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1061,deserializedCollection,1060,deserializedCollection.contains(objA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1063,deserializedCollection,1062,deserializedCollection.contains(objB));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWildcardCollectionField_add986() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWildcardCollectionField_add986");
        Collection<com.google.gson.common.TestTypes.BagOfPrimitives> collection = new ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        TestTypes.BagOfPrimitives objA = new TestTypes.BagOfPrimitives(3L , 1 , true , "blah");
        TestTypes.BagOfPrimitives objB = new TestTypes.BagOfPrimitives(2L , 6 , false , "blahB");
        collection.add(objA);
        collection.add(objB);
        collection.add(objB);
        ObjectWithWildcardCollection target = new ObjectWithWildcardCollection(collection);
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1055,json,1054,json.contains(objA.getExpectedJson()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1057,json,1056,json.contains(objB.getExpectedJson()));
        target = gson.fromJson(json, ObjectWithWildcardCollection.class);
        Collection<? extends com.google.gson.common.TestTypes.BagOfPrimitives> deserializedCollection = target.getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1059,deserializedCollection,1058,deserializedCollection.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1061,deserializedCollection,1060,deserializedCollection.contains(objA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1063,deserializedCollection,1062,deserializedCollection.contains(objB));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWildcardCollectionField() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWildcardCollectionField");
        Collection<com.google.gson.common.TestTypes.BagOfPrimitives> collection = new ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        TestTypes.BagOfPrimitives objA = new TestTypes.BagOfPrimitives(4L , 1 , true , "blah");
        TestTypes.BagOfPrimitives objB = new TestTypes.BagOfPrimitives(2L , 6 , false , "blahB");
        collection.add(objA);
        collection.add(objB);
        ObjectWithWildcardCollection target = new ObjectWithWildcardCollection(collection);
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1055,json,1054,json.contains(objA.getExpectedJson()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1057,json,1056,json.contains(objB.getExpectedJson()));
        target = gson.fromJson(json, ObjectWithWildcardCollection.class);
        Collection<? extends com.google.gson.common.TestTypes.BagOfPrimitives> deserializedCollection = target.getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1059,deserializedCollection,1058,deserializedCollection.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1061,deserializedCollection,1060,deserializedCollection.contains(objA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1063,deserializedCollection,1062,deserializedCollection.contains(objB));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWildcardCollectionField_literalMutation971() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWildcardCollectionField_literalMutation971");
        Collection<com.google.gson.common.TestTypes.BagOfPrimitives> collection = new ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        TestTypes.BagOfPrimitives objA = new TestTypes.BagOfPrimitives(3L , 0 , true , "blah");
        TestTypes.BagOfPrimitives objB = new TestTypes.BagOfPrimitives(2L , 6 , false , "blahB");
        collection.add(objA);
        collection.add(objB);
        ObjectWithWildcardCollection target = new ObjectWithWildcardCollection(collection);
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1055,json,1054,json.contains(objA.getExpectedJson()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1057,json,1056,json.contains(objB.getExpectedJson()));
        target = gson.fromJson(json, ObjectWithWildcardCollection.class);
        Collection<? extends com.google.gson.common.TestTypes.BagOfPrimitives> deserializedCollection = target.getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1059,deserializedCollection,1058,deserializedCollection.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1061,deserializedCollection,1060,deserializedCollection.contains(objA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1063,deserializedCollection,1062,deserializedCollection.contains(objB));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWildcardCollectionField_literalMutation972() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWildcardCollectionField_literalMutation972");
        Collection<com.google.gson.common.TestTypes.BagOfPrimitives> collection = new ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        TestTypes.BagOfPrimitives objA = new TestTypes.BagOfPrimitives(3L , 1 , false , "blah");
        TestTypes.BagOfPrimitives objB = new TestTypes.BagOfPrimitives(2L , 6 , false , "blahB");
        collection.add(objA);
        collection.add(objB);
        ObjectWithWildcardCollection target = new ObjectWithWildcardCollection(collection);
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1055,json,1054,json.contains(objA.getExpectedJson()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1057,json,1056,json.contains(objB.getExpectedJson()));
        target = gson.fromJson(json, ObjectWithWildcardCollection.class);
        Collection<? extends com.google.gson.common.TestTypes.BagOfPrimitives> deserializedCollection = target.getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1059,deserializedCollection,1058,deserializedCollection.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1061,deserializedCollection,1060,deserializedCollection.contains(objA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1063,deserializedCollection,1062,deserializedCollection.contains(objB));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWildcardCollectionField_literalMutation973() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWildcardCollectionField_literalMutation973");
        Collection<com.google.gson.common.TestTypes.BagOfPrimitives> collection = new ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        TestTypes.BagOfPrimitives objA = new TestTypes.BagOfPrimitives(3L , 1 , true , "foo");
        TestTypes.BagOfPrimitives objB = new TestTypes.BagOfPrimitives(2L , 6 , false , "blahB");
        collection.add(objA);
        collection.add(objB);
        ObjectWithWildcardCollection target = new ObjectWithWildcardCollection(collection);
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1055,json,1054,json.contains(objA.getExpectedJson()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1057,json,1056,json.contains(objB.getExpectedJson()));
        target = gson.fromJson(json, ObjectWithWildcardCollection.class);
        Collection<? extends com.google.gson.common.TestTypes.BagOfPrimitives> deserializedCollection = target.getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1059,deserializedCollection,1058,deserializedCollection.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1061,deserializedCollection,1060,deserializedCollection.contains(objA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1063,deserializedCollection,1062,deserializedCollection.contains(objB));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWildcardCollectionField_literalMutation974() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWildcardCollectionField_literalMutation974");
        Collection<com.google.gson.common.TestTypes.BagOfPrimitives> collection = new ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        TestTypes.BagOfPrimitives objA = new TestTypes.BagOfPrimitives(3L , 1 , true , "blah");
        TestTypes.BagOfPrimitives objB = new TestTypes.BagOfPrimitives(3L , 6 , false , "blahB");
        collection.add(objA);
        collection.add(objB);
        ObjectWithWildcardCollection target = new ObjectWithWildcardCollection(collection);
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1055,json,1054,json.contains(objA.getExpectedJson()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1057,json,1056,json.contains(objB.getExpectedJson()));
        target = gson.fromJson(json, ObjectWithWildcardCollection.class);
        Collection<? extends com.google.gson.common.TestTypes.BagOfPrimitives> deserializedCollection = target.getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1059,deserializedCollection,1058,deserializedCollection.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1061,deserializedCollection,1060,deserializedCollection.contains(objA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1063,deserializedCollection,1062,deserializedCollection.contains(objB));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWildcardCollectionField_literalMutation975() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWildcardCollectionField_literalMutation975");
        Collection<com.google.gson.common.TestTypes.BagOfPrimitives> collection = new ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        TestTypes.BagOfPrimitives objA = new TestTypes.BagOfPrimitives(3L , 1 , true , "blah");
        TestTypes.BagOfPrimitives objB = new TestTypes.BagOfPrimitives(2L , 7 , false , "blahB");
        collection.add(objA);
        collection.add(objB);
        ObjectWithWildcardCollection target = new ObjectWithWildcardCollection(collection);
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1055,json,1054,json.contains(objA.getExpectedJson()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1057,json,1056,json.contains(objB.getExpectedJson()));
        target = gson.fromJson(json, ObjectWithWildcardCollection.class);
        Collection<? extends com.google.gson.common.TestTypes.BagOfPrimitives> deserializedCollection = target.getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1059,deserializedCollection,1058,deserializedCollection.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1061,deserializedCollection,1060,deserializedCollection.contains(objA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1063,deserializedCollection,1062,deserializedCollection.contains(objB));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWildcardCollectionField_literalMutation976() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWildcardCollectionField_literalMutation976");
        Collection<com.google.gson.common.TestTypes.BagOfPrimitives> collection = new ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        TestTypes.BagOfPrimitives objA = new TestTypes.BagOfPrimitives(3L , 1 , true , "blah");
        TestTypes.BagOfPrimitives objB = new TestTypes.BagOfPrimitives(2L , 6 , false , "blahB");
        collection.add(objA);
        collection.add(objB);
        ObjectWithWildcardCollection target = new ObjectWithWildcardCollection(collection);
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1055,json,1054,json.contains(objA.getExpectedJson()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1057,json,1056,json.contains(objB.getExpectedJson()));
        target = gson.fromJson(json, ObjectWithWildcardCollection.class);
        Collection<? extends com.google.gson.common.TestTypes.BagOfPrimitives> deserializedCollection = target.getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1059,deserializedCollection,1058,deserializedCollection.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1061,deserializedCollection,1060,deserializedCollection.contains(objA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1063,deserializedCollection,1062,deserializedCollection.contains(objB));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWildcardCollectionField_literalMutation977() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWildcardCollectionField_literalMutation977");
        Collection<com.google.gson.common.TestTypes.BagOfPrimitives> collection = new ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        TestTypes.BagOfPrimitives objA = new TestTypes.BagOfPrimitives(3L , 1 , true , "blah");
        TestTypes.BagOfPrimitives objB = new TestTypes.BagOfPrimitives(2L , 6 , false , "foo");
        collection.add(objA);
        collection.add(objB);
        ObjectWithWildcardCollection target = new ObjectWithWildcardCollection(collection);
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1055,json,1054,json.contains(objA.getExpectedJson()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1057,json,1056,json.contains(objB.getExpectedJson()));
        target = gson.fromJson(json, ObjectWithWildcardCollection.class);
        Collection<? extends com.google.gson.common.TestTypes.BagOfPrimitives> deserializedCollection = target.getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1059,deserializedCollection,1058,deserializedCollection.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1061,deserializedCollection,1060,deserializedCollection.contains(objA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1063,deserializedCollection,1062,deserializedCollection.contains(objB));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWildcardCollectionField_remove819() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWildcardCollectionField_remove819");
        Collection<com.google.gson.common.TestTypes.BagOfPrimitives> collection = new ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        TestTypes.BagOfPrimitives objA = new TestTypes.BagOfPrimitives(3L , 1 , true , "blah");
        TestTypes.BagOfPrimitives objB = new TestTypes.BagOfPrimitives(2L , 6 , false , "blahB");
        collection.add(objB);
        ObjectWithWildcardCollection target = new ObjectWithWildcardCollection(collection);
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1055,json,1054,json.contains(objA.getExpectedJson()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1057,json,1056,json.contains(objB.getExpectedJson()));
        target = gson.fromJson(json, ObjectWithWildcardCollection.class);
        Collection<? extends com.google.gson.common.TestTypes.BagOfPrimitives> deserializedCollection = target.getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1059,deserializedCollection,1058,deserializedCollection.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1061,deserializedCollection,1060,deserializedCollection.contains(objA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1063,deserializedCollection,1062,deserializedCollection.contains(objB));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWildcardCollectionField_remove820() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWildcardCollectionField_remove820");
        Collection<com.google.gson.common.TestTypes.BagOfPrimitives> collection = new ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        TestTypes.BagOfPrimitives objA = new TestTypes.BagOfPrimitives(3L , 1 , true , "blah");
        TestTypes.BagOfPrimitives objB = new TestTypes.BagOfPrimitives(2L , 6 , false , "blahB");
        collection.add(objB);
        ObjectWithWildcardCollection target = new ObjectWithWildcardCollection(collection);
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1055,json,1054,json.contains(objA.getExpectedJson()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1057,json,1056,json.contains(objB.getExpectedJson()));
        target = gson.fromJson(json, ObjectWithWildcardCollection.class);
        Collection<? extends com.google.gson.common.TestTypes.BagOfPrimitives> deserializedCollection = target.getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1059,deserializedCollection,1058,deserializedCollection.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1061,deserializedCollection,1060,deserializedCollection.contains(objA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1063,deserializedCollection,1062,deserializedCollection.contains(objB));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFieldIsArrayList_add956() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFieldIsArrayList_add956");
        HasArrayListField object = new HasArrayListField();
        object.longs.add(1L);
        object.longs.add(1L);
        object.longs.add(3L);
        String json = gson.toJson(object, HasArrayListField.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),999,json);
        HasArrayListField copy = gson.fromJson("{\"longs\":[1,3]}", HasArrayListField.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1001,null,1000,java.util.Arrays.asList(1L, 3L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,copy.longs);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFieldIsArrayList_add957() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFieldIsArrayList_add957");
        HasArrayListField object = new HasArrayListField();
        object.longs.add(1L);
        object.longs.add(3L);
        object.longs.add(3L);
        String json = gson.toJson(object, HasArrayListField.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),999,json);
        HasArrayListField copy = gson.fromJson("{\"longs\":[1,3]}", HasArrayListField.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1001,null,1000,java.util.Arrays.asList(1L, 3L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,copy.longs);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFieldIsArrayList() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFieldIsArrayList");
        HasArrayListField object = new HasArrayListField();
        object.longs.add(2L);
        object.longs.add(3L);
        String json = gson.toJson(object, HasArrayListField.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),999,json);
        HasArrayListField copy = gson.fromJson("{\"longs\":[1,3]}", HasArrayListField.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1001,null,1000,java.util.Arrays.asList(1L, 3L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,copy.longs);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFieldIsArrayList_literalMutation894() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFieldIsArrayList_literalMutation894");
        HasArrayListField object = new HasArrayListField();
        object.longs.add(1L);
        object.longs.add(2L);
        String json = gson.toJson(object, HasArrayListField.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),999,json);
        HasArrayListField copy = gson.fromJson("{\"longs\":[1,3]}", HasArrayListField.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1001,null,1000,java.util.Arrays.asList(1L, 3L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,copy.longs);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFieldIsArrayList_literalMutation895() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFieldIsArrayList_literalMutation895");
        HasArrayListField object = new HasArrayListField();
        object.longs.add(1L);
        object.longs.add(3L);
        String json = gson.toJson(object, HasArrayListField.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),999,json);
        HasArrayListField copy = gson.fromJson("foo", HasArrayListField.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1001,null,1000,java.util.Arrays.asList(1L, 3L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,copy.longs);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFieldIsArrayList_remove790() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFieldIsArrayList_remove790");
        HasArrayListField object = new HasArrayListField();
        object.longs.add(3L);
        String json = gson.toJson(object, HasArrayListField.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),999,json);
        HasArrayListField copy = gson.fromJson("{\"longs\":[1,3]}", HasArrayListField.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1001,null,1000,java.util.Arrays.asList(1L, 3L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,copy.longs);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFieldIsArrayList_remove791() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFieldIsArrayList_remove791");
        HasArrayListField object = new HasArrayListField();
        object.longs.add(3L);
        String json = gson.toJson(object, HasArrayListField.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),999,json);
        HasArrayListField copy = gson.fromJson("{\"longs\":[1,3]}", HasArrayListField.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1001,null,1000,java.util.Arrays.asList(1L, 3L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,copy.longs);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUserCollectionTypeAdapter_add983() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUserCollectionTypeAdapter_add983");
        Type listOfString = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        Object stringListSerializer = new JsonSerializer<java.util.List<java.lang.String>>() {
            public JsonElement serialize(List<java.lang.String> src, Type typeOfSrc, JsonSerializationContext context) {
                return new JsonPrimitive((((src.get(0)) + ";") + (src.get(1))));
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(listOfString, stringListSerializer).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1053,gson,1052,gson.toJson(java.util.Arrays.asList("ab", "cd"), listOfString));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUserCollectionTypeAdapter_add984() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUserCollectionTypeAdapter_add984");
        Type listOfString = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        Object stringListSerializer = new JsonSerializer<java.util.List<java.lang.String>>() {
            public JsonElement serialize(List<java.lang.String> src, Type typeOfSrc, JsonSerializationContext context) {
                return new JsonPrimitive((((src.get(0)) + ";") + (src.get(1))));
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(listOfString, stringListSerializer).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1053,gson,1052,gson.toJson(java.util.Arrays.asList("ab", "cd"), listOfString));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUserCollectionTypeAdapter() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUserCollectionTypeAdapter");
        Type listOfString = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        Object stringListSerializer = new JsonSerializer<java.util.List<java.lang.String>>() {
            public JsonElement serialize(List<java.lang.String> src, Type typeOfSrc, JsonSerializationContext context) {
                return new JsonPrimitive((((src.get(-1)) + ";") + (src.get(1))));
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(listOfString, stringListSerializer).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1053,gson,1052,gson.toJson(java.util.Arrays.asList("ab", "cd"), listOfString));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUserCollectionTypeAdapter_literalMutation968() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUserCollectionTypeAdapter_literalMutation968");
        Type listOfString = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        Object stringListSerializer = new JsonSerializer<java.util.List<java.lang.String>>() {
            public JsonElement serialize(List<java.lang.String> src, Type typeOfSrc, JsonSerializationContext context) {
                return new JsonPrimitive((((src.get(0)) + "foo") + (src.get(1))));
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(listOfString, stringListSerializer).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1053,gson,1052,gson.toJson(java.util.Arrays.asList("ab", "cd"), listOfString));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUserCollectionTypeAdapter_literalMutation969() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUserCollectionTypeAdapter_literalMutation969");
        Type listOfString = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        Object stringListSerializer = new JsonSerializer<java.util.List<java.lang.String>>() {
            public JsonElement serialize(List<java.lang.String> src, Type typeOfSrc, JsonSerializationContext context) {
                return new JsonPrimitive((((src.get(0)) + ";") + (src.get(2))));
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(listOfString, stringListSerializer).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1053,gson,1052,gson.toJson(java.util.Arrays.asList("ab", "cd"), listOfString));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUserCollectionTypeAdapter_remove817() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUserCollectionTypeAdapter_remove817");
        Type listOfString = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        Object stringListSerializer = new JsonSerializer<java.util.List<java.lang.String>>() {
            public JsonElement serialize(List<java.lang.String> src, Type typeOfSrc, JsonSerializationContext context) {
                return new JsonPrimitive((((src.get(0)) + ";") + (src.get(1))));
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(listOfString, stringListSerializer).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1053,gson,1052,gson.toJson(java.util.Arrays.asList("ab", "cd"), listOfString));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUserCollectionTypeAdapter_remove818() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUserCollectionTypeAdapter_remove818");
        Type listOfString = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        Object stringListSerializer = new JsonSerializer<java.util.List<java.lang.String>>() {
            public JsonElement serialize(List<java.lang.String> src, Type typeOfSrc, JsonSerializationContext context) {
                return new JsonPrimitive((((src.get(0)) + ";") + (src.get(1))));
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(listOfString, stringListSerializer).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1053,gson,1052,gson.toJson(java.util.Arrays.asList("ab", "cd"), listOfString));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    static class HasArrayListField {
        ArrayList<java.lang.Long> longs = new ArrayList<java.lang.Long>();
    }

    @SuppressWarnings(value = "rawtypes")
    private static int[] toIntArray(Collection collection) {
        int[] ints = new int[collection.size()];
        int i = 0;
        for (Iterator iterator = collection.iterator() ; iterator.hasNext() ; ++i) {
            Object obj = iterator.next();
            if (obj instanceof Integer) {
                ints[i] = ((Integer)(obj)).intValue();
            } else if (obj instanceof Long) {
                ints[i] = ((Long)(obj)).intValue();
            } 
        }
        return ints;
    }

    private static class ObjectWithWildcardCollection {
        private final Collection<? extends com.google.gson.common.TestTypes.BagOfPrimitives> collection;

        public ObjectWithWildcardCollection(Collection<? extends com.google.gson.common.TestTypes.BagOfPrimitives> collection) {
            this.collection = collection;
        }

        public Collection<? extends com.google.gson.common.TestTypes.BagOfPrimitives> getCollection() {
            return collection;
        }
    }

    private static class Entry {
        int value;

        Entry(int value) {
            this.value = value;
        }
    }

    @Test(timeout = 1000)
    public void testSetSerialization_add976() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetSerialization_add976");
        Set<Entry> set = new HashSet<Entry>();
        set.add(new Entry(1));
        set.add(new Entry(1));
        set.add(new Entry(2));
        String json = gson.toJson(set);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,json,1047,json.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,json,1049,json.contains("2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSetSerialization_add977() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetSerialization_add977");
        Set<Entry> set = new HashSet<Entry>();
        set.add(new Entry(1));
        set.add(new Entry(2));
        set.add(new Entry(2));
        String json = gson.toJson(set);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,json,1047,json.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,json,1049,json.contains("2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSetSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetSerialization");
        Set<Entry> set = new HashSet<Entry>();
        set.add(new Entry(2));
        set.add(new Entry(2));
        String json = gson.toJson(set);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,json,1047,json.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,json,1049,json.contains("2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSetSerialization_literalMutation935() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetSerialization_literalMutation935");
        Set<Entry> set = new HashSet<Entry>();
        set.add(new Entry(1));
        set.add(new Entry(3));
        String json = gson.toJson(set);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,json,1047,json.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,json,1049,json.contains("2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSetSerialization_remove810() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetSerialization_remove810");
        Set<Entry> set = new HashSet<Entry>();
        set.add(new Entry(2));
        String json = gson.toJson(set);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,json,1047,json.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,json,1049,json.contains("2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSetSerialization_remove811() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetSerialization_remove811");
        Set<Entry> set = new HashSet<Entry>();
        set.add(new Entry(2));
        String json = gson.toJson(set);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,json,1047,json.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,json,1049,json.contains("2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSetDeserialization_add975() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetDeserialization_add975");
        String json = "[{value:1},{value:2}]";
        Type type = new TypeToken<java.util.Set<Entry>>() {        }.getType();
        Set<Entry> set = gson.fromJson(json, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1045,set,1044,set.size());
        for (Entry entry : set) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,(((entry.value) == 1) || ((entry.value) == 2)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSetDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetDeserialization");
        String json = "foo";
        Type type = new TypeToken<java.util.Set<Entry>>() {        }.getType();
        Set<Entry> set = gson.fromJson(json, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1045,set,1044,set.size());
        for (Entry entry : set) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,(((entry.value) == 1) || ((entry.value) == 2)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSetDeserialization_remove809() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetDeserialization_remove809");
        String json = "[{value:1},{value:2}]";
        Type type = new TypeToken<java.util.Set<Entry>>() {        }.getType();
        Set<Entry> set = gson.fromJson(json, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1045,set,1044,set.size());
        for (Entry entry : set) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,(((entry.value) == 1) || ((entry.value) == 2)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


package com.google.gson.functional;

import java.util.ArrayList;
import java.util.Collection;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import org.junit.Test;
import junit.framework.TestCase;
import com.google.gson.common.TestTypes;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;

/** 
 * Functional tests for Json serialization and deserialization of arrays.
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class ArrayTest extends TestCase {
    private Gson gson;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        gson = new Gson();
    }

    public void testTopLevelArrayOfIntsSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelArrayOfIntsSerialization");
        int[] target = new int[]{ 2 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),971,gson,970,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelArrayOfIntsSerialization_literalMutation865() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelArrayOfIntsSerialization_literalMutation865");
        int[] target = new int[]{ 1 , 1 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),971,gson,970,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelArrayOfIntsSerialization_literalMutation866() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelArrayOfIntsSerialization_literalMutation866");
        int[] target = new int[]{ 1 , 2 , 4 , 4 , 5 , 6 , 7 , 8 , 9 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),971,gson,970,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelArrayOfIntsSerialization_literalMutation867() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelArrayOfIntsSerialization_literalMutation867");
        int[] target = new int[]{ 1 , 2 , 3 , 5 , 5 , 6 , 7 , 8 , 9 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),971,gson,970,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelArrayOfIntsSerialization_literalMutation868() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelArrayOfIntsSerialization_literalMutation868");
        int[] target = new int[]{ 1 , 2 , 3 , 4 , 4 , 6 , 7 , 8 , 9 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),971,gson,970,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelArrayOfIntsSerialization_literalMutation869() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelArrayOfIntsSerialization_literalMutation869");
        int[] target = new int[]{ 1 , 2 , 3 , 4 , 5 , 5 , 7 , 8 , 9 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),971,gson,970,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelArrayOfIntsSerialization_literalMutation870() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelArrayOfIntsSerialization_literalMutation870");
        int[] target = new int[]{ 1 , 2 , 3 , 4 , 5 , 6 , 6 , 8 , 9 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),971,gson,970,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelArrayOfIntsSerialization_literalMutation871() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelArrayOfIntsSerialization_literalMutation871");
        int[] target = new int[]{ 1 , 2 , 3 , 4 , 5 , 6 , 7 , 9 , 9 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),971,gson,970,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelArrayOfIntsSerialization_literalMutation872() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelArrayOfIntsSerialization_literalMutation872");
        int[] target = new int[]{ 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 8 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),971,gson,970,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTopLevelArrayOfIntsDeserialization_add932() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelArrayOfIntsDeserialization_add932");
        int[] expected = new int[]{ 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
        int[] actual = gson.fromJson("[1,2,3,4,5,6,7,8,9]", int[].class);
        com.google.gson.common.MoreAsserts.assertEquals(expected, actual);
        com.google.gson.common.MoreAsserts.assertEquals(expected, actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelArrayOfIntsDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelArrayOfIntsDeserialization");
        int[] expected = new int[]{ 0 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
        int[] actual = gson.fromJson("[1,2,3,4,5,6,7,8,9]", int[].class);
        com.google.gson.common.MoreAsserts.assertEquals(expected, actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelArrayOfIntsDeserialization_literalMutation855() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelArrayOfIntsDeserialization_literalMutation855");
        int[] expected = new int[]{ 1 , 1 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
        int[] actual = gson.fromJson("[1,2,3,4,5,6,7,8,9]", int[].class);
        com.google.gson.common.MoreAsserts.assertEquals(expected, actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelArrayOfIntsDeserialization_literalMutation856() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelArrayOfIntsDeserialization_literalMutation856");
        int[] expected = new int[]{ 1 , 2 , 2 , 4 , 5 , 6 , 7 , 8 , 9 };
        int[] actual = gson.fromJson("[1,2,3,4,5,6,7,8,9]", int[].class);
        com.google.gson.common.MoreAsserts.assertEquals(expected, actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelArrayOfIntsDeserialization_literalMutation857() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelArrayOfIntsDeserialization_literalMutation857");
        int[] expected = new int[]{ 1 , 2 , 3 , 5 , 5 , 6 , 7 , 8 , 9 };
        int[] actual = gson.fromJson("[1,2,3,4,5,6,7,8,9]", int[].class);
        com.google.gson.common.MoreAsserts.assertEquals(expected, actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelArrayOfIntsDeserialization_literalMutation858() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelArrayOfIntsDeserialization_literalMutation858");
        int[] expected = new int[]{ 1 , 2 , 3 , 4 , 6 , 6 , 7 , 8 , 9 };
        int[] actual = gson.fromJson("[1,2,3,4,5,6,7,8,9]", int[].class);
        com.google.gson.common.MoreAsserts.assertEquals(expected, actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelArrayOfIntsDeserialization_literalMutation859() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelArrayOfIntsDeserialization_literalMutation859");
        int[] expected = new int[]{ 1 , 2 , 3 , 4 , 5 , 5 , 7 , 8 , 9 };
        int[] actual = gson.fromJson("[1,2,3,4,5,6,7,8,9]", int[].class);
        com.google.gson.common.MoreAsserts.assertEquals(expected, actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelArrayOfIntsDeserialization_literalMutation860() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelArrayOfIntsDeserialization_literalMutation860");
        int[] expected = new int[]{ 1 , 2 , 3 , 4 , 5 , 6 , 6 , 8 , 9 };
        int[] actual = gson.fromJson("[1,2,3,4,5,6,7,8,9]", int[].class);
        com.google.gson.common.MoreAsserts.assertEquals(expected, actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelArrayOfIntsDeserialization_literalMutation861() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelArrayOfIntsDeserialization_literalMutation861");
        int[] expected = new int[]{ 1 , 2 , 3 , 4 , 5 , 6 , 7 , 9 , 9 };
        int[] actual = gson.fromJson("[1,2,3,4,5,6,7,8,9]", int[].class);
        com.google.gson.common.MoreAsserts.assertEquals(expected, actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelArrayOfIntsDeserialization_literalMutation862() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelArrayOfIntsDeserialization_literalMutation862");
        int[] expected = new int[]{ 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 8 };
        int[] actual = gson.fromJson("[1,2,3,4,5,6,7,8,9]", int[].class);
        com.google.gson.common.MoreAsserts.assertEquals(expected, actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelArrayOfIntsDeserialization_literalMutation863() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelArrayOfIntsDeserialization_literalMutation863");
        int[] expected = new int[]{ 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
        int[] actual = gson.fromJson("foo", int[].class);
        com.google.gson.common.MoreAsserts.assertEquals(expected, actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTopLevelArrayOfIntsDeserialization_remove769() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelArrayOfIntsDeserialization_remove769");
        int[] expected = new int[]{ 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
        int[] actual = gson.fromJson("[1,2,3,4,5,6,7,8,9]", int[].class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInvalidArrayDeserialization_add931() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidArrayDeserialization_add931");
        String json = "[1, 2 3, 4, 5]";
        try {
            gson.fromJson(json, int[].class);
            gson.fromJson(json, int[].class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInvalidArrayDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidArrayDeserialization");
        String json = "foo";
        try {
            gson.fromJson(json, int[].class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmptyArraySerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyArraySerialization");
        int[] target = new int[]{  };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),944,gson,943,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmptyArrayDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyArrayDeserialization");
        int[] actualObject = gson.fromJson("foo", int[].class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),940,((actualObject.length) == 0));
        Integer[] actualObject2 = gson.fromJson("[]", Integer[].class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,((actualObject2.length) == 0));
        actualObject = gson.fromJson("[ ]", int[].class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),942,((actualObject.length) == 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmptyArrayDeserialization_literalMutation811() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyArrayDeserialization_literalMutation811");
        int[] actualObject = gson.fromJson("[]", int[].class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),940,((actualObject.length) == 0));
        Integer[] actualObject2 = gson.fromJson("foo", Integer[].class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,((actualObject2.length) == 0));
        actualObject = gson.fromJson("[ ]", int[].class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),942,((actualObject.length) == 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmptyArrayDeserialization_literalMutation812() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyArrayDeserialization_literalMutation812");
        int[] actualObject = gson.fromJson("[]", int[].class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),940,((actualObject.length) == 0));
        Integer[] actualObject2 = gson.fromJson("[]", Integer[].class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,((actualObject2.length) == 0));
        actualObject = gson.fromJson("foo", int[].class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),942,((actualObject.length) == 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullsInArraySerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullsInArraySerialization");
        String[] array = new String[]{ "foo" , null , "bar" };
        String expected = "[\"foo\",null,\"bar\"]";
        String json = gson.toJson(array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),957,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullsInArraySerialization_literalMutation842() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullsInArraySerialization_literalMutation842");
        String[] array = new String[]{ "foo" , null , "foo" };
        String expected = "[\"foo\",null,\"bar\"]";
        String json = gson.toJson(array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),957,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullsInArraySerialization_literalMutation843() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullsInArraySerialization_literalMutation843");
        String[] array = new String[]{ "foo" , null , "bar" };
        String expected = "foo";
        String json = gson.toJson(array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),957,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullsInArrayDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullsInArrayDeserialization");
        String json = "foo";
        String[] expected = new String[]{ "foo" , null , "bar" };
        String[] target = gson.fromJson(json, expected.getClass());
        for (int i = 0 ; i < (expected.length) ; ++i) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),955,expected[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,target[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullsInArrayDeserialization_literalMutation836() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullsInArrayDeserialization_literalMutation836");
        String json = "[\"foo\",null,\"bar\"]";
        String[] expected = new String[]{ "foo" , null , "bar" };
        String[] target = gson.fromJson(json, expected.getClass());
        for (int i = 0 ; i < (expected.length) ; ++i) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),955,expected[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,target[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullsInArrayDeserialization_literalMutation838() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullsInArrayDeserialization_literalMutation838");
        String json = "[\"foo\",null,\"bar\"]";
        String[] expected = new String[]{ "foo" , null , "foo" };
        String[] target = gson.fromJson(json, expected.getClass());
        for (int i = 0 ; i < (expected.length) ; ++i) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),955,expected[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,target[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullsInArrayDeserialization_literalMutation839() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullsInArrayDeserialization_literalMutation839");
        String json = "[\"foo\",null,\"bar\"]";
        String[] expected = new String[]{ "foo" , null , "bar" };
        String[] target = gson.fromJson(json, expected.getClass());
        for (int i = 1 ; i < (expected.length) ; ++i) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),955,expected[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,target[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSingleNullInArraySerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleNullInArraySerialization");
        TestTypes.BagOfPrimitives[] array = new TestTypes.BagOfPrimitives[2];
        array[0] = null;
        String json = gson.toJson(array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),966,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSingleNullInArraySerialization_literalMutation850() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleNullInArraySerialization_literalMutation850");
        TestTypes.BagOfPrimitives[] array = new TestTypes.BagOfPrimitives[1];
        array[-1] = null;
        String json = gson.toJson(array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),966,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSingleNullInArrayDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleNullInArrayDeserialization");
        TestTypes.BagOfPrimitives[] array = gson.fromJson("foo", TestTypes.BagOfPrimitives[].class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),965,array[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullsInArrayWithSerializeNullPropertySetSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullsInArrayWithSerializeNullPropertySetSerialization");
        gson = new GsonBuilder().serializeNulls().create();
        String[] array = new String[]{ "foo" , null , "bar" };
        String expected = "[\"foo\",null,\"bar\"]";
        String json = gson.toJson(array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),959,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullsInArrayWithSerializeNullPropertySetSerialization_literalMutation846() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullsInArrayWithSerializeNullPropertySetSerialization_literalMutation846");
        gson = new GsonBuilder().serializeNulls().create();
        String[] array = new String[]{ "foo" , null , "foo" };
        String expected = "[\"foo\",null,\"bar\"]";
        String json = gson.toJson(array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),959,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullsInArrayWithSerializeNullPropertySetSerialization_literalMutation847() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullsInArrayWithSerializeNullPropertySetSerialization_literalMutation847");
        gson = new GsonBuilder().serializeNulls().create();
        String[] array = new String[]{ "foo" , null , "bar" };
        String expected = "foo";
        String json = gson.toJson(array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),959,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayOfStringsSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfStringsSerialization");
        String[] target = new String[]{ "foo" , "World" };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,gson,938,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayOfStringsSerialization_literalMutation809() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfStringsSerialization_literalMutation809");
        String[] target = new String[]{ "Hello" , "foo" };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,gson,938,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayOfStringsDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfStringsDeserialization");
        String json = "foo";
        String[] target = gson.fromJson(json, String[].class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),936,target[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,target[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSingleStringArraySerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleStringArraySerialization");
        String[] s = new String[]{ "foo" };
        String output = gson.toJson(s);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),969,output);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSingleStringArrayDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleStringArrayDeserialization");
        String json = "foo";
        String[] arrayType = gson.fromJson(json, String[].class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),967,arrayType.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),968,arrayType[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testArrayOfCollectionSerialization_add925() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfCollectionSerialization_add925");
        StringBuilder sb = new StringBuilder("[");
        int arraySize = 3;
        Type typeToSerialize = new TypeToken<java.util.Collection<java.lang.Integer>[]>() {        }.getType();
        Collection<java.lang.Integer>[] arrayOfCollection = new ArrayList[arraySize];
        for (int i = 0 ; i < arraySize ; ++i) {
            int startValue = (3 * i) + 1;
            sb.append('[').append(startValue).append(',').append((startValue + 1)).append(']');
            ArrayList<java.lang.Integer> tmpList = new ArrayList<java.lang.Integer>();
            tmpList.add(startValue);
            tmpList.add((startValue + 1));
            arrayOfCollection[i] = tmpList;
            if (i < (arraySize - 1)) {
                sb.append(',');
            } 
        }
        sb.append(']');
        String json = gson.toJson(arrayOfCollection, typeToSerialize);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,sb,916,sb.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),918,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testArrayOfCollectionSerialization_add926() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfCollectionSerialization_add926");
        StringBuilder sb = new StringBuilder("[");
        int arraySize = 3;
        Type typeToSerialize = new TypeToken<java.util.Collection<java.lang.Integer>[]>() {        }.getType();
        Collection<java.lang.Integer>[] arrayOfCollection = new ArrayList[arraySize];
        for (int i = 0 ; i < arraySize ; ++i) {
            int startValue = (3 * i) + 1;
            sb.append('[').append(startValue).append(',').append((startValue + 1)).append(']');
            sb.append('[').append(startValue).append(',').append((startValue + 1)).append(']');
            ArrayList<java.lang.Integer> tmpList = new ArrayList<java.lang.Integer>();
            tmpList.add(startValue);
            tmpList.add((startValue + 1));
            arrayOfCollection[i] = tmpList;
            if (i < (arraySize - 1)) {
                sb.append(',');
            } 
        }
        sb.append(']');
        String json = gson.toJson(arrayOfCollection, typeToSerialize);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,sb,916,sb.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),918,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testArrayOfCollectionSerialization_add927() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfCollectionSerialization_add927");
        StringBuilder sb = new StringBuilder("[");
        int arraySize = 3;
        Type typeToSerialize = new TypeToken<java.util.Collection<java.lang.Integer>[]>() {        }.getType();
        Collection<java.lang.Integer>[] arrayOfCollection = new ArrayList[arraySize];
        for (int i = 0 ; i < arraySize ; ++i) {
            int startValue = (3 * i) + 1;
            sb.append('[').append(startValue).append(',').append((startValue + 1)).append(']');
            ArrayList<java.lang.Integer> tmpList = new ArrayList<java.lang.Integer>();
            tmpList.add(startValue);
            tmpList.add(startValue);
            tmpList.add((startValue + 1));
            arrayOfCollection[i] = tmpList;
            if (i < (arraySize - 1)) {
                sb.append(',');
            } 
        }
        sb.append(']');
        String json = gson.toJson(arrayOfCollection, typeToSerialize);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,sb,916,sb.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),918,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testArrayOfCollectionSerialization_add928() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfCollectionSerialization_add928");
        StringBuilder sb = new StringBuilder("[");
        int arraySize = 3;
        Type typeToSerialize = new TypeToken<java.util.Collection<java.lang.Integer>[]>() {        }.getType();
        Collection<java.lang.Integer>[] arrayOfCollection = new ArrayList[arraySize];
        for (int i = 0 ; i < arraySize ; ++i) {
            int startValue = (3 * i) + 1;
            sb.append('[').append(startValue).append(',').append((startValue + 1)).append(']');
            ArrayList<java.lang.Integer> tmpList = new ArrayList<java.lang.Integer>();
            tmpList.add(startValue);
            tmpList.add((startValue + 1));
            tmpList.add((startValue + 1));
            arrayOfCollection[i] = tmpList;
            if (i < (arraySize - 1)) {
                sb.append(',');
            } 
        }
        sb.append(']');
        String json = gson.toJson(arrayOfCollection, typeToSerialize);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,sb,916,sb.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),918,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testArrayOfCollectionSerialization_add929() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfCollectionSerialization_add929");
        StringBuilder sb = new StringBuilder("[");
        int arraySize = 3;
        Type typeToSerialize = new TypeToken<java.util.Collection<java.lang.Integer>[]>() {        }.getType();
        Collection<java.lang.Integer>[] arrayOfCollection = new ArrayList[arraySize];
        for (int i = 0 ; i < arraySize ; ++i) {
            int startValue = (3 * i) + 1;
            sb.append('[').append(startValue).append(',').append((startValue + 1)).append(']');
            ArrayList<java.lang.Integer> tmpList = new ArrayList<java.lang.Integer>();
            tmpList.add(startValue);
            tmpList.add((startValue + 1));
            arrayOfCollection[i] = tmpList;
            if (i < (arraySize - 1)) {
                sb.append(',');
                sb.append(',');
            } 
        }
        sb.append(']');
        String json = gson.toJson(arrayOfCollection, typeToSerialize);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,sb,916,sb.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),918,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testArrayOfCollectionSerialization_add930() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfCollectionSerialization_add930");
        StringBuilder sb = new StringBuilder("[");
        int arraySize = 3;
        Type typeToSerialize = new TypeToken<java.util.Collection<java.lang.Integer>[]>() {        }.getType();
        Collection<java.lang.Integer>[] arrayOfCollection = new ArrayList[arraySize];
        for (int i = 0 ; i < arraySize ; ++i) {
            int startValue = (3 * i) + 1;
            sb.append('[').append(startValue).append(',').append((startValue + 1)).append(']');
            ArrayList<java.lang.Integer> tmpList = new ArrayList<java.lang.Integer>();
            tmpList.add(startValue);
            tmpList.add((startValue + 1));
            arrayOfCollection[i] = tmpList;
            if (i < (arraySize - 1)) {
                sb.append(',');
            } 
        }
        sb.append(']');
        sb.append(']');
        String json = gson.toJson(arrayOfCollection, typeToSerialize);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,sb,916,sb.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),918,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testArrayOfCollectionSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfCollectionSerialization");
        StringBuilder sb = new StringBuilder("[");
        int arraySize = 3;
        Type typeToSerialize = new TypeToken<java.util.Collection<java.lang.Integer>[]>() {        }.getType();
        Collection<java.lang.Integer>[] arrayOfCollection = new ArrayList[arraySize];
        for (int i = 0 ; i < arraySize ; ++i) {
            int startValue = (3 * i) + 1;
            sb.append('[').append(startValue).append(',').append((startValue + 1)).append(']');
            ArrayList<java.lang.Integer> tmpList = new ArrayList<java.lang.Integer>();
            tmpList.add(startValue);
            tmpList.add((startValue + 1));
            arrayOfCollection[i] = tmpList;
            if (i < (arraySize - 1)) {
                sb.append(',');
            } 
        }
        sb.append(']');
        String json = gson.toJson(arrayOfCollection, typeToSerialize);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,sb,916,sb.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),918,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testArrayOfCollectionSerialization_literalMutation787() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfCollectionSerialization_literalMutation787");
        StringBuilder sb = new StringBuilder("foo");
        int arraySize = 3;
        Type typeToSerialize = new TypeToken<java.util.Collection<java.lang.Integer>[]>() {        }.getType();
        Collection<java.lang.Integer>[] arrayOfCollection = new ArrayList[arraySize];
        for (int i = 0 ; i < arraySize ; ++i) {
            int startValue = (3 * i) + 1;
            sb.append('[').append(startValue).append(',').append((startValue + 1)).append(']');
            ArrayList<java.lang.Integer> tmpList = new ArrayList<java.lang.Integer>();
            tmpList.add(startValue);
            tmpList.add((startValue + 1));
            arrayOfCollection[i] = tmpList;
            if (i < (arraySize - 1)) {
                sb.append(',');
            } 
        }
        sb.append(']');
        String json = gson.toJson(arrayOfCollection, typeToSerialize);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,sb,916,sb.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),918,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testArrayOfCollectionSerialization_literalMutation788() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfCollectionSerialization_literalMutation788");
        StringBuilder sb = new StringBuilder("[");
        int arraySize = 4;
        Type typeToSerialize = new TypeToken<java.util.Collection<java.lang.Integer>[]>() {        }.getType();
        Collection<java.lang.Integer>[] arrayOfCollection = new ArrayList[arraySize];
        for (int i = 0 ; i < arraySize ; ++i) {
            int startValue = (3 * i) + 1;
            sb.append('[').append(startValue).append(',').append((startValue + 1)).append(']');
            ArrayList<java.lang.Integer> tmpList = new ArrayList<java.lang.Integer>();
            tmpList.add(startValue);
            tmpList.add((startValue + 1));
            arrayOfCollection[i] = tmpList;
            if (i < (arraySize - 1)) {
                sb.append(',');
            } 
        }
        sb.append(']');
        String json = gson.toJson(arrayOfCollection, typeToSerialize);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,sb,916,sb.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),918,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testArrayOfCollectionSerialization_literalMutation789() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfCollectionSerialization_literalMutation789");
        StringBuilder sb = new StringBuilder("[");
        int arraySize = 3;
        Type typeToSerialize = new TypeToken<java.util.Collection<java.lang.Integer>[]>() {        }.getType();
        Collection<java.lang.Integer>[] arrayOfCollection = new ArrayList[arraySize];
        for (int i = 1 ; i < arraySize ; ++i) {
            int startValue = (3 * i) + 1;
            sb.append('[').append(startValue).append(',').append((startValue + 1)).append(']');
            ArrayList<java.lang.Integer> tmpList = new ArrayList<java.lang.Integer>();
            tmpList.add(startValue);
            tmpList.add((startValue + 1));
            arrayOfCollection[i] = tmpList;
            if (i < (arraySize - 1)) {
                sb.append(',');
            } 
        }
        sb.append(']');
        String json = gson.toJson(arrayOfCollection, typeToSerialize);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,sb,916,sb.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),918,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testArrayOfCollectionSerialization_literalMutation790() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfCollectionSerialization_literalMutation790");
        StringBuilder sb = new StringBuilder("[");
        int arraySize = 3;
        Type typeToSerialize = new TypeToken<java.util.Collection<java.lang.Integer>[]>() {        }.getType();
        Collection<java.lang.Integer>[] arrayOfCollection = new ArrayList[arraySize];
        for (int i = 0 ; i < arraySize ; ++i) {
            int startValue = (2 * i) + 1;
            sb.append('[').append(startValue).append(',').append((startValue + 1)).append(']');
            ArrayList<java.lang.Integer> tmpList = new ArrayList<java.lang.Integer>();
            tmpList.add(startValue);
            tmpList.add((startValue + 1));
            arrayOfCollection[i] = tmpList;
            if (i < (arraySize - 1)) {
                sb.append(',');
            } 
        }
        sb.append(']');
        String json = gson.toJson(arrayOfCollection, typeToSerialize);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,sb,916,sb.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),918,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testArrayOfCollectionSerialization_literalMutation791() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfCollectionSerialization_literalMutation791");
        StringBuilder sb = new StringBuilder("[");
        int arraySize = 3;
        Type typeToSerialize = new TypeToken<java.util.Collection<java.lang.Integer>[]>() {        }.getType();
        Collection<java.lang.Integer>[] arrayOfCollection = new ArrayList[arraySize];
        for (int i = 0 ; i < arraySize ; ++i) {
            int startValue = (3 * i) + 0;
            sb.append('[').append(startValue).append(',').append((startValue + 1)).append(']');
            ArrayList<java.lang.Integer> tmpList = new ArrayList<java.lang.Integer>();
            tmpList.add(startValue);
            tmpList.add((startValue + 1));
            arrayOfCollection[i] = tmpList;
            if (i < (arraySize - 1)) {
                sb.append(',');
            } 
        }
        sb.append(']');
        String json = gson.toJson(arrayOfCollection, typeToSerialize);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,sb,916,sb.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),918,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testArrayOfCollectionSerialization_literalMutation794() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfCollectionSerialization_literalMutation794");
        StringBuilder sb = new StringBuilder("[");
        int arraySize = 3;
        Type typeToSerialize = new TypeToken<java.util.Collection<java.lang.Integer>[]>() {        }.getType();
        Collection<java.lang.Integer>[] arrayOfCollection = new ArrayList[arraySize];
        for (int i = 0 ; i < arraySize ; ++i) {
            int startValue = (3 * i) + 1;
            sb.append('[').append(startValue).append(',').append((startValue + 0)).append(']');
            ArrayList<java.lang.Integer> tmpList = new ArrayList<java.lang.Integer>();
            tmpList.add(startValue);
            tmpList.add((startValue + 1));
            arrayOfCollection[i] = tmpList;
            if (i < (arraySize - 1)) {
                sb.append(',');
            } 
        }
        sb.append(']');
        String json = gson.toJson(arrayOfCollection, typeToSerialize);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,sb,916,sb.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),918,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testArrayOfCollectionSerialization_literalMutation796() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfCollectionSerialization_literalMutation796");
        StringBuilder sb = new StringBuilder("[");
        int arraySize = 3;
        Type typeToSerialize = new TypeToken<java.util.Collection<java.lang.Integer>[]>() {        }.getType();
        Collection<java.lang.Integer>[] arrayOfCollection = new ArrayList[arraySize];
        for (int i = 0 ; i < arraySize ; ++i) {
            int startValue = (3 * i) + 1;
            sb.append('[').append(startValue).append(',').append((startValue + 1)).append(']');
            ArrayList<java.lang.Integer> tmpList = new ArrayList<java.lang.Integer>();
            tmpList.add(startValue);
            tmpList.add((startValue + 2));
            arrayOfCollection[i] = tmpList;
            if (i < (arraySize - 1)) {
                sb.append(',');
            } 
        }
        sb.append(']');
        String json = gson.toJson(arrayOfCollection, typeToSerialize);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,sb,916,sb.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),918,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testArrayOfCollectionSerialization_literalMutation797() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfCollectionSerialization_literalMutation797");
        StringBuilder sb = new StringBuilder("[");
        int arraySize = 3;
        Type typeToSerialize = new TypeToken<java.util.Collection<java.lang.Integer>[]>() {        }.getType();
        Collection<java.lang.Integer>[] arrayOfCollection = new ArrayList[arraySize];
        for (int i = 0 ; i < arraySize ; ++i) {
            int startValue = (3 * i) + 1;
            sb.append('[').append(startValue).append(',').append((startValue + 1)).append(']');
            ArrayList<java.lang.Integer> tmpList = new ArrayList<java.lang.Integer>();
            tmpList.add(startValue);
            tmpList.add((startValue + 1));
            arrayOfCollection[i] = tmpList;
            if (i < (arraySize - 0)) {
                sb.append(',');
            } 
        }
        sb.append(']');
        String json = gson.toJson(arrayOfCollection, typeToSerialize);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,sb,916,sb.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),918,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testArrayOfCollectionSerialization_remove763() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfCollectionSerialization_remove763");
        StringBuilder sb = new StringBuilder("[");
        int arraySize = 3;
        Type typeToSerialize = new TypeToken<java.util.Collection<java.lang.Integer>[]>() {        }.getType();
        Collection<java.lang.Integer>[] arrayOfCollection = new ArrayList[arraySize];
        for (int i = 0 ; i < arraySize ; ++i) {
            int startValue = (3 * i) + 1;
            sb.append('[').append(startValue).append(',').append((startValue + 1)).append(']');
            ArrayList<java.lang.Integer> tmpList = new ArrayList<java.lang.Integer>();
            tmpList.add(startValue);
            tmpList.add((startValue + 1));
            arrayOfCollection[i] = tmpList;
            if (i < (arraySize - 1)) {
                sb.append(',');
            } 
        }
        sb.append(']');
        String json = gson.toJson(arrayOfCollection, typeToSerialize);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,sb,916,sb.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),918,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testArrayOfCollectionSerialization_remove764() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfCollectionSerialization_remove764");
        StringBuilder sb = new StringBuilder("[");
        int arraySize = 3;
        Type typeToSerialize = new TypeToken<java.util.Collection<java.lang.Integer>[]>() {        }.getType();
        Collection<java.lang.Integer>[] arrayOfCollection = new ArrayList[arraySize];
        for (int i = 0 ; i < arraySize ; ++i) {
            int startValue = (3 * i) + 1;
            ArrayList<java.lang.Integer> tmpList = new ArrayList<java.lang.Integer>();
            tmpList.add(startValue);
            tmpList.add((startValue + 1));
            arrayOfCollection[i] = tmpList;
            if (i < (arraySize - 1)) {
                sb.append(',');
            } 
        }
        sb.append(']');
        String json = gson.toJson(arrayOfCollection, typeToSerialize);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,sb,916,sb.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),918,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testArrayOfCollectionSerialization_remove765() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfCollectionSerialization_remove765");
        StringBuilder sb = new StringBuilder("[");
        int arraySize = 3;
        Type typeToSerialize = new TypeToken<java.util.Collection<java.lang.Integer>[]>() {        }.getType();
        Collection<java.lang.Integer>[] arrayOfCollection = new ArrayList[arraySize];
        for (int i = 0 ; i < arraySize ; ++i) {
            int startValue = (3 * i) + 1;
            sb.append('[').append(startValue).append(',').append((startValue + 1)).append(']');
            ArrayList<java.lang.Integer> tmpList = new ArrayList<java.lang.Integer>();
            tmpList.add((startValue + 1));
            arrayOfCollection[i] = tmpList;
            if (i < (arraySize - 1)) {
                sb.append(',');
            } 
        }
        sb.append(']');
        String json = gson.toJson(arrayOfCollection, typeToSerialize);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,sb,916,sb.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),918,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testArrayOfCollectionSerialization_remove766() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfCollectionSerialization_remove766");
        StringBuilder sb = new StringBuilder("[");
        int arraySize = 3;
        Type typeToSerialize = new TypeToken<java.util.Collection<java.lang.Integer>[]>() {        }.getType();
        Collection<java.lang.Integer>[] arrayOfCollection = new ArrayList[arraySize];
        for (int i = 0 ; i < arraySize ; ++i) {
            int startValue = (3 * i) + 1;
            sb.append('[').append(startValue).append(',').append((startValue + 1)).append(']');
            ArrayList<java.lang.Integer> tmpList = new ArrayList<java.lang.Integer>();
            tmpList.add((startValue + 1));
            arrayOfCollection[i] = tmpList;
            if (i < (arraySize - 1)) {
                sb.append(',');
            } 
        }
        sb.append(']');
        String json = gson.toJson(arrayOfCollection, typeToSerialize);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,sb,916,sb.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),918,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testArrayOfCollectionSerialization_remove767() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfCollectionSerialization_remove767");
        StringBuilder sb = new StringBuilder("[");
        int arraySize = 3;
        Type typeToSerialize = new TypeToken<java.util.Collection<java.lang.Integer>[]>() {        }.getType();
        Collection<java.lang.Integer>[] arrayOfCollection = new ArrayList[arraySize];
        for (int i = 0 ; i < arraySize ; ++i) {
            int startValue = (3 * i) + 1;
            sb.append('[').append(startValue).append(',').append((startValue + 1)).append(']');
            ArrayList<java.lang.Integer> tmpList = new ArrayList<java.lang.Integer>();
            tmpList.add(startValue);
            tmpList.add((startValue + 1));
            arrayOfCollection[i] = tmpList;
            if (i < (arraySize - 1)) {
            } 
        }
        sb.append(']');
        String json = gson.toJson(arrayOfCollection, typeToSerialize);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,sb,916,sb.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),918,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testArrayOfCollectionSerialization_remove768() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfCollectionSerialization_remove768");
        StringBuilder sb = new StringBuilder("[");
        int arraySize = 3;
        Type typeToSerialize = new TypeToken<java.util.Collection<java.lang.Integer>[]>() {        }.getType();
        Collection<java.lang.Integer>[] arrayOfCollection = new ArrayList[arraySize];
        for (int i = 0 ; i < arraySize ; ++i) {
            int startValue = (3 * i) + 1;
            sb.append('[').append(startValue).append(',').append((startValue + 1)).append(']');
            ArrayList<java.lang.Integer> tmpList = new ArrayList<java.lang.Integer>();
            tmpList.add(startValue);
            tmpList.add((startValue + 1));
            arrayOfCollection[i] = tmpList;
            if (i < (arraySize - 1)) {
                sb.append(',');
            } 
        }
        String json = gson.toJson(arrayOfCollection, typeToSerialize);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,sb,916,sb.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),918,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfCollectionDeserialization_add922() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfCollectionDeserialization_add922");
        String json = "[[1,2],[3,4]]";
        Type type = new TypeToken<java.util.Collection<java.lang.Integer>[]>() {        }.getType();
        Collection<java.lang.Integer>[] target = gson.fromJson(json, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,target.length);
        com.google.gson.common.MoreAsserts.assertEquals(new Integer[]{ 1 , 2 }, target[0].toArray(new Integer[0]));
        com.google.gson.common.MoreAsserts.assertEquals(new Integer[]{ 3 , 4 }, target[1].toArray(new Integer[0]));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfCollectionDeserialization_add923() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfCollectionDeserialization_add923");
        String json = "[[1,2],[3,4]]";
        Type type = new TypeToken<java.util.Collection<java.lang.Integer>[]>() {        }.getType();
        Collection<java.lang.Integer>[] target = gson.fromJson(json, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,target.length);
        com.google.gson.common.MoreAsserts.assertEquals(new Integer[]{ 1 , 2 }, target[0].toArray(new Integer[0]));
        com.google.gson.common.MoreAsserts.assertEquals(new Integer[]{ 1 , 2 }, target[0].toArray(new Integer[0]));
        com.google.gson.common.MoreAsserts.assertEquals(new Integer[]{ 3 , 4 }, target[1].toArray(new Integer[0]));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfCollectionDeserialization_add924() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfCollectionDeserialization_add924");
        String json = "[[1,2],[3,4]]";
        Type type = new TypeToken<java.util.Collection<java.lang.Integer>[]>() {        }.getType();
        Collection<java.lang.Integer>[] target = gson.fromJson(json, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,target.length);
        com.google.gson.common.MoreAsserts.assertEquals(new Integer[]{ 1 , 2 }, target[0].toArray(new Integer[0]));
        com.google.gson.common.MoreAsserts.assertEquals(new Integer[]{ 3 , 4 }, target[1].toArray(new Integer[0]));
        com.google.gson.common.MoreAsserts.assertEquals(new Integer[]{ 3 , 4 }, target[1].toArray(new Integer[0]));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayOfCollectionDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfCollectionDeserialization");
        String json = "foo";
        Type type = new TypeToken<java.util.Collection<java.lang.Integer>[]>() {        }.getType();
        Collection<java.lang.Integer>[] target = gson.fromJson(json, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,target.length);
        com.google.gson.common.MoreAsserts.assertEquals(new Integer[]{ 1 , 2 }, target[0].toArray(new Integer[0]));
        com.google.gson.common.MoreAsserts.assertEquals(new Integer[]{ 3 , 4 }, target[1].toArray(new Integer[0]));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayOfCollectionDeserialization_literalMutation778() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfCollectionDeserialization_literalMutation778");
        String json = "[[1,2],[3,4]]";
        Type type = new TypeToken<java.util.Collection<java.lang.Integer>[]>() {        }.getType();
        Collection<java.lang.Integer>[] target = gson.fromJson(json, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,target.length);
        com.google.gson.common.MoreAsserts.assertEquals(new Integer[]{ 0 , 2 }, target[0].toArray(new Integer[0]));
        com.google.gson.common.MoreAsserts.assertEquals(new Integer[]{ 3 , 4 }, target[1].toArray(new Integer[0]));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayOfCollectionDeserialization_literalMutation779() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfCollectionDeserialization_literalMutation779");
        String json = "[[1,2],[3,4]]";
        Type type = new TypeToken<java.util.Collection<java.lang.Integer>[]>() {        }.getType();
        Collection<java.lang.Integer>[] target = gson.fromJson(json, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,target.length);
        com.google.gson.common.MoreAsserts.assertEquals(new Integer[]{ 1 , 3 }, target[0].toArray(new Integer[0]));
        com.google.gson.common.MoreAsserts.assertEquals(new Integer[]{ 3 , 4 }, target[1].toArray(new Integer[0]));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayOfCollectionDeserialization_literalMutation780() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfCollectionDeserialization_literalMutation780");
        String json = "[[1,2],[3,4]]";
        Type type = new TypeToken<java.util.Collection<java.lang.Integer>[]>() {        }.getType();
        Collection<java.lang.Integer>[] target = gson.fromJson(json, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,target.length);
        com.google.gson.common.MoreAsserts.assertEquals(new Integer[]{ 1 , 2 }, target[-1].toArray(new Integer[0]));
        com.google.gson.common.MoreAsserts.assertEquals(new Integer[]{ 3 , 4 }, target[1].toArray(new Integer[0]));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayOfCollectionDeserialization_literalMutation781() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfCollectionDeserialization_literalMutation781");
        String json = "[[1,2],[3,4]]";
        Type type = new TypeToken<java.util.Collection<java.lang.Integer>[]>() {        }.getType();
        Collection<java.lang.Integer>[] target = gson.fromJson(json, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,target.length);
        com.google.gson.common.MoreAsserts.assertEquals(new Integer[]{ 1 , 2 }, target[0].toArray(new Integer[1]));
        com.google.gson.common.MoreAsserts.assertEquals(new Integer[]{ 3 , 4 }, target[1].toArray(new Integer[0]));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayOfCollectionDeserialization_literalMutation782() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfCollectionDeserialization_literalMutation782");
        String json = "[[1,2],[3,4]]";
        Type type = new TypeToken<java.util.Collection<java.lang.Integer>[]>() {        }.getType();
        Collection<java.lang.Integer>[] target = gson.fromJson(json, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,target.length);
        com.google.gson.common.MoreAsserts.assertEquals(new Integer[]{ 1 , 2 }, target[0].toArray(new Integer[0]));
        com.google.gson.common.MoreAsserts.assertEquals(new Integer[]{ 4 , 4 }, target[1].toArray(new Integer[0]));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayOfCollectionDeserialization_literalMutation783() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfCollectionDeserialization_literalMutation783");
        String json = "[[1,2],[3,4]]";
        Type type = new TypeToken<java.util.Collection<java.lang.Integer>[]>() {        }.getType();
        Collection<java.lang.Integer>[] target = gson.fromJson(json, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,target.length);
        com.google.gson.common.MoreAsserts.assertEquals(new Integer[]{ 1 , 2 }, target[0].toArray(new Integer[0]));
        com.google.gson.common.MoreAsserts.assertEquals(new Integer[]{ 3 , 3 }, target[1].toArray(new Integer[0]));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayOfCollectionDeserialization_literalMutation784() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfCollectionDeserialization_literalMutation784");
        String json = "[[1,2],[3,4]]";
        Type type = new TypeToken<java.util.Collection<java.lang.Integer>[]>() {        }.getType();
        Collection<java.lang.Integer>[] target = gson.fromJson(json, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,target.length);
        com.google.gson.common.MoreAsserts.assertEquals(new Integer[]{ 1 , 2 }, target[0].toArray(new Integer[0]));
        com.google.gson.common.MoreAsserts.assertEquals(new Integer[]{ 3 , 4 }, target[2].toArray(new Integer[0]));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayOfCollectionDeserialization_literalMutation785() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfCollectionDeserialization_literalMutation785");
        String json = "[[1,2],[3,4]]";
        Type type = new TypeToken<java.util.Collection<java.lang.Integer>[]>() {        }.getType();
        Collection<java.lang.Integer>[] target = gson.fromJson(json, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,target.length);
        com.google.gson.common.MoreAsserts.assertEquals(new Integer[]{ 1 , 2 }, target[0].toArray(new Integer[0]));
        com.google.gson.common.MoreAsserts.assertEquals(new Integer[]{ 3 , 4 }, target[1].toArray(new Integer[1]));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfCollectionDeserialization_remove760() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfCollectionDeserialization_remove760");
        String json = "[[1,2],[3,4]]";
        Type type = new TypeToken<java.util.Collection<java.lang.Integer>[]>() {        }.getType();
        Collection<java.lang.Integer>[] target = gson.fromJson(json, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,target.length);
        com.google.gson.common.MoreAsserts.assertEquals(new Integer[]{ 1 , 2 }, target[0].toArray(new Integer[0]));
        com.google.gson.common.MoreAsserts.assertEquals(new Integer[]{ 3 , 4 }, target[1].toArray(new Integer[0]));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfCollectionDeserialization_remove761() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfCollectionDeserialization_remove761");
        String json = "[[1,2],[3,4]]";
        Type type = new TypeToken<java.util.Collection<java.lang.Integer>[]>() {        }.getType();
        Collection<java.lang.Integer>[] target = gson.fromJson(json, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,target.length);
        com.google.gson.common.MoreAsserts.assertEquals(new Integer[]{ 3 , 4 }, target[1].toArray(new Integer[0]));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfCollectionDeserialization_remove762() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfCollectionDeserialization_remove762");
        String json = "[[1,2],[3,4]]";
        Type type = new TypeToken<java.util.Collection<java.lang.Integer>[]>() {        }.getType();
        Collection<java.lang.Integer>[] target = gson.fromJson(json, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,target.length);
        com.google.gson.common.MoreAsserts.assertEquals(new Integer[]{ 3 , 4 }, target[1].toArray(new Integer[0]));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayOfPrimitivesAsObjectsSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfPrimitivesAsObjectsSerialization");
        Object[] objs = new Object[]{ 0 , "abc" , 0.3F , 5L };
        String json = gson.toJson(objs);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),931,json,930,json.contains("abc"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,json,932,json.contains("0.3"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,json,934,json.contains("5"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayOfPrimitivesAsObjectsSerialization_literalMutation804() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfPrimitivesAsObjectsSerialization_literalMutation804");
        Object[] objs = new Object[]{ 1 , "foo" , 0.3F , 5L };
        String json = gson.toJson(objs);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),931,json,930,json.contains("abc"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,json,932,json.contains("0.3"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,json,934,json.contains("5"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayOfPrimitivesAsObjectsSerialization_literalMutation805() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfPrimitivesAsObjectsSerialization_literalMutation805");
        Object[] objs = new Object[]{ 1 , "abc" , -0.7F , 5L };
        String json = gson.toJson(objs);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),931,json,930,json.contains("abc"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,json,932,json.contains("0.3"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,json,934,json.contains("5"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayOfPrimitivesAsObjectsSerialization_literalMutation806() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfPrimitivesAsObjectsSerialization_literalMutation806");
        Object[] objs = new Object[]{ 1 , "abc" , 0.3F , 6L };
        String json = gson.toJson(objs);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),931,json,930,json.contains("abc"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,json,932,json.contains("0.3"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,json,934,json.contains("5"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayOfPrimitivesAsObjectsDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfPrimitivesAsObjectsDeserialization");
        String json = "foo";
        Object[] objs = gson.fromJson(json, Object[].class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),922,((java.lang.Number)(objs[0])),921,((java.lang.Number)(objs[0])).intValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),923,objs[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),925,((java.lang.Number)(objs[2])),924,((java.lang.Number)(objs[2])).doubleValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),926,new java.math.BigDecimal("1.1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,new java.math.BigDecimal(objs[3].toString()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),929,((java.lang.Number)(objs[4])),928,((java.lang.Number)(objs[4])).shortValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testObjectArrayWithNonPrimitivesSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectArrayWithNonPrimitivesSerialization");
        TestTypes.ClassWithObjects classWithObjects = new TestTypes.ClassWithObjects();
        TestTypes.BagOfPrimitives bagOfPrimitives = new TestTypes.BagOfPrimitives();
        String classWithObjectsJson = gson.toJson(classWithObjects);
        String bagOfPrimitivesJson = gson.toJson(bagOfPrimitives);
        Object[] objects = new Object[]{ classWithObjects , bagOfPrimitives };
        String json = gson.toJson(objects);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,json,961,json.contains(classWithObjectsJson));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,json,963,json.contains(bagOfPrimitivesJson));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayOfNullSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfNullSerialization");
        Object[] array = new Object[]{ null };
        String json = gson.toJson(array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),920,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayOfNullDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfNullDeserialization");
        String[] values = gson.fromJson("foo", String[].class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),919,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Regression tests for Issue 272
     */
public void testMultidimenstionalArraysSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultidimenstionalArraysSerialization");
        String[][] items = new String[][]{ new String[]{ "foo" , "71.72" , "0.02" , "0.03" , "4/2 12:00am" , "Manufacturing" } , new String[]{ "Alcoa Inc" , "29.01" , "0.42" , "1.47" , "4/1 12:00am" , "Manufacturing" } };
        String json = gson.toJson(items);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),952,json,951,json.contains("[[\"3m Co"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,json,953,json.contains("Manufacturing\"]]"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Regression tests for Issue 272
     */
public void testMultidimenstionalArraysSerialization_literalMutation824() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultidimenstionalArraysSerialization_literalMutation824");
        String[][] items = new String[][]{ new String[]{ "3m Co" , "foo" , "0.02" , "0.03" , "4/2 12:00am" , "Manufacturing" } , new String[]{ "Alcoa Inc" , "29.01" , "0.42" , "1.47" , "4/1 12:00am" , "Manufacturing" } };
        String json = gson.toJson(items);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),952,json,951,json.contains("[[\"3m Co"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,json,953,json.contains("Manufacturing\"]]"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Regression tests for Issue 272
     */
public void testMultidimenstionalArraysSerialization_literalMutation825() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultidimenstionalArraysSerialization_literalMutation825");
        String[][] items = new String[][]{ new String[]{ "3m Co" , "71.72" , "foo" , "0.03" , "4/2 12:00am" , "Manufacturing" } , new String[]{ "Alcoa Inc" , "29.01" , "0.42" , "1.47" , "4/1 12:00am" , "Manufacturing" } };
        String json = gson.toJson(items);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),952,json,951,json.contains("[[\"3m Co"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,json,953,json.contains("Manufacturing\"]]"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Regression tests for Issue 272
     */
public void testMultidimenstionalArraysSerialization_literalMutation826() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultidimenstionalArraysSerialization_literalMutation826");
        String[][] items = new String[][]{ new String[]{ "3m Co" , "71.72" , "0.02" , "foo" , "4/2 12:00am" , "Manufacturing" } , new String[]{ "Alcoa Inc" , "29.01" , "0.42" , "1.47" , "4/1 12:00am" , "Manufacturing" } };
        String json = gson.toJson(items);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),952,json,951,json.contains("[[\"3m Co"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,json,953,json.contains("Manufacturing\"]]"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Regression tests for Issue 272
     */
public void testMultidimenstionalArraysSerialization_literalMutation827() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultidimenstionalArraysSerialization_literalMutation827");
        String[][] items = new String[][]{ new String[]{ "3m Co" , "71.72" , "0.02" , "0.03" , "foo" , "Manufacturing" } , new String[]{ "Alcoa Inc" , "29.01" , "0.42" , "1.47" , "4/1 12:00am" , "Manufacturing" } };
        String json = gson.toJson(items);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),952,json,951,json.contains("[[\"3m Co"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,json,953,json.contains("Manufacturing\"]]"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Regression tests for Issue 272
     */
public void testMultidimenstionalArraysSerialization_literalMutation828() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultidimenstionalArraysSerialization_literalMutation828");
        String[][] items = new String[][]{ new String[]{ "3m Co" , "71.72" , "0.02" , "0.03" , "4/2 12:00am" , "foo" } , new String[]{ "Alcoa Inc" , "29.01" , "0.42" , "1.47" , "4/1 12:00am" , "Manufacturing" } };
        String json = gson.toJson(items);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),952,json,951,json.contains("[[\"3m Co"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,json,953,json.contains("Manufacturing\"]]"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Regression tests for Issue 272
     */
public void testMultidimenstionalArraysSerialization_literalMutation829() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultidimenstionalArraysSerialization_literalMutation829");
        String[][] items = new String[][]{ new String[]{ "3m Co" , "71.72" , "0.02" , "0.03" , "4/2 12:00am" , "Manufacturing" } , new String[]{ "foo" , "29.01" , "0.42" , "1.47" , "4/1 12:00am" , "Manufacturing" } };
        String json = gson.toJson(items);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),952,json,951,json.contains("[[\"3m Co"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,json,953,json.contains("Manufacturing\"]]"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Regression tests for Issue 272
     */
public void testMultidimenstionalArraysSerialization_literalMutation830() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultidimenstionalArraysSerialization_literalMutation830");
        String[][] items = new String[][]{ new String[]{ "3m Co" , "71.72" , "0.02" , "0.03" , "4/2 12:00am" , "Manufacturing" } , new String[]{ "Alcoa Inc" , "foo" , "0.42" , "1.47" , "4/1 12:00am" , "Manufacturing" } };
        String json = gson.toJson(items);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),952,json,951,json.contains("[[\"3m Co"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,json,953,json.contains("Manufacturing\"]]"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Regression tests for Issue 272
     */
public void testMultidimenstionalArraysSerialization_literalMutation831() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultidimenstionalArraysSerialization_literalMutation831");
        String[][] items = new String[][]{ new String[]{ "3m Co" , "71.72" , "0.02" , "0.03" , "4/2 12:00am" , "Manufacturing" } , new String[]{ "Alcoa Inc" , "29.01" , "foo" , "1.47" , "4/1 12:00am" , "Manufacturing" } };
        String json = gson.toJson(items);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),952,json,951,json.contains("[[\"3m Co"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,json,953,json.contains("Manufacturing\"]]"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Regression tests for Issue 272
     */
public void testMultidimenstionalArraysSerialization_literalMutation832() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultidimenstionalArraysSerialization_literalMutation832");
        String[][] items = new String[][]{ new String[]{ "3m Co" , "71.72" , "0.02" , "0.03" , "4/2 12:00am" , "Manufacturing" } , new String[]{ "Alcoa Inc" , "29.01" , "0.42" , "foo" , "4/1 12:00am" , "Manufacturing" } };
        String json = gson.toJson(items);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),952,json,951,json.contains("[[\"3m Co"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,json,953,json.contains("Manufacturing\"]]"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Regression tests for Issue 272
     */
public void testMultidimenstionalArraysSerialization_literalMutation833() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultidimenstionalArraysSerialization_literalMutation833");
        String[][] items = new String[][]{ new String[]{ "3m Co" , "71.72" , "0.02" , "0.03" , "4/2 12:00am" , "Manufacturing" } , new String[]{ "Alcoa Inc" , "29.01" , "0.42" , "1.47" , "foo" , "Manufacturing" } };
        String json = gson.toJson(items);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),952,json,951,json.contains("[[\"3m Co"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,json,953,json.contains("Manufacturing\"]]"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Regression tests for Issue 272
     */
public void testMultidimenstionalArraysSerialization_literalMutation834() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultidimenstionalArraysSerialization_literalMutation834");
        String[][] items = new String[][]{ new String[]{ "3m Co" , "71.72" , "0.02" , "0.03" , "4/2 12:00am" , "Manufacturing" } , new String[]{ "Alcoa Inc" , "29.01" , "0.42" , "1.47" , "4/1 12:00am" , "foo" } };
        String json = gson.toJson(items);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),952,json,951,json.contains("[[\"3m Co"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,json,953,json.contains("Manufacturing\"]]"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMultiDimenstionalObjectArraysSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiDimenstionalObjectArraysSerialization");
        Object[][] array = new Object[][]{ new Object[]{ 0 , 2 } };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),948,gson,947,gson.toJson(array));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMultiDimenstionalObjectArraysSerialization_literalMutation820() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiDimenstionalObjectArraysSerialization_literalMutation820");
        Object[][] array = new Object[][]{ new Object[]{ 1 , 3 } };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),948,gson,947,gson.toJson(array));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Regression test for Issue 205
     */
public void testMixingTypesInObjectArraySerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMixingTypesInObjectArraySerialization");
        Object[] array = new Object[]{ 0 , 2 , new Object[]{ "one" , "two" , 3 } };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),946,gson,945,gson.toJson(array));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Regression test for Issue 205
     */
public void testMixingTypesInObjectArraySerialization_literalMutation815() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMixingTypesInObjectArraySerialization_literalMutation815");
        Object[] array = new Object[]{ 1 , 3 , new Object[]{ "one" , "two" , 3 } };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),946,gson,945,gson.toJson(array));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Regression test for Issue 205
     */
public void testMixingTypesInObjectArraySerialization_literalMutation816() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMixingTypesInObjectArraySerialization_literalMutation816");
        Object[] array = new Object[]{ 1 , 2 , new Object[]{ "foo" , "two" , 3 } };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),946,gson,945,gson.toJson(array));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Regression test for Issue 205
     */
public void testMixingTypesInObjectArraySerialization_literalMutation817() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMixingTypesInObjectArraySerialization_literalMutation817");
        Object[] array = new Object[]{ 1 , 2 , new Object[]{ "one" , "foo" , 3 } };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),946,gson,945,gson.toJson(array));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Regression test for Issue 205
     */
public void testMixingTypesInObjectArraySerialization_literalMutation818() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMixingTypesInObjectArraySerialization_literalMutation818");
        Object[] array = new Object[]{ 1 , 2 , new Object[]{ "one" , "two" , 4 } };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),946,gson,945,gson.toJson(array));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Regression tests for Issue 272
     */
public void testMultidimenstionalArraysDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultidimenstionalArraysDeserialization");
        String json = "foo" + "[\'Alcoa Inc\',\'29.01\',\'0.42\',\'1.47\',\'4/1 12:00am\',\'Manufacturing\']]";
        String[][] items = gson.fromJson(json, String[][].class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,items[0][0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),950,items[1][5]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Regression tests for Issue 272
     */
public void testMultidimenstionalArraysDeserialization_literalMutation822() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultidimenstionalArraysDeserialization_literalMutation822");
        String json = "[[\'3m Co\',\'71.72\',\'0.02\',\'0.03\',\'4/2 12:00am\',\'Manufacturing\']," + "foo";
        String[][] items = gson.fromJson(json, String[][].class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,items[0][0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),950,items[1][5]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * http://code.google.com/p/google-gson/issues/detail?id=342
     */
public void testArrayElementsAreArrays() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayElementsAreArrays");
        Object[] stringArrays = new Object[]{ new String[]{ "foo" , "test2" } , new String[]{ "test3" , "test4" } };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),914,new com.google.gson.Gson(),913,new com.google.gson.Gson().toJson(stringArrays));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * http://code.google.com/p/google-gson/issues/detail?id=342
     */
public void testArrayElementsAreArrays_literalMutation774() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayElementsAreArrays_literalMutation774");
        Object[] stringArrays = new Object[]{ new String[]{ "test1" , "foo" } , new String[]{ "test3" , "test4" } };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),914,new com.google.gson.Gson(),913,new com.google.gson.Gson().toJson(stringArrays));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * http://code.google.com/p/google-gson/issues/detail?id=342
     */
public void testArrayElementsAreArrays_literalMutation775() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayElementsAreArrays_literalMutation775");
        Object[] stringArrays = new Object[]{ new String[]{ "test1" , "test2" } , new String[]{ "foo" , "test4" } };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),914,new com.google.gson.Gson(),913,new com.google.gson.Gson().toJson(stringArrays));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * http://code.google.com/p/google-gson/issues/detail?id=342
     */
public void testArrayElementsAreArrays_literalMutation776() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayElementsAreArrays_literalMutation776");
        Object[] stringArrays = new Object[]{ new String[]{ "test1" , "test2" } , new String[]{ "test3" , "foo" } };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),914,new com.google.gson.Gson(),913,new com.google.gson.Gson().toJson(stringArrays));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


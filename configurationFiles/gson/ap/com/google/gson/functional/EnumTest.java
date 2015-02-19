package com.google.gson.functional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.annotations.SerializedName;
import org.junit.Test;
import junit.framework.TestCase;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;

/** 
 * Functional tests for Java 5.0 enums.
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class EnumTest extends TestCase {
    private Gson gson;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        gson = new Gson();
    }

    public void testTopLevelEnumSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelEnumSerialization");
        String result = gson.toJson(MyEnum.VALUE1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1470,(('\"' + (com.google.gson.functional.EnumTest.MyEnum.VALUE1.toString())) + '\"'));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1471,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelEnumDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelEnumDeserialization");
        MyEnum result = gson.fromJson((('\"' + (MyEnum.VALUE1.toString())) + '\"'), MyEnum.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1468,com.google.gson.functional.EnumTest.MyEnum.VALUE1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1469,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCollectionOfEnumsSerialization_add1117() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfEnumsSerialization_add1117");
        Type type = new TypeToken<java.util.Collection<MyEnum>>() {        }.getType();
        Collection<MyEnum> target = new ArrayList<MyEnum>();
        target.add(MyEnum.VALUE1);
        target.add(MyEnum.VALUE2);
        String expectedJson = "[\"VALUE1\",\"VALUE2\"]";
        String actualJson = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1428,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1429,actualJson);
        actualJson = gson.toJson(target, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1430,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1431,actualJson);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCollectionOfEnumsSerialization_add1118() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfEnumsSerialization_add1118");
        Type type = new TypeToken<java.util.Collection<MyEnum>>() {        }.getType();
        Collection<MyEnum> target = new ArrayList<MyEnum>();
        target.add(MyEnum.VALUE1);
        target.add(MyEnum.VALUE1);
        target.add(MyEnum.VALUE2);
        String expectedJson = "[\"VALUE1\",\"VALUE2\"]";
        String actualJson = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1428,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1429,actualJson);
        actualJson = gson.toJson(target, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1430,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1431,actualJson);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCollectionOfEnumsSerialization_add1119() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfEnumsSerialization_add1119");
        Type type = new TypeToken<java.util.Collection<MyEnum>>() {        }.getType();
        Collection<MyEnum> target = new ArrayList<MyEnum>();
        target.add(MyEnum.VALUE1);
        target.add(MyEnum.VALUE2);
        target.add(MyEnum.VALUE2);
        String expectedJson = "[\"VALUE1\",\"VALUE2\"]";
        String actualJson = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1428,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1429,actualJson);
        actualJson = gson.toJson(target, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1430,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1431,actualJson);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCollectionOfEnumsSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfEnumsSerialization");
        Type type = new TypeToken<java.util.Collection<MyEnum>>() {        }.getType();
        Collection<MyEnum> target = new ArrayList<MyEnum>();
        target.add(MyEnum.VALUE1);
        target.add(MyEnum.VALUE2);
        String expectedJson = "foo";
        String actualJson = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1428,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1429,actualJson);
        actualJson = gson.toJson(target, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1430,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1431,actualJson);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCollectionOfEnumsSerialization_remove934() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfEnumsSerialization_remove934");
        Type type = new TypeToken<java.util.Collection<MyEnum>>() {        }.getType();
        Collection<MyEnum> target = new ArrayList<MyEnum>();
        target.add(MyEnum.VALUE1);
        target.add(MyEnum.VALUE2);
        String expectedJson = "[\"VALUE1\",\"VALUE2\"]";
        String actualJson = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1428,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1429,actualJson);
        actualJson = gson.toJson(target, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1430,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1431,actualJson);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCollectionOfEnumsSerialization_remove935() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfEnumsSerialization_remove935");
        Type type = new TypeToken<java.util.Collection<MyEnum>>() {        }.getType();
        Collection<MyEnum> target = new ArrayList<MyEnum>();
        target.add(MyEnum.VALUE2);
        String expectedJson = "[\"VALUE1\",\"VALUE2\"]";
        String actualJson = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1428,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1429,actualJson);
        actualJson = gson.toJson(target, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1430,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1431,actualJson);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCollectionOfEnumsSerialization_remove936() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfEnumsSerialization_remove936");
        Type type = new TypeToken<java.util.Collection<MyEnum>>() {        }.getType();
        Collection<MyEnum> target = new ArrayList<MyEnum>();
        target.add(MyEnum.VALUE2);
        String expectedJson = "[\"VALUE1\",\"VALUE2\"]";
        String actualJson = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1428,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1429,actualJson);
        actualJson = gson.toJson(target, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1430,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1431,actualJson);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCollectionOfEnumsDeserialization_add1114() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfEnumsDeserialization_add1114");
        Type type = new TypeToken<java.util.Collection<MyEnum>>() {        }.getType();
        String json = "[\"VALUE1\",\"VALUE2\"]";
        Collection<MyEnum> target = gson.fromJson(json, type);
        com.google.gson.common.MoreAsserts.assertContains(target, MyEnum.VALUE1);
        com.google.gson.common.MoreAsserts.assertContains(target, MyEnum.VALUE2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCollectionOfEnumsDeserialization_add1115() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfEnumsDeserialization_add1115");
        Type type = new TypeToken<java.util.Collection<MyEnum>>() {        }.getType();
        String json = "[\"VALUE1\",\"VALUE2\"]";
        Collection<MyEnum> target = gson.fromJson(json, type);
        com.google.gson.common.MoreAsserts.assertContains(target, MyEnum.VALUE1);
        com.google.gson.common.MoreAsserts.assertContains(target, MyEnum.VALUE1);
        com.google.gson.common.MoreAsserts.assertContains(target, MyEnum.VALUE2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCollectionOfEnumsDeserialization_add1116() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfEnumsDeserialization_add1116");
        Type type = new TypeToken<java.util.Collection<MyEnum>>() {        }.getType();
        String json = "[\"VALUE1\",\"VALUE2\"]";
        Collection<MyEnum> target = gson.fromJson(json, type);
        com.google.gson.common.MoreAsserts.assertContains(target, MyEnum.VALUE1);
        com.google.gson.common.MoreAsserts.assertContains(target, MyEnum.VALUE2);
        com.google.gson.common.MoreAsserts.assertContains(target, MyEnum.VALUE2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCollectionOfEnumsDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfEnumsDeserialization");
        Type type = new TypeToken<java.util.Collection<MyEnum>>() {        }.getType();
        String json = "foo";
        Collection<MyEnum> target = gson.fromJson(json, type);
        com.google.gson.common.MoreAsserts.assertContains(target, MyEnum.VALUE1);
        com.google.gson.common.MoreAsserts.assertContains(target, MyEnum.VALUE2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCollectionOfEnumsDeserialization_remove931() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfEnumsDeserialization_remove931");
        Type type = new TypeToken<java.util.Collection<MyEnum>>() {        }.getType();
        String json = "[\"VALUE1\",\"VALUE2\"]";
        Collection<MyEnum> target = gson.fromJson(json, type);
        com.google.gson.common.MoreAsserts.assertContains(target, MyEnum.VALUE1);
        com.google.gson.common.MoreAsserts.assertContains(target, MyEnum.VALUE2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCollectionOfEnumsDeserialization_remove932() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfEnumsDeserialization_remove932");
        Type type = new TypeToken<java.util.Collection<MyEnum>>() {        }.getType();
        String json = "[\"VALUE1\",\"VALUE2\"]";
        Collection<MyEnum> target = gson.fromJson(json, type);
        com.google.gson.common.MoreAsserts.assertContains(target, MyEnum.VALUE2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCollectionOfEnumsDeserialization_remove933() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfEnumsDeserialization_remove933");
        Type type = new TypeToken<java.util.Collection<MyEnum>>() {        }.getType();
        String json = "[\"VALUE1\",\"VALUE2\"]";
        Collection<MyEnum> target = gson.fromJson(json, type);
        com.google.gson.common.MoreAsserts.assertContains(target, MyEnum.VALUE2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testClassWithEnumFieldSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClassWithEnumFieldSerialization");
        ClassWithEnumFields target = new ClassWithEnumFields();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1425,target,1424,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1427,gson,1426,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testClassWithEnumFieldDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClassWithEnumFieldDeserialization");
        String json = "foo";
        ClassWithEnumFields target = gson.fromJson(json, ClassWithEnumFields.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1420,com.google.gson.functional.EnumTest.MyEnum.VALUE1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1421,target.value1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1422,com.google.gson.functional.EnumTest.MyEnum.VALUE2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1423,target.value2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static enum MyEnum {
VALUE1, VALUE2;    }

    private static class ClassWithEnumFields {
        private final MyEnum value1 = MyEnum.VALUE1;

        private final MyEnum value2 = MyEnum.VALUE2;

        public String getExpectedJson() {
            return ((("{\"value1\":\"" + (value1)) + "\",\"value2\":\"") + (value2)) + "\"}";
        }
    }

    /** 
     * Test for issue 226.
     */
@Test(timeout = 1000)
    public void testEnumSubclass() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEnumSubclass");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1456,((com.google.gson.functional.EnumTest.Roshambo.class) == (com.google.gson.functional.EnumTest.Roshambo.ROCK.getClass())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1458,gson,1457,gson.toJson(com.google.gson.functional.EnumTest.Roshambo.ROCK));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1460,gson,1459,gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest.Roshambo.class)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1461,com.google.gson.functional.EnumTest.Roshambo.ROCK);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1463,gson,1462,gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest.Roshambo.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1465,null,1464,java.util.EnumSet.allOf(com.google.gson.functional.EnumTest.Roshambo.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1467,gson,1466,gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest.Roshambo>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for issue 226.
     */
@Test(timeout = 1000)
    public void testEnumSubclass_remove938() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEnumSubclass_remove938");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1456,((com.google.gson.functional.EnumTest.Roshambo.class) == (com.google.gson.functional.EnumTest.Roshambo.ROCK.getClass())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1458,gson,1457,gson.toJson(com.google.gson.functional.EnumTest.Roshambo.ROCK));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1460,gson,1459,gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest.Roshambo.class)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1461,com.google.gson.functional.EnumTest.Roshambo.ROCK);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1463,gson,1462,gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest.Roshambo.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1465,null,1464,java.util.EnumSet.allOf(com.google.gson.functional.EnumTest.Roshambo.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1467,gson,1466,gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest.Roshambo>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEnumSubclassWithRegisteredTypeAdapter() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEnumSubclassWithRegisteredTypeAdapter");
        gson = new GsonBuilder().registerTypeHierarchyAdapter(Roshambo.class, new MyEnumTypeAdapter()).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1444,((com.google.gson.functional.EnumTest.Roshambo.class) == (com.google.gson.functional.EnumTest.Roshambo.ROCK.getClass())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1446,gson,1445,gson.toJson(com.google.gson.functional.EnumTest.Roshambo.ROCK));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1448,gson,1447,gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest.Roshambo.class)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1449,com.google.gson.functional.EnumTest.Roshambo.ROCK);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1451,gson,1450,gson.fromJson("\"123ROCK\"", com.google.gson.functional.EnumTest.Roshambo.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1453,null,1452,java.util.EnumSet.allOf(com.google.gson.functional.EnumTest.Roshambo.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1455,gson,1454,gson.fromJson("[\"123ROCK\",\"123PAPER\",\"123SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest.Roshambo>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEnumSubclassWithRegisteredTypeAdapter_remove944() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEnumSubclassWithRegisteredTypeAdapter_remove944");
        gson = new GsonBuilder().registerTypeHierarchyAdapter(Roshambo.class, new MyEnumTypeAdapter()).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1444,((com.google.gson.functional.EnumTest.Roshambo.class) == (com.google.gson.functional.EnumTest.Roshambo.ROCK.getClass())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1446,gson,1445,gson.toJson(com.google.gson.functional.EnumTest.Roshambo.ROCK));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1448,gson,1447,gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest.Roshambo.class)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1449,com.google.gson.functional.EnumTest.Roshambo.ROCK);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1451,gson,1450,gson.fromJson("\"123ROCK\"", com.google.gson.functional.EnumTest.Roshambo.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1453,null,1452,java.util.EnumSet.allOf(com.google.gson.functional.EnumTest.Roshambo.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1455,gson,1454,gson.fromJson("[\"123ROCK\",\"123PAPER\",\"123SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest.Roshambo>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEnumSubclassAsParameterizedType() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEnumSubclassAsParameterizedType");
        Collection<Roshambo> list = new ArrayList<Roshambo>();
        list.add(Roshambo.ROCK);
        list.add(Roshambo.ROCK);
        list.add(Roshambo.PAPER);
        String json = gson.toJson(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1443,json);
        Type collectionType = new TypeToken<java.util.Collection<Roshambo>>() {        }.getType();
        Collection<Roshambo> actualJsonList = gson.fromJson(json, collectionType);
        com.google.gson.common.MoreAsserts.assertContains(actualJsonList, Roshambo.ROCK);
        com.google.gson.common.MoreAsserts.assertContains(actualJsonList, Roshambo.PAPER);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEnumSubclassAsParameterizedType_add1123() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEnumSubclassAsParameterizedType_add1123");
        Collection<Roshambo> list = new ArrayList<Roshambo>();
        list.add(Roshambo.ROCK);
        list.add(Roshambo.PAPER);
        list.add(Roshambo.PAPER);
        String json = gson.toJson(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1443,json);
        Type collectionType = new TypeToken<java.util.Collection<Roshambo>>() {        }.getType();
        Collection<Roshambo> actualJsonList = gson.fromJson(json, collectionType);
        com.google.gson.common.MoreAsserts.assertContains(actualJsonList, Roshambo.ROCK);
        com.google.gson.common.MoreAsserts.assertContains(actualJsonList, Roshambo.PAPER);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEnumSubclassAsParameterizedType_add1124() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEnumSubclassAsParameterizedType_add1124");
        Collection<Roshambo> list = new ArrayList<Roshambo>();
        list.add(Roshambo.ROCK);
        list.add(Roshambo.PAPER);
        String json = gson.toJson(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1443,json);
        Type collectionType = new TypeToken<java.util.Collection<Roshambo>>() {        }.getType();
        Collection<Roshambo> actualJsonList = gson.fromJson(json, collectionType);
        com.google.gson.common.MoreAsserts.assertContains(actualJsonList, Roshambo.ROCK);
        com.google.gson.common.MoreAsserts.assertContains(actualJsonList, Roshambo.PAPER);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEnumSubclassAsParameterizedType_add1125() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEnumSubclassAsParameterizedType_add1125");
        Collection<Roshambo> list = new ArrayList<Roshambo>();
        list.add(Roshambo.ROCK);
        list.add(Roshambo.PAPER);
        String json = gson.toJson(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1443,json);
        Type collectionType = new TypeToken<java.util.Collection<Roshambo>>() {        }.getType();
        Collection<Roshambo> actualJsonList = gson.fromJson(json, collectionType);
        com.google.gson.common.MoreAsserts.assertContains(actualJsonList, Roshambo.ROCK);
        com.google.gson.common.MoreAsserts.assertContains(actualJsonList, Roshambo.ROCK);
        com.google.gson.common.MoreAsserts.assertContains(actualJsonList, Roshambo.PAPER);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEnumSubclassAsParameterizedType_add1126() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEnumSubclassAsParameterizedType_add1126");
        Collection<Roshambo> list = new ArrayList<Roshambo>();
        list.add(Roshambo.ROCK);
        list.add(Roshambo.PAPER);
        String json = gson.toJson(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1443,json);
        Type collectionType = new TypeToken<java.util.Collection<Roshambo>>() {        }.getType();
        Collection<Roshambo> actualJsonList = gson.fromJson(json, collectionType);
        com.google.gson.common.MoreAsserts.assertContains(actualJsonList, Roshambo.ROCK);
        com.google.gson.common.MoreAsserts.assertContains(actualJsonList, Roshambo.PAPER);
        com.google.gson.common.MoreAsserts.assertContains(actualJsonList, Roshambo.PAPER);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEnumSubclassAsParameterizedType_remove939() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEnumSubclassAsParameterizedType_remove939");
        Collection<Roshambo> list = new ArrayList<Roshambo>();
        list.add(Roshambo.PAPER);
        String json = gson.toJson(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1443,json);
        Type collectionType = new TypeToken<java.util.Collection<Roshambo>>() {        }.getType();
        Collection<Roshambo> actualJsonList = gson.fromJson(json, collectionType);
        com.google.gson.common.MoreAsserts.assertContains(actualJsonList, Roshambo.ROCK);
        com.google.gson.common.MoreAsserts.assertContains(actualJsonList, Roshambo.PAPER);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEnumSubclassAsParameterizedType_remove940() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEnumSubclassAsParameterizedType_remove940");
        Collection<Roshambo> list = new ArrayList<Roshambo>();
        list.add(Roshambo.PAPER);
        String json = gson.toJson(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1443,json);
        Type collectionType = new TypeToken<java.util.Collection<Roshambo>>() {        }.getType();
        Collection<Roshambo> actualJsonList = gson.fromJson(json, collectionType);
        com.google.gson.common.MoreAsserts.assertContains(actualJsonList, Roshambo.ROCK);
        com.google.gson.common.MoreAsserts.assertContains(actualJsonList, Roshambo.PAPER);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEnumSubclassAsParameterizedType_remove941() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEnumSubclassAsParameterizedType_remove941");
        Collection<Roshambo> list = new ArrayList<Roshambo>();
        list.add(Roshambo.ROCK);
        list.add(Roshambo.PAPER);
        String json = gson.toJson(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1443,json);
        Type collectionType = new TypeToken<java.util.Collection<Roshambo>>() {        }.getType();
        Collection<Roshambo> actualJsonList = gson.fromJson(json, collectionType);
        com.google.gson.common.MoreAsserts.assertContains(actualJsonList, Roshambo.ROCK);
        com.google.gson.common.MoreAsserts.assertContains(actualJsonList, Roshambo.PAPER);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEnumSubclassAsParameterizedType_remove942() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEnumSubclassAsParameterizedType_remove942");
        Collection<Roshambo> list = new ArrayList<Roshambo>();
        list.add(Roshambo.ROCK);
        list.add(Roshambo.PAPER);
        String json = gson.toJson(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1443,json);
        Type collectionType = new TypeToken<java.util.Collection<Roshambo>>() {        }.getType();
        Collection<Roshambo> actualJsonList = gson.fromJson(json, collectionType);
        com.google.gson.common.MoreAsserts.assertContains(actualJsonList, Roshambo.PAPER);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEnumSubclassAsParameterizedType_remove943() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEnumSubclassAsParameterizedType_remove943");
        Collection<Roshambo> list = new ArrayList<Roshambo>();
        list.add(Roshambo.ROCK);
        list.add(Roshambo.PAPER);
        String json = gson.toJson(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1443,json);
        Type collectionType = new TypeToken<java.util.Collection<Roshambo>>() {        }.getType();
        Collection<Roshambo> actualJsonList = gson.fromJson(json, collectionType);
        com.google.gson.common.MoreAsserts.assertContains(actualJsonList, Roshambo.PAPER);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEnumCaseMapping() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEnumCaseMapping");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1432,com.google.gson.functional.EnumTest.Gender.MALE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1434,gson,1433,gson.fromJson("\"boy\"", com.google.gson.functional.EnumTest.Gender.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1436,gson,1435,gson.toJson(com.google.gson.functional.EnumTest.Gender.MALE, com.google.gson.functional.EnumTest.Gender.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEnumSet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEnumSet");
        EnumSet<Roshambo> foo = EnumSet.of(Roshambo.ROCK, Roshambo.PAPER);
        String json = gson.toJson(foo);
        Type type = new TypeToken<java.util.EnumSet<Roshambo>>() {        }.getType();
        EnumSet<Roshambo> bar = gson.fromJson(json, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1438,bar,1437,bar.contains(com.google.gson.functional.EnumTest.Roshambo.ROCK));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1440,bar,1439,bar.contains(com.google.gson.functional.EnumTest.Roshambo.PAPER));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1442,bar,1441,bar.contains(com.google.gson.functional.EnumTest.Roshambo.SCISSORS));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEnumSet_remove937() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEnumSet_remove937");
        EnumSet<Roshambo> foo = EnumSet.of(Roshambo.ROCK, Roshambo.PAPER);
        String json = gson.toJson(foo);
        Type type = new TypeToken<java.util.EnumSet<Roshambo>>() {        }.getType();
        EnumSet<Roshambo> bar = gson.fromJson(json, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1438,bar,1437,bar.contains(com.google.gson.functional.EnumTest.Roshambo.ROCK));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1440,bar,1439,bar.contains(com.google.gson.functional.EnumTest.Roshambo.PAPER));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1442,bar,1441,bar.contains(com.google.gson.functional.EnumTest.Roshambo.SCISSORS));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public enum Roshambo {
ROCK {
            @Override
            Roshambo defeats() {
                return Roshambo.SCISSORS;
            }
        }, PAPER {
            @Override
            Roshambo defeats() {
                return Roshambo.ROCK;
            }
        }, SCISSORS {
            @Override
            Roshambo defeats() {
                return Roshambo.PAPER;
            }
        };
        abstract Roshambo defeats();
    }

    private static class MyEnumTypeAdapter implements JsonDeserializer<Roshambo> , JsonSerializer<Roshambo> {
        public JsonElement serialize(Roshambo src, Type typeOfSrc, JsonSerializationContext context) {
            return new JsonPrimitive(("123" + (src.name())));
        }

        public Roshambo deserialize(JsonElement json, Type classOfT, JsonDeserializationContext context) throws JsonParseException {
            return Roshambo.valueOf(json.getAsString().substring(3));
        }
    }

    public enum Gender {
MALE, FEMALE;    }
}


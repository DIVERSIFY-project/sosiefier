package com.google.gson.functional;

import java.util.ArrayList;
import java.util.Collection;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import org.junit.Test;
import junit.framework.TestCase;
import com.google.gson.common.TestTypes;
import java.util.TreeSet;

/** 
 * Functional tests for Json serialization and deserialization of classes with
 * inheritance hierarchies.
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class InheritanceTest extends TestCase {
    private Gson gson;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        gson = new Gson();
    }

    public void testSubClassSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubClassSerialization");
        SubTypeOfNested target = new SubTypeOfNested(new TestTypes.BagOfPrimitives(11 , 20 , false , "stringValue") , new TestTypes.BagOfPrimitives(30 , 40 , true , "stringValue"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1618,target,1617,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1620,gson,1619,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSubClassSerialization_literalMutation1274() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubClassSerialization_literalMutation1274");
        SubTypeOfNested target = new SubTypeOfNested(new TestTypes.BagOfPrimitives(10 , 19 , false , "stringValue") , new TestTypes.BagOfPrimitives(30 , 40 , true , "stringValue"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1618,target,1617,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1620,gson,1619,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSubClassSerialization_literalMutation1275() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubClassSerialization_literalMutation1275");
        SubTypeOfNested target = new SubTypeOfNested(new TestTypes.BagOfPrimitives(10 , 20 , false , "stringValue") , new TestTypes.BagOfPrimitives(30 , 40 , true , "stringValue"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1618,target,1617,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1620,gson,1619,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSubClassSerialization_literalMutation1276() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubClassSerialization_literalMutation1276");
        SubTypeOfNested target = new SubTypeOfNested(new TestTypes.BagOfPrimitives(10 , 20 , false , "foo") , new TestTypes.BagOfPrimitives(30 , 40 , true , "stringValue"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1618,target,1617,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1620,gson,1619,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSubClassSerialization_literalMutation1277() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubClassSerialization_literalMutation1277");
        SubTypeOfNested target = new SubTypeOfNested(new TestTypes.BagOfPrimitives(10 , 20 , false , "stringValue") , new TestTypes.BagOfPrimitives(31 , 40 , true , "stringValue"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1618,target,1617,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1620,gson,1619,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSubClassSerialization_literalMutation1278() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubClassSerialization_literalMutation1278");
        SubTypeOfNested target = new SubTypeOfNested(new TestTypes.BagOfPrimitives(10 , 20 , false , "stringValue") , new TestTypes.BagOfPrimitives(30 , 39 , true , "stringValue"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1618,target,1617,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1620,gson,1619,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSubClassSerialization_literalMutation1279() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubClassSerialization_literalMutation1279");
        SubTypeOfNested target = new SubTypeOfNested(new TestTypes.BagOfPrimitives(10 , 20 , false , "stringValue") , new TestTypes.BagOfPrimitives(30 , 40 , false , "stringValue"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1618,target,1617,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1620,gson,1619,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSubClassSerialization_literalMutation1280() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubClassSerialization_literalMutation1280");
        SubTypeOfNested target = new SubTypeOfNested(new TestTypes.BagOfPrimitives(10 , 20 , false , "stringValue") , new TestTypes.BagOfPrimitives(30 , 40 , true , "foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1618,target,1617,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1620,gson,1619,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSubClassDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubClassDeserialization");
        String json = "foo" + ("\"booleanValue\":false,\"stringValue\":\"stringValue\"},\"primitive2\":" + ("{\"longValue\":30,\"intValue\":40,\"booleanValue\":true," + "\"stringValue\":\"stringValue\"}}"));
        SubTypeOfNested target = gson.fromJson(json, SubTypeOfNested.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1614,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1616,target,1615,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSubClassDeserialization_literalMutation1270() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubClassDeserialization_literalMutation1270");
        String json = "{\"value\":5,\"primitive1\":{\"longValue\":10,\"intValue\":20," + ("foo" + ("{\"longValue\":30,\"intValue\":40,\"booleanValue\":true," + "\"stringValue\":\"stringValue\"}}"));
        SubTypeOfNested target = gson.fromJson(json, SubTypeOfNested.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1614,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1616,target,1615,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSubClassDeserialization_literalMutation1271() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubClassDeserialization_literalMutation1271");
        String json = "{\"value\":5,\"primitive1\":{\"longValue\":10,\"intValue\":20," + ("\"booleanValue\":false,\"stringValue\":\"stringValue\"},\"primitive2\":" + ("foo" + "\"stringValue\":\"stringValue\"}}"));
        SubTypeOfNested target = gson.fromJson(json, SubTypeOfNested.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1614,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1616,target,1615,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSubClassDeserialization_literalMutation1272() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubClassDeserialization_literalMutation1272");
        String json = "{\"value\":5,\"primitive1\":{\"longValue\":10,\"intValue\":20," + ("\"booleanValue\":false,\"stringValue\":\"stringValue\"},\"primitive2\":" + ("{\"longValue\":30,\"intValue\":40,\"booleanValue\":true," + "foo"));
        SubTypeOfNested target = gson.fromJson(json, SubTypeOfNested.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1614,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1616,target,1615,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testClassWithBaseFieldSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClassWithBaseFieldSerialization");
        TestTypes.ClassWithBaseField sub = new TestTypes.ClassWithBaseField(new TestTypes.Sub());
        JsonObject json = ((JsonObject)(gson.toJsonTree(sub)));
        JsonElement base = json.getAsJsonObject().get(TestTypes.ClassWithBaseField.FIELD_KEY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1611,com.google.gson.common.TestTypes.Sub.SUB_NAME);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1613,base.getAsJsonObject().get(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY),1612,base.getAsJsonObject().get(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testClassWithBaseArrayFieldSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClassWithBaseArrayFieldSerialization");
        TestTypes.Base[] baseClasses = new TestTypes.Base[]{ new TestTypes.Sub() , new TestTypes.Sub() };
        TestTypes.ClassWithBaseArrayField sub = new TestTypes.ClassWithBaseArrayField(baseClasses);
        JsonObject json = gson.toJsonTree(sub).getAsJsonObject();
        JsonArray bases = json.get(TestTypes.ClassWithBaseArrayField.FIELD_KEY).getAsJsonArray();
        for (JsonElement element : bases) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1605,com.google.gson.common.TestTypes.Sub.SUB_NAME);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1607,element.getAsJsonObject().get(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY),1606,element.getAsJsonObject().get(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY).getAsString());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClassWithBaseCollectionFieldSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClassWithBaseCollectionFieldSerialization");
        Collection<com.google.gson.common.TestTypes.Base> baseClasses = new ArrayList<com.google.gson.common.TestTypes.Base>();
        baseClasses.add(new TestTypes.Sub());
        baseClasses.add(new TestTypes.Sub());
        baseClasses.add(new TestTypes.Sub());
        TestTypes.ClassWithBaseCollectionField sub = new TestTypes.ClassWithBaseCollectionField(baseClasses);
        JsonObject json = gson.toJsonTree(sub).getAsJsonObject();
        JsonArray bases = json.get(TestTypes.ClassWithBaseArrayField.FIELD_KEY).getAsJsonArray();
        for (JsonElement element : bases) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1608,com.google.gson.common.TestTypes.Sub.SUB_NAME);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1610,element.getAsJsonObject().get(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY),1609,element.getAsJsonObject().get(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY).getAsString());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClassWithBaseCollectionFieldSerialization_add1138() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClassWithBaseCollectionFieldSerialization_add1138");
        Collection<com.google.gson.common.TestTypes.Base> baseClasses = new ArrayList<com.google.gson.common.TestTypes.Base>();
        baseClasses.add(new TestTypes.Sub());
        baseClasses.add(new TestTypes.Sub());
        baseClasses.add(new TestTypes.Sub());
        TestTypes.ClassWithBaseCollectionField sub = new TestTypes.ClassWithBaseCollectionField(baseClasses);
        JsonObject json = gson.toJsonTree(sub).getAsJsonObject();
        JsonArray bases = json.get(TestTypes.ClassWithBaseArrayField.FIELD_KEY).getAsJsonArray();
        for (JsonElement element : bases) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1608,com.google.gson.common.TestTypes.Sub.SUB_NAME);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1610,element.getAsJsonObject().get(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY),1609,element.getAsJsonObject().get(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY).getAsString());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClassWithBaseCollectionFieldSerialization_remove954() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClassWithBaseCollectionFieldSerialization_remove954");
        Collection<com.google.gson.common.TestTypes.Base> baseClasses = new ArrayList<com.google.gson.common.TestTypes.Base>();
        baseClasses.add(new TestTypes.Sub());
        TestTypes.ClassWithBaseCollectionField sub = new TestTypes.ClassWithBaseCollectionField(baseClasses);
        JsonObject json = gson.toJsonTree(sub).getAsJsonObject();
        JsonArray bases = json.get(TestTypes.ClassWithBaseArrayField.FIELD_KEY).getAsJsonArray();
        for (JsonElement element : bases) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1608,com.google.gson.common.TestTypes.Sub.SUB_NAME);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1610,element.getAsJsonObject().get(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY),1609,element.getAsJsonObject().get(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY).getAsString());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClassWithBaseCollectionFieldSerialization_remove955() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClassWithBaseCollectionFieldSerialization_remove955");
        Collection<com.google.gson.common.TestTypes.Base> baseClasses = new ArrayList<com.google.gson.common.TestTypes.Base>();
        baseClasses.add(new TestTypes.Sub());
        TestTypes.ClassWithBaseCollectionField sub = new TestTypes.ClassWithBaseCollectionField(baseClasses);
        JsonObject json = gson.toJsonTree(sub).getAsJsonObject();
        JsonArray bases = json.get(TestTypes.ClassWithBaseArrayField.FIELD_KEY).getAsJsonArray();
        for (JsonElement element : bases) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1608,com.google.gson.common.TestTypes.Sub.SUB_NAME);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1610,element.getAsJsonObject().get(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY),1609,element.getAsJsonObject().get(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY).getAsString());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBaseSerializedAsSub() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBaseSerializedAsSub");
        TestTypes.Base base = new TestTypes.Sub();
        JsonObject json = gson.toJsonTree(base).getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1595,com.google.gson.common.TestTypes.Sub.SUB_NAME);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1597,json.get(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY),1596,json.get(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBaseSerializedAsSubForToJsonMethod() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBaseSerializedAsSubForToJsonMethod");
        TestTypes.Base base = new TestTypes.Sub();
        String json = gson.toJson(base);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1599,json,1598,json.contains(com.google.gson.common.TestTypes.Sub.SUB_NAME));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitType() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBaseSerializedAsBaseWhenSpecifiedWithExplicitType");
        TestTypes.Base base = new TestTypes.Sub();
        JsonObject json = gson.toJsonTree(base, TestTypes.Base.class).getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1586,com.google.gson.common.TestTypes.Base.BASE_NAME);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1588,json.get(com.google.gson.common.TestTypes.Base.BASE_FIELD_KEY),1587,json.get(com.google.gson.common.TestTypes.Base.BASE_FIELD_KEY).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1590,json,1589,json.get(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod");
        TestTypes.Base base = new TestTypes.Sub();
        String json = gson.toJson(base, TestTypes.Base.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1592,json,1591,json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1594,json,1593,json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBaseSerializedAsSubWhenSpecifiedWithExplicitType() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBaseSerializedAsSubWhenSpecifiedWithExplicitType");
        TestTypes.Base base = new TestTypes.Sub();
        JsonObject json = gson.toJsonTree(base, TestTypes.Sub.class).getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1600,com.google.gson.common.TestTypes.Sub.SUB_NAME);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1602,json.get(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY),1601,json.get(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBaseSerializedAsSubWhenSpecifiedWithExplicitTypeForToJsonMethod() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBaseSerializedAsSubWhenSpecifiedWithExplicitTypeForToJsonMethod");
        TestTypes.Base base = new TestTypes.Sub();
        String json = gson.toJson(base, TestTypes.Sub.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1604,json,1603,json.contains(com.google.gson.common.TestTypes.Sub.SUB_NAME));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static class SubTypeOfNested extends TestTypes.Nested {
        private final long value = 5;

        public SubTypeOfNested(TestTypes.BagOfPrimitives primitive1 ,TestTypes.BagOfPrimitives primitive2) {
            super(primitive1, primitive2);
        }

        @Override
        public void appendFields(StringBuilder sb) {
            sb.append("\"value\":").append(value).append(",");
            super.appendFields(sb);
        }
    }

    @Test(timeout = 1000)
    public void testSubInterfacesOfCollectionSerialization_add1139() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_add1139");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.1F);
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSubInterfacesOfCollectionSerialization_add1140() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_add1140");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.1F);
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSubInterfacesOfCollectionSerialization_add1141() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_add1141");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.1F);
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSubInterfacesOfCollectionSerialization_add1142() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_add1142");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.1F);
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSubInterfacesOfCollectionSerialization_add1143() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_add1143");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(0L);
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.1F);
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSubInterfacesOfCollectionSerialization_add1144() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_add1144");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(1L);
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.1F);
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSubInterfacesOfCollectionSerialization_add1145() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_add1145");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(1L);
        queue.add(2L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.1F);
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSubInterfacesOfCollectionSerialization_add1146() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_add1146");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.1F);
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSubInterfacesOfCollectionSerialization_add1147() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_add1147");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.1F);
        set.add(0.1F);
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSubInterfacesOfCollectionSerialization_add1148() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_add1148");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.1F);
        set.add(0.2F);
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSubInterfacesOfCollectionSerialization_add1149() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_add1149");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.1F);
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSubInterfacesOfCollectionSerialization_add1150() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_add1150");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.1F);
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSubInterfacesOfCollectionSerialization_add1151() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_add1151");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.1F);
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSubInterfacesOfCollectionSerialization_add1152() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_add1152");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.1F);
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSubInterfacesOfCollectionSerialization_add1153() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_add1153");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.1F);
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSubInterfacesOfCollectionSerialization_add1154() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_add1154");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.1F);
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSubInterfacesOfCollectionSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.1F);
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSubInterfacesOfCollectionSerialization_literalMutation1285() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_literalMutation1285");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(2);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.1F);
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSubInterfacesOfCollectionSerialization_literalMutation1286() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_literalMutation1286");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(1);
        list.add(1);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.1F);
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSubInterfacesOfCollectionSerialization_literalMutation1287() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_literalMutation1287");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(2);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.1F);
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSubInterfacesOfCollectionSerialization_literalMutation1288() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_literalMutation1288");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(1L);
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.1F);
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSubInterfacesOfCollectionSerialization_literalMutation1289() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_literalMutation1289");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(0L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.1F);
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSubInterfacesOfCollectionSerialization_literalMutation1290() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_literalMutation1290");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(1L);
        queue.add(3L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.1F);
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSubInterfacesOfCollectionSerialization_literalMutation1291() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_literalMutation1291");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(1L);
        queue.add(2L);
        queue.add(4L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.1F);
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSubInterfacesOfCollectionSerialization_literalMutation1292() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_literalMutation1292");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(1.1F);
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSubInterfacesOfCollectionSerialization_literalMutation1293() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_literalMutation1293");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.1F);
        set.add(-0.8F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSubInterfacesOfCollectionSerialization_literalMutation1294() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_literalMutation1294");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.1F);
        set.add(0.2F);
        set.add(-0.7F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSubInterfacesOfCollectionSerialization_literalMutation1295() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_literalMutation1295");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.1F);
        set.add(0.2F);
        set.add(0.3F);
        set.add(-0.6F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSubInterfacesOfCollectionSerialization_remove956() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_remove956");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.1F);
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSubInterfacesOfCollectionSerialization_remove957() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_remove957");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.1F);
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSubInterfacesOfCollectionSerialization_remove958() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_remove958");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.1F);
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSubInterfacesOfCollectionSerialization_remove959() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_remove959");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.1F);
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSubInterfacesOfCollectionSerialization_remove960() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_remove960");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.1F);
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSubInterfacesOfCollectionSerialization_remove961() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_remove961");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.1F);
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSubInterfacesOfCollectionSerialization_remove962() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_remove962");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.1F);
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSubInterfacesOfCollectionSerialization_remove963() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_remove963");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.1F);
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSubInterfacesOfCollectionSerialization_remove964() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_remove964");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSubInterfacesOfCollectionSerialization_remove965() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_remove965");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSubInterfacesOfCollectionSerialization_remove966() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_remove966");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSubInterfacesOfCollectionSerialization_remove967() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_remove967");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSubInterfacesOfCollectionSerialization_remove968() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_remove968");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSubInterfacesOfCollectionSerialization_remove969() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_remove969");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSubInterfacesOfCollectionSerialization_remove970() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_remove970");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSubInterfacesOfCollectionSerialization_remove971() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionSerialization_remove971");
        List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        Queue<java.lang.Long> queue = new LinkedList<java.lang.Long>();
        queue.add(0L);
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        Set<java.lang.Float> set = new TreeSet<java.lang.Float>();
        set.add(0.2F);
        set.add(0.3F);
        set.add(0.4F);
        SortedSet<java.lang.Character> sortedSet = new TreeSet<java.lang.Character>();
        sortedSet.add('a');
        sortedSet.add('b');
        sortedSet.add('c');
        sortedSet.add('d');
        ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list , queue , set , sortedSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,target,1629,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSubInterfacesOfCollectionDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionDeserialization");
        String json = "foo" + ("\"sortedSet\":[\"a\",\"b\",\"c\",\"d\"]" + "}");
        ClassWithSubInterfacesOfCollection target = gson.fromJson(json, ClassWithSubInterfacesOfCollection.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1622,target,1621,target.listContains(0, 1, 2, 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,target,1623,target.queueContains(0, 1, 2, 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1626,target,1625,target.setContains(0.1F, 0.2F, 0.3F, 0.4F));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1628,target,1627,target.sortedSetContains('a', 'b', 'c', 'd'));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSubInterfacesOfCollectionDeserialization_literalMutation1282() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionDeserialization_literalMutation1282");
        String json = "{\"list\":[0,1,2,3],\"queue\":[0,1,2,3],\"set\":[0.1,0.2,0.3,0.4]," + ("foo" + "}");
        ClassWithSubInterfacesOfCollection target = gson.fromJson(json, ClassWithSubInterfacesOfCollection.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1622,target,1621,target.listContains(0, 1, 2, 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,target,1623,target.queueContains(0, 1, 2, 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1626,target,1625,target.setContains(0.1F, 0.2F, 0.3F, 0.4F));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1628,target,1627,target.sortedSetContains('a', 'b', 'c', 'd'));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSubInterfacesOfCollectionDeserialization_literalMutation1283() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubInterfacesOfCollectionDeserialization_literalMutation1283");
        String json = "{\"list\":[0,1,2,3],\"queue\":[0,1,2,3],\"set\":[0.1,0.2,0.3,0.4]," + ("\"sortedSet\":[\"a\",\"b\",\"c\",\"d\"]" + "foo");
        ClassWithSubInterfacesOfCollection target = gson.fromJson(json, ClassWithSubInterfacesOfCollection.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1622,target,1621,target.listContains(0, 1, 2, 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,target,1623,target.queueContains(0, 1, 2, 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1626,target,1625,target.setContains(0.1F, 0.2F, 0.3F, 0.4F));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1628,target,1627,target.sortedSetContains('a', 'b', 'c', 'd'));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static class ClassWithSubInterfacesOfCollection {
        private List<java.lang.Integer> list;

        private Queue<java.lang.Long> queue;

        private Set<java.lang.Float> set;

        private SortedSet<java.lang.Character> sortedSet;

        public ClassWithSubInterfacesOfCollection(List<java.lang.Integer> list ,Queue<java.lang.Long> queue ,Set<java.lang.Float> set ,SortedSet<java.lang.Character> sortedSet) {
            this.list = list;
            this.queue = queue;
            this.set = set;
            this.sortedSet = sortedSet;
        }

        boolean listContains(int... values) {
            for (int value : values) {
                if (!(list.contains(value))) {
                    return false;
                } 
            }
            return true;
        }

        boolean queueContains(long... values) {
            for (long value : values) {
                if (!(queue.contains(value))) {
                    return false;
                } 
            }
            return true;
        }

        boolean setContains(float... values) {
            for (float value : values) {
                if (!(set.contains(value))) {
                    return false;
                } 
            }
            return true;
        }

        boolean sortedSetContains(char... values) {
            for (char value : values) {
                if (!(sortedSet.contains(value))) {
                    return false;
                } 
            }
            return true;
        }

        public String getExpectedJson() {
            StringBuilder sb = new StringBuilder();
            sb.append("{");
            sb.append("\"list\":");
            append(sb, list).append(",");
            sb.append("\"queue\":");
            append(sb, queue).append(",");
            sb.append("\"set\":");
            append(sb, set).append(",");
            sb.append("\"sortedSet\":");
            append(sb, sortedSet);
            sb.append("}");
            return sb.toString();
        }

        private StringBuilder append(StringBuilder sb, Collection<?> c) {
            sb.append("[");
            boolean first = true;
            for (Object o : c) {
                if (!first) {
                    sb.append(",");
                } else {
                    first = false;
                }
                if ((o instanceof String) || (o instanceof Character)) {
                    sb.append('\"');
                } 
                sb.append(o.toString());
                if ((o instanceof String) || (o instanceof Character)) {
                    sb.append('\"');
                } 
            }
            sb.append("]");
            return sb;
        }
    }
}


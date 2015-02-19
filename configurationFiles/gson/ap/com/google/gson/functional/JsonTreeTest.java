package com.google.gson.functional;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.Map;
import java.util.Set;
import org.junit.Test;
import junit.framework.TestCase;
import com.google.gson.common.TestTypes;

/** 
 * Functional tests for {@link Gson#toJsonTree(Object)} and
 * {@link Gson#toJsonTree(Object, java.lang.reflect.Type)}
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class JsonTreeTest extends TestCase {
    private Gson gson;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        gson = new Gson();
    }

    @Test(timeout = 1000)
    public void testToJsonTree_add1192() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToJsonTree_add1192");
        TestTypes.BagOfPrimitives bag = new TestTypes.BagOfPrimitives(10L , 5 , false , "foo");
        JsonElement json = gson.toJsonTree(bag);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1719,json,1718,json.isJsonObject());
        JsonObject obj = json.getAsJsonObject();
        Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> children = obj.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1721,children,1720,children.size());
        assertContains(obj, new JsonPrimitive(10L));
        assertContains(obj, new JsonPrimitive(10L));
        assertContains(obj, new JsonPrimitive(5));
        assertContains(obj, new JsonPrimitive(false));
        assertContains(obj, new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testToJsonTree_add1193() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToJsonTree_add1193");
        TestTypes.BagOfPrimitives bag = new TestTypes.BagOfPrimitives(10L , 5 , false , "foo");
        JsonElement json = gson.toJsonTree(bag);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1719,json,1718,json.isJsonObject());
        JsonObject obj = json.getAsJsonObject();
        Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> children = obj.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1721,children,1720,children.size());
        assertContains(obj, new JsonPrimitive(10L));
        assertContains(obj, new JsonPrimitive(5));
        assertContains(obj, new JsonPrimitive(5));
        assertContains(obj, new JsonPrimitive(false));
        assertContains(obj, new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testToJsonTree_add1194() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToJsonTree_add1194");
        TestTypes.BagOfPrimitives bag = new TestTypes.BagOfPrimitives(10L , 5 , false , "foo");
        JsonElement json = gson.toJsonTree(bag);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1719,json,1718,json.isJsonObject());
        JsonObject obj = json.getAsJsonObject();
        Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> children = obj.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1721,children,1720,children.size());
        assertContains(obj, new JsonPrimitive(10L));
        assertContains(obj, new JsonPrimitive(5));
        assertContains(obj, new JsonPrimitive(false));
        assertContains(obj, new JsonPrimitive(false));
        assertContains(obj, new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testToJsonTree_add1195() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToJsonTree_add1195");
        TestTypes.BagOfPrimitives bag = new TestTypes.BagOfPrimitives(10L , 5 , false , "foo");
        JsonElement json = gson.toJsonTree(bag);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1719,json,1718,json.isJsonObject());
        JsonObject obj = json.getAsJsonObject();
        Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> children = obj.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1721,children,1720,children.size());
        assertContains(obj, new JsonPrimitive(10L));
        assertContains(obj, new JsonPrimitive(5));
        assertContains(obj, new JsonPrimitive(false));
        assertContains(obj, new JsonPrimitive("foo"));
        assertContains(obj, new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToJsonTree() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToJsonTree");
        TestTypes.BagOfPrimitives bag = new TestTypes.BagOfPrimitives(11L , 5 , false , "foo");
        JsonElement json = gson.toJsonTree(bag);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1719,json,1718,json.isJsonObject());
        JsonObject obj = json.getAsJsonObject();
        Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> children = obj.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1721,children,1720,children.size());
        assertContains(obj, new JsonPrimitive(10L));
        assertContains(obj, new JsonPrimitive(5));
        assertContains(obj, new JsonPrimitive(false));
        assertContains(obj, new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToJsonTree_literalMutation1384() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToJsonTree_literalMutation1384");
        TestTypes.BagOfPrimitives bag = new TestTypes.BagOfPrimitives(10L , 6 , false , "foo");
        JsonElement json = gson.toJsonTree(bag);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1719,json,1718,json.isJsonObject());
        JsonObject obj = json.getAsJsonObject();
        Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> children = obj.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1721,children,1720,children.size());
        assertContains(obj, new JsonPrimitive(10L));
        assertContains(obj, new JsonPrimitive(5));
        assertContains(obj, new JsonPrimitive(false));
        assertContains(obj, new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToJsonTree_literalMutation1385() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToJsonTree_literalMutation1385");
        TestTypes.BagOfPrimitives bag = new TestTypes.BagOfPrimitives(10L , 5 , true , "foo");
        JsonElement json = gson.toJsonTree(bag);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1719,json,1718,json.isJsonObject());
        JsonObject obj = json.getAsJsonObject();
        Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> children = obj.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1721,children,1720,children.size());
        assertContains(obj, new JsonPrimitive(10L));
        assertContains(obj, new JsonPrimitive(5));
        assertContains(obj, new JsonPrimitive(false));
        assertContains(obj, new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToJsonTree_literalMutation1386() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToJsonTree_literalMutation1386");
        TestTypes.BagOfPrimitives bag = new TestTypes.BagOfPrimitives(10L , 5 , false , "foo");
        JsonElement json = gson.toJsonTree(bag);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1719,json,1718,json.isJsonObject());
        JsonObject obj = json.getAsJsonObject();
        Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> children = obj.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1721,children,1720,children.size());
        assertContains(obj, new JsonPrimitive(10L));
        assertContains(obj, new JsonPrimitive(5));
        assertContains(obj, new JsonPrimitive(false));
        assertContains(obj, new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToJsonTree_literalMutation1387() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToJsonTree_literalMutation1387");
        TestTypes.BagOfPrimitives bag = new TestTypes.BagOfPrimitives(10L , 5 , false , "foo");
        JsonElement json = gson.toJsonTree(bag);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1719,json,1718,json.isJsonObject());
        JsonObject obj = json.getAsJsonObject();
        Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> children = obj.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1721,children,1720,children.size());
        assertContains(obj, new JsonPrimitive(9L));
        assertContains(obj, new JsonPrimitive(5));
        assertContains(obj, new JsonPrimitive(false));
        assertContains(obj, new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToJsonTree_literalMutation1388() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToJsonTree_literalMutation1388");
        TestTypes.BagOfPrimitives bag = new TestTypes.BagOfPrimitives(10L , 5 , false , "foo");
        JsonElement json = gson.toJsonTree(bag);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1719,json,1718,json.isJsonObject());
        JsonObject obj = json.getAsJsonObject();
        Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> children = obj.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1721,children,1720,children.size());
        assertContains(obj, new JsonPrimitive(10L));
        assertContains(obj, new JsonPrimitive(4));
        assertContains(obj, new JsonPrimitive(false));
        assertContains(obj, new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToJsonTree_literalMutation1389() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToJsonTree_literalMutation1389");
        TestTypes.BagOfPrimitives bag = new TestTypes.BagOfPrimitives(10L , 5 , false , "foo");
        JsonElement json = gson.toJsonTree(bag);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1719,json,1718,json.isJsonObject());
        JsonObject obj = json.getAsJsonObject();
        Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> children = obj.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1721,children,1720,children.size());
        assertContains(obj, new JsonPrimitive(10L));
        assertContains(obj, new JsonPrimitive(5));
        assertContains(obj, new JsonPrimitive(true));
        assertContains(obj, new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToJsonTree_literalMutation1390() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToJsonTree_literalMutation1390");
        TestTypes.BagOfPrimitives bag = new TestTypes.BagOfPrimitives(10L , 5 , false , "foo");
        JsonElement json = gson.toJsonTree(bag);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1719,json,1718,json.isJsonObject());
        JsonObject obj = json.getAsJsonObject();
        Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> children = obj.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1721,children,1720,children.size());
        assertContains(obj, new JsonPrimitive(10L));
        assertContains(obj, new JsonPrimitive(5));
        assertContains(obj, new JsonPrimitive(false));
        assertContains(obj, new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testToJsonTree_remove1004() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToJsonTree_remove1004");
        TestTypes.BagOfPrimitives bag = new TestTypes.BagOfPrimitives(10L , 5 , false , "foo");
        JsonElement json = gson.toJsonTree(bag);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1719,json,1718,json.isJsonObject());
        JsonObject obj = json.getAsJsonObject();
        Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> children = obj.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1721,children,1720,children.size());
        assertContains(obj, new JsonPrimitive(5));
        assertContains(obj, new JsonPrimitive(false));
        assertContains(obj, new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testToJsonTree_remove1005() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToJsonTree_remove1005");
        TestTypes.BagOfPrimitives bag = new TestTypes.BagOfPrimitives(10L , 5 , false , "foo");
        JsonElement json = gson.toJsonTree(bag);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1719,json,1718,json.isJsonObject());
        JsonObject obj = json.getAsJsonObject();
        Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> children = obj.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1721,children,1720,children.size());
        assertContains(obj, new JsonPrimitive(5));
        assertContains(obj, new JsonPrimitive(false));
        assertContains(obj, new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testToJsonTree_remove1006() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToJsonTree_remove1006");
        TestTypes.BagOfPrimitives bag = new TestTypes.BagOfPrimitives(10L , 5 , false , "foo");
        JsonElement json = gson.toJsonTree(bag);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1719,json,1718,json.isJsonObject());
        JsonObject obj = json.getAsJsonObject();
        Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> children = obj.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1721,children,1720,children.size());
        assertContains(obj, new JsonPrimitive(5));
        assertContains(obj, new JsonPrimitive(false));
        assertContains(obj, new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testToJsonTree_remove1007() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToJsonTree_remove1007");
        TestTypes.BagOfPrimitives bag = new TestTypes.BagOfPrimitives(10L , 5 , false , "foo");
        JsonElement json = gson.toJsonTree(bag);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1719,json,1718,json.isJsonObject());
        JsonObject obj = json.getAsJsonObject();
        Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> children = obj.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1721,children,1720,children.size());
        assertContains(obj, new JsonPrimitive(5));
        assertContains(obj, new JsonPrimitive(false));
        assertContains(obj, new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testToJsonTreeObjectType_add1196() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToJsonTreeObjectType_add1196");
        SubTypeOfBagOfPrimitives bag = new SubTypeOfBagOfPrimitives(10L , 5 , false , "foo" , 1.4F);
        JsonElement json = gson.toJsonTree(bag, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1715,json,1714,json.isJsonObject());
        JsonObject obj = json.getAsJsonObject();
        Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> children = obj.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1717,children,1716,children.size());
        assertContains(obj, new JsonPrimitive(10L));
        assertContains(obj, new JsonPrimitive(10L));
        assertContains(obj, new JsonPrimitive(5));
        assertContains(obj, new JsonPrimitive(false));
        assertContains(obj, new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testToJsonTreeObjectType_add1197() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToJsonTreeObjectType_add1197");
        SubTypeOfBagOfPrimitives bag = new SubTypeOfBagOfPrimitives(10L , 5 , false , "foo" , 1.4F);
        JsonElement json = gson.toJsonTree(bag, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1715,json,1714,json.isJsonObject());
        JsonObject obj = json.getAsJsonObject();
        Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> children = obj.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1717,children,1716,children.size());
        assertContains(obj, new JsonPrimitive(10L));
        assertContains(obj, new JsonPrimitive(5));
        assertContains(obj, new JsonPrimitive(5));
        assertContains(obj, new JsonPrimitive(false));
        assertContains(obj, new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testToJsonTreeObjectType_add1198() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToJsonTreeObjectType_add1198");
        SubTypeOfBagOfPrimitives bag = new SubTypeOfBagOfPrimitives(10L , 5 , false , "foo" , 1.4F);
        JsonElement json = gson.toJsonTree(bag, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1715,json,1714,json.isJsonObject());
        JsonObject obj = json.getAsJsonObject();
        Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> children = obj.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1717,children,1716,children.size());
        assertContains(obj, new JsonPrimitive(10L));
        assertContains(obj, new JsonPrimitive(5));
        assertContains(obj, new JsonPrimitive(false));
        assertContains(obj, new JsonPrimitive(false));
        assertContains(obj, new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testToJsonTreeObjectType_add1199() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToJsonTreeObjectType_add1199");
        SubTypeOfBagOfPrimitives bag = new SubTypeOfBagOfPrimitives(10L , 5 , false , "foo" , 1.4F);
        JsonElement json = gson.toJsonTree(bag, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1715,json,1714,json.isJsonObject());
        JsonObject obj = json.getAsJsonObject();
        Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> children = obj.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1717,children,1716,children.size());
        assertContains(obj, new JsonPrimitive(10L));
        assertContains(obj, new JsonPrimitive(5));
        assertContains(obj, new JsonPrimitive(false));
        assertContains(obj, new JsonPrimitive("foo"));
        assertContains(obj, new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToJsonTreeObjectType() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToJsonTreeObjectType");
        SubTypeOfBagOfPrimitives bag = new SubTypeOfBagOfPrimitives(9L , 5 , false , "foo" , 1.4F);
        JsonElement json = gson.toJsonTree(bag, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1715,json,1714,json.isJsonObject());
        JsonObject obj = json.getAsJsonObject();
        Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> children = obj.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1717,children,1716,children.size());
        assertContains(obj, new JsonPrimitive(10L));
        assertContains(obj, new JsonPrimitive(5));
        assertContains(obj, new JsonPrimitive(false));
        assertContains(obj, new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToJsonTreeObjectType_literalMutation1392() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToJsonTreeObjectType_literalMutation1392");
        SubTypeOfBagOfPrimitives bag = new SubTypeOfBagOfPrimitives(10L , 4 , false , "foo" , 1.4F);
        JsonElement json = gson.toJsonTree(bag, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1715,json,1714,json.isJsonObject());
        JsonObject obj = json.getAsJsonObject();
        Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> children = obj.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1717,children,1716,children.size());
        assertContains(obj, new JsonPrimitive(10L));
        assertContains(obj, new JsonPrimitive(5));
        assertContains(obj, new JsonPrimitive(false));
        assertContains(obj, new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToJsonTreeObjectType_literalMutation1393() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToJsonTreeObjectType_literalMutation1393");
        SubTypeOfBagOfPrimitives bag = new SubTypeOfBagOfPrimitives(10L , 5 , false , "foo" , 1.4F);
        JsonElement json = gson.toJsonTree(bag, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1715,json,1714,json.isJsonObject());
        JsonObject obj = json.getAsJsonObject();
        Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> children = obj.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1717,children,1716,children.size());
        assertContains(obj, new JsonPrimitive(10L));
        assertContains(obj, new JsonPrimitive(5));
        assertContains(obj, new JsonPrimitive(false));
        assertContains(obj, new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToJsonTreeObjectType_literalMutation1394() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToJsonTreeObjectType_literalMutation1394");
        SubTypeOfBagOfPrimitives bag = new SubTypeOfBagOfPrimitives(10L , 5 , false , "foo" , 1.4F);
        JsonElement json = gson.toJsonTree(bag, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1715,json,1714,json.isJsonObject());
        JsonObject obj = json.getAsJsonObject();
        Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> children = obj.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1717,children,1716,children.size());
        assertContains(obj, new JsonPrimitive(10L));
        assertContains(obj, new JsonPrimitive(5));
        assertContains(obj, new JsonPrimitive(false));
        assertContains(obj, new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToJsonTreeObjectType_literalMutation1395() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToJsonTreeObjectType_literalMutation1395");
        SubTypeOfBagOfPrimitives bag = new SubTypeOfBagOfPrimitives(10L , 5 , false , "foo" , 2.4F);
        JsonElement json = gson.toJsonTree(bag, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1715,json,1714,json.isJsonObject());
        JsonObject obj = json.getAsJsonObject();
        Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> children = obj.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1717,children,1716,children.size());
        assertContains(obj, new JsonPrimitive(10L));
        assertContains(obj, new JsonPrimitive(5));
        assertContains(obj, new JsonPrimitive(false));
        assertContains(obj, new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToJsonTreeObjectType_literalMutation1396() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToJsonTreeObjectType_literalMutation1396");
        SubTypeOfBagOfPrimitives bag = new SubTypeOfBagOfPrimitives(10L , 5 , false , "foo" , 1.4F);
        JsonElement json = gson.toJsonTree(bag, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1715,json,1714,json.isJsonObject());
        JsonObject obj = json.getAsJsonObject();
        Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> children = obj.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1717,children,1716,children.size());
        assertContains(obj, new JsonPrimitive(9L));
        assertContains(obj, new JsonPrimitive(5));
        assertContains(obj, new JsonPrimitive(false));
        assertContains(obj, new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToJsonTreeObjectType_literalMutation1397() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToJsonTreeObjectType_literalMutation1397");
        SubTypeOfBagOfPrimitives bag = new SubTypeOfBagOfPrimitives(10L , 5 , false , "foo" , 1.4F);
        JsonElement json = gson.toJsonTree(bag, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1715,json,1714,json.isJsonObject());
        JsonObject obj = json.getAsJsonObject();
        Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> children = obj.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1717,children,1716,children.size());
        assertContains(obj, new JsonPrimitive(10L));
        assertContains(obj, new JsonPrimitive(4));
        assertContains(obj, new JsonPrimitive(false));
        assertContains(obj, new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToJsonTreeObjectType_literalMutation1398() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToJsonTreeObjectType_literalMutation1398");
        SubTypeOfBagOfPrimitives bag = new SubTypeOfBagOfPrimitives(10L , 5 , false , "foo" , 1.4F);
        JsonElement json = gson.toJsonTree(bag, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1715,json,1714,json.isJsonObject());
        JsonObject obj = json.getAsJsonObject();
        Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> children = obj.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1717,children,1716,children.size());
        assertContains(obj, new JsonPrimitive(10L));
        assertContains(obj, new JsonPrimitive(5));
        assertContains(obj, new JsonPrimitive(true));
        assertContains(obj, new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToJsonTreeObjectType_literalMutation1399() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToJsonTreeObjectType_literalMutation1399");
        SubTypeOfBagOfPrimitives bag = new SubTypeOfBagOfPrimitives(10L , 5 , false , "foo" , 1.4F);
        JsonElement json = gson.toJsonTree(bag, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1715,json,1714,json.isJsonObject());
        JsonObject obj = json.getAsJsonObject();
        Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> children = obj.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1717,children,1716,children.size());
        assertContains(obj, new JsonPrimitive(10L));
        assertContains(obj, new JsonPrimitive(5));
        assertContains(obj, new JsonPrimitive(false));
        assertContains(obj, new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testToJsonTreeObjectType_remove1008() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToJsonTreeObjectType_remove1008");
        SubTypeOfBagOfPrimitives bag = new SubTypeOfBagOfPrimitives(10L , 5 , false , "foo" , 1.4F);
        JsonElement json = gson.toJsonTree(bag, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1715,json,1714,json.isJsonObject());
        JsonObject obj = json.getAsJsonObject();
        Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> children = obj.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1717,children,1716,children.size());
        assertContains(obj, new JsonPrimitive(5));
        assertContains(obj, new JsonPrimitive(false));
        assertContains(obj, new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testToJsonTreeObjectType_remove1009() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToJsonTreeObjectType_remove1009");
        SubTypeOfBagOfPrimitives bag = new SubTypeOfBagOfPrimitives(10L , 5 , false , "foo" , 1.4F);
        JsonElement json = gson.toJsonTree(bag, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1715,json,1714,json.isJsonObject());
        JsonObject obj = json.getAsJsonObject();
        Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> children = obj.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1717,children,1716,children.size());
        assertContains(obj, new JsonPrimitive(5));
        assertContains(obj, new JsonPrimitive(false));
        assertContains(obj, new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testToJsonTreeObjectType_remove1010() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToJsonTreeObjectType_remove1010");
        SubTypeOfBagOfPrimitives bag = new SubTypeOfBagOfPrimitives(10L , 5 , false , "foo" , 1.4F);
        JsonElement json = gson.toJsonTree(bag, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1715,json,1714,json.isJsonObject());
        JsonObject obj = json.getAsJsonObject();
        Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> children = obj.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1717,children,1716,children.size());
        assertContains(obj, new JsonPrimitive(5));
        assertContains(obj, new JsonPrimitive(false));
        assertContains(obj, new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testToJsonTreeObjectType_remove1011() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToJsonTreeObjectType_remove1011");
        SubTypeOfBagOfPrimitives bag = new SubTypeOfBagOfPrimitives(10L , 5 , false , "foo" , 1.4F);
        JsonElement json = gson.toJsonTree(bag, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1715,json,1714,json.isJsonObject());
        JsonObject obj = json.getAsJsonObject();
        Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> children = obj.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1717,children,1716,children.size());
        assertContains(obj, new JsonPrimitive(5));
        assertContains(obj, new JsonPrimitive(false));
        assertContains(obj, new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonTreeToString() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonTreeToString");
        SubTypeOfBagOfPrimitives bag = new SubTypeOfBagOfPrimitives(11L , 5 , false , "foo" , 1.4F);
        String json1 = gson.toJson(bag);
        JsonElement jsonElement = gson.toJsonTree(bag, SubTypeOfBagOfPrimitives.class);
        String json2 = gson.toJson(jsonElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1712,json1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1713,json2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonTreeToString_literalMutation1379() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonTreeToString_literalMutation1379");
        SubTypeOfBagOfPrimitives bag = new SubTypeOfBagOfPrimitives(10L , 4 , false , "foo" , 1.4F);
        String json1 = gson.toJson(bag);
        JsonElement jsonElement = gson.toJsonTree(bag, SubTypeOfBagOfPrimitives.class);
        String json2 = gson.toJson(jsonElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1712,json1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1713,json2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonTreeToString_literalMutation1380() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonTreeToString_literalMutation1380");
        SubTypeOfBagOfPrimitives bag = new SubTypeOfBagOfPrimitives(10L , 5 , false , "foo" , 1.4F);
        String json1 = gson.toJson(bag);
        JsonElement jsonElement = gson.toJsonTree(bag, SubTypeOfBagOfPrimitives.class);
        String json2 = gson.toJson(jsonElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1712,json1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1713,json2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonTreeToString_literalMutation1381() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonTreeToString_literalMutation1381");
        SubTypeOfBagOfPrimitives bag = new SubTypeOfBagOfPrimitives(10L , 5 , false , "foo" , 1.4F);
        String json1 = gson.toJson(bag);
        JsonElement jsonElement = gson.toJsonTree(bag, SubTypeOfBagOfPrimitives.class);
        String json2 = gson.toJson(jsonElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1712,json1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1713,json2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonTreeToString_literalMutation1382() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonTreeToString_literalMutation1382");
        SubTypeOfBagOfPrimitives bag = new SubTypeOfBagOfPrimitives(10L , 5 , false , "foo" , 2.4F);
        String json1 = gson.toJson(bag);
        JsonElement jsonElement = gson.toJsonTree(bag, SubTypeOfBagOfPrimitives.class);
        String json2 = gson.toJson(jsonElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1712,json1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1713,json2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonTreeNull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonTreeNull");
        TestTypes.BagOfPrimitives bag = new TestTypes.BagOfPrimitives(11L , 5 , false , null);
        JsonObject jsonElement = ((JsonObject)(gson.toJsonTree(bag, TestTypes.BagOfPrimitives.class)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1711,jsonElement,1710,jsonElement.has("stringValue"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonTreeNull_literalMutation1375() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonTreeNull_literalMutation1375");
        TestTypes.BagOfPrimitives bag = new TestTypes.BagOfPrimitives(10L , 4 , false , null);
        JsonObject jsonElement = ((JsonObject)(gson.toJsonTree(bag, TestTypes.BagOfPrimitives.class)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1711,jsonElement,1710,jsonElement.has("stringValue"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonTreeNull_literalMutation1376() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonTreeNull_literalMutation1376");
        TestTypes.BagOfPrimitives bag = new TestTypes.BagOfPrimitives(10L , 5 , true , null);
        JsonObject jsonElement = ((JsonObject)(gson.toJsonTree(bag, TestTypes.BagOfPrimitives.class)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1711,jsonElement,1710,jsonElement.has("stringValue"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void assertContains(JsonObject json, JsonPrimitive child) {
        for (Map.Entry<java.lang.String, com.google.gson.JsonElement> entry : json.entrySet()) {
            JsonElement node = entry.getValue();
            if (node.isJsonPrimitive()) {
                if (node.getAsJsonPrimitive().equals(child)) {
                    return ;
                } 
            } 
        }
    }

    private static class SubTypeOfBagOfPrimitives extends TestTypes.BagOfPrimitives {
        @SuppressWarnings(value = "unused")
        float f = 1.2F;

        public SubTypeOfBagOfPrimitives(long l ,int i ,boolean b ,String string ,float f) {
            super(l, i, b, string);
            this.f = f;
        }
    }
}


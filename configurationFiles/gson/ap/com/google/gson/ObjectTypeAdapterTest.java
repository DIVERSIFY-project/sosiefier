package com.google.gson;

import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.Test;
import junit.framework.TestCase;

public final class ObjectTypeAdapterTest extends TestCase {
    private final Gson gson = new GsonBuilder().create();

    private final TypeAdapter<java.lang.Object> adapter = gson.getAdapter(Object.class);

    public void testDeserialize() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserialize");
        Map<?, ?> map = ((Map<?, ?>)(adapter.fromJson("{\"a\":5,\"b\":[1,2,null],\"c\":{\"x\":\"y\"}}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3170,map,3169,map.get("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3172,null,3171,java.util.Arrays.asList(1.0, 2.0, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3174,map,3173,map.get("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3176,null,3175,java.util.Collections.singletonMap("x", "y"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3178,map,3177,map.get("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3180,map,3179,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserialize_literalMutation2395() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserialize_literalMutation2395");
        Map<?, ?> map = ((Map<?, ?>)(adapter.fromJson("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3170,map,3169,map.get("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3172,null,3171,java.util.Arrays.asList(1.0, 2.0, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3174,map,3173,map.get("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3176,null,3175,java.util.Collections.singletonMap("x", "y"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3178,map,3177,map.get("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3180,map,3179,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerialize() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerialize");
        Object object = new RuntimeType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3185,adapter.toJson(object),3184,adapter.toJson(object).replace("\"", "\'"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeNullValue_add1655() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeNullValue_add1655");
        Map<java.lang.String, java.lang.Object> map = new LinkedHashMap<java.lang.String, java.lang.Object>();
        map.put("a", null);
        map.put("a", null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3187,adapter.toJson(map),3186,adapter.toJson(map).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeNullValue() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeNullValue");
        Map<java.lang.String, java.lang.Object> map = new LinkedHashMap<java.lang.String, java.lang.Object>();
        map.put("foo", null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3187,adapter.toJson(map),3186,adapter.toJson(map).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeNullValue_remove1355() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeNullValue_remove1355");
        Map<java.lang.String, java.lang.Object> map = new LinkedHashMap<java.lang.String, java.lang.Object>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3187,adapter.toJson(map),3186,adapter.toJson(map).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializeNullValue_add1654() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeNullValue_add1654");
        Map<java.lang.String, java.lang.Object> map = new LinkedHashMap<java.lang.String, java.lang.Object>();
        map.put("a", null);
        map.put("a", null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3181,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3183,adapter,3182,adapter.fromJson("{\"a\":null}"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializeNullValue() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeNullValue");
        Map<java.lang.String, java.lang.Object> map = new LinkedHashMap<java.lang.String, java.lang.Object>();
        map.put("foo", null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3181,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3183,adapter,3182,adapter.fromJson("{\"a\":null}"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializeNullValue_remove1354() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeNullValue_remove1354");
        Map<java.lang.String, java.lang.Object> map = new LinkedHashMap<java.lang.String, java.lang.Object>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3181,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3183,adapter,3182,adapter.fromJson("{\"a\":null}"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeObject() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeObject");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3189,adapter,3188,adapter.toJson(new java.lang.Object()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unused")
    private class RuntimeType {
        Object a = 5;

        Object b = java.util.Arrays.asList(1, 2, null);
    }
}


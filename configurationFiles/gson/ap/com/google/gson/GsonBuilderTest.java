package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.junit.Test;
import junit.framework.TestCase;
import java.lang.reflect.Type;

/** 
 * Unit tests for {@link GsonBuilder}.
 * 
 * @author Inderjeet Singh
 */
public class GsonBuilderTest extends TestCase {
    private static final TypeAdapter<java.lang.Object> NULL_TYPE_ADAPTER = new TypeAdapter<java.lang.Object>() {
        @Override
        public void write(JsonWriter out, Object value) {
            throw new AssertionError();
        }

        @Override
        public Object read(JsonReader in) {
            throw new AssertionError();
        }
    };

    @Test(timeout = 1000)
    public void testCreatingMoreThanOnce() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCreatingMoreThanOnce");
        GsonBuilder builder = new GsonBuilder();
        builder.create();
        builder.create();
        builder.create();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCreatingMoreThanOnce_add1533() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCreatingMoreThanOnce_add1533");
        GsonBuilder builder = new GsonBuilder();
        builder.create();
        builder.create();
        builder.create();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCreatingMoreThanOnce_remove1253() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCreatingMoreThanOnce_remove1253");
        GsonBuilder builder = new GsonBuilder();
        builder.create();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCreatingMoreThanOnce_remove1254() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCreatingMoreThanOnce_remove1254");
        GsonBuilder builder = new GsonBuilder();
        builder.create();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExcludeFieldsWithModifiers() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExcludeFieldsWithModifiers");
        Gson gson = new GsonBuilder().excludeFieldsWithModifiers(java.lang.reflect.Modifier.VOLATILE, java.lang.reflect.Modifier.PRIVATE).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2746,gson,2745,gson.toJson(new com.google.gson.GsonBuilderTest.HasModifiers()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRegisterTypeAdapterForCoreType() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegisterTypeAdapterForCoreType");
        Type[] types = new Type[]{ byte.class , int.class , double.class , Short.class , Long.class , String.class };
        for (Type type : types) {
            new GsonBuilder().registerTypeAdapter(type, NULL_TYPE_ADAPTER);
            new GsonBuilder().registerTypeAdapter(type, NULL_TYPE_ADAPTER);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRegisterTypeAdapterForCoreType_remove1255() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegisterTypeAdapterForCoreType_remove1255");
        Type[] types = new Type[]{ byte.class , int.class , double.class , Short.class , Long.class , String.class };
        for (Type type : types) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unused")
    static class HasModifiers {
        private String a = "a";

        volatile String b = "b";

        private volatile String c = "c";

        String d = "d";
    }

    public void testTransientFieldExclusion() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransientFieldExclusion");
        Gson gson = new GsonBuilder().excludeFieldsWithModifiers().create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2748,gson,2747,gson.toJson(new com.google.gson.GsonBuilderTest.HasTransients()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    static class HasTransients {
        transient String a = "a";
    }
}


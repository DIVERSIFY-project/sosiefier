package com.google.gson.functional;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.stream.JsonWriter;
import junit.framework.TestCase;
import java.lang.reflect.Type;
import com.google.gson.TypeAdapter;

public final class TypeAdapterPrecedenceTest extends TestCase {
    public void testNonstreamingFollowedByNonstreaming() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNonstreamingFollowedByNonstreaming");
        Gson gson = new GsonBuilder().registerTypeAdapter(Foo.class, newSerializer("foo")).registerTypeAdapter(Foo.class, newSerializer("serializer 2")).registerTypeAdapter(Foo.class, newDeserializer("deserializer 1")).registerTypeAdapter(Foo.class, newDeserializer("deserializer 2")).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2537,gson,2536,gson.toJson(new com.google.gson.functional.TypeAdapterPrecedenceTest.Foo("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2538,gson.fromJson("foo", com.google.gson.functional.TypeAdapterPrecedenceTest.Foo.class).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNonstreamingFollowedByNonstreaming_literalMutation2032() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNonstreamingFollowedByNonstreaming_literalMutation2032");
        Gson gson = new GsonBuilder().registerTypeAdapter(Foo.class, newSerializer("serializer 1")).registerTypeAdapter(Foo.class, newSerializer("foo")).registerTypeAdapter(Foo.class, newDeserializer("deserializer 1")).registerTypeAdapter(Foo.class, newDeserializer("deserializer 2")).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2537,gson,2536,gson.toJson(new com.google.gson.functional.TypeAdapterPrecedenceTest.Foo("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2538,gson.fromJson("foo", com.google.gson.functional.TypeAdapterPrecedenceTest.Foo.class).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNonstreamingFollowedByNonstreaming_literalMutation2033() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNonstreamingFollowedByNonstreaming_literalMutation2033");
        Gson gson = new GsonBuilder().registerTypeAdapter(Foo.class, newSerializer("serializer 1")).registerTypeAdapter(Foo.class, newSerializer("serializer 2")).registerTypeAdapter(Foo.class, newDeserializer("foo")).registerTypeAdapter(Foo.class, newDeserializer("deserializer 2")).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2537,gson,2536,gson.toJson(new com.google.gson.functional.TypeAdapterPrecedenceTest.Foo("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2538,gson.fromJson("foo", com.google.gson.functional.TypeAdapterPrecedenceTest.Foo.class).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNonstreamingFollowedByNonstreaming_literalMutation2034() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNonstreamingFollowedByNonstreaming_literalMutation2034");
        Gson gson = new GsonBuilder().registerTypeAdapter(Foo.class, newSerializer("serializer 1")).registerTypeAdapter(Foo.class, newSerializer("serializer 2")).registerTypeAdapter(Foo.class, newDeserializer("deserializer 1")).registerTypeAdapter(Foo.class, newDeserializer("foo")).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2537,gson,2536,gson.toJson(new com.google.gson.functional.TypeAdapterPrecedenceTest.Foo("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2538,gson.fromJson("foo", com.google.gson.functional.TypeAdapterPrecedenceTest.Foo.class).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStreamingFollowedByStreaming() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStreamingFollowedByStreaming");
        Gson gson = new GsonBuilder().registerTypeAdapter(Foo.class, newTypeAdapter("foo")).registerTypeAdapter(Foo.class, newTypeAdapter("type adapter 2")).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2552,gson,2551,gson.toJson(new com.google.gson.functional.TypeAdapterPrecedenceTest.Foo("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2553,gson.fromJson("foo", com.google.gson.functional.TypeAdapterPrecedenceTest.Foo.class).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStreamingFollowedByStreaming_literalMutation2049() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStreamingFollowedByStreaming_literalMutation2049");
        Gson gson = new GsonBuilder().registerTypeAdapter(Foo.class, newTypeAdapter("type adapter 1")).registerTypeAdapter(Foo.class, newTypeAdapter("foo")).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2552,gson,2551,gson.toJson(new com.google.gson.functional.TypeAdapterPrecedenceTest.Foo("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2553,gson.fromJson("foo", com.google.gson.functional.TypeAdapterPrecedenceTest.Foo.class).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeNonstreamingTypeAdapterFollowedByStreamingTypeAdapter() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeNonstreamingTypeAdapterFollowedByStreamingTypeAdapter");
        Gson gson = new GsonBuilder().registerTypeAdapter(Foo.class, newSerializer("foo")).registerTypeAdapter(Foo.class, newDeserializer("deserializer")).registerTypeAdapter(Foo.class, newTypeAdapter("type adapter")).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2543,gson,2542,gson.toJson(new com.google.gson.functional.TypeAdapterPrecedenceTest.Foo("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2544,gson.fromJson("foo", com.google.gson.functional.TypeAdapterPrecedenceTest.Foo.class).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeNonstreamingTypeAdapterFollowedByStreamingTypeAdapter_literalMutation2040() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeNonstreamingTypeAdapterFollowedByStreamingTypeAdapter_literalMutation2040");
        Gson gson = new GsonBuilder().registerTypeAdapter(Foo.class, newSerializer("serializer")).registerTypeAdapter(Foo.class, newDeserializer("foo")).registerTypeAdapter(Foo.class, newTypeAdapter("type adapter")).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2543,gson,2542,gson.toJson(new com.google.gson.functional.TypeAdapterPrecedenceTest.Foo("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2544,gson.fromJson("foo", com.google.gson.functional.TypeAdapterPrecedenceTest.Foo.class).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeNonstreamingTypeAdapterFollowedByStreamingTypeAdapter_literalMutation2041() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeNonstreamingTypeAdapterFollowedByStreamingTypeAdapter_literalMutation2041");
        Gson gson = new GsonBuilder().registerTypeAdapter(Foo.class, newSerializer("serializer")).registerTypeAdapter(Foo.class, newDeserializer("deserializer")).registerTypeAdapter(Foo.class, newTypeAdapter("foo")).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2543,gson,2542,gson.toJson(new com.google.gson.functional.TypeAdapterPrecedenceTest.Foo("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2544,gson.fromJson("foo", com.google.gson.functional.TypeAdapterPrecedenceTest.Foo.class).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStreamingFollowedByNonstreaming() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStreamingFollowedByNonstreaming");
        Gson gson = new GsonBuilder().registerTypeAdapter(Foo.class, newTypeAdapter("foo")).registerTypeAdapter(Foo.class, newSerializer("serializer")).registerTypeAdapter(Foo.class, newDeserializer("deserializer")).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2549,gson,2548,gson.toJson(new com.google.gson.functional.TypeAdapterPrecedenceTest.Foo("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2550,gson.fromJson("foo", com.google.gson.functional.TypeAdapterPrecedenceTest.Foo.class).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStreamingFollowedByNonstreaming_literalMutation2043() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStreamingFollowedByNonstreaming_literalMutation2043");
        Gson gson = new GsonBuilder().registerTypeAdapter(Foo.class, newTypeAdapter("type adapter")).registerTypeAdapter(Foo.class, newSerializer("foo")).registerTypeAdapter(Foo.class, newDeserializer("deserializer")).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2549,gson,2548,gson.toJson(new com.google.gson.functional.TypeAdapterPrecedenceTest.Foo("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2550,gson.fromJson("foo", com.google.gson.functional.TypeAdapterPrecedenceTest.Foo.class).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStreamingFollowedByNonstreaming_literalMutation2044() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStreamingFollowedByNonstreaming_literalMutation2044");
        Gson gson = new GsonBuilder().registerTypeAdapter(Foo.class, newTypeAdapter("type adapter")).registerTypeAdapter(Foo.class, newSerializer("serializer")).registerTypeAdapter(Foo.class, newDeserializer("foo")).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2549,gson,2548,gson.toJson(new com.google.gson.functional.TypeAdapterPrecedenceTest.Foo("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2550,gson.fromJson("foo", com.google.gson.functional.TypeAdapterPrecedenceTest.Foo.class).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStreamingHierarchicalFollowedByNonstreaming() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStreamingHierarchicalFollowedByNonstreaming");
        Gson gson = new GsonBuilder().registerTypeHierarchyAdapter(Foo.class, newTypeAdapter("foo")).registerTypeAdapter(Foo.class, newSerializer("serializer")).registerTypeAdapter(Foo.class, newDeserializer("deserializer")).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2558,gson,2557,gson.toJson(new com.google.gson.functional.TypeAdapterPrecedenceTest.Foo("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2559,gson.fromJson("foo", com.google.gson.functional.TypeAdapterPrecedenceTest.Foo.class).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStreamingHierarchicalFollowedByNonstreaming_literalMutation2051() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStreamingHierarchicalFollowedByNonstreaming_literalMutation2051");
        Gson gson = new GsonBuilder().registerTypeHierarchyAdapter(Foo.class, newTypeAdapter("type adapter")).registerTypeAdapter(Foo.class, newSerializer("foo")).registerTypeAdapter(Foo.class, newDeserializer("deserializer")).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2558,gson,2557,gson.toJson(new com.google.gson.functional.TypeAdapterPrecedenceTest.Foo("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2559,gson.fromJson("foo", com.google.gson.functional.TypeAdapterPrecedenceTest.Foo.class).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStreamingHierarchicalFollowedByNonstreaming_literalMutation2052() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStreamingHierarchicalFollowedByNonstreaming_literalMutation2052");
        Gson gson = new GsonBuilder().registerTypeHierarchyAdapter(Foo.class, newTypeAdapter("type adapter")).registerTypeAdapter(Foo.class, newSerializer("serializer")).registerTypeAdapter(Foo.class, newDeserializer("foo")).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2558,gson,2557,gson.toJson(new com.google.gson.functional.TypeAdapterPrecedenceTest.Foo("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2559,gson.fromJson("foo", com.google.gson.functional.TypeAdapterPrecedenceTest.Foo.class).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStreamingFollowedByNonstreamingHierarchical() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStreamingFollowedByNonstreamingHierarchical");
        Gson gson = new GsonBuilder().registerTypeAdapter(Foo.class, newTypeAdapter("type adapter")).registerTypeHierarchyAdapter(Foo.class, newSerializer("serializer")).registerTypeHierarchyAdapter(Foo.class, newDeserializer("deserializer")).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2546,gson,2545,gson.toJson(new com.google.gson.functional.TypeAdapterPrecedenceTest.Foo("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2547,gson.fromJson("foo", com.google.gson.functional.TypeAdapterPrecedenceTest.Foo.class).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStreamingFollowedByNonstreamingHierarchical_literalMutation2045() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStreamingFollowedByNonstreamingHierarchical_literalMutation2045");
        Gson gson = new GsonBuilder().registerTypeAdapter(Foo.class, newTypeAdapter("foo")).registerTypeHierarchyAdapter(Foo.class, newSerializer("serializer")).registerTypeHierarchyAdapter(Foo.class, newDeserializer("deserializer")).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2546,gson,2545,gson.toJson(new com.google.gson.functional.TypeAdapterPrecedenceTest.Foo("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2547,gson.fromJson("foo", com.google.gson.functional.TypeAdapterPrecedenceTest.Foo.class).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStreamingFollowedByNonstreamingHierarchical_literalMutation2046() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStreamingFollowedByNonstreamingHierarchical_literalMutation2046");
        Gson gson = new GsonBuilder().registerTypeAdapter(Foo.class, newTypeAdapter("type adapter")).registerTypeHierarchyAdapter(Foo.class, newSerializer("foo")).registerTypeHierarchyAdapter(Foo.class, newDeserializer("deserializer")).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2546,gson,2545,gson.toJson(new com.google.gson.functional.TypeAdapterPrecedenceTest.Foo("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2547,gson.fromJson("foo", com.google.gson.functional.TypeAdapterPrecedenceTest.Foo.class).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStreamingFollowedByNonstreamingHierarchical_literalMutation2047() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStreamingFollowedByNonstreamingHierarchical_literalMutation2047");
        Gson gson = new GsonBuilder().registerTypeAdapter(Foo.class, newTypeAdapter("type adapter")).registerTypeHierarchyAdapter(Foo.class, newSerializer("serializer")).registerTypeHierarchyAdapter(Foo.class, newDeserializer("foo")).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2546,gson,2545,gson.toJson(new com.google.gson.functional.TypeAdapterPrecedenceTest.Foo("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2547,gson.fromJson("foo", com.google.gson.functional.TypeAdapterPrecedenceTest.Foo.class).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStreamingHierarchicalFollowedByNonstreamingHierarchical() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStreamingHierarchicalFollowedByNonstreamingHierarchical");
        Gson gson = new GsonBuilder().registerTypeHierarchyAdapter(Foo.class, newSerializer("foo")).registerTypeHierarchyAdapter(Foo.class, newDeserializer("deserializer")).registerTypeHierarchyAdapter(Foo.class, newTypeAdapter("type adapter")).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2555,gson,2554,gson.toJson(new com.google.gson.functional.TypeAdapterPrecedenceTest.Foo("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2556,gson.fromJson("foo", com.google.gson.functional.TypeAdapterPrecedenceTest.Foo.class).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStreamingHierarchicalFollowedByNonstreamingHierarchical_literalMutation2054() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStreamingHierarchicalFollowedByNonstreamingHierarchical_literalMutation2054");
        Gson gson = new GsonBuilder().registerTypeHierarchyAdapter(Foo.class, newSerializer("serializer")).registerTypeHierarchyAdapter(Foo.class, newDeserializer("foo")).registerTypeHierarchyAdapter(Foo.class, newTypeAdapter("type adapter")).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2555,gson,2554,gson.toJson(new com.google.gson.functional.TypeAdapterPrecedenceTest.Foo("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2556,gson.fromJson("foo", com.google.gson.functional.TypeAdapterPrecedenceTest.Foo.class).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStreamingHierarchicalFollowedByNonstreamingHierarchical_literalMutation2055() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStreamingHierarchicalFollowedByNonstreamingHierarchical_literalMutation2055");
        Gson gson = new GsonBuilder().registerTypeHierarchyAdapter(Foo.class, newSerializer("serializer")).registerTypeHierarchyAdapter(Foo.class, newDeserializer("deserializer")).registerTypeHierarchyAdapter(Foo.class, newTypeAdapter("foo")).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2555,gson,2554,gson.toJson(new com.google.gson.functional.TypeAdapterPrecedenceTest.Foo("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2556,gson.fromJson("foo", com.google.gson.functional.TypeAdapterPrecedenceTest.Foo.class).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNonstreamingHierarchicalFollowedByNonstreaming() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNonstreamingHierarchicalFollowedByNonstreaming");
        Gson gson = new GsonBuilder().registerTypeHierarchyAdapter(Foo.class, newSerializer("foo")).registerTypeHierarchyAdapter(Foo.class, newDeserializer("hierarchical")).registerTypeAdapter(Foo.class, newSerializer("non hierarchical")).registerTypeAdapter(Foo.class, newDeserializer("non hierarchical")).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2540,gson,2539,gson.toJson(new com.google.gson.functional.TypeAdapterPrecedenceTest.Foo("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2541,gson.fromJson("foo", com.google.gson.functional.TypeAdapterPrecedenceTest.Foo.class).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNonstreamingHierarchicalFollowedByNonstreaming_literalMutation2036() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNonstreamingHierarchicalFollowedByNonstreaming_literalMutation2036");
        Gson gson = new GsonBuilder().registerTypeHierarchyAdapter(Foo.class, newSerializer("hierarchical")).registerTypeHierarchyAdapter(Foo.class, newDeserializer("foo")).registerTypeAdapter(Foo.class, newSerializer("non hierarchical")).registerTypeAdapter(Foo.class, newDeserializer("non hierarchical")).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2540,gson,2539,gson.toJson(new com.google.gson.functional.TypeAdapterPrecedenceTest.Foo("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2541,gson.fromJson("foo", com.google.gson.functional.TypeAdapterPrecedenceTest.Foo.class).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNonstreamingHierarchicalFollowedByNonstreaming_literalMutation2037() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNonstreamingHierarchicalFollowedByNonstreaming_literalMutation2037");
        Gson gson = new GsonBuilder().registerTypeHierarchyAdapter(Foo.class, newSerializer("hierarchical")).registerTypeHierarchyAdapter(Foo.class, newDeserializer("hierarchical")).registerTypeAdapter(Foo.class, newSerializer("foo")).registerTypeAdapter(Foo.class, newDeserializer("non hierarchical")).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2540,gson,2539,gson.toJson(new com.google.gson.functional.TypeAdapterPrecedenceTest.Foo("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2541,gson.fromJson("foo", com.google.gson.functional.TypeAdapterPrecedenceTest.Foo.class).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNonstreamingHierarchicalFollowedByNonstreaming_literalMutation2038() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNonstreamingHierarchicalFollowedByNonstreaming_literalMutation2038");
        Gson gson = new GsonBuilder().registerTypeHierarchyAdapter(Foo.class, newSerializer("hierarchical")).registerTypeHierarchyAdapter(Foo.class, newDeserializer("hierarchical")).registerTypeAdapter(Foo.class, newSerializer("non hierarchical")).registerTypeAdapter(Foo.class, newDeserializer("foo")).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2540,gson,2539,gson.toJson(new com.google.gson.functional.TypeAdapterPrecedenceTest.Foo("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2541,gson.fromJson("foo", com.google.gson.functional.TypeAdapterPrecedenceTest.Foo.class).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static class Foo {
        final String name;

        private Foo(String name) {
            this.name = name;
        }
    }

    private JsonSerializer<Foo> newSerializer(final String name) {
        return new JsonSerializer<Foo>() {
            public JsonElement serialize(Foo src, Type typeOfSrc, JsonSerializationContext context) {
                return new JsonPrimitive((((src.name) + " via ") + name));
            }
        };
    }

    private JsonDeserializer<Foo> newDeserializer(final String name) {
        return new JsonDeserializer<Foo>() {
            public Foo deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
                return new Foo((((json.getAsString()) + " via ") + name));
            }
        };
    }

    private TypeAdapter<Foo> newTypeAdapter(final String name) {
        return new TypeAdapter<Foo>() {
            @Override
            public Foo read(JsonReader in) throws IOException {
                return new Foo((((in.nextString()) + " via ") + name));
            }

            @Override
            public void write(JsonWriter out, Foo value) throws IOException {
                out.value((((value.name) + " via ") + name));
            }
        };
    }
}


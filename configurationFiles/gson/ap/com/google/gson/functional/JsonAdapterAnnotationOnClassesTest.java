package com.google.gson.functional;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.stream.JsonWriter;
import org.junit.Test;
import junit.framework.TestCase;
import java.lang.reflect.Type;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

/** 
 * Functional tests for the {@link com.google.gson.annotations.JsonAdapter} annotation on classes.
 */
public final class JsonAdapterAnnotationOnClassesTest extends TestCase {
    public void testJsonAdapterInvoked() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonAdapterInvoked");
        Gson gson = new Gson();
        String json = gson.toJson(new A("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1668,json);
        json = gson.toJson(new User("Inderjeet" , "Singh"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1669,json);
        User user = gson.fromJson("{\'name\':\'Joel Leitch\'}", User.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1670,user.firstName);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1671,user.lastName);
        json = gson.toJson(Foo.BAR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,json);
        Foo baz = gson.fromJson("\"baz\"", Foo.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1672,com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.Foo.BAZ);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1673,baz);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonAdapterInvoked_literalMutation1323() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonAdapterInvoked_literalMutation1323");
        Gson gson = new Gson();
        String json = gson.toJson(new A("bar"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1668,json);
        json = gson.toJson(new User("foo" , "Singh"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1669,json);
        User user = gson.fromJson("{\'name\':\'Joel Leitch\'}", User.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1670,user.firstName);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1671,user.lastName);
        json = gson.toJson(Foo.BAR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,json);
        Foo baz = gson.fromJson("\"baz\"", Foo.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1672,com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.Foo.BAZ);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1673,baz);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonAdapterInvoked_literalMutation1324() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonAdapterInvoked_literalMutation1324");
        Gson gson = new Gson();
        String json = gson.toJson(new A("bar"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1668,json);
        json = gson.toJson(new User("Inderjeet" , "foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1669,json);
        User user = gson.fromJson("{\'name\':\'Joel Leitch\'}", User.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1670,user.firstName);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1671,user.lastName);
        json = gson.toJson(Foo.BAR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,json);
        Foo baz = gson.fromJson("\"baz\"", Foo.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1672,com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.Foo.BAZ);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1673,baz);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonAdapterInvoked_literalMutation1325() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonAdapterInvoked_literalMutation1325");
        Gson gson = new Gson();
        String json = gson.toJson(new A("bar"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1668,json);
        json = gson.toJson(new User("Inderjeet" , "Singh"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1669,json);
        User user = gson.fromJson("foo", User.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1670,user.firstName);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1671,user.lastName);
        json = gson.toJson(Foo.BAR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,json);
        Foo baz = gson.fromJson("\"baz\"", Foo.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1672,com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.Foo.BAZ);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1673,baz);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonAdapterInvoked_literalMutation1326() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonAdapterInvoked_literalMutation1326");
        Gson gson = new Gson();
        String json = gson.toJson(new A("bar"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1668,json);
        json = gson.toJson(new User("Inderjeet" , "Singh"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1669,json);
        User user = gson.fromJson("{\'name\':\'Joel Leitch\'}", User.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1670,user.firstName);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1671,user.lastName);
        json = gson.toJson(Foo.BAR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,json);
        Foo baz = gson.fromJson("foo", Foo.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1672,com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.Foo.BAZ);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1673,baz);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonAdapterFactoryInvoked() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonAdapterFactoryInvoked");
        Gson gson = new Gson();
        String json = gson.toJson(new C("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1666,json);
        C c = gson.fromJson("\"bar\"", C.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1667,c.value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonAdapterFactoryInvoked_literalMutation1321() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonAdapterFactoryInvoked_literalMutation1321");
        Gson gson = new Gson();
        String json = gson.toJson(new C("bar"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1666,json);
        C c = gson.fromJson("foo", C.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1667,c.value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRegisteredAdapterOverridesJsonAdapter_add1164() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegisteredAdapterOverridesJsonAdapter_add1164");
        TypeAdapter<A> typeAdapter = new TypeAdapter<A>() {
            @Override
            public void write(JsonWriter out, A value) throws IOException {
                out.value("registeredAdapter");
            }

            @Override
            public A read(JsonReader in) throws IOException {
                return new A(in.nextString());
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(A.class, typeAdapter).create();
        String json = gson.toJson(new A("abcd"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1674,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRegisteredAdapterOverridesJsonAdapter_add1165() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegisteredAdapterOverridesJsonAdapter_add1165");
        TypeAdapter<A> typeAdapter = new TypeAdapter<A>() {
            @Override
            public void write(JsonWriter out, A value) throws IOException {
                out.value("registeredAdapter");
                out.value("registeredAdapter");
            }

            @Override
            public A read(JsonReader in) throws IOException {
                return new A(in.nextString());
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(A.class, typeAdapter).create();
        String json = gson.toJson(new A("abcd"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1674,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegisteredAdapterOverridesJsonAdapter() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegisteredAdapterOverridesJsonAdapter");
        TypeAdapter<A> typeAdapter = new TypeAdapter<A>() {
            @Override
            public void write(JsonWriter out, A value) throws IOException {
                out.value("foo");
            }

            @Override
            public A read(JsonReader in) throws IOException {
                return new A(in.nextString());
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(A.class, typeAdapter).create();
        String json = gson.toJson(new A("abcd"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1674,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegisteredAdapterOverridesJsonAdapter_literalMutation1328() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegisteredAdapterOverridesJsonAdapter_literalMutation1328");
        TypeAdapter<A> typeAdapter = new TypeAdapter<A>() {
            @Override
            public void write(JsonWriter out, A value) throws IOException {
                out.value("registeredAdapter");
            }

            @Override
            public A read(JsonReader in) throws IOException {
                return new A(in.nextString());
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(A.class, typeAdapter).create();
        String json = gson.toJson(new A("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1674,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRegisteredAdapterOverridesJsonAdapter_remove981() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegisteredAdapterOverridesJsonAdapter_remove981");
        TypeAdapter<A> typeAdapter = new TypeAdapter<A>() {
            @Override
            public void write(JsonWriter out, A value) throws IOException {
                out.value("registeredAdapter");
            }

            @Override
            public A read(JsonReader in) throws IOException {
                return new A(in.nextString());
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(A.class, typeAdapter).create();
        String json = gson.toJson(new A("abcd"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1674,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRegisteredAdapterOverridesJsonAdapter_remove982() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegisteredAdapterOverridesJsonAdapter_remove982");
        TypeAdapter<A> typeAdapter = new TypeAdapter<A>() {
            @Override
            public void write(JsonWriter out, A value) throws IOException {
            }

            @Override
            public A read(JsonReader in) throws IOException {
                return new A(in.nextString());
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(A.class, typeAdapter).create();
        String json = gson.toJson(new A("abcd"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1674,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * The serializer overrides field adapter, but for deserializer the fieldAdapter is used.
     */
@Test(timeout = 1000)
    public void testRegisteredSerializerOverridesJsonAdapter_add1167() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegisteredSerializerOverridesJsonAdapter_add1167");
        JsonSerializer<A> serializer = new JsonSerializer<A>() {
            public JsonElement serialize(A src, Type typeOfSrc, JsonSerializationContext context) {
                return new JsonPrimitive("registeredSerializer");
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(A.class, serializer).create();
        String json = gson.toJson(new A("abcd"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1677,json);
        A target = gson.fromJson("abcd", A.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1678,target.value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * The serializer overrides field adapter, but for deserializer the fieldAdapter is used.
     */
public void testRegisteredSerializerOverridesJsonAdapter() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegisteredSerializerOverridesJsonAdapter");
        JsonSerializer<A> serializer = new JsonSerializer<A>() {
            public JsonElement serialize(A src, Type typeOfSrc, JsonSerializationContext context) {
                return new JsonPrimitive("foo");
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(A.class, serializer).create();
        String json = gson.toJson(new A("abcd"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1677,json);
        A target = gson.fromJson("abcd", A.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1678,target.value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * The serializer overrides field adapter, but for deserializer the fieldAdapter is used.
     */
public void testRegisteredSerializerOverridesJsonAdapter_literalMutation1333() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegisteredSerializerOverridesJsonAdapter_literalMutation1333");
        JsonSerializer<A> serializer = new JsonSerializer<A>() {
            public JsonElement serialize(A src, Type typeOfSrc, JsonSerializationContext context) {
                return new JsonPrimitive("registeredSerializer");
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(A.class, serializer).create();
        String json = gson.toJson(new A("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1677,json);
        A target = gson.fromJson("abcd", A.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1678,target.value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * The serializer overrides field adapter, but for deserializer the fieldAdapter is used.
     */
public void testRegisteredSerializerOverridesJsonAdapter_literalMutation1334() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegisteredSerializerOverridesJsonAdapter_literalMutation1334");
        JsonSerializer<A> serializer = new JsonSerializer<A>() {
            public JsonElement serialize(A src, Type typeOfSrc, JsonSerializationContext context) {
                return new JsonPrimitive("registeredSerializer");
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(A.class, serializer).create();
        String json = gson.toJson(new A("abcd"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1677,json);
        A target = gson.fromJson("foo", A.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1678,target.value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * The serializer overrides field adapter, but for deserializer the fieldAdapter is used.
     */
@Test(timeout = 1000)
    public void testRegisteredSerializerOverridesJsonAdapter_remove984() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegisteredSerializerOverridesJsonAdapter_remove984");
        JsonSerializer<A> serializer = new JsonSerializer<A>() {
            public JsonElement serialize(A src, Type typeOfSrc, JsonSerializationContext context) {
                return new JsonPrimitive("registeredSerializer");
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(A.class, serializer).create();
        String json = gson.toJson(new A("abcd"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1677,json);
        A target = gson.fromJson("abcd", A.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1678,target.value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * The deserializer overrides Json adapter, but for serializer the jsonAdapter is used.
     */
@Test(timeout = 1000)
    public void testRegisteredDeserializerOverridesJsonAdapter_add1166() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegisteredDeserializerOverridesJsonAdapter_add1166");
        JsonDeserializer<A> deserializer = new JsonDeserializer<A>() {
            public A deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                return new A("registeredDeserializer");
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(A.class, deserializer).create();
        String json = gson.toJson(new A("abcd"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1675,json);
        A target = gson.fromJson("abcd", A.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1676,target.value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * The deserializer overrides Json adapter, but for serializer the jsonAdapter is used.
     */
public void testRegisteredDeserializerOverridesJsonAdapter() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegisteredDeserializerOverridesJsonAdapter");
        JsonDeserializer<A> deserializer = new JsonDeserializer<A>() {
            public A deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                return new A("foo");
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(A.class, deserializer).create();
        String json = gson.toJson(new A("abcd"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1675,json);
        A target = gson.fromJson("abcd", A.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1676,target.value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * The deserializer overrides Json adapter, but for serializer the jsonAdapter is used.
     */
public void testRegisteredDeserializerOverridesJsonAdapter_literalMutation1330() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegisteredDeserializerOverridesJsonAdapter_literalMutation1330");
        JsonDeserializer<A> deserializer = new JsonDeserializer<A>() {
            public A deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                return new A("registeredDeserializer");
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(A.class, deserializer).create();
        String json = gson.toJson(new A("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1675,json);
        A target = gson.fromJson("abcd", A.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1676,target.value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * The deserializer overrides Json adapter, but for serializer the jsonAdapter is used.
     */
public void testRegisteredDeserializerOverridesJsonAdapter_literalMutation1331() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegisteredDeserializerOverridesJsonAdapter_literalMutation1331");
        JsonDeserializer<A> deserializer = new JsonDeserializer<A>() {
            public A deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                return new A("registeredDeserializer");
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(A.class, deserializer).create();
        String json = gson.toJson(new A("abcd"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1675,json);
        A target = gson.fromJson("foo", A.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1676,target.value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * The deserializer overrides Json adapter, but for serializer the jsonAdapter is used.
     */
@Test(timeout = 1000)
    public void testRegisteredDeserializerOverridesJsonAdapter_remove983() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegisteredDeserializerOverridesJsonAdapter_remove983");
        JsonDeserializer<A> deserializer = new JsonDeserializer<A>() {
            public A deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                return new A("registeredDeserializer");
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(A.class, deserializer).create();
        String json = gson.toJson(new A("abcd"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1675,json);
        A target = gson.fromJson("abcd", A.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1676,target.value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIncorrectTypeAdapterFails() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIncorrectTypeAdapterFails");
        try {
            String json = new Gson().toJson(new ClassWithIncorrectJsonAdapter("foo"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1665,json);
        } catch (ClassCastException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSuperclassTypeAdapterNotInvoked() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSuperclassTypeAdapterNotInvoked");
        String json = new Gson().toJson(new B("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1680,json,1679,json.contains("jsonAdapter"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @com.google.gson.annotations.JsonAdapter(value = A.JsonAdapter.class)
    private static class A {
        final String value;

        A(String value) {
            this.value = value;
        }

        static final class JsonAdapter extends TypeAdapter<A> {
            @Override
            public void write(JsonWriter out, A value) throws IOException {
                out.value("jsonAdapter");
            }

            @Override
            public A read(JsonReader in) throws IOException {
                in.nextString();
                return new A("jsonAdapter");
            }
        }
    }

    @com.google.gson.annotations.JsonAdapter(value = C.JsonAdapterFactory.class)
    private static class C {
        final String value;

        C(String value) {
            this.value = value;
        }

        static final class JsonAdapterFactory implements TypeAdapterFactory {
            public <T>TypeAdapter<T> create(Gson gson, final TypeToken<T> type) {
                return new TypeAdapter<T>() {
                    @Override
                    public void write(JsonWriter out, T value) throws IOException {
                        out.value("jsonAdapterFactory");
                    }

                    @SuppressWarnings(value = "unchecked")
                    @Override
                    public T read(JsonReader in) throws IOException {
                        in.nextString();
                        return ((T)(new C("jsonAdapterFactory")));
                    }
                };
            }
        }
    }

    private static final class B extends A {
        B(String value) {
            super(value);
        }
    }

    @com.google.gson.annotations.JsonAdapter(value = A.JsonAdapter.class)
    private static final class ClassWithIncorrectJsonAdapter {
        @SuppressWarnings(value = "unused")
        final String value;

        ClassWithIncorrectJsonAdapter(String value) {
            this.value = value;
        }
    }

    @com.google.gson.annotations.JsonAdapter(value = UserJsonAdapter.class)
    private static class User {
        final String firstName;

        final String lastName;

        User(String firstName ,String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }

    private static class UserJsonAdapter extends TypeAdapter<User> {
        @Override
        public void write(JsonWriter out, User user) throws IOException {
            out.beginObject();
            out.name("name");
            out.value((((user.firstName) + " ") + (user.lastName)));
            out.endObject();
        }

        @Override
        public User read(JsonReader in) throws IOException {
            in.beginObject();
            in.nextName();
            String[] nameParts = in.nextString().split(" ");
            in.endObject();
            return new User(nameParts[0] , nameParts[1]);
        }
    }

    @com.google.gson.annotations.JsonAdapter(value = FooJsonAdapter.class)
    private static enum Foo {
BAR, BAZ;    }

    private static class FooJsonAdapter extends TypeAdapter<Foo> {
        @Override
        public void write(JsonWriter out, Foo value) throws IOException {
            out.value(value.name().toLowerCase(java.util.Locale.US));
        }

        @Override
        public Foo read(JsonReader in) throws IOException {
            return Foo.valueOf(in.nextString().toUpperCase(java.util.Locale.US));
        }
    }
}


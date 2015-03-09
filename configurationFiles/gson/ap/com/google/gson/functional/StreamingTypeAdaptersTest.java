package com.google.gson.functional;

import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonWriter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.io.StringReader;
import java.io.StringWriter;
import org.junit.Test;
import junit.framework.TestCase;
import com.google.gson.TypeAdapter;

public final class StreamingTypeAdaptersTest extends TestCase {
    private Gson miniGson = new GsonBuilder().create();

    private TypeAdapter<Truck> truckAdapter = miniGson.getAdapter(Truck.class);

    private TypeAdapter<java.util.Map<java.lang.String, java.lang.Double>> mapAdapter = miniGson.getAdapter(new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Double>>() {    });

    public void testSerialize() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerialize");
        Truck truck = new Truck();
        truck.passengers = java.util.Arrays.asList(new Person("foo" , 29), new Person("Jodie" , 29));
        truck.horsePower = 300;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2466,("{\'horsePower\':300.0," + "\'passengers\':[{\'age\':29,\'name\':\'Jesse\'},{\'age\':29,\'name\':\'Jodie\'}]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2468,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(truckAdapter, truck),2467,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(truckAdapter, truck).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerialize_literalMutation1972() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerialize_literalMutation1972");
        Truck truck = new Truck();
        truck.passengers = java.util.Arrays.asList(new Person("Jesse" , 30), new Person("Jodie" , 29));
        truck.horsePower = 300;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2466,("{\'horsePower\':300.0," + "\'passengers\':[{\'age\':29,\'name\':\'Jesse\'},{\'age\':29,\'name\':\'Jodie\'}]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2468,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(truckAdapter, truck),2467,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(truckAdapter, truck).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerialize_literalMutation1973() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerialize_literalMutation1973");
        Truck truck = new Truck();
        truck.passengers = java.util.Arrays.asList(new Person("Jesse" , 29), new Person("foo" , 29));
        truck.horsePower = 300;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2466,("{\'horsePower\':300.0," + "\'passengers\':[{\'age\':29,\'name\':\'Jesse\'},{\'age\':29,\'name\':\'Jodie\'}]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2468,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(truckAdapter, truck),2467,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(truckAdapter, truck).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerialize_literalMutation1974() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerialize_literalMutation1974");
        Truck truck = new Truck();
        truck.passengers = java.util.Arrays.asList(new Person("Jesse" , 29), new Person("Jodie" , 30));
        truck.horsePower = 300;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2466,("{\'horsePower\':300.0," + "\'passengers\':[{\'age\':29,\'name\':\'Jesse\'},{\'age\':29,\'name\':\'Jodie\'}]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2468,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(truckAdapter, truck),2467,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(truckAdapter, truck).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerialize_literalMutation1975() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerialize_literalMutation1975");
        Truck truck = new Truck();
        truck.passengers = java.util.Arrays.asList(new Person("Jesse" , 29), new Person("Jodie" , 29));
        truck.horsePower = 299;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2466,("{\'horsePower\':300.0," + "\'passengers\':[{\'age\':29,\'name\':\'Jesse\'},{\'age\':29,\'name\':\'Jodie\'}]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2468,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(truckAdapter, truck),2467,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(truckAdapter, truck).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserialize() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserialize");
        String json = "foo" + "\'passengers\':[{\'age\':29,\'name\':\'Jesse\'},{\'age\':29,\'name\':\'Jodie\'}]}";
        Truck truck = fromJson(truckAdapter, json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2437,truck.horsePower);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2439,null,2438,java.util.Arrays.asList(new com.google.gson.functional.StreamingTypeAdaptersTest.Person("Jesse" , 29), new com.google.gson.functional.StreamingTypeAdaptersTest.Person("Jodie" , 29)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2440,truck.passengers);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserialize_literalMutation1942() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserialize_literalMutation1942");
        String json = "{\'horsePower\':300.0," + "foo";
        Truck truck = fromJson(truckAdapter, json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2437,truck.horsePower);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2439,null,2438,java.util.Arrays.asList(new com.google.gson.functional.StreamingTypeAdaptersTest.Person("Jesse" , 29), new com.google.gson.functional.StreamingTypeAdaptersTest.Person("Jodie" , 29)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2440,truck.passengers);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeNullField() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeNullField");
        Truck truck = new Truck();
        truck.passengers = null;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2458,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(truckAdapter, truck),2457,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(truckAdapter, truck).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializeNullField() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeNullField");
        Truck truck = fromJson(truckAdapter, "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2430,truck.passengers);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeNullObject() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeNullObject");
        Truck truck = new Truck();
        truck.passengers = java.util.Arrays.asList(((Person)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2460,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(truckAdapter, truck),2459,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(truckAdapter, truck).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializeNullObject() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeNullObject");
        Truck truck = fromJson(truckAdapter, "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2432,null,2431,java.util.Arrays.asList(((com.google.gson.functional.StreamingTypeAdaptersTest.Person)(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2433,truck.passengers);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeWithCustomTypeAdapter_add1446() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeWithCustomTypeAdapter_add1446");
        usePersonNameAdapter();
        usePersonNameAdapter();
        Truck truck = new Truck();
        truck.passengers = java.util.Arrays.asList(new Person("Jesse" , 29), new Person("Jodie" , 29));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2465,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(truckAdapter, truck),2464,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(truckAdapter, truck).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeWithCustomTypeAdapter() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeWithCustomTypeAdapter");
        usePersonNameAdapter();
        Truck truck = new Truck();
        truck.passengers = java.util.Arrays.asList(new Person("foo" , 29), new Person("Jodie" , 29));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2465,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(truckAdapter, truck),2464,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(truckAdapter, truck).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeWithCustomTypeAdapter_literalMutation1989() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeWithCustomTypeAdapter_literalMutation1989");
        usePersonNameAdapter();
        Truck truck = new Truck();
        truck.passengers = java.util.Arrays.asList(new Person("Jesse" , 30), new Person("Jodie" , 29));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2465,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(truckAdapter, truck),2464,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(truckAdapter, truck).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeWithCustomTypeAdapter_literalMutation1990() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeWithCustomTypeAdapter_literalMutation1990");
        usePersonNameAdapter();
        Truck truck = new Truck();
        truck.passengers = java.util.Arrays.asList(new Person("Jesse" , 29), new Person("foo" , 29));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2465,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(truckAdapter, truck),2464,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(truckAdapter, truck).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeWithCustomTypeAdapter_literalMutation1991() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeWithCustomTypeAdapter_literalMutation1991");
        usePersonNameAdapter();
        Truck truck = new Truck();
        truck.passengers = java.util.Arrays.asList(new Person("Jesse" , 29), new Person("Jodie" , 28));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2465,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(truckAdapter, truck),2464,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(truckAdapter, truck).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeWithCustomTypeAdapter_remove1196() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeWithCustomTypeAdapter_remove1196");
        Truck truck = new Truck();
        truck.passengers = java.util.Arrays.asList(new Person("Jesse" , 29), new Person("Jodie" , 29));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2465,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(truckAdapter, truck),2464,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(truckAdapter, truck).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializeWithCustomTypeAdapter_add1430() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeWithCustomTypeAdapter_add1430");
        usePersonNameAdapter();
        usePersonNameAdapter();
        Truck truck = fromJson(truckAdapter, "{\'horsePower\':0.0,\'passengers\':[\'Jesse\',\'Jodie\']}");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2435,null,2434,java.util.Arrays.asList(new com.google.gson.functional.StreamingTypeAdaptersTest.Person("Jesse" , -1), new com.google.gson.functional.StreamingTypeAdaptersTest.Person("Jodie" , -1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2436,truck.passengers);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializeWithCustomTypeAdapter() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeWithCustomTypeAdapter");
        usePersonNameAdapter();
        Truck truck = fromJson(truckAdapter, "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2435,null,2434,java.util.Arrays.asList(new com.google.gson.functional.StreamingTypeAdaptersTest.Person("Jesse" , -1), new com.google.gson.functional.StreamingTypeAdaptersTest.Person("Jodie" , -1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2436,truck.passengers);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializeWithCustomTypeAdapter_remove1182() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeWithCustomTypeAdapter_remove1182");
        Truck truck = fromJson(truckAdapter, "{\'horsePower\':0.0,\'passengers\':[\'Jesse\',\'Jodie\']}");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2435,null,2434,java.util.Arrays.asList(new com.google.gson.functional.StreamingTypeAdaptersTest.Person("Jesse" , -1), new com.google.gson.functional.StreamingTypeAdaptersTest.Person("Jodie" , -1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2436,truck.passengers);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void usePersonNameAdapter() {
        TypeAdapter<Person> personNameAdapter = new TypeAdapter<Person>() {
            @Override
            public Person read(JsonReader in) throws IOException {
                String name = in.nextString();
                return new Person(name , -1);
            }

            @Override
            public void write(JsonWriter out, Person value) throws IOException {
                out.value(value.name);
            }
        };
        miniGson = new GsonBuilder().registerTypeAdapter(Person.class, personNameAdapter).create();
        truckAdapter = miniGson.getAdapter(Truck.class);
    }

    @Test(timeout = 1000)
    public void testSerializeMap_add1444() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMap_add1444");
        Map<java.lang.String, java.lang.Double> map = new LinkedHashMap<java.lang.String, java.lang.Double>();
        map.put("a", 5.0);
        map.put("a", 5.0);
        map.put("b", 10.0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2456,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(mapAdapter, map),2455,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(mapAdapter, map).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeMap_add1445() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMap_add1445");
        Map<java.lang.String, java.lang.Double> map = new LinkedHashMap<java.lang.String, java.lang.Double>();
        map.put("a", 5.0);
        map.put("b", 10.0);
        map.put("b", 10.0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2456,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(mapAdapter, map),2455,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(mapAdapter, map).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeMap() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMap");
        Map<java.lang.String, java.lang.Double> map = new LinkedHashMap<java.lang.String, java.lang.Double>();
        map.put("foo", 5.0);
        map.put("b", 10.0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2456,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(mapAdapter, map),2455,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(mapAdapter, map).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeMap_literalMutation1980() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMap_literalMutation1980");
        Map<java.lang.String, java.lang.Double> map = new LinkedHashMap<java.lang.String, java.lang.Double>();
        map.put("a", 6.0);
        map.put("b", 10.0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2456,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(mapAdapter, map),2455,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(mapAdapter, map).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeMap_literalMutation1981() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMap_literalMutation1981");
        Map<java.lang.String, java.lang.Double> map = new LinkedHashMap<java.lang.String, java.lang.Double>();
        map.put("a", 5.0);
        map.put("foo", 10.0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2456,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(mapAdapter, map),2455,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(mapAdapter, map).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeMap_literalMutation1982() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMap_literalMutation1982");
        Map<java.lang.String, java.lang.Double> map = new LinkedHashMap<java.lang.String, java.lang.Double>();
        map.put("a", 5.0);
        map.put("b", 11.0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2456,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(mapAdapter, map),2455,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(mapAdapter, map).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeMap_remove1194() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMap_remove1194");
        Map<java.lang.String, java.lang.Double> map = new LinkedHashMap<java.lang.String, java.lang.Double>();
        map.put("b", 10.0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2456,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(mapAdapter, map),2455,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(mapAdapter, map).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeMap_remove1195() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMap_remove1195");
        Map<java.lang.String, java.lang.Double> map = new LinkedHashMap<java.lang.String, java.lang.Double>();
        map.put("b", 10.0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2456,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(mapAdapter, map),2455,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(mapAdapter, map).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializeMap_add1428() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeMap_add1428");
        Map<java.lang.String, java.lang.Double> map = new LinkedHashMap<java.lang.String, java.lang.Double>();
        map.put("a", 5.0);
        map.put("a", 5.0);
        map.put("b", 10.0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2427,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2429,null,2428,fromJson(mapAdapter, "{\'a\':5.0,\'b\':10.0}"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializeMap_add1429() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeMap_add1429");
        Map<java.lang.String, java.lang.Double> map = new LinkedHashMap<java.lang.String, java.lang.Double>();
        map.put("a", 5.0);
        map.put("b", 10.0);
        map.put("b", 10.0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2427,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2429,null,2428,fromJson(mapAdapter, "{\'a\':5.0,\'b\':10.0}"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializeMap() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeMap");
        Map<java.lang.String, java.lang.Double> map = new LinkedHashMap<java.lang.String, java.lang.Double>();
        map.put("foo", 5.0);
        map.put("b", 10.0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2427,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2429,null,2428,fromJson(mapAdapter, "{\'a\':5.0,\'b\':10.0}"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializeMap_literalMutation1949() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeMap_literalMutation1949");
        Map<java.lang.String, java.lang.Double> map = new LinkedHashMap<java.lang.String, java.lang.Double>();
        map.put("a", 6.0);
        map.put("b", 10.0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2427,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2429,null,2428,fromJson(mapAdapter, "{\'a\':5.0,\'b\':10.0}"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializeMap_literalMutation1950() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeMap_literalMutation1950");
        Map<java.lang.String, java.lang.Double> map = new LinkedHashMap<java.lang.String, java.lang.Double>();
        map.put("a", 5.0);
        map.put("foo", 10.0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2427,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2429,null,2428,fromJson(mapAdapter, "{\'a\':5.0,\'b\':10.0}"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializeMap_literalMutation1951() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeMap_literalMutation1951");
        Map<java.lang.String, java.lang.Double> map = new LinkedHashMap<java.lang.String, java.lang.Double>();
        map.put("a", 5.0);
        map.put("b", 9.0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2427,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2429,null,2428,fromJson(mapAdapter, "{\'a\':5.0,\'b\':10.0}"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializeMap_remove1180() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeMap_remove1180");
        Map<java.lang.String, java.lang.Double> map = new LinkedHashMap<java.lang.String, java.lang.Double>();
        map.put("b", 10.0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2427,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2429,null,2428,fromJson(mapAdapter, "{\'a\':5.0,\'b\':10.0}"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializeMap_remove1181() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeMap_remove1181");
        Map<java.lang.String, java.lang.Double> map = new LinkedHashMap<java.lang.String, java.lang.Double>();
        map.put("b", 10.0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2427,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2429,null,2428,fromJson(mapAdapter, "{\'a\':5.0,\'b\':10.0}"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerialize1dArray() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerialize1dArray");
        TypeAdapter<double[]> arrayAdapter = miniGson.getAdapter(new com.google.gson.reflect.TypeToken<double[]>() {        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2452,null,2451,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(arrayAdapter, new double[]{ 1.0 , 2.0 , 3.0 }));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerialize1dArray_remove1192() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerialize1dArray_remove1192");
        TypeAdapter<double[]> arrayAdapter = miniGson.getAdapter(new com.google.gson.reflect.TypeToken<double[]>() {        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2452,null,2451,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(arrayAdapter, new double[]{ 1.0 , 2.0 , 3.0 }));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserialize1dArray_add1426() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserialize1dArray_add1426");
        TypeAdapter<double[]> arrayAdapter = miniGson.getAdapter(new com.google.gson.reflect.TypeToken<double[]>() {        });
        double[] array = fromJson(arrayAdapter, "[1.0,2.0,3.0]");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2420,null,2419,java.util.Arrays.toString(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2422,null,2421,java.util.Arrays.equals(new double[]{ 1.0 , 2.0 , 3.0 }, array));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserialize1dArray() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserialize1dArray");
        TypeAdapter<double[]> arrayAdapter = miniGson.getAdapter(new com.google.gson.reflect.TypeToken<double[]>() {        });
        double[] array = fromJson(arrayAdapter, "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2420,null,2419,java.util.Arrays.toString(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2422,null,2421,java.util.Arrays.equals(new double[]{ 1.0 , 2.0 , 3.0 }, array));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserialize1dArray_remove1178() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserialize1dArray_remove1178");
        TypeAdapter<double[]> arrayAdapter = miniGson.getAdapter(new com.google.gson.reflect.TypeToken<double[]>() {        });
        double[] array = fromJson(arrayAdapter, "[1.0,2.0,3.0]");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2420,null,2419,java.util.Arrays.toString(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2422,null,2421,java.util.Arrays.equals(new double[]{ 1.0 , 2.0 , 3.0 }, array));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerialize2dArray_add1443() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerialize2dArray_add1443");
        TypeAdapter<double[][]> arrayAdapter = miniGson.getAdapter(new com.google.gson.reflect.TypeToken<double[][]>() {        });
        double[][] array = new double[][]{ new double[]{ 1.0 , 2.0 } , new double[]{ 3.0 } };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2454,null,2453,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(arrayAdapter, array));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerialize2dArray() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerialize2dArray");
        TypeAdapter<double[][]> arrayAdapter = miniGson.getAdapter(new com.google.gson.reflect.TypeToken<double[][]>() {        });
        double[][] array = new double[][]{ new double[]{ 0.0 , 2.0 } , new double[]{ 3.0 } };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2454,null,2453,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(arrayAdapter, array));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerialize2dArray_literalMutation1977() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerialize2dArray_literalMutation1977");
        TypeAdapter<double[][]> arrayAdapter = miniGson.getAdapter(new com.google.gson.reflect.TypeToken<double[][]>() {        });
        double[][] array = new double[][]{ new double[]{ 1.0 , 3.0 } , new double[]{ 3.0 } };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2454,null,2453,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(arrayAdapter, array));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerialize2dArray_literalMutation1978() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerialize2dArray_literalMutation1978");
        TypeAdapter<double[][]> arrayAdapter = miniGson.getAdapter(new com.google.gson.reflect.TypeToken<double[][]>() {        });
        double[][] array = new double[][]{ new double[]{ 1.0 , 2.0 } , new double[]{ 2.0 } };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2454,null,2453,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(arrayAdapter, array));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerialize2dArray_remove1193() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerialize2dArray_remove1193");
        TypeAdapter<double[][]> arrayAdapter = miniGson.getAdapter(new com.google.gson.reflect.TypeToken<double[][]>() {        });
        double[][] array = new double[][]{ new double[]{ 1.0 , 2.0 } , new double[]{ 3.0 } };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2454,null,2453,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(arrayAdapter, array));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserialize2dArray_add1427() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserialize2dArray_add1427");
        TypeAdapter<double[][]> arrayAdapter = miniGson.getAdapter(new com.google.gson.reflect.TypeToken<double[][]>() {        });
        double[][] array = fromJson(arrayAdapter, "[[1.0,2.0],[3.0]]");
        double[][] expected = new double[][]{ new double[]{ 1.0 , 2.0 } , new double[]{ 3.0 } };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2424,null,2423,java.util.Arrays.toString(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2426,null,2425,java.util.Arrays.deepEquals(expected, array));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserialize2dArray() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserialize2dArray");
        TypeAdapter<double[][]> arrayAdapter = miniGson.getAdapter(new com.google.gson.reflect.TypeToken<double[][]>() {        });
        double[][] array = fromJson(arrayAdapter, "foo");
        double[][] expected = new double[][]{ new double[]{ 1.0 , 2.0 } , new double[]{ 3.0 } };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2424,null,2423,java.util.Arrays.toString(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2426,null,2425,java.util.Arrays.deepEquals(expected, array));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserialize2dArray_literalMutation1945() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserialize2dArray_literalMutation1945");
        TypeAdapter<double[][]> arrayAdapter = miniGson.getAdapter(new com.google.gson.reflect.TypeToken<double[][]>() {        });
        double[][] array = fromJson(arrayAdapter, "[[1.0,2.0],[3.0]]");
        double[][] expected = new double[][]{ new double[]{ 2.0 , 2.0 } , new double[]{ 3.0 } };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2424,null,2423,java.util.Arrays.toString(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2426,null,2425,java.util.Arrays.deepEquals(expected, array));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserialize2dArray_literalMutation1946() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserialize2dArray_literalMutation1946");
        TypeAdapter<double[][]> arrayAdapter = miniGson.getAdapter(new com.google.gson.reflect.TypeToken<double[][]>() {        });
        double[][] array = fromJson(arrayAdapter, "[[1.0,2.0],[3.0]]");
        double[][] expected = new double[][]{ new double[]{ 1.0 , 1.0 } , new double[]{ 3.0 } };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2424,null,2423,java.util.Arrays.toString(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2426,null,2425,java.util.Arrays.deepEquals(expected, array));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserialize2dArray_literalMutation1947() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserialize2dArray_literalMutation1947");
        TypeAdapter<double[][]> arrayAdapter = miniGson.getAdapter(new com.google.gson.reflect.TypeToken<double[][]>() {        });
        double[][] array = fromJson(arrayAdapter, "[[1.0,2.0],[3.0]]");
        double[][] expected = new double[][]{ new double[]{ 1.0 , 2.0 } , new double[]{ 4.0 } };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2424,null,2423,java.util.Arrays.toString(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2426,null,2425,java.util.Arrays.deepEquals(expected, array));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserialize2dArray_remove1179() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserialize2dArray_remove1179");
        TypeAdapter<double[][]> arrayAdapter = miniGson.getAdapter(new com.google.gson.reflect.TypeToken<double[][]>() {        });
        double[][] array = fromJson(arrayAdapter, "[[1.0,2.0],[3.0]]");
        double[][] expected = new double[][]{ new double[]{ 1.0 , 2.0 } , new double[]{ 3.0 } };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2424,null,2423,java.util.Arrays.toString(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2426,null,2425,java.util.Arrays.deepEquals(expected, array));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSafe_add1436() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSafe_add1436");
        TypeAdapter<Person> typeAdapter = new TypeAdapter<Person>() {
            @Override
            public Person read(JsonReader in) throws IOException {
                String[] values = in.nextString().split(",");
                return new Person(values[0] , java.lang.Integer.parseInt(values[1]));
            }

            public void write(JsonWriter out, Person person) throws IOException {
                out.value((((person.name) + ",") + (person.age)));
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(Person.class, typeAdapter).create();
        Truck truck = new Truck();
        truck.horsePower = 1.0;
        truck.passengers = new ArrayList<Person>();
        truck.passengers.add(null);
        truck.passengers.add(new Person("jesse" , 30));
        try {
            gson.toJson(truck, Truck.class);
        } catch (NullPointerException expected) {
        }
        String json = "{horsePower:1.0,passengers:[null,\'jesse,30\']}";
        try {
            gson.fromJson(json, Truck.class);
        } catch (JsonSyntaxException expected) {
        }
        gson = new GsonBuilder().registerTypeAdapter(Person.class, typeAdapter.nullSafe()).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2446,gson,2445,gson.toJson(truck, com.google.gson.functional.StreamingTypeAdaptersTest.Truck.class));
        truck = gson.fromJson(json, Truck.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2447,truck.horsePower);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2449,truck.passengers,2448,truck.passengers.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2450,truck.passengers.get(1).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSafe_add1437() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSafe_add1437");
        TypeAdapter<Person> typeAdapter = new TypeAdapter<Person>() {
            @Override
            public Person read(JsonReader in) throws IOException {
                String[] values = in.nextString().split(",");
                return new Person(values[0] , java.lang.Integer.parseInt(values[1]));
            }

            public void write(JsonWriter out, Person person) throws IOException {
                out.value((((person.name) + ",") + (person.age)));
                out.value((((person.name) + ",") + (person.age)));
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(Person.class, typeAdapter).create();
        Truck truck = new Truck();
        truck.horsePower = 1.0;
        truck.passengers = new ArrayList<Person>();
        truck.passengers.add(null);
        truck.passengers.add(new Person("jesse" , 30));
        try {
            gson.toJson(truck, Truck.class);
        } catch (NullPointerException expected) {
        }
        String json = "{horsePower:1.0,passengers:[null,\'jesse,30\']}";
        try {
            gson.fromJson(json, Truck.class);
        } catch (JsonSyntaxException expected) {
        }
        gson = new GsonBuilder().registerTypeAdapter(Person.class, typeAdapter.nullSafe()).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2446,gson,2445,gson.toJson(truck, com.google.gson.functional.StreamingTypeAdaptersTest.Truck.class));
        truck = gson.fromJson(json, Truck.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2447,truck.horsePower);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2449,truck.passengers,2448,truck.passengers.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2450,truck.passengers.get(1).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSafe_add1438() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSafe_add1438");
        TypeAdapter<Person> typeAdapter = new TypeAdapter<Person>() {
            @Override
            public Person read(JsonReader in) throws IOException {
                String[] values = in.nextString().split(",");
                return new Person(values[0] , java.lang.Integer.parseInt(values[1]));
            }

            public void write(JsonWriter out, Person person) throws IOException {
                out.value((((person.name) + ",") + (person.age)));
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(Person.class, typeAdapter).create();
        Truck truck = new Truck();
        truck.horsePower = 1.0;
        truck.passengers = new ArrayList<Person>();
        truck.passengers.add(null);
        truck.passengers.add(null);
        truck.passengers.add(new Person("jesse" , 30));
        try {
            gson.toJson(truck, Truck.class);
        } catch (NullPointerException expected) {
        }
        String json = "{horsePower:1.0,passengers:[null,\'jesse,30\']}";
        try {
            gson.fromJson(json, Truck.class);
        } catch (JsonSyntaxException expected) {
        }
        gson = new GsonBuilder().registerTypeAdapter(Person.class, typeAdapter.nullSafe()).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2446,gson,2445,gson.toJson(truck, com.google.gson.functional.StreamingTypeAdaptersTest.Truck.class));
        truck = gson.fromJson(json, Truck.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2447,truck.horsePower);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2449,truck.passengers,2448,truck.passengers.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2450,truck.passengers.get(1).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSafe_add1439() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSafe_add1439");
        TypeAdapter<Person> typeAdapter = new TypeAdapter<Person>() {
            @Override
            public Person read(JsonReader in) throws IOException {
                String[] values = in.nextString().split(",");
                return new Person(values[0] , java.lang.Integer.parseInt(values[1]));
            }

            public void write(JsonWriter out, Person person) throws IOException {
                out.value((((person.name) + ",") + (person.age)));
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(Person.class, typeAdapter).create();
        Truck truck = new Truck();
        truck.horsePower = 1.0;
        truck.passengers = new ArrayList<Person>();
        truck.passengers.add(null);
        truck.passengers.add(new Person("jesse" , 30));
        truck.passengers.add(new Person("jesse" , 30));
        try {
            gson.toJson(truck, Truck.class);
        } catch (NullPointerException expected) {
        }
        String json = "{horsePower:1.0,passengers:[null,\'jesse,30\']}";
        try {
            gson.fromJson(json, Truck.class);
        } catch (JsonSyntaxException expected) {
        }
        gson = new GsonBuilder().registerTypeAdapter(Person.class, typeAdapter.nullSafe()).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2446,gson,2445,gson.toJson(truck, com.google.gson.functional.StreamingTypeAdaptersTest.Truck.class));
        truck = gson.fromJson(json, Truck.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2447,truck.horsePower);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2449,truck.passengers,2448,truck.passengers.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2450,truck.passengers.get(1).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSafe_add1440() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSafe_add1440");
        TypeAdapter<Person> typeAdapter = new TypeAdapter<Person>() {
            @Override
            public Person read(JsonReader in) throws IOException {
                String[] values = in.nextString().split(",");
                return new Person(values[0] , java.lang.Integer.parseInt(values[1]));
            }

            public void write(JsonWriter out, Person person) throws IOException {
                out.value((((person.name) + ",") + (person.age)));
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(Person.class, typeAdapter).create();
        Truck truck = new Truck();
        truck.horsePower = 1.0;
        truck.passengers = new ArrayList<Person>();
        truck.passengers.add(null);
        truck.passengers.add(new Person("jesse" , 30));
        try {
            gson.toJson(truck, Truck.class);
            gson.toJson(truck, Truck.class);
        } catch (NullPointerException expected) {
        }
        String json = "{horsePower:1.0,passengers:[null,\'jesse,30\']}";
        try {
            gson.fromJson(json, Truck.class);
        } catch (JsonSyntaxException expected) {
        }
        gson = new GsonBuilder().registerTypeAdapter(Person.class, typeAdapter.nullSafe()).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2446,gson,2445,gson.toJson(truck, com.google.gson.functional.StreamingTypeAdaptersTest.Truck.class));
        truck = gson.fromJson(json, Truck.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2447,truck.horsePower);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2449,truck.passengers,2448,truck.passengers.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2450,truck.passengers.get(1).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSafe_add1441() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSafe_add1441");
        TypeAdapter<Person> typeAdapter = new TypeAdapter<Person>() {
            @Override
            public Person read(JsonReader in) throws IOException {
                String[] values = in.nextString().split(",");
                return new Person(values[0] , java.lang.Integer.parseInt(values[1]));
            }

            public void write(JsonWriter out, Person person) throws IOException {
                out.value((((person.name) + ",") + (person.age)));
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(Person.class, typeAdapter).create();
        Truck truck = new Truck();
        truck.horsePower = 1.0;
        truck.passengers = new ArrayList<Person>();
        truck.passengers.add(null);
        truck.passengers.add(new Person("jesse" , 30));
        try {
            gson.toJson(truck, Truck.class);
        } catch (NullPointerException expected) {
        }
        String json = "{horsePower:1.0,passengers:[null,\'jesse,30\']}";
        try {
            gson.fromJson(json, Truck.class);
            gson.fromJson(json, Truck.class);
        } catch (JsonSyntaxException expected) {
        }
        gson = new GsonBuilder().registerTypeAdapter(Person.class, typeAdapter.nullSafe()).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2446,gson,2445,gson.toJson(truck, com.google.gson.functional.StreamingTypeAdaptersTest.Truck.class));
        truck = gson.fromJson(json, Truck.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2447,truck.horsePower);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2449,truck.passengers,2448,truck.passengers.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2450,truck.passengers.get(1).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullSafe() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSafe");
        TypeAdapter<Person> typeAdapter = new TypeAdapter<Person>() {
            @Override
            public Person read(JsonReader in) throws IOException {
                String[] values = in.nextString().split("foo");
                return new Person(values[0] , java.lang.Integer.parseInt(values[1]));
            }

            public void write(JsonWriter out, Person person) throws IOException {
                out.value((((person.name) + ",") + (person.age)));
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(Person.class, typeAdapter).create();
        Truck truck = new Truck();
        truck.horsePower = 1.0;
        truck.passengers = new ArrayList<Person>();
        truck.passengers.add(null);
        truck.passengers.add(new Person("jesse" , 30));
        try {
            gson.toJson(truck, Truck.class);
        } catch (NullPointerException expected) {
        }
        String json = "{horsePower:1.0,passengers:[null,\'jesse,30\']}";
        try {
            gson.fromJson(json, Truck.class);
        } catch (JsonSyntaxException expected) {
        }
        gson = new GsonBuilder().registerTypeAdapter(Person.class, typeAdapter.nullSafe()).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2446,gson,2445,gson.toJson(truck, com.google.gson.functional.StreamingTypeAdaptersTest.Truck.class));
        truck = gson.fromJson(json, Truck.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2447,truck.horsePower);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2449,truck.passengers,2448,truck.passengers.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2450,truck.passengers.get(1).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullSafe_literalMutation1963() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSafe_literalMutation1963");
        TypeAdapter<Person> typeAdapter = new TypeAdapter<Person>() {
            @Override
            public Person read(JsonReader in) throws IOException {
                String[] values = in.nextString().split(",");
                return new Person(values[-1] , java.lang.Integer.parseInt(values[1]));
            }

            public void write(JsonWriter out, Person person) throws IOException {
                out.value((((person.name) + ",") + (person.age)));
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(Person.class, typeAdapter).create();
        Truck truck = new Truck();
        truck.horsePower = 1.0;
        truck.passengers = new ArrayList<Person>();
        truck.passengers.add(null);
        truck.passengers.add(new Person("jesse" , 30));
        try {
            gson.toJson(truck, Truck.class);
        } catch (NullPointerException expected) {
        }
        String json = "{horsePower:1.0,passengers:[null,\'jesse,30\']}";
        try {
            gson.fromJson(json, Truck.class);
        } catch (JsonSyntaxException expected) {
        }
        gson = new GsonBuilder().registerTypeAdapter(Person.class, typeAdapter.nullSafe()).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2446,gson,2445,gson.toJson(truck, com.google.gson.functional.StreamingTypeAdaptersTest.Truck.class));
        truck = gson.fromJson(json, Truck.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2447,truck.horsePower);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2449,truck.passengers,2448,truck.passengers.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2450,truck.passengers.get(1).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullSafe_literalMutation1964() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSafe_literalMutation1964");
        TypeAdapter<Person> typeAdapter = new TypeAdapter<Person>() {
            @Override
            public Person read(JsonReader in) throws IOException {
                String[] values = in.nextString().split(",");
                return new Person(values[0] , java.lang.Integer.parseInt(values[2]));
            }

            public void write(JsonWriter out, Person person) throws IOException {
                out.value((((person.name) + ",") + (person.age)));
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(Person.class, typeAdapter).create();
        Truck truck = new Truck();
        truck.horsePower = 1.0;
        truck.passengers = new ArrayList<Person>();
        truck.passengers.add(null);
        truck.passengers.add(new Person("jesse" , 30));
        try {
            gson.toJson(truck, Truck.class);
        } catch (NullPointerException expected) {
        }
        String json = "{horsePower:1.0,passengers:[null,\'jesse,30\']}";
        try {
            gson.fromJson(json, Truck.class);
        } catch (JsonSyntaxException expected) {
        }
        gson = new GsonBuilder().registerTypeAdapter(Person.class, typeAdapter.nullSafe()).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2446,gson,2445,gson.toJson(truck, com.google.gson.functional.StreamingTypeAdaptersTest.Truck.class));
        truck = gson.fromJson(json, Truck.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2447,truck.horsePower);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2449,truck.passengers,2448,truck.passengers.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2450,truck.passengers.get(1).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullSafe_literalMutation1965() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSafe_literalMutation1965");
        TypeAdapter<Person> typeAdapter = new TypeAdapter<Person>() {
            @Override
            public Person read(JsonReader in) throws IOException {
                String[] values = in.nextString().split(",");
                return new Person(values[0] , java.lang.Integer.parseInt(values[1]));
            }

            public void write(JsonWriter out, Person person) throws IOException {
                out.value((((person.name) + "foo") + (person.age)));
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(Person.class, typeAdapter).create();
        Truck truck = new Truck();
        truck.horsePower = 1.0;
        truck.passengers = new ArrayList<Person>();
        truck.passengers.add(null);
        truck.passengers.add(new Person("jesse" , 30));
        try {
            gson.toJson(truck, Truck.class);
        } catch (NullPointerException expected) {
        }
        String json = "{horsePower:1.0,passengers:[null,\'jesse,30\']}";
        try {
            gson.fromJson(json, Truck.class);
        } catch (JsonSyntaxException expected) {
        }
        gson = new GsonBuilder().registerTypeAdapter(Person.class, typeAdapter.nullSafe()).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2446,gson,2445,gson.toJson(truck, com.google.gson.functional.StreamingTypeAdaptersTest.Truck.class));
        truck = gson.fromJson(json, Truck.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2447,truck.horsePower);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2449,truck.passengers,2448,truck.passengers.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2450,truck.passengers.get(1).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullSafe_literalMutation1966() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSafe_literalMutation1966");
        TypeAdapter<Person> typeAdapter = new TypeAdapter<Person>() {
            @Override
            public Person read(JsonReader in) throws IOException {
                String[] values = in.nextString().split(",");
                return new Person(values[0] , java.lang.Integer.parseInt(values[1]));
            }

            public void write(JsonWriter out, Person person) throws IOException {
                out.value((((person.name) + ",") + (person.age)));
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(Person.class, typeAdapter).create();
        Truck truck = new Truck();
        truck.horsePower = 0.0;
        truck.passengers = new ArrayList<Person>();
        truck.passengers.add(null);
        truck.passengers.add(new Person("jesse" , 30));
        try {
            gson.toJson(truck, Truck.class);
        } catch (NullPointerException expected) {
        }
        String json = "{horsePower:1.0,passengers:[null,\'jesse,30\']}";
        try {
            gson.fromJson(json, Truck.class);
        } catch (JsonSyntaxException expected) {
        }
        gson = new GsonBuilder().registerTypeAdapter(Person.class, typeAdapter.nullSafe()).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2446,gson,2445,gson.toJson(truck, com.google.gson.functional.StreamingTypeAdaptersTest.Truck.class));
        truck = gson.fromJson(json, Truck.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2447,truck.horsePower);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2449,truck.passengers,2448,truck.passengers.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2450,truck.passengers.get(1).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullSafe_literalMutation1968() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSafe_literalMutation1968");
        TypeAdapter<Person> typeAdapter = new TypeAdapter<Person>() {
            @Override
            public Person read(JsonReader in) throws IOException {
                String[] values = in.nextString().split(",");
                return new Person(values[0] , java.lang.Integer.parseInt(values[1]));
            }

            public void write(JsonWriter out, Person person) throws IOException {
                out.value((((person.name) + ",") + (person.age)));
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(Person.class, typeAdapter).create();
        Truck truck = new Truck();
        truck.horsePower = 1.0;
        truck.passengers = new ArrayList<Person>();
        truck.passengers.add(null);
        truck.passengers.add(new Person("foo" , 30));
        try {
            gson.toJson(truck, Truck.class);
        } catch (NullPointerException expected) {
        }
        String json = "{horsePower:1.0,passengers:[null,\'jesse,30\']}";
        try {
            gson.fromJson(json, Truck.class);
        } catch (JsonSyntaxException expected) {
        }
        gson = new GsonBuilder().registerTypeAdapter(Person.class, typeAdapter.nullSafe()).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2446,gson,2445,gson.toJson(truck, com.google.gson.functional.StreamingTypeAdaptersTest.Truck.class));
        truck = gson.fromJson(json, Truck.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2447,truck.horsePower);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2449,truck.passengers,2448,truck.passengers.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2450,truck.passengers.get(1).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullSafe_literalMutation1969() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSafe_literalMutation1969");
        TypeAdapter<Person> typeAdapter = new TypeAdapter<Person>() {
            @Override
            public Person read(JsonReader in) throws IOException {
                String[] values = in.nextString().split(",");
                return new Person(values[0] , java.lang.Integer.parseInt(values[1]));
            }

            public void write(JsonWriter out, Person person) throws IOException {
                out.value((((person.name) + ",") + (person.age)));
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(Person.class, typeAdapter).create();
        Truck truck = new Truck();
        truck.horsePower = 1.0;
        truck.passengers = new ArrayList<Person>();
        truck.passengers.add(null);
        truck.passengers.add(new Person("jesse" , 29));
        try {
            gson.toJson(truck, Truck.class);
        } catch (NullPointerException expected) {
        }
        String json = "{horsePower:1.0,passengers:[null,\'jesse,30\']}";
        try {
            gson.fromJson(json, Truck.class);
        } catch (JsonSyntaxException expected) {
        }
        gson = new GsonBuilder().registerTypeAdapter(Person.class, typeAdapter.nullSafe()).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2446,gson,2445,gson.toJson(truck, com.google.gson.functional.StreamingTypeAdaptersTest.Truck.class));
        truck = gson.fromJson(json, Truck.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2447,truck.horsePower);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2449,truck.passengers,2448,truck.passengers.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2450,truck.passengers.get(1).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullSafe_literalMutation1970() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSafe_literalMutation1970");
        TypeAdapter<Person> typeAdapter = new TypeAdapter<Person>() {
            @Override
            public Person read(JsonReader in) throws IOException {
                String[] values = in.nextString().split(",");
                return new Person(values[0] , java.lang.Integer.parseInt(values[1]));
            }

            public void write(JsonWriter out, Person person) throws IOException {
                out.value((((person.name) + ",") + (person.age)));
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(Person.class, typeAdapter).create();
        Truck truck = new Truck();
        truck.horsePower = 1.0;
        truck.passengers = new ArrayList<Person>();
        truck.passengers.add(null);
        truck.passengers.add(new Person("jesse" , 30));
        try {
            gson.toJson(truck, Truck.class);
        } catch (NullPointerException expected) {
        }
        String json = "foo";
        try {
            gson.fromJson(json, Truck.class);
        } catch (JsonSyntaxException expected) {
        }
        gson = new GsonBuilder().registerTypeAdapter(Person.class, typeAdapter.nullSafe()).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2446,gson,2445,gson.toJson(truck, com.google.gson.functional.StreamingTypeAdaptersTest.Truck.class));
        truck = gson.fromJson(json, Truck.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2447,truck.horsePower);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2449,truck.passengers,2448,truck.passengers.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2450,truck.passengers.get(1).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSafe_remove1188() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSafe_remove1188");
        TypeAdapter<Person> typeAdapter = new TypeAdapter<Person>() {
            @Override
            public Person read(JsonReader in) throws IOException {
                String[] values = in.nextString().split(",");
                return new Person(values[0] , java.lang.Integer.parseInt(values[1]));
            }

            public void write(JsonWriter out, Person person) throws IOException {
                out.value((((person.name) + ",") + (person.age)));
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(Person.class, typeAdapter).create();
        Truck truck = new Truck();
        truck.horsePower = 1.0;
        truck.passengers = new ArrayList<Person>();
        truck.passengers.add(null);
        truck.passengers.add(new Person("jesse" , 30));
        try {
            gson.toJson(truck, Truck.class);
        } catch (NullPointerException expected) {
        }
        String json = "{horsePower:1.0,passengers:[null,\'jesse,30\']}";
        try {
            gson.fromJson(json, Truck.class);
        } catch (JsonSyntaxException expected) {
        }
        gson = new GsonBuilder().registerTypeAdapter(Person.class, typeAdapter.nullSafe()).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2446,gson,2445,gson.toJson(truck, com.google.gson.functional.StreamingTypeAdaptersTest.Truck.class));
        truck = gson.fromJson(json, Truck.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2447,truck.horsePower);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2449,truck.passengers,2448,truck.passengers.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2450,truck.passengers.get(1).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSafe_remove1189() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSafe_remove1189");
        TypeAdapter<Person> typeAdapter = new TypeAdapter<Person>() {
            @Override
            public Person read(JsonReader in) throws IOException {
                String[] values = in.nextString().split(",");
                return new Person(values[0] , java.lang.Integer.parseInt(values[1]));
            }

            public void write(JsonWriter out, Person person) throws IOException {
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(Person.class, typeAdapter).create();
        Truck truck = new Truck();
        truck.horsePower = 1.0;
        truck.passengers = new ArrayList<Person>();
        truck.passengers.add(null);
        truck.passengers.add(new Person("jesse" , 30));
        try {
            gson.toJson(truck, Truck.class);
        } catch (NullPointerException expected) {
        }
        String json = "{horsePower:1.0,passengers:[null,\'jesse,30\']}";
        try {
            gson.fromJson(json, Truck.class);
        } catch (JsonSyntaxException expected) {
        }
        gson = new GsonBuilder().registerTypeAdapter(Person.class, typeAdapter.nullSafe()).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2446,gson,2445,gson.toJson(truck, com.google.gson.functional.StreamingTypeAdaptersTest.Truck.class));
        truck = gson.fromJson(json, Truck.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2447,truck.horsePower);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2449,truck.passengers,2448,truck.passengers.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2450,truck.passengers.get(1).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSafe_remove1190() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSafe_remove1190");
        TypeAdapter<Person> typeAdapter = new TypeAdapter<Person>() {
            @Override
            public Person read(JsonReader in) throws IOException {
                String[] values = in.nextString().split(",");
                return new Person(values[0] , java.lang.Integer.parseInt(values[1]));
            }

            public void write(JsonWriter out, Person person) throws IOException {
                out.value((((person.name) + ",") + (person.age)));
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(Person.class, typeAdapter).create();
        Truck truck = new Truck();
        truck.horsePower = 1.0;
        truck.passengers = new ArrayList<Person>();
        truck.passengers.add(new Person("jesse" , 30));
        try {
            gson.toJson(truck, Truck.class);
        } catch (NullPointerException expected) {
        }
        String json = "{horsePower:1.0,passengers:[null,\'jesse,30\']}";
        try {
            gson.fromJson(json, Truck.class);
        } catch (JsonSyntaxException expected) {
        }
        gson = new GsonBuilder().registerTypeAdapter(Person.class, typeAdapter.nullSafe()).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2446,gson,2445,gson.toJson(truck, com.google.gson.functional.StreamingTypeAdaptersTest.Truck.class));
        truck = gson.fromJson(json, Truck.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2447,truck.horsePower);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2449,truck.passengers,2448,truck.passengers.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2450,truck.passengers.get(1).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSafe_remove1191() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSafe_remove1191");
        TypeAdapter<Person> typeAdapter = new TypeAdapter<Person>() {
            @Override
            public Person read(JsonReader in) throws IOException {
                String[] values = in.nextString().split(",");
                return new Person(values[0] , java.lang.Integer.parseInt(values[1]));
            }

            public void write(JsonWriter out, Person person) throws IOException {
                out.value((((person.name) + ",") + (person.age)));
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(Person.class, typeAdapter).create();
        Truck truck = new Truck();
        truck.horsePower = 1.0;
        truck.passengers = new ArrayList<Person>();
        truck.passengers.add(new Person("jesse" , 30));
        try {
            gson.toJson(truck, Truck.class);
        } catch (NullPointerException expected) {
        }
        String json = "{horsePower:1.0,passengers:[null,\'jesse,30\']}";
        try {
            gson.fromJson(json, Truck.class);
        } catch (JsonSyntaxException expected) {
        }
        gson = new GsonBuilder().registerTypeAdapter(Person.class, typeAdapter.nullSafe()).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2446,gson,2445,gson.toJson(truck, com.google.gson.functional.StreamingTypeAdaptersTest.Truck.class));
        truck = gson.fromJson(json, Truck.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2447,truck.horsePower);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2449,truck.passengers,2448,truck.passengers.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2450,truck.passengers.get(1).name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeRecursive() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeRecursive");
        TypeAdapter<Node> nodeAdapter = miniGson.getAdapter(Node.class);
        Node root = new Node("foo");
        root.left = new Node("left");
        root.right = new Node("right");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2461,("{\'label\':\'root\'," + ("\'left\':{\'label\':\'left\',\'left\':null,\'right\':null}," + "\'right\':{\'label\':\'right\',\'left\':null,\'right\':null}}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2463,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(nodeAdapter, root),2462,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(nodeAdapter, root).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeRecursive_literalMutation1986() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeRecursive_literalMutation1986");
        TypeAdapter<Node> nodeAdapter = miniGson.getAdapter(Node.class);
        Node root = new Node("root");
        root.left = new Node("foo");
        root.right = new Node("right");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2461,("{\'label\':\'root\'," + ("\'left\':{\'label\':\'left\',\'left\':null,\'right\':null}," + "\'right\':{\'label\':\'right\',\'left\':null,\'right\':null}}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2463,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(nodeAdapter, root),2462,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(nodeAdapter, root).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeRecursive_literalMutation1987() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeRecursive_literalMutation1987");
        TypeAdapter<Node> nodeAdapter = miniGson.getAdapter(Node.class);
        Node root = new Node("root");
        root.left = new Node("left");
        root.right = new Node("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2461,("{\'label\':\'root\'," + ("\'left\':{\'label\':\'left\',\'left\':null,\'right\':null}," + "\'right\':{\'label\':\'right\',\'left\':null,\'right\':null}}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2463,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(nodeAdapter, root),2462,com.google.gson.functional.StreamingTypeAdaptersTest.toJson(nodeAdapter, root).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFromJsonTree_add1431() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFromJsonTree_add1431");
        JsonObject truckObject = new JsonObject();
        truckObject.add("horsePower", new com.google.gson.JsonPrimitive(300));
        truckObject.add("horsePower", new com.google.gson.JsonPrimitive(300));
        JsonArray passengersArray = new JsonArray();
        JsonObject jesseObject = new JsonObject();
        jesseObject.add("age", new com.google.gson.JsonPrimitive(30));
        jesseObject.add("name", new com.google.gson.JsonPrimitive("Jesse"));
        passengersArray.add(jesseObject);
        truckObject.add("passengers", passengersArray);
        Truck truck = truckAdapter.fromJsonTree(truckObject);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2441,truck.horsePower);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2443,null,2442,java.util.Arrays.asList(new com.google.gson.functional.StreamingTypeAdaptersTest.Person("Jesse" , 30)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2444,truck.passengers);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFromJsonTree_add1432() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFromJsonTree_add1432");
        JsonObject truckObject = new JsonObject();
        truckObject.add("horsePower", new com.google.gson.JsonPrimitive(300));
        JsonArray passengersArray = new JsonArray();
        JsonObject jesseObject = new JsonObject();
        jesseObject.add("age", new com.google.gson.JsonPrimitive(30));
        jesseObject.add("age", new com.google.gson.JsonPrimitive(30));
        jesseObject.add("name", new com.google.gson.JsonPrimitive("Jesse"));
        passengersArray.add(jesseObject);
        truckObject.add("passengers", passengersArray);
        Truck truck = truckAdapter.fromJsonTree(truckObject);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2441,truck.horsePower);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2443,null,2442,java.util.Arrays.asList(new com.google.gson.functional.StreamingTypeAdaptersTest.Person("Jesse" , 30)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2444,truck.passengers);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFromJsonTree_add1433() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFromJsonTree_add1433");
        JsonObject truckObject = new JsonObject();
        truckObject.add("horsePower", new com.google.gson.JsonPrimitive(300));
        JsonArray passengersArray = new JsonArray();
        JsonObject jesseObject = new JsonObject();
        jesseObject.add("age", new com.google.gson.JsonPrimitive(30));
        jesseObject.add("name", new com.google.gson.JsonPrimitive("Jesse"));
        jesseObject.add("name", new com.google.gson.JsonPrimitive("Jesse"));
        passengersArray.add(jesseObject);
        truckObject.add("passengers", passengersArray);
        Truck truck = truckAdapter.fromJsonTree(truckObject);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2441,truck.horsePower);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2443,null,2442,java.util.Arrays.asList(new com.google.gson.functional.StreamingTypeAdaptersTest.Person("Jesse" , 30)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2444,truck.passengers);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFromJsonTree_add1434() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFromJsonTree_add1434");
        JsonObject truckObject = new JsonObject();
        truckObject.add("horsePower", new com.google.gson.JsonPrimitive(300));
        JsonArray passengersArray = new JsonArray();
        JsonObject jesseObject = new JsonObject();
        jesseObject.add("age", new com.google.gson.JsonPrimitive(30));
        jesseObject.add("name", new com.google.gson.JsonPrimitive("Jesse"));
        passengersArray.add(jesseObject);
        passengersArray.add(jesseObject);
        truckObject.add("passengers", passengersArray);
        Truck truck = truckAdapter.fromJsonTree(truckObject);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2441,truck.horsePower);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2443,null,2442,java.util.Arrays.asList(new com.google.gson.functional.StreamingTypeAdaptersTest.Person("Jesse" , 30)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2444,truck.passengers);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFromJsonTree_add1435() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFromJsonTree_add1435");
        JsonObject truckObject = new JsonObject();
        truckObject.add("horsePower", new com.google.gson.JsonPrimitive(300));
        JsonArray passengersArray = new JsonArray();
        JsonObject jesseObject = new JsonObject();
        jesseObject.add("age", new com.google.gson.JsonPrimitive(30));
        jesseObject.add("name", new com.google.gson.JsonPrimitive("Jesse"));
        passengersArray.add(jesseObject);
        truckObject.add("passengers", passengersArray);
        truckObject.add("passengers", passengersArray);
        Truck truck = truckAdapter.fromJsonTree(truckObject);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2441,truck.horsePower);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2443,null,2442,java.util.Arrays.asList(new com.google.gson.functional.StreamingTypeAdaptersTest.Person("Jesse" , 30)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2444,truck.passengers);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFromJsonTree() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFromJsonTree");
        JsonObject truckObject = new JsonObject();
        truckObject.add("foo", new com.google.gson.JsonPrimitive(300));
        JsonArray passengersArray = new JsonArray();
        JsonObject jesseObject = new JsonObject();
        jesseObject.add("age", new com.google.gson.JsonPrimitive(30));
        jesseObject.add("name", new com.google.gson.JsonPrimitive("Jesse"));
        passengersArray.add(jesseObject);
        truckObject.add("passengers", passengersArray);
        Truck truck = truckAdapter.fromJsonTree(truckObject);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2441,truck.horsePower);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2443,null,2442,java.util.Arrays.asList(new com.google.gson.functional.StreamingTypeAdaptersTest.Person("Jesse" , 30)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2444,truck.passengers);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFromJsonTree_literalMutation1956() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFromJsonTree_literalMutation1956");
        JsonObject truckObject = new JsonObject();
        truckObject.add("horsePower", new com.google.gson.JsonPrimitive(301));
        JsonArray passengersArray = new JsonArray();
        JsonObject jesseObject = new JsonObject();
        jesseObject.add("age", new com.google.gson.JsonPrimitive(30));
        jesseObject.add("name", new com.google.gson.JsonPrimitive("Jesse"));
        passengersArray.add(jesseObject);
        truckObject.add("passengers", passengersArray);
        Truck truck = truckAdapter.fromJsonTree(truckObject);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2441,truck.horsePower);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2443,null,2442,java.util.Arrays.asList(new com.google.gson.functional.StreamingTypeAdaptersTest.Person("Jesse" , 30)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2444,truck.passengers);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFromJsonTree_literalMutation1957() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFromJsonTree_literalMutation1957");
        JsonObject truckObject = new JsonObject();
        truckObject.add("horsePower", new com.google.gson.JsonPrimitive(300));
        JsonArray passengersArray = new JsonArray();
        JsonObject jesseObject = new JsonObject();
        jesseObject.add("foo", new com.google.gson.JsonPrimitive(30));
        jesseObject.add("name", new com.google.gson.JsonPrimitive("Jesse"));
        passengersArray.add(jesseObject);
        truckObject.add("passengers", passengersArray);
        Truck truck = truckAdapter.fromJsonTree(truckObject);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2441,truck.horsePower);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2443,null,2442,java.util.Arrays.asList(new com.google.gson.functional.StreamingTypeAdaptersTest.Person("Jesse" , 30)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2444,truck.passengers);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFromJsonTree_literalMutation1958() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFromJsonTree_literalMutation1958");
        JsonObject truckObject = new JsonObject();
        truckObject.add("horsePower", new com.google.gson.JsonPrimitive(300));
        JsonArray passengersArray = new JsonArray();
        JsonObject jesseObject = new JsonObject();
        jesseObject.add("age", new com.google.gson.JsonPrimitive(31));
        jesseObject.add("name", new com.google.gson.JsonPrimitive("Jesse"));
        passengersArray.add(jesseObject);
        truckObject.add("passengers", passengersArray);
        Truck truck = truckAdapter.fromJsonTree(truckObject);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2441,truck.horsePower);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2443,null,2442,java.util.Arrays.asList(new com.google.gson.functional.StreamingTypeAdaptersTest.Person("Jesse" , 30)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2444,truck.passengers);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFromJsonTree_literalMutation1959() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFromJsonTree_literalMutation1959");
        JsonObject truckObject = new JsonObject();
        truckObject.add("horsePower", new com.google.gson.JsonPrimitive(300));
        JsonArray passengersArray = new JsonArray();
        JsonObject jesseObject = new JsonObject();
        jesseObject.add("age", new com.google.gson.JsonPrimitive(30));
        jesseObject.add("foo", new com.google.gson.JsonPrimitive("Jesse"));
        passengersArray.add(jesseObject);
        truckObject.add("passengers", passengersArray);
        Truck truck = truckAdapter.fromJsonTree(truckObject);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2441,truck.horsePower);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2443,null,2442,java.util.Arrays.asList(new com.google.gson.functional.StreamingTypeAdaptersTest.Person("Jesse" , 30)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2444,truck.passengers);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFromJsonTree_literalMutation1960() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFromJsonTree_literalMutation1960");
        JsonObject truckObject = new JsonObject();
        truckObject.add("horsePower", new com.google.gson.JsonPrimitive(300));
        JsonArray passengersArray = new JsonArray();
        JsonObject jesseObject = new JsonObject();
        jesseObject.add("age", new com.google.gson.JsonPrimitive(30));
        jesseObject.add("name", new com.google.gson.JsonPrimitive("foo"));
        passengersArray.add(jesseObject);
        truckObject.add("passengers", passengersArray);
        Truck truck = truckAdapter.fromJsonTree(truckObject);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2441,truck.horsePower);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2443,null,2442,java.util.Arrays.asList(new com.google.gson.functional.StreamingTypeAdaptersTest.Person("Jesse" , 30)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2444,truck.passengers);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFromJsonTree_literalMutation1961() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFromJsonTree_literalMutation1961");
        JsonObject truckObject = new JsonObject();
        truckObject.add("horsePower", new com.google.gson.JsonPrimitive(300));
        JsonArray passengersArray = new JsonArray();
        JsonObject jesseObject = new JsonObject();
        jesseObject.add("age", new com.google.gson.JsonPrimitive(30));
        jesseObject.add("name", new com.google.gson.JsonPrimitive("Jesse"));
        passengersArray.add(jesseObject);
        truckObject.add("foo", passengersArray);
        Truck truck = truckAdapter.fromJsonTree(truckObject);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2441,truck.horsePower);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2443,null,2442,java.util.Arrays.asList(new com.google.gson.functional.StreamingTypeAdaptersTest.Person("Jesse" , 30)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2444,truck.passengers);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFromJsonTree_remove1183() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFromJsonTree_remove1183");
        JsonObject truckObject = new JsonObject();
        JsonArray passengersArray = new JsonArray();
        JsonObject jesseObject = new JsonObject();
        jesseObject.add("age", new com.google.gson.JsonPrimitive(30));
        jesseObject.add("name", new com.google.gson.JsonPrimitive("Jesse"));
        passengersArray.add(jesseObject);
        truckObject.add("passengers", passengersArray);
        Truck truck = truckAdapter.fromJsonTree(truckObject);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2441,truck.horsePower);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2443,null,2442,java.util.Arrays.asList(new com.google.gson.functional.StreamingTypeAdaptersTest.Person("Jesse" , 30)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2444,truck.passengers);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFromJsonTree_remove1184() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFromJsonTree_remove1184");
        JsonObject truckObject = new JsonObject();
        JsonArray passengersArray = new JsonArray();
        JsonObject jesseObject = new JsonObject();
        jesseObject.add("age", new com.google.gson.JsonPrimitive(30));
        jesseObject.add("name", new com.google.gson.JsonPrimitive("Jesse"));
        passengersArray.add(jesseObject);
        truckObject.add("passengers", passengersArray);
        Truck truck = truckAdapter.fromJsonTree(truckObject);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2441,truck.horsePower);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2443,null,2442,java.util.Arrays.asList(new com.google.gson.functional.StreamingTypeAdaptersTest.Person("Jesse" , 30)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2444,truck.passengers);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFromJsonTree_remove1185() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFromJsonTree_remove1185");
        JsonObject truckObject = new JsonObject();
        JsonArray passengersArray = new JsonArray();
        JsonObject jesseObject = new JsonObject();
        jesseObject.add("age", new com.google.gson.JsonPrimitive(30));
        jesseObject.add("name", new com.google.gson.JsonPrimitive("Jesse"));
        passengersArray.add(jesseObject);
        truckObject.add("passengers", passengersArray);
        Truck truck = truckAdapter.fromJsonTree(truckObject);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2441,truck.horsePower);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2443,null,2442,java.util.Arrays.asList(new com.google.gson.functional.StreamingTypeAdaptersTest.Person("Jesse" , 30)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2444,truck.passengers);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFromJsonTree_remove1186() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFromJsonTree_remove1186");
        JsonObject truckObject = new JsonObject();
        truckObject.add("horsePower", new com.google.gson.JsonPrimitive(300));
        JsonArray passengersArray = new JsonArray();
        JsonObject jesseObject = new JsonObject();
        jesseObject.add("age", new com.google.gson.JsonPrimitive(30));
        jesseObject.add("name", new com.google.gson.JsonPrimitive("Jesse"));
        truckObject.add("passengers", passengersArray);
        Truck truck = truckAdapter.fromJsonTree(truckObject);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2441,truck.horsePower);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2443,null,2442,java.util.Arrays.asList(new com.google.gson.functional.StreamingTypeAdaptersTest.Person("Jesse" , 30)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2444,truck.passengers);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFromJsonTree_remove1187() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFromJsonTree_remove1187");
        JsonObject truckObject = new JsonObject();
        JsonArray passengersArray = new JsonArray();
        JsonObject jesseObject = new JsonObject();
        jesseObject.add("age", new com.google.gson.JsonPrimitive(30));
        jesseObject.add("name", new com.google.gson.JsonPrimitive("Jesse"));
        passengersArray.add(jesseObject);
        truckObject.add("passengers", passengersArray);
        Truck truck = truckAdapter.fromJsonTree(truckObject);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2441,truck.horsePower);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2443,null,2442,java.util.Arrays.asList(new com.google.gson.functional.StreamingTypeAdaptersTest.Person("Jesse" , 30)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2444,truck.passengers);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    static class Truck {
        double horsePower;

        List<Person> passengers = java.util.Collections.emptyList();
    }

    static class Person {
        int age;

        String name;

        Person(String name ,int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            return ((o instanceof Person) && (((Person)(o)).name.equals(name))) && ((((Person)(o)).age) == (age));
        }

        @Override
        public int hashCode() {
            return (name.hashCode()) ^ (age);
        }
    }

    static class Node {
        String label;

        Node left;

        Node right;

        Node(String label) {
            this.label = label;
        }
    }

    private static <T>String toJson(TypeAdapter<T> typeAdapter, T value) throws IOException {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        typeAdapter.write(writer, value);
        return stringWriter.toString();
    }

    private <T>T fromJson(TypeAdapter<T> typeAdapter, String json) throws IOException {
        JsonReader reader = new JsonReader(new StringReader(json));
        reader.setLenient(true);
        return typeAdapter.read(reader);
    }
}


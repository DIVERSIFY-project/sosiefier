package com.google.gson;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.junit.Test;
import junit.framework.TestCase;
import java.lang.reflect.Type;

/** 
 * Contains numerous tests involving registered type converters with a Gson instance.
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class GsonTypeAdapterTest extends TestCase {
    private Gson gson;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        gson = new GsonBuilder().registerTypeAdapter(AtomicLong.class, new ExceptionTypeAdapter()).registerTypeAdapter(AtomicInteger.class, new AtomicIntegerTypeAdapter()).create();
    }

    @Test(timeout = 1000)
    public void testDefaultTypeAdapterThrowsParseException_add1535() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultTypeAdapterThrowsParseException_add1535");
        try {
            gson.fromJson("{\"abc\":123}", java.math.BigInteger.class);
            gson.fromJson("{\"abc\":123}", java.math.BigInteger.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultTypeAdapterThrowsParseException() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultTypeAdapterThrowsParseException");
        try {
            gson.fromJson("foo", java.math.BigInteger.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTypeAdapterThrowsException_add1544() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeAdapterThrowsException_add1544");
        try {
            gson.toJson(new AtomicLong(0));
            gson.toJson(new AtomicLong(0));
        } catch (IllegalStateException expected) {
        }
        try {
            gson.fromJson("123", AtomicLong.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTypeAdapterThrowsException_add1545() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeAdapterThrowsException_add1545");
        try {
            gson.toJson(new AtomicLong(0));
        } catch (IllegalStateException expected) {
        }
        try {
            gson.fromJson("123", AtomicLong.class);
            gson.fromJson("123", AtomicLong.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypeAdapterThrowsException() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeAdapterThrowsException");
        try {
            gson.toJson(new AtomicLong(1));
        } catch (IllegalStateException expected) {
        }
        try {
            gson.fromJson("123", AtomicLong.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypeAdapterThrowsException_literalMutation2252() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeAdapterThrowsException_literalMutation2252");
        try {
            gson.toJson(new AtomicLong(0));
        } catch (IllegalStateException expected) {
        }
        try {
            gson.fromJson("foo", AtomicLong.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypeAdapterProperlyConvertsTypes() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeAdapterProperlyConvertsTypes");
        int intialValue = 2;
        AtomicInteger atomicInt = new AtomicInteger(intialValue);
        String json = gson.toJson(atomicInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2756,(intialValue + 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,null,2757,java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, AtomicInteger.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2759,intialValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2761,atomicInt,2760,atomicInt.get());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypeAdapterDoesNotAffectNonAdaptedTypes() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeAdapterDoesNotAffectNonAdaptedTypes");
        String expected = "foo";
        String actual = gson.toJson(expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2752,(("\"" + expected) + "\""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2753,actual);
        actual = gson.fromJson(actual, String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2754,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2755,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static class ExceptionTypeAdapter implements JsonDeserializer<java.util.concurrent.atomic.AtomicLong> , JsonSerializer<java.util.concurrent.atomic.AtomicLong> {
        public JsonElement serialize(AtomicLong src, Type typeOfSrc, JsonSerializationContext context) {
            throw new IllegalStateException();
        }

        public AtomicLong deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            throw new IllegalStateException();
        }
    }

    private static class AtomicIntegerTypeAdapter implements JsonDeserializer<java.util.concurrent.atomic.AtomicInteger> , JsonSerializer<java.util.concurrent.atomic.AtomicInteger> {
        public JsonElement serialize(AtomicInteger src, Type typeOfSrc, JsonSerializationContext context) {
            return new JsonPrimitive(src.incrementAndGet());
        }

        public AtomicInteger deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            int intValue = json.getAsInt();
            return new AtomicInteger(--intValue);
        }
    }

    abstract static class Abstract {
        String a;
    }

    static class Concrete extends Abstract {
        String b;
    }

    @Test(timeout = 1000)
    public void testDeserializerForAbstractClass_add1536() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_add1536");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializerForAbstractClass_add1537() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_add1537");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializerForAbstractClass_add1538() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_add1538");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializerForAbstractClass_add1539() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_add1539");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializerForAbstractClass_add1540() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_add1540");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializerForAbstractClass_add1541() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_add1541");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializerForAbstractClass_add1542() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_add1542");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializerForAbstractClass_add1543() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_add1543");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializerForAbstractClass() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass");
        Concrete instance = new Concrete();
        instance.a = "foo";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializerForAbstractClass_literalMutation2224() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_literalMutation2224");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "foo";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializerForAbstractClass_literalMutation2225() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_literalMutation2225");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("foo", Abstract.class, true, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializerForAbstractClass_literalMutation2226() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_literalMutation2226");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializerForAbstractClass_literalMutation2227() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_literalMutation2227");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializerForAbstractClass_literalMutation2228() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_literalMutation2228");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, true, instance);
        assertSerialized("foo", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializerForAbstractClass_literalMutation2229() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_literalMutation2229");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializerForAbstractClass_literalMutation2230() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_literalMutation2230");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializerForAbstractClass_literalMutation2231() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_literalMutation2231");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("foo", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializerForAbstractClass_literalMutation2232() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_literalMutation2232");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializerForAbstractClass_literalMutation2233() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_literalMutation2233");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializerForAbstractClass_literalMutation2234() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_literalMutation2234");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("foo", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializerForAbstractClass_literalMutation2235() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_literalMutation2235");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializerForAbstractClass_literalMutation2236() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_literalMutation2236");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializerForAbstractClass_literalMutation2237() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_literalMutation2237");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("foo", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializerForAbstractClass_literalMutation2238() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_literalMutation2238");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializerForAbstractClass_literalMutation2239() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_literalMutation2239");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializerForAbstractClass_literalMutation2240() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_literalMutation2240");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("foo", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializerForAbstractClass_literalMutation2241() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_literalMutation2241");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializerForAbstractClass_literalMutation2242() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_literalMutation2242");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializerForAbstractClass_literalMutation2243() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_literalMutation2243");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("foo", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializerForAbstractClass_literalMutation2244() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_literalMutation2244");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializerForAbstractClass_literalMutation2245() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_literalMutation2245");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializerForAbstractClass_literalMutation2246() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_literalMutation2246");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("foo", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializerForAbstractClass_literalMutation2247() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_literalMutation2247");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializerForAbstractClass_literalMutation2248() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_literalMutation2248");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializerForAbstractClass_remove1256() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_remove1256");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializerForAbstractClass_remove1257() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_remove1257");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializerForAbstractClass_remove1258() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_remove1258");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializerForAbstractClass_remove1259() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_remove1259");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializerForAbstractClass_remove1260() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_remove1260");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializerForAbstractClass_remove1261() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_remove1261");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializerForAbstractClass_remove1262() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_remove1262");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializerForAbstractClass_remove1263() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializerForAbstractClass_remove1263");
        Concrete instance = new Concrete();
        instance.a = "android";
        instance.b = "beep";
        assertSerialized("{\"a\":\"android\"}", Abstract.class, true, false, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, true, instance);
        assertSerialized("{\"a\":\"android\"}", Abstract.class, false, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, true, false, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, true, instance);
        assertSerialized("{\"b\":\"beep\",\"a\":\"android\"}", Concrete.class, false, false, instance);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void assertSerialized(String expected, Class<?> instanceType, boolean registerAbstractDeserializer, boolean registerAbstractHierarchyDeserializer, Object instance) {
        JsonDeserializer<Abstract> deserializer = new JsonDeserializer<Abstract>() {
            public Abstract deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                throw new AssertionError();
            }
        };
        GsonBuilder builder = new GsonBuilder();
        if (registerAbstractDeserializer) {
            builder.registerTypeAdapter(Abstract.class, deserializer);
        } 
        if (registerAbstractHierarchyDeserializer) {
            builder.registerTypeHierarchyAdapter(Abstract.class, deserializer);
        } 
        Gson gson = builder.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2749,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2751,gson,2750,gson.toJson(instance, instanceType));
    }
}


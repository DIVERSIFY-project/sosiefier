package com.google.gson;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.junit.Test;
import junit.framework.TestCase;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;

/** 
 * Check that Gson doesn't return non-serializable data types.
 * 
 * @author Jesse Wilson
 */
public final class JavaSerializationTest extends TestCase {
    private final Gson gson = new Gson();

    @Test(timeout = 1000)
    public void testMapIsSerializable_add1547() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIsSerializable_add1547");
        Type type = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        Map<java.lang.String, java.lang.Integer> map = gson.fromJson("{\"b\":1,\"c\":2,\"a\":3}", type);
        Map<java.lang.String, java.lang.Integer> serialized = serializedCopy(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2772,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2773,serialized);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2775,null,2774,java.util.Arrays.asList("b", "c", "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2776,new java.util.ArrayList<java.lang.String>(serialized.keySet()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapIsSerializable() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIsSerializable");
        Type type = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        Map<java.lang.String, java.lang.Integer> map = gson.fromJson("foo", type);
        Map<java.lang.String, java.lang.Integer> serialized = serializedCopy(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2772,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2773,serialized);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2775,null,2774,java.util.Arrays.asList("b", "c", "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2776,new java.util.ArrayList<java.lang.String>(serialized.keySet()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIsSerializable_remove1265() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIsSerializable_remove1265");
        Type type = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        Map<java.lang.String, java.lang.Integer> map = gson.fromJson("{\"b\":1,\"c\":2,\"a\":3}", type);
        Map<java.lang.String, java.lang.Integer> serialized = serializedCopy(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2772,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2773,serialized);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2775,null,2774,java.util.Arrays.asList("b", "c", "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2776,new java.util.ArrayList<java.lang.String>(serialized.keySet()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testListIsSerializable_add1546() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIsSerializable_add1546");
        Type type = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        List<java.lang.String> list = gson.fromJson("[\"a\",\"b\",\"c\"]", type);
        List<java.lang.String> serialized = serializedCopy(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2770,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2771,serialized);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testListIsSerializable() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIsSerializable");
        Type type = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        List<java.lang.String> list = gson.fromJson("foo", type);
        List<java.lang.String> serialized = serializedCopy(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2770,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2771,serialized);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testListIsSerializable_remove1264() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIsSerializable_remove1264");
        Type type = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        List<java.lang.String> list = gson.fromJson("[\"a\",\"b\",\"c\"]", type);
        List<java.lang.String> serialized = serializedCopy(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2770,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2771,serialized);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNumberIsSerializable_add1548() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumberIsSerializable_add1548");
        Type type = new TypeToken<java.util.List<java.lang.Number>>() {        }.getType();
        List<java.lang.Number> list = gson.fromJson("[1,3.14,6.673e-11]", type);
        List<java.lang.Number> serialized = serializedCopy(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2778,serialized.get(0),2777,serialized.get(0).doubleValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2780,serialized.get(1),2779,serialized.get(1).doubleValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2782,serialized.get(2),2781,serialized.get(2).doubleValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNumberIsSerializable() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumberIsSerializable");
        Type type = new TypeToken<java.util.List<java.lang.Number>>() {        }.getType();
        List<java.lang.Number> list = gson.fromJson("foo", type);
        List<java.lang.Number> serialized = serializedCopy(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2778,serialized.get(0),2777,serialized.get(0).doubleValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2780,serialized.get(1),2779,serialized.get(1).doubleValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2782,serialized.get(2),2781,serialized.get(2).doubleValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNumberIsSerializable_remove1266() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumberIsSerializable_remove1266");
        Type type = new TypeToken<java.util.List<java.lang.Number>>() {        }.getType();
        List<java.lang.Number> list = gson.fromJson("[1,3.14,6.673e-11]", type);
        List<java.lang.Number> serialized = serializedCopy(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2778,serialized.get(0),2777,serialized.get(0).doubleValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2780,serialized.get(1),2779,serialized.get(1).doubleValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2782,serialized.get(2),2781,serialized.get(2).doubleValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    private <T>T serializedCopy(T object) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bytesOut = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bytesOut);
        out.writeObject(object);
        out.close();
        ByteArrayInputStream bytesIn = new ByteArrayInputStream(bytesOut.toByteArray());
        ObjectInputStream in = new ObjectInputStream(bytesIn);
        return ((T)(in.readObject()));
    }
}


package com.google.gson.functional;

import java.util.ArrayList;
import java.util.Collection;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Test;
import junit.framework.TestCase;
import com.google.gson.common.TestTypes;

/** 
 * Functional tests related to circular reference detection and error reporting.
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class CircularReferenceTest extends TestCase {
    private Gson gson;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        gson = new Gson();
    }

    @Test(timeout = 1000)
    public void testCircularSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCircularSerialization");
        ContainsReferenceToSelfType a = new ContainsReferenceToSelfType();
        ContainsReferenceToSelfType b = new ContainsReferenceToSelfType();
        a.children.add(b);
        a.children.add(b);
        b.children.add(a);
        try {
            gson.toJson(a);
        } catch (StackOverflowError expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCircularSerialization_add934() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCircularSerialization_add934");
        ContainsReferenceToSelfType a = new ContainsReferenceToSelfType();
        ContainsReferenceToSelfType b = new ContainsReferenceToSelfType();
        a.children.add(b);
        b.children.add(a);
        b.children.add(a);
        try {
            gson.toJson(a);
        } catch (StackOverflowError expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCircularSerialization_add935() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCircularSerialization_add935");
        ContainsReferenceToSelfType a = new ContainsReferenceToSelfType();
        ContainsReferenceToSelfType b = new ContainsReferenceToSelfType();
        a.children.add(b);
        b.children.add(a);
        try {
            gson.toJson(a);
            gson.toJson(a);
        } catch (StackOverflowError expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCircularSerialization_remove770() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCircularSerialization_remove770");
        ContainsReferenceToSelfType a = new ContainsReferenceToSelfType();
        ContainsReferenceToSelfType b = new ContainsReferenceToSelfType();
        b.children.add(a);
        try {
            gson.toJson(a);
        } catch (StackOverflowError expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCircularSerialization_remove771() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCircularSerialization_remove771");
        ContainsReferenceToSelfType a = new ContainsReferenceToSelfType();
        ContainsReferenceToSelfType b = new ContainsReferenceToSelfType();
        b.children.add(a);
        try {
            gson.toJson(a);
        } catch (StackOverflowError expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSelfReferenceIgnoredInSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelfReferenceIgnoredInSerialization");
        TestTypes.ClassOverridingEquals objA = new TestTypes.ClassOverridingEquals();
        objA.ref = objA;
        String json = gson.toJson(objA);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),978,json,977,json.contains("ref"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSelfReferenceArrayFieldSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelfReferenceArrayFieldSerialization");
        ClassWithSelfReferenceArray objA = new ClassWithSelfReferenceArray();
        objA.children = new ClassWithSelfReferenceArray[]{ objA };
        try {
            gson.toJson(objA);
            gson.toJson(objA);
        } catch (StackOverflowError expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSelfReferenceCustomHandlerSerialization_add940() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelfReferenceCustomHandlerSerialization_add940");
        ClassWithSelfReference obj = new ClassWithSelfReference();
        obj.child = obj;
        Gson gson = new GsonBuilder().registerTypeAdapter(ClassWithSelfReference.class, new com.google.gson.JsonSerializer<ClassWithSelfReference>() {
            public com.google.gson.JsonElement serialize(ClassWithSelfReference src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject obj = new com.google.gson.JsonObject();
                obj.addProperty("property", "value");
                obj.add("child", context.serialize(src.child));
                return obj;
            }
        }).create();
        try {
            gson.toJson(obj);
        } catch (StackOverflowError expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSelfReferenceCustomHandlerSerialization_add941() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelfReferenceCustomHandlerSerialization_add941");
        ClassWithSelfReference obj = new ClassWithSelfReference();
        obj.child = obj;
        Gson gson = new GsonBuilder().registerTypeAdapter(ClassWithSelfReference.class, new com.google.gson.JsonSerializer<ClassWithSelfReference>() {
            public com.google.gson.JsonElement serialize(ClassWithSelfReference src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject obj = new com.google.gson.JsonObject();
                obj.addProperty("property", "value");
                obj.addProperty("property", "value");
                obj.add("child", context.serialize(src.child));
                return obj;
            }
        }).create();
        try {
            gson.toJson(obj);
        } catch (StackOverflowError expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSelfReferenceCustomHandlerSerialization_add942() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelfReferenceCustomHandlerSerialization_add942");
        ClassWithSelfReference obj = new ClassWithSelfReference();
        obj.child = obj;
        Gson gson = new GsonBuilder().registerTypeAdapter(ClassWithSelfReference.class, new com.google.gson.JsonSerializer<ClassWithSelfReference>() {
            public com.google.gson.JsonElement serialize(ClassWithSelfReference src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject obj = new com.google.gson.JsonObject();
                obj.addProperty("property", "value");
                obj.add("child", context.serialize(src.child));
                obj.add("child", context.serialize(src.child));
                return obj;
            }
        }).create();
        try {
            gson.toJson(obj);
        } catch (StackOverflowError expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSelfReferenceCustomHandlerSerialization_add943() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelfReferenceCustomHandlerSerialization_add943");
        ClassWithSelfReference obj = new ClassWithSelfReference();
        obj.child = obj;
        Gson gson = new GsonBuilder().registerTypeAdapter(ClassWithSelfReference.class, new com.google.gson.JsonSerializer<ClassWithSelfReference>() {
            public com.google.gson.JsonElement serialize(ClassWithSelfReference src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject obj = new com.google.gson.JsonObject();
                obj.addProperty("property", "value");
                obj.add("child", context.serialize(src.child));
                return obj;
            }
        }).create();
        try {
            gson.toJson(obj);
            gson.toJson(obj);
        } catch (StackOverflowError expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSelfReferenceCustomHandlerSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelfReferenceCustomHandlerSerialization");
        ClassWithSelfReference obj = new ClassWithSelfReference();
        obj.child = obj;
        Gson gson = new GsonBuilder().registerTypeAdapter(ClassWithSelfReference.class, new com.google.gson.JsonSerializer<ClassWithSelfReference>() {
            public com.google.gson.JsonElement serialize(ClassWithSelfReference src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject obj = new com.google.gson.JsonObject();
                obj.addProperty("foo", "value");
                obj.add("child", context.serialize(src.child));
                return obj;
            }
        }).create();
        try {
            gson.toJson(obj);
        } catch (StackOverflowError expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSelfReferenceCustomHandlerSerialization_literalMutation875() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelfReferenceCustomHandlerSerialization_literalMutation875");
        ClassWithSelfReference obj = new ClassWithSelfReference();
        obj.child = obj;
        Gson gson = new GsonBuilder().registerTypeAdapter(ClassWithSelfReference.class, new com.google.gson.JsonSerializer<ClassWithSelfReference>() {
            public com.google.gson.JsonElement serialize(ClassWithSelfReference src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject obj = new com.google.gson.JsonObject();
                obj.addProperty("property", "foo");
                obj.add("child", context.serialize(src.child));
                return obj;
            }
        }).create();
        try {
            gson.toJson(obj);
        } catch (StackOverflowError expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSelfReferenceCustomHandlerSerialization_literalMutation876() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelfReferenceCustomHandlerSerialization_literalMutation876");
        ClassWithSelfReference obj = new ClassWithSelfReference();
        obj.child = obj;
        Gson gson = new GsonBuilder().registerTypeAdapter(ClassWithSelfReference.class, new com.google.gson.JsonSerializer<ClassWithSelfReference>() {
            public com.google.gson.JsonElement serialize(ClassWithSelfReference src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject obj = new com.google.gson.JsonObject();
                obj.addProperty("property", "value");
                obj.add("foo", context.serialize(src.child));
                return obj;
            }
        }).create();
        try {
            gson.toJson(obj);
        } catch (StackOverflowError expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSelfReferenceCustomHandlerSerialization_remove775() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelfReferenceCustomHandlerSerialization_remove775");
        ClassWithSelfReference obj = new ClassWithSelfReference();
        obj.child = obj;
        Gson gson = new GsonBuilder().registerTypeAdapter(ClassWithSelfReference.class, new com.google.gson.JsonSerializer<ClassWithSelfReference>() {
            public com.google.gson.JsonElement serialize(ClassWithSelfReference src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject obj = new com.google.gson.JsonObject();
                obj.addProperty("property", "value");
                obj.add("child", context.serialize(src.child));
                return obj;
            }
        }).create();
        try {
            gson.toJson(obj);
        } catch (StackOverflowError expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSelfReferenceCustomHandlerSerialization_remove776() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelfReferenceCustomHandlerSerialization_remove776");
        ClassWithSelfReference obj = new ClassWithSelfReference();
        obj.child = obj;
        Gson gson = new GsonBuilder().registerTypeAdapter(ClassWithSelfReference.class, new com.google.gson.JsonSerializer<ClassWithSelfReference>() {
            public com.google.gson.JsonElement serialize(ClassWithSelfReference src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject obj = new com.google.gson.JsonObject();
                obj.add("child", context.serialize(src.child));
                return obj;
            }
        }).create();
        try {
            gson.toJson(obj);
        } catch (StackOverflowError expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSelfReferenceCustomHandlerSerialization_remove777() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelfReferenceCustomHandlerSerialization_remove777");
        ClassWithSelfReference obj = new ClassWithSelfReference();
        obj.child = obj;
        Gson gson = new GsonBuilder().registerTypeAdapter(ClassWithSelfReference.class, new com.google.gson.JsonSerializer<ClassWithSelfReference>() {
            public com.google.gson.JsonElement serialize(ClassWithSelfReference src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject obj = new com.google.gson.JsonObject();
                obj.addProperty("property", "value");
                return obj;
            }
        }).create();
        try {
            gson.toJson(obj);
        } catch (StackOverflowError expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDirectedAcyclicGraphSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDirectedAcyclicGraphSerialization");
        ContainsReferenceToSelfType a = new ContainsReferenceToSelfType();
        ContainsReferenceToSelfType b = new ContainsReferenceToSelfType();
        ContainsReferenceToSelfType c = new ContainsReferenceToSelfType();
        a.children.add(b);
        a.children.add(b);
        a.children.add(c);
        b.children.add(c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),976,gson,975,gson.toJson(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDirectedAcyclicGraphSerialization_add937() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDirectedAcyclicGraphSerialization_add937");
        ContainsReferenceToSelfType a = new ContainsReferenceToSelfType();
        ContainsReferenceToSelfType b = new ContainsReferenceToSelfType();
        ContainsReferenceToSelfType c = new ContainsReferenceToSelfType();
        a.children.add(b);
        a.children.add(c);
        a.children.add(c);
        b.children.add(c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),976,gson,975,gson.toJson(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDirectedAcyclicGraphSerialization_add938() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDirectedAcyclicGraphSerialization_add938");
        ContainsReferenceToSelfType a = new ContainsReferenceToSelfType();
        ContainsReferenceToSelfType b = new ContainsReferenceToSelfType();
        ContainsReferenceToSelfType c = new ContainsReferenceToSelfType();
        a.children.add(b);
        a.children.add(c);
        b.children.add(c);
        b.children.add(c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),976,gson,975,gson.toJson(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDirectedAcyclicGraphSerialization_remove772() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDirectedAcyclicGraphSerialization_remove772");
        ContainsReferenceToSelfType a = new ContainsReferenceToSelfType();
        ContainsReferenceToSelfType b = new ContainsReferenceToSelfType();
        ContainsReferenceToSelfType c = new ContainsReferenceToSelfType();
        a.children.add(c);
        b.children.add(c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),976,gson,975,gson.toJson(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDirectedAcyclicGraphSerialization_remove773() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDirectedAcyclicGraphSerialization_remove773");
        ContainsReferenceToSelfType a = new ContainsReferenceToSelfType();
        ContainsReferenceToSelfType b = new ContainsReferenceToSelfType();
        ContainsReferenceToSelfType c = new ContainsReferenceToSelfType();
        a.children.add(c);
        b.children.add(c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),976,gson,975,gson.toJson(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDirectedAcyclicGraphSerialization_remove774() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDirectedAcyclicGraphSerialization_remove774");
        ContainsReferenceToSelfType a = new ContainsReferenceToSelfType();
        ContainsReferenceToSelfType b = new ContainsReferenceToSelfType();
        ContainsReferenceToSelfType c = new ContainsReferenceToSelfType();
        a.children.add(c);
        b.children.add(c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),976,gson,975,gson.toJson(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDirectedAcyclicGraphDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDirectedAcyclicGraphDeserialization");
        String json = "foo";
        ContainsReferenceToSelfType target = gson.fromJson(json, ContainsReferenceToSelfType.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),972,target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),974,target.children,973,target.children.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static class ContainsReferenceToSelfType {
        Collection<ContainsReferenceToSelfType> children = new ArrayList<ContainsReferenceToSelfType>();
    }

    private static class ClassWithSelfReference {
        ClassWithSelfReference child;
    }

    private static class ClassWithSelfReferenceArray {
        @SuppressWarnings(value = "unused")
        ClassWithSelfReferenceArray[] children;
    }
}


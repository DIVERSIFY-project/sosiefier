package com.google.gson.functional;

import com.google.gson.Gson;
import junit.framework.TestCase;

/** 
 * Functional tests involving interfaces.
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class InterfaceTest extends TestCase {
    private static final String OBJ_JSON = "{\"someStringValue\":\"StringValue\"}";

    private Gson gson;

    private TestObject obj;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        gson = new Gson();
        obj = new TestObject("StringValue");
    }

    public void testSerializingObjectImplementingInterface() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializingObjectImplementingInterface");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1655,com.google.gson.functional.InterfaceTest.OBJ_JSON);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1657,gson,1656,gson.toJson(obj));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializingInterfaceObjectField() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializingInterfaceObjectField");
        TestObjectWrapper objWrapper = new TestObjectWrapper(obj);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1652,(("{\"obj\":" + (com.google.gson.functional.InterfaceTest.OBJ_JSON)) + "}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1654,gson,1653,gson.toJson(objWrapper));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static interface TestObjectInterface {    }

    private static class TestObject implements TestObjectInterface {
        @SuppressWarnings(value = "unused")
        private String someStringValue;

        private TestObject(String value) {
            this.someStringValue = value;
        }
    }

    private static class TestObjectWrapper {
        @SuppressWarnings(value = "unused")
        private TestObjectInterface obj;

        private TestObjectWrapper(TestObjectInterface obj) {
            this.obj = obj;
        }
    }
}


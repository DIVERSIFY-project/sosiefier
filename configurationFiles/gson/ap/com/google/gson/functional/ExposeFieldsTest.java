package com.google.gson.functional;

import com.google.gson.annotations.Expose;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.InstanceCreator;
import junit.framework.TestCase;
import java.lang.reflect.Type;

/** 
 * Unit tests for the regarding functional "@Expose" type tests.
 * 
 * @author Joel Leitch
 */
public class ExposeFieldsTest extends TestCase {
    private Gson gson;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().registerTypeAdapter(SomeInterface.class, new SomeInterfaceInstanceCreator()).create();
    }

    public void testNullExposeFieldSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullExposeFieldSerialization");
        ClassWithExposedFields object = new ClassWithExposedFields(null , 0);
        String json = gson.toJson(object);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1557,object,1556,object.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1558,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayWithOneNullExposeFieldObjectSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayWithOneNullExposeFieldObjectSerialization");
        ClassWithExposedFields object1 = new ClassWithExposedFields(0 , 1);
        ClassWithExposedFields object2 = new ClassWithExposedFields(null , 1);
        ClassWithExposedFields object3 = new ClassWithExposedFields(2 , 2);
        ClassWithExposedFields[] objects = new ClassWithExposedFields[]{ object1 , object2 , object3 };
        String json = gson.toJson(objects);
        String expected = new StringBuilder().append('[').append(object1.getExpectedJson()).append(',').append(object2.getExpectedJson()).append(',').append(object3.getExpectedJson()).append(']').toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1541,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1542,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayWithOneNullExposeFieldObjectSerialization_literalMutation1252() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayWithOneNullExposeFieldObjectSerialization_literalMutation1252");
        ClassWithExposedFields object1 = new ClassWithExposedFields(1 , 2);
        ClassWithExposedFields object2 = new ClassWithExposedFields(null , 1);
        ClassWithExposedFields object3 = new ClassWithExposedFields(2 , 2);
        ClassWithExposedFields[] objects = new ClassWithExposedFields[]{ object1 , object2 , object3 };
        String json = gson.toJson(objects);
        String expected = new StringBuilder().append('[').append(object1.getExpectedJson()).append(',').append(object2.getExpectedJson()).append(',').append(object3.getExpectedJson()).append(']').toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1541,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1542,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayWithOneNullExposeFieldObjectSerialization_literalMutation1254() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayWithOneNullExposeFieldObjectSerialization_literalMutation1254");
        ClassWithExposedFields object1 = new ClassWithExposedFields(1 , 1);
        ClassWithExposedFields object2 = new ClassWithExposedFields(null , 0);
        ClassWithExposedFields object3 = new ClassWithExposedFields(2 , 2);
        ClassWithExposedFields[] objects = new ClassWithExposedFields[]{ object1 , object2 , object3 };
        String json = gson.toJson(objects);
        String expected = new StringBuilder().append('[').append(object1.getExpectedJson()).append(',').append(object2.getExpectedJson()).append(',').append(object3.getExpectedJson()).append(']').toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1541,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1542,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayWithOneNullExposeFieldObjectSerialization_literalMutation1255() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayWithOneNullExposeFieldObjectSerialization_literalMutation1255");
        ClassWithExposedFields object1 = new ClassWithExposedFields(1 , 1);
        ClassWithExposedFields object2 = new ClassWithExposedFields(null , 1);
        ClassWithExposedFields object3 = new ClassWithExposedFields(3 , 2);
        ClassWithExposedFields[] objects = new ClassWithExposedFields[]{ object1 , object2 , object3 };
        String json = gson.toJson(objects);
        String expected = new StringBuilder().append('[').append(object1.getExpectedJson()).append(',').append(object2.getExpectedJson()).append(',').append(object3.getExpectedJson()).append(']').toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1541,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1542,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayWithOneNullExposeFieldObjectSerialization_literalMutation1256() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayWithOneNullExposeFieldObjectSerialization_literalMutation1256");
        ClassWithExposedFields object1 = new ClassWithExposedFields(1 , 1);
        ClassWithExposedFields object2 = new ClassWithExposedFields(null , 1);
        ClassWithExposedFields object3 = new ClassWithExposedFields(2 , 3);
        ClassWithExposedFields[] objects = new ClassWithExposedFields[]{ object1 , object2 , object3 };
        String json = gson.toJson(objects);
        String expected = new StringBuilder().append('[').append(object1.getExpectedJson()).append(',').append(object2.getExpectedJson()).append(',').append(object3.getExpectedJson()).append(']').toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1541,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1542,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExposeAnnotationSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExposeAnnotationSerialization");
        ClassWithExposedFields target = new ClassWithExposedFields(2 , 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1547,target,1546,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1549,gson,1548,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExposeAnnotationSerialization_literalMutation1263() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExposeAnnotationSerialization_literalMutation1263");
        ClassWithExposedFields target = new ClassWithExposedFields(1 , 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1547,target,1546,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1549,gson,1548,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExposeAnnotationDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExposeAnnotationDeserialization");
        String json = "foo";
        ClassWithExposedFields target = gson.fromJson(json, ClassWithExposedFields.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1543,((int)(target.a)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1544,target.b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1545,((target.d) == 20));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNoExposedFieldSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoExposedFieldSerialization");
        ClassWithNoExposedFields obj = new ClassWithNoExposedFields();
        String json = gson.toJson(obj);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1555,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNoExposedFieldDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoExposedFieldDeserialization");
        String json = "foo";
        ClassWithNoExposedFields obj = gson.fromJson(json, ClassWithNoExposedFields.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1553,obj.a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1554,obj.b);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExposedInterfaceFieldSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExposedInterfaceFieldSerialization");
        String expected = "foo";
        ClassWithInterfaceField target = new ClassWithInterfaceField(new SomeObject());
        String actual = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1551,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1552,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExposedInterfaceFieldDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExposedInterfaceFieldDeserialization");
        String json = "foo";
        ClassWithInterfaceField obj = gson.fromJson(json, ClassWithInterfaceField.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1550,obj.interfaceField);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static class ClassWithExposedFields {
        @Expose
        private final Integer a;

        private final Integer b;

        @Expose(serialize = false)
        final long c;

        @Expose(deserialize = false)
        final double d;

        @Expose(deserialize = false, serialize = false)
        final char e;

        public ClassWithExposedFields(Integer a ,Integer b) {
            this(a, b, 1L, 2.0, 'a');
        }

        public ClassWithExposedFields(Integer a ,Integer b ,long c ,double d ,char e) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }

        public String getExpectedJson() {
            StringBuilder sb = new StringBuilder("{");
            if ((a) != null) {
                sb.append("\"a\":").append(a).append(",");
            } 
            sb.append("\"d\":").append(d);
            sb.append("}");
            return sb.toString();
        }
    }

    private static class ClassWithNoExposedFields {
        private final int a = 0;

        private final int b = 1;
    }

    private static interface SomeInterface {    }

    private static class SomeObject implements SomeInterface {    }

    private static class SomeInterfaceInstanceCreator implements InstanceCreator<SomeInterface> {
        public SomeInterface createInstance(Type type) {
            return new SomeObject();
        }
    }

    private static class ClassWithInterfaceField {
        @Expose
        private final SomeInterface interfaceField;

        public ClassWithInterfaceField(SomeInterface interfaceField) {
            this.interfaceField = interfaceField;
        }
    }
}


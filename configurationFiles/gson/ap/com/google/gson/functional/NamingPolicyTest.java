package com.google.gson.functional;

import java.lang.reflect.Field;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import org.junit.Test;
import junit.framework.TestCase;
import com.google.gson.common.TestTypes;

/** 
 * Functional tests for naming policies.
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class NamingPolicyTest extends TestCase {
    private GsonBuilder builder;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        builder = new GsonBuilder();
    }

    public void testGsonWithNonDefaultFieldNamingPolicySerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGsonWithNonDefaultFieldNamingPolicySerialization");
        Gson gson = builder.setFieldNamingPolicy(com.google.gson.FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        TestTypes.StringWrapper target = new TestTypes.StringWrapper("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1933,(("{\"SomeConstantStringInstanceField\":\"" + (target.someConstantStringInstanceField)) + "\"}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1935,gson,1934,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGsonWithNonDefaultFieldNamingPolicyDeserialiation() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGsonWithNonDefaultFieldNamingPolicyDeserialiation");
        Gson gson = builder.setFieldNamingPolicy(com.google.gson.FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        String target = "foo";
        TestTypes.StringWrapper deserializedObject = gson.fromJson(target, TestTypes.StringWrapper.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1932,deserializedObject.someConstantStringInstanceField);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGsonWithLowerCaseDashPolicySerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGsonWithLowerCaseDashPolicySerialization");
        Gson gson = builder.setFieldNamingPolicy(com.google.gson.FieldNamingPolicy.LOWER_CASE_WITH_DASHES).create();
        TestTypes.StringWrapper target = new TestTypes.StringWrapper("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1925,(("{\"some-constant-string-instance-field\":\"" + (target.someConstantStringInstanceField)) + "\"}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1927,gson,1926,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGsonWithLowerCaseDashPolicyDeserialiation() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGsonWithLowerCaseDashPolicyDeserialiation");
        Gson gson = builder.setFieldNamingPolicy(com.google.gson.FieldNamingPolicy.LOWER_CASE_WITH_DASHES).create();
        String target = "foo";
        TestTypes.StringWrapper deserializedObject = gson.fromJson(target, TestTypes.StringWrapper.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1924,deserializedObject.someConstantStringInstanceField);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGsonWithLowerCaseUnderscorePolicySerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGsonWithLowerCaseUnderscorePolicySerialization");
        Gson gson = builder.setFieldNamingPolicy(com.google.gson.FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
        TestTypes.StringWrapper target = new TestTypes.StringWrapper("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1929,(("{\"some_constant_string_instance_field\":\"" + (target.someConstantStringInstanceField)) + "\"}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1931,gson,1930,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGsonWithLowerCaseUnderscorePolicyDeserialiation() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGsonWithLowerCaseUnderscorePolicyDeserialiation");
        Gson gson = builder.setFieldNamingPolicy(com.google.gson.FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
        String target = "foo";
        TestTypes.StringWrapper deserializedObject = gson.fromJson(target, TestTypes.StringWrapper.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1928,deserializedObject.someConstantStringInstanceField);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGsonWithSerializedNameFieldNamingPolicySerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGsonWithSerializedNameFieldNamingPolicySerialization");
        Gson gson = builder.create();
        TestTypes.ClassWithSerializedNameFields expected = new TestTypes.ClassWithSerializedNameFields(4 , 6);
        String actual = gson.toJson(expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,expected,1938,expected.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1940,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGsonWithSerializedNameFieldNamingPolicySerialization_literalMutation1613() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGsonWithSerializedNameFieldNamingPolicySerialization_literalMutation1613");
        Gson gson = builder.create();
        TestTypes.ClassWithSerializedNameFields expected = new TestTypes.ClassWithSerializedNameFields(5 , 5);
        String actual = gson.toJson(expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,expected,1938,expected.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1940,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGsonWithSerializedNameFieldNamingPolicyDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGsonWithSerializedNameFieldNamingPolicyDeserialization");
        Gson gson = builder.create();
        TestTypes.ClassWithSerializedNameFields expected = new TestTypes.ClassWithSerializedNameFields(6 , 7);
        TestTypes.ClassWithSerializedNameFields actual = gson.fromJson(expected.getExpectedJson(), TestTypes.ClassWithSerializedNameFields.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1936,expected.f);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1937,actual.f);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGsonWithSerializedNameFieldNamingPolicyDeserialization_literalMutation1611() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGsonWithSerializedNameFieldNamingPolicyDeserialization_literalMutation1611");
        Gson gson = builder.create();
        TestTypes.ClassWithSerializedNameFields expected = new TestTypes.ClassWithSerializedNameFields(5 , 6);
        TestTypes.ClassWithSerializedNameFields actual = gson.fromJson(expected.getExpectedJson(), TestTypes.ClassWithSerializedNameFields.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1936,expected.f);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1937,actual.f);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGsonDuplicateNameUsingSerializedNameFieldNamingPolicySerialization_add1306() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGsonDuplicateNameUsingSerializedNameFieldNamingPolicySerialization_add1306");
        Gson gson = builder.create();
        try {
            ClassWithDuplicateFields target = new ClassWithDuplicateFields(10);
            gson.toJson(target);
            gson.toJson(target);
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGsonDuplicateNameUsingSerializedNameFieldNamingPolicySerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGsonDuplicateNameUsingSerializedNameFieldNamingPolicySerialization");
        Gson gson = builder.create();
        try {
            ClassWithDuplicateFields target = new ClassWithDuplicateFields(9);
            gson.toJson(target);
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGsonWithUpperCamelCaseSpacesPolicySerialiation() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGsonWithUpperCamelCaseSpacesPolicySerialiation");
        Gson gson = builder.setFieldNamingPolicy(com.google.gson.FieldNamingPolicy.UPPER_CAMEL_CASE_WITH_SPACES).create();
        TestTypes.StringWrapper target = new TestTypes.StringWrapper("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1942,(("{\"Some Constant String Instance Field\":\"" + (target.someConstantStringInstanceField)) + "\"}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1944,gson,1943,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGsonWithUpperCamelCaseSpacesPolicyDeserialiation() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGsonWithUpperCamelCaseSpacesPolicyDeserialiation");
        Gson gson = builder.setFieldNamingPolicy(com.google.gson.FieldNamingPolicy.UPPER_CAMEL_CASE_WITH_SPACES).create();
        String target = "foo";
        TestTypes.StringWrapper deserializedObject = gson.fromJson(target, TestTypes.StringWrapper.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1941,deserializedObject.someConstantStringInstanceField);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeprecatedNamingStrategy() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeprecatedNamingStrategy");
        Gson gson = builder.setFieldNamingStrategy(new UpperCaseNamingStrategy()).create();
        ClassWithDuplicateFields target = new ClassWithDuplicateFields(11);
        String actual = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1923,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testComplexFieldNameStrategy() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComplexFieldNameStrategy");
        Gson gson = new Gson();
        String json = gson.toJson(new ClassWithComplexFieldName(11));
        String escapedFieldName = "@value\\\"_s$\\\\";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1920,(("{\"" + escapedFieldName) + "\":10}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1921,json);
        ClassWithComplexFieldName obj = gson.fromJson(json, ClassWithComplexFieldName.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1922,obj.value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testComplexFieldNameStrategy_literalMutation1601() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComplexFieldNameStrategy_literalMutation1601");
        Gson gson = new Gson();
        String json = gson.toJson(new ClassWithComplexFieldName(10));
        String escapedFieldName = "foo";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1920,(("{\"" + escapedFieldName) + "\":10}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1921,json);
        ClassWithComplexFieldName obj = gson.fromJson(json, ClassWithComplexFieldName.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1922,obj.value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * http://code.google.com/p/google-gson/issues/detail?id=349
     */
public void testAtSignInSerializedName() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAtSignInSerializedName");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1919,new com.google.gson.Gson(),1918,new com.google.gson.Gson().toJson(new com.google.gson.functional.NamingPolicyTest.AtName()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    static class AtName {
        @SerializedName(value = "@foo")
        String f = "bar";
    }

    private static class UpperCaseNamingStrategy implements FieldNamingStrategy {
        public String translateName(Field f) {
            return f.getName().toUpperCase();
        }
    }

    @SuppressWarnings(value = "unused")
    private static class ClassWithDuplicateFields {
        public Integer a;

        @SerializedName(value = "a")
        public Double b;

        public ClassWithDuplicateFields(Integer a) {
            this(a, null);
        }

        public ClassWithDuplicateFields(Double b) {
            this(null, b);
        }

        public ClassWithDuplicateFields(Integer a ,Double b) {
            this.a = a;
            this.b = b;
        }
    }

    private static class ClassWithComplexFieldName {
        @SerializedName(value = "@value\"_s$\\")
        public final long value;

        ClassWithComplexFieldName(long value) {
            this.value = value;
        }
    }
}


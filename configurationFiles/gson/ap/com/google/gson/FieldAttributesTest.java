package com.google.gson;

import java.util.List;
import org.junit.Test;
import junit.framework.TestCase;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;

/** 
 * Unit tests for the {@link FieldAttributes} class.
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class FieldAttributesTest extends TestCase {
    private FieldAttributes fieldAttributes;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        fieldAttributes = new FieldAttributes(Foo.class.getField("bar"));
    }

    public void testNullField() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullField");
        try {
            new FieldAttributes(null);
        } catch (NullPointerException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeclaringClass() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeclaringClass");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2711,com.google.gson.FieldAttributesTest.Foo.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2713,fieldAttributes,2712,fieldAttributes.getDeclaringClass());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testModifiers() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testModifiers");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2717,fieldAttributes,2716,fieldAttributes.hasModifier(java.lang.reflect.Modifier.STATIC));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2719,fieldAttributes,2718,fieldAttributes.hasModifier(java.lang.reflect.Modifier.FINAL));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2721,fieldAttributes,2720,fieldAttributes.hasModifier(java.lang.reflect.Modifier.ABSTRACT));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2723,fieldAttributes,2722,fieldAttributes.hasModifier(java.lang.reflect.Modifier.VOLATILE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2725,fieldAttributes,2724,fieldAttributes.hasModifier(java.lang.reflect.Modifier.PROTECTED));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2727,fieldAttributes,2726,fieldAttributes.hasModifier(java.lang.reflect.Modifier.PUBLIC));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2729,fieldAttributes,2728,fieldAttributes.hasModifier(java.lang.reflect.Modifier.TRANSIENT));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIsSynthetic() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsSynthetic");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2715,fieldAttributes,2714,fieldAttributes.isSynthetic());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testName() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testName");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2731,fieldAttributes,2730,fieldAttributes.getName());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeclaredTypeAndClass() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeclaredTypeAndClass");
        Type expectedType = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2705,expectedType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2707,fieldAttributes,2706,fieldAttributes.getDeclaredType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2708,java.util.List.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2710,fieldAttributes,2709,fieldAttributes.getDeclaredClass());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeclaredTypeAndClass_remove1249() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeclaredTypeAndClass_remove1249");
        Type expectedType = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2705,expectedType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2707,fieldAttributes,2706,fieldAttributes.getDeclaredType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2708,java.util.List.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2710,fieldAttributes,2709,fieldAttributes.getDeclaredClass());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static class Foo {
        @SuppressWarnings(value = "unused")
        public transient List<java.lang.String> bar;
    }
}


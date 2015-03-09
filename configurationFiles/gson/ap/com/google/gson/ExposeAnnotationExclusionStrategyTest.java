package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.annotations.Expose;
import java.lang.reflect.Field;
import junit.framework.TestCase;

/** 
 * Unit tests for GsonBuilder.REQUIRE_EXPOSE_DESERIALIZE.
 * 
 * @author Joel Leitch
 */
public class ExposeAnnotationExclusionStrategyTest extends TestCase {
    private Excluder excluder = Excluder.DEFAULT.excludeFieldsWithoutExposeAnnotation();

    public void testNeverSkipClasses() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNeverSkipClasses");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2686,excluder,2685,excluder.excludeClass(com.google.gson.ExposeAnnotationExclusionStrategyTest.MockObject.class, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2688,excluder,2687,excluder.excludeClass(com.google.gson.ExposeAnnotationExclusionStrategyTest.MockObject.class, false));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSkipNonAnnotatedFields() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipNonAnnotatedFields");
        Field f = ExposeAnnotationExclusionStrategyTest.createFieldAttributes("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2702,excluder,2701,excluder.excludeField(f, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2704,excluder,2703,excluder.excludeField(f, false));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSkipExplicitlySkippedFields() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipExplicitlySkippedFields");
        Field f = ExposeAnnotationExclusionStrategyTest.createFieldAttributes("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2698,excluder,2697,excluder.excludeField(f, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2700,excluder,2699,excluder.excludeField(f, false));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNeverSkipExposedAnnotatedFields() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNeverSkipExposedAnnotatedFields");
        Field f = ExposeAnnotationExclusionStrategyTest.createFieldAttributes("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2694,excluder,2693,excluder.excludeField(f, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2696,excluder,2695,excluder.excludeField(f, false));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNeverSkipExplicitlyExposedAnnotatedFields() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNeverSkipExplicitlyExposedAnnotatedFields");
        Field f = ExposeAnnotationExclusionStrategyTest.createFieldAttributes("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2690,excluder,2689,excluder.excludeField(f, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2692,excluder,2691,excluder.excludeField(f, false));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDifferentSerializeAndDeserializeField() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDifferentSerializeAndDeserializeField");
        Field f = ExposeAnnotationExclusionStrategyTest.createFieldAttributes("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2682,excluder,2681,excluder.excludeField(f, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2684,excluder,2683,excluder.excludeField(f, false));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static Field createFieldAttributes(String fieldName) throws Exception {
        return MockObject.class.getField(fieldName);
    }

    @SuppressWarnings(value = "unused")
    private static class MockObject {
        @Expose
        public final int exposedField = 0;

        @Expose(deserialize = true, serialize = true)
        public final int explicitlyExposedField = 0;

        @Expose(deserialize = false, serialize = false)
        public final int explicitlyHiddenField = 0;

        @Expose(deserialize = false, serialize = true)
        public final int explicitlyDifferentModeField = 0;

        public final int hiddenField = 0;
    }
}


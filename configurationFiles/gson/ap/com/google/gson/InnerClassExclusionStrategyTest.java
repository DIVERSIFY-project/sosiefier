package com.google.gson;

import com.google.gson.internal.Excluder;
import java.lang.reflect.Field;
import junit.framework.TestCase;

/** 
 * Unit test for GsonBuilder.EXCLUDE_INNER_CLASSES.
 * 
 * @author Joel Leitch
 */
public class InnerClassExclusionStrategyTest extends TestCase {
    public InnerClass innerClass = new InnerClass();

    public StaticNestedClass staticNestedClass = new StaticNestedClass();

    private Excluder excluder = Excluder.DEFAULT.disableInnerClassSerialization();

    public void testExcludeInnerClassObject() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExcludeInnerClassObject");
        Class<?> clazz = innerClass.getClass();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2765,excluder,2764,excluder.excludeClass(clazz, true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExcludeInnerClassField() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExcludeInnerClassField");
        Field f = getClass().getField("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2763,excluder,2762,excluder.excludeField(f, true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIncludeStaticNestedClassObject() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIncludeStaticNestedClassObject");
        Class<?> clazz = staticNestedClass.getClass();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2769,excluder,2768,excluder.excludeClass(clazz, true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIncludeStaticNestedClassField() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIncludeStaticNestedClassField");
        Field f = getClass().getField("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2767,excluder,2766,excluder.excludeField(f, true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    class InnerClass {    }

    static class StaticNestedClass {    }
}


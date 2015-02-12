package com.google.gson;

import java.lang.reflect.GenericArrayType;
import java.util.List;
import org.junit.Test;
import junit.framework.TestCase;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;

/** 
 * Unit tests for the {@code GenericArrayType}s created by the {@link $Gson$Types} class.
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class GenericArrayTypeTest extends TestCase {
    private GenericArrayType ourType;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        ourType = com.google.gson.internal.$Gson$Types.arrayOf(com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class));
    }

    @Test(timeout = 1000)
    public void testOurTypeFunctionality() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOurTypeFunctionality");
        Type parameterizedType = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        Type genericArrayType = new TypeToken<java.util.List<java.lang.String>[]>() {        }.getType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2736,parameterizedType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2738,ourType,2737,ourType.getGenericComponentType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2739,genericArrayType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2740,ourType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2742,genericArrayType,2741,genericArrayType.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,ourType,2743,ourType.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testOurTypeFunctionality_add1531() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOurTypeFunctionality_add1531");
        Type parameterizedType = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        Type genericArrayType = new TypeToken<java.util.List<java.lang.String>[]>() {        }.getType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2736,parameterizedType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2738,ourType,2737,ourType.getGenericComponentType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2739,genericArrayType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2740,ourType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2742,genericArrayType,2741,genericArrayType.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,ourType,2743,ourType.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testOurTypeFunctionality_remove1251() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOurTypeFunctionality_remove1251");
        Type parameterizedType = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        Type genericArrayType = new TypeToken<java.util.List<java.lang.String>[]>() {        }.getType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2736,parameterizedType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2738,ourType,2737,ourType.getGenericComponentType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2739,genericArrayType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2740,ourType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2742,genericArrayType,2741,genericArrayType.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,ourType,2743,ourType.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testOurTypeFunctionality_remove1252() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOurTypeFunctionality_remove1252");
        Type parameterizedType = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        Type genericArrayType = new TypeToken<java.util.List<java.lang.String>[]>() {        }.getType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2736,parameterizedType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2738,ourType,2737,ourType.getGenericComponentType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2739,genericArrayType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2740,ourType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2742,genericArrayType,2741,genericArrayType.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,ourType,2743,ourType.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNotEquals() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNotEquals");
        Type differentGenericArrayType = new TypeToken<java.util.List<java.lang.String>[][]>() {        }.getType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2733,differentGenericArrayType,2732,differentGenericArrayType.equals(ourType));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2735,ourType,2734,ourType.equals(differentGenericArrayType));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNotEquals_remove1250() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNotEquals_remove1250");
        Type differentGenericArrayType = new TypeToken<java.util.List<java.lang.String>[][]>() {        }.getType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2733,differentGenericArrayType,2732,differentGenericArrayType.equals(ourType));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2735,ourType,2734,ourType.equals(differentGenericArrayType));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


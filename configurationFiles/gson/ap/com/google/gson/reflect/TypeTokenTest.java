package com.google.gson.reflect;

import java.util.List;
import java.util.Set;
import junit.framework.TestCase;
import java.lang.reflect.Type;

/** 
 * @author Jesse Wilson
 */
@SuppressWarnings(value = { "deprecation" })
public final class TypeTokenTest extends TestCase {
    List<java.lang.Integer> listOfInteger = null;

    List<java.lang.Number> listOfNumber = null;

    List<java.lang.String> listOfString = null;

    List<?> listOfUnknown = null;

    List<java.util.Set<java.lang.String>> listOfSetOfString = null;

    List<java.util.Set<?>> listOfSetOfUnknown = null;

    public void testIsAssignableFromRawTypes() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsAssignableFromRawTypes");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),191,com.google.gson.reflect.TypeToken.get(java.lang.Object.class),190,com.google.gson.reflect.TypeToken.get(java.lang.Object.class).isAssignableFrom(java.lang.String.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),193,com.google.gson.reflect.TypeToken.get(java.lang.String.class),192,com.google.gson.reflect.TypeToken.get(java.lang.String.class).isAssignableFrom(java.lang.Object.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),195,com.google.gson.reflect.TypeToken.get(java.util.RandomAccess.class),194,com.google.gson.reflect.TypeToken.get(java.util.RandomAccess.class).isAssignableFrom(java.util.ArrayList.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),197,com.google.gson.reflect.TypeToken.get(java.util.ArrayList.class),196,com.google.gson.reflect.TypeToken.get(java.util.ArrayList.class).isAssignableFrom(java.util.RandomAccess.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIsAssignableFromWithTypeParameters() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsAssignableFromWithTypeParameters");
        Type a = getClass().getDeclaredField("foo").getGenericType();
        Type b = getClass().getDeclaredField("listOfNumber").getGenericType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),213,com.google.gson.reflect.TypeToken.get(a),212,com.google.gson.reflect.TypeToken.get(a).isAssignableFrom(a));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),215,com.google.gson.reflect.TypeToken.get(b),214,com.google.gson.reflect.TypeToken.get(b).isAssignableFrom(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),217,com.google.gson.reflect.TypeToken.get(a),216,com.google.gson.reflect.TypeToken.get(a).isAssignableFrom(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),219,com.google.gson.reflect.TypeToken.get(b),218,com.google.gson.reflect.TypeToken.get(b).isAssignableFrom(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIsAssignableFromWithTypeParameters_literalMutation281() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsAssignableFromWithTypeParameters_literalMutation281");
        Type a = getClass().getDeclaredField("listOfInteger").getGenericType();
        Type b = getClass().getDeclaredField("foo").getGenericType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),213,com.google.gson.reflect.TypeToken.get(a),212,com.google.gson.reflect.TypeToken.get(a).isAssignableFrom(a));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),215,com.google.gson.reflect.TypeToken.get(b),214,com.google.gson.reflect.TypeToken.get(b).isAssignableFrom(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),217,com.google.gson.reflect.TypeToken.get(a),216,com.google.gson.reflect.TypeToken.get(a).isAssignableFrom(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),219,com.google.gson.reflect.TypeToken.get(b),218,com.google.gson.reflect.TypeToken.get(b).isAssignableFrom(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIsAssignableFromWithBasicWildcards() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsAssignableFromWithBasicWildcards");
        Type a = getClass().getDeclaredField("foo").getGenericType();
        Type b = getClass().getDeclaredField("listOfUnknown").getGenericType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),199,com.google.gson.reflect.TypeToken.get(a),198,com.google.gson.reflect.TypeToken.get(a).isAssignableFrom(a));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),201,com.google.gson.reflect.TypeToken.get(b),200,com.google.gson.reflect.TypeToken.get(b).isAssignableFrom(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),203,com.google.gson.reflect.TypeToken.get(a),202,com.google.gson.reflect.TypeToken.get(a).isAssignableFrom(b));
        listOfUnknown = listOfString;
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIsAssignableFromWithBasicWildcards_literalMutation277() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsAssignableFromWithBasicWildcards_literalMutation277");
        Type a = getClass().getDeclaredField("listOfString").getGenericType();
        Type b = getClass().getDeclaredField("foo").getGenericType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),199,com.google.gson.reflect.TypeToken.get(a),198,com.google.gson.reflect.TypeToken.get(a).isAssignableFrom(a));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),201,com.google.gson.reflect.TypeToken.get(b),200,com.google.gson.reflect.TypeToken.get(b).isAssignableFrom(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),203,com.google.gson.reflect.TypeToken.get(a),202,com.google.gson.reflect.TypeToken.get(a).isAssignableFrom(b));
        listOfUnknown = listOfString;
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIsAssignableFromWithNestedWildcards() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsAssignableFromWithNestedWildcards");
        Type a = getClass().getDeclaredField("foo").getGenericType();
        Type b = getClass().getDeclaredField("listOfSetOfUnknown").getGenericType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),205,com.google.gson.reflect.TypeToken.get(a),204,com.google.gson.reflect.TypeToken.get(a).isAssignableFrom(a));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),207,com.google.gson.reflect.TypeToken.get(b),206,com.google.gson.reflect.TypeToken.get(b).isAssignableFrom(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),209,com.google.gson.reflect.TypeToken.get(a),208,com.google.gson.reflect.TypeToken.get(a).isAssignableFrom(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),211,com.google.gson.reflect.TypeToken.get(b),210,com.google.gson.reflect.TypeToken.get(b).isAssignableFrom(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIsAssignableFromWithNestedWildcards_literalMutation279() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsAssignableFromWithNestedWildcards_literalMutation279");
        Type a = getClass().getDeclaredField("listOfSetOfString").getGenericType();
        Type b = getClass().getDeclaredField("foo").getGenericType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),205,com.google.gson.reflect.TypeToken.get(a),204,com.google.gson.reflect.TypeToken.get(a).isAssignableFrom(a));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),207,com.google.gson.reflect.TypeToken.get(b),206,com.google.gson.reflect.TypeToken.get(b).isAssignableFrom(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),209,com.google.gson.reflect.TypeToken.get(a),208,com.google.gson.reflect.TypeToken.get(a).isAssignableFrom(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),211,com.google.gson.reflect.TypeToken.get(b),210,com.google.gson.reflect.TypeToken.get(b).isAssignableFrom(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


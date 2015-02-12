package com.google.gson.internal;

import java.lang.reflect.ParameterizedType;
import org.junit.Test;
import junit.framework.TestCase;
import java.lang.reflect.Type;

public final class GsonTypesTest extends TestCase {
    @Test(timeout = 1000)
    public void testNewParameterizedTypeWithoutOwner() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewParameterizedTypeWithoutOwner");
        Type type = com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(null, java.util.List.class, A.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),125,com.google.gson.internal.GsonTypesTest.A.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),127,null,126,com.google.gson.internal.GsonTypesTest.getFirstTypeArgument(type));
        type = com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(null, A.class, B.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),128,com.google.gson.internal.GsonTypesTest.B.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),130,null,129,com.google.gson.internal.GsonTypesTest.getFirstTypeArgument(type));
        final class D {        }
        try {
            com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(null, D.class, A.class);
        } catch (IllegalArgumentException expected) {
        }
        type = com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(null, A.class, D.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),131,D.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),133,null,132,com.google.gson.internal.GsonTypesTest.getFirstTypeArgument(type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNewParameterizedTypeWithoutOwner_add140() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewParameterizedTypeWithoutOwner_add140");
        Type type = com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(null, java.util.List.class, A.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),125,com.google.gson.internal.GsonTypesTest.A.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),127,null,126,com.google.gson.internal.GsonTypesTest.getFirstTypeArgument(type));
        type = com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(null, A.class, B.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),128,com.google.gson.internal.GsonTypesTest.B.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),130,null,129,com.google.gson.internal.GsonTypesTest.getFirstTypeArgument(type));
        final class D {        }
        try {
            com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(null, D.class, A.class);
            com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(null, D.class, A.class);
        } catch (IllegalArgumentException expected) {
        }
        type = com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(null, A.class, D.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),131,D.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),133,null,132,com.google.gson.internal.GsonTypesTest.getFirstTypeArgument(type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNewParameterizedTypeWithoutOwner_remove111() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewParameterizedTypeWithoutOwner_remove111");
        Type type = com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(null, java.util.List.class, A.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),125,com.google.gson.internal.GsonTypesTest.A.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),127,null,126,com.google.gson.internal.GsonTypesTest.getFirstTypeArgument(type));
        type = com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(null, A.class, B.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),128,com.google.gson.internal.GsonTypesTest.B.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),130,null,129,com.google.gson.internal.GsonTypesTest.getFirstTypeArgument(type));
        final class D {        }
        try {
            com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(null, D.class, A.class);
        } catch (IllegalArgumentException expected) {
        }
        type = com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(null, A.class, D.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),131,D.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),133,null,132,com.google.gson.internal.GsonTypesTest.getFirstTypeArgument(type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFirstTypeArgument() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFirstTypeArgument");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),121,null,120,com.google.gson.internal.GsonTypesTest.getFirstTypeArgument(com.google.gson.internal.GsonTypesTest.A.class));
        Type type = com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(null, A.class, B.class, C.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),122,com.google.gson.internal.GsonTypesTest.B.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),124,null,123,com.google.gson.internal.GsonTypesTest.getFirstTypeArgument(type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static final class A {    }

    private static final class B {    }

    private static final class C {    }

    /** 
     * Given a parameterized type A&lt;B,C&gt;, returns B. If the specified type is not
     * a generic type, returns null.
     */
public static Type getFirstTypeArgument(Type type) throws Exception {
        if (!(type instanceof ParameterizedType))
            return null;
        
        ParameterizedType ptype = ((ParameterizedType)(type));
        Type[] actualTypeArguments = ptype.getActualTypeArguments();
        if ((actualTypeArguments.length) == 0)
            return null;
        
        return com.google.gson.internal.$Gson$Types.canonicalize(actualTypeArguments[0]);
    }
}


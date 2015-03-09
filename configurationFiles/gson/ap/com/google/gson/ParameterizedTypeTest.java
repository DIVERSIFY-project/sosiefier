package com.google.gson;

import java.util.List;
import java.lang.reflect.ParameterizedType;
import org.junit.Test;
import junit.framework.TestCase;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;

/** 
 * Unit tests for {@code ParamterizedType}s created by the {@link $Gson$Types} class.
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class ParameterizedTypeTest extends TestCase {
    private ParameterizedType ourType;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        ourType = com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    }

    public void testOurTypeFunctionality() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOurTypeFunctionality");
        Type parameterizedType = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3224,ourType,3223,ourType.getOwnerType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3225,java.lang.String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3226,ourType.getActualTypeArguments()[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3227,java.util.List.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3229,ourType,3228,ourType.getRawType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3230,parameterizedType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2740,ourType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3232,parameterizedType,3231,parameterizedType.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,ourType,2743,ourType.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testOurTypeFunctionality_add1657() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOurTypeFunctionality_add1657");
        Type parameterizedType = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3224,ourType,3223,ourType.getOwnerType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3225,java.lang.String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3226,ourType.getActualTypeArguments()[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3227,java.util.List.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3229,ourType,3228,ourType.getRawType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3230,parameterizedType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2740,ourType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3232,parameterizedType,3231,parameterizedType.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,ourType,2743,ourType.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testOurTypeFunctionality_remove1357() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOurTypeFunctionality_remove1357");
        Type parameterizedType = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3224,ourType,3223,ourType.getOwnerType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3225,java.lang.String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3226,ourType.getActualTypeArguments()[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3227,java.util.List.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3229,ourType,3228,ourType.getRawType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3230,parameterizedType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2740,ourType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3232,parameterizedType,3231,parameterizedType.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,ourType,2743,ourType.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNotEquals() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNotEquals");
        Type differentParameterizedType = new TypeToken<java.util.List<java.lang.Integer>>() {        }.getType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3220,differentParameterizedType,3219,differentParameterizedType.equals(ourType));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3222,ourType,3221,ourType.equals(differentParameterizedType));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNotEquals_add1656() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNotEquals_add1656");
        Type differentParameterizedType = new TypeToken<java.util.List<java.lang.Integer>>() {        }.getType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3220,differentParameterizedType,3219,differentParameterizedType.equals(ourType));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3222,ourType,3221,ourType.equals(differentParameterizedType));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNotEquals_remove1356() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNotEquals_remove1356");
        Type differentParameterizedType = new TypeToken<java.util.List<java.lang.Integer>>() {        }.getType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3220,differentParameterizedType,3219,differentParameterizedType.equals(ourType));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3222,ourType,3221,ourType.equals(differentParameterizedType));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


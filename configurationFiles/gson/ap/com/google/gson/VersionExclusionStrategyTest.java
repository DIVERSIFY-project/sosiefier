package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.annotations.Since;
import junit.framework.TestCase;

/** 
 * Unit tests for the {@link Excluder} class.
 * 
 * @author Joel Leitch
 */
public class VersionExclusionStrategyTest extends TestCase {
    private static final double VERSION = 5.0;

    public void testClassAndFieldAreAtSameVersion() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClassAndFieldAreAtSameVersion");
        Excluder excluder = Excluder.DEFAULT.withVersion(VERSION);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3238,excluder,3237,excluder.excludeClass(com.google.gson.VersionExclusionStrategyTest.MockObject.class, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3240,excluder,3239,excluder.excludeField(com.google.gson.VersionExclusionStrategyTest.MockObject.class.getField("someField"), true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testClassAndFieldAreBehindInVersion() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClassAndFieldAreBehindInVersion");
        Excluder excluder = Excluder.DEFAULT.withVersion(((VERSION) + 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3242,excluder,3241,excluder.excludeClass(com.google.gson.VersionExclusionStrategyTest.MockObject.class, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3244,excluder,3243,excluder.excludeField(com.google.gson.VersionExclusionStrategyTest.MockObject.class.getField("someField"), true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testClassAndFieldAreAheadInVersion() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClassAndFieldAreAheadInVersion");
        Excluder excluder = Excluder.DEFAULT.withVersion(((VERSION) - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3234,excluder,3233,excluder.excludeClass(com.google.gson.VersionExclusionStrategyTest.MockObject.class, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3236,excluder,3235,excluder.excludeField(com.google.gson.VersionExclusionStrategyTest.MockObject.class.getField("someField"), true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Since(value = VersionExclusionStrategyTest.VERSION)
    private static class MockObject {
        @Since(value = VersionExclusionStrategyTest.VERSION)
        public final int someField = 0;
    }
}


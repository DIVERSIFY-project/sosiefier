package org.apache.commons.codec.net;

import org.junit.Test;

/** 
 * Tests Utils.
 * <p>
 * Methods currently get 100%/100% line/branch code coverage from other tests classes.
 * </p>
 * 
 * @version $Id$
 * @since 1.4
 */
public class UtilsTest {
    /** 
     * We could make the constructor private but there does not seem to be a point to jumping through extra code hoops
     * to restrict instantiation right now.
     */
@Test
    public void testConstructor() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructor");
        new Utils();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


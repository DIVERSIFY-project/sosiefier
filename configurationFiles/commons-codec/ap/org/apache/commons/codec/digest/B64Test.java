package org.apache.commons.codec.digest;

import org.junit.Test;

public class B64Test {
    @Test
    public void testB64T() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64T");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1176,new org.apache.commons.codec.digest.B64());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1178,org.apache.commons.codec.digest.B64.B64T,1177,org.apache.commons.codec.digest.B64.B64T.length());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testB64from24bit_add247() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_add247");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(16)), ((byte)(64)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(16)), ((byte)(64)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(77)), ((byte)(120)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testB64from24bit_add248() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_add248");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(16)), ((byte)(64)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(77)), ((byte)(120)), 4, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(77)), ((byte)(120)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit");
        final StringBuilder buffer = new StringBuilder("foo");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(16)), ((byte)(64)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(77)), ((byte)(120)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1361() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1361");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(9)), ((byte)(16)), ((byte)(64)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(77)), ((byte)(120)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1362() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1362");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(15)), ((byte)(64)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(77)), ((byte)(120)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1363() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1363");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(16)), ((byte)(65)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(77)), ((byte)(120)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1364() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1364");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(16)), ((byte)(64)), 3, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(77)), ((byte)(120)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1365() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1365");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(16)), ((byte)(64)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(6)), ((byte)(77)), ((byte)(120)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1366() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1366");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(16)), ((byte)(64)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(78)), ((byte)(120)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1367() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1367");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(16)), ((byte)(64)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(77)), ((byte)(119)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1368() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1368");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(16)), ((byte)(64)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(77)), ((byte)(120)), 5, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testB64from24bit_remove230() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_remove230");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(77)), ((byte)(120)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testB64from24bit_remove231() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_remove231");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(77)), ((byte)(120)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


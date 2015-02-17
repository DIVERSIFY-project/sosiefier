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
        final StringBuilder buffer = new StringBuilder("bar");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(16)), ((byte)(64)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(77)), ((byte)(120)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1458() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1458");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(4)), ((byte)(16)), ((byte)(64)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(77)), ((byte)(120)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1459() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1459");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(16)), ((byte)(16)), ((byte)(64)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(77)), ((byte)(120)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1460() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1460");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(9)), ((byte)(16)), ((byte)(64)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(77)), ((byte)(120)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1461() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1461");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(16)), ((byte)(64)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(77)), ((byte)(120)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1462() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1462");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(8)), ((byte)(64)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(77)), ((byte)(120)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1463() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1463");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(32)), ((byte)(64)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(77)), ((byte)(120)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1464() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1464");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(17)), ((byte)(64)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(77)), ((byte)(120)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1465() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1465");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(15)), ((byte)(64)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(77)), ((byte)(120)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1466() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1466");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(16)), ((byte)(65)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(77)), ((byte)(120)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1467() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1467");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(16)), ((byte)(32)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(77)), ((byte)(120)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1468() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1468");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(16)), ((byte)(128)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(77)), ((byte)(120)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1469() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1469");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(16)), ((byte)(63)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(77)), ((byte)(120)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1470() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1470");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(16)), ((byte)(64)), 1, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(77)), ((byte)(120)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1471() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1471");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(16)), ((byte)(64)), 4, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(77)), ((byte)(120)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1472() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1472");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(16)), ((byte)(64)), 3, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(77)), ((byte)(120)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1473() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1473");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(16)), ((byte)(64)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(77)), ((byte)(120)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1474() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1474");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(16)), ((byte)(64)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(6)), ((byte)(77)), ((byte)(120)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1475() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1475");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(16)), ((byte)(64)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(3)), ((byte)(77)), ((byte)(120)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1476() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1476");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(16)), ((byte)(64)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(14)), ((byte)(77)), ((byte)(120)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1477() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1477");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(16)), ((byte)(64)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(78)), ((byte)(120)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1478() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1478");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(16)), ((byte)(64)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(76)), ((byte)(120)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1479() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1479");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(16)), ((byte)(64)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(38)), ((byte)(120)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1480() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1480");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(16)), ((byte)(64)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(154)), ((byte)(120)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1481() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1481");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(16)), ((byte)(64)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(77)), ((byte)(119)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1482() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1482");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(16)), ((byte)(64)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(77)), ((byte)(121)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1483() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1483");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(16)), ((byte)(64)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(77)), ((byte)(60)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1484() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1484");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(16)), ((byte)(64)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(77)), ((byte)(240)), 4, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1485() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1485");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(16)), ((byte)(64)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(77)), ((byte)(120)), 2, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1486() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1486");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(16)), ((byte)(64)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(77)), ((byte)(120)), 8, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1487() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1487");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(16)), ((byte)(64)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(77)), ((byte)(120)), 5, buffer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,buffer,1179,buffer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB64from24bit_literalMutation1488() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB64from24bit_literalMutation1488");
        final StringBuilder buffer = new StringBuilder("");
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(8)), ((byte)(16)), ((byte)(64)), 2, buffer);
        org.apache.commons.codec.digest.B64.b64from24bit(((byte)(7)), ((byte)(77)), ((byte)(120)), 3, buffer);
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


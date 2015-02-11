package org.apache.commons.io.input;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * JUnit Test Case for {@link TeeInputStream}.
 */
public class TeeInputStreamTest extends TestCase {
    private final String ASCII = "US-ASCII";

    private InputStream tee;

    private ByteArrayOutputStream output;

    @Override
    protected void setUp() throws Exception {
        InputStream input = new ByteArrayInputStream("abc".getBytes(ASCII));
        output = new ByteArrayOutputStream();
        tee = new TeeInputStream(input , output);
    }

    public void testReadNothing() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNothing");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),986,new java.lang.String(output.toString(ASCII)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadOneByte() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOneByte");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),988,tee,987,tee.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),989,new java.lang.String(output.toString(ASCII)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadEverything() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadEverything");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),978,tee,977,tee.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),980,tee,979,tee.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),982,tee,981,tee.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),457,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),984,tee,983,tee.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),985,new java.lang.String(output.toString(ASCII)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadToArray() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadToArray");
        byte[] buffer = new byte[9];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),999,tee,998,tee.read(buffer));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,buffer[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1001,buffer[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,buffer[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1003,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1005,tee,1004,tee.read(buffer));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,new java.lang.String(output.toString(ASCII)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadToArrayWithOffset() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadToArrayWithOffset");
        byte[] buffer = new byte[7];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),991,tee,990,tee.read(buffer, 4, 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),992,buffer[4]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),993,buffer[5]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,buffer[6]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),569,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,tee,995,tee.read(buffer, 4, 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),997,new java.lang.String(output.toString(ASCII)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSkip() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,tee,1007,tee.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,tee,1009,tee.skip(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,tee,1011,tee.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1013,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1015,tee,1014,tee.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,new java.lang.String(output.toString(ASCII)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMarkReset() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkReset");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),966,tee,965,tee.read());
        tee.mark(1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),968,tee,967,tee.read());
        tee.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),970,tee,969,tee.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),972,tee,971,tee.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),973,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),975,tee,974,tee.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),976,new java.lang.String(output.toString(ASCII)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkReset_add313() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkReset_add313");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),966,tee,965,tee.read());
        tee.mark(1);
        tee.mark(1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),968,tee,967,tee.read());
        tee.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),970,tee,969,tee.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),972,tee,971,tee.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),973,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),975,tee,974,tee.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),976,new java.lang.String(output.toString(ASCII)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkReset_add314() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkReset_add314");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),966,tee,965,tee.read());
        tee.mark(1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),968,tee,967,tee.read());
        tee.reset();
        tee.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),970,tee,969,tee.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),972,tee,971,tee.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),973,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),975,tee,974,tee.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),976,new java.lang.String(output.toString(ASCII)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMarkReset_literalMutation682() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkReset_literalMutation682");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),966,tee,965,tee.read());
        tee.mark(0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),968,tee,967,tee.read());
        tee.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),970,tee,969,tee.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),972,tee,971,tee.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),973,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),975,tee,974,tee.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),976,new java.lang.String(output.toString(ASCII)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkReset_remove163() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkReset_remove163");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),966,tee,965,tee.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),968,tee,967,tee.read());
        tee.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),970,tee,969,tee.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),972,tee,971,tee.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),973,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),975,tee,974,tee.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),976,new java.lang.String(output.toString(ASCII)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkReset_remove164() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkReset_remove164");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),966,tee,965,tee.read());
        tee.mark(1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),968,tee,967,tee.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),970,tee,969,tee.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),972,tee,971,tee.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),973,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),975,tee,974,tee.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),976,new java.lang.String(output.toString(ASCII)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


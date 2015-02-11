package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * JUnit Test Case for {@link BrokenOutputStream}.
 */
public class BrokenOutputStreamTest extends TestCase {
    private IOException exception;

    private OutputStream stream;

    @Override
    protected void setUp() {
        exception = new IOException("test exception");
        stream = new BrokenOutputStream(exception);
    }

    @Test(timeout = 1000)
    public void testWrite_add943() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_add943");
        try {
            stream.write(1);
            stream.write(1);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),471,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),472,e);
        }
        try {
            stream.write(new byte[1]);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),473,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),474,e);
        }
        try {
            stream.write(new byte[1], 0, 1);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),476,e);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_add944() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_add944");
        try {
            stream.write(1);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),471,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),472,e);
        }
        try {
            stream.write(new byte[1]);
            stream.write(new byte[1]);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),473,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),474,e);
        }
        try {
            stream.write(new byte[1], 0, 1);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),476,e);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_add945() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_add945");
        try {
            stream.write(1);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),471,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),472,e);
        }
        try {
            stream.write(new byte[1]);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),473,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),474,e);
        }
        try {
            stream.write(new byte[1], 0, 1);
            stream.write(new byte[1], 0, 1);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),476,e);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite");
        try {
            stream.write(0);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),471,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),472,e);
        }
        try {
            stream.write(new byte[1]);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),473,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),474,e);
        }
        try {
            stream.write(new byte[1], 0, 1);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),476,e);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_literalMutation2271() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_literalMutation2271");
        try {
            stream.write(1);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),471,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),472,e);
        }
        try {
            stream.write(new byte[2]);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),473,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),474,e);
        }
        try {
            stream.write(new byte[1], 0, 1);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),476,e);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_literalMutation2272() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_literalMutation2272");
        try {
            stream.write(1);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),471,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),472,e);
        }
        try {
            stream.write(new byte[1]);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),473,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),474,e);
        }
        try {
            stream.write(new byte[0], 0, 1);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),476,e);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_literalMutation2273() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_literalMutation2273");
        try {
            stream.write(1);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),471,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),472,e);
        }
        try {
            stream.write(new byte[1]);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),473,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),474,e);
        }
        try {
            stream.write(new byte[1], 1, 1);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),476,e);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_literalMutation2274() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_literalMutation2274");
        try {
            stream.write(1);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),471,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),472,e);
        }
        try {
            stream.write(new byte[1]);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),473,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),474,e);
        }
        try {
            stream.write(new byte[1], 0, 0);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),476,e);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFlush() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFlush");
        try {
            stream.flush();
            stream.flush();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),467,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),468,e);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testClose() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose");
        try {
            stream.close();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),479,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),480,e);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClose_add941() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose_add941");
        try {
            stream.close();
            stream.close();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),479,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),480,e);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


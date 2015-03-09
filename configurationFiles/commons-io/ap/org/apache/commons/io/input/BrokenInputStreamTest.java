package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * JUnit Test Case for {@link BrokenInputStream}.
 */
public class BrokenInputStreamTest extends TestCase {
    private IOException exception;

    private InputStream stream;

    @Override
    protected void setUp() {
        exception = new IOException("test exception");
        stream = new BrokenInputStream(exception);
    }

    public void testRead() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead");
        try {
            stream.read();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),471,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),472,e);
        }
        try {
            stream.read(new byte[1]);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),473,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),474,e);
        }
        try {
            stream.read(new byte[1], 0, 1);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),476,e);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRead_add154() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead_add154");
        try {
            stream.read();
            stream.read();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),471,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),472,e);
        }
        try {
            stream.read(new byte[1]);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),473,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),474,e);
        }
        try {
            stream.read(new byte[1], 0, 1);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),476,e);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRead_add155() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead_add155");
        try {
            stream.read();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),471,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),472,e);
        }
        try {
            stream.read(new byte[1]);
            stream.read(new byte[1]);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),473,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),474,e);
        }
        try {
            stream.read(new byte[1], 0, 1);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),476,e);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRead_add156() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead_add156");
        try {
            stream.read();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),471,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),472,e);
        }
        try {
            stream.read(new byte[1]);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),473,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),474,e);
        }
        try {
            stream.read(new byte[1], 0, 1);
            stream.read(new byte[1], 0, 1);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),476,e);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRead_literalMutation724() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead_literalMutation724");
        try {
            stream.read();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),471,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),472,e);
        }
        try {
            stream.read(new byte[2]);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),473,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),474,e);
        }
        try {
            stream.read(new byte[1], 0, 1);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),476,e);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRead_literalMutation725() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead_literalMutation725");
        try {
            stream.read();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),471,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),472,e);
        }
        try {
            stream.read(new byte[0]);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),473,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),474,e);
        }
        try {
            stream.read(new byte[1], 0, 1);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),476,e);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRead_literalMutation726() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead_literalMutation726");
        try {
            stream.read();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),471,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),472,e);
        }
        try {
            stream.read(new byte[0]);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),473,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),474,e);
        }
        try {
            stream.read(new byte[1], 0, 1);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),476,e);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRead_literalMutation727() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead_literalMutation727");
        try {
            stream.read();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),471,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),472,e);
        }
        try {
            stream.read(new byte[1]);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),473,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),474,e);
        }
        try {
            stream.read(new byte[2], 0, 1);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),476,e);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRead_literalMutation728() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead_literalMutation728");
        try {
            stream.read();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),471,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),472,e);
        }
        try {
            stream.read(new byte[1]);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),473,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),474,e);
        }
        try {
            stream.read(new byte[0], 0, 1);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),476,e);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRead_literalMutation729() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead_literalMutation729");
        try {
            stream.read();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),471,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),472,e);
        }
        try {
            stream.read(new byte[1]);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),473,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),474,e);
        }
        try {
            stream.read(new byte[0], 0, 1);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),476,e);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRead_literalMutation730() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead_literalMutation730");
        try {
            stream.read();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),471,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),472,e);
        }
        try {
            stream.read(new byte[1]);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),473,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),474,e);
        }
        try {
            stream.read(new byte[1], 1, 1);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),476,e);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRead_literalMutation731() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead_literalMutation731");
        try {
            stream.read();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),471,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),472,e);
        }
        try {
            stream.read(new byte[1]);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),473,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),474,e);
        }
        try {
            stream.read(new byte[1], -1, 1);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),476,e);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRead_literalMutation732() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead_literalMutation732");
        try {
            stream.read();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),471,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),472,e);
        }
        try {
            stream.read(new byte[1]);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),473,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),474,e);
        }
        try {
            stream.read(new byte[1], 0, 1);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),476,e);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRead_literalMutation733() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead_literalMutation733");
        try {
            stream.read();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),471,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),472,e);
        }
        try {
            stream.read(new byte[1]);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),473,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),474,e);
        }
        try {
            stream.read(new byte[1], 0, 2);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),476,e);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRead_literalMutation734() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead_literalMutation734");
        try {
            stream.read();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),471,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),472,e);
        }
        try {
            stream.read(new byte[1]);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),473,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),474,e);
        }
        try {
            stream.read(new byte[1], 0, 0);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),476,e);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRead_literalMutation735() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead_literalMutation735");
        try {
            stream.read();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),471,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),472,e);
        }
        try {
            stream.read(new byte[1]);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),473,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),474,e);
        }
        try {
            stream.read(new byte[1], 0, 0);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),476,e);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvailable() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvailable");
        try {
            stream.available();
            stream.available();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),467,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),468,e);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkip_add158() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_add158");
        try {
            stream.skip(1);
            stream.skip(1);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),479,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),480,e);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSkip() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip");
        try {
            stream.skip(2);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),479,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),480,e);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSkip_literalMutation737() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_literalMutation737");
        try {
            stream.skip(0);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),479,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),480,e);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSkip_literalMutation738() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_literalMutation738");
        try {
            stream.skip(0);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),479,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),480,e);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReset() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset");
        try {
            stream.reset();
            stream.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),477,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),478,e);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testClose() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose");
        try {
            stream.close();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),469,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),470,e);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClose_add153() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose_add153");
        try {
            stream.close();
            stream.close();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),469,exception);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),470,e);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


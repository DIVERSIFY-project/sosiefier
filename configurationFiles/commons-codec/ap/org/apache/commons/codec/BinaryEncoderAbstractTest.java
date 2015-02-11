package org.apache.commons.codec;

import org.junit.Test;

/** 
 * @version $Id$
 */
public abstract class BinaryEncoderAbstractTest {
    protected abstract BinaryEncoder makeEncoder();

    @Test(timeout = 1000)
    public void testEncodeEmpty_add536() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeEmpty_add536");
        final BinaryEncoder encoder = makeEncoder();
        encoder.encode(new byte[0]);
        encoder.encode(new byte[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeEmpty() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeEmpty");
        final BinaryEncoder encoder = makeEncoder();
        encoder.encode(new byte[-1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeEmpty_remove479() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeEmpty_remove479");
        final BinaryEncoder encoder = makeEncoder();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeNull() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeNull");
        final BinaryEncoder encoder = makeEncoder();
        try {
            encoder.encode(null);
        } catch (final EncoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeNull_add537() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeNull_add537");
        final BinaryEncoder encoder = makeEncoder();
        try {
            encoder.encode(null);
            encoder.encode(null);
        } catch (final EncoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


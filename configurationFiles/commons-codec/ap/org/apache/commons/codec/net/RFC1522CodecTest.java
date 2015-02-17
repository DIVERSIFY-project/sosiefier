package org.apache.commons.codec.net;

import org.apache.commons.codec.DecoderException;
import org.junit.Test;

/** 
 * RFC 1522 compliant codec test cases
 * 
 * @version $Id$
 */
public class RFC1522CodecTest {
    static class RFC1522TestCodec extends RFC1522Codec {
        @Override
        protected byte[] doDecoding(final byte[] bytes) {
            return bytes;
        }

        @Override
        protected byte[] doEncoding(final byte[] bytes) {
            return bytes;
        }

        @Override
        protected String getEncoding() {
            return "T";
        }
    }

    @Test
    public void testNullInput() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullInput");
        final RFC1522TestCodec testcodec = new RFC1522TestCodec();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),152,testcodec,151,testcodec.decodeText(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),154,testcodec,153,testcodec.encodeText(null, org.apache.commons.codec.CharEncoding.UTF_8));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void assertExpectedDecoderException(final String s) throws Exception {
        final RFC1522TestCodec testcodec = new RFC1522TestCodec();
        try {
            testcodec.decodeText(s);
        } catch (final DecoderException e) {
        }
    }

    @Test
    public void testDecodeInvalid() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid");
        assertExpectedDecoderException("whatever");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeInvalid_add15() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_add15");
        assertExpectedDecoderException("whatever");
        assertExpectedDecoderException("whatever");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeInvalid_add16() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_add16");
        assertExpectedDecoderException("whatever");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeInvalid_add17() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_add17");
        assertExpectedDecoderException("whatever");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeInvalid_add18() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_add18");
        assertExpectedDecoderException("whatever");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeInvalid_add19() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_add19");
        assertExpectedDecoderException("whatever");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeInvalid_add20() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_add20");
        assertExpectedDecoderException("whatever");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeInvalid_add21() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_add21");
        assertExpectedDecoderException("whatever");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeInvalid_add22() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_add22");
        assertExpectedDecoderException("whatever");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeInvalid_add23() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_add23");
        assertExpectedDecoderException("whatever");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeInvalid_add24() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_add24");
        assertExpectedDecoderException("whatever");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeInvalid_add25() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_add25");
        assertExpectedDecoderException("whatever");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeInvalid_add26() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_add26");
        assertExpectedDecoderException("whatever");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeInvalid_literalMutation100() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_literalMutation100");
        assertExpectedDecoderException("whatever");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("bar");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeInvalid_literalMutation101() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_literalMutation101");
        assertExpectedDecoderException("whatever");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("bar");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeInvalid_literalMutation102() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_literalMutation102");
        assertExpectedDecoderException("whatever");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("bar");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeInvalid_literalMutation103() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_literalMutation103");
        assertExpectedDecoderException("whatever");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("foo");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeInvalid_literalMutation104() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_literalMutation104");
        assertExpectedDecoderException("whatever");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("bar");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeInvalid_literalMutation105() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_literalMutation105");
        assertExpectedDecoderException("whatever");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("foo");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeInvalid_literalMutation106() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_literalMutation106");
        assertExpectedDecoderException("whatever");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("bar");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeInvalid_literalMutation107() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_literalMutation107");
        assertExpectedDecoderException("whatever");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("bar");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeInvalid_literalMutation108() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_literalMutation108");
        assertExpectedDecoderException("whatever");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("bar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeInvalid_literalMutation97() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_literalMutation97");
        assertExpectedDecoderException("bar");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeInvalid_literalMutation98() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_literalMutation98");
        assertExpectedDecoderException("whatever");
        assertExpectedDecoderException("bar");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeInvalid_literalMutation99() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_literalMutation99");
        assertExpectedDecoderException("whatever");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("bar");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeInvalid_remove10() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_remove10");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeInvalid_remove11() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_remove11");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeInvalid_remove12() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_remove12");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeInvalid_remove13() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_remove13");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeInvalid_remove14() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_remove14");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeInvalid_remove15() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_remove15");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeInvalid_remove16() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_remove16");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeInvalid_remove17() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_remove17");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeInvalid_remove6() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_remove6");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeInvalid_remove7() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_remove7");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeInvalid_remove8() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_remove8");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeInvalid_remove9() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_remove9");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


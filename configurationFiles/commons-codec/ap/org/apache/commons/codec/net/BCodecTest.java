package org.apache.commons.codec.net;

import org.apache.commons.codec.CharEncoding;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Test;
import java.nio.charset.UnsupportedCharsetException;

/** 
 * Quoted-printable codec test cases
 * 
 * @version $Id$
 */
public class BCodecTest {
    static final int[] SWISS_GERMAN_STUFF_UNICODE = new int[]{ 71 , 114 , 252 , 101 , 122 , 105 , 95 , 122 , 228 , 109 , 228 };

    static final int[] RUSSIAN_STUFF_UNICODE = new int[]{ 1042 , 1089 , 1077 , 1084 , 95 , 1087 , 1088 , 1080 , 1074 , 1077 , 1090 };

    private String constructString(final int[] unicodeChars) {
        final StringBuilder buffer = new StringBuilder();
        if (unicodeChars != null) {
            for (final int unicodeChar : unicodeChars) {
                buffer.append(((char)(unicodeChar)));
            }
        } 
        return buffer.toString();
    }

    @Test
    public void testNullInput() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullInput");
        final BCodec bcodec = new BCodec();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),15,bcodec,14,bcodec.doDecoding(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),17,bcodec,16,bcodec.doEncoding(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUTF8RoundTrip() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8RoundTrip");
        final String ru_msg = constructString(RUSSIAN_STUFF_UNICODE);
        final String ch_msg = constructString(SWISS_GERMAN_STUFF_UNICODE);
        final BCodec bcodec = new BCodec(CharEncoding.UTF_8);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),19,bcodec,18,bcodec.encode(ru_msg));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),21,bcodec,20,bcodec.encode(ch_msg));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),22,ru_msg);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),24,bcodec,23,bcodec.decode(bcodec.encode(ru_msg)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),25,ch_msg);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),27,bcodec,26,bcodec.decode(bcodec.encode(ch_msg)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testBasicEncodeDecode() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBasicEncodeDecode");
        final BCodec bcodec = new BCodec();
        final String plain = "foo";
        final String encoded = bcodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),0,encoded);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3,bcodec,2,bcodec.decode(encoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeDecodeNull() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeNull");
        final BCodec bcodec = new BCodec();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8,bcodec,7,bcodec.encode(((java.lang.String)(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),10,bcodec,9,bcodec.decode(((java.lang.String)(null))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeStringWithNull() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeStringWithNull");
        final BCodec bcodec = new BCodec();
        final String test = null;
        final String result = bcodec.encode(test, "bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),13,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeStringWithNull() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeStringWithNull");
        final BCodec bcodec = new BCodec();
        final String test = null;
        final String result = bcodec.decode(test);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeObjects_add2() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeObjects_add2");
        final BCodec bcodec = new BCodec();
        final String plain = "what not";
        final String encoded = ((String)(bcodec.encode(((Object)(plain)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),11,encoded);
        final Object result = bcodec.encode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),12,result);
        try {
            final Object dObj = new Double(3.0);
            bcodec.encode(dObj);
            bcodec.encode(dObj);
        } catch (final EncoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeObjects_literalMutation11() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeObjects_literalMutation11");
        final BCodec bcodec = new BCodec();
        final String plain = "what not";
        final String encoded = ((String)(bcodec.encode(((Object)(plain)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),11,encoded);
        final Object result = bcodec.encode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),12,result);
        try {
            final Object dObj = new Double(4.0);
            bcodec.encode(dObj);
        } catch (final EncoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeObjects_literalMutation12() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeObjects_literalMutation12");
        final BCodec bcodec = new BCodec();
        final String plain = "what not";
        final String encoded = ((String)(bcodec.encode(((Object)(plain)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),11,encoded);
        final Object result = bcodec.encode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),12,result);
        try {
            final Object dObj = new Double(2.0);
            bcodec.encode(dObj);
        } catch (final EncoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeObjects_literalMutation13() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeObjects_literalMutation13");
        final BCodec bcodec = new BCodec();
        final String plain = "what not";
        final String encoded = ((String)(bcodec.encode(((Object)(plain)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),11,encoded);
        final Object result = bcodec.encode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),12,result);
        try {
            final Object dObj = new Double(1.5);
            bcodec.encode(dObj);
        } catch (final EncoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeObjects_literalMutation14() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeObjects_literalMutation14");
        final BCodec bcodec = new BCodec();
        final String plain = "what not";
        final String encoded = ((String)(bcodec.encode(((Object)(plain)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),11,encoded);
        final Object result = bcodec.encode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),12,result);
        try {
            final Object dObj = new Double(6.0);
            bcodec.encode(dObj);
        } catch (final EncoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeObjects() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeObjects");
        final BCodec bcodec = new BCodec();
        final String plain = "foo";
        final String encoded = ((String)(bcodec.encode(((Object)(plain)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),11,encoded);
        final Object result = bcodec.encode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),12,result);
        try {
            final Object dObj = new Double(3.0);
            bcodec.encode(dObj);
        } catch (final EncoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = UnsupportedCharsetException.class)
    public void testInvalidEncoding() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidEncoding");
        new BCodec("bar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeObjects_add1() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeObjects_add1");
        final BCodec bcodec = new BCodec();
        final String decoded = "=?UTF-8?B?d2hhdCBub3Q=?=";
        final String plain = ((String)(bcodec.decode(((Object)(decoded)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4,plain);
        final Object result = bcodec.decode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5,result);
        try {
            final Object dObj = new Double(3.0);
            bcodec.decode(dObj);
            bcodec.decode(dObj);
        } catch (final DecoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeObjects() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeObjects");
        final BCodec bcodec = new BCodec();
        final String decoded = "bar";
        final String plain = ((String)(bcodec.decode(((Object)(decoded)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4,plain);
        final Object result = bcodec.decode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5,result);
        try {
            final Object dObj = new Double(3.0);
            bcodec.decode(dObj);
        } catch (final DecoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeObjects_literalMutation4() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeObjects_literalMutation4");
        final BCodec bcodec = new BCodec();
        final String decoded = "=?UTF-8?B?d2hhdCBub3Q=?=";
        final String plain = ((String)(bcodec.decode(((Object)(decoded)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4,plain);
        final Object result = bcodec.decode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5,result);
        try {
            final Object dObj = new Double(4.0);
            bcodec.decode(dObj);
        } catch (final DecoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeObjects_literalMutation5() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeObjects_literalMutation5");
        final BCodec bcodec = new BCodec();
        final String decoded = "=?UTF-8?B?d2hhdCBub3Q=?=";
        final String plain = ((String)(bcodec.decode(((Object)(decoded)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4,plain);
        final Object result = bcodec.decode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5,result);
        try {
            final Object dObj = new Double(2.0);
            bcodec.decode(dObj);
        } catch (final DecoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeObjects_literalMutation6() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeObjects_literalMutation6");
        final BCodec bcodec = new BCodec();
        final String decoded = "=?UTF-8?B?d2hhdCBub3Q=?=";
        final String plain = ((String)(bcodec.decode(((Object)(decoded)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4,plain);
        final Object result = bcodec.decode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5,result);
        try {
            final Object dObj = new Double(1.5);
            bcodec.decode(dObj);
        } catch (final DecoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeObjects_literalMutation7() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeObjects_literalMutation7");
        final BCodec bcodec = new BCodec();
        final String decoded = "=?UTF-8?B?d2hhdCBub3Q=?=";
        final String plain = ((String)(bcodec.decode(((Object)(decoded)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4,plain);
        final Object result = bcodec.decode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5,result);
        try {
            final Object dObj = new Double(6.0);
            bcodec.decode(dObj);
        } catch (final DecoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


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
public class QCodecTest {
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
        final QCodec qcodec = new QCodec();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),55,qcodec,54,qcodec.doDecoding(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),57,qcodec,56,qcodec.doEncoding(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUTF8RoundTrip() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8RoundTrip");
        final String ru_msg = constructString(RUSSIAN_STUFF_UNICODE);
        final String ch_msg = constructString(SWISS_GERMAN_STUFF_UNICODE);
        final QCodec qcodec = new QCodec(CharEncoding.UTF_8);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),59,qcodec,58,qcodec.encode(ru_msg));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),61,qcodec,60,qcodec.encode(ch_msg));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),62,ru_msg);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),64,qcodec,63,qcodec.decode(qcodec.encode(ru_msg)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),65,ch_msg);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),67,qcodec,66,qcodec.decode(qcodec.encode(ch_msg)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testBasicEncodeDecode() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBasicEncodeDecode");
        final QCodec qcodec = new QCodec();
        final String plain = "= Hello there =\r\n";
        final String encoded = qcodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),28,encoded);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),29,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),31,qcodec,30,qcodec.decode(encoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testBasicEncodeDecode_literalMutation18() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBasicEncodeDecode_literalMutation18");
        final QCodec qcodec = new QCodec();
        final String plain = "foo";
        final String encoded = qcodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),28,encoded);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),29,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),31,qcodec,30,qcodec.decode(encoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUnsafeEncodeDecode() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsafeEncodeDecode");
        final QCodec qcodec = new QCodec();
        final String plain = "bar";
        final String encoded = qcodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),68,encoded);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),69,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),71,qcodec,70,qcodec.decode(encoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeDecodeNull() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeNull");
        final QCodec qcodec = new QCodec();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),44,qcodec,43,qcodec.encode(((java.lang.String)(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),46,qcodec,45,qcodec.decode(((java.lang.String)(null))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeStringWithNull() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeStringWithNull");
        final QCodec qcodec = new QCodec();
        final String test = null;
        final String result = qcodec.encode(test, "charset");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),49,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeStringWithNull_literalMutation38() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeStringWithNull_literalMutation38");
        final QCodec qcodec = new QCodec();
        final String test = null;
        final String result = qcodec.encode(test, "bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),49,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeStringWithNull() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeStringWithNull");
        final QCodec qcodec = new QCodec();
        final String test = null;
        final String result = qcodec.decode(test);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),34,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeObjects() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeObjects");
        final QCodec qcodec = new QCodec();
        final String plain = "1+1 = 2";
        final String encoded = ((String)(qcodec.encode(((Object)(plain)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),47,encoded);
        final Object result = qcodec.encode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),48,result);
        try {
            final Object dObj = new Double(3.0);
            qcodec.encode(dObj);
        } catch (final EncoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeObjects_add6() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeObjects_add6");
        final QCodec qcodec = new QCodec();
        final String plain = "1+1 = 2";
        final String encoded = ((String)(qcodec.encode(((Object)(plain)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),47,encoded);
        final Object result = qcodec.encode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),48,result);
        try {
            final Object dObj = new Double(3.0);
            qcodec.encode(dObj);
            qcodec.encode(dObj);
        } catch (final EncoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeObjects_literalMutation31() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeObjects_literalMutation31");
        final QCodec qcodec = new QCodec();
        final String plain = "foo";
        final String encoded = ((String)(qcodec.encode(((Object)(plain)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),47,encoded);
        final Object result = qcodec.encode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),48,result);
        try {
            final Object dObj = new Double(3.0);
            qcodec.encode(dObj);
        } catch (final EncoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeObjects_literalMutation33() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeObjects_literalMutation33");
        final QCodec qcodec = new QCodec();
        final String plain = "1+1 = 2";
        final String encoded = ((String)(qcodec.encode(((Object)(plain)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),47,encoded);
        final Object result = qcodec.encode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),48,result);
        try {
            final Object dObj = new Double(4.0);
            qcodec.encode(dObj);
        } catch (final EncoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeObjects_literalMutation34() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeObjects_literalMutation34");
        final QCodec qcodec = new QCodec();
        final String plain = "1+1 = 2";
        final String encoded = ((String)(qcodec.encode(((Object)(plain)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),47,encoded);
        final Object result = qcodec.encode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),48,result);
        try {
            final Object dObj = new Double(2.0);
            qcodec.encode(dObj);
        } catch (final EncoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeObjects_literalMutation35() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeObjects_literalMutation35");
        final QCodec qcodec = new QCodec();
        final String plain = "1+1 = 2";
        final String encoded = ((String)(qcodec.encode(((Object)(plain)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),47,encoded);
        final Object result = qcodec.encode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),48,result);
        try {
            final Object dObj = new Double(1.5);
            qcodec.encode(dObj);
        } catch (final EncoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeObjects_literalMutation36() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeObjects_literalMutation36");
        final QCodec qcodec = new QCodec();
        final String plain = "1+1 = 2";
        final String encoded = ((String)(qcodec.encode(((Object)(plain)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),47,encoded);
        final Object result = qcodec.encode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),48,result);
        try {
            final Object dObj = new Double(6.0);
            qcodec.encode(dObj);
        } catch (final EncoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = UnsupportedCharsetException.class)
    public void testInvalidEncoding() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidEncoding");
        new QCodec("NONSENSE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = UnsupportedCharsetException.class)
    public void testInvalidEncoding_literalMutation39() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidEncoding_literalMutation39");
        new QCodec("foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeObjects() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeObjects");
        final QCodec qcodec = new QCodec();
        final String decoded = "=?UTF-8?Q?1+1 =3D 2?=";
        final String plain = ((String)(qcodec.decode(((Object)(decoded)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),32,plain);
        final Object result = qcodec.decode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),33,result);
        try {
            final Object dObj = new Double(3.0);
            qcodec.decode(dObj);
        } catch (final DecoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeObjects_add3() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeObjects_add3");
        final QCodec qcodec = new QCodec();
        final String decoded = "=?UTF-8?Q?1+1 =3D 2?=";
        final String plain = ((String)(qcodec.decode(((Object)(decoded)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),32,plain);
        final Object result = qcodec.decode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),33,result);
        try {
            final Object dObj = new Double(3.0);
            qcodec.decode(dObj);
            qcodec.decode(dObj);
        } catch (final DecoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeObjects_literalMutation19() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeObjects_literalMutation19");
        final QCodec qcodec = new QCodec();
        final String decoded = "bar";
        final String plain = ((String)(qcodec.decode(((Object)(decoded)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),32,plain);
        final Object result = qcodec.decode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),33,result);
        try {
            final Object dObj = new Double(3.0);
            qcodec.decode(dObj);
        } catch (final DecoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeObjects_literalMutation21() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeObjects_literalMutation21");
        final QCodec qcodec = new QCodec();
        final String decoded = "=?UTF-8?Q?1+1 =3D 2?=";
        final String plain = ((String)(qcodec.decode(((Object)(decoded)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),32,plain);
        final Object result = qcodec.decode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),33,result);
        try {
            final Object dObj = new Double(4.0);
            qcodec.decode(dObj);
        } catch (final DecoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeObjects_literalMutation22() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeObjects_literalMutation22");
        final QCodec qcodec = new QCodec();
        final String decoded = "=?UTF-8?Q?1+1 =3D 2?=";
        final String plain = ((String)(qcodec.decode(((Object)(decoded)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),32,plain);
        final Object result = qcodec.decode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),33,result);
        try {
            final Object dObj = new Double(2.0);
            qcodec.decode(dObj);
        } catch (final DecoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeObjects_literalMutation23() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeObjects_literalMutation23");
        final QCodec qcodec = new QCodec();
        final String decoded = "=?UTF-8?Q?1+1 =3D 2?=";
        final String plain = ((String)(qcodec.decode(((Object)(decoded)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),32,plain);
        final Object result = qcodec.decode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),33,result);
        try {
            final Object dObj = new Double(1.5);
            qcodec.decode(dObj);
        } catch (final DecoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeObjects_literalMutation24() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeObjects_literalMutation24");
        final QCodec qcodec = new QCodec();
        final String decoded = "=?UTF-8?Q?1+1 =3D 2?=";
        final String plain = ((String)(qcodec.decode(((Object)(decoded)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),32,plain);
        final Object result = qcodec.decode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),33,result);
        try {
            final Object dObj = new Double(6.0);
            qcodec.decode(dObj);
        } catch (final DecoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeDecodeBlanks_add4() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeBlanks_add4");
        final String plain = "Mind those pesky blanks";
        final String encoded1 = "=?UTF-8?Q?Mind those pesky blanks?=";
        final String encoded2 = "=?UTF-8?Q?Mind_those_pesky_blanks?=";
        final QCodec qcodec = new QCodec();
        qcodec.setEncodeBlanks(false);
        qcodec.setEncodeBlanks(false);
        String s = qcodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),35,encoded1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),36,s);
        qcodec.setEncodeBlanks(true);
        s = qcodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),37,encoded2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),38,s);
        s = qcodec.decode(encoded1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),39,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),40,s);
        s = qcodec.decode(encoded2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),41,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),42,s);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeDecodeBlanks_add5() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeBlanks_add5");
        final String plain = "Mind those pesky blanks";
        final String encoded1 = "=?UTF-8?Q?Mind those pesky blanks?=";
        final String encoded2 = "=?UTF-8?Q?Mind_those_pesky_blanks?=";
        final QCodec qcodec = new QCodec();
        qcodec.setEncodeBlanks(false);
        String s = qcodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),35,encoded1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),36,s);
        qcodec.setEncodeBlanks(true);
        qcodec.setEncodeBlanks(true);
        s = qcodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),37,encoded2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),38,s);
        s = qcodec.decode(encoded1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),39,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),40,s);
        s = qcodec.decode(encoded2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),41,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),42,s);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeDecodeBlanks() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeBlanks");
        final String plain = "bar";
        final String encoded1 = "=?UTF-8?Q?Mind those pesky blanks?=";
        final String encoded2 = "=?UTF-8?Q?Mind_those_pesky_blanks?=";
        final QCodec qcodec = new QCodec();
        qcodec.setEncodeBlanks(false);
        String s = qcodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),35,encoded1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),36,s);
        qcodec.setEncodeBlanks(true);
        s = qcodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),37,encoded2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),38,s);
        s = qcodec.decode(encoded1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),39,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),40,s);
        s = qcodec.decode(encoded2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),41,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),42,s);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeDecodeBlanks_literalMutation27() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeBlanks_literalMutation27");
        final String plain = "Mind those pesky blanks";
        final String encoded1 = "bar";
        final String encoded2 = "=?UTF-8?Q?Mind_those_pesky_blanks?=";
        final QCodec qcodec = new QCodec();
        qcodec.setEncodeBlanks(false);
        String s = qcodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),35,encoded1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),36,s);
        qcodec.setEncodeBlanks(true);
        s = qcodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),37,encoded2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),38,s);
        s = qcodec.decode(encoded1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),39,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),40,s);
        s = qcodec.decode(encoded2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),41,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),42,s);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeDecodeBlanks_literalMutation28() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeBlanks_literalMutation28");
        final String plain = "Mind those pesky blanks";
        final String encoded1 = "=?UTF-8?Q?Mind those pesky blanks?=";
        final String encoded2 = "foo";
        final QCodec qcodec = new QCodec();
        qcodec.setEncodeBlanks(false);
        String s = qcodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),35,encoded1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),36,s);
        qcodec.setEncodeBlanks(true);
        s = qcodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),37,encoded2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),38,s);
        s = qcodec.decode(encoded1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),39,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),40,s);
        s = qcodec.decode(encoded2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),41,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),42,s);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeDecodeBlanks_literalMutation29() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeBlanks_literalMutation29");
        final String plain = "Mind those pesky blanks";
        final String encoded1 = "=?UTF-8?Q?Mind those pesky blanks?=";
        final String encoded2 = "=?UTF-8?Q?Mind_those_pesky_blanks?=";
        final QCodec qcodec = new QCodec();
        qcodec.setEncodeBlanks(true);
        String s = qcodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),35,encoded1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),36,s);
        qcodec.setEncodeBlanks(true);
        s = qcodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),37,encoded2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),38,s);
        s = qcodec.decode(encoded1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),39,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),40,s);
        s = qcodec.decode(encoded2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),41,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),42,s);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeDecodeBlanks_literalMutation30() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeBlanks_literalMutation30");
        final String plain = "Mind those pesky blanks";
        final String encoded1 = "=?UTF-8?Q?Mind those pesky blanks?=";
        final String encoded2 = "=?UTF-8?Q?Mind_those_pesky_blanks?=";
        final QCodec qcodec = new QCodec();
        qcodec.setEncodeBlanks(false);
        String s = qcodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),35,encoded1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),36,s);
        qcodec.setEncodeBlanks(false);
        s = qcodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),37,encoded2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),38,s);
        s = qcodec.decode(encoded1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),39,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),40,s);
        s = qcodec.decode(encoded2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),41,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),42,s);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeDecodeBlanks_remove1() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeBlanks_remove1");
        final String plain = "Mind those pesky blanks";
        final String encoded1 = "=?UTF-8?Q?Mind those pesky blanks?=";
        final String encoded2 = "=?UTF-8?Q?Mind_those_pesky_blanks?=";
        final QCodec qcodec = new QCodec();
        String s = qcodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),35,encoded1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),36,s);
        qcodec.setEncodeBlanks(true);
        s = qcodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),37,encoded2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),38,s);
        s = qcodec.decode(encoded1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),39,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),40,s);
        s = qcodec.decode(encoded2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),41,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),42,s);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeDecodeBlanks_remove2() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeBlanks_remove2");
        final String plain = "Mind those pesky blanks";
        final String encoded1 = "=?UTF-8?Q?Mind those pesky blanks?=";
        final String encoded2 = "=?UTF-8?Q?Mind_those_pesky_blanks?=";
        final QCodec qcodec = new QCodec();
        String s = qcodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),35,encoded1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),36,s);
        qcodec.setEncodeBlanks(true);
        s = qcodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),37,encoded2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),38,s);
        s = qcodec.decode(encoded1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),39,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),40,s);
        s = qcodec.decode(encoded2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),41,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),42,s);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLetUsMakeCloverHappy_add7() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLetUsMakeCloverHappy_add7");
        final QCodec qcodec = new QCodec();
        qcodec.setEncodeBlanks(true);
        qcodec.setEncodeBlanks(true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),51,qcodec,50,qcodec.isEncodeBlanks());
        qcodec.setEncodeBlanks(false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),53,qcodec,52,qcodec.isEncodeBlanks());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLetUsMakeCloverHappy_add8() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLetUsMakeCloverHappy_add8");
        final QCodec qcodec = new QCodec();
        qcodec.setEncodeBlanks(true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),51,qcodec,50,qcodec.isEncodeBlanks());
        qcodec.setEncodeBlanks(false);
        qcodec.setEncodeBlanks(false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),53,qcodec,52,qcodec.isEncodeBlanks());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testLetUsMakeCloverHappy() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLetUsMakeCloverHappy");
        final QCodec qcodec = new QCodec();
        qcodec.setEncodeBlanks(false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),51,qcodec,50,qcodec.isEncodeBlanks());
        qcodec.setEncodeBlanks(false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),53,qcodec,52,qcodec.isEncodeBlanks());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testLetUsMakeCloverHappy_literalMutation41() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLetUsMakeCloverHappy_literalMutation41");
        final QCodec qcodec = new QCodec();
        qcodec.setEncodeBlanks(true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),51,qcodec,50,qcodec.isEncodeBlanks());
        qcodec.setEncodeBlanks(true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),53,qcodec,52,qcodec.isEncodeBlanks());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLetUsMakeCloverHappy_remove3() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLetUsMakeCloverHappy_remove3");
        final QCodec qcodec = new QCodec();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),51,qcodec,50,qcodec.isEncodeBlanks());
        qcodec.setEncodeBlanks(false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),53,qcodec,52,qcodec.isEncodeBlanks());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLetUsMakeCloverHappy_remove4() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLetUsMakeCloverHappy_remove4");
        final QCodec qcodec = new QCodec();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),51,qcodec,50,qcodec.isEncodeBlanks());
        qcodec.setEncodeBlanks(false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),53,qcodec,52,qcodec.isEncodeBlanks());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


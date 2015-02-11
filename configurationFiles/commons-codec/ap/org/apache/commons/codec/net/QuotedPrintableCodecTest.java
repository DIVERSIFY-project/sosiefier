package org.apache.commons.codec.net;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Test;
import java.nio.charset.UnsupportedCharsetException;

/** 
 * Quoted-printable codec test cases
 * 
 * @version $Id$
 */
public class QuotedPrintableCodecTest {
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
    public void testUTF8RoundTrip() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8RoundTrip");
        final String ru_msg = constructString(RUSSIAN_STUFF_UNICODE);
        final String ch_msg = constructString(SWISS_GERMAN_STUFF_UNICODE);
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),128,qpcodec,127,qpcodec.encode(ru_msg, org.apache.commons.codec.CharEncoding.UTF_8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),130,qpcodec,129,qpcodec.encode(ch_msg, org.apache.commons.codec.CharEncoding.UTF_8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),131,ru_msg);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),133,qpcodec,132,qpcodec.decode(qpcodec.encode(ru_msg, org.apache.commons.codec.CharEncoding.UTF_8), org.apache.commons.codec.CharEncoding.UTF_8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),134,ch_msg);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),136,qpcodec,135,qpcodec.decode(qpcodec.encode(ch_msg, org.apache.commons.codec.CharEncoding.UTF_8), org.apache.commons.codec.CharEncoding.UTF_8));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testBasicEncodeDecode() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBasicEncodeDecode");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec();
        final String plain = "= Hello there =\r\n";
        final String encoded = qpcodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),72,encoded);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),74,qpcodec,73,qpcodec.decode(encoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testBasicEncodeDecode_literalMutation31() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBasicEncodeDecode_literalMutation31");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec();
        final String plain = "foo";
        final String encoded = qpcodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),72,encoded);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),74,qpcodec,73,qpcodec.decode(encoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSafeCharEncodeDecode() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSafeCharEncodeDecode");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec();
        final String plain = "foo";
        final String encoded = qpcodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),98,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),99,encoded);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),100,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),102,qpcodec,101,qpcodec.decode(encoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUnsafeEncodeDecode() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsafeEncodeDecode");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec();
        final String plain = "=\r\n";
        final String encoded = qpcodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),68,encoded);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),69,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),150,qpcodec,149,qpcodec.decode(encoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUnsafeEncodeDecode_literalMutation78() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsafeEncodeDecode_literalMutation78");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec();
        final String plain = "foo";
        final String encoded = qpcodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),68,encoded);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),69,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),150,qpcodec,149,qpcodec.decode(encoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeDecodeNull() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeNull");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),83,qpcodec,82,qpcodec.encode(((java.lang.String)(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),85,qpcodec,84,qpcodec.decode(((java.lang.String)(null))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeInvalid_add10() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_add10");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec();
        try {
            qpcodec.decode("=");
        } catch (final DecoderException e) {
        }
        try {
            qpcodec.decode("=A");
            qpcodec.decode("=A");
        } catch (final DecoderException e) {
        }
        try {
            qpcodec.decode("=WW");
        } catch (final DecoderException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeInvalid_add11() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_add11");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec();
        try {
            qpcodec.decode("=");
        } catch (final DecoderException e) {
        }
        try {
            qpcodec.decode("=A");
        } catch (final DecoderException e) {
        }
        try {
            qpcodec.decode("=WW");
            qpcodec.decode("=WW");
        } catch (final DecoderException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeInvalid_add9() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_add9");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec();
        try {
            qpcodec.decode("=");
            qpcodec.decode("=");
        } catch (final DecoderException e) {
        }
        try {
            qpcodec.decode("=A");
        } catch (final DecoderException e) {
        }
        try {
            qpcodec.decode("=WW");
        } catch (final DecoderException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeInvalid() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec();
        try {
            qpcodec.decode("foo");
        } catch (final DecoderException e) {
        }
        try {
            qpcodec.decode("=A");
        } catch (final DecoderException e) {
        }
        try {
            qpcodec.decode("=WW");
        } catch (final DecoderException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeInvalid_literalMutation33() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_literalMutation33");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec();
        try {
            qpcodec.decode("=");
        } catch (final DecoderException e) {
        }
        try {
            qpcodec.decode("foo");
        } catch (final DecoderException e) {
        }
        try {
            qpcodec.decode("=WW");
        } catch (final DecoderException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeInvalid_literalMutation34() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_literalMutation34");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec();
        try {
            qpcodec.decode("=");
        } catch (final DecoderException e) {
        }
        try {
            qpcodec.decode("=A");
        } catch (final DecoderException e) {
        }
        try {
            qpcodec.decode("foo");
        } catch (final DecoderException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeNull() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeNull");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec();
        final byte[] plain = null;
        final byte[] encoded = qpcodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),86,encoded);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeUrlWithNullBitSet() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeUrlWithNullBitSet");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec();
        final String plain = "foo";
        final String encoded = new String(QuotedPrintableCodec.encodeQuotedPrintable(null, plain.getBytes(org.apache.commons.codec.Charsets.UTF_8)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),91,encoded);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),92,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),94,qpcodec,93,qpcodec.decode(encoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeWithNullArray() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeWithNullArray");
        final byte[] plain = null;
        final byte[] result = QuotedPrintableCodec.decodeQuotedPrintable(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),79,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeStringWithNull() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeStringWithNull");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec();
        final String test = null;
        final String result = qpcodec.encode(test, "charset");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),90,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeStringWithNull_literalMutation49() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeStringWithNull_literalMutation49");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec();
        final String test = null;
        final String result = qpcodec.encode(test, "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),90,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeStringWithNull() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeStringWithNull");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec();
        final String test = null;
        final String result = qpcodec.decode(test, "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),78,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeObjects() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeObjects");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec();
        final String plain = "1+1 = 2";
        String encoded = ((String)(qpcodec.encode(((Object)(plain)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),87,encoded);
        final byte[] plainBA = plain.getBytes(org.apache.commons.codec.Charsets.UTF_8);
        final byte[] encodedBA = ((byte[])(qpcodec.encode(((Object)(plainBA)))));
        encoded = new String(encodedBA);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),88,encoded);
        final Object result = qpcodec.encode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),89,result);
        try {
            final Object dObj = new Double(3.0);
            qpcodec.encode(dObj);
        } catch (final EncoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeObjects_add14() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeObjects_add14");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec();
        final String plain = "1+1 = 2";
        String encoded = ((String)(qpcodec.encode(((Object)(plain)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),87,encoded);
        final byte[] plainBA = plain.getBytes(org.apache.commons.codec.Charsets.UTF_8);
        final byte[] encodedBA = ((byte[])(qpcodec.encode(((Object)(plainBA)))));
        encoded = new String(encodedBA);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),88,encoded);
        final Object result = qpcodec.encode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),89,result);
        try {
            final Object dObj = new Double(3.0);
            qpcodec.encode(dObj);
            qpcodec.encode(dObj);
        } catch (final EncoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeObjects_literalMutation45() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeObjects_literalMutation45");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec();
        final String plain = "foo";
        String encoded = ((String)(qpcodec.encode(((Object)(plain)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),87,encoded);
        final byte[] plainBA = plain.getBytes(org.apache.commons.codec.Charsets.UTF_8);
        final byte[] encodedBA = ((byte[])(qpcodec.encode(((Object)(plainBA)))));
        encoded = new String(encodedBA);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),88,encoded);
        final Object result = qpcodec.encode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),89,result);
        try {
            final Object dObj = new Double(3.0);
            qpcodec.encode(dObj);
        } catch (final EncoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeObjects_literalMutation47() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeObjects_literalMutation47");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec();
        final String plain = "1+1 = 2";
        String encoded = ((String)(qpcodec.encode(((Object)(plain)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),87,encoded);
        final byte[] plainBA = plain.getBytes(org.apache.commons.codec.Charsets.UTF_8);
        final byte[] encodedBA = ((byte[])(qpcodec.encode(((Object)(plainBA)))));
        encoded = new String(encodedBA);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),88,encoded);
        final Object result = qpcodec.encode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),89,result);
        try {
            final Object dObj = new Double(2.0);
            qpcodec.encode(dObj);
        } catch (final EncoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = UnsupportedCharsetException.class)
    public void testInvalidEncoding() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidEncoding");
        new QuotedPrintableCodec("NONSENSE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = UnsupportedCharsetException.class)
    public void testInvalidEncoding_literalMutation54() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidEncoding_literalMutation54");
        new QuotedPrintableCodec("foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeObjects() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeObjects");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec();
        final String plain = "1+1 =3D 2";
        String decoded = ((String)(qpcodec.decode(((Object)(plain)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),75,decoded);
        final byte[] plainBA = plain.getBytes(org.apache.commons.codec.Charsets.UTF_8);
        final byte[] decodedBA = ((byte[])(qpcodec.decode(((Object)(plainBA)))));
        decoded = new String(decodedBA);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),76,decoded);
        final Object result = qpcodec.decode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),77,result);
        try {
            final Object dObj = new Double(3.0);
            qpcodec.decode(dObj);
        } catch (final DecoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeObjects_add12() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeObjects_add12");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec();
        final String plain = "1+1 =3D 2";
        String decoded = ((String)(qpcodec.decode(((Object)(plain)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),75,decoded);
        final byte[] plainBA = plain.getBytes(org.apache.commons.codec.Charsets.UTF_8);
        final byte[] decodedBA = ((byte[])(qpcodec.decode(((Object)(plainBA)))));
        decoded = new String(decodedBA);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),76,decoded);
        final Object result = qpcodec.decode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),77,result);
        try {
            final Object dObj = new Double(3.0);
            qpcodec.decode(dObj);
            qpcodec.decode(dObj);
        } catch (final DecoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeObjects_literalMutation35() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeObjects_literalMutation35");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec();
        final String plain = "foo";
        String decoded = ((String)(qpcodec.decode(((Object)(plain)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),75,decoded);
        final byte[] plainBA = plain.getBytes(org.apache.commons.codec.Charsets.UTF_8);
        final byte[] decodedBA = ((byte[])(qpcodec.decode(((Object)(plainBA)))));
        decoded = new String(decodedBA);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),76,decoded);
        final Object result = qpcodec.decode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),77,result);
        try {
            final Object dObj = new Double(3.0);
            qpcodec.decode(dObj);
        } catch (final DecoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeObjects_literalMutation37() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeObjects_literalMutation37");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec();
        final String plain = "1+1 =3D 2";
        String decoded = ((String)(qpcodec.decode(((Object)(plain)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),75,decoded);
        final byte[] plainBA = plain.getBytes(org.apache.commons.codec.Charsets.UTF_8);
        final byte[] decodedBA = ((byte[])(qpcodec.decode(((Object)(plainBA)))));
        decoded = new String(decodedBA);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),76,decoded);
        final Object result = qpcodec.decode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),77,result);
        try {
            final Object dObj = new Double(2.0);
            qpcodec.decode(dObj);
        } catch (final DecoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDefaultEncoding_add13() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultEncoding_add13");
        final String plain = "Hello there!";
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec("UnicodeBig");
        qpcodec.encode(plain);
        qpcodec.encode(plain);
        final String encoded1 = qpcodec.encode(plain, "UnicodeBig");
        final String encoded2 = qpcodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),80,encoded1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),81,encoded2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDefaultEncoding() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultEncoding");
        final String plain = "foo";
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec("UnicodeBig");
        qpcodec.encode(plain);
        final String encoded1 = qpcodec.encode(plain, "UnicodeBig");
        final String encoded2 = qpcodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),80,encoded1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),81,encoded2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDefaultEncoding_literalMutation42() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultEncoding_literalMutation42");
        final String plain = "Hello there!";
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec("foo");
        qpcodec.encode(plain);
        final String encoded1 = qpcodec.encode(plain, "UnicodeBig");
        final String encoded2 = qpcodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),80,encoded1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),81,encoded2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDefaultEncoding_literalMutation43() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultEncoding_literalMutation43");
        final String plain = "Hello there!";
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec("UnicodeBig");
        qpcodec.encode(plain);
        final String encoded1 = qpcodec.encode(plain, "foo");
        final String encoded2 = qpcodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),80,encoded1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),81,encoded2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDefaultEncoding_remove5() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultEncoding_remove5");
        final String plain = "Hello there!";
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec("UnicodeBig");
        final String encoded1 = qpcodec.encode(plain, "UnicodeBig");
        final String encoded2 = qpcodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),80,encoded1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),81,encoded2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSoftLineBreakDecode() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSoftLineBreakDecode");
        final String qpdata = "foo";
        final String expected = "If you believe that truth=beauty, then surely mathematics is the most beautiful branch of philosophy.";
        QuotedPrintableCodec qpcodec = new QuotedPrintableCodec();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),109,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),111,qpcodec,110,qpcodec.decode(qpdata));
        String encoded = qpcodec.encode(expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),112,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),114,qpcodec,113,qpcodec.decode(encoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSoftLineBreakDecode_literalMutation60() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSoftLineBreakDecode_literalMutation60");
        final String qpdata = "If you believe that truth=3Dbeauty, then surely=20=\r\nmathematics is the most beautiful branch of philosophy.";
        final String expected = "foo";
        QuotedPrintableCodec qpcodec = new QuotedPrintableCodec();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),109,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),111,qpcodec,110,qpcodec.decode(qpdata));
        String encoded = qpcodec.encode(expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),112,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),114,qpcodec,113,qpcodec.decode(encoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSoftLineBreakEncode() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSoftLineBreakEncode");
        final String qpdata = "foo";
        final String expected = "If you believe that truth=beauty, then surely mathematics is the most beautiful branch of philosophy.";
        QuotedPrintableCodec qpcodec = new QuotedPrintableCodec(true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),115,qpdata);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),117,qpcodec,116,qpcodec.encode(expected));
        String decoded = qpcodec.decode(qpdata);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),118,qpdata);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),120,qpcodec,119,qpcodec.encode(decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSoftLineBreakEncode_literalMutation62() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSoftLineBreakEncode_literalMutation62");
        final String qpdata = "If you believe that truth=3Dbeauty, then surely mathematics is the most b=\r\neautiful branch of philosophy.";
        final String expected = "foo";
        QuotedPrintableCodec qpcodec = new QuotedPrintableCodec(true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),115,qpdata);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),117,qpcodec,116,qpcodec.encode(expected));
        String decoded = qpcodec.decode(qpdata);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),118,qpdata);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),120,qpcodec,119,qpcodec.encode(decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSoftLineBreakEncode_literalMutation63() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSoftLineBreakEncode_literalMutation63");
        final String qpdata = "If you believe that truth=3Dbeauty, then surely mathematics is the most b=\r\neautiful branch of philosophy.";
        final String expected = "If you believe that truth=beauty, then surely mathematics is the most beautiful branch of philosophy.";
        QuotedPrintableCodec qpcodec = new QuotedPrintableCodec(false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),115,qpdata);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),117,qpcodec,116,qpcodec.encode(expected));
        String decoded = qpcodec.decode(qpdata);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),118,qpdata);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),120,qpcodec,119,qpcodec.encode(decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSkipNotEncodedCRLF() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipNotEncodedCRLF");
        String qpdata = "foo";
        String expected = "CRLF in an encoded text should be skipped in the decoding.";
        QuotedPrintableCodec qpcodec = new QuotedPrintableCodec(true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),103,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),105,qpcodec,104,qpcodec.decode(qpdata));
        String encoded = qpcodec.encode(expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),106,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),108,qpcodec,107,qpcodec.decode(encoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSkipNotEncodedCRLF_literalMutation57() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipNotEncodedCRLF_literalMutation57");
        String qpdata = "CRLF in an\n encoded text should be=20=\r\n\rskipped in the\r decoding.";
        String expected = "foo";
        QuotedPrintableCodec qpcodec = new QuotedPrintableCodec(true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),103,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),105,qpcodec,104,qpcodec.decode(qpdata));
        String encoded = qpcodec.encode(expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),106,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),108,qpcodec,107,qpcodec.decode(encoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSkipNotEncodedCRLF_literalMutation58() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipNotEncodedCRLF_literalMutation58");
        String qpdata = "CRLF in an\n encoded text should be=20=\r\n\rskipped in the\r decoding.";
        String expected = "CRLF in an encoded text should be skipped in the decoding.";
        QuotedPrintableCodec qpcodec = new QuotedPrintableCodec(true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),103,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),105,qpcodec,104,qpcodec.decode(qpdata));
        String encoded = qpcodec.encode(expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),106,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),108,qpcodec,107,qpcodec.decode(encoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testTrailingSpecial() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTrailingSpecial");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec(false);
        String plain = "This is a example of a quoted-printable text file. This might contain sp=cial chars.";
        String expected = "This is a example of a quoted-printable text file. This might contain sp=3D=\r\ncial chars.";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),121,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),123,qpcodec,122,qpcodec.encode(plain));
        plain = "This is a example of a quoted-printable text file. This might contain ta\tbs as well.";
        expected = "This is a example of a quoted-printable text file. This might contain ta=09=\r\nbs as well.";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),124,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),126,qpcodec,125,qpcodec.encode(plain));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testTrailingSpecial_literalMutation65() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTrailingSpecial_literalMutation65");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec(true);
        String plain = "foo";
        String expected = "This is a example of a quoted-printable text file. This might contain sp=3D=\r\ncial chars.";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),121,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),123,qpcodec,122,qpcodec.encode(plain));
        plain = "This is a example of a quoted-printable text file. This might contain ta\tbs as well.";
        expected = "This is a example of a quoted-printable text file. This might contain ta=09=\r\nbs as well.";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),124,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),126,qpcodec,125,qpcodec.encode(plain));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testTrailingSpecial_literalMutation66() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTrailingSpecial_literalMutation66");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec(true);
        String plain = "This is a example of a quoted-printable text file. This might contain sp=cial chars.";
        String expected = "foo";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),121,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),123,qpcodec,122,qpcodec.encode(plain));
        plain = "This is a example of a quoted-printable text file. This might contain ta\tbs as well.";
        expected = "This is a example of a quoted-printable text file. This might contain ta=09=\r\nbs as well.";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),124,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),126,qpcodec,125,qpcodec.encode(plain));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testTrailingSpecial_literalMutation67() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTrailingSpecial_literalMutation67");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec(true);
        String plain = "This is a example of a quoted-printable text file. This might contain sp=cial chars.";
        String expected = "This is a example of a quoted-printable text file. This might contain sp=3D=\r\ncial chars.";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),121,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),123,qpcodec,122,qpcodec.encode(plain));
        plain = "foo";
        expected = "This is a example of a quoted-printable text file. This might contain ta=09=\r\nbs as well.";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),124,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),126,qpcodec,125,qpcodec.encode(plain));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testTrailingSpecial_literalMutation68() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTrailingSpecial_literalMutation68");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec(true);
        String plain = "This is a example of a quoted-printable text file. This might contain sp=cial chars.";
        String expected = "This is a example of a quoted-printable text file. This might contain sp=3D=\r\ncial chars.";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),121,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),123,qpcodec,122,qpcodec.encode(plain));
        plain = "This is a example of a quoted-printable text file. This might contain ta\tbs as well.";
        expected = "foo";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),124,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),126,qpcodec,125,qpcodec.encode(plain));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUltimateSoftBreak() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUltimateSoftBreak");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec(true);
        String plain = "This is a example of a quoted-printable text file. There is no end to it\t";
        String expected = "This is a example of a quoted-printable text file. There is no end to i=\r\nt=09";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),137,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),139,qpcodec,138,qpcodec.encode(plain));
        plain = "This is a example of a quoted-printable text file. There is no end to it ";
        expected = "This is a example of a quoted-printable text file. There is no end to i=\r\nt=20";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),140,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),142,qpcodec,141,qpcodec.encode(plain));
        plain = "This is a example of a quoted-printable text file. There is no end to   ";
        expected = "This is a example of a quoted-printable text file. There is no end to=20=\r\n =20";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),143,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),145,qpcodec,144,qpcodec.encode(plain));
        plain = "This is a example of a quoted-printable text file. There is no end to=  ";
        expected = "This is a example of a quoted-printable text file. There is no end to=3D=\r\n =20";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),146,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),148,qpcodec,147,qpcodec.encode(plain));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUltimateSoftBreak_literalMutation70() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUltimateSoftBreak_literalMutation70");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec(true);
        String plain = "foo";
        String expected = "This is a example of a quoted-printable text file. There is no end to i=\r\nt=09";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),137,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),139,qpcodec,138,qpcodec.encode(plain));
        plain = "This is a example of a quoted-printable text file. There is no end to it ";
        expected = "This is a example of a quoted-printable text file. There is no end to i=\r\nt=20";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),140,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),142,qpcodec,141,qpcodec.encode(plain));
        plain = "This is a example of a quoted-printable text file. There is no end to   ";
        expected = "This is a example of a quoted-printable text file. There is no end to=20=\r\n =20";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),143,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),145,qpcodec,144,qpcodec.encode(plain));
        plain = "This is a example of a quoted-printable text file. There is no end to=  ";
        expected = "This is a example of a quoted-printable text file. There is no end to=3D=\r\n =20";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),146,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),148,qpcodec,147,qpcodec.encode(plain));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUltimateSoftBreak_literalMutation71() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUltimateSoftBreak_literalMutation71");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec(true);
        String plain = "This is a example of a quoted-printable text file. There is no end to it\t";
        String expected = "foo";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),137,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),139,qpcodec,138,qpcodec.encode(plain));
        plain = "This is a example of a quoted-printable text file. There is no end to it ";
        expected = "This is a example of a quoted-printable text file. There is no end to i=\r\nt=20";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),140,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),142,qpcodec,141,qpcodec.encode(plain));
        plain = "This is a example of a quoted-printable text file. There is no end to   ";
        expected = "This is a example of a quoted-printable text file. There is no end to=20=\r\n =20";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),143,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),145,qpcodec,144,qpcodec.encode(plain));
        plain = "This is a example of a quoted-printable text file. There is no end to=  ";
        expected = "This is a example of a quoted-printable text file. There is no end to=3D=\r\n =20";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),146,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),148,qpcodec,147,qpcodec.encode(plain));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUltimateSoftBreak_literalMutation72() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUltimateSoftBreak_literalMutation72");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec(true);
        String plain = "This is a example of a quoted-printable text file. There is no end to it\t";
        String expected = "This is a example of a quoted-printable text file. There is no end to i=\r\nt=09";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),137,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),139,qpcodec,138,qpcodec.encode(plain));
        plain = "foo";
        expected = "This is a example of a quoted-printable text file. There is no end to i=\r\nt=20";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),140,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),142,qpcodec,141,qpcodec.encode(plain));
        plain = "This is a example of a quoted-printable text file. There is no end to   ";
        expected = "This is a example of a quoted-printable text file. There is no end to=20=\r\n =20";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),143,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),145,qpcodec,144,qpcodec.encode(plain));
        plain = "This is a example of a quoted-printable text file. There is no end to=  ";
        expected = "This is a example of a quoted-printable text file. There is no end to=3D=\r\n =20";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),146,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),148,qpcodec,147,qpcodec.encode(plain));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUltimateSoftBreak_literalMutation73() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUltimateSoftBreak_literalMutation73");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec(true);
        String plain = "This is a example of a quoted-printable text file. There is no end to it\t";
        String expected = "This is a example of a quoted-printable text file. There is no end to i=\r\nt=09";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),137,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),139,qpcodec,138,qpcodec.encode(plain));
        plain = "This is a example of a quoted-printable text file. There is no end to it ";
        expected = "foo";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),140,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),142,qpcodec,141,qpcodec.encode(plain));
        plain = "This is a example of a quoted-printable text file. There is no end to   ";
        expected = "This is a example of a quoted-printable text file. There is no end to=20=\r\n =20";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),143,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),145,qpcodec,144,qpcodec.encode(plain));
        plain = "This is a example of a quoted-printable text file. There is no end to=  ";
        expected = "This is a example of a quoted-printable text file. There is no end to=3D=\r\n =20";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),146,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),148,qpcodec,147,qpcodec.encode(plain));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUltimateSoftBreak_literalMutation74() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUltimateSoftBreak_literalMutation74");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec(true);
        String plain = "This is a example of a quoted-printable text file. There is no end to it\t";
        String expected = "This is a example of a quoted-printable text file. There is no end to i=\r\nt=09";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),137,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),139,qpcodec,138,qpcodec.encode(plain));
        plain = "This is a example of a quoted-printable text file. There is no end to it ";
        expected = "This is a example of a quoted-printable text file. There is no end to i=\r\nt=20";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),140,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),142,qpcodec,141,qpcodec.encode(plain));
        plain = "foo";
        expected = "This is a example of a quoted-printable text file. There is no end to=20=\r\n =20";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),143,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),145,qpcodec,144,qpcodec.encode(plain));
        plain = "This is a example of a quoted-printable text file. There is no end to=  ";
        expected = "This is a example of a quoted-printable text file. There is no end to=3D=\r\n =20";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),146,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),148,qpcodec,147,qpcodec.encode(plain));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUltimateSoftBreak_literalMutation75() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUltimateSoftBreak_literalMutation75");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec(true);
        String plain = "This is a example of a quoted-printable text file. There is no end to it\t";
        String expected = "This is a example of a quoted-printable text file. There is no end to i=\r\nt=09";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),137,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),139,qpcodec,138,qpcodec.encode(plain));
        plain = "This is a example of a quoted-printable text file. There is no end to it ";
        expected = "This is a example of a quoted-printable text file. There is no end to i=\r\nt=20";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),140,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),142,qpcodec,141,qpcodec.encode(plain));
        plain = "This is a example of a quoted-printable text file. There is no end to   ";
        expected = "foo";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),143,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),145,qpcodec,144,qpcodec.encode(plain));
        plain = "This is a example of a quoted-printable text file. There is no end to=  ";
        expected = "This is a example of a quoted-printable text file. There is no end to=3D=\r\n =20";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),146,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),148,qpcodec,147,qpcodec.encode(plain));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUltimateSoftBreak_literalMutation76() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUltimateSoftBreak_literalMutation76");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec(true);
        String plain = "This is a example of a quoted-printable text file. There is no end to it\t";
        String expected = "This is a example of a quoted-printable text file. There is no end to i=\r\nt=09";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),137,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),139,qpcodec,138,qpcodec.encode(plain));
        plain = "This is a example of a quoted-printable text file. There is no end to it ";
        expected = "This is a example of a quoted-printable text file. There is no end to i=\r\nt=20";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),140,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),142,qpcodec,141,qpcodec.encode(plain));
        plain = "This is a example of a quoted-printable text file. There is no end to   ";
        expected = "This is a example of a quoted-printable text file. There is no end to=20=\r\n =20";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),143,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),145,qpcodec,144,qpcodec.encode(plain));
        plain = "foo";
        expected = "This is a example of a quoted-printable text file. There is no end to=3D=\r\n =20";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),146,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),148,qpcodec,147,qpcodec.encode(plain));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUltimateSoftBreak_literalMutation77() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUltimateSoftBreak_literalMutation77");
        final QuotedPrintableCodec qpcodec = new QuotedPrintableCodec(true);
        String plain = "This is a example of a quoted-printable text file. There is no end to it\t";
        String expected = "This is a example of a quoted-printable text file. There is no end to i=\r\nt=09";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),137,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),139,qpcodec,138,qpcodec.encode(plain));
        plain = "This is a example of a quoted-printable text file. There is no end to it ";
        expected = "This is a example of a quoted-printable text file. There is no end to i=\r\nt=20";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),140,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),142,qpcodec,141,qpcodec.encode(plain));
        plain = "This is a example of a quoted-printable text file. There is no end to   ";
        expected = "This is a example of a quoted-printable text file. There is no end to=20=\r\n =20";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),143,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),145,qpcodec,144,qpcodec.encode(plain));
        plain = "This is a example of a quoted-printable text file. There is no end to=  ";
        expected = "foo";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),146,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),148,qpcodec,147,qpcodec.encode(plain));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testFinalBytes() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFinalBytes");
        final String plain = "foo";
        final String expected = "This is a example of a quoted=3Dprintable text file. There is no tt";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),95,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),97,new org.apache.commons.codec.net.QuotedPrintableCodec(true),96,new org.apache.commons.codec.net.QuotedPrintableCodec(true).encode(plain));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testFinalBytes_literalMutation53() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFinalBytes_literalMutation53");
        final String plain = "This is a example of a quoted=printable text file. There is no tt";
        final String expected = "foo";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),95,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),97,new org.apache.commons.codec.net.QuotedPrintableCodec(true),96,new org.apache.commons.codec.net.QuotedPrintableCodec(true).encode(plain));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


package org.apache.commons.codec.net;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Test;
import java.io.UnsupportedEncodingException;

/** 
 * URL codec test cases
 * 
 * @version $Id$
 */
public class URLCodecTest {
    static final int[] SWISS_GERMAN_STUFF_UNICODE = new int[]{ 71 , 114 , 252 , 101 , 122 , 105 , 95 , 122 , 228 , 109 , 228 };

    static final int[] RUSSIAN_STUFF_UNICODE = new int[]{ 1042 , 1089 , 1077 , 1084 , 95 , 1087 , 1088 , 1080 , 1074 , 1077 , 1090 };

    private void validateState(final URLCodec urlCodec) {
    }

    private String constructString(final int[] unicodeChars) {
        final StringBuilder buffer = new StringBuilder();
        if (unicodeChars != null) {
            for (final int unicodeChar : unicodeChars) {
                buffer.append(((char)(unicodeChar)));
            }
        } 
        return buffer.toString();
    }

    @Test(timeout = 1000)
    public void testUTF8RoundTrip() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8RoundTrip");
        final String ru_msg = constructString(RUSSIAN_STUFF_UNICODE);
        final String ch_msg = constructString(SWISS_GERMAN_STUFF_UNICODE);
        final URLCodec urlCodec = new URLCodec();
        validateState(urlCodec);
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),189,urlCodec,188,urlCodec.encode(ru_msg, org.apache.commons.codec.CharEncoding.UTF_8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),191,urlCodec,190,urlCodec.encode(ch_msg, org.apache.commons.codec.CharEncoding.UTF_8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),192,ru_msg);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),194,urlCodec,193,urlCodec.decode(urlCodec.encode(ru_msg, org.apache.commons.codec.CharEncoding.UTF_8), org.apache.commons.codec.CharEncoding.UTF_8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),195,ch_msg);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),197,urlCodec,196,urlCodec.decode(urlCodec.encode(ch_msg, org.apache.commons.codec.CharEncoding.UTF_8), org.apache.commons.codec.CharEncoding.UTF_8));
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF8RoundTrip_add48() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8RoundTrip_add48");
        final String ru_msg = constructString(RUSSIAN_STUFF_UNICODE);
        final String ch_msg = constructString(SWISS_GERMAN_STUFF_UNICODE);
        final URLCodec urlCodec = new URLCodec();
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),189,urlCodec,188,urlCodec.encode(ru_msg, org.apache.commons.codec.CharEncoding.UTF_8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),191,urlCodec,190,urlCodec.encode(ch_msg, org.apache.commons.codec.CharEncoding.UTF_8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),192,ru_msg);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),194,urlCodec,193,urlCodec.decode(urlCodec.encode(ru_msg, org.apache.commons.codec.CharEncoding.UTF_8), org.apache.commons.codec.CharEncoding.UTF_8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),195,ch_msg);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),197,urlCodec,196,urlCodec.decode(urlCodec.encode(ch_msg, org.apache.commons.codec.CharEncoding.UTF_8), org.apache.commons.codec.CharEncoding.UTF_8));
        validateState(urlCodec);
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF8RoundTrip_remove30() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8RoundTrip_remove30");
        final String ru_msg = constructString(RUSSIAN_STUFF_UNICODE);
        final String ch_msg = constructString(SWISS_GERMAN_STUFF_UNICODE);
        final URLCodec urlCodec = new URLCodec();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),189,urlCodec,188,urlCodec.encode(ru_msg, org.apache.commons.codec.CharEncoding.UTF_8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),191,urlCodec,190,urlCodec.encode(ch_msg, org.apache.commons.codec.CharEncoding.UTF_8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),192,ru_msg);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),194,urlCodec,193,urlCodec.decode(urlCodec.encode(ru_msg, org.apache.commons.codec.CharEncoding.UTF_8), org.apache.commons.codec.CharEncoding.UTF_8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),195,ch_msg);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),197,urlCodec,196,urlCodec.decode(urlCodec.encode(ch_msg, org.apache.commons.codec.CharEncoding.UTF_8), org.apache.commons.codec.CharEncoding.UTF_8));
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF8RoundTrip_remove31() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8RoundTrip_remove31");
        final String ru_msg = constructString(RUSSIAN_STUFF_UNICODE);
        final String ch_msg = constructString(SWISS_GERMAN_STUFF_UNICODE);
        final URLCodec urlCodec = new URLCodec();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),189,urlCodec,188,urlCodec.encode(ru_msg, org.apache.commons.codec.CharEncoding.UTF_8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),191,urlCodec,190,urlCodec.encode(ch_msg, org.apache.commons.codec.CharEncoding.UTF_8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),192,ru_msg);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),194,urlCodec,193,urlCodec.decode(urlCodec.encode(ru_msg, org.apache.commons.codec.CharEncoding.UTF_8), org.apache.commons.codec.CharEncoding.UTF_8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),195,ch_msg);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),197,urlCodec,196,urlCodec.decode(urlCodec.encode(ch_msg, org.apache.commons.codec.CharEncoding.UTF_8), org.apache.commons.codec.CharEncoding.UTF_8));
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testBasicEncodeDecode() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBasicEncodeDecode");
        final URLCodec urlCodec = new URLCodec();
        final String plain = "Hello there!";
        final String encoded = urlCodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),155,encoded);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),156,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),158,urlCodec,157,urlCodec.decode(encoded));
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBasicEncodeDecode_add27() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBasicEncodeDecode_add27");
        final URLCodec urlCodec = new URLCodec();
        final String plain = "Hello there!";
        final String encoded = urlCodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),155,encoded);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),156,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),158,urlCodec,157,urlCodec.decode(encoded));
        validateState(urlCodec);
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testBasicEncodeDecode_literalMutation91() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBasicEncodeDecode_literalMutation91");
        final URLCodec urlCodec = new URLCodec();
        final String plain = "foo";
        final String encoded = urlCodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),155,encoded);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),156,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),158,urlCodec,157,urlCodec.decode(encoded));
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBasicEncodeDecode_remove18() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBasicEncodeDecode_remove18");
        final URLCodec urlCodec = new URLCodec();
        final String plain = "Hello there!";
        final String encoded = urlCodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),155,encoded);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),156,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),158,urlCodec,157,urlCodec.decode(encoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSafeCharEncodeDecode() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSafeCharEncodeDecode");
        final URLCodec urlCodec = new URLCodec();
        final String plain = "abc123_-.*";
        final String encoded = urlCodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),183,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),184,encoded);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),185,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),187,urlCodec,186,urlCodec.decode(encoded));
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSafeCharEncodeDecode_add46() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSafeCharEncodeDecode_add46");
        final URLCodec urlCodec = new URLCodec();
        final String plain = "abc123_-.*";
        final String encoded = urlCodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),183,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),184,encoded);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),185,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),187,urlCodec,186,urlCodec.decode(encoded));
        validateState(urlCodec);
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSafeCharEncodeDecode_literalMutation117() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSafeCharEncodeDecode_literalMutation117");
        final URLCodec urlCodec = new URLCodec();
        final String plain = "foo";
        final String encoded = urlCodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),183,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),184,encoded);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),185,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),187,urlCodec,186,urlCodec.decode(encoded));
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSafeCharEncodeDecode_remove29() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSafeCharEncodeDecode_remove29");
        final URLCodec urlCodec = new URLCodec();
        final String plain = "abc123_-.*";
        final String encoded = urlCodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),183,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),184,encoded);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),185,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),187,urlCodec,186,urlCodec.decode(encoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUnsafeEncodeDecode() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsafeEncodeDecode");
        final URLCodec urlCodec = new URLCodec();
        final String plain = "~!@#$%^&()+{}\"\\;:`,/[]";
        final String encoded = urlCodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),11,encoded);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),198,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),200,urlCodec,199,urlCodec.decode(encoded));
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUnsafeEncodeDecode_add49() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsafeEncodeDecode_add49");
        final URLCodec urlCodec = new URLCodec();
        final String plain = "~!@#$%^&()+{}\"\\;:`,/[]";
        final String encoded = urlCodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),11,encoded);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),198,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),200,urlCodec,199,urlCodec.decode(encoded));
        validateState(urlCodec);
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUnsafeEncodeDecode_literalMutation118() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsafeEncodeDecode_literalMutation118");
        final URLCodec urlCodec = new URLCodec();
        final String plain = "foo";
        final String encoded = urlCodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),11,encoded);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),198,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),200,urlCodec,199,urlCodec.decode(encoded));
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUnsafeEncodeDecode_remove32() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsafeEncodeDecode_remove32");
        final URLCodec urlCodec = new URLCodec();
        final String plain = "~!@#$%^&()+{}\"\\;:`,/[]";
        final String encoded = urlCodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),11,encoded);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),198,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),200,urlCodec,199,urlCodec.decode(encoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeDecodeNull() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeNull");
        final URLCodec urlCodec = new URLCodec();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),171,urlCodec,170,urlCodec.encode(((java.lang.String)(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),173,urlCodec,172,urlCodec.decode(((java.lang.String)(null))));
        validateState(urlCodec);
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeDecodeNull_remove24() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeNull_remove24");
        final URLCodec urlCodec = new URLCodec();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),171,urlCodec,170,urlCodec.encode(((java.lang.String)(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),173,urlCodec,172,urlCodec.decode(((java.lang.String)(null))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeInvalid() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid");
        final URLCodec urlCodec = new URLCodec();
        try {
            urlCodec.decode("%");
        } catch (final DecoderException e) {
        }
        try {
            urlCodec.decode("%A");
        } catch (final DecoderException e) {
        }
        try {
            urlCodec.decode("%WW");
        } catch (final DecoderException e) {
        }
        try {
            urlCodec.decode("%0W");
        } catch (final DecoderException e) {
        }
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeInvalid_add28() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_add28");
        final URLCodec urlCodec = new URLCodec();
        try {
            urlCodec.decode("%");
            urlCodec.decode("%");
        } catch (final DecoderException e) {
        }
        try {
            urlCodec.decode("%A");
        } catch (final DecoderException e) {
        }
        try {
            urlCodec.decode("%WW");
        } catch (final DecoderException e) {
        }
        try {
            urlCodec.decode("%0W");
        } catch (final DecoderException e) {
        }
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeInvalid_add29() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_add29");
        final URLCodec urlCodec = new URLCodec();
        try {
            urlCodec.decode("%");
        } catch (final DecoderException e) {
        }
        try {
            urlCodec.decode("%A");
            urlCodec.decode("%A");
        } catch (final DecoderException e) {
        }
        try {
            urlCodec.decode("%WW");
        } catch (final DecoderException e) {
        }
        try {
            urlCodec.decode("%0W");
        } catch (final DecoderException e) {
        }
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeInvalid_add30() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_add30");
        final URLCodec urlCodec = new URLCodec();
        try {
            urlCodec.decode("%");
        } catch (final DecoderException e) {
        }
        try {
            urlCodec.decode("%A");
        } catch (final DecoderException e) {
        }
        try {
            urlCodec.decode("%WW");
            urlCodec.decode("%WW");
        } catch (final DecoderException e) {
        }
        try {
            urlCodec.decode("%0W");
        } catch (final DecoderException e) {
        }
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeInvalid_add31() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_add31");
        final URLCodec urlCodec = new URLCodec();
        try {
            urlCodec.decode("%");
        } catch (final DecoderException e) {
        }
        try {
            urlCodec.decode("%A");
        } catch (final DecoderException e) {
        }
        try {
            urlCodec.decode("%WW");
        } catch (final DecoderException e) {
        }
        try {
            urlCodec.decode("%0W");
            urlCodec.decode("%0W");
        } catch (final DecoderException e) {
        }
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeInvalid_add32() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_add32");
        final URLCodec urlCodec = new URLCodec();
        try {
            urlCodec.decode("%");
        } catch (final DecoderException e) {
        }
        try {
            urlCodec.decode("%A");
        } catch (final DecoderException e) {
        }
        try {
            urlCodec.decode("%WW");
        } catch (final DecoderException e) {
        }
        try {
            urlCodec.decode("%0W");
        } catch (final DecoderException e) {
        }
        validateState(urlCodec);
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeInvalid_literalMutation92() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_literalMutation92");
        final URLCodec urlCodec = new URLCodec();
        try {
            urlCodec.decode("foo");
        } catch (final DecoderException e) {
        }
        try {
            urlCodec.decode("%A");
        } catch (final DecoderException e) {
        }
        try {
            urlCodec.decode("%WW");
        } catch (final DecoderException e) {
        }
        try {
            urlCodec.decode("%0W");
        } catch (final DecoderException e) {
        }
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeInvalid_literalMutation93() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_literalMutation93");
        final URLCodec urlCodec = new URLCodec();
        try {
            urlCodec.decode("%");
        } catch (final DecoderException e) {
        }
        try {
            urlCodec.decode("foo");
        } catch (final DecoderException e) {
        }
        try {
            urlCodec.decode("%WW");
        } catch (final DecoderException e) {
        }
        try {
            urlCodec.decode("%0W");
        } catch (final DecoderException e) {
        }
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeInvalid_literalMutation94() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_literalMutation94");
        final URLCodec urlCodec = new URLCodec();
        try {
            urlCodec.decode("%");
        } catch (final DecoderException e) {
        }
        try {
            urlCodec.decode("%A");
        } catch (final DecoderException e) {
        }
        try {
            urlCodec.decode("foo");
        } catch (final DecoderException e) {
        }
        try {
            urlCodec.decode("%0W");
        } catch (final DecoderException e) {
        }
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeInvalid_literalMutation95() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_literalMutation95");
        final URLCodec urlCodec = new URLCodec();
        try {
            urlCodec.decode("%");
        } catch (final DecoderException e) {
        }
        try {
            urlCodec.decode("%A");
        } catch (final DecoderException e) {
        }
        try {
            urlCodec.decode("%WW");
        } catch (final DecoderException e) {
        }
        try {
            urlCodec.decode("foo");
        } catch (final DecoderException e) {
        }
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeInvalid_remove19() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalid_remove19");
        final URLCodec urlCodec = new URLCodec();
        try {
            urlCodec.decode("%");
        } catch (final DecoderException e) {
        }
        try {
            urlCodec.decode("%A");
        } catch (final DecoderException e) {
        }
        try {
            urlCodec.decode("%WW");
        } catch (final DecoderException e) {
        }
        try {
            urlCodec.decode("%0W");
        } catch (final DecoderException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeInvalidContent_add33() throws UnsupportedEncodingException, DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalidContent_add33");
        final String ch_msg = constructString(SWISS_GERMAN_STUFF_UNICODE);
        final URLCodec urlCodec = new URLCodec();
        final byte[] input = ch_msg.getBytes("ISO-8859-1");
        final byte[] output = urlCodec.decode(input);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),159,input.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),160,output.length);
        for (int i = 0 ; i < (input.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),161,input[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),162,output[i]);
        }
        validateState(urlCodec);
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeInvalidContent() throws UnsupportedEncodingException, DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalidContent");
        final String ch_msg = constructString(SWISS_GERMAN_STUFF_UNICODE);
        final URLCodec urlCodec = new URLCodec();
        final byte[] input = ch_msg.getBytes("foo");
        final byte[] output = urlCodec.decode(input);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),159,input.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),160,output.length);
        for (int i = 0 ; i < (input.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),161,input[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),162,output[i]);
        }
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeInvalidContent_literalMutation97() throws UnsupportedEncodingException, DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalidContent_literalMutation97");
        final String ch_msg = constructString(SWISS_GERMAN_STUFF_UNICODE);
        final URLCodec urlCodec = new URLCodec();
        final byte[] input = ch_msg.getBytes("ISO-8859-1");
        final byte[] output = urlCodec.decode(input);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),159,input.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),160,output.length);
        for (int i = -1 ; i < (input.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),161,input[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),162,output[i]);
        }
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeInvalidContent_remove20() throws UnsupportedEncodingException, DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeInvalidContent_remove20");
        final String ch_msg = constructString(SWISS_GERMAN_STUFF_UNICODE);
        final URLCodec urlCodec = new URLCodec();
        final byte[] input = ch_msg.getBytes("ISO-8859-1");
        final byte[] output = urlCodec.decode(input);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),159,input.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),160,output.length);
        for (int i = 0 ; i < (input.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),161,input[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),162,output[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeNull() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeNull");
        final URLCodec urlCodec = new URLCodec();
        final byte[] plain = null;
        final byte[] encoded = urlCodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),174,encoded);
        validateState(urlCodec);
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeNull_remove25() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeNull_remove25");
        final URLCodec urlCodec = new URLCodec();
        final byte[] plain = null;
        final byte[] encoded = urlCodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),174,encoded);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeUrlWithNullBitSet() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeUrlWithNullBitSet");
        final URLCodec urlCodec = new URLCodec();
        final String plain = "Hello there!";
        final String encoded = new String(URLCodec.encodeUrl(null, plain.getBytes(org.apache.commons.codec.Charsets.UTF_8)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),179,encoded);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),180,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),182,urlCodec,181,urlCodec.decode(encoded));
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeUrlWithNullBitSet_add42() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeUrlWithNullBitSet_add42");
        final URLCodec urlCodec = new URLCodec();
        final String plain = "Hello there!";
        final String encoded = new String(URLCodec.encodeUrl(null, plain.getBytes(org.apache.commons.codec.Charsets.UTF_8)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),179,encoded);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),180,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),182,urlCodec,181,urlCodec.decode(encoded));
        validateState(urlCodec);
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeUrlWithNullBitSet_literalMutation113() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeUrlWithNullBitSet_literalMutation113");
        final URLCodec urlCodec = new URLCodec();
        final String plain = "foo";
        final String encoded = new String(URLCodec.encodeUrl(null, plain.getBytes(org.apache.commons.codec.Charsets.UTF_8)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),179,encoded);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),180,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),182,urlCodec,181,urlCodec.decode(encoded));
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeUrlWithNullBitSet_remove27() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeUrlWithNullBitSet_remove27");
        final URLCodec urlCodec = new URLCodec();
        final String plain = "Hello there!";
        final String encoded = new String(URLCodec.encodeUrl(null, plain.getBytes(org.apache.commons.codec.Charsets.UTF_8)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),179,encoded);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),180,plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),182,urlCodec,181,urlCodec.decode(encoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeWithNullArray() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeWithNullArray");
        final byte[] plain = null;
        final byte[] result = URLCodec.decodeUrl(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),167,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeStringWithNull() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeStringWithNull");
        final URLCodec urlCodec = new URLCodec();
        final String test = null;
        final String result = urlCodec.encode(test, "charset");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),178,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeStringWithNull_literalMutation112() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeStringWithNull_literalMutation112");
        final URLCodec urlCodec = new URLCodec();
        final String test = null;
        final String result = urlCodec.encode(test, "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),178,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeStringWithNull() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeStringWithNull");
        final URLCodec urlCodec = new URLCodec();
        final String test = null;
        final String result = urlCodec.decode(test, "charset");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),166,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeStringWithNull_literalMutation102() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeStringWithNull_literalMutation102");
        final URLCodec urlCodec = new URLCodec();
        final String test = null;
        final String result = urlCodec.decode(test, "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),166,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeObjects() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeObjects");
        final URLCodec urlCodec = new URLCodec();
        final String plain = "Hello there!";
        String encoded = ((String)(urlCodec.encode(((Object)(plain)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),175,encoded);
        final byte[] plainBA = plain.getBytes(org.apache.commons.codec.Charsets.UTF_8);
        final byte[] encodedBA = ((byte[])(urlCodec.encode(((Object)(plainBA)))));
        encoded = new String(encodedBA);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),176,encoded);
        final Object result = urlCodec.encode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),177,result);
        try {
            final Object dObj = new Double(3.0);
            urlCodec.encode(dObj);
        } catch (final EncoderException ee) {
        }
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeObjects_add40() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeObjects_add40");
        final URLCodec urlCodec = new URLCodec();
        final String plain = "Hello there!";
        String encoded = ((String)(urlCodec.encode(((Object)(plain)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),175,encoded);
        final byte[] plainBA = plain.getBytes(org.apache.commons.codec.Charsets.UTF_8);
        final byte[] encodedBA = ((byte[])(urlCodec.encode(((Object)(plainBA)))));
        encoded = new String(encodedBA);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),176,encoded);
        final Object result = urlCodec.encode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),177,result);
        try {
            final Object dObj = new Double(3.0);
            urlCodec.encode(dObj);
            urlCodec.encode(dObj);
        } catch (final EncoderException ee) {
        }
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeObjects_add41() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeObjects_add41");
        final URLCodec urlCodec = new URLCodec();
        final String plain = "Hello there!";
        String encoded = ((String)(urlCodec.encode(((Object)(plain)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),175,encoded);
        final byte[] plainBA = plain.getBytes(org.apache.commons.codec.Charsets.UTF_8);
        final byte[] encodedBA = ((byte[])(urlCodec.encode(((Object)(plainBA)))));
        encoded = new String(encodedBA);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),176,encoded);
        final Object result = urlCodec.encode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),177,result);
        try {
            final Object dObj = new Double(3.0);
            urlCodec.encode(dObj);
        } catch (final EncoderException ee) {
        }
        validateState(urlCodec);
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeObjects_literalMutation108() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeObjects_literalMutation108");
        final URLCodec urlCodec = new URLCodec();
        final String plain = "foo";
        String encoded = ((String)(urlCodec.encode(((Object)(plain)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),175,encoded);
        final byte[] plainBA = plain.getBytes(org.apache.commons.codec.Charsets.UTF_8);
        final byte[] encodedBA = ((byte[])(urlCodec.encode(((Object)(plainBA)))));
        encoded = new String(encodedBA);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),176,encoded);
        final Object result = urlCodec.encode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),177,result);
        try {
            final Object dObj = new Double(3.0);
            urlCodec.encode(dObj);
        } catch (final EncoderException ee) {
        }
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeObjects_literalMutation110() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeObjects_literalMutation110");
        final URLCodec urlCodec = new URLCodec();
        final String plain = "Hello there!";
        String encoded = ((String)(urlCodec.encode(((Object)(plain)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),175,encoded);
        final byte[] plainBA = plain.getBytes(org.apache.commons.codec.Charsets.UTF_8);
        final byte[] encodedBA = ((byte[])(urlCodec.encode(((Object)(plainBA)))));
        encoded = new String(encodedBA);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),176,encoded);
        final Object result = urlCodec.encode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),177,result);
        try {
            final Object dObj = new Double(4.0);
            urlCodec.encode(dObj);
        } catch (final EncoderException ee) {
        }
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeObjects_remove26() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeObjects_remove26");
        final URLCodec urlCodec = new URLCodec();
        final String plain = "Hello there!";
        String encoded = ((String)(urlCodec.encode(((Object)(plain)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),175,encoded);
        final byte[] plainBA = plain.getBytes(org.apache.commons.codec.Charsets.UTF_8);
        final byte[] encodedBA = ((byte[])(urlCodec.encode(((Object)(plainBA)))));
        encoded = new String(encodedBA);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),176,encoded);
        final Object result = urlCodec.encode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),177,result);
        try {
            final Object dObj = new Double(3.0);
            urlCodec.encode(dObj);
        } catch (final EncoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testInvalidEncoding() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidEncoding");
        final URLCodec urlCodec = new URLCodec("NONSENSE");
        final String plain = "Hello there!";
        try {
            urlCodec.encode(plain);
        } catch (final EncoderException ee) {
        }
        try {
            urlCodec.decode(plain);
        } catch (final DecoderException ee) {
        }
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInvalidEncoding_add43() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidEncoding_add43");
        final URLCodec urlCodec = new URLCodec("NONSENSE");
        final String plain = "Hello there!";
        try {
            urlCodec.encode(plain);
            urlCodec.encode(plain);
        } catch (final EncoderException ee) {
        }
        try {
            urlCodec.decode(plain);
        } catch (final DecoderException ee) {
        }
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInvalidEncoding_add44() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidEncoding_add44");
        final URLCodec urlCodec = new URLCodec("NONSENSE");
        final String plain = "Hello there!";
        try {
            urlCodec.encode(plain);
        } catch (final EncoderException ee) {
        }
        try {
            urlCodec.decode(plain);
            urlCodec.decode(plain);
        } catch (final DecoderException ee) {
        }
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInvalidEncoding_add45() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidEncoding_add45");
        final URLCodec urlCodec = new URLCodec("NONSENSE");
        final String plain = "Hello there!";
        try {
            urlCodec.encode(plain);
        } catch (final EncoderException ee) {
        }
        try {
            urlCodec.decode(plain);
        } catch (final DecoderException ee) {
        }
        validateState(urlCodec);
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testInvalidEncoding_literalMutation115() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidEncoding_literalMutation115");
        final URLCodec urlCodec = new URLCodec("foo");
        final String plain = "Hello there!";
        try {
            urlCodec.encode(plain);
        } catch (final EncoderException ee) {
        }
        try {
            urlCodec.decode(plain);
        } catch (final DecoderException ee) {
        }
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testInvalidEncoding_literalMutation116() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidEncoding_literalMutation116");
        final URLCodec urlCodec = new URLCodec("NONSENSE");
        final String plain = "foo";
        try {
            urlCodec.encode(plain);
        } catch (final EncoderException ee) {
        }
        try {
            urlCodec.decode(plain);
        } catch (final DecoderException ee) {
        }
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInvalidEncoding_remove28() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidEncoding_remove28");
        final URLCodec urlCodec = new URLCodec("NONSENSE");
        final String plain = "Hello there!";
        try {
            urlCodec.encode(plain);
        } catch (final EncoderException ee) {
        }
        try {
            urlCodec.decode(plain);
        } catch (final DecoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeObjects() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeObjects");
        final URLCodec urlCodec = new URLCodec();
        final String plain = "Hello+there%21";
        String decoded = ((String)(urlCodec.decode(((Object)(plain)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),163,decoded);
        final byte[] plainBA = plain.getBytes(org.apache.commons.codec.Charsets.UTF_8);
        final byte[] decodedBA = ((byte[])(urlCodec.decode(((Object)(plainBA)))));
        decoded = new String(decodedBA);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),164,decoded);
        final Object result = urlCodec.decode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),165,result);
        try {
            final Object dObj = new Double(3.0);
            urlCodec.decode(dObj);
        } catch (final DecoderException ee) {
        }
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeObjects_add34() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeObjects_add34");
        final URLCodec urlCodec = new URLCodec();
        final String plain = "Hello+there%21";
        String decoded = ((String)(urlCodec.decode(((Object)(plain)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),163,decoded);
        final byte[] plainBA = plain.getBytes(org.apache.commons.codec.Charsets.UTF_8);
        final byte[] decodedBA = ((byte[])(urlCodec.decode(((Object)(plainBA)))));
        decoded = new String(decodedBA);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),164,decoded);
        final Object result = urlCodec.decode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),165,result);
        try {
            final Object dObj = new Double(3.0);
            urlCodec.decode(dObj);
            urlCodec.decode(dObj);
        } catch (final DecoderException ee) {
        }
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeObjects_add35() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeObjects_add35");
        final URLCodec urlCodec = new URLCodec();
        final String plain = "Hello+there%21";
        String decoded = ((String)(urlCodec.decode(((Object)(plain)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),163,decoded);
        final byte[] plainBA = plain.getBytes(org.apache.commons.codec.Charsets.UTF_8);
        final byte[] decodedBA = ((byte[])(urlCodec.decode(((Object)(plainBA)))));
        decoded = new String(decodedBA);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),164,decoded);
        final Object result = urlCodec.decode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),165,result);
        try {
            final Object dObj = new Double(3.0);
            urlCodec.decode(dObj);
        } catch (final DecoderException ee) {
        }
        validateState(urlCodec);
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeObjects_literalMutation100() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeObjects_literalMutation100");
        final URLCodec urlCodec = new URLCodec();
        final String plain = "Hello+there%21";
        String decoded = ((String)(urlCodec.decode(((Object)(plain)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),163,decoded);
        final byte[] plainBA = plain.getBytes(org.apache.commons.codec.Charsets.UTF_8);
        final byte[] decodedBA = ((byte[])(urlCodec.decode(((Object)(plainBA)))));
        decoded = new String(decodedBA);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),164,decoded);
        final Object result = urlCodec.decode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),165,result);
        try {
            final Object dObj = new Double(4.0);
            urlCodec.decode(dObj);
        } catch (final DecoderException ee) {
        }
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeObjects_literalMutation98() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeObjects_literalMutation98");
        final URLCodec urlCodec = new URLCodec();
        final String plain = "foo";
        String decoded = ((String)(urlCodec.decode(((Object)(plain)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),163,decoded);
        final byte[] plainBA = plain.getBytes(org.apache.commons.codec.Charsets.UTF_8);
        final byte[] decodedBA = ((byte[])(urlCodec.decode(((Object)(plainBA)))));
        decoded = new String(decodedBA);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),164,decoded);
        final Object result = urlCodec.decode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),165,result);
        try {
            final Object dObj = new Double(3.0);
            urlCodec.decode(dObj);
        } catch (final DecoderException ee) {
        }
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeObjects_remove21() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeObjects_remove21");
        final URLCodec urlCodec = new URLCodec();
        final String plain = "Hello+there%21";
        String decoded = ((String)(urlCodec.decode(((Object)(plain)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),163,decoded);
        final byte[] plainBA = plain.getBytes(org.apache.commons.codec.Charsets.UTF_8);
        final byte[] decodedBA = ((byte[])(urlCodec.decode(((Object)(plainBA)))));
        decoded = new String(decodedBA);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),164,decoded);
        final Object result = urlCodec.decode(((Object)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),165,result);
        try {
            final Object dObj = new Double(3.0);
            urlCodec.decode(dObj);
        } catch (final DecoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDefaultEncoding() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultEncoding");
        final String plain = "Hello there!";
        final URLCodec urlCodec = new URLCodec("UnicodeBig");
        urlCodec.encode(plain);
        final String encoded1 = urlCodec.encode(plain, "UnicodeBig");
        final String encoded2 = urlCodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),168,encoded1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),169,encoded2);
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDefaultEncoding_add36() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultEncoding_add36");
        final String plain = "Hello there!";
        final URLCodec urlCodec = new URLCodec("UnicodeBig");
        urlCodec.encode(plain);
        urlCodec.encode(plain);
        final String encoded1 = urlCodec.encode(plain, "UnicodeBig");
        final String encoded2 = urlCodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),168,encoded1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),169,encoded2);
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDefaultEncoding_add37() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultEncoding_add37");
        final String plain = "Hello there!";
        final URLCodec urlCodec = new URLCodec("UnicodeBig");
        urlCodec.encode(plain);
        final String encoded1 = urlCodec.encode(plain, "UnicodeBig");
        final String encoded2 = urlCodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),168,encoded1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),169,encoded2);
        validateState(urlCodec);
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDefaultEncoding_literalMutation104() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultEncoding_literalMutation104");
        final String plain = "foo";
        final URLCodec urlCodec = new URLCodec("UnicodeBig");
        urlCodec.encode(plain);
        final String encoded1 = urlCodec.encode(plain, "UnicodeBig");
        final String encoded2 = urlCodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),168,encoded1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),169,encoded2);
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDefaultEncoding_literalMutation105() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultEncoding_literalMutation105");
        final String plain = "Hello there!";
        final URLCodec urlCodec = new URLCodec("foo");
        urlCodec.encode(plain);
        final String encoded1 = urlCodec.encode(plain, "UnicodeBig");
        final String encoded2 = urlCodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),168,encoded1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),169,encoded2);
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDefaultEncoding_literalMutation106() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultEncoding_literalMutation106");
        final String plain = "Hello there!";
        final URLCodec urlCodec = new URLCodec("UnicodeBig");
        urlCodec.encode(plain);
        final String encoded1 = urlCodec.encode(plain, "foo");
        final String encoded2 = urlCodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),168,encoded1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),169,encoded2);
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDefaultEncoding_remove22() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultEncoding_remove22");
        final String plain = "Hello there!";
        final URLCodec urlCodec = new URLCodec("UnicodeBig");
        final String encoded1 = urlCodec.encode(plain, "UnicodeBig");
        final String encoded2 = urlCodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),168,encoded1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),169,encoded2);
        validateState(urlCodec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDefaultEncoding_remove23() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultEncoding_remove23");
        final String plain = "Hello there!";
        final URLCodec urlCodec = new URLCodec("UnicodeBig");
        urlCodec.encode(plain);
        final String encoded1 = urlCodec.encode(plain, "UnicodeBig");
        final String encoded2 = urlCodec.encode(plain);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),168,encoded1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),169,encoded2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


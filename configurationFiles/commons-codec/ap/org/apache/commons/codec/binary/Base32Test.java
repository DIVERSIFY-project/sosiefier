package org.apache.commons.codec.binary;

import org.junit.Test;

public class Base32Test {
    private static final String[][] BASE32_TEST_CASES = new String[][]{ new String[]{ "" , "" } , new String[]{ "f" , "MY======" } , new String[]{ "fo" , "MZXQ====" } , new String[]{ "foo" , "MZXW6===" } , new String[]{ "foob" , "MZXW6YQ=" } , new String[]{ "fooba" , "MZXW6YTB" } , new String[]{ "foobar" , "MZXW6YTBOI======" } };

    private static final String[][] BASE32HEX_TEST_CASES = new String[][]{ new String[]{ "" , "" } , new String[]{ "f" , "CO======" } , new String[]{ "fo" , "CPNG====" } , new String[]{ "foo" , "CPNMU===" } , new String[]{ "foob" , "CPNMUOG=" } , new String[]{ "fooba" , "CPNMUOJ1" } , new String[]{ "foobar" , "CPNMUOJ1E8======" } };

    private static final String[][] BASE32_TEST_CASES_CHUNKED = new String[][]{ new String[]{ "" , "" } , new String[]{ "f" , "MY======\r\n" } , new String[]{ "fo" , "MZXQ====\r\n" } , new String[]{ "foo" , "MZXW6===\r\n" } , new String[]{ "foob" , "MZXW6YQ=\r\n" } , new String[]{ "fooba" , "MZXW6YTB\r\n" } , new String[]{ "foobar" , "MZXW6YTBOI======\r\n" } };

    private static final String[][] BASE32_PAD_TEST_CASES = new String[][]{ new String[]{ "" , "" } , new String[]{ "f" , "MY%%%%%%" } , new String[]{ "fo" , "MZXQ%%%%" } , new String[]{ "foo" , "MZXW6%%%" } , new String[]{ "foob" , "MZXW6YQ%" } , new String[]{ "fooba" , "MZXW6YTB" } , new String[]{ "foobar" , "MZXW6YTBOI%%%%%%" } };

    @Test
    public void testBase32HexSamples() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32HexSamples");
        final Base32 codec = new Base32(true);
        for (final String[] element : BASE32HEX_TEST_CASES) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1544,element[1]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1546,codec,1545,codec.encodeAsString(element[0].getBytes(org.apache.commons.codec.Charsets.UTF_8)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testBase32Chunked() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32Chunked");
        final Base32 codec = new Base32(19);
        for (final String[] element : BASE32_TEST_CASES_CHUNKED) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1541,element[1]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1543,codec,1542,codec.encodeAsString(element[0].getBytes(org.apache.commons.codec.Charsets.UTF_8)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSingleCharEncoding_add361() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_add361");
        for (int i = 0 ; i < 20 ; i++) {
            Base32 codec = new Base32();
            final BaseNCodec.Context context = new BaseNCodec.Context();
            final byte[] unencoded = new byte[i];
            final byte[] allInOne = codec.encode(unencoded);
            codec = new Base32();
            for (int j = 0 ; j < (unencoded.length) ; j++) {
                codec.encode(unencoded, j, 1, context);
                codec.encode(unencoded, j, 1, context);
            }
            codec.encode(unencoded, 0, -1, context);
            final byte[] singly = new byte[allInOne.length];
            codec.readResults(singly, 0, 100, context);
            if (!(java.util.Arrays.equals(allInOne, singly))) {
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSingleCharEncoding_add362() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_add362");
        for (int i = 0 ; i < 20 ; i++) {
            Base32 codec = new Base32();
            final BaseNCodec.Context context = new BaseNCodec.Context();
            final byte[] unencoded = new byte[i];
            final byte[] allInOne = codec.encode(unencoded);
            codec = new Base32();
            for (int j = 0 ; j < (unencoded.length) ; j++) {
                codec.encode(unencoded, j, 1, context);
            }
            codec.encode(unencoded, 0, -1, context);
            codec.encode(unencoded, 0, -1, context);
            final byte[] singly = new byte[allInOne.length];
            codec.readResults(singly, 0, 100, context);
            if (!(java.util.Arrays.equals(allInOne, singly))) {
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSingleCharEncoding_add363() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_add363");
        for (int i = 0 ; i < 20 ; i++) {
            Base32 codec = new Base32();
            final BaseNCodec.Context context = new BaseNCodec.Context();
            final byte[] unencoded = new byte[i];
            final byte[] allInOne = codec.encode(unencoded);
            codec = new Base32();
            for (int j = 0 ; j < (unencoded.length) ; j++) {
                codec.encode(unencoded, j, 1, context);
            }
            codec.encode(unencoded, 0, -1, context);
            final byte[] singly = new byte[allInOne.length];
            codec.readResults(singly, 0, 100, context);
            codec.readResults(singly, 0, 100, context);
            if (!(java.util.Arrays.equals(allInOne, singly))) {
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSingleCharEncoding() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding");
        for (int i = -1 ; i < 20 ; i++) {
            Base32 codec = new Base32();
            final BaseNCodec.Context context = new BaseNCodec.Context();
            final byte[] unencoded = new byte[i];
            final byte[] allInOne = codec.encode(unencoded);
            codec = new Base32();
            for (int j = 0 ; j < (unencoded.length) ; j++) {
                codec.encode(unencoded, j, 1, context);
            }
            codec.encode(unencoded, 0, -1, context);
            final byte[] singly = new byte[allInOne.length];
            codec.readResults(singly, 0, 100, context);
            if (!(java.util.Arrays.equals(allInOne, singly))) {
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSingleCharEncoding_literalMutation1563() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_literalMutation1563");
        for (int i = 0 ; i < 21 ; i++) {
            Base32 codec = new Base32();
            final BaseNCodec.Context context = new BaseNCodec.Context();
            final byte[] unencoded = new byte[i];
            final byte[] allInOne = codec.encode(unencoded);
            codec = new Base32();
            for (int j = 0 ; j < (unencoded.length) ; j++) {
                codec.encode(unencoded, j, 1, context);
            }
            codec.encode(unencoded, 0, -1, context);
            final byte[] singly = new byte[allInOne.length];
            codec.readResults(singly, 0, 100, context);
            if (!(java.util.Arrays.equals(allInOne, singly))) {
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSingleCharEncoding_literalMutation1564() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_literalMutation1564");
        for (int i = 0 ; i < 20 ; i++) {
            Base32 codec = new Base32();
            final BaseNCodec.Context context = new BaseNCodec.Context();
            final byte[] unencoded = new byte[i];
            final byte[] allInOne = codec.encode(unencoded);
            codec = new Base32();
            for (int j = -1 ; j < (unencoded.length) ; j++) {
                codec.encode(unencoded, j, 1, context);
            }
            codec.encode(unencoded, 0, -1, context);
            final byte[] singly = new byte[allInOne.length];
            codec.readResults(singly, 0, 100, context);
            if (!(java.util.Arrays.equals(allInOne, singly))) {
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSingleCharEncoding_literalMutation1565() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_literalMutation1565");
        for (int i = 0 ; i < 20 ; i++) {
            Base32 codec = new Base32();
            final BaseNCodec.Context context = new BaseNCodec.Context();
            final byte[] unencoded = new byte[i];
            final byte[] allInOne = codec.encode(unencoded);
            codec = new Base32();
            for (int j = 0 ; j < (unencoded.length) ; j++) {
                codec.encode(unencoded, j, 0, context);
            }
            codec.encode(unencoded, 0, -1, context);
            final byte[] singly = new byte[allInOne.length];
            codec.readResults(singly, 0, 100, context);
            if (!(java.util.Arrays.equals(allInOne, singly))) {
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSingleCharEncoding_literalMutation1566() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_literalMutation1566");
        for (int i = 0 ; i < 20 ; i++) {
            Base32 codec = new Base32();
            final BaseNCodec.Context context = new BaseNCodec.Context();
            final byte[] unencoded = new byte[i];
            final byte[] allInOne = codec.encode(unencoded);
            codec = new Base32();
            for (int j = 0 ; j < (unencoded.length) ; j++) {
                codec.encode(unencoded, j, 1, context);
            }
            codec.encode(unencoded, 1, -1, context);
            final byte[] singly = new byte[allInOne.length];
            codec.readResults(singly, 0, 100, context);
            if (!(java.util.Arrays.equals(allInOne, singly))) {
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSingleCharEncoding_literalMutation1567() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_literalMutation1567");
        for (int i = 0 ; i < 20 ; i++) {
            Base32 codec = new Base32();
            final BaseNCodec.Context context = new BaseNCodec.Context();
            final byte[] unencoded = new byte[i];
            final byte[] allInOne = codec.encode(unencoded);
            codec = new Base32();
            for (int j = 0 ; j < (unencoded.length) ; j++) {
                codec.encode(unencoded, j, 1, context);
            }
            codec.encode(unencoded, 0, 2, context);
            final byte[] singly = new byte[allInOne.length];
            codec.readResults(singly, 0, 100, context);
            if (!(java.util.Arrays.equals(allInOne, singly))) {
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSingleCharEncoding_literalMutation1568() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_literalMutation1568");
        for (int i = 0 ; i < 20 ; i++) {
            Base32 codec = new Base32();
            final BaseNCodec.Context context = new BaseNCodec.Context();
            final byte[] unencoded = new byte[i];
            final byte[] allInOne = codec.encode(unencoded);
            codec = new Base32();
            for (int j = 0 ; j < (unencoded.length) ; j++) {
                codec.encode(unencoded, j, 1, context);
            }
            codec.encode(unencoded, 0, -1, context);
            final byte[] singly = new byte[allInOne.length];
            codec.readResults(singly, -1, 100, context);
            if (!(java.util.Arrays.equals(allInOne, singly))) {
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSingleCharEncoding_literalMutation1569() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_literalMutation1569");
        for (int i = 0 ; i < 20 ; i++) {
            Base32 codec = new Base32();
            final BaseNCodec.Context context = new BaseNCodec.Context();
            final byte[] unencoded = new byte[i];
            final byte[] allInOne = codec.encode(unencoded);
            codec = new Base32();
            for (int j = 0 ; j < (unencoded.length) ; j++) {
                codec.encode(unencoded, j, 1, context);
            }
            codec.encode(unencoded, 0, -1, context);
            final byte[] singly = new byte[allInOne.length];
            codec.readResults(singly, 0, 101, context);
            if (!(java.util.Arrays.equals(allInOne, singly))) {
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSingleCharEncoding_remove332() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_remove332");
        for (int i = 0 ; i < 20 ; i++) {
            Base32 codec = new Base32();
            final BaseNCodec.Context context = new BaseNCodec.Context();
            final byte[] unencoded = new byte[i];
            final byte[] allInOne = codec.encode(unencoded);
            codec = new Base32();
            for (int j = 0 ; j < (unencoded.length) ; j++) {
            }
            codec.encode(unencoded, 0, -1, context);
            final byte[] singly = new byte[allInOne.length];
            codec.readResults(singly, 0, 100, context);
            if (!(java.util.Arrays.equals(allInOne, singly))) {
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSingleCharEncoding_remove333() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_remove333");
        for (int i = 0 ; i < 20 ; i++) {
            Base32 codec = new Base32();
            final BaseNCodec.Context context = new BaseNCodec.Context();
            final byte[] unencoded = new byte[i];
            final byte[] allInOne = codec.encode(unencoded);
            codec = new Base32();
            for (int j = 0 ; j < (unencoded.length) ; j++) {
                codec.encode(unencoded, j, 1, context);
            }
            final byte[] singly = new byte[allInOne.length];
            codec.readResults(singly, 0, 100, context);
            if (!(java.util.Arrays.equals(allInOne, singly))) {
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSingleCharEncoding_remove334() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_remove334");
        for (int i = 0 ; i < 20 ; i++) {
            Base32 codec = new Base32();
            final BaseNCodec.Context context = new BaseNCodec.Context();
            final byte[] unencoded = new byte[i];
            final byte[] allInOne = codec.encode(unencoded);
            codec = new Base32();
            for (int j = 0 ; j < (unencoded.length) ; j++) {
                codec.encode(unencoded, j, 1, context);
            }
            codec.encode(unencoded, 0, -1, context);
            final byte[] singly = new byte[allInOne.length];
            if (!(java.util.Arrays.equals(allInOne, singly))) {
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRandomBytes() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRandomBytes");
        for (int i = 1 ; i < 20 ; i++) {
            final Base32 codec = new Base32();
            final byte[][] b = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1558,((("" + i) + " ") + (codec.lineLength)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1559,b[1].length);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1561,codec,1560,codec.getEncodedLength(b[0]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRandomBytes_literalMutation1555() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRandomBytes_literalMutation1555");
        for (int i = 0 ; i < 19 ; i++) {
            final Base32 codec = new Base32();
            final byte[][] b = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1558,((("" + i) + " ") + (codec.lineLength)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1559,b[1].length);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1561,codec,1560,codec.getEncodedLength(b[0]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRandomBytesChunked() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRandomBytesChunked");
        for (int i = 1 ; i < 20 ; i++) {
            final Base32 codec = new Base32(10);
            final byte[][] b = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1550,((("" + i) + " ") + (codec.lineLength)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1551,b[1].length);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1553,codec,1552,codec.getEncodedLength(b[0]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRandomBytesChunked_literalMutation1557() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRandomBytesChunked_literalMutation1557");
        for (int i = 0 ; i < 19 ; i++) {
            final Base32 codec = new Base32(10);
            final byte[][] b = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1550,((("" + i) + " ") + (codec.lineLength)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1551,b[1].length);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1553,codec,1552,codec.getEncodedLength(b[0]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRandomBytesChunked_literalMutation1558() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRandomBytesChunked_literalMutation1558");
        for (int i = 0 ; i < 20 ; i++) {
            final Base32 codec = new Base32(11);
            final byte[][] b = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1550,((("" + i) + " ") + (codec.lineLength)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1551,b[1].length);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1553,codec,1552,codec.getEncodedLength(b[0]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRandomBytesHex() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRandomBytesHex");
        for (int i = 1 ; i < 20 ; i++) {
            final Base32 codec = new Base32(true);
            final byte[][] b = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1554,((("" + i) + " ") + (codec.lineLength)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1555,b[1].length);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1557,codec,1556,codec.getEncodedLength(b[0]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRandomBytesHex_literalMutation1560() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRandomBytesHex_literalMutation1560");
        for (int i = 0 ; i < 21 ; i++) {
            final Base32 codec = new Base32(true);
            final byte[][] b = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1554,((("" + i) + " ") + (codec.lineLength)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1555,b[1].length);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1557,codec,1556,codec.getEncodedLength(b[0]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRandomBytesHex_literalMutation1561() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRandomBytesHex_literalMutation1561");
        for (int i = 0 ; i < 20 ; i++) {
            final Base32 codec = new Base32(false);
            final byte[][] b = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1554,((("" + i) + " ") + (codec.lineLength)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1555,b[1].length);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1557,codec,1556,codec.getEncodedLength(b[0]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testBase32SamplesNonDefaultPadding() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32SamplesNonDefaultPadding");
        final Base32 codec = new Base32(((byte)(37)));
        for (final String[] element : BASE32_PAD_TEST_CASES) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1547,element[1]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1549,codec,1548,codec.encodeAsString(element[0].getBytes(org.apache.commons.codec.Charsets.UTF_8)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testBase32Samples() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32Samples");
        final Base32 codec = new Base32(((byte)(38)));
        for (final String[] element : BASE32_PAD_TEST_CASES) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1547,element[1]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1549,codec,1548,codec.encodeAsString(element[0].getBytes(org.apache.commons.codec.Charsets.UTF_8)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


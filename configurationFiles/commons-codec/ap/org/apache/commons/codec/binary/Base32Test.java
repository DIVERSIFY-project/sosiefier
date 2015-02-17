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
        final Base32 codec = new Base32(false);
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

    @Test
    public void testBase32Chunked_literalMutation1884() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32Chunked_literalMutation1884");
        final Base32 codec = new Base32(10);
        for (final String[] element : BASE32_TEST_CASES_CHUNKED) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1541,element[1]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1543,codec,1542,codec.encodeAsString(element[0].getBytes(org.apache.commons.codec.Charsets.UTF_8)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testBase32Chunked_literalMutation1885() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32Chunked_literalMutation1885");
        final Base32 codec = new Base32(40);
        for (final String[] element : BASE32_TEST_CASES_CHUNKED) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1541,element[1]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1543,codec,1542,codec.encodeAsString(element[0].getBytes(org.apache.commons.codec.Charsets.UTF_8)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testBase32Chunked_literalMutation1886() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32Chunked_literalMutation1886");
        final Base32 codec = new Base32(21);
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
            codec.encode(unencoded, 0, 2, context);
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
            codec.encode(unencoded, 0, 2, context);
            codec.encode(unencoded, 0, 2, context);
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
            codec.encode(unencoded, 0, 2, context);
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
        for (int i = 1 ; i < 20 ; i++) {
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
    public void testSingleCharEncoding_literalMutation1919() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_literalMutation1919");
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
    public void testSingleCharEncoding_literalMutation1920() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_literalMutation1920");
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
            if (!(java.util.Arrays.equals(allInOne, singly))) {
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSingleCharEncoding_literalMutation1921() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_literalMutation1921");
        for (int i = 0 ; i < 19 ; i++) {
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
    public void testSingleCharEncoding_literalMutation1922() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_literalMutation1922");
        for (int i = 0 ; i < 10 ; i++) {
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
    public void testSingleCharEncoding_literalMutation1923() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_literalMutation1923");
        for (int i = 0 ; i < 40 ; i++) {
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
    public void testSingleCharEncoding_literalMutation1924() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_literalMutation1924");
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
    public void testSingleCharEncoding_literalMutation1925() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_literalMutation1925");
        for (int i = 0 ; i < 20 ; i++) {
            Base32 codec = new Base32();
            final BaseNCodec.Context context = new BaseNCodec.Context();
            final byte[] unencoded = new byte[i];
            final byte[] allInOne = codec.encode(unencoded);
            codec = new Base32();
            for (int j = 1 ; j < (unencoded.length) ; j++) {
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
    public void testSingleCharEncoding_literalMutation1926() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_literalMutation1926");
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
    public void testSingleCharEncoding_literalMutation1927() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_literalMutation1927");
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
            if (!(java.util.Arrays.equals(allInOne, singly))) {
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSingleCharEncoding_literalMutation1928() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_literalMutation1928");
        for (int i = 0 ; i < 20 ; i++) {
            Base32 codec = new Base32();
            final BaseNCodec.Context context = new BaseNCodec.Context();
            final byte[] unencoded = new byte[i];
            final byte[] allInOne = codec.encode(unencoded);
            codec = new Base32();
            for (int j = 0 ; j < (unencoded.length) ; j++) {
                codec.encode(unencoded, j, 2, context);
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
    public void testSingleCharEncoding_literalMutation1929() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_literalMutation1929");
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
    public void testSingleCharEncoding_literalMutation1930() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_literalMutation1930");
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
    public void testSingleCharEncoding_literalMutation1931() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_literalMutation1931");
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
    public void testSingleCharEncoding_literalMutation1932() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_literalMutation1932");
        for (int i = 0 ; i < 20 ; i++) {
            Base32 codec = new Base32();
            final BaseNCodec.Context context = new BaseNCodec.Context();
            final byte[] unencoded = new byte[i];
            final byte[] allInOne = codec.encode(unencoded);
            codec = new Base32();
            for (int j = 0 ; j < (unencoded.length) ; j++) {
                codec.encode(unencoded, j, 1, context);
            }
            codec.encode(unencoded, -1, -1, context);
            final byte[] singly = new byte[allInOne.length];
            codec.readResults(singly, 0, 100, context);
            if (!(java.util.Arrays.equals(allInOne, singly))) {
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSingleCharEncoding_literalMutation1933() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_literalMutation1933");
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
            if (!(java.util.Arrays.equals(allInOne, singly))) {
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSingleCharEncoding_literalMutation1934() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_literalMutation1934");
        for (int i = 0 ; i < 20 ; i++) {
            Base32 codec = new Base32();
            final BaseNCodec.Context context = new BaseNCodec.Context();
            final byte[] unencoded = new byte[i];
            final byte[] allInOne = codec.encode(unencoded);
            codec = new Base32();
            for (int j = 0 ; j < (unencoded.length) ; j++) {
                codec.encode(unencoded, j, 1, context);
            }
            codec.encode(unencoded, 0, -2, context);
            final byte[] singly = new byte[allInOne.length];
            codec.readResults(singly, 0, 100, context);
            if (!(java.util.Arrays.equals(allInOne, singly))) {
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSingleCharEncoding_literalMutation1935() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_literalMutation1935");
        for (int i = 0 ; i < 20 ; i++) {
            Base32 codec = new Base32();
            final BaseNCodec.Context context = new BaseNCodec.Context();
            final byte[] unencoded = new byte[i];
            final byte[] allInOne = codec.encode(unencoded);
            codec = new Base32();
            for (int j = 0 ; j < (unencoded.length) ; j++) {
                codec.encode(unencoded, j, 1, context);
            }
            codec.encode(unencoded, 0, 0, context);
            final byte[] singly = new byte[allInOne.length];
            codec.readResults(singly, 0, 100, context);
            if (!(java.util.Arrays.equals(allInOne, singly))) {
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSingleCharEncoding_literalMutation1936() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_literalMutation1936");
        for (int i = 0 ; i < 20 ; i++) {
            Base32 codec = new Base32();
            final BaseNCodec.Context context = new BaseNCodec.Context();
            final byte[] unencoded = new byte[i];
            final byte[] allInOne = codec.encode(unencoded);
            codec = new Base32();
            for (int j = 0 ; j < (unencoded.length) ; j++) {
                codec.encode(unencoded, j, 1, context);
            }
            codec.encode(unencoded, 0, 0, context);
            final byte[] singly = new byte[allInOne.length];
            codec.readResults(singly, 0, 100, context);
            if (!(java.util.Arrays.equals(allInOne, singly))) {
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSingleCharEncoding_literalMutation1937() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_literalMutation1937");
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
            codec.readResults(singly, 1, 100, context);
            if (!(java.util.Arrays.equals(allInOne, singly))) {
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSingleCharEncoding_literalMutation1938() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_literalMutation1938");
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
            codec.readResults(singly, -1, 100, context);
            if (!(java.util.Arrays.equals(allInOne, singly))) {
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSingleCharEncoding_literalMutation1939() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_literalMutation1939");
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
    public void testSingleCharEncoding_literalMutation1940() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_literalMutation1940");
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
            codec.readResults(singly, 0, 99, context);
            if (!(java.util.Arrays.equals(allInOne, singly))) {
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSingleCharEncoding_literalMutation1941() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_literalMutation1941");
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
            codec.readResults(singly, 0, 101, context);
            if (!(java.util.Arrays.equals(allInOne, singly))) {
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSingleCharEncoding_literalMutation1942() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_literalMutation1942");
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
            codec.readResults(singly, 0, 50, context);
            if (!(java.util.Arrays.equals(allInOne, singly))) {
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSingleCharEncoding_literalMutation1943() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleCharEncoding_literalMutation1943");
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
            codec.readResults(singly, 0, 200, context);
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
            codec.encode(unencoded, 0, 2, context);
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
            codec.encode(unencoded, 0, 2, context);
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
    public void testRandomBytes_literalMutation1893() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRandomBytes_literalMutation1893");
        for (int i = -1 ; i < 20 ; i++) {
            final Base32 codec = new Base32();
            final byte[][] b = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1558,((("" + i) + " ") + (codec.lineLength)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1559,b[1].length);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1561,codec,1560,codec.getEncodedLength(b[0]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRandomBytes_literalMutation1894() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRandomBytes_literalMutation1894");
        for (int i = 0 ; i < 20 ; i++) {
            final Base32 codec = new Base32();
            final byte[][] b = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1558,((("" + i) + " ") + (codec.lineLength)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1559,b[1].length);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1561,codec,1560,codec.getEncodedLength(b[0]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRandomBytes_literalMutation1895() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRandomBytes_literalMutation1895");
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
    public void testRandomBytes_literalMutation1896() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRandomBytes_literalMutation1896");
        for (int i = 0 ; i < 10 ; i++) {
            final Base32 codec = new Base32();
            final byte[][] b = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1558,((("" + i) + " ") + (codec.lineLength)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1559,b[1].length);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1561,codec,1560,codec.getEncodedLength(b[0]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRandomBytes_literalMutation1897() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRandomBytes_literalMutation1897");
        for (int i = 0 ; i < 40 ; i++) {
            final Base32 codec = new Base32();
            final byte[][] b = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1558,((("" + i) + " ") + (codec.lineLength)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1559,b[1].length);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1561,codec,1560,codec.getEncodedLength(b[0]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRandomBytes_literalMutation1898() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRandomBytes_literalMutation1898");
        for (int i = 0 ; i < 21 ; i++) {
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
    public void testRandomBytesChunked_literalMutation1900() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRandomBytesChunked_literalMutation1900");
        for (int i = -1 ; i < 20 ; i++) {
            final Base32 codec = new Base32(10);
            final byte[][] b = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1550,((("" + i) + " ") + (codec.lineLength)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1551,b[1].length);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1553,codec,1552,codec.getEncodedLength(b[0]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRandomBytesChunked_literalMutation1901() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRandomBytesChunked_literalMutation1901");
        for (int i = 0 ; i < 20 ; i++) {
            final Base32 codec = new Base32(10);
            final byte[][] b = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1550,((("" + i) + " ") + (codec.lineLength)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1551,b[1].length);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1553,codec,1552,codec.getEncodedLength(b[0]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRandomBytesChunked_literalMutation1902() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRandomBytesChunked_literalMutation1902");
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
    public void testRandomBytesChunked_literalMutation1903() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRandomBytesChunked_literalMutation1903");
        for (int i = 0 ; i < 10 ; i++) {
            final Base32 codec = new Base32(10);
            final byte[][] b = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1550,((("" + i) + " ") + (codec.lineLength)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1551,b[1].length);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1553,codec,1552,codec.getEncodedLength(b[0]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRandomBytesChunked_literalMutation1904() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRandomBytesChunked_literalMutation1904");
        for (int i = 0 ; i < 40 ; i++) {
            final Base32 codec = new Base32(10);
            final byte[][] b = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1550,((("" + i) + " ") + (codec.lineLength)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1551,b[1].length);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1553,codec,1552,codec.getEncodedLength(b[0]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRandomBytesChunked_literalMutation1905() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRandomBytesChunked_literalMutation1905");
        for (int i = 0 ; i < 21 ; i++) {
            final Base32 codec = new Base32(10);
            final byte[][] b = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1550,((("" + i) + " ") + (codec.lineLength)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1551,b[1].length);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1553,codec,1552,codec.getEncodedLength(b[0]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRandomBytesChunked_literalMutation1906() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRandomBytesChunked_literalMutation1906");
        for (int i = 0 ; i < 20 ; i++) {
            final Base32 codec = new Base32(9);
            final byte[][] b = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1550,((("" + i) + " ") + (codec.lineLength)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1551,b[1].length);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1553,codec,1552,codec.getEncodedLength(b[0]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRandomBytesChunked_literalMutation1907() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRandomBytesChunked_literalMutation1907");
        for (int i = 0 ; i < 20 ; i++) {
            final Base32 codec = new Base32(5);
            final byte[][] b = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1550,((("" + i) + " ") + (codec.lineLength)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1551,b[1].length);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1553,codec,1552,codec.getEncodedLength(b[0]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRandomBytesChunked_literalMutation1908() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRandomBytesChunked_literalMutation1908");
        for (int i = 0 ; i < 20 ; i++) {
            final Base32 codec = new Base32(20);
            final byte[][] b = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1550,((("" + i) + " ") + (codec.lineLength)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1551,b[1].length);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1553,codec,1552,codec.getEncodedLength(b[0]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRandomBytesChunked_literalMutation1909() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRandomBytesChunked_literalMutation1909");
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
    public void testRandomBytesHex_literalMutation1911() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRandomBytesHex_literalMutation1911");
        for (int i = -1 ; i < 20 ; i++) {
            final Base32 codec = new Base32(true);
            final byte[][] b = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1554,((("" + i) + " ") + (codec.lineLength)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1555,b[1].length);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1557,codec,1556,codec.getEncodedLength(b[0]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRandomBytesHex_literalMutation1912() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRandomBytesHex_literalMutation1912");
        for (int i = 0 ; i < 20 ; i++) {
            final Base32 codec = new Base32(true);
            final byte[][] b = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1554,((("" + i) + " ") + (codec.lineLength)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1555,b[1].length);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1557,codec,1556,codec.getEncodedLength(b[0]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRandomBytesHex_literalMutation1913() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRandomBytesHex_literalMutation1913");
        for (int i = 0 ; i < 19 ; i++) {
            final Base32 codec = new Base32(true);
            final byte[][] b = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1554,((("" + i) + " ") + (codec.lineLength)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1555,b[1].length);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1557,codec,1556,codec.getEncodedLength(b[0]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRandomBytesHex_literalMutation1914() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRandomBytesHex_literalMutation1914");
        for (int i = 0 ; i < 10 ; i++) {
            final Base32 codec = new Base32(true);
            final byte[][] b = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1554,((("" + i) + " ") + (codec.lineLength)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1555,b[1].length);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1557,codec,1556,codec.getEncodedLength(b[0]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRandomBytesHex_literalMutation1915() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRandomBytesHex_literalMutation1915");
        for (int i = 0 ; i < 40 ; i++) {
            final Base32 codec = new Base32(true);
            final byte[][] b = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1554,((("" + i) + " ") + (codec.lineLength)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1555,b[1].length);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1557,codec,1556,codec.getEncodedLength(b[0]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRandomBytesHex_literalMutation1916() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRandomBytesHex_literalMutation1916");
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
    public void testRandomBytesHex_literalMutation1917() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRandomBytesHex_literalMutation1917");
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
        final Base32 codec = new Base32(((byte)(36)));
        for (final String[] element : BASE32_PAD_TEST_CASES) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1547,element[1]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1549,codec,1548,codec.encodeAsString(element[0].getBytes(org.apache.commons.codec.Charsets.UTF_8)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testBase32SamplesNonDefaultPadding_literalMutation1889() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32SamplesNonDefaultPadding_literalMutation1889");
        final Base32 codec = new Base32(((byte)(18)));
        for (final String[] element : BASE32_PAD_TEST_CASES) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1547,element[1]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1549,codec,1548,codec.encodeAsString(element[0].getBytes(org.apache.commons.codec.Charsets.UTF_8)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testBase32SamplesNonDefaultPadding_literalMutation1890() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32SamplesNonDefaultPadding_literalMutation1890");
        final Base32 codec = new Base32(((byte)(74)));
        for (final String[] element : BASE32_PAD_TEST_CASES) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1547,element[1]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1549,codec,1548,codec.encodeAsString(element[0].getBytes(org.apache.commons.codec.Charsets.UTF_8)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testBase32SamplesNonDefaultPadding_literalMutation1891() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32SamplesNonDefaultPadding_literalMutation1891");
        final Base32 codec = new Base32(((byte)(38)));
        for (final String[] element : BASE32_PAD_TEST_CASES) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1547,element[1]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1549,codec,1548,codec.encodeAsString(element[0].getBytes(org.apache.commons.codec.Charsets.UTF_8)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


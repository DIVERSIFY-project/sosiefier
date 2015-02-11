//package org.apache.commons.io.input;
//
//import java.nio.charset.Charset;
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.Random;
//import org.junit.Test;
//
//public class CharSequenceInputStreamTest {
//    private static final String TEST_STRING = "à peine arrivés nous entrâmes dans sa chambre";
//
//    private static final String LARGE_TEST_STRING;
//
//    static {
//        StringBuilder buffer = new StringBuilder();
//        for (int i = 0 ; i < 100 ; i++) {
//            buffer.append(TEST_STRING);
//        }
//        LARGE_TEST_STRING = buffer.toString();
//    }
//
//    private Random random = new Random();
//
//    private void testWithSingleByteRead(String testString, String charsetName) throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWithSingleByteRead");
//        byte[] bytes = testString.getBytes(charsetName);
//        InputStream in = new CharSequenceInputStream(testString , charsetName , 513);
//        for (byte b : bytes) {
//            int read = in.read();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),514,(("read " + read) + " >=0 "));
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),515,(read >= 0));
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),516,(("read " + read) + " <= 255"));
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),517,(read <= 255));
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),518,b);
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),519,((byte)(read)));
//        }
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),520,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),522,in,521,in.read());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    private void testWithBufferedRead(String testString, String charsetName) throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWithBufferedRead");
//        byte[] expected = testString.getBytes(charsetName);
//        InputStream in = new CharSequenceInputStream(testString , charsetName , 511);
//        byte[] buffer = new byte[128];
//        int offset = 0;
//        while (true) {
//            int bufferOffset = random.nextInt(64);
//            int bufferLength = random.nextInt(64);
//            int read = in.read(buffer, bufferOffset, bufferLength);
//            if (read == (-1)) {
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),506,expected.length);
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),507,offset);
//                break;
//            } else {
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),508,((("Read " + read) + " <= ") + bufferLength));
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),509,(read <= bufferLength));
//                while (read > 0) {
//                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),510,((("offset " + offset) + " < ") + (expected.length)));
//                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),511,(offset < (expected.length)));
//                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),512,expected[offset]);
//                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),513,buffer[bufferOffset]);
//                    offset++;
//                    bufferOffset++;
//                    read--;
//                }
//            }
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    private void testWithBufferedRead_literalMutation401(String testString, String charsetName) throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWithBufferedRead_literalMutation401");
//        byte[] expected = testString.getBytes(charsetName);
//        InputStream in = new CharSequenceInputStream(testString , charsetName , 512);
//        byte[] buffer = new byte[129];
//        int offset = 0;
//        while (true) {
//            int bufferOffset = random.nextInt(64);
//            int bufferLength = random.nextInt(64);
//            int read = in.read(buffer, bufferOffset, bufferLength);
//            if (read == (-1)) {
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),506,expected.length);
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),507,offset);
//                break;
//            } else {
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),508,((("Read " + read) + " <= ") + bufferLength));
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),509,(read <= bufferLength));
//                while (read > 0) {
//                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),510,((("offset " + offset) + " < ") + (expected.length)));
//                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),511,(offset < (expected.length)));
//                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),512,expected[offset]);
//                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),513,buffer[bufferOffset]);
//                    offset++;
//                    bufferOffset++;
//                    read--;
//                }
//            }
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    private void testWithBufferedRead_literalMutation402(String testString, String charsetName) throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWithBufferedRead_literalMutation402");
//        byte[] expected = testString.getBytes(charsetName);
//        InputStream in = new CharSequenceInputStream(testString , charsetName , 512);
//        byte[] buffer = new byte[128];
//        int offset = 1;
//        while (true) {
//            int bufferOffset = random.nextInt(64);
//            int bufferLength = random.nextInt(64);
//            int read = in.read(buffer, bufferOffset, bufferLength);
//            if (read == (-1)) {
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),506,expected.length);
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),507,offset);
//                break;
//            } else {
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),508,((("Read " + read) + " <= ") + bufferLength));
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),509,(read <= bufferLength));
//                while (read > 0) {
//                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),510,((("offset " + offset) + " < ") + (expected.length)));
//                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),511,(offset < (expected.length)));
//                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),512,expected[offset]);
//                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),513,buffer[bufferOffset]);
//                    offset++;
//                    bufferOffset++;
//                    read--;
//                }
//            }
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    private void testWithBufferedRead_literalMutation403(String testString, String charsetName) throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWithBufferedRead_literalMutation403");
//        byte[] expected = testString.getBytes(charsetName);
//        InputStream in = new CharSequenceInputStream(testString , charsetName , 512);
//        byte[] buffer = new byte[128];
//        int offset = 0;
//        while (true) {
//            int bufferOffset = random.nextInt(64);
//            int bufferLength = random.nextInt(64);
//            int read = in.read(buffer, bufferOffset, bufferLength);
//            if (read == (-1)) {
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),506,expected.length);
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),507,offset);
//                break;
//            } else {
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),508,((("Read " + read) + " <= ") + bufferLength));
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),509,(read <= bufferLength));
//                while (read > 0) {
//                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),510,((("offset " + offset) + " < ") + (expected.length)));
//                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),511,(offset < (expected.length)));
//                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),512,expected[offset]);
//                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),513,buffer[bufferOffset]);
//                    offset++;
//                    bufferOffset++;
//                    read--;
//                }
//            }
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    private void testWithBufferedRead_literalMutation404(String testString, String charsetName) throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWithBufferedRead_literalMutation404");
//        byte[] expected = testString.getBytes(charsetName);
//        InputStream in = new CharSequenceInputStream(testString , charsetName , 512);
//        byte[] buffer = new byte[128];
//        int offset = 0;
//        while (true) {
//            int bufferOffset = random.nextInt(65);
//            int bufferLength = random.nextInt(64);
//            int read = in.read(buffer, bufferOffset, bufferLength);
//            if (read == (-1)) {
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),506,expected.length);
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),507,offset);
//                break;
//            } else {
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),508,((("Read " + read) + " <= ") + bufferLength));
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),509,(read <= bufferLength));
//                while (read > 0) {
//                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),510,((("offset " + offset) + " < ") + (expected.length)));
//                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),511,(offset < (expected.length)));
//                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),512,expected[offset]);
//                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),513,buffer[bufferOffset]);
//                    offset++;
//                    bufferOffset++;
//                    read--;
//                }
//            }
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    private void testWithBufferedRead_literalMutation405(String testString, String charsetName) throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWithBufferedRead_literalMutation405");
//        byte[] expected = testString.getBytes(charsetName);
//        InputStream in = new CharSequenceInputStream(testString , charsetName , 512);
//        byte[] buffer = new byte[128];
//        int offset = 0;
//        while (true) {
//            int bufferOffset = random.nextInt(64);
//            int bufferLength = random.nextInt(65);
//            int read = in.read(buffer, bufferOffset, bufferLength);
//            if (read == (-1)) {
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),506,expected.length);
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),507,offset);
//                break;
//            } else {
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),508,((("Read " + read) + " <= ") + bufferLength));
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),509,(read <= bufferLength));
//                while (read > 0) {
//                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),510,((("offset " + offset) + " < ") + (expected.length)));
//                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),511,(offset < (expected.length)));
//                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),512,expected[offset]);
//                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),513,buffer[bufferOffset]);
//                    offset++;
//                    bufferOffset++;
//                    read--;
//                }
//            }
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    private void testWithBufferedRead_literalMutation406(String testString, String charsetName) throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWithBufferedRead_literalMutation406");
//        byte[] expected = testString.getBytes(charsetName);
//        InputStream in = new CharSequenceInputStream(testString , charsetName , 512);
//        byte[] buffer = new byte[128];
//        int offset = 0;
//        while (true) {
//            int bufferOffset = random.nextInt(64);
//            int bufferLength = random.nextInt(64);
//            int read = in.read(buffer, bufferOffset, bufferLength);
//            if (read == 0) {
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),506,expected.length);
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),507,offset);
//                break;
//            } else {
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),508,((("Read " + read) + " <= ") + bufferLength));
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),509,(read <= bufferLength));
//                while (read > 0) {
//                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),510,((("offset " + offset) + " < ") + (expected.length)));
//                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),511,(offset < (expected.length)));
//                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),512,expected[offset]);
//                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),513,buffer[bufferOffset]);
//                    offset++;
//                    bufferOffset++;
//                    read--;
//                }
//            }
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    private void testWithBufferedRead_literalMutation407(String testString, String charsetName) throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWithBufferedRead_literalMutation407");
//        byte[] expected = testString.getBytes(charsetName);
//        InputStream in = new CharSequenceInputStream(testString , charsetName , 512);
//        byte[] buffer = new byte[128];
//        int offset = 0;
//        while (true) {
//            int bufferOffset = random.nextInt(64);
//            int bufferLength = random.nextInt(64);
//            int read = in.read(buffer, bufferOffset, bufferLength);
//            if (read == (-1)) {
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),506,expected.length);
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),507,offset);
//                break;
//            } else {
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),508,((("Read " + read) + " <= ") + bufferLength));
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),509,(read <= bufferLength));
//                while (read > 1) {
//                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),510,((("offset " + offset) + " < ") + (expected.length)));
//                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),511,(offset < (expected.length)));
//                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),512,expected[offset]);
//                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),513,buffer[bufferOffset]);
//                    offset++;
//                    bufferOffset++;
//                    read--;
//                }
//            }
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testUTF8WithSingleByteRead_add172() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8WithSingleByteRead_add172");
//        testWithSingleByteRead(TEST_STRING, "UTF-8");
//        testWithSingleByteRead(TEST_STRING, "UTF-8");
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testUTF8WithSingleByteRead() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8WithSingleByteRead");
//        testWithSingleByteRead(TEST_STRING, "foo");
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testUTF8WithSingleByteRead_remove59() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8WithSingleByteRead_remove59");
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testLargeUTF8WithSingleByteRead_add161() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeUTF8WithSingleByteRead_add161");
//        testWithSingleByteRead(LARGE_TEST_STRING, "UTF-8");
//        testWithSingleByteRead(LARGE_TEST_STRING, "UTF-8");
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testLargeUTF8WithSingleByteRead() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeUTF8WithSingleByteRead");
//        testWithSingleByteRead(LARGE_TEST_STRING, "foo");
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testLargeUTF8WithSingleByteRead_remove48() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeUTF8WithSingleByteRead_remove48");
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testUTF8WithBufferedRead_add171() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8WithBufferedRead_add171");
//        testWithBufferedRead(TEST_STRING, "UTF-8");
//        testWithBufferedRead(TEST_STRING, "UTF-8");
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testUTF8WithBufferedRead() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8WithBufferedRead");
//        testWithBufferedRead(TEST_STRING, "foo");
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testUTF8WithBufferedRead_remove58() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8WithBufferedRead_remove58");
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testLargeUTF8WithBufferedRead_add160() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeUTF8WithBufferedRead_add160");
//        testWithBufferedRead(LARGE_TEST_STRING, "UTF-8");
//        testWithBufferedRead(LARGE_TEST_STRING, "UTF-8");
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testLargeUTF8WithBufferedRead() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeUTF8WithBufferedRead");
//        testWithBufferedRead(LARGE_TEST_STRING, "foo");
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testLargeUTF8WithBufferedRead_remove47() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeUTF8WithBufferedRead_remove47");
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testUTF16WithSingleByteRead_add170() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16WithSingleByteRead_add170");
//        testWithSingleByteRead(TEST_STRING, "UTF-16");
//        testWithSingleByteRead(TEST_STRING, "UTF-16");
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testUTF16WithSingleByteRead() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16WithSingleByteRead");
//        testWithSingleByteRead(TEST_STRING, "foo");
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testUTF16WithSingleByteRead_remove57() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16WithSingleByteRead_remove57");
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testReadZero() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadZero");
//        InputStream r = new CharSequenceInputStream("foo" , "UTF-8");
//        byte[] bytes = new byte[30];
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),500,r,499,r.read(bytes, 0, 0));
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testReadZero_literalMutation387() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadZero_literalMutation387");
//        InputStream r = new CharSequenceInputStream("test" , "foo");
//        byte[] bytes = new byte[30];
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),500,r,499,r.read(bytes, 0, 0));
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testReadZero_literalMutation388() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadZero_literalMutation388");
//        InputStream r = new CharSequenceInputStream("test" , "UTF-8");
//        byte[] bytes = new byte[29];
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),500,r,499,r.read(bytes, 0, 0));
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testReadZeroEmptyString() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadZeroEmptyString");
//        InputStream r = new CharSequenceInputStream("foo" , "UTF-8");
//        byte[] bytes = new byte[30];
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),498,r,497,r.read(bytes, 0, 0));
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testReadZeroEmptyString_literalMutation390() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadZeroEmptyString_literalMutation390");
//        InputStream r = new CharSequenceInputStream("" , "foo");
//        byte[] bytes = new byte[30];
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),498,r,497,r.read(bytes, 0, 0));
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testReadZeroEmptyString_literalMutation391() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadZeroEmptyString_literalMutation391");
//        InputStream r = new CharSequenceInputStream("" , "UTF-8");
//        byte[] bytes = new byte[31];
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),498,r,497,r.read(bytes, 0, 0));
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testCharsetMismatchInfiniteLoop_add159() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCharsetMismatchInfiniteLoop_add159");
//        char[] inputChars = new char[]{ ((char)(224)) , ((char)(178)) , ((char)(160)) };
//        Charset charset = Charset.forName("ASCII");
//        InputStream stream = new CharSequenceInputStream(new String(inputChars) , charset , 512);
//        try {
//            while ((stream.read()) != (-1)) {
//            }
//        } finally {
//            stream.close();
//            stream.close();
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testCharsetMismatchInfiniteLoop() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCharsetMismatchInfiniteLoop");
//        char[] inputChars = new char[]{ ((char)(225)) , ((char)(178)) , ((char)(160)) };
//        Charset charset = Charset.forName("ASCII");
//        InputStream stream = new CharSequenceInputStream(new String(inputChars) , charset , 512);
//        try {
//            while ((stream.read()) != (-1)) {
//            }
//        } finally {
//            stream.close();
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testCharsetMismatchInfiniteLoop_literalMutation373() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCharsetMismatchInfiniteLoop_literalMutation373");
//        char[] inputChars = new char[]{ ((char)(224)) , ((char)(177)) , ((char)(160)) };
//        Charset charset = Charset.forName("ASCII");
//        InputStream stream = new CharSequenceInputStream(new String(inputChars) , charset , 512);
//        try {
//            while ((stream.read()) != (-1)) {
//            }
//        } finally {
//            stream.close();
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testCharsetMismatchInfiniteLoop_literalMutation374() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCharsetMismatchInfiniteLoop_literalMutation374");
//        char[] inputChars = new char[]{ ((char)(224)) , ((char)(178)) , ((char)(159)) };
//        Charset charset = Charset.forName("ASCII");
//        InputStream stream = new CharSequenceInputStream(new String(inputChars) , charset , 512);
//        try {
//            while ((stream.read()) != (-1)) {
//            }
//        } finally {
//            stream.close();
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testCharsetMismatchInfiniteLoop_literalMutation375() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCharsetMismatchInfiniteLoop_literalMutation375");
//        char[] inputChars = new char[]{ ((char)(224)) , ((char)(178)) , ((char)(160)) };
//        Charset charset = Charset.forName("foo");
//        InputStream stream = new CharSequenceInputStream(new String(inputChars) , charset , 512);
//        try {
//            while ((stream.read()) != (-1)) {
//            }
//        } finally {
//            stream.close();
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testCharsetMismatchInfiniteLoop_literalMutation376() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCharsetMismatchInfiniteLoop_literalMutation376");
//        char[] inputChars = new char[]{ ((char)(224)) , ((char)(178)) , ((char)(160)) };
//        Charset charset = Charset.forName("ASCII");
//        InputStream stream = new CharSequenceInputStream(new String(inputChars) , charset , 511);
//        try {
//            while ((stream.read()) != (-1)) {
//            }
//        } finally {
//            stream.close();
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testCharsetMismatchInfiniteLoop_literalMutation377() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCharsetMismatchInfiniteLoop_literalMutation377");
//        char[] inputChars = new char[]{ ((char)(224)) , ((char)(178)) , ((char)(160)) };
//        Charset charset = Charset.forName("ASCII");
//        InputStream stream = new CharSequenceInputStream(new String(inputChars) , charset , 512);
//        try {
//            while ((stream.read()) != 2) {
//            }
//        } finally {
//            stream.close();
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testSkip() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip");
//        InputStream r = new CharSequenceInputStream("test" , "UTF-8");
//        r.skip(1);
//        r.skip(2);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),502,r,501,r.read());
//        r.skip(100);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),503,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),505,r,504,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testSkip_add167() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_add167");
//        InputStream r = new CharSequenceInputStream("test" , "UTF-8");
//        r.skip(1);
//        r.skip(1);
//        r.skip(2);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),502,r,501,r.read());
//        r.skip(100);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),503,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),505,r,504,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testSkip_add168() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_add168");
//        InputStream r = new CharSequenceInputStream("test" , "UTF-8");
//        r.skip(1);
//        r.skip(2);
//        r.skip(2);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),502,r,501,r.read());
//        r.skip(100);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),503,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),505,r,504,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testSkip_add169() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_add169");
//        InputStream r = new CharSequenceInputStream("test" , "UTF-8");
//        r.skip(1);
//        r.skip(2);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),502,r,501,r.read());
//        r.skip(100);
//        r.skip(100);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),503,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),505,r,504,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testSkip_literalMutation392() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_literalMutation392");
//        InputStream r = new CharSequenceInputStream("foo" , "UTF-8");
//        r.skip(1);
//        r.skip(2);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),502,r,501,r.read());
//        r.skip(100);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),503,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),505,r,504,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testSkip_literalMutation393() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_literalMutation393");
//        InputStream r = new CharSequenceInputStream("test" , "foo");
//        r.skip(1);
//        r.skip(2);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),502,r,501,r.read());
//        r.skip(100);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),503,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),505,r,504,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testSkip_literalMutation394() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_literalMutation394");
//        InputStream r = new CharSequenceInputStream("test" , "UTF-8");
//        r.skip(0);
//        r.skip(2);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),502,r,501,r.read());
//        r.skip(100);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),503,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),505,r,504,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testSkip_literalMutation395() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_literalMutation395");
//        InputStream r = new CharSequenceInputStream("test" , "UTF-8");
//        r.skip(1);
//        r.skip(1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),502,r,501,r.read());
//        r.skip(100);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),503,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),505,r,504,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testSkip_literalMutation396() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_literalMutation396");
//        InputStream r = new CharSequenceInputStream("test" , "UTF-8");
//        r.skip(1);
//        r.skip(2);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),502,r,501,r.read());
//        r.skip(101);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),503,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),505,r,504,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testSkip_remove54() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_remove54");
//        InputStream r = new CharSequenceInputStream("test" , "UTF-8");
//        r.skip(2);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),502,r,501,r.read());
//        r.skip(100);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),503,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),505,r,504,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testSkip_remove55() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_remove55");
//        InputStream r = new CharSequenceInputStream("test" , "UTF-8");
//        r.skip(2);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),502,r,501,r.read());
//        r.skip(100);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),503,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),505,r,504,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testSkip_remove56() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_remove56");
//        InputStream r = new CharSequenceInputStream("test" , "UTF-8");
//        r.skip(2);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),502,r,501,r.read());
//        r.skip(100);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),503,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),505,r,504,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testMarkReset_add162() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkReset_add162");
//        InputStream r = new CharSequenceInputStream("test" , "UTF-8");
//        r.skip(2);
//        r.skip(2);
//        r.mark(0);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),482,r,481,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),484,r,483,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),485,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,r,486,r.read());
//        r.reset();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),489,r,488,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),491,r,490,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),492,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),494,r,493,r.read());
//        r.reset();
//        r.reset();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testMarkReset_add163() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkReset_add163");
//        InputStream r = new CharSequenceInputStream("test" , "UTF-8");
//        r.skip(2);
//        r.mark(0);
//        r.mark(0);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),482,r,481,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),484,r,483,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),485,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,r,486,r.read());
//        r.reset();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),489,r,488,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),491,r,490,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),492,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),494,r,493,r.read());
//        r.reset();
//        r.reset();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testMarkReset_add164() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkReset_add164");
//        InputStream r = new CharSequenceInputStream("test" , "UTF-8");
//        r.skip(2);
//        r.mark(0);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),482,r,481,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),484,r,483,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),485,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,r,486,r.read());
//        r.reset();
//        r.reset();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),489,r,488,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),491,r,490,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),492,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),494,r,493,r.read());
//        r.reset();
//        r.reset();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testMarkReset_add165() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkReset_add165");
//        InputStream r = new CharSequenceInputStream("test" , "UTF-8");
//        r.skip(2);
//        r.mark(0);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),482,r,481,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),484,r,483,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),485,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,r,486,r.read());
//        r.reset();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),489,r,488,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),491,r,490,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),492,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),494,r,493,r.read());
//        r.reset();
//        r.reset();
//        r.reset();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testMarkReset_add166() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkReset_add166");
//        InputStream r = new CharSequenceInputStream("test" , "UTF-8");
//        r.skip(2);
//        r.mark(0);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),482,r,481,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),484,r,483,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),485,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,r,486,r.read());
//        r.reset();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),489,r,488,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),491,r,490,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),492,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),494,r,493,r.read());
//        r.reset();
//        r.reset();
//        r.reset();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testMarkReset() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkReset");
//        InputStream r = new CharSequenceInputStream("foo" , "UTF-8");
//        r.skip(2);
//        r.mark(0);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),482,r,481,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),484,r,483,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),485,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,r,486,r.read());
//        r.reset();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),489,r,488,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),491,r,490,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),492,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),494,r,493,r.read());
//        r.reset();
//        r.reset();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testMarkReset_literalMutation381() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkReset_literalMutation381");
//        InputStream r = new CharSequenceInputStream("test" , "foo");
//        r.skip(2);
//        r.mark(0);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),482,r,481,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),484,r,483,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),485,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,r,486,r.read());
//        r.reset();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),489,r,488,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),491,r,490,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),492,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),494,r,493,r.read());
//        r.reset();
//        r.reset();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testMarkReset_literalMutation382() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkReset_literalMutation382");
//        InputStream r = new CharSequenceInputStream("test" , "UTF-8");
//        r.skip(3);
//        r.mark(0);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),482,r,481,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),484,r,483,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),485,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,r,486,r.read());
//        r.reset();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),489,r,488,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),491,r,490,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),492,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),494,r,493,r.read());
//        r.reset();
//        r.reset();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testMarkReset_literalMutation383() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkReset_literalMutation383");
//        InputStream r = new CharSequenceInputStream("test" , "UTF-8");
//        r.skip(2);
//        r.mark(1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),482,r,481,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),484,r,483,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),485,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,r,486,r.read());
//        r.reset();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),489,r,488,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),491,r,490,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),492,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),494,r,493,r.read());
//        r.reset();
//        r.reset();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testMarkReset_remove49() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkReset_remove49");
//        InputStream r = new CharSequenceInputStream("test" , "UTF-8");
//        r.mark(0);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),482,r,481,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),484,r,483,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),485,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,r,486,r.read());
//        r.reset();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),489,r,488,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),491,r,490,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),492,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),494,r,493,r.read());
//        r.reset();
//        r.reset();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testMarkReset_remove50() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkReset_remove50");
//        InputStream r = new CharSequenceInputStream("test" , "UTF-8");
//        r.skip(2);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),482,r,481,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),484,r,483,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),485,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,r,486,r.read());
//        r.reset();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),489,r,488,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),491,r,490,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),492,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),494,r,493,r.read());
//        r.reset();
//        r.reset();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testMarkReset_remove51() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkReset_remove51");
//        InputStream r = new CharSequenceInputStream("test" , "UTF-8");
//        r.skip(2);
//        r.mark(0);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),482,r,481,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),484,r,483,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),485,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,r,486,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),489,r,488,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),491,r,490,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),492,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),494,r,493,r.read());
//        r.reset();
//        r.reset();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testMarkReset_remove52() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkReset_remove52");
//        InputStream r = new CharSequenceInputStream("test" , "UTF-8");
//        r.skip(2);
//        r.mark(0);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),482,r,481,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),484,r,483,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),485,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,r,486,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),489,r,488,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),491,r,490,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),492,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),494,r,493,r.read());
//        r.reset();
//        r.reset();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testMarkReset_remove53() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkReset_remove53");
//        InputStream r = new CharSequenceInputStream("test" , "UTF-8");
//        r.skip(2);
//        r.mark(0);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),482,r,481,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),484,r,483,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),485,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,r,486,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),489,r,488,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),491,r,490,r.read());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),492,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),494,r,493,r.read());
//        r.reset();
//        r.reset();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testMarkSupported() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported");
//        InputStream r = new CharSequenceInputStream("foo" , "UTF-8");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),496,r,495,r.markSupported());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testMarkSupported_literalMutation385() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_literalMutation385");
//        InputStream r = new CharSequenceInputStream("test" , "foo");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),496,r,495,r.markSupported());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//}
//

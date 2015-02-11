//package org.apache.commons.io.input;
//
//import java.io.CharArrayReader;
//import java.nio.charset.Charset;
//import java.io.IOException;
//import java.util.Random;
//import java.io.StringReader;
//import org.junit.Test;
//
//public class ReaderInputStreamTest {
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
//        ReaderInputStream in = new ReaderInputStream(new StringReader(testString) , charsetName);
//        for (byte b : bytes) {
//            int read = in.read();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),515,(read >= 0));
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
//        ReaderInputStream in = new ReaderInputStream(new StringReader(testString) , charsetName);
//        byte[] buffer = new byte[128];
//        int offset = 0;
//        while (true) {
//            int bufferOffset = random.nextInt(64);
//            int bufferLength = random.nextInt(64);
//            int read = in.read(buffer, bufferOffset, bufferLength);
//            if (read == (-1)) {
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),507,offset);
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),506,expected.length);
//                break;
//            } else {
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),509,(read <= bufferLength));
//                while (read > 0) {
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
//    private void testWithBufferedRead_literalMutation556(String testString, String charsetName) throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWithBufferedRead_literalMutation556");
//        byte[] expected = testString.getBytes(charsetName);
//        ReaderInputStream in = new ReaderInputStream(new StringReader(testString) , charsetName);
//        byte[] buffer = new byte[127];
//        int offset = 0;
//        while (true) {
//            int bufferOffset = random.nextInt(64);
//            int bufferLength = random.nextInt(64);
//            int read = in.read(buffer, bufferOffset, bufferLength);
//            if (read == (-1)) {
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),507,offset);
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),506,expected.length);
//                break;
//            } else {
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),509,(read <= bufferLength));
//                while (read > 0) {
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
//    private void testWithBufferedRead_literalMutation557(String testString, String charsetName) throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWithBufferedRead_literalMutation557");
//        byte[] expected = testString.getBytes(charsetName);
//        ReaderInputStream in = new ReaderInputStream(new StringReader(testString) , charsetName);
//        byte[] buffer = new byte[128];
//        int offset = -1;
//        while (true) {
//            int bufferOffset = random.nextInt(64);
//            int bufferLength = random.nextInt(64);
//            int read = in.read(buffer, bufferOffset, bufferLength);
//            if (read == (-1)) {
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),507,offset);
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),506,expected.length);
//                break;
//            } else {
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),509,(read <= bufferLength));
//                while (read > 0) {
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
//
//    private void testWithBufferedRead_literalMutation559(String testString, String charsetName) throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWithBufferedRead_literalMutation559");
//        byte[] expected = testString.getBytes(charsetName);
//        ReaderInputStream in = new ReaderInputStream(new StringReader(testString) , charsetName);
//        byte[] buffer = new byte[128];
//        int offset = 0;
//        while (true) {
//            int bufferOffset = random.nextInt(63);
//            int bufferLength = random.nextInt(64);
//            int read = in.read(buffer, bufferOffset, bufferLength);
//            if (read == (-1)) {
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),507,offset);
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),506,expected.length);
//                break;
//            } else {
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),509,(read <= bufferLength));
//                while (read > 0) {
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
//    private void testWithBufferedRead_literalMutation560(String testString, String charsetName) throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWithBufferedRead_literalMutation560");
//        byte[] expected = testString.getBytes(charsetName);
//        ReaderInputStream in = new ReaderInputStream(new StringReader(testString) , charsetName);
//        byte[] buffer = new byte[128];
//        int offset = 0;
//        while (true) {
//            int bufferOffset = random.nextInt(64);
//            int bufferLength = random.nextInt(63);
//            int read = in.read(buffer, bufferOffset, bufferLength);
//            if (read == (-1)) {
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),507,offset);
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),506,expected.length);
//                break;
//            } else {
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),509,(read <= bufferLength));
//                while (read > 0) {
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
//    private void testWithBufferedRead_literalMutation561(String testString, String charsetName) throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWithBufferedRead_literalMutation561");
//        byte[] expected = testString.getBytes(charsetName);
//        ReaderInputStream in = new ReaderInputStream(new StringReader(testString) , charsetName);
//        byte[] buffer = new byte[128];
//        int offset = 0;
//        while (true) {
//            int bufferOffset = random.nextInt(64);
//            int bufferLength = random.nextInt(64);
//            int read = in.read(buffer, bufferOffset, bufferLength);
//            if (read == 2) {
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),507,offset);
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),506,expected.length);
//                break;
//            } else {
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),509,(read <= bufferLength));
//                while (read > 0) {
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
//    private void testWithBufferedRead_literalMutation562(String testString, String charsetName) throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWithBufferedRead_literalMutation562");
//        byte[] expected = testString.getBytes(charsetName);
//        ReaderInputStream in = new ReaderInputStream(new StringReader(testString) , charsetName);
//        byte[] buffer = new byte[128];
//        int offset = 0;
//        while (true) {
//            int bufferOffset = random.nextInt(64);
//            int bufferLength = random.nextInt(64);
//            int read = in.read(buffer, bufferOffset, bufferLength);
//            if (read == (-1)) {
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),507,offset);
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),506,expected.length);
//                break;
//            } else {
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),509,(read <= bufferLength));
//                while (read > 1) {
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
//    @Test
//    public void testUTF8WithSingleByteRead() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8WithSingleByteRead");
//        testWithSingleByteRead(TEST_STRING, "UTF-8");
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testUTF8WithSingleByteRead_add229() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8WithSingleByteRead_add229");
//        testWithSingleByteRead(TEST_STRING, "UTF-8");
//        testWithSingleByteRead(TEST_STRING, "UTF-8");
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testUTF8WithSingleByteRead_literalMutation555() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8WithSingleByteRead_literalMutation555");
//        testWithSingleByteRead(TEST_STRING, "foo");
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testUTF8WithSingleByteRead_remove100() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8WithSingleByteRead_remove100");
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testLargeUTF8WithSingleByteRead() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeUTF8WithSingleByteRead");
//        testWithSingleByteRead(LARGE_TEST_STRING, "UTF-8");
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testLargeUTF8WithSingleByteRead_add226() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeUTF8WithSingleByteRead_add226");
//        testWithSingleByteRead(LARGE_TEST_STRING, "UTF-8");
//        testWithSingleByteRead(LARGE_TEST_STRING, "UTF-8");
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testLargeUTF8WithSingleByteRead_literalMutation548() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeUTF8WithSingleByteRead_literalMutation548");
//        testWithSingleByteRead(LARGE_TEST_STRING, "foo");
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testLargeUTF8WithSingleByteRead_remove97() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeUTF8WithSingleByteRead_remove97");
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testUTF8WithBufferedRead() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8WithBufferedRead");
//        testWithBufferedRead(TEST_STRING, "UTF-8");
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testUTF8WithBufferedRead_add228() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8WithBufferedRead_add228");
//        testWithBufferedRead(TEST_STRING, "UTF-8");
//        testWithBufferedRead(TEST_STRING, "UTF-8");
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testUTF8WithBufferedRead_literalMutation554() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8WithBufferedRead_literalMutation554");
//        testWithBufferedRead(TEST_STRING, "foo");
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testUTF8WithBufferedRead_remove99() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8WithBufferedRead_remove99");
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testLargeUTF8WithBufferedRead() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeUTF8WithBufferedRead");
//        testWithBufferedRead(LARGE_TEST_STRING, "UTF-8");
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testLargeUTF8WithBufferedRead_add225() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeUTF8WithBufferedRead_add225");
//        testWithBufferedRead(LARGE_TEST_STRING, "UTF-8");
//        testWithBufferedRead(LARGE_TEST_STRING, "UTF-8");
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testLargeUTF8WithBufferedRead_literalMutation547() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeUTF8WithBufferedRead_literalMutation547");
//        testWithBufferedRead(LARGE_TEST_STRING, "foo");
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testLargeUTF8WithBufferedRead_remove96() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeUTF8WithBufferedRead_remove96");
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testUTF16WithSingleByteRead() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16WithSingleByteRead");
//        testWithSingleByteRead(TEST_STRING, "UTF-16");
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testUTF16WithSingleByteRead_add227() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16WithSingleByteRead_add227");
//        testWithSingleByteRead(TEST_STRING, "UTF-16");
//        testWithSingleByteRead(TEST_STRING, "UTF-16");
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testUTF16WithSingleByteRead_literalMutation553() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16WithSingleByteRead_literalMutation553");
//        testWithSingleByteRead(TEST_STRING, "foo");
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testUTF16WithSingleByteRead_remove98() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16WithSingleByteRead_remove98");
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testReadZero() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadZero");
//        final String inStr = "test";
//        ReaderInputStream r = new ReaderInputStream(new StringReader(inStr));
//        byte[] bytes = new byte[30];
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),809,r,808,r.read(bytes, 0, 0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),811,inStr,810,inStr.length());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),813,r,812,r.read(bytes, 0, ((inStr.length()) + 1)));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),815,r,814,r.read(bytes, 0, 0));
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testReadZero_literalMutation549() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadZero_literalMutation549");
//        final String inStr = "foo";
//        ReaderInputStream r = new ReaderInputStream(new StringReader(inStr));
//        byte[] bytes = new byte[30];
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),809,r,808,r.read(bytes, 0, 0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),811,inStr,810,inStr.length());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),813,r,812,r.read(bytes, 0, ((inStr.length()) + 1)));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),815,r,814,r.read(bytes, 0, 0));
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testReadZero_literalMutation550() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadZero_literalMutation550");
//        final String inStr = "test";
//        ReaderInputStream r = new ReaderInputStream(new StringReader(inStr));
//        byte[] bytes = new byte[29];
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),809,r,808,r.read(bytes, 0, 0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),811,inStr,810,inStr.length());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),813,r,812,r.read(bytes, 0, ((inStr.length()) + 1)));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),815,r,814,r.read(bytes, 0, 0));
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testReadZeroEmptyString() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadZeroEmptyString");
//        ReaderInputStream r = new ReaderInputStream(new StringReader(""));
//        byte[] bytes = new byte[30];
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),817,r,816,r.read(bytes, 0, 0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),818,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,r,819,r.read(bytes, 0, 1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),822,r,821,r.read(bytes, 0, 0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),638,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),824,r,823,r.read(bytes, 0, 1));
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testReadZeroEmptyString_literalMutation551() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadZeroEmptyString_literalMutation551");
//        ReaderInputStream r = new ReaderInputStream(new StringReader("foo"));
//        byte[] bytes = new byte[30];
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),817,r,816,r.read(bytes, 0, 0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),818,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,r,819,r.read(bytes, 0, 1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),822,r,821,r.read(bytes, 0, 0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),638,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),824,r,823,r.read(bytes, 0, 1));
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test
//    public void testReadZeroEmptyString_literalMutation552() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadZeroEmptyString_literalMutation552");
//        ReaderInputStream r = new ReaderInputStream(new StringReader(""));
//        byte[] bytes = new byte[31];
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),817,r,816,r.read(bytes, 0, 0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),818,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,r,819,r.read(bytes, 0, 1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),822,r,821,r.read(bytes, 0, 0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),638,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),824,r,823,r.read(bytes, 0, 1));
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    /** 
//     * Tests https://issues.apache.org/jira/browse/IO-277
//     * 
//     * @throws IOException
//     */
//@Test
//    public void testCharsetMismatchInfiniteLoop() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCharsetMismatchInfiniteLoop");
//        char[] inputChars = new char[]{ ((char)(224)) , ((char)(178)) , ((char)(160)) };
//        Charset charset = Charset.forName("ASCII");
//        ReaderInputStream stream = new ReaderInputStream(new CharArrayReader(inputChars) , charset);
//        try {
//            while ((stream.read()) != (-1)) {
//            }
//        } finally {
//            stream.close();
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    /** 
//     * Tests https://issues.apache.org/jira/browse/IO-277
//     * 
//     * @throws IOException
//     */
//@Test(timeout = 1000)
//    public void testCharsetMismatchInfiniteLoop_add224() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCharsetMismatchInfiniteLoop_add224");
//        char[] inputChars = new char[]{ ((char)(224)) , ((char)(178)) , ((char)(160)) };
//        Charset charset = Charset.forName("ASCII");
//        ReaderInputStream stream = new ReaderInputStream(new CharArrayReader(inputChars) , charset);
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
//    /** 
//     * Tests https://issues.apache.org/jira/browse/IO-277
//     * 
//     * @throws IOException
//     */
//@Test
//    public void testCharsetMismatchInfiniteLoop_literalMutation542() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCharsetMismatchInfiniteLoop_literalMutation542");
//        char[] inputChars = new char[]{ ((char)(225)) , ((char)(178)) , ((char)(160)) };
//        Charset charset = Charset.forName("ASCII");
//        ReaderInputStream stream = new ReaderInputStream(new CharArrayReader(inputChars) , charset);
//        try {
//            while ((stream.read()) != (-1)) {
//            }
//        } finally {
//            stream.close();
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    /** 
//     * Tests https://issues.apache.org/jira/browse/IO-277
//     * 
//     * @throws IOException
//     */
//@Test
//    public void testCharsetMismatchInfiniteLoop_literalMutation543() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCharsetMismatchInfiniteLoop_literalMutation543");
//        char[] inputChars = new char[]{ ((char)(224)) , ((char)(179)) , ((char)(160)) };
//        Charset charset = Charset.forName("ASCII");
//        ReaderInputStream stream = new ReaderInputStream(new CharArrayReader(inputChars) , charset);
//        try {
//            while ((stream.read()) != (-1)) {
//            }
//        } finally {
//            stream.close();
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    /** 
//     * Tests https://issues.apache.org/jira/browse/IO-277
//     * 
//     * @throws IOException
//     */
//@Test
//    public void testCharsetMismatchInfiniteLoop_literalMutation544() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCharsetMismatchInfiniteLoop_literalMutation544");
//        char[] inputChars = new char[]{ ((char)(224)) , ((char)(178)) , ((char)(159)) };
//        Charset charset = Charset.forName("ASCII");
//        ReaderInputStream stream = new ReaderInputStream(new CharArrayReader(inputChars) , charset);
//        try {
//            while ((stream.read()) != (-1)) {
//            }
//        } finally {
//            stream.close();
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    /** 
//     * Tests https://issues.apache.org/jira/browse/IO-277
//     * 
//     * @throws IOException
//     */
//@Test
//    public void testCharsetMismatchInfiniteLoop_literalMutation545() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCharsetMismatchInfiniteLoop_literalMutation545");
//        char[] inputChars = new char[]{ ((char)(224)) , ((char)(178)) , ((char)(160)) };
//        Charset charset = Charset.forName("foo");
//        ReaderInputStream stream = new ReaderInputStream(new CharArrayReader(inputChars) , charset);
//        try {
//            while ((stream.read()) != (-1)) {
//            }
//        } finally {
//            stream.close();
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    /** 
//     * Tests https://issues.apache.org/jira/browse/IO-277
//     * 
//     * @throws IOException
//     */
//@Test
//    public void testCharsetMismatchInfiniteLoop_literalMutation546() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCharsetMismatchInfiniteLoop_literalMutation546");
//        char[] inputChars = new char[]{ ((char)(224)) , ((char)(178)) , ((char)(160)) };
//        Charset charset = Charset.forName("ASCII");
//        ReaderInputStream stream = new ReaderInputStream(new CharArrayReader(inputChars) , charset);
//        try {
//            while ((stream.read()) != 0) {
//            }
//        } finally {
//            stream.close();
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//}
//

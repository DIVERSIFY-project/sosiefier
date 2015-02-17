package org.apache.commons.io.output;

import java.io.IOException;
import java.util.Random;
import java.io.StringWriter;
import org.junit.Test;
import junit.framework.TestCase;

public class WriterOutputStreamTest extends TestCase {
    private static final String TEST_STRING = "à peine arrivés nous entrâmes dans sa chambre";

    private static final String LARGE_TEST_STRING;

    static {
        StringBuilder buffer = new StringBuilder();
        for (int i = 0 ; i < 100 ; i++) {
            buffer.append(TEST_STRING);
        }
        LARGE_TEST_STRING = buffer.toString();
    }

    private Random random = new Random();

    @Test(timeout = 1000)
    private void testWithSingleByteWrite(String testString, String charsetName) throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWithSingleByteWrite");
        byte[] bytes = testString.getBytes(charsetName);
        StringWriter writer = new StringWriter();
        WriterOutputStream out = new WriterOutputStream(writer , charsetName);
        for (byte b : bytes) {
            out.write(b);
            out.write(b);
        }
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1689,testString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1691,writer,1690,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testWithSingleByteWrite_add1134(String testString, String charsetName) throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWithSingleByteWrite_add1134");
        byte[] bytes = testString.getBytes(charsetName);
        StringWriter writer = new StringWriter();
        WriterOutputStream out = new WriterOutputStream(writer , charsetName);
        for (byte b : bytes) {
            out.write(b);
        }
        out.close();
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1689,testString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1691,writer,1690,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testWithSingleByteWrite_remove871(String testString, String charsetName) throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWithSingleByteWrite_remove871");
        byte[] bytes = testString.getBytes(charsetName);
        StringWriter writer = new StringWriter();
        WriterOutputStream out = new WriterOutputStream(writer , charsetName);
        for (byte b : bytes) {
        }
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1689,testString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1691,writer,1690,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testWithSingleByteWrite_remove872(String testString, String charsetName) throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWithSingleByteWrite_remove872");
        byte[] bytes = testString.getBytes(charsetName);
        StringWriter writer = new StringWriter();
        WriterOutputStream out = new WriterOutputStream(writer , charsetName);
        for (byte b : bytes) {
            out.write(b);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1689,testString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1691,writer,1690,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testWithBufferedWrite_add1131(String testString, String charsetName) throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWithBufferedWrite_add1131");
        byte[] expected = testString.getBytes(charsetName);
        StringWriter writer = new StringWriter();
        WriterOutputStream out = new WriterOutputStream(writer , charsetName);
        int offset = 0;
        while (offset < (expected.length)) {
            int length = java.lang.Math.min(random.nextInt(128), ((expected.length) - offset));
            out.write(expected, offset, length);
            out.write(expected, offset, length);
            offset += length;
        }
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,testString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,writer,1687,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testWithBufferedWrite_add1132(String testString, String charsetName) throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWithBufferedWrite_add1132");
        byte[] expected = testString.getBytes(charsetName);
        StringWriter writer = new StringWriter();
        WriterOutputStream out = new WriterOutputStream(writer , charsetName);
        int offset = 0;
        while (offset < (expected.length)) {
            int length = java.lang.Math.min(random.nextInt(128), ((expected.length) - offset));
            out.write(expected, offset, length);
            offset += length;
        }
        out.close();
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,testString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,writer,1687,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testWithBufferedWrite(String testString, String charsetName) throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWithBufferedWrite");
        byte[] expected = testString.getBytes(charsetName);
        StringWriter writer = new StringWriter();
        WriterOutputStream out = new WriterOutputStream(writer , charsetName);
        int offset = 1;
        while (offset < (expected.length)) {
            int length = java.lang.Math.min(random.nextInt(128), ((expected.length) - offset));
            out.write(expected, offset, length);
            offset += length;
        }
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,testString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,writer,1687,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testWithBufferedWrite_literalMutation3737(String testString, String charsetName) throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWithBufferedWrite_literalMutation3737");
        byte[] expected = testString.getBytes(charsetName);
        StringWriter writer = new StringWriter();
        WriterOutputStream out = new WriterOutputStream(writer , charsetName);
        int offset = -1;
        while (offset < (expected.length)) {
            int length = java.lang.Math.min(random.nextInt(128), ((expected.length) - offset));
            out.write(expected, offset, length);
            offset += length;
        }
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,testString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,writer,1687,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testWithBufferedWrite_literalMutation3738(String testString, String charsetName) throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWithBufferedWrite_literalMutation3738");
        byte[] expected = testString.getBytes(charsetName);
        StringWriter writer = new StringWriter();
        WriterOutputStream out = new WriterOutputStream(writer , charsetName);
        int offset = 0;
        while (offset < (expected.length)) {
            int length = java.lang.Math.min(random.nextInt(128), ((expected.length) - offset));
            out.write(expected, offset, length);
            offset += length;
        }
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,testString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,writer,1687,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testWithBufferedWrite_literalMutation3739(String testString, String charsetName) throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWithBufferedWrite_literalMutation3739");
        byte[] expected = testString.getBytes(charsetName);
        StringWriter writer = new StringWriter();
        WriterOutputStream out = new WriterOutputStream(writer , charsetName);
        int offset = 0;
        while (offset < (expected.length)) {
            int length = java.lang.Math.min(random.nextInt(129), ((expected.length) - offset));
            out.write(expected, offset, length);
            offset += length;
        }
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,testString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,writer,1687,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testWithBufferedWrite_literalMutation3740(String testString, String charsetName) throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWithBufferedWrite_literalMutation3740");
        byte[] expected = testString.getBytes(charsetName);
        StringWriter writer = new StringWriter();
        WriterOutputStream out = new WriterOutputStream(writer , charsetName);
        int offset = 0;
        while (offset < (expected.length)) {
            int length = java.lang.Math.min(random.nextInt(64), ((expected.length) - offset));
            out.write(expected, offset, length);
            offset += length;
        }
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,testString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,writer,1687,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testWithBufferedWrite_literalMutation3741(String testString, String charsetName) throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWithBufferedWrite_literalMutation3741");
        byte[] expected = testString.getBytes(charsetName);
        StringWriter writer = new StringWriter();
        WriterOutputStream out = new WriterOutputStream(writer , charsetName);
        int offset = 0;
        while (offset < (expected.length)) {
            int length = java.lang.Math.min(random.nextInt(256), ((expected.length) - offset));
            out.write(expected, offset, length);
            offset += length;
        }
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,testString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,writer,1687,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testWithBufferedWrite_literalMutation3742(String testString, String charsetName) throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWithBufferedWrite_literalMutation3742");
        byte[] expected = testString.getBytes(charsetName);
        StringWriter writer = new StringWriter();
        WriterOutputStream out = new WriterOutputStream(writer , charsetName);
        int offset = 0;
        while (offset < (expected.length)) {
            int length = java.lang.Math.min(random.nextInt(127), ((expected.length) - offset));
            out.write(expected, offset, length);
            offset += length;
        }
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,testString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,writer,1687,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testWithBufferedWrite_remove870(String testString, String charsetName) throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWithBufferedWrite_remove870");
        byte[] expected = testString.getBytes(charsetName);
        StringWriter writer = new StringWriter();
        WriterOutputStream out = new WriterOutputStream(writer , charsetName);
        int offset = 0;
        while (offset < (expected.length)) {
            int length = java.lang.Math.min(random.nextInt(128), ((expected.length) - offset));
            out.write(expected, offset, length);
            offset += length;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,testString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,writer,1687,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF8WithSingleByteWrite_add1130() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8WithSingleByteWrite_add1130");
        testWithSingleByteWrite(TEST_STRING, "UTF-8");
        testWithSingleByteWrite(TEST_STRING, "UTF-8");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUTF8WithSingleByteWrite() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8WithSingleByteWrite");
        testWithSingleByteWrite(TEST_STRING, "bar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF8WithSingleByteWrite_remove869() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8WithSingleByteWrite_remove869");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLargeUTF8WithSingleByteWrite_add1122() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeUTF8WithSingleByteWrite_add1122");
        testWithSingleByteWrite(LARGE_TEST_STRING, "UTF-8");
        testWithSingleByteWrite(LARGE_TEST_STRING, "UTF-8");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLargeUTF8WithSingleByteWrite() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeUTF8WithSingleByteWrite");
        testWithSingleByteWrite(LARGE_TEST_STRING, "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLargeUTF8WithSingleByteWrite_remove861() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeUTF8WithSingleByteWrite_remove861");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF8WithBufferedWrite_add1129() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8WithBufferedWrite_add1129");
        testWithBufferedWrite(TEST_STRING, "UTF-8");
        testWithBufferedWrite(TEST_STRING, "UTF-8");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUTF8WithBufferedWrite() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8WithBufferedWrite");
        testWithBufferedWrite(TEST_STRING, "bar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF8WithBufferedWrite_remove868() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8WithBufferedWrite_remove868");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLargeUTF8WithBufferedWrite_add1121() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeUTF8WithBufferedWrite_add1121");
        testWithBufferedWrite(LARGE_TEST_STRING, "UTF-8");
        testWithBufferedWrite(LARGE_TEST_STRING, "UTF-8");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLargeUTF8WithBufferedWrite() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeUTF8WithBufferedWrite");
        testWithBufferedWrite(LARGE_TEST_STRING, "bar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLargeUTF8WithBufferedWrite_remove860() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeUTF8WithBufferedWrite_remove860");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF16WithSingleByteWrite_add1128() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16WithSingleByteWrite_add1128");
        testWithSingleByteWrite(TEST_STRING, "UTF-16");
        testWithSingleByteWrite(TEST_STRING, "UTF-16");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUTF16WithSingleByteWrite() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16WithSingleByteWrite");
        testWithSingleByteWrite(TEST_STRING, "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF16WithSingleByteWrite_remove867() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16WithSingleByteWrite_remove867");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF16WithBufferedWrite_add1127() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16WithBufferedWrite_add1127");
        testWithBufferedWrite(TEST_STRING, "UTF-16");
        testWithBufferedWrite(TEST_STRING, "UTF-16");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUTF16WithBufferedWrite() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16WithBufferedWrite");
        testWithBufferedWrite(TEST_STRING, "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF16WithBufferedWrite_remove866() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16WithBufferedWrite_remove866");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF16BEWithSingleByteWrite_add1124() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16BEWithSingleByteWrite_add1124");
        testWithSingleByteWrite(TEST_STRING, "UTF-16BE");
        testWithSingleByteWrite(TEST_STRING, "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUTF16BEWithSingleByteWrite() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16BEWithSingleByteWrite");
        testWithSingleByteWrite(TEST_STRING, "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF16BEWithSingleByteWrite_remove863() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16BEWithSingleByteWrite_remove863");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF16BEWithBufferedWrite_add1123() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16BEWithBufferedWrite_add1123");
        testWithBufferedWrite(TEST_STRING, "UTF-16BE");
        testWithBufferedWrite(TEST_STRING, "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUTF16BEWithBufferedWrite() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16BEWithBufferedWrite");
        testWithBufferedWrite(TEST_STRING, "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF16BEWithBufferedWrite_remove862() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16BEWithBufferedWrite_remove862");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF16LEWithSingleByteWrite_add1126() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16LEWithSingleByteWrite_add1126");
        testWithSingleByteWrite(TEST_STRING, "UTF-16LE");
        testWithSingleByteWrite(TEST_STRING, "UTF-16LE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUTF16LEWithSingleByteWrite() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16LEWithSingleByteWrite");
        testWithSingleByteWrite(TEST_STRING, "bar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF16LEWithSingleByteWrite_remove865() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16LEWithSingleByteWrite_remove865");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF16LEWithBufferedWrite_add1125() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16LEWithBufferedWrite_add1125");
        testWithBufferedWrite(TEST_STRING, "UTF-16LE");
        testWithBufferedWrite(TEST_STRING, "UTF-16LE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUTF16LEWithBufferedWrite() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16LEWithBufferedWrite");
        testWithBufferedWrite(TEST_STRING, "bar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF16LEWithBufferedWrite_remove864() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16LEWithBufferedWrite_remove864");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFlush() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFlush");
        StringWriter writer = new StringWriter();
        WriterOutputStream out = new WriterOutputStream(writer , "us-ascii" , 1024 , false);
        out.write("abc".getBytes("us-ascii"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1683,writer.getBuffer(),1682,writer.getBuffer().length());
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1685,writer,1684,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFlush_add1119() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFlush_add1119");
        StringWriter writer = new StringWriter();
        WriterOutputStream out = new WriterOutputStream(writer , "us-ascii" , 1024 , false);
        out.write("abc".getBytes("us-ascii"));
        out.write("abc".getBytes("us-ascii"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1683,writer.getBuffer(),1682,writer.getBuffer().length());
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1685,writer,1684,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFlush_add1120() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFlush_add1120");
        StringWriter writer = new StringWriter();
        WriterOutputStream out = new WriterOutputStream(writer , "us-ascii" , 1024 , false);
        out.write("abc".getBytes("us-ascii"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1683,writer.getBuffer(),1682,writer.getBuffer().length());
        out.flush();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1685,writer,1684,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFlush_literalMutation3718() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFlush_literalMutation3718");
        StringWriter writer = new StringWriter();
        WriterOutputStream out = new WriterOutputStream(writer , "bar" , 1024 , false);
        out.write("abc".getBytes("us-ascii"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1683,writer.getBuffer(),1682,writer.getBuffer().length());
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1685,writer,1684,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFlush_literalMutation3719() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFlush_literalMutation3719");
        StringWriter writer = new StringWriter();
        WriterOutputStream out = new WriterOutputStream(writer , "us-ascii" , 1025 , false);
        out.write("abc".getBytes("us-ascii"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1683,writer.getBuffer(),1682,writer.getBuffer().length());
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1685,writer,1684,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFlush_literalMutation3720() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFlush_literalMutation3720");
        StringWriter writer = new StringWriter();
        WriterOutputStream out = new WriterOutputStream(writer , "us-ascii" , 512 , false);
        out.write("abc".getBytes("us-ascii"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1683,writer.getBuffer(),1682,writer.getBuffer().length());
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1685,writer,1684,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFlush_literalMutation3721() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFlush_literalMutation3721");
        StringWriter writer = new StringWriter();
        WriterOutputStream out = new WriterOutputStream(writer , "us-ascii" , 2048 , false);
        out.write("abc".getBytes("us-ascii"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1683,writer.getBuffer(),1682,writer.getBuffer().length());
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1685,writer,1684,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFlush_literalMutation3722() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFlush_literalMutation3722");
        StringWriter writer = new StringWriter();
        WriterOutputStream out = new WriterOutputStream(writer , "us-ascii" , 1023 , false);
        out.write("abc".getBytes("us-ascii"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1683,writer.getBuffer(),1682,writer.getBuffer().length());
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1685,writer,1684,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFlush_literalMutation3723() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFlush_literalMutation3723");
        StringWriter writer = new StringWriter();
        WriterOutputStream out = new WriterOutputStream(writer , "us-ascii" , 1024 , true);
        out.write("abc".getBytes("us-ascii"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1683,writer.getBuffer(),1682,writer.getBuffer().length());
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1685,writer,1684,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFlush_literalMutation3724() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFlush_literalMutation3724");
        StringWriter writer = new StringWriter();
        WriterOutputStream out = new WriterOutputStream(writer , "us-ascii" , 1024 , false);
        out.write("foo".getBytes("us-ascii"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1683,writer.getBuffer(),1682,writer.getBuffer().length());
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1685,writer,1684,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFlush_literalMutation3725() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFlush_literalMutation3725");
        StringWriter writer = new StringWriter();
        WriterOutputStream out = new WriterOutputStream(writer , "us-ascii" , 1024 , false);
        out.write("abc".getBytes("bar"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1683,writer.getBuffer(),1682,writer.getBuffer().length());
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1685,writer,1684,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFlush_remove858() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFlush_remove858");
        StringWriter writer = new StringWriter();
        WriterOutputStream out = new WriterOutputStream(writer , "us-ascii" , 1024 , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1683,writer.getBuffer(),1682,writer.getBuffer().length());
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1685,writer,1684,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFlush_remove859() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFlush_remove859");
        StringWriter writer = new StringWriter();
        WriterOutputStream out = new WriterOutputStream(writer , "us-ascii" , 1024 , false);
        out.write("abc".getBytes("us-ascii"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1683,writer.getBuffer(),1682,writer.getBuffer().length());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1685,writer,1684,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteImmediately_add1135() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteImmediately_add1135");
        StringWriter writer = new StringWriter();
        WriterOutputStream out = new WriterOutputStream(writer , "us-ascii" , 1024 , true);
        out.write("abc".getBytes("us-ascii"));
        out.write("abc".getBytes("us-ascii"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1693,writer,1692,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteImmediately() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteImmediately");
        StringWriter writer = new StringWriter();
        WriterOutputStream out = new WriterOutputStream(writer , "bar" , 1024 , true);
        out.write("abc".getBytes("us-ascii"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1693,writer,1692,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteImmediately_literalMutation3744() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteImmediately_literalMutation3744");
        StringWriter writer = new StringWriter();
        WriterOutputStream out = new WriterOutputStream(writer , "us-ascii" , 1025 , true);
        out.write("abc".getBytes("us-ascii"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1693,writer,1692,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteImmediately_literalMutation3745() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteImmediately_literalMutation3745");
        StringWriter writer = new StringWriter();
        WriterOutputStream out = new WriterOutputStream(writer , "us-ascii" , 512 , true);
        out.write("abc".getBytes("us-ascii"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1693,writer,1692,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteImmediately_literalMutation3746() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteImmediately_literalMutation3746");
        StringWriter writer = new StringWriter();
        WriterOutputStream out = new WriterOutputStream(writer , "us-ascii" , 2048 , true);
        out.write("abc".getBytes("us-ascii"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1693,writer,1692,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteImmediately_literalMutation3747() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteImmediately_literalMutation3747");
        StringWriter writer = new StringWriter();
        WriterOutputStream out = new WriterOutputStream(writer , "us-ascii" , 1023 , true);
        out.write("abc".getBytes("us-ascii"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1693,writer,1692,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteImmediately_literalMutation3748() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteImmediately_literalMutation3748");
        StringWriter writer = new StringWriter();
        WriterOutputStream out = new WriterOutputStream(writer , "us-ascii" , 1024 , false);
        out.write("abc".getBytes("us-ascii"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1693,writer,1692,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteImmediately_literalMutation3749() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteImmediately_literalMutation3749");
        StringWriter writer = new StringWriter();
        WriterOutputStream out = new WriterOutputStream(writer , "us-ascii" , 1024 , true);
        out.write("foo".getBytes("us-ascii"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1693,writer,1692,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteImmediately_literalMutation3750() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteImmediately_literalMutation3750");
        StringWriter writer = new StringWriter();
        WriterOutputStream out = new WriterOutputStream(writer , "us-ascii" , 1024 , true);
        out.write("abc".getBytes("bar"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1693,writer,1692,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteImmediately_remove873() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteImmediately_remove873");
        StringWriter writer = new StringWriter();
        WriterOutputStream out = new WriterOutputStream(writer , "us-ascii" , 1024 , true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1693,writer,1692,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


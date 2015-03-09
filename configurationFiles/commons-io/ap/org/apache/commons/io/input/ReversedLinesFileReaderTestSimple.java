package org.apache.commons.io.input;

import org.junit.After;
import java.io.File;
import java.io.IOException;
import org.junit.Test;
import java.net.URISyntaxException;
import java.io.UnsupportedEncodingException;

public class ReversedLinesFileReaderTestSimple {
    private ReversedLinesFileReader reversedLinesFileReader;

    @After
    public void closeReader() {
        try {
            reversedLinesFileReader.close();
        } catch (Exception e) {
        }
    }

    @Test
    public void testFileSizeIsExactMultipleOfBlockSize() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileSizeIsExactMultipleOfBlockSize");
        int blockSize = 10;
        File testFile20Bytes = new File(getClass().getResource("/test-file-20byteslength.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFile20Bytes , blockSize , "ISO-8859-1");
        String testLine = "123456789";
        org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFileSizeIsExactMultipleOfBlockSize_add244() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileSizeIsExactMultipleOfBlockSize_add244");
        int blockSize = 10;
        File testFile20Bytes = new File(getClass().getResource("/test-file-20byteslength.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFile20Bytes , blockSize , "ISO-8859-1");
        String testLine = "123456789";
        org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFileSizeIsExactMultipleOfBlockSize_add245() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileSizeIsExactMultipleOfBlockSize_add245");
        int blockSize = 10;
        File testFile20Bytes = new File(getClass().getResource("/test-file-20byteslength.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFile20Bytes , blockSize , "ISO-8859-1");
        String testLine = "123456789";
        org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testFileSizeIsExactMultipleOfBlockSize_literalMutation1264() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileSizeIsExactMultipleOfBlockSize_literalMutation1264");
        int blockSize = 9;
        File testFile20Bytes = new File(getClass().getResource("/test-file-20byteslength.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFile20Bytes , blockSize , "ISO-8859-1");
        String testLine = "123456789";
        org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testFileSizeIsExactMultipleOfBlockSize_literalMutation1265() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileSizeIsExactMultipleOfBlockSize_literalMutation1265");
        int blockSize = 5;
        File testFile20Bytes = new File(getClass().getResource("/test-file-20byteslength.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFile20Bytes , blockSize , "ISO-8859-1");
        String testLine = "123456789";
        org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testFileSizeIsExactMultipleOfBlockSize_literalMutation1266() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileSizeIsExactMultipleOfBlockSize_literalMutation1266");
        int blockSize = 20;
        File testFile20Bytes = new File(getClass().getResource("/test-file-20byteslength.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFile20Bytes , blockSize , "ISO-8859-1");
        String testLine = "123456789";
        org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testFileSizeIsExactMultipleOfBlockSize_literalMutation1267() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileSizeIsExactMultipleOfBlockSize_literalMutation1267");
        int blockSize = 11;
        File testFile20Bytes = new File(getClass().getResource("/test-file-20byteslength.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFile20Bytes , blockSize , "ISO-8859-1");
        String testLine = "123456789";
        org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testFileSizeIsExactMultipleOfBlockSize_literalMutation1268() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileSizeIsExactMultipleOfBlockSize_literalMutation1268");
        int blockSize = 10;
        File testFile20Bytes = new File(getClass().getResource("bar").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFile20Bytes , blockSize , "ISO-8859-1");
        String testLine = "123456789";
        org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testFileSizeIsExactMultipleOfBlockSize_literalMutation1269() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileSizeIsExactMultipleOfBlockSize_literalMutation1269");
        int blockSize = 10;
        File testFile20Bytes = new File(getClass().getResource("/test-file-20byteslength.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFile20Bytes , blockSize , "foo");
        String testLine = "123456789";
        org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testFileSizeIsExactMultipleOfBlockSize_literalMutation1270() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileSizeIsExactMultipleOfBlockSize_literalMutation1270");
        int blockSize = 10;
        File testFile20Bytes = new File(getClass().getResource("/test-file-20byteslength.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFile20Bytes , blockSize , "ISO-8859-1");
        String testLine = "bar";
        org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFileSizeIsExactMultipleOfBlockSize_remove114() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileSizeIsExactMultipleOfBlockSize_remove114");
        int blockSize = 10;
        File testFile20Bytes = new File(getClass().getResource("/test-file-20byteslength.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFile20Bytes , blockSize , "ISO-8859-1");
        String testLine = "123456789";
        org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFileSizeIsExactMultipleOfBlockSize_remove115() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileSizeIsExactMultipleOfBlockSize_remove115");
        int blockSize = 10;
        File testFile20Bytes = new File(getClass().getResource("/test-file-20byteslength.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFile20Bytes , blockSize , "ISO-8859-1");
        String testLine = "123456789";
        org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = UnsupportedEncodingException.class)
    public void testUnsupportedEncodingUTF16() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedEncodingUTF16");
        File testFileEmpty = new File(getClass().getResource("/test-file-empty.bin").toURI());
        new ReversedLinesFileReader(testFileEmpty , 4096 , "UTF-16");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = UnsupportedEncodingException.class)
    public void testUnsupportedEncodingUTF16_literalMutation1277() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedEncodingUTF16_literalMutation1277");
        File testFileEmpty = new File(getClass().getResource("foo").toURI());
        new ReversedLinesFileReader(testFileEmpty , 4096 , "UTF-16");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = UnsupportedEncodingException.class)
    public void testUnsupportedEncodingUTF16_literalMutation1278() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedEncodingUTF16_literalMutation1278");
        File testFileEmpty = new File(getClass().getResource("/test-file-empty.bin").toURI());
        new ReversedLinesFileReader(testFileEmpty , 4097 , "UTF-16");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = UnsupportedEncodingException.class)
    public void testUnsupportedEncodingUTF16_literalMutation1279() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedEncodingUTF16_literalMutation1279");
        File testFileEmpty = new File(getClass().getResource("/test-file-empty.bin").toURI());
        new ReversedLinesFileReader(testFileEmpty , 2048 , "UTF-16");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = UnsupportedEncodingException.class)
    public void testUnsupportedEncodingUTF16_literalMutation1280() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedEncodingUTF16_literalMutation1280");
        File testFileEmpty = new File(getClass().getResource("/test-file-empty.bin").toURI());
        new ReversedLinesFileReader(testFileEmpty , 8192 , "UTF-16");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = UnsupportedEncodingException.class)
    public void testUnsupportedEncodingUTF16_literalMutation1281() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedEncodingUTF16_literalMutation1281");
        File testFileEmpty = new File(getClass().getResource("/test-file-empty.bin").toURI());
        new ReversedLinesFileReader(testFileEmpty , 4095 , "UTF-16");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = UnsupportedEncodingException.class)
    public void testUnsupportedEncodingUTF16_literalMutation1282() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedEncodingUTF16_literalMutation1282");
        File testFileEmpty = new File(getClass().getResource("/test-file-empty.bin").toURI());
        new ReversedLinesFileReader(testFileEmpty , 4096 , "bar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = UnsupportedEncodingException.class)
    public void testUnsupportedEncodingBig5() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedEncodingBig5");
        File testFileEncodingBig5 = new File(getClass().getResource("/test-file-empty.bin").toURI());
        new ReversedLinesFileReader(testFileEncodingBig5 , 4096 , "Big5");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = UnsupportedEncodingException.class)
    public void testUnsupportedEncodingBig5_literalMutation1271() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedEncodingBig5_literalMutation1271");
        File testFileEncodingBig5 = new File(getClass().getResource("foo").toURI());
        new ReversedLinesFileReader(testFileEncodingBig5 , 4096 , "Big5");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = UnsupportedEncodingException.class)
    public void testUnsupportedEncodingBig5_literalMutation1272() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedEncodingBig5_literalMutation1272");
        File testFileEncodingBig5 = new File(getClass().getResource("/test-file-empty.bin").toURI());
        new ReversedLinesFileReader(testFileEncodingBig5 , 4097 , "Big5");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = UnsupportedEncodingException.class)
    public void testUnsupportedEncodingBig5_literalMutation1273() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedEncodingBig5_literalMutation1273");
        File testFileEncodingBig5 = new File(getClass().getResource("/test-file-empty.bin").toURI());
        new ReversedLinesFileReader(testFileEncodingBig5 , 2048 , "Big5");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = UnsupportedEncodingException.class)
    public void testUnsupportedEncodingBig5_literalMutation1274() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedEncodingBig5_literalMutation1274");
        File testFileEncodingBig5 = new File(getClass().getResource("/test-file-empty.bin").toURI());
        new ReversedLinesFileReader(testFileEncodingBig5 , 8192 , "Big5");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = UnsupportedEncodingException.class)
    public void testUnsupportedEncodingBig5_literalMutation1275() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedEncodingBig5_literalMutation1275");
        File testFileEncodingBig5 = new File(getClass().getResource("/test-file-empty.bin").toURI());
        new ReversedLinesFileReader(testFileEncodingBig5 , 4095 , "Big5");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = UnsupportedEncodingException.class)
    public void testUnsupportedEncodingBig5_literalMutation1276() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedEncodingBig5_literalMutation1276");
        File testFileEncodingBig5 = new File(getClass().getResource("/test-file-empty.bin").toURI());
        new ReversedLinesFileReader(testFileEncodingBig5 , 4096 , "bar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


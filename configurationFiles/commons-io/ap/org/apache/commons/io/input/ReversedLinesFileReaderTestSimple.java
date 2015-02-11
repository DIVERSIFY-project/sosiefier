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
    public void testFileSizeIsExactMultipleOfBlockSize_literalMutation593() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileSizeIsExactMultipleOfBlockSize_literalMutation593");
        int blockSize = 11;
        File testFile20Bytes = new File(getClass().getResource("/test-file-20byteslength.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFile20Bytes , blockSize , "ISO-8859-1");
        String testLine = "123456789";
        org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testFileSizeIsExactMultipleOfBlockSize_literalMutation594() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileSizeIsExactMultipleOfBlockSize_literalMutation594");
        int blockSize = 10;
        File testFile20Bytes = new File(getClass().getResource("foo").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFile20Bytes , blockSize , "ISO-8859-1");
        String testLine = "123456789";
        org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testFileSizeIsExactMultipleOfBlockSize_literalMutation595() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileSizeIsExactMultipleOfBlockSize_literalMutation595");
        int blockSize = 10;
        File testFile20Bytes = new File(getClass().getResource("/test-file-20byteslength.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFile20Bytes , blockSize , "foo");
        String testLine = "123456789";
        org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testFileSizeIsExactMultipleOfBlockSize_literalMutation596() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileSizeIsExactMultipleOfBlockSize_literalMutation596");
        int blockSize = 10;
        File testFile20Bytes = new File(getClass().getResource("/test-file-20byteslength.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFile20Bytes , blockSize , "ISO-8859-1");
        String testLine = "foo";
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
    public void testUnsupportedEncodingUTF16_literalMutation600() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedEncodingUTF16_literalMutation600");
        File testFileEmpty = new File(getClass().getResource("foo").toURI());
        new ReversedLinesFileReader(testFileEmpty , 4096 , "UTF-16");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = UnsupportedEncodingException.class)
    public void testUnsupportedEncodingUTF16_literalMutation601() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedEncodingUTF16_literalMutation601");
        File testFileEmpty = new File(getClass().getResource("/test-file-empty.bin").toURI());
        new ReversedLinesFileReader(testFileEmpty , 4095 , "UTF-16");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = UnsupportedEncodingException.class)
    public void testUnsupportedEncodingUTF16_literalMutation602() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedEncodingUTF16_literalMutation602");
        File testFileEmpty = new File(getClass().getResource("/test-file-empty.bin").toURI());
        new ReversedLinesFileReader(testFileEmpty , 4096 , "foo");
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
    public void testUnsupportedEncodingBig5_literalMutation597() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedEncodingBig5_literalMutation597");
        File testFileEncodingBig5 = new File(getClass().getResource("foo").toURI());
        new ReversedLinesFileReader(testFileEncodingBig5 , 4096 , "Big5");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = UnsupportedEncodingException.class)
    public void testUnsupportedEncodingBig5_literalMutation598() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedEncodingBig5_literalMutation598");
        File testFileEncodingBig5 = new File(getClass().getResource("/test-file-empty.bin").toURI());
        new ReversedLinesFileReader(testFileEncodingBig5 , 4097 , "Big5");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = UnsupportedEncodingException.class)
    public void testUnsupportedEncodingBig5_literalMutation599() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedEncodingBig5_literalMutation599");
        File testFileEncodingBig5 = new File(getClass().getResource("/test-file-empty.bin").toURI());
        new ReversedLinesFileReader(testFileEncodingBig5 , 4096 , "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


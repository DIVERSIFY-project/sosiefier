package org.apache.commons.io.input;

import org.junit.After;
import java.util.Collection;
import java.io.File;
import java.io.IOException;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import org.junit.Test;
import java.net.URISyntaxException;
import java.io.UnsupportedEncodingException;

@RunWith(value = Parameterized.class)
public class ReversedLinesFileReaderTestParamBlockSize {
    private static final String UTF_8 = "UTF-8";

    private static final String ISO_8859_1 = "ISO-8859-1";

    @SuppressWarnings(value = "boxing")
    @Parameterized.Parameters
    public static Collection<java.lang.Integer[]> blockSizes() {
        return java.util.Arrays.asList(new Integer[][]{ new Integer[]{ 1 } , new Integer[]{ 3 } , new Integer[]{ 8 } , new Integer[]{ 256 } , new Integer[]{ 4096 } });
    }

    private ReversedLinesFileReader reversedLinesFileReader;

    private int testParamBlockSize;

    public ReversedLinesFileReaderTestParamBlockSize(Integer testWithBlockSize) {
        testParamBlockSize = testWithBlockSize.intValue();
    }

    private static final String TEST_LINE = "A Test Line. Special chars: ÄäÜüÖöß ÃáéíïçñÂ ©µ¥£±²®";

    private static final String TEST_LINE_SHIFT_JIS1 = "Hiragana letters: ぁあぃいぅ";

    private static final String TEST_LINE_SHIFT_JIS2 = "Kanji letters: 明輸子京";

    @After
    public void closeReader() {
        try {
            reversedLinesFileReader.close();
        } catch (Exception e) {
        }
    }

    @Test(timeout = 1000)
    public void testIsoFileDefaults_add232() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsoFileDefaults_add232");
        File testFileIso = new File(getClass().getResource("/test-file-iso8859-1.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileIso , testParamBlockSize , ISO_8859_1);
        assertFileWithShrinkingTestLines(reversedLinesFileReader);
        assertFileWithShrinkingTestLines(reversedLinesFileReader);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsoFileDefaults() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsoFileDefaults");
        File testFileIso = new File(getClass().getResource("foo").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileIso , testParamBlockSize , ISO_8859_1);
        assertFileWithShrinkingTestLines(reversedLinesFileReader);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIsoFileDefaults_remove103() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsoFileDefaults_remove103");
        File testFileIso = new File(getClass().getResource("/test-file-iso8859-1.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileIso , testParamBlockSize , ISO_8859_1);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF8FileWindowsBreaks_add241() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8FileWindowsBreaks_add241");
        File testFileIso = new File(getClass().getResource("/test-file-utf8-win-linebr.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileIso , testParamBlockSize , UTF_8);
        assertFileWithShrinkingTestLines(reversedLinesFileReader);
        assertFileWithShrinkingTestLines(reversedLinesFileReader);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUTF8FileWindowsBreaks() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8FileWindowsBreaks");
        File testFileIso = new File(getClass().getResource("foo").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileIso , testParamBlockSize , UTF_8);
        assertFileWithShrinkingTestLines(reversedLinesFileReader);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF8FileWindowsBreaks_remove112() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8FileWindowsBreaks_remove112");
        File testFileIso = new File(getClass().getResource("/test-file-utf8-win-linebr.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileIso , testParamBlockSize , UTF_8);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF8FileCRBreaks_add240() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8FileCRBreaks_add240");
        File testFileIso = new File(getClass().getResource("/test-file-utf8-cr-only.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileIso , testParamBlockSize , UTF_8);
        assertFileWithShrinkingTestLines(reversedLinesFileReader);
        assertFileWithShrinkingTestLines(reversedLinesFileReader);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUTF8FileCRBreaks() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8FileCRBreaks");
        File testFileIso = new File(getClass().getResource("foo").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileIso , testParamBlockSize , UTF_8);
        assertFileWithShrinkingTestLines(reversedLinesFileReader);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF8FileCRBreaks_remove111() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8FileCRBreaks_remove111");
        File testFileIso = new File(getClass().getResource("/test-file-utf8-cr-only.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileIso , testParamBlockSize , UTF_8);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF8File_add239() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8File_add239");
        File testFileIso = new File(getClass().getResource("/test-file-utf8.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileIso , testParamBlockSize , UTF_8);
        assertFileWithShrinkingTestLines(reversedLinesFileReader);
        assertFileWithShrinkingTestLines(reversedLinesFileReader);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUTF8File() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8File");
        File testFileIso = new File(getClass().getResource("foo").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileIso , testParamBlockSize , UTF_8);
        assertFileWithShrinkingTestLines(reversedLinesFileReader);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF8File_remove110() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8File_remove110");
        File testFileIso = new File(getClass().getResource("/test-file-utf8.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileIso , testParamBlockSize , UTF_8);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEmptyFile() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyFile");
        File testFileEmpty = new File(getClass().getResource("foo").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileEmpty , testParamBlockSize , UTF_8);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),835,reversedLinesFileReader,834,reversedLinesFileReader.readLine());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF16BEFile_add237() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16BEFile_add237");
        File testFileUTF16BE = new File(getClass().getResource("/test-file-utf16be.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileUTF16BE , testParamBlockSize , "UTF-16BE");
        assertFileWithShrinkingTestLines(reversedLinesFileReader);
        assertFileWithShrinkingTestLines(reversedLinesFileReader);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUTF16BEFile() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16BEFile");
        File testFileUTF16BE = new File(getClass().getResource("foo").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileUTF16BE , testParamBlockSize , "UTF-16BE");
        assertFileWithShrinkingTestLines(reversedLinesFileReader);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUTF16BEFile_literalMutation578() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16BEFile_literalMutation578");
        File testFileUTF16BE = new File(getClass().getResource("/test-file-utf16be.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileUTF16BE , testParamBlockSize , "foo");
        assertFileWithShrinkingTestLines(reversedLinesFileReader);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF16BEFile_remove108() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16BEFile_remove108");
        File testFileUTF16BE = new File(getClass().getResource("/test-file-utf16be.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileUTF16BE , testParamBlockSize , "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF16LEFile_add238() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16LEFile_add238");
        File testFileUTF16LE = new File(getClass().getResource("/test-file-utf16le.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileUTF16LE , testParamBlockSize , "UTF-16LE");
        assertFileWithShrinkingTestLines(reversedLinesFileReader);
        assertFileWithShrinkingTestLines(reversedLinesFileReader);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUTF16LEFile() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16LEFile");
        File testFileUTF16LE = new File(getClass().getResource("foo").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileUTF16LE , testParamBlockSize , "UTF-16LE");
        assertFileWithShrinkingTestLines(reversedLinesFileReader);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUTF16LEFile_literalMutation580() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16LEFile_literalMutation580");
        File testFileUTF16LE = new File(getClass().getResource("/test-file-utf16le.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileUTF16LE , testParamBlockSize , "foo");
        assertFileWithShrinkingTestLines(reversedLinesFileReader);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF16LEFile_remove109() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16LEFile_remove109");
        File testFileUTF16LE = new File(getClass().getResource("/test-file-utf16le.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileUTF16LE , testParamBlockSize , "UTF-16LE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testShiftJISFile_add235() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShiftJISFile_add235");
        File testFileShiftJIS = new File(getClass().getResource("/test-file-shiftjis.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileShiftJIS , testParamBlockSize , "Shift_JIS");
        ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(TEST_LINE_SHIFT_JIS2, reversedLinesFileReader.readLine());
        ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(TEST_LINE_SHIFT_JIS2, reversedLinesFileReader.readLine());
        ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(TEST_LINE_SHIFT_JIS1, reversedLinesFileReader.readLine());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testShiftJISFile_add236() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShiftJISFile_add236");
        File testFileShiftJIS = new File(getClass().getResource("/test-file-shiftjis.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileShiftJIS , testParamBlockSize , "Shift_JIS");
        ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(TEST_LINE_SHIFT_JIS2, reversedLinesFileReader.readLine());
        ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(TEST_LINE_SHIFT_JIS1, reversedLinesFileReader.readLine());
        ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(TEST_LINE_SHIFT_JIS1, reversedLinesFileReader.readLine());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testShiftJISFile() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShiftJISFile");
        File testFileShiftJIS = new File(getClass().getResource("foo").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileShiftJIS , testParamBlockSize , "Shift_JIS");
        ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(TEST_LINE_SHIFT_JIS2, reversedLinesFileReader.readLine());
        ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(TEST_LINE_SHIFT_JIS1, reversedLinesFileReader.readLine());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testShiftJISFile_literalMutation576() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShiftJISFile_literalMutation576");
        File testFileShiftJIS = new File(getClass().getResource("/test-file-shiftjis.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileShiftJIS , testParamBlockSize , "foo");
        ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(TEST_LINE_SHIFT_JIS2, reversedLinesFileReader.readLine());
        ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(TEST_LINE_SHIFT_JIS1, reversedLinesFileReader.readLine());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testShiftJISFile_remove106() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShiftJISFile_remove106");
        File testFileShiftJIS = new File(getClass().getResource("/test-file-shiftjis.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileShiftJIS , testParamBlockSize , "Shift_JIS");
        ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(TEST_LINE_SHIFT_JIS1, reversedLinesFileReader.readLine());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testShiftJISFile_remove107() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShiftJISFile_remove107");
        File testFileShiftJIS = new File(getClass().getResource("/test-file-shiftjis.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileShiftJIS , testParamBlockSize , "Shift_JIS");
        ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(TEST_LINE_SHIFT_JIS1, reversedLinesFileReader.readLine());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFileSizeIsExactMultipleOfBlockSize_add230() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileSizeIsExactMultipleOfBlockSize_add230");
        int blockSize = 10;
        File testFile20Bytes = new File(getClass().getResource("/test-file-20byteslength.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFile20Bytes , blockSize , ISO_8859_1);
        String testLine = "123456789";
        ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFileSizeIsExactMultipleOfBlockSize_add231() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileSizeIsExactMultipleOfBlockSize_add231");
        int blockSize = 10;
        File testFile20Bytes = new File(getClass().getResource("/test-file-20byteslength.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFile20Bytes , blockSize , ISO_8859_1);
        String testLine = "123456789";
        ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testFileSizeIsExactMultipleOfBlockSize() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileSizeIsExactMultipleOfBlockSize");
        int blockSize = 9;
        File testFile20Bytes = new File(getClass().getResource("/test-file-20byteslength.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFile20Bytes , blockSize , ISO_8859_1);
        String testLine = "123456789";
        ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testFileSizeIsExactMultipleOfBlockSize_literalMutation565() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileSizeIsExactMultipleOfBlockSize_literalMutation565");
        int blockSize = 10;
        File testFile20Bytes = new File(getClass().getResource("foo").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFile20Bytes , blockSize , ISO_8859_1);
        String testLine = "123456789";
        ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testFileSizeIsExactMultipleOfBlockSize_literalMutation566() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileSizeIsExactMultipleOfBlockSize_literalMutation566");
        int blockSize = 10;
        File testFile20Bytes = new File(getClass().getResource("/test-file-20byteslength.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFile20Bytes , blockSize , ISO_8859_1);
        String testLine = "foo";
        ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFileSizeIsExactMultipleOfBlockSize_remove101() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileSizeIsExactMultipleOfBlockSize_remove101");
        int blockSize = 10;
        File testFile20Bytes = new File(getClass().getResource("/test-file-20byteslength.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFile20Bytes , blockSize , ISO_8859_1);
        String testLine = "123456789";
        ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFileSizeIsExactMultipleOfBlockSize_remove102() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileSizeIsExactMultipleOfBlockSize_remove102");
        int blockSize = 10;
        File testFile20Bytes = new File(getClass().getResource("/test-file-20byteslength.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFile20Bytes , blockSize , ISO_8859_1);
        String testLine = "123456789";
        ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(testLine, reversedLinesFileReader.readLine());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF8FileWindowsBreaksSmallBlockSize2VerifyBlockSpanningNewLines_add242() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8FileWindowsBreaksSmallBlockSize2VerifyBlockSpanningNewLines_add242");
        File testFileUtf8 = new File(getClass().getResource("/test-file-utf8-win-linebr.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileUtf8 , testParamBlockSize , UTF_8);
        assertFileWithShrinkingTestLines(reversedLinesFileReader);
        assertFileWithShrinkingTestLines(reversedLinesFileReader);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUTF8FileWindowsBreaksSmallBlockSize2VerifyBlockSpanningNewLines() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8FileWindowsBreaksSmallBlockSize2VerifyBlockSpanningNewLines");
        File testFileUtf8 = new File(getClass().getResource("foo").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileUtf8 , testParamBlockSize , UTF_8);
        assertFileWithShrinkingTestLines(reversedLinesFileReader);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF8FileWindowsBreaksSmallBlockSize2VerifyBlockSpanningNewLines_remove113() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8FileWindowsBreaksSmallBlockSize2VerifyBlockSpanningNewLines_remove113");
        File testFileUtf8 = new File(getClass().getResource("/test-file-utf8-win-linebr.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileUtf8 , testParamBlockSize , UTF_8);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIsoFileManyWindowsBreaksSmallBlockSize2VerifyBlockSpanningNewLines_add233() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsoFileManyWindowsBreaksSmallBlockSize2VerifyBlockSpanningNewLines_add233");
        File testFileIso = new File(getClass().getResource("/test-file-iso8859-1-shortlines-win-linebr.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileIso , testParamBlockSize , ISO_8859_1);
        for (int i = 3 ; i > 0 ; i--) {
            for (int j = 1 ; j <= 3 ; j++) {
                ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks("", reversedLinesFileReader.readLine());
                ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks("", reversedLinesFileReader.readLine());
            }
            ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(("" + i), reversedLinesFileReader.readLine());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIsoFileManyWindowsBreaksSmallBlockSize2VerifyBlockSpanningNewLines_add234() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsoFileManyWindowsBreaksSmallBlockSize2VerifyBlockSpanningNewLines_add234");
        File testFileIso = new File(getClass().getResource("/test-file-iso8859-1-shortlines-win-linebr.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileIso , testParamBlockSize , ISO_8859_1);
        for (int i = 3 ; i > 0 ; i--) {
            for (int j = 1 ; j <= 3 ; j++) {
                ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks("", reversedLinesFileReader.readLine());
            }
            ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(("" + i), reversedLinesFileReader.readLine());
            ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(("" + i), reversedLinesFileReader.readLine());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsoFileManyWindowsBreaksSmallBlockSize2VerifyBlockSpanningNewLines() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsoFileManyWindowsBreaksSmallBlockSize2VerifyBlockSpanningNewLines");
        File testFileIso = new File(getClass().getResource("foo").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileIso , testParamBlockSize , ISO_8859_1);
        for (int i = 3 ; i > 0 ; i--) {
            for (int j = 1 ; j <= 3 ; j++) {
                ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks("", reversedLinesFileReader.readLine());
            }
            ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(("" + i), reversedLinesFileReader.readLine());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsoFileManyWindowsBreaksSmallBlockSize2VerifyBlockSpanningNewLines_literalMutation569() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsoFileManyWindowsBreaksSmallBlockSize2VerifyBlockSpanningNewLines_literalMutation569");
        File testFileIso = new File(getClass().getResource("/test-file-iso8859-1-shortlines-win-linebr.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileIso , testParamBlockSize , ISO_8859_1);
        for (int i = 4 ; i > 0 ; i--) {
            for (int j = 1 ; j <= 3 ; j++) {
                ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks("", reversedLinesFileReader.readLine());
            }
            ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(("" + i), reversedLinesFileReader.readLine());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsoFileManyWindowsBreaksSmallBlockSize2VerifyBlockSpanningNewLines_literalMutation570() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsoFileManyWindowsBreaksSmallBlockSize2VerifyBlockSpanningNewLines_literalMutation570");
        File testFileIso = new File(getClass().getResource("/test-file-iso8859-1-shortlines-win-linebr.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileIso , testParamBlockSize , ISO_8859_1);
        for (int i = 3 ; i > 1 ; i--) {
            for (int j = 1 ; j <= 3 ; j++) {
                ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks("", reversedLinesFileReader.readLine());
            }
            ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(("" + i), reversedLinesFileReader.readLine());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsoFileManyWindowsBreaksSmallBlockSize2VerifyBlockSpanningNewLines_literalMutation571() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsoFileManyWindowsBreaksSmallBlockSize2VerifyBlockSpanningNewLines_literalMutation571");
        File testFileIso = new File(getClass().getResource("/test-file-iso8859-1-shortlines-win-linebr.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileIso , testParamBlockSize , ISO_8859_1);
        for (int i = 3 ; i > 0 ; i--) {
            for (int j = 2 ; j <= 3 ; j++) {
                ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks("", reversedLinesFileReader.readLine());
            }
            ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(("" + i), reversedLinesFileReader.readLine());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsoFileManyWindowsBreaksSmallBlockSize2VerifyBlockSpanningNewLines_literalMutation572() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsoFileManyWindowsBreaksSmallBlockSize2VerifyBlockSpanningNewLines_literalMutation572");
        File testFileIso = new File(getClass().getResource("/test-file-iso8859-1-shortlines-win-linebr.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileIso , testParamBlockSize , ISO_8859_1);
        for (int i = 3 ; i > 0 ; i--) {
            for (int j = 1 ; j <= 2 ; j++) {
                ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks("", reversedLinesFileReader.readLine());
            }
            ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(("" + i), reversedLinesFileReader.readLine());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsoFileManyWindowsBreaksSmallBlockSize2VerifyBlockSpanningNewLines_literalMutation573() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsoFileManyWindowsBreaksSmallBlockSize2VerifyBlockSpanningNewLines_literalMutation573");
        File testFileIso = new File(getClass().getResource("/test-file-iso8859-1-shortlines-win-linebr.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileIso , testParamBlockSize , ISO_8859_1);
        for (int i = 3 ; i > 0 ; i--) {
            for (int j = 1 ; j <= 3 ; j++) {
                ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks("foo", reversedLinesFileReader.readLine());
            }
            ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(("" + i), reversedLinesFileReader.readLine());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsoFileManyWindowsBreaksSmallBlockSize2VerifyBlockSpanningNewLines_literalMutation574() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsoFileManyWindowsBreaksSmallBlockSize2VerifyBlockSpanningNewLines_literalMutation574");
        File testFileIso = new File(getClass().getResource("/test-file-iso8859-1-shortlines-win-linebr.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileIso , testParamBlockSize , ISO_8859_1);
        for (int i = 3 ; i > 0 ; i--) {
            for (int j = 1 ; j <= 3 ; j++) {
                ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks("", reversedLinesFileReader.readLine());
            }
            ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(("foo" + i), reversedLinesFileReader.readLine());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIsoFileManyWindowsBreaksSmallBlockSize2VerifyBlockSpanningNewLines_remove104() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsoFileManyWindowsBreaksSmallBlockSize2VerifyBlockSpanningNewLines_remove104");
        File testFileIso = new File(getClass().getResource("/test-file-iso8859-1-shortlines-win-linebr.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileIso , testParamBlockSize , ISO_8859_1);
        for (int i = 3 ; i > 0 ; i--) {
            for (int j = 1 ; j <= 3 ; j++) {
            }
            ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(("" + i), reversedLinesFileReader.readLine());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIsoFileManyWindowsBreaksSmallBlockSize2VerifyBlockSpanningNewLines_remove105() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsoFileManyWindowsBreaksSmallBlockSize2VerifyBlockSpanningNewLines_remove105");
        File testFileIso = new File(getClass().getResource("/test-file-iso8859-1-shortlines-win-linebr.bin").toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileIso , testParamBlockSize , ISO_8859_1);
        for (int i = 3 ; i > 0 ; i--) {
            for (int j = 1 ; j <= 3 ; j++) {
                ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks("", reversedLinesFileReader.readLine());
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = UnsupportedEncodingException.class)
    public void testUnsupportedEncodingUTF16() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedEncodingUTF16");
        File testFileEmpty = new File(getClass().getResource("foo").toURI());
        new ReversedLinesFileReader(testFileEmpty , testParamBlockSize , "UTF-16");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = UnsupportedEncodingException.class)
    public void testUnsupportedEncodingUTF16_literalMutation588() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedEncodingUTF16_literalMutation588");
        File testFileEmpty = new File(getClass().getResource("/test-file-empty.bin").toURI());
        new ReversedLinesFileReader(testFileEmpty , testParamBlockSize , "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = UnsupportedEncodingException.class)
    public void testUnsupportedEncodingBig5() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedEncodingBig5");
        File testFileEncodingBig5 = new File(getClass().getResource("foo").toURI());
        new ReversedLinesFileReader(testFileEncodingBig5 , testParamBlockSize , "Big5");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = UnsupportedEncodingException.class)
    public void testUnsupportedEncodingBig5_literalMutation586() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedEncodingBig5_literalMutation586");
        File testFileEncodingBig5 = new File(getClass().getResource("/test-file-empty.bin").toURI());
        new ReversedLinesFileReader(testFileEncodingBig5 , testParamBlockSize , "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void assertFileWithShrinkingTestLines(ReversedLinesFileReader reversedLinesFileReader) throws IOException {
        String line = null;
        int lineCount = 0;
        while ((line = reversedLinesFileReader.readLine()) != null) {
            lineCount++;
            ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks((("Line " + lineCount) + " is not matching"), TEST_LINE.substring(0, lineCount), line);
        }
    }

    static void assertEqualsAndNoLineBreaks(String msg, String expected, String actual) {
        if (actual != null) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),825,("Line contains \\n: line=" + actual));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),827,actual,826,actual.contains("\n"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),828,("Line contains \\r: line=" + actual));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),830,actual,829,actual.contains("\r"));
        } 
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),831,msg);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),832,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),833,actual);
    }

    static void assertEqualsAndNoLineBreaks(String expected, String actual) {
        ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks(null, expected, actual);
    }
}


package org.apache.commons.io.input;

import org.junit.After;
import java.io.BufferedReader;
import java.util.Collection;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import java.util.Stack;
import org.junit.Test;
import java.net.URISyntaxException;

/** 
 * Test checks symmetric behaviour with  BufferedReader
 * 
 */
@RunWith(value = Parameterized.class)
public class ReversedLinesFileReaderTestParamFile {
    @Parameterized.Parameters
    public static Collection<java.lang.Object[]> blockSizes() {
        return java.util.Arrays.asList(new Object[][]{ new Object[]{ "test-file-20byteslength.bin" , "ISO_8859_1" , null } , new Object[]{ "test-file-iso8859-1-shortlines-win-linebr.bin" , "ISO_8859_1" , null } , new Object[]{ "test-file-iso8859-1.bin" , "ISO_8859_1" , null } , new Object[]{ "test-file-shiftjis.bin" , "Shift_JIS" , null } , new Object[]{ "test-file-utf16be.bin" , "UTF-16BE" , null } , new Object[]{ "test-file-utf16le.bin" , "UTF-16LE" , null } , new Object[]{ "test-file-utf8-cr-only.bin" , "UTF-8" , null } , new Object[]{ "test-file-utf8-win-linebr.bin" , "UTF-8" , null } , new Object[]{ "test-file-utf8-win-linebr.bin" , "UTF-8" , Integer.valueOf(1) } , new Object[]{ "test-file-utf8-win-linebr.bin" , "UTF-8" , Integer.valueOf(2) } , new Object[]{ "test-file-utf8-win-linebr.bin" , "UTF-8" , Integer.valueOf(3) } , new Object[]{ "test-file-utf8-win-linebr.bin" , "UTF-8" , Integer.valueOf(4) } , new Object[]{ "test-file-utf8.bin" , "UTF-8" , null } });
    }

    private ReversedLinesFileReader reversedLinesFileReader;

    private BufferedReader bufferedReader;

    private final String fileName;

    private final String encoding;

    private final int buffSize;

    public ReversedLinesFileReaderTestParamFile(String fileName ,String encoding ,Integer buffsize) {
        this.fileName = fileName;
        this.encoding = encoding;
        this.buffSize = buffsize == null ? 4096 : buffsize.intValue();
    }

    @Test(timeout = 1000)
    public void testDataIntegrityWithBufferedReader_add243() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDataIntegrityWithBufferedReader_add243");
        File testFileIso = new File(getClass().getResource(("/" + (fileName))).toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileIso , buffSize , encoding);
        Stack<java.lang.String> lineStack = new Stack<java.lang.String>();
        bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(testFileIso) , encoding));
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            lineStack.push(line);
            lineStack.push(line);
        }
        while ((line = reversedLinesFileReader.readLine()) != null) {
            String lineFromBufferedReader = lineStack.pop();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),836,lineFromBufferedReader);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),837,line);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDataIntegrityWithBufferedReader() throws IOException, URISyntaxException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDataIntegrityWithBufferedReader");
        File testFileIso = new File(getClass().getResource(("foo" + (fileName))).toURI());
        reversedLinesFileReader = new ReversedLinesFileReader(testFileIso , buffSize , encoding);
        Stack<java.lang.String> lineStack = new Stack<java.lang.String>();
        bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(testFileIso) , encoding));
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            lineStack.push(line);
        }
        while ((line = reversedLinesFileReader.readLine()) != null) {
            String lineFromBufferedReader = lineStack.pop();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),836,lineFromBufferedReader);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),837,line);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @After
    public void closeReader() {
        try {
            bufferedReader.close();
        } catch (Exception e) {
        }
        try {
            reversedLinesFileReader.close();
        } catch (Exception e) {
        }
    }
}


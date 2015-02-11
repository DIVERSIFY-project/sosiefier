package org.apache.commons.io.testtools;

import junit.framework.AssertionFailedError;
import java.io.BufferedOutputStream;
import org.apache.commons.io.output.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import junit.framework.TestCase;
import java.io.Writer;

/** 
 * Base class for testcases doing tests with files.
 */
public abstract class FileBasedTestCase extends TestCase {
    private static volatile File testDir;

    public FileBasedTestCase(String name) {
        super(name);
    }

    public static File getTestDirectory() {
        if ((FileBasedTestCase.testDir) == null) {
            FileBasedTestCase.testDir = new File("test/io/").getAbsoluteFile();
        } 
        FileBasedTestCase.testDir.mkdirs();
        return FileBasedTestCase.testDir;
    }

    protected void createFile(File file, long size) throws IOException {
        if (!(file.getParentFile().exists())) {
            throw new IOException((("Cannot create file " + file) + " as the parent directory does not exist"));
        } 
        BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(file));
        try {
            generateTestData(output, size);
        } finally {
            org.apache.commons.io.IOUtils.closeQuietly(output);
        }
    }

    protected byte[] generateTestData(long size) {
        try {
            ByteArrayOutputStream baout = new ByteArrayOutputStream();
            generateTestData(baout, size);
            return baout.toByteArray();
        } catch (IOException ioe) {
            throw new RuntimeException(("This should never happen: " + (ioe.getMessage())));
        }
    }

    protected void generateTestData(OutputStream out, long size) throws IOException {
        for (int i = 0 ; i < size ; i++) {
            out.write(((byte)((i % 127) + 1)));
        }
    }

    protected void createLineBasedFile(File file, String[] data) throws IOException {
        if (((file.getParentFile()) != null) && (!(file.getParentFile().exists()))) {
            throw new IOException((("Cannot create file " + file) + " as the parent directory does not exist"));
        } 
        PrintWriter output = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file) , "UTF-8"));
        try {
            for (String element : data) {
                output.println(element);
            }
        } finally {
            org.apache.commons.io.IOUtils.closeQuietly(output);
        }
    }

    protected File newFile(String filename) throws IOException {
        File destination = new File(FileBasedTestCase.getTestDirectory() , filename);
        if (destination.exists()) {
            org.apache.commons.io.FileUtils.forceDelete(destination);
        } 
        return destination;
    }

    protected void checkFile(File file, File referenceFile) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1715,file,1714,file.exists());
        assertEqualContent(referenceFile, file);
    }

    /** 
     * Assert that the content of two files is the same.
     */
private void assertEqualContent(File f0, File f1) throws IOException {
        InputStream is0 = new FileInputStream(f0);
        try {
            InputStream is1 = new FileInputStream(f1);
            try {
                byte[] buf0 = new byte[1024];
                byte[] buf1 = new byte[1024];
                int n0 = 0;
                int n1 = 0;
                while ((-1) != n0) {
                    n0 = is0.read(buf0);
                    n1 = is1.read(buf1);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1709,(((((((("The files " + f0) + " and ") + f1) + " have differing number of bytes available (") + n0) + " vs ") + n1) + ")"));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1710,(n0 == n1));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1711,(((("The files " + f0) + " and ") + f1) + " have different content"));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1713,null,1712,java.util.Arrays.equals(buf0, buf1));
                }
            } finally {
                is1.close();
            }
        } finally {
            is0.close();
        }
    }

    /** 
     * Assert that the content of a file is equal to that in a byte[].
     */
protected void assertEqualContent(byte[] b0, File file) throws IOException {
        InputStream is = new FileInputStream(file);
        int count = 0;
        int numRead = 0;
        byte[] b1 = new byte[b0.length];
        try {
            while ((count < (b0.length)) && (numRead >= 0)) {
                numRead = is.read(b1, count, b0.length);
                count += numRead;
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1699,b0.length);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1700,count);
            for (int i = 0 ; i < count ; i++) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1701,(("byte " + i) + " differs"));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1702,b0[i]);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1703,b1[i]);
            }
        } finally {
            is.close();
        }
    }

    /** 
     * Assert that the content of a file is equal to that in a char[].
     */
protected void assertEqualContent(char[] c0, File file) throws IOException {
        Reader ir = new FileReader(file);
        int count = 0;
        int numRead = 0;
        char[] c1 = new char[c0.length];
        try {
            while ((count < (c0.length)) && (numRead >= 0)) {
                numRead = ir.read(c1, count, c0.length);
                count += numRead;
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1704,c0.length);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1705,count);
            for (int i = 0 ; i < count ; i++) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1706,(("char " + i) + " differs"));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1707,c0[i]);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1708,c1[i]);
            }
        } finally {
            ir.close();
        }
    }

    protected void checkWrite(OutputStream output) throws Exception {
        try {
            new PrintStream(output).write(0);
        } catch (Throwable t) {
            throw new AssertionFailedError((("The copy() method closed the stream " + "when it shouldn\'t have. ") + (t.getMessage())));
        }
    }

    protected void checkWrite(Writer output) throws Exception {
        try {
            new PrintWriter(output).write('a');
        } catch (Throwable t) {
            throw new AssertionFailedError((("The copy() method closed the stream " + "when it shouldn\'t have. ") + (t.getMessage())));
        }
    }

    protected void deleteFile(File file) throws Exception {
        if (file.exists()) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1716,("Couldn\'t delete file: " + file));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1718,file,1717,file.delete());
        } 
    }
}


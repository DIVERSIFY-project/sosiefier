package org.apache.commons.io.output;

import junit.framework.AssertionFailedError;
import java.io.File;
import org.apache.commons.io.testtools.FileBasedTestCase;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import org.junit.Test;
import java.io.Writer;

/** 
 * Tests that the encoding is actually set and used.
 * 
 * @version $Id$
 */
public class FileWriterWithEncodingTest extends FileBasedTestCase {
    private String defaultEncoding;

    private File file1;

    private File file2;

    private String textContent;

    public FileWriterWithEncodingTest(String name) {
        super(name);
    }

    @Override
    public void setUp() {
        File encodingFinder = new File(FileBasedTestCase.getTestDirectory() , "finder.txt");
        OutputStreamWriter out = null;
        try {
            out = new OutputStreamWriter(new FileOutputStream(encodingFinder));
            defaultEncoding = out.getEncoding();
        } catch (IOException ex) {
            throw new RuntimeException(ex.getMessage());
        } finally {
            org.apache.commons.io.IOUtils.closeQuietly(out);
        }
        file1 = new File(FileBasedTestCase.getTestDirectory() , "testfile1.txt");
        file2 = new File(FileBasedTestCase.getTestDirectory() , "testfile2.txt");
        char[] arr = new char[1024];
        for (int i = 0 ; i < (arr.length) ; i++) {
            arr[i] = ((char)(i));
        }
        textContent = new String(arr);
    }

    @Override
    public void tearDown() throws Exception {
        org.apache.commons.io.FileUtils.deleteDirectory(FileBasedTestCase.getTestDirectory());
        defaultEncoding = null;
        textContent = null;
    }

    @Test(timeout = 1000)
    public void testSameEncoding() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSameEncoding");
        FileWriter fw1 = null;
        FileWriterWithEncoding fw2 = null;
        try {
            fw1 = new FileWriter(file1);
            fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1509,file1,1508,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1511,file2,1510,file2.exists());
            fw1.write(textContent);
            fw1.write(textContent);
            fw2.write(textContent);
            fw1.flush();
            fw2.flush();
            checkFile(file1, file2);
        } finally {
            org.apache.commons.io.IOUtils.closeQuietly(fw1);
            org.apache.commons.io.IOUtils.closeQuietly(fw2);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1513,file1,1512,file1.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1515,file2,1514,file2.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSameEncoding_add1031() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSameEncoding_add1031");
        FileWriter fw1 = null;
        FileWriterWithEncoding fw2 = null;
        try {
            fw1 = new FileWriter(file1);
            fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1509,file1,1508,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1511,file2,1510,file2.exists());
            fw1.write(textContent);
            fw2.write(textContent);
            fw2.write(textContent);
            fw1.flush();
            fw2.flush();
            checkFile(file1, file2);
        } finally {
            org.apache.commons.io.IOUtils.closeQuietly(fw1);
            org.apache.commons.io.IOUtils.closeQuietly(fw2);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1513,file1,1512,file1.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1515,file2,1514,file2.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSameEncoding_add1032() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSameEncoding_add1032");
        FileWriter fw1 = null;
        FileWriterWithEncoding fw2 = null;
        try {
            fw1 = new FileWriter(file1);
            fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1509,file1,1508,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1511,file2,1510,file2.exists());
            fw1.write(textContent);
            fw2.write(textContent);
            fw1.flush();
            fw1.flush();
            fw2.flush();
            checkFile(file1, file2);
        } finally {
            org.apache.commons.io.IOUtils.closeQuietly(fw1);
            org.apache.commons.io.IOUtils.closeQuietly(fw2);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1513,file1,1512,file1.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1515,file2,1514,file2.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSameEncoding_add1033() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSameEncoding_add1033");
        FileWriter fw1 = null;
        FileWriterWithEncoding fw2 = null;
        try {
            fw1 = new FileWriter(file1);
            fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1509,file1,1508,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1511,file2,1510,file2.exists());
            fw1.write(textContent);
            fw2.write(textContent);
            fw1.flush();
            fw2.flush();
            fw2.flush();
            checkFile(file1, file2);
        } finally {
            org.apache.commons.io.IOUtils.closeQuietly(fw1);
            org.apache.commons.io.IOUtils.closeQuietly(fw2);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1513,file1,1512,file1.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1515,file2,1514,file2.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSameEncoding_add1034() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSameEncoding_add1034");
        FileWriter fw1 = null;
        FileWriterWithEncoding fw2 = null;
        try {
            fw1 = new FileWriter(file1);
            fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1509,file1,1508,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1511,file2,1510,file2.exists());
            fw1.write(textContent);
            fw2.write(textContent);
            fw1.flush();
            fw2.flush();
            checkFile(file1, file2);
            checkFile(file1, file2);
        } finally {
            org.apache.commons.io.IOUtils.closeQuietly(fw1);
            org.apache.commons.io.IOUtils.closeQuietly(fw2);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1513,file1,1512,file1.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1515,file2,1514,file2.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSameEncoding_add1035() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSameEncoding_add1035");
        FileWriter fw1 = null;
        FileWriterWithEncoding fw2 = null;
        try {
            fw1 = new FileWriter(file1);
            fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1509,file1,1508,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1511,file2,1510,file2.exists());
            fw1.write(textContent);
            fw2.write(textContent);
            fw1.flush();
            fw2.flush();
            checkFile(file1, file2);
        } finally {
            org.apache.commons.io.IOUtils.closeQuietly(fw1);
            org.apache.commons.io.IOUtils.closeQuietly(fw1);
            org.apache.commons.io.IOUtils.closeQuietly(fw2);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1513,file1,1512,file1.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1515,file2,1514,file2.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSameEncoding_add1036() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSameEncoding_add1036");
        FileWriter fw1 = null;
        FileWriterWithEncoding fw2 = null;
        try {
            fw1 = new FileWriter(file1);
            fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1509,file1,1508,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1511,file2,1510,file2.exists());
            fw1.write(textContent);
            fw2.write(textContent);
            fw1.flush();
            fw2.flush();
            checkFile(file1, file2);
        } finally {
            org.apache.commons.io.IOUtils.closeQuietly(fw1);
            org.apache.commons.io.IOUtils.closeQuietly(fw2);
            org.apache.commons.io.IOUtils.closeQuietly(fw2);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1513,file1,1512,file1.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1515,file2,1514,file2.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDifferentEncoding_add1016() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDifferentEncoding_add1016");
        if (java.nio.charset.Charset.isSupported("UTF-16BE")) {
            FileWriter fw1 = null;
            FileWriterWithEncoding fw2 = null;
            try {
                fw1 = new FileWriter(file1);
                fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1493,file1,1492,file1.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,file2,1494,file2.exists());
                fw1.write(textContent);
                fw1.write(textContent);
                fw2.write(textContent);
                fw1.flush();
                fw2.flush();
                try {
                    checkFile(file1, file2);
                } catch (AssertionFailedError ex) {
                }
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(fw1);
                org.apache.commons.io.IOUtils.closeQuietly(fw2);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1497,file1,1496,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1499,file2,1498,file2.exists());
        } 
        if (java.nio.charset.Charset.isSupported("UTF-16LE")) {
            FileWriter fw1 = null;
            FileWriterWithEncoding fw2 = null;
            try {
                fw1 = new FileWriter(file1);
                fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1501,file1,1500,file1.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1503,file2,1502,file2.exists());
                fw1.write(textContent);
                fw2.write(textContent);
                fw1.flush();
                fw2.flush();
                try {
                    checkFile(file1, file2);
                } catch (AssertionFailedError ex) {
                }
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(fw1);
                org.apache.commons.io.IOUtils.closeQuietly(fw2);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1505,file1,1504,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,file2,1506,file2.exists());
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDifferentEncoding_add1017() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDifferentEncoding_add1017");
        if (java.nio.charset.Charset.isSupported("UTF-16BE")) {
            FileWriter fw1 = null;
            FileWriterWithEncoding fw2 = null;
            try {
                fw1 = new FileWriter(file1);
                fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1493,file1,1492,file1.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,file2,1494,file2.exists());
                fw1.write(textContent);
                fw2.write(textContent);
                fw2.write(textContent);
                fw1.flush();
                fw2.flush();
                try {
                    checkFile(file1, file2);
                } catch (AssertionFailedError ex) {
                }
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(fw1);
                org.apache.commons.io.IOUtils.closeQuietly(fw2);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1497,file1,1496,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1499,file2,1498,file2.exists());
        } 
        if (java.nio.charset.Charset.isSupported("UTF-16LE")) {
            FileWriter fw1 = null;
            FileWriterWithEncoding fw2 = null;
            try {
                fw1 = new FileWriter(file1);
                fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1501,file1,1500,file1.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1503,file2,1502,file2.exists());
                fw1.write(textContent);
                fw2.write(textContent);
                fw1.flush();
                fw2.flush();
                try {
                    checkFile(file1, file2);
                } catch (AssertionFailedError ex) {
                }
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(fw1);
                org.apache.commons.io.IOUtils.closeQuietly(fw2);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1505,file1,1504,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,file2,1506,file2.exists());
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDifferentEncoding_add1018() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDifferentEncoding_add1018");
        if (java.nio.charset.Charset.isSupported("UTF-16BE")) {
            FileWriter fw1 = null;
            FileWriterWithEncoding fw2 = null;
            try {
                fw1 = new FileWriter(file1);
                fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1493,file1,1492,file1.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,file2,1494,file2.exists());
                fw1.write(textContent);
                fw2.write(textContent);
                fw1.flush();
                fw1.flush();
                fw2.flush();
                try {
                    checkFile(file1, file2);
                } catch (AssertionFailedError ex) {
                }
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(fw1);
                org.apache.commons.io.IOUtils.closeQuietly(fw2);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1497,file1,1496,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1499,file2,1498,file2.exists());
        } 
        if (java.nio.charset.Charset.isSupported("UTF-16LE")) {
            FileWriter fw1 = null;
            FileWriterWithEncoding fw2 = null;
            try {
                fw1 = new FileWriter(file1);
                fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1501,file1,1500,file1.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1503,file2,1502,file2.exists());
                fw1.write(textContent);
                fw2.write(textContent);
                fw1.flush();
                fw2.flush();
                try {
                    checkFile(file1, file2);
                } catch (AssertionFailedError ex) {
                }
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(fw1);
                org.apache.commons.io.IOUtils.closeQuietly(fw2);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1505,file1,1504,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,file2,1506,file2.exists());
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDifferentEncoding_add1019() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDifferentEncoding_add1019");
        if (java.nio.charset.Charset.isSupported("UTF-16BE")) {
            FileWriter fw1 = null;
            FileWriterWithEncoding fw2 = null;
            try {
                fw1 = new FileWriter(file1);
                fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1493,file1,1492,file1.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,file2,1494,file2.exists());
                fw1.write(textContent);
                fw2.write(textContent);
                fw1.flush();
                fw2.flush();
                fw2.flush();
                try {
                    checkFile(file1, file2);
                } catch (AssertionFailedError ex) {
                }
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(fw1);
                org.apache.commons.io.IOUtils.closeQuietly(fw2);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1497,file1,1496,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1499,file2,1498,file2.exists());
        } 
        if (java.nio.charset.Charset.isSupported("UTF-16LE")) {
            FileWriter fw1 = null;
            FileWriterWithEncoding fw2 = null;
            try {
                fw1 = new FileWriter(file1);
                fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1501,file1,1500,file1.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1503,file2,1502,file2.exists());
                fw1.write(textContent);
                fw2.write(textContent);
                fw1.flush();
                fw2.flush();
                try {
                    checkFile(file1, file2);
                } catch (AssertionFailedError ex) {
                }
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(fw1);
                org.apache.commons.io.IOUtils.closeQuietly(fw2);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1505,file1,1504,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,file2,1506,file2.exists());
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDifferentEncoding_add1020() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDifferentEncoding_add1020");
        if (java.nio.charset.Charset.isSupported("UTF-16BE")) {
            FileWriter fw1 = null;
            FileWriterWithEncoding fw2 = null;
            try {
                fw1 = new FileWriter(file1);
                fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1493,file1,1492,file1.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,file2,1494,file2.exists());
                fw1.write(textContent);
                fw2.write(textContent);
                fw1.flush();
                fw2.flush();
                try {
                    checkFile(file1, file2);
                    checkFile(file1, file2);
                } catch (AssertionFailedError ex) {
                }
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(fw1);
                org.apache.commons.io.IOUtils.closeQuietly(fw2);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1497,file1,1496,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1499,file2,1498,file2.exists());
        } 
        if (java.nio.charset.Charset.isSupported("UTF-16LE")) {
            FileWriter fw1 = null;
            FileWriterWithEncoding fw2 = null;
            try {
                fw1 = new FileWriter(file1);
                fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1501,file1,1500,file1.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1503,file2,1502,file2.exists());
                fw1.write(textContent);
                fw2.write(textContent);
                fw1.flush();
                fw2.flush();
                try {
                    checkFile(file1, file2);
                } catch (AssertionFailedError ex) {
                }
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(fw1);
                org.apache.commons.io.IOUtils.closeQuietly(fw2);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1505,file1,1504,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,file2,1506,file2.exists());
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDifferentEncoding_add1021() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDifferentEncoding_add1021");
        if (java.nio.charset.Charset.isSupported("UTF-16BE")) {
            FileWriter fw1 = null;
            FileWriterWithEncoding fw2 = null;
            try {
                fw1 = new FileWriter(file1);
                fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1493,file1,1492,file1.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,file2,1494,file2.exists());
                fw1.write(textContent);
                fw2.write(textContent);
                fw1.flush();
                fw2.flush();
                try {
                    checkFile(file1, file2);
                } catch (AssertionFailedError ex) {
                }
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(fw1);
                org.apache.commons.io.IOUtils.closeQuietly(fw1);
                org.apache.commons.io.IOUtils.closeQuietly(fw2);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1497,file1,1496,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1499,file2,1498,file2.exists());
        } 
        if (java.nio.charset.Charset.isSupported("UTF-16LE")) {
            FileWriter fw1 = null;
            FileWriterWithEncoding fw2 = null;
            try {
                fw1 = new FileWriter(file1);
                fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1501,file1,1500,file1.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1503,file2,1502,file2.exists());
                fw1.write(textContent);
                fw2.write(textContent);
                fw1.flush();
                fw2.flush();
                try {
                    checkFile(file1, file2);
                } catch (AssertionFailedError ex) {
                }
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(fw1);
                org.apache.commons.io.IOUtils.closeQuietly(fw2);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1505,file1,1504,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,file2,1506,file2.exists());
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDifferentEncoding_add1022() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDifferentEncoding_add1022");
        if (java.nio.charset.Charset.isSupported("UTF-16BE")) {
            FileWriter fw1 = null;
            FileWriterWithEncoding fw2 = null;
            try {
                fw1 = new FileWriter(file1);
                fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1493,file1,1492,file1.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,file2,1494,file2.exists());
                fw1.write(textContent);
                fw2.write(textContent);
                fw1.flush();
                fw2.flush();
                try {
                    checkFile(file1, file2);
                } catch (AssertionFailedError ex) {
                }
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(fw1);
                org.apache.commons.io.IOUtils.closeQuietly(fw2);
                org.apache.commons.io.IOUtils.closeQuietly(fw2);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1497,file1,1496,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1499,file2,1498,file2.exists());
        } 
        if (java.nio.charset.Charset.isSupported("UTF-16LE")) {
            FileWriter fw1 = null;
            FileWriterWithEncoding fw2 = null;
            try {
                fw1 = new FileWriter(file1);
                fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1501,file1,1500,file1.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1503,file2,1502,file2.exists());
                fw1.write(textContent);
                fw2.write(textContent);
                fw1.flush();
                fw2.flush();
                try {
                    checkFile(file1, file2);
                } catch (AssertionFailedError ex) {
                }
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(fw1);
                org.apache.commons.io.IOUtils.closeQuietly(fw2);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1505,file1,1504,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,file2,1506,file2.exists());
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDifferentEncoding_add1023() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDifferentEncoding_add1023");
        if (java.nio.charset.Charset.isSupported("UTF-16BE")) {
            FileWriter fw1 = null;
            FileWriterWithEncoding fw2 = null;
            try {
                fw1 = new FileWriter(file1);
                fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1493,file1,1492,file1.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,file2,1494,file2.exists());
                fw1.write(textContent);
                fw2.write(textContent);
                fw1.flush();
                fw2.flush();
                try {
                    checkFile(file1, file2);
                } catch (AssertionFailedError ex) {
                }
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(fw1);
                org.apache.commons.io.IOUtils.closeQuietly(fw2);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1497,file1,1496,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1499,file2,1498,file2.exists());
        } 
        if (java.nio.charset.Charset.isSupported("UTF-16LE")) {
            FileWriter fw1 = null;
            FileWriterWithEncoding fw2 = null;
            try {
                fw1 = new FileWriter(file1);
                fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1501,file1,1500,file1.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1503,file2,1502,file2.exists());
                fw1.write(textContent);
                fw1.write(textContent);
                fw2.write(textContent);
                fw1.flush();
                fw2.flush();
                try {
                    checkFile(file1, file2);
                } catch (AssertionFailedError ex) {
                }
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(fw1);
                org.apache.commons.io.IOUtils.closeQuietly(fw2);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1505,file1,1504,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,file2,1506,file2.exists());
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDifferentEncoding_add1024() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDifferentEncoding_add1024");
        if (java.nio.charset.Charset.isSupported("UTF-16BE")) {
            FileWriter fw1 = null;
            FileWriterWithEncoding fw2 = null;
            try {
                fw1 = new FileWriter(file1);
                fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1493,file1,1492,file1.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,file2,1494,file2.exists());
                fw1.write(textContent);
                fw2.write(textContent);
                fw1.flush();
                fw2.flush();
                try {
                    checkFile(file1, file2);
                } catch (AssertionFailedError ex) {
                }
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(fw1);
                org.apache.commons.io.IOUtils.closeQuietly(fw2);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1497,file1,1496,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1499,file2,1498,file2.exists());
        } 
        if (java.nio.charset.Charset.isSupported("UTF-16LE")) {
            FileWriter fw1 = null;
            FileWriterWithEncoding fw2 = null;
            try {
                fw1 = new FileWriter(file1);
                fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1501,file1,1500,file1.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1503,file2,1502,file2.exists());
                fw1.write(textContent);
                fw2.write(textContent);
                fw2.write(textContent);
                fw1.flush();
                fw2.flush();
                try {
                    checkFile(file1, file2);
                } catch (AssertionFailedError ex) {
                }
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(fw1);
                org.apache.commons.io.IOUtils.closeQuietly(fw2);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1505,file1,1504,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,file2,1506,file2.exists());
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDifferentEncoding_add1025() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDifferentEncoding_add1025");
        if (java.nio.charset.Charset.isSupported("UTF-16BE")) {
            FileWriter fw1 = null;
            FileWriterWithEncoding fw2 = null;
            try {
                fw1 = new FileWriter(file1);
                fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1493,file1,1492,file1.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,file2,1494,file2.exists());
                fw1.write(textContent);
                fw2.write(textContent);
                fw1.flush();
                fw2.flush();
                try {
                    checkFile(file1, file2);
                } catch (AssertionFailedError ex) {
                }
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(fw1);
                org.apache.commons.io.IOUtils.closeQuietly(fw2);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1497,file1,1496,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1499,file2,1498,file2.exists());
        } 
        if (java.nio.charset.Charset.isSupported("UTF-16LE")) {
            FileWriter fw1 = null;
            FileWriterWithEncoding fw2 = null;
            try {
                fw1 = new FileWriter(file1);
                fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1501,file1,1500,file1.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1503,file2,1502,file2.exists());
                fw1.write(textContent);
                fw2.write(textContent);
                fw1.flush();
                fw1.flush();
                fw2.flush();
                try {
                    checkFile(file1, file2);
                } catch (AssertionFailedError ex) {
                }
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(fw1);
                org.apache.commons.io.IOUtils.closeQuietly(fw2);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1505,file1,1504,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,file2,1506,file2.exists());
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDifferentEncoding_add1026() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDifferentEncoding_add1026");
        if (java.nio.charset.Charset.isSupported("UTF-16BE")) {
            FileWriter fw1 = null;
            FileWriterWithEncoding fw2 = null;
            try {
                fw1 = new FileWriter(file1);
                fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1493,file1,1492,file1.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,file2,1494,file2.exists());
                fw1.write(textContent);
                fw2.write(textContent);
                fw1.flush();
                fw2.flush();
                try {
                    checkFile(file1, file2);
                } catch (AssertionFailedError ex) {
                }
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(fw1);
                org.apache.commons.io.IOUtils.closeQuietly(fw2);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1497,file1,1496,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1499,file2,1498,file2.exists());
        } 
        if (java.nio.charset.Charset.isSupported("UTF-16LE")) {
            FileWriter fw1 = null;
            FileWriterWithEncoding fw2 = null;
            try {
                fw1 = new FileWriter(file1);
                fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1501,file1,1500,file1.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1503,file2,1502,file2.exists());
                fw1.write(textContent);
                fw2.write(textContent);
                fw1.flush();
                fw2.flush();
                fw2.flush();
                try {
                    checkFile(file1, file2);
                } catch (AssertionFailedError ex) {
                }
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(fw1);
                org.apache.commons.io.IOUtils.closeQuietly(fw2);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1505,file1,1504,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,file2,1506,file2.exists());
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDifferentEncoding_add1027() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDifferentEncoding_add1027");
        if (java.nio.charset.Charset.isSupported("UTF-16BE")) {
            FileWriter fw1 = null;
            FileWriterWithEncoding fw2 = null;
            try {
                fw1 = new FileWriter(file1);
                fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1493,file1,1492,file1.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,file2,1494,file2.exists());
                fw1.write(textContent);
                fw2.write(textContent);
                fw1.flush();
                fw2.flush();
                try {
                    checkFile(file1, file2);
                } catch (AssertionFailedError ex) {
                }
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(fw1);
                org.apache.commons.io.IOUtils.closeQuietly(fw2);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1497,file1,1496,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1499,file2,1498,file2.exists());
        } 
        if (java.nio.charset.Charset.isSupported("UTF-16LE")) {
            FileWriter fw1 = null;
            FileWriterWithEncoding fw2 = null;
            try {
                fw1 = new FileWriter(file1);
                fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1501,file1,1500,file1.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1503,file2,1502,file2.exists());
                fw1.write(textContent);
                fw2.write(textContent);
                fw1.flush();
                fw2.flush();
                try {
                    checkFile(file1, file2);
                    checkFile(file1, file2);
                } catch (AssertionFailedError ex) {
                }
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(fw1);
                org.apache.commons.io.IOUtils.closeQuietly(fw2);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1505,file1,1504,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,file2,1506,file2.exists());
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDifferentEncoding_add1028() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDifferentEncoding_add1028");
        if (java.nio.charset.Charset.isSupported("UTF-16BE")) {
            FileWriter fw1 = null;
            FileWriterWithEncoding fw2 = null;
            try {
                fw1 = new FileWriter(file1);
                fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1493,file1,1492,file1.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,file2,1494,file2.exists());
                fw1.write(textContent);
                fw2.write(textContent);
                fw1.flush();
                fw2.flush();
                try {
                    checkFile(file1, file2);
                } catch (AssertionFailedError ex) {
                }
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(fw1);
                org.apache.commons.io.IOUtils.closeQuietly(fw2);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1497,file1,1496,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1499,file2,1498,file2.exists());
        } 
        if (java.nio.charset.Charset.isSupported("UTF-16LE")) {
            FileWriter fw1 = null;
            FileWriterWithEncoding fw2 = null;
            try {
                fw1 = new FileWriter(file1);
                fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1501,file1,1500,file1.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1503,file2,1502,file2.exists());
                fw1.write(textContent);
                fw2.write(textContent);
                fw1.flush();
                fw2.flush();
                try {
                    checkFile(file1, file2);
                } catch (AssertionFailedError ex) {
                }
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(fw1);
                org.apache.commons.io.IOUtils.closeQuietly(fw1);
                org.apache.commons.io.IOUtils.closeQuietly(fw2);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1505,file1,1504,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,file2,1506,file2.exists());
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDifferentEncoding_add1029() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDifferentEncoding_add1029");
        if (java.nio.charset.Charset.isSupported("UTF-16BE")) {
            FileWriter fw1 = null;
            FileWriterWithEncoding fw2 = null;
            try {
                fw1 = new FileWriter(file1);
                fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1493,file1,1492,file1.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,file2,1494,file2.exists());
                fw1.write(textContent);
                fw2.write(textContent);
                fw1.flush();
                fw2.flush();
                try {
                    checkFile(file1, file2);
                } catch (AssertionFailedError ex) {
                }
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(fw1);
                org.apache.commons.io.IOUtils.closeQuietly(fw2);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1497,file1,1496,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1499,file2,1498,file2.exists());
        } 
        if (java.nio.charset.Charset.isSupported("UTF-16LE")) {
            FileWriter fw1 = null;
            FileWriterWithEncoding fw2 = null;
            try {
                fw1 = new FileWriter(file1);
                fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1501,file1,1500,file1.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1503,file2,1502,file2.exists());
                fw1.write(textContent);
                fw2.write(textContent);
                fw1.flush();
                fw2.flush();
                try {
                    checkFile(file1, file2);
                } catch (AssertionFailedError ex) {
                }
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(fw1);
                org.apache.commons.io.IOUtils.closeQuietly(fw2);
                org.apache.commons.io.IOUtils.closeQuietly(fw2);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1505,file1,1504,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,file2,1506,file2.exists());
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDifferentEncoding() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDifferentEncoding");
        if (java.nio.charset.Charset.isSupported("foo")) {
            FileWriter fw1 = null;
            FileWriterWithEncoding fw2 = null;
            try {
                fw1 = new FileWriter(file1);
                fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1493,file1,1492,file1.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,file2,1494,file2.exists());
                fw1.write(textContent);
                fw2.write(textContent);
                fw1.flush();
                fw2.flush();
                try {
                    checkFile(file1, file2);
                } catch (AssertionFailedError ex) {
                }
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(fw1);
                org.apache.commons.io.IOUtils.closeQuietly(fw2);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1497,file1,1496,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1499,file2,1498,file2.exists());
        } 
        if (java.nio.charset.Charset.isSupported("UTF-16LE")) {
            FileWriter fw1 = null;
            FileWriterWithEncoding fw2 = null;
            try {
                fw1 = new FileWriter(file1);
                fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1501,file1,1500,file1.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1503,file2,1502,file2.exists());
                fw1.write(textContent);
                fw2.write(textContent);
                fw1.flush();
                fw2.flush();
                try {
                    checkFile(file1, file2);
                } catch (AssertionFailedError ex) {
                }
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(fw1);
                org.apache.commons.io.IOUtils.closeQuietly(fw2);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1505,file1,1504,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,file2,1506,file2.exists());
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDifferentEncoding_literalMutation3479() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDifferentEncoding_literalMutation3479");
        if (java.nio.charset.Charset.isSupported("UTF-16BE")) {
            FileWriter fw1 = null;
            FileWriterWithEncoding fw2 = null;
            try {
                fw1 = new FileWriter(file1);
                fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1493,file1,1492,file1.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,file2,1494,file2.exists());
                fw1.write(textContent);
                fw2.write(textContent);
                fw1.flush();
                fw2.flush();
                try {
                    checkFile(file1, file2);
                } catch (AssertionFailedError ex) {
                }
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(fw1);
                org.apache.commons.io.IOUtils.closeQuietly(fw2);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1497,file1,1496,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1499,file2,1498,file2.exists());
        } 
        if (java.nio.charset.Charset.isSupported("bar")) {
            FileWriter fw1 = null;
            FileWriterWithEncoding fw2 = null;
            try {
                fw1 = new FileWriter(file1);
                fw2 = new FileWriterWithEncoding(file2 , defaultEncoding);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1501,file1,1500,file1.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1503,file2,1502,file2.exists());
                fw1.write(textContent);
                fw2.write(textContent);
                fw1.flush();
                fw2.flush();
                try {
                    checkFile(file1, file2);
                } catch (AssertionFailedError ex) {
                }
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(fw1);
                org.apache.commons.io.IOUtils.closeQuietly(fw2);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1505,file1,1504,file1.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,file2,1506,file2.exists());
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testConstructor_File_encoding_badEncoding_add1013() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructor_File_encoding_badEncoding_add1013");
        Writer writer = null;
        try {
            writer = new FileWriterWithEncoding(file1 , "BAD-ENCODE");
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1481,file1,1480,file1.exists());
        } finally {
            org.apache.commons.io.IOUtils.closeQuietly(writer);
            org.apache.commons.io.IOUtils.closeQuietly(writer);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1483,file1,1482,file1.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testConstructor_File_encoding_badEncoding() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructor_File_encoding_badEncoding");
        Writer writer = null;
        try {
            writer = new FileWriterWithEncoding(file1 , "foo");
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1481,file1,1480,file1.exists());
        } finally {
            org.apache.commons.io.IOUtils.closeQuietly(writer);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1483,file1,1482,file1.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testConstructor_File_directory() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructor_File_directory");
        Writer writer = null;
        try {
            writer = new FileWriterWithEncoding(FileBasedTestCase.getTestDirectory() , defaultEncoding);
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,file1,1476,file1.exists());
        } finally {
            org.apache.commons.io.IOUtils.closeQuietly(writer);
            org.apache.commons.io.IOUtils.closeQuietly(writer);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,file1,1478,file1.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testConstructor_File_nullFile() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructor_File_nullFile");
        Writer writer = null;
        try {
            writer = new FileWriterWithEncoding(((File)(null)) , defaultEncoding);
        } catch (NullPointerException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1485,file1,1484,file1.exists());
        } finally {
            org.apache.commons.io.IOUtils.closeQuietly(writer);
            org.apache.commons.io.IOUtils.closeQuietly(writer);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1487,file1,1486,file1.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testConstructor_fileName_nullFile() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructor_fileName_nullFile");
        Writer writer = null;
        try {
            writer = new FileWriterWithEncoding(((String)(null)) , defaultEncoding);
        } catch (NullPointerException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1489,file1,1488,file1.exists());
        } finally {
            org.apache.commons.io.IOUtils.closeQuietly(writer);
            org.apache.commons.io.IOUtils.closeQuietly(writer);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1491,file1,1490,file1.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


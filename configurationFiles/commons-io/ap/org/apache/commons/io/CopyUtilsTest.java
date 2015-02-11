package org.apache.commons.io;

import java.io.ByteArrayInputStream;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.commons.io.testtools.FileBasedTestCase;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import org.junit.Test;
import java.io.Writer;
import org.apache.commons.io.testtools.YellOnCloseInputStream;
import org.apache.commons.io.testtools.YellOnFlushAndCloseOutputStream;

@SuppressWarnings(value = "deprecation")
public class CopyUtilsTest extends FileBasedTestCase {
    private static final int FILE_SIZE = (1024 * 4) + 1;

    private byte[] inData = generateTestData(FILE_SIZE);

    public CopyUtilsTest(String testName) {
        super(testName);
    }

    @Override
    public void setUp() throws Exception {
    }

    @Override
    public void tearDown() throws Exception {
    }

    public void testCtor() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCtor");
        new CopyUtils();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_byteArrayToOutputStream_add1157() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_byteArrayToOutputStream_add1157");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        CopyUtils.copy(inData, out);
        CopyUtils.copy(inData, out);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1818,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1820,baout,1819,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1822,null,1821,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_byteArrayToOutputStream() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_byteArrayToOutputStream");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        CopyUtils.copy(inData, out);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1818,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1820,baout,1819,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1822,null,1821,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_byteArrayToOutputStream_literalMutation2554() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_byteArrayToOutputStream_literalMutation2554");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , false);
        CopyUtils.copy(inData, out);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1818,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1820,baout,1819,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1822,null,1821,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_byteArrayToOutputStream_remove895() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_byteArrayToOutputStream_remove895");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1818,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1820,baout,1819,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1822,null,1821,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_byteArrayToWriter_add1158() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_byteArrayToWriter_add1158");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(out , "US-ASCII");
        CopyUtils.copy(inData, writer);
        CopyUtils.copy(inData, writer);
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1826,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1828,baout,1827,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1830,null,1829,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_byteArrayToWriter_add1159() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_byteArrayToWriter_add1159");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(out , "US-ASCII");
        CopyUtils.copy(inData, writer);
        writer.flush();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1826,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1828,baout,1827,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1830,null,1829,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_byteArrayToWriter() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_byteArrayToWriter");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(out , "US-ASCII");
        CopyUtils.copy(inData, writer);
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1826,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1828,baout,1827,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1830,null,1829,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_byteArrayToWriter_literalMutation2556() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_byteArrayToWriter_literalMutation2556");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(out , "US-ASCII");
        CopyUtils.copy(inData, writer);
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1826,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1828,baout,1827,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1830,null,1829,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_byteArrayToWriter_literalMutation2557() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_byteArrayToWriter_literalMutation2557");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(out , "foo");
        CopyUtils.copy(inData, writer);
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1826,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1828,baout,1827,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1830,null,1829,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_byteArrayToWriter_remove896() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_byteArrayToWriter_remove896");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(out , "US-ASCII");
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1826,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1828,baout,1827,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1830,null,1829,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_byteArrayToWriter_remove897() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_byteArrayToWriter_remove897");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(out , "US-ASCII");
        CopyUtils.copy(inData, writer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1826,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1828,baout,1827,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1830,null,1829,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_byteArrayToWriterWithEncoding_add1160() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_byteArrayToWriterWithEncoding_add1160");
        String inDataStr = "data";
        String charsetName = "UTF-8";
        StringWriter writer = new StringWriter();
        CopyUtils.copy(inDataStr.getBytes(charsetName), writer, charsetName);
        CopyUtils.copy(inDataStr.getBytes(charsetName), writer, charsetName);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1823,inDataStr);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1825,writer,1824,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_byteArrayToWriterWithEncoding() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_byteArrayToWriterWithEncoding");
        String inDataStr = "foo";
        String charsetName = "UTF-8";
        StringWriter writer = new StringWriter();
        CopyUtils.copy(inDataStr.getBytes(charsetName), writer, charsetName);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1823,inDataStr);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1825,writer,1824,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_byteArrayToWriterWithEncoding_literalMutation2559() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_byteArrayToWriterWithEncoding_literalMutation2559");
        String inDataStr = "data";
        String charsetName = "foo";
        StringWriter writer = new StringWriter();
        CopyUtils.copy(inDataStr.getBytes(charsetName), writer, charsetName);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1823,inDataStr);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1825,writer,1824,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_byteArrayToWriterWithEncoding_remove898() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_byteArrayToWriterWithEncoding_remove898");
        String inDataStr = "data";
        String charsetName = "UTF-8";
        StringWriter writer = new StringWriter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1823,inDataStr);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1825,writer,1824,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_inputStreamToOutputStream() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToOutputStream");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        int count = CopyUtils.copy(in, out);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1832,in,1831,in.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1833,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1835,baout,1834,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1837,null,1836,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1838,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1839,count);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_inputStreamToOutputStream_literalMutation2561() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToOutputStream_literalMutation2561");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        int count = CopyUtils.copy(in, out);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1832,in,1831,in.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1833,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1835,baout,1834,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1837,null,1836,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1838,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1839,count);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_inputStreamToWriter_add1161() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_add1161");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(out , "US-ASCII");
        CopyUtils.copy(in, writer);
        CopyUtils.copy(in, writer);
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1844,in,1843,in.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1845,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1847,baout,1846,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1849,null,1848,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_inputStreamToWriter_add1162() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_add1162");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(out , "US-ASCII");
        CopyUtils.copy(in, writer);
        writer.flush();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1844,in,1843,in.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1845,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1847,baout,1846,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1849,null,1848,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_inputStreamToWriter() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(out , "US-ASCII");
        CopyUtils.copy(in, writer);
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1844,in,1843,in.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1845,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1847,baout,1846,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1849,null,1848,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_inputStreamToWriter_literalMutation2563() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_literalMutation2563");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(out , "US-ASCII");
        CopyUtils.copy(in, writer);
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1844,in,1843,in.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1845,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1847,baout,1846,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1849,null,1848,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_inputStreamToWriter_literalMutation2564() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_literalMutation2564");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(out , "foo");
        CopyUtils.copy(in, writer);
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1844,in,1843,in.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1845,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1847,baout,1846,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1849,null,1848,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_inputStreamToWriter_remove899() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_remove899");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(out , "US-ASCII");
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1844,in,1843,in.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1845,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1847,baout,1846,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1849,null,1848,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_inputStreamToWriter_remove900() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_remove900");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(out , "US-ASCII");
        CopyUtils.copy(in, writer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1844,in,1843,in.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1845,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1847,baout,1846,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1849,null,1848,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_inputStreamToWriterWithEncoding_add1163() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriterWithEncoding_add1163");
        String inDataStr = "data";
        String charsetName = "UTF-8";
        StringWriter writer = new StringWriter();
        CopyUtils.copy(new ByteArrayInputStream(inDataStr.getBytes(charsetName)), writer, charsetName);
        CopyUtils.copy(new ByteArrayInputStream(inDataStr.getBytes(charsetName)), writer, charsetName);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1840,inDataStr);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1842,writer,1841,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_inputStreamToWriterWithEncoding() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriterWithEncoding");
        String inDataStr = "foo";
        String charsetName = "UTF-8";
        StringWriter writer = new StringWriter();
        CopyUtils.copy(new ByteArrayInputStream(inDataStr.getBytes(charsetName)), writer, charsetName);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1840,inDataStr);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1842,writer,1841,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_inputStreamToWriterWithEncoding_literalMutation2566() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriterWithEncoding_literalMutation2566");
        String inDataStr = "data";
        String charsetName = "foo";
        StringWriter writer = new StringWriter();
        CopyUtils.copy(new ByteArrayInputStream(inDataStr.getBytes(charsetName)), writer, charsetName);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1840,inDataStr);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1842,writer,1841,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_inputStreamToWriterWithEncoding_remove901() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriterWithEncoding_remove901");
        String inDataStr = "data";
        String charsetName = "UTF-8";
        StringWriter writer = new StringWriter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1840,inDataStr);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1842,writer,1841,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_readerToOutputStream_add1164() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToOutputStream_add1164");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        CopyUtils.copy(reader, out);
        CopyUtils.copy(reader, out);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1850,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1852,baout,1851,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1854,null,1853,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_readerToOutputStream() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToOutputStream");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "foo");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        CopyUtils.copy(reader, out);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1850,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1852,baout,1851,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1854,null,1853,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_readerToOutputStream_literalMutation2568() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToOutputStream_literalMutation2568");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        CopyUtils.copy(reader, out);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1850,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1852,baout,1851,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1854,null,1853,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_readerToOutputStream_literalMutation2569() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToOutputStream_literalMutation2569");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , false);
        CopyUtils.copy(reader, out);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1850,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1852,baout,1851,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1854,null,1853,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_readerToOutputStream_remove902() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToOutputStream_remove902");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1850,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1852,baout,1851,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1854,null,1853,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_readerToWriter_add1165() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToWriter_add1165");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(out , "US-ASCII");
        int count = CopyUtils.copy(reader, writer);
        writer.flush();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1855,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1856,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,baout,1858,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,null,1860,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_readerToWriter() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToWriter");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "foo");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(out , "US-ASCII");
        int count = CopyUtils.copy(reader, writer);
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1855,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1856,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,baout,1858,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,null,1860,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_readerToWriter_literalMutation2571() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToWriter_literalMutation2571");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(out , "US-ASCII");
        int count = CopyUtils.copy(reader, writer);
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1855,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1856,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,baout,1858,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,null,1860,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_readerToWriter_literalMutation2572() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToWriter_literalMutation2572");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(out , "US-ASCII");
        int count = CopyUtils.copy(reader, writer);
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1855,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1856,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,baout,1858,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,null,1860,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_readerToWriter_literalMutation2573() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToWriter_literalMutation2573");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(out , "foo");
        int count = CopyUtils.copy(reader, writer);
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1855,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1856,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,baout,1858,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,null,1860,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_readerToWriter_remove903() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToWriter_remove903");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(out , "US-ASCII");
        int count = CopyUtils.copy(reader, writer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1855,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1856,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,baout,1858,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,null,1860,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_stringToOutputStream_add1166() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_stringToOutputStream_add1166");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        CopyUtils.copy(str, out);
        CopyUtils.copy(str, out);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1862,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,baout,1863,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,null,1865,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_stringToOutputStream() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_stringToOutputStream");
        String str = new String(inData , "foo");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        CopyUtils.copy(str, out);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1862,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,baout,1863,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,null,1865,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_stringToOutputStream_literalMutation2575() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_stringToOutputStream_literalMutation2575");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        CopyUtils.copy(str, out);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1862,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,baout,1863,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,null,1865,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_stringToOutputStream_literalMutation2576() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_stringToOutputStream_literalMutation2576");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , false);
        CopyUtils.copy(str, out);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1862,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,baout,1863,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,null,1865,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_stringToOutputStream_remove904() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_stringToOutputStream_remove904");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1862,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,baout,1863,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,null,1865,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_stringToWriter_add1167() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_stringToWriter_add1167");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(out , "US-ASCII");
        CopyUtils.copy(str, writer);
        CopyUtils.copy(str, writer);
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1867,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,baout,1868,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,null,1870,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_stringToWriter_add1168() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_stringToWriter_add1168");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(out , "US-ASCII");
        CopyUtils.copy(str, writer);
        writer.flush();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1867,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,baout,1868,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,null,1870,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_stringToWriter() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_stringToWriter");
        String str = new String(inData , "foo");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(out , "US-ASCII");
        CopyUtils.copy(str, writer);
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1867,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,baout,1868,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,null,1870,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_stringToWriter_literalMutation2578() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_stringToWriter_literalMutation2578");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(out , "US-ASCII");
        CopyUtils.copy(str, writer);
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1867,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,baout,1868,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,null,1870,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_stringToWriter_literalMutation2579() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_stringToWriter_literalMutation2579");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , false);
        Writer writer = new OutputStreamWriter(out , "US-ASCII");
        CopyUtils.copy(str, writer);
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1867,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,baout,1868,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,null,1870,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_stringToWriter_literalMutation2580() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_stringToWriter_literalMutation2580");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(out , "foo");
        CopyUtils.copy(str, writer);
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1867,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,baout,1868,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,null,1870,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_stringToWriter_remove905() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_stringToWriter_remove905");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(out , "US-ASCII");
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1867,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,baout,1868,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,null,1870,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_stringToWriter_remove906() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_stringToWriter_remove906");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(out , "US-ASCII");
        CopyUtils.copy(str, writer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1867,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,baout,1868,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,null,1870,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


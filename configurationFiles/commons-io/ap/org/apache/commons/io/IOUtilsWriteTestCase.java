package org.apache.commons.io;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.commons.io.testtools.FileBasedTestCase;
import java.util.List;
import java.io.OutputStreamWriter;
import org.junit.Test;
import java.io.Writer;
import org.apache.commons.io.testtools.YellOnFlushAndCloseOutputStream;

/** 
 * JUnit tests for IOUtils write methods.
 * 
 * @version $Id$
 * @see IOUtils
 */
public class IOUtilsWriteTestCase extends FileBasedTestCase {
    private static final int FILE_SIZE = (1024 * 4) + 1;

    private byte[] inData = generateTestData(FILE_SIZE);

    public IOUtilsWriteTestCase(String testName) {
        super(testName);
    }

    @Override
    public void setUp() throws Exception {
    }

    @Override
    public void tearDown() throws Exception {
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToOutputStream_add1972() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToOutputStream_add1972");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(inData, out);
        IOUtils.write(inData, out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,baout,5618,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,null,5620,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToOutputStream_add1973() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToOutputStream_add1973");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(inData, out);
        out.off();
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,baout,5618,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,null,5620,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToOutputStream_add1974() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToOutputStream_add1974");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(inData, out);
        out.off();
        out.flush();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,baout,5618,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,null,5620,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_byteArrayToOutputStream() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToOutputStream");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.write(inData, out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,baout,5618,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,null,5620,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_byteArrayToOutputStream_literalMutation6634() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToOutputStream_literalMutation6634");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        IOUtils.write(inData, out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,baout,5618,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,null,5620,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToOutputStream_remove1431() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToOutputStream_remove1431");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,baout,5618,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,null,5620,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToOutputStream_remove1432() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToOutputStream_remove1432");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(inData, out);
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,baout,5618,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,null,5620,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToOutputStream_remove1433() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToOutputStream_remove1433");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(inData, out);
        out.off();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,baout,5618,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,null,5620,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToOutputStream_nullData_add1975() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToOutputStream_nullData_add1975");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(((byte[])(null)), out);
        IOUtils.write(((byte[])(null)), out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,baout,5622,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToOutputStream_nullData_add1976() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToOutputStream_nullData_add1976");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(((byte[])(null)), out);
        out.off();
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,baout,5622,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToOutputStream_nullData_add1977() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToOutputStream_nullData_add1977");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(((byte[])(null)), out);
        out.off();
        out.flush();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,baout,5622,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_byteArrayToOutputStream_nullData() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToOutputStream_nullData");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.write(((byte[])(null)), out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,baout,5622,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_byteArrayToOutputStream_nullData_literalMutation6636() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToOutputStream_nullData_literalMutation6636");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        IOUtils.write(((byte[])(null)), out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,baout,5622,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToOutputStream_nullData_remove1434() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToOutputStream_nullData_remove1434");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,baout,5622,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToOutputStream_nullData_remove1435() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToOutputStream_nullData_remove1435");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(((byte[])(null)), out);
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,baout,5622,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToOutputStream_nullData_remove1436() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToOutputStream_nullData_remove1436");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(((byte[])(null)), out);
        out.off();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,baout,5622,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToOutputStream_nullStream() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToOutputStream_nullStream");
        try {
            IOUtils.write(inData, ((java.io.OutputStream)(null)));
            IOUtils.write(inData, ((java.io.OutputStream)(null)));
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToWriter_add1979() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_add1979");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(inData, writer);
        IOUtils.write(inData, writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5633,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5635,baout,5634,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5637,null,5636,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToWriter_add1980() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_add1980");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(inData, writer);
        out.off();
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5633,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5635,baout,5634,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5637,null,5636,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToWriter_add1981() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_add1981");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(inData, writer);
        out.off();
        writer.flush();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5633,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5635,baout,5634,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5637,null,5636,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_byteArrayToWriter() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(inData, writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5633,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5635,baout,5634,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5637,null,5636,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_byteArrayToWriter_literalMutation6640() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_literalMutation6640");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(inData, writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5633,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5635,baout,5634,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5637,null,5636,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_byteArrayToWriter_literalMutation6641() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_literalMutation6641");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "bar");
        IOUtils.write(inData, writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5633,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5635,baout,5634,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5637,null,5636,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToWriter_remove1437() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_remove1437");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5633,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5635,baout,5634,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5637,null,5636,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToWriter_remove1438() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_remove1438");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(inData, writer);
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5633,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5635,baout,5634,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5637,null,5636,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToWriter_remove1439() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_remove1439");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(inData, writer);
        out.off();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5633,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5635,baout,5634,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5637,null,5636,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToWriter_nullData_add1992() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_nullData_add1992");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(((byte[])(null)), writer);
        IOUtils.write(((byte[])(null)), writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5639,baout,5638,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToWriter_nullData_add1993() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_nullData_add1993");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(((byte[])(null)), writer);
        out.off();
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5639,baout,5638,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToWriter_nullData_add1994() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_nullData_add1994");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(((byte[])(null)), writer);
        out.off();
        writer.flush();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5639,baout,5638,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_byteArrayToWriter_nullData() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_nullData");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(((byte[])(null)), writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5639,baout,5638,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_byteArrayToWriter_nullData_literalMutation6660() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_nullData_literalMutation6660");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(((byte[])(null)), writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5639,baout,5638,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_byteArrayToWriter_nullData_literalMutation6661() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_nullData_literalMutation6661");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "bar");
        IOUtils.write(((byte[])(null)), writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5639,baout,5638,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToWriter_nullData_remove1449() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_nullData_remove1449");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5639,baout,5638,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToWriter_nullData_remove1450() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_nullData_remove1450");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(((byte[])(null)), writer);
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5639,baout,5638,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToWriter_nullData_remove1451() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_nullData_remove1451");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(((byte[])(null)), writer);
        out.off();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5639,baout,5638,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToWriter_nullWriter() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_nullWriter");
        try {
            IOUtils.write(inData, ((Writer)(null)));
            IOUtils.write(inData, ((Writer)(null)));
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToWriter_Encoding_add1982() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_Encoding_add1982");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(inData, writer, "UTF8");
        IOUtils.write(inData, writer, "UTF8");
        out.off();
        writer.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF8").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,null,5624,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToWriter_Encoding_add1983() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_Encoding_add1983");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(inData, writer, "UTF8");
        out.off();
        out.off();
        writer.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF8").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,null,5624,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToWriter_Encoding_add1984() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_Encoding_add1984");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(inData, writer, "UTF8");
        out.off();
        writer.flush();
        writer.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF8").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,null,5624,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_byteArrayToWriter_Encoding() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_Encoding");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(inData, writer, "UTF8");
        out.off();
        writer.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF8").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,null,5624,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_byteArrayToWriter_Encoding_literalMutation6643() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_Encoding_literalMutation6643");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(inData, writer, "UTF8");
        out.off();
        writer.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF8").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,null,5624,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_byteArrayToWriter_Encoding_literalMutation6644() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_Encoding_literalMutation6644");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "foo");
        IOUtils.write(inData, writer, "UTF8");
        out.off();
        writer.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF8").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,null,5624,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_byteArrayToWriter_Encoding_literalMutation6645() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_Encoding_literalMutation6645");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(inData, writer, "bar");
        out.off();
        writer.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF8").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,null,5624,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_byteArrayToWriter_Encoding_literalMutation6646() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_Encoding_literalMutation6646");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(inData, writer, "UTF8");
        out.off();
        writer.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "bar").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,null,5624,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_byteArrayToWriter_Encoding_literalMutation6647() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_Encoding_literalMutation6647");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(inData, writer, "UTF8");
        out.off();
        writer.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF8").getBytes("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,null,5624,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToWriter_Encoding_remove1440() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_Encoding_remove1440");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        out.off();
        writer.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF8").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,null,5624,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToWriter_Encoding_remove1441() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_Encoding_remove1441");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(inData, writer, "UTF8");
        writer.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF8").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,null,5624,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToWriter_Encoding_remove1442() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_Encoding_remove1442");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(inData, writer, "UTF8");
        out.off();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF8").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,null,5624,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToWriter_Encoding_nullData_add1985() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_Encoding_nullData_add1985");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(((byte[])(null)), writer, "UTF8");
        IOUtils.write(((byte[])(null)), writer, "UTF8");
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5627,baout,5626,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToWriter_Encoding_nullData_add1986() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_Encoding_nullData_add1986");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(((byte[])(null)), writer, "UTF8");
        out.off();
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5627,baout,5626,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToWriter_Encoding_nullData_add1987() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_Encoding_nullData_add1987");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(((byte[])(null)), writer, "UTF8");
        out.off();
        writer.flush();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5627,baout,5626,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_byteArrayToWriter_Encoding_nullData() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_Encoding_nullData");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(((byte[])(null)), writer, "UTF8");
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5627,baout,5626,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_byteArrayToWriter_Encoding_nullData_literalMutation6649() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_Encoding_nullData_literalMutation6649");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(((byte[])(null)), writer, "UTF8");
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5627,baout,5626,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_byteArrayToWriter_Encoding_nullData_literalMutation6650() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_Encoding_nullData_literalMutation6650");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "foo");
        IOUtils.write(((byte[])(null)), writer, "UTF8");
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5627,baout,5626,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_byteArrayToWriter_Encoding_nullData_literalMutation6652() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_Encoding_nullData_literalMutation6652");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(((byte[])(null)), writer, "foo");
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5627,baout,5626,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToWriter_Encoding_nullData_remove1443() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_Encoding_nullData_remove1443");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5627,baout,5626,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToWriter_Encoding_nullData_remove1444() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_Encoding_nullData_remove1444");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(((byte[])(null)), writer, "UTF8");
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5627,baout,5626,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToWriter_Encoding_nullData_remove1445() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_Encoding_nullData_remove1445");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(((byte[])(null)), writer, "UTF8");
        out.off();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5627,baout,5626,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToWriter_Encoding_nullWriter_add1991() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_Encoding_nullWriter_add1991");
        try {
            IOUtils.write(inData, ((Writer)(null)), "UTF8");
            IOUtils.write(inData, ((Writer)(null)), "UTF8");
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_byteArrayToWriter_Encoding_nullWriter() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_Encoding_nullWriter");
        try {
            IOUtils.write(inData, ((Writer)(null)), "bar");
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToWriter_Encoding_nullEncoding_add1988() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_Encoding_nullEncoding_add1988");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(inData, writer, ((String)(null)));
        IOUtils.write(inData, writer, ((String)(null)));
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5628,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5630,baout,5629,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5632,null,5631,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToWriter_Encoding_nullEncoding_add1989() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_Encoding_nullEncoding_add1989");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(inData, writer, ((String)(null)));
        out.off();
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5628,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5630,baout,5629,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5632,null,5631,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToWriter_Encoding_nullEncoding_add1990() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_Encoding_nullEncoding_add1990");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(inData, writer, ((String)(null)));
        out.off();
        writer.flush();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5628,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5630,baout,5629,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5632,null,5631,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_byteArrayToWriter_Encoding_nullEncoding() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_Encoding_nullEncoding");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(inData, writer, ((String)(null)));
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5628,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5630,baout,5629,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5632,null,5631,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_byteArrayToWriter_Encoding_nullEncoding_literalMutation6654() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_Encoding_nullEncoding_literalMutation6654");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(inData, writer, ((String)(null)));
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5628,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5630,baout,5629,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5632,null,5631,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_byteArrayToWriter_Encoding_nullEncoding_literalMutation6655() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_Encoding_nullEncoding_literalMutation6655");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "foo");
        IOUtils.write(inData, writer, ((String)(null)));
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5628,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5630,baout,5629,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5632,null,5631,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToWriter_Encoding_nullEncoding_remove1446() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_Encoding_nullEncoding_remove1446");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5628,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5630,baout,5629,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5632,null,5631,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToWriter_Encoding_nullEncoding_remove1447() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_Encoding_nullEncoding_remove1447");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(inData, writer, ((String)(null)));
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5628,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5630,baout,5629,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5632,null,5631,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_byteArrayToWriter_Encoding_nullEncoding_remove1448() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_byteArrayToWriter_Encoding_nullEncoding_remove1448");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(inData, writer, ((String)(null)));
        out.off();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5628,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5630,baout,5629,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5632,null,5631,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToOutputStream_add2020() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_add2020");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(csq, out);
        IOUtils.write(csq, out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,baout,1858,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,null,1860,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToOutputStream_add2021() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_add2021");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(csq, out);
        out.off();
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,baout,1858,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,null,1860,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToOutputStream_add2022() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_add2022");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(csq, out);
        out.off();
        out.flush();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,baout,1858,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,null,1860,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charSequenceToOutputStream() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream");
        CharSequence csq = new StringBuilder(new String(inData , "foo"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(csq, out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,baout,1858,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,null,1860,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charSequenceToOutputStream_literalMutation6698() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_literalMutation6698");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.write(csq, out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,baout,1858,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,null,1860,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charSequenceToOutputStream_literalMutation6699() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_literalMutation6699");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        IOUtils.write(csq, out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,baout,1858,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,null,1860,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToOutputStream_remove1473() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_remove1473");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,baout,1858,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,null,1860,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToOutputStream_remove1474() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_remove1474");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(csq, out);
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,baout,1858,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,null,1860,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToOutputStream_remove1475() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_remove1475");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(csq, out);
        out.off();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,baout,1858,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,null,1860,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToOutputStream_nullData_add2030() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_nullData_add2030");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(((CharSequence)(null)), out);
        IOUtils.write(((CharSequence)(null)), out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5666,baout,5665,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToOutputStream_nullData_add2031() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_nullData_add2031");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(((CharSequence)(null)), out);
        out.off();
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5666,baout,5665,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToOutputStream_nullData_add2032() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_nullData_add2032");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(((CharSequence)(null)), out);
        out.off();
        out.flush();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5666,baout,5665,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charSequenceToOutputStream_nullData() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_nullData");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.write(((CharSequence)(null)), out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5666,baout,5665,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charSequenceToOutputStream_nullData_literalMutation6712() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_nullData_literalMutation6712");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        IOUtils.write(((CharSequence)(null)), out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5666,baout,5665,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToOutputStream_nullData_remove1482() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_nullData_remove1482");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5666,baout,5665,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToOutputStream_nullData_remove1483() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_nullData_remove1483");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(((CharSequence)(null)), out);
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5666,baout,5665,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToOutputStream_nullData_remove1484() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_nullData_remove1484");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(((CharSequence)(null)), out);
        out.off();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5666,baout,5665,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToOutputStream_nullStream_add2036() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_nullStream_add2036");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        try {
            IOUtils.write(csq, ((java.io.OutputStream)(null)));
            IOUtils.write(csq, ((java.io.OutputStream)(null)));
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charSequenceToOutputStream_nullStream() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_nullStream");
        CharSequence csq = new StringBuilder(new String(inData , "foo"));
        try {
            IOUtils.write(csq, ((java.io.OutputStream)(null)));
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToOutputStream_Encoding_add2023() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_Encoding_add2023");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(csq, out, "UTF16");
        IOUtils.write(csq, out, "UTF16");
        out.off();
        out.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5664,null,5663,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToOutputStream_Encoding_add2024() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_Encoding_add2024");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(csq, out, "UTF16");
        out.off();
        out.off();
        out.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5664,null,5663,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToOutputStream_Encoding_add2025() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_Encoding_add2025");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(csq, out, "UTF16");
        out.off();
        out.flush();
        out.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5664,null,5663,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charSequenceToOutputStream_Encoding() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_Encoding");
        CharSequence csq = new StringBuilder(new String(inData , "bar"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(csq, out, "UTF16");
        out.off();
        out.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5664,null,5663,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charSequenceToOutputStream_Encoding_literalMutation6701() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_Encoding_literalMutation6701");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.write(csq, out, "UTF16");
        out.off();
        out.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5664,null,5663,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charSequenceToOutputStream_Encoding_literalMutation6702() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_Encoding_literalMutation6702");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        IOUtils.write(csq, out, "UTF16");
        out.off();
        out.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5664,null,5663,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charSequenceToOutputStream_Encoding_literalMutation6703() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_Encoding_literalMutation6703");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(csq, out, "bar");
        out.off();
        out.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5664,null,5663,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charSequenceToOutputStream_Encoding_literalMutation6704() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_Encoding_literalMutation6704");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(csq, out, "UTF16");
        out.off();
        out.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "foo").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5664,null,5663,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charSequenceToOutputStream_Encoding_literalMutation6705() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_Encoding_literalMutation6705");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(csq, out, "UTF16");
        out.off();
        out.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5664,null,5663,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToOutputStream_Encoding_remove1476() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_Encoding_remove1476");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        out.off();
        out.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5664,null,5663,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToOutputStream_Encoding_remove1477() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_Encoding_remove1477");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(csq, out, "UTF16");
        out.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5664,null,5663,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToOutputStream_Encoding_remove1478() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_Encoding_remove1478");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(csq, out, "UTF16");
        out.off();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5664,null,5663,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charSequenceToOutputStream_Encoding_nullData() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_Encoding_nullData");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(((CharSequence)(null)), out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5383,baout,5382,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToOutputStream_Encoding_nullData_add2026() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_Encoding_nullData_add2026");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(((CharSequence)(null)), out);
        IOUtils.write(((CharSequence)(null)), out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5383,baout,5382,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToOutputStream_Encoding_nullData_add2027() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_Encoding_nullData_add2027");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(((CharSequence)(null)), out);
        out.off();
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5383,baout,5382,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToOutputStream_Encoding_nullData_add2028() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_Encoding_nullData_add2028");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(((CharSequence)(null)), out);
        out.off();
        out.flush();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5383,baout,5382,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charSequenceToOutputStream_Encoding_nullData_literalMutation6706() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_Encoding_nullData_literalMutation6706");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.write(((CharSequence)(null)), out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5383,baout,5382,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charSequenceToOutputStream_Encoding_nullData_literalMutation6707() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_Encoding_nullData_literalMutation6707");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        IOUtils.write(((CharSequence)(null)), out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5383,baout,5382,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToOutputStream_Encoding_nullData_remove1479() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_Encoding_nullData_remove1479");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5383,baout,5382,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToOutputStream_Encoding_nullData_remove1480() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_Encoding_nullData_remove1480");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(((CharSequence)(null)), out);
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5383,baout,5382,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToOutputStream_Encoding_nullData_remove1481() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_Encoding_nullData_remove1481");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(((CharSequence)(null)), out);
        out.off();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5383,baout,5382,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charSequenceToOutputStream_Encoding_nullStream() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_Encoding_nullStream");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        try {
            IOUtils.write(csq, ((java.io.OutputStream)(null)));
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToOutputStream_Encoding_nullStream_add2029() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_Encoding_nullStream_add2029");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        try {
            IOUtils.write(csq, ((java.io.OutputStream)(null)));
            IOUtils.write(csq, ((java.io.OutputStream)(null)));
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charSequenceToOutputStream_Encoding_nullStream_literalMutation6709() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_Encoding_nullStream_literalMutation6709");
        CharSequence csq = new StringBuilder(new String(inData , "bar"));
        try {
            IOUtils.write(csq, ((java.io.OutputStream)(null)));
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToOutputStream_nullEncoding_add2033() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_nullEncoding_add2033");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(csq, out, ((String)(null)));
        IOUtils.write(csq, out, ((String)(null)));
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,baout,5668,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,null,5670,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToOutputStream_nullEncoding_add2034() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_nullEncoding_add2034");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(csq, out, ((String)(null)));
        out.off();
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,baout,5668,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,null,5670,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToOutputStream_nullEncoding_add2035() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_nullEncoding_add2035");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(csq, out, ((String)(null)));
        out.off();
        out.flush();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,baout,5668,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,null,5670,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charSequenceToOutputStream_nullEncoding() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_nullEncoding");
        CharSequence csq = new StringBuilder(new String(inData , "foo"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(csq, out, ((String)(null)));
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,baout,5668,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,null,5670,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charSequenceToOutputStream_nullEncoding_literalMutation6715() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_nullEncoding_literalMutation6715");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.write(csq, out, ((String)(null)));
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,baout,5668,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,null,5670,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charSequenceToOutputStream_nullEncoding_literalMutation6716() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_nullEncoding_literalMutation6716");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        IOUtils.write(csq, out, ((String)(null)));
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,baout,5668,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,null,5670,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToOutputStream_nullEncoding_remove1485() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_nullEncoding_remove1485");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,baout,5668,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,null,5670,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToOutputStream_nullEncoding_remove1486() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_nullEncoding_remove1486");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(csq, out, ((String)(null)));
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,baout,5668,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,null,5670,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToOutputStream_nullEncoding_remove1487() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToOutputStream_nullEncoding_remove1487");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(csq, out, ((String)(null)));
        out.off();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,baout,5668,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,null,5670,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToWriter_add2037() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToWriter_add2037");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(csq, writer);
        IOUtils.write(csq, writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5674,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5676,baout,5675,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,null,5677,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToWriter_add2038() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToWriter_add2038");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(csq, writer);
        out.off();
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5674,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5676,baout,5675,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,null,5677,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToWriter_add2039() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToWriter_add2039");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(csq, writer);
        out.off();
        writer.flush();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5674,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5676,baout,5675,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,null,5677,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charSequenceToWriter() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToWriter");
        CharSequence csq = new StringBuilder(new String(inData , "bar"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(csq, writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5674,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5676,baout,5675,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,null,5677,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charSequenceToWriter_literalMutation6721() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToWriter_literalMutation6721");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(csq, writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5674,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5676,baout,5675,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,null,5677,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charSequenceToWriter_literalMutation6722() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToWriter_literalMutation6722");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(csq, writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5674,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5676,baout,5675,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,null,5677,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charSequenceToWriter_literalMutation6723() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToWriter_literalMutation6723");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "foo");
        IOUtils.write(csq, writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5674,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5676,baout,5675,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,null,5677,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToWriter_remove1488() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToWriter_remove1488");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5674,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5676,baout,5675,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,null,5677,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToWriter_remove1489() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToWriter_remove1489");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(csq, writer);
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5674,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5676,baout,5675,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,null,5677,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToWriter_remove1490() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToWriter_remove1490");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(csq, writer);
        out.off();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5674,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5676,baout,5675,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,null,5677,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToWriter_Encoding_nullData_add2040() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToWriter_Encoding_nullData_add2040");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(((CharSequence)(null)), writer);
        IOUtils.write(((CharSequence)(null)), writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,baout,5672,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToWriter_Encoding_nullData_add2041() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToWriter_Encoding_nullData_add2041");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(((CharSequence)(null)), writer);
        out.off();
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,baout,5672,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToWriter_Encoding_nullData_add2042() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToWriter_Encoding_nullData_add2042");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(((CharSequence)(null)), writer);
        out.off();
        writer.flush();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,baout,5672,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charSequenceToWriter_Encoding_nullData() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToWriter_Encoding_nullData");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(((CharSequence)(null)), writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,baout,5672,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charSequenceToWriter_Encoding_nullData_literalMutation6725() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToWriter_Encoding_nullData_literalMutation6725");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(((CharSequence)(null)), writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,baout,5672,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charSequenceToWriter_Encoding_nullData_literalMutation6726() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToWriter_Encoding_nullData_literalMutation6726");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "foo");
        IOUtils.write(((CharSequence)(null)), writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,baout,5672,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToWriter_Encoding_nullData_remove1491() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToWriter_Encoding_nullData_remove1491");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,baout,5672,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToWriter_Encoding_nullData_remove1492() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToWriter_Encoding_nullData_remove1492");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(((CharSequence)(null)), writer);
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,baout,5672,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToWriter_Encoding_nullData_remove1493() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToWriter_Encoding_nullData_remove1493");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(((CharSequence)(null)), writer);
        out.off();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,baout,5672,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charSequenceToWriter_Encoding_nullStream_add2043() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToWriter_Encoding_nullStream_add2043");
        CharSequence csq = new StringBuilder(new String(inData , "US-ASCII"));
        try {
            IOUtils.write(csq, ((Writer)(null)));
            IOUtils.write(csq, ((Writer)(null)));
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charSequenceToWriter_Encoding_nullStream() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charSequenceToWriter_Encoding_nullStream");
        CharSequence csq = new StringBuilder(new String(inData , "foo"));
        try {
            IOUtils.write(csq, ((Writer)(null)));
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToOutputStream_add2044() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_add2044");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str, out);
        IOUtils.write(str, out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5685,baout,5684,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5687,null,5686,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToOutputStream_add2045() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_add2045");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str, out);
        out.off();
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5685,baout,5684,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5687,null,5686,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToOutputStream_add2046() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_add2046");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str, out);
        out.off();
        out.flush();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5685,baout,5684,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5687,null,5686,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_stringToOutputStream() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream");
        String str = new String(inData , "foo");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str, out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5685,baout,5684,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5687,null,5686,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_stringToOutputStream_literalMutation6731() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_literalMutation6731");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.write(str, out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5685,baout,5684,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5687,null,5686,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_stringToOutputStream_literalMutation6732() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_literalMutation6732");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        IOUtils.write(str, out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5685,baout,5684,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5687,null,5686,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToOutputStream_remove1494() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_remove1494");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5685,baout,5684,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5687,null,5686,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToOutputStream_remove1495() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_remove1495");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str, out);
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5685,baout,5684,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5687,null,5686,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToOutputStream_remove1496() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_remove1496");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str, out);
        out.off();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5685,baout,5684,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5687,null,5686,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToOutputStream_nullData_add2054() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_nullData_add2054");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(((String)(null)), out);
        IOUtils.write(((String)(null)), out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5689,baout,5688,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToOutputStream_nullData_add2055() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_nullData_add2055");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(((String)(null)), out);
        out.off();
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5689,baout,5688,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToOutputStream_nullData_add2056() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_nullData_add2056");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(((String)(null)), out);
        out.off();
        out.flush();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5689,baout,5688,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_stringToOutputStream_nullData() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_nullData");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.write(((String)(null)), out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5689,baout,5688,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_stringToOutputStream_nullData_literalMutation6745() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_nullData_literalMutation6745");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        IOUtils.write(((String)(null)), out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5689,baout,5688,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToOutputStream_nullData_remove1503() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_nullData_remove1503");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5689,baout,5688,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToOutputStream_nullData_remove1504() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_nullData_remove1504");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(((String)(null)), out);
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5689,baout,5688,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToOutputStream_nullData_remove1505() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_nullData_remove1505");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(((String)(null)), out);
        out.off();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5689,baout,5688,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToOutputStream_nullStream_add2060() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_nullStream_add2060");
        String str = new String(inData , "US-ASCII");
        try {
            IOUtils.write(str, ((java.io.OutputStream)(null)));
            IOUtils.write(str, ((java.io.OutputStream)(null)));
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_stringToOutputStream_nullStream() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_nullStream");
        String str = new String(inData , "bar");
        try {
            IOUtils.write(str, ((java.io.OutputStream)(null)));
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToOutputStream_Encoding_add2047() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_Encoding_add2047");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str, out, "UTF16");
        IOUtils.write(str, out, "UTF16");
        out.off();
        out.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,null,5679,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToOutputStream_Encoding_add2048() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_Encoding_add2048");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str, out, "UTF16");
        out.off();
        out.off();
        out.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,null,5679,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToOutputStream_Encoding_add2049() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_Encoding_add2049");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str, out, "UTF16");
        out.off();
        out.flush();
        out.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,null,5679,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_stringToOutputStream_Encoding() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_Encoding");
        String str = new String(inData , "foo");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str, out, "UTF16");
        out.off();
        out.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,null,5679,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_stringToOutputStream_Encoding_literalMutation6734() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_Encoding_literalMutation6734");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.write(str, out, "UTF16");
        out.off();
        out.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,null,5679,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_stringToOutputStream_Encoding_literalMutation6735() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_Encoding_literalMutation6735");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        IOUtils.write(str, out, "UTF16");
        out.off();
        out.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,null,5679,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_stringToOutputStream_Encoding_literalMutation6736() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_Encoding_literalMutation6736");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str, out, "bar");
        out.off();
        out.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,null,5679,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_stringToOutputStream_Encoding_literalMutation6737() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_Encoding_literalMutation6737");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str, out, "UTF16");
        out.off();
        out.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "foo").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,null,5679,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_stringToOutputStream_Encoding_literalMutation6738() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_Encoding_literalMutation6738");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str, out, "UTF16");
        out.off();
        out.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,null,5679,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToOutputStream_Encoding_remove1497() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_Encoding_remove1497");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        out.off();
        out.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,null,5679,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToOutputStream_Encoding_remove1498() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_Encoding_remove1498");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str, out, "UTF16");
        out.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,null,5679,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToOutputStream_Encoding_remove1499() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_Encoding_remove1499");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str, out, "UTF16");
        out.off();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,null,5679,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToOutputStream_Encoding_nullData_add2050() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_Encoding_nullData_add2050");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(((String)(null)), out);
        IOUtils.write(((String)(null)), out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5682,baout,5681,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToOutputStream_Encoding_nullData_add2051() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_Encoding_nullData_add2051");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(((String)(null)), out);
        out.off();
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5682,baout,5681,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToOutputStream_Encoding_nullData_add2052() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_Encoding_nullData_add2052");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(((String)(null)), out);
        out.off();
        out.flush();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5682,baout,5681,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_stringToOutputStream_Encoding_nullData() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_Encoding_nullData");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.write(((String)(null)), out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5682,baout,5681,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_stringToOutputStream_Encoding_nullData_literalMutation6740() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_Encoding_nullData_literalMutation6740");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        IOUtils.write(((String)(null)), out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5682,baout,5681,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToOutputStream_Encoding_nullData_remove1500() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_Encoding_nullData_remove1500");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5682,baout,5681,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToOutputStream_Encoding_nullData_remove1501() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_Encoding_nullData_remove1501");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(((String)(null)), out);
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5682,baout,5681,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToOutputStream_Encoding_nullData_remove1502() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_Encoding_nullData_remove1502");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(((String)(null)), out);
        out.off();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5682,baout,5681,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToOutputStream_Encoding_nullStream_add2053() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_Encoding_nullStream_add2053");
        String str = new String(inData , "US-ASCII");
        try {
            IOUtils.write(str, ((java.io.OutputStream)(null)));
            IOUtils.write(str, ((java.io.OutputStream)(null)));
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_stringToOutputStream_Encoding_nullStream() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_Encoding_nullStream");
        String str = new String(inData , "bar");
        try {
            IOUtils.write(str, ((java.io.OutputStream)(null)));
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToOutputStream_nullEncoding_add2057() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_nullEncoding_add2057");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str, out, ((String)(null)));
        IOUtils.write(str, out, ((String)(null)));
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5690,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5692,baout,5691,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5694,null,5693,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToOutputStream_nullEncoding_add2058() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_nullEncoding_add2058");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str, out, ((String)(null)));
        out.off();
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5690,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5692,baout,5691,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5694,null,5693,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToOutputStream_nullEncoding_add2059() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_nullEncoding_add2059");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str, out, ((String)(null)));
        out.off();
        out.flush();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5690,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5692,baout,5691,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5694,null,5693,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_stringToOutputStream_nullEncoding() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_nullEncoding");
        String str = new String(inData , "bar");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str, out, ((String)(null)));
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5690,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5692,baout,5691,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5694,null,5693,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_stringToOutputStream_nullEncoding_literalMutation6748() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_nullEncoding_literalMutation6748");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.write(str, out, ((String)(null)));
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5690,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5692,baout,5691,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5694,null,5693,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_stringToOutputStream_nullEncoding_literalMutation6749() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_nullEncoding_literalMutation6749");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        IOUtils.write(str, out, ((String)(null)));
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5690,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5692,baout,5691,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5694,null,5693,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToOutputStream_nullEncoding_remove1506() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_nullEncoding_remove1506");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5690,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5692,baout,5691,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5694,null,5693,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToOutputStream_nullEncoding_remove1507() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_nullEncoding_remove1507");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str, out, ((String)(null)));
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5690,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5692,baout,5691,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5694,null,5693,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToOutputStream_nullEncoding_remove1508() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToOutputStream_nullEncoding_remove1508");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str, out, ((String)(null)));
        out.off();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5690,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5692,baout,5691,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5694,null,5693,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToWriter_add2061() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToWriter_add2061");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(str, writer);
        IOUtils.write(str, writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5697,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5699,baout,5698,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5701,null,5700,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToWriter_add2062() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToWriter_add2062");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(str, writer);
        out.off();
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5697,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5699,baout,5698,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5701,null,5700,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToWriter_add2063() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToWriter_add2063");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(str, writer);
        out.off();
        writer.flush();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5697,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5699,baout,5698,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5701,null,5700,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_stringToWriter() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToWriter");
        String str = new String(inData , "foo");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(str, writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5697,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5699,baout,5698,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5701,null,5700,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_stringToWriter_literalMutation6754() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToWriter_literalMutation6754");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(str, writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5697,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5699,baout,5698,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5701,null,5700,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_stringToWriter_literalMutation6755() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToWriter_literalMutation6755");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(str, writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5697,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5699,baout,5698,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5701,null,5700,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_stringToWriter_literalMutation6756() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToWriter_literalMutation6756");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "foo");
        IOUtils.write(str, writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5697,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5699,baout,5698,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5701,null,5700,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToWriter_remove1509() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToWriter_remove1509");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5697,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5699,baout,5698,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5701,null,5700,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToWriter_remove1510() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToWriter_remove1510");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(str, writer);
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5697,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5699,baout,5698,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5701,null,5700,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToWriter_remove1511() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToWriter_remove1511");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(str, writer);
        out.off();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5697,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5699,baout,5698,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5701,null,5700,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToWriter_Encoding_nullData_add2064() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToWriter_Encoding_nullData_add2064");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(((String)(null)), writer);
        IOUtils.write(((String)(null)), writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5696,baout,5695,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToWriter_Encoding_nullData_add2065() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToWriter_Encoding_nullData_add2065");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(((String)(null)), writer);
        out.off();
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5696,baout,5695,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToWriter_Encoding_nullData_add2066() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToWriter_Encoding_nullData_add2066");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(((String)(null)), writer);
        out.off();
        writer.flush();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5696,baout,5695,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_stringToWriter_Encoding_nullData() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToWriter_Encoding_nullData");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(((String)(null)), writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5696,baout,5695,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_stringToWriter_Encoding_nullData_literalMutation6758() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToWriter_Encoding_nullData_literalMutation6758");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(((String)(null)), writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5696,baout,5695,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_stringToWriter_Encoding_nullData_literalMutation6759() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToWriter_Encoding_nullData_literalMutation6759");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "bar");
        IOUtils.write(((String)(null)), writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5696,baout,5695,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToWriter_Encoding_nullData_remove1512() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToWriter_Encoding_nullData_remove1512");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5696,baout,5695,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToWriter_Encoding_nullData_remove1513() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToWriter_Encoding_nullData_remove1513");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(((String)(null)), writer);
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5696,baout,5695,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToWriter_Encoding_nullData_remove1514() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToWriter_Encoding_nullData_remove1514");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(((String)(null)), writer);
        out.off();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5696,baout,5695,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_stringToWriter_Encoding_nullStream_add2067() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToWriter_Encoding_nullStream_add2067");
        String str = new String(inData , "US-ASCII");
        try {
            IOUtils.write(str, ((Writer)(null)));
            IOUtils.write(str, ((Writer)(null)));
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_stringToWriter_Encoding_nullStream() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_stringToWriter_Encoding_nullStream");
        String str = new String(inData , "bar");
        try {
            IOUtils.write(str, ((Writer)(null)));
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToOutputStream_add1996() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_add1996");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str.toCharArray(), out);
        IOUtils.write(str.toCharArray(), out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5644,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5646,baout,5645,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5648,null,5647,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToOutputStream_add1997() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_add1997");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str.toCharArray(), out);
        out.off();
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5644,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5646,baout,5645,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5648,null,5647,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToOutputStream_add1998() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_add1998");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str.toCharArray(), out);
        out.off();
        out.flush();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5644,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5646,baout,5645,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5648,null,5647,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charArrayToOutputStream() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream");
        String str = new String(inData , "bar");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str.toCharArray(), out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5644,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5646,baout,5645,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5648,null,5647,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charArrayToOutputStream_literalMutation6665() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_literalMutation6665");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.write(str.toCharArray(), out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5644,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5646,baout,5645,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5648,null,5647,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charArrayToOutputStream_literalMutation6666() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_literalMutation6666");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        IOUtils.write(str.toCharArray(), out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5644,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5646,baout,5645,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5648,null,5647,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToOutputStream_remove1452() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_remove1452");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5644,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5646,baout,5645,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5648,null,5647,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToOutputStream_remove1453() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_remove1453");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str.toCharArray(), out);
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5644,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5646,baout,5645,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5648,null,5647,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToOutputStream_remove1454() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_remove1454");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str.toCharArray(), out);
        out.off();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5644,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5646,baout,5645,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5648,null,5647,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToOutputStream_nullData_add2006() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_nullData_add2006");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(((char[])(null)), out);
        IOUtils.write(((char[])(null)), out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5650,baout,5649,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToOutputStream_nullData_add2007() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_nullData_add2007");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(((char[])(null)), out);
        out.off();
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5650,baout,5649,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToOutputStream_nullData_add2008() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_nullData_add2008");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(((char[])(null)), out);
        out.off();
        out.flush();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5650,baout,5649,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charArrayToOutputStream_nullData() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_nullData");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.write(((char[])(null)), out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5650,baout,5649,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charArrayToOutputStream_nullData_literalMutation6679() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_nullData_literalMutation6679");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        IOUtils.write(((char[])(null)), out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5650,baout,5649,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToOutputStream_nullData_remove1461() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_nullData_remove1461");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5650,baout,5649,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToOutputStream_nullData_remove1462() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_nullData_remove1462");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(((char[])(null)), out);
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5650,baout,5649,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToOutputStream_nullData_remove1463() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_nullData_remove1463");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(((char[])(null)), out);
        out.off();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5650,baout,5649,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToOutputStream_nullStream_add2012() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_nullStream_add2012");
        String str = new String(inData , "US-ASCII");
        try {
            IOUtils.write(str.toCharArray(), ((java.io.OutputStream)(null)));
            IOUtils.write(str.toCharArray(), ((java.io.OutputStream)(null)));
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charArrayToOutputStream_nullStream() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_nullStream");
        String str = new String(inData , "foo");
        try {
            IOUtils.write(str.toCharArray(), ((java.io.OutputStream)(null)));
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToOutputStream_Encoding_add1999() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_Encoding_add1999");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str.toCharArray(), out, "UTF16");
        IOUtils.write(str.toCharArray(), out, "UTF16");
        out.off();
        out.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5641,null,5640,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToOutputStream_Encoding_add2000() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_Encoding_add2000");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str.toCharArray(), out, "UTF16");
        out.off();
        out.off();
        out.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5641,null,5640,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToOutputStream_Encoding_add2001() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_Encoding_add2001");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str.toCharArray(), out, "UTF16");
        out.off();
        out.flush();
        out.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5641,null,5640,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charArrayToOutputStream_Encoding() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_Encoding");
        String str = new String(inData , "bar");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str.toCharArray(), out, "UTF16");
        out.off();
        out.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5641,null,5640,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charArrayToOutputStream_Encoding_literalMutation6668() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_Encoding_literalMutation6668");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.write(str.toCharArray(), out, "UTF16");
        out.off();
        out.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5641,null,5640,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charArrayToOutputStream_Encoding_literalMutation6669() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_Encoding_literalMutation6669");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        IOUtils.write(str.toCharArray(), out, "UTF16");
        out.off();
        out.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5641,null,5640,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charArrayToOutputStream_Encoding_literalMutation6670() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_Encoding_literalMutation6670");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str.toCharArray(), out, "bar");
        out.off();
        out.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5641,null,5640,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charArrayToOutputStream_Encoding_literalMutation6671() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_Encoding_literalMutation6671");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str.toCharArray(), out, "UTF16");
        out.off();
        out.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "foo").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5641,null,5640,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charArrayToOutputStream_Encoding_literalMutation6672() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_Encoding_literalMutation6672");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str.toCharArray(), out, "UTF16");
        out.off();
        out.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5641,null,5640,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToOutputStream_Encoding_remove1455() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_Encoding_remove1455");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        out.off();
        out.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5641,null,5640,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToOutputStream_Encoding_remove1456() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_Encoding_remove1456");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str.toCharArray(), out, "UTF16");
        out.flush();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5641,null,5640,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToOutputStream_Encoding_remove1457() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_Encoding_remove1457");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str.toCharArray(), out, "UTF16");
        out.off();
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5641,null,5640,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToOutputStream_Encoding_nullData_add2002() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_Encoding_nullData_add2002");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(((char[])(null)), out);
        IOUtils.write(((char[])(null)), out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,baout,5642,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToOutputStream_Encoding_nullData_add2003() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_Encoding_nullData_add2003");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(((char[])(null)), out);
        out.off();
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,baout,5642,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToOutputStream_Encoding_nullData_add2004() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_Encoding_nullData_add2004");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(((char[])(null)), out);
        out.off();
        out.flush();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,baout,5642,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charArrayToOutputStream_Encoding_nullData() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_Encoding_nullData");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.write(((char[])(null)), out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,baout,5642,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charArrayToOutputStream_Encoding_nullData_literalMutation6674() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_Encoding_nullData_literalMutation6674");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        IOUtils.write(((char[])(null)), out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,baout,5642,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToOutputStream_Encoding_nullData_remove1458() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_Encoding_nullData_remove1458");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,baout,5642,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToOutputStream_Encoding_nullData_remove1459() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_Encoding_nullData_remove1459");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(((char[])(null)), out);
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,baout,5642,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToOutputStream_Encoding_nullData_remove1460() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_Encoding_nullData_remove1460");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(((char[])(null)), out);
        out.off();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,baout,5642,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToOutputStream_Encoding_nullStream_add2005() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_Encoding_nullStream_add2005");
        String str = new String(inData , "US-ASCII");
        try {
            IOUtils.write(str.toCharArray(), ((java.io.OutputStream)(null)));
            IOUtils.write(str.toCharArray(), ((java.io.OutputStream)(null)));
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charArrayToOutputStream_Encoding_nullStream() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_Encoding_nullStream");
        String str = new String(inData , "foo");
        try {
            IOUtils.write(str.toCharArray(), ((java.io.OutputStream)(null)));
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToOutputStream_nullEncoding_add2009() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_nullEncoding_add2009");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str.toCharArray(), out, ((String)(null)));
        IOUtils.write(str.toCharArray(), out, ((String)(null)));
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5651,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5653,baout,5652,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5655,null,5654,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToOutputStream_nullEncoding_add2010() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_nullEncoding_add2010");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str.toCharArray(), out, ((String)(null)));
        out.off();
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5651,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5653,baout,5652,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5655,null,5654,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToOutputStream_nullEncoding_add2011() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_nullEncoding_add2011");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str.toCharArray(), out, ((String)(null)));
        out.off();
        out.flush();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5651,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5653,baout,5652,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5655,null,5654,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charArrayToOutputStream_nullEncoding() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_nullEncoding");
        String str = new String(inData , "bar");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str.toCharArray(), out, ((String)(null)));
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5651,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5653,baout,5652,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5655,null,5654,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charArrayToOutputStream_nullEncoding_literalMutation6682() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_nullEncoding_literalMutation6682");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.write(str.toCharArray(), out, ((String)(null)));
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5651,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5653,baout,5652,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5655,null,5654,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charArrayToOutputStream_nullEncoding_literalMutation6683() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_nullEncoding_literalMutation6683");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        IOUtils.write(str.toCharArray(), out, ((String)(null)));
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5651,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5653,baout,5652,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5655,null,5654,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToOutputStream_nullEncoding_remove1464() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_nullEncoding_remove1464");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5651,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5653,baout,5652,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5655,null,5654,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToOutputStream_nullEncoding_remove1465() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_nullEncoding_remove1465");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str.toCharArray(), out, ((String)(null)));
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5651,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5653,baout,5652,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5655,null,5654,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToOutputStream_nullEncoding_remove1466() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToOutputStream_nullEncoding_remove1466");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.write(str.toCharArray(), out, ((String)(null)));
        out.off();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5651,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5653,baout,5652,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5655,null,5654,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToWriter_add2013() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToWriter_add2013");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(str.toCharArray(), writer);
        IOUtils.write(str.toCharArray(), writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5658,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5660,baout,5659,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5662,null,5661,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToWriter_add2014() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToWriter_add2014");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(str.toCharArray(), writer);
        out.off();
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5658,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5660,baout,5659,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5662,null,5661,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToWriter_add2015() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToWriter_add2015");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(str.toCharArray(), writer);
        out.off();
        writer.flush();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5658,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5660,baout,5659,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5662,null,5661,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charArrayToWriter() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToWriter");
        String str = new String(inData , "foo");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(str.toCharArray(), writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5658,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5660,baout,5659,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5662,null,5661,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charArrayToWriter_literalMutation6688() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToWriter_literalMutation6688");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(str.toCharArray(), writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5658,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5660,baout,5659,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5662,null,5661,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charArrayToWriter_literalMutation6689() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToWriter_literalMutation6689");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(str.toCharArray(), writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5658,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5660,baout,5659,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5662,null,5661,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charArrayToWriter_literalMutation6690() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToWriter_literalMutation6690");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "bar");
        IOUtils.write(str.toCharArray(), writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5658,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5660,baout,5659,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5662,null,5661,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToWriter_remove1467() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToWriter_remove1467");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5658,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5660,baout,5659,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5662,null,5661,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToWriter_remove1468() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToWriter_remove1468");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(str.toCharArray(), writer);
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5658,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5660,baout,5659,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5662,null,5661,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToWriter_remove1469() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToWriter_remove1469");
        String str = new String(inData , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(str.toCharArray(), writer);
        out.off();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5658,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5660,baout,5659,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5662,null,5661,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToWriter_Encoding_nullData_add2016() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToWriter_Encoding_nullData_add2016");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(((char[])(null)), writer);
        IOUtils.write(((char[])(null)), writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5657,baout,5656,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToWriter_Encoding_nullData_add2017() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToWriter_Encoding_nullData_add2017");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(((char[])(null)), writer);
        out.off();
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5657,baout,5656,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToWriter_Encoding_nullData_add2018() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToWriter_Encoding_nullData_add2018");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(((char[])(null)), writer);
        out.off();
        writer.flush();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5657,baout,5656,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charArrayToWriter_Encoding_nullData() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToWriter_Encoding_nullData");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(((char[])(null)), writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5657,baout,5656,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charArrayToWriter_Encoding_nullData_literalMutation6692() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToWriter_Encoding_nullData_literalMutation6692");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(((char[])(null)), writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5657,baout,5656,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charArrayToWriter_Encoding_nullData_literalMutation6693() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToWriter_Encoding_nullData_literalMutation6693");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "foo");
        IOUtils.write(((char[])(null)), writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5657,baout,5656,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToWriter_Encoding_nullData_remove1470() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToWriter_Encoding_nullData_remove1470");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5657,baout,5656,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToWriter_Encoding_nullData_remove1471() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToWriter_Encoding_nullData_remove1471");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(((char[])(null)), writer);
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5657,baout,5656,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToWriter_Encoding_nullData_remove1472() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToWriter_Encoding_nullData_remove1472");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.write(((char[])(null)), writer);
        out.off();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5657,baout,5656,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charArrayToWriter_Encoding_nullStream() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToWriter_Encoding_nullStream");
        String str = new String(inData , "US-ASCII");
        try {
            IOUtils.write(str.toCharArray(), ((Writer)(null)));
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrite_charArrayToWriter_Encoding_nullStream_add2019() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToWriter_Encoding_nullStream_add2019");
        String str = new String(inData , "US-ASCII");
        try {
            IOUtils.write(str.toCharArray(), ((Writer)(null)));
            IOUtils.write(str.toCharArray(), ((Writer)(null)));
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrite_charArrayToWriter_Encoding_nullStream_literalMutation6695() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrite_charArrayToWriter_Encoding_nullStream_literalMutation6695");
        String str = new String(inData , "bar");
        try {
            IOUtils.write(str.toCharArray(), ((Writer)(null)));
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_add1939() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_add1939");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "*", out);
        IOUtils.writeLines(list, "*", out);
        out.off();
        out.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5606,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_add1940() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_add1940");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "*", out);
        out.off();
        out.off();
        out.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5606,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_add1941() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_add1941");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "*", out);
        out.off();
        out.flush();
        out.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5606,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream");
        Object[] data = new Object[]{ "foo" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "*", out);
        out.off();
        out.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5606,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_literalMutation6540() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_literalMutation6540");
        Object[] data = new Object[]{ "hello" , new StringBuffer("bar") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "*", out);
        out.off();
        out.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5606,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_literalMutation6541() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_literalMutation6541");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "bar" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "*", out);
        out.off();
        out.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5606,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_literalMutation6542() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_literalMutation6542");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "" , "bar" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "*", out);
        out.off();
        out.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5606,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_literalMutation6544() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_literalMutation6544");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "" , "this is" , null , "bar" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "*", out);
        out.off();
        out.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5606,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_literalMutation6545() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_literalMutation6545");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.writeLines(list, "*", out);
        out.off();
        out.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5606,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_literalMutation6546() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_literalMutation6546");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , false);
        IOUtils.writeLines(list, "*", out);
        out.off();
        out.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5606,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_literalMutation6547() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_literalMutation6547");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "bar", out);
        out.off();
        out.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5606,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_literalMutation6548() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_literalMutation6548");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "*", out);
        out.off();
        out.flush();
        String expected = "foo";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5606,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_remove1401() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_remove1401");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        out.off();
        out.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5606,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_remove1402() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_remove1402");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "*", out);
        out.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5606,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_remove1403() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_remove1403");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "*", out);
        out.off();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5606,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_nullData_add1955() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_nullData_add1955");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(((List<?>)(null)), "*", out);
        IOUtils.writeLines(((List<?>)(null)), "*", out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5608,baout,5607,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_nullData_add1956() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_nullData_add1956");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(((List<?>)(null)), "*", out);
        out.off();
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5608,baout,5607,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_nullData_add1957() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_nullData_add1957");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(((List<?>)(null)), "*", out);
        out.off();
        out.flush();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5608,baout,5607,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_nullData() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_nullData");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.writeLines(((List<?>)(null)), "*", out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5608,baout,5607,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_nullData_literalMutation6591() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_nullData_literalMutation6591");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , false);
        IOUtils.writeLines(((List<?>)(null)), "*", out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5608,baout,5607,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_nullData_literalMutation6593() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_nullData_literalMutation6593");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(((List<?>)(null)), "bar", out);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5608,baout,5607,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_nullData_remove1416() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_nullData_remove1416");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5608,baout,5607,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_nullData_remove1417() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_nullData_remove1417");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(((List<?>)(null)), "*", out);
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5608,baout,5607,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_nullData_remove1418() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_nullData_remove1418");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(((List<?>)(null)), "*", out);
        out.off();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5608,baout,5607,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_nullSeparator_add1958() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_nullSeparator_add1958");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, ((String)(null)), out);
        IOUtils.writeLines(list, ((String)(null)), out);
        out.off();
        out.flush();
        String expected = (("hello" + (IOUtils.LINE_SEPARATOR)) + "world") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5610,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_nullSeparator_add1959() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_nullSeparator_add1959");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, ((String)(null)), out);
        out.off();
        out.off();
        out.flush();
        String expected = (("hello" + (IOUtils.LINE_SEPARATOR)) + "world") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5610,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_nullSeparator_add1960() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_nullSeparator_add1960");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, ((String)(null)), out);
        out.off();
        out.flush();
        out.flush();
        String expected = (("hello" + (IOUtils.LINE_SEPARATOR)) + "world") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5610,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_nullSeparator() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_nullSeparator");
        Object[] data = new Object[]{ "foo" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, ((String)(null)), out);
        out.off();
        out.flush();
        String expected = (("hello" + (IOUtils.LINE_SEPARATOR)) + "world") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5610,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_nullSeparator_literalMutation6595() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_nullSeparator_literalMutation6595");
        Object[] data = new Object[]{ "hello" , "bar" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, ((String)(null)), out);
        out.off();
        out.flush();
        String expected = (("hello" + (IOUtils.LINE_SEPARATOR)) + "world") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5610,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_nullSeparator_literalMutation6596() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_nullSeparator_literalMutation6596");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.writeLines(list, ((String)(null)), out);
        out.off();
        out.flush();
        String expected = (("hello" + (IOUtils.LINE_SEPARATOR)) + "world") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5610,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_nullSeparator_literalMutation6597() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_nullSeparator_literalMutation6597");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , false);
        IOUtils.writeLines(list, ((String)(null)), out);
        out.off();
        out.flush();
        String expected = (("hello" + (IOUtils.LINE_SEPARATOR)) + "world") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5610,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_nullSeparator_literalMutation6599() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_nullSeparator_literalMutation6599");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, ((String)(null)), out);
        out.off();
        out.flush();
        String expected = (("foo" + (IOUtils.LINE_SEPARATOR)) + "world") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5610,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_nullSeparator_literalMutation6600() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_nullSeparator_literalMutation6600");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, ((String)(null)), out);
        out.off();
        out.flush();
        String expected = (("hello" + (IOUtils.LINE_SEPARATOR)) + "foo") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5610,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_nullSeparator_remove1419() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_nullSeparator_remove1419");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        out.off();
        out.flush();
        String expected = (("hello" + (IOUtils.LINE_SEPARATOR)) + "world") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5610,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_nullSeparator_remove1420() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_nullSeparator_remove1420");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, ((String)(null)), out);
        out.flush();
        String expected = (("hello" + (IOUtils.LINE_SEPARATOR)) + "world") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5610,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_nullSeparator_remove1421() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_nullSeparator_remove1421");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, ((String)(null)), out);
        out.off();
        String expected = (("hello" + (IOUtils.LINE_SEPARATOR)) + "world") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5610,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_nullStream_add1961() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_nullStream_add1961");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        try {
            IOUtils.writeLines(list, "*", ((java.io.OutputStream)(null)));
            IOUtils.writeLines(list, "*", ((java.io.OutputStream)(null)));
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_nullStream() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_nullStream");
        Object[] data = new Object[]{ "bar" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        try {
            IOUtils.writeLines(list, "*", ((java.io.OutputStream)(null)));
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_nullStream_literalMutation6602() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_nullStream_literalMutation6602");
        Object[] data = new Object[]{ "hello" , "foo" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        try {
            IOUtils.writeLines(list, "*", ((java.io.OutputStream)(null)));
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_nullStream_literalMutation6603() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_nullStream_literalMutation6603");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        try {
            IOUtils.writeLines(list, "foo", ((java.io.OutputStream)(null)));
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_Encoding_add1942() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_add1942");
        Object[] data = new Object[]{ "hello荤" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "*", out, "UTF-8");
        IOUtils.writeLines(list, "*", out, "UTF-8");
        out.off();
        out.flush();
        String expected = "hello荤*world**this is**some text*";
        String actual = baout.toString("UTF-8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5598,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_Encoding_add1943() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_add1943");
        Object[] data = new Object[]{ "hello荤" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "*", out, "UTF-8");
        out.off();
        out.off();
        out.flush();
        String expected = "hello荤*world**this is**some text*";
        String actual = baout.toString("UTF-8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5598,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_Encoding_add1944() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_add1944");
        Object[] data = new Object[]{ "hello荤" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "*", out, "UTF-8");
        out.off();
        out.flush();
        out.flush();
        String expected = "hello荤*world**this is**some text*";
        String actual = baout.toString("UTF-8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5598,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_Encoding() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding");
        Object[] data = new Object[]{ "foo" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "*", out, "UTF-8");
        out.off();
        out.flush();
        String expected = "hello荤*world**this is**some text*";
        String actual = baout.toString("UTF-8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5598,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_Encoding_literalMutation6550() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_literalMutation6550");
        Object[] data = new Object[]{ "hello荤" , new StringBuffer("bar") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "*", out, "UTF-8");
        out.off();
        out.flush();
        String expected = "hello荤*world**this is**some text*";
        String actual = baout.toString("UTF-8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5598,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_Encoding_literalMutation6551() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_literalMutation6551");
        Object[] data = new Object[]{ "hello荤" , new StringBuffer("world") , "foo" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "*", out, "UTF-8");
        out.off();
        out.flush();
        String expected = "hello荤*world**this is**some text*";
        String actual = baout.toString("UTF-8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5598,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_Encoding_literalMutation6552() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_literalMutation6552");
        Object[] data = new Object[]{ "hello荤" , new StringBuffer("world") , "" , "foo" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "*", out, "UTF-8");
        out.off();
        out.flush();
        String expected = "hello荤*world**this is**some text*";
        String actual = baout.toString("UTF-8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5598,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_Encoding_literalMutation6554() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_literalMutation6554");
        Object[] data = new Object[]{ "hello荤" , new StringBuffer("world") , "" , "this is" , null , "foo" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "*", out, "UTF-8");
        out.off();
        out.flush();
        String expected = "hello荤*world**this is**some text*";
        String actual = baout.toString("UTF-8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5598,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_Encoding_literalMutation6555() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_literalMutation6555");
        Object[] data = new Object[]{ "hello荤" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.writeLines(list, "*", out, "UTF-8");
        out.off();
        out.flush();
        String expected = "hello荤*world**this is**some text*";
        String actual = baout.toString("UTF-8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5598,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_Encoding_literalMutation6556() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_literalMutation6556");
        Object[] data = new Object[]{ "hello荤" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , false);
        IOUtils.writeLines(list, "*", out, "UTF-8");
        out.off();
        out.flush();
        String expected = "hello荤*world**this is**some text*";
        String actual = baout.toString("UTF-8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5598,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_Encoding_literalMutation6557() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_literalMutation6557");
        Object[] data = new Object[]{ "hello荤" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "bar", out, "UTF-8");
        out.off();
        out.flush();
        String expected = "hello荤*world**this is**some text*";
        String actual = baout.toString("UTF-8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5598,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_Encoding_literalMutation6558() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_literalMutation6558");
        Object[] data = new Object[]{ "hello荤" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "*", out, "bar");
        out.off();
        out.flush();
        String expected = "hello荤*world**this is**some text*";
        String actual = baout.toString("UTF-8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5598,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_Encoding_literalMutation6559() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_literalMutation6559");
        Object[] data = new Object[]{ "hello荤" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "*", out, "UTF-8");
        out.off();
        out.flush();
        String expected = "bar";
        String actual = baout.toString("UTF-8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5598,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_Encoding_literalMutation6560() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_literalMutation6560");
        Object[] data = new Object[]{ "hello荤" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "*", out, "UTF-8");
        out.off();
        out.flush();
        String expected = "hello荤*world**this is**some text*";
        String actual = baout.toString("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5598,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_Encoding_remove1404() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_remove1404");
        Object[] data = new Object[]{ "hello荤" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        out.off();
        out.flush();
        String expected = "hello荤*world**this is**some text*";
        String actual = baout.toString("UTF-8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5598,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_Encoding_remove1405() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_remove1405");
        Object[] data = new Object[]{ "hello荤" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "*", out, "UTF-8");
        out.flush();
        String expected = "hello荤*world**this is**some text*";
        String actual = baout.toString("UTF-8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5598,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_Encoding_remove1406() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_remove1406");
        Object[] data = new Object[]{ "hello荤" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "*", out, "UTF-8");
        out.off();
        String expected = "hello荤*world**this is**some text*";
        String actual = baout.toString("UTF-8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5598,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_Encoding_nullData_add1945() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullData_add1945");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(((List<?>)(null)), "*", out, "US-ASCII");
        IOUtils.writeLines(((List<?>)(null)), "*", out, "US-ASCII");
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5600,baout,5599,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_Encoding_nullData_add1946() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullData_add1946");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(((List<?>)(null)), "*", out, "US-ASCII");
        out.off();
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5600,baout,5599,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_Encoding_nullData_add1947() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullData_add1947");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(((List<?>)(null)), "*", out, "US-ASCII");
        out.off();
        out.flush();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5600,baout,5599,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_Encoding_nullData() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullData");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.writeLines(((List<?>)(null)), "*", out, "US-ASCII");
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5600,baout,5599,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_Encoding_nullData_literalMutation6562() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullData_literalMutation6562");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , false);
        IOUtils.writeLines(((List<?>)(null)), "*", out, "US-ASCII");
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5600,baout,5599,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_Encoding_nullData_literalMutation6564() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullData_literalMutation6564");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(((List<?>)(null)), "foo", out, "US-ASCII");
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5600,baout,5599,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_Encoding_nullData_literalMutation6565() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullData_literalMutation6565");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(((List<?>)(null)), "*", out, "foo");
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5600,baout,5599,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_Encoding_nullData_remove1407() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullData_remove1407");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        out.off();
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5600,baout,5599,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_Encoding_nullData_remove1408() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullData_remove1408");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(((List<?>)(null)), "*", out, "US-ASCII");
        out.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5600,baout,5599,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_Encoding_nullData_remove1409() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullData_remove1409");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(((List<?>)(null)), "*", out, "US-ASCII");
        out.off();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5600,baout,5599,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_Encoding_nullSeparator_add1951() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullSeparator_add1951");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, ((String)(null)), out, "US-ASCII");
        IOUtils.writeLines(list, ((String)(null)), out, "US-ASCII");
        out.off();
        out.flush();
        String expected = (("hello" + (IOUtils.LINE_SEPARATOR)) + "world") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5604,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_Encoding_nullSeparator_add1952() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullSeparator_add1952");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, ((String)(null)), out, "US-ASCII");
        out.off();
        out.off();
        out.flush();
        String expected = (("hello" + (IOUtils.LINE_SEPARATOR)) + "world") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5604,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_Encoding_nullSeparator_add1953() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullSeparator_add1953");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, ((String)(null)), out, "US-ASCII");
        out.off();
        out.flush();
        out.flush();
        String expected = (("hello" + (IOUtils.LINE_SEPARATOR)) + "world") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5604,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_Encoding_nullSeparator() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullSeparator");
        Object[] data = new Object[]{ "foo" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, ((String)(null)), out, "US-ASCII");
        out.off();
        out.flush();
        String expected = (("hello" + (IOUtils.LINE_SEPARATOR)) + "world") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5604,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_Encoding_nullSeparator_literalMutation6578() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullSeparator_literalMutation6578");
        Object[] data = new Object[]{ "hello" , "bar" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, ((String)(null)), out, "US-ASCII");
        out.off();
        out.flush();
        String expected = (("hello" + (IOUtils.LINE_SEPARATOR)) + "world") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5604,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_Encoding_nullSeparator_literalMutation6579() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullSeparator_literalMutation6579");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.writeLines(list, ((String)(null)), out, "US-ASCII");
        out.off();
        out.flush();
        String expected = (("hello" + (IOUtils.LINE_SEPARATOR)) + "world") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5604,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_Encoding_nullSeparator_literalMutation6580() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullSeparator_literalMutation6580");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , false);
        IOUtils.writeLines(list, ((String)(null)), out, "US-ASCII");
        out.off();
        out.flush();
        String expected = (("hello" + (IOUtils.LINE_SEPARATOR)) + "world") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5604,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_Encoding_nullSeparator_literalMutation6582() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullSeparator_literalMutation6582");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, ((String)(null)), out, "bar");
        out.off();
        out.flush();
        String expected = (("hello" + (IOUtils.LINE_SEPARATOR)) + "world") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5604,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_Encoding_nullSeparator_literalMutation6583() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullSeparator_literalMutation6583");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, ((String)(null)), out, "US-ASCII");
        out.off();
        out.flush();
        String expected = (("foo" + (IOUtils.LINE_SEPARATOR)) + "world") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5604,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_Encoding_nullSeparator_literalMutation6584() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullSeparator_literalMutation6584");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, ((String)(null)), out, "US-ASCII");
        out.off();
        out.flush();
        String expected = (("hello" + (IOUtils.LINE_SEPARATOR)) + "foo") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5604,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_Encoding_nullSeparator_remove1413() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullSeparator_remove1413");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        out.off();
        out.flush();
        String expected = (("hello" + (IOUtils.LINE_SEPARATOR)) + "world") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5604,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_Encoding_nullSeparator_remove1414() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullSeparator_remove1414");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, ((String)(null)), out, "US-ASCII");
        out.flush();
        String expected = (("hello" + (IOUtils.LINE_SEPARATOR)) + "world") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5604,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_Encoding_nullSeparator_remove1415() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullSeparator_remove1415");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, ((String)(null)), out, "US-ASCII");
        out.off();
        String expected = (("hello" + (IOUtils.LINE_SEPARATOR)) + "world") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5604,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_Encoding_nullStream_add1954() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullStream_add1954");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        try {
            IOUtils.writeLines(list, "*", ((java.io.OutputStream)(null)), "US-ASCII");
            IOUtils.writeLines(list, "*", ((java.io.OutputStream)(null)), "US-ASCII");
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_Encoding_nullStream() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullStream");
        Object[] data = new Object[]{ "bar" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        try {
            IOUtils.writeLines(list, "*", ((java.io.OutputStream)(null)), "US-ASCII");
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_Encoding_nullStream_literalMutation6586() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullStream_literalMutation6586");
        Object[] data = new Object[]{ "hello" , "bar" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        try {
            IOUtils.writeLines(list, "*", ((java.io.OutputStream)(null)), "US-ASCII");
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_Encoding_nullStream_literalMutation6587() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullStream_literalMutation6587");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        try {
            IOUtils.writeLines(list, "bar", ((java.io.OutputStream)(null)), "US-ASCII");
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_Encoding_nullStream_literalMutation6589() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullStream_literalMutation6589");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        try {
            IOUtils.writeLines(list, "*", ((java.io.OutputStream)(null)), "bar");
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_Encoding_nullEncoding_add1948() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullEncoding_add1948");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "*", out, ((String)(null)));
        IOUtils.writeLines(list, "*", out, ((String)(null)));
        out.off();
        out.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5602,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_Encoding_nullEncoding_add1949() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullEncoding_add1949");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "*", out, ((String)(null)));
        out.off();
        out.off();
        out.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5602,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_Encoding_nullEncoding_add1950() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullEncoding_add1950");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "*", out, ((String)(null)));
        out.off();
        out.flush();
        out.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5602,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_Encoding_nullEncoding() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullEncoding");
        Object[] data = new Object[]{ "bar" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "*", out, ((String)(null)));
        out.off();
        out.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5602,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_Encoding_nullEncoding_literalMutation6567() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullEncoding_literalMutation6567");
        Object[] data = new Object[]{ "hello" , new StringBuffer("bar") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "*", out, ((String)(null)));
        out.off();
        out.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5602,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_Encoding_nullEncoding_literalMutation6568() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullEncoding_literalMutation6568");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "foo" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "*", out, ((String)(null)));
        out.off();
        out.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5602,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_Encoding_nullEncoding_literalMutation6569() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullEncoding_literalMutation6569");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "" , "bar" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "*", out, ((String)(null)));
        out.off();
        out.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5602,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_Encoding_nullEncoding_literalMutation6571() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullEncoding_literalMutation6571");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "" , "this is" , null , "foo" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "*", out, ((String)(null)));
        out.off();
        out.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5602,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_Encoding_nullEncoding_literalMutation6572() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullEncoding_literalMutation6572");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        IOUtils.writeLines(list, "*", out, ((String)(null)));
        out.off();
        out.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5602,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_Encoding_nullEncoding_literalMutation6573() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullEncoding_literalMutation6573");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , false);
        IOUtils.writeLines(list, "*", out, ((String)(null)));
        out.off();
        out.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5602,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_Encoding_nullEncoding_literalMutation6574() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullEncoding_literalMutation6574");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "bar", out, ((String)(null)));
        out.off();
        out.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5602,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_OutputStream_Encoding_nullEncoding_literalMutation6576() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullEncoding_literalMutation6576");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "*", out, ((String)(null)));
        out.off();
        out.flush();
        String expected = "foo";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5602,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_Encoding_nullEncoding_remove1410() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullEncoding_remove1410");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        out.off();
        out.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5602,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_Encoding_nullEncoding_remove1411() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullEncoding_remove1411");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "*", out, ((String)(null)));
        out.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5602,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_OutputStream_Encoding_nullEncoding_remove1412() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_OutputStream_Encoding_nullEncoding_remove1412");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        IOUtils.writeLines(list, "*", out, ((String)(null)));
        out.off();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5602,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_Writer_add1962() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_add1962");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.writeLines(list, "*", writer);
        IOUtils.writeLines(list, "*", writer);
        out.off();
        writer.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5612,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_Writer_add1963() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_add1963");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.writeLines(list, "*", writer);
        out.off();
        out.off();
        writer.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5612,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_Writer_add1964() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_add1964");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.writeLines(list, "*", writer);
        out.off();
        writer.flush();
        writer.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5612,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_Writer() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer");
        Object[] data = new Object[]{ "bar" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.writeLines(list, "*", writer);
        out.off();
        writer.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5612,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_Writer_literalMutation6606() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_literalMutation6606");
        Object[] data = new Object[]{ "hello" , new StringBuffer("foo") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.writeLines(list, "*", writer);
        out.off();
        writer.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5612,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_Writer_literalMutation6607() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_literalMutation6607");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "bar" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.writeLines(list, "*", writer);
        out.off();
        writer.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5612,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_Writer_literalMutation6608() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_literalMutation6608");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "" , "foo" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.writeLines(list, "*", writer);
        out.off();
        writer.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5612,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_Writer_literalMutation6610() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_literalMutation6610");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "" , "this is" , null , "bar" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.writeLines(list, "*", writer);
        out.off();
        writer.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5612,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_Writer_literalMutation6611() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_literalMutation6611");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.writeLines(list, "*", writer);
        out.off();
        writer.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5612,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_Writer_literalMutation6612() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_literalMutation6612");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.writeLines(list, "*", writer);
        out.off();
        writer.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5612,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_Writer_literalMutation6613() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_literalMutation6613");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "bar");
        IOUtils.writeLines(list, "*", writer);
        out.off();
        writer.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5612,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_Writer_literalMutation6614() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_literalMutation6614");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.writeLines(list, "bar", writer);
        out.off();
        writer.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5612,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_Writer_literalMutation6615() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_literalMutation6615");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.writeLines(list, "*", writer);
        out.off();
        writer.flush();
        String expected = "foo";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5612,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_Writer_remove1422() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_remove1422");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        out.off();
        writer.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5612,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_Writer_remove1423() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_remove1423");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.writeLines(list, "*", writer);
        writer.flush();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5612,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_Writer_remove1424() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_remove1424");
        Object[] data = new Object[]{ "hello" , new StringBuffer("world") , "" , "this is" , null , "some text" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.writeLines(list, "*", writer);
        out.off();
        String expected = "hello*world**this is**some text*";
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5612,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_Writer_nullData_add1965() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_nullData_add1965");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.writeLines(((List<?>)(null)), "*", writer);
        IOUtils.writeLines(((List<?>)(null)), "*", writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5614,baout,5613,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_Writer_nullData_add1966() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_nullData_add1966");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.writeLines(((List<?>)(null)), "*", writer);
        out.off();
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5614,baout,5613,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_Writer_nullData_add1967() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_nullData_add1967");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.writeLines(((List<?>)(null)), "*", writer);
        out.off();
        writer.flush();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5614,baout,5613,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_Writer_nullData() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_nullData");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.writeLines(((List<?>)(null)), "*", writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5614,baout,5613,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_Writer_nullData_literalMutation6617() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_nullData_literalMutation6617");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.writeLines(((List<?>)(null)), "*", writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5614,baout,5613,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_Writer_nullData_literalMutation6618() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_nullData_literalMutation6618");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "foo");
        IOUtils.writeLines(((List<?>)(null)), "*", writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5614,baout,5613,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_Writer_nullData_literalMutation6620() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_nullData_literalMutation6620");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.writeLines(((List<?>)(null)), "foo", writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5614,baout,5613,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_Writer_nullData_remove1425() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_nullData_remove1425");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5614,baout,5613,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_Writer_nullData_remove1426() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_nullData_remove1426");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.writeLines(((List<?>)(null)), "*", writer);
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5614,baout,5613,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_Writer_nullData_remove1427() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_nullData_remove1427");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.writeLines(((List<?>)(null)), "*", writer);
        out.off();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5614,baout,5613,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_Writer_nullSeparator_add1968() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_nullSeparator_add1968");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.writeLines(list, ((String)(null)), writer);
        IOUtils.writeLines(list, ((String)(null)), writer);
        out.off();
        writer.flush();
        String expected = (("hello" + (IOUtils.LINE_SEPARATOR)) + "world") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5616,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_Writer_nullSeparator_add1969() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_nullSeparator_add1969");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.writeLines(list, ((String)(null)), writer);
        out.off();
        out.off();
        writer.flush();
        String expected = (("hello" + (IOUtils.LINE_SEPARATOR)) + "world") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5616,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_Writer_nullSeparator_add1970() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_nullSeparator_add1970");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.writeLines(list, ((String)(null)), writer);
        out.off();
        writer.flush();
        writer.flush();
        String expected = (("hello" + (IOUtils.LINE_SEPARATOR)) + "world") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5616,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_Writer_nullSeparator() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_nullSeparator");
        Object[] data = new Object[]{ "bar" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.writeLines(list, ((String)(null)), writer);
        out.off();
        writer.flush();
        String expected = (("hello" + (IOUtils.LINE_SEPARATOR)) + "world") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5616,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_Writer_nullSeparator_literalMutation6622() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_nullSeparator_literalMutation6622");
        Object[] data = new Object[]{ "hello" , "bar" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.writeLines(list, ((String)(null)), writer);
        out.off();
        writer.flush();
        String expected = (("hello" + (IOUtils.LINE_SEPARATOR)) + "world") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5616,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_Writer_nullSeparator_literalMutation6623() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_nullSeparator_literalMutation6623");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.writeLines(list, ((String)(null)), writer);
        out.off();
        writer.flush();
        String expected = (("hello" + (IOUtils.LINE_SEPARATOR)) + "world") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5616,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_Writer_nullSeparator_literalMutation6624() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_nullSeparator_literalMutation6624");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.writeLines(list, ((String)(null)), writer);
        out.off();
        writer.flush();
        String expected = (("hello" + (IOUtils.LINE_SEPARATOR)) + "world") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5616,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_Writer_nullSeparator_literalMutation6625() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_nullSeparator_literalMutation6625");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "bar");
        IOUtils.writeLines(list, ((String)(null)), writer);
        out.off();
        writer.flush();
        String expected = (("hello" + (IOUtils.LINE_SEPARATOR)) + "world") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5616,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_Writer_nullSeparator_literalMutation6627() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_nullSeparator_literalMutation6627");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.writeLines(list, ((String)(null)), writer);
        out.off();
        writer.flush();
        String expected = (("foo" + (IOUtils.LINE_SEPARATOR)) + "world") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5616,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_Writer_nullSeparator_literalMutation6628() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_nullSeparator_literalMutation6628");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.writeLines(list, ((String)(null)), writer);
        out.off();
        writer.flush();
        String expected = (("hello" + (IOUtils.LINE_SEPARATOR)) + "bar") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5616,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_Writer_nullSeparator_remove1428() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_nullSeparator_remove1428");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        out.off();
        writer.flush();
        String expected = (("hello" + (IOUtils.LINE_SEPARATOR)) + "world") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5616,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_Writer_nullSeparator_remove1429() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_nullSeparator_remove1429");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.writeLines(list, ((String)(null)), writer);
        writer.flush();
        String expected = (("hello" + (IOUtils.LINE_SEPARATOR)) + "world") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5616,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_Writer_nullSeparator_remove1430() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_nullSeparator_remove1430");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        IOUtils.writeLines(list, ((String)(null)), writer);
        out.off();
        String expected = (("hello" + (IOUtils.LINE_SEPARATOR)) + "world") + (IOUtils.LINE_SEPARATOR);
        String actual = baout.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5616,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLines_Writer_nullStream_add1971() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_nullStream_add1971");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        try {
            IOUtils.writeLines(list, "*", ((Writer)(null)));
            IOUtils.writeLines(list, "*", ((Writer)(null)));
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_Writer_nullStream() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_nullStream");
        Object[] data = new Object[]{ "bar" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        try {
            IOUtils.writeLines(list, "*", ((Writer)(null)));
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_Writer_nullStream_literalMutation6630() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_nullStream_literalMutation6630");
        Object[] data = new Object[]{ "hello" , "bar" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        try {
            IOUtils.writeLines(list, "*", ((Writer)(null)));
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLines_Writer_nullStream_literalMutation6631() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLines_Writer_nullStream_literalMutation6631");
        Object[] data = new Object[]{ "hello" , "world" };
        List<java.lang.Object> list = java.util.Arrays.asList(data);
        try {
            IOUtils.writeLines(list, "foo", ((Writer)(null)));
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


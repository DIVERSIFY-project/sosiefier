package org.apache.commons.io;

import java.io.ByteArrayInputStream;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.commons.io.testtools.FileBasedTestCase;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.commons.io.input.NullInputStream;
import org.apache.commons.io.output.NullOutputStream;
import org.apache.commons.io.input.NullReader;
import org.apache.commons.io.output.NullWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import org.junit.Test;
import java.io.Writer;
import org.apache.commons.io.testtools.YellOnCloseInputStream;
import org.apache.commons.io.testtools.YellOnFlushAndCloseOutputStream;

/** 
 * JUnit tests for IOUtils copy methods.
 * 
 * @version $Id$
 * @see IOUtils
 */
public class IOUtilsCopyTestCase extends FileBasedTestCase {
    private static final int FILE_SIZE = (1024 * 4) + 1;

    private byte[] inData = generateTestData(FILE_SIZE);

    public IOUtilsCopyTestCase(String testName) {
        super(testName);
    }

    @Override
    public void setUp() throws Exception {
    }

    @Override
    public void tearDown() throws Exception {
    }

    public void testCopy_inputStreamToOutputStream() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToOutputStream");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        int count = org.apache.commons.io.IOUtils.copy(in, out);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5349,in,5348,in.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5350,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5352,baout,5351,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5354,null,5353,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5355,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5356,count);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_inputStreamToOutputStream_literalMutation6248() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToOutputStream_literalMutation6248");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        int count = org.apache.commons.io.IOUtils.copy(in, out);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5349,in,5348,in.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5350,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5352,baout,5351,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5354,null,5353,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5355,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5356,count);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_inputStreamToOutputStream_literalMutation6249() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToOutputStream_literalMutation6249");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , false);
        int count = org.apache.commons.io.IOUtils.copy(in, out);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5349,in,5348,in.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5350,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5352,baout,5351,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5354,null,5353,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5355,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5356,count);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_inputStreamToOutputStream_nullIn() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToOutputStream_nullIn");
        OutputStream out = new ByteArrayOutputStream();
        try {
            org.apache.commons.io.IOUtils.copy(((InputStream)(null)), out);
            org.apache.commons.io.IOUtils.copy(((InputStream)(null)), out);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_inputStreamToOutputStream_nullOut() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToOutputStream_nullOut");
        InputStream in = new ByteArrayInputStream(inData);
        try {
            org.apache.commons.io.IOUtils.copy(in, ((OutputStream)(null)));
            org.apache.commons.io.IOUtils.copy(in, ((OutputStream)(null)));
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Copying file > 2GB  - see issue# IO-84
     */
@Test(timeout = 1000)
    public void testCopy_inputStreamToOutputStream_IO84_add1775() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToOutputStream_IO84_add1775");
        long size = ((long)(Integer.MAX_VALUE)) + ((long)(1));
        InputStream in = new NullInputStream(size);
        OutputStream out = new NullOutputStream();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5357,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5359,null,5358,org.apache.commons.io.IOUtils.copy(in, out));
        in.close();
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5360,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5362,null,5361,org.apache.commons.io.IOUtils.copyLarge(in, out));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Copying file > 2GB  - see issue# IO-84
     */
public void testCopy_inputStreamToOutputStream_IO84() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToOutputStream_IO84");
        long size = ((long)(Integer.MAX_VALUE)) + ((long)(2));
        InputStream in = new NullInputStream(size);
        OutputStream out = new NullOutputStream();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5357,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5359,null,5358,org.apache.commons.io.IOUtils.copy(in, out));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5360,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5362,null,5361,org.apache.commons.io.IOUtils.copyLarge(in, out));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Copying file > 2GB  - see issue# IO-84
     */
public void testCopy_inputStreamToOutputStream_IO84_literalMutation6251() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToOutputStream_IO84_literalMutation6251");
        long size = ((long)(Integer.MAX_VALUE)) + ((long)(0));
        InputStream in = new NullInputStream(size);
        OutputStream out = new NullOutputStream();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5357,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5359,null,5358,org.apache.commons.io.IOUtils.copy(in, out));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5360,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5362,null,5361,org.apache.commons.io.IOUtils.copyLarge(in, out));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Copying file > 2GB  - see issue# IO-84
     */
public void testCopy_inputStreamToOutputStream_IO84_literalMutation6252() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToOutputStream_IO84_literalMutation6252");
        long size = ((long)(Integer.MAX_VALUE)) + ((long)(0));
        InputStream in = new NullInputStream(size);
        OutputStream out = new NullOutputStream();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5357,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5359,null,5358,org.apache.commons.io.IOUtils.copy(in, out));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5360,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5362,null,5361,org.apache.commons.io.IOUtils.copyLarge(in, out));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Copying file > 2GB  - see issue# IO-84
     */
@Test(timeout = 1000)
    public void testCopy_inputStreamToOutputStream_IO84_remove1342() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToOutputStream_IO84_remove1342");
        long size = ((long)(Integer.MAX_VALUE)) + ((long)(1));
        InputStream in = new NullInputStream(size);
        OutputStream out = new NullOutputStream();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5357,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5359,null,5358,org.apache.commons.io.IOUtils.copy(in, out));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5360,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5362,null,5361,org.apache.commons.io.IOUtils.copyLarge(in, out));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_inputStreamToWriter() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        org.apache.commons.io.IOUtils.copy(in, writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5364,in,5363,in.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5365,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5367,baout,5366,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5369,null,5368,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_inputStreamToWriter_add1778() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_add1778");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        org.apache.commons.io.IOUtils.copy(in, writer);
        org.apache.commons.io.IOUtils.copy(in, writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5364,in,5363,in.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5365,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5367,baout,5366,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5369,null,5368,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_inputStreamToWriter_add1779() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_add1779");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        org.apache.commons.io.IOUtils.copy(in, writer);
        out.off();
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5364,in,5363,in.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5365,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5367,baout,5366,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5369,null,5368,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_inputStreamToWriter_add1780() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_add1780");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        org.apache.commons.io.IOUtils.copy(in, writer);
        out.off();
        writer.flush();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5364,in,5363,in.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5365,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5367,baout,5366,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5369,null,5368,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_inputStreamToWriter_literalMutation6255() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_literalMutation6255");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        org.apache.commons.io.IOUtils.copy(in, writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5364,in,5363,in.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5365,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5367,baout,5366,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5369,null,5368,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_inputStreamToWriter_literalMutation6256() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_literalMutation6256");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        org.apache.commons.io.IOUtils.copy(in, writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5364,in,5363,in.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5365,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5367,baout,5366,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5369,null,5368,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_inputStreamToWriter_literalMutation6257() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_literalMutation6257");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "bar");
        org.apache.commons.io.IOUtils.copy(in, writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5364,in,5363,in.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5365,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5367,baout,5366,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5369,null,5368,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_inputStreamToWriter_remove1343() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_remove1343");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5364,in,5363,in.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5365,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5367,baout,5366,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5369,null,5368,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_inputStreamToWriter_remove1344() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_remove1344");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        org.apache.commons.io.IOUtils.copy(in, writer);
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5364,in,5363,in.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5365,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5367,baout,5366,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5369,null,5368,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_inputStreamToWriter_remove1345() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_remove1345");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        org.apache.commons.io.IOUtils.copy(in, writer);
        out.off();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5364,in,5363,in.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5365,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5367,baout,5366,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5369,null,5368,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_inputStreamToWriter_nullIn_add1789() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_nullIn_add1789");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(out , "US-ASCII");
        try {
            org.apache.commons.io.IOUtils.copy(((InputStream)(null)), writer);
            org.apache.commons.io.IOUtils.copy(((InputStream)(null)), writer);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_inputStreamToWriter_nullIn() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_nullIn");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(out , "US-ASCII");
        try {
            org.apache.commons.io.IOUtils.copy(((InputStream)(null)), writer);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_inputStreamToWriter_nullIn_literalMutation6276() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_nullIn_literalMutation6276");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        Writer writer = new OutputStreamWriter(out , "US-ASCII");
        try {
            org.apache.commons.io.IOUtils.copy(((InputStream)(null)), writer);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_inputStreamToWriter_nullIn_literalMutation6277() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_nullIn_literalMutation6277");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(out , "foo");
        try {
            org.apache.commons.io.IOUtils.copy(((InputStream)(null)), writer);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_inputStreamToWriter_nullOut() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_nullOut");
        InputStream in = new ByteArrayInputStream(inData);
        try {
            org.apache.commons.io.IOUtils.copy(in, ((Writer)(null)));
            org.apache.commons.io.IOUtils.copy(in, ((Writer)(null)));
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_inputStreamToWriter_Encoding_add1781() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_Encoding_add1781");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        org.apache.commons.io.IOUtils.copy(in, writer, "UTF8");
        org.apache.commons.io.IOUtils.copy(in, writer, "UTF8");
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5371,in,5370,in.available());
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF8").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5373,null,5372,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_inputStreamToWriter_Encoding_add1782() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_Encoding_add1782");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        org.apache.commons.io.IOUtils.copy(in, writer, "UTF8");
        out.off();
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5371,in,5370,in.available());
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF8").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5373,null,5372,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_inputStreamToWriter_Encoding_add1783() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_Encoding_add1783");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        org.apache.commons.io.IOUtils.copy(in, writer, "UTF8");
        out.off();
        writer.flush();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5371,in,5370,in.available());
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF8").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5373,null,5372,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_inputStreamToWriter_Encoding() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_Encoding");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        org.apache.commons.io.IOUtils.copy(in, writer, "UTF8");
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5371,in,5370,in.available());
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF8").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5373,null,5372,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_inputStreamToWriter_Encoding_literalMutation6259() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_Encoding_literalMutation6259");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        org.apache.commons.io.IOUtils.copy(in, writer, "UTF8");
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5371,in,5370,in.available());
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF8").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5373,null,5372,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_inputStreamToWriter_Encoding_literalMutation6260() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_Encoding_literalMutation6260");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "foo");
        org.apache.commons.io.IOUtils.copy(in, writer, "UTF8");
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5371,in,5370,in.available());
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF8").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5373,null,5372,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_inputStreamToWriter_Encoding_literalMutation6261() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_Encoding_literalMutation6261");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        org.apache.commons.io.IOUtils.copy(in, writer, "bar");
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5371,in,5370,in.available());
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF8").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5373,null,5372,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_inputStreamToWriter_Encoding_literalMutation6262() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_Encoding_literalMutation6262");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        org.apache.commons.io.IOUtils.copy(in, writer, "UTF8");
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5371,in,5370,in.available());
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "foo").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5373,null,5372,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_inputStreamToWriter_Encoding_literalMutation6263() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_Encoding_literalMutation6263");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        org.apache.commons.io.IOUtils.copy(in, writer, "UTF8");
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5371,in,5370,in.available());
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF8").getBytes("bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5373,null,5372,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_inputStreamToWriter_Encoding_remove1346() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_Encoding_remove1346");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5371,in,5370,in.available());
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF8").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5373,null,5372,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_inputStreamToWriter_Encoding_remove1347() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_Encoding_remove1347");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        org.apache.commons.io.IOUtils.copy(in, writer, "UTF8");
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5371,in,5370,in.available());
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF8").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5373,null,5372,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_inputStreamToWriter_Encoding_remove1348() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_Encoding_remove1348");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        org.apache.commons.io.IOUtils.copy(in, writer, "UTF8");
        out.off();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5371,in,5370,in.available());
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF8").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5373,null,5372,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_inputStreamToWriter_Encoding_nullIn_add1787() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_Encoding_nullIn_add1787");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(out , "US-ASCII");
        try {
            org.apache.commons.io.IOUtils.copy(((InputStream)(null)), writer, "UTF8");
            org.apache.commons.io.IOUtils.copy(((InputStream)(null)), writer, "UTF8");
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_inputStreamToWriter_Encoding_nullIn() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_Encoding_nullIn");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(out , "US-ASCII");
        try {
            org.apache.commons.io.IOUtils.copy(((InputStream)(null)), writer, "UTF8");
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_inputStreamToWriter_Encoding_nullIn_literalMutation6269() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_Encoding_nullIn_literalMutation6269");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        Writer writer = new OutputStreamWriter(out , "US-ASCII");
        try {
            org.apache.commons.io.IOUtils.copy(((InputStream)(null)), writer, "UTF8");
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_inputStreamToWriter_Encoding_nullIn_literalMutation6270() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_Encoding_nullIn_literalMutation6270");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(out , "bar");
        try {
            org.apache.commons.io.IOUtils.copy(((InputStream)(null)), writer, "UTF8");
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_inputStreamToWriter_Encoding_nullIn_literalMutation6272() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_Encoding_nullIn_literalMutation6272");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(out , "US-ASCII");
        try {
            org.apache.commons.io.IOUtils.copy(((InputStream)(null)), writer, "foo");
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_inputStreamToWriter_Encoding_nullOut_add1788() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_Encoding_nullOut_add1788");
        InputStream in = new ByteArrayInputStream(inData);
        try {
            org.apache.commons.io.IOUtils.copy(in, ((Writer)(null)), "UTF8");
            org.apache.commons.io.IOUtils.copy(in, ((Writer)(null)), "UTF8");
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_inputStreamToWriter_Encoding_nullOut() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_Encoding_nullOut");
        InputStream in = new ByteArrayInputStream(inData);
        try {
            org.apache.commons.io.IOUtils.copy(in, ((Writer)(null)), "foo");
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_inputStreamToWriter_Encoding_nullEncoding_add1784() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_Encoding_nullEncoding_add1784");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        org.apache.commons.io.IOUtils.copy(in, writer, ((String)(null)));
        org.apache.commons.io.IOUtils.copy(in, writer, ((String)(null)));
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5375,in,5374,in.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5376,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5378,baout,5377,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5380,null,5379,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_inputStreamToWriter_Encoding_nullEncoding_add1785() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_Encoding_nullEncoding_add1785");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        org.apache.commons.io.IOUtils.copy(in, writer, ((String)(null)));
        out.off();
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5375,in,5374,in.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5376,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5378,baout,5377,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5380,null,5379,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_inputStreamToWriter_Encoding_nullEncoding_add1786() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_Encoding_nullEncoding_add1786");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        org.apache.commons.io.IOUtils.copy(in, writer, ((String)(null)));
        out.off();
        writer.flush();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5375,in,5374,in.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5376,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5378,baout,5377,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5380,null,5379,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_inputStreamToWriter_Encoding_nullEncoding() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_Encoding_nullEncoding");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        org.apache.commons.io.IOUtils.copy(in, writer, ((String)(null)));
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5375,in,5374,in.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5376,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5378,baout,5377,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5380,null,5379,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_inputStreamToWriter_Encoding_nullEncoding_literalMutation6265() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_Encoding_nullEncoding_literalMutation6265");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        org.apache.commons.io.IOUtils.copy(in, writer, ((String)(null)));
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5375,in,5374,in.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5376,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5378,baout,5377,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5380,null,5379,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_inputStreamToWriter_Encoding_nullEncoding_literalMutation6266() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_Encoding_nullEncoding_literalMutation6266");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "foo");
        org.apache.commons.io.IOUtils.copy(in, writer, ((String)(null)));
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5375,in,5374,in.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5376,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5378,baout,5377,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5380,null,5379,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_inputStreamToWriter_Encoding_nullEncoding_remove1349() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_Encoding_nullEncoding_remove1349");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5375,in,5374,in.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5376,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5378,baout,5377,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5380,null,5379,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_inputStreamToWriter_Encoding_nullEncoding_remove1350() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_Encoding_nullEncoding_remove1350");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        org.apache.commons.io.IOUtils.copy(in, writer, ((String)(null)));
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5375,in,5374,in.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5376,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5378,baout,5377,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5380,null,5379,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_inputStreamToWriter_Encoding_nullEncoding_remove1351() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_inputStreamToWriter_Encoding_nullEncoding_remove1351");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        org.apache.commons.io.IOUtils.copy(in, writer, ((String)(null)));
        out.off();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5375,in,5374,in.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5376,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5378,baout,5377,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5380,null,5379,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_readerToOutputStream() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToOutputStream");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        org.apache.commons.io.IOUtils.copy(reader, out);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5381,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5383,baout,5382,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5385,null,5384,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_readerToOutputStream_add1791() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToOutputStream_add1791");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        org.apache.commons.io.IOUtils.copy(reader, out);
        org.apache.commons.io.IOUtils.copy(reader, out);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5381,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5383,baout,5382,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5385,null,5384,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_readerToOutputStream_literalMutation6280() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToOutputStream_literalMutation6280");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "bar");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        org.apache.commons.io.IOUtils.copy(reader, out);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5381,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5383,baout,5382,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5385,null,5384,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_readerToOutputStream_literalMutation6281() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToOutputStream_literalMutation6281");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        org.apache.commons.io.IOUtils.copy(reader, out);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5381,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5383,baout,5382,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5385,null,5384,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_readerToOutputStream_literalMutation6282() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToOutputStream_literalMutation6282");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , false);
        org.apache.commons.io.IOUtils.copy(reader, out);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5381,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5383,baout,5382,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5385,null,5384,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_readerToOutputStream_remove1352() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToOutputStream_remove1352");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5381,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5383,baout,5382,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5385,null,5384,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_readerToOutputStream_nullIn_add1796() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToOutputStream_nullIn_add1796");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        try {
            org.apache.commons.io.IOUtils.copy(((Reader)(null)), out);
            org.apache.commons.io.IOUtils.copy(((Reader)(null)), out);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_readerToOutputStream_nullIn() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToOutputStream_nullIn");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        try {
            org.apache.commons.io.IOUtils.copy(((Reader)(null)), out);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_readerToOutputStream_nullIn_literalMutation6301() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToOutputStream_nullIn_literalMutation6301");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        try {
            org.apache.commons.io.IOUtils.copy(((Reader)(null)), out);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_readerToOutputStream_nullOut_add1797() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToOutputStream_nullOut_add1797");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "US-ASCII");
        try {
            org.apache.commons.io.IOUtils.copy(reader, ((OutputStream)(null)));
            org.apache.commons.io.IOUtils.copy(reader, ((OutputStream)(null)));
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_readerToOutputStream_nullOut() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToOutputStream_nullOut");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "foo");
        try {
            org.apache.commons.io.IOUtils.copy(reader, ((OutputStream)(null)));
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_readerToOutputStream_Encoding_add1792() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToOutputStream_Encoding_add1792");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        org.apache.commons.io.IOUtils.copy(reader, out, "UTF16");
        org.apache.commons.io.IOUtils.copy(reader, out, "UTF16");
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5387,null,5386,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_readerToOutputStream_Encoding() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToOutputStream_Encoding");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "bar");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        org.apache.commons.io.IOUtils.copy(reader, out, "UTF16");
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5387,null,5386,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_readerToOutputStream_Encoding_literalMutation6284() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToOutputStream_Encoding_literalMutation6284");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        org.apache.commons.io.IOUtils.copy(reader, out, "UTF16");
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5387,null,5386,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_readerToOutputStream_Encoding_literalMutation6285() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToOutputStream_Encoding_literalMutation6285");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , false);
        org.apache.commons.io.IOUtils.copy(reader, out, "UTF16");
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5387,null,5386,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_readerToOutputStream_Encoding_literalMutation6286() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToOutputStream_Encoding_literalMutation6286");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        org.apache.commons.io.IOUtils.copy(reader, out, "bar");
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5387,null,5386,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_readerToOutputStream_Encoding_literalMutation6287() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToOutputStream_Encoding_literalMutation6287");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        org.apache.commons.io.IOUtils.copy(reader, out, "UTF16");
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "foo").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5387,null,5386,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_readerToOutputStream_Encoding_literalMutation6288() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToOutputStream_Encoding_literalMutation6288");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        org.apache.commons.io.IOUtils.copy(reader, out, "UTF16");
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5387,null,5386,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_readerToOutputStream_Encoding_remove1353() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToOutputStream_Encoding_remove1353");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        byte[] bytes = baout.toByteArray();
        bytes = new String(bytes , "UTF16").getBytes("US-ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5387,null,5386,java.util.Arrays.equals(inData, bytes));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_readerToOutputStream_Encoding_nullIn_add1794() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToOutputStream_Encoding_nullIn_add1794");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        try {
            org.apache.commons.io.IOUtils.copy(((Reader)(null)), out, "UTF16");
            org.apache.commons.io.IOUtils.copy(((Reader)(null)), out, "UTF16");
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_readerToOutputStream_Encoding_nullIn() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToOutputStream_Encoding_nullIn");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        try {
            org.apache.commons.io.IOUtils.copy(((Reader)(null)), out, "UTF16");
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_readerToOutputStream_Encoding_nullIn_literalMutation6294() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToOutputStream_Encoding_nullIn_literalMutation6294");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        try {
            org.apache.commons.io.IOUtils.copy(((Reader)(null)), out, "UTF16");
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_readerToOutputStream_Encoding_nullIn_literalMutation6296() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToOutputStream_Encoding_nullIn_literalMutation6296");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        try {
            org.apache.commons.io.IOUtils.copy(((Reader)(null)), out, "foo");
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_readerToOutputStream_Encoding_nullOut_add1795() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToOutputStream_Encoding_nullOut_add1795");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "US-ASCII");
        try {
            org.apache.commons.io.IOUtils.copy(reader, ((OutputStream)(null)), "UTF16");
            org.apache.commons.io.IOUtils.copy(reader, ((OutputStream)(null)), "UTF16");
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_readerToOutputStream_Encoding_nullOut() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToOutputStream_Encoding_nullOut");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "foo");
        try {
            org.apache.commons.io.IOUtils.copy(reader, ((OutputStream)(null)), "UTF16");
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_readerToOutputStream_Encoding_nullOut_literalMutation6299() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToOutputStream_Encoding_nullOut_literalMutation6299");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "US-ASCII");
        try {
            org.apache.commons.io.IOUtils.copy(reader, ((OutputStream)(null)), "bar");
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_readerToOutputStream_Encoding_nullEncoding_add1793() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToOutputStream_Encoding_nullEncoding_add1793");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        org.apache.commons.io.IOUtils.copy(reader, out, ((String)(null)));
        org.apache.commons.io.IOUtils.copy(reader, out, ((String)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5388,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5390,baout,5389,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5392,null,5391,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_readerToOutputStream_Encoding_nullEncoding() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToOutputStream_Encoding_nullEncoding");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "foo");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        org.apache.commons.io.IOUtils.copy(reader, out, ((String)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5388,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5390,baout,5389,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5392,null,5391,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_readerToOutputStream_Encoding_nullEncoding_literalMutation6290() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToOutputStream_Encoding_nullEncoding_literalMutation6290");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        org.apache.commons.io.IOUtils.copy(reader, out, ((String)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5388,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5390,baout,5389,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5392,null,5391,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_readerToOutputStream_Encoding_nullEncoding_literalMutation6291() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToOutputStream_Encoding_nullEncoding_literalMutation6291");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , false);
        org.apache.commons.io.IOUtils.copy(reader, out, ((String)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5388,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5390,baout,5389,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5392,null,5391,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_readerToOutputStream_Encoding_nullEncoding_remove1354() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToOutputStream_Encoding_nullEncoding_remove1354");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5388,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5390,baout,5389,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5392,null,5391,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_readerToWriter() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToWriter");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        int count = org.apache.commons.io.IOUtils.copy(reader, writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5393,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5394,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5395,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5397,baout,5396,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5399,null,5398,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_readerToWriter_add1798() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToWriter_add1798");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        int count = org.apache.commons.io.IOUtils.copy(reader, writer);
        out.off();
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5393,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5394,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5395,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5397,baout,5396,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5399,null,5398,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_readerToWriter_add1799() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToWriter_add1799");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        int count = org.apache.commons.io.IOUtils.copy(reader, writer);
        out.off();
        writer.flush();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5393,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5394,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5395,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5397,baout,5396,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5399,null,5398,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_readerToWriter_literalMutation6305() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToWriter_literalMutation6305");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "foo");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        int count = org.apache.commons.io.IOUtils.copy(reader, writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5393,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5394,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5395,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5397,baout,5396,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5399,null,5398,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_readerToWriter_literalMutation6306() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToWriter_literalMutation6306");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        int count = org.apache.commons.io.IOUtils.copy(reader, writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5393,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5394,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5395,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5397,baout,5396,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5399,null,5398,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_readerToWriter_literalMutation6307() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToWriter_literalMutation6307");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        int count = org.apache.commons.io.IOUtils.copy(reader, writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5393,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5394,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5395,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5397,baout,5396,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5399,null,5398,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_readerToWriter_literalMutation6308() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToWriter_literalMutation6308");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "bar");
        int count = org.apache.commons.io.IOUtils.copy(reader, writer);
        out.off();
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5393,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5394,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5395,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5397,baout,5396,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5399,null,5398,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_readerToWriter_remove1355() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToWriter_remove1355");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        int count = org.apache.commons.io.IOUtils.copy(reader, writer);
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5393,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5394,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5395,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5397,baout,5396,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5399,null,5398,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_readerToWriter_remove1356() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToWriter_remove1356");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "US-ASCII");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        YellOnFlushAndCloseOutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(baout , "US-ASCII");
        int count = org.apache.commons.io.IOUtils.copy(reader, writer);
        out.off();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5393,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5394,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5395,inData.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5397,baout,5396,baout.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5399,null,5398,java.util.Arrays.equals(inData, baout.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_readerToWriter_nullIn_add1801() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToWriter_nullIn_add1801");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(out , "US-ASCII");
        try {
            org.apache.commons.io.IOUtils.copy(((Reader)(null)), writer);
            org.apache.commons.io.IOUtils.copy(((Reader)(null)), writer);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_readerToWriter_nullIn() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToWriter_nullIn");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , false , true);
        Writer writer = new OutputStreamWriter(out , "US-ASCII");
        try {
            org.apache.commons.io.IOUtils.copy(((Reader)(null)), writer);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_readerToWriter_nullIn_literalMutation6313() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToWriter_nullIn_literalMutation6313");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , false);
        Writer writer = new OutputStreamWriter(out , "US-ASCII");
        try {
            org.apache.commons.io.IOUtils.copy(((Reader)(null)), writer);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_readerToWriter_nullIn_literalMutation6314() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToWriter_nullIn_literalMutation6314");
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out = new YellOnFlushAndCloseOutputStream(baout , true , true);
        Writer writer = new OutputStreamWriter(out , "bar");
        try {
            org.apache.commons.io.IOUtils.copy(((Reader)(null)), writer);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCopy_readerToWriter_nullOut_add1802() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToWriter_nullOut_add1802");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "US-ASCII");
        try {
            org.apache.commons.io.IOUtils.copy(reader, ((Writer)(null)));
            org.apache.commons.io.IOUtils.copy(reader, ((Writer)(null)));
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCopy_readerToWriter_nullOut() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToWriter_nullOut");
        InputStream in = new ByteArrayInputStream(inData);
        in = new YellOnCloseInputStream(in);
        Reader reader = new InputStreamReader(in , "bar");
        try {
            org.apache.commons.io.IOUtils.copy(reader, ((Writer)(null)));
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Copying file > 2GB  - see issue# IO-84
     */
@Test(timeout = 1000)
    public void testCopy_readerToWriter_IO84_add1800() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToWriter_IO84_add1800");
        long size = ((long)(Integer.MAX_VALUE)) + ((long)(1));
        Reader reader = new NullReader(size);
        Writer writer = new NullWriter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5400,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5402,null,5401,org.apache.commons.io.IOUtils.copy(reader, writer));
        reader.close();
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5403,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5405,null,5404,org.apache.commons.io.IOUtils.copyLarge(reader, writer));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Copying file > 2GB  - see issue# IO-84
     */
public void testCopy_readerToWriter_IO84() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToWriter_IO84");
        long size = ((long)(Integer.MAX_VALUE)) + ((long)(2));
        Reader reader = new NullReader(size);
        Writer writer = new NullWriter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5400,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5402,null,5401,org.apache.commons.io.IOUtils.copy(reader, writer));
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5403,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5405,null,5404,org.apache.commons.io.IOUtils.copyLarge(reader, writer));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Copying file > 2GB  - see issue# IO-84
     */
public void testCopy_readerToWriter_IO84_literalMutation6310() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToWriter_IO84_literalMutation6310");
        long size = ((long)(Integer.MAX_VALUE)) + ((long)(0));
        Reader reader = new NullReader(size);
        Writer writer = new NullWriter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5400,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5402,null,5401,org.apache.commons.io.IOUtils.copy(reader, writer));
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5403,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5405,null,5404,org.apache.commons.io.IOUtils.copyLarge(reader, writer));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Copying file > 2GB  - see issue# IO-84
     */
public void testCopy_readerToWriter_IO84_literalMutation6311() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToWriter_IO84_literalMutation6311");
        long size = ((long)(Integer.MAX_VALUE)) + ((long)(0));
        Reader reader = new NullReader(size);
        Writer writer = new NullWriter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5400,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5402,null,5401,org.apache.commons.io.IOUtils.copy(reader, writer));
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5403,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5405,null,5404,org.apache.commons.io.IOUtils.copyLarge(reader, writer));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Copying file > 2GB  - see issue# IO-84
     */
@Test(timeout = 1000)
    public void testCopy_readerToWriter_IO84_remove1357() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCopy_readerToWriter_IO84_remove1357");
        long size = ((long)(Integer.MAX_VALUE)) + ((long)(1));
        Reader reader = new NullReader(size);
        Writer writer = new NullWriter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5400,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5402,null,5401,org.apache.commons.io.IOUtils.copy(reader, writer));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5403,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5405,null,5404,org.apache.commons.io.IOUtils.copyLarge(reader, writer));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


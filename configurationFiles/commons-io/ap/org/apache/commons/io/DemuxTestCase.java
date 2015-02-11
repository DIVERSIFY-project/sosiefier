package org.apache.commons.io;

import java.io.ByteArrayInputStream;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.commons.io.input.DemuxInputStream;
import org.apache.commons.io.output.DemuxOutputStream;
import java.util.HashMap;
import java.io.InputStream;
import java.util.Iterator;
import java.io.OutputStream;
import java.util.Random;
import org.junit.Test;

/** 
 * Basic unit tests for the multiplexing streams.
 */
public class DemuxTestCase {
    private static final String T1 = "Thread1";

    private static final String T2 = "Thread2";

    private static final String T3 = "Thread3";

    private static final String T4 = "Thread4";

    private static final String DATA1 = "Data for thread1";

    private static final String DATA2 = "Data for thread2";

    private static final String DATA3 = "Data for thread3";

    private static final String DATA4 = "Data for thread4";

    private static final Random c_random = new Random();

    private HashMap<java.lang.String, org.apache.commons.io.output.ByteArrayOutputStream> m_outputMap = new HashMap<java.lang.String, org.apache.commons.io.output.ByteArrayOutputStream>();

    private HashMap<java.lang.String, java.lang.Thread> m_threadMap = new HashMap<java.lang.String, java.lang.Thread>();

    private String getOutput(String threadName) {
        ByteArrayOutputStream output = m_outputMap.get(threadName);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1873,output);
        return output.toString();
    }

    private String getInput(String threadName) {
        ReaderThread thread = ((ReaderThread)(m_threadMap.get(threadName)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1872,thread);
        return thread.getData();
    }

    private void doStart() throws Exception {
        Iterator<java.lang.String> iterator = m_threadMap.keySet().iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            Thread thread = m_threadMap.get(name);
            thread.start();
        }
    }

    private void doJoin() throws Exception {
        Iterator<java.lang.String> iterator = m_threadMap.keySet().iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            Thread thread = m_threadMap.get(name);
            thread.join();
        }
    }

    private void startWriter(String name, String data, DemuxOutputStream demux) throws Exception {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        m_outputMap.put(name, output);
        WriterThread thread = new WriterThread(name , data , output , demux);
        m_threadMap.put(name, thread);
    }

    private void startReader(String name, String data, DemuxInputStream demux) throws Exception {
        ByteArrayInputStream input = new ByteArrayInputStream(data.getBytes());
        ReaderThread thread = new ReaderThread(name , input , demux);
        m_threadMap.put(name, thread);
    }

    @Test(timeout = 1000)
    public void testOutputStream() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOutputStream");
        DemuxOutputStream output = new DemuxOutputStream();
        startWriter(T1, DATA1, output);
        startWriter(T1, DATA1, output);
        startWriter(T2, DATA2, output);
        startWriter(T3, DATA3, output);
        startWriter(T4, DATA4, output);
        doStart();
        doJoin();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1886,org.apache.commons.io.DemuxTestCase.DATA1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1888,null,1887,getOutput(org.apache.commons.io.DemuxTestCase.T1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1889,org.apache.commons.io.DemuxTestCase.DATA2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1891,null,1890,getOutput(org.apache.commons.io.DemuxTestCase.T2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,org.apache.commons.io.DemuxTestCase.DATA3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,null,1893,getOutput(org.apache.commons.io.DemuxTestCase.T3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1895,org.apache.commons.io.DemuxTestCase.DATA4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1897,null,1896,getOutput(org.apache.commons.io.DemuxTestCase.T4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testOutputStream_add1176() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOutputStream_add1176");
        DemuxOutputStream output = new DemuxOutputStream();
        startWriter(T1, DATA1, output);
        startWriter(T2, DATA2, output);
        startWriter(T2, DATA2, output);
        startWriter(T3, DATA3, output);
        startWriter(T4, DATA4, output);
        doStart();
        doJoin();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1886,org.apache.commons.io.DemuxTestCase.DATA1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1888,null,1887,getOutput(org.apache.commons.io.DemuxTestCase.T1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1889,org.apache.commons.io.DemuxTestCase.DATA2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1891,null,1890,getOutput(org.apache.commons.io.DemuxTestCase.T2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,org.apache.commons.io.DemuxTestCase.DATA3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,null,1893,getOutput(org.apache.commons.io.DemuxTestCase.T3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1895,org.apache.commons.io.DemuxTestCase.DATA4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1897,null,1896,getOutput(org.apache.commons.io.DemuxTestCase.T4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testOutputStream_add1177() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOutputStream_add1177");
        DemuxOutputStream output = new DemuxOutputStream();
        startWriter(T1, DATA1, output);
        startWriter(T2, DATA2, output);
        startWriter(T3, DATA3, output);
        startWriter(T3, DATA3, output);
        startWriter(T4, DATA4, output);
        doStart();
        doJoin();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1886,org.apache.commons.io.DemuxTestCase.DATA1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1888,null,1887,getOutput(org.apache.commons.io.DemuxTestCase.T1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1889,org.apache.commons.io.DemuxTestCase.DATA2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1891,null,1890,getOutput(org.apache.commons.io.DemuxTestCase.T2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,org.apache.commons.io.DemuxTestCase.DATA3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,null,1893,getOutput(org.apache.commons.io.DemuxTestCase.T3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1895,org.apache.commons.io.DemuxTestCase.DATA4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1897,null,1896,getOutput(org.apache.commons.io.DemuxTestCase.T4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testOutputStream_add1178() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOutputStream_add1178");
        DemuxOutputStream output = new DemuxOutputStream();
        startWriter(T1, DATA1, output);
        startWriter(T2, DATA2, output);
        startWriter(T3, DATA3, output);
        startWriter(T4, DATA4, output);
        startWriter(T4, DATA4, output);
        doStart();
        doJoin();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1886,org.apache.commons.io.DemuxTestCase.DATA1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1888,null,1887,getOutput(org.apache.commons.io.DemuxTestCase.T1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1889,org.apache.commons.io.DemuxTestCase.DATA2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1891,null,1890,getOutput(org.apache.commons.io.DemuxTestCase.T2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,org.apache.commons.io.DemuxTestCase.DATA3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,null,1893,getOutput(org.apache.commons.io.DemuxTestCase.T3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1895,org.apache.commons.io.DemuxTestCase.DATA4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1897,null,1896,getOutput(org.apache.commons.io.DemuxTestCase.T4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testOutputStream_add1179() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOutputStream_add1179");
        DemuxOutputStream output = new DemuxOutputStream();
        startWriter(T1, DATA1, output);
        startWriter(T2, DATA2, output);
        startWriter(T3, DATA3, output);
        startWriter(T4, DATA4, output);
        doStart();
        doStart();
        doJoin();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1886,org.apache.commons.io.DemuxTestCase.DATA1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1888,null,1887,getOutput(org.apache.commons.io.DemuxTestCase.T1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1889,org.apache.commons.io.DemuxTestCase.DATA2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1891,null,1890,getOutput(org.apache.commons.io.DemuxTestCase.T2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,org.apache.commons.io.DemuxTestCase.DATA3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,null,1893,getOutput(org.apache.commons.io.DemuxTestCase.T3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1895,org.apache.commons.io.DemuxTestCase.DATA4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1897,null,1896,getOutput(org.apache.commons.io.DemuxTestCase.T4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testOutputStream_add1180() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOutputStream_add1180");
        DemuxOutputStream output = new DemuxOutputStream();
        startWriter(T1, DATA1, output);
        startWriter(T2, DATA2, output);
        startWriter(T3, DATA3, output);
        startWriter(T4, DATA4, output);
        doStart();
        doJoin();
        doJoin();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1886,org.apache.commons.io.DemuxTestCase.DATA1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1888,null,1887,getOutput(org.apache.commons.io.DemuxTestCase.T1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1889,org.apache.commons.io.DemuxTestCase.DATA2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1891,null,1890,getOutput(org.apache.commons.io.DemuxTestCase.T2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,org.apache.commons.io.DemuxTestCase.DATA3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,null,1893,getOutput(org.apache.commons.io.DemuxTestCase.T3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1895,org.apache.commons.io.DemuxTestCase.DATA4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1897,null,1896,getOutput(org.apache.commons.io.DemuxTestCase.T4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testOutputStream_remove913() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOutputStream_remove913");
        DemuxOutputStream output = new DemuxOutputStream();
        startWriter(T2, DATA2, output);
        startWriter(T3, DATA3, output);
        startWriter(T4, DATA4, output);
        doStart();
        doJoin();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1886,org.apache.commons.io.DemuxTestCase.DATA1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1888,null,1887,getOutput(org.apache.commons.io.DemuxTestCase.T1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1889,org.apache.commons.io.DemuxTestCase.DATA2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1891,null,1890,getOutput(org.apache.commons.io.DemuxTestCase.T2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,org.apache.commons.io.DemuxTestCase.DATA3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,null,1893,getOutput(org.apache.commons.io.DemuxTestCase.T3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1895,org.apache.commons.io.DemuxTestCase.DATA4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1897,null,1896,getOutput(org.apache.commons.io.DemuxTestCase.T4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testOutputStream_remove914() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOutputStream_remove914");
        DemuxOutputStream output = new DemuxOutputStream();
        startWriter(T2, DATA2, output);
        startWriter(T3, DATA3, output);
        startWriter(T4, DATA4, output);
        doStart();
        doJoin();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1886,org.apache.commons.io.DemuxTestCase.DATA1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1888,null,1887,getOutput(org.apache.commons.io.DemuxTestCase.T1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1889,org.apache.commons.io.DemuxTestCase.DATA2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1891,null,1890,getOutput(org.apache.commons.io.DemuxTestCase.T2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,org.apache.commons.io.DemuxTestCase.DATA3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,null,1893,getOutput(org.apache.commons.io.DemuxTestCase.T3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1895,org.apache.commons.io.DemuxTestCase.DATA4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1897,null,1896,getOutput(org.apache.commons.io.DemuxTestCase.T4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testOutputStream_remove915() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOutputStream_remove915");
        DemuxOutputStream output = new DemuxOutputStream();
        startWriter(T2, DATA2, output);
        startWriter(T3, DATA3, output);
        startWriter(T4, DATA4, output);
        doStart();
        doJoin();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1886,org.apache.commons.io.DemuxTestCase.DATA1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1888,null,1887,getOutput(org.apache.commons.io.DemuxTestCase.T1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1889,org.apache.commons.io.DemuxTestCase.DATA2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1891,null,1890,getOutput(org.apache.commons.io.DemuxTestCase.T2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,org.apache.commons.io.DemuxTestCase.DATA3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,null,1893,getOutput(org.apache.commons.io.DemuxTestCase.T3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1895,org.apache.commons.io.DemuxTestCase.DATA4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1897,null,1896,getOutput(org.apache.commons.io.DemuxTestCase.T4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testOutputStream_remove916() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOutputStream_remove916");
        DemuxOutputStream output = new DemuxOutputStream();
        startWriter(T2, DATA2, output);
        startWriter(T3, DATA3, output);
        startWriter(T4, DATA4, output);
        doStart();
        doJoin();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1886,org.apache.commons.io.DemuxTestCase.DATA1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1888,null,1887,getOutput(org.apache.commons.io.DemuxTestCase.T1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1889,org.apache.commons.io.DemuxTestCase.DATA2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1891,null,1890,getOutput(org.apache.commons.io.DemuxTestCase.T2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,org.apache.commons.io.DemuxTestCase.DATA3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,null,1893,getOutput(org.apache.commons.io.DemuxTestCase.T3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1895,org.apache.commons.io.DemuxTestCase.DATA4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1897,null,1896,getOutput(org.apache.commons.io.DemuxTestCase.T4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testOutputStream_remove917() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOutputStream_remove917");
        DemuxOutputStream output = new DemuxOutputStream();
        startWriter(T1, DATA1, output);
        startWriter(T2, DATA2, output);
        startWriter(T3, DATA3, output);
        startWriter(T4, DATA4, output);
        doJoin();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1886,org.apache.commons.io.DemuxTestCase.DATA1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1888,null,1887,getOutput(org.apache.commons.io.DemuxTestCase.T1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1889,org.apache.commons.io.DemuxTestCase.DATA2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1891,null,1890,getOutput(org.apache.commons.io.DemuxTestCase.T2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,org.apache.commons.io.DemuxTestCase.DATA3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,null,1893,getOutput(org.apache.commons.io.DemuxTestCase.T3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1895,org.apache.commons.io.DemuxTestCase.DATA4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1897,null,1896,getOutput(org.apache.commons.io.DemuxTestCase.T4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testOutputStream_remove918() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOutputStream_remove918");
        DemuxOutputStream output = new DemuxOutputStream();
        startWriter(T1, DATA1, output);
        startWriter(T2, DATA2, output);
        startWriter(T3, DATA3, output);
        startWriter(T4, DATA4, output);
        doStart();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1886,org.apache.commons.io.DemuxTestCase.DATA1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1888,null,1887,getOutput(org.apache.commons.io.DemuxTestCase.T1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1889,org.apache.commons.io.DemuxTestCase.DATA2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1891,null,1890,getOutput(org.apache.commons.io.DemuxTestCase.T2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,org.apache.commons.io.DemuxTestCase.DATA3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,null,1893,getOutput(org.apache.commons.io.DemuxTestCase.T3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1895,org.apache.commons.io.DemuxTestCase.DATA4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1897,null,1896,getOutput(org.apache.commons.io.DemuxTestCase.T4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInputStream() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInputStream");
        DemuxInputStream input = new DemuxInputStream();
        startReader(T1, DATA1, input);
        startReader(T1, DATA1, input);
        startReader(T2, DATA2, input);
        startReader(T3, DATA3, input);
        startReader(T4, DATA4, input);
        doStart();
        doJoin();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,org.apache.commons.io.DemuxTestCase.DATA1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,null,1875,getInput(org.apache.commons.io.DemuxTestCase.T1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1877,org.apache.commons.io.DemuxTestCase.DATA2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1879,null,1878,getInput(org.apache.commons.io.DemuxTestCase.T2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,org.apache.commons.io.DemuxTestCase.DATA3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,null,1881,getInput(org.apache.commons.io.DemuxTestCase.T3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1883,org.apache.commons.io.DemuxTestCase.DATA4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1885,null,1884,getInput(org.apache.commons.io.DemuxTestCase.T4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInputStream_add1170() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInputStream_add1170");
        DemuxInputStream input = new DemuxInputStream();
        startReader(T1, DATA1, input);
        startReader(T2, DATA2, input);
        startReader(T2, DATA2, input);
        startReader(T3, DATA3, input);
        startReader(T4, DATA4, input);
        doStart();
        doJoin();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,org.apache.commons.io.DemuxTestCase.DATA1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,null,1875,getInput(org.apache.commons.io.DemuxTestCase.T1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1877,org.apache.commons.io.DemuxTestCase.DATA2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1879,null,1878,getInput(org.apache.commons.io.DemuxTestCase.T2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,org.apache.commons.io.DemuxTestCase.DATA3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,null,1881,getInput(org.apache.commons.io.DemuxTestCase.T3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1883,org.apache.commons.io.DemuxTestCase.DATA4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1885,null,1884,getInput(org.apache.commons.io.DemuxTestCase.T4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInputStream_add1171() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInputStream_add1171");
        DemuxInputStream input = new DemuxInputStream();
        startReader(T1, DATA1, input);
        startReader(T2, DATA2, input);
        startReader(T3, DATA3, input);
        startReader(T3, DATA3, input);
        startReader(T4, DATA4, input);
        doStart();
        doJoin();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,org.apache.commons.io.DemuxTestCase.DATA1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,null,1875,getInput(org.apache.commons.io.DemuxTestCase.T1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1877,org.apache.commons.io.DemuxTestCase.DATA2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1879,null,1878,getInput(org.apache.commons.io.DemuxTestCase.T2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,org.apache.commons.io.DemuxTestCase.DATA3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,null,1881,getInput(org.apache.commons.io.DemuxTestCase.T3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1883,org.apache.commons.io.DemuxTestCase.DATA4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1885,null,1884,getInput(org.apache.commons.io.DemuxTestCase.T4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInputStream_add1172() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInputStream_add1172");
        DemuxInputStream input = new DemuxInputStream();
        startReader(T1, DATA1, input);
        startReader(T2, DATA2, input);
        startReader(T3, DATA3, input);
        startReader(T4, DATA4, input);
        startReader(T4, DATA4, input);
        doStart();
        doJoin();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,org.apache.commons.io.DemuxTestCase.DATA1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,null,1875,getInput(org.apache.commons.io.DemuxTestCase.T1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1877,org.apache.commons.io.DemuxTestCase.DATA2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1879,null,1878,getInput(org.apache.commons.io.DemuxTestCase.T2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,org.apache.commons.io.DemuxTestCase.DATA3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,null,1881,getInput(org.apache.commons.io.DemuxTestCase.T3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1883,org.apache.commons.io.DemuxTestCase.DATA4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1885,null,1884,getInput(org.apache.commons.io.DemuxTestCase.T4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInputStream_add1173() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInputStream_add1173");
        DemuxInputStream input = new DemuxInputStream();
        startReader(T1, DATA1, input);
        startReader(T2, DATA2, input);
        startReader(T3, DATA3, input);
        startReader(T4, DATA4, input);
        doStart();
        doStart();
        doJoin();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,org.apache.commons.io.DemuxTestCase.DATA1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,null,1875,getInput(org.apache.commons.io.DemuxTestCase.T1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1877,org.apache.commons.io.DemuxTestCase.DATA2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1879,null,1878,getInput(org.apache.commons.io.DemuxTestCase.T2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,org.apache.commons.io.DemuxTestCase.DATA3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,null,1881,getInput(org.apache.commons.io.DemuxTestCase.T3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1883,org.apache.commons.io.DemuxTestCase.DATA4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1885,null,1884,getInput(org.apache.commons.io.DemuxTestCase.T4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInputStream_add1174() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInputStream_add1174");
        DemuxInputStream input = new DemuxInputStream();
        startReader(T1, DATA1, input);
        startReader(T2, DATA2, input);
        startReader(T3, DATA3, input);
        startReader(T4, DATA4, input);
        doStart();
        doJoin();
        doJoin();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,org.apache.commons.io.DemuxTestCase.DATA1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,null,1875,getInput(org.apache.commons.io.DemuxTestCase.T1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1877,org.apache.commons.io.DemuxTestCase.DATA2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1879,null,1878,getInput(org.apache.commons.io.DemuxTestCase.T2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,org.apache.commons.io.DemuxTestCase.DATA3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,null,1881,getInput(org.apache.commons.io.DemuxTestCase.T3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1883,org.apache.commons.io.DemuxTestCase.DATA4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1885,null,1884,getInput(org.apache.commons.io.DemuxTestCase.T4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInputStream_remove907() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInputStream_remove907");
        DemuxInputStream input = new DemuxInputStream();
        startReader(T2, DATA2, input);
        startReader(T3, DATA3, input);
        startReader(T4, DATA4, input);
        doStart();
        doJoin();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,org.apache.commons.io.DemuxTestCase.DATA1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,null,1875,getInput(org.apache.commons.io.DemuxTestCase.T1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1877,org.apache.commons.io.DemuxTestCase.DATA2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1879,null,1878,getInput(org.apache.commons.io.DemuxTestCase.T2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,org.apache.commons.io.DemuxTestCase.DATA3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,null,1881,getInput(org.apache.commons.io.DemuxTestCase.T3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1883,org.apache.commons.io.DemuxTestCase.DATA4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1885,null,1884,getInput(org.apache.commons.io.DemuxTestCase.T4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInputStream_remove908() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInputStream_remove908");
        DemuxInputStream input = new DemuxInputStream();
        startReader(T2, DATA2, input);
        startReader(T3, DATA3, input);
        startReader(T4, DATA4, input);
        doStart();
        doJoin();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,org.apache.commons.io.DemuxTestCase.DATA1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,null,1875,getInput(org.apache.commons.io.DemuxTestCase.T1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1877,org.apache.commons.io.DemuxTestCase.DATA2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1879,null,1878,getInput(org.apache.commons.io.DemuxTestCase.T2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,org.apache.commons.io.DemuxTestCase.DATA3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,null,1881,getInput(org.apache.commons.io.DemuxTestCase.T3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1883,org.apache.commons.io.DemuxTestCase.DATA4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1885,null,1884,getInput(org.apache.commons.io.DemuxTestCase.T4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInputStream_remove909() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInputStream_remove909");
        DemuxInputStream input = new DemuxInputStream();
        startReader(T2, DATA2, input);
        startReader(T3, DATA3, input);
        startReader(T4, DATA4, input);
        doStart();
        doJoin();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,org.apache.commons.io.DemuxTestCase.DATA1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,null,1875,getInput(org.apache.commons.io.DemuxTestCase.T1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1877,org.apache.commons.io.DemuxTestCase.DATA2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1879,null,1878,getInput(org.apache.commons.io.DemuxTestCase.T2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,org.apache.commons.io.DemuxTestCase.DATA3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,null,1881,getInput(org.apache.commons.io.DemuxTestCase.T3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1883,org.apache.commons.io.DemuxTestCase.DATA4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1885,null,1884,getInput(org.apache.commons.io.DemuxTestCase.T4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInputStream_remove910() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInputStream_remove910");
        DemuxInputStream input = new DemuxInputStream();
        startReader(T2, DATA2, input);
        startReader(T3, DATA3, input);
        startReader(T4, DATA4, input);
        doStart();
        doJoin();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,org.apache.commons.io.DemuxTestCase.DATA1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,null,1875,getInput(org.apache.commons.io.DemuxTestCase.T1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1877,org.apache.commons.io.DemuxTestCase.DATA2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1879,null,1878,getInput(org.apache.commons.io.DemuxTestCase.T2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,org.apache.commons.io.DemuxTestCase.DATA3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,null,1881,getInput(org.apache.commons.io.DemuxTestCase.T3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1883,org.apache.commons.io.DemuxTestCase.DATA4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1885,null,1884,getInput(org.apache.commons.io.DemuxTestCase.T4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInputStream_remove911() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInputStream_remove911");
        DemuxInputStream input = new DemuxInputStream();
        startReader(T1, DATA1, input);
        startReader(T2, DATA2, input);
        startReader(T3, DATA3, input);
        startReader(T4, DATA4, input);
        doJoin();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,org.apache.commons.io.DemuxTestCase.DATA1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,null,1875,getInput(org.apache.commons.io.DemuxTestCase.T1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1877,org.apache.commons.io.DemuxTestCase.DATA2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1879,null,1878,getInput(org.apache.commons.io.DemuxTestCase.T2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,org.apache.commons.io.DemuxTestCase.DATA3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,null,1881,getInput(org.apache.commons.io.DemuxTestCase.T3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1883,org.apache.commons.io.DemuxTestCase.DATA4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1885,null,1884,getInput(org.apache.commons.io.DemuxTestCase.T4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInputStream_remove912() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInputStream_remove912");
        DemuxInputStream input = new DemuxInputStream();
        startReader(T1, DATA1, input);
        startReader(T2, DATA2, input);
        startReader(T3, DATA3, input);
        startReader(T4, DATA4, input);
        doStart();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,org.apache.commons.io.DemuxTestCase.DATA1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,null,1875,getInput(org.apache.commons.io.DemuxTestCase.T1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1877,org.apache.commons.io.DemuxTestCase.DATA2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1879,null,1878,getInput(org.apache.commons.io.DemuxTestCase.T2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,org.apache.commons.io.DemuxTestCase.DATA3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,null,1881,getInput(org.apache.commons.io.DemuxTestCase.T3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1883,org.apache.commons.io.DemuxTestCase.DATA4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1885,null,1884,getInput(org.apache.commons.io.DemuxTestCase.T4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static class ReaderThread extends Thread {
        private StringBuffer m_buffer = new StringBuffer();

        private InputStream m_input;

        private DemuxInputStream m_demux;

        ReaderThread(String name ,InputStream input ,DemuxInputStream demux) {
            super(name);
            m_input = input;
            m_demux = demux;
        }

        public String getData() {
            return m_buffer.toString();
        }

        @Override
        public void run() {
            m_demux.bindStream(m_input);
            try {
                int ch = m_demux.read();
                while ((-1) != ch) {
                    m_buffer.append(((char)(ch)));
                    int sleepTime = java.lang.Math.abs(((DemuxTestCase.c_random.nextInt()) % 10));
                    Thread.sleep(sleepTime);
                    ch = m_demux.read();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static class WriterThread extends Thread {
        private byte[] m_data;

        private OutputStream m_output;

        private DemuxOutputStream m_demux;

        WriterThread(String name ,String data ,OutputStream output ,DemuxOutputStream demux) {
            super(name);
            m_output = output;
            m_demux = demux;
            m_data = data.getBytes();
        }

        @Override
        public void run() {
            m_demux.bindStream(m_output);
            for (byte element : m_data) {
                try {
                    m_demux.write(element);
                    int sleepTime = java.lang.Math.abs(((DemuxTestCase.c_random.nextInt()) % 10));
                    Thread.sleep(sleepTime);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


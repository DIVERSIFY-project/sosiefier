package fr.inria.diversify.sosie.compare;

import fr.inria.diversify.FileOutputStreamMock;
import fr.inria.diversify.sosie.compare.stackElement.StackTraceVariable;
import fr.inria.diversify.sosie.compare.stackTraceOperation.StackTrace;
import fr.inria.diversify.sosie.compare.stackTraceOperation.StackTracePop;
import fr.inria.diversify.sosie.compare.stackTraceOperation.StackTracePush;
import fr.inria.diversify.sosie.compare.stackTraceOperation.StackTraceVariableObservation;
import fr.inria.diversify.sosie.logger.InstruCompactLog;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by marodrig on 01/07/2014.
 */
public class StackElementReaderTest {

    private void buildDataAndReader(InstruCompactLog log, Thread t) {
        log.writeTestStart(t, "sampleTest");
        log.methodCall(t, "foo");
        log.methodOut(t);
        log.methodCall(t, "bar");
        log.writeTestStart(t, "sampleTest2");
    }

    @Test
    public void testRead_Methods() throws IOException {

        //Create some data and store the result in the mocked array instead of the file
        FileOutputStreamMock mock = new FileOutputStreamMock();
        InstruCompactLog log = new InstruCompactLog("logTest");
        Thread t = Thread.currentThread();

        //Build some data for the reader
        log.writeTestStart(t, "sampleTest");
        log.methodCall(t, "foo");
        log.methodOut(t);
        log.methodCall(t, "bar");
        log.writeTestStart(t, "sampleTest2");
        log.close();

        //Make the reader read from the byte[] buffer
        StackElementBinaryReader reader = new StackElementBinaryReader();
        List<StackTrace> st = reader.loadLog(new DataInputStream(new ByteArrayInputStream(mock.buffer)));

        Assert.assertEquals(2, st.size());
        Assert.assertEquals("sampleTest", st.get(0).getName());
        Assert.assertEquals("sampleTest2", st.get(1).getName());
        Assert.assertEquals("bar", st.get(0).getTop().getMethod());
        Assert.assertTrue(st.get(0).getStackTraceOperations().get(2) instanceof StackTracePush);

    }

    @Test
    public void testVar() throws IOException {
        //Create some data and store the result in the mocked array instead of the file
        FileOutputStreamMock mock = new FileOutputStreamMock();
        InstruCompactLog log = new InstruCompactLog("logTest");
        Thread t = Thread.currentThread();

        //Build some data for the reader
        log.writeTestStart(t, "sampleTest");
        Object[] a = { 4, 10 };
        log.writeVar(10, t, "A", a);
        Object[] b = { 422, 1000 };
        log.writeVar(10, t, "A", b);
        log.close();

        //Make the reader read from the byte[] buffer
        StackElementBinaryReader reader = new StackElementBinaryReader();
        List<StackTrace> st = reader.loadLog(new DataInputStream(new ByteArrayInputStream(mock.buffer)));

        Assert.assertEquals(2, st.get(0).getStackTraceOperations().size());
        Assert.assertTrue(st.get(0).getStackTraceOperations().get(1) instanceof StackTraceVariableObservation);
        Map<String, Object> vars =
                ((StackTraceVariableObservation)st.get(0).getStackTraceOperations().get(1)).getVars().getVariables();
        Assert.assertTrue(vars.containsValue("1000"));

    }

    @Test
    public void testRead_Exception() throws IOException {
        //Create some data and store the result in the mocked array instead of the file
        FileOutputStreamMock mock = new FileOutputStreamMock();
        InstruCompactLog log = new InstruCompactLog("logTest");
        Thread t = Thread.currentThread();

        //Build some data for the reader
        log.writeTestStart(t, "sampleTest");
        log.methodCall(t, "foo");
        log.writeException(10, t, "A", "foo", new Exception("e"));
        log.close();

        //Make the reader read from the byte[] buffer
        StackElementBinaryReader reader = new StackElementBinaryReader();
        List<StackTrace> st = reader.loadLog(new DataInputStream(new ByteArrayInputStream(mock.buffer)));

        Assert.assertEquals("foo", st.get(0).getTop().getMethod());
        Assert.assertTrue(st.get(0).getStackTraceOperations().size() > 0);
    }

}

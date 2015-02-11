//package org.apache.commons.io.input;
//
//import java.io.ByteArrayInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import org.junit.Test;
//import junit.framework.TestCase;
//
///** 
// * JUnit Test Case for {@link AutoCloseInputStream}.
// */
//public class AutoCloseInputStreamTest extends TestCase {
//    private byte[] data;
//
//    private InputStream stream;
//
//    private boolean closed;
//
//    @Override
//    protected void setUp() {
//        data = new byte[]{ 'x' , 'y' , 'z' };
//        stream = new AutoCloseInputStream(new ByteArrayInputStream(data) {
//            @Override
//            public void close() {
//                closed = true;
//            }
//        });
//        closed = false;
//    }
//
//    /** 
//     * Test the <code>close()</code> method.
//     */
//@Test(timeout = 1000)
//    public void testClose() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose");
//        stream.close();
//        stream.close();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),235,closed);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,stream,237,stream.read());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    /** 
//     * Test the <code>close()</code> method.
//     */
//@Test(timeout = 1000)
//    public void testClose_remove9() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose_remove9");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),235,closed);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,stream,237,stream.read());
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    /** 
//     * Test the <code>read(b)</code> method.
//     */
//public void testRead() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead");
//        byte[] b = new byte[(data.length) * 1];
//        int total = 0;
//        for (int n = 0 ; n != (-1) ; n = stream.read(b)) {
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,closed);
//            for (int i = 0 ; i < n ; i++) {
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),249,data[(total + i)]);
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,b[i]);
//            }
//            total += n;
//        }
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),251,data.length);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,total);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),253,closed);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,stream,255,stream.read(b));
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    /** 
//     * Test the <code>read(b)</code> method.
//     */
//public void testReadBuffer() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadBuffer");
//        byte[] b = new byte[(data.length) * 2];
//        int total = -1;
//        for (int n = 0 ; n != (-1) ; n = stream.read(b)) {
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,closed);
//            for (int i = 0 ; i < n ; i++) {
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),249,data[(total + i)]);
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,b[i]);
//            }
//            total += n;
//        }
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),251,data.length);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,total);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),253,closed);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,stream,255,stream.read(b));
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    /** 
//     * Test the <code>read(b)</code> method.
//     */
//public void testReadBuffer_literalMutation197() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadBuffer_literalMutation197");
//        byte[] b = new byte[(data.length) * 2];
//        int total = 0;
//        for (int n = 1 ; n != (-1) ; n = stream.read(b)) {
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,closed);
//            for (int i = 0 ; i < n ; i++) {
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),249,data[(total + i)]);
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,b[i]);
//            }
//            total += n;
//        }
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),251,data.length);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,total);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),253,closed);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,stream,255,stream.read(b));
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    /** 
//     * Test the <code>read(b)</code> method.
//     */
//public void testReadBuffer_literalMutation198() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadBuffer_literalMutation198");
//        byte[] b = new byte[(data.length) * 2];
//        int total = 0;
//        for (int n = 0 ; n != 2 ; n = stream.read(b)) {
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,closed);
//            for (int i = 0 ; i < n ; i++) {
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),249,data[(total + i)]);
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,b[i]);
//            }
//            total += n;
//        }
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),251,data.length);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,total);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),253,closed);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,stream,255,stream.read(b));
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    /** 
//     * Test the <code>read(b)</code> method.
//     */
//public void testReadBuffer_literalMutation199() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadBuffer_literalMutation199");
//        byte[] b = new byte[(data.length) * 2];
//        int total = 0;
//        for (int n = 0 ; n != (-1) ; n = stream.read(b)) {
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,closed);
//            for (int i = 1 ; i < n ; i++) {
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),249,data[(total + i)]);
//                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,b[i]);
//            }
//            total += n;
//        }
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),251,data.length);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,total);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),253,closed);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,stream,255,stream.read(b));
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    /** 
//     * Test the <code>read(b, off, len)</code> method.
//     */
//public void testReadBufferOffsetLength() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadBufferOffsetLength");
//        byte[] b = new byte[(data.length) * 1];
//        int total = 0;
//        for (int n = 0 ; n != (-1) ; n = stream.read(b, total, ((b.length) - total))) {
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),239,closed);
//            total += n;
//        }
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,data.length);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),241,total);
//        for (int i = 0 ; i < (data.length) ; i++) {
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,data[i]);
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),243,b[i]);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,closed);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),245,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),247,stream,246,stream.read(b, 0, b.length));
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    /** 
//     * Test the <code>read(b, off, len)</code> method.
//     */
//public void testReadBufferOffsetLength_literalMutation201() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadBufferOffsetLength_literalMutation201");
//        byte[] b = new byte[(data.length) * 2];
//        int total = 1;
//        for (int n = 0 ; n != (-1) ; n = stream.read(b, total, ((b.length) - total))) {
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),239,closed);
//            total += n;
//        }
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,data.length);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),241,total);
//        for (int i = 0 ; i < (data.length) ; i++) {
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,data[i]);
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),243,b[i]);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,closed);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),245,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),247,stream,246,stream.read(b, 0, b.length));
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    /** 
//     * Test the <code>read(b, off, len)</code> method.
//     */
//public void testReadBufferOffsetLength_literalMutation202() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadBufferOffsetLength_literalMutation202");
//        byte[] b = new byte[(data.length) * 2];
//        int total = 0;
//        for (int n = 1 ; n != (-1) ; n = stream.read(b, total, ((b.length) - total))) {
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),239,closed);
//            total += n;
//        }
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,data.length);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),241,total);
//        for (int i = 0 ; i < (data.length) ; i++) {
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,data[i]);
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),243,b[i]);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,closed);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),245,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),247,stream,246,stream.read(b, 0, b.length));
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    /** 
//     * Test the <code>read(b, off, len)</code> method.
//     */
//public void testReadBufferOffsetLength_literalMutation203() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadBufferOffsetLength_literalMutation203");
//        byte[] b = new byte[(data.length) * 2];
//        int total = 0;
//        for (int n = 0 ; n != 0 ; n = stream.read(b, total, ((b.length) - total))) {
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),239,closed);
//            total += n;
//        }
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,data.length);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),241,total);
//        for (int i = 0 ; i < (data.length) ; i++) {
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,data[i]);
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),243,b[i]);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,closed);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),245,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),247,stream,246,stream.read(b, 0, b.length));
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    /** 
//     * Test the <code>read(b, off, len)</code> method.
//     */
//public void testReadBufferOffsetLength_literalMutation204() throws IOException {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadBufferOffsetLength_literalMutation204");
//        byte[] b = new byte[(data.length) * 2];
//        int total = 0;
//        for (int n = 0 ; n != (-1) ; n = stream.read(b, total, ((b.length) - total))) {
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),239,closed);
//            total += n;
//        }
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,data.length);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),241,total);
//        for (int i = 1 ; i < (data.length) ; i++) {
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,data[i]);
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),243,b[i]);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,closed);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),245,-1);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),247,stream,246,stream.read(b, 0, b.length));
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//}
//

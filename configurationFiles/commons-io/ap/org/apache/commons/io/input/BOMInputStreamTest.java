package org.apache.commons.io.input;

import java.io.ByteArrayInputStream;
import org.apache.commons.io.ByteOrderMark;
import java.io.IOException;
import java.io.InputStream;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * Test case for {@link BOMInputStream}.
 * 
 * @version $Id$
 */
public class BOMInputStreamTest extends TestCase {
    /** 
     * Creates the underlying data stream, with or without BOM.
     */
public InputStream createDataStream(byte[] baseData, boolean addBOM) {
        byte[] data = baseData;
        if (addBOM) {
            data = new byte[(baseData.length) + 3];
            data[0] = ((byte)(239));
            data[1] = ((byte)(187));
            data[2] = ((byte)(191));
            java.lang.System.arraycopy(baseData, 0, data, 3, baseData.length);
        } 
        return new ByteArrayInputStream(data);
    }

    private void assertData(byte[] expected, byte[] actual, int len) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,expected.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),259,len);
        for (int ii = 0 ; ii < (expected.length) ; ii++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,("byte " + ii));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),261,expected[ii]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,actual[ii]);
        }
    }

    /** 
     * A mock InputStream that expects <code>close()</code> to be called.
     */
private static class ExpectCloseInputStream extends InputStream {
        private boolean _closeCalled;

        @Override
        public void close() throws IOException {
            _closeCalled = true;
        }

        @Override
        public int read() throws IOException {
            return -1;
        }

        public void assertCloseCalled() {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),257,_closeCalled);
        }
    }

    @Test(timeout = 1000)
    public void testSupportCode_add146() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSupportCode_add146");
        InputStream in = createDataStream(new byte[]{ 'A' , 'B' }, true);
        byte[] buf = new byte[1024];
        int len = in.read(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),434,len);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),435,((buf[0]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),436,((buf[1]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),437,((buf[2]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),438,((buf[3]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),439,((buf[4]) & 255));
        assertData(new byte[]{ ((byte)(239)) , ((byte)(187)) , ((byte)(191)) , 'A' , 'B' }, buf, len);
        assertData(new byte[]{ ((byte)(239)) , ((byte)(187)) , ((byte)(191)) , 'A' , 'B' }, buf, len);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSupportCode() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSupportCode");
        InputStream in = createDataStream(new byte[]{ 'A' , 'B' }, false);
        byte[] buf = new byte[1024];
        int len = in.read(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),434,len);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),435,((buf[0]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),436,((buf[1]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),437,((buf[2]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),438,((buf[3]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),439,((buf[4]) & 255));
        assertData(new byte[]{ ((byte)(239)) , ((byte)(187)) , ((byte)(191)) , 'A' , 'B' }, buf, len);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSupportCode_literalMutation670() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSupportCode_literalMutation670");
        InputStream in = createDataStream(new byte[]{ 'A' , 'B' }, true);
        byte[] buf = new byte[1025];
        int len = in.read(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),434,len);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),435,((buf[0]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),436,((buf[1]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),437,((buf[2]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),438,((buf[3]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),439,((buf[4]) & 255));
        assertData(new byte[]{ ((byte)(239)) , ((byte)(187)) , ((byte)(191)) , 'A' , 'B' }, buf, len);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSupportCode_literalMutation671() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSupportCode_literalMutation671");
        InputStream in = createDataStream(new byte[]{ 'A' , 'B' }, true);
        byte[] buf = new byte[512];
        int len = in.read(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),434,len);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),435,((buf[0]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),436,((buf[1]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),437,((buf[2]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),438,((buf[3]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),439,((buf[4]) & 255));
        assertData(new byte[]{ ((byte)(239)) , ((byte)(187)) , ((byte)(191)) , 'A' , 'B' }, buf, len);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSupportCode_literalMutation672() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSupportCode_literalMutation672");
        InputStream in = createDataStream(new byte[]{ 'A' , 'B' }, true);
        byte[] buf = new byte[2048];
        int len = in.read(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),434,len);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),435,((buf[0]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),436,((buf[1]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),437,((buf[2]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),438,((buf[3]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),439,((buf[4]) & 255));
        assertData(new byte[]{ ((byte)(239)) , ((byte)(187)) , ((byte)(191)) , 'A' , 'B' }, buf, len);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSupportCode_literalMutation673() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSupportCode_literalMutation673");
        InputStream in = createDataStream(new byte[]{ 'A' , 'B' }, true);
        byte[] buf = new byte[1023];
        int len = in.read(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),434,len);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),435,((buf[0]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),436,((buf[1]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),437,((buf[2]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),438,((buf[3]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),439,((buf[4]) & 255));
        assertData(new byte[]{ ((byte)(239)) , ((byte)(187)) , ((byte)(191)) , 'A' , 'B' }, buf, len);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSupportCode_literalMutation674() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSupportCode_literalMutation674");
        InputStream in = createDataStream(new byte[]{ 'A' , 'B' }, true);
        byte[] buf = new byte[1024];
        int len = in.read(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),434,len);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),435,((buf[0]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),436,((buf[1]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),437,((buf[2]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),438,((buf[3]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),439,((buf[4]) & 255));
        assertData(new byte[]{ ((byte)(238)) , ((byte)(187)) , ((byte)(191)) , 'A' , 'B' }, buf, len);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSupportCode_literalMutation675() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSupportCode_literalMutation675");
        InputStream in = createDataStream(new byte[]{ 'A' , 'B' }, true);
        byte[] buf = new byte[1024];
        int len = in.read(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),434,len);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),435,((buf[0]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),436,((buf[1]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),437,((buf[2]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),438,((buf[3]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),439,((buf[4]) & 255));
        assertData(new byte[]{ ((byte)(119)) , ((byte)(187)) , ((byte)(191)) , 'A' , 'B' }, buf, len);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSupportCode_literalMutation676() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSupportCode_literalMutation676");
        InputStream in = createDataStream(new byte[]{ 'A' , 'B' }, true);
        byte[] buf = new byte[1024];
        int len = in.read(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),434,len);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),435,((buf[0]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),436,((buf[1]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),437,((buf[2]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),438,((buf[3]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),439,((buf[4]) & 255));
        assertData(new byte[]{ ((byte)(478)) , ((byte)(187)) , ((byte)(191)) , 'A' , 'B' }, buf, len);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSupportCode_literalMutation677() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSupportCode_literalMutation677");
        InputStream in = createDataStream(new byte[]{ 'A' , 'B' }, true);
        byte[] buf = new byte[1024];
        int len = in.read(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),434,len);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),435,((buf[0]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),436,((buf[1]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),437,((buf[2]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),438,((buf[3]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),439,((buf[4]) & 255));
        assertData(new byte[]{ ((byte)(240)) , ((byte)(187)) , ((byte)(191)) , 'A' , 'B' }, buf, len);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSupportCode_literalMutation678() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSupportCode_literalMutation678");
        InputStream in = createDataStream(new byte[]{ 'A' , 'B' }, true);
        byte[] buf = new byte[1024];
        int len = in.read(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),434,len);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),435,((buf[0]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),436,((buf[1]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),437,((buf[2]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),438,((buf[3]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),439,((buf[4]) & 255));
        assertData(new byte[]{ ((byte)(239)) , ((byte)(188)) , ((byte)(191)) , 'A' , 'B' }, buf, len);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSupportCode_literalMutation679() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSupportCode_literalMutation679");
        InputStream in = createDataStream(new byte[]{ 'A' , 'B' }, true);
        byte[] buf = new byte[1024];
        int len = in.read(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),434,len);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),435,((buf[0]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),436,((buf[1]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),437,((buf[2]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),438,((buf[3]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),439,((buf[4]) & 255));
        assertData(new byte[]{ ((byte)(239)) , ((byte)(186)) , ((byte)(191)) , 'A' , 'B' }, buf, len);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSupportCode_literalMutation680() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSupportCode_literalMutation680");
        InputStream in = createDataStream(new byte[]{ 'A' , 'B' }, true);
        byte[] buf = new byte[1024];
        int len = in.read(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),434,len);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),435,((buf[0]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),436,((buf[1]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),437,((buf[2]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),438,((buf[3]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),439,((buf[4]) & 255));
        assertData(new byte[]{ ((byte)(239)) , ((byte)(93)) , ((byte)(191)) , 'A' , 'B' }, buf, len);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSupportCode_literalMutation681() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSupportCode_literalMutation681");
        InputStream in = createDataStream(new byte[]{ 'A' , 'B' }, true);
        byte[] buf = new byte[1024];
        int len = in.read(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),434,len);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),435,((buf[0]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),436,((buf[1]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),437,((buf[2]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),438,((buf[3]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),439,((buf[4]) & 255));
        assertData(new byte[]{ ((byte)(239)) , ((byte)(374)) , ((byte)(191)) , 'A' , 'B' }, buf, len);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSupportCode_literalMutation682() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSupportCode_literalMutation682");
        InputStream in = createDataStream(new byte[]{ 'A' , 'B' }, true);
        byte[] buf = new byte[1024];
        int len = in.read(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),434,len);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),435,((buf[0]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),436,((buf[1]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),437,((buf[2]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),438,((buf[3]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),439,((buf[4]) & 255));
        assertData(new byte[]{ ((byte)(239)) , ((byte)(187)) , ((byte)(190)) , 'A' , 'B' }, buf, len);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSupportCode_literalMutation683() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSupportCode_literalMutation683");
        InputStream in = createDataStream(new byte[]{ 'A' , 'B' }, true);
        byte[] buf = new byte[1024];
        int len = in.read(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),434,len);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),435,((buf[0]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),436,((buf[1]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),437,((buf[2]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),438,((buf[3]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),439,((buf[4]) & 255));
        assertData(new byte[]{ ((byte)(239)) , ((byte)(187)) , ((byte)(95)) , 'A' , 'B' }, buf, len);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSupportCode_literalMutation684() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSupportCode_literalMutation684");
        InputStream in = createDataStream(new byte[]{ 'A' , 'B' }, true);
        byte[] buf = new byte[1024];
        int len = in.read(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),434,len);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),435,((buf[0]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),436,((buf[1]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),437,((buf[2]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),438,((buf[3]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),439,((buf[4]) & 255));
        assertData(new byte[]{ ((byte)(239)) , ((byte)(187)) , ((byte)(382)) , 'A' , 'B' }, buf, len);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSupportCode_literalMutation685() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSupportCode_literalMutation685");
        InputStream in = createDataStream(new byte[]{ 'A' , 'B' }, true);
        byte[] buf = new byte[1024];
        int len = in.read(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),434,len);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),435,((buf[0]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),436,((buf[1]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),437,((buf[2]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),438,((buf[3]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),439,((buf[4]) & 255));
        assertData(new byte[]{ ((byte)(239)) , ((byte)(187)) , ((byte)(192)) , 'A' , 'B' }, buf, len);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSupportCode_remove41() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSupportCode_remove41");
        InputStream in = createDataStream(new byte[]{ 'A' , 'B' }, true);
        byte[] buf = new byte[1024];
        int len = in.read(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),434,len);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),435,((buf[0]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),436,((buf[1]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),437,((buf[2]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),438,((buf[3]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),439,((buf[4]) & 255));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadWithoutBOM() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWithoutBOM");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        BOMInputStream in = new BOMInputStream(createDataStream(data, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),416,in,415,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),418,in,417,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),420,in,419,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),421,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),423,in,422,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),425,in,424,in.hasBOM());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),427,in,426,in.hasBOM(org.apache.commons.io.ByteOrderMark.UTF_8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),429,in,428,in.getBOM());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadEmpty() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadEmpty");
        byte[] data = new byte[]{  };
        BOMInputStream in = new BOMInputStream(createDataStream(data, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),339,in,338,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),341,in,340,in.hasBOM());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,in,342,in.hasBOM(org.apache.commons.io.ByteOrderMark.UTF_8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),345,in,344,in.getBOM());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSmall() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSmall");
        byte[] data = new byte[]{ 'A' , 'B' };
        BOMInputStream in = new BOMInputStream(createDataStream(data, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),347,in,346,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),349,in,348,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),350,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),352,in,351,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),354,in,353,in.hasBOM());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),356,in,355,in.hasBOM(org.apache.commons.io.ByteOrderMark.UTF_8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),358,in,357,in.getBOM());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadWithBOM_add139() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWithBOM_add139");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        BOMInputStream in = new BOMInputStream(createDataStream(data, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),382,in,381,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),384,in,383,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),386,in,385,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),387,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),389,in,388,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),391,in,390,in.hasBOM());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),393,in,392,in.hasBOM(org.apache.commons.io.ByteOrderMark.UTF_8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),394,org.apache.commons.io.ByteOrderMark.UTF_8);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),396,in,395,in.getBOM());
        try {
            in.hasBOM(ByteOrderMark.UTF_16BE);
            in.hasBOM(ByteOrderMark.UTF_16BE);
        } catch (IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadWithBOM() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWithBOM");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        BOMInputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),382,in,381,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),384,in,383,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),386,in,385,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),387,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),389,in,388,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),391,in,390,in.hasBOM());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),393,in,392,in.hasBOM(org.apache.commons.io.ByteOrderMark.UTF_8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),394,org.apache.commons.io.ByteOrderMark.UTF_8);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),396,in,395,in.getBOM());
        try {
            in.hasBOM(ByteOrderMark.UTF_16BE);
        } catch (IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetBOMFirstThenRead() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetBOMFirstThenRead");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        BOMInputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),296,org.apache.commons.io.ByteOrderMark.UTF_8);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),298,in,297,in.getBOM());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),300,in,299,in.hasBOM());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),302,in,301,in.hasBOM(org.apache.commons.io.ByteOrderMark.UTF_8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),304,in,303,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,in,305,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,in,307,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),309,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),311,in,310,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadWithBOMInclude() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWithBOMInclude");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        BOMInputStream in = new BOMInputStream(createDataStream(data, false) , true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),360,in,359,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),362,in,361,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),364,in,363,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),366,in,365,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),368,in,367,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),370,in,369,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),371,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),373,in,372,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),375,in,374,in.hasBOM());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),377,in,376,in.hasBOM(org.apache.commons.io.ByteOrderMark.UTF_8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),378,org.apache.commons.io.ByteOrderMark.UTF_8);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),380,in,379,in.getBOM());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadWithBOMInclude_literalMutation596() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWithBOMInclude_literalMutation596");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        BOMInputStream in = new BOMInputStream(createDataStream(data, true) , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),360,in,359,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),362,in,361,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),364,in,363,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),366,in,365,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),368,in,367,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),370,in,369,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),371,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),373,in,372,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),375,in,374,in.hasBOM());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),377,in,376,in.hasBOM(org.apache.commons.io.ByteOrderMark.UTF_8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),378,org.apache.commons.io.ByteOrderMark.UTF_8);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),380,in,379,in.getBOM());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetBOMFirstThenReadInclude() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetBOMFirstThenReadInclude");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        BOMInputStream in = new BOMInputStream(createDataStream(data, false) , true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),275,in,274,in.hasBOM());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),277,in,276,in.hasBOM(org.apache.commons.io.ByteOrderMark.UTF_8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,org.apache.commons.io.ByteOrderMark.UTF_8);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,in,279,in.getBOM());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,in,281,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,in,283,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,in,285,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,in,287,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,in,289,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,in,291,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),293,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),295,in,294,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetBOMFirstThenReadInclude_literalMutation488() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetBOMFirstThenReadInclude_literalMutation488");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        BOMInputStream in = new BOMInputStream(createDataStream(data, true) , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),275,in,274,in.hasBOM());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),277,in,276,in.hasBOM(org.apache.commons.io.ByteOrderMark.UTF_8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,org.apache.commons.io.ByteOrderMark.UTF_8);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,in,279,in.getBOM());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,in,281,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,in,283,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,in,285,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,in,287,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,in,289,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,in,291,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),293,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),295,in,294,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadWithMultipleBOM() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWithMultipleBOM");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        BOMInputStream in = new BOMInputStream(createDataStream(data, false) , ByteOrderMark.UTF_16BE , ByteOrderMark.UTF_8);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),398,in,397,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),400,in,399,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),402,in,401,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),403,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),405,in,404,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),407,in,406,in.hasBOM());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),409,in,408,in.hasBOM(org.apache.commons.io.ByteOrderMark.UTF_8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),411,in,410,in.hasBOM(org.apache.commons.io.ByteOrderMark.UTF_16BE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),412,org.apache.commons.io.ByteOrderMark.UTF_8);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),414,in,413,in.getBOM());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmptyBufferWithoutBOM() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyBufferWithoutBOM");
        byte[] data = new byte[]{  };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        byte[] buf = new byte[1024];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),271,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),273,in,272,in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmptyBufferWithoutBOM_literalMutation476() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyBufferWithoutBOM_literalMutation476");
        byte[] data = new byte[]{  };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1025];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),271,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),273,in,272,in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmptyBufferWithoutBOM_literalMutation477() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyBufferWithoutBOM_literalMutation477");
        byte[] data = new byte[]{  };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[512];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),271,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),273,in,272,in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmptyBufferWithoutBOM_literalMutation478() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyBufferWithoutBOM_literalMutation478");
        byte[] data = new byte[]{  };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[2048];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),271,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),273,in,272,in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmptyBufferWithoutBOM_literalMutation479() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyBufferWithoutBOM_literalMutation479");
        byte[] data = new byte[]{  };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1023];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),271,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),273,in,272,in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmptyBufferWithBOM() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyBufferWithBOM");
        byte[] data = new byte[]{  };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1024];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,in,269,in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmptyBufferWithBOM_literalMutation471() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyBufferWithBOM_literalMutation471");
        byte[] data = new byte[]{  };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        byte[] buf = new byte[1025];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,in,269,in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmptyBufferWithBOM_literalMutation472() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyBufferWithBOM_literalMutation472");
        byte[] data = new byte[]{  };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        byte[] buf = new byte[512];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,in,269,in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmptyBufferWithBOM_literalMutation473() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyBufferWithBOM_literalMutation473");
        byte[] data = new byte[]{  };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        byte[] buf = new byte[2048];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,in,269,in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmptyBufferWithBOM_literalMutation474() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyBufferWithBOM_literalMutation474");
        byte[] data = new byte[]{  };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        byte[] buf = new byte[1023];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,in,269,in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLargeBufferWithoutBOM_add117() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeBufferWithoutBOM_add117");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1024];
        assertData(data, buf, in.read(buf));
        assertData(data, buf, in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLargeBufferWithoutBOM() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeBufferWithoutBOM");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        byte[] buf = new byte[1024];
        assertData(data, buf, in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLargeBufferWithoutBOM_literalMutation501() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeBufferWithoutBOM_literalMutation501");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1025];
        assertData(data, buf, in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLargeBufferWithoutBOM_literalMutation502() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeBufferWithoutBOM_literalMutation502");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[512];
        assertData(data, buf, in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLargeBufferWithoutBOM_literalMutation503() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeBufferWithoutBOM_literalMutation503");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[2048];
        assertData(data, buf, in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLargeBufferWithoutBOM_literalMutation504() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeBufferWithoutBOM_literalMutation504");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1023];
        assertData(data, buf, in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLargeBufferWithoutBOM_remove13() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeBufferWithoutBOM_remove13");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1024];
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLargeBufferWithBOM_add116() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeBufferWithBOM_add116");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        byte[] buf = new byte[1024];
        assertData(data, buf, in.read(buf));
        assertData(data, buf, in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLargeBufferWithBOM() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeBufferWithBOM");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1024];
        assertData(data, buf, in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLargeBufferWithBOM_literalMutation493() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeBufferWithBOM_literalMutation493");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        byte[] buf = new byte[1025];
        assertData(data, buf, in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLargeBufferWithBOM_literalMutation494() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeBufferWithBOM_literalMutation494");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        byte[] buf = new byte[512];
        assertData(data, buf, in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLargeBufferWithBOM_literalMutation495() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeBufferWithBOM_literalMutation495");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        byte[] buf = new byte[2048];
        assertData(data, buf, in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLargeBufferWithBOM_literalMutation496() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeBufferWithBOM_literalMutation496");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        byte[] buf = new byte[1023];
        assertData(data, buf, in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLargeBufferWithBOM_remove12() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeBufferWithBOM_remove12");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        byte[] buf = new byte[1024];
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSmallBufferWithoutBOM_add144() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithoutBOM_add144");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1024];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 0, 2));
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 0, 2));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSmallBufferWithoutBOM_add145() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithoutBOM_add145");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1024];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 0, 2));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 2));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallBufferWithoutBOM() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithoutBOM");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        byte[] buf = new byte[1024];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 0, 2));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallBufferWithoutBOM_literalMutation648() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithoutBOM_literalMutation648");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1025];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 0, 2));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallBufferWithoutBOM_literalMutation649() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithoutBOM_literalMutation649");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[512];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 0, 2));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallBufferWithoutBOM_literalMutation650() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithoutBOM_literalMutation650");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[2048];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 0, 2));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallBufferWithoutBOM_literalMutation651() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithoutBOM_literalMutation651");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1023];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 0, 2));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallBufferWithoutBOM_literalMutation654() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithoutBOM_literalMutation654");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1024];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 1, 2));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallBufferWithoutBOM_literalMutation655() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithoutBOM_literalMutation655");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1024];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, -1, 2));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallBufferWithoutBOM_literalMutation656() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithoutBOM_literalMutation656");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1024];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 0, 2));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallBufferWithoutBOM_literalMutation657() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithoutBOM_literalMutation657");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1024];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 0, 1));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallBufferWithoutBOM_literalMutation658() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithoutBOM_literalMutation658");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1024];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 0, 4));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallBufferWithoutBOM_literalMutation659() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithoutBOM_literalMutation659");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1024];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 0, 3));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallBufferWithoutBOM_literalMutation661() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithoutBOM_literalMutation661");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1024];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 0, 2));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 1, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallBufferWithoutBOM_literalMutation662() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithoutBOM_literalMutation662");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1024];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 0, 2));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, -1, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallBufferWithoutBOM_literalMutation663() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithoutBOM_literalMutation663");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1024];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 0, 2));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallBufferWithoutBOM_literalMutation664() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithoutBOM_literalMutation664");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1024];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 0, 2));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallBufferWithoutBOM_literalMutation665() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithoutBOM_literalMutation665");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1024];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 0, 2));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallBufferWithoutBOM_literalMutation666() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithoutBOM_literalMutation666");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1024];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 0, 2));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSmallBufferWithoutBOM_remove39() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithoutBOM_remove39");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1024];
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSmallBufferWithoutBOM_remove40() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithoutBOM_remove40");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1024];
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSmallBufferWithBOM_add142() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithBOM_add142");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        byte[] buf = new byte[1024];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 0, 2));
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 0, 2));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSmallBufferWithBOM_add143() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithBOM_add143");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        byte[] buf = new byte[1024];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 0, 2));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 2));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallBufferWithBOM() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithBOM");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1024];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 0, 2));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallBufferWithBOM_literalMutation625() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithBOM_literalMutation625");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        byte[] buf = new byte[1025];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 0, 2));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallBufferWithBOM_literalMutation626() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithBOM_literalMutation626");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        byte[] buf = new byte[512];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 0, 2));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallBufferWithBOM_literalMutation627() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithBOM_literalMutation627");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        byte[] buf = new byte[2048];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 0, 2));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallBufferWithBOM_literalMutation628() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithBOM_literalMutation628");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        byte[] buf = new byte[1023];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 0, 2));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallBufferWithBOM_literalMutation631() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithBOM_literalMutation631");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        byte[] buf = new byte[1024];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 1, 2));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallBufferWithBOM_literalMutation632() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithBOM_literalMutation632");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        byte[] buf = new byte[1024];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, -1, 2));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallBufferWithBOM_literalMutation633() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithBOM_literalMutation633");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        byte[] buf = new byte[1024];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 0, 2));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallBufferWithBOM_literalMutation634() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithBOM_literalMutation634");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        byte[] buf = new byte[1024];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 0, 1));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallBufferWithBOM_literalMutation635() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithBOM_literalMutation635");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        byte[] buf = new byte[1024];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 0, 4));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallBufferWithBOM_literalMutation636() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithBOM_literalMutation636");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        byte[] buf = new byte[1024];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 0, 3));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallBufferWithBOM_literalMutation638() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithBOM_literalMutation638");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        byte[] buf = new byte[1024];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 0, 2));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 1, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallBufferWithBOM_literalMutation639() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithBOM_literalMutation639");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        byte[] buf = new byte[1024];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 0, 2));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, -1, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallBufferWithBOM_literalMutation640() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithBOM_literalMutation640");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        byte[] buf = new byte[1024];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 0, 2));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallBufferWithBOM_literalMutation641() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithBOM_literalMutation641");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        byte[] buf = new byte[1024];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 0, 2));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallBufferWithBOM_literalMutation642() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithBOM_literalMutation642");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        byte[] buf = new byte[1024];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 0, 2));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallBufferWithBOM_literalMutation643() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithBOM_literalMutation643");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        byte[] buf = new byte[1024];
        assertData(new byte[]{ 'A' , 'B' }, buf, in.read(buf, 0, 2));
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSmallBufferWithBOM_remove37() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithBOM_remove37");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        byte[] buf = new byte[1024];
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSmallBufferWithBOM_remove38() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallBufferWithBOM_remove38");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        byte[] buf = new byte[1024];
        assertData(new byte[]{ 'C' }, buf, in.read(buf, 0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLeadingNonBOMSingleRead() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLeadingNonBOMSingleRead");
        byte[] data = new byte[]{ ((byte)(238)) , ((byte)(171)) , ((byte)(205)) };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,in,312,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,in,314,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,in,316,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,in,319,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLeadingNonBOMSingleRead_literalMutation523() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLeadingNonBOMSingleRead_literalMutation523");
        byte[] data = new byte[]{ ((byte)(119)) , ((byte)(171)) , ((byte)(205)) };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,in,312,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,in,314,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,in,316,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,in,319,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLeadingNonBOMSingleRead_literalMutation524() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLeadingNonBOMSingleRead_literalMutation524");
        byte[] data = new byte[]{ ((byte)(478)) , ((byte)(171)) , ((byte)(205)) };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,in,312,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,in,314,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,in,316,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,in,319,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLeadingNonBOMSingleRead_literalMutation525() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLeadingNonBOMSingleRead_literalMutation525");
        byte[] data = new byte[]{ ((byte)(240)) , ((byte)(171)) , ((byte)(205)) };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,in,312,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,in,314,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,in,316,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,in,319,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLeadingNonBOMSingleRead_literalMutation526() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLeadingNonBOMSingleRead_literalMutation526");
        byte[] data = new byte[]{ ((byte)(239)) , ((byte)(172)) , ((byte)(205)) };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,in,312,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,in,314,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,in,316,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,in,319,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLeadingNonBOMSingleRead_literalMutation527() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLeadingNonBOMSingleRead_literalMutation527");
        byte[] data = new byte[]{ ((byte)(239)) , ((byte)(170)) , ((byte)(205)) };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,in,312,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,in,314,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,in,316,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,in,319,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLeadingNonBOMSingleRead_literalMutation528() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLeadingNonBOMSingleRead_literalMutation528");
        byte[] data = new byte[]{ ((byte)(239)) , ((byte)(85)) , ((byte)(205)) };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,in,312,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,in,314,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,in,316,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,in,319,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLeadingNonBOMSingleRead_literalMutation529() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLeadingNonBOMSingleRead_literalMutation529");
        byte[] data = new byte[]{ ((byte)(239)) , ((byte)(342)) , ((byte)(205)) };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,in,312,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,in,314,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,in,316,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,in,319,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLeadingNonBOMSingleRead_literalMutation530() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLeadingNonBOMSingleRead_literalMutation530");
        byte[] data = new byte[]{ ((byte)(239)) , ((byte)(171)) , ((byte)(206)) };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,in,312,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,in,314,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,in,316,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,in,319,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLeadingNonBOMSingleRead_literalMutation531() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLeadingNonBOMSingleRead_literalMutation531");
        byte[] data = new byte[]{ ((byte)(239)) , ((byte)(171)) , ((byte)(204)) };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,in,312,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,in,314,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,in,316,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,in,319,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLeadingNonBOMSingleRead_literalMutation532() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLeadingNonBOMSingleRead_literalMutation532");
        byte[] data = new byte[]{ ((byte)(239)) , ((byte)(171)) , ((byte)(102)) };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,in,312,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,in,314,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,in,316,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,in,319,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLeadingNonBOMSingleRead_literalMutation533() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLeadingNonBOMSingleRead_literalMutation533");
        byte[] data = new byte[]{ ((byte)(239)) , ((byte)(171)) , ((byte)(410)) };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,in,312,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,in,314,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,in,316,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,in,319,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLeadingNonBOMSingleRead_literalMutation534() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLeadingNonBOMSingleRead_literalMutation534");
        byte[] data = new byte[]{ ((byte)(239)) , ((byte)(171)) , ((byte)(205)) };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,in,312,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,in,314,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,in,316,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,in,319,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLeadingNonBOMBufferedRead_add118() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLeadingNonBOMBufferedRead_add118");
        byte[] data = new byte[]{ ((byte)(239)) , ((byte)(171)) , ((byte)(205)) };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1024];
        assertData(data, buf, in.read(buf));
        assertData(data, buf, in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLeadingNonBOMBufferedRead() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLeadingNonBOMBufferedRead");
        byte[] data = new byte[]{ ((byte)(238)) , ((byte)(171)) , ((byte)(205)) };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1024];
        assertData(data, buf, in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLeadingNonBOMBufferedRead_literalMutation506() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLeadingNonBOMBufferedRead_literalMutation506");
        byte[] data = new byte[]{ ((byte)(119)) , ((byte)(171)) , ((byte)(205)) };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1024];
        assertData(data, buf, in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLeadingNonBOMBufferedRead_literalMutation507() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLeadingNonBOMBufferedRead_literalMutation507");
        byte[] data = new byte[]{ ((byte)(478)) , ((byte)(171)) , ((byte)(205)) };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1024];
        assertData(data, buf, in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLeadingNonBOMBufferedRead_literalMutation508() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLeadingNonBOMBufferedRead_literalMutation508");
        byte[] data = new byte[]{ ((byte)(240)) , ((byte)(171)) , ((byte)(205)) };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1024];
        assertData(data, buf, in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLeadingNonBOMBufferedRead_literalMutation509() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLeadingNonBOMBufferedRead_literalMutation509");
        byte[] data = new byte[]{ ((byte)(239)) , ((byte)(172)) , ((byte)(205)) };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1024];
        assertData(data, buf, in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLeadingNonBOMBufferedRead_literalMutation510() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLeadingNonBOMBufferedRead_literalMutation510");
        byte[] data = new byte[]{ ((byte)(239)) , ((byte)(170)) , ((byte)(205)) };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1024];
        assertData(data, buf, in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLeadingNonBOMBufferedRead_literalMutation511() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLeadingNonBOMBufferedRead_literalMutation511");
        byte[] data = new byte[]{ ((byte)(239)) , ((byte)(85)) , ((byte)(205)) };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1024];
        assertData(data, buf, in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLeadingNonBOMBufferedRead_literalMutation512() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLeadingNonBOMBufferedRead_literalMutation512");
        byte[] data = new byte[]{ ((byte)(239)) , ((byte)(342)) , ((byte)(205)) };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1024];
        assertData(data, buf, in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLeadingNonBOMBufferedRead_literalMutation513() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLeadingNonBOMBufferedRead_literalMutation513");
        byte[] data = new byte[]{ ((byte)(239)) , ((byte)(171)) , ((byte)(206)) };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1024];
        assertData(data, buf, in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLeadingNonBOMBufferedRead_literalMutation514() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLeadingNonBOMBufferedRead_literalMutation514");
        byte[] data = new byte[]{ ((byte)(239)) , ((byte)(171)) , ((byte)(204)) };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1024];
        assertData(data, buf, in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLeadingNonBOMBufferedRead_literalMutation515() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLeadingNonBOMBufferedRead_literalMutation515");
        byte[] data = new byte[]{ ((byte)(239)) , ((byte)(171)) , ((byte)(102)) };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1024];
        assertData(data, buf, in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLeadingNonBOMBufferedRead_literalMutation516() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLeadingNonBOMBufferedRead_literalMutation516");
        byte[] data = new byte[]{ ((byte)(239)) , ((byte)(171)) , ((byte)(410)) };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1024];
        assertData(data, buf, in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLeadingNonBOMBufferedRead_literalMutation517() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLeadingNonBOMBufferedRead_literalMutation517");
        byte[] data = new byte[]{ ((byte)(239)) , ((byte)(171)) , ((byte)(205)) };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        byte[] buf = new byte[1024];
        assertData(data, buf, in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLeadingNonBOMBufferedRead_literalMutation518() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLeadingNonBOMBufferedRead_literalMutation518");
        byte[] data = new byte[]{ ((byte)(239)) , ((byte)(171)) , ((byte)(205)) };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1025];
        assertData(data, buf, in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLeadingNonBOMBufferedRead_literalMutation519() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLeadingNonBOMBufferedRead_literalMutation519");
        byte[] data = new byte[]{ ((byte)(239)) , ((byte)(171)) , ((byte)(205)) };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[512];
        assertData(data, buf, in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLeadingNonBOMBufferedRead_literalMutation520() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLeadingNonBOMBufferedRead_literalMutation520");
        byte[] data = new byte[]{ ((byte)(239)) , ((byte)(171)) , ((byte)(205)) };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[2048];
        assertData(data, buf, in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLeadingNonBOMBufferedRead_literalMutation521() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLeadingNonBOMBufferedRead_literalMutation521");
        byte[] data = new byte[]{ ((byte)(239)) , ((byte)(171)) , ((byte)(205)) };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1023];
        assertData(data, buf, in.read(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLeadingNonBOMBufferedRead_remove14() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLeadingNonBOMBufferedRead_remove14");
        byte[] data = new byte[]{ ((byte)(239)) , ((byte)(171)) , ((byte)(205)) };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        byte[] buf = new byte[1024];
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipWithoutBOM_add141() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipWithoutBOM_add141");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        in.skip(2L);
        in.skip(2L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),433,in,432,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSkipWithoutBOM() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipWithoutBOM");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        in.skip(2L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),433,in,432,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSkipWithoutBOM_literalMutation618() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipWithoutBOM_literalMutation618");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        in.skip(1L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),433,in,432,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSkipWithoutBOM_literalMutation619() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipWithoutBOM_literalMutation619");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        in.skip(4L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),433,in,432,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSkipWithoutBOM_literalMutation620() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipWithoutBOM_literalMutation620");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        in.skip(3L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),433,in,432,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipWithoutBOM_remove36() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipWithoutBOM_remove36");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),433,in,432,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipWithBOM_add140() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipWithBOM_add140");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        in.skip(2L);
        in.skip(2L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),431,in,430,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSkipWithBOM() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipWithBOM");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        in.skip(2L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),431,in,430,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSkipWithBOM_literalMutation610() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipWithBOM_literalMutation610");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        in.skip(1L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),431,in,430,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSkipWithBOM_literalMutation611() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipWithBOM_literalMutation611");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        in.skip(4L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),431,in,430,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSkipWithBOM_literalMutation612() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipWithBOM_literalMutation612");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        in.skip(3L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),431,in,430,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipWithBOM_remove35() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipWithBOM_remove35");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),431,in,430,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkResetAfterReadWithoutBOM_add124() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetAfterReadWithoutBOM_add124");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,in,325,in.markSupported());
        in.read();
        in.read();
        in.mark(10);
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,in,327,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkResetAfterReadWithoutBOM_add125() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetAfterReadWithoutBOM_add125");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,in,325,in.markSupported());
        in.read();
        in.mark(10);
        in.mark(10);
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,in,327,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkResetAfterReadWithoutBOM_add126() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetAfterReadWithoutBOM_add126");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,in,325,in.markSupported());
        in.read();
        in.mark(10);
        in.read();
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,in,327,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkResetAfterReadWithoutBOM_add127() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetAfterReadWithoutBOM_add127");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,in,325,in.markSupported());
        in.read();
        in.mark(10);
        in.read();
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,in,327,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkResetAfterReadWithoutBOM_add128() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetAfterReadWithoutBOM_add128");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,in,325,in.markSupported());
        in.read();
        in.mark(10);
        in.read();
        in.read();
        in.reset();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,in,327,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMarkResetAfterReadWithoutBOM() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetAfterReadWithoutBOM");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,in,325,in.markSupported());
        in.read();
        in.mark(10);
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,in,327,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMarkResetAfterReadWithoutBOM_literalMutation549() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetAfterReadWithoutBOM_literalMutation549");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,in,325,in.markSupported());
        in.read();
        in.mark(9);
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,in,327,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMarkResetAfterReadWithoutBOM_literalMutation550() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetAfterReadWithoutBOM_literalMutation550");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,in,325,in.markSupported());
        in.read();
        in.mark(5);
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,in,327,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMarkResetAfterReadWithoutBOM_literalMutation551() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetAfterReadWithoutBOM_literalMutation551");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,in,325,in.markSupported());
        in.read();
        in.mark(20);
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,in,327,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMarkResetAfterReadWithoutBOM_literalMutation552() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetAfterReadWithoutBOM_literalMutation552");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,in,325,in.markSupported());
        in.read();
        in.mark(11);
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,in,327,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkResetAfterReadWithoutBOM_remove20() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetAfterReadWithoutBOM_remove20");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,in,325,in.markSupported());
        in.mark(10);
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,in,327,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkResetAfterReadWithoutBOM_remove21() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetAfterReadWithoutBOM_remove21");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,in,325,in.markSupported());
        in.read();
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,in,327,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkResetAfterReadWithoutBOM_remove22() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetAfterReadWithoutBOM_remove22");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,in,325,in.markSupported());
        in.mark(10);
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,in,327,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkResetAfterReadWithoutBOM_remove23() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetAfterReadWithoutBOM_remove23");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,in,325,in.markSupported());
        in.mark(10);
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,in,327,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkResetAfterReadWithoutBOM_remove24() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetAfterReadWithoutBOM_remove24");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,in,325,in.markSupported());
        in.read();
        in.mark(10);
        in.read();
        in.read();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,in,327,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkResetAfterReadWithBOM_add119() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetAfterReadWithBOM_add119");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,in,321,in.markSupported());
        in.read();
        in.read();
        in.mark(10);
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,in,323,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkResetAfterReadWithBOM_add120() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetAfterReadWithBOM_add120");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,in,321,in.markSupported());
        in.read();
        in.mark(10);
        in.mark(10);
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,in,323,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkResetAfterReadWithBOM_add121() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetAfterReadWithBOM_add121");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,in,321,in.markSupported());
        in.read();
        in.mark(10);
        in.read();
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,in,323,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkResetAfterReadWithBOM_add122() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetAfterReadWithBOM_add122");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,in,321,in.markSupported());
        in.read();
        in.mark(10);
        in.read();
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,in,323,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkResetAfterReadWithBOM_add123() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetAfterReadWithBOM_add123");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,in,321,in.markSupported());
        in.read();
        in.mark(10);
        in.read();
        in.read();
        in.reset();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,in,323,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMarkResetAfterReadWithBOM() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetAfterReadWithBOM");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,in,321,in.markSupported());
        in.read();
        in.mark(10);
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,in,323,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMarkResetAfterReadWithBOM_literalMutation540() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetAfterReadWithBOM_literalMutation540");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,in,321,in.markSupported());
        in.read();
        in.mark(9);
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,in,323,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMarkResetAfterReadWithBOM_literalMutation541() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetAfterReadWithBOM_literalMutation541");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,in,321,in.markSupported());
        in.read();
        in.mark(5);
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,in,323,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMarkResetAfterReadWithBOM_literalMutation542() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetAfterReadWithBOM_literalMutation542");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,in,321,in.markSupported());
        in.read();
        in.mark(20);
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,in,323,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMarkResetAfterReadWithBOM_literalMutation543() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetAfterReadWithBOM_literalMutation543");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,in,321,in.markSupported());
        in.read();
        in.mark(11);
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,in,323,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkResetAfterReadWithBOM_remove15() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetAfterReadWithBOM_remove15");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,in,321,in.markSupported());
        in.mark(10);
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,in,323,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkResetAfterReadWithBOM_remove16() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetAfterReadWithBOM_remove16");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,in,321,in.markSupported());
        in.read();
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,in,323,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkResetAfterReadWithBOM_remove17() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetAfterReadWithBOM_remove17");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,in,321,in.markSupported());
        in.mark(10);
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,in,323,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkResetAfterReadWithBOM_remove18() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetAfterReadWithBOM_remove18");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,in,321,in.markSupported());
        in.mark(10);
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,in,323,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkResetAfterReadWithBOM_remove19() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetAfterReadWithBOM_remove19");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,in,321,in.markSupported());
        in.read();
        in.mark(10);
        in.read();
        in.read();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,in,323,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkResetBeforeReadWithoutBOM_add133() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetBeforeReadWithoutBOM_add133");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,in,333,in.markSupported());
        in.mark(10);
        in.mark(10);
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,in,335,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkResetBeforeReadWithoutBOM_add134() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetBeforeReadWithoutBOM_add134");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,in,333,in.markSupported());
        in.mark(10);
        in.read();
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,in,335,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkResetBeforeReadWithoutBOM_add135() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetBeforeReadWithoutBOM_add135");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,in,333,in.markSupported());
        in.mark(10);
        in.read();
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,in,335,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkResetBeforeReadWithoutBOM_add136() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetBeforeReadWithoutBOM_add136");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,in,333,in.markSupported());
        in.mark(10);
        in.read();
        in.read();
        in.reset();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,in,335,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMarkResetBeforeReadWithoutBOM() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetBeforeReadWithoutBOM");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,in,333,in.markSupported());
        in.mark(10);
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,in,335,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMarkResetBeforeReadWithoutBOM_literalMutation567() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetBeforeReadWithoutBOM_literalMutation567");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,in,333,in.markSupported());
        in.mark(9);
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,in,335,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMarkResetBeforeReadWithoutBOM_literalMutation568() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetBeforeReadWithoutBOM_literalMutation568");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,in,333,in.markSupported());
        in.mark(5);
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,in,335,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMarkResetBeforeReadWithoutBOM_literalMutation569() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetBeforeReadWithoutBOM_literalMutation569");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,in,333,in.markSupported());
        in.mark(20);
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,in,335,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMarkResetBeforeReadWithoutBOM_literalMutation570() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetBeforeReadWithoutBOM_literalMutation570");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,in,333,in.markSupported());
        in.mark(11);
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,in,335,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkResetBeforeReadWithoutBOM_remove29() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetBeforeReadWithoutBOM_remove29");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,in,333,in.markSupported());
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,in,335,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkResetBeforeReadWithoutBOM_remove30() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetBeforeReadWithoutBOM_remove30");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,in,333,in.markSupported());
        in.mark(10);
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,in,335,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkResetBeforeReadWithoutBOM_remove31() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetBeforeReadWithoutBOM_remove31");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,in,333,in.markSupported());
        in.mark(10);
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,in,335,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkResetBeforeReadWithoutBOM_remove32() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetBeforeReadWithoutBOM_remove32");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,in,333,in.markSupported());
        in.mark(10);
        in.read();
        in.read();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,in,335,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkResetBeforeReadWithBOM_add129() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetBeforeReadWithBOM_add129");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,in,329,in.markSupported());
        in.mark(10);
        in.mark(10);
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,in,331,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkResetBeforeReadWithBOM_add130() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetBeforeReadWithBOM_add130");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,in,329,in.markSupported());
        in.mark(10);
        in.read();
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,in,331,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkResetBeforeReadWithBOM_add131() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetBeforeReadWithBOM_add131");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,in,329,in.markSupported());
        in.mark(10);
        in.read();
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,in,331,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkResetBeforeReadWithBOM_add132() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetBeforeReadWithBOM_add132");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,in,329,in.markSupported());
        in.mark(10);
        in.read();
        in.read();
        in.reset();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,in,331,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMarkResetBeforeReadWithBOM() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetBeforeReadWithBOM");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,in,329,in.markSupported());
        in.mark(10);
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,in,331,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMarkResetBeforeReadWithBOM_literalMutation558() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetBeforeReadWithBOM_literalMutation558");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,in,329,in.markSupported());
        in.mark(9);
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,in,331,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMarkResetBeforeReadWithBOM_literalMutation559() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetBeforeReadWithBOM_literalMutation559");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,in,329,in.markSupported());
        in.mark(5);
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,in,331,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMarkResetBeforeReadWithBOM_literalMutation560() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetBeforeReadWithBOM_literalMutation560");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,in,329,in.markSupported());
        in.mark(20);
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,in,331,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMarkResetBeforeReadWithBOM_literalMutation561() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetBeforeReadWithBOM_literalMutation561");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,in,329,in.markSupported());
        in.mark(11);
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,in,331,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkResetBeforeReadWithBOM_remove25() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetBeforeReadWithBOM_remove25");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,in,329,in.markSupported());
        in.read();
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,in,331,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkResetBeforeReadWithBOM_remove26() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetBeforeReadWithBOM_remove26");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,in,329,in.markSupported());
        in.mark(10);
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,in,331,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkResetBeforeReadWithBOM_remove27() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetBeforeReadWithBOM_remove27");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,in,329,in.markSupported());
        in.mark(10);
        in.read();
        in.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,in,331,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMarkResetBeforeReadWithBOM_remove28() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkResetBeforeReadWithBOM_remove28");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,in,329,in.markSupported());
        in.mark(10);
        in.read();
        in.read();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,in,331,in.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvailableWithoutBOM() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvailableWithoutBOM");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),267,in,266,in.available());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvailableWithBOM() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvailableWithBOM");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' , 'D' };
        InputStream in = new BOMInputStream(createDataStream(data, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),265,in,264,in.available());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNoBoms() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoBoms");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        try {
            new BOMInputStream(createDataStream(data, false) , false , ((ByteOrderMark[])(null)));
        } catch (IllegalArgumentException e) {
        }
        try {
            new BOMInputStream(createDataStream(data, true) , false , new ByteOrderMark[0]);
        } catch (IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNoBoms_literalMutation575() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoBoms_literalMutation575");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        try {
            new BOMInputStream(createDataStream(data, true) , true , ((ByteOrderMark[])(null)));
        } catch (IllegalArgumentException e) {
        }
        try {
            new BOMInputStream(createDataStream(data, true) , false , new ByteOrderMark[0]);
        } catch (IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNoBoms_literalMutation577() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoBoms_literalMutation577");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        try {
            new BOMInputStream(createDataStream(data, true) , false , ((ByteOrderMark[])(null)));
        } catch (IllegalArgumentException e) {
        }
        try {
            new BOMInputStream(createDataStream(data, false) , false , new ByteOrderMark[0]);
        } catch (IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNoBoms_literalMutation578() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoBoms_literalMutation578");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        try {
            new BOMInputStream(createDataStream(data, true) , false , ((ByteOrderMark[])(null)));
        } catch (IllegalArgumentException e) {
        }
        try {
            new BOMInputStream(createDataStream(data, true) , true , new ByteOrderMark[0]);
        } catch (IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNoBoms_literalMutation579() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoBoms_literalMutation579");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        try {
            new BOMInputStream(createDataStream(data, true) , false , ((ByteOrderMark[])(null)));
        } catch (IllegalArgumentException e) {
        }
        try {
            new BOMInputStream(createDataStream(data, true) , false , new ByteOrderMark[1]);
        } catch (IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNoBoms_literalMutation580() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoBoms_literalMutation580");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        try {
            new BOMInputStream(createDataStream(data, true) , false , ((ByteOrderMark[])(null)));
        } catch (IllegalArgumentException e) {
        }
        try {
            new BOMInputStream(createDataStream(data, true) , false , new ByteOrderMark[-1]);
        } catch (IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNoBoms_literalMutation581() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoBoms_literalMutation581");
        byte[] data = new byte[]{ 'A' , 'B' , 'C' };
        try {
            new BOMInputStream(createDataStream(data, true) , false , ((ByteOrderMark[])(null)));
        } catch (IllegalArgumentException e) {
        }
        try {
            new BOMInputStream(createDataStream(data, true) , false , new ByteOrderMark[0]);
        } catch (IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadTwiceWithoutBOM_add138() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadTwiceWithoutBOM_add138");
        readBOMInputStreamTwice("/org/apache/commons/io/testfileNoBOM.xml");
        readBOMInputStreamTwice("/org/apache/commons/io/testfileNoBOM.xml");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadTwiceWithoutBOM() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadTwiceWithoutBOM");
        readBOMInputStreamTwice("bar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadTwiceWithoutBOM_remove34() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadTwiceWithoutBOM_remove34");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadTwiceWithBOM_add137() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadTwiceWithBOM_add137");
        readBOMInputStreamTwice("/org/apache/commons/io/testfileBOM.xml");
        readBOMInputStreamTwice("/org/apache/commons/io/testfileBOM.xml");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadTwiceWithBOM() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadTwiceWithBOM");
        readBOMInputStreamTwice("bar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadTwiceWithBOM_remove33() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadTwiceWithBOM_remove33");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void readBOMInputStreamTwice(String resource) throws Exception {
        InputStream inputStream = getClass().getResourceAsStream(resource);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),263,inputStream);
        BOMInputStream bomInputStream = new BOMInputStream(inputStream);
        bomInputStream.mark(1000000);
        readFile(bomInputStream);
        bomInputStream.reset();
        readFile(bomInputStream);
    }

    private void readFile(BOMInputStream bomInputStream) throws Exception {
        int bytes = 0;
        byte[] bytesFromStream = new byte[100];
        do {
            bytes = bomInputStream.read(bytesFromStream);
        } while (bytes > 0 );
    }

    public void testClose() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose");
        ExpectCloseInputStream del = new ExpectCloseInputStream();
        InputStream in = new BOMInputStream(del);
        in.close();
        del.assertCloseCalled();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClose_add114() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose_add114");
        ExpectCloseInputStream del = new ExpectCloseInputStream();
        InputStream in = new BOMInputStream(del);
        in.close();
        in.close();
        del.assertCloseCalled();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClose_add115() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose_add115");
        ExpectCloseInputStream del = new ExpectCloseInputStream();
        InputStream in = new BOMInputStream(del);
        in.close();
        del.assertCloseCalled();
        del.assertCloseCalled();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClose_remove10() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose_remove10");
        ExpectCloseInputStream del = new ExpectCloseInputStream();
        InputStream in = new BOMInputStream(del);
        del.assertCloseCalled();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClose_remove11() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose_remove11");
        ExpectCloseInputStream del = new ExpectCloseInputStream();
        InputStream in = new BOMInputStream(del);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


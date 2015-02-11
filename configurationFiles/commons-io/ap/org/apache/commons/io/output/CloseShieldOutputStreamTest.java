package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * JUnit Test Case for {@link CloseShieldOutputStream}.
 */
public class CloseShieldOutputStreamTest extends TestCase {
    private ByteArrayOutputStream original;

    private OutputStream shielded;

    private boolean closed;

    @Override
    protected void setUp() {
        original = new ByteArrayOutputStream() {
            @Override
            public void close() {
                closed = true;
            }
        };
        shielded = new CloseShieldOutputStream(original);
        closed = false;
    }

    /** 
     * Test the <code>close()</code> method.
     */
public void testClose() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose");
        shielded.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1373,closed);
        try {
            shielded.write('x');
        } catch (IOException e) {
        }
        original.write('y');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1375,original,1374,original.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1376,original.toByteArray()[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the <code>close()</code> method.
     */
@Test(timeout = 1000)
    public void testClose_add956() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose_add956");
        shielded.close();
        shielded.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1373,closed);
        try {
            shielded.write('x');
        } catch (IOException e) {
        }
        original.write('y');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1375,original,1374,original.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1376,original.toByteArray()[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the <code>close()</code> method.
     */
@Test(timeout = 1000)
    public void testClose_add957() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose_add957");
        shielded.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1373,closed);
        try {
            shielded.write('x');
            shielded.write('x');
        } catch (IOException e) {
        }
        original.write('y');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1375,original,1374,original.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1376,original.toByteArray()[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the <code>close()</code> method.
     */
@Test(timeout = 1000)
    public void testClose_add958() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose_add958");
        shielded.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1373,closed);
        try {
            shielded.write('x');
        } catch (IOException e) {
        }
        original.write('y');
        original.write('y');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1375,original,1374,original.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1376,original.toByteArray()[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the <code>close()</code> method.
     */
@Test(timeout = 1000)
    public void testClose_remove787() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose_remove787");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1373,closed);
        try {
            shielded.write('x');
        } catch (IOException e) {
        }
        original.write('y');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1375,original,1374,original.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1376,original.toByteArray()[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the <code>close()</code> method.
     */
@Test(timeout = 1000)
    public void testClose_remove788() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose_remove788");
        shielded.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1373,closed);
        try {
            shielded.write('x');
        } catch (IOException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1375,original,1374,original.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1376,original.toByteArray()[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


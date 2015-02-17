package org.apache.commons.io.output;

import org.junit.Test;
import junit.framework.TestCase;

/** 
 * Really not a lot to do here, but checking that no
 * Exceptions are thrown.
 * 
 * @version $Id$
 */
public class NullWriterTest extends TestCase {
    public NullWriterTest(String name) {
        super(name);
    }

    public void testNull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull");
        char[] chars = new char[]{ 'A' , 'B' , 'C' };
        NullWriter writer = new NullWriter();
        writer.write(1);
        writer.write(chars);
        writer.write(chars, 1, 1);
        writer.write("some string");
        writer.write("some string", 2, 2);
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNull_add1056() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_add1056");
        char[] chars = new char[]{ 'A' , 'B' , 'C' };
        NullWriter writer = new NullWriter();
        writer.write(1);
        writer.write(1);
        writer.write(chars);
        writer.write(chars, 1, 1);
        writer.write("some string");
        writer.write("some string", 2, 2);
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNull_add1057() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_add1057");
        char[] chars = new char[]{ 'A' , 'B' , 'C' };
        NullWriter writer = new NullWriter();
        writer.write(1);
        writer.write(chars);
        writer.write(chars);
        writer.write(chars, 1, 1);
        writer.write("some string");
        writer.write("some string", 2, 2);
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNull_add1058() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_add1058");
        char[] chars = new char[]{ 'A' , 'B' , 'C' };
        NullWriter writer = new NullWriter();
        writer.write(1);
        writer.write(chars);
        writer.write(chars, 1, 1);
        writer.write(chars, 1, 1);
        writer.write("some string");
        writer.write("some string", 2, 2);
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNull_add1059() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_add1059");
        char[] chars = new char[]{ 'A' , 'B' , 'C' };
        NullWriter writer = new NullWriter();
        writer.write(1);
        writer.write(chars);
        writer.write(chars, 1, 1);
        writer.write("some string");
        writer.write("some string");
        writer.write("some string", 2, 2);
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNull_add1060() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_add1060");
        char[] chars = new char[]{ 'A' , 'B' , 'C' };
        NullWriter writer = new NullWriter();
        writer.write(1);
        writer.write(chars);
        writer.write(chars, 1, 1);
        writer.write("some string");
        writer.write("some string", 2, 2);
        writer.write("some string", 2, 2);
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNull_add1061() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_add1061");
        char[] chars = new char[]{ 'A' , 'B' , 'C' };
        NullWriter writer = new NullWriter();
        writer.write(1);
        writer.write(chars);
        writer.write(chars, 1, 1);
        writer.write("some string");
        writer.write("some string", 2, 2);
        writer.flush();
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNull_add1062() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_add1062");
        char[] chars = new char[]{ 'A' , 'B' , 'C' };
        NullWriter writer = new NullWriter();
        writer.write(1);
        writer.write(chars);
        writer.write(chars, 1, 1);
        writer.write("some string");
        writer.write("some string", 2, 2);
        writer.flush();
        writer.close();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNull_literalMutation3527() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_literalMutation3527");
        char[] chars = new char[]{ 'A' , 'B' , 'C' };
        NullWriter writer = new NullWriter();
        writer.write(2);
        writer.write(chars);
        writer.write(chars, 1, 1);
        writer.write("some string");
        writer.write("some string", 2, 2);
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNull_literalMutation3528() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_literalMutation3528");
        char[] chars = new char[]{ 'A' , 'B' , 'C' };
        NullWriter writer = new NullWriter();
        writer.write(0);
        writer.write(chars);
        writer.write(chars, 1, 1);
        writer.write("some string");
        writer.write("some string", 2, 2);
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNull_literalMutation3529() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_literalMutation3529");
        char[] chars = new char[]{ 'A' , 'B' , 'C' };
        NullWriter writer = new NullWriter();
        writer.write(0);
        writer.write(chars);
        writer.write(chars, 1, 1);
        writer.write("some string");
        writer.write("some string", 2, 2);
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNull_literalMutation3530() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_literalMutation3530");
        char[] chars = new char[]{ 'A' , 'B' , 'C' };
        NullWriter writer = new NullWriter();
        writer.write(1);
        writer.write(chars);
        writer.write(chars, 2, 1);
        writer.write("some string");
        writer.write("some string", 2, 2);
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNull_literalMutation3531() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_literalMutation3531");
        char[] chars = new char[]{ 'A' , 'B' , 'C' };
        NullWriter writer = new NullWriter();
        writer.write(1);
        writer.write(chars);
        writer.write(chars, 0, 1);
        writer.write("some string");
        writer.write("some string", 2, 2);
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNull_literalMutation3532() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_literalMutation3532");
        char[] chars = new char[]{ 'A' , 'B' , 'C' };
        NullWriter writer = new NullWriter();
        writer.write(1);
        writer.write(chars);
        writer.write(chars, 0, 1);
        writer.write("some string");
        writer.write("some string", 2, 2);
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNull_literalMutation3533() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_literalMutation3533");
        char[] chars = new char[]{ 'A' , 'B' , 'C' };
        NullWriter writer = new NullWriter();
        writer.write(1);
        writer.write(chars);
        writer.write(chars, 1, 2);
        writer.write("some string");
        writer.write("some string", 2, 2);
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNull_literalMutation3534() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_literalMutation3534");
        char[] chars = new char[]{ 'A' , 'B' , 'C' };
        NullWriter writer = new NullWriter();
        writer.write(1);
        writer.write(chars);
        writer.write(chars, 1, 0);
        writer.write("some string");
        writer.write("some string", 2, 2);
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNull_literalMutation3535() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_literalMutation3535");
        char[] chars = new char[]{ 'A' , 'B' , 'C' };
        NullWriter writer = new NullWriter();
        writer.write(1);
        writer.write(chars);
        writer.write(chars, 1, 0);
        writer.write("some string");
        writer.write("some string", 2, 2);
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNull_literalMutation3536() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_literalMutation3536");
        char[] chars = new char[]{ 'A' , 'B' , 'C' };
        NullWriter writer = new NullWriter();
        writer.write(1);
        writer.write(chars);
        writer.write(chars, 1, 1);
        writer.write("bar");
        writer.write("some string", 2, 2);
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNull_literalMutation3537() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_literalMutation3537");
        char[] chars = new char[]{ 'A' , 'B' , 'C' };
        NullWriter writer = new NullWriter();
        writer.write(1);
        writer.write(chars);
        writer.write(chars, 1, 1);
        writer.write("some string");
        writer.write("bar", 2, 2);
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNull_literalMutation3538() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_literalMutation3538");
        char[] chars = new char[]{ 'A' , 'B' , 'C' };
        NullWriter writer = new NullWriter();
        writer.write(1);
        writer.write(chars);
        writer.write(chars, 1, 1);
        writer.write("some string");
        writer.write("some string", 1, 2);
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNull_literalMutation3539() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_literalMutation3539");
        char[] chars = new char[]{ 'A' , 'B' , 'C' };
        NullWriter writer = new NullWriter();
        writer.write(1);
        writer.write(chars);
        writer.write(chars, 1, 1);
        writer.write("some string");
        writer.write("some string", 4, 2);
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNull_literalMutation3540() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_literalMutation3540");
        char[] chars = new char[]{ 'A' , 'B' , 'C' };
        NullWriter writer = new NullWriter();
        writer.write(1);
        writer.write(chars);
        writer.write(chars, 1, 1);
        writer.write("some string");
        writer.write("some string", 3, 2);
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNull_literalMutation3541() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_literalMutation3541");
        char[] chars = new char[]{ 'A' , 'B' , 'C' };
        NullWriter writer = new NullWriter();
        writer.write(1);
        writer.write(chars);
        writer.write(chars, 1, 1);
        writer.write("some string");
        writer.write("some string", 2, 1);
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNull_literalMutation3542() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_literalMutation3542");
        char[] chars = new char[]{ 'A' , 'B' , 'C' };
        NullWriter writer = new NullWriter();
        writer.write(1);
        writer.write(chars);
        writer.write(chars, 1, 1);
        writer.write("some string");
        writer.write("some string", 2, 4);
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNull_literalMutation3543() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_literalMutation3543");
        char[] chars = new char[]{ 'A' , 'B' , 'C' };
        NullWriter writer = new NullWriter();
        writer.write(1);
        writer.write(chars);
        writer.write(chars, 1, 1);
        writer.write("some string");
        writer.write("some string", 2, 3);
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNull_remove823() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_remove823");
        char[] chars = new char[]{ 'A' , 'B' , 'C' };
        NullWriter writer = new NullWriter();
        writer.write(chars);
        writer.write(chars, 1, 1);
        writer.write("some string");
        writer.write("some string", 2, 2);
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNull_remove824() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_remove824");
        char[] chars = new char[]{ 'A' , 'B' , 'C' };
        NullWriter writer = new NullWriter();
        writer.write(chars);
        writer.write(chars, 1, 1);
        writer.write("some string");
        writer.write("some string", 2, 2);
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNull_remove825() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_remove825");
        char[] chars = new char[]{ 'A' , 'B' , 'C' };
        NullWriter writer = new NullWriter();
        writer.write(chars);
        writer.write(chars, 1, 1);
        writer.write("some string");
        writer.write("some string", 2, 2);
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNull_remove826() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_remove826");
        char[] chars = new char[]{ 'A' , 'B' , 'C' };
        NullWriter writer = new NullWriter();
        writer.write(chars);
        writer.write(chars, 1, 1);
        writer.write("some string");
        writer.write("some string", 2, 2);
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNull_remove827() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_remove827");
        char[] chars = new char[]{ 'A' , 'B' , 'C' };
        NullWriter writer = new NullWriter();
        writer.write(chars);
        writer.write(chars, 1, 1);
        writer.write("some string");
        writer.write("some string", 2, 2);
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNull_remove828() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_remove828");
        char[] chars = new char[]{ 'A' , 'B' , 'C' };
        NullWriter writer = new NullWriter();
        writer.write(1);
        writer.write(chars);
        writer.write(chars, 1, 1);
        writer.write("some string");
        writer.write("some string", 2, 2);
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNull_remove829() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_remove829");
        char[] chars = new char[]{ 'A' , 'B' , 'C' };
        NullWriter writer = new NullWriter();
        writer.write(1);
        writer.write(chars);
        writer.write(chars, 1, 1);
        writer.write("some string");
        writer.write("some string", 2, 2);
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


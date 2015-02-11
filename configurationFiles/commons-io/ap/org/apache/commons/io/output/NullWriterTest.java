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

    public void testNull_literalMutation2401() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_literalMutation2401");
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

    public void testNull_literalMutation2402() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_literalMutation2402");
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

    public void testNull_literalMutation2403() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_literalMutation2403");
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

    public void testNull_literalMutation2404() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_literalMutation2404");
        char[] chars = new char[]{ 'A' , 'B' , 'C' };
        NullWriter writer = new NullWriter();
        writer.write(1);
        writer.write(chars);
        writer.write(chars, 1, 1);
        writer.write("foo");
        writer.write("some string", 2, 2);
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNull_literalMutation2405() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_literalMutation2405");
        char[] chars = new char[]{ 'A' , 'B' , 'C' };
        NullWriter writer = new NullWriter();
        writer.write(1);
        writer.write(chars);
        writer.write(chars, 1, 1);
        writer.write("some string");
        writer.write("foo", 2, 2);
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNull_literalMutation2406() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_literalMutation2406");
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

    public void testNull_literalMutation2407() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNull_literalMutation2407");
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


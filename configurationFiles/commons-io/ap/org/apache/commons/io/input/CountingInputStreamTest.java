package org.apache.commons.io.input;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.apache.commons.io.output.NullOutputStream;
import java.io.OutputStream;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * Tests the CountingInputStream.
 * 
 * @version $Id$
 */
public class CountingInputStreamTest extends TestCase {
    public CountingInputStreamTest(String name) {
        super(name);
    }

    @Test(timeout = 1000)
    public void testCounting_add196() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_add196");
        String text = "A piece of text";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[21];
        byte[] ba = new byte[5];
        int found = cis.read(ba);
        java.lang.System.arraycopy(ba, 0, result, 0, 5);
        java.lang.System.arraycopy(ba, 0, result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),590,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),592,cis,591,cis.getCount());
        int value = cis.read();
        found++;
        result[5] = ((byte)(value));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),593,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),595,cis,594,cis.getCount());
        found += cis.read(result, 6, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),596,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),598,cis,597,cis.getCount());
        found += cis.read(result, 11, 10);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),599,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),601,cis,600,cis.getCount());
        String textResult = new String(result).trim();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),602,textResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),603,text);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting");
        String text = "foo";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[21];
        byte[] ba = new byte[5];
        int found = cis.read(ba);
        java.lang.System.arraycopy(ba, 0, result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),590,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),592,cis,591,cis.getCount());
        int value = cis.read();
        found++;
        result[5] = ((byte)(value));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),593,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),595,cis,594,cis.getCount());
        found += cis.read(result, 6, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),596,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),598,cis,597,cis.getCount());
        found += cis.read(result, 11, 10);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),599,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),601,cis,600,cis.getCount());
        String textResult = new String(result).trim();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),602,textResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),603,text);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation445() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation445");
        String text = "A piece of text";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[22];
        byte[] ba = new byte[5];
        int found = cis.read(ba);
        java.lang.System.arraycopy(ba, 0, result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),590,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),592,cis,591,cis.getCount());
        int value = cis.read();
        found++;
        result[5] = ((byte)(value));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),593,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),595,cis,594,cis.getCount());
        found += cis.read(result, 6, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),596,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),598,cis,597,cis.getCount());
        found += cis.read(result, 11, 10);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),599,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),601,cis,600,cis.getCount());
        String textResult = new String(result).trim();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),602,textResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),603,text);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation446() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation446");
        String text = "A piece of text";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[21];
        byte[] ba = new byte[4];
        int found = cis.read(ba);
        java.lang.System.arraycopy(ba, 0, result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),590,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),592,cis,591,cis.getCount());
        int value = cis.read();
        found++;
        result[5] = ((byte)(value));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),593,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),595,cis,594,cis.getCount());
        found += cis.read(result, 6, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),596,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),598,cis,597,cis.getCount());
        found += cis.read(result, 11, 10);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),599,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),601,cis,600,cis.getCount());
        String textResult = new String(result).trim();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),602,textResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),603,text);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation447() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation447");
        String text = "A piece of text";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[21];
        byte[] ba = new byte[5];
        int found = cis.read(ba);
        java.lang.System.arraycopy(ba, -1, result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),590,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),592,cis,591,cis.getCount());
        int value = cis.read();
        found++;
        result[5] = ((byte)(value));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),593,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),595,cis,594,cis.getCount());
        found += cis.read(result, 6, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),596,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),598,cis,597,cis.getCount());
        found += cis.read(result, 11, 10);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),599,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),601,cis,600,cis.getCount());
        String textResult = new String(result).trim();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),602,textResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),603,text);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation448() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation448");
        String text = "A piece of text";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[21];
        byte[] ba = new byte[5];
        int found = cis.read(ba);
        java.lang.System.arraycopy(ba, 0, result, -1, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),590,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),592,cis,591,cis.getCount());
        int value = cis.read();
        found++;
        result[5] = ((byte)(value));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),593,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),595,cis,594,cis.getCount());
        found += cis.read(result, 6, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),596,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),598,cis,597,cis.getCount());
        found += cis.read(result, 11, 10);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),599,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),601,cis,600,cis.getCount());
        String textResult = new String(result).trim();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),602,textResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),603,text);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation449() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation449");
        String text = "A piece of text";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[21];
        byte[] ba = new byte[5];
        int found = cis.read(ba);
        java.lang.System.arraycopy(ba, 0, result, 0, 6);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),590,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),592,cis,591,cis.getCount());
        int value = cis.read();
        found++;
        result[5] = ((byte)(value));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),593,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),595,cis,594,cis.getCount());
        found += cis.read(result, 6, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),596,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),598,cis,597,cis.getCount());
        found += cis.read(result, 11, 10);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),599,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),601,cis,600,cis.getCount());
        String textResult = new String(result).trim();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),602,textResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),603,text);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation450() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation450");
        String text = "A piece of text";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[21];
        byte[] ba = new byte[5];
        int found = cis.read(ba);
        java.lang.System.arraycopy(ba, 0, result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),590,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),592,cis,591,cis.getCount());
        int value = cis.read();
        found++;
        result[6] = ((byte)(value));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),593,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),595,cis,594,cis.getCount());
        found += cis.read(result, 6, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),596,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),598,cis,597,cis.getCount());
        found += cis.read(result, 11, 10);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),599,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),601,cis,600,cis.getCount());
        String textResult = new String(result).trim();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),602,textResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),603,text);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation451() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation451");
        String text = "A piece of text";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[21];
        byte[] ba = new byte[5];
        int found = cis.read(ba);
        java.lang.System.arraycopy(ba, 0, result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),590,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),592,cis,591,cis.getCount());
        int value = cis.read();
        found++;
        result[5] = ((byte)(value));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),593,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),595,cis,594,cis.getCount());
        found += cis.read(result, 5, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),596,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),598,cis,597,cis.getCount());
        found += cis.read(result, 11, 10);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),599,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),601,cis,600,cis.getCount());
        String textResult = new String(result).trim();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),602,textResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),603,text);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation452() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation452");
        String text = "A piece of text";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[21];
        byte[] ba = new byte[5];
        int found = cis.read(ba);
        java.lang.System.arraycopy(ba, 0, result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),590,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),592,cis,591,cis.getCount());
        int value = cis.read();
        found++;
        result[5] = ((byte)(value));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),593,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),595,cis,594,cis.getCount());
        found += cis.read(result, 6, 6);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),596,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),598,cis,597,cis.getCount());
        found += cis.read(result, 11, 10);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),599,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),601,cis,600,cis.getCount());
        String textResult = new String(result).trim();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),602,textResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),603,text);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation453() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation453");
        String text = "A piece of text";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[21];
        byte[] ba = new byte[5];
        int found = cis.read(ba);
        java.lang.System.arraycopy(ba, 0, result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),590,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),592,cis,591,cis.getCount());
        int value = cis.read();
        found++;
        result[5] = ((byte)(value));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),593,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),595,cis,594,cis.getCount());
        found += cis.read(result, 6, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),596,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),598,cis,597,cis.getCount());
        found += cis.read(result, 10, 10);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),599,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),601,cis,600,cis.getCount());
        String textResult = new String(result).trim();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),602,textResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),603,text);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation454() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation454");
        String text = "A piece of text";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[21];
        byte[] ba = new byte[5];
        int found = cis.read(ba);
        java.lang.System.arraycopy(ba, 0, result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),590,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),592,cis,591,cis.getCount());
        int value = cis.read();
        found++;
        result[5] = ((byte)(value));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),593,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),595,cis,594,cis.getCount());
        found += cis.read(result, 6, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),596,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),598,cis,597,cis.getCount());
        found += cis.read(result, 11, 9);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),599,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),601,cis,600,cis.getCount());
        String textResult = new String(result).trim();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),602,textResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),603,text);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCounting_remove83() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_remove83");
        String text = "A piece of text";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[21];
        byte[] ba = new byte[5];
        int found = cis.read(ba);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),590,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),592,cis,591,cis.getCount());
        int value = cis.read();
        found++;
        result[5] = ((byte)(value));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),593,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),595,cis,594,cis.getCount());
        found += cis.read(result, 6, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),596,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),598,cis,597,cis.getCount());
        found += cis.read(result, 11, 10);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),599,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),601,cis,600,cis.getCount());
        String textResult = new String(result).trim();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),602,textResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),603,text);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for files > 2GB in size - see issue IO-84
     */
@Test(timeout = 1000)
    public void testLargeFiles_IO84_add197() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeFiles_IO84_add197");
        long size = ((long)(Integer.MAX_VALUE)) + ((long)(1));
        NullInputStream mock = new NullInputStream(size);
        CountingInputStream cis = new CountingInputStream(mock);
        OutputStream out = new NullOutputStream();
        org.apache.commons.io.IOUtils.copyLarge(cis, out);
        org.apache.commons.io.IOUtils.copyLarge(cis, out);
        try {
            cis.getCount();
        } catch (ArithmeticException ae) {
        }
        try {
            cis.resetCount();
        } catch (ArithmeticException ae) {
        }
        mock.close();
        org.apache.commons.io.IOUtils.copyLarge(cis, out);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),620,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),622,cis,621,cis.getByteCount());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),623,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),625,cis,624,cis.resetByteCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for files > 2GB in size - see issue IO-84
     */
@Test(timeout = 1000)
    public void testLargeFiles_IO84_add198() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeFiles_IO84_add198");
        long size = ((long)(Integer.MAX_VALUE)) + ((long)(1));
        NullInputStream mock = new NullInputStream(size);
        CountingInputStream cis = new CountingInputStream(mock);
        OutputStream out = new NullOutputStream();
        org.apache.commons.io.IOUtils.copyLarge(cis, out);
        try {
            cis.getCount();
            cis.getCount();
        } catch (ArithmeticException ae) {
        }
        try {
            cis.resetCount();
        } catch (ArithmeticException ae) {
        }
        mock.close();
        org.apache.commons.io.IOUtils.copyLarge(cis, out);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),620,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),622,cis,621,cis.getByteCount());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),623,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),625,cis,624,cis.resetByteCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for files > 2GB in size - see issue IO-84
     */
@Test(timeout = 1000)
    public void testLargeFiles_IO84_add199() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeFiles_IO84_add199");
        long size = ((long)(Integer.MAX_VALUE)) + ((long)(1));
        NullInputStream mock = new NullInputStream(size);
        CountingInputStream cis = new CountingInputStream(mock);
        OutputStream out = new NullOutputStream();
        org.apache.commons.io.IOUtils.copyLarge(cis, out);
        try {
            cis.getCount();
        } catch (ArithmeticException ae) {
        }
        try {
            cis.resetCount();
            cis.resetCount();
        } catch (ArithmeticException ae) {
        }
        mock.close();
        org.apache.commons.io.IOUtils.copyLarge(cis, out);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),620,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),622,cis,621,cis.getByteCount());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),623,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),625,cis,624,cis.resetByteCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for files > 2GB in size - see issue IO-84
     */
@Test(timeout = 1000)
    public void testLargeFiles_IO84_add200() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeFiles_IO84_add200");
        long size = ((long)(Integer.MAX_VALUE)) + ((long)(1));
        NullInputStream mock = new NullInputStream(size);
        CountingInputStream cis = new CountingInputStream(mock);
        OutputStream out = new NullOutputStream();
        org.apache.commons.io.IOUtils.copyLarge(cis, out);
        try {
            cis.getCount();
        } catch (ArithmeticException ae) {
        }
        try {
            cis.resetCount();
        } catch (ArithmeticException ae) {
        }
        mock.close();
        mock.close();
        org.apache.commons.io.IOUtils.copyLarge(cis, out);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),620,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),622,cis,621,cis.getByteCount());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),623,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),625,cis,624,cis.resetByteCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for files > 2GB in size - see issue IO-84
     */
@Test(timeout = 1000)
    public void testLargeFiles_IO84_add201() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeFiles_IO84_add201");
        long size = ((long)(Integer.MAX_VALUE)) + ((long)(1));
        NullInputStream mock = new NullInputStream(size);
        CountingInputStream cis = new CountingInputStream(mock);
        OutputStream out = new NullOutputStream();
        org.apache.commons.io.IOUtils.copyLarge(cis, out);
        try {
            cis.getCount();
        } catch (ArithmeticException ae) {
        }
        try {
            cis.resetCount();
        } catch (ArithmeticException ae) {
        }
        mock.close();
        org.apache.commons.io.IOUtils.copyLarge(cis, out);
        org.apache.commons.io.IOUtils.copyLarge(cis, out);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),620,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),622,cis,621,cis.getByteCount());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),623,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),625,cis,624,cis.resetByteCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for files > 2GB in size - see issue IO-84
     */
public void testLargeFiles_IO84() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeFiles_IO84");
        long size = ((long)(Integer.MAX_VALUE)) + ((long)(0));
        NullInputStream mock = new NullInputStream(size);
        CountingInputStream cis = new CountingInputStream(mock);
        OutputStream out = new NullOutputStream();
        org.apache.commons.io.IOUtils.copyLarge(cis, out);
        try {
            cis.getCount();
        } catch (ArithmeticException ae) {
        }
        try {
            cis.resetCount();
        } catch (ArithmeticException ae) {
        }
        mock.close();
        org.apache.commons.io.IOUtils.copyLarge(cis, out);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),620,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),622,cis,621,cis.getByteCount());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),623,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),625,cis,624,cis.resetByteCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for files > 2GB in size - see issue IO-84
     */
@Test(timeout = 1000)
    public void testLargeFiles_IO84_remove84() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeFiles_IO84_remove84");
        long size = ((long)(Integer.MAX_VALUE)) + ((long)(1));
        NullInputStream mock = new NullInputStream(size);
        CountingInputStream cis = new CountingInputStream(mock);
        OutputStream out = new NullOutputStream();
        try {
            cis.getCount();
        } catch (ArithmeticException ae) {
        }
        try {
            cis.resetCount();
        } catch (ArithmeticException ae) {
        }
        mock.close();
        org.apache.commons.io.IOUtils.copyLarge(cis, out);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),620,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),622,cis,621,cis.getByteCount());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),623,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),625,cis,624,cis.resetByteCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for files > 2GB in size - see issue IO-84
     */
@Test(timeout = 1000)
    public void testLargeFiles_IO84_remove85() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeFiles_IO84_remove85");
        long size = ((long)(Integer.MAX_VALUE)) + ((long)(1));
        NullInputStream mock = new NullInputStream(size);
        CountingInputStream cis = new CountingInputStream(mock);
        OutputStream out = new NullOutputStream();
        org.apache.commons.io.IOUtils.copyLarge(cis, out);
        try {
            cis.getCount();
        } catch (ArithmeticException ae) {
        }
        try {
            cis.resetCount();
        } catch (ArithmeticException ae) {
        }
        org.apache.commons.io.IOUtils.copyLarge(cis, out);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),620,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),622,cis,621,cis.getByteCount());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),623,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),625,cis,624,cis.resetByteCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for files > 2GB in size - see issue IO-84
     */
@Test(timeout = 1000)
    public void testLargeFiles_IO84_remove86() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeFiles_IO84_remove86");
        long size = ((long)(Integer.MAX_VALUE)) + ((long)(1));
        NullInputStream mock = new NullInputStream(size);
        CountingInputStream cis = new CountingInputStream(mock);
        OutputStream out = new NullOutputStream();
        try {
            cis.getCount();
        } catch (ArithmeticException ae) {
        }
        try {
            cis.resetCount();
        } catch (ArithmeticException ae) {
        }
        mock.close();
        org.apache.commons.io.IOUtils.copyLarge(cis, out);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),620,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),622,cis,621,cis.getByteCount());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),623,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),625,cis,624,cis.resetByteCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testResetting() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testResetting");
        String text = "foo";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[bytes.length];
        int found = cis.read(result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),626,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),628,cis,627,cis.getCount());
        int count = cis.resetCount();
        found = cis.read(result, 6, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),629,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),630,count);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testResetting_literalMutation464() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testResetting_literalMutation464");
        String text = "A piece of text";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[bytes.length];
        int found = cis.read(result, 1, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),626,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),628,cis,627,cis.getCount());
        int count = cis.resetCount();
        found = cis.read(result, 6, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),629,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),630,count);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testResetting_literalMutation465() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testResetting_literalMutation465");
        String text = "A piece of text";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[bytes.length];
        int found = cis.read(result, 0, 4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),626,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),628,cis,627,cis.getCount());
        int count = cis.resetCount();
        found = cis.read(result, 6, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),629,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),630,count);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testResetting_literalMutation466() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testResetting_literalMutation466");
        String text = "A piece of text";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[bytes.length];
        int found = cis.read(result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),626,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),628,cis,627,cis.getCount());
        int count = cis.resetCount();
        found = cis.read(result, 7, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),629,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),630,count);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testResetting_literalMutation467() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testResetting_literalMutation467");
        String text = "A piece of text";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[bytes.length];
        int found = cis.read(result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),626,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),628,cis,627,cis.getCount());
        int count = cis.resetCount();
        found = cis.read(result, 6, 4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),629,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),630,count);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testZeroLength1() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroLength1");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[1]);
        CountingInputStream cis = new CountingInputStream(bais);
        int found = cis.read();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),638,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),639,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),641,cis,640,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testZeroLength2() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroLength2");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[-1]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[10];
        int found = cis.read(result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),642,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),643,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),645,cis,644,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testZeroLength2_literalMutation472() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroLength2_literalMutation472");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[11];
        int found = cis.read(result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),642,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),643,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),645,cis,644,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testZeroLength3() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroLength3");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[-1]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[10];
        int found = cis.read(result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),646,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),647,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),649,cis,648,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testZeroLength3_literalMutation474() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroLength3_literalMutation474");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[11];
        int found = cis.read(result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),646,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),647,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),649,cis,648,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testZeroLength3_literalMutation475() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroLength3_literalMutation475");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[10];
        int found = cis.read(result, 1, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),646,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),647,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),649,cis,648,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testZeroLength3_literalMutation476() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroLength3_literalMutation476");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[10];
        int found = cis.read(result, 0, 6);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),646,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),647,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),649,cis,648,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEOF1() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOF1");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[1]);
        CountingInputStream cis = new CountingInputStream(bais);
        int found = cis.read();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),604,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),606,cis,605,cis.getCount());
        found = cis.read();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),607,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),609,cis,608,cis.getCount());
        found = cis.read();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),610,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),611,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),613,cis,612,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEOF2() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOF2");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[3]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[10];
        int found = cis.read(result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),614,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),616,cis,615,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEOF2_literalMutation457() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOF2_literalMutation457");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[2]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[11];
        int found = cis.read(result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),614,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),616,cis,615,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEOF3() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOF3");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[1]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[10];
        int found = cis.read(result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),617,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),619,cis,618,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEOF3_literalMutation459() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOF3_literalMutation459");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[2]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[11];
        int found = cis.read(result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),617,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),619,cis,618,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEOF3_literalMutation460() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOF3_literalMutation460");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[2]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[10];
        int found = cis.read(result, 1, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),617,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),619,cis,618,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEOF3_literalMutation461() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOF3_literalMutation461");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[2]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[10];
        int found = cis.read(result, 0, 6);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),617,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),619,cis,618,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipping_add202() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipping_add202");
        String text = "Hello World!";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),632,cis,631,cis.skip(6));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),634,cis,633,cis.getCount());
        final byte[] result = new byte[6];
        cis.read(result);
        cis.read(result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),635,new java.lang.String(result));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),637,cis,636,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSkipping() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipping");
        String text = "foo";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),632,cis,631,cis.skip(6));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),634,cis,633,cis.getCount());
        final byte[] result = new byte[6];
        cis.read(result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),635,new java.lang.String(result));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),637,cis,636,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSkipping_literalMutation469() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipping_literalMutation469");
        String text = "Hello World!";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),632,cis,631,cis.skip(6));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),634,cis,633,cis.getCount());
        final byte[] result = new byte[7];
        cis.read(result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),635,new java.lang.String(result));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),637,cis,636,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipping_remove87() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipping_remove87");
        String text = "Hello World!";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),632,cis,631,cis.skip(6));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),634,cis,633,cis.getCount());
        final byte[] result = new byte[6];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),635,new java.lang.String(result));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),637,cis,636,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


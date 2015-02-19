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
        String text = "bar";
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

    public void testCounting_literalMutation877() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation877");
        String text = "A piece of text";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[20];
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

    public void testCounting_literalMutation878() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation878");
        String text = "A piece of text";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[10];
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

    public void testCounting_literalMutation879() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation879");
        String text = "A piece of text";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[42];
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

    public void testCounting_literalMutation880() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation880");
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

    public void testCounting_literalMutation881() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation881");
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

    public void testCounting_literalMutation882() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation882");
        String text = "A piece of text";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[21];
        byte[] ba = new byte[2];
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

    public void testCounting_literalMutation883() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation883");
        String text = "A piece of text";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[21];
        byte[] ba = new byte[10];
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

    public void testCounting_literalMutation884() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation884");
        String text = "A piece of text";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[21];
        byte[] ba = new byte[6];
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

    public void testCounting_literalMutation885() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation885");
        String text = "A piece of text";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[21];
        byte[] ba = new byte[5];
        int found = cis.read(ba);
        java.lang.System.arraycopy(ba, 1, result, 0, 5);
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

    public void testCounting_literalMutation886() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation886");
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

    public void testCounting_literalMutation887() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation887");
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
        found += cis.read(result, 11, 10);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),599,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),601,cis,600,cis.getCount());
        String textResult = new String(result).trim();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),602,textResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),603,text);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation888() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation888");
        String text = "A piece of text";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[21];
        byte[] ba = new byte[5];
        int found = cis.read(ba);
        java.lang.System.arraycopy(ba, 0, result, 1, 5);
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

    public void testCounting_literalMutation889() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation889");
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

    public void testCounting_literalMutation890() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation890");
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
        found += cis.read(result, 11, 10);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),599,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),601,cis,600,cis.getCount());
        String textResult = new String(result).trim();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),602,textResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),603,text);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation891() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation891");
        String text = "A piece of text";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[21];
        byte[] ba = new byte[5];
        int found = cis.read(ba);
        java.lang.System.arraycopy(ba, 0, result, 0, 4);
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

    public void testCounting_literalMutation892() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation892");
        String text = "A piece of text";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[21];
        byte[] ba = new byte[5];
        int found = cis.read(ba);
        java.lang.System.arraycopy(ba, 0, result, 0, 2);
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

    public void testCounting_literalMutation893() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation893");
        String text = "A piece of text";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[21];
        byte[] ba = new byte[5];
        int found = cis.read(ba);
        java.lang.System.arraycopy(ba, 0, result, 0, 10);
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

    public void testCounting_literalMutation894() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation894");
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

    public void testCounting_literalMutation895() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation895");
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
        result[4] = ((byte)(value));
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

    public void testCounting_literalMutation896() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation896");
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
        result[2] = ((byte)(value));
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

    public void testCounting_literalMutation897() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation897");
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
        result[10] = ((byte)(value));
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

    public void testCounting_literalMutation898() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation898");
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

    public void testCounting_literalMutation899() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation899");
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

    public void testCounting_literalMutation900() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation900");
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
        found += cis.read(result, 3, 5);
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

    public void testCounting_literalMutation901() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation901");
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
        found += cis.read(result, 12, 5);
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

    public void testCounting_literalMutation902() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation902");
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
        found += cis.read(result, 7, 5);
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

    public void testCounting_literalMutation903() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation903");
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
        found += cis.read(result, 6, 4);
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

    public void testCounting_literalMutation904() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation904");
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
        found += cis.read(result, 6, 2);
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

    public void testCounting_literalMutation905() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation905");
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
        found += cis.read(result, 6, 10);
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

    public void testCounting_literalMutation906() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation906");
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

    public void testCounting_literalMutation907() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation907");
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

    public void testCounting_literalMutation908() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation908");
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
        found += cis.read(result, 5, 10);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),599,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),601,cis,600,cis.getCount());
        String textResult = new String(result).trim();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),602,textResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),603,text);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation909() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation909");
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
        found += cis.read(result, 22, 10);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),599,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),601,cis,600,cis.getCount());
        String textResult = new String(result).trim();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),602,textResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),603,text);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation910() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation910");
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
        found += cis.read(result, 12, 10);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),599,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),601,cis,600,cis.getCount());
        String textResult = new String(result).trim();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),602,textResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),603,text);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation911() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation911");
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

    public void testCounting_literalMutation912() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation912");
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
        found += cis.read(result, 11, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),599,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),601,cis,600,cis.getCount());
        String textResult = new String(result).trim();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),602,textResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),603,text);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation913() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation913");
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
        found += cis.read(result, 11, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),599,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),601,cis,600,cis.getCount());
        String textResult = new String(result).trim();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),602,textResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),603,text);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation914() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation914");
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
        found += cis.read(result, 11, 11);
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
        long size = ((long)(Integer.MAX_VALUE)) + ((long)(2));
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
public void testLargeFiles_IO84_literalMutation940() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeFiles_IO84_literalMutation940");
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
public void testLargeFiles_IO84_literalMutation941() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeFiles_IO84_literalMutation941");
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
        String text = "bar";
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

    public void testResetting_literalMutation943() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testResetting_literalMutation943");
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

    public void testResetting_literalMutation944() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testResetting_literalMutation944");
        String text = "A piece of text";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[bytes.length];
        int found = cis.read(result, -1, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),626,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),628,cis,627,cis.getCount());
        int count = cis.resetCount();
        found = cis.read(result, 6, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),629,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),630,count);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testResetting_literalMutation945() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testResetting_literalMutation945");
        String text = "A piece of text";
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

    public void testResetting_literalMutation946() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testResetting_literalMutation946");
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

    public void testResetting_literalMutation947() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testResetting_literalMutation947");
        String text = "A piece of text";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[bytes.length];
        int found = cis.read(result, 0, 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),626,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),628,cis,627,cis.getCount());
        int count = cis.resetCount();
        found = cis.read(result, 6, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),629,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),630,count);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testResetting_literalMutation948() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testResetting_literalMutation948");
        String text = "A piece of text";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[bytes.length];
        int found = cis.read(result, 0, 10);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),626,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),628,cis,627,cis.getCount());
        int count = cis.resetCount();
        found = cis.read(result, 6, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),629,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),630,count);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testResetting_literalMutation949() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testResetting_literalMutation949");
        String text = "A piece of text";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[bytes.length];
        int found = cis.read(result, 0, 6);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),626,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),628,cis,627,cis.getCount());
        int count = cis.resetCount();
        found = cis.read(result, 6, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),629,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),630,count);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testResetting_literalMutation950() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testResetting_literalMutation950");
        String text = "A piece of text";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[bytes.length];
        int found = cis.read(result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),626,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),628,cis,627,cis.getCount());
        int count = cis.resetCount();
        found = cis.read(result, 5, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),629,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),630,count);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testResetting_literalMutation951() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testResetting_literalMutation951");
        String text = "A piece of text";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[bytes.length];
        int found = cis.read(result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),626,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),628,cis,627,cis.getCount());
        int count = cis.resetCount();
        found = cis.read(result, 3, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),629,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),630,count);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testResetting_literalMutation952() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testResetting_literalMutation952");
        String text = "A piece of text";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[bytes.length];
        int found = cis.read(result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),626,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),628,cis,627,cis.getCount());
        int count = cis.resetCount();
        found = cis.read(result, 12, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),629,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),630,count);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testResetting_literalMutation953() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testResetting_literalMutation953");
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

    public void testResetting_literalMutation954() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testResetting_literalMutation954");
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

    public void testResetting_literalMutation955() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testResetting_literalMutation955");
        String text = "A piece of text";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[bytes.length];
        int found = cis.read(result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),626,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),628,cis,627,cis.getCount());
        int count = cis.resetCount();
        found = cis.read(result, 6, 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),629,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),630,count);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testResetting_literalMutation956() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testResetting_literalMutation956");
        String text = "A piece of text";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[bytes.length];
        int found = cis.read(result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),626,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),628,cis,627,cis.getCount());
        int count = cis.resetCount();
        found = cis.read(result, 6, 10);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),629,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),630,count);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testResetting_literalMutation957() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testResetting_literalMutation957");
        String text = "A piece of text";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[bytes.length];
        int found = cis.read(result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),626,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),628,cis,627,cis.getCount());
        int count = cis.resetCount();
        found = cis.read(result, 6, 6);
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

    public void testZeroLength1_literalMutation964() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroLength1_literalMutation964");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[-1]);
        CountingInputStream cis = new CountingInputStream(bais);
        int found = cis.read();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),638,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),639,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),641,cis,640,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testZeroLength1_literalMutation965() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroLength1_literalMutation965");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        CountingInputStream cis = new CountingInputStream(bais);
        int found = cis.read();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),638,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),639,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),641,cis,640,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testZeroLength2() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroLength2");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[1]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[10];
        int found = cis.read(result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),642,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),643,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),645,cis,644,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testZeroLength2_literalMutation967() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroLength2_literalMutation967");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[-1]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[10];
        int found = cis.read(result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),642,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),643,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),645,cis,644,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testZeroLength2_literalMutation968() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroLength2_literalMutation968");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[10];
        int found = cis.read(result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),642,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),643,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),645,cis,644,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testZeroLength2_literalMutation969() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroLength2_literalMutation969");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[9];
        int found = cis.read(result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),642,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),643,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),645,cis,644,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testZeroLength2_literalMutation970() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroLength2_literalMutation970");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[5];
        int found = cis.read(result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),642,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),643,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),645,cis,644,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testZeroLength2_literalMutation971() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroLength2_literalMutation971");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[20];
        int found = cis.read(result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),642,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),643,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),645,cis,644,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testZeroLength2_literalMutation972() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroLength2_literalMutation972");
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
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[1]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[10];
        int found = cis.read(result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),646,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),647,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),649,cis,648,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testZeroLength3_literalMutation974() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroLength3_literalMutation974");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[-1]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[10];
        int found = cis.read(result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),646,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),647,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),649,cis,648,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testZeroLength3_literalMutation975() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroLength3_literalMutation975");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[10];
        int found = cis.read(result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),646,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),647,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),649,cis,648,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testZeroLength3_literalMutation976() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroLength3_literalMutation976");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[9];
        int found = cis.read(result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),646,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),647,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),649,cis,648,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testZeroLength3_literalMutation977() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroLength3_literalMutation977");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[5];
        int found = cis.read(result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),646,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),647,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),649,cis,648,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testZeroLength3_literalMutation978() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroLength3_literalMutation978");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[20];
        int found = cis.read(result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),646,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),647,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),649,cis,648,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testZeroLength3_literalMutation979() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroLength3_literalMutation979");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[11];
        int found = cis.read(result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),646,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),647,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),649,cis,648,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testZeroLength3_literalMutation980() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroLength3_literalMutation980");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[10];
        int found = cis.read(result, 1, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),646,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),647,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),649,cis,648,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testZeroLength3_literalMutation981() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroLength3_literalMutation981");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[10];
        int found = cis.read(result, -1, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),646,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),647,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),649,cis,648,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testZeroLength3_literalMutation982() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroLength3_literalMutation982");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[10];
        int found = cis.read(result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),646,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),647,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),649,cis,648,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testZeroLength3_literalMutation983() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroLength3_literalMutation983");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[10];
        int found = cis.read(result, 0, 4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),646,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),647,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),649,cis,648,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testZeroLength3_literalMutation984() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroLength3_literalMutation984");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[10];
        int found = cis.read(result, 0, 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),646,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),647,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),649,cis,648,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testZeroLength3_literalMutation985() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroLength3_literalMutation985");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[10];
        int found = cis.read(result, 0, 10);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),646,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),647,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),649,cis,648,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testZeroLength3_literalMutation986() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroLength3_literalMutation986");
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

    public void testEOF1_literalMutation916() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOF1_literalMutation916");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[4]);
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

    public void testEOF1_literalMutation917() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOF1_literalMutation917");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[3]);
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
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[1]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[10];
        int found = cis.read(result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),614,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),616,cis,615,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEOF2_literalMutation919() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOF2_literalMutation919");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[4]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[10];
        int found = cis.read(result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),614,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),616,cis,615,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEOF2_literalMutation920() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOF2_literalMutation920");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[3]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[10];
        int found = cis.read(result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),614,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),616,cis,615,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEOF2_literalMutation921() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOF2_literalMutation921");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[2]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[9];
        int found = cis.read(result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),614,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),616,cis,615,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEOF2_literalMutation922() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOF2_literalMutation922");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[2]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[5];
        int found = cis.read(result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),614,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),616,cis,615,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEOF2_literalMutation923() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOF2_literalMutation923");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[2]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[20];
        int found = cis.read(result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),614,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),616,cis,615,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEOF2_literalMutation924() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOF2_literalMutation924");
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

    public void testEOF3_literalMutation926() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOF3_literalMutation926");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[4]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[10];
        int found = cis.read(result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),617,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),619,cis,618,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEOF3_literalMutation927() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOF3_literalMutation927");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[3]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[10];
        int found = cis.read(result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),617,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),619,cis,618,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEOF3_literalMutation928() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOF3_literalMutation928");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[2]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[9];
        int found = cis.read(result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),617,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),619,cis,618,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEOF3_literalMutation929() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOF3_literalMutation929");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[2]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[5];
        int found = cis.read(result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),617,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),619,cis,618,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEOF3_literalMutation930() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOF3_literalMutation930");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[2]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[20];
        int found = cis.read(result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),617,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),619,cis,618,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEOF3_literalMutation931() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOF3_literalMutation931");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[2]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[11];
        int found = cis.read(result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),617,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),619,cis,618,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEOF3_literalMutation932() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOF3_literalMutation932");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[2]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[10];
        int found = cis.read(result, 1, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),617,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),619,cis,618,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEOF3_literalMutation933() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOF3_literalMutation933");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[2]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[10];
        int found = cis.read(result, -1, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),617,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),619,cis,618,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEOF3_literalMutation934() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOF3_literalMutation934");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[2]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[10];
        int found = cis.read(result, 0, 5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),617,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),619,cis,618,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEOF3_literalMutation935() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOF3_literalMutation935");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[2]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[10];
        int found = cis.read(result, 0, 4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),617,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),619,cis,618,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEOF3_literalMutation936() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOF3_literalMutation936");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[2]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[10];
        int found = cis.read(result, 0, 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),617,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),619,cis,618,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEOF3_literalMutation937() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOF3_literalMutation937");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[2]);
        CountingInputStream cis = new CountingInputStream(bais);
        byte[] result = new byte[10];
        int found = cis.read(result, 0, 10);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),617,found);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),619,cis,618,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEOF3_literalMutation938() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOF3_literalMutation938");
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
        String text = "bar";
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

    public void testSkipping_literalMutation959() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipping_literalMutation959");
        String text = "Hello World!";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),632,cis,631,cis.skip(6));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),634,cis,633,cis.getCount());
        final byte[] result = new byte[5];
        cis.read(result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),635,new java.lang.String(result));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),637,cis,636,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSkipping_literalMutation960() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipping_literalMutation960");
        String text = "Hello World!";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),632,cis,631,cis.skip(6));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),634,cis,633,cis.getCount());
        final byte[] result = new byte[3];
        cis.read(result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),635,new java.lang.String(result));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),637,cis,636,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSkipping_literalMutation961() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipping_literalMutation961");
        String text = "Hello World!";
        byte[] bytes = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        CountingInputStream cis = new CountingInputStream(bais);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),632,cis,631,cis.skip(6));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),634,cis,633,cis.getCount());
        final byte[] result = new byte[12];
        cis.read(result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),635,new java.lang.String(result));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),637,cis,636,cis.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSkipping_literalMutation962() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipping_literalMutation962");
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


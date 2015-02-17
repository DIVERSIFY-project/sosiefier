package org.apache.commons.io.input;

import java.io.IOException;
import org.junit.Test;

/** 
 * Test the Encoding Utilities part of {@link XmlStreamReader}.
 */
public class XmlStreamReaderUtilitiesTest {
    private static String RAWMGS1 = "encoding mismatch";

    private static String RAWMGS2 = "unknown BOM";

    private static String HTTPMGS1 = "BOM must be NULL";

    private static String HTTPMGS2 = "encoding mismatch";

    private static String HTTPMGS3 = "Invalid MIME";

    private static String APPXML = "application/xml";

    private static String APPXML_UTF8 = "application/xml;charset=UTF-8";

    private static String APPXML_UTF16 = "application/xml;charset=UTF-16";

    private static String APPXML_UTF32 = "application/xml;charset=UTF-32";

    private static String APPXML_UTF16BE = "application/xml;charset=UTF-16BE";

    private static String APPXML_UTF16LE = "application/xml;charset=UTF-16LE";

    private static String APPXML_UTF32BE = "application/xml;charset=UTF-32BE";

    private static String APPXML_UTF32LE = "application/xml;charset=UTF-32LE";

    private static String TXTXML = "text/xml";

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeEncoding_add507() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_add507");
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeEncoding_add508() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_add508");
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeEncoding_add509() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_add509");
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeEncoding_add510() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_add510");
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeEncoding_add511() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_add511");
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeEncoding_add512() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_add512");
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeEncoding_add513() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_add513");
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeEncoding_add514() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_add514");
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeEncoding_add515() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_add515");
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeEncoding_add516() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_add516");
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeEncoding_add517() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_add517");
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeEncoding_add518() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_add518");
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeEncoding_add519() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_add519");
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeEncoding_add520() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_add520");
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeEncoding_add521() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_add521");
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test
    public void testContentTypeEncoding() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding");
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, "bar");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test
    public void testContentTypeEncoding_literalMutation2250() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_literalMutation2250");
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "foo");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test
    public void testContentTypeEncoding_literalMutation2252() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_literalMutation2252");
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "bar");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test
    public void testContentTypeEncoding_literalMutation2254() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_literalMutation2254");
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "bar");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test
    public void testContentTypeEncoding_literalMutation2256() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_literalMutation2256");
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "bar");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test
    public void testContentTypeEncoding_literalMutation2258() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_literalMutation2258");
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "foo");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test
    public void testContentTypeEncoding_literalMutation2259() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_literalMutation2259");
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("bar", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test
    public void testContentTypeEncoding_literalMutation2260() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_literalMutation2260");
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "foo");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test
    public void testContentTypeEncoding_literalMutation2261() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_literalMutation2261");
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("foo", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test
    public void testContentTypeEncoding_literalMutation2262() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_literalMutation2262");
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "foo");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test
    public void testContentTypeEncoding_literalMutation2263() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_literalMutation2263");
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("foo", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test
    public void testContentTypeEncoding_literalMutation2264() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_literalMutation2264");
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "bar");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test
    public void testContentTypeEncoding_literalMutation2265() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_literalMutation2265");
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("foo", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test
    public void testContentTypeEncoding_literalMutation2266() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_literalMutation2266");
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "foo");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test
    public void testContentTypeEncoding_literalMutation2267() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_literalMutation2267");
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("bar", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test
    public void testContentTypeEncoding_literalMutation2268() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_literalMutation2268");
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "bar");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test
    public void testContentTypeEncoding_literalMutation2269() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_literalMutation2269");
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("foo", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test
    public void testContentTypeEncoding_literalMutation2270() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_literalMutation2270");
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "bar");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test
    public void testContentTypeEncoding_literalMutation2271() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_literalMutation2271");
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("bar", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test
    public void testContentTypeEncoding_literalMutation2272() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_literalMutation2272");
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "foo");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test
    public void testContentTypeEncoding_literalMutation2273() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_literalMutation2273");
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("bar", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test
    public void testContentTypeEncoding_literalMutation2274() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_literalMutation2274");
        checkContentTypeEncoding(null, null);
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "bar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeEncoding_remove357() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_remove357");
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeEncoding_remove358() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_remove358");
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeEncoding_remove359() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_remove359");
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeEncoding_remove360() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_remove360");
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeEncoding_remove361() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_remove361");
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeEncoding_remove362() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_remove362");
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeEncoding_remove363() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_remove363");
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeEncoding_remove364() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_remove364");
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeEncoding_remove365() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_remove365");
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeEncoding_remove366() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_remove366");
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeEncoding_remove367() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_remove367");
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeEncoding_remove368() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_remove368");
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeEncoding_remove369() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_remove369");
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeEncoding_remove370() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_remove370");
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeEncoding_remove371() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeEncoding_remove371");
        checkContentTypeEncoding(null, "");
        checkContentTypeEncoding(null, "application/xml");
        checkContentTypeEncoding(null, "application/xml;");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\'frontier\'");
        checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\'UTF-16\'");
        checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\'UTF-32\'");
        checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void checkContentTypeEncoding(String expected, String httpContentType) {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,(("ContentTypeEncoding=[" + httpContentType) + "]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1075,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1077,null,1076,org.apache.commons.io.input.XmlStreamReader.getContentTypeEncoding(httpContentType));
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeMime_add522() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeMime_add522");
        checkContentTypeMime(null, null);
        checkContentTypeMime(null, null);
        checkContentTypeMime("", "");
        checkContentTypeMime("application/xml", "application/xml");
        checkContentTypeMime("application/xml", "application/xml;");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-16");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-32");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeMime_add523() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeMime_add523");
        checkContentTypeMime(null, null);
        checkContentTypeMime("", "");
        checkContentTypeMime("", "");
        checkContentTypeMime("application/xml", "application/xml");
        checkContentTypeMime("application/xml", "application/xml;");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-16");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-32");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeMime_add524() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeMime_add524");
        checkContentTypeMime(null, null);
        checkContentTypeMime("", "");
        checkContentTypeMime("application/xml", "application/xml");
        checkContentTypeMime("application/xml", "application/xml");
        checkContentTypeMime("application/xml", "application/xml;");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-16");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-32");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeMime_add525() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeMime_add525");
        checkContentTypeMime(null, null);
        checkContentTypeMime("", "");
        checkContentTypeMime("application/xml", "application/xml");
        checkContentTypeMime("application/xml", "application/xml;");
        checkContentTypeMime("application/xml", "application/xml;");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-16");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-32");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeMime_add526() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeMime_add526");
        checkContentTypeMime(null, null);
        checkContentTypeMime("", "");
        checkContentTypeMime("application/xml", "application/xml");
        checkContentTypeMime("application/xml", "application/xml;");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-16");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-16");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-32");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeMime_add527() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeMime_add527");
        checkContentTypeMime(null, null);
        checkContentTypeMime("", "");
        checkContentTypeMime("application/xml", "application/xml");
        checkContentTypeMime("application/xml", "application/xml;");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-16");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-32");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-32");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test
    public void testContentTypeMime() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeMime");
        checkContentTypeMime(null, null);
        checkContentTypeMime("foo", "");
        checkContentTypeMime("application/xml", "application/xml");
        checkContentTypeMime("application/xml", "application/xml;");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-16");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-32");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test
    public void testContentTypeMime_literalMutation2278() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeMime_literalMutation2278");
        checkContentTypeMime(null, null);
        checkContentTypeMime("", "foo");
        checkContentTypeMime("application/xml", "application/xml");
        checkContentTypeMime("application/xml", "application/xml;");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-16");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-32");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test
    public void testContentTypeMime_literalMutation2279() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeMime_literalMutation2279");
        checkContentTypeMime(null, null);
        checkContentTypeMime("", "");
        checkContentTypeMime("bar", "application/xml");
        checkContentTypeMime("application/xml", "application/xml;");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-16");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-32");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test
    public void testContentTypeMime_literalMutation2280() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeMime_literalMutation2280");
        checkContentTypeMime(null, null);
        checkContentTypeMime("", "");
        checkContentTypeMime("application/xml", "foo");
        checkContentTypeMime("application/xml", "application/xml;");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-16");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-32");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test
    public void testContentTypeMime_literalMutation2281() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeMime_literalMutation2281");
        checkContentTypeMime(null, null);
        checkContentTypeMime("", "");
        checkContentTypeMime("application/xml", "application/xml");
        checkContentTypeMime("foo", "application/xml;");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-16");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-32");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test
    public void testContentTypeMime_literalMutation2282() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeMime_literalMutation2282");
        checkContentTypeMime(null, null);
        checkContentTypeMime("", "");
        checkContentTypeMime("application/xml", "application/xml");
        checkContentTypeMime("application/xml", "bar");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-16");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-32");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test
    public void testContentTypeMime_literalMutation2283() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeMime_literalMutation2283");
        checkContentTypeMime(null, null);
        checkContentTypeMime("", "");
        checkContentTypeMime("application/xml", "application/xml");
        checkContentTypeMime("application/xml", "application/xml;");
        checkContentTypeMime("bar", "application/xml;charset=utf-16");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-32");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test
    public void testContentTypeMime_literalMutation2284() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeMime_literalMutation2284");
        checkContentTypeMime(null, null);
        checkContentTypeMime("", "");
        checkContentTypeMime("application/xml", "application/xml");
        checkContentTypeMime("application/xml", "application/xml;");
        checkContentTypeMime("application/xml", "bar");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-32");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test
    public void testContentTypeMime_literalMutation2285() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeMime_literalMutation2285");
        checkContentTypeMime(null, null);
        checkContentTypeMime("", "");
        checkContentTypeMime("application/xml", "application/xml");
        checkContentTypeMime("application/xml", "application/xml;");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-16");
        checkContentTypeMime("bar", "application/xml;charset=utf-32");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test
    public void testContentTypeMime_literalMutation2286() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeMime_literalMutation2286");
        checkContentTypeMime(null, null);
        checkContentTypeMime("", "");
        checkContentTypeMime("application/xml", "application/xml");
        checkContentTypeMime("application/xml", "application/xml;");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-16");
        checkContentTypeMime("application/xml", "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeMime_remove372() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeMime_remove372");
        checkContentTypeMime("", "");
        checkContentTypeMime("application/xml", "application/xml");
        checkContentTypeMime("application/xml", "application/xml;");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-16");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-32");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeMime_remove373() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeMime_remove373");
        checkContentTypeMime("", "");
        checkContentTypeMime("application/xml", "application/xml");
        checkContentTypeMime("application/xml", "application/xml;");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-16");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-32");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeMime_remove374() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeMime_remove374");
        checkContentTypeMime("", "");
        checkContentTypeMime("application/xml", "application/xml");
        checkContentTypeMime("application/xml", "application/xml;");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-16");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-32");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeMime_remove375() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeMime_remove375");
        checkContentTypeMime("", "");
        checkContentTypeMime("application/xml", "application/xml");
        checkContentTypeMime("application/xml", "application/xml;");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-16");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-32");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeMime_remove376() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeMime_remove376");
        checkContentTypeMime("", "");
        checkContentTypeMime("application/xml", "application/xml");
        checkContentTypeMime("application/xml", "application/xml;");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-16");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-32");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#getContentTypeEncoding(String)}.
     */
@Test(timeout = 1000)
    public void testContentTypeMime_remove377() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContentTypeMime_remove377");
        checkContentTypeMime("", "");
        checkContentTypeMime("application/xml", "application/xml");
        checkContentTypeMime("application/xml", "application/xml;");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-16");
        checkContentTypeMime("application/xml", "application/xml;charset=utf-32");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void checkContentTypeMime(String expected, String httpContentType) {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,(("ContentTypeMime=[" + httpContentType) + "]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1079,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1081,null,1080,org.apache.commons.io.input.XmlStreamReader.getContentTypeMime(httpContentType));
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test(timeout = 1000)
    public void testAppXml_add418() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_add418");
        checkAppXml(false, null);
        checkAppXml(false, null);
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test(timeout = 1000)
    public void testAppXml_add419() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_add419");
        checkAppXml(false, null);
        checkAppXml(false, "");
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test(timeout = 1000)
    public void testAppXml_add420() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_add420");
        checkAppXml(false, null);
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test(timeout = 1000)
    public void testAppXml_add421() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_add421");
        checkAppXml(false, null);
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test(timeout = 1000)
    public void testAppXml_add422() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_add422");
        checkAppXml(false, null);
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test(timeout = 1000)
    public void testAppXml_add423() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_add423");
        checkAppXml(false, null);
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test(timeout = 1000)
    public void testAppXml_add424() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_add424");
        checkAppXml(false, null);
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test(timeout = 1000)
    public void testAppXml_add425() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_add425");
        checkAppXml(false, null);
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test(timeout = 1000)
    public void testAppXml_add426() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_add426");
        checkAppXml(false, null);
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test(timeout = 1000)
    public void testAppXml_add427() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_add427");
        checkAppXml(false, null);
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test(timeout = 1000)
    public void testAppXml_add428() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_add428");
        checkAppXml(false, null);
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test(timeout = 1000)
    public void testAppXml_add429() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_add429");
        checkAppXml(false, null);
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test
    public void testAppXml() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml");
        checkAppXml(true, null);
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test
    public void testAppXml_literalMutation1870() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_literalMutation1870");
        checkAppXml(false, null);
        checkAppXml(true, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test
    public void testAppXml_literalMutation1871() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_literalMutation1871");
        checkAppXml(false, null);
        checkAppXml(false, "bar");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test
    public void testAppXml_literalMutation1872() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_literalMutation1872");
        checkAppXml(false, null);
        checkAppXml(false, "");
        checkAppXml(false, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test
    public void testAppXml_literalMutation1873() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_literalMutation1873");
        checkAppXml(false, null);
        checkAppXml(false, "");
        checkAppXml(true, "foo");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test
    public void testAppXml_literalMutation1874() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_literalMutation1874");
        checkAppXml(false, null);
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(false, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test
    public void testAppXml_literalMutation1875() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_literalMutation1875");
        checkAppXml(false, null);
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "foo");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test
    public void testAppXml_literalMutation1876() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_literalMutation1876");
        checkAppXml(false, null);
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(false, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test
    public void testAppXml_literalMutation1877() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_literalMutation1877");
        checkAppXml(false, null);
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "bar");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test
    public void testAppXml_literalMutation1878() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_literalMutation1878");
        checkAppXml(false, null);
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(false, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test
    public void testAppXml_literalMutation1879() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_literalMutation1879");
        checkAppXml(false, null);
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "bar");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test
    public void testAppXml_literalMutation1880() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_literalMutation1880");
        checkAppXml(false, null);
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(false, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test
    public void testAppXml_literalMutation1881() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_literalMutation1881");
        checkAppXml(false, null);
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "foo");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test
    public void testAppXml_literalMutation1882() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_literalMutation1882");
        checkAppXml(false, null);
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(true, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test
    public void testAppXml_literalMutation1883() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_literalMutation1883");
        checkAppXml(false, null);
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "bar");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test
    public void testAppXml_literalMutation1884() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_literalMutation1884");
        checkAppXml(false, null);
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(true, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test
    public void testAppXml_literalMutation1885() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_literalMutation1885");
        checkAppXml(false, null);
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "bar");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test
    public void testAppXml_literalMutation1886() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_literalMutation1886");
        checkAppXml(false, null);
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(true, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test
    public void testAppXml_literalMutation1887() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_literalMutation1887");
        checkAppXml(false, null);
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "bar");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test
    public void testAppXml_literalMutation1888() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_literalMutation1888");
        checkAppXml(false, null);
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(false, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test
    public void testAppXml_literalMutation1889() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_literalMutation1889");
        checkAppXml(false, null);
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "bar");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test
    public void testAppXml_literalMutation1890() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_literalMutation1890");
        checkAppXml(false, null);
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(false, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test
    public void testAppXml_literalMutation1891() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_literalMutation1891");
        checkAppXml(false, null);
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "bar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test(timeout = 1000)
    public void testAppXml_remove268() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_remove268");
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test(timeout = 1000)
    public void testAppXml_remove269() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_remove269");
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test(timeout = 1000)
    public void testAppXml_remove270() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_remove270");
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test(timeout = 1000)
    public void testAppXml_remove271() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_remove271");
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test(timeout = 1000)
    public void testAppXml_remove272() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_remove272");
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test(timeout = 1000)
    public void testAppXml_remove273() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_remove273");
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test(timeout = 1000)
    public void testAppXml_remove274() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_remove274");
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test(timeout = 1000)
    public void testAppXml_remove275() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_remove275");
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test(timeout = 1000)
    public void testAppXml_remove276() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_remove276");
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test(timeout = 1000)
    public void testAppXml_remove277() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_remove277");
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test(timeout = 1000)
    public void testAppXml_remove278() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_remove278");
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isAppXml(String)}.
     */
@Test(timeout = 1000)
    public void testAppXml_remove279() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppXml_remove279");
        checkAppXml(false, "");
        checkAppXml(true, "application/xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        checkAppXml(true, "application/soap+xml");
        checkAppXml(true, "application/atom+xml");
        checkAppXml(false, "application/atomxml");
        checkAppXml(false, "text/xml");
        checkAppXml(false, "text/atom+xml");
        checkAppXml(true, "application/xml-dtd");
        checkAppXml(true, "application/xml-external-parsed-entity");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void checkAppXml(boolean expected, String mime) {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,(("Mime=[" + mime) + "]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1071,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1073,null,1072,org.apache.commons.io.input.XmlStreamReader.isAppXml(mime));
    }

    /** 
     * Test for {@link XmlStreamReader#isTextXml(String)}.
     */
@Test(timeout = 1000)
    public void testTextXml_add528() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTextXml_add528");
        checkTextXml(false, null);
        checkTextXml(false, null);
        checkTextXml(false, "");
        checkTextXml(true, "text/xml");
        checkTextXml(true, "text/xml-external-parsed-entity");
        checkTextXml(true, "text/soap+xml");
        checkTextXml(true, "text/atom+xml");
        checkTextXml(false, "text/atomxml");
        checkTextXml(false, "application/xml");
        checkTextXml(false, "application/atom+xml");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isTextXml(String)}.
     */
@Test(timeout = 1000)
    public void testTextXml_add529() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTextXml_add529");
        checkTextXml(false, null);
        checkTextXml(false, "");
        checkTextXml(false, "");
        checkTextXml(true, "text/xml");
        checkTextXml(true, "text/xml-external-parsed-entity");
        checkTextXml(true, "text/soap+xml");
        checkTextXml(true, "text/atom+xml");
        checkTextXml(false, "text/atomxml");
        checkTextXml(false, "application/xml");
        checkTextXml(false, "application/atom+xml");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isTextXml(String)}.
     */
@Test(timeout = 1000)
    public void testTextXml_add530() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTextXml_add530");
        checkTextXml(false, null);
        checkTextXml(false, "");
        checkTextXml(true, "text/xml");
        checkTextXml(true, "text/xml");
        checkTextXml(true, "text/xml-external-parsed-entity");
        checkTextXml(true, "text/soap+xml");
        checkTextXml(true, "text/atom+xml");
        checkTextXml(false, "text/atomxml");
        checkTextXml(false, "application/xml");
        checkTextXml(false, "application/atom+xml");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isTextXml(String)}.
     */
@Test(timeout = 1000)
    public void testTextXml_add531() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTextXml_add531");
        checkTextXml(false, null);
        checkTextXml(false, "");
        checkTextXml(true, "text/xml");
        checkTextXml(true, "text/xml-external-parsed-entity");
        checkTextXml(true, "text/xml-external-parsed-entity");
        checkTextXml(true, "text/soap+xml");
        checkTextXml(true, "text/atom+xml");
        checkTextXml(false, "text/atomxml");
        checkTextXml(false, "application/xml");
        checkTextXml(false, "application/atom+xml");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isTextXml(String)}.
     */
@Test(timeout = 1000)
    public void testTextXml_add532() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTextXml_add532");
        checkTextXml(false, null);
        checkTextXml(false, "");
        checkTextXml(true, "text/xml");
        checkTextXml(true, "text/xml-external-parsed-entity");
        checkTextXml(true, "text/soap+xml");
        checkTextXml(true, "text/soap+xml");
        checkTextXml(true, "text/atom+xml");
        checkTextXml(false, "text/atomxml");
        checkTextXml(false, "application/xml");
        checkTextXml(false, "application/atom+xml");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isTextXml(String)}.
     */
@Test(timeout = 1000)
    public void testTextXml_add533() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTextXml_add533");
        checkTextXml(false, null);
        checkTextXml(false, "");
        checkTextXml(true, "text/xml");
        checkTextXml(true, "text/xml-external-parsed-entity");
        checkTextXml(true, "text/soap+xml");
        checkTextXml(true, "text/atom+xml");
        checkTextXml(true, "text/atom+xml");
        checkTextXml(false, "text/atomxml");
        checkTextXml(false, "application/xml");
        checkTextXml(false, "application/atom+xml");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isTextXml(String)}.
     */
@Test(timeout = 1000)
    public void testTextXml_add534() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTextXml_add534");
        checkTextXml(false, null);
        checkTextXml(false, "");
        checkTextXml(true, "text/xml");
        checkTextXml(true, "text/xml-external-parsed-entity");
        checkTextXml(true, "text/soap+xml");
        checkTextXml(true, "text/atom+xml");
        checkTextXml(false, "text/atomxml");
        checkTextXml(false, "text/atomxml");
        checkTextXml(false, "application/xml");
        checkTextXml(false, "application/atom+xml");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isTextXml(String)}.
     */
@Test(timeout = 1000)
    public void testTextXml_add535() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTextXml_add535");
        checkTextXml(false, null);
        checkTextXml(false, "");
        checkTextXml(true, "text/xml");
        checkTextXml(true, "text/xml-external-parsed-entity");
        checkTextXml(true, "text/soap+xml");
        checkTextXml(true, "text/atom+xml");
        checkTextXml(false, "text/atomxml");
        checkTextXml(false, "application/xml");
        checkTextXml(false, "application/xml");
        checkTextXml(false, "application/atom+xml");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isTextXml(String)}.
     */
@Test(timeout = 1000)
    public void testTextXml_add536() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTextXml_add536");
        checkTextXml(false, null);
        checkTextXml(false, "");
        checkTextXml(true, "text/xml");
        checkTextXml(true, "text/xml-external-parsed-entity");
        checkTextXml(true, "text/soap+xml");
        checkTextXml(true, "text/atom+xml");
        checkTextXml(false, "text/atomxml");
        checkTextXml(false, "application/xml");
        checkTextXml(false, "application/atom+xml");
        checkTextXml(false, "application/atom+xml");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isTextXml(String)}.
     */
@Test
    public void testTextXml() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTextXml");
        checkTextXml(true, null);
        checkTextXml(false, "");
        checkTextXml(true, "text/xml");
        checkTextXml(true, "text/xml-external-parsed-entity");
        checkTextXml(true, "text/soap+xml");
        checkTextXml(true, "text/atom+xml");
        checkTextXml(false, "text/atomxml");
        checkTextXml(false, "application/xml");
        checkTextXml(false, "application/atom+xml");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isTextXml(String)}.
     */
@Test
    public void testTextXml_literalMutation2289() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTextXml_literalMutation2289");
        checkTextXml(false, null);
        checkTextXml(true, "");
        checkTextXml(true, "text/xml");
        checkTextXml(true, "text/xml-external-parsed-entity");
        checkTextXml(true, "text/soap+xml");
        checkTextXml(true, "text/atom+xml");
        checkTextXml(false, "text/atomxml");
        checkTextXml(false, "application/xml");
        checkTextXml(false, "application/atom+xml");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isTextXml(String)}.
     */
@Test
    public void testTextXml_literalMutation2290() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTextXml_literalMutation2290");
        checkTextXml(false, null);
        checkTextXml(false, "foo");
        checkTextXml(true, "text/xml");
        checkTextXml(true, "text/xml-external-parsed-entity");
        checkTextXml(true, "text/soap+xml");
        checkTextXml(true, "text/atom+xml");
        checkTextXml(false, "text/atomxml");
        checkTextXml(false, "application/xml");
        checkTextXml(false, "application/atom+xml");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isTextXml(String)}.
     */
@Test
    public void testTextXml_literalMutation2291() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTextXml_literalMutation2291");
        checkTextXml(false, null);
        checkTextXml(false, "");
        checkTextXml(false, "text/xml");
        checkTextXml(true, "text/xml-external-parsed-entity");
        checkTextXml(true, "text/soap+xml");
        checkTextXml(true, "text/atom+xml");
        checkTextXml(false, "text/atomxml");
        checkTextXml(false, "application/xml");
        checkTextXml(false, "application/atom+xml");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isTextXml(String)}.
     */
@Test
    public void testTextXml_literalMutation2292() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTextXml_literalMutation2292");
        checkTextXml(false, null);
        checkTextXml(false, "");
        checkTextXml(true, "bar");
        checkTextXml(true, "text/xml-external-parsed-entity");
        checkTextXml(true, "text/soap+xml");
        checkTextXml(true, "text/atom+xml");
        checkTextXml(false, "text/atomxml");
        checkTextXml(false, "application/xml");
        checkTextXml(false, "application/atom+xml");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isTextXml(String)}.
     */
@Test
    public void testTextXml_literalMutation2293() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTextXml_literalMutation2293");
        checkTextXml(false, null);
        checkTextXml(false, "");
        checkTextXml(true, "text/xml");
        checkTextXml(false, "text/xml-external-parsed-entity");
        checkTextXml(true, "text/soap+xml");
        checkTextXml(true, "text/atom+xml");
        checkTextXml(false, "text/atomxml");
        checkTextXml(false, "application/xml");
        checkTextXml(false, "application/atom+xml");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isTextXml(String)}.
     */
@Test
    public void testTextXml_literalMutation2294() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTextXml_literalMutation2294");
        checkTextXml(false, null);
        checkTextXml(false, "");
        checkTextXml(true, "text/xml");
        checkTextXml(true, "foo");
        checkTextXml(true, "text/soap+xml");
        checkTextXml(true, "text/atom+xml");
        checkTextXml(false, "text/atomxml");
        checkTextXml(false, "application/xml");
        checkTextXml(false, "application/atom+xml");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isTextXml(String)}.
     */
@Test
    public void testTextXml_literalMutation2295() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTextXml_literalMutation2295");
        checkTextXml(false, null);
        checkTextXml(false, "");
        checkTextXml(true, "text/xml");
        checkTextXml(true, "text/xml-external-parsed-entity");
        checkTextXml(false, "text/soap+xml");
        checkTextXml(true, "text/atom+xml");
        checkTextXml(false, "text/atomxml");
        checkTextXml(false, "application/xml");
        checkTextXml(false, "application/atom+xml");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isTextXml(String)}.
     */
@Test
    public void testTextXml_literalMutation2296() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTextXml_literalMutation2296");
        checkTextXml(false, null);
        checkTextXml(false, "");
        checkTextXml(true, "text/xml");
        checkTextXml(true, "text/xml-external-parsed-entity");
        checkTextXml(true, "foo");
        checkTextXml(true, "text/atom+xml");
        checkTextXml(false, "text/atomxml");
        checkTextXml(false, "application/xml");
        checkTextXml(false, "application/atom+xml");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isTextXml(String)}.
     */
@Test
    public void testTextXml_literalMutation2297() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTextXml_literalMutation2297");
        checkTextXml(false, null);
        checkTextXml(false, "");
        checkTextXml(true, "text/xml");
        checkTextXml(true, "text/xml-external-parsed-entity");
        checkTextXml(true, "text/soap+xml");
        checkTextXml(false, "text/atom+xml");
        checkTextXml(false, "text/atomxml");
        checkTextXml(false, "application/xml");
        checkTextXml(false, "application/atom+xml");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isTextXml(String)}.
     */
@Test
    public void testTextXml_literalMutation2298() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTextXml_literalMutation2298");
        checkTextXml(false, null);
        checkTextXml(false, "");
        checkTextXml(true, "text/xml");
        checkTextXml(true, "text/xml-external-parsed-entity");
        checkTextXml(true, "text/soap+xml");
        checkTextXml(true, "bar");
        checkTextXml(false, "text/atomxml");
        checkTextXml(false, "application/xml");
        checkTextXml(false, "application/atom+xml");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isTextXml(String)}.
     */
@Test
    public void testTextXml_literalMutation2299() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTextXml_literalMutation2299");
        checkTextXml(false, null);
        checkTextXml(false, "");
        checkTextXml(true, "text/xml");
        checkTextXml(true, "text/xml-external-parsed-entity");
        checkTextXml(true, "text/soap+xml");
        checkTextXml(true, "text/atom+xml");
        checkTextXml(true, "text/atomxml");
        checkTextXml(false, "application/xml");
        checkTextXml(false, "application/atom+xml");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isTextXml(String)}.
     */
@Test
    public void testTextXml_literalMutation2300() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTextXml_literalMutation2300");
        checkTextXml(false, null);
        checkTextXml(false, "");
        checkTextXml(true, "text/xml");
        checkTextXml(true, "text/xml-external-parsed-entity");
        checkTextXml(true, "text/soap+xml");
        checkTextXml(true, "text/atom+xml");
        checkTextXml(false, "bar");
        checkTextXml(false, "application/xml");
        checkTextXml(false, "application/atom+xml");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isTextXml(String)}.
     */
@Test
    public void testTextXml_literalMutation2301() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTextXml_literalMutation2301");
        checkTextXml(false, null);
        checkTextXml(false, "");
        checkTextXml(true, "text/xml");
        checkTextXml(true, "text/xml-external-parsed-entity");
        checkTextXml(true, "text/soap+xml");
        checkTextXml(true, "text/atom+xml");
        checkTextXml(false, "text/atomxml");
        checkTextXml(true, "application/xml");
        checkTextXml(false, "application/atom+xml");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isTextXml(String)}.
     */
@Test
    public void testTextXml_literalMutation2302() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTextXml_literalMutation2302");
        checkTextXml(false, null);
        checkTextXml(false, "");
        checkTextXml(true, "text/xml");
        checkTextXml(true, "text/xml-external-parsed-entity");
        checkTextXml(true, "text/soap+xml");
        checkTextXml(true, "text/atom+xml");
        checkTextXml(false, "text/atomxml");
        checkTextXml(false, "foo");
        checkTextXml(false, "application/atom+xml");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isTextXml(String)}.
     */
@Test
    public void testTextXml_literalMutation2303() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTextXml_literalMutation2303");
        checkTextXml(false, null);
        checkTextXml(false, "");
        checkTextXml(true, "text/xml");
        checkTextXml(true, "text/xml-external-parsed-entity");
        checkTextXml(true, "text/soap+xml");
        checkTextXml(true, "text/atom+xml");
        checkTextXml(false, "text/atomxml");
        checkTextXml(false, "application/xml");
        checkTextXml(true, "application/atom+xml");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isTextXml(String)}.
     */
@Test
    public void testTextXml_literalMutation2304() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTextXml_literalMutation2304");
        checkTextXml(false, null);
        checkTextXml(false, "");
        checkTextXml(true, "text/xml");
        checkTextXml(true, "text/xml-external-parsed-entity");
        checkTextXml(true, "text/soap+xml");
        checkTextXml(true, "text/atom+xml");
        checkTextXml(false, "text/atomxml");
        checkTextXml(false, "application/xml");
        checkTextXml(false, "bar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isTextXml(String)}.
     */
@Test(timeout = 1000)
    public void testTextXml_remove378() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTextXml_remove378");
        checkTextXml(false, "");
        checkTextXml(true, "text/xml");
        checkTextXml(true, "text/xml-external-parsed-entity");
        checkTextXml(true, "text/soap+xml");
        checkTextXml(true, "text/atom+xml");
        checkTextXml(false, "text/atomxml");
        checkTextXml(false, "application/xml");
        checkTextXml(false, "application/atom+xml");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isTextXml(String)}.
     */
@Test(timeout = 1000)
    public void testTextXml_remove379() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTextXml_remove379");
        checkTextXml(false, "");
        checkTextXml(true, "text/xml");
        checkTextXml(true, "text/xml-external-parsed-entity");
        checkTextXml(true, "text/soap+xml");
        checkTextXml(true, "text/atom+xml");
        checkTextXml(false, "text/atomxml");
        checkTextXml(false, "application/xml");
        checkTextXml(false, "application/atom+xml");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isTextXml(String)}.
     */
@Test(timeout = 1000)
    public void testTextXml_remove380() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTextXml_remove380");
        checkTextXml(false, "");
        checkTextXml(true, "text/xml");
        checkTextXml(true, "text/xml-external-parsed-entity");
        checkTextXml(true, "text/soap+xml");
        checkTextXml(true, "text/atom+xml");
        checkTextXml(false, "text/atomxml");
        checkTextXml(false, "application/xml");
        checkTextXml(false, "application/atom+xml");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isTextXml(String)}.
     */
@Test(timeout = 1000)
    public void testTextXml_remove381() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTextXml_remove381");
        checkTextXml(false, "");
        checkTextXml(true, "text/xml");
        checkTextXml(true, "text/xml-external-parsed-entity");
        checkTextXml(true, "text/soap+xml");
        checkTextXml(true, "text/atom+xml");
        checkTextXml(false, "text/atomxml");
        checkTextXml(false, "application/xml");
        checkTextXml(false, "application/atom+xml");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isTextXml(String)}.
     */
@Test(timeout = 1000)
    public void testTextXml_remove382() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTextXml_remove382");
        checkTextXml(false, "");
        checkTextXml(true, "text/xml");
        checkTextXml(true, "text/xml-external-parsed-entity");
        checkTextXml(true, "text/soap+xml");
        checkTextXml(true, "text/atom+xml");
        checkTextXml(false, "text/atomxml");
        checkTextXml(false, "application/xml");
        checkTextXml(false, "application/atom+xml");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isTextXml(String)}.
     */
@Test(timeout = 1000)
    public void testTextXml_remove383() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTextXml_remove383");
        checkTextXml(false, "");
        checkTextXml(true, "text/xml");
        checkTextXml(true, "text/xml-external-parsed-entity");
        checkTextXml(true, "text/soap+xml");
        checkTextXml(true, "text/atom+xml");
        checkTextXml(false, "text/atomxml");
        checkTextXml(false, "application/xml");
        checkTextXml(false, "application/atom+xml");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isTextXml(String)}.
     */
@Test(timeout = 1000)
    public void testTextXml_remove384() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTextXml_remove384");
        checkTextXml(false, "");
        checkTextXml(true, "text/xml");
        checkTextXml(true, "text/xml-external-parsed-entity");
        checkTextXml(true, "text/soap+xml");
        checkTextXml(true, "text/atom+xml");
        checkTextXml(false, "text/atomxml");
        checkTextXml(false, "application/xml");
        checkTextXml(false, "application/atom+xml");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isTextXml(String)}.
     */
@Test(timeout = 1000)
    public void testTextXml_remove385() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTextXml_remove385");
        checkTextXml(false, "");
        checkTextXml(true, "text/xml");
        checkTextXml(true, "text/xml-external-parsed-entity");
        checkTextXml(true, "text/soap+xml");
        checkTextXml(true, "text/atom+xml");
        checkTextXml(false, "text/atomxml");
        checkTextXml(false, "application/xml");
        checkTextXml(false, "application/atom+xml");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for {@link XmlStreamReader#isTextXml(String)}.
     */
@Test(timeout = 1000)
    public void testTextXml_remove386() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTextXml_remove386");
        checkTextXml(false, "");
        checkTextXml(true, "text/xml");
        checkTextXml(true, "text/xml-external-parsed-entity");
        checkTextXml(true, "text/soap+xml");
        checkTextXml(true, "text/atom+xml");
        checkTextXml(false, "text/atomxml");
        checkTextXml(false, "application/xml");
        checkTextXml(false, "application/atom+xml");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void checkTextXml(boolean expected, String mime) {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1134,(("Mime=[" + mime) + "]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1135,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1137,null,1136,org.apache.commons.io.input.XmlStreamReader.isTextXml(mime));
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingNoBOM_add482() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_add482");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingNoBOM_add483() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_add483");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingNoBOM_add484() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_add484");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingNoBOM_add485() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_add485");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingNoBOM_add486() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_add486");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingNoBOM_add487() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_add487");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingNoBOM_add488() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_add488");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingNoBOM_add489() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_add489");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingNoBOM_add490() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_add490");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingNoBOM_add491() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_add491");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingNoBOM_add492() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_add492");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingNoBOM() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "bar", null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingNoBOM_literalMutation2171() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_literalMutation2171");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("foo", null, null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingNoBOM_literalMutation2176() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_literalMutation2176");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("bar", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingNoBOM_literalMutation2178() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_literalMutation2178");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, "foo", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingNoBOM_literalMutation2181() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_literalMutation2181");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("foo", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingNoBOM_literalMutation2184() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_literalMutation2184");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "foo", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingNoBOM_literalMutation2186() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_literalMutation2186");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("foo", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingNoBOM_literalMutation2188() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_literalMutation2188");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "foo", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingNoBOM_literalMutation2189() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_literalMutation2189");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "foo", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingNoBOM_literalMutation2190() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_literalMutation2190");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "bar");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingNoBOM_literalMutation2191() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_literalMutation2191");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("bar", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingNoBOM_literalMutation2193() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_literalMutation2193");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "foo", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingNoBOM_literalMutation2194() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_literalMutation2194");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "foo", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingNoBOM_literalMutation2196() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_literalMutation2196");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("foo", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingNoBOM_literalMutation2200() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_literalMutation2200");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "foo");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingNoBOM_literalMutation2201() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_literalMutation2201");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("foo", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingNoBOM_literalMutation2203() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_literalMutation2203");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "foo", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingNoBOM_literalMutation2205() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_literalMutation2205");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "foo");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingNoBOM_literalMutation2206() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_literalMutation2206");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("foo", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingNoBOM_literalMutation2209() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_literalMutation2209");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "foo", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingNoBOM_literalMutation2210() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_literalMutation2210");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "foo");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingNoBOM_literalMutation2211() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_literalMutation2211");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("bar", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingNoBOM_literalMutation2213() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_literalMutation2213");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "bar", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingNoBOM_literalMutation2214() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_literalMutation2214");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "bar", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingNoBOM_literalMutation2216() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_literalMutation2216");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("foo", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingNoBOM_literalMutation2218() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_literalMutation2218");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "bar", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingNoBOM_literalMutation2219() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_literalMutation2219");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "bar", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingNoBOM_remove332() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_remove332");
        checkRawEncoding("UTF-8", null, null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingNoBOM_remove333() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_remove333");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingNoBOM_remove334() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_remove334");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingNoBOM_remove335() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_remove335");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingNoBOM_remove336() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_remove336");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingNoBOM_remove337() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_remove337");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingNoBOM_remove338() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_remove338");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingNoBOM_remove339() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_remove339");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingNoBOM_remove340() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_remove340");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingNoBOM_remove341() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_remove341");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * No BOM calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingNoBOM_remove342() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingNoBOM_remove342");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS2, "UTF-32", null, null, null);
        checkRawEncoding("UTF-8", null, "UTF-16BE", null, null);
        checkRawEncoding("UTF-8", null, null, "UTF-16BE", null);
        checkRawEncoding("UTF-8", null, "UTF-8", "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16BE", null);
        checkRawEncoding("UTF-16BE", null, null, null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-8", null, "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, null, "UTF-8", "UTF-16BE");
        checkRawEncoding("UTF-16BE", null, "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", null, "UTF-16LE", "UTF-16", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * BOM calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingStandard_add493() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandard_add493");
        testCalculateRawEncodingStandard("UTF-8", "UTF-16BE", "UTF-16LE");
        testCalculateRawEncodingStandard("UTF-8", "UTF-16BE", "UTF-16LE");
        testCalculateRawEncodingStandard("UTF-16BE", "UTF-8", "UTF-16LE");
        testCalculateRawEncodingStandard("UTF-16LE", "UTF-8", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * BOM calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingStandard_add494() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandard_add494");
        testCalculateRawEncodingStandard("UTF-8", "UTF-16BE", "UTF-16LE");
        testCalculateRawEncodingStandard("UTF-16BE", "UTF-8", "UTF-16LE");
        testCalculateRawEncodingStandard("UTF-16BE", "UTF-8", "UTF-16LE");
        testCalculateRawEncodingStandard("UTF-16LE", "UTF-8", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * BOM calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingStandard_add495() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandard_add495");
        testCalculateRawEncodingStandard("UTF-8", "UTF-16BE", "UTF-16LE");
        testCalculateRawEncodingStandard("UTF-16BE", "UTF-8", "UTF-16LE");
        testCalculateRawEncodingStandard("UTF-16LE", "UTF-8", "UTF-16BE");
        testCalculateRawEncodingStandard("UTF-16LE", "UTF-8", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingStandard() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandard");
        testCalculateRawEncodingStandard("bar", "UTF-16BE", "UTF-16LE");
        testCalculateRawEncodingStandard("UTF-16BE", "UTF-8", "UTF-16LE");
        testCalculateRawEncodingStandard("UTF-16LE", "UTF-8", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingStandard_literalMutation2222() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandard_literalMutation2222");
        testCalculateRawEncodingStandard("UTF-8", "bar", "UTF-16LE");
        testCalculateRawEncodingStandard("UTF-16BE", "UTF-8", "UTF-16LE");
        testCalculateRawEncodingStandard("UTF-16LE", "UTF-8", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingStandard_literalMutation2223() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandard_literalMutation2223");
        testCalculateRawEncodingStandard("UTF-8", "UTF-16BE", "foo");
        testCalculateRawEncodingStandard("UTF-16BE", "UTF-8", "UTF-16LE");
        testCalculateRawEncodingStandard("UTF-16LE", "UTF-8", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingStandard_literalMutation2224() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandard_literalMutation2224");
        testCalculateRawEncodingStandard("UTF-8", "UTF-16BE", "UTF-16LE");
        testCalculateRawEncodingStandard("bar", "UTF-8", "UTF-16LE");
        testCalculateRawEncodingStandard("UTF-16LE", "UTF-8", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingStandard_literalMutation2225() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandard_literalMutation2225");
        testCalculateRawEncodingStandard("UTF-8", "UTF-16BE", "UTF-16LE");
        testCalculateRawEncodingStandard("UTF-16BE", "foo", "UTF-16LE");
        testCalculateRawEncodingStandard("UTF-16LE", "UTF-8", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingStandard_literalMutation2226() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandard_literalMutation2226");
        testCalculateRawEncodingStandard("UTF-8", "UTF-16BE", "UTF-16LE");
        testCalculateRawEncodingStandard("UTF-16BE", "UTF-8", "bar");
        testCalculateRawEncodingStandard("UTF-16LE", "UTF-8", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingStandard_literalMutation2227() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandard_literalMutation2227");
        testCalculateRawEncodingStandard("UTF-8", "UTF-16BE", "UTF-16LE");
        testCalculateRawEncodingStandard("UTF-16BE", "UTF-8", "UTF-16LE");
        testCalculateRawEncodingStandard("foo", "UTF-8", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingStandard_literalMutation2228() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandard_literalMutation2228");
        testCalculateRawEncodingStandard("UTF-8", "UTF-16BE", "UTF-16LE");
        testCalculateRawEncodingStandard("UTF-16BE", "UTF-8", "UTF-16LE");
        testCalculateRawEncodingStandard("UTF-16LE", "foo", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingStandard_literalMutation2229() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandard_literalMutation2229");
        testCalculateRawEncodingStandard("UTF-8", "UTF-16BE", "UTF-16LE");
        testCalculateRawEncodingStandard("UTF-16BE", "UTF-8", "UTF-16LE");
        testCalculateRawEncodingStandard("UTF-16LE", "UTF-8", "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * BOM calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingStandard_remove343() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandard_remove343");
        testCalculateRawEncodingStandard("UTF-16BE", "UTF-8", "UTF-16LE");
        testCalculateRawEncodingStandard("UTF-16LE", "UTF-8", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * BOM calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingStandard_remove344() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandard_remove344");
        testCalculateRawEncodingStandard("UTF-16BE", "UTF-8", "UTF-16LE");
        testCalculateRawEncodingStandard("UTF-16LE", "UTF-8", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * BOM calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingStandard_remove345() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandard_remove345");
        testCalculateRawEncodingStandard("UTF-16BE", "UTF-8", "UTF-16LE");
        testCalculateRawEncodingStandard("UTF-16LE", "UTF-8", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * BOM calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingStandardUtf32_add504() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandardUtf32_add504");
        testCalculateRawEncodingStandard("UTF-8", "UTF-32BE", "UTF-32LE");
        testCalculateRawEncodingStandard("UTF-8", "UTF-32BE", "UTF-32LE");
        testCalculateRawEncodingStandard("UTF-32BE", "UTF-8", "UTF-32LE");
        testCalculateRawEncodingStandard("UTF-32LE", "UTF-8", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * BOM calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingStandardUtf32_add505() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandardUtf32_add505");
        testCalculateRawEncodingStandard("UTF-8", "UTF-32BE", "UTF-32LE");
        testCalculateRawEncodingStandard("UTF-32BE", "UTF-8", "UTF-32LE");
        testCalculateRawEncodingStandard("UTF-32BE", "UTF-8", "UTF-32LE");
        testCalculateRawEncodingStandard("UTF-32LE", "UTF-8", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * BOM calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingStandardUtf32_add506() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandardUtf32_add506");
        testCalculateRawEncodingStandard("UTF-8", "UTF-32BE", "UTF-32LE");
        testCalculateRawEncodingStandard("UTF-32BE", "UTF-8", "UTF-32LE");
        testCalculateRawEncodingStandard("UTF-32LE", "UTF-8", "UTF-32BE");
        testCalculateRawEncodingStandard("UTF-32LE", "UTF-8", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingStandardUtf32() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandardUtf32");
        testCalculateRawEncodingStandard("foo", "UTF-32BE", "UTF-32LE");
        testCalculateRawEncodingStandard("UTF-32BE", "UTF-8", "UTF-32LE");
        testCalculateRawEncodingStandard("UTF-32LE", "UTF-8", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingStandardUtf32_literalMutation2237() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandardUtf32_literalMutation2237");
        testCalculateRawEncodingStandard("UTF-8", "foo", "UTF-32LE");
        testCalculateRawEncodingStandard("UTF-32BE", "UTF-8", "UTF-32LE");
        testCalculateRawEncodingStandard("UTF-32LE", "UTF-8", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingStandardUtf32_literalMutation2238() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandardUtf32_literalMutation2238");
        testCalculateRawEncodingStandard("UTF-8", "UTF-32BE", "foo");
        testCalculateRawEncodingStandard("UTF-32BE", "UTF-8", "UTF-32LE");
        testCalculateRawEncodingStandard("UTF-32LE", "UTF-8", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingStandardUtf32_literalMutation2239() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandardUtf32_literalMutation2239");
        testCalculateRawEncodingStandard("UTF-8", "UTF-32BE", "UTF-32LE");
        testCalculateRawEncodingStandard("foo", "UTF-8", "UTF-32LE");
        testCalculateRawEncodingStandard("UTF-32LE", "UTF-8", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingStandardUtf32_literalMutation2240() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandardUtf32_literalMutation2240");
        testCalculateRawEncodingStandard("UTF-8", "UTF-32BE", "UTF-32LE");
        testCalculateRawEncodingStandard("UTF-32BE", "bar", "UTF-32LE");
        testCalculateRawEncodingStandard("UTF-32LE", "UTF-8", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingStandardUtf32_literalMutation2241() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandardUtf32_literalMutation2241");
        testCalculateRawEncodingStandard("UTF-8", "UTF-32BE", "UTF-32LE");
        testCalculateRawEncodingStandard("UTF-32BE", "UTF-8", "foo");
        testCalculateRawEncodingStandard("UTF-32LE", "UTF-8", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingStandardUtf32_literalMutation2242() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandardUtf32_literalMutation2242");
        testCalculateRawEncodingStandard("UTF-8", "UTF-32BE", "UTF-32LE");
        testCalculateRawEncodingStandard("UTF-32BE", "UTF-8", "UTF-32LE");
        testCalculateRawEncodingStandard("bar", "UTF-8", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingStandardUtf32_literalMutation2243() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandardUtf32_literalMutation2243");
        testCalculateRawEncodingStandard("UTF-8", "UTF-32BE", "UTF-32LE");
        testCalculateRawEncodingStandard("UTF-32BE", "UTF-8", "UTF-32LE");
        testCalculateRawEncodingStandard("UTF-32LE", "bar", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * BOM calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingStandardUtf32_literalMutation2244() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandardUtf32_literalMutation2244");
        testCalculateRawEncodingStandard("UTF-8", "UTF-32BE", "UTF-32LE");
        testCalculateRawEncodingStandard("UTF-32BE", "UTF-8", "UTF-32LE");
        testCalculateRawEncodingStandard("UTF-32LE", "UTF-8", "bar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * BOM calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingStandardUtf32_remove354() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandardUtf32_remove354");
        testCalculateRawEncodingStandard("UTF-32BE", "UTF-8", "UTF-32LE");
        testCalculateRawEncodingStandard("UTF-32LE", "UTF-8", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * BOM calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingStandardUtf32_remove355() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandardUtf32_remove355");
        testCalculateRawEncodingStandard("UTF-32BE", "UTF-8", "UTF-32LE");
        testCalculateRawEncodingStandard("UTF-32LE", "UTF-8", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * BOM calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingStandardUtf32_remove356() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandardUtf32_remove356");
        testCalculateRawEncodingStandard("UTF-32BE", "UTF-8", "UTF-32LE");
        testCalculateRawEncodingStandard("UTF-32LE", "UTF-8", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testCalculateRawEncodingStandard(String bomEnc, String otherEnc, String defaultEnc) throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandard");
        checkRawEncoding(bomEnc, bomEnc, null, null, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, null, null, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, bomEnc, null, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, otherEnc, null, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, null, bomEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, null, otherEnc, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, bomEnc, bomEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, bomEnc, otherEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, otherEnc, bomEnc, defaultEnc);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testCalculateRawEncodingStandard_add497(String bomEnc, String otherEnc, String defaultEnc) throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandard_add497");
        checkRawEncoding(bomEnc, bomEnc, null, null, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, bomEnc, null, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, bomEnc, null, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, otherEnc, null, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, null, bomEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, null, otherEnc, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, bomEnc, bomEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, bomEnc, otherEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, otherEnc, bomEnc, defaultEnc);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testCalculateRawEncodingStandard_add498(String bomEnc, String otherEnc, String defaultEnc) throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandard_add498");
        checkRawEncoding(bomEnc, bomEnc, null, null, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, bomEnc, null, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, otherEnc, null, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, otherEnc, null, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, null, bomEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, null, otherEnc, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, bomEnc, bomEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, bomEnc, otherEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, otherEnc, bomEnc, defaultEnc);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testCalculateRawEncodingStandard_add499(String bomEnc, String otherEnc, String defaultEnc) throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandard_add499");
        checkRawEncoding(bomEnc, bomEnc, null, null, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, bomEnc, null, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, otherEnc, null, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, null, bomEnc, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, null, bomEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, null, otherEnc, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, bomEnc, bomEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, bomEnc, otherEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, otherEnc, bomEnc, defaultEnc);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testCalculateRawEncodingStandard_add500(String bomEnc, String otherEnc, String defaultEnc) throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandard_add500");
        checkRawEncoding(bomEnc, bomEnc, null, null, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, bomEnc, null, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, otherEnc, null, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, null, bomEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, null, otherEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, null, otherEnc, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, bomEnc, bomEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, bomEnc, otherEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, otherEnc, bomEnc, defaultEnc);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testCalculateRawEncodingStandard_add501(String bomEnc, String otherEnc, String defaultEnc) throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandard_add501");
        checkRawEncoding(bomEnc, bomEnc, null, null, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, bomEnc, null, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, otherEnc, null, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, null, bomEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, null, otherEnc, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, bomEnc, bomEnc, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, bomEnc, bomEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, bomEnc, otherEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, otherEnc, bomEnc, defaultEnc);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testCalculateRawEncodingStandard_add502(String bomEnc, String otherEnc, String defaultEnc) throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandard_add502");
        checkRawEncoding(bomEnc, bomEnc, null, null, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, bomEnc, null, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, otherEnc, null, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, null, bomEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, null, otherEnc, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, bomEnc, bomEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, bomEnc, otherEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, bomEnc, otherEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, otherEnc, bomEnc, defaultEnc);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testCalculateRawEncodingStandard_add503(String bomEnc, String otherEnc, String defaultEnc) throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandard_add503");
        checkRawEncoding(bomEnc, bomEnc, null, null, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, bomEnc, null, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, otherEnc, null, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, null, bomEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, null, otherEnc, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, bomEnc, bomEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, bomEnc, otherEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, otherEnc, bomEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, otherEnc, bomEnc, defaultEnc);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testCalculateRawEncodingStandard_remove346(String bomEnc, String otherEnc, String defaultEnc) throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandard_remove346");
        checkRawEncoding(bomEnc, bomEnc, bomEnc, null, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, otherEnc, null, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, null, bomEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, null, otherEnc, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, bomEnc, bomEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, bomEnc, otherEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, otherEnc, bomEnc, defaultEnc);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testCalculateRawEncodingStandard_remove347(String bomEnc, String otherEnc, String defaultEnc) throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandard_remove347");
        checkRawEncoding(bomEnc, bomEnc, bomEnc, null, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, otherEnc, null, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, null, bomEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, null, otherEnc, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, bomEnc, bomEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, bomEnc, otherEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, otherEnc, bomEnc, defaultEnc);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testCalculateRawEncodingStandard_remove348(String bomEnc, String otherEnc, String defaultEnc) throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandard_remove348");
        checkRawEncoding(bomEnc, bomEnc, null, null, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, bomEnc, null, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, null, bomEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, null, otherEnc, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, bomEnc, bomEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, bomEnc, otherEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, otherEnc, bomEnc, defaultEnc);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testCalculateRawEncodingStandard_remove349(String bomEnc, String otherEnc, String defaultEnc) throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandard_remove349");
        checkRawEncoding(bomEnc, bomEnc, bomEnc, null, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, otherEnc, null, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, null, bomEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, null, otherEnc, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, bomEnc, bomEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, bomEnc, otherEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, otherEnc, bomEnc, defaultEnc);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testCalculateRawEncodingStandard_remove350(String bomEnc, String otherEnc, String defaultEnc) throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandard_remove350");
        checkRawEncoding(bomEnc, bomEnc, null, null, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, bomEnc, null, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, null, bomEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, null, otherEnc, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, bomEnc, bomEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, bomEnc, otherEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, otherEnc, bomEnc, defaultEnc);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testCalculateRawEncodingStandard_remove351(String bomEnc, String otherEnc, String defaultEnc) throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandard_remove351");
        checkRawEncoding(bomEnc, bomEnc, bomEnc, null, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, otherEnc, null, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, null, bomEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, null, otherEnc, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, bomEnc, bomEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, bomEnc, otherEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, otherEnc, bomEnc, defaultEnc);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testCalculateRawEncodingStandard_remove352(String bomEnc, String otherEnc, String defaultEnc) throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandard_remove352");
        checkRawEncoding(bomEnc, bomEnc, null, null, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, bomEnc, null, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, null, bomEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, null, otherEnc, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, bomEnc, bomEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, bomEnc, otherEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, otherEnc, bomEnc, defaultEnc);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testCalculateRawEncodingStandard_remove353(String bomEnc, String otherEnc, String defaultEnc) throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingStandard_remove353");
        checkRawEncoding(bomEnc, bomEnc, null, null, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, bomEnc, null, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, null, bomEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, null, otherEnc, defaultEnc);
        checkRawEncoding(bomEnc, bomEnc, bomEnc, bomEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, bomEnc, otherEnc, defaultEnc);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, bomEnc, otherEnc, bomEnc, defaultEnc);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF16_add462() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_add462");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF16_add463() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_add463");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF16_add464() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_add464");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF16_add465() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_add465");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF16_add466() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_add466");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF16_add467() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_add467");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF16_add468() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_add468");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF16_add469() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_add469");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF16_add470() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_add470");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF16_add471() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_add471");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF16() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "foo", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF16_literalMutation2080() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_literalMutation2080");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "bar", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF16_literalMutation2083() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_literalMutation2083");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("bar", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF16_literalMutation2084() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_literalMutation2084");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "foo", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF16_literalMutation2086() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_literalMutation2086");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "bar", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF16_literalMutation2088() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_literalMutation2088");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("foo", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF16_literalMutation2089() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_literalMutation2089");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "foo", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF16_literalMutation2090() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_literalMutation2090");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "foo", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF16_literalMutation2091() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_literalMutation2091");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "foo", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF16_literalMutation2093() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_literalMutation2093");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "foo", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF16_literalMutation2095() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_literalMutation2095");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "foo", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF16_literalMutation2097() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_literalMutation2097");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "foo", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF16_literalMutation2098() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_literalMutation2098");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "bar", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF16_literalMutation2099() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_literalMutation2099");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "bar", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF16_literalMutation2101() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_literalMutation2101");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "foo", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF16_literalMutation2102() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_literalMutation2102");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "bar", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF16_literalMutation2105() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_literalMutation2105");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("bar", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF16_literalMutation2106() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_literalMutation2106");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "bar", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF16_literalMutation2108() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_literalMutation2108");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "bar", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF16_literalMutation2110() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_literalMutation2110");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("foo", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF16_literalMutation2111() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_literalMutation2111");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "foo", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF16_literalMutation2112() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_literalMutation2112");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "bar", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF16_literalMutation2113() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_literalMutation2113");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "foo", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF16_literalMutation2115() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_literalMutation2115");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "bar", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF16_literalMutation2117() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_literalMutation2117");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "foo", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF16_literalMutation2119() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_literalMutation2119");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "bar", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF16_literalMutation2120() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_literalMutation2120");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "bar", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF16_literalMutation2121() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_literalMutation2121");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "bar", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF16_remove312() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_remove312");
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF16_remove313() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_remove313");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF16_remove314() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_remove314");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF16_remove315() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_remove315");
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF16_remove316() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_remove316");
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF16_remove317() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_remove317");
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF16_remove318() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_remove318");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF16_remove319() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_remove319");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16", null, null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF16_remove320() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_remove320");
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-16 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF16_remove321() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF16_remove321");
        checkRawEncoding("UTF-16BE", "UTF-16BE", null, "UTF-16", null);
        checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", null, "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16", null, null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", null, "UTF-16", null);
        checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", null, "UTF-16BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF32_add472() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_add472");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF32_add473() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_add473");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF32_add474() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_add474");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF32_add475() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_add475");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF32_add476() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_add476");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF32_add477() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_add477");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF32_add478() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_add478");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF32_add479() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_add479");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF32_add480() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_add480");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF32_add481() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_add481");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF32() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "bar", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF32_literalMutation2124() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_literalMutation2124");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "foo", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF32_literalMutation2127() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_literalMutation2127");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("foo", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF32_literalMutation2128() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_literalMutation2128");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "foo", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF32_literalMutation2130() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_literalMutation2130");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "bar", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF32_literalMutation2132() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_literalMutation2132");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("foo", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF32_literalMutation2133() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_literalMutation2133");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "foo", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF32_literalMutation2134() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_literalMutation2134");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "foo", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF32_literalMutation2135() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_literalMutation2135");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "bar", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF32_literalMutation2137() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_literalMutation2137");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "bar", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF32_literalMutation2139() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_literalMutation2139");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "bar", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF32_literalMutation2141() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_literalMutation2141");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "foo", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF32_literalMutation2142() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_literalMutation2142");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "foo", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF32_literalMutation2143() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_literalMutation2143");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "foo", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF32_literalMutation2145() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_literalMutation2145");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "foo", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF32_literalMutation2146() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_literalMutation2146");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "foo", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF32_literalMutation2149() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_literalMutation2149");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("foo", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF32_literalMutation2150() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_literalMutation2150");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "bar", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF32_literalMutation2152() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_literalMutation2152");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "foo", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF32_literalMutation2154() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_literalMutation2154");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("foo", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF32_literalMutation2155() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_literalMutation2155");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "foo", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF32_literalMutation2156() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_literalMutation2156");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "foo", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF32_literalMutation2157() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_literalMutation2157");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "foo", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF32_literalMutation2159() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_literalMutation2159");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "foo", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF32_literalMutation2161() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_literalMutation2161");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "foo", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF32_literalMutation2163() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_literalMutation2163");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "foo", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF32_literalMutation2164() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_literalMutation2164");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "foo", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test
    public void testCalculateRawEncodingAdditonalUTF32_literalMutation2165() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_literalMutation2165");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "foo", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF32_remove322() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_remove322");
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF32_remove323() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_remove323");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF32_remove324() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_remove324");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF32_remove325() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_remove325");
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF32_remove326() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_remove326");
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF32_remove327() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_remove327");
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF32_remove328() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_remove328");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF32_remove329() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_remove329");
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32", null, null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF32_remove330() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_remove330");
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Additional UTF-32 calculateRawEncoding() Test
     */
@Test(timeout = 1000)
    public void testCalculateRawEncodingAdditonalUTF32_remove331() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateRawEncodingAdditonalUTF32_remove331");
        checkRawEncoding("UTF-32BE", "UTF-32BE", null, "UTF-32", null);
        checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", null, "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32", null, null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", null, "UTF-32", null);
        checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", null, "UTF-32BE", null);
        checkRawError(XmlStreamReaderUtilitiesTest.RAWMGS1, "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void checkRawEncoding(String expected, String bomEnc, String xmlGuessEnc, String xmlEnc, String defaultEncoding) throws IOException {
        StringBuilder builder = new StringBuilder();
        builder.append("RawEncoding: ").append(bomEnc).append("], ");
        builder.append("bomEnc=[").append(bomEnc).append("], ");
        builder.append("xmlGuessEnc=[").append(xmlGuessEnc).append("], ");
        builder.append("xmlEnc=[").append(xmlEnc).append("], ");
        builder.append("defaultEncoding=[").append(defaultEncoding).append("],");
        String encoding = calculateRawEncoding(bomEnc, xmlGuessEnc, xmlEnc, defaultEncoding);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1111,builder,1110,builder.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1112,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1113,encoding);
    }

    protected String calculateRawEncoding(String bomEnc, String xmlGuessEnc, String xmlEnc, String defaultEncoding) throws IOException {
        MockXmlStreamReader mock = new MockXmlStreamReader(defaultEncoding);
        return mock.calculateRawEncoding(bomEnc, xmlGuessEnc, xmlEnc);
    }

    private void checkRawError(String msgSuffix, String bomEnc, String xmlGuessEnc, String xmlEnc, String defaultEncoding) {
        try {
            checkRawEncoding("XmlStreamReaderException", bomEnc, xmlGuessEnc, xmlEnc, defaultEncoding);
        } catch (XmlStreamReaderException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1114,("Msg Start: " + (e.getMessage())));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1116,e.getMessage(),1115,e.getMessage().startsWith("Invalid encoding"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1117,("Msg End: " + (e.getMessage())));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1119,e.getMessage(),1118,e.getMessage().endsWith(msgSuffix));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1120,bomEnc);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1122,e,1121,e.getBomEncoding());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1123,xmlGuessEnc);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1125,e,1124,e.getXmlGuessEncoding());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1126,xmlEnc);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1128,e,1127,e.getXmlEncoding());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1130,e,1129,e.getContentTypeEncoding());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1132,e,1131,e.getContentTypeMime());
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1133,("Expected XmlStreamReaderException, but threw " + e));
        }
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_add430() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_add430");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_add431() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_add431");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_add432() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_add432");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_add433() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_add433");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_add434() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_add434");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_add435() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_add435");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_add436() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_add436");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_add437() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_add437");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_add438() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_add438");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_add439() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_add439");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_add440() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_add440");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_add441() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_add441");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_add442() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_add442");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_add443() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_add443");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_add444() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_add444");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_add445() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_add445");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_add446() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_add446");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_add447() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_add447");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_add448() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_add448");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_add449() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_add449");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1898() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1898");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1902() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1902");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "bar", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1904() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1904");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("bar", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1905() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1905");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1909() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1909");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "foo", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1911() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1911");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("bar", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1912() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1912");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", false, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1916() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1916");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "bar", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1918() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1918");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1919() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1919");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "foo", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1924() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1924");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("bar", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1925() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1925");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", true, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1930() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1930");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("bar", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1931() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1931");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", true, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1935() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1935");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "bar");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1936() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1936");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("bar", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1937() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1937");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", true, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1942() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1942");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("foo", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1943() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1943");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", true, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1947() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1947");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "bar");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1948() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1948");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("foo", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1949() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1949");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", true, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1950() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1950");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "foo", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1953() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1953");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "foo");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1954() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1954");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("foo", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1955() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1955");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", true, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1960() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1960");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("foo", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1961() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1961");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", true, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1966() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1966");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, true, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1967() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1967");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "bar", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1971() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1971");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, true, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1972() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1972");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "foo", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1976() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1976");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, true, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1981() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1981");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, true, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1982() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1982");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "foo", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1986() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1986");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("bar", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1987() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1987");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", true, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1988() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1988");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "bar", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1992() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1992");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("foo", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1993() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1993");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", true, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1994() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1994");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "bar", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1998() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1998");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("bar", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation1999() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation1999");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", true, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation2004() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation2004");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("bar", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation2005() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation2005");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", true, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation2006() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation2006");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "foo", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation2007() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation2007");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "bar", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation2008() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation2008");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "bar", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncoding_literalMutation2009() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_literalMutation2009");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "bar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_remove280() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_remove280");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_remove281() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_remove281");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_remove282() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_remove282");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_remove283() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_remove283");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_remove284() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_remove284");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_remove285() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_remove285");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_remove286() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_remove286");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_remove287() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_remove287");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_remove288() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_remove288");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_remove289() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_remove289");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_remove290() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_remove290");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_remove291() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_remove291");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_remove292() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_remove292");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_remove293() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_remove293");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_remove294() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_remove294");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_remove295() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_remove295");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-8", true, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_remove296() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_remove296");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_remove297() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_remove297");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_remove298() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_remove298");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncoding_remove299() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncoding_remove299");
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, true, null, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, null, null, null, "UTF-8", null);
        checkHttpEncoding("UTF-16LE", true, null, null, null, "UTF-16LE", null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS3, false, "text/css", null, null, null, null);
        checkHttpEncoding("US-ASCII", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-16BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML, "UTF-8", null, null, "UTF-16BE");
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, null, null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16LE, "UTF-16LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16BE, "UTF-16BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-16LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16LE", null, null, null);
        checkHttpEncoding("UTF-16BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF16, "UTF-16BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, null, null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncodingUtf32_add450() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_add450");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncodingUtf32_add451() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_add451");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncodingUtf32_add452() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_add452");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncodingUtf32_add453() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_add453");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncodingUtf32_add454() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_add454");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncodingUtf32_add455() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_add455");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncodingUtf32_add456() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_add456");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncodingUtf32_add457() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_add457");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncodingUtf32_add458() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_add458");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncodingUtf32_add459() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_add459");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncodingUtf32_add460() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_add460");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncodingUtf32_add461() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_add461");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncodingUtf32() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32");
        checkHttpEncoding("bar", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncodingUtf32_literalMutation2011() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_literalMutation2011");
        checkHttpEncoding("UTF-32LE", false, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncodingUtf32_literalMutation2015() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_literalMutation2015");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "bar", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncodingUtf32_literalMutation2017() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_literalMutation2017");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("foo", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncodingUtf32_literalMutation2018() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_literalMutation2018");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", true, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncodingUtf32_literalMutation2022() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_literalMutation2022");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "foo");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncodingUtf32_literalMutation2023() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_literalMutation2023");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("foo", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncodingUtf32_literalMutation2024() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_literalMutation2024");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", true, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncodingUtf32_literalMutation2028() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_literalMutation2028");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "foo");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncodingUtf32_literalMutation2029() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_literalMutation2029");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("bar", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncodingUtf32_literalMutation2030() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_literalMutation2030");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", true, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncodingUtf32_literalMutation2035() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_literalMutation2035");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("foo", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncodingUtf32_literalMutation2036() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_literalMutation2036");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", true, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncodingUtf32_literalMutation2041() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_literalMutation2041");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, true, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncodingUtf32_literalMutation2042() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_literalMutation2042");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "bar", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncodingUtf32_literalMutation2046() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_literalMutation2046");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, true, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncodingUtf32_literalMutation2047() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_literalMutation2047");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "foo", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncodingUtf32_literalMutation2051() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_literalMutation2051");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, true, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncodingUtf32_literalMutation2056() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_literalMutation2056");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, true, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncodingUtf32_literalMutation2057() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_literalMutation2057");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "foo", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncodingUtf32_literalMutation2061() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_literalMutation2061");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("foo", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncodingUtf32_literalMutation2062() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_literalMutation2062");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", true, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncodingUtf32_literalMutation2063() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_literalMutation2063");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "bar", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncodingUtf32_literalMutation2067() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_literalMutation2067");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("bar", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncodingUtf32_literalMutation2068() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_literalMutation2068");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", true, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncodingUtf32_literalMutation2069() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_literalMutation2069");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "bar", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncodingUtf32_literalMutation2073() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_literalMutation2073");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("bar", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncodingUtf32_literalMutation2074() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_literalMutation2074");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", true, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncodingUtf32_literalMutation2075() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_literalMutation2075");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "foo", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncodingUtf32_literalMutation2076() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_literalMutation2076");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "foo", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncodingUtf32_literalMutation2077() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_literalMutation2077");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "foo", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test
    public void testCalculateHttpEncodingUtf32_literalMutation2078() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_literalMutation2078");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "bar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncodingUtf32_remove300() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_remove300");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncodingUtf32_remove301() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_remove301");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncodingUtf32_remove302() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_remove302");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncodingUtf32_remove303() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_remove303");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncodingUtf32_remove304() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_remove304");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncodingUtf32_remove305() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_remove305");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncodingUtf32_remove306() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_remove306");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncodingUtf32_remove307() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_remove307");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncodingUtf32_remove308() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_remove308");
        checkHttpEncoding("UTF-32LE", true, null, null, null, "UTF-32LE", null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncodingUtf32_remove309() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_remove309");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncodingUtf32_remove310() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_remove310");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test calculate HTTP Encoding
     */
@Test(timeout = 1000)
    public void testCalculateHttpEncodingUtf32_remove311() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCalculateHttpEncodingUtf32_remove311");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.TXTXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML, null, null, null, "UTF-32BE");
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, null, null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32LE, "UTF-32LE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS1, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32BE, "UTF-32BE", null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, null, null, null, null);
        checkHttpError(XmlStreamReaderUtilitiesTest.HTTPMGS2, false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-8", null, null, null);
        checkHttpEncoding("UTF-32LE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32LE", null, null, null);
        checkHttpEncoding("UTF-32BE", false, XmlStreamReaderUtilitiesTest.APPXML_UTF32, "UTF-32BE", null, null, null);
        checkHttpEncoding("UTF-8", false, XmlStreamReaderUtilitiesTest.APPXML_UTF8, "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void checkHttpEncoding(String expected, boolean lenient, String httpContentType, String bomEnc, String xmlGuessEnc, String xmlEnc, String defaultEncoding) throws IOException {
        StringBuilder builder = new StringBuilder();
        builder.append("HttpEncoding=[").append(bomEnc).append("], ");
        builder.append("lenient=[").append(lenient).append("], ");
        builder.append("httpContentType=[").append(httpContentType).append("], ");
        builder.append("bomEnc=[").append(bomEnc).append("], ");
        builder.append("xmlGuessEnc=[").append(xmlGuessEnc).append("], ");
        builder.append("xmlEnc=[").append(xmlEnc).append("], ");
        builder.append("defaultEncoding=[").append(defaultEncoding).append("],");
        String encoding = calculateHttpEncoding(httpContentType, bomEnc, xmlGuessEnc, xmlEnc, lenient, defaultEncoding);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1083,builder,1082,builder.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1084,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1085,encoding);
    }

    protected String calculateHttpEncoding(String httpContentType, String bomEnc, String xmlGuessEnc, String xmlEnc, boolean lenient, String defaultEncoding) throws IOException {
        MockXmlStreamReader mock = new MockXmlStreamReader(defaultEncoding);
        return mock.calculateHttpEncoding(httpContentType, bomEnc, xmlGuessEnc, xmlEnc, lenient);
    }

    private void checkHttpError(String msgSuffix, boolean lenient, String httpContentType, String bomEnc, String xmlGuessEnc, String xmlEnc, String defaultEncoding) {
        try {
            checkHttpEncoding("XmlStreamReaderException", lenient, httpContentType, bomEnc, xmlGuessEnc, xmlEnc, defaultEncoding);
        } catch (XmlStreamReaderException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1086,("Msg Start: " + (e.getMessage())));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1088,e.getMessage(),1087,e.getMessage().startsWith("Invalid encoding"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1089,("Msg End: " + (e.getMessage())));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1091,e.getMessage(),1090,e.getMessage().endsWith(msgSuffix));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1092,bomEnc);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1094,e,1093,e.getBomEncoding());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1095,xmlGuessEnc);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1097,e,1096,e.getXmlGuessEncoding());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1098,xmlEnc);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1100,e,1099,e.getXmlEncoding());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1102,null,1101,org.apache.commons.io.input.XmlStreamReader.getContentTypeEncoding(httpContentType));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1104,e,1103,e.getContentTypeEncoding());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1106,null,1105,org.apache.commons.io.input.XmlStreamReader.getContentTypeMime(httpContentType));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1108,e,1107,e.getContentTypeMime());
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1109,("Expected XmlStreamReaderException, but threw " + e));
        }
    }

    /** 
     * Mock {@link XmlStreamReader} implementation
     */
private static class MockXmlStreamReader extends XmlStreamReader {
        MockXmlStreamReader(String defaultEncoding) throws IOException {
            super(new java.io.ByteArrayInputStream("".getBytes()), null, true, defaultEncoding);
        }
    }
}


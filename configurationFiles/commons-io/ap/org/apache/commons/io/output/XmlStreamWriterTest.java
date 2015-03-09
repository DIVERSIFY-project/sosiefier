package org.apache.commons.io.output;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * @version $Id$
 */
public class XmlStreamWriterTest extends TestCase {
    /** 
     * french
     */
private static final String TEXT_LATIN1 = "eacute: é";

    /** 
     * greek
     */
private static final String TEXT_LATIN7 = "alpha: α";

    /** 
     * euro support
     */
private static final String TEXT_LATIN15 = "euro: €";

    /** 
     * japanese
     */
private static final String TEXT_EUC_JP = "hiragana A: あ";

    /** 
     * Unicode: support everything
     */
private static final String TEXT_UNICODE = ((((((TEXT_LATIN1) + ", ") + (TEXT_LATIN7)) + ", ") + (TEXT_LATIN15)) + ", ") + (TEXT_EUC_JP);

    private static String createXmlContent(String text, String encoding) {
        String xmlDecl = "<?xml version=\"1.0\"?>";
        if (encoding != null) {
            xmlDecl = ("<?xml version=\"1.0\" encoding=\"" + encoding) + "\"?>";
        } 
        String xml = ((xmlDecl + "\n<text>") + text) + "</text>";
        return xml;
    }

    private static void checkXmlContent(String xml, String encoding, String defaultEncoding) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        XmlStreamWriter writer = new XmlStreamWriter(out , defaultEncoding);
        writer.write(xml);
        writer.close();
        byte[] xmlContent = out.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1694,encoding);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1696,writer,1695,writer.getEncoding());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1698,null,1697,java.util.Arrays.equals(xml.getBytes(encoding), xmlContent));
    }

    private static void checkXmlWriter(String text, String encoding) throws IOException {
        XmlStreamWriterTest.checkXmlWriter(text, encoding, null);
    }

    private static void checkXmlWriter(String text, String encoding, String defaultEncoding) throws IOException {
        String xml = XmlStreamWriterTest.createXmlContent(text, encoding);
        String effectiveEncoding = encoding;
        if (effectiveEncoding == null) {
            effectiveEncoding = defaultEncoding == null ? "UTF-8" : defaultEncoding;
        } 
        XmlStreamWriterTest.checkXmlContent(xml, effectiveEncoding, defaultEncoding);
    }

    @Test(timeout = 1000)
    public void testNoXmlHeader_add1152() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoXmlHeader_add1152");
        String xml = "<text>text with no XML header</text>";
        XmlStreamWriterTest.checkXmlContent(xml, "UTF-8", null);
        XmlStreamWriterTest.checkXmlContent(xml, "UTF-8", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNoXmlHeader() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoXmlHeader");
        String xml = "foo";
        XmlStreamWriterTest.checkXmlContent(xml, "UTF-8", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNoXmlHeader_literalMutation3770() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoXmlHeader_literalMutation3770");
        String xml = "<text>text with no XML header</text>";
        XmlStreamWriterTest.checkXmlContent(xml, "bar", null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNoXmlHeader_remove890() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoXmlHeader_remove890");
        String xml = "<text>text with no XML header</text>";
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmpty() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmpty");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        XmlStreamWriter writer = new XmlStreamWriter(out);
        writer.flush();
        writer.write("");
        writer.flush();
        writer.write(".");
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmpty_add1143() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmpty_add1143");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        XmlStreamWriter writer = new XmlStreamWriter(out);
        writer.flush();
        writer.flush();
        writer.write("");
        writer.flush();
        writer.write(".");
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmpty_add1144() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmpty_add1144");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        XmlStreamWriter writer = new XmlStreamWriter(out);
        writer.flush();
        writer.write("");
        writer.write("");
        writer.flush();
        writer.write(".");
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmpty_add1145() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmpty_add1145");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        XmlStreamWriter writer = new XmlStreamWriter(out);
        writer.flush();
        writer.write("");
        writer.flush();
        writer.flush();
        writer.write(".");
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmpty_add1146() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmpty_add1146");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        XmlStreamWriter writer = new XmlStreamWriter(out);
        writer.flush();
        writer.write("");
        writer.flush();
        writer.write(".");
        writer.write(".");
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmpty_add1147() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmpty_add1147");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        XmlStreamWriter writer = new XmlStreamWriter(out);
        writer.flush();
        writer.write("");
        writer.flush();
        writer.write(".");
        writer.flush();
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmpty_add1148() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmpty_add1148");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        XmlStreamWriter writer = new XmlStreamWriter(out);
        writer.flush();
        writer.write("");
        writer.flush();
        writer.write(".");
        writer.flush();
        writer.close();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmpty_literalMutation3764() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmpty_literalMutation3764");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        XmlStreamWriter writer = new XmlStreamWriter(out);
        writer.flush();
        writer.write("bar");
        writer.flush();
        writer.write(".");
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmpty_literalMutation3765() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmpty_literalMutation3765");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        XmlStreamWriter writer = new XmlStreamWriter(out);
        writer.flush();
        writer.write("");
        writer.flush();
        writer.write("foo");
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmpty_remove881() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmpty_remove881");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        XmlStreamWriter writer = new XmlStreamWriter(out);
        writer.write("");
        writer.flush();
        writer.write(".");
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmpty_remove882() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmpty_remove882");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        XmlStreamWriter writer = new XmlStreamWriter(out);
        writer.flush();
        writer.flush();
        writer.write(".");
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmpty_remove883() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmpty_remove883");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        XmlStreamWriter writer = new XmlStreamWriter(out);
        writer.write("");
        writer.flush();
        writer.write(".");
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmpty_remove884() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmpty_remove884");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        XmlStreamWriter writer = new XmlStreamWriter(out);
        writer.flush();
        writer.flush();
        writer.write(".");
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmpty_remove885() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmpty_remove885");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        XmlStreamWriter writer = new XmlStreamWriter(out);
        writer.write("");
        writer.flush();
        writer.write(".");
        writer.flush();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmpty_remove886() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmpty_remove886");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        XmlStreamWriter writer = new XmlStreamWriter(out);
        writer.flush();
        writer.write("");
        writer.flush();
        writer.write(".");
        writer.flush();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDefaultEncoding_add1136() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultEncoding_add1136");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, null);
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, null);
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-8");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-16");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-16BE");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "ISO-8859-1");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDefaultEncoding_add1137() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultEncoding_add1137");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, null);
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-8");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-8");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-16");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-16BE");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "ISO-8859-1");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDefaultEncoding_add1138() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultEncoding_add1138");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, null);
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-8");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-16");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-16");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-16BE");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "ISO-8859-1");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDefaultEncoding_add1139() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultEncoding_add1139");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, null);
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-8");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-16");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-16BE");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-16BE");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "ISO-8859-1");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDefaultEncoding_add1140() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultEncoding_add1140");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, null);
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-8");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-16");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-16BE");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "ISO-8859-1");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "ISO-8859-1");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultEncoding() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultEncoding");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, null);
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "foo");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-16");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-16BE");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "ISO-8859-1");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultEncoding_literalMutation3756() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultEncoding_literalMutation3756");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, null);
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-8");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "foo");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-16BE");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "ISO-8859-1");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultEncoding_literalMutation3758() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultEncoding_literalMutation3758");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, null);
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-8");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-16");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "bar");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "ISO-8859-1");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultEncoding_literalMutation3760() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultEncoding_literalMutation3760");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, null);
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-8");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-16");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-16BE");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "bar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDefaultEncoding_remove874() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultEncoding_remove874");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-8");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-16");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-16BE");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "ISO-8859-1");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDefaultEncoding_remove875() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultEncoding_remove875");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-8");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-16");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-16BE");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "ISO-8859-1");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDefaultEncoding_remove876() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultEncoding_remove876");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-8");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-16");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-16BE");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "ISO-8859-1");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDefaultEncoding_remove877() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultEncoding_remove877");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-8");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-16");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-16BE");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "ISO-8859-1");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDefaultEncoding_remove878() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultEncoding_remove878");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-8");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-16");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "UTF-16BE");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, null, "ISO-8859-1");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF8Encoding_add1156() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8Encoding_add1156");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, "UTF-8");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, "UTF-8");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUTF8Encoding() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8Encoding");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, "bar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF8Encoding_remove894() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF8Encoding_remove894");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF16Encoding_add1154() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16Encoding_add1154");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, "UTF-16");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, "UTF-16");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUTF16Encoding() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16Encoding");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, "bar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF16Encoding_remove892() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16Encoding_remove892");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF16BEEncoding_add1153() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16BEEncoding_add1153");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, "UTF-16BE");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, "UTF-16BE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUTF16BEEncoding() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16BEEncoding");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, "bar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF16BEEncoding_remove891() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16BEEncoding_remove891");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF16LEEncoding_add1155() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16LEEncoding_add1155");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, "UTF-16LE");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, "UTF-16LE");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUTF16LEEncoding() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16LEEncoding");
        XmlStreamWriterTest.checkXmlWriter(TEXT_UNICODE, "bar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUTF16LEEncoding_remove893() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUTF16LEEncoding_remove893");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLatin1Encoding_add1150() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLatin1Encoding_add1150");
        XmlStreamWriterTest.checkXmlWriter(TEXT_LATIN1, "ISO-8859-1");
        XmlStreamWriterTest.checkXmlWriter(TEXT_LATIN1, "ISO-8859-1");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLatin1Encoding() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLatin1Encoding");
        XmlStreamWriterTest.checkXmlWriter(TEXT_LATIN1, "bar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLatin1Encoding_remove888() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLatin1Encoding_remove888");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLatin7Encoding_add1151() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLatin7Encoding_add1151");
        XmlStreamWriterTest.checkXmlWriter(TEXT_LATIN7, "ISO-8859-7");
        XmlStreamWriterTest.checkXmlWriter(TEXT_LATIN7, "ISO-8859-7");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLatin7Encoding() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLatin7Encoding");
        XmlStreamWriterTest.checkXmlWriter(TEXT_LATIN7, "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLatin7Encoding_remove889() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLatin7Encoding_remove889");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLatin15Encoding_add1149() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLatin15Encoding_add1149");
        XmlStreamWriterTest.checkXmlWriter(TEXT_LATIN15, "ISO-8859-15");
        XmlStreamWriterTest.checkXmlWriter(TEXT_LATIN15, "ISO-8859-15");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLatin15Encoding() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLatin15Encoding");
        XmlStreamWriterTest.checkXmlWriter(TEXT_LATIN15, "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLatin15Encoding_remove887() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLatin15Encoding_remove887");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEUC_JPEncoding_add1142() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEUC_JPEncoding_add1142");
        XmlStreamWriterTest.checkXmlWriter(TEXT_EUC_JP, "EUC-JP");
        XmlStreamWriterTest.checkXmlWriter(TEXT_EUC_JP, "EUC-JP");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEUC_JPEncoding() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEUC_JPEncoding");
        XmlStreamWriterTest.checkXmlWriter(TEXT_EUC_JP, "bar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEUC_JPEncoding_remove880() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEUC_JPEncoding_remove880");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEBCDICEncoding_add1141() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEBCDICEncoding_add1141");
        XmlStreamWriterTest.checkXmlWriter("simple text in EBCDIC", "CP1047");
        XmlStreamWriterTest.checkXmlWriter("simple text in EBCDIC", "CP1047");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEBCDICEncoding() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEBCDICEncoding");
        XmlStreamWriterTest.checkXmlWriter("foo", "CP1047");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEBCDICEncoding_literalMutation3762() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEBCDICEncoding_literalMutation3762");
        XmlStreamWriterTest.checkXmlWriter("simple text in EBCDIC", "bar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEBCDICEncoding_remove879() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEBCDICEncoding_remove879");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


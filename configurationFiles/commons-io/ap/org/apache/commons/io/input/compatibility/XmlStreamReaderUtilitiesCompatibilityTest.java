package org.apache.commons.io.input.compatibility;

import java.io.IOException;
import org.apache.commons.io.input.XmlStreamReaderUtilitiesTest;

/** 
 * Test compatibility of the original XmlStreamReader (before all the refactoring).
 */
public class XmlStreamReaderUtilitiesCompatibilityTest extends XmlStreamReaderUtilitiesTest {
    @Override
    protected String calculateRawEncoding(String bomEnc, String xmlGuessEnc, String xmlEnc, String defaultEncoding) throws IOException {
        MockXmlStreamReader mock = new MockXmlStreamReader(defaultEncoding);
        return mock.calculateRawEncoding(bomEnc, xmlGuessEnc, xmlEnc, null);
    }

    @Override
    protected String calculateHttpEncoding(String httpContentType, String bomEnc, String xmlGuessEnc, String xmlEnc, boolean lenient, String defaultEncoding) throws IOException {
        MockXmlStreamReader mock = new MockXmlStreamReader(defaultEncoding);
        return mock.calculateHttpEncoding(XmlStreamReader.getContentTypeMime(httpContentType), XmlStreamReader.getContentTypeEncoding(httpContentType), bomEnc, xmlGuessEnc, xmlEnc, null, lenient);
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


package org.apache.commons.io.input.compatibility;

import java.io.InputStream;

/** 
 * The XmlStreamReaderException is thrown by the XmlStreamReader constructors if
 * the charset encoding can not be determined according to the XML 1.0
 * specification and RFC 3023.
 * <p>
 * The exception returns the unconsumed InputStream to allow the application to
 * do an alternate processing with the stream. Note that the original
 * InputStream given to the XmlStreamReader cannot be used as that one has been
 * already read.
 * 
 * @version $Id$
 */
public class XmlStreamReaderException extends org.apache.commons.io.input.XmlStreamReaderException {
    private static final long serialVersionUID = 1L;

    private final InputStream is;

    /** 
     * Creates an exception instance if the charset encoding could not be
     * determined.
     * <p>
     * Instances of this exception are thrown by the XmlStreamReader.
     * 
     * @param msg message describing the reason for the exception.
     * @param bomEnc BOM encoding.
     * @param xmlGuessEnc XML guess encoding.
     * @param xmlEnc XML prolog encoding.
     * @param is the unconsumed InputStream.
     */
public XmlStreamReaderException(String msg ,String bomEnc ,String xmlGuessEnc ,String xmlEnc ,InputStream is) {
        this(msg, null, null, bomEnc, xmlGuessEnc, xmlEnc, is);
    }

    /** 
     * Creates an exception instance if the charset encoding could not be
     * determined.
     * <p>
     * Instances of this exception are thrown by the XmlStreamReader.
     * 
     * @param msg message describing the reason for the exception.
     * @param ctMime MIME type in the content-type.
     * @param ctEnc encoding in the content-type.
     * @param bomEnc BOM encoding.
     * @param xmlGuessEnc XML guess encoding.
     * @param xmlEnc XML prolog encoding.
     * @param is the unconsumed InputStream.
     */
public XmlStreamReaderException(String msg ,String ctMime ,String ctEnc ,String bomEnc ,String xmlGuessEnc ,String xmlEnc ,InputStream is) {
        super(msg, ctMime, ctEnc, bomEnc, xmlGuessEnc, xmlEnc);
        this.is = is;
    }

    /** 
     * Returns the unconsumed InputStream to allow the application to do an
     * alternate encoding detection on the InputStream.
     * 
     * @return the unconsumed InputStream.
     */
public InputStream getInputStream() {
        return is;
    }
}


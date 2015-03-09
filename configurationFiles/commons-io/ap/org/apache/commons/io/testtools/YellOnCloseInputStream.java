package org.apache.commons.io.testtools;

import junit.framework.AssertionFailedError;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.input.ProxyInputStream;

/** 
 * Helper class for checking behaviour of IO classes.
 */
public class YellOnCloseInputStream extends ProxyInputStream {
    /** 
     * @param proxy InputStream to delegate to.
     */
public YellOnCloseInputStream(InputStream proxy) {
        super(proxy);
    }

    /** 
     * @see java.io.InputStream#close()
     */
@Override
    public void close() throws IOException {
        throw new AssertionFailedError("close() was called on OutputStream");
    }
}


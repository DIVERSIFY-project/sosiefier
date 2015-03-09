package org.apache.commons.io;

import java.io.IOException;
import java.io.Serializable;
import junit.framework.TestCase;

/** 
 * JUnit Test Case for {@link TaggedIOException}.
 */
public class TaggedIOExceptionTest extends TestCase {
    public void testTaggedIOException() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTaggedIOException");
        Serializable tag = java.util.UUID.randomUUID();
        IOException exception = new IOException("foo");
        TaggedIOException tagged = new TaggedIOException(exception , tag);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5742,null,5741,org.apache.commons.io.TaggedIOException.isTaggedWith(tagged, tag));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5744,null,5743,org.apache.commons.io.TaggedIOException.isTaggedWith(tagged, java.util.UUID.randomUUID()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5745,exception);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5747,tagged,5746,tagged.getCause());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5749,exception,5748,exception.getMessage());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5751,tagged,5750,tagged.getMessage());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


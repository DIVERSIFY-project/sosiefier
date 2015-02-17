package org.apache.commons.io.input;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * JUnit Test Case for {@link TaggedInputStream}.
 */
public class TaggedInputStreamTest extends TestCase {
    @Test(timeout = 1000)
    public void testEmptyStream() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyStream");
        try {
            InputStream stream = new TaggedInputStream(new ClosedInputStream());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stream,881,stream.available());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),883,-1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,stream,884,stream.read());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),886,-1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),888,stream,887,stream.read(new byte[1]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),889,-1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),891,stream,890,stream.read(new byte[1], 0, 1));
            stream.close();
            stream.close();
        } catch (IOException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNormalStream_add257() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNormalStream_add257");
        try {
            InputStream stream = new TaggedInputStream(new ByteArrayInputStream(new byte[]{ 'a' , 'b' , 'c' }));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),893,stream,892,stream.available());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),895,stream,894,stream.read());
            byte[] buffer = new byte[1];
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),897,stream,896,stream.read(buffer));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),898,buffer[0]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),900,stream,899,stream.read(buffer, 0, 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),901,buffer[0]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),581,-1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),903,stream,902,stream.read());
            stream.close();
            stream.close();
        } catch (IOException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNormalStream() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNormalStream");
        try {
            InputStream stream = new TaggedInputStream(new ByteArrayInputStream(new byte[]{ 'a' , 'b' , 'c' }));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),893,stream,892,stream.available());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),895,stream,894,stream.read());
            byte[] buffer = new byte[2];
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),897,stream,896,stream.read(buffer));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),898,buffer[0]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),900,stream,899,stream.read(buffer, 0, 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),901,buffer[0]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),581,-1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),903,stream,902,stream.read());
            stream.close();
        } catch (IOException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNormalStream_literalMutation1312() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNormalStream_literalMutation1312");
        try {
            InputStream stream = new TaggedInputStream(new ByteArrayInputStream(new byte[]{ 'a' , 'b' , 'c' }));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),893,stream,892,stream.available());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),895,stream,894,stream.read());
            byte[] buffer = new byte[0];
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),897,stream,896,stream.read(buffer));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),898,buffer[0]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),900,stream,899,stream.read(buffer, 0, 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),901,buffer[0]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),581,-1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),903,stream,902,stream.read());
            stream.close();
        } catch (IOException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNormalStream_literalMutation1313() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNormalStream_literalMutation1313");
        try {
            InputStream stream = new TaggedInputStream(new ByteArrayInputStream(new byte[]{ 'a' , 'b' , 'c' }));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),893,stream,892,stream.available());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),895,stream,894,stream.read());
            byte[] buffer = new byte[0];
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),897,stream,896,stream.read(buffer));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),898,buffer[0]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),900,stream,899,stream.read(buffer, 0, 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),901,buffer[0]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),581,-1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),903,stream,902,stream.read());
            stream.close();
        } catch (IOException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBrokenStream_add250() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBrokenStream_add250");
        IOException exception = new IOException("test exception");
        TaggedInputStream stream = new TaggedInputStream(new BrokenInputStream(exception));
        try {
            stream.available();
            stream.available();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),870,stream,869,stream.isCauseOf(e));
            try {
                stream.throwIfCauseOf(e);
            } catch (IOException e2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),871,exception);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),872,e2);
            }
        }
        try {
            stream.read();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,stream,873,stream.isCauseOf(e));
            try {
                stream.throwIfCauseOf(e);
            } catch (IOException e2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),875,exception);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,e2);
            }
        }
        try {
            stream.close();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),878,stream,877,stream.isCauseOf(e));
            try {
                stream.throwIfCauseOf(e);
            } catch (IOException e2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,exception);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,e2);
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBrokenStream_add251() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBrokenStream_add251");
        IOException exception = new IOException("test exception");
        TaggedInputStream stream = new TaggedInputStream(new BrokenInputStream(exception));
        try {
            stream.available();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),870,stream,869,stream.isCauseOf(e));
            try {
                stream.throwIfCauseOf(e);
                stream.throwIfCauseOf(e);
            } catch (IOException e2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),871,exception);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),872,e2);
            }
        }
        try {
            stream.read();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,stream,873,stream.isCauseOf(e));
            try {
                stream.throwIfCauseOf(e);
            } catch (IOException e2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),875,exception);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,e2);
            }
        }
        try {
            stream.close();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),878,stream,877,stream.isCauseOf(e));
            try {
                stream.throwIfCauseOf(e);
            } catch (IOException e2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,exception);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,e2);
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBrokenStream_add252() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBrokenStream_add252");
        IOException exception = new IOException("test exception");
        TaggedInputStream stream = new TaggedInputStream(new BrokenInputStream(exception));
        try {
            stream.available();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),870,stream,869,stream.isCauseOf(e));
            try {
                stream.throwIfCauseOf(e);
            } catch (IOException e2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),871,exception);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),872,e2);
            }
        }
        try {
            stream.read();
            stream.read();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,stream,873,stream.isCauseOf(e));
            try {
                stream.throwIfCauseOf(e);
            } catch (IOException e2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),875,exception);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,e2);
            }
        }
        try {
            stream.close();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),878,stream,877,stream.isCauseOf(e));
            try {
                stream.throwIfCauseOf(e);
            } catch (IOException e2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,exception);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,e2);
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBrokenStream_add253() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBrokenStream_add253");
        IOException exception = new IOException("test exception");
        TaggedInputStream stream = new TaggedInputStream(new BrokenInputStream(exception));
        try {
            stream.available();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),870,stream,869,stream.isCauseOf(e));
            try {
                stream.throwIfCauseOf(e);
            } catch (IOException e2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),871,exception);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),872,e2);
            }
        }
        try {
            stream.read();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,stream,873,stream.isCauseOf(e));
            try {
                stream.throwIfCauseOf(e);
                stream.throwIfCauseOf(e);
            } catch (IOException e2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),875,exception);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,e2);
            }
        }
        try {
            stream.close();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),878,stream,877,stream.isCauseOf(e));
            try {
                stream.throwIfCauseOf(e);
            } catch (IOException e2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,exception);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,e2);
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBrokenStream_add254() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBrokenStream_add254");
        IOException exception = new IOException("test exception");
        TaggedInputStream stream = new TaggedInputStream(new BrokenInputStream(exception));
        try {
            stream.available();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),870,stream,869,stream.isCauseOf(e));
            try {
                stream.throwIfCauseOf(e);
            } catch (IOException e2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),871,exception);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),872,e2);
            }
        }
        try {
            stream.read();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,stream,873,stream.isCauseOf(e));
            try {
                stream.throwIfCauseOf(e);
            } catch (IOException e2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),875,exception);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,e2);
            }
        }
        try {
            stream.close();
            stream.close();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),878,stream,877,stream.isCauseOf(e));
            try {
                stream.throwIfCauseOf(e);
            } catch (IOException e2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,exception);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,e2);
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBrokenStream_add255() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBrokenStream_add255");
        IOException exception = new IOException("test exception");
        TaggedInputStream stream = new TaggedInputStream(new BrokenInputStream(exception));
        try {
            stream.available();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),870,stream,869,stream.isCauseOf(e));
            try {
                stream.throwIfCauseOf(e);
            } catch (IOException e2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),871,exception);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),872,e2);
            }
        }
        try {
            stream.read();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,stream,873,stream.isCauseOf(e));
            try {
                stream.throwIfCauseOf(e);
            } catch (IOException e2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),875,exception);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,e2);
            }
        }
        try {
            stream.close();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),878,stream,877,stream.isCauseOf(e));
            try {
                stream.throwIfCauseOf(e);
                stream.throwIfCauseOf(e);
            } catch (IOException e2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,exception);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,e2);
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBrokenStream() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBrokenStream");
        IOException exception = new IOException("bar");
        TaggedInputStream stream = new TaggedInputStream(new BrokenInputStream(exception));
        try {
            stream.available();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),870,stream,869,stream.isCauseOf(e));
            try {
                stream.throwIfCauseOf(e);
            } catch (IOException e2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),871,exception);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),872,e2);
            }
        }
        try {
            stream.read();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,stream,873,stream.isCauseOf(e));
            try {
                stream.throwIfCauseOf(e);
            } catch (IOException e2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),875,exception);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,e2);
            }
        }
        try {
            stream.close();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),878,stream,877,stream.isCauseOf(e));
            try {
                stream.throwIfCauseOf(e);
            } catch (IOException e2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,exception);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,e2);
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testOtherException_add258() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOtherException_add258");
        IOException exception = new IOException("test exception");
        InputStream closed = new ClosedInputStream();
        TaggedInputStream stream = new TaggedInputStream(closed);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),905,stream,904,stream.isCauseOf(exception));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),907,stream,906,stream.isCauseOf(new org.apache.commons.io.TaggedIOException(exception , java.util.UUID.randomUUID())));
        try {
            stream.throwIfCauseOf(exception);
            stream.throwIfCauseOf(exception);
        } catch (IOException e) {
        }
        try {
            stream.throwIfCauseOf(new org.apache.commons.io.TaggedIOException(exception , java.util.UUID.randomUUID()));
        } catch (IOException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testOtherException_add259() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOtherException_add259");
        IOException exception = new IOException("test exception");
        InputStream closed = new ClosedInputStream();
        TaggedInputStream stream = new TaggedInputStream(closed);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),905,stream,904,stream.isCauseOf(exception));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),907,stream,906,stream.isCauseOf(new org.apache.commons.io.TaggedIOException(exception , java.util.UUID.randomUUID())));
        try {
            stream.throwIfCauseOf(exception);
        } catch (IOException e) {
        }
        try {
            stream.throwIfCauseOf(new org.apache.commons.io.TaggedIOException(exception , java.util.UUID.randomUUID()));
            stream.throwIfCauseOf(new org.apache.commons.io.TaggedIOException(exception , java.util.UUID.randomUUID()));
        } catch (IOException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testOtherException() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOtherException");
        IOException exception = new IOException("bar");
        InputStream closed = new ClosedInputStream();
        TaggedInputStream stream = new TaggedInputStream(closed);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),905,stream,904,stream.isCauseOf(exception));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),907,stream,906,stream.isCauseOf(new org.apache.commons.io.TaggedIOException(exception , java.util.UUID.randomUUID())));
        try {
            stream.throwIfCauseOf(exception);
        } catch (IOException e) {
        }
        try {
            stream.throwIfCauseOf(new org.apache.commons.io.TaggedIOException(exception , java.util.UUID.randomUUID()));
        } catch (IOException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * JUnit Test Case for {@link TaggedOutputStream}.
 */
public class TaggedOutputStreamTest extends TestCase {
    public void testNormalStream() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNormalStream");
        try {
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            OutputStream stream = new TaggedOutputStream(buffer);
            stream.write('a');
            stream.write(new byte[]{ 'b' });
            stream.write(new byte[]{ 'c' }, 0, 1);
            stream.flush();
            stream.close();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,buffer,1663,buffer.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1665,buffer.toByteArray()[0]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1666,buffer.toByteArray()[1]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1667,buffer.toByteArray()[2]);
        } catch (IOException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNormalStream_add1102() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNormalStream_add1102");
        try {
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            OutputStream stream = new TaggedOutputStream(buffer);
            stream.write('a');
            stream.write('a');
            stream.write(new byte[]{ 'b' });
            stream.write(new byte[]{ 'c' }, 0, 1);
            stream.flush();
            stream.close();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,buffer,1663,buffer.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1665,buffer.toByteArray()[0]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1666,buffer.toByteArray()[1]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1667,buffer.toByteArray()[2]);
        } catch (IOException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNormalStream_add1103() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNormalStream_add1103");
        try {
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            OutputStream stream = new TaggedOutputStream(buffer);
            stream.write('a');
            stream.write(new byte[]{ 'b' });
            stream.write(new byte[]{ 'b' });
            stream.write(new byte[]{ 'c' }, 0, 1);
            stream.flush();
            stream.close();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,buffer,1663,buffer.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1665,buffer.toByteArray()[0]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1666,buffer.toByteArray()[1]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1667,buffer.toByteArray()[2]);
        } catch (IOException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNormalStream_add1104() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNormalStream_add1104");
        try {
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            OutputStream stream = new TaggedOutputStream(buffer);
            stream.write('a');
            stream.write(new byte[]{ 'b' });
            stream.write(new byte[]{ 'c' }, 0, 1);
            stream.write(new byte[]{ 'c' }, 0, 1);
            stream.flush();
            stream.close();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,buffer,1663,buffer.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1665,buffer.toByteArray()[0]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1666,buffer.toByteArray()[1]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1667,buffer.toByteArray()[2]);
        } catch (IOException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNormalStream_add1105() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNormalStream_add1105");
        try {
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            OutputStream stream = new TaggedOutputStream(buffer);
            stream.write('a');
            stream.write(new byte[]{ 'b' });
            stream.write(new byte[]{ 'c' }, 0, 1);
            stream.flush();
            stream.flush();
            stream.close();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,buffer,1663,buffer.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1665,buffer.toByteArray()[0]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1666,buffer.toByteArray()[1]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1667,buffer.toByteArray()[2]);
        } catch (IOException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNormalStream_add1106() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNormalStream_add1106");
        try {
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            OutputStream stream = new TaggedOutputStream(buffer);
            stream.write('a');
            stream.write(new byte[]{ 'b' });
            stream.write(new byte[]{ 'c' }, 0, 1);
            stream.flush();
            stream.close();
            stream.close();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,buffer,1663,buffer.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1665,buffer.toByteArray()[0]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1666,buffer.toByteArray()[1]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1667,buffer.toByteArray()[2]);
        } catch (IOException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNormalStream_literalMutation3665() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNormalStream_literalMutation3665");
        try {
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            OutputStream stream = new TaggedOutputStream(buffer);
            stream.write('a');
            stream.write(new byte[]{ 'b' });
            stream.write(new byte[]{ 'c' }, 1, 1);
            stream.flush();
            stream.close();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,buffer,1663,buffer.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1665,buffer.toByteArray()[0]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1666,buffer.toByteArray()[1]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1667,buffer.toByteArray()[2]);
        } catch (IOException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNormalStream_literalMutation3666() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNormalStream_literalMutation3666");
        try {
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            OutputStream stream = new TaggedOutputStream(buffer);
            stream.write('a');
            stream.write(new byte[]{ 'b' });
            stream.write(new byte[]{ 'c' }, -1, 1);
            stream.flush();
            stream.close();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,buffer,1663,buffer.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1665,buffer.toByteArray()[0]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1666,buffer.toByteArray()[1]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1667,buffer.toByteArray()[2]);
        } catch (IOException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNormalStream_literalMutation3667() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNormalStream_literalMutation3667");
        try {
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            OutputStream stream = new TaggedOutputStream(buffer);
            stream.write('a');
            stream.write(new byte[]{ 'b' });
            stream.write(new byte[]{ 'c' }, 0, 1);
            stream.flush();
            stream.close();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,buffer,1663,buffer.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1665,buffer.toByteArray()[0]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1666,buffer.toByteArray()[1]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1667,buffer.toByteArray()[2]);
        } catch (IOException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNormalStream_literalMutation3668() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNormalStream_literalMutation3668");
        try {
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            OutputStream stream = new TaggedOutputStream(buffer);
            stream.write('a');
            stream.write(new byte[]{ 'b' });
            stream.write(new byte[]{ 'c' }, 0, 2);
            stream.flush();
            stream.close();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,buffer,1663,buffer.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1665,buffer.toByteArray()[0]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1666,buffer.toByteArray()[1]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1667,buffer.toByteArray()[2]);
        } catch (IOException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNormalStream_literalMutation3669() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNormalStream_literalMutation3669");
        try {
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            OutputStream stream = new TaggedOutputStream(buffer);
            stream.write('a');
            stream.write(new byte[]{ 'b' });
            stream.write(new byte[]{ 'c' }, 0, 0);
            stream.flush();
            stream.close();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,buffer,1663,buffer.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1665,buffer.toByteArray()[0]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1666,buffer.toByteArray()[1]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1667,buffer.toByteArray()[2]);
        } catch (IOException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNormalStream_literalMutation3670() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNormalStream_literalMutation3670");
        try {
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            OutputStream stream = new TaggedOutputStream(buffer);
            stream.write('a');
            stream.write(new byte[]{ 'b' });
            stream.write(new byte[]{ 'c' }, 0, 0);
            stream.flush();
            stream.close();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,buffer,1663,buffer.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1665,buffer.toByteArray()[0]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1666,buffer.toByteArray()[1]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1667,buffer.toByteArray()[2]);
        } catch (IOException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBrokenStream() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBrokenStream");
        IOException exception = new IOException("test exception");
        TaggedOutputStream stream = new TaggedOutputStream(new BrokenOutputStream(exception));
        try {
            stream.write('x');
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1660,stream,1659,stream.isCauseOf(e));
            try {
                stream.throwIfCauseOf(e);
            } catch (IOException e2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1661,exception);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1662,e2);
            }
        }
        try {
            stream.flush();
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
            stream.close();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,stream,873,stream.isCauseOf(e));
            try {
                stream.throwIfCauseOf(e);
            } catch (IOException e2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),875,exception);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,e2);
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBrokenStream_add1096() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBrokenStream_add1096");
        IOException exception = new IOException("test exception");
        TaggedOutputStream stream = new TaggedOutputStream(new BrokenOutputStream(exception));
        try {
            stream.write('x');
            stream.write('x');
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1660,stream,1659,stream.isCauseOf(e));
            try {
                stream.throwIfCauseOf(e);
            } catch (IOException e2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1661,exception);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1662,e2);
            }
        }
        try {
            stream.flush();
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
            stream.close();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,stream,873,stream.isCauseOf(e));
            try {
                stream.throwIfCauseOf(e);
            } catch (IOException e2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),875,exception);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,e2);
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBrokenStream_add1097() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBrokenStream_add1097");
        IOException exception = new IOException("test exception");
        TaggedOutputStream stream = new TaggedOutputStream(new BrokenOutputStream(exception));
        try {
            stream.write('x');
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1660,stream,1659,stream.isCauseOf(e));
            try {
                stream.throwIfCauseOf(e);
                stream.throwIfCauseOf(e);
            } catch (IOException e2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1661,exception);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1662,e2);
            }
        }
        try {
            stream.flush();
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
            stream.close();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,stream,873,stream.isCauseOf(e));
            try {
                stream.throwIfCauseOf(e);
            } catch (IOException e2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),875,exception);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,e2);
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBrokenStream_add1098() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBrokenStream_add1098");
        IOException exception = new IOException("test exception");
        TaggedOutputStream stream = new TaggedOutputStream(new BrokenOutputStream(exception));
        try {
            stream.write('x');
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1660,stream,1659,stream.isCauseOf(e));
            try {
                stream.throwIfCauseOf(e);
            } catch (IOException e2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1661,exception);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1662,e2);
            }
        }
        try {
            stream.flush();
            stream.flush();
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
            stream.close();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,stream,873,stream.isCauseOf(e));
            try {
                stream.throwIfCauseOf(e);
            } catch (IOException e2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),875,exception);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,e2);
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBrokenStream_add1099() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBrokenStream_add1099");
        IOException exception = new IOException("test exception");
        TaggedOutputStream stream = new TaggedOutputStream(new BrokenOutputStream(exception));
        try {
            stream.write('x');
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1660,stream,1659,stream.isCauseOf(e));
            try {
                stream.throwIfCauseOf(e);
            } catch (IOException e2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1661,exception);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1662,e2);
            }
        }
        try {
            stream.flush();
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
            stream.close();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,stream,873,stream.isCauseOf(e));
            try {
                stream.throwIfCauseOf(e);
            } catch (IOException e2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),875,exception);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,e2);
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBrokenStream_add1100() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBrokenStream_add1100");
        IOException exception = new IOException("test exception");
        TaggedOutputStream stream = new TaggedOutputStream(new BrokenOutputStream(exception));
        try {
            stream.write('x');
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1660,stream,1659,stream.isCauseOf(e));
            try {
                stream.throwIfCauseOf(e);
            } catch (IOException e2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1661,exception);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1662,e2);
            }
        }
        try {
            stream.flush();
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
            stream.close();
            stream.close();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,stream,873,stream.isCauseOf(e));
            try {
                stream.throwIfCauseOf(e);
            } catch (IOException e2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),875,exception);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,e2);
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBrokenStream_add1101() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBrokenStream_add1101");
        IOException exception = new IOException("test exception");
        TaggedOutputStream stream = new TaggedOutputStream(new BrokenOutputStream(exception));
        try {
            stream.write('x');
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1660,stream,1659,stream.isCauseOf(e));
            try {
                stream.throwIfCauseOf(e);
            } catch (IOException e2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1661,exception);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1662,e2);
            }
        }
        try {
            stream.flush();
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
            stream.close();
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
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBrokenStream_literalMutation3660() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBrokenStream_literalMutation3660");
        IOException exception = new IOException("foo");
        TaggedOutputStream stream = new TaggedOutputStream(new BrokenOutputStream(exception));
        try {
            stream.write('x');
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1660,stream,1659,stream.isCauseOf(e));
            try {
                stream.throwIfCauseOf(e);
            } catch (IOException e2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1661,exception);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1662,e2);
            }
        }
        try {
            stream.flush();
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
            stream.close();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,stream,873,stream.isCauseOf(e));
            try {
                stream.throwIfCauseOf(e);
            } catch (IOException e2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),875,exception);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,e2);
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testOtherException() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOtherException");
        IOException exception = new IOException("test exception");
        OutputStream closed = new ClosedOutputStream();
        TaggedOutputStream stream = new TaggedOutputStream(closed);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1669,stream,1668,stream.isCauseOf(exception));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1671,stream,1670,stream.isCauseOf(new org.apache.commons.io.TaggedIOException(exception , java.util.UUID.randomUUID())));
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

    @Test(timeout = 1000)
    public void testOtherException_add1107() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOtherException_add1107");
        IOException exception = new IOException("test exception");
        OutputStream closed = new ClosedOutputStream();
        TaggedOutputStream stream = new TaggedOutputStream(closed);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1669,stream,1668,stream.isCauseOf(exception));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1671,stream,1670,stream.isCauseOf(new org.apache.commons.io.TaggedIOException(exception , java.util.UUID.randomUUID())));
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
    public void testOtherException_add1108() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOtherException_add1108");
        IOException exception = new IOException("test exception");
        OutputStream closed = new ClosedOutputStream();
        TaggedOutputStream stream = new TaggedOutputStream(closed);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1669,stream,1668,stream.isCauseOf(exception));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1671,stream,1670,stream.isCauseOf(new org.apache.commons.io.TaggedIOException(exception , java.util.UUID.randomUUID())));
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

    public void testOtherException_literalMutation3671() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOtherException_literalMutation3671");
        IOException exception = new IOException("bar");
        OutputStream closed = new ClosedOutputStream();
        TaggedOutputStream stream = new TaggedOutputStream(closed);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1669,stream,1668,stream.isCauseOf(exception));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1671,stream,1670,stream.isCauseOf(new org.apache.commons.io.TaggedIOException(exception , java.util.UUID.randomUUID())));
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


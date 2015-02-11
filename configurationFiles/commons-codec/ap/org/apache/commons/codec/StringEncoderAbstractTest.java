package org.apache.commons.codec;

import java.util.Locale;
import org.junit.Test;

/** 
 * @version $Id$
 */
public abstract class StringEncoderAbstractTest<T extends org.apache.commons.codec.StringEncoder> {
    protected T stringEncoder = createStringEncoder();

    public void checkEncoding(final String expected, final String source) throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2731,("Source: " + source));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2732,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2734,getStringEncoder(),2733,getStringEncoder().encode(source));
    }

    protected void checkEncodings(final String[][] data) throws EncoderException {
        for (final String[] element : data) {
            checkEncoding(element[1], element[0]);
        }
    }

    protected void checkEncodingVariations(final String expected, final String[] data) throws EncoderException {
        for (final String element : data) {
            checkEncoding(expected, element);
        }
    }

    protected abstract T createStringEncoder();

    public T getStringEncoder() {
        return this.stringEncoder;
    }

    @Test
    public void testEncodeEmpty() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeEmpty");
        final Encoder encoder = getStringEncoder();
        encoder.encode("");
        encoder.encode(" ");
        encoder.encode("\t");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeEmpty_add538() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeEmpty_add538");
        final Encoder encoder = getStringEncoder();
        encoder.encode("");
        encoder.encode("");
        encoder.encode(" ");
        encoder.encode("\t");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeEmpty_add539() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeEmpty_add539");
        final Encoder encoder = getStringEncoder();
        encoder.encode("");
        encoder.encode(" ");
        encoder.encode(" ");
        encoder.encode("\t");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeEmpty_add540() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeEmpty_add540");
        final Encoder encoder = getStringEncoder();
        encoder.encode("");
        encoder.encode(" ");
        encoder.encode("\t");
        encoder.encode("\t");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeEmpty_literalMutation2616() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeEmpty_literalMutation2616");
        final Encoder encoder = getStringEncoder();
        encoder.encode("foo");
        encoder.encode(" ");
        encoder.encode("\t");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeEmpty_literalMutation2617() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeEmpty_literalMutation2617");
        final Encoder encoder = getStringEncoder();
        encoder.encode("");
        encoder.encode("foo");
        encoder.encode("\t");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeEmpty_literalMutation2618() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeEmpty_literalMutation2618");
        final Encoder encoder = getStringEncoder();
        encoder.encode("");
        encoder.encode(" ");
        encoder.encode("foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeEmpty_remove480() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeEmpty_remove480");
        final Encoder encoder = getStringEncoder();
        encoder.encode(" ");
        encoder.encode("\t");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeEmpty_remove481() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeEmpty_remove481");
        final Encoder encoder = getStringEncoder();
        encoder.encode(" ");
        encoder.encode("\t");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeEmpty_remove482() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeEmpty_remove482");
        final Encoder encoder = getStringEncoder();
        encoder.encode(" ");
        encoder.encode("\t");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeNull() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeNull");
        final StringEncoder encoder = getStringEncoder();
        try {
            encoder.encode(null);
        } catch (final EncoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeNull_add541() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeNull_add541");
        final StringEncoder encoder = getStringEncoder();
        try {
            encoder.encode(null);
            encoder.encode(null);
        } catch (final EncoderException ee) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeWithInvalidObject_add542() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeWithInvalidObject_add542");
        boolean exceptionThrown = false;
        try {
            final StringEncoder encoder = getStringEncoder();
            encoder.encode(new java.lang.Float(3.4));
            encoder.encode(new java.lang.Float(3.4));
        } catch (final Exception e) {
            exceptionThrown = true;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2735,("An exception was not thrown when we tried to encode " + "a Float object"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2736,exceptionThrown);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeWithInvalidObject() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeWithInvalidObject");
        boolean exceptionThrown = false;
        try {
            final StringEncoder encoder = getStringEncoder();
            encoder.encode(new java.lang.Float(3.4));
        } catch (final Exception e) {
            exceptionThrown = true;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2735,("An exception was not thrown when we tried to encode " + "a Float object"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2736,exceptionThrown);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeWithInvalidObject_literalMutation2621() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeWithInvalidObject_literalMutation2621");
        boolean exceptionThrown = false;
        try {
            final StringEncoder encoder = getStringEncoder();
            encoder.encode(new java.lang.Float(2.4));
        } catch (final Exception e) {
            exceptionThrown = true;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2735,("An exception was not thrown when we tried to encode " + "a Float object"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2736,exceptionThrown);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeWithInvalidObject_literalMutation2622() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeWithInvalidObject_literalMutation2622");
        boolean exceptionThrown = false;
        try {
            final StringEncoder encoder = getStringEncoder();
            encoder.encode(new java.lang.Float(3.4));
        } catch (final Exception e) {
            exceptionThrown = true;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2735,("An exception was not thrown when we tried to encode " + "a Float object"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2736,exceptionThrown);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLocaleIndependence_add543() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_add543");
        final StringEncoder encoder = getStringEncoder();
        final String[] data = new String[]{ "I" , "i" };
        final Locale orig = Locale.getDefault();
        final Locale[] locales = new Locale[]{ Locale.ENGLISH , new Locale("tr") , Locale.getDefault() };
        try {
            for (final String element : data) {
                String ref = null;
                for (int j = 0 ; j < (locales.length) ; j++) {
                    Locale.setDefault(locales[j]);
                    Locale.setDefault(locales[j]);
                    if (j <= 0) {
                        ref = encoder.encode(element);
                    } else {
                        String cur = null;
                        try {
                            cur = encoder.encode(element);
                        } catch (final Exception e) {
                            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2737,(((java.util.Locale.getDefault().toString()) + ": ") + (e.getMessage())));
                        }
                        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2738,((java.util.Locale.getDefault().toString()) + ": "));
                        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2739,ref);
                        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2740,cur);
                    }
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLocaleIndependence_add544() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_add544");
        final StringEncoder encoder = getStringEncoder();
        final String[] data = new String[]{ "I" , "i" };
        final Locale orig = Locale.getDefault();
        final Locale[] locales = new Locale[]{ Locale.ENGLISH , new Locale("tr") , Locale.getDefault() };
        try {
            for (final String element : data) {
                String ref = null;
                for (int j = 0 ; j < (locales.length) ; j++) {
                    Locale.setDefault(locales[j]);
                    if (j <= 0) {
                        ref = encoder.encode(element);
                    } else {
                        String cur = null;
                        try {
                            cur = encoder.encode(element);
                        } catch (final Exception e) {
                            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2737,(((java.util.Locale.getDefault().toString()) + ": ") + (e.getMessage())));
                        }
                        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2738,((java.util.Locale.getDefault().toString()) + ": "));
                        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2739,ref);
                        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2740,cur);
                    }
                }
            }
        } finally {
            Locale.setDefault(orig);
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testLocaleIndependence() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence");
        final StringEncoder encoder = getStringEncoder();
        final String[] data = new String[]{ "foo" , "i" };
        final Locale orig = Locale.getDefault();
        final Locale[] locales = new Locale[]{ Locale.ENGLISH , new Locale("tr") , Locale.getDefault() };
        try {
            for (final String element : data) {
                String ref = null;
                for (int j = 0 ; j < (locales.length) ; j++) {
                    Locale.setDefault(locales[j]);
                    if (j <= 0) {
                        ref = encoder.encode(element);
                    } else {
                        String cur = null;
                        try {
                            cur = encoder.encode(element);
                        } catch (final Exception e) {
                            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2737,(((java.util.Locale.getDefault().toString()) + ": ") + (e.getMessage())));
                        }
                        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2738,((java.util.Locale.getDefault().toString()) + ": "));
                        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2739,ref);
                        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2740,cur);
                    }
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testLocaleIndependence_literalMutation2624() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation2624");
        final StringEncoder encoder = getStringEncoder();
        final String[] data = new String[]{ "I" , "foo" };
        final Locale orig = Locale.getDefault();
        final Locale[] locales = new Locale[]{ Locale.ENGLISH , new Locale("tr") , Locale.getDefault() };
        try {
            for (final String element : data) {
                String ref = null;
                for (int j = 0 ; j < (locales.length) ; j++) {
                    Locale.setDefault(locales[j]);
                    if (j <= 0) {
                        ref = encoder.encode(element);
                    } else {
                        String cur = null;
                        try {
                            cur = encoder.encode(element);
                        } catch (final Exception e) {
                            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2737,(((java.util.Locale.getDefault().toString()) + ": ") + (e.getMessage())));
                        }
                        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2738,((java.util.Locale.getDefault().toString()) + ": "));
                        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2739,ref);
                        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2740,cur);
                    }
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testLocaleIndependence_literalMutation2625() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation2625");
        final StringEncoder encoder = getStringEncoder();
        final String[] data = new String[]{ "I" , "i" };
        final Locale orig = Locale.getDefault();
        final Locale[] locales = new Locale[]{ Locale.ENGLISH , new Locale("foo") , Locale.getDefault() };
        try {
            for (final String element : data) {
                String ref = null;
                for (int j = 0 ; j < (locales.length) ; j++) {
                    Locale.setDefault(locales[j]);
                    if (j <= 0) {
                        ref = encoder.encode(element);
                    } else {
                        String cur = null;
                        try {
                            cur = encoder.encode(element);
                        } catch (final Exception e) {
                            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2737,(((java.util.Locale.getDefault().toString()) + ": ") + (e.getMessage())));
                        }
                        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2738,((java.util.Locale.getDefault().toString()) + ": "));
                        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2739,ref);
                        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2740,cur);
                    }
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testLocaleIndependence_literalMutation2627() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation2627");
        final StringEncoder encoder = getStringEncoder();
        final String[] data = new String[]{ "I" , "i" };
        final Locale orig = Locale.getDefault();
        final Locale[] locales = new Locale[]{ Locale.ENGLISH , new Locale("tr") , Locale.getDefault() };
        try {
            for (final String element : data) {
                String ref = null;
                for (int j = -1 ; j < (locales.length) ; j++) {
                    Locale.setDefault(locales[j]);
                    if (j <= 0) {
                        ref = encoder.encode(element);
                    } else {
                        String cur = null;
                        try {
                            cur = encoder.encode(element);
                        } catch (final Exception e) {
                            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2737,(((java.util.Locale.getDefault().toString()) + ": ") + (e.getMessage())));
                        }
                        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2738,((java.util.Locale.getDefault().toString()) + ": "));
                        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2739,ref);
                        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2740,cur);
                    }
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testLocaleIndependence_literalMutation2628() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation2628");
        final StringEncoder encoder = getStringEncoder();
        final String[] data = new String[]{ "I" , "i" };
        final Locale orig = Locale.getDefault();
        final Locale[] locales = new Locale[]{ Locale.ENGLISH , new Locale("tr") , Locale.getDefault() };
        try {
            for (final String element : data) {
                String ref = null;
                for (int j = 0 ; j < (locales.length) ; j++) {
                    Locale.setDefault(locales[j]);
                    if (j <= 1) {
                        ref = encoder.encode(element);
                    } else {
                        String cur = null;
                        try {
                            cur = encoder.encode(element);
                        } catch (final Exception e) {
                            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2737,(((java.util.Locale.getDefault().toString()) + ": ") + (e.getMessage())));
                        }
                        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2738,((java.util.Locale.getDefault().toString()) + ": "));
                        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2739,ref);
                        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2740,cur);
                    }
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


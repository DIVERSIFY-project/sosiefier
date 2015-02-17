package org.apache.commons.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import org.apache.commons.io.testtools.FileBasedTestCase;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.junit.Test;

/** 
 * This is used to test IOCase for correctness.
 * 
 * @version $Id$
 */
public class IOCaseTestCase extends FileBasedTestCase {
    private static final boolean WINDOWS = (File.separatorChar) == '\\';

    public IOCaseTestCase(String name) {
        super(name);
    }

    @Override
    protected void setUp() throws Exception {
    }

    @Override
    protected void tearDown() throws Exception {
    }

    @Test(timeout = 1000)
    public void test_forName_add1771() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_forName_add1771");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5302,org.apache.commons.io.IOCase.SENSITIVE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5304,null,5303,org.apache.commons.io.IOCase.forName("Sensitive"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5305,org.apache.commons.io.IOCase.INSENSITIVE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5307,null,5306,org.apache.commons.io.IOCase.forName("Insensitive"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5308,org.apache.commons.io.IOCase.SYSTEM);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5310,null,5309,org.apache.commons.io.IOCase.forName("System"));
        try {
            IOCase.forName("Blah");
            IOCase.forName("Blah");
        } catch (IllegalArgumentException ex) {
        }
        try {
            IOCase.forName(null);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void test_forName_add1772() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_forName_add1772");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5302,org.apache.commons.io.IOCase.SENSITIVE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5304,null,5303,org.apache.commons.io.IOCase.forName("Sensitive"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5305,org.apache.commons.io.IOCase.INSENSITIVE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5307,null,5306,org.apache.commons.io.IOCase.forName("Insensitive"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5308,org.apache.commons.io.IOCase.SYSTEM);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5310,null,5309,org.apache.commons.io.IOCase.forName("System"));
        try {
            IOCase.forName("Blah");
        } catch (IllegalArgumentException ex) {
        }
        try {
            IOCase.forName(null);
            IOCase.forName(null);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_forName() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_forName");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5302,org.apache.commons.io.IOCase.SENSITIVE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5304,null,5303,org.apache.commons.io.IOCase.forName("Sensitive"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5305,org.apache.commons.io.IOCase.INSENSITIVE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5307,null,5306,org.apache.commons.io.IOCase.forName("Insensitive"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5308,org.apache.commons.io.IOCase.SYSTEM);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5310,null,5309,org.apache.commons.io.IOCase.forName("System"));
        try {
            IOCase.forName("bar");
        } catch (IllegalArgumentException ex) {
        }
        try {
            IOCase.forName(null);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_serialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_serialization");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5324,org.apache.commons.io.IOCase.SENSITIVE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5326,null,5325,serialize(org.apache.commons.io.IOCase.SENSITIVE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5327,org.apache.commons.io.IOCase.INSENSITIVE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5329,null,5328,serialize(org.apache.commons.io.IOCase.INSENSITIVE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5330,org.apache.commons.io.IOCase.SYSTEM);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5332,null,5331,serialize(org.apache.commons.io.IOCase.SYSTEM));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_getName() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_getName");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5312,org.apache.commons.io.IOCase.SENSITIVE,5311,org.apache.commons.io.IOCase.SENSITIVE.getName());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5314,org.apache.commons.io.IOCase.INSENSITIVE,5313,org.apache.commons.io.IOCase.INSENSITIVE.getName());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5316,org.apache.commons.io.IOCase.SYSTEM,5315,org.apache.commons.io.IOCase.SYSTEM.getName());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_toString() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_toString");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5334,org.apache.commons.io.IOCase.SENSITIVE,5333,org.apache.commons.io.IOCase.SENSITIVE.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5336,org.apache.commons.io.IOCase.INSENSITIVE,5335,org.apache.commons.io.IOCase.INSENSITIVE.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5338,org.apache.commons.io.IOCase.SYSTEM,5337,org.apache.commons.io.IOCase.SYSTEM.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_isCaseSensitive() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_isCaseSensitive");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5318,org.apache.commons.io.IOCase.SENSITIVE,5317,org.apache.commons.io.IOCase.SENSITIVE.isCaseSensitive());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5320,org.apache.commons.io.IOCase.INSENSITIVE,5319,org.apache.commons.io.IOCase.INSENSITIVE.isCaseSensitive());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5321,!(org.apache.commons.io.IOCaseTestCase.WINDOWS));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5323,org.apache.commons.io.IOCase.SYSTEM,5322,org.apache.commons.io.IOCase.SYSTEM.isCaseSensitive());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void test_checkCompare_functionality_add1750() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkCompare_functionality_add1750");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5076,((org.apache.commons.io.IOCase.SENSITIVE.checkCompareTo("ABC", "")) > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5077,((org.apache.commons.io.IOCase.SENSITIVE.checkCompareTo("", "ABC")) < 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5078,((org.apache.commons.io.IOCase.SENSITIVE.checkCompareTo("ABC", "DEF")) < 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5079,((org.apache.commons.io.IOCase.SENSITIVE.checkCompareTo("DEF", "ABC")) > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5081,org.apache.commons.io.IOCase.SENSITIVE,5080,org.apache.commons.io.IOCase.SENSITIVE.checkCompareTo("ABC", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5083,org.apache.commons.io.IOCase.SENSITIVE,5082,org.apache.commons.io.IOCase.SENSITIVE.checkCompareTo("", ""));
        try {
            IOCase.SENSITIVE.checkCompareTo("ABC", null);
            IOCase.SENSITIVE.checkCompareTo("ABC", null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkCompareTo(null, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkCompareTo(null, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void test_checkCompare_functionality_add1751() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkCompare_functionality_add1751");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5076,((org.apache.commons.io.IOCase.SENSITIVE.checkCompareTo("ABC", "")) > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5077,((org.apache.commons.io.IOCase.SENSITIVE.checkCompareTo("", "ABC")) < 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5078,((org.apache.commons.io.IOCase.SENSITIVE.checkCompareTo("ABC", "DEF")) < 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5079,((org.apache.commons.io.IOCase.SENSITIVE.checkCompareTo("DEF", "ABC")) > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5081,org.apache.commons.io.IOCase.SENSITIVE,5080,org.apache.commons.io.IOCase.SENSITIVE.checkCompareTo("ABC", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5083,org.apache.commons.io.IOCase.SENSITIVE,5082,org.apache.commons.io.IOCase.SENSITIVE.checkCompareTo("", ""));
        try {
            IOCase.SENSITIVE.checkCompareTo("ABC", null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkCompareTo(null, "ABC");
            IOCase.SENSITIVE.checkCompareTo(null, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkCompareTo(null, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void test_checkCompare_functionality_add1752() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkCompare_functionality_add1752");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5076,((org.apache.commons.io.IOCase.SENSITIVE.checkCompareTo("ABC", "")) > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5077,((org.apache.commons.io.IOCase.SENSITIVE.checkCompareTo("", "ABC")) < 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5078,((org.apache.commons.io.IOCase.SENSITIVE.checkCompareTo("ABC", "DEF")) < 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5079,((org.apache.commons.io.IOCase.SENSITIVE.checkCompareTo("DEF", "ABC")) > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5081,org.apache.commons.io.IOCase.SENSITIVE,5080,org.apache.commons.io.IOCase.SENSITIVE.checkCompareTo("ABC", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5083,org.apache.commons.io.IOCase.SENSITIVE,5082,org.apache.commons.io.IOCase.SENSITIVE.checkCompareTo("", ""));
        try {
            IOCase.SENSITIVE.checkCompareTo("ABC", null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkCompareTo(null, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkCompareTo(null, null);
            IOCase.SENSITIVE.checkCompareTo(null, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkCompare_functionality() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkCompare_functionality");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5076,((org.apache.commons.io.IOCase.SENSITIVE.checkCompareTo("ABC", "")) > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5077,((org.apache.commons.io.IOCase.SENSITIVE.checkCompareTo("", "ABC")) < 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5078,((org.apache.commons.io.IOCase.SENSITIVE.checkCompareTo("ABC", "DEF")) < 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5079,((org.apache.commons.io.IOCase.SENSITIVE.checkCompareTo("DEF", "ABC")) > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5081,org.apache.commons.io.IOCase.SENSITIVE,5080,org.apache.commons.io.IOCase.SENSITIVE.checkCompareTo("ABC", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5083,org.apache.commons.io.IOCase.SENSITIVE,5082,org.apache.commons.io.IOCase.SENSITIVE.checkCompareTo("", ""));
        try {
            IOCase.SENSITIVE.checkCompareTo("bar", null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkCompareTo(null, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkCompareTo(null, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkCompare_functionality_literalMutation6175() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkCompare_functionality_literalMutation6175");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5076,((org.apache.commons.io.IOCase.SENSITIVE.checkCompareTo("ABC", "")) > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5077,((org.apache.commons.io.IOCase.SENSITIVE.checkCompareTo("", "ABC")) < 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5078,((org.apache.commons.io.IOCase.SENSITIVE.checkCompareTo("ABC", "DEF")) < 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5079,((org.apache.commons.io.IOCase.SENSITIVE.checkCompareTo("DEF", "ABC")) > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5081,org.apache.commons.io.IOCase.SENSITIVE,5080,org.apache.commons.io.IOCase.SENSITIVE.checkCompareTo("ABC", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5083,org.apache.commons.io.IOCase.SENSITIVE,5082,org.apache.commons.io.IOCase.SENSITIVE.checkCompareTo("", ""));
        try {
            IOCase.SENSITIVE.checkCompareTo("ABC", null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkCompareTo(null, "bar");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkCompareTo(null, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkCompare_case() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkCompare_case");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5061,org.apache.commons.io.IOCase.SENSITIVE,5060,org.apache.commons.io.IOCase.SENSITIVE.checkCompareTo("ABC", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5062,((org.apache.commons.io.IOCase.SENSITIVE.checkCompareTo("ABC", "abc")) < 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5063,((org.apache.commons.io.IOCase.SENSITIVE.checkCompareTo("abc", "ABC")) > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5065,org.apache.commons.io.IOCase.INSENSITIVE,5064,org.apache.commons.io.IOCase.INSENSITIVE.checkCompareTo("ABC", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5067,org.apache.commons.io.IOCase.INSENSITIVE,5066,org.apache.commons.io.IOCase.INSENSITIVE.checkCompareTo("ABC", "abc"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5069,org.apache.commons.io.IOCase.INSENSITIVE,5068,org.apache.commons.io.IOCase.INSENSITIVE.checkCompareTo("abc", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5071,org.apache.commons.io.IOCase.SYSTEM,5070,org.apache.commons.io.IOCase.SYSTEM.checkCompareTo("ABC", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5072,org.apache.commons.io.IOCaseTestCase.WINDOWS);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5073,((org.apache.commons.io.IOCase.SYSTEM.checkCompareTo("ABC", "abc")) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5074,org.apache.commons.io.IOCaseTestCase.WINDOWS);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5075,((org.apache.commons.io.IOCase.SYSTEM.checkCompareTo("abc", "ABC")) == 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void test_checkEquals_functionality_add1756() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkEquals_functionality_add1756");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5129,org.apache.commons.io.IOCase.SENSITIVE,5128,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("ABC", ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5131,org.apache.commons.io.IOCase.SENSITIVE,5130,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("ABC", "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5133,org.apache.commons.io.IOCase.SENSITIVE,5132,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("ABC", "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5135,org.apache.commons.io.IOCase.SENSITIVE,5134,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("ABC", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5137,org.apache.commons.io.IOCase.SENSITIVE,5136,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("ABC", "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5139,org.apache.commons.io.IOCase.SENSITIVE,5138,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("ABC", "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5141,org.apache.commons.io.IOCase.SENSITIVE,5140,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("ABC", "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5143,org.apache.commons.io.IOCase.SENSITIVE,5142,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5145,org.apache.commons.io.IOCase.SENSITIVE,5144,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("", ""));
        try {
            IOCase.SENSITIVE.checkEquals("ABC", null);
            IOCase.SENSITIVE.checkEquals("ABC", null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkEquals(null, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkEquals(null, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void test_checkEquals_functionality_add1757() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkEquals_functionality_add1757");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5129,org.apache.commons.io.IOCase.SENSITIVE,5128,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("ABC", ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5131,org.apache.commons.io.IOCase.SENSITIVE,5130,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("ABC", "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5133,org.apache.commons.io.IOCase.SENSITIVE,5132,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("ABC", "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5135,org.apache.commons.io.IOCase.SENSITIVE,5134,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("ABC", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5137,org.apache.commons.io.IOCase.SENSITIVE,5136,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("ABC", "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5139,org.apache.commons.io.IOCase.SENSITIVE,5138,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("ABC", "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5141,org.apache.commons.io.IOCase.SENSITIVE,5140,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("ABC", "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5143,org.apache.commons.io.IOCase.SENSITIVE,5142,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5145,org.apache.commons.io.IOCase.SENSITIVE,5144,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("", ""));
        try {
            IOCase.SENSITIVE.checkEquals("ABC", null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkEquals(null, "ABC");
            IOCase.SENSITIVE.checkEquals(null, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkEquals(null, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void test_checkEquals_functionality_add1758() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkEquals_functionality_add1758");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5129,org.apache.commons.io.IOCase.SENSITIVE,5128,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("ABC", ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5131,org.apache.commons.io.IOCase.SENSITIVE,5130,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("ABC", "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5133,org.apache.commons.io.IOCase.SENSITIVE,5132,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("ABC", "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5135,org.apache.commons.io.IOCase.SENSITIVE,5134,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("ABC", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5137,org.apache.commons.io.IOCase.SENSITIVE,5136,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("ABC", "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5139,org.apache.commons.io.IOCase.SENSITIVE,5138,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("ABC", "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5141,org.apache.commons.io.IOCase.SENSITIVE,5140,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("ABC", "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5143,org.apache.commons.io.IOCase.SENSITIVE,5142,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5145,org.apache.commons.io.IOCase.SENSITIVE,5144,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("", ""));
        try {
            IOCase.SENSITIVE.checkEquals("ABC", null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkEquals(null, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkEquals(null, null);
            IOCase.SENSITIVE.checkEquals(null, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkEquals_functionality() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkEquals_functionality");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5129,org.apache.commons.io.IOCase.SENSITIVE,5128,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("ABC", ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5131,org.apache.commons.io.IOCase.SENSITIVE,5130,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("ABC", "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5133,org.apache.commons.io.IOCase.SENSITIVE,5132,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("ABC", "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5135,org.apache.commons.io.IOCase.SENSITIVE,5134,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("ABC", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5137,org.apache.commons.io.IOCase.SENSITIVE,5136,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("ABC", "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5139,org.apache.commons.io.IOCase.SENSITIVE,5138,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("ABC", "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5141,org.apache.commons.io.IOCase.SENSITIVE,5140,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("ABC", "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5143,org.apache.commons.io.IOCase.SENSITIVE,5142,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5145,org.apache.commons.io.IOCase.SENSITIVE,5144,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("", ""));
        try {
            IOCase.SENSITIVE.checkEquals("bar", null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkEquals(null, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkEquals(null, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkEquals_functionality_literalMutation6187() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkEquals_functionality_literalMutation6187");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5129,org.apache.commons.io.IOCase.SENSITIVE,5128,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("ABC", ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5131,org.apache.commons.io.IOCase.SENSITIVE,5130,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("ABC", "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5133,org.apache.commons.io.IOCase.SENSITIVE,5132,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("ABC", "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5135,org.apache.commons.io.IOCase.SENSITIVE,5134,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("ABC", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5137,org.apache.commons.io.IOCase.SENSITIVE,5136,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("ABC", "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5139,org.apache.commons.io.IOCase.SENSITIVE,5138,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("ABC", "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5141,org.apache.commons.io.IOCase.SENSITIVE,5140,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("ABC", "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5143,org.apache.commons.io.IOCase.SENSITIVE,5142,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5145,org.apache.commons.io.IOCase.SENSITIVE,5144,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("", ""));
        try {
            IOCase.SENSITIVE.checkEquals("ABC", null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkEquals(null, "bar");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkEquals(null, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkEquals_case() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkEquals_case");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5116,org.apache.commons.io.IOCase.SENSITIVE,5115,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("ABC", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5118,org.apache.commons.io.IOCase.SENSITIVE,5117,org.apache.commons.io.IOCase.SENSITIVE.checkEquals("ABC", "Abc"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5120,org.apache.commons.io.IOCase.INSENSITIVE,5119,org.apache.commons.io.IOCase.INSENSITIVE.checkEquals("ABC", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5122,org.apache.commons.io.IOCase.INSENSITIVE,5121,org.apache.commons.io.IOCase.INSENSITIVE.checkEquals("ABC", "Abc"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5124,org.apache.commons.io.IOCase.SYSTEM,5123,org.apache.commons.io.IOCase.SYSTEM.checkEquals("ABC", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5125,org.apache.commons.io.IOCaseTestCase.WINDOWS);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5127,org.apache.commons.io.IOCase.SYSTEM,5126,org.apache.commons.io.IOCase.SYSTEM.checkEquals("ABC", "Abc"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void test_checkStartsWith_functionality_add1768() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkStartsWith_functionality_add1768");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5285,org.apache.commons.io.IOCase.SENSITIVE,5284,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("ABC", ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5287,org.apache.commons.io.IOCase.SENSITIVE,5286,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("ABC", "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5289,org.apache.commons.io.IOCase.SENSITIVE,5288,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("ABC", "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5291,org.apache.commons.io.IOCase.SENSITIVE,5290,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("ABC", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5293,org.apache.commons.io.IOCase.SENSITIVE,5292,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("ABC", "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5295,org.apache.commons.io.IOCase.SENSITIVE,5294,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("ABC", "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5297,org.apache.commons.io.IOCase.SENSITIVE,5296,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("ABC", "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5299,org.apache.commons.io.IOCase.SENSITIVE,5298,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5301,org.apache.commons.io.IOCase.SENSITIVE,5300,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("", ""));
        try {
            IOCase.SENSITIVE.checkStartsWith("ABC", null);
            IOCase.SENSITIVE.checkStartsWith("ABC", null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkStartsWith(null, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkStartsWith(null, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void test_checkStartsWith_functionality_add1769() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkStartsWith_functionality_add1769");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5285,org.apache.commons.io.IOCase.SENSITIVE,5284,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("ABC", ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5287,org.apache.commons.io.IOCase.SENSITIVE,5286,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("ABC", "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5289,org.apache.commons.io.IOCase.SENSITIVE,5288,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("ABC", "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5291,org.apache.commons.io.IOCase.SENSITIVE,5290,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("ABC", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5293,org.apache.commons.io.IOCase.SENSITIVE,5292,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("ABC", "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5295,org.apache.commons.io.IOCase.SENSITIVE,5294,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("ABC", "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5297,org.apache.commons.io.IOCase.SENSITIVE,5296,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("ABC", "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5299,org.apache.commons.io.IOCase.SENSITIVE,5298,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5301,org.apache.commons.io.IOCase.SENSITIVE,5300,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("", ""));
        try {
            IOCase.SENSITIVE.checkStartsWith("ABC", null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkStartsWith(null, "ABC");
            IOCase.SENSITIVE.checkStartsWith(null, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkStartsWith(null, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void test_checkStartsWith_functionality_add1770() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkStartsWith_functionality_add1770");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5285,org.apache.commons.io.IOCase.SENSITIVE,5284,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("ABC", ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5287,org.apache.commons.io.IOCase.SENSITIVE,5286,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("ABC", "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5289,org.apache.commons.io.IOCase.SENSITIVE,5288,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("ABC", "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5291,org.apache.commons.io.IOCase.SENSITIVE,5290,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("ABC", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5293,org.apache.commons.io.IOCase.SENSITIVE,5292,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("ABC", "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5295,org.apache.commons.io.IOCase.SENSITIVE,5294,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("ABC", "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5297,org.apache.commons.io.IOCase.SENSITIVE,5296,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("ABC", "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5299,org.apache.commons.io.IOCase.SENSITIVE,5298,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5301,org.apache.commons.io.IOCase.SENSITIVE,5300,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("", ""));
        try {
            IOCase.SENSITIVE.checkStartsWith("ABC", null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkStartsWith(null, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkStartsWith(null, null);
            IOCase.SENSITIVE.checkStartsWith(null, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkStartsWith_functionality() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkStartsWith_functionality");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5285,org.apache.commons.io.IOCase.SENSITIVE,5284,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("ABC", ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5287,org.apache.commons.io.IOCase.SENSITIVE,5286,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("ABC", "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5289,org.apache.commons.io.IOCase.SENSITIVE,5288,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("ABC", "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5291,org.apache.commons.io.IOCase.SENSITIVE,5290,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("ABC", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5293,org.apache.commons.io.IOCase.SENSITIVE,5292,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("ABC", "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5295,org.apache.commons.io.IOCase.SENSITIVE,5294,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("ABC", "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5297,org.apache.commons.io.IOCase.SENSITIVE,5296,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("ABC", "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5299,org.apache.commons.io.IOCase.SENSITIVE,5298,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5301,org.apache.commons.io.IOCase.SENSITIVE,5300,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("", ""));
        try {
            IOCase.SENSITIVE.checkStartsWith("bar", null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkStartsWith(null, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkStartsWith(null, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkStartsWith_functionality_literalMutation6238() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkStartsWith_functionality_literalMutation6238");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5285,org.apache.commons.io.IOCase.SENSITIVE,5284,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("ABC", ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5287,org.apache.commons.io.IOCase.SENSITIVE,5286,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("ABC", "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5289,org.apache.commons.io.IOCase.SENSITIVE,5288,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("ABC", "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5291,org.apache.commons.io.IOCase.SENSITIVE,5290,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("ABC", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5293,org.apache.commons.io.IOCase.SENSITIVE,5292,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("ABC", "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5295,org.apache.commons.io.IOCase.SENSITIVE,5294,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("ABC", "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5297,org.apache.commons.io.IOCase.SENSITIVE,5296,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("ABC", "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5299,org.apache.commons.io.IOCase.SENSITIVE,5298,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5301,org.apache.commons.io.IOCase.SENSITIVE,5300,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("", ""));
        try {
            IOCase.SENSITIVE.checkStartsWith("ABC", null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkStartsWith(null, "bar");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkStartsWith(null, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkStartsWith_case() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkStartsWith_case");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5272,org.apache.commons.io.IOCase.SENSITIVE,5271,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("ABC", "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5274,org.apache.commons.io.IOCase.SENSITIVE,5273,org.apache.commons.io.IOCase.SENSITIVE.checkStartsWith("ABC", "Ab"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5276,org.apache.commons.io.IOCase.INSENSITIVE,5275,org.apache.commons.io.IOCase.INSENSITIVE.checkStartsWith("ABC", "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5278,org.apache.commons.io.IOCase.INSENSITIVE,5277,org.apache.commons.io.IOCase.INSENSITIVE.checkStartsWith("ABC", "Ab"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5280,org.apache.commons.io.IOCase.SYSTEM,5279,org.apache.commons.io.IOCase.SYSTEM.checkStartsWith("ABC", "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5281,org.apache.commons.io.IOCaseTestCase.WINDOWS);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5283,org.apache.commons.io.IOCase.SYSTEM,5282,org.apache.commons.io.IOCase.SYSTEM.checkStartsWith("ABC", "Ab"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void test_checkEndsWith_functionality_add1753() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkEndsWith_functionality_add1753");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5098,org.apache.commons.io.IOCase.SENSITIVE,5097,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("ABC", ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5100,org.apache.commons.io.IOCase.SENSITIVE,5099,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("ABC", "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5102,org.apache.commons.io.IOCase.SENSITIVE,5101,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("ABC", "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5104,org.apache.commons.io.IOCase.SENSITIVE,5103,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("ABC", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5106,org.apache.commons.io.IOCase.SENSITIVE,5105,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("ABC", "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5108,org.apache.commons.io.IOCase.SENSITIVE,5107,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("ABC", "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5110,org.apache.commons.io.IOCase.SENSITIVE,5109,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("ABC", "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5112,org.apache.commons.io.IOCase.SENSITIVE,5111,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5114,org.apache.commons.io.IOCase.SENSITIVE,5113,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("", ""));
        try {
            IOCase.SENSITIVE.checkEndsWith("ABC", null);
            IOCase.SENSITIVE.checkEndsWith("ABC", null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkEndsWith(null, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkEndsWith(null, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void test_checkEndsWith_functionality_add1754() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkEndsWith_functionality_add1754");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5098,org.apache.commons.io.IOCase.SENSITIVE,5097,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("ABC", ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5100,org.apache.commons.io.IOCase.SENSITIVE,5099,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("ABC", "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5102,org.apache.commons.io.IOCase.SENSITIVE,5101,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("ABC", "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5104,org.apache.commons.io.IOCase.SENSITIVE,5103,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("ABC", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5106,org.apache.commons.io.IOCase.SENSITIVE,5105,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("ABC", "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5108,org.apache.commons.io.IOCase.SENSITIVE,5107,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("ABC", "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5110,org.apache.commons.io.IOCase.SENSITIVE,5109,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("ABC", "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5112,org.apache.commons.io.IOCase.SENSITIVE,5111,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5114,org.apache.commons.io.IOCase.SENSITIVE,5113,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("", ""));
        try {
            IOCase.SENSITIVE.checkEndsWith("ABC", null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkEndsWith(null, "ABC");
            IOCase.SENSITIVE.checkEndsWith(null, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkEndsWith(null, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void test_checkEndsWith_functionality_add1755() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkEndsWith_functionality_add1755");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5098,org.apache.commons.io.IOCase.SENSITIVE,5097,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("ABC", ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5100,org.apache.commons.io.IOCase.SENSITIVE,5099,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("ABC", "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5102,org.apache.commons.io.IOCase.SENSITIVE,5101,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("ABC", "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5104,org.apache.commons.io.IOCase.SENSITIVE,5103,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("ABC", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5106,org.apache.commons.io.IOCase.SENSITIVE,5105,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("ABC", "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5108,org.apache.commons.io.IOCase.SENSITIVE,5107,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("ABC", "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5110,org.apache.commons.io.IOCase.SENSITIVE,5109,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("ABC", "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5112,org.apache.commons.io.IOCase.SENSITIVE,5111,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5114,org.apache.commons.io.IOCase.SENSITIVE,5113,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("", ""));
        try {
            IOCase.SENSITIVE.checkEndsWith("ABC", null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkEndsWith(null, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkEndsWith(null, null);
            IOCase.SENSITIVE.checkEndsWith(null, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkEndsWith_functionality() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkEndsWith_functionality");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5098,org.apache.commons.io.IOCase.SENSITIVE,5097,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("ABC", ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5100,org.apache.commons.io.IOCase.SENSITIVE,5099,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("ABC", "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5102,org.apache.commons.io.IOCase.SENSITIVE,5101,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("ABC", "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5104,org.apache.commons.io.IOCase.SENSITIVE,5103,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("ABC", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5106,org.apache.commons.io.IOCase.SENSITIVE,5105,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("ABC", "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5108,org.apache.commons.io.IOCase.SENSITIVE,5107,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("ABC", "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5110,org.apache.commons.io.IOCase.SENSITIVE,5109,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("ABC", "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5112,org.apache.commons.io.IOCase.SENSITIVE,5111,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5114,org.apache.commons.io.IOCase.SENSITIVE,5113,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("", ""));
        try {
            IOCase.SENSITIVE.checkEndsWith("bar", null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkEndsWith(null, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkEndsWith(null, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkEndsWith_functionality_literalMutation6181() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkEndsWith_functionality_literalMutation6181");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5098,org.apache.commons.io.IOCase.SENSITIVE,5097,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("ABC", ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5100,org.apache.commons.io.IOCase.SENSITIVE,5099,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("ABC", "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5102,org.apache.commons.io.IOCase.SENSITIVE,5101,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("ABC", "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5104,org.apache.commons.io.IOCase.SENSITIVE,5103,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("ABC", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5106,org.apache.commons.io.IOCase.SENSITIVE,5105,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("ABC", "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5108,org.apache.commons.io.IOCase.SENSITIVE,5107,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("ABC", "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5110,org.apache.commons.io.IOCase.SENSITIVE,5109,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("ABC", "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5112,org.apache.commons.io.IOCase.SENSITIVE,5111,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("", "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5114,org.apache.commons.io.IOCase.SENSITIVE,5113,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("", ""));
        try {
            IOCase.SENSITIVE.checkEndsWith("ABC", null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkEndsWith(null, "bar");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkEndsWith(null, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkEndsWith_case() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkEndsWith_case");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5085,org.apache.commons.io.IOCase.SENSITIVE,5084,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("ABC", "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5087,org.apache.commons.io.IOCase.SENSITIVE,5086,org.apache.commons.io.IOCase.SENSITIVE.checkEndsWith("ABC", "Bc"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5089,org.apache.commons.io.IOCase.INSENSITIVE,5088,org.apache.commons.io.IOCase.INSENSITIVE.checkEndsWith("ABC", "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5091,org.apache.commons.io.IOCase.INSENSITIVE,5090,org.apache.commons.io.IOCase.INSENSITIVE.checkEndsWith("ABC", "Bc"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5093,org.apache.commons.io.IOCase.SYSTEM,5092,org.apache.commons.io.IOCase.SYSTEM.checkEndsWith("ABC", "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5094,org.apache.commons.io.IOCaseTestCase.WINDOWS);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5096,org.apache.commons.io.IOCase.SYSTEM,5095,org.apache.commons.io.IOCase.SYSTEM.checkEndsWith("ABC", "Bc"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void test_checkIndexOf_functionality_add1759() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkIndexOf_functionality_add1759");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5161,org.apache.commons.io.IOCase.SENSITIVE,5160,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5162,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5164,org.apache.commons.io.IOCase.SENSITIVE,5163,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5166,org.apache.commons.io.IOCase.SENSITIVE,5165,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5167,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5169,org.apache.commons.io.IOCase.SENSITIVE,5168,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5171,org.apache.commons.io.IOCase.SENSITIVE,5170,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5172,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5174,org.apache.commons.io.IOCase.SENSITIVE,5173,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5176,org.apache.commons.io.IOCase.SENSITIVE,5175,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5178,org.apache.commons.io.IOCase.SENSITIVE,5177,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5179,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5181,org.apache.commons.io.IOCase.SENSITIVE,5180,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5183,org.apache.commons.io.IOCase.SENSITIVE,5182,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5185,org.apache.commons.io.IOCase.SENSITIVE,5184,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5186,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5188,org.apache.commons.io.IOCase.SENSITIVE,5187,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5190,org.apache.commons.io.IOCase.SENSITIVE,5189,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5192,org.apache.commons.io.IOCase.SENSITIVE,5191,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5193,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5195,org.apache.commons.io.IOCase.SENSITIVE,5194,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5197,org.apache.commons.io.IOCase.SENSITIVE,5196,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5199,org.apache.commons.io.IOCase.SENSITIVE,5198,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5201,org.apache.commons.io.IOCase.SENSITIVE,5200,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 9, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5203,org.apache.commons.io.IOCase.SENSITIVE,5202,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5205,org.apache.commons.io.IOCase.SENSITIVE,5204,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5206,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5208,org.apache.commons.io.IOCase.SENSITIVE,5207,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 9, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5210,org.apache.commons.io.IOCase.SENSITIVE,5209,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 6, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5212,org.apache.commons.io.IOCase.SENSITIVE,5211,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 7, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5213,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5215,org.apache.commons.io.IOCase.SENSITIVE,5214,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5216,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5218,org.apache.commons.io.IOCase.SENSITIVE,5217,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5219,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5221,org.apache.commons.io.IOCase.SENSITIVE,5220,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("DEF", 0, "ABCDEFGHIJ"));
        try {
            IOCase.SENSITIVE.checkIndexOf("ABC", 0, null);
            IOCase.SENSITIVE.checkIndexOf("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkIndexOf(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkIndexOf(null, 0, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void test_checkIndexOf_functionality_add1760() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkIndexOf_functionality_add1760");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5161,org.apache.commons.io.IOCase.SENSITIVE,5160,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5162,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5164,org.apache.commons.io.IOCase.SENSITIVE,5163,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5166,org.apache.commons.io.IOCase.SENSITIVE,5165,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5167,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5169,org.apache.commons.io.IOCase.SENSITIVE,5168,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5171,org.apache.commons.io.IOCase.SENSITIVE,5170,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5172,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5174,org.apache.commons.io.IOCase.SENSITIVE,5173,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5176,org.apache.commons.io.IOCase.SENSITIVE,5175,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5178,org.apache.commons.io.IOCase.SENSITIVE,5177,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5179,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5181,org.apache.commons.io.IOCase.SENSITIVE,5180,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5183,org.apache.commons.io.IOCase.SENSITIVE,5182,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5185,org.apache.commons.io.IOCase.SENSITIVE,5184,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5186,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5188,org.apache.commons.io.IOCase.SENSITIVE,5187,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5190,org.apache.commons.io.IOCase.SENSITIVE,5189,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5192,org.apache.commons.io.IOCase.SENSITIVE,5191,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5193,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5195,org.apache.commons.io.IOCase.SENSITIVE,5194,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5197,org.apache.commons.io.IOCase.SENSITIVE,5196,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5199,org.apache.commons.io.IOCase.SENSITIVE,5198,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5201,org.apache.commons.io.IOCase.SENSITIVE,5200,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 9, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5203,org.apache.commons.io.IOCase.SENSITIVE,5202,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5205,org.apache.commons.io.IOCase.SENSITIVE,5204,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5206,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5208,org.apache.commons.io.IOCase.SENSITIVE,5207,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 9, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5210,org.apache.commons.io.IOCase.SENSITIVE,5209,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 6, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5212,org.apache.commons.io.IOCase.SENSITIVE,5211,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 7, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5213,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5215,org.apache.commons.io.IOCase.SENSITIVE,5214,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5216,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5218,org.apache.commons.io.IOCase.SENSITIVE,5217,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5219,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5221,org.apache.commons.io.IOCase.SENSITIVE,5220,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("DEF", 0, "ABCDEFGHIJ"));
        try {
            IOCase.SENSITIVE.checkIndexOf("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkIndexOf(null, 0, "ABC");
            IOCase.SENSITIVE.checkIndexOf(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkIndexOf(null, 0, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void test_checkIndexOf_functionality_add1761() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkIndexOf_functionality_add1761");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5161,org.apache.commons.io.IOCase.SENSITIVE,5160,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5162,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5164,org.apache.commons.io.IOCase.SENSITIVE,5163,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5166,org.apache.commons.io.IOCase.SENSITIVE,5165,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5167,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5169,org.apache.commons.io.IOCase.SENSITIVE,5168,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5171,org.apache.commons.io.IOCase.SENSITIVE,5170,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5172,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5174,org.apache.commons.io.IOCase.SENSITIVE,5173,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5176,org.apache.commons.io.IOCase.SENSITIVE,5175,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5178,org.apache.commons.io.IOCase.SENSITIVE,5177,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5179,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5181,org.apache.commons.io.IOCase.SENSITIVE,5180,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5183,org.apache.commons.io.IOCase.SENSITIVE,5182,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5185,org.apache.commons.io.IOCase.SENSITIVE,5184,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5186,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5188,org.apache.commons.io.IOCase.SENSITIVE,5187,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5190,org.apache.commons.io.IOCase.SENSITIVE,5189,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5192,org.apache.commons.io.IOCase.SENSITIVE,5191,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5193,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5195,org.apache.commons.io.IOCase.SENSITIVE,5194,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5197,org.apache.commons.io.IOCase.SENSITIVE,5196,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5199,org.apache.commons.io.IOCase.SENSITIVE,5198,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5201,org.apache.commons.io.IOCase.SENSITIVE,5200,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 9, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5203,org.apache.commons.io.IOCase.SENSITIVE,5202,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5205,org.apache.commons.io.IOCase.SENSITIVE,5204,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5206,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5208,org.apache.commons.io.IOCase.SENSITIVE,5207,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 9, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5210,org.apache.commons.io.IOCase.SENSITIVE,5209,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 6, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5212,org.apache.commons.io.IOCase.SENSITIVE,5211,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 7, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5213,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5215,org.apache.commons.io.IOCase.SENSITIVE,5214,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5216,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5218,org.apache.commons.io.IOCase.SENSITIVE,5217,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5219,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5221,org.apache.commons.io.IOCase.SENSITIVE,5220,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("DEF", 0, "ABCDEFGHIJ"));
        try {
            IOCase.SENSITIVE.checkIndexOf("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkIndexOf(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkIndexOf(null, 0, null);
            IOCase.SENSITIVE.checkIndexOf(null, 0, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkIndexOf_functionality() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkIndexOf_functionality");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5161,org.apache.commons.io.IOCase.SENSITIVE,5160,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5162,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5164,org.apache.commons.io.IOCase.SENSITIVE,5163,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5166,org.apache.commons.io.IOCase.SENSITIVE,5165,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5167,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5169,org.apache.commons.io.IOCase.SENSITIVE,5168,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5171,org.apache.commons.io.IOCase.SENSITIVE,5170,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5172,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5174,org.apache.commons.io.IOCase.SENSITIVE,5173,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5176,org.apache.commons.io.IOCase.SENSITIVE,5175,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5178,org.apache.commons.io.IOCase.SENSITIVE,5177,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5179,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5181,org.apache.commons.io.IOCase.SENSITIVE,5180,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5183,org.apache.commons.io.IOCase.SENSITIVE,5182,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5185,org.apache.commons.io.IOCase.SENSITIVE,5184,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5186,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5188,org.apache.commons.io.IOCase.SENSITIVE,5187,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5190,org.apache.commons.io.IOCase.SENSITIVE,5189,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5192,org.apache.commons.io.IOCase.SENSITIVE,5191,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5193,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5195,org.apache.commons.io.IOCase.SENSITIVE,5194,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5197,org.apache.commons.io.IOCase.SENSITIVE,5196,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5199,org.apache.commons.io.IOCase.SENSITIVE,5198,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5201,org.apache.commons.io.IOCase.SENSITIVE,5200,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 9, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5203,org.apache.commons.io.IOCase.SENSITIVE,5202,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5205,org.apache.commons.io.IOCase.SENSITIVE,5204,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5206,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5208,org.apache.commons.io.IOCase.SENSITIVE,5207,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 9, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5210,org.apache.commons.io.IOCase.SENSITIVE,5209,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 6, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5212,org.apache.commons.io.IOCase.SENSITIVE,5211,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 7, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5213,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5215,org.apache.commons.io.IOCase.SENSITIVE,5214,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5216,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5218,org.apache.commons.io.IOCase.SENSITIVE,5217,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5219,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5221,org.apache.commons.io.IOCase.SENSITIVE,5220,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("DEF", 0, "ABCDEFGHIJ"));
        try {
            IOCase.SENSITIVE.checkIndexOf("foo", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkIndexOf(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkIndexOf(null, 0, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkIndexOf_functionality_literalMutation6191() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkIndexOf_functionality_literalMutation6191");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5161,org.apache.commons.io.IOCase.SENSITIVE,5160,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5162,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5164,org.apache.commons.io.IOCase.SENSITIVE,5163,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5166,org.apache.commons.io.IOCase.SENSITIVE,5165,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5167,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5169,org.apache.commons.io.IOCase.SENSITIVE,5168,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5171,org.apache.commons.io.IOCase.SENSITIVE,5170,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5172,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5174,org.apache.commons.io.IOCase.SENSITIVE,5173,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5176,org.apache.commons.io.IOCase.SENSITIVE,5175,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5178,org.apache.commons.io.IOCase.SENSITIVE,5177,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5179,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5181,org.apache.commons.io.IOCase.SENSITIVE,5180,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5183,org.apache.commons.io.IOCase.SENSITIVE,5182,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5185,org.apache.commons.io.IOCase.SENSITIVE,5184,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5186,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5188,org.apache.commons.io.IOCase.SENSITIVE,5187,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5190,org.apache.commons.io.IOCase.SENSITIVE,5189,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5192,org.apache.commons.io.IOCase.SENSITIVE,5191,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5193,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5195,org.apache.commons.io.IOCase.SENSITIVE,5194,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5197,org.apache.commons.io.IOCase.SENSITIVE,5196,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5199,org.apache.commons.io.IOCase.SENSITIVE,5198,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5201,org.apache.commons.io.IOCase.SENSITIVE,5200,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 9, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5203,org.apache.commons.io.IOCase.SENSITIVE,5202,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5205,org.apache.commons.io.IOCase.SENSITIVE,5204,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5206,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5208,org.apache.commons.io.IOCase.SENSITIVE,5207,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 9, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5210,org.apache.commons.io.IOCase.SENSITIVE,5209,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 6, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5212,org.apache.commons.io.IOCase.SENSITIVE,5211,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 7, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5213,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5215,org.apache.commons.io.IOCase.SENSITIVE,5214,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5216,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5218,org.apache.commons.io.IOCase.SENSITIVE,5217,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5219,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5221,org.apache.commons.io.IOCase.SENSITIVE,5220,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("DEF", 0, "ABCDEFGHIJ"));
        try {
            IOCase.SENSITIVE.checkIndexOf("ABC", 1, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkIndexOf(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkIndexOf(null, 0, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkIndexOf_functionality_literalMutation6192() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkIndexOf_functionality_literalMutation6192");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5161,org.apache.commons.io.IOCase.SENSITIVE,5160,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5162,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5164,org.apache.commons.io.IOCase.SENSITIVE,5163,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5166,org.apache.commons.io.IOCase.SENSITIVE,5165,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5167,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5169,org.apache.commons.io.IOCase.SENSITIVE,5168,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5171,org.apache.commons.io.IOCase.SENSITIVE,5170,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5172,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5174,org.apache.commons.io.IOCase.SENSITIVE,5173,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5176,org.apache.commons.io.IOCase.SENSITIVE,5175,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5178,org.apache.commons.io.IOCase.SENSITIVE,5177,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5179,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5181,org.apache.commons.io.IOCase.SENSITIVE,5180,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5183,org.apache.commons.io.IOCase.SENSITIVE,5182,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5185,org.apache.commons.io.IOCase.SENSITIVE,5184,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5186,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5188,org.apache.commons.io.IOCase.SENSITIVE,5187,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5190,org.apache.commons.io.IOCase.SENSITIVE,5189,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5192,org.apache.commons.io.IOCase.SENSITIVE,5191,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5193,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5195,org.apache.commons.io.IOCase.SENSITIVE,5194,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5197,org.apache.commons.io.IOCase.SENSITIVE,5196,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5199,org.apache.commons.io.IOCase.SENSITIVE,5198,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5201,org.apache.commons.io.IOCase.SENSITIVE,5200,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 9, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5203,org.apache.commons.io.IOCase.SENSITIVE,5202,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5205,org.apache.commons.io.IOCase.SENSITIVE,5204,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5206,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5208,org.apache.commons.io.IOCase.SENSITIVE,5207,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 9, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5210,org.apache.commons.io.IOCase.SENSITIVE,5209,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 6, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5212,org.apache.commons.io.IOCase.SENSITIVE,5211,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 7, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5213,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5215,org.apache.commons.io.IOCase.SENSITIVE,5214,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5216,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5218,org.apache.commons.io.IOCase.SENSITIVE,5217,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5219,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5221,org.apache.commons.io.IOCase.SENSITIVE,5220,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("DEF", 0, "ABCDEFGHIJ"));
        try {
            IOCase.SENSITIVE.checkIndexOf("ABC", -1, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkIndexOf(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkIndexOf(null, 0, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkIndexOf_functionality_literalMutation6193() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkIndexOf_functionality_literalMutation6193");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5161,org.apache.commons.io.IOCase.SENSITIVE,5160,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5162,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5164,org.apache.commons.io.IOCase.SENSITIVE,5163,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5166,org.apache.commons.io.IOCase.SENSITIVE,5165,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5167,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5169,org.apache.commons.io.IOCase.SENSITIVE,5168,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5171,org.apache.commons.io.IOCase.SENSITIVE,5170,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5172,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5174,org.apache.commons.io.IOCase.SENSITIVE,5173,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5176,org.apache.commons.io.IOCase.SENSITIVE,5175,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5178,org.apache.commons.io.IOCase.SENSITIVE,5177,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5179,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5181,org.apache.commons.io.IOCase.SENSITIVE,5180,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5183,org.apache.commons.io.IOCase.SENSITIVE,5182,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5185,org.apache.commons.io.IOCase.SENSITIVE,5184,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5186,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5188,org.apache.commons.io.IOCase.SENSITIVE,5187,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5190,org.apache.commons.io.IOCase.SENSITIVE,5189,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5192,org.apache.commons.io.IOCase.SENSITIVE,5191,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5193,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5195,org.apache.commons.io.IOCase.SENSITIVE,5194,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5197,org.apache.commons.io.IOCase.SENSITIVE,5196,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5199,org.apache.commons.io.IOCase.SENSITIVE,5198,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5201,org.apache.commons.io.IOCase.SENSITIVE,5200,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 9, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5203,org.apache.commons.io.IOCase.SENSITIVE,5202,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5205,org.apache.commons.io.IOCase.SENSITIVE,5204,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5206,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5208,org.apache.commons.io.IOCase.SENSITIVE,5207,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 9, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5210,org.apache.commons.io.IOCase.SENSITIVE,5209,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 6, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5212,org.apache.commons.io.IOCase.SENSITIVE,5211,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 7, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5213,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5215,org.apache.commons.io.IOCase.SENSITIVE,5214,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5216,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5218,org.apache.commons.io.IOCase.SENSITIVE,5217,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5219,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5221,org.apache.commons.io.IOCase.SENSITIVE,5220,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("DEF", 0, "ABCDEFGHIJ"));
        try {
            IOCase.SENSITIVE.checkIndexOf("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkIndexOf(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkIndexOf(null, 0, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkIndexOf_functionality_literalMutation6196() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkIndexOf_functionality_literalMutation6196");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5161,org.apache.commons.io.IOCase.SENSITIVE,5160,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5162,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5164,org.apache.commons.io.IOCase.SENSITIVE,5163,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5166,org.apache.commons.io.IOCase.SENSITIVE,5165,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5167,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5169,org.apache.commons.io.IOCase.SENSITIVE,5168,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5171,org.apache.commons.io.IOCase.SENSITIVE,5170,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5172,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5174,org.apache.commons.io.IOCase.SENSITIVE,5173,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5176,org.apache.commons.io.IOCase.SENSITIVE,5175,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5178,org.apache.commons.io.IOCase.SENSITIVE,5177,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5179,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5181,org.apache.commons.io.IOCase.SENSITIVE,5180,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5183,org.apache.commons.io.IOCase.SENSITIVE,5182,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5185,org.apache.commons.io.IOCase.SENSITIVE,5184,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5186,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5188,org.apache.commons.io.IOCase.SENSITIVE,5187,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5190,org.apache.commons.io.IOCase.SENSITIVE,5189,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5192,org.apache.commons.io.IOCase.SENSITIVE,5191,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5193,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5195,org.apache.commons.io.IOCase.SENSITIVE,5194,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5197,org.apache.commons.io.IOCase.SENSITIVE,5196,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5199,org.apache.commons.io.IOCase.SENSITIVE,5198,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5201,org.apache.commons.io.IOCase.SENSITIVE,5200,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 9, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5203,org.apache.commons.io.IOCase.SENSITIVE,5202,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5205,org.apache.commons.io.IOCase.SENSITIVE,5204,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5206,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5208,org.apache.commons.io.IOCase.SENSITIVE,5207,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 9, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5210,org.apache.commons.io.IOCase.SENSITIVE,5209,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 6, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5212,org.apache.commons.io.IOCase.SENSITIVE,5211,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 7, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5213,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5215,org.apache.commons.io.IOCase.SENSITIVE,5214,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5216,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5218,org.apache.commons.io.IOCase.SENSITIVE,5217,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5219,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5221,org.apache.commons.io.IOCase.SENSITIVE,5220,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("DEF", 0, "ABCDEFGHIJ"));
        try {
            IOCase.SENSITIVE.checkIndexOf("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkIndexOf(null, 1, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkIndexOf(null, 0, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkIndexOf_functionality_literalMutation6197() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkIndexOf_functionality_literalMutation6197");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5161,org.apache.commons.io.IOCase.SENSITIVE,5160,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5162,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5164,org.apache.commons.io.IOCase.SENSITIVE,5163,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5166,org.apache.commons.io.IOCase.SENSITIVE,5165,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5167,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5169,org.apache.commons.io.IOCase.SENSITIVE,5168,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5171,org.apache.commons.io.IOCase.SENSITIVE,5170,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5172,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5174,org.apache.commons.io.IOCase.SENSITIVE,5173,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5176,org.apache.commons.io.IOCase.SENSITIVE,5175,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5178,org.apache.commons.io.IOCase.SENSITIVE,5177,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5179,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5181,org.apache.commons.io.IOCase.SENSITIVE,5180,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5183,org.apache.commons.io.IOCase.SENSITIVE,5182,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5185,org.apache.commons.io.IOCase.SENSITIVE,5184,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5186,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5188,org.apache.commons.io.IOCase.SENSITIVE,5187,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5190,org.apache.commons.io.IOCase.SENSITIVE,5189,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5192,org.apache.commons.io.IOCase.SENSITIVE,5191,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5193,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5195,org.apache.commons.io.IOCase.SENSITIVE,5194,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5197,org.apache.commons.io.IOCase.SENSITIVE,5196,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5199,org.apache.commons.io.IOCase.SENSITIVE,5198,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5201,org.apache.commons.io.IOCase.SENSITIVE,5200,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 9, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5203,org.apache.commons.io.IOCase.SENSITIVE,5202,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5205,org.apache.commons.io.IOCase.SENSITIVE,5204,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5206,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5208,org.apache.commons.io.IOCase.SENSITIVE,5207,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 9, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5210,org.apache.commons.io.IOCase.SENSITIVE,5209,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 6, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5212,org.apache.commons.io.IOCase.SENSITIVE,5211,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 7, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5213,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5215,org.apache.commons.io.IOCase.SENSITIVE,5214,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5216,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5218,org.apache.commons.io.IOCase.SENSITIVE,5217,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5219,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5221,org.apache.commons.io.IOCase.SENSITIVE,5220,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("DEF", 0, "ABCDEFGHIJ"));
        try {
            IOCase.SENSITIVE.checkIndexOf("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkIndexOf(null, -1, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkIndexOf(null, 0, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkIndexOf_functionality_literalMutation6198() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkIndexOf_functionality_literalMutation6198");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5161,org.apache.commons.io.IOCase.SENSITIVE,5160,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5162,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5164,org.apache.commons.io.IOCase.SENSITIVE,5163,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5166,org.apache.commons.io.IOCase.SENSITIVE,5165,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5167,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5169,org.apache.commons.io.IOCase.SENSITIVE,5168,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5171,org.apache.commons.io.IOCase.SENSITIVE,5170,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5172,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5174,org.apache.commons.io.IOCase.SENSITIVE,5173,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5176,org.apache.commons.io.IOCase.SENSITIVE,5175,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5178,org.apache.commons.io.IOCase.SENSITIVE,5177,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5179,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5181,org.apache.commons.io.IOCase.SENSITIVE,5180,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5183,org.apache.commons.io.IOCase.SENSITIVE,5182,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5185,org.apache.commons.io.IOCase.SENSITIVE,5184,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5186,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5188,org.apache.commons.io.IOCase.SENSITIVE,5187,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5190,org.apache.commons.io.IOCase.SENSITIVE,5189,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5192,org.apache.commons.io.IOCase.SENSITIVE,5191,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5193,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5195,org.apache.commons.io.IOCase.SENSITIVE,5194,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5197,org.apache.commons.io.IOCase.SENSITIVE,5196,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5199,org.apache.commons.io.IOCase.SENSITIVE,5198,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5201,org.apache.commons.io.IOCase.SENSITIVE,5200,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 9, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5203,org.apache.commons.io.IOCase.SENSITIVE,5202,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5205,org.apache.commons.io.IOCase.SENSITIVE,5204,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5206,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5208,org.apache.commons.io.IOCase.SENSITIVE,5207,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 9, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5210,org.apache.commons.io.IOCase.SENSITIVE,5209,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 6, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5212,org.apache.commons.io.IOCase.SENSITIVE,5211,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 7, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5213,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5215,org.apache.commons.io.IOCase.SENSITIVE,5214,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5216,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5218,org.apache.commons.io.IOCase.SENSITIVE,5217,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5219,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5221,org.apache.commons.io.IOCase.SENSITIVE,5220,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("DEF", 0, "ABCDEFGHIJ"));
        try {
            IOCase.SENSITIVE.checkIndexOf("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkIndexOf(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkIndexOf(null, 0, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkIndexOf_functionality_literalMutation6199() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkIndexOf_functionality_literalMutation6199");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5161,org.apache.commons.io.IOCase.SENSITIVE,5160,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5162,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5164,org.apache.commons.io.IOCase.SENSITIVE,5163,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5166,org.apache.commons.io.IOCase.SENSITIVE,5165,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5167,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5169,org.apache.commons.io.IOCase.SENSITIVE,5168,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5171,org.apache.commons.io.IOCase.SENSITIVE,5170,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5172,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5174,org.apache.commons.io.IOCase.SENSITIVE,5173,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5176,org.apache.commons.io.IOCase.SENSITIVE,5175,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5178,org.apache.commons.io.IOCase.SENSITIVE,5177,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5179,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5181,org.apache.commons.io.IOCase.SENSITIVE,5180,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5183,org.apache.commons.io.IOCase.SENSITIVE,5182,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5185,org.apache.commons.io.IOCase.SENSITIVE,5184,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5186,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5188,org.apache.commons.io.IOCase.SENSITIVE,5187,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5190,org.apache.commons.io.IOCase.SENSITIVE,5189,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5192,org.apache.commons.io.IOCase.SENSITIVE,5191,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5193,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5195,org.apache.commons.io.IOCase.SENSITIVE,5194,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5197,org.apache.commons.io.IOCase.SENSITIVE,5196,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5199,org.apache.commons.io.IOCase.SENSITIVE,5198,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5201,org.apache.commons.io.IOCase.SENSITIVE,5200,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 9, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5203,org.apache.commons.io.IOCase.SENSITIVE,5202,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5205,org.apache.commons.io.IOCase.SENSITIVE,5204,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5206,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5208,org.apache.commons.io.IOCase.SENSITIVE,5207,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 9, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5210,org.apache.commons.io.IOCase.SENSITIVE,5209,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 6, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5212,org.apache.commons.io.IOCase.SENSITIVE,5211,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 7, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5213,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5215,org.apache.commons.io.IOCase.SENSITIVE,5214,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5216,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5218,org.apache.commons.io.IOCase.SENSITIVE,5217,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5219,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5221,org.apache.commons.io.IOCase.SENSITIVE,5220,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("DEF", 0, "ABCDEFGHIJ"));
        try {
            IOCase.SENSITIVE.checkIndexOf("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkIndexOf(null, 0, "foo");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkIndexOf(null, 0, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkIndexOf_functionality_literalMutation6201() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkIndexOf_functionality_literalMutation6201");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5161,org.apache.commons.io.IOCase.SENSITIVE,5160,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5162,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5164,org.apache.commons.io.IOCase.SENSITIVE,5163,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5166,org.apache.commons.io.IOCase.SENSITIVE,5165,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5167,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5169,org.apache.commons.io.IOCase.SENSITIVE,5168,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5171,org.apache.commons.io.IOCase.SENSITIVE,5170,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5172,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5174,org.apache.commons.io.IOCase.SENSITIVE,5173,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5176,org.apache.commons.io.IOCase.SENSITIVE,5175,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5178,org.apache.commons.io.IOCase.SENSITIVE,5177,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5179,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5181,org.apache.commons.io.IOCase.SENSITIVE,5180,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5183,org.apache.commons.io.IOCase.SENSITIVE,5182,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5185,org.apache.commons.io.IOCase.SENSITIVE,5184,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5186,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5188,org.apache.commons.io.IOCase.SENSITIVE,5187,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5190,org.apache.commons.io.IOCase.SENSITIVE,5189,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5192,org.apache.commons.io.IOCase.SENSITIVE,5191,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5193,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5195,org.apache.commons.io.IOCase.SENSITIVE,5194,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5197,org.apache.commons.io.IOCase.SENSITIVE,5196,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5199,org.apache.commons.io.IOCase.SENSITIVE,5198,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5201,org.apache.commons.io.IOCase.SENSITIVE,5200,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 9, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5203,org.apache.commons.io.IOCase.SENSITIVE,5202,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5205,org.apache.commons.io.IOCase.SENSITIVE,5204,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5206,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5208,org.apache.commons.io.IOCase.SENSITIVE,5207,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 9, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5210,org.apache.commons.io.IOCase.SENSITIVE,5209,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 6, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5212,org.apache.commons.io.IOCase.SENSITIVE,5211,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 7, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5213,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5215,org.apache.commons.io.IOCase.SENSITIVE,5214,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5216,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5218,org.apache.commons.io.IOCase.SENSITIVE,5217,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5219,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5221,org.apache.commons.io.IOCase.SENSITIVE,5220,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("DEF", 0, "ABCDEFGHIJ"));
        try {
            IOCase.SENSITIVE.checkIndexOf("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkIndexOf(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkIndexOf(null, 1, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkIndexOf_functionality_literalMutation6202() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkIndexOf_functionality_literalMutation6202");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5161,org.apache.commons.io.IOCase.SENSITIVE,5160,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5162,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5164,org.apache.commons.io.IOCase.SENSITIVE,5163,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5166,org.apache.commons.io.IOCase.SENSITIVE,5165,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5167,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5169,org.apache.commons.io.IOCase.SENSITIVE,5168,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5171,org.apache.commons.io.IOCase.SENSITIVE,5170,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5172,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5174,org.apache.commons.io.IOCase.SENSITIVE,5173,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5176,org.apache.commons.io.IOCase.SENSITIVE,5175,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5178,org.apache.commons.io.IOCase.SENSITIVE,5177,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5179,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5181,org.apache.commons.io.IOCase.SENSITIVE,5180,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5183,org.apache.commons.io.IOCase.SENSITIVE,5182,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5185,org.apache.commons.io.IOCase.SENSITIVE,5184,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5186,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5188,org.apache.commons.io.IOCase.SENSITIVE,5187,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5190,org.apache.commons.io.IOCase.SENSITIVE,5189,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5192,org.apache.commons.io.IOCase.SENSITIVE,5191,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5193,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5195,org.apache.commons.io.IOCase.SENSITIVE,5194,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5197,org.apache.commons.io.IOCase.SENSITIVE,5196,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5199,org.apache.commons.io.IOCase.SENSITIVE,5198,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5201,org.apache.commons.io.IOCase.SENSITIVE,5200,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 9, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5203,org.apache.commons.io.IOCase.SENSITIVE,5202,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5205,org.apache.commons.io.IOCase.SENSITIVE,5204,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5206,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5208,org.apache.commons.io.IOCase.SENSITIVE,5207,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 9, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5210,org.apache.commons.io.IOCase.SENSITIVE,5209,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 6, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5212,org.apache.commons.io.IOCase.SENSITIVE,5211,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 7, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5213,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5215,org.apache.commons.io.IOCase.SENSITIVE,5214,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5216,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5218,org.apache.commons.io.IOCase.SENSITIVE,5217,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5219,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5221,org.apache.commons.io.IOCase.SENSITIVE,5220,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("DEF", 0, "ABCDEFGHIJ"));
        try {
            IOCase.SENSITIVE.checkIndexOf("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkIndexOf(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkIndexOf(null, -1, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkIndexOf_functionality_literalMutation6203() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkIndexOf_functionality_literalMutation6203");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5161,org.apache.commons.io.IOCase.SENSITIVE,5160,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5162,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5164,org.apache.commons.io.IOCase.SENSITIVE,5163,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5166,org.apache.commons.io.IOCase.SENSITIVE,5165,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5167,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5169,org.apache.commons.io.IOCase.SENSITIVE,5168,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5171,org.apache.commons.io.IOCase.SENSITIVE,5170,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5172,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5174,org.apache.commons.io.IOCase.SENSITIVE,5173,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5176,org.apache.commons.io.IOCase.SENSITIVE,5175,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5178,org.apache.commons.io.IOCase.SENSITIVE,5177,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5179,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5181,org.apache.commons.io.IOCase.SENSITIVE,5180,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5183,org.apache.commons.io.IOCase.SENSITIVE,5182,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5185,org.apache.commons.io.IOCase.SENSITIVE,5184,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5186,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5188,org.apache.commons.io.IOCase.SENSITIVE,5187,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "DE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5190,org.apache.commons.io.IOCase.SENSITIVE,5189,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5192,org.apache.commons.io.IOCase.SENSITIVE,5191,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5193,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5195,org.apache.commons.io.IOCase.SENSITIVE,5194,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "DEF"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5197,org.apache.commons.io.IOCase.SENSITIVE,5196,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5199,org.apache.commons.io.IOCase.SENSITIVE,5198,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5201,org.apache.commons.io.IOCase.SENSITIVE,5200,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 9, "J"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5203,org.apache.commons.io.IOCase.SENSITIVE,5202,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5205,org.apache.commons.io.IOCase.SENSITIVE,5204,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5206,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5208,org.apache.commons.io.IOCase.SENSITIVE,5207,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 9, "IJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5210,org.apache.commons.io.IOCase.SENSITIVE,5209,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 6, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5212,org.apache.commons.io.IOCase.SENSITIVE,5211,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 7, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5213,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5215,org.apache.commons.io.IOCase.SENSITIVE,5214,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "HIJ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5216,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5218,org.apache.commons.io.IOCase.SENSITIVE,5217,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5219,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5221,org.apache.commons.io.IOCase.SENSITIVE,5220,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("DEF", 0, "ABCDEFGHIJ"));
        try {
            IOCase.SENSITIVE.checkIndexOf("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkIndexOf(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkIndexOf(null, 0, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkIndexOf_case() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkIndexOf_case");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5147,org.apache.commons.io.IOCase.SENSITIVE,5146,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABC", 0, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5148,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5150,org.apache.commons.io.IOCase.SENSITIVE,5149,org.apache.commons.io.IOCase.SENSITIVE.checkIndexOf("ABC", 0, "Bc"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5152,org.apache.commons.io.IOCase.INSENSITIVE,5151,org.apache.commons.io.IOCase.INSENSITIVE.checkIndexOf("ABC", 0, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5154,org.apache.commons.io.IOCase.INSENSITIVE,5153,org.apache.commons.io.IOCase.INSENSITIVE.checkIndexOf("ABC", 0, "Bc"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5156,org.apache.commons.io.IOCase.SYSTEM,5155,org.apache.commons.io.IOCase.SYSTEM.checkIndexOf("ABC", 0, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5157,(org.apache.commons.io.IOCaseTestCase.WINDOWS ? 1 : -1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5159,org.apache.commons.io.IOCase.SYSTEM,5158,org.apache.commons.io.IOCase.SYSTEM.checkIndexOf("ABC", 0, "Bc"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void test_checkRegionMatches_functionality_add1762() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkRegionMatches_functionality_add1762");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5236,org.apache.commons.io.IOCase.SENSITIVE,5235,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5238,org.apache.commons.io.IOCase.SENSITIVE,5237,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5240,org.apache.commons.io.IOCase.SENSITIVE,5239,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5242,org.apache.commons.io.IOCase.SENSITIVE,5241,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5244,org.apache.commons.io.IOCase.SENSITIVE,5243,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5246,org.apache.commons.io.IOCase.SENSITIVE,5245,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5248,org.apache.commons.io.IOCase.SENSITIVE,5247,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5250,org.apache.commons.io.IOCase.SENSITIVE,5249,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5252,org.apache.commons.io.IOCase.SENSITIVE,5251,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5254,org.apache.commons.io.IOCase.SENSITIVE,5253,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5256,org.apache.commons.io.IOCase.SENSITIVE,5255,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5258,org.apache.commons.io.IOCase.SENSITIVE,5257,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5260,org.apache.commons.io.IOCase.SENSITIVE,5259,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5262,org.apache.commons.io.IOCase.SENSITIVE,5261,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5264,org.apache.commons.io.IOCase.SENSITIVE,5263,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5266,org.apache.commons.io.IOCase.SENSITIVE,5265,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5268,org.apache.commons.io.IOCase.SENSITIVE,5267,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5270,org.apache.commons.io.IOCase.SENSITIVE,5269,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, ""));
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 0, null);
            IOCase.SENSITIVE.checkRegionMatches("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 1, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void test_checkRegionMatches_functionality_add1763() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkRegionMatches_functionality_add1763");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5236,org.apache.commons.io.IOCase.SENSITIVE,5235,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5238,org.apache.commons.io.IOCase.SENSITIVE,5237,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5240,org.apache.commons.io.IOCase.SENSITIVE,5239,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5242,org.apache.commons.io.IOCase.SENSITIVE,5241,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5244,org.apache.commons.io.IOCase.SENSITIVE,5243,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5246,org.apache.commons.io.IOCase.SENSITIVE,5245,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5248,org.apache.commons.io.IOCase.SENSITIVE,5247,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5250,org.apache.commons.io.IOCase.SENSITIVE,5249,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5252,org.apache.commons.io.IOCase.SENSITIVE,5251,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5254,org.apache.commons.io.IOCase.SENSITIVE,5253,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5256,org.apache.commons.io.IOCase.SENSITIVE,5255,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5258,org.apache.commons.io.IOCase.SENSITIVE,5257,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5260,org.apache.commons.io.IOCase.SENSITIVE,5259,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5262,org.apache.commons.io.IOCase.SENSITIVE,5261,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5264,org.apache.commons.io.IOCase.SENSITIVE,5263,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5266,org.apache.commons.io.IOCase.SENSITIVE,5265,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5268,org.apache.commons.io.IOCase.SENSITIVE,5267,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5270,org.apache.commons.io.IOCase.SENSITIVE,5269,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, ""));
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, "ABC");
            IOCase.SENSITIVE.checkRegionMatches(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 1, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void test_checkRegionMatches_functionality_add1764() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkRegionMatches_functionality_add1764");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5236,org.apache.commons.io.IOCase.SENSITIVE,5235,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5238,org.apache.commons.io.IOCase.SENSITIVE,5237,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5240,org.apache.commons.io.IOCase.SENSITIVE,5239,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5242,org.apache.commons.io.IOCase.SENSITIVE,5241,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5244,org.apache.commons.io.IOCase.SENSITIVE,5243,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5246,org.apache.commons.io.IOCase.SENSITIVE,5245,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5248,org.apache.commons.io.IOCase.SENSITIVE,5247,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5250,org.apache.commons.io.IOCase.SENSITIVE,5249,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5252,org.apache.commons.io.IOCase.SENSITIVE,5251,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5254,org.apache.commons.io.IOCase.SENSITIVE,5253,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5256,org.apache.commons.io.IOCase.SENSITIVE,5255,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5258,org.apache.commons.io.IOCase.SENSITIVE,5257,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5260,org.apache.commons.io.IOCase.SENSITIVE,5259,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5262,org.apache.commons.io.IOCase.SENSITIVE,5261,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5264,org.apache.commons.io.IOCase.SENSITIVE,5263,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5266,org.apache.commons.io.IOCase.SENSITIVE,5265,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5268,org.apache.commons.io.IOCase.SENSITIVE,5267,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5270,org.apache.commons.io.IOCase.SENSITIVE,5269,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, ""));
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, null);
            IOCase.SENSITIVE.checkRegionMatches(null, 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 1, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void test_checkRegionMatches_functionality_add1765() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkRegionMatches_functionality_add1765");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5236,org.apache.commons.io.IOCase.SENSITIVE,5235,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5238,org.apache.commons.io.IOCase.SENSITIVE,5237,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5240,org.apache.commons.io.IOCase.SENSITIVE,5239,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5242,org.apache.commons.io.IOCase.SENSITIVE,5241,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5244,org.apache.commons.io.IOCase.SENSITIVE,5243,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5246,org.apache.commons.io.IOCase.SENSITIVE,5245,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5248,org.apache.commons.io.IOCase.SENSITIVE,5247,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5250,org.apache.commons.io.IOCase.SENSITIVE,5249,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5252,org.apache.commons.io.IOCase.SENSITIVE,5251,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5254,org.apache.commons.io.IOCase.SENSITIVE,5253,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5256,org.apache.commons.io.IOCase.SENSITIVE,5255,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5258,org.apache.commons.io.IOCase.SENSITIVE,5257,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5260,org.apache.commons.io.IOCase.SENSITIVE,5259,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5262,org.apache.commons.io.IOCase.SENSITIVE,5261,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5264,org.apache.commons.io.IOCase.SENSITIVE,5263,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5266,org.apache.commons.io.IOCase.SENSITIVE,5265,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5268,org.apache.commons.io.IOCase.SENSITIVE,5267,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5270,org.apache.commons.io.IOCase.SENSITIVE,5269,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, ""));
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 1, null);
            IOCase.SENSITIVE.checkRegionMatches("ABC", 1, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void test_checkRegionMatches_functionality_add1766() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkRegionMatches_functionality_add1766");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5236,org.apache.commons.io.IOCase.SENSITIVE,5235,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5238,org.apache.commons.io.IOCase.SENSITIVE,5237,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5240,org.apache.commons.io.IOCase.SENSITIVE,5239,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5242,org.apache.commons.io.IOCase.SENSITIVE,5241,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5244,org.apache.commons.io.IOCase.SENSITIVE,5243,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5246,org.apache.commons.io.IOCase.SENSITIVE,5245,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5248,org.apache.commons.io.IOCase.SENSITIVE,5247,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5250,org.apache.commons.io.IOCase.SENSITIVE,5249,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5252,org.apache.commons.io.IOCase.SENSITIVE,5251,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5254,org.apache.commons.io.IOCase.SENSITIVE,5253,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5256,org.apache.commons.io.IOCase.SENSITIVE,5255,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5258,org.apache.commons.io.IOCase.SENSITIVE,5257,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5260,org.apache.commons.io.IOCase.SENSITIVE,5259,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5262,org.apache.commons.io.IOCase.SENSITIVE,5261,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5264,org.apache.commons.io.IOCase.SENSITIVE,5263,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5266,org.apache.commons.io.IOCase.SENSITIVE,5265,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5268,org.apache.commons.io.IOCase.SENSITIVE,5267,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5270,org.apache.commons.io.IOCase.SENSITIVE,5269,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, ""));
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 1, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, "ABC");
            IOCase.SENSITIVE.checkRegionMatches(null, 1, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void test_checkRegionMatches_functionality_add1767() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkRegionMatches_functionality_add1767");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5236,org.apache.commons.io.IOCase.SENSITIVE,5235,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5238,org.apache.commons.io.IOCase.SENSITIVE,5237,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5240,org.apache.commons.io.IOCase.SENSITIVE,5239,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5242,org.apache.commons.io.IOCase.SENSITIVE,5241,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5244,org.apache.commons.io.IOCase.SENSITIVE,5243,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5246,org.apache.commons.io.IOCase.SENSITIVE,5245,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5248,org.apache.commons.io.IOCase.SENSITIVE,5247,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5250,org.apache.commons.io.IOCase.SENSITIVE,5249,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5252,org.apache.commons.io.IOCase.SENSITIVE,5251,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5254,org.apache.commons.io.IOCase.SENSITIVE,5253,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5256,org.apache.commons.io.IOCase.SENSITIVE,5255,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5258,org.apache.commons.io.IOCase.SENSITIVE,5257,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5260,org.apache.commons.io.IOCase.SENSITIVE,5259,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5262,org.apache.commons.io.IOCase.SENSITIVE,5261,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5264,org.apache.commons.io.IOCase.SENSITIVE,5263,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5266,org.apache.commons.io.IOCase.SENSITIVE,5265,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5268,org.apache.commons.io.IOCase.SENSITIVE,5267,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5270,org.apache.commons.io.IOCase.SENSITIVE,5269,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, ""));
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 1, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, null);
            IOCase.SENSITIVE.checkRegionMatches(null, 1, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkRegionMatches_functionality() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkRegionMatches_functionality");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5236,org.apache.commons.io.IOCase.SENSITIVE,5235,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5238,org.apache.commons.io.IOCase.SENSITIVE,5237,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5240,org.apache.commons.io.IOCase.SENSITIVE,5239,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5242,org.apache.commons.io.IOCase.SENSITIVE,5241,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5244,org.apache.commons.io.IOCase.SENSITIVE,5243,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5246,org.apache.commons.io.IOCase.SENSITIVE,5245,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5248,org.apache.commons.io.IOCase.SENSITIVE,5247,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5250,org.apache.commons.io.IOCase.SENSITIVE,5249,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5252,org.apache.commons.io.IOCase.SENSITIVE,5251,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5254,org.apache.commons.io.IOCase.SENSITIVE,5253,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5256,org.apache.commons.io.IOCase.SENSITIVE,5255,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5258,org.apache.commons.io.IOCase.SENSITIVE,5257,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5260,org.apache.commons.io.IOCase.SENSITIVE,5259,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5262,org.apache.commons.io.IOCase.SENSITIVE,5261,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5264,org.apache.commons.io.IOCase.SENSITIVE,5263,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5266,org.apache.commons.io.IOCase.SENSITIVE,5265,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5268,org.apache.commons.io.IOCase.SENSITIVE,5267,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5270,org.apache.commons.io.IOCase.SENSITIVE,5269,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, ""));
        try {
            IOCase.SENSITIVE.checkRegionMatches("bar", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 1, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkRegionMatches_functionality_literalMutation6206() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkRegionMatches_functionality_literalMutation6206");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5236,org.apache.commons.io.IOCase.SENSITIVE,5235,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5238,org.apache.commons.io.IOCase.SENSITIVE,5237,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5240,org.apache.commons.io.IOCase.SENSITIVE,5239,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5242,org.apache.commons.io.IOCase.SENSITIVE,5241,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5244,org.apache.commons.io.IOCase.SENSITIVE,5243,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5246,org.apache.commons.io.IOCase.SENSITIVE,5245,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5248,org.apache.commons.io.IOCase.SENSITIVE,5247,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5250,org.apache.commons.io.IOCase.SENSITIVE,5249,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5252,org.apache.commons.io.IOCase.SENSITIVE,5251,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5254,org.apache.commons.io.IOCase.SENSITIVE,5253,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5256,org.apache.commons.io.IOCase.SENSITIVE,5255,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5258,org.apache.commons.io.IOCase.SENSITIVE,5257,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5260,org.apache.commons.io.IOCase.SENSITIVE,5259,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5262,org.apache.commons.io.IOCase.SENSITIVE,5261,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5264,org.apache.commons.io.IOCase.SENSITIVE,5263,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5266,org.apache.commons.io.IOCase.SENSITIVE,5265,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5268,org.apache.commons.io.IOCase.SENSITIVE,5267,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5270,org.apache.commons.io.IOCase.SENSITIVE,5269,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, ""));
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 1, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 1, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkRegionMatches_functionality_literalMutation6207() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkRegionMatches_functionality_literalMutation6207");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5236,org.apache.commons.io.IOCase.SENSITIVE,5235,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5238,org.apache.commons.io.IOCase.SENSITIVE,5237,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5240,org.apache.commons.io.IOCase.SENSITIVE,5239,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5242,org.apache.commons.io.IOCase.SENSITIVE,5241,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5244,org.apache.commons.io.IOCase.SENSITIVE,5243,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5246,org.apache.commons.io.IOCase.SENSITIVE,5245,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5248,org.apache.commons.io.IOCase.SENSITIVE,5247,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5250,org.apache.commons.io.IOCase.SENSITIVE,5249,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5252,org.apache.commons.io.IOCase.SENSITIVE,5251,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5254,org.apache.commons.io.IOCase.SENSITIVE,5253,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5256,org.apache.commons.io.IOCase.SENSITIVE,5255,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5258,org.apache.commons.io.IOCase.SENSITIVE,5257,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5260,org.apache.commons.io.IOCase.SENSITIVE,5259,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5262,org.apache.commons.io.IOCase.SENSITIVE,5261,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5264,org.apache.commons.io.IOCase.SENSITIVE,5263,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5266,org.apache.commons.io.IOCase.SENSITIVE,5265,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5268,org.apache.commons.io.IOCase.SENSITIVE,5267,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5270,org.apache.commons.io.IOCase.SENSITIVE,5269,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, ""));
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", -1, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 1, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkRegionMatches_functionality_literalMutation6208() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkRegionMatches_functionality_literalMutation6208");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5236,org.apache.commons.io.IOCase.SENSITIVE,5235,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5238,org.apache.commons.io.IOCase.SENSITIVE,5237,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5240,org.apache.commons.io.IOCase.SENSITIVE,5239,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5242,org.apache.commons.io.IOCase.SENSITIVE,5241,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5244,org.apache.commons.io.IOCase.SENSITIVE,5243,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5246,org.apache.commons.io.IOCase.SENSITIVE,5245,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5248,org.apache.commons.io.IOCase.SENSITIVE,5247,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5250,org.apache.commons.io.IOCase.SENSITIVE,5249,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5252,org.apache.commons.io.IOCase.SENSITIVE,5251,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5254,org.apache.commons.io.IOCase.SENSITIVE,5253,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5256,org.apache.commons.io.IOCase.SENSITIVE,5255,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5258,org.apache.commons.io.IOCase.SENSITIVE,5257,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5260,org.apache.commons.io.IOCase.SENSITIVE,5259,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5262,org.apache.commons.io.IOCase.SENSITIVE,5261,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5264,org.apache.commons.io.IOCase.SENSITIVE,5263,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5266,org.apache.commons.io.IOCase.SENSITIVE,5265,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5268,org.apache.commons.io.IOCase.SENSITIVE,5267,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5270,org.apache.commons.io.IOCase.SENSITIVE,5269,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, ""));
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 1, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkRegionMatches_functionality_literalMutation6211() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkRegionMatches_functionality_literalMutation6211");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5236,org.apache.commons.io.IOCase.SENSITIVE,5235,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5238,org.apache.commons.io.IOCase.SENSITIVE,5237,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5240,org.apache.commons.io.IOCase.SENSITIVE,5239,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5242,org.apache.commons.io.IOCase.SENSITIVE,5241,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5244,org.apache.commons.io.IOCase.SENSITIVE,5243,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5246,org.apache.commons.io.IOCase.SENSITIVE,5245,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5248,org.apache.commons.io.IOCase.SENSITIVE,5247,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5250,org.apache.commons.io.IOCase.SENSITIVE,5249,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5252,org.apache.commons.io.IOCase.SENSITIVE,5251,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5254,org.apache.commons.io.IOCase.SENSITIVE,5253,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5256,org.apache.commons.io.IOCase.SENSITIVE,5255,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5258,org.apache.commons.io.IOCase.SENSITIVE,5257,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5260,org.apache.commons.io.IOCase.SENSITIVE,5259,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5262,org.apache.commons.io.IOCase.SENSITIVE,5261,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5264,org.apache.commons.io.IOCase.SENSITIVE,5263,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5266,org.apache.commons.io.IOCase.SENSITIVE,5265,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5268,org.apache.commons.io.IOCase.SENSITIVE,5267,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5270,org.apache.commons.io.IOCase.SENSITIVE,5269,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, ""));
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 1, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkRegionMatches_functionality_literalMutation6212() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkRegionMatches_functionality_literalMutation6212");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5236,org.apache.commons.io.IOCase.SENSITIVE,5235,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5238,org.apache.commons.io.IOCase.SENSITIVE,5237,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5240,org.apache.commons.io.IOCase.SENSITIVE,5239,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5242,org.apache.commons.io.IOCase.SENSITIVE,5241,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5244,org.apache.commons.io.IOCase.SENSITIVE,5243,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5246,org.apache.commons.io.IOCase.SENSITIVE,5245,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5248,org.apache.commons.io.IOCase.SENSITIVE,5247,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5250,org.apache.commons.io.IOCase.SENSITIVE,5249,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5252,org.apache.commons.io.IOCase.SENSITIVE,5251,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5254,org.apache.commons.io.IOCase.SENSITIVE,5253,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5256,org.apache.commons.io.IOCase.SENSITIVE,5255,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5258,org.apache.commons.io.IOCase.SENSITIVE,5257,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5260,org.apache.commons.io.IOCase.SENSITIVE,5259,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5262,org.apache.commons.io.IOCase.SENSITIVE,5261,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5264,org.apache.commons.io.IOCase.SENSITIVE,5263,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5266,org.apache.commons.io.IOCase.SENSITIVE,5265,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5268,org.apache.commons.io.IOCase.SENSITIVE,5267,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5270,org.apache.commons.io.IOCase.SENSITIVE,5269,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, ""));
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, -1, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 1, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkRegionMatches_functionality_literalMutation6213() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkRegionMatches_functionality_literalMutation6213");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5236,org.apache.commons.io.IOCase.SENSITIVE,5235,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5238,org.apache.commons.io.IOCase.SENSITIVE,5237,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5240,org.apache.commons.io.IOCase.SENSITIVE,5239,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5242,org.apache.commons.io.IOCase.SENSITIVE,5241,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5244,org.apache.commons.io.IOCase.SENSITIVE,5243,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5246,org.apache.commons.io.IOCase.SENSITIVE,5245,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5248,org.apache.commons.io.IOCase.SENSITIVE,5247,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5250,org.apache.commons.io.IOCase.SENSITIVE,5249,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5252,org.apache.commons.io.IOCase.SENSITIVE,5251,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5254,org.apache.commons.io.IOCase.SENSITIVE,5253,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5256,org.apache.commons.io.IOCase.SENSITIVE,5255,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5258,org.apache.commons.io.IOCase.SENSITIVE,5257,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5260,org.apache.commons.io.IOCase.SENSITIVE,5259,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5262,org.apache.commons.io.IOCase.SENSITIVE,5261,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5264,org.apache.commons.io.IOCase.SENSITIVE,5263,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5266,org.apache.commons.io.IOCase.SENSITIVE,5265,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5268,org.apache.commons.io.IOCase.SENSITIVE,5267,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5270,org.apache.commons.io.IOCase.SENSITIVE,5269,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, ""));
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 1, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkRegionMatches_functionality_literalMutation6214() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkRegionMatches_functionality_literalMutation6214");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5236,org.apache.commons.io.IOCase.SENSITIVE,5235,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5238,org.apache.commons.io.IOCase.SENSITIVE,5237,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5240,org.apache.commons.io.IOCase.SENSITIVE,5239,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5242,org.apache.commons.io.IOCase.SENSITIVE,5241,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5244,org.apache.commons.io.IOCase.SENSITIVE,5243,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5246,org.apache.commons.io.IOCase.SENSITIVE,5245,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5248,org.apache.commons.io.IOCase.SENSITIVE,5247,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5250,org.apache.commons.io.IOCase.SENSITIVE,5249,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5252,org.apache.commons.io.IOCase.SENSITIVE,5251,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5254,org.apache.commons.io.IOCase.SENSITIVE,5253,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5256,org.apache.commons.io.IOCase.SENSITIVE,5255,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5258,org.apache.commons.io.IOCase.SENSITIVE,5257,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5260,org.apache.commons.io.IOCase.SENSITIVE,5259,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5262,org.apache.commons.io.IOCase.SENSITIVE,5261,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5264,org.apache.commons.io.IOCase.SENSITIVE,5263,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5266,org.apache.commons.io.IOCase.SENSITIVE,5265,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5268,org.apache.commons.io.IOCase.SENSITIVE,5267,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5270,org.apache.commons.io.IOCase.SENSITIVE,5269,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, ""));
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, "bar");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 1, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkRegionMatches_functionality_literalMutation6216() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkRegionMatches_functionality_literalMutation6216");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5236,org.apache.commons.io.IOCase.SENSITIVE,5235,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5238,org.apache.commons.io.IOCase.SENSITIVE,5237,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5240,org.apache.commons.io.IOCase.SENSITIVE,5239,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5242,org.apache.commons.io.IOCase.SENSITIVE,5241,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5244,org.apache.commons.io.IOCase.SENSITIVE,5243,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5246,org.apache.commons.io.IOCase.SENSITIVE,5245,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5248,org.apache.commons.io.IOCase.SENSITIVE,5247,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5250,org.apache.commons.io.IOCase.SENSITIVE,5249,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5252,org.apache.commons.io.IOCase.SENSITIVE,5251,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5254,org.apache.commons.io.IOCase.SENSITIVE,5253,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5256,org.apache.commons.io.IOCase.SENSITIVE,5255,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5258,org.apache.commons.io.IOCase.SENSITIVE,5257,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5260,org.apache.commons.io.IOCase.SENSITIVE,5259,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5262,org.apache.commons.io.IOCase.SENSITIVE,5261,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5264,org.apache.commons.io.IOCase.SENSITIVE,5263,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5266,org.apache.commons.io.IOCase.SENSITIVE,5265,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5268,org.apache.commons.io.IOCase.SENSITIVE,5267,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5270,org.apache.commons.io.IOCase.SENSITIVE,5269,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, ""));
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 1, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkRegionMatches_functionality_literalMutation6217() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkRegionMatches_functionality_literalMutation6217");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5236,org.apache.commons.io.IOCase.SENSITIVE,5235,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5238,org.apache.commons.io.IOCase.SENSITIVE,5237,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5240,org.apache.commons.io.IOCase.SENSITIVE,5239,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5242,org.apache.commons.io.IOCase.SENSITIVE,5241,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5244,org.apache.commons.io.IOCase.SENSITIVE,5243,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5246,org.apache.commons.io.IOCase.SENSITIVE,5245,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5248,org.apache.commons.io.IOCase.SENSITIVE,5247,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5250,org.apache.commons.io.IOCase.SENSITIVE,5249,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5252,org.apache.commons.io.IOCase.SENSITIVE,5251,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5254,org.apache.commons.io.IOCase.SENSITIVE,5253,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5256,org.apache.commons.io.IOCase.SENSITIVE,5255,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5258,org.apache.commons.io.IOCase.SENSITIVE,5257,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5260,org.apache.commons.io.IOCase.SENSITIVE,5259,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5262,org.apache.commons.io.IOCase.SENSITIVE,5261,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5264,org.apache.commons.io.IOCase.SENSITIVE,5263,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5266,org.apache.commons.io.IOCase.SENSITIVE,5265,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5268,org.apache.commons.io.IOCase.SENSITIVE,5267,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5270,org.apache.commons.io.IOCase.SENSITIVE,5269,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, ""));
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, -1, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 1, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkRegionMatches_functionality_literalMutation6218() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkRegionMatches_functionality_literalMutation6218");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5236,org.apache.commons.io.IOCase.SENSITIVE,5235,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5238,org.apache.commons.io.IOCase.SENSITIVE,5237,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5240,org.apache.commons.io.IOCase.SENSITIVE,5239,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5242,org.apache.commons.io.IOCase.SENSITIVE,5241,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5244,org.apache.commons.io.IOCase.SENSITIVE,5243,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5246,org.apache.commons.io.IOCase.SENSITIVE,5245,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5248,org.apache.commons.io.IOCase.SENSITIVE,5247,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5250,org.apache.commons.io.IOCase.SENSITIVE,5249,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5252,org.apache.commons.io.IOCase.SENSITIVE,5251,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5254,org.apache.commons.io.IOCase.SENSITIVE,5253,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5256,org.apache.commons.io.IOCase.SENSITIVE,5255,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5258,org.apache.commons.io.IOCase.SENSITIVE,5257,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5260,org.apache.commons.io.IOCase.SENSITIVE,5259,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5262,org.apache.commons.io.IOCase.SENSITIVE,5261,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5264,org.apache.commons.io.IOCase.SENSITIVE,5263,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5266,org.apache.commons.io.IOCase.SENSITIVE,5265,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5268,org.apache.commons.io.IOCase.SENSITIVE,5267,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5270,org.apache.commons.io.IOCase.SENSITIVE,5269,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, ""));
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 1, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkRegionMatches_functionality_literalMutation6220() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkRegionMatches_functionality_literalMutation6220");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5236,org.apache.commons.io.IOCase.SENSITIVE,5235,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5238,org.apache.commons.io.IOCase.SENSITIVE,5237,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5240,org.apache.commons.io.IOCase.SENSITIVE,5239,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5242,org.apache.commons.io.IOCase.SENSITIVE,5241,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5244,org.apache.commons.io.IOCase.SENSITIVE,5243,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5246,org.apache.commons.io.IOCase.SENSITIVE,5245,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5248,org.apache.commons.io.IOCase.SENSITIVE,5247,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5250,org.apache.commons.io.IOCase.SENSITIVE,5249,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5252,org.apache.commons.io.IOCase.SENSITIVE,5251,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5254,org.apache.commons.io.IOCase.SENSITIVE,5253,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5256,org.apache.commons.io.IOCase.SENSITIVE,5255,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5258,org.apache.commons.io.IOCase.SENSITIVE,5257,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5260,org.apache.commons.io.IOCase.SENSITIVE,5259,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5262,org.apache.commons.io.IOCase.SENSITIVE,5261,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5264,org.apache.commons.io.IOCase.SENSITIVE,5263,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5266,org.apache.commons.io.IOCase.SENSITIVE,5265,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5268,org.apache.commons.io.IOCase.SENSITIVE,5267,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5270,org.apache.commons.io.IOCase.SENSITIVE,5269,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, ""));
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches("bar", 1, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkRegionMatches_functionality_literalMutation6221() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkRegionMatches_functionality_literalMutation6221");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5236,org.apache.commons.io.IOCase.SENSITIVE,5235,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5238,org.apache.commons.io.IOCase.SENSITIVE,5237,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5240,org.apache.commons.io.IOCase.SENSITIVE,5239,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5242,org.apache.commons.io.IOCase.SENSITIVE,5241,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5244,org.apache.commons.io.IOCase.SENSITIVE,5243,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5246,org.apache.commons.io.IOCase.SENSITIVE,5245,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5248,org.apache.commons.io.IOCase.SENSITIVE,5247,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5250,org.apache.commons.io.IOCase.SENSITIVE,5249,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5252,org.apache.commons.io.IOCase.SENSITIVE,5251,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5254,org.apache.commons.io.IOCase.SENSITIVE,5253,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5256,org.apache.commons.io.IOCase.SENSITIVE,5255,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5258,org.apache.commons.io.IOCase.SENSITIVE,5257,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5260,org.apache.commons.io.IOCase.SENSITIVE,5259,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5262,org.apache.commons.io.IOCase.SENSITIVE,5261,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5264,org.apache.commons.io.IOCase.SENSITIVE,5263,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5266,org.apache.commons.io.IOCase.SENSITIVE,5265,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5268,org.apache.commons.io.IOCase.SENSITIVE,5267,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5270,org.apache.commons.io.IOCase.SENSITIVE,5269,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, ""));
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 2, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkRegionMatches_functionality_literalMutation6222() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkRegionMatches_functionality_literalMutation6222");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5236,org.apache.commons.io.IOCase.SENSITIVE,5235,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5238,org.apache.commons.io.IOCase.SENSITIVE,5237,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5240,org.apache.commons.io.IOCase.SENSITIVE,5239,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5242,org.apache.commons.io.IOCase.SENSITIVE,5241,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5244,org.apache.commons.io.IOCase.SENSITIVE,5243,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5246,org.apache.commons.io.IOCase.SENSITIVE,5245,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5248,org.apache.commons.io.IOCase.SENSITIVE,5247,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5250,org.apache.commons.io.IOCase.SENSITIVE,5249,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5252,org.apache.commons.io.IOCase.SENSITIVE,5251,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5254,org.apache.commons.io.IOCase.SENSITIVE,5253,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5256,org.apache.commons.io.IOCase.SENSITIVE,5255,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5258,org.apache.commons.io.IOCase.SENSITIVE,5257,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5260,org.apache.commons.io.IOCase.SENSITIVE,5259,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5262,org.apache.commons.io.IOCase.SENSITIVE,5261,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5264,org.apache.commons.io.IOCase.SENSITIVE,5263,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5266,org.apache.commons.io.IOCase.SENSITIVE,5265,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5268,org.apache.commons.io.IOCase.SENSITIVE,5267,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5270,org.apache.commons.io.IOCase.SENSITIVE,5269,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, ""));
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkRegionMatches_functionality_literalMutation6223() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkRegionMatches_functionality_literalMutation6223");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5236,org.apache.commons.io.IOCase.SENSITIVE,5235,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5238,org.apache.commons.io.IOCase.SENSITIVE,5237,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5240,org.apache.commons.io.IOCase.SENSITIVE,5239,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5242,org.apache.commons.io.IOCase.SENSITIVE,5241,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5244,org.apache.commons.io.IOCase.SENSITIVE,5243,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5246,org.apache.commons.io.IOCase.SENSITIVE,5245,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5248,org.apache.commons.io.IOCase.SENSITIVE,5247,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5250,org.apache.commons.io.IOCase.SENSITIVE,5249,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5252,org.apache.commons.io.IOCase.SENSITIVE,5251,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5254,org.apache.commons.io.IOCase.SENSITIVE,5253,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5256,org.apache.commons.io.IOCase.SENSITIVE,5255,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5258,org.apache.commons.io.IOCase.SENSITIVE,5257,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5260,org.apache.commons.io.IOCase.SENSITIVE,5259,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5262,org.apache.commons.io.IOCase.SENSITIVE,5261,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5264,org.apache.commons.io.IOCase.SENSITIVE,5263,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5266,org.apache.commons.io.IOCase.SENSITIVE,5265,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5268,org.apache.commons.io.IOCase.SENSITIVE,5267,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5270,org.apache.commons.io.IOCase.SENSITIVE,5269,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, ""));
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkRegionMatches_functionality_literalMutation6226() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkRegionMatches_functionality_literalMutation6226");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5236,org.apache.commons.io.IOCase.SENSITIVE,5235,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5238,org.apache.commons.io.IOCase.SENSITIVE,5237,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5240,org.apache.commons.io.IOCase.SENSITIVE,5239,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5242,org.apache.commons.io.IOCase.SENSITIVE,5241,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5244,org.apache.commons.io.IOCase.SENSITIVE,5243,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5246,org.apache.commons.io.IOCase.SENSITIVE,5245,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5248,org.apache.commons.io.IOCase.SENSITIVE,5247,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5250,org.apache.commons.io.IOCase.SENSITIVE,5249,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5252,org.apache.commons.io.IOCase.SENSITIVE,5251,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5254,org.apache.commons.io.IOCase.SENSITIVE,5253,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5256,org.apache.commons.io.IOCase.SENSITIVE,5255,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5258,org.apache.commons.io.IOCase.SENSITIVE,5257,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5260,org.apache.commons.io.IOCase.SENSITIVE,5259,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5262,org.apache.commons.io.IOCase.SENSITIVE,5261,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5264,org.apache.commons.io.IOCase.SENSITIVE,5263,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5266,org.apache.commons.io.IOCase.SENSITIVE,5265,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5268,org.apache.commons.io.IOCase.SENSITIVE,5267,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5270,org.apache.commons.io.IOCase.SENSITIVE,5269,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, ""));
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 1, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 2, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkRegionMatches_functionality_literalMutation6227() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkRegionMatches_functionality_literalMutation6227");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5236,org.apache.commons.io.IOCase.SENSITIVE,5235,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5238,org.apache.commons.io.IOCase.SENSITIVE,5237,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5240,org.apache.commons.io.IOCase.SENSITIVE,5239,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5242,org.apache.commons.io.IOCase.SENSITIVE,5241,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5244,org.apache.commons.io.IOCase.SENSITIVE,5243,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5246,org.apache.commons.io.IOCase.SENSITIVE,5245,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5248,org.apache.commons.io.IOCase.SENSITIVE,5247,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5250,org.apache.commons.io.IOCase.SENSITIVE,5249,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5252,org.apache.commons.io.IOCase.SENSITIVE,5251,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5254,org.apache.commons.io.IOCase.SENSITIVE,5253,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5256,org.apache.commons.io.IOCase.SENSITIVE,5255,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5258,org.apache.commons.io.IOCase.SENSITIVE,5257,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5260,org.apache.commons.io.IOCase.SENSITIVE,5259,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5262,org.apache.commons.io.IOCase.SENSITIVE,5261,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5264,org.apache.commons.io.IOCase.SENSITIVE,5263,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5266,org.apache.commons.io.IOCase.SENSITIVE,5265,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5268,org.apache.commons.io.IOCase.SENSITIVE,5267,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5270,org.apache.commons.io.IOCase.SENSITIVE,5269,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, ""));
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 1, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkRegionMatches_functionality_literalMutation6228() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkRegionMatches_functionality_literalMutation6228");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5236,org.apache.commons.io.IOCase.SENSITIVE,5235,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5238,org.apache.commons.io.IOCase.SENSITIVE,5237,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5240,org.apache.commons.io.IOCase.SENSITIVE,5239,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5242,org.apache.commons.io.IOCase.SENSITIVE,5241,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5244,org.apache.commons.io.IOCase.SENSITIVE,5243,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5246,org.apache.commons.io.IOCase.SENSITIVE,5245,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5248,org.apache.commons.io.IOCase.SENSITIVE,5247,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5250,org.apache.commons.io.IOCase.SENSITIVE,5249,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5252,org.apache.commons.io.IOCase.SENSITIVE,5251,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5254,org.apache.commons.io.IOCase.SENSITIVE,5253,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5256,org.apache.commons.io.IOCase.SENSITIVE,5255,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5258,org.apache.commons.io.IOCase.SENSITIVE,5257,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5260,org.apache.commons.io.IOCase.SENSITIVE,5259,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5262,org.apache.commons.io.IOCase.SENSITIVE,5261,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5264,org.apache.commons.io.IOCase.SENSITIVE,5263,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5266,org.apache.commons.io.IOCase.SENSITIVE,5265,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5268,org.apache.commons.io.IOCase.SENSITIVE,5267,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5270,org.apache.commons.io.IOCase.SENSITIVE,5269,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, ""));
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 1, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkRegionMatches_functionality_literalMutation6229() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkRegionMatches_functionality_literalMutation6229");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5236,org.apache.commons.io.IOCase.SENSITIVE,5235,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5238,org.apache.commons.io.IOCase.SENSITIVE,5237,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5240,org.apache.commons.io.IOCase.SENSITIVE,5239,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5242,org.apache.commons.io.IOCase.SENSITIVE,5241,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5244,org.apache.commons.io.IOCase.SENSITIVE,5243,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5246,org.apache.commons.io.IOCase.SENSITIVE,5245,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5248,org.apache.commons.io.IOCase.SENSITIVE,5247,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5250,org.apache.commons.io.IOCase.SENSITIVE,5249,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5252,org.apache.commons.io.IOCase.SENSITIVE,5251,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5254,org.apache.commons.io.IOCase.SENSITIVE,5253,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5256,org.apache.commons.io.IOCase.SENSITIVE,5255,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5258,org.apache.commons.io.IOCase.SENSITIVE,5257,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5260,org.apache.commons.io.IOCase.SENSITIVE,5259,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5262,org.apache.commons.io.IOCase.SENSITIVE,5261,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5264,org.apache.commons.io.IOCase.SENSITIVE,5263,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5266,org.apache.commons.io.IOCase.SENSITIVE,5265,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5268,org.apache.commons.io.IOCase.SENSITIVE,5267,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5270,org.apache.commons.io.IOCase.SENSITIVE,5269,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, ""));
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 1, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, "bar");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkRegionMatches_functionality_literalMutation6231() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkRegionMatches_functionality_literalMutation6231");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5236,org.apache.commons.io.IOCase.SENSITIVE,5235,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5238,org.apache.commons.io.IOCase.SENSITIVE,5237,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5240,org.apache.commons.io.IOCase.SENSITIVE,5239,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5242,org.apache.commons.io.IOCase.SENSITIVE,5241,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5244,org.apache.commons.io.IOCase.SENSITIVE,5243,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5246,org.apache.commons.io.IOCase.SENSITIVE,5245,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5248,org.apache.commons.io.IOCase.SENSITIVE,5247,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5250,org.apache.commons.io.IOCase.SENSITIVE,5249,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5252,org.apache.commons.io.IOCase.SENSITIVE,5251,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5254,org.apache.commons.io.IOCase.SENSITIVE,5253,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5256,org.apache.commons.io.IOCase.SENSITIVE,5255,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5258,org.apache.commons.io.IOCase.SENSITIVE,5257,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5260,org.apache.commons.io.IOCase.SENSITIVE,5259,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5262,org.apache.commons.io.IOCase.SENSITIVE,5261,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5264,org.apache.commons.io.IOCase.SENSITIVE,5263,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5266,org.apache.commons.io.IOCase.SENSITIVE,5265,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5268,org.apache.commons.io.IOCase.SENSITIVE,5267,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5270,org.apache.commons.io.IOCase.SENSITIVE,5269,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, ""));
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 1, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 2, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkRegionMatches_functionality_literalMutation6232() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkRegionMatches_functionality_literalMutation6232");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5236,org.apache.commons.io.IOCase.SENSITIVE,5235,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5238,org.apache.commons.io.IOCase.SENSITIVE,5237,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5240,org.apache.commons.io.IOCase.SENSITIVE,5239,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5242,org.apache.commons.io.IOCase.SENSITIVE,5241,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5244,org.apache.commons.io.IOCase.SENSITIVE,5243,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5246,org.apache.commons.io.IOCase.SENSITIVE,5245,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5248,org.apache.commons.io.IOCase.SENSITIVE,5247,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5250,org.apache.commons.io.IOCase.SENSITIVE,5249,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5252,org.apache.commons.io.IOCase.SENSITIVE,5251,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5254,org.apache.commons.io.IOCase.SENSITIVE,5253,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5256,org.apache.commons.io.IOCase.SENSITIVE,5255,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5258,org.apache.commons.io.IOCase.SENSITIVE,5257,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5260,org.apache.commons.io.IOCase.SENSITIVE,5259,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5262,org.apache.commons.io.IOCase.SENSITIVE,5261,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5264,org.apache.commons.io.IOCase.SENSITIVE,5263,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5266,org.apache.commons.io.IOCase.SENSITIVE,5265,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5268,org.apache.commons.io.IOCase.SENSITIVE,5267,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5270,org.apache.commons.io.IOCase.SENSITIVE,5269,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, ""));
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 1, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkRegionMatches_functionality_literalMutation6233() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkRegionMatches_functionality_literalMutation6233");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5236,org.apache.commons.io.IOCase.SENSITIVE,5235,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5238,org.apache.commons.io.IOCase.SENSITIVE,5237,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5240,org.apache.commons.io.IOCase.SENSITIVE,5239,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5242,org.apache.commons.io.IOCase.SENSITIVE,5241,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5244,org.apache.commons.io.IOCase.SENSITIVE,5243,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5246,org.apache.commons.io.IOCase.SENSITIVE,5245,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5248,org.apache.commons.io.IOCase.SENSITIVE,5247,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5250,org.apache.commons.io.IOCase.SENSITIVE,5249,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5252,org.apache.commons.io.IOCase.SENSITIVE,5251,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 0, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5254,org.apache.commons.io.IOCase.SENSITIVE,5253,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5256,org.apache.commons.io.IOCase.SENSITIVE,5255,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5258,org.apache.commons.io.IOCase.SENSITIVE,5257,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5260,org.apache.commons.io.IOCase.SENSITIVE,5259,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5262,org.apache.commons.io.IOCase.SENSITIVE,5261,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "BC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5264,org.apache.commons.io.IOCase.SENSITIVE,5263,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5266,org.apache.commons.io.IOCase.SENSITIVE,5265,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABCD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5268,org.apache.commons.io.IOCase.SENSITIVE,5267,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, "ABC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5270,org.apache.commons.io.IOCase.SENSITIVE,5269,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("", 1, ""));
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches("ABC", 1, null);
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 1, "ABC");
        } catch (NullPointerException ex) {
        }
        try {
            IOCase.SENSITIVE.checkRegionMatches(null, 0, null);
        } catch (NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void test_checkRegionMatches_case() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_checkRegionMatches_case");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5223,org.apache.commons.io.IOCase.SENSITIVE,5222,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5225,org.apache.commons.io.IOCase.SENSITIVE,5224,org.apache.commons.io.IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "Ab"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5227,org.apache.commons.io.IOCase.INSENSITIVE,5226,org.apache.commons.io.IOCase.INSENSITIVE.checkRegionMatches("ABC", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5229,org.apache.commons.io.IOCase.INSENSITIVE,5228,org.apache.commons.io.IOCase.INSENSITIVE.checkRegionMatches("ABC", 0, "Ab"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5231,org.apache.commons.io.IOCase.SYSTEM,5230,org.apache.commons.io.IOCase.SYSTEM.checkRegionMatches("ABC", 0, "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5232,org.apache.commons.io.IOCaseTestCase.WINDOWS);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5234,org.apache.commons.io.IOCase.SYSTEM,5233,org.apache.commons.io.IOCase.SYSTEM.checkRegionMatches("ABC", 0, "Ab"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private IOCase serialize(IOCase value) throws Exception {
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buf);
        out.writeObject(value);
        out.flush();
        out.close();
        ByteArrayInputStream bufin = new ByteArrayInputStream(buf.toByteArray());
        ObjectInputStream in = new ObjectInputStream(bufin);
        return ((IOCase)(in.readObject()));
    }
}

